from datetime import datetime

from airflow.decorators import dag, task

from airqo_etl_utils.workflows_custom_utils import AirflowUtils

from airqo_etl_utils.config import configuration


# Runs at 5, 6, 7 and 8 (Monday) to send
# good morning greetings to users
# in timezones +3, +2, +1, 0 from UTC going to work
@dag(
    "Monday-Notifications",
    schedule="10 5,6,7,8 * * 1",
    default_args=AirflowUtils.dag_default_configs(),
    catchup=False,
    tags=["app", "notifications", "monday", "morning"],
)
def monday_morning_notifications():
    @task()
    def extract_recipients():
        from airqo_etl_utils.app_notification_utils import get_notification_recipients

        return get_notification_recipients(hour=8)

    @task()
    def create_notifications(data):
        from airqo_etl_utils.app_notification_utils import (
            create_notification_messages,
            get_notification_templates,
            NOTIFICATION_TEMPLATE_MAPPER,
        )

        templates = get_notification_templates(
            NOTIFICATION_TEMPLATE_MAPPER["monday_morning"]
        )

        return create_notification_messages(templates=templates, recipients=data)

    @task()
    def send_notifications(messages):
        from airqo_etl_utils.app_notification_utils import send_notification_messages

        send_notification_messages(messages=messages)

    recipients = extract_recipients()
    notifications = create_notifications(recipients)
    send_notifications(notifications)


# Runs at 16, 17, 18 and 19 (Friday) to send
# good evening greetings to users
# in timezones +3, +2, +1, 0 from UTC going to work
@dag(
    "Friday-Notifications",
    schedule="10 16,17,18,19 * * 5",
    default_args=AirflowUtils.dag_default_configs(),
    catchup=False,
    tags=["app", "notifications", "friday", "evening"],
)
def friday_evening_notifications():
    @task()
    def extract_recipients():
        from airqo_etl_utils.app_notification_utils import get_notification_recipients

        return get_notification_recipients(hour=19)

    @task()
    def create_notifications(data):
        from airqo_etl_utils.app_notification_utils import (
            create_notification_messages,
            get_notification_templates,
            NOTIFICATION_TEMPLATE_MAPPER,
        )

        templates = get_notification_templates(
            NOTIFICATION_TEMPLATE_MAPPER["friday_evening"]
        )

        return create_notification_messages(templates=templates, recipients=data)

    @task()
    def send_notifications(messages):
        from airqo_etl_utils.app_notification_utils import send_notification_messages

        send_notification_messages(messages=messages)

    recipients = extract_recipients()
    notifications = create_notifications(recipients)
    send_notifications(notifications)


# Runs at 5, 6, 7 and 8 (Tuesday - Sunday) to send good morning
# greetings and forcast (those with fav places)
# to users
# in timezones +3, +2, +1, 0 from UTC going to work
@dag(
    "Morning-Notifications",
    schedule="10 5,6,7,8 * * 0,2,3,4,5,6",
    default_args=AirflowUtils.dag_default_configs(),
    catchup=False,
    tags=["app", "notifications", "morning"],
)
def morning_notifications():
    @task()
    def extract_recipients():
        from airqo_etl_utils.app_notification_utils import get_notification_recipients

        return get_notification_recipients(hour=8)

    @task()
    def create_notifications(data):
        from airqo_etl_utils.app_notification_utils import (
            create_notification_messages,
            get_notification_templates,
            NOTIFICATION_TEMPLATE_MAPPER,
        )

        if datetime.utcnow().weekday in [5, 6]:
            template = NOTIFICATION_TEMPLATE_MAPPER["weekend_morning"]
        else:
            template = NOTIFICATION_TEMPLATE_MAPPER["weekday_morning"]

        templates = get_notification_templates(template)

        return create_notification_messages(templates=templates, recipients=data)

    @task()
    def send_notifications(messages):
        from airqo_etl_utils.app_notification_utils import send_notification_messages

        send_notification_messages(messages=messages)

    recipients = extract_recipients()
    notifications = create_notifications(recipients)
    send_notifications(notifications)


# Runs at 16, 17, 18 and 19 (Saturday - Thursday) to send notifications to
# users in timezones +3, +2, +1, 0 from UTC informing them of
# the forecast of one favourite place
@dag(
    "Evening-Notifications",
    schedule="10 16,17,18,19 * * 0,1,2,3,4,6",
    default_args=AirflowUtils.dag_default_configs(),
    catchup=False,
    tags=["app", "notifications", "evening"],
)
def evening_notifications():
    @task()
    def extract_recipients():
        from airqo_etl_utils.app_notification_utils import get_notification_recipients

        return get_notification_recipients(hour=19)

    @task()
    def create_notifications(data):
        from airqo_etl_utils.app_notification_utils import (
            create_notification_messages,
            get_notification_templates,
            NOTIFICATION_TEMPLATE_MAPPER,
        )

        if datetime.utcnow().weekday in [5, 6]:
            name = NOTIFICATION_TEMPLATE_MAPPER["weekend_evening"]
        else:
            name = NOTIFICATION_TEMPLATE_MAPPER["weekday_evening"]

        templates = get_notification_templates(name)

        return create_notification_messages(templates=templates, recipients=data)

    @task()
    def send_notifications(messages):
        from airqo_etl_utils.app_notification_utils import send_notification_messages

        send_notification_messages(messages=messages)

    recipients = extract_recipients()
    notifications = create_notifications(recipients)
    send_notifications(notifications)


@dag(
    "Push-Notifications",
    schedule="0 5 * * *",
    default_args=AirflowUtils.dag_default_configs(),
    catchup=False,
    tags=["app", "notifications", "push"],
)
def send_push_notification():
    @task()
    def extract_users():
        from airqo_etl_utils.app_notification_utils import get_all_users

        users = get_all_users()
        return users

    @task()
    def group_users(users):
        from airqo_etl_utils.app_notification_utils import group_users

        grouped_users = group_users(users)

        return grouped_users

    @task()
    def send_push_notifications(grouped_users):
        from airqo_etl_utils.app_notification_utils import send_push_notifications

        send_push_notifications(grouped_users)

    if "staging" in configuration.AIRQO_BASE_URL_V2:
        return
    users = extract_users()
    grouped = group_users(users)
    send_push_notifications(grouped)


# monday_morning_notifications_dag = monday_morning_notifications()
# friday_evening_notifications_dag = friday_evening_notifications()
# morning_notifications_dag = morning_notifications()
# evening_notifications_dag = evening_notifications()

send_push_notification()

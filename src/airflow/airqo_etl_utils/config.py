import os

import urllib3

urllib3.disable_warnings(urllib3.exceptions.InsecureRequestWarning)


class Config:
    CLARITY_API_KEY = os.getenv("CLARITY_API_KEY")
    CLARITY_API_BASE_URL = os.getenv("CLARITY_API_BASE_URL")

    THINGSPEAK_API_KEY = os.getenv("THINGSPEAK_API_KEY")
    THINGSPEAK_CHANNEL_URL = os.getenv("THINGSPEAK_CHANNEL_URL")

    BIGQUERY_HOURLY_EVENTS_TABLE = os.getenv("BIGQUERY_HOURLY_EVENTS_TABLE")
    BIGQUERY_HOURLY_WEATHER_TABLE = os.getenv("BIGQUERY_HOURLY_WEATHER_TABLE")
    BIGQUERY_ANALYTICS_TABLE = os.getenv("BIGQUERY_ANALYTICS_TABLE")
    BIGQUERY_RAW_EVENTS_TABLE = os.getenv("BIGQUERY_RAW_EVENTS_TABLE")

    POST_EVENTS_BODY_SIZE = os.getenv("POST_EVENTS_BODY_SIZE", 10)
    POST_WEATHER_BODY_SIZE = os.getenv("POST_EVENTS_BODY_SIZE", 10)
    CALIBRATE_REQUEST_BODY_SIZE = os.getenv("CALIBRATE_REQUEST_BODY_SIZE", 10)

    TAHMO_BASE_URL = os.getenv("TAHMO_API_BASE_URL")
    TAHMO_API_MAX_PERIOD = os.getenv("TAHMO_API_MAX_PERIOD")
    TAHMO_API_KEY = os.getenv("TAHMO_API_CREDENTIALS_USERNAME")
    TAHMO_API_SECRET = os.getenv("TAHMO_API_CREDENTIALS_PASSWORD")

    BOOTSTRAP_SERVERS = os.getenv("BOOTSTRAP_SERVERS", "localhost:9092").split(",")
    TOPIC_PARTITIONS = os.getenv("TOPIC_PARTITIONS", "1,2,3,4").split(",")
    SCHEMA_REGISTRY_URL = os.getenv("SCHEMA_REGISTRY_URL")

    WEATHER_MEASUREMENTS_TOPIC = os.getenv("WEATHER_MEASUREMENTS_TOPIC")
    INSIGHTS_MEASUREMENTS_TOPIC = os.getenv("INSIGHTS_MEASUREMENTS_TOPIC")
    HOURLY_MEASUREMENTS_TOPIC = os.getenv("HOURLY_MEASUREMENTS_TOPIC")

    AIRQO_BASE_URL = os.getenv("AIRQO_BASE_URL")
    CALIBRATION_BASE_URL = os.getenv("CALIBRATION_BASE_URL")
    AIRQO_BASE_URL_V2 = os.getenv("AIRQO_BASE_URL_V2")
    AIRQO_API_KEY = os.getenv("AIRQO_API_KEY")


configuration = Config()

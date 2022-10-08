resource "google_pubsub_subscription" "gcf_get_hourly_weather_forecasts_from_met_office_get_hourly_weather_forecasts" {
  ack_deadline_seconds       = 600
  message_retention_duration = "604800s"
  name                       = "gcf-get_hourly_weather_forecasts_from_met_office-get_hourly_weather_forecasts"
  project                    = var.project-id

  push_config {
    push_endpoint = "https://e2a7ac142353841aa82d89363fdbed72-dot-o46fbf1c487424862-tp.appspot.com/_ah/push-handlers/pubsub/projects/${var.project-id}/topics/get_hourly_weather_forecasts?pubsub_trigger=true"
  }

  topic = "projects/${var.project-id}/topics/get_hourly_weather_forecasts"
}
# terraform import google_pubsub_subscription.gcf_get_hourly_weather_forecasts_from_met_office_get_hourly_weather_forecasts projects/${var.project-id}/subscriptions/gcf-get_hourly_weather_forecasts_from_met_office-get_hourly_weather_forecasts

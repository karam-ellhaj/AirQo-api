resource "google_pubsub_topic" "us_central1_test_environmen_38573854_composer_backend_to_agent_pubsub_rollback_topic_38573854_8b80_4886_bbee_5c96bb6d5b2e" {
  labels = {
    goog-dm = "us-central1-test-environmen-38573854-sd"
  }

  name    = "us-central1-test-environmen-38573854-composer-backend-to-agent-pubsub-rollback-topic-38573854-8b80-4886-bbee-5c96bb6d5b2e"
  project = var.project-id
}
# terraform import google_pubsub_topic.us_central1_test_environmen_38573854_composer_backend_to_agent_pubsub_rollback_topic_38573854_8b80_4886_bbee_5c96bb6d5b2e projects/${var.project-id}/topics/us-central1-test-environmen-38573854-composer-backend-to-agent-pubsub-rollback-topic-38573854-8b80-4886-bbee-5c96bb6d5b2e

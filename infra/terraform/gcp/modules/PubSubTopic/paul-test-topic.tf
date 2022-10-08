resource "google_pubsub_topic" "paul_test_topic" {
  name    = "paul_test_topic"
  project = "${var.project-id}"
}
# terraform import google_pubsub_topic.paul_test_topic projects/airqo-250220/topics/paul_test_topic

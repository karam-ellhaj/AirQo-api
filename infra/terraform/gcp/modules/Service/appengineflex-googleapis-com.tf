resource "google_project_service" "appengineflex_googleapis_com" {
  project = "${var.project-number}"
  service = "appengineflex.googleapis.com"
}
# terraform import google_project_service.appengineflex_googleapis_com ${var.project-number}/appengineflex.googleapis.com

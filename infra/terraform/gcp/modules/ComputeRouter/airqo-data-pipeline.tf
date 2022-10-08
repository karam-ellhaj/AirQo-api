resource "google_compute_router" "airqo_data_pipeline" {
  name    = "airqo-data-pipeline"
  network = "https://www.googleapis.com/compute/v1/projects/airqo-250220/global/networks/pipeline-k8s-cluster"
  project = "${var.project-id}"
  region  = "us-central1"
}
# terraform import google_compute_router.airqo_data_pipeline projects/airqo-250220/regions/us-central1/routers/airqo-data-pipeline

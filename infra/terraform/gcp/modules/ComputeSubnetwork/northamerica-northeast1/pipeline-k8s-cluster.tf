resource "google_compute_subnetwork" "pipeline_k8s_cluster" {
  ip_cidr_range = "10.162.0.0/20"
  name          = "pipeline-k8s-cluster"
  network       = "https://www.googleapis.com/compute/v1/projects/${var.project-id}/global/networks/pipeline-k8s-cluster"
  project       = var.project-id
  purpose       = "PRIVATE"
  region        = "northamerica-northeast1"
  stack_type    = "IPV4_ONLY"
}
# terraform import google_compute_subnetwork.pipeline_k8s_cluster projects/${var.project-id}/regions/northamerica-northeast1/subnetworks/pipeline-k8s-cluster

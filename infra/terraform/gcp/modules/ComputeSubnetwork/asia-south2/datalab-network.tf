resource "google_compute_subnetwork" "datalab_network" {
  ip_cidr_range = "10.190.0.0/20"
  name          = "datalab-network"
  network       = "https://www.googleapis.com/compute/v1/projects/${var.project-id}/global/networks/datalab-network"
  project       = var.project-id
  purpose       = "PRIVATE"
  region        = "asia-south2"
  stack_type    = "IPV4_ONLY"
}
# terraform import google_compute_subnetwork.datalab_network projects/${var.project-id}/regions/asia-south2/subnetworks/datalab-network

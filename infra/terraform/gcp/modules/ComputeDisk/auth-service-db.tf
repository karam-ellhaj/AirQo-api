resource "google_compute_disk" "auth_service_db" {
  image                     = "https://www.googleapis.com/compute/beta/projects/ubuntu-os-cloud/global/images/ubuntu-1804-bionic-v20210504"
  name                      = "auth-service-db"
  physical_block_size_bytes = 4096
  project                   = "${var.project-id}"
  size                      = 100
  type                      = "pd-balanced"
  zone                      = "europe-west1-b"
}
# terraform import google_compute_disk.auth_service_db projects/airqo-250220/zones/europe-west1-b/disks/auth-service-db

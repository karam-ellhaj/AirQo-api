resource "google_compute_disk" "cfgsvr_dev_1" {
  image                     = "https://www.googleapis.com/compute/beta/projects/ubuntu-os-cloud/global/images/ubuntu-1804-bionic-v20220616"
  name                      = "cfgsvr-dev-1"
  physical_block_size_bytes = 4096
  project                   = "${var.project-id}"
  size                      = 50
  type                      = "pd-balanced"
  zone                      = "europe-west1-b"
}
# terraform import google_compute_disk.cfgsvr_dev_1 projects/airqo-250220/zones/europe-west1-b/disks/cfgsvr-dev-1

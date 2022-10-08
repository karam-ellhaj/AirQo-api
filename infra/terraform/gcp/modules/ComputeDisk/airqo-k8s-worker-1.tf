resource "google_compute_disk" "airqo_k8s_worker_1" {
  image                     = "https://www.googleapis.com/compute/beta/projects/ubuntu-os-cloud/global/images/ubuntu-1804-bionic-v20200916"
  name                      = "airqo-k8s-worker-1"
  physical_block_size_bytes = 4096
  project                   = "${var.project-id}"
  size                      = 200
  type                      = "pd-standard"
  zone                      = "europe-west1-b"
}
# terraform import google_compute_disk.airqo_k8s_worker_1 projects/airqo-250220/zones/europe-west1-b/disks/airqo-k8s-worker-1

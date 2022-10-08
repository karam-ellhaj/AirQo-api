resource "google_compute_disk" "shard_stage_3" {
  image                     = "ubuntu-1804-bionic-v20220616"
  name                      = "shard-stage-3"
  physical_block_size_bytes = 4096
  project                   = var.project-id
  size      = var.disk_size["medium"]
  type                      = "pd-balanced"
  zone                      = var.zone
}
# terraform import google_compute_disk.shard_stage_3 projects/${var.project-id}/zones/europe-west1-b/disks/shard-stage-3

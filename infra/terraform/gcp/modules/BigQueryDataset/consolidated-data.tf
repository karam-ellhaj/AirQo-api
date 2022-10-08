resource "google_bigquery_dataset" "consolidated_data" {
  access {
    role          = "OWNER"
    special_group = "projectOwners"
  }

  access {
    role          = "READER"
    special_group = "projectReaders"
  }

  access {
    role          = "WRITER"
    special_group = "projectWriters"
  }

  dataset_id                 = "consolidated_data"
  delete_contents_on_destroy = false
  location                   = "${var.location}"
  project                    = var.project-id
}
# terraform import google_bigquery_dataset.consolidated_data projects/${var.project-id}/datasets/consolidated_data

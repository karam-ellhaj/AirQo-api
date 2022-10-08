resource "google_bigquery_dataset" "metadata" {
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

  dataset_id                 = "metadata"
  delete_contents_on_destroy = false
  location                   = "EU"
  project                    = "${var.project-id}"
}
# terraform import google_bigquery_dataset.metadata projects/airqo-250220/datasets/metadata

resource "google_bigquery_dataset" "dev_dataset" {
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

  dataset_id                 = "dev_dataset"
  delete_contents_on_destroy = false
  location                   = "EU"
  project                    = "${var.project-id}"
}
# terraform import google_bigquery_dataset.dev_dataset projects/airqo-250220/datasets/dev_dataset

resource "google_service_account" "get_data" {
  account_id   = "get-data"
  display_name = "get_data"
  project      = "${var.project-id}"
}
# terraform import google_service_account.get_data projects/airqo-250220/serviceAccounts/get-data@airqo-250220.iam.gserviceaccount.com

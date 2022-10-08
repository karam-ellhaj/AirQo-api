resource "google_secret_manager_secret" "sta_env_data_mgt_python" {
  project = "702081712633"

  replication {
    automatic = true
  }

  secret_id = "sta-env-data-mgt-python"
}
# terraform import google_secret_manager_secret.sta_env_data_mgt_python projects/702081712633/secrets/sta-env-data-mgt-python

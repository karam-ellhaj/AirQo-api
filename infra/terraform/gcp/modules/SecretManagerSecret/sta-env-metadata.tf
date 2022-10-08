resource "google_secret_manager_secret" "sta_env_metadata" {
  project = "702081712633"

  replication {
    automatic = true
  }

  secret_id = "sta-env-metadata"
}
# terraform import google_secret_manager_secret.sta_env_metadata projects/702081712633/secrets/sta-env-metadata

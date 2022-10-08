resource "google_bigquery_table" "airqo_mobile_device_measurements" {
  clustering = ["device_number", "timestamp"]
  dataset_id = "averaged_data"
  project    = "${var.project-id}"
  schema     = "[{\"mode\":\"NULLABLE\",\"name\":\"tenant\",\"type\":\"STRING\"},{\"mode\":\"NULLABLE\",\"name\":\"timestamp\",\"type\":\"TIMESTAMP\"},{\"mode\":\"NULLABLE\",\"name\":\"device_number\",\"type\":\"INTEGER\"},{\"mode\":\"NULLABLE\",\"name\":\"device_id\",\"type\":\"STRING\"},{\"mode\":\"NULLABLE\",\"name\":\"latitude\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"longitude\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\",\"mode\":\"NULLABLE\",\"name\":\"s1_pm2_5\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\",\"mode\":\"NULLABLE\",\"name\":\"s2_pm2_5\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\",\"mode\":\"NULLABLE\",\"name\":\"s1_pm10\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\",\"mode\":\"NULLABLE\",\"name\":\"s2_pm10\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"altitude\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"battery\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"satellites\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"hdop\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"device_temperature\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"device_humidity\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\",\"mode\":\"NULLABLE\",\"name\":\"pm2_5_calibrated_value\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\",\"mode\":\"NULLABLE\",\"name\":\"pm10_calibrated_value\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\",\"mode\":\"NULLABLE\",\"name\":\"pm2_5_raw_value\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\",\"mode\":\"NULLABLE\",\"name\":\"pm10_raw_value\",\"type\":\"FLOAT\"},{\"description\":\"°C.\",\"mode\":\"NULLABLE\",\"name\":\"temperature\",\"type\":\"FLOAT\"},{\"description\":\"%.\",\"mode\":\"NULLABLE\",\"name\":\"humidity\",\"type\":\"FLOAT\"},{\"description\":\"m/s.\",\"mode\":\"NULLABLE\",\"name\":\"wind_speed\",\"type\":\"FLOAT\"},{\"description\":\"kPa.\",\"mode\":\"NULLABLE\",\"name\":\"atmospheric_pressure\",\"type\":\"FLOAT\"},{\"description\":\"W/m2.\",\"mode\":\"NULLABLE\",\"name\":\"radiation\",\"type\":\"FLOAT\"},{\"description\":\"m/s.\",\"mode\":\"NULLABLE\",\"name\":\"wind_gusts\",\"type\":\"FLOAT\"},{\"description\":\"mm.\",\"mode\":\"NULLABLE\",\"name\":\"precipitation\",\"type\":\"FLOAT\"},{\"description\":\"degrees\",\"mode\":\"NULLABLE\",\"name\":\"wind_direction\",\"type\":\"FLOAT\"}]"
  table_id   = "airqo_mobile_device_measurements"

  time_partitioning {
    field                    = "timestamp"
    require_partition_filter = true
    type                     = "DAY"
  }
}
# terraform import google_bigquery_table.airqo_mobile_device_measurements projects/airqo-250220/datasets/averaged_data/tables/airqo_mobile_device_measurements

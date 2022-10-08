resource "google_bigquery_table" "data_prod" {
  clustering = ["tenant", "site_id", "device_name", "timestamp"]
  dataset_id = "datawarehouse"
  project    = "${var.project-id}"
  schema     = "[{\"mode\":\"REQUIRED\",\"name\":\"tenant\",\"type\":\"STRING\"},{\"mode\":\"REQUIRED\",\"name\":\"timestamp\",\"type\":\"TIMESTAMP\"},{\"mode\":\"REQUIRED\",\"name\":\"site_id\",\"type\":\"STRING\"},{\"mode\":\"NULLABLE\",\"name\":\"site_name\",\"type\":\"STRING\"},{\"mode\":\"NULLABLE\",\"name\":\"site_description\",\"type\":\"STRING\"},{\"mode\":\"REQUIRED\",\"name\":\"site_latitude\",\"type\":\"FLOAT\"},{\"mode\":\"REQUIRED\",\"name\":\"site_longitude\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"site_altitude\",\"type\":\"FLOAT\"},{\"mode\":\"REQUIRED\",\"name\":\"device_number\",\"type\":\"INTEGER\"},{\"mode\":\"NULLABLE\",\"name\":\"device_name\",\"type\":\"STRING\"},{\"mode\":\"REQUIRED\",\"name\":\"device_latitude\",\"type\":\"FLOAT\"},{\"mode\":\"REQUIRED\",\"name\":\"device_longitude\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\\nEquals the calibrated pm 2.5 value if available else equals the raw value.\",\"mode\":\"NULLABLE\",\"name\":\"pm2_5\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\\npm 2.5 of sensor one\",\"mode\":\"NULLABLE\",\"name\":\"s1_pm2_5\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\\npm 2.5 of sensor two\",\"mode\":\"NULLABLE\",\"name\":\"s2_pm2_5\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\\nEquals the pm 2.5 average value of sensor one and sensor two\",\"mode\":\"NULLABLE\",\"name\":\"pm2_5_raw_value\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\\nEquals the calibrated pm 2.5 value.\",\"mode\":\"NULLABLE\",\"name\":\"pm2_5_calibrated_value\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\\nEquals the calibrated pm 10 value if available else equals the raw value.\",\"mode\":\"NULLABLE\",\"name\":\"pm10\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\\npm 10 of sensor one\",\"mode\":\"NULLABLE\",\"name\":\"s1_pm10\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\\npm 10 of sensor two\",\"mode\":\"NULLABLE\",\"name\":\"s2_pm10\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\\nEquals the pm 10 average value of sensor one and sensor two\",\"mode\":\"NULLABLE\",\"name\":\"pm10_raw_value\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\\nEquals the calibrated pm 10 value. \",\"mode\":\"NULLABLE\",\"name\":\"pm10_calibrated_value\",\"type\":\"FLOAT\"},{\"description\":\"ppb.\\nNO2 Concentration\",\"mode\":\"NULLABLE\",\"name\":\"no2\",\"type\":\"FLOAT\"},{\"description\":\"ppb.\\nNO2 Concentration raw value\",\"mode\":\"NULLABLE\",\"name\":\"no2_raw_value\",\"type\":\"FLOAT\"},{\"description\":\"ppb.\\nEquals the NO2 Concentration value if available else equals the raw value.\",\"mode\":\"NULLABLE\",\"name\":\"no2_calibrated_value\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\\nEquals the calibrated pm 1 value if available else equals the raw value.\",\"mode\":\"NULLABLE\",\"name\":\"pm1\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\\npm 1 raw value. \",\"mode\":\"NULLABLE\",\"name\":\"pm1_raw_value\",\"type\":\"FLOAT\"},{\"description\":\" μg/m3.\\npm 1 calibrated value. \",\"mode\":\"NULLABLE\",\"name\":\"pm1_calibrated_value\",\"type\":\"FLOAT\"},{\"description\":\"°C.\\nExternal temperature\",\"mode\":\"NULLABLE\",\"name\":\"temperature\",\"type\":\"FLOAT\"},{\"description\":\"%.\\nRelative humidity\",\"mode\":\"NULLABLE\",\"name\":\"humidity\",\"type\":\"FLOAT\"},{\"description\":\"m/s.\",\"mode\":\"NULLABLE\",\"name\":\"wind_speed\",\"type\":\"FLOAT\"},{\"description\":\"kPa.\",\"mode\":\"NULLABLE\",\"name\":\"atmospheric_pressure\",\"type\":\"FLOAT\"},{\"description\":\"W/m2.\",\"mode\":\"NULLABLE\",\"name\":\"radiation\",\"type\":\"FLOAT\"},{\"description\":\"kPa.\",\"mode\":\"NULLABLE\",\"name\":\"vapor_pressure\",\"type\":\"FLOAT\"},{\"description\":\"m/s.\",\"mode\":\"NULLABLE\",\"name\":\"wind_gusts\",\"type\":\"FLOAT\"},{\"description\":\"mm.\",\"mode\":\"NULLABLE\",\"name\":\"precipitation\",\"type\":\"FLOAT\"},{\"description\":\"degrees\",\"mode\":\"NULLABLE\",\"name\":\"wind_direction\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"site_bearing_to_kampala_center\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"site_distance_to_kampala_center\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"site_landform_90\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"site_landform_270\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"site_aspect\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"site_distance_to_nearest_tertiary_road\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"site_distance_to_nearest_primary_road\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"site_distance_to_nearest_road\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"site_distance_to_nearest_residential_road\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"site_distance_to_nearest_secondary_road\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"site_distance_to_nearest_unclassified_road\",\"type\":\"FLOAT\"},{\"mode\":\"NULLABLE\",\"name\":\"country\",\"type\":\"STRING\"},{\"mode\":\"NULLABLE\",\"name\":\"region\",\"type\":\"STRING\"},{\"mode\":\"NULLABLE\",\"name\":\"district\",\"type\":\"STRING\"},{\"mode\":\"NULLABLE\",\"name\":\"city\",\"type\":\"STRING\"},{\"mode\":\"NULLABLE\",\"name\":\"county\",\"type\":\"STRING\"},{\"mode\":\"NULLABLE\",\"name\":\"sub_county\",\"type\":\"STRING\"},{\"mode\":\"NULLABLE\",\"name\":\"parish\",\"type\":\"STRING\"}]"
  table_id   = "data_prod"

  time_partitioning {
    field                    = "timestamp"
    require_partition_filter = true
    type                     = "MONTH"
  }
}
# terraform import google_bigquery_table.data_prod projects/airqo-250220/datasets/datawarehouse/tables/data_prod

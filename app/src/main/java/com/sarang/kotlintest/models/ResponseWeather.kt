//package com.sarang.kotlintest.models
//
//import com.google.gson.annotations.SerializedName
//
//data class ResponseWeatherw(
//
//	@field:SerializedName("country_code")
//	val countryCode: String? = null,
//
//	@field:SerializedName("city_name")
//	val cityName: String? = null,
//
//	@field:SerializedName("data")
//	val data: List<DataItem?>? = null,
//
//	@field:SerializedName("timezone")
//	val timezone: String? = null,
//
//	@field:SerializedName("lon")
//	val lon: Double? = null,
//
//	@field:SerializedName("state_code")
//	val stateCode: String? = null,
//
//	@field:SerializedName("lat")
//	val lat: Double? = null
//)
//
//data class DataItem(
//
//	@field:SerializedName("pod")
//	val pod: String? = null,
//
//	@field:SerializedName("pres")
//	val pres: Double? = null,
//
//	@field:SerializedName("wind_cdir")
//	val windCdir: String? = null,
//
//	@field:SerializedName("clouds")
//	val clouds: Int? = null,
//
//	@field:SerializedName("wind_spd")
//	val windSpd: Double? = null,
//
//	@field:SerializedName("ozone")
//	val ozone: Int? = null,
//
//	@field:SerializedName("pop")
//	val pop: Int? = null,
//
//	@field:SerializedName("datetime")
//	val datetime: String? = null,
//
//	@field:SerializedName("timestamp_local")
//	val timestampLocal: String? = null,
//
//	@field:SerializedName("precip")
//	val precip: Int? = null,
//
//	@field:SerializedName("timestamp_utc")
//	val timestampUtc: String? = null,
//
//	@field:SerializedName("weather")
//	val weather: Weather? = null,
//
//	@field:SerializedName("snow_depth")
//	val snowDepth: Int? = null,
//
//	@field:SerializedName("dni")
//	val dni: Int? = null,
//
//	@field:SerializedName("clouds_mid")
//	val cloudsMid: Int? = null,
//
//	@field:SerializedName("uv")
//	val uv: Int? = null,
//
//	@field:SerializedName("vis")
//	val vis: Double? = null,
//
//	@field:SerializedName("temp")
//	val temp: Int? = null,
//
//	@field:SerializedName("dhi")
//	val dhi: Int? = null,
//
//	@field:SerializedName("clouds_hi")
//	val cloudsHi: Int? = null,
//
//	@field:SerializedName("app_temp")
//	val appTemp: Double? = null,
//
//	@field:SerializedName("ghi")
//	val ghi: Int? = null,
//
//	@field:SerializedName("dewpt")
//	val dewpt: Double? = null,
//
//	@field:SerializedName("wind_dir")
//	val windDir: Int? = null,
//
//	@field:SerializedName("solar_rad")
//	val solarRad: Int? = null,
//
//	@field:SerializedName("wind_gust_spd")
//	val windGustSpd: Double? = null,
//
//	@field:SerializedName("clouds_low")
//	val cloudsLow: Int? = null,
//
//	@field:SerializedName("rh")
//	val rh: Int? = null,
//
//	@field:SerializedName("slp")
//	val slp: Int? = null,
//
//	@field:SerializedName("snow")
//	val snow: Int? = null,
//
//	@field:SerializedName("wind_cdir_full")
//	val windCdirFull: String? = null,
//
//	@field:SerializedName("ts")
//	val ts: Int? = null
//)
//
//data class Weather(
//
//	@field:SerializedName("code")
//	val code: Int? = null,
//
//	@field:SerializedName("icon")
//	val icon: String? = null,
//
//	@field:SerializedName("description")
//	val description: String? = null
//)

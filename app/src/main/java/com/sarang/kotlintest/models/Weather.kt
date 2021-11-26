package com.sarang.kotlintest.models

import com.google.gson.annotations.SerializedName

data class Weather(

	@field:SerializedName("country_code")
	val countryCode: String? = null,

	@field:SerializedName("city_name")
	val cityName: String? = null,

	@field:SerializedName("data")
	val data: List<DataItem?>? = null,

	@field:SerializedName("timezone")
	val timezone: String? = null,

	@field:SerializedName("lon")
	val lon: Double? = null,

	@field:SerializedName("state_code")
	val stateCode: String? = null,

	@field:SerializedName("lat")
	val lat: Double? = null,

	@field:SerializedName("code")
	val code: Double? = null,

	@field:SerializedName("icon")
	val icon: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("ic D/OkHttp: on")
	val icDOkHttpOn: String? = null
)

data class DataItem(

	@field:SerializedName("pod")
	val pod: String? = null,

	@field:SerializedName("pres")
	val pres: Double? = null,

	@field:SerializedName("wind_cdir")
	val windCdir: String? = null,

	@field:SerializedName("clouds")
	val clouds: Double? = null,

	@field:SerializedName("wind_spd")
	val windSpd: Double? = null,

	@field:SerializedName("ozone")
	val ozone: Double? = null,

	@field:SerializedName("pop")
	val pop: Double? = null,

	@field:SerializedName("datetime")
	val datetime: String? = null,

	@field:SerializedName("timestamp_local")
	val timestampLocal: String? = null,

	@field:SerializedName("precip")
	val precip: Double? = null,

	@field:SerializedName("timestamp_utc")
	val timestampUtc: String? = null,

	@field:SerializedName("weather")
	val weather: Weather? = null,

	@field:SerializedName("snow_depth")
	val snowDepth: Double? = null,

	@field:SerializedName("dni")
	val dni: Double? = null,

	@field:SerializedName("clouds_mid")
	val cloudsMid: Double? = null,

	@field:SerializedName("uv")
	val uv: Double? = null,

	@field:SerializedName("vis")
	val vis: Double? = null,

	@field:SerializedName("temp")
	val temp: Double? = null,

	@field:SerializedName("dhi")
	val dhi: Double? = null,

	@field:SerializedName("clouds_hi")
	val cloudsHi: Double? = null,

	@field:SerializedName("app_temp")
	val appTemp: Double? = null,

	@field:SerializedName("ghi")
	val ghi: Double? = null,

	@field:SerializedName("dewpt")
	val dewpt: Double? = null,

	@field:SerializedName("wind_dir")
	val windDir: Double? = null,

	@field:SerializedName("solar_rad")
	val solarRad: Double? = null,

	@field:SerializedName("wind_gust_spd")
	val windGustSpd: Double? = null,

	@field:SerializedName("clouds_low")
	val cloudsLow: Double? = null,

	@field:SerializedName("rh")
	val rh: Double? = null,

	@field:SerializedName("slp")
	val slp: Double? = null,

	@field:SerializedName("snow")
	val snow: Double? = null,

	@field:SerializedName("wind_cdir_full")
	val windCdirFull: String? = null,

	@field:SerializedName("ts")
	val ts: Double? = null,

	@field:SerializedName("timestamp_loca D/OkHttp: l")
	val timestampLocaDOkHttpL: String? = null,

	@field:SerializedName("timestamp_u D/OkHttp: tc")
	val timestampUDOkHttpTc: String? = null,

	@field:SerializedName("dhi D/OkHttp: ")
	val dhiDOkHttp: Double? = null,

	@field:SerializedName("wind D/OkHttp: _cdir_full")
	val windDOkHttpCdirFull: String? = null
)

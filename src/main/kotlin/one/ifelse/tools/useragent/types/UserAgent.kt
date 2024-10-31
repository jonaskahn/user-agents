package one.ifelse.tools.useragent.types


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserAgent(
    @Json(name = "appName")
    val appName: String,
    @Json(name = "connection")
    val connection: Connection? = null,
    @Json(name = "deviceCategory")
    val deviceCategory: String,
    @Json(name = "language")
    val language: String,
    @Json(name = "platform")
    val platform: String,
    @Json(name = "pluginsLength")
    val pluginsLength: Int,
    @Json(name = "screenHeight")
    val screenHeight: Int,
    @Json(name = "screenWidth")
    val screenWidth: Int,
    @Json(name = "userAgent")
    val userAgent: String,
    @Json(name = "vendor")
    val vendor: String,
    @Json(name = "viewportHeight")
    val viewportHeight: Int,
    @Json(name = "viewportWidth")
    val viewportWidth: Int,
    @Json(name = "weight")
    val weight: Double
)
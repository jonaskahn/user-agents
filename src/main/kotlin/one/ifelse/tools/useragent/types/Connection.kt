package one.ifelse.tools.useragent.types


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class Connection(
    @Json(name = "downlink")
    val downlink: Float?=0.0f,
    @Json(name = "downlinkMax")
    val downlinkMax: Float?=0.0f,
    @Json(name = "effectiveType")
    val effectiveType: String?=null,
    @Json(name = "rtt")
    val rtt: Int?=0,
    @Json(name = "type")
    val type: String?=null
)
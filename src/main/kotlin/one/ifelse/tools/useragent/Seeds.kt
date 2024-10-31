package one.ifelse.tools.useragent

import com.squareup.moshi.JsonAdapter
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import one.ifelse.tools.useragent.types.UserAgent
import java.io.IOException
import java.nio.charset.StandardCharsets

internal object Seeds {

    val USER_AGENTS = getUserAgents()

    private fun getUserAgents(): Collection<UserAgent> {
        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).build()
        val userListType = Types.newParameterizedType(MutableList::class.java, UserAgent::class.java)
        val jsonAdapter: JsonAdapter<MutableList<UserAgent>> = moshi.adapter(userListType)
        return jsonAdapter.fromJson(readResourceFile("user-agents.json")).orEmpty()
    }

    @Throws(IOException::class, IllegalArgumentException::class)
    private fun readResourceFile(fileName: String): String {
        val classLoader: ClassLoader = this::class.java.classLoader
        val inputStream = classLoader.getResourceAsStream(fileName)
        requireNotNull(inputStream) { "File not found: $fileName" }
        return String(inputStream.readBytes(), StandardCharsets.UTF_8)
    }
}
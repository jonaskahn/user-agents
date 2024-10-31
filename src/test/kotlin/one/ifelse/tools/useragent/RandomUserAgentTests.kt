package one.ifelse.tools.useragent

import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertEquals
import kotlin.test.assertFails
import kotlin.test.assertNotNull
import kotlin.test.assertTrue

class RandomUserAgentTests {
    @Test
    fun testRandomUserAgent() {
        val result = RandomUserAgent.random()
        assertNotNull(result, "RandomUserAgent was not null.")
    }

    @Test
    fun testRandomUserAgentDeviceWin32() {
        val result = RandomUserAgent.random({ Objects.equals(it.platform, "Win32") })
        assertTrue { result.contains("Win64") || result.contains("Win32") }
    }

    @Test
    fun testRandomUserAgentDeviceNotExists() {
        try {
            val result = RandomUserAgent.random({ Objects.equals(it.platform, "Win64") })
            assertFails(message = "should never execute this block") {}
        } catch (e: NoSuchElementException) {
            assertEquals("Collection is empty.", e.message)
        }

    }
}

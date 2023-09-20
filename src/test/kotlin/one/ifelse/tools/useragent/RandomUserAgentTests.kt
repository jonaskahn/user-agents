package one.ifelse.tools.useragent

import one.ifelse.tools.useragent.types.BrowserType
import one.ifelse.tools.useragent.types.DeviceType
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class RandomUserAgentTests {

    @Test
    fun testGenerateRandomUserAgentShouldSuccess(): Unit {
        val userAgent = RandomUserAgent.random()
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
    }

    @Test
    fun testGenerateRandomDesktopUserAgentShouldSuccess(): Unit {
        val userAgent = RandomUserAgent.desktop()
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("Windows") || userAgent.contains("X11") || userAgent.contains("Macintosh"))
    }

    @Test
    fun testGenerateRandomMobileUserAgentShouldSuccess() {
        val userAgent = RandomUserAgent.mobile()
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("Android") || userAgent.contains("CPU iPhone OS") || userAgent.contains("CPU OS"))
    }

    @Test
    fun testGenerateDesktopUserAgentForWindowsAndChromeShouldSuccess() {
        val userAgent = RandomUserAgent.desktop(DeviceType.WINDOWS, BrowserType.CHROME)
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("Windows"))
        assertTrue(userAgent.contains("Chrome"))
    }

    @Test
    fun testGenerateDesktopUserAgentForWindowsAndFirefoxShouldSuccess() {
        val userAgent = RandomUserAgent.desktop(DeviceType.WINDOWS, BrowserType.FIREFOX)
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("Windows"))
        assertTrue(userAgent.contains("Firefox"))
    }

    @Test
    fun testGenerateDesktopUserAgentUnsupportedBrowserShouldThrowException() {
        assertThrows(UserAgentException::class.java) {
            RandomUserAgent.desktop(DeviceType.WINDOWS, BrowserType.SAFARI)
        }
        assertThrows(UserAgentException::class.java) {
            RandomUserAgent.desktop(DeviceType.LINUX, BrowserType.SAFARI)
        }
    }

    @Test
    fun testGenerateDesktopUserAgentForLinuxAndChromeShouldSuccess() {
        val userAgent = RandomUserAgent.desktop(DeviceType.LINUX, BrowserType.CHROME)
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("X11"))
        assertTrue(userAgent.contains("Chrome"))
    }

    @Test
    fun testGenerateDesktopUserAgentForLinuxAndFirefoxShouldSuccess() {
        val userAgent = RandomUserAgent.desktop(DeviceType.LINUX, BrowserType.FIREFOX)
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("X11"))
        assertTrue(userAgent.contains("Firefox"))
    }


    @Test
    fun testGenerateDesktopUserAgentForUnsupportedDeviceShouldThrowException() {
        assertThrows(UserAgentException::class.java) {
            RandomUserAgent.desktop(DeviceType.IOS)
        }
        assertThrows(UserAgentException::class.java) {
            RandomUserAgent.desktop(DeviceType.ANDROID)
        }
    }

    @Test
    fun testGenerateDesktopUserAgentForMacOSAndChromeShouldSuccess() {
        val userAgent = RandomUserAgent.desktop(DeviceType.MACOS, BrowserType.CHROME)
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("Macintosh"))
        assertTrue(userAgent.contains("Chrome"))
    }

    @Test
    fun testGenerateDesktopUserAgentForMacOSAndFirefoxShouldSuccess() {
        val userAgent = RandomUserAgent.desktop(DeviceType.MACOS, BrowserType.FIREFOX)
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("Macintosh"))
        assertTrue(userAgent.contains("Firefox"))
    }

    @Test
    fun testGenerateDesktopUserAgentForMacOSAndSafariShouldSuccess() {
        val userAgent = RandomUserAgent.desktop(DeviceType.MACOS, BrowserType.SAFARI)
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("Macintosh"))
        assertTrue(userAgent.contains("Version"))
    }

    @Test
    fun testGenerateMobileUserAgentForIOSAndChromeShouldSuccess() {
        val userAgent = RandomUserAgent.mobile(DeviceType.IOS, BrowserType.CHROME)
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("Mobile"))
        assertTrue(userAgent.contains("iPhone") || userAgent.contains("iPad"))
        assertTrue(userAgent.contains("CriOS"))
    }

    @Test
    fun testGenerateMobileUserAgentForIOSAndFirefoxShouldSuccess() {
        val userAgent = RandomUserAgent.mobile(DeviceType.IOS, BrowserType.FIREFOX)
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("Mobile"))
        assertTrue(userAgent.contains("iPhone") || userAgent.contains("iPad"))
        assertTrue(userAgent.contains("FxiOS"))
    }

    @Test
    fun testGenerateMobileUserAgentForIOSAndSafariShouldSuccess() {
        val userAgent = RandomUserAgent.mobile(DeviceType.IOS, BrowserType.SAFARI)
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("Mobile"))
        assertTrue(userAgent.contains("iPhone") || userAgent.contains("iPad"))
        assertTrue(userAgent.contains("Version"))
    }

    @Test
    fun testGenerateMobileUserAgentForAndroidAndChromeShouldSuccess() {
        val userAgent = RandomUserAgent.mobile(DeviceType.ANDROID, BrowserType.CHROME)
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("Mobile"))
        assertTrue(userAgent.contains("Linux"))
        assertTrue(userAgent.contains("Chrome"))
    }

    @Test
    fun testGenerateMobileUserAgentForAndroidAndFirefoxShouldSuccess() {
        val userAgent = RandomUserAgent.mobile(DeviceType.ANDROID, BrowserType.FIREFOX)
        assertNotNull(userAgent)
        assertTrue(userAgent.startsWith("Mozilla/5.0"))
        assertTrue(userAgent.contains("Linux"))
        assertTrue(userAgent.contains("Firefox"))
    }

    @Test
    fun testGenerateMobileUserAgentForUnsupportedDeviceShouldThrowException() {
        assertThrows(UserAgentException::class.java) {
            RandomUserAgent.mobile(DeviceType.WINDOWS)
        }
        assertThrows(UserAgentException::class.java) {
            RandomUserAgent.mobile(DeviceType.LINUX)
        }
        assertThrows(UserAgentException::class.java) {
            RandomUserAgent.mobile(DeviceType.MACOS)
        }
    }

    @Test
    fun testGenerateMobileUserAgentUnsupportedBrowserShouldThrowException() {
        assertThrows(UserAgentException::class.java) {
            RandomUserAgent.mobile(DeviceType.ANDROID, BrowserType.SAFARI)
        }
    }
}



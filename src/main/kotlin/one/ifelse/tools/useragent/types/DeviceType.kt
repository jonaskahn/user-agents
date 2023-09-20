package one.ifelse.tools.useragent.types

enum class DeviceType {
    MACOS,
    LINUX,
    WINDOWS,
    IOS,
    ANDROID;

    companion object {
        fun mobile(): List<DeviceType> {
            return arrayListOf(IOS, ANDROID)
        }

        fun desktop(): List<DeviceType> {
            return arrayListOf(MACOS, LINUX, WINDOWS)
        }
    }
}

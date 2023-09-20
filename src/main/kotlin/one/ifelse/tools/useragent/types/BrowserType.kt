package one.ifelse.tools.useragent.types

enum class BrowserType {
    CHROME,
    FIREFOX,
    SAFARI;

    companion object {
        fun all(): List<BrowserType> {
            return arrayListOf(CHROME, FIREFOX, SAFARI)
        }

        fun cross(): List<BrowserType> {
            return arrayListOf(CHROME, FIREFOX)
        }
    }
}

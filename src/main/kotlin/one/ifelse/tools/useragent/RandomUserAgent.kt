package one.ifelse.tools.useragent

import one.ifelse.tools.useragent.types.UserAgent

object RandomUserAgent {

    fun random(): String {
        return Seeds.USER_AGENTS.random().userAgent
    }

    fun random(vararg predicates: (UserAgent) -> Boolean): String {
        return Seeds.USER_AGENTS
            .filter { item -> predicates.all { predicate -> predicate(item) } }
            .random()
            .userAgent
    }
}
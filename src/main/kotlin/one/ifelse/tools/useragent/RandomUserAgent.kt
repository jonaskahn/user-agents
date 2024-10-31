package one.ifelse.tools.useragent

import one.ifelse.tools.useragent.types.UserAgent

object RandomUserAgent {

    fun random(predicates: Collection<(UserAgent) -> Boolean> = listOf()): String {
        return Seeds.USER_AGENTS
            .filter { item -> predicates.all { predicate -> predicate(item) } }
            .random()
            .userAgent
    }
}
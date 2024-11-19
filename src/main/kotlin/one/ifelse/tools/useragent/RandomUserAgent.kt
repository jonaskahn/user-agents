package one.ifelse.tools.useragent

import one.ifelse.tools.useragent.types.UserAgent

/**
 * A random user-agent generator.
 *
 * @author JonasKahn
 * @since 0.0.1
 */
object RandomUserAgent {

    /**
     * Get a random user-agent from all available.
     *
     * @return a random user-agent
     */
    fun random(): String {
        return Seeds.USER_AGENTS.random().userAgent
    }

    /**
     * Get a random user-agent from all available, filtered by given predicates.
     *
     * @param predicates predicates to filter user-agents
     * @return a random user-agent that matches all predicates
     */
    fun random(vararg predicates: (UserAgent) -> Boolean): String {
        return Seeds.USER_AGENTS
            .filter { item -> predicates.all { predicate -> predicate(item) } }
            .random()
            .userAgent
    }
}
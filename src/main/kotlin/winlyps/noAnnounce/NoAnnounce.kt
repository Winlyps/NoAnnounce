package winlyps.noAnnounce

import org.bukkit.plugin.java.JavaPlugin

class NoAnnounce : JavaPlugin() {

    override fun onEnable() {
        // Plugin startup logic
        server.worlds.forEach { world ->
            world.setGameRuleValue("announceAdvancements", "false")
        }
        logger.info("NoAnnounce plugin has been enabled.")
    }

    override fun onDisable() {
        // Plugin shutdown logic
        logger.info("NoAnnounce plugin has been disabled.")
    }
}
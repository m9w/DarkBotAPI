package eu.darkbot.api.config.legacy;

import eu.darkbot.api.config.types.PlayerInfo;
import eu.darkbot.api.config.types.SafetyInfo;
import eu.darkbot.api.game.other.GameMap;

import java.util.Collection;
import java.util.Map;

public interface Config {

    /**
     * @return configured safeties for the requested map
     */
    Collection<? extends SafetyInfo> getSafeties(GameMap map);

    /**
     * @return map with all the known player infos with the id as key
     */
    Map<Integer, ? extends PlayerInfo> getPlayerInfos();

    /**
     * @return general configuration section with generic base configurations
     */
    General getGeneral();

    /**
     * @return collect configuration section with configurations about how to collect
     */
    Collect getCollect();

}
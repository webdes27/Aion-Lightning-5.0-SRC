/**
 * This file is part of Aion-Lightning <aion-lightning.org>.
 *
 *  Aion-Lightning is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  Aion-Lightning is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details. *
 *  You should have received a copy of the GNU General Public License
 *  along with Aion-Lightning.
 *  If not, see <http://www.gnu.org/licenses/>.
 */
package com.aionemu.gameserver.configs.main;

import com.aionemu.commons.configuration.Property;

/**
 * @author Rolandas
 */
public class EventsConfig {

    /**
     * Event Enabled
     */
    @Property(key = "gameserver.event.enable", defaultValue = "false")
    public static boolean EVENT_ENABLED;

	/**
	 * Enable the Server Event Decorations 00 = no decoration/also means normal usage of event service 01 = christmas 02
	 * = halloween 03 = braxcafe 04 = valentine
	 */
	@Property(key = "gameserver.enable.decor", defaultValue = "0")
	public static int ENABLE_DECOR;

    /**
     * Event Rewarding Membership
     */
    @Property(key = "gameserver.event.membership", defaultValue = "0")
    public static int EVENT_REWARD_MEMBERSHIP;
    @Property(key = "gameserver.event.membership.rate", defaultValue = "false")
    public static boolean EVENT_REWARD_MEMBERSHIP_RATE;
    /**
     * Event Rewarding Period
     */
    @Property(key = "gameserver.event.period", defaultValue = "60")
    public static int EVENT_PERIOD;
    /**
     * Event Reward Values
     */
    @Property(key = "gameserver.event.item.elyos", defaultValue = "162002024")
    public static int EVENT_ITEM_ELYOS;
    @Property(key = "gameserver.event.item.asmo", defaultValue = "162002024")
    public static int EVENT_ITEM_ASMO;
    @Property(key = "gameserver.events.givejuice", defaultValue = "160009017")
    public static int EVENT_GIVEJUICE;
    @Property(key = "gameserver.events.givecake", defaultValue = "160010073")
    public static int EVENT_GIVECAKE;
    @Property(key = "gameserver.event.count", defaultValue = "1")
    public static int EVENT_ITEM_COUNT;
    @Property(key = "gameserver.event.service.enable", defaultValue = "false")
    public static boolean ENABLE_EVENT_SERVICE;
    /**
     * INVASION RIFT
     */
    @Property(key = "gameserver.invasionrift.enabled", defaultValue = "false")
    public static boolean INVASION_RIFT_ENABLE;
    @Property(key = "gameserver.elyos.invasionrift.schedule", defaultValue = "0 0 20 ? * TUE")
    public static String ELYOS_INVASION_RIFT_SPAWN_SCHEDULE;
    @Property(key = "gameserver.asmodians.invasionrift.schedule", defaultValue = "0 0 20 ? * TUE")
    public static String ASMODIANS_INVASION_RIFT_SPAWN_SCHEDULE;

    /**
     * Live Party Concert Hall
     */
    @Property(key = "gameserver.liveparty.enabled", defaultValue = "false")
    public static boolean LIVE_PARTY_ENABLE;
    @Property(key = "gameserver.liveparty.schedule", defaultValue = "0 0 20 ? * TUE")
    public static String LIVE_PARTY_SPAWN_SCHEDULE;
    @Property(key = "gameserver.liveparty.allrace", defaultValue = "ALL")
    public static String LIVE_PARTY_RACE_ALL;
    @Property(key = "gameserver.liveparty.max", defaultValue = "100")
    public static int LIVE_PARTY_MAX_PLAYERS;
    /**
     * Arcade Event
     */    
	@Property(key="gameserver.event.arcade.enable", defaultValue="false")
	public static boolean ENABLE_EVENT_ARCADE;

    @Property(key="gameserver.event.arcade.chance", defaultValue="50")
    public static int EVENT_ARCADE_CHANCE;
}
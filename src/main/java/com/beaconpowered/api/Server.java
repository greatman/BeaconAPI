/* The MIT License (MIT)
 *
 * Copyright (c) 2015 BeaconPowered
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */

package com.beaconpowered.api;

import com.beaconpowered.api.container.plugin.PluginManager;
import com.beaconpowered.api.entity.player.Player;
import com.beaconpowered.api.location.World;
import com.beaconpowered.api.text.Text;

import java.util.Collection;
import java.util.UUID;

public interface Server {

	/**
	 * Returns a {@link Collection} of all online {@link Player}s.
     *
	 * @return the collection of online players.
	 */
	Collection<Player> getOnlinePlayers();

	/**
	 * Returns the maximum amount of {@link Player}s that are
     * allowed on the server.
     *
	 * @return the maximum amount of allowed players.
	 */
	int getMaxPlayers();

	/**
	 * Returns a {@link Collection} of all {@link Player}s
     * with OP permissions.
     *
	 * @return the collection of OPed players.
	 */
	Collection<Player> getOps();

	/**
	 * Returns an online {@link Player} called <name>.
     *
	 * @param name the player's name
	 * @return the player with name <name>.
	 */
	Player getPlayer(String name);

	/**
	 * Returns an online {@link Player} with UUID <id>.
     *
	 * @param id the player's UUID
	 * @return the player with UUID <id>.
	 */
	Player getPlayer(UUID id);

	/**
	 * Returns a {@link World} called <name>.
     *
	 * @param name the name of the world
	 * @return the world called <name>.
	 */
    World getWorld(String name);

	/**
	 * Returns a {@link World} with UUID <id>.
     *
	 * @param id the UUID of the world
	 * @return the world with UUID <id>.
	 */
    World getWorld(UUID id);

	/**
	 * Returns the plugin manager.
     *
	 * @return the plugin manager.
	 */
    PluginManager getPluginManager();

    Scheduler getScheduler();

	/**
	 * Broadcasts <message> to the server.
     *
	 * @param message the message to broadcast
	 */
	void broadcastMessage(Text message);

	/**
	 * Returns if the whitelist is enabled or disabled.
     *
	 * @return if the whitelist is enabled.
	 */
	boolean hasWhitelist();

	/**
	 * Sets if the whitelist is enabled or disabled.
     *
	 * @param state set if enabled or disabled.
	 */
	void setWhitelisted(boolean state);

	/**
	 * Returns if the server is in online mode.
     * If it is in offline mode, it will not authenticate
     * with Mojang's servers.
     *
	 * @return if the server is in online mode.
	 */
	boolean isInOnlineMode();

	/**
	 * Returns the server's server-list MOTD.
     *
	 * @return the displayed MOTD.
	 */
	String getMotd();

	/**
	 * Stops the server
	 * @param kickMessage the message to use when kicking players
	 */
	void stopServer(Text kickMessage);

	/**
	 * Returns a collection of the server's worlds
	 * @return a collection of the server's worlds
	 */
	Collection<World> getWorlds();

    String getImplementationVersion();
    String getAPIVersion();
}

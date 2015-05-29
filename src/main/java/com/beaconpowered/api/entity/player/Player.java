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

package com.beaconpowered.api.entity.player;

import com.beaconpowered.api.Server;
import com.beaconpowered.api.entity.Entity;
import com.beaconpowered.api.text.Text;
import com.beaconpowered.api.util.Achievements;
import com.beaconpowered.api.util.Sounds;

import java.net.InetAddress;

public interface Player extends Entity {
    /**
     * Returns the {@link Text} of the player's display name
     * @return the {@link Text} of the player's display name
     */
    Text getDisplayName();

    /**
     * Sets the {@link Text} of the player's display name
     * @param displayName the {@link Text} of the player's display name
     */
    void setDisplayName(Text displayName);

    /**
     * Returns the player's current health
     * @return the player's current health
     */
    int getHealth();

    /**
     * Sets the player's health
     * @param health the health to set for the player
     */
    void setHealth(int health);

    /**
     * Returns the player's current food level
     * @return the player's current food level
     */
    int getFoodLevel();

    /**
     * Sets the player's food level
     * @param foodLevel the food level to set for the player
     */
    void setFoodLevel(int foodLevel);

    /**
     * Sends a chat message from this player
     * @param msg the {@link Text} to send as a message
     */
    void chat(Text msg);

    /**
     * Removes this player from the {@link Server}
     */
    void kick();

    /**
     * Removes this player from the {@link Server} using the provided message
     * @param kickMessage the {@link Text} to send them upon removal
     */
    void kick(Text kickMessage);

    /**
     * Plays a sound on the player's client
     * @param sound the {@link Sounds} to player
     */
    void playSound(Sounds sound);

    /**
     * Returns if a player has an {@link Achievements}
     * @param achievement the {@link Achievements} to check for
     * @return if a player has an {@link Achievements}
     */
    boolean hasAchievement(Achievements achievement);

    /**
     * Gives a player an {@link Achievements}
     * @param achievement the {@link Achievements} to give the player
     */
    void giveAchievement(Achievements achievement);

    /**
     * Revokes a player's {@link Achievements}
     * @param achievement the {@link Achievements} to revoke
     */
    void revokeAchievement(Achievements achievement);

    /**
     * Returns if the player is flying
     * @return if the player is flying
     */
    boolean isFlying();

    /**
     * Returns if the player is sprinting
     * @return if the player is sprinting
     */
    boolean isSprinting();

    /**
     * Returns if the player is sneaking
     * @return if the player is sneaking
     */
    boolean isSneaking();

    /**
     * Returns if the player is online
     * @return if the player is online
     */
    boolean isOnline();

    /**
     * Returns if the player is an operator
     * @return if the player is an operator
     */
    boolean isOp();

    /**
     * Returns if the player has played before
     * @return if the player has played before
     */
    boolean hasPlayedBefore();

    /**
     * Returns the {@link InetAddress} of the player
     * @return the {@link InetAddress} of the player
     */
    InetAddress getAddress();
}

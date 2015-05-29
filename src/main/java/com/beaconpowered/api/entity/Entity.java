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

package com.beaconpowered.api.entity;

import com.beaconpowered.api.entity.type.EntityType;
import com.beaconpowered.api.location.Location;
import com.beaconpowered.api.location.World;
import com.beaconpowered.api.text.Text;

public interface Entity {
	/**
	 * Returns the {@link EntityType} of the entity
	 * @return the {@link EntityType} of the entity
	 */
	EntityType getType();

	/**
	 * Returns the {@link Text} of the entity's name
	 * @return the {@link Text} of the entity's name
	 */
	Text getName();

	/**
	 * Returns the {@link Text} of the entity's custom name
	 * @return the {@link Text} of the entity's custom name
	 */
	Text getCustomName();

	/**
	 * Returns the {@link Location} of the entity
	 * @return the {@link Location} of the entity
	 */
	Location getLocation();

	/**
	 * Sets the current {@link Location} of the entity
	 * @param location the {@link Location} to set
	 */
	void setLocation(Location location);

	/**
	 * Returns if the entity is on the ground
	 * @return if the entity is on the ground
	 */
	boolean isOnGround();

	/**
	 * Removes the entity from the {@link World}
	 */
	void remove();

	/**
	 * Returns if the entity is removed from the {@link World}
	 * @return if the entity is removed from the {@link World}
	 */
	boolean isRemoved();
}

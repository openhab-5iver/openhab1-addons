/**
 * Copyright (c) 2010-2020 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.dscalarm1;

import org.openhab.core.binding.BindingProvider;
import org.openhab.core.items.Item;

/**
 * Binding provider interface for a DSC Alarm system
 *
 * @author Russell Stephens
 * @since 1.6.0
 */
public interface DSCAlarmBindingProvider extends BindingProvider {

    /**
     * Returns the binding configuration for the item with this name
     *
     * @param itemName
     * @return the binding configuration.
     */
    public DSCAlarmBindingConfig getDSCAlarmBindingConfig(String itemName);

    /**
     * Returns the {@link Item} with the specified item name
     *
     * @param itemName
     * @return item
     */
    public Item getItem(String itemName);
}

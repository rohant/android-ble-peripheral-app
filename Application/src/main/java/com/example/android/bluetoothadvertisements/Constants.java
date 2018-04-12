/*
 * Copyright (C) 2015 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.bluetoothadvertisements;

import android.os.Parcel;
import android.os.ParcelUuid;

/**
 * Constants for use in the Bluetooth Advertisements sample
 */
public class Constants {

    /**
     * UUID identified with this app - set as Service UUID for BLE Advertisements.
     *
     * Bluetooth requires a certain format for UUIDs associated with Services.
     * The official specification can be found here:
     * {@link https://www.bluetooth.org/en-us/specification/assigned-numbers/service-discovery}
     */
    //public static final ParcelUuid Service_UUID = ParcelUuid.fromString("00001800-0000-1000-8000-00805f9b0131");
    public static final ParcelUuid Service_UUID = ParcelUuid.fromString("0000b81d-0000-1000-8000-00805f9b34fb");

    public static final int REQUEST_ENABLE_BT = 1;
    public static final java.util.UUID Battery_UUID = java.util.UUID.fromString("0000180F-0000-1000-8000-00805F9B34FB");
    public static final java.util.UUID Battery_Level_UUID = java.util.UUID.fromString("00002A19-0000-1000-8000-00805F9B34FB");

    public static final java.util.UUID S_UUID = java.util.UUID.fromString("0003cdd0-0000-1000-8000-00805f9b0131");
   // public static final java.util.UUID CHAR_UUID = java.util.UUID.fromString("0003cdd1-0000-1000-8000-00805f9b0131");
   // public static final java.util.UUID CHAR_UUID2 = java.util.UUID.fromString("0003cdd2-0000-1000-8000-00805f9b0131");

    public static final java.util.UUID DES_UUID = java.util.UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    public static final java.util.UUID SERVICEUUID = java.util.UUID.fromString("795090c7-420d-4048-a24e-18e60180e23c");
    public static final java.util.UUID rohanuuid = java.util.UUID.fromString("29516338-391c-11e8-b467-0ed5f89f718b");

    public static final java.util.UUID CHARACTERISTIC_USER_DESCRIPTION_UUID = java.util.UUID.fromString("00002901-0000-1000-8000-00805f9b34fb");
    public static final java.util.UUID CLIENT_CHARACTERISTIC_CONFIGURATION_UUID = java.util.UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");

    /** Immediate Alert service UUID */
    public final static java.util.UUID IMMEDIATE_ALERT_SERVICE_UUID = java.util.UUID.fromString("00001802-0000-1000-8000-00805f9b34fb");
    /** Linkloss service UUID */
    public final static java.util.UUID LINKLOSS_SERVICE_UUID = java.util.UUID.fromString("00001803-0000-1000-8000-00805f9b34fb");
    /** Alert Level characteristic UUID */
    public static final java.util.UUID ALERT_LEVEL_CHARACTERISTIC_UUID = java.util.UUID.fromString("00002A06-0000-1000-8000-00805f9b34fb");

    public static final byte[] SampleByte = new byte[] { (byte)0x80, 0x53, 0x1c,
            (byte)0x87, (byte)0xa0, 0x42, 0x69, 0x10, (byte)0xa2, (byte)0xea, 0x08,
            0x00, 0x2b, 0x30, 0x30, (byte)0x9d };

    public static final java.util.UUID UUID_ALERT_NOTIFICATION_SERVICE = java.util.UUID.fromString("00001811-0000-1000-8000-00805f9b34fb");
    public static final java.util.UUID UUID_ALERT_NOTIFICATION_CONTROL_POINT = java.util.UUID.fromString("00002a45-0000-1000-8000-00805f9b34fb");
    public static final java.util.UUID UUID_UNREAD_ALERT_STATUS = java.util.UUID.fromString("00002a46-0000-1000-8000-00805f9b34fb");
    public static final java.util.UUID UUID_SUPPORTED_NEW_ALERT_CATEGORY = java.util.UUID.fromString("00002a47-0000-1000-8000-00805f9b34fb");
    public static final java.util.UUID UUID_SUPPORTED_UNREAD_ALERT_CATEGORY = java.util.UUID.fromString("00002a48-0000-1000-8000-00805f9b34fb");
    public static final java.util.UUID UUID_NEW_ALERT = java.util.UUID.fromString("00002a49-0000-1000-8000-00805f9b34fb");
    public static final java.util.UUID UUID_CLIENT_CHARACTERISTIC_CONFIG = java.util.UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");


}

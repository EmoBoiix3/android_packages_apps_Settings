/*
 * Copyright (C) 2013 Project Equilibrium
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

package com.android.settings;

import android.app.TabActivity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class Settings extends TabActivity {
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tabs);
        
        SharedPreferences PREF = PreferenceManager.getDefaultSharedPreferences(this);
        boolean TAB_SETTING = PREF.getBoolean("tab_settings", true);
        
        if (TAB_SETTING == false) {
        	Intent intent = new Intent(this, SettingsNormal.class);
            intent.addCategory(Intent.CATEGORY_HOME);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            startActivity(intent);
            finish();
        }
        
        TabHost tabHost = getTabHost();
        
        // Network
        TabSpec mNetwork = tabHost.newTabSpec("Network");
        mNetwork.setIndicator(getResources().getString(R.string.status_operator));
        Intent NetworkIntent = new Intent(this, SettingsNetwork.class);
        mNetwork.setContent(NetworkIntent);
		        
        // Device
        TabSpec mDevice = tabHost.newTabSpec("Device");
        mDevice.setIndicator(getResources().getString(R.string.header_category_device));
        Intent DeviceIntent = new Intent(this, SettingsDevice.class);
        mDevice.setContent(DeviceIntent);
        
        // System
        TabSpec mSystem = tabHost.newTabSpec("System");
        mSystem.setIndicator(getResources().getString(R.string.header_category_system));
        Intent mySystemIntent = new Intent(this, SettingsSystem.class);
        mSystem.setContent(mySystemIntent);
        
    	tabHost.addTab(mNetwork);
    	tabHost.addTab(mDevice);
    	tabHost.addTab(mSystem);
        
	}
	
	public static class BluetoothSettingsActivity extends Settings { /* empty */ }
    public static class WirelessSettingsActivity extends Settings { /* empty */ }
    public static class TetherSettingsActivity extends Settings { /* empty */ }
    public static class VpnSettingsActivity extends Settings { /* empty */ }
    public static class DateTimeSettingsActivity extends Settings { /* empty */ }
    public static class StorageSettingsActivity extends Settings { /* empty */ }
    public static class WifiSettingsActivity extends Settings { /* empty */ }
    public static class WifiP2pSettingsActivity extends Settings { /* empty */ }
    public static class InputMethodAndLanguageSettingsActivity extends Settings { /* empty */ }
    public static class KeyboardLayoutPickerActivity extends Settings { /* empty */ }
    public static class InputMethodAndSubtypeEnablerActivity extends Settings { /* empty */ }
    public static class SpellCheckersSettingsActivity extends Settings { /* empty */ }
    public static class LocalePickerActivity extends Settings { /* empty */ }
    public static class UserDictionarySettingsActivity extends Settings { /* empty */ }
    public static class SoundSettingsActivity extends Settings { /* empty */ }
    public static class DisplaySettingsActivity extends Settings { /* empty */ }
    public static class DeviceInfoSettingsActivity extends Settings { /* empty */ }
    public static class ApplicationSettingsActivity extends Settings { /* empty */ }
    public static class ManageApplicationsActivity extends Settings { /* empty */ }
    public static class AppOpsSummaryActivity extends Settings { /* empty */ }
    public static class StorageUseActivity extends Settings { /* empty */ }
    public static class DevelopmentSettingsActivity extends Settings { /* empty */ }
    public static class AccessibilitySettingsActivity extends Settings { /* empty */ }
    public static class SecuritySettingsActivity extends Settings { /* empty */ }
    public static class LocationSettingsActivity extends Settings { /* empty */ }
    public static class PrivacySettingsActivity extends Settings { /* empty */ }
    public static class RunningServicesActivity extends Settings { /* empty */ }
    public static class ManageAccountsSettingsActivity extends Settings { /* empty */ }
    public static class PowerUsageSummaryActivity extends Settings { /* empty */ }
    public static class AccountSyncSettingsActivity extends Settings { /* empty */ }
    public static class AccountSyncSettingsInAddAccountActivity extends Settings { /* empty */ }
    public static class CryptKeeperSettingsActivity extends Settings { /* empty */ }
    public static class DeviceAdminSettingsActivity extends Settings { /* empty */ }
    public static class DataUsageSummaryActivity extends Settings { /* empty */ }
    public static class AdvancedWifiSettingsActivity extends Settings { /* empty */ }
    public static class TextToSpeechSettingsActivity extends Settings { /* empty */ }
    public static class AndroidBeamSettingsActivity extends Settings { /* empty */ }
    public static class WifiDisplaySettingsActivity extends Settings { /* empty */ }
    public static class AnonymousStatsActivity extends Settings { /* empty */ }
    public static class ApnSettingsActivity extends Settings { /* empty */ }
    public static class ApnEditorActivity extends Settings { /* empty */ }
    public static class ProfilesSettingsActivity extends Settings { /* empty */ }
    public static class QuietHoursSettingsActivity extends Settings { /* empty */ }
    public static class DreamSettingsActivity extends Settings { /* empty */ }
    public static class SystemSettingsActivity extends Settings { /* empty */ }
    public static class NotificationStationActivity extends Settings { /* empty */ }
    public static class UserSettingsActivity extends Settings { /* empty */ }
    public static class NotificationAccessSettingsActivity extends Settings { /* empty */ }
    public static class BlacklistSettingsActivity extends Settings { /* empty */ }
}
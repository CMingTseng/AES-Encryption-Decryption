package com.azrashaikh.aeslib;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Constants related to shared preferences
 *
 * @author dhara.shah
 */
public class Prefs {


    // preference file name
    private static final String CryptographyAppPref = "cryptography_app";

    static final String SECRET_KEY = "secret_key";

    /**
     * @param context - pass context
     * @return SharedPreferences
     */
    public static SharedPreferences get(Context context) {
        return context.getSharedPreferences(CryptographyAppPref, 0);
    }

    /**
     * @param context - context
     * @param key     - Constant key, will be used for accessing the stored value
     * @param val     - String value to be stored
     */
    public static void addKey(Context context, String key, String val) {
        SharedPreferences settings = Prefs.get(context);
        SharedPreferences.Editor editor = settings.edit();
        editor.putString(key, val);
        editor.commit();
    }

    /**
     * @param context
     * @param key
     * @param val
     */
    public static void addKey(Context context, String key, boolean val) {
        SharedPreferences settings = Prefs.get(context);
        SharedPreferences.Editor editor = settings.edit();
        editor.putBoolean(key, val);
        editor.commit();
    }

    /**
     * @param context
     * @param key
     * @param val
     */
    public static void addKey(Context context, String key, int val) {
        SharedPreferences settings = Prefs.get(context);
        SharedPreferences.Editor editor = settings.edit();
        editor.putInt(key, val);
        editor.commit();
    }

    /**
     * Add preferences
     *
     * @param context - context
     * @param key     - Constant key, will be used for accessing the stored value
     * @param val     - long value to be stored, mostly used to store FB Session
     *                value
     */
    public static void addKey(Context context, String key, Long val) {
        SharedPreferences settings = Prefs.get(context);
        SharedPreferences.Editor editor = settings.edit();
        editor.putLong(key, val);
        editor.commit();
    }

    /**
     * Remove preference key
     *
     * @param context - context
     * @param key     - the key which you stored before
     */
    public static void removeKey(Context context, String key) {
        SharedPreferences settings = Prefs.get(context);
        SharedPreferences.Editor editor = settings.edit();

        if (settings.contains(key)) {
            editor.remove(key);
        }

        editor.commit();
    }

    /**
     * Remove preference key
     *
     * @param context - context
     * @param keys    - array of keys that needs to be removed
     */
    public static void removeKeys(Context context, String[] keys) {
        SharedPreferences settings = Prefs.get(context);
        SharedPreferences.Editor editor = settings.edit();
        for (String key : keys) {
            if (settings.contains(key)) {
                editor.remove(key);
            }
        }
        editor.commit();
    }

    /**
     * Get preference value by passing related key
     *
     * @param context - context
     * @param key     - key value used when adding preference
     * @return - String value
     */
    public static String getKey(Context context, String key) {
        SharedPreferences prefs = Prefs.get(context);
        return prefs.getString(key, "");
    }


    /**
     * Clear all stored preferences
     *
     * @param context - context
     */
    public static void clear(Context context) {
        SharedPreferences settings = Prefs.get(context);
        SharedPreferences.Editor editor = settings.edit();
        editor.clear();
        editor.commit();
    }
}

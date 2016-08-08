package com.mj.core.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;

/**
 * 默认SharedPreference的帮助类.
 * Created By: Robin Yang
 * Created At: 2015-01-20 17:59
 */
public class SharedPrefsUtil {
    public static SharedPreferences getDefaultSharedPrefs(Context context) {
        return PreferenceManager.getDefaultSharedPreferences(context);
    }

    public static void setValue(Context context, String key, String value) {
        getDefaultSharedPrefs(context).edit().putString(key, value).commit();
    }
    public static void setValue(Context context, String key, int value) {
        getDefaultSharedPrefs(context).edit().putInt(key, value).commit();
    }
    public static void setValue(Context context, String key, boolean value) {
        getDefaultSharedPrefs(context).edit().putBoolean(key, value).commit();
    }
    public static void setValue(Context context, String key, float value) {
        getDefaultSharedPrefs(context).edit().putFloat(key, value).commit();
    }
    public static void setValue(Context context, String key, long value) {
        getDefaultSharedPrefs(context).edit().putLong(key, value).commit();
    }

    public static String getString(Context context, String key) {
        return getDefaultSharedPrefs(context).getString(key, "");
    }

    public static String getString(Context context, String key, String defaultvals) {
        return getDefaultSharedPrefs(context).getString(key, defaultvals);
    }

    public static boolean getBoolean(Context context, String key) {
        return getDefaultSharedPrefs(context).getBoolean(key, false);
    }
    public static int getInt(Context context, String key) {
        return getDefaultSharedPrefs(context).getInt(key, -1);
    }
    public static long getLong(Context context, String key) {
        return getDefaultSharedPrefs(context).getLong(key, -1l);
    }
    public static float getFloat(Context context, String key) {
        return getDefaultSharedPrefs(context).getFloat(key, -1f);
    }

    public static boolean contains(Context context, String key) {
        return getDefaultSharedPrefs(context).contains(key);
    }


}

package com.bytedance.pangle.activity;

@androidx.annotation.Keep
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public interface IPluginActivity {
    void _requestPermissions(java.lang.String[] r1, int r2);

    void attachBaseContext(android.content.Context r1);

    java.lang.String getPluginPkgName();

    void onCreate(android.os.Bundle r1);

    void setPluginProxyActivity(com.bytedance.pangle.activity.xt r1, com.bytedance.pangle.plugin.Plugin r2);

    void setProxyTheme2Plugin(int r1);
}

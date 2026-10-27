package com.bytedance.pangle.activity;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public interface xt {
    void finish();

    android.app.Application getApplication();

    android.content.Context getBaseContext();

    android.content.Intent getIntent();

    com.bytedance.pangle.plugin.Plugin getPlugin();

    java.lang.String getPluginPkgName();

    void setPlugin(com.bytedance.pangle.plugin.Plugin r1);

    void setTargetActivity(com.bytedance.pangle.activity.IPluginActivity r1);

    void zeusSuperAttachBaseContext(android.content.Context r1);

    void zeusSuperOnCreate(android.os.Bundle r1);

    void zeusSuperSetTheme(int r1);
}

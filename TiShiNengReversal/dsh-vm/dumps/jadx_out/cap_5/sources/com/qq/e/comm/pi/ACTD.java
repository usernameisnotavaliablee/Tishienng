package com.qq.e.comm.pi;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public interface ACTD {
    public static final java.lang.String APPID_KEY = "appid";
    public static final java.lang.String DELEGATE_NAME_KEY = "gdt_activity_delegate_name";

    void onActivityResult(int r1, int r2, android.content.Intent r3);

    void onAfterCreate(android.os.Bundle r1);

    void onBackPressed();

    void onBeforeCreate(android.os.Bundle r1);

    void onConfigurationChanged(android.content.res.Configuration r1);

    void onDestroy();

    void onPause();

    void onResume();

    void onStop();
}

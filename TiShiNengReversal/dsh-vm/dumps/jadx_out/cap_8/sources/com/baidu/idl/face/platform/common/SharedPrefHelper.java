package com.baidu.idl.face.platform.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class SharedPrefHelper {
    private static final java.lang.String SHARED_PREFERENCES_NAME_FACE_VALUE = "face_sdk_value";

    private SharedPrefHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    private static android.content.SharedPreferences getPref(android.content.Context r2) {
            java.lang.String r0 = "face_sdk_value"
            r1 = 0
            android.content.SharedPreferences r2 = r2.getSharedPreferences(r0, r1)
            return r2
    }
}

package com.google.android.gms.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class SharedPreferencesUtils {
    private SharedPreferencesUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    @java.lang.Deprecated
    public static void publishWorldReadableSharedPreferences(@androidx.annotation.NonNull android.content.Context r0, @androidx.annotation.NonNull android.content.SharedPreferences.Editor r1, @androidx.annotation.NonNull java.lang.String r2) {
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "world-readable shared preferences should only be used by apk"
            r0.<init>(r1)
            throw r0
    }
}

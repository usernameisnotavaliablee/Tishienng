package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class UserRecoverableException extends java.lang.Exception {
    private final android.content.Intent zza;

    public UserRecoverableException(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.content.Intent r2) {
            r0 = this;
            r0.<init>(r1)
            r0.zza = r2
            return
    }

    @androidx.annotation.NonNull
    public android.content.Intent getIntent() {
            r2 = this;
            android.content.Intent r0 = new android.content.Intent
            android.content.Intent r1 = r2.zza
            r0.<init>(r1)
            return r0
    }
}

package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class GooglePlayServicesRepairableException extends com.google.android.gms.common.UserRecoverableException {
    private final int zza;

    public GooglePlayServicesRepairableException(int r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.content.Intent r3) {
            r0 = this;
            r0.<init>(r2, r3)
            r0.zza = r1
            return
    }

    public int getConnectionStatusCode() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }
}

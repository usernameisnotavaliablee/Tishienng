package com.google.android.gms.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepName
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class GooglePlayServicesManifestException extends java.lang.IllegalStateException {
    private final int zza;

    public GooglePlayServicesManifestException(int r1, @androidx.annotation.NonNull java.lang.String r2) {
            r0 = this;
            r0.<init>(r2)
            r0.zza = r1
            return
    }

    public int getActualVersion() {
            r1 = this;
            int r0 = r1.zza
            return r0
    }

    public int getExpectedVersion() {
            r1 = this;
            int r0 = com.google.android.gms.common.GoogleApiAvailabilityLight.GOOGLE_PLAY_SERVICES_VERSION_CODE
            return r0
    }
}

package com.google.mlkit.common.sdkinternal.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class URLWrapper {
    private final java.net.URL zza;

    @com.google.android.gms.common.annotation.KeepForSdk
    public URLWrapper(@androidx.annotation.NonNull java.lang.String r2) throws java.net.MalformedURLException {
            r1 = this;
            r1.<init>()
            java.net.URL r0 = new java.net.URL
            r0.<init>(r2)
            r1.zza = r0
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public java.net.URLConnection openConnection() throws java.io.IOException {
            r1 = this;
            java.net.URL r0 = r1.zza
            java.net.URLConnection r0 = r0.openConnection()
            return r0
    }
}

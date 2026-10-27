package com.google.android.gms.common.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ApiExceptionUtil {
    public ApiExceptionUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @com.google.android.gms.common.annotation.KeepForSdk
    public static com.google.android.gms.common.api.ApiException fromStatus(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1) {
            boolean r0 = r1.hasResolution()
            if (r0 == 0) goto Lc
            com.google.android.gms.common.api.ResolvableApiException r0 = new com.google.android.gms.common.api.ResolvableApiException
            r0.<init>(r1)
            return r0
        Lc:
            com.google.android.gms.common.api.ApiException r0 = new com.google.android.gms.common.api.ApiException
            r0.<init>(r1)
            return r0
    }
}

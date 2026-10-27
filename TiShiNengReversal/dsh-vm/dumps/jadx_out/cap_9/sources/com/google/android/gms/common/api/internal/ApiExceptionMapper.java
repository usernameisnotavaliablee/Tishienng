package com.google.android.gms.common.api.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ApiExceptionMapper implements com.google.android.gms.common.api.internal.StatusExceptionMapper {
    public ApiExceptionMapper() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.google.android.gms.common.api.internal.StatusExceptionMapper
    @androidx.annotation.NonNull
    public final java.lang.Exception getException(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1) {
            r0 = this;
            com.google.android.gms.common.api.ApiException r1 = com.google.android.gms.common.internal.ApiExceptionUtil.fromStatus(r1)
            return r1
    }
}

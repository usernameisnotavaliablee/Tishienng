package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Response<T extends com.google.android.gms.common.api.Result> {
    private com.google.android.gms.common.api.Result zza;

    public Response() {
            r0 = this;
            r0.<init>()
            return
    }

    protected Response(@androidx.annotation.NonNull T r1) {
            r0 = this;
            r0.<init>()
            r0.zza = r1
            return
    }

    @androidx.annotation.NonNull
    protected T getResult() {
            r1 = this;
            com.google.android.gms.common.api.Result r0 = r1.zza
            return r0
    }

    public void setResult(@androidx.annotation.NonNull T r1) {
            r0 = this;
            r0.zza = r1
            return
    }
}

package com.google.android.gms.common.api;

import com.google.android.gms.common.api.Result;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public abstract class TransformedResult<R extends com.google.android.gms.common.api.Result> {
    public TransformedResult() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void andFinally(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultCallbacks<? super R> r1);

    @androidx.annotation.NonNull
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    public abstract <S extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.TransformedResult<S> then(@androidx.annotation.NonNull com.google.android.gms.common.api.ResultTransform<? super R, ? extends S> r1);
}

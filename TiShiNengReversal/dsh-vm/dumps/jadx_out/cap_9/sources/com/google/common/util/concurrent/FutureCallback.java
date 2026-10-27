package com.google.common.util.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface FutureCallback<V> {
    void onFailure(java.lang.Throwable r1);

    void onSuccess(@org.checkerframework.checker.nullness.compatqual.NullableDecl V r1);
}

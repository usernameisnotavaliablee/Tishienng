package com.google.common.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class RemovalListeners {


    private RemovalListeners() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <K, V> com.google.common.cache.RemovalListener<K, V> asynchronous(com.google.common.cache.RemovalListener<K, V> r1, java.util.concurrent.Executor r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.cache.RemovalListeners$1 r0 = new com.google.common.cache.RemovalListeners$1
            r0.<init>(r2, r1)
            return r0
    }
}

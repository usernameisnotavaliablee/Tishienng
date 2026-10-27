package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class DelegateFactory<T> implements com.google.android.datatransport.runtime.dagger.internal.Factory<T> {
    private javax.inject.Provider<T> delegate;

    public DelegateFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <T> void setDelegate(javax.inject.Provider<T> r1, javax.inject.Provider<T> r2) {
            com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r2)
            com.google.android.datatransport.runtime.dagger.internal.DelegateFactory r1 = (com.google.android.datatransport.runtime.dagger.internal.DelegateFactory) r1
            javax.inject.Provider<T> r0 = r1.delegate
            if (r0 != 0) goto Lc
            r1.delegate = r2
            return
        Lc:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    public T get() {
            r1 = this;
            javax.inject.Provider<T> r0 = r1.delegate
            if (r0 == 0) goto L9
            java.lang.Object r0 = r0.get()
            return r0
        L9:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
    }

    javax.inject.Provider<T> getDelegate() {
            r1 = this;
            javax.inject.Provider<T> r0 = r1.delegate
            java.lang.Object r0 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r0)
            javax.inject.Provider r0 = (javax.inject.Provider) r0
            return r0
    }

    @java.lang.Deprecated
    public void setDelegatedProvider(javax.inject.Provider<T> r1) {
            r0 = this;
            setDelegate(r0, r1)
            return
    }
}

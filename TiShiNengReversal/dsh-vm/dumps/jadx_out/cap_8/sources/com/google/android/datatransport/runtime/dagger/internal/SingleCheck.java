package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class SingleCheck<T> implements javax.inject.Provider<T> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.lang.Object UNINITIALIZED = null;
    private volatile java.lang.Object instance;
    private volatile javax.inject.Provider<T> provider;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.google.android.datatransport.runtime.dagger.internal.SingleCheck.UNINITIALIZED = r0
            return
    }

    private SingleCheck(javax.inject.Provider<T> r2) {
            r1 = this;
            r1.<init>()
            java.lang.Object r0 = com.google.android.datatransport.runtime.dagger.internal.SingleCheck.UNINITIALIZED
            r1.instance = r0
            r1.provider = r2
            return
    }

    public static <P extends javax.inject.Provider<T>, T> javax.inject.Provider<T> provider(P r1) {
            boolean r0 = r1 instanceof com.google.android.datatransport.runtime.dagger.internal.SingleCheck
            if (r0 != 0) goto L15
            boolean r0 = r1 instanceof com.google.android.datatransport.runtime.dagger.internal.DoubleCheck
            if (r0 == 0) goto L9
            return r1
        L9:
            com.google.android.datatransport.runtime.dagger.internal.SingleCheck r0 = new com.google.android.datatransport.runtime.dagger.internal.SingleCheck
            java.lang.Object r1 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r1)
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            r0.<init>(r1)
            return r0
        L15:
            return r1
    }

    public T get() {
            r2 = this;
            java.lang.Object r0 = r2.instance
            java.lang.Object r1 = com.google.android.datatransport.runtime.dagger.internal.SingleCheck.UNINITIALIZED
            if (r0 != r1) goto L16
            javax.inject.Provider<T> r0 = r2.provider
            if (r0 != 0) goto Ld
            java.lang.Object r0 = r2.instance
            return r0
        Ld:
            java.lang.Object r0 = r0.get()
            r2.instance = r0
            r1 = 0
            r2.provider = r1
        L16:
            return r0
    }
}

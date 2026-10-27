package com.google.android.datatransport.runtime.dagger.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class ProviderOfLazy<T> implements javax.inject.Provider<com.google.android.datatransport.runtime.dagger.Lazy<T>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final javax.inject.Provider<T> provider;

    static {
            return
    }

    private ProviderOfLazy(javax.inject.Provider<T> r1) {
            r0 = this;
            r0.<init>()
            r0.provider = r1
            return
    }

    public static <T> javax.inject.Provider<com.google.android.datatransport.runtime.dagger.Lazy<T>> create(javax.inject.Provider<T> r1) {
            com.google.android.datatransport.runtime.dagger.internal.ProviderOfLazy r0 = new com.google.android.datatransport.runtime.dagger.internal.ProviderOfLazy
            java.lang.Object r1 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r1)
            javax.inject.Provider r1 = (javax.inject.Provider) r1
            r0.<init>(r1)
            return r0
    }

    public com.google.android.datatransport.runtime.dagger.Lazy<T> get() {
            r1 = this;
            javax.inject.Provider<T> r0 = r1.provider
            com.google.android.datatransport.runtime.dagger.Lazy r0 = com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.lazy(r0)
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m50get() {
            r1 = this;
            com.google.android.datatransport.runtime.dagger.Lazy r0 = r1.get()
            return r0
    }
}

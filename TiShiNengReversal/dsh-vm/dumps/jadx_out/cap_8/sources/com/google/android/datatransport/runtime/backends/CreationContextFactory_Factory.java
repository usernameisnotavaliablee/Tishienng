package com.google.android.datatransport.runtime.backends;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class CreationContextFactory_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.backends.CreationContextFactory> {
    private final javax.inject.Provider<android.content.Context> applicationContextProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> monotonicClockProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> wallClockProvider;

    public CreationContextFactory_Factory(javax.inject.Provider<android.content.Context> r1, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r2, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r3) {
            r0 = this;
            r0.<init>()
            r0.applicationContextProvider = r1
            r0.wallClockProvider = r2
            r0.monotonicClockProvider = r3
            return
    }

    public static com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory create(javax.inject.Provider<android.content.Context> r1, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r2, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r3) {
            com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory r0 = new com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static com.google.android.datatransport.runtime.backends.CreationContextFactory newInstance(android.content.Context r1, com.google.android.datatransport.runtime.time.Clock r2, com.google.android.datatransport.runtime.time.Clock r3) {
            com.google.android.datatransport.runtime.backends.CreationContextFactory r0 = new com.google.android.datatransport.runtime.backends.CreationContextFactory
            r0.<init>(r1, r2, r3)
            return r0
    }

    public com.google.android.datatransport.runtime.backends.CreationContextFactory get() {
            r3 = this;
            javax.inject.Provider<android.content.Context> r0 = r3.applicationContextProvider
            java.lang.Object r0 = r0.get()
            android.content.Context r0 = (android.content.Context) r0
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1 = r3.wallClockProvider
            java.lang.Object r1 = r1.get()
            com.google.android.datatransport.runtime.time.Clock r1 = (com.google.android.datatransport.runtime.time.Clock) r1
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r2 = r3.monotonicClockProvider
            java.lang.Object r2 = r2.get()
            com.google.android.datatransport.runtime.time.Clock r2 = (com.google.android.datatransport.runtime.time.Clock) r2
            com.google.android.datatransport.runtime.backends.CreationContextFactory r0 = newInstance(r0, r1, r2)
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m47get() {
            r1 = this;
            com.google.android.datatransport.runtime.backends.CreationContextFactory r0 = r1.get()
            return r0
    }
}

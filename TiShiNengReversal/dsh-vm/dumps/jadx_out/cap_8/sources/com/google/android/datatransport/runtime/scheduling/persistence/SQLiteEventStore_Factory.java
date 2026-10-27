package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class SQLiteEventStore_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> clockProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> configProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> schemaManagerProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> wallClockProvider;

    public SQLiteEventStore_Factory(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> r3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> r4) {
            r0 = this;
            r0.<init>()
            r0.wallClockProvider = r1
            r0.clockProvider = r2
            r0.configProvider = r3
            r0.schemaManagerProvider = r4
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory create(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> r3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> r4) {
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore newInstance(com.google.android.datatransport.runtime.time.Clock r1, com.google.android.datatransport.runtime.time.Clock r2, java.lang.Object r3, java.lang.Object r4) {
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r3 = (com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig) r3
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager r4 = (com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager) r4
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore get() {
            r4 = this;
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r0 = r4.wallClockProvider
            java.lang.Object r0 = r0.get()
            com.google.android.datatransport.runtime.time.Clock r0 = (com.google.android.datatransport.runtime.time.Clock) r0
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1 = r4.clockProvider
            java.lang.Object r1 = r1.get()
            com.google.android.datatransport.runtime.time.Clock r1 = (com.google.android.datatransport.runtime.time.Clock) r1
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig> r2 = r4.configProvider
            java.lang.Object r2 = r2.get()
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager> r3 = r4.schemaManagerProvider
            java.lang.Object r3 = r3.get()
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0 = newInstance(r0, r1, r2, r3)
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m60get() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r0 = r1.get()
            return r0
    }
}

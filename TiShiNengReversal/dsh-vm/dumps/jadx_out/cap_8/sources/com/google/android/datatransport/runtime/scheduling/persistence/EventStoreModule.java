package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class EventStoreModule {
    public EventStoreModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    @javax.inject.Named("SQLITE_DB_NAME")
    static java.lang.String dbName() {
            java.lang.String r0 = "com.google.android.datatransport.events"
            return r0
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    @javax.inject.Named("SCHEMA_VERSION")
    static int schemaVersion() {
            int r0 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.SCHEMA_VERSION
            return r0
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig storeConfig() {
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreConfig.DEFAULT
            return r0
    }

    @com.google.android.datatransport.runtime.dagger.Binds
    abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r1);

    @com.google.android.datatransport.runtime.dagger.Binds
    abstract com.google.android.datatransport.runtime.synchronization.SynchronizationGuard synchronizationGuard(com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore r1);
}

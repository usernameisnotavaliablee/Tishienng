package com.google.android.datatransport.runtime;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final class DaggerTransportRuntimeComponent extends com.google.android.datatransport.runtime.TransportRuntimeComponent {
    private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> configProvider;
    private javax.inject.Provider creationContextFactoryProvider;
    private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.DefaultScheduler> defaultSchedulerProvider;
    private javax.inject.Provider<java.util.concurrent.Executor> executorProvider;
    private javax.inject.Provider metadataBackendRegistryProvider;
    private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> sQLiteEventStoreProvider;
    private javax.inject.Provider schemaManagerProvider;
    private javax.inject.Provider<android.content.Context> setApplicationContextProvider;
    private javax.inject.Provider<com.google.android.datatransport.runtime.TransportRuntime> transportRuntimeProvider;
    private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> uploaderProvider;
    private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> workInitializerProvider;
    private javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> workSchedulerProvider;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class Builder implements com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder {
        private android.content.Context setApplicationContext;

        private Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ Builder(com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public com.google.android.datatransport.runtime.TransportRuntimeComponent build() {
                r3 = this;
                android.content.Context r0 = r3.setApplicationContext
                java.lang.Class<android.content.Context> r1 = android.content.Context.class
                com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkBuilderRequirement(r0, r1)
                com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent r0 = new com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent
                android.content.Context r1 = r3.setApplicationContext
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent.Builder setApplicationContext(android.content.Context r1) {
                r0 = this;
                java.lang.Object r1 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r1)
                android.content.Context r1 = (android.content.Context) r1
                r0.setApplicationContext = r1
                return r0
        }

        @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder
        public /* bridge */ /* synthetic */ com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder setApplicationContext(android.content.Context r1) {
                r0 = this;
                com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent$Builder r1 = r0.setApplicationContext(r1)
                return r1
        }
    }

    private DaggerTransportRuntimeComponent(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.initialize(r1)
            return
    }

    /* synthetic */ DaggerTransportRuntimeComponent(android.content.Context r1, com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public static com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder builder() {
            com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent$Builder r0 = new com.google.android.datatransport.runtime.DaggerTransportRuntimeComponent$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    private void initialize(android.content.Context r8) {
            r7 = this;
            com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory r0 = com.google.android.datatransport.runtime.ExecutionModule_ExecutorFactory.create()
            javax.inject.Provider r0 = com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.provider(r0)
            r7.executorProvider = r0
            com.google.android.datatransport.runtime.dagger.internal.Factory r8 = com.google.android.datatransport.runtime.dagger.internal.InstanceFactory.create(r8)
            r7.setApplicationContextProvider = r8
            com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory r0 = com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create()
            com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory r1 = com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.create()
            com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory r8 = com.google.android.datatransport.runtime.backends.CreationContextFactory_Factory.create(r8, r0, r1)
            r7.creationContextFactoryProvider = r8
            javax.inject.Provider<android.content.Context> r0 = r7.setApplicationContextProvider
            com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory r8 = com.google.android.datatransport.runtime.backends.MetadataBackendRegistry_Factory.create(r0, r8)
            javax.inject.Provider r8 = com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.provider(r8)
            r7.metadataBackendRegistryProvider = r8
            javax.inject.Provider<android.content.Context> r8 = r7.setApplicationContextProvider
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory r0 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_DbNameFactory.create()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory r1 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_SchemaVersionFactory.create()
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory r8 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager_Factory.create(r8, r0, r1)
            r7.schemaManagerProvider = r8
            com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory r8 = com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create()
            com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory r0 = com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.create()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory r1 = com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule_StoreConfigFactory.create()
            javax.inject.Provider r2 = r7.schemaManagerProvider
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory r8 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore_Factory.create(r8, r0, r1, r2)
            javax.inject.Provider r8 = com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.provider(r8)
            r7.sQLiteEventStoreProvider = r8
            com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory r8 = com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create()
            com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory r8 = com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory.create(r8)
            r7.configProvider = r8
            javax.inject.Provider<android.content.Context> r0 = r7.setApplicationContextProvider
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> r1 = r7.sQLiteEventStoreProvider
            com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory r2 = com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.create()
            com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory r8 = com.google.android.datatransport.runtime.scheduling.SchedulingModule_WorkSchedulerFactory.create(r0, r1, r8, r2)
            r7.workSchedulerProvider = r8
            javax.inject.Provider<java.util.concurrent.Executor> r0 = r7.executorProvider
            javax.inject.Provider r1 = r7.metadataBackendRegistryProvider
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> r2 = r7.sQLiteEventStoreProvider
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory r8 = com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory.create(r0, r1, r8, r2, r2)
            r7.defaultSchedulerProvider = r8
            javax.inject.Provider<android.content.Context> r0 = r7.setApplicationContextProvider
            javax.inject.Provider r1 = r7.metadataBackendRegistryProvider
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> r2 = r7.sQLiteEventStoreProvider
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r3 = r7.workSchedulerProvider
            javax.inject.Provider<java.util.concurrent.Executor> r4 = r7.executorProvider
            com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory r6 = com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create()
            r5 = r2
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory r8 = com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory.create(r0, r1, r2, r3, r4, r5, r6)
            r7.uploaderProvider = r8
            javax.inject.Provider<java.util.concurrent.Executor> r8 = r7.executorProvider
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> r0 = r7.sQLiteEventStoreProvider
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r1 = r7.workSchedulerProvider
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory r8 = com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer_Factory.create(r8, r0, r1, r0)
            r7.workInitializerProvider = r8
            com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory r8 = com.google.android.datatransport.runtime.time.TimeModule_EventClockFactory.create()
            com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory r0 = com.google.android.datatransport.runtime.time.TimeModule_UptimeClockFactory.create()
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.DefaultScheduler> r1 = r7.defaultSchedulerProvider
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> r2 = r7.uploaderProvider
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> r3 = r7.workInitializerProvider
            com.google.android.datatransport.runtime.TransportRuntime_Factory r8 = com.google.android.datatransport.runtime.TransportRuntime_Factory.create(r8, r0, r1, r2, r3)
            javax.inject.Provider r8 = com.google.android.datatransport.runtime.dagger.internal.DoubleCheck.provider(r8)
            r7.transportRuntimeProvider = r8
            return
    }

    @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
    com.google.android.datatransport.runtime.scheduling.persistence.EventStore getEventStore() {
            r1 = this;
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore> r0 = r1.sQLiteEventStoreProvider
            java.lang.Object r0 = r0.get()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = (com.google.android.datatransport.runtime.scheduling.persistence.EventStore) r0
            return r0
    }

    @Override // com.google.android.datatransport.runtime.TransportRuntimeComponent
    com.google.android.datatransport.runtime.TransportRuntime getTransportRuntime() {
            r1 = this;
            javax.inject.Provider<com.google.android.datatransport.runtime.TransportRuntime> r0 = r1.transportRuntimeProvider
            java.lang.Object r0 = r0.get()
            com.google.android.datatransport.runtime.TransportRuntime r0 = (com.google.android.datatransport.runtime.TransportRuntime) r0
            return r0
    }
}

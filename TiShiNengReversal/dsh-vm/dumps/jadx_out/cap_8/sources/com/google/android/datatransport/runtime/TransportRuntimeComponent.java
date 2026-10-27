package com.google.android.datatransport.runtime;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@javax.inject.Singleton
@com.google.android.datatransport.runtime.dagger.Component(modules = {com.google.android.datatransport.runtime.backends.BackendRegistryModule.class, com.google.android.datatransport.runtime.scheduling.persistence.EventStoreModule.class, com.google.android.datatransport.runtime.ExecutionModule.class, com.google.android.datatransport.runtime.scheduling.SchedulingModule.class, com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule.class, com.google.android.datatransport.runtime.time.TimeModule.class})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
abstract class TransportRuntimeComponent implements java.io.Closeable {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.datatransport.runtime.dagger.Component.Builder
    interface Builder {
        com.google.android.datatransport.runtime.TransportRuntimeComponent build();

        @com.google.android.datatransport.runtime.dagger.BindsInstance
        com.google.android.datatransport.runtime.TransportRuntimeComponent.Builder setApplicationContext(android.content.Context r1);
    }

    TransportRuntimeComponent() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = r1.getEventStore()
            r0.close()
            return
    }

    abstract com.google.android.datatransport.runtime.scheduling.persistence.EventStore getEventStore();

    abstract com.google.android.datatransport.runtime.TransportRuntime getTransportRuntime();
}

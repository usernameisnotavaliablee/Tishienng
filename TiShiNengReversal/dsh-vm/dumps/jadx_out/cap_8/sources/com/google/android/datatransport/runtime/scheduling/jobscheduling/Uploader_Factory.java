package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Uploader_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> backendRegistryProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> clockProvider;
    private final javax.inject.Provider<android.content.Context> contextProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> eventStoreProvider;
    private final javax.inject.Provider<java.util.concurrent.Executor> executorProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> guardProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> workSchedulerProvider;

    public Uploader_Factory(javax.inject.Provider<android.content.Context> r1, javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> r2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r4, javax.inject.Provider<java.util.concurrent.Executor> r5, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r6, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r7) {
            r0 = this;
            r0.<init>()
            r0.contextProvider = r1
            r0.backendRegistryProvider = r2
            r0.eventStoreProvider = r3
            r0.workSchedulerProvider = r4
            r0.executorProvider = r5
            r0.guardProvider = r6
            r0.clockProvider = r7
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory create(javax.inject.Provider<android.content.Context> r8, javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> r9, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r10, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r11, javax.inject.Provider<java.util.concurrent.Executor> r12, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r13, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r14) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader_Factory
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader newInstance(android.content.Context r8, com.google.android.datatransport.runtime.backends.BackendRegistry r9, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r10, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r11, java.util.concurrent.Executor r12, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r13, com.google.android.datatransport.runtime.time.Clock r14) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    public com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader get() {
            r8 = this;
            javax.inject.Provider<android.content.Context> r0 = r8.contextProvider
            java.lang.Object r0 = r0.get()
            r1 = r0
            android.content.Context r1 = (android.content.Context) r1
            javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> r0 = r8.backendRegistryProvider
            java.lang.Object r0 = r0.get()
            r2 = r0
            com.google.android.datatransport.runtime.backends.BackendRegistry r2 = (com.google.android.datatransport.runtime.backends.BackendRegistry) r2
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r0 = r8.eventStoreProvider
            java.lang.Object r0 = r0.get()
            r3 = r0
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r3 = (com.google.android.datatransport.runtime.scheduling.persistence.EventStore) r3
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r0 = r8.workSchedulerProvider
            java.lang.Object r0 = r0.get()
            r4 = r0
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r4 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler) r4
            javax.inject.Provider<java.util.concurrent.Executor> r0 = r8.executorProvider
            java.lang.Object r0 = r0.get()
            r5 = r0
            java.util.concurrent.Executor r5 = (java.util.concurrent.Executor) r5
            javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r0 = r8.guardProvider
            java.lang.Object r0 = r0.get()
            r6 = r0
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r6 = (com.google.android.datatransport.runtime.synchronization.SynchronizationGuard) r6
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r0 = r8.clockProvider
            java.lang.Object r0 = r0.get()
            r7 = r0
            com.google.android.datatransport.runtime.time.Clock r7 = (com.google.android.datatransport.runtime.time.Clock) r7
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0 = newInstance(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m55get() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0 = r1.get()
            return r0
    }
}

package com.google.android.datatransport.runtime.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class DefaultScheduler_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.DefaultScheduler> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> backendRegistryProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> eventStoreProvider;
    private final javax.inject.Provider<java.util.concurrent.Executor> executorProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> guardProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> workSchedulerProvider;

    public DefaultScheduler_Factory(javax.inject.Provider<java.util.concurrent.Executor> r1, javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> r2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r4, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r5) {
            r0 = this;
            r0.<init>()
            r0.executorProvider = r1
            r0.backendRegistryProvider = r2
            r0.workSchedulerProvider = r3
            r0.eventStoreProvider = r4
            r0.guardProvider = r5
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory create(javax.inject.Provider<java.util.concurrent.Executor> r6, javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> r7, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r8, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r9, javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r10) {
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory r0 = new com.google.android.datatransport.runtime.scheduling.DefaultScheduler_Factory
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.google.android.datatransport.runtime.scheduling.DefaultScheduler newInstance(java.util.concurrent.Executor r6, com.google.android.datatransport.runtime.backends.BackendRegistry r7, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r8, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r9, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r10) {
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler r0 = new com.google.android.datatransport.runtime.scheduling.DefaultScheduler
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public com.google.android.datatransport.runtime.scheduling.DefaultScheduler get() {
            r5 = this;
            javax.inject.Provider<java.util.concurrent.Executor> r0 = r5.executorProvider
            java.lang.Object r0 = r0.get()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            javax.inject.Provider<com.google.android.datatransport.runtime.backends.BackendRegistry> r1 = r5.backendRegistryProvider
            java.lang.Object r1 = r1.get()
            com.google.android.datatransport.runtime.backends.BackendRegistry r1 = (com.google.android.datatransport.runtime.backends.BackendRegistry) r1
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler> r2 = r5.workSchedulerProvider
            java.lang.Object r2 = r2.get()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r2 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler) r2
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.persistence.EventStore> r3 = r5.eventStoreProvider
            java.lang.Object r3 = r3.get()
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r3 = (com.google.android.datatransport.runtime.scheduling.persistence.EventStore) r3
            javax.inject.Provider<com.google.android.datatransport.runtime.synchronization.SynchronizationGuard> r4 = r5.guardProvider
            java.lang.Object r4 = r4.get()
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r4 = (com.google.android.datatransport.runtime.synchronization.SynchronizationGuard) r4
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler r0 = newInstance(r0, r1, r2, r3, r4)
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m52get() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler r0 = r1.get()
            return r0
    }
}

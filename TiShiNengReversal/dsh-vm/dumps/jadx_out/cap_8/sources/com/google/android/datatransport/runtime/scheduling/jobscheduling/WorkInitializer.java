package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class WorkInitializer {
    private final java.util.concurrent.Executor executor;
    private final com.google.android.datatransport.runtime.synchronization.SynchronizationGuard guard;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler scheduler;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore store;

    @javax.inject.Inject
    WorkInitializer(java.util.concurrent.Executor r1, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r2, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r3, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r4) {
            r0 = this;
            r0.<init>()
            r0.executor = r1
            r0.store = r2
            r0.scheduler = r3
            r0.guard = r4
            return
    }

    static /* synthetic */ java.lang.Object lambda$ensureContextsScheduled$0(com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r4) {
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = r4.store
            java.lang.Iterable r0 = r0.loadActiveContexts()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r0.next()
            com.google.android.datatransport.runtime.TransportContext r1 = (com.google.android.datatransport.runtime.TransportContext) r1
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r2 = r4.scheduler
            r3 = 1
            r2.schedule(r1, r3)
            goto La
        L1d:
            r4 = 0
            return r4
    }

    static /* synthetic */ void lambda$ensureContextsScheduled$1(com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r1) {
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r1.guard
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$Lambda$2.lambdaFactory$(r1)
            r0.runCriticalSection(r1)
            return
    }

    public void ensureContextsScheduled() {
            r2 = this;
            java.util.concurrent.Executor r0 = r2.executor
            java.lang.Runnable r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$Lambda$1.lambdaFactory$(r2)
            r0.execute(r1)
            return
    }
}

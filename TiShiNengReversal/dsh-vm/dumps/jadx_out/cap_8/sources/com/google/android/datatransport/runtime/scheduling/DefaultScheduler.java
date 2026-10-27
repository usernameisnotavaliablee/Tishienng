package com.google.android.datatransport.runtime.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class DefaultScheduler implements com.google.android.datatransport.runtime.scheduling.Scheduler {
    private static final java.util.logging.Logger LOGGER = null;
    private final com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;
    private final java.util.concurrent.Executor executor;
    private final com.google.android.datatransport.runtime.synchronization.SynchronizationGuard guard;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler;

    static {
            java.lang.Class<com.google.android.datatransport.runtime.TransportRuntime> r0 = com.google.android.datatransport.runtime.TransportRuntime.class
            java.lang.String r0 = r0.getName()
            java.util.logging.Logger r0 = java.util.logging.Logger.getLogger(r0)
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler.LOGGER = r0
            return
    }

    @javax.inject.Inject
    public DefaultScheduler(java.util.concurrent.Executor r1, com.google.android.datatransport.runtime.backends.BackendRegistry r2, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r3, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r4, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r5) {
            r0 = this;
            r0.<init>()
            r0.executor = r1
            r0.backendRegistry = r2
            r0.workScheduler = r3
            r0.eventStore = r4
            r0.guard = r5
            return
    }

    static /* synthetic */ java.lang.Object lambda$schedule$0(com.google.android.datatransport.runtime.scheduling.DefaultScheduler r1, com.google.android.datatransport.runtime.TransportContext r2, com.google.android.datatransport.runtime.EventInternal r3) {
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = r1.eventStore
            r0.persist(r2, r3)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r1 = r1.workScheduler
            r3 = 1
            r1.schedule(r2, r3)
            r1 = 0
            return r1
    }

    static /* synthetic */ void lambda$schedule$1(com.google.android.datatransport.runtime.scheduling.DefaultScheduler r2, com.google.android.datatransport.runtime.TransportContext r3, com.google.android.datatransport.TransportScheduleCallback r4, com.google.android.datatransport.runtime.EventInternal r5) {
            com.google.android.datatransport.runtime.backends.BackendRegistry r0 = r2.backendRegistry     // Catch: java.lang.Exception -> L2a
            java.lang.String r1 = r3.getBackendName()     // Catch: java.lang.Exception -> L2a
            com.google.android.datatransport.runtime.backends.TransportBackend r0 = r0.get(r1)     // Catch: java.lang.Exception -> L2a
            if (r0 != 0) goto L2c
            java.lang.String r2 = "Transport backend '%s' is not registered"
            java.lang.String r3 = r3.getBackendName()     // Catch: java.lang.Exception -> L2a
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> L2a
            r0 = 0
            r5[r0] = r3     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = java.lang.String.format(r2, r5)     // Catch: java.lang.Exception -> L2a
            java.util.logging.Logger r3 = com.google.android.datatransport.runtime.scheduling.DefaultScheduler.LOGGER     // Catch: java.lang.Exception -> L2a
            r3.warning(r2)     // Catch: java.lang.Exception -> L2a
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch: java.lang.Exception -> L2a
            r3.<init>(r2)     // Catch: java.lang.Exception -> L2a
            r4.onSchedule(r3)     // Catch: java.lang.Exception -> L2a
            return
        L2a:
            r2 = move-exception
            goto L3e
        L2c:
            com.google.android.datatransport.runtime.EventInternal r5 = r0.decorate(r5)     // Catch: java.lang.Exception -> L2a
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r2.guard     // Catch: java.lang.Exception -> L2a
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection r2 = com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$Lambda$2.lambdaFactory$(r2, r3, r5)     // Catch: java.lang.Exception -> L2a
            r0.runCriticalSection(r2)     // Catch: java.lang.Exception -> L2a
            r2 = 0
            r4.onSchedule(r2)     // Catch: java.lang.Exception -> L2a
            return
        L3e:
            java.util.logging.Logger r3 = com.google.android.datatransport.runtime.scheduling.DefaultScheduler.LOGGER
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Error scheduling event "
            r5.append(r0)
            java.lang.String r0 = r2.getMessage()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            r3.warning(r5)
            r4.onSchedule(r2)
            return
    }

    @Override // com.google.android.datatransport.runtime.scheduling.Scheduler
    public void schedule(com.google.android.datatransport.runtime.TransportContext r2, com.google.android.datatransport.runtime.EventInternal r3, com.google.android.datatransport.TransportScheduleCallback r4) {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.executor
            java.lang.Runnable r2 = com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$Lambda$1.lambdaFactory$(r1, r2, r4, r3)
            r0.execute(r2)
            return
    }
}

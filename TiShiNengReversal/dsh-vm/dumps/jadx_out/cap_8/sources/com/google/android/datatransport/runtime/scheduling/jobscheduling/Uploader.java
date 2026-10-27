package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class Uploader {
    private static final java.lang.String LOG_TAG = "Uploader";
    private final com.google.android.datatransport.runtime.backends.BackendRegistry backendRegistry;
    private final com.google.android.datatransport.runtime.time.Clock clock;
    private final android.content.Context context;
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore eventStore;
    private final java.util.concurrent.Executor executor;
    private final com.google.android.datatransport.runtime.synchronization.SynchronizationGuard guard;
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler;

    @javax.inject.Inject
    public Uploader(android.content.Context r1, com.google.android.datatransport.runtime.backends.BackendRegistry r2, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r3, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r4, java.util.concurrent.Executor r5, com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r6, @com.google.android.datatransport.runtime.time.WallTime com.google.android.datatransport.runtime.time.Clock r7) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.backendRegistry = r2
            r0.eventStore = r3
            r0.workScheduler = r4
            r0.executor = r5
            r0.guard = r6
            r0.clock = r7
            return
    }

    static /* synthetic */ java.lang.Iterable lambda$logAndUpdateState$2(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0, com.google.android.datatransport.runtime.TransportContext r1) {
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = r0.eventStore
            java.lang.Iterable r0 = r0.loadBatch(r1)
            return r0
    }

    static /* synthetic */ java.lang.Object lambda$logAndUpdateState$3(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r5, com.google.android.datatransport.runtime.backends.BackendResponse r6, java.lang.Iterable r7, com.google.android.datatransport.runtime.TransportContext r8, int r9) {
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r0 = r6.getStatus()
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r1 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.TRANSIENT_ERROR
            r2 = 1
            if (r0 != r1) goto L15
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r6 = r5.eventStore
            r6.recordFailure(r7)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r5 = r5.workScheduler
            int r9 = r9 + r2
            r5.schedule(r8, r9)
            goto L3f
        L15:
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r9 = r5.eventStore
            r9.recordSuccess(r7)
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r7 = r6.getStatus()
            com.google.android.datatransport.runtime.backends.BackendResponse$Status r9 = com.google.android.datatransport.runtime.backends.BackendResponse.Status.OK
            if (r7 != r9) goto L32
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r7 = r5.eventStore
            com.google.android.datatransport.runtime.time.Clock r9 = r5.clock
            long r0 = r9.getTime()
            long r3 = r6.getNextRequestWaitMillis()
            long r0 = r0 + r3
            r7.recordNextCallTime(r8, r0)
        L32:
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r6 = r5.eventStore
            boolean r6 = r6.hasPendingEventsFor(r8)
            if (r6 == 0) goto L3f
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r5 = r5.workScheduler
            r5.schedule(r8, r2, r2)
        L3f:
            r5 = 0
            return r5
    }

    static /* synthetic */ java.lang.Object lambda$upload$0(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0, com.google.android.datatransport.runtime.TransportContext r1, int r2) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r0 = r0.workScheduler
            int r2 = r2 + 1
            r0.schedule(r1, r2)
            r0 = 0
            return r0
    }

    static /* synthetic */ void lambda$upload$1(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r2, com.google.android.datatransport.runtime.TransportContext r3, int r4, java.lang.Runnable r5) {
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r2.guard     // Catch: java.lang.Throwable -> L1e com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L27
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r1 = r2.eventStore     // Catch: java.lang.Throwable -> L1e com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L27
            r1.getClass()     // Catch: java.lang.Throwable -> L1e com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L27
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$4.lambdaFactory$(r1)     // Catch: java.lang.Throwable -> L1e com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L27
            r0.runCriticalSection(r1)     // Catch: java.lang.Throwable -> L1e com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L27
            boolean r0 = r2.isNetworkAvailable()     // Catch: java.lang.Throwable -> L1e com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L27
            if (r0 != 0) goto L20
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r0 = r2.guard     // Catch: java.lang.Throwable -> L1e com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L27
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection r1 = com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$5.lambdaFactory$(r2, r3, r4)     // Catch: java.lang.Throwable -> L1e com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L27
            r0.runCriticalSection(r1)     // Catch: java.lang.Throwable -> L1e com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L27
            goto L23
        L1e:
            r2 = move-exception
            goto L32
        L20:
            r2.logAndUpdateState(r3, r4)     // Catch: java.lang.Throwable -> L1e com.google.android.datatransport.runtime.synchronization.SynchronizationException -> L27
        L23:
            r5.run()
            return
        L27:
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler r2 = r2.workScheduler     // Catch: java.lang.Throwable -> L1e
            int r4 = r4 + 1
            r2.schedule(r3, r4)     // Catch: java.lang.Throwable -> L1e
            r5.run()
            return
        L32:
            r5.run()
            throw r2
    }

    boolean isNetworkAvailable() {
            r2 = this;
            android.content.Context r0 = r2.context
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L18
            boolean r0 = r0.isConnected()
            if (r0 == 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    void logAndUpdateState(com.google.android.datatransport.runtime.TransportContext r6, int r7) {
            r5 = this;
            com.google.android.datatransport.runtime.backends.BackendRegistry r0 = r5.backendRegistry
            java.lang.String r1 = r6.getBackendName()
            com.google.android.datatransport.runtime.backends.TransportBackend r0 = r0.get(r1)
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r1 = r5.guard
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection r2 = com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$2.lambdaFactory$(r5, r6)
            java.lang.Object r1 = r1.runCriticalSection(r2)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r2 = r1.iterator()
            boolean r2 = r2.hasNext()
            if (r2 != 0) goto L21
            return
        L21:
            if (r0 != 0) goto L2f
            java.lang.String r0 = "Uploader"
            java.lang.String r2 = "Unknown backend for %s, deleting event batch for it..."
            com.google.android.datatransport.runtime.logging.Logging.d(r0, r2, r6)
            com.google.android.datatransport.runtime.backends.BackendResponse r0 = com.google.android.datatransport.runtime.backends.BackendResponse.fatalError()
            goto L64
        L2f:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r1.iterator()
        L38:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L4c
            java.lang.Object r4 = r3.next()
            com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent r4 = (com.google.android.datatransport.runtime.scheduling.persistence.PersistedEvent) r4
            com.google.android.datatransport.runtime.EventInternal r4 = r4.getEvent()
            r2.add(r4)
            goto L38
        L4c:
            com.google.android.datatransport.runtime.backends.BackendRequest$Builder r3 = com.google.android.datatransport.runtime.backends.BackendRequest.builder()
            com.google.android.datatransport.runtime.backends.BackendRequest$Builder r2 = r3.setEvents(r2)
            byte[] r3 = r6.getExtras()
            com.google.android.datatransport.runtime.backends.BackendRequest$Builder r2 = r2.setExtras(r3)
            com.google.android.datatransport.runtime.backends.BackendRequest r2 = r2.build()
            com.google.android.datatransport.runtime.backends.BackendResponse r0 = r0.send(r2)
        L64:
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard r2 = r5.guard
            com.google.android.datatransport.runtime.synchronization.SynchronizationGuard$CriticalSection r6 = com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$3.lambdaFactory$(r5, r0, r1, r6, r7)
            r2.runCriticalSection(r6)
            return
    }

    public void upload(com.google.android.datatransport.runtime.TransportContext r2, int r3, java.lang.Runnable r4) {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.executor
            java.lang.Runnable r2 = com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$1.lambdaFactory$(r1, r2, r3, r4)
            r0.execute(r2)
            return
    }
}

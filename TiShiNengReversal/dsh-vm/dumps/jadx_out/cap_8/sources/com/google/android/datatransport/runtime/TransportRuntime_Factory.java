package com.google.android.datatransport.runtime;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class TransportRuntime_Factory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.TransportRuntime> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> eventClockProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> initializerProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.Scheduler> schedulerProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> uploaderProvider;
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> uptimeClockProvider;

    public TransportRuntime_Factory(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r2, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.Scheduler> r3, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> r4, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> r5) {
            r0 = this;
            r0.<init>()
            r0.eventClockProvider = r1
            r0.uptimeClockProvider = r2
            r0.schedulerProvider = r3
            r0.uploaderProvider = r4
            r0.initializerProvider = r5
            return
    }

    public static com.google.android.datatransport.runtime.TransportRuntime_Factory create(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r6, javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r7, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.Scheduler> r8, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> r9, javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> r10) {
            com.google.android.datatransport.runtime.TransportRuntime_Factory r0 = new com.google.android.datatransport.runtime.TransportRuntime_Factory
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public static com.google.android.datatransport.runtime.TransportRuntime newInstance(com.google.android.datatransport.runtime.time.Clock r6, com.google.android.datatransport.runtime.time.Clock r7, com.google.android.datatransport.runtime.scheduling.Scheduler r8, com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r9, com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r10) {
            com.google.android.datatransport.runtime.TransportRuntime r0 = new com.google.android.datatransport.runtime.TransportRuntime
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    public com.google.android.datatransport.runtime.TransportRuntime get() {
            r5 = this;
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r0 = r5.eventClockProvider
            java.lang.Object r0 = r0.get()
            com.google.android.datatransport.runtime.time.Clock r0 = (com.google.android.datatransport.runtime.time.Clock) r0
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1 = r5.uptimeClockProvider
            java.lang.Object r1 = r1.get()
            com.google.android.datatransport.runtime.time.Clock r1 = (com.google.android.datatransport.runtime.time.Clock) r1
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.Scheduler> r2 = r5.schedulerProvider
            java.lang.Object r2 = r2.get()
            com.google.android.datatransport.runtime.scheduling.Scheduler r2 = (com.google.android.datatransport.runtime.scheduling.Scheduler) r2
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader> r3 = r5.uploaderProvider
            java.lang.Object r3 = r3.get()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r3 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader) r3
            javax.inject.Provider<com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer> r4 = r5.initializerProvider
            java.lang.Object r4 = r4.get()
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r4 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer) r4
            com.google.android.datatransport.runtime.TransportRuntime r0 = newInstance(r0, r1, r2, r3, r4)
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m46get() {
            r1 = this;
            com.google.android.datatransport.runtime.TransportRuntime r0 = r1.get()
            return r0
    }
}

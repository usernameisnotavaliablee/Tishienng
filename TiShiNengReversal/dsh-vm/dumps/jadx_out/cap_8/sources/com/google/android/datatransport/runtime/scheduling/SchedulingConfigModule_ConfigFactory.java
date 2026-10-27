package com.google.android.datatransport.runtime.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class SchedulingConfigModule_ConfigFactory implements com.google.android.datatransport.runtime.dagger.internal.Factory<com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig> {
    private final javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> clockProvider;

    public SchedulingConfigModule_ConfigFactory(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1) {
            r0 = this;
            r0.<init>()
            r0.clockProvider = r1
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config(com.google.android.datatransport.runtime.time.Clock r1) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r1 = com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule.config(r1)
            java.lang.String r0 = "Cannot return null from a non-@Nullable @Provides method"
            java.lang.Object r1 = com.google.android.datatransport.runtime.dagger.internal.Preconditions.checkNotNull(r1, r0)
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r1 = (com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig) r1
            return r1
    }

    public static com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory create(javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r1) {
            com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory r0 = new com.google.android.datatransport.runtime.scheduling.SchedulingConfigModule_ConfigFactory
            r0.<init>(r1)
            return r0
    }

    public com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig get() {
            r1 = this;
            javax.inject.Provider<com.google.android.datatransport.runtime.time.Clock> r0 = r1.clockProvider
            java.lang.Object r0 = r0.get()
            com.google.android.datatransport.runtime.time.Clock r0 = (com.google.android.datatransport.runtime.time.Clock) r0
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r0 = config(r0)
            return r0
    }

    /* renamed from: get, reason: collision with other method in class */
    public /* bridge */ /* synthetic */ java.lang.Object m53get() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r0 = r1.get()
            return r0
    }
}

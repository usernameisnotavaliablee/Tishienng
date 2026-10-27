package com.google.android.datatransport.runtime.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class SchedulingModule {
    public SchedulingModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler workScheduler(android.content.Context r0, com.google.android.datatransport.runtime.scheduling.persistence.EventStore r1, com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r2, @com.google.android.datatransport.runtime.time.Monotonic com.google.android.datatransport.runtime.time.Clock r3) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler r3 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler
            r3.<init>(r0, r1, r2)
            return r3
    }

    @com.google.android.datatransport.runtime.dagger.Binds
    abstract com.google.android.datatransport.runtime.scheduling.Scheduler scheduler(com.google.android.datatransport.runtime.scheduling.DefaultScheduler r1);
}

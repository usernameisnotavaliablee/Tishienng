package com.google.android.datatransport.runtime.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.datatransport.runtime.dagger.Module
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class SchedulingConfigModule {
    public SchedulingConfigModule() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.android.datatransport.runtime.dagger.Provides
    static com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig config(@com.google.android.datatransport.runtime.time.WallTime com.google.android.datatransport.runtime.time.Clock r0) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig.getDefault(r0)
            return r0
    }
}

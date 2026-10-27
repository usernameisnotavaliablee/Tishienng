package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final /* synthetic */ class WorkInitializer$$Lambda$2 implements com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection {
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer arg$1;

    private WorkInitializer$$Lambda$2(com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r1) {
            r0 = this;
            r0.<init>()
            r0.arg$1 = r1
            return
    }

    public static com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection lambdaFactory$(com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r1) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$Lambda$2 r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer$$Lambda$2
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public java.lang.Object execute() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer r0 = r1.arg$1
            java.lang.Object r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkInitializer.lambda$ensureContextsScheduled$0(r0)
            return r0
    }
}

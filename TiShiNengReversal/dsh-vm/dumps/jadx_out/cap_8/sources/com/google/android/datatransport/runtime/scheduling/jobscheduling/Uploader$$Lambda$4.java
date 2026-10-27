package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final /* synthetic */ class Uploader$$Lambda$4 implements com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection {
    private final com.google.android.datatransport.runtime.scheduling.persistence.EventStore arg$1;

    private Uploader$$Lambda$4(com.google.android.datatransport.runtime.scheduling.persistence.EventStore r1) {
            r0 = this;
            r0.<init>()
            r0.arg$1 = r1
            return
    }

    public static com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection lambdaFactory$(com.google.android.datatransport.runtime.scheduling.persistence.EventStore r1) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$4 r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$4
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public java.lang.Object execute() {
            r1 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.EventStore r0 = r1.arg$1
            int r0 = r0.cleanUp()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }
}

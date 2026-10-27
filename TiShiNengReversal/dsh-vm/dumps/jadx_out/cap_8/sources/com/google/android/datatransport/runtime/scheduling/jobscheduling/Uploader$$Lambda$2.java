package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final /* synthetic */ class Uploader$$Lambda$2 implements com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection {
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader arg$1;
    private final com.google.android.datatransport.runtime.TransportContext arg$2;

    private Uploader$$Lambda$2(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r1, com.google.android.datatransport.runtime.TransportContext r2) {
            r0 = this;
            r0.<init>()
            r0.arg$1 = r1
            r0.arg$2 = r2
            return
    }

    public static com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection lambdaFactory$(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r1, com.google.android.datatransport.runtime.TransportContext r2) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$2 r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$2
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public java.lang.Object execute() {
            r2 = this;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0 = r2.arg$1
            com.google.android.datatransport.runtime.TransportContext r1 = r2.arg$2
            java.lang.Iterable r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader.lambda$logAndUpdateState$2(r0, r1)
            return r0
    }
}

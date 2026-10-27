package com.google.android.datatransport.runtime.scheduling.jobscheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final /* synthetic */ class Uploader$$Lambda$3 implements com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection {
    private final com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader arg$1;
    private final com.google.android.datatransport.runtime.backends.BackendResponse arg$2;
    private final java.lang.Iterable arg$3;
    private final com.google.android.datatransport.runtime.TransportContext arg$4;
    private final int arg$5;

    private Uploader$$Lambda$3(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r1, com.google.android.datatransport.runtime.backends.BackendResponse r2, java.lang.Iterable r3, com.google.android.datatransport.runtime.TransportContext r4, int r5) {
            r0 = this;
            r0.<init>()
            r0.arg$1 = r1
            r0.arg$2 = r2
            r0.arg$3 = r3
            r0.arg$4 = r4
            r0.arg$5 = r5
            return
    }

    public static com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection lambdaFactory$(com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r6, com.google.android.datatransport.runtime.backends.BackendResponse r7, java.lang.Iterable r8, com.google.android.datatransport.runtime.TransportContext r9, int r10) {
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$3 r0 = new com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader$$Lambda$3
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.synchronization.SynchronizationGuard.CriticalSection
    public java.lang.Object execute() {
            r5 = this;
            com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader r0 = r5.arg$1
            com.google.android.datatransport.runtime.backends.BackendResponse r1 = r5.arg$2
            java.lang.Iterable r2 = r5.arg$3
            com.google.android.datatransport.runtime.TransportContext r3 = r5.arg$4
            int r4 = r5.arg$5
            java.lang.Object r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.Uploader.lambda$logAndUpdateState$3(r0, r1, r2, r3, r4)
            return r0
    }
}

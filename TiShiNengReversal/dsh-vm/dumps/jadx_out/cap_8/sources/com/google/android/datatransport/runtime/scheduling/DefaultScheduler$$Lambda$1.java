package com.google.android.datatransport.runtime.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final /* synthetic */ class DefaultScheduler$$Lambda$1 implements java.lang.Runnable {
    private final com.google.android.datatransport.runtime.scheduling.DefaultScheduler arg$1;
    private final com.google.android.datatransport.runtime.TransportContext arg$2;
    private final com.google.android.datatransport.TransportScheduleCallback arg$3;
    private final com.google.android.datatransport.runtime.EventInternal arg$4;

    private DefaultScheduler$$Lambda$1(com.google.android.datatransport.runtime.scheduling.DefaultScheduler r1, com.google.android.datatransport.runtime.TransportContext r2, com.google.android.datatransport.TransportScheduleCallback r3, com.google.android.datatransport.runtime.EventInternal r4) {
            r0 = this;
            r0.<init>()
            r0.arg$1 = r1
            r0.arg$2 = r2
            r0.arg$3 = r3
            r0.arg$4 = r4
            return
    }

    public static java.lang.Runnable lambdaFactory$(com.google.android.datatransport.runtime.scheduling.DefaultScheduler r1, com.google.android.datatransport.runtime.TransportContext r2, com.google.android.datatransport.TransportScheduleCallback r3, com.google.android.datatransport.runtime.EventInternal r4) {
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$Lambda$1 r0 = new com.google.android.datatransport.runtime.scheduling.DefaultScheduler$$Lambda$1
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    @Override // java.lang.Runnable
    public void run() {
            r4 = this;
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler r0 = r4.arg$1
            com.google.android.datatransport.runtime.TransportContext r1 = r4.arg$2
            com.google.android.datatransport.TransportScheduleCallback r2 = r4.arg$3
            com.google.android.datatransport.runtime.EventInternal r3 = r4.arg$4
            com.google.android.datatransport.runtime.scheduling.DefaultScheduler.lambda$schedule$1(r0, r1, r2, r3)
            return
    }
}

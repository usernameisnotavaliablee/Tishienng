package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$19 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function {
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$19 instance = null;

    static {
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$19 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$19
            r0.<init>()
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$19.instance = r0
            return
    }

    private SQLiteEventStore$$Lambda$19() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function lambdaFactory$() {
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$19 r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$19.instance
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public java.lang.Object apply(java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            java.lang.Object r1 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$ensureBeginTransaction$16(r1)
            return r1
    }
}

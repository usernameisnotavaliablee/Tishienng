package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$13 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function {
    private final long arg$1;

    private SQLiteEventStore$$Lambda$13(long r1) {
            r0 = this;
            r0.<init>()
            r0.arg$1 = r1
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function lambdaFactory$(long r1) {
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$13 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$13
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public java.lang.Object apply(java.lang.Object r3) {
            r2 = this;
            long r0 = r2.arg$1
            android.database.sqlite.SQLiteDatabase r3 = (android.database.sqlite.SQLiteDatabase) r3
            java.lang.Integer r3 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$cleanUp$10(r0, r3)
            return r3
    }
}

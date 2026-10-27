package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$18 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer {
    private final android.database.sqlite.SQLiteDatabase arg$1;

    private SQLiteEventStore$$Lambda$18(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            r0.<init>()
            r0.arg$1 = r1
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer lambdaFactory$(android.database.sqlite.SQLiteDatabase r1) {
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$18 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$18
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Producer
    public java.lang.Object produce() {
            r1 = this;
            android.database.sqlite.SQLiteDatabase r0 = r1.arg$1
            java.lang.Object r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$ensureBeginTransaction$15(r0)
            return r0
    }
}

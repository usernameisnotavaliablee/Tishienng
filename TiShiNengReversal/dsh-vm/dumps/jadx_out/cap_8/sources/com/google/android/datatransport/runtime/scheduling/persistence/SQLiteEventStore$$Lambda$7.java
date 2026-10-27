package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$7 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function {
    private final java.lang.String arg$1;

    private SQLiteEventStore$$Lambda$7(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.arg$1 = r1
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function lambdaFactory$(java.lang.String r1) {
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$7 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$7
            r0.<init>(r1)
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public java.lang.Object apply(java.lang.Object r2) {
            r1 = this;
            java.lang.String r0 = r1.arg$1
            android.database.sqlite.SQLiteDatabase r2 = (android.database.sqlite.SQLiteDatabase) r2
            java.lang.Object r2 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.lambda$recordFailure$3(r0, r2)
            return r2
    }
}

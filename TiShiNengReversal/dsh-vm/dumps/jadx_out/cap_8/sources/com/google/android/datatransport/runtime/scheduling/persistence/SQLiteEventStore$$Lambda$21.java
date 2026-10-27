package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final /* synthetic */ class SQLiteEventStore$$Lambda$21 implements com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function {
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$21 instance = null;

    static {
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$21 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$21
            r0.<init>()
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$21.instance = r0
            return
    }

    private SQLiteEventStore$$Lambda$21() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function lambdaFactory$() {
            com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$21 r0 = com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore$$Lambda$21.instance
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore.Function
    public java.lang.Object apply(java.lang.Object r1) {
            r0 = this;
            android.database.Cursor r1 = (android.database.Cursor) r1
            boolean r1 = r1.moveToNext()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            return r1
    }
}

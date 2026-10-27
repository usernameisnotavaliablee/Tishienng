package com.google.android.datatransport.runtime.scheduling.persistence;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
final /* synthetic */ class SchemaManager$$Lambda$2 implements com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration {
    private static final com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$2 instance = null;

    static {
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$2 r0 = new com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$2
            r0.<init>()
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$2.instance = r0
            return
    }

    private SchemaManager$$Lambda$2() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration lambdaFactory$() {
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$2 r0 = com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager$$Lambda$2.instance
            return r0
    }

    @Override // com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.Migration
    public void upgrade(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            com.google.android.datatransport.runtime.scheduling.persistence.SchemaManager.lambda$static$1(r1)
            return
    }
}

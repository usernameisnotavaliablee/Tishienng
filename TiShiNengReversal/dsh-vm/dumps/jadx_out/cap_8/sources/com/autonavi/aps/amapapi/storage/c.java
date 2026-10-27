package com.autonavi.aps.amapapi.storage;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c implements com.amap.api.col.p0003l.e6 {
    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.amap.api.col.p0003l.e6
    public final void a(android.database.sqlite.SQLiteDatabase r3) {
            r2 = this;
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS c (_id integer primary key autoincrement, a2 varchar(100), a4 varchar(2000), a3 LONG );"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r3 = move-exception
            java.lang.String r0 = "SdCardDbCreator"
            java.lang.String r1 = "onCreate"
            com.autonavi.aps.amapapi.utils.b.a(r3, r0, r1)
            return
    }

    @Override // com.amap.api.col.p0003l.e6
    public final void a(android.database.sqlite.SQLiteDatabase r1, int r2) {
            r0 = this;
            return
    }

    @Override // com.amap.api.col.p0003l.e6
    public final java.lang.String b() {
            r1 = this;
            java.lang.String r0 = "alsn20170807.db"
            return r0
    }

    @Override // com.amap.api.col.p0003l.e6
    public final int c() {
            r1 = this;
            r0 = 1
            return r0
    }
}

package com.ss.android.downloadlib.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c extends android.database.sqlite.SQLiteOpenHelper {
    static final java.lang.String[] a = null;

    static {
            java.lang.String r0 = "req_id"
            java.lang.String r1 = "time"
            java.lang.String r2 = "_id"
            java.lang.String r3 = "ad_id"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1}
            com.ss.android.downloadlib.r.c.a = r0
            return
    }

    public c(@androidx.annotation.Nullable android.content.Context r4) {
            r3 = this;
            r0 = 0
            r1 = 1
            java.lang.String r2 = "click_event"
            r3.<init>(r4, r2, r0, r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS click_event(_id INTEGER PRIMARY KEY AUTOINCREMENT,ad_id INTEGER,req_id TEXT,time INTEGER)"
            r2.execSQL(r0)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            java.lang.String r2 = "DROP TABLE IF EXISTS click_event"
            r1.execSQL(r2)
            r0.onCreate(r1)
            return
    }
}

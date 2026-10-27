package com.bytedance.msdk.up.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class tl extends android.database.sqlite.SQLiteOpenHelper {
    public tl(android.content.Context r2, java.lang.String r3, int r4) {
            r1 = this;
            com.bytedance.sdk.openadsdk.api.plugin.j r0 = new com.bytedance.sdk.openadsdk.api.plugin.j
            r0.<init>(r2)
            r2 = 0
            r1.<init>(r0, r3, r2, r4)
            java.lang.String r2 = "DBHelper"
            java.lang.String r3 = "DatabaseHelper ........"
            com.bytedance.msdk.j.up.cw.j(r2, r3)
            return
    }

    private static java.lang.String cw() {
            java.lang.String r0 = "ALTER TABLE adevent ADD COLUMN encrypt INTEGER default 0"
            return r0
    }

    private static java.lang.String j() {
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS adevent (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0, encrypt INTEGER default 0)"
            return r0
    }

    private void j(android.database.sqlite.SQLiteDatabase r3) {
            r2 = this;
            java.lang.String r0 = "DBHelper"
            java.lang.String r1 = "initDB........"
            com.bytedance.msdk.j.up.cw.j(r0, r1)
            java.lang.String r0 = j()     // Catch: java.lang.Throwable -> Lf
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L13:
            java.lang.String r0 = xt()     // Catch: java.lang.Throwable -> L1b
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L1b
            return
        L1b:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return
    }

    private void j(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            java.lang.String r2 = cw()     // Catch: java.lang.Throwable -> L8
            r1.execSQL(r2)     // Catch: java.lang.Throwable -> L8
            goto Lc
        L8:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        Lc:
            java.lang.String r2 = r()     // Catch: java.lang.Throwable -> L14
            r1.execSQL(r2)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
            return
    }

    private static java.lang.String r() {
            java.lang.String r0 = "ALTER TABLE adevent_applog ADD COLUMN encrypt INTEGER default 0"
            return r0
    }

    private static java.lang.String xt() {
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS adevent_applog (_id INTEGER PRIMARY KEY AUTOINCREMENT,id TEXT UNIQUE,value TEXT ,gen_time TEXT , retry INTEGER default 0, encrypt INTEGER default 0)"
            return r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            r0.j(r1)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r3, int r4, int r5) {
            r2 = this;
            java.lang.String r0 = "DBHelper"
            java.lang.String r1 = "onUpgrade....数据库版本升级....."
            com.bytedance.msdk.j.up.cw.j(r0, r1)     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            if (r4 == r0) goto L11
            r0 = 2
            if (r4 == r0) goto L11
            r0 = 3
            if (r4 == r0) goto L20
            return
        L11:
            java.lang.String r0 = "DROP TABLE IF EXISTS 'ad_video_info';"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "DROP TABLE IF EXISTS 'show_freqctl';"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "DROP TABLE IF EXISTS 'show_pacing';"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L2b
        L20:
            java.lang.String r0 = xt()     // Catch: java.lang.Throwable -> L2b
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L2b
            r2.j(r3, r4, r5)     // Catch: java.lang.Throwable -> L2b
            return
        L2b:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return
    }
}

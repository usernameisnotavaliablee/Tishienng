package com.umeng.socialize.net.dplus.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class StandardDBHelper extends android.database.sqlite.SQLiteOpenHelper {
    private static android.content.Context a;
    private java.lang.String b;

    static {
            return
    }

    public StandardDBHelper(android.content.Context r4) {
            r3 = this;
            r0 = 1
            java.lang.String r1 = "share.db"
            r2 = 0
            r3.<init>(r4, r1, r2, r0)
            r3.b = r2
            return
    }

    private void a(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "create table if not exists stats (Id integer primary key,_json TEXT)"
            r1.b = r0     // Catch: android.database.SQLException -> L8
            r2.execSQL(r0)     // Catch: android.database.SQLException -> L8
            return
        L8:
            r2 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r0, r2)
            return
    }

    private void b(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "create table if not exists s_e (Id integer primary key,_json TEXT)"
            r1.b = r0     // Catch: android.database.SQLException -> L8
            r2.execSQL(r0)     // Catch: android.database.SQLException -> L8
            return
        L8:
            r2 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r0, r2)
            return
    }

    private void c(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "create table if not exists auth (Id integer primary key,_json TEXT)"
            r1.b = r0     // Catch: android.database.SQLException -> L8
            r2.execSQL(r0)     // Catch: android.database.SQLException -> L8
            return
        L8:
            r2 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r0, r2)
            return
    }

    private void d(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "create table if not exists userinfo (Id integer primary key,_json TEXT)"
            r1.b = r0     // Catch: android.database.SQLException -> L8
            r2.execSQL(r0)     // Catch: android.database.SQLException -> L8
            return
        L8:
            r2 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r0, r2)
            return
    }

    private void e(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "create table if not exists dau (Id integer primary key,_json TEXT)"
            r1.b = r0     // Catch: android.database.SQLException -> L8
            r2.execSQL(r0)     // Catch: android.database.SQLException -> L8
            return
        L8:
            r2 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r0, r2)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            r0.a(r1)
            r0.b(r1)
            r0.c(r1)
            r0.d(r1)
            r0.e(r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }
}

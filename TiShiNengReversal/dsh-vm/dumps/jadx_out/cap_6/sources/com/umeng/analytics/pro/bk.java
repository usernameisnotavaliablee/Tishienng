package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class bk extends android.database.sqlite.SQLiteOpenHelper {
    private static final java.lang.Object b = null;
    private static com.umeng.analytics.pro.bk c = null;
    private static final java.lang.String d = "CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)";
    private static final java.lang.String e = "DROP TABLE IF EXISTS stf";
    private static final java.lang.String f = "DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)";
    private final android.content.Context a;

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            com.umeng.analytics.pro.bk.b = r0
            return
    }

    private bk(android.content.Context r1, java.lang.String r2, android.database.sqlite.SQLiteDatabase.CursorFactory r3, int r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            r0.a = r1
            return
    }

    public static final int a() {
            r0 = 1
            return r0
    }

    public static com.umeng.analytics.pro.bk a(android.content.Context r5) {
            java.lang.Object r0 = com.umeng.analytics.pro.bk.b
            monitor-enter(r0)
            com.umeng.analytics.pro.bk r1 = com.umeng.analytics.pro.bk.c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.umeng.analytics.pro.bk r1 = new com.umeng.analytics.pro.bk     // Catch: java.lang.Throwable -> L13
            java.lang.String r2 = com.umeng.analytics.pro.bm.b     // Catch: java.lang.Throwable -> L13
            r3 = 0
            r4 = 1
            r1.<init>(r5, r2, r3, r4)     // Catch: java.lang.Throwable -> L13
            com.umeng.analytics.pro.bk.c = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r5 = move-exception
            goto L19
        L15:
            com.umeng.analytics.pro.bk r5 = com.umeng.analytics.pro.bk.c     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r5
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r5
    }

    private void a(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "DROP TABLE IF EXISTS stf"
            r2.execSQL(r0)     // Catch: android.database.SQLException -> La
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)"
            r2.execSQL(r0)     // Catch: android.database.SQLException -> La
        La:
            return
    }

    private void b(android.database.sqlite.SQLiteDatabase r3) {
            r2 = this;
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS stf(_id INTEGER PRIMARY KEY AUTOINCREMENT, _tp TEXT, _hd TEXT, _bd TEXT, _ts TEXT, _uuid TEXT, _re1 TEXT, _re2 TEXT)"
            r3.execSQL(r0)     // Catch: java.lang.Throwable -> L6 android.database.sqlite.SQLiteDatabaseCorruptException -> L22
            return
        L6:
            r3 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "--->>> [有状态]创建二级缓存数据库失败: "
            r0.append(r1)
            java.lang.String r3 = r3.getMessage()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "MobclickRT"
            com.umeng.commonsdk.debug.UMRTLog.e(r0, r3)
            goto L25
        L22:
            r2.a(r3)
        L25:
            return
    }

    private void d() {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L14
            if (r0 == 0) goto L14
            boolean r1 = r0.isOpen()     // Catch: java.lang.Throwable -> L14
            if (r1 == 0) goto L14
            java.lang.String r1 = "DELETE FROM stf WHERE _id IN( SELECT _id FROM stf ORDER BY _id LIMIT 1)"
            r0.execSQL(r1)     // Catch: java.lang.Throwable -> L11
        L11:
            r0.close()     // Catch: java.lang.Throwable -> L14
        L14:
            return
    }

    public android.database.Cursor a(java.lang.String r10, java.lang.String[] r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
            r9 = this;
            android.database.sqlite.SQLiteDatabase r0 = r9.getWritableDatabase()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1b
            boolean r1 = r0.isOpen()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1b
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            android.database.Cursor r10 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L1b
            return r10
        L1b:
            r10 = 0
            return r10
    }

    public com.umeng.analytics.pro.bl a(java.lang.String r11) {
            r10 = this;
            r0 = 0
            java.lang.String r1 = "_uuid"
            java.lang.String r2 = "_tp"
            java.lang.String r3 = "_hd"
            java.lang.String r4 = "_bd"
            java.lang.String r5 = "_re1"
            java.lang.String r6 = "_re2"
            java.lang.String[] r3 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}     // Catch: java.lang.Throwable -> L73
            java.lang.String r9 = "1"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r1 = r10
            r2 = r11
            android.database.Cursor r2 = r1.a(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L73
            if (r2 == 0) goto L6d
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L74
            if (r3 == 0) goto L6d
            com.umeng.analytics.pro.bl r3 = new com.umeng.analytics.pro.bl     // Catch: java.lang.Throwable -> L74
            r3.<init>()     // Catch: java.lang.Throwable -> L74
            r0 = 0
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L6b
            r3.a = r0     // Catch: java.lang.Throwable -> L6b
            r0 = 1
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L6b
            r3.b = r0     // Catch: java.lang.Throwable -> L6b
            r0 = 2
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L6b
            r4 = 3
            java.lang.String r4 = r2.getString(r4)     // Catch: java.lang.Throwable -> L6b
            android.content.Context r5 = r10.a     // Catch: java.lang.Throwable -> L6b
            com.umeng.analytics.pro.i r5 = com.umeng.analytics.pro.i.a(r5)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r5.d(r0)     // Catch: java.lang.Throwable -> L6b
            r3.c = r0     // Catch: java.lang.Throwable -> L6b
            android.content.Context r0 = r10.a     // Catch: java.lang.Throwable -> L6b
            com.umeng.analytics.pro.i r0 = com.umeng.analytics.pro.i.a(r0)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r0 = r0.d(r4)     // Catch: java.lang.Throwable -> L6b
            r3.d = r0     // Catch: java.lang.Throwable -> L6b
            r0 = 4
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L6b
            r3.e = r0     // Catch: java.lang.Throwable -> L6b
            r0 = 5
            java.lang.String r0 = r2.getString(r0)     // Catch: java.lang.Throwable -> L6b
            r3.f = r0     // Catch: java.lang.Throwable -> L6b
            r0 = r3
            goto L6d
        L6b:
            r0 = r3
            goto L74
        L6d:
            if (r2 == 0) goto L72
            r2.close()
        L72:
            return r0
        L73:
            r2 = r0
        L74:
            r10.d()     // Catch: java.lang.Throwable -> L7d
            if (r2 == 0) goto L7c
            r2.close()
        L7c:
            return r0
        L7d:
            r0 = move-exception
            if (r2 == 0) goto L83
            r2.close()
        L83:
            throw r0
    }

    public void a(java.lang.String r3, android.content.ContentValues r4) {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L23
            if (r0 == 0) goto L23
            boolean r1 = r0.isOpen()     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L23
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L1d
            r1 = 0
            r0.insert(r3, r1, r4)     // Catch: java.lang.Throwable -> L1d
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1d
            java.lang.String r3 = "MobclickRT"
            java.lang.String r4 = "--->>> [有状态]插入二级缓存数据记录 成功。"
            com.umeng.commonsdk.debug.UMRTLog.e(r3, r4)     // Catch: java.lang.Throwable -> L1d
        L1d:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L23
            r0.close()     // Catch: java.lang.Throwable -> L23
        L23:
            return
    }

    public void a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.lang.String[] r3 = new java.lang.String[]{r3}
            java.lang.String r0 = "_uuid=?"
            r1.a(r2, r0, r3)
            return
    }

    public void a(java.lang.String r3, java.lang.String r4, java.lang.String[] r5) {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L1b
            boolean r1 = r0.isOpen()     // Catch: java.lang.Throwable -> L1b
            if (r1 == 0) goto L1b
            r0.beginTransaction()     // Catch: java.lang.Throwable -> L15
            r0.delete(r3, r4, r5)     // Catch: java.lang.Throwable -> L15
            r0.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L15
        L15:
            r0.endTransaction()     // Catch: java.lang.Throwable -> L1b
            r0.close()     // Catch: java.lang.Throwable -> L1b
        L1b:
            return
    }

    public void b() {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto Lf
            boolean r1 = r0.isOpen()     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Lf
            r0.close()     // Catch: java.lang.Throwable -> Lf
        Lf:
            return
    }

    public boolean b(java.lang.String r11) {
            r10 = this;
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r10.getWritableDatabase()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L1c
            boolean r2 = r1.isOpen()     // Catch: java.lang.Throwable -> L1a
            if (r2 == 0) goto L1c
            r8 = 0
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r2 = r11
            android.database.Cursor r0 = r1.query(r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            goto L3b
        L1c:
            if (r0 == 0) goto L2e
            int r11 = r0.getCount()     // Catch: java.lang.Throwable -> L1a
            if (r11 <= 0) goto L2e
            r0.close()
            r11 = 1
            if (r1 == 0) goto L2d
            r1.close()
        L2d:
            return r11
        L2e:
            if (r0 == 0) goto L33
            r0.close()
        L33:
            if (r1 == 0) goto L43
        L35:
            r1.close()
            goto L43
        L39:
            r1 = r0
        L3b:
            if (r0 == 0) goto L40
            r0.close()
        L40:
            if (r1 == 0) goto L43
            goto L35
        L43:
            r11 = 0
            return r11
    }

    public boolean c() {
            r1 = this;
            java.lang.String r0 = "stf"
            boolean r0 = r1.b(r0)
            if (r0 != 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r1) {
            r0 = this;
            r0.b(r1)
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            return
    }
}

package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class f extends android.database.sqlite.SQLiteOpenHelper {
    private static android.content.Context b;
    private java.lang.String a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.analytics.pro.f$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        private static final com.umeng.analytics.pro.f a = null;

        static {
                com.umeng.analytics.pro.f r0 = new com.umeng.analytics.pro.f
                android.content.Context r1 = com.umeng.analytics.pro.f.b()
                android.content.Context r2 = com.umeng.analytics.pro.f.b()
                java.lang.String r2 = com.umeng.analytics.pro.h.b(r2)
                java.lang.String r3 = com.umeng.analytics.pro.e.b
                r5 = 2
                r6 = 0
                r4 = 0
                r0.<init>(r1, r2, r3, r4, r5, r6)
                com.umeng.analytics.pro.f.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ com.umeng.analytics.pro.f a() {
                com.umeng.analytics.pro.f r0 = com.umeng.analytics.pro.f.a.a
                return r0
        }
    }

    static {
            return
    }

    private f(android.content.Context r2, java.lang.String r3, android.database.sqlite.SQLiteDatabase.CursorFactory r4, int r5) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L8
            java.lang.String r3 = com.umeng.analytics.pro.e.b
        L8:
            r1.<init>(r2, r3, r4, r5)
            r2 = 0
            r1.a = r2
            r1.a()
            return
    }

    private f(android.content.Context r2, java.lang.String r3, java.lang.String r4, android.database.sqlite.SQLiteDatabase.CursorFactory r5, int r6) {
            r1 = this;
            com.umeng.analytics.pro.c r0 = new com.umeng.analytics.pro.c
            r0.<init>(r2, r3)
            r1.<init>(r0, r4, r5, r6)
            return
    }

    /* synthetic */ f(android.content.Context r1, java.lang.String r2, java.lang.String r3, android.database.sqlite.SQLiteDatabase.CursorFactory r4, int r5, com.umeng.analytics.pro.f.AnonymousClass1 r6) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    public static com.umeng.analytics.pro.f a(android.content.Context r1) {
            android.content.Context r0 = com.umeng.analytics.pro.f.b
            if (r0 != 0) goto Le
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.umeng.analytics.pro.f.b = r1
        Le:
            com.umeng.analytics.pro.f r1 = com.umeng.analytics.pro.f.a.a()
            return r1
    }

    private void a(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "create table if not exists __er(id INTEGER primary key autoincrement, __i TEXT, __a TEXT, __t INTEGER, __av TEXT, __vc TEXT)"
            r1.a = r0     // Catch: android.database.SQLException -> L7
            r2.execSQL(r0)     // Catch: android.database.SQLException -> L7
        L7:
            return
    }

    private void a(android.database.sqlite.SQLiteDatabase r3, java.lang.String r4) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.database.SQLException -> L14
            r0.<init>()     // Catch: android.database.SQLException -> L14
            java.lang.String r1 = "DROP TABLE IF EXISTS "
            r0.append(r1)     // Catch: android.database.SQLException -> L14
            r0.append(r4)     // Catch: android.database.SQLException -> L14
            java.lang.String r4 = r0.toString()     // Catch: android.database.SQLException -> L14
            r3.execSQL(r4)     // Catch: android.database.SQLException -> L14
        L14:
            return
    }

    static /* synthetic */ android.content.Context b() {
            android.content.Context r0 = com.umeng.analytics.pro.f.b
            return r0
    }

    private void b(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "create table if not exists __et(id INTEGER primary key autoincrement, __i TEXT, __e TEXT, __s TEXT, __t INTEGER, __av TEXT, __vc TEXT)"
            r1.a = r0     // Catch: android.database.SQLException -> L7
            r2.execSQL(r0)     // Catch: android.database.SQLException -> L7
        L7:
            return
    }

    private void c(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "create table if not exists __sd(id INTEGER primary key autoincrement, __ii TEXT unique, __a TEXT, __b TEXT, __c TEXT, __d TEXT, __e TEXT, __f TEXT, __g TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)"
            r1.a = r0     // Catch: android.database.SQLException -> L7
            r2.execSQL(r0)     // Catch: android.database.SQLException -> L7
        L7:
            return
    }

    private void d(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "create table if not exists __is(id INTEGER primary key autoincrement, __ii TEXT unique, __e TEXT, __sp TEXT, __pp TEXT, __av TEXT, __vc TEXT)"
            r1.a = r0     // Catch: android.database.SQLException -> L7
            r2.execSQL(r0)     // Catch: android.database.SQLException -> L7
        L7:
            return
    }

    private void e(android.database.sqlite.SQLiteDatabase r6) {
            r5 = this;
            java.lang.String r0 = "__sd"
            java.lang.String r1 = "__av"
            boolean r2 = com.umeng.analytics.pro.h.a(r6, r0, r1)
            java.lang.String r3 = "__vc"
            java.lang.String r4 = "TEXT"
            if (r2 != 0) goto L1e
            java.lang.String r2 = "__sp"
            com.umeng.analytics.pro.h.a(r6, r0, r2, r4)
            java.lang.String r2 = "__pp"
            com.umeng.analytics.pro.h.a(r6, r0, r2, r4)
            com.umeng.analytics.pro.h.a(r6, r0, r1, r4)
            com.umeng.analytics.pro.h.a(r6, r0, r3, r4)
        L1e:
            java.lang.String r0 = "__et"
            boolean r2 = com.umeng.analytics.pro.h.a(r6, r0, r1)
            if (r2 != 0) goto L2c
            com.umeng.analytics.pro.h.a(r6, r0, r1, r4)
            com.umeng.analytics.pro.h.a(r6, r0, r3, r4)
        L2c:
            java.lang.String r0 = "__er"
            boolean r2 = com.umeng.analytics.pro.h.a(r6, r0, r1)
            if (r2 != 0) goto L3a
            com.umeng.analytics.pro.h.a(r6, r0, r1, r4)
            com.umeng.analytics.pro.h.a(r6, r0, r3, r4)
        L3a:
            return
    }

    private void f(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "__sd"
            r1.a(r2, r0)
            java.lang.String r0 = "__et"
            r1.a(r2, r0)
            java.lang.String r0 = "__er"
            r1.a(r2, r0)
            r1.a()
            return
    }

    public void a() {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.getWritableDatabase()     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = "__sd"
            boolean r1 = com.umeng.analytics.pro.h.a(r1, r0)     // Catch: java.lang.Exception -> L30
            if (r1 != 0) goto Lf
            r2.c(r0)     // Catch: java.lang.Exception -> L30
        Lf:
            java.lang.String r1 = "__is"
            boolean r1 = com.umeng.analytics.pro.h.a(r1, r0)     // Catch: java.lang.Exception -> L30
            if (r1 != 0) goto L1a
            r2.d(r0)     // Catch: java.lang.Exception -> L30
        L1a:
            java.lang.String r1 = "__et"
            boolean r1 = com.umeng.analytics.pro.h.a(r1, r0)     // Catch: java.lang.Exception -> L30
            if (r1 != 0) goto L25
            r2.b(r0)     // Catch: java.lang.Exception -> L30
        L25:
            java.lang.String r1 = "__er"
            boolean r1 = com.umeng.analytics.pro.h.a(r1, r0)     // Catch: java.lang.Exception -> L30
            if (r1 != 0) goto L30
            r2.a(r0)     // Catch: java.lang.Exception -> L30
        L30:
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(android.database.sqlite.SQLiteDatabase r2) {
            r1 = this;
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteDatabaseCorruptException -> L1d
            r1.c(r2)     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteDatabaseCorruptException -> L1d
            r1.d(r2)     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteDatabaseCorruptException -> L1d
            r1.b(r2)     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteDatabaseCorruptException -> L1d
            r1.a(r2)     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteDatabaseCorruptException -> L1d
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L16 android.database.sqlite.SQLiteDatabaseCorruptException -> L1d
            r2.endTransaction()     // Catch: java.lang.Throwable -> L25
            return
        L16:
            if (r2 == 0) goto L25
        L19:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L25
            goto L25
        L1d:
            android.content.Context r0 = com.umeng.analytics.pro.f.b     // Catch: java.lang.Throwable -> L26
            com.umeng.analytics.pro.h.a(r0)     // Catch: java.lang.Throwable -> L26
            if (r2 == 0) goto L25
            goto L19
        L25:
            return
        L26:
            r0 = move-exception
            if (r2 == 0) goto L2c
            r2.endTransaction()     // Catch: java.lang.Throwable -> L2c
        L2c:
            throw r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(android.database.sqlite.SQLiteDatabase r1, int r2, int r3) {
            r0 = this;
            if (r3 <= r2) goto L10
            r3 = 1
            if (r2 != r3) goto L10
            r0.e(r1)     // Catch: java.lang.Exception -> L9
            return
        L9:
            r0.e(r1)     // Catch: java.lang.Exception -> Ld
            goto L10
        Ld:
            r0.f(r1)
        L10:
            return
    }
}

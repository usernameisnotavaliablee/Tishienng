package com.tencent.bugly.proguard;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class x extends android.database.sqlite.SQLiteOpenHelper {
    public static java.lang.String a = "bugly_db";
    public static int b = 16;
    protected android.content.Context c;
    private java.util.List<com.tencent.bugly.proguard.o> d;

    static {
            return
    }

    public x(android.content.Context r4, java.util.List<com.tencent.bugly.proguard.o> r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = com.tencent.bugly.proguard.x.a
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            com.tencent.bugly.proguard.aa r1 = com.tencent.bugly.proguard.aa.a(r4)
            r1.getClass()
            java.lang.String r0 = r0.toString()
            r1 = 0
            int r2 = com.tencent.bugly.proguard.x.b
            r3.<init>(r4, r0, r1, r2)
            r3.c = r4
            r3.d = r5
            return
    }

    private synchronized boolean a(android.database.sqlite.SQLiteDatabase r6) {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            java.lang.String r1 = "t_lr"
            java.lang.String r2 = "t_ui"
            java.lang.String r3 = "t_pf"
            java.lang.String[] r1 = new java.lang.String[]{r1, r2, r3}     // Catch: java.lang.Throwable -> L24
            r2 = 0
        Ld:
            r3 = 3
            if (r2 >= r3) goto L26
            r3 = r1[r2]     // Catch: java.lang.Throwable -> L24
            java.lang.String r4 = "DROP TABLE IF EXISTS "
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r4.concat(r3)     // Catch: java.lang.Throwable -> L24
            java.lang.String[] r4 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L24
            r6.execSQL(r3, r4)     // Catch: java.lang.Throwable -> L24
            int r2 = r2 + 1
            goto Ld
        L24:
            r6 = move-exception
            goto L29
        L26:
            monitor-exit(r5)
            r6 = 1
            return r6
        L29:
            com.tencent.bugly.proguard.al.b(r6)     // Catch: java.lang.Throwable -> L2e
            monitor-exit(r5)
            return r0
        L2e:
            r6 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L2e
            throw r6
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized android.database.sqlite.SQLiteDatabase getReadableDatabase() {
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r1 = 0
            r2 = 0
        L4:
            if (r0 != 0) goto L34
            r3 = 5
            if (r2 >= r3) goto L34
            int r2 = r2 + 1
            android.database.sqlite.SQLiteDatabase r0 = super.getReadableDatabase()     // Catch: java.lang.Throwable -> L10
            goto L4
        L10:
            java.lang.String r4 = "[Database] Try to get db(count: %d)."
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L28
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L28
            r6[r1] = r5     // Catch: java.lang.Throwable -> L28
            com.tencent.bugly.proguard.al.d(r4, r6)     // Catch: java.lang.Throwable -> L28
            if (r2 != r3) goto L2a
            java.lang.String r3 = "[Database] Failed to get db."
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L28
            com.tencent.bugly.proguard.al.e(r3, r4)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r0 = move-exception
            goto L32
        L2a:
            r3 = 200(0xc8, double:9.9E-322)
            java.lang.Thread.sleep(r3)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L30
            goto L4
        L30:
            goto L4
        L32:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L28
            throw r0
        L34:
            monitor-exit(r7)
            return r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized android.database.sqlite.SQLiteDatabase getWritableDatabase() {
            r7 = this;
            monitor-enter(r7)
            r0 = 0
            r1 = 0
            r2 = 0
        L4:
            if (r0 != 0) goto L32
            r3 = 5
            if (r2 >= r3) goto L32
            int r2 = r2 + 1
            android.database.sqlite.SQLiteDatabase r0 = super.getWritableDatabase()     // Catch: java.lang.Throwable -> L10
            goto L4
        L10:
            java.lang.String r4 = "[Database] Try to get db(count: %d)."
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L28
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch: java.lang.Throwable -> L28
            r6[r1] = r5     // Catch: java.lang.Throwable -> L28
            com.tencent.bugly.proguard.al.d(r4, r6)     // Catch: java.lang.Throwable -> L28
            if (r2 != r3) goto L2a
            java.lang.String r3 = "[Database] Failed to get db."
            java.lang.Object[] r4 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L28
            com.tencent.bugly.proguard.al.e(r3, r4)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            r0 = move-exception
            goto L3c
        L2a:
            r3 = 200(0xc8, double:9.9E-322)
            java.lang.Thread.sleep(r3)     // Catch: java.lang.Throwable -> L28 java.lang.InterruptedException -> L30
            goto L4
        L30:
            goto L4
        L32:
            if (r0 != 0) goto L3e
            java.lang.String r2 = "[Database] db error delay error record 1min."
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L28
            com.tencent.bugly.proguard.al.d(r2, r1)     // Catch: java.lang.Throwable -> L28
            goto L3e
        L3c:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L28
            throw r0
        L3e:
            monitor-exit(r7)
            return r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized void onCreate(android.database.sqlite.SQLiteDatabase r5) {
            r4 = this;
            monitor-enter(r4)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Ld4
            r0.<init>()     // Catch: java.lang.Throwable -> Ld4
            r1 = 0
            r0.setLength(r1)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = " CREATE TABLE IF NOT EXISTS t_ui ( _id INTEGER PRIMARY KEY , _tm int , _ut int , _tp int , _dt blob , _pc text ) "
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Ld4
            com.tencent.bugly.proguard.al.c(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Ld4
            r5.execSQL(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            r0.setLength(r1)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = " CREATE TABLE IF NOT EXISTS t_lr ( _id INTEGER PRIMARY KEY , _tp int , _tm int , _pc text , _th text , _dt blob ) "
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Ld4
            com.tencent.bugly.proguard.al.c(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Ld4
            r5.execSQL(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            r0.setLength(r1)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = " CREATE TABLE IF NOT EXISTS t_pf ( _id integer , _tp text , _tm int , _dt blob,primary key(_id,_tp )) "
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Ld4
            com.tencent.bugly.proguard.al.c(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Ld4
            r5.execSQL(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            r0.setLength(r1)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = " CREATE TABLE IF NOT EXISTS t_cr ( _id INTEGER PRIMARY KEY , _tm int , _s1 text , _up int , _me int , _uc int , _dt blob ) "
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Ld4
            com.tencent.bugly.proguard.al.c(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Ld4
            r5.execSQL(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            r0.setLength(r1)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = " CREATE TABLE IF NOT EXISTS dl_1002 (_id integer primary key autoincrement, _dUrl varchar(100), _sFile varchar(100), _sLen INTEGER, _tLen INTEGER, _MD5 varchar(100), _DLTIME INTEGER)"
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Ld4
            com.tencent.bugly.proguard.al.c(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Ld4
            r5.execSQL(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            r0.setLength(r1)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = "CREATE TABLE IF NOT EXISTS ge_1002 (_id integer primary key autoincrement, _time INTEGER, _datas blob)"
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Ld4
            com.tencent.bugly.proguard.al.c(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Ld4
            r5.execSQL(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            r0.setLength(r1)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = " CREATE TABLE IF NOT EXISTS st_1002 ( _id integer , _tp text , _tm int , _dt blob,primary key(_id,_tp )) "
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Ld4
            com.tencent.bugly.proguard.al.c(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.String[] r3 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Ld4
            r5.execSQL(r2, r3)     // Catch: java.lang.Throwable -> Ld4
            r0.setLength(r1)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r2 = " CREATE TABLE IF NOT EXISTS t_sla ( _id TEXT NOT NULL , _tm INTEGER NOT NULL , _dt TEXT NOT NULL , PRIMARY KEY(_id) ) "
            r0.append(r2)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Ld4
            java.lang.Object[] r2 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> Ld4
            com.tencent.bugly.proguard.al.c(r0, r2)     // Catch: java.lang.Throwable -> Ld4
            java.lang.String[] r1 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Ld4
            r5.execSQL(r0, r1)     // Catch: java.lang.Throwable -> Ld4
            goto Ld8
        Ld4:
            r0 = move-exception
            com.tencent.bugly.proguard.al.b(r0)     // Catch: java.lang.Throwable -> Lf7
        Ld8:
            java.util.List<com.tencent.bugly.proguard.o> r0 = r4.d     // Catch: java.lang.Throwable -> Lf7
            if (r0 != 0) goto Lde
            monitor-exit(r4)
            return
        Lde:
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lf7
        Le2:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> Lf7
            if (r1 == 0) goto Lf9
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> Lf7
            com.tencent.bugly.proguard.o r1 = (com.tencent.bugly.proguard.o) r1     // Catch: java.lang.Throwable -> Lf7
            r1.onDbCreate(r5)     // Catch: java.lang.Throwable -> Lf2
            goto Le2
        Lf2:
            r1 = move-exception
            com.tencent.bugly.proguard.al.b(r1)     // Catch: java.lang.Throwable -> Lf7
            goto Le2
        Lf7:
            r5 = move-exception
            goto Lfb
        Lf9:
            monitor-exit(r4)
            return
        Lfb:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf7
            throw r5
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    @android.annotation.TargetApi(11)
    public final synchronized void onDowngrade(android.database.sqlite.SQLiteDatabase r6, int r7, int r8) {
            r5 = this;
            monitor-enter(r5)
            int r0 = com.tencent.bugly.proguard.ab.c()     // Catch: java.lang.Throwable -> L3c
            r1 = 11
            if (r0 < r1) goto L63
            java.lang.String r0 = "[Database] Downgrade %d to %d drop tables."
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L3c
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L3c
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            r3[r4] = r1     // Catch: java.lang.Throwable -> L3c
            r1 = 1
            r3[r1] = r2     // Catch: java.lang.Throwable -> L3c
            com.tencent.bugly.proguard.al.d(r0, r3)     // Catch: java.lang.Throwable -> L3c
            java.util.List<com.tencent.bugly.proguard.o> r0 = r5.d     // Catch: java.lang.Throwable -> L3c
            if (r0 == 0) goto L3e
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L3c
        L27:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L3c
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L3c
            com.tencent.bugly.proguard.o r1 = (com.tencent.bugly.proguard.o) r1     // Catch: java.lang.Throwable -> L3c
            r1.onDbDowngrade(r6, r7, r8)     // Catch: java.lang.Throwable -> L37
            goto L27
        L37:
            r1 = move-exception
            com.tencent.bugly.proguard.al.b(r1)     // Catch: java.lang.Throwable -> L3c
            goto L27
        L3c:
            r6 = move-exception
            goto L65
        L3e:
            boolean r7 = r5.a(r6)     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto L49
            r5.onCreate(r6)     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r5)
            return
        L49:
            java.lang.String r6 = "[Database] Failed to drop, delete db."
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L3c
            com.tencent.bugly.proguard.al.d(r6, r7)     // Catch: java.lang.Throwable -> L3c
            android.content.Context r6 = r5.c     // Catch: java.lang.Throwable -> L3c
            java.lang.String r7 = com.tencent.bugly.proguard.x.a     // Catch: java.lang.Throwable -> L3c
            java.io.File r6 = r6.getDatabasePath(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L63
            boolean r7 = r6.canWrite()     // Catch: java.lang.Throwable -> L3c
            if (r7 == 0) goto L63
            r6.delete()     // Catch: java.lang.Throwable -> L3c
        L63:
            monitor-exit(r5)
            return
        L65:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L3c
            throw r6
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final synchronized void onUpgrade(android.database.sqlite.SQLiteDatabase r6, int r7, int r8) {
            r5 = this;
            monitor-enter(r5)
            java.lang.String r0 = "[Database] Upgrade %d to %d , drop tables!"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L34
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L34
            r4 = 0
            r3[r4] = r1     // Catch: java.lang.Throwable -> L34
            r1 = 1
            r3[r1] = r2     // Catch: java.lang.Throwable -> L34
            com.tencent.bugly.proguard.al.d(r0, r3)     // Catch: java.lang.Throwable -> L34
            java.util.List<com.tencent.bugly.proguard.o> r0 = r5.d     // Catch: java.lang.Throwable -> L34
            if (r0 == 0) goto L36
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L34
        L1f:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L34
            if (r1 == 0) goto L36
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L34
            com.tencent.bugly.proguard.o r1 = (com.tencent.bugly.proguard.o) r1     // Catch: java.lang.Throwable -> L34
            r1.onDbUpgrade(r6, r7, r8)     // Catch: java.lang.Throwable -> L2f
            goto L1f
        L2f:
            r1 = move-exception
            com.tencent.bugly.proguard.al.b(r1)     // Catch: java.lang.Throwable -> L34
            goto L1f
        L34:
            r6 = move-exception
            goto L5d
        L36:
            boolean r7 = r5.a(r6)     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L41
            r5.onCreate(r6)     // Catch: java.lang.Throwable -> L34
            monitor-exit(r5)
            return
        L41:
            java.lang.String r6 = "[Database] Failed to drop, delete db."
            java.lang.Object[] r7 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L34
            com.tencent.bugly.proguard.al.d(r6, r7)     // Catch: java.lang.Throwable -> L34
            android.content.Context r6 = r5.c     // Catch: java.lang.Throwable -> L34
            java.lang.String r7 = com.tencent.bugly.proguard.x.a     // Catch: java.lang.Throwable -> L34
            java.io.File r6 = r6.getDatabasePath(r7)     // Catch: java.lang.Throwable -> L34
            if (r6 == 0) goto L5b
            boolean r7 = r6.canWrite()     // Catch: java.lang.Throwable -> L34
            if (r7 == 0) goto L5b
            r6.delete()     // Catch: java.lang.Throwable -> L34
        L5b:
            monitor-exit(r5)
            return
        L5d:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L34
            throw r6
    }
}

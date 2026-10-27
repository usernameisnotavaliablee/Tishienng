package cn.jpush.android.v;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class e extends android.database.sqlite.SQLiteOpenHelper {
    private volatile int a;

    /* renamed from: b, reason: collision with root package name */
    private volatile int f1976b;

    /* renamed from: c, reason: collision with root package name */
    private volatile android.database.sqlite.SQLiteDatabase f1977c;

    /* renamed from: d, reason: collision with root package name */
    private volatile android.database.sqlite.SQLiteDatabase f1978d;

    /* renamed from: e, reason: collision with root package name */
    private final java.lang.Object f1979e;

    /* renamed from: f, reason: collision with root package name */
    private final java.lang.Object f1980f;

    /* renamed from: g, reason: collision with root package name */
    private final android.content.Context f1981g;

    /* renamed from: h, reason: collision with root package name */
    private final java.lang.String f1982h;

    /* renamed from: i, reason: collision with root package name */
    private final int f1983i;

    /* renamed from: j, reason: collision with root package name */
    private final android.database.sqlite.SQLiteDatabase.CursorFactory f1984j;

    public e(android.content.Context r2, java.lang.String r3, android.database.sqlite.SQLiteDatabase.CursorFactory r4, int r5) {
            r1 = this;
            r1.<init>(r2, r3, r4, r5)
            r0 = 0
            r1.a = r0
            r1.f1976b = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f1979e = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.f1980f = r0
            r1.f1981g = r2
            r1.f1982h = r3
            r1.f1983i = r5
            r1.f1984j = r4
            return
    }

    public boolean a(boolean r3) {
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L13
            java.lang.Object r3 = r2.f1979e     // Catch: java.lang.Exception -> L23
            monitor-enter(r3)     // Catch: java.lang.Exception -> L23
            r2.getWritableDatabase()     // Catch: java.lang.Throwable -> L10
            int r1 = r2.f1976b     // Catch: java.lang.Throwable -> L10
            int r1 = r1 + r0
            r2.f1976b = r1     // Catch: java.lang.Throwable -> L10
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L10
            throw r0     // Catch: java.lang.Exception -> L23
        L13:
            java.lang.Object r3 = r2.f1980f     // Catch: java.lang.Exception -> L23
            monitor-enter(r3)     // Catch: java.lang.Exception -> L23
            r2.getReadableDatabase()     // Catch: java.lang.Throwable -> L20
            int r1 = r2.a     // Catch: java.lang.Throwable -> L20
            int r1 = r1 + r0
            r2.a = r1     // Catch: java.lang.Throwable -> L20
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            return r0
        L20:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L20
            throw r0     // Catch: java.lang.Exception -> L23
        L23:
            r3 = 0
            return r3
    }

    public void b(boolean r4) {
            r3 = this;
            r0 = 0
            r1 = 0
            if (r4 == 0) goto L2f
            java.lang.Object r4 = r3.f1979e
            monitor-enter(r4)
            android.database.sqlite.SQLiteDatabase r2 = r3.f1978d     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            android.database.sqlite.SQLiteDatabase r2 = r3.f1978d     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r2.isOpen()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L1e
            int r2 = r3.f1976b     // Catch: java.lang.Throwable -> L1c
            int r2 = r2 + (-1)
            r3.f1976b = r2     // Catch: java.lang.Throwable -> L1c
            if (r2 > 0) goto L2b
            goto L1e
        L1c:
            r0 = move-exception
            goto L2d
        L1e:
            r3.f1976b = r1     // Catch: java.lang.Throwable -> L1c
            android.database.sqlite.SQLiteDatabase r1 = r3.f1978d     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L29
            android.database.sqlite.SQLiteDatabase r1 = r3.f1978d     // Catch: java.lang.Throwable -> L1c
            r1.close()     // Catch: java.lang.Throwable -> L1c
        L29:
            r3.f1978d = r0     // Catch: java.lang.Throwable -> L1c
        L2b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            return
        L2d:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L1c
            throw r0
        L2f:
            java.lang.Object r4 = r3.f1980f
            monitor-enter(r4)
            android.database.sqlite.SQLiteDatabase r2 = r3.f1977c     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L49
            android.database.sqlite.SQLiteDatabase r2 = r3.f1977c     // Catch: java.lang.Throwable -> L47
            boolean r2 = r2.isOpen()     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L49
            int r2 = r3.a     // Catch: java.lang.Throwable -> L47
            int r2 = r2 + (-1)
            r3.a = r2     // Catch: java.lang.Throwable -> L47
            if (r2 > 0) goto L56
            goto L49
        L47:
            r0 = move-exception
            goto L58
        L49:
            r3.a = r1     // Catch: java.lang.Throwable -> L47
            android.database.sqlite.SQLiteDatabase r1 = r3.f1977c     // Catch: java.lang.Throwable -> L47
            if (r1 == 0) goto L54
            android.database.sqlite.SQLiteDatabase r1 = r3.f1977c     // Catch: java.lang.Throwable -> L47
            r1.close()     // Catch: java.lang.Throwable -> L47
        L54:
            r3.f1977c = r0     // Catch: java.lang.Throwable -> L47
        L56:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L47
            return
        L58:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L47
            throw r0
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    @java.lang.Deprecated
    public void close() {
            r0 = this;
            return
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public android.database.sqlite.SQLiteDatabase getReadableDatabase() {
            r5 = this;
            android.database.sqlite.SQLiteDatabase r0 = r5.f1977c
            if (r0 == 0) goto Lc
            android.database.sqlite.SQLiteDatabase r0 = r5.f1977c
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto L49
        Lc:
            java.lang.Object r0 = r5.f1980f
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r5.f1977c     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            android.database.sqlite.SQLiteDatabase r1 = r5.f1977c     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isOpen()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L48
            goto L1e
        L1c:
            r1 = move-exception
            goto L7b
        L1e:
            r5.getWritableDatabase()     // Catch: java.lang.Throwable -> L1c android.database.sqlite.SQLiteException -> L21
        L21:
            android.content.Context r1 = r5.f1981g     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = r5.f1982h     // Catch: java.lang.Throwable -> L1c
            java.io.File r1 = r1.getDatabasePath(r2)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r1.getPath()     // Catch: java.lang.Throwable -> L1c
            android.database.sqlite.SQLiteDatabase$CursorFactory r2 = r5.f1984j     // Catch: java.lang.Throwable -> L1c
            r3 = 1
            android.database.sqlite.SQLiteDatabase r2 = android.database.sqlite.SQLiteDatabase.openDatabase(r1, r2, r3)     // Catch: java.lang.Throwable -> L1c
            r5.f1977c = r2     // Catch: java.lang.Throwable -> L1c
            android.database.sqlite.SQLiteDatabase r2 = r5.f1977c     // Catch: java.lang.Throwable -> L1c
            int r2 = r2.getVersion()     // Catch: java.lang.Throwable -> L1c
            int r3 = r5.f1983i     // Catch: java.lang.Throwable -> L1c
            if (r2 != r3) goto L4c
            r1 = 0
            r5.a = r1     // Catch: java.lang.Throwable -> L1c
            android.database.sqlite.SQLiteDatabase r1 = r5.f1977c     // Catch: java.lang.Throwable -> L1c
            r5.onOpen(r1)     // Catch: java.lang.Throwable -> L1c
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
        L49:
            android.database.sqlite.SQLiteDatabase r0 = r5.f1977c
            return r0
        L4c:
            android.database.sqlite.SQLiteException r2 = new android.database.sqlite.SQLiteException     // Catch: java.lang.Throwable -> L1c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1c
            r3.<init>()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "Can't upgrade read-only database from version "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            android.database.sqlite.SQLiteDatabase r4 = r5.f1977c     // Catch: java.lang.Throwable -> L1c
            int r4 = r4.getVersion()     // Catch: java.lang.Throwable -> L1c
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = " to "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            int r4 = r5.f1983i     // Catch: java.lang.Throwable -> L1c
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = ": "
            r3.append(r4)     // Catch: java.lang.Throwable -> L1c
            r3.append(r1)     // Catch: java.lang.Throwable -> L1c
            java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L1c
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L1c
            throw r2     // Catch: java.lang.Throwable -> L1c
        L7b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public android.database.sqlite.SQLiteDatabase getWritableDatabase() {
            r2 = this;
            android.database.sqlite.SQLiteDatabase r0 = r2.f1978d
            if (r0 == 0) goto Lc
            android.database.sqlite.SQLiteDatabase r0 = r2.f1978d
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto L2d
        Lc:
            java.lang.Object r0 = r2.f1979e
            monitor-enter(r0)
            android.database.sqlite.SQLiteDatabase r1 = r2.f1978d     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1e
            android.database.sqlite.SQLiteDatabase r1 = r2.f1978d     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isOpen()     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L2c
            goto L1e
        L1c:
            r1 = move-exception
            goto L30
        L1e:
            r1 = 0
            r2.f1976b = r1     // Catch: java.lang.Throwable -> L1c
            android.database.sqlite.SQLiteDatabase r1 = super.getWritableDatabase()     // Catch: java.lang.Throwable -> L1c
            r2.f1978d = r1     // Catch: java.lang.Throwable -> L1c
            android.database.sqlite.SQLiteDatabase r1 = r2.f1978d     // Catch: java.lang.Throwable -> L1c
            r1.enableWriteAheadLogging()     // Catch: java.lang.Throwable -> L1c
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
        L2d:
            android.database.sqlite.SQLiteDatabase r0 = r2.f1978d
            return r0
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1c
            throw r1
    }
}

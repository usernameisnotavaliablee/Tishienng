package xyz.adscope.common.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DataBaseManager<T> implements xyz.adscope.common.db.inter.IDataBase {
    private xyz.adscope.common.db.storage.DatabaseHelper a;
    private android.database.sqlite.SQLiteDatabase b;
    private xyz.adscope.common.db.CommonDataBase c;
    private java.lang.String d;
    private java.lang.Class<T> e;

    public DataBaseManager(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            xyz.adscope.common.db.storage.DatabaseHelper r1 = xyz.adscope.common.db.storage.DatabaseHelper.getInstance(r1)
            r0.a = r1
            xyz.adscope.common.db.CommonDataBase r1 = new xyz.adscope.common.db.CommonDataBase
            r1.<init>()
            r0.c = r1
            xyz.adscope.common.db.storage.DatabaseHelper r1 = r0.a
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()
            r0.b = r1
            return
    }

    private synchronized void a() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.d     // Catch: java.lang.Throwable -> Ld
            boolean r0 = r1.a(r0)     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            r1.b()     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r0 = move-exception
            goto L11
        Lf:
            monitor-exit(r1)
            return
        L11:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    private synchronized boolean a(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            xyz.adscope.common.db.CommonDataBase r0 = r2.c     // Catch: java.lang.Throwable -> Lb
            android.database.sqlite.SQLiteDatabase r1 = r2.b     // Catch: java.lang.Throwable -> Lb
            boolean r3 = r0.isTableExists(r1, r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return r3
        Lb:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    private synchronized void b() {
            r5 = this;
            monitor-enter(r5)
            xyz.adscope.common.db.CommonDataBase r0 = r5.c     // Catch: java.lang.Throwable -> Lf
            android.database.sqlite.SQLiteDatabase r1 = r5.b     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r5.d     // Catch: java.lang.Throwable -> Lf
            java.lang.Class<T> r3 = r5.e     // Catch: java.lang.Throwable -> Lf
            r4 = 0
            r0.createTable(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r5)
            return
        Lf:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // xyz.adscope.common.db.inter.IDataBase
    public synchronized int delete(java.lang.Object r5) {
            r4 = this;
            monitor-enter(r4)
            r4.a()     // Catch: java.lang.Throwable -> L12
            xyz.adscope.common.db.CommonDataBase r0 = r4.c     // Catch: java.lang.Throwable -> L12
            android.database.sqlite.SQLiteDatabase r1 = r4.b     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = r4.d     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = " = ? "
            int r5 = r0.deleteTable(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)
            return r5
        L12:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r5
    }

    public synchronized int deleteOutTime(java.lang.Object r5) {
            r4 = this;
            monitor-enter(r4)
            r4.a()     // Catch: java.lang.Throwable -> L12
            xyz.adscope.common.db.CommonDataBase r0 = r4.c     // Catch: java.lang.Throwable -> L12
            android.database.sqlite.SQLiteDatabase r1 = r4.b     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = r4.d     // Catch: java.lang.Throwable -> L12
            java.lang.String r3 = " < ? "
            int r5 = r0.deleteTable(r1, r2, r3, r5)     // Catch: java.lang.Throwable -> L12
            monitor-exit(r4)
            return r5
        L12:
            r5 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L12
            throw r5
    }

    @Override // xyz.adscope.common.db.inter.IDataBase
    public synchronized java.lang.Long insert(java.lang.Object r4) {
            r3 = this;
            monitor-enter(r3)
            r3.a()     // Catch: java.lang.Throwable -> L14
            xyz.adscope.common.db.CommonDataBase r0 = r3.c     // Catch: java.lang.Throwable -> L14
            android.database.sqlite.SQLiteDatabase r1 = r3.b     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r3.d     // Catch: java.lang.Throwable -> L14
            long r0 = r0.insertTable(r1, r2, r4)     // Catch: java.lang.Throwable -> L14
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            return r4
        L14:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    public synchronized java.lang.String query(java.lang.Object r9, java.lang.String[] r10, java.lang.String r11, java.lang.String r12) {
            r8 = this;
            monitor-enter(r8)
            r8.a()     // Catch: java.lang.Throwable -> L16
            xyz.adscope.common.db.CommonDataBase r0 = r8.c     // Catch: java.lang.Throwable -> L16
            android.database.sqlite.SQLiteDatabase r1 = r8.b     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r8.d     // Catch: java.lang.Throwable -> L16
            java.lang.String r5 = " = ? "
            r3 = r9
            r4 = r10
            r6 = r11
            r7 = r12
            java.lang.String r9 = r0.querySingleData(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r8)
            return r9
        L16:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
            throw r9
    }

    @Override // xyz.adscope.common.db.inter.IDataBase
    public java.util.List query(java.lang.Object r7) {
            r6 = this;
            r6.a()
            xyz.adscope.common.db.CommonDataBase r0 = r6.c
            android.database.sqlite.SQLiteDatabase r1 = r6.b
            java.lang.String r2 = r6.d
            java.lang.Class<T> r3 = r6.e
            java.lang.String r5 = " = ? "
            r4 = r7
            java.util.List r7 = r0.queryTable(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // xyz.adscope.common.db.inter.IDataBase
    public java.util.List query(java.lang.Object r9, java.lang.String r10, java.lang.String r11) {
            r8 = this;
            r8.a()
            xyz.adscope.common.db.CommonDataBase r0 = r8.c
            android.database.sqlite.SQLiteDatabase r1 = r8.b
            java.lang.String r2 = r8.d
            java.lang.Class<T> r3 = r8.e
            java.lang.String r5 = " = ? "
            r4 = r9
            r6 = r10
            r7 = r11
            java.util.List r9 = r0.querySingleTable(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    public synchronized java.util.List query(java.lang.String r9, java.lang.String r10) {
            r8 = this;
            monitor-enter(r8)
            r8.a()     // Catch: java.lang.Throwable -> L16
            xyz.adscope.common.db.CommonDataBase r0 = r8.c     // Catch: java.lang.Throwable -> L16
            android.database.sqlite.SQLiteDatabase r1 = r8.b     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = r8.d     // Catch: java.lang.Throwable -> L16
            java.lang.Class<T> r3 = r8.e     // Catch: java.lang.Throwable -> L16
            r4 = 0
            r5 = 0
            r6 = r9
            r7 = r10
            java.util.List r9 = r0.queryTable(r1, r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L16
            monitor-exit(r8)
            return r9
        L16:
            r0 = move-exception
            r9 = r0
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L16
            throw r9
    }

    public void setTableNameAndModel(java.lang.String r1, java.lang.Class r2) {
            r0 = this;
            r0.d = r1
            r0.e = r2
            return
    }

    public synchronized int update(java.lang.Object r7, android.content.ContentValues r8) {
            r6 = this;
            monitor-enter(r6)
            xyz.adscope.common.db.CommonDataBase r0 = r6.c     // Catch: java.lang.Throwable -> L11
            android.database.sqlite.SQLiteDatabase r1 = r6.b     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = r6.d     // Catch: java.lang.Throwable -> L11
            java.lang.String r4 = " = ? "
            r5 = r7
            r3 = r8
            r0.updateTable(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L11
            monitor-exit(r6)
            r7 = 0
            return r7
        L11:
            r0 = move-exception
            r7 = r0
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L11
            throw r7
    }

    @Override // xyz.adscope.common.db.inter.IDataBase
    public synchronized int update(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            monitor-enter(r0)
            monitor-exit(r0)
            r1 = 0
            return r1
    }
}

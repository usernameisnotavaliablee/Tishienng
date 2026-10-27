package xyz.adscope.amps.tool.persistent.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSDataBaseManager<T> implements xyz.adscope.common.db.inter.IDataBase {
    private static final java.lang.String conditionEqual = " = ? ";
    private static final java.lang.String conditionLessThan = " < ? ";
    private xyz.adscope.amps.tool.persistent.db.AMPSSqliteOpenHelper ampsSqliteOpenHelper;
    private xyz.adscope.common.db.CommonDataBase commonDataBase;
    private android.database.sqlite.SQLiteDatabase sqLiteDatabase;
    private java.lang.Class<T> tClass;
    private java.lang.String tableName;

    public AMPSDataBaseManager(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            xyz.adscope.amps.tool.persistent.db.AMPSSqliteOpenHelper r1 = xyz.adscope.amps.tool.persistent.db.AMPSSqliteOpenHelper.getInstance(r1)
            r0.ampsSqliteOpenHelper = r1
            xyz.adscope.common.db.CommonDataBase r1 = new xyz.adscope.common.db.CommonDataBase
            r1.<init>()
            r0.commonDataBase = r1
            xyz.adscope.amps.tool.persistent.db.AMPSSqliteOpenHelper r1 = r0.ampsSqliteOpenHelper
            android.database.sqlite.SQLiteDatabase r1 = r1.getWritableDatabase()
            r0.sqLiteDatabase = r1
            return
    }

    private synchronized void checkTable() {
            r1 = this;
            monitor-enter(r1)
            java.lang.String r0 = r1.tableName     // Catch: java.lang.Throwable -> Ld
            boolean r0 = r1.sqlTableIsExist(r0)     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            r1.createTable()     // Catch: java.lang.Throwable -> Ld
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

    private synchronized void createTable() {
            r5 = this;
            monitor-enter(r5)
            xyz.adscope.common.db.CommonDataBase r0 = r5.commonDataBase     // Catch: java.lang.Throwable -> Lf
            android.database.sqlite.SQLiteDatabase r1 = r5.sqLiteDatabase     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r5.tableName     // Catch: java.lang.Throwable -> Lf
            java.lang.Class<T> r3 = r5.tClass     // Catch: java.lang.Throwable -> Lf
            r4 = 0
            r0.createTable(r1, r2, r3, r4)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r5)
            return
        Lf:
            r0 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    private synchronized boolean sqlTableIsExist(java.lang.String r3) {
            r2 = this;
            monitor-enter(r2)
            xyz.adscope.common.db.CommonDataBase r0 = r2.commonDataBase     // Catch: java.lang.Throwable -> Lb
            android.database.sqlite.SQLiteDatabase r1 = r2.sqLiteDatabase     // Catch: java.lang.Throwable -> Lb
            boolean r3 = r0.isTableExists(r1, r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r2)
            return r3
        Lb:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    @Override // xyz.adscope.common.db.inter.IDataBase
    public synchronized int delete(java.lang.Object r5) {
            r4 = this;
            monitor-enter(r4)
            r4.checkTable()     // Catch: java.lang.Throwable -> L12
            xyz.adscope.common.db.CommonDataBase r0 = r4.commonDataBase     // Catch: java.lang.Throwable -> L12
            android.database.sqlite.SQLiteDatabase r1 = r4.sqLiteDatabase     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = r4.tableName     // Catch: java.lang.Throwable -> L12
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
            r4.checkTable()     // Catch: java.lang.Throwable -> L12
            xyz.adscope.common.db.CommonDataBase r0 = r4.commonDataBase     // Catch: java.lang.Throwable -> L12
            android.database.sqlite.SQLiteDatabase r1 = r4.sqLiteDatabase     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = r4.tableName     // Catch: java.lang.Throwable -> L12
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
            r3.checkTable()     // Catch: java.lang.Throwable -> L14
            xyz.adscope.common.db.CommonDataBase r0 = r3.commonDataBase     // Catch: java.lang.Throwable -> L14
            android.database.sqlite.SQLiteDatabase r1 = r3.sqLiteDatabase     // Catch: java.lang.Throwable -> L14
            java.lang.String r2 = r3.tableName     // Catch: java.lang.Throwable -> L14
            long r0 = r0.insertTable(r1, r2, r4)     // Catch: java.lang.Throwable -> L14
            java.lang.Long r4 = java.lang.Long.valueOf(r0)     // Catch: java.lang.Throwable -> L14
            monitor-exit(r3)
            return r4
        L14:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L14
            throw r4
    }

    @Override // xyz.adscope.common.db.inter.IDataBase
    public java.util.List query(java.lang.Object r7) {
            r6 = this;
            r6.checkTable()
            xyz.adscope.common.db.CommonDataBase r0 = r6.commonDataBase
            android.database.sqlite.SQLiteDatabase r1 = r6.sqLiteDatabase
            java.lang.String r2 = r6.tableName
            java.lang.Class<T> r3 = r6.tClass
            java.lang.String r5 = " = ? "
            r4 = r7
            java.util.List r7 = r0.queryTable(r1, r2, r3, r4, r5)
            return r7
    }

    @Override // xyz.adscope.common.db.inter.IDataBase
    public java.util.List query(java.lang.Object r9, java.lang.String r10, java.lang.String r11) {
            r8 = this;
            r8.checkTable()
            xyz.adscope.common.db.CommonDataBase r0 = r8.commonDataBase
            android.database.sqlite.SQLiteDatabase r1 = r8.sqLiteDatabase
            java.lang.String r2 = r8.tableName
            java.lang.Class<T> r3 = r8.tClass
            java.lang.String r5 = " = ? "
            r4 = r9
            r6 = r10
            r7 = r11
            java.util.List r9 = r0.querySingleTable(r1, r2, r3, r4, r5, r6, r7)
            return r9
    }

    public void setTableNameAndModel(java.lang.String r1, java.lang.Class r2) {
            r0 = this;
            r0.tableName = r1
            r0.tClass = r2
            return
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

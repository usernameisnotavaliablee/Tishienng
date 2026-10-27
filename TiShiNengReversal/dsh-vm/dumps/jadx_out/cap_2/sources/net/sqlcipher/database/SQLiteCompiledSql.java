package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class SQLiteCompiledSql {
    private static final java.lang.String TAG = "SQLiteCompiledSql";
    net.sqlcipher.database.SQLiteDatabase mDatabase;
    private boolean mInUse;
    private java.lang.String mSqlStmt;
    long nHandle;
    long nStatement;

    SQLiteCompiledSql(net.sqlcipher.database.SQLiteDatabase r3, java.lang.String r4) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.nHandle = r0
            r2.nStatement = r0
            r0 = 0
            r2.mSqlStmt = r0
            r0 = 0
            r2.mInUse = r0
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L22
            r2.mDatabase = r3
            r2.mSqlStmt = r4
            long r0 = r3.mNativeHandle
            r2.nHandle = r0
            r3 = 1
            r2.compile(r4, r3)
            return
        L22:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "database "
            r0.append(r1)
            java.lang.String r3 = r3.getPath()
            r0.append(r3)
            java.lang.String r3 = " already closed"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    private void compile(java.lang.String r2, boolean r3) {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L20
            if (r3 == 0) goto L1f
            net.sqlcipher.database.SQLiteDatabase r3 = r1.mDatabase
            r3.lock()
            r1.native_compile(r2)     // Catch: java.lang.Throwable -> L18
            net.sqlcipher.database.SQLiteDatabase r2 = r1.mDatabase
            r2.unlock()
            return
        L18:
            r2 = move-exception
            net.sqlcipher.database.SQLiteDatabase r3 = r1.mDatabase
            r3.unlock()
            throw r2
        L1f:
            return
        L20:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "database "
            r3.append(r0)
            net.sqlcipher.database.SQLiteDatabase r0 = r1.mDatabase
            java.lang.String r0 = r0.getPath()
            r3.append(r0)
            java.lang.String r0 = " already closed"
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    private final native void native_compile(java.lang.String r1);

    private final native void native_finalize();

    synchronized boolean acquire() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.mInUse     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L8
            monitor-exit(r2)
            r0 = 0
            return r0
        L8:
            r0 = 1
            r2.mInUse = r0     // Catch: java.lang.Throwable -> Lf
            boolean r1 = net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r2)
            return r0
        Lf:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    protected void finalize() throws java.lang.Throwable {
            r5 = this;
            long r0 = r5.nStatement     // Catch: java.lang.Throwable -> L15
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Lc
            super.finalize()
            return
        Lc:
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION     // Catch: java.lang.Throwable -> L15
            r5.releaseSqlStatement()     // Catch: java.lang.Throwable -> L15
            super.finalize()
            return
        L15:
            r0 = move-exception
            super.finalize()
            throw r0
    }

    synchronized void release() {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION     // Catch: java.lang.Throwable -> L8
            r0 = 0
            r1.mInUse = r0     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    void releaseSqlStatement() {
            r5 = this;
            long r0 = r5.nStatement
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L21
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION
            net.sqlcipher.database.SQLiteDatabase r0 = r5.mDatabase     // Catch: java.lang.Throwable -> L1a
            r0.lock()     // Catch: java.lang.Throwable -> L1a
            r5.native_finalize()     // Catch: java.lang.Throwable -> L1a
            r5.nStatement = r2     // Catch: java.lang.Throwable -> L1a
            net.sqlcipher.database.SQLiteDatabase r0 = r5.mDatabase
            r0.unlock()
            return
        L1a:
            r0 = move-exception
            net.sqlcipher.database.SQLiteDatabase r1 = r5.mDatabase
            r1.unlock()
            throw r0
        L21:
            return
    }
}

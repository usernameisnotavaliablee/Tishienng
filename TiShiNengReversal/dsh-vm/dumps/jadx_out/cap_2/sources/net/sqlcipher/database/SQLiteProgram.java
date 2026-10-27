package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class SQLiteProgram extends net.sqlcipher.database.SQLiteClosable implements androidx.sqlite.db.SupportSQLiteProgram {
    private static final java.lang.String TAG = "SQLiteProgram";
    boolean mClosed;
    private net.sqlcipher.database.SQLiteCompiledSql mCompiledSql;

    @java.lang.Deprecated
    protected net.sqlcipher.database.SQLiteDatabase mDatabase;
    final java.lang.String mSql;

    @java.lang.Deprecated
    protected long nHandle;

    @java.lang.Deprecated
    protected long nStatement;

    SQLiteProgram(net.sqlcipher.database.SQLiteDatabase r5, java.lang.String r6) {
            r4 = this;
            r4.<init>()
            r0 = 0
            r4.nHandle = r0
            r4.nStatement = r0
            r0 = 0
            r4.mClosed = r0
            r4.mDatabase = r5
            java.lang.String r1 = r6.trim()
            r4.mSql = r1
            r5.acquireReference()
            r5.addSQLiteClosable(r4)
            long r2 = r5.mNativeHandle
            r4.nHandle = r2
            int r2 = r1.length()
            r3 = 6
            if (r2 < r3) goto L29
            java.lang.String r1 = r1.substring(r0, r3)
        L29:
            java.lang.String r0 = "INSERT"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "UPDATE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "REPLAC"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "DELETE"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "SELECT"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L5d
            net.sqlcipher.database.SQLiteCompiledSql r0 = new net.sqlcipher.database.SQLiteCompiledSql
            r0.<init>(r5, r6)
            r4.mCompiledSql = r0
            long r5 = r0.nStatement
            r4.nStatement = r5
            return
        L5d:
            net.sqlcipher.database.SQLiteCompiledSql r0 = r5.getCompiledStatementForSql(r6)
            r4.mCompiledSql = r0
            if (r0 != 0) goto L7d
            net.sqlcipher.database.SQLiteCompiledSql r0 = new net.sqlcipher.database.SQLiteCompiledSql
            r0.<init>(r5, r6)
            r4.mCompiledSql = r0
            r0.acquire()
            net.sqlcipher.database.SQLiteCompiledSql r0 = r4.mCompiledSql
            r5.addToCompiledQueries(r6, r0)
            boolean r5 = net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION
            if (r5 == 0) goto L96
            net.sqlcipher.database.SQLiteCompiledSql r5 = r4.mCompiledSql
            long r5 = r5.nStatement
            goto L96
        L7d:
            boolean r0 = r0.acquire()
            if (r0 != 0) goto L96
            net.sqlcipher.database.SQLiteCompiledSql r0 = r4.mCompiledSql
            long r0 = r0.nStatement
            net.sqlcipher.database.SQLiteCompiledSql r0 = new net.sqlcipher.database.SQLiteCompiledSql
            r0.<init>(r5, r6)
            r4.mCompiledSql = r0
            boolean r5 = net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION
            if (r5 == 0) goto L96
            net.sqlcipher.database.SQLiteCompiledSql r5 = r4.mCompiledSql
            long r5 = r5.nStatement
        L96:
            net.sqlcipher.database.SQLiteCompiledSql r5 = r4.mCompiledSql
            long r5 = r5.nStatement
            r4.nStatement = r5
            return
    }

    private final native void native_clear_bindings();

    private void releaseCompiledSqlIfNotInCache() {
            r3 = this;
            net.sqlcipher.database.SQLiteCompiledSql r0 = r3.mCompiledSql
            if (r0 != 0) goto L5
            return
        L5:
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r0.mCompiledQueries
            monitor-enter(r0)
            net.sqlcipher.database.SQLiteDatabase r1 = r3.mDatabase     // Catch: java.lang.Throwable -> L23
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r1.mCompiledQueries     // Catch: java.lang.Throwable -> L23
            net.sqlcipher.database.SQLiteCompiledSql r2 = r3.mCompiledSql     // Catch: java.lang.Throwable -> L23
            boolean r1 = r1.containsValue(r2)     // Catch: java.lang.Throwable -> L23
            if (r1 != 0) goto L25
            net.sqlcipher.database.SQLiteCompiledSql r1 = r3.mCompiledSql     // Catch: java.lang.Throwable -> L23
            r1.releaseSqlStatement()     // Catch: java.lang.Throwable -> L23
            r1 = 0
            r3.mCompiledSql = r1     // Catch: java.lang.Throwable -> L23
            r1 = 0
            r3.nStatement = r1     // Catch: java.lang.Throwable -> L23
            goto L2a
        L23:
            r1 = move-exception
            goto L2c
        L25:
            net.sqlcipher.database.SQLiteCompiledSql r1 = r3.mCompiledSql     // Catch: java.lang.Throwable -> L23
            r1.release()     // Catch: java.lang.Throwable -> L23
        L2a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            return
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L23
            throw r1
    }

    public void bindBlob(int r3, byte[] r4) {
            r2 = this;
            if (r4 == 0) goto L47
            boolean r0 = r2.mClosed
            if (r0 != 0) goto L3f
            net.sqlcipher.database.SQLiteDatabase r0 = r2.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L1d
            r2.acquireReference()
            r2.native_bind_blob(r3, r4)     // Catch: java.lang.Throwable -> L18
            r2.releaseReference()
            return
        L18:
            r3 = move-exception
            r2.releaseReference()
            throw r3
        L1d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "database "
            r4.append(r0)
            net.sqlcipher.database.SQLiteDatabase r0 = r2.mDatabase
            java.lang.String r0 = r0.getPath()
            r4.append(r0)
            java.lang.String r0 = " already closed"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "program already closed"
            r3.<init>(r4)
            throw r3
        L47:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "the bind value at index "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is null"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public void bindDouble(int r2, double r3) {
            r1 = this;
            boolean r0 = r1.mClosed
            if (r0 != 0) goto L3d
            net.sqlcipher.database.SQLiteDatabase r0 = r1.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L1b
            r1.acquireReference()
            r1.native_bind_double(r2, r3)     // Catch: java.lang.Throwable -> L16
            r1.releaseReference()
            return
        L16:
            r2 = move-exception
            r1.releaseReference()
            throw r2
        L1b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "database "
            r3.append(r4)
            net.sqlcipher.database.SQLiteDatabase r4 = r1.mDatabase
            java.lang.String r4 = r4.getPath()
            r3.append(r4)
            java.lang.String r4 = " already closed"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L3d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "program already closed"
            r2.<init>(r3)
            throw r2
    }

    public void bindLong(int r2, long r3) {
            r1 = this;
            boolean r0 = r1.mClosed
            if (r0 != 0) goto L3d
            net.sqlcipher.database.SQLiteDatabase r0 = r1.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L1b
            r1.acquireReference()
            r1.native_bind_long(r2, r3)     // Catch: java.lang.Throwable -> L16
            r1.releaseReference()
            return
        L16:
            r2 = move-exception
            r1.releaseReference()
            throw r2
        L1b:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "database "
            r3.append(r4)
            net.sqlcipher.database.SQLiteDatabase r4 = r1.mDatabase
            java.lang.String r4 = r4.getPath()
            r3.append(r4)
            java.lang.String r4 = " already closed"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L3d:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "program already closed"
            r2.<init>(r3)
            throw r2
    }

    public void bindNull(int r3) {
            r2 = this;
            boolean r0 = r2.mClosed
            if (r0 != 0) goto L3d
            net.sqlcipher.database.SQLiteDatabase r0 = r2.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L1b
            r2.acquireReference()
            r2.native_bind_null(r3)     // Catch: java.lang.Throwable -> L16
            r2.releaseReference()
            return
        L16:
            r3 = move-exception
            r2.releaseReference()
            throw r3
        L1b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "database "
            r0.append(r1)
            net.sqlcipher.database.SQLiteDatabase r1 = r2.mDatabase
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = " already closed"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            throw r3
        L3d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "program already closed"
            r3.<init>(r0)
            throw r3
    }

    public void bindString(int r3, java.lang.String r4) {
            r2 = this;
            if (r4 == 0) goto L47
            boolean r0 = r2.mClosed
            if (r0 != 0) goto L3f
            net.sqlcipher.database.SQLiteDatabase r0 = r2.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L1d
            r2.acquireReference()
            r2.native_bind_string(r3, r4)     // Catch: java.lang.Throwable -> L18
            r2.releaseReference()
            return
        L18:
            r3 = move-exception
            r2.releaseReference()
            throw r3
        L1d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "database "
            r4.append(r0)
            net.sqlcipher.database.SQLiteDatabase r0 = r2.mDatabase
            java.lang.String r0 = r0.getPath()
            r4.append(r0)
            java.lang.String r0 = " already closed"
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L3f:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "program already closed"
            r3.<init>(r4)
            throw r3
        L47:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "the bind value at index "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = " is null"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    public void clearBindings() {
            r3 = this;
            boolean r0 = r3.mClosed
            if (r0 != 0) goto L3d
            net.sqlcipher.database.SQLiteDatabase r0 = r3.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 == 0) goto L1b
            r3.acquireReference()
            r3.native_clear_bindings()     // Catch: java.lang.Throwable -> L16
            r3.releaseReference()
            return
        L16:
            r0 = move-exception
            r3.releaseReference()
            throw r0
        L1b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "database "
            r1.append(r2)
            net.sqlcipher.database.SQLiteDatabase r2 = r3.mDatabase
            java.lang.String r2 = r2.getPath()
            r1.append(r2)
            java.lang.String r2 = " already closed"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L3d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "program already closed"
            r0.<init>(r1)
            throw r0
    }

    public void close() {
            r2 = this;
            boolean r0 = r2.mClosed
            if (r0 == 0) goto L5
            goto Ld
        L5:
            net.sqlcipher.database.SQLiteDatabase r0 = r2.mDatabase
            boolean r0 = r0.isOpen()
            if (r0 != 0) goto Le
        Ld:
            return
        Le:
            net.sqlcipher.database.SQLiteDatabase r0 = r2.mDatabase
            r0.lock()
            r2.releaseReference()     // Catch: java.lang.Throwable -> L1f
            net.sqlcipher.database.SQLiteDatabase r0 = r2.mDatabase
            r0.unlock()
            r0 = 1
            r2.mClosed = r0
            return
        L1f:
            r0 = move-exception
            net.sqlcipher.database.SQLiteDatabase r1 = r2.mDatabase
            r1.unlock()
            throw r0
    }

    @java.lang.Deprecated
    protected void compile(java.lang.String r1, boolean r2) {
            r0 = this;
            return
    }

    java.lang.String getSqlString() {
            r1 = this;
            java.lang.String r0 = r1.mSql
            return r0
    }

    public final long getUniqueId() {
            r2 = this;
            long r0 = r2.nStatement
            return r0
    }

    protected final native void native_bind_blob(int r1, byte[] r2);

    protected final native void native_bind_double(int r1, double r2);

    protected final native void native_bind_long(int r1, long r2);

    protected final native void native_bind_null(int r1);

    protected final native void native_bind_string(int r1, java.lang.String r2);

    @java.lang.Deprecated
    protected final native void native_compile(java.lang.String r1);

    @java.lang.Deprecated
    protected final native void native_finalize();

    @Override // net.sqlcipher.database.SQLiteClosable
    protected void onAllReferencesReleased() {
            r1 = this;
            r1.releaseCompiledSqlIfNotInCache()
            net.sqlcipher.database.SQLiteDatabase r0 = r1.mDatabase
            r0.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r0 = r1.mDatabase
            r0.removeSQLiteClosable(r1)
            return
    }

    @Override // net.sqlcipher.database.SQLiteClosable
    protected void onAllReferencesReleasedFromContainer() {
            r1 = this;
            r1.releaseCompiledSqlIfNotInCache()
            net.sqlcipher.database.SQLiteDatabase r0 = r1.mDatabase
            r0.releaseReference()
            return
    }
}

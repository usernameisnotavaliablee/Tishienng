package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SQLiteDirectCursorDriver implements net.sqlcipher.database.SQLiteCursorDriver {
    private net.sqlcipher.Cursor mCursor;
    private net.sqlcipher.database.SQLiteDatabase mDatabase;
    private java.lang.String mEditTable;
    private net.sqlcipher.database.SQLiteQuery mQuery;
    private java.lang.String mSql;

    public SQLiteDirectCursorDriver(net.sqlcipher.database.SQLiteDatabase r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.mDatabase = r1
            r0.mEditTable = r3
            r0.mSql = r2
            return
    }

    @Override // net.sqlcipher.database.SQLiteCursorDriver
    public void cursorClosed() {
            r1 = this;
            r0 = 0
            r1.mCursor = r0
            return
    }

    @Override // net.sqlcipher.database.SQLiteCursorDriver
    public void cursorDeactivated() {
            r0 = this;
            return
    }

    @Override // net.sqlcipher.database.SQLiteCursorDriver
    public void cursorRequeried(android.database.Cursor r1) {
            r0 = this;
            return
    }

    public net.sqlcipher.Cursor query(net.sqlcipher.database.SQLiteDatabase.CursorFactory r5, java.lang.Object[] r6) {
            r4 = this;
            net.sqlcipher.database.SQLiteQuery r0 = new net.sqlcipher.database.SQLiteQuery
            net.sqlcipher.database.SQLiteDatabase r1 = r4.mDatabase
            java.lang.String r2 = r4.mSql
            r3 = 0
            r0.<init>(r1, r2, r3, r6)
            r0.bindArguments(r6)     // Catch: java.lang.Throwable -> L1b
            if (r5 != 0) goto L1d
            net.sqlcipher.database.SQLiteCursor r5 = new net.sqlcipher.database.SQLiteCursor     // Catch: java.lang.Throwable -> L1b
            net.sqlcipher.database.SQLiteDatabase r6 = r4.mDatabase     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r4.mEditTable     // Catch: java.lang.Throwable -> L1b
            r5.<init>(r6, r4, r1, r0)     // Catch: java.lang.Throwable -> L1b
            r4.mCursor = r5     // Catch: java.lang.Throwable -> L1b
            goto L27
        L1b:
            r5 = move-exception
            goto L2e
        L1d:
            net.sqlcipher.database.SQLiteDatabase r6 = r4.mDatabase     // Catch: java.lang.Throwable -> L1b
            java.lang.String r1 = r4.mEditTable     // Catch: java.lang.Throwable -> L1b
            net.sqlcipher.Cursor r5 = r5.newCursor(r6, r4, r1, r0)     // Catch: java.lang.Throwable -> L1b
            r4.mCursor = r5     // Catch: java.lang.Throwable -> L1b
        L27:
            r4.mQuery = r0     // Catch: java.lang.Throwable -> L1b
            net.sqlcipher.Cursor r5 = r4.mCursor     // Catch: java.lang.Throwable -> L2c
            return r5
        L2c:
            r5 = move-exception
            r0 = 0
        L2e:
            if (r0 == 0) goto L33
            r0.close()
        L33:
            throw r5
    }

    @Override // net.sqlcipher.database.SQLiteCursorDriver
    public net.sqlcipher.Cursor query(net.sqlcipher.database.SQLiteDatabase.CursorFactory r5, java.lang.String[] r6) {
            r4 = this;
            net.sqlcipher.database.SQLiteQuery r0 = new net.sqlcipher.database.SQLiteQuery
            net.sqlcipher.database.SQLiteDatabase r1 = r4.mDatabase
            java.lang.String r2 = r4.mSql
            r3 = 0
            r0.<init>(r1, r2, r3, r6)
            if (r6 != 0) goto Le
            r1 = 0
            goto Lf
        Le:
            int r1 = r6.length     // Catch: java.lang.Throwable -> L1a
        Lf:
            if (r3 >= r1) goto L1c
            int r2 = r3 + 1
            r3 = r6[r3]     // Catch: java.lang.Throwable -> L1a
            r0.bindString(r2, r3)     // Catch: java.lang.Throwable -> L1a
            r3 = r2
            goto Lf
        L1a:
            r5 = move-exception
            goto L3b
        L1c:
            if (r5 != 0) goto L2a
            net.sqlcipher.database.SQLiteCursor r5 = new net.sqlcipher.database.SQLiteCursor     // Catch: java.lang.Throwable -> L1a
            net.sqlcipher.database.SQLiteDatabase r6 = r4.mDatabase     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r4.mEditTable     // Catch: java.lang.Throwable -> L1a
            r5.<init>(r6, r4, r1, r0)     // Catch: java.lang.Throwable -> L1a
            r4.mCursor = r5     // Catch: java.lang.Throwable -> L1a
            goto L34
        L2a:
            net.sqlcipher.database.SQLiteDatabase r6 = r4.mDatabase     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = r4.mEditTable     // Catch: java.lang.Throwable -> L1a
            net.sqlcipher.Cursor r5 = r5.newCursor(r6, r4, r1, r0)     // Catch: java.lang.Throwable -> L1a
            r4.mCursor = r5     // Catch: java.lang.Throwable -> L1a
        L34:
            r4.mQuery = r0     // Catch: java.lang.Throwable -> L1a
            net.sqlcipher.Cursor r5 = r4.mCursor     // Catch: java.lang.Throwable -> L39
            return r5
        L39:
            r5 = move-exception
            r0 = 0
        L3b:
            if (r0 == 0) goto L40
            r0.close()
        L40:
            throw r5
    }

    @Override // net.sqlcipher.database.SQLiteCursorDriver
    public void setBindArguments(java.lang.String[] r5) {
            r4 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lf
            net.sqlcipher.database.SQLiteQuery r2 = r4.mQuery
            int r3 = r1 + 1
            r1 = r5[r1]
            r2.bindString(r3, r1)
            r1 = r3
            goto L2
        Lf:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SQLiteDirectCursorDriver: "
            r0.append(r1)
            java.lang.String r1 = r2.mSql
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

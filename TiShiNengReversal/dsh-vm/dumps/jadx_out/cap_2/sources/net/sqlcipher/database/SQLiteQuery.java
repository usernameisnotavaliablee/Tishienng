package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SQLiteQuery extends net.sqlcipher.database.SQLiteProgram {
    private static final java.lang.String TAG = "Cursor";
    private java.lang.String[] mBindArgs;
    private java.lang.Object[] mObjectBindArgs;
    private int mOffsetIndex;

    SQLiteQuery(net.sqlcipher.database.SQLiteDatabase r1, java.lang.String r2, int r3, java.lang.Object[] r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mOffsetIndex = r3
            r0.mObjectBindArgs = r4
            if (r4 == 0) goto Lb
            int r1 = r4.length
            goto Lc
        Lb:
            r1 = 0
        Lc:
            java.lang.String[] r1 = new java.lang.String[r1]
            r0.mBindArgs = r1
            return
    }

    SQLiteQuery(net.sqlcipher.database.SQLiteDatabase r1, java.lang.String r2, int r3, java.lang.String[] r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mOffsetIndex = r3
            r0.mBindArgs = r4
            return
    }

    private final native int native_column_count();

    private final native java.lang.String native_column_name(int r1);

    private final native int native_fill_window(net.sqlcipher.CursorWindow r1, int r2, int r3, int r4, int r5, int r6);

    public void bindArguments(java.lang.Object[] r6) {
            r5 = this;
            if (r6 == 0) goto L85
            int r0 = r6.length
            if (r0 <= 0) goto L85
            r0 = 0
        L6:
            int r1 = r6.length
            if (r0 >= r1) goto L85
            r1 = r6[r0]
            if (r1 != 0) goto L14
            int r1 = r0 + 1
            r5.bindNull(r1)
            goto L82
        L14:
            boolean r2 = r1 instanceof java.lang.Double
            if (r2 == 0) goto L24
            int r2 = r0 + 1
            java.lang.Double r1 = (java.lang.Double) r1
            double r3 = r1.doubleValue()
            r5.bindDouble(r2, r3)
            goto L82
        L24:
            boolean r2 = r1 instanceof java.lang.Float
            if (r2 == 0) goto L35
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            int r2 = r0 + 1
            double r3 = (double) r1
            r5.bindDouble(r2, r3)
            goto L82
        L35:
            boolean r2 = r1 instanceof java.lang.Long
            if (r2 == 0) goto L45
            int r2 = r0 + 1
            java.lang.Long r1 = (java.lang.Long) r1
            long r3 = r1.longValue()
            r5.bindLong(r2, r3)
            goto L82
        L45:
            boolean r2 = r1 instanceof java.lang.Integer
            if (r2 == 0) goto L56
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            int r2 = r0 + 1
            long r3 = (long) r1
            r5.bindLong(r2, r3)
            goto L82
        L56:
            boolean r2 = r1 instanceof java.lang.Boolean
            if (r2 == 0) goto L6d
            int r2 = r0 + 1
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L67
            r3 = 1
            goto L69
        L67:
            r3 = 0
        L69:
            r5.bindLong(r2, r3)
            goto L82
        L6d:
            boolean r2 = r1 instanceof byte[]
            if (r2 == 0) goto L79
            int r2 = r0 + 1
            byte[] r1 = (byte[]) r1
            r5.bindBlob(r2, r1)
            goto L82
        L79:
            int r2 = r0 + 1
            java.lang.String r1 = r1.toString()
            r5.bindString(r2, r1)
        L82:
            int r0 = r0 + 1
            goto L6
        L85:
            return
    }

    @Override // net.sqlcipher.database.SQLiteProgram
    public void bindDouble(int r4, double r5) {
            r3 = this;
            java.lang.String[] r0 = r3.mBindArgs
            int r1 = r4 + (-1)
            java.lang.String r2 = java.lang.Double.toString(r5)
            r0[r1] = r2
            boolean r0 = r3.mClosed
            if (r0 != 0) goto L11
            super.bindDouble(r4, r5)
        L11:
            return
    }

    @Override // net.sqlcipher.database.SQLiteProgram
    public void bindLong(int r4, long r5) {
            r3 = this;
            java.lang.String[] r0 = r3.mBindArgs
            int r1 = r4 + (-1)
            java.lang.String r2 = java.lang.Long.toString(r5)
            r0[r1] = r2
            boolean r0 = r3.mClosed
            if (r0 != 0) goto L11
            super.bindLong(r4, r5)
        L11:
            return
    }

    @Override // net.sqlcipher.database.SQLiteProgram
    public void bindNull(int r4) {
            r3 = this;
            java.lang.String[] r0 = r3.mBindArgs
            int r1 = r4 + (-1)
            r2 = 0
            r0[r1] = r2
            boolean r0 = r3.mClosed
            if (r0 != 0) goto Le
            super.bindNull(r4)
        Le:
            return
    }

    @Override // net.sqlcipher.database.SQLiteProgram
    public void bindString(int r3, java.lang.String r4) {
            r2 = this;
            java.lang.String[] r0 = r2.mBindArgs
            int r1 = r3 + (-1)
            r0[r1] = r4
            boolean r0 = r2.mClosed
            if (r0 != 0) goto Ld
            super.bindString(r3, r4)
        Ld:
            return
    }

    int columnCountLocked() {
            r1 = this;
            r1.acquireReference()
            int r0 = r1.native_column_count()     // Catch: java.lang.Throwable -> Lb
            r1.releaseReference()
            return r0
        Lb:
            r0 = move-exception
            r1.releaseReference()
            throw r0
    }

    java.lang.String columnNameLocked(int r1) {
            r0 = this;
            r0.acquireReference()
            java.lang.String r1 = r0.native_column_name(r1)     // Catch: java.lang.Throwable -> Lb
            r0.releaseReference()
            return r1
        Lb:
            r1 = move-exception
            r0.releaseReference()
            throw r1
    }

    int fillWindow(net.sqlcipher.CursorWindow r9, int r10, int r11) {
            r8 = this;
            android.os.SystemClock.uptimeMillis()
            net.sqlcipher.database.SQLiteDatabase r0 = r8.mDatabase
            r0.lock()
            r8.acquireReference()     // Catch: java.lang.Throwable -> L59
            r9.acquireReference()     // Catch: java.lang.Throwable -> L37 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L3b java.lang.IllegalStateException -> L3f
            int r3 = r9.getStartPosition()     // Catch: java.lang.Throwable -> L37 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L3b java.lang.IllegalStateException -> L3f
            int r4 = r9.getRequiredPosition()     // Catch: java.lang.Throwable -> L37 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L3b java.lang.IllegalStateException -> L3f
            int r5 = r8.mOffsetIndex     // Catch: java.lang.Throwable -> L37 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L3b java.lang.IllegalStateException -> L3f
            r1 = r8
            r2 = r9
            r6 = r10
            r7 = r11
            int r9 = r1.native_fill_window(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L31 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L34 java.lang.IllegalStateException -> L4c
            boolean r10 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS     // Catch: java.lang.Throwable -> L31 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L34 java.lang.IllegalStateException -> L4c
            r2.releaseReference()     // Catch: java.lang.Throwable -> L2e
            r8.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r10 = r1.mDatabase
            r10.unlock()
            return r9
        L2e:
            r0 = move-exception
        L2f:
            r9 = r0
            goto L5c
        L31:
            r0 = move-exception
        L32:
            r9 = r0
            goto L48
        L34:
            r0 = move-exception
        L35:
            r9 = r0
            goto L42
        L37:
            r0 = move-exception
            r1 = r8
            r2 = r9
            goto L32
        L3b:
            r0 = move-exception
            r1 = r8
            r2 = r9
            goto L35
        L3f:
            r1 = r8
            r2 = r9
            goto L4c
        L42:
            net.sqlcipher.database.SQLiteDatabase r10 = r1.mDatabase     // Catch: java.lang.Throwable -> L31
            r10.onCorruption()     // Catch: java.lang.Throwable -> L31
            throw r9     // Catch: java.lang.Throwable -> L31
        L48:
            r2.releaseReference()     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L4c:
            r2.releaseReference()     // Catch: java.lang.Throwable -> L2e
            r8.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r9 = r1.mDatabase
            r9.unlock()
            r9 = 0
            return r9
        L59:
            r0 = move-exception
            r1 = r8
            goto L2f
        L5c:
            r8.releaseReference()
            net.sqlcipher.database.SQLiteDatabase r10 = r1.mDatabase
            r10.unlock()
            throw r9
    }

    void requery() {
            r6 = this;
            java.lang.String[] r0 = r6.mBindArgs
            if (r0 == 0) goto L54
            int r0 = r0.length
            r1 = 0
            java.lang.Object[] r2 = r6.mObjectBindArgs     // Catch: net.sqlcipher.database.SQLiteMisuseException -> Le
            if (r2 == 0) goto L10
            r6.bindArguments(r2)     // Catch: net.sqlcipher.database.SQLiteMisuseException -> Le
            return
        Le:
            r2 = move-exception
            goto L1e
        L10:
            r2 = 0
        L11:
            if (r2 >= r0) goto L54
            int r3 = r2 + 1
            java.lang.String[] r4 = r6.mBindArgs     // Catch: net.sqlcipher.database.SQLiteMisuseException -> Le
            r2 = r4[r2]     // Catch: net.sqlcipher.database.SQLiteMisuseException -> Le
            super.bindString(r3, r2)     // Catch: net.sqlcipher.database.SQLiteMisuseException -> Le
            r2 = r3
            goto L11
        L1e:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "mSql "
            r4.append(r5)
            java.lang.String r5 = r6.mSql
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
        L36:
            java.lang.String r4 = " "
            if (r1 >= r0) goto L47
            r3.append(r4)
            java.lang.String[] r4 = r6.mBindArgs
            r4 = r4[r1]
            r3.append(r4)
            int r1 = r1 + 1
            goto L36
        L47:
            r3.append(r4)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r3.toString()
            r0.<init>(r1, r2)
            throw r0
        L54:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SQLiteQuery: "
            r0.append(r1)
            java.lang.String r1 = r2.mSql
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class BulkCursorToCursorAdaptor extends net.sqlcipher.AbstractWindowedCursor {
    private static final java.lang.String TAG = "BulkCursor";
    private net.sqlcipher.IBulkCursor mBulkCursor;
    private java.lang.String[] mColumns;
    private int mCount;
    private net.sqlcipher.AbstractCursor.SelfContentObserver mObserverBridge;
    private boolean mWantsAllOnMoveCalls;

    public BulkCursorToCursorAdaptor() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int findRowIdColumnIndex(java.lang.String[] r4) {
            int r0 = r4.length
            r1 = 0
        L2:
            if (r1 >= r0) goto L12
            r2 = r4[r1]
            java.lang.String r3 = "_id"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto Lf
            return r1
        Lf:
            int r1 = r1 + 1
            goto L2
        L12:
            r4 = -1
            return r4
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            super.close()
            net.sqlcipher.IBulkCursor r0 = r1.mBulkCursor     // Catch: android.os.RemoteException -> L8
            r0.close()     // Catch: android.os.RemoteException -> L8
        L8:
            r0 = 0
            r1.mWindow = r0
            return
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean commitUpdates(java.util.Map<? extends java.lang.Long, ? extends java.util.Map<java.lang.String, java.lang.Object>> r5) {
            r4 = this;
            boolean r0 = r4.supportsUpdates()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r4.mUpdatedRows
            monitor-enter(r0)
            if (r5 == 0) goto L15
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.mUpdatedRows     // Catch: java.lang.Throwable -> L13
            r2.putAll(r5)     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r5 = move-exception
            goto L36
        L15:
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r5 = r4.mUpdatedRows     // Catch: java.lang.Throwable -> L13
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L13
            if (r5 > 0) goto L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L1f:
            net.sqlcipher.IBulkCursor r5 = r4.mBulkCursor     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L34
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.mUpdatedRows     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L34
            boolean r5 = r5.updateRows(r2)     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L34
            r2 = 1
            if (r5 != r2) goto L32
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.mUpdatedRows     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L34
            r3.clear()     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L34
            r4.onChange(r2)     // Catch: java.lang.Throwable -> L13 android.os.RemoteException -> L34
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r5
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r1
        L36:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r5
    }

    @Override // net.sqlcipher.AbstractWindowedCursor, net.sqlcipher.AbstractCursor, android.database.Cursor
    public void copyStringToBuffer(int r1, android.database.CharArrayBuffer r2) {
            r0 = this;
            return
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void deactivate() {
            r1 = this;
            super.deactivate()
            net.sqlcipher.IBulkCursor r0 = r1.mBulkCursor     // Catch: android.os.RemoteException -> L8
            r0.deactivate()     // Catch: android.os.RemoteException -> L8
        L8:
            r0 = 0
            r1.mWindow = r0
            return
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean deleteRow() {
            r3 = this;
            net.sqlcipher.IBulkCursor r0 = r3.mBulkCursor     // Catch: android.os.RemoteException -> L27
            int r1 = r3.mPos     // Catch: android.os.RemoteException -> L27
            boolean r0 = r0.deleteRow(r1)     // Catch: android.os.RemoteException -> L27
            if (r0 == 0) goto L26
            r1 = 0
            r3.mWindow = r1     // Catch: android.os.RemoteException -> L27
            net.sqlcipher.IBulkCursor r1 = r3.mBulkCursor     // Catch: android.os.RemoteException -> L27
            int r1 = r1.count()     // Catch: android.os.RemoteException -> L27
            r3.mCount = r1     // Catch: android.os.RemoteException -> L27
            int r2 = r3.mPos     // Catch: android.os.RemoteException -> L27
            if (r2 >= r1) goto L20
            r1 = -1
            r3.mPos = r1     // Catch: android.os.RemoteException -> L27
            r3.moveToPosition(r2)     // Catch: android.os.RemoteException -> L27
            goto L22
        L20:
            r3.mPos = r1     // Catch: android.os.RemoteException -> L27
        L22:
            r1 = 1
            r3.onChange(r1)     // Catch: android.os.RemoteException -> L27
        L26:
            return r0
        L27:
            r0 = 0
            return r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
            r1 = this;
            java.lang.String[] r0 = r1.mColumns
            if (r0 != 0) goto Lf
            net.sqlcipher.IBulkCursor r0 = r1.mBulkCursor     // Catch: android.os.RemoteException -> Ld
            java.lang.String[] r0 = r0.getColumnNames()     // Catch: android.os.RemoteException -> Ld
            r1.mColumns = r0     // Catch: android.os.RemoteException -> Ld
            goto Lf
        Ld:
            r0 = 0
            return r0
        Lf:
            java.lang.String[] r0 = r1.mColumns
            return r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getCount() {
            r1 = this;
            int r0 = r1.mCount
            return r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public android.os.Bundle getExtras() {
            r2 = this;
            net.sqlcipher.IBulkCursor r0 = r2.mBulkCursor     // Catch: android.os.RemoteException -> L7
            android.os.Bundle r0 = r0.getExtras()     // Catch: android.os.RemoteException -> L7
            return r0
        L7:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            r1.<init>(r0)
            throw r1
    }

    public synchronized net.sqlcipher.IContentObserver getObserver() {
            r1 = this;
            monitor-enter(r1)
            net.sqlcipher.AbstractCursor$SelfContentObserver r0 = r1.mObserverBridge     // Catch: java.lang.Throwable -> Ld
            if (r0 != 0) goto Lf
            net.sqlcipher.AbstractCursor$SelfContentObserver r0 = new net.sqlcipher.AbstractCursor$SelfContentObserver     // Catch: java.lang.Throwable -> Ld
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Ld
            r1.mObserverBridge = r0     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r0 = move-exception
            goto L12
        Lf:
            monitor-exit(r1)
            r0 = 0
            return r0
        L12:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Ld
            throw r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int r3, int r4) {
            r2 = this;
            r3 = 0
            net.sqlcipher.CursorWindow r0 = r2.mWindow     // Catch: android.os.RemoteException -> L3c
            if (r0 == 0) goto L2e
            int r0 = r0.getStartPosition()     // Catch: android.os.RemoteException -> L3c
            if (r4 < r0) goto L25
            net.sqlcipher.CursorWindow r0 = r2.mWindow     // Catch: android.os.RemoteException -> L3c
            int r0 = r0.getStartPosition()     // Catch: android.os.RemoteException -> L3c
            net.sqlcipher.CursorWindow r1 = r2.mWindow     // Catch: android.os.RemoteException -> L3c
            int r1 = r1.getNumRows()     // Catch: android.os.RemoteException -> L3c
            int r0 = r0 + r1
            if (r4 < r0) goto L1b
            goto L25
        L1b:
            boolean r0 = r2.mWantsAllOnMoveCalls     // Catch: android.os.RemoteException -> L3c
            if (r0 == 0) goto L36
            net.sqlcipher.IBulkCursor r0 = r2.mBulkCursor     // Catch: android.os.RemoteException -> L3c
            r0.onMove(r4)     // Catch: android.os.RemoteException -> L3c
            goto L36
        L25:
            net.sqlcipher.IBulkCursor r0 = r2.mBulkCursor     // Catch: android.os.RemoteException -> L3c
            net.sqlcipher.CursorWindow r4 = r0.getWindow(r4)     // Catch: android.os.RemoteException -> L3c
            r2.mWindow = r4     // Catch: android.os.RemoteException -> L3c
            goto L36
        L2e:
            net.sqlcipher.IBulkCursor r0 = r2.mBulkCursor     // Catch: android.os.RemoteException -> L3c
            net.sqlcipher.CursorWindow r4 = r0.getWindow(r4)     // Catch: android.os.RemoteException -> L3c
            r2.mWindow = r4     // Catch: android.os.RemoteException -> L3c
        L36:
            net.sqlcipher.CursorWindow r4 = r2.mWindow
            if (r4 != 0) goto L3b
            return r3
        L3b:
            r3 = 1
        L3c:
            return r3
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver r1) {
            r0 = this;
            return
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver r1) {
            r0 = this;
            return
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public boolean requery() {
            r4 = this;
            r0 = 0
            net.sqlcipher.IBulkCursor r1 = r4.mBulkCursor     // Catch: java.lang.Exception -> L1f
            net.sqlcipher.IContentObserver r2 = r4.getObserver()     // Catch: java.lang.Exception -> L1f
            net.sqlcipher.CursorWindow r3 = new net.sqlcipher.CursorWindow     // Catch: java.lang.Exception -> L1f
            r3.<init>(r0)     // Catch: java.lang.Exception -> L1f
            int r1 = r1.requery(r2, r3)     // Catch: java.lang.Exception -> L1f
            r4.mCount = r1     // Catch: java.lang.Exception -> L1f
            r2 = -1
            if (r1 == r2) goto L21
            r4.mPos = r2     // Catch: java.lang.Exception -> L1f
            r1 = 0
            r4.mWindow = r1     // Catch: java.lang.Exception -> L1f
            super.requery()     // Catch: java.lang.Exception -> L1f
            r0 = 1
            return r0
        L1f:
            r1 = move-exception
            goto L25
        L21:
            r4.deactivate()     // Catch: java.lang.Exception -> L1f
            return r0
        L25:
            r1.getMessage()
            r4.deactivate()
            return r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle r2) {
            r1 = this;
            net.sqlcipher.IBulkCursor r0 = r1.mBulkCursor     // Catch: android.os.RemoteException -> L7
            android.os.Bundle r2 = r0.respond(r2)     // Catch: android.os.RemoteException -> L7
            return r2
        L7:
            android.os.Bundle r2 = android.os.Bundle.EMPTY
            return r2
    }

    public void set(net.sqlcipher.IBulkCursor r1) {
            r0 = this;
            r0.mBulkCursor = r1
            int r1 = r1.count()     // Catch: android.os.RemoteException -> L1e
            r0.mCount = r1     // Catch: android.os.RemoteException -> L1e
            net.sqlcipher.IBulkCursor r1 = r0.mBulkCursor     // Catch: android.os.RemoteException -> L1e
            boolean r1 = r1.getWantsAllOnMoveCalls()     // Catch: android.os.RemoteException -> L1e
            r0.mWantsAllOnMoveCalls = r1     // Catch: android.os.RemoteException -> L1e
            net.sqlcipher.IBulkCursor r1 = r0.mBulkCursor     // Catch: android.os.RemoteException -> L1e
            java.lang.String[] r1 = r1.getColumnNames()     // Catch: android.os.RemoteException -> L1e
            r0.mColumns = r1     // Catch: android.os.RemoteException -> L1e
            int r1 = findRowIdColumnIndex(r1)     // Catch: android.os.RemoteException -> L1e
            r0.mRowIdColumnIndex = r1     // Catch: android.os.RemoteException -> L1e
        L1e:
            return
    }

    public void set(net.sqlcipher.IBulkCursor r1, int r2, int r3) {
            r0 = this;
            r0.mBulkCursor = r1
            r1 = 0
            r0.mColumns = r1
            r0.mCount = r2
            r0.mRowIdColumnIndex = r3
            return
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver r1) {
            r0 = this;
            return
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver r1) {
            r0 = this;
            return
    }
}

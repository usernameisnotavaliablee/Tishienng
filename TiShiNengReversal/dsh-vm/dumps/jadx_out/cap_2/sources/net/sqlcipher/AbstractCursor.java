package net.sqlcipher;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class AbstractCursor implements android.database.CrossProcessCursor, net.sqlcipher.Cursor {
    private static final java.lang.String TAG = "Cursor";
    protected boolean mClosed;
    android.database.ContentObservable mContentObservable;
    protected android.content.ContentResolver mContentResolver;
    protected java.lang.Long mCurrentRowID;
    android.database.DataSetObservable mDataSetObservable;
    private android.os.Bundle mExtras;
    private android.net.Uri mNotifyUri;
    protected int mPos;
    protected int mRowIdColumnIndex;
    private android.database.ContentObserver mSelfObserver;
    private final java.lang.Object mSelfObserverLock;
    private boolean mSelfObserverRegistered;
    protected java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> mUpdatedRows;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static class SelfContentObserver extends android.database.ContentObserver {
        java.lang.ref.WeakReference<net.sqlcipher.AbstractCursor> mCursor;

        public SelfContentObserver(net.sqlcipher.AbstractCursor r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r0)
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mCursor = r0
                return
        }

        @Override // android.database.ContentObserver
        public boolean deliverSelfNotifications() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.database.ContentObserver
        public void onChange(boolean r2) {
                r1 = this;
                java.lang.ref.WeakReference<net.sqlcipher.AbstractCursor> r2 = r1.mCursor
                java.lang.Object r2 = r2.get()
                net.sqlcipher.AbstractCursor r2 = (net.sqlcipher.AbstractCursor) r2
                if (r2 == 0) goto Le
                r0 = 0
                r2.onChange(r0)
            Le:
                return
        }
    }

    public AbstractCursor() {
            r1 = this;
            r1.<init>()
            android.database.DataSetObservable r0 = new android.database.DataSetObservable
            r0.<init>()
            r1.mDataSetObservable = r0
            android.database.ContentObservable r0 = new android.database.ContentObservable
            r0.<init>()
            r1.mContentObservable = r0
            android.os.Bundle r0 = android.os.Bundle.EMPTY
            r1.mExtras = r0
            r0 = 0
            r1.mClosed = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mSelfObserverLock = r0
            r0 = -1
            r1.mPos = r0
            r1.mRowIdColumnIndex = r0
            r0 = 0
            r1.mCurrentRowID = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.mUpdatedRows = r0
            return
    }

    public void abortUpdates() {
            r2 = this;
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.mUpdatedRows     // Catch: java.lang.Throwable -> La
            r1.clear()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    protected void checkPosition() {
            r3 = this;
            r0 = -1
            int r1 = r3.mPos
            if (r0 == r1) goto Le
            int r0 = r3.getCount()
            int r1 = r3.mPos
            if (r0 == r1) goto Le
            return
        Le:
            net.sqlcipher.CursorIndexOutOfBoundsException r0 = new net.sqlcipher.CursorIndexOutOfBoundsException
            int r1 = r3.mPos
            int r2 = r3.getCount()
            r0.<init>(r1, r2)
            throw r0
    }

    @Override // android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            r0 = 1
            r1.mClosed = r0
            android.database.ContentObservable r0 = r1.mContentObservable
            r0.unregisterAll()
            r1.deactivateInternal()
            return
    }

    public boolean commitUpdates() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.commitUpdates(r0)
            return r0
    }

    public boolean commitUpdates(java.util.Map<? extends java.lang.Long, ? extends java.util.Map<java.lang.String, java.lang.Object>> r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    @Override // android.database.Cursor
    public void copyStringToBuffer(int r5, android.database.CharArrayBuffer r6) {
            r4 = this;
            java.lang.String r5 = r4.getString(r5)
            r0 = 0
            if (r5 == 0) goto L28
            char[] r1 = r6.data
            if (r1 == 0) goto L1b
            int r2 = r1.length
            int r3 = r5.length()
            if (r2 >= r3) goto L13
            goto L1b
        L13:
            int r2 = r5.length()
            r5.getChars(r0, r2, r1, r0)
            goto L21
        L1b:
            char[] r0 = r5.toCharArray()
            r6.data = r0
        L21:
            int r5 = r5.length()
            r6.sizeCopied = r5
            return
        L28:
            r6.sizeCopied = r0
            return
    }

    @Override // android.database.Cursor
    public void deactivate() {
            r0 = this;
            r0.deactivateInternal()
            return
    }

    public void deactivateInternal() {
            r2 = this;
            android.database.ContentObserver r0 = r2.mSelfObserver
            if (r0 == 0) goto Lc
            android.content.ContentResolver r1 = r2.mContentResolver
            r1.unregisterContentObserver(r0)
            r0 = 0
            r2.mSelfObserverRegistered = r0
        Lc:
            android.database.DataSetObservable r0 = r2.mDataSetObservable
            r0.notifyInvalidated()
            return
    }

    public boolean deleteRow() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.database.CrossProcessCursor
    public void fillWindow(int r1, android.database.CursorWindow r2) {
            r0 = this;
            net.sqlcipher.DatabaseUtils.cursorFillWindow(r0, r1, r2)
            return
    }

    protected void finalize() {
            r3 = this;
            android.database.ContentObserver r0 = r3.mSelfObserver
            if (r0 == 0) goto Le
            boolean r1 = r3.mSelfObserverRegistered
            r2 = 1
            if (r1 != r2) goto Le
            android.content.ContentResolver r1 = r3.mContentResolver
            r1.unregisterContentObserver(r0)
        Le:
            return
    }

    @Override // android.database.Cursor
    public byte[] getBlob(int r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "getBlob is not supported"
            r2.<init>(r0)
            throw r2
    }

    @Override // android.database.Cursor
    public int getColumnCount() {
            r1 = this;
            java.lang.String[] r0 = r1.getColumnNames()
            int r0 = r0.length
            return r0
    }

    @Override // android.database.Cursor
    public int getColumnIndex(java.lang.String r6) {
            r5 = this;
            r0 = 46
            int r0 = r6.lastIndexOf(r0)
            r1 = -1
            if (r0 == r1) goto L14
            java.lang.Exception r2 = new java.lang.Exception
            r2.<init>()
            int r0 = r0 + 1
            java.lang.String r6 = r6.substring(r0)
        L14:
            java.lang.String[] r0 = r5.getColumnNames()
            int r2 = r0.length
            r3 = 0
        L1a:
            if (r3 >= r2) goto L28
            r4 = r0[r3]
            boolean r4 = r4.equalsIgnoreCase(r6)
            if (r4 == 0) goto L25
            return r3
        L25:
            int r3 = r3 + 1
            goto L1a
        L28:
            return r1
    }

    @Override // android.database.Cursor
    public int getColumnIndexOrThrow(java.lang.String r4) {
            r3 = this;
            int r0 = r3.getColumnIndex(r4)
            if (r0 < 0) goto L7
            return r0
        L7:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "column '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "' does not exist"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // android.database.Cursor
    public java.lang.String getColumnName(int r2) {
            r1 = this;
            java.lang.String[] r0 = r1.getColumnNames()
            r2 = r0[r2]
            return r2
    }

    @Override // android.database.Cursor
    public abstract java.lang.String[] getColumnNames();

    @Override // android.database.Cursor
    public abstract int getCount();

    protected android.database.DataSetObservable getDataSetObservable() {
            r1 = this;
            android.database.DataSetObservable r0 = r1.mDataSetObservable
            return r0
    }

    @Override // android.database.Cursor
    public abstract double getDouble(int r1);

    @Override // android.database.Cursor
    public android.os.Bundle getExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.mExtras
            return r0
    }

    @Override // android.database.Cursor
    public abstract float getFloat(int r1);

    @Override // android.database.Cursor
    public abstract int getInt(int r1);

    @Override // android.database.Cursor
    public abstract long getLong(int r1);

    @Override // android.database.Cursor
    public android.net.Uri getNotificationUri() {
            r1 = this;
            android.net.Uri r0 = r1.mNotifyUri
            return r0
    }

    @Override // android.database.Cursor
    public final int getPosition() {
            r1 = this;
            int r0 = r1.mPos
            return r0
    }

    @Override // android.database.Cursor
    public abstract short getShort(int r1);

    @Override // android.database.Cursor
    public abstract java.lang.String getString(int r1);

    @Override // android.database.Cursor, net.sqlcipher.Cursor
    public abstract int getType(int r1);

    protected java.lang.Object getUpdatedField(int r3) {
            r2 = this;
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            java.lang.Long r1 = r2.mCurrentRowID
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            java.lang.String[] r1 = r2.getColumnNames()
            r3 = r1[r3]
            java.lang.Object r3 = r0.get(r3)
            return r3
    }

    @Override // android.database.Cursor
    public boolean getWantsAllOnMoveCalls() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // android.database.CrossProcessCursor
    public /* bridge */ /* synthetic */ android.database.CursorWindow getWindow() {
            r1 = this;
            net.sqlcipher.CursorWindow r0 = r1.getWindow()
            return r0
    }

    @Override // android.database.CrossProcessCursor
    public net.sqlcipher.CursorWindow getWindow() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean hasUpdates() {
            r2 = this;
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            monitor-enter(r0)
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r1 = r2.mUpdatedRows     // Catch: java.lang.Throwable -> L10
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L10
            if (r1 <= 0) goto Ld
            r1 = 1
            goto Le
        Ld:
            r1 = 0
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            return r1
        L10:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L10
            throw r1
    }

    @Override // android.database.Cursor
    public final boolean isAfterLast() {
            r3 = this;
            int r0 = r3.getCount()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r3.mPos
            int r2 = r3.getCount()
            if (r0 != r2) goto L11
            return r1
        L11:
            r0 = 0
            return r0
    }

    @Override // android.database.Cursor
    public final boolean isBeforeFirst() {
            r3 = this;
            int r0 = r3.getCount()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r3.mPos
            r2 = -1
            if (r0 != r2) goto Le
            return r1
        Le:
            r0 = 0
            return r0
    }

    @Override // android.database.Cursor
    public boolean isClosed() {
            r1 = this;
            boolean r0 = r1.mClosed
            return r0
    }

    protected boolean isFieldUpdated(int r3) {
            r2 = this;
            int r0 = r2.mRowIdColumnIndex
            r1 = -1
            if (r0 == r1) goto L27
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            int r0 = r0.size()
            if (r0 <= 0) goto L27
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r2.mUpdatedRows
            java.lang.Long r1 = r2.mCurrentRowID
            java.lang.Object r0 = r0.get(r1)
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L27
            java.lang.String[] r1 = r2.getColumnNames()
            r3 = r1[r3]
            boolean r3 = r0.containsKey(r3)
            if (r3 == 0) goto L27
            r3 = 1
            return r3
        L27:
            r3 = 0
            return r3
    }

    @Override // android.database.Cursor
    public final boolean isFirst() {
            r1 = this;
            int r0 = r1.mPos
            if (r0 != 0) goto Lc
            int r0 = r1.getCount()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // android.database.Cursor
    public final boolean isLast() {
            r3 = this;
            int r0 = r3.getCount()
            int r1 = r3.mPos
            int r2 = r0 + (-1)
            if (r1 != r2) goto Le
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    @Override // android.database.Cursor
    public abstract boolean isNull(int r1);

    @Override // android.database.Cursor
    public final boolean move(int r2) {
            r1 = this;
            int r0 = r1.mPos
            int r0 = r0 + r2
            boolean r2 = r1.moveToPosition(r0)
            return r2
    }

    @Override // android.database.Cursor
    public final boolean moveToFirst() {
            r1 = this;
            r0 = 0
            boolean r0 = r1.moveToPosition(r0)
            return r0
    }

    @Override // android.database.Cursor
    public final boolean moveToLast() {
            r1 = this;
            int r0 = r1.getCount()
            int r0 = r0 + (-1)
            boolean r0 = r1.moveToPosition(r0)
            return r0
    }

    @Override // android.database.Cursor
    public final boolean moveToNext() {
            r1 = this;
            int r0 = r1.mPos
            int r0 = r0 + 1
            boolean r0 = r1.moveToPosition(r0)
            return r0
    }

    @Override // android.database.Cursor
    public final boolean moveToPosition(int r5) {
            r4 = this;
            int r0 = r4.getCount()
            r1 = 0
            if (r5 < r0) goto La
            r4.mPos = r0
            return r1
        La:
            r0 = -1
            if (r5 >= 0) goto L10
            r4.mPos = r0
            return r1
        L10:
            int r1 = r4.mPos
            if (r5 != r1) goto L16
            r5 = 1
            return r5
        L16:
            boolean r1 = r4.onMove(r1, r5)
            if (r1 != 0) goto L1f
            r4.mPos = r0
            return r1
        L1f:
            r4.mPos = r5
            int r5 = r4.mRowIdColumnIndex
            if (r5 == r0) goto L2f
            long r2 = r4.getLong(r5)
            java.lang.Long r5 = java.lang.Long.valueOf(r2)
            r4.mCurrentRowID = r5
        L2f:
            return r1
    }

    @Override // android.database.Cursor
    public final boolean moveToPrevious() {
            r1 = this;
            int r0 = r1.mPos
            int r0 = r0 + (-1)
            boolean r0 = r1.moveToPosition(r0)
            return r0
    }

    protected void notifyDataSetChange() {
            r1 = this;
            android.database.DataSetObservable r0 = r1.mDataSetObservable
            r0.notifyChanged()
            return
    }

    protected void onChange(boolean r4) {
            r3 = this;
            java.lang.Object r0 = r3.mSelfObserverLock
            monitor-enter(r0)
            android.database.ContentObservable r1 = r3.mContentObservable     // Catch: java.lang.Throwable -> L16
            r1.dispatchChange(r4)     // Catch: java.lang.Throwable -> L16
            android.net.Uri r1 = r3.mNotifyUri     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            if (r4 == 0) goto L18
            android.content.ContentResolver r4 = r3.mContentResolver     // Catch: java.lang.Throwable -> L16
            android.database.ContentObserver r2 = r3.mSelfObserver     // Catch: java.lang.Throwable -> L16
            r4.notifyChange(r1, r2)     // Catch: java.lang.Throwable -> L16
            goto L18
        L16:
            r4 = move-exception
            goto L1a
        L18:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L1a:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r4
    }

    @Override // android.database.CrossProcessCursor
    public boolean onMove(int r1, int r2) {
            r0 = this;
            r1 = 1
            return r1
    }

    @Override // android.database.Cursor
    public void registerContentObserver(android.database.ContentObserver r2) {
            r1 = this;
            android.database.ContentObservable r0 = r1.mContentObservable
            r0.registerObserver(r2)
            return
    }

    @Override // android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver r2) {
            r1 = this;
            android.database.DataSetObservable r0 = r1.mDataSetObservable
            r0.registerObserver(r2)
            return
    }

    @Override // android.database.Cursor
    public boolean requery() {
            r4 = this;
            android.database.ContentObserver r0 = r4.mSelfObserver
            r1 = 1
            if (r0 == 0) goto L12
            boolean r2 = r4.mSelfObserverRegistered
            if (r2 != 0) goto L12
            android.content.ContentResolver r2 = r4.mContentResolver
            android.net.Uri r3 = r4.mNotifyUri
            r2.registerContentObserver(r3, r1, r0)
            r4.mSelfObserverRegistered = r1
        L12:
            android.database.DataSetObservable r0 = r4.mDataSetObservable
            r0.notifyChanged()
            return r1
    }

    @Override // android.database.Cursor
    public android.os.Bundle respond(android.os.Bundle r1) {
            r0 = this;
            android.os.Bundle r1 = android.os.Bundle.EMPTY
            return r1
    }

    @Override // android.database.Cursor
    public void setExtras(android.os.Bundle r1) {
            r0 = this;
            if (r1 != 0) goto L4
            android.os.Bundle r1 = android.os.Bundle.EMPTY
        L4:
            r0.mExtras = r1
            return
    }

    @Override // android.database.Cursor
    public void setNotificationUri(android.content.ContentResolver r4, android.net.Uri r5) {
            r3 = this;
            java.lang.Object r0 = r3.mSelfObserverLock
            monitor-enter(r0)
            r3.mNotifyUri = r5     // Catch: java.lang.Throwable -> Lf
            r3.mContentResolver = r4     // Catch: java.lang.Throwable -> Lf
            android.database.ContentObserver r5 = r3.mSelfObserver     // Catch: java.lang.Throwable -> Lf
            if (r5 == 0) goto L11
            r4.unregisterContentObserver(r5)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r4 = move-exception
            goto L24
        L11:
            net.sqlcipher.AbstractCursor$SelfContentObserver r4 = new net.sqlcipher.AbstractCursor$SelfContentObserver     // Catch: java.lang.Throwable -> Lf
            r4.<init>(r3)     // Catch: java.lang.Throwable -> Lf
            r3.mSelfObserver = r4     // Catch: java.lang.Throwable -> Lf
            android.content.ContentResolver r5 = r3.mContentResolver     // Catch: java.lang.Throwable -> Lf
            android.net.Uri r1 = r3.mNotifyUri     // Catch: java.lang.Throwable -> Lf
            r2 = 1
            r5.registerContentObserver(r1, r2, r4)     // Catch: java.lang.Throwable -> Lf
            r3.mSelfObserverRegistered = r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            return
        L24:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r4
    }

    public boolean supportsUpdates() {
            r2 = this;
            int r0 = r2.mRowIdColumnIndex
            r1 = -1
            if (r0 == r1) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // android.database.Cursor
    public void unregisterContentObserver(android.database.ContentObserver r2) {
            r1 = this;
            boolean r0 = r1.mClosed
            if (r0 != 0) goto L9
            android.database.ContentObservable r0 = r1.mContentObservable
            r0.unregisterObserver(r2)
        L9:
            return
    }

    @Override // android.database.Cursor
    public void unregisterDataSetObserver(android.database.DataSetObserver r2) {
            r1 = this;
            android.database.DataSetObservable r0 = r1.mDataSetObservable
            r0.unregisterObserver(r2)
            return
    }

    public boolean update(int r5, java.lang.Object r6) {
            r4 = this;
            boolean r0 = r4.supportsUpdates()
            if (r0 != 0) goto L8
            r5 = 0
            return r5
        L8:
            int r0 = r4.mRowIdColumnIndex
            long r0 = r4.getLong(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r1 = r4.mUpdatedRows
            monitor-enter(r1)
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r2 = r4.mUpdatedRows     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L2a
            java.util.Map r2 = (java.util.Map) r2     // Catch: java.lang.Throwable -> L2a
            if (r2 != 0) goto L2c
            java.util.HashMap r2 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2a
            r2.<init>()     // Catch: java.lang.Throwable -> L2a
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r3 = r4.mUpdatedRows     // Catch: java.lang.Throwable -> L2a
            r3.put(r0, r2)     // Catch: java.lang.Throwable -> L2a
            goto L2c
        L2a:
            r5 = move-exception
            goto L38
        L2c:
            java.lang.String[] r0 = r4.getColumnNames()     // Catch: java.lang.Throwable -> L2a
            r5 = r0[r5]     // Catch: java.lang.Throwable -> L2a
            r2.put(r5, r6)     // Catch: java.lang.Throwable -> L2a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            r5 = 1
            return r5
        L38:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L2a
            throw r5
    }

    public boolean updateBlob(int r1, byte[] r2) {
            r0 = this;
            boolean r1 = r0.update(r1, r2)
            return r1
    }

    public boolean updateDouble(int r1, double r2) {
            r0 = this;
            java.lang.Double r2 = java.lang.Double.valueOf(r2)
            boolean r1 = r0.update(r1, r2)
            return r1
    }

    public boolean updateFloat(int r1, float r2) {
            r0 = this;
            java.lang.Float r2 = java.lang.Float.valueOf(r2)
            boolean r1 = r0.update(r1, r2)
            return r1
    }

    public boolean updateInt(int r1, int r2) {
            r0 = this;
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            boolean r1 = r0.update(r1, r2)
            return r1
    }

    public boolean updateLong(int r1, long r2) {
            r0 = this;
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            boolean r1 = r0.update(r1, r2)
            return r1
    }

    public boolean updateShort(int r1, short r2) {
            r0 = this;
            java.lang.Short r2 = java.lang.Short.valueOf(r2)
            boolean r1 = r0.update(r1, r2)
            return r1
    }

    public boolean updateString(int r1, java.lang.String r2) {
            r0 = this;
            boolean r1 = r0.update(r1, r2)
            return r1
    }

    public boolean updateToNull(int r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.update(r2, r0)
            return r2
    }
}

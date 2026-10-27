package androidx.room.paging;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class LimitOffsetDataSource<T> extends androidx.paging.PositionalDataSource<T> {
    private static final java.lang.String BUG_LINK = "https://issuetracker.google.com/issues/new?component=413107&template=1096568";
    private final java.lang.String mCountQuery;
    private final androidx.room.RoomDatabase mDb;
    private final boolean mInTransaction;
    private final java.lang.String mLimitOffsetQuery;
    private final androidx.room.InvalidationTracker.Observer mObserver;
    private final java.util.concurrent.atomic.AtomicBoolean mRegisteredObserver;
    private final androidx.room.RoomSQLiteQuery mSourceQuery;


    protected LimitOffsetDataSource(androidx.room.RoomDatabase r3, androidx.room.RoomSQLiteQuery r4, boolean r5, boolean r6, java.lang.String... r7) {
            r2 = this;
            r2.<init>()
            java.util.concurrent.atomic.AtomicBoolean r0 = new java.util.concurrent.atomic.AtomicBoolean
            r1 = 0
            r0.<init>(r1)
            r2.mRegisteredObserver = r0
            r2.mDb = r3
            r2.mSourceQuery = r4
            r2.mInTransaction = r5
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "SELECT COUNT(*) FROM ( "
            r3.append(r5)
            java.lang.String r5 = r4.getSql()
            r3.append(r5)
            java.lang.String r5 = " )"
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.mCountQuery = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "SELECT * FROM ( "
            r3.append(r5)
            java.lang.String r4 = r4.getSql()
            r3.append(r4)
            java.lang.String r4 = " ) LIMIT ? OFFSET ?"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.mLimitOffsetQuery = r3
            androidx.room.paging.LimitOffsetDataSource$1 r3 = new androidx.room.paging.LimitOffsetDataSource$1
            r3.<init>(r2, r7)
            r2.mObserver = r3
            if (r6 == 0) goto L55
            r2.registerObserverIfNecessary()
        L55:
            return
    }

    protected LimitOffsetDataSource(androidx.room.RoomDatabase r7, androidx.room.RoomSQLiteQuery r8, boolean r9, java.lang.String... r10) {
            r6 = this;
            r4 = 1
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    protected LimitOffsetDataSource(androidx.room.RoomDatabase r7, androidx.sqlite.db.SupportSQLiteQuery r8, boolean r9, boolean r10, java.lang.String... r11) {
            r6 = this;
            androidx.room.RoomSQLiteQuery r2 = androidx.room.RoomSQLiteQuery.copyFrom(r8)
            r0 = r6
            r1 = r7
            r3 = r9
            r4 = r10
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    protected LimitOffsetDataSource(androidx.room.RoomDatabase r1, androidx.sqlite.db.SupportSQLiteQuery r2, boolean r3, java.lang.String... r4) {
            r0 = this;
            androidx.room.RoomSQLiteQuery r2 = androidx.room.RoomSQLiteQuery.copyFrom(r2)
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private androidx.room.RoomSQLiteQuery getSQLiteQuery(int r5, int r6) {
            r4 = this;
            java.lang.String r0 = r4.mLimitOffsetQuery
            androidx.room.RoomSQLiteQuery r1 = r4.mSourceQuery
            int r1 = r1.getArgCount()
            int r1 = r1 + 2
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            androidx.room.RoomSQLiteQuery r1 = r4.mSourceQuery
            r0.copyArgumentsFrom(r1)
            int r1 = r0.getArgCount()
            int r1 = r1 + (-1)
            long r2 = (long) r6
            r0.bindLong(r1, r2)
            int r6 = r0.getArgCount()
            long r1 = (long) r5
            r0.bindLong(r6, r1)
            return r0
    }

    private void registerObserverIfNecessary() {
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.mRegisteredObserver
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L15
            androidx.room.RoomDatabase r0 = r3.mDb
            androidx.room.InvalidationTracker r0 = r0.getInvalidationTracker()
            androidx.room.InvalidationTracker$Observer r1 = r3.mObserver
            r0.addWeakObserver(r1)
        L15:
            return
    }

    protected java.util.List<T> convertRows(android.database.Cursor r2) {
            r1 = this;
            androidx.room.paging.CursorSQLiteStatement r0 = new androidx.room.paging.CursorSQLiteStatement
            r0.<init>(r2)
            java.util.List r2 = r1.convertRows(r0)
            return r2
    }

    protected java.util.List<T> convertRows(androidx.sqlite.SQLiteStatement r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Unexpected call to a function with no implementation that Room is supposed to generate. Please file a bug at: https://issuetracker.google.com/issues/new?component=413107&template=1096568."
            r2.<init>(r0)
            throw r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public int countItems() {
            r4 = this;
            r4.registerObserverIfNecessary()
            java.lang.String r0 = r4.mCountQuery
            androidx.room.RoomSQLiteQuery r1 = r4.mSourceQuery
            int r1 = r1.getArgCount()
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            androidx.room.RoomSQLiteQuery r1 = r4.mSourceQuery
            r0.copyArgumentsFrom(r1)
            androidx.room.RoomDatabase r1 = r4.mDb
            android.database.Cursor r1 = r1.query(r0)
            boolean r2 = r1.moveToFirst()     // Catch: java.lang.Throwable -> L2c
            r3 = 0
            if (r2 == 0) goto L2e
            int r2 = r1.getInt(r3)     // Catch: java.lang.Throwable -> L2c
            r1.close()
            r0.release()
            return r2
        L2c:
            r2 = move-exception
            goto L35
        L2e:
            r1.close()
            r0.release()
            return r3
        L35:
            r1.close()
            r0.release()
            throw r2
    }

    public boolean isInvalid() {
            r1 = this;
            r1.registerObserverIfNecessary()
            androidx.room.RoomDatabase r0 = r1.mDb
            androidx.room.InvalidationTracker r0 = r0.getInvalidationTracker()
            r0.refreshVersionsSync()
            boolean r0 = super.isInvalid()
            return r0
    }

    public void loadInitial(androidx.paging.PositionalDataSource.LoadInitialParams r7, androidx.paging.PositionalDataSource.LoadInitialCallback<T> r8) {
            r6 = this;
            r6.registerObserverIfNecessary()
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            androidx.room.RoomDatabase r1 = r6.mDb
            r1.beginTransaction()
            r1 = 0
            int r2 = r6.countItems()     // Catch: java.lang.Throwable -> L33
            if (r2 == 0) goto L36
            int r0 = computeInitialLoadPosition(r7, r2)     // Catch: java.lang.Throwable -> L33
            int r7 = computeInitialLoadSize(r7, r0, r2)     // Catch: java.lang.Throwable -> L33
            androidx.room.RoomSQLiteQuery r7 = r6.getSQLiteQuery(r0, r7)     // Catch: java.lang.Throwable -> L33
            androidx.room.RoomDatabase r3 = r6.mDb     // Catch: java.lang.Throwable -> L31
            android.database.Cursor r1 = r3.query(r7)     // Catch: java.lang.Throwable -> L31
            java.util.List r3 = r6.convertRows(r1)     // Catch: java.lang.Throwable -> L31
            androidx.room.RoomDatabase r4 = r6.mDb     // Catch: java.lang.Throwable -> L31
            r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L31
            r5 = r3
            r3 = r7
            r7 = r0
            r0 = r5
            goto L38
        L31:
            r8 = move-exception
            goto L4b
        L33:
            r8 = move-exception
            r7 = r1
            goto L4b
        L36:
            r7 = 0
            r3 = r1
        L38:
            if (r1 == 0) goto L3d
            r1.close()
        L3d:
            androidx.room.RoomDatabase r1 = r6.mDb
            r1.endTransaction()
            if (r3 == 0) goto L47
            r3.release()
        L47:
            r8.onResult(r0, r7, r2)
            return
        L4b:
            if (r1 == 0) goto L50
            r1.close()
        L50:
            androidx.room.RoomDatabase r0 = r6.mDb
            r0.endTransaction()
            if (r7 == 0) goto L5a
            r7.release()
        L5a:
            throw r8
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public java.util.List<T> loadRange(int r3, int r4) {
            r2 = this;
            androidx.room.RoomSQLiteQuery r3 = r2.getSQLiteQuery(r3, r4)
            boolean r4 = r2.mInTransaction
            if (r4 == 0) goto L3a
            androidx.room.RoomDatabase r4 = r2.mDb
            r4.beginTransaction()
            r4 = 0
            androidx.room.RoomDatabase r0 = r2.mDb     // Catch: java.lang.Throwable -> L2b
            android.database.Cursor r4 = r0.query(r3)     // Catch: java.lang.Throwable -> L2b
            java.util.List r0 = r2.convertRows(r4)     // Catch: java.lang.Throwable -> L2b
            androidx.room.RoomDatabase r1 = r2.mDb     // Catch: java.lang.Throwable -> L2b
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2b
            if (r4 == 0) goto L22
            r4.close()
        L22:
            androidx.room.RoomDatabase r4 = r2.mDb
            r4.endTransaction()
            r3.release()
            return r0
        L2b:
            r0 = move-exception
            if (r4 == 0) goto L31
            r4.close()
        L31:
            androidx.room.RoomDatabase r4 = r2.mDb
            r4.endTransaction()
            r3.release()
            throw r0
        L3a:
            androidx.room.RoomDatabase r4 = r2.mDb
            android.database.Cursor r4 = r4.query(r3)
            java.util.List r0 = r2.convertRows(r4)     // Catch: java.lang.Throwable -> L4b
            r4.close()
            r3.release()
            return r0
        L4b:
            r0 = move-exception
            r4.close()
            r3.release()
            throw r0
    }

    public void loadRange(androidx.paging.PositionalDataSource.LoadRangeParams r2, androidx.paging.PositionalDataSource.LoadRangeCallback<T> r3) {
            r1 = this;
            int r0 = r2.startPosition
            int r2 = r2.loadSize
            java.util.List r2 = r1.loadRange(r0, r2)
            r3.onResult(r2)
            return
    }
}

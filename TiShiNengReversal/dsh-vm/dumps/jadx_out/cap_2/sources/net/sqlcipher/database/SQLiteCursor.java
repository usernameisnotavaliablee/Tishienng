package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SQLiteCursor extends net.sqlcipher.AbstractWindowedCursor {
    static final int NO_COUNT = -1;
    static final java.lang.String TAG = "Cursor";
    private boolean fillWindowForwardOnly;
    private java.util.Map<java.lang.String, java.lang.Integer> mColumnNameMap;
    private java.lang.String[] mColumns;
    private int mCount;
    private int mCursorState;
    private int mCursorWindowCapacity;
    private net.sqlcipher.database.SQLiteDatabase mDatabase;
    private net.sqlcipher.database.SQLiteCursorDriver mDriver;
    private java.lang.String mEditTable;
    private int mInitialRead;
    private java.util.concurrent.locks.ReentrantLock mLock;
    private int mMaxRead;
    protected net.sqlcipher.database.SQLiteCursor.MainThreadNotificationHandler mNotificationHandler;
    private boolean mPendingData;
    private net.sqlcipher.database.SQLiteQuery mQuery;
    private java.lang.Throwable mStackTrace;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static class MainThreadNotificationHandler extends android.os.Handler {
        private final java.lang.ref.WeakReference<net.sqlcipher.database.SQLiteCursor> wrappedCursor;

        MainThreadNotificationHandler(net.sqlcipher.database.SQLiteCursor r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.wrappedCursor = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r1) {
                r0 = this;
                java.lang.ref.WeakReference<net.sqlcipher.database.SQLiteCursor> r1 = r0.wrappedCursor
                java.lang.Object r1 = r1.get()
                net.sqlcipher.database.SQLiteCursor r1 = (net.sqlcipher.database.SQLiteCursor) r1
                if (r1 == 0) goto Ld
                net.sqlcipher.database.SQLiteCursor.access$700(r1)
            Ld:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class QueryThread implements java.lang.Runnable {
        private final int mThreadState;
        final /* synthetic */ net.sqlcipher.database.SQLiteCursor this$0;

        QueryThread(net.sqlcipher.database.SQLiteCursor r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mThreadState = r2
                return
        }

        private void sendMessage() {
                r3 = this;
                net.sqlcipher.database.SQLiteCursor r0 = r3.this$0
                net.sqlcipher.database.SQLiteCursor$MainThreadNotificationHandler r1 = r0.mNotificationHandler
                r2 = 1
                if (r1 == 0) goto L11
                r1.sendEmptyMessage(r2)
                net.sqlcipher.database.SQLiteCursor r0 = r3.this$0
                r1 = 0
                net.sqlcipher.database.SQLiteCursor.access$002(r0, r1)
                return
            L11:
                net.sqlcipher.database.SQLiteCursor.access$002(r0, r2)
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                net.sqlcipher.database.SQLiteCursor r0 = r4.this$0
                net.sqlcipher.CursorWindow r0 = net.sqlcipher.database.SQLiteCursor.access$100(r0)
                int r1 = android.os.Process.myTid()
                r2 = 10
                android.os.Process.setThreadPriority(r1, r2)
            Lf:
                net.sqlcipher.database.SQLiteCursor r1 = r4.this$0
                java.util.concurrent.locks.ReentrantLock r1 = net.sqlcipher.database.SQLiteCursor.access$200(r1)
                if (r1 != 0) goto L22
                net.sqlcipher.database.SQLiteCursor r1 = r4.this$0
                java.util.concurrent.locks.ReentrantLock r2 = new java.util.concurrent.locks.ReentrantLock
                r3 = 1
                r2.<init>(r3)
                net.sqlcipher.database.SQLiteCursor.access$202(r1, r2)
            L22:
                net.sqlcipher.database.SQLiteCursor r1 = r4.this$0
                java.util.concurrent.locks.ReentrantLock r1 = net.sqlcipher.database.SQLiteCursor.access$200(r1)
                r1.lock()
                net.sqlcipher.database.SQLiteCursor r1 = r4.this$0
                int r1 = net.sqlcipher.database.SQLiteCursor.access$300(r1)
                int r2 = r4.mThreadState
                if (r1 == r2) goto L3f
                net.sqlcipher.database.SQLiteCursor r0 = r4.this$0
                java.util.concurrent.locks.ReentrantLock r0 = net.sqlcipher.database.SQLiteCursor.access$200(r0)
                r0.unlock()
                return
            L3f:
                net.sqlcipher.database.SQLiteCursor r1 = r4.this$0     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                net.sqlcipher.database.SQLiteQuery r1 = net.sqlcipher.database.SQLiteCursor.access$600(r1)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                net.sqlcipher.database.SQLiteCursor r2 = r4.this$0     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                int r2 = net.sqlcipher.database.SQLiteCursor.access$400(r2)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                net.sqlcipher.database.SQLiteCursor r3 = r4.this$0     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                int r3 = net.sqlcipher.database.SQLiteCursor.access$500(r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                int r1 = r1.fillWindow(r0, r2, r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                if (r1 == 0) goto L8b
                r2 = -1
                if (r1 != r2) goto L79
                net.sqlcipher.database.SQLiteCursor r1 = r4.this$0     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                int r2 = net.sqlcipher.database.SQLiteCursor.access$500(r1)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                net.sqlcipher.database.SQLiteCursor r3 = r4.this$0     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                int r3 = net.sqlcipher.database.SQLiteCursor.access$400(r3)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                int r2 = r2 + r3
                net.sqlcipher.database.SQLiteCursor.access$502(r1, r2)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                r4.sendMessage()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                net.sqlcipher.database.SQLiteCursor r1 = r4.this$0
                java.util.concurrent.locks.ReentrantLock r1 = net.sqlcipher.database.SQLiteCursor.access$200(r1)
                r1.unlock()
                goto Lf
            L77:
                r0 = move-exception
                goto L95
            L79:
                net.sqlcipher.database.SQLiteCursor r0 = r4.this$0     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                net.sqlcipher.database.SQLiteCursor.access$502(r0, r1)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                r4.sendMessage()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L9f
                net.sqlcipher.database.SQLiteCursor r0 = r4.this$0
                java.util.concurrent.locks.ReentrantLock r0 = net.sqlcipher.database.SQLiteCursor.access$200(r0)
                r0.unlock()
                return
            L8b:
                net.sqlcipher.database.SQLiteCursor r0 = r4.this$0
                java.util.concurrent.locks.ReentrantLock r0 = net.sqlcipher.database.SQLiteCursor.access$200(r0)
                r0.unlock()
                return
            L95:
                net.sqlcipher.database.SQLiteCursor r1 = r4.this$0
                java.util.concurrent.locks.ReentrantLock r1 = net.sqlcipher.database.SQLiteCursor.access$200(r1)
                r1.unlock()
                throw r0
            L9f:
                net.sqlcipher.database.SQLiteCursor r0 = r4.this$0
                java.util.concurrent.locks.ReentrantLock r0 = net.sqlcipher.database.SQLiteCursor.access$200(r0)
                r0.unlock()
                return
        }
    }

    public SQLiteCursor(net.sqlcipher.database.SQLiteDatabase r4, net.sqlcipher.database.SQLiteCursorDriver r5, java.lang.String r6, net.sqlcipher.database.SQLiteQuery r7) {
            r3 = this;
            r3.<init>()
            r0 = -1
            r3.mCount = r0
            r0 = 0
            r3.mCursorWindowCapacity = r0
            r3.fillWindowForwardOnly = r0
            r1 = 2147483647(0x7fffffff, float:NaN)
            r3.mMaxRead = r1
            r3.mInitialRead = r1
            r3.mCursorState = r0
            r1 = 0
            r3.mLock = r1
            r3.mPendingData = r0
            net.sqlcipher.database.DatabaseObjectNotClosedException r2 = new net.sqlcipher.database.DatabaseObjectNotClosedException
            r2.<init>()
            java.lang.Throwable r2 = r2.fillInStackTrace()
            r3.mStackTrace = r2
            r3.mDatabase = r4
            r3.mDriver = r5
            r3.mEditTable = r6
            r3.mColumnNameMap = r1
            r3.mQuery = r7
            r4.lock()     // Catch: java.lang.Throwable -> L52
            net.sqlcipher.database.SQLiteQuery r5 = r3.mQuery     // Catch: java.lang.Throwable -> L52
            int r5 = r5.columnCountLocked()     // Catch: java.lang.Throwable -> L52
            java.lang.String[] r6 = new java.lang.String[r5]     // Catch: java.lang.Throwable -> L52
            r3.mColumns = r6     // Catch: java.lang.Throwable -> L52
        L3b:
            if (r0 >= r5) goto L57
            net.sqlcipher.database.SQLiteQuery r6 = r3.mQuery     // Catch: java.lang.Throwable -> L52
            java.lang.String r6 = r6.columnNameLocked(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.String[] r7 = r3.mColumns     // Catch: java.lang.Throwable -> L52
            r7[r0] = r6     // Catch: java.lang.Throwable -> L52
            java.lang.String r7 = "_id"
            boolean r6 = r7.equals(r6)     // Catch: java.lang.Throwable -> L52
            if (r6 == 0) goto L54
            r3.mRowIdColumnIndex = r0     // Catch: java.lang.Throwable -> L52
            goto L54
        L52:
            r5 = move-exception
            goto L5b
        L54:
            int r0 = r0 + 1
            goto L3b
        L57:
            r4.unlock()
            return
        L5b:
            r4.unlock()
            throw r5
    }

    static /* synthetic */ boolean access$002(net.sqlcipher.database.SQLiteCursor r0, boolean r1) {
            r0.mPendingData = r1
            return r1
    }

    static /* synthetic */ net.sqlcipher.CursorWindow access$100(net.sqlcipher.database.SQLiteCursor r0) {
            net.sqlcipher.CursorWindow r0 = r0.mWindow
            return r0
    }

    static /* synthetic */ java.util.concurrent.locks.ReentrantLock access$200(net.sqlcipher.database.SQLiteCursor r0) {
            java.util.concurrent.locks.ReentrantLock r0 = r0.mLock
            return r0
    }

    static /* synthetic */ java.util.concurrent.locks.ReentrantLock access$202(net.sqlcipher.database.SQLiteCursor r0, java.util.concurrent.locks.ReentrantLock r1) {
            r0.mLock = r1
            return r1
    }

    static /* synthetic */ int access$300(net.sqlcipher.database.SQLiteCursor r0) {
            int r0 = r0.mCursorState
            return r0
    }

    static /* synthetic */ int access$400(net.sqlcipher.database.SQLiteCursor r0) {
            int r0 = r0.mMaxRead
            return r0
    }

    static /* synthetic */ int access$500(net.sqlcipher.database.SQLiteCursor r0) {
            int r0 = r0.mCount
            return r0
    }

    static /* synthetic */ int access$502(net.sqlcipher.database.SQLiteCursor r0, int r1) {
            r0.mCount = r1
            return r1
    }

    static /* synthetic */ net.sqlcipher.database.SQLiteQuery access$600(net.sqlcipher.database.SQLiteCursor r0) {
            net.sqlcipher.database.SQLiteQuery r0 = r0.mQuery
            return r0
    }

    static /* synthetic */ void access$700(net.sqlcipher.database.SQLiteCursor r0) {
            r0.notifyDataSetChange()
            return
    }

    private void deactivateCommon() {
            r1 = this;
            r0 = 0
            r1.mCursorState = r0
            net.sqlcipher.CursorWindow r0 = r1.mWindow
            if (r0 == 0) goto Ld
            r0.close()
            r0 = 0
            r1.mWindow = r0
        Ld:
            return
    }

    private void fillWindow(int r6) {
            r5 = this;
            net.sqlcipher.CursorWindow r0 = r5.mWindow
            r1 = 1
            if (r0 != 0) goto Ld
            net.sqlcipher.CursorWindow r0 = new net.sqlcipher.CursorWindow
            r0.<init>(r1)
            r5.mWindow = r0
            goto L1d
        Ld:
            int r0 = r5.mCursorState
            int r0 = r0 + r1
            r5.mCursorState = r0
            r5.queryThreadLock()
            net.sqlcipher.CursorWindow r0 = r5.mWindow     // Catch: java.lang.Throwable -> L71
            r0.clear()     // Catch: java.lang.Throwable -> L71
            r5.queryThreadUnlock()
        L1d:
            boolean r0 = r5.fillWindowForwardOnly
            r1 = 0
            r2 = -1
            if (r0 == 0) goto L25
            r0 = r6
            goto L34
        L25:
            int r0 = r5.mCount
            if (r0 != r2) goto L2e
            int r0 = r5.cursorPickFillWindowStartPosition(r6, r1)
            goto L34
        L2e:
            int r0 = r5.mCursorWindowCapacity
            int r0 = r5.cursorPickFillWindowStartPosition(r6, r0)
        L34:
            net.sqlcipher.CursorWindow r3 = r5.mWindow
            r3.setStartPosition(r0)
            net.sqlcipher.CursorWindow r3 = r5.mWindow
            r3.setRequiredPosition(r6)
            net.sqlcipher.database.SQLiteQuery r6 = r5.mQuery
            net.sqlcipher.CursorWindow r3 = r5.mWindow
            int r4 = r5.mInitialRead
            int r6 = r6.fillWindow(r3, r4, r1)
            r5.mCount = r6
            int r6 = r5.mCursorWindowCapacity
            if (r6 != 0) goto L56
            net.sqlcipher.CursorWindow r6 = r5.mWindow
            int r6 = r6.getNumRows()
            r5.mCursorWindowCapacity = r6
        L56:
            int r6 = r5.mCount
            if (r6 != r2) goto L70
            int r6 = r5.mInitialRead
            int r0 = r0 + r6
            r5.mCount = r0
            java.lang.Thread r6 = new java.lang.Thread
            net.sqlcipher.database.SQLiteCursor$QueryThread r0 = new net.sqlcipher.database.SQLiteCursor$QueryThread
            int r1 = r5.mCursorState
            r0.<init>(r5, r1)
            java.lang.String r1 = "query thread"
            r6.<init>(r0, r1)
            r6.start()
        L70:
            return
        L71:
            r6 = move-exception
            r5.queryThreadUnlock()
            throw r6
    }

    private void queryThreadLock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.mLock
            if (r0 == 0) goto L7
            r0.lock()
        L7:
            return
    }

    private void queryThreadUnlock() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.mLock
            if (r0 == 0) goto L7
            r0.unlock()
        L7:
            return
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            super.close()
            r1.deactivateCommon()
            net.sqlcipher.database.SQLiteQuery r0 = r1.mQuery
            r0.close()
            net.sqlcipher.database.SQLiteCursorDriver r0 = r1.mDriver
            r0.cursorClosed()
            return
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean commitUpdates(java.util.Map<? extends java.lang.Long, ? extends java.util.Map<java.lang.String, java.lang.Object>> r12) {
            r11 = this;
            boolean r0 = r11.supportsUpdates()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r0 = r11.mUpdatedRows
            monitor-enter(r0)
            if (r12 == 0) goto L16
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r2 = r11.mUpdatedRows     // Catch: java.lang.Throwable -> L13
            r2.putAll(r12)     // Catch: java.lang.Throwable -> L13
            goto L16
        L13:
            r12 = move-exception
            goto L12e
        L16:
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r12 = r11.mUpdatedRows     // Catch: java.lang.Throwable -> L13
            int r12 = r12.size()     // Catch: java.lang.Throwable -> L13
            r2 = 1
            if (r12 != 0) goto L21
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return r2
        L21:
            net.sqlcipher.database.SQLiteDatabase r12 = r11.mDatabase     // Catch: java.lang.Throwable -> L13
            r12.beginTransaction()     // Catch: java.lang.Throwable -> L13
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r3 = 128(0x80, float:1.8E-43)
            r12.<init>(r3)     // Catch: java.lang.Throwable -> Lb7
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r3 = r11.mUpdatedRows     // Catch: java.lang.Throwable -> Lb7
            java.util.Set r3 = r3.entrySet()     // Catch: java.lang.Throwable -> Lb7
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Throwable -> Lb7
        L37:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Throwable -> Lb7
            if (r4 == 0) goto L114
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Throwable -> Lb7
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r5 = r4.getValue()     // Catch: java.lang.Throwable -> Lb7
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r4 = r4.getKey()     // Catch: java.lang.Throwable -> Lb7
            java.lang.Long r4 = (java.lang.Long) r4     // Catch: java.lang.Throwable -> Lb7
            if (r4 == 0) goto Lf5
            if (r5 == 0) goto Lf5
            int r6 = r5.size()     // Catch: java.lang.Throwable -> Lb7
            if (r6 != 0) goto L5a
            goto L37
        L5a:
            long r6 = r4.longValue()     // Catch: java.lang.Throwable -> Lb7
            java.util.Set r4 = r5.entrySet()     // Catch: java.lang.Throwable -> Lb7
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Lb7
            r12.setLength(r1)     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r8.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r9 = "UPDATE "
            r8.append(r9)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r9 = r11.mEditTable     // Catch: java.lang.Throwable -> Lb7
            r8.append(r9)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r9 = " SET "
            r8.append(r9)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> Lb7
            r12.append(r8)     // Catch: java.lang.Throwable -> Lb7
            int r5 = r5.size()     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> Lb7
            r8 = 0
        L8b:
            boolean r9 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb7
            if (r9 == 0) goto Lbc
            java.lang.Object r9 = r4.next()     // Catch: java.lang.Throwable -> Lb7
            java.util.Map$Entry r9 = (java.util.Map.Entry) r9     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r10 = r9.getKey()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> Lb7
            r12.append(r10)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r10 = "=?"
            r12.append(r10)     // Catch: java.lang.Throwable -> Lb7
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> Lb7
            r5[r8] = r9     // Catch: java.lang.Throwable -> Lb7
            boolean r9 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb7
            if (r9 == 0) goto Lb9
            java.lang.String r9 = ", "
            r12.append(r9)     // Catch: java.lang.Throwable -> Lb7
            goto Lb9
        Lb7:
            r12 = move-exception
            goto L128
        Lb9:
            int r8 = r8 + 1
            goto L8b
        Lbc:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r4.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r8 = " WHERE "
            r4.append(r8)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String[] r8 = r11.mColumns     // Catch: java.lang.Throwable -> Lb7
            int r9 = r11.mRowIdColumnIndex     // Catch: java.lang.Throwable -> Lb7
            r8 = r8[r9]     // Catch: java.lang.Throwable -> Lb7
            r4.append(r8)     // Catch: java.lang.Throwable -> Lb7
            r8 = 61
            r4.append(r8)     // Catch: java.lang.Throwable -> Lb7
            r4.append(r6)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> Lb7
            r12.append(r4)     // Catch: java.lang.Throwable -> Lb7
            r4 = 59
            r12.append(r4)     // Catch: java.lang.Throwable -> Lb7
            net.sqlcipher.database.SQLiteDatabase r4 = r11.mDatabase     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r8 = r12.toString()     // Catch: java.lang.Throwable -> Lb7
            r4.execSQL(r8, r5)     // Catch: java.lang.Throwable -> Lb7
            net.sqlcipher.database.SQLiteDatabase r4 = r11.mDatabase     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r5 = r11.mEditTable     // Catch: java.lang.Throwable -> Lb7
            r4.rowUpdated(r5, r6)     // Catch: java.lang.Throwable -> Lb7
            goto L37
        Lf5:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lb7
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb7
            r1.<init>()     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = "null rowId or values found! rowId = "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb7
            r1.append(r4)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r2 = ", values = "
            r1.append(r2)     // Catch: java.lang.Throwable -> Lb7
            r1.append(r5)     // Catch: java.lang.Throwable -> Lb7
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> Lb7
            r12.<init>(r1)     // Catch: java.lang.Throwable -> Lb7
            throw r12     // Catch: java.lang.Throwable -> Lb7
        L114:
            net.sqlcipher.database.SQLiteDatabase r12 = r11.mDatabase     // Catch: java.lang.Throwable -> Lb7
            r12.setTransactionSuccessful()     // Catch: java.lang.Throwable -> Lb7
            net.sqlcipher.database.SQLiteDatabase r12 = r11.mDatabase     // Catch: java.lang.Throwable -> L13
            r12.endTransaction()     // Catch: java.lang.Throwable -> L13
            java.util.HashMap<java.lang.Long, java.util.Map<java.lang.String, java.lang.Object>> r12 = r11.mUpdatedRows     // Catch: java.lang.Throwable -> L13
            r12.clear()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            r11.onChange(r2)
            return r2
        L128:
            net.sqlcipher.database.SQLiteDatabase r1 = r11.mDatabase     // Catch: java.lang.Throwable -> L13
            r1.endTransaction()     // Catch: java.lang.Throwable -> L13
            throw r12     // Catch: java.lang.Throwable -> L13
        L12e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r12
    }

    public int cursorPickFillWindowStartPosition(int r1, int r2) {
            r0 = this;
            int r2 = r2 / 3
            int r1 = r1 - r2
            r2 = 0
            int r1 = java.lang.Math.max(r1, r2)
            return r1
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void deactivate() {
            r1 = this;
            super.deactivate()
            r1.deactivateCommon()
            net.sqlcipher.database.SQLiteCursorDriver r0 = r1.mDriver
            r0.cursorDeactivated()
            return
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean deleteRow() {
            r7 = this;
            r7.checkPosition()
            int r0 = r7.mRowIdColumnIndex
            r1 = -1
            r2 = 0
            if (r0 == r1) goto L5b
            java.lang.Long r0 = r7.mCurrentRowID
            if (r0 != 0) goto Le
            goto L5b
        Le:
            net.sqlcipher.database.SQLiteDatabase r0 = r7.mDatabase
            r0.lock()
            r0 = 1
            net.sqlcipher.database.SQLiteDatabase r1 = r7.mDatabase     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            java.lang.String r3 = r7.mEditTable     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            r4.<init>()     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            java.lang.String[] r5 = r7.mColumns     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            int r6 = r7.mRowIdColumnIndex     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            r5 = r5[r6]     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            r4.append(r5)     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            java.lang.String r5 = "=?"
            r4.append(r5)     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            java.lang.Long r5 = r7.mCurrentRowID     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            r1.delete(r3, r4, r5)     // Catch: java.lang.Throwable -> L3e net.sqlcipher.SQLException -> L40
            r1 = 1
            goto L41
        L3e:
            r0 = move-exception
            goto L55
        L40:
            r1 = 0
        L41:
            int r3 = r7.mPos     // Catch: java.lang.Throwable -> L3e
            r7.requery()     // Catch: java.lang.Throwable -> L3e
            r7.moveToPosition(r3)     // Catch: java.lang.Throwable -> L3e
            net.sqlcipher.database.SQLiteDatabase r3 = r7.mDatabase
            r3.unlock()
            if (r1 == 0) goto L54
            r7.onChange(r0)
            return r0
        L54:
            return r2
        L55:
            net.sqlcipher.database.SQLiteDatabase r1 = r7.mDatabase
            r1.unlock()
            throw r0
        L5b:
            return r2
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public void fillWindow(int r5, android.database.CursorWindow r6) {
            r4 = this;
            net.sqlcipher.CursorWindow r6 = r4.mWindow
            r0 = 1
            if (r6 != 0) goto Ld
            net.sqlcipher.CursorWindow r6 = new net.sqlcipher.CursorWindow
            r6.<init>(r0)
            r4.mWindow = r6
            goto L1d
        Ld:
            int r6 = r4.mCursorState
            int r6 = r6 + r0
            r4.mCursorState = r6
            r4.queryThreadLock()
            net.sqlcipher.CursorWindow r6 = r4.mWindow     // Catch: java.lang.Throwable -> L71
            r6.clear()     // Catch: java.lang.Throwable -> L71
            r4.queryThreadUnlock()
        L1d:
            boolean r6 = r4.fillWindowForwardOnly
            r0 = 0
            r1 = -1
            if (r6 == 0) goto L25
            r6 = r5
            goto L34
        L25:
            int r6 = r4.mCount
            if (r6 != r1) goto L2e
            int r6 = r4.cursorPickFillWindowStartPosition(r5, r0)
            goto L34
        L2e:
            int r6 = r4.mCursorWindowCapacity
            int r6 = r4.cursorPickFillWindowStartPosition(r5, r6)
        L34:
            net.sqlcipher.CursorWindow r2 = r4.mWindow
            r2.setStartPosition(r6)
            net.sqlcipher.CursorWindow r2 = r4.mWindow
            r2.setRequiredPosition(r5)
            net.sqlcipher.database.SQLiteQuery r5 = r4.mQuery
            net.sqlcipher.CursorWindow r2 = r4.mWindow
            int r3 = r4.mInitialRead
            int r5 = r5.fillWindow(r2, r3, r0)
            r4.mCount = r5
            int r5 = r4.mCursorWindowCapacity
            if (r5 != 0) goto L56
            net.sqlcipher.CursorWindow r5 = r4.mWindow
            int r5 = r5.getNumRows()
            r4.mCursorWindowCapacity = r5
        L56:
            int r5 = r4.mCount
            if (r5 != r1) goto L70
            int r5 = r4.mInitialRead
            int r6 = r6 + r5
            r4.mCount = r6
            java.lang.Thread r5 = new java.lang.Thread
            net.sqlcipher.database.SQLiteCursor$QueryThread r6 = new net.sqlcipher.database.SQLiteCursor$QueryThread
            int r0 = r4.mCursorState
            r6.<init>(r4, r0)
            java.lang.String r0 = "query thread"
            r5.<init>(r6, r0)
            r5.start()
        L70:
            return
        L71:
            r5 = move-exception
            r4.queryThreadUnlock()
            throw r5
    }

    @Override // net.sqlcipher.AbstractCursor
    protected void finalize() {
            r1 = this;
            net.sqlcipher.CursorWindow r0 = r1.mWindow     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            net.sqlcipher.database.SQLiteQuery r0 = r1.mQuery     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = r0.mSql     // Catch: java.lang.Throwable -> L12
            r0.getClass()     // Catch: java.lang.Throwable -> L12
            r1.close()     // Catch: java.lang.Throwable -> L12
            net.sqlcipher.database.SQLiteDebug.notifyActiveCursorFinalized()     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r0 = move-exception
            goto L18
        L14:
            super.finalize()
            return
        L18:
            super.finalize()
            throw r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getColumnIndex(java.lang.String r7) {
            r6 = this;
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r6.mColumnNameMap
            if (r0 != 0) goto L1f
            java.lang.String[] r0 = r6.mColumns
            int r1 = r0.length
            java.util.HashMap r2 = new java.util.HashMap
            r3 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r1, r3)
            r3 = 0
        Lf:
            if (r3 >= r1) goto L1d
            r4 = r0[r3]
            java.lang.Integer r5 = java.lang.Integer.valueOf(r3)
            r2.put(r4, r5)
            int r3 = r3 + 1
            goto Lf
        L1d:
            r6.mColumnNameMap = r2
        L1f:
            r0 = 46
            int r0 = r7.lastIndexOf(r0)
            r1 = -1
            if (r0 == r1) goto L2d
            java.lang.Exception r0 = new java.lang.Exception
            r0.<init>()
        L2d:
            java.util.Map<java.lang.String, java.lang.Integer> r0 = r6.mColumnNameMap
            java.lang.Object r7 = r0.get(r7)
            java.lang.Integer r7 = (java.lang.Integer) r7
            if (r7 == 0) goto L3c
            int r7 = r7.intValue()
            return r7
        L3c:
            return r1
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public java.lang.String[] getColumnNames() {
            r1 = this;
            java.lang.String[] r0 = r1.mColumns
            return r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public int getCount() {
            r2 = this;
            int r0 = r2.mCount
            r1 = -1
            if (r0 != r1) goto L9
            r0 = 0
            r2.fillWindow(r0)
        L9:
            int r0 = r2.mCount
            return r0
    }

    public net.sqlcipher.database.SQLiteDatabase getDatabase() {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase r0 = r1.mDatabase
            return r0
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.CrossProcessCursor
    public boolean onMove(int r2, int r3) {
            r1 = this;
            net.sqlcipher.CursorWindow r2 = r1.mWindow
            if (r2 == 0) goto L19
            int r2 = r2.getStartPosition()
            if (r3 < r2) goto L19
            net.sqlcipher.CursorWindow r2 = r1.mWindow
            int r2 = r2.getStartPosition()
            net.sqlcipher.CursorWindow r0 = r1.mWindow
            int r0 = r0.getNumRows()
            int r2 = r2 + r0
            if (r3 < r2) goto L1c
        L19:
            r1.fillWindow(r3)
        L1c:
            r2 = 1
            return r2
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public void registerDataSetObserver(android.database.DataSetObserver r2) {
            r1 = this;
            super.registerDataSetObserver(r2)
            int r2 = r1.mMaxRead
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r0 != r2) goto Le
            int r2 = r1.mInitialRead
            if (r0 == r2) goto L31
        Le:
            net.sqlcipher.database.SQLiteCursor$MainThreadNotificationHandler r2 = r1.mNotificationHandler
            if (r2 != 0) goto L31
            r1.queryThreadLock()
            net.sqlcipher.database.SQLiteCursor$MainThreadNotificationHandler r2 = new net.sqlcipher.database.SQLiteCursor$MainThreadNotificationHandler     // Catch: java.lang.Throwable -> L27
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L27
            r1.mNotificationHandler = r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r1.mPendingData     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            r1.notifyDataSetChange()     // Catch: java.lang.Throwable -> L27
            r2 = 0
            r1.mPendingData = r2     // Catch: java.lang.Throwable -> L27
            goto L29
        L27:
            r2 = move-exception
            goto L2d
        L29:
            r1.queryThreadUnlock()
            return
        L2d:
            r1.queryThreadUnlock()
            throw r2
        L31:
            return
    }

    @Override // net.sqlcipher.AbstractCursor, android.database.Cursor
    public boolean requery() {
            r2 = this;
            boolean r0 = r2.isClosed()
            if (r0 == 0) goto L8
            r0 = 0
            return r0
        L8:
            net.sqlcipher.database.SQLiteDatabase r0 = r2.mDatabase
            r0.lock()
            net.sqlcipher.CursorWindow r0 = r2.mWindow     // Catch: java.lang.Throwable -> L15
            if (r0 == 0) goto L17
            r0.clear()     // Catch: java.lang.Throwable -> L15
            goto L17
        L15:
            r0 = move-exception
            goto L41
        L17:
            r0 = -1
            r2.mPos = r0     // Catch: java.lang.Throwable -> L15
            net.sqlcipher.database.SQLiteCursorDriver r1 = r2.mDriver     // Catch: java.lang.Throwable -> L15
            r1.cursorRequeried(r2)     // Catch: java.lang.Throwable -> L15
            r2.mCount = r0     // Catch: java.lang.Throwable -> L15
            int r0 = r2.mCursorState     // Catch: java.lang.Throwable -> L15
            int r0 = r0 + 1
            r2.mCursorState = r0     // Catch: java.lang.Throwable -> L15
            r2.queryThreadLock()     // Catch: java.lang.Throwable -> L15
            net.sqlcipher.database.SQLiteQuery r0 = r2.mQuery     // Catch: java.lang.Throwable -> L3c
            r0.requery()     // Catch: java.lang.Throwable -> L3c
            r2.queryThreadUnlock()     // Catch: java.lang.Throwable -> L15
            net.sqlcipher.database.SQLiteDatabase r0 = r2.mDatabase
            r0.unlock()
            boolean r0 = super.requery()
            return r0
        L3c:
            r0 = move-exception
            r2.queryThreadUnlock()     // Catch: java.lang.Throwable -> L15
            throw r0     // Catch: java.lang.Throwable -> L15
        L41:
            net.sqlcipher.database.SQLiteDatabase r1 = r2.mDatabase
            r1.unlock()
            throw r0
    }

    public void setFillWindowForwardOnly(boolean r1) {
            r0 = this;
            r0.fillWindowForwardOnly = r1
            return
    }

    public void setLoadStyle(int r1, int r2) {
            r0 = this;
            r0.mMaxRead = r2
            r0.mInitialRead = r1
            java.util.concurrent.locks.ReentrantLock r1 = new java.util.concurrent.locks.ReentrantLock
            r2 = 1
            r1.<init>(r2)
            r0.mLock = r1
            return
    }

    public void setSelectionArguments(java.lang.String[] r2) {
            r1 = this;
            net.sqlcipher.database.SQLiteCursorDriver r0 = r1.mDriver
            r0.setBindArguments(r2)
            return
    }

    @Override // net.sqlcipher.AbstractWindowedCursor
    public void setWindow(net.sqlcipher.CursorWindow r2) {
            r1 = this;
            net.sqlcipher.CursorWindow r0 = r1.mWindow
            if (r0 == 0) goto L1e
            int r0 = r1.mCursorState
            int r0 = r0 + 1
            r1.mCursorState = r0
            r1.queryThreadLock()
            net.sqlcipher.CursorWindow r0 = r1.mWindow     // Catch: java.lang.Throwable -> L19
            r0.close()     // Catch: java.lang.Throwable -> L19
            r1.queryThreadUnlock()
            r0 = -1
            r1.mCount = r0
            goto L1e
        L19:
            r2 = move-exception
            r1.queryThreadUnlock()
            throw r2
        L1e:
            r1.mWindow = r2
            return
    }

    @Override // net.sqlcipher.AbstractCursor
    public boolean supportsUpdates() {
            r1 = this;
            java.lang.String r0 = r1.mEditTable
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }
}

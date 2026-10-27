package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class SQLiteDatabase extends net.sqlcipher.database.SQLiteClosable implements androidx.sqlite.db.SupportSQLiteDatabase {
    private static final java.lang.String COMMIT_SQL = "COMMIT;";
    public static final int CONFLICT_ABORT = 2;
    public static final int CONFLICT_FAIL = 3;
    public static final int CONFLICT_IGNORE = 4;
    public static final int CONFLICT_NONE = 0;
    public static final int CONFLICT_REPLACE = 5;
    public static final int CONFLICT_ROLLBACK = 1;
    private static final java.lang.String[] CONFLICT_VALUES = null;
    public static final int CREATE_IF_NECESSARY = 268435456;
    private static final java.util.regex.Pattern EMAIL_IN_DB_PATTERN = null;
    private static final int EVENT_DB_CORRUPT = 75004;
    private static final int EVENT_DB_OPERATION = 52000;
    static final java.lang.String GET_LOCK_LOG_PREFIX = "GETLOCK:";
    private static final java.lang.String KEY_ENCODING = "UTF-8";
    private static final int LOCK_ACQUIRED_WARNING_THREAD_TIME_IN_MS = 100;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS = 300;
    private static final int LOCK_ACQUIRED_WARNING_TIME_IN_MS_ALWAYS_PRINT = 2000;
    private static final int LOCK_WARNING_WINDOW_IN_MS = 20000;
    private static final java.lang.String LOG_SLOW_QUERIES_PROPERTY = "db.log.slow_query_threshold";
    public static final int MAX_SQL_CACHE_SIZE = 250;
    private static final int MAX_WARNINGS_ON_CACHESIZE_CONDITION = 1;
    public static final java.lang.String MEMORY = ":memory:";
    public static final int NO_LOCALIZED_COLLATORS = 16;
    public static final int OPEN_READONLY = 1;
    public static final int OPEN_READWRITE = 0;
    private static final int OPEN_READ_MASK = 1;
    private static final int QUERY_LOG_SQL_LENGTH = 64;
    private static final int SLEEP_AFTER_YIELD_QUANTUM = 1000;
    public static final java.lang.String SQLCIPHER_ANDROID_VERSION = "4.4.3";
    public static final int SQLITE_MAX_LIKE_PATTERN_LENGTH = 50000;
    private static final java.lang.String TAG = "Database";
    private static java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> sActiveDatabases;
    private static int sQueryLogTimeInMillis;
    private int mCacheFullWarnings;
    java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> mCompiledQueries;
    private final net.sqlcipher.DatabaseErrorHandler mErrorHandler;
    private net.sqlcipher.database.SQLiteDatabase.CursorFactory mFactory;
    private int mFlags;
    private boolean mInnerTransactionIsSuccessful;
    private long mLastLockMessageTime;
    private java.lang.String mLastSqlStatement;
    private final java.util.concurrent.locks.ReentrantLock mLock;
    private long mLockAcquiredThreadTime;
    private long mLockAcquiredWallTime;
    private boolean mLockingEnabled;
    private int mMaxSqlCacheSize;
    long mNativeHandle;
    private int mNumCacheHits;
    private int mNumCacheMisses;
    private java.lang.String mPath;
    private java.lang.String mPathForLogs;
    private java.util.WeakHashMap<net.sqlcipher.database.SQLiteClosable, java.lang.Object> mPrograms;
    private final int mSlowQueryThreshold;
    private java.lang.Throwable mStackTrace;
    private final java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteDatabase.SyncUpdateInfo> mSyncUpdateInfo;
    int mTempTableSequence;
    private java.lang.String mTimeClosed;
    private java.lang.String mTimeOpened;
    private boolean mTransactionIsSuccessful;
    private net.sqlcipher.database.SQLiteTransactionListener mTransactionListener;






    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CursorFactory {
        net.sqlcipher.Cursor newCursor(net.sqlcipher.database.SQLiteDatabase r1, net.sqlcipher.database.SQLiteCursorDriver r2, java.lang.String r3, net.sqlcipher.database.SQLiteQuery r4);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface LibraryLoader {
        void loadLibraries(java.lang.String... r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum SQLiteDatabaseTransactionType extends java.lang.Enum<net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType> {
        private static final /* synthetic */ net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType[] $VALUES = null;
        public static final net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType Deferred = null;
        public static final net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType Exclusive = null;
        public static final net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType Immediate = null;

        static {
                net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r0 = new net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType
                java.lang.String r1 = "Deferred"
                r2 = 0
                r0.<init>(r1, r2)
                net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Deferred = r0
                net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r1 = new net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType
                java.lang.String r3 = "Immediate"
                r4 = 1
                r1.<init>(r3, r4)
                net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Immediate = r1
                net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r3 = new net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType
                java.lang.String r5 = "Exclusive"
                r6 = 2
                r3.<init>(r5, r6)
                net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Exclusive = r3
                r5 = 3
                net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType[] r5 = new net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.$VALUES = r5
                return
        }

        SQLiteDatabaseTransactionType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType valueOf(java.lang.String r1) {
                java.lang.Class<net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType> r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r1 = (net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType) r1
                return r1
        }

        public static net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType[] values() {
                net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType[] r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.$VALUES
                java.lang.Object r0 = r0.clone()
                net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType[] r0 = (net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class SyncUpdateInfo {
        java.lang.String deletedTable;
        java.lang.String foreignKey;
        java.lang.String masterTable;

        SyncUpdateInfo(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.masterTable = r1
                r0.deletedTable = r2
                r0.foreignKey = r3
                return
        }
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            net.sqlcipher.database.SQLiteDatabase.sActiveDatabases = r0
            java.lang.String r5 = " OR IGNORE "
            java.lang.String r6 = " OR REPLACE "
            java.lang.String r1 = ""
            java.lang.String r2 = " OR ROLLBACK "
            java.lang.String r3 = " OR ABORT "
            java.lang.String r4 = " OR FAIL "
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6}
            net.sqlcipher.database.SQLiteDatabase.CONFLICT_VALUES = r0
            java.lang.String r0 = "[\\w\\.\\-]+@[\\w\\.\\-]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            net.sqlcipher.database.SQLiteDatabase.EMAIL_IN_DB_PATTERN = r0
            r0 = 0
            net.sqlcipher.database.SQLiteDatabase.sQueryLogTimeInMillis = r0
            return
    }

    private SQLiteDatabase(java.lang.String r5, net.sqlcipher.database.SQLiteDatabase.CursorFactory r6, int r7, net.sqlcipher.DatabaseErrorHandler r8) {
            r4 = this;
            r4.<init>()
            java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
            r1 = 1
            r0.<init>(r1)
            r4.mLock = r0
            r2 = 0
            r4.mLockAcquiredWallTime = r2
            r4.mLockAcquiredThreadTime = r2
            r4.mLastLockMessageTime = r2
            r0 = 0
            r4.mLastSqlStatement = r0
            r4.mNativeHandle = r2
            r2 = 0
            r4.mTempTableSequence = r2
            r4.mPathForLogs = r0
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r4.mCompiledQueries = r2
            r2 = 250(0xfa, float:3.5E-43)
            r4.mMaxSqlCacheSize = r2
            r4.mTimeOpened = r0
            r4.mTimeClosed = r0
            r4.mStackTrace = r0
            r4.mLockingEnabled = r1
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r4.mSyncUpdateInfo = r0
            if (r5 == 0) goto L57
            r4.mFlags = r7
            r4.mPath = r5
            r5 = -1
            r4.mSlowQueryThreshold = r5
            net.sqlcipher.database.DatabaseObjectNotClosedException r5 = new net.sqlcipher.database.DatabaseObjectNotClosedException
            r5.<init>()
            java.lang.Throwable r5 = r5.fillInStackTrace()
            r4.mStackTrace = r5
            r4.mFactory = r6
            java.util.WeakHashMap r5 = new java.util.WeakHashMap
            r5.<init>()
            r4.mPrograms = r5
            r4.mErrorHandler = r8
            return
        L57:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "path should not be null"
            r5.<init>(r6)
            throw r5
    }

    public SQLiteDatabase(java.lang.String r2, byte[] r3, net.sqlcipher.database.SQLiteDatabase.CursorFactory r4, int r5, net.sqlcipher.database.SQLiteDatabaseHook r6) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r4, r5, r0)
            r1.openDatabaseInternal(r3, r6)
            return
    }

    public SQLiteDatabase(java.lang.String r2, char[] r3, net.sqlcipher.database.SQLiteDatabase.CursorFactory r4, int r5) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r4, r5, r0)
            r1.openDatabaseInternal(r3, r0)
            return
    }

    public SQLiteDatabase(java.lang.String r2, char[] r3, net.sqlcipher.database.SQLiteDatabase.CursorFactory r4, int r5, net.sqlcipher.database.SQLiteDatabaseHook r6) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r4, r5, r0)
            r1.openDatabaseInternal(r3, r6)
            return
    }

    static /* synthetic */ void access$000(net.sqlcipher.database.SQLiteDatabase r0, byte[] r1) throws net.sqlcipher.SQLException {
            r0.key(r1)
            return
    }

    static /* synthetic */ void access$100(net.sqlcipher.database.SQLiteDatabase r0, char[] r1) throws net.sqlcipher.SQLException {
            r0.key_mutf8(r1)
            return
    }

    private void beginTransactionWithListenerInternal(net.sqlcipher.database.SQLiteTransactionListener r4, net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType r5) {
            r3 = this;
            r3.lockForced()
            boolean r0 = r3.isOpen()
            if (r0 == 0) goto L67
            java.util.concurrent.locks.ReentrantLock r0 = r3.mLock     // Catch: java.lang.Throwable -> L1f
            int r0 = r0.getHoldCount()     // Catch: java.lang.Throwable -> L1f
            r1 = 1
            if (r0 <= r1) goto L21
            boolean r4 = r3.mInnerTransactionIsSuccessful     // Catch: java.lang.Throwable -> L1f
            if (r4 != 0) goto L17
            return
        L17:
            java.lang.String r4 = "Cannot call beginTransaction between calling setTransactionSuccessful and endTransaction"
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1f
            throw r5     // Catch: java.lang.Throwable -> L1f
        L1f:
            r4 = move-exception
            goto L63
        L21:
            net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Exclusive     // Catch: java.lang.Throwable -> L1f
            r2 = 0
            if (r5 != r0) goto L2c
            java.lang.String r5 = "BEGIN EXCLUSIVE;"
            r3.execSQL(r5)     // Catch: java.lang.Throwable -> L1f
            goto L3f
        L2c:
            net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Immediate     // Catch: java.lang.Throwable -> L1f
            if (r5 != r0) goto L36
            java.lang.String r5 = "BEGIN IMMEDIATE;"
            r3.execSQL(r5)     // Catch: java.lang.Throwable -> L1f
            goto L3f
        L36:
            net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Deferred     // Catch: java.lang.Throwable -> L1f
            if (r5 != r0) goto L53
            java.lang.String r5 = "BEGIN DEFERRED;"
            r3.execSQL(r5)     // Catch: java.lang.Throwable -> L1f
        L3f:
            r3.mTransactionListener = r4     // Catch: java.lang.Throwable -> L1f
            r3.mTransactionIsSuccessful = r1     // Catch: java.lang.Throwable -> L1f
            r3.mInnerTransactionIsSuccessful = r2     // Catch: java.lang.Throwable -> L1f
            if (r4 == 0) goto L52
            r4.onBegin()     // Catch: java.lang.Throwable -> L1f java.lang.RuntimeException -> L4b
            goto L52
        L4b:
            r4 = move-exception
            java.lang.String r5 = "ROLLBACK;"
            r3.execSQL(r5)     // Catch: java.lang.Throwable -> L1f
            throw r4     // Catch: java.lang.Throwable -> L1f
        L52:
            return
        L53:
            java.lang.String r4 = "%s is an unsupported transaction type"
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L1f
            r0[r2] = r5     // Catch: java.lang.Throwable -> L1f
            java.lang.String r4 = java.lang.String.format(r4, r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L1f
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L1f
            throw r5     // Catch: java.lang.Throwable -> L1f
        L63:
            r3.unlockForced()
            throw r4
        L67:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "database not open"
            r4.<init>(r5)
            throw r4
    }

    private void checkLockHoldTime() {
            r10 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = r10.mLockAcquiredWallTime
            long r2 = r0 - r2
            r4 = 2000(0x7d0, double:9.88E-321)
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto L22
            java.lang.String r4 = "Database"
            r5 = 2
            boolean r4 = android.util.Log.isLoggable(r4, r5)
            if (r4 != 0) goto L22
            long r4 = r10.mLastLockMessageTime
            long r4 = r0 - r4
            r7 = 20000(0x4e20, double:9.8813E-320)
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 >= 0) goto L22
            goto L3e
        L22:
            r4 = 300(0x12c, double:1.48E-321)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L3e
            long r2 = android.os.Debug.threadCpuTimeNanos()
            long r4 = r10.mLockAcquiredThreadTime
            long r2 = r2 - r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 / r4
            int r3 = (int) r2
            r2 = 100
            if (r3 > r2) goto L3a
            if (r6 <= 0) goto L3e
        L3a:
            r10.mLastLockMessageTime = r0
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING_STACK_TRACE
        L3e:
            return
    }

    private void closeClosable() {
            r2 = this;
            r2.deallocCachedSqlStatements()
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteClosable, java.lang.Object> r0 = r2.mPrograms
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L25
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getKey()
            net.sqlcipher.database.SQLiteClosable r1 = (net.sqlcipher.database.SQLiteClosable) r1
            if (r1 == 0) goto Ld
            r1.onAllReferencesReleasedFromContainer()
            goto Ld
        L25:
            return
    }

    private boolean containsNull(char[] r5) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L13
            int r1 = r5.length
            if (r1 <= 0) goto L13
            int r1 = r5.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L13
            char r3 = r5[r2]
            if (r3 != 0) goto L10
            r5 = 1
            return r5
        L10:
            int r2 = r2 + 1
            goto L8
        L13:
            return r0
    }

    public static net.sqlcipher.database.SQLiteDatabase create(net.sqlcipher.database.SQLiteDatabase.CursorFactory r2, java.lang.String r3) {
            if (r3 != 0) goto L4
            r3 = 0
            goto L8
        L4:
            char[] r3 = r3.toCharArray()
        L8:
            r0 = 268435456(0x10000000, float:2.524355E-29)
            java.lang.String r1 = ":memory:"
            net.sqlcipher.database.SQLiteDatabase r2 = openDatabase(r1, r3, r2, r0)
            return r2
    }

    public static net.sqlcipher.database.SQLiteDatabase create(net.sqlcipher.database.SQLiteDatabase.CursorFactory r2, char[] r3) {
            java.lang.String r0 = ":memory:"
            r1 = 268435456(0x10000000, float:2.524355E-29)
            net.sqlcipher.database.SQLiteDatabase r2 = openDatabase(r0, r3, r2, r1)
            return r2
    }

    private native void dbclose();

    private native void dbopen(java.lang.String r1, int r2);

    private void deallocCachedSqlStatements() {
            r3 = this;
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r3.mCompiledQueries
            monitor-enter(r0)
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch: java.lang.Throwable -> L1d
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1d
        Ld:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1d
            if (r2 == 0) goto L1f
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L1d
            net.sqlcipher.database.SQLiteCompiledSql r2 = (net.sqlcipher.database.SQLiteCompiledSql) r2     // Catch: java.lang.Throwable -> L1d
            r2.releaseSqlStatement()     // Catch: java.lang.Throwable -> L1d
            goto Ld
        L1d:
            r1 = move-exception
            goto L26
        L1f:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch: java.lang.Throwable -> L1d
            r1.clear()     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L26:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
    }

    private native void enableSqlProfiling(java.lang.String r1);

    private native void enableSqlTracing(java.lang.String r1);

    public static java.lang.String findEditTable(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L29
            r0 = 32
            int r0 = r3.indexOf(r0)
            r1 = 44
            int r1 = r3.indexOf(r1)
            r2 = 0
            if (r0 <= 0) goto L1e
            if (r0 < r1) goto L19
            if (r1 >= 0) goto L1e
        L19:
            java.lang.String r3 = r3.substring(r2, r0)
            return r3
        L1e:
            if (r1 <= 0) goto L28
            if (r1 < r0) goto L24
            if (r0 >= 0) goto L28
        L24:
            java.lang.String r3 = r3.substring(r2, r1)
        L28:
            return r3
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Invalid tables"
            r3.<init>(r0)
            throw r3
    }

    private static java.util.ArrayList<net.sqlcipher.database.SQLiteDatabase> getActiveDatabases() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r1 = net.sqlcipher.database.SQLiteDatabase.sActiveDatabases
            monitor-enter(r1)
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r2 = net.sqlcipher.database.SQLiteDatabase.sActiveDatabases     // Catch: java.lang.Throwable -> L13
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L13
            r0.addAll(r2)     // Catch: java.lang.Throwable -> L13
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            return r0
        L13:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L13
            throw r0
    }

    private static java.util.ArrayList<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs(net.sqlcipher.database.SQLiteDatabase r4) {
            boolean r0 = r4.isOpen()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r2 = "pragma database_list;"
            net.sqlcipher.Cursor r4 = r4.rawQuery(r2, r1)
        L13:
            boolean r1 = r4.moveToNext()
            if (r1 == 0) goto L2c
            android.util.Pair r1 = new android.util.Pair
            r2 = 1
            java.lang.String r2 = r4.getString(r2)
            r3 = 2
            java.lang.String r3 = r4.getString(r3)
            r1.<init>(r2, r3)
            r0.add(r1)
            goto L13
        L2c:
            r4.close()
            return r0
    }

    public static byte[] getBytes(char[] r1) {
            if (r1 == 0) goto L1e
            int r0 = r1.length
            if (r0 != 0) goto L6
            goto L1e
        L6:
            java.nio.CharBuffer r1 = java.nio.CharBuffer.wrap(r1)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.nio.ByteBuffer r1 = r0.encode(r1)
            int r0 = r1.limit()
            byte[] r0 = new byte[r0]
            r1.get(r0)
            return r0
        L1e:
            r1 = 0
            return r1
    }

    public static char[] getChars(byte[] r1) {
            if (r1 == 0) goto L1e
            int r0 = r1.length
            if (r0 != 0) goto L6
            goto L1e
        L6:
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            java.lang.String r0 = "UTF-8"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)
            java.nio.CharBuffer r1 = r0.decode(r1)
            int r0 = r1.limit()
            char[] r0 = new char[r0]
            r1.get(r0)
            return r0
        L1e:
            r1 = 0
            return r1
    }

    static java.util.ArrayList<net.sqlcipher.database.SQLiteDebug.DbStats> getDbStats() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = getActiveDatabases()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Ld7
            java.lang.Object r2 = r1.next()
            net.sqlcipher.database.SQLiteDatabase r2 = (net.sqlcipher.database.SQLiteDatabase) r2
            if (r2 == 0) goto Ld
            boolean r3 = r2.isOpen()
            if (r3 != 0) goto L22
            goto Ld
        L22:
            int r3 = r2.native_getDbLookaside()
            java.lang.String r4 = r2.getPath()
            java.lang.String r5 = "/"
            int r6 = r4.lastIndexOf(r5)
            r7 = -1
            r8 = 0
            if (r6 == r7) goto L37
            int r6 = r6 + 1
            goto L38
        L37:
            r6 = 0
        L38:
            java.lang.String r4 = r4.substring(r6)
            java.util.ArrayList r6 = getAttachedDbs(r2)
            if (r6 != 0) goto L43
            goto Ld
        L43:
            r9 = 0
        L44:
            int r10 = r6.size()
            if (r9 >= r10) goto Ld
            java.lang.Object r10 = r6.get(r9)
            android.util.Pair r10 = (android.util.Pair) r10
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.Object r12 = r10.first
            java.lang.String r12 = (java.lang.String) r12
            r11.append(r12)
            java.lang.String r12 = ".page_count;"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            long r14 = getPragmaVal(r2, r11)
            if (r9 != 0) goto L6f
            r18 = r3
            r13 = r4
            goto Lbf
        L6f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r11 = "  (attached) "
            r3.append(r11)
            java.lang.Object r11 = r10.first
            java.lang.String r11 = (java.lang.String) r11
            r3.append(r11)
            java.lang.String r3 = r3.toString()
            java.lang.Object r11 = r10.second
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r11 = r11.trim()
            int r11 = r11.length()
            if (r11 <= 0) goto Lbc
            java.lang.Object r11 = r10.second
            java.lang.String r11 = (java.lang.String) r11
            int r11 = r11.lastIndexOf(r5)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r3)
            java.lang.String r3 = " : "
            r12.append(r3)
            java.lang.Object r3 = r10.second
            java.lang.String r3 = (java.lang.String) r3
            if (r11 == r7) goto Lb0
            int r11 = r11 + 1
            goto Lb1
        Lb0:
            r11 = 0
        Lb1:
            java.lang.String r3 = r3.substring(r11)
            r12.append(r3)
            java.lang.String r3 = r12.toString()
        Lbc:
            r13 = r3
            r18 = 0
        Lbf:
            r10 = 0
            int r3 = (r14 > r10 ? 1 : (r14 == r10 ? 0 : -1))
            if (r3 <= 0) goto Ld1
            net.sqlcipher.database.SQLiteDebug$DbStats r12 = new net.sqlcipher.database.SQLiteDebug$DbStats
            long r16 = r2.getPageSize()
            r12.<init>(r13, r14, r16, r18)
            r0.add(r12)
        Ld1:
            int r9 = r9 + 1
            r3 = r18
            goto L44
        Ld7:
            return r0
    }

    private java.lang.String getPathForLogs() {
            r2 = this;
            java.lang.String r0 = r2.mPathForLogs
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = r2.mPath
            if (r0 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            r1 = 64
            int r0 = r0.indexOf(r1)
            r1 = -1
            if (r0 != r1) goto L19
            java.lang.String r0 = r2.mPath
            r2.mPathForLogs = r0
            goto L29
        L19:
            java.util.regex.Pattern r0 = net.sqlcipher.database.SQLiteDatabase.EMAIL_IN_DB_PATTERN
            java.lang.String r1 = r2.mPath
            java.util.regex.Matcher r0 = r0.matcher(r1)
            java.lang.String r1 = "XX@YY"
            java.lang.String r0 = r0.replaceAll(r1)
            r2.mPathForLogs = r0
        L29:
            java.lang.String r0 = r2.mPathForLogs
            return r0
    }

    private static long getPragmaVal(net.sqlcipher.database.SQLiteDatabase r4, java.lang.String r5) {
            boolean r0 = r4.isOpen()
            if (r0 != 0) goto L9
            r4 = 0
            return r4
        L9:
            r0 = 0
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch: java.lang.Throwable -> L2b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2b
            r2.<init>()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "PRAGMA "
            r2.append(r3)     // Catch: java.lang.Throwable -> L2b
            r2.append(r5)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L2b
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L2b
            long r4 = r1.simpleQueryForLong()     // Catch: java.lang.Throwable -> L28
            r1.close()
            return r4
        L28:
            r4 = move-exception
            r0 = r1
            goto L2c
        L2b:
            r4 = move-exception
        L2c:
            if (r0 == 0) goto L31
            r0.close()
        L31:
            throw r4
    }

    private android.util.Pair<java.lang.Boolean, java.lang.String> getResultFromPragma(java.lang.String r3) {
            r2 = this;
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            net.sqlcipher.Cursor r3 = r2.rawQuery(r3, r1)
            if (r3 != 0) goto L13
            android.util.Pair r3 = new android.util.Pair
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            java.lang.String r1 = ""
            r3.<init>(r0, r1)
            return r3
        L13:
            r3.moveToFirst()
            java.lang.String r0 = r3.getString(r0)
            r3.close()
            android.util.Pair r3 = new android.util.Pair
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            r3.<init>(r1, r0)
            return r3
    }

    private java.lang.String getTime() {
            r3 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd HH:mm:ss.SSS "
            java.util.Locale r2 = java.util.Locale.US
            r0.<init>(r1, r2)
            long r1 = java.lang.System.currentTimeMillis()
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    private native void key(byte[] r1) throws net.sqlcipher.SQLException;

    private void keyDatabase(net.sqlcipher.database.SQLiteDatabaseHook r2, java.lang.Runnable r3) {
            r1 = this;
            if (r2 == 0) goto L5
            r2.preKey(r1)
        L5:
            if (r3 == 0) goto La
            r3.run()
        La:
            if (r2 == 0) goto Lf
            r2.postKey(r1)
        Lf:
            boolean r2 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE
            if (r2 == 0) goto L19
            java.lang.String r2 = r1.getTime()
            r1.mTimeOpened = r2
        L19:
            java.lang.String r2 = "select count(*) from sqlite_master;"
            r3 = 0
            java.lang.String[] r0 = new java.lang.String[r3]
            net.sqlcipher.Cursor r2 = r1.rawQuery(r2, r0)
            if (r2 == 0) goto L2d
            r2.moveToFirst()
            r2.getInt(r3)
            r2.close()
        L2d:
            return
    }

    private native void key_mutf8(char[] r1) throws net.sqlcipher.SQLException;

    private static void loadICUData(android.content.Context r5, java.io.File r6) {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "icu"
            r0.<init>(r6, r1)
            java.io.File r6 = new java.io.File
            java.lang.String r1 = "icudt46l.dat"
            r6.<init>(r0, r1)
            r1 = 0
            boolean r2 = r0.exists()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            if (r2 != 0) goto L20
            r0.mkdirs()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            goto L20
        L19:
            r5 = move-exception
            r6 = r1
            goto L84
        L1d:
            r5 = move-exception
            r0 = r1
            goto L75
        L20:
            boolean r0 = r6.exists()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            if (r0 != 0) goto L5e
            java.util.zip.ZipInputStream r0 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            android.content.res.AssetManager r5 = r5.getAssets()     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            java.lang.String r2 = "icudt46l.zip"
            java.io.InputStream r5 = r5.open(r2)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            r0.<init>(r5)     // Catch: java.lang.Throwable -> L19 java.lang.Exception -> L1d
            r0.getNextEntry()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5c
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L52
        L41:
            int r2 = r0.read(r1)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L52
            if (r2 <= 0) goto L57
            r3 = 0
            r5.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L4c java.lang.Exception -> L52
            goto L41
        L4c:
            r6 = move-exception
            r1 = r6
            r6 = r5
            r5 = r1
        L50:
            r1 = r0
            goto L84
        L52:
            r1 = move-exception
            r4 = r1
            r1 = r5
            r5 = r4
            goto L75
        L57:
            r1 = r0
            goto L5f
        L59:
            r5 = move-exception
            r6 = r1
            goto L50
        L5c:
            r5 = move-exception
            goto L75
        L5e:
            r5 = r1
        L5f:
            if (r1 == 0) goto L64
            r1.close()     // Catch: java.io.IOException -> L6d
        L64:
            if (r5 == 0) goto L74
            r5.flush()     // Catch: java.io.IOException -> L6d
            r5.close()     // Catch: java.io.IOException -> L6d
            return
        L6d:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L74:
            return
        L75:
            boolean r2 = r6.exists()     // Catch: java.lang.Throwable -> L59
            if (r2 == 0) goto L7e
            r6.delete()     // Catch: java.lang.Throwable -> L59
        L7e:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L59
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L59
            throw r6     // Catch: java.lang.Throwable -> L59
        L84:
            if (r1 == 0) goto L89
            r1.close()     // Catch: java.io.IOException -> L92
        L89:
            if (r6 == 0) goto L99
            r6.flush()     // Catch: java.io.IOException -> L92
            r6.close()     // Catch: java.io.IOException -> L92
            goto L99
        L92:
            r5 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            r6.<init>(r5)
            throw r6
        L99:
            throw r5
    }

    public static synchronized void loadLibs(android.content.Context r2) {
            java.lang.Class<net.sqlcipher.database.SQLiteDatabase> r0 = net.sqlcipher.database.SQLiteDatabase.class
            monitor-enter(r0)
            java.io.File r1 = r2.getFilesDir()     // Catch: java.lang.Throwable -> Lc
            loadLibs(r2, r1)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    public static synchronized void loadLibs(android.content.Context r2, java.io.File r3) {
            java.lang.Class<net.sqlcipher.database.SQLiteDatabase> r0 = net.sqlcipher.database.SQLiteDatabase.class
            monitor-enter(r0)
            net.sqlcipher.database.SQLiteDatabase$1 r1 = new net.sqlcipher.database.SQLiteDatabase$1     // Catch: java.lang.Throwable -> Ld
            r1.<init>()     // Catch: java.lang.Throwable -> Ld
            loadLibs(r2, r3, r1)     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        Ld:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r2
    }

    public static synchronized void loadLibs(android.content.Context r0, java.io.File r1, net.sqlcipher.database.SQLiteDatabase.LibraryLoader r2) {
            java.lang.Class<net.sqlcipher.database.SQLiteDatabase> r0 = net.sqlcipher.database.SQLiteDatabase.class
            monitor-enter(r0)
            java.lang.String r1 = "sqlcipher"
            java.lang.String[] r1 = new java.lang.String[]{r1}     // Catch: java.lang.Throwable -> Le
            r2.loadLibraries(r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
    }

    public static synchronized void loadLibs(android.content.Context r2, net.sqlcipher.database.SQLiteDatabase.LibraryLoader r3) {
            java.lang.Class<net.sqlcipher.database.SQLiteDatabase> r0 = net.sqlcipher.database.SQLiteDatabase.class
            monitor-enter(r0)
            java.io.File r1 = r2.getFilesDir()     // Catch: java.lang.Throwable -> Lc
            loadLibs(r2, r1, r3)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r0)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    private void lockForced() {
            r2 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r2.mLock
            r0.lock()
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING
            if (r0 == 0) goto L1e
            java.util.concurrent.locks.ReentrantLock r0 = r2.mLock
            int r0 = r0.getHoldCount()
            r1 = 1
            if (r0 != r1) goto L1e
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.mLockAcquiredWallTime = r0
            long r0 = android.os.Debug.threadCpuTimeNanos()
            r2.mLockAcquiredThreadTime = r0
        L1e:
            return
    }

    private void markTableSyncable(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6) {
            r2 = this;
            r2.lock()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r0.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "SELECT _sync_dirty FROM "
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            r0.append(r5)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = " LIMIT 0"
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L52
            r2.native_execSQL(r0)     // Catch: java.lang.Throwable -> L52
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52
            r0.<init>()     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = "SELECT "
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            r0.append(r4)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = " FROM "
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            r0.append(r3)     // Catch: java.lang.Throwable -> L52
            java.lang.String r1 = " LIMIT 0"
            r0.append(r1)     // Catch: java.lang.Throwable -> L52
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L52
            r2.native_execSQL(r0)     // Catch: java.lang.Throwable -> L52
            r2.unlock()
            net.sqlcipher.database.SQLiteDatabase$SyncUpdateInfo r0 = new net.sqlcipher.database.SQLiteDatabase$SyncUpdateInfo
            r0.<init>(r5, r6, r4)
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteDatabase$SyncUpdateInfo> r4 = r2.mSyncUpdateInfo
            monitor-enter(r4)
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteDatabase$SyncUpdateInfo> r5 = r2.mSyncUpdateInfo     // Catch: java.lang.Throwable -> L4f
            r5.put(r3, r0)     // Catch: java.lang.Throwable -> L4f
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
            return
        L4f:
            r3 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4f
            throw r3
        L52:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    private native int native_getDbLookaside();

    private native void native_rawExecSQL(java.lang.String r1);

    private native int native_status(int r1, boolean r2);

    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String r1, java.lang.String r2, net.sqlcipher.database.SQLiteDatabase.CursorFactory r3, int r4) {
            r0 = 0
            net.sqlcipher.database.SQLiteDatabase r1 = openDatabase(r1, r2, r3, r4, r0)
            return r1
    }

    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String r6, java.lang.String r7, net.sqlcipher.database.SQLiteDatabase.CursorFactory r8, int r9, net.sqlcipher.database.SQLiteDatabaseHook r10) {
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            net.sqlcipher.database.SQLiteDatabase r6 = openDatabase(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String r6, java.lang.String r7, net.sqlcipher.database.SQLiteDatabase.CursorFactory r8, int r9, net.sqlcipher.database.SQLiteDatabaseHook r10, net.sqlcipher.DatabaseErrorHandler r11) {
            if (r7 != 0) goto La
            r7 = 0
        L3:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            goto Lf
        La:
            char[] r7 = r7.toCharArray()
            goto L3
        Lf:
            net.sqlcipher.database.SQLiteDatabase r6 = openDatabase(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String r2, byte[] r3, net.sqlcipher.database.SQLiteDatabase.CursorFactory r4, int r5, net.sqlcipher.database.SQLiteDatabaseHook r6, net.sqlcipher.DatabaseErrorHandler r7) {
            if (r7 == 0) goto L3
            goto L8
        L3:
            net.sqlcipher.DefaultDatabaseErrorHandler r7 = new net.sqlcipher.DefaultDatabaseErrorHandler
            r7.<init>()
        L8:
            r0 = 0
            net.sqlcipher.database.SQLiteDatabase r1 = new net.sqlcipher.database.SQLiteDatabase     // Catch: net.sqlcipher.database.SQLiteDatabaseCorruptException -> L12
            r1.<init>(r2, r4, r5, r7)     // Catch: net.sqlcipher.database.SQLiteDatabaseCorruptException -> L12
            r1.openDatabaseInternal(r3, r6)     // Catch: net.sqlcipher.database.SQLiteDatabaseCorruptException -> L13
            goto L1e
        L12:
            r1 = r0
        L13:
            r7.onCorruption(r1)
            net.sqlcipher.database.SQLiteDatabase r1 = new net.sqlcipher.database.SQLiteDatabase
            r1.<init>(r2, r4, r5, r7)
            r1.openDatabaseInternal(r3, r6)
        L1e:
            boolean r3 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS
            if (r3 == 0) goto L25
            r1.enableSqlTracing(r2)
        L25:
            boolean r3 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_TIME
            if (r3 == 0) goto L2c
            r1.enableSqlProfiling(r2)
        L2c:
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r2 = net.sqlcipher.database.SQLiteDatabase.sActiveDatabases
            monitor-enter(r2)
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r3 = net.sqlcipher.database.SQLiteDatabase.sActiveDatabases     // Catch: java.lang.Throwable -> L36
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L36
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            return r1
        L36:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L36
            throw r3
    }

    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String r6, char[] r7, net.sqlcipher.database.SQLiteDatabase.CursorFactory r8, int r9) {
            r4 = 0
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            net.sqlcipher.database.SQLiteDatabase r6 = openDatabase(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String r6, char[] r7, net.sqlcipher.database.SQLiteDatabase.CursorFactory r8, int r9, net.sqlcipher.database.SQLiteDatabaseHook r10) {
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            net.sqlcipher.database.SQLiteDatabase r6 = openDatabase(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static net.sqlcipher.database.SQLiteDatabase openDatabase(java.lang.String r0, char[] r1, net.sqlcipher.database.SQLiteDatabase.CursorFactory r2, int r3, net.sqlcipher.database.SQLiteDatabaseHook r4, net.sqlcipher.DatabaseErrorHandler r5) {
            byte[] r1 = getBytes(r1)
            net.sqlcipher.database.SQLiteDatabase r0 = openDatabase(r0, r1, r2, r3, r4, r5)
            return r0
    }

    private void openDatabaseInternal(byte[] r5, net.sqlcipher.database.SQLiteDatabaseHook r6) {
            r4 = this;
            java.lang.String r0 = r4.mPath
            int r1 = r4.mFlags
            r4.dbopen(r0, r1)
            r0 = 1
            net.sqlcipher.database.SQLiteDatabase$2 r1 = new net.sqlcipher.database.SQLiteDatabase$2     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r1.<init>(r4, r5)     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            r4.keyDatabase(r6, r1)     // Catch: java.lang.Throwable -> L11 java.lang.RuntimeException -> L13
            return
        L11:
            r5 = move-exception
            goto L39
        L13:
            r1 = move-exception
            char[] r2 = getChars(r5)     // Catch: java.lang.Throwable -> L11
            boolean r3 = r4.containsNull(r2)     // Catch: java.lang.Throwable -> L11
            if (r3 == 0) goto L38
            net.sqlcipher.database.SQLiteDatabase$3 r1 = new net.sqlcipher.database.SQLiteDatabase$3     // Catch: java.lang.Throwable -> L11
            r1.<init>(r4, r5, r2)     // Catch: java.lang.Throwable -> L11
            r4.keyDatabase(r6, r1)     // Catch: java.lang.Throwable -> L11
            if (r5 == 0) goto L2e
            int r6 = r5.length     // Catch: java.lang.Throwable -> L11
            if (r6 <= 0) goto L2e
            r4.rekey(r5)     // Catch: java.lang.Throwable -> L11
        L2e:
            if (r2 == 0) goto L37
            r0 = 0
            int r5 = r2.length     // Catch: java.lang.Throwable -> L11
            if (r5 <= 0) goto L37
            java.util.Arrays.fill(r2, r0)     // Catch: java.lang.Throwable -> L11
        L37:
            return
        L38:
            throw r1     // Catch: java.lang.Throwable -> L11
        L39:
            if (r0 == 0) goto L48
            r4.dbclose()
            boolean r6 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE
            if (r6 == 0) goto L48
            java.lang.String r6 = r4.getTime()
            r4.mTimeClosed = r6
        L48:
            throw r5
    }

    private void openDatabaseInternal(char[] r1, net.sqlcipher.database.SQLiteDatabaseHook r2) {
            r0 = this;
            byte[] r1 = getBytes(r1)
            r0.openDatabaseInternal(r1, r2)
            return
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.io.File r1, java.lang.String r2, net.sqlcipher.database.SQLiteDatabase.CursorFactory r3) {
            r0 = 0
            net.sqlcipher.database.SQLiteDatabase r1 = openOrCreateDatabase(r1, r2, r3, r0)
            return r1
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.io.File r1, java.lang.String r2, net.sqlcipher.database.SQLiteDatabase.CursorFactory r3, net.sqlcipher.database.SQLiteDatabaseHook r4) {
            r0 = 0
            net.sqlcipher.database.SQLiteDatabase r1 = openOrCreateDatabase(r1, r2, r3, r4, r0)
            return r1
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.io.File r0, java.lang.String r1, net.sqlcipher.database.SQLiteDatabase.CursorFactory r2, net.sqlcipher.database.SQLiteDatabaseHook r3, net.sqlcipher.DatabaseErrorHandler r4) {
            if (r0 != 0) goto L4
            r0 = 0
            goto L8
        L4:
            java.lang.String r0 = r0.getPath()
        L8:
            net.sqlcipher.database.SQLiteDatabase r0 = openOrCreateDatabase(r0, r1, r2, r3, r4)
            return r0
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String r2, java.lang.String r3, net.sqlcipher.database.SQLiteDatabase.CursorFactory r4) {
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1 = 0
            net.sqlcipher.database.SQLiteDatabase r2 = openDatabase(r2, r3, r4, r0, r1)
            return r2
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String r1, java.lang.String r2, net.sqlcipher.database.SQLiteDatabase.CursorFactory r3, net.sqlcipher.database.SQLiteDatabaseHook r4) {
            r0 = 268435456(0x10000000, float:2.524355E-29)
            net.sqlcipher.database.SQLiteDatabase r1 = openDatabase(r1, r2, r3, r0, r4)
            return r1
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String r6, java.lang.String r7, net.sqlcipher.database.SQLiteDatabase.CursorFactory r8, net.sqlcipher.database.SQLiteDatabaseHook r9, net.sqlcipher.DatabaseErrorHandler r10) {
            if (r7 != 0) goto L5
            r7 = 0
        L3:
            r1 = r7
            goto La
        L5:
            char[] r7 = r7.toCharArray()
            goto L3
        La:
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r0 = r6
            r2 = r8
            r4 = r9
            r5 = r10
            net.sqlcipher.database.SQLiteDatabase r6 = openDatabase(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String r6, byte[] r7, net.sqlcipher.database.SQLiteDatabase.CursorFactory r8) {
            r4 = 0
            r5 = 0
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r0 = r6
            r1 = r7
            r2 = r8
            net.sqlcipher.database.SQLiteDatabase r6 = openDatabase(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String r6, byte[] r7, net.sqlcipher.database.SQLiteDatabase.CursorFactory r8, net.sqlcipher.database.SQLiteDatabaseHook r9) {
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            net.sqlcipher.database.SQLiteDatabase r6 = openDatabase(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String r6, byte[] r7, net.sqlcipher.database.SQLiteDatabase.CursorFactory r8, net.sqlcipher.database.SQLiteDatabaseHook r9, net.sqlcipher.DatabaseErrorHandler r10) {
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            net.sqlcipher.database.SQLiteDatabase r6 = openDatabase(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String r2, char[] r3, net.sqlcipher.database.SQLiteDatabase.CursorFactory r4) {
            r0 = 268435456(0x10000000, float:2.524355E-29)
            r1 = 0
            net.sqlcipher.database.SQLiteDatabase r2 = openDatabase(r2, r3, r4, r0, r1)
            return r2
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String r1, char[] r2, net.sqlcipher.database.SQLiteDatabase.CursorFactory r3, net.sqlcipher.database.SQLiteDatabaseHook r4) {
            r0 = 268435456(0x10000000, float:2.524355E-29)
            net.sqlcipher.database.SQLiteDatabase r1 = openDatabase(r1, r2, r3, r0, r4)
            return r1
    }

    public static net.sqlcipher.database.SQLiteDatabase openOrCreateDatabase(java.lang.String r6, char[] r7, net.sqlcipher.database.SQLiteDatabase.CursorFactory r8, net.sqlcipher.database.SQLiteDatabaseHook r9, net.sqlcipher.DatabaseErrorHandler r10) {
            r3 = 268435456(0x10000000, float:2.524355E-29)
            r0 = r6
            r1 = r7
            r2 = r8
            r4 = r9
            r5 = r10
            net.sqlcipher.database.SQLiteDatabase r6 = openDatabase(r0, r1, r2, r3, r4, r5)
            return r6
    }

    private native void rekey(byte[] r1) throws net.sqlcipher.SQLException;

    public static native int releaseMemory();

    public static native void setICURoot(java.lang.String r0);

    private void unlockForced() {
            r2 = this;
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING
            if (r0 == 0) goto L10
            java.util.concurrent.locks.ReentrantLock r0 = r2.mLock
            int r0 = r0.getHoldCount()
            r1 = 1
            if (r0 != r1) goto L10
            r2.checkLockHoldTime()
        L10:
            java.util.concurrent.locks.ReentrantLock r0 = r2.mLock
            r0.unlock()
            return
    }

    private boolean yieldIfContendedHelper(boolean r8, long r9) {
            r7 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r7.mLock
            int r0 = r0.getQueueLength()
            if (r0 != 0) goto L16
            long r8 = android.os.SystemClock.elapsedRealtime()
            r7.mLockAcquiredWallTime = r8
            long r8 = android.os.Debug.threadCpuTimeNanos()
            r7.mLockAcquiredThreadTime = r8
            r8 = 0
            return r8
        L16:
            r7.setTransactionSuccessful()
            net.sqlcipher.database.SQLiteTransactionListener r0 = r7.mTransactionListener
            r7.endTransaction()
            if (r8 == 0) goto L2f
            boolean r8 = r7.isDbLockedByCurrentThread()
            if (r8 != 0) goto L27
            goto L2f
        L27:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "Db locked more than once. yielfIfContended cannot yield"
            r8.<init>(r9)
            throw r8
        L2f:
            r1 = 0
            int r8 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r8 <= 0) goto L52
        L35:
            int r8 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r8 <= 0) goto L52
            r3 = 1000(0x3e8, double:4.94E-321)
            int r8 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r8 >= 0) goto L41
            r5 = r9
            goto L42
        L41:
            r5 = r3
        L42:
            java.lang.Thread.sleep(r5)     // Catch: java.lang.InterruptedException -> L46
            goto L49
        L46:
            java.lang.Thread.interrupted()
        L49:
            long r9 = r9 - r3
            java.util.concurrent.locks.ReentrantLock r8 = r7.mLock
            int r8 = r8.getQueueLength()
            if (r8 != 0) goto L35
        L52:
            r7.beginTransactionWithListener(r0)
            r8 = 1
            return r8
    }

    void addSQLiteClosable(net.sqlcipher.database.SQLiteClosable r3) {
            r2 = this;
            r2.lock()
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteClosable, java.lang.Object> r0 = r2.mPrograms     // Catch: java.lang.Throwable -> Ld
            r1 = 0
            r0.put(r3, r1)     // Catch: java.lang.Throwable -> Ld
            r2.unlock()
            return
        Ld:
            r3 = move-exception
            r2.unlock()
            throw r3
    }

    void addToCompiledQueries(java.lang.String r4, net.sqlcipher.database.SQLiteCompiledSql r5) {
            r3 = this;
            int r0 = r3.mMaxSqlCacheSize
            if (r0 != 0) goto L7
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE
            return
        L7:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r3.mCompiledQueries
            monitor-enter(r0)
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch: java.lang.Throwable -> L16
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L16
            net.sqlcipher.database.SQLiteCompiledSql r1 = (net.sqlcipher.database.SQLiteCompiledSql) r1     // Catch: java.lang.Throwable -> L16
            if (r1 == 0) goto L18
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L16:
            r4 = move-exception
            goto L32
        L18:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch: java.lang.Throwable -> L16
            int r1 = r1.size()     // Catch: java.lang.Throwable -> L16
            int r2 = r3.mMaxSqlCacheSize     // Catch: java.lang.Throwable -> L16
            if (r1 != r2) goto L29
            int r4 = r3.mCacheFullWarnings     // Catch: java.lang.Throwable -> L16
            int r4 = r4 + 1
            r3.mCacheFullWarnings = r4     // Catch: java.lang.Throwable -> L16
            goto L30
        L29:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch: java.lang.Throwable -> L16
            r1.put(r4, r5)     // Catch: java.lang.Throwable -> L16
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE     // Catch: java.lang.Throwable -> L16
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            return
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L16
            throw r4
    }

    public void beginTransaction() {
            r1 = this;
            r0 = 0
            r1.beginTransactionWithListener(r0)
            return
    }

    public void beginTransactionNonExclusive() {
            r2 = this;
            r0 = 0
            net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r1 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Immediate
            r2.beginTransactionWithListenerInternal(r0, r1)
            return
    }

    public /* synthetic */ void beginTransactionReadOnly() {
            r0 = this;
            g.a.a(r0)
            return
    }

    public void beginTransactionWithListener(android.database.sqlite.SQLiteTransactionListener r2) {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase$4 r0 = new net.sqlcipher.database.SQLiteDatabase$4
            r0.<init>(r1, r2)
            r1.beginTransactionWithListener(r0)
            return
    }

    public void beginTransactionWithListener(net.sqlcipher.database.SQLiteTransactionListener r2) {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Exclusive
            r1.beginTransactionWithListenerInternal(r2, r0)
            return
    }

    public void beginTransactionWithListenerNonExclusive(android.database.sqlite.SQLiteTransactionListener r2) {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase$5 r0 = new net.sqlcipher.database.SQLiteDatabase$5
            r0.<init>(r1, r2)
            r1.beginTransactionWithListenerNonExclusive(r0)
            return
    }

    public void beginTransactionWithListenerNonExclusive(net.sqlcipher.database.SQLiteTransactionListener r2) {
            r1 = this;
            net.sqlcipher.database.SQLiteDatabase$SQLiteDatabaseTransactionType r0 = net.sqlcipher.database.SQLiteDatabase.SQLiteDatabaseTransactionType.Immediate
            r1.beginTransactionWithListenerInternal(r2, r0)
            return
    }

    public /* synthetic */ void beginTransactionWithListenerReadOnly(android.database.sqlite.SQLiteTransactionListener r1) {
            r0 = this;
            g.a.b(r0, r1)
            return
    }

    public void changePassword(java.lang.String r2) throws net.sqlcipher.database.SQLiteException {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L18
            if (r2 == 0) goto L17
            char[] r2 = r2.toCharArray()
            byte[] r2 = getBytes(r2)
            r1.rekey(r2)
            r0 = 0
            java.util.Arrays.fill(r2, r0)
        L17:
            return
        L18:
            net.sqlcipher.database.SQLiteException r2 = new net.sqlcipher.database.SQLiteException
            java.lang.String r0 = "database not open"
            r2.<init>(r0)
            throw r2
    }

    public void changePassword(char[] r2) throws net.sqlcipher.database.SQLiteException {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto L14
            if (r2 == 0) goto L13
            byte[] r2 = getBytes(r2)
            r1.rekey(r2)
            r0 = 0
            java.util.Arrays.fill(r2, r0)
        L13:
            return
        L14:
            net.sqlcipher.database.SQLiteException r2 = new net.sqlcipher.database.SQLiteException
            java.lang.String r0 = "database not open"
            r2.<init>(r0)
            throw r2
    }

    public void close() {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 != 0) goto L7
            return
        L7:
            r1.lock()
            r1.closeClosable()     // Catch: java.lang.Throwable -> L14
            r1.onAllReferencesReleased()     // Catch: java.lang.Throwable -> L14
            r1.unlock()
            return
        L14:
            r0 = move-exception
            r1.unlock()
            throw r0
    }

    public /* bridge */ /* synthetic */ androidx.sqlite.db.SupportSQLiteStatement compileStatement(java.lang.String r1) {
            r0 = this;
            net.sqlcipher.database.SQLiteStatement r1 = r0.m39compileStatement(r1)
            return r1
    }

    /* renamed from: compileStatement, reason: collision with other method in class */
    public net.sqlcipher.database.SQLiteStatement m39compileStatement(java.lang.String r2) throws net.sqlcipher.SQLException {
            r1 = this;
            r1.lock()
            boolean r0 = r1.isOpen()     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L14
            net.sqlcipher.database.SQLiteStatement r0 = new net.sqlcipher.database.SQLiteStatement     // Catch: java.lang.Throwable -> L12
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L12
            r1.unlock()
            return r0
        L12:
            r2 = move-exception
            goto L1c
        L14:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = "database not open"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L12
            throw r2     // Catch: java.lang.Throwable -> L12
        L1c:
            r1.unlock()
            throw r2
    }

    public int delete(java.lang.String r4, java.lang.String r5, java.lang.Object[] r6) {
            r3 = this;
            r3.lock()
            r0 = 0
            boolean r1 = r3.isOpen()     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            if (r1 == 0) goto L5d
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            r1.<init>()     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            java.lang.String r2 = "DELETE FROM "
            r1.append(r2)     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            r1.append(r4)     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            boolean r4 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            if (r4 != 0) goto L33
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            r4.<init>()     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            java.lang.String r2 = " WHERE "
            r4.append(r2)     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            r4.append(r5)     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            goto L35
        L2f:
            r4 = move-exception
            goto L69
        L31:
            r4 = move-exception
            goto L65
        L33:
            java.lang.String r4 = ""
        L35:
            r1.append(r4)     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            net.sqlcipher.database.SQLiteStatement r0 = r3.m39compileStatement(r4)     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            if (r6 == 0) goto L4f
            int r4 = r6.length     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            r5 = 0
        L44:
            if (r5 >= r4) goto L4f
            int r1 = r5 + 1
            r5 = r6[r5]     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            net.sqlcipher.DatabaseUtils.bindObjectToProgram(r0, r1, r5)     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            r5 = r1
            goto L44
        L4f:
            r0.execute()     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            int r4 = r3.lastChangeCount()     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            r0.close()
            r3.unlock()
            return r4
        L5d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            java.lang.String r5 = "database not open"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
            throw r4     // Catch: java.lang.Throwable -> L2f net.sqlcipher.database.SQLiteDatabaseCorruptException -> L31
        L65:
            r3.onCorruption()     // Catch: java.lang.Throwable -> L2f
            throw r4     // Catch: java.lang.Throwable -> L2f
        L69:
            if (r0 == 0) goto L6e
            r0.close()
        L6e:
            r3.unlock()
            throw r4
    }

    public int delete(java.lang.String r1, java.lang.String r2, java.lang.String[] r3) {
            r0 = this;
            int r1 = r0.delete(r1, r2, r3)
            return r1
    }

    public void disableWriteAheadLogging() {
            r2 = this;
            boolean r0 = r2.inTransaction()
            if (r0 != 0) goto Lc
            java.lang.String r0 = "PRAGMA journal_mode = DELETE;"
            r2.rawExecSQL(r0)
            return
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Write Ahead Logging cannot be disabled while in a transaction"
            r0.<init>(r1)
            throw r0
    }

    public boolean enableWriteAheadLogging() {
            r4 = this;
            boolean r0 = r4.inTransaction()
            if (r0 != 0) goto L2f
            java.util.ArrayList r0 = getAttachedDbs(r4)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L15
            int r0 = r0.size()
            if (r0 <= r2) goto L15
            return r1
        L15:
            boolean r0 = r4.isReadOnly()
            if (r0 != 0) goto L2e
            java.lang.String r0 = r4.getPath()
            java.lang.String r3 = ":memory:"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L28
            goto L2e
        L28:
            java.lang.String r0 = "PRAGMA journal_mode = WAL;"
            r4.rawExecSQL(r0)
            return r2
        L2e:
            return r1
        L2f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Write Ahead Logging cannot be enabled while in a transaction"
            r0.<init>(r1)
            throw r0
    }

    public void endTransaction() {
            r4 = this;
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L61
            java.util.concurrent.locks.ReentrantLock r0 = r4.mLock
            boolean r0 = r0.isHeldByCurrentThread()
            if (r0 == 0) goto L59
            r0 = 0
            boolean r1 = r4.mInnerTransactionIsSuccessful     // Catch: java.lang.Throwable -> L17
            r2 = 0
            if (r1 == 0) goto L19
            r4.mInnerTransactionIsSuccessful = r2     // Catch: java.lang.Throwable -> L17
            goto L1b
        L17:
            r1 = move-exception
            goto L53
        L19:
            r4.mTransactionIsSuccessful = r2     // Catch: java.lang.Throwable -> L17
        L1b:
            java.util.concurrent.locks.ReentrantLock r1 = r4.mLock     // Catch: java.lang.Throwable -> L17
            int r1 = r1.getHoldCount()     // Catch: java.lang.Throwable -> L17
            r3 = 1
            if (r1 == r3) goto L2a
        L24:
            r4.mTransactionListener = r0
            r4.unlockForced()
            return
        L2a:
            net.sqlcipher.database.SQLiteTransactionListener r1 = r4.mTransactionListener     // Catch: java.lang.Throwable -> L17
            if (r1 == 0) goto L3f
            boolean r3 = r4.mTransactionIsSuccessful     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L36
            if (r3 == 0) goto L38
            r1.onCommit()     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L36
            goto L3f
        L36:
            r1 = move-exception
            goto L3c
        L38:
            r1.onRollback()     // Catch: java.lang.Throwable -> L17 java.lang.RuntimeException -> L36
            goto L3f
        L3c:
            r4.mTransactionIsSuccessful = r2     // Catch: java.lang.Throwable -> L17
            goto L40
        L3f:
            r1 = r0
        L40:
            boolean r2 = r4.mTransactionIsSuccessful     // Catch: java.lang.Throwable -> L17
            if (r2 == 0) goto L4a
            java.lang.String r1 = "COMMIT;"
            r4.execSQL(r1)     // Catch: java.lang.Throwable -> L17
            goto L24
        L4a:
            java.lang.String r2 = "ROLLBACK;"
            r4.execSQL(r2)     // Catch: java.lang.Throwable -> L17 net.sqlcipher.SQLException -> L24
            if (r1 != 0) goto L52
            goto L24
        L52:
            throw r1     // Catch: java.lang.Throwable -> L17 net.sqlcipher.SQLException -> L24
        L53:
            r4.mTransactionListener = r0
            r4.unlockForced()
            throw r1
        L59:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "no transaction pending"
            r0.<init>(r1)
            throw r0
        L61:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "database not open"
            r0.<init>(r1)
            throw r0
    }

    public /* synthetic */ void execPerConnectionSQL(java.lang.String r1, java.lang.Object[] r2) {
            r0 = this;
            g.a.c(r0, r1, r2)
            return
    }

    public void execSQL(java.lang.String r2) throws net.sqlcipher.SQLException {
            r1 = this;
            android.os.SystemClock.uptimeMillis()
            r1.lock()
            boolean r0 = r1.isOpen()     // Catch: java.lang.Throwable -> L13 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L15
            if (r0 == 0) goto L17
            r1.native_execSQL(r2)     // Catch: java.lang.Throwable -> L13 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L15
            r1.unlock()
            return
        L13:
            r2 = move-exception
            goto L23
        L15:
            r2 = move-exception
            goto L1f
        L17:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L13 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L15
            java.lang.String r0 = "database not open"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L13 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L15
            throw r2     // Catch: java.lang.Throwable -> L13 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L15
        L1f:
            r1.onCorruption()     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L13
        L23:
            r1.unlock()
            throw r2
    }

    public void execSQL(java.lang.String r4, java.lang.Object[] r5) throws net.sqlcipher.SQLException {
            r3 = this;
            if (r5 == 0) goto L43
            android.os.SystemClock.uptimeMillis()
            r3.lock()
            r0 = 0
            boolean r1 = r3.isOpen()     // Catch: java.lang.Throwable -> L20 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L22
            if (r1 == 0) goto L2e
            net.sqlcipher.database.SQLiteStatement r0 = r3.m39compileStatement(r4)     // Catch: java.lang.Throwable -> L20 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L22
            int r4 = r5.length     // Catch: java.lang.Throwable -> L20 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L22
            r1 = 0
        L15:
            if (r1 >= r4) goto L24
            int r2 = r1 + 1
            r1 = r5[r1]     // Catch: java.lang.Throwable -> L20 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L22
            net.sqlcipher.DatabaseUtils.bindObjectToProgram(r0, r2, r1)     // Catch: java.lang.Throwable -> L20 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L22
            r1 = r2
            goto L15
        L20:
            r4 = move-exception
            goto L3a
        L22:
            r4 = move-exception
            goto L36
        L24:
            r0.execute()     // Catch: java.lang.Throwable -> L20 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L22
            r0.close()
            r3.unlock()
            return
        L2e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L20 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L22
            java.lang.String r5 = "database not open"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L20 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L22
            throw r4     // Catch: java.lang.Throwable -> L20 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L22
        L36:
            r3.onCorruption()     // Catch: java.lang.Throwable -> L20
            throw r4     // Catch: java.lang.Throwable -> L20
        L3a:
            if (r0 == 0) goto L3f
            r0.close()
        L3f:
            r3.unlock()
            throw r4
        L43:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Empty bindArgs"
            r4.<init>(r5)
            throw r4
    }

    protected void finalize() {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto Lc
            r1.closeClosable()
            r1.onAllReferencesReleased()
        Lc:
            return
    }

    public java.util.List<android.util.Pair<java.lang.String, java.lang.String>> getAttachedDbs() {
            r1 = this;
            java.util.ArrayList r0 = getAttachedDbs(r1)
            return r0
    }

    net.sqlcipher.database.SQLiteCompiledSql getCompiledStatementForSql(java.lang.String r4) {
            r3 = this;
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r3.mCompiledQueries
            monitor-enter(r0)
            int r1 = r3.mMaxSqlCacheSize     // Catch: java.lang.Throwable -> Lc
            if (r1 != 0) goto Le
            boolean r4 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE     // Catch: java.lang.Throwable -> Lc
            r4 = 0
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            return r4
        Lc:
            r4 = move-exception
            goto L2d
        Le:
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r3.mCompiledQueries     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r4 = r1.get(r4)     // Catch: java.lang.Throwable -> Lc
            net.sqlcipher.database.SQLiteCompiledSql r4 = (net.sqlcipher.database.SQLiteCompiledSql) r4     // Catch: java.lang.Throwable -> Lc
            r1 = 1
            if (r4 == 0) goto L1b
            r2 = 1
            goto L1c
        L1b:
            r2 = 0
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            if (r2 == 0) goto L25
            int r0 = r3.mNumCacheHits
            int r0 = r0 + r1
            r3.mNumCacheHits = r0
            goto L2a
        L25:
            int r0 = r3.mNumCacheMisses
            int r0 = r0 + r1
            r3.mNumCacheMisses = r0
        L2a:
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE
            return r4
        L2d:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lc
            throw r4
    }

    public synchronized int getMaxSqlCacheSize() {
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.mMaxSqlCacheSize     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public long getMaximumSize() {
            r7 = this;
            r7.lock()
            r0 = 0
            boolean r1 = r7.isOpen()     // Catch: java.lang.Throwable -> L24
            if (r1 == 0) goto L29
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "PRAGMA max_page_count;"
            r1.<init>(r7, r2)     // Catch: java.lang.Throwable -> L24
            long r2 = r1.simpleQueryForLong()     // Catch: java.lang.Throwable -> L22
            long r4 = r7.getPageSize()     // Catch: java.lang.Throwable -> L22
            long r2 = r2 * r4
            r1.close()
            r7.unlock()
            return r2
        L22:
            r0 = move-exception
            goto L31
        L24:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
            goto L31
        L29:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = "database not open"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L24
            throw r1     // Catch: java.lang.Throwable -> L24
        L31:
            if (r1 == 0) goto L36
            r1.close()
        L36:
            r7.unlock()
            throw r0
    }

    public long getPageSize() {
            r5 = this;
            r5.lock()
            r0 = 0
            boolean r1 = r5.isOpen()     // Catch: java.lang.Throwable -> L1e
            if (r1 == 0) goto L23
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "PRAGMA page_size;"
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L1e
            long r2 = r1.simpleQueryForLong()     // Catch: java.lang.Throwable -> L1c
            r1.close()
            r5.unlock()
            return r2
        L1c:
            r0 = move-exception
            goto L2b
        L1e:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L2b
        L23:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1e
            java.lang.String r2 = "database not open"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1e
            throw r1     // Catch: java.lang.Throwable -> L1e
        L2b:
            if (r1 == 0) goto L30
            r1.close()
        L30:
            r5.unlock()
            throw r0
    }

    public final java.lang.String getPath() {
            r1 = this;
            java.lang.String r0 = r1.mPath
            return r0
    }

    public net.sqlcipher.database.SQLiteQueryStats getQueryStats(java.lang.String r6, java.lang.Object[] r7) {
            r5 = this;
            java.lang.String r0 = "CREATE TABLE tempstat AS %s"
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: net.sqlcipher.database.SQLiteException -> L21
            r2 = 0
            r1[r2] = r6     // Catch: net.sqlcipher.database.SQLiteException -> L21
            java.lang.String r6 = java.lang.String.format(r0, r1)     // Catch: net.sqlcipher.database.SQLiteException -> L21
            r5.execSQL(r6, r7)     // Catch: net.sqlcipher.database.SQLiteException -> L21
            java.lang.String r6 = "SELECT sum(payload) FROM dbstat WHERE name = 'tempstat';"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: net.sqlcipher.database.SQLiteException -> L21
            net.sqlcipher.Cursor r6 = r5.rawQuery(r6, r7)     // Catch: net.sqlcipher.database.SQLiteException -> L21
            r0 = 0
            if (r6 != 0) goto L23
            net.sqlcipher.database.SQLiteQueryStats r6 = new net.sqlcipher.database.SQLiteQueryStats     // Catch: net.sqlcipher.database.SQLiteException -> L21
            r6.<init>(r0, r0)     // Catch: net.sqlcipher.database.SQLiteException -> L21
            return r6
        L21:
            r6 = move-exception
            goto L52
        L23:
            r6.moveToFirst()     // Catch: net.sqlcipher.database.SQLiteException -> L21
            long r3 = r6.getLong(r2)     // Catch: net.sqlcipher.database.SQLiteException -> L21
            r6.close()     // Catch: net.sqlcipher.database.SQLiteException -> L21
            java.lang.String r6 = "SELECT max(mx_payload) FROM dbstat WHERE name = 'tempstat';"
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: net.sqlcipher.database.SQLiteException -> L21
            net.sqlcipher.Cursor r6 = r5.rawQuery(r6, r7)     // Catch: net.sqlcipher.database.SQLiteException -> L21
            if (r6 != 0) goto L3d
            net.sqlcipher.database.SQLiteQueryStats r6 = new net.sqlcipher.database.SQLiteQueryStats     // Catch: net.sqlcipher.database.SQLiteException -> L21
            r6.<init>(r3, r0)     // Catch: net.sqlcipher.database.SQLiteException -> L21
            return r6
        L3d:
            r6.moveToFirst()     // Catch: net.sqlcipher.database.SQLiteException -> L21
            long r0 = r6.getLong(r2)     // Catch: net.sqlcipher.database.SQLiteException -> L21
            r6.close()     // Catch: net.sqlcipher.database.SQLiteException -> L21
            java.lang.String r6 = "DROP TABLE tempstat;"
            r5.execSQL(r6)     // Catch: net.sqlcipher.database.SQLiteException -> L21
            net.sqlcipher.database.SQLiteQueryStats r6 = new net.sqlcipher.database.SQLiteQueryStats
            r6.<init>(r3, r0)
            return r6
        L52:
            java.lang.String r7 = "DROP TABLE IF EXISTS tempstat;"
            r5.execSQL(r7)
            throw r6
    }

    public java.util.Map<java.lang.String, java.lang.String> getSyncedTables() {
            r5 = this;
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteDatabase$SyncUpdateInfo> r0 = r5.mSyncUpdateInfo
            monitor-enter(r0)
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteDatabase$SyncUpdateInfo> r2 = r5.mSyncUpdateInfo     // Catch: java.lang.Throwable -> L2e
            java.util.Set r2 = r2.keySet()     // Catch: java.lang.Throwable -> L2e
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L2e
        L12:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L2e
            if (r3 == 0) goto L30
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L2e
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteDatabase$SyncUpdateInfo> r4 = r5.mSyncUpdateInfo     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r4.get(r3)     // Catch: java.lang.Throwable -> L2e
            net.sqlcipher.database.SQLiteDatabase$SyncUpdateInfo r4 = (net.sqlcipher.database.SQLiteDatabase.SyncUpdateInfo) r4     // Catch: java.lang.Throwable -> L2e
            java.lang.String r4 = r4.deletedTable     // Catch: java.lang.Throwable -> L2e
            if (r4 == 0) goto L12
            r1.put(r3, r4)     // Catch: java.lang.Throwable -> L2e
            goto L12
        L2e:
            r1 = move-exception
            goto L32
        L30:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            return r1
        L32:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2e
            throw r1
    }

    public int getVersion() {
            r5 = this;
            r5.lock()
            r0 = 0
            boolean r1 = r5.isOpen()     // Catch: java.lang.Throwable -> L1f
            if (r1 == 0) goto L24
            net.sqlcipher.database.SQLiteStatement r1 = new net.sqlcipher.database.SQLiteStatement     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "PRAGMA user_version;"
            r1.<init>(r5, r2)     // Catch: java.lang.Throwable -> L1f
            long r2 = r1.simpleQueryForLong()     // Catch: java.lang.Throwable -> L1d
            int r0 = (int) r2
            r1.close()
            r5.unlock()
            return r0
        L1d:
            r0 = move-exception
            goto L2c
        L1f:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L2c
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1f
            java.lang.String r2 = "database not open"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L1f
            throw r1     // Catch: java.lang.Throwable -> L1f
        L2c:
            if (r1 == 0) goto L31
            r1.close()
        L31:
            r5.unlock()
            throw r0
    }

    public boolean inTransaction() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.mLock
            int r0 = r0.getHoldCount()
            if (r0 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public long insert(java.lang.String r2, int r3, android.content.ContentValues r4) throws android.database.SQLException {
            r1 = this;
            r0 = 0
            long r2 = r1.insertWithOnConflict(r2, r0, r4, r3)
            return r2
    }

    public long insert(java.lang.String r2, java.lang.String r3, android.content.ContentValues r4) {
            r1 = this;
            r0 = 0
            long r2 = r1.insertWithOnConflict(r2, r3, r4, r0)     // Catch: net.sqlcipher.SQLException -> L6
            return r2
        L6:
            r2 = -1
            return r2
    }

    public long insertOrThrow(java.lang.String r2, java.lang.String r3, android.content.ContentValues r4) throws net.sqlcipher.SQLException {
            r1 = this;
            r0 = 0
            long r2 = r1.insertWithOnConflict(r2, r3, r4, r0)
            return r2
    }

    public long insertWithOnConflict(java.lang.String r5, java.lang.String r6, android.content.ContentValues r7, int r8) {
            r4 = this;
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto Le5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 152(0x98, float:2.13E-43)
            r0.<init>(r1)
            java.lang.String r1 = "INSERT"
            r0.append(r1)
            java.lang.String[] r1 = net.sqlcipher.database.SQLiteDatabase.CONFLICT_VALUES
            r8 = r1[r8]
            r0.append(r8)
            java.lang.String r8 = " INTO "
            r0.append(r8)
            r0.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r8 = 40
            r5.<init>(r8)
            r1 = 0
            r2 = 0
            if (r7 == 0) goto L6a
            int r3 = r7.size()
            if (r3 <= 0) goto L6a
            java.util.Set r6 = r7.valueSet()
            java.util.Iterator r7 = r6.iterator()
            r0.append(r8)
            r8 = 0
        L3e:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L64
            if (r8 == 0) goto L4e
            java.lang.String r8 = ", "
            r0.append(r8)
            r5.append(r8)
        L4e:
            java.lang.Object r8 = r7.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r0.append(r8)
            r8 = 63
            r5.append(r8)
            r8 = 1
            goto L3e
        L64:
            r7 = 41
            r0.append(r7)
            goto L89
        L6a:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "("
            r7.append(r8)
            r7.append(r6)
            java.lang.String r6 = ") "
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r0.append(r6)
            java.lang.String r6 = "NULL"
            r5.append(r6)
            r6 = r2
        L89:
            java.lang.String r7 = " VALUES("
            r0.append(r7)
            r0.append(r5)
            java.lang.String r5 = ");"
            r0.append(r5)
            r4.lock()
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Throwable -> Lbd net.sqlcipher.database.SQLiteDatabaseCorruptException -> Lbf
            net.sqlcipher.database.SQLiteStatement r2 = r4.m39compileStatement(r5)     // Catch: java.lang.Throwable -> Lbd net.sqlcipher.database.SQLiteDatabaseCorruptException -> Lbf
            if (r6 == 0) goto Lc1
            int r5 = r6.size()     // Catch: java.lang.Throwable -> Lbd net.sqlcipher.database.SQLiteDatabaseCorruptException -> Lbf
            java.util.Iterator r6 = r6.iterator()     // Catch: java.lang.Throwable -> Lbd net.sqlcipher.database.SQLiteDatabaseCorruptException -> Lbf
        Lab:
            if (r1 >= r5) goto Lc1
            java.lang.Object r7 = r6.next()     // Catch: java.lang.Throwable -> Lbd net.sqlcipher.database.SQLiteDatabaseCorruptException -> Lbf
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> Lbd net.sqlcipher.database.SQLiteDatabaseCorruptException -> Lbf
            int r1 = r1 + 1
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> Lbd net.sqlcipher.database.SQLiteDatabaseCorruptException -> Lbf
            net.sqlcipher.DatabaseUtils.bindObjectToProgram(r2, r1, r7)     // Catch: java.lang.Throwable -> Lbd net.sqlcipher.database.SQLiteDatabaseCorruptException -> Lbf
            goto Lab
        Lbd:
            r5 = move-exception
            goto Ldc
        Lbf:
            r5 = move-exception
            goto Ld8
        Lc1:
            r2.execute()     // Catch: java.lang.Throwable -> Lbd net.sqlcipher.database.SQLiteDatabaseCorruptException -> Lbf
            int r5 = r4.lastChangeCount()     // Catch: java.lang.Throwable -> Lbd net.sqlcipher.database.SQLiteDatabaseCorruptException -> Lbf
            if (r5 <= 0) goto Lcf
            long r5 = r4.lastInsertRow()     // Catch: java.lang.Throwable -> Lbd net.sqlcipher.database.SQLiteDatabaseCorruptException -> Lbf
            goto Ld1
        Lcf:
            r5 = -1
        Ld1:
            r2.close()
            r4.unlock()
            return r5
        Ld8:
            r4.onCorruption()     // Catch: java.lang.Throwable -> Lbd
            throw r5     // Catch: java.lang.Throwable -> Lbd
        Ldc:
            if (r2 == 0) goto Le1
            r2.close()
        Le1:
            r4.unlock()
            throw r5
        Le5:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "database not open"
            r5.<init>(r6)
            throw r5
    }

    public boolean isDatabaseIntegrityOk() {
            r2 = this;
            java.lang.String r0 = "PRAGMA integrity_check;"
            android.util.Pair r0 = r2.getResultFromPragma(r0)
            java.lang.Object r1 = r0.first
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1b
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "ok"
            boolean r0 = r0.equals(r1)
            return r0
        L1b:
            java.lang.Object r0 = r0.first
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    public boolean isDbLockedByCurrentThread() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.mLock
            boolean r0 = r0.isHeldByCurrentThread()
            return r0
    }

    public boolean isDbLockedByOtherThreads() {
            r1 = this;
            java.util.concurrent.locks.ReentrantLock r0 = r1.mLock
            boolean r0 = r0.isHeldByCurrentThread()
            if (r0 != 0) goto L12
            java.util.concurrent.locks.ReentrantLock r0 = r1.mLock
            boolean r0 = r0.isLocked()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public /* synthetic */ boolean isExecPerConnectionSQLSupported() {
            r1 = this;
            boolean r0 = g.a.d(r1)
            return r0
    }

    public boolean isInCompiledSqlCache(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r2.mCompiledQueries
            monitor-enter(r0)
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r2.mCompiledQueries     // Catch: java.lang.Throwable -> Lb
            boolean r3 = r1.containsKey(r3)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            return r3
        Lb:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r3
    }

    public boolean isOpen() {
            r5 = this;
            long r0 = r5.mNativeHandle
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean isReadOnly() {
            r2 = this;
            int r0 = r2.mFlags
            r1 = 1
            r0 = r0 & r1
            if (r0 != r1) goto L7
            return r1
        L7:
            r0 = 0
            return r0
    }

    public boolean isWriteAheadLoggingEnabled() {
            r2 = this;
            java.lang.String r0 = "PRAGMA journal_mode;"
            android.util.Pair r0 = r2.getResultFromPragma(r0)
            java.lang.Object r1 = r0.first
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L1b
            java.lang.Object r0 = r0.second
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "wal"
            boolean r0 = r0.equals(r1)
            return r0
        L1b:
            java.lang.Object r0 = r0.first
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
    }

    native int lastChangeCount();

    native long lastInsertRow();

    void lock() {
            r2 = this;
            boolean r0 = r2.mLockingEnabled
            if (r0 != 0) goto L5
            goto L23
        L5:
            java.util.concurrent.locks.ReentrantLock r0 = r2.mLock
            r0.lock()
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING
            if (r0 == 0) goto L23
            java.util.concurrent.locks.ReentrantLock r0 = r2.mLock
            int r0 = r0.getHoldCount()
            r1 = 1
            if (r0 != r1) goto L23
            long r0 = android.os.SystemClock.elapsedRealtime()
            r2.mLockAcquiredWallTime = r0
            long r0 = android.os.Debug.threadCpuTimeNanos()
            r2.mLockAcquiredThreadTime = r0
        L23:
            return
    }

    public void markTableSyncable(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto Lc
            java.lang.String r0 = "_id"
            r1.markTableSyncable(r2, r0, r2, r3)
            return
        Lc:
            net.sqlcipher.database.SQLiteException r2 = new net.sqlcipher.database.SQLiteException
            java.lang.String r3 = "database not open"
            r2.<init>(r3)
            throw r2
    }

    public void markTableSyncable(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 == 0) goto Lb
            r0 = 0
            r1.markTableSyncable(r2, r3, r4, r0)
            return
        Lb:
            net.sqlcipher.database.SQLiteException r2 = new net.sqlcipher.database.SQLiteException
            java.lang.String r3 = "database not open"
            r2.<init>(r3)
            throw r2
    }

    native void native_execSQL(java.lang.String r1) throws net.sqlcipher.SQLException;

    native void native_setLocale(java.lang.String r1, int r2);

    public boolean needUpgrade(int r2) {
            r1 = this;
            int r0 = r1.getVersion()
            if (r2 <= r0) goto L8
            r2 = 1
            return r2
        L8:
            r2 = 0
            return r2
    }

    @Override // net.sqlcipher.database.SQLiteClosable
    protected void onAllReferencesReleased() {
            r2 = this;
            boolean r0 = r2.isOpen()
            if (r0 == 0) goto L20
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE
            if (r0 == 0) goto L10
            java.lang.String r0 = r2.getTime()
            r2.mTimeClosed = r0
        L10:
            r2.dbclose()
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r0 = net.sqlcipher.database.SQLiteDatabase.sActiveDatabases
            monitor-enter(r0)
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteDatabase, java.lang.Object> r1 = net.sqlcipher.database.SQLiteDatabase.sActiveDatabases     // Catch: java.lang.Throwable -> L1d
            r1.remove(r2)     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            return
        L1d:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1d
            throw r1
        L20:
            return
    }

    void onCorruption() {
            r1 = this;
            net.sqlcipher.DatabaseErrorHandler r0 = r1.mErrorHandler
            r0.onCorruption(r1)
            return
    }

    public void purgeFromCompiledSqlCache(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r2.mCompiledQueries
            monitor-enter(r0)
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r2.mCompiledQueries     // Catch: java.lang.Throwable -> La
            r1.remove(r3)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r3
    }

    public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery r2) {
            r1 = this;
            r0 = 0
            android.database.Cursor r2 = r1.query(r2, r0)
            return r2
    }

    public android.database.Cursor query(androidx.sqlite.db.SupportSQLiteQuery r6, android.os.CancellationSignal r7) {
            r5 = this;
            java.lang.String r7 = r6.getSql()
            int r0 = r6.getArgCount()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            net.sqlcipher.database.SQLiteDirectCursorDriver r1 = new net.sqlcipher.database.SQLiteDirectCursorDriver
            r2 = 0
            r1.<init>(r5, r7, r2)
            net.sqlcipher.database.SQLiteQuery r3 = new net.sqlcipher.database.SQLiteQuery
            r4 = 0
            r3.<init>(r5, r7, r4, r0)
            r6.bindTo(r3)
            net.sqlcipher.CrossProcessCursorWrapper r6 = new net.sqlcipher.CrossProcessCursorWrapper
            net.sqlcipher.database.SQLiteCursor r7 = new net.sqlcipher.database.SQLiteCursor
            r7.<init>(r5, r1, r2, r3)
            r6.<init>(r7)
            return r6
    }

    public android.database.Cursor query(java.lang.String r2) {
            r1 = this;
            r0 = 0
            net.sqlcipher.Cursor r2 = r1.rawQuery(r2, r0)
            return r2
    }

    public android.database.Cursor query(java.lang.String r1, java.lang.Object[] r2) {
            r0 = this;
            net.sqlcipher.Cursor r1 = r0.rawQuery(r1, r2)
            return r1
    }

    public net.sqlcipher.Cursor query(java.lang.String r11, java.lang.String[] r12, java.lang.String r13, java.lang.String[] r14, java.lang.String r15, java.lang.String r16, java.lang.String r17) {
            r10 = this;
            r1 = 0
            r9 = 0
            r0 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            net.sqlcipher.Cursor r11 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.sqlcipher.Cursor query(java.lang.String r11, java.lang.String[] r12, java.lang.String r13, java.lang.String[] r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18) {
            r10 = this;
            r1 = 0
            r0 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r6 = r15
            r7 = r16
            r8 = r17
            r9 = r18
            net.sqlcipher.Cursor r11 = r0.query(r1, r2, r3, r4, r5, r6, r7, r8, r9)
            return r11
    }

    public net.sqlcipher.Cursor query(boolean r12, java.lang.String r13, java.lang.String[] r14, java.lang.String r15, java.lang.String[] r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20) {
            r11 = this;
            r1 = 0
            r0 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r6 = r16
            r7 = r17
            r8 = r18
            r9 = r19
            r10 = r20
            net.sqlcipher.Cursor r12 = r0.queryWithFactory(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            return r12
    }

    public net.sqlcipher.Cursor queryWithFactory(net.sqlcipher.database.SQLiteDatabase.CursorFactory r10, boolean r11, java.lang.String r12, java.lang.String[] r13, java.lang.String r14, java.lang.String[] r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19) {
            r9 = this;
            boolean r0 = r9.isOpen()
            if (r0 == 0) goto L1f
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r16
            r6 = r17
            r7 = r18
            r8 = r19
            java.lang.String r11 = net.sqlcipher.database.SQLiteQueryBuilder.buildQueryString(r1, r2, r3, r4, r5, r6, r7, r8)
            java.lang.String r12 = findEditTable(r12)
            net.sqlcipher.Cursor r10 = r9.rawQueryWithFactory(r10, r11, r15, r12)
            return r10
        L1f:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "database not open"
            r10.<init>(r11)
            throw r10
    }

    public void rawExecSQL(java.lang.String r2) {
            r1 = this;
            android.os.SystemClock.uptimeMillis()
            r1.lock()
            boolean r0 = r1.isOpen()     // Catch: java.lang.Throwable -> L13 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L15
            if (r0 == 0) goto L17
            r1.native_rawExecSQL(r2)     // Catch: java.lang.Throwable -> L13 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L15
            r1.unlock()
            return
        L13:
            r2 = move-exception
            goto L23
        L15:
            r2 = move-exception
            goto L1f
        L17:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L13 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L15
            java.lang.String r0 = "database not open"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L13 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L15
            throw r2     // Catch: java.lang.Throwable -> L13 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L15
        L1f:
            r1.onCorruption()     // Catch: java.lang.Throwable -> L13
            throw r2     // Catch: java.lang.Throwable -> L13
        L23:
            r1.unlock()
            throw r2
    }

    public net.sqlcipher.Cursor rawQuery(java.lang.String r7, java.lang.Object[] r8) {
            r6 = this;
            boolean r0 = r6.isOpen()
            if (r0 == 0) goto L51
            int r0 = r6.mSlowQueryThreshold
            r1 = -1
            if (r0 == r1) goto L10
            long r2 = java.lang.System.currentTimeMillis()
            goto L12
        L10:
            r2 = 0
        L12:
            net.sqlcipher.database.SQLiteDirectCursorDriver r0 = new net.sqlcipher.database.SQLiteDirectCursorDriver
            r4 = 0
            r0.<init>(r6, r7, r4)
            net.sqlcipher.database.SQLiteDatabase$CursorFactory r7 = r6.mFactory     // Catch: java.lang.Throwable -> L3c
            net.sqlcipher.Cursor r7 = r0.query(r7, r8)     // Catch: java.lang.Throwable -> L3c
            int r8 = r6.mSlowQueryThreshold
            if (r8 == r1) goto L36
            if (r7 == 0) goto L27
            r7.getCount()
        L27:
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            int r8 = r6.mSlowQueryThreshold
            long r1 = (long) r8
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 < 0) goto L36
            r0.toString()
        L36:
            net.sqlcipher.CrossProcessCursorWrapper r8 = new net.sqlcipher.CrossProcessCursorWrapper
            r8.<init>(r7)
            return r8
        L3c:
            r7 = move-exception
            int r8 = r6.mSlowQueryThreshold
            if (r8 == r1) goto L50
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r2
            int r8 = r6.mSlowQueryThreshold
            long r1 = (long) r8
            int r8 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r8 < 0) goto L50
            r0.toString()
        L50:
            throw r7
        L51:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "database not open"
            r7.<init>(r8)
            throw r7
    }

    public net.sqlcipher.Cursor rawQuery(java.lang.String r2, java.lang.String[] r3) {
            r1 = this;
            r0 = 0
            net.sqlcipher.Cursor r2 = r1.rawQueryWithFactory(r0, r2, r3, r0)
            return r2
    }

    public net.sqlcipher.Cursor rawQuery(java.lang.String r2, java.lang.String[] r3, int r4, int r5) {
            r1 = this;
            r0 = 0
            net.sqlcipher.Cursor r2 = r1.rawQueryWithFactory(r0, r2, r3, r0)
            net.sqlcipher.CursorWrapper r2 = (net.sqlcipher.CursorWrapper) r2
            net.sqlcipher.Cursor r3 = r2.getWrappedCursor()
            net.sqlcipher.database.SQLiteCursor r3 = (net.sqlcipher.database.SQLiteCursor) r3
            r3.setLoadStyle(r4, r5)
            return r2
    }

    public net.sqlcipher.Cursor rawQueryWithFactory(net.sqlcipher.database.SQLiteDatabase.CursorFactory r5, java.lang.String r6, java.lang.String[] r7, java.lang.String r8) {
            r4 = this;
            boolean r0 = r4.isOpen()
            if (r0 == 0) goto L53
            int r0 = r4.mSlowQueryThreshold
            r1 = -1
            if (r0 == r1) goto L10
            long r2 = java.lang.System.currentTimeMillis()
            goto L12
        L10:
            r2 = 0
        L12:
            net.sqlcipher.database.SQLiteDirectCursorDriver r0 = new net.sqlcipher.database.SQLiteDirectCursorDriver
            r0.<init>(r4, r6, r8)
            if (r5 == 0) goto L1a
            goto L1c
        L1a:
            net.sqlcipher.database.SQLiteDatabase$CursorFactory r5 = r4.mFactory     // Catch: java.lang.Throwable -> L3e
        L1c:
            net.sqlcipher.Cursor r5 = r0.query(r5, r7)     // Catch: java.lang.Throwable -> L3e
            int r6 = r4.mSlowQueryThreshold
            if (r6 == r1) goto L38
            if (r5 == 0) goto L29
            r5.getCount()
        L29:
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r2
            int r8 = r4.mSlowQueryThreshold
            long r1 = (long) r8
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 < 0) goto L38
            r0.toString()
        L38:
            net.sqlcipher.CrossProcessCursorWrapper r6 = new net.sqlcipher.CrossProcessCursorWrapper
            r6.<init>(r5)
            return r6
        L3e:
            r5 = move-exception
            int r6 = r4.mSlowQueryThreshold
            if (r6 == r1) goto L52
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r2
            int r8 = r4.mSlowQueryThreshold
            long r1 = (long) r8
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 < 0) goto L52
            r0.toString()
        L52:
            throw r5
        L53:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "database not open"
            r5.<init>(r6)
            throw r5
    }

    void removeSQLiteClosable(net.sqlcipher.database.SQLiteClosable r2) {
            r1 = this;
            r1.lock()
            java.util.WeakHashMap<net.sqlcipher.database.SQLiteClosable, java.lang.Object> r0 = r1.mPrograms     // Catch: java.lang.Throwable -> Lc
            r0.remove(r2)     // Catch: java.lang.Throwable -> Lc
            r1.unlock()
            return
        Lc:
            r2 = move-exception
            r1.unlock()
            throw r2
    }

    public long replace(java.lang.String r2, java.lang.String r3, android.content.ContentValues r4) {
            r1 = this;
            r0 = 5
            long r2 = r1.insertWithOnConflict(r2, r3, r4, r0)     // Catch: net.sqlcipher.SQLException -> L6
            return r2
        L6:
            r2 = -1
            return r2
    }

    public long replaceOrThrow(java.lang.String r2, java.lang.String r3, android.content.ContentValues r4) throws net.sqlcipher.SQLException {
            r1 = this;
            r0 = 5
            long r2 = r1.insertWithOnConflict(r2, r3, r4, r0)
            return r2
    }

    public void resetCompiledSqlCache() {
            r2 = this;
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r0 = r2.mCompiledQueries
            monitor-enter(r0)
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteCompiledSql> r1 = r2.mCompiledQueries     // Catch: java.lang.Throwable -> La
            r1.clear()     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    void rowUpdated(java.lang.String r4, long r5) {
            r3 = this;
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteDatabase$SyncUpdateInfo> r0 = r3.mSyncUpdateInfo
            monitor-enter(r0)
            java.util.Map<java.lang.String, net.sqlcipher.database.SQLiteDatabase$SyncUpdateInfo> r1 = r3.mSyncUpdateInfo     // Catch: java.lang.Throwable -> L44
            java.lang.Object r1 = r1.get(r4)     // Catch: java.lang.Throwable -> L44
            net.sqlcipher.database.SQLiteDatabase$SyncUpdateInfo r1 = (net.sqlcipher.database.SQLiteDatabase.SyncUpdateInfo) r1     // Catch: java.lang.Throwable -> L44
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L43
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "UPDATE "
            r0.append(r2)
            java.lang.String r2 = r1.masterTable
            r0.append(r2)
            java.lang.String r2 = " SET _sync_dirty=1 WHERE _id=(SELECT "
            r0.append(r2)
            java.lang.String r1 = r1.foreignKey
            r0.append(r1)
            java.lang.String r1 = " FROM "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " WHERE _id="
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = ")"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.execSQL(r4)
        L43:
            return
        L44:
            r4 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L44
            throw r4
    }

    public void setForeignKeyConstraintsEnabled(boolean r3) {
            r2 = this;
            boolean r0 = r2.inTransaction()
            if (r0 != 0) goto L1d
            if (r3 == 0) goto Lb
            java.lang.String r3 = "ON"
            goto Ld
        Lb:
            java.lang.String r3 = "OFF"
        Ld:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r3 = "PRAGMA foreign_keys = %s;"
            java.lang.String r3 = java.lang.String.format(r3, r0)
            r2.execSQL(r3)
            return
        L1d:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Foreign key constraints may not be changed while in a transaction"
            r3.<init>(r0)
            throw r3
    }

    public void setLocale(java.util.Locale r2) {
            r1 = this;
            r1.lock()
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L10
            int r0 = r1.mFlags     // Catch: java.lang.Throwable -> L10
            r1.native_setLocale(r2, r0)     // Catch: java.lang.Throwable -> L10
            r1.unlock()
            return
        L10:
            r2 = move-exception
            r1.unlock()
            throw r2
    }

    public void setLockingEnabled(boolean r1) {
            r0 = this;
            r0.mLockingEnabled = r1
            return
    }

    public synchronized void setMaxSqlCacheSize(int r2) {
            r1 = this;
            monitor-enter(r1)
            r0 = 250(0xfa, float:3.5E-43)
            if (r2 > r0) goto L19
            if (r2 < 0) goto L19
            int r0 = r1.mMaxSqlCacheSize     // Catch: java.lang.Throwable -> Lf
            if (r2 < r0) goto L11
            r1.mMaxSqlCacheSize = r2     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r1)
            return
        Lf:
            r2 = move-exception
            goto L21
        L11:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = "cannot set cacheSize to a value less than the value set with previous setMaxSqlCacheSize() call."
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> Lf
        L19:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = "expected value between 0 and 250"
            r2.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            throw r2     // Catch: java.lang.Throwable -> Lf
        L21:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r2
    }

    public long setMaximumSize(long r9) {
            r8 = this;
            r8.lock()
            r0 = 0
            boolean r1 = r8.isOpen()     // Catch: java.lang.Throwable -> L40
            if (r1 == 0) goto L42
            long r1 = r8.getPageSize()     // Catch: java.lang.Throwable -> L40
            long r3 = r9 / r1
            long r9 = r9 % r1
            r5 = 0
            int r7 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r7 == 0) goto L1a
            r9 = 1
            long r3 = r3 + r9
        L1a:
            net.sqlcipher.database.SQLiteStatement r9 = new net.sqlcipher.database.SQLiteStatement     // Catch: java.lang.Throwable -> L40
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L40
            r10.<init>()     // Catch: java.lang.Throwable -> L40
            java.lang.String r5 = "PRAGMA max_page_count = "
            r10.append(r5)     // Catch: java.lang.Throwable -> L40
            r10.append(r3)     // Catch: java.lang.Throwable -> L40
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L40
            r9.<init>(r8, r10)     // Catch: java.lang.Throwable -> L40
            long r3 = r9.simpleQueryForLong()     // Catch: java.lang.Throwable -> L3d
            long r3 = r3 * r1
            r9.close()
            r8.unlock()
            return r3
        L3d:
            r10 = move-exception
            r0 = r9
            goto L4a
        L40:
            r10 = move-exception
            goto L4a
        L42:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L40
            java.lang.String r10 = "database not open"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L40
            throw r9     // Catch: java.lang.Throwable -> L40
        L4a:
            if (r0 == 0) goto L4f
            r0.close()
        L4f:
            r8.unlock()
            throw r10
    }

    public void setPageSize(long r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA page_size = "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.execSQL(r3)
            return
    }

    public void setTransactionSuccessful() {
            r2 = this;
            boolean r0 = r2.isOpen()
            if (r0 == 0) goto L26
            java.util.concurrent.locks.ReentrantLock r0 = r2.mLock
            boolean r0 = r0.isHeldByCurrentThread()
            if (r0 == 0) goto L1e
            boolean r0 = r2.mInnerTransactionIsSuccessful
            if (r0 != 0) goto L16
            r0 = 1
            r2.mInnerTransactionIsSuccessful = r0
            return
        L16:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "setTransactionSuccessful may only be called once per call to beginTransaction"
            r0.<init>(r1)
            throw r0
        L1e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "no transaction pending"
            r0.<init>(r1)
            throw r0
        L26:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "database not open"
            r0.<init>(r1)
            throw r0
    }

    public void setVersion(int r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "PRAGMA user_version = "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.execSQL(r3)
            return
    }

    public int status(int r1, boolean r2) {
            r0 = this;
            int r1 = r0.native_status(r1, r2)
            return r1
    }

    void unlock() {
            r2 = this;
            boolean r0 = r2.mLockingEnabled
            if (r0 != 0) goto L5
            return
        L5:
            boolean r0 = net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING
            if (r0 == 0) goto L15
            java.util.concurrent.locks.ReentrantLock r0 = r2.mLock
            int r0 = r0.getHoldCount()
            r1 = 1
            if (r0 != r1) goto L15
            r2.checkLockHoldTime()
        L15:
            java.util.concurrent.locks.ReentrantLock r0 = r2.mLock
            r0.unlock()
            return
    }

    public int update(java.lang.String r8, int r9, android.content.ContentValues r10, java.lang.String r11, java.lang.Object[] r12) {
            r7 = this;
            int r0 = r12.length
            java.lang.String[] r5 = new java.lang.String[r0]
            r0 = 0
        L4:
            int r1 = r12.length
            if (r0 >= r1) goto L12
            r1 = r12[r0]
            java.lang.String r1 = r1.toString()
            r5[r0] = r1
            int r0 = r0 + 1
            goto L4
        L12:
            r1 = r7
            r2 = r8
            r6 = r9
            r3 = r10
            r4 = r11
            int r8 = r1.updateWithOnConflict(r2, r3, r4, r5, r6)
            return r8
    }

    public int update(java.lang.String r7, android.content.ContentValues r8, java.lang.String r9, java.lang.String[] r10) {
            r6 = this;
            r5 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            int r7 = r0.updateWithOnConflict(r1, r2, r3, r4, r5)
            return r7
    }

    public int updateWithOnConflict(java.lang.String r4, android.content.ContentValues r5, java.lang.String r6, java.lang.String[] r7, int r8) {
            r3 = this;
            if (r5 == 0) goto Lc9
            int r0 = r5.size()
            if (r0 == 0) goto Lc9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 120(0x78, float:1.68E-43)
            r0.<init>(r1)
            java.lang.String r1 = "UPDATE "
            r0.append(r1)
            java.lang.String[] r1 = net.sqlcipher.database.SQLiteDatabase.CONFLICT_VALUES
            r8 = r1[r8]
            r0.append(r8)
            r0.append(r4)
            java.lang.String r4 = " SET "
            r0.append(r4)
            java.util.Set r4 = r5.valueSet()
            java.util.Iterator r5 = r4.iterator()
        L2b:
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L51
            java.lang.Object r8 = r5.next()
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8
            java.lang.Object r8 = r8.getKey()
            java.lang.String r8 = (java.lang.String) r8
            r0.append(r8)
            java.lang.String r8 = "=?"
            r0.append(r8)
            boolean r8 = r5.hasNext()
            if (r8 == 0) goto L2b
            java.lang.String r8 = ", "
            r0.append(r8)
            goto L2b
        L51:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 != 0) goto L5f
            java.lang.String r5 = " WHERE "
            r0.append(r5)
            r0.append(r6)
        L5f:
            r3.lock()
            r5 = 0
            boolean r6 = r3.isOpen()     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            if (r6 == 0) goto Lb3
            java.lang.String r6 = r0.toString()     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            net.sqlcipher.database.SQLiteStatement r5 = r3.m39compileStatement(r6)     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            int r6 = r4.size()     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            r8 = 0
            r0 = 1
            r1 = 0
        L7c:
            if (r1 >= r6) goto L96
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            net.sqlcipher.DatabaseUtils.bindObjectToProgram(r5, r0, r2)     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            int r0 = r0 + 1
            int r1 = r1 + 1
            goto L7c
        L90:
            r4 = move-exception
            goto Lc0
        L92:
            r4 = move-exception
            goto Lbb
        L94:
            r4 = move-exception
            goto Lbc
        L96:
            if (r7 == 0) goto La5
            int r4 = r7.length     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
        L99:
            if (r8 >= r4) goto La5
            r6 = r7[r8]     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            r5.bindString(r0, r6)     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            int r0 = r0 + 1
            int r8 = r8 + 1
            goto L99
        La5:
            r5.execute()     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            int r4 = r3.lastChangeCount()     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            r5.close()
            r3.unlock()
            return r4
        Lb3:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            java.lang.String r6 = "database not open"
            r4.<init>(r6)     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
            throw r4     // Catch: java.lang.Throwable -> L90 net.sqlcipher.SQLException -> L92 net.sqlcipher.database.SQLiteDatabaseCorruptException -> L94
        Lbb:
            throw r4     // Catch: java.lang.Throwable -> L90
        Lbc:
            r3.onCorruption()     // Catch: java.lang.Throwable -> L90
            throw r4     // Catch: java.lang.Throwable -> L90
        Lc0:
            if (r5 == 0) goto Lc5
            r5.close()
        Lc5:
            r3.unlock()
            throw r4
        Lc9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Empty values"
            r4.<init>(r5)
            throw r4
    }

    @java.lang.Deprecated
    public boolean yieldIfContended() {
            r4 = this;
            boolean r0 = r4.isOpen()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            r2 = -1
            boolean r0 = r4.yieldIfContendedHelper(r1, r2)
            return r0
    }

    public boolean yieldIfContendedSafely() {
            r3 = this;
            boolean r0 = r3.isOpen()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r0 = 1
            r1 = -1
            boolean r0 = r3.yieldIfContendedHelper(r0, r1)
            return r0
    }

    public boolean yieldIfContendedSafely(long r2) {
            r1 = this;
            boolean r0 = r1.isOpen()
            if (r0 != 0) goto L8
            r2 = 0
            return r2
        L8:
            r0 = 1
            boolean r2 = r1.yieldIfContendedHelper(r0, r2)
            return r2
    }
}

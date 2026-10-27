package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class SQLiteDebug {
    public static final boolean DEBUG_ACTIVE_CURSOR_FINALIZATION = false;
    public static final boolean DEBUG_LOCK_TIME_TRACKING = false;
    public static final boolean DEBUG_LOCK_TIME_TRACKING_STACK_TRACE = false;
    public static final boolean DEBUG_SQL_CACHE = false;
    public static final boolean DEBUG_SQL_STATEMENTS = false;
    public static final boolean DEBUG_SQL_TIME = false;
    private static int sNumActiveCursorsFinalized;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class DbStats {
        public java.lang.String dbName;
        public long dbSize;
        public int lookaside;
        public long pageSize;

        public DbStats(java.lang.String r1, long r2, long r4, int r6) {
                r0 = this;
                r0.<init>()
                r0.dbName = r1
                r0.pageSize = r4
                long r2 = r2 * r4
                r4 = 1024(0x400, double:5.06E-321)
                long r2 = r2 / r4
                r0.dbSize = r2
                r0.lookaside = r6
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class PagerStats {

        @java.lang.Deprecated
        public long databaseBytes;
        public java.util.ArrayList<net.sqlcipher.database.SQLiteDebug.DbStats> dbStats;
        public int largestMemAlloc;
        public int memoryUsed;

        @java.lang.Deprecated
        public int numPagers;
        public int pageCacheOverflo;

        @java.lang.Deprecated
        public long referencedBytes;

        @java.lang.Deprecated
        public long totalBytes;

        public PagerStats() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "SQLiteStatements"
            r1 = 2
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_STATEMENTS = r0
            java.lang.String r0 = "SQLiteTime"
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_TIME = r0
            java.lang.String r0 = "SQLiteCompiledSql"
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            net.sqlcipher.database.SQLiteDebug.DEBUG_SQL_CACHE = r0
            java.lang.String r0 = "SQLiteCursorClosing"
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            net.sqlcipher.database.SQLiteDebug.DEBUG_ACTIVE_CURSOR_FINALIZATION = r0
            java.lang.String r0 = "SQLiteLockTime"
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING = r0
            java.lang.String r0 = "SQLiteLockStackTrace"
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            net.sqlcipher.database.SQLiteDebug.DEBUG_LOCK_TIME_TRACKING_STACK_TRACE = r0
            r0 = 0
            net.sqlcipher.database.SQLiteDebug.sNumActiveCursorsFinalized = r0
            return
    }

    public SQLiteDebug() {
            r0 = this;
            r0.<init>()
            return
    }

    public static net.sqlcipher.database.SQLiteDebug.PagerStats getDatabaseInfo() {
            net.sqlcipher.database.SQLiteDebug$PagerStats r0 = new net.sqlcipher.database.SQLiteDebug$PagerStats
            r0.<init>()
            getPagerStats(r0)
            java.util.ArrayList r1 = net.sqlcipher.database.SQLiteDatabase.getDbStats()
            r0.dbStats = r1
            return r0
    }

    public static native long getHeapAllocatedSize();

    public static native void getHeapDirtyPages(int[] r0);

    public static native long getHeapFreeSize();

    public static native long getHeapSize();

    public static int getNumActiveCursorsFinalized() {
            int r0 = net.sqlcipher.database.SQLiteDebug.sNumActiveCursorsFinalized
            return r0
    }

    public static native void getPagerStats(net.sqlcipher.database.SQLiteDebug.PagerStats r0);

    static synchronized void notifyActiveCursorFinalized() {
            java.lang.Class<net.sqlcipher.database.SQLiteDebug> r0 = net.sqlcipher.database.SQLiteDebug.class
            monitor-enter(r0)
            int r1 = net.sqlcipher.database.SQLiteDebug.sNumActiveCursorsFinalized     // Catch: java.lang.Throwable -> Lb
            int r1 = r1 + 1
            net.sqlcipher.database.SQLiteDebug.sNumActiveCursorsFinalized = r1     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r0)
            return
        Lb:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb
            throw r1
    }
}

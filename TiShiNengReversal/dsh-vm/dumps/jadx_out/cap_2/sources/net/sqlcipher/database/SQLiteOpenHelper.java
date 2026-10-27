package net.sqlcipher.database;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class SQLiteOpenHelper {
    private static final java.lang.String TAG = "SQLiteOpenHelper";
    private final android.content.Context mContext;
    private net.sqlcipher.database.SQLiteDatabase mDatabase;
    private boolean mDeferSetWriteAheadLoggingEnabled;
    private boolean mEnableWriteAheadLogging;
    private final net.sqlcipher.DatabaseErrorHandler mErrorHandler;
    private final net.sqlcipher.database.SQLiteDatabase.CursorFactory mFactory;
    private final net.sqlcipher.database.SQLiteDatabaseHook mHook;
    private boolean mIsInitializing;
    private final java.lang.String mName;
    private final int mNewVersion;

    static {
            return
    }

    public SQLiteOpenHelper(android.content.Context r8, java.lang.String r9, net.sqlcipher.database.SQLiteDatabase.CursorFactory r10, int r11) {
            r7 = this;
            net.sqlcipher.DefaultDatabaseErrorHandler r6 = new net.sqlcipher.DefaultDatabaseErrorHandler
            r6.<init>()
            r5 = 0
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public SQLiteOpenHelper(android.content.Context r8, java.lang.String r9, net.sqlcipher.database.SQLiteDatabase.CursorFactory r10, int r11, net.sqlcipher.database.SQLiteDatabaseHook r12) {
            r7 = this;
            net.sqlcipher.DefaultDatabaseErrorHandler r6 = new net.sqlcipher.DefaultDatabaseErrorHandler
            r6.<init>()
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public SQLiteOpenHelper(android.content.Context r2, java.lang.String r3, net.sqlcipher.database.SQLiteDatabase.CursorFactory r4, int r5, net.sqlcipher.database.SQLiteDatabaseHook r6, net.sqlcipher.DatabaseErrorHandler r7) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mDatabase = r0
            r0 = 0
            r1.mIsInitializing = r0
            r0 = 1
            if (r5 < r0) goto L23
            if (r7 == 0) goto L1b
            r1.mContext = r2
            r1.mName = r3
            r1.mFactory = r4
            r1.mNewVersion = r5
            r1.mHook = r6
            r1.mErrorHandler = r7
            return
        L1b:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r3 = "DatabaseErrorHandler param value can't be null."
            r2.<init>(r3)
            throw r2
        L23:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Version must be >= 1, was "
            r3.append(r4)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
    }

    public synchronized void close() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.mIsInitializing     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L1c
            net.sqlcipher.database.SQLiteDatabase r0 = r2.mDatabase     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1a
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L18
            if (r0 == 0) goto L1a
            net.sqlcipher.database.SQLiteDatabase r0 = r2.mDatabase     // Catch: java.lang.Throwable -> L18
            r0.close()     // Catch: java.lang.Throwable -> L18
            r0 = 0
            r2.mDatabase = r0     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r0 = move-exception
            goto L24
        L1a:
            monitor-exit(r2)
            return
        L1c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L18
            java.lang.String r1 = "Closed during initialization"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L18
            throw r0     // Catch: java.lang.Throwable -> L18
        L24:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r0
    }

    public java.lang.String getDatabaseName() {
            r1 = this;
            java.lang.String r0 = r1.mName
            return r0
    }

    public synchronized net.sqlcipher.database.SQLiteDatabase getReadableDatabase(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            if (r1 != 0) goto L5
            r1 = 0
            goto L9
        L5:
            char[] r1 = r1.toCharArray()     // Catch: java.lang.Throwable -> Lf
        L9:
            net.sqlcipher.database.SQLiteDatabase r1 = r0.getReadableDatabase(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public synchronized net.sqlcipher.database.SQLiteDatabase getReadableDatabase(byte[] r11) {
            r10 = this;
            monitor-enter(r10)
            net.sqlcipher.database.SQLiteDatabase r0 = r10.mDatabase     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L13
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L13
            net.sqlcipher.database.SQLiteDatabase r11 = r10.mDatabase     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r10)
            return r11
        Lf:
            r0 = move-exception
            r11 = r0
            goto Lc6
        L13:
            boolean r0 = r10.mIsInitializing     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto Lbe
            net.sqlcipher.database.SQLiteDatabase r11 = r10.getWritableDatabase(r11)     // Catch: java.lang.Throwable -> Lf net.sqlcipher.database.SQLiteException -> L1d
            monitor-exit(r10)
            return r11
        L1d:
            r0 = move-exception
            java.lang.String r1 = r10.mName     // Catch: java.lang.Throwable -> Lf
            if (r1 == 0) goto Lbd
            r0 = 1
            r1 = 0
            r2 = 0
            r10.mIsInitializing = r0     // Catch: java.lang.Throwable -> L53
            android.content.Context r3 = r10.mContext     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = r10.mName     // Catch: java.lang.Throwable -> L53
            java.io.File r3 = r3.getDatabasePath(r4)     // Catch: java.lang.Throwable -> L53
            java.lang.String r4 = r3.getPath()     // Catch: java.lang.Throwable -> L53
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L53
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L53
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> L53
            android.content.Context r6 = r10.mContext     // Catch: java.lang.Throwable -> L53
            java.lang.String r7 = r10.mName     // Catch: java.lang.Throwable -> L53
            java.io.File r6 = r6.getDatabasePath(r7)     // Catch: java.lang.Throwable -> L53
            java.lang.String r6 = r6.getParent()     // Catch: java.lang.Throwable -> L53
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L53
            boolean r6 = r5.exists()     // Catch: java.lang.Throwable -> L53
            if (r6 != 0) goto L56
            r5.mkdirs()     // Catch: java.lang.Throwable -> L53
            goto L56
        L53:
            r0 = move-exception
            r11 = r0
            goto Lb1
        L56:
            boolean r3 = r3.exists()     // Catch: java.lang.Throwable -> L53
            if (r3 != 0) goto L67
            r10.mIsInitializing = r1     // Catch: java.lang.Throwable -> L53
            net.sqlcipher.database.SQLiteDatabase r2 = r10.getWritableDatabase(r11)     // Catch: java.lang.Throwable -> L53
            r10.mIsInitializing = r0     // Catch: java.lang.Throwable -> L53
            r2.close()     // Catch: java.lang.Throwable -> L53
        L67:
            net.sqlcipher.database.SQLiteDatabase$CursorFactory r6 = r10.mFactory     // Catch: java.lang.Throwable -> L53
            net.sqlcipher.database.SQLiteDatabaseHook r8 = r10.mHook     // Catch: java.lang.Throwable -> L53
            net.sqlcipher.DatabaseErrorHandler r9 = r10.mErrorHandler     // Catch: java.lang.Throwable -> L53
            r7 = 1
            r5 = r11
            net.sqlcipher.database.SQLiteDatabase r2 = net.sqlcipher.database.SQLiteDatabase.openDatabase(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L53
            int r11 = r2.getVersion()     // Catch: java.lang.Throwable -> L53
            int r0 = r10.mNewVersion     // Catch: java.lang.Throwable -> L53
            if (r11 != r0) goto L84
            r10.onOpen(r2)     // Catch: java.lang.Throwable -> L53
            r10.mDatabase = r2     // Catch: java.lang.Throwable -> L53
            r10.mIsInitializing = r1     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r10)
            return r2
        L84:
            net.sqlcipher.database.SQLiteException r11 = new net.sqlcipher.database.SQLiteException     // Catch: java.lang.Throwable -> L53
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L53
            r0.<init>()     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = "Can't upgrade read-only database from version "
            r0.append(r3)     // Catch: java.lang.Throwable -> L53
            int r3 = r2.getVersion()     // Catch: java.lang.Throwable -> L53
            r0.append(r3)     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = " to "
            r0.append(r3)     // Catch: java.lang.Throwable -> L53
            int r3 = r10.mNewVersion     // Catch: java.lang.Throwable -> L53
            r0.append(r3)     // Catch: java.lang.Throwable -> L53
            java.lang.String r3 = ": "
            r0.append(r3)     // Catch: java.lang.Throwable -> L53
            r0.append(r4)     // Catch: java.lang.Throwable -> L53
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L53
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L53
            throw r11     // Catch: java.lang.Throwable -> L53
        Lb1:
            r10.mIsInitializing = r1     // Catch: java.lang.Throwable -> Lf
            if (r2 == 0) goto Lbc
            net.sqlcipher.database.SQLiteDatabase r0 = r10.mDatabase     // Catch: java.lang.Throwable -> Lf
            if (r2 == r0) goto Lbc
            r2.close()     // Catch: java.lang.Throwable -> Lf
        Lbc:
            throw r11     // Catch: java.lang.Throwable -> Lf
        Lbd:
            throw r0     // Catch: java.lang.Throwable -> Lf
        Lbe:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Lf
            java.lang.String r0 = "getReadableDatabase called recursively"
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Lf
            throw r11     // Catch: java.lang.Throwable -> Lf
        Lc6:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lf
            throw r11
    }

    public synchronized net.sqlcipher.database.SQLiteDatabase getReadableDatabase(char[] r1) {
            r0 = this;
            monitor-enter(r0)
            if (r1 != 0) goto L5
            r1 = 0
            goto L9
        L5:
            byte[] r1 = net.sqlcipher.database.SQLiteDatabase.getBytes(r1)     // Catch: java.lang.Throwable -> Lf
        L9:
            net.sqlcipher.database.SQLiteDatabase r1 = r0.getReadableDatabase(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public synchronized net.sqlcipher.database.SQLiteDatabase getWritableDatabase(java.lang.String r1) {
            r0 = this;
            monitor-enter(r0)
            if (r1 != 0) goto L5
            r1 = 0
            goto L9
        L5:
            char[] r1 = r1.toCharArray()     // Catch: java.lang.Throwable -> Lf
        L9:
            net.sqlcipher.database.SQLiteDatabase r1 = r0.getWritableDatabase(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public synchronized net.sqlcipher.database.SQLiteDatabase getWritableDatabase(byte[] r7) {
            r6 = this;
            monitor-enter(r6)
            net.sqlcipher.database.SQLiteDatabase r0 = r6.mDatabase     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L1a
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L1a
            net.sqlcipher.database.SQLiteDatabase r0 = r6.mDatabase     // Catch: java.lang.Throwable -> L17
            boolean r0 = r0.isReadOnly()     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto L1a
            net.sqlcipher.database.SQLiteDatabase r7 = r6.mDatabase     // Catch: java.lang.Throwable -> L17
            monitor-exit(r6)
            return r7
        L17:
            r7 = move-exception
            goto Lc7
        L1a:
            boolean r0 = r6.mIsInitializing     // Catch: java.lang.Throwable -> L17
            if (r0 != 0) goto Lbf
            net.sqlcipher.database.SQLiteDatabase r0 = r6.mDatabase     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto L25
            r0.lock()     // Catch: java.lang.Throwable -> L17
        L25:
            r0 = 1
            r1 = 0
            r2 = 0
            r6.mIsInitializing = r0     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r6.mName     // Catch: java.lang.Throwable -> L36
            if (r0 != 0) goto L39
            java.lang.String r7 = ""
            net.sqlcipher.database.SQLiteDatabase r7 = net.sqlcipher.database.SQLiteDatabase.create(r2, r7)     // Catch: java.lang.Throwable -> L36
        L34:
            r2 = r7
            goto L60
        L36:
            r7 = move-exception
            goto Lb0
        L39:
            android.content.Context r3 = r6.mContext     // Catch: java.lang.Throwable -> L36
            java.io.File r0 = r3.getDatabasePath(r0)     // Catch: java.lang.Throwable -> L36
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L36
            java.io.File r3 = new java.io.File     // Catch: java.lang.Throwable -> L36
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L36
            boolean r4 = r3.exists()     // Catch: java.lang.Throwable -> L36
            if (r4 != 0) goto L55
            java.io.File r3 = r3.getParentFile()     // Catch: java.lang.Throwable -> L36
            r3.mkdirs()     // Catch: java.lang.Throwable -> L36
        L55:
            net.sqlcipher.database.SQLiteDatabase$CursorFactory r3 = r6.mFactory     // Catch: java.lang.Throwable -> L36
            net.sqlcipher.database.SQLiteDatabaseHook r4 = r6.mHook     // Catch: java.lang.Throwable -> L36
            net.sqlcipher.DatabaseErrorHandler r5 = r6.mErrorHandler     // Catch: java.lang.Throwable -> L36
            net.sqlcipher.database.SQLiteDatabase r7 = net.sqlcipher.database.SQLiteDatabase.openOrCreateDatabase(r0, r7, r3, r4, r5)     // Catch: java.lang.Throwable -> L36
            goto L34
        L60:
            boolean r7 = r6.mDeferSetWriteAheadLoggingEnabled     // Catch: java.lang.Throwable -> L36
            if (r7 == 0) goto L6a
            boolean r7 = r2.enableWriteAheadLogging()     // Catch: java.lang.Throwable -> L36
            r6.mEnableWriteAheadLogging = r7     // Catch: java.lang.Throwable -> L36
        L6a:
            r6.onConfigure(r2)     // Catch: java.lang.Throwable -> L36
            int r7 = r2.getVersion()     // Catch: java.lang.Throwable -> L36
            int r0 = r6.mNewVersion     // Catch: java.lang.Throwable -> L36
            if (r7 == r0) goto L9b
            r2.beginTransaction()     // Catch: java.lang.Throwable -> L36
            if (r7 != 0) goto L80
            r6.onCreate(r2)     // Catch: java.lang.Throwable -> L7e
            goto L8b
        L7e:
            r7 = move-exception
            goto L97
        L80:
            int r0 = r6.mNewVersion     // Catch: java.lang.Throwable -> L7e
            if (r7 <= r0) goto L88
            r6.onDowngrade(r2, r7, r0)     // Catch: java.lang.Throwable -> L7e
            goto L8b
        L88:
            r6.onUpgrade(r2, r7, r0)     // Catch: java.lang.Throwable -> L7e
        L8b:
            int r7 = r6.mNewVersion     // Catch: java.lang.Throwable -> L7e
            r2.setVersion(r7)     // Catch: java.lang.Throwable -> L7e
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L7e
            r2.endTransaction()     // Catch: java.lang.Throwable -> L36
            goto L9b
        L97:
            r2.endTransaction()     // Catch: java.lang.Throwable -> L36
            throw r7     // Catch: java.lang.Throwable -> L36
        L9b:
            r6.onOpen(r2)     // Catch: java.lang.Throwable -> L36
            r6.mIsInitializing = r1     // Catch: java.lang.Throwable -> L17
            net.sqlcipher.database.SQLiteDatabase r7 = r6.mDatabase     // Catch: java.lang.Throwable -> L17
            if (r7 == 0) goto Lac
            r7.close()     // Catch: java.lang.Throwable -> L17 java.lang.Exception -> La7
        La7:
            net.sqlcipher.database.SQLiteDatabase r7 = r6.mDatabase     // Catch: java.lang.Throwable -> L17
            r7.unlock()     // Catch: java.lang.Throwable -> L17
        Lac:
            r6.mDatabase = r2     // Catch: java.lang.Throwable -> L17
            monitor-exit(r6)
            return r2
        Lb0:
            r6.mIsInitializing = r1     // Catch: java.lang.Throwable -> L17
            net.sqlcipher.database.SQLiteDatabase r0 = r6.mDatabase     // Catch: java.lang.Throwable -> L17
            if (r0 == 0) goto Lb9
            r0.unlock()     // Catch: java.lang.Throwable -> L17
        Lb9:
            if (r2 == 0) goto Lbe
            r2.close()     // Catch: java.lang.Throwable -> L17
        Lbe:
            throw r7     // Catch: java.lang.Throwable -> L17
        Lbf:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L17
            java.lang.String r0 = "getWritableDatabase called recursively"
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L17
            throw r7     // Catch: java.lang.Throwable -> L17
        Lc7:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L17
            throw r7
    }

    public synchronized net.sqlcipher.database.SQLiteDatabase getWritableDatabase(char[] r1) {
            r0 = this;
            monitor-enter(r0)
            if (r1 != 0) goto L5
            r1 = 0
            goto L9
        L5:
            byte[] r1 = net.sqlcipher.database.SQLiteDatabase.getBytes(r1)     // Catch: java.lang.Throwable -> Lf
        L9:
            net.sqlcipher.database.SQLiteDatabase r1 = r0.getWritableDatabase(r1)     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r0)
            return r1
        Lf:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lf
            throw r1
    }

    public void onConfigure(net.sqlcipher.database.SQLiteDatabase r1) {
            r0 = this;
            return
    }

    public abstract void onCreate(net.sqlcipher.database.SQLiteDatabase r1);

    public void onDowngrade(net.sqlcipher.database.SQLiteDatabase r3, int r4, int r5) {
            r2 = this;
            net.sqlcipher.database.SQLiteException r3 = new net.sqlcipher.database.SQLiteException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Can't downgrade database from version "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " to "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            r3.<init>(r4)
            throw r3
    }

    public void onOpen(net.sqlcipher.database.SQLiteDatabase r1) {
            r0 = this;
            return
    }

    public abstract void onUpgrade(net.sqlcipher.database.SQLiteDatabase r1, int r2, int r3);

    public void setWriteAheadLoggingEnabled(boolean r2) {
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.mEnableWriteAheadLogging     // Catch: java.lang.Throwable -> L1f
            if (r0 == r2) goto L2b
            net.sqlcipher.database.SQLiteDatabase r0 = r1.mDatabase     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L29
            boolean r0 = r0.isOpen()     // Catch: java.lang.Throwable -> L1f
            if (r0 == 0) goto L29
            net.sqlcipher.database.SQLiteDatabase r0 = r1.mDatabase     // Catch: java.lang.Throwable -> L1f
            boolean r0 = r0.isReadOnly()     // Catch: java.lang.Throwable -> L1f
            if (r0 != 0) goto L29
            if (r2 == 0) goto L21
            net.sqlcipher.database.SQLiteDatabase r0 = r1.mDatabase     // Catch: java.lang.Throwable -> L1f
            r0.enableWriteAheadLogging()     // Catch: java.lang.Throwable -> L1f
            goto L26
        L1f:
            r2 = move-exception
            goto L2d
        L21:
            net.sqlcipher.database.SQLiteDatabase r0 = r1.mDatabase     // Catch: java.lang.Throwable -> L1f
            r0.disableWriteAheadLogging()     // Catch: java.lang.Throwable -> L1f
        L26:
            r1.mEnableWriteAheadLogging = r2     // Catch: java.lang.Throwable -> L1f
            goto L2b
        L29:
            r1.mDeferSetWriteAheadLoggingEnabled = r2     // Catch: java.lang.Throwable -> L1f
        L2b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            return
        L2d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L1f
            throw r2
    }
}

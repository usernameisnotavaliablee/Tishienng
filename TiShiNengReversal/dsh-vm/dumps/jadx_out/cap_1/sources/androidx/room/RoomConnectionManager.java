package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RoomConnectionManager extends androidx.room.BaseRoomConnectionManager {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<androidx.room.RoomDatabase.Callback> callbacks;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.DatabaseConfiguration configuration;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.coroutines.ConnectionPool connectionPool;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.RoomOpenDelegate openDelegate;

    @org.jetbrains.annotations.Nullable
    private androidx.sqlite.db.SupportSQLiteDatabase supportDatabase;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class NoOpOpenDelegate extends androidx.room.RoomOpenDelegate {
        public NoOpOpenDelegate() {
                r2 = this;
                r0 = -1
                java.lang.String r1 = ""
                r2.<init>(r0, r1, r1)
                return
        }

        @Override // androidx.room.RoomOpenDelegate
        public void createAllTables(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "NOP delegate should never be called"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.room.RoomOpenDelegate
        public void dropAllTables(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "NOP delegate should never be called"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onCreate(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "NOP delegate should never be called"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onOpen(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "NOP delegate should never be called"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPostMigrate(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "NOP delegate should never be called"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.room.RoomOpenDelegate
        public void onPreMigrate(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "NOP delegate should never be called"
                r2.<init>(r0)
                throw r2
        }

        @Override // androidx.room.RoomOpenDelegate
        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomOpenDelegate.ValidationResult onValidateSchema(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "NOP delegate should never be called"
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class SupportOpenHelperCallback extends androidx.sqlite.db.SupportSQLiteOpenHelper.Callback {
        final /* synthetic */ androidx.room.RoomConnectionManager this$0;

        public SupportOpenHelperCallback(androidx.room.RoomConnectionManager r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>(r2)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onCreate(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r3) {
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.room.RoomConnectionManager r0 = r2.this$0
                androidx.room.driver.SupportSQLiteConnection r1 = new androidx.room.driver.SupportSQLiteConnection
                r1.<init>(r3)
                r0.onCreate(r1)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onDowngrade(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2, int r3, int r4) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.onUpgrade(r2, r3, r4)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onOpen(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r3) {
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.room.RoomConnectionManager r0 = r2.this$0
                androidx.room.driver.SupportSQLiteConnection r1 = new androidx.room.driver.SupportSQLiteConnection
                r1.<init>(r3)
                r0.onOpen(r1)
                androidx.room.RoomConnectionManager r0 = r2.this$0
                androidx.room.RoomConnectionManager.access$setSupportDatabase$p(r0, r3)
                return
        }

        @Override // androidx.sqlite.db.SupportSQLiteOpenHelper.Callback
        public void onUpgrade(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r3, int r4, int r5) {
                r2 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r3, r0)
                androidx.room.RoomConnectionManager r0 = r2.this$0
                androidx.room.driver.SupportSQLiteConnection r1 = new androidx.room.driver.SupportSQLiteConnection
                r1.<init>(r3)
                r0.onMigrate(r1, r4, r5)
                return
        }
    }

    public RoomConnectionManager(@org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r4, @org.jetbrains.annotations.NotNull androidx.room.RoomOpenDelegate r5) {
            r3 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "openDelegate"
            kotlin.jvm.internal.g0.p(r5, r0)
            r3.<init>()
            r3.configuration = r4
            r3.openDelegate = r5
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r4.callbacks
            if (r0 != 0) goto L19
            java.util.List r0 = kotlin.collections.f0.J()
        L19:
            r3.callbacks = r0
            androidx.sqlite.SQLiteDriver r0 = r4.sqliteDriver
            if (r0 != 0) goto L5d
            androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r0 = r4.sqliteOpenHelperFactory
            if (r0 == 0) goto L55
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Companion r0 = androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration.Companion
            android.content.Context r1 = r4.context
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder r0 = r0.builder(r1)
            java.lang.String r1 = r4.name
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder r0 = r0.name(r1)
            androidx.room.RoomConnectionManager$SupportOpenHelperCallback r1 = new androidx.room.RoomConnectionManager$SupportOpenHelperCallback
            int r5 = r5.getVersion()
            r1.<init>(r3, r5)
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration$Builder r5 = r0.callback(r1)
            androidx.sqlite.db.SupportSQLiteOpenHelper$Configuration r5 = r5.build()
            androidx.room.driver.SupportSQLiteConnectionPool r0 = new androidx.room.driver.SupportSQLiteConnectionPool
            androidx.room.driver.SupportSQLiteDriver r1 = new androidx.room.driver.SupportSQLiteDriver
            androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r4 = r4.sqliteOpenHelperFactory
            androidx.sqlite.db.SupportSQLiteOpenHelper r4 = r4.create(r5)
            r1.<init>(r4)
            r0.<init>(r1)
            r3.connectionPool = r0
            goto L9b
        L55:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "SQLiteManager was constructed with both null driver and open helper factory!"
            r4.<init>(r5)
            throw r4
        L5d:
            boolean r5 = r0 instanceof androidx.sqlite.driver.AndroidSQLiteDriver
            java.lang.String r1 = ":memory:"
            if (r5 == 0) goto L74
            androidx.room.coroutines.AndroidSQLiteDriverConnectionPool r5 = new androidx.room.coroutines.AndroidSQLiteDriverConnectionPool
            androidx.room.BaseRoomConnectionManager$DriverWrapper r2 = new androidx.room.BaseRoomConnectionManager$DriverWrapper
            r2.<init>(r3, r0)
            java.lang.String r4 = r4.name
            if (r4 != 0) goto L6f
            goto L70
        L6f:
            r1 = r4
        L70:
            r5.<init>(r2, r1)
            goto L99
        L74:
            java.lang.String r5 = r4.name
            if (r5 != 0) goto L82
            androidx.room.BaseRoomConnectionManager$DriverWrapper r4 = new androidx.room.BaseRoomConnectionManager$DriverWrapper
            r4.<init>(r3, r0)
            androidx.room.coroutines.ConnectionPool r5 = androidx.room.coroutines.ConnectionPoolKt.newSingleConnectionPool(r4, r1)
            goto L99
        L82:
            androidx.room.BaseRoomConnectionManager$DriverWrapper r5 = new androidx.room.BaseRoomConnectionManager$DriverWrapper
            r5.<init>(r3, r0)
            java.lang.String r0 = r4.name
            androidx.room.RoomDatabase$JournalMode r1 = r4.journalMode
            int r1 = r3.getMaxNumberOfReaders(r1)
            androidx.room.RoomDatabase$JournalMode r4 = r4.journalMode
            int r4 = r3.getMaxNumberOfWriters(r4)
            androidx.room.coroutines.ConnectionPool r5 = androidx.room.coroutines.ConnectionPoolKt.newConnectionPool(r5, r0, r1, r4)
        L99:
            r3.connectionPool = r5
        L9b:
            r3.init()
            return
    }

    public RoomConnectionManager(@org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super androidx.room.DatabaseConfiguration, ? extends androidx.sqlite.db.SupportSQLiteOpenHelper> r4) {
            r2 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "supportOpenHelperFactory"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.<init>()
            r2.configuration = r3
            androidx.room.RoomConnectionManager$NoOpOpenDelegate r0 = new androidx.room.RoomConnectionManager$NoOpOpenDelegate
            r0.<init>()
            r2.openDelegate = r0
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r3.callbacks
            if (r0 != 0) goto L1e
            java.util.List r0 = kotlin.collections.f0.J()
        L1e:
            r2.callbacks = r0
            androidx.room.i r0 = new androidx.room.i
            r0.<init>(r2)
            androidx.room.DatabaseConfiguration r3 = r2.installOnOpenCallback(r3, r0)
            androidx.room.driver.SupportSQLiteConnectionPool r0 = new androidx.room.driver.SupportSQLiteConnectionPool
            androidx.room.driver.SupportSQLiteDriver r1 = new androidx.room.driver.SupportSQLiteDriver
            java.lang.Object r3 = r4.invoke(r3)
            androidx.sqlite.db.SupportSQLiteOpenHelper r3 = (androidx.sqlite.db.SupportSQLiteOpenHelper) r3
            r1.<init>(r3)
            r0.<init>(r1)
            r2.connectionPool = r0
            r2.init()
            return
    }

    private static final kotlin.n1 _init_$lambda$1(androidx.room.RoomConnectionManager r1, androidx.sqlite.db.SupportSQLiteDatabase r2) {
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.supportDatabase = r2
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 a(androidx.room.RoomConnectionManager r0, androidx.sqlite.db.SupportSQLiteDatabase r1) {
            kotlin.n1 r0 = _init_$lambda$1(r0, r1)
            return r0
    }

    public static final /* synthetic */ void access$setSupportDatabase$p(androidx.room.RoomConnectionManager r0, androidx.sqlite.db.SupportSQLiteDatabase r1) {
            r0.supportDatabase = r1
            return
    }

    private final void init() {
            r2 = this;
            androidx.room.DatabaseConfiguration r0 = r2.getConfiguration()
            androidx.room.RoomDatabase$JournalMode r0 = r0.journalMode
            androidx.room.RoomDatabase$JournalMode r1 = androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING
            if (r0 != r1) goto Lc
            r0 = 1
            goto Ld
        Lc:
            r0 = 0
        Ld:
            androidx.sqlite.db.SupportSQLiteOpenHelper r1 = r2.getSupportOpenHelper$room_runtime_release()
            if (r1 == 0) goto L16
            r1.setWriteAheadLoggingEnabled(r0)
        L16:
            return
    }

    private final androidx.room.DatabaseConfiguration installOnOpenCallback(androidx.room.DatabaseConfiguration r27, kotlin.jvm.functions.Function1<? super androidx.sqlite.db.SupportSQLiteDatabase, kotlin.n1> r28) {
            r26 = this;
            r1 = r27
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r1.callbacks
            if (r0 != 0) goto La
            java.util.List r0 = kotlin.collections.f0.J()
        La:
            java.util.Collection r0 = (java.util.Collection) r0
            androidx.room.RoomConnectionManager$installOnOpenCallback$newCallbacks$1 r2 = new androidx.room.RoomConnectionManager$installOnOpenCallback$newCallbacks$1
            r3 = r28
            r2.<init>(r3)
            java.util.List r6 = kotlin.collections.f0.J4(r0, r2)
            r24 = 4194287(0x3fffef, float:5.877448E-39)
            r25 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            androidx.room.DatabaseConfiguration r0 = androidx.room.DatabaseConfiguration.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return r0
    }

    public final void close() {
            r1 = this;
            androidx.room.coroutines.ConnectionPool r0 = r1.connectionPool
            r0.close()
            return
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @org.jetbrains.annotations.NotNull
    protected java.util.List<androidx.room.RoomDatabase.Callback> getCallbacks() {
            r1 = this;
            java.util.List<androidx.room.RoomDatabase$Callback> r0 = r1.callbacks
            return r0
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @org.jetbrains.annotations.NotNull
    protected androidx.room.DatabaseConfiguration getConfiguration() {
            r1 = this;
            androidx.room.DatabaseConfiguration r0 = r1.configuration
            return r0
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @org.jetbrains.annotations.NotNull
    protected androidx.room.RoomOpenDelegate getOpenDelegate() {
            r1 = this;
            androidx.room.RoomOpenDelegate r0 = r1.openDelegate
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final androidx.sqlite.db.SupportSQLiteOpenHelper getSupportOpenHelper$room_runtime_release() {
            r3 = this;
            androidx.room.coroutines.ConnectionPool r0 = r3.connectionPool
            boolean r1 = r0 instanceof androidx.room.driver.SupportSQLiteConnectionPool
            r2 = 0
            if (r1 == 0) goto La
            androidx.room.driver.SupportSQLiteConnectionPool r0 = (androidx.room.driver.SupportSQLiteConnectionPool) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto L18
            androidx.room.driver.SupportSQLiteDriver r0 = r0.getSupportDriver$room_runtime_release()
            if (r0 == 0) goto L18
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r0.getOpenHelper()
            return r0
        L18:
            return r2
    }

    public final boolean isSupportDatabaseOpen() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r1.supportDatabase
            if (r0 == 0) goto L9
            boolean r0 = r0.isOpen()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @org.jetbrains.annotations.NotNull
    public java.lang.String resolveFileName$room_runtime_release(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = ":memory:"
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r0)
            if (r0 != 0) goto L1e
            androidx.room.DatabaseConfiguration r0 = r1.getConfiguration()
            android.content.Context r0 = r0.context
            java.io.File r2 = r0.getDatabasePath(r2)
            java.lang.String r2 = r2.getAbsolutePath()
            kotlin.jvm.internal.g0.m(r2)
        L1e:
            return r2
    }

    @Override // androidx.room.BaseRoomConnectionManager
    @org.jetbrains.annotations.Nullable
    public <R> java.lang.Object useConnection(boolean r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r4) {
            r1 = this;
            androidx.room.coroutines.ConnectionPool r0 = r1.connectionPool
            java.lang.Object r2 = r0.useConnection(r2, r3, r4)
            return r2
    }
}

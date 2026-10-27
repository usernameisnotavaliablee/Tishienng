package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRoomConnectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomConnectionManager.kt\nandroidx/room/BaseRoomConnectionManager\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,362:1\n1#2:363\n1863#3,2:364\n1863#3,2:366\n1863#3,2:368\n1863#3,2:370\n1863#3,2:372\n*S KotlinDebug\n*F\n+ 1 RoomConnectionManager.kt\nandroidx/room/BaseRoomConnectionManager\n*L\n209#1:364,2\n253#1:366,2\n342#1:368,2\n346#1:370,2\n350#1:372,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class BaseRoomConnectionManager {
    public static final int BUSY_TIMEOUT_MS = 3000;

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.BaseRoomConnectionManager.Companion Companion = null;
    private boolean isConfigured;
    private boolean isInitializing;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class Companion {
        private Companion() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected final class DriverWrapper implements androidx.sqlite.SQLiteDriver {

        @org.jetbrains.annotations.NotNull
        private final androidx.sqlite.SQLiteDriver actual;
        final /* synthetic */ androidx.room.BaseRoomConnectionManager this$0;

        public DriverWrapper(@org.jetbrains.annotations.NotNull androidx.room.BaseRoomConnectionManager r2, androidx.sqlite.SQLiteDriver r3) {
                r1 = this;
                java.lang.String r0 = "actual"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.this$0 = r2
                r1.<init>()
                r1.actual = r3
                return
        }

        public static /* synthetic */ androidx.sqlite.SQLiteConnection a(androidx.room.BaseRoomConnectionManager r0, androidx.room.BaseRoomConnectionManager.DriverWrapper r1, java.lang.String r2) {
                androidx.sqlite.SQLiteConnection r0 = openLocked$lambda$1(r0, r1, r2)
                return r0
        }

        private final androidx.sqlite.SQLiteConnection openLocked(java.lang.String r4) {
                r3 = this;
                androidx.room.concurrent.ExclusiveLock r0 = new androidx.room.concurrent.ExclusiveLock
                androidx.room.BaseRoomConnectionManager r1 = r3.this$0
                boolean r1 = androidx.room.BaseRoomConnectionManager.access$isConfigured$p(r1)
                if (r1 != 0) goto L1c
                androidx.room.BaseRoomConnectionManager r1 = r3.this$0
                boolean r1 = androidx.room.BaseRoomConnectionManager.access$isInitializing$p(r1)
                if (r1 != 0) goto L1c
                java.lang.String r1 = ":memory:"
                boolean r1 = kotlin.jvm.internal.g0.g(r4, r1)
                if (r1 != 0) goto L1c
                r1 = 1
                goto L1d
            L1c:
                r1 = 0
            L1d:
                r0.<init>(r4, r1)
                androidx.room.BaseRoomConnectionManager r1 = r3.this$0
                androidx.room.d r2 = new androidx.room.d
                r2.<init>(r1, r3, r4)
                androidx.room.BaseRoomConnectionManager$DriverWrapper$openLocked$2 r1 = new androidx.room.BaseRoomConnectionManager$DriverWrapper$openLocked$2
                r1.<init>(r4)
                java.lang.Object r4 = r0.withLock(r2, r1)
                androidx.sqlite.SQLiteConnection r4 = (androidx.sqlite.SQLiteConnection) r4
                return r4
        }

        private static final androidx.sqlite.SQLiteConnection openLocked$lambda$1(androidx.room.BaseRoomConnectionManager r1, androidx.room.BaseRoomConnectionManager.DriverWrapper r2, java.lang.String r3) {
                boolean r0 = androidx.room.BaseRoomConnectionManager.access$isInitializing$p(r1)
                if (r0 != 0) goto L27
                androidx.sqlite.SQLiteDriver r2 = r2.actual
                androidx.sqlite.SQLiteConnection r2 = r2.open(r3)
                boolean r3 = androidx.room.BaseRoomConnectionManager.access$isConfigured$p(r1)
                if (r3 != 0) goto L23
                r3 = 1
                r0 = 0
                androidx.room.BaseRoomConnectionManager.access$setInitializing$p(r1, r3)     // Catch: java.lang.Throwable -> L1e
                androidx.room.BaseRoomConnectionManager.access$configureDatabase(r1, r2)     // Catch: java.lang.Throwable -> L1e
                androidx.room.BaseRoomConnectionManager.access$setInitializing$p(r1, r0)
                return r2
            L1e:
                r2 = move-exception
                androidx.room.BaseRoomConnectionManager.access$setInitializing$p(r1, r0)
                throw r2
            L23:
                androidx.room.BaseRoomConnectionManager.access$configurationConnection(r1, r2)
                return r2
            L27:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "Recursive database initialization detected. Did you try to use the database instance during initialization? Maybe in one of the callbacks?"
                r1.<init>(r2)
                throw r1
        }

        @Override // androidx.sqlite.SQLiteDriver
        @org.jetbrains.annotations.NotNull
        public androidx.sqlite.SQLiteConnection open(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "fileName"
                kotlin.jvm.internal.g0.p(r2, r0)
                androidx.room.BaseRoomConnectionManager r0 = r1.this$0
                java.lang.String r2 = r0.resolveFileName$room_runtime_release(r2)
                androidx.sqlite.SQLiteConnection r2 = r1.openLocked(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0 = null;

        static {
                androidx.room.RoomDatabase$JournalMode[] r0 = androidx.room.RoomDatabase.JournalMode.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                androidx.room.RoomDatabase$JournalMode r1 = androidx.room.RoomDatabase.JournalMode.TRUNCATE     // Catch: java.lang.NoSuchFieldError -> L10
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10
            L10:
                androidx.room.RoomDatabase$JournalMode r1 = androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING     // Catch: java.lang.NoSuchFieldError -> L19
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19
            L19:
                androidx.room.BaseRoomConnectionManager.WhenMappings.$EnumSwitchMapping$0 = r0
                return
        }
    }

    static {
            androidx.room.BaseRoomConnectionManager$Companion r0 = new androidx.room.BaseRoomConnectionManager$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.BaseRoomConnectionManager.Companion = r0
            return
    }

    public BaseRoomConnectionManager() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ void access$configurationConnection(androidx.room.BaseRoomConnectionManager r0, androidx.sqlite.SQLiteConnection r1) {
            r0.configurationConnection(r1)
            return
    }

    public static final /* synthetic */ void access$configureDatabase(androidx.room.BaseRoomConnectionManager r0, androidx.sqlite.SQLiteConnection r1) {
            r0.configureDatabase(r1)
            return
    }

    public static final /* synthetic */ boolean access$isConfigured$p(androidx.room.BaseRoomConnectionManager r0) {
            boolean r0 = r0.isConfigured
            return r0
    }

    public static final /* synthetic */ boolean access$isInitializing$p(androidx.room.BaseRoomConnectionManager r0) {
            boolean r0 = r0.isInitializing
            return r0
    }

    public static final /* synthetic */ void access$setInitializing$p(androidx.room.BaseRoomConnectionManager r0, boolean r1) {
            r0.isInitializing = r1
            return
    }

    private final void checkIdentity(androidx.sqlite.SQLiteConnection r5) {
            r4 = this;
            boolean r0 = r4.hasRoomMasterTable(r5)
            if (r0 == 0) goto L6e
            java.lang.String r0 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            androidx.sqlite.SQLiteStatement r5 = r5.prepare(r0)
            boolean r0 = r5.step()     // Catch: java.lang.Throwable -> L19
            r1 = 0
            if (r0 == 0) goto L1b
            r0 = 0
            java.lang.String r0 = r5.getText(r0)     // Catch: java.lang.Throwable -> L19
            goto L1c
        L19:
            r0 = move-exception
            goto L68
        L1b:
            r0 = r1
        L1c:
            kotlin.jdk7.a.c(r5, r1)
            androidx.room.RoomOpenDelegate r5 = r4.getOpenDelegate()
            java.lang.String r5 = r5.getIdentityHash()
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r0)
            if (r5 != 0) goto L67
            androidx.room.RoomOpenDelegate r5 = r4.getOpenDelegate()
            java.lang.String r5 = r5.getLegacyIdentityHash()
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r0)
            if (r5 == 0) goto L3c
            goto L67
        L3c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            r1.append(r2)
            androidx.room.RoomOpenDelegate r2 = r4.getOpenDelegate()
            java.lang.String r2 = r2.getIdentityHash()
            r1.append(r2)
            java.lang.String r2 = ", found: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L67:
            return
        L68:
            throw r0     // Catch: java.lang.Throwable -> L69
        L69:
            r1 = move-exception
            kotlin.jdk7.a.c(r5, r0)
            throw r1
        L6e:
            java.lang.String r0 = "BEGIN EXCLUSIVE TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r5, r0)
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L92
            androidx.room.RoomOpenDelegate r0 = r4.getOpenDelegate()     // Catch: java.lang.Throwable -> L92
            androidx.room.RoomOpenDelegate$ValidationResult r0 = r0.onValidateSchema(r5)     // Catch: java.lang.Throwable -> L92
            boolean r1 = r0.isValid     // Catch: java.lang.Throwable -> L92
            if (r1 == 0) goto L94
            androidx.room.RoomOpenDelegate r0 = r4.getOpenDelegate()     // Catch: java.lang.Throwable -> L92
            r0.onPostMigrate(r5)     // Catch: java.lang.Throwable -> L92
            r4.updateIdentity(r5)     // Catch: java.lang.Throwable -> L92
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L92
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)     // Catch: java.lang.Throwable -> L92
            goto Lbb
        L92:
            r0 = move-exception
            goto Lb1
        L94:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L92
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L92
            r2.<init>()     // Catch: java.lang.Throwable -> L92
            java.lang.String r3 = "Pre-packaged database has an invalid schema: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r0.expectedFoundMsg     // Catch: java.lang.Throwable -> L92
            r2.append(r0)     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L92
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L92
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L92
            throw r1     // Catch: java.lang.Throwable -> L92
        Lb1:
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.g0.a(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
        Lbb:
            boolean r1 = kotlin.Result.isSuccess-impl(r0)
            if (r1 == 0) goto Lc9
            r1 = r0
            kotlin.n1 r1 = (kotlin.n1) r1
            java.lang.String r1 = "END TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r5, r1)
        Lc9:
            java.lang.Throwable r1 = kotlin.Result.exceptionOrNull-impl(r0)
            if (r1 != 0) goto Ld3
            kotlin.Result.box-impl(r0)
            return
        Ld3:
            java.lang.String r0 = "ROLLBACK TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r5, r0)
            throw r1
    }

    private final void configurationConnection(androidx.sqlite.SQLiteConnection r2) {
            r1 = this;
            r1.configureSynchronousFlag(r2)
            r1.configureBusyTimeout(r2)
            androidx.room.RoomOpenDelegate r0 = r1.getOpenDelegate()
            r0.onOpen(r2)
            return
    }

    private final void configureBusyTimeout(androidx.sqlite.SQLiteConnection r6) {
            r5 = this;
            java.lang.String r0 = "PRAGMA busy_timeout"
            androidx.sqlite.SQLiteStatement r0 = r6.prepare(r0)
            r0.step()     // Catch: java.lang.Throwable -> L1e
            r1 = 0
            long r1 = r0.getLong(r1)     // Catch: java.lang.Throwable -> L1e
            r3 = 0
            kotlin.jdk7.a.c(r0, r3)
            r3 = 3000(0xbb8, double:1.482E-320)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L1d
            java.lang.String r0 = "PRAGMA busy_timeout = 3000"
            androidx.sqlite.SQLite.execSQL(r6, r0)
        L1d:
            return
        L1e:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L20
        L20:
            r1 = move-exception
            kotlin.jdk7.a.c(r0, r6)
            throw r1
    }

    private final void configureDatabase(androidx.sqlite.SQLiteConnection r4) {
            r3 = this;
            r3.configureJournalMode(r4)
            r3.configureSynchronousFlag(r4)
            r3.configureBusyTimeout(r4)
            java.lang.String r0 = "PRAGMA user_version"
            androidx.sqlite.SQLiteStatement r0 = r4.prepare(r0)
            r0.step()     // Catch: java.lang.Throwable -> L8c
            r1 = 0
            long r1 = r0.getLong(r1)     // Catch: java.lang.Throwable -> L8c
            int r2 = (int) r1
            r1 = 0
            kotlin.jdk7.a.c(r0, r1)
            androidx.room.RoomOpenDelegate r0 = r3.getOpenDelegate()
            int r0 = r0.getVersion()
            if (r2 == r0) goto L88
            java.lang.String r0 = "BEGIN EXCLUSIVE TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r4, r0)
            kotlin.Result$a r0 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L33
            if (r2 != 0) goto L35
            r3.onCreate(r4)     // Catch: java.lang.Throwable -> L33
            goto L40
        L33:
            r0 = move-exception
            goto L63
        L35:
            androidx.room.RoomOpenDelegate r0 = r3.getOpenDelegate()     // Catch: java.lang.Throwable -> L33
            int r0 = r0.getVersion()     // Catch: java.lang.Throwable -> L33
            r3.onMigrate(r4, r2, r0)     // Catch: java.lang.Throwable -> L33
        L40:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L33
            r0.<init>()     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = "PRAGMA user_version = "
            r0.append(r1)     // Catch: java.lang.Throwable -> L33
            androidx.room.RoomOpenDelegate r1 = r3.getOpenDelegate()     // Catch: java.lang.Throwable -> L33
            int r1 = r1.getVersion()     // Catch: java.lang.Throwable -> L33
            r0.append(r1)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L33
            androidx.sqlite.SQLite.execSQL(r4, r0)     // Catch: java.lang.Throwable -> L33
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> L33
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)     // Catch: java.lang.Throwable -> L33
            goto L6d
        L63:
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.g0.a(r0)
            java.lang.Object r0 = kotlin.Result.constructor-impl(r0)
        L6d:
            boolean r1 = kotlin.Result.isSuccess-impl(r0)
            if (r1 == 0) goto L7b
            r1 = r0
            kotlin.n1 r1 = (kotlin.n1) r1
            java.lang.String r1 = "END TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r4, r1)
        L7b:
            java.lang.Throwable r0 = kotlin.Result.exceptionOrNull-impl(r0)
            if (r0 != 0) goto L82
            goto L88
        L82:
            java.lang.String r1 = "ROLLBACK TRANSACTION"
            androidx.sqlite.SQLite.execSQL(r4, r1)
            throw r0
        L88:
            r3.onOpen(r4)
            return
        L8c:
            r4 = move-exception
            throw r4     // Catch: java.lang.Throwable -> L8e
        L8e:
            r1 = move-exception
            kotlin.jdk7.a.c(r0, r4)
            throw r1
    }

    private final void configureJournalMode(androidx.sqlite.SQLiteConnection r3) {
            r2 = this;
            androidx.room.DatabaseConfiguration r0 = r2.getConfiguration()
            androidx.room.RoomDatabase$JournalMode r0 = r0.journalMode
            androidx.room.RoomDatabase$JournalMode r1 = androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING
            if (r0 != r1) goto L10
            java.lang.String r0 = "PRAGMA journal_mode = WAL"
            androidx.sqlite.SQLite.execSQL(r3, r0)
            return
        L10:
            java.lang.String r0 = "PRAGMA journal_mode = TRUNCATE"
            androidx.sqlite.SQLite.execSQL(r3, r0)
            return
    }

    private final void configureSynchronousFlag(androidx.sqlite.SQLiteConnection r3) {
            r2 = this;
            androidx.room.DatabaseConfiguration r0 = r2.getConfiguration()
            androidx.room.RoomDatabase$JournalMode r0 = r0.journalMode
            androidx.room.RoomDatabase$JournalMode r1 = androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING
            if (r0 != r1) goto L10
            java.lang.String r0 = "PRAGMA synchronous = NORMAL"
            androidx.sqlite.SQLite.execSQL(r3, r0)
            return
        L10:
            java.lang.String r0 = "PRAGMA synchronous = FULL"
            androidx.sqlite.SQLite.execSQL(r3, r0)
            return
    }

    private final void createMasterTableIfNotExists(androidx.sqlite.SQLiteConnection r2) {
            r1 = this;
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"
            androidx.sqlite.SQLite.execSQL(r2, r0)
            return
    }

    private final void dropAllTables(androidx.sqlite.SQLiteConnection r8) {
            r7 = this;
            androidx.room.DatabaseConfiguration r0 = r7.getConfiguration()
            boolean r0 = r0.allowDestructiveMigrationForAllTables
            if (r0 == 0) goto La6
            java.lang.String r0 = "SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"
            androidx.sqlite.SQLiteStatement r0 = r8.prepare(r0)
            java.util.List r1 = kotlin.collections.f0.j()     // Catch: java.lang.Throwable -> L48
        L12:
            boolean r2 = r0.step()     // Catch: java.lang.Throwable -> L48
            r3 = 0
            if (r2 == 0) goto L4a
            r2 = 0
            java.lang.String r4 = r0.getText(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r5 = "sqlite_"
            r6 = 2
            boolean r2 = kotlin.text.u.H2(r4, r5, r2, r6, r3)     // Catch: java.lang.Throwable -> L48
            if (r2 != 0) goto L12
            java.lang.String r2 = "android_metadata"
            boolean r2 = kotlin.jvm.internal.g0.g(r4, r2)     // Catch: java.lang.Throwable -> L48
            if (r2 == 0) goto L30
            goto L12
        L30:
            r2 = 1
            java.lang.String r2 = r0.getText(r2)     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "view"
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Throwable -> L48
            kotlin.Pair r2 = kotlin.o0.a(r4, r2)     // Catch: java.lang.Throwable -> L48
            r1.add(r2)     // Catch: java.lang.Throwable -> L48
            goto L12
        L48:
            r8 = move-exception
            goto La0
        L4a:
            java.util.List r1 = kotlin.collections.f0.b(r1)     // Catch: java.lang.Throwable -> L48
            kotlin.jdk7.a.c(r0, r3)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.Iterator r0 = r1.iterator()
        L57:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L9f
            java.lang.Object r1 = r0.next()
            kotlin.Pair r1 = (kotlin.Pair) r1
            java.lang.Object r2 = r1.component1()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.component2()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L8a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "DROP VIEW IF EXISTS "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.sqlite.SQLite.execSQL(r8, r1)
            goto L57
        L8a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "DROP TABLE IF EXISTS "
            r1.append(r3)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            androidx.sqlite.SQLite.execSQL(r8, r1)
            goto L57
        L9f:
            return
        La0:
            throw r8     // Catch: java.lang.Throwable -> La1
        La1:
            r1 = move-exception
            kotlin.jdk7.a.c(r0, r8)
            throw r1
        La6:
            androidx.room.RoomOpenDelegate r0 = r7.getOpenDelegate()
            r0.dropAllTables(r8)
            return
    }

    private final boolean hasEmptySchema(androidx.sqlite.SQLiteConnection r7) {
            r6 = this;
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            androidx.sqlite.SQLiteStatement r7 = r7.prepare(r0)
            boolean r0 = r7.step()     // Catch: java.lang.Throwable -> L19
            r1 = 0
            if (r0 == 0) goto L1b
            long r2 = r7.getLong(r1)     // Catch: java.lang.Throwable -> L19
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L1b
            r1 = 1
            goto L1b
        L19:
            r0 = move-exception
            goto L20
        L1b:
            r0 = 0
            kotlin.jdk7.a.c(r7, r0)
            return r1
        L20:
            throw r0     // Catch: java.lang.Throwable -> L21
        L21:
            r1 = move-exception
            kotlin.jdk7.a.c(r7, r0)
            throw r1
    }

    private final boolean hasRoomMasterTable(androidx.sqlite.SQLiteConnection r7) {
            r6 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'"
            androidx.sqlite.SQLiteStatement r7 = r7.prepare(r0)
            boolean r0 = r7.step()     // Catch: java.lang.Throwable -> L19
            r1 = 0
            if (r0 == 0) goto L1b
            long r2 = r7.getLong(r1)     // Catch: java.lang.Throwable -> L19
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L1b
            r1 = 1
            goto L1b
        L19:
            r0 = move-exception
            goto L20
        L1b:
            r0 = 0
            kotlin.jdk7.a.c(r7, r0)
            return r1
        L20:
            throw r0     // Catch: java.lang.Throwable -> L21
        L21:
            r1 = move-exception
            kotlin.jdk7.a.c(r7, r0)
            throw r1
    }

    private final void invokeCreateCallback(androidx.sqlite.SQLiteConnection r3) {
            r2 = this;
            java.util.List r0 = r2.getCallbacks()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.room.RoomDatabase$Callback r1 = (androidx.room.RoomDatabase.Callback) r1
            r1.onCreate(r3)
            goto La
        L1a:
            return
    }

    private final void invokeDestructiveMigrationCallback(androidx.sqlite.SQLiteConnection r3) {
            r2 = this;
            java.util.List r0 = r2.getCallbacks()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.room.RoomDatabase$Callback r1 = (androidx.room.RoomDatabase.Callback) r1
            r1.onDestructiveMigration(r3)
            goto La
        L1a:
            return
    }

    private final void invokeOpenCallback(androidx.sqlite.SQLiteConnection r3) {
            r2 = this;
            java.util.List r0 = r2.getCallbacks()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()
            androidx.room.RoomDatabase$Callback r1 = (androidx.room.RoomDatabase.Callback) r1
            r1.onOpen(r3)
            goto La
        L1a:
            return
    }

    private final void updateIdentity(androidx.sqlite.SQLiteConnection r2) {
            r1 = this;
            r1.createMasterTableIfNotExists(r2)
            androidx.room.RoomOpenDelegate r0 = r1.getOpenDelegate()
            java.lang.String r0 = r0.getIdentityHash()
            java.lang.String r0 = androidx.room.RoomMasterTable.createInsertQuery(r0)
            androidx.sqlite.SQLite.execSQL(r2, r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    protected abstract java.util.List<androidx.room.RoomDatabase.Callback> getCallbacks();

    @org.jetbrains.annotations.NotNull
    protected abstract androidx.room.DatabaseConfiguration getConfiguration();

    protected final int getMaxNumberOfReaders(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r4) {
            r3 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int[] r0 = androidx.room.BaseRoomConnectionManager.WhenMappings.$EnumSwitchMapping$0
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L35
            r1 = 2
            if (r0 != r1) goto L15
            r4 = 4
            return r4
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't get max number of reader for journal mode '"
            r1.append(r2)
            r1.append(r4)
            r4 = 39
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L35:
            return r1
    }

    protected final int getMaxNumberOfWriters(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r4) {
            r3 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int[] r0 = androidx.room.BaseRoomConnectionManager.WhenMappings.$EnumSwitchMapping$0
            int r1 = r4.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L34
            r2 = 2
            if (r0 != r2) goto L14
            goto L34
        L14:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Can't get max number of writers for journal mode '"
            r1.append(r2)
            r1.append(r4)
            r4 = 39
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
        L34:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    protected abstract androidx.room.RoomOpenDelegate getOpenDelegate();

    protected final void onCreate(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r4) {
            r3 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r3.hasEmptySchema(r4)
            androidx.room.RoomOpenDelegate r1 = r3.getOpenDelegate()
            r1.createAllTables(r4)
            if (r0 != 0) goto L3c
            androidx.room.RoomOpenDelegate r0 = r3.getOpenDelegate()
            androidx.room.RoomOpenDelegate$ValidationResult r0 = r0.onValidateSchema(r4)
            boolean r1 = r0.isValid
            if (r1 == 0) goto L1f
            goto L3c
        L1f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Pre-packaged database has an invalid schema: "
            r1.append(r2)
            java.lang.String r0 = r0.expectedFoundMsg
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L3c:
            r3.updateIdentity(r4)
            androidx.room.RoomOpenDelegate r0 = r3.getOpenDelegate()
            r0.onCreate(r4)
            r3.invokeCreateCallback(r4)
            return
    }

    protected final void onMigrate(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r3, int r4, int r5) {
            r2 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.DatabaseConfiguration r0 = r2.getConfiguration()
            androidx.room.RoomDatabase$MigrationContainer r0 = r0.migrationContainer
            java.util.List r0 = androidx.room.util.MigrationUtil.findMigrationPath(r0, r4, r5)
            if (r0 == 0) goto L62
            androidx.room.RoomOpenDelegate r4 = r2.getOpenDelegate()
            r4.onPreMigrate(r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r4 = r0.iterator()
        L1e:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L2e
            java.lang.Object r5 = r4.next()
            androidx.room.migration.Migration r5 = (androidx.room.migration.Migration) r5
            r5.migrate(r3)
            goto L1e
        L2e:
            androidx.room.RoomOpenDelegate r4 = r2.getOpenDelegate()
            androidx.room.RoomOpenDelegate$ValidationResult r4 = r4.onValidateSchema(r3)
            boolean r5 = r4.isValid
            if (r5 == 0) goto L45
            androidx.room.RoomOpenDelegate r4 = r2.getOpenDelegate()
            r4.onPostMigrate(r3)
            r2.updateIdentity(r3)
            return
        L45:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Migration didn't properly handle: "
            r5.append(r0)
            java.lang.String r4 = r4.expectedFoundMsg
            r5.append(r4)
            java.lang.String r4 = r5.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L62:
            androidx.room.DatabaseConfiguration r0 = r2.getConfiguration()
            boolean r0 = androidx.room.util.MigrationUtil.isMigrationRequired(r0, r4, r5)
            if (r0 != 0) goto L7a
            r2.dropAllTables(r3)
            r2.invokeDestructiveMigrationCallback(r3)
            androidx.room.RoomOpenDelegate r4 = r2.getOpenDelegate()
            r4.createAllTables(r3)
            return
        L7a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A migration from "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " to "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions."
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
    }

    protected final void onOpen(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.checkIdentity(r2)
            androidx.room.RoomOpenDelegate r0 = r1.getOpenDelegate()
            r0.onOpen(r2)
            r1.invokeOpenCallback(r2)
            r2 = 1
            r1.isConfigured = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String resolveFileName$room_runtime_release(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "fileName"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public abstract <R> java.lang.Object useConnection(boolean r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3);
}

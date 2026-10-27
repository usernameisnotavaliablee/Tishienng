package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2151:1\n357#1,15:2152\n357#1,15:2167\n477#2:2182\n423#2:2183\n1246#3,4:2184\n1187#3,2:2188\n1261#3,2:2190\n1557#3:2192\n1628#3,3:2193\n1264#3:2196\n1557#3:2197\n1628#3,3:2198\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase\n*L\n271#1:2152,15\n275#1:2167,15\n343#1:2182\n343#1:2183\n343#1:2184,4\n452#1:2188,2\n452#1:2190,2\n453#1:2192\n453#1:2193,3\n452#1:2196\n478#1:2197\n478#1:2198,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class RoomDatabase {

    @org.jetbrains.annotations.NotNull
    public static final androidx.room.RoomDatabase.Companion Companion = null;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static final int MAX_BIND_PARAMETER_CNT = 999;
    private boolean allowMainThreadQueries;

    @org.jetbrains.annotations.Nullable
    private androidx.room.support.AutoCloser autoCloser;

    @org.jetbrains.annotations.NotNull
    private final androidx.room.concurrent.CloseBarrier closeBarrier;
    private androidx.room.RoomConnectionManager connectionManager;
    private kotlinx.coroutines.r0 coroutineScope;
    private java.util.concurrent.Executor internalQueryExecutor;
    private androidx.room.InvalidationTracker internalTracker;
    private java.util.concurrent.Executor internalTransactionExecutor;

    @kotlin.jvm.JvmField
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.Nullable
    protected java.util.List<? extends androidx.room.RoomDatabase.Callback> mCallbacks;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    protected volatile androidx.sqlite.db.SupportSQLiteDatabase mDatabase;

    @org.jetbrains.annotations.NotNull
    private final java.lang.ThreadLocal<java.lang.Integer> suspendingTransactionId;
    private kotlin.coroutines.i transactionContext;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.d<?>, java.lang.Object> typeConverters;
    private boolean useTempTrackingTable;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,2151:1\n1#2:2152\n*E\n"})
    public static class Builder<T extends androidx.room.RoomDatabase> {
        private boolean allowDestructiveMigrationForAllTables;
        private boolean allowDestructiveMigrationOnDowngrade;
        private boolean allowMainThreadQueries;

        @org.jetbrains.annotations.Nullable
        private java.util.concurrent.TimeUnit autoCloseTimeUnit;
        private long autoCloseTimeout;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<androidx.room.migration.AutoMigrationSpec> autoMigrationSpecs;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<androidx.room.RoomDatabase.Callback> callbacks;

        @org.jetbrains.annotations.NotNull
        private final android.content.Context context;

        @org.jetbrains.annotations.Nullable
        private java.lang.String copyFromAssetPath;

        @org.jetbrains.annotations.Nullable
        private java.io.File copyFromFile;

        @org.jetbrains.annotations.Nullable
        private java.util.concurrent.Callable<java.io.InputStream> copyFromInputStream;

        @org.jetbrains.annotations.Nullable
        private androidx.sqlite.SQLiteDriver driver;

        @org.jetbrains.annotations.Nullable
        private final kotlin.jvm.functions.Function0<T> factory;
        private boolean inMemoryTrackingTableMode;

        @org.jetbrains.annotations.NotNull
        private androidx.room.RoomDatabase.JournalMode journalMode;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.d<T> klass;

        @org.jetbrains.annotations.NotNull
        private final androidx.room.RoomDatabase.MigrationContainer migrationContainer;

        @org.jetbrains.annotations.NotNull
        private final java.util.Set<java.lang.Integer> migrationStartAndEndVersions;

        @org.jetbrains.annotations.NotNull
        private java.util.Set<java.lang.Integer> migrationsNotRequiredFrom;

        @org.jetbrains.annotations.Nullable
        private android.content.Intent multiInstanceInvalidationIntent;

        @org.jetbrains.annotations.Nullable
        private final java.lang.String name;

        @org.jetbrains.annotations.Nullable
        private androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;

        @org.jetbrains.annotations.Nullable
        private androidx.room.RoomDatabase.QueryCallback queryCallback;

        @org.jetbrains.annotations.Nullable
        private kotlin.coroutines.i queryCallbackCoroutineContext;

        @org.jetbrains.annotations.Nullable
        private java.util.concurrent.Executor queryCallbackExecutor;

        @org.jetbrains.annotations.Nullable
        private kotlin.coroutines.i queryCoroutineContext;

        @org.jetbrains.annotations.Nullable
        private java.util.concurrent.Executor queryExecutor;
        private boolean requireMigration;

        @org.jetbrains.annotations.Nullable
        private androidx.sqlite.db.SupportSQLiteOpenHelper.Factory supportOpenHelperFactory;

        @org.jetbrains.annotations.Nullable
        private java.util.concurrent.Executor transactionExecutor;

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.Object> typeConverters;

        public Builder(@org.jetbrains.annotations.NotNull android.content.Context r3, @org.jetbrains.annotations.NotNull java.lang.Class<T> r4, @org.jetbrains.annotations.Nullable java.lang.String r5) {
                r2 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "klass"
                kotlin.jvm.internal.g0.p(r4, r0)
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.callbacks = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.typeConverters = r0
                androidx.room.RoomDatabase$JournalMode r0 = androidx.room.RoomDatabase.JournalMode.AUTOMATIC
                r2.journalMode = r0
                r0 = -1
                r2.autoCloseTimeout = r0
                androidx.room.RoomDatabase$MigrationContainer r0 = new androidx.room.RoomDatabase$MigrationContainer
                r0.<init>()
                r2.migrationContainer = r0
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                r2.migrationsNotRequiredFrom = r0
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                r2.migrationStartAndEndVersions = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.autoMigrationSpecs = r0
                r0 = 1
                r2.requireMigration = r0
                r2.inMemoryTrackingTableMode = r0
                kotlin.reflect.d r4 = k3.a.i(r4)
                r2.klass = r4
                r2.context = r3
                r2.name = r5
                r3 = 0
                r2.factory = r3
                return
        }

        @kotlin.PublishedApi
        public Builder(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<? extends T> r5, @org.jetbrains.annotations.NotNull android.content.Context r6) {
                r2 = this;
                java.lang.String r0 = "klass"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r6, r0)
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.callbacks = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.typeConverters = r0
                androidx.room.RoomDatabase$JournalMode r0 = androidx.room.RoomDatabase.JournalMode.AUTOMATIC
                r2.journalMode = r0
                r0 = -1
                r2.autoCloseTimeout = r0
                androidx.room.RoomDatabase$MigrationContainer r0 = new androidx.room.RoomDatabase$MigrationContainer
                r0.<init>()
                r2.migrationContainer = r0
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                r2.migrationsNotRequiredFrom = r0
                java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
                r0.<init>()
                r2.migrationStartAndEndVersions = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r2.autoMigrationSpecs = r0
                r0 = 1
                r2.requireMigration = r0
                r2.inMemoryTrackingTableMode = r0
                r2.klass = r3
                r2.context = r6
                r2.name = r4
                r2.factory = r5
                return
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> addAutoMigrationSpec(@org.jetbrains.annotations.NotNull androidx.room.migration.AutoMigrationSpec r2) {
                r1 = this;
                java.lang.String r0 = "autoMigrationSpec"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List<androidx.room.migration.AutoMigrationSpec> r0 = r1.autoMigrationSpecs
                r0.add(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> addCallback(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.Callback r2) {
                r1 = this;
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List<androidx.room.RoomDatabase$Callback> r0 = r1.callbacks
                r0.add(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> addMigrations(@org.jetbrains.annotations.NotNull androidx.room.migration.Migration... r6) {
                r5 = this;
                java.lang.String r0 = "migrations"
                kotlin.jvm.internal.g0.p(r6, r0)
                int r0 = r6.length
                r1 = 0
            L7:
                if (r1 >= r0) goto L24
                r2 = r6[r1]
                java.util.Set<java.lang.Integer> r3 = r5.migrationStartAndEndVersions
                int r4 = r2.startVersion
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                r3.add(r4)
                java.util.Set<java.lang.Integer> r3 = r5.migrationStartAndEndVersions
                int r2 = r2.endVersion
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.add(r2)
                int r1 = r1 + 1
                goto L7
            L24:
                androidx.room.RoomDatabase$MigrationContainer r0 = r5.migrationContainer
                int r1 = r6.length
                java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)
                androidx.room.migration.Migration[] r6 = (androidx.room.migration.Migration[]) r6
                r0.addMigrations(r6)
                return r5
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> addTypeConverter(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                java.lang.String r0 = "typeConverter"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.List<java.lang.Object> r0 = r1.typeConverters
                r0.add(r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> allowMainThreadQueries() {
                r1 = this;
                r0 = 1
                r1.allowMainThreadQueries = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public T build() {
                r30 = this;
                r0 = r30
                java.util.concurrent.Executor r1 = r0.queryExecutor
                if (r1 != 0) goto L13
                java.util.concurrent.Executor r2 = r0.transactionExecutor
                if (r2 != 0) goto L13
                java.util.concurrent.Executor r1 = androidx.arch.core.executor.ArchTaskExecutor.getIOThreadExecutor()
                r0.transactionExecutor = r1
                r0.queryExecutor = r1
                goto L22
            L13:
                if (r1 == 0) goto L1c
                java.util.concurrent.Executor r2 = r0.transactionExecutor
                if (r2 != 0) goto L1c
                r0.transactionExecutor = r1
                goto L22
            L1c:
                if (r1 != 0) goto L22
                java.util.concurrent.Executor r1 = r0.transactionExecutor
                r0.queryExecutor = r1
            L22:
                java.util.Set<java.lang.Integer> r1 = r0.migrationStartAndEndVersions
                java.util.Set<java.lang.Integer> r2 = r0.migrationsNotRequiredFrom
                androidx.room.RoomDatabaseKt.validateMigrationsNotRequired(r1, r2)
                androidx.sqlite.SQLiteDriver r1 = r0.driver
                if (r1 != 0) goto L37
                androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r3 = r0.supportOpenHelperFactory
                if (r3 != 0) goto L37
                androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory r1 = new androidx.sqlite.db.framework.FrameworkSQLiteOpenHelperFactory
                r1.<init>()
                goto L41
            L37:
                if (r1 != 0) goto L3c
                androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r1 = r0.supportOpenHelperFactory
                goto L41
            L3c:
                androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r1 = r0.supportOpenHelperFactory
                if (r1 != 0) goto L19a
                r1 = 0
            L41:
                long r3 = r0.autoCloseTimeout
                r5 = 0
                r7 = 0
                r8 = 1
                int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r9 <= 0) goto L4d
                r3 = 1
                goto L4e
            L4d:
                r3 = 0
            L4e:
                java.lang.String r4 = r0.copyFromAssetPath
                if (r4 != 0) goto L5d
                java.io.File r4 = r0.copyFromFile
                if (r4 != 0) goto L5d
                java.util.concurrent.Callable<java.io.InputStream> r4 = r0.copyFromInputStream
                if (r4 == 0) goto L5b
                goto L5d
            L5b:
                r4 = 0
                goto L5e
            L5d:
                r4 = 1
            L5e:
                androidx.room.RoomDatabase$QueryCallback r5 = r0.queryCallback
                if (r5 == 0) goto L64
                r5 = 1
                goto L65
            L64:
                r5 = 0
            L65:
                java.lang.String r6 = "Required value was null."
                if (r1 == 0) goto Lf6
                if (r3 == 0) goto L93
                java.lang.String r9 = r0.name
                if (r9 == 0) goto L8b
                androidx.room.support.AutoCloser r10 = new androidx.room.support.AutoCloser
                long r11 = r0.autoCloseTimeout
                java.util.concurrent.TimeUnit r13 = r0.autoCloseTimeUnit
                if (r13 == 0) goto L85
                r15 = 4
                r16 = 0
                r14 = 0
                r10.<init>(r11, r13, r14, r15, r16)
                androidx.room.support.AutoClosingRoomOpenHelperFactory r9 = new androidx.room.support.AutoClosingRoomOpenHelperFactory
                r9.<init>(r1, r10)
                r1 = r9
                goto L93
            L85:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>(r6)
                throw r1
            L8b:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot create auto-closing database for an in-memory database."
                r1.<init>(r2)
                throw r1
            L93:
                if (r4 == 0) goto Lc8
                java.lang.String r9 = r0.name
                if (r9 == 0) goto Lc0
                java.lang.String r9 = r0.copyFromAssetPath
                if (r9 != 0) goto L9f
                r10 = 0
                goto La0
            L9f:
                r10 = 1
            La0:
                java.io.File r11 = r0.copyFromFile
                if (r11 != 0) goto La6
                r12 = 0
                goto La7
            La6:
                r12 = 1
            La7:
                java.util.concurrent.Callable<java.io.InputStream> r13 = r0.copyFromInputStream
                if (r13 != 0) goto Lac
                goto Lad
            Lac:
                r7 = 1
            Lad:
                int r10 = r10 + r12
                int r10 = r10 + r7
                if (r10 != r8) goto Lb8
                androidx.room.support.PrePackagedCopyOpenHelperFactory r7 = new androidx.room.support.PrePackagedCopyOpenHelperFactory
                r7.<init>(r9, r11, r13, r1)
                r1 = r7
                goto Lc8
            Lb8:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "More than one of createFromAsset(), createFromInputStream(), and createFromFile() were called on this Builder, but the database can only be created using one of the three configurations."
                r1.<init>(r2)
                throw r1
            Lc0:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Cannot create from asset or file for an in-memory database."
                r1.<init>(r2)
                throw r1
            Lc8:
                if (r5 == 0) goto Lf4
                java.util.concurrent.Executor r7 = r0.queryCallbackExecutor
                if (r7 == 0) goto Ld5
                kotlinx.coroutines.m0 r7 = kotlinx.coroutines.v1.c(r7)
                if (r7 == 0) goto Ld5
                goto Ld9
            Ld5:
                kotlin.coroutines.i r7 = r0.queryCallbackCoroutineContext
                if (r7 == 0) goto Lee
            Ld9:
                androidx.room.support.QueryInterceptorOpenHelperFactory r8 = new androidx.room.support.QueryInterceptorOpenHelperFactory
                kotlinx.coroutines.r0 r7 = kotlinx.coroutines.s0.a(r7)
                androidx.room.RoomDatabase$QueryCallback r9 = r0.queryCallback
                if (r9 == 0) goto Le8
                r8.<init>(r1, r7, r9)
                r1 = r8
                goto Lf4
            Le8:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>(r6)
                throw r1
            Lee:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>(r6)
                throw r1
            Lf4:
                r10 = r1
                goto Lf7
            Lf6:
                r10 = 0
            Lf7:
                if (r10 != 0) goto L118
                if (r3 != 0) goto L110
                if (r4 != 0) goto L108
                if (r5 != 0) goto L100
                goto L118
            L100:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Query Callback is not supported when an SQLiteDriver is configured."
                r1.<init>(r2)
                throw r1
            L108:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Pre-Package Database is not supported when an SQLiteDriver is configured."
                r1.<init>(r2)
                throw r1
            L110:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "Auto Closing Database is not supported when an SQLiteDriver is configured."
                r1.<init>(r2)
                throw r1
            L118:
                androidx.room.DatabaseConfiguration r7 = new androidx.room.DatabaseConfiguration
                android.content.Context r8 = r0.context
                java.lang.String r9 = r0.name
                androidx.room.RoomDatabase$MigrationContainer r11 = r0.migrationContainer
                java.util.List<androidx.room.RoomDatabase$Callback> r12 = r0.callbacks
                boolean r13 = r0.allowMainThreadQueries
                androidx.room.RoomDatabase$JournalMode r1 = r0.journalMode
                androidx.room.RoomDatabase$JournalMode r14 = r1.resolve$room_runtime_release(r8)
                java.util.concurrent.Executor r15 = r0.queryExecutor
                if (r15 == 0) goto L194
                java.util.concurrent.Executor r1 = r0.transactionExecutor
                if (r1 == 0) goto L18e
                android.content.Intent r3 = r0.multiInstanceInvalidationIntent
                boolean r4 = r0.requireMigration
                boolean r5 = r0.allowDestructiveMigrationOnDowngrade
                java.util.Set<java.lang.Integer> r6 = r0.migrationsNotRequiredFrom
                java.lang.String r2 = r0.copyFromAssetPath
                r16 = r1
                java.io.File r1 = r0.copyFromFile
                r22 = r1
                java.util.concurrent.Callable<java.io.InputStream> r1 = r0.copyFromInputStream
                r23 = r1
                androidx.room.RoomDatabase$PrepackagedDatabaseCallback r1 = r0.prepackagedDatabaseCallback
                r24 = r1
                java.util.List<java.lang.Object> r1 = r0.typeConverters
                r25 = r1
                java.util.List<androidx.room.migration.AutoMigrationSpec> r1 = r0.autoMigrationSpecs
                r26 = r1
                boolean r1 = r0.allowDestructiveMigrationForAllTables
                r27 = r1
                androidx.sqlite.SQLiteDriver r1 = r0.driver
                r28 = r1
                kotlin.coroutines.i r1 = r0.queryCoroutineContext
                r29 = r1
                r21 = r2
                r17 = r3
                r18 = r4
                r19 = r5
                r20 = r6
                r7.<init>(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
                boolean r1 = r0.inMemoryTrackingTableMode
                r7.setUseTempTrackingTable$room_runtime_release(r1)
                kotlin.jvm.functions.Function0<T extends androidx.room.RoomDatabase> r1 = r0.factory
                if (r1 == 0) goto L17c
                java.lang.Object r1 = r1.invoke()
                androidx.room.RoomDatabase r1 = (androidx.room.RoomDatabase) r1
                if (r1 != 0) goto L18a
            L17c:
                kotlin.reflect.d<T extends androidx.room.RoomDatabase> r1 = r0.klass
                java.lang.Class r1 = k3.a.e(r1)
                r2 = 2
                r3 = 0
                java.lang.Object r1 = androidx.room.util.KClassUtil.findAndInstantiateDatabaseImpl$default(r1, r3, r2, r3)
                androidx.room.RoomDatabase r1 = (androidx.room.RoomDatabase) r1
            L18a:
                r1.init(r7)
                return r1
            L18e:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>(r6)
                throw r1
            L194:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                r1.<init>(r6)
                throw r1
            L19a:
                java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
                java.lang.String r2 = "A RoomDatabase cannot be configured with both a SQLiteDriver and a SupportOpenHelper.Factory."
                r1.<init>(r2)
                throw r1
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> createFromAsset(@org.jetbrains.annotations.NotNull java.lang.String r2) {
                r1 = this;
                java.lang.String r0 = "databaseFilePath"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.copyFromAssetPath = r2
                return r1
        }

        @android.annotation.SuppressLint({"BuilderSetStyle"})
        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> createFromAsset(@org.jetbrains.annotations.NotNull java.lang.String r2, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.PrepackagedDatabaseCallback r3) {
                r1 = this;
                java.lang.String r0 = "databaseFilePath"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.prepackagedDatabaseCallback = r3
                r1.copyFromAssetPath = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> createFromFile(@org.jetbrains.annotations.NotNull java.io.File r2) {
                r1 = this;
                java.lang.String r0 = "databaseFile"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.copyFromFile = r2
                return r1
        }

        @android.annotation.SuppressLint({"BuilderSetStyle", "StreamFiles"})
        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> createFromFile(@org.jetbrains.annotations.NotNull java.io.File r2, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.PrepackagedDatabaseCallback r3) {
                r1 = this;
                java.lang.String r0 = "databaseFile"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.prepackagedDatabaseCallback = r3
                r1.copyFromFile = r2
                return r1
        }

        @android.annotation.SuppressLint({"BuilderSetStyle"})
        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> createFromInputStream(@org.jetbrains.annotations.NotNull java.util.concurrent.Callable<java.io.InputStream> r2) {
                r1 = this;
                java.lang.String r0 = "inputStreamCallable"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.copyFromInputStream = r2
                return r1
        }

        @android.annotation.SuppressLint({"BuilderSetStyle", "LambdaLast"})
        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> createFromInputStream(@org.jetbrains.annotations.NotNull java.util.concurrent.Callable<java.io.InputStream> r2, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.PrepackagedDatabaseCallback r3) {
                r1 = this;
                java.lang.String r0 = "inputStreamCallable"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "callback"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.prepackagedDatabaseCallback = r3
                r1.copyFromInputStream = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> enableMultiInstanceInvalidation() {
                r3 = this;
                java.lang.String r0 = r3.name
                if (r0 == 0) goto Le
                android.content.Intent r0 = new android.content.Intent
                android.content.Context r1 = r3.context
                java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
                r0.<init>(r1, r2)
                goto Lf
            Le:
                r0 = 0
            Lf:
                r3.multiInstanceInvalidationIntent = r0
                return r3
        }

        @kotlin.Deprecated(message = "Replace by overloaded version with parameter to indicate if all tables should be dropped or not.", replaceWith = @kotlin.ReplaceWith(expression = "fallbackToDestructiveMigration(false)", imports = {}))
        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigration() {
                r1 = this;
                r0 = 0
                r1.requireMigration = r0
                r0 = 1
                r1.allowDestructiveMigrationOnDowngrade = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigration(boolean r2) {
                r1 = this;
                r0 = 0
                r1.requireMigration = r0
                r0 = 1
                r1.allowDestructiveMigrationOnDowngrade = r0
                r1.allowDestructiveMigrationForAllTables = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigrationFrom(boolean r5, @org.jetbrains.annotations.NotNull int... r6) {
                r4 = this;
                java.lang.String r0 = "startVersions"
                kotlin.jvm.internal.g0.p(r6, r0)
                int r0 = r6.length
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                r2 = r6[r1]
                java.util.Set<java.lang.Integer> r3 = r4.migrationsNotRequiredFrom
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.add(r2)
                int r1 = r1 + 1
                goto L7
            L17:
                r4.allowDestructiveMigrationForAllTables = r5
                return r4
        }

        @kotlin.Deprecated(message = "Replace by overloaded version with parameter to indicate if all tables should be dropped or not.", replaceWith = @kotlin.ReplaceWith(expression = "fallbackToDestructiveMigrationFrom(false, startVersions)", imports = {}))
        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigrationFrom(@org.jetbrains.annotations.NotNull int... r5) {
                r4 = this;
                java.lang.String r0 = "startVersions"
                kotlin.jvm.internal.g0.p(r5, r0)
                int r0 = r5.length
                r1 = 0
            L7:
                if (r1 >= r0) goto L17
                r2 = r5[r1]
                java.util.Set<java.lang.Integer> r3 = r4.migrationsNotRequiredFrom
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                r3.add(r2)
                int r1 = r1 + 1
                goto L7
            L17:
                return r4
        }

        @kotlin.Deprecated(message = "Replace by overloaded version with parameter to indicate if all tables should be dropped or not.", replaceWith = @kotlin.ReplaceWith(expression = "fallbackToDestructiveMigrationOnDowngrade(false)", imports = {}))
        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigrationOnDowngrade() {
                r1 = this;
                r0 = 1
                r1.requireMigration = r0
                r1.allowDestructiveMigrationOnDowngrade = r0
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.room.RoomDatabase.Builder<T> fallbackToDestructiveMigrationOnDowngrade(boolean r2) {
                r1 = this;
                r0 = 1
                r1.requireMigration = r0
                r1.allowDestructiveMigrationOnDowngrade = r0
                r1.allowDestructiveMigrationForAllTables = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> openHelperFactory(@org.jetbrains.annotations.Nullable androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r1) {
                r0 = this;
                r0.supportOpenHelperFactory = r1
                return r0
        }

        @androidx.room.ExperimentalRoomApi
        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> setAutoCloseTimeout(@androidx.annotation.IntRange(from = 0) long r4, @org.jetbrains.annotations.NotNull java.util.concurrent.TimeUnit r6) {
                r3 = this;
                java.lang.String r0 = "autoCloseTimeUnit"
                kotlin.jvm.internal.g0.p(r6, r0)
                r0 = 0
                int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r2 < 0) goto L10
                r3.autoCloseTimeout = r4
                r3.autoCloseTimeUnit = r6
                return r3
            L10:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                java.lang.String r5 = "autoCloseTimeout must be >= 0"
                r4.<init>(r5)
                throw r4
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.room.RoomDatabase.Builder<T> setDriver(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteDriver r2) {
                r1 = this;
                java.lang.String r0 = "driver"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.driver = r2
                return r1
        }

        @androidx.room.ExperimentalRoomApi
        @org.jetbrains.annotations.NotNull
        public final androidx.room.RoomDatabase.Builder<T> setInMemoryTrackingMode(boolean r1) {
                r0 = this;
                r0.inMemoryTrackingTableMode = r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> setJournalMode(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r2) {
                r1 = this;
                java.lang.String r0 = "journalMode"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.journalMode = r2
                return r1
        }

        @androidx.room.ExperimentalRoomApi
        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> setMultiInstanceInvalidationServiceIntent(@org.jetbrains.annotations.NotNull android.content.Intent r2) {
                r1 = this;
                java.lang.String r0 = "invalidationServiceIntent"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = r1.name
                if (r0 == 0) goto La
                goto Lb
            La:
                r2 = 0
            Lb:
                r1.multiInstanceInvalidationIntent = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> setQueryCallback(@org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.QueryCallback r2, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r3) {
                r1 = this;
                java.lang.String r0 = "queryCallback"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "executor"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.queryCallback = r2
                r1.queryCallbackExecutor = r3
                r2 = 0
                r1.queryCallbackCoroutineContext = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.room.RoomDatabase.Builder<T> setQueryCallback(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.QueryCallback r3) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "queryCallback"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.queryCallback = r3
                r3 = 0
                r1.queryCallbackExecutor = r3
                r1.queryCallbackCoroutineContext = r2
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.room.RoomDatabase.Builder<T> setQueryCoroutineContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.util.concurrent.Executor r0 = r1.queryExecutor
                if (r0 != 0) goto L20
                java.util.concurrent.Executor r0 = r1.transactionExecutor
                if (r0 != 0) goto L20
                kotlin.coroutines.f$b r0 = kotlin.coroutines.f.o0
                kotlin.coroutines.i$b r0 = r2.get(r0)
                if (r0 == 0) goto L18
                r1.queryCoroutineContext = r2
                return r1
            L18:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "It is required that the coroutine context contain a dispatcher."
                r2.<init>(r0)
                throw r2
            L20:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "This builder has already been configured with an Executor. A RoomDatabase canonly be configured with either an Executor or a CoroutineContext."
                r2.<init>(r0)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> setQueryExecutor(@org.jetbrains.annotations.NotNull java.util.concurrent.Executor r2) {
                r1 = this;
                java.lang.String r0 = "executor"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.coroutines.i r0 = r1.queryCoroutineContext
                if (r0 != 0) goto Lc
                r1.queryExecutor = r2
                return r1
            Lc:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext."
                r2.<init>(r0)
                throw r2
        }

        @org.jetbrains.annotations.NotNull
        public androidx.room.RoomDatabase.Builder<T> setTransactionExecutor(@org.jetbrains.annotations.NotNull java.util.concurrent.Executor r2) {
                r1 = this;
                java.lang.String r0 = "executor"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.coroutines.i r0 = r1.queryCoroutineContext
                if (r0 != 0) goto Lc
                r1.transactionExecutor = r2
                return r1
            Lc:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "This builder has already been configured with a CoroutineContext. A RoomDatabasecan only be configured with either an Executor or a CoroutineContext."
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class Callback {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onCreate(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r2 instanceof androidx.room.driver.SupportSQLiteConnection
                if (r0 == 0) goto L12
                androidx.room.driver.SupportSQLiteConnection r2 = (androidx.room.driver.SupportSQLiteConnection) r2
                androidx.sqlite.db.SupportSQLiteDatabase r2 = r2.getDb()
                r1.onCreate(r2)
            L12:
                return
        }

        public void onCreate(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        public void onDestructiveMigration(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r2 instanceof androidx.room.driver.SupportSQLiteConnection
                if (r0 == 0) goto L12
                androidx.room.driver.SupportSQLiteConnection r2 = (androidx.room.driver.SupportSQLiteConnection) r2
                androidx.sqlite.db.SupportSQLiteDatabase r2 = r2.getDb()
                r1.onDestructiveMigration(r2)
            L12:
                return
        }

        public void onDestructiveMigration(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }

        public void onOpen(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
                r1 = this;
                java.lang.String r0 = "connection"
                kotlin.jvm.internal.g0.p(r2, r0)
                boolean r0 = r2 instanceof androidx.room.driver.SupportSQLiteConnection
                if (r0 == 0) goto L12
                androidx.room.driver.SupportSQLiteConnection r2 = (androidx.room.driver.SupportSQLiteConnection) r2
                androidx.sqlite.db.SupportSQLiteDatabase r2 = r2.getDb()
                r1.onOpen(r2)
            L12:
                return
        }

        public void onOpen(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }
    }

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
    public enum JournalMode extends java.lang.Enum<androidx.room.RoomDatabase.JournalMode> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ androidx.room.RoomDatabase.JournalMode[] $VALUES = null;
        public static final androidx.room.RoomDatabase.JournalMode AUTOMATIC = null;
        public static final androidx.room.RoomDatabase.JournalMode TRUNCATE = null;
        public static final androidx.room.RoomDatabase.JournalMode WRITE_AHEAD_LOGGING = null;

        private static final /* synthetic */ androidx.room.RoomDatabase.JournalMode[] $values() {
                r0 = 3
                androidx.room.RoomDatabase$JournalMode[] r0 = new androidx.room.RoomDatabase.JournalMode[r0]
                androidx.room.RoomDatabase$JournalMode r1 = androidx.room.RoomDatabase.JournalMode.AUTOMATIC
                r2 = 0
                r0[r2] = r1
                androidx.room.RoomDatabase$JournalMode r1 = androidx.room.RoomDatabase.JournalMode.TRUNCATE
                r2 = 1
                r0[r2] = r1
                androidx.room.RoomDatabase$JournalMode r1 = androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                androidx.room.RoomDatabase$JournalMode r0 = new androidx.room.RoomDatabase$JournalMode
                java.lang.String r1 = "AUTOMATIC"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.room.RoomDatabase.JournalMode.AUTOMATIC = r0
                androidx.room.RoomDatabase$JournalMode r0 = new androidx.room.RoomDatabase$JournalMode
                java.lang.String r1 = "TRUNCATE"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.room.RoomDatabase.JournalMode.TRUNCATE = r0
                androidx.room.RoomDatabase$JournalMode r0 = new androidx.room.RoomDatabase$JournalMode
                java.lang.String r1 = "WRITE_AHEAD_LOGGING"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING = r0
                androidx.room.RoomDatabase$JournalMode[] r0 = $values()
                androidx.room.RoomDatabase.JournalMode.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                androidx.room.RoomDatabase.JournalMode.$ENTRIES = r0
                return
        }

        JournalMode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.enums.a<androidx.room.RoomDatabase.JournalMode> getEntries() {
                kotlin.enums.a r0 = androidx.room.RoomDatabase.JournalMode.$ENTRIES
                return r0
        }

        public static androidx.room.RoomDatabase.JournalMode valueOf(java.lang.String r1) {
                java.lang.Class<androidx.room.RoomDatabase$JournalMode> r0 = androidx.room.RoomDatabase.JournalMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.room.RoomDatabase$JournalMode r1 = (androidx.room.RoomDatabase.JournalMode) r1
                return r1
        }

        public static androidx.room.RoomDatabase.JournalMode[] values() {
                androidx.room.RoomDatabase$JournalMode[] r0 = androidx.room.RoomDatabase.JournalMode.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.room.RoomDatabase$JournalMode[] r0 = (androidx.room.RoomDatabase.JournalMode[]) r0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final androidx.room.RoomDatabase.JournalMode resolve$room_runtime_release(@org.jetbrains.annotations.NotNull android.content.Context r2) {
                r1 = this;
                java.lang.String r0 = "context"
                kotlin.jvm.internal.g0.p(r2, r0)
                androidx.room.RoomDatabase$JournalMode r0 = androidx.room.RoomDatabase.JournalMode.AUTOMATIC
                if (r1 == r0) goto La
                return r1
            La:
                java.lang.String r0 = "activity"
                java.lang.Object r2 = r2.getSystemService(r0)
                boolean r0 = r2 instanceof android.app.ActivityManager
                if (r0 == 0) goto L17
                android.app.ActivityManager r2 = (android.app.ActivityManager) r2
                goto L18
            L17:
                r2 = 0
            L18:
                if (r2 == 0) goto L23
                boolean r2 = r2.isLowRamDevice()
                if (r2 != 0) goto L23
                androidx.room.RoomDatabase$JournalMode r2 = androidx.room.RoomDatabase.JournalMode.WRITE_AHEAD_LOGGING
                return r2
            L23:
                androidx.room.RoomDatabase$JournalMode r2 = androidx.room.RoomDatabase.JournalMode.TRUNCATE
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$MigrationContainer\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,2151:1\n13402#2,2:2152\n1863#3,2:2154\n381#4,7:2156\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabase$MigrationContainer\n*L\n1788#1:2152,2\n1798#1:2154,2\n1811#1:2156,7\n*E\n"})
    public static class MigrationContainer {

        @org.jetbrains.annotations.NotNull
        private final java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> migrations;

        public MigrationContainer() {
                r1 = this;
                r1.<init>()
                java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
                r0.<init>()
                r1.migrations = r0
                return
        }

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
        public final void addMigration(@org.jetbrains.annotations.NotNull androidx.room.migration.Migration r5) {
                r4 = this;
                java.lang.String r0 = "migration"
                kotlin.jvm.internal.g0.p(r5, r0)
                int r0 = r5.startVersion
                int r1 = r5.endVersion
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> r2 = r4.migrations
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
                java.lang.Object r3 = r2.get(r0)
                if (r3 != 0) goto L1d
                java.util.TreeMap r3 = new java.util.TreeMap
                r3.<init>()
                r2.put(r0, r3)
            L1d:
                java.util.TreeMap r3 = (java.util.TreeMap) r3
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                boolean r0 = r3.containsKey(r0)
                if (r0 == 0) goto L37
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                java.lang.Object r0 = r3.get(r0)
                java.util.Objects.toString(r0)
                r5.toString()
            L37:
                java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
                r3.put(r0, r5)
                return
        }

        public void addMigrations(@org.jetbrains.annotations.NotNull java.util.List<? extends androidx.room.migration.Migration> r2) {
                r1 = this;
                java.lang.String r0 = "migrations"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Iterable r2 = (java.lang.Iterable) r2
                java.util.Iterator r2 = r2.iterator()
            Lb:
                boolean r0 = r2.hasNext()
                if (r0 == 0) goto L1b
                java.lang.Object r0 = r2.next()
                androidx.room.migration.Migration r0 = (androidx.room.migration.Migration) r0
                r1.addMigration(r0)
                goto Lb
            L1b:
                return
        }

        public void addMigrations(@org.jetbrains.annotations.NotNull androidx.room.migration.Migration... r4) {
                r3 = this;
                java.lang.String r0 = "migrations"
                kotlin.jvm.internal.g0.p(r4, r0)
                int r0 = r4.length
                r1 = 0
            L7:
                if (r1 >= r0) goto L11
                r2 = r4[r1]
                r3.addMigration(r2)
                int r1 = r1 + 1
                goto L7
            L11:
                return
        }

        public final boolean contains(int r1, int r2) {
                r0 = this;
                boolean r1 = androidx.room.util.MigrationUtil.contains(r0, r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public java.util.List<androidx.room.migration.Migration> findMigrationPath(int r1, int r2) {
                r0 = this;
                java.util.List r1 = androidx.room.util.MigrationUtil.findMigrationPath(r0, r1, r2)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public java.util.Map<java.lang.Integer, java.util.Map<java.lang.Integer, androidx.room.migration.Migration>> getMigrations() {
                r1 = this;
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> r0 = r1.migrations
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.Pair<java.util.Map<java.lang.Integer, androidx.room.migration.Migration>, java.lang.Iterable<java.lang.Integer>> getSortedDescendingNodes$room_runtime_release(int r2) {
                r1 = this;
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> r0 = r1.migrations
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object r2 = r0.get(r2)
                java.util.TreeMap r2 = (java.util.TreeMap) r2
                if (r2 != 0) goto L10
                r2 = 0
                return r2
            L10:
                java.util.NavigableSet r0 = r2.descendingKeySet()
                kotlin.Pair r2 = kotlin.o0.a(r2, r0)
                return r2
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.Pair<java.util.Map<java.lang.Integer, androidx.room.migration.Migration>, java.lang.Iterable<java.lang.Integer>> getSortedNodes$room_runtime_release(int r2) {
                r1 = this;
                java.util.Map<java.lang.Integer, java.util.TreeMap<java.lang.Integer, androidx.room.migration.Migration>> r0 = r1.migrations
                java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                java.lang.Object r2 = r0.get(r2)
                java.util.TreeMap r2 = (java.util.TreeMap) r2
                if (r2 != 0) goto L10
                r2 = 0
                return r2
            L10:
                java.util.Set r0 = r2.keySet()
                kotlin.Pair r2 = kotlin.o0.a(r2, r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class PrepackagedDatabaseCallback {
        public PrepackagedDatabaseCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onOpenPrepackagedDatabase(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
                r1 = this;
                java.lang.String r0 = "db"
                kotlin.jvm.internal.g0.p(r2, r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface QueryCallback {
        void onQuery(@org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Object> r2);
    }

    static {
            androidx.room.RoomDatabase$Companion r0 = new androidx.room.RoomDatabase$Companion
            r1 = 0
            r0.<init>(r1)
            androidx.room.RoomDatabase.Companion = r0
            return
    }

    public RoomDatabase() {
            r2 = this;
            r2.<init>()
            androidx.room.concurrent.CloseBarrier r0 = new androidx.room.concurrent.CloseBarrier
            androidx.room.RoomDatabase$closeBarrier$1 r1 = new androidx.room.RoomDatabase$closeBarrier$1
            r1.<init>(r2)
            r0.<init>(r1)
            r2.closeBarrier = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            r2.suspendingTransactionId = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r2.typeConverters = r0
            r0 = 1
            r2.useTempTrackingTable = r0
            return
    }

    public static /* synthetic */ java.lang.Object a(kotlin.jvm.functions.Function0 r0, androidx.sqlite.SQLiteConnection r1) {
            java.lang.Object r0 = runInTransaction$lambda$12(r0, r1)
            return r0
    }

    public static final /* synthetic */ androidx.room.RoomConnectionManager access$getConnectionManager$p(androidx.room.RoomDatabase r0) {
            androidx.room.RoomConnectionManager r0 = r0.connectionManager
            return r0
    }

    public static final /* synthetic */ void access$onClosed(androidx.room.RoomDatabase r0) {
            r0.onClosed()
            return
    }

    public static /* synthetic */ java.lang.Object b(java.util.concurrent.Callable r0) {
            java.lang.Object r0 = runInTransaction$lambda$11(r0)
            return r0
    }

    private static final kotlin.n1 beginTransaction$lambda$8(androidx.room.RoomDatabase r1, androidx.sqlite.db.SupportSQLiteDatabase r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.internalBeginTransaction()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ kotlin.n1 c(androidx.room.RoomDatabase r0, androidx.sqlite.db.SupportSQLiteDatabase r1) {
            kotlin.n1 r0 = beginTransaction$lambda$8(r0, r1)
            return r0
    }

    private static final androidx.sqlite.db.SupportSQLiteOpenHelper createConnectionManager$lambda$1(androidx.room.RoomDatabase r1, androidx.room.DatabaseConfiguration r2) {
            java.lang.String r0 = "config"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.sqlite.db.SupportSQLiteOpenHelper r1 = r1.createOpenHelper(r2)
            return r1
    }

    public static /* synthetic */ kotlin.n1 d(java.lang.Runnable r0) {
            kotlin.n1 r0 = runInTransaction$lambda$10(r0)
            return r0
    }

    public static /* synthetic */ kotlin.n1 e(androidx.room.RoomDatabase r0, androidx.sqlite.db.SupportSQLiteDatabase r1) {
            kotlin.n1 r0 = endTransaction$lambda$9(r0, r1)
            return r0
    }

    private static final kotlin.n1 endTransaction$lambda$9(androidx.room.RoomDatabase r1, androidx.sqlite.db.SupportSQLiteDatabase r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.internalEndTransaction()
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public static /* synthetic */ androidx.sqlite.db.SupportSQLiteOpenHelper f(androidx.room.RoomDatabase r0, androidx.room.DatabaseConfiguration r1) {
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = createConnectionManager$lambda$1(r0, r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This property is always null and will be removed in a future version.")
    protected static /* synthetic */ void getMCallbacks$annotations() {
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "This property is always null and will be removed in a future version.")
    protected static /* synthetic */ void getMDatabase$annotations() {
            return
    }

    private final void internalBeginTransaction() {
            r2 = this;
            r2.assertNotMainThread()
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r2.getOpenHelper()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            boolean r1 = r0.inTransaction()
            if (r1 != 0) goto L18
            androidx.room.InvalidationTracker r1 = r2.getInvalidationTracker()
            r1.syncBlocking$room_runtime_release()
        L18:
            boolean r1 = r0.isWriteAheadLoggingEnabled()
            if (r1 == 0) goto L22
            r0.beginTransactionNonExclusive()
            return
        L22:
            r0.beginTransaction()
            return
    }

    private final void internalEndTransaction() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.getOpenHelper()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            r0.endTransaction()
            boolean r0 = r1.inTransaction()
            if (r0 != 0) goto L18
            androidx.room.InvalidationTracker r0 = r1.getInvalidationTracker()
            r0.refreshVersionsAsync()
        L18:
            return
    }

    private final void onClosed() {
            r3 = this;
            kotlinx.coroutines.r0 r0 = r3.coroutineScope
            r1 = 0
            if (r0 != 0) goto Lb
            java.lang.String r0 = "coroutineScope"
            kotlin.jvm.internal.g0.S(r0)
            r0 = r1
        Lb:
            r2 = 1
            kotlinx.coroutines.s0.f(r0, r1, r2, r1)
            androidx.room.InvalidationTracker r0 = r3.getInvalidationTracker()
            r0.stop$room_runtime_release()
            androidx.room.RoomConnectionManager r0 = r3.connectionManager
            if (r0 != 0) goto L20
            java.lang.String r0 = "connectionManager"
            kotlin.jvm.internal.g0.S(r0)
            goto L21
        L20:
            r1 = r0
        L21:
            r1.close()
            return
    }

    public static /* synthetic */ android.database.Cursor query$default(androidx.room.RoomDatabase r0, androidx.sqlite.db.SupportSQLiteQuery r1, android.os.CancellationSignal r2, int r3, java.lang.Object r4) {
            if (r4 != 0) goto Lc
            r3 = r3 & 2
            if (r3 == 0) goto L7
            r2 = 0
        L7:
            android.database.Cursor r0 = r0.query(r1, r2)
            return r0
        Lc:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: query"
            r0.<init>(r1)
            throw r0
    }

    private final <T> T runInTransaction(kotlin.jvm.functions.Function0<? extends T> r3) {
            r2 = this;
            boolean r0 = r2.inCompatibilityMode$room_runtime_release()
            if (r0 == 0) goto L19
            r2.beginTransaction()
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L14
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L14
            r2.endTransaction()
            return r3
        L14:
            r3 = move-exception
            r2.endTransaction()
            throw r3
        L19:
            androidx.room.m r0 = new androidx.room.m
            r0.<init>(r3)
            r3 = 0
            r1 = 1
            java.lang.Object r3 = androidx.room.util.DBUtil.performBlocking(r2, r3, r1, r0)
            return r3
    }

    private static final kotlin.n1 runInTransaction$lambda$10(java.lang.Runnable r0) {
            r0.run()
            kotlin.n1 r0 = kotlin.n1.a
            return r0
    }

    private static final java.lang.Object runInTransaction$lambda$11(java.util.concurrent.Callable r0) {
            java.lang.Object r0 = r0.call()
            return r0
    }

    private static final java.lang.Object runInTransaction$lambda$12(kotlin.jvm.functions.Function0 r1, androidx.sqlite.SQLiteConnection r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r1 = r1.invoke()
            return r1
    }

    private final /* synthetic */ <T extends androidx.sqlite.db.SupportSQLiteOpenHelper> T unwrapOpenHelper(androidx.sqlite.db.SupportSQLiteOpenHelper r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            r1 = 3
            java.lang.String r2 = "T"
            kotlin.jvm.internal.g0.y(r1, r2)
            boolean r1 = androidx.activity.k.a(r4)
            if (r1 == 0) goto L11
            return r4
        L11:
            boolean r1 = r4 instanceof androidx.room.DelegatingOpenHelper
            if (r1 == 0) goto L1c
            androidx.room.DelegatingOpenHelper r4 = (androidx.room.DelegatingOpenHelper) r4
            androidx.sqlite.db.SupportSQLiteOpenHelper r4 = r4.getDelegate()
            goto L4
        L1c:
            return r0
    }

    public final void addTypeConverter$room_runtime_release(@org.jetbrains.annotations.NotNull kotlin.reflect.d<?> r2, @org.jetbrains.annotations.NotNull java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "kclass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "converter"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Map<kotlin.reflect.d<?>, java.lang.Object> r0 = r1.typeConverters
            r0.put(r2, r3)
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotMainThread() {
            r2 = this;
            boolean r0 = r2.allowMainThreadQueries
            if (r0 == 0) goto L5
            goto Lb
        L5:
            boolean r0 = r2.isMainThread$room_runtime_release()
            if (r0 != 0) goto Lc
        Lb:
            return
        Lc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot access database on the main thread since it may potentially lock the UI for a long period of time."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public void assertNotSuspendingTransaction() {
            r2 = this;
            boolean r0 = r2.inCompatibilityMode$room_runtime_release()
            if (r0 == 0) goto L1d
            boolean r0 = r2.inTransaction()
            if (r0 != 0) goto L1d
            java.lang.ThreadLocal<java.lang.Integer> r0 = r2.suspendingTransactionId
            java.lang.Object r0 = r0.get()
            if (r0 != 0) goto L15
            goto L1d
        L15:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot access database on a different coroutine context inherited from a suspending transaction."
            r0.<init>(r1)
            throw r0
        L1d:
            return
    }

    @kotlin.Deprecated(message = "beginTransaction() is deprecated", replaceWith = @kotlin.ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void beginTransaction() {
            r2 = this;
            r2.assertNotMainThread()
            androidx.room.support.AutoCloser r0 = r2.autoCloser
            if (r0 != 0) goto Lb
            r2.internalBeginTransaction()
            return
        Lb:
            androidx.room.o r1 = new androidx.room.o
            r1.<init>(r2)
            r0.executeRefCountingFunction(r1)
            return
    }

    @androidx.annotation.WorkerThread
    public abstract void clearAllTables();

    public void close() {
            r1 = this;
            androidx.room.concurrent.CloseBarrier r0 = r1.closeBarrier
            r0.close$room_runtime_release()
            return
    }

    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteStatement compileStatement(@org.jetbrains.annotations.NotNull java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "sql"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.assertNotMainThread()
            r1.assertNotSuspendingTransaction()
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.getOpenHelper()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            androidx.sqlite.db.SupportSQLiteStatement r2 = r0.compileStatement(r2)
            return r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public java.util.List<androidx.room.migration.Migration> createAutoMigrations(@org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.d<? extends androidx.room.migration.AutoMigrationSpec>, ? extends androidx.room.migration.AutoMigrationSpec> r4) {
            r3 = this;
            java.lang.String r0 = "autoMigrationSpecs"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            int r1 = r4.size()
            int r1 = kotlin.collections.i1.j(r1)
            r0.<init>(r1)
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L1a:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L38
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            kotlin.reflect.d r2 = (kotlin.reflect.d) r2
            java.lang.Class r2 = k3.a.e(r2)
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L1a
        L38:
            java.util.List r4 = r3.getAutoMigrations(r0)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.room.RoomConnectionManager createConnectionManager$room_runtime_release(@org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r3) {
            r2 = this;
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.RoomOpenDelegateMarker r0 = r2.createOpenDelegate()     // Catch: kotlin.NotImplementedError -> L11
            java.lang.String r1 = "null cannot be cast to non-null type androidx.room.RoomOpenDelegate"
            kotlin.jvm.internal.g0.n(r0, r1)     // Catch: kotlin.NotImplementedError -> L11
            androidx.room.RoomOpenDelegate r0 = (androidx.room.RoomOpenDelegate) r0     // Catch: kotlin.NotImplementedError -> L11
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 != 0) goto L1f
            androidx.room.RoomConnectionManager r0 = new androidx.room.RoomConnectionManager
            androidx.room.n r1 = new androidx.room.n
            r1.<init>(r2)
            r0.<init>(r3, r1)
            goto L25
        L1f:
            androidx.room.RoomConnectionManager r1 = new androidx.room.RoomConnectionManager
            r1.<init>(r3, r0)
            r0 = r1
        L25:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected abstract androidx.room.InvalidationTracker createInvalidationTracker();

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    protected androidx.room.RoomOpenDelegateMarker createOpenDelegate() {
            r3 = this;
            kotlin.NotImplementedError r0 = new kotlin.NotImplementedError
            r1 = 0
            r2 = 1
            r0.<init>(r1, r2, r1)
            throw r0
    }

    @kotlin.Deprecated(message = "No longer implemented by generated")
    @org.jetbrains.annotations.NotNull
    protected androidx.sqlite.db.SupportSQLiteOpenHelper createOpenHelper(@org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r3) {
            r2 = this;
            java.lang.String r0 = "config"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.NotImplementedError r3 = new kotlin.NotImplementedError
            r0 = 0
            r1 = 1
            r3.<init>(r0, r1, r0)
            throw r3
    }

    @kotlin.Deprecated(message = "endTransaction() is deprecated", replaceWith = @kotlin.ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void endTransaction() {
            r2 = this;
            androidx.room.support.AutoCloser r0 = r2.autoCloser
            if (r0 != 0) goto L8
            r2.internalEndTransaction()
            return
        L8:
            androidx.room.k r1 = new androidx.room.k
            r1.<init>(r2)
            r0.executeRefCountingFunction(r1)
            return
    }

    @kotlin.jvm.JvmSuppressWildcards
    @org.jetbrains.annotations.NotNull
    @kotlin.Deprecated(message = "No longer implemented by generated")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public java.util.List<androidx.room.migration.Migration> getAutoMigrations(@org.jetbrains.annotations.NotNull java.util.Map<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>, androidx.room.migration.AutoMigrationSpec> r2) {
            r1 = this;
            java.lang.String r0 = "autoMigrationSpecs"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r2 = kotlin.collections.f0.J()
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final androidx.room.concurrent.CloseBarrier getCloseBarrier$room_runtime_release() {
            r1 = this;
            androidx.room.concurrent.CloseBarrier r0 = r1.closeBarrier
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.r0 getCoroutineScope() {
            r1 = this;
            kotlinx.coroutines.r0 r0 = r1.coroutineScope
            if (r0 != 0) goto La
            java.lang.String r0 = "coroutineScope"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public androidx.room.InvalidationTracker getInvalidationTracker() {
            r1 = this;
            androidx.room.InvalidationTracker r0 = r1.internalTracker
            if (r0 != 0) goto La
            java.lang.String r0 = "internalTracker"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public androidx.sqlite.db.SupportSQLiteOpenHelper getOpenHelper() {
            r2 = this;
            androidx.room.RoomConnectionManager r0 = r2.connectionManager
            if (r0 != 0) goto La
            java.lang.String r0 = "connectionManager"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r0.getSupportOpenHelper$room_runtime_release()
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Cannot return a SupportSQLiteOpenHelper since no SupportSQLiteOpenHelper.Factory was configured with Room."
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.i getQueryContext() {
            r1 = this;
            kotlinx.coroutines.r0 r0 = r1.coroutineScope
            if (r0 != 0) goto La
            java.lang.String r0 = "coroutineScope"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            kotlin.coroutines.i r0 = r0.getCoroutineContext()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.Executor getQueryExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.internalQueryExecutor
            if (r0 != 0) goto La
            java.lang.String r0 = "internalQueryExecutor"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.d<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecClasses() {
            r3 = this;
            java.util.Set r0 = r3.getRequiredAutoMigrationSpecs()
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L27
            java.lang.Object r2 = r0.next()
            java.lang.Class r2 = (java.lang.Class) r2
            kotlin.reflect.d r2 = k3.a.i(r2)
            r1.add(r2)
            goto L13
        L27:
            java.util.Set r0 = kotlin.collections.f0.f6(r1)
            return r0
    }

    @kotlin.Deprecated(message = "No longer implemented by generated")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public java.util.Set<java.lang.Class<? extends androidx.room.migration.AutoMigrationSpec>> getRequiredAutoMigrationSpecs() {
            r1 = this;
            java.util.Set r0 = kotlin.collections.u1.k()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    protected java.util.Map<kotlin.reflect.d<?>, java.util.List<kotlin.reflect.d<?>>> getRequiredTypeConverterClasses() {
            r7 = this;
            java.util.Map r0 = r7.getRequiredTypeConverters()
            java.util.Set r0 = r0.entrySet()
            r1 = 10
            int r2 = kotlin.collections.f0.d0(r0, r1)
            int r2 = kotlin.collections.i1.j(r2)
            r3 = 16
            int r2 = kotlin.ranges.t.u(r2, r3)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L21:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L70
            java.lang.Object r2 = r0.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            java.lang.Class r4 = (java.lang.Class) r4
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            kotlin.reflect.d r4 = k3.a.i(r4)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = kotlin.collections.f0.d0(r2, r1)
            r5.<init>(r6)
            java.util.Iterator r2 = r2.iterator()
        L4c:
            boolean r6 = r2.hasNext()
            if (r6 == 0) goto L60
            java.lang.Object r6 = r2.next()
            java.lang.Class r6 = (java.lang.Class) r6
            kotlin.reflect.d r6 = k3.a.i(r6)
            r5.add(r6)
            goto L4c
        L60:
            kotlin.Pair r2 = kotlin.o0.a(r4, r5)
            java.lang.Object r4 = r2.getFirst()
            java.lang.Object r2 = r2.getSecond()
            r3.put(r4, r2)
            goto L21
        L70:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<kotlin.reflect.d<?>, java.util.List<kotlin.reflect.d<?>>> getRequiredTypeConverterClassesMap$room_runtime_release() {
            r1 = this;
            java.util.Map r0 = r1.getRequiredTypeConverterClasses()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    protected java.util.Map<java.lang.Class<?>, java.util.List<java.lang.Class<?>>> getRequiredTypeConverters() {
            r1 = this;
            java.util.Map r0 = kotlin.collections.i1.z()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.NotNull
    public final java.lang.ThreadLocal<java.lang.Integer> getSuspendingTransactionId() {
            r1 = this;
            java.lang.ThreadLocal<java.lang.Integer> r0 = r1.suspendingTransactionId
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.i getTransactionContext$room_runtime_release() {
            r1 = this;
            kotlin.coroutines.i r0 = r1.transactionContext
            if (r0 != 0) goto La
            java.lang.String r0 = "transactionContext"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.concurrent.Executor getTransactionExecutor() {
            r1 = this;
            java.util.concurrent.Executor r0 = r1.internalTransactionExecutor
            if (r0 != 0) goto La
            java.lang.String r0 = "internalTransactionExecutor"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            return r0
    }

    @kotlin.Deprecated(message = "No longer called by generated implementation")
    @org.jetbrains.annotations.Nullable
    public <T> T getTypeConverter(@org.jetbrains.annotations.NotNull java.lang.Class<T> r2) {
            r1 = this;
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<kotlin.reflect.d<?>, java.lang.Object> r0 = r1.typeConverters
            kotlin.reflect.d r2 = k3.a.i(r2)
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.NotNull
    public final <T> T getTypeConverter(@org.jetbrains.annotations.NotNull kotlin.reflect.d<T> r2) {
            r1 = this;
            java.lang.String r0 = "klass"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<kotlin.reflect.d<?>, java.lang.Object> r0 = r1.typeConverters
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r0 = "null cannot be cast to non-null type T of androidx.room.RoomDatabase.getTypeConverter"
            kotlin.jvm.internal.g0.n(r2, r0)
            return r2
    }

    public final boolean getUseTempTrackingTable$room_runtime_release() {
            r1 = this;
            boolean r0 = r1.useTempTrackingTable
            return r0
    }

    public final boolean inCompatibilityMode$room_runtime_release() {
            r1 = this;
            androidx.room.RoomConnectionManager r0 = r1.connectionManager
            if (r0 != 0) goto La
            java.lang.String r0 = "connectionManager"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r0.getSupportOpenHelper$room_runtime_release()
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public boolean inTransaction() {
            r1 = this;
            boolean r0 = r1.isOpenInternal()
            if (r0 == 0) goto L16
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.getOpenHelper()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            boolean r0 = r0.inTransaction()
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    @androidx.annotation.CallSuper
    public void init(@org.jetbrains.annotations.NotNull androidx.room.DatabaseConfiguration r8) {
            r7 = this;
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.p(r8, r0)
            boolean r0 = r8.getUseTempTrackingTable$room_runtime_release()
            r7.useTempTrackingTable = r0
            androidx.room.RoomConnectionManager r0 = r7.createConnectionManager$room_runtime_release(r8)
            r7.connectionManager = r0
            androidx.room.InvalidationTracker r0 = r7.createInvalidationTracker()
            r7.internalTracker = r0
            androidx.room.RoomDatabaseKt.validateAutoMigrations(r7, r8)
            androidx.room.RoomDatabaseKt.validateTypeConverters(r7, r8)
            kotlin.coroutines.i r0 = r8.queryCoroutineContext
            r1 = 1
            java.lang.String r2 = "internalQueryExecutor"
            java.lang.String r3 = "coroutineScope"
            r4 = 0
            if (r0 == 0) goto L8b
            kotlin.coroutines.f$b r5 = kotlin.coroutines.f.o0
            kotlin.coroutines.i$b r0 = r0.get(r5)
            java.lang.String r5 = "null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher"
            kotlin.jvm.internal.g0.n(r0, r5)
            kotlinx.coroutines.m0 r0 = (kotlinx.coroutines.m0) r0
            java.util.concurrent.Executor r5 = kotlinx.coroutines.v1.b(r0)
            r7.internalQueryExecutor = r5
            androidx.room.TransactionExecutor r6 = new androidx.room.TransactionExecutor
            if (r5 != 0) goto L42
            kotlin.jvm.internal.g0.S(r2)
            r5 = r4
        L42:
            r6.<init>(r5)
            r7.internalTransactionExecutor = r6
            kotlin.coroutines.i r2 = r8.queryCoroutineContext
            kotlinx.coroutines.e2$b r5 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r2 = r2.get(r5)
            kotlinx.coroutines.e2 r2 = (kotlinx.coroutines.e2) r2
            kotlin.coroutines.i r5 = r8.queryCoroutineContext
            kotlinx.coroutines.b0 r2 = kotlinx.coroutines.d3.a(r2)
            kotlin.coroutines.i r2 = r5.plus(r2)
            kotlinx.coroutines.r0 r2 = kotlinx.coroutines.s0.a(r2)
            r7.coroutineScope = r2
            boolean r2 = r7.inCompatibilityMode$room_runtime_release()
            if (r2 == 0) goto L7c
            kotlinx.coroutines.r0 r2 = r7.coroutineScope
            if (r2 != 0) goto L6f
            kotlin.jvm.internal.g0.S(r3)
            r2 = r4
        L6f:
            kotlin.coroutines.i r2 = r2.getCoroutineContext()
            kotlinx.coroutines.m0 r0 = r0.limitedParallelism(r1)
            kotlin.coroutines.i r0 = r2.plus(r0)
            goto L88
        L7c:
            kotlinx.coroutines.r0 r0 = r7.coroutineScope
            if (r0 != 0) goto L84
            kotlin.jvm.internal.g0.S(r3)
            r0 = r4
        L84:
            kotlin.coroutines.i r0 = r0.getCoroutineContext()
        L88:
            r7.transactionContext = r0
            goto Ld0
        L8b:
            java.util.concurrent.Executor r0 = r8.queryExecutor
            r7.internalQueryExecutor = r0
            androidx.room.TransactionExecutor r0 = new androidx.room.TransactionExecutor
            java.util.concurrent.Executor r5 = r8.transactionExecutor
            r0.<init>(r5)
            r7.internalTransactionExecutor = r0
            java.util.concurrent.Executor r0 = r7.internalQueryExecutor
            if (r0 != 0) goto La0
            kotlin.jvm.internal.g0.S(r2)
            r0 = r4
        La0:
            kotlinx.coroutines.m0 r0 = kotlinx.coroutines.v1.c(r0)
            kotlinx.coroutines.b0 r1 = kotlinx.coroutines.d3.c(r4, r1, r4)
            kotlin.coroutines.i r0 = r0.plus(r1)
            kotlinx.coroutines.r0 r0 = kotlinx.coroutines.s0.a(r0)
            r7.coroutineScope = r0
            if (r0 != 0) goto Lb8
            kotlin.jvm.internal.g0.S(r3)
            r0 = r4
        Lb8:
            kotlin.coroutines.i r0 = r0.getCoroutineContext()
            java.util.concurrent.Executor r1 = r7.internalTransactionExecutor
            if (r1 != 0) goto Lc6
            java.lang.String r1 = "internalTransactionExecutor"
            kotlin.jvm.internal.g0.S(r1)
            r1 = r4
        Lc6:
            kotlinx.coroutines.m0 r1 = kotlinx.coroutines.v1.c(r1)
            kotlin.coroutines.i r0 = r0.plus(r1)
            r7.transactionContext = r0
        Ld0:
            boolean r0 = r8.allowMainThreadQueries
            r7.allowMainThreadQueries = r0
            androidx.room.RoomConnectionManager r0 = r7.connectionManager
            java.lang.String r1 = "connectionManager"
            if (r0 != 0) goto Lde
            kotlin.jvm.internal.g0.S(r1)
            r0 = r4
        Lde:
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r0.getSupportOpenHelper$room_runtime_release()
            if (r0 != 0) goto Le6
        Le4:
            r0 = r4
            goto Lf6
        Le6:
            boolean r2 = r0 instanceof androidx.room.support.PrePackagedCopyOpenHelper
            if (r2 == 0) goto Leb
            goto Lf6
        Leb:
            boolean r2 = r0 instanceof androidx.room.DelegatingOpenHelper
            if (r2 == 0) goto Le4
            androidx.room.DelegatingOpenHelper r0 = (androidx.room.DelegatingOpenHelper) r0
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r0.getDelegate()
            goto Le6
        Lf6:
            androidx.room.support.PrePackagedCopyOpenHelper r0 = (androidx.room.support.PrePackagedCopyOpenHelper) r0
            if (r0 == 0) goto Lfd
            r0.setDatabaseConfiguration(r8)
        Lfd:
            androidx.room.RoomConnectionManager r0 = r7.connectionManager
            if (r0 != 0) goto L105
            kotlin.jvm.internal.g0.S(r1)
            r0 = r4
        L105:
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r0.getSupportOpenHelper$room_runtime_release()
            if (r0 != 0) goto L10d
        L10b:
            r0 = r4
            goto L11d
        L10d:
            boolean r1 = r0 instanceof androidx.room.support.AutoClosingRoomOpenHelper
            if (r1 == 0) goto L112
            goto L11d
        L112:
            boolean r1 = r0 instanceof androidx.room.DelegatingOpenHelper
            if (r1 == 0) goto L10b
            androidx.room.DelegatingOpenHelper r0 = (androidx.room.DelegatingOpenHelper) r0
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r0.getDelegate()
            goto L10d
        L11d:
            androidx.room.support.AutoClosingRoomOpenHelper r0 = (androidx.room.support.AutoClosingRoomOpenHelper) r0
            if (r0 == 0) goto L142
            androidx.room.support.AutoCloser r1 = r0.getAutoCloser$room_runtime_release()
            r7.autoCloser = r1
            androidx.room.support.AutoCloser r1 = r0.getAutoCloser$room_runtime_release()
            kotlinx.coroutines.r0 r2 = r7.coroutineScope
            if (r2 != 0) goto L133
            kotlin.jvm.internal.g0.S(r3)
            goto L134
        L133:
            r4 = r2
        L134:
            r1.initCoroutineScope(r4)
            androidx.room.InvalidationTracker r1 = r7.getInvalidationTracker()
            androidx.room.support.AutoCloser r0 = r0.getAutoCloser$room_runtime_release()
            r1.setAutoCloser$room_runtime_release(r0)
        L142:
            android.content.Intent r0 = r8.multiInstanceInvalidationServiceIntent
            if (r0 == 0) goto L160
            java.lang.String r0 = r8.name
            if (r0 == 0) goto L158
            androidx.room.InvalidationTracker r0 = r7.getInvalidationTracker()
            android.content.Context r1 = r8.context
            java.lang.String r2 = r8.name
            android.content.Intent r8 = r8.multiInstanceInvalidationServiceIntent
            r0.initMultiInstanceInvalidation$room_runtime_release(r1, r2, r8)
            return
        L158:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Required value was null."
            r8.<init>(r0)
            throw r8
        L160:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    protected final void internalInitInvalidationTracker(@org.jetbrains.annotations.NotNull androidx.sqlite.SQLiteConnection r2) {
            r1 = this;
            java.lang.String r0 = "connection"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.InvalidationTracker r0 = r1.getInvalidationTracker()
            r0.internalInit$room_runtime_release(r2)
            return
    }

    @kotlin.Deprecated(message = "No longer called by generated")
    protected void internalInitInvalidationTracker(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
            r1 = this;
            java.lang.String r0 = "db"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.driver.SupportSQLiteConnection r0 = new androidx.room.driver.SupportSQLiteConnection
            r0.<init>(r2)
            r1.internalInitInvalidationTracker(r0)
            return
    }

    public final boolean isMainThread$room_runtime_release() {
            r2 = this;
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            java.lang.Thread r0 = r0.getThread()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r0 != r1) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public boolean isOpen() {
            r1 = this;
            androidx.room.support.AutoCloser r0 = r1.autoCloser
            if (r0 == 0) goto L9
            boolean r0 = r0.isActive()
            return r0
        L9:
            androidx.room.RoomConnectionManager r0 = r1.connectionManager
            if (r0 != 0) goto L13
            java.lang.String r0 = "connectionManager"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        L13:
            boolean r0 = r0.isSupportDatabaseOpen()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean isOpenInternal() {
            r1 = this;
            androidx.room.RoomConnectionManager r0 = r1.connectionManager
            if (r0 != 0) goto La
            java.lang.String r0 = "connectionManager"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            boolean r0 = r0.isSupportDatabaseOpen()
            return r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    protected final void performClear(boolean r3, @org.jetbrains.annotations.NotNull java.lang.String... r4) {
            r2 = this;
            java.lang.String r0 = "tableNames"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.assertNotMainThread()
            r2.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase$performClear$1 r0 = new androidx.room.RoomDatabase$performClear$1
            r1 = 0
            r0.<init>(r2, r3, r4, r1)
            androidx.room.coroutines.RunBlockingUninterruptible_androidKt.runBlockingUninterruptible(r0)
            return
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public final android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r3) {
            r2 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1 = 2
            android.database.Cursor r3 = query$default(r2, r3, r0, r1, r0)
            return r3
    }

    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteQuery r2, @org.jetbrains.annotations.Nullable android.os.CancellationSignal r3) {
            r1 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.assertNotMainThread()
            r1.assertNotSuspendingTransaction()
            if (r3 == 0) goto L1a
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.getOpenHelper()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            android.database.Cursor r2 = r0.query(r2, r3)
            return r2
        L1a:
            androidx.sqlite.db.SupportSQLiteOpenHelper r3 = r1.getOpenHelper()
            androidx.sqlite.db.SupportSQLiteDatabase r3 = r3.getWritableDatabase()
            android.database.Cursor r2 = r3.query(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public android.database.Cursor query(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.Object[] r4) {
            r2 = this;
            java.lang.String r0 = "query"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.assertNotMainThread()
            r2.assertNotSuspendingTransaction()
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r2.getOpenHelper()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            androidx.sqlite.db.SimpleSQLiteQuery r1 = new androidx.sqlite.db.SimpleSQLiteQuery
            r1.<init>(r3, r4)
            android.database.Cursor r3 = r0.query(r1)
            return r3
    }

    public <V> V runInTransaction(@org.jetbrains.annotations.NotNull java.util.concurrent.Callable<V> r2) {
            r1 = this;
            java.lang.String r0 = "body"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.l r0 = new androidx.room.l
            r0.<init>(r2)
            java.lang.Object r2 = r1.runInTransaction(r0)
            return r2
    }

    public void runInTransaction(@org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r1 = this;
            java.lang.String r0 = "body"
            kotlin.jvm.internal.g0.p(r2, r0)
            androidx.room.j r0 = new androidx.room.j
            r0.<init>(r2)
            r1.runInTransaction(r0)
            return
    }

    @kotlin.Deprecated(message = "setTransactionSuccessful() is deprecated", replaceWith = @kotlin.ReplaceWith(expression = "runInTransaction(Runnable)", imports = {}))
    public void setTransactionSuccessful() {
            r1 = this;
            androidx.sqlite.db.SupportSQLiteOpenHelper r0 = r1.getOpenHelper()
            androidx.sqlite.db.SupportSQLiteDatabase r0 = r0.getWritableDatabase()
            r0.setTransactionSuccessful()
            return
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean r1) {
            r0 = this;
            r0.useTempTrackingTable = r1
            return
    }

    @org.jetbrains.annotations.Nullable
    public final <R> java.lang.Object useConnection$room_runtime_release(boolean r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super androidx.room.Transactor, ? super kotlin.coroutines.e<? super R>, ? extends java.lang.Object> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r4) {
            r1 = this;
            androidx.room.RoomConnectionManager r0 = r1.connectionManager
            if (r0 != 0) goto La
            java.lang.String r0 = "connectionManager"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
        La:
            java.lang.Object r2 = r0.useConnection(r2, r3, r4)
            return r2
    }
}

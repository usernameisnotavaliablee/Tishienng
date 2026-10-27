package androidx.room;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class DatabaseConfiguration {

    @kotlin.jvm.JvmField
    public final boolean allowDestructiveMigrationForAllTables;

    @kotlin.jvm.JvmField
    public final boolean allowDestructiveMigrationOnDowngrade;

    @kotlin.jvm.JvmField
    public final boolean allowMainThreadQueries;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.util.List<androidx.room.migration.AutoMigrationSpec> autoMigrationSpecs;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.util.List<androidx.room.RoomDatabase.Callback> callbacks;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final android.content.Context context;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.lang.String copyFromAssetPath;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.io.File copyFromFile;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.util.concurrent.Callable<java.io.InputStream> copyFromInputStream;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final androidx.room.RoomDatabase.JournalMode journalMode;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final androidx.room.RoomDatabase.MigrationContainer migrationContainer;

    @org.jetbrains.annotations.Nullable
    private final java.util.Set<java.lang.Integer> migrationNotRequiredFrom;

    @kotlin.jvm.JvmField
    public final boolean multiInstanceInvalidation;

    @kotlin.jvm.JvmField
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    @org.jetbrains.annotations.Nullable
    public final android.content.Intent multiInstanceInvalidationServiceIntent;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final java.lang.String name;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final androidx.room.RoomDatabase.PrepackagedDatabaseCallback prepackagedDatabaseCallback;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final kotlin.coroutines.i queryCoroutineContext;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.Executor queryExecutor;

    @kotlin.jvm.JvmField
    public final boolean requireMigration;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final androidx.sqlite.SQLiteDriver sqliteDriver;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public final androidx.sqlite.db.SupportSQLiteOpenHelper.Factory sqliteOpenHelperFactory;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.util.concurrent.Executor transactionExecutor;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.util.List<java.lang.Object> typeConverters;
    private boolean useTempTrackingTable;

    @kotlin.Deprecated(message = "This constructor is deprecated.")
    @android.annotation.SuppressLint({"LambdaLast"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@org.jetbrains.annotations.NotNull android.content.Context r25, @org.jetbrains.annotations.Nullable java.lang.String r26, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r27, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.MigrationContainer r28, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.room.RoomDatabase.Callback> r29, boolean r30, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r31, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r32, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r33, @org.jetbrains.annotations.Nullable android.content.Intent r34, boolean r35, boolean r36, @org.jetbrains.annotations.Nullable java.util.Set<java.lang.Integer> r37, @org.jetbrains.annotations.Nullable java.lang.String r38, @org.jetbrains.annotations.Nullable java.io.File r39, @org.jetbrains.annotations.Nullable java.util.concurrent.Callable<java.io.InputStream> r40, @org.jetbrains.annotations.Nullable androidx.room.RoomDatabase.PrepackagedDatabaseCallback r41, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Object> r42, @org.jetbrains.annotations.NotNull java.util.List<? extends androidx.room.migration.AutoMigrationSpec> r43) {
            r24 = this;
            java.lang.String r0 = "context"
            r2 = r25
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r4 = r27
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "migrationContainer"
            r5 = r28
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "journalMode"
            r8 = r31
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "queryExecutor"
            r9 = r32
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "transactionExecutor"
            r10 = r33
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "typeConverters"
            r1 = r42
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "autoMigrationSpecs"
            r3 = r43
            kotlin.jvm.internal.g0.p(r3, r0)
            r22 = 0
            r23 = 0
            r18 = 0
            r21 = 0
            r6 = r29
            r7 = r30
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r19 = r1
            r20 = r3
            r1 = r24
            r3 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
    }

    @kotlin.Deprecated(message = "This constructor is deprecated.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@org.jetbrains.annotations.NotNull android.content.Context r25, @org.jetbrains.annotations.Nullable java.lang.String r26, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r27, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.MigrationContainer r28, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.room.RoomDatabase.Callback> r29, boolean r30, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r31, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r32, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r33, @org.jetbrains.annotations.Nullable android.content.Intent r34, boolean r35, boolean r36, @org.jetbrains.annotations.Nullable java.util.Set<java.lang.Integer> r37, @org.jetbrains.annotations.Nullable java.lang.String r38, @org.jetbrains.annotations.Nullable java.io.File r39, @org.jetbrains.annotations.Nullable java.util.concurrent.Callable<java.io.InputStream> r40, @org.jetbrains.annotations.Nullable androidx.room.RoomDatabase.PrepackagedDatabaseCallback r41, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Object> r42, @org.jetbrains.annotations.NotNull java.util.List<? extends androidx.room.migration.AutoMigrationSpec> r43, boolean r44) {
            r24 = this;
            java.lang.String r0 = "context"
            r2 = r25
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r4 = r27
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "migrationContainer"
            r5 = r28
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "journalMode"
            r8 = r31
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "queryExecutor"
            r9 = r32
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "transactionExecutor"
            r10 = r33
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "typeConverters"
            r1 = r42
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "autoMigrationSpecs"
            r3 = r43
            kotlin.jvm.internal.g0.p(r3, r0)
            r22 = 0
            r23 = 0
            r18 = 0
            r6 = r29
            r7 = r30
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r21 = r44
            r19 = r1
            r20 = r3
            r1 = r24
            r3 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
    }

    @android.annotation.SuppressLint({"LambdaLast"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@org.jetbrains.annotations.NotNull android.content.Context r6, @org.jetbrains.annotations.Nullable java.lang.String r7, @org.jetbrains.annotations.Nullable androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r8, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.MigrationContainer r9, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.room.RoomDatabase.Callback> r10, boolean r11, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r12, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r13, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r14, @org.jetbrains.annotations.Nullable android.content.Intent r15, boolean r16, boolean r17, @org.jetbrains.annotations.Nullable java.util.Set<java.lang.Integer> r18, @org.jetbrains.annotations.Nullable java.lang.String r19, @org.jetbrains.annotations.Nullable java.io.File r20, @org.jetbrains.annotations.Nullable java.util.concurrent.Callable<java.io.InputStream> r21, @org.jetbrains.annotations.Nullable androidx.room.RoomDatabase.PrepackagedDatabaseCallback r22, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Object> r23, @org.jetbrains.annotations.NotNull java.util.List<? extends androidx.room.migration.AutoMigrationSpec> r24, boolean r25, @org.jetbrains.annotations.Nullable androidx.sqlite.SQLiteDriver r26, @org.jetbrains.annotations.Nullable kotlin.coroutines.i r27) {
            r5 = this;
            r0 = r14
            r1 = r15
            r2 = r23
            r3 = r24
            java.lang.String r4 = "context"
            kotlin.jvm.internal.g0.p(r6, r4)
            java.lang.String r4 = "migrationContainer"
            kotlin.jvm.internal.g0.p(r9, r4)
            java.lang.String r4 = "journalMode"
            kotlin.jvm.internal.g0.p(r12, r4)
            java.lang.String r4 = "queryExecutor"
            kotlin.jvm.internal.g0.p(r13, r4)
            java.lang.String r4 = "transactionExecutor"
            kotlin.jvm.internal.g0.p(r14, r4)
            java.lang.String r4 = "typeConverters"
            kotlin.jvm.internal.g0.p(r2, r4)
            java.lang.String r4 = "autoMigrationSpecs"
            kotlin.jvm.internal.g0.p(r3, r4)
            r5.<init>()
            r5.context = r6
            r5.name = r7
            r5.sqliteOpenHelperFactory = r8
            r5.migrationContainer = r9
            r5.callbacks = r10
            r5.allowMainThreadQueries = r11
            r5.journalMode = r12
            r5.queryExecutor = r13
            r5.transactionExecutor = r0
            r5.multiInstanceInvalidationServiceIntent = r1
            r6 = r16
            r5.requireMigration = r6
            r6 = r17
            r5.allowDestructiveMigrationOnDowngrade = r6
            r6 = r18
            r5.migrationNotRequiredFrom = r6
            r6 = r19
            r5.copyFromAssetPath = r6
            r6 = r20
            r5.copyFromFile = r6
            r6 = r21
            r5.copyFromInputStream = r6
            r6 = r22
            r5.prepackagedDatabaseCallback = r6
            r5.typeConverters = r2
            r5.autoMigrationSpecs = r3
            r6 = r25
            r5.allowDestructiveMigrationForAllTables = r6
            r6 = r26
            r5.sqliteDriver = r6
            r6 = r27
            r5.queryCoroutineContext = r6
            r6 = 1
            if (r1 == 0) goto L71
            r7 = 1
            goto L72
        L71:
            r7 = 0
        L72:
            r5.multiInstanceInvalidation = r7
            r5.useTempTrackingTable = r6
            return
    }

    @kotlin.Deprecated(message = "This constructor is deprecated.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@org.jetbrains.annotations.NotNull android.content.Context r24, @org.jetbrains.annotations.Nullable java.lang.String r25, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r26, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.MigrationContainer r27, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.room.RoomDatabase.Callback> r28, boolean r29, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r30, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r31, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r32, boolean r33, boolean r34, boolean r35, @org.jetbrains.annotations.Nullable java.util.Set<java.lang.Integer> r36) {
            r23 = this;
            r1 = r24
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r26
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r27
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r30
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r31
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r32
            kotlin.jvm.internal.g0.p(r9, r0)
            if (r33 == 0) goto L35
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
        L33:
            r10 = r0
            goto L37
        L35:
            r0 = 0
            goto L33
        L37:
            java.util.List r18 = kotlin.collections.f0.J()
            java.util.List r19 = kotlin.collections.f0.J()
            r21 = 0
            r22 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r0 = r23
            r2 = r25
            r5 = r28
            r6 = r29
            r11 = r34
            r12 = r35
            r13 = r36
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
    }

    @kotlin.Deprecated(message = "This constructor is deprecated.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@org.jetbrains.annotations.NotNull android.content.Context r24, @org.jetbrains.annotations.Nullable java.lang.String r25, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r26, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.MigrationContainer r27, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.room.RoomDatabase.Callback> r28, boolean r29, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r30, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r31, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r32, boolean r33, boolean r34, boolean r35, @org.jetbrains.annotations.Nullable java.util.Set<java.lang.Integer> r36, @org.jetbrains.annotations.Nullable java.lang.String r37, @org.jetbrains.annotations.Nullable java.io.File r38) {
            r23 = this;
            r1 = r24
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r26
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r27
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r30
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r31
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r32
            kotlin.jvm.internal.g0.p(r9, r0)
            if (r33 == 0) goto L35
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
        L33:
            r10 = r0
            goto L37
        L35:
            r0 = 0
            goto L33
        L37:
            java.util.List r18 = kotlin.collections.f0.J()
            java.util.List r19 = kotlin.collections.f0.J()
            r21 = 0
            r22 = 0
            r16 = 0
            r17 = 0
            r20 = 0
            r0 = r23
            r2 = r25
            r5 = r28
            r6 = r29
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
    }

    @kotlin.Deprecated(message = "This constructor is deprecated.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@org.jetbrains.annotations.NotNull android.content.Context r24, @org.jetbrains.annotations.Nullable java.lang.String r25, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r26, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.MigrationContainer r27, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.room.RoomDatabase.Callback> r28, boolean r29, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r30, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r31, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r32, boolean r33, boolean r34, boolean r35, @org.jetbrains.annotations.Nullable java.util.Set<java.lang.Integer> r36, @org.jetbrains.annotations.Nullable java.lang.String r37, @org.jetbrains.annotations.Nullable java.io.File r38, @org.jetbrains.annotations.Nullable java.util.concurrent.Callable<java.io.InputStream> r39) {
            r23 = this;
            r1 = r24
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r26
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r27
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r30
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r31
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r32
            kotlin.jvm.internal.g0.p(r9, r0)
            if (r33 == 0) goto L35
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
        L33:
            r10 = r0
            goto L37
        L35:
            r0 = 0
            goto L33
        L37:
            java.util.List r18 = kotlin.collections.f0.J()
            java.util.List r19 = kotlin.collections.f0.J()
            r21 = 0
            r22 = 0
            r17 = 0
            r20 = 0
            r0 = r23
            r2 = r25
            r5 = r28
            r6 = r29
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
    }

    @kotlin.Deprecated(message = "This constructor is deprecated.")
    @android.annotation.SuppressLint({"LambdaLast"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@org.jetbrains.annotations.NotNull android.content.Context r24, @org.jetbrains.annotations.Nullable java.lang.String r25, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r26, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.MigrationContainer r27, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.room.RoomDatabase.Callback> r28, boolean r29, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r30, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r31, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r32, boolean r33, boolean r34, boolean r35, @org.jetbrains.annotations.Nullable java.util.Set<java.lang.Integer> r36, @org.jetbrains.annotations.Nullable java.lang.String r37, @org.jetbrains.annotations.Nullable java.io.File r38, @org.jetbrains.annotations.Nullable java.util.concurrent.Callable<java.io.InputStream> r39, @org.jetbrains.annotations.Nullable androidx.room.RoomDatabase.PrepackagedDatabaseCallback r40) {
            r23 = this;
            r1 = r24
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r26
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r27
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r30
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r31
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r32
            kotlin.jvm.internal.g0.p(r9, r0)
            if (r33 == 0) goto L35
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r2 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r2)
        L33:
            r10 = r0
            goto L37
        L35:
            r0 = 0
            goto L33
        L37:
            java.util.List r18 = kotlin.collections.f0.J()
            java.util.List r19 = kotlin.collections.f0.J()
            r21 = 0
            r22 = 0
            r20 = 0
            r0 = r23
            r2 = r25
            r5 = r28
            r6 = r29
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
    }

    @kotlin.Deprecated(message = "This constructor is deprecated.")
    @android.annotation.SuppressLint({"LambdaLast"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@org.jetbrains.annotations.NotNull android.content.Context r24, @org.jetbrains.annotations.Nullable java.lang.String r25, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r26, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.MigrationContainer r27, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.room.RoomDatabase.Callback> r28, boolean r29, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r30, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r31, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r32, boolean r33, boolean r34, boolean r35, @org.jetbrains.annotations.Nullable java.util.Set<java.lang.Integer> r36, @org.jetbrains.annotations.Nullable java.lang.String r37, @org.jetbrains.annotations.Nullable java.io.File r38, @org.jetbrains.annotations.Nullable java.util.concurrent.Callable<java.io.InputStream> r39, @org.jetbrains.annotations.Nullable androidx.room.RoomDatabase.PrepackagedDatabaseCallback r40, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Object> r41) {
            r23 = this;
            r1 = r24
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r26
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r27
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r30
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r31
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r32
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "typeConverters"
            r2 = r41
            kotlin.jvm.internal.g0.p(r2, r0)
            if (r33 == 0) goto L3c
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r5 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r5)
        L3a:
            r10 = r0
            goto L3e
        L3c:
            r0 = 0
            goto L3a
        L3e:
            java.util.List r19 = kotlin.collections.f0.J()
            r21 = 0
            r22 = 0
            r20 = 0
            r0 = r23
            r5 = r28
            r6 = r29
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r18 = r2
            r2 = r25
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
    }

    @kotlin.Deprecated(message = "This constructor is deprecated.")
    @android.annotation.SuppressLint({"LambdaLast"})
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@org.jetbrains.annotations.NotNull android.content.Context r24, @org.jetbrains.annotations.Nullable java.lang.String r25, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r26, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.MigrationContainer r27, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.room.RoomDatabase.Callback> r28, boolean r29, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r30, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r31, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r32, boolean r33, boolean r34, boolean r35, @org.jetbrains.annotations.Nullable java.util.Set<java.lang.Integer> r36, @org.jetbrains.annotations.Nullable java.lang.String r37, @org.jetbrains.annotations.Nullable java.io.File r38, @org.jetbrains.annotations.Nullable java.util.concurrent.Callable<java.io.InputStream> r39, @org.jetbrains.annotations.Nullable androidx.room.RoomDatabase.PrepackagedDatabaseCallback r40, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Object> r41, @org.jetbrains.annotations.NotNull java.util.List<? extends androidx.room.migration.AutoMigrationSpec> r42) {
            r23 = this;
            r1 = r24
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r3 = r26
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "migrationContainer"
            r4 = r27
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "journalMode"
            r7 = r30
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "queryExecutor"
            r8 = r31
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "transactionExecutor"
            r9 = r32
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "typeConverters"
            r2 = r41
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "autoMigrationSpecs"
            r5 = r42
            kotlin.jvm.internal.g0.p(r5, r0)
            if (r33 == 0) goto L43
            android.content.Intent r0 = new android.content.Intent
            java.lang.Class<androidx.room.MultiInstanceInvalidationService> r6 = androidx.room.MultiInstanceInvalidationService.class
            r0.<init>(r1, r6)
        L41:
            r10 = r0
            goto L45
        L43:
            r0 = 0
            goto L41
        L45:
            r21 = 0
            r22 = 0
            r17 = 0
            r20 = 0
            r0 = r23
            r6 = r29
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r18 = r2
            r19 = r5
            r2 = r25
            r5 = r28
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return
    }

    @kotlin.Deprecated(message = "This constructor is deprecated.")
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public DatabaseConfiguration(@org.jetbrains.annotations.NotNull android.content.Context r25, @org.jetbrains.annotations.Nullable java.lang.String r26, @org.jetbrains.annotations.NotNull androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r27, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.MigrationContainer r28, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.room.RoomDatabase.Callback> r29, boolean r30, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r31, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r32, boolean r33, @org.jetbrains.annotations.Nullable java.util.Set<java.lang.Integer> r34) {
            r24 = this;
            java.lang.String r0 = "context"
            r2 = r25
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "sqliteOpenHelperFactory"
            r4 = r27
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "migrationContainer"
            r5 = r28
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "journalMode"
            r8 = r31
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "queryExecutor"
            r9 = r32
            kotlin.jvm.internal.g0.p(r9, r0)
            java.util.List r19 = kotlin.collections.f0.J()
            java.util.List r20 = kotlin.collections.f0.J()
            r22 = 0
            r23 = 0
            r11 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r21 = 0
            r10 = r32
            r1 = r24
            r3 = r26
            r6 = r29
            r7 = r30
            r12 = r33
            r14 = r34
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return
    }

    public static /* synthetic */ androidx.room.DatabaseConfiguration copy$default(androidx.room.DatabaseConfiguration r17, android.content.Context r18, java.lang.String r19, androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r20, androidx.room.RoomDatabase.MigrationContainer r21, java.util.List r22, boolean r23, androidx.room.RoomDatabase.JournalMode r24, java.util.concurrent.Executor r25, java.util.concurrent.Executor r26, android.content.Intent r27, boolean r28, boolean r29, java.util.Set r30, java.lang.String r31, java.io.File r32, java.util.concurrent.Callable r33, androidx.room.RoomDatabase.PrepackagedDatabaseCallback r34, java.util.List r35, java.util.List r36, boolean r37, androidx.sqlite.SQLiteDriver r38, kotlin.coroutines.i r39, int r40, java.lang.Object r41) {
            r0 = r17
            r1 = r40
            if (r41 != 0) goto L11f
            r2 = r1 & 1
            if (r2 == 0) goto Ld
            android.content.Context r2 = r0.context
            goto Lf
        Ld:
            r2 = r18
        Lf:
            r3 = r1 & 2
            if (r3 == 0) goto L16
            java.lang.String r3 = r0.name
            goto L18
        L16:
            r3 = r19
        L18:
            r4 = r1 & 4
            if (r4 == 0) goto L1f
            androidx.sqlite.db.SupportSQLiteOpenHelper$Factory r4 = r0.sqliteOpenHelperFactory
            goto L21
        L1f:
            r4 = r20
        L21:
            r5 = r1 & 8
            if (r5 == 0) goto L28
            androidx.room.RoomDatabase$MigrationContainer r5 = r0.migrationContainer
            goto L2a
        L28:
            r5 = r21
        L2a:
            r6 = r1 & 16
            if (r6 == 0) goto L31
            java.util.List<androidx.room.RoomDatabase$Callback> r6 = r0.callbacks
            goto L33
        L31:
            r6 = r22
        L33:
            r7 = r1 & 32
            if (r7 == 0) goto L3a
            boolean r7 = r0.allowMainThreadQueries
            goto L3c
        L3a:
            r7 = r23
        L3c:
            r8 = r1 & 64
            if (r8 == 0) goto L43
            androidx.room.RoomDatabase$JournalMode r8 = r0.journalMode
            goto L45
        L43:
            r8 = r24
        L45:
            r9 = r1 & 128(0x80, float:1.8E-43)
            if (r9 == 0) goto L4c
            java.util.concurrent.Executor r9 = r0.queryExecutor
            goto L4e
        L4c:
            r9 = r25
        L4e:
            r10 = r1 & 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L55
            java.util.concurrent.Executor r10 = r0.transactionExecutor
            goto L57
        L55:
            r10 = r26
        L57:
            r11 = r1 & 512(0x200, float:7.17E-43)
            if (r11 == 0) goto L5e
            android.content.Intent r11 = r0.multiInstanceInvalidationServiceIntent
            goto L60
        L5e:
            r11 = r27
        L60:
            r12 = r1 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L67
            boolean r12 = r0.requireMigration
            goto L69
        L67:
            r12 = r28
        L69:
            r13 = r1 & 2048(0x800, float:2.87E-42)
            if (r13 == 0) goto L70
            boolean r13 = r0.allowDestructiveMigrationOnDowngrade
            goto L72
        L70:
            r13 = r29
        L72:
            r14 = r1 & 4096(0x1000, float:5.74E-42)
            if (r14 == 0) goto L79
            java.util.Set<java.lang.Integer> r14 = r0.migrationNotRequiredFrom
            goto L7b
        L79:
            r14 = r30
        L7b:
            r15 = r1 & 8192(0x2000, float:1.148E-41)
            if (r15 == 0) goto L82
            java.lang.String r15 = r0.copyFromAssetPath
            goto L84
        L82:
            r15 = r31
        L84:
            r18 = r2
            r2 = r1 & 16384(0x4000, float:2.2959E-41)
            if (r2 == 0) goto L8d
            java.io.File r2 = r0.copyFromFile
            goto L8f
        L8d:
            r2 = r32
        L8f:
            r16 = 32768(0x8000, float:4.5918E-41)
            r16 = r1 & r16
            if (r16 == 0) goto L99
            java.util.concurrent.Callable<java.io.InputStream> r1 = r0.copyFromInputStream
            goto L9b
        L99:
            r1 = r33
        L9b:
            r16 = 65536(0x10000, float:9.1835E-41)
            r16 = r40 & r16
            r19 = r1
            if (r16 == 0) goto La6
            androidx.room.RoomDatabase$PrepackagedDatabaseCallback r1 = r0.prepackagedDatabaseCallback
            goto La8
        La6:
            r1 = r34
        La8:
            r16 = 131072(0x20000, float:1.83671E-40)
            r16 = r40 & r16
            r20 = r1
            if (r16 == 0) goto Lb3
            java.util.List<java.lang.Object> r1 = r0.typeConverters
            goto Lb5
        Lb3:
            r1 = r35
        Lb5:
            r16 = 262144(0x40000, float:3.67342E-40)
            r16 = r40 & r16
            r21 = r1
            if (r16 == 0) goto Lc0
            java.util.List<androidx.room.migration.AutoMigrationSpec> r1 = r0.autoMigrationSpecs
            goto Lc2
        Lc0:
            r1 = r36
        Lc2:
            r16 = 524288(0x80000, float:7.34684E-40)
            r16 = r40 & r16
            r22 = r1
            if (r16 == 0) goto Lcd
            boolean r1 = r0.allowDestructiveMigrationForAllTables
            goto Lcf
        Lcd:
            r1 = r37
        Lcf:
            r16 = 1048576(0x100000, float:1.469368E-39)
            r16 = r40 & r16
            r23 = r1
            if (r16 == 0) goto Lda
            androidx.sqlite.SQLiteDriver r1 = r0.sqliteDriver
            goto Ldc
        Lda:
            r1 = r38
        Ldc:
            r16 = 2097152(0x200000, float:2.938736E-39)
            r16 = r40 & r16
            if (r16 == 0) goto L115
            r24 = r1
            kotlin.coroutines.i r1 = r0.queryCoroutineContext
            r39 = r24
            r40 = r1
        Lea:
            r34 = r19
            r35 = r20
            r36 = r21
            r37 = r22
            r38 = r23
            r33 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r6
            r24 = r7
            r25 = r8
            r26 = r9
            r27 = r10
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r19 = r18
            r18 = r0
            goto L11a
        L115:
            r40 = r39
            r39 = r1
            goto Lea
        L11a:
            androidx.room.DatabaseConfiguration r0 = r18.copy(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40)
            return r0
        L11f:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: copy"
            r0.<init>(r1)
            throw r0
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    @org.jetbrains.annotations.NotNull
    public final androidx.room.DatabaseConfiguration copy(@org.jetbrains.annotations.NotNull android.content.Context r25, @org.jetbrains.annotations.Nullable java.lang.String r26, @org.jetbrains.annotations.Nullable androidx.sqlite.db.SupportSQLiteOpenHelper.Factory r27, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.MigrationContainer r28, @org.jetbrains.annotations.Nullable java.util.List<? extends androidx.room.RoomDatabase.Callback> r29, boolean r30, @org.jetbrains.annotations.NotNull androidx.room.RoomDatabase.JournalMode r31, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r32, @org.jetbrains.annotations.NotNull java.util.concurrent.Executor r33, @org.jetbrains.annotations.Nullable android.content.Intent r34, boolean r35, boolean r36, @org.jetbrains.annotations.Nullable java.util.Set<java.lang.Integer> r37, @org.jetbrains.annotations.Nullable java.lang.String r38, @org.jetbrains.annotations.Nullable java.io.File r39, @org.jetbrains.annotations.Nullable java.util.concurrent.Callable<java.io.InputStream> r40, @org.jetbrains.annotations.Nullable androidx.room.RoomDatabase.PrepackagedDatabaseCallback r41, @org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Object> r42, @org.jetbrains.annotations.NotNull java.util.List<? extends androidx.room.migration.AutoMigrationSpec> r43, boolean r44, @org.jetbrains.annotations.Nullable androidx.sqlite.SQLiteDriver r45, @org.jetbrains.annotations.Nullable kotlin.coroutines.i r46) {
            r24 = this;
            java.lang.String r0 = "context"
            r2 = r25
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "migrationContainer"
            r5 = r28
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "journalMode"
            r8 = r31
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "queryExecutor"
            r9 = r32
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "transactionExecutor"
            r10 = r33
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "typeConverters"
            r1 = r42
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "autoMigrationSpecs"
            r3 = r43
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.room.DatabaseConfiguration r1 = new androidx.room.DatabaseConfiguration
            r4 = r27
            r6 = r29
            r7 = r30
            r11 = r34
            r12 = r35
            r13 = r36
            r14 = r37
            r15 = r38
            r16 = r39
            r17 = r40
            r18 = r41
            r19 = r42
            r21 = r44
            r22 = r45
            r23 = r46
            r20 = r3
            r3 = r26
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.util.Set<java.lang.Integer> getMigrationNotRequiredFrom$room_runtime_release() {
            r1 = this;
            java.util.Set<java.lang.Integer> r0 = r1.migrationNotRequiredFrom
            return r0
    }

    public final boolean getUseTempTrackingTable$room_runtime_release() {
            r1 = this;
            boolean r0 = r1.useTempTrackingTable
            return r0
    }

    public boolean isMigrationRequired(int r1, int r2) {
            r0 = this;
            boolean r1 = androidx.room.util.MigrationUtil.isMigrationRequired(r0, r1, r2)
            return r1
    }

    @kotlin.Deprecated(message = "Use [isMigrationRequired(int, int)] which takes\n      [allowDestructiveMigrationOnDowngrade] into account.", replaceWith = @kotlin.ReplaceWith(expression = "isMigrationRequired(version, version + 1)", imports = {}))
    public boolean isMigrationRequiredFrom(int r2) {
            r1 = this;
            int r0 = r2 + 1
            boolean r2 = r1.isMigrationRequired(r2, r0)
            return r2
    }

    public final void setUseTempTrackingTable$room_runtime_release(boolean r1) {
            r0 = this;
            r0.useTempTrackingTable = r1
            return
    }
}

package androidx.work.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.TypeConverters({androidx.work.Data.class, androidx.work.impl.model.WorkTypeConverters.class})
@androidx.room.Database(entities = {androidx.work.impl.model.Dependency.class, androidx.work.impl.model.WorkSpec.class, androidx.work.impl.model.WorkTag.class, androidx.work.impl.model.SystemIdInfo.class, androidx.work.impl.model.WorkName.class, androidx.work.impl.model.WorkProgress.class, androidx.work.impl.model.Preference.class}, version = 12)
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public abstract class WorkDatabase extends androidx.room.RoomDatabase {
    private static final java.lang.String PRUNE_SQL_FORMAT_PREFIX = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < ";
    private static final java.lang.String PRUNE_SQL_FORMAT_SUFFIX = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    private static final long PRUNE_THRESHOLD_MILLIS = 0;



    static {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.DAYS
            r1 = 1
            long r0 = r0.toMillis(r1)
            androidx.work.impl.WorkDatabase.PRUNE_THRESHOLD_MILLIS = r0
            return
    }

    public WorkDatabase() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static androidx.work.impl.WorkDatabase create(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.util.concurrent.Executor r5, boolean r6) {
            java.lang.Class<androidx.work.impl.WorkDatabase> r0 = androidx.work.impl.WorkDatabase.class
            if (r6 == 0) goto Ld
            androidx.room.RoomDatabase$Builder r6 = androidx.room.Room.inMemoryDatabaseBuilder(r4, r0)
            androidx.room.RoomDatabase$Builder r6 = r6.allowMainThreadQueries()
            goto L1d
        Ld:
            java.lang.String r6 = androidx.work.impl.WorkDatabasePathHelper.getWorkDatabaseName()
            androidx.room.RoomDatabase$Builder r6 = androidx.room.Room.databaseBuilder(r4, r0, r6)
            androidx.work.impl.WorkDatabase$1 r0 = new androidx.work.impl.WorkDatabase$1
            r0.<init>(r4)
            r6.openHelperFactory(r0)
        L1d:
            androidx.room.RoomDatabase$Builder r5 = r6.setQueryExecutor(r5)
            androidx.room.RoomDatabase$Callback r6 = generateCleanupCallback()
            androidx.room.RoomDatabase$Builder r5 = r5.addCallback(r6)
            r6 = 1
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r6]
            androidx.room.migration.Migration r1 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_1_2
            r2 = 0
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r5 = r5.addMigrations(r0)
            androidx.work.impl.WorkDatabaseMigrations$RescheduleMigration r0 = new androidx.work.impl.WorkDatabaseMigrations$RescheduleMigration
            r1 = 2
            r3 = 3
            r0.<init>(r4, r1, r3)
            androidx.room.migration.Migration[] r1 = new androidx.room.migration.Migration[r6]
            r1[r2] = r0
            androidx.room.RoomDatabase$Builder r5 = r5.addMigrations(r1)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r6]
            androidx.room.migration.Migration r1 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_3_4
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r5 = r5.addMigrations(r0)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r6]
            androidx.room.migration.Migration r1 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_4_5
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r5 = r5.addMigrations(r0)
            androidx.work.impl.WorkDatabaseMigrations$RescheduleMigration r0 = new androidx.work.impl.WorkDatabaseMigrations$RescheduleMigration
            r1 = 5
            r3 = 6
            r0.<init>(r4, r1, r3)
            androidx.room.migration.Migration[] r1 = new androidx.room.migration.Migration[r6]
            r1[r2] = r0
            androidx.room.RoomDatabase$Builder r5 = r5.addMigrations(r1)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r6]
            androidx.room.migration.Migration r1 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_6_7
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r5 = r5.addMigrations(r0)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r6]
            androidx.room.migration.Migration r1 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_7_8
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r5 = r5.addMigrations(r0)
            androidx.room.migration.Migration[] r0 = new androidx.room.migration.Migration[r6]
            androidx.room.migration.Migration r1 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_8_9
            r0[r2] = r1
            androidx.room.RoomDatabase$Builder r5 = r5.addMigrations(r0)
            androidx.work.impl.WorkDatabaseMigrations$WorkMigration9To10 r0 = new androidx.work.impl.WorkDatabaseMigrations$WorkMigration9To10
            r0.<init>(r4)
            androidx.room.migration.Migration[] r1 = new androidx.room.migration.Migration[r6]
            r1[r2] = r0
            androidx.room.RoomDatabase$Builder r5 = r5.addMigrations(r1)
            androidx.work.impl.WorkDatabaseMigrations$RescheduleMigration r0 = new androidx.work.impl.WorkDatabaseMigrations$RescheduleMigration
            r1 = 10
            r3 = 11
            r0.<init>(r4, r1, r3)
            androidx.room.migration.Migration[] r4 = new androidx.room.migration.Migration[r6]
            r4[r2] = r0
            androidx.room.RoomDatabase$Builder r4 = r5.addMigrations(r4)
            androidx.room.migration.Migration[] r5 = new androidx.room.migration.Migration[r6]
            androidx.room.migration.Migration r6 = androidx.work.impl.WorkDatabaseMigrations.MIGRATION_11_12
            r5[r2] = r6
            androidx.room.RoomDatabase$Builder r4 = r4.addMigrations(r5)
            androidx.room.RoomDatabase$Builder r4 = r4.fallbackToDestructiveMigration()
            androidx.room.RoomDatabase r4 = r4.build()
            androidx.work.impl.WorkDatabase r4 = (androidx.work.impl.WorkDatabase) r4
            return r4
    }

    static androidx.room.RoomDatabase.Callback generateCleanupCallback() {
            androidx.work.impl.WorkDatabase$2 r0 = new androidx.work.impl.WorkDatabase$2
            r0.<init>()
            return r0
    }

    static long getPruneDate() {
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = androidx.work.impl.WorkDatabase.PRUNE_THRESHOLD_MILLIS
            long r0 = r0 - r2
            return r0
    }

    @androidx.annotation.NonNull
    static java.lang.String getPruneSQL() {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (period_start_time + minimum_retention_duration) < "
            r0.append(r1)
            long r1 = getPruneDate()
            r0.append(r1)
            java.lang.String r1 = " AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @androidx.annotation.NonNull
    public abstract androidx.work.impl.model.DependencyDao dependencyDao();

    @androidx.annotation.NonNull
    public abstract androidx.work.impl.model.PreferenceDao preferenceDao();

    @androidx.annotation.NonNull
    public abstract androidx.work.impl.model.RawWorkInfoDao rawWorkInfoDao();

    @androidx.annotation.NonNull
    public abstract androidx.work.impl.model.SystemIdInfoDao systemIdInfoDao();

    @androidx.annotation.NonNull
    public abstract androidx.work.impl.model.WorkNameDao workNameDao();

    @androidx.annotation.NonNull
    public abstract androidx.work.impl.model.WorkProgressDao workProgressDao();

    @androidx.annotation.NonNull
    public abstract androidx.work.impl.model.WorkSpecDao workSpecDao();

    @androidx.annotation.NonNull
    public abstract androidx.work.impl.model.WorkTagDao workTagDao();
}

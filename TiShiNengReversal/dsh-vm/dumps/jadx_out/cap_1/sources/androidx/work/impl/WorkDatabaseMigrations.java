package androidx.work.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class WorkDatabaseMigrations {
    private static final java.lang.String CREATE_INDEX_PERIOD_START_TIME = "CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)";
    private static final java.lang.String CREATE_OUT_OF_QUOTA_POLICY = "ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0";
    private static final java.lang.String CREATE_PREFERENCE = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))";
    private static final java.lang.String CREATE_RUN_IN_FOREGROUND = "ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0";
    private static final java.lang.String CREATE_SYSTEM_ID_INFO = "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";
    private static final java.lang.String CREATE_WORK_PROGRESS = "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )";
    public static final java.lang.String INSERT_PREFERENCE = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)";
    private static final java.lang.String MIGRATE_ALARM_INFO_TO_SYSTEM_ID_INFO = "INSERT INTO SystemIdInfo(work_spec_id, system_id) SELECT work_spec_id, alarm_id AS system_id FROM alarmInfo";

    @androidx.annotation.NonNull
    public static androidx.room.migration.Migration MIGRATION_11_12 = null;

    @androidx.annotation.NonNull
    public static androidx.room.migration.Migration MIGRATION_1_2 = null;

    @androidx.annotation.NonNull
    public static androidx.room.migration.Migration MIGRATION_3_4 = null;

    @androidx.annotation.NonNull
    public static androidx.room.migration.Migration MIGRATION_4_5 = null;

    @androidx.annotation.NonNull
    public static androidx.room.migration.Migration MIGRATION_6_7 = null;

    @androidx.annotation.NonNull
    public static androidx.room.migration.Migration MIGRATION_7_8 = null;

    @androidx.annotation.NonNull
    public static androidx.room.migration.Migration MIGRATION_8_9 = null;
    private static final java.lang.String PERIODIC_WORK_SET_SCHEDULE_REQUESTED_AT = "UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0";
    private static final java.lang.String REMOVE_ALARM_INFO = "DROP TABLE IF EXISTS alarmInfo";
    public static final int VERSION_1 = 1;
    public static final int VERSION_10 = 10;
    public static final int VERSION_11 = 11;
    public static final int VERSION_12 = 12;
    public static final int VERSION_2 = 2;
    public static final int VERSION_3 = 3;
    public static final int VERSION_4 = 4;
    public static final int VERSION_5 = 5;
    public static final int VERSION_6 = 6;
    public static final int VERSION_7 = 7;
    public static final int VERSION_8 = 8;
    public static final int VERSION_9 = 9;
    private static final java.lang.String WORKSPEC_ADD_TRIGGER_MAX_CONTENT_DELAY = "ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1";
    private static final java.lang.String WORKSPEC_ADD_TRIGGER_UPDATE_DELAY = "ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1";








    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class RescheduleMigration extends androidx.room.migration.Migration {
        final android.content.Context mContext;

        public RescheduleMigration(@androidx.annotation.NonNull android.content.Context r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r2, r3)
                r0.mContext = r1
                return
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@androidx.annotation.NonNull androidx.sqlite.db.SupportSQLiteDatabase r6) {
                r5 = this;
                int r0 = r5.endVersion
                r1 = 10
                r2 = 0
                r3 = 1
                java.lang.String r4 = "reschedule_needed"
                if (r0 < r1) goto L1b
                java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r2] = r4
                r1[r3] = r0
                java.lang.String r0 = "INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)"
                r6.execSQL(r0, r1)
                return
            L1b:
                android.content.Context r6 = r5.mContext
                java.lang.String r0 = "androidx.work.util.preferences"
                android.content.SharedPreferences r6 = r6.getSharedPreferences(r0, r2)
                android.content.SharedPreferences$Editor r6 = r6.edit()
                android.content.SharedPreferences$Editor r6 = r6.putBoolean(r4, r3)
                r6.apply()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class WorkMigration9To10 extends androidx.room.migration.Migration {
        final android.content.Context mContext;

        public WorkMigration9To10(@androidx.annotation.NonNull android.content.Context r3) {
                r2 = this;
                r0 = 9
                r1 = 10
                r2.<init>(r0, r1)
                r2.mContext = r3
                return
        }

        @Override // androidx.room.migration.Migration
        public void migrate(@androidx.annotation.NonNull androidx.sqlite.db.SupportSQLiteDatabase r2) {
                r1 = this;
                java.lang.String r0 = "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))"
                r2.execSQL(r0)
                android.content.Context r0 = r1.mContext
                androidx.work.impl.utils.PreferenceUtils.migrateLegacyPreferences(r0, r2)
                android.content.Context r0 = r1.mContext
                androidx.work.impl.utils.IdGenerator.migrateLegacyIdGenerator(r0, r2)
                return
        }
    }

    static {
            androidx.work.impl.WorkDatabaseMigrations$1 r0 = new androidx.work.impl.WorkDatabaseMigrations$1
            r1 = 1
            r2 = 2
            r0.<init>(r1, r2)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_1_2 = r0
            androidx.work.impl.WorkDatabaseMigrations$2 r0 = new androidx.work.impl.WorkDatabaseMigrations$2
            r1 = 3
            r2 = 4
            r0.<init>(r1, r2)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_3_4 = r0
            androidx.work.impl.WorkDatabaseMigrations$3 r0 = new androidx.work.impl.WorkDatabaseMigrations$3
            r1 = 5
            r0.<init>(r2, r1)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_4_5 = r0
            androidx.work.impl.WorkDatabaseMigrations$4 r0 = new androidx.work.impl.WorkDatabaseMigrations$4
            r1 = 6
            r2 = 7
            r0.<init>(r1, r2)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_6_7 = r0
            androidx.work.impl.WorkDatabaseMigrations$5 r0 = new androidx.work.impl.WorkDatabaseMigrations$5
            r1 = 8
            r0.<init>(r2, r1)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_7_8 = r0
            androidx.work.impl.WorkDatabaseMigrations$6 r0 = new androidx.work.impl.WorkDatabaseMigrations$6
            r2 = 9
            r0.<init>(r1, r2)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_8_9 = r0
            androidx.work.impl.WorkDatabaseMigrations$7 r0 = new androidx.work.impl.WorkDatabaseMigrations$7
            r1 = 11
            r2 = 12
            r0.<init>(r1, r2)
            androidx.work.impl.WorkDatabaseMigrations.MIGRATION_11_12 = r0
            return
    }

    private WorkDatabaseMigrations() {
            r0 = this;
            r0.<init>()
            return
    }
}

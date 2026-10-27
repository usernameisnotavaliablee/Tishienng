package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class WorkSpecDao_Impl implements androidx.work.impl.model.WorkSpecDao {
    private final androidx.room.RoomDatabase __db;
    private final androidx.room.EntityInsertionAdapter<androidx.work.impl.model.WorkSpec> __insertionAdapterOfWorkSpec;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfDelete;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfIncrementWorkSpecRunAttemptCount;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfMarkWorkSpecScheduled;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfResetScheduledState;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfResetWorkSpecRunAttemptCount;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfSetOutput;
    private final androidx.room.SharedSQLiteStatement __preparedStmtOfSetPeriodStartTime;















    public WorkSpecDao_Impl(androidx.room.RoomDatabase r2) {
            r1 = this;
            r1.<init>()
            r1.__db = r2
            androidx.work.impl.model.WorkSpecDao_Impl$1 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$1
            r0.<init>(r1, r2)
            r1.__insertionAdapterOfWorkSpec = r0
            androidx.work.impl.model.WorkSpecDao_Impl$2 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$2
            r0.<init>(r1, r2)
            r1.__preparedStmtOfDelete = r0
            androidx.work.impl.model.WorkSpecDao_Impl$3 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$3
            r0.<init>(r1, r2)
            r1.__preparedStmtOfSetOutput = r0
            androidx.work.impl.model.WorkSpecDao_Impl$4 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$4
            r0.<init>(r1, r2)
            r1.__preparedStmtOfSetPeriodStartTime = r0
            androidx.work.impl.model.WorkSpecDao_Impl$5 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$5
            r0.<init>(r1, r2)
            r1.__preparedStmtOfIncrementWorkSpecRunAttemptCount = r0
            androidx.work.impl.model.WorkSpecDao_Impl$6 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$6
            r0.<init>(r1, r2)
            r1.__preparedStmtOfResetWorkSpecRunAttemptCount = r0
            androidx.work.impl.model.WorkSpecDao_Impl$7 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$7
            r0.<init>(r1, r2)
            r1.__preparedStmtOfMarkWorkSpecScheduled = r0
            androidx.work.impl.model.WorkSpecDao_Impl$8 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$8
            r0.<init>(r1, r2)
            r1.__preparedStmtOfResetScheduledState = r0
            androidx.work.impl.model.WorkSpecDao_Impl$9 r0 = new androidx.work.impl.model.WorkSpecDao_Impl$9
            r0.<init>(r1, r2)
            r1.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast = r0
            return
    }

    private void __fetchRelationshipWorkProgressAsandroidxWorkData(androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<androidx.work.Data>> r9) {
            r8 = this;
            java.util.Set r0 = r9.keySet()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            goto L44
        Lb:
            int r1 = r9.size()
            r2 = 999(0x3e7, float:1.4E-42)
            r3 = 0
            if (r1 <= r2) goto L45
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>(r2)
            int r1 = r9.size()
            r4 = 0
        L1e:
            r5 = 0
        L1f:
            if (r4 >= r1) goto L3f
            java.lang.Object r6 = r9.keyAt(r4)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.valueAt(r4)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r0.put(r6, r7)
            int r4 = r4 + 1
            int r5 = r5 + 1
            if (r5 != r2) goto L1f
            r8.__fetchRelationshipWorkProgressAsandroidxWorkData(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>(r2)
            goto L1e
        L3f:
            if (r5 <= 0) goto L44
            r8.__fetchRelationshipWorkProgressAsandroidxWorkData(r0)
        L44:
            return
        L45:
            java.lang.StringBuilder r1 = androidx.room.util.StringUtil.newStringBuilder()
            java.lang.String r2 = "SELECT `progress`,`work_spec_id` FROM `WorkProgress` WHERE `work_spec_id` IN ("
            r1.append(r2)
            int r2 = r0.size()
            androidx.room.util.StringUtil.appendPlaceholders(r1, r2)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            androidx.room.RoomSQLiteQuery r1 = androidx.room.RoomSQLiteQuery.acquire(r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
        L67:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L79
            r1.bindNull(r2)
            goto L7c
        L79:
            r1.bindString(r2, r4)
        L7c:
            int r2 = r2 + 1
            goto L67
        L7f:
            androidx.room.RoomDatabase r0 = r8.__db
            r2 = 0
            android.database.Cursor r0 = androidx.room.util.DBUtil.query(r0, r1, r3, r2)
            java.lang.String r1 = "work_spec_id"
            int r1 = androidx.room.util.CursorUtil.getColumnIndex(r0, r1)     // Catch: java.lang.Throwable -> Lb8
            r2 = -1
            if (r1 != r2) goto L94
            r0.close()
            return
        L94:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto Lba
            boolean r2 = r0.isNull(r1)     // Catch: java.lang.Throwable -> Lb8
            if (r2 != 0) goto L94
            java.lang.String r2 = r0.getString(r1)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r2 = r9.get(r2)     // Catch: java.lang.Throwable -> Lb8
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> Lb8
            if (r2 == 0) goto L94
            byte[] r4 = r0.getBlob(r3)     // Catch: java.lang.Throwable -> Lb8
            androidx.work.Data r4 = androidx.work.Data.fromByteArray(r4)     // Catch: java.lang.Throwable -> Lb8
            r2.add(r4)     // Catch: java.lang.Throwable -> Lb8
            goto L94
        Lb8:
            r9 = move-exception
            goto Lbe
        Lba:
            r0.close()
            return
        Lbe:
            r0.close()
            throw r9
    }

    private void __fetchRelationshipWorkTagAsjavaLangString(androidx.collection.ArrayMap<java.lang.String, java.util.ArrayList<java.lang.String>> r9) {
            r8 = this;
            java.util.Set r0 = r9.keySet()
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto Lb
            goto L44
        Lb:
            int r1 = r9.size()
            r2 = 999(0x3e7, float:1.4E-42)
            r3 = 0
            if (r1 <= r2) goto L45
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>(r2)
            int r1 = r9.size()
            r4 = 0
        L1e:
            r5 = 0
        L1f:
            if (r4 >= r1) goto L3f
            java.lang.Object r6 = r9.keyAt(r4)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r7 = r9.valueAt(r4)
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            r0.put(r6, r7)
            int r4 = r4 + 1
            int r5 = r5 + 1
            if (r5 != r2) goto L1f
            r8.__fetchRelationshipWorkTagAsjavaLangString(r0)
            androidx.collection.ArrayMap r0 = new androidx.collection.ArrayMap
            r0.<init>(r2)
            goto L1e
        L3f:
            if (r5 <= 0) goto L44
            r8.__fetchRelationshipWorkTagAsjavaLangString(r0)
        L44:
            return
        L45:
            java.lang.StringBuilder r1 = androidx.room.util.StringUtil.newStringBuilder()
            java.lang.String r2 = "SELECT `tag`,`work_spec_id` FROM `WorkTag` WHERE `work_spec_id` IN ("
            r1.append(r2)
            int r2 = r0.size()
            androidx.room.util.StringUtil.appendPlaceholders(r1, r2)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            androidx.room.RoomSQLiteQuery r1 = androidx.room.RoomSQLiteQuery.acquire(r1, r2)
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
        L67:
            boolean r4 = r0.hasNext()
            if (r4 == 0) goto L7f
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L79
            r1.bindNull(r2)
            goto L7c
        L79:
            r1.bindString(r2, r4)
        L7c:
            int r2 = r2 + 1
            goto L67
        L7f:
            androidx.room.RoomDatabase r0 = r8.__db
            r2 = 0
            android.database.Cursor r0 = androidx.room.util.DBUtil.query(r0, r1, r3, r2)
            java.lang.String r1 = "work_spec_id"
            int r1 = androidx.room.util.CursorUtil.getColumnIndex(r0, r1)     // Catch: java.lang.Throwable -> Lb4
            r2 = -1
            if (r1 != r2) goto L94
            r0.close()
            return
        L94:
            boolean r2 = r0.moveToNext()     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto Lb6
            boolean r2 = r0.isNull(r1)     // Catch: java.lang.Throwable -> Lb4
            if (r2 != 0) goto L94
            java.lang.String r2 = r0.getString(r1)     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r2 = r9.get(r2)     // Catch: java.lang.Throwable -> Lb4
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> Lb4
            if (r2 == 0) goto L94
            java.lang.String r4 = r0.getString(r3)     // Catch: java.lang.Throwable -> Lb4
            r2.add(r4)     // Catch: java.lang.Throwable -> Lb4
            goto L94
        Lb4:
            r9 = move-exception
            goto Lba
        Lb6:
            r0.close()
            return
        Lba:
            r0.close()
            throw r9
    }

    static /* synthetic */ androidx.room.RoomDatabase access$000(androidx.work.impl.model.WorkSpecDao_Impl r0) {
            androidx.room.RoomDatabase r0 = r0.__db
            return r0
    }

    static /* synthetic */ void access$100(androidx.work.impl.model.WorkSpecDao_Impl r0, androidx.collection.ArrayMap r1) {
            r0.__fetchRelationshipWorkTagAsjavaLangString(r1)
            return
    }

    static /* synthetic */ void access$200(androidx.work.impl.model.WorkSpecDao_Impl r0, androidx.collection.ArrayMap r1) {
            r0.__fetchRelationshipWorkProgressAsandroidxWorkData(r1)
            return
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void delete(java.lang.String r3) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfDelete
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            r1 = 1
            if (r3 != 0) goto L12
            r0.bindNull(r1)
            goto L15
        L12:
            r0.bindString(r1, r3)
        L15:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L2d
            androidx.room.RoomDatabase r3 = r2.__db     // Catch: java.lang.Throwable -> L2d
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2d
            androidx.room.RoomDatabase r3 = r2.__db
            r3.endTransaction()
            androidx.room.SharedSQLiteStatement r3 = r2.__preparedStmtOfDelete
            r3.release(r0)
            return
        L2d:
            r3 = move-exception
            androidx.room.RoomDatabase r1 = r2.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r2.__preparedStmtOfDelete
            r1.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getAllEligibleWorkSpecsForScheduling(int r34) {
            r33 = this;
            r1 = r33
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT ?"
            r2 = 1
            androidx.room.RoomSQLiteQuery r3 = androidx.room.RoomSQLiteQuery.acquire(r0, r2)
            r0 = r34
            long r4 = (long) r0
            r3.bindLong(r2, r4)
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r4 = 0
            r5 = 0
            android.database.Cursor r4 = androidx.room.util.DBUtil.query(r0, r3, r5, r4)
            java.lang.String r0 = "required_network_type"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r0)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r6 = "requires_charging"
            int r6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r6)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r7 = "requires_device_idle"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r7)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r8 = "requires_battery_not_low"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r8)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r9 = "requires_storage_not_low"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r9)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r10 = "trigger_content_update_delay"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r10)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r11 = "trigger_max_content_delay"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r11)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r12 = "content_uri_triggers"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r12)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r13 = "id"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r13)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r14 = "state"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r14)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r15 = "worker_class_name"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r15)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r2 = "input_merger_class_name"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r5 = "input"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r5)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r1 = "output"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r1)     // Catch: java.lang.Throwable -> L21f
            r16 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r17 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r18 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r19 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r20 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r21 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r22 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r23 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r24 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r25 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r26 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r27 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L216
            r28 = r1
            int r1 = r4.getCount()     // Catch: java.lang.Throwable -> L216
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L216
        Ld6:
            boolean r1 = r4.moveToNext()     // Catch: java.lang.Throwable -> L216
            if (r1 == 0) goto L218
            java.lang.String r1 = r4.getString(r13)     // Catch: java.lang.Throwable -> L216
            r29 = r13
            java.lang.String r13 = r4.getString(r15)     // Catch: java.lang.Throwable -> L216
            r30 = r15
            androidx.work.Constraints r15 = new androidx.work.Constraints     // Catch: java.lang.Throwable -> L216
            r15.<init>()     // Catch: java.lang.Throwable -> L216
            int r31 = r4.getInt(r0)     // Catch: java.lang.Throwable -> L216
            r32 = r0
            androidx.work.NetworkType r0 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r31)     // Catch: java.lang.Throwable -> L216
            r15.setRequiredNetworkType(r0)     // Catch: java.lang.Throwable -> L216
            int r0 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L216
            if (r0 == 0) goto L102
            r0 = 1
            goto L103
        L102:
            r0 = 0
        L103:
            r15.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L216
            int r0 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L216
            if (r0 == 0) goto L10e
            r0 = 1
            goto L10f
        L10e:
            r0 = 0
        L10f:
            r15.setRequiresDeviceIdle(r0)     // Catch: java.lang.Throwable -> L216
            int r0 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L216
            if (r0 == 0) goto L11a
            r0 = 1
            goto L11b
        L11a:
            r0 = 0
        L11b:
            r15.setRequiresBatteryNotLow(r0)     // Catch: java.lang.Throwable -> L216
            int r0 = r4.getInt(r9)     // Catch: java.lang.Throwable -> L216
            if (r0 == 0) goto L126
            r0 = 1
            goto L127
        L126:
            r0 = 0
        L127:
            r15.setRequiresStorageNotLow(r0)     // Catch: java.lang.Throwable -> L216
            r0 = r6
            r31 = r7
            long r6 = r4.getLong(r10)     // Catch: java.lang.Throwable -> L216
            r15.setTriggerContentUpdateDelay(r6)     // Catch: java.lang.Throwable -> L216
            long r6 = r4.getLong(r11)     // Catch: java.lang.Throwable -> L216
            r15.setTriggerMaxContentDelay(r6)     // Catch: java.lang.Throwable -> L216
            byte[] r6 = r4.getBlob(r12)     // Catch: java.lang.Throwable -> L216
            androidx.work.ContentUriTriggers r6 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L216
            r15.setContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L216
            androidx.work.impl.model.WorkSpec r6 = new androidx.work.impl.model.WorkSpec     // Catch: java.lang.Throwable -> L216
            r6.<init>(r1, r13)     // Catch: java.lang.Throwable -> L216
            int r1 = r4.getInt(r14)     // Catch: java.lang.Throwable -> L216
            androidx.work.WorkInfo$State r1 = androidx.work.impl.model.WorkTypeConverters.intToState(r1)     // Catch: java.lang.Throwable -> L216
            r6.state = r1     // Catch: java.lang.Throwable -> L216
            java.lang.String r1 = r4.getString(r2)     // Catch: java.lang.Throwable -> L216
            r6.inputMergerClassName = r1     // Catch: java.lang.Throwable -> L216
            byte[] r1 = r4.getBlob(r5)     // Catch: java.lang.Throwable -> L216
            androidx.work.Data r1 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L216
            r6.input = r1     // Catch: java.lang.Throwable -> L216
            r1 = r28
            byte[] r7 = r4.getBlob(r1)     // Catch: java.lang.Throwable -> L216
            androidx.work.Data r7 = androidx.work.Data.fromByteArray(r7)     // Catch: java.lang.Throwable -> L216
            r6.output = r7     // Catch: java.lang.Throwable -> L216
            r13 = r0
            r28 = r1
            r7 = r17
            long r0 = r4.getLong(r7)     // Catch: java.lang.Throwable -> L216
            r6.initialDelay = r0     // Catch: java.lang.Throwable -> L216
            r17 = r2
            r0 = r18
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L216
            r6.intervalDuration = r1     // Catch: java.lang.Throwable -> L216
            r18 = r7
            r2 = r8
            r1 = r19
            long r7 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L216
            r6.flexDuration = r7     // Catch: java.lang.Throwable -> L216
            r7 = r20
            int r8 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L216
            r6.runAttemptCount = r8     // Catch: java.lang.Throwable -> L216
            r8 = r21
            int r19 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L216
            r20 = r0
            androidx.work.BackoffPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r19)     // Catch: java.lang.Throwable -> L216
            r6.backoffPolicy = r0     // Catch: java.lang.Throwable -> L216
            r19 = r1
            r21 = r2
            r0 = r22
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L216
            r6.backoffDelayDuration = r1     // Catch: java.lang.Throwable -> L216
            r2 = r7
            r22 = r8
            r1 = r23
            long r7 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L216
            r6.periodStartTime = r7     // Catch: java.lang.Throwable -> L216
            r8 = r0
            r23 = r1
            r7 = r24
            long r0 = r4.getLong(r7)     // Catch: java.lang.Throwable -> L216
            r6.minimumRetentionDuration = r0     // Catch: java.lang.Throwable -> L216
            r24 = r2
            r0 = r25
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L216
            r6.scheduleRequestedAt = r1     // Catch: java.lang.Throwable -> L216
            r1 = r26
            int r2 = r4.getInt(r1)     // Catch: java.lang.Throwable -> L216
            if (r2 == 0) goto L1dd
            r2 = 1
            goto L1de
        L1dd:
            r2 = 0
        L1de:
            r6.expedited = r2     // Catch: java.lang.Throwable -> L216
            r2 = r27
            int r25 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L216
            r26 = r0
            androidx.work.OutOfQuotaPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r25)     // Catch: java.lang.Throwable -> L216
            r6.outOfQuotaPolicy = r0     // Catch: java.lang.Throwable -> L216
            r6.constraints = r15     // Catch: java.lang.Throwable -> L216
            r3.add(r6)     // Catch: java.lang.Throwable -> L216
            r0 = r22
            r22 = r8
            r8 = r21
            r21 = r0
            r27 = r2
            r6 = r13
            r2 = r17
            r17 = r18
            r18 = r20
            r20 = r24
            r25 = r26
            r13 = r29
            r15 = r30
            r0 = r32
            r26 = r1
            r24 = r7
            r7 = r31
            goto Ld6
        L216:
            r0 = move-exception
            goto L222
        L218:
            r4.close()
            r16.release()
            return r3
        L21f:
            r0 = move-exception
            r16 = r3
        L222:
            r4.close()
            r16.release()
            throw r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<java.lang.String> getAllUnfinishedWork() {
            r5 = this;
            java.lang.String r0 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)"
            r1 = 0
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            androidx.room.RoomDatabase r2 = r5.__db
            r2.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r2 = r5.__db
            r3 = 0
            android.database.Cursor r2 = androidx.room.util.DBUtil.query(r2, r0, r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            int r4 = r2.getCount()     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2a
        L1c:
            boolean r4 = r2.moveToNext()     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L2c
            java.lang.String r4 = r2.getString(r1)     // Catch: java.lang.Throwable -> L2a
            r3.add(r4)     // Catch: java.lang.Throwable -> L2a
            goto L1c
        L2a:
            r1 = move-exception
            goto L33
        L2c:
            r2.close()
            r0.release()
            return r3
        L33:
            r2.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<java.lang.String> getAllWorkSpecIds() {
            r5 = this;
            java.lang.String r0 = "SELECT id FROM workspec"
            r1 = 0
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            androidx.room.RoomDatabase r2 = r5.__db
            r2.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r2 = r5.__db
            r3 = 0
            android.database.Cursor r2 = androidx.room.util.DBUtil.query(r2, r0, r1, r3)
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2a
            int r4 = r2.getCount()     // Catch: java.lang.Throwable -> L2a
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2a
        L1c:
            boolean r4 = r2.moveToNext()     // Catch: java.lang.Throwable -> L2a
            if (r4 == 0) goto L2c
            java.lang.String r4 = r2.getString(r1)     // Catch: java.lang.Throwable -> L2a
            r3.add(r4)     // Catch: java.lang.Throwable -> L2a
            goto L1c
        L2a:
            r1 = move-exception
            goto L33
        L2c:
            r2.close()
            r0.release()
            return r3
        L33:
            r2.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getAllWorkSpecIdsLiveData() {
            r4 = this;
            java.lang.String r0 = "SELECT id FROM workspec"
            r1 = 0
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            androidx.room.RoomDatabase r1 = r4.__db
            androidx.room.InvalidationTracker r1 = r1.getInvalidationTracker()
            java.lang.String r2 = "workspec"
            java.lang.String[] r2 = new java.lang.String[]{r2}
            androidx.work.impl.model.WorkSpecDao_Impl$10 r3 = new androidx.work.impl.model.WorkSpecDao_Impl$10
            r3.<init>(r4, r0)
            r0 = 1
            androidx.lifecycle.LiveData r0 = r1.createLiveData(r2, r0, r3)
            return r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getEligibleWorkForScheduling(int r34) {
            r33 = this;
            r1 = r33
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(?-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))"
            r2 = 1
            androidx.room.RoomSQLiteQuery r3 = androidx.room.RoomSQLiteQuery.acquire(r0, r2)
            r0 = r34
            long r4 = (long) r0
            r3.bindLong(r2, r4)
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r4 = 0
            r5 = 0
            android.database.Cursor r4 = androidx.room.util.DBUtil.query(r0, r3, r5, r4)
            java.lang.String r0 = "required_network_type"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r0)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r6 = "requires_charging"
            int r6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r6)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r7 = "requires_device_idle"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r7)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r8 = "requires_battery_not_low"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r8)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r9 = "requires_storage_not_low"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r9)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r10 = "trigger_content_update_delay"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r10)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r11 = "trigger_max_content_delay"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r11)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r12 = "content_uri_triggers"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r12)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r13 = "id"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r13)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r14 = "state"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r14)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r15 = "worker_class_name"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r15)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r2 = "input_merger_class_name"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r5 = "input"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r5)     // Catch: java.lang.Throwable -> L21f
            java.lang.String r1 = "output"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r1)     // Catch: java.lang.Throwable -> L21f
            r16 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r17 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r18 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r19 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r20 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r21 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r22 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r23 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r24 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r25 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r26 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L216
            r27 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L216
            r28 = r1
            int r1 = r4.getCount()     // Catch: java.lang.Throwable -> L216
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L216
        Ld6:
            boolean r1 = r4.moveToNext()     // Catch: java.lang.Throwable -> L216
            if (r1 == 0) goto L218
            java.lang.String r1 = r4.getString(r13)     // Catch: java.lang.Throwable -> L216
            r29 = r13
            java.lang.String r13 = r4.getString(r15)     // Catch: java.lang.Throwable -> L216
            r30 = r15
            androidx.work.Constraints r15 = new androidx.work.Constraints     // Catch: java.lang.Throwable -> L216
            r15.<init>()     // Catch: java.lang.Throwable -> L216
            int r31 = r4.getInt(r0)     // Catch: java.lang.Throwable -> L216
            r32 = r0
            androidx.work.NetworkType r0 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r31)     // Catch: java.lang.Throwable -> L216
            r15.setRequiredNetworkType(r0)     // Catch: java.lang.Throwable -> L216
            int r0 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L216
            if (r0 == 0) goto L102
            r0 = 1
            goto L103
        L102:
            r0 = 0
        L103:
            r15.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L216
            int r0 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L216
            if (r0 == 0) goto L10e
            r0 = 1
            goto L10f
        L10e:
            r0 = 0
        L10f:
            r15.setRequiresDeviceIdle(r0)     // Catch: java.lang.Throwable -> L216
            int r0 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L216
            if (r0 == 0) goto L11a
            r0 = 1
            goto L11b
        L11a:
            r0 = 0
        L11b:
            r15.setRequiresBatteryNotLow(r0)     // Catch: java.lang.Throwable -> L216
            int r0 = r4.getInt(r9)     // Catch: java.lang.Throwable -> L216
            if (r0 == 0) goto L126
            r0 = 1
            goto L127
        L126:
            r0 = 0
        L127:
            r15.setRequiresStorageNotLow(r0)     // Catch: java.lang.Throwable -> L216
            r0 = r6
            r31 = r7
            long r6 = r4.getLong(r10)     // Catch: java.lang.Throwable -> L216
            r15.setTriggerContentUpdateDelay(r6)     // Catch: java.lang.Throwable -> L216
            long r6 = r4.getLong(r11)     // Catch: java.lang.Throwable -> L216
            r15.setTriggerMaxContentDelay(r6)     // Catch: java.lang.Throwable -> L216
            byte[] r6 = r4.getBlob(r12)     // Catch: java.lang.Throwable -> L216
            androidx.work.ContentUriTriggers r6 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L216
            r15.setContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L216
            androidx.work.impl.model.WorkSpec r6 = new androidx.work.impl.model.WorkSpec     // Catch: java.lang.Throwable -> L216
            r6.<init>(r1, r13)     // Catch: java.lang.Throwable -> L216
            int r1 = r4.getInt(r14)     // Catch: java.lang.Throwable -> L216
            androidx.work.WorkInfo$State r1 = androidx.work.impl.model.WorkTypeConverters.intToState(r1)     // Catch: java.lang.Throwable -> L216
            r6.state = r1     // Catch: java.lang.Throwable -> L216
            java.lang.String r1 = r4.getString(r2)     // Catch: java.lang.Throwable -> L216
            r6.inputMergerClassName = r1     // Catch: java.lang.Throwable -> L216
            byte[] r1 = r4.getBlob(r5)     // Catch: java.lang.Throwable -> L216
            androidx.work.Data r1 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L216
            r6.input = r1     // Catch: java.lang.Throwable -> L216
            r1 = r28
            byte[] r7 = r4.getBlob(r1)     // Catch: java.lang.Throwable -> L216
            androidx.work.Data r7 = androidx.work.Data.fromByteArray(r7)     // Catch: java.lang.Throwable -> L216
            r6.output = r7     // Catch: java.lang.Throwable -> L216
            r13 = r0
            r28 = r1
            r7 = r17
            long r0 = r4.getLong(r7)     // Catch: java.lang.Throwable -> L216
            r6.initialDelay = r0     // Catch: java.lang.Throwable -> L216
            r17 = r2
            r0 = r18
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L216
            r6.intervalDuration = r1     // Catch: java.lang.Throwable -> L216
            r18 = r7
            r2 = r8
            r1 = r19
            long r7 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L216
            r6.flexDuration = r7     // Catch: java.lang.Throwable -> L216
            r7 = r20
            int r8 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L216
            r6.runAttemptCount = r8     // Catch: java.lang.Throwable -> L216
            r8 = r21
            int r19 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L216
            r20 = r0
            androidx.work.BackoffPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r19)     // Catch: java.lang.Throwable -> L216
            r6.backoffPolicy = r0     // Catch: java.lang.Throwable -> L216
            r19 = r1
            r21 = r2
            r0 = r22
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L216
            r6.backoffDelayDuration = r1     // Catch: java.lang.Throwable -> L216
            r2 = r7
            r22 = r8
            r1 = r23
            long r7 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L216
            r6.periodStartTime = r7     // Catch: java.lang.Throwable -> L216
            r8 = r0
            r23 = r1
            r7 = r24
            long r0 = r4.getLong(r7)     // Catch: java.lang.Throwable -> L216
            r6.minimumRetentionDuration = r0     // Catch: java.lang.Throwable -> L216
            r24 = r2
            r0 = r25
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L216
            r6.scheduleRequestedAt = r1     // Catch: java.lang.Throwable -> L216
            r1 = r26
            int r2 = r4.getInt(r1)     // Catch: java.lang.Throwable -> L216
            if (r2 == 0) goto L1dd
            r2 = 1
            goto L1de
        L1dd:
            r2 = 0
        L1de:
            r6.expedited = r2     // Catch: java.lang.Throwable -> L216
            r2 = r27
            int r25 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L216
            r26 = r0
            androidx.work.OutOfQuotaPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r25)     // Catch: java.lang.Throwable -> L216
            r6.outOfQuotaPolicy = r0     // Catch: java.lang.Throwable -> L216
            r6.constraints = r15     // Catch: java.lang.Throwable -> L216
            r3.add(r6)     // Catch: java.lang.Throwable -> L216
            r0 = r22
            r22 = r8
            r8 = r21
            r21 = r0
            r27 = r2
            r6 = r13
            r2 = r17
            r17 = r18
            r18 = r20
            r20 = r24
            r25 = r26
            r13 = r29
            r15 = r30
            r0 = r32
            r26 = r1
            r24 = r7
            r7 = r31
            goto Ld6
        L216:
            r0 = move-exception
            goto L222
        L218:
            r4.close()
            r16.release()
            return r3
        L21f:
            r0 = move-exception
            r16 = r3
        L222:
            r4.close()
            r16.release()
            throw r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.Data> getInputsFromPrerequisites(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=?)"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r5 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r5)
        L10:
            androidx.room.RoomDatabase r5 = r4.__db
            r5.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r5 = r4.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L38
            int r3 = r5.getCount()     // Catch: java.lang.Throwable -> L38
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L38
        L26:
            boolean r3 = r5.moveToNext()     // Catch: java.lang.Throwable -> L38
            if (r3 == 0) goto L3a
            byte[] r3 = r5.getBlob(r2)     // Catch: java.lang.Throwable -> L38
            androidx.work.Data r3 = androidx.work.Data.fromByteArray(r3)     // Catch: java.lang.Throwable -> L38
            r1.add(r3)     // Catch: java.lang.Throwable -> L38
            goto L26
        L38:
            r1 = move-exception
            goto L41
        L3a:
            r5.close()
            r0.release()
            return r1
        L41:
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getRecentlyCompletedWork(long r33) {
            r32 = this;
            r1 = r32
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE period_start_time >= ? AND state IN (2, 3, 5) ORDER BY period_start_time DESC"
            r2 = 1
            androidx.room.RoomSQLiteQuery r3 = androidx.room.RoomSQLiteQuery.acquire(r0, r2)
            r4 = r33
            r3.bindLong(r2, r4)
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r4 = 0
            r5 = 0
            android.database.Cursor r4 = androidx.room.util.DBUtil.query(r0, r3, r5, r4)
            java.lang.String r0 = "required_network_type"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r0)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r6 = "requires_charging"
            int r6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r6)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r7 = "requires_device_idle"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r7)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r8 = "requires_battery_not_low"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r8)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r9 = "requires_storage_not_low"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r9)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r10 = "trigger_content_update_delay"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r10)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r11 = "trigger_max_content_delay"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r11)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r12 = "content_uri_triggers"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r12)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r13 = "id"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r13)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r14 = "state"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r14)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r15 = "worker_class_name"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r15)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r2 = "input_merger_class_name"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r5 = "input"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r5)     // Catch: java.lang.Throwable -> L21e
            java.lang.String r1 = "output"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r1)     // Catch: java.lang.Throwable -> L21e
            r16 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L215
            r34 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L215
            r17 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L215
            r18 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L215
            r19 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L215
            r20 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L215
            r21 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L215
            r22 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L215
            r23 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L215
            r24 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L215
            r25 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L215
            r26 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L215
            r27 = r1
            int r1 = r4.getCount()     // Catch: java.lang.Throwable -> L215
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L215
        Ld5:
            boolean r1 = r4.moveToNext()     // Catch: java.lang.Throwable -> L215
            if (r1 == 0) goto L217
            java.lang.String r1 = r4.getString(r13)     // Catch: java.lang.Throwable -> L215
            r28 = r13
            java.lang.String r13 = r4.getString(r15)     // Catch: java.lang.Throwable -> L215
            r29 = r15
            androidx.work.Constraints r15 = new androidx.work.Constraints     // Catch: java.lang.Throwable -> L215
            r15.<init>()     // Catch: java.lang.Throwable -> L215
            int r30 = r4.getInt(r0)     // Catch: java.lang.Throwable -> L215
            r31 = r0
            androidx.work.NetworkType r0 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r30)     // Catch: java.lang.Throwable -> L215
            r15.setRequiredNetworkType(r0)     // Catch: java.lang.Throwable -> L215
            int r0 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L215
            if (r0 == 0) goto L101
            r0 = 1
            goto L102
        L101:
            r0 = 0
        L102:
            r15.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L215
            int r0 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L215
            if (r0 == 0) goto L10d
            r0 = 1
            goto L10e
        L10d:
            r0 = 0
        L10e:
            r15.setRequiresDeviceIdle(r0)     // Catch: java.lang.Throwable -> L215
            int r0 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L215
            if (r0 == 0) goto L119
            r0 = 1
            goto L11a
        L119:
            r0 = 0
        L11a:
            r15.setRequiresBatteryNotLow(r0)     // Catch: java.lang.Throwable -> L215
            int r0 = r4.getInt(r9)     // Catch: java.lang.Throwable -> L215
            if (r0 == 0) goto L125
            r0 = 1
            goto L126
        L125:
            r0 = 0
        L126:
            r15.setRequiresStorageNotLow(r0)     // Catch: java.lang.Throwable -> L215
            r0 = r6
            r30 = r7
            long r6 = r4.getLong(r10)     // Catch: java.lang.Throwable -> L215
            r15.setTriggerContentUpdateDelay(r6)     // Catch: java.lang.Throwable -> L215
            long r6 = r4.getLong(r11)     // Catch: java.lang.Throwable -> L215
            r15.setTriggerMaxContentDelay(r6)     // Catch: java.lang.Throwable -> L215
            byte[] r6 = r4.getBlob(r12)     // Catch: java.lang.Throwable -> L215
            androidx.work.ContentUriTriggers r6 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L215
            r15.setContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L215
            androidx.work.impl.model.WorkSpec r6 = new androidx.work.impl.model.WorkSpec     // Catch: java.lang.Throwable -> L215
            r6.<init>(r1, r13)     // Catch: java.lang.Throwable -> L215
            int r1 = r4.getInt(r14)     // Catch: java.lang.Throwable -> L215
            androidx.work.WorkInfo$State r1 = androidx.work.impl.model.WorkTypeConverters.intToState(r1)     // Catch: java.lang.Throwable -> L215
            r6.state = r1     // Catch: java.lang.Throwable -> L215
            java.lang.String r1 = r4.getString(r2)     // Catch: java.lang.Throwable -> L215
            r6.inputMergerClassName = r1     // Catch: java.lang.Throwable -> L215
            byte[] r1 = r4.getBlob(r5)     // Catch: java.lang.Throwable -> L215
            androidx.work.Data r1 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L215
            r6.input = r1     // Catch: java.lang.Throwable -> L215
            r1 = r27
            byte[] r7 = r4.getBlob(r1)     // Catch: java.lang.Throwable -> L215
            androidx.work.Data r7 = androidx.work.Data.fromByteArray(r7)     // Catch: java.lang.Throwable -> L215
            r6.output = r7     // Catch: java.lang.Throwable -> L215
            r7 = r34
            r34 = r0
            r27 = r1
            long r0 = r4.getLong(r7)     // Catch: java.lang.Throwable -> L215
            r6.initialDelay = r0     // Catch: java.lang.Throwable -> L215
            r13 = r2
            r0 = r17
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L215
            r6.intervalDuration = r1     // Catch: java.lang.Throwable -> L215
            r17 = r7
            r2 = r8
            r1 = r18
            long r7 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L215
            r6.flexDuration = r7     // Catch: java.lang.Throwable -> L215
            r7 = r19
            int r8 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L215
            r6.runAttemptCount = r8     // Catch: java.lang.Throwable -> L215
            r8 = r20
            int r18 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L215
            r19 = r0
            androidx.work.BackoffPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r18)     // Catch: java.lang.Throwable -> L215
            r6.backoffPolicy = r0     // Catch: java.lang.Throwable -> L215
            r18 = r1
            r20 = r2
            r0 = r21
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L215
            r6.backoffDelayDuration = r1     // Catch: java.lang.Throwable -> L215
            r2 = r7
            r21 = r8
            r1 = r22
            long r7 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L215
            r6.periodStartTime = r7     // Catch: java.lang.Throwable -> L215
            r8 = r0
            r22 = r1
            r7 = r23
            long r0 = r4.getLong(r7)     // Catch: java.lang.Throwable -> L215
            r6.minimumRetentionDuration = r0     // Catch: java.lang.Throwable -> L215
            r23 = r2
            r0 = r24
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L215
            r6.scheduleRequestedAt = r1     // Catch: java.lang.Throwable -> L215
            r1 = r25
            int r2 = r4.getInt(r1)     // Catch: java.lang.Throwable -> L215
            if (r2 == 0) goto L1dc
            r2 = 1
            goto L1dd
        L1dc:
            r2 = 0
        L1dd:
            r6.expedited = r2     // Catch: java.lang.Throwable -> L215
            r2 = r26
            int r24 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L215
            r25 = r0
            androidx.work.OutOfQuotaPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r24)     // Catch: java.lang.Throwable -> L215
            r6.outOfQuotaPolicy = r0     // Catch: java.lang.Throwable -> L215
            r6.constraints = r15     // Catch: java.lang.Throwable -> L215
            r3.add(r6)     // Catch: java.lang.Throwable -> L215
            r0 = r21
            r21 = r8
            r8 = r20
            r20 = r0
            r6 = r34
            r26 = r2
            r2 = r13
            r34 = r17
            r17 = r19
            r19 = r23
            r24 = r25
            r13 = r28
            r15 = r29
            r0 = r31
            r25 = r1
            r23 = r7
            r7 = r30
            goto Ld5
        L215:
            r0 = move-exception
            goto L221
        L217:
            r4.close()
            r16.release()
            return r3
        L21e:
            r0 = move-exception
            r16 = r3
        L221:
            r4.close()
            r16.release()
            throw r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getRunningWork() {
            r34 = this;
            r1 = r34
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=1"
            r2 = 0
            androidx.room.RoomSQLiteQuery r3 = androidx.room.RoomSQLiteQuery.acquire(r0, r2)
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r4 = 0
            android.database.Cursor r4 = androidx.room.util.DBUtil.query(r0, r3, r2, r4)
            java.lang.String r0 = "required_network_type"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r0)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r5 = "requires_charging"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r5)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r6 = "requires_device_idle"
            int r6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r6)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r7 = "requires_battery_not_low"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r7)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r8 = "requires_storage_not_low"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r8)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r9 = "trigger_content_update_delay"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r9)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r10 = "trigger_max_content_delay"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r10)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r11 = "content_uri_triggers"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r11)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r12 = "id"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r12)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r13 = "state"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r13)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r14 = "worker_class_name"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r14)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r15 = "input_merger_class_name"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r15)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r2 = "input"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r1 = "output"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r1)     // Catch: java.lang.Throwable -> L21a
            r16 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r17 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r18 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r19 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r20 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r21 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r22 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r23 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r24 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r25 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r26 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r27 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L211
            r28 = r1
            int r1 = r4.getCount()     // Catch: java.lang.Throwable -> L211
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L211
        Lcf:
            boolean r1 = r4.moveToNext()     // Catch: java.lang.Throwable -> L211
            if (r1 == 0) goto L213
            java.lang.String r1 = r4.getString(r12)     // Catch: java.lang.Throwable -> L211
            r29 = r12
            java.lang.String r12 = r4.getString(r14)     // Catch: java.lang.Throwable -> L211
            r30 = r14
            androidx.work.Constraints r14 = new androidx.work.Constraints     // Catch: java.lang.Throwable -> L211
            r14.<init>()     // Catch: java.lang.Throwable -> L211
            int r31 = r4.getInt(r0)     // Catch: java.lang.Throwable -> L211
            r32 = r0
            androidx.work.NetworkType r0 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r31)     // Catch: java.lang.Throwable -> L211
            r14.setRequiredNetworkType(r0)     // Catch: java.lang.Throwable -> L211
            int r0 = r4.getInt(r5)     // Catch: java.lang.Throwable -> L211
            r31 = 1
            if (r0 == 0) goto Lfd
            r0 = 1
            goto Lfe
        Lfd:
            r0 = 0
        Lfe:
            r14.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L211
            int r0 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L211
            if (r0 == 0) goto L109
            r0 = 1
            goto L10a
        L109:
            r0 = 0
        L10a:
            r14.setRequiresDeviceIdle(r0)     // Catch: java.lang.Throwable -> L211
            int r0 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L211
            if (r0 == 0) goto L115
            r0 = 1
            goto L116
        L115:
            r0 = 0
        L116:
            r14.setRequiresBatteryNotLow(r0)     // Catch: java.lang.Throwable -> L211
            int r0 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L211
            if (r0 == 0) goto L121
            r0 = 1
            goto L122
        L121:
            r0 = 0
        L122:
            r14.setRequiresStorageNotLow(r0)     // Catch: java.lang.Throwable -> L211
            r0 = r5
            r33 = r6
            long r5 = r4.getLong(r9)     // Catch: java.lang.Throwable -> L211
            r14.setTriggerContentUpdateDelay(r5)     // Catch: java.lang.Throwable -> L211
            long r5 = r4.getLong(r10)     // Catch: java.lang.Throwable -> L211
            r14.setTriggerMaxContentDelay(r5)     // Catch: java.lang.Throwable -> L211
            byte[] r5 = r4.getBlob(r11)     // Catch: java.lang.Throwable -> L211
            androidx.work.ContentUriTriggers r5 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r5)     // Catch: java.lang.Throwable -> L211
            r14.setContentUriTriggers(r5)     // Catch: java.lang.Throwable -> L211
            androidx.work.impl.model.WorkSpec r5 = new androidx.work.impl.model.WorkSpec     // Catch: java.lang.Throwable -> L211
            r5.<init>(r1, r12)     // Catch: java.lang.Throwable -> L211
            int r1 = r4.getInt(r13)     // Catch: java.lang.Throwable -> L211
            androidx.work.WorkInfo$State r1 = androidx.work.impl.model.WorkTypeConverters.intToState(r1)     // Catch: java.lang.Throwable -> L211
            r5.state = r1     // Catch: java.lang.Throwable -> L211
            java.lang.String r1 = r4.getString(r15)     // Catch: java.lang.Throwable -> L211
            r5.inputMergerClassName = r1     // Catch: java.lang.Throwable -> L211
            byte[] r1 = r4.getBlob(r2)     // Catch: java.lang.Throwable -> L211
            androidx.work.Data r1 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L211
            r5.input = r1     // Catch: java.lang.Throwable -> L211
            r1 = r28
            byte[] r6 = r4.getBlob(r1)     // Catch: java.lang.Throwable -> L211
            androidx.work.Data r6 = androidx.work.Data.fromByteArray(r6)     // Catch: java.lang.Throwable -> L211
            r5.output = r6     // Catch: java.lang.Throwable -> L211
            r12 = r0
            r28 = r1
            r6 = r17
            long r0 = r4.getLong(r6)     // Catch: java.lang.Throwable -> L211
            r5.initialDelay = r0     // Catch: java.lang.Throwable -> L211
            r17 = r2
            r0 = r18
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L211
            r5.intervalDuration = r1     // Catch: java.lang.Throwable -> L211
            r18 = r6
            r2 = r7
            r1 = r19
            long r6 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L211
            r5.flexDuration = r6     // Catch: java.lang.Throwable -> L211
            r6 = r20
            int r7 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L211
            r5.runAttemptCount = r7     // Catch: java.lang.Throwable -> L211
            r7 = r21
            int r19 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L211
            r20 = r0
            androidx.work.BackoffPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r19)     // Catch: java.lang.Throwable -> L211
            r5.backoffPolicy = r0     // Catch: java.lang.Throwable -> L211
            r19 = r1
            r21 = r2
            r0 = r22
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L211
            r5.backoffDelayDuration = r1     // Catch: java.lang.Throwable -> L211
            r2 = r6
            r22 = r7
            r1 = r23
            long r6 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L211
            r5.periodStartTime = r6     // Catch: java.lang.Throwable -> L211
            r7 = r0
            r23 = r1
            r6 = r24
            long r0 = r4.getLong(r6)     // Catch: java.lang.Throwable -> L211
            r5.minimumRetentionDuration = r0     // Catch: java.lang.Throwable -> L211
            r24 = r2
            r0 = r25
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L211
            r5.scheduleRequestedAt = r1     // Catch: java.lang.Throwable -> L211
            r1 = r26
            int r2 = r4.getInt(r1)     // Catch: java.lang.Throwable -> L211
            if (r2 == 0) goto L1d8
            r2 = 1
            goto L1d9
        L1d8:
            r2 = 0
        L1d9:
            r5.expedited = r2     // Catch: java.lang.Throwable -> L211
            r2 = r27
            int r25 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L211
            r26 = r0
            androidx.work.OutOfQuotaPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r25)     // Catch: java.lang.Throwable -> L211
            r5.outOfQuotaPolicy = r0     // Catch: java.lang.Throwable -> L211
            r5.constraints = r14     // Catch: java.lang.Throwable -> L211
            r3.add(r5)     // Catch: java.lang.Throwable -> L211
            r0 = r22
            r22 = r7
            r7 = r21
            r21 = r0
            r27 = r2
            r5 = r12
            r2 = r17
            r17 = r18
            r18 = r20
            r20 = r24
            r25 = r26
            r12 = r29
            r14 = r30
            r0 = r32
            r26 = r1
            r24 = r6
            r6 = r33
            goto Lcf
        L211:
            r0 = move-exception
            goto L21d
        L213:
            r4.close()
            r16.release()
            return r3
        L21a:
            r0 = move-exception
            r16 = r3
        L21d:
            r4.close()
            r16.release()
            throw r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.lifecycle.LiveData<java.lang.Long> getScheduleRequestedAtLiveData(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "SELECT schedule_requested_at FROM workspec WHERE id=?"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r4 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r4)
        L10:
            androidx.room.RoomDatabase r4 = r3.__db
            androidx.room.InvalidationTracker r4 = r4.getInvalidationTracker()
            java.lang.String r1 = "workspec"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            androidx.work.impl.model.WorkSpecDao_Impl$14 r2 = new androidx.work.impl.model.WorkSpecDao_Impl$14
            r2.<init>(r3, r0)
            r0 = 0
            androidx.lifecycle.LiveData r4 = r4.createLiveData(r1, r0, r2)
            return r4
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec> getScheduledWork() {
            r34 = this;
            r1 = r34
            java.lang.String r0 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE state=0 AND schedule_requested_at<>-1"
            r2 = 0
            androidx.room.RoomSQLiteQuery r3 = androidx.room.RoomSQLiteQuery.acquire(r0, r2)
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r4 = 0
            android.database.Cursor r4 = androidx.room.util.DBUtil.query(r0, r3, r2, r4)
            java.lang.String r0 = "required_network_type"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r0)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r5 = "requires_charging"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r5)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r6 = "requires_device_idle"
            int r6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r6)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r7 = "requires_battery_not_low"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r7)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r8 = "requires_storage_not_low"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r8)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r9 = "trigger_content_update_delay"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r9)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r10 = "trigger_max_content_delay"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r10)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r11 = "content_uri_triggers"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r11)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r12 = "id"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r12)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r13 = "state"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r13)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r14 = "worker_class_name"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r14)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r15 = "input_merger_class_name"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r15)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r2 = "input"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L21a
            java.lang.String r1 = "output"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r1)     // Catch: java.lang.Throwable -> L21a
            r16 = r3
            java.lang.String r3 = "initial_delay"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r17 = r3
            java.lang.String r3 = "interval_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r18 = r3
            java.lang.String r3 = "flex_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r19 = r3
            java.lang.String r3 = "run_attempt_count"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r20 = r3
            java.lang.String r3 = "backoff_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r21 = r3
            java.lang.String r3 = "backoff_delay_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r22 = r3
            java.lang.String r3 = "period_start_time"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r23 = r3
            java.lang.String r3 = "minimum_retention_duration"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r24 = r3
            java.lang.String r3 = "schedule_requested_at"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r25 = r3
            java.lang.String r3 = "run_in_foreground"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r26 = r3
            java.lang.String r3 = "out_of_quota_policy"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L211
            r27 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L211
            r28 = r1
            int r1 = r4.getCount()     // Catch: java.lang.Throwable -> L211
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L211
        Lcf:
            boolean r1 = r4.moveToNext()     // Catch: java.lang.Throwable -> L211
            if (r1 == 0) goto L213
            java.lang.String r1 = r4.getString(r12)     // Catch: java.lang.Throwable -> L211
            r29 = r12
            java.lang.String r12 = r4.getString(r14)     // Catch: java.lang.Throwable -> L211
            r30 = r14
            androidx.work.Constraints r14 = new androidx.work.Constraints     // Catch: java.lang.Throwable -> L211
            r14.<init>()     // Catch: java.lang.Throwable -> L211
            int r31 = r4.getInt(r0)     // Catch: java.lang.Throwable -> L211
            r32 = r0
            androidx.work.NetworkType r0 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r31)     // Catch: java.lang.Throwable -> L211
            r14.setRequiredNetworkType(r0)     // Catch: java.lang.Throwable -> L211
            int r0 = r4.getInt(r5)     // Catch: java.lang.Throwable -> L211
            r31 = 1
            if (r0 == 0) goto Lfd
            r0 = 1
            goto Lfe
        Lfd:
            r0 = 0
        Lfe:
            r14.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L211
            int r0 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L211
            if (r0 == 0) goto L109
            r0 = 1
            goto L10a
        L109:
            r0 = 0
        L10a:
            r14.setRequiresDeviceIdle(r0)     // Catch: java.lang.Throwable -> L211
            int r0 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L211
            if (r0 == 0) goto L115
            r0 = 1
            goto L116
        L115:
            r0 = 0
        L116:
            r14.setRequiresBatteryNotLow(r0)     // Catch: java.lang.Throwable -> L211
            int r0 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L211
            if (r0 == 0) goto L121
            r0 = 1
            goto L122
        L121:
            r0 = 0
        L122:
            r14.setRequiresStorageNotLow(r0)     // Catch: java.lang.Throwable -> L211
            r0 = r5
            r33 = r6
            long r5 = r4.getLong(r9)     // Catch: java.lang.Throwable -> L211
            r14.setTriggerContentUpdateDelay(r5)     // Catch: java.lang.Throwable -> L211
            long r5 = r4.getLong(r10)     // Catch: java.lang.Throwable -> L211
            r14.setTriggerMaxContentDelay(r5)     // Catch: java.lang.Throwable -> L211
            byte[] r5 = r4.getBlob(r11)     // Catch: java.lang.Throwable -> L211
            androidx.work.ContentUriTriggers r5 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r5)     // Catch: java.lang.Throwable -> L211
            r14.setContentUriTriggers(r5)     // Catch: java.lang.Throwable -> L211
            androidx.work.impl.model.WorkSpec r5 = new androidx.work.impl.model.WorkSpec     // Catch: java.lang.Throwable -> L211
            r5.<init>(r1, r12)     // Catch: java.lang.Throwable -> L211
            int r1 = r4.getInt(r13)     // Catch: java.lang.Throwable -> L211
            androidx.work.WorkInfo$State r1 = androidx.work.impl.model.WorkTypeConverters.intToState(r1)     // Catch: java.lang.Throwable -> L211
            r5.state = r1     // Catch: java.lang.Throwable -> L211
            java.lang.String r1 = r4.getString(r15)     // Catch: java.lang.Throwable -> L211
            r5.inputMergerClassName = r1     // Catch: java.lang.Throwable -> L211
            byte[] r1 = r4.getBlob(r2)     // Catch: java.lang.Throwable -> L211
            androidx.work.Data r1 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L211
            r5.input = r1     // Catch: java.lang.Throwable -> L211
            r1 = r28
            byte[] r6 = r4.getBlob(r1)     // Catch: java.lang.Throwable -> L211
            androidx.work.Data r6 = androidx.work.Data.fromByteArray(r6)     // Catch: java.lang.Throwable -> L211
            r5.output = r6     // Catch: java.lang.Throwable -> L211
            r12 = r0
            r28 = r1
            r6 = r17
            long r0 = r4.getLong(r6)     // Catch: java.lang.Throwable -> L211
            r5.initialDelay = r0     // Catch: java.lang.Throwable -> L211
            r17 = r2
            r0 = r18
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L211
            r5.intervalDuration = r1     // Catch: java.lang.Throwable -> L211
            r18 = r6
            r2 = r7
            r1 = r19
            long r6 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L211
            r5.flexDuration = r6     // Catch: java.lang.Throwable -> L211
            r6 = r20
            int r7 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L211
            r5.runAttemptCount = r7     // Catch: java.lang.Throwable -> L211
            r7 = r21
            int r19 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L211
            r20 = r0
            androidx.work.BackoffPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r19)     // Catch: java.lang.Throwable -> L211
            r5.backoffPolicy = r0     // Catch: java.lang.Throwable -> L211
            r19 = r1
            r21 = r2
            r0 = r22
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L211
            r5.backoffDelayDuration = r1     // Catch: java.lang.Throwable -> L211
            r2 = r6
            r22 = r7
            r1 = r23
            long r6 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L211
            r5.periodStartTime = r6     // Catch: java.lang.Throwable -> L211
            r7 = r0
            r23 = r1
            r6 = r24
            long r0 = r4.getLong(r6)     // Catch: java.lang.Throwable -> L211
            r5.minimumRetentionDuration = r0     // Catch: java.lang.Throwable -> L211
            r24 = r2
            r0 = r25
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L211
            r5.scheduleRequestedAt = r1     // Catch: java.lang.Throwable -> L211
            r1 = r26
            int r2 = r4.getInt(r1)     // Catch: java.lang.Throwable -> L211
            if (r2 == 0) goto L1d8
            r2 = 1
            goto L1d9
        L1d8:
            r2 = 0
        L1d9:
            r5.expedited = r2     // Catch: java.lang.Throwable -> L211
            r2 = r27
            int r25 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L211
            r26 = r0
            androidx.work.OutOfQuotaPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r25)     // Catch: java.lang.Throwable -> L211
            r5.outOfQuotaPolicy = r0     // Catch: java.lang.Throwable -> L211
            r5.constraints = r14     // Catch: java.lang.Throwable -> L211
            r3.add(r5)     // Catch: java.lang.Throwable -> L211
            r0 = r22
            r22 = r7
            r7 = r21
            r21 = r0
            r27 = r2
            r5 = r12
            r2 = r17
            r17 = r18
            r18 = r20
            r20 = r24
            r25 = r26
            r12 = r29
            r14 = r30
            r0 = r32
            r26 = r1
            r24 = r6
            r6 = r33
            goto Lcf
        L211:
            r0 = move-exception
            goto L21d
        L213:
            r4.close()
            r16.release()
            return r3
        L21a:
            r0 = move-exception
            r16 = r3
        L21d:
            r4.close()
            r16.release()
            throw r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.work.WorkInfo.State getState(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT state FROM workspec WHERE id=?"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r5 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r5)
        L10:
            androidx.room.RoomDatabase r5 = r4.__db
            r5.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r5 = r4.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r1, r2)
            boolean r3 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L2c
            if (r3 == 0) goto L2e
            int r1 = r5.getInt(r1)     // Catch: java.lang.Throwable -> L2c
            androidx.work.WorkInfo$State r2 = androidx.work.impl.model.WorkTypeConverters.intToState(r1)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r1 = move-exception
            goto L35
        L2e:
            r5.close()
            r0.release()
            return r2
        L35:
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<java.lang.String> getUnfinishedWorkWithName(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r5 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r5)
        L10:
            androidx.room.RoomDatabase r5 = r4.__db
            r5.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r5 = r4.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L34
            int r3 = r5.getCount()     // Catch: java.lang.Throwable -> L34
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L34
        L26:
            boolean r3 = r5.moveToNext()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L36
            java.lang.String r3 = r5.getString(r2)     // Catch: java.lang.Throwable -> L34
            r1.add(r3)     // Catch: java.lang.Throwable -> L34
            goto L26
        L34:
            r1 = move-exception
            goto L3d
        L36:
            r5.close()
            r0.release()
            return r1
        L3d:
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<java.lang.String> getUnfinishedWorkWithTag(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = "SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=?)"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r5 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r5)
        L10:
            androidx.room.RoomDatabase r5 = r4.__db
            r5.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r5 = r4.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r5 = androidx.room.util.DBUtil.query(r5, r0, r2, r1)
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L34
            int r3 = r5.getCount()     // Catch: java.lang.Throwable -> L34
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L34
        L26:
            boolean r3 = r5.moveToNext()     // Catch: java.lang.Throwable -> L34
            if (r3 == 0) goto L36
            java.lang.String r3 = r5.getString(r2)     // Catch: java.lang.Throwable -> L34
            r1.add(r3)     // Catch: java.lang.Throwable -> L34
            goto L26
        L34:
            r1 = move-exception
            goto L3d
        L36:
            r5.close()
            r0.release()
            return r1
        L3d:
            r5.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.work.impl.model.WorkSpec getWorkSpec(java.lang.String r29) {
            r28 = this;
            r1 = r28
            r0 = r29
            java.lang.String r2 = "SELECT `required_network_type`, `requires_charging`, `requires_device_idle`, `requires_battery_not_low`, `requires_storage_not_low`, `trigger_content_update_delay`, `trigger_max_content_delay`, `content_uri_triggers`, `WorkSpec`.`id` AS `id`, `WorkSpec`.`state` AS `state`, `WorkSpec`.`worker_class_name` AS `worker_class_name`, `WorkSpec`.`input_merger_class_name` AS `input_merger_class_name`, `WorkSpec`.`input` AS `input`, `WorkSpec`.`output` AS `output`, `WorkSpec`.`initial_delay` AS `initial_delay`, `WorkSpec`.`interval_duration` AS `interval_duration`, `WorkSpec`.`flex_duration` AS `flex_duration`, `WorkSpec`.`run_attempt_count` AS `run_attempt_count`, `WorkSpec`.`backoff_policy` AS `backoff_policy`, `WorkSpec`.`backoff_delay_duration` AS `backoff_delay_duration`, `WorkSpec`.`period_start_time` AS `period_start_time`, `WorkSpec`.`minimum_retention_duration` AS `minimum_retention_duration`, `WorkSpec`.`schedule_requested_at` AS `schedule_requested_at`, `WorkSpec`.`run_in_foreground` AS `run_in_foreground`, `WorkSpec`.`out_of_quota_policy` AS `out_of_quota_policy` FROM workspec WHERE id=?"
            r3 = 1
            androidx.room.RoomSQLiteQuery r2 = androidx.room.RoomSQLiteQuery.acquire(r2, r3)
            if (r0 != 0) goto L11
            r2.bindNull(r3)
            goto L14
        L11:
            r2.bindString(r3, r0)
        L14:
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r4 = 0
            r5 = 0
            android.database.Cursor r6 = androidx.room.util.DBUtil.query(r0, r2, r4, r5)
            java.lang.String r0 = "required_network_type"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r0)     // Catch: java.lang.Throwable -> L1d3
            java.lang.String r7 = "requires_charging"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r7)     // Catch: java.lang.Throwable -> L1d3
            java.lang.String r8 = "requires_device_idle"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r8)     // Catch: java.lang.Throwable -> L1d3
            java.lang.String r9 = "requires_battery_not_low"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r9)     // Catch: java.lang.Throwable -> L1d3
            java.lang.String r10 = "requires_storage_not_low"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r10)     // Catch: java.lang.Throwable -> L1d3
            java.lang.String r11 = "trigger_content_update_delay"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r11)     // Catch: java.lang.Throwable -> L1d3
            java.lang.String r12 = "trigger_max_content_delay"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r12)     // Catch: java.lang.Throwable -> L1d3
            java.lang.String r13 = "content_uri_triggers"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r13)     // Catch: java.lang.Throwable -> L1d3
            java.lang.String r14 = "id"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r14)     // Catch: java.lang.Throwable -> L1d3
            java.lang.String r15 = "state"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r15)     // Catch: java.lang.Throwable -> L1d3
            java.lang.String r3 = "worker_class_name"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r3)     // Catch: java.lang.Throwable -> L1d3
            java.lang.String r4 = "input_merger_class_name"
            int r4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r4)     // Catch: java.lang.Throwable -> L1d3
            java.lang.String r5 = "input"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r5)     // Catch: java.lang.Throwable -> L1d3
            java.lang.String r1 = "output"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r1)     // Catch: java.lang.Throwable -> L1d3
            r16 = r2
            java.lang.String r2 = "initial_delay"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1c9
            r17 = r2
            java.lang.String r2 = "interval_duration"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1c9
            r18 = r2
            java.lang.String r2 = "flex_duration"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1c9
            r19 = r2
            java.lang.String r2 = "run_attempt_count"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1c9
            r20 = r2
            java.lang.String r2 = "backoff_policy"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1c9
            r21 = r2
            java.lang.String r2 = "backoff_delay_duration"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1c9
            r22 = r2
            java.lang.String r2 = "period_start_time"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1c9
            r23 = r2
            java.lang.String r2 = "minimum_retention_duration"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1c9
            r24 = r2
            java.lang.String r2 = "schedule_requested_at"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1c9
            r25 = r2
            java.lang.String r2 = "run_in_foreground"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1c9
            r26 = r2
            java.lang.String r2 = "out_of_quota_policy"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r6, r2)     // Catch: java.lang.Throwable -> L1c9
            boolean r27 = r6.moveToFirst()     // Catch: java.lang.Throwable -> L1c9
            if (r27 == 0) goto L1cb
            java.lang.String r14 = r6.getString(r14)     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r3 = r6.getString(r3)     // Catch: java.lang.Throwable -> L1c9
            r27 = r2
            androidx.work.Constraints r2 = new androidx.work.Constraints     // Catch: java.lang.Throwable -> L1c9
            r2.<init>()     // Catch: java.lang.Throwable -> L1c9
            int r0 = r6.getInt(r0)     // Catch: java.lang.Throwable -> L1c9
            androidx.work.NetworkType r0 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r0)     // Catch: java.lang.Throwable -> L1c9
            r2.setRequiredNetworkType(r0)     // Catch: java.lang.Throwable -> L1c9
            int r0 = r6.getInt(r7)     // Catch: java.lang.Throwable -> L1c9
            if (r0 == 0) goto Lf6
            r0 = 1
            goto Lf7
        Lf6:
            r0 = 0
        Lf7:
            r2.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L1c9
            int r0 = r6.getInt(r8)     // Catch: java.lang.Throwable -> L1c9
            if (r0 == 0) goto L102
            r0 = 1
            goto L103
        L102:
            r0 = 0
        L103:
            r2.setRequiresDeviceIdle(r0)     // Catch: java.lang.Throwable -> L1c9
            int r0 = r6.getInt(r9)     // Catch: java.lang.Throwable -> L1c9
            if (r0 == 0) goto L10e
            r0 = 1
            goto L10f
        L10e:
            r0 = 0
        L10f:
            r2.setRequiresBatteryNotLow(r0)     // Catch: java.lang.Throwable -> L1c9
            int r0 = r6.getInt(r10)     // Catch: java.lang.Throwable -> L1c9
            if (r0 == 0) goto L11a
            r0 = 1
            goto L11b
        L11a:
            r0 = 0
        L11b:
            r2.setRequiresStorageNotLow(r0)     // Catch: java.lang.Throwable -> L1c9
            long r7 = r6.getLong(r11)     // Catch: java.lang.Throwable -> L1c9
            r2.setTriggerContentUpdateDelay(r7)     // Catch: java.lang.Throwable -> L1c9
            long r7 = r6.getLong(r12)     // Catch: java.lang.Throwable -> L1c9
            r2.setTriggerMaxContentDelay(r7)     // Catch: java.lang.Throwable -> L1c9
            byte[] r0 = r6.getBlob(r13)     // Catch: java.lang.Throwable -> L1c9
            androidx.work.ContentUriTriggers r0 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r0)     // Catch: java.lang.Throwable -> L1c9
            r2.setContentUriTriggers(r0)     // Catch: java.lang.Throwable -> L1c9
            androidx.work.impl.model.WorkSpec r0 = new androidx.work.impl.model.WorkSpec     // Catch: java.lang.Throwable -> L1c9
            r0.<init>(r14, r3)     // Catch: java.lang.Throwable -> L1c9
            int r3 = r6.getInt(r15)     // Catch: java.lang.Throwable -> L1c9
            androidx.work.WorkInfo$State r3 = androidx.work.impl.model.WorkTypeConverters.intToState(r3)     // Catch: java.lang.Throwable -> L1c9
            r0.state = r3     // Catch: java.lang.Throwable -> L1c9
            java.lang.String r3 = r6.getString(r4)     // Catch: java.lang.Throwable -> L1c9
            r0.inputMergerClassName = r3     // Catch: java.lang.Throwable -> L1c9
            byte[] r3 = r6.getBlob(r5)     // Catch: java.lang.Throwable -> L1c9
            androidx.work.Data r3 = androidx.work.Data.fromByteArray(r3)     // Catch: java.lang.Throwable -> L1c9
            r0.input = r3     // Catch: java.lang.Throwable -> L1c9
            byte[] r1 = r6.getBlob(r1)     // Catch: java.lang.Throwable -> L1c9
            androidx.work.Data r1 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L1c9
            r0.output = r1     // Catch: java.lang.Throwable -> L1c9
            r1 = r17
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1c9
            r0.initialDelay = r3     // Catch: java.lang.Throwable -> L1c9
            r1 = r18
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1c9
            r0.intervalDuration = r3     // Catch: java.lang.Throwable -> L1c9
            r1 = r19
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1c9
            r0.flexDuration = r3     // Catch: java.lang.Throwable -> L1c9
            r1 = r20
            int r1 = r6.getInt(r1)     // Catch: java.lang.Throwable -> L1c9
            r0.runAttemptCount = r1     // Catch: java.lang.Throwable -> L1c9
            r1 = r21
            int r1 = r6.getInt(r1)     // Catch: java.lang.Throwable -> L1c9
            androidx.work.BackoffPolicy r1 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r1)     // Catch: java.lang.Throwable -> L1c9
            r0.backoffPolicy = r1     // Catch: java.lang.Throwable -> L1c9
            r1 = r22
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1c9
            r0.backoffDelayDuration = r3     // Catch: java.lang.Throwable -> L1c9
            r1 = r23
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1c9
            r0.periodStartTime = r3     // Catch: java.lang.Throwable -> L1c9
            r1 = r24
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1c9
            r0.minimumRetentionDuration = r3     // Catch: java.lang.Throwable -> L1c9
            r1 = r25
            long r3 = r6.getLong(r1)     // Catch: java.lang.Throwable -> L1c9
            r0.scheduleRequestedAt = r3     // Catch: java.lang.Throwable -> L1c9
            r1 = r26
            int r1 = r6.getInt(r1)     // Catch: java.lang.Throwable -> L1c9
            if (r1 == 0) goto L1b6
            r3 = 1
            goto L1b7
        L1b6:
            r3 = 0
        L1b7:
            r0.expedited = r3     // Catch: java.lang.Throwable -> L1c9
            r1 = r27
            int r1 = r6.getInt(r1)     // Catch: java.lang.Throwable -> L1c9
            androidx.work.OutOfQuotaPolicy r1 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r1)     // Catch: java.lang.Throwable -> L1c9
            r0.outOfQuotaPolicy = r1     // Catch: java.lang.Throwable -> L1c9
            r0.constraints = r2     // Catch: java.lang.Throwable -> L1c9
            r5 = r0
            goto L1cc
        L1c9:
            r0 = move-exception
            goto L1d6
        L1cb:
            r5 = 0
        L1cc:
            r6.close()
            r16.release()
            return r5
        L1d3:
            r0 = move-exception
            r16 = r2
        L1d6:
            r6.close()
            r16.release()
            throw r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r7 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r7)
        L10:
            androidx.room.RoomDatabase r7 = r6.__db
            r7.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r7 = r6.__db
            r1 = 0
            r2 = 0
            android.database.Cursor r7 = androidx.room.util.DBUtil.query(r7, r0, r1, r2)
            java.lang.String r1 = "id"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r7, r1)     // Catch: java.lang.Throwable -> L51
            java.lang.String r2 = "state"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r7, r2)     // Catch: java.lang.Throwable -> L51
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L51
            int r4 = r7.getCount()     // Catch: java.lang.Throwable -> L51
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L51
        L32:
            boolean r4 = r7.moveToNext()     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto L53
            androidx.work.impl.model.WorkSpec$IdAndState r4 = new androidx.work.impl.model.WorkSpec$IdAndState     // Catch: java.lang.Throwable -> L51
            r4.<init>()     // Catch: java.lang.Throwable -> L51
            java.lang.String r5 = r7.getString(r1)     // Catch: java.lang.Throwable -> L51
            r4.id = r5     // Catch: java.lang.Throwable -> L51
            int r5 = r7.getInt(r2)     // Catch: java.lang.Throwable -> L51
            androidx.work.WorkInfo$State r5 = androidx.work.impl.model.WorkTypeConverters.intToState(r5)     // Catch: java.lang.Throwable -> L51
            r4.state = r5     // Catch: java.lang.Throwable -> L51
            r3.add(r4)     // Catch: java.lang.Throwable -> L51
            goto L32
        L51:
            r1 = move-exception
            goto L5a
        L53:
            r7.close()
            r0.release()
            return r3
        L5a:
            r7.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.work.impl.model.WorkSpec[] getWorkSpecs(java.util.List<java.lang.String> r35) {
            r34 = this;
            r1 = r34
            java.lang.StringBuilder r0 = androidx.room.util.StringUtil.newStringBuilder()
            java.lang.String r2 = "SELECT "
            r0.append(r2)
            java.lang.String r2 = "*"
            r0.append(r2)
            java.lang.String r2 = " FROM workspec WHERE id IN ("
            r0.append(r2)
            int r2 = r35.size()
            androidx.room.util.StringUtil.appendPlaceholders(r0, r2)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            androidx.room.RoomSQLiteQuery r2 = androidx.room.RoomSQLiteQuery.acquire(r0, r2)
            java.util.Iterator r0 = r35.iterator()
            r4 = 1
        L2e:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L46
            java.lang.Object r5 = r0.next()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 != 0) goto L40
            r2.bindNull(r4)
            goto L43
        L40:
            r2.bindString(r4, r5)
        L43:
            int r4 = r4 + 1
            goto L2e
        L46:
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r4 = 0
            r5 = 0
            android.database.Cursor r4 = androidx.room.util.DBUtil.query(r0, r2, r5, r4)
            java.lang.String r0 = "required_network_type"
            int r0 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r0)     // Catch: java.lang.Throwable -> L250
            java.lang.String r6 = "requires_charging"
            int r6 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r6)     // Catch: java.lang.Throwable -> L250
            java.lang.String r7 = "requires_device_idle"
            int r7 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r7)     // Catch: java.lang.Throwable -> L250
            java.lang.String r8 = "requires_battery_not_low"
            int r8 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r8)     // Catch: java.lang.Throwable -> L250
            java.lang.String r9 = "requires_storage_not_low"
            int r9 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r9)     // Catch: java.lang.Throwable -> L250
            java.lang.String r10 = "trigger_content_update_delay"
            int r10 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r10)     // Catch: java.lang.Throwable -> L250
            java.lang.String r11 = "trigger_max_content_delay"
            int r11 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r11)     // Catch: java.lang.Throwable -> L250
            java.lang.String r12 = "content_uri_triggers"
            int r12 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r12)     // Catch: java.lang.Throwable -> L250
            java.lang.String r13 = "id"
            int r13 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r13)     // Catch: java.lang.Throwable -> L250
            java.lang.String r14 = "state"
            int r14 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r14)     // Catch: java.lang.Throwable -> L250
            java.lang.String r15 = "worker_class_name"
            int r15 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r15)     // Catch: java.lang.Throwable -> L250
            java.lang.String r3 = "input_merger_class_name"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r3)     // Catch: java.lang.Throwable -> L250
            java.lang.String r5 = "input"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r5)     // Catch: java.lang.Throwable -> L250
            java.lang.String r1 = "output"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r1)     // Catch: java.lang.Throwable -> L250
            r16 = r2
            java.lang.String r2 = "initial_delay"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L245
            r17 = r2
            java.lang.String r2 = "interval_duration"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L245
            r18 = r2
            java.lang.String r2 = "flex_duration"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L245
            r19 = r2
            java.lang.String r2 = "run_attempt_count"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L245
            r20 = r2
            java.lang.String r2 = "backoff_policy"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L245
            r21 = r2
            java.lang.String r2 = "backoff_delay_duration"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L245
            r22 = r2
            java.lang.String r2 = "period_start_time"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L245
            r23 = r2
            java.lang.String r2 = "minimum_retention_duration"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L245
            r24 = r2
            java.lang.String r2 = "schedule_requested_at"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L245
            r25 = r2
            java.lang.String r2 = "run_in_foreground"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L245
            r26 = r2
            java.lang.String r2 = "out_of_quota_policy"
            int r2 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r4, r2)     // Catch: java.lang.Throwable -> L245
            r27 = r2
            int r2 = r4.getCount()     // Catch: java.lang.Throwable -> L245
            androidx.work.impl.model.WorkSpec[] r2 = new androidx.work.impl.model.WorkSpec[r2]     // Catch: java.lang.Throwable -> L245
            r28 = 0
        L10a:
            boolean r29 = r4.moveToNext()     // Catch: java.lang.Throwable -> L245
            if (r29 == 0) goto L247
            r29 = r2
            java.lang.String r2 = r4.getString(r13)     // Catch: java.lang.Throwable -> L245
            r30 = r13
            java.lang.String r13 = r4.getString(r15)     // Catch: java.lang.Throwable -> L245
            r31 = r15
            androidx.work.Constraints r15 = new androidx.work.Constraints     // Catch: java.lang.Throwable -> L245
            r15.<init>()     // Catch: java.lang.Throwable -> L245
            int r32 = r4.getInt(r0)     // Catch: java.lang.Throwable -> L245
            r33 = r0
            androidx.work.NetworkType r0 = androidx.work.impl.model.WorkTypeConverters.intToNetworkType(r32)     // Catch: java.lang.Throwable -> L245
            r15.setRequiredNetworkType(r0)     // Catch: java.lang.Throwable -> L245
            int r0 = r4.getInt(r6)     // Catch: java.lang.Throwable -> L245
            if (r0 == 0) goto L138
            r0 = 1
            goto L139
        L138:
            r0 = 0
        L139:
            r15.setRequiresCharging(r0)     // Catch: java.lang.Throwable -> L245
            int r0 = r4.getInt(r7)     // Catch: java.lang.Throwable -> L245
            if (r0 == 0) goto L144
            r0 = 1
            goto L145
        L144:
            r0 = 0
        L145:
            r15.setRequiresDeviceIdle(r0)     // Catch: java.lang.Throwable -> L245
            int r0 = r4.getInt(r8)     // Catch: java.lang.Throwable -> L245
            if (r0 == 0) goto L150
            r0 = 1
            goto L151
        L150:
            r0 = 0
        L151:
            r15.setRequiresBatteryNotLow(r0)     // Catch: java.lang.Throwable -> L245
            int r0 = r4.getInt(r9)     // Catch: java.lang.Throwable -> L245
            if (r0 == 0) goto L15c
            r0 = 1
            goto L15d
        L15c:
            r0 = 0
        L15d:
            r15.setRequiresStorageNotLow(r0)     // Catch: java.lang.Throwable -> L245
            r0 = r6
            r32 = r7
            long r6 = r4.getLong(r10)     // Catch: java.lang.Throwable -> L245
            r15.setTriggerContentUpdateDelay(r6)     // Catch: java.lang.Throwable -> L245
            long r6 = r4.getLong(r11)     // Catch: java.lang.Throwable -> L245
            r15.setTriggerMaxContentDelay(r6)     // Catch: java.lang.Throwable -> L245
            byte[] r6 = r4.getBlob(r12)     // Catch: java.lang.Throwable -> L245
            androidx.work.ContentUriTriggers r6 = androidx.work.impl.model.WorkTypeConverters.byteArrayToContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L245
            r15.setContentUriTriggers(r6)     // Catch: java.lang.Throwable -> L245
            androidx.work.impl.model.WorkSpec r6 = new androidx.work.impl.model.WorkSpec     // Catch: java.lang.Throwable -> L245
            r6.<init>(r2, r13)     // Catch: java.lang.Throwable -> L245
            int r2 = r4.getInt(r14)     // Catch: java.lang.Throwable -> L245
            androidx.work.WorkInfo$State r2 = androidx.work.impl.model.WorkTypeConverters.intToState(r2)     // Catch: java.lang.Throwable -> L245
            r6.state = r2     // Catch: java.lang.Throwable -> L245
            java.lang.String r2 = r4.getString(r3)     // Catch: java.lang.Throwable -> L245
            r6.inputMergerClassName = r2     // Catch: java.lang.Throwable -> L245
            byte[] r2 = r4.getBlob(r5)     // Catch: java.lang.Throwable -> L245
            androidx.work.Data r2 = androidx.work.Data.fromByteArray(r2)     // Catch: java.lang.Throwable -> L245
            r6.input = r2     // Catch: java.lang.Throwable -> L245
            byte[] r2 = r4.getBlob(r1)     // Catch: java.lang.Throwable -> L245
            androidx.work.Data r2 = androidx.work.Data.fromByteArray(r2)     // Catch: java.lang.Throwable -> L245
            r6.output = r2     // Catch: java.lang.Throwable -> L245
            r13 = r0
            r7 = r1
            r2 = r17
            long r0 = r4.getLong(r2)     // Catch: java.lang.Throwable -> L245
            r6.initialDelay = r0     // Catch: java.lang.Throwable -> L245
            r17 = r2
            r0 = r18
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L245
            r6.intervalDuration = r1     // Catch: java.lang.Throwable -> L245
            r18 = r3
            r1 = r19
            long r2 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L245
            r6.flexDuration = r2     // Catch: java.lang.Throwable -> L245
            r2 = r20
            int r3 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L245
            r6.runAttemptCount = r3     // Catch: java.lang.Throwable -> L245
            r3 = r21
            int r19 = r4.getInt(r3)     // Catch: java.lang.Throwable -> L245
            r20 = r0
            androidx.work.BackoffPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToBackoffPolicy(r19)     // Catch: java.lang.Throwable -> L245
            r6.backoffPolicy = r0     // Catch: java.lang.Throwable -> L245
            r19 = r1
            r21 = r2
            r0 = r22
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L245
            r6.backoffDelayDuration = r1     // Catch: java.lang.Throwable -> L245
            r22 = r3
            r1 = r23
            long r2 = r4.getLong(r1)     // Catch: java.lang.Throwable -> L245
            r6.periodStartTime = r2     // Catch: java.lang.Throwable -> L245
            r3 = r0
            r23 = r1
            r2 = r24
            long r0 = r4.getLong(r2)     // Catch: java.lang.Throwable -> L245
            r6.minimumRetentionDuration = r0     // Catch: java.lang.Throwable -> L245
            r24 = r2
            r0 = r25
            long r1 = r4.getLong(r0)     // Catch: java.lang.Throwable -> L245
            r6.scheduleRequestedAt = r1     // Catch: java.lang.Throwable -> L245
            r1 = r26
            int r2 = r4.getInt(r1)     // Catch: java.lang.Throwable -> L245
            if (r2 == 0) goto L20e
            r2 = 1
            goto L20f
        L20e:
            r2 = 0
        L20f:
            r6.expedited = r2     // Catch: java.lang.Throwable -> L245
            r2 = r27
            int r25 = r4.getInt(r2)     // Catch: java.lang.Throwable -> L245
            r26 = r0
            androidx.work.OutOfQuotaPolicy r0 = androidx.work.impl.model.WorkTypeConverters.intToOutOfQuotaPolicy(r25)     // Catch: java.lang.Throwable -> L245
            r6.outOfQuotaPolicy = r0     // Catch: java.lang.Throwable -> L245
            r6.constraints = r15     // Catch: java.lang.Throwable -> L245
            r29[r28] = r6     // Catch: java.lang.Throwable -> L245
            int r28 = r28 + 1
            r0 = r22
            r22 = r3
            r3 = r18
            r18 = r20
            r20 = r21
            r21 = r0
            r27 = r2
            r6 = r13
            r25 = r26
            r2 = r29
            r13 = r30
            r15 = r31
            r0 = r33
            r26 = r1
            r1 = r7
            r7 = r32
            goto L10a
        L245:
            r0 = move-exception
            goto L253
        L247:
            r29 = r2
            r4.close()
            r16.release()
            return r29
        L250:
            r0 = move-exception
            r16 = r2
        L253:
            r4.close()
            r16.release()
            throw r0
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.work.impl.model.WorkSpec.WorkInfoPojo getWorkStatusPojoForId(java.lang.String r11) {
            r10 = this;
            java.lang.String r0 = "SELECT id, state, output, run_attempt_count FROM workspec WHERE id=?"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r11 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r11)
        L10:
            androidx.room.RoomDatabase r11 = r10.__db
            r11.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r11 = r10.__db
            r11.beginTransaction()
            androidx.room.RoomDatabase r11 = r10.__db     // Catch: java.lang.Throwable -> Lfd
            r2 = 0
            android.database.Cursor r11 = androidx.room.util.DBUtil.query(r11, r0, r1, r2)     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r1 = "id"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r11, r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = "state"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r11, r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = "output"
            int r4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r11, r4)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = "run_attempt_count"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r11, r5)     // Catch: java.lang.Throwable -> L64
            androidx.collection.ArrayMap r6 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L64
            r6.<init>()     // Catch: java.lang.Throwable -> L64
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L64
            r7.<init>()     // Catch: java.lang.Throwable -> L64
        L43:
            boolean r8 = r11.moveToNext()     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto L82
            boolean r8 = r11.isNull(r1)     // Catch: java.lang.Throwable -> L64
            if (r8 != 0) goto L67
            java.lang.String r8 = r11.getString(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r9 = r6.get(r8)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L64
            if (r9 != 0) goto L67
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r9.<init>()     // Catch: java.lang.Throwable -> L64
            r6.put(r8, r9)     // Catch: java.lang.Throwable -> L64
            goto L67
        L64:
            r1 = move-exception
            goto Lff
        L67:
            boolean r8 = r11.isNull(r1)     // Catch: java.lang.Throwable -> L64
            if (r8 != 0) goto L43
            java.lang.String r8 = r11.getString(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L64
            if (r9 != 0) goto L43
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r9.<init>()     // Catch: java.lang.Throwable -> L64
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L64
            goto L43
        L82:
            r8 = -1
            r11.moveToPosition(r8)     // Catch: java.lang.Throwable -> L64
            r10.__fetchRelationshipWorkTagAsjavaLangString(r6)     // Catch: java.lang.Throwable -> L64
            r10.__fetchRelationshipWorkProgressAsandroidxWorkData(r7)     // Catch: java.lang.Throwable -> L64
            boolean r8 = r11.moveToFirst()     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto Lec
            boolean r8 = r11.isNull(r1)     // Catch: java.lang.Throwable -> L64
            if (r8 != 0) goto La3
            java.lang.String r8 = r11.getString(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r6 = r6.get(r8)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r6 = (java.util.ArrayList) r6     // Catch: java.lang.Throwable -> L64
            goto La4
        La3:
            r6 = r2
        La4:
            if (r6 != 0) goto Lab
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r6.<init>()     // Catch: java.lang.Throwable -> L64
        Lab:
            boolean r8 = r11.isNull(r1)     // Catch: java.lang.Throwable -> L64
            if (r8 != 0) goto Lbb
            java.lang.String r2 = r11.getString(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r2 = r7.get(r2)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Throwable -> L64
        Lbb:
            if (r2 != 0) goto Lc2
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r2.<init>()     // Catch: java.lang.Throwable -> L64
        Lc2:
            androidx.work.impl.model.WorkSpec$WorkInfoPojo r7 = new androidx.work.impl.model.WorkSpec$WorkInfoPojo     // Catch: java.lang.Throwable -> L64
            r7.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r1 = r11.getString(r1)     // Catch: java.lang.Throwable -> L64
            r7.id = r1     // Catch: java.lang.Throwable -> L64
            int r1 = r11.getInt(r3)     // Catch: java.lang.Throwable -> L64
            androidx.work.WorkInfo$State r1 = androidx.work.impl.model.WorkTypeConverters.intToState(r1)     // Catch: java.lang.Throwable -> L64
            r7.state = r1     // Catch: java.lang.Throwable -> L64
            byte[] r1 = r11.getBlob(r4)     // Catch: java.lang.Throwable -> L64
            androidx.work.Data r1 = androidx.work.Data.fromByteArray(r1)     // Catch: java.lang.Throwable -> L64
            r7.output = r1     // Catch: java.lang.Throwable -> L64
            int r1 = r11.getInt(r5)     // Catch: java.lang.Throwable -> L64
            r7.runAttemptCount = r1     // Catch: java.lang.Throwable -> L64
            r7.tags = r6     // Catch: java.lang.Throwable -> L64
            r7.progress = r2     // Catch: java.lang.Throwable -> L64
            r2 = r7
        Lec:
            androidx.room.RoomDatabase r1 = r10.__db     // Catch: java.lang.Throwable -> L64
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L64
            r11.close()     // Catch: java.lang.Throwable -> Lfd
            r0.release()     // Catch: java.lang.Throwable -> Lfd
            androidx.room.RoomDatabase r11 = r10.__db
            r11.endTransaction()
            return r2
        Lfd:
            r11 = move-exception
            goto L106
        Lff:
            r11.close()     // Catch: java.lang.Throwable -> Lfd
            r0.release()     // Catch: java.lang.Throwable -> Lfd
            throw r1     // Catch: java.lang.Throwable -> Lfd
        L106:
            androidx.room.RoomDatabase r0 = r10.__db
            r0.endTransaction()
            throw r11
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(java.util.List<java.lang.String> r14) {
            r13 = this;
            java.lang.StringBuilder r0 = androidx.room.util.StringUtil.newStringBuilder()
            java.lang.String r1 = "SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN ("
            r0.append(r1)
            int r1 = r14.size()
            androidx.room.util.StringUtil.appendPlaceholders(r0, r1)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            java.util.Iterator r14 = r14.iterator()
            r1 = 1
            r2 = 1
        L23:
            boolean r3 = r14.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r14.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L35
            r0.bindNull(r2)
            goto L38
        L35:
            r0.bindString(r2, r3)
        L38:
            int r2 = r2 + 1
            goto L23
        L3b:
            androidx.room.RoomDatabase r14 = r13.__db
            r14.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r14 = r13.__db
            r14.beginTransaction()
            androidx.room.RoomDatabase r14 = r13.__db     // Catch: java.lang.Throwable -> L136
            r2 = 0
            android.database.Cursor r14 = androidx.room.util.DBUtil.query(r14, r0, r1, r2)     // Catch: java.lang.Throwable -> L136
            java.lang.String r1 = "id"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r14, r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r3 = "state"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r14, r3)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r4 = "output"
            int r4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r14, r4)     // Catch: java.lang.Throwable -> L8f
            java.lang.String r5 = "run_attempt_count"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r14, r5)     // Catch: java.lang.Throwable -> L8f
            androidx.collection.ArrayMap r6 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L8f
            r6.<init>()     // Catch: java.lang.Throwable -> L8f
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L8f
            r7.<init>()     // Catch: java.lang.Throwable -> L8f
        L6e:
            boolean r8 = r14.moveToNext()     // Catch: java.lang.Throwable -> L8f
            if (r8 == 0) goto Lad
            boolean r8 = r14.isNull(r1)     // Catch: java.lang.Throwable -> L8f
            if (r8 != 0) goto L92
            java.lang.String r8 = r14.getString(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r9 = r6.get(r8)     // Catch: java.lang.Throwable -> L8f
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L8f
            if (r9 != 0) goto L92
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f
            r9.<init>()     // Catch: java.lang.Throwable -> L8f
            r6.put(r8, r9)     // Catch: java.lang.Throwable -> L8f
            goto L92
        L8f:
            r1 = move-exception
            goto L138
        L92:
            boolean r8 = r14.isNull(r1)     // Catch: java.lang.Throwable -> L8f
            if (r8 != 0) goto L6e
            java.lang.String r8 = r14.getString(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> L8f
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L8f
            if (r9 != 0) goto L6e
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f
            r9.<init>()     // Catch: java.lang.Throwable -> L8f
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L8f
            goto L6e
        Lad:
            r8 = -1
            r14.moveToPosition(r8)     // Catch: java.lang.Throwable -> L8f
            r13.__fetchRelationshipWorkTagAsjavaLangString(r6)     // Catch: java.lang.Throwable -> L8f
            r13.__fetchRelationshipWorkProgressAsandroidxWorkData(r7)     // Catch: java.lang.Throwable -> L8f
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f
            int r9 = r14.getCount()     // Catch: java.lang.Throwable -> L8f
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L8f
        Lc0:
            boolean r9 = r14.moveToNext()     // Catch: java.lang.Throwable -> L8f
            if (r9 == 0) goto L125
            boolean r9 = r14.isNull(r1)     // Catch: java.lang.Throwable -> L8f
            if (r9 != 0) goto Ld7
            java.lang.String r9 = r14.getString(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r9 = r6.get(r9)     // Catch: java.lang.Throwable -> L8f
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L8f
            goto Ld8
        Ld7:
            r9 = r2
        Ld8:
            if (r9 != 0) goto Ldf
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f
            r9.<init>()     // Catch: java.lang.Throwable -> L8f
        Ldf:
            boolean r10 = r14.isNull(r1)     // Catch: java.lang.Throwable -> L8f
            if (r10 != 0) goto Lf0
            java.lang.String r10 = r14.getString(r1)     // Catch: java.lang.Throwable -> L8f
            java.lang.Object r10 = r7.get(r10)     // Catch: java.lang.Throwable -> L8f
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch: java.lang.Throwable -> L8f
            goto Lf1
        Lf0:
            r10 = r2
        Lf1:
            if (r10 != 0) goto Lf8
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L8f
            r10.<init>()     // Catch: java.lang.Throwable -> L8f
        Lf8:
            androidx.work.impl.model.WorkSpec$WorkInfoPojo r11 = new androidx.work.impl.model.WorkSpec$WorkInfoPojo     // Catch: java.lang.Throwable -> L8f
            r11.<init>()     // Catch: java.lang.Throwable -> L8f
            java.lang.String r12 = r14.getString(r1)     // Catch: java.lang.Throwable -> L8f
            r11.id = r12     // Catch: java.lang.Throwable -> L8f
            int r12 = r14.getInt(r3)     // Catch: java.lang.Throwable -> L8f
            androidx.work.WorkInfo$State r12 = androidx.work.impl.model.WorkTypeConverters.intToState(r12)     // Catch: java.lang.Throwable -> L8f
            r11.state = r12     // Catch: java.lang.Throwable -> L8f
            byte[] r12 = r14.getBlob(r4)     // Catch: java.lang.Throwable -> L8f
            androidx.work.Data r12 = androidx.work.Data.fromByteArray(r12)     // Catch: java.lang.Throwable -> L8f
            r11.output = r12     // Catch: java.lang.Throwable -> L8f
            int r12 = r14.getInt(r5)     // Catch: java.lang.Throwable -> L8f
            r11.runAttemptCount = r12     // Catch: java.lang.Throwable -> L8f
            r11.tags = r9     // Catch: java.lang.Throwable -> L8f
            r11.progress = r10     // Catch: java.lang.Throwable -> L8f
            r8.add(r11)     // Catch: java.lang.Throwable -> L8f
            goto Lc0
        L125:
            androidx.room.RoomDatabase r1 = r13.__db     // Catch: java.lang.Throwable -> L8f
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L8f
            r14.close()     // Catch: java.lang.Throwable -> L136
            r0.release()     // Catch: java.lang.Throwable -> L136
            androidx.room.RoomDatabase r14 = r13.__db
            r14.endTransaction()
            return r8
        L136:
            r14 = move-exception
            goto L13f
        L138:
            r14.close()     // Catch: java.lang.Throwable -> L136
            r0.release()     // Catch: java.lang.Throwable -> L136
            throw r1     // Catch: java.lang.Throwable -> L136
        L13f:
            androidx.room.RoomDatabase r0 = r13.__db
            r0.endTransaction()
            throw r14
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = "SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r14 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r14)
        L10:
            androidx.room.RoomDatabase r14 = r13.__db
            r14.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r14 = r13.__db
            r14.beginTransaction()
            androidx.room.RoomDatabase r14 = r13.__db     // Catch: java.lang.Throwable -> L10b
            r2 = 0
            android.database.Cursor r14 = androidx.room.util.DBUtil.query(r14, r0, r1, r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r1 = "id"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r14, r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = "state"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r14, r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = "output"
            int r4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r14, r4)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = "run_attempt_count"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r14, r5)     // Catch: java.lang.Throwable -> L64
            androidx.collection.ArrayMap r6 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L64
            r6.<init>()     // Catch: java.lang.Throwable -> L64
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L64
            r7.<init>()     // Catch: java.lang.Throwable -> L64
        L43:
            boolean r8 = r14.moveToNext()     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto L82
            boolean r8 = r14.isNull(r1)     // Catch: java.lang.Throwable -> L64
            if (r8 != 0) goto L67
            java.lang.String r8 = r14.getString(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r9 = r6.get(r8)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L64
            if (r9 != 0) goto L67
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r9.<init>()     // Catch: java.lang.Throwable -> L64
            r6.put(r8, r9)     // Catch: java.lang.Throwable -> L64
            goto L67
        L64:
            r1 = move-exception
            goto L10d
        L67:
            boolean r8 = r14.isNull(r1)     // Catch: java.lang.Throwable -> L64
            if (r8 != 0) goto L43
            java.lang.String r8 = r14.getString(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L64
            if (r9 != 0) goto L43
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r9.<init>()     // Catch: java.lang.Throwable -> L64
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L64
            goto L43
        L82:
            r8 = -1
            r14.moveToPosition(r8)     // Catch: java.lang.Throwable -> L64
            r13.__fetchRelationshipWorkTagAsjavaLangString(r6)     // Catch: java.lang.Throwable -> L64
            r13.__fetchRelationshipWorkProgressAsandroidxWorkData(r7)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            int r9 = r14.getCount()     // Catch: java.lang.Throwable -> L64
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L64
        L95:
            boolean r9 = r14.moveToNext()     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto Lfa
            boolean r9 = r14.isNull(r1)     // Catch: java.lang.Throwable -> L64
            if (r9 != 0) goto Lac
            java.lang.String r9 = r14.getString(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r9 = r6.get(r9)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L64
            goto Lad
        Lac:
            r9 = r2
        Lad:
            if (r9 != 0) goto Lb4
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r9.<init>()     // Catch: java.lang.Throwable -> L64
        Lb4:
            boolean r10 = r14.isNull(r1)     // Catch: java.lang.Throwable -> L64
            if (r10 != 0) goto Lc5
            java.lang.String r10 = r14.getString(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r10 = r7.get(r10)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch: java.lang.Throwable -> L64
            goto Lc6
        Lc5:
            r10 = r2
        Lc6:
            if (r10 != 0) goto Lcd
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r10.<init>()     // Catch: java.lang.Throwable -> L64
        Lcd:
            androidx.work.impl.model.WorkSpec$WorkInfoPojo r11 = new androidx.work.impl.model.WorkSpec$WorkInfoPojo     // Catch: java.lang.Throwable -> L64
            r11.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r12 = r14.getString(r1)     // Catch: java.lang.Throwable -> L64
            r11.id = r12     // Catch: java.lang.Throwable -> L64
            int r12 = r14.getInt(r3)     // Catch: java.lang.Throwable -> L64
            androidx.work.WorkInfo$State r12 = androidx.work.impl.model.WorkTypeConverters.intToState(r12)     // Catch: java.lang.Throwable -> L64
            r11.state = r12     // Catch: java.lang.Throwable -> L64
            byte[] r12 = r14.getBlob(r4)     // Catch: java.lang.Throwable -> L64
            androidx.work.Data r12 = androidx.work.Data.fromByteArray(r12)     // Catch: java.lang.Throwable -> L64
            r11.output = r12     // Catch: java.lang.Throwable -> L64
            int r12 = r14.getInt(r5)     // Catch: java.lang.Throwable -> L64
            r11.runAttemptCount = r12     // Catch: java.lang.Throwable -> L64
            r11.tags = r9     // Catch: java.lang.Throwable -> L64
            r11.progress = r10     // Catch: java.lang.Throwable -> L64
            r8.add(r11)     // Catch: java.lang.Throwable -> L64
            goto L95
        Lfa:
            androidx.room.RoomDatabase r1 = r13.__db     // Catch: java.lang.Throwable -> L64
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L64
            r14.close()     // Catch: java.lang.Throwable -> L10b
            r0.release()     // Catch: java.lang.Throwable -> L10b
            androidx.room.RoomDatabase r14 = r13.__db
            r14.endTransaction()
            return r8
        L10b:
            r14 = move-exception
            goto L114
        L10d:
            r14.close()     // Catch: java.lang.Throwable -> L10b
            r0.release()     // Catch: java.lang.Throwable -> L10b
            throw r1     // Catch: java.lang.Throwable -> L10b
        L114:
            androidx.room.RoomDatabase r0 = r13.__db
            r0.endTransaction()
            throw r14
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = "SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r14 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r14)
        L10:
            androidx.room.RoomDatabase r14 = r13.__db
            r14.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r14 = r13.__db
            r14.beginTransaction()
            androidx.room.RoomDatabase r14 = r13.__db     // Catch: java.lang.Throwable -> L10b
            r2 = 0
            android.database.Cursor r14 = androidx.room.util.DBUtil.query(r14, r0, r1, r2)     // Catch: java.lang.Throwable -> L10b
            java.lang.String r1 = "id"
            int r1 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r14, r1)     // Catch: java.lang.Throwable -> L64
            java.lang.String r3 = "state"
            int r3 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r14, r3)     // Catch: java.lang.Throwable -> L64
            java.lang.String r4 = "output"
            int r4 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r14, r4)     // Catch: java.lang.Throwable -> L64
            java.lang.String r5 = "run_attempt_count"
            int r5 = androidx.room.util.CursorUtil.getColumnIndexOrThrow(r14, r5)     // Catch: java.lang.Throwable -> L64
            androidx.collection.ArrayMap r6 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L64
            r6.<init>()     // Catch: java.lang.Throwable -> L64
            androidx.collection.ArrayMap r7 = new androidx.collection.ArrayMap     // Catch: java.lang.Throwable -> L64
            r7.<init>()     // Catch: java.lang.Throwable -> L64
        L43:
            boolean r8 = r14.moveToNext()     // Catch: java.lang.Throwable -> L64
            if (r8 == 0) goto L82
            boolean r8 = r14.isNull(r1)     // Catch: java.lang.Throwable -> L64
            if (r8 != 0) goto L67
            java.lang.String r8 = r14.getString(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r9 = r6.get(r8)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L64
            if (r9 != 0) goto L67
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r9.<init>()     // Catch: java.lang.Throwable -> L64
            r6.put(r8, r9)     // Catch: java.lang.Throwable -> L64
            goto L67
        L64:
            r1 = move-exception
            goto L10d
        L67:
            boolean r8 = r14.isNull(r1)     // Catch: java.lang.Throwable -> L64
            if (r8 != 0) goto L43
            java.lang.String r8 = r14.getString(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r9 = r7.get(r8)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L64
            if (r9 != 0) goto L43
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r9.<init>()     // Catch: java.lang.Throwable -> L64
            r7.put(r8, r9)     // Catch: java.lang.Throwable -> L64
            goto L43
        L82:
            r8 = -1
            r14.moveToPosition(r8)     // Catch: java.lang.Throwable -> L64
            r13.__fetchRelationshipWorkTagAsjavaLangString(r6)     // Catch: java.lang.Throwable -> L64
            r13.__fetchRelationshipWorkProgressAsandroidxWorkData(r7)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            int r9 = r14.getCount()     // Catch: java.lang.Throwable -> L64
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L64
        L95:
            boolean r9 = r14.moveToNext()     // Catch: java.lang.Throwable -> L64
            if (r9 == 0) goto Lfa
            boolean r9 = r14.isNull(r1)     // Catch: java.lang.Throwable -> L64
            if (r9 != 0) goto Lac
            java.lang.String r9 = r14.getString(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r9 = r6.get(r9)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r9 = (java.util.ArrayList) r9     // Catch: java.lang.Throwable -> L64
            goto Lad
        Lac:
            r9 = r2
        Lad:
            if (r9 != 0) goto Lb4
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r9.<init>()     // Catch: java.lang.Throwable -> L64
        Lb4:
            boolean r10 = r14.isNull(r1)     // Catch: java.lang.Throwable -> L64
            if (r10 != 0) goto Lc5
            java.lang.String r10 = r14.getString(r1)     // Catch: java.lang.Throwable -> L64
            java.lang.Object r10 = r7.get(r10)     // Catch: java.lang.Throwable -> L64
            java.util.ArrayList r10 = (java.util.ArrayList) r10     // Catch: java.lang.Throwable -> L64
            goto Lc6
        Lc5:
            r10 = r2
        Lc6:
            if (r10 != 0) goto Lcd
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L64
            r10.<init>()     // Catch: java.lang.Throwable -> L64
        Lcd:
            androidx.work.impl.model.WorkSpec$WorkInfoPojo r11 = new androidx.work.impl.model.WorkSpec$WorkInfoPojo     // Catch: java.lang.Throwable -> L64
            r11.<init>()     // Catch: java.lang.Throwable -> L64
            java.lang.String r12 = r14.getString(r1)     // Catch: java.lang.Throwable -> L64
            r11.id = r12     // Catch: java.lang.Throwable -> L64
            int r12 = r14.getInt(r3)     // Catch: java.lang.Throwable -> L64
            androidx.work.WorkInfo$State r12 = androidx.work.impl.model.WorkTypeConverters.intToState(r12)     // Catch: java.lang.Throwable -> L64
            r11.state = r12     // Catch: java.lang.Throwable -> L64
            byte[] r12 = r14.getBlob(r4)     // Catch: java.lang.Throwable -> L64
            androidx.work.Data r12 = androidx.work.Data.fromByteArray(r12)     // Catch: java.lang.Throwable -> L64
            r11.output = r12     // Catch: java.lang.Throwable -> L64
            int r12 = r14.getInt(r5)     // Catch: java.lang.Throwable -> L64
            r11.runAttemptCount = r12     // Catch: java.lang.Throwable -> L64
            r11.tags = r9     // Catch: java.lang.Throwable -> L64
            r11.progress = r10     // Catch: java.lang.Throwable -> L64
            r8.add(r11)     // Catch: java.lang.Throwable -> L64
            goto L95
        Lfa:
            androidx.room.RoomDatabase r1 = r13.__db     // Catch: java.lang.Throwable -> L64
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L64
            r14.close()     // Catch: java.lang.Throwable -> L10b
            r0.release()     // Catch: java.lang.Throwable -> L10b
            androidx.room.RoomDatabase r14 = r13.__db
            r14.endTransaction()
            return r8
        L10b:
            r14 = move-exception
            goto L114
        L10d:
            r14.close()     // Catch: java.lang.Throwable -> L10b
            r0.release()     // Catch: java.lang.Throwable -> L10b
            throw r1     // Catch: java.lang.Throwable -> L10b
        L114:
            androidx.room.RoomDatabase r0 = r13.__db
            r0.endTransaction()
            throw r14
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(java.util.List<java.lang.String> r6) {
            r5 = this;
            java.lang.StringBuilder r0 = androidx.room.util.StringUtil.newStringBuilder()
            java.lang.String r1 = "SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN ("
            r0.append(r1)
            int r1 = r6.size()
            androidx.room.util.StringUtil.appendPlaceholders(r0, r1)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            java.util.Iterator r6 = r6.iterator()
            r1 = 1
            r2 = 1
        L23:
            boolean r3 = r6.hasNext()
            if (r3 == 0) goto L3b
            java.lang.Object r3 = r6.next()
            java.lang.String r3 = (java.lang.String) r3
            if (r3 != 0) goto L35
            r0.bindNull(r2)
            goto L38
        L35:
            r0.bindString(r2, r3)
        L38:
            int r2 = r2 + 1
            goto L23
        L3b:
            androidx.room.RoomDatabase r6 = r5.__db
            androidx.room.InvalidationTracker r6 = r6.getInvalidationTracker()
            java.lang.String r2 = "WorkProgress"
            java.lang.String r3 = "workspec"
            java.lang.String r4 = "WorkTag"
            java.lang.String[] r2 = new java.lang.String[]{r4, r2, r3}
            androidx.work.impl.model.WorkSpecDao_Impl$11 r3 = new androidx.work.impl.model.WorkSpecDao_Impl$11
            r3.<init>(r5, r0)
            androidx.lifecycle.LiveData r6 = r6.createLiveData(r2, r1, r3)
            return r6
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=?)"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r7 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r7)
        L10:
            androidx.room.RoomDatabase r7 = r6.__db
            androidx.room.InvalidationTracker r7 = r7.getInvalidationTracker()
            java.lang.String r2 = "workspec"
            java.lang.String r3 = "workname"
            java.lang.String r4 = "WorkTag"
            java.lang.String r5 = "WorkProgress"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r2, r3}
            androidx.work.impl.model.WorkSpecDao_Impl$13 r3 = new androidx.work.impl.model.WorkSpecDao_Impl$13
            r3.<init>(r6, r0)
            androidx.lifecycle.LiveData r7 = r7.createLiveData(r2, r1, r3)
            return r7
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=?)"
            r1 = 1
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            if (r7 != 0) goto Ld
            r0.bindNull(r1)
            goto L10
        Ld:
            r0.bindString(r1, r7)
        L10:
            androidx.room.RoomDatabase r7 = r6.__db
            androidx.room.InvalidationTracker r7 = r7.getInvalidationTracker()
            java.lang.String r2 = "workspec"
            java.lang.String r3 = "worktag"
            java.lang.String r4 = "WorkTag"
            java.lang.String r5 = "WorkProgress"
            java.lang.String[] r2 = new java.lang.String[]{r4, r5, r2, r3}
            androidx.work.impl.model.WorkSpecDao_Impl$12 r3 = new androidx.work.impl.model.WorkSpecDao_Impl$12
            r3.<init>(r6, r0)
            androidx.lifecycle.LiveData r7 = r7.createLiveData(r2, r1, r3)
            return r7
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public boolean hasUnfinishedWork() {
            r4 = this;
            java.lang.String r0 = "SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1"
            r1 = 0
            androidx.room.RoomSQLiteQuery r0 = androidx.room.RoomSQLiteQuery.acquire(r0, r1)
            androidx.room.RoomDatabase r2 = r4.__db
            r2.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r2 = r4.__db
            r3 = 0
            android.database.Cursor r2 = androidx.room.util.DBUtil.query(r2, r0, r1, r3)
            boolean r3 = r2.moveToFirst()     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            int r3 = r2.getInt(r1)     // Catch: java.lang.Throwable -> L21
            if (r3 == 0) goto L23
            r1 = 1
            goto L23
        L21:
            r1 = move-exception
            goto L2a
        L23:
            r2.close()
            r0.release()
            return r1
        L2a:
            r2.close()
            r0.release()
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int incrementWorkSpecRunAttemptCount(java.lang.String r3) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfIncrementWorkSpecRunAttemptCount
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            r1 = 1
            if (r3 != 0) goto L12
            r0.bindNull(r1)
            goto L15
        L12:
            r0.bindString(r1, r3)
        L15:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            int r3 = r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L2e
            androidx.room.RoomDatabase r1 = r2.__db     // Catch: java.lang.Throwable -> L2e
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2e
            androidx.room.RoomDatabase r1 = r2.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r2.__preparedStmtOfIncrementWorkSpecRunAttemptCount
            r1.release(r0)
            return r3
        L2e:
            r3 = move-exception
            androidx.room.RoomDatabase r1 = r2.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r2.__preparedStmtOfIncrementWorkSpecRunAttemptCount
            r1.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void insertWorkSpec(androidx.work.impl.model.WorkSpec r2) {
            r1 = this;
            androidx.room.RoomDatabase r0 = r1.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.RoomDatabase r0 = r1.__db
            r0.beginTransaction()
            androidx.room.EntityInsertionAdapter<androidx.work.impl.model.WorkSpec> r0 = r1.__insertionAdapterOfWorkSpec     // Catch: java.lang.Throwable -> L1a
            r0.insert(r2)     // Catch: java.lang.Throwable -> L1a
            androidx.room.RoomDatabase r2 = r1.__db     // Catch: java.lang.Throwable -> L1a
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L1a
            androidx.room.RoomDatabase r2 = r1.__db
            r2.endTransaction()
            return
        L1a:
            r2 = move-exception
            androidx.room.RoomDatabase r0 = r1.__db
            r0.endTransaction()
            throw r2
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int markWorkSpecScheduled(java.lang.String r3, long r4) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfMarkWorkSpecScheduled
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            r1 = 1
            r0.bindLong(r1, r4)
            r4 = 2
            if (r3 != 0) goto L16
            r0.bindNull(r4)
            goto L19
        L16:
            r0.bindString(r4, r3)
        L19:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            int r3 = r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L32
            androidx.room.RoomDatabase r4 = r2.__db     // Catch: java.lang.Throwable -> L32
            r4.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L32
            androidx.room.RoomDatabase r4 = r2.__db
            r4.endTransaction()
            androidx.room.SharedSQLiteStatement r4 = r2.__preparedStmtOfMarkWorkSpecScheduled
            r4.release(r0)
            return r3
        L32:
            r3 = move-exception
            androidx.room.RoomDatabase r4 = r2.__db
            r4.endTransaction()
            androidx.room.SharedSQLiteStatement r4 = r2.__preparedStmtOfMarkWorkSpecScheduled
            r4.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast() {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r3.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            androidx.room.RoomDatabase r1 = r3.__db
            r1.beginTransaction()
            r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L23
            androidx.room.RoomDatabase r1 = r3.__db     // Catch: java.lang.Throwable -> L23
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L23
            androidx.room.RoomDatabase r1 = r3.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r3.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast
            r1.release(r0)
            return
        L23:
            r1 = move-exception
            androidx.room.RoomDatabase r2 = r3.__db
            r2.endTransaction()
            androidx.room.SharedSQLiteStatement r2 = r3.__preparedStmtOfPruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast
            r2.release(r0)
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetScheduledState() {
            r3 = this;
            androidx.room.RoomDatabase r0 = r3.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r3.__preparedStmtOfResetScheduledState
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            androidx.room.RoomDatabase r1 = r3.__db
            r1.beginTransaction()
            int r1 = r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L24
            androidx.room.RoomDatabase r2 = r3.__db     // Catch: java.lang.Throwable -> L24
            r2.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L24
            androidx.room.RoomDatabase r2 = r3.__db
            r2.endTransaction()
            androidx.room.SharedSQLiteStatement r2 = r3.__preparedStmtOfResetScheduledState
            r2.release(r0)
            return r1
        L24:
            r1 = move-exception
            androidx.room.RoomDatabase r2 = r3.__db
            r2.endTransaction()
            androidx.room.SharedSQLiteStatement r2 = r3.__preparedStmtOfResetScheduledState
            r2.release(r0)
            throw r1
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int resetWorkSpecRunAttemptCount(java.lang.String r3) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfResetWorkSpecRunAttemptCount
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            r1 = 1
            if (r3 != 0) goto L12
            r0.bindNull(r1)
            goto L15
        L12:
            r0.bindString(r1, r3)
        L15:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            int r3 = r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L2e
            androidx.room.RoomDatabase r1 = r2.__db     // Catch: java.lang.Throwable -> L2e
            r1.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L2e
            androidx.room.RoomDatabase r1 = r2.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r2.__preparedStmtOfResetWorkSpecRunAttemptCount
            r1.release(r0)
            return r3
        L2e:
            r3 = move-exception
            androidx.room.RoomDatabase r1 = r2.__db
            r1.endTransaction()
            androidx.room.SharedSQLiteStatement r1 = r2.__preparedStmtOfResetWorkSpecRunAttemptCount
            r1.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setOutput(java.lang.String r3, androidx.work.Data r4) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfSetOutput
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            byte[] r4 = androidx.work.Data.toByteArrayInternal(r4)
            r1 = 1
            if (r4 != 0) goto L16
            r0.bindNull(r1)
            goto L19
        L16:
            r0.bindBlob(r1, r4)
        L19:
            r4 = 2
            if (r3 != 0) goto L20
            r0.bindNull(r4)
            goto L23
        L20:
            r0.bindString(r4, r3)
        L23:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L3b
            androidx.room.RoomDatabase r3 = r2.__db     // Catch: java.lang.Throwable -> L3b
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L3b
            androidx.room.RoomDatabase r3 = r2.__db
            r3.endTransaction()
            androidx.room.SharedSQLiteStatement r3 = r2.__preparedStmtOfSetOutput
            r3.release(r0)
            return
        L3b:
            r3 = move-exception
            androidx.room.RoomDatabase r4 = r2.__db
            r4.endTransaction()
            androidx.room.SharedSQLiteStatement r4 = r2.__preparedStmtOfSetOutput
            r4.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public void setPeriodStartTime(java.lang.String r3, long r4) {
            r2 = this;
            androidx.room.RoomDatabase r0 = r2.__db
            r0.assertNotSuspendingTransaction()
            androidx.room.SharedSQLiteStatement r0 = r2.__preparedStmtOfSetPeriodStartTime
            androidx.sqlite.db.SupportSQLiteStatement r0 = r0.acquire()
            r1 = 1
            r0.bindLong(r1, r4)
            r4 = 2
            if (r3 != 0) goto L16
            r0.bindNull(r4)
            goto L19
        L16:
            r0.bindString(r4, r3)
        L19:
            androidx.room.RoomDatabase r3 = r2.__db
            r3.beginTransaction()
            r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L31
            androidx.room.RoomDatabase r3 = r2.__db     // Catch: java.lang.Throwable -> L31
            r3.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L31
            androidx.room.RoomDatabase r3 = r2.__db
            r3.endTransaction()
            androidx.room.SharedSQLiteStatement r3 = r2.__preparedStmtOfSetPeriodStartTime
            r3.release(r0)
            return
        L31:
            r3 = move-exception
            androidx.room.RoomDatabase r4 = r2.__db
            r4.endTransaction()
            androidx.room.SharedSQLiteStatement r4 = r2.__preparedStmtOfSetPeriodStartTime
            r4.release(r0)
            throw r3
    }

    @Override // androidx.work.impl.model.WorkSpecDao
    public int setState(androidx.work.WorkInfo.State r5, java.lang.String... r6) {
            r4 = this;
            androidx.room.RoomDatabase r0 = r4.__db
            r0.assertNotSuspendingTransaction()
            java.lang.StringBuilder r0 = androidx.room.util.StringUtil.newStringBuilder()
            java.lang.String r1 = "UPDATE workspec SET state="
            r0.append(r1)
            java.lang.String r1 = "?"
            r0.append(r1)
            java.lang.String r1 = " WHERE id IN ("
            r0.append(r1)
            int r1 = r6.length
            androidx.room.util.StringUtil.appendPlaceholders(r0, r1)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            androidx.room.RoomDatabase r1 = r4.__db
            androidx.sqlite.db.SupportSQLiteStatement r0 = r1.compileStatement(r0)
            int r5 = androidx.work.impl.model.WorkTypeConverters.stateToInt(r5)
            long r1 = (long) r5
            r5 = 1
            r0.bindLong(r5, r1)
            int r5 = r6.length
            r1 = 2
            r2 = 0
        L37:
            if (r2 >= r5) goto L49
            r3 = r6[r2]
            if (r3 != 0) goto L41
            r0.bindNull(r1)
            goto L44
        L41:
            r0.bindString(r1, r3)
        L44:
            int r1 = r1 + 1
            int r2 = r2 + 1
            goto L37
        L49:
            androidx.room.RoomDatabase r5 = r4.__db
            r5.beginTransaction()
            int r5 = r0.executeUpdateDelete()     // Catch: java.lang.Throwable -> L5d
            androidx.room.RoomDatabase r6 = r4.__db     // Catch: java.lang.Throwable -> L5d
            r6.setTransactionSuccessful()     // Catch: java.lang.Throwable -> L5d
            androidx.room.RoomDatabase r6 = r4.__db
            r6.endTransaction()
            return r5
        L5d:
            r5 = move-exception
            androidx.room.RoomDatabase r6 = r4.__db
            r6.endTransaction()
            throw r5
    }
}

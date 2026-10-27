package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Dao
@android.annotation.SuppressLint({"UnknownNullness"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface WorkSpecDao {
    @androidx.room.Query("DELETE FROM workspec WHERE id=:id")
    void delete(java.lang.String r1);

    @androidx.room.Query("SELECT * FROM workspec WHERE state=0 ORDER BY period_start_time LIMIT :maxLimit")
    java.util.List<androidx.work.impl.model.WorkSpec> getAllEligibleWorkSpecsForScheduling(int r1);

    @androidx.room.Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5)")
    java.util.List<java.lang.String> getAllUnfinishedWork();

    @androidx.room.Query("SELECT id FROM workspec")
    java.util.List<java.lang.String> getAllWorkSpecIds();

    @androidx.room.Query("SELECT id FROM workspec")
    @androidx.room.Transaction
    androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getAllWorkSpecIdsLiveData();

    @androidx.room.Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at=-1 ORDER BY period_start_time LIMIT (SELECT MAX(:schedulerLimit-COUNT(*), 0) FROM workspec WHERE schedule_requested_at<>-1 AND state NOT IN (2, 3, 5))")
    java.util.List<androidx.work.impl.model.WorkSpec> getEligibleWorkForScheduling(int r1);

    @androidx.room.Query("SELECT output FROM workspec WHERE id IN (SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id)")
    java.util.List<androidx.work.Data> getInputsFromPrerequisites(java.lang.String r1);

    @androidx.room.Query("SELECT * FROM workspec WHERE period_start_time >= :startingAt AND state IN (2, 3, 5) ORDER BY period_start_time DESC")
    java.util.List<androidx.work.impl.model.WorkSpec> getRecentlyCompletedWork(long r1);

    @androidx.room.Query("SELECT * FROM workspec WHERE state=1")
    java.util.List<androidx.work.impl.model.WorkSpec> getRunningWork();

    @androidx.room.Query("SELECT schedule_requested_at FROM workspec WHERE id=:id")
    androidx.lifecycle.LiveData<java.lang.Long> getScheduleRequestedAtLiveData(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.room.Query("SELECT * FROM workspec WHERE state=0 AND schedule_requested_at<>-1")
    java.util.List<androidx.work.impl.model.WorkSpec> getScheduledWork();

    @androidx.room.Query("SELECT state FROM workspec WHERE id=:id")
    androidx.work.WorkInfo.State getState(java.lang.String r1);

    @androidx.room.Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    java.util.List<java.lang.String> getUnfinishedWorkWithName(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.room.Query("SELECT id FROM workspec WHERE state NOT IN (2, 3, 5) AND id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    java.util.List<java.lang.String> getUnfinishedWorkWithTag(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.room.Query("SELECT * FROM workspec WHERE id=:id")
    androidx.work.impl.model.WorkSpec getWorkSpec(java.lang.String r1);

    @androidx.room.Query("SELECT id, state FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    java.util.List<androidx.work.impl.model.WorkSpec.IdAndState> getWorkSpecIdAndStatesForName(java.lang.String r1);

    @androidx.room.Query("SELECT * FROM workspec WHERE id IN (:ids)")
    androidx.work.impl.model.WorkSpec[] getWorkSpecs(java.util.List<java.lang.String> r1);

    @androidx.room.Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id=:id")
    @androidx.room.Transaction
    androidx.work.impl.model.WorkSpec.WorkInfoPojo getWorkStatusPojoForId(java.lang.String r1);

    @androidx.room.Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    @androidx.room.Transaction
    java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForIds(java.util.List<java.lang.String> r1);

    @androidx.room.Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @androidx.room.Transaction
    java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForName(java.lang.String r1);

    @androidx.room.Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @androidx.room.Transaction
    java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkStatusPojoForTag(java.lang.String r1);

    @androidx.room.Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (:ids)")
    @androidx.room.Transaction
    androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForIds(java.util.List<java.lang.String> r1);

    @androidx.room.Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM workname WHERE name=:name)")
    @androidx.room.Transaction
    androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForName(java.lang.String r1);

    @androidx.room.Query("SELECT id, state, output, run_attempt_count FROM workspec WHERE id IN (SELECT work_spec_id FROM worktag WHERE tag=:tag)")
    @androidx.room.Transaction
    androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkStatusPojoLiveDataForTag(java.lang.String r1);

    @androidx.room.Query("SELECT COUNT(*) > 0 FROM workspec WHERE state NOT IN (2, 3, 5) LIMIT 1")
    boolean hasUnfinishedWork();

    @androidx.room.Query("UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=:id")
    int incrementWorkSpecRunAttemptCount(java.lang.String r1);

    @androidx.room.Insert(onConflict = 5)
    void insertWorkSpec(androidx.work.impl.model.WorkSpec r1);

    @androidx.room.Query("UPDATE workspec SET schedule_requested_at=:startTime WHERE id=:id")
    int markWorkSpecScheduled(@androidx.annotation.NonNull java.lang.String r1, long r2);

    @androidx.room.Query("DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))")
    void pruneFinishedWorkWithZeroDependentsIgnoringKeepForAtLeast();

    @androidx.room.Query("UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)")
    int resetScheduledState();

    @androidx.room.Query("UPDATE workspec SET run_attempt_count=0 WHERE id=:id")
    int resetWorkSpecRunAttemptCount(java.lang.String r1);

    @androidx.room.Query("UPDATE workspec SET output=:output WHERE id=:id")
    void setOutput(java.lang.String r1, androidx.work.Data r2);

    @androidx.room.Query("UPDATE workspec SET period_start_time=:periodStartTime WHERE id=:id")
    void setPeriodStartTime(java.lang.String r1, long r2);

    @androidx.room.Query("UPDATE workspec SET state=:state WHERE id IN (:ids)")
    int setState(androidx.work.WorkInfo.State r1, java.lang.String... r2);
}

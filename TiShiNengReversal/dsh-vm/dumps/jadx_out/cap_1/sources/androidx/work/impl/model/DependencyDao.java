package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Dao
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface DependencyDao {
    @androidx.room.Query("SELECT work_spec_id FROM dependency WHERE prerequisite_id=:id")
    java.util.List<java.lang.String> getDependentWorkIds(java.lang.String r1);

    @androidx.room.Query("SELECT prerequisite_id FROM dependency WHERE work_spec_id=:id")
    java.util.List<java.lang.String> getPrerequisites(java.lang.String r1);

    @androidx.room.Query("SELECT COUNT(*)=0 FROM dependency WHERE work_spec_id=:id AND prerequisite_id IN (SELECT id FROM workspec WHERE state!=2)")
    boolean hasCompletedAllPrerequisites(java.lang.String r1);

    @androidx.room.Query("SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=:id")
    boolean hasDependents(java.lang.String r1);

    @androidx.room.Insert(onConflict = 5)
    void insertDependency(androidx.work.impl.model.Dependency r1);
}

package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Dao
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface WorkProgressDao {
    @androidx.room.Query("DELETE from WorkProgress where work_spec_id=:workSpecId")
    void delete(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.room.Query("DELETE FROM WorkProgress")
    void deleteAll();

    @androidx.annotation.Nullable
    @androidx.room.Query("SELECT progress FROM WorkProgress WHERE work_spec_id=:workSpecId")
    androidx.work.Data getProgressForWorkSpecId(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.NonNull
    @androidx.room.Query("SELECT progress FROM WorkProgress WHERE work_spec_id IN (:workSpecIds)")
    java.util.List<androidx.work.Data> getProgressForWorkSpecIds(@androidx.annotation.NonNull java.util.List<java.lang.String> r1);

    @androidx.room.Insert(onConflict = 1)
    void insert(@androidx.annotation.NonNull androidx.work.impl.model.WorkProgress r1);
}

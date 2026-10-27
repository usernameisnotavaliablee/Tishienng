package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Dao
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface SystemIdInfoDao {
    @androidx.annotation.Nullable
    @androidx.room.Query("SELECT * FROM SystemIdInfo WHERE work_spec_id=:workSpecId")
    androidx.work.impl.model.SystemIdInfo getSystemIdInfo(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.NonNull
    @androidx.room.Query("SELECT DISTINCT work_spec_id FROM SystemIdInfo")
    java.util.List<java.lang.String> getWorkSpecIds();

    @androidx.room.Insert(onConflict = 1)
    void insertSystemIdInfo(@androidx.annotation.NonNull androidx.work.impl.model.SystemIdInfo r1);

    @androidx.room.Query("DELETE FROM SystemIdInfo where work_spec_id=:workSpecId")
    void removeSystemIdInfo(@androidx.annotation.NonNull java.lang.String r1);
}

package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Dao
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface WorkTagDao {
    @androidx.room.Query("SELECT DISTINCT tag FROM worktag WHERE work_spec_id=:id")
    java.util.List<java.lang.String> getTagsForWorkSpecId(java.lang.String r1);

    @androidx.room.Query("SELECT work_spec_id FROM worktag WHERE tag=:tag")
    java.util.List<java.lang.String> getWorkSpecIdsWithTag(java.lang.String r1);

    @androidx.room.Insert(onConflict = 5)
    void insert(androidx.work.impl.model.WorkTag r1);
}

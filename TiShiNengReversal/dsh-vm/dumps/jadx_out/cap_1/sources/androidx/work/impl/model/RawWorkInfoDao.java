package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Dao
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface RawWorkInfoDao {
    @androidx.annotation.NonNull
    @androidx.room.RawQuery(observedEntities = {androidx.work.impl.model.WorkSpec.class})
    java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo> getWorkInfoPojos(@androidx.annotation.NonNull androidx.sqlite.db.SupportSQLiteQuery r1);

    @androidx.annotation.NonNull
    @androidx.room.RawQuery(observedEntities = {androidx.work.impl.model.WorkSpec.class})
    androidx.lifecycle.LiveData<java.util.List<androidx.work.impl.model.WorkSpec.WorkInfoPojo>> getWorkInfoPojosLiveData(@androidx.annotation.NonNull androidx.sqlite.db.SupportSQLiteQuery r1);
}

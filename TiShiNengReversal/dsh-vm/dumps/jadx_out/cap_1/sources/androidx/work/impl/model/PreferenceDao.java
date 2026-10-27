package androidx.work.impl.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.room.Dao
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public interface PreferenceDao {
    @androidx.annotation.Nullable
    @androidx.room.Query("SELECT long_value FROM Preference where `key`=:key")
    java.lang.Long getLongValue(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.annotation.NonNull
    @androidx.room.Query("SELECT long_value FROM Preference where `key`=:key")
    androidx.lifecycle.LiveData<java.lang.Long> getObservableLongValue(@androidx.annotation.NonNull java.lang.String r1);

    @androidx.room.Insert(onConflict = 1)
    void insertPreference(@androidx.annotation.NonNull androidx.work.impl.model.Preference r1);
}

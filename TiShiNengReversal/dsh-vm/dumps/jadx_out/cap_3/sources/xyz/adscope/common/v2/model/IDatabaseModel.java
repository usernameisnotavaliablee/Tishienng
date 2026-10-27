package xyz.adscope.common.v2.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IDatabaseModel {
    public static final java.lang.String PRIMARY_KEY_COLUM = "id";

    java.lang.String[] getColumns();

    android.content.ContentValues getContentValuesStruct();

    java.util.Map<java.lang.String, java.lang.String> getMapStruct();

    long getPrimaryID();

    void parseFromDb(android.database.Cursor r1);

    void setPrimaryID(long r1);
}

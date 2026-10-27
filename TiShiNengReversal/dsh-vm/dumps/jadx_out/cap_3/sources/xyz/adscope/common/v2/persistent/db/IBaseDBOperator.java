package xyz.adscope.common.v2.persistent.db;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IBaseDBOperator {
    public static final java.lang.String ORDER_BY_ASC = "asc";
    public static final java.lang.String ORDER_BY_DESC = "desc";
    public static final int QUERY_NO_LIMIT = -1;

    int delete(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r1, java.lang.String r2, java.lang.String[] r3);

    int deleteBetweenPrimaryKey(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r1, long[] r2);

    int deleteByPrimaryKey(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r1, long r2);

    int deleteEqualWhere(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r1, java.lang.String r2, java.lang.String r3);

    int deleteGreaterThenWhere(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r1, java.lang.String r2, java.lang.String r3);

    int deleteInPrimaryKey(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r1, long[] r2);

    int deleteLessThenWhere(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r1, java.lang.String r2, java.lang.String r3);

    boolean execSQL(java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel> r1, java.lang.String r2);

    boolean execSQL(java.lang.String r1);

    java.lang.String getOrderByAsc(java.lang.String r1);

    java.lang.String getOrderByDesc(java.lang.String r1);

    long insert(xyz.adscope.common.v2.model.IDatabaseModel r1);

    <E extends xyz.adscope.common.v2.model.IDatabaseModel> java.util.List<E> query(java.lang.Class<E> r1, java.lang.String r2);

    <E extends xyz.adscope.common.v2.model.IDatabaseModel> java.util.List<E> query(java.lang.Class<E> r1, java.lang.String r2, java.lang.String[] r3, java.lang.String r4, int r5);

    <E extends xyz.adscope.common.v2.model.IDatabaseModel> java.util.List<E> query(java.lang.Class<E> r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5, int r6);

    <E extends xyz.adscope.common.v2.model.IDatabaseModel> java.util.List<E> query(java.lang.Class<E> r1, java.lang.String[] r2, java.lang.String r3, java.lang.String[] r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, int r8);

    <E extends xyz.adscope.common.v2.model.IDatabaseModel> int queryNumEntries(java.lang.Class<E> r1);

    <E extends xyz.adscope.common.v2.model.IDatabaseModel> long[] queryPrimerByDeleteCount(java.lang.Class<E> r1, int r2);

    int update(xyz.adscope.common.v2.model.IDatabaseModel r1, java.lang.String r2, java.lang.String[] r3);

    int updateByPrimaryKey(xyz.adscope.common.v2.model.IDatabaseModel r1, long r2);

    int updateSignalCondition(xyz.adscope.common.v2.model.IDatabaseModel r1, java.lang.String r2, java.lang.String r3, java.lang.String[] r4);

    java.lang.String whereBuild(java.lang.String[] r1, java.lang.String[] r2);
}

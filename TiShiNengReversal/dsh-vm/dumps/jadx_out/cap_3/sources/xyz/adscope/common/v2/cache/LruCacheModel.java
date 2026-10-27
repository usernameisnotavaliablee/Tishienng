package xyz.adscope.common.v2.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum LruCacheModel extends java.lang.Enum<xyz.adscope.common.v2.cache.LruCacheModel> {
    private static final /* synthetic */ xyz.adscope.common.v2.cache.LruCacheModel[] $VALUES = null;
    public static final xyz.adscope.common.v2.cache.LruCacheModel PERMANENT = null;
    public static final xyz.adscope.common.v2.cache.LruCacheModel TEMPORARY = null;

    private static /* synthetic */ xyz.adscope.common.v2.cache.LruCacheModel[] $values() {
            r0 = 2
            xyz.adscope.common.v2.cache.LruCacheModel[] r0 = new xyz.adscope.common.v2.cache.LruCacheModel[r0]
            xyz.adscope.common.v2.cache.LruCacheModel r1 = xyz.adscope.common.v2.cache.LruCacheModel.PERMANENT
            r2 = 0
            r0[r2] = r1
            xyz.adscope.common.v2.cache.LruCacheModel r1 = xyz.adscope.common.v2.cache.LruCacheModel.TEMPORARY
            r2 = 1
            r0[r2] = r1
            return r0
    }

    static {
            xyz.adscope.common.v2.cache.LruCacheModel r0 = new xyz.adscope.common.v2.cache.LruCacheModel
            java.lang.String r1 = "PERMANENT"
            r2 = 0
            r0.<init>(r1, r2)
            xyz.adscope.common.v2.cache.LruCacheModel.PERMANENT = r0
            xyz.adscope.common.v2.cache.LruCacheModel r0 = new xyz.adscope.common.v2.cache.LruCacheModel
            java.lang.String r1 = "TEMPORARY"
            r2 = 1
            r0.<init>(r1, r2)
            xyz.adscope.common.v2.cache.LruCacheModel.TEMPORARY = r0
            xyz.adscope.common.v2.cache.LruCacheModel[] r0 = $values()
            xyz.adscope.common.v2.cache.LruCacheModel.$VALUES = r0
            return
    }

    LruCacheModel(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static xyz.adscope.common.v2.cache.LruCacheModel valueOf(java.lang.String r1) {
            java.lang.Class<xyz.adscope.common.v2.cache.LruCacheModel> r0 = xyz.adscope.common.v2.cache.LruCacheModel.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xyz.adscope.common.v2.cache.LruCacheModel r1 = (xyz.adscope.common.v2.cache.LruCacheModel) r1
            return r1
    }

    public static xyz.adscope.common.v2.cache.LruCacheModel[] values() {
            xyz.adscope.common.v2.cache.LruCacheModel[] r0 = xyz.adscope.common.v2.cache.LruCacheModel.$VALUES
            java.lang.Object r0 = r0.clone()
            xyz.adscope.common.v2.cache.LruCacheModel[] r0 = (xyz.adscope.common.v2.cache.LruCacheModel[]) r0
            return r0
    }
}

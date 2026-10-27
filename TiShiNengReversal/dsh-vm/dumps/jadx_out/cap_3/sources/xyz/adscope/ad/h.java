package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class h extends xyz.adscope.common.v2.persistent.db.IBaseDbHelper {
    public h(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDbHelper
    protected java.util.List<java.lang.Class<? extends xyz.adscope.common.v2.model.IDatabaseModel>> acceptTable() {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.Class<xyz.adscope.ad.model.impl.db.AdvertisingDBModel> r1 = xyz.adscope.ad.model.impl.db.AdvertisingDBModel.class
            r0.add(r1)
            java.lang.Class<xyz.adscope.ad.model.impl.db.StrategyEventDBModel> r1 = xyz.adscope.ad.model.impl.db.StrategyEventDBModel.class
            r0.add(r1)
            return r0
    }

    @Override // xyz.adscope.common.v2.persistent.db.IBaseDbHelper
    protected java.lang.String createDBNameWithoutSuffix() {
            r1 = this;
            java.lang.String r0 = xyz.adscope.ad.f0.a()
            return r0
    }
}

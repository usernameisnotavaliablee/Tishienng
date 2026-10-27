package xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.unite;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class UniteControlModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "random")
    private int a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "duration")
    private long b;

    public UniteControlModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public long a() {
            r2 = this;
            long r0 = r2.b
            return r0
    }

    public int b() {
            r1 = this;
            int r0 = r1.a
            return r0
    }
}

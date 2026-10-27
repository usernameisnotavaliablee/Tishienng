package xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class StrategyFilterModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "spaceID")
    private java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "minTime")
    private int b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "frequency")
    private java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.frequency.StrategyFrequencyModel> c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "uniteControl")
    private xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.unite.UniteControlModel d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "complain")
    private xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.complain.ComplainModel e;

    public StrategyFilterModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.complain.ComplainModel a() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.complain.ComplainModel r0 = r1.e
            return r0
    }

    public java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.frequency.StrategyFrequencyModel> b() {
            r1 = this;
            java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.frequency.StrategyFrequencyModel> r0 = r1.c
            return r0
    }

    public int c() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.unite.UniteControlModel e() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.unite.UniteControlModel r0 = r1.d
            return r0
    }
}

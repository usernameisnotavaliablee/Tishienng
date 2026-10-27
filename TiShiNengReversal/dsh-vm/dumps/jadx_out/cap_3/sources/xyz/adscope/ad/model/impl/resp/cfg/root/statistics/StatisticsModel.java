package xyz.adscope.ad.model.impl.resp.cfg.root.statistics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class StatisticsModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "task")
    private java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel> a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "event")
    private java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.event.ConfigEventModel> b;

    public StatisticsModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.event.ConfigEventModel> a() {
            r1 = this;
            java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.event.ConfigEventModel> r0 = r1.b
            return r0
    }

    public java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel> b() {
            r1 = this;
            java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.TaskModel> r0 = r1.a
            return r0
    }
}

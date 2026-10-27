package xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.taskurl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class TaskUrlModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "implement")
    private java.lang.String a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "url")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "nextTime")
    private long c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "randomTime")
    private long d;

    public TaskUrlModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public long b() {
            r2 = this;
            long r0 = r2.c
            return r0
    }

    public long c() {
            r2 = this;
            long r0 = r2.d
            return r0
    }

    public java.lang.String d() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }
}

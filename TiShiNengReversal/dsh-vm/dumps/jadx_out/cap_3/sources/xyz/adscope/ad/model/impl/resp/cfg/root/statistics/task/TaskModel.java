package xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class TaskModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "taskType")
    private int a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "taskReport")
    private int b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "pkgs")
    private java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.pkg.PkgModel> c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "delay")
    private int d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "reportUrl")
    private java.lang.String e;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "taskUrls")
    private java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.taskurl.TaskUrlModel> f;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "macros")
    private java.lang.String g;

    public TaskModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public int a() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    public java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.pkg.PkgModel> b() {
            r1 = this;
            java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.pkg.PkgModel> r0 = r1.c
            return r0
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.e
            return r0
    }

    public int d() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    public int e() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    public java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.taskurl.TaskUrlModel> f() {
            r1 = this;
            java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.statistics.task.taskurl.TaskUrlModel> r0 = r1.f
            return r0
    }

    public java.lang.String getMacros() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }
}

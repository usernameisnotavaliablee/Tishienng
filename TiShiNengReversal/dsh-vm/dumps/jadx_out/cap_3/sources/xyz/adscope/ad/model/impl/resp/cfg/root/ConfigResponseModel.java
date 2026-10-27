package xyz.adscope.ad.model.impl.resp.cfg.root;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ConfigResponseModel extends xyz.adscope.ad.model.impl.resp.ASNPJsonResponseModel implements xyz.adscope.common.v2.model.IDeepCopyModel {

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "update")
    private xyz.adscope.ad.model.impl.resp.cfg.root.update.UpdateModel a;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "updateMD5")
    private java.lang.String b;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "requestUrl")
    private xyz.adscope.ad.model.impl.resp.cfg.root.requrl.RequestUrlModel c;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "requestUrlMD5")
    private java.lang.String d;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "statistics")
    private xyz.adscope.ad.model.impl.resp.cfg.root.statistics.StatisticsModel e;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "statisticsMD5")
    private java.lang.String f;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "spaceStrategy")
    private java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.strategy.StrategyModel> g;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "spaceStrategyMD5")
    private java.lang.String h;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "templateMD5")
    private java.lang.String i;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "defTemplate")
    private java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.temp.TemplateModel> j;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "requestRule")
    private java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel> k;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "testPlan")
    private xyz.adscope.ad.model.impl.resp.cfg.root.beta.BetaTestPlanModel l;

    @xyz.adscope.common.v2.model.annotation.JsonParseNode(key = "logStrategy")
    private xyz.adscope.ad.model.impl.resp.cfg.root.log2.Analyse2ConfigModel m;

    public ConfigResponseModel(org.json.JSONObject r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel a() {
            r2 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = new xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel
            org.json.JSONObject r1 = r2.mJsonObject
            r0.<init>(r1)
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel a(xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r7) {
            r6 = this;
            java.lang.Class<xyz.adscope.common.v2.model.annotation.JsonParseNode> r0 = xyz.adscope.common.v2.model.annotation.JsonParseNode.class
            org.json.JSONObject r1 = xyz.adscope.common.v2.tool.json.JsonUtil.emptyJSONObject()
            java.lang.Class r2 = r6.getClass()
            java.util.List r2 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.getAllFields(r2)
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L5a
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L52
        L18:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L52
            if (r3 == 0) goto L54
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L52
            java.lang.reflect.Field r3 = (java.lang.reflect.Field) r3     // Catch: java.lang.Throwable -> L52
            boolean r4 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.isAnnotationType(r3, r0)     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L18
            java.lang.annotation.Annotation r4 = r3.getAnnotation(r0)     // Catch: java.lang.Throwable -> L52
            xyz.adscope.common.v2.model.annotation.JsonParseNode r4 = (xyz.adscope.common.v2.model.annotation.JsonParseNode) r4     // Catch: java.lang.Throwable -> L52
            if (r4 == 0) goto L18
            java.lang.String r4 = r4.key()     // Catch: java.lang.Throwable -> L52
            org.json.JSONObject r5 = r6.mJsonObject     // Catch: java.lang.Throwable -> L52
            java.lang.Object r5 = xyz.adscope.common.v2.tool.json.JsonUtil.getObject(r5, r4)     // Catch: java.lang.Throwable -> L52
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r1, r4, r5)     // Catch: java.lang.Throwable -> L52
            java.lang.Object r5 = xyz.adscope.common.v2.tool.reflect.ReflectUtil.getFieldValue(r7, r3)     // Catch: java.lang.Throwable -> L52
            if (r5 == 0) goto L18
            xyz.adscope.common.v2.tool.reflect.ReflectUtil.setFieldValue(r6, r3, r5)     // Catch: java.lang.Throwable -> L52
            org.json.JSONObject r3 = r7.mJsonObject     // Catch: java.lang.Throwable -> L52
            java.lang.Object r3 = xyz.adscope.common.v2.tool.json.JsonUtil.getObject(r3, r4)     // Catch: java.lang.Throwable -> L52
            xyz.adscope.common.v2.tool.json.JsonUtil.putObject(r1, r4, r3)     // Catch: java.lang.Throwable -> L52
            goto L18
        L52:
            r7 = move-exception
            goto L57
        L54:
            r6.mJsonObject = r1     // Catch: java.lang.Throwable -> L52
            return r6
        L57:
            xyz.adscope.common.v2.log.SDKLog.stack(r7)
        L5a:
            return r6
    }

    public xyz.adscope.ad.model.impl.resp.cfg.root.log2.Analyse2ConfigModel b() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.log2.Analyse2ConfigModel r0 = r1.m
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.cfg.root.beta.BetaTestPlanModel c() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.beta.BetaTestPlanModel r0 = r1.l
            return r0
    }

    public java.lang.String d() {
            r3 = this;
            java.lang.String r0 = "DEFAULT"
            java.lang.String r0 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r0)
            xyz.adscope.ad.model.impl.resp.cfg.root.statistics.StatisticsModel r1 = r3.e
            if (r1 == 0) goto L3d
            java.util.List r1 = r1.a()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L3d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r1 = r1.iterator()
        L1d:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L35
            java.lang.Object r2 = r1.next()
            xyz.adscope.ad.model.impl.resp.cfg.root.statistics.event.ConfigEventModel r2 = (xyz.adscope.ad.model.impl.resp.cfg.root.statistics.event.ConfigEventModel) r2
            java.lang.String r2 = r2.toJsonString()
            java.lang.String r2 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r2)
            r0.append(r2)
            goto L1d
        L35:
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = xyz.adscope.common.v2.encrypt.impl.MD5Util.md5(r0)
        L3d:
            return r0
    }

    @Override // xyz.adscope.common.v2.model.IDeepCopyModel
    public /* bridge */ /* synthetic */ xyz.adscope.common.v2.model.IDeepCopyModel deepCopy() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.ConfigResponseModel r0 = r1.a()
            return r0
    }

    public java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel> e() {
            r1 = this;
            java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel> r0 = r1.k
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.cfg.root.requrl.RequestUrlModel f() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.requrl.RequestUrlModel r0 = r1.c
            return r0
    }

    public java.lang.String g() {
            r1 = this;
            java.lang.String r0 = r1.d
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.cfg.root.statistics.StatisticsModel h() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.statistics.StatisticsModel r0 = r1.e
            return r0
    }

    public java.lang.String i() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }

    public java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.strategy.StrategyModel> j() {
            r1 = this;
            java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.strategy.StrategyModel> r0 = r1.g
            return r0
    }

    public java.lang.String k() {
            r1 = this;
            java.lang.String r0 = r1.h
            return r0
    }

    public java.lang.String l() {
            r1 = this;
            java.lang.String r0 = r1.i
            return r0
    }

    public java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.temp.TemplateModel> m() {
            r1 = this;
            java.util.List<xyz.adscope.ad.model.impl.resp.cfg.root.temp.TemplateModel> r0 = r1.j
            return r0
    }

    public xyz.adscope.ad.model.impl.resp.cfg.root.update.UpdateModel n() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.update.UpdateModel r0 = r1.a
            return r0
    }

    public java.lang.String o() {
            r1 = this;
            java.lang.String r0 = r1.b
            return r0
    }
}

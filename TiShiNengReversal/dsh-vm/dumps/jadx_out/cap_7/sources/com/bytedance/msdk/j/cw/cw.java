package com.bytedance.msdk.j.cw;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {
    private com.bykv.vk.openvk.api.proto.PluginValueSet cw;
    private com.bykv.vk.openvk.api.proto.PluginValueSet j;
    private com.bytedance.sdk.openadsdk.i.cw.cw.j r;
    private java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> up;
    private com.bykv.vk.openvk.api.proto.PluginValueSet xt;


    private cw(android.util.SparseArray<java.lang.Object> r3) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.up = r0
            com.bytedance.sdk.openadsdk.i.cw.cw.j r0 = new com.bytedance.sdk.openadsdk.i.cw.cw.j
            com.bytedance.msdk.core.j r1 = com.bytedance.msdk.core.j.qv()
            com.bykv.vk.openvk.api.proto.PluginValueSet r1 = r1.ol()
            android.util.SparseArray r1 = r1.sparseArray()
            r0.<init>(r1)
            r2.r = r0
            com.bykv.j.j.j.j.e r3 = com.bykv.j.j.j.j.e.i(r3)
            com.bykv.vk.openvk.api.proto.PluginValueSet r3 = r3.k()
            r2.j = r3
            if (r3 == 0) goto L49
            r0 = 8457(0x2109, float:1.1851E-41)
            com.bykv.vk.openvk.api.proto.PluginValueSet r3 = com.bytedance.sdk.openadsdk.i.cw.r.j(r0, r3)
            r2.cw = r3
            r3 = 8475(0x211b, float:1.1876E-41)
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.j
            com.bykv.vk.openvk.api.proto.PluginValueSet r3 = com.bytedance.sdk.openadsdk.i.cw.r.j(r3, r0)
            r2.xt = r3
            if (r3 == 0) goto L49
            r0 = 8311(0x2077, float:1.1646E-41)
            java.lang.Class r1 = z0.a.a()
            java.lang.Object r3 = r3.objectValue(r0, r1)
            java.util.function.Function r3 = z0.b.a(r3)
            r2.up = r3
        L49:
            r2.hh()
            return
    }

    private void b() {
            r4 = this;
            java.lang.String r0 = "---------  sdk 隐私设置 start ----"
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isCanUseLocation："
            r0.<init>(r1)
            boolean r1 = r4.g()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            com.bytedance.msdk.j.cw.r r0 = r4.az()
            java.lang.String r1 = "getLocation："
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r1.concat(r2)
            com.bytedance.msdk.j.up.cw.xt(r1)
            if (r0 == 0) goto L57
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getLocation getLatitude："
            r1.<init>(r2)
            double r2 = r0.j()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.msdk.j.up.cw.xt(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "getLocation getLongitude："
            r1.<init>(r2)
            double r2 = r0.xt()
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
        L57:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "appList："
            r0.<init>(r1)
            boolean r1 = r4.qv()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isCanUsePhoneState："
            r0.<init>(r1)
            boolean r1 = r4.tl()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isLimitPersonalAds："
            r0.<init>(r1)
            boolean r1 = r4.ae()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getDevImei："
            r0.<init>(r1)
            java.lang.String r1 = r4.av()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isCanUseWifiState："
            r0.<init>(r1)
            boolean r1 = r4.v()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getMacAddress："
            r0.<init>(r1)
            java.lang.String r1 = r4.tj()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "userPrivacyConfig："
            r0.<init>(r1)
            java.util.Map r1 = r4.f()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isCanUseWriteExternal："
            r0.<init>(r1)
            boolean r1 = r4.oq()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isCanUseAndroidId："
            r0.<init>(r1)
            boolean r1 = r4.jy()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getAndroidId："
            r0.<init>(r1)
            java.lang.String r1 = r4.w()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.util.List r0 = r4.x()
            java.lang.String r1 = "getAppList："
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r1.concat(r2)
            com.bytedance.msdk.j.up.cw.xt(r1)
            if (r0 == 0) goto L15a
            java.util.Iterator r0 = r0.iterator()
        L140:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L15a
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "getAppList item: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r2.concat(r1)
            com.bytedance.msdk.j.up.cw.xt(r1)
            goto L140
        L15a:
            java.util.List r0 = r4.i()
            java.lang.String r1 = "getDevImeis："
            java.lang.String r2 = java.lang.String.valueOf(r0)
            java.lang.String r1 = r1.concat(r2)
            com.bytedance.msdk.j.up.cw.xt(r1)
            if (r0 == 0) goto L18b
            java.util.Iterator r0 = r0.iterator()
        L171:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18b
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "getDevImeis item: "
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r1 = r2.concat(r1)
            com.bytedance.msdk.j.up.cw.xt(r1)
            goto L171
        L18b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getDevOaid："
            r0.<init>(r1)
            java.lang.String r1 = r4.kt()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isCanUseOaid："
            r0.<init>(r1)
            boolean r1 = r4.mi()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isCanUseMacAddress："
            r0.<init>(r1)
            boolean r1 = r4.vl()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isProgrammaticRecommend："
            r0.<init>(r1)
            boolean r1 = r4.ws()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.String r0 = "---------  sdk 隐私设置 end ----"
            com.bytedance.msdk.j.up.cw.xt(r0)
            return
    }

    private boolean e() {
            r1 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r1.j
            if (r0 == 0) goto Lc
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    private void hh() {
            r0 = this;
            r0.hl()
            r0.b()
            r0.z()
            return
    }

    private void hl() {
            r2 = this;
            java.lang.String r0 = "---------  sdk 初始化信息 start ----"
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isDebug："
            r0.<init>(r1)
            boolean r1 = r2.p()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getClassName："
            r0.<init>(r1)
            java.lang.String r1 = r2.j()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getAppId："
            r0.<init>(r1)
            java.lang.String r1 = r2.xt()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getAppName："
            r0.<init>(r1)
            java.lang.String r1 = r2.cw()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getADNName："
            r0.<init>(r1)
            java.lang.String r1 = r2.r()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getAppKey："
            r0.<init>(r1)
            java.lang.String r1 = r2.up()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getInitCallback："
            r0.<init>(r1)
            java.util.function.Function r1 = r2.m()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getAgeGroup："
            r0.<init>(r1)
            int r1 = r2.ch()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isCustom："
            r0.<init>(r1)
            boolean r1 = r2.s()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getCustomInitMap："
            r0.<init>(r1)
            java.util.Map r1 = r2.a()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getCustomGMConfiguration："
            r0.<init>(r1)
            java.util.function.Function r1 = r2.l()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getGromoreVersion："
            r0.<init>(r1)
            java.lang.String r1 = r2.h()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getMap："
            r0.<init>(r1)
            java.util.Map r1 = r2.la()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.String r0 = "---------  sdk 初始化信息 end ----"
            com.bytedance.msdk.j.up.cw.xt(r0)
            return
    }

    static /* synthetic */ double j(com.bytedance.msdk.j.cw.cw r2) {
            double r0 = r2.q()
            return r0
    }

    public static com.bytedance.msdk.j.cw.cw j(android.util.SparseArray<java.lang.Object> r1) {
            com.bytedance.msdk.j.cw.cw r0 = new com.bytedance.msdk.j.cw.cw
            r0.<init>(r1)
            return r0
    }

    private double q() {
            r3 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r3.xt
            if (r0 == 0) goto L21
            r1 = 8312(0x2078, float:1.1648E-41)
            java.lang.Class r2 = z0.a.a()
            java.lang.Object r0 = r0.objectValue(r1, r2)
            java.util.function.Function r0 = z0.b.a(r0)
            if (r0 == 0) goto L21
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = com.bytedance.sdk.openadsdk.i.cw.xt(r0)
            if (r0 == 0) goto L21
            r1 = 8481(0x2121, float:1.1884E-41)
            double r0 = r0.doubleValue(r1)
            return r0
        L21:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            return r0
    }

    private double qb() {
            r3 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r3.xt
            if (r0 == 0) goto L21
            r1 = 8312(0x2078, float:1.1648E-41)
            java.lang.Class r2 = z0.a.a()
            java.lang.Object r0 = r0.objectValue(r1, r2)
            java.util.function.Function r0 = z0.b.a(r0)
            if (r0 == 0) goto L21
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = com.bytedance.sdk.openadsdk.i.cw.xt(r0)
            if (r0 == 0) goto L21
            r1 = 8482(0x2122, float:1.1886E-41)
            double r0 = r0.doubleValue(r1)
            return r0
        L21:
            r0 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            return r0
    }

    static /* synthetic */ double xt(com.bytedance.msdk.j.cw.cw r2) {
            double r0 = r2.qb()
            return r0
    }

    private void z() {
            r2 = this;
            java.lang.String r0 = "---------  sdk 聚合信息 start ----"
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getHttps："
            r0.<init>(r1)
            boolean r1 = r2.gq()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getWxAppId："
            r0.<init>(r1)
            java.lang.String r1 = r2.rn()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getPublisherDid："
            r0.<init>(r1)
            java.lang.String r1 = r2.wq()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isOpenAdnTest："
            r0.<init>(r1)
            boolean r1 = r2.uf()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getMediationConfigUserInfoForSegment："
            r0.<init>(r1)
            java.util.function.Function r1 = r2.ed()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getLocalExtra："
            r0.<init>(r1)
            java.util.Map r1 = r2.c()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getCustomLocalConfig："
            r0.<init>(r1)
            org.json.JSONObject r1 = r2.gx()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "getOpensdkVer："
            r0.<init>(r1)
            java.lang.String r1 = r2.n()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isWxInstalled："
            r0.<init>(r1)
            boolean r1 = r2.nd()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isSupportH265："
            r0.<init>(r1)
            boolean r1 = r2.rh()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "isSupportSplashZoomout："
            r0.<init>(r1)
            boolean r1 = r2.ol()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r0)
            java.lang.String r0 = "---------  sdk 聚合信息 end ----"
            com.bytedance.msdk.j.up.cw.xt(r0)
            return
    }

    public java.util.Map a() {
            r3 = this;
            boolean r0 = r3.e()
            if (r0 == 0) goto L13
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r3.j
            r1 = 8400(0x20d0, float:1.1771E-41)
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            java.lang.Object r0 = r0.objectValue(r1, r2)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        L13:
            r0 = 0
            return r0
    }

    public boolean ae() {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.up
            if (r0 == 0) goto L11
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = com.bytedance.sdk.openadsdk.i.cw.xt(r0)
            if (r0 == 0) goto L11
            r1 = 8027(0x1f5b, float:1.1248E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        L11:
            r0 = 0
            return r0
    }

    public java.lang.String av() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.xt
            if (r0 == 0) goto Lb
            r1 = 8484(0x2124, float:1.1889E-41)
            java.lang.String r0 = r0.stringValue(r1)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public com.bytedance.msdk.j.cw.r az() {
            r5 = this;
            double r0 = r5.q()
            r2 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            double r0 = r5.q()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L18
            com.bytedance.msdk.j.cw.cw$1 r0 = new com.bytedance.msdk.j.cw.cw$1
            r0.<init>(r5)
            return r0
        L18:
            r0 = 0
            return r0
    }

    public java.util.Map c() {
            r3 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r3.cw
            if (r0 == 0) goto Lf
            r1 = 8462(0x210e, float:1.1858E-41)
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            java.lang.Object r0 = r0.objectValue(r1, r2)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        Lf:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
    }

    public int ch() {
            r1 = this;
            com.bytedance.sdk.openadsdk.i.cw.cw.j r0 = r1.r
            int r0 = r0.jy()
            return r0
    }

    public java.lang.String cw() {
            r2 = this;
            boolean r0 = r2.e()
            if (r0 == 0) goto Lf
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.j
            r1 = 8
            java.lang.String r0 = r0.stringValue(r1)
            return r0
        Lf:
            java.lang.String r0 = ""
            return r0
    }

    public java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> ed() {
            r3 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r3.cw
            if (r0 == 0) goto L13
            r1 = 8310(0x2076, float:1.1645E-41)
            java.lang.Class r2 = z0.a.a()
            java.lang.Object r0 = r0.objectValue(r1, r2)
            java.util.function.Function r0 = z0.b.a(r0)
            return r0
        L13:
            r0 = 0
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> f() {
            r3 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r3.xt
            if (r0 == 0) goto Lf
            r1 = 8554(0x216a, float:1.1987E-41)
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            java.lang.Object r0 = r0.objectValue(r1, r2)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public boolean g() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.xt
            if (r0 == 0) goto Lb
            r1 = 8024(0x1f58, float:1.1244E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public boolean gq() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.cw
            if (r0 == 0) goto Lb
            r1 = 8458(0x210a, float:1.1852E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public org.json.JSONObject gx() {
            r3 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r3.cw
            if (r0 == 0) goto Lf
            r1 = 8463(0x210f, float:1.1859E-41)
            java.lang.Class<org.json.JSONObject> r2 = org.json.JSONObject.class
            java.lang.Object r0 = r0.objectValue(r1, r2)
            org.json.JSONObject r0 = (org.json.JSONObject) r0
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public java.lang.String h() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.j
            if (r0 == 0) goto Lb
            r1 = 8411(0x20db, float:1.1786E-41)
            java.lang.String r0 = r0.stringValue(r1)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public java.util.List<java.lang.String> i() {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.up
            if (r0 == 0) goto L15
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = com.bytedance.sdk.openadsdk.i.cw.xt(r0)
            if (r0 == 0) goto L15
            r1 = 8477(0x211d, float:1.1879E-41)
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.Object r0 = r0.objectValue(r1, r2)
            java.util.List r0 = (java.util.List) r0
            return r0
        L15:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            return r0
    }

    public java.lang.String j() {
            r2 = this;
            boolean r0 = r2.e()
            if (r0 == 0) goto Lf
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.j
            r1 = 8010(0x1f4a, float:1.1224E-41)
            java.lang.String r0 = r0.stringValue(r1)
            return r0
        Lf:
            java.lang.String r0 = ""
            return r0
    }

    public boolean jy() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.xt
            if (r0 == 0) goto Lb
            r1 = 8479(0x211f, float:1.1882E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public java.lang.String kt() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.xt
            if (r0 == 0) goto Lb
            r1 = 8486(0x2126, float:1.1891E-41)
            java.lang.String r0 = r0.stringValue(r1)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> l() {
            r3 = this;
            boolean r0 = r3.e()
            if (r0 == 0) goto L17
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r3.j
            r1 = 8401(0x20d1, float:1.1772E-41)
            java.lang.Class r2 = z0.a.a()
            java.lang.Object r0 = r0.objectValue(r1, r2)
            java.util.function.Function r0 = z0.b.a(r0)
            return r0
        L17:
            r0 = 0
            return r0
    }

    public java.util.Map la() {
            r3 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r3.j
            if (r0 == 0) goto Lf
            r1 = 8425(0x20e9, float:1.1806E-41)
            java.lang.Class<java.util.Map> r2 = java.util.Map.class
            java.lang.Object r0 = r0.objectValue(r1, r2)
            java.util.Map r0 = (java.util.Map) r0
            return r0
        Lf:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            return r0
    }

    public java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> m() {
            r3 = this;
            boolean r0 = r3.e()
            if (r0 == 0) goto L17
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r3.j
            r1 = 8300(0x206c, float:1.1631E-41)
            java.lang.Class r2 = z0.a.a()
            java.lang.Object r0 = r0.objectValue(r1, r2)
            java.util.function.Function r0 = z0.b.a(r0)
            return r0
        L17:
            r0 = 0
            return r0
    }

    public boolean mi() {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.up
            if (r0 == 0) goto L11
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = com.bytedance.sdk.openadsdk.i.cw.xt(r0)
            if (r0 == 0) goto L11
            r1 = 8478(0x211e, float:1.188E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        L11:
            r0 = 1
            return r0
    }

    public java.lang.String n() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.cw
            if (r0 == 0) goto Lb
            r1 = 8464(0x2110, float:1.186E-41)
            java.lang.String r0 = r0.stringValue(r1)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public boolean nd() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.cw
            if (r0 == 0) goto Lb
            r1 = 8465(0x2111, float:1.1862E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public boolean ol() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.cw
            if (r0 == 0) goto Lb
            r1 = 8467(0x2113, float:1.1865E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public boolean oq() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.xt
            if (r0 == 0) goto Lb
            r1 = 8025(0x1f59, float:1.1245E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public boolean p() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.j
            if (r0 == 0) goto La
            r1 = 1
            boolean r0 = r0.booleanValue(r1)
            return r0
        La:
            r0 = 0
            return r0
    }

    public boolean qv() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.xt
            if (r0 == 0) goto Lb
            r1 = 8026(0x1f5a, float:1.1247E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public java.lang.String r() {
            r2 = this;
            boolean r0 = r2.e()
            if (r0 == 0) goto Lf
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.j
            r1 = 8003(0x1f43, float:1.1215E-41)
            java.lang.String r0 = r0.stringValue(r1)
            return r0
        Lf:
            java.lang.String r0 = ""
            return r0
    }

    public boolean rh() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.cw
            if (r0 == 0) goto Lb
            r1 = 8466(0x2112, float:1.1863E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public java.lang.String rn() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.cw
            if (r0 == 0) goto Lb
            r1 = 8459(0x210b, float:1.1854E-41)
            java.lang.String r0 = r0.stringValue(r1)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public boolean s() {
            r2 = this;
            boolean r0 = r2.e()
            if (r0 == 0) goto Lf
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.j
            r1 = 8098(0x1fa2, float:1.1348E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public java.lang.String tj() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.xt
            if (r0 == 0) goto Lb
            r1 = 8487(0x2127, float:1.1893E-41)
            java.lang.String r0 = r0.stringValue(r1)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public boolean tl() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.xt
            if (r0 == 0) goto Lb
            r1 = 8023(0x1f57, float:1.1243E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public boolean uf() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.cw
            if (r0 == 0) goto Lb
            r1 = 8461(0x210d, float:1.1856E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public java.lang.String up() {
            r2 = this;
            boolean r0 = r2.e()
            if (r0 == 0) goto Lf
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.j
            r1 = 8005(0x1f45, float:1.1217E-41)
            java.lang.String r0 = r0.stringValue(r1)
            return r0
        Lf:
            java.lang.String r0 = ""
            return r0
    }

    public boolean v() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.xt
            if (r0 == 0) goto Lb
            r1 = 8480(0x2120, float:1.1883E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public boolean vl() {
            r1 = this;
            boolean r0 = r1.v()
            return r0
    }

    public java.lang.String w() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.xt
            if (r0 == 0) goto Lb
            r1 = 8485(0x2125, float:1.189E-41)
            java.lang.String r0 = r0.stringValue(r1)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public java.lang.String wq() {
            r2 = this;
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.cw
            if (r0 == 0) goto Lb
            r1 = 8460(0x210c, float:1.1855E-41)
            java.lang.String r0 = r0.stringValue(r1)
            return r0
        Lb:
            java.lang.String r0 = ""
            return r0
    }

    public boolean ws() {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.up
            if (r0 == 0) goto L11
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = com.bytedance.sdk.openadsdk.i.cw.xt(r0)
            if (r0 == 0) goto L11
            r1 = 8028(0x1f5c, float:1.125E-41)
            boolean r0 = r0.booleanValue(r1)
            return r0
        L11:
            r0 = 1
            return r0
    }

    public java.util.List<java.lang.String> x() {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.up
            if (r0 == 0) goto L15
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = com.bytedance.sdk.openadsdk.i.cw.xt(r0)
            if (r0 == 0) goto L15
            r1 = 8476(0x211c, float:1.1877E-41)
            java.lang.Class<java.util.List> r2 = java.util.List.class
            java.lang.Object r0 = r0.objectValue(r1, r2)
            java.util.List r0 = (java.util.List) r0
            return r0
        L15:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            return r0
    }

    public java.lang.String xt() {
            r2 = this;
            boolean r0 = r2.e()
            if (r0 == 0) goto Le
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r2.j
            r1 = 3
            java.lang.String r0 = r0.stringValue(r1)
            return r0
        Le:
            r0 = 0
            return r0
    }

    public void xt(android.util.SparseArray<java.lang.Object> r3) {
            r2 = this;
            com.bykv.j.j.j.j.e r3 = com.bykv.j.j.j.j.e.i(r3)
            com.bykv.vk.openvk.api.proto.PluginValueSet r3 = r3.k()
            r2.xt = r3
            if (r3 == 0) goto L1c
            r0 = 8311(0x2077, float:1.1646E-41)
            java.lang.Class r1 = z0.a.a()
            java.lang.Object r3 = r3.objectValue(r0, r1)
            java.util.function.Function r3 = z0.b.a(r3)
            r2.up = r3
        L1c:
            r2.b()
            return
    }
}

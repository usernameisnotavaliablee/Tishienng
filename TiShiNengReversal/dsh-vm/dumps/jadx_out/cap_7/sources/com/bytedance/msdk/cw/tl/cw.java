package com.bytedance.msdk.cw.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class cw {
    public cw() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.msdk.cw.j.j j(com.bytedance.msdk.cw.m.xt.xt r3, com.bytedance.msdk.api.j.xt r4, com.bytedance.msdk.cw.j.xt r5) {
            r0 = 0
            if (r3 == 0) goto L80
            if (r4 != 0) goto L7
            goto L80
        L7:
            java.lang.String r1 = j(r4, r3)
            r3.j(r1)
            java.lang.String r4 = r4.v()
            r3.xt(r4)
            boolean r4 = r3.oq()
            if (r4 != 0) goto L36
            boolean r4 = r3.qv()
            if (r4 == 0) goto L26
            com.bytedance.msdk.cw.j.j r3 = com.bytedance.msdk.cw.cw.xt.j.r.j(r3, r5)
            return r3
        L26:
            com.bytedance.msdk.core.oq.oq r3 = r3.tl()
            boolean r3 = com.bytedance.msdk.core.ae.cw.j(r3)
            if (r3 == 0) goto L80
            com.bytedance.msdk.cw.cw.xt.j.cw r3 = new com.bytedance.msdk.cw.cw.xt.j.cw
            r3.<init>(r5)
            return r3
        L36:
            android.content.Context r4 = com.bytedance.msdk.core.xt.getContext()
            java.lang.String r1 = r3.jy()
            com.bytedance.msdk.m.xt.j(r4, r1)
            java.lang.String r4 = r3.jy()
            com.bytedance.msdk.api.r.j.xt.m.j r4 = com.bytedance.msdk.m.xt.j.j(r4)
            if (r4 == 0) goto L80
            com.bytedance.msdk.ae.j.xt r4 = com.bytedance.msdk.ae.j.xt.j()
            java.lang.String r1 = r3.jy()
            com.bytedance.msdk.core.oq.j r4 = r4.j(r1)
            if (r4 == 0) goto L80
            com.bytedance.msdk.api.r.j.xt.cw.xt r1 = r4.cw()
            if (r1 == 0) goto L80
            com.bytedance.msdk.api.r.j.xt.cw.xt r4 = r4.cw()
            int r1 = r3.s()
            int r2 = r3.az()
            com.bytedance.msdk.api.r.j.xt.cw.j r4 = r4.j(r1, r2)
            if (r4 == 0) goto L80
            boolean r1 = j(r4)
            if (r1 == 0) goto L80
            java.lang.String r4 = r4.j()
            com.bytedance.msdk.cw.j.j r3 = com.bytedance.msdk.cw.cw.xt.j.r.j(r4, r3, r5)
            return r3
        L80:
            return r0
    }

    public static java.lang.String j(com.bytedance.msdk.api.j.xt r2, com.bytedance.msdk.cw.m.xt.xt r3) {
            r0 = 0
            if (r2 == 0) goto L43
            if (r3 != 0) goto L6
            goto L43
        L6:
            java.lang.String r1 = r2.j()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L14
            java.lang.String r0 = r2.j()
        L14:
            java.lang.String r2 = r3.vl()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "_"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = r3.vl()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
        L43:
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.Object> j(com.bytedance.msdk.cw.m.xt.xt r4, com.bytedance.msdk.api.j.xt r5, java.util.Map<java.lang.String, java.lang.Object> r6) {
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            if (r4 == 0) goto Ldf
            if (r5 != 0) goto Lb
            goto Ldf
        Lb:
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            java.lang.String r2 = r4.jy()
            com.bytedance.msdk.core.oq.j r1 = r1.j(r2)
            if (r1 == 0) goto L2b
            java.lang.String r2 = "tt_ad_network_config_appid"
            java.lang.String r3 = r1.j()
            r0.put(r2, r3)
            java.lang.String r2 = "tt_ad_network_config_appKey"
            java.lang.String r1 = r1.xt()
            r0.put(r2, r1)
        L2b:
            int r1 = r4.ws()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "tt_ad_origin_type"
            r0.put(r2, r1)
            int r4 = r4.az()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r1 = "tt_ad_sub_type"
            r0.put(r1, r4)
            java.util.Map r4 = r5.c()
            if (r4 == 0) goto L7d
            int r1 = r4.size()
            if (r1 <= 0) goto L7d
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L59:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L7d
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r1.getValue()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r1.getKey()
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L59
        L7d:
            int r4 = r5.ch()
            int r1 = r5.s()
            r2 = 0
            if (r4 >= 0) goto L89
            r4 = 0
        L89:
            if (r1 >= 0) goto L8c
            r1 = 0
        L8c:
            java.lang.String r2 = "ad_height"
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.put(r2, r1)
            java.lang.String r1 = "ad_width"
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r0.put(r1, r4)
            int r4 = r5.f()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.String r5 = "ad_type"
            r0.put(r5, r4)
            if (r6 == 0) goto Ldf
            int r4 = r6.size()
            if (r4 <= 0) goto Ldf
            java.util.Set r4 = r6.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Lbb:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ldf
            java.lang.Object r5 = r4.next()
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5
            java.lang.Object r6 = r5.getKey()
            if (r6 == 0) goto Lbb
            java.lang.Object r6 = r5.getValue()
            if (r6 == 0) goto Lbb
            java.lang.Object r6 = r5.getKey()
            java.lang.Object r5 = r5.getValue()
            r0.put(r6, r5)
            goto Lbb
        Ldf:
            return r0
    }

    public static void j(com.bytedance.msdk.xt.cw r5, com.bytedance.msdk.api.j.xt r6, com.bytedance.msdk.cw.m.xt.xt r7, com.bytedance.msdk.core.oq.g r8, java.lang.String r9) {
            if (r5 != 0) goto L4
            goto L169
        L4:
            if (r7 == 0) goto L169
            if (r6 != 0) goto La
            goto L169
        La:
            int r0 = r7.mi()
            if (r0 == 0) goto L18
            int r0 = r7.mi()
            r1 = 100
            if (r0 != r1) goto L29
        L18:
            double r0 = r7.l()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L29
            double r0 = r7.l()
            r5.j(r0)
        L29:
            boolean r0 = r7.v()
            if (r0 == 0) goto L7a
            double r0 = r7.p()
            r5.xt(r0)
            double r0 = r7.h()
            r5.cw(r0)
            com.bytedance.msdk.core.oq.tl r0 = r7.la()
            if (r0 == 0) goto L7a
            com.bytedance.msdk.core.oq.tl r0 = r7.la()
            java.lang.String r0 = r0.cw()
            r5.up(r0)
            com.bytedance.msdk.core.oq.tl r0 = r7.la()
            java.lang.String r0 = r0.r()
            r5.m(r0)
            com.bytedance.msdk.core.oq.tl r0 = r7.la()
            java.lang.String r0 = r0.tl()
            r5.cw(r0)
            com.bytedance.msdk.core.oq.tl r0 = r7.la()
            java.lang.String r0 = r0.g()
            r5.r(r0)
            com.bytedance.msdk.core.oq.tl r0 = r7.la()
            int r0 = r0.j()
            r5.r(r0)
        L7a:
            int r0 = r7.mi()
            r5.az(r0)
            int r0 = r7.kt()
            r5.i(r0)
            int r0 = r7.tj()
            r5.av(r0)
            java.lang.String r0 = ""
            if (r9 == 0) goto L94
            goto L95
        L94:
            r9 = r0
        L95:
            r5.w(r9)
            java.lang.String r9 = r7.jy()
            r5.av(r9)
            com.bytedance.msdk.core.oq.oq r9 = r7.tl()
            if (r9 == 0) goto Lad
            com.bytedance.msdk.core.oq.oq r9 = r7.tl()
            java.lang.String r0 = r9.av()
        Lad:
            r5.i(r0)
            java.lang.String r9 = r7.gq()
            r5.az(r9)
            long r0 = android.os.SystemClock.elapsedRealtime()
            r5.j(r0)
            java.lang.String r9 = r7.vl()
            r5.kt(r9)
            java.lang.String r9 = r7.xt()
            r5.mi(r9)
            java.lang.String r9 = r7.jy()
            int r9 = com.bytedance.msdk.xt.j.xt(r9)
            r5.jy(r9)
            int r9 = r7.ae()
            r5.ae(r9)
            int r9 = r7.m()
            r5.tl(r9)
            java.lang.String r9 = r6.j()
            r5.ae(r9)
            int r9 = r7.ae()
            r5.g(r9)
            int r9 = r7.m()
            r5.oq(r9)
            int r9 = r7.ws()
            r5.m(r9)
            int r9 = r7.az()
            r5.up(r9)
            int r9 = r6.f()
            r5.ws(r9)
            int r9 = r7.rn()
            r5.cw(r9)
            int r9 = r7.a()
            r5.j(r9)
            com.bytedance.msdk.core.oq.oq r9 = r7.tl()
            r0 = 0
            com.bytedance.msdk.tl.h.j(r5, r9, r6, r0)
            if (r8 == 0) goto L150
            int r9 = r8.xt
            r1 = 1
            if (r9 == r1) goto L12d
            goto L12e
        L12d:
            r0 = r9
        L12e:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            java.lang.String r0 = "if_test"
            r5.xt(r0, r9)
            java.lang.String r9 = "server_bidding_extra"
            java.lang.String r0 = r8.j
            r5.xt(r9, r0)
            java.lang.String r6 = r6.j()
            int r6 = r5.tl(r6)
            if (r6 == r1) goto L14b
            r9 = 2
            if (r6 != r9) goto L150
        L14b:
            boolean r6 = r8.up
            r5.cw(r6)
        L150:
            com.bytedance.msdk.core.oq.tl r6 = r7.la()
            if (r6 == 0) goto L169
            com.bytedance.msdk.core.oq.tl r6 = r7.la()
            if (r6 == 0) goto L169
            com.bytedance.msdk.core.oq.tl r6 = r7.la()
            java.lang.Object r6 = r6.xt()
            java.lang.String r7 = "extra_data_and_no_parse"
            r5.j(r7, r6)
        L169:
            return
    }

    public static boolean j(com.bytedance.msdk.api.r.j.xt.cw.j r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            com.bytedance.msdk.core.qv.j r1 = com.bytedance.msdk.core.qv.j.j()
            java.util.function.Function r1 = r1.ae()
            if (r1 == 0) goto L65
            java.lang.String r2 = r5.j()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r3 = "TMe"
            if (r2 != 0) goto L5f
            com.bykv.j.j.j.j.e r0 = com.bykv.j.j.j.j.e.a()
            r2 = 8010(0x1f4a, float:1.1224E-41)
            java.lang.String r4 = r5.j()
            r0.g(r2, r4)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r4 = "custom className is "
            r2.<init>(r4)
            java.lang.String r5 = r5.j()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.bytedance.msdk.j.up.cw.xt(r3, r5)
            r5 = -99999987(0xfffffffffa0a1f0d, float:-1.7929169E35)
            r2 = 8229(0x2025, float:1.1531E-41)
            r0.e(r5, r2)
            r5 = -99999985(0xfffffffffa0a1f0f, float:-1.7929173E35)
            java.lang.Class<java.lang.Boolean> r2 = java.lang.Boolean.class
            r0.f(r5, r2)
            com.bykv.vk.openvk.api.proto.PluginValueSet r5 = r0.k()
            android.util.SparseArray r5 = r5.sparseArray()
            java.lang.Object r5 = com.bytedance.msdk.core.ae.a.a(r1, r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            return r5
        L5f:
            java.lang.String r5 = "custom className is empty"
            com.bytedance.msdk.j.up.cw.xt(r3, r5)
            goto L6c
        L65:
            java.lang.String r5 = "TTMediationSDK"
            java.lang.String r1 = "load ad check custom name class loader is null "
            com.bytedance.msdk.j.up.cw.xt(r5, r1)
        L6c:
            return r0
    }
}

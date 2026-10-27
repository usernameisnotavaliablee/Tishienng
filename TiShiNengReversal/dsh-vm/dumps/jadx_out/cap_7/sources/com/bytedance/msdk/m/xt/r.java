package com.bytedance.msdk.m.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class r extends com.bytedance.sdk.openadsdk.core.wq.r implements com.bytedance.msdk.j.j.r {
    private long ae;
    private java.lang.String cw;
    private com.bytedance.msdk.m.xt.cw j;
    private com.bytedance.msdk.api.r.cw m;
    private java.util.List<com.bytedance.msdk.j.j.cw> r;
    private int tl;
    private java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> up;
    private java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> xt;

    public r() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.r = r0
            r0 = 0
            r2.ae = r0
            r0 = 0
            r2.tl = r0
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bykv.vk.openvk.api.proto.PluginValueSet r0 = r0.ol()
            com.bytedance.msdk.m.xt.cw r0 = com.bytedance.msdk.m.xt.cw.j(r0)
            r2.j = r0
            java.util.function.Function r0 = r0.j()
            r2.xt = r0
            return
    }

    private int g() {
            r1 = this;
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            com.bytedance.msdk.j.cw.cw r0 = r0.xt()
            if (r0 == 0) goto Lf
            int r0 = r0.ch()
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public static java.lang.String j(java.lang.String r2) {
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -1128782217: goto L68;
                case -902468465: goto L5d;
                case -759499589: goto L52;
                case 3432: goto L47;
                case 102199: goto L3c;
                case 92668925: goto L31;
                case 93498907: goto L26;
                case 111433589: goto L1b;
                case 1126045977: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L72
        Ld:
            java.lang.String r0 = "mintegral"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L17
            goto L72
        L17:
            r1 = 8
            goto L72
        L1b:
            java.lang.String r0 = "unity"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L24
            goto L72
        L24:
            r1 = 7
            goto L72
        L26:
            java.lang.String r0 = "baidu"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2f
            goto L72
        L2f:
            r1 = 6
            goto L72
        L31:
            java.lang.String r0 = "admob"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L3a
            goto L72
        L3a:
            r1 = 5
            goto L72
        L3c:
            java.lang.String r0 = "gdt"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L45
            goto L72
        L45:
            r1 = 4
            goto L72
        L47:
            java.lang.String r0 = "ks"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L50
            goto L72
        L50:
            r1 = 3
            goto L72
        L52:
            java.lang.String r0 = "xiaomi"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L5b
            goto L72
        L5b:
            r1 = 2
            goto L72
        L5d:
            java.lang.String r0 = "sigmob"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L66
            goto L72
        L66:
            r1 = 1
            goto L72
        L68:
            java.lang.String r0 = "klevin"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L71
            goto L72
        L71:
            r1 = 0
        L72:
            switch(r1) {
                case 0: goto L8f;
                case 1: goto L8c;
                case 2: goto L89;
                case 3: goto L86;
                case 4: goto L83;
                case 5: goto L80;
                case 6: goto L7d;
                case 7: goto L7a;
                case 8: goto L77;
                default: goto L75;
            }
        L75:
            r2 = 0
            return r2
        L77:
            java.lang.String r2 = "com.bytedance.msdk.adapter.mintegral.MintegralAdapterConfiguration"
            return r2
        L7a:
            java.lang.String r2 = "com.bytedance.msdk.adapter.unity.UnityAdapterConfiguration"
            return r2
        L7d:
            java.lang.String r2 = "com.bytedance.msdk.adapter.baidu.BaiduAdapterConfiguration"
            return r2
        L80:
            java.lang.String r2 = "com.bytedance.msdk.adapter.admob.AdmobAdapterConfiguration"
            return r2
        L83:
            java.lang.String r2 = "com.bytedance.msdk.adapter.gdt.GdtAdapterConfiguration"
            return r2
        L86:
            java.lang.String r2 = "com.bytedance.msdk.adapter.ks.KsAdapterConfiguration"
            return r2
        L89:
            java.lang.String r2 = "com.bytedance.msdk.adapter.xiaomi.XiaomiAdapterConfiguration"
            return r2
        L8c:
            java.lang.String r2 = "com.bytedance.msdk.adapter.sigmob.SigmobAdapterConfiguration"
            return r2
        L8f:
            java.lang.String r2 = "com.bytedance.msdk.adapter.klevin.KlevinAdapterConfiguration"
            return r2
    }

    private void j(com.bytedance.msdk.api.j r3) {
            r2 = this;
            java.util.List<com.bytedance.msdk.j.j.cw> r0 = r2.r
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.j.j.cw r1 = (com.bytedance.msdk.j.j.cw) r1
            r1.j(r3)
            goto L6
        L16:
            java.util.List<com.bytedance.msdk.j.j.cw> r3 = r2.r
            r3.clear()
            return
    }

    private void oq() {
            r3 = this;
            java.lang.String r0 = com.bytedance.sdk.gromore.init.j.cw()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r3.tl()
            r1.append(r2)
            java.lang.String r2 = "版本号："
            r1.append(r2)
            java.lang.String r2 = r3.xt()
            r1.append(r2)
            java.lang.String r2 = " , 聚合版本号："
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "TTMediationSDK_SDK_Init"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            return
    }

    private void qv() {
            r5 = this;
            java.lang.String r0 = com.bytedance.sdk.gromore.init.j.cw()
            java.lang.String r1 = r5.j()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "版本号："
            java.lang.String r3 = "TTMediationSDK_SDK_Init"
            if (r1 != 0) goto L50
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r5.tl()
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = r5.xt()
            r1.append(r2)
            java.lang.String r2 = " , "
            r1.append(r2)
            java.lang.String r2 = r5.tl()
            r1.append(r2)
            java.lang.String r2 = "Adapter版本号："
            r1.append(r2)
            java.lang.String r2 = r5.j()
            r1.append(r2)
            java.lang.String r2 = " , 聚合版本号："
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.bytedance.msdk.j.up.cw.xt(r3, r0)
            return
        L50:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r4 = r5.tl()
            r1.append(r4)
            r1.append(r2)
            java.lang.String r2 = r5.xt()
            r1.append(r2)
            java.lang.String r2 = " , ***"
            r1.append(r2)
            java.lang.String r2 = r5.tl()
            r1.append(r2)
            java.lang.String r2 = "Adapter未接入，请检查***, 聚合版本号："
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.bytedance.msdk.j.up.cw.r(r3, r0)
            return
    }

    private void vl() {
            r2 = this;
            java.util.List<com.bytedance.msdk.j.j.cw> r0 = r2.r
            java.util.Iterator r0 = r0.iterator()
        L6:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.j.j.cw r1 = (com.bytedance.msdk.j.j.cw) r1
            r1.j()
            goto L6
        L16:
            java.util.List<com.bytedance.msdk.j.j.cw> r0 = r2.r
            r0.clear()
            return
    }

    public static java.lang.String xt(java.lang.String r2) {
            r2.getClass()
            int r0 = r2.hashCode()
            r1 = -1
            switch(r0) {
                case -902468465: goto L5a;
                case -759499589: goto L4f;
                case 3432: goto L44;
                case 102199: goto L39;
                case 92668925: goto L2e;
                case 93498907: goto L23;
                case 111433589: goto L18;
                case 1126045977: goto Ld;
                default: goto Lb;
            }
        Lb:
            goto L64
        Ld:
            java.lang.String r0 = "mintegral"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L16
            goto L64
        L16:
            r1 = 7
            goto L64
        L18:
            java.lang.String r0 = "unity"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L21
            goto L64
        L21:
            r1 = 6
            goto L64
        L23:
            java.lang.String r0 = "baidu"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L2c
            goto L64
        L2c:
            r1 = 5
            goto L64
        L2e:
            java.lang.String r0 = "admob"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L37
            goto L64
        L37:
            r1 = 4
            goto L64
        L39:
            java.lang.String r0 = "gdt"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L42
            goto L64
        L42:
            r1 = 3
            goto L64
        L44:
            java.lang.String r0 = "ks"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L4d
            goto L64
        L4d:
            r1 = 2
            goto L64
        L4f:
            java.lang.String r0 = "xiaomi"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L58
            goto L64
        L58:
            r1 = 1
            goto L64
        L5a:
            java.lang.String r0 = "sigmob"
            boolean r2 = r2.equals(r0)
            if (r2 != 0) goto L63
            goto L64
        L63:
            r1 = 0
        L64:
            switch(r1) {
                case 0: goto L7e;
                case 1: goto L7b;
                case 2: goto L78;
                case 3: goto L75;
                case 4: goto L72;
                case 5: goto L6f;
                case 6: goto L6c;
                case 7: goto L69;
                default: goto L67;
            }
        L67:
            r2 = 0
            return r2
        L69:
            java.lang.String r2 = "a.b.c.d.e.f.mal.MalFunction"
            return r2
        L6c:
            java.lang.String r2 = "a.b.c.d.e.f.uty.UtyFunction"
            return r2
        L6f:
            java.lang.String r2 = "a.b.c.d.e.f.bdu.BduFunction"
            return r2
        L72:
            java.lang.String r2 = "a.b.c.d.e.f.aob.AobFunction"
            return r2
        L75:
            java.lang.String r2 = "a.b.c.d.e.f.gng.GngFunction"
            return r2
        L78:
            java.lang.String r2 = "a.b.c.d.e.f.kou.KouFunction"
            return r2
        L7b:
            java.lang.String r2 = "a.b.c.d.e.f.xmi.XmiFunction"
            return r2
        L7e:
            java.lang.String r2 = "a.b.c.d.e.f.sob.SobFunction"
            return r2
    }

    @Override // com.bytedance.msdk.j.j.r
    public void ae() {
            r2 = this;
            r0 = 0
            r2.tl = r0
            r0 = 0
            r2.ae = r0
            return
    }

    @Override // com.bytedance.sdk.openadsdk.core.wq.r
    public <T> T applyFunction(int r4, com.bykv.vk.openvk.api.proto.PluginValueSet r5, java.lang.Class<T> r6) {
            r3 = this;
            r6 = 8122(0x1fba, float:1.1381E-41)
            r0 = 0
            r1 = 8021(0x1f55, float:1.124E-41)
            if (r4 != r6) goto L1a
            java.lang.Class r4 = z0.a.a()
            java.lang.Object r4 = r5.objectValue(r1, r4)
            java.util.function.Function r4 = z0.b.a(r4)
            r3.up = r4
            r3.vl()
            goto La1
        L1a:
            r6 = 8123(0x1fbb, float:1.1383E-41)
            if (r4 != r6) goto L5f
            r4 = -99999979(0xfffffffffa0a1f15, float:-1.7929185E35)
            java.lang.Class<android.util.SparseArray> r6 = android.util.SparseArray.class
            java.lang.Object r4 = r5.objectValue(r4, r6)
            android.util.SparseArray r4 = (android.util.SparseArray) r4
            if (r4 != 0) goto L34
            r4 = -999902(0xfffffffffff0be22, float:NaN)
            java.lang.Object r4 = r5.objectValue(r4, r6)
            android.util.SparseArray r4 = (android.util.SparseArray) r4
        L34:
            if (r4 != 0) goto L3e
            r4 = 8022(0x1f56, float:1.1241E-41)
            java.lang.Object r4 = r5.objectValue(r4, r6)
            android.util.SparseArray r4 = (android.util.SparseArray) r4
        L3e:
            if (r4 == 0) goto La1
            com.bykv.j.j.j.j.e r4 = com.bykv.j.j.j.j.e.i(r4)
            com.bykv.vk.openvk.api.proto.PluginValueSet r4 = r4.k()
            r5 = -999900(0xfffffffffff0be24, float:NaN)
            int r5 = r4.intValue(r5)
            r6 = -999901(0xfffffffffff0be23, float:NaN)
            java.lang.String r4 = r4.stringValue(r6)
            com.bytedance.msdk.api.j r6 = new com.bytedance.msdk.api.j
            r6.<init>(r5, r4)
            r3.j(r6)
            return r0
        L5f:
            r6 = 8212(0x2014, float:1.1507E-41)
            if (r4 != r6) goto L73
            com.bytedance.msdk.api.r.cw r4 = r3.m
            if (r4 == 0) goto La1
            r4 = 8095(0x1f9f, float:1.1344E-41)
            int r4 = r5.intValue(r4)
            com.bytedance.msdk.api.r.cw r5 = r3.m
            r5.j(r4)
            goto La1
        L73:
            r6 = 8266(0x204a, float:1.1583E-41)
            if (r4 != r6) goto L86
            java.lang.Class r4 = z0.a.a()
            java.lang.Object r4 = r5.objectValue(r1, r4)
            java.util.function.Function r4 = z0.b.a(r4)
            r3.up = r4
            goto La1
        L86:
            r6 = 8270(0x204e, float:1.1589E-41)
            if (r4 != r6) goto La1
            r4 = 8557(0x216d, float:1.1991E-41)
            int r4 = r5.intValue(r4)
            r3.tl = r4
            r4 = 8555(0x216b, float:1.1988E-41)
            long r1 = r5.longValue(r4)
            r4 = 8556(0x216c, float:1.199E-41)
            long r4 = r5.longValue(r4)
            long r4 = r4 - r1
            r3.ae = r4
        La1:
            return r0
    }

    @Override // com.bytedance.msdk.j.j.r
    public java.lang.String cw() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // com.bytedance.msdk.j.j.r
    public int j(com.bytedance.msdk.api.r.cw r4) {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.up
            r1 = 0
            if (r0 == 0) goto L28
            r3.m = r4
            com.bytedance.sdk.openadsdk.i.r r4 = com.bytedance.sdk.openadsdk.i.r.j()
            r2 = 8126(0x1fbe, float:1.1387E-41)
            com.bytedance.sdk.openadsdk.i.r r4 = r4.j(r2)
            java.lang.Class<java.lang.Integer> r2 = java.lang.Integer.class
            com.bytedance.sdk.openadsdk.i.r r4 = r4.j(r2)
            android.util.SparseArray r4 = r4.xt()
            java.lang.Object r4 = com.bytedance.msdk.core.ae.a.a(r0, r4)
            if (r4 == 0) goto L28
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            return r4
        L28:
            return r1
    }

    @Override // com.bytedance.msdk.j.j.r
    public java.lang.String j() {
            r4 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r4.up
            java.lang.String r1 = ""
            if (r0 == 0) goto L25
            com.bytedance.sdk.openadsdk.i.r r2 = com.bytedance.sdk.openadsdk.i.r.j()
            r3 = 8101(0x1fa5, float:1.1352E-41)
            com.bytedance.sdk.openadsdk.i.r r2 = r2.j(r3)
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            com.bytedance.sdk.openadsdk.i.r r2 = r2.j(r3)
            android.util.SparseArray r2 = r2.xt()
            java.lang.Object r0 = com.bytedance.msdk.core.ae.a.a(r0, r2)
            boolean r2 = r0 instanceof java.lang.String
            if (r2 == 0) goto L25
            java.lang.String r0 = (java.lang.String) r0
            return r0
        L25:
            return r1
    }

    @Override // com.bytedance.msdk.j.j.r
    public java.lang.String j(android.content.Context r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.up
            r1 = 0
            if (r0 == 0) goto L32
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r2 = 8102(0x1fa6, float:1.1353E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r2)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r2)
            r2 = 8009(0x1f49, float:1.1223E-41)
            com.bytedance.sdk.openadsdk.i.r r4 = r0.j(r2, r4)
            r0 = 8006(0x1f46, float:1.1219E-41)
            com.bytedance.sdk.openadsdk.i.r r4 = r4.j(r0, r5)
            android.util.SparseArray r4 = r4.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r5 = r3.up
            java.lang.Object r4 = com.bytedance.msdk.core.ae.a.a(r5, r4)
            boolean r5 = r4 instanceof java.lang.String
            if (r5 == 0) goto L32
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L32:
            return r1
    }

    @Override // com.bytedance.msdk.j.j.xt
    public void j(@androidx.annotation.NonNull android.content.Context r4, @androidx.annotation.NonNull java.util.Map<java.lang.String, java.lang.Object> r5, @androidx.annotation.NonNull com.bytedance.msdk.j.j.cw r6) {
            r3 = this;
            java.util.List<com.bytedance.msdk.j.j.cw> r0 = r3.r
            boolean r0 = r0.contains(r6)
            if (r0 != 0) goto Ld
            java.util.List<com.bytedance.msdk.j.j.cw> r0 = r3.r
            r0.add(r6)
        Ld:
            com.bytedance.sdk.openadsdk.i.r r6 = com.bytedance.sdk.openadsdk.i.r.j()
            com.bytedance.msdk.m.xt.up.j(r6)
            java.lang.String r0 = "app_id"
            java.lang.Object r0 = r5.get(r0)
            r1 = 3
            r6.j(r1, r0)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.ch()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r1 = 8550(0x2166, float:1.1981E-41)
            r6.j(r1, r0)
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            java.lang.String r0 = r0.tj()
            r1 = 8
            r6.j(r1, r0)
            java.lang.String r0 = "app_key"
            java.lang.Object r0 = r5.get(r0)
            r1 = 8005(0x1f45, float:1.1217E-41)
            r6.j(r1, r0)
            java.lang.String r0 = "adn_name"
            java.lang.Object r1 = r5.get(r0)
            java.lang.String r1 = (java.lang.String) r1
            r3.cw = r1
            r2 = 8010(0x1f4a, float:1.1224E-41)
            java.lang.String r1 = j(r1)
            r6.j(r2, r1)
            java.lang.String r1 = r3.cw
            java.lang.String r1 = xt(r1)
            r2 = 8560(0x2170, float:1.1995E-41)
            r6.j(r2, r1)
            r1 = 8003(0x1f43, float:1.1215E-41)
            java.lang.Object r0 = r5.get(r0)
            r6.j(r1, r0)
            r0 = 8410(0x20da, float:1.1785E-41)
            java.lang.String r1 = "3.3.76.5.4"
            r6.j(r0, r1)
            r0 = 8411(0x20db, float:1.1786E-41)
            java.lang.String r1 = com.bytedance.msdk.xt.xt.cw()
            r6.j(r0, r1)
            r0 = 8412(0x20dc, float:1.1788E-41)
            java.lang.String r1 = "17.2.0.70"
            r6.j(r0, r1)
            r0 = 8413(0x20dd, float:1.1789E-41)
            java.lang.String r1 = "9.3905.5"
            r6.j(r0, r1)
            r0 = 8414(0x20de, float:1.179E-41)
            java.lang.String r1 = "4.640.1510.4"
            r6.j(r0, r1)
            r0 = 8415(0x20df, float:1.1792E-41)
            java.lang.String r1 = "2.11.0.3.31"
            r6.j(r0, r1)
            r0 = 8417(0x20e1, float:1.1795E-41)
            java.lang.String r2 = "4.22.2.4"
            r6.j(r0, r2)
            r0 = 8418(0x20e2, float:1.1796E-41)
            java.lang.String r2 = "4.3.0.37"
            r6.j(r0, r2)
            r0 = 8416(0x20e0, float:1.1793E-41)
            java.lang.String r2 = "16.6.57.13"
            r6.j(r0, r2)
            r0 = 8558(0x216e, float:1.1992E-41)
            r6.j(r0, r1)
            int r0 = r3.g()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r1 = 7
            r6.j(r1, r0)
            r0 = 8425(0x20e9, float:1.1806E-41)
            r6.j(r0, r5)
            r5 = 8300(0x206c, float:1.1631E-41)
            r6.j(r5, r3)
            java.lang.String r5 = r3.cw     // Catch: java.lang.Throwable -> Lfc
            java.util.function.Function r5 = com.bytedance.msdk.core.j.j.up.cw(r5)     // Catch: java.lang.Throwable -> Lfc
            java.lang.Class<java.lang.Void> r0 = java.lang.Void.class
            if (r5 == 0) goto Lfe
            r3.up = r5     // Catch: java.lang.Throwable -> Lfc
            com.bytedance.sdk.openadsdk.i.r r1 = com.bytedance.sdk.openadsdk.i.r.j()     // Catch: java.lang.Throwable -> Lfc
            r2 = 8240(0x2030, float:1.1547E-41)
            com.bytedance.sdk.openadsdk.i.r r1 = r1.j(r2)     // Catch: java.lang.Throwable -> Lfc
            com.bytedance.sdk.openadsdk.i.r r0 = r1.j(r0)     // Catch: java.lang.Throwable -> Lfc
            r1 = 8009(0x1f49, float:1.1223E-41)
            com.bytedance.sdk.openadsdk.i.r r4 = r0.j(r1, r4)     // Catch: java.lang.Throwable -> Lfc
            android.util.SparseArray r6 = r6.xt()     // Catch: java.lang.Throwable -> Lfc
            r0 = 8424(0x20e8, float:1.1805E-41)
            com.bytedance.sdk.openadsdk.i.r r4 = r4.j(r0, r6)     // Catch: java.lang.Throwable -> Lfc
            android.util.SparseArray r4 = r4.xt()     // Catch: java.lang.Throwable -> Lfc
            com.bytedance.msdk.core.ae.a.a(r5, r4)     // Catch: java.lang.Throwable -> Lfc
            return
        Lfc:
            r4 = move-exception
            goto L111
        Lfe:
            r4 = 8100(0x1fa4, float:1.135E-41)
            com.bytedance.sdk.openadsdk.i.r r4 = r6.j(r4)     // Catch: java.lang.Throwable -> Lfc
            r4.j(r0)     // Catch: java.lang.Throwable -> Lfc
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r4 = r3.xt     // Catch: java.lang.Throwable -> Lfc
            android.util.SparseArray r5 = r6.xt()     // Catch: java.lang.Throwable -> Lfc
            com.bytedance.msdk.core.ae.a.a(r4, r5)     // Catch: java.lang.Throwable -> Lfc
            return
        L111:
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }

    @Override // com.bytedance.msdk.j.j.r
    public void j(com.bytedance.msdk.api.r.ws r3, android.util.SparseArray<java.lang.Object> r4) {
            r2 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r2.up
            if (r0 == 0) goto L23
            if (r3 == 0) goto L23
            com.bytedance.sdk.openadsdk.i.r r3 = com.bytedance.sdk.openadsdk.i.r.j()
            r1 = 8124(0x1fbc, float:1.1384E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r1)
            java.lang.Class<java.lang.Void> r1 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r1)
            r1 = 8517(0x2145, float:1.1935E-41)
            com.bytedance.sdk.openadsdk.i.r r3 = r3.j(r1, r4)
            android.util.SparseArray r3 = r3.xt()
            com.bytedance.msdk.core.ae.a.a(r0, r3)
        L23:
            return
    }

    @Override // com.bytedance.msdk.j.j.r
    public void j(java.util.Map<java.lang.String, java.lang.Object> r4) {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.up
            if (r0 == 0) goto L21
            com.bytedance.sdk.openadsdk.i.r r1 = com.bytedance.sdk.openadsdk.i.r.j()
            r2 = 8242(0x2032, float:1.155E-41)
            com.bytedance.sdk.openadsdk.i.r r1 = r1.j(r2)
            java.lang.Class<java.lang.Void> r2 = java.lang.Void.class
            com.bytedance.sdk.openadsdk.i.r r1 = r1.j(r2)
            r2 = 8006(0x1f46, float:1.1219E-41)
            com.bytedance.sdk.openadsdk.i.r r4 = r1.j(r2, r4)
            android.util.SparseArray r4 = r4.xt()
            com.bytedance.msdk.core.ae.a.a(r0, r4)
        L21:
            return
    }

    @Override // com.bytedance.msdk.j.j.r
    public int m() {
            r1 = this;
            int r0 = r1.tl
            return r0
    }

    @Override // com.bytedance.msdk.j.j.r
    public void r() {
            r1 = this;
            java.lang.String r0 = r1.tl()     // Catch: java.lang.Exception -> Le
            java.util.function.Function r0 = com.bytedance.msdk.core.j.j.up.cw(r0)     // Catch: java.lang.Exception -> Le
            if (r0 == 0) goto L10
            r1.oq()     // Catch: java.lang.Exception -> Le
            return
        Le:
            r0 = move-exception
            goto L14
        L10:
            r1.qv()     // Catch: java.lang.Exception -> Le
            return
        L14:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return
    }

    public java.lang.String tl() {
            r1 = this;
            java.lang.String r0 = r1.cw
            return r0
    }

    @Override // com.bytedance.msdk.j.j.r
    public long up() {
            r2 = this;
            long r0 = r2.ae
            return r0
    }

    @Override // com.bytedance.msdk.j.j.r
    public java.lang.String xt() {
            r4 = this;
            java.lang.String r0 = ""
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r1 = r4.up     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L2b
            com.bytedance.sdk.openadsdk.i.r r2 = com.bytedance.sdk.openadsdk.i.r.j()     // Catch: java.lang.Throwable -> L25
            r3 = 8104(0x1fa8, float:1.1356E-41)
            com.bytedance.sdk.openadsdk.i.r r2 = r2.j(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            com.bytedance.sdk.openadsdk.i.r r2 = r2.j(r3)     // Catch: java.lang.Throwable -> L25
            android.util.SparseArray r2 = r2.xt()     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = com.bytedance.msdk.core.ae.a.a(r1, r2)     // Catch: java.lang.Throwable -> L25
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L25
            return r1
        L25:
            r1 = move-exception
            goto L28
        L27:
            return r0
        L28:
            com.bytedance.sdk.component.utils.vl.j(r1)
        L2b:
            return r0
    }

    @Override // com.bytedance.msdk.j.j.r
    public java.util.Map<java.lang.String, java.lang.Object> xt(android.content.Context r4, java.util.Map<java.lang.String, java.lang.Object> r5) {
            r3 = this;
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r0 = r3.up
            r1 = 0
            if (r0 == 0) goto L32
            com.bytedance.sdk.openadsdk.i.r r0 = com.bytedance.sdk.openadsdk.i.r.j()
            r2 = 8103(0x1fa7, float:1.1355E-41)
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r2)
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            com.bytedance.sdk.openadsdk.i.r r0 = r0.j(r2)
            r2 = 8009(0x1f49, float:1.1223E-41)
            com.bytedance.sdk.openadsdk.i.r r4 = r0.j(r2, r4)
            r0 = 8006(0x1f46, float:1.1219E-41)
            com.bytedance.sdk.openadsdk.i.r r4 = r4.j(r0, r5)
            android.util.SparseArray r4 = r4.xt()
            java.util.function.Function<android.util.SparseArray<java.lang.Object>, java.lang.Object> r5 = r3.up
            java.lang.Object r4 = com.bytedance.msdk.core.ae.a.a(r5, r4)
            boolean r5 = r4 instanceof java.util.Map
            if (r5 == 0) goto L32
            java.util.Map r4 = (java.util.Map) r4
            return r4
        L32:
            return r1
    }
}

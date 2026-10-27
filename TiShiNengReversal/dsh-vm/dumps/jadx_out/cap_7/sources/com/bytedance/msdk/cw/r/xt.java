package com.bytedance.msdk.cw.r;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public abstract class xt implements com.bytedance.msdk.cw.xt.j.j {
    protected com.bytedance.msdk.core.oq.xt ae;
    protected final java.util.Comparator<com.bytedance.msdk.core.oq.oq> az;
    protected com.bytedance.msdk.cw.m.j.xt cw;
    protected com.bytedance.msdk.j.xt.m g;
    private final java.util.Comparator<com.bytedance.msdk.core.oq.oq> j;
    protected com.bytedance.msdk.api.r.j.xt jy;
    protected com.bytedance.msdk.api.j.xt m;
    protected boolean oq;
    protected int qv;
    protected com.bytedance.msdk.xt.cw r;
    protected java.lang.ref.SoftReference<android.content.Context> tl;
    protected java.lang.String up;
    protected volatile boolean vl;
    protected com.bytedance.sdk.openadsdk.i.cw.j.xt ws;



    public xt(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.oq = r0
            r1.qv = r0
            r1.vl = r0
            com.bytedance.msdk.cw.r.xt$1 r0 = new com.bytedance.msdk.cw.r.xt$1
            r0.<init>(r1)
            r1.j = r0
            com.bytedance.msdk.cw.r.xt$2 r0 = new com.bytedance.msdk.cw.r.xt$2
            r0.<init>(r1)
            r1.az = r0
            java.lang.ref.SoftReference r0 = new java.lang.ref.SoftReference
            r0.<init>(r2)
            r1.tl = r0
            return
    }

    private com.bytedance.msdk.xt.cw cw(com.bytedance.msdk.xt.cw r11) {
            r10 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            com.bytedance.msdk.cw.m.j.xt r1 = r10.cw
            if (r1 == 0) goto L5e
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.oq()
            if (r1 == 0) goto L24
            com.bytedance.msdk.cw.m.j.xt r1 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.oq()
            int r1 = r1.size()
            if (r1 == 0) goto L24
            com.bytedance.msdk.cw.m.j.xt r1 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.oq()
            r0.addAll(r1)
        L24:
            com.bytedance.msdk.cw.m.j.xt r1 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.tl()
            if (r1 == 0) goto L41
            com.bytedance.msdk.cw.m.j.xt r1 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.tl()
            int r1 = r1.size()
            if (r1 == 0) goto L41
            com.bytedance.msdk.cw.m.j.xt r1 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.tl()
            r0.addAll(r1)
        L41:
            com.bytedance.msdk.cw.m.j.xt r1 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.ae()
            if (r1 == 0) goto L5e
            com.bytedance.msdk.cw.m.j.xt r1 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.ae()
            int r1 = r1.size()
            if (r1 == 0) goto L5e
            com.bytedance.msdk.cw.m.j.xt r1 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.ae()
            r0.addAll(r1)
        L5e:
            int r1 = r0.size()
            r2 = 0
            if (r1 == 0) goto L94
            if (r11 == 0) goto L94
            java.util.Iterator r0 = r0.iterator()
            r3 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
        L6d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L94
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            double r5 = r1.t()
            double r7 = r11.t()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 >= 0) goto L6d
            double r5 = r1.t()
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 <= 0) goto L6d
            double r2 = r1.t()
            r3 = r2
            r2 = r1
            goto L6d
        L94:
            return r2
    }

    private com.bytedance.msdk.xt.cw cw(java.util.List<com.bytedance.msdk.xt.cw> r8) {
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L39
            int r1 = r8.size()
            if (r1 == 0) goto L39
            int r1 = r8.size()
            r2 = 1
            if (r1 != r2) goto L18
            r0 = 0
            java.lang.Object r8 = r8.get(r0)
            com.bytedance.msdk.xt.cw r8 = (com.bytedance.msdk.xt.cw) r8
            return r8
        L18:
            java.util.Iterator r8 = r8.iterator()
            r1 = 4503599627370496(0x10000000000000, double:2.2250738585072014E-308)
        L1e:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L39
            java.lang.Object r3 = r8.next()
            com.bytedance.msdk.xt.cw r3 = (com.bytedance.msdk.xt.cw) r3
            double r4 = r3.t()
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L1e
            double r0 = r3.t()
            r1 = r0
            r0 = r3
            goto L1e
        L39:
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.Object> cw(java.lang.String r2) {
            com.bytedance.msdk.tl.tj r0 = new com.bytedance.msdk.tl.tj
            r0.<init>()
            java.lang.String r1 = "prime_rit"
            r0.put(r1, r2)
            return r0
    }

    private com.bytedance.msdk.xt.cw j(com.bytedance.msdk.core.oq.oq r6) {
            r5 = this;
            r0 = 0
            if (r6 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = r6.w()
            com.bytedance.msdk.core.oq.tl r2 = r6.l()
            if (r2 == 0) goto L17
            com.bytedance.msdk.core.oq.tl r6 = r6.l()
            java.lang.String r6 = r6.cw()
            goto L18
        L17:
            r6 = r0
        L18:
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L1f
            return r0
        L1f:
            com.bytedance.msdk.cw.m.j.xt r2 = r5.cw
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.ae()
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r2.next()
            com.bytedance.msdk.xt.cw r3 = (com.bytedance.msdk.xt.cw) r3
            if (r3 == 0) goto L29
            java.lang.String r4 = r3.qa()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L29
            return r3
        L42:
            com.bytedance.msdk.cw.m.j.xt r2 = r5.cw
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.tl()
            java.util.Iterator r2 = r2.iterator()
        L4c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L65
            java.lang.Object r3 = r2.next()
            com.bytedance.msdk.xt.cw r3 = (com.bytedance.msdk.xt.cw) r3
            if (r3 == 0) goto L4c
            java.lang.String r4 = r3.qa()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L4c
            return r3
        L65:
            com.bytedance.msdk.cw.m.j.xt r2 = r5.cw
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.oq()
            java.util.Iterator r2 = r2.iterator()
        L6f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lb3
            java.lang.Object r3 = r2.next()
            com.bytedance.msdk.xt.cw r3 = (com.bytedance.msdk.xt.cw) r3
            if (r3 == 0) goto L6f
            boolean r4 = r3.qo()
            if (r4 == 0) goto La8
            boolean r4 = android.text.TextUtils.isEmpty(r6)
            if (r4 != 0) goto La8
            java.lang.String r4 = r3.gx()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto La8
            java.lang.String r4 = r3.qa()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L6f
            java.lang.String r4 = r3.gx()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L6f
            goto Lb2
        La8:
            java.lang.String r4 = r3.qa()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L6f
        Lb2:
            return r3
        Lb3:
            return r0
    }

    private java.util.List<com.bytedance.msdk.core.oq.oq> r(java.util.List<com.bytedance.msdk.core.oq.oq> r9) {
            r8 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r2 = r9.iterator()
        Le:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Lc6
            java.lang.Object r3 = r2.next()
            com.bytedance.msdk.core.oq.oq r3 = (com.bytedance.msdk.core.oq.oq) r3
            boolean r4 = r3.gq()
            if (r4 == 0) goto L27
            r2.remove()
            r1.add(r3)
            goto Le
        L27:
            boolean r4 = r3.h()
            if (r4 != 0) goto L39
            boolean r4 = r3.rn()
            if (r4 != 0) goto L39
            boolean r4 = r3.la()
            if (r4 == 0) goto Le
        L39:
            r2.remove()
            com.bytedance.msdk.core.oq.oq r4 = new com.bytedance.msdk.core.oq.oq
            r4.<init>()
            java.lang.String r5 = r3.w()
            r4.up(r5)
            int r5 = r3.mi()
            r4.oq(r5)
            java.lang.String r5 = r3.az()
            r4.cw(r5)
            int r5 = r3.tl()
            r4.r(r5)
            java.lang.String r5 = r3.ae()
            r4.j(r5)
            int r5 = r3.x()
            r4.qv(r5)
            int r5 = r3.ch()
            r4.vl(r5)
            int r5 = r3.jy()
            r4.g(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            double r6 = r3.v()
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.m(r5)
            java.lang.String r5 = r3.ws()
            r4.xt(r5)
            java.lang.String r5 = r3.s()
            r4.ae(r5)
            java.lang.String r5 = r3.a()
            r4.tl(r5)
            com.bytedance.msdk.core.oq.tl r3 = r3.l()
            r4.j(r3)
            com.bytedance.msdk.xt.cw r3 = r8.j(r4)
            if (r3 == 0) goto Lc1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            double r6 = r3.uq()
            r5.append(r6)
            java.lang.String r3 = r5.toString()
            r4.m(r3)
        Lc1:
            r0.add(r4)
            goto Le
        Lc6:
            r9.addAll(r0)
            java.util.Comparator<com.bytedance.msdk.core.oq.oq> r0 = r8.az
            java.util.Collections.sort(r9, r0)
            java.util.Comparator<com.bytedance.msdk.core.oq.oq> r0 = r8.j
            java.util.Collections.sort(r1, r0)
            r0 = 0
            r9.addAll(r0, r1)
            return r9
    }

    @com.bytedance.component.sdk.annotation.DungeonFlag
    private void r(com.bytedance.msdk.xt.cw r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 7
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 0
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            if (r1 == 0) goto L18a
            com.bytedance.msdk.api.j.xt r8 = r0.m
            if (r8 != 0) goto L21
            goto L18a
        L21:
            java.lang.String r8 = r1.zz()
            java.lang.String r9 = "xiaomi"
            boolean r8 = android.text.TextUtils.equals(r8, r9)
            java.lang.String r9 = "ecpm"
            if (r8 == 0) goto L44
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            double r3 = r1.t()
            long r3 = (long) r3
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.put(r9, r3)
            r1.xt(r2)
            return
        L44:
            com.bytedance.msdk.api.j.xt r8 = r0.m
            boolean r8 = r8.ed()
            if (r8 != 0) goto L4e
            goto L18a
        L4e:
            boolean r8 = r1.yl()
            if (r8 != 0) goto L60
            boolean r8 = r1.oy()
            if (r8 != 0) goto L60
            boolean r8 = r1.qo()
            if (r8 == 0) goto L18a
        L60:
            java.lang.String r8 = r1.zz()
            java.lang.String r10 = "baidu"
            boolean r8 = android.text.TextUtils.equals(r8, r10)
            if (r8 == 0) goto L140
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            com.bytedance.msdk.core.ws.cw r10 = com.bytedance.msdk.core.xt.xt()
            boolean r10 = r10.k()
            java.lang.String r11 = "bid_t"
            r12 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r14 = "ad_time"
            java.lang.String r15 = "ad_t"
            r16 = 10
            java.lang.String r4 = "adn"
            if (r10 == 0) goto Lb5
            com.bytedance.msdk.xt.cw r2 = r19.cw(r20)
            if (r2 == 0) goto L92
            double r6 = r2.t()
            int r6 = (int) r6
        L92:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r6)
            r8.put(r9, r2)
            r8.put(r4, r5)
            r8.put(r15, r3)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 / r12
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.put(r14, r2)
            r2 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r8.put(r11, r2)
            goto L187
        Lb5:
            com.bytedance.msdk.core.ws.cw r10 = com.bytedance.msdk.core.xt.xt()
            boolean r10 = r10.ff()
            if (r10 == 0) goto L124
            com.bytedance.msdk.xt.cw r7 = r19.cw(r20)
            if (r7 == 0) goto Lca
            double r6 = r7.t()
            int r6 = (int) r6
        Lca:
            r17 = r12
            double r12 = r1.t()
            int r7 = (int) r12
            java.security.SecureRandom r10 = new java.security.SecureRandom
            r10.<init>()
            r12 = 21
            int r10 = r10.nextInt(r12)
            int r10 = r10 + 10
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "-------baidu_bid_win firstAdEcpm = "
            r12.<init>(r13)
            r12.append(r7)
            java.lang.String r13 = " secondAdEcpm ="
            r12.append(r13)
            r12.append(r6)
            java.lang.String r13 = " randomNumber = "
            r12.append(r13)
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            java.lang.String r13 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r13, r12)
            int r7 = r7 - r10
            int r6 = java.lang.Math.max(r7, r6)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r8.put(r9, r6)
            r8.put(r4, r5)
            r8.put(r15, r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 / r17
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r8.put(r14, r3)
            r8.put(r11, r2)
            goto L187
        L124:
            r17 = r12
            r8.put(r9, r7)
            r8.put(r4, r5)
            r8.put(r15, r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r3 = r3 / r17
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r8.put(r14, r3)
            r8.put(r11, r2)
            goto L187
        L140:
            java.lang.String r2 = r1.zz()
            java.lang.String r3 = "ks"
            boolean r2 = android.text.TextUtils.equals(r2, r3)
            if (r2 == 0) goto L186
            java.util.HashMap r8 = new java.util.HashMap
            r8.<init>()
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()
            boolean r2 = r2.ry()
            java.lang.String r3 = "lossBidEcpm"
            java.lang.String r4 = "bidEcpm"
            if (r2 == 0) goto L17f
            com.bytedance.msdk.xt.cw r2 = r19.cw(r20)
            double r5 = r1.t()
            java.lang.Double r5 = java.lang.Double.valueOf(r5)
            r8.put(r4, r5)
            if (r2 == 0) goto L175
            double r4 = r2.t()
            goto L177
        L175:
            r4 = 0
        L177:
            java.lang.Double r2 = java.lang.Double.valueOf(r4)
            r8.put(r3, r2)
            goto L187
        L17f:
            r8.put(r4, r7)
            r8.put(r3, r7)
            goto L187
        L186:
            r8 = 0
        L187:
            r1.xt(r8)
        L18a:
            return
    }

    public static int xt(java.lang.String r2) {
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()
            boolean r0 = r0.tl(r2)
            java.lang.String r1 = "TTMediationSDK"
            if (r0 != 0) goto L15
            java.lang.String r2 = "--==--: 命中展示频次"
            com.bytedance.msdk.j.up.cw.j(r1, r2)
            r2 = 840041(0xcd169, float:1.177148E-39)
            return r2
        L15:
            com.bytedance.msdk.core.tl.jy r0 = com.bytedance.msdk.core.tl.jy.j()
            boolean r2 = r0.cw(r2)
            if (r2 != 0) goto L28
            java.lang.String r2 = "--==--: 命中展示间隔"
            com.bytedance.msdk.j.up.cw.j(r1, r2)
            r2 = 840042(0xcd16a, float:1.17715E-39)
            return r2
        L28:
            r2 = 0
            return r2
    }

    @Override // com.bytedance.msdk.cw.xt.j.j
    public void ae() {
            r0 = this;
            return
    }

    public com.bytedance.msdk.api.cw av() {
            r3 = this;
            com.bytedance.msdk.api.j.xt r0 = r3.m
            r1 = 0
            if (r0 == 0) goto L16
            boolean r0 = r0.sm()
            if (r0 != 0) goto L16
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.x()
            if (r0 != 0) goto L16
            return r1
        L16:
            com.bytedance.msdk.cw.m.j.xt r0 = r3.cw
            java.util.List r0 = r0.kt()
            if (r0 == 0) goto L33
            int r2 = r0.size()
            if (r2 != 0) goto L25
            goto L33
        L25:
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            com.bytedance.msdk.xt.cw r0 = (com.bytedance.msdk.xt.cw) r0
            com.bytedance.msdk.api.j.xt r2 = r3.m
            com.bytedance.msdk.api.cw r0 = com.bytedance.msdk.tl.ws.j(r2, r0, r1)
            return r0
        L33:
            return r1
    }

    public com.bytedance.msdk.api.cw az() {
            r3 = this;
            com.bytedance.msdk.xt.cw r0 = r3.r
            if (r0 == 0) goto L15
            boolean r0 = com.bytedance.msdk.tl.i.j()
            if (r0 == 0) goto Lb
            goto L15
        Lb:
            com.bytedance.msdk.api.j.xt r0 = r3.m
            com.bytedance.msdk.xt.cw r1 = r3.r
            r2 = 1
            com.bytedance.msdk.api.cw r0 = com.bytedance.msdk.tl.ws.j(r0, r1, r2)
            return r0
        L15:
            r0 = 0
            return r0
    }

    protected com.bytedance.msdk.cw.cw.j.ae g() {
            r4 = this;
            java.lang.String r0 = "TTMediationSDK"
            java.lang.String r1 = "ad load start....."
            com.bytedance.msdk.j.up.cw.xt(r0, r1)
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.la()
            if (r0 == 0) goto L20
            com.bytedance.msdk.cw.m.j.xt r0 = r4.cw
            com.bytedance.msdk.api.j.xt r0 = r0.mi()
            java.lang.String r1 = com.bytedance.msdk.tl.mi.j()
            r2 = 3
            r3 = 0
            com.bytedance.msdk.up.m.j(r3, r0, r1, r2)
        L20:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.msdk.cw.cw.j.qv r1 = new com.bytedance.msdk.cw.cw.j.qv
            r1.<init>()
            r0.add(r1)
            com.bytedance.msdk.cw.cw.j.vl r1 = new com.bytedance.msdk.cw.cw.j.vl
            r1.<init>()
            r0.add(r1)
            com.bytedance.msdk.cw.cw.j.up r1 = new com.bytedance.msdk.cw.cw.j.up
            r1.<init>()
            r0.add(r1)
            com.bytedance.msdk.cw.cw.j.cw r1 = new com.bytedance.msdk.cw.cw.j.cw
            r1.<init>()
            r0.add(r1)
            com.bytedance.msdk.cw.cw.j.jy r1 = new com.bytedance.msdk.cw.cw.j.jy
            r1.<init>()
            r0.add(r1)
            com.bytedance.msdk.cw.cw.j.m r1 = new com.bytedance.msdk.cw.cw.j.m
            r1.<init>()
            r0.add(r1)
            com.bytedance.msdk.cw.cw.j.tl r1 = new com.bytedance.msdk.cw.cw.j.tl
            r1.<init>()
            r0.add(r1)
            com.bytedance.msdk.cw.cw.j.xt r1 = new com.bytedance.msdk.cw.cw.j.xt
            r1.<init>()
            r0.add(r1)
            com.bytedance.msdk.cw.cw.j.r r1 = new com.bytedance.msdk.cw.cw.j.r
            r1.<init>()
            r0.add(r1)
            com.bytedance.msdk.cw.cw.j.ae r1 = new com.bytedance.msdk.cw.cw.j.ae
            r1.<init>(r0)
            com.bytedance.msdk.cw.m.j.xt r0 = r4.cw
            r1.j(r0)
            return r1
    }

    public int i() {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L9
            int r0 = r0.rr()
            return r0
        L9:
            r0 = -1
            return r0
    }

    public void j() {
            r1 = this;
            com.bytedance.msdk.xt.cw r0 = r1.r
            if (r0 == 0) goto L7
            r0.w()
        L7:
            com.bytedance.msdk.cw.m.j.xt r0 = r1.cw
            r0.ed()
            r0 = 0
            r1.g = r0
            return
    }

    protected void j(com.bytedance.msdk.api.j.xt r3) {
            r2 = this;
            java.lang.ref.SoftReference<android.content.Context> r0 = r2.tl
            com.bytedance.msdk.cw.m.j.xt r0 = com.bytedance.msdk.cw.m.j.xt.j(r0, r3, r2)
            r2.cw = r0
            com.bytedance.msdk.api.j.xt r0 = r0.mi()
            r2.m = r0
            java.lang.String r0 = r0.v()
            r2.up = r0
            com.bytedance.msdk.cw.m.j.xt r0 = r2.cw
            java.util.Map r0 = r0.p()
            boolean r3 = r3.w()
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r1 = "allow_show_close_btn"
            r0.put(r1, r3)
            com.bytedance.msdk.cw.m.j.xt r3 = r2.cw
            com.bytedance.msdk.core.oq.xt r3 = r3.vl()
            r2.ae = r3
            return
    }

    public void j(com.bytedance.msdk.api.r.j.xt r1) {
            r0 = this;
            r0.jy = r1
            return
    }

    public void j(com.bytedance.msdk.xt.cw r4) {
            r3 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.la()
            if (r0 != 0) goto Lb
            return
        Lb:
            com.bytedance.msdk.api.j.xt r0 = r3.m
            java.lang.String r1 = com.bytedance.msdk.tl.mi.j()
            r2 = 2
            com.bytedance.msdk.up.m.j(r4, r0, r1, r2)
            return
    }

    @com.bytedance.component.sdk.annotation.DungeonFlag
    protected void j(com.bytedance.msdk.xt.cw r21, com.bytedance.msdk.xt.cw r22, int r23) {
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = 4
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 203(0xcb, float:2.84E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 7
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 10
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 0
            java.lang.Integer r8 = java.lang.Integer.valueOf(r7)
            r9 = 2
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            if (r1 == 0) goto L19d
            com.bytedance.msdk.api.j.xt r10 = r0.m
            if (r10 == 0) goto L19d
            if (r23 > 0) goto L33
            goto L19d
        L33:
            java.lang.String r10 = r1.zz()
            java.lang.String r11 = "xiaomi"
            boolean r10 = android.text.TextUtils.equals(r10, r11)
            java.lang.String r11 = "reason"
            java.lang.String r12 = "ecpm"
            if (r10 == 0) goto L67
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            if (r21 == 0) goto L50
            double r3 = r21.t()
            long r3 = (long) r3
            goto L52
        L50:
            r3 = 0
        L52:
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r2.put(r12, r3)
            java.lang.String r3 = "其他"
            r2.put(r11, r3)
            java.lang.String r3 = "adn_id"
            r2.put(r3, r6)
            r1.j(r2)
            return
        L67:
            com.bytedance.msdk.api.j.xt r10 = r0.m
            boolean r10 = r10.ed()
            if (r10 != 0) goto L71
            goto L19d
        L71:
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            java.lang.String r13 = "bidding_lose_reason"
            java.lang.Object r14 = com.bytedance.sdk.openadsdk.core.wq.j.xt.j(r23)
            r10.put(r13, r14)
            java.lang.String r13 = "bidding_lose_reason_NUM"
            java.lang.Integer r14 = java.lang.Integer.valueOf(r23)
            r10.put(r13, r14)
            java.lang.String r13 = r1.zz()
            java.lang.String r14 = "baidu"
            boolean r13 = android.text.TextUtils.equals(r13, r14)
            if (r13 == 0) goto L151
            com.bytedance.msdk.core.ws.cw r13 = com.bytedance.msdk.core.xt.xt()
            boolean r13 = r13.k()
            java.lang.String r14 = "is_c"
            java.lang.String r15 = "is_s"
            java.lang.String r7 = "bid_t"
            r17 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r0 = "ad_time"
            r23 = r13
            java.lang.String r13 = "ad_t"
            java.lang.String r1 = "adn"
            if (r23 == 0) goto Led
            r19 = r9
            if (r21 == 0) goto Lba
            double r8 = r21.t()
            int r2 = (int) r8
            r16 = r2
            goto Lbc
        Lba:
            r16 = 0
        Lbc:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r16)
            r10.put(r12, r2)
            r10.put(r1, r5)
            r10.put(r13, r4)
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 / r17
            java.lang.Long r1 = java.lang.Long.valueOf(r1)
            r10.put(r0, r1)
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r10.put(r7, r0)
            r10.put(r11, r3)
            r10.put(r15, r6)
            r9 = r19
            r10.put(r14, r9)
        Le9:
            r1 = r22
            goto L19a
        Led:
            com.bytedance.msdk.core.ws.cw r19 = com.bytedance.msdk.core.xt.xt()
            boolean r19 = r19.ff()
            if (r19 == 0) goto L12e
            r19 = r9
            if (r21 == 0) goto L103
            double r8 = r21.t()
            int r8 = (int) r8
            r16 = r8
            goto L105
        L103:
            r16 = 0
        L105:
            java.lang.Integer r8 = java.lang.Integer.valueOf(r16)
            r10.put(r12, r8)
            r10.put(r1, r5)
            r10.put(r13, r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 / r17
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r10.put(r0, r1)
            r10.put(r7, r2)
            r10.put(r11, r3)
            r10.put(r15, r6)
            r9 = r19
            r10.put(r14, r9)
            goto Le9
        L12e:
            r10.put(r12, r8)
            r10.put(r1, r5)
            r10.put(r13, r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 / r17
            java.lang.Long r1 = java.lang.Long.valueOf(r4)
            r10.put(r0, r1)
            r10.put(r7, r2)
            r10.put(r11, r3)
            r10.put(r15, r6)
            r10.put(r14, r9)
            goto Le9
        L151:
            java.lang.String r0 = r22.zz()
            java.lang.String r1 = "ks"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto Le9
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.ry()
            java.lang.String r1 = "other"
            java.lang.String r2 = "adnName"
            java.lang.String r3 = "adType"
            java.lang.String r4 = "bidEcpm"
            java.lang.String r5 = "failureCode"
            if (r0 == 0) goto L18c
            r10.put(r5, r9)
            if (r21 == 0) goto L17b
            double r5 = r21.t()
            goto L17d
        L17b:
            r5 = 0
        L17d:
            java.lang.Double r0 = java.lang.Double.valueOf(r5)
            r10.put(r4, r0)
            r10.put(r3, r9)
            r10.put(r2, r1)
            goto Le9
        L18c:
            r10.put(r5, r8)
            r10.put(r4, r8)
            r10.put(r3, r9)
            r10.put(r2, r1)
            goto Le9
        L19a:
            r1.j(r10)
        L19d:
            return
    }

    public void j(com.bytedance.sdk.openadsdk.i.cw.j.xt r1) {
            r0 = this;
            r0.ws = r1
            return
    }

    @Override // com.bytedance.msdk.cw.xt.j.j
    public void j(@androidx.annotation.Nullable java.lang.String r1) {
            r0 = this;
            return
    }

    @com.bytedance.component.sdk.annotation.DungeonFlag
    public void j(java.util.List<com.bytedance.msdk.xt.cw> r6) {
            r5 = this;
            if (r6 == 0) goto L7e
            int r0 = r6.size()
            if (r0 != 0) goto La
            goto L7e
        La:
            com.bytedance.msdk.api.j.xt r0 = r5.m
            com.bytedance.msdk.core.oq.xt r1 = r5.ae
            com.bytedance.msdk.cw.m.j.xt r2 = r5.cw
            java.util.concurrent.CopyOnWriteArrayList r2 = r2.oq()
            com.bytedance.msdk.core.r.j.j(r0, r1, r6, r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r0.addAll(r6)
            java.util.Iterator r0 = r0.iterator()
        L23:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            r5.r(r1)
            goto L23
        L33:
            com.bytedance.msdk.cw.m.j.xt r0 = r5.cw
            java.util.concurrent.CopyOnWriteArrayList r0 = r0.oq()
            int r0 = r0.size()
            if (r0 != 0) goto L40
            goto L7e
        L40:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.msdk.cw.m.j.xt r1 = r5.cw
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.oq()
            r0.addAll(r1)
            com.bytedance.msdk.xt.cw r1 = r5.cw(r6)
            java.util.Iterator r0 = r0.iterator()
        L56:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r0.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            java.util.Iterator r3 = r6.iterator()
        L66:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L79
            java.lang.Object r4 = r3.next()
            com.bytedance.msdk.xt.cw r4 = (com.bytedance.msdk.xt.cw) r4
            if (r4 == 0) goto L66
            if (r2 == 0) goto L66
            if (r4 != r2) goto L66
            goto L56
        L79:
            r3 = 1
            r5.j(r1, r2, r3)
            goto L56
        L7e:
            return
    }

    @Override // com.bytedance.msdk.cw.xt.j.j
    public void j(@androidx.annotation.Nullable java.util.List<com.bytedance.msdk.xt.cw> r1, @androidx.annotation.Nullable com.bytedance.msdk.api.j r2) {
            r0 = this;
            return
    }

    protected boolean jy() {
            r4 = this;
            android.content.Context r0 = com.bytedance.msdk.core.xt.getContext()
            boolean r0 = com.bytedance.msdk.tl.x.cw(r0)
            android.content.Context r1 = com.bytedance.msdk.core.xt.getContext()
            boolean r1 = com.bytedance.msdk.tl.x.xt(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r4.up
            java.lang.String r3 = com.bytedance.msdk.j.up.up.j(r3)
            r2.append(r3)
            java.lang.String r3 = "setting 下发是否为弱网执行："
            r2.append(r3)
            com.bytedance.msdk.core.ws.cw r3 = com.bytedance.msdk.core.xt.xt()
            boolean r3 = r3.vl()
            r2.append(r3)
            java.lang.String r3 = "，当前网络环境：2G-type="
            r2.append(r3)
            r2.append(r0)
            java.lang.String r3 = ",3G-type="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r3, r2)
            com.bytedance.msdk.core.ws.cw r2 = com.bytedance.msdk.core.xt.xt()
            boolean r2 = r2.vl()
            if (r2 == 0) goto L57
            if (r0 != 0) goto L55
            if (r1 == 0) goto L57
        L55:
            r0 = 1
            return r0
        L57:
            r0 = 0
            return r0
    }

    public com.bytedance.msdk.api.j.xt kt() {
            r1 = this;
            com.bytedance.msdk.api.j.xt r0 = r1.m
            return r0
    }

    public int mi() {
            r1 = this;
            com.bytedance.msdk.api.j.xt r0 = r1.m
            if (r0 == 0) goto L9
            int r0 = r0.up()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public java.util.List<com.bytedance.msdk.api.xt> oq() {
            r1 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r1.cw
            java.util.List r0 = r0.ch()
            return r0
    }

    public java.util.List<com.bytedance.msdk.api.cw> qv() {
            r5 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.x()
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.msdk.cw.m.j.xt r1 = r5.cw
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.oq()
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            if (r2 == 0) goto L1b
            com.bytedance.msdk.api.j.xt r3 = r5.m
            r4 = 0
            com.bytedance.msdk.api.cw r2 = com.bytedance.msdk.tl.ws.j(r3, r2, r4)
            r0.add(r2)
            goto L1b
        L34:
            return r0
    }

    @Override // com.bytedance.msdk.cw.xt.j.j
    public void tl() {
            r0 = this;
            return
    }

    public java.util.List<com.bytedance.msdk.api.cw> vl() {
            r5 = this;
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.x()
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.msdk.cw.m.j.xt r1 = r5.cw
            java.util.List r1 = r1.kt()
            java.util.Iterator r1 = r1.iterator()
        L1b:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r1.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            if (r2 == 0) goto L1b
            com.bytedance.msdk.api.j.xt r3 = r5.m
            r4 = 0
            com.bytedance.msdk.api.cw r2 = com.bytedance.msdk.tl.ws.j(r3, r2, r4)
            r0.add(r2)
            goto L1b
        L34:
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> w() {
            r4 = this;
            com.bytedance.msdk.xt.cw r0 = r4.r
            if (r0 == 0) goto L9
            java.util.Map r0 = r0.p()
            goto La
        L9:
            r0 = 0
        La:
            if (r0 != 0) goto L12
            java.lang.String r0 = r4.up
            java.util.Map r0 = cw(r0)
        L12:
            com.bytedance.msdk.xt.cw r1 = r4.r
            if (r1 == 0) goto L25
            java.util.Map r1 = r1.b()
            if (r1 == 0) goto L25
            com.bytedance.msdk.xt.cw r1 = r4.r
            java.util.Map r1 = r1.b()
            r0.putAll(r1)
        L25:
            boolean r1 = com.bytedance.msdk.tl.i.j()
            if (r1 == 0) goto L43
            com.bytedance.msdk.api.j.xt r1 = r4.m
            com.bytedance.msdk.xt.cw r2 = r4.r
            r3 = 1
            com.bytedance.msdk.api.cw r1 = com.bytedance.msdk.tl.ws.j(r1, r2, r3)
            java.lang.String r1 = com.bytedance.msdk.tl.i.j(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L43
            java.lang.String r2 = "get_show_ecpm_info"
            r0.put(r2, r1)
        L43:
            return r0
    }

    protected java.util.List<com.bytedance.msdk.core.oq.oq> ws() {
            r5 = this;
            com.bytedance.msdk.core.oq.xt r0 = r5.ae
            if (r0 == 0) goto L41
            java.util.List r0 = r0.ol()
            if (r0 == 0) goto L41
            com.bytedance.msdk.core.oq.xt r0 = r5.ae
            java.util.List r0 = r0.ol()
            int r0 = r0.size()
            if (r0 != 0) goto L17
            goto L41
        L17:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.msdk.core.oq.xt r1 = r5.ae
            java.util.List r1 = r1.ol()
            java.util.Iterator r1 = r1.iterator()
        L26:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L40
            java.lang.Object r2 = r1.next()
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            if (r2 == 0) goto L26
            int r3 = r2.mi()
            r4 = 100
            if (r3 != r4) goto L26
            r0.add(r2)
            goto L26
        L40:
            return r0
        L41:
            r0 = 0
            return r0
    }

    public java.util.HashMap<java.lang.String, com.bytedance.msdk.xt.cw> xt(java.util.List<com.bytedance.msdk.xt.cw> r4) {
            r3 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r4 == 0) goto L27
            int r1 = r4.size()
            if (r1 <= 0) goto L27
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r4.next()
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            if (r1 == 0) goto L11
            java.lang.String r2 = r1.qa()
            r0.put(r2, r1)
            goto L11
        L27:
            return r0
    }

    public java.util.List<com.bytedance.msdk.core.oq.oq> xt() {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.bytedance.msdk.cw.m.j.xt r1 = r10.cw
            if (r1 == 0) goto L102
            com.bytedance.msdk.core.oq.xt r2 = r10.ae
            if (r2 == 0) goto L102
            boolean r1 = r1.m()
            if (r1 == 0) goto L15
            goto L102
        L15:
            com.bytedance.msdk.core.oq.xt r1 = r10.ae
            java.util.Map r1 = r1.ch()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Set r3 = r1.keySet()
            java.util.Iterator r3 = r3.iterator()
        L28:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3a
            java.lang.Object r4 = r3.next()
            java.lang.Integer r4 = (java.lang.Integer) r4
            if (r4 == 0) goto L28
            r2.add(r4)
            goto L28
        L3a:
            com.bytedance.msdk.core.ae.xt.j(r2)
            int r3 = r2.size()
            r4 = 0
            if (r3 <= 0) goto L75
            r3 = 0
            r5 = 0
        L46:
            int r6 = r2.size()
            if (r4 >= r6) goto L73
            java.lang.Object r6 = r2.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L70
            int r7 = r6.intValue()
            r8 = -100
            r9 = 1
            if (r7 != r8) goto L5e
            r3 = 1
        L5e:
            if (r7 >= r8) goto L61
            r5 = 1
        L61:
            java.lang.Object r7 = r1.get(r6)
            if (r7 == 0) goto L70
            java.lang.Object r6 = r1.get(r6)
            java.util.Collection r6 = (java.util.Collection) r6
            r0.addAll(r6)
        L70:
            int r4 = r4 + 1
            goto L46
        L73:
            r4 = r3
            goto L76
        L75:
            r5 = 0
        L76:
            if (r4 != 0) goto Lc2
            com.bytedance.msdk.core.oq.xt r1 = r10.ae
            boolean r1 = r1.h()
            if (r1 == 0) goto Lc2
            com.bytedance.msdk.cw.m.j.xt r1 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.oq()
            boolean r1 = com.bytedance.msdk.tl.p.xt(r1)
            if (r1 != 0) goto Lc2
            com.bytedance.msdk.cw.m.j.xt r1 = r10.cw
            java.util.concurrent.CopyOnWriteArrayList r1 = r1.oq()
            java.util.Iterator r1 = r1.iterator()
        L96:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lc2
            java.lang.Object r2 = r1.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            com.bytedance.msdk.core.oq.xt r3 = r10.ae
            if (r3 == 0) goto L96
            boolean r3 = r2.yl()
            if (r3 != 0) goto Lb2
            boolean r3 = r2.oy()
            if (r3 == 0) goto L96
        Lb2:
            com.bytedance.msdk.core.oq.xt r3 = r10.ae
            java.lang.String r2 = r2.qa()
            com.bytedance.msdk.core.oq.oq r2 = r3.m(r2)
            if (r2 == 0) goto L96
            r0.add(r2)
            goto L96
        Lc2:
            if (r5 != 0) goto Ld1
            java.util.List r1 = r10.ws()
            boolean r2 = com.bytedance.msdk.tl.p.j(r1)
            if (r2 != 0) goto Ld1
            r0.addAll(r1)
        Ld1:
            java.util.Iterator r1 = r0.iterator()
        Ld5:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Le7
            java.lang.Object r2 = r1.next()
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            if (r2 != 0) goto Ld5
            r1.remove()
            goto Ld5
        Le7:
            com.bytedance.msdk.core.oq.xt r1 = r10.ae
            boolean r1 = r1.p()
            if (r1 != 0) goto Lfe
            com.bytedance.msdk.core.oq.xt r1 = r10.ae
            boolean r1 = r1.h()
            if (r1 == 0) goto Lf8
            goto Lfe
        Lf8:
            java.util.Comparator<com.bytedance.msdk.core.oq.oq> r1 = r10.j
            java.util.Collections.sort(r0, r1)
            return r0
        Lfe:
            java.util.List r0 = r10.r(r0)
        L102:
            return r0
    }

    @Override // com.bytedance.msdk.cw.xt.j.j
    public void xt(@androidx.annotation.NonNull com.bytedance.msdk.api.j r1) {
            r0 = this;
            return
    }

    public void xt(com.bytedance.msdk.xt.cw r3) {
            r2 = this;
            com.bytedance.msdk.api.j.xt r0 = r2.m
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.j()
            goto La
        L9:
            r0 = 0
        La:
            int r0 = r3.tl(r0)
            r1 = 3
            r3.g(r1)
            r3.oq(r0)
            return
    }
}

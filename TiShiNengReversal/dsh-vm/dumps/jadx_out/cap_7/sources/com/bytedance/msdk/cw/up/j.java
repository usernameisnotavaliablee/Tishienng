package com.bytedance.msdk.cw.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private static volatile com.bytedance.msdk.cw.up.j xt;
    private final java.util.Comparator<com.bytedance.msdk.core.up.xt.ae> cw;
    private final java.util.Map<java.lang.Integer, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.core.up.xt.ae>> j;


    private j() {
            r1 = this;
            r1.<init>()
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            r1.j = r0
            com.bytedance.msdk.cw.up.j$1 r0 = new com.bytedance.msdk.cw.up.j$1
            r0.<init>(r1)
            r1.cw = r0
            return
    }

    public static com.bytedance.msdk.cw.up.j j() {
            com.bytedance.msdk.cw.up.j r0 = com.bytedance.msdk.cw.up.j.xt
            if (r0 != 0) goto L19
            java.lang.Class<com.bytedance.msdk.core.up.j.j> r0 = com.bytedance.msdk.core.up.j.j.class
            monitor-enter(r0)
            com.bytedance.msdk.cw.up.j r1 = com.bytedance.msdk.cw.up.j.xt     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.bytedance.msdk.cw.up.j r1 = new com.bytedance.msdk.cw.up.j     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.bytedance.msdk.cw.up.j.xt = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.bytedance.msdk.cw.up.j r0 = com.bytedance.msdk.cw.up.j.xt
            return r0
    }

    public static java.util.List<com.bytedance.msdk.xt.cw> j(com.bytedance.msdk.api.j.xt r7, java.util.List<com.bytedance.msdk.xt.cw> r8, java.util.List<com.bytedance.msdk.xt.cw> r9) {
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()
            boolean r0 = r0.m()
            r1 = 0
            if (r0 != 0) goto Lc
            return r1
        Lc:
            if (r7 != 0) goto Lf
            return r1
        Lf:
            if (r8 == 0) goto L70
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L18
            goto L70
        L18:
            if (r9 == 0) goto L70
            boolean r0 = r9.isEmpty()
            if (r0 == 0) goto L21
            goto L70
        L21:
            int r0 = r7.f()
            r1 = 5
            if (r0 != r1) goto L2d
            int r7 = r7.a()
            goto L2e
        L2d:
            r7 = 1
        L2e:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r9 = r9.iterator()
        L37:
            boolean r1 = r9.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r9.next()
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            boolean r2 = xt(r8, r1)
            if (r2 != 0) goto L37
            int r2 = r0.size()
            if (r2 >= r7) goto L6f
            boolean r2 = r1.dj()
            if (r2 != 0) goto L37
            boolean r2 = r1.qo()
            if (r2 != 0) goto L37
            boolean r2 = r1.qe()
            if (r2 == 0) goto L6b
            double r2 = r1.t()
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L37
        L6b:
            r0.add(r1)
            goto L37
        L6f:
            return r0
        L70:
            return r1
    }

    public static void j(com.bytedance.msdk.api.j.xt r3, java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L41
            if (r3 != 0) goto L9
            goto L41
        L9:
            java.lang.String r0 = r3.vl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1a
            java.lang.String r0 = r3.v()
            r3.cw(r0)
        L1a:
            java.lang.String r0 = r3.v()
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L25
            goto L41
        L25:
            com.bytedance.sdk.openadsdk.i.cw.cw.xt$j r0 = new com.bytedance.sdk.openadsdk.i.cw.cw.xt$j
            com.bytedance.sdk.openadsdk.i.cw.cw.xt r1 = new com.bytedance.sdk.openadsdk.i.cw.cw.xt
            android.util.SparseArray r2 = r3.gx()
            r1.<init>(r2)
            r0.<init>(r1)
            r0.r(r4)
            com.bytedance.sdk.openadsdk.i.cw.cw.xt r4 = r0.j()
            com.bykv.vk.openvk.api.proto.PluginValueSet r4 = com.bytedance.sdk.openadsdk.mediation.xt.xt.j.j(r4)
            r3.j(r4)
        L41:
            return
    }

    private boolean j(com.bytedance.msdk.api.j.xt r5, com.bytedance.msdk.api.j.xt r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L4e
            if (r6 != 0) goto L6
            goto L4e
        L6:
            int r1 = r5.f()
            int r2 = r6.f()
            if (r1 == r2) goto L11
            return r0
        L11:
            int r1 = r5.f()
            r2 = 7
            r3 = 1
            if (r1 == r2) goto L21
            int r1 = r5.f()
            r2 = 10
            if (r1 != r2) goto L2c
        L21:
            int r1 = r5.rn()
            int r2 = r6.rn()
            if (r1 != r2) goto L2c
            return r3
        L2c:
            int r1 = r5.f()
            if (r1 == r3) goto L39
            int r1 = r5.f()
            r2 = 5
            if (r1 != r2) goto L4e
        L39:
            int r1 = r5.ch()
            int r2 = r6.ch()
            if (r1 != r2) goto L4e
            int r5 = r5.s()
            int r6 = r6.s()
            if (r5 != r6) goto L4e
            return r3
        L4e:
            return r0
    }

    private boolean j(java.util.List<com.bytedance.msdk.core.up.xt.ae> r2, com.bytedance.msdk.xt.cw r3) {
            r1 = this;
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r2.next()
            com.bytedance.msdk.core.up.xt.ae r0 = (com.bytedance.msdk.core.up.xt.ae) r0
            if (r0 == 0) goto L4
            if (r3 == 0) goto L4
            com.bytedance.msdk.xt.cw r0 = r0.j
            if (r0 != r3) goto L4
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    private static boolean xt(java.util.List<com.bytedance.msdk.xt.cw> r1, com.bytedance.msdk.xt.cw r2) {
            java.util.Iterator r1 = r1.iterator()
        L4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r1.next()
            com.bytedance.msdk.xt.cw r0 = (com.bytedance.msdk.xt.cw) r0
            if (r2 == 0) goto L4
            if (r0 != r2) goto L4
            r1 = 1
            return r1
        L16:
            r1 = 0
            return r1
    }

    public synchronized java.util.List<com.bytedance.msdk.core.up.xt.ae> j(com.bytedance.msdk.api.j.xt r10) {
            r9 = this;
            monitor-enter(r9)
            r0 = 0
            if (r10 != 0) goto L6
            monitor-exit(r9)
            return r0
        L6:
            java.util.Map<java.lang.Integer, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.core.up.xt.ae>> r1 = r9.j     // Catch: java.lang.Throwable -> L2d
            int r2 = r10.f()     // Catch: java.lang.Throwable -> L2d
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L2d
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto Lc1
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L2d
            if (r2 == 0) goto L20
            goto Lc1
        L20:
            int r0 = r10.f()     // Catch: java.lang.Throwable -> L2d
            r2 = 5
            r3 = 1
            if (r0 != r2) goto L30
            int r0 = r10.a()     // Catch: java.lang.Throwable -> L2d
            goto L31
        L2d:
            r10 = move-exception
            goto Lc3
        L30:
            r0 = 1
        L31:
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L2d
            r2.<init>()     // Catch: java.lang.Throwable -> L2d
            java.util.Iterator r4 = r1.iterator()     // Catch: java.lang.Throwable -> L2d
        L3a:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r5 == 0) goto Lab
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Throwable -> L2d
            com.bytedance.msdk.core.up.xt.ae r5 = (com.bytedance.msdk.core.up.xt.ae) r5     // Catch: java.lang.Throwable -> L2d
            int r6 = r2.size()     // Catch: java.lang.Throwable -> L2d
            if (r6 >= r0) goto Lab
            boolean r6 = r5.ae()     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L8e
            com.bytedance.msdk.xt.cw r6 = r5.j     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L8e
            java.lang.String r6 = "TTMediationSDK"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = "--==-- 公共缓存池，广告："
            r7.<init>(r8)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = r5.xt()     // Catch: java.lang.Throwable -> L2d
            r7.append(r8)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = "  adnName:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L2d
            com.bytedance.msdk.xt.cw r8 = r5.j     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = r8.zz()     // Catch: java.lang.Throwable -> L2d
            r7.append(r8)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = " showSort:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L2d
            com.bytedance.msdk.xt.cw r8 = r5.j     // Catch: java.lang.Throwable -> L2d
            int r8 = r8.d()     // Catch: java.lang.Throwable -> L2d
            r7.append(r8)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r8 = " 暂不可用， 已经被使用中..."
            r7.append(r8)     // Catch: java.lang.Throwable -> L2d
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L2d
            com.bytedance.msdk.j.up.cw.xt(r6, r7)     // Catch: java.lang.Throwable -> L2d
        L8e:
            com.bytedance.msdk.api.j.xt r6 = r5.r()     // Catch: java.lang.Throwable -> L2d
            boolean r6 = r9.j(r10, r6)     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L3a
            boolean r6 = r5.up()     // Catch: java.lang.Throwable -> L2d
            if (r6 == 0) goto L3a
            boolean r6 = r5.ae()     // Catch: java.lang.Throwable -> L2d
            if (r6 != 0) goto L3a
            r2.add(r5)     // Catch: java.lang.Throwable -> L2d
            r1.remove(r5)     // Catch: java.lang.Throwable -> L2d
            goto L3a
        Lab:
            java.util.Iterator r10 = r2.iterator()     // Catch: java.lang.Throwable -> L2d
        Laf:
            boolean r0 = r10.hasNext()     // Catch: java.lang.Throwable -> L2d
            if (r0 == 0) goto Lbf
            java.lang.Object r0 = r10.next()     // Catch: java.lang.Throwable -> L2d
            com.bytedance.msdk.core.up.xt.ae r0 = (com.bytedance.msdk.core.up.xt.ae) r0     // Catch: java.lang.Throwable -> L2d
            r0.xt(r3)     // Catch: java.lang.Throwable -> L2d
            goto Laf
        Lbf:
            monitor-exit(r9)
            return r2
        Lc1:
            monitor-exit(r9)
            return r0
        Lc3:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L2d
            throw r10
    }

    public synchronized void j(com.bytedance.msdk.api.j.xt r7, java.util.List<com.bytedance.msdk.xt.cw> r8) {
            r6 = this;
            monitor-enter(r6)
            com.bytedance.msdk.core.ws.cw r0 = com.bytedance.msdk.core.xt.xt()     // Catch: java.lang.Throwable -> L3f
            boolean r0 = r0.m()     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto Ld
            monitor-exit(r6)
            return
        Ld:
            if (r7 != 0) goto L11
            monitor-exit(r6)
            return
        L11:
            boolean r0 = r7.sm()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L19
            monitor-exit(r6)
            return
        L19:
            java.lang.String r0 = "TTMediationSDK"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "广告位："
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r7.v()     // Catch: java.lang.Throwable -> L3f
            r1.append(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "  type:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L3f
            int r2 = r7.f()     // Catch: java.lang.Throwable -> L3f
            r1.append(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = " show后把二价广告放入公共缓存池 数量："
            r1.append(r2)     // Catch: java.lang.Throwable -> L3f
            if (r8 != 0) goto L42
            java.lang.String r2 = "没有二价"
            goto L4a
        L3f:
            r7 = move-exception
            goto L153
        L42:
            int r2 = r8.size()     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L3f
        L4a:
            r1.append(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3f
            com.bytedance.msdk.j.up.cw.r(r0, r1)     // Catch: java.lang.Throwable -> L3f
            if (r8 == 0) goto L151
            boolean r0 = r8.isEmpty()     // Catch: java.lang.Throwable -> L3f
            if (r0 == 0) goto L5e
            goto L151
        L5e:
            java.util.Map<java.lang.Integer, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.core.up.xt.ae>> r0 = r6.j     // Catch: java.lang.Throwable -> L3f
            int r1 = r7.f()     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L3f
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L3f
            java.util.concurrent.CopyOnWriteArrayList r0 = (java.util.concurrent.CopyOnWriteArrayList) r0     // Catch: java.lang.Throwable -> L3f
            if (r0 != 0) goto L75
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList     // Catch: java.lang.Throwable -> L3f
            r0.<init>()     // Catch: java.lang.Throwable -> L3f
        L75:
            java.util.Iterator r8 = r8.iterator()     // Catch: java.lang.Throwable -> L3f
        L79:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto Le9
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L3f
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "TTMediationSDK"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "广告位："
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r7.v()     // Catch: java.lang.Throwable -> L3f
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "  代码位："
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r1.qa()     // Catch: java.lang.Throwable -> L3f
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "   adnName:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = r1.zz()     // Catch: java.lang.Throwable -> L3f
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "  loadSort:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            int r4 = r1.wi()     // Catch: java.lang.Throwable -> L3f
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "  showSort:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            int r4 = r1.d()     // Catch: java.lang.Throwable -> L3f
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r4 = "  ecpm:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            double r4 = r1.t()     // Catch: java.lang.Throwable -> L3f
            r3.append(r4)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L3f
            com.bytedance.msdk.j.up.cw.r(r2, r3)     // Catch: java.lang.Throwable -> L3f
            boolean r2 = r6.j(r0, r1)     // Catch: java.lang.Throwable -> L3f
            if (r2 != 0) goto L79
            com.bytedance.msdk.core.up.xt.ae r2 = new com.bytedance.msdk.core.up.xt.ae     // Catch: java.lang.Throwable -> L3f
            r3 = 0
            r2.<init>(r1, r3, r7)     // Catch: java.lang.Throwable -> L3f
            r0.add(r2)     // Catch: java.lang.Throwable -> L3f
            goto L79
        Le9:
            java.util.Iterator r8 = r0.iterator()     // Catch: java.lang.Throwable -> L3f
        Led:
            boolean r1 = r8.hasNext()     // Catch: java.lang.Throwable -> L3f
            if (r1 == 0) goto L103
            java.lang.Object r1 = r8.next()     // Catch: java.lang.Throwable -> L3f
            com.bytedance.msdk.core.up.xt.ae r1 = (com.bytedance.msdk.core.up.xt.ae) r1     // Catch: java.lang.Throwable -> L3f
            boolean r2 = r1.up()     // Catch: java.lang.Throwable -> L3f
            if (r2 != 0) goto Led
            r0.remove(r1)     // Catch: java.lang.Throwable -> L3f
            goto Led
        L103:
            java.util.Comparator<com.bytedance.msdk.core.up.xt.ae> r8 = r6.cw     // Catch: java.lang.Throwable -> L3f
            com.bytedance.msdk.tl.la.j(r0, r8)     // Catch: java.lang.Throwable -> L3f
        L108:
            int r8 = r0.size()     // Catch: java.lang.Throwable -> L3f
            r1 = 3
            if (r1 >= r8) goto L113
            r0.remove(r1)     // Catch: java.lang.Throwable -> L3f
            goto L108
        L113:
            java.lang.String r8 = "TTMediationSDK"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "广告位："
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = r7.v()     // Catch: java.lang.Throwable -> L3f
            r1.append(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "  type:"
            r1.append(r2)     // Catch: java.lang.Throwable -> L3f
            int r2 = r7.f()     // Catch: java.lang.Throwable -> L3f
            r1.append(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r2 = "  公共缓存池二价广告的数量："
            r1.append(r2)     // Catch: java.lang.Throwable -> L3f
            int r2 = r0.size()     // Catch: java.lang.Throwable -> L3f
            r1.append(r2)     // Catch: java.lang.Throwable -> L3f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L3f
            com.bytedance.msdk.j.up.cw.r(r8, r1)     // Catch: java.lang.Throwable -> L3f
            java.util.Map<java.lang.Integer, java.util.concurrent.CopyOnWriteArrayList<com.bytedance.msdk.core.up.xt.ae>> r8 = r6.j     // Catch: java.lang.Throwable -> L3f
            int r7 = r7.f()     // Catch: java.lang.Throwable -> L3f
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L3f
            r8.put(r7, r0)     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r6)
            return
        L151:
            monitor-exit(r6)
            return
        L153:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L3f
            throw r7
    }
}

package com.bytedance.msdk.cw.cw.j;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt implements com.bytedance.msdk.cw.cw.j.j, com.bytedance.msdk.cw.xt.xt.j {
    private java.lang.String ae;
    protected final java.util.List<com.bytedance.msdk.core.oq.oq> cw;
    private java.util.List<java.lang.Integer> g;
    java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> j;

    /* renamed from: m, reason: collision with root package name */
    private com.bytedance.msdk.core.oq.xt f2312m;
    private android.os.Handler oq;
    private com.bytedance.msdk.cw.ae.xt.j qv;

    /* renamed from: r, reason: collision with root package name */
    protected long f2313r;
    private com.bytedance.msdk.api.j.xt tl;
    private com.bytedance.msdk.cw.m.j.xt up;
    private boolean vl;
    protected com.bytedance.msdk.cw.m.j.j xt;








    public xt() {
            r2 = this;
            r2.<init>()
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            r2.cw = r0
            r0 = 0
            r2.vl = r0
            android.os.Looper r0 = com.bytedance.msdk.j.up.m.xt()
            if (r0 == 0) goto L1b
            com.bytedance.msdk.cw.cw.j.xt$1 r1 = new com.bytedance.msdk.cw.cw.j.xt$1
            r1.<init>(r2, r0)
            r2.oq = r1
            return
        L1b:
            com.bytedance.msdk.j.up.m.j()
            com.bytedance.msdk.cw.cw.j.xt$2 r0 = new com.bytedance.msdk.cw.cw.j.xt$2
            android.os.Looper r1 = com.bytedance.msdk.j.up.m.xt()
            r0.<init>(r2, r1)
            r2.oq = r0
            return
    }

    private void cw(int r4) {
            r3 = this;
            if (r4 >= 0) goto L3
            goto L43
        L3:
            java.util.List<java.lang.Integer> r0 = r3.g
            boolean r0 = com.bytedance.msdk.cw.tl.m.j(r4, r0)
            if (r0 == 0) goto L44
            com.bytedance.msdk.core.oq.xt r0 = r3.f2312m
            int r0 = r0.hl()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.bytedance.msdk.core.oq.xt r2 = r3.f2312m
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r2)
            r1.append(r2)
            java.lang.String r2 = "the "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = " level is first level normal ad and ParallelNum:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r2, r1)
            r1 = 0
        L39:
            if (r1 >= r0) goto L43
            int r2 = r4 + r1
            r3.r(r2)
            int r1 = r1 + 1
            goto L39
        L43:
            return
        L44:
            r3.r(r4)
            return
    }

    private void cw(com.bytedance.msdk.core.oq.oq r2, int r3) {
            r1 = this;
            if (r2 == 0) goto L3c
            android.os.Handler r0 = r1.oq
            if (r0 != 0) goto L7
            goto L3c
        L7:
            boolean r0 = r2.gq()
            if (r0 == 0) goto Lf
            r0 = 1
            goto L27
        Lf:
            boolean r0 = r2.la()
            if (r0 != 0) goto L26
            boolean r0 = r2.rn()
            if (r0 == 0) goto L1c
            goto L26
        L1c:
            boolean r0 = r2.h()
            if (r0 == 0) goto L24
            r0 = 3
            goto L27
        L24:
            r0 = 4
            goto L27
        L26:
            r0 = 2
        L27:
            boolean r2 = r2.uf()
            if (r2 == 0) goto L37
            android.os.Handler r2 = r1.oq
            java.lang.Integer r3 = com.bytedance.msdk.tl.kt.j(r3)
            r2.removeMessages(r0, r3)
            return
        L37:
            android.os.Handler r2 = r1.oq
            r2.removeMessages(r0)
        L3c:
            return
    }

    private void cw(java.util.List<com.bytedance.msdk.xt.cw> r8) {
            r7 = this;
            if (r8 != 0) goto L3
            goto L2c
        L3:
            java.util.Iterator r8 = r8.iterator()
        L7:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L2c
            java.lang.Object r0 = r8.next()
            com.bytedance.msdk.xt.cw r0 = (com.bytedance.msdk.xt.cw) r0
            if (r0 == 0) goto L7
            com.bytedance.msdk.core.up.xt.r r1 = com.bytedance.msdk.core.up.xt.r.j()
            java.lang.String r2 = r7.ae
            com.bytedance.msdk.core.up.xt.ae r3 = new com.bytedance.msdk.core.up.xt.ae
            com.bytedance.msdk.cw.m.j.xt r4 = r7.up
            long r4 = r4.l()
            com.bytedance.msdk.api.j.xt r6 = r7.tl
            r3.<init>(r0, r4, r6)
            r1.j(r2, r3)
            goto L7
        L2c:
            return
    }

    static /* synthetic */ com.bytedance.msdk.api.j.xt j(com.bytedance.msdk.cw.cw.j.xt r0) {
            com.bytedance.msdk.api.j.xt r0 = r0.tl
            return r0
    }

    private void j(int r6, int r7) {
            r5 = this;
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r0 = r5.j
            if (r0 != 0) goto L6
            goto Ldc
        L6:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.get(r1)
            java.util.List r0 = (java.util.List) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.bytedance.msdk.core.oq.xt r2 = r5.f2312m
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r2)
            r1.append(r2)
            java.lang.String r2 = "loadLevelWaterFall start...执行当前加载层级 ："
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = " levelSort:"
            r1.append(r7)
            r1.append(r6)
            java.lang.String r7 = "  waterFallConfig.size:"
            r1.append(r7)
            r7 = 0
            if (r0 != 0) goto L38
            r2 = 0
            goto L3c
        L38:
            int r2 = r0.size()
        L3c:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r2, r1)
            boolean r1 = com.bytedance.msdk.tl.p.j(r0)
            if (r1 == 0) goto L50
            goto Ldc
        L50:
            com.bytedance.msdk.cw.m.j.j r1 = r5.xt
            int r2 = r0.size()
            r1.j(r6, r2)
            boolean r1 = com.bytedance.msdk.cw.tl.m.cw(r6)
            if (r1 == 0) goto L66
            com.bytedance.msdk.core.oq.xt r1 = r5.f2312m
            long r1 = r1.kt()
            goto L6c
        L66:
            com.bytedance.msdk.core.oq.xt r1 = r5.f2312m
            long r1 = r1.ed()
        L6c:
            android.os.Message r3 = android.os.Message.obtain()
            boolean r4 = com.bytedance.msdk.cw.tl.m.j(r6)
            if (r4 == 0) goto L7a
            r4 = 1
            r3.what = r4
            goto L97
        L7a:
            boolean r4 = com.bytedance.msdk.cw.tl.m.cw(r6)
            if (r4 == 0) goto L84
            r4 = 2
            r3.what = r4
            goto L97
        L84:
            boolean r4 = com.bytedance.msdk.cw.tl.m.xt(r6)
            if (r4 == 0) goto L8e
            r4 = 3
            r3.what = r4
            goto L97
        L8e:
            r4 = 4
            r3.what = r4
            java.lang.Integer r4 = com.bytedance.msdk.tl.kt.j(r6)
            r3.obj = r4
        L97:
            r3.arg1 = r6
            android.os.Handler r6 = r5.oq
            if (r6 == 0) goto La0
            r6.sendMessageDelayed(r3, r1)
        La0:
            com.bytedance.msdk.core.oq.xt r6 = r5.f2312m
            long r1 = r6.uf()
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 == 0) goto Lb9
            android.os.Handler r6 = r5.oq
            if (r6 == 0) goto Lb9
            r3 = 5
            r6.removeMessages(r3)
            android.os.Handler r6 = r5.oq
            r6.sendEmptyMessageDelayed(r3, r1)
        Lb9:
            int r6 = r0.size()
            if (r7 >= r6) goto Ldc
            com.bytedance.msdk.cw.cw.j.xt$4 r6 = new com.bytedance.msdk.cw.cw.j.xt$4     // Catch: java.lang.Throwable -> Ld5
            r6.<init>(r5, r0, r7)     // Catch: java.lang.Throwable -> Ld5
            com.bytedance.msdk.j.up.m.r(r6)     // Catch: java.lang.Throwable -> Ld5
            com.bytedance.msdk.cw.m.j.xt r6 = r5.up     // Catch: java.lang.Throwable -> Ld5
            boolean r6 = r6.v()     // Catch: java.lang.Throwable -> Ld5
            if (r6 == 0) goto Ld9
            com.bytedance.msdk.cw.m.j.xt r6 = r5.up     // Catch: java.lang.Throwable -> Ld5
            r6.a()     // Catch: java.lang.Throwable -> Ld5
            goto Ld9
        Ld5:
            r6 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r6)
        Ld9:
            int r7 = r7 + 1
            goto Lb9
        Ldc:
            return
    }

    private void j(android.os.Message r7) {
            r6 = this;
            int r0 = r7.arg1
            int r1 = r7.what
            java.lang.String r2 = "广告触发层超时.........levelSort:"
            r3 = 1
            java.lang.String r4 = "TTMediationSDK"
            switch(r1) {
                case 1: goto L8b;
                case 2: goto L5a;
                case 3: goto L5a;
                case 4: goto L8b;
                case 5: goto L39;
                case 6: goto Le;
                default: goto Lc;
            }
        Lc:
            goto Lc4
        Le:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.core.oq.xt r0 = r6.f2312m
            java.lang.String r0 = com.bytedance.msdk.j.up.up.j(r0)
            r7.append(r0)
            java.lang.String r0 = "触发总超时........."
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.r(r4, r7)
            com.bytedance.msdk.cw.m.j.j r7 = r6.xt
            r7.r()
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            com.bytedance.msdk.core.oq.g r7 = r7.wq()
            r7.f2223m = r3
            r6.xt()
            return
        L39:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.core.oq.xt r1 = r6.f2312m
            java.lang.String r1 = com.bytedance.msdk.j.up.up.j(r1)
            r7.append(r1)
            java.lang.String r1 = "触发最小层超时.........levelSort:"
            r7.append(r1)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.r(r4, r7)
            r6.xt()
            return
        L5a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.bytedance.msdk.core.oq.xt r3 = r6.f2312m
            java.lang.String r3 = com.bytedance.msdk.j.up.up.j(r3)
            r1.append(r3)
            int r7 = r7.what
            r3 = 2
            if (r7 != r3) goto L70
            java.lang.String r7 = "ClientBidding层"
            goto L72
        L70:
            java.lang.String r7 = "ServerBidding层层"
        L72:
            r1.append(r7)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            com.bytedance.msdk.j.up.cw.r(r4, r7)
            com.bytedance.msdk.cw.m.j.j r7 = r6.xt
            r7.r(r0)
            r6.xt()
            return
        L8b:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.bytedance.msdk.core.oq.xt r5 = r6.f2312m
            java.lang.String r5 = com.bytedance.msdk.j.up.up.j(r5)
            r1.append(r5)
            int r7 = r7.what
            if (r7 != r3) goto La0
            java.lang.String r7 = "P层"
            goto La2
        La0:
            java.lang.String r7 = "普通层"
        La2:
            r1.append(r7)
            r1.append(r2)
            r1.append(r0)
            java.lang.String r7 = r1.toString()
            com.bytedance.msdk.j.up.cw.r(r4, r7)
            com.bytedance.msdk.cw.m.j.j r7 = r6.xt
            r7.r(r0)
            boolean r7 = r6.xt()
            if (r7 != 0) goto Lc4
            int r7 = r6.xt(r0)
            r6.cw(r7)
        Lc4:
            return
    }

    private void j(com.bytedance.msdk.api.j.xt r10, java.util.List<com.bytedance.msdk.core.oq.oq> r11, com.bytedance.msdk.core.r.xt r12) {
            r9 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r9.up
            if (r0 == 0) goto L18
            if (r12 == 0) goto L18
            java.lang.String r0 = r12.f2256r
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L18
            com.bytedance.msdk.cw.m.j.xt r0 = r9.up
            com.bytedance.msdk.core.oq.g r0 = r0.wq()
            java.lang.String r1 = r12.f2256r
            r0.j = r1
        L18:
            com.bytedance.msdk.core.oq.xt r0 = r9.f2312m
            if (r0 == 0) goto L2d
            if (r12 == 0) goto L2d
            java.util.Map r0 = r0.up()
            int r1 = r12.jy
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = "price_source"
            r0.put(r2, r1)
        L2d:
            if (r12 == 0) goto L38
            com.bytedance.msdk.cw.m.j.j r0 = r9.xt
            boolean r0 = r0.up()
            com.bytedance.msdk.up.m.j(r10, r12, r0)
        L38:
            java.lang.String r10 = "TTMediationSDK"
            r0 = 0
            r1 = 1
            if (r12 == 0) goto Lf9
            java.util.List<com.bytedance.msdk.core.oq.oq> r2 = r12.xt
            boolean r2 = com.bytedance.msdk.tl.p.j(r2)
            if (r2 != 0) goto Lf9
            com.bytedance.msdk.cw.m.j.j r11 = r9.xt
            r11.j(r1)
            com.bytedance.msdk.cw.m.j.xt r11 = r9.up
            boolean r11 = r11.j()
            if (r11 != 0) goto L18f
            com.bytedance.msdk.cw.m.j.xt r11 = r9.up
            boolean r11 = r11.xt()
            if (r11 == 0) goto L5d
            goto L18f
        L5d:
            java.util.List<com.bytedance.msdk.core.oq.oq> r11 = r9.cw
            r11.clear()
            java.util.List<com.bytedance.msdk.core.oq.oq> r11 = r9.cw
            java.util.List<com.bytedance.msdk.core.oq.oq> r2 = r12.xt
            r11.addAll(r2)
            android.os.Handler r11 = r9.oq
            if (r11 == 0) goto L7c
            r11.removeMessages(r1)
            android.os.Handler r11 = r9.oq
            r2 = 4
            r11.removeMessages(r2)
            android.os.Handler r11 = r9.oq
            r2 = 5
            r11.removeMessages(r2)
        L7c:
            java.util.List<com.bytedance.msdk.core.oq.oq> r11 = r12.xt
            com.bytedance.msdk.tl.la.j(r11)
            java.util.List<com.bytedance.msdk.core.oq.oq> r11 = r12.xt
            com.bytedance.msdk.core.oq.xt r2 = r9.f2312m
            boolean r2 = r2.qv()
            java.util.Map r11 = com.bytedance.msdk.cw.tl.m.j(r11, r2)
            r9.j = r11
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            r9.g = r11
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r2 = r9.j
            java.util.Set r2 = r2.keySet()
            r11.addAll(r2)
            java.util.List<java.lang.Integer> r11 = r9.g
            com.bytedance.msdk.core.ae.xt.j(r11)
            com.bytedance.msdk.cw.m.j.j r11 = r9.xt
            java.util.List<java.lang.Integer> r2 = r9.g
            r11.j(r2)
            com.bytedance.msdk.cw.m.j.j r11 = r9.xt
            java.util.List<com.bytedance.msdk.core.oq.oq> r2 = r12.xt
            com.bytedance.msdk.core.oq.xt r3 = r9.f2312m
            java.util.List r3 = r3.ol()
            java.util.List r3 = com.bytedance.msdk.cw.tl.m.j(r3)
            com.bytedance.msdk.core.oq.xt r4 = r9.f2312m
            java.util.List r4 = r4.ol()
            java.util.List r4 = com.bytedance.msdk.cw.tl.m.cw(r4)
            r11.j(r2, r3, r4)
            com.bytedance.msdk.core.oq.xt r11 = r9.f2312m
            com.bytedance.msdk.cw.m.j.xt r2 = r9.up
            java.util.List<com.bytedance.msdk.core.oq.oq> r3 = r12.xt
            com.bytedance.msdk.cw.ae.j.j(r11, r2, r3)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            com.bytedance.msdk.core.oq.xt r2 = r9.f2312m
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r2)
            r11.append(r2)
            java.lang.String r2 = "serverBidding响应回来..........开始从头开始请求waterFallConfig  代码位总数量："
            r11.append(r2)
            java.util.List<com.bytedance.msdk.core.oq.oq> r2 = r12.xt
            int r2 = r2.size()
            r11.append(r2)
            java.lang.String r11 = r11.toString()
            com.bytedance.msdk.j.up.cw.r(r10, r11)
            r9.cw(r0)
            r9.xt()
            goto L15d
        Lf9:
            com.bytedance.msdk.cw.m.j.j r2 = r9.xt
            r3 = 2
            r2.j(r3)
            com.bytedance.msdk.cw.m.j.xt r2 = r9.up
            boolean r2 = r2.j()
            if (r2 != 0) goto L18f
            com.bytedance.msdk.cw.m.j.xt r2 = r9.up
            boolean r2 = r2.xt()
            if (r2 == 0) goto L111
            goto L18f
        L111:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.bytedance.msdk.core.oq.xt r3 = r9.f2312m
            java.lang.String r3 = com.bytedance.msdk.j.up.up.j(r3)
            r2.append(r3)
            java.lang.String r3 = "serverBidding响应失败了.......... "
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.bytedance.msdk.j.up.cw.r(r10, r2)
            com.bytedance.msdk.cw.m.j.j r10 = r9.xt
            r10.xt(r0)
            if (r11 == 0) goto L150
            int r10 = r11.size()
        L136:
            if (r0 >= r10) goto L150
            java.lang.Object r2 = r11.get(r0)
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            com.bytedance.msdk.cw.m.j.j r3 = r9.xt
            com.bytedance.msdk.core.oq.xt r4 = r9.f2312m
            int r4 = com.bytedance.msdk.cw.tl.m.j(r4, r2)
            java.lang.String r2 = r2.w()
            r3.j(r4, r2)
            int r0 = r0 + 1
            goto L136
        L150:
            boolean r10 = r9.xt()
            if (r10 != 0) goto L15d
            com.bytedance.msdk.cw.ae.xt.j r10 = r9.qv
            if (r10 == 0) goto L15d
            r10.j()
        L15d:
            com.bytedance.msdk.core.oq.xt r10 = r9.f2312m
            if (r10 == 0) goto L17a
            if (r12 == 0) goto L17a
            com.bytedance.msdk.core.g.xt r2 = com.bytedance.msdk.core.g.xt.r()
            double r3 = r12.vl
            double r5 = r12.ws
            com.bytedance.msdk.core.oq.xt r10 = r9.f2312m
            java.lang.String r7 = r10.rn()
            com.bytedance.msdk.core.oq.xt r10 = r9.f2312m
            java.lang.String r8 = r10.la()
            r2.j(r3, r5, r7, r8)
        L17a:
            if (r12 == 0) goto L18f
            boolean r10 = r12.cw
            if (r10 == 0) goto L18f
            com.bytedance.msdk.core.ws.cw r10 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.ws.xt r10 = com.bytedance.msdk.core.ws.xt.j(r10)
            com.bytedance.msdk.core.ws.xt r10 = r10.j()
            r10.xt(r1)
        L18f:
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.cw.cw.j.xt r0, int r1) {
            r0.cw(r1)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.cw.cw.j.xt r0, android.os.Message r1) {
            r0.j(r1)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.cw.cw.j.xt r0, com.bytedance.msdk.api.j.xt r1, java.util.List r2, com.bytedance.msdk.core.r.xt r3) {
            r0.j(r1, r2, r3)
            return
    }

    private void r(int r7) {
            r6 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r6.up
            boolean r0 = r0.j()
            java.lang.String r1 = "TTMediationSDK"
            if (r0 != 0) goto Lfe
            boolean r0 = r6.up()
            if (r0 == 0) goto L12
            goto Lfe
        L12:
            com.bytedance.msdk.cw.m.j.xt r0 = r6.up
            boolean r0 = r0.m()
            if (r0 == 0) goto L35
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.core.oq.xt r0 = r6.f2312m
            java.lang.String r0 = com.bytedance.msdk.j.up.up.j(r0)
            r7.append(r0)
            java.lang.String r0 = "已经触发过destroy操作..."
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r7)
            return
        L35:
            boolean r0 = r6.xt()
            if (r0 == 0) goto L3d
            goto Lcf
        L3d:
            java.util.List<java.lang.Integer> r0 = r6.g
            int r0 = r0.size()
            java.lang.String r2 = "第 "
            if (r7 < r0) goto L68
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bytedance.msdk.core.oq.xt r3 = r6.f2312m
            java.lang.String r3 = com.bytedance.msdk.j.up.up.j(r3)
            r0.append(r3)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r7 = " 层没有广告可以请求..."
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r7)
            return
        L68:
            java.util.List<java.lang.Integer> r0 = r6.g
            java.lang.Object r0 = r0.get(r7)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r3 = r0.intValue()
            com.bytedance.msdk.cw.m.j.j r4 = r6.xt
            boolean r4 = r4.cw(r3)
            if (r4 == 0) goto L82
            int r7 = r7 + 1
            r6.cw(r7)
            return
        L82:
            boolean r4 = com.bytedance.msdk.cw.tl.m.xt(r3)
            if (r4 == 0) goto Lba
            com.bytedance.msdk.cw.m.j.j r4 = r6.xt
            int r4 = r4.xt()
            r5 = -1
            if (r4 != r5) goto Lba
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.bytedance.msdk.core.oq.xt r3 = r6.f2312m
            java.lang.String r3 = com.bytedance.msdk.j.up.up.j(r3)
            r2.append(r3)
            java.lang.String r3 = "开启serverBidding exchange 请求...."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r2)
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r1 = r6.j
            java.lang.Object r0 = r1.get(r0)
            java.util.List r0 = (java.util.List) r0
            r6.j(r0)
            r6.j(r7)
            return
        Lba:
            com.bytedance.msdk.cw.m.j.j r0 = r6.xt
            r0.xt(r3)
            r6.j(r3, r7)
            boolean r0 = com.bytedance.msdk.cw.tl.m.cw(r3)
            if (r0 != 0) goto Ld0
            boolean r0 = com.bytedance.msdk.cw.tl.m.xt(r3)
            if (r0 == 0) goto Lcf
            goto Ld0
        Lcf:
            return
        Ld0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bytedance.msdk.core.oq.xt r4 = r6.f2312m
            java.lang.String r4 = com.bytedance.msdk.j.up.up.j(r4)
            r0.append(r4)
            r0.append(r2)
            r0.append(r7)
            java.lang.String r2 = "层 ClientBidding,ServerBidding 广告，levelSort："
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = "，同时请求下一层广告..."
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            int r7 = r7 + 1
            r6.cw(r7)
            return
        Lfe:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.core.oq.xt r0 = r6.f2312m
            java.lang.String r0 = com.bytedance.msdk.j.up.up.j(r0)
            r7.append(r0)
            java.lang.String r0 = "已经触发过成功、失败回调..."
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r7)
            return
    }

    static /* synthetic */ com.bytedance.msdk.cw.m.j.xt xt(com.bytedance.msdk.cw.cw.j.xt r0) {
            com.bytedance.msdk.cw.m.j.xt r0 = r0.up
            return r0
    }

    private void xt(java.util.List<com.bytedance.msdk.xt.cw> r9) {
            r8 = this;
            if (r9 == 0) goto Lae
            int r0 = r9.size()
            if (r0 <= 0) goto Lae
            r0 = 0
            java.lang.Object r1 = r9.get(r0)
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            java.lang.String r1 = r1.qa()
            java.lang.Object r2 = r9.get(r0)
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            boolean r2 = r2.ll()
            if (r2 == 0) goto Lae
            com.bytedance.msdk.core.up.j.j r2 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r3 = r8.ae
            com.bytedance.msdk.api.j.xt r4 = r8.tl
            int r4 = r4.up()
            int r2 = r2.up(r3, r1, r4)
            r3 = 1
            if (r2 != r3) goto Lae
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r9 = r9.iterator()
        L3b:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L56
            java.lang.Object r3 = r9.next()
            com.bytedance.msdk.xt.cw r3 = (com.bytedance.msdk.xt.cw) r3
            if (r3 == 0) goto L3b
            com.bytedance.msdk.core.up.xt.ae r4 = new com.bytedance.msdk.core.up.xt.ae
            r5 = 0
            com.bytedance.msdk.api.j.xt r7 = r8.tl
            r4.<init>(r3, r5, r7)
            r2.add(r4)
            goto L3b
        L56:
            int r9 = r2.size()
            if (r9 <= 0) goto Lae
            java.lang.Object r9 = r2.get(r0)
            com.bytedance.msdk.core.up.xt.ae r9 = (com.bytedance.msdk.core.up.xt.ae) r9
            com.bytedance.msdk.xt.cw r9 = r9.j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "--==-- 广告复用:广告缓存成功 -------"
            r3.<init>(r4)
            java.lang.String r4 = r9.ff()
            r3.append(r4)
            java.lang.String r4 = ", adType: "
            r3.append(r4)
            int r4 = r9.om()
            int r5 = r9.rh()
            java.lang.String r4 = com.bytedance.msdk.xt.j.j(r4, r5)
            r3.append(r4)
            java.lang.String r4 = ", adnSlotId: "
            r3.append(r4)
            java.lang.String r9 = r9.qa()
            r3.append(r9)
            java.lang.String r9 = ", ad个数: "
            r3.append(r9)
            int r9 = r2.size()
            r3.append(r9)
            java.lang.String r9 = r3.toString()
            java.lang.String r3 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r3, r9)
            com.bytedance.msdk.core.up.j.j r9 = com.bytedance.msdk.core.up.j.j.j()
            r9.j(r1, r2, r0)
        Lae:
            return
    }

    void cw() {
            r1 = this;
            r0 = 0
            r1.vl = r0
            com.bytedance.msdk.cw.m.j.xt r0 = r1.up
            r0.r()
            return
    }

    public void j() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bytedance.msdk.core.oq.xt r1 = r2.f2312m
            java.lang.String r1 = com.bytedance.msdk.j.up.up.j(r1)
            r0.append(r1)
            java.lang.String r1 = "onAdVideoCache....."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r1, r0)
            r2.r()
            return
    }

    public void j(int r6) {
            r5 = this;
            com.bytedance.msdk.core.oq.xt r0 = r5.f2312m
            com.bytedance.msdk.cw.ae.xt.j r0 = com.bytedance.msdk.cw.ae.xt.up.j(r0)
            r5.qv = r0
            android.os.Handler r1 = r5.oq
            com.bytedance.msdk.core.oq.xt r2 = r5.f2312m
            com.bytedance.msdk.cw.ae.xt.xt r3 = new com.bytedance.msdk.cw.ae.xt.xt
            com.bytedance.msdk.cw.cw.j.xt$6 r4 = new com.bytedance.msdk.cw.cw.j.xt$6
            r4.<init>(r5, r6)
            r3.<init>(r2, r4)
            r0.j(r1, r2, r3)
            return
    }

    protected void j(android.content.Context r5, com.bytedance.msdk.api.j.xt r6, java.util.List<com.bytedance.msdk.core.oq.oq> r7, boolean r8) {
            r4 = this;
            com.bytedance.msdk.core.r.r r0 = com.bytedance.msdk.core.r.up.j()
            if (r0 == 0) goto L3b
            com.bytedance.msdk.cw.m.j.j r1 = r4.xt
            r2 = 0
            r1.j(r2)
            com.bytedance.msdk.cw.m.j.xt r1 = r4.up
            com.bytedance.msdk.core.oq.g r1 = r1.wq()
            r2 = 1
            r1.f2224r = r2
            com.bytedance.msdk.core.r.cw r1 = new com.bytedance.msdk.core.r.cw
            r1.<init>()
            r1.j = r6
            r1.xt = r7
            com.bytedance.msdk.core.oq.xt r3 = r4.f2312m
            r1.f2251r = r3
            r1.f2250m = r8
            if (r6 != 0) goto L27
            goto L2b
        L27:
            int r2 = r6.cw()
        L2b:
            r1.up = r2
            com.bytedance.msdk.cw.m.j.xt r8 = r4.up
            java.util.Map r8 = r8.tj()
            com.bytedance.msdk.cw.cw.j.xt$7 r2 = new com.bytedance.msdk.cw.cw.j.xt$7
            r2.<init>(r4, r6, r7)
            r0.j(r8, r5, r1, r2)
        L3b:
            return
    }

    void j(com.bytedance.msdk.api.j r2) {
            r1 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r1.up
            r0.j(r2)
            return
    }

    public void j(com.bytedance.msdk.api.j r9, com.bytedance.msdk.core.oq.oq r10) {
            r8 = this;
            if (r10 != 0) goto L5
            r1 = r8
            goto La2
        L5:
            r0 = 0
            r8.j(r0, r9)
            if (r9 == 0) goto L2c
            java.lang.String r2 = r10.w()
            java.lang.String r3 = r10.i()
            java.lang.String r4 = r10.av()
            int r0 = r10.jy()
            int r1 = r10.m()
            java.lang.String r5 = com.bytedance.msdk.xt.j.j(r0, r1)
            int r6 = r9.cw
            java.lang.String r7 = r9.f2149r
            r1 = r8
            r1.j(r2, r3, r4, r5, r6, r7)
            goto L2d
        L2c:
            r1 = r8
        L2d:
            com.bytedance.msdk.core.ae.cw.j(r9, r10)
            boolean r9 = r10.uf()
            if (r9 == 0) goto L45
            com.bytedance.msdk.cw.m.j.j r9 = r1.xt
            java.util.List<com.bytedance.msdk.core.oq.oq> r0 = r1.cw
            java.lang.String r2 = r10.w()
            boolean r9 = com.bytedance.msdk.cw.ae.j.j(r9, r0, r2)
            if (r9 == 0) goto L45
            goto La2
        L45:
            com.bytedance.msdk.core.oq.xt r9 = r1.f2312m
            int r9 = com.bytedance.msdk.cw.tl.m.j(r9, r10)
            com.bytedance.msdk.cw.m.j.j r0 = r1.xt
            java.lang.String r2 = r10.w()
            r0.j(r9, r2)
            r0 = 2
            boolean r0 = r8.xt(r10, r0)
            if (r0 != 0) goto La2
            com.bytedance.msdk.cw.m.j.j r0 = r1.xt
            boolean r0 = r0.up(r9)
            if (r0 != 0) goto La2
            com.bytedance.msdk.cw.m.j.j r0 = r1.xt
            int r0 = r0.m(r9)
            if (r0 != 0) goto La2
            boolean r0 = r10.wq()
            if (r0 != 0) goto La2
            int r0 = r8.xt(r9)
            r8.cw(r10, r9)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            com.bytedance.msdk.core.oq.xt r2 = r1.f2312m
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r2)
            r10.append(r2)
            java.lang.String r2 = "onAdFailed levelSort "
            r10.append(r2)
            r10.append(r9)
            java.lang.String r9 = " 广告全部响应结束&不满足返回条件，直接请求下一层广告 nextIdx："
            r10.append(r9)
            r10.append(r0)
            java.lang.String r9 = r10.toString()
            java.lang.String r10 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.r(r10, r9)
            r8.cw(r0)
        La2:
            return
    }

    protected void j(com.bytedance.msdk.core.oq.oq r9, int r10) {
            r8 = this;
            if (r9 == 0) goto L28
            com.bytedance.msdk.api.j.xt r0 = r8.tl
            if (r0 == 0) goto L28
            java.lang.String r2 = r9.w()
            java.lang.String r3 = r9.az()
            java.lang.String r4 = r9.av()
            com.bytedance.msdk.api.j.xt r0 = r8.tl
            int r0 = r0.f()
            int r1 = r9.m()
            java.lang.String r5 = com.bytedance.msdk.xt.j.j(r0, r1)
            r6 = 0
            java.lang.String r7 = "广告请求中"
            r1 = r8
            r1.j(r2, r3, r4, r5, r6, r7)
            goto L29
        L28:
            r1 = r8
        L29:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bytedance.msdk.core.oq.xt r2 = r1.f2312m
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r2)
            r0.append(r2)
            java.lang.String r2 = "开始 某一层级的waterFallConfig请求 WaterFallConfig:"
            r0.append(r2)
            java.lang.String r2 = r9.toString()
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r2, r0)
            com.bytedance.msdk.cw.m.xt.xt r9 = com.bytedance.msdk.cw.m.xt.xt.j(r9, r8)
            r0 = 1
            r9.cw(r0)
            r9.xt(r0)
            r9.j(r10)
            com.bytedance.msdk.cw.m.j.xt r10 = r1.up
            boolean r10 = r10.v()
            r10 = r10 ^ r0
            r9.j(r10)
            long r2 = android.os.SystemClock.elapsedRealtime()
            r9.j(r2)
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            com.bytedance.msdk.cw.cw.xt.xt r0 = new com.bytedance.msdk.cw.cw.xt.xt
            r0.<init>()
            r10.add(r0)
            com.bytedance.msdk.cw.cw.xt.r r0 = new com.bytedance.msdk.cw.cw.xt.r
            r0.<init>()
            r10.add(r0)
            com.bytedance.msdk.cw.cw.xt.m r0 = new com.bytedance.msdk.cw.cw.xt.m
            r0.<init>()
            r10.add(r0)
            com.bytedance.msdk.cw.cw.xt.cw r0 = new com.bytedance.msdk.cw.cw.xt.cw
            r0.<init>()
            r10.add(r0)
            com.bytedance.msdk.cw.cw.xt.up r0 = new com.bytedance.msdk.cw.cw.xt.up
            r0.<init>(r10)
            com.bytedance.msdk.cw.m.j.xt r10 = r1.up
            r0.j(r10, r9)
            return
    }

    @Override // com.bytedance.msdk.cw.cw.j.j
    public void j(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r11) {
            r10 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r11.j()
            r10.up = r0
            android.os.Handler r1 = r10.oq
            r0.j(r1)
            com.bytedance.msdk.cw.m.j.xt r0 = r10.up
            com.bytedance.msdk.cw.m.j.j r0 = r0.jy()
            r10.xt = r0
            com.bytedance.msdk.cw.m.j.xt r0 = r10.up
            com.bytedance.msdk.core.oq.xt r0 = r0.vl()
            r10.f2312m = r0
            com.bytedance.msdk.cw.m.j.xt r0 = r10.up
            com.bytedance.msdk.api.j.xt r0 = r0.mi()
            r10.tl = r0
            java.lang.String r0 = r0.v()
            r10.ae = r0
            com.bytedance.msdk.core.oq.xt r0 = r10.f2312m
            java.util.Map r0 = r0.ch()
            r10.j = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.g = r0
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r1 = r10.j
            java.util.Set r1 = r1.keySet()
            r0.addAll(r1)
            java.util.List<java.lang.Integer> r0 = r10.g
            com.bytedance.msdk.core.ae.xt.j(r0)
            com.bytedance.msdk.cw.m.j.j r0 = r10.xt
            java.util.List<java.lang.Integer> r1 = r10.g
            r0.j(r1)
            com.bytedance.msdk.cw.m.j.j r0 = r10.xt
            com.bytedance.msdk.core.oq.xt r1 = r10.f2312m
            int r1 = r1.f()
            r0.ae(r1)
            com.bytedance.msdk.core.oq.xt r0 = r10.f2312m
            java.util.List r0 = r0.ol()
            java.util.List r0 = com.bytedance.msdk.cw.tl.m.j(r0)
            com.bytedance.msdk.core.oq.xt r1 = r10.f2312m
            java.util.List r1 = r1.ol()
            java.util.List r1 = com.bytedance.msdk.cw.tl.m.xt(r1)
            com.bytedance.msdk.cw.m.j.j r2 = r10.xt
            r3 = 0
            if (r0 != 0) goto L73
            r0 = 0
            goto L77
        L73:
            int r0 = r0.size()
        L77:
            r2.tl(r0)
            com.bytedance.msdk.cw.m.j.j r0 = r10.xt
            if (r1 != 0) goto L80
            r1 = 0
            goto L84
        L80:
            int r1 = r1.size()
        L84:
            r0.g(r1)
            android.os.Handler r0 = r10.oq
            if (r0 == 0) goto L95
            com.bytedance.msdk.core.oq.xt r1 = r10.f2312m
            long r1 = r1.c()
            r4 = 6
            r0.sendEmptyMessageDelayed(r4, r1)
        L95:
            com.bytedance.msdk.cw.m.j.xt r0 = r10.up
            boolean r0 = r0.f()
            r1 = 1
            if (r0 != 0) goto Lbb
            com.bytedance.msdk.api.j.xt r4 = r10.tl
            com.bytedance.msdk.core.oq.xt r0 = r10.f2312m
            java.lang.String r5 = r0.hh()
            com.bytedance.msdk.cw.m.j.xt r0 = r10.up
            boolean r0 = r0.v()
            r6 = r0 ^ 1
            com.bytedance.msdk.cw.m.j.xt r0 = r10.up
            com.bytedance.msdk.core.oq.g r0 = r0.wq()
            java.lang.String r7 = r0.j
            r8 = 0
            r9 = 0
            com.bytedance.msdk.up.m.j(r4, r5, r6, r7, r8, r9)
        Lbb:
            com.bytedance.msdk.core.oq.xt r0 = r10.f2312m
            boolean r0 = r0.vl()
            if (r0 == 0) goto Lcb
            com.bytedance.msdk.cw.m.j.xt r0 = r11.j()
            r11.j(r0)
            goto Lf9
        Lcb:
            boolean r11 = com.bytedance.msdk.j.up.cw.xt()
            if (r11 == 0) goto Lf6
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            com.bytedance.msdk.core.oq.xt r0 = r10.f2312m
            java.lang.String r0 = com.bytedance.msdk.j.up.up.j(r0)
            r11.append(r0)
            java.lang.String r0 = "开始加载广告 num:"
            r11.append(r0)
            com.bytedance.msdk.core.oq.xt r0 = r10.f2312m
            int r0 = r0.f()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            java.lang.String r0 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r0, r11)
        Lf6:
            r10.cw(r3)
        Lf9:
            com.bytedance.msdk.core.ws.cw r11 = com.bytedance.msdk.core.xt.xt()
            com.bytedance.msdk.core.ws.xt r11 = com.bytedance.msdk.core.ws.xt.j(r11)
            r11.xt(r1)
            return
    }

    protected void j(java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, int r7, java.lang.String r8) {
            r2 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r2.up
            java.util.concurrent.ConcurrentHashMap r0 = r0.x()
            java.lang.Object r0 = r0.get(r3)
            com.bytedance.msdk.api.xt r0 = (com.bytedance.msdk.api.xt) r0
            if (r0 != 0) goto L13
            com.bytedance.msdk.api.xt r0 = new com.bytedance.msdk.api.xt
            r0.<init>()
        L13:
            com.bytedance.msdk.api.xt r1 = r0.xt(r3)
            com.bytedance.msdk.api.xt r4 = r1.cw(r4)
            com.bytedance.msdk.api.xt r4 = r4.r(r5)
            com.bytedance.msdk.api.xt r4 = r4.j(r7)
            com.bytedance.msdk.api.xt r4 = r4.up(r8)
            r4.j(r6)
            com.bytedance.msdk.cw.m.j.xt r4 = r2.up
            java.util.concurrent.ConcurrentHashMap r4 = r4.x()
            r4.put(r3, r0)
            return
    }

    protected void j(java.util.List<com.bytedance.msdk.core.oq.oq> r3) {
            r2 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r2.up
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L10
            com.bytedance.msdk.cw.cw.j.xt$5 r1 = new com.bytedance.msdk.cw.cw.j.xt$5
            r1.<init>(r2, r0, r3)
            com.bytedance.msdk.j.up.m.r(r1)
        L10:
            return
    }

    void j(java.util.List<com.bytedance.msdk.xt.cw> r2, com.bytedance.msdk.api.j r3) {
            r1 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r1.up
            r0.j(r2, r3)
            return
    }

    public void j(java.util.List<com.bytedance.msdk.xt.cw> r9, com.bytedance.msdk.core.oq.oq r10) {
            r8 = this;
            boolean r0 = com.bytedance.msdk.tl.p.j(r9)
            if (r0 != 0) goto L8
            if (r10 != 0) goto Lb
        L8:
            r1 = r8
            goto L108
        Lb:
            com.bytedance.msdk.core.oq.xt r0 = r8.f2312m
            r8.j(r9, r0)
            java.lang.String r2 = r10.w()
            java.lang.String r3 = r10.az()
            java.lang.String r4 = r10.av()
            int r0 = r10.jy()
            int r1 = r10.m()
            java.lang.String r5 = com.bytedance.msdk.xt.j.j(r0, r1)
            r6 = 0
            java.lang.String r7 = "广告加载成功"
            r1 = r8
            r1.j(r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = r1.ae
            boolean r2 = com.bytedance.msdk.tl.p.xt(r9)
            r3 = 0
            r4 = 0
            if (r2 != 0) goto L40
            java.lang.Object r2 = r9.get(r3)
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            goto L41
        L40:
            r2 = r4
        L41:
            com.bytedance.msdk.core.ae.cw.j(r0, r10, r2)
            r8.xt(r9)
            com.bytedance.msdk.core.oq.xt r0 = r1.f2312m
            int r0 = com.bytedance.msdk.cw.tl.m.j(r0, r10)
            boolean r2 = r10.uf()
            java.lang.String r5 = "TTMediationSDK"
            if (r2 == 0) goto L8e
            com.bytedance.msdk.cw.m.j.j r2 = r1.xt
            java.util.List<com.bytedance.msdk.core.oq.oq> r6 = r1.cw
            java.lang.String r7 = r10.w()
            boolean r2 = com.bytedance.msdk.cw.ae.j.j(r2, r6, r7)
            if (r2 == 0) goto L8e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.bytedance.msdk.core.oq.xt r2 = r1.f2312m
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r2)
            r0.append(r2)
            java.lang.String r2 = "返回的普通广告被server Bidding过滤了......slotId:"
            r0.append(r2)
            java.lang.String r10 = r10.w()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            com.bytedance.msdk.j.up.cw.r(r5, r10)
            com.bytedance.msdk.cw.m.j.xt r10 = r1.up
            java.util.concurrent.CopyOnWriteArrayList r10 = r10.g()
            r10.addAll(r9)
            return
        L8e:
            com.bytedance.msdk.cw.m.j.xt r2 = r1.up
            com.bytedance.msdk.cw.tl.j.j(r2, r9, r3)
            com.bytedance.msdk.cw.m.j.j r2 = r1.xt
            java.lang.String r3 = r10.w()
            r2.j(r0, r3)
            com.bytedance.msdk.cw.m.j.xt r2 = r1.up
            boolean r2 = r2.v()
            if (r2 == 0) goto La7
            r8.cw(r9)
        La7:
            com.bytedance.msdk.cw.m.j.j r2 = r1.xt
            boolean r2 = r2.up()
            if (r2 == 0) goto Lbc
            com.bytedance.msdk.api.j r2 = new com.bytedance.msdk.api.j
            r3 = 10012(0x271c, float:1.403E-41)
            java.lang.String r6 = "load ad timeout !!!"
            r2.<init>(r3, r6)
            r8.j(r4, r2)
            goto Lbf
        Lbc:
            r8.j(r9, r4)
        Lbf:
            com.bytedance.msdk.cw.m.j.xt r2 = r1.up
            r2.j(r9)
            r9 = 1
            boolean r9 = r8.xt(r10, r9)
            if (r9 != 0) goto L108
            com.bytedance.msdk.cw.m.j.j r9 = r1.xt
            int r9 = r9.m(r0)
            if (r9 != 0) goto L108
            boolean r9 = r10.wq()
            if (r9 != 0) goto L108
            int r9 = r8.xt(r0)
            r8.cw(r10, r0)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            com.bytedance.msdk.core.oq.xt r2 = r1.f2312m
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r2)
            r10.append(r2)
            java.lang.String r2 = "onAdLoaded levelSort: "
            r10.append(r2)
            r10.append(r0)
            java.lang.String r0 = " 广告全部响应结束&不满足返回条件，直接请求下一层广告 nextIdx："
            r10.append(r0)
            r10.append(r9)
            java.lang.String r10 = r10.toString()
            com.bytedance.msdk.j.up.cw.r(r5, r10)
            r8.cw(r9)
        L108:
            return
    }

    protected void j(java.util.List<com.bytedance.msdk.xt.cw> r1, com.bytedance.msdk.core.oq.xt r2) {
            r0 = this;
            com.bytedance.msdk.core.g.r.j(r1, r2)
            com.bytedance.msdk.core.xt.j.j(r1, r2)
            return
    }

    void r() {
            r1 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r1.up
            r0.up()
            return
    }

    public boolean up() {
            r2 = this;
            com.bytedance.msdk.cw.m.j.xt r0 = r2.up
            boolean r0 = r0.xt()
            r1 = 0
            if (r0 == 0) goto L18
            boolean r0 = r2.vl
            if (r0 == 0) goto L16
            com.bytedance.msdk.core.oq.xt r0 = r2.f2312m
            boolean r0 = com.bytedance.msdk.tl.xt.j.j(r0)
            if (r0 == 0) goto L16
            return r1
        L16:
            r0 = 1
            return r0
        L18:
            return r1
    }

    protected int xt(int r3) {
            r2 = this;
            java.util.List<java.lang.Integer> r0 = r2.g
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            int r3 = r0.indexOf(r3)
            if (r3 != r1) goto L11
            return r1
        L11:
            int r3 = r3 + 1
            return r3
    }

    @Override // com.bytedance.msdk.cw.cw.j.j
    public void xt(com.bytedance.msdk.cw.cw.j.j.InterfaceC0233j r8) {
            r7 = this;
            com.bytedance.msdk.core.r.r r8 = com.bytedance.msdk.core.r.up.j()
            r0 = r8
            com.bytedance.msdk.core.r.m r0 = (com.bytedance.msdk.core.r.m) r0
            com.bytedance.msdk.cw.m.j.xt r8 = r7.up
            java.lang.String r1 = r8.uf()
            long r2 = r7.f2313r
            com.bytedance.msdk.api.j.xt r4 = r7.tl
            com.bytedance.msdk.core.oq.xt r5 = r7.f2312m
            com.bytedance.msdk.cw.cw.j.xt$3 r6 = new com.bytedance.msdk.cw.cw.j.xt$3
            r6.<init>(r7)
            r0.j(r1, r2, r4, r5, r6)
            return
    }

    public boolean xt() {
            r2 = this;
            r0 = 0
            r1 = 3
            boolean r0 = r2.xt(r0, r1)
            return r0
    }

    public boolean xt(com.bytedance.msdk.core.oq.oq r7, int r8) {
            r6 = this;
            com.bytedance.msdk.cw.m.j.xt r8 = r6.up
            boolean r8 = r8.j()
            r0 = 1
            if (r8 != 0) goto L266
            boolean r8 = r6.up()
            if (r8 == 0) goto L11
            goto L266
        L11:
            com.bytedance.msdk.cw.m.j.j r8 = r6.xt
            boolean r8 = r8.up()
            java.lang.String r1 = "TTMediationSDK"
            if (r8 == 0) goto Lb8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.core.oq.xt r8 = r6.f2312m
            java.lang.String r8 = com.bytedance.msdk.j.up.up.j(r8)
            r7.append(r8)
            java.lang.String r8 = "触发总超时或全部代码位响应结束.....totalTimeout："
            r7.append(r8)
            com.bytedance.msdk.cw.m.j.j r8 = r6.xt
            boolean r8 = r8.up()
            r7.append(r8)
            java.lang.String r8 = "  allWtfFinish:"
            r7.append(r8)
            com.bytedance.msdk.cw.m.j.j r8 = r6.xt
            boolean r8 = r8.tl()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.r(r1, r7)
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.ae()
            boolean r7 = com.bytedance.msdk.tl.p.j(r7)
            if (r7 == 0) goto Lb4
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.tl()
            boolean r7 = com.bytedance.msdk.tl.p.j(r7)
            if (r7 == 0) goto Lb4
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.oq()
            boolean r7 = com.bytedance.msdk.tl.p.j(r7)
            if (r7 != 0) goto L71
            goto Lb4
        L71:
            com.bytedance.msdk.core.oq.xt r7 = r6.f2312m
            boolean r7 = com.bytedance.msdk.tl.xt.j.xt(r7)
            if (r7 == 0) goto La3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.core.oq.xt r8 = r6.f2312m
            java.lang.String r8 = com.bytedance.msdk.j.up.up.j(r8)
            r7.append(r8)
            java.lang.String r8 = "总加载时间超时.......isCallback:true"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.xt(r1, r7)
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            java.util.List<java.lang.Integer> r8 = r6.g
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r1 = r6.j
            boolean r7 = com.bytedance.msdk.tl.xt.j.j(r7, r8, r1)
            if (r7 == 0) goto La3
            r6.cw()
            return r0
        La3:
            r6.vl = r0
            com.bytedance.msdk.api.j r7 = new com.bytedance.msdk.api.j
            r8 = 10003(0x2713, float:1.4017E-41)
            java.lang.String r1 = com.bytedance.msdk.api.j.j(r8)
            r7.<init>(r8, r1)
            r6.j(r7)
            goto Lb7
        Lb4:
            r6.cw()
        Lb7:
            return r0
        Lb8:
            com.bytedance.msdk.cw.m.j.j r8 = r6.xt
            boolean r8 = r8.tl()
            if (r8 == 0) goto L112
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.core.oq.xt r8 = r6.f2312m
            java.lang.String r8 = com.bytedance.msdk.j.up.up.j(r8)
            r7.append(r8)
            java.lang.String r8 = "全部广告完成响应..."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.r(r1, r7)
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.ae()
            boolean r7 = com.bytedance.msdk.tl.p.j(r7)
            if (r7 == 0) goto L10e
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.tl()
            boolean r7 = com.bytedance.msdk.tl.p.j(r7)
            if (r7 == 0) goto L10e
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.oq()
            boolean r7 = com.bytedance.msdk.tl.p.j(r7)
            if (r7 != 0) goto Lff
            goto L10e
        Lff:
            com.bytedance.msdk.api.j r7 = new com.bytedance.msdk.api.j
            r8 = 20005(0x4e25, float:2.8033E-41)
            java.lang.String r1 = com.bytedance.msdk.api.j.j(r8)
            r7.<init>(r8, r1)
            r6.j(r7)
            goto L111
        L10e:
            r6.cw()
        L111:
            return r0
        L112:
            com.bytedance.msdk.cw.m.j.xt r8 = r6.up
            boolean r8 = r8.ws()
            if (r8 == 0) goto L138
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.core.oq.xt r8 = r6.f2312m
            java.lang.String r8 = com.bytedance.msdk.j.up.up.j(r8)
            r7.append(r8)
            java.lang.String r8 = "p层广告已经满足返回条件..."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.r(r1, r7)
            r6.cw()
            return r0
        L138:
            com.bytedance.msdk.core.oq.xt r8 = r6.f2312m
            boolean r8 = r8.p()
            if (r8 == 0) goto L148
            com.bytedance.msdk.cw.m.j.j r8 = r6.xt
            boolean r8 = r8.cw()
            if (r8 != 0) goto L150
        L148:
            com.bytedance.msdk.core.oq.xt r8 = r6.f2312m
            boolean r8 = r8.p()
            if (r8 != 0) goto L264
        L150:
            if (r7 != 0) goto L1be
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            boolean r7 = r7.az()
            if (r7 == 0) goto L180
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            boolean r7 = r7.i()
            if (r7 == 0) goto L180
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.core.oq.xt r8 = r6.f2312m
            java.lang.String r8 = com.bytedance.msdk.j.up.up.j(r8)
            r7.append(r8)
            java.lang.String r8 = "p层&普通层广告 已经满足返回条件 V1 ........."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.r(r1, r7)
            r6.cw()
            return r0
        L180:
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            boolean r7 = r7.av()
            if (r7 == 0) goto L264
            com.bytedance.msdk.cw.m.j.j r7 = r6.xt
            boolean r7 = r7.g()
            if (r7 == 0) goto L264
            com.bytedance.msdk.cw.m.j.j r7 = r6.xt
            boolean r7 = r7.oq()
            if (r7 == 0) goto L264
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            boolean r7 = r7.w()
            if (r7 == 0) goto L264
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.core.oq.xt r8 = r6.f2312m
            java.lang.String r8 = com.bytedance.msdk.j.up.up.j(r8)
            r7.append(r8)
            java.lang.String r8 = "p层&普通&Bidding层广告 已经满足返回条件 V2 ........."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.r(r1, r7)
            r6.cw()
            return r0
        L1be:
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            boolean r7 = r7.az()
            if (r7 == 0) goto L226
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            boolean r7 = r7.i()
            if (r7 == 0) goto L226
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            java.util.concurrent.CopyOnWriteArrayList r7 = r7.tl()
            java.util.Iterator r7 = r7.iterator()
        L1d8:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L264
            java.lang.Object r8 = r7.next()
            com.bytedance.msdk.xt.cw r8 = (com.bytedance.msdk.xt.cw) r8
            com.bytedance.msdk.core.oq.xt r2 = r6.f2312m
            com.bytedance.msdk.cw.ae.j.j r2 = com.bytedance.msdk.cw.ae.j.r.j(r2)
            com.bytedance.msdk.cw.m.j.xt r3 = r6.up
            java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r4 = r6.j
            if (r4 != 0) goto L1f2
            r4 = 0
            goto L202
        L1f2:
            com.bytedance.msdk.core.oq.xt r5 = r6.f2312m
            int r5 = com.bytedance.msdk.cw.tl.m.j(r5, r8)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r4.get(r5)
            java.util.List r4 = (java.util.List) r4
        L202:
            boolean r8 = r2.j(r3, r8, r4)
            if (r8 == 0) goto L1d8
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.core.oq.xt r8 = r6.f2312m
            java.lang.String r8 = com.bytedance.msdk.j.up.up.j(r8)
            r7.append(r8)
            java.lang.String r8 = "p层&普通层广告 已经满足返回条件 V3 ........."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.r(r1, r7)
            r6.cw()
            return r0
        L226:
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            boolean r7 = r7.av()
            if (r7 == 0) goto L264
            com.bytedance.msdk.cw.m.j.j r7 = r6.xt
            boolean r7 = r7.g()
            if (r7 == 0) goto L264
            com.bytedance.msdk.cw.m.j.j r7 = r6.xt
            boolean r7 = r7.oq()
            if (r7 == 0) goto L264
            com.bytedance.msdk.cw.m.j.xt r7 = r6.up
            boolean r7 = r7.w()
            if (r7 == 0) goto L264
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            com.bytedance.msdk.core.oq.xt r8 = r6.f2312m
            java.lang.String r8 = com.bytedance.msdk.j.up.up.j(r8)
            r7.append(r8)
            java.lang.String r8 = "p层&普通&Bidding层广告 已经满足返回条件 V4 ........."
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.r(r1, r7)
            r6.cw()
            return r0
        L264:
            r7 = 0
            return r7
        L266:
            return r0
    }
}

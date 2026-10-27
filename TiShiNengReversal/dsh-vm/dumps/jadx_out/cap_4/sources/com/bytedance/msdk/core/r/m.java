package com.bytedance.msdk.core.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m implements com.bytedance.msdk.core.r.r {



    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    private java.util.List<com.bytedance.msdk.core.oq.oq> j(java.util.List<com.bytedance.msdk.core.oq.oq> r12, com.bytedance.msdk.core.oq.xt r13, com.bytedance.msdk.core.r.xt r14) {
            r11 = this;
            r0 = 0
            if (r12 == 0) goto Lc7
            int r1 = r12.size()
            if (r1 != 0) goto Lb
            goto Lc7
        Lb:
            if (r13 != 0) goto Le
            return r0
        Le:
            java.util.Map r1 = r13.up()
            java.lang.String r2 = "serverBidding_timeout"
            java.lang.Object r1 = r1.get(r2)
            boolean r1 = r1 instanceof java.lang.Boolean
            if (r1 == 0) goto L2b
            java.util.Map r1 = r13.up()
            java.lang.Object r1 = r1.get(r2)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            goto L2c
        L2b:
            r1 = 0
        L2c:
            int r2 = r13.m()
            r3 = 4
            if (r2 != r3) goto L6e
            if (r1 != 0) goto L6e
            com.bytedance.msdk.ae.j.cw r1 = com.bytedance.msdk.ae.j.cw.j()
            java.lang.String r2 = r13.rn()
            int r3 = r13.wq()
            r4 = 102(0x66, float:1.43E-43)
            com.bytedance.msdk.core.oq.xt r5 = r1.j(r2, r3, r4)
            if (r5 != 0) goto L4a
            return r0
        L4a:
            r1 = 0
            if (r14 != 0) goto L50
            r7 = r1
            goto L53
        L50:
            double r3 = r14.vl
            r7 = r3
        L53:
            if (r14 != 0) goto L57
        L55:
            r9 = r1
            goto L5a
        L57:
            double r1 = r14.ws
            goto L55
        L5a:
            java.lang.String r6 = r5.rn()
            java.util.List r14 = com.bytedance.msdk.core.g.cw.j(r5, r6, r7, r9)
            java.util.Map r13 = r13.up()
            java.util.Map r1 = r5.up()
            r13.putAll(r1)
            goto L72
        L6e:
            java.util.List r14 = r13.ol()
        L72:
            if (r14 == 0) goto Lc7
            int r13 = r14.size()
            if (r13 != 0) goto L7b
            goto Lc7
        L7b:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            java.util.Iterator r14 = r14.iterator()
        L84:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto Lc6
            java.lang.Object r0 = r14.next()
            com.bytedance.msdk.core.oq.oq r0 = (com.bytedance.msdk.core.oq.oq) r0
            java.util.Iterator r1 = r12.iterator()
        L94:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L84
            java.lang.Object r2 = r1.next()
            com.bytedance.msdk.core.oq.oq r2 = (com.bytedance.msdk.core.oq.oq) r2
            if (r0 == 0) goto L94
            if (r2 == 0) goto L94
            int r3 = r0.mi()
            if (r3 != 0) goto L94
            java.lang.String r3 = r0.w()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L94
            java.lang.String r3 = r0.w()
            java.lang.String r2 = r2.w()
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L94
            r13.add(r0)
            goto L84
        Lc6:
            return r13
        Lc7:
            return r0
    }

    private void j(long r3, int r5, com.bytedance.msdk.api.j r6, com.bytedance.msdk.api.j.xt r7, com.bytedance.msdk.core.r.r.j r8) {
            r2 = this;
            if (r6 == 0) goto L9
            int r5 = r6.j
            r0 = -1
            if (r5 != r0) goto L9
            r5 = 4
            goto La
        L9:
            r5 = 5
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = r7.v()
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r7)
            r0.append(r7)
            java.lang.String r7 = "server bidding网络请求响应失败......onFail  result:"
            r0.append(r7)
            r0.append(r5)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.r(r0, r7)
            com.bytedance.msdk.core.r.xt r7 = new com.bytedance.msdk.core.r.xt
            r7.<init>()
            r7.f2255m = r5
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            r7.ae = r0
            r7.tl = r6
            if (r8 == 0) goto L40
            r8.j(r7)
        L40:
            return
    }

    private void j(long r16, com.bytedance.msdk.api.j.xt r18, com.bytedance.msdk.core.oq.xt r19, int r20, com.bytedance.msdk.core.oq.ae r21, com.bytedance.msdk.core.r.r.j r22) {
            r15 = this;
            r0 = r19
            r1 = r22
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = r18.v()
            java.lang.String r3 = com.bytedance.msdk.j.up.up.j(r3)
            r2.append(r3)
            java.lang.String r3 = "server bidding网络请求响返回............."
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.r(r3, r2)
            long r4 = java.lang.System.currentTimeMillis()
            long r4 = r4 - r16
            r2 = 1
            r6 = 2
            if (r0 == 0) goto L192
            if (r21 == 0) goto L192
            java.util.List r7 = r21.r()
            boolean r7 = com.bytedance.msdk.tl.p.j(r7)
            if (r7 != 0) goto L192
            java.util.List r7 = r21.r()
            com.bytedance.msdk.core.r.xt r8 = new com.bytedance.msdk.core.r.xt
            r8.<init>()
            double r9 = r21.j()
            r8.vl = r9
            int r9 = r21.xt()
            r8.jy = r9
            double r9 = r21.cw()
            r8.ws = r9
            org.json.JSONObject r9 = r21.ae()
            r8.qv = r9
            int r9 = r7.size()
            r8.g = r9
            java.util.List r9 = r21.g()
            r8.j = r9
            int r9 = r0.m()
            r8.oq = r9
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "winners : {"
            r10.append(r11)
            java.util.Iterator r7 = r7.iterator()
        L7e:
            boolean r11 = r7.hasNext()
            if (r11 == 0) goto Ldf
            java.lang.Object r11 = r7.next()
            com.bytedance.msdk.core.oq.tl r11 = (com.bytedance.msdk.core.oq.tl) r11
            if (r11 == 0) goto L7e
            java.lang.String r12 = r11.ae()
            com.bytedance.msdk.core.oq.oq r12 = r0.m(r12)
            if (r12 == 0) goto L7e
            com.bytedance.msdk.core.oq.oq r12 = r12.up()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            java.lang.String r14 = " [ AdnName:"
            r13.<init>(r14)
            java.lang.String r14 = r12.az()
            r13.append(r14)
            java.lang.String r14 = ",slotId:"
            r13.append(r14)
            java.lang.String r14 = r12.w()
            r13.append(r14)
            java.lang.String r14 = ",loadSort:"
            r13.append(r14)
            int r14 = r12.x()
            r13.append(r14)
            java.lang.String r14 = ",showSort:"
            r13.append(r14)
            int r14 = r12.ch()
            r13.append(r14)
            java.lang.String r14 = "] "
            r13.append(r14)
            java.lang.String r13 = r13.toString()
            r10.append(r13)
            r12.j(r11)
            r9.add(r12)
            goto L7e
        Ldf:
            java.lang.String r7 = "}"
            r10.append(r7)
            boolean r7 = com.bytedance.msdk.tl.p.j(r9)
            if (r7 == 0) goto L115
            java.util.List r0 = r21.g()
            boolean r0 = com.bytedance.msdk.tl.p.j(r0)
            if (r0 != 0) goto Lf5
            goto Lf7
        Lf5:
            r6 = r20
        Lf7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = r18.v()
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r7)
            r0.append(r7)
            java.lang.String r7 = "server bidding网络请求响应失败......：数据有返回，但没有返回winner数据......"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.r(r3, r0)
            goto L1be
        L115:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = r18.v()
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r7)
            r6.append(r7)
            java.lang.String r7 = "server bidding网络请求响应成功......："
            r6.append(r7)
            java.lang.String r7 = r10.toString()
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.bytedance.msdk.j.up.cw.r(r3, r6)
            java.util.concurrent.CopyOnWriteArrayList r6 = new java.util.concurrent.CopyOnWriteArrayList
            r6.<init>()
            r6.addAll(r9)
            java.util.List r7 = r21.g()
            java.util.List r0 = r15.j(r7, r0, r8)
            if (r0 == 0) goto L171
            int r7 = r0.size()
            if (r7 <= 0) goto L171
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r9 = r18.v()
            java.lang.String r9 = com.bytedance.msdk.j.up.up.j(r9)
            r7.append(r9)
            java.lang.String r9 = "server bidding网络请求响应成功......waterfall+server bidding物料......"
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            com.bytedance.msdk.j.up.cw.r(r3, r7)
            r6.addAll(r0)
            r0 = 1
            goto L18e
        L171:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = r18.v()
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r7)
            r0.append(r7)
            java.lang.String r7 = "server bidding网络请求响应成功......server bidding物料......"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.r(r3, r0)
            r0 = 3
        L18e:
            r8.xt = r6
            r6 = r0
            goto L1be
        L192:
            if (r21 == 0) goto L19f
            java.util.List r0 = r21.g()
            boolean r0 = com.bytedance.msdk.tl.p.j(r0)
            if (r0 != 0) goto L19f
            goto L1a1
        L19f:
            r6 = r20
        L1a1:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = r18.v()
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r7)
            r0.append(r7)
            java.lang.String r7 = "server bidding网络请求响应失败......没有返回serverBiddingModel相关数据"
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.r(r3, r0)
            r8 = 0
        L1be:
            if (r21 == 0) goto L216
            java.lang.String r0 = r21.m()
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto L1d3
            if (r8 != 0) goto L1d1
            com.bytedance.msdk.core.r.xt r8 = new com.bytedance.msdk.core.r.xt
            r8.<init>()
        L1d1:
            r8.f2256r = r0
        L1d3:
            boolean r0 = r21.tl()
            if (r0 == 0) goto L1fe
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = r18.v()
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r7)
            r0.append(r7)
            java.lang.String r7 = "server bidding发现config过期了，需要重新拉取配置......："
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            com.bytedance.msdk.j.up.cw.r(r3, r0)
            if (r8 != 0) goto L1fc
            com.bytedance.msdk.core.r.xt r8 = new com.bytedance.msdk.core.r.xt
            r8.<init>()
        L1fc:
            r8.cw = r2
        L1fe:
            java.util.List r0 = r21.up()
            boolean r0 = com.bytedance.msdk.tl.p.j(r0)
            if (r0 != 0) goto L216
            if (r8 != 0) goto L210
            com.bytedance.msdk.core.r.xt r0 = new com.bytedance.msdk.core.r.xt
            r0.<init>()
            r8 = r0
        L210:
            java.util.List r0 = r21.up()
            r8.up = r0
        L216:
            if (r8 != 0) goto L21d
            com.bytedance.msdk.core.r.xt r8 = new com.bytedance.msdk.core.r.xt
            r8.<init>()
        L21d:
            r8.f2255m = r6
            r8.ae = r4
            if (r1 == 0) goto L226
            r1.j(r8)
        L226:
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.r.m r0, long r1, int r3, com.bytedance.msdk.api.j r4, com.bytedance.msdk.api.j.xt r5, com.bytedance.msdk.core.r.r.j r6) {
            r0.j(r1, r3, r4, r5, r6)
            return
    }

    static /* synthetic */ void j(com.bytedance.msdk.core.r.m r0, long r1, com.bytedance.msdk.api.j.xt r3, com.bytedance.msdk.core.oq.xt r4, int r5, com.bytedance.msdk.core.oq.ae r6, com.bytedance.msdk.core.r.r.j r7) {
            r0.j(r1, r3, r4, r5, r6, r7)
            return
    }

    public void j(java.lang.String r9, long r10, com.bytedance.msdk.api.j.xt r12, com.bytedance.msdk.core.oq.xt r13, @androidx.annotation.NonNull com.bytedance.msdk.core.r.r.j r14) {
            r8 = this;
            com.bytedance.msdk.core.jy.j r0 = com.bytedance.msdk.core.jy.j.j()
            com.bytedance.msdk.core.r.m$2 r1 = new com.bytedance.msdk.core.r.m$2
            r2 = r8
            r3 = r10
            r5 = r12
            r6 = r13
            r7 = r14
            r1.<init>(r2, r3, r5, r6, r7)
            r0.j(r9, r1)
            return
    }

    @Override // com.bytedance.msdk.core.r.r
    public void j(java.util.Map<java.lang.String, com.bytedance.msdk.cw.j.j> r17, android.content.Context r18, com.bytedance.msdk.core.r.cw r19, @androidx.annotation.NonNull com.bytedance.msdk.core.r.r.j r20) {
            r16 = this;
            r4 = r19
            r0 = 0
            if (r4 == 0) goto L15
            com.bytedance.msdk.api.j.xt r1 = r4.j
            if (r1 == 0) goto L15
            com.bytedance.msdk.core.oq.xt r1 = r4.f2251r
            if (r1 == 0) goto L15
            java.util.List<com.bytedance.msdk.core.oq.oq> r1 = r4.xt
            boolean r1 = com.bytedance.msdk.tl.p.j(r1)
            if (r1 == 0) goto L18
        L15:
            r6 = r20
            goto L69
        L18:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.bytedance.msdk.api.j.xt r2 = r4.j
            java.lang.String r2 = r2.v()
            java.lang.String r2 = com.bytedance.msdk.j.up.up.j(r2)
            r1.append(r2)
            java.lang.String r2 = "开启server bidding网络请求......："
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.r(r2, r1)
            com.bytedance.msdk.api.j.xt r1 = r4.j
            com.bytedance.msdk.up.m.j(r1, r0)
            long r2 = java.lang.System.currentTimeMillis()
            r0 = 4
            int[] r5 = new int[]{r0}
            com.bytedance.msdk.core.jy.j r7 = com.bytedance.msdk.core.jy.j.j()
            com.bytedance.msdk.api.j.xt r9 = r4.j
            java.util.List<com.bytedance.msdk.core.oq.oq> r10 = r4.xt
            java.util.List<com.bytedance.msdk.xt.cw> r11 = r4.cw
            com.bytedance.msdk.core.oq.xt r12 = r4.f2251r
            int r13 = r4.up
            boolean r14 = r4.f2250m
            com.bytedance.msdk.core.r.m$1 r15 = new com.bytedance.msdk.core.r.m$1
            r1 = r16
            r6 = r20
            r0 = r15
            r0.<init>(r1, r2, r4, r5, r6)
            r8 = r18
            r6 = r7
            r7 = r17
            r6.j(r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return
        L69:
            r6.j(r0)
            return
    }
}

package com.bytedance.msdk.tl.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(com.bytedance.msdk.cw.m.j.xt r23, com.bytedance.msdk.core.oq.oq r24, int r25) {
            r1 = r24
            if (r23 == 0) goto L270
            com.bytedance.msdk.api.j.xt r2 = r23.mi()
            if (r2 == 0) goto L270
            if (r1 != 0) goto Le
            goto L270
        Le:
            com.bytedance.msdk.api.j.xt r2 = r23.mi()
            java.lang.String r14 = r2.v()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.bytedance.msdk.j.up.up.j(r14)
            r3.append(r4)
            java.lang.String r4 = "----------总超时后尝试从复用池中查找广告：id:"
            r3.append(r4)
            java.lang.String r4 = r1.w()
            r3.append(r4)
            java.lang.String r4 = "   loadSort:"
            r3.append(r4)
            int r5 = r1.x()
            r3.append(r5)
            java.lang.String r5 = "  showSort:"
            r3.append(r5)
            int r6 = r1.ch()
            r3.append(r6)
            java.lang.String r6 = "   adnName:"
            r3.append(r6)
            java.lang.String r7 = r1.az()
            r3.append(r7)
            java.lang.String r3 = r3.toString()
            java.lang.String r15 = "TTMediationSDK"
            com.bytedance.msdk.j.up.cw.xt(r15, r3)
            java.lang.String r3 = r1.w()
            boolean r7 = r1.kt()
            if (r7 == 0) goto L270
            com.bytedance.msdk.core.up.j.j r7 = com.bytedance.msdk.core.up.j.j.j()
            int r8 = r2.up()
            boolean r7 = r7.r(r14, r3, r8)
            if (r7 == 0) goto L270
            com.bytedance.msdk.core.up.j.j r7 = com.bytedance.msdk.core.up.j.j.j()
            r8 = 1
            int r7 = r7.j(r3, r2, r8)
            r9 = 3
            if (r7 != r9) goto L270
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r10 = com.bytedance.msdk.j.up.up.j(r14)
            r7.append(r10)
            java.lang.String r10 = "----------可复用：id:"
            r7.append(r10)
            java.lang.String r10 = r1.w()
            r7.append(r10)
            r7.append(r4)
            int r4 = r1.x()
            r7.append(r4)
            r7.append(r5)
            int r4 = r1.ch()
            r7.append(r4)
            r7.append(r6)
            java.lang.String r4 = r1.az()
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            com.bytedance.msdk.j.up.cw.xt(r15, r4)
            com.bytedance.msdk.core.up.j.j r4 = com.bytedance.msdk.core.up.j.j.j()
            r6 = r25
            r4.j(r14, r3, r1, r6)
            com.bytedance.msdk.core.up.j.j r4 = com.bytedance.msdk.core.up.j.j.j()
            int r5 = r2.up()
            java.util.List r4 = r4.j(r3, r2, r5)
            if (r4 == 0) goto L270
            int r5 = r4.size()
            if (r5 > 0) goto Ldb
            goto L270
        Ldb:
            r5 = 0
            java.lang.Object r7 = r4.get(r5)
            com.bytedance.msdk.core.up.xt.ae r7 = (com.bytedance.msdk.core.up.xt.ae) r7
            com.bytedance.msdk.xt.cw r7 = r7.j
            java.lang.String r10 = r2.j()
            int r7 = r7.tl(r10)
            com.bytedance.msdk.core.up.j.j r10 = com.bytedance.msdk.core.up.j.j.j()
            java.lang.String r10 = r10.j(r3)
            boolean r11 = r23.v()
            r11 = r11 ^ r8
            boolean r12 = r23.xt()
            r13 = 1
            r16 = 0
            r5 = 4
            r8 = r7
            r17 = 1
            r7 = 3
            r18 = 3
            r9 = 0
            r19 = r3
            r20 = r4
            r3 = r10
            r4 = r11
            r10 = -1
            r21 = r15
            r15 = r19
            r0 = 3
            com.bytedance.msdk.up.m.j(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12, r13)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r3 = r20.iterator()
        L121:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L151
            java.lang.Object r4 = r3.next()
            com.bytedance.msdk.core.up.xt.ae r4 = (com.bytedance.msdk.core.up.xt.ae) r4
            com.bytedance.msdk.xt.cw r5 = r4.j
            r5.g(r0)
            com.bytedance.msdk.xt.cw r5 = r4.j
            r5.oq(r8)
            com.bytedance.msdk.xt.cw r5 = r4.j
            boolean r6 = r23.xt()
            r5.cw(r6)
            com.bytedance.msdk.xt.cw r5 = r4.j
            r6 = 1
            r5.xt(r6)
            com.bytedance.msdk.xt.cw r5 = r4.j
            j(r14, r5, r15)
            com.bytedance.msdk.xt.cw r4 = r4.j
            r1.add(r4)
            goto L121
        L151:
            r4 = r20
            r5 = 0
            r6 = 1
            java.lang.Object r0 = r4.get(r5)
            com.bytedance.msdk.core.up.xt.ae r0 = (com.bytedance.msdk.core.up.xt.ae) r0
            com.bytedance.msdk.xt.cw r3 = r0.j
            int r10 = r1.size()
            r0 = r14
            r13 = 0
            r15 = -1
            r4 = 0
            r22 = 0
            java.lang.String r5 = "adn cache命中"
            r17 = 1
            r6 = 0
            r11 = 4
            r12 = 0
            r9 = r25
            r24 = r0
            r8 = r2
            r0 = r21
            r2 = 1
            com.bytedance.msdk.up.m.j(r3, r4, r5, r6, r8, r9, r10, r11, r12, r13, r15)
            r3 = r23
            com.bytedance.msdk.cw.tl.j.j(r3, r1, r2)
            r5 = 0
            java.lang.Object r2 = r1.get(r5)
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            boolean r4 = r2.px()
            java.lang.String r5 = ",CPM="
            java.lang.String r6 = ",showSort="
            java.lang.String r7 = ",loadSort="
            java.lang.String r8 = ",广告类型："
            java.lang.String r9 = ",slotId："
            if (r4 == 0) goto L201
            r3.j(r1)
            java.util.Iterator r1 = r1.iterator()
        L19f:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L270
            java.lang.Object r2 = r1.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = com.bytedance.msdk.j.up.up.j(r24)
            r4.append(r10)
            java.lang.String r10 = "复用池回溯成功...........回溯到了P层广告_当前P层广告缓存池数量："
            r4.append(r10)
            java.util.concurrent.CopyOnWriteArrayList r10 = r3.ae()
            int r10 = r10.size()
            r4.append(r10)
            r4.append(r9)
            java.lang.String r10 = r2.qa()
            r4.append(r10)
            r4.append(r8)
            java.lang.String r10 = r2.ff()
            r4.append(r10)
            r4.append(r7)
            int r10 = r2.wi()
            r4.append(r10)
            r4.append(r6)
            int r10 = r2.d()
            r4.append(r10)
            r4.append(r5)
            double r10 = r2.t()
            r4.append(r10)
            java.lang.String r2 = r4.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r2)
            goto L19f
        L201:
            boolean r2 = r2.qe()
            if (r2 == 0) goto L270
            r3.j(r1)
            java.util.Iterator r1 = r1.iterator()
        L20e:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L270
            java.lang.Object r2 = r1.next()
            com.bytedance.msdk.xt.cw r2 = (com.bytedance.msdk.xt.cw) r2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r10 = com.bytedance.msdk.j.up.up.j(r24)
            r4.append(r10)
            java.lang.String r10 = "复用池回溯成功...........回溯到了普通层广告_当前普通广告缓存池数量："
            r4.append(r10)
            java.util.concurrent.CopyOnWriteArrayList r10 = r3.tl()
            int r10 = r10.size()
            r4.append(r10)
            r4.append(r9)
            java.lang.String r10 = r2.qa()
            r4.append(r10)
            r4.append(r8)
            java.lang.String r10 = r2.ff()
            r4.append(r10)
            r4.append(r7)
            int r10 = r2.wi()
            r4.append(r10)
            r4.append(r6)
            int r10 = r2.d()
            r4.append(r10)
            r4.append(r5)
            double r10 = r2.t()
            r4.append(r10)
            java.lang.String r2 = r4.toString()
            com.bytedance.msdk.j.up.cw.j(r0, r2)
            goto L20e
        L270:
            return
    }

    private static void j(java.lang.String r2, com.bytedance.msdk.xt.cw r3, java.lang.String r4) {
            com.bytedance.msdk.core.up.j.j r0 = com.bytedance.msdk.core.up.j.j.j()
            com.bytedance.msdk.core.oq.oq r2 = r0.up(r2, r4)
            if (r3 == 0) goto L36
            if (r2 == 0) goto L36
            int r4 = r2.x()
            r3.i(r4)
            int r4 = r2.ch()
            r3.av(r4)
            java.lang.String r4 = r2.ws()
            r3.az(r4)
            int r4 = r2.mi()
            r3.az(r4)
            double r0 = r2.v()
            r3.j(r0)
            int r2 = r2.m()
            r3.up(r2)
        L36:
            return
    }

    public static boolean j(com.bytedance.msdk.core.oq.xt r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r3 = r3.wq()
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            java.util.Map r1 = r1.q()
            if (r1 != 0) goto L13
            return r0
        L13:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object r3 = r1.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2 = 1
            if (r3 == 0) goto L28
            int r3 = r3.intValue()
            if (r3 != r2) goto L27
            return r2
        L27:
            return r0
        L28:
            java.lang.String r3 = "-1"
            java.lang.Object r3 = r1.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L39
            int r3 = r3.intValue()
            if (r3 != r2) goto L39
            return r2
        L39:
            return r0
    }

    public static boolean j(com.bytedance.msdk.cw.m.j.xt r10, java.util.List<java.lang.Integer> r11, java.util.Map<java.lang.Integer, java.util.List<com.bytedance.msdk.core.oq.oq>> r12) {
            r0 = 0
            if (r10 == 0) goto L17c
            com.bytedance.msdk.api.j.xt r1 = r10.mi()
            if (r1 != 0) goto Lb
            goto L17c
        Lb:
            com.bytedance.msdk.api.j.xt r1 = r10.mi()
            java.lang.String r1 = r1.v()
            if (r11 == 0) goto L17c
            int r2 = r11.size()
            if (r2 != 0) goto L1d
            goto L17c
        L1d:
            if (r12 == 0) goto L17c
            int r2 = r12.size()
            if (r2 != 0) goto L27
            goto L17c
        L27:
            java.util.Iterator r11 = r11.iterator()
        L2b:
            boolean r2 = r11.hasNext()
            r3 = 1
            java.lang.String r4 = "TTMediationSDK"
            if (r2 == 0) goto L143
            java.lang.Object r2 = r11.next()
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.intValue()
            java.lang.Object r2 = r12.get(r2)
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L2b
            int r5 = r2.size()
            if (r5 == 0) goto L2b
            java.util.Iterator r5 = r2.iterator()
        L4f:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L2b
            java.lang.Object r6 = r5.next()
            com.bytedance.msdk.core.oq.oq r6 = (com.bytedance.msdk.core.oq.oq) r6
            if (r6 == 0) goto L4f
            boolean r7 = r6.r()
            if (r7 == 0) goto L8a
            com.bytedance.msdk.core.tl.qv r7 = com.bytedance.msdk.core.tl.qv.j()
            java.lang.String r8 = r6.w()
            boolean r7 = r7.cw(r1, r8)
            if (r7 != 0) goto L8a
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r1)
            r6.append(r7)
            java.lang.String r7 = "adn 请求触发次数拦截............"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r6)
            goto L4f
        L8a:
            boolean r7 = r6.r()
            if (r7 == 0) goto Lb7
            com.bytedance.msdk.core.tl.vl r7 = com.bytedance.msdk.core.tl.vl.j()
            java.lang.String r8 = r6.w()
            boolean r7 = r7.cw(r1, r8)
            if (r7 != 0) goto Lb7
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r1)
            r6.append(r7)
            java.lang.String r7 = "adn 请求触发时间间隔拦截............"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r6)
            goto L4f
        Lb7:
            com.bytedance.msdk.core.tl.ws r7 = com.bytedance.msdk.core.tl.ws.j()
            java.lang.String r8 = r6.i()
            boolean r7 = r7.j(r1, r8)
            if (r7 == 0) goto Lf1
            com.bytedance.msdk.core.tl.ws r7 = com.bytedance.msdk.core.tl.ws.j()
            java.lang.String r8 = r6.az()
            java.lang.String r9 = r6.w()
            com.bytedance.msdk.api.j r7 = r7.j(r1, r8, r9)
            if (r7 == 0) goto L11d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r1)
            r6.append(r7)
            java.lang.String r7 = "adn rit_level 请求触发了错误码拦截............"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r6)
            goto L4f
        Lf1:
            com.bytedance.msdk.core.tl.cw r7 = com.bytedance.msdk.core.tl.cw.j()
            java.lang.String r8 = r6.az()
            java.lang.String r9 = r6.w()
            com.bytedance.msdk.api.j r7 = r7.j(r8, r9)
            if (r7 == 0) goto L11d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = com.bytedance.msdk.j.up.up.j(r1)
            r6.append(r7)
            java.lang.String r7 = "adn 请求触发了错误码拦截............"
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r6)
            goto L4f
        L11d:
            int r7 = r2.size()
            j(r10, r6, r7)
            boolean r6 = r10.az()
            if (r6 == 0) goto L4f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = com.bytedance.msdk.j.up.up.j(r1)
            r10.append(r11)
            java.lang.String r11 = "回溯到了满足数量的广告.......有广告回调成功"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r10)
            return r3
        L143:
            java.util.concurrent.CopyOnWriteArrayList r11 = r10.ae()
            int r11 = r11.size()
            if (r11 > 0) goto L163
            java.util.concurrent.CopyOnWriteArrayList r11 = r10.tl()
            int r11 = r11.size()
            if (r11 > 0) goto L163
            java.util.concurrent.CopyOnWriteArrayList r10 = r10.oq()
            int r10 = r10.size()
            if (r10 <= 0) goto L162
            goto L163
        L162:
            return r0
        L163:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = com.bytedance.msdk.j.up.up.j(r1)
            r10.append(r11)
            java.lang.String r11 = "回溯到了广告.......有广告回调成功"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            com.bytedance.msdk.j.up.cw.j(r4, r10)
            return r3
        L17c:
            return r0
    }

    public static boolean xt(com.bytedance.msdk.core.oq.xt r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r3 = r3.wq()
            com.bytedance.msdk.core.ws.cw r1 = com.bytedance.msdk.core.xt.xt()
            java.util.Map r1 = r1.qb()
            if (r1 != 0) goto L13
            return r0
        L13:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.Object r3 = r1.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            r2 = 1
            if (r3 == 0) goto L28
            int r3 = r3.intValue()
            if (r3 != r2) goto L27
            return r2
        L27:
            return r0
        L28:
            java.lang.String r3 = "-1"
            java.lang.Object r3 = r1.get(r3)
            java.lang.Integer r3 = (java.lang.Integer) r3
            if (r3 == 0) goto L39
            int r3 = r3.intValue()
            if (r3 != r2) goto L39
            return r2
        L39:
            return r0
    }
}

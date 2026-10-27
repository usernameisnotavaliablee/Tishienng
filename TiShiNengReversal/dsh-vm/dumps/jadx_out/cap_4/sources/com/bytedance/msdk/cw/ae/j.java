package com.bytedance.msdk.cw.ae;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(com.bytedance.msdk.core.oq.xt r6, com.bytedance.msdk.cw.m.j.xt r7, java.util.List<com.bytedance.msdk.core.oq.oq> r8) {
            if (r6 == 0) goto L9d
            if (r7 == 0) goto L9d
            if (r8 == 0) goto L9d
            int r0 = r8.size()
            if (r0 != 0) goto Le
            goto L9d
        Le:
            java.util.concurrent.CopyOnWriteArrayList r0 = r7.tl()
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            java.lang.String r2 = "TTMediationSDK"
            if (r1 == 0) goto L7a
            java.lang.Object r1 = r0.next()
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            java.util.Iterator r3 = r8.iterator()
        L28:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L47
            java.lang.Object r4 = r3.next()
            com.bytedance.msdk.core.oq.oq r4 = (com.bytedance.msdk.core.oq.oq) r4
            if (r1 == 0) goto L28
            if (r4 == 0) goto L28
            java.lang.String r5 = r1.qa()
            java.lang.String r4 = r4.w()
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L28
            goto L16
        L47:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = com.bytedance.msdk.j.up.up.j(r6)
            r3.append(r4)
            java.lang.String r4 = "已经响应的广告: "
            r3.append(r4)
            java.lang.String r4 = r1.qa()
            r3.append(r4)
            java.lang.String r4 = "  没有在severBidding的waterFall列表中，需要被移除掉"
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.bytedance.msdk.j.up.cw.r(r2, r3)
            java.util.concurrent.CopyOnWriteArrayList r2 = r7.tl()
            r2.remove(r1)
            java.util.concurrent.CopyOnWriteArrayList r2 = r7.g()
            r2.add(r1)
            goto L16
        L7a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r6 = com.bytedance.msdk.j.up.up.j(r6)
            r8.append(r6)
            java.lang.String r6 = "已经响应的广告被serverBidding过滤完还剩: "
            r8.append(r6)
            java.util.concurrent.CopyOnWriteArrayList r6 = r7.tl()
            int r6 = r6.size()
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            com.bytedance.msdk.j.up.cw.r(r2, r6)
        L9d:
            return
    }

    public static boolean j(com.bytedance.msdk.cw.m.j.j r2, java.util.List<com.bytedance.msdk.core.oq.oq> r3, java.lang.String r4) {
            r0 = 0
            if (r3 == 0) goto L2f
            if (r2 == 0) goto L2f
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 == 0) goto Lc
            goto L2f
        Lc:
            int r2 = r2.xt()
            r1 = 1
            if (r2 != r1) goto L2f
            java.util.Iterator r2 = r3.iterator()
        L17:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r2.next()
            com.bytedance.msdk.core.oq.oq r3 = (com.bytedance.msdk.core.oq.oq) r3
            java.lang.String r3 = r3.w()
            boolean r3 = r4.equals(r3)
            if (r3 == 0) goto L17
            return r0
        L2e:
            return r1
        L2f:
            return r0
    }
}

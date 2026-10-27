package com.bytedance.msdk.cw.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    private static com.bytedance.msdk.xt.cw j(java.util.List<com.bytedance.msdk.xt.cw> r7) {
            r0 = 0
            if (r7 == 0) goto L2a
            int r1 = r7.size()
            if (r1 == 0) goto L2a
            java.util.Iterator r7 = r7.iterator()
        Ld:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L2a
            java.lang.Object r1 = r7.next()
            com.bytedance.msdk.xt.cw r1 = (com.bytedance.msdk.xt.cw) r1
            if (r0 != 0) goto L1d
        L1b:
            r0 = r1
            goto Ld
        L1d:
            long r2 = r1.sm()
            long r4 = r0.sm()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 >= 0) goto Ld
            goto L1b
        L2a:
            return r0
    }

    public static void j(com.bytedance.msdk.cw.m.j.xt r11, java.util.List<com.bytedance.msdk.xt.cw> r12, boolean r13) {
            if (r11 != 0) goto L3
            goto L49
        L3:
            com.bytedance.msdk.xt.cw r0 = j(r12)
            boolean r1 = r11.rn()
            if (r1 != 0) goto L49
            long r1 = android.os.SystemClock.elapsedRealtime()
            r11.cw(r1)
            boolean r1 = r11.v()
            r10 = 1
            r6 = r1 ^ 1
            com.bytedance.msdk.api.j.xt r1 = r11.mi()
            com.bytedance.msdk.core.oq.xt r2 = r11.vl()
            long r3 = r11.gq()
            long r7 = r11.la()
            long r3 = r3 - r7
            com.bytedance.msdk.core.oq.g r5 = r11.wq()
            java.lang.String r5 = r5.j
            if (r12 == 0) goto L3a
            int r12 = r12.size()
            r7 = r12
            goto L3c
        L3a:
            r12 = 0
            r7 = 0
        L3c:
            com.bytedance.msdk.core.oq.g r12 = r11.wq()
            boolean r8 = r12.up
            r9 = r13
            com.bytedance.msdk.up.m.j(r0, r1, r2, r3, r5, r6, r7, r8, r9)
            r11.r(r10)
        L49:
            return
    }
}

package com.bytedance.msdk.core.az;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.msdk.core.oq.xt j(com.bytedance.msdk.core.oq.xt r5, java.lang.String r6) {
            r0 = 0
            if (r5 == 0) goto Lda
            boolean r1 = android.text.TextUtils.isEmpty(r6)
            if (r1 == 0) goto Lb
            goto Lda
        Lb:
            java.util.List r1 = r5.ol()
            if (r1 == 0) goto Lda
            java.util.List r1 = r5.ol()
            int r1 = r1.size()
            if (r1 != 0) goto L1d
            goto Lda
        L1d:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.List r2 = r5.ol()
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L47
            java.lang.Object r3 = r2.next()
            com.bytedance.msdk.core.oq.oq r3 = (com.bytedance.msdk.core.oq.oq) r3
            java.lang.String r4 = r3.w()
            boolean r4 = r6.equals(r4)
            if (r4 == 0) goto L2a
            com.bytedance.msdk.core.oq.oq r6 = r3.up()
            r1.add(r6)
        L47:
            int r6 = r1.size()
            if (r6 != 0) goto L4e
            return r0
        L4e:
            r6 = 0
            java.lang.Object r0 = r1.get(r6)
            com.bytedance.msdk.core.oq.oq r0 = (com.bytedance.msdk.core.oq.oq) r0
            if (r0 == 0) goto L94
            boolean r2 = r0.h()
            if (r2 == 0) goto L94
            java.lang.String r0 = r0.az()
            java.lang.String r2 = "pangle"
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L94
            java.util.List r0 = r5.ol()
            java.util.Iterator r0 = r0.iterator()
        L71:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L94
            java.lang.Object r3 = r0.next()
            com.bytedance.msdk.core.oq.oq r3 = (com.bytedance.msdk.core.oq.oq) r3
            boolean r4 = r3.h()
            if (r4 == 0) goto L71
            java.lang.String r4 = r3.az()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L71
            com.bytedance.msdk.core.oq.oq r0 = r3.up()
            r1.add(r0)
        L94:
            com.bytedance.msdk.core.oq.xt r5 = r5.az()
            boolean r0 = r5.qv()
            if (r0 == 0) goto La2
            r5.xt(r1)
            goto La5
        La2:
            r5.j(r1)
        La5:
            java.lang.Object r0 = r1.get(r6)
            com.bytedance.msdk.core.oq.oq r0 = (com.bytedance.msdk.core.oq.oq) r0
            r0.up(r6)
            int r1 = r0.mi()
            if (r1 != 0) goto Lbb
            double r1 = r0.v()
            r5.r(r1)
        Lbb:
            int r1 = r0.mi()
            r2 = 2
            r3 = 1
            if (r1 != r2) goto Lc6
            r5.j(r3)
        Lc6:
            int r1 = r0.mi()
            if (r1 == r3) goto Ld3
            int r0 = r0.mi()
            r1 = 3
            if (r0 != r1) goto Ld6
        Ld3:
            r5.xt(r3)
        Ld6:
            r5.vl(r6)
            return r5
        Lda:
            return r0
    }

    public static java.lang.String j(java.lang.String r2) {
            r0 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L18
            if (r1 == 0) goto L8
            return r0
        L8:
            java.lang.String r1 = "gm_test_slot_"
            boolean r1 = r2.startsWith(r1)     // Catch: java.lang.Exception -> L18
            if (r1 != 0) goto L11
            return r0
        L11:
            r1 = 13
            java.lang.String r2 = r2.substring(r1)     // Catch: java.lang.Exception -> L18
            return r2
        L18:
            return r0
    }
}

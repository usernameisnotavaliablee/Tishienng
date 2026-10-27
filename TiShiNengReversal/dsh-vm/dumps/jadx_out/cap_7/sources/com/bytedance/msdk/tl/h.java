package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class h {
    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    public static void j(com.bytedance.msdk.xt.cw r5, com.bytedance.msdk.core.oq.oq r6, com.bytedance.msdk.api.j.xt r7, boolean r8) {
            if (r5 == 0) goto L76
            boolean r0 = r5.yl()
            if (r0 != 0) goto L9
            goto L76
        L9:
            r0 = 0
            if (r6 != 0) goto L10
            r5.j(r0)
        L10:
            java.lang.String r2 = r5.q()
            java.util.Map r3 = r6.p()
            boolean r4 = android.text.TextUtils.isEmpty(r2)
            if (r4 == 0) goto L35
            r2 = 40061(0x9c7d, float:5.6137E-41)
            if (r8 == 0) goto L2a
            java.lang.String r8 = com.bytedance.msdk.api.j.j(r2)
            com.bytedance.msdk.up.m.j(r6, r7, r5, r2, r8)
        L2a:
            java.lang.String r6 = com.bytedance.msdk.api.j.j(r2)
            r5.jy(r6)
            r5.j(r0)
            return
        L35:
            r4 = 40062(0x9c7e, float:5.6139E-41)
            if (r3 != 0) goto L4e
            if (r8 == 0) goto L43
            java.lang.String r8 = com.bytedance.msdk.api.j.j(r4)
            com.bytedance.msdk.up.m.j(r6, r7, r5, r4, r8)
        L43:
            java.lang.String r6 = com.bytedance.msdk.api.j.j(r4)
            r5.jy(r6)
            r5.j(r0)
            return
        L4e:
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L67
            if (r8 == 0) goto L63
            java.lang.String r8 = com.bytedance.msdk.api.j.j(r4)
            com.bytedance.msdk.up.m.j(r6, r7, r5, r4, r8)
        L63:
            r5.j(r0)
            return
        L67:
            java.lang.Double r6 = java.lang.Double.valueOf(r2)     // Catch: java.lang.Exception -> L73
            double r6 = r6.doubleValue()     // Catch: java.lang.Exception -> L73
            r5.j(r6)     // Catch: java.lang.Exception -> L73
            return
        L73:
            r5.j(r0)
        L76:
            return
    }
}

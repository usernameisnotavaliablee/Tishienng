package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class i1 {
    public i1() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r2) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "ansp_complain_%s"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    private static java.lang.String a(java.lang.String r2, java.lang.String r3) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    public static void a(android.content.Context r4, xyz.adscope.ad.a2 r5, long r6) {
            if (r5 == 0) goto L1d
            java.lang.String r0 = r5.getSpaceID()
            java.lang.String r5 = r5.getApiKey()
            r1 = 0
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 == 0) goto L1d
            java.lang.String r5 = a(r5)
            java.lang.String r1 = "c_ts_%s"
            java.lang.String r0 = a(r1, r0)
            xyz.adscope.ad.i0.b(r4, r5, r0, r6)
        L1d:
            return
    }

    public static boolean a(android.content.Context r4, xyz.adscope.ad.a2 r5, xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel r6) {
            r0 = 0
            if (r5 == 0) goto L3c
            if (r6 == 0) goto L3c
            java.lang.String r1 = r5.getSpaceID()
            java.lang.String r5 = r5.getApiKey()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L3c
            java.lang.String r5 = a(r5)
            java.lang.String r2 = "c_ts_%s"
            java.lang.String r1 = a(r2, r1)
            r2 = 0
            long r4 = xyz.adscope.ad.i0.a(r4, r5, r1, r2)
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 == 0) goto L3c
            long r1 = java.lang.System.currentTimeMillis()
            long r1 = r1 - r4
            xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.complain.ComplainModel r4 = r6.a()
            if (r4 == 0) goto L3c
            long r4 = r4.a()
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 <= 0) goto L3c
            r4 = 1
            return r4
        L3c:
            return r0
    }
}

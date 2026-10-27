package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class w6 {
    private final java.lang.String a;
    private final java.lang.String b;
    private final android.content.Context c;
    private final java.lang.String d;
    private long e;

    public w6(android.content.Context r2, java.lang.String r3) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "asnp_ad_%s_common"
            r1.a = r0
            java.lang.String r0 = "%s_unite"
            r1.b = r0
            r1.c = r2
            r1.d = r3
            return
    }

    private long a() {
            r5 = this;
            android.content.Context r0 = r5.c
            java.lang.String r1 = r5.d
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "asnp_ad_%s_common"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            java.lang.String r3 = r5.d
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r3
            java.lang.String r3 = "%s_unite"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            r3 = 0
            long r0 = xyz.adscope.ad.i0.a(r0, r1, r2, r3)
            return r0
    }

    public void a(long r6) {
            r5 = this;
            android.content.Context r0 = r5.c
            java.lang.String r1 = r5.d
            r2 = 1
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            r3[r4] = r1
            java.lang.String r1 = "asnp_ad_%s_common"
            java.lang.String r1 = java.lang.String.format(r1, r3)
            java.lang.String r3 = r5.d
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r4] = r3
            java.lang.String r3 = "%s_unite"
            java.lang.String r2 = java.lang.String.format(r3, r2)
            xyz.adscope.ad.i0.b(r0, r1, r2, r6)
            return
    }

    public boolean a(xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel r11) {
            r10 = this;
            xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.unite.UniteControlModel r11 = r11.e()
            r0 = 0
            if (r11 == 0) goto L33
            int r1 = r11.b()
            long r2 = r11.a()
            long r4 = r10.a()
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r4
            r8 = 0
            int r11 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r11 <= 0) goto L33
            int r11 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r11 <= 0) goto L33
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 >= 0) goto L33
            long r2 = (long) r1
            long r4 = r10.e
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 >= 0) goto L33
            r11 = 100
            if (r1 == r11) goto L33
            r11 = 1
            return r11
        L33:
            return r0
    }

    public void b(long r1) {
            r0 = this;
            r0.e = r1
            return
    }
}

package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class v6 {
    private final android.content.Context a;
    private final java.lang.String b;
    private final java.lang.String c;

    public v6(android.content.Context r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    private boolean a(long r5, java.util.LinkedList<xyz.adscope.ad.model.impl.db.StrategyEventDBModel> r7, int r8) {
            r4 = this;
            r0 = 0
            r2 = 0
            int r3 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r3 <= 0) goto L21
            int r0 = r7.size()
            int r0 = r0 - r8
            java.lang.Object r7 = r7.get(r0)
            xyz.adscope.ad.model.impl.db.StrategyEventDBModel r7 = (xyz.adscope.ad.model.impl.db.StrategyEventDBModel) r7
            long r7 = r7.b()
            long r7 = r7 + r5
            long r5 = java.lang.System.currentTimeMillis()
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L21
            r5 = 1
            return r5
        L21:
            return r2
    }

    private boolean a(long[] r7) {
            r6 = this;
            long r0 = java.lang.System.currentTimeMillis()
            r2 = 0
            r3 = r7[r2]
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 > 0) goto L13
            r3 = 1
            r4 = r7[r3]
            int r7 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r7 > 0) goto L13
            return r3
        L13:
            return r2
    }

    private boolean a(long[] r8, java.util.LinkedList<xyz.adscope.ad.model.impl.db.StrategyEventDBModel> r9) {
            r7 = this;
            java.lang.Object r9 = r9.getLast()
            xyz.adscope.ad.model.impl.db.StrategyEventDBModel r9 = (xyz.adscope.ad.model.impl.db.StrategyEventDBModel) r9
            r0 = 0
            if (r8 == 0) goto L1e
            int r1 = r8.length
            r2 = 1
            if (r1 <= r2) goto L1e
            boolean r1 = r7.a(r8)
            if (r1 == 0) goto L1e
            long r3 = r9.b()
            r5 = r8[r0]
            int r8 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r8 <= 0) goto L1e
            return r2
        L1e:
            return r0
    }

    public boolean a(xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel r7) {
            r6 = this;
            if (r7 == 0) goto L55
            java.util.List r7 = r7.b()
            if (r7 == 0) goto L55
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L55
            java.util.Iterator r7 = r7.iterator()
        L12:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L55
            java.lang.Object r0 = r7.next()
            xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.frequency.StrategyFrequencyModel r0 = (xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.frequency.StrategyFrequencyModel) r0
            xyz.adscope.ad.k0 r1 = xyz.adscope.ad.k0.a()
            android.content.Context r2 = r6.a
            java.lang.Object r1 = r1.getOrCreateImplement(r2)
            xyz.adscope.ad.j0 r1 = (xyz.adscope.ad.j0) r1
            java.lang.String r2 = r6.c
            java.lang.String r3 = r0.b()
            java.util.LinkedList r1 = r1.b(r2, r3)
            long r2 = r0.c()
            long[] r4 = r0.a()
            int r0 = r0.getCount()
            if (r1 == 0) goto L12
            int r5 = r1.size()
            if (r5 < r0) goto L12
            boolean r7 = r6.a(r2, r1, r0)
            if (r7 == 0) goto L50
            r7 = 1
            return r7
        L50:
            boolean r7 = r6.a(r4, r1)
            return r7
        L55:
            r7 = 0
            return r7
    }
}

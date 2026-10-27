package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class u6 {
    private long a;

    public u6() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.a = r0
            return
    }

    public void a(long r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public boolean a(xyz.adscope.ad.model.impl.resp.cfg.root.strategy.filter.StrategyFilterModel r6) {
            r5 = this;
            r0 = 0
            if (r6 == 0) goto L10
            long r1 = r5.a
            int r6 = r6.c()
            long r3 = (long) r6
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 > 0) goto L10
            r6 = 1
            return r6
        L10:
            return r0
    }
}

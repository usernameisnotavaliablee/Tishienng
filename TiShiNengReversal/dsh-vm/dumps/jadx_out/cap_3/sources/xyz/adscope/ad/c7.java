package xyz.adscope.ad;

import xyz.adscope.ad.a2;
import xyz.adscope.ad.publish.ad.unified.IUnifiedAdListener;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class c7<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.unified.IUnifiedAdListener> extends xyz.adscope.ad.b2<C, L> {
    c7(android.content.Context r1, C r2, xyz.adscope.ad.c r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // xyz.adscope.ad.b2
    protected void a(java.util.List<xyz.adscope.ad.s3> r5) {
            r4 = this;
            r0 = 1
            r4.d = r0
            xyz.adscope.ad.d2 r0 = r4.c()
            xyz.adscope.ad.publish.ad.unified.IUnifiedAdListener r0 = (xyz.adscope.ad.publish.ad.unified.IUnifiedAdListener) r0
            if (r0 == 0) goto L2c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        L14:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L29
            java.lang.Object r2 = r5.next()
            xyz.adscope.ad.s3 r2 = (xyz.adscope.ad.s3) r2
            xyz.adscope.ad.d7 r3 = new xyz.adscope.ad.d7
            r3.<init>(r2)
            r1.add(r3)
            goto L14
        L29:
            r0.onAdLoaded(r1)
        L2c:
            return
    }
}

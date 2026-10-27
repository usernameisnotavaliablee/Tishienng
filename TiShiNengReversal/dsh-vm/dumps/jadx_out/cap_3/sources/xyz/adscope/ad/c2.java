package xyz.adscope.ad;

import xyz.adscope.ad.a2;
import xyz.adscope.ad.d2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class c2<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.d2> {
    protected android.content.Context a;
    protected C b;
    private final xyz.adscope.ad.b2<C, L> c;

    public c2(android.content.Context r2, C r3) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            r1.b = r3
            xyz.adscope.ad.c r0 = r1.b()
            xyz.adscope.ad.b2 r2 = xyz.adscope.ad.b2.b.a(r0, r2, r3)
            r1.c = r2
            return
    }

    protected xyz.adscope.ad.b2<C, L> a() {
            r1 = this;
            xyz.adscope.ad.b2<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.d2> r0 = r1.c
            return r0
    }

    protected void a(L r2) {
            r1 = this;
            xyz.adscope.ad.b2<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.d2> r0 = r1.c
            r0.a(r2)
            xyz.adscope.ad.b2<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.d2> r2 = r1.c
            r2.h()
            return
    }

    protected abstract xyz.adscope.ad.c b();

    protected java.lang.String getRequestSessionID() {
            r1 = this;
            xyz.adscope.ad.b2<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.d2> r0 = r1.c
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.d()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }
}

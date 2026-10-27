package xyz.adscope.ad;

import xyz.adscope.ad.a2;
import xyz.adscope.ad.publish.ad.IAdListener;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class v3<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> extends xyz.adscope.ad.t2<C, L> {
    private xyz.adscope.ad.v3.b<C, L> f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> extends xyz.adscope.common.v2.handle.WeakReferenceHandler {
        private xyz.adscope.ad.v3<C, L> a;

        private b(android.content.Context r1, xyz.adscope.ad.v3<C, L> r2) {
                r0 = this;
                r0.<init>(r1)
                r0.a = r2
                return
        }

        /* synthetic */ b(android.content.Context r1, xyz.adscope.ad.v3 r2, xyz.adscope.ad.v3.a r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private void a() {
                r1 = this;
                r0 = 1
                r1.removeMessages(r0)
                r0 = 0
                r1.a = r0
                return
        }

        static /* synthetic */ void a(xyz.adscope.ad.v3.b r0) {
                r0.a()
                return
        }

        @Override // xyz.adscope.common.v2.handle.WeakReferenceHandler
        public void scopeHandleMessage(android.os.Message r3) {
                r2 = this;
                int r0 = r3.what
                r1 = 1
                if (r0 != r1) goto L10
                xyz.adscope.ad.v3<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r2.a
                if (r0 == 0) goto L10
                java.lang.Object r3 = r3.obj
                xyz.adscope.ad.publish.ad.IAdListener r3 = (xyz.adscope.ad.publish.ad.IAdListener) r3
                r0.a(r3)
            L10:
                return
        }
    }

    public v3(android.content.Context r2, C r3) {
            r1 = this;
            r1.<init>(r2, r3)
            xyz.adscope.ad.v3$b r3 = new xyz.adscope.ad.v3$b
            r0 = 0
            r3.<init>(r2, r1, r0)
            r1.f = r3
            return
    }

    private void a(L r3, long r4) {
            r2 = this;
            xyz.adscope.ad.v3$b<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r2.f
            if (r0 == 0) goto L13
            r1 = 1
            r0.removeMessages(r1)
            xyz.adscope.ad.v3$b<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r2.f
            android.os.Message r3 = r0.obtainMessage(r1, r3)
            xyz.adscope.ad.v3$b<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r2.f
            r0.sendMessageDelayed(r3, r4)
        L13:
            return
    }

    protected void a(L r1) {
            r0 = this;
            r0.refresh(r1)
            return
    }

    @Override // xyz.adscope.ad.s2
    public void destroyAd() {
            r1 = this;
            super.destroyAd()
            xyz.adscope.ad.v3$b<C extends xyz.adscope.ad.a2, L extends xyz.adscope.ad.publish.ad.IAdListener> r0 = r1.f
            if (r0 == 0) goto Ld
            xyz.adscope.ad.v3.b.a(r0)
            r0 = 0
            r1.f = r0
        Ld:
            return
    }

    public /* bridge */ /* synthetic */ void refresh(xyz.adscope.ad.d2 r1) {
            r0 = this;
            xyz.adscope.ad.publish.ad.IAdListener r1 = (xyz.adscope.ad.publish.ad.IAdListener) r1
            r0.refresh(r1)
            return
    }

    public void refresh(L r6) {
            r5 = this;
            C extends xyz.adscope.ad.a2 r0 = r5.b
            boolean r1 = r0 instanceof xyz.adscope.ad.u3
            if (r1 == 0) goto L21
            xyz.adscope.ad.u3 r0 = (xyz.adscope.ad.u3) r0
            long r0 = r0.getIntervalMillion()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L1d
            r2 = 10000(0x2710, double:4.9407E-320)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L19
            r0 = r2
        L19:
            r5.a(r6, r0)
            return
        L1d:
            super.a(r6)
            return
        L21:
            super.a(r6)
            return
    }
}

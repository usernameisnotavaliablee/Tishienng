package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class z1 implements xyz.adscope.ad.w2, xyz.adscope.ad.k2 {
    protected xyz.adscope.ad.x1 a;
    protected java.lang.String b;
    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel c;
    protected xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel d;
    protected android.content.Context e;

    public z1() {
            r0 = this;
            r0.<init>()
            return
    }

    protected xyz.adscope.ad.x1 a() {
            r1 = this;
            xyz.adscope.ad.x1 r0 = new xyz.adscope.ad.x1
            r0.<init>()
            return r0
    }

    @Override // xyz.adscope.ad.w2
    public void a(android.content.Context r1, java.lang.String r2, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r3) {
            r0 = this;
            r0.e = r1
            xyz.adscope.ad.x1 r1 = r0.a()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            if (r3 == 0) goto L13
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.nativ.NativeModel r1 = r3.d()
            goto L14
        L13:
            r1 = 0
        L14:
            r0.d = r1
            return
    }

    @Override // xyz.adscope.ad.k2
    public xyz.adscope.ad.j2 c() {
            r1 = this;
            xyz.adscope.ad.x1 r0 = r1.a
            return r0
    }
}

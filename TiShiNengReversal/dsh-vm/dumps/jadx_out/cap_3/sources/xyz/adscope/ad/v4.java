package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class v4 implements xyz.adscope.ad.s3 {
    private final android.content.Context a;
    private final xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel b;
    private final xyz.adscope.ad.a2 c;
    private final xyz.adscope.ad.b1 d;

    v4(android.content.Context r1, xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r2, xyz.adscope.ad.a2 r3, xyz.adscope.ad.b1 r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // xyz.adscope.ad.s3
    public xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel a() {
            r1 = this;
            xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.BidModel r0 = r1.b
            return r0
    }

    @Override // xyz.adscope.ad.s3
    public xyz.adscope.ad.a2 b() {
            r1 = this;
            xyz.adscope.ad.a2 r0 = r1.c
            return r0
    }

    @Override // xyz.adscope.ad.s3
    public xyz.adscope.ad.b1 c() {
            r1 = this;
            xyz.adscope.ad.b1 r0 = r1.d
            return r0
    }

    @Override // xyz.adscope.ad.s3
    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.a
            return r0
    }
}

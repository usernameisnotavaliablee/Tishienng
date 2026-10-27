package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class b0 implements xyz.adscope.ad.v1 {
    private final android.content.Context a;
    private final java.util.Map<java.lang.String, xyz.adscope.ad.t4> b;

    b0(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            android.content.Context r1 = r1.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            r0.a = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r0.b = r1
            return
    }

    @Override // xyz.adscope.ad.v1
    public void a(xyz.adscope.ad.l2 r2, xyz.adscope.ad.b1 r3, java.lang.String r4) {
            r1 = this;
            java.util.Map<java.lang.String, xyz.adscope.ad.t4> r0 = r1.b
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L19
            java.util.Map<java.lang.String, xyz.adscope.ad.t4> r0 = r1.b
            java.lang.Object r4 = r0.get(r4)
            xyz.adscope.ad.t4 r4 = (xyz.adscope.ad.t4) r4
            boolean r0 = r4.a()
            if (r0 == 0) goto L19
            r4.a(r2, r3)
        L19:
            return
    }

    @Override // xyz.adscope.ad.v1
    public void a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.ad.display.DisplayModel r4) {
            r3 = this;
            if (r4 == 0) goto L23
            java.lang.String r0 = r4.f()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L23
            java.util.Map<java.lang.String, xyz.adscope.ad.t4> r1 = r3.b
            boolean r1 = r1.containsKey(r0)
            if (r1 != 0) goto L23
            xyz.adscope.ad.t4 r1 = new xyz.adscope.ad.t4
            android.content.Context r2 = r3.a
            r1.<init>(r2)
            r1.a(r4)
            java.util.Map<java.lang.String, xyz.adscope.ad.t4> r4 = r3.b
            r4.put(r0, r1)
        L23:
            return
    }
}

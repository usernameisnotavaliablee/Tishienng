package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface w3 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        public static xyz.adscope.ad.w3 a(android.content.Context r2, xyz.adscope.ad.a2 r3) {
                xyz.adscope.ad.c r0 = r3.getAdType()
                xyz.adscope.ad.c r1 = xyz.adscope.ad.c.e
                if (r0 != r1) goto Le
                xyz.adscope.ad.j6 r0 = new xyz.adscope.ad.j6
                r0.<init>(r2, r3)
                return r0
            Le:
                xyz.adscope.ad.h6 r0 = new xyz.adscope.ad.h6
                r0.<init>(r2, r3)
                return r0
        }
    }

    void a();

    boolean a(xyz.adscope.ad.model.impl.resp.ad.resp.seatbid.bid.media.MediaModel r1);

    void b();

    android.view.View getExpressView();
}

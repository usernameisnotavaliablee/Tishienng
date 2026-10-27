package xyz.adscope.ad;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class g0 implements xyz.adscope.ad.w1 {
    private final xyz.adscope.common.v2.conn.IBaseSimpleRequest a;

    g0(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.v2.conn.IBaseSimpleRequest r0 = new xyz.adscope.common.v2.conn.IBaseSimpleRequest
            r1 = 1
            r0.<init>(r3, r1)
            r2.a = r0
            return
    }

    @Override // xyz.adscope.ad.w1
    public void a(java.lang.String r2, java.lang.String r3, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r4) {
            r1 = this;
            xyz.adscope.common.v2.conn.IBaseSimpleRequest r0 = r1.a
            r0.requestWithPostMethod(r2, r3, r4)
            return
    }

    @Override // xyz.adscope.ad.w1
    public void a(java.lang.String r2, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r3) {
            r1 = this;
            xyz.adscope.common.v2.conn.IBaseSimpleRequest r0 = r1.a
            r0.requestWithGetMethod(r2, r3)
            return
    }
}

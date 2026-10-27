package xyz.adscope.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class h {
    private final xyz.adscope.common.h.a a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a extends xyz.adscope.common.v2.conn.IBaseEncryptRequest {
        public a(android.content.Context r1, boolean r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    h(android.content.Context r3) {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.h$a r0 = new xyz.adscope.common.h$a
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            r1 = 1
            r0.<init>(r3, r1)
            r2.a = r0
            return
    }

    void a(java.lang.String r2, java.lang.String r3, byte[] r4, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r5) {
            r1 = this;
            xyz.adscope.common.h$a r0 = r1.a
            r0.setEncryptPatten(r3)
            xyz.adscope.common.h$a r3 = r1.a
            r3.requestWithStreamMethod(r2, r4, r5)
            return
    }
}

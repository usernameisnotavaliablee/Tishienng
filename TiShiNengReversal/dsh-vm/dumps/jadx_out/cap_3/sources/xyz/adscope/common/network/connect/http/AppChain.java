package xyz.adscope.common.network.connect.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class AppChain implements xyz.adscope.common.network.connect.http.Chain {
    private final java.util.List<xyz.adscope.common.network.connect.Interceptor> a;
    private final int b;
    private final xyz.adscope.common.network.Request c;
    private xyz.adscope.common.network.connect.http.Call d;

    AppChain(java.util.List<xyz.adscope.common.network.connect.Interceptor> r1, int r2, xyz.adscope.common.network.Request r3, xyz.adscope.common.network.connect.http.Call r4) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            return
    }

    @Override // xyz.adscope.common.network.connect.http.Chain
    public xyz.adscope.common.network.connect.http.Call call() {
            r1 = this;
            xyz.adscope.common.network.connect.http.Call r0 = r1.d
            return r0
    }

    @Override // xyz.adscope.common.network.connect.http.Chain
    public xyz.adscope.common.network.connect.http.Call newCall() {
            r1 = this;
            xyz.adscope.common.network.connect.http.Call r0 = r1.d
            return r0
    }

    @Override // xyz.adscope.common.network.connect.http.Chain
    public xyz.adscope.common.network.Response proceed(xyz.adscope.common.network.Request r6) {
            r5 = this;
            java.util.List<xyz.adscope.common.network.connect.Interceptor> r0 = r5.a
            int r1 = r5.b
            java.lang.Object r0 = r0.get(r1)
            xyz.adscope.common.network.connect.Interceptor r0 = (xyz.adscope.common.network.connect.Interceptor) r0
            xyz.adscope.common.network.connect.http.AppChain r1 = new xyz.adscope.common.network.connect.http.AppChain
            java.util.List<xyz.adscope.common.network.connect.Interceptor> r2 = r5.a
            int r3 = r5.b
            int r3 = r3 + 1
            xyz.adscope.common.network.connect.http.Call r4 = r5.d
            r1.<init>(r2, r3, r6, r4)
            xyz.adscope.common.network.Response r6 = r0.intercept(r1)
            return r6
    }

    @Override // xyz.adscope.common.network.connect.http.Chain
    public xyz.adscope.common.network.Request request() {
            r1 = this;
            xyz.adscope.common.network.Request r0 = r1.c
            return r0
    }
}

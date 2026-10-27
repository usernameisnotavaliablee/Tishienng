package xyz.adscope.common.network.simple;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
final class UrlWorker<S, F> extends xyz.adscope.common.network.simple.BasicWorker<xyz.adscope.common.network.simple.SimpleUrlRequest, S, F> {
    private xyz.adscope.common.network.connect.http.Call g;

    UrlWorker(xyz.adscope.common.network.simple.SimpleUrlRequest r1, java.lang.reflect.Type r2, java.lang.reflect.Type r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    @Override // xyz.adscope.common.network.simple.BasicWorker
    protected /* bridge */ /* synthetic */ xyz.adscope.common.network.Response a(xyz.adscope.common.network.simple.SimpleUrlRequest r1) {
            r0 = this;
            xyz.adscope.common.network.simple.SimpleUrlRequest r1 = (xyz.adscope.common.network.simple.SimpleUrlRequest) r1
            xyz.adscope.common.network.Response r1 = r0.a2(r1)
            return r1
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    protected xyz.adscope.common.network.Response a2(xyz.adscope.common.network.simple.SimpleUrlRequest r2) {
            r1 = this;
            xyz.adscope.common.network.connect.http.Call r0 = new xyz.adscope.common.network.connect.http.Call
            r0.<init>(r2)
            r1.g = r0
            xyz.adscope.common.network.Response r2 = r0.execute()
            return r2
    }

    @Override // xyz.adscope.common.network.simple.BasicWorker
    public void cancel() {
            r1 = this;
            xyz.adscope.common.network.connect.http.Call r0 = r1.g
            if (r0 == 0) goto Lf
            boolean r0 = r0.isCanceled()
            if (r0 != 0) goto Lf
            xyz.adscope.common.network.connect.http.Call r0 = r1.g
            r0.asyncCancel()
        Lf:
            return
    }
}

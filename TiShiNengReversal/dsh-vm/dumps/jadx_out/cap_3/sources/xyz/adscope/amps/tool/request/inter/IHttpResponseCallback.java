package xyz.adscope.amps.tool.request.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public abstract class IHttpResponseCallback<T> extends xyz.adscope.common.network.simple.SimpleCallback<T> {
    public IHttpResponseCallback() {
            r0 = this;
            r0.<init>()
            return
    }

    public abstract void failCallback(java.lang.String r1, int r2);

    @Override // xyz.adscope.common.network.simple.SimpleCallback, xyz.adscope.common.network.simple.Callback
    public void onException(java.lang.Exception r2) {
            r1 = this;
            r0 = 1100001(0x10c8e1, float:1.54143E-39)
            if (r2 == 0) goto Ld
            java.lang.String r2 = r2.getMessage()
            r1.failCallback(r2, r0)
            return
        Ld:
            java.lang.String r2 = "network request error"
            r1.failCallback(r2, r0)
            return
    }

    @Override // xyz.adscope.common.network.simple.Callback
    public void onResponse(xyz.adscope.common.network.simple.SimpleResponse<T, java.lang.String> r2) {
            r1 = this;
            boolean r0 = r2.isSucceed()
            if (r0 == 0) goto Le
            java.lang.Object r2 = r2.succeed()
            r1.successCallback(r2)
            return
        Le:
            java.lang.Object r0 = r2.failed()
            java.lang.String r0 = (java.lang.String) r0
            int r2 = r2.code()
            r1.failCallback(r0, r2)
            return
    }

    public abstract void successCallback(T r1);
}

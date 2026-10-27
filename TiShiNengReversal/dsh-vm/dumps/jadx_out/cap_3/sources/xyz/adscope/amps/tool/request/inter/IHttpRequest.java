package xyz.adscope.amps.tool.request.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IHttpRequest<T> {
    void doRequestWithJson(java.lang.String r1, java.lang.String r2, xyz.adscope.amps.tool.request.inter.IHttpResponseCallback<T> r3);

    void requestWithGetMethod(java.lang.String r1, xyz.adscope.amps.tool.request.inter.IHttpResponseCallback r2);

    void requestWithPostMethod(java.lang.String r1, java.lang.String r2, xyz.adscope.amps.tool.request.inter.IHttpResponseCallback r3);
}

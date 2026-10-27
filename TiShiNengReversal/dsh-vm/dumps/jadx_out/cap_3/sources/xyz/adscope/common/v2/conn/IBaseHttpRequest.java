package xyz.adscope.common.v2.conn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IBaseHttpRequest {
    void requestWithGetMethod(java.lang.String r1, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r2);

    void requestWithPostMethod(java.lang.String r1, java.lang.String r2, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r3);

    void requestWithStreamMethod(java.lang.String r1, byte[] r2, xyz.adscope.common.v2.conn.IBaseHttpResponseCallback r3);
}

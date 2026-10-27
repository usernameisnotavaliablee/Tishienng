package xyz.adscope.common.network.connect.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface Chain {
    xyz.adscope.common.network.connect.http.Call call();

    @java.lang.Deprecated
    xyz.adscope.common.network.connect.http.Call newCall();

    xyz.adscope.common.network.Response proceed(xyz.adscope.common.network.Request r1);

    xyz.adscope.common.network.Request request();
}

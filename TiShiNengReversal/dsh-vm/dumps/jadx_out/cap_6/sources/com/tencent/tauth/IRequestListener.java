package com.tencent.tauth;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface IRequestListener {
    void onComplete(org.json.JSONObject r1);

    void onHttpStatusException(com.tencent.open.utils.HttpUtils.HttpStatusException r1);

    void onIOException(java.io.IOException r1);

    void onJSONException(org.json.JSONException r1);

    void onMalformedURLException(java.net.MalformedURLException r1);

    void onNetworkUnavailableException(com.tencent.open.utils.HttpUtils.NetworkUnavailableException r1);

    void onSocketTimeoutException(java.net.SocketTimeoutException r1);

    void onUnknowException(java.lang.Exception r1);
}

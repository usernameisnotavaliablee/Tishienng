package com.tencent.mm.opensdk.openapi;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface IWXAPI {
    void detach();

    int getWXAppSupportAPI();

    boolean handleIntent(android.content.Intent r1, com.tencent.mm.opensdk.openapi.IWXAPIEventHandler r2);

    boolean isWXAppInstalled();

    boolean openWXApp();

    boolean registerApp(java.lang.String r1);

    boolean registerApp(java.lang.String r1, long r2);

    boolean sendReq(com.tencent.mm.opensdk.modelbase.BaseReq r1);

    boolean sendResp(com.tencent.mm.opensdk.modelbase.BaseResp r1);

    void setLogImpl(com.tencent.mm.opensdk.utils.ILog r1);

    void unregisterApp();
}

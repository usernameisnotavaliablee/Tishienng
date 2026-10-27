package com.umeng.socialize.weixin.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class WXCallbackActivity extends android.app.Activity implements com.tencent.mm.opensdk.openapi.IWXAPIEventHandler {
    private final java.lang.String TAG;
    protected com.umeng.socialize.handler.UMWXHandler mWxHandler;

    public WXCallbackActivity() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "WXCallbackActivity"
            r1.TAG = r0
            r0 = 0
            r1.mWxHandler = r0
            return
    }

    protected void handleIntent(android.content.Intent r2) {
            r1 = this;
            com.umeng.socialize.handler.UMWXHandler r0 = r1.mWxHandler
            com.tencent.mm.opensdk.openapi.IWXAPI r0 = r0.getWXApi()
            r0.handleIntent(r2, r1)
            return
    }

    @Override // android.app.Activity
    protected void onCreate(android.os.Bundle r3) {
            r2 = this;
            super.onCreate(r3)
            java.lang.String r3 = "WXCallbackActivity onCreate"
            com.umeng.socialize.utils.SLog.I(r3)
            android.content.Context r3 = r2.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            com.umeng.socialize.UMShareAPI r3 = com.umeng.socialize.UMShareAPI.get(r3)
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            com.umeng.socialize.handler.UMSSOHandler r3 = r3.getHandler(r0)
            com.umeng.socialize.handler.UMWXHandler r3 = (com.umeng.socialize.handler.UMWXHandler) r3
            r2.mWxHandler = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = "WXCallbackActivity mWxHandler："
            r3.append(r1)
            com.umeng.socialize.handler.UMWXHandler r1 = r2.mWxHandler
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.umeng.socialize.utils.SLog.I(r3)
            com.umeng.socialize.handler.UMWXHandler r3 = r2.mWxHandler
            android.content.Context r1 = r2.getApplicationContext()
            android.content.Context r1 = com.stub.StubApp.getOrigApplicationContext(r1)
            com.umeng.socialize.PlatformConfig$Platform r0 = com.umeng.socialize.PlatformConfig.getPlatform(r0)
            r3.onCreate(r1, r0)
            android.content.Intent r3 = r2.getIntent()
            r2.handleIntent(r3)
            return
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r4) {
            r3 = this;
            super.onNewIntent(r4)
            java.lang.String r0 = "WXCallbackActivity onNewIntent"
            com.umeng.socialize.utils.SLog.I(r0)
            r3.setIntent(r4)
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            com.umeng.socialize.handler.UMSSOHandler r0 = r0.getHandler(r1)
            com.umeng.socialize.handler.UMWXHandler r0 = (com.umeng.socialize.handler.UMWXHandler) r0
            r3.mWxHandler = r0
            android.content.Context r2 = r3.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.umeng.socialize.PlatformConfig$Platform r1 = com.umeng.socialize.PlatformConfig.getPlatform(r1)
            r0.onCreate(r2, r1)
            r3.handleIntent(r4)
            return
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onReq(com.tencent.mm.opensdk.modelbase.BaseReq r2) {
            r1 = this;
            com.umeng.socialize.handler.UMWXHandler r0 = r1.mWxHandler
            if (r0 == 0) goto Lb
            com.tencent.mm.opensdk.openapi.IWXAPIEventHandler r0 = r0.getWXEventHandler()
            r0.onReq(r2)
        Lb:
            r1.finish()
            return
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPIEventHandler
    public void onResp(com.tencent.mm.opensdk.modelbase.BaseResp r2) {
            r1 = this;
            java.lang.String r0 = "WXCallbackActivity 分发回调"
            com.umeng.socialize.utils.SLog.I(r0)
            com.umeng.socialize.handler.UMWXHandler r0 = r1.mWxHandler
            if (r0 == 0) goto L17
            if (r2 == 0) goto L17
            com.tencent.mm.opensdk.openapi.IWXAPIEventHandler r0 = r0.getWXEventHandler()     // Catch: java.lang.Exception -> L13
            r0.onResp(r2)     // Catch: java.lang.Exception -> L13
            goto L17
        L13:
            r2 = move-exception
            com.umeng.socialize.utils.SLog.error(r2)
        L17:
            r1.finish()
            return
    }
}

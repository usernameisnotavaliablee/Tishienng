package com.bxkj.student.wxapi;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class WXEntryActivity extends android.app.Activity implements com.tencent.mm.opensdk.openapi.IWXAPIEventHandler {
    private com.umeng.socialize.handler.UMWXHandler a;

    static {
            r0 = 18418(0x47f2, float:2.5809E-41)
            com.stub.StubApp.interface11(r0)
            return
    }

    public WXEntryActivity() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            return
    }

    private void a(android.content.Intent r2) {
            r1 = this;
            com.umeng.socialize.handler.UMWXHandler r0 = r1.a
            com.tencent.mm.opensdk.openapi.IWXAPI r0 = r0.getWXApi()
            r0.handleIntent(r2, r1)
            return
    }

    @Override // android.app.Activity
    protected native void onCreate(android.os.Bundle r1);

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent r4) {
            r3 = this;
            super.onNewIntent(r4)
            r3.setIntent(r4)
            android.content.Context r0 = r3.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            com.umeng.socialize.UMShareAPI r0 = com.umeng.socialize.UMShareAPI.get(r0)
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            com.umeng.socialize.handler.UMSSOHandler r0 = r0.getHandler(r1)
            com.umeng.socialize.handler.UMWXHandler r0 = (com.umeng.socialize.handler.UMWXHandler) r0
            r3.a = r0
            android.content.Context r2 = r3.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            com.umeng.socialize.PlatformConfig$Platform r1 = com.umeng.socialize.PlatformConfig.getPlatform(r1)
            r0.onCreate(r2, r1)
            r3.a(r4)
            return
    }

    public void onReq(com.tencent.mm.opensdk.modelbase.BaseReq r2) {
            r1 = this;
            com.umeng.socialize.handler.UMWXHandler r0 = r1.a
            if (r0 == 0) goto Lb
            com.tencent.mm.opensdk.openapi.IWXAPIEventHandler r0 = r0.getWXEventHandler()
            r0.onReq(r2)
        Lb:
            r1.finish()
            return
    }

    public void onResp(com.tencent.mm.opensdk.modelbase.BaseResp r3) {
            r2 = this;
            java.lang.String r0 = "WXCallbackActivity 分发回调"
            com.umeng.socialize.utils.SLog.I(r0)
            int r0 = r3.getType()
            r1 = 19
            if (r0 != r1) goto L10
            r0 = r3
            com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Resp r0 = (com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram.Resp) r0
        L10:
            com.umeng.socialize.handler.UMWXHandler r0 = r2.a
            if (r0 == 0) goto L20
            com.tencent.mm.opensdk.openapi.IWXAPIEventHandler r0 = r0.getWXEventHandler()     // Catch: java.lang.Exception -> L1c
            r0.onResp(r3)     // Catch: java.lang.Exception -> L1c
            goto L20
        L1c:
            r3 = move-exception
            com.umeng.socialize.utils.SLog.error(r3)
        L20:
            r2.finish()
            return
    }
}

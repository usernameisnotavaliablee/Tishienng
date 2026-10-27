package com.umeng.socialize.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QZoneSsoHandler extends com.umeng.socialize.handler.UMTencentSSOHandler {
    private static final java.lang.String TAG = "QZoneSsoHandler";
    private com.umeng.socialize.media.QZoneShareContent mShareContent;
    private com.umeng.socialize.handler.QQPreferences qqPreferences;








    public QZoneSsoHandler() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ com.umeng.socialize.handler.QQPreferences access$000(com.umeng.socialize.handler.QZoneSsoHandler r0) {
            com.umeng.socialize.handler.QQPreferences r0 = r0.qqPreferences
            return r0
    }

    static /* synthetic */ void access$100(com.umeng.socialize.handler.QZoneSsoHandler r0, org.json.JSONObject r1) {
            r0.initOpenidAndToken(r1)
            return
    }

    static /* synthetic */ com.tencent.tauth.IUiListener access$200(com.umeng.socialize.handler.QZoneSsoHandler r0, com.umeng.socialize.UMShareListener r1) {
            com.tencent.tauth.IUiListener r0 = r0.getmShareListener(r1)
            return r0
    }

    private void defaultQZoneShare(android.os.Bundle r2) {
            r1 = this;
            if (r2 == 0) goto La
            com.umeng.socialize.handler.QZoneSsoHandler$7 r0 = new com.umeng.socialize.handler.QZoneSsoHandler$7
            r0.<init>(r1, r2)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
        La:
            return
    }

    private void doPublishToQzone(android.os.Bundle r2) {
            r1 = this;
            if (r2 == 0) goto La
            com.umeng.socialize.handler.QZoneSsoHandler$6 r0 = new com.umeng.socialize.handler.QZoneSsoHandler$6
            r0.<init>(r1, r2)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
        La:
            return
    }

    private com.tencent.tauth.IUiListener getAuthlistener(com.umeng.socialize.UMAuthListener r1) {
            r0 = this;
            com.umeng.socialize.handler.QZoneSsoHandler$4 r1 = new com.umeng.socialize.handler.QZoneSsoHandler$4
            r1.<init>(r0)
            return r1
    }

    private com.tencent.tauth.IUiListener getmShareListener(com.umeng.socialize.UMShareListener r2) {
            r1 = this;
            com.umeng.socialize.handler.QZoneSsoHandler$5 r0 = new com.umeng.socialize.handler.QZoneSsoHandler$5
            r0.<init>(r1, r2)
            return r0
    }

    private void initOpenidAndToken(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "access_token"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L2f
            java.lang.String r1 = "expires_in"
            java.lang.String r1 = r4.getString(r1)     // Catch: java.lang.Exception -> L2f
            java.lang.String r2 = "openid"
            java.lang.String r4 = r4.getString(r2)     // Catch: java.lang.Exception -> L2f
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L2f
            if (r2 != 0) goto L31
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L2f
            if (r2 != 0) goto L31
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L2f
            if (r2 != 0) goto L31
            com.tencent.tauth.Tencent r2 = r3.mTencent     // Catch: java.lang.Exception -> L2f
            r2.setAccessToken(r0, r1)     // Catch: java.lang.Exception -> L2f
            com.tencent.tauth.Tencent r0 = r3.mTencent     // Catch: java.lang.Exception -> L2f
            r0.setOpenId(r4)     // Catch: java.lang.Exception -> L2f
            return
        L2f:
            r4 = move-exception
            goto L32
        L31:
            return
        L32:
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.QQ.OPENIDANDTOKEN
            com.umeng.socialize.utils.SLog.error(r0, r4)
            return
    }

    private boolean isInstall(com.umeng.socialize.PlatformConfig.Platform r2) {
            r1 = this;
            java.lang.ref.WeakReference<android.app.Activity> r2 = r1.mWeakAct
            java.lang.Object r2 = r2.get()
            if (r2 == 0) goto L28
            java.lang.ref.WeakReference<android.app.Activity> r2 = r1.mWeakAct
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            boolean r2 = r2.isFinishing()
            if (r2 != 0) goto L28
            com.tencent.tauth.Tencent r2 = r1.mTencent
            java.lang.ref.WeakReference<android.app.Activity> r0 = r1.mWeakAct
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r2.isSupportSSOLogin(r0)
            if (r2 != 0) goto L28
            r2 = 0
            return r2
        L28:
            r2 = 1
            return r2
    }

    private void loginDeal() {
            r4 = this;
            java.lang.ref.WeakReference<android.app.Activity> r0 = r4.mWeakAct
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L2b
            java.lang.ref.WeakReference<android.app.Activity> r0 = r4.mWeakAct
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L2b
            com.tencent.tauth.Tencent r0 = r4.mTencent
            java.lang.ref.WeakReference<android.app.Activity> r1 = r4.mWeakAct
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            com.umeng.socialize.UMAuthListener r2 = r4.mAuthListener
            com.tencent.tauth.IUiListener r2 = r4.getAuthlistener(r2)
            java.lang.String r3 = "all"
            r0.login(r1, r3, r2)
        L2b:
            return
    }

    private void shareToQZone() {
            r3 = this;
            com.umeng.socialize.media.QZoneShareContent r0 = r3.mShareContent
            android.os.Bundle r0 = r0.buildParamsQzone()
            com.umeng.socialize.UMShareConfig r1 = r3.getShareConfig()
            java.lang.String r1 = r1.getAppName()
            java.lang.String r2 = "appName"
            r0.putString(r2, r1)
            com.umeng.socialize.media.QZoneShareContent r1 = r3.mShareContent
            boolean r1 = r1.getisPublish()
            if (r1 == 0) goto L1f
            r3.doPublishToQzone(r0)
            return
        L1f:
            r3.defaultQZoneShare(r0)
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void authorize(com.umeng.socialize.UMAuthListener r2) {
            r1 = this;
            com.umeng.socialize.PlatformConfig$Platform r0 = r1.getConfig()
            boolean r0 = r1.isInstall(r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            r1.mAuthListener = r2
            r1.loginDeal()
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void deleteAuth(com.umeng.socialize.UMAuthListener r3) {
            r2 = this;
            com.tencent.tauth.Tencent r0 = r2.mTencent
            android.content.Context r1 = r2.getContext()
            r0.logout(r1)
            com.umeng.socialize.handler.QQPreferences r0 = r2.qqPreferences
            if (r0 == 0) goto L10
            r0.delete()
        L10:
            com.umeng.socialize.handler.QZoneSsoHandler$3 r0 = new com.umeng.socialize.handler.QZoneSsoHandler$3
            r0.<init>(r2, r3)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public int getRequestCode() {
            r1 = this;
            r0 = 10104(0x2778, float:1.4159E-41)
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isSupportAuth() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            r0 = 10104(0x2778, float:1.4159E-41)
            if (r2 != r0) goto Ld
            com.umeng.socialize.UMShareListener r0 = r1.mShareListener
            com.tencent.tauth.IUiListener r0 = r1.getmShareListener(r0)
            com.tencent.tauth.Tencent.onActivityResultData(r2, r3, r4, r0)
        Ld:
            r0 = 11101(0x2b5d, float:1.5556E-41)
            if (r2 != r0) goto L1a
            com.umeng.socialize.UMAuthListener r0 = r1.mAuthListener
            com.tencent.tauth.IUiListener r0 = r1.getAuthlistener(r0)
            com.tencent.tauth.Tencent.onActivityResultData(r2, r3, r4, r0)
        L1a:
            return
    }

    @Override // com.umeng.socialize.handler.UMTencentSSOHandler, com.umeng.socialize.handler.UMSSOHandler
    public void onCreate(android.content.Context r2, com.umeng.socialize.PlatformConfig.Platform r3) {
            r1 = this;
            super.onCreate(r2, r3)
            com.umeng.socialize.handler.QQPreferences r3 = new com.umeng.socialize.handler.QQPreferences
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            java.lang.String r0 = r0.toString()
            r3.<init>(r2, r0)
            r1.qqPreferences = r3
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean share(com.umeng.socialize.ShareContent r3, com.umeng.socialize.UMShareListener r4) {
            r2 = this;
            if (r4 == 0) goto L4
            r2.mShareListener = r4
        L4:
            com.tencent.tauth.Tencent r0 = r2.mTencent
            r1 = 0
            if (r0 != 0) goto L12
            com.umeng.socialize.handler.QZoneSsoHandler$1 r3 = new com.umeng.socialize.handler.QZoneSsoHandler$1
            r3.<init>(r2, r4)
            com.umeng.socialize.common.QueuedWork.runInMain(r3)
            return r1
        L12:
            com.umeng.socialize.PlatformConfig$Platform r0 = r2.getConfig()
            boolean r0 = r2.isInstall(r0)
            if (r0 != 0) goto L44
            boolean r3 = com.umeng.socialize.Config.isJumptoAppStore
            if (r3 == 0) goto L3b
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r3.<init>(r0)
            java.lang.String r0 = "http://log.umsns.com/link/qq/download/"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r3.setData(r0)
            java.lang.ref.WeakReference<android.app.Activity> r0 = r2.mWeakAct
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            r0.startActivity(r3)
        L3b:
            com.umeng.socialize.handler.QZoneSsoHandler$2 r3 = new com.umeng.socialize.handler.QZoneSsoHandler$2
            r3.<init>(r2, r4)
            com.umeng.socialize.common.QueuedWork.runInMain(r3)
            return r1
        L44:
            com.umeng.socialize.media.QZoneShareContent r4 = new com.umeng.socialize.media.QZoneShareContent
            r4.<init>(r3)
            r2.mShareContent = r4
            com.umeng.socialize.UMShareConfig r3 = r2.mShareConfig
            if (r3 == 0) goto L56
            com.umeng.socialize.interfaces.CompressListener r3 = r3.getCompressListener()
            r4.setCompressListener(r3)
        L56:
            r2.shareToQZone()
            return r1
    }
}

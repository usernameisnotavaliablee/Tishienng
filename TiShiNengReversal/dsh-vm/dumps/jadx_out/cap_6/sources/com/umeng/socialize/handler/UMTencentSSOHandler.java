package com.umeng.socialize.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class UMTencentSSOHandler extends com.umeng.socialize.handler.UMSSOHandler {
    protected static final java.lang.String FIGUREURL_QQ_2 = "figureurl_qq_2";
    protected static final java.lang.String IS_YELLOW_VIP = "is_yellow_vip";
    protected static final java.lang.String IS_YELLOW_YEAR_VIP = "is_yellow_year_vip";
    protected static final java.lang.String LEVEL = "level";
    protected static final java.lang.String MSG = "msg";
    protected static final java.lang.String NICKNAME = "nickname";
    private static final java.lang.String PUBLIC_ACCOUNT = "100424468";
    protected static final java.lang.String RET = "ret";
    private static final java.lang.String TAG = "UMTencentSSOHandler";
    protected static final java.lang.String VIP = "vip";
    protected static final java.lang.String YELLOW_VIP_LEVEL = "yellow_vip_level";
    protected static java.util.Map<java.lang.String, java.lang.String> mImageCache;
    protected java.lang.String VERSION;
    public com.umeng.socialize.PlatformConfig.APPIDPlatform config;
    protected com.umeng.socialize.UMAuthListener mAuthListener;
    protected java.lang.String mImageUrl;
    protected android.app.ProgressDialog mProgressDialog;
    protected com.umeng.socialize.UMShareListener mShareListener;
    protected com.tencent.tauth.Tencent mTencent;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected interface ObtainAppIdListener {
        void onComplete();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface ObtainImageUrlListener {
        void onComplete(java.lang.String r1);
    }

    static {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            com.umeng.socialize.handler.UMTencentSSOHandler.mImageCache = r0
            return
    }

    public UMTencentSSOHandler() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mProgressDialog = r0
            r1.mImageUrl = r0
            r1.config = r0
            java.lang.String r0 = "7.3.2"
            r1.VERSION = r0
            return
    }

    private void setImageUrl(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Ld
            java.util.Map<java.lang.String, java.lang.String> r0 = com.umeng.socialize.handler.UMTencentSSOHandler.mImageCache
            r0.put(r2, r3)
            r1.mImageUrl = r3
        Ld:
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.VERSION
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void onCreate(android.content.Context r2, com.umeng.socialize.PlatformConfig.Platform r3) {
            r1 = this;
            super.onCreate(r2, r3)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r3 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r3
            r1.config = r3
            java.lang.String r3 = r3.getFileProvider()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L21
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.QQ.QQ_FILE_PROVIDER_ERROR
            com.umeng.socialize.utils.SLog.E(r3)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r3 = r1.config
            java.lang.String r3 = r3.appId
            com.tencent.tauth.Tencent r2 = com.tencent.tauth.Tencent.createInstance(r3, r2)
            r1.mTencent = r2
            goto L2f
        L21:
            com.umeng.socialize.PlatformConfig$APPIDPlatform r3 = r1.config
            java.lang.String r0 = r3.appId
            java.lang.String r3 = r3.getFileProvider()
            com.tencent.tauth.Tencent r2 = com.tencent.tauth.Tencent.createInstance(r0, r2, r3)
            r1.mTencent = r2
        L2f:
            com.tencent.tauth.Tencent r2 = r1.mTencent
            if (r2 != 0) goto L38
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.QQ.QQ_TENCENT_ERROR
            com.umeng.socialize.utils.SLog.E(r2)
        L38:
            return
    }

    protected android.os.Bundle parseOauthData(java.lang.Object r5) {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            if (r5 != 0) goto L8
            goto L20
        L8:
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.trim()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L17
            goto L20
        L17:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1d
            r1.<init>(r5)     // Catch: org.json.JSONException -> L1d
            goto L1e
        L1d:
            r1 = 0
        L1e:
            if (r1 != 0) goto L21
        L20:
            return r0
        L21:
            java.lang.String r5 = "auth_time"
            java.lang.String r2 = ""
            java.lang.String r3 = r1.optString(r5, r2)
            r0.putString(r5, r3)
            java.lang.String r5 = "pay_token"
            java.lang.String r3 = r1.optString(r5, r2)
            r0.putString(r5, r3)
            java.lang.String r5 = "pf"
            java.lang.String r3 = r1.optString(r5, r2)
            r0.putString(r5, r3)
            r5 = -1
            java.lang.String r3 = "ret"
            int r5 = r1.optInt(r3, r5)
            java.lang.String r5 = java.lang.String.valueOf(r5)
            r0.putString(r3, r5)
            java.lang.String r5 = "sendinstall"
            java.lang.String r3 = r1.optString(r5, r2)
            r0.putString(r5, r3)
            java.lang.String r5 = "page_type"
            java.lang.String r3 = r1.optString(r5, r2)
            r0.putString(r5, r3)
            java.lang.String r5 = "appid"
            java.lang.String r3 = r1.optString(r5, r2)
            r0.putString(r5, r3)
            java.lang.String r5 = "openid"
            java.lang.String r3 = r1.optString(r5, r2)
            r0.putString(r5, r3)
            java.lang.String r3 = "uid"
            java.lang.String r5 = r1.optString(r5, r2)
            r0.putString(r3, r5)
            java.lang.String r5 = "expires_in"
            java.lang.String r3 = r1.optString(r5, r2)
            r0.putString(r5, r3)
            java.lang.String r5 = "pfkey"
            java.lang.String r3 = r1.optString(r5, r2)
            r0.putString(r5, r3)
            java.lang.String r5 = "access_token"
            java.lang.String r1 = r1.optString(r5, r2)
            r0.putString(r5, r1)
            return r0
    }

    protected boolean validTencent() {
            r2 = this;
            com.tencent.tauth.Tencent r0 = r2.mTencent
            if (r0 == 0) goto L14
            java.lang.String r0 = r0.getAppId()
            com.umeng.socialize.PlatformConfig$APPIDPlatform r1 = r2.config
            java.lang.String r1 = r1.appId
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }
}

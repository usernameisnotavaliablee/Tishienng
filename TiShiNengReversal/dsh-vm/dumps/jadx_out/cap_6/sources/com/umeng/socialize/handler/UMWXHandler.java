package com.umeng.socialize.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMWXHandler extends com.umeng.socialize.handler.UMSSOHandler {
    private static final java.lang.String ERRMSG = "errmsg";
    private static final java.lang.String ERRORCODE = "errcode";
    private static final java.lang.String ERROR_CODE_TOKEN_ACCESS_FAIL = "42002";
    private static final java.lang.String ERROR_CODE_TOKEN_FAIL = "40001";
    private static final java.lang.String ERROR_CODE_TOKEN_REFESH_FAIL = "40030";
    private static final java.lang.String HEADIMGURL = "headimgurl";
    private static final java.lang.String LANGUAGE = "language";
    private static final java.lang.String NICKNAME = "nickname";
    private static final java.lang.String PRIVILEGE = "privilege";
    private static final int REFRESH_TOKEN_EXPIRES = 604800;
    private static final java.lang.String REFRESH_TOKEN_EXPIRES_KEY = "refresh_token_expires";
    private static final int RESP_TYPE_AUTH = 1;
    private static final int RESP_TYPE_SHARE = 2;
    private static final java.lang.String SEX = "sex";
    private static final java.lang.String TAG = "UMWXHandler";
    private static java.lang.String sScope = "snsapi_userinfo,snsapi_friend,snsapi_message";
    private java.lang.String VERSION;
    private com.umeng.socialize.PlatformConfig.APPIDPlatform config;
    private android.content.Context mAppContext;
    private com.umeng.socialize.UMAuthListener mAuthListener;
    private com.tencent.mm.opensdk.openapi.IWXAPIEventHandler mEventHandler;
    private java.lang.String mFileProvider;
    private com.umeng.socialize.bean.SHARE_MEDIA mTarget;
    private com.tencent.mm.opensdk.openapi.IWXAPI mWXApi;
    private com.umeng.socialize.UMShareListener umShareListener;
    private com.umeng.socialize.handler.WeixinPreferences weixinPreferences;
















    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.socialize.handler.UMWXHandler$23, reason: invalid class name */
    static /* synthetic */ class AnonymousClass23 {
        static final /* synthetic */ int[] $SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA = null;

        static {
                com.umeng.socialize.bean.SHARE_MEDIA[] r0 = com.umeng.socialize.bean.SHARE_MEDIA.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.umeng.socialize.handler.UMWXHandler.AnonymousClass23.$SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA = r0
                com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.umeng.socialize.handler.UMWXHandler.AnonymousClass23.$SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA     // Catch: java.lang.NoSuchFieldError -> L1d
                com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.umeng.socialize.handler.UMWXHandler.AnonymousClass23.$SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA     // Catch: java.lang.NoSuchFieldError -> L28
                com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_FAVORITE     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                return
        }

        public AnonymousClass23() {
                r1 = this;
                r1.<init>()
                return
        }
    }








    static {
            return
    }

    public UMWXHandler() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "7.3.2"
            r1.VERSION = r0
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r1.mTarget = r0
            com.umeng.socialize.handler.UMWXHandler$22 r0 = new com.umeng.socialize.handler.UMWXHandler$22
            r0.<init>(r1)
            r1.mEventHandler = r0
            return
    }

    static /* synthetic */ com.umeng.socialize.bean.SHARE_MEDIA access$000(com.umeng.socialize.handler.UMWXHandler r0) {
            com.umeng.socialize.bean.SHARE_MEDIA r0 = r0.mTarget
            return r0
    }

    static /* synthetic */ com.umeng.socialize.UMAuthListener access$100(com.umeng.socialize.handler.UMWXHandler r0) {
            com.umeng.socialize.UMAuthListener r0 = r0.mAuthListener
            return r0
    }

    static /* synthetic */ java.util.Map access$200(com.umeng.socialize.handler.UMWXHandler r0) {
            java.util.Map r0 = r0.getMap()
            return r0
    }

    static /* synthetic */ android.os.Bundle access$300(com.umeng.socialize.handler.UMWXHandler r0, java.lang.String r1) {
            android.os.Bundle r0 = r0.parseAuthData(r1)
            return r0
    }

    static /* synthetic */ void access$400(com.umeng.socialize.handler.UMWXHandler r0, android.os.Bundle r1) {
            r0.setBundle(r1)
            return
    }

    static /* synthetic */ com.umeng.socialize.PlatformConfig.APPIDPlatform access$500(com.umeng.socialize.handler.UMWXHandler r0) {
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = r0.config
            return r0
    }

    static /* synthetic */ void access$600(com.umeng.socialize.handler.UMWXHandler r0, com.umeng.socialize.UMAuthListener r1) {
            r0.fetchUserInfo(r1)
            return
    }

    static /* synthetic */ com.umeng.socialize.UMShareListener access$700(com.umeng.socialize.handler.UMWXHandler r0) {
            com.umeng.socialize.UMShareListener r0 = r0.umShareListener
            return r0
    }

    static /* synthetic */ void access$800(com.umeng.socialize.handler.UMWXHandler r0, com.tencent.mm.opensdk.modelmsg.SendAuth.Resp r1) {
            r0.onAuthCallback(r1)
            return
    }

    private java.lang.String buildTransaction(java.lang.String r4) {
            r3 = this;
            if (r4 != 0) goto Lb
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r4 = java.lang.String.valueOf(r0)
            return r4
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            long r1 = java.lang.System.currentTimeMillis()
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            return r4
    }

    private void fetchUserInfo(com.umeng.socialize.UMAuthListener r5) {
            r4 = this;
            java.lang.String r0 = r4.getOpenid()
            java.lang.String r1 = r4.getAccessToken()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "https://api.weixin.qq.com/sns/userinfo?access_token="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = "&openid="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = "&lang=zh_CN"
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            java.lang.String r0 = com.umeng.socialize.weixin.net.WXAuthUtils.request(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L77
            java.lang.String r1 = "##"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L39
            goto L77
        L39:
            java.util.Map r1 = r4.parseUserInfo(r0)
            if (r1 != 0) goto L48
            com.umeng.socialize.handler.UMWXHandler$7 r1 = new com.umeng.socialize.handler.UMWXHandler$7
            r1.<init>(r4, r5, r0)
            com.umeng.socialize.common.QueuedWork.runInMain(r1)
            return
        L48:
            java.lang.String r0 = "errcode"
            boolean r2 = r1.containsKey(r0)
            if (r2 == 0) goto L6e
            java.lang.Object r0 = r1.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r2 = "40001"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L65
            r4.weixinPreferencesDelete()
            r4.authorize(r5)
            return
        L65:
            com.umeng.socialize.handler.UMWXHandler$8 r0 = new com.umeng.socialize.handler.UMWXHandler$8
            r0.<init>(r4, r5, r1)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
            return
        L6e:
            com.umeng.socialize.handler.UMWXHandler$9 r0 = new com.umeng.socialize.handler.UMWXHandler$9
            r0.<init>(r4, r5, r1)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
            return
        L77:
            com.umeng.socialize.handler.UMWXHandler$6 r1 = new com.umeng.socialize.handler.UMWXHandler$6
            r1.<init>(r4, r5, r0)
            com.umeng.socialize.common.QueuedWork.runInMain(r1)
            return
    }

    private java.lang.String getAccessToken() {
            r1 = this;
            com.umeng.socialize.handler.WeixinPreferences r0 = r1.weixinPreferences
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getAccessToken()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    private long getAccessTokenTTL() {
            r2 = this;
            com.umeng.socialize.handler.WeixinPreferences r0 = r2.weixinPreferences
            if (r0 == 0) goto L9
            long r0 = r0.getAccessTokenTTL()
            return r0
        L9:
            r0 = 0
            return r0
    }

    private void getAuthWithCode(java.lang.String r6, com.umeng.socialize.UMAuthListener r7) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.umeng.socialize.PlatformConfig$APPIDPlatform r1 = r5.config
            java.lang.String r1 = r1.appkey
            r2 = 1
            java.lang.String r3 = "&code="
            if (r1 == 0) goto L45
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L45
            java.lang.String r1 = "https://api.weixin.qq.com/sns/oauth2/access_token?"
            r0.append(r1)
            java.lang.String r1 = "appid="
            r0.append(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r1 = r5.config
            java.lang.String r1 = r1.appId
            r0.append(r1)
            java.lang.String r1 = "&secret="
            r0.append(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r1 = r5.config
            java.lang.String r1 = r1.appkey
            r0.append(r1)
            r0.append(r3)
            r0.append(r6)
            java.lang.String r6 = "&grant_type=authorization_code"
            r0.append(r6)
            com.umeng.socialize.handler.UMWXHandler$3 r6 = new com.umeng.socialize.handler.UMWXHandler$3
            r6.<init>(r5, r0, r7)
            com.umeng.socialize.common.QueuedWork.runInBack(r6, r2)
            return
        L45:
            java.lang.String r1 = "https://oauth2.umeng.com/oauth/token/acquire?"
            r0.append(r1)
            android.content.Context r1 = r5.getContext()
            java.lang.String r1 = com.umeng.socialize.utils.SocializeUtils.getAppkey(r1)
            java.lang.String r4 = "appkey="
            r0.append(r4)
            r0.append(r1)
            java.lang.String r1 = "&source="
            r0.append(r1)
            java.lang.String r1 = "wechat"
            r0.append(r1)
            java.lang.String r1 = "&appId="
            r0.append(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r1 = r5.config
            java.lang.String r1 = r1.appId
            r0.append(r1)
            r0.append(r3)
            r0.append(r6)
            com.umeng.socialize.handler.UMWXHandler$4 r6 = new com.umeng.socialize.handler.UMWXHandler$4
            r6.<init>(r5, r0, r7)
            com.umeng.socialize.common.QueuedWork.runInBack(r6, r2)
            return
    }

    private java.util.Map<java.lang.String, java.lang.String> getAuthWithRefreshToken(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "https://api.weixin.qq.com/sns/oauth2/refresh_token?"
            r0.append(r1)
            java.lang.String r1 = "appid="
            r0.append(r1)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r1 = r2.config
            java.lang.String r1 = r1.appId
            r0.append(r1)
            java.lang.String r1 = "&grant_type=refresh_token"
            r0.append(r1)
            java.lang.String r1 = "&refresh_token="
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = com.umeng.socialize.weixin.net.WXAuthUtils.request(r3)
            java.util.Map r3 = com.umeng.socialize.utils.SocializeUtils.jsonToMap(r3)     // Catch: java.lang.Exception -> L3b
            java.lang.String r0 = "unionid"
            java.lang.String r1 = r2.getUid()     // Catch: java.lang.Exception -> L39
            r3.put(r0, r1)     // Catch: java.lang.Exception -> L39
            return r3
        L39:
            r0 = move-exception
            goto L3d
        L3b:
            r0 = move-exception
            r3 = 0
        L3d:
            com.umeng.socialize.utils.SLog.error(r0)
            return r3
    }

    private java.util.Map<java.lang.String, java.lang.String> getMap() {
            r1 = this;
            com.umeng.socialize.handler.WeixinPreferences r0 = r1.weixinPreferences
            if (r0 == 0) goto L9
            java.util.Map r0 = r0.getMap()
            return r0
        L9:
            r0 = 0
            return r0
    }

    private java.lang.String getOpenid() {
            r1 = this;
            com.umeng.socialize.handler.WeixinPreferences r0 = r1.weixinPreferences
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getOpenid()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    private java.lang.String getRefreshToken() {
            r1 = this;
            com.umeng.socialize.handler.WeixinPreferences r0 = r1.weixinPreferences
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getRefreshToken()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    private java.lang.String getUid() {
            r1 = this;
            com.umeng.socialize.handler.WeixinPreferences r0 = r1.weixinPreferences
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getUID()
            return r0
        L9:
            java.lang.String r0 = ""
            return r0
    }

    private boolean isAbleShareEmoji(com.umeng.socialize.bean.SHARE_MEDIA r2, com.umeng.socialize.media.WeiXinShareContent r3) {
            r1 = this;
            int r3 = r3.getmStyle()
            r0 = 64
            if (r3 != r0) goto L12
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            if (r2 == r3) goto L10
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_FAVORITE
            if (r2 != r3) goto L12
        L10:
            r2 = 0
            return r2
        L12:
            r2 = 1
            return r2
    }

    private boolean isAccessTokenAvailable() {
            r1 = this;
            com.umeng.socialize.handler.WeixinPreferences r0 = r1.weixinPreferences
            if (r0 == 0) goto L9
            boolean r0 = r0.isAccessTokenAvailable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    private boolean isAuthValid() {
            r1 = this;
            com.umeng.socialize.handler.WeixinPreferences r0 = r1.weixinPreferences
            if (r0 == 0) goto L9
            boolean r0 = r0.isAuthValid()
            return r0
        L9:
            r0 = 0
            return r0
    }

    private void loadOauthData(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = com.umeng.socialize.weixin.net.WXAuthUtils.request(r1)
            android.os.Bundle r1 = r0.parseAuthData(r1)
            r0.setBundle(r1)
            return
    }

    private void onAuthCallback(com.tencent.mm.opensdk.modelmsg.SendAuth.Resp r7) {
            r6 = this;
            int r0 = r7.errCode
            if (r0 != 0) goto Lc
            java.lang.String r7 = r7.code
            com.umeng.socialize.UMAuthListener r0 = r6.mAuthListener
            r6.getAuthWithCode(r7, r0)
            return
        Lc:
            r1 = -2
            r2 = 0
            if (r0 != r1) goto L1c
            com.umeng.socialize.UMAuthListener r7 = r6.mAuthListener
            com.umeng.socialize.UMAuthListener r7 = r6.getAuthListener(r7)
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r7.onCancel(r0, r2)
            return
        L1c:
            r1 = -6
            if (r0 != r1) goto L4d
            com.umeng.socialize.UMAuthListener r7 = r6.mAuthListener
            com.umeng.socialize.UMAuthListener r7 = r6.getAuthListener(r7)
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.umeng.socialize.bean.UmengErrorCode r4 = com.umeng.socialize.bean.UmengErrorCode.AuthorizeFailed
            java.lang.String r4 = r4.getMessage()
            r3.append(r4)
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.AUTH.AUTH_DENIED
            java.lang.String r5 = com.umeng.socialize.utils.UrlUtil.WX_ERROR_SIGN
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.errorWithUrl(r4, r5)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.<init>(r3)
            r7.onError(r0, r2, r1)
            return
        L4d:
            r1 = -4
            if (r0 != r1) goto L5c
            com.umeng.socialize.UMAuthListener r7 = r6.mAuthListener
            com.umeng.socialize.UMAuthListener r7 = r6.getAuthListener(r7)
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            r7.onCancel(r0, r2)
            return
        L5c:
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r7 = r7.errStr
            r1 = 4
            java.lang.CharSequence[] r1 = new java.lang.CharSequence[r1]
            java.lang.String r3 = "weixin auth error ("
            r1[r2] = r3
            r3 = 1
            r1[r3] = r0
            java.lang.String r0 = "):"
            r3 = 2
            r1[r3] = r0
            r0 = 3
            r1[r0] = r7
            java.lang.CharSequence r7 = android.text.TextUtils.concat(r1)
            com.umeng.socialize.UMAuthListener r0 = r6.mAuthListener
            com.umeng.socialize.UMAuthListener r0 = r6.getAuthListener(r0)
            com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            java.lang.Throwable r3 = new java.lang.Throwable
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            com.umeng.socialize.bean.UmengErrorCode r5 = com.umeng.socialize.bean.UmengErrorCode.AuthorizeFailed
            java.lang.String r5 = r5.getMessage()
            r4.append(r5)
            r4.append(r7)
            java.lang.String r7 = r4.toString()
            r3.<init>(r7)
            r0.onError(r1, r2, r3)
            return
    }

    private android.os.Bundle parseAuthData(java.lang.String r5) {
            r4 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto Lc
            return r0
        Lc:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L29
            r1.<init>(r5)     // Catch: org.json.JSONException -> L29
            java.util.Iterator r5 = r1.keys()     // Catch: org.json.JSONException -> L29
        L15:
            boolean r2 = r5.hasNext()     // Catch: org.json.JSONException -> L29
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r5.next()     // Catch: org.json.JSONException -> L29
            java.lang.String r2 = (java.lang.String) r2     // Catch: org.json.JSONException -> L29
            java.lang.String r3 = r1.optString(r2)     // Catch: org.json.JSONException -> L29
            r0.putString(r2, r3)     // Catch: org.json.JSONException -> L29
            goto L15
        L29:
            r5 = move-exception
            goto L60
        L2b:
            java.lang.String r5 = "refresh_token_expires"
            r1 = 604800(0x93a80, double:2.98811E-318)
            r0.putLong(r5, r1)     // Catch: org.json.JSONException -> L29
            java.lang.String r5 = "accessToken"
            java.lang.String r1 = "access_token"
            java.lang.String r1 = r0.getString(r1)     // Catch: org.json.JSONException -> L29
            r0.putString(r5, r1)     // Catch: org.json.JSONException -> L29
            java.lang.String r5 = "expiration"
            java.lang.String r1 = "expires_in"
            java.lang.String r1 = r0.getString(r1)     // Catch: org.json.JSONException -> L29
            r0.putString(r5, r1)     // Catch: org.json.JSONException -> L29
            java.lang.String r5 = "refreshToken"
            java.lang.String r1 = "refresh_token"
            java.lang.String r1 = r0.getString(r1)     // Catch: org.json.JSONException -> L29
            r0.putString(r5, r1)     // Catch: org.json.JSONException -> L29
            java.lang.String r5 = "uid"
            java.lang.String r1 = "unionid"
            java.lang.String r1 = r0.getString(r1)     // Catch: org.json.JSONException -> L29
            r0.putString(r5, r1)     // Catch: org.json.JSONException -> L29
            return r0
        L60:
            com.umeng.socialize.utils.SLog.error(r5)
            return r0
    }

    private java.util.Map<java.lang.String, java.lang.String> parseUserInfo(java.lang.String r15) {
            r14 = this;
            java.lang.String r0 = "refreshToken"
            java.lang.String r1 = "privilege"
            java.lang.String r2 = "headimgurl"
            java.lang.String r3 = "country"
            java.lang.String r4 = "province"
            java.lang.String r5 = "city"
            java.lang.String r6 = "language"
            java.lang.String r7 = "nickname"
            java.lang.String r8 = "openid"
            java.lang.String r9 = "errmsg"
            java.lang.String r10 = "unionid"
            java.lang.String r11 = "errcode"
            boolean r12 = android.text.TextUtils.isEmpty(r15)
            if (r12 == 0) goto L21
            java.util.Map r15 = java.util.Collections.EMPTY_MAP
            return r15
        L21:
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>()
            org.json.JSONObject r13 = new org.json.JSONObject     // Catch: org.json.JSONException -> L40
            r13.<init>(r15)     // Catch: org.json.JSONException -> L40
            boolean r15 = r13.has(r11)     // Catch: org.json.JSONException -> L40
            if (r15 == 0) goto L43
            java.lang.String r15 = r13.getString(r11)     // Catch: org.json.JSONException -> L40
            r12.put(r11, r15)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = r13.getString(r9)     // Catch: org.json.JSONException -> L40
            r12.put(r9, r15)     // Catch: org.json.JSONException -> L40
            return r12
        L40:
            r15 = move-exception
            goto L10b
        L43:
            java.lang.String r15 = r13.optString(r8)     // Catch: org.json.JSONException -> L40
            r12.put(r8, r15)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = "screen_name"
            java.lang.String r8 = r13.optString(r7)     // Catch: org.json.JSONException -> L40
            r12.put(r15, r8)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = "name"
            java.lang.String r7 = r13.optString(r7)     // Catch: org.json.JSONException -> L40
            r12.put(r15, r7)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = r13.optString(r6)     // Catch: org.json.JSONException -> L40
            r12.put(r6, r15)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = r13.optString(r5)     // Catch: org.json.JSONException -> L40
            r12.put(r5, r15)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = r13.optString(r4)     // Catch: org.json.JSONException -> L40
            r12.put(r4, r15)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = r13.optString(r3)     // Catch: org.json.JSONException -> L40
            r12.put(r3, r15)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = "profile_image_url"
            java.lang.String r3 = r13.optString(r2)     // Catch: org.json.JSONException -> L40
            r12.put(r15, r3)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = "iconurl"
            java.lang.String r2 = r13.optString(r2)     // Catch: org.json.JSONException -> L40
            r12.put(r15, r2)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = r13.optString(r10)     // Catch: org.json.JSONException -> L40
            r12.put(r10, r15)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = "uid"
            java.lang.String r2 = r13.optString(r10)     // Catch: org.json.JSONException -> L40
            r12.put(r15, r2)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = "gender"
            java.lang.String r2 = "sex"
            java.lang.String r2 = r13.optString(r2)     // Catch: org.json.JSONException -> L40
            java.lang.String r2 = r14.getGender(r2)     // Catch: org.json.JSONException -> L40
            r12.put(r15, r2)     // Catch: org.json.JSONException -> L40
            org.json.JSONArray r15 = r13.optJSONArray(r1)     // Catch: org.json.JSONException -> L40
            r2 = 0
            if (r15 != 0) goto Lb2
            r3 = 0
            goto Lb6
        Lb2:
            int r3 = r15.length()     // Catch: org.json.JSONException -> L40
        Lb6:
            if (r3 <= 0) goto Ld0
            java.lang.String[] r4 = new java.lang.String[r3]     // Catch: org.json.JSONException -> L40
        Lba:
            if (r2 >= r3) goto Lc9
            java.lang.Object r5 = r15.get(r2)     // Catch: org.json.JSONException -> L40
            java.lang.String r5 = r5.toString()     // Catch: org.json.JSONException -> L40
            r4[r2] = r5     // Catch: org.json.JSONException -> L40
            int r2 = r2 + 1
            goto Lba
        Lc9:
            java.lang.String r15 = r4.toString()     // Catch: org.json.JSONException -> L40
            r12.put(r1, r15)     // Catch: org.json.JSONException -> L40
        Ld0:
            java.lang.String r15 = "access_token"
            java.lang.String r1 = r14.getAccessToken()     // Catch: org.json.JSONException -> L40
            r12.put(r15, r1)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = r14.getRefreshToken()     // Catch: org.json.JSONException -> L40
            r12.put(r0, r15)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = "expires_in"
            long r1 = r14.getAccessTokenTTL()     // Catch: org.json.JSONException -> L40
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: org.json.JSONException -> L40
            r12.put(r15, r1)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = "accessToken"
            java.lang.String r1 = r14.getAccessToken()     // Catch: org.json.JSONException -> L40
            r12.put(r15, r1)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = r14.getRefreshToken()     // Catch: org.json.JSONException -> L40
            r12.put(r0, r15)     // Catch: org.json.JSONException -> L40
            java.lang.String r15 = "expiration"
            long r0 = r14.getAccessTokenTTL()     // Catch: org.json.JSONException -> L40
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: org.json.JSONException -> L40
            r12.put(r15, r0)     // Catch: org.json.JSONException -> L40
            return r12
        L10b:
            com.umeng.socialize.utils.SLog.error(r15)
            java.util.Map r15 = java.util.Collections.EMPTY_MAP
            return r15
    }

    private void runInMainThread(java.lang.Runnable r1) {
            r0 = this;
            com.umeng.socialize.common.QueuedWork.runInMain(r1)
            return
    }

    private void setBundle(android.os.Bundle r2) {
            r1 = this;
            com.umeng.socialize.handler.WeixinPreferences r0 = r1.weixinPreferences
            if (r0 == 0) goto Lb
            com.umeng.socialize.handler.WeixinPreferences r2 = r0.setBundle(r2)
            r2.commit()
        Lb:
            return
    }

    private boolean shareTo(com.umeng.socialize.media.WeiXinShareContent r9) {
            r8 = this;
            boolean r0 = r9.isBySystem()
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lcb
            java.lang.String r0 = r9.getText()
            com.umeng.socialize.media.UMImage r3 = r9.getImage()
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r4.setFlags(r5)
            java.lang.String r5 = "android.intent.action.SEND"
            r4.setAction(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r0)
            if (r5 != 0) goto L2f
            java.lang.String r5 = "android.intent.extra.TEXT"
            r4.putExtra(r5, r0)
            java.lang.String r5 = "Kdescription"
            r4.putExtra(r5, r0)
        L2f:
            if (r3 == 0) goto L46
            java.io.File r3 = r3.asFileImage()
            if (r3 == 0) goto L46
            android.content.Context r5 = r8.mAppContext
            java.lang.String r6 = r8.mFileProvider
            java.lang.String r9 = r9.getFileUri(r5, r3, r6)
            if (r9 == 0) goto L46
            android.net.Uri r9 = android.net.Uri.parse(r9)
            goto L47
        L46:
            r9 = 0
        L47:
            java.lang.String r3 = "com.tencent.mm"
            r4.setPackage(r3)
            com.umeng.socialize.bean.SHARE_MEDIA r5 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            com.umeng.socialize.bean.SHARE_MEDIA r6 = r8.mTarget
            boolean r5 = r5.equals(r6)
            java.lang.String r6 = "image/*"
            java.lang.String r7 = "android.intent.extra.STREAM"
            if (r5 == 0) goto L8f
            if (r9 == 0) goto L63
            r4.putExtra(r7, r9)
            r4.setType(r6)
            goto L77
        L63:
            boolean r9 = android.text.TextUtils.isEmpty(r0)
            if (r9 == 0) goto L72
            com.umeng.socialize.handler.UMWXHandler$14 r9 = new com.umeng.socialize.handler.UMWXHandler$14
            r9.<init>(r8)
            r8.runInMainThread(r9)
            return r2
        L72:
            java.lang.String r9 = "text/plain"
            r4.setType(r9)
        L77:
            android.content.ComponentName r9 = new android.content.ComponentName
            java.lang.String r0 = "com.tencent.mm.ui.tools.ShareImgUI"
            r9.<init>(r3, r0)
            r4.setComponent(r9)
            android.content.Context r9 = r8.mAppContext
            r9.startActivity(r4)
            com.umeng.socialize.handler.UMWXHandler$15 r9 = new com.umeng.socialize.handler.UMWXHandler$15
            r9.<init>(r8)
            r8.runInMainThread(r9)
            return r1
        L8f:
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            com.umeng.socialize.bean.SHARE_MEDIA r5 = r8.mTarget
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto Lc2
            if (r9 != 0) goto La4
            com.umeng.socialize.handler.UMWXHandler$16 r9 = new com.umeng.socialize.handler.UMWXHandler$16
            r9.<init>(r8)
            r8.runInMainThread(r9)
            return r2
        La4:
            r4.putExtra(r7, r9)
            r4.setType(r6)
            android.content.ComponentName r9 = new android.content.ComponentName
            java.lang.String r0 = "com.tencent.mm.ui.tools.ShareToTimeLineUI"
            r9.<init>(r3, r0)
            r4.setComponent(r9)
            android.content.Context r9 = r8.mAppContext
            r9.startActivity(r4)
            com.umeng.socialize.handler.UMWXHandler$17 r9 = new com.umeng.socialize.handler.UMWXHandler$17
            r9.<init>(r8)
            r8.runInMainThread(r9)
            return r1
        Lc2:
            com.umeng.socialize.handler.UMWXHandler$18 r9 = new com.umeng.socialize.handler.UMWXHandler$18
            r9.<init>(r8)
            r8.runInMainThread(r9)
            return r2
        Lcb:
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req r0 = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req
            r0.<init>()
            java.lang.String r3 = r9.getStrStyle()
            java.lang.String r3 = r8.buildTransaction(r3)
            r0.transaction = r3
            boolean r3 = r8.checkVersionValid()
            if (r3 == 0) goto Le8
            boolean r3 = r8.checkAndroidNotBelowN()
            if (r3 == 0) goto Le8
            r3 = 1
            goto Le9
        Le8:
            r3 = 0
        Le9:
            android.content.Context r4 = r8.mAppContext
            java.lang.String r5 = r8.mFileProvider
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r9.getWxMediaMessage(r4, r3, r5)
            r0.message = r9
            int[] r9 = com.umeng.socialize.handler.UMWXHandler.AnonymousClass23.$SwitchMap$com$umeng$socialize$bean$SHARE_MEDIA
            com.umeng.socialize.bean.SHARE_MEDIA r3 = r8.mTarget
            int r3 = r3.ordinal()
            r9 = r9[r3]
            if (r9 == r1) goto L10e
            r3 = 2
            if (r9 == r3) goto L10b
            r1 = 3
            if (r9 == r1) goto L108
            r0.scene = r3
            goto L110
        L108:
            r0.scene = r3
            goto L110
        L10b:
            r0.scene = r1
            goto L110
        L10e:
            r0.scene = r2
        L110:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r9 = r0.message
            if (r9 != 0) goto L11d
            com.umeng.socialize.handler.UMWXHandler$19 r9 = new com.umeng.socialize.handler.UMWXHandler$19
            r9.<init>(r8)
            com.umeng.socialize.common.QueuedWork.runInMain(r9)
            return r2
        L11d:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r9 = r9.mediaObject
            if (r9 != 0) goto L12a
            com.umeng.socialize.handler.UMWXHandler$20 r9 = new com.umeng.socialize.handler.UMWXHandler$20
            r9.<init>(r8)
            com.umeng.socialize.common.QueuedWork.runInMain(r9)
            return r2
        L12a:
            com.tencent.mm.opensdk.openapi.IWXAPI r9 = r8.mWXApi
            boolean r9 = r9.sendReq(r0)
            if (r9 != 0) goto L13a
            com.umeng.socialize.handler.UMWXHandler$21 r0 = new com.umeng.socialize.handler.UMWXHandler$21
            r0.<init>(r8)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
        L13a:
            return r9
    }

    private void weixinPreferencesDelete() {
            r1 = this;
            com.umeng.socialize.handler.WeixinPreferences r0 = r1.weixinPreferences
            if (r0 == 0) goto L7
            r0.delete()
        L7:
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void authorize(com.umeng.socialize.UMAuthListener r5) {
            r4 = this;
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = r4.config
            if (r0 == 0) goto La
            com.umeng.socialize.bean.SHARE_MEDIA r0 = r0.getName()
            r4.mTarget = r0
        La:
            r4.mAuthListener = r5
            boolean r0 = r4.isInstall()
            if (r0 != 0) goto L3a
            boolean r0 = com.umeng.socialize.Config.isJumptoAppStore
            if (r0 == 0) goto L31
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            java.lang.String r1 = "http://log.umsns.com/link/weixin/download/"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.setData(r1)
            java.lang.ref.WeakReference<android.app.Activity> r1 = r4.mWeakAct
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            r1.startActivity(r0)
        L31:
            com.umeng.socialize.handler.UMWXHandler$1 r0 = new com.umeng.socialize.handler.UMWXHandler$1
            r0.<init>(r4, r5)
            r4.runInMainThread(r0)
            return
        L3a:
            boolean r0 = r4.isAuthValid()
            if (r0 == 0) goto L9f
            java.lang.String r0 = r4.getRefreshToken()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "https://api.weixin.qq.com/sns/oauth2/refresh_token?appid="
            r1.append(r2)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r2 = r4.config
            java.lang.String r2 = r2.appId
            r1.append(r2)
            java.lang.String r2 = "&grant_type=refresh_token&refresh_token="
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            r4.loadOauthData(r1)
            r4.getRefreshToken()
            java.util.Map r0 = r4.getAuthWithRefreshToken(r0)
            java.lang.String r1 = "errcode"
            boolean r2 = r0.containsKey(r1)
            if (r2 == 0) goto L96
            java.lang.Object r2 = r0.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "42002"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L8f
            java.lang.Object r1 = r0.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "40030"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L96
        L8f:
            r4.weixinPreferencesDelete()
            r4.authorize(r5)
            return
        L96:
            com.umeng.socialize.handler.UMWXHandler$2 r5 = new com.umeng.socialize.handler.UMWXHandler$2
            r5.<init>(r4, r0)
            r4.runInMainThread(r5)
            return
        L9f:
            com.tencent.mm.opensdk.modelmsg.SendAuth$Req r5 = new com.tencent.mm.opensdk.modelmsg.SendAuth$Req
            r5.<init>()
            java.lang.String r0 = com.umeng.socialize.handler.UMWXHandler.sScope
            r5.scope = r0
            java.lang.String r0 = "none"
            r5.state = r0
            com.tencent.mm.opensdk.openapi.IWXAPI r0 = r4.mWXApi
            r0.sendReq(r5)
            return
    }

    public boolean checkAndroidNotBelowN() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean checkVersionValid() {
            r2 = this;
            com.tencent.mm.opensdk.openapi.IWXAPI r0 = r2.mWXApi
            int r0 = r0.getWXAppSupportAPI()
            r1 = 654314752(0x27000d00, float:1.7770616E-15)
            if (r0 < r1) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void deleteAuth(com.umeng.socialize.UMAuthListener r2) {
            r1 = this;
            r1.weixinPreferencesDelete()
            com.umeng.socialize.handler.UMWXHandler$5 r0 = new com.umeng.socialize.handler.UMWXHandler$5
            r0.<init>(r1, r2)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public java.lang.String getGender(java.lang.Object r6) {
            r5 = this;
            java.lang.String r0 = com.umeng.socialize.bean.StringName.male
            java.lang.String r1 = com.umeng.socialize.bean.StringName.female
            if (r6 != 0) goto L9
            java.lang.String r6 = ""
            return r6
        L9:
            boolean r2 = r6 instanceof java.lang.String
            if (r2 == 0) goto L44
            java.lang.String r2 = "m"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L52
            java.lang.String r2 = "1"
            boolean r2 = r6.equals(r2)
            if (r2 != 0) goto L52
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.MAN
            boolean r2 = r6.equals(r2)
            if (r2 == 0) goto L26
            goto L52
        L26:
            java.lang.String r0 = "f"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L5a
            java.lang.String r0 = "2"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L5a
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.WOMAN
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L3f
            goto L5a
        L3f:
            java.lang.String r6 = r6.toString()
            return r6
        L44:
            boolean r2 = r6 instanceof java.lang.Integer
            if (r2 == 0) goto L60
            r2 = r6
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r3 = r2.intValue()
            r4 = 1
            if (r3 != r4) goto L53
        L52:
            return r0
        L53:
            int r0 = r2.intValue()
            r2 = 2
            if (r0 != r2) goto L5b
        L5a:
            return r1
        L5b:
            java.lang.String r6 = r6.toString()
            return r6
        L60:
            java.lang.String r6 = r6.toString()
            return r6
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void getPlatformInfo(com.umeng.socialize.UMAuthListener r2) {
            r1 = this;
            com.umeng.socialize.UMShareConfig r0 = r1.getShareConfig()
            boolean r0 = r0.isNeedAuthOnGetUserInfo()
            if (r0 == 0) goto Ld
            r1.weixinPreferencesDelete()
        Ld:
            com.umeng.socialize.handler.UMWXHandler$10 r0 = new com.umeng.socialize.handler.UMWXHandler$10
            r0.<init>(r1, r2)
            r1.authorize(r0)
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public int getRequestCode() {
            r1 = this;
            r0 = 10086(0x2766, float:1.4133E-41)
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public java.lang.String getSDKVersion() {
            r1 = this;
            java.lang.String r0 = "3.1.1"
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public java.lang.String getVersion() {
            r1 = this;
            java.lang.String r0 = r1.VERSION
            return r0
    }

    public com.tencent.mm.opensdk.openapi.IWXAPI getWXApi() {
            r1 = this;
            com.tencent.mm.opensdk.openapi.IWXAPI r0 = r1.mWXApi
            return r0
    }

    public com.tencent.mm.opensdk.openapi.IWXAPIEventHandler getWXEventHandler() {
            r1 = this;
            com.tencent.mm.opensdk.openapi.IWXAPIEventHandler r0 = r1.mEventHandler
            return r0
    }

    public boolean isAbleShareMin(com.umeng.socialize.bean.SHARE_MEDIA r2, com.umeng.socialize.media.WeiXinShareContent r3) {
            r1 = this;
            int r3 = r3.getmStyle()
            r0 = 128(0x80, float:1.8E-43)
            if (r3 != r0) goto L12
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            if (r2 == r3) goto L10
            com.umeng.socialize.bean.SHARE_MEDIA r3 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_FAVORITE
            if (r2 != r3) goto L12
        L10:
            r2 = 0
            return r2
        L12:
            r2 = 1
            return r2
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isAuthorize() {
            r1 = this;
            com.umeng.socialize.handler.WeixinPreferences r0 = r1.weixinPreferences
            boolean r0 = r0.isAuth()
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isHasAuthListener() {
            r1 = this;
            com.umeng.socialize.UMAuthListener r0 = r1.mAuthListener
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isInstall() {
            r1 = this;
            com.tencent.mm.opensdk.openapi.IWXAPI r0 = r1.mWXApi
            if (r0 == 0) goto Lc
            boolean r0 = r0.isWXAppInstalled()
            if (r0 == 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isSupport() {
            r2 = this;
            com.tencent.mm.opensdk.openapi.IWXAPI r0 = r2.mWXApi
            int r0 = r0.getWXAppSupportAPI()
            r1 = 553779201(0x21020001, float:4.404572E-19)
            if (r0 < r1) goto Ld
            r0 = 1
            return r0
        Ld:
            r0 = 0
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isSupportAuth() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void onCreate(android.content.Context r4, com.umeng.socialize.PlatformConfig.Platform r5) {
            r3 = this;
            super.onCreate(r4, r5)
            android.content.Context r0 = r4.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            r3.mAppContext = r0
            com.umeng.socialize.handler.WeixinPreferences r1 = new com.umeng.socialize.handler.WeixinPreferences
            java.lang.String r2 = "weixin"
            r1.<init>(r0, r2)
            r3.weixinPreferences = r1
            com.umeng.socialize.PlatformConfig$APPIDPlatform r5 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r5
            r3.config = r5
            java.lang.String r5 = r5.getFileProvider()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 == 0) goto L2a
            java.lang.String r5 = com.umeng.socialize.utils.UmengText.WX.WEIXIN_FILE_PROVIDER_ERROR
            com.umeng.socialize.utils.SLog.E(r5)
            goto L32
        L2a:
            com.umeng.socialize.PlatformConfig$APPIDPlatform r5 = r3.config
            java.lang.String r5 = r5.getFileProvider()
            r3.mFileProvider = r5
        L32:
            android.content.Context r4 = r4.getApplicationContext()
            android.content.Context r4 = com.stub.StubApp.getOrigApplicationContext(r4)
            com.umeng.socialize.PlatformConfig$APPIDPlatform r5 = r3.config
            java.lang.String r5 = r5.appId
            com.umeng.socialize.UMShareConfig r0 = r3.getShareConfig()
            boolean r0 = r0.getOpenWXAnalytics()
            com.tencent.mm.opensdk.openapi.IWXAPI r4 = com.tencent.mm.opensdk.openapi.WXAPIFactory.createWXAPI(r4, r5, r0)
            r3.mWXApi = r4
            com.umeng.socialize.PlatformConfig$APPIDPlatform r5 = r3.config
            java.lang.String r5 = r5.appId
            r4.registerApp(r5)
            return
    }

    protected void onShareCallback(com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Resp r6) {
            r5 = this;
            int r0 = r6.errCode
            r1 = -6
            if (r0 == r1) goto Lbe
            r1 = -5
            if (r0 == r1) goto L96
            r1 = -3
            if (r0 == r1) goto L6e
            r1 = -2
            if (r0 == r1) goto L62
            r1 = -1
            if (r0 == r1) goto L6e
            if (r0 == 0) goto L4a
            com.umeng.socialize.UMShareListener r0 = r5.umShareListener
            com.umeng.socialize.UMShareListener r0 = r5.getShareListener(r0)
            com.umeng.socialize.bean.SHARE_MEDIA r1 = r5.mTarget
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.umeng.socialize.bean.UmengErrorCode r4 = com.umeng.socialize.bean.UmengErrorCode.ShareFailed
            java.lang.String r4 = r4.getMessage()
            r3.append(r4)
            java.lang.String r4 = "code:"
            r3.append(r4)
            int r4 = r6.errCode
            r3.append(r4)
            java.lang.String r4 = "msg:"
            r3.append(r4)
            java.lang.String r6 = r6.errStr
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6)
            r0.onError(r1, r2)
            return
        L4a:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "uid"
            java.lang.String r6 = r6.openId
            r0.put(r1, r6)
            com.umeng.socialize.UMShareListener r6 = r5.umShareListener
            com.umeng.socialize.UMShareListener r6 = r5.getShareListener(r6)
            com.umeng.socialize.bean.SHARE_MEDIA r0 = r5.mTarget
            r6.onResult(r0)
            return
        L62:
            com.umeng.socialize.UMShareListener r6 = r5.umShareListener
            com.umeng.socialize.UMShareListener r6 = r5.getShareListener(r6)
            com.umeng.socialize.bean.SHARE_MEDIA r0 = r5.mTarget
            r6.onCancel(r0)
            return
        L6e:
            com.umeng.socialize.UMShareListener r0 = r5.umShareListener
            com.umeng.socialize.UMShareListener r0 = r5.getShareListener(r0)
            com.umeng.socialize.bean.SHARE_MEDIA r1 = r5.mTarget
            java.lang.Throwable r2 = new java.lang.Throwable
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            com.umeng.socialize.bean.UmengErrorCode r4 = com.umeng.socialize.bean.UmengErrorCode.ShareFailed
            java.lang.String r4 = r4.getMessage()
            r3.append(r4)
            java.lang.String r6 = r6.errStr
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            r2.<init>(r6)
            r0.onError(r1, r2)
            return
        L96:
            com.umeng.socialize.UMShareListener r6 = r5.umShareListener
            com.umeng.socialize.UMShareListener r6 = r5.getShareListener(r6)
            com.umeng.socialize.bean.SHARE_MEDIA r0 = r5.mTarget
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.umeng.socialize.bean.UmengErrorCode r3 = com.umeng.socialize.bean.UmengErrorCode.ShareFailed
            java.lang.String r3 = r3.getMessage()
            r2.append(r3)
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.SHARE.VERSION_NOT_SUPPORT
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r6.onError(r0, r1)
            return
        Lbe:
            com.umeng.socialize.UMShareListener r6 = r5.umShareListener
            com.umeng.socialize.UMShareListener r6 = r5.getShareListener(r6)
            com.umeng.socialize.bean.SHARE_MEDIA r0 = r5.mTarget
            java.lang.Throwable r1 = new java.lang.Throwable
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            com.umeng.socialize.bean.UmengErrorCode r3 = com.umeng.socialize.bean.UmengErrorCode.ShareFailed
            java.lang.String r3 = r3.getMessage()
            r2.append(r3)
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.AUTH.AUTH_DENIED
            java.lang.String r4 = com.umeng.socialize.utils.UrlUtil.WX_ERROR_SIGN
            java.lang.String r3 = com.umeng.socialize.utils.UmengText.errorWithUrl(r3, r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r6.onError(r0, r1)
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void release() {
            r1 = this;
            super.release()
            r0 = 0
            r1.mAuthListener = r0
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void setAuthListener(com.umeng.socialize.UMAuthListener r1) {
            r0 = this;
            super.setAuthListener(r1)
            r0.mAuthListener = r1
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean share(com.umeng.socialize.ShareContent r3, com.umeng.socialize.UMShareListener r4) {
            r2 = this;
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = r2.config
            if (r0 == 0) goto La
            com.umeng.socialize.bean.SHARE_MEDIA r0 = r0.getName()
            r2.mTarget = r0
        La:
            boolean r0 = r2.isInstall()
            r1 = 0
            if (r0 != 0) goto L39
            boolean r3 = com.umeng.socialize.Config.isJumptoAppStore
            if (r3 == 0) goto L30
            android.content.Intent r3 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r3.<init>(r0)
            java.lang.String r0 = "https://log.umsns.com/link/weixin/download/"
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r3.setData(r0)
            java.lang.ref.WeakReference<android.app.Activity> r0 = r2.mWeakAct
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            r0.startActivity(r3)
        L30:
            com.umeng.socialize.handler.UMWXHandler$11 r3 = new com.umeng.socialize.handler.UMWXHandler$11
            r3.<init>(r2, r4)
            com.umeng.socialize.common.QueuedWork.runInMain(r3)
            return r1
        L39:
            com.umeng.socialize.media.WeiXinShareContent r0 = new com.umeng.socialize.media.WeiXinShareContent
            r0.<init>(r3)
            com.umeng.socialize.UMShareConfig r3 = r2.mShareConfig
            if (r3 == 0) goto L49
            com.umeng.socialize.interfaces.CompressListener r3 = r3.getCompressListener()
            r0.setCompressListener(r3)
        L49:
            com.umeng.socialize.bean.SHARE_MEDIA r3 = r2.mTarget
            boolean r3 = r2.isAbleShareEmoji(r3, r0)
            if (r3 != 0) goto L5a
            com.umeng.socialize.handler.UMWXHandler$12 r3 = new com.umeng.socialize.handler.UMWXHandler$12
            r3.<init>(r2, r4)
            com.umeng.socialize.common.QueuedWork.runInMain(r3)
            return r1
        L5a:
            com.umeng.socialize.bean.SHARE_MEDIA r3 = r2.mTarget
            boolean r3 = r2.isAbleShareMin(r3, r0)
            if (r3 != 0) goto L6b
            com.umeng.socialize.handler.UMWXHandler$13 r3 = new com.umeng.socialize.handler.UMWXHandler$13
            r3.<init>(r2, r4)
            com.umeng.socialize.common.QueuedWork.runInMain(r3)
            return r1
        L6b:
            r2.umShareListener = r4
            boolean r3 = r2.shareTo(r0)
            return r3
    }
}

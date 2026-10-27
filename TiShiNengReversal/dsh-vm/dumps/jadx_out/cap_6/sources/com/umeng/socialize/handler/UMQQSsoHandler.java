package com.umeng.socialize.handler;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class UMQQSsoHandler extends com.umeng.socialize.handler.UMTencentSSOHandler {
    private static final java.lang.String TAG = "UMQQSsoHandler";
    private final java.lang.String UNIONID_PARAM;
    private final java.lang.String UNIONID_REQUEST_URL;
    private com.tencent.tauth.IUiListener holder;
    private com.tencent.tauth.IUiListener mShareListener;
    private com.umeng.socialize.handler.QQPreferences qqPreferences;







    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.umeng.socialize.handler.UMQQSsoHandler$5, reason: invalid class name */
    class AnonymousClass5 implements com.tencent.tauth.IUiListener {
        final /* synthetic */ com.umeng.socialize.handler.UMQQSsoHandler this$0;
        final /* synthetic */ com.umeng.socialize.UMAuthListener val$listener;


        AnonymousClass5(com.umeng.socialize.handler.UMQQSsoHandler r1, com.umeng.socialize.UMAuthListener r2) {
                r0 = this;
                r0.this$0 = r1
                r0.val$listener = r2
                r0.<init>()
                return
        }

        @Override // com.tencent.tauth.IUiListener
        public void onCancel() {
                r3 = this;
                com.umeng.socialize.handler.UMQQSsoHandler r0 = r3.this$0
                com.umeng.socialize.UMAuthListener r1 = r3.val$listener
                com.umeng.socialize.UMAuthListener r0 = r0.getAuthListener(r1)
                com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
                r2 = 0
                r0.onCancel(r1, r2)
                return
        }

        @Override // com.tencent.tauth.IUiListener
        public void onComplete(java.lang.Object r6) {
                r5 = this;
                com.umeng.socialize.handler.UMQQSsoHandler r0 = r5.this$0
                android.app.ProgressDialog r0 = r0.mProgressDialog
                com.umeng.socialize.utils.SocializeUtils.safeCloseDialog(r0)
                com.umeng.socialize.handler.UMQQSsoHandler r0 = r5.this$0
                android.os.Bundle r0 = r0.parseOauthData(r6)
                com.umeng.socialize.handler.UMQQSsoHandler r1 = r5.this$0
                com.umeng.socialize.handler.QQPreferences r1 = com.umeng.socialize.handler.UMQQSsoHandler.access$000(r1)
                if (r1 != 0) goto L33
                com.umeng.socialize.handler.UMQQSsoHandler r1 = r5.this$0
                android.content.Context r1 = r1.getContext()
                if (r1 == 0) goto L33
                com.umeng.socialize.handler.UMQQSsoHandler r1 = r5.this$0
                com.umeng.socialize.handler.QQPreferences r2 = new com.umeng.socialize.handler.QQPreferences
                com.umeng.socialize.handler.UMQQSsoHandler r3 = r5.this$0
                android.content.Context r3 = r3.getContext()
                com.umeng.socialize.bean.SHARE_MEDIA r4 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
                java.lang.String r4 = r4.toString()
                r2.<init>(r3, r4)
                com.umeng.socialize.handler.UMQQSsoHandler.access$002(r1, r2)
            L33:
                com.umeng.socialize.handler.UMQQSsoHandler r1 = r5.this$0
                com.umeng.socialize.handler.QQPreferences r1 = com.umeng.socialize.handler.UMQQSsoHandler.access$000(r1)
                if (r1 == 0) goto L48
                com.umeng.socialize.handler.UMQQSsoHandler r1 = r5.this$0
                com.umeng.socialize.handler.QQPreferences r1 = com.umeng.socialize.handler.UMQQSsoHandler.access$000(r1)
                com.umeng.socialize.handler.QQPreferences r1 = r1.setAuthData(r0)
                r1.commit()
            L48:
                com.umeng.socialize.handler.UMQQSsoHandler$5$1 r1 = new com.umeng.socialize.handler.UMQQSsoHandler$5$1
                r1.<init>(r5, r6, r0)
                r6 = 1
                com.umeng.socialize.common.QueuedWork.runInBack(r1, r6)
                return
        }

        @Override // com.tencent.tauth.IUiListener
        public void onError(com.tencent.tauth.UiError r6) {
                r5 = this;
                com.umeng.socialize.handler.UMQQSsoHandler r0 = r5.this$0
                com.umeng.socialize.UMAuthListener r1 = r5.val$listener
                com.umeng.socialize.UMAuthListener r0 = r0.getAuthListener(r1)
                com.umeng.socialize.bean.SHARE_MEDIA r1 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
                java.lang.Throwable r2 = new java.lang.Throwable
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                com.umeng.socialize.bean.UmengErrorCode r4 = com.umeng.socialize.bean.UmengErrorCode.AuthorizeFailed
                java.lang.String r4 = r4.getMessage()
                r3.append(r4)
                java.lang.String r4 = "==> errorCode = "
                r3.append(r4)
                int r4 = r6.errorCode
                r3.append(r4)
                java.lang.String r4 = ", errorMsg = "
                r3.append(r4)
                java.lang.String r4 = r6.errorMessage
                r3.append(r4)
                java.lang.String r4 = ", detail = "
                r3.append(r4)
                java.lang.String r6 = r6.errorDetail
                r3.append(r6)
                java.lang.String r6 = r3.toString()
                r2.<init>(r6)
                r6 = 0
                r0.onError(r1, r6, r2)
                return
        }

        @Override // com.tencent.tauth.IUiListener
        public void onWarning(int r1) {
                r0 = this;
                return
        }
    }





    public UMQQSsoHandler() {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "https://graph.qq.com/oauth2.0/me?access_token="
            r1.UNIONID_REQUEST_URL = r0
            java.lang.String r0 = "&unionid=1"
            r1.UNIONID_PARAM = r0
            r0 = 0
            r1.holder = r0
            return
    }

    static /* synthetic */ com.umeng.socialize.handler.QQPreferences access$000(com.umeng.socialize.handler.UMQQSsoHandler r0) {
            com.umeng.socialize.handler.QQPreferences r0 = r0.qqPreferences
            return r0
    }

    static /* synthetic */ com.umeng.socialize.handler.QQPreferences access$002(com.umeng.socialize.handler.UMQQSsoHandler r0, com.umeng.socialize.handler.QQPreferences r1) {
            r0.qqPreferences = r1
            return r1
    }

    static /* synthetic */ java.lang.String access$100(com.umeng.socialize.handler.UMQQSsoHandler r0, com.umeng.socialize.handler.QQPreferences r1) {
            java.lang.String r0 = r0.getAccessToken(r1)
            return r0
    }

    static /* synthetic */ void access$1000(com.umeng.socialize.handler.UMQQSsoHandler r0, java.util.Map r1) {
            r0.appendTokenToUserInfo(r1)
            return
    }

    static /* synthetic */ void access$1100(com.umeng.socialize.handler.UMQQSsoHandler r0) {
            r0.qqPreferencesDelete()
            return
    }

    static /* synthetic */ void access$1200(com.umeng.socialize.handler.UMQQSsoHandler r0, com.umeng.socialize.UMAuthListener r1) {
            r0.authAndFetchUserInfo(r1)
            return
    }

    static /* synthetic */ void access$1300(com.umeng.socialize.handler.UMQQSsoHandler r0, com.umeng.socialize.UMAuthListener r1) {
            r0.fetchUserInfo(r1)
            return
    }

    static /* synthetic */ java.lang.String access$200(com.umeng.socialize.handler.UMQQSsoHandler r0, java.lang.String r1) {
            java.lang.String r0 = r0.getUnionIdRequest(r1)
            return r0
    }

    static /* synthetic */ void access$300(com.umeng.socialize.handler.UMQQSsoHandler r0, java.lang.String r1) {
            r0.setmOpenid(r1)
            return
    }

    static /* synthetic */ void access$400(com.umeng.socialize.handler.UMQQSsoHandler r0, java.lang.String r1) {
            r0.setUnionid(r1)
            return
    }

    static /* synthetic */ void access$500(com.umeng.socialize.handler.UMQQSsoHandler r0, org.json.JSONObject r1) {
            r0.initOpenidAndToken(r1)
            return
    }

    static /* synthetic */ java.lang.String access$600(com.umeng.socialize.handler.UMQQSsoHandler r0, com.umeng.socialize.handler.QQPreferences r1) {
            java.lang.String r0 = r0.getUnionid(r1)
            return r0
    }

    static /* synthetic */ com.tencent.tauth.IUiListener access$700(com.umeng.socialize.handler.UMQQSsoHandler r0) {
            com.tencent.tauth.IUiListener r0 = r0.holder
            return r0
    }

    static /* synthetic */ com.tencent.tauth.IUiListener access$702(com.umeng.socialize.handler.UMQQSsoHandler r0, com.tencent.tauth.IUiListener r1) {
            r0.holder = r1
            return r1
    }

    static /* synthetic */ com.tencent.tauth.IUiListener access$800(com.umeng.socialize.handler.UMQQSsoHandler r0) {
            com.tencent.tauth.IUiListener r0 = r0.mShareListener
            return r0
    }

    static /* synthetic */ java.util.Map access$900(com.umeng.socialize.handler.UMQQSsoHandler r0, java.lang.String r1) throws org.json.JSONException {
            java.util.Map r0 = r0.parseUserInfo(r1)
            return r0
    }

    private void appendTokenToUserInfo(java.util.Map<java.lang.String, java.lang.String> r6) {
            r5 = this;
            if (r6 != 0) goto L3
            return
        L3:
            com.umeng.socialize.handler.QQPreferences r0 = r5.qqPreferences
            java.lang.String r0 = r5.getAccessToken(r0)
            com.umeng.socialize.handler.QQPreferences r1 = r5.qqPreferences
            java.lang.String r1 = r5.getOpenId(r1)
            com.umeng.socialize.handler.QQPreferences r2 = r5.qqPreferences
            java.lang.String r2 = r5.getExpiresIn(r2)
            com.umeng.socialize.handler.QQPreferences r3 = r5.qqPreferences
            java.lang.String r3 = r5.getUnionid(r3)
            java.lang.String r4 = "openid"
            r6.put(r4, r1)
            java.lang.String r4 = "uid"
            r6.put(r4, r1)
            java.lang.String r1 = "access_token"
            r6.put(r1, r0)
            java.lang.String r1 = "expires_in"
            r6.put(r1, r2)
            java.lang.String r1 = "accessToken"
            r6.put(r1, r0)
            java.lang.String r0 = "expiration"
            r6.put(r0, r2)
            java.lang.String r0 = "unionid"
            r6.put(r0, r3)
            return
    }

    private void authAndFetchUserInfo(com.umeng.socialize.UMAuthListener r2) {
            r1 = this;
            com.umeng.socialize.handler.UMQQSsoHandler$11 r0 = new com.umeng.socialize.handler.UMQQSsoHandler$11
            r0.<init>(r1, r2)
            r1.authorize(r0)
            return
    }

    private android.os.Bundle buildShareContent(com.umeng.socialize.ShareContent r3) {
            r2 = this;
            com.umeng.socialize.media.QQShareContent r0 = new com.umeng.socialize.media.QQShareContent
            r0.<init>(r3)
            com.umeng.socialize.UMShareConfig r3 = r2.mShareConfig
            if (r3 == 0) goto L10
            com.umeng.socialize.interfaces.CompressListener r3 = r3.getCompressListener()
            r0.setCompressListener(r3)
        L10:
            com.umeng.socialize.UMShareConfig r3 = r2.getShareConfig()
            boolean r3 = r3.isHideQzoneOnQQFriendList()
            com.umeng.socialize.UMShareConfig r1 = r2.getShareConfig()
            java.lang.String r1 = r1.getAppName()
            android.os.Bundle r3 = r0.buildParams(r3, r1)
            com.umeng.socialize.UMShareConfig r0 = r2.getShareConfig()
            java.lang.String r0 = r0.getAppName()
            java.lang.String r1 = "appName"
            r3.putString(r1, r0)
            return r3
    }

    private static java.lang.String convertStreamToString(java.io.InputStream r4) {
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r4)
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
        Lf:
            java.lang.String r2 = r0.readLine()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            if (r2 == 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r3.<init>()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r3.append(r2)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            java.lang.String r2 = "/n"
            r3.append(r2)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            r1.append(r2)     // Catch: java.lang.Throwable -> L2a java.io.IOException -> L2c
            goto Lf
        L2a:
            r0 = move-exception
            goto L40
        L2c:
            r0 = move-exception
            goto L37
        L2e:
            r4.close()     // Catch: java.io.IOException -> L32
            goto L3b
        L32:
            r4 = move-exception
            com.umeng.socialize.utils.SLog.error(r4)
            goto L3b
        L37:
            com.umeng.socialize.utils.SLog.error(r0)     // Catch: java.lang.Throwable -> L2a
            goto L2e
        L3b:
            java.lang.String r4 = r1.toString()
            return r4
        L40:
            r4.close()     // Catch: java.io.IOException -> L44
            goto L48
        L44:
            r4 = move-exception
            com.umeng.socialize.utils.SLog.error(r4)
        L48:
            throw r0
    }

    private void fetchUserInfo(com.umeng.socialize.UMAuthListener r5) {
            r4 = this;
            com.umeng.socialize.handler.QQPreferences r0 = r4.qqPreferences
            java.lang.String r0 = r4.getAccessToken(r0)
            com.tencent.tauth.Tencent r1 = r4.mTencent
            if (r1 == 0) goto L5b
            boolean r1 = r4.isValidAccessToken(r0)
            if (r1 == 0) goto L5b
            com.umeng.socialize.handler.QQPreferences r1 = r4.qqPreferences     // Catch: java.lang.Exception -> L39
            java.lang.String r1 = r4.getExpiresIn(r1)     // Catch: java.lang.Exception -> L39
            com.umeng.socialize.handler.QQPreferences r2 = r4.qqPreferences     // Catch: java.lang.Exception -> L39
            java.lang.String r2 = r4.getOpenId(r2)     // Catch: java.lang.Exception -> L39
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L39
            if (r3 != 0) goto L3b
            boolean r3 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L39
            if (r3 != 0) goto L3b
            boolean r3 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L39
            if (r3 != 0) goto L3b
            com.tencent.tauth.Tencent r3 = r4.mTencent     // Catch: java.lang.Exception -> L39
            r3.setAccessToken(r0, r1)     // Catch: java.lang.Exception -> L39
            com.tencent.tauth.Tencent r0 = r4.mTencent     // Catch: java.lang.Exception -> L39
            r0.setOpenId(r2)     // Catch: java.lang.Exception -> L39
            goto L3b
        L39:
            r0 = move-exception
            goto L52
        L3b:
            com.tencent.tauth.IUiListener r0 = r4.getFetchUserInfoListener(r5)     // Catch: java.lang.Exception -> L39
            com.tencent.connect.UserInfo r1 = new com.tencent.connect.UserInfo     // Catch: java.lang.Exception -> L39
            android.content.Context r2 = r4.getContext()     // Catch: java.lang.Exception -> L39
            com.tencent.tauth.Tencent r3 = r4.mTencent     // Catch: java.lang.Exception -> L39
            com.tencent.connect.auth.QQToken r3 = r3.getQQToken()     // Catch: java.lang.Exception -> L39
            r1.<init>(r2, r3)     // Catch: java.lang.Exception -> L39
            r1.getUserInfo(r0)     // Catch: java.lang.Exception -> L39
            return
        L52:
            com.umeng.socialize.handler.UMQQSsoHandler$8 r1 = new com.umeng.socialize.handler.UMQQSsoHandler$8
            r1.<init>(r4, r5, r0)
            com.umeng.socialize.common.QueuedWork.runInMain(r1)
            return
        L5b:
            com.umeng.socialize.handler.UMQQSsoHandler$9 r0 = new com.umeng.socialize.handler.UMQQSsoHandler$9
            r0.<init>(r4, r5)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
            return
    }

    private java.lang.String getAccessToken(com.umeng.socialize.handler.QQPreferences r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.lang.String r1 = r1.getmAccessToken()
            return r1
        L7:
            r1 = 0
            return r1
    }

    private java.lang.String getExpiresIn(com.umeng.socialize.handler.QQPreferences r3) {
            r2 = this;
            if (r3 == 0) goto L18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            long r0 = com.umeng.socialize.handler.QQPreferences.getExpiresIn()
            r3.append(r0)
            java.lang.String r0 = ""
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
        L18:
            r3 = 0
            return r3
    }

    private com.tencent.tauth.IUiListener getFetchUserInfoListener(com.umeng.socialize.UMAuthListener r2) {
            r1 = this;
            com.umeng.socialize.handler.UMQQSsoHandler$10 r0 = new com.umeng.socialize.handler.UMQQSsoHandler$10
            r0.<init>(r1, r2)
            return r0
    }

    private java.lang.String getOpenId(com.umeng.socialize.handler.QQPreferences r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.lang.String r1 = r1.getmUID()
            return r1
        L7:
            r1 = 0
            return r1
    }

    private com.tencent.tauth.IUiListener getQQSharelistener(com.umeng.socialize.UMShareListener r2) {
            r1 = this;
            com.umeng.socialize.handler.UMQQSsoHandler$4 r0 = new com.umeng.socialize.handler.UMQQSsoHandler$4
            r0.<init>(r1, r2)
            return r0
    }

    private java.lang.String getUnionIdRequest(java.lang.String r2) {
            r1 = this;
            java.net.URL r0 = new java.net.URL     // Catch: java.lang.Exception -> L1b
            r0.<init>(r2)     // Catch: java.lang.Exception -> L1b
            java.net.URLConnection r2 = r0.openConnection()     // Catch: java.lang.Exception -> L1b
            if (r2 != 0) goto Lc
            goto L1b
        Lc:
            r2.connect()     // Catch: java.lang.Exception -> L1b
            java.io.InputStream r2 = r2.getInputStream()     // Catch: java.lang.Exception -> L1b
            if (r2 != 0) goto L16
            goto L1b
        L16:
            java.lang.String r2 = convertStreamToString(r2)     // Catch: java.lang.Exception -> L1b
            return r2
        L1b:
            java.lang.String r2 = ""
            return r2
    }

    private java.lang.String getUnionid(com.umeng.socialize.handler.QQPreferences r1) {
            r0 = this;
            if (r1 == 0) goto L7
            java.lang.String r1 = r1.getUnionid()
            return r1
        L7:
            r1 = 0
            return r1
    }

    private void initOpenidAndToken(org.json.JSONObject r4) {
            r3 = this;
            java.lang.String r0 = "access_token"
            java.lang.String r0 = r4.getString(r0)     // Catch: java.lang.Exception -> L33
            java.lang.String r1 = "expires_in"
            java.lang.String r1 = r4.getString(r1)     // Catch: java.lang.Exception -> L33
            java.lang.String r2 = "openid"
            java.lang.String r4 = r4.getString(r2)     // Catch: java.lang.Exception -> L33
            com.tencent.tauth.Tencent r2 = r3.mTencent     // Catch: java.lang.Exception -> L33
            if (r2 == 0) goto L35
            boolean r2 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L33
            if (r2 != 0) goto L35
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L33
            if (r2 != 0) goto L35
            boolean r2 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Exception -> L33
            if (r2 != 0) goto L35
            com.tencent.tauth.Tencent r2 = r3.mTencent     // Catch: java.lang.Exception -> L33
            r2.setAccessToken(r0, r1)     // Catch: java.lang.Exception -> L33
            com.tencent.tauth.Tencent r0 = r3.mTencent     // Catch: java.lang.Exception -> L33
            r0.setOpenId(r4)     // Catch: java.lang.Exception -> L33
            return
        L33:
            r4 = move-exception
            goto L36
        L35:
            return
        L36:
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.QQ.OPENIDANDTOKEN
            com.umeng.socialize.utils.SLog.error(r0, r4)
            return
    }

    private boolean isValidAccessToken(java.lang.String r1) {
            r0 = this;
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            r1 = r1 ^ 1
            return r1
    }

    private void loginDeal() {
            r4 = this;
            boolean r0 = r4.isInstall()
            java.lang.String r1 = "all"
            if (r0 == 0) goto L3c
            java.lang.ref.WeakReference<android.app.Activity> r0 = r4.mWeakAct
            java.lang.Object r0 = r0.get()
            if (r0 == 0) goto L59
            java.lang.ref.WeakReference<android.app.Activity> r0 = r4.mWeakAct
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isFinishing()
            if (r0 != 0) goto L59
            com.tencent.tauth.IUiListener r0 = r4.holder
            if (r0 != 0) goto L2a
            com.umeng.socialize.UMAuthListener r0 = r4.mAuthListener
            com.tencent.tauth.IUiListener r0 = r4.getQQAuthlistener(r0)
            r4.holder = r0
        L2a:
            com.tencent.tauth.Tencent r0 = r4.mTencent
            if (r0 == 0) goto L59
            java.lang.ref.WeakReference<android.app.Activity> r2 = r4.mWeakAct
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            com.tencent.tauth.IUiListener r3 = r4.holder
            r0.login(r2, r1, r3)
            return
        L3c:
            com.tencent.tauth.IUiListener r0 = r4.holder
            if (r0 != 0) goto L48
            com.umeng.socialize.UMAuthListener r0 = r4.mAuthListener
            com.tencent.tauth.IUiListener r0 = r4.getQQAuthlistener(r0)
            r4.holder = r0
        L48:
            com.tencent.tauth.Tencent r0 = r4.mTencent
            if (r0 == 0) goto L59
            java.lang.ref.WeakReference<android.app.Activity> r2 = r4.mWeakAct
            java.lang.Object r2 = r2.get()
            android.app.Activity r2 = (android.app.Activity) r2
            com.tencent.tauth.IUiListener r3 = r4.holder
            r0.loginServerSide(r2, r1, r3)
        L59:
            return
    }

    private void onNotInstall(com.umeng.socialize.UMShareListener r3) {
            r2 = this;
            boolean r0 = com.umeng.socialize.Config.isJumptoAppStore
            if (r0 == 0) goto L1f
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.intent.action.VIEW"
            r0.<init>(r1)
            java.lang.String r1 = "https://log.umsns.com/link/qq/download/"
            android.net.Uri r1 = android.net.Uri.parse(r1)
            r0.setData(r1)
            java.lang.ref.WeakReference<android.app.Activity> r1 = r2.mWeakAct
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            r1.startActivity(r0)
        L1f:
            com.umeng.socialize.handler.UMQQSsoHandler$2 r0 = new com.umeng.socialize.handler.UMQQSsoHandler$2
            r0.<init>(r2, r3)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
            return
    }

    private void onShareParamsError(com.umeng.socialize.UMShareListener r2, java.lang.String r3) {
            r1 = this;
            com.umeng.socialize.handler.UMQQSsoHandler$3 r0 = new com.umeng.socialize.handler.UMQQSsoHandler$3
            r0.<init>(r1, r2, r3)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
            return
    }

    private java.util.Map<java.lang.String, java.lang.String> parseUserInfo(java.lang.String r5) throws org.json.JSONException {
            r4 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r1 = "nickname"
            java.lang.String r2 = r0.optString(r1)
            java.lang.String r3 = "screen_name"
            r5.put(r3, r2)
            java.lang.String r2 = "name"
            java.lang.String r1 = r0.optString(r1)
            r5.put(r2, r1)
            java.lang.String r1 = "gender"
            java.lang.String r2 = r0.optString(r1)
            java.lang.String r2 = r4.getGender(r2)
            r5.put(r1, r2)
            java.lang.String r1 = "figureurl_qq_2"
            java.lang.String r2 = r0.optString(r1)
            java.lang.String r3 = "profile_image_url"
            r5.put(r3, r2)
            java.lang.String r2 = "iconurl"
            java.lang.String r1 = r0.optString(r1)
            r5.put(r2, r1)
            java.lang.String r1 = "is_yellow_year_vip"
            java.lang.String r2 = r0.optString(r1)
            r5.put(r1, r2)
            java.lang.String r1 = "yellow_vip_level"
            java.lang.String r2 = r0.optString(r1)
            r5.put(r1, r2)
            java.lang.String r1 = "msg"
            java.lang.String r2 = r0.optString(r1)
            r5.put(r1, r2)
            java.lang.String r1 = "city"
            java.lang.String r2 = r0.optString(r1)
            r5.put(r1, r2)
            java.lang.String r1 = "vip"
            java.lang.String r2 = r0.optString(r1)
            r5.put(r1, r2)
            java.lang.String r1 = "ret"
            java.lang.String r2 = r0.optString(r1)
            r5.put(r1, r2)
            java.lang.String r1 = "level"
            java.lang.String r2 = r0.optString(r1)
            r5.put(r1, r2)
            java.lang.String r1 = "province"
            java.lang.String r2 = r0.optString(r1)
            r5.put(r1, r2)
            java.lang.String r1 = "is_yellow_vip"
            java.lang.String r0 = r0.optString(r1)
            r5.put(r1, r0)
            return r5
    }

    private void qqPreferencesDelete() {
            r1 = this;
            com.umeng.socialize.handler.QQPreferences r0 = r1.qqPreferences
            if (r0 == 0) goto L7
            r0.delete()
        L7:
            return
    }

    private void setUnionid(java.lang.String r2) {
            r1 = this;
            com.umeng.socialize.handler.QQPreferences r0 = r1.qqPreferences
            if (r0 == 0) goto L7
            r0.setUnionid(r2)
        L7:
            return
    }

    private void setmOpenid(java.lang.String r2) {
            r1 = this;
            com.umeng.socialize.handler.QQPreferences r0 = r1.qqPreferences
            if (r0 == 0) goto L7
            r0.setmOpenid(r2)
        L7:
            return
    }

    private void shareToQQ(android.os.Bundle r4) {
            r3 = this;
            boolean r0 = r3.validTencent()
            if (r0 == 0) goto Lf
            com.umeng.socialize.handler.UMQQSsoHandler$7 r0 = new com.umeng.socialize.handler.UMQQSsoHandler$7
            r0.<init>(r3, r4)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
            return
        Lf:
            com.tencent.tauth.IUiListener r4 = r3.mShareListener
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            r1 = -1
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.QQ.QQ_ERROR
            r0.<init>(r1, r2, r2)
            r4.onError(r0)
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void authorize(com.umeng.socialize.UMAuthListener r1) {
            r0 = this;
            r0.mAuthListener = r1
            r0.loginDeal()
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void deleteAuth(com.umeng.socialize.UMAuthListener r3) {
            r2 = this;
            com.tencent.tauth.Tencent r0 = r2.mTencent
            if (r0 == 0) goto Lb
            android.content.Context r1 = r2.getContext()
            r0.logout(r1)
        Lb:
            r2.qqPreferencesDelete()
            com.umeng.socialize.handler.UMQQSsoHandler$6 r0 = new com.umeng.socialize.handler.UMQQSsoHandler$6
            r0.<init>(r2, r3)
            com.umeng.socialize.common.QueuedWork.runInMain(r0)
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void getPlatformInfo(com.umeng.socialize.UMAuthListener r2) {
            r1 = this;
            boolean r0 = r1.isAuthorize()
            if (r0 == 0) goto L14
            com.umeng.socialize.UMShareConfig r0 = r1.getShareConfig()
            boolean r0 = r0.isNeedAuthOnGetUserInfo()
            if (r0 != 0) goto L14
            r1.fetchUserInfo(r2)
            return
        L14:
            r1.authAndFetchUserInfo(r2)
            return
    }

    protected com.tencent.tauth.IUiListener getQQAuthlistener(com.umeng.socialize.UMAuthListener r2) {
            r1 = this;
            com.umeng.socialize.handler.UMQQSsoHandler$5 r0 = new com.umeng.socialize.handler.UMQQSsoHandler$5
            r0.<init>(r1, r2)
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public int getRequestCode() {
            r1 = this;
            r0 = 10103(0x2777, float:1.4157E-41)
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public java.lang.String getSDKVersion() {
            r1 = this;
            java.lang.String r0 = "3.1.0"
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isAuthorize() {
            r1 = this;
            com.umeng.socialize.handler.QQPreferences r0 = r1.qqPreferences
            if (r0 == 0) goto L9
            boolean r0 = r0.isAuthValid()
            return r0
        L9:
            r0 = 0
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
            r2 = this;
            com.tencent.tauth.Tencent r0 = r2.mTencent
            if (r0 == 0) goto L15
            java.lang.ref.WeakReference<android.app.Activity> r1 = r2.mWeakAct
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r0.isSupportSSOLogin(r1)
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public boolean isSupport() {
            r2 = this;
            com.tencent.tauth.Tencent r0 = r2.mTencent
            if (r0 == 0) goto L14
            java.lang.ref.WeakReference<android.app.Activity> r1 = r2.mWeakAct
            java.lang.Object r1 = r1.get()
            android.app.Activity r1 = (android.app.Activity) r1
            boolean r0 = r0.isSupportSSOLogin(r1)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
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
    public void onActivityResult(int r2, int r3, android.content.Intent r4) {
            r1 = this;
            r0 = 10103(0x2777, float:1.4157E-41)
            if (r2 != r0) goto L9
            com.tencent.tauth.IUiListener r0 = r1.mShareListener
            com.tencent.tauth.Tencent.onActivityResultData(r2, r3, r4, r0)
        L9:
            r0 = 11101(0x2b5d, float:1.5556E-41)
            if (r2 != r0) goto L1e
            com.tencent.tauth.IUiListener r0 = r1.holder
            if (r0 != 0) goto L19
            com.umeng.socialize.UMAuthListener r0 = r1.mAuthListener
            com.tencent.tauth.IUiListener r0 = r1.getQQAuthlistener(r0)
            r1.holder = r0
        L19:
            com.tencent.tauth.IUiListener r0 = r1.holder
            com.tencent.tauth.Tencent.onActivityResultData(r2, r3, r4, r0)
        L1e:
            return
    }

    @Override // com.umeng.socialize.handler.UMTencentSSOHandler, com.umeng.socialize.handler.UMSSOHandler
    public void onCreate(android.content.Context r2, com.umeng.socialize.PlatformConfig.Platform r3) {
            r1 = this;
            super.onCreate(r2, r3)
            if (r2 == 0) goto L12
            com.umeng.socialize.handler.QQPreferences r3 = new com.umeng.socialize.handler.QQPreferences
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            java.lang.String r0 = r0.toString()
            r3.<init>(r2, r0)
            r1.qqPreferences = r3
        L12:
            return
    }

    @Override // com.umeng.socialize.handler.UMSSOHandler
    public void release() {
            r1 = this;
            super.release()
            com.tencent.tauth.IUiListener r0 = r1.holder
            if (r0 == 0) goto La
            r0 = 0
            r1.holder = r0
        La:
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
    public boolean share(com.umeng.socialize.ShareContent r4, com.umeng.socialize.UMShareListener r5) {
            r3 = this;
            com.tencent.tauth.Tencent r0 = r3.mTencent
            r1 = 0
            if (r0 != 0) goto Le
            com.umeng.socialize.handler.UMQQSsoHandler$1 r4 = new com.umeng.socialize.handler.UMQQSsoHandler$1
            r4.<init>(r3, r5)
            com.umeng.socialize.common.QueuedWork.runInMain(r4)
            return r1
        Le:
            boolean r0 = r3.isInstall()
            if (r0 != 0) goto L18
            r3.onNotInstall(r5)
            return r1
        L18:
            android.os.Bundle r4 = r3.buildShareContent(r4)
            java.lang.String r0 = "error"
            java.lang.String r0 = r4.getString(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L2c
            r3.onShareParamsError(r5, r0)
            return r1
        L2c:
            com.tencent.tauth.IUiListener r5 = r3.getQQSharelistener(r5)
            r3.mShareListener = r5
            r3.shareToQQ(r4)
            return r1
    }
}

package com.tencent.open;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocialApiIml extends com.tencent.connect.common.BaseApi {
    private android.app.Activity a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class a extends com.tencent.tauth.DefaultUiListener {
        final /* synthetic */ com.tencent.open.SocialApiIml a;
        private com.tencent.tauth.IUiListener b;
        private java.lang.String c;
        private java.lang.String d;
        private android.os.Bundle e;
        private android.app.Activity f;

        a(com.tencent.open.SocialApiIml r1, android.app.Activity r2, com.tencent.tauth.IUiListener r3, java.lang.String r4, java.lang.String r5, android.os.Bundle r6) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                r0.b = r3
                r0.c = r4
                r0.d = r5
                r0.e = r6
                r0.f = r2
                return
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onCancel() {
                r1 = this;
                com.tencent.tauth.IUiListener r0 = r1.b
                r0.onCancel()
                return
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onComplete(java.lang.Object r10) {
                r9 = this;
                java.lang.String r1 = "openSDK_LOG.SocialApiIml"
                org.json.JSONObject r10 = (org.json.JSONObject) r10
                java.lang.String r0 = "encry_token"
                java.lang.String r10 = r10.getString(r0)     // Catch: org.json.JSONException -> Lb
                goto L13
            Lb:
                r0 = move-exception
                r10 = r0
                java.lang.String r0 = "OpenApi, EncrytokenListener() onComplete error"
                com.tencent.open.log.SLog.e(r1, r0, r10)
                r10 = 0
            L13:
                android.os.Bundle r0 = r9.e
                java.lang.String r2 = "encrytoken"
                r0.putString(r2, r10)
                com.tencent.open.SocialApiIml r3 = r9.a
                android.app.Activity r4 = com.tencent.open.SocialApiIml.a(r3)
                java.lang.String r5 = r9.c
                android.os.Bundle r6 = r9.e
                java.lang.String r7 = r9.d
                com.tencent.tauth.IUiListener r8 = r9.b
                com.tencent.open.SocialApiIml.a(r3, r4, r5, r6, r7, r8)
                boolean r10 = android.text.TextUtils.isEmpty(r10)
                if (r10 == 0) goto L3d
                java.lang.String r10 = "The token get from qq or qzone is empty. Write temp token to localstorage."
                com.tencent.open.log.SLog.d(r1, r10)
                com.tencent.open.SocialApiIml r10 = r9.a
                android.app.Activity r0 = r9.f
                r10.writeEncryToken(r0)
            L3d:
                return
        }

        @Override // com.tencent.tauth.DefaultUiListener, com.tencent.tauth.IUiListener
        public void onError(com.tencent.tauth.UiError r3) {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "OpenApi, EncryptTokenListener() onError"
                r0.append(r1)
                java.lang.String r1 = r3.errorMessage
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                java.lang.String r1 = "openSDK_LOG.SocialApiIml"
                com.tencent.open.log.SLog.d(r1, r0)
                com.tencent.tauth.IUiListener r0 = r2.b
                r0.onError(r3)
                return
        }
    }

    public SocialApiIml(com.tencent.connect.auth.QQToken r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public SocialApiIml(com.tencent.connect.auth.c r1, com.tencent.connect.auth.QQToken r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    static /* synthetic */ android.app.Activity a(com.tencent.open.SocialApiIml r0) {
            android.app.Activity r0 = r0.a
            return r0
    }

    private void a(android.app.Activity r3, android.content.Intent r4, java.lang.String r5, android.os.Bundle r6, com.tencent.tauth.IUiListener r7) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "-->handleIntentWithAgent action = "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "openSDK_LOG.SocialApiIml"
            com.tencent.open.log.SLog.i(r1, r0)
            java.lang.String r0 = "key_action"
            r4.putExtra(r0, r5)
            java.lang.String r5 = "key_params"
            r4.putExtra(r5, r6)
            com.tencent.connect.common.UIListenerManager r5 = com.tencent.connect.common.UIListenerManager.getInstance()
            r6 = 11105(0x2b61, float:1.5561E-41)
            r5.setListenerWithRequestcode(r6, r7)
            r2.a(r3, r4, r6)
            return
    }

    private void a(android.app.Activity r9, android.content.Intent r10, java.lang.String r11, android.os.Bundle r12, java.lang.String r13, com.tencent.tauth.IUiListener r14, boolean r15) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "-->handleIntent action = "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r1 = ", activityIntent = null ? "
            r0.append(r1)
            if (r10 != 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "openSDK_LOG.SocialApiIml"
            com.tencent.open.log.SLog.i(r1, r0)
            if (r10 == 0) goto L30
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r14
            r2.a(r3, r4, r5, r6, r7)
            r9 = r2
            return
        L30:
            r10 = r9
            r9 = r8
            android.content.Context r0 = com.tencent.open.utils.g.a()
            com.tencent.connect.auth.QQToken r1 = r9.c
            java.lang.String r1 = r1.getAppId()
            com.tencent.open.utils.i r0 = com.tencent.open.utils.i.a(r0, r1)
            if (r15 != 0) goto L4f
            java.lang.String r15 = "C_LoginH5"
            boolean r15 = r0.b(r15)
            if (r15 == 0) goto L4b
            goto L4f
        L4b:
            r8.a(r10, r12, r14)
            return
        L4f:
            r9.a(r10, r11, r12, r13, r14)
            return
    }

    private void a(android.app.Activity r10, java.lang.String r11, android.os.Bundle r12, com.tencent.tauth.IUiListener r13) {
            r9 = this;
            r9.a = r10
            java.lang.String r0 = "com.tencent.open.agent.SocialFriendChooser"
            android.content.Intent r0 = r9.c(r0)
            if (r0 != 0) goto L17
            java.lang.String r0 = "openSDK_LOG.SocialApiIml"
            java.lang.String r1 = "--askgift--friend chooser not found"
            com.tencent.open.log.SLog.i(r0, r1)
            java.lang.String r0 = "com.tencent.open.agent.RequestFreegiftActivity"
            android.content.Intent r0 = r9.c(r0)
        L17:
            r3 = r0
            android.os.Bundle r0 = r9.b()
            r12.putAll(r0)
            java.lang.String r0 = "action_ask"
            boolean r0 = r0.equals(r11)
            java.lang.String r1 = "type"
            if (r0 == 0) goto L2f
            java.lang.String r0 = "request"
            r12.putString(r1, r0)
            goto L3c
        L2f:
            java.lang.String r0 = "action_gift"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L3c
            java.lang.String r0 = "freegift"
            r12.putString(r1, r0)
        L3c:
            com.tencent.open.utils.j r0 = com.tencent.open.utils.j.a()
            android.content.Context r1 = com.tencent.open.utils.g.a()
            java.lang.String r2 = "https://imgcache.qq.com/open/mobile/request/sdk_request.html?"
            java.lang.String r6 = r0.a(r1, r2)
            r8 = 0
            r1 = r9
            r2 = r10
            r4 = r11
            r5 = r12
            r7 = r13
            r1.a(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    private void a(android.app.Activity r10, java.lang.String r11, android.os.Bundle r12, java.lang.String r13, com.tencent.tauth.IUiListener r14) {
            r9 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "-->handleIntentWithH5 action = "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "openSDK_LOG.SocialApiIml"
            com.tencent.open.log.SLog.i(r1, r0)
            android.content.Intent r0 = r9.c()
            com.tencent.open.SocialApiIml$a r2 = new com.tencent.open.SocialApiIml$a
            r3 = r9
            r4 = r10
            r6 = r11
            r8 = r12
            r7 = r13
            r5 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            java.lang.String r10 = "com.tencent.open.agent.EncryTokenActivity"
            android.content.Intent r10 = r9.b(r10)
            if (r10 == 0) goto L8b
            if (r0 == 0) goto L8b
            android.content.ComponentName r11 = r0.getComponent()
            if (r11 == 0) goto L8b
            android.content.ComponentName r11 = r10.getComponent()
            if (r11 == 0) goto L8b
            android.content.ComponentName r11 = r0.getComponent()
            java.lang.String r11 = r11.getPackageName()
            android.content.ComponentName r12 = r10.getComponent()
            java.lang.String r12 = r12.getPackageName()
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L8b
            com.tencent.connect.auth.QQToken r11 = r3.c
            java.lang.String r11 = r11.getAppId()
            java.lang.String r12 = "oauth_consumer_key"
            r10.putExtra(r12, r11)
            com.tencent.connect.auth.QQToken r11 = r3.c
            java.lang.String r11 = r11.getOpenId()
            java.lang.String r12 = "openid"
            r10.putExtra(r12, r11)
            com.tencent.connect.auth.QQToken r11 = r3.c
            java.lang.String r11 = r11.getAccessToken()
            java.lang.String r12 = "access_token"
            r10.putExtra(r12, r11)
            java.lang.String r11 = "key_action"
            java.lang.String r12 = "action_check_token"
            r10.putExtra(r11, r12)
            java.lang.String r11 = "-->handleIntentWithH5--found token activity"
            com.tencent.open.log.SLog.i(r1, r11)
            com.tencent.connect.common.UIListenerManager r11 = com.tencent.connect.common.UIListenerManager.getInstance()
            r12 = 11106(0x2b62, float:1.5563E-41)
            r11.setListenerWithRequestcode(r12, r2)
            r9.a(r4, r10, r12)
            return
        L8b:
            java.lang.String r10 = "-->handleIntentWithH5--token activity not found"
            com.tencent.open.log.SLog.i(r1, r10)
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "tencent&sdk&qazxc***14969%%"
            r10.append(r11)
            com.tencent.connect.auth.QQToken r11 = r3.c
            java.lang.String r11 = r11.getAccessToken()
            r10.append(r11)
            com.tencent.connect.auth.QQToken r11 = r3.c
            java.lang.String r11 = r11.getAppId()
            r10.append(r11)
            com.tencent.connect.auth.QQToken r11 = r3.c
            java.lang.String r11 = r11.getOpenId()
            r10.append(r11)
            java.lang.String r11 = "qzone3.4"
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.String r10 = com.tencent.open.utils.m.g(r10)
            org.json.JSONObject r11 = new org.json.JSONObject
            r11.<init>()
            java.lang.String r12 = "encry_token"
            r11.put(r12, r10)     // Catch: org.json.JSONException -> Lcc
        Lcc:
            r2.onComplete(r11)
            return
    }

    private void a(android.content.Context r11, java.lang.String r12, android.os.Bundle r13, java.lang.String r14, com.tencent.tauth.IUiListener r15) {
            r10 = this;
            java.lang.String r0 = "openmobile_android"
            java.lang.String r1 = "pf"
            java.lang.String r2 = "OpenUi, showDialog --start"
            java.lang.String r3 = "openSDK_LOG.SocialApiIml"
            com.tencent.open.log.SLog.v(r3, r2)
            android.webkit.CookieSyncManager.createInstance(r11)
            com.tencent.connect.auth.QQToken r11 = r10.c
            java.lang.String r11 = r11.getAppId()
            java.lang.String r2 = "oauth_consumer_key"
            r13.putString(r2, r11)
            com.tencent.connect.auth.QQToken r11 = r10.c
            boolean r11 = r11.isSessionValid()
            if (r11 == 0) goto L2c
            com.tencent.connect.auth.QQToken r11 = r10.c
            java.lang.String r11 = r11.getAccessToken()
            java.lang.String r2 = "access_token"
            r13.putString(r2, r11)
        L2c:
            com.tencent.connect.auth.QQToken r11 = r10.c
            java.lang.String r11 = r11.getOpenId()
            if (r11 == 0) goto L39
            java.lang.String r2 = "openid"
            r13.putString(r2, r11)
        L39:
            android.content.Context r11 = com.tencent.open.utils.g.a()     // Catch: java.lang.Exception -> L4c
            java.lang.String r2 = "pfStore"
            r4 = 0
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r2, r4)     // Catch: java.lang.Exception -> L4c
            java.lang.String r11 = r11.getString(r1, r0)     // Catch: java.lang.Exception -> L4c
            r13.putString(r1, r11)     // Catch: java.lang.Exception -> L4c
            goto L4f
        L4c:
            r13.putString(r1, r0)
        L4f:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r14)
            java.lang.String r13 = com.tencent.open.utils.HttpUtils.encodeUrl(r13)
            r11.append(r13)
            java.lang.String r7 = r11.toString()
            java.lang.String r11 = "OpenUi, showDialog TDialog"
            com.tencent.open.log.SLog.d(r3, r11)
            java.lang.String r11 = "action_challenge"
            boolean r11 = r11.equals(r12)
            if (r11 != 0) goto L77
            java.lang.String r11 = "action_brag"
            boolean r11 = r11.equals(r12)
            if (r11 == 0) goto L7a
        L77:
            r6 = r12
            r8 = r15
            goto L89
        L7a:
            com.tencent.open.TDialog r4 = new com.tencent.open.TDialog
            android.app.Activity r5 = r10.a
            com.tencent.connect.auth.QQToken r9 = r10.c
            r6 = r12
            r8 = r15
            r4.<init>(r5, r6, r7, r8, r9)
            r4.show()
            goto L9a
        L89:
            java.lang.String r11 = "OpenUi, showDialog PKDialog"
            com.tencent.open.log.SLog.d(r3, r11)
            com.tencent.open.d r4 = new com.tencent.open.d
            android.app.Activity r5 = r10.a
            com.tencent.connect.auth.QQToken r9 = r10.c
            r4.<init>(r5, r6, r7, r8, r9)
            r4.show()
        L9a:
            return
    }

    static /* synthetic */ void a(com.tencent.open.SocialApiIml r0, android.content.Context r1, java.lang.String r2, android.os.Bundle r3, java.lang.String r4, com.tencent.tauth.IUiListener r5) {
            r0.a(r1, r2, r3, r4, r5)
            return
    }

    public void ask(android.app.Activity r2, android.os.Bundle r3, com.tencent.tauth.IUiListener r4) {
            r1 = this;
            java.lang.String r0 = "action_ask"
            r1.a(r2, r0, r3, r4)
            return
    }

    @Override // com.tencent.connect.common.BaseApi
    protected android.content.Intent b(java.lang.String r5) {
            r4 = this;
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.minihd.qq"
            r0.setClassName(r1, r5)
            android.content.Context r1 = com.tencent.open.utils.g.a()
            boolean r1 = com.tencent.open.utils.m.c(r1)
            if (r1 == 0) goto L1f
            android.content.Context r1 = com.tencent.open.utils.g.a()
            boolean r1 = com.tencent.open.utils.k.a(r1, r0)
            if (r1 == 0) goto L1f
            return r0
        L1f:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.tencent.mobileqq"
            r0.setClassName(r1, r5)
            android.content.Context r1 = com.tencent.open.utils.g.a()
            boolean r1 = com.tencent.open.utils.k.a(r1, r0)
            if (r1 == 0) goto L40
            android.content.Context r1 = com.tencent.open.utils.g.a()
            java.lang.String r2 = "4.7"
            int r1 = com.tencent.open.utils.k.c(r1, r2)
            if (r1 < 0) goto L40
            return r0
        L40:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            java.lang.String r1 = "com.qzone"
            r0.setClassName(r1, r5)
            android.content.Context r5 = com.tencent.open.utils.g.a()
            boolean r5 = com.tencent.open.utils.k.a(r5, r0)
            r2 = 0
            if (r5 == 0) goto L7a
            android.content.Context r5 = com.tencent.open.utils.g.a()
            java.lang.String r5 = com.tencent.open.utils.k.a(r5, r1)
            java.lang.String r1 = "4.2"
            int r5 = com.tencent.open.utils.k.a(r5, r1)
            if (r5 < 0) goto L7a
            android.content.Context r5 = com.tencent.open.utils.g.a()
            android.content.ComponentName r1 = r0.getComponent()
            java.lang.String r1 = r1.getPackageName()
            java.lang.String r3 = "ec96e9ac1149251acbb1b0c5777cae95"
            boolean r5 = com.tencent.open.utils.k.a(r5, r1, r3)
            if (r5 == 0) goto L7a
            return r0
        L7a:
            return r2
    }

    public void gift(android.app.Activity r2, android.os.Bundle r3, com.tencent.tauth.IUiListener r4) {
            r1 = this;
            java.lang.String r0 = "action_gift"
            r1.a(r2, r0, r3, r4)
            return
    }

    public void invite(android.app.Activity r10, android.os.Bundle r11, com.tencent.tauth.IUiListener r12) {
            r9 = this;
            r9.a = r10
            java.lang.String r0 = "com.tencent.open.agent.SocialFriendChooser"
            android.content.Intent r0 = r9.c(r0)
            if (r0 != 0) goto L17
            java.lang.String r0 = "openSDK_LOG.SocialApiIml"
            java.lang.String r1 = "--invite--friend chooser not found"
            com.tencent.open.log.SLog.i(r0, r1)
            java.lang.String r0 = "com.tencent.open.agent.AppInvitationActivity"
            android.content.Intent r0 = r9.c(r0)
        L17:
            r3 = r0
            android.os.Bundle r0 = r9.b()
            r11.putAll(r0)
            com.tencent.open.utils.j r0 = com.tencent.open.utils.j.a()
            android.content.Context r1 = com.tencent.open.utils.g.a()
            java.lang.String r2 = "https://imgcache.qq.com/open/mobile/invite/sdk_invite.html?"
            java.lang.String r6 = r0.a(r1, r2)
            java.lang.String r4 = "action_invite"
            r8 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r7 = r12
            r1.a(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    public void story(android.app.Activity r10, android.os.Bundle r11, com.tencent.tauth.IUiListener r12) {
            r9 = this;
            r9.a = r10
            java.lang.String r0 = "com.tencent.open.agent.SendStoryActivity"
            android.content.Intent r3 = r9.c(r0)
            android.os.Bundle r0 = r9.b()
            r11.putAll(r0)
            com.tencent.open.utils.j r0 = com.tencent.open.utils.j.a()
            android.content.Context r1 = com.tencent.open.utils.g.a()
            java.lang.String r2 = "https://imgcache.qq.com/open/mobile/sendstory/sdk_sendstory_v1.3.html?"
            java.lang.String r6 = r0.a(r1, r2)
            java.lang.String r4 = "action_story"
            r8 = 0
            r1 = r9
            r2 = r10
            r5 = r11
            r7 = r12
            r1.a(r2, r3, r4, r5, r6, r7, r8)
            return
    }

    @android.annotation.SuppressLint({"SetJavaScriptEnabled"})
    public void writeEncryToken(android.content.Context r8) {
            r7 = this;
            com.tencent.connect.auth.QQToken r0 = r7.c
            java.lang.String r0 = r0.getAccessToken()
            com.tencent.connect.auth.QQToken r1 = r7.c
            java.lang.String r1 = r1.getAppId()
            com.tencent.connect.auth.QQToken r2 = r7.c
            java.lang.String r2 = r2.getOpenId()
            if (r0 == 0) goto L4b
            int r3 = r0.length()
            if (r3 <= 0) goto L4b
            if (r1 == 0) goto L4b
            int r3 = r1.length()
            if (r3 <= 0) goto L4b
            if (r2 == 0) goto L4b
            int r3 = r2.length()
            if (r3 <= 0) goto L4b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "tencent&sdk&qazxc***14969%%"
            r3.append(r4)
            r3.append(r0)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r0 = "qzone3.4"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            java.lang.String r0 = com.tencent.open.utils.m.g(r0)
            goto L4c
        L4b:
            r0 = 0
        L4c:
            com.tencent.open.c.b r1 = new com.tencent.open.c.b
            r1.<init>(r8)
            android.webkit.WebSettings r2 = r1.getSettings()
            r3 = 1
            r2.setDomStorageEnabled(r3)
            r2.setDatabaseEnabled(r3)
            com.tencent.open.web.a.a(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "<!DOCTYPE HTML><html lang=\"en-US\"><head><meta charset=\"UTF-8\"><title>localStorage Test</title><script type=\"text/javascript\">document.domain = 'qq.com';localStorage[\""
            r2.append(r3)
            com.tencent.connect.auth.QQToken r3 = r7.c
            java.lang.String r3 = r3.getOpenId()
            r2.append(r3)
            java.lang.String r3 = "_"
            r2.append(r3)
            com.tencent.connect.auth.QQToken r3 = r7.c
            java.lang.String r3 = r3.getAppId()
            r2.append(r3)
            java.lang.String r3 = "\"]=\""
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = "\";</script></head><body></body></html>"
            r2.append(r0)
            java.lang.String r3 = r2.toString()
            com.tencent.open.utils.j r0 = com.tencent.open.utils.j.a()
            java.lang.String r2 = "https://imgcache.qq.com"
            java.lang.String r2 = r0.a(r8, r2)
            java.lang.String r4 = "text/html"
            java.lang.String r5 = "utf-8"
            r6 = r2
            r1.loadDataWithBaseURL(r2, r3, r4, r5, r6)
            return
    }
}

package com.tencent.open;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class SocialOperation extends com.tencent.connect.common.BaseApi {
    public static final java.lang.String GAME_FRIEND_ADD_MESSAGE = "add_msg";
    public static final java.lang.String GAME_FRIEND_LABEL = "friend_label";
    public static final java.lang.String GAME_FRIEND_OPENID = "fopen_id";
    public static final java.lang.String GAME_SIGNATURE = "signature";
    public static final java.lang.String GAME_UNION_ID = "unionid";
    public static final java.lang.String GAME_UNION_NAME = "union_name";
    public static final java.lang.String GAME_ZONE_ID = "zoneid";




    public SocialOperation(com.tencent.connect.auth.QQToken r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private void a(android.app.Activity r2) {
            r1 = this;
            java.lang.String r0 = ""
            r1.a(r2, r0)
            return
    }

    private void a(android.app.Activity r7, java.lang.String r8) {
            r6 = this;
            com.tencent.open.TDialog r0 = new com.tencent.open.TDialog
            java.lang.String r3 = r6.a(r8)
            r4 = 0
            com.tencent.connect.auth.QQToken r5 = r6.c
            java.lang.String r2 = ""
            r1 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            r0.show()
            return
    }

    static /* synthetic */ void a(com.tencent.open.SocialOperation r0, android.app.Activity r1) {
            r0.a(r1)
            return
    }

    static /* synthetic */ void a(com.tencent.open.SocialOperation r0, android.app.Activity r1, int r2, android.content.Intent r3, boolean r4) {
            r0.a(r1, r2, r3, r4)
            return
    }

    static /* synthetic */ void b(com.tencent.open.SocialOperation r0, android.app.Activity r1, int r2, android.content.Intent r3, boolean r4) {
            r0.a(r1, r2, r3, r4)
            return
    }

    public void bindQQGroup(android.app.Activity r10, java.lang.String r11, java.lang.String r12, com.tencent.tauth.IUiListener r13) {
            r9 = this;
            java.lang.String r0 = "-->bindQQGroup()  -- start"
            java.lang.String r1 = "openSDK_LOG.GameAppOperation"
            com.tencent.open.log.SLog.i(r1, r0)
            boolean r0 = com.tencent.connect.a.a(r1, r13)
            if (r0 == 0) goto Lf
            goto Lc3
        Lf:
            if (r10 != 0) goto L27
            java.lang.String r10 = "-->bindQQGroup, activity is empty."
            com.tencent.open.log.SLog.e(r1, r10)
            if (r13 == 0) goto Lc3
            com.tencent.tauth.UiError r10 = new com.tencent.tauth.UiError
            java.lang.String r11 = "param acitivty is null"
            java.lang.String r12 = "activity param of api can not be null."
            r0 = 1001(0x3e9, float:1.403E-42)
            r10.<init>(r0, r11, r12)
            r13.onError(r10)
            return
        L27:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            java.lang.String r2 = "mqqapi://opensdk/bind_group?src_type=app&version=1"
            r0.<init>(r2)
            com.tencent.connect.auth.QQToken r2 = r9.c
            java.lang.String r2 = r2.getAppId()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r4 = "please login."
            if (r3 == 0) goto L50
            java.lang.String r10 = "-->bindQQGroup, appId is empty."
            com.tencent.open.log.SLog.e(r1, r10)
            if (r13 == 0) goto Lc3
            com.tencent.tauth.UiError r10 = new com.tencent.tauth.UiError
            r11 = 1003(0x3eb, float:1.406E-42)
            java.lang.String r12 = "appid is null"
            r10.<init>(r11, r12, r4)
            r13.onError(r10)
            return
        L50:
            com.tencent.connect.auth.QQToken r3 = r9.c
            java.lang.String r3 = r3.getOpenId()
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L70
            java.lang.String r10 = "-->bindQQGroup, openid is empty."
            com.tencent.open.log.SLog.e(r1, r10)
            if (r13 == 0) goto Lc3
            com.tencent.tauth.UiError r10 = new com.tencent.tauth.UiError
            r11 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r12 = "openid params is null"
            r10.<init>(r11, r12, r4)
            r13.onError(r10)
            return
        L70:
            java.lang.String r4 = com.tencent.open.utils.m.a(r10)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            java.lang.String r6 = ""
            if (r5 == 0) goto L90
            java.lang.String r10 = "-->bindQQGroup, appname is empty."
            com.tencent.open.log.SLog.e(r1, r10)
            if (r13 == 0) goto Lc3
            com.tencent.tauth.UiError r10 = new com.tencent.tauth.UiError
            r11 = 1005(0x3ed, float:1.408E-42)
            java.lang.String r12 = "appName params is null"
            r10.<init>(r11, r12, r6)
            r13.onError(r10)
            return
        L90:
            boolean r5 = android.text.TextUtils.isEmpty(r11)
            if (r5 == 0) goto Laa
            java.lang.String r10 = "-->bindQQGroup, organization id is empty."
            com.tencent.open.log.SLog.e(r1, r10)
            if (r13 == 0) goto Lc3
            com.tencent.tauth.UiError r10 = new com.tencent.tauth.UiError
            r11 = 1006(0x3ee, float:1.41E-42)
            java.lang.String r12 = "organizationId params is null"
            r10.<init>(r11, r12, r6)
            r13.onError(r10)
            return
        Laa:
            boolean r5 = android.text.TextUtils.isEmpty(r12)
            if (r5 == 0) goto Lc4
            java.lang.String r10 = "-->bindQQGroup, organization name is empty."
            com.tencent.open.log.SLog.e(r1, r10)
            if (r13 == 0) goto Lc3
            com.tencent.tauth.UiError r10 = new com.tencent.tauth.UiError
            r11 = 1007(0x3ef, float:1.411E-42)
            java.lang.String r12 = "organizationName params is null"
            r10.<init>(r11, r12, r6)
            r13.onError(r10)
        Lc3:
            return
        Lc4:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "&app_name="
            r5.append(r6)
            byte[] r6 = com.tencent.open.utils.m.j(r4)
            r7 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "&organization_id="
            r5.append(r6)
            byte[] r6 = com.tencent.open.utils.m.j(r11)
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "&organization_name="
            r5.append(r6)
            byte[] r6 = com.tencent.open.utils.m.j(r12)
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r0.append(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "&openid="
            r5.append(r6)
            byte[] r3 = com.tencent.open.utils.m.j(r3)
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r7)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r0.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "&appid="
            r3.append(r5)
            byte[] r5 = com.tencent.open.utils.m.j(r2)
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r7)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "&sdk_version="
            r3.append(r5)
            java.lang.String r5 = "3.5.13.lite"
            byte[] r5 = com.tencent.open.utils.m.j(r5)
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r7)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "&app_name_url_encode="
            r3.append(r5)
            byte[] r4 = com.tencent.open.utils.m.j(r4)
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r7)
            java.lang.String r4 = com.tencent.open.utils.m.f(r4)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "&organization_name_url_encode="
            r3.append(r4)
            byte[] r12 = com.tencent.open.utils.m.j(r12)
            java.lang.String r12 = android.util.Base64.encodeToString(r12, r7)
            java.lang.String r12 = com.tencent.open.utils.m.f(r12)
            r3.append(r12)
            java.lang.String r12 = r3.toString()
            r0.append(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r3 = "-->bindQQGroup, url: "
            r12.append(r3)
            java.lang.String r3 = r0.toString()
            r12.append(r3)
            java.lang.String r12 = r12.toString()
            com.tencent.open.log.SLog.v(r1, r12)
            java.lang.String r12 = r0.toString()
            android.net.Uri r12 = android.net.Uri.parse(r12)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.VIEW"
            r0.<init>(r3)
            r0.setData(r12)
            java.lang.String r12 = "com.tencent.mobileqq"
            r0.setPackage(r12)
            java.lang.String r12 = "8.1.0"
            int r12 = com.tencent.open.utils.k.c(r10, r12)
            if (r12 >= 0) goto L1ef
            java.lang.String r11 = "-->bind group, there is no activity, show download page."
            com.tencent.open.log.SLog.w(r1, r11)
            r9.a(r10)
            return
        L1ef:
            com.tencent.open.SocialOperation$3 r12 = new com.tencent.open.SocialOperation$3
            r12.<init>(r9, r13, r10, r0)
            android.os.Bundle r6 = r9.a()
            java.lang.String r13 = "appid"
            r6.putString(r13, r2)
            java.lang.String r13 = "orgid"
            r6.putString(r13, r11)
            com.tencent.connect.auth.QQToken r3 = r9.c
            com.tencent.connect.common.BaseApi$TempRequestListener r8 = new com.tencent.connect.common.BaseApi$TempRequestListener
            r8.<init>(r9, r12)
            java.lang.String r5 = "https://openmobile.qq.com/cgi-bin/qunopensdk/check_group"
            java.lang.String r7 = "GET"
            r4 = r10
            com.tencent.open.utils.HttpUtils.requestAsync(r3, r4, r5, r6, r7, r8)
            java.lang.String r10 = "-->bindQQGroup() do."
            com.tencent.open.log.SLog.i(r1, r10)
            return
    }

    public void joinGroup(android.app.Activity r11, java.lang.String r12, com.tencent.tauth.IUiListener r13) {
            r10 = this;
            java.lang.String r0 = "joinQQGroup()"
            java.lang.String r1 = "openSDK_LOG.GameAppOperation"
            com.tencent.open.log.SLog.i(r1, r0)
            boolean r0 = com.tencent.connect.a.a(r1, r13)
            if (r0 == 0) goto Lf
            goto L8b
        Lf:
            if (r11 != 0) goto L27
            java.lang.String r11 = "-->joinGroup, activity is empty."
            com.tencent.open.log.SLog.e(r1, r11)
            if (r13 == 0) goto L8b
            com.tencent.tauth.UiError r11 = new com.tencent.tauth.UiError
            java.lang.String r12 = "param acitivty is null"
            java.lang.String r0 = "activity param of api can not be null."
            r1 = 1001(0x3e9, float:1.403E-42)
            r11.<init>(r1, r12, r0)
            r13.onError(r11)
            return
        L27:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L43
            java.lang.String r11 = "-->joinGroup, params is empty."
            com.tencent.open.log.SLog.e(r1, r11)
            if (r13 == 0) goto L8b
            com.tencent.tauth.UiError r11 = new com.tencent.tauth.UiError
            java.lang.String r12 = "param organizationId is null"
            java.lang.String r0 = "organizationId param of api can not be null."
            r1 = 1006(0x3ee, float:1.41E-42)
            r11.<init>(r1, r12, r0)
            r13.onError(r11)
            return
        L43:
            android.content.Intent r0 = new android.content.Intent
            r0.<init>()
            com.tencent.connect.auth.QQToken r2 = r10.c
            java.lang.String r2 = r2.getAppId()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L6a
            java.lang.String r11 = "-->joinGroup, appid is empty."
            com.tencent.open.log.SLog.e(r1, r11)
            if (r13 == 0) goto L8b
            com.tencent.tauth.UiError r11 = new com.tencent.tauth.UiError
            java.lang.String r12 = "appid is null"
            java.lang.String r0 = "appid is null, please login."
            r1 = 1003(0x3eb, float:1.406E-42)
            r11.<init>(r1, r12, r0)
            r13.onError(r11)
            return
        L6a:
            com.tencent.connect.auth.QQToken r3 = r10.c
            java.lang.String r3 = r3.getOpenId()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L8c
            java.lang.String r11 = "-->joinGroup, openid is empty."
            com.tencent.open.log.SLog.e(r1, r11)
            if (r13 == 0) goto L8b
            com.tencent.tauth.UiError r11 = new com.tencent.tauth.UiError
            java.lang.String r12 = "openid is null"
            java.lang.String r0 = "openid is null, please login."
            r1 = 1004(0x3ec, float:1.407E-42)
            r11.<init>(r1, r12, r0)
            r13.onError(r11)
        L8b:
            return
        L8c:
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            java.lang.String r5 = "mqqapi://opensdk/join_group?src_type=app&version=1"
            r4.<init>(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "&openid="
            r5.append(r6)
            byte[] r3 = com.tencent.open.utils.m.j(r3)
            r6 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r6)
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "&appid="
            r3.append(r5)
            byte[] r5 = com.tencent.open.utils.m.j(r2)
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "&organization_id="
            r3.append(r5)
            byte[] r5 = com.tencent.open.utils.m.j(r12)
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4.append(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "&sdk_version="
            r3.append(r5)
            java.lang.String r5 = "3.5.13.lite"
            byte[] r5 = com.tencent.open.utils.m.j(r5)
            java.lang.String r5 = android.util.Base64.encodeToString(r5, r6)
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r0.setData(r3)
            java.lang.String r3 = "com.tencent.mobileqq"
            r0.setPackage(r3)
            java.lang.String r3 = "8.1.0"
            int r3 = com.tencent.open.utils.k.c(r11, r3)
            if (r3 >= 0) goto L127
            java.lang.String r12 = "-->bind group, there is no activity, show download page."
            com.tencent.open.log.SLog.w(r1, r12)
            r10.a(r11)
            return
        L127:
            com.tencent.open.SocialOperation$2 r3 = new com.tencent.open.SocialOperation$2
            r3.<init>(r10, r13, r11, r0)
            android.os.Bundle r7 = r10.a()
            java.lang.String r13 = "appid"
            r7.putString(r13, r2)
            java.lang.String r13 = "orgid"
            r7.putString(r13, r12)
            com.tencent.connect.auth.QQToken r4 = r10.c
            com.tencent.connect.common.BaseApi$TempRequestListener r9 = new com.tencent.connect.common.BaseApi$TempRequestListener
            r9.<init>(r10, r3)
            java.lang.String r6 = "https://openmobile.qq.com/cgi-bin/qunopensdk/check_group"
            java.lang.String r8 = "GET"
            r5 = r11
            com.tencent.open.utils.HttpUtils.requestAsync(r4, r5, r6, r7, r8, r9)
            java.lang.String r11 = "-->joinQQGroup() do."
            com.tencent.open.log.SLog.i(r1, r11)
            return
    }

    public void makeFriend(android.app.Activity r10, android.os.Bundle r11) {
            r9 = this;
            java.lang.String r0 = "-->makeFriend()  -- start"
            java.lang.String r1 = "openSDK_LOG.GameAppOperation"
            com.tencent.open.log.SLog.i(r1, r0)
            r0 = 0
            boolean r0 = com.tencent.connect.a.a(r1, r0)
            if (r0 == 0) goto Lf
            return
        Lf:
            if (r11 != 0) goto L32
            java.lang.String r10 = "-->makeFriend params is null"
            com.tencent.open.log.SLog.e(r1, r10)
            com.tencent.open.b.e r2 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r10 = r9.c
            java.lang.String r3 = r10.getOpenId()
            com.tencent.connect.auth.QQToken r10 = r9.c
            java.lang.String r4 = r10.getAppId()
            java.lang.String r7 = "18"
            java.lang.String r8 = "1"
            java.lang.String r5 = "ANDROIDQQ.MAKEAFRIEND.XX"
            java.lang.String r6 = "14"
            r2.a(r3, r4, r5, r6, r7, r8)
            return
        L32:
            java.lang.String r0 = "fopen_id"
            java.lang.String r0 = r11.getString(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L5f
            java.lang.String r10 = "-->make friend, fOpenid is empty."
            com.tencent.open.log.SLog.e(r1, r10)
            com.tencent.open.b.e r2 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r10 = r9.c
            java.lang.String r3 = r10.getOpenId()
            com.tencent.connect.auth.QQToken r10 = r9.c
            java.lang.String r4 = r10.getAppId()
            java.lang.String r7 = "18"
            java.lang.String r8 = "1"
            java.lang.String r5 = "ANDROIDQQ.MAKEAFRIEND.XX"
            java.lang.String r6 = "14"
            r2.a(r3, r4, r5, r6, r7, r8)
            return
        L5f:
            java.lang.String r2 = "friend_label"
            java.lang.String r2 = r11.getString(r2)
            java.lang.String r3 = "add_msg"
            java.lang.String r11 = r11.getString(r3)
            java.lang.String r3 = com.tencent.open.utils.m.a(r10)
            com.tencent.connect.auth.QQToken r4 = r9.c
            java.lang.String r4 = r4.getOpenId()
            com.tencent.connect.auth.QQToken r5 = r9.c
            java.lang.String r5 = r5.getAppId()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "-->make friend, fOpenid: "
            r6.append(r7)
            r6.append(r0)
            java.lang.String r7 = " | label: "
            r6.append(r7)
            r6.append(r2)
            java.lang.String r7 = " | message: "
            r6.append(r7)
            r6.append(r11)
            java.lang.String r7 = " | openid: "
            r6.append(r7)
            r6.append(r4)
            java.lang.String r7 = " | appid:"
            r6.append(r7)
            r6.append(r5)
            java.lang.String r6 = r6.toString()
            com.tencent.open.log.SLog.v(r1, r6)
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            java.lang.String r7 = "mqqapi://gamesdk/add_friend?src_type=app&version=1"
            r6.<init>(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "&fopen_id="
            r7.append(r8)
            byte[] r0 = com.tencent.open.utils.m.j(r0)
            r8 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r8)
            r7.append(r0)
            java.lang.String r0 = r7.toString()
            r6.append(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto Lf5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r7 = "&open_id="
            r0.append(r7)
            byte[] r4 = com.tencent.open.utils.m.j(r4)
            java.lang.String r4 = android.util.Base64.encodeToString(r4, r8)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            r6.append(r0)
        Lf5:
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L10f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "&app_id="
            r0.append(r4)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            r6.append(r0)
        L10f:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L131
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "&friend_label="
            r0.append(r4)
            byte[] r2 = com.tencent.open.utils.m.j(r2)
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r8)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            r6.append(r0)
        L131:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 != 0) goto L153
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "&add_msg="
            r0.append(r2)
            byte[] r11 = com.tencent.open.utils.m.j(r11)
            java.lang.String r11 = android.util.Base64.encodeToString(r11, r8)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            r6.append(r11)
        L153:
            boolean r11 = android.text.TextUtils.isEmpty(r3)
            if (r11 != 0) goto L175
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "&app_name="
            r11.append(r0)
            byte[] r0 = com.tencent.open.utils.m.j(r3)
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r8)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            r6.append(r11)
        L175:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r0 = "-->make friend, url: "
            r11.append(r0)
            java.lang.String r0 = r6.toString()
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.tencent.open.log.SLog.v(r1, r11)
            android.content.Intent r11 = new android.content.Intent
            java.lang.String r0 = "android.intent.action.VIEW"
            r11.<init>(r0)
            java.lang.String r0 = r6.toString()
            android.net.Uri r0 = android.net.Uri.parse(r0)
            r11.setData(r0)
            java.lang.String r0 = "5.1.0"
            boolean r0 = com.tencent.open.utils.m.f(r10, r0)
            if (r0 != 0) goto L1f1
            java.lang.String r0 = "-->makeFriend target activity found, qqver greater than 5.1.0"
            com.tencent.open.log.SLog.i(r1, r0)
            r10.startActivity(r11)     // Catch: java.lang.Exception -> L1cb
            com.tencent.open.b.e r2 = com.tencent.open.b.e.a()     // Catch: java.lang.Exception -> L1cb
            com.tencent.connect.auth.QQToken r11 = r9.c     // Catch: java.lang.Exception -> L1cb
            java.lang.String r3 = r11.getOpenId()     // Catch: java.lang.Exception -> L1cb
            com.tencent.connect.auth.QQToken r11 = r9.c     // Catch: java.lang.Exception -> L1cb
            java.lang.String r4 = r11.getAppId()     // Catch: java.lang.Exception -> L1cb
            java.lang.String r5 = "ANDROIDQQ.MAKEAFRIEND.XX"
            java.lang.String r6 = "14"
            java.lang.String r7 = "18"
            java.lang.String r8 = "0"
            r2.a(r3, r4, r5, r6, r7, r8)     // Catch: java.lang.Exception -> L1cb
            goto L214
        L1cb:
            r0 = move-exception
            r11 = r0
            java.lang.String r0 = "-->make friend, start activity exception."
            com.tencent.open.log.SLog.e(r1, r0, r11)
            r9.a(r10)
            com.tencent.open.b.e r2 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r10 = r9.c
            java.lang.String r3 = r10.getOpenId()
            com.tencent.connect.auth.QQToken r10 = r9.c
            java.lang.String r4 = r10.getAppId()
            java.lang.String r7 = "18"
            java.lang.String r8 = "1"
            java.lang.String r5 = "ANDROIDQQ.MAKEAFRIEND.XX"
            java.lang.String r6 = "14"
            r2.a(r3, r4, r5, r6, r7, r8)
            goto L214
        L1f1:
            java.lang.String r11 = "-->make friend, there is no activity."
            com.tencent.open.log.SLog.w(r1, r11)
            r9.a(r10)
            com.tencent.open.b.e r2 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r10 = r9.c
            java.lang.String r3 = r10.getOpenId()
            com.tencent.connect.auth.QQToken r10 = r9.c
            java.lang.String r4 = r10.getAppId()
            java.lang.String r7 = "18"
            java.lang.String r8 = "1"
            java.lang.String r5 = "ANDROIDQQ.MAKEAFRIEND.XX"
            java.lang.String r6 = "14"
            r2.a(r3, r4, r5, r6, r7, r8)
        L214:
            java.lang.String r10 = "-->makeFriend()  -- end"
            com.tencent.open.log.SLog.i(r1, r10)
            return
    }

    public void unBindGroup(android.content.Context r10, java.lang.String r11, com.tencent.tauth.IUiListener r12) {
            r9 = this;
            java.lang.String r0 = "unBindQQGroup()"
            java.lang.String r1 = "openSDK_LOG.GameAppOperation"
            com.tencent.open.log.SLog.i(r1, r0)
            boolean r0 = com.tencent.connect.a.a(r1, r12)
            if (r0 == 0) goto Le
            goto L63
        Le:
            if (r10 != 0) goto L26
            java.lang.String r10 = "-->uinBindGroup, activity is empty."
            com.tencent.open.log.SLog.e(r1, r10)
            if (r12 == 0) goto L63
            com.tencent.tauth.UiError r10 = new com.tencent.tauth.UiError
            java.lang.String r11 = "param acitivty is null"
            java.lang.String r0 = "activity param of api can not be null."
            r1 = 1001(0x3e9, float:1.403E-42)
            r10.<init>(r1, r11, r0)
            r12.onError(r10)
            return
        L26:
            boolean r0 = android.text.TextUtils.isEmpty(r11)
            if (r0 == 0) goto L42
            java.lang.String r10 = "-->unBindGroup, params is empty."
            com.tencent.open.log.SLog.e(r1, r10)
            if (r12 == 0) goto L63
            com.tencent.tauth.UiError r10 = new com.tencent.tauth.UiError
            java.lang.String r11 = "param organizationId is null"
            java.lang.String r0 = "organizationId param of api can not be null."
            r1 = 1006(0x3ee, float:1.41E-42)
            r10.<init>(r1, r11, r0)
            r12.onError(r10)
            return
        L42:
            com.tencent.connect.auth.QQToken r0 = r9.c
            java.lang.String r0 = r0.getAppId()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L64
            java.lang.String r10 = "-->unBindGroup, appid is empty."
            com.tencent.open.log.SLog.e(r1, r10)
            if (r12 == 0) goto L63
            com.tencent.tauth.UiError r10 = new com.tencent.tauth.UiError
            java.lang.String r11 = "param appId is null"
            java.lang.String r0 = "appid is null please login."
            r1 = 1003(0x3eb, float:1.406E-42)
            r10.<init>(r1, r11, r0)
            r12.onError(r10)
        L63:
            return
        L64:
            com.tencent.open.SocialOperation$1 r2 = new com.tencent.open.SocialOperation$1
            r2.<init>(r9, r12)
            android.os.Bundle r6 = r9.a()
            java.lang.String r12 = "appid"
            r6.putString(r12, r0)
            java.lang.String r12 = "orgid"
            r6.putString(r12, r11)
            com.tencent.connect.auth.QQToken r3 = r9.c
            com.tencent.connect.common.BaseApi$TempRequestListener r8 = new com.tencent.connect.common.BaseApi$TempRequestListener
            r8.<init>(r9, r2)
            java.lang.String r5 = "https://openmobile.qq.com/cgi-bin/qunopensdk/unbind"
            java.lang.String r7 = "GET"
            r4 = r10
            com.tencent.open.utils.HttpUtils.requestAsync(r3, r4, r5, r6, r7, r8)
            java.lang.String r10 = "-->unBindQQGroup() do."
            com.tencent.open.log.SLog.i(r1, r10)
            return
    }
}

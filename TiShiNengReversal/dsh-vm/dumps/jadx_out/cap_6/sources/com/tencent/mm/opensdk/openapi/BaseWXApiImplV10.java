package com.tencent.mm.opensdk.openapi;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class BaseWXApiImplV10 implements com.tencent.mm.opensdk.openapi.IWXAPI {
    protected static final java.lang.String TAG = "MicroMsg.SDK.WXApiImplV10";
    private static java.lang.String wxappPayEntryClassname;
    protected java.lang.String appId;
    protected boolean checkSignature;
    protected android.content.Context context;
    protected boolean detached;
    private int launchMode;
    private int wxSdkVersion;



    BaseWXApiImplV10(android.content.Context r3, java.lang.String r4, boolean r5, int r6) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.checkSignature = r0
            r2.detached = r0
            r0 = 2
            r2.launchMode = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<init>, appId = "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = ", checkSignature = "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = ", launchMode = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.SDK.WXApiImplV10"
            com.tencent.mm.opensdk.utils.Log.d(r1, r0)
            r2.context = r3
            r2.appId = r4
            r2.checkSignature = r5
            r2.launchMode = r6
            android.content.Context r3 = r3.getApplicationContext()
            android.content.Context r3 = com.stub.StubApp.getOrigApplicationContext(r3)
            com.tencent.mm.opensdk.utils.b.a = r3
            return
    }

    static /* synthetic */ int access$002(com.tencent.mm.opensdk.openapi.BaseWXApiImplV10 r0, int r1) {
            r0.wxSdkVersion = r1
            return r1
    }

    private boolean checkSumConsistent(byte[] r5, byte[] r6) {
            r4 = this;
            java.lang.String r0 = "MicroMsg.SDK.WXApiImplV10"
            r1 = 0
            if (r5 == 0) goto L28
            int r2 = r5.length
            if (r2 == 0) goto L28
            if (r6 == 0) goto L28
            int r2 = r6.length
            if (r2 != 0) goto Le
            goto L28
        Le:
            int r2 = r5.length
            int r3 = r6.length
            if (r2 == r3) goto L18
            java.lang.String r5 = "checkSumConsistent fail, length is different"
        L14:
            com.tencent.mm.opensdk.utils.Log.e(r0, r5)
            return r1
        L18:
            r0 = 0
        L19:
            int r2 = r5.length
            if (r0 >= r2) goto L26
            r2 = r5[r0]
            r3 = r6[r0]
            if (r2 == r3) goto L23
            return r1
        L23:
            int r0 = r0 + 1
            goto L19
        L26:
            r5 = 1
            return r5
        L28:
            java.lang.String r5 = "checkSumConsistent fail, invalid arguments"
            goto L14
    }

    private boolean createChatroom(android.content.Context r10, android.os.Bundle r11) {
            r9 = this;
            r9.launchWXIfNeed()
            android.content.ContentResolver r0 = r10.getContentResolver()
            java.lang.String r10 = "content://com.tencent.mm.sdk.comm.provider/createChatroom"
            android.net.Uri r1 = android.net.Uri.parse(r10)
            java.lang.String r2 = r9.appId
            java.lang.String r10 = "_wxapi_basereq_transaction"
            java.lang.String r3 = ""
            java.lang.String r10 = r11.getString(r10, r3)
            java.lang.String r4 = "_wxapi_create_chatroom_group_id"
            java.lang.String r4 = r11.getString(r4, r3)
            java.lang.String r5 = "_wxapi_create_chatroom_chatroom_name"
            java.lang.String r5 = r11.getString(r5, r3)
            java.lang.String r6 = "_wxapi_create_chatroom_chatroom_nickname"
            java.lang.String r6 = r11.getString(r6, r3)
            java.lang.String r7 = "_wxapi_create_chatroom_ext_msg"
            java.lang.String r7 = r11.getString(r7, r3)
            java.lang.String r8 = "_wxapi_basereq_openid"
            java.lang.String r8 = r11.getString(r8, r3)
            r3 = r10
            java.lang.String[] r4 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r10 = r0.query(r1, r2, r3, r4, r5)
            if (r10 == 0) goto L46
            r10.close()
        L46:
            r10 = 1
            return r10
    }

    private java.lang.String finderShareVideoJumpInfoToString(com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo r4) {
            r3 = this;
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4d
            r0.<init>()     // Catch: java.lang.Exception -> L4d
            java.lang.String r1 = "jumpType"
            int r2 = r4.type()     // Catch: java.lang.Exception -> L4d
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L4d
            boolean r1 = r4 instanceof com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo     // Catch: java.lang.Exception -> L4d
            if (r1 == 0) goto L48
            java.lang.String r1 = "wording"
            r2 = r4
            com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo r2 = (com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo) r2     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r2.wording     // Catch: java.lang.Exception -> L4d
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L4d
            java.lang.String r1 = "extra"
            r2 = r4
            com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo r2 = (com.tencent.mm.opensdk.modelbiz.WXChannelBaseJumpInfo) r2     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r2.extra     // Catch: java.lang.Exception -> L4d
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L4d
            boolean r1 = r4 instanceof com.tencent.mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo     // Catch: java.lang.Exception -> L4d
            if (r1 == 0) goto L3b
            java.lang.String r1 = "username"
            r2 = r4
            com.tencent.mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo r2 = (com.tencent.mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo) r2     // Catch: java.lang.Exception -> L4d
            java.lang.String r2 = r2.username     // Catch: java.lang.Exception -> L4d
            r0.put(r1, r2)     // Catch: java.lang.Exception -> L4d
            com.tencent.mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo r4 = (com.tencent.mm.opensdk.modelbiz.WXChannelJumpMiniProgramInfo) r4     // Catch: java.lang.Exception -> L4d
            java.lang.String r4 = r4.path     // Catch: java.lang.Exception -> L4d
            java.lang.String r1 = "path"
            goto L45
        L3b:
            boolean r1 = r4 instanceof com.tencent.mm.opensdk.modelbiz.WXChannelJumpUrlInfo     // Catch: java.lang.Exception -> L4d
            if (r1 == 0) goto L48
            com.tencent.mm.opensdk.modelbiz.WXChannelJumpUrlInfo r4 = (com.tencent.mm.opensdk.modelbiz.WXChannelJumpUrlInfo) r4     // Catch: java.lang.Exception -> L4d
            java.lang.String r4 = r4.url     // Catch: java.lang.Exception -> L4d
            java.lang.String r1 = "url"
        L45:
            r0.put(r1, r4)     // Catch: java.lang.Exception -> L4d
        L48:
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Exception -> L4d
            return r4
        L4d:
            java.lang.String r4 = ""
            return r4
    }

    private java.lang.String getTokenFromWX(android.content.Context r7) {
            r6 = this;
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/genTokenForOpenSdk"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String r2 = "638058496"
            java.lang.String[] r4 = new java.lang.String[]{r7, r2}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            java.lang.String r0 = "MicroMsg.SDK.WXApiImplV10"
            if (r7 == 0) goto L40
            boolean r1 = r7.moveToFirst()
            if (r1 == 0) goto L40
            r1 = 0
            java.lang.String r1 = r7.getString(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getTokenFromWX token is "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r2 = r2.toString()
            com.tencent.mm.opensdk.utils.Log.i(r0, r2)
            r7.close()
            return r1
        L40:
            java.lang.String r7 = "getTokenFromWX , token is null , if your app targetSdkVersion >= 30, include 'com.tencent.mm' in a set of <package> elements inside the <queries> element"
            com.tencent.mm.opensdk.utils.Log.e(r0, r7)
            r7 = 0
            return r7
    }

    private boolean handleWxInternalRespType(java.lang.String r9, com.tencent.mm.opensdk.openapi.IWXAPIEventHandler r10) {
            r8 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "handleWxInternalRespType, extInfo = "
            r0.append(r1)
            r0.append(r9)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MicroMsg.SDK.WXApiImplV10"
            com.tencent.mm.opensdk.utils.Log.i(r1, r0)
            r0 = 0
            android.net.Uri r9 = android.net.Uri.parse(r9)     // Catch: java.lang.Exception -> L41
            java.lang.String r2 = "wx_internal_resptype"
            java.lang.String r2 = r9.getQueryParameter(r2)     // Catch: java.lang.Exception -> L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L41
            r3.<init>()     // Catch: java.lang.Exception -> L41
            java.lang.String r4 = "handleWxInternalRespType, respType = "
            r3.append(r4)     // Catch: java.lang.Exception -> L41
            r3.append(r2)     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L41
            com.tencent.mm.opensdk.utils.Log.i(r1, r3)     // Catch: java.lang.Exception -> L41
            boolean r3 = com.tencent.mm.opensdk.utils.b.b(r2)     // Catch: java.lang.Exception -> L41
            if (r3 == 0) goto L44
            java.lang.String r9 = "handleWxInternalRespType fail, respType is null"
            com.tencent.mm.opensdk.utils.Log.e(r1, r9)     // Catch: java.lang.Exception -> L41
            return r0
        L41:
            r9 = move-exception
            goto L163
        L44:
            java.lang.String r3 = "subscribemessage"
            boolean r3 = r2.equals(r3)     // Catch: java.lang.Exception -> L41
            java.lang.String r4 = "openid"
            r5 = 1
            java.lang.String r6 = "ret"
            if (r3 == 0) goto L96
            com.tencent.mm.opensdk.modelbiz.SubscribeMessage$Resp r2 = new com.tencent.mm.opensdk.modelbiz.SubscribeMessage$Resp     // Catch: java.lang.Exception -> L41
            r2.<init>()     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = r9.getQueryParameter(r6)     // Catch: java.lang.Exception -> L41
            if (r3 == 0) goto L68
            int r6 = r3.length()     // Catch: java.lang.Exception -> L41
            if (r6 <= 0) goto L68
            int r3 = com.tencent.mm.opensdk.utils.b.a(r3, r0)     // Catch: java.lang.Exception -> L41
            r2.errCode = r3     // Catch: java.lang.Exception -> L41
        L68:
            java.lang.String r3 = r9.getQueryParameter(r4)     // Catch: java.lang.Exception -> L41
            r2.openId = r3     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = "template_id"
            java.lang.String r3 = r9.getQueryParameter(r3)     // Catch: java.lang.Exception -> L41
            r2.templateID = r3     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = "scene"
            java.lang.String r3 = r9.getQueryParameter(r3)     // Catch: java.lang.Exception -> L41
            int r3 = com.tencent.mm.opensdk.utils.b.a(r3, r0)     // Catch: java.lang.Exception -> L41
            r2.scene = r3     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = "action"
            java.lang.String r3 = r9.getQueryParameter(r3)     // Catch: java.lang.Exception -> L41
            r2.action = r3     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = "reserved"
            java.lang.String r9 = r9.getQueryParameter(r3)     // Catch: java.lang.Exception -> L41
            r2.reserved = r9     // Catch: java.lang.Exception -> L41
            r10.onResp(r2)     // Catch: java.lang.Exception -> L41
            return r5
        L96:
            java.lang.String r3 = "invoice_auth_insert"
            boolean r3 = r2.contains(r3)     // Catch: java.lang.Exception -> L41
            java.lang.String r7 = "wx_order_id"
            if (r3 == 0) goto Lc1
            com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert$Resp r2 = new com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert$Resp     // Catch: java.lang.Exception -> L41
            r2.<init>()     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = r9.getQueryParameter(r6)     // Catch: java.lang.Exception -> L41
            if (r3 == 0) goto Lb7
            int r4 = r3.length()     // Catch: java.lang.Exception -> L41
            if (r4 <= 0) goto Lb7
            int r3 = com.tencent.mm.opensdk.utils.b.a(r3, r0)     // Catch: java.lang.Exception -> L41
            r2.errCode = r3     // Catch: java.lang.Exception -> L41
        Lb7:
            java.lang.String r9 = r9.getQueryParameter(r7)     // Catch: java.lang.Exception -> L41
            r2.wxOrderId = r9     // Catch: java.lang.Exception -> L41
            r10.onResp(r2)     // Catch: java.lang.Exception -> L41
            return r5
        Lc1:
            java.lang.String r3 = "payinsurance"
            boolean r3 = r2.contains(r3)     // Catch: java.lang.Exception -> L41
            if (r3 == 0) goto Lea
            com.tencent.mm.opensdk.modelbiz.WXPayInsurance$Resp r2 = new com.tencent.mm.opensdk.modelbiz.WXPayInsurance$Resp     // Catch: java.lang.Exception -> L41
            r2.<init>()     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = r9.getQueryParameter(r6)     // Catch: java.lang.Exception -> L41
            if (r3 == 0) goto Le0
            int r4 = r3.length()     // Catch: java.lang.Exception -> L41
            if (r4 <= 0) goto Le0
            int r3 = com.tencent.mm.opensdk.utils.b.a(r3, r0)     // Catch: java.lang.Exception -> L41
            r2.errCode = r3     // Catch: java.lang.Exception -> L41
        Le0:
            java.lang.String r9 = r9.getQueryParameter(r7)     // Catch: java.lang.Exception -> L41
            r2.wxOrderId = r9     // Catch: java.lang.Exception -> L41
            r10.onResp(r2)     // Catch: java.lang.Exception -> L41
            return r5
        Lea:
            java.lang.String r3 = "nontaxpay"
            boolean r3 = r2.contains(r3)     // Catch: java.lang.Exception -> L41
            if (r3 == 0) goto L113
            com.tencent.mm.opensdk.modelbiz.WXNontaxPay$Resp r2 = new com.tencent.mm.opensdk.modelbiz.WXNontaxPay$Resp     // Catch: java.lang.Exception -> L41
            r2.<init>()     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = r9.getQueryParameter(r6)     // Catch: java.lang.Exception -> L41
            if (r3 == 0) goto L109
            int r4 = r3.length()     // Catch: java.lang.Exception -> L41
            if (r4 <= 0) goto L109
            int r3 = com.tencent.mm.opensdk.utils.b.a(r3, r0)     // Catch: java.lang.Exception -> L41
            r2.errCode = r3     // Catch: java.lang.Exception -> L41
        L109:
            java.lang.String r9 = r9.getQueryParameter(r7)     // Catch: java.lang.Exception -> L41
            r2.wxOrderId = r9     // Catch: java.lang.Exception -> L41
            r10.onResp(r2)     // Catch: java.lang.Exception -> L41
            return r5
        L113:
            java.lang.String r3 = "subscribeminiprogrammsg"
            boolean r3 = r3.equals(r2)     // Catch: java.lang.Exception -> L41
            if (r3 != 0) goto L12a
            java.lang.String r3 = "5"
            boolean r2 = r3.equals(r2)     // Catch: java.lang.Exception -> L41
            if (r2 == 0) goto L124
            goto L12a
        L124:
            java.lang.String r9 = "this open sdk version not support the request type"
            com.tencent.mm.opensdk.utils.Log.e(r1, r9)     // Catch: java.lang.Exception -> L41
            goto L17b
        L12a:
            com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg$Resp r2 = new com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg$Resp     // Catch: java.lang.Exception -> L41
            r2.<init>()     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = r9.getQueryParameter(r6)     // Catch: java.lang.Exception -> L41
            if (r3 == 0) goto L141
            int r6 = r3.length()     // Catch: java.lang.Exception -> L41
            if (r6 <= 0) goto L141
            int r3 = com.tencent.mm.opensdk.utils.b.a(r3, r0)     // Catch: java.lang.Exception -> L41
            r2.errCode = r3     // Catch: java.lang.Exception -> L41
        L141:
            java.lang.String r3 = r9.getQueryParameter(r4)     // Catch: java.lang.Exception -> L41
            r2.openId = r3     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = "unionid"
            java.lang.String r3 = r9.getQueryParameter(r3)     // Catch: java.lang.Exception -> L41
            r2.unionId = r3     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = "nickname"
            java.lang.String r3 = r9.getQueryParameter(r3)     // Catch: java.lang.Exception -> L41
            r2.nickname = r3     // Catch: java.lang.Exception -> L41
            java.lang.String r3 = "errmsg"
            java.lang.String r9 = r9.getQueryParameter(r3)     // Catch: java.lang.Exception -> L41
            r2.errStr = r9     // Catch: java.lang.Exception -> L41
            r10.onResp(r2)     // Catch: java.lang.Exception -> L41
            return r5
        L163:
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r2 = "handleWxInternalRespType fail, ex = "
            r10.append(r2)
            java.lang.String r9 = r9.getMessage()
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.tencent.mm.opensdk.utils.Log.e(r1, r9)
        L17b:
            return r0
    }

    private boolean joinChatroom(android.content.Context r9, android.os.Bundle r10) {
            r8 = this;
            r8.launchWXIfNeed()
            android.content.ContentResolver r0 = r9.getContentResolver()
            java.lang.String r9 = "content://com.tencent.mm.sdk.comm.provider/joinChatroom"
            android.net.Uri r1 = android.net.Uri.parse(r9)
            java.lang.String r2 = r8.appId
            java.lang.String r9 = "_wxapi_basereq_transaction"
            java.lang.String r3 = ""
            java.lang.String r9 = r10.getString(r9, r3)
            java.lang.String r4 = "_wxapi_join_chatroom_group_id"
            java.lang.String r4 = r10.getString(r4, r3)
            java.lang.String r5 = "_wxapi_join_chatroom_chatroom_nickname"
            java.lang.String r5 = r10.getString(r5, r3)
            java.lang.String r6 = "_wxapi_join_chatroom_ext_msg"
            java.lang.String r6 = r10.getString(r6, r3)
            java.lang.String r7 = "_wxapi_basereq_openid"
            java.lang.String r7 = r10.getString(r7, r3)
            r3 = r9
            java.lang.String[] r4 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5)
            if (r9 == 0) goto L40
            r9.close()
        L40:
            r9 = 1
            return r9
    }

    private void launchWXIfNeed() {
            r2 = this;
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto Lf
            int r0 = r2.launchMode
            r1 = 2
            if (r0 != r1) goto Lf
            r2.launchWXUsingPendingIntent()
            return
        Lf:
            r2.openWXApp()
            return
    }

    private void launchWXUsingPendingIntent() {
            r11 = this;
            boolean r0 = r11.detached
            if (r0 != 0) goto L57
            boolean r0 = r11.isWXAppInstalled()
            java.lang.String r1 = "MicroMsg.SDK.WXApiImplV10"
            if (r0 != 0) goto L12
            java.lang.String r0 = "openWXApp failed, not installed or signature check failed"
            com.tencent.mm.opensdk.utils.Log.e(r1, r0)
            return
        L12:
            java.lang.String r0 = "launchWXUsingPendingIntent"
            com.tencent.mm.opensdk.utils.Log.i(r1, r0)     // Catch: java.lang.Exception -> L3a
            android.content.Context r0 = r11.context     // Catch: java.lang.Exception -> L3a
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L3a
            java.lang.String r2 = "com.tencent.mm"
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r2)     // Catch: java.lang.Exception -> L3a
            android.content.Context r2 = r11.context     // Catch: java.lang.Exception -> L3a
            r3 = 1
            r4 = 134217728(0x8000000, float:3.85186E-34)
            android.app.PendingIntent r5 = android.app.PendingIntent.getActivity(r2, r3, r0, r4)     // Catch: java.lang.Exception -> L3a
            android.content.Context r6 = r11.context     // Catch: java.lang.Exception -> L3a
            com.tencent.mm.opensdk.openapi.BaseWXApiImplV10$2 r9 = new com.tencent.mm.opensdk.openapi.BaseWXApiImplV10$2     // Catch: java.lang.Exception -> L3a
            r9.<init>(r11)     // Catch: java.lang.Exception -> L3a
            r10 = 0
            r7 = 2
            r8 = 0
            r5.send(r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> L3a
            return
        L3a:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "launchWXUsingPendingIntent pendingIntent send failed: "
            r2.append(r3)
            java.lang.String r0 = r0.getMessage()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.mm.opensdk.utils.Log.e(r1, r0)
            r11.openWXApp()
            return
        L57:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "openWXApp fail, WXMsgImpl has been detached"
            r0.<init>(r1)
            throw r0
    }

    private boolean sendAddCardToWX(android.content.Context r7, android.os.Bundle r8) {
            r6 = this;
            r6.launchWXIfNeed()
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/addCardToWX"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String r2 = "_wxapi_add_card_to_wx_card_list"
            java.lang.String r2 = r8.getString(r2)
            java.lang.String r3 = "_wxapi_basereq_transaction"
            java.lang.String r8 = r8.getString(r3)
            java.lang.String[] r4 = new java.lang.String[]{r7, r2, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L2b
            r7.close()
        L2b:
            r7 = 1
            return r7
    }

    private boolean sendChooseCardFromWX(android.content.Context r13, android.os.Bundle r14) {
            r12 = this;
            r12.launchWXIfNeed()
            android.content.ContentResolver r0 = r13.getContentResolver()
            java.lang.String r13 = "content://com.tencent.mm.sdk.comm.provider/chooseCardFromWX"
            android.net.Uri r1 = android.net.Uri.parse(r13)
            java.lang.String r13 = "_wxapi_choose_card_from_wx_card_app_id"
            java.lang.String r2 = r14.getString(r13)
            java.lang.String r13 = "_wxapi_choose_card_from_wx_card_location_id"
            java.lang.String r3 = r14.getString(r13)
            java.lang.String r13 = "_wxapi_choose_card_from_wx_card_sign_type"
            java.lang.String r4 = r14.getString(r13)
            java.lang.String r13 = "_wxapi_choose_card_from_wx_card_card_sign"
            java.lang.String r5 = r14.getString(r13)
            java.lang.String r13 = "_wxapi_choose_card_from_wx_card_time_stamp"
            java.lang.String r6 = r14.getString(r13)
            java.lang.String r13 = "_wxapi_choose_card_from_wx_card_nonce_str"
            java.lang.String r7 = r14.getString(r13)
            java.lang.String r13 = "_wxapi_choose_card_from_wx_card_card_id"
            java.lang.String r8 = r14.getString(r13)
            java.lang.String r13 = "_wxapi_choose_card_from_wx_card_card_type"
            java.lang.String r9 = r14.getString(r13)
            java.lang.String r13 = "_wxapi_choose_card_from_wx_card_can_multi_select"
            java.lang.String r10 = r14.getString(r13)
            java.lang.String r13 = "_wxapi_basereq_transaction"
            java.lang.String r11 = r14.getString(r13)
            java.lang.String[] r4 = new java.lang.String[]{r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r13 = r0.query(r1, r2, r3, r4, r5)
            if (r13 == 0) goto L59
            r13.close()
        L59:
            r13 = 1
            return r13
    }

    private boolean sendFinderOpenFeed(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            r6.launchWXIfNeed()
            java.lang.String r0 = "MicroMsg.SDK.WXApiImplV10"
            java.lang.String r1 = "sendFinderOpenFeed"
            com.tencent.mm.opensdk.utils.Log.i(r0, r1)
            com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/finderOpenFeed"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String r2 = r8.feedID
            java.lang.String r3 = r8.nonceID
            boolean r8 = r8.notGetReleatedList
            java.lang.String r8 = java.lang.String.valueOf(r8)
            java.lang.String[] r4 = new java.lang.String[]{r7, r2, r3, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L32
            r7.close()
        L32:
            r7 = 1
            return r7
    }

    private boolean sendFinderOpenLive(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            r6.launchWXIfNeed()
            java.lang.String r0 = "MicroMsg.SDK.WXApiImplV10"
            java.lang.String r1 = "sendFinderOpenLive"
            com.tencent.mm.opensdk.utils.Log.i(r0, r1)
            com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/finderOpenLive"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String r2 = r8.feedID
            java.lang.String r8 = r8.nonceID
            java.lang.String[] r4 = new java.lang.String[]{r7, r2, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L2c
            r7.close()
        L2c:
            r7 = 1
            return r7
    }

    private boolean sendFinderOpenProfile(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            r6.launchWXIfNeed()
            java.lang.String r0 = "MicroMsg.SDK.WXApiImplV10"
            java.lang.String r1 = "sendFinderOpenProfile"
            com.tencent.mm.opensdk.utils.Log.i(r0, r1)
            com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/finderOpenProfile"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String r8 = r8.userName
            java.lang.String[] r4 = new java.lang.String[]{r7, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L2a
            r7.close()
        L2a:
            r7 = 1
            return r7
    }

    private boolean sendFinderShareVideo(android.content.Context r9, com.tencent.mm.opensdk.modelbase.BaseReq r10) {
            r8 = this;
            r8.launchWXIfNeed()
            java.lang.String r0 = "MicroMsg.SDK.WXApiImplV10"
            java.lang.String r1 = "sendFinderShareVideo"
            com.tencent.mm.opensdk.utils.Log.i(r0, r1)
            com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo$Req r10 = (com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo.Req) r10
            android.content.ContentResolver r0 = r9.getContentResolver()
            java.lang.String r9 = "content://com.tencent.mm.sdk.comm.provider/finderShareVideo"
            android.net.Uri r1 = android.net.Uri.parse(r9)
            java.lang.String r2 = r8.appId
            java.lang.String r3 = r10.videoPath
            java.lang.String r6 = r10.extData
            com.tencent.mm.opensdk.modelbiz.IWXChannelJumpInfo r9 = r10.jumpInfo
            java.lang.String r7 = r8.finderShareVideoJumpInfoToString(r9)
            java.lang.String r4 = ""
            java.lang.String r5 = ""
            java.lang.String[] r4 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5)
            if (r9 == 0) goto L36
            r9.close()
        L36:
            r9 = 1
            return r9
    }

    private boolean sendHandleScanResult(android.content.Context r7, android.os.Bundle r8) {
            r6 = this;
            r6.launchWXIfNeed()
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/handleScanResult"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String r2 = "_wxapi_scan_qrcode_result"
            java.lang.String r8 = r8.getString(r2)
            java.lang.String[] r4 = new java.lang.String[]{r7, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L25
            r7.close()
        L25:
            r7 = 1
            return r7
    }

    private boolean sendInvoiceAuthInsert(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            r6.launchWXIfNeed()
            com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXInvoiceAuthInsert.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/openTypeWebview"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r8.url
            java.lang.String r7 = java.net.URLEncoder.encode(r7)
            r8 = 1
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r3 = 0
            r2[r3] = r7
            java.lang.String r7 = "url=%s"
            java.lang.String r7 = java.lang.String.format(r7, r2)
            java.lang.String r7 = java.net.URLEncoder.encode(r7)
            java.lang.String r2 = r6.appId
            r3 = 2
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String[] r4 = new java.lang.String[]{r2, r3, r7}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L3c
            r7.close()
        L3c:
            return r8
    }

    private boolean sendJumpToOfflinePayReq(android.content.Context r7, android.os.Bundle r8) {
            r6 = this;
            r6.launchWXIfNeed()
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/jumpToOfflinePay"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String[] r4 = new java.lang.String[]{r7}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L1f
            r7.close()
        L1f:
            r7 = 1
            return r7
    }

    private boolean sendLaunchWXMiniprogram(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            r6.launchWXIfNeed()
            com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogram"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String r2 = r8.userName
            java.lang.String r3 = r8.path
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r8.miniprogramType
            r4.append(r5)
            java.lang.String r5 = ""
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r8 = r8.extData
            java.lang.String[] r4 = new java.lang.String[]{r7, r2, r3, r4, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L3a
            r7.close()
        L3a:
            r7 = 1
            return r7
    }

    private boolean sendLaunchWXMiniprogramWithToken(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            r6.launchWXIfNeed()
            com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/launchWXMiniprogramWithToken"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String r8 = r8.token
            java.lang.String[] r4 = new java.lang.String[]{r7, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L23
            r7.close()
        L23:
            r7 = 1
            return r7
    }

    private boolean sendNonTaxPay(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            r6.launchWXIfNeed()
            com.tencent.mm.opensdk.modelbiz.WXNontaxPay$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXNontaxPay.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/openTypeWebview"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r8.url
            java.lang.String r7 = java.net.URLEncoder.encode(r7)
            r8 = 1
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r3 = 0
            r2[r3] = r7
            java.lang.String r7 = "url=%s"
            java.lang.String r7 = java.lang.String.format(r7, r2)
            java.lang.String r7 = java.net.URLEncoder.encode(r7)
            java.lang.String r2 = r6.appId
            r3 = 3
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String[] r4 = new java.lang.String[]{r2, r3, r7}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L3c
            r7.close()
        L3c:
            return r8
    }

    private boolean sendOpenBusiLuckyMoney(android.content.Context r9, android.os.Bundle r10) {
            r8 = this;
            r8.launchWXIfNeed()
            android.content.ContentResolver r0 = r9.getContentResolver()
            java.lang.String r9 = "content://com.tencent.mm.sdk.comm.provider/openBusiLuckyMoney"
            android.net.Uri r1 = android.net.Uri.parse(r9)
            java.lang.String r2 = r8.appId
            java.lang.String r9 = "_wxapi_open_busi_lucky_money_timeStamp"
            java.lang.String r3 = r10.getString(r9)
            java.lang.String r9 = "_wxapi_open_busi_lucky_money_nonceStr"
            java.lang.String r4 = r10.getString(r9)
            java.lang.String r9 = "_wxapi_open_busi_lucky_money_signType"
            java.lang.String r5 = r10.getString(r9)
            java.lang.String r9 = "_wxapi_open_busi_lucky_money_signature"
            java.lang.String r6 = r10.getString(r9)
            java.lang.String r9 = "_wxapi_open_busi_lucky_money_package"
            java.lang.String r7 = r10.getString(r9)
            java.lang.String[] r4 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5)
            if (r9 == 0) goto L3d
            r9.close()
        L3d:
            r9 = 1
            return r9
    }

    private boolean sendOpenBusinessView(android.content.Context r9, com.tencent.mm.opensdk.modelbase.BaseReq r10) {
            r8 = this;
            r8.launchWXIfNeed()
            com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Req r10 = (com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView.Req) r10
            android.content.ContentResolver r0 = r9.getContentResolver()
            java.lang.String r9 = "content://com.tencent.mm.sdk.comm.provider/openBusinessView"
            android.net.Uri r1 = android.net.Uri.parse(r9)
            java.lang.String r2 = r8.appId
            java.lang.String r3 = r10.businessType
            java.lang.String r4 = r10.query
            java.lang.String r5 = r10.extInfo
            java.lang.String r6 = r10.transaction
            java.lang.String r7 = r10.openId
            java.lang.String[] r4 = new java.lang.String[]{r2, r3, r4, r5, r6, r7}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r9 = r0.query(r1, r2, r3, r4, r5)
            if (r9 == 0) goto L2b
            r9.close()
        L2b:
            r9 = 1
            return r9
    }

    private boolean sendOpenBusinessWebview(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            r6.launchWXIfNeed()
            com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/openBusinessWebview"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.util.HashMap<java.lang.String, java.lang.String> r7 = r8.queryInfo
            java.lang.String r2 = ""
            if (r7 == 0) goto L27
            int r7 = r7.size()
            if (r7 <= 0) goto L27
            org.json.JSONObject r7 = new org.json.JSONObject
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r8.queryInfo
            r7.<init>(r3)
            java.lang.String r7 = r7.toString()
            goto L28
        L27:
            r7 = r2
        L28:
            java.lang.String r3 = r6.appId
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r8 = r8.businessType
            r4.append(r8)
            r4.append(r2)
            java.lang.String r8 = r4.toString()
            java.lang.String[] r4 = new java.lang.String[]{r3, r8, r7}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L4b
            r7.close()
        L4b:
            r7 = 1
            return r7
    }

    private boolean sendOpenCustomerServiceChat(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            r6.launchWXIfNeed()
            com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/openCustomerServiceChat"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String r2 = r8.corpId
            java.lang.String r8 = r8.url
            java.lang.String[] r4 = new java.lang.String[]{r7, r2, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L25
            r7.close()
        L25:
            r7 = 1
            return r7
    }

    private boolean sendOpenRankListReq(android.content.Context r7, android.os.Bundle r8) {
            r6 = this;
            r6.launchWXIfNeed()
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/openRankList"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            r7 = 0
            java.lang.String[] r4 = new java.lang.String[r7]
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L1c
            r7.close()
        L1c:
            r7 = 1
            return r7
    }

    private boolean sendOpenWebview(android.content.Context r7, android.os.Bundle r8) {
            r6 = this;
            r6.launchWXIfNeed()
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/openWebview"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String r2 = "_wxapi_jump_to_webview_url"
            java.lang.String r2 = r8.getString(r2)
            java.lang.String r3 = "_wxapi_basereq_transaction"
            java.lang.String r8 = r8.getString(r3)
            java.lang.String[] r4 = new java.lang.String[]{r7, r2, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L2b
            r7.close()
        L2b:
            r7 = 1
            return r7
    }

    private boolean sendPayInSurance(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            r6.launchWXIfNeed()
            com.tencent.mm.opensdk.modelbiz.WXPayInsurance$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXPayInsurance.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/openTypeWebview"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r8.url
            java.lang.String r7 = java.net.URLEncoder.encode(r7)
            r8 = 1
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r3 = 0
            r2[r3] = r7
            java.lang.String r7 = "url=%s"
            java.lang.String r7 = java.lang.String.format(r7, r2)
            java.lang.String r7 = java.net.URLEncoder.encode(r7)
            java.lang.String r2 = r6.appId
            r3 = 4
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String[] r4 = new java.lang.String[]{r2, r3, r7}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L3c
            r7.close()
        L3c:
            return r8
    }

    private boolean sendPayReq(android.content.Context r6, android.os.Bundle r7) {
            r5 = this;
            java.lang.String r0 = com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.wxappPayEntryClassname
            java.lang.String r1 = "com.tencent.mm"
            java.lang.String r2 = "MicroMsg.SDK.WXApiImplV10"
            if (r0 != 0) goto L69
            com.tencent.mm.opensdk.openapi.MMSharedPreferences r0 = new com.tencent.mm.opensdk.openapi.MMSharedPreferences
            r0.<init>(r6)
            java.lang.String r3 = "_wxapp_pay_entry_classname_"
            r4 = 0
            java.lang.String r0 = r0.getString(r3, r4)
            com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.wxappPayEntryClassname = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "pay, set wxappPayEntryClassname = "
            r0.append(r3)
            java.lang.String r3 = com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.wxappPayEntryClassname
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.opensdk.utils.Log.d(r2, r0)
            java.lang.String r0 = com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.wxappPayEntryClassname
            if (r0 != 0) goto L5e
            android.content.pm.PackageManager r0 = r6.getPackageManager()     // Catch: java.lang.Exception -> L45
            r3 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r1, r3)     // Catch: java.lang.Exception -> L45
            android.os.Bundle r0 = r0.metaData     // Catch: java.lang.Exception -> L45
            java.lang.String r3 = "com.tencent.mm.BuildInfo.OPEN_SDK_PAY_ENTRY_CLASSNAME"
            java.lang.String r0 = r0.getString(r3, r4)     // Catch: java.lang.Exception -> L45
            com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.wxappPayEntryClassname = r0     // Catch: java.lang.Exception -> L45
            goto L5e
        L45:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get from metaData failed : "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.tencent.mm.opensdk.utils.Log.e(r2, r0)
        L5e:
            java.lang.String r0 = com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.wxappPayEntryClassname
            if (r0 != 0) goto L69
            java.lang.String r6 = "pay fail, wxappPayEntryClassname is null"
            com.tencent.mm.opensdk.utils.Log.e(r2, r6)
            r6 = 0
            return r6
        L69:
            com.tencent.mm.opensdk.channel.MMessageActV2$Args r0 = new com.tencent.mm.opensdk.channel.MMessageActV2$Args
            r0.<init>()
            r0.bundle = r7
            r0.targetPkgName = r1
            java.lang.String r7 = com.tencent.mm.opensdk.openapi.BaseWXApiImplV10.wxappPayEntryClassname
            r0.targetClassName = r7
            int r7 = r5.launchMode
            r0.launchMode = r7
            java.lang.String r7 = r5.getTokenFromWX(r6)     // Catch: java.lang.Exception -> L83
            if (r7 == 0) goto L98
            r0.token = r7     // Catch: java.lang.Exception -> L83
            goto L98
        L83:
            r7 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "getTokenFromWX fail, exception = "
            r1.append(r3)
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            com.tencent.mm.opensdk.utils.Log.e(r2, r7)
        L98:
            boolean r6 = com.tencent.mm.opensdk.channel.MMessageActV2.send(r6, r0)
            return r6
    }

    private boolean sendPreloadWXMiniProgramEnvironment(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogramEnvironment"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String r8 = r8.extData
            java.lang.String[] r4 = new java.lang.String[]{r7, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L20
            r7.close()
        L20:
            r7 = 1
            return r7
    }

    private boolean sendPreloadWXMiniprogram(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/preloadWXMiniprogram"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String r2 = r8.userName
            java.lang.String r3 = r8.path
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            int r5 = r8.miniprogramType
            r4.append(r5)
            java.lang.String r5 = ""
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.String r8 = r8.extData
            java.lang.String[] r4 = new java.lang.String[]{r7, r2, r3, r4, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L37
            r7.close()
        L37:
            r7 = 1
            return r7
    }

    private boolean sendQRCodePayReq(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            r6.launchWXIfNeed()
            com.tencent.mm.opensdk.modelbiz.WXQRCodePay$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXQRCodePay.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/QRCodePay"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            java.lang.String r2 = r8.codeContent
            java.lang.String r8 = r8.extraMsg
            java.lang.String[] r4 = new java.lang.String[]{r7, r2, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L25
            r7.close()
        L25:
            r7 = 1
            return r7
    }

    private boolean sendSubscribeMessage(android.content.Context r8, com.tencent.mm.opensdk.modelbase.BaseReq r9) {
            r7 = this;
            r7.launchWXIfNeed()
            com.tencent.mm.opensdk.modelbiz.SubscribeMessage$Req r9 = (com.tencent.mm.opensdk.modelbiz.SubscribeMessage.Req) r9
            android.content.ContentResolver r0 = r8.getContentResolver()
            java.lang.String r8 = "content://com.tencent.mm.sdk.comm.provider/openTypeWebview"
            android.net.Uri r1 = android.net.Uri.parse(r8)
            java.lang.String r8 = r7.appId
            r6 = 1
            java.lang.String r2 = java.lang.String.valueOf(r6)
            int r3 = r9.scene
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = r9.templateID
            java.lang.String r9 = r9.reserved
            java.lang.String[] r4 = new java.lang.String[]{r8, r2, r3, r4, r9}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r8 = r0.query(r1, r2, r3, r4, r5)
            if (r8 == 0) goto L30
            r8.close()
        L30:
            return r6
    }

    private boolean sendSubscribeMiniProgramMsg(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            r6.launchWXIfNeed()
            com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg$Req r8 = (com.tencent.mm.opensdk.modelbiz.SubscribeMiniProgramMsg.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/openTypeWebview"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.lang.String r7 = r6.appId
            r2 = 5
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r8 = r8.miniProgramAppId
            java.lang.String[] r4 = new java.lang.String[]{r7, r2, r8}
            r3 = 0
            r5 = 0
            r2 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L28
            r7.close()
        L28:
            r7 = 1
            return r7
    }

    private boolean sendToWxaRedirectingPage(android.content.Context r7, com.tencent.mm.opensdk.modelbase.BaseReq r8) {
            r6 = this;
            r6.launchWXIfNeed()
            com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Req r8 = (com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage.Req) r8
            android.content.ContentResolver r0 = r7.getContentResolver()
            java.lang.String r7 = "content://com.tencent.mm.sdk.comm.provider/launchWxaOpenApiRedirectingPage"
            android.net.Uri r1 = android.net.Uri.parse(r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r2 = r6.appId
            r3 = 0
            r7.add(r3, r2)
            java.lang.String[] r8 = r8.toArray()
            java.util.List r8 = java.util.Arrays.asList(r8)
            r7.addAll(r8)
            java.lang.String[] r8 = new java.lang.String[r3]
            java.lang.Object[] r7 = r7.toArray(r8)
            r4 = r7
            java.lang.String[] r4 = (java.lang.String[]) r4
            r5 = 0
            r2 = 0
            r3 = 0
            android.database.Cursor r7 = r0.query(r1, r2, r3, r4, r5)
            if (r7 == 0) goto L3a
            r7.close()
        L3a:
            r7 = 1
            return r7
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public void detach() {
            r2 = this;
            java.lang.String r0 = "MicroMsg.SDK.WXApiImplV10"
            java.lang.String r1 = "detach"
            com.tencent.mm.opensdk.utils.Log.d(r0, r1)
            r0 = 1
            r2.detached = r0
            r0 = 0
            r2.context = r0
            return
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public int getWXAppSupportAPI() {
            r6 = this;
            boolean r0 = r6.detached
            if (r0 != 0) goto L9a
            boolean r0 = r6.isWXAppInstalled()
            r1 = 0
            java.lang.String r2 = "MicroMsg.SDK.WXApiImplV10"
            if (r0 != 0) goto L13
            java.lang.String r0 = "open wx app failed, not installed or signature check failed"
            com.tencent.mm.opensdk.utils.Log.e(r2, r0)
            return r1
        L13:
            r6.wxSdkVersion = r1
            java.util.concurrent.CountDownLatch r0 = new java.util.concurrent.CountDownLatch
            r3 = 1
            r0.<init>(r3)
            java.util.concurrent.ThreadPoolExecutor r3 = com.tencent.mm.opensdk.utils.b.e
            com.tencent.mm.opensdk.openapi.BaseWXApiImplV10$1 r4 = new com.tencent.mm.opensdk.openapi.BaseWXApiImplV10$1
            r4.<init>(r6, r0)
            r3.submit(r4)
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.InterruptedException -> L2d
            r4 = 1000(0x3e8, double:4.94E-321)
            r0.await(r4, r3)     // Catch: java.lang.InterruptedException -> L2d
            goto L35
        L2d:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            com.tencent.mm.opensdk.utils.Log.w(r2, r0)
        L35:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "wxSdkVersion = "
            r0.append(r3)
            int r3 = r6.wxSdkVersion
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.opensdk.utils.Log.d(r2, r0)
            int r0 = r6.wxSdkVersion
            if (r0 != 0) goto L97
            android.content.Context r0 = r6.context     // Catch: java.lang.Exception -> L7e
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "com.tencent.mm"
            r4 = 128(0x80, float:1.8E-43)
            android.content.pm.ApplicationInfo r0 = r0.getApplicationInfo(r3, r4)     // Catch: java.lang.Exception -> L7e
            android.os.Bundle r0 = r0.metaData     // Catch: java.lang.Exception -> L7e
            java.lang.String r3 = "com.tencent.mm.BuildInfo.OPEN_SDK_VERSION"
            int r0 = r0.getInt(r3, r1)     // Catch: java.lang.Exception -> L7e
            r6.wxSdkVersion = r0     // Catch: java.lang.Exception -> L7e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L7e
            r0.<init>()     // Catch: java.lang.Exception -> L7e
            java.lang.String r1 = "OPEN_SDK_VERSION = "
            r0.append(r1)     // Catch: java.lang.Exception -> L7e
            int r1 = r6.wxSdkVersion     // Catch: java.lang.Exception -> L7e
            r0.append(r1)     // Catch: java.lang.Exception -> L7e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L7e
            com.tencent.mm.opensdk.utils.Log.d(r2, r0)     // Catch: java.lang.Exception -> L7e
            goto L97
        L7e:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "get from metaData failed : "
            r1.append(r3)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.mm.opensdk.utils.Log.e(r2, r0)
        L97:
            int r0 = r6.wxSdkVersion
            return r0
        L9a:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "getWXAppSupportAPI fail, WXMsgImpl has been detached"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean handleIntent(android.content.Intent r8, com.tencent.mm.opensdk.openapi.IWXAPIEventHandler r9) {
            r7 = this;
            java.lang.String r0 = "openbusinesswebview"
            java.lang.String r1 = "MicroMsg.SDK.WXApiImplV10"
            r2 = 0
            java.lang.String r3 = "com.tencent.mm.openapi.token"
            boolean r3 = com.tencent.mm.opensdk.openapi.WXApiImplComm.isIntentFromWx(r8, r3)     // Catch: java.lang.Exception -> L13
            if (r3 != 0) goto L16
            java.lang.String r8 = "handleIntent fail, intent not from weixin msg"
            com.tencent.mm.opensdk.utils.Log.i(r1, r8)     // Catch: java.lang.Exception -> L13
            return r2
        L13:
            r8 = move-exception
            goto L2aa
        L16:
            boolean r3 = r7.detached     // Catch: java.lang.Exception -> L13
            if (r3 != 0) goto L2a2
            java.lang.String r3 = "_mmessage_content"
            java.lang.String r3 = r8.getStringExtra(r3)     // Catch: java.lang.Exception -> L13
            java.lang.String r4 = "_mmessage_sdkVersion"
            int r4 = r8.getIntExtra(r4, r2)     // Catch: java.lang.Exception -> L13
            java.lang.String r5 = "_mmessage_appPackage"
            java.lang.String r5 = r8.getStringExtra(r5)     // Catch: java.lang.Exception -> L13
            if (r5 == 0) goto L29c
            int r6 = r5.length()     // Catch: java.lang.Exception -> L13
            if (r6 != 0) goto L36
            goto L29c
        L36:
            java.lang.String r6 = "_mmessage_checksum"
            byte[] r6 = r8.getByteArrayExtra(r6)     // Catch: java.lang.Exception -> L13
            byte[] r3 = com.tencent.mm.opensdk.channel.a.a.a(r3, r4, r5)     // Catch: java.lang.Exception -> L13
            boolean r3 = r7.checkSumConsistent(r6, r3)     // Catch: java.lang.Exception -> L13
            if (r3 != 0) goto L4c
            java.lang.String r8 = "checksum fail"
            com.tencent.mm.opensdk.utils.Log.e(r1, r8)     // Catch: java.lang.Exception -> L13
            return r2
        L4c:
            java.lang.String r3 = "_wxapi_command_type"
            int r3 = r8.getIntExtra(r3, r2)     // Catch: java.lang.Exception -> L13
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L13
            r4.<init>()     // Catch: java.lang.Exception -> L13
            java.lang.String r5 = "handleIntent, cmd = "
            r4.append(r5)     // Catch: java.lang.Exception -> L13
            r4.append(r3)     // Catch: java.lang.Exception -> L13
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Exception -> L13
            com.tencent.mm.opensdk.utils.Log.i(r1, r4)     // Catch: java.lang.Exception -> L13
            r4 = 1
            switch(r3) {
                case 1: goto L28f;
                case 2: goto L282;
                case 3: goto L275;
                case 4: goto L1b8;
                case 5: goto L1ab;
                case 6: goto L19e;
                case 7: goto L6a;
                case 8: goto L6a;
                case 9: goto L191;
                case 10: goto L6a;
                case 11: goto L6a;
                case 12: goto L184;
                case 13: goto L6a;
                case 14: goto L177;
                case 15: goto L16a;
                case 16: goto L15d;
                case 17: goto L150;
                case 18: goto L6a;
                case 19: goto L143;
                case 20: goto L6a;
                case 21: goto L6a;
                case 22: goto L6a;
                case 23: goto L6a;
                case 24: goto L136;
                case 25: goto L129;
                case 26: goto L11c;
                case 27: goto L10f;
                case 28: goto L102;
                case 29: goto Lf5;
                case 30: goto Le8;
                case 31: goto Ldb;
                case 32: goto Lce;
                case 33: goto Lc1;
                case 34: goto Lb4;
                case 35: goto La7;
                case 36: goto L9a;
                case 37: goto L8d;
                case 38: goto L80;
                default: goto L6a;
            }     // Catch: java.lang.Exception -> L13
        L6a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L13
            r8.<init>()     // Catch: java.lang.Exception -> L13
            java.lang.String r9 = "unknown cmd = "
            r8.append(r9)     // Catch: java.lang.Exception -> L13
            r8.append(r3)     // Catch: java.lang.Exception -> L13
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L13
            com.tencent.mm.opensdk.utils.Log.e(r1, r8)     // Catch: java.lang.Exception -> L13
            goto L2c2
        L80:
            com.tencent.mm.opensdk.modelbiz.WXQRCodePay$Resp r0 = new com.tencent.mm.opensdk.modelbiz.WXQRCodePay$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L8d:
            com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat$Resp r0 = new com.tencent.mm.opensdk.modelbiz.WXOpenCustomerServiceChat$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L9a:
            com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed$Resp r0 = new com.tencent.mm.opensdk.modelbiz.WXChannelOpenFeed$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        La7:
            com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive$Resp r0 = new com.tencent.mm.opensdk.modelbiz.WXChannelOpenLive$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        Lb4:
            com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile$Resp r0 = new com.tencent.mm.opensdk.modelbiz.WXChannelOpenProfile$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        Lc1:
            com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo$Resp r0 = new com.tencent.mm.opensdk.modelbiz.WXChannelShareVideo$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        Lce:
            com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment$Resp r0 = new com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgramEnvironment$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        Ldb:
            com.tencent.mm.opensdk.modelmsg.SendTdiAuth$Resp r0 = new com.tencent.mm.opensdk.modelmsg.SendTdiAuth$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        Le8:
            com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Resp r0 = new com.tencent.mm.opensdk.modelbiz.WXLaunchWxaRedirectingPage$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        Lf5:
            com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken$Resp r0 = new com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgramWithToken$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L102:
            com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram$Resp r0 = new com.tencent.mm.opensdk.modelbiz.WXPreloadMiniProgram$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L10f:
            com.tencent.mm.opensdk.modelpay.WXJointPay$JointPayResp r0 = new com.tencent.mm.opensdk.modelpay.WXJointPay$JointPayResp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L11c:
            com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Resp r0 = new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessView$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L129:
            com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview$Resp r0 = new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L136:
            com.tencent.mm.opensdk.modelpay.JumpToOfflinePay$Resp r0 = new com.tencent.mm.opensdk.modelpay.JumpToOfflinePay$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L143:
            com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Resp r0 = new com.tencent.mm.opensdk.modelbiz.WXLaunchMiniProgram$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L150:
            com.tencent.mm.opensdk.modelbiz.HandleScanResult$Resp r0 = new com.tencent.mm.opensdk.modelbiz.HandleScanResult$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L15d:
            com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage$Resp r0 = new com.tencent.mm.opensdk.modelbiz.ChooseCardFromWXCardPackage$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L16a:
            com.tencent.mm.opensdk.modelbiz.JoinChatroom$Resp r0 = new com.tencent.mm.opensdk.modelbiz.JoinChatroom$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L177:
            com.tencent.mm.opensdk.modelbiz.CreateChatroom$Resp r0 = new com.tencent.mm.opensdk.modelbiz.CreateChatroom$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L184:
            com.tencent.mm.opensdk.modelbiz.OpenWebview$Resp r0 = new com.tencent.mm.opensdk.modelbiz.OpenWebview$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L191:
            com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage$Resp r0 = new com.tencent.mm.opensdk.modelbiz.AddCardToWXCardPackage$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L19e:
            com.tencent.mm.opensdk.modelmsg.LaunchFromWX$Req r0 = new com.tencent.mm.opensdk.modelmsg.LaunchFromWX$Req     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onReq(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L1ab:
            com.tencent.mm.opensdk.modelpay.PayResp r0 = new com.tencent.mm.opensdk.modelpay.PayResp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L1b8:
            com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX$Req r3 = new com.tencent.mm.opensdk.modelmsg.ShowMessageFromWX$Req     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r3.<init>(r8)     // Catch: java.lang.Exception -> L13
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r8 = r3.message     // Catch: java.lang.Exception -> L13
            java.lang.String r8 = r8.messageExt     // Catch: java.lang.Exception -> L13
            if (r8 == 0) goto L1e8
            java.lang.String r5 = "wx_internal_resptype"
            boolean r5 = r8.contains(r5)     // Catch: java.lang.Exception -> L13
            if (r5 == 0) goto L1e8
            boolean r8 = r7.handleWxInternalRespType(r8, r9)     // Catch: java.lang.Exception -> L13
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L13
            r9.<init>()     // Catch: java.lang.Exception -> L13
            java.lang.String r0 = "handleIntent, extInfo contains wx_internal_resptype, ret = "
            r9.append(r0)     // Catch: java.lang.Exception -> L13
            r9.append(r8)     // Catch: java.lang.Exception -> L13
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Exception -> L13
            com.tencent.mm.opensdk.utils.Log.i(r1, r9)     // Catch: java.lang.Exception -> L13
            return r8
        L1e8:
            if (r8 == 0) goto L271
            boolean r5 = r8.contains(r0)     // Catch: java.lang.Exception -> L13
            if (r5 == 0) goto L271
            android.net.Uri r5 = android.net.Uri.parse(r8)     // Catch: java.lang.Exception -> L21a
            if (r5 == 0) goto L244
            java.lang.String r6 = r5.getHost()     // Catch: java.lang.Exception -> L21a
            boolean r0 = r0.equals(r6)     // Catch: java.lang.Exception -> L21a
            if (r0 == 0) goto L244
            com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview$Resp r8 = new com.tencent.mm.opensdk.modelbiz.WXOpenBusinessWebview$Resp     // Catch: java.lang.Exception -> L21a
            r8.<init>()     // Catch: java.lang.Exception -> L21a
            java.lang.String r0 = "ret"
            java.lang.String r0 = r5.getQueryParameter(r0)     // Catch: java.lang.Exception -> L21a
            if (r0 == 0) goto L21c
            int r6 = r0.length()     // Catch: java.lang.Exception -> L21a
            if (r6 <= 0) goto L21c
            int r0 = com.tencent.mm.opensdk.utils.b.a(r0, r2)     // Catch: java.lang.Exception -> L21a
            r8.errCode = r0     // Catch: java.lang.Exception -> L21a
            goto L21c
        L21a:
            r8 = move-exception
            goto L259
        L21c:
            java.lang.String r0 = "resultInfo"
            java.lang.String r0 = r5.getQueryParameter(r0)     // Catch: java.lang.Exception -> L21a
            r8.resultInfo = r0     // Catch: java.lang.Exception -> L21a
            java.lang.String r0 = "errmsg"
            java.lang.String r0 = r5.getQueryParameter(r0)     // Catch: java.lang.Exception -> L21a
            r8.errStr = r0     // Catch: java.lang.Exception -> L21a
            java.lang.String r0 = "type"
            java.lang.String r0 = r5.getQueryParameter(r0)     // Catch: java.lang.Exception -> L21a
            if (r0 == 0) goto L240
            int r5 = r0.length()     // Catch: java.lang.Exception -> L21a
            if (r5 <= 0) goto L240
            int r0 = com.tencent.mm.opensdk.utils.b.a(r0, r2)     // Catch: java.lang.Exception -> L21a
            r8.businessType = r0     // Catch: java.lang.Exception -> L21a
        L240:
            r9.onResp(r8)     // Catch: java.lang.Exception -> L21a
            return r4
        L244:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L21a
            r0.<init>()     // Catch: java.lang.Exception -> L21a
            java.lang.String r5 = "not openbusinesswebview %"
            r0.append(r5)     // Catch: java.lang.Exception -> L21a
            r0.append(r8)     // Catch: java.lang.Exception -> L21a
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Exception -> L21a
            com.tencent.mm.opensdk.utils.Log.d(r1, r8)     // Catch: java.lang.Exception -> L21a
            goto L271
        L259:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L13
            r0.<init>()     // Catch: java.lang.Exception -> L13
            java.lang.String r5 = "parse fail, ex = "
            r0.append(r5)     // Catch: java.lang.Exception -> L13
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Exception -> L13
            r0.append(r8)     // Catch: java.lang.Exception -> L13
            java.lang.String r8 = r0.toString()     // Catch: java.lang.Exception -> L13
            com.tencent.mm.opensdk.utils.Log.e(r1, r8)     // Catch: java.lang.Exception -> L13
        L271:
            r9.onReq(r3)     // Catch: java.lang.Exception -> L13
            return r4
        L275:
            com.tencent.mm.opensdk.modelmsg.GetMessageFromWX$Req r0 = new com.tencent.mm.opensdk.modelmsg.GetMessageFromWX$Req     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onReq(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L282:
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Resp r0 = new com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L28f:
            com.tencent.mm.opensdk.modelmsg.SendAuth$Resp r0 = new com.tencent.mm.opensdk.modelmsg.SendAuth$Resp     // Catch: java.lang.Exception -> L13
            android.os.Bundle r8 = r8.getExtras()     // Catch: java.lang.Exception -> L13
            r0.<init>(r8)     // Catch: java.lang.Exception -> L13
            r9.onResp(r0)     // Catch: java.lang.Exception -> L13
            return r4
        L29c:
            java.lang.String r8 = "invalid argument"
            com.tencent.mm.opensdk.utils.Log.e(r1, r8)     // Catch: java.lang.Exception -> L13
            return r2
        L2a2:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Exception -> L13
            java.lang.String r9 = "handleIntent fail, WXMsgImpl has been detached"
            r8.<init>(r9)     // Catch: java.lang.Exception -> L13
            throw r8     // Catch: java.lang.Exception -> L13
        L2aa:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "handleIntent fail, ex = "
            r9.append(r0)
            java.lang.String r8 = r8.getMessage()
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            com.tencent.mm.opensdk.utils.Log.e(r1, r8)
        L2c2:
            return r2
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean isWXAppInstalled() {
            r4 = this;
            boolean r0 = r4.detached
            if (r0 != 0) goto L21
            r0 = 0
            android.content.Context r1 = r4.context     // Catch: java.lang.Exception -> L20
            android.content.pm.PackageManager r1 = r1.getPackageManager()     // Catch: java.lang.Exception -> L20
            java.lang.String r2 = "com.tencent.mm"
            r3 = 64
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.lang.Exception -> L20
            if (r1 != 0) goto L16
            return r0
        L16:
            android.content.Context r2 = r4.context     // Catch: java.lang.Exception -> L20
            android.content.pm.Signature[] r1 = r1.signatures     // Catch: java.lang.Exception -> L20
            boolean r3 = r4.checkSignature     // Catch: java.lang.Exception -> L20
            boolean r0 = com.tencent.mm.opensdk.openapi.WXApiImplComm.validateAppSignature(r2, r1, r3)     // Catch: java.lang.Exception -> L20
        L20:
            return r0
        L21:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "isWXAppInstalled fail, WXMsgImpl has been detached"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean openWXApp() {
            r5 = this;
            boolean r0 = r5.detached
            if (r0 != 0) goto L3b
            boolean r0 = r5.isWXAppInstalled()
            r1 = 0
            java.lang.String r2 = "MicroMsg.SDK.WXApiImplV10"
            if (r0 != 0) goto L13
            java.lang.String r0 = "open wx app failed, not installed or signature check failed"
        Lf:
            com.tencent.mm.opensdk.utils.Log.e(r2, r0)
            return r1
        L13:
            android.content.Context r0 = r5.context     // Catch: java.lang.Exception -> L24
            android.content.pm.PackageManager r3 = r0.getPackageManager()     // Catch: java.lang.Exception -> L24
            java.lang.String r4 = "com.tencent.mm"
            android.content.Intent r3 = r3.getLaunchIntentForPackage(r4)     // Catch: java.lang.Exception -> L24
            r0.startActivity(r3)     // Catch: java.lang.Exception -> L24
            r0 = 1
            return r0
        L24:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "startActivity fail, exception = "
            r3.append(r4)
            java.lang.String r0 = r0.getMessage()
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            goto Lf
        L3b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "openWXApp fail, WXMsgImpl has been detached"
            r0.<init>(r1)
            throw r0
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean registerApp(java.lang.String r3) {
            r2 = this;
            r0 = 0
            boolean r3 = r2.registerApp(r3, r0)
            return r3
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean registerApp(java.lang.String r5, long r6) {
            r4 = this;
            boolean r0 = r4.detached
            if (r0 != 0) goto L8a
            android.content.Context r0 = r4.context
            boolean r1 = r4.checkSignature
            java.lang.String r2 = "com.tencent.mm"
            boolean r0 = com.tencent.mm.opensdk.openapi.WXApiImplComm.validateAppSignatureForPackage(r0, r2, r1)
            java.lang.String r1 = "MicroMsg.SDK.WXApiImplV10"
            if (r0 != 0) goto L19
            java.lang.String r5 = "register app failed for wechat app signature check failed"
            com.tencent.mm.opensdk.utils.Log.e(r1, r5)
            r5 = 0
            return r5
        L19:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "registerApp, appId = "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.opensdk.utils.Log.d(r1, r0)
            if (r5 == 0) goto L31
            r4.appId = r5
        L31:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.opensdk.utils.Log.d(r1, r0)
            if (r5 == 0) goto L47
            r4.appId = r5
        L47:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "register app "
            r5.append(r0)
            android.content.Context r0 = r4.context
            java.lang.String r0 = r0.getPackageName()
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            com.tencent.mm.opensdk.utils.Log.d(r1, r5)
            com.tencent.mm.opensdk.channel.a.a$a r5 = new com.tencent.mm.opensdk.channel.a.a$a
            r5.<init>()
            r5.a = r2
            java.lang.String r0 = "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_REGISTER"
            r5.b = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "weixin://registerapp?appid="
            r0.append(r1)
            java.lang.String r1 = r4.appId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.c = r0
            r5.d = r6
            android.content.Context r6 = r4.context
            boolean r5 = com.tencent.mm.opensdk.channel.a.a.a(r6, r5)
            return r5
        L8a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "registerApp fail, WXMsgImpl has been detached"
            r5.<init>(r6)
            throw r5
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean sendReq(com.tencent.mm.opensdk.modelbase.BaseReq r11) {
            r10 = this;
            boolean r0 = r10.detached
            if (r0 != 0) goto L320
            android.content.Context r0 = r10.context
            boolean r1 = r10.checkSignature
            java.lang.String r2 = "com.tencent.mm"
            boolean r0 = com.tencent.mm.opensdk.openapi.WXApiImplComm.validateAppSignatureForPackage(r0, r2, r1)
            java.lang.String r1 = "MicroMsg.SDK.WXApiImplV10"
            r3 = 0
            if (r0 != 0) goto L19
            java.lang.String r11 = "sendReq failed for wechat app signature check failed"
        L15:
            com.tencent.mm.opensdk.utils.Log.e(r1, r11)
            return r3
        L19:
            int r0 = r11.getType()
            r4 = 2
            r5 = 1
            if (r0 != r4) goto L5a
            r0 = r11
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req r0 = (com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req) r0
            int r6 = r0.scene
            r7 = 4
            if (r6 != r7) goto L5a
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$IWXSceneDataObject r6 = r0.sceneDataObject
            boolean r7 = r6 instanceof com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject
            if (r7 == 0) goto L5a
            com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject r6 = (com.tencent.mm.opensdk.modelmsg.WXStateSceneDataObject) r6
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r7 = r0.message
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r8 = r7.mediaObject
            if (r8 != 0) goto L3e
            com.tencent.mm.opensdk.modelmsg.WXTextObject r8 = new com.tencent.mm.opensdk.modelmsg.WXTextObject
            r8.<init>()
            r7.mediaObject = r8
        L3e:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r7 = r0.message
            int r7 = r7.getType()
            if (r7 != r5) goto L5a
            java.lang.String r7 = r6.stateTitle
            if (r7 == 0) goto L50
            int r7 = r7.length()
            if (r7 > 0) goto L5a
        L50:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r0 = r0.message
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r0 = r0.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXTextObject r0 = (com.tencent.mm.opensdk.modelmsg.WXTextObject) r0
            java.lang.String r0 = r0.text
            r6.stateTitle = r0
        L5a:
            boolean r0 = r11.checkArgs()
            if (r0 != 0) goto L63
            java.lang.String r11 = "sendReq checkArgs fail"
            goto L15
        L63:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "sendReq, req type = "
            r0.append(r6)
            int r6 = r11.getType()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.opensdk.utils.Log.i(r1, r0)
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r11.toBundle(r0)
            int r6 = r11.getType()
            r7 = 5
            if (r6 == r7) goto L319
            int r6 = r11.getType()
            r7 = 27
            if (r6 != r7) goto L94
            goto L319
        L94:
            int r6 = r11.getType()
            r7 = 9
            if (r6 != r7) goto La3
            android.content.Context r11 = r10.context
            boolean r11 = r10.sendAddCardToWX(r11, r0)
            return r11
        La3:
            int r6 = r11.getType()
            r7 = 16
            if (r6 != r7) goto Lb2
            android.content.Context r11 = r10.context
            boolean r11 = r10.sendChooseCardFromWX(r11, r0)
            return r11
        Lb2:
            int r6 = r11.getType()
            r7 = 11
            if (r6 != r7) goto Lc1
            android.content.Context r11 = r10.context
            boolean r11 = r10.sendOpenRankListReq(r11, r0)
            return r11
        Lc1:
            int r6 = r11.getType()
            r7 = 12
            if (r6 != r7) goto Ld0
            android.content.Context r11 = r10.context
            boolean r11 = r10.sendOpenWebview(r11, r0)
            return r11
        Ld0:
            int r6 = r11.getType()
            r7 = 25
            if (r6 != r7) goto Ldf
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendOpenBusinessWebview(r0, r11)
            return r11
        Ldf:
            int r6 = r11.getType()
            r7 = 13
            if (r6 != r7) goto Lee
            android.content.Context r11 = r10.context
            boolean r11 = r10.sendOpenBusiLuckyMoney(r11, r0)
            return r11
        Lee:
            int r6 = r11.getType()
            r7 = 14
            if (r6 != r7) goto Lfd
            android.content.Context r11 = r10.context
            boolean r11 = r10.createChatroom(r11, r0)
            return r11
        Lfd:
            int r6 = r11.getType()
            r7 = 15
            if (r6 != r7) goto L10c
            android.content.Context r11 = r10.context
            boolean r11 = r10.joinChatroom(r11, r0)
            return r11
        L10c:
            int r6 = r11.getType()
            r7 = 17
            if (r6 != r7) goto L11b
            android.content.Context r11 = r10.context
            boolean r11 = r10.sendHandleScanResult(r11, r0)
            return r11
        L11b:
            int r6 = r11.getType()
            r7 = 18
            if (r6 != r7) goto L12a
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendSubscribeMessage(r0, r11)
            return r11
        L12a:
            int r6 = r11.getType()
            r7 = 28
            if (r6 != r7) goto L139
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendPreloadWXMiniprogram(r0, r11)
            return r11
        L139:
            int r6 = r11.getType()
            r7 = 29
            if (r6 != r7) goto L148
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendLaunchWXMiniprogramWithToken(r0, r11)
            return r11
        L148:
            int r6 = r11.getType()
            r7 = 23
            if (r6 != r7) goto L157
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendSubscribeMiniProgramMsg(r0, r11)
            return r11
        L157:
            int r6 = r11.getType()
            r7 = 19
            if (r6 != r7) goto L166
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendLaunchWXMiniprogram(r0, r11)
            return r11
        L166:
            int r6 = r11.getType()
            r7 = 32
            if (r6 != r7) goto L175
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendPreloadWXMiniProgramEnvironment(r0, r11)
            return r11
        L175:
            int r6 = r11.getType()
            r7 = 30
            if (r6 != r7) goto L184
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendToWxaRedirectingPage(r0, r11)
            return r11
        L184:
            int r6 = r11.getType()
            r7 = 26
            if (r6 != r7) goto L193
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendOpenBusinessView(r0, r11)
            return r11
        L193:
            int r6 = r11.getType()
            r7 = 33
            if (r6 != r7) goto L1a2
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendFinderShareVideo(r0, r11)
            return r11
        L1a2:
            int r6 = r11.getType()
            r7 = 34
            if (r6 != r7) goto L1b1
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendFinderOpenProfile(r0, r11)
            return r11
        L1b1:
            int r6 = r11.getType()
            r7 = 35
            if (r6 != r7) goto L1c0
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendFinderOpenLive(r0, r11)
            return r11
        L1c0:
            int r6 = r11.getType()
            r7 = 36
            if (r6 != r7) goto L1cf
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendFinderOpenFeed(r0, r11)
            return r11
        L1cf:
            int r6 = r11.getType()
            r7 = 37
            if (r6 != r7) goto L1de
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendOpenCustomerServiceChat(r0, r11)
            return r11
        L1de:
            int r6 = r11.getType()
            r7 = 38
            if (r6 != r7) goto L1ed
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendQRCodePayReq(r0, r11)
            return r11
        L1ed:
            int r6 = r11.getType()
            r7 = 20
            if (r6 != r7) goto L1fc
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendInvoiceAuthInsert(r0, r11)
            return r11
        L1fc:
            int r6 = r11.getType()
            r7 = 21
            if (r6 != r7) goto L20b
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendNonTaxPay(r0, r11)
            return r11
        L20b:
            int r6 = r11.getType()
            r7 = 22
            if (r6 != r7) goto L21a
            android.content.Context r0 = r10.context
            boolean r11 = r10.sendPayInSurance(r0, r11)
            return r11
        L21a:
            int r6 = r11.getType()
            r7 = 24
            if (r6 != r7) goto L229
            android.content.Context r11 = r10.context
            boolean r11 = r10.sendJumpToOfflinePayReq(r11, r0)
            return r11
        L229:
            int r6 = r11.getType()
            if (r6 != r4) goto L2cc
            r4 = r11
            com.tencent.mm.opensdk.modelmsg.SendMessageToWX$Req r4 = (com.tencent.mm.opensdk.modelmsg.SendMessageToWX.Req) r4
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r6 = r4.message
            int r6 = r6.getType()
            boolean r7 = com.tencent.mm.opensdk.utils.b.a(r6)
            if (r7 == 0) goto L2cc
            int r7 = r10.getWXAppSupportAPI()
            r8 = 620756993(0x25000001, float:1.1102232E-16)
            java.lang.String r9 = "_wxminiprogram_webpageurl"
            if (r7 >= r8) goto L259
            com.tencent.mm.opensdk.modelmsg.WXWebpageObject r6 = new com.tencent.mm.opensdk.modelmsg.WXWebpageObject
            r6.<init>()
        L24e:
            java.lang.String r7 = r0.getString(r9)
            r6.webpageUrl = r7
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r7 = r4.message
            r7.mediaObject = r6
            goto L2c0
        L259:
            r7 = 46
            if (r6 != r7) goto L26c
            int r6 = r10.getWXAppSupportAPI()
            r7 = 620953856(0x25030100, float:1.1362778E-16)
            if (r6 >= r7) goto L26c
            com.tencent.mm.opensdk.modelmsg.WXWebpageObject r6 = new com.tencent.mm.opensdk.modelmsg.WXWebpageObject
            r6.<init>()
            goto L24e
        L26c:
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage r6 = r4.message
            com.tencent.mm.opensdk.modelmsg.WXMediaMessage$IMediaObject r6 = r6.mediaObject
            com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject r6 = (com.tencent.mm.opensdk.modelmsg.WXMiniProgramObject) r6
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = r6.userName
            r7.append(r8)
            java.lang.String r8 = "@app"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            r6.userName = r7
            java.lang.String r7 = r6.path
            boolean r8 = com.tencent.mm.opensdk.utils.b.b(r7)
            if (r8 != 0) goto L2c0
            java.lang.String r8 = "\\?"
            java.lang.String[] r7 = r7.split(r8)
            int r8 = r7.length
            if (r8 <= r5) goto L2b1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r9 = r7[r3]
            r8.append(r9)
            java.lang.String r9 = ".html?"
            r8.append(r9)
            r7 = r7[r5]
        L2a9:
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            goto L2be
        L2b1:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r7 = r7[r3]
            r8.append(r7)
            java.lang.String r7 = ".html"
            goto L2a9
        L2be:
            r6.path = r7
        L2c0:
            int r6 = r4.scene
            r7 = 3
            if (r6 == r7) goto L2c9
            if (r6 == r5) goto L2c9
            r4.scene = r3
        L2c9:
            r11.toBundle(r0)
        L2cc:
            com.tencent.mm.opensdk.channel.MMessageActV2$Args r11 = new com.tencent.mm.opensdk.channel.MMessageActV2$Args
            r11.<init>()
            r11.bundle = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "weixin://sendreq?appid="
            r0.append(r3)
            java.lang.String r3 = r10.appId
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r11.content = r0
            r11.targetPkgName = r2
            java.lang.String r0 = "com.tencent.mm.plugin.base.stub.WXEntryActivity"
            r11.targetClassName = r0
            int r0 = r10.launchMode
            r11.launchMode = r0
            android.content.Context r0 = r10.context     // Catch: java.lang.Exception -> L2fd
            java.lang.String r0 = r10.getTokenFromWX(r0)     // Catch: java.lang.Exception -> L2fd
            if (r0 == 0) goto L312
            r11.token = r0     // Catch: java.lang.Exception -> L2fd
            goto L312
        L2fd:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getTokenFromWX fail, exception = "
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            com.tencent.mm.opensdk.utils.Log.e(r1, r0)
        L312:
            android.content.Context r0 = r10.context
            boolean r11 = com.tencent.mm.opensdk.channel.MMessageActV2.send(r0, r11)
            return r11
        L319:
            android.content.Context r11 = r10.context
            boolean r11 = r10.sendPayReq(r11, r0)
            return r11
        L320:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "sendReq fail, WXMsgImpl has been detached"
            r11.<init>(r0)
            throw r11
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public boolean sendResp(com.tencent.mm.opensdk.modelbase.BaseResp r5) {
            r4 = this;
            boolean r0 = r4.detached
            if (r0 != 0) goto L73
            android.content.Context r0 = r4.context
            boolean r1 = r4.checkSignature
            java.lang.String r2 = "com.tencent.mm"
            boolean r0 = com.tencent.mm.opensdk.openapi.WXApiImplComm.validateAppSignatureForPackage(r0, r2, r1)
            r1 = 0
            java.lang.String r3 = "MicroMsg.SDK.WXApiImplV10"
            if (r0 != 0) goto L19
            java.lang.String r5 = "sendResp failed for wechat app signature check failed"
        L15:
            com.tencent.mm.opensdk.utils.Log.e(r3, r5)
            return r1
        L19:
            boolean r0 = r5.checkArgs()
            if (r0 != 0) goto L22
            java.lang.String r5 = "sendResp checkArgs fail"
            goto L15
        L22:
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r5.toBundle(r0)
            com.tencent.mm.opensdk.channel.MMessageActV2$Args r5 = new com.tencent.mm.opensdk.channel.MMessageActV2$Args
            r5.<init>()
            r5.bundle = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "weixin://sendresp?appid="
            r0.append(r1)
            java.lang.String r1 = r4.appId
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.content = r0
            r5.targetPkgName = r2
            java.lang.String r0 = "com.tencent.mm.plugin.base.stub.WXEntryActivity"
            r5.targetClassName = r0
            android.content.Context r0 = r4.context     // Catch: java.lang.Exception -> L57
            java.lang.String r0 = r4.getTokenFromWX(r0)     // Catch: java.lang.Exception -> L57
            if (r0 == 0) goto L6c
            r5.token = r0     // Catch: java.lang.Exception -> L57
            goto L6c
        L57:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getTokenFromWX fail, exception = "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.tencent.mm.opensdk.utils.Log.e(r3, r0)
        L6c:
            android.content.Context r0 = r4.context
            boolean r5 = com.tencent.mm.opensdk.channel.MMessageActV2.send(r0, r5)
            return r5
        L73:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "sendResp fail, WXMsgImpl has been detached"
            r5.<init>(r0)
            throw r5
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public void setLogImpl(com.tencent.mm.opensdk.utils.ILog r1) {
            r0 = this;
            com.tencent.mm.opensdk.utils.Log.setLogImpl(r1)
            return
    }

    @Override // com.tencent.mm.opensdk.openapi.IWXAPI
    public void unregisterApp() {
            r4 = this;
            boolean r0 = r4.detached
            if (r0 != 0) goto L7f
            android.content.Context r0 = r4.context
            boolean r1 = r4.checkSignature
            java.lang.String r2 = "com.tencent.mm"
            boolean r0 = com.tencent.mm.opensdk.openapi.WXApiImplComm.validateAppSignatureForPackage(r0, r2, r1)
            java.lang.String r1 = "MicroMsg.SDK.WXApiImplV10"
            if (r0 != 0) goto L18
            java.lang.String r0 = "unregister app failed for wechat app signature check failed"
            com.tencent.mm.opensdk.utils.Log.e(r1, r0)
            return
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "unregisterApp, appId = "
            r0.append(r3)
            java.lang.String r3 = r4.appId
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.opensdk.utils.Log.d(r1, r0)
            java.lang.String r0 = r4.appId
            if (r0 == 0) goto L79
            int r0 = r0.length()
            if (r0 != 0) goto L39
            goto L79
        L39:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "unregister app "
            r0.append(r3)
            android.content.Context r3 = r4.context
            java.lang.String r3 = r3.getPackageName()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.mm.opensdk.utils.Log.d(r1, r0)
            com.tencent.mm.opensdk.channel.a.a$a r0 = new com.tencent.mm.opensdk.channel.a.a$a
            r0.<init>()
            r0.a = r2
            java.lang.String r1 = "com.tencent.mm.plugin.openapi.Intent.ACTION_HANDLE_APP_UNREGISTER"
            r0.b = r1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "weixin://unregisterapp?appid="
            r1.append(r2)
            java.lang.String r2 = r4.appId
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.c = r1
            android.content.Context r1 = r4.context
            com.tencent.mm.opensdk.channel.a.a.a(r1, r0)
            return
        L79:
            java.lang.String r0 = "unregisterApp fail, appId is empty"
            com.tencent.mm.opensdk.utils.Log.e(r1, r0)
            return
        L7f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "unregisterApp fail, WXMsgImpl has been detached"
            r0.<init>(r1)
            throw r0
    }
}

package com.tencent.connect.share;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QzoneShare extends com.tencent.connect.common.BaseApi {
    public static final java.lang.String SHARE_TO_QQ_APP_NAME = "appName";
    public static final java.lang.String SHARE_TO_QQ_AUDIO_URL = "audio_url";
    public static final java.lang.String SHARE_TO_QQ_EXT_INT = "cflag";
    public static final java.lang.String SHARE_TO_QQ_EXT_STR = "share_qq_ext_str";
    public static final java.lang.String SHARE_TO_QQ_IMAGE_LOCAL_URL = "imageLocalUrl";
    public static final java.lang.String SHARE_TO_QQ_IMAGE_URL = "imageUrl";
    public static final java.lang.String SHARE_TO_QQ_SITE = "site";
    public static final java.lang.String SHARE_TO_QQ_SUMMARY = "summary";
    public static final java.lang.String SHARE_TO_QQ_TARGET_URL = "targetUrl";
    public static final java.lang.String SHARE_TO_QQ_TITLE = "title";
    public static final java.lang.String SHARE_TO_QZONE_EXTMAP = "extMap";
    public static final java.lang.String SHARE_TO_QZONE_KEY_TYPE = "req_type";
    public static final int SHARE_TO_QZONE_TYPE_IMAGE = 5;
    public static final int SHARE_TO_QZONE_TYPE_IMAGE_TEXT = 1;
    public static final int SHARE_TO_QZONE_TYPE_MINI_PROGRAM = 7;
    public static final int SHARE_TO_QZONE_TYPE_NO_TYPE = 0;
    private boolean a;
    private boolean d;
    private boolean e;
    private boolean f;
    public java.lang.String mViaShareQzoneType;

    public QzoneShare(android.content.Context r1, com.tencent.connect.auth.QQToken r2) {
            r0 = this;
            r0.<init>(r2)
            java.lang.String r1 = ""
            r0.mViaShareQzoneType = r1
            r1 = 1
            r0.a = r1
            r1 = 0
            r0.d = r1
            r0.e = r1
            r0.f = r1
            return
    }

    private void b(android.app.Activity r24, android.os.Bundle r25, com.tencent.tauth.IUiListener r26) {
            r23 = this;
            r1 = r23
            r2 = r24
            r0 = r25
            r3 = r26
            java.lang.String r4 = "doshareToQzone() --start"
            java.lang.String r5 = "openSDK_LOG.QzoneShare"
            com.tencent.open.log.SLog.i(r5, r4)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            java.lang.String r6 = "mqqapi://share/to_qzone?src_type=app&version=1&file_type=news"
            r4.<init>(r6)
            java.lang.String r6 = "imageUrl"
            java.util.ArrayList r6 = r0.getStringArrayList(r6)
            java.lang.String r7 = "title"
            java.lang.String r7 = r0.getString(r7)
            java.lang.String r8 = "summary"
            java.lang.String r8 = r0.getString(r8)
            java.lang.String r9 = "targetUrl"
            java.lang.String r9 = r0.getString(r9)
            java.lang.String r10 = "audio_url"
            java.lang.String r10 = r0.getString(r10)
            java.lang.String r11 = "req_type"
            r12 = 1
            int r11 = r0.getInt(r11, r12)
            java.lang.String r12 = "appName"
            java.lang.String r12 = r0.getString(r12)
            java.lang.String r13 = "mini_program_appid"
            java.lang.String r13 = r0.getString(r13)
            java.lang.String r14 = "mini_program_path"
            java.lang.String r14 = r0.getString(r14)
            java.lang.String r15 = "mini_program_type"
            java.lang.String r15 = r0.getString(r15)
            r16 = r7
            java.lang.String r7 = "cflag"
            r17 = r8
            r8 = 0
            int r7 = r0.getInt(r7, r8)
            java.lang.String r8 = "share_qq_ext_str"
            java.lang.String r8 = r0.getString(r8)
            java.lang.String r18 = ""
            r19 = r7
            java.lang.String r7 = "extMap"
            android.os.Bundle r0 = r0.getBundle(r7)     // Catch: java.lang.Exception -> La3
            if (r0 == 0) goto Lb6
            java.util.Set r7 = r0.keySet()     // Catch: java.lang.Exception -> La3
            r25 = r7
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> La3
            r7.<init>()     // Catch: java.lang.Exception -> La3
            java.util.Iterator r20 = r25.iterator()     // Catch: java.lang.Exception -> La3
        L7f:
            boolean r21 = r20.hasNext()     // Catch: java.lang.Exception -> La3
            if (r21 == 0) goto La7
            java.lang.Object r21 = r20.next()     // Catch: java.lang.Exception -> La3
            r22 = r8
            r8 = r21
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Exception -> L9f
            r21 = r9
            java.lang.Object r9 = r0.get(r8)     // Catch: java.lang.Exception -> L9d
            r7.put(r8, r9)     // Catch: java.lang.Exception -> L9d
            r9 = r21
            r8 = r22
            goto L7f
        L9d:
            r0 = move-exception
            goto Lbb
        L9f:
            r0 = move-exception
        La0:
            r21 = r9
            goto Lbb
        La3:
            r0 = move-exception
            r22 = r8
            goto La0
        La7:
            r22 = r8
            r21 = r9
            int r0 = r25.size()     // Catch: java.lang.Exception -> L9d
            if (r0 <= 0) goto Lc0
            java.lang.String r18 = r7.toString()     // Catch: java.lang.Exception -> L9d
            goto Lc0
        Lb6:
            r22 = r8
            r21 = r9
            goto Lc0
        Lbb:
            java.lang.String r7 = "ShareToQzone()  --error parse extmap"
            com.tencent.open.log.SLog.e(r5, r7, r0)
        Lc0:
            com.tencent.connect.auth.QQToken r0 = r1.c
            java.lang.String r0 = r0.getAppId()
            com.tencent.connect.auth.QQToken r7 = r1.c
            java.lang.String r7 = r7.getOpenIdWithCache()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "openId:"
            r8.append(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.tencent.open.log.SLog.v(r5, r8)
            if (r6 == 0) goto L144
            int r9 = r6.size()
            if (r9 <= 0) goto L144
            r9 = 0
            java.lang.Object r6 = r6.get(r9)
            java.lang.String r6 = (java.lang.String) r6
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r8 = "&image_url="
            r9.append(r8)
            java.lang.String r8 = java.net.URLEncoder.encode(r6)
            byte[] r8 = com.tencent.open.utils.m.j(r8)
            r20 = r7
            r7 = 2
            java.lang.String r8 = android.util.Base64.encodeToString(r8, r7)
            r9.append(r8)
            java.lang.String r7 = r9.toString()
            r4.append(r7)
            boolean r7 = com.tencent.open.utils.m.h(r6)
            if (r7 != 0) goto L146
            java.lang.String r6 = com.tencent.open.utils.m.a(r0, r2, r6, r3)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L146
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "&image_uri="
            r7.append(r8)
            java.lang.String r6 = java.net.URLEncoder.encode(r6)
            byte[] r6 = com.tencent.open.utils.m.j(r6)
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r4.append(r6)
            goto L146
        L144:
            r20 = r7
        L146:
            boolean r6 = android.text.TextUtils.isEmpty(r16)
            if (r6 != 0) goto L169
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "&title="
            r6.append(r7)
            byte[] r7 = com.tencent.open.utils.m.j(r16)
            r8 = 2
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4.append(r6)
        L169:
            boolean r6 = android.text.TextUtils.isEmpty(r17)
            if (r6 != 0) goto L18c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "&description="
            r6.append(r7)
            byte[] r7 = com.tencent.open.utils.m.j(r17)
            r8 = 2
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            r4.append(r6)
        L18c:
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L1a6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "&share_id="
            r6.append(r7)
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r4.append(r0)
        L1a6:
            boolean r0 = android.text.TextUtils.isEmpty(r21)
            if (r0 != 0) goto L1c9
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&url="
            r0.append(r6)
            byte[] r6 = com.tencent.open.utils.m.j(r21)
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L1c9:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto L1ec
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&app_name="
            r0.append(r6)
            byte[] r6 = com.tencent.open.utils.m.j(r12)
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L1ec:
            boolean r0 = com.tencent.open.utils.m.e(r20)
            if (r0 != 0) goto L20f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&open_id="
            r0.append(r6)
            byte[] r6 = com.tencent.open.utils.m.j(r20)
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L20f:
            boolean r0 = com.tencent.open.utils.m.e(r10)
            if (r0 != 0) goto L232
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&audioUrl="
            r0.append(r6)
            byte[] r6 = com.tencent.open.utils.m.j(r10)
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L232:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&req_type="
            r0.append(r6)
            java.lang.String r6 = java.lang.String.valueOf(r11)
            byte[] r6 = com.tencent.open.utils.m.j(r6)
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r13)
            if (r0 != 0) goto L27a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&mini_program_appid="
            r0.append(r6)
            java.lang.String r6 = java.lang.String.valueOf(r13)
            byte[] r6 = com.tencent.open.utils.m.j(r6)
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L27a:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto L2a1
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&mini_program_path="
            r0.append(r6)
            java.lang.String r6 = java.lang.String.valueOf(r14)
            byte[] r6 = com.tencent.open.utils.m.j(r6)
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L2a1:
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 != 0) goto L2c8
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&mini_program_type="
            r0.append(r6)
            java.lang.String r6 = java.lang.String.valueOf(r15)
            byte[] r6 = com.tencent.open.utils.m.j(r6)
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L2c8:
            boolean r0 = com.tencent.open.utils.m.e(r22)
            if (r0 != 0) goto L2eb
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&share_qq_ext_str="
            r0.append(r6)
            byte[] r6 = com.tencent.open.utils.m.j(r22)
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L2eb:
            boolean r0 = android.text.TextUtils.isEmpty(r18)
            if (r0 != 0) goto L30e
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&share_qzone_ext_str="
            r0.append(r6)
            byte[] r6 = com.tencent.open.utils.m.j(r18)
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L30e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&cflag="
            r0.append(r6)
            java.lang.String r6 = java.lang.String.valueOf(r19)
            byte[] r6 = com.tencent.open.utils.m.j(r6)
            r8 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r8)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "doshareToQzone, url: "
            r0.append(r6)
            java.lang.String r6 = r4.toString()
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            com.tencent.open.log.SLog.v(r5, r0)
            android.content.Context r0 = com.tencent.open.utils.g.a()
            com.tencent.connect.auth.QQToken r6 = r1.c
            java.lang.String r7 = "shareToNativeQQ"
            java.lang.String[] r7 = new java.lang.String[]{r7}
            java.lang.String r8 = "requireApi"
            com.tencent.connect.a.a.a(r0, r6, r8, r7)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r6 = "android.intent.action.VIEW"
            r0.<init>(r6)
            java.lang.String r4 = r4.toString()
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r0.setData(r4)
            java.lang.String r4 = "pkg_name"
            java.lang.String r6 = r2.getPackageName()
            r0.putExtra(r4, r6)
            com.tencent.connect.auth.QQToken r4 = r1.c
            java.lang.String r6 = r4.getOpenId()
            com.tencent.connect.auth.QQToken r4 = r1.c
            java.lang.String r10 = r4.getAppId()
            java.lang.String r11 = r1.mViaShareQzoneType
            java.lang.String r15 = "1"
            java.lang.String r16 = "0"
            java.lang.String r7 = "11"
            java.lang.String r8 = "3"
            java.lang.String r9 = "ANDROIDQQ.SHARETOQZ.XX"
            java.lang.String r12 = ""
            java.lang.String r13 = ""
            java.lang.String r14 = "0"
            android.os.Bundle r4 = com.tencent.open.utils.m.a(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            java.lang.String r6 = com.tencent.connect.common.Constants.KEY_PASS_REPORT_VIA_PARAM
            r0.putExtra(r6, r4)
            java.lang.String r4 = "4.6.0"
            boolean r4 = com.tencent.open.utils.m.g(r2, r4)
            if (r4 == 0) goto L3b4
            com.tencent.connect.common.UIListenerManager r4 = com.tencent.connect.common.UIListenerManager.getInstance()
            r6 = 11104(0x2b60, float:1.556E-41)
            r4.setListenerWithRequestcode(r6, r3)
            r1.a(r2, r0, r6)
            java.lang.String r0 = "doShareToQzone() -- QQ Version is < 4.6.0"
            com.tencent.open.log.SLog.i(r5, r0)
            goto L3d0
        L3b4:
            java.lang.String r4 = "doShareToQzone() -- QQ Version is > 4.6.0"
            com.tencent.open.log.SLog.i(r5, r4)
            com.tencent.connect.common.UIListenerManager r4 = com.tencent.connect.common.UIListenerManager.getInstance()
            java.lang.String r6 = "shareToQzone"
            java.lang.Object r3 = r4.setListnerWithAction(r6, r3)
            if (r3 == 0) goto L3ca
            java.lang.String r3 = "doShareToQzone() -- do listener onCancel()"
            com.tencent.open.log.SLog.i(r5, r3)
        L3ca:
            r3 = 10104(0x2778, float:1.4159E-41)
            r9 = 0
            r1.a(r2, r3, r0, r9)
        L3d0:
            java.lang.String r0 = "openSDK_LOG"
            java.lang.String r2 = "doShareToQzone() --end"
            com.tencent.open.log.SLog.i(r0, r2)
            return
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
            r0 = this;
            return
    }

    public void shareToQzone(android.app.Activity r28, android.os.Bundle r29, com.tencent.tauth.IUiListener r30) {
            r27 = this;
            r0 = r27
            r2 = r28
            r1 = r29
            r3 = r30
            java.lang.String r4 = "shareToQzone() -- start"
            java.lang.String r7 = "openSDK_LOG.QzoneShare"
            com.tencent.open.log.SLog.i(r7, r4)
            boolean r4 = com.tencent.connect.a.a(r7, r3)
            if (r4 == 0) goto L16
            return
        L16:
            r4 = -6
            r5 = 4
            r6 = 0
            if (r1 != 0) goto L4e
            com.tencent.tauth.UiError r1 = new com.tencent.tauth.UiError
            java.lang.String r2 = "传入参数不可以为空"
            r1.<init>(r4, r2, r6)
            r3.onError(r1)
            java.lang.String r1 = "shareToQzone() params is null"
            com.tencent.open.log.SLog.e(r7, r1)
            com.tencent.open.b.e r8 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r1 = r0.c
            java.lang.String r12 = r1.getAppId()
            java.lang.String r13 = java.lang.String.valueOf(r5)
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r14 = java.lang.Long.valueOf(r1)
            r16 = 1
            java.lang.String r17 = "传入参数不可以为空"
            r9 = 1
            java.lang.String r10 = "SHARE_CHECK_SDK"
            java.lang.String r11 = "1000"
            r15 = 0
            r8.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return
        L4e:
            java.lang.String r8 = "title"
            java.lang.String r9 = r1.getString(r8)
            java.lang.String r10 = "summary"
            java.lang.String r11 = r1.getString(r10)
            java.lang.String r12 = "targetUrl"
            java.lang.String r12 = r1.getString(r12)
            java.lang.String r13 = "mini_program_appid"
            java.lang.String r13 = r1.getString(r13)
            java.lang.String r14 = "mini_program_path"
            java.lang.String r14 = r1.getString(r14)
            java.lang.String r15 = "imageUrl"
            r16 = 4
            java.util.ArrayList r5 = r1.getStringArrayList(r15)
            java.lang.String r4 = com.tencent.open.utils.m.a(r2)
            java.lang.String r6 = "appName"
            r19 = r9
            if (r4 != 0) goto L87
            java.lang.String r4 = r1.getString(r6)
            r21 = r12
        L84:
            r22 = r13
            goto La9
        L87:
            int r9 = r4.length()
            r21 = r12
            r12 = 20
            if (r9 <= r12) goto L84
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r22 = r13
            r13 = 0
            java.lang.String r4 = r4.substring(r13, r12)
            r9.append(r4)
            java.lang.String r4 = "..."
            r9.append(r4)
            java.lang.String r4 = r9.toString()
        La9:
            java.lang.String r9 = "req_type"
            int r9 = r1.getInt(r9)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "shareToQzone() get SHARE_TO_QZONE_KEY_TYPE: "
            r12.append(r13)
            r12.append(r9)
            java.lang.String r12 = r12.toString()
            com.tencent.open.log.SLog.e(r7, r12)
            java.lang.String r12 = "1"
            r13 = 5
            r23 = r14
            r14 = 1
            if (r9 == r14) goto Ld5
            if (r9 == r13) goto Ld0
            r0.mViaShareQzoneType = r12
            goto Ld7
        Ld0:
            java.lang.String r12 = "2"
            r0.mViaShareQzoneType = r12
            goto Ld7
        Ld5:
            r0.mViaShareQzoneType = r12
        Ld7:
            if (r9 == r14) goto L196
            if (r9 == r13) goto L15f
            r13 = 7
            if (r9 == r13) goto L136
            boolean r13 = com.tencent.open.utils.m.e(r19)
            if (r13 == 0) goto L110
            boolean r13 = com.tencent.open.utils.m.e(r11)
            if (r13 == 0) goto L110
            if (r5 == 0) goto Lf6
            int r13 = r5.size()
            if (r13 == 0) goto Lf6
            r13 = 0
            r0.a = r13
            goto L112
        Lf6:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r12 = "来自"
            r13.append(r12)
            r13.append(r4)
            java.lang.String r12 = "的分享"
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            r0.a = r14
        L10e:
            r13 = 0
            goto L115
        L110:
            r0.a = r14
        L112:
            r12 = r19
            goto L10e
        L115:
            r0.d = r13
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r14 = "-->shareToQzone, default needTitle = true, shareType = "
            r13.append(r14)
            r13.append(r9)
            java.lang.String r13 = r13.toString()
            com.tencent.open.log.SLog.e(r7, r13)
            r13 = 1
            r0.e = r13
            r13 = 0
            r0.f = r13
            r22 = r9
            r9 = r12
            goto L1a9
        L136:
            boolean r12 = android.text.TextUtils.isEmpty(r22)
            if (r12 != 0) goto L148
            boolean r12 = android.text.TextUtils.isEmpty(r23)
            if (r12 == 0) goto L143
            goto L148
        L143:
            r22 = r9
            r9 = -5
        L146:
            r13 = 0
            goto L158
        L148:
            com.tencent.tauth.UiError r12 = new com.tencent.tauth.UiError
            java.lang.String r13 = "传入参数有误!"
            java.lang.String r14 = "appid or path empty."
            r22 = r9
            r9 = -5
            r12.<init>(r9, r13, r14)
            r3.onError(r12)
            goto L146
        L158:
            r0.e = r13
            r0.f = r13
            r0.a = r13
            goto L1a7
        L15f:
            r9 = -5
            com.tencent.tauth.UiError r1 = new com.tencent.tauth.UiError
            java.lang.String r2 = "请选择支持的分享类型"
            r4 = 0
            r1.<init>(r9, r2, r4)
            r3.onError(r1)
            java.lang.String r1 = "shareToQzone() error--end请选择支持的分享类型"
            com.tencent.open.log.SLog.e(r7, r1)
            com.tencent.open.b.e r17 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r1 = r0.c
            java.lang.String r21 = r1.getAppId()
            java.lang.String r22 = java.lang.String.valueOf(r16)
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r23 = java.lang.Long.valueOf(r1)
            r25 = 1
            java.lang.String r26 = "shareToQzone() 请选择支持的分享类型"
            r18 = 1
            java.lang.String r19 = "SHARE_CHECK_SDK"
            java.lang.String r20 = "1000"
            r24 = 0
            r17.a(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L196:
            r22 = r9
            java.lang.String r9 = "-->shareToQzone, SHARE_TO_QZONE_TYPE_IMAGE_TEXT needTitle = true"
            com.tencent.open.log.SLog.e(r7, r9)
            r13 = 1
            r0.a = r13
            r9 = 0
            r0.d = r9
            r0.e = r13
            r0.f = r9
        L1a7:
            r9 = r19
        L1a9:
            boolean r12 = com.tencent.open.utils.m.a()
            java.lang.String r13 = "4.5.0"
            if (r12 != 0) goto L1ee
            boolean r12 = com.tencent.open.utils.m.g(r2, r13)
            if (r12 == 0) goto L1ee
            com.tencent.tauth.UiError r1 = new com.tencent.tauth.UiError
            java.lang.String r2 = "分享图片失败，检测不到SD卡!"
            r4 = -6
            r5 = 0
            r1.<init>(r4, r2, r5)
            r3.onError(r1)
            java.lang.String r1 = "shareToQzone() sdcard is null--end"
            com.tencent.open.log.SLog.e(r7, r1)
            com.tencent.open.b.e r17 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r1 = r0.c
            java.lang.String r21 = r1.getAppId()
            java.lang.String r22 = java.lang.String.valueOf(r16)
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r23 = java.lang.Long.valueOf(r1)
            r25 = 1
            java.lang.String r26 = "分享图片失败，检测不到SD卡!"
            r18 = 1
            java.lang.String r19 = "SHARE_CHECK_SDK"
            java.lang.String r20 = "1000"
            r24 = 0
            r17.a(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L1ee:
            boolean r12 = r0.a
            if (r12 == 0) goto L26c
            boolean r12 = android.text.TextUtils.isEmpty(r21)
            if (r12 == 0) goto L22f
            com.tencent.tauth.UiError r1 = new com.tencent.tauth.UiError
            java.lang.String r2 = "targetUrl为必填项，请补充后分享"
            r4 = 0
            r9 = -5
            r1.<init>(r9, r2, r4)
            r3.onError(r1)
            java.lang.String r1 = "shareToQzone() targetUrl null error--end"
            com.tencent.open.log.SLog.e(r7, r1)
            com.tencent.open.b.e r17 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r1 = r0.c
            java.lang.String r21 = r1.getAppId()
            java.lang.String r22 = java.lang.String.valueOf(r16)
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r23 = java.lang.Long.valueOf(r1)
            r25 = 1
            java.lang.String r26 = "targetUrl为必填项，请补充后分享"
            r18 = 1
            java.lang.String r19 = "SHARE_CHECK_SDK"
            java.lang.String r20 = "1000"
            r24 = 0
            r17.a(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L22f:
            boolean r12 = com.tencent.open.utils.m.h(r21)
            if (r12 != 0) goto L26c
            com.tencent.tauth.UiError r1 = new com.tencent.tauth.UiError
            java.lang.String r2 = "targetUrl有误"
            r4 = 0
            r9 = -5
            r1.<init>(r9, r2, r4)
            r3.onError(r1)
            java.lang.String r1 = "shareToQzone() targetUrl error--end"
            com.tencent.open.log.SLog.e(r7, r1)
            com.tencent.open.b.e r17 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r1 = r0.c
            java.lang.String r21 = r1.getAppId()
            java.lang.String r22 = java.lang.String.valueOf(r16)
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r23 = java.lang.Long.valueOf(r1)
            r25 = 1
            java.lang.String r26 = "targetUrl有误"
            r18 = 1
            java.lang.String r19 = "SHARE_CHECK_SDK"
            java.lang.String r20 = "1000"
            r24 = 0
            r17.a(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L26c:
            boolean r12 = r0.d
            java.lang.String r14 = ""
            if (r12 == 0) goto L27c
            r1.putString(r8, r14)
            r1.putString(r10, r14)
            r19 = r14
            goto L2f0
        L27c:
            boolean r12 = r0.e
            if (r12 == 0) goto L2bd
            boolean r12 = com.tencent.open.utils.m.e(r9)
            if (r12 == 0) goto L2bd
            com.tencent.tauth.UiError r1 = new com.tencent.tauth.UiError
            java.lang.String r2 = "title不能为空!"
            r4 = -6
            r5 = 0
            r1.<init>(r4, r2, r5)
            r3.onError(r1)
            java.lang.String r1 = "shareToQzone() title is null--end"
            com.tencent.open.log.SLog.e(r7, r1)
            com.tencent.open.b.e r17 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r1 = r0.c
            java.lang.String r21 = r1.getAppId()
            java.lang.String r22 = java.lang.String.valueOf(r16)
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r23 = java.lang.Long.valueOf(r1)
            r25 = 1
            java.lang.String r26 = "shareToQzone() title is null"
            r18 = 1
            java.lang.String r19 = "SHARE_CHECK_SDK"
            java.lang.String r20 = "1000"
            r24 = 0
            r17.a(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L2bd:
            boolean r12 = com.tencent.open.utils.m.e(r9)
            if (r12 != 0) goto L2d8
            int r12 = r9.length()
            r19 = r14
            r14 = 200(0xc8, float:2.8E-43)
            if (r12 <= r14) goto L2d6
            r12 = 0
            java.lang.String r9 = com.tencent.open.utils.m.a(r9, r14, r12, r12)
            r1.putString(r8, r9)
            goto L2db
        L2d6:
            r12 = 0
            goto L2db
        L2d8:
            r19 = r14
            goto L2d6
        L2db:
            boolean r8 = com.tencent.open.utils.m.e(r11)
            if (r8 != 0) goto L2f0
            int r8 = r11.length()
            r9 = 600(0x258, float:8.41E-43)
            if (r8 <= r9) goto L2f0
            java.lang.String r8 = com.tencent.open.utils.m.a(r11, r9, r12, r12)
            r1.putString(r10, r8)
        L2f0:
            boolean r8 = android.text.TextUtils.isEmpty(r4)
            if (r8 != 0) goto L2f9
            r1.putString(r6, r4)
        L2f9:
            if (r5 == 0) goto L366
            int r4 = r5.size()
            if (r4 != 0) goto L302
            goto L366
        L302:
            r4 = 0
        L303:
            int r6 = r5.size()
            if (r4 >= r6) goto L325
            java.lang.Object r6 = r5.get(r4)
            java.lang.String r6 = (java.lang.String) r6
            boolean r8 = com.tencent.open.utils.m.h(r6)
            if (r8 != 0) goto L320
            boolean r6 = com.tencent.open.utils.m.i(r6)
            if (r6 != 0) goto L320
            r5.remove(r4)
            int r4 = r4 + (-1)
        L320:
            r26 = 1
            int r4 = r4 + 1
            goto L303
        L325:
            int r4 = r5.size()
            if (r4 != 0) goto L362
            com.tencent.tauth.UiError r1 = new com.tencent.tauth.UiError
            java.lang.String r2 = "非法的图片地址!"
            r4 = -6
            r5 = 0
            r1.<init>(r4, r2, r5)
            r3.onError(r1)
            java.lang.String r1 = "shareToQzone() MSG_PARAM_IMAGE_URL_FORMAT_ERROR--end"
            com.tencent.open.log.SLog.e(r7, r1)
            com.tencent.open.b.e r17 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r1 = r0.c
            java.lang.String r21 = r1.getAppId()
            java.lang.String r22 = java.lang.String.valueOf(r16)
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r23 = java.lang.Long.valueOf(r1)
            r25 = 1
            java.lang.String r26 = "shareToQzone() 非法的图片地址!"
            r18 = 1
            java.lang.String r19 = "SHARE_CHECK_SDK"
            java.lang.String r20 = "1000"
            r24 = 0
            r17.a(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L362:
            r1.putStringArrayList(r15, r5)
            goto L3a1
        L366:
            boolean r4 = r0.f
            if (r4 == 0) goto L3a1
            com.tencent.tauth.UiError r1 = new com.tencent.tauth.UiError
            java.lang.String r2 = "纯图分享，imageUrl 不能为空"
            r4 = -6
            r5 = 0
            r1.<init>(r4, r2, r5)
            r3.onError(r1)
            java.lang.String r1 = "shareToQzone() imageUrl is null -- end"
            com.tencent.open.log.SLog.e(r7, r1)
            com.tencent.open.b.e r17 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r1 = r0.c
            java.lang.String r21 = r1.getAppId()
            java.lang.String r22 = java.lang.String.valueOf(r16)
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r23 = java.lang.Long.valueOf(r1)
            r25 = 1
            java.lang.String r26 = "shareToQzone() imageUrl is null"
            r18 = 1
            java.lang.String r19 = "SHARE_CHECK_SDK"
            java.lang.String r20 = "1000"
            r24 = 0
            r17.a(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L3a1:
            java.lang.String r4 = "4.6.0"
            boolean r6 = com.tencent.open.utils.m.g(r2, r4)
            if (r6 != 0) goto L3b3
            java.lang.String r4 = "shareToQzone() qqver greater than 4.6.0"
            com.tencent.open.log.SLog.i(r7, r4)
            r27.b(r28, r29, r30)
            goto L44b
        L3b3:
            java.lang.String r6 = "4.2.0"
            int r6 = com.tencent.open.utils.k.c(r2, r6)
            if (r6 < 0) goto L433
            int r4 = com.tencent.open.utils.k.c(r2, r4)
            if (r4 >= 0) goto L433
            java.lang.String r4 = "shareToQzone() qqver between 4.2.0 and 4.6.0, will use qqshare"
            com.tencent.open.log.SLog.w(r7, r4)
            com.tencent.connect.share.QQShare r4 = new com.tencent.connect.share.QQShare
            com.tencent.connect.auth.QQToken r6 = r0.c
            r4.<init>(r2, r6)
            if (r5 == 0) goto L423
            int r6 = r5.size()
            if (r6 <= 0) goto L423
            r9 = 0
            java.lang.Object r5 = r5.get(r9)
            java.lang.String r5 = (java.lang.String) r5
            r6 = r22
            r8 = 5
            if (r6 != r8) goto L41e
            boolean r6 = com.tencent.open.utils.m.i(r5)
            if (r6 != 0) goto L41e
            com.tencent.tauth.UiError r1 = new com.tencent.tauth.UiError
            java.lang.String r2 = "手Q版本过低，纯图分享不支持网路图片"
            r4 = -6
            r5 = 0
            r1.<init>(r4, r2, r5)
            r3.onError(r1)
            java.lang.String r1 = "shareToQzone()手Q版本过低，纯图分享不支持网路图片"
            com.tencent.open.log.SLog.e(r7, r1)
            com.tencent.open.b.e r17 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r1 = r0.c
            java.lang.String r21 = r1.getAppId()
            java.lang.String r22 = java.lang.String.valueOf(r16)
            long r1 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r23 = java.lang.Long.valueOf(r1)
            r25 = 1
            java.lang.String r26 = "shareToQzone()手Q版本过低，纯图分享不支持网路图片"
            r18 = 1
            java.lang.String r19 = "SHARE_CHECK_SDK"
            java.lang.String r20 = "1000"
            r24 = 0
            r17.a(r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        L41e:
            java.lang.String r6 = "imageLocalUrl"
            r1.putString(r6, r5)
        L423:
            boolean r5 = com.tencent.open.utils.m.g(r2, r13)
            if (r5 != 0) goto L42f
            java.lang.String r5 = "cflag"
            r13 = 1
            r1.putInt(r5, r13)
        L42f:
            r4.shareToQQ(r2, r1, r3)
            goto L44b
        L433:
            java.lang.String r1 = "shareToQzone() qqver below 4.2.0, will show download dialog"
            com.tencent.open.log.SLog.w(r7, r1)
            com.tencent.open.TDialog r1 = new com.tencent.open.TDialog
            r3 = r19
            java.lang.String r4 = r0.a(r3)
            r5 = 0
            com.tencent.connect.auth.QQToken r6 = r0.c
            java.lang.String r3 = ""
            r1.<init>(r2, r3, r4, r5, r6)
            r1.show()
        L44b:
            java.lang.String r1 = "shareToQzone() --end"
            com.tencent.open.log.SLog.i(r7, r1)
            return
    }
}

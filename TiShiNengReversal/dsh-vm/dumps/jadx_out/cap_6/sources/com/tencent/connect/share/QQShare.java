package com.tencent.connect.share;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QQShare extends com.tencent.connect.common.BaseApi {
    public static final int QQ_SHARE_SUMMARY_MAX_LENGTH = 512;
    public static final int QQ_SHARE_TITLE_MAX_LENGTH = 128;
    public static final java.lang.String SHARE_TO_QQ_APP_NAME = "appName";
    public static final java.lang.String SHARE_TO_QQ_ARK_INFO = "share_to_qq_ark_info";
    public static final java.lang.String SHARE_TO_QQ_AUDIO_URL = "audio_url";
    public static final java.lang.String SHARE_TO_QQ_EXT_INT = "cflag";
    public static final java.lang.String SHARE_TO_QQ_EXT_STR = "share_qq_ext_str";
    public static final int SHARE_TO_QQ_FLAG_QZONE_AUTO_OPEN = 1;
    public static final int SHARE_TO_QQ_FLAG_QZONE_ITEM_HIDE = 2;
    public static final java.lang.String SHARE_TO_QQ_GAME_MESSAGE_EXT = "game_message_ext";
    public static final java.lang.String SHARE_TO_QQ_GAME_TAG_NAME = "game_tag_name";
    public static final java.lang.String SHARE_TO_QQ_IMAGE_LOCAL_URL = "imageLocalUrl";
    public static final java.lang.String SHARE_TO_QQ_IMAGE_URL = "imageUrl";
    public static final java.lang.String SHARE_TO_QQ_KEY_TYPE = "req_type";
    public static final int SHARE_TO_QQ_MINI_PROGRAM = 7;
    public static final java.lang.String SHARE_TO_QQ_MINI_PROGRAM_APPID = "mini_program_appid";
    public static final java.lang.String SHARE_TO_QQ_MINI_PROGRAM_PATH = "mini_program_path";
    public static final java.lang.String SHARE_TO_QQ_MINI_PROGRAM_TYPE = "mini_program_type";
    public static final java.lang.String SHARE_TO_QQ_SITE = "site";
    public static final java.lang.String SHARE_TO_QQ_SUMMARY = "summary";
    public static final java.lang.String SHARE_TO_QQ_TARGET_URL = "targetUrl";
    public static final java.lang.String SHARE_TO_QQ_TITLE = "title";
    public static final int SHARE_TO_QQ_TYPE_AUDIO = 2;
    public static final int SHARE_TO_QQ_TYPE_DEFAULT = 1;
    public static final int SHARE_TO_QQ_TYPE_IMAGE = 5;
    public java.lang.String mViaShareQQType;



    public QQShare(android.content.Context r1, com.tencent.connect.auth.QQToken r2) {
            r0 = this;
            r0.<init>(r2)
            java.lang.String r1 = ""
            r0.mViaShareQQType = r1
            return
    }

    static /* synthetic */ com.tencent.connect.auth.QQToken a(com.tencent.connect.share.QQShare r0) {
            com.tencent.connect.auth.QQToken r0 = r0.c
            return r0
    }

    static /* synthetic */ void a(com.tencent.connect.share.QQShare r0, android.app.Activity r1, android.os.Bundle r2, com.tencent.tauth.IUiListener r3) {
            r0.d(r1, r2, r3)
            return
    }

    static /* synthetic */ com.tencent.connect.auth.QQToken b(com.tencent.connect.share.QQShare r0) {
            com.tencent.connect.auth.QQToken r0 = r0.c
            return r0
    }

    private void b(android.app.Activity r12, android.os.Bundle r13, com.tencent.tauth.IUiListener r14) {
            r11 = this;
            java.lang.String r0 = "shareToMobileQQ() -- start."
            java.lang.String r1 = "openSDK_LOG.QQShare"
            com.tencent.open.log.SLog.i(r1, r0)
            java.lang.String r0 = "imageUrl"
            java.lang.String r2 = r13.getString(r0)
            java.lang.String r3 = "title"
            java.lang.String r7 = r13.getString(r3)
            java.lang.String r3 = "summary"
            java.lang.String r8 = r13.getString(r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "shareToMobileQQ -- imageUrl: "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r3 = r3.toString()
            com.tencent.open.log.SLog.v(r1, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L9c
            boolean r3 = com.tencent.open.utils.m.h(r2)
            java.lang.String r4 = "4.3.0"
            if (r3 == 0) goto L58
            boolean r0 = com.tencent.open.utils.m.f(r12, r4)
            if (r0 != 0) goto L46
            r11.d(r12, r13, r14)
            goto Lb0
        L46:
            com.tencent.open.utils.c r0 = new com.tencent.open.utils.c
            r0.<init>(r12)
            com.tencent.connect.share.QQShare$1 r4 = new com.tencent.connect.share.QQShare$1
            r5 = r11
            r10 = r12
            r6 = r13
            r9 = r14
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r0.a(r2, r4)
            goto Lb0
        L58:
            r10 = r12
            r6 = r13
            r9 = r14
            r12 = 0
            r6.putString(r0, r12)
            boolean r12 = com.tencent.open.utils.m.f(r10, r4)
            if (r12 == 0) goto L6e
            java.lang.String r12 = "shareToMobileQQ -- QQ Version is < 4.3.0 "
            com.tencent.open.log.SLog.d(r1, r12)
            r11.d(r10, r6, r9)
            goto Lb0
        L6e:
            boolean r12 = com.tencent.open.utils.m.m(r2)
            boolean r13 = com.tencent.open.utils.m.c()
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r0 = "shareToMobileQQ -- QQ Version is > 4.3.0:isAppSpecificDir="
            r14.append(r0)
            r14.append(r12)
            java.lang.String r12 = ",hasSDPermission:"
            r14.append(r12)
            r14.append(r13)
            java.lang.String r12 = r14.toString()
            com.tencent.open.log.SLog.d(r1, r12)
            com.tencent.connect.share.QQShare$2 r4 = new com.tencent.connect.share.QQShare$2
            r5 = r11
            r4.<init>(r5, r6, r7, r8, r9, r10)
            com.tencent.connect.share.a.a(r10, r2, r4)
            goto Lb0
        L9c:
            r10 = r12
            r6 = r13
            r9 = r14
            java.lang.String r12 = "req_type"
            r13 = 1
            int r12 = r6.getInt(r12, r13)
            r13 = 5
            if (r12 != r13) goto Lad
            r11.c(r10, r6, r9)
            goto Lb0
        Lad:
            r11.d(r10, r6, r9)
        Lb0:
            java.lang.String r12 = "shareToMobileQQ() -- end"
            com.tencent.open.log.SLog.i(r1, r12)
            return
    }

    static /* synthetic */ com.tencent.connect.auth.QQToken c(com.tencent.connect.share.QQShare r0) {
            com.tencent.connect.auth.QQToken r0 = r0.c
            return r0
    }

    private void c(android.app.Activity r9, android.os.Bundle r10, com.tencent.tauth.IUiListener r11) {
            r8 = this;
            java.lang.String r0 = "imageLocalUrl"
            java.lang.String r0 = r10.getString(r0)
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            long r1 = r1.length()
            r3 = 5242880(0x500000, double:2.590327E-317)
            r5 = 0
            java.lang.String r6 = "openSDK_LOG.QQShare"
            int r7 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r7 < 0) goto L2d
            if (r11 == 0) goto L27
            com.tencent.tauth.UiError r9 = new com.tencent.tauth.UiError
            r10 = -16
            java.lang.String r0 = "图片太大，请压缩到5M内再分享!"
            r9.<init>(r10, r0, r5)
            r11.onError(r9)
        L27:
            java.lang.String r9 = "doShareImageToQQ -- error: 图片太大，请压缩到5M内再分享!"
            com.tencent.open.log.SLog.e(r6, r9)
            return
        L2d:
            java.lang.String r1 = "Images"
            java.io.File r1 = com.tencent.open.utils.g.a(r1)
            if (r1 == 0) goto L50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r1.getAbsolutePath()
            r2.append(r1)
            java.lang.String r1 = java.io.File.separator
            r2.append(r1)
            java.lang.String r1 = com.tencent.connect.common.Constants.QQ_SHARE_TEMP_DIR
            r2.append(r1)
            java.lang.String r5 = r2.toString()
            goto L55
        L50:
            java.lang.String r1 = "doShareImageToQQ() getExternalFilesDir return null"
            com.tencent.open.log.SLog.i(r6, r1)
        L55:
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r1 = r1.getName()
            boolean r2 = com.tencent.open.utils.m.m(r0)
            boolean r3 = com.tencent.open.utils.m.c()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r7 = "doShareImageToQQ() check file: isAppSpecificDir="
            r4.append(r7)
            r4.append(r2)
            java.lang.String r7 = ",hasSDPermission="
            r4.append(r7)
            r4.append(r3)
            java.lang.String r3 = ",fileDir="
            r4.append(r3)
            r4.append(r0)
            java.lang.String r3 = r4.toString()
            com.tencent.open.log.SLog.i(r6, r3)
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 2
            r3.<init>(r4)
            if (r2 == 0) goto L97
            goto Ld4
        L97:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto Ld4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r5)
            java.lang.String r4 = java.io.File.separator
            r2.append(r4)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            boolean r2 = com.tencent.open.utils.m.a(r9, r0, r1)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "doShareImageToQQ() sd permission not denied. copy to app specific:"
            r4.append(r5)
            r4.append(r1)
            java.lang.String r5 = ",isSuccess="
            r4.append(r5)
            r4.append(r2)
            java.lang.String r4 = r4.toString()
            com.tencent.open.log.SLog.i(r6, r4)
            if (r2 == 0) goto Ld4
            goto Ld5
        Ld4:
            r1 = r0
        Ld5:
            r3.add(r0)
            r3.add(r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "doShareImageToQQ() destFilePaths=["
            r0.<init>(r1)
            r1 = 0
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = ","
            r0.append(r1)
            r1 = 1
            java.lang.Object r1 = r3.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            java.lang.String r1 = "]"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.open.log.SLog.i(r6, r0)
            java.lang.String r0 = "imageLocalUrlArray"
            r10.putStringArrayList(r0, r3)
            r8.d(r9, r10, r11)
            return
    }

    private void d(android.app.Activity r28, android.os.Bundle r29, com.tencent.tauth.IUiListener r30) {
            r27 = this;
            r0 = r27
            r1 = r28
            r2 = r29
            r3 = r30
            java.lang.String r4 = "doShareToQQ() -- start"
            java.lang.String r5 = "openSDK_LOG.QQShare"
            com.tencent.open.log.SLog.i(r5, r4)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            java.lang.String r6 = "mqqapi://share/to_fri?src_type=app&version=1&file_type=news"
            r4.<init>(r6)
            java.lang.String r6 = "imageUrl"
            java.lang.String r6 = r2.getString(r6)
            java.lang.String r7 = "title"
            java.lang.String r7 = r2.getString(r7)
            java.lang.String r8 = "summary"
            java.lang.String r8 = r2.getString(r8)
            java.lang.String r9 = "targetUrl"
            java.lang.String r9 = r2.getString(r9)
            java.lang.String r10 = "audio_url"
            java.lang.String r10 = r2.getString(r10)
            java.lang.String r11 = "req_type"
            r12 = 1
            int r11 = r2.getInt(r11, r12)
            java.lang.String r13 = "share_to_qq_ark_info"
            java.lang.String r13 = r2.getString(r13)
            java.lang.String r14 = "mini_program_appid"
            java.lang.String r14 = r2.getString(r14)
            java.lang.String r15 = "mini_program_path"
            java.lang.String r15 = r2.getString(r15)
            java.lang.String r12 = "mini_program_type"
            java.lang.String r12 = r2.getString(r12)
            r16 = r6
            java.lang.String r6 = "cflag"
            r17 = r7
            r7 = 0
            int r6 = r2.getInt(r6, r7)
            java.lang.String r7 = "share_qq_ext_str"
            java.lang.String r7 = r2.getString(r7)
            java.lang.String r19 = com.tencent.open.utils.m.a(r1)
            r20 = r7
            if (r19 != 0) goto L72
            java.lang.String r7 = "appName"
            java.lang.String r19 = r2.getString(r7)
        L72:
            r7 = r19
            r19 = r8
            java.lang.String r8 = "imageLocalUrl"
            java.lang.String r8 = r2.getString(r8)
            r21 = r8
            java.lang.String r8 = "imageLocalUrlArray"
            java.util.ArrayList r2 = r2.getStringArrayList(r8)
            com.tencent.connect.auth.QQToken r8 = r0.c
            java.lang.String r8 = r8.getAppId()
            r22 = r9
            com.tencent.connect.auth.QQToken r9 = r0.c
            java.lang.String r9 = r9.getOpenIdWithCache()
            r23 = r10
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r24 = r12
            java.lang.String r12 = "doShareToQQ -- openid: "
            r10.append(r12)
            r10.append(r9)
            java.lang.String r12 = ",appName="
            r10.append(r12)
            r10.append(r7)
            java.lang.String r10 = r10.toString()
            com.tencent.open.log.SLog.i(r5, r10)
            java.lang.String r10 = "&file_data="
            r12 = 2
            r29 = r9
            if (r2 == 0) goto L11e
            int r9 = r2.size()
            if (r9 < r12) goto L11e
            r9 = 0
            java.lang.Object r21 = r2.get(r9)
            java.lang.String r21 = (java.lang.String) r21
            if (r21 == 0) goto Lc9
            goto Lcb
        Lc9:
            java.lang.String r21 = ""
        Lcb:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r10)
            byte[] r10 = com.tencent.open.utils.m.j(r21)
            java.lang.String r10 = android.util.Base64.encodeToString(r10, r12)
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            r4.append(r9)
            r9 = 1
            java.lang.Object r2 = r2.get(r9)
            java.lang.String r2 = (java.lang.String) r2
            r9 = 7
            if (r11 != r9) goto L103
            boolean r9 = android.text.TextUtils.isEmpty(r2)
            if (r9 != 0) goto L103
            java.lang.String r9 = "8.3.3"
            int r9 = com.tencent.open.utils.k.c(r1, r9)
            if (r9 >= 0) goto L103
            java.lang.String r2 = "doShareToQQ() share to mini program set file uri empty"
            com.tencent.open.log.SLog.e(r5, r2)
            r2 = 0
        L103:
            android.net.Uri r2 = com.tencent.open.utils.m.a(r1, r8, r2)
            if (r2 == 0) goto L13e
            java.lang.String r9 = "&file_uri="
            r4.append(r9)
            java.lang.String r2 = r2.toString()
            byte[] r2 = com.tencent.open.utils.m.j(r2)
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r12)
            r4.append(r2)
            goto L13e
        L11e:
            boolean r2 = android.text.TextUtils.isEmpty(r21)
            if (r2 != 0) goto L13e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r10)
            byte[] r9 = com.tencent.open.utils.m.j(r21)
            java.lang.String r9 = android.util.Base64.encodeToString(r9, r12)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L13e:
            boolean r2 = android.text.TextUtils.isEmpty(r16)
            if (r2 != 0) goto L160
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "&image_url="
            r2.append(r9)
            byte[] r9 = com.tencent.open.utils.m.j(r16)
            java.lang.String r9 = android.util.Base64.encodeToString(r9, r12)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L160:
            boolean r2 = android.text.TextUtils.isEmpty(r17)
            if (r2 != 0) goto L182
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "&title="
            r2.append(r9)
            byte[] r9 = com.tencent.open.utils.m.j(r17)
            java.lang.String r9 = android.util.Base64.encodeToString(r9, r12)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L182:
            boolean r2 = android.text.TextUtils.isEmpty(r19)
            if (r2 != 0) goto L1a4
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "&description="
            r2.append(r9)
            byte[] r9 = com.tencent.open.utils.m.j(r19)
            java.lang.String r9 = android.util.Base64.encodeToString(r9, r12)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L1a4:
            boolean r2 = android.text.TextUtils.isEmpty(r8)
            if (r2 != 0) goto L1be
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r9 = "&share_id="
            r2.append(r9)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L1be:
            boolean r2 = android.text.TextUtils.isEmpty(r22)
            if (r2 != 0) goto L1e0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "&url="
            r2.append(r8)
            byte[] r8 = com.tencent.open.utils.m.j(r22)
            java.lang.String r8 = android.util.Base64.encodeToString(r8, r12)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L1e0:
            boolean r2 = android.text.TextUtils.isEmpty(r7)
            if (r2 != 0) goto L220
            int r2 = r7.length()
            r8 = 20
            if (r2 <= r8) goto L204
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r9 = 0
            java.lang.String r7 = r7.substring(r9, r8)
            r2.append(r7)
            java.lang.String r7 = "..."
            r2.append(r7)
            java.lang.String r7 = r2.toString()
        L204:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r8 = "&app_name="
            r2.append(r8)
            byte[] r7 = com.tencent.open.utils.m.j(r7)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r12)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L220:
            boolean r2 = android.text.TextUtils.isEmpty(r29)
            if (r2 != 0) goto L242
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "&open_id="
            r2.append(r7)
            byte[] r7 = com.tencent.open.utils.m.j(r29)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r12)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L242:
            boolean r2 = android.text.TextUtils.isEmpty(r23)
            if (r2 != 0) goto L264
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "&audioUrl="
            r2.append(r7)
            byte[] r7 = com.tencent.open.utils.m.j(r23)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r12)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L264:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "&req_type="
            r2.append(r7)
            java.lang.String r7 = java.lang.String.valueOf(r11)
            byte[] r7 = com.tencent.open.utils.m.j(r7)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r12)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r14)
            if (r2 != 0) goto L2aa
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "&mini_program_appid="
            r2.append(r7)
            java.lang.String r7 = java.lang.String.valueOf(r14)
            byte[] r7 = com.tencent.open.utils.m.j(r7)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r12)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L2aa:
            boolean r2 = android.text.TextUtils.isEmpty(r15)
            if (r2 != 0) goto L2d0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "&mini_program_path="
            r2.append(r7)
            java.lang.String r7 = java.lang.String.valueOf(r15)
            byte[] r7 = com.tencent.open.utils.m.j(r7)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r12)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L2d0:
            boolean r2 = android.text.TextUtils.isEmpty(r24)
            if (r2 != 0) goto L2f6
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "&mini_program_type="
            r2.append(r7)
            java.lang.String r7 = java.lang.String.valueOf(r24)
            byte[] r7 = com.tencent.open.utils.m.j(r7)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r12)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L2f6:
            boolean r2 = android.text.TextUtils.isEmpty(r13)
            if (r2 != 0) goto L318
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "&share_to_qq_ark_info="
            r2.append(r7)
            byte[] r7 = com.tencent.open.utils.m.j(r13)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r12)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L318:
            boolean r2 = android.text.TextUtils.isEmpty(r20)
            if (r2 != 0) goto L33a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "&share_qq_ext_str="
            r2.append(r7)
            byte[] r7 = com.tencent.open.utils.m.j(r20)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r12)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
        L33a:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "&cflag="
            r2.append(r7)
            java.lang.String r7 = java.lang.String.valueOf(r6)
            byte[] r7 = com.tencent.open.utils.m.j(r7)
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r12)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r4.append(r2)
            boolean r2 = com.tencent.open.utils.m.c()
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "&third_sd="
            r7.append(r8)
            java.lang.String r2 = java.lang.String.valueOf(r2)
            byte[] r2 = com.tencent.open.utils.m.j(r2)
            java.lang.String r2 = android.util.Base64.encodeToString(r2, r12)
            r7.append(r2)
            java.lang.String r2 = r7.toString()
            r4.append(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r7 = "doShareToQQ -- url: "
            r2.append(r7)
            java.lang.String r7 = r4.toString()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            com.tencent.open.log.SLog.v(r5, r2)
            android.content.Context r2 = com.tencent.open.utils.g.a()
            com.tencent.connect.auth.QQToken r7 = r0.c
            java.lang.String r8 = "shareToNativeQQ"
            java.lang.String[] r8 = new java.lang.String[]{r8}
            java.lang.String r9 = "requireApi"
            com.tencent.connect.a.a.a(r2, r7, r9, r8)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r7 = "android.intent.action.VIEW"
            r2.<init>(r7)
            java.lang.String r4 = r4.toString()
            android.net.Uri r4 = android.net.Uri.parse(r4)
            r2.setData(r4)
            r9 = 1
            if (r6 != r9) goto L3c1
            java.lang.String r4 = "11"
        L3be:
            r17 = r4
            goto L3c4
        L3c1:
            java.lang.String r4 = "10"
            goto L3be
        L3c4:
            com.tencent.connect.auth.QQToken r4 = r0.c
            java.lang.String r16 = r4.getOpenId()
            com.tencent.connect.auth.QQToken r4 = r0.c
            java.lang.String r20 = r4.getAppId()
            java.lang.String r4 = r0.mViaShareQQType
            java.lang.String r25 = "1"
            java.lang.String r26 = "0"
            java.lang.String r18 = "3"
            java.lang.String r19 = "ANDROIDQQ.SHARETOQQ.XX"
            java.lang.String r22 = ""
            java.lang.String r23 = ""
            java.lang.String r24 = "0"
            r21 = r4
            android.os.Bundle r4 = com.tencent.open.utils.m.a(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            java.lang.String r6 = com.tencent.connect.common.Constants.KEY_PASS_REPORT_VIA_PARAM
            r2.putExtra(r6, r4)
            java.lang.String r4 = "pkg_name"
            java.lang.String r6 = r1.getPackageName()
            r2.putExtra(r4, r6)
            java.lang.String r4 = "4.6.0"
            boolean r4 = com.tencent.open.utils.m.f(r1, r4)
            if (r4 == 0) goto L40e
            java.lang.String r4 = "doShareToQQ, qqver below 4.6."
            com.tencent.open.log.SLog.i(r5, r4)
            com.tencent.connect.common.UIListenerManager r4 = com.tencent.connect.common.UIListenerManager.getInstance()
            r6 = 11103(0x2b5f, float:1.5559E-41)
            r4.setListenerWithRequestcode(r6, r3)
            r0.a(r1, r2, r6)
            goto L42a
        L40e:
            java.lang.String r4 = "doShareToQQ, qqver greater than 4.6."
            com.tencent.open.log.SLog.i(r5, r4)
            com.tencent.connect.common.UIListenerManager r4 = com.tencent.connect.common.UIListenerManager.getInstance()
            java.lang.String r6 = "shareToQQ"
            java.lang.Object r3 = r4.setListnerWithAction(r6, r3)
            if (r3 == 0) goto L424
            java.lang.String r3 = "doShareToQQ, last listener is not null, cancel it."
            com.tencent.open.log.SLog.i(r5, r3)
        L424:
            r3 = 10103(0x2777, float:1.4157E-41)
            r9 = 1
            r0.a(r1, r3, r2, r9)
        L42a:
            java.lang.String r1 = "doShareToQQ() --end"
            com.tencent.open.log.SLog.i(r5, r1)
            return
    }

    @Override // com.tencent.connect.common.BaseApi
    public void releaseResource() {
            r0 = this;
            return
    }

    public void shareToQQ(android.app.Activity r25, android.os.Bundle r26, com.tencent.tauth.IUiListener r27) {
            r24 = this;
            r1 = r24
            r3 = r25
            r0 = r26
            r8 = r27
            java.lang.String r2 = "shareToQQ() -- start."
            java.lang.String r9 = "openSDK_LOG.QQShare"
            com.tencent.open.log.SLog.i(r9, r2)
            boolean r2 = com.tencent.connect.a.a(r9, r8)
            if (r2 == 0) goto L16
            return
        L16:
            java.lang.String r2 = "imageUrl"
            java.lang.String r2 = r0.getString(r2)
            java.lang.String r4 = "title"
            java.lang.String r5 = r0.getString(r4)
            java.lang.String r6 = "summary"
            java.lang.String r7 = r0.getString(r6)
            java.lang.String r10 = "targetUrl"
            java.lang.String r10 = r0.getString(r10)
            java.lang.String r11 = "imageLocalUrl"
            java.lang.String r11 = r0.getString(r11)
            java.lang.String r12 = "mini_program_appid"
            java.lang.String r12 = r0.getString(r12)
            java.lang.String r13 = "mini_program_path"
            java.lang.String r13 = r0.getString(r13)
            java.lang.String r14 = "req_type"
            r15 = 1
            int r14 = r0.getInt(r14, r15)
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            r17 = r11
            java.lang.String r11 = "shareToQQ -- type: "
            r15.append(r11)
            r15.append(r14)
            java.lang.String r11 = r15.toString()
            com.tencent.open.log.SLog.i(r9, r11)
            r15 = 5
            r11 = 1
            if (r14 == r11) goto L79
            r11 = 2
            if (r14 == r11) goto L74
            if (r14 == r15) goto L6f
            r11 = 7
            if (r14 == r11) goto L6a
            goto L7d
        L6a:
            java.lang.String r11 = "9"
            r1.mViaShareQQType = r11
            goto L7d
        L6f:
            java.lang.String r11 = "2"
            r1.mViaShareQQType = r11
            goto L7d
        L74:
            java.lang.String r11 = "3"
            r1.mViaShareQQType = r11
            goto L7d
        L79:
            java.lang.String r11 = "1"
            r1.mViaShareQQType = r11
        L7d:
            boolean r11 = com.tencent.open.utils.m.a()
            r20 = 0
            r15 = 0
            if (r11 != 0) goto Lc3
            java.lang.String r11 = "4.5.0"
            boolean r11 = com.tencent.open.utils.m.f(r3, r11)
            if (r11 == 0) goto Lc3
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            java.lang.String r2 = "分享图片失败，检测不到SD卡!"
            r3 = -6
            r0.<init>(r3, r2, r15)
            r8.onError(r0)
            java.lang.String r0 = "shareToQQ sdcard is null--end"
            com.tencent.open.log.SLog.e(r9, r0)
            com.tencent.open.b.e r10 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r0 = r1.c
            java.lang.String r14 = r0.getAppId()
            java.lang.String r15 = java.lang.String.valueOf(r20)
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r16 = java.lang.Long.valueOf(r2)
            r18 = 1
            java.lang.String r19 = "shareToQQ sdcard is null"
            r11 = 1
            java.lang.String r12 = "SHARE_CHECK_SDK"
            java.lang.String r13 = "1000"
            r17 = 0
            r10.a(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        Lc3:
            java.lang.String r11 = "非法的图片地址!"
            java.lang.String r15 = "低版本手Q不支持该项功能!"
            r21 = r12
            r12 = 5
            if (r14 != r12) goto L142
            java.lang.String r12 = "4.3.0"
            boolean r12 = com.tencent.open.utils.m.f(r3, r12)
            if (r12 == 0) goto L108
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            r2 = 0
            r3 = -6
            r0.<init>(r3, r15, r2)
            r8.onError(r0)
            java.lang.String r0 = "shareToQQ, version below 4.3 is not support."
            com.tencent.open.log.SLog.e(r9, r0)
            com.tencent.open.b.e r10 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r0 = r1.c
            java.lang.String r14 = r0.getAppId()
            java.lang.String r15 = java.lang.String.valueOf(r20)
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r16 = java.lang.Long.valueOf(r2)
            r18 = 1
            java.lang.String r19 = "shareToQQ, version below 4.3 is not support."
            r11 = 1
            java.lang.String r12 = "SHARE_CHECK_SDK"
            java.lang.String r13 = "1000"
            r17 = 0
            r10.a(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L108:
            boolean r12 = com.tencent.open.utils.m.i(r17)
            if (r12 != 0) goto L142
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            r2 = 0
            r3 = -6
            r0.<init>(r3, r11, r2)
            r8.onError(r0)
            java.lang.String r0 = "shareToQQ -- error: 非法的图片地址!"
            com.tencent.open.log.SLog.e(r9, r0)
            com.tencent.open.b.e r10 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r0 = r1.c
            java.lang.String r14 = r0.getAppId()
            java.lang.String r15 = java.lang.String.valueOf(r20)
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r16 = java.lang.Long.valueOf(r2)
            r18 = 1
            java.lang.String r19 = "非法的图片地址!"
            r11 = 1
            java.lang.String r12 = "SHARE_CHECK_SDK"
            java.lang.String r13 = "1000"
            r17 = 0
            r10.a(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L142:
            java.lang.String r12 = "https://"
            r17 = r13
            java.lang.String r13 = "http://"
            r22 = r6
            java.lang.String r6 = "传入参数有误!"
            r23 = r7
            r7 = 5
            if (r14 == r7) goto L1a3
            r7 = 7
            if (r14 == r7) goto L1d9
            boolean r7 = android.text.TextUtils.isEmpty(r10)
            if (r7 != 0) goto L1a5
            boolean r7 = r10.startsWith(r13)
            if (r7 != 0) goto L167
            boolean r7 = r10.startsWith(r12)
            if (r7 != 0) goto L167
            goto L1a5
        L167:
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 == 0) goto L1a3
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            java.lang.String r2 = "title不能为空!"
            r3 = -6
            r4 = 0
            r0.<init>(r3, r2, r4)
            r8.onError(r0)
            java.lang.String r0 = "shareToQQ, title is empty."
            com.tencent.open.log.SLog.e(r9, r0)
            com.tencent.open.b.e r10 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r0 = r1.c
            java.lang.String r14 = r0.getAppId()
            java.lang.String r15 = java.lang.String.valueOf(r20)
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r16 = java.lang.Long.valueOf(r2)
            r18 = 1
            java.lang.String r19 = "shareToQQ, title is empty."
            r11 = 1
            java.lang.String r12 = "SHARE_CHECK_SDK"
            java.lang.String r13 = "1000"
            r17 = 0
            r10.a(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L1a3:
            r7 = 7
            goto L1d9
        L1a5:
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            r2 = 0
            r3 = -6
            r0.<init>(r3, r6, r2)
            r8.onError(r0)
            java.lang.String r0 = "shareToQQ, targetUrl is empty or illegal.."
            com.tencent.open.log.SLog.e(r9, r0)
            com.tencent.open.b.e r10 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r0 = r1.c
            java.lang.String r14 = r0.getAppId()
            java.lang.String r15 = java.lang.String.valueOf(r20)
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r16 = java.lang.Long.valueOf(r2)
            r18 = 1
            java.lang.String r19 = "shareToQQ, targetUrl is empty or illegal.."
            r11 = 1
            java.lang.String r12 = "SHARE_CHECK_SDK"
            java.lang.String r13 = "1000"
            r17 = 0
            r10.a(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L1d9:
            if (r14 != r7) goto L238
            boolean r7 = android.text.TextUtils.isEmpty(r21)
            r14 = -5
            if (r7 != 0) goto L22d
            boolean r7 = android.text.TextUtils.isEmpty(r17)
            if (r7 != 0) goto L22d
            boolean r7 = android.text.TextUtils.isEmpty(r10)
            if (r7 != 0) goto L22d
            com.tencent.connect.auth.QQToken r7 = r1.c
            java.lang.String r7 = r7.getAppId()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L1fb
            goto L22d
        L1fb:
            java.lang.String r7 = "8.0.8"
            int r7 = com.tencent.open.utils.k.c(r3, r7)
            if (r7 >= 0) goto L216
            java.lang.String r7 = "3.1"
            int r7 = com.tencent.open.utils.k.d(r3, r7)
            if (r7 >= 0) goto L216
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            java.lang.String r2 = "版本过低，不支持分享小程序"
            r0.<init>(r14, r15, r2)
            r8.onError(r0)
            return
        L216:
            boolean r7 = android.text.TextUtils.isEmpty(r5)
            if (r7 != 0) goto L222
            boolean r7 = android.text.TextUtils.isEmpty(r23)
            if (r7 == 0) goto L238
        L222:
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            java.lang.String r2 = "title || summary empty."
            r0.<init>(r14, r6, r2)
            r8.onError(r0)
            return
        L22d:
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            java.lang.String r2 = "appid || path || url empty."
            r0.<init>(r14, r6, r2)
            r8.onError(r0)
            return
        L238:
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L289
            boolean r6 = r2.startsWith(r13)
            if (r6 != 0) goto L289
            boolean r6 = r2.startsWith(r12)
            if (r6 != 0) goto L289
            java.io.File r6 = new java.io.File
            r6.<init>(r2)
            boolean r2 = r6.exists()
            if (r2 != 0) goto L289
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            r2 = 0
            r3 = -6
            r0.<init>(r3, r11, r2)
            r8.onError(r0)
            java.lang.String r0 = "shareToQQ, image url is emprty or illegal."
            com.tencent.open.log.SLog.e(r9, r0)
            com.tencent.open.b.e r10 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r0 = r1.c
            java.lang.String r14 = r0.getAppId()
            java.lang.String r15 = java.lang.String.valueOf(r20)
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r16 = java.lang.Long.valueOf(r2)
            r18 = 1
            java.lang.String r19 = "shareToQQ, image url is emprty or illegal."
            r11 = 1
            java.lang.String r12 = "SHARE_CHECK_SDK"
            java.lang.String r13 = "1000"
            r17 = 0
            r10.a(r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return
        L289:
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 != 0) goto L2a0
            int r2 = r5.length()
            r6 = 128(0x80, float:1.8E-43)
            if (r2 <= r6) goto L2a0
            r2 = 0
            java.lang.String r5 = com.tencent.open.utils.m.a(r5, r6, r2, r2)
            r0.putString(r4, r5)
            goto L2a1
        L2a0:
            r2 = 0
        L2a1:
            boolean r4 = android.text.TextUtils.isEmpty(r23)
            if (r4 != 0) goto L2ba
            int r4 = r23.length()
            r5 = 512(0x200, float:7.17E-43)
            if (r4 <= r5) goto L2ba
            r4 = r23
            java.lang.String r4 = com.tencent.open.utils.m.a(r4, r5, r2, r2)
            r2 = r22
            r0.putString(r2, r4)
        L2ba:
            java.lang.String r2 = "cflag"
            r4 = 0
            int r2 = r0.getInt(r2, r4)
            r11 = 1
            if (r2 != r11) goto L2c6
            r15 = 1
            goto L2c7
        L2c6:
            r15 = 0
        L2c7:
            boolean r2 = com.tencent.open.utils.m.a(r3, r15)
            if (r2 == 0) goto L2d6
            java.lang.String r2 = "shareToQQ, support share"
            com.tencent.open.log.SLog.i(r9, r2)
            r24.b(r25, r26, r27)
            goto L301
        L2d6:
            java.lang.String r0 = "shareToQQ, don't support share, will show download dialog"
            com.tencent.open.log.SLog.w(r9, r0)     // Catch: java.lang.RuntimeException -> L2ef
            com.tencent.open.TDialog r2 = new com.tencent.open.TDialog     // Catch: java.lang.RuntimeException -> L2ef
            java.lang.String r4 = ""
            java.lang.String r0 = ""
            java.lang.String r5 = r1.a(r0)     // Catch: java.lang.RuntimeException -> L2ef
            com.tencent.connect.auth.QQToken r7 = r1.c     // Catch: java.lang.RuntimeException -> L2ef
            r6 = 0
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.RuntimeException -> L2ef
            r2.show()     // Catch: java.lang.RuntimeException -> L2ef
            goto L301
        L2ef:
            r0 = move-exception
            java.lang.String r2 = " shareToQQ, TDialog.show not in main thread"
            com.tencent.open.log.SLog.e(r9, r2, r0)
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            java.lang.String r2 = "没有在主线程调用！"
            r3 = -6
            r4 = 0
            r0.<init>(r3, r2, r4)
            r8.onError(r0)
        L301:
            java.lang.String r0 = "shareToQQ() -- end."
            com.tencent.open.log.SLog.i(r9, r0)
            return
    }
}

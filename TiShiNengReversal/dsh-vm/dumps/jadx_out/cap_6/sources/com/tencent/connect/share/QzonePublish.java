package com.tencent.connect.share;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class QzonePublish extends com.tencent.connect.common.BaseApi {
    public static final java.lang.String HULIAN_CALL_BACK = "hulian_call_back";
    public static final java.lang.String HULIAN_EXTRA_SCENE = "hulian_extra_scene";
    public static final java.lang.String PUBLISH_TO_QZONE_APP_NAME = "appName";
    public static final java.lang.String PUBLISH_TO_QZONE_EXTMAP = "extMap";
    public static final java.lang.String PUBLISH_TO_QZONE_IMAGE_URL = "imageUrl";
    public static final java.lang.String PUBLISH_TO_QZONE_KEY_TYPE = "req_type";
    public static final java.lang.String PUBLISH_TO_QZONE_SUMMARY = "summary";
    public static final int PUBLISH_TO_QZONE_TYPE_PUBLISHMOOD = 3;
    public static final int PUBLISH_TO_QZONE_TYPE_PUBLISHVIDEO = 4;
    public static final java.lang.String PUBLISH_TO_QZONE_VIDEO_DURATION = "videoDuration";
    public static final java.lang.String PUBLISH_TO_QZONE_VIDEO_PATH = "videoPath";
    public static final java.lang.String PUBLISH_TO_QZONE_VIDEO_SIZE = "videoSize";



    public QzonePublish(android.content.Context r1, com.tencent.connect.auth.QQToken r2) {
            r0 = this;
            r0.<init>(r2)
            return
    }

    static /* synthetic */ void a(com.tencent.connect.share.QzonePublish r0, android.app.Activity r1, android.os.Bundle r2, com.tencent.tauth.IUiListener r3) {
            r0.b(r1, r2, r3)
            return
    }

    private void b(android.app.Activity r31, android.os.Bundle r32, com.tencent.tauth.IUiListener r33) {
            r30 = this;
            r1 = r30
            r2 = r31
            r0 = r32
            r3 = r33
            java.lang.String r4 = "doPublishToQzone() --start"
            java.lang.String r5 = "openSDK_LOG.QzonePublish"
            com.tencent.open.log.SLog.i(r5, r4)
            java.lang.StringBuffer r4 = new java.lang.StringBuffer
            java.lang.String r6 = "mqqapi://qzone/publish?src_type=app&version=1&file_type=news"
            r4.<init>(r6)
            java.lang.String r6 = "imageUrl"
            java.util.ArrayList r6 = r0.getStringArrayList(r6)
            java.lang.String r7 = "summary"
            java.lang.String r7 = r0.getString(r7)
            java.lang.String r8 = "req_type"
            r9 = 3
            int r8 = r0.getInt(r8, r9)
            java.lang.String r10 = "appName"
            java.lang.String r10 = r0.getString(r10)
            java.lang.String r11 = "videoPath"
            java.lang.String r11 = r0.getString(r11)
            java.lang.String r12 = "videoDuration"
            int r12 = r0.getInt(r12)
            java.lang.String r13 = "videoSize"
            long r13 = r0.getLong(r13)
            java.lang.String r15 = ""
            java.lang.String r9 = "extMap"
            android.os.Bundle r0 = r0.getBundle(r9)     // Catch: java.lang.Exception -> L98
            if (r0 == 0) goto L9c
            java.util.Set r9 = r0.keySet()     // Catch: java.lang.Exception -> L98
            r16 = r7
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Exception -> L87
            r7.<init>()     // Catch: java.lang.Exception -> L87
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Exception -> L87
        L5a:
            boolean r17 = r9.hasNext()     // Catch: java.lang.Exception -> L87
            if (r17 == 0) goto L8b
            java.lang.Object r17 = r9.next()     // Catch: java.lang.Exception -> L87
            r32 = r9
            r9 = r17
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L87
            java.lang.String r17 = r0.getString(r9)     // Catch: java.lang.Exception -> L87
            boolean r17 = android.text.TextUtils.isEmpty(r17)     // Catch: java.lang.Exception -> L87
            if (r17 != 0) goto L80
            r17 = r10
            java.lang.String r10 = r0.getString(r9)     // Catch: java.lang.Exception -> L7e
            r7.put(r9, r10)     // Catch: java.lang.Exception -> L7e
            goto L82
        L7e:
            r0 = move-exception
            goto La1
        L80:
            r17 = r10
        L82:
            r9 = r32
            r10 = r17
            goto L5a
        L87:
            r0 = move-exception
        L88:
            r17 = r10
            goto La1
        L8b:
            r17 = r10
            int r0 = r7.length()     // Catch: java.lang.Exception -> L7e
            if (r0 <= 0) goto La6
            java.lang.String r0 = r7.toString()     // Catch: java.lang.Exception -> L7e
            goto La7
        L98:
            r0 = move-exception
            r16 = r7
            goto L88
        L9c:
            r16 = r7
            r17 = r10
            goto La6
        La1:
            java.lang.String r7 = "publishToQzone()  --error parse extmap"
            com.tencent.open.log.SLog.e(r5, r7, r0)
        La6:
            r0 = r15
        La7:
            com.tencent.connect.auth.QQToken r7 = r1.c
            java.lang.String r7 = r7.getAppId()
            com.tencent.connect.auth.QQToken r9 = r1.c
            java.lang.String r9 = r9.getOpenId()
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r32 = r0
            java.lang.String r0 = "openId:"
            r10.append(r0)
            r10.append(r9)
            java.lang.String r0 = r10.toString()
            com.tencent.open.log.SLog.v(r5, r0)
            r10 = 3
            if (r10 != r8) goto L167
            if (r6 == 0) goto L167
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            r10.<init>()
            java.lang.StringBuffer r15 = new java.lang.StringBuffer
            r15.<init>()
            int r0 = r6.size()
            r18 = r9
            r9 = 0
        Ldf:
            if (r9 >= r0) goto L118
            java.lang.Object r19 = r6.get(r9)
            java.lang.String r19 = (java.lang.String) r19
            r20 = r0
            java.lang.String r0 = java.net.URLEncoder.encode(r19)
            r10.append(r0)
            java.lang.Object r0 = r6.get(r9)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r0 = com.tencent.open.utils.m.a(r7, r2, r0, r3)
            boolean r19 = android.text.TextUtils.isEmpty(r0)
            if (r19 != 0) goto L107
            java.lang.String r0 = java.net.URLEncoder.encode(r0)
            r15.append(r0)
        L107:
            int r0 = r20 + (-1)
            if (r9 == r0) goto L113
            java.lang.String r0 = ";"
            r10.append(r0)
            r15.append(r0)
        L113:
            int r9 = r9 + 1
            r0 = r20
            goto Ldf
        L118:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&image_url="
            r0.append(r6)
            java.lang.String r6 = r10.toString()
            byte[] r6 = com.tencent.open.utils.m.j(r6)
            r9 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r9)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = r15.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L164
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&image_uri="
            r0.append(r6)
            java.lang.String r6 = r15.toString()
            byte[] r6 = com.tencent.open.utils.m.j(r6)
            r9 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r9)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L164:
            java.lang.String r15 = "7"
            goto L169
        L167:
            r18 = r9
        L169:
            r0 = 4
            if (r0 != r8) goto L1f3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r6 = "&videoPath="
            r0.append(r6)
            byte[] r6 = com.tencent.open.utils.m.j(r11)
            r9 = 2
            java.lang.String r6 = android.util.Base64.encodeToString(r6, r9)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r0 = com.tencent.open.utils.m.a(r7, r2, r11, r3)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L1b0
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r6 = "&videoUri="
            r3.append(r6)
            byte[] r0 = com.tencent.open.utils.m.j(r0)
            r9 = 2
            java.lang.String r0 = android.util.Base64.encodeToString(r0, r9)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r4.append(r0)
        L1b0:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "&videoDuration="
            r0.append(r3)
            java.lang.String r3 = java.lang.String.valueOf(r12)
            byte[] r3 = com.tencent.open.utils.m.j(r3)
            r9 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r9)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "&videoSize="
            r0.append(r3)
            java.lang.String r3 = java.lang.String.valueOf(r13)
            byte[] r3 = com.tencent.open.utils.m.j(r3)
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r9)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.String r15 = "8"
        L1f3:
            r24 = r15
            boolean r0 = android.text.TextUtils.isEmpty(r16)
            if (r0 != 0) goto L218
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "&description="
            r0.append(r3)
            byte[] r3 = com.tencent.open.utils.m.j(r16)
            r9 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r9)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L218:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L232
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "&share_id="
            r0.append(r3)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L232:
            boolean r0 = android.text.TextUtils.isEmpty(r17)
            if (r0 != 0) goto L255
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "&app_name="
            r0.append(r3)
            byte[] r3 = com.tencent.open.utils.m.j(r17)
            r9 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r9)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L255:
            boolean r0 = com.tencent.open.utils.m.e(r18)
            if (r0 != 0) goto L278
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "&open_id="
            r0.append(r3)
            byte[] r3 = com.tencent.open.utils.m.j(r18)
            r9 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r9)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L278:
            boolean r0 = android.text.TextUtils.isEmpty(r32)
            if (r0 != 0) goto L29b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "&share_qzone_ext_str="
            r0.append(r3)
            byte[] r3 = com.tencent.open.utils.m.j(r32)
            r9 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r9)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
        L29b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "&req_type="
            r0.append(r3)
            java.lang.String r3 = java.lang.String.valueOf(r8)
            byte[] r3 = com.tencent.open.utils.m.j(r3)
            r9 = 2
            java.lang.String r3 = android.util.Base64.encodeToString(r3, r9)
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            r4.append(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "doPublishToQzone, url: "
            r0.append(r3)
            java.lang.String r3 = r4.toString()
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            com.tencent.open.log.SLog.v(r5, r0)
            android.content.Context r0 = com.tencent.open.utils.g.a()
            com.tencent.connect.auth.QQToken r3 = r1.c
            java.lang.String r5 = "shareToNativeQQ"
            java.lang.String[] r5 = new java.lang.String[]{r5}
            java.lang.String r6 = "requireApi"
            com.tencent.connect.a.a.a(r0, r3, r6, r5)
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r3 = "android.intent.action.VIEW"
            r0.<init>(r3)
            java.lang.String r3 = "com.tencent.mobileqq"
            r0.setPackage(r3)
            java.lang.String r3 = r4.toString()
            android.net.Uri r3 = android.net.Uri.parse(r3)
            r0.setData(r3)
            java.lang.String r3 = "pkg_name"
            java.lang.String r4 = r2.getPackageName()
            r0.putExtra(r3, r4)
            com.tencent.connect.auth.QQToken r3 = r1.c
            java.lang.String r19 = r3.getOpenId()
            com.tencent.connect.auth.QQToken r3 = r1.c
            java.lang.String r23 = r3.getAppId()
            java.lang.String r28 = "1"
            java.lang.String r29 = "0"
            java.lang.String r20 = "11"
            java.lang.String r21 = "3"
            java.lang.String r22 = "ANDROIDQQ.SHARETOQZ.XX"
            java.lang.String r25 = ""
            java.lang.String r26 = ""
            java.lang.String r27 = "0"
            android.os.Bundle r3 = com.tencent.open.utils.m.a(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)
            java.lang.String r4 = com.tencent.connect.common.Constants.KEY_PASS_REPORT_VIA_PARAM
            r0.putExtra(r4, r3)
            r3 = 10104(0x2778, float:1.4159E-41)
            r4 = 0
            r1.a(r2, r3, r0, r4)
            java.lang.String r0 = "openSDK_LOG"
            java.lang.String r2 = "doPublishToQzone() --end"
            com.tencent.open.log.SLog.i(r0, r2)
            return
    }

    public void publishToQzone(android.app.Activity r24, android.os.Bundle r25, com.tencent.tauth.IUiListener r26) {
            r23 = this;
            r1 = r23
            r3 = r25
            r5 = r26
            java.lang.String r0 = "publishToQzone() -- start"
            java.lang.String r6 = "openSDK_LOG.QzonePublish"
            com.tencent.open.log.SLog.i(r6, r0)
            boolean r0 = com.tencent.connect.a.a(r6, r5)
            if (r0 == 0) goto L15
            goto L159
        L15:
            r0 = 4
            r7 = 0
            if (r3 != 0) goto L4c
            com.tencent.tauth.UiError r2 = new com.tencent.tauth.UiError
            r3 = -6
            java.lang.String r4 = "传入参数不可以为空"
            r2.<init>(r3, r4, r7)
            r5.onError(r2)
            java.lang.String r2 = "-->publishToQzone, params is null"
            com.tencent.open.log.SLog.e(r6, r2)
            com.tencent.open.b.e r7 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r2 = r1.c
            java.lang.String r11 = r2.getAppId()
            java.lang.String r12 = java.lang.String.valueOf(r0)
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            r15 = 1
            java.lang.String r16 = "传入参数不可以为空"
            r8 = 1
            java.lang.String r9 = "SHARE_CHECK_SDK"
            java.lang.String r10 = "1000"
            r14 = 0
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
        L4c:
            boolean r2 = com.tencent.open.utils.m.f(r24)
            if (r2 != 0) goto L9e
            com.tencent.tauth.UiError r2 = new com.tencent.tauth.UiError
            r3 = -15
            java.lang.String r4 = "手Q版本过低，请下载安装最新版手Q"
            r2.<init>(r3, r4, r7)
            r5.onError(r2)
            java.lang.String r2 = "-->publishToQzone, this is not support below qq 5.9.5"
            com.tencent.open.log.SLog.e(r6, r2)
            com.tencent.open.b.e r7 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r2 = r1.c
            java.lang.String r11 = r2.getAppId()
            java.lang.String r12 = java.lang.String.valueOf(r0)
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            r15 = 1
            java.lang.String r16 = "publicToQzone, this is not support below qq 5.9.5"
            r8 = 1
            java.lang.String r9 = "SHARE_CHECK_SDK"
            java.lang.String r10 = "1000"
            r14 = 0
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            com.tencent.open.TDialog r17 = new com.tencent.open.TDialog
            java.lang.String r0 = ""
            java.lang.String r20 = r1.a(r0)
            r21 = 0
            com.tencent.connect.auth.QQToken r0 = r1.c
            java.lang.String r19 = ""
            r18 = r24
            r22 = r0
            r17.<init>(r18, r19, r20, r21, r22)
            r17.show()
            return
        L9e:
            java.lang.String r2 = com.tencent.open.utils.m.a(r24)
            r4 = 0
            java.lang.String r8 = "appName"
            if (r2 != 0) goto Lac
            java.lang.String r2 = r3.getString(r8)
            goto Lc9
        Lac:
            int r9 = r2.length()
            r10 = 20
            if (r9 <= r10) goto Lc9
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r2 = r2.substring(r4, r10)
            r9.append(r2)
            java.lang.String r2 = "..."
            r9.append(r2)
            java.lang.String r2 = r9.toString()
        Lc9:
            boolean r9 = android.text.TextUtils.isEmpty(r2)
            if (r9 != 0) goto Ld2
            r3.putString(r8, r2)
        Ld2:
            java.lang.String r2 = "req_type"
            int r2 = r3.getInt(r2)
            r8 = 3
            if (r2 != r8) goto L10f
            java.lang.String r0 = "imageUrl"
            java.util.ArrayList r2 = r3.getStringArrayList(r0)
            if (r2 == 0) goto L106
            int r7 = r2.size()
            if (r7 <= 0) goto L106
        Le9:
            int r7 = r2.size()
            if (r4 >= r7) goto L103
            java.lang.Object r7 = r2.get(r4)
            java.lang.String r7 = (java.lang.String) r7
            boolean r7 = com.tencent.open.utils.m.i(r7)
            if (r7 != 0) goto L100
            r2.remove(r4)
            int r4 = r4 + (-1)
        L100:
            int r4 = r4 + 1
            goto Le9
        L103:
            r3.putStringArrayList(r0, r2)
        L106:
            r23.b(r24, r25, r26)
            java.lang.String r0 = "publishToQzone() --end"
            com.tencent.open.log.SLog.i(r6, r0)
            return
        L10f:
            r8 = -5
            if (r2 != r0) goto L15a
            java.lang.String r0 = "videoPath"
            java.lang.String r2 = r3.getString(r0)
            boolean r0 = com.tencent.open.utils.m.i(r2)
            java.lang.String r9 = "请选择有效的视频文件"
            if (r0 != 0) goto L12e
            java.lang.String r0 = "publishToQzone() video url invalid"
            com.tencent.open.log.SLog.e(r6, r0)
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            r0.<init>(r8, r9, r7)
            r5.onError(r0)
            return
        L12e:
            android.media.MediaPlayer r10 = new android.media.MediaPlayer
            r10.<init>()
            com.tencent.connect.share.QzonePublish$1 r0 = new com.tencent.connect.share.QzonePublish$1
            r4 = r24
            r0.<init>(r1, r2, r3, r4, r5)
            r10.setOnPreparedListener(r0)
            com.tencent.connect.share.QzonePublish$2 r0 = new com.tencent.connect.share.QzonePublish$2
            r0.<init>(r1, r5)
            r10.setOnErrorListener(r0)
            r10.setDataSource(r2)     // Catch: java.lang.Exception -> L14c
            r10.prepareAsync()     // Catch: java.lang.Exception -> L14c
            goto L159
        L14c:
            java.lang.String r0 = "publishToQzone() exception(s) occurred when preparing mediaplayer"
            com.tencent.open.log.SLog.e(r6, r0)
            com.tencent.tauth.UiError r0 = new com.tencent.tauth.UiError
            r0.<init>(r8, r9, r7)
            r5.onError(r0)
        L159:
            return
        L15a:
            com.tencent.tauth.UiError r2 = new com.tencent.tauth.UiError
            java.lang.String r3 = "请选择支持的分享类型"
            r2.<init>(r8, r3, r7)
            r5.onError(r2)
            java.lang.String r2 = "publishToQzone() error--end请选择支持的分享类型"
            com.tencent.open.log.SLog.e(r6, r2)
            com.tencent.open.b.e r7 = com.tencent.open.b.e.a()
            com.tencent.connect.auth.QQToken r2 = r1.c
            java.lang.String r11 = r2.getAppId()
            java.lang.String r12 = java.lang.String.valueOf(r0)
            long r2 = android.os.SystemClock.elapsedRealtime()
            java.lang.Long r13 = java.lang.Long.valueOf(r2)
            r15 = 1
            java.lang.String r16 = "publishToQzone() 请选择支持的分享类型"
            r8 = 1
            java.lang.String r9 = "SHARE_CHECK_SDK"
            java.lang.String r10 = "1000"
            r14 = 0
            r7.a(r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return
    }
}

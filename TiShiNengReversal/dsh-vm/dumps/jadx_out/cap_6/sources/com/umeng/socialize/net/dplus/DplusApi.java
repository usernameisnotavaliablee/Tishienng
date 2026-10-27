package com.umeng.socialize.net.dplus;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DplusApi {
    private static final java.lang.String FULL = "false";
    private static final java.lang.String SIMPLE = "true";
    private static java.util.concurrent.ExecutorService mExecutor;











    static {
            java.util.concurrent.ExecutorService r0 = java.util.concurrent.Executors.newSingleThreadExecutor()
            com.umeng.socialize.net.dplus.DplusApi.mExecutor = r0
            return
    }

    public DplusApi() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ org.json.JSONObject access$000() throws org.json.JSONException {
            org.json.JSONObject r0 = constructDauContent()
            return r0
    }

    static /* synthetic */ org.json.JSONObject access$100(com.umeng.socialize.ShareContent r0, boolean r1, com.umeng.socialize.bean.SHARE_MEDIA r2, java.lang.String r3) throws org.json.JSONException {
            org.json.JSONObject r0 = constructShareContent(r0, r1, r2, r3)
            return r0
    }

    static /* synthetic */ org.json.JSONObject access$200(com.umeng.socialize.ShareContent r0, boolean r1, com.umeng.socialize.bean.SHARE_MEDIA r2, boolean r3, java.lang.String r4) throws org.json.JSONException {
            org.json.JSONObject r0 = constructStatsShareContent(r0, r1, r2, r3, r4)
            return r0
    }

    static /* synthetic */ org.json.JSONObject access$300(java.util.Map r0, boolean r1, com.umeng.socialize.bean.SHARE_MEDIA r2, java.lang.String r3) throws org.json.JSONException {
            org.json.JSONObject r0 = constructAuthContent(r0, r1, r2, r3)
            return r0
    }

    static /* synthetic */ org.json.JSONObject access$400(boolean r0, com.umeng.socialize.bean.SHARE_MEDIA r1, java.lang.String r2) throws org.json.JSONException {
            org.json.JSONObject r0 = constructStatsAuthStartContent(r0, r1, r2)
            return r0
    }

    static /* synthetic */ org.json.JSONObject access$500(com.umeng.socialize.bean.SHARE_MEDIA r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) throws org.json.JSONException {
            org.json.JSONObject r0 = constructStatsAuthEndContent(r0, r1, r2, r3)
            return r0
    }

    static /* synthetic */ org.json.JSONObject access$600(com.umeng.socialize.bean.SHARE_MEDIA r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) throws org.json.JSONException {
            org.json.JSONObject r0 = constructStatsShareEndContent(r0, r1, r2, r3)
            return r0
    }

    static /* synthetic */ org.json.JSONObject access$700(com.umeng.socialize.bean.SHARE_MEDIA r0, java.lang.String r1) throws org.json.JSONException {
            org.json.JSONObject r0 = constructStatsInfoStartContent(r0, r1)
            return r0
    }

    static /* synthetic */ org.json.JSONObject access$800(com.umeng.socialize.bean.SHARE_MEDIA r0, java.lang.String r1, java.lang.String r2, java.lang.String r3) throws org.json.JSONException {
            org.json.JSONObject r0 = constructStatsInfoEndContent(r0, r1, r2, r3)
            return r0
    }

    static /* synthetic */ org.json.JSONObject access$900(java.util.Map r0, com.umeng.socialize.bean.SHARE_MEDIA r1, java.lang.String r2) throws org.json.JSONException {
            org.json.JSONObject r0 = constructUserInfoContent(r0, r1, r2)
            return r0
    }

    private static org.json.JSONObject constructAuthContent(java.util.Map<java.lang.String, java.lang.String> r1, boolean r2, com.umeng.socialize.bean.SHARE_MEDIA r3, java.lang.String r4) throws org.json.JSONException {
            org.json.JSONObject r4 = constructBaseContent(r3, r4)
            if (r1 == 0) goto L6a
            java.lang.String r0 = "am"
            java.lang.String r2 = r3.getsharestyle(r2)
            r4.put(r0, r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "WEIXIN"
            boolean r2 = r2.equals(r3)
            java.lang.String r3 = "uid"
            if (r2 == 0) goto L27
            java.lang.String r2 = "openid"
            java.lang.Object r2 = r1.get(r2)
            r4.put(r3, r2)
            goto L2e
        L27:
            java.lang.Object r2 = r1.get(r3)
            r4.put(r3, r2)
        L2e:
            java.lang.String r2 = "unionid"
            java.lang.Object r3 = r1.get(r2)
            r4.put(r2, r3)
            java.lang.String r2 = "aid"
            java.lang.Object r3 = r1.get(r2)
            r4.put(r2, r3)
            java.lang.String r2 = "as"
            java.lang.Object r3 = r1.get(r2)
            r4.put(r2, r3)
            java.lang.String r2 = "access_token"
            java.lang.Object r3 = r1.get(r2)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r0 = "at"
            if (r3 == 0) goto L63
            java.lang.String r2 = "accessToken"
            java.lang.Object r1 = r1.get(r2)
            r4.put(r0, r1)
            return r4
        L63:
            java.lang.Object r1 = r1.get(r2)
            r4.put(r0, r1)
        L6a:
            return r4
    }

    private static org.json.JSONObject constructBaseContent(com.umeng.socialize.bean.SHARE_MEDIA r4, java.lang.String r5) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = r4.toString()
            java.lang.String r2 = "pf"
            java.lang.String r4 = r4.getName()
            r0.put(r2, r4)
            com.umeng.socialize.bean.SHARE_MEDIA r4 = com.umeng.socialize.bean.SHARE_MEDIA.QQ
            java.lang.String r4 = r4.toString()
            boolean r4 = r1.equals(r4)
            java.lang.String r2 = "true"
            java.lang.String r3 = "sdkt"
            if (r4 != 0) goto L2e
            com.umeng.socialize.bean.SHARE_MEDIA r4 = com.umeng.socialize.bean.SHARE_MEDIA.QZONE
            java.lang.String r4 = r4.toString()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L3a
        L2e:
            java.lang.Boolean r4 = com.umeng.socialize.Config.isUmengQQ
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L3a
            r0.put(r3, r2)
            goto L6f
        L3a:
            com.umeng.socialize.bean.SHARE_MEDIA r4 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN
            java.lang.String r4 = r4.toString()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L5e
            com.umeng.socialize.bean.SHARE_MEDIA r4 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_CIRCLE
            java.lang.String r4 = r4.toString()
            boolean r4 = r1.equals(r4)
            if (r4 != 0) goto L5e
            com.umeng.socialize.bean.SHARE_MEDIA r4 = com.umeng.socialize.bean.SHARE_MEDIA.WEIXIN_FAVORITE
            java.lang.String r4 = r4.toString()
            boolean r4 = r1.equals(r4)
            if (r4 == 0) goto L6a
        L5e:
            java.lang.Boolean r4 = com.umeng.socialize.Config.isUmengWx
            boolean r4 = r4.booleanValue()
            if (r4 == 0) goto L6a
            r0.put(r3, r2)
            goto L6f
        L6a:
            java.lang.String r4 = "false"
            r0.put(r3, r4)
        L6f:
            java.lang.String r4 = "ts"
            long r1 = java.lang.System.currentTimeMillis()
            r0.put(r4, r1)
            java.lang.String r4 = "tag"
            r0.put(r4, r5)
            return r0
    }

    private static org.json.JSONObject constructDauContent() throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "ts"
            long r2 = java.lang.System.currentTimeMillis()
            r0.put(r1, r2)
            java.lang.String r1 = "s_t"
            java.lang.String r2 = com.umeng.socialize.Config.shareType
            r0.put(r1, r2)
            return r0
    }

    private static org.json.JSONObject constructShareContent(com.umeng.socialize.ShareContent r9, boolean r10, com.umeng.socialize.bean.SHARE_MEDIA r11, java.lang.String r12) throws org.json.JSONException {
            org.json.JSONObject r12 = constructBaseContent(r11, r12)
            java.lang.String r0 = r9.mText
            java.lang.String r1 = "stype"
            int r2 = r9.getShareType()
            r12.put(r1, r2)
            java.lang.String r1 = "sm"
            java.lang.String r10 = r11.getsharestyle(r10)
            r12.put(r1, r10)
            boolean r10 = android.text.TextUtils.isEmpty(r0)
            if (r10 != 0) goto L2b
            int r10 = r0.length()
            r1 = 10240(0x2800, float:1.4349E-41)
            if (r10 <= r1) goto L2b
            r10 = 0
            java.lang.String r0 = r0.substring(r10, r1)
        L2b:
            int r10 = r9.getShareType()
            r1 = 2
            java.lang.String r2 = "pic"
            java.lang.String r3 = "picurl"
            java.lang.String r4 = "ct"
            if (r10 == r1) goto L25c
            int r10 = r9.getShareType()
            r1 = 3
            if (r10 != r1) goto L41
            goto L25c
        L41:
            int r10 = r9.getShareType()
            r1 = 1
            if (r10 != r1) goto L4c
            r12.put(r4, r0)
            return r12
        L4c:
            int r10 = r9.getShareType()
            r1 = 8
            java.lang.String r5 = "url"
            java.lang.String r6 = "title"
            if (r10 != r1) goto La9
            com.umeng.socialize.media.UMediaObject r9 = r9.mMedia
            com.umeng.socialize.media.UMVideo r9 = (com.umeng.socialize.media.UMVideo) r9
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            if (r10 == 0) goto L8b
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            boolean r10 = r10.isUrlMedia()
            if (r10 == 0) goto L78
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            java.lang.String r10 = r10.asUrlImage()
            r12.put(r3, r10)
            goto L8b
        L78:
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            byte[] r10 = r10.toByte()
            java.lang.String r10 = com.umeng.socialize.utils.SocializeUtils.md5(r10)
            java.lang.String r10 = com.umeng.socialize.utils.SocializeUtils.hexdigest(r10)
            r12.put(r2, r10)
        L8b:
            com.umeng.socialize.bean.SHARE_MEDIA r10 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            if (r11 != r10) goto L93
            r12.put(r4, r0)
            goto L9a
        L93:
            java.lang.String r10 = r9.getDescription()
            r12.put(r4, r10)
        L9a:
            java.lang.String r10 = r9.getTitle()
            r12.put(r6, r10)
            java.lang.String r9 = r9.toUrl()
            r12.put(r5, r9)
            return r12
        La9:
            int r10 = r9.getShareType()
            r1 = 4
            if (r10 != r1) goto L10a
            com.umeng.socialize.media.UMediaObject r9 = r9.mMedia
            com.umeng.socialize.media.UMusic r9 = (com.umeng.socialize.media.UMusic) r9
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            if (r10 == 0) goto Le3
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            boolean r10 = r10.isUrlMedia()
            if (r10 == 0) goto Ld0
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            java.lang.String r10 = r10.asUrlImage()
            r12.put(r3, r10)
            goto Le3
        Ld0:
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            byte[] r10 = r10.toByte()
            java.lang.String r10 = com.umeng.socialize.utils.SocializeUtils.md5(r10)
            java.lang.String r10 = com.umeng.socialize.utils.SocializeUtils.hexdigest(r10)
            r12.put(r2, r10)
        Le3:
            com.umeng.socialize.bean.SHARE_MEDIA r10 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            if (r11 != r10) goto Leb
            r12.put(r4, r0)
            goto Lf2
        Leb:
            java.lang.String r10 = r9.getDescription()
            r12.put(r4, r10)
        Lf2:
            java.lang.String r10 = r9.getTitle()
            r12.put(r6, r10)
            java.lang.String r10 = "durl"
            java.lang.String r11 = r9.toUrl()
            r12.put(r10, r11)
            java.lang.String r9 = r9.getmTargetUrl()
            r12.put(r5, r9)
            return r12
        L10a:
            int r10 = r9.getShareType()
            r1 = 32
            if (r10 != r1) goto L116
            r12.put(r4, r0)
            return r12
        L116:
            int r10 = r9.getShareType()
            r1 = 64
            if (r10 != r1) goto L141
            com.umeng.socialize.media.UMediaObject r9 = r9.mMedia
            com.umeng.socialize.media.UMEmoji r9 = (com.umeng.socialize.media.UMEmoji) r9
            if (r9 == 0) goto L13d
            boolean r10 = r9.isUrlMedia()
            if (r10 == 0) goto L132
            java.lang.String r9 = r9.asUrlImage()
            r12.put(r3, r9)
            goto L13d
        L132:
            byte[] r9 = r9.toByte()
            java.lang.String r9 = com.umeng.socialize.utils.SocializeUtils.md5(r9)
            r12.put(r2, r9)
        L13d:
            r12.put(r4, r0)
            return r12
        L141:
            int r10 = r9.getShareType()
            r1 = 128(0x80, float:1.8E-43)
            java.lang.String r7 = "m_u"
            java.lang.String r8 = "m_p"
            if (r10 != r1) goto L1a4
            com.umeng.socialize.media.UMediaObject r9 = r9.mMedia
            com.umeng.socialize.media.UMMin r9 = (com.umeng.socialize.media.UMMin) r9
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            if (r10 == 0) goto L180
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            boolean r10 = r10.isUrlMedia()
            if (r10 == 0) goto L16d
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            java.lang.String r10 = r10.asUrlImage()
            r12.put(r3, r10)
            goto L180
        L16d:
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            byte[] r10 = r10.toByte()
            java.lang.String r10 = com.umeng.socialize.utils.SocializeUtils.md5(r10)
            java.lang.String r10 = com.umeng.socialize.utils.SocializeUtils.hexdigest(r10)
            r12.put(r2, r10)
        L180:
            java.lang.String r10 = r9.getDescription()
            r12.put(r4, r10)
            java.lang.String r10 = r9.getTitle()
            r12.put(r6, r10)
            java.lang.String r10 = r9.toUrl()
            r12.put(r5, r10)
            java.lang.String r10 = r9.getPath()
            r12.put(r8, r10)
            java.lang.String r9 = r9.getUserName()
            r12.put(r7, r9)
            return r12
        L1a4:
            int r10 = r9.getShareType()
            r1 = 256(0x100, float:3.59E-43)
            if (r10 != r1) goto L203
            com.umeng.socialize.media.UMediaObject r9 = r9.mMedia
            com.umeng.socialize.media.UMQQMini r9 = (com.umeng.socialize.media.UMQQMini) r9
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            if (r10 == 0) goto L1df
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            boolean r10 = r10.isUrlMedia()
            if (r10 == 0) goto L1cc
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            java.lang.String r10 = r10.asUrlImage()
            r12.put(r3, r10)
            goto L1df
        L1cc:
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            byte[] r10 = r10.toByte()
            java.lang.String r10 = com.umeng.socialize.utils.SocializeUtils.md5(r10)
            java.lang.String r10 = com.umeng.socialize.utils.SocializeUtils.hexdigest(r10)
            r12.put(r2, r10)
        L1df:
            java.lang.String r10 = r9.getDescription()
            r12.put(r4, r10)
            java.lang.String r10 = r9.getTitle()
            r12.put(r6, r10)
            java.lang.String r10 = r9.toUrl()
            r12.put(r5, r10)
            java.lang.String r10 = r9.getPath()
            r12.put(r8, r10)
            java.lang.String r9 = r9.getMiniAppId()
            r12.put(r7, r9)
            return r12
        L203:
            int r10 = r9.getShareType()
            r1 = 16
            if (r10 != r1) goto L25b
            com.umeng.socialize.media.UMediaObject r9 = r9.mMedia
            com.umeng.socialize.media.UMWeb r9 = (com.umeng.socialize.media.UMWeb) r9
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            if (r10 == 0) goto L23e
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            boolean r10 = r10.isUrlMedia()
            if (r10 == 0) goto L22b
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            java.lang.String r10 = r10.asUrlImage()
            r12.put(r3, r10)
            goto L23e
        L22b:
            com.umeng.socialize.media.UMImage r10 = r9.getThumbImage()
            byte[] r10 = r10.toByte()
            java.lang.String r10 = com.umeng.socialize.utils.SocializeUtils.md5(r10)
            java.lang.String r10 = com.umeng.socialize.utils.SocializeUtils.hexdigest(r10)
            r12.put(r2, r10)
        L23e:
            com.umeng.socialize.bean.SHARE_MEDIA r10 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            if (r11 != r10) goto L246
            r12.put(r4, r0)
            goto L24d
        L246:
            java.lang.String r10 = r9.getDescription()
            r12.put(r4, r10)
        L24d:
            java.lang.String r10 = r9.getTitle()
            r12.put(r6, r10)
            java.lang.String r9 = r9.toUrl()
            r12.put(r5, r9)
        L25b:
            return r12
        L25c:
            com.umeng.socialize.media.UMediaObject r9 = r9.mMedia
            com.umeng.socialize.media.UMImage r9 = (com.umeng.socialize.media.UMImage) r9
            if (r9 == 0) goto L27f
            boolean r10 = r9.isUrlMedia()
            if (r10 == 0) goto L270
            java.lang.String r9 = r9.asUrlImage()
            r12.put(r3, r9)
            goto L27f
        L270:
            byte[] r9 = r9.toByte()
            java.lang.String r9 = com.umeng.socialize.utils.SocializeUtils.md5(r9)
            java.lang.String r9 = com.umeng.socialize.utils.SocializeUtils.hexdigest(r9)
            r12.put(r2, r9)
        L27f:
            r12.put(r4, r0)
            return r12
    }

    private static org.json.JSONObject constructStatsAuthEndContent(com.umeng.socialize.bean.SHARE_MEDIA r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) throws org.json.JSONException {
            org.json.JSONObject r1 = constructBaseContent(r1, r2)
            java.lang.String r2 = "name"
            java.lang.String r0 = "s_a_e"
            r1.put(r2, r0)
            java.lang.String r2 = "result"
            r1.put(r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L1b
            java.lang.String r2 = "e_m"
            r1.put(r2, r4)
        L1b:
            return r1
    }

    private static org.json.JSONObject constructStatsAuthStartContent(boolean r2, com.umeng.socialize.bean.SHARE_MEDIA r3, java.lang.String r4) throws org.json.JSONException {
            org.json.JSONObject r4 = constructBaseContent(r3, r4)
            java.lang.String r0 = "name"
            java.lang.String r1 = "s_a_s"
            r4.put(r0, r1)
            java.lang.String r0 = "am"
            java.lang.String r2 = r3.getsharestyle(r2)
            r4.put(r0, r2)
            return r4
    }

    private static org.json.JSONObject constructStatsDauContent(java.util.Map<java.lang.String, java.lang.String> r4, int r5) throws org.json.JSONException {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.lang.String r1 = "name"
            java.lang.String r2 = "s_dau"
            r0.put(r1, r2)
            java.lang.String r1 = "a_b"
            r0.put(r1, r5)
            if (r4 == 0) goto L47
            org.json.JSONObject r5 = new org.json.JSONObject
            r5.<init>()
            java.lang.String r1 = "position"
            java.lang.Object r2 = r4.get(r1)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L47
            java.lang.String r2 = "menubg"
            java.lang.Object r3 = r4.get(r2)
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L47
            java.lang.Object r3 = r4.get(r1)
            r5.put(r1, r3)
            java.lang.Object r4 = r4.get(r2)
            r5.put(r2, r4)
            java.lang.String r4 = "s_i"
            r0.put(r4, r5)
        L47:
            return r0
    }

    private static org.json.JSONObject constructStatsInfoEndContent(com.umeng.socialize.bean.SHARE_MEDIA r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) throws org.json.JSONException {
            org.json.JSONObject r1 = constructBaseContent(r1, r2)
            java.lang.String r2 = "name"
            java.lang.String r0 = "s_i_e"
            r1.put(r2, r0)
            java.lang.String r2 = "result"
            r1.put(r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L1b
            java.lang.String r2 = "e_m"
            r1.put(r2, r4)
        L1b:
            return r1
    }

    private static org.json.JSONObject constructStatsInfoStartContent(com.umeng.socialize.bean.SHARE_MEDIA r1, java.lang.String r2) throws org.json.JSONException {
            org.json.JSONObject r1 = constructBaseContent(r1, r2)
            java.lang.String r2 = "name"
            java.lang.String r0 = "s_i_s"
            r1.put(r2, r0)
            return r1
    }

    private static org.json.JSONObject constructStatsShareContent(com.umeng.socialize.ShareContent r2, boolean r3, com.umeng.socialize.bean.SHARE_MEDIA r4, boolean r5, java.lang.String r6) throws org.json.JSONException {
            org.json.JSONObject r6 = constructBaseContent(r4, r6)
            java.lang.String r0 = "name"
            java.lang.String r1 = "s_s_s"
            r6.put(r0, r1)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r5 = ""
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "u_c"
            r6.put(r0, r5)
            java.lang.String r5 = "sm"
            java.lang.String r3 = r4.getsharestyle(r3)
            r6.put(r5, r3)
            java.lang.String r3 = "stype"
            int r2 = r2.getShareType()
            r6.put(r3, r2)
            return r6
    }

    private static org.json.JSONObject constructStatsShareEndContent(com.umeng.socialize.bean.SHARE_MEDIA r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) throws org.json.JSONException {
            org.json.JSONObject r1 = constructBaseContent(r1, r2)
            java.lang.String r2 = "name"
            java.lang.String r0 = "s_s_e"
            r1.put(r2, r0)
            java.lang.String r2 = "result"
            r1.put(r2, r3)
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L1b
            java.lang.String r2 = "e_m"
            r1.put(r2, r4)
        L1b:
            return r1
    }

    private static org.json.JSONObject constructUserInfoContent(java.util.Map<java.lang.String, java.lang.String> r6, com.umeng.socialize.bean.SHARE_MEDIA r7, java.lang.String r8) throws org.json.JSONException {
            org.json.JSONObject r8 = constructBaseContent(r7, r8)
            if (r6 == 0) goto L10f
            java.lang.String r0 = "name"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r1 = "un"
            r8.put(r1, r0)
            java.lang.String r0 = "iconurl"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r1 = "up"
            r8.put(r1, r0)
            java.lang.String r0 = "gender"
            java.lang.Object r0 = r6.get(r0)
            java.lang.String r1 = "sex"
            r8.put(r1, r0)
            java.lang.String r0 = "location"
            java.lang.Object r1 = r6.get(r0)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r2 = "regn"
            if (r1 == 0) goto L41
            java.lang.String r0 = "city"
            java.lang.Object r0 = r6.get(r0)
            r8.put(r2, r0)
            goto L48
        L41:
            java.lang.Object r0 = r6.get(r0)
            r8.put(r2, r0)
        L48:
            java.lang.String r0 = r7.toString()
            java.lang.String r1 = "WEIXIN"
            boolean r0 = r0.equals(r1)
            java.lang.String r1 = "uid"
            if (r0 == 0) goto L60
            java.lang.String r0 = "openid"
            java.lang.Object r0 = r6.get(r0)
            r8.put(r1, r0)
            goto L67
        L60:
            java.lang.Object r0 = r6.get(r1)
            r8.put(r1, r0)
        L67:
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.BYTEDANCE
            java.lang.String r1 = "pn"
            java.lang.String r2 = ""
            java.lang.String r3 = "Kzg2"
            r4 = 0
            if (r0 != r7) goto Lb6
            java.lang.String r7 = "encrypt_mobile"
            java.lang.Object r7 = r6.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto Lfd
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r5 = com.umeng.socialize.PlatformConfig.configs     // Catch: java.lang.Throwable -> Lfd
            java.lang.Object r0 = r5.get(r0)     // Catch: java.lang.Throwable -> Lfd
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r0 = r0.getAppSecret()     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r7 = com.umeng.socialize.utils.UMAuthUtils.decrypt(r7, r0)     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lfd
            byte[] r3 = android.util.Base64.decode(r3, r4)     // Catch: java.lang.Throwable -> Lfd
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r7 = r7.replace(r0, r2)     // Catch: java.lang.Throwable -> Lfd
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r7 = com.umeng.socialize.utils.SocializeUtils.md5(r7)     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lfd
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> Lfd
            byte[] r7 = android.util.Base64.encode(r7, r4)     // Catch: java.lang.Throwable -> Lfd
            r0.<init>(r7)     // Catch: java.lang.Throwable -> Lfd
            r8.put(r1, r0)     // Catch: java.lang.Throwable -> Lfd
            goto Lfd
        Lb6:
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.HONOR
            if (r0 != r7) goto Lfd
            java.lang.String r7 = "mobileNumber"
            java.lang.Object r7 = r6.get(r7)
            java.lang.String r7 = (java.lang.String) r7
            boolean r5 = android.text.TextUtils.isEmpty(r7)
            if (r5 != 0) goto Lfd
            java.util.Map<com.umeng.socialize.bean.SHARE_MEDIA, com.umeng.socialize.PlatformConfig$Platform> r5 = com.umeng.socialize.PlatformConfig.configs     // Catch: java.lang.Throwable -> Lfd
            java.lang.Object r0 = r5.get(r0)     // Catch: java.lang.Throwable -> Lfd
            com.umeng.socialize.PlatformConfig$APPIDPlatform r0 = (com.umeng.socialize.PlatformConfig.APPIDPlatform) r0     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r0 = r0.getAppSecret()     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r7 = com.umeng.socialize.utils.UMAuthUtils.decrypt(r7, r0)     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lfd
            byte[] r3 = android.util.Base64.decode(r3, r4)     // Catch: java.lang.Throwable -> Lfd
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r7 = r7.replace(r0, r2)     // Catch: java.lang.Throwable -> Lfd
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r7 = com.umeng.socialize.utils.SocializeUtils.md5(r7)     // Catch: java.lang.Throwable -> Lfd
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> Lfd
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> Lfd
            byte[] r7 = android.util.Base64.encode(r7, r4)     // Catch: java.lang.Throwable -> Lfd
            r0.<init>(r7)     // Catch: java.lang.Throwable -> Lfd
            r8.put(r1, r0)     // Catch: java.lang.Throwable -> Lfd
        Lfd:
            java.lang.String r7 = "unionid"
            java.lang.Object r6 = r6.get(r7)
            r8.put(r7, r6)
            java.lang.String r6 = "ts"
            long r0 = java.lang.System.currentTimeMillis()
            r8.put(r6, r0)
        L10f:
            return r8
    }

    public static org.json.JSONObject getFakeData() throws org.json.JSONException {
            com.umeng.socialize.bean.SHARE_MEDIA r0 = com.umeng.socialize.bean.SHARE_MEDIA.SINA
            java.lang.String r1 = "test"
            org.json.JSONObject r0 = constructBaseContent(r0, r1)
            java.lang.String r1 = "name"
            java.lang.String r2 = "testetstttttttttttttttttttttttttttttttt"
            r0.put(r1, r2)
            java.lang.String r1 = "u_c"
            r2 = 1
            r0.put(r1, r2)
            java.lang.String r1 = "sm"
            java.lang.String r2 = "sso"
            r0.put(r1, r2)
            java.lang.String r1 = "stype"
            r2 = 0
            r0.put(r1, r2)
            return r0
    }

    public static void uploadAuth(android.content.Context r7, java.util.Map<java.lang.String, java.lang.String> r8, boolean r9, com.umeng.socialize.bean.SHARE_MEDIA r10, java.lang.String r11) {
            java.util.concurrent.ExecutorService r0 = com.umeng.socialize.net.dplus.DplusApi.mExecutor
            com.umeng.socialize.net.dplus.DplusApi$4 r1 = new com.umeng.socialize.net.dplus.DplusApi$4
            r6 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r1)
            return
    }

    public static void uploadAuthStart(android.content.Context r2, boolean r3, com.umeng.socialize.bean.SHARE_MEDIA r4, java.lang.String r5) {
            java.util.concurrent.ExecutorService r0 = com.umeng.socialize.net.dplus.DplusApi.mExecutor
            com.umeng.socialize.net.dplus.DplusApi$5 r1 = new com.umeng.socialize.net.dplus.DplusApi$5
            r1.<init>(r3, r4, r5, r2)
            r0.execute(r1)
            return
    }

    public static void uploadAuthend(android.content.Context r7, com.umeng.socialize.bean.SHARE_MEDIA r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            java.util.concurrent.ExecutorService r0 = com.umeng.socialize.net.dplus.DplusApi.mExecutor
            com.umeng.socialize.net.dplus.DplusApi$6 r1 = new com.umeng.socialize.net.dplus.DplusApi$6
            r6 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r1)
            return
    }

    public static void uploadDAU(android.content.Context r2) {
            java.util.concurrent.ExecutorService r0 = com.umeng.socialize.net.dplus.DplusApi.mExecutor
            com.umeng.socialize.net.dplus.DplusApi$1 r1 = new com.umeng.socialize.net.dplus.DplusApi$1
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    public static void uploadInfoStart(android.content.Context r2, com.umeng.socialize.bean.SHARE_MEDIA r3, java.lang.String r4) {
            java.util.concurrent.ExecutorService r0 = com.umeng.socialize.net.dplus.DplusApi.mExecutor
            com.umeng.socialize.net.dplus.DplusApi$8 r1 = new com.umeng.socialize.net.dplus.DplusApi$8
            r1.<init>(r3, r4, r2)
            r0.execute(r1)
            return
    }

    public static void uploadInfoend(android.content.Context r7, com.umeng.socialize.bean.SHARE_MEDIA r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            java.util.concurrent.ExecutorService r0 = com.umeng.socialize.net.dplus.DplusApi.mExecutor
            com.umeng.socialize.net.dplus.DplusApi$9 r1 = new com.umeng.socialize.net.dplus.DplusApi$9
            r6 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r1)
            return
    }

    public static void uploadShare(android.content.Context r9, com.umeng.socialize.ShareContent r10, boolean r11, com.umeng.socialize.bean.SHARE_MEDIA r12, java.lang.String r13, boolean r14) {
            java.util.concurrent.ExecutorService r0 = com.umeng.socialize.net.dplus.DplusApi.mExecutor
            com.umeng.socialize.net.dplus.DplusApi$2 r1 = new com.umeng.socialize.net.dplus.DplusApi$2
            r6 = r9
            r2 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r1)
            java.util.concurrent.ExecutorService r9 = com.umeng.socialize.net.dplus.DplusApi.mExecutor
            r7 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            com.umeng.socialize.net.dplus.DplusApi$3 r2 = new com.umeng.socialize.net.dplus.DplusApi$3
            r8 = r6
            r6 = r14
            r2.<init>(r3, r4, r5, r6, r7, r8)
            r9.execute(r2)
            return
    }

    public static void uploadStatsDAU(android.content.Context r0, java.util.Map<java.lang.String, java.lang.String> r1, int r2) {
            return
    }

    public static void uploadStatsShareEnd(android.content.Context r7, com.umeng.socialize.bean.SHARE_MEDIA r8, java.lang.String r9, java.lang.String r10, java.lang.String r11) {
            java.util.concurrent.ExecutorService r0 = com.umeng.socialize.net.dplus.DplusApi.mExecutor
            com.umeng.socialize.net.dplus.DplusApi$7 r1 = new com.umeng.socialize.net.dplus.DplusApi$7
            r6 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r1.<init>(r2, r3, r4, r5, r6)
            r0.execute(r1)
            return
    }

    public static void uploadUserInfo(android.content.Context r2, java.util.Map<java.lang.String, java.lang.String> r3, com.umeng.socialize.bean.SHARE_MEDIA r4, java.lang.String r5) {
            java.util.concurrent.ExecutorService r0 = com.umeng.socialize.net.dplus.DplusApi.mExecutor
            com.umeng.socialize.net.dplus.DplusApi$10 r1 = new com.umeng.socialize.net.dplus.DplusApi$10
            r1.<init>(r3, r4, r5, r2)
            r0.execute(r1)
            return
    }
}

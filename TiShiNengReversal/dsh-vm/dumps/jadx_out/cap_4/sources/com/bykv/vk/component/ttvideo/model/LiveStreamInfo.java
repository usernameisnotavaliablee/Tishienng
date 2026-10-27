package com.bykv.vk.component.ttvideo.model;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class LiveStreamInfo {
    public static final int LIVE_STREAM_INFO_CMAF_INVALID = 1;
    public static final int LIVE_STREAM_INFO_LLS_INVALID = 2;
    public static final java.lang.String MPD_VERSION = "1.0";
    private final java.lang.String TAG;
    private long mAdjustedOriginBitRate;
    private org.json.JSONObject mCommonInfo;
    private java.lang.String mDefaultResolution;
    private boolean mEnableOriginResolution;
    private int mFlag;
    private java.lang.String mHost;
    private java.lang.String mIp;
    private boolean mIsABRListMatch;
    private int mIsCodecSame;
    private java.lang.String mPortNum;
    private java.lang.String mRequestParams;
    private int mRtcFallback;
    private int mSRFrameRateUpperBound;
    public int mSRLongerSideUpperBound;
    public int mSRShorterSideUpperBound;
    public int mSharpenLongerSideLowerBound;
    public int mSharpenLongerSideUpperBound;
    public int mSharpenShorterSideLowerBound;
    public int mSharpenShorterSideUpperBound;
    private org.json.JSONObject mStreamInfo;
    private java.lang.String mTransportProtocol;

    public LiveStreamInfo(org.json.JSONObject r7) {
            r6 = this;
            java.lang.String r0 = "list"
            java.lang.String r1 = "default"
            java.lang.String r2 = "common"
            r6.<init>()
            r3 = 0
            r6.mEnableOriginResolution = r3
            r4 = -1
            r6.mAdjustedOriginBitRate = r4
            r4 = -1
            r6.mIsCodecSame = r4
            java.lang.String r4 = ""
            r6.mTransportProtocol = r4
            r6.mPortNum = r4
            r6.mRtcFallback = r3
            java.lang.String r4 = "LiveStreamInfo"
            r6.TAG = r4
            r6.mSRShorterSideUpperBound = r3
            r6.mSRLongerSideUpperBound = r3
            r6.mSRFrameRateUpperBound = r3
            r6.mIsABRListMatch = r3
            r6.mSharpenLongerSideUpperBound = r3
            r6.mSharpenLongerSideLowerBound = r3
            r6.mSharpenShorterSideUpperBound = r3
            r6.mSharpenShorterSideLowerBound = r3
            if (r7 != 0) goto L32
            return
        L32:
            java.lang.String r5 = "data"
            org.json.JSONObject r5 = r7.getJSONObject(r5)     // Catch: org.json.JSONException -> L47
            r6.mStreamInfo = r5     // Catch: org.json.JSONException -> L47
            boolean r5 = r7.has(r2)     // Catch: org.json.JSONException -> L47
            if (r5 == 0) goto L49
            org.json.JSONObject r7 = r7.getJSONObject(r2)     // Catch: org.json.JSONException -> L47
            r6.mCommonInfo = r7     // Catch: org.json.JSONException -> L47
            goto L49
        L47:
            r7 = move-exception
            goto La2
        L49:
            org.json.JSONObject r7 = r6.mCommonInfo     // Catch: org.json.JSONException -> L47
            if (r7 == 0) goto La5
            java.lang.String r2 = "auto"
            org.json.JSONObject r7 = r7.getJSONObject(r2)     // Catch: org.json.JSONException -> L47
            if (r7 == 0) goto L74
            boolean r2 = r7.has(r1)     // Catch: org.json.JSONException -> L47
            if (r2 == 0) goto L74
            java.lang.String r1 = r7.getString(r1)     // Catch: org.json.JSONException -> L47
            r6.mDefaultResolution = r1     // Catch: org.json.JSONException -> L47
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L47
            java.lang.String r2 = "mDefaultResolution: "
            r1.<init>(r2)     // Catch: org.json.JSONException -> L47
            java.lang.String r2 = r6.mDefaultResolution     // Catch: org.json.JSONException -> L47
            r1.append(r2)     // Catch: org.json.JSONException -> L47
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L47
            com.bykv.vk.component.ttvideo.log.MyLog.i(r4, r1)     // Catch: org.json.JSONException -> L47
        L74:
            r1 = 1
            r6.mIsABRListMatch = r1     // Catch: org.json.JSONException -> L47
            if (r7 == 0) goto La5
            boolean r1 = r7.has(r0)     // Catch: org.json.JSONException -> L47
            if (r1 == 0) goto La5
            org.json.JSONArray r7 = r7.optJSONArray(r0)     // Catch: org.json.JSONException -> L47
            if (r7 == 0) goto La5
            int r0 = r7.length()     // Catch: org.json.JSONException -> L47
            if (r0 <= 0) goto La5
            r0 = 0
        L8c:
            int r1 = r7.length()     // Catch: org.json.JSONException -> L47
            if (r0 >= r1) goto La5
            java.lang.String r1 = r7.getString(r0)     // Catch: org.json.JSONException -> L47
            boolean r1 = r6.isSupport(r1)     // Catch: org.json.JSONException -> L47
            if (r1 != 0) goto L9f
            r6.mIsABRListMatch = r3     // Catch: org.json.JSONException -> L47
            goto La5
        L9f:
            int r0 = r0 + 1
            goto L8c
        La2:
            com.bytedance.sdk.component.utils.vl.j(r7)
        La5:
            r6.mFlag = r3
            return
    }

    private boolean isNeedUseDefaultResolution(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L18
            java.lang.String r0 = "auto"
            boolean r2 = r2.equals(r0)
            if (r2 == 0) goto L18
            java.lang.String r2 = r1.mDefaultResolution
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L18
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    private java.lang.String set_url_port_scheme(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = ".com"
            int r0 = r6.indexOf(r0)
            java.lang.String r1 = ".com:"
            int r1 = r6.indexOf(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r6)
            java.lang.String r3 = r5.mPortNum
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            r4 = -1
            if (r3 != 0) goto L62
            if (r1 == r4) goto L41
            int r6 = r1 + 5
            int r1 = r1 + 6
        L20:
            int r0 = r2.length()
            if (r1 >= r0) goto L3b
            char r0 = r2.charAt(r1)
            int r0 = r0 + (-48)
            if (r0 < 0) goto L3b
            char r0 = r2.charAt(r1)
            int r0 = r0 + (-48)
            r3 = 9
            if (r0 > r3) goto L3b
            int r1 = r1 + 1
            goto L20
        L3b:
            java.lang.String r0 = r5.mPortNum
            r2.replace(r6, r1, r0)
            goto L62
        L41:
            if (r0 == r4) goto L62
            java.lang.String r1 = "vhost"
            int r6 = r6.indexOf(r1)
            if (r6 == r4) goto L4d
            if (r6 <= r0) goto L62
        L4d:
            int r0 = r0 + 4
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r1 = ":"
            r6.<init>(r1)
            java.lang.String r1 = r5.mPortNum
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            r2.insert(r0, r6)
        L62:
            java.lang.String r6 = r2.toString()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r6)
            java.lang.String r6 = "://"
            int r6 = r0.indexOf(r6)
            java.lang.String r1 = r5.mTransportProtocol
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto Lcc
            java.lang.String r1 = r5.mTransportProtocol
            java.lang.String r2 = "kcp"
            boolean r1 = r1.equals(r2)
            r2 = 0
            if (r1 == 0) goto L8c
            if (r6 == r4) goto Lcc
            java.lang.String r1 = "httpk"
            r0.replace(r2, r6, r1)
            goto Lcc
        L8c:
            java.lang.String r1 = r5.mTransportProtocol
            java.lang.String r3 = "quic"
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lc5
            java.lang.String r1 = r5.mTransportProtocol
            java.lang.String r3 = "quicu"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto La1
            goto Lc5
        La1:
            java.lang.String r1 = r5.mTransportProtocol
            java.lang.String r3 = "tls"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lb3
            if (r6 == r4) goto Lcc
            java.lang.String r1 = "https"
            r0.replace(r2, r6, r1)
            goto Lcc
        Lb3:
            java.lang.String r1 = r5.mTransportProtocol
            java.lang.String r3 = "tcp"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto Lcc
            if (r6 == r4) goto Lcc
            java.lang.String r1 = "http"
            r0.replace(r2, r6, r1)
            goto Lcc
        Lc5:
            if (r6 == r4) goto Lcc
            java.lang.String r1 = "httpq"
            r0.replace(r2, r6, r1)
        Lcc:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public boolean adjustOriginBitRate(java.lang.String r20, java.lang.String r21, long r22) {
            r19 = this;
            r0 = r19
            r1 = r21
            r2 = r22
            long r4 = r0.mAdjustedOriginBitRate
            r6 = 1
            r7 = 0
            int r9 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r9 <= 0) goto L10
            return r6
        L10:
            java.lang.String r4 = "ld"
            r9 = -1
            r5 = r4
        L15:
            boolean r11 = android.text.TextUtils.isEmpty(r5)
            r12 = 0
            if (r11 != 0) goto L92
            r11 = r20
            java.lang.String r13 = r0.getStreamUrlForResolution(r5, r11, r1)
            boolean r13 = android.text.TextUtils.isEmpty(r13)
            java.lang.String r14 = "origin"
            if (r13 != 0) goto L40
            long r15 = r0.getBitrate(r5, r1)
            boolean r13 = r5.equals(r14)
            if (r13 == 0) goto L3f
            int r13 = (r15 > r9 ? 1 : (r15 == r9 ? 0 : -1))
            if (r13 > 0) goto L3f
            int r9 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r9 <= 0) goto L3f
            r0.mAdjustedOriginBitRate = r2
            r15 = r2
        L3f:
            r9 = r15
        L40:
            r5.getClass()
            int r13 = r5.hashCode()
            java.lang.String r15 = "uhd"
            r16 = 1
            java.lang.String r6 = "sd"
            r17 = r7
            java.lang.String r7 = "hd"
            r8 = -1
            switch(r13) {
                case -1008619738: goto L7b;
                case 3324: goto L72;
                case 3448: goto L69;
                case 3665: goto L60;
                case 115761: goto L57;
                default: goto L55;
            }
        L55:
            r12 = -1
            goto L82
        L57:
            boolean r5 = r5.equals(r15)
            if (r5 != 0) goto L5e
            goto L55
        L5e:
            r12 = 4
            goto L82
        L60:
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L67
            goto L55
        L67:
            r12 = 3
            goto L82
        L69:
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L70
            goto L55
        L70:
            r12 = 2
            goto L82
        L72:
            boolean r5 = r5.equals(r7)
            if (r5 != 0) goto L79
            goto L55
        L79:
            r12 = 1
            goto L82
        L7b:
            boolean r5 = r5.equals(r14)
            if (r5 != 0) goto L82
            goto L55
        L82:
            r5 = 0
            switch(r12) {
                case 0: goto L86;
                case 1: goto L90;
                case 2: goto L8e;
                case 3: goto L8c;
                case 4: goto L8a;
                default: goto L86;
            }
        L86:
            r7 = r17
            r6 = 1
            goto L15
        L8a:
            r5 = r14
            goto L86
        L8c:
            r5 = r7
            goto L86
        L8e:
            r5 = r6
            goto L86
        L90:
            r5 = r15
            goto L86
        L92:
            r17 = r7
            r16 = 1
            long r1 = r0.mAdjustedOriginBitRate
            int r3 = (r1 > r17 ? 1 : (r1 == r17 ? 0 : -1))
            if (r3 <= 0) goto L9d
            return r16
        L9d:
            return r12
    }

    public org.json.JSONObject getAbrInfo() {
            r3 = this;
            org.json.JSONObject r0 = r3.mCommonInfo
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "auto"
            org.json.JSONObject r0 = r0.getJSONObject(r2)     // Catch: org.json.JSONException -> Ld
            return r0
        Ld:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            return r1
    }

    public java.lang.String getAvLinesParams(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = r1.isNeedUseDefaultResolution(r2)
            if (r0 == 0) goto L8
            java.lang.String r2 = r1.mDefaultResolution
        L8:
            r0 = 0
            java.lang.String r2 = r1.getSDKParams(r2, r3)     // Catch: org.json.JSONException -> L1b
            if (r2 == 0) goto L1d
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1b
            r3.<init>(r2)     // Catch: org.json.JSONException -> L1b
            java.lang.String r2 = "AvLines"
            java.lang.String r2 = r3.optString(r2)     // Catch: org.json.JSONException -> L1b
            return r2
        L1b:
            r2 = move-exception
            goto L1e
        L1d:
            return r0
        L1e:
            com.bytedance.sdk.component.utils.vl.j(r2)
            return r0
    }

    public long getBitrate(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r3.isNeedUseDefaultResolution(r4)
            if (r0 == 0) goto L8
            java.lang.String r4 = r3.mDefaultResolution
        L8:
            boolean r0 = r3.isSupport(r4)
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            org.json.JSONObject r0 = r3.mStreamInfo     // Catch: org.json.JSONException -> L2d
            org.json.JSONObject r4 = r0.getJSONObject(r4)     // Catch: org.json.JSONException -> L2d
            org.json.JSONObject r4 = r4.getJSONObject(r5)     // Catch: org.json.JSONException -> L2d
            java.lang.String r5 = "sdk_params"
            java.lang.String r4 = r4.optString(r5)     // Catch: org.json.JSONException -> L2d
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2d
            r5.<init>(r4)     // Catch: org.json.JSONException -> L2d
            java.lang.String r4 = "vbitrate"
            long r4 = r5.optLong(r4)     // Catch: org.json.JSONException -> L2d
            return r4
        L2d:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return r1
    }

    public int getCheckSilenceInterval(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.isNeedUseDefaultResolution(r3)
            if (r0 == 0) goto L8
            java.lang.String r3 = r2.mDefaultResolution
        L8:
            boolean r0 = r2.isSupport(r3)
            r1 = -1
            if (r0 != 0) goto L10
            return r1
        L10:
            java.lang.String r3 = r2.getSDKParams(r3, r4)     // Catch: org.json.JSONException -> L22
            if (r3 == 0) goto L24
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L22
            r4.<init>(r3)     // Catch: org.json.JSONException -> L22
            java.lang.String r3 = "CheckSilenceInterval"
            int r3 = r4.optInt(r3)     // Catch: org.json.JSONException -> L22
            return r3
        L22:
            r3 = move-exception
            goto L25
        L24:
            return r1
        L25:
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r1
    }

    public java.lang.String getDefaultResolution() {
            r1 = this;
            java.lang.String r0 = r1.mDefaultResolution
            return r0
    }

    public long getGopDuration(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            boolean r0 = r3.isNeedUseDefaultResolution(r4)
            if (r0 == 0) goto L8
            java.lang.String r4 = r3.mDefaultResolution
        L8:
            boolean r0 = r3.isSupport(r4)
            r1 = 0
            if (r0 != 0) goto L11
            return r1
        L11:
            org.json.JSONObject r0 = r3.mStreamInfo     // Catch: org.json.JSONException -> L2d
            org.json.JSONObject r4 = r0.getJSONObject(r4)     // Catch: org.json.JSONException -> L2d
            org.json.JSONObject r4 = r4.getJSONObject(r5)     // Catch: org.json.JSONException -> L2d
            java.lang.String r5 = "sdk_params"
            java.lang.String r4 = r4.optString(r5)     // Catch: org.json.JSONException -> L2d
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2d
            r5.<init>(r4)     // Catch: org.json.JSONException -> L2d
            java.lang.String r4 = "gop"
            long r4 = r5.optLong(r4)     // Catch: org.json.JSONException -> L2d
            return r4
        L2d:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return r1
    }

    public java.util.Map<java.lang.String, java.lang.String> getHTTPHeaders() {
            r6 = this;
            org.json.JSONObject r0 = r6.mCommonInfo
            r1 = 0
            if (r0 == 0) goto L37
            java.lang.String r2 = "header"
            boolean r0 = r0.has(r2)
            if (r0 != 0) goto Le
            goto L37
        Le:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            org.json.JSONObject r3 = r6.mCommonInfo     // Catch: org.json.JSONException -> L31
            org.json.JSONObject r2 = r3.getJSONObject(r2)     // Catch: org.json.JSONException -> L31
            java.util.Iterator r3 = r2.keys()     // Catch: org.json.JSONException -> L31
        L1d:
            boolean r4 = r3.hasNext()     // Catch: org.json.JSONException -> L31
            if (r4 == 0) goto L33
            java.lang.Object r4 = r3.next()     // Catch: org.json.JSONException -> L31
            java.lang.String r4 = (java.lang.String) r4     // Catch: org.json.JSONException -> L31
            java.lang.String r5 = r2.getString(r4)     // Catch: org.json.JSONException -> L31
            r0.put(r4, r5)     // Catch: org.json.JSONException -> L31
            goto L1d
        L31:
            r0 = move-exception
            goto L34
        L33:
            return r0
        L34:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L37:
            return r1
    }

    public java.lang.String getLabelfromBitrate(long r8, java.lang.String r10) {
            r7 = this;
            org.json.JSONObject r0 = r7.mStreamInfo
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.length()
            if (r0 > 0) goto Ld
            return r1
        Ld:
            org.json.JSONObject r0 = r7.mStreamInfo
            java.util.Iterator r0 = r0.keys()
        L13:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L31
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            boolean r3 = r7.isEnableAdaptive(r2)
            if (r3 == 0) goto L13
            long r3 = r7.getBitrate(r2, r10)
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 / r5
            int r5 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r5 != 0) goto L13
            return r2
        L31:
            return r1
    }

    public java.lang.String getMPDForFormat(java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27) {
            r23 = this;
            r1 = r23
            r0 = r24
            r2 = r25
            r3 = r26
            r4 = r27
            java.lang.String r5 = "?"
            org.json.JSONObject r6 = r1.mStreamInfo
            r7 = 0
            if (r6 != 0) goto L12
            return r7
        L12:
            int r6 = r6.length()
            if (r6 > 0) goto L19
            return r7
        L19:
            org.json.JSONObject r6 = new org.json.JSONObject
            r6.<init>()
            org.json.JSONObject r8 = r1.mStreamInfo
            java.util.Iterator r8 = r8.keys()
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: org.json.JSONException -> L15c
            r9.<init>()     // Catch: org.json.JSONException -> L15c
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> L15c
            r10.<init>()     // Catch: org.json.JSONException -> L15c
            r15 = r7
            r16 = r8
            r7 = 0
            r14 = 0
        L34:
            boolean r17 = r16.hasNext()     // Catch: org.json.JSONException -> L126
            if (r17 == 0) goto L133
            java.lang.Object r17 = r16.next()     // Catch: org.json.JSONException -> L126
            r18 = 0
            r12 = r17
            java.lang.String r12 = (java.lang.String) r12     // Catch: org.json.JSONException -> L126
            boolean r13 = r1.isEnableAdaptive(r12)     // Catch: org.json.JSONException -> L126
            if (r13 == 0) goto L11d
            java.lang.String r13 = r1.getStreamUrlForResolution(r12, r0, r2)     // Catch: org.json.JSONException -> L126
            if (r13 == 0) goto L11d
            r17 = r15
            org.json.JSONObject r15 = new org.json.JSONObject     // Catch: org.json.JSONException -> L83
            r15.<init>()     // Catch: org.json.JSONException -> L83
            java.lang.String r11 = "id"
            r15.put(r11, r14)     // Catch: org.json.JSONException -> L83
            java.lang.String r11 = "codec"
            r20 = r14
            java.lang.String r14 = r1.getVCodec(r12, r2)     // Catch: org.json.JSONException -> L83
            r15.put(r11, r14)     // Catch: org.json.JSONException -> L83
            java.lang.String r11 = "format"
            r15.put(r11, r0)     // Catch: org.json.JSONException -> L83
            java.lang.String r11 = "origin"
            boolean r11 = r12.equals(r11)     // Catch: org.json.JSONException -> L83
            java.lang.String r14 = "bitrate"
            if (r11 == 0) goto L86
            r11 = r6
            r21 = r7
            long r6 = r1.mAdjustedOriginBitRate     // Catch: org.json.JSONException -> L83
            int r8 = (r6 > r18 ? 1 : (r6 == r18 ? 0 : -1))
            if (r8 <= 0) goto L89
            r15.put(r14, r6)     // Catch: org.json.JSONException -> L83
            goto L90
        L83:
            r0 = move-exception
            goto L15f
        L86:
            r11 = r6
            r21 = r7
        L89:
            long r6 = r1.getBitrate(r12, r2)     // Catch: org.json.JSONException -> L83
            r15.put(r14, r6)     // Catch: org.json.JSONException -> L83
        L90:
            java.lang.String r6 = "qualityType"
            r15.put(r6, r12)     // Catch: org.json.JSONException -> L83
            java.lang.String r6 = "hidden"
            r7 = 0
            r15.put(r6, r7)     // Catch: org.json.JSONException -> L83
            java.lang.String r6 = "defaultSelect"
            java.lang.String r8 = r1.mDefaultResolution     // Catch: org.json.JSONException -> L83
            boolean r8 = r8.equals(r12)     // Catch: org.json.JSONException -> L83
            r15.put(r6, r8)     // Catch: org.json.JSONException -> L83
            java.lang.String r6 = r1.mRequestParams     // Catch: org.json.JSONException -> L83
            boolean r6 = r6.isEmpty()     // Catch: org.json.JSONException -> L83
            if (r6 != 0) goto Le8
            int r6 = r13.indexOf(r5)     // Catch: org.json.JSONException -> L83
            r8 = -1
            if (r6 != r8) goto Lca
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L83
            r6.<init>()     // Catch: org.json.JSONException -> L83
            r6.append(r13)     // Catch: org.json.JSONException -> L83
            r6.append(r5)     // Catch: org.json.JSONException -> L83
            java.lang.String r8 = r1.mRequestParams     // Catch: org.json.JSONException -> L83
            r6.append(r8)     // Catch: org.json.JSONException -> L83
            java.lang.String r13 = r6.toString()     // Catch: org.json.JSONException -> L83
            goto Le8
        Lca:
            int r8 = r13.length()     // Catch: org.json.JSONException -> L83
            int r8 = r8 + (-1)
            if (r6 == r8) goto Le8
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L83
            r6.<init>()     // Catch: org.json.JSONException -> L83
            r6.append(r13)     // Catch: org.json.JSONException -> L83
            java.lang.String r8 = "&"
            r6.append(r8)     // Catch: org.json.JSONException -> L83
            java.lang.String r8 = r1.mRequestParams     // Catch: org.json.JSONException -> L83
            r6.append(r8)     // Catch: org.json.JSONException -> L83
            java.lang.String r13 = r6.toString()     // Catch: org.json.JSONException -> L83
        Le8:
            java.lang.String r6 = "url"
            if (r3 == 0) goto L104
            if (r4 == 0) goto L104
            java.lang.String r8 = com.bykv.vk.component.ttvideo.network.DnsHelper.getUrlHost(r13)     // Catch: org.json.JSONException -> L83
            boolean r8 = r8.equals(r4)     // Catch: org.json.JSONException -> L83
            if (r8 == 0) goto L104
            java.lang.String r8 = r1.set_url_port_scheme(r13)     // Catch: org.json.JSONException -> L83
            java.lang.String r8 = com.bykv.vk.component.ttvideo.network.DnsHelper.hostToIPUrl(r8, r3)     // Catch: org.json.JSONException -> L83
            r15.put(r6, r8)     // Catch: org.json.JSONException -> L83
            goto L107
        L104:
            r15.put(r6, r13)     // Catch: org.json.JSONException -> L83
        L107:
            r9.add(r15)     // Catch: org.json.JSONException -> L83
            int r6 = (r21 > r18 ? 1 : (r21 == r18 ? 0 : -1))
            if (r6 != 0) goto L113
            long r12 = r1.getGopDuration(r12, r2)     // Catch: org.json.JSONException -> L83
            goto L115
        L113:
            r12 = r21
        L115:
            int r14 = r20 + 1
            r6 = r11
            r7 = r12
            r15 = r17
            goto L34
        L11d:
            r11 = r6
            r21 = r7
            r20 = r14
            r17 = r15
            r7 = 0
            goto L12a
        L126:
            r0 = move-exception
            r17 = r15
            goto L15f
        L12a:
            r6 = r11
            r15 = r17
            r14 = r20
            r7 = r21
            goto L34
        L133:
            r11 = r6
            r21 = r7
            r20 = r14
            r17 = r15
            if (r20 != 0) goto L13d
            return r17
        L13d:
            java.lang.String r0 = "gopDuration"
            r12 = r21
            r10.put(r0, r12)     // Catch: org.json.JSONException -> L83
            java.lang.String r0 = "representation"
            org.json.JSONArray r2 = new org.json.JSONArray     // Catch: org.json.JSONException -> L83
            r2.<init>(r9)     // Catch: org.json.JSONException -> L83
            r10.put(r0, r2)     // Catch: org.json.JSONException -> L83
            java.lang.String r0 = "version"
            java.lang.String r2 = "1.0"
            r11.put(r0, r2)     // Catch: org.json.JSONException -> L83
            java.lang.String r0 = "adaptationSet"
            r11.put(r0, r10)     // Catch: org.json.JSONException -> L83
            r6 = r11
            goto L164
        L15c:
            r0 = move-exception
            r17 = r7
        L15f:
            com.bytedance.sdk.component.utils.vl.j(r0)
            r6 = r17
        L164:
            if (r6 == 0) goto L171
            int r0 = r6.length()
            if (r0 <= 0) goto L171
            java.lang.String r0 = r6.toString()
            return r0
        L171:
            return r17
    }

    public java.lang.String getPortNum(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            org.json.JSONObject r0 = r2.mCommonInfo
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r0 = "rtmp"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L11
            java.lang.String r3 = "rtmp_ports"
            goto L13
        L11:
            java.lang.String r3 = "http_ports"
        L13:
            org.json.JSONObject r0 = r2.mCommonInfo     // Catch: org.json.JSONException -> L27
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch: org.json.JSONException -> L27
            java.lang.String r3 = r3.optString(r4)     // Catch: org.json.JSONException -> L27
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L27
            r4.<init>(r3)     // Catch: org.json.JSONException -> L27
            java.lang.String r3 = r4.optString(r5)     // Catch: org.json.JSONException -> L27
            goto L2c
        L27:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            r3 = r1
        L2c:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L33
            return r1
        L33:
            return r3
    }

    public java.lang.String getQueryItems() {
            r8 = this;
            java.lang.String r0 = "UTF-8"
            org.json.JSONObject r1 = r8.mCommonInfo
            r2 = 0
            if (r1 == 0) goto L54
            java.lang.String r3 = "query"
            boolean r1 = r1.has(r3)
            if (r1 != 0) goto L10
            goto L54
        L10:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            org.json.JSONObject r4 = r8.mCommonInfo     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
            org.json.JSONObject r3 = r4.getJSONObject(r3)     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
            java.util.Iterator r4 = r3.keys()     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
        L1f:
            boolean r5 = r4.hasNext()     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
            if (r5 == 0) goto L4c
            java.lang.Object r5 = r4.next()     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
            java.lang.String r6 = r3.getString(r5)     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
            java.lang.String r5 = java.net.URLEncoder.encode(r5, r0)     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
            java.lang.String r6 = java.net.URLEncoder.encode(r6, r0)     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
            java.lang.String r7 = "&"
            r1.append(r7)     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
            r1.append(r5)     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
            java.lang.String r5 = "="
            r1.append(r5)     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
            r1.append(r6)     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
            goto L1f
        L48:
            r0 = move-exception
            goto L51
        L4a:
            r0 = move-exception
            goto L51
        L4c:
            java.lang.String r0 = r1.toString()     // Catch: java.io.UnsupportedEncodingException -> L48 org.json.JSONException -> L4a
            return r0
        L51:
            com.bytedance.sdk.component.utils.vl.j(r0)
        L54:
            return r2
    }

    public java.lang.String getRuleIds() {
            r2 = this;
            org.json.JSONObject r0 = r2.mCommonInfo
            if (r0 == 0) goto L14
            java.lang.String r1 = "rule_ids"
            boolean r0 = r0.has(r1)
            if (r0 != 0) goto Ld
            goto L14
        Ld:
            org.json.JSONObject r0 = r2.mCommonInfo
            java.lang.String r0 = r0.optString(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    public java.lang.String getSDKParams(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.isNeedUseDefaultResolution(r3)
            if (r0 == 0) goto L8
            java.lang.String r3 = r2.mDefaultResolution
        L8:
            boolean r0 = r2.isSupport(r3)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            org.json.JSONObject r0 = r2.mStreamInfo     // Catch: org.json.JSONException -> L21
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch: org.json.JSONException -> L21
            org.json.JSONObject r3 = r3.getJSONObject(r4)     // Catch: org.json.JSONException -> L21
            java.lang.String r4 = "sdk_params"
            java.lang.String r3 = r3.optString(r4)     // Catch: org.json.JSONException -> L21
            return r3
        L21:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r1
    }

    public boolean getSREnabled(java.lang.String r9, java.lang.String r10, int r11) {
            r8 = this;
            boolean r0 = r8.isNeedUseDefaultResolution(r9)
            if (r0 == 0) goto L8
            java.lang.String r9 = r8.mDefaultResolution
        L8:
            boolean r0 = r8.isSupport(r9)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            org.json.JSONObject r0 = r8.mStreamInfo     // Catch: org.json.JSONException -> L40
            org.json.JSONObject r9 = r0.getJSONObject(r9)     // Catch: org.json.JSONException -> L40
            org.json.JSONObject r9 = r9.getJSONObject(r10)     // Catch: org.json.JSONException -> L40
            java.lang.String r10 = "sdk_params"
            java.lang.String r9 = r9.optString(r10)     // Catch: org.json.JSONException -> L40
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> L40
            r10.<init>(r9)     // Catch: org.json.JSONException -> L40
            java.lang.String r9 = "vbitrate"
            long r2 = r10.optLong(r9)     // Catch: org.json.JSONException -> L40
            java.lang.String r9 = "NNSR"
            java.lang.String r9 = r10.optString(r9)     // Catch: org.json.JSONException -> L40
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> L40
            r10.<init>(r9)     // Catch: org.json.JSONException -> L40
            r9 = 1
            if (r11 != r9) goto L42
            java.lang.String r11 = "Enabled"
            int r11 = r10.optInt(r11)     // Catch: org.json.JSONException -> L40
            goto L43
        L40:
            r9 = move-exception
            goto L77
        L42:
            r11 = 0
        L43:
            java.lang.String r0 = "VBitrateLowerBoundInKbps"
            long r4 = r10.optLong(r0)     // Catch: org.json.JSONException -> L40
            java.lang.String r0 = "ShorterSideUpperBound"
            int r0 = r10.optInt(r0)     // Catch: org.json.JSONException -> L40
            r8.mSRShorterSideUpperBound = r0     // Catch: org.json.JSONException -> L40
            java.lang.String r0 = "LongerSideUpperBound"
            int r0 = r10.optInt(r0)     // Catch: org.json.JSONException -> L40
            r8.mSRLongerSideUpperBound = r0     // Catch: org.json.JSONException -> L40
            java.lang.String r0 = "FrameRateUpperBound"
            int r10 = r10.optInt(r0)     // Catch: org.json.JSONException -> L40
            r8.mSRFrameRateUpperBound = r10     // Catch: org.json.JSONException -> L40
            if (r11 != r9) goto L76
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 < 0) goto L76
            int r11 = r8.mSRShorterSideUpperBound
            if (r11 <= 0) goto L76
            int r11 = r8.mSRLongerSideUpperBound
            if (r11 <= 0) goto L76
            if (r10 <= 0) goto L76
            return r9
        L76:
            return r1
        L77:
            com.bytedance.sdk.component.utils.vl.j(r9)
            return r1
    }

    public int getSRLongerSideUpperBound() {
            r1 = this;
            int r0 = r1.mSRLongerSideUpperBound
            return r0
    }

    public int getSRShorterSideUpperBound() {
            r1 = this;
            int r0 = r1.mSRShorterSideUpperBound
            return r0
    }

    public java.lang.String getSessionID() {
            r2 = this;
            org.json.JSONObject r0 = r2.mCommonInfo
            if (r0 == 0) goto L14
            java.lang.String r1 = "session_id"
            boolean r0 = r0.has(r1)
            if (r0 != 0) goto Ld
            goto L14
        Ld:
            org.json.JSONObject r0 = r2.mCommonInfo
            java.lang.String r0 = r0.optString(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    public org.json.JSONObject getSharpenParams(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.isNeedUseDefaultResolution(r3)
            if (r0 == 0) goto L8
            java.lang.String r3 = r2.mDefaultResolution
        L8:
            boolean r0 = r2.isSupport(r3)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            org.json.JSONObject r0 = r2.mStreamInfo     // Catch: org.json.JSONException -> L51
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch: org.json.JSONException -> L51
            org.json.JSONObject r3 = r3.getJSONObject(r4)     // Catch: org.json.JSONException -> L51
            java.lang.String r4 = "sdk_params"
            java.lang.String r3 = r3.optString(r4)     // Catch: org.json.JSONException -> L51
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L51
            r4.<init>(r3)     // Catch: org.json.JSONException -> L51
            java.lang.String r3 = "ASF"
            java.lang.String r3 = r4.optString(r3)     // Catch: org.json.JSONException -> L51
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L51
            r4.<init>(r3)     // Catch: org.json.JSONException -> L51
            java.lang.String r3 = "LongerSideUpperBound"
            int r3 = r4.optInt(r3)     // Catch: org.json.JSONException -> L51
            r2.mSharpenLongerSideUpperBound = r3     // Catch: org.json.JSONException -> L51
            java.lang.String r3 = "LongerSideLowerBound"
            int r3 = r4.optInt(r3)     // Catch: org.json.JSONException -> L51
            r2.mSharpenLongerSideLowerBound = r3     // Catch: org.json.JSONException -> L51
            java.lang.String r3 = "ShorterSideUpperBound"
            int r3 = r4.optInt(r3)     // Catch: org.json.JSONException -> L51
            r2.mSharpenShorterSideUpperBound = r3     // Catch: org.json.JSONException -> L51
            java.lang.String r3 = "ShorterSideLowerBound"
            int r3 = r4.optInt(r3)     // Catch: org.json.JSONException -> L51
            r2.mSharpenShorterSideLowerBound = r3     // Catch: org.json.JSONException -> L51
            return r4
        L51:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r1
    }

    public java.lang.String getStreamUrlForResolution(java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r6 = this;
            java.lang.String r0 = "SuggestFormat"
            boolean r1 = android.text.TextUtils.isEmpty(r7)
            r2 = 0
            if (r1 != 0) goto L23
            java.lang.String r1 = "auto"
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L23
            java.lang.String r7 = r6.mDefaultResolution
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L1a
            return r2
        L1a:
            java.lang.String r7 = r6.mIp
            java.lang.String r0 = r6.mHost
            java.lang.String r7 = r6.getMPDForFormat(r8, r9, r7, r0)
            return r7
        L23:
            boolean r1 = r6.isSupport(r7)
            if (r1 != 0) goto L2a
            return r2
        L2a:
            org.json.JSONObject r1 = r6.mStreamInfo     // Catch: org.json.JSONException -> L5c
            java.lang.String r7 = r1.optString(r7)     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5c
            r1.<init>(r7)     // Catch: org.json.JSONException -> L5c
            boolean r7 = r1.has(r9)     // Catch: org.json.JSONException -> L5c
            if (r7 == 0) goto L5f
            java.lang.String r7 = r1.optString(r9)     // Catch: org.json.JSONException -> L5c
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5c
            r9.<init>(r7)     // Catch: org.json.JSONException -> L5c
            java.lang.String r7 = "sdk_params"
            java.lang.String r7 = r9.optString(r7)     // Catch: org.json.JSONException -> L5a
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L5a
            r1.<init>(r7)     // Catch: org.json.JSONException -> L5a
            boolean r7 = r1.has(r0)     // Catch: org.json.JSONException -> L5a
            if (r7 == 0) goto L65
            java.lang.String r7 = r1.optString(r0)     // Catch: org.json.JSONException -> L5a
            goto L66
        L5a:
            r7 = move-exception
            goto L62
        L5c:
            r7 = move-exception
            r9 = r2
            goto L62
        L5f:
            r7 = r2
            r9 = r7
            goto L66
        L62:
            com.bytedance.sdk.component.utils.vl.j(r7)
        L65:
            r7 = r2
        L66:
            java.lang.String r0 = "avph"
            boolean r1 = r0.equals(r8)
            java.lang.String r3 = "flv"
            if (r1 == 0) goto L71
            r8 = r3
        L71:
            java.lang.String r1 = ""
            if (r7 == 0) goto L81
            boolean r4 = r7.equals(r1)
            if (r4 != 0) goto L81
            boolean r4 = r7.equals(r0)
            if (r4 == 0) goto L82
        L81:
            r7 = r8
        L82:
            int r4 = r6.mFlag
            r5 = 1
            r4 = r4 & r5
            if (r4 <= 0) goto L91
            java.lang.String r4 = "cmaf"
            boolean r4 = r7.equals(r4)
            if (r4 == 0) goto L91
            goto L92
        L91:
            r8 = r7
        L92:
            int r7 = r6.mRtcFallback
            if (r7 == r5) goto L9c
            int r7 = r6.mFlag
            r7 = r7 & 2
            if (r7 <= 0) goto L9d
        L9c:
            r8 = r3
        L9d:
            if (r9 == 0) goto Lad
            if (r8 == 0) goto La8
            boolean r7 = r8.equals(r0)
            if (r7 == 0) goto La8
            goto La9
        La8:
            r3 = r8
        La9:
            java.lang.String r2 = r9.optString(r3)
        Lad:
            if (r2 == 0) goto Lef
            java.lang.String r7 = r6.getQueryItems()
            if (r7 == 0) goto Lef
            boolean r8 = r7.equals(r1)
            if (r8 != 0) goto Lef
            java.lang.String r8 = "?"
            int r9 = r2.indexOf(r8)
            r0 = -1
            if (r9 != r0) goto Ld5
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r8)
            java.lang.String r7 = r7.substring(r5)
            r9.append(r7)
            java.lang.String r7 = r9.toString()
            goto Le0
        Ld5:
            int r8 = r2.length()
            int r8 = r8 - r5
            if (r9 != r8) goto Le0
            java.lang.String r7 = r7.substring(r5)
        Le0:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r2)
            r8.append(r7)
            java.lang.String r2 = r8.toString()
        Lef:
            return r2
    }

    public java.lang.String getSuggestFormat(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.isNeedUseDefaultResolution(r3)
            if (r0 == 0) goto L8
            java.lang.String r3 = r2.mDefaultResolution
        L8:
            boolean r0 = r2.isSupport(r3)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            org.json.JSONObject r0 = r2.mStreamInfo     // Catch: org.json.JSONException -> L2c
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch: org.json.JSONException -> L2c
            org.json.JSONObject r3 = r3.getJSONObject(r4)     // Catch: org.json.JSONException -> L2c
            java.lang.String r4 = "sdk_params"
            java.lang.String r3 = r3.optString(r4)     // Catch: org.json.JSONException -> L2c
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2c
            r4.<init>(r3)     // Catch: org.json.JSONException -> L2c
            java.lang.String r3 = "SuggestFormat"
            java.lang.String r3 = r4.optString(r3)     // Catch: org.json.JSONException -> L2c
            goto L31
        L2c:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            r3 = r1
        L31:
            if (r3 == 0) goto L3b
            boolean r4 = r3.isEmpty()
            if (r4 == 0) goto L3a
            return r1
        L3a:
            return r3
        L3b:
            return r1
    }

    public java.lang.String getSuggestProtocol(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.isNeedUseDefaultResolution(r3)
            if (r0 == 0) goto L8
            java.lang.String r3 = r2.mDefaultResolution
        L8:
            boolean r0 = r2.isSupport(r3)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            org.json.JSONObject r0 = r2.mStreamInfo     // Catch: org.json.JSONException -> L2d
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch: org.json.JSONException -> L2d
            org.json.JSONObject r3 = r3.getJSONObject(r4)     // Catch: org.json.JSONException -> L2d
            java.lang.String r4 = "sdk_params"
            java.lang.String r3 = r3.optString(r4)     // Catch: org.json.JSONException -> L2d
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2d
            r4.<init>(r3)     // Catch: org.json.JSONException -> L2d
            java.lang.String r3 = "SuggestProtocol"
            r4.optString(r3)     // Catch: org.json.JSONException -> L2d
            java.lang.String r3 = "tcp"
            goto L32
        L2d:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            r3 = r1
        L32:
            if (r3 == 0) goto L3b
            boolean r4 = r3.isEmpty()
            if (r4 != 0) goto L3b
            return r3
        L3b:
            return r1
    }

    public java.lang.String getVCodec(java.lang.String r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = r2.isNeedUseDefaultResolution(r3)
            if (r0 == 0) goto L8
            java.lang.String r3 = r2.mDefaultResolution
        L8:
            boolean r0 = r2.isSupport(r3)
            r1 = 0
            if (r0 != 0) goto L10
            return r1
        L10:
            org.json.JSONObject r0 = r2.mStreamInfo     // Catch: org.json.JSONException -> L2c
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch: org.json.JSONException -> L2c
            org.json.JSONObject r3 = r3.getJSONObject(r4)     // Catch: org.json.JSONException -> L2c
            java.lang.String r4 = "sdk_params"
            java.lang.String r3 = r3.optString(r4)     // Catch: org.json.JSONException -> L2c
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2c
            r4.<init>(r3)     // Catch: org.json.JSONException -> L2c
            java.lang.String r3 = "VCodec"
            java.lang.String r3 = r4.optString(r3)     // Catch: org.json.JSONException -> L2c
            return r3
        L2c:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            return r1
    }

    public boolean isABRListMatch() {
            r1 = this;
            boolean r0 = r1.mIsABRListMatch
            return r0
    }

    public boolean isCodecSame(java.lang.String r7) {
            r6 = this;
            org.json.JSONObject r0 = r6.mStreamInfo
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r0 = r0.length()
            if (r0 > 0) goto Ld
            return r1
        Ld:
            int r0 = r6.mIsCodecSame
            r2 = 1
            if (r0 < 0) goto L16
            if (r0 != r2) goto L15
            return r2
        L15:
            return r1
        L16:
            r6.mIsCodecSame = r2
            org.json.JSONObject r0 = r6.mStreamInfo
            java.util.Iterator r0 = r0.keys()
            r3 = 0
            r4 = r3
        L20:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L4d
            java.lang.Object r4 = r0.next()
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = r6.getVCodec(r4, r7)
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 != 0) goto L45
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L45
            boolean r5 = r4.equals(r3)
            if (r5 != 0) goto L45
            r6.mIsCodecSame = r1
            goto L4d
        L45:
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L20
            r3 = r4
            goto L20
        L4d:
            boolean r7 = android.text.TextUtils.isEmpty(r4)
            if (r7 == 0) goto L5b
            boolean r7 = android.text.TextUtils.isEmpty(r3)
            if (r7 == 0) goto L5b
            r6.mIsCodecSame = r1
        L5b:
            int r7 = r6.mIsCodecSame
            if (r7 != r2) goto L60
            return r2
        L60:
            return r1
    }

    public boolean isEnableAdaptive(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "list"
            boolean r1 = r5.isNeedUseDefaultResolution(r6)
            if (r1 == 0) goto La
            java.lang.String r6 = r5.mDefaultResolution
        La:
            boolean r1 = r5.isSupport(r6)
            r2 = 0
            if (r1 != 0) goto L12
            return r2
        L12:
            org.json.JSONObject r1 = r5.getAbrInfo()     // Catch: org.json.JSONException -> L4b
            if (r1 == 0) goto L52
            boolean r3 = r1.has(r0)     // Catch: org.json.JSONException -> L4b
            if (r3 != 0) goto L1f
            goto L52
        L1f:
            org.json.JSONArray r0 = r1.optJSONArray(r0)     // Catch: org.json.JSONException -> L4b
            if (r0 == 0) goto L56
            int r1 = r0.length()     // Catch: org.json.JSONException -> L4b
            if (r1 <= 0) goto L56
            r1 = 0
        L2c:
            int r3 = r0.length()     // Catch: org.json.JSONException -> L4b
            if (r1 >= r3) goto L56
            java.lang.String r3 = r0.getString(r1)     // Catch: org.json.JSONException -> L4b
            if (r3 == 0) goto L4f
            boolean r4 = r3.equals(r6)     // Catch: org.json.JSONException -> L4b
            if (r4 == 0) goto L4f
            java.lang.String r4 = "origin"
            boolean r3 = r3.equals(r4)     // Catch: org.json.JSONException -> L4b
            if (r3 == 0) goto L4d
            boolean r3 = r5.mEnableOriginResolution     // Catch: org.json.JSONException -> L4b
            if (r3 == 0) goto L4f
            goto L4d
        L4b:
            r6 = move-exception
            goto L53
        L4d:
            r6 = 1
            return r6
        L4f:
            int r1 = r1 + 1
            goto L2c
        L52:
            return r2
        L53:
            com.bytedance.sdk.component.utils.vl.j(r6)
        L56:
            return r2
    }

    public boolean isSupport(java.lang.String r3) {
            r2 = this;
            org.json.JSONObject r0 = r2.mStreamInfo
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            org.json.JSONObject r3 = r0.getJSONObject(r3)     // Catch: org.json.JSONException -> Lb
            goto L10
        Lb:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
            r3 = 0
        L10:
            if (r3 == 0) goto L14
            r3 = 1
            return r3
        L14:
            return r1
    }

    public boolean isSupportSR(int r4, int r5, float r6) {
            r3 = this;
            int r0 = java.lang.Math.max(r4, r5)
            int r1 = java.lang.Math.min(r4, r5)
            int r2 = r3.mSRLongerSideUpperBound
            if (r0 > r2) goto L1b
            int r0 = r3.mSRShorterSideUpperBound
            if (r1 > r0) goto L1b
            int r0 = r3.mSRFrameRateUpperBound
            float r0 = (float) r0
            int r6 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r6 > 0) goto L1b
            if (r4 >= r5) goto L1b
            r4 = 1
            return r4
        L1b:
            r4 = 0
            return r4
    }

    public boolean isSupportSharpen(int r2, int r3) {
            r1 = this;
            int r0 = java.lang.Math.max(r2, r3)
            int r2 = java.lang.Math.min(r2, r3)
            int r3 = r1.mSharpenLongerSideLowerBound
            if (r0 < r3) goto L1a
            int r3 = r1.mSharpenLongerSideUpperBound
            if (r0 > r3) goto L1a
            int r3 = r1.mSharpenShorterSideLowerBound
            if (r2 < r3) goto L1a
            int r3 = r1.mSharpenShorterSideUpperBound
            if (r2 > r3) goto L1a
            r2 = 1
            return r2
        L1a:
            r2 = 0
            return r2
    }

    public void setDefaultResolution(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.isNeedUseDefaultResolution(r2)
            if (r0 == 0) goto L8
            java.lang.String r2 = r1.mDefaultResolution
        L8:
            boolean r0 = r1.isSupport(r2)
            if (r0 != 0) goto Lf
            return
        Lf:
            r1.mDefaultResolution = r2
            return
    }

    public void setEnableOriginResolution(boolean r1) {
            r0 = this;
            r0.mEnableOriginResolution = r1
            return
    }

    public boolean setFlag(int r2) {
            r1 = this;
            int r0 = r1.mFlag
            r2 = r2 | r0
            r1.mFlag = r2
            r2 = 1
            return r2
    }

    public void setRequestParams(java.lang.String r1) {
            r0 = this;
            r0.mRequestParams = r1
            return
    }

    public void setRequestParamsWithDNSIp(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.mRequestParams = r1
            r0.mIp = r2
            r0.mHost = r3
            return
    }

    public void setRtcFallback(int r1) {
            r0 = this;
            r0.mRtcFallback = r1
            return
    }

    public void setTransportProtocol(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            r0.mTransportProtocol = r1
            r0.mPortNum = r2
            return
    }
}

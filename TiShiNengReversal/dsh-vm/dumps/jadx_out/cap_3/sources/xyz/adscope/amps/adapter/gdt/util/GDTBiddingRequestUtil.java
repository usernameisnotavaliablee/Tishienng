package xyz.adscope.amps.adapter.gdt.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GDTBiddingRequestUtil {





    public GDTBiddingRequestUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.net.HttpURLConnection access$000(java.lang.String r0, java.lang.String r1) {
            java.net.HttpURLConnection r0 = createConnection(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String access$100(android.content.Context r0, java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r0 = buildPostData(r0, r1, r2, r3, r4, r5)
            return r0
    }

    public static /* synthetic */ java.lang.String access$200(java.net.HttpURLConnection r0) {
            java.lang.String r0 = getStringContent(r0)
            return r0
    }

    public static /* synthetic */ void access$300(xyz.adscope.amps.adapter.gdt.inner.BiddingRequestCallback r0, int r1, java.lang.String r2) {
            callBackBiddingFail(r0, r1, r2)
            return
    }

    private static java.lang.String buildPostData(android.content.Context r8, java.lang.String r9, java.lang.String r10, int r11, java.lang.String r12, java.lang.String r13) {
            java.lang.String r11 = "ext"
            java.lang.String r0 = "CNY"
            java.lang.String r1 = "id"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1b2
            r2.<init>()     // Catch: org.json.JSONException -> L1b2
            java.lang.String r3 = xyz.adscope.amps.tool.util.AMPSStringUtil.createRequestId()     // Catch: org.json.JSONException -> L1b2
            r2.put(r1, r3)     // Catch: org.json.JSONException -> L1b2
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: org.json.JSONException -> L1b2
            r3.<init>()     // Catch: org.json.JSONException -> L1b2
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1b2
            r4.<init>()     // Catch: org.json.JSONException -> L1b2
            java.lang.String r5 = xyz.adscope.amps.tool.util.AMPSStringUtil.createRequestId()     // Catch: org.json.JSONException -> L1b2
            r4.put(r1, r5)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r5 = "bidfloorcur"
            r4.put(r5, r0)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r5 = "tagid"
            r4.put(r5, r10)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r10 = "ad_count"
            r5 = 1
            r4.put(r10, r5)     // Catch: org.json.JSONException -> L1b2
            r3.put(r4)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r10 = "imp"
            r2.put(r10, r3)     // Catch: org.json.JSONException -> L1b2
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1b2
            r10.<init>()     // Catch: org.json.JSONException -> L1b2
            r10.put(r1, r9)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r9 = "bundle"
            java.lang.String r1 = r8.getPackageName()     // Catch: org.json.JSONException -> L1b2
            r10.put(r9, r1)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r9 = "app"
            r2.put(r9, r10)     // Catch: org.json.JSONException -> L1b2
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1b2
            r9.<init>()     // Catch: org.json.JSONException -> L1b2
            java.lang.String r10 = "ua"
            xyz.adscope.amps.adapter.gdt.GDTInitMediation r1 = xyz.adscope.amps.adapter.gdt.GDTInitMediation.getInstance()     // Catch: org.json.JSONException -> L1b2
            java.lang.String r1 = r1.getUserAgent(r8)     // Catch: org.json.JSONException -> L1b2
            r9.put(r10, r1)     // Catch: org.json.JSONException -> L1b2
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1b2
            r10.<init>()     // Catch: org.json.JSONException -> L1b2
            xyz.adscope.amps.adapter.gdt.GDTInitMediation r1 = xyz.adscope.amps.adapter.gdt.GDTInitMediation.getInstance()     // Catch: org.json.JSONException -> L1b2
            xyz.adscope.amps.config.AMPSPrivacyConfig r1 = r1.getAmpsPrivacyConfig()     // Catch: org.json.JSONException -> L1b2
            if (r1 == 0) goto La8
            java.lang.String r3 = r1.getIP()     // Catch: org.json.JSONException -> L1b2
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L1b2
            if (r4 != 0) goto L81
            java.lang.String r4 = "ip"
            r9.put(r4, r3)     // Catch: org.json.JSONException -> L1b2
        L81:
            java.lang.String r3 = r1.getDevImei()     // Catch: org.json.JSONException -> L1b2
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L1b2
            if (r4 != 0) goto L99
            java.lang.String r4 = "ifa"
            r9.put(r4, r3)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r4 = "didmd5"
            java.lang.String r3 = xyz.adscope.common.tool.security.MD5Util.md5(r3)     // Catch: org.json.JSONException -> L1b2
            r9.put(r4, r3)     // Catch: org.json.JSONException -> L1b2
        L99:
            java.lang.String r3 = r1.getAndroidId()     // Catch: org.json.JSONException -> L1b2
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> L1b2
            if (r4 != 0) goto La8
            java.lang.String r4 = "android_id"
            r10.put(r4, r3)     // Catch: org.json.JSONException -> L1b2
        La8:
            java.lang.String r3 = "h"
            int r4 = xyz.adscope.amps.tool.util.AMPSScreenUtil.getScreenHeight(r8)     // Catch: org.json.JSONException -> L1b2
            r9.put(r3, r4)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r3 = "w"
            int r4 = xyz.adscope.amps.tool.util.AMPSScreenUtil.getScreenWidth(r8)     // Catch: org.json.JSONException -> L1b2
            r9.put(r3, r4)     // Catch: org.json.JSONException -> L1b2
            xyz.adscope.common.info.DeviceInfo r3 = xyz.adscope.common.info.DeviceInfo.getInstance(r8)     // Catch: org.json.JSONException -> L1b2
            if (r3 == 0) goto L16c
            java.lang.String r4 = r3.getConnectType()     // Catch: org.json.JSONException -> L1b2
            int r6 = r4.hashCode()     // Catch: org.json.JSONException -> L1b2
            r7 = 3
            switch(r6) {
                case 48: goto Lff;
                case 49: goto Lf5;
                case 50: goto Leb;
                case 51: goto Le1;
                case 52: goto Ld7;
                case 53: goto Lcd;
                default: goto Lcc;
            }     // Catch: org.json.JSONException -> L1b2
        Lcc:
            goto L105
        Lcd:
            java.lang.String r6 = "5"
            boolean r4 = r4.equals(r6)     // Catch: org.json.JSONException -> L1b2
            if (r4 == 0) goto L105
            r7 = 7
            goto L105
        Ld7:
            java.lang.String r6 = "4"
            boolean r4 = r4.equals(r6)     // Catch: org.json.JSONException -> L1b2
            if (r4 == 0) goto L105
            r7 = 6
            goto L105
        Le1:
            java.lang.String r6 = "3"
            boolean r4 = r4.equals(r6)     // Catch: org.json.JSONException -> L1b2
            if (r4 == 0) goto L105
            r7 = 5
            goto L105
        Leb:
            java.lang.String r6 = "2"
            boolean r4 = r4.equals(r6)     // Catch: org.json.JSONException -> L1b2
            if (r4 == 0) goto L105
            r7 = 4
            goto L105
        Lf5:
            java.lang.String r6 = "1"
            boolean r4 = r4.equals(r6)     // Catch: org.json.JSONException -> L1b2
            if (r4 == 0) goto L105
            r7 = 2
            goto L105
        Lff:
            java.lang.String r6 = "0"
            boolean r4 = r4.equals(r6)     // Catch: org.json.JSONException -> L1b2
        L105:
            java.lang.String r4 = "connectiontype"
            r9.put(r4, r7)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r4 = "make"
            java.lang.String r6 = r3.getManufacturer()     // Catch: org.json.JSONException -> L1b2
            r9.put(r4, r6)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r4 = "model"
            java.lang.String r6 = r3.getModel()     // Catch: org.json.JSONException -> L1b2
            r9.put(r4, r6)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r4 = "os"
            java.lang.String r6 = "Android"
            r9.put(r4, r6)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r4 = "osv"
            java.lang.String r6 = r3.getOsVersion()     // Catch: org.json.JSONException -> L1b2
            r9.put(r4, r6)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r4 = "devicetype"
            r9.put(r4, r5)     // Catch: org.json.JSONException -> L1b2
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1b2
            r4.<init>()     // Catch: org.json.JSONException -> L1b2
            java.lang.String r5 = "country"
            int r6 = r3.getCountry_CN()     // Catch: org.json.JSONException -> L1b2
            r4.put(r5, r6)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r5 = "geo"
            r9.put(r5, r4)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r4 = r3.getOaid()     // Catch: org.json.JSONException -> L1b2
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: org.json.JSONException -> L1b2
            if (r5 == 0) goto L154
            if (r1 == 0) goto L154
            java.lang.String r4 = r1.getDevOaid()     // Catch: org.json.JSONException -> L1b2
        L154:
            boolean r1 = android.text.TextUtils.isEmpty(r4)     // Catch: org.json.JSONException -> L1b2
            if (r1 != 0) goto L163
            java.lang.String r1 = "oaid"
            java.lang.String r4 = r3.getOaid()     // Catch: org.json.JSONException -> L1b2
            r10.put(r1, r4)     // Catch: org.json.JSONException -> L1b2
        L163:
            java.lang.String r1 = "time_zone"
            java.lang.String r3 = r3.getTimeZone()     // Catch: org.json.JSONException -> L1b2
            r10.put(r1, r3)     // Catch: org.json.JSONException -> L1b2
        L16c:
            java.lang.String r1 = "language"
            java.lang.String r3 = "zh-cn"
            r9.put(r1, r3)     // Catch: org.json.JSONException -> L1b2
            r9.put(r11, r10)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r10 = "device"
            r2.put(r10, r9)     // Catch: org.json.JSONException -> L1b2
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch: org.json.JSONException -> L1b2
            r9.<init>()     // Catch: org.json.JSONException -> L1b2
            r9.add(r0)     // Catch: org.json.JSONException -> L1b2
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch: org.json.JSONException -> L1b2
            r10.<init>()     // Catch: org.json.JSONException -> L1b2
            r10.put(r9)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r9 = "cur"
            r2.put(r9, r10)     // Catch: org.json.JSONException -> L1b2
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L1b2
            r9.<init>()     // Catch: org.json.JSONException -> L1b2
            java.lang.String r10 = "buyer_id"
            r9.put(r10, r12)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r10 = "wx_installed"
            java.lang.String r12 = "com.tencent.mm"
            boolean r8 = xyz.adscope.common.v2.dev.info.PackageUtil.isInstall(r8, r12)     // Catch: org.json.JSONException -> L1b2
            r9.put(r10, r8)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r8 = "sdk_info"
            r9.put(r8, r13)     // Catch: org.json.JSONException -> L1b2
            r2.put(r11, r9)     // Catch: org.json.JSONException -> L1b2
            java.lang.String r8 = r2.toString()     // Catch: org.json.JSONException -> L1b2
            return r8
        L1b2:
            r8 = 0
            return r8
    }

    private static void callBackBiddingFail(xyz.adscope.amps.adapter.gdt.inner.BiddingRequestCallback r1, int r2, java.lang.String r3) {
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil$2 r0 = new xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil$2
            r0.<init>(r1, r2, r3)
            xyz.adscope.amps.adapter.gdt.util.ThreadUtils.runOnUIThread(r0)
            return
    }

    private static java.net.HttpURLConnection createConnection(java.lang.String r2, java.lang.String r3) {
            java.net.URL r0 = new java.net.URL
            r0.<init>(r2)
            java.net.URLConnection r2 = r0.openConnection()
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2
            r0 = 1
            r2.setDoOutput(r0)
            r2.setDoInput(r0)
            java.lang.String r0 = "Content-Type"
            java.lang.String r1 = "application/json"
            r2.setRequestProperty(r0, r1)
            java.lang.String r0 = "Accept"
            r2.setRequestProperty(r0, r1)
            java.lang.String r0 = "Accept-Language"
            java.lang.String r1 = "zh-cn"
            r2.setRequestProperty(r0, r1)
            java.lang.String r0 = "X-OpenRTB-Version"
            java.lang.String r1 = "2.5"
            r2.setRequestProperty(r0, r1)
            r0 = 5000(0x1388, float:7.006E-42)
            r2.setConnectTimeout(r0)
            r2.setReadTimeout(r0)
            r0 = 0
            r2.setUseCaches(r0)
            r2.setRequestMethod(r3)
            return r2
    }

    public static void getBidResponse(android.content.Context r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, int r13, xyz.adscope.amps.adapter.gdt.inner.BiddingRequestCallback r14) {
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 == 0) goto L10
            if (r14 == 0) goto L3e
            r9 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r10 = "serverUrl  is null"
            r14.fail(r9, r10)
            return
        L10:
            java.lang.String r6 = xyz.adscope.amps.adapter.gdt.GDTAdManagerHolder.getBidToken()
            java.lang.String r7 = xyz.adscope.amps.adapter.gdt.GDTAdManagerHolder.getBidSdkInfo(r12)
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L24
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L26
        L24:
            r8 = r14
            goto L35
        L26:
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil$1 r0 = new xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil$1
            r2 = r9
            r1 = r10
            r3 = r11
            r4 = r12
            r5 = r13
            r8 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            xyz.adscope.amps.adapter.gdt.util.ThreadUtils.runOnThreadPool(r0)
            return
        L35:
            if (r8 == 0) goto L3e
            r9 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r10 = "bid token is null"
            r8.fail(r9, r10)
        L3e:
            return
    }

    private static byte[] getBytesContent(java.net.HttpURLConnection r4) {
            java.io.InputStream r4 = r4.getInputStream()
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]     // Catch: java.lang.Throwable -> L18
        Ld:
            int r2 = r4.read(r1)     // Catch: java.lang.Throwable -> L18
            if (r2 <= 0) goto L1a
            r3 = 0
            r0.write(r1, r3, r2)     // Catch: java.lang.Throwable -> L18
            goto Ld
        L18:
            r0 = move-exception
            goto L22
        L1a:
            r4.close()     // Catch: java.io.IOException -> L1d
        L1d:
            byte[] r4 = r0.toByteArray()
            return r4
        L22:
            if (r4 == 0) goto L27
            r4.close()     // Catch: java.io.IOException -> L27
        L27:
            throw r0
    }

    private static java.util.Map<java.lang.String, java.lang.String> getRequestProperty(android.content.Context r3) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r1 = "Content-Type"
            java.lang.String r2 = "application/json"
            r0.put(r1, r2)
            xyz.adscope.amps.adapter.gdt.GDTInitMediation r1 = xyz.adscope.amps.adapter.gdt.GDTInitMediation.getInstance()
            java.lang.String r3 = r1.getUserAgent(r3)
            java.lang.String r1 = "User-Agent"
            r0.put(r1, r3)
            java.lang.String r3 = "Accept"
            r0.put(r3, r2)
            java.lang.String r3 = "Accept-Language"
            java.lang.String r1 = "zh-cn"
            r0.put(r3, r1)
            java.lang.String r3 = "X-OpenRTB-Version"
            java.lang.String r1 = "2.5"
            r0.put(r3, r1)
            return r0
    }

    private static java.lang.String getStringContent(java.net.HttpURLConnection r3) {
            byte[] r0 = getBytesContent(r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r0.length
            if (r2 != 0) goto Le
            java.lang.String r3 = ""
            return r3
        Le:
            java.lang.String r1 = r3.getContentEncoding()     // Catch: java.lang.Exception -> L13
            goto L14
        L13:
        L14:
            if (r1 != 0) goto L18
            java.lang.String r1 = "UTF-8"
        L18:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r0, r1)
            return r3
    }

    public static void sendLossNotice(xyz.adscope.amps.adapter.gdt.model.BidResponseModel r2, int r3, int r4, java.lang.String r5) {
            if (r2 != 0) goto L4
            goto L6f
        L4:
            java.util.List r2 = r2.getSeatbid()     // Catch: java.lang.Exception -> L6f
            if (r2 == 0) goto L6f
            boolean r0 = r2.isEmpty()     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L11
            goto L6f
        L11:
            r0 = 0
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> L6f
            xyz.adscope.amps.adapter.gdt.model.SeatBidModel r2 = (xyz.adscope.amps.adapter.gdt.model.SeatBidModel) r2     // Catch: java.lang.Exception -> L6f
            if (r2 != 0) goto L1b
            goto L6f
        L1b:
            java.util.List r2 = r2.getBid()     // Catch: java.lang.Exception -> L6f
            if (r2 == 0) goto L6f
            boolean r1 = r2.isEmpty()     // Catch: java.lang.Exception -> L6f
            if (r1 == 0) goto L28
            goto L6f
        L28:
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Exception -> L6f
            xyz.adscope.amps.adapter.gdt.model.BidModel r2 = (xyz.adscope.amps.adapter.gdt.model.BidModel) r2     // Catch: java.lang.Exception -> L6f
            if (r2 != 0) goto L31
            goto L6f
        L31:
            java.lang.String r2 = r2.getLurl()     // Catch: java.lang.Exception -> L6f
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L6f
            if (r0 == 0) goto L3c
            goto L6f
        L3c:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L6f
            java.lang.String r3 = xyz.adscope.amps.adapter.gdt.util.RSAEncryptUtil.encrypt(r3, r5)     // Catch: java.lang.Exception -> L6f
            r5 = 1
            if (r4 == r5) goto L51
            r5 = 2
            if (r4 == r5) goto L4e
            r5 = 3
            java.lang.String r0 = "10001"
            goto L53
        L4e:
            java.lang.String r0 = "101"
            goto L53
        L51:
            java.lang.String r0 = "1"
        L53:
            java.lang.String r4 = "${AUCTION_PRICE}"
            java.lang.String r2 = r2.replace(r4, r3)     // Catch: java.lang.Exception -> L6f
            java.lang.String r3 = "${AUCTION_SEAT_ID}"
            java.lang.String r4 = "2"
            java.lang.String r2 = r2.replace(r3, r4)     // Catch: java.lang.Exception -> L6f
            java.lang.String r3 = "${AUCTION_LOSS}"
            java.lang.String r2 = r2.replace(r3, r0)     // Catch: java.lang.Exception -> L6f
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil$4 r3 = new xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil$4     // Catch: java.lang.Exception -> L6f
            r3.<init>(r2)     // Catch: java.lang.Exception -> L6f
            xyz.adscope.amps.adapter.gdt.util.ThreadUtils.runOnThreadPool(r3)     // Catch: java.lang.Exception -> L6f
        L6f:
            return
    }

    public static void sendWinNotice(xyz.adscope.amps.adapter.gdt.model.BidResponseModel r3, java.lang.String r4) {
            if (r3 != 0) goto L3
            goto L62
        L3:
            java.util.List r3 = r3.getSeatbid()     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L62
            boolean r0 = r3.isEmpty()     // Catch: java.lang.Exception -> L62
            if (r0 == 0) goto L10
            goto L62
        L10:
            r0 = 0
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Exception -> L62
            xyz.adscope.amps.adapter.gdt.model.SeatBidModel r3 = (xyz.adscope.amps.adapter.gdt.model.SeatBidModel) r3     // Catch: java.lang.Exception -> L62
            if (r3 != 0) goto L1a
            goto L62
        L1a:
            java.util.List r3 = r3.getBid()     // Catch: java.lang.Exception -> L62
            if (r3 == 0) goto L62
            boolean r1 = r3.isEmpty()     // Catch: java.lang.Exception -> L62
            if (r1 == 0) goto L27
            goto L62
        L27:
            java.lang.Object r3 = r3.get(r0)     // Catch: java.lang.Exception -> L62
            xyz.adscope.amps.adapter.gdt.model.BidModel r3 = (xyz.adscope.amps.adapter.gdt.model.BidModel) r3     // Catch: java.lang.Exception -> L62
            if (r3 != 0) goto L30
            goto L62
        L30:
            java.lang.String r0 = r3.getNurl()     // Catch: java.lang.Exception -> L62
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L62
            if (r1 == 0) goto L3b
            goto L62
        L3b:
            double r1 = r3.getPrice()     // Catch: java.lang.Exception -> L62
            int r3 = (int) r1     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L62
            java.lang.String r4 = xyz.adscope.amps.adapter.gdt.util.RSAEncryptUtil.encrypt(r1, r4)     // Catch: java.lang.Exception -> L62
            java.lang.String r1 = "${AUCTION_PRICE}"
            java.lang.String r4 = r0.replace(r1, r4)     // Catch: java.lang.Exception -> L62
            java.lang.String r0 = "${HIGHEST_LOSS_PRICE}"
            int r3 = r3 + (-1)
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L62
            java.lang.String r3 = r4.replace(r0, r3)     // Catch: java.lang.Exception -> L62
            xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil$3 r4 = new xyz.adscope.amps.adapter.gdt.util.GDTBiddingRequestUtil$3     // Catch: java.lang.Exception -> L62
            r4.<init>(r3)     // Catch: java.lang.Exception -> L62
            xyz.adscope.amps.adapter.gdt.util.ThreadUtils.runOnThreadPool(r4)     // Catch: java.lang.Exception -> L62
        L62:
            return
    }
}

package xyz.adscope.amps.adapter.ks.util;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class KSBiddingRequestUtil {




    public KSBiddingRequestUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.net.HttpURLConnection access$000(java.lang.String r0, java.lang.String r1) {
            java.net.HttpURLConnection r0 = createConnection(r0, r1)
            return r0
    }

    public static /* synthetic */ java.lang.String access$100(java.lang.String r0, java.lang.String r1, java.lang.String r2, int r3) {
            java.lang.String r0 = buildPostData(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String access$200(java.net.HttpURLConnection r0) {
            java.lang.String r0 = getStringContent(r0)
            return r0
    }

    public static /* synthetic */ void access$300(xyz.adscope.amps.adapter.ks.inner.BiddingRequestCallback r0, int r1, java.lang.String r2) {
            callBackBiddingFail(r0, r1, r2)
            return
    }

    private static java.lang.String buildPostData(java.lang.String r3, java.lang.String r4, java.lang.String r5, int r6) {
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> L49
            r0.<init>()     // Catch: org.json.JSONException -> L49
            xyz.adscope.amps.adapter.ks.KSInitMediation r1 = xyz.adscope.amps.adapter.ks.KSInitMediation.getInstance()     // Catch: org.json.JSONException -> L49
            java.lang.String r1 = r1.getIpAddress()     // Catch: org.json.JSONException -> L49
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L49
            if (r2 != 0) goto L18
            java.lang.String r2 = "ip"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L49
        L18:
            java.lang.String r1 = "adxId"
            r0.put(r1, r3)     // Catch: org.json.JSONException -> L49
            java.lang.String r3 = "sdkToken"
            r0.put(r3, r4)     // Catch: org.json.JSONException -> L49
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L49
            r3.<init>()     // Catch: org.json.JSONException -> L49
            java.lang.String r4 = "posId"
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L49
            java.lang.String r4 = "adCount"
            r5 = 1
            r3.put(r4, r5)     // Catch: org.json.JSONException -> L49
            java.lang.String r4 = "cpmBidFloor"
            r3.put(r4, r6)     // Catch: org.json.JSONException -> L49
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch: org.json.JSONException -> L49
            r4.<init>()     // Catch: org.json.JSONException -> L49
            r4.put(r3)     // Catch: org.json.JSONException -> L49
            java.lang.String r3 = "adImpInfos"
            r0.put(r3, r4)     // Catch: org.json.JSONException -> L49
            java.lang.String r3 = r0.toString()     // Catch: org.json.JSONException -> L49
            return r3
        L49:
            r3 = 0
            return r3
    }

    private static void callBackBiddingFail(xyz.adscope.amps.adapter.ks.inner.BiddingRequestCallback r1, int r2, java.lang.String r3) {
            xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil$3 r0 = new xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil$3
            r0.<init>(r1, r2, r3)
            xyz.adscope.amps.adapter.ks.util.ThreadUtils.runOnUIThread(r0)
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
            r0 = 5000(0x1388, float:7.006E-42)
            r2.setConnectTimeout(r0)
            r2.setReadTimeout(r0)
            r0 = 0
            r2.setUseCaches(r0)
            r2.setRequestMethod(r3)
            return r2
    }

    public static void getBidResponse(java.lang.String r8, java.lang.String r9, java.lang.String r10, int r11, xyz.adscope.amps.adapter.ks.inner.BiddingRequestCallback r12) {
            xyz.adscope.amps.adapter.ks.KSInitMediation r0 = xyz.adscope.amps.adapter.ks.KSInitMediation.getInstance()
            java.lang.String r4 = r0.getBidToken(r10)
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 == 0) goto L18
            if (r12 == 0) goto L17
            r8 = 1001(0x3e9, float:1.403E-42)
            java.lang.String r9 = "bid token is null"
            r12.fail(r8, r9)
        L17:
            return
        L18:
            xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil$1 r1 = new xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil$1
            r2 = r8
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            r1.<init>(r2, r3, r4, r5, r6, r7)
            xyz.adscope.amps.adapter.ks.util.ThreadUtils.runOnThreadPool(r1)
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

    public static void sendWinNotice(xyz.adscope.amps.adapter.ks.model.BidResponseModel r1) {
            if (r1 != 0) goto L3
            goto L32
        L3:
            java.util.List r0 = r1.getAdBids()
            if (r0 == 0) goto L32
            java.util.List r0 = r1.getAdBids()
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            goto L32
        L14:
            java.util.List r1 = r1.getAdBids()
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            xyz.adscope.amps.adapter.ks.model.AdBidsModel r1 = (xyz.adscope.amps.adapter.ks.model.AdBidsModel) r1
            java.lang.String r1 = r1.getWinNoticeUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L2a
            goto L32
        L2a:
            xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil$2 r0 = new xyz.adscope.amps.adapter.ks.util.KSBiddingRequestUtil$2
            r0.<init>(r1)
            xyz.adscope.amps.adapter.ks.util.ThreadUtils.runOnThreadPool(r0)
        L32:
            return
    }
}

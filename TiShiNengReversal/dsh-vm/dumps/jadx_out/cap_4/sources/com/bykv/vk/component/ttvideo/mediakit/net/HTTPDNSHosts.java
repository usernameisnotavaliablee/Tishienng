package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class HTTPDNSHosts {
    private static final java.lang.String TAG = "BatchParseHTTPDNSHosts";
    private static java.lang.String mTTDNSServer = "/q?host=";
    protected boolean mCancelled;
    protected android.os.Handler mHandler;
    public java.lang.String[] mHostnames;
    private int mHttpDNSType;
    public java.lang.String mId;
    protected com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient mNetClient;



    static {
            return
    }

    public HTTPDNSHosts(java.lang.String[] r3, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient r4, int r5, android.os.Handler r6) throws java.lang.Exception {
            r2 = this;
            r2.<init>()
            r0 = 2
            r2.mHttpDNSType = r0
            r1 = 0
            r2.mCancelled = r1
            r1 = 0
            r2.mNetClient = r1
            if (r5 != r0) goto L2f
            if (r3 == 0) goto L27
            int r0 = r3.length
            if (r0 == 0) goto L27
            r2.mHttpDNSType = r5
            r2.mHostnames = r3
            r2.mNetClient = r4
            if (r4 != 0) goto L22
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork r3 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLHTTPNetwork
            r3.<init>()
            r2.mNetClient = r3
        L22:
            r2.mHttpDNSType = r5
            r2.mHandler = r6
            return
        L27:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "host array is valid"
            r3.<init>(r4)
            throw r3
        L2f:
            java.lang.Exception r3 = new java.lang.Exception
            java.lang.String r4 = "type is not own"
            r3.<init>(r4)
            throw r3
    }

    private java.lang.String _getURL() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "https://"
            r1.<init>(r2)
            java.lang.String r2 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalOwnDNSParseHost
            r1.append(r2)
            java.lang.String r2 = com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNSHosts.mTTDNSServer
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r1 = 0
            r2 = 0
        L1f:
            java.lang.String[] r3 = r5.mHostnames
            int r4 = r3.length
            if (r1 >= r4) goto L50
            r3 = r3[r1]
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L4d
            if (r2 != 0) goto L36
            java.lang.String[] r3 = r5.mHostnames
            r3 = r3[r1]
            r0.append(r3)
            goto L4b
        L36:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ","
            r3.<init>(r4)
            java.lang.String[] r4 = r5.mHostnames
            r4 = r4[r1]
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.append(r3)
        L4b:
            int r2 = r2 + 1
        L4d:
            int r1 = r1 + 1
            goto L1f
        L50:
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void _handleResponse(org.json.JSONObject r5, com.bykv.vk.component.ttvideo.mediakit.net.Error r6) {
            r4 = this;
            java.lang.String r0 = r4.mId
            int r1 = r4.mHttpDNSType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "****http dns id:%s type:%d"
            java.lang.String.format(r1, r2)
            if (r6 == 0) goto L24
            java.lang.String r5 = r6.errStr
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r3] = r5
            java.lang.String r5 = "handle response receive err:%s"
            java.lang.String.format(r5, r6)
            return
        L24:
            if (r5 == 0) goto L47
            int r6 = r5.length()
            if (r6 != 0) goto L2d
            goto L47
        L2d:
            r4.parseResult(r5)     // Catch: java.lang.Throwable -> L31
            goto L3f
        L31:
            r5 = move-exception
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r6 = new java.lang.Object[r0]
            r6[r3] = r5
            java.lang.String r5 = "handle response exception:%s"
            java.lang.String.format(r5, r6)
        L3f:
            java.lang.String r5 = "****parse end"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String.format(r5, r6)
            return
        L47:
            java.lang.String r5 = "json null err"
            java.lang.Object[] r6 = new java.lang.Object[r3]
            java.lang.String.format(r5, r6)
            return
    }

    static /* synthetic */ void access$000(com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNSHosts r0, org.json.JSONObject r1, com.bykv.vk.component.ttvideo.mediakit.net.Error r2) {
            r0._handleResponse(r1, r2)
            return
    }

    private void parseResult(org.json.JSONObject r5) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L26
        L3:
            java.lang.String r0 = "dns"
            org.json.JSONArray r5 = r5.getJSONArray(r0)     // Catch: java.lang.Exception -> L26
            r0 = 0
        La:
            int r1 = r5.length()     // Catch: java.lang.Exception -> L26
            if (r0 >= r1) goto L26
            org.json.JSONObject r1 = r5.getJSONObject(r0)     // Catch: java.lang.Exception -> L26
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r1 = r4.parserResultForSingleHost(r1)     // Catch: java.lang.Exception -> L26
            if (r1 == 0) goto L23
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r2 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.getInstance()     // Catch: java.lang.Exception -> L26
            java.lang.String r3 = r1.mHost     // Catch: java.lang.Exception -> L26
            r2.put(r3, r1)     // Catch: java.lang.Exception -> L26
        L23:
            int r0 = r0 + 1
            goto La
        L26:
            return
    }

    private com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo parserResultForSingleHost(org.json.JSONObject r20) {
            r19 = this;
            r1 = r19
            r0 = r20
            int r2 = r1.mHttpDNSType
            r3 = 0
            r4 = 1
            java.lang.String r5 = ""
            r6 = 0
            r7 = 2
            if (r2 == r7) goto L19
            if (r2 != r4) goto L11
            goto L19
        L11:
            r8 = 0
            r14 = r6
            r16 = r8
        L16:
            r15 = r5
            goto La3
        L19:
            if (r0 == 0) goto Lce
            int r2 = r0.length()
            if (r2 != 0) goto L23
            goto Lce
        L23:
            java.lang.String r2 = "ttl"
            boolean r8 = r0.has(r2)
            if (r8 == 0) goto L30
            int r2 = r0.optInt(r2)
            goto L32
        L30:
            r2 = 60
        L32:
            java.lang.String r8 = "host"
            boolean r9 = r0.has(r8)
            if (r9 == 0) goto L3f
            java.lang.String r8 = r0.optString(r8)
            goto L40
        L3f:
            r8 = r6
        L40:
            long r9 = java.lang.System.currentTimeMillis()
            int r2 = r2 * 1000
            long r11 = (long) r2
            long r9 = r9 + r11
            java.lang.String r2 = "ips"
            org.json.JSONArray r2 = r0.optJSONArray(r2)
            if (r2 == 0) goto Lce
            int r0 = r2.length()
            if (r0 != 0) goto L58
            goto Lce
        L58:
            r11 = 0
        L59:
            int r0 = r2.length()
            if (r11 >= r0) goto L9e
            java.lang.String r0 = r2.getString(r11)     // Catch: java.lang.Exception -> L64
            goto L69
        L64:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = r6
        L69:
            boolean r12 = android.text.TextUtils.isEmpty(r0)
            if (r12 != 0) goto L9b
            boolean r12 = android.text.TextUtils.isEmpty(r5)
            if (r12 == 0) goto L86
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
        L84:
            r5 = r0
            goto L9b
        L86:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            r12.append(r5)
            java.lang.String r5 = ","
            r12.append(r5)
            r12.append(r0)
            java.lang.String r0 = r12.toString()
            goto L84
        L9b:
            int r11 = r11 + 1
            goto L59
        L9e:
            r14 = r8
            r16 = r9
            goto L16
        La3:
            boolean r0 = android.text.TextUtils.isEmpty(r14)
            if (r0 != 0) goto Lce
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            if (r0 == 0) goto Lb0
            goto Lce
        Lb0:
            java.lang.Long r0 = java.lang.Long.valueOf(r16)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r14
            r2[r4] = r15
            r2[r7] = r0
            java.lang.String r0 = "parse result host:%s ips:%s expiredT:%d"
            java.lang.String.format(r0, r2)
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r12 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo
            int r13 = r1.mHttpDNSType
            java.lang.String r0 = r1.mId
            r18 = r0
            r12.<init>(r13, r14, r15, r16, r18)
            return r12
        Lce:
            return r6
    }

    public void cancel() {
            r1 = this;
            boolean r0 = r1.mCancelled
            if (r0 == 0) goto L5
            return
        L5:
            r0 = 1
            r1.mCancelled = r0
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient r0 = r1.mNetClient
            r0.cancel()
            return
    }

    public void start() {
            r7 = this;
            java.lang.String r1 = r7._getURL()
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient r0 = r7.mNetClient
            java.lang.Class r0 = r0.getClass()
            java.lang.reflect.Method[] r0 = r0.getDeclaredMethods()
            int r2 = r0.length
            r3 = 0
        L10:
            if (r3 >= r2) goto L39
            r4 = r0[r3]
            java.lang.String r5 = r4.getName()
            java.lang.String r6 = "startTask"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L36
            java.lang.Class[] r4 = r4.getParameterTypes()
            int r4 = r4.length
            r5 = 5
            if (r4 != r5) goto L36
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient r0 = r7.mNetClient
            com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNSHosts$1 r5 = new com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNSHosts$1
            r5.<init>(r7)
            r2 = 0
            r3 = 0
            r4 = 0
            r0.startTask(r1, r2, r3, r4, r5)
            return
        L36:
            int r3 = r3 + 1
            goto L10
        L39:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient r0 = r7.mNetClient
            com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNSHosts$2 r2 = new com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNSHosts$2
            r2.<init>(r7)
            r3 = 0
            r0.startTask(r1, r3, r2)
            return
    }
}

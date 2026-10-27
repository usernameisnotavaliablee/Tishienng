package com.bykv.vk.component.ttvideo.mediakit.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class HTTPDNS extends com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS {
    private static final java.lang.String TAG = "HTTPDNS";
    private static java.lang.String mGoogleDNSServer = "/resolve?name=";
    private static java.lang.String mTTDNSServer = "/q?host=";
    private int mHttpDNSType;
    private java.lang.Object mSource;
    private long mSourceId;



    static {
            return
    }

    public HTTPDNS(java.lang.String r1, com.bykv.vk.component.ttvideo.mediakit.net.AVMDLNetClient r2, int r3, android.os.Handler r4) {
            r0 = this;
            r0.<init>(r1, r2, r4)
            r0.mHttpDNSType = r3
            return
    }

    private java.lang.String _getURL() {
            r6 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.mHttpDNSType
            java.lang.String r2 = "https://"
            r3 = 1
            r4 = 2
            if (r1 == r4) goto L2a
            if (r1 != r3) goto L10
            goto L2a
        L10:
            r5 = 3
            if (r1 != r5) goto L40
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r2 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalGoogleDNSParseHost
            r1.append(r2)
            java.lang.String r2 = com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNS.mGoogleDNSServer
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            goto L40
        L2a:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r2)
            java.lang.String r2 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalOwnDNSParseHost
            r1.append(r2)
            java.lang.String r2 = com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNS.mTTDNSServer
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
        L40:
            java.lang.String r1 = r6.mHostname
            r0.append(r1)
            int r1 = r6.mHttpDNSType
            if (r1 == r4) goto L4b
            if (r1 != r3) goto L50
        L4b:
            java.lang.String r1 = "&source=vod"
            r0.append(r1)
        L50:
            java.lang.String r0 = r0.toString()
            return r0
    }

    private void _handleResponse(org.json.JSONObject r14, com.bykv.vk.component.ttvideo.mediakit.net.Error r15) {
            r13 = this;
            java.lang.String r0 = r13.mId
            int r1 = r13.mHttpDNSType
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.String r2 = r13.mHostname
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r0
            r5 = 1
            r3[r5] = r1
            r1 = 2
            r3[r1] = r2
            java.lang.String r0 = "****http dns id:%s type:%d host:%s"
            java.lang.String.format(r0, r3)
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r6 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo
            int r7 = r13.mHttpDNSType
            java.lang.String r8 = r13.mHostname
            r10 = 0
            java.lang.String r12 = r13.mId
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r12)
            if (r15 == 0) goto L39
            java.lang.String r14 = r15.errStr
            r6.mErrorStr = r14
            java.lang.Object[] r15 = new java.lang.Object[r5]
            r15[r4] = r14
            java.lang.String r14 = "handle response receive err:%s"
            java.lang.String.format(r14, r15)
            goto L9d
        L39:
            if (r14 == 0) goto L7d
            int r15 = r14.length()
            if (r15 != 0) goto L42
            goto L7d
        L42:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r14 = r13.parserResult(r14)     // Catch: java.lang.Throwable -> L47
            goto L57
        L47:
            r0 = move-exception
            r14 = r0
            java.lang.String r14 = r14.toString()
            java.lang.Object[] r15 = new java.lang.Object[r5]
            r15[r4] = r14
            java.lang.String r14 = "handle response exception:%s"
            java.lang.String.format(r14, r15)
            r14 = 0
        L57:
            if (r14 != 0) goto L61
            java.lang.String r14 = "info null err"
            java.lang.Object[] r15 = new java.lang.Object[r4]
            java.lang.String.format(r14, r15)
            goto L9d
        L61:
            java.lang.String r15 = r13.mHostname
            java.lang.String r0 = r14.mIpList
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r4] = r15
            r1[r5] = r0
            java.lang.String r15 = "****parse suc for host:%s iplist:%s"
            java.lang.String.format(r15, r1)
            com.bykv.vk.component.ttvideo.mediakit.net.IPCache r15 = com.bykv.vk.component.ttvideo.mediakit.net.IPCache.getInstance()
            java.lang.String r0 = r13.mHostname
            r15.put(r0, r14)
            r13.notifySuccess(r14)
            return
        L7d:
            com.bykv.vk.component.ttvideo.mediakit.net.Error r14 = new com.bykv.vk.component.ttvideo.mediakit.net.Error
            int r15 = r13.mHttpDNSType
            java.lang.String r0 = r13.mHostname
            java.lang.String r1 = r13.mId
            java.lang.Integer r2 = java.lang.Integer.valueOf(r15)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r4] = r2
            java.lang.String r2 = "HTTP dns empty, type:%d"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r14.<init>(r15, r0, r1, r2)
            java.lang.String r14 = "json null err"
            java.lang.Object[] r15 = new java.lang.Object[r4]
            java.lang.String.format(r14, r15)
        L9d:
            java.lang.String r14 = r13.mHostname
            java.lang.Object[] r15 = new java.lang.Object[r5]
            r15[r4] = r14
            java.lang.String r14 = "****parse failed for host:%s"
            java.lang.String.format(r14, r15)
            r13.notifyError(r6)
            return
    }

    static /* synthetic */ void access$000(com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNS r0, org.json.JSONObject r1, com.bykv.vk.component.ttvideo.mediakit.net.Error r2) {
            r0._handleResponse(r1, r2)
            return
    }

    private com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo parserResult(org.json.JSONObject r20) {
            r19 = this;
            r1 = r19
            r2 = r20
            java.lang.String r3 = "data"
            java.lang.String r4 = "TTL"
            java.lang.String r5 = "type"
            int r0 = r1.mHttpDNSType
            java.lang.String r6 = ","
            r7 = 0
            java.lang.String r8 = "receive expiredtime:%d force expiredtime:%d "
            r9 = 1
            java.lang.String r10 = ""
            r12 = 60
            r13 = 2
            if (r0 == r13) goto L25
            if (r0 != r9) goto L1c
            goto L25
        L1c:
            r14 = 0
            r0 = 0
            r16 = 0
            r18 = 0
            goto Lbc
        L25:
            if (r2 == 0) goto L2d
            int r0 = r2.length()
            if (r0 != 0) goto L31
        L2d:
            r16 = 0
            goto L15a
        L31:
            java.lang.String r0 = "ttl"
            boolean r14 = r2.has(r0)
            if (r14 == 0) goto L3d
            int r12 = r2.optInt(r0)
        L3d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)
            int r14 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalForceExpiredTime
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            java.lang.Object[] r15 = new java.lang.Object[r13]
            r15[r7] = r0
            r15[r9] = r14
            java.lang.String.format(r8, r15)
            int r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalForceExpiredTime
            if (r0 <= 0) goto L55
            r12 = r0
        L55:
            long r14 = java.lang.System.currentTimeMillis()
            int r0 = r12 * 1000
            r17 = r12
            r16 = 0
            long r11 = (long) r0
            long r14 = r14 + r11
            java.lang.String r0 = "ips"
            org.json.JSONArray r11 = r2.optJSONArray(r0)
            if (r11 == 0) goto L15a
            int r0 = r11.length()
            if (r0 != 0) goto L71
            goto L15a
        L71:
            r0 = r16
            r12 = 0
            r18 = 0
        L76:
            int r7 = r11.length()
            if (r12 >= r7) goto Lba
            java.lang.String r0 = r11.getString(r12)     // Catch: java.lang.Exception -> L81
            goto L87
        L81:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            r0 = r16
        L87:
            boolean r7 = android.text.TextUtils.isEmpty(r0)
            if (r7 != 0) goto Lb7
            boolean r7 = android.text.TextUtils.isEmpty(r10)
            if (r7 == 0) goto La4
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
        La2:
            r10 = r7
            goto Lb7
        La4:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r10)
            r7.append(r6)
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            goto La2
        Lb7:
            int r12 = r12 + 1
            goto L76
        Lba:
            r12 = r17
        Lbc:
            int r7 = r1.mHttpDNSType
            r11 = 3
            if (r7 != r11) goto L147
            java.lang.String r7 = "Answer"
            org.json.JSONArray r2 = r2.getJSONArray(r7)     // Catch: java.lang.Exception -> Le9
            r7 = 0
        Lc8:
            int r11 = r2.length()     // Catch: java.lang.Exception -> Le9
            if (r7 >= r11) goto L126
            org.json.JSONObject r11 = r2.getJSONObject(r7)     // Catch: java.lang.Exception -> Le9
            boolean r14 = r11.has(r5)     // Catch: java.lang.Exception -> Le9
            if (r14 == 0) goto L123
            int r14 = r11.getInt(r5)     // Catch: java.lang.Exception -> Le9
            if (r14 != r9) goto L123
            boolean r14 = r11.has(r4)     // Catch: java.lang.Exception -> Le9
            if (r14 == 0) goto Leb
            int r12 = r11.optInt(r4)     // Catch: java.lang.Exception -> Le9
            goto Leb
        Le9:
            r0 = move-exception
            goto L14a
        Leb:
            boolean r14 = r11.has(r3)     // Catch: java.lang.Exception -> Le9
            if (r14 == 0) goto Lf5
            java.lang.String r0 = r11.optString(r3)     // Catch: java.lang.Exception -> Le9
        Lf5:
            boolean r11 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> Le9
            if (r11 != 0) goto L123
            boolean r11 = android.text.TextUtils.isEmpty(r10)     // Catch: java.lang.Exception -> Le9
            if (r11 == 0) goto L111
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le9
            r11.<init>()     // Catch: java.lang.Exception -> Le9
            r11.append(r10)     // Catch: java.lang.Exception -> Le9
            r11.append(r0)     // Catch: java.lang.Exception -> Le9
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Exception -> Le9
            goto L123
        L111:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> Le9
            r11.<init>()     // Catch: java.lang.Exception -> Le9
            r11.append(r10)     // Catch: java.lang.Exception -> Le9
            r11.append(r6)     // Catch: java.lang.Exception -> Le9
            r11.append(r0)     // Catch: java.lang.Exception -> Le9
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Exception -> Le9
        L123:
            int r7 = r7 + 1
            goto Lc8
        L126:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r12)     // Catch: java.lang.Exception -> Le9
            int r2 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalForceExpiredTime     // Catch: java.lang.Exception -> Le9
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Exception -> Le9
            java.lang.Object[] r3 = new java.lang.Object[r13]     // Catch: java.lang.Exception -> Le9
            r3[r18] = r0     // Catch: java.lang.Exception -> Le9
            r3[r9] = r2     // Catch: java.lang.Exception -> Le9
            java.lang.String.format(r8, r3)     // Catch: java.lang.Exception -> Le9
            int r0 = com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSParser.mGlobalForceExpiredTime     // Catch: java.lang.Exception -> Le9
            if (r0 <= 0) goto L13e
            r12 = r0
        L13e:
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> Le9
            int r12 = r12 * 1000
            long r4 = (long) r12
            long r14 = r2 + r4
        L147:
            r5 = r10
            r6 = r14
            goto L14e
        L14a:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return r16
        L14e:
            com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo r2 = new com.bykv.vk.component.ttvideo.mediakit.net.AVMDLDNSInfo
            int r3 = r1.mHttpDNSType
            java.lang.String r4 = r1.mHostname
            java.lang.String r8 = r1.mId
            r2.<init>(r3, r4, r5, r6, r8)
            return r2
        L15a:
            return r16
    }

    @Override // com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS
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

    @Override // com.bykv.vk.component.ttvideo.mediakit.net.BaseDNS
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
            com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNS$1 r5 = new com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNS$1
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
            com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNS$2 r2 = new com.bykv.vk.component.ttvideo.mediakit.net.HTTPDNS$2
            r2.<init>(r7)
            r3 = 0
            r0.startTask(r1, r3, r2)
            return
    }
}

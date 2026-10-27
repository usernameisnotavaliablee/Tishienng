package com.bykv.vk.component.ttvideo.network;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class DnsHelper {
    private static final java.lang.String TAG = "DnsHelper";
    private static final int UPDATE_PEROID = 300000;
    private static volatile long mServerIPTime;
    private volatile com.bykv.vk.component.ttvideo.network.DnsHelper.OnParseCompletionListener mCompletionListener;
    private android.content.Context mContext;
    private final java.util.concurrent.ExecutorService mExecutor;
    private int mExpiredTime;
    private java.util.concurrent.Future mFuture;
    private java.lang.String mHttpDNSServerHost;
    private volatile boolean mIsForceHttp;
    private volatile boolean mIsTTNetHttp;
    private final com.bykv.vk.component.ttvideo.INetworkClient mNetworkClient;
    public volatile java.lang.String mServerIP;




    public interface OnParseCompletionListener {
        void onParseComplete(java.lang.String r1, java.lang.String r2, com.bykv.vk.component.ttvideo.log.LiveError r3, boolean r4);
    }

    private static final class URLHostIndex {
        int authEnd;
        int hostEnd;
        int hostStart;

        URLHostIndex(int r1, int r2, int r3) {
                r0 = this;
                r0.<init>()
                r0.hostStart = r1
                r0.hostEnd = r2
                r0.authEnd = r3
                return
        }
    }

    public DnsHelper(android.content.Context r3, java.util.concurrent.ExecutorService r4, com.bykv.vk.component.ttvideo.INetworkClient r5) {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mIsForceHttp = r0
            r1 = 0
            r2.mHttpDNSServerHost = r1
            r2.mIsTTNetHttp = r0
            r0 = 600000(0x927c0, float:8.40779E-40)
            r2.mExpiredTime = r0
            r2.mContext = r3
            r2.mExecutor = r4
            r2.mNetworkClient = r5
            return
    }

    static /* synthetic */ void access$000(com.bykv.vk.component.ttvideo.network.DnsHelper r0, java.lang.String r1) {
            r0.doHttpDns(r1)
            return
    }

    static /* synthetic */ void access$100(com.bykv.vk.component.ttvideo.network.DnsHelper r0, java.lang.String r1) {
            r0.doLocalDns(r1)
            return
    }

    static /* synthetic */ void access$200(com.bykv.vk.component.ttvideo.network.DnsHelper r0, boolean r1, java.lang.String r2, java.lang.String r3, com.bykv.vk.component.ttvideo.log.LiveError r4, boolean r5) {
            r0.notifyParseComplete(r1, r2, r3, r4, r5)
            return
    }

    static /* synthetic */ long access$302(long r0) {
            com.bykv.vk.component.ttvideo.network.DnsHelper.mServerIPTime = r0
            return r0
    }

    private void doHttpDns(java.lang.String r5) {
            r4 = this;
            java.lang.String r0 = r4.getURL(r5)
            com.bykv.vk.component.ttvideo.INetworkClient r1 = r4.mNetworkClient
            java.lang.String r2 = r4.mHttpDNSServerHost
            com.bykv.vk.component.ttvideo.network.DnsHelper$2 r3 = new com.bykv.vk.component.ttvideo.network.DnsHelper$2
            r3.<init>(r4, r5)
            com.bykv.vk.component.ttvideo.network.NetworkManager.doRequest(r1, r0, r2, r3)
            return
    }

    private void doLocalDns(java.lang.String r15) {
            r14 = this;
            r1 = -100010(0xfffffffffffe7956, float:NaN)
            java.net.InetAddress r0 = java.net.InetAddress.getByName(r15)     // Catch: java.net.UnknownHostException -> L38
            if (r0 != 0) goto L1a
            com.bykv.vk.component.ttvideo.log.LiveError r6 = new com.bykv.vk.component.ttvideo.log.LiveError
            java.lang.String r0 = ""
            r2 = 0
            r6.<init>(r1, r0, r2)
            r5 = 0
            r7 = 1
            r3 = 0
            r2 = r14
            r4 = r15
            r2.notifyParseComplete(r3, r4, r5, r6, r7)
            return
        L1a:
            r10 = r15
            java.lang.String r15 = r0.getHostAddress()
            boolean r0 = r0 instanceof java.net.Inet6Address
            if (r0 == 0) goto L2f
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r15
            java.lang.String r15 = "[%s]"
            java.lang.String r15 = java.lang.String.format(r15, r0)
        L2f:
            r11 = r15
            r12 = 0
            r13 = 1
            r9 = 0
            r8 = r14
            r8.notifyParseComplete(r9, r10, r11, r12, r13)
            return
        L38:
            r0 = move-exception
            r10 = r15
            r15 = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = "reason"
            java.lang.String r3 = "Unknown host name"
            r0.put(r2, r3)
            java.lang.String r2 = "host"
            r0.put(r2, r10)
            java.lang.String r2 = "exception"
            java.lang.String r15 = r15.toString()
            r0.put(r2, r15)
            com.bykv.vk.component.ttvideo.log.LiveError r12 = new com.bykv.vk.component.ttvideo.log.LiveError
            java.lang.String r15 = "Unknown Host"
            r12.<init>(r1, r15, r0)
            r11 = 0
            r13 = 1
            r9 = 0
            r8 = r14
            r8.notifyParseComplete(r9, r10, r11, r12, r13)
            return
    }

    private java.lang.String getURL(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = r3.mHttpDNSServerHost
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r4
            java.lang.String r4 = "https://%s/q?host=%s"
            java.lang.String r4 = java.lang.String.format(r4, r1)
            return r4
    }

    private static com.bykv.vk.component.ttvideo.network.DnsHelper.URLHostIndex getURLHostIndex(java.lang.String r7) {
            if (r7 == 0) goto L43
            int r0 = r7.length()
            if (r0 != 0) goto L9
            goto L43
        L9:
            java.lang.String r0 = "://"
            int r0 = r7.indexOf(r0)
            int r0 = r0 + 3
            int r1 = r7.length()
            r2 = -1
            r3 = r0
            r4 = -1
        L18:
            if (r0 >= r1) goto L3a
            char r5 = r7.charAt(r0)
            r6 = 35
            if (r5 == r6) goto L3a
            r6 = 47
            if (r5 == r6) goto L3a
            r6 = 58
            if (r5 == r6) goto L36
            r6 = 63
            if (r5 == r6) goto L3a
            r6 = 64
            if (r5 == r6) goto L33
            goto L37
        L33:
            int r3 = r0 + 1
            goto L37
        L36:
            r4 = r0
        L37:
            int r0 = r0 + 1
            goto L18
        L3a:
            if (r4 != r2) goto L3d
            r4 = r0
        L3d:
            com.bykv.vk.component.ttvideo.network.DnsHelper$URLHostIndex r7 = new com.bykv.vk.component.ttvideo.network.DnsHelper$URLHostIndex
            r7.<init>(r3, r4, r0)
            return r7
        L43:
            r7 = 0
            return r7
    }

    public static java.lang.String getUrlHost(java.lang.String r2) {
            if (r2 == 0) goto L16
            int r0 = r2.length()
            if (r0 != 0) goto L9
            goto L16
        L9:
            com.bykv.vk.component.ttvideo.network.DnsHelper$URLHostIndex r0 = getURLHostIndex(r2)
            int r1 = r0.hostStart
            int r0 = r0.hostEnd
            java.lang.String r2 = r2.substring(r1, r0)
            return r2
        L16:
            r2 = 0
            return r2
    }

    public static java.lang.String hostToIPUrl(java.lang.String r5, java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L7a
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L7a
            com.bykv.vk.component.ttvideo.network.DnsHelper$URLHostIndex r0 = getURLHostIndex(r5)
            java.lang.String r1 = "http"
            boolean r1 = r5.startsWith(r1)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r3 = 0
            int r4 = r0.hostStart
            java.lang.String r3 = r5.substring(r3, r4)
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            int r2 = r0.hostEnd
            int r3 = r0.authEnd
            r4 = -1
            if (r3 == r4) goto L4c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r6)
            int r6 = r0.hostEnd
            int r3 = r0.authEnd
            java.lang.String r6 = r5.substring(r6, r3)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            int r2 = r0.authEnd
        L4c:
            if (r1 != 0) goto L66
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r6 = "/"
            r0.append(r6)
            java.lang.String r6 = getUrlHost(r5)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
        L66:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r6)
            java.lang.String r5 = r5.substring(r2)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
        L7a:
            r5 = 0
            return r5
    }

    public static boolean isIP(java.lang.String r2) {
            if (r2 == 0) goto L29
            int r0 = r2.length()
            r1 = 7
            if (r0 < r1) goto L29
            int r0 = r2.length()
            r1 = 15
            if (r0 > r1) goto L29
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L1a
            goto L29
        L1a:
            java.lang.String r0 = "([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r2 = r0.matcher(r2)
            boolean r2 = r2.find()
            return r2
        L29:
            r2 = 0
            return r2
    }

    private void notifyParseComplete(boolean r4, java.lang.String r5, java.lang.String r6, com.bykv.vk.component.ttvideo.log.LiveError r7, boolean r8) {
            r3 = this;
            boolean r0 = r3.mIsForceHttp
            if (r0 != r4) goto L27
            com.bykv.vk.component.ttvideo.network.DnsHelper$OnParseCompletionListener r4 = r3.mCompletionListener
            if (r4 != 0) goto L9
            goto L27
        L9:
            if (r8 == 0) goto L24
            if (r6 == 0) goto L24
            com.bykv.vk.component.ttvideo.network.IPCache$IpInfo r0 = new com.bykv.vk.component.ttvideo.network.IPCache$IpInfo
            r0.<init>()
            long r1 = java.lang.System.currentTimeMillis()
            r0.iptime = r1
            r0.ipaddr = r6
            r1 = 0
            r0.needUpdate = r1
            com.bykv.vk.component.ttvideo.network.IPCache r1 = com.bykv.vk.component.ttvideo.network.IPCache.getInstance()
            r1.put(r5, r0)
        L24:
            r4.onParseComplete(r5, r6, r7, r8)
        L27:
            return
    }

    public void cancel() {
            r3 = this;
            r0 = 0
            r3.mCompletionListener = r0
            java.util.concurrent.Future r1 = r3.mFuture
            if (r1 == 0) goto L15
            boolean r1 = r1.isDone()
            if (r1 != 0) goto L15
            java.util.concurrent.Future r1 = r3.mFuture
            r2 = 1
            r1.cancel(r2)
            r3.mFuture = r0
        L15:
            return
    }

    public void configure(boolean r1, java.lang.String r2) {
            r0 = this;
            if (r1 == 0) goto L16
            com.bykv.vk.component.ttvideo.INetworkClient r1 = r0.mNetworkClient
            if (r1 == 0) goto L16
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L16
            java.lang.String r1 = "null"
            boolean r1 = r2.equals(r1)
            if (r1 != 0) goto L16
            r1 = 1
            goto L17
        L16:
            r1 = 0
        L17:
            r0.mIsForceHttp = r1
            r0.mHttpDNSServerHost = r2
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            boolean r2 = r0.mIsForceHttp
            r1.append(r2)
            java.lang.String r2 = r0.mHttpDNSServerHost
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "DnsHelper"
            com.bytedance.sdk.component.utils.vl.j(r2, r1)
            return
    }

    public java.lang.String getDNSServerIP() {
            r1 = this;
            r1.updateDNSServerIP()
            java.lang.String r0 = r1.mServerIP
            return r0
    }

    public void parseDns(java.lang.String r10, com.bykv.vk.component.ttvideo.network.DnsHelper.OnParseCompletionListener r11) {
            r9 = this;
            boolean r3 = android.text.TextUtils.isEmpty(r10)
            if (r3 != 0) goto L97
            if (r11 != 0) goto La
            goto L97
        La:
            java.util.concurrent.ExecutorService r3 = r9.mExecutor
            if (r3 == 0) goto L8f
            boolean r3 = r9.mIsForceHttp
            r9.cancel()
            r9.mCompletionListener = r11
            android.content.Context r1 = r9.mContext
            android.net.NetworkInfo r1 = com.bykv.vk.component.ttvideo.network.NetUtils.getNetworkInfo(r1)
            r4 = -1
            if (r1 == 0) goto L29
            boolean r5 = r1.isAvailable()
            if (r5 == 0) goto L29
            int r1 = r1.getType()
            goto L2a
        L29:
            r1 = -1
        L2a:
            com.bykv.vk.component.ttvideo.network.IPCache r5 = com.bykv.vk.component.ttvideo.network.IPCache.getInstance()
            int r5 = r5.getCurNetType()
            if (r1 == r4) goto L36
            if (r1 == r5) goto L44
        L36:
            com.bykv.vk.component.ttvideo.network.IPCache r4 = com.bykv.vk.component.ttvideo.network.IPCache.getInstance()
            r4.clear()
            com.bykv.vk.component.ttvideo.network.IPCache r4 = com.bykv.vk.component.ttvideo.network.IPCache.getInstance()
            r4.setCurNetType(r1)
        L44:
            com.bykv.vk.component.ttvideo.network.IPCache r1 = com.bykv.vk.component.ttvideo.network.IPCache.getInstance()
            com.bykv.vk.component.ttvideo.network.IPCache$IpInfo r1 = r1.get(r10)
            if (r1 == 0) goto L6f
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = r1.iptime
            long r4 = r4 - r6
            int r6 = r9.mExpiredTime
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 > 0) goto L6f
            boolean r4 = r1.needUpdate
            if (r4 != 0) goto L6f
            boolean r3 = r9.mIsForceHttp
            java.lang.String r1 = r1.ipaddr
            r4 = 0
            r5 = 0
            r0 = r3
            r3 = r1
            r1 = r0
            r0 = r9
            r2 = r10
            r0.notifyParseComplete(r1, r2, r3, r4, r5)
            return
        L6f:
            java.util.concurrent.ExecutorService r1 = r9.mExecutor
            boolean r1 = r1.isShutdown()
            if (r1 != 0) goto L85
            java.util.concurrent.ExecutorService r1 = r9.mExecutor
            com.bykv.vk.component.ttvideo.network.DnsHelper$1 r4 = new com.bykv.vk.component.ttvideo.network.DnsHelper$1
            r4.<init>(r9, r3, r10)
            java.util.concurrent.Future r1 = r1.submit(r4)
            r9.mFuture = r1
            return
        L85:
            r4 = 0
            r5 = 0
            r1 = 0
            r3 = 0
            r0 = r9
            r2 = r10
            r0.notifyParseComplete(r1, r2, r3, r4, r5)
            return
        L8f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "mExecutor should not be null"
            r0.<init>(r1)
            throw r0
        L97:
            return
    }

    public void updateDNSServerIP() {
            r5 = this;
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r2 = com.bykv.vk.component.ttvideo.network.DnsHelper.mServerIPTime
            long r0 = r0 - r2
            r2 = 300000(0x493e0, double:1.482197E-318)
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto Lf
            goto L21
        Lf:
            java.util.concurrent.ExecutorService r0 = r5.mExecutor
            boolean r0 = r0.isShutdown()
            if (r0 != 0) goto L21
            java.util.concurrent.ExecutorService r0 = r5.mExecutor
            com.bykv.vk.component.ttvideo.network.DnsHelper$3 r1 = new com.bykv.vk.component.ttvideo.network.DnsHelper$3
            r1.<init>(r5)
            r0.submit(r1)
        L21:
            return
    }
}

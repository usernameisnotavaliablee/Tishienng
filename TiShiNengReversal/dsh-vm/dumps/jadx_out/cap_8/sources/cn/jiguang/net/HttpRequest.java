package cn.jiguang.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HttpRequest {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f1362b;

    /* renamed from: c, reason: collision with root package name */
    private int f1363c;

    /* renamed from: d, reason: collision with root package name */
    private int f1364d;

    /* renamed from: e, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.lang.String> f1365e;

    /* renamed from: f, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.lang.String> f1366f;

    /* renamed from: g, reason: collision with root package name */
    private java.lang.Object f1367g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f1368h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f1369i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f1370j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f1371k;
    private boolean l;
    private boolean m;
    private javax.net.ssl.X509TrustManager n;
    private boolean o;
    private javax.net.ssl.HostnameVerifier p;

    public HttpRequest(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f1371k = r0
            r0 = 0
            r1.l = r0
            r1.m = r0
            r1.a = r2
            r2 = -1
            r1.f1363c = r2
            r1.f1364d = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f1366f = r2
            return
    }

    public HttpRequest(java.lang.String r2, java.util.Map<java.lang.String, java.lang.String> r3) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.f1371k = r0
            r0 = 0
            r1.l = r0
            r1.m = r0
            r1.a = r2
            r1.f1365e = r3
            r2 = -1
            r1.f1363c = r2
            r1.f1364d = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f1366f = r2
            return
    }

    public java.lang.Object getBody() {
            r1 = this;
            java.lang.Object r0 = r1.f1367g
            return r0
    }

    public int getConnectTimeout() {
            r1 = this;
            int r0 = r1.f1363c
            return r0
    }

    public javax.net.ssl.HostnameVerifier getHostnameVerifier() {
            r1 = this;
            javax.net.ssl.HostnameVerifier r0 = r1.p
            return r0
    }

    public byte[] getParas() {
            r2 = this;
            java.lang.Object r0 = r2.f1367g
            if (r0 == 0) goto L20
            boolean r1 = r0 instanceof java.lang.String
            if (r1 == 0) goto L19
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L20
            java.lang.Object r0 = r2.f1367g
            java.lang.String r0 = (java.lang.String) r0
            byte[] r0 = r0.getBytes()
            return r0
        L19:
            boolean r1 = r0 instanceof byte[]
            if (r1 == 0) goto L20
            byte[] r0 = (byte[]) r0
            return r0
        L20:
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f1365e
            java.lang.String r0 = cn.jiguang.net.HttpUtils.joinParasWithEncodedValue(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L31
            byte[] r0 = r0.getBytes()
            return r0
        L31:
            r0 = 0
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getParasMap() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f1365e
            return r0
    }

    public int getReadTimeout() {
            r1 = this;
            int r0 = r1.f1364d
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> getRequestProperties() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f1366f
            return r0
    }

    public java.lang.String getRequestProperty(java.lang.String r2) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f1366f
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    public javax.net.ssl.X509TrustManager getSslTrustManager() {
            r1 = this;
            javax.net.ssl.X509TrustManager r0 = r1.n
            return r0
    }

    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = r1.f1362b
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public boolean isDoInPut() {
            r1 = this;
            boolean r0 = r1.f1369i
            return r0
    }

    public boolean isDoOutPut() {
            r1 = this;
            boolean r0 = r1.f1368h
            return r0
    }

    public boolean isHaveRspData() {
            r1 = this;
            boolean r0 = r1.f1371k
            return r0
    }

    public boolean isNeedErrorInput() {
            r1 = this;
            boolean r0 = r1.m
            return r0
    }

    public boolean isNeedRetryIfHttpsFailed() {
            r1 = this;
            boolean r0 = r1.o
            return r0
    }

    public boolean isRspDatazip() {
            r1 = this;
            boolean r0 = r1.l
            return r0
    }

    public boolean isUseCaches() {
            r1 = this;
            boolean r0 = r1.f1370j
            return r0
    }

    public void setBody(java.lang.Object r1) {
            r0 = this;
            r0.f1367g = r1
            return
    }

    public void setConnectTimeout(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.f1363c = r2
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "timeout can not be negative"
            r2.<init>(r0)
            throw r2
    }

    public void setDoInPut(boolean r1) {
            r0 = this;
            r0.f1369i = r1
            return
    }

    public void setDoOutPut(boolean r1) {
            r0 = this;
            r0.f1368h = r1
            return
    }

    public void setHaveRspData(boolean r1) {
            r0 = this;
            r0.f1371k = r1
            return
    }

    public void setHostnameVerifier(javax.net.ssl.HostnameVerifier r1) {
            r0 = this;
            r0.p = r1
            return
    }

    public void setNeedErrorInput(boolean r1) {
            r0 = this;
            r0.m = r1
            return
    }

    public void setNeedRetryIfHttpsFailed(boolean r1) {
            r0 = this;
            r0.o = r1
            return
    }

    public void setParasMap(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.f1365e = r1
            return
    }

    public void setReadTimeout(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.f1364d = r2
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "timeout can not be negative"
            r2.<init>(r0)
            throw r2
    }

    public void setRequestProperties(java.util.Map<java.lang.String, java.lang.String> r1) {
            r0 = this;
            r0.f1366f = r1
            return
    }

    public void setRequestProperty(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.f1366f
            r0.put(r2, r3)
            return
    }

    public void setRspDatazip(boolean r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public void setSslTrustManager(javax.net.ssl.X509TrustManager r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public void setType(java.lang.String r1) {
            r0 = this;
            r0.f1362b = r1
            return
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public void setUseCaches(boolean r1) {
            r0 = this;
            r0.f1370j = r1
            return
    }

    public void setUserAgent(java.lang.String r3) {
            r2 = this;
            java.util.Map<java.lang.String, java.lang.String> r0 = r2.f1366f
            java.lang.String r1 = "User-Agent"
            r0.put(r1, r3)
            return
    }
}

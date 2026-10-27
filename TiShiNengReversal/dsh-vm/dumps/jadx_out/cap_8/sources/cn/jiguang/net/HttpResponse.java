package cn.jiguang.net;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class HttpResponse {
    private java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.String f1372b;

    /* renamed from: c, reason: collision with root package name */
    private java.util.Map<java.lang.String, java.lang.Object> f1373c;

    /* renamed from: d, reason: collision with root package name */
    private int f1374d;

    /* renamed from: e, reason: collision with root package name */
    private long f1375e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f1376f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f1377g;

    /* renamed from: h, reason: collision with root package name */
    private int f1378h;

    /* renamed from: i, reason: collision with root package name */
    private int f1379i;

    public HttpResponse() {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1378h = r0
            r1.f1379i = r0
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.f1373c = r0
            return
    }

    public HttpResponse(java.lang.String r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.f1378h = r0
            r1.f1379i = r0
            r1.a = r2
            r2 = 0
            r1.f1374d = r2
            r1.f1376f = r2
            r1.f1377g = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r1.f1373c = r2
            return
    }

    private int a() {
            r4 = this;
            r0 = -1
            java.util.Map<java.lang.String, java.lang.Object> r1 = r4.f1373c     // Catch: java.lang.Exception -> L30
            java.lang.String r2 = "cache-control"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> L30
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L30
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L30
            if (r2 != 0) goto L30
            java.lang.String r2 = "max-age="
            int r2 = r1.indexOf(r2)     // Catch: java.lang.Exception -> L30
            if (r2 == r0) goto L30
            java.lang.String r3 = ","
            int r3 = r1.indexOf(r3, r2)     // Catch: java.lang.Exception -> L30
            int r2 = r2 + 8
            if (r3 == r0) goto L28
            java.lang.String r1 = r1.substring(r2, r3)     // Catch: java.lang.Exception -> L30
            goto L2c
        L28:
            java.lang.String r1 = r1.substring(r2)     // Catch: java.lang.Exception -> L30
        L2c:
            int r0 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Exception -> L30
        L30:
            return r0
    }

    private long b() {
            r5 = this;
            int r0 = r5.a()
            r1 = -1
            if (r0 == r1) goto L10
            long r1 = java.lang.System.currentTimeMillis()
            int r0 = r0 * 1000
            long r3 = (long) r0
            long r1 = r1 + r3
            return r1
        L10:
            java.lang.String r0 = r5.getExpiresHeader()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L23
            java.lang.String r0 = r5.getExpiresHeader()
            long r0 = cn.jiguang.net.HttpUtils.parseGmtTime(r0)
            return r0
        L23:
            r0 = -1
            return r0
    }

    public long getExpiredTime() {
            r2 = this;
            boolean r0 = r2.f1377g
            if (r0 == 0) goto L7
            long r0 = r2.f1375e
            return r0
        L7:
            r0 = 1
            r2.f1377g = r0
            long r0 = r2.b()
            r2.f1375e = r0
            return r0
    }

    public java.lang.String getExpiresHeader() {
            r3 = this;
            r0 = 0
            java.util.Map<java.lang.String, java.lang.Object> r1 = r3.f1373c     // Catch: java.lang.Exception -> Lf
            if (r1 != 0) goto L6
            return r0
        L6:
            java.lang.String r2 = "expires"
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Exception -> Lf
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> Lf
            return r1
        Lf:
            return r0
    }

    public java.lang.String getResponseBody() {
            r1 = this;
            java.lang.String r0 = r1.f1372b
            return r0
    }

    public int getResponseCode() {
            r1 = this;
            int r0 = r1.f1378h
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.Object> getResponseHeaders() {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f1373c
            return r0
    }

    public int getStatusCode() {
            r1 = this;
            int r0 = r1.f1379i
            return r0
    }

    public int getType() {
            r1 = this;
            int r0 = r1.f1374d
            return r0
    }

    public java.lang.String getUrl() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    public boolean isExpired() {
            r5 = this;
            long r0 = java.lang.System.currentTimeMillis()
            long r2 = r5.f1375e
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public boolean isInCache() {
            r1 = this;
            boolean r0 = r1.f1376f
            return r0
    }

    public void setExpiredTime(long r2) {
            r1 = this;
            r0 = 1
            r1.f1377g = r0
            r1.f1375e = r2
            return
    }

    public cn.jiguang.net.HttpResponse setInCache(boolean r1) {
            r0 = this;
            r0.f1376f = r1
            return r0
    }

    public void setResponseBody(java.lang.String r1) {
            r0 = this;
            r0.f1372b = r1
            return
    }

    public void setResponseCode(int r1) {
            r0 = this;
            r0.f1378h = r1
            return
    }

    public void setResponseHeader(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.util.Map<java.lang.String, java.lang.Object> r0 = r1.f1373c
            if (r0 == 0) goto L7
            r0.put(r2, r3)
        L7:
            return
    }

    public void setResponseHeaders(java.util.Map<java.lang.String, java.lang.Object> r1) {
            r0 = this;
            r0.f1373c = r1
            return
    }

    public void setStatusCode(int r1) {
            r0 = this;
            r0.f1379i = r1
            return
    }

    public void setType(int r2) {
            r1 = this;
            if (r2 < 0) goto L5
            r1.f1374d = r2
            return
        L5:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "The type of HttpResponse cannot be smaller than 0."
            r2.<init>(r0)
            throw r2
    }

    public void setUrl(java.lang.String r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "HttpResponse{responseBody='"
            r0.append(r1)
            java.lang.String r1 = r2.f1372b
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", responseCode="
            r0.append(r1)
            int r1 = r2.f1378h
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

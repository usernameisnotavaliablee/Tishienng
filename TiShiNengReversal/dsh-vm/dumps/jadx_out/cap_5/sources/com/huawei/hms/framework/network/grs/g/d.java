package com.huawei.hms.framework.network.grs.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d {
    private static final java.lang.String o = "d";
    private java.util.Map<java.lang.String, java.util.List<java.lang.String>> a;
    private byte[] b;
    private int c;
    private long d;
    private long e;
    private long f;
    private java.lang.String g;
    private int h;
    private int i;
    private java.lang.String j;
    private long k;
    private java.lang.String l;
    private java.lang.Exception m;
    private java.lang.String n;

    public d(int r4, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r5, byte[] r6, long r7) {
            r3 = this;
            r3.<init>()
            r0 = 2
            r3.h = r0
            r0 = 9001(0x2329, float:1.2613E-41)
            r3.i = r0
            java.lang.String r0 = ""
            r3.j = r0
            r1 = 0
            r3.k = r1
            r3.l = r0
            r3.c = r4
            r3.a = r5
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r6)
            byte[] r4 = r4.array()
            r3.b = r4
            r3.d = r7
            r3.H()
            return
    }

    public d(java.lang.Exception r4, long r5) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.c = r0
            r0 = 2
            r3.h = r0
            r0 = 9001(0x2329, float:1.2613E-41)
            r3.i = r0
            java.lang.String r0 = ""
            r3.j = r0
            r1 = 0
            r3.k = r1
            r3.l = r0
            r3.m = r4
            r3.d = r5
            return
    }

    private void E() {
            r10 = this;
            java.lang.String r0 = "errorList"
            java.lang.String r1 = "errorDesc"
            java.lang.String r2 = "errorCode"
            java.lang.String r3 = "resultCode"
            java.lang.String r4 = "isSuccess"
            boolean r5 = r10.B()
            r6 = 1
            if (r5 == 0) goto L1c
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "GRSSDK get httpcode{304} not any changed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r10.l(r6)
            return
        L1c:
            boolean r5 = r10.D()
            r7 = 2
            if (r5 != 0) goto L2e
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "GRSSDK parse server body all failed."
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r10.l(r7)
            return
        L2e:
            r5 = 0
            byte[] r8 = r10.b     // Catch: org.json.JSONException -> L47
            java.lang.String r8 = com.huawei.hms.framework.common.StringUtils.byte2Str(r8)     // Catch: org.json.JSONException -> L47
            org.json.JSONObject r9 = new org.json.JSONObject     // Catch: org.json.JSONException -> L47
            r9.<init>(r8)     // Catch: org.json.JSONException -> L47
            boolean r8 = r9.has(r4)     // Catch: org.json.JSONException -> L47
            if (r8 == 0) goto L4a
            int r3 = r9.getInt(r4)     // Catch: org.json.JSONException -> L47
            if (r3 != r6) goto L58
            goto L56
        L47:
            r0 = move-exception
            goto Lba
        L4a:
            boolean r4 = r9.has(r3)     // Catch: org.json.JSONException -> L47
            if (r4 == 0) goto L5a
            int r3 = r9.getInt(r3)     // Catch: org.json.JSONException -> L47
            if (r3 != 0) goto L58
        L56:
            r3 = 1
            goto L62
        L58:
            r3 = 2
            goto L62
        L5a:
            java.lang.String r3 = com.huawei.hms.framework.network.grs.g.d.o     // Catch: org.json.JSONException -> L47
            java.lang.String r4 = "sth. wrong because server errorcode's key."
            com.huawei.hms.framework.common.Logger.e(r3, r4)     // Catch: org.json.JSONException -> L47
            r3 = -1
        L62:
            java.lang.String r4 = "services"
            if (r3 == r6) goto L6d
            boolean r8 = r9.has(r4)     // Catch: org.json.JSONException -> L47
            if (r8 == 0) goto L6d
            r3 = 0
        L6d:
            r10.l(r3)     // Catch: org.json.JSONException -> L47
            java.lang.String r8 = ""
            if (r3 == r6) goto L95
            if (r3 != 0) goto L77
            goto L95
        L77:
            boolean r0 = r9.has(r2)     // Catch: org.json.JSONException -> L47
            if (r0 == 0) goto L82
            int r0 = r9.getInt(r2)     // Catch: org.json.JSONException -> L47
            goto L84
        L82:
            r0 = 9001(0x2329, float:1.2613E-41)
        L84:
            r10.g(r0)     // Catch: org.json.JSONException -> L47
            boolean r0 = r9.has(r1)     // Catch: org.json.JSONException -> L47
            if (r0 == 0) goto L91
            java.lang.String r8 = r9.getString(r1)     // Catch: org.json.JSONException -> L47
        L91:
            r10.q(r8)     // Catch: org.json.JSONException -> L47
            return
        L95:
            boolean r1 = r9.has(r4)     // Catch: org.json.JSONException -> L47
            if (r1 == 0) goto La4
            org.json.JSONObject r1 = r9.getJSONObject(r4)     // Catch: org.json.JSONException -> L47
            java.lang.String r1 = r1.toString()     // Catch: org.json.JSONException -> L47
            goto La5
        La4:
            r1 = r8
        La5:
            r10.u(r1)     // Catch: org.json.JSONException -> L47
            boolean r1 = r9.has(r0)     // Catch: org.json.JSONException -> L47
            if (r1 == 0) goto Lb6
            org.json.JSONObject r0 = r9.getJSONObject(r0)     // Catch: org.json.JSONException -> L47
            java.lang.String r8 = r0.toString()     // Catch: org.json.JSONException -> L47
        Lb6:
            r10.s(r8)     // Catch: org.json.JSONException -> L47
            return
        Lba:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r5] = r0
            java.lang.String r0 = "GrsResponse GrsResponse(String result) JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r1, r0, r2)
            r10.l(r7)
            return
    }

    private void F() {
            r4 = this;
            boolean r0 = r4.D()
            if (r0 != 0) goto L13
            boolean r0 = r4.C()
            if (r0 != 0) goto L13
            boolean r0 = r4.B()
            if (r0 != 0) goto L13
            goto L43
        L13:
            java.util.Map r0 = r4.G()
            int r1 = r0.size()
            if (r1 > 0) goto L25
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "parseHeader {headers.size() <= 0}"
            com.huawei.hms.framework.common.Logger.w(r0, r1)
            return
        L25:
            boolean r1 = r4.D()     // Catch: org.json.JSONException -> L32
            if (r1 != 0) goto L34
            boolean r1 = r4.B()     // Catch: org.json.JSONException -> L32
            if (r1 == 0) goto L3a
            goto L34
        L32:
            r0 = move-exception
            goto L44
        L34:
            r4.j(r0)     // Catch: org.json.JSONException -> L32
            r4.e(r0)     // Catch: org.json.JSONException -> L32
        L3a:
            boolean r1 = r4.C()     // Catch: org.json.JSONException -> L32
            if (r1 == 0) goto L43
            r4.o(r0)     // Catch: org.json.JSONException -> L32
        L43:
            return
        L44:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            java.lang.String r0 = "parseHeader catch JSONException: %s"
            com.huawei.hms.framework.common.Logger.w(r1, r0, r2)
            return
    }

    private java.util.Map<java.lang.String, java.lang.String> G() {
            r5 = this;
            java.util.HashMap r0 = new java.util.HashMap
            r1 = 16
            r0.<init>(r1)
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r5.a
            if (r1 == 0) goto L49
            int r1 = r1.size()
            if (r1 > 0) goto L12
            goto L49
        L12:
            java.util.Map<java.lang.String, java.util.List<java.lang.String>> r1 = r5.a
            java.util.Set r1 = r1.entrySet()
            java.util.Iterator r1 = r1.iterator()
        L1c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            java.util.Iterator r2 = r2.iterator()
        L38:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L1c
            java.lang.Object r4 = r2.next()
            java.lang.String r4 = (java.lang.String) r4
            r0.put(r3, r4)
            goto L38
        L48:
            return r0
        L49:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r2 = "parseRespHeaders {respHeaders == null} or {respHeaders.size() <= 0}"
            com.huawei.hms.framework.common.Logger.v(r1, r2)
            return r0
    }

    private void H() {
            r0 = this;
            r0.F()
            r0.E()
            return
    }

    private void e(java.util.Map<java.lang.String, java.lang.String> r3) {
            r2 = this;
            java.lang.String r0 = "ETag"
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L27
            java.lang.Object r3 = r3.get(r0)
            java.lang.String r3 = (java.lang.String) r3
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L1f
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "success get Etag from server"
            com.huawei.hms.framework.common.Logger.i(r0, r1)
            r2.d(r3)
            return
        L1f:
            java.lang.String r3 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r0 = "The Response Heads Etag is Empty"
            com.huawei.hms.framework.common.Logger.i(r3, r0)
            return
        L27:
            java.lang.String r3 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r0 = "Response Heads has not Etag"
            com.huawei.hms.framework.common.Logger.i(r3, r0)
            return
    }

    private void g(int r1) {
            r0 = this;
            r0.i = r1
            return
    }

    private void j(java.util.Map<java.lang.String, java.lang.String> r12) {
            r11 = this;
            java.lang.String r0 = "Cache-Control"
            boolean r1 = r12.containsKey(r0)
            r2 = 0
            r3 = 1
            r4 = 1000(0x3e8, double:4.94E-321)
            r6 = 0
            if (r1 == 0) goto L4d
            java.lang.Object r12 = r12.get(r0)
            java.lang.String r12 = (java.lang.String) r12
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 != 0) goto Laf
            java.lang.String r0 = "max-age="
            boolean r1 = r12.contains(r0)
            if (r1 == 0) goto Laf
            int r0 = r12.indexOf(r0)     // Catch: java.lang.NumberFormatException -> L43
            int r0 = r0 + 8
            java.lang.String r12 = r12.substring(r0)     // Catch: java.lang.NumberFormatException -> L43
            long r0 = java.lang.Long.parseLong(r12)     // Catch: java.lang.NumberFormatException -> L43
            java.lang.String r12 = com.huawei.hms.framework.network.grs.g.d.o     // Catch: java.lang.NumberFormatException -> L41
            java.lang.String r8 = "Cache-Control value{%s}"
            java.lang.Long r9 = java.lang.Long.valueOf(r0)     // Catch: java.lang.NumberFormatException -> L41
            java.lang.Object[] r10 = new java.lang.Object[r3]     // Catch: java.lang.NumberFormatException -> L41
            r10[r2] = r9     // Catch: java.lang.NumberFormatException -> L41
            com.huawei.hms.framework.common.Logger.v(r12, r8, r10)     // Catch: java.lang.NumberFormatException -> L41
            goto Lb0
        L41:
            r12 = move-exception
            goto L45
        L43:
            r12 = move-exception
            r0 = r6
        L45:
            java.lang.String r8 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r9 = "getExpireTime addHeadersToResult NumberFormatException"
            com.huawei.hms.framework.common.Logger.w(r8, r9, r12)
            goto Lb0
        L4d:
            java.lang.String r0 = "Expires"
            boolean r1 = r12.containsKey(r0)
            if (r1 == 0) goto La8
            java.lang.Object r0 = r12.get(r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.Object[] r8 = new java.lang.Object[r3]
            r8[r2] = r0
            java.lang.String r9 = "expires is{%s}"
            com.huawei.hms.framework.common.Logger.v(r1, r9, r8)
            java.text.SimpleDateFormat r1 = new java.text.SimpleDateFormat
            java.util.Locale r8 = java.util.Locale.ROOT
            java.lang.String r9 = "EEE, d MMM yyyy HH:mm:ss 'GMT'"
            r1.<init>(r9, r8)
            java.lang.String r8 = "Date"
            boolean r9 = r12.containsKey(r8)
            if (r9 == 0) goto L7e
            java.lang.Object r12 = r12.get(r8)
            java.lang.String r12 = (java.lang.String) r12
            goto L7f
        L7e:
            r12 = 0
        L7f:
            java.util.Date r0 = r1.parse(r0)     // Catch: java.text.ParseException -> L8f
            boolean r8 = android.text.TextUtils.isEmpty(r12)     // Catch: java.text.ParseException -> L8f
            if (r8 == 0) goto L91
            java.util.Date r12 = new java.util.Date     // Catch: java.text.ParseException -> L8f
            r12.<init>()     // Catch: java.text.ParseException -> L8f
            goto L95
        L8f:
            r12 = move-exception
            goto La0
        L91:
            java.util.Date r12 = r1.parse(r12)     // Catch: java.text.ParseException -> L8f
        L95:
            long r0 = r0.getTime()     // Catch: java.text.ParseException -> L8f
            long r8 = r12.getTime()     // Catch: java.text.ParseException -> L8f
            long r0 = r0 - r8
            long r0 = r0 / r4
            goto Lb0
        La0:
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "getExpireTime ParseException."
            com.huawei.hms.framework.common.Logger.w(r0, r1, r12)
            goto Laf
        La8:
            java.lang.String r12 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r0 = "response headers neither contains Cache-Control nor Expires."
            com.huawei.hms.framework.common.Logger.i(r12, r0)
        Laf:
            r0 = r6
        Lb0:
            int r12 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r12 <= 0) goto Lbb
            r6 = 2592000(0x278d00, double:1.280618E-317)
            int r12 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r12 <= 0) goto Lbe
        Lbb:
            r0 = 86400(0x15180, double:4.26873E-319)
        Lbe:
            long r0 = r0 * r4
            java.lang.String r12 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.Long r4 = java.lang.Long.valueOf(r0)
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r4
            java.lang.String r2 = "convert expireTime{%s}"
            com.huawei.hms.framework.common.Logger.i(r12, r2, r3)
            long r2 = java.lang.System.currentTimeMillis()
            long r0 = r0 + r2
            java.lang.String r12 = java.lang.String.valueOf(r0)
            r11.n(r12)
            return
    }

    private void l(int r1) {
            r0 = this;
            r0.h = r1
            return
    }

    private void m(long r1) {
            r0 = this;
            r0.k = r1
            return
    }

    private void n(java.lang.String r1) {
            r0 = this;
            r0.j = r1
            return
    }

    private void o(java.util.Map<java.lang.String, java.lang.String> r6) {
            r5 = this;
            java.lang.String r0 = "Retry-After"
            boolean r1 = r6.containsKey(r0)
            if (r1 == 0) goto L21
            java.lang.Object r6 = r6.get(r0)
            java.lang.String r6 = (java.lang.String) r6
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L21
            long r0 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> L19
            goto L23
        L19:
            r6 = move-exception
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.String r1 = "getRetryAfter addHeadersToResult NumberFormatException"
            com.huawei.hms.framework.common.Logger.w(r0, r1, r6)
        L21:
            r0 = 0
        L23:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            java.lang.String r6 = com.huawei.hms.framework.network.grs.g.d.o
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r2
            java.lang.String r2 = "convert retry-afterTime{%s}"
            com.huawei.hms.framework.common.Logger.v(r6, r2, r3)
            r5.m(r0)
            return
    }

    private void q(java.lang.String r1) {
            r0 = this;
            return
    }

    private void s(java.lang.String r1) {
            r0 = this;
            return
    }

    private void u(java.lang.String r1) {
            r0 = this;
            r0.g = r1
            return
    }

    public java.lang.String A() {
            r1 = this;
            java.lang.String r0 = r1.n
            return r0
    }

    public boolean B() {
            r2 = this;
            int r0 = r2.c
            r1 = 304(0x130, float:4.26E-43)
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean C() {
            r2 = this;
            int r0 = r2.c
            r1 = 503(0x1f7, float:7.05E-43)
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean D() {
            r2 = this;
            int r0 = r2.c
            r1 = 200(0xc8, float:2.8E-43)
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public java.lang.String a() {
            r1 = this;
            java.lang.String r0 = r1.j
            return r0
    }

    public void b(int r1) {
            r0 = this;
            return
    }

    public void c(long r1) {
            r0 = this;
            r0.f = r1
            return
    }

    public void d(java.lang.String r1) {
            r0 = this;
            r0.l = r1
            return
    }

    public int f() {
            r1 = this;
            int r0 = r1.c
            return r0
    }

    public void h(long r1) {
            r0 = this;
            r0.e = r1
            return
    }

    public void i(java.lang.String r1) {
            r0 = this;
            r0.n = r1
            return
    }

    public int k() {
            r1 = this;
            int r0 = r1.i
            return r0
    }

    public java.lang.Exception p() {
            r1 = this;
            java.lang.Exception r0 = r1.m
            return r0
    }

    public java.lang.String r() {
            r1 = this;
            java.lang.String r0 = r1.l
            return r0
    }

    public int t() {
            r1 = this;
            int r0 = r1.h
            return r0
    }

    public long v() {
            r2 = this;
            long r0 = r2.f
            return r0
    }

    public long w() {
            r2 = this;
            long r0 = r2.e
            return r0
    }

    public long x() {
            r2 = this;
            long r0 = r2.d
            return r0
    }

    public java.lang.String y() {
            r1 = this;
            java.lang.String r0 = r1.g
            return r0
    }

    public long z() {
            r2 = this;
            long r0 = r2.k
            return r0
    }
}

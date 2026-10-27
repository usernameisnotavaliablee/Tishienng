package xyz.adscope.common.network;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class Headers extends xyz.adscope.common.network.util.ListMap<java.lang.String, java.lang.String> {
    public static final java.lang.String KEY_ACCEPT = "Accept";
    public static final java.lang.String KEY_ACCEPT_ENCODING = "Accept-Encoding";
    public static final java.lang.String KEY_ACCEPT_LANGUAGE = "Accept-Language";
    public static final java.lang.String KEY_ACCEPT_RANGE = "Accept-Range";
    public static final java.lang.String KEY_CACHE_CONTROL = "Cache-Control";
    public static final java.lang.String KEY_CONNECTION = "Connection";
    public static final java.lang.String KEY_CONTENT_DISPOSITION = "Content-Disposition";
    public static final java.lang.String KEY_CONTENT_ENCODING = "Content-Encoding";
    public static final java.lang.String KEY_CONTENT_LENGTH = "Content-Length";
    public static final java.lang.String KEY_CONTENT_RANGE = "Content-Range";
    public static final java.lang.String KEY_CONTENT_TYPE = "Content-Type";
    public static final java.lang.String KEY_COOKIE = "Cookie";
    public static final java.lang.String KEY_DATE = "Date";
    public static final java.lang.String KEY_EXPIRES = "Expires";
    public static final java.lang.String KEY_E_TAG = "ETag";
    public static final java.lang.String KEY_HOST = "Host";
    public static final java.lang.String KEY_IF_MODIFIED_SINCE = "If-Modified-Since";
    public static final java.lang.String KEY_IF_NONE_MATCH = "If-None-Match";
    public static final java.lang.String KEY_LAST_MODIFIED = "Last-Modified";
    public static final java.lang.String KEY_LOCATION = "Location";
    public static final java.lang.String KEY_RANGE = "Range";
    public static final java.lang.String KEY_SET_COOKIE = "Set-Cookie";
    public static final java.lang.String KEY_USER_AGENT = "User-Agent";
    public static final java.lang.String TIME_FORMAT_HTTP = "EEE, dd MMM y HH:mm:ss 'GMT'";
    public static final java.util.TimeZone TIME_ZONE_GMT = null;
    public static final java.lang.String VALUE_ACCEPT_ALL = "*/*";
    public static final java.lang.String VALUE_ACCEPT_ENCODING = "gzip, deflate";
    public static final java.lang.String VALUE_ACCEPT_LANGUAGE = null;
    public static final java.lang.String VALUE_APPLICATION_FORM = "multipart/form-data";
    public static final java.lang.String VALUE_APPLICATION_JSON = "application/json";
    public static final java.lang.String VALUE_APPLICATION_STREAM = "application/octet-stream";
    public static final java.lang.String VALUE_APPLICATION_URLENCODED = "application/x-www-form-urlencoded";
    public static final java.lang.String VALUE_APPLICATION_XML = "application/xml";
    public static final java.lang.String VALUE_CLOSE = "close";
    public static final java.lang.String VALUE_KEEP_ALIVE = "keep-alive";
    public static final java.lang.String VALUE_USER_AGENT = null;


    static {
            java.lang.String r0 = "GMT"
            java.util.TimeZone r0 = java.util.TimeZone.getTimeZone(r0)
            xyz.adscope.common.network.Headers.TIME_ZONE_GMT = r0
            java.lang.String r0 = getLanguage()
            xyz.adscope.common.network.Headers.VALUE_ACCEPT_LANGUAGE = r0
            java.lang.String r0 = getUserAgent()
            xyz.adscope.common.network.Headers.VALUE_USER_AGENT = r0
            return
    }

    public Headers() {
            r2 = this;
            java.util.TreeMap r0 = new java.util.TreeMap
            xyz.adscope.common.network.Headers$1 r1 = new xyz.adscope.common.network.Headers$1
            r1.<init>()
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    private long a(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = r2.getFirst2(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto Lf
            long r0 = formatGMTToMillis(r3)     // Catch: java.text.ParseException -> Lf
            return r0
        Lf:
            r0 = 0
            return r0
    }

    public static long analysisCacheExpires(xyz.adscope.common.network.Headers r14) {
            long r0 = java.lang.System.currentTimeMillis()
            java.lang.String r2 = r14.getCacheControl()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            r4 = 0
            if (r3 != 0) goto L76
            java.util.StringTokenizer r3 = new java.util.StringTokenizer
            java.lang.String r6 = ","
            r3.<init>(r2, r6)
            r6 = r4
            r8 = r6
        L19:
            boolean r10 = r3.hasMoreTokens()
            if (r10 == 0) goto L78
            java.lang.String r10 = r3.nextToken()
            java.lang.String r10 = r10.trim()
            java.util.Locale r11 = java.util.Locale.getDefault()
            java.lang.String r10 = r10.toLowerCase(r11)
            java.lang.String r11 = "no-cache"
            boolean r11 = r10.equals(r11)
            if (r11 != 0) goto L75
            java.lang.String r11 = "no-store"
            boolean r11 = r10.equals(r11)
            if (r11 == 0) goto L40
            goto L75
        L40:
            java.lang.String r11 = "max-age="
            boolean r11 = r10.startsWith(r11)
            r12 = 1000(0x3e8, double:4.94E-321)
            if (r11 == 0) goto L57
            r6 = 8
            java.lang.String r6 = r10.substring(r6)
            long r6 = java.lang.Long.parseLong(r6)
            long r6 = r6 * r12
            goto L19
        L57:
            java.lang.String r11 = "must-revalidate"
            boolean r11 = r10.startsWith(r11)
            if (r11 == 0) goto L60
            return r4
        L60:
            java.lang.String r11 = "stale-while-revalidate="
            boolean r11 = r10.startsWith(r11)
            if (r11 == 0) goto L19
            r8 = 23
            java.lang.String r8 = r10.substring(r8)
            long r8 = java.lang.Long.parseLong(r8)
            long r8 = r8 * r12
            goto L19
        L75:
            return r4
        L76:
            r6 = r4
            r8 = r6
        L78:
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L85
            long r0 = r0 + r6
            int r14 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r14 <= 0) goto L84
            long r0 = r0 + r8
        L84:
            return r0
        L85:
            long r2 = r14.getExpires()
            long r6 = r14.getDate()
            int r14 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r14 <= 0) goto L94
            long r0 = r0 + r2
            long r0 = r0 - r6
            return r0
        L94:
            return r4
    }

    public static long formatGMTToMillis(java.lang.String r3) {
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "EEE, dd MMM y HH:mm:ss 'GMT'"
            r0.<init>(r2, r1)
            java.util.TimeZone r1 = xyz.adscope.common.network.Headers.TIME_ZONE_GMT
            r0.setTimeZone(r1)
            java.util.Date r3 = r0.parse(r3)
            long r0 = r3.getTime()
            return r0
    }

    public static java.lang.String formatKey(java.lang.String r8) {
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            if (r0 == 0) goto L8
            r8 = 0
            return r8
        L8:
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r8 = r8.toLowerCase(r0)
            java.lang.String r0 = "-"
            java.lang.String[] r8 = r8.split(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r8.length
            r3 = 0
            r4 = 0
        L1c:
            if (r4 >= r2) goto L3b
            r5 = r8[r4]
            r6 = 1
            java.lang.String r7 = r5.substring(r3, r6)
            java.lang.String r5 = r5.substring(r6)
            java.util.Locale r6 = java.util.Locale.ENGLISH
            java.lang.String r6 = r7.toUpperCase(r6)
            r1.append(r6)
            r1.append(r5)
            r1.append(r0)
            int r4 = r4 + 1
            goto L1c
        L3b:
            int r8 = r1.length()
            if (r8 <= 0) goto L48
            int r8 = r1.lastIndexOf(r0)
            r1.deleteCharAt(r8)
        L48:
            java.lang.String r8 = r1.toString()
            return r8
    }

    public static java.lang.String formatMillisToGMT(long r2) {
            java.util.Date r0 = new java.util.Date
            r0.<init>(r2)
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat
            java.util.Locale r3 = java.util.Locale.US
            java.lang.String r1 = "EEE, dd MMM y HH:mm:ss 'GMT'"
            r2.<init>(r1, r3)
            java.util.TimeZone r3 = xyz.adscope.common.network.Headers.TIME_ZONE_GMT
            r2.setTimeZone(r3)
            java.lang.String r2 = r2.format(r0)
            return r2
    }

    public static xyz.adscope.common.network.Headers fromJSONString(java.lang.String r6) {
            xyz.adscope.common.network.Headers r0 = new xyz.adscope.common.network.Headers
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>(r6)
            java.util.Iterator r6 = r1.keys()
        Le:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L34
            java.lang.Object r2 = r6.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = r1.optString(r2)
            org.json.JSONArray r4 = new org.json.JSONArray
            r4.<init>(r3)
            r3 = 0
        L24:
            int r5 = r4.length()
            if (r3 >= r5) goto Le
            java.lang.String r5 = r4.optString(r3)
            r0.add2(r2, r5)
            int r3 = r3 + 1
            goto L24
        L34:
            return r0
    }

    public static java.util.List<java.net.HttpCookie> getHttpCookieList(xyz.adscope.common.network.Headers r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Set r1 = r4.keySet()
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3d
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r3 = "Set-Cookie"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto Ld
            java.util.List r2 = r4.get2(r2)
            java.util.Iterator r2 = r2.iterator()
        L29:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto Ld
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.util.List r3 = java.net.HttpCookie.parse(r3)
            r0.addAll(r3)
            goto L29
        L3d:
            return r0
    }

    public static java.lang.String getLanguage() {
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r1 = r0.getLanguage()
            java.lang.String r0 = r0.getCountry()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r0)
            if (r3 != 0) goto L27
            r3 = 45
            r2.append(r3)
            r2.append(r0)
            r0 = 44
            r2.append(r0)
            r2.append(r1)
        L27:
            java.lang.String r0 = r2.toString()
            return r0
    }

    public static java.util.Map<java.lang.String, java.lang.String> getRequestHeaders(xyz.adscope.common.network.Headers r4) {
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2f
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            java.lang.String r3 = "; "
            java.lang.String r1 = android.text.TextUtils.join(r3, r1)
            r0.put(r2, r1)
            goto Ld
        L2f:
            return r0
    }

    public static java.lang.String getUserAgent() {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.lang.String r1 = android.os.Build.VERSION.RELEASE
            r0.append(r1)
            java.lang.String r1 = "; "
            r0.append(r1)
            java.util.Locale r2 = java.util.Locale.getDefault()
            java.lang.String r3 = r2.getLanguage()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 == 0) goto L3b
            java.lang.String r3 = r3.toLowerCase(r2)
            r0.append(r3)
            java.lang.String r3 = r2.getCountry()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L40
            java.lang.String r4 = "-"
            r0.append(r4)
            java.lang.String r2 = r3.toLowerCase(r2)
            r0.append(r2)
            goto L40
        L3b:
            java.lang.String r2 = "en"
            r0.append(r2)
        L40:
            java.lang.String r2 = android.os.Build.VERSION.CODENAME
            java.lang.String r3 = "REL"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto L58
            java.lang.String r2 = android.os.Build.MODEL
            int r3 = r2.length()
            if (r3 <= 0) goto L58
            r0.append(r1)
            r0.append(r2)
        L58:
            java.lang.String r1 = android.os.Build.ID
            int r2 = r1.length()
            if (r2 <= 0) goto L68
            java.lang.String r2 = " Api/"
            r0.append(r2)
            r0.append(r1)
        L68:
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r0
            java.lang.String r0 = "Mobile "
            r2 = 1
            r1[r2] = r0
            java.lang.String r0 = "Mozilla/5.0 (Linux; U; Android %s) AppleWebKit/534.30 (KHTML, like Gecko) Version/5.0 %sSafari/534.30"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            return r0
    }

    public static java.lang.String parseSubValue(java.lang.String r3, java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L3f
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L3f
            java.util.StringTokenizer r0 = new java.util.StringTokenizer
            java.lang.String r1 = ";"
            r0.<init>(r3, r1)
        L13:
            boolean r3 = r0.hasMoreElements()
            if (r3 == 0) goto L3f
            java.lang.String r3 = r0.nextToken()
            r1 = 61
            int r1 = r3.indexOf(r1)
            if (r1 <= 0) goto L13
            r2 = 0
            java.lang.String r2 = r3.substring(r2, r1)
            java.lang.String r2 = r2.trim()
            boolean r2 = r4.equalsIgnoreCase(r2)
            if (r2 == 0) goto L13
            int r1 = r1 + 1
            java.lang.String r3 = r3.substring(r1)
            java.lang.String r3 = r3.trim()
            return r3
        L3f:
            return r5
    }

    public static java.lang.String toJSONString(xyz.adscope.common.network.Headers r4) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L30
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            java.util.List r1 = (java.util.List) r1
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>(r1)
            r0.put(r2, r3)     // Catch: org.json.JSONException -> L2e
            goto Ld
        L2e:
            goto Ld
        L30:
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // xyz.adscope.common.network.util.ListMap
    public /* bridge */ /* synthetic */ void add(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            r0.add2(r1, r2)
            return
    }

    @Override // xyz.adscope.common.network.util.ListMap
    public /* bridge */ /* synthetic */ void add(java.lang.String r1, java.util.List<java.lang.String> r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.add2(r1, r2)
            return
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L13
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L13
            java.lang.String r2 = formatKey(r2)
            super.add(r2, r3)
        L13:
            return
    }

    /* renamed from: add, reason: avoid collision after fix types in other method */
    public void add2(java.lang.String r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L13
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L13
            java.lang.String r2 = formatKey(r2)
            super.add(r2, r3)
        L13:
            return
    }

    public void add(xyz.adscope.common.network.Headers r4) {
            r3 = this;
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Exception -> L34
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L34
        L8:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L34
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Exception -> L34
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Exception -> L34
            java.lang.Object r1 = r0.getKey()     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L34
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Exception -> L34
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L34
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Exception -> L34
        L24:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Exception -> L34
            if (r2 == 0) goto L8
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L34
            r3.add2(r1, r2)     // Catch: java.lang.Exception -> L34
            goto L24
        L34:
            return
    }

    @Override // xyz.adscope.common.network.util.ListMap
    public /* bridge */ /* synthetic */ boolean containsKey(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = r0.containsKey2(r1)
            return r1
    }

    /* renamed from: containsKey, reason: avoid collision after fix types in other method */
    public boolean containsKey2(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = formatKey(r1)
            boolean r1 = super.containsKey(r1)
            return r1
    }

    @Override // xyz.adscope.common.network.util.ListMap
    public /* bridge */ /* synthetic */ java.util.List<java.lang.String> get(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r1 = r0.get2(r1)
            return r1
    }

    /* renamed from: get, reason: avoid collision after fix types in other method */
    public java.util.List<java.lang.String> get2(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = formatKey(r1)
            java.util.List r1 = super.get(r1)
            return r1
    }

    public java.lang.String getCacheControl() {
            r2 = this;
            java.lang.String r0 = "Cache-Control"
            java.util.List r0 = r2.get2(r0)
            if (r0 != 0) goto La
            java.util.List r0 = java.util.Collections.EMPTY_LIST
        La:
            java.lang.String r1 = ","
            java.lang.String r0 = android.text.TextUtils.join(r1, r0)
            return r0
    }

    public java.lang.String getContentDisposition() {
            r1 = this;
            java.lang.String r0 = "Content-Disposition"
            java.lang.String r0 = r1.getFirst2(r0)
            return r0
    }

    public java.lang.String getContentEncoding() {
            r1 = this;
            java.lang.String r0 = "Content-Encoding"
            java.lang.String r0 = r1.getFirst2(r0)
            return r0
    }

    public long getContentLength() {
            r2 = this;
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r2.getFirst2(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto Le
            java.lang.String r0 = "0"
        Le:
            long r0 = java.lang.Long.parseLong(r0)
            return r0
    }

    public java.lang.String getContentRange() {
            r1 = this;
            java.lang.String r0 = "Content-Range"
            java.lang.String r0 = r1.getFirst2(r0)
            return r0
    }

    public java.lang.String getContentType() {
            r1 = this;
            java.lang.String r0 = "Content-Type"
            java.lang.String r0 = r1.getFirst2(r0)
            return r0
    }

    public long getDate() {
            r2 = this;
            java.lang.String r0 = "Date"
            long r0 = r2.a(r0)
            return r0
    }

    public java.lang.String getETag() {
            r1 = this;
            java.lang.String r0 = "ETag"
            java.lang.String r0 = r1.getFirst2(r0)
            return r0
    }

    public long getExpires() {
            r2 = this;
            java.lang.String r0 = "Expires"
            long r0 = r2.a(r0)
            return r0
    }

    @Override // xyz.adscope.common.network.util.ListMap
    public /* bridge */ /* synthetic */ java.lang.String getFirst(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r1 = r0.getFirst2(r1)
            return r1
    }

    /* renamed from: getFirst, reason: avoid collision after fix types in other method */
    public java.lang.String getFirst2(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = formatKey(r1)
            java.lang.Object r1 = super.getFirst(r1)
            java.lang.String r1 = (java.lang.String) r1
            return r1
    }

    public long getLastModified() {
            r2 = this;
            java.lang.String r0 = "Last-Modified"
            long r0 = r2.a(r0)
            return r0
    }

    public java.lang.String getLocation() {
            r1 = this;
            java.lang.String r0 = "Location"
            java.lang.String r0 = r1.getFirst2(r0)
            return r0
    }

    @Override // xyz.adscope.common.network.util.ListMap
    public /* bridge */ /* synthetic */ java.util.List<java.lang.String> remove(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.util.List r1 = r0.remove2(r1)
            return r1
    }

    /* renamed from: remove, reason: avoid collision after fix types in other method */
    public java.util.List<java.lang.String> remove2(java.lang.String r1) {
            r0 = this;
            java.lang.String r1 = formatKey(r1)
            java.util.List r1 = super.remove(r1)
            return r1
    }

    @Override // xyz.adscope.common.network.util.ListMap
    public /* bridge */ /* synthetic */ void set(java.lang.String r1, java.lang.String r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = (java.lang.String) r2
            r0.set2(r1, r2)
            return
    }

    @Override // xyz.adscope.common.network.util.ListMap
    public /* bridge */ /* synthetic */ void set(java.lang.String r1, java.util.List<java.lang.String> r2) {
            r0 = this;
            java.lang.String r1 = (java.lang.String) r1
            r0.set2(r1, r2)
            return
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public void set2(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L13
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L13
            java.lang.String r2 = formatKey(r2)
            super.set(r2, r3)
        L13:
            return
    }

    /* renamed from: set, reason: avoid collision after fix types in other method */
    public void set2(java.lang.String r2, java.util.List<java.lang.String> r3) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L13
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L13
            java.lang.String r2 = formatKey(r2)
            super.set(r2, r3)
        L13:
            return
    }

    public void set(xyz.adscope.common.network.Headers r3) {
            r2 = this;
            java.util.Set r3 = r3.entrySet()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r2.set2(r1, r0)
            goto L8
        L24:
            return
    }
}

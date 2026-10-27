package cn.jiguang.w;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    public static java.lang.String a;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.String f1539b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.String f1540c = null;

    /* renamed from: d, reason: collision with root package name */
    private static java.util.LinkedList<java.lang.String> f1541d;





    static {
            r0 = 34
            byte[] r0 = new byte[r0]
            r0 = {x0034: FILL_ARRAY_DATA , data: [121, 68, 84, 105, 123, 44, 62, 31, 67, 124, 59, 115, 38, 5, 68, 44, 38, 124, 97, 69, 83, 113, 38, 117, 127, 31, 87, 112, 39, 122, 124, 95, 80, 106} // fill-array
            java.lang.String r0 = cn.jiguang.av.k.b(r0)
            cn.jiguang.w.b.f1539b = r0
            r1 = 39
            byte[] r1 = new byte[r1]
            r1 = {x004a: FILL_ARRAY_DATA , data: [126, 101, 68, 80, 106, 50, 57, 62, 83, 69, 42, 109, 33, 36, 84, 21, 52, 97, 102, 103, 6, 14, 115, 120, 99, 98, 88, 14, 122, 102, 57, 102, 89, 15, 117, 101, 121, 97, 67} // fill-array
            java.lang.String r1 = cn.jiguang.av.k.b(r1)
            cn.jiguang.w.b.f1540c = r1
            java.lang.String r2 = ""
            cn.jiguang.w.b.a = r2
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            cn.jiguang.w.b.f1541d = r2
            r2.clear()
            java.util.LinkedList<java.lang.String> r2 = cn.jiguang.w.b.f1541d
            r2.add(r0)
            java.util.LinkedList<java.lang.String> r0 = cn.jiguang.w.b.f1541d
            r0.add(r1)
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    private static long a(java.lang.String r5) {
            r0 = 0
            if (r5 == 0) goto L43
            int r2 = r5.length()     // Catch: java.lang.Throwable -> L26
            r3 = 23
            if (r2 <= r3) goto L43
            r2 = 0
            java.lang.String r5 = r5.substring(r2, r3)     // Catch: java.lang.Throwable -> L26
            java.text.SimpleDateFormat r2 = new java.text.SimpleDateFormat     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = "yyyy-MM-dd HH:mm:ss.SSS"
            java.util.Locale r4 = java.util.Locale.ENGLISH     // Catch: java.lang.Throwable -> L26
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L26
            java.util.Date r5 = r2.parse(r5)     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto L28
            long r0 = r5.getTime()     // Catch: java.lang.Throwable -> L26
            return r0
        L26:
            r5 = move-exception
            goto L29
        L28:
            return r0
        L29:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Error parsing timestamp from log: "
            r2.append(r3)
            java.lang.String r5 = r5.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            java.lang.String r2 = "LogFileHelper"
            cn.jiguang.w.f.i(r2, r5)
        L43:
            return r0
    }

    public static java.lang.String a(android.content.Context r12, long r13) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.io.File r1 = r12.getFilesDir()
            r0.append(r1)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r2 = cn.jiguang.w.e.a
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r2 = r1.exists()
            java.lang.String r3 = "LogFileHelper"
            if (r2 == 0) goto Lcf
            boolean r2 = r1.isDirectory()
            if (r2 != 0) goto L32
            goto Lcf
        L32:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            cn.jiguang.w.b$3 r2 = new cn.jiguang.w.b$3     // Catch: java.lang.Throwable -> La5
            r2.<init>()     // Catch: java.lang.Throwable -> La5
            java.io.File[] r1 = r1.listFiles(r2)     // Catch: java.lang.Throwable -> La5
            if (r1 == 0) goto Lc1
            int r2 = r1.length     // Catch: java.lang.Throwable -> La5
            if (r2 <= 0) goto Lc1
            cn.jiguang.w.b$4 r2 = new cn.jiguang.w.b$4     // Catch: java.lang.Throwable -> La5
            r2.<init>()     // Catch: java.lang.Throwable -> La5
            java.util.Arrays.sort(r1, r2)     // Catch: java.lang.Throwable -> La5
            int r2 = r1.length     // Catch: java.lang.Throwable -> La5
            r4 = 0
            r5 = r13
        L50:
            if (r4 >= r2) goto Lc0
            r7 = r1[r4]     // Catch: java.lang.Throwable -> L7d
            java.io.BufferedReader r8 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            java.io.FileReader r9 = new java.io.FileReader     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            r9.<init>(r7)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
        L5e:
            java.lang.String r7 = r8.readLine()     // Catch: java.lang.Throwable -> L75
            if (r7 == 0) goto L79
            long r9 = a(r7)     // Catch: java.lang.Throwable -> L75
            int r11 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r11 <= 0) goto L77
            r0.append(r7)     // Catch: java.lang.Throwable -> L75
            java.lang.String r7 = "\n"
            r0.append(r7)     // Catch: java.lang.Throwable -> L75
            goto L77
        L75:
            r7 = move-exception
            goto L81
        L77:
            r5 = r9
            goto L5e
        L79:
            r8.close()     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
            goto La2
        L7d:
            r13 = move-exception
            goto La8
        L7f:
            r7 = move-exception
            goto L8a
        L81:
            r8.close()     // Catch: java.lang.Throwable -> L85
            goto L89
        L85:
            r8 = move-exception
            r7.addSuppressed(r8)     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
        L89:
            throw r7     // Catch: java.lang.Throwable -> L7d java.io.IOException -> L7f
        L8a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7d
            r8.<init>()     // Catch: java.lang.Throwable -> L7d
            java.lang.String r9 = "Error reading log file: "
            r8.append(r9)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r7 = r7.getMessage()     // Catch: java.lang.Throwable -> L7d
            r8.append(r7)     // Catch: java.lang.Throwable -> L7d
            java.lang.String r7 = r8.toString()     // Catch: java.lang.Throwable -> L7d
            cn.jiguang.w.f.i(r3, r7)     // Catch: java.lang.Throwable -> L7d
        La2:
            int r4 = r4 + 1
            goto L50
        La5:
            r1 = move-exception
            r5 = r13
            r13 = r1
        La8:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r1 = "Error merging logs: "
            r14.append(r1)
            java.lang.String r13 = r13.getMessage()
            r14.append(r13)
            java.lang.String r13 = r14.toString()
            cn.jiguang.w.f.i(r3, r13)
        Lc0:
            r13 = r5
        Lc1:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lca
            cn.jiguang.e.c.a(r12, r13)
        Lca:
            java.lang.String r12 = r0.toString()
            return r12
        Lcf:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "Log directory does not exist or is not a directory: "
            r12.append(r13)
            r12.append(r0)
            java.lang.String r12 = r12.toString()
            cn.jiguang.w.f.i(r3, r12)
            java.lang.String r12 = ""
            return r12
    }

    public static java.lang.String a(android.content.Context r14, java.lang.String r15) {
            java.lang.String r0 = "data"
            java.lang.String r1 = "application/json"
            java.lang.String r2 = "LogFileHelper"
            java.lang.String r3 = ""
            java.lang.String r4 = cn.jiguang.v.a.a(r14)     // Catch: java.lang.Throwable -> L18
            boolean r5 = android.text.TextUtils.isEmpty(r4)     // Catch: java.lang.Throwable -> L18
            if (r5 == 0) goto L1b
            java.lang.String r14 = "request upload token failed because can't get appKey"
            cn.jiguang.w.f.i(r2, r14)     // Catch: java.lang.Throwable -> L18
            return r3
        L18:
            r14 = move-exception
            goto L19f
        L1b:
            java.util.LinkedList<java.lang.String> r5 = cn.jiguang.w.b.f1541d     // Catch: java.lang.Throwable -> L18
            cn.jiguang.av.v.a(r14, r5)     // Catch: java.lang.Throwable -> L18
            java.util.LinkedList<java.lang.String> r5 = cn.jiguang.w.b.f1541d     // Catch: java.lang.Throwable -> L18
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L18
        L26:
            boolean r6 = r5.hasNext()     // Catch: java.lang.Throwable -> L18
            if (r6 == 0) goto L19e
            java.lang.Object r6 = r5.next()     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L18
            long r7 = cn.jiguang.d.a.f(r14)     // Catch: java.lang.Throwable -> L18
            r9 = 0
            r11 = 0
            int r12 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r12 != 0) goto L43
            java.lang.String r14 = "request l config failed because can't get uid"
            cn.jiguang.w.f.i(r2, r14)     // Catch: java.lang.Throwable -> L18
            return r11
        L43:
            java.lang.String r9 = cn.jiguang.d.a.j(r14)     // Catch: java.lang.Throwable -> L18
            boolean r10 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L18
            if (r10 == 0) goto L53
            java.lang.String r14 = "request l config failed because need register first"
            cn.jiguang.w.f.i(r2, r14)     // Catch: java.lang.Throwable -> L18
            return r11
        L53:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L18
            r10.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r12 = "appkey"
            r10.put(r12, r4)     // Catch: java.lang.Throwable -> L18
            java.lang.String r12 = "uid"
            r10.put(r12, r7)     // Catch: java.lang.Throwable -> L18
            java.lang.String r12 = "platform"
            java.lang.String r13 = "a"
            r10.put(r12, r13)     // Catch: java.lang.Throwable -> L18
            java.lang.String r12 = "key"
            r10.put(r12, r15)     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = cn.jiguang.av.v.f(r9)     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = r9.toUpperCase()     // Catch: java.lang.Throwable -> L18
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r12.<init>()     // Catch: java.lang.Throwable -> L18
            r12.append(r7)     // Catch: java.lang.Throwable -> L18
            r12.append(r9)     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = r12.toString()     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = cn.jiguang.av.v.f(r9)     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = r9.toUpperCase()     // Catch: java.lang.Throwable -> L18
            boolean r12 = android.text.TextUtils.isEmpty(r9)     // Catch: java.lang.Throwable -> L18
            if (r12 == 0) goto L94
            return r11
        L94:
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r12.<init>()     // Catch: java.lang.Throwable -> L18
            r12.append(r7)     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = ":"
            r12.append(r7)     // Catch: java.lang.Throwable -> L18
            r12.append(r9)     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = r12.toString()     // Catch: java.lang.Throwable -> L18
            byte[] r7 = r7.getBytes()     // Catch: java.lang.Throwable -> L18
            r8 = 10
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r8)     // Catch: java.lang.Throwable -> L18
            boolean r8 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L18
            if (r8 == 0) goto Lb9
            return r11
        Lb9:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r8.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = "url:"
            r8.append(r9)     // Catch: java.lang.Throwable -> L18
            r8.append(r6)     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = ", param json:"
            r8.append(r9)     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = r10.toString()     // Catch: java.lang.Throwable -> L18
            r8.append(r9)     // Catch: java.lang.Throwable -> L18
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L18
            cn.jiguang.w.f.c(r2, r8)     // Catch: java.lang.Throwable -> L18
            cn.jiguang.net.HttpRequest r8 = new cn.jiguang.net.HttpRequest     // Catch: java.lang.Throwable -> L18
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "Content-Type"
            r8.setRequestProperty(r6, r1)     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "Accept"
            r8.setRequestProperty(r6, r1)     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "X-Http-Platform"
            java.lang.String r9 = "android"
            r8.setRequestProperty(r6, r9)     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "X-Http-Appkey"
            r8.setRequestProperty(r6, r4)     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "Authorization"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r9.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r11 = "Basic "
            r9.append(r11)     // Catch: java.lang.Throwable -> L18
            r9.append(r7)     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = r9.toString()     // Catch: java.lang.Throwable -> L18
            r8.setRequestProperty(r6, r7)     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "Charset"
            java.lang.String r7 = "UTF-8"
            r8.setRequestProperty(r6, r7)     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = r10.toString()     // Catch: java.lang.Throwable -> L18
            r8.setBody(r6)     // Catch: java.lang.Throwable -> L18
            cn.jiguang.net.HttpResponse r6 = cn.jiguang.net.HttpUtils.httpPost(r14, r8)     // Catch: java.lang.Throwable -> L18
            int r7 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L18
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r8.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r9 = "responseCode:"
            r8.append(r9)     // Catch: java.lang.Throwable -> L18
            r8.append(r7)     // Catch: java.lang.Throwable -> L18
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L18
            cn.jiguang.w.f.c(r2, r8)     // Catch: java.lang.Throwable -> L18
            r8 = 200(0xc8, float:2.8E-43)
            if (r8 == r7) goto L13a
            goto L26
        L13a:
            java.lang.String r6 = r6.getResponseBody()     // Catch: java.lang.Throwable -> L18
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r7.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r8 = "responseBody:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L18
            r7.append(r6)     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L18
            cn.jiguang.w.f.c(r2, r7)     // Catch: java.lang.Throwable -> L18
            boolean r7 = android.text.TextUtils.isEmpty(r6)     // Catch: java.lang.Throwable -> L18
            if (r7 != 0) goto L26
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18
            r7.<init>()     // Catch: java.lang.Throwable -> L18
            java.lang.String r8 = "request upload token success,response body:"
            r7.append(r8)     // Catch: java.lang.Throwable -> L18
            r7.append(r6)     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> L18
            cn.jiguang.w.f.c(r2, r7)     // Catch: java.lang.Throwable -> L18
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L18
            r7.<init>(r6)     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "code"
            int r6 = r7.optInt(r6)     // Catch: java.lang.Throwable -> L18
            r8 = 2000(0x7d0, float:2.803E-42)
            if (r6 != r8) goto L18d
            org.json.JSONObject r14 = r7.optJSONObject(r0)     // Catch: java.lang.Throwable -> L18
            if (r14 == 0) goto L18c
            org.json.JSONObject r14 = r7.optJSONObject(r0)     // Catch: java.lang.Throwable -> L18
            java.lang.String r15 = "uploadPreSignedURL"
            java.lang.String r14 = r14.optString(r15)     // Catch: java.lang.Throwable -> L18
            return r14
        L18c:
            return r3
        L18d:
            java.lang.String r6 = "start to open log "
            cn.jiguang.w.f.i(r2, r6)     // Catch: java.lang.Throwable -> L18
            java.lang.String r6 = "content"
            java.lang.String r6 = r7.optString(r6)     // Catch: java.lang.Throwable -> L18
            r7 = 0
            a(r14, r7, r3, r6)     // Catch: java.lang.Throwable -> L18
            goto L26
        L19e:
            return r3
        L19f:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>()
            java.lang.String r0 = "getUploadToken error is "
            r15.append(r0)
            java.lang.String r14 = r14.getMessage()
            r15.append(r14)
            java.lang.String r14 = r15.toString()
            cn.jiguang.w.f.i(r2, r14)
            return r3
    }

    public static void a(android.content.Context r4) {
            if (r4 != 0) goto L3
            return
        L3:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aO()
            java.lang.Object r0 = cn.jiguang.e.b.a(r4, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            r1 = 10
            if (r0 <= r1) goto L16
            goto L18
        L16:
            r0 = 10
        L18:
            cn.jiguang.w.b$1 r1 = new cn.jiguang.w.b$1
            r1.<init>(r4)
            int r0 = r0 * 1000
            long r2 = (long) r0
            java.lang.String r4 = "DELAY_TASK"
            cn.jiguang.au.d.a(r4, r1, r2)
            return
    }

    public static void a(android.content.Context r4, boolean r5, java.lang.String r6, java.lang.String r7) {
            cn.jiguang.e.a r0 = cn.jiguang.e.a.ay()
            java.lang.Object r0 = cn.jiguang.e.b.a(r4, r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L11
            return
        L11:
            android.content.pm.PackageManager r0 = r4.getPackageManager()
            java.lang.String r1 = "com.jiguang.openlog"
            android.content.Intent r0 = r0.getLaunchIntentForPackage(r1)
            java.lang.String r1 = "uid"
            long r2 = cn.jiguang.d.a.f(r4)
            r0.putExtra(r1, r2)
            java.lang.String r1 = "appKey"
            java.lang.String r2 = cn.jiguang.v.a.a(r4)
            r0.putExtra(r1, r2)
            java.lang.String r1 = "appName"
            r0.putExtra(r1, r6)
            java.lang.String r6 = "content"
            r0.putExtra(r6, r7)
            java.lang.String r6 = "result"
            r0.putExtra(r6, r5)
            r4.startActivity(r0)
            return
    }

    public static void b(android.content.Context r5) {
            if (r5 != 0) goto L3
            return
        L3:
            cn.jiguang.e.a r0 = cn.jiguang.e.a.aO()
            java.lang.Object r0 = cn.jiguang.e.b.a(r5, r0)
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            int r1 = cn.jiguang.e.c.e(r5)
            boolean r2 = cn.jiguang.e.c.d(r5)
            r3 = 10
            int r0 = java.lang.Math.max(r0, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "startUpload delay is "
            r3.append(r4)
            r3.append(r0)
            java.lang.String r4 = ", uploadLog is "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r4 = ", serverUploadState is "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "LogFileHelper"
            cn.jiguang.w.f.c(r4, r3)
            if (r1 != 0) goto L4d
            java.lang.String r5 = "serverUploadState is 0, not uploadLog"
            cn.jiguang.w.f.c(r4, r5)
            return
        L4d:
            r3 = 2
            if (r1 < r3) goto L58
            if (r2 != 0) goto L58
            java.lang.String r5 = "serverUploadState is 2 and local_upload is false, not uploadLog"
            cn.jiguang.w.f.c(r4, r5)
            return
        L58:
            cn.jiguang.w.b$2 r1 = new cn.jiguang.w.b$2
            r1.<init>(r5)
            int r0 = r0 * 1000
            long r2 = (long) r0
            java.lang.String r5 = "DELAY_TASK"
            cn.jiguang.au.d.a(r5, r1, r2)
            return
    }
}

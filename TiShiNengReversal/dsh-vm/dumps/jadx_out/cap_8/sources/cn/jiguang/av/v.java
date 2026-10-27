package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class v {
    private static final java.lang.ThreadLocal<java.security.MessageDigest> a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.security.MessageDigest> f727b = null;

    /* renamed from: c, reason: collision with root package name */
    private static final java.lang.ThreadLocal<java.security.MessageDigest> f728c = null;

    /* renamed from: d, reason: collision with root package name */
    private static java.util.regex.Pattern f729d;

    /* renamed from: e, reason: collision with root package name */
    private static java.text.SimpleDateFormat f730e;

    /* renamed from: f, reason: collision with root package name */
    private static java.lang.Class<?> f731f;

    /* renamed from: g, reason: collision with root package name */
    private static java.lang.reflect.Method f732g;




    static {
            cn.jiguang.av.v$1 r0 = new cn.jiguang.av.v$1
            r0.<init>()
            cn.jiguang.av.v.a = r0
            cn.jiguang.av.v$2 r0 = new cn.jiguang.av.v$2
            r0.<init>()
            cn.jiguang.av.v.f727b = r0
            cn.jiguang.av.v$3 r0 = new cn.jiguang.av.v$3
            r0.<init>()
            cn.jiguang.av.v.f728c = r0
            java.lang.String r0 = "((2[0-4]\\d|25[0-5]|[01]?\\d{1,2})\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d{1,2})"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            cn.jiguang.av.v.f729d = r0
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "HHH:mm:ss:SSS"
            java.util.Locale r2 = java.util.Locale.ENGLISH
            r0.<init>(r1, r2)
            cn.jiguang.av.v.f730e = r0
            return
    }

    public v() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r7, java.lang.String r8) {
            java.lang.Class<?> r0 = cn.jiguang.av.v.f731f     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto Lc
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L35
            cn.jiguang.av.v.f731f = r0     // Catch: java.lang.Throwable -> L35
        Lc:
            java.lang.reflect.Method r0 = cn.jiguang.av.v.f732g     // Catch: java.lang.Throwable -> L35
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 != 0) goto L25
            java.lang.Class<?> r0 = cn.jiguang.av.v.f731f     // Catch: java.lang.Throwable -> L35
            java.lang.String r4 = "get"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L35
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r5[r2] = r6     // Catch: java.lang.Throwable -> L35
            r5[r1] = r6     // Catch: java.lang.Throwable -> L35
            java.lang.reflect.Method r0 = r0.getMethod(r4, r5)     // Catch: java.lang.Throwable -> L35
            cn.jiguang.av.v.f732g = r0     // Catch: java.lang.Throwable -> L35
        L25:
            java.lang.reflect.Method r0 = cn.jiguang.av.v.f732g     // Catch: java.lang.Throwable -> L35
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L35
            r3[r2] = r7     // Catch: java.lang.Throwable -> L35
            r3[r1] = r8     // Catch: java.lang.Throwable -> L35
            r7 = 0
            java.lang.Object r7 = r0.invoke(r7, r3)     // Catch: java.lang.Throwable -> L35
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L35
            return r7
        L35:
            return r8
    }

    public static org.json.JSONObject a(android.os.Bundle r5) {
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            if (r5 == 0) goto L52
            java.util.Set r1 = r5.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lf:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L52
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r5.get(r2)
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Exception -> L27
            if (r4 == 0) goto L29
        L23:
            r0.put(r2, r3)     // Catch: java.lang.Exception -> L27
            goto Lf
        L27:
            goto Lf
        L29:
            boolean r4 = r3 instanceof java.lang.Integer     // Catch: java.lang.Exception -> L27
            if (r4 == 0) goto L2e
            goto L23
        L2e:
            boolean r4 = r3 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L27
            if (r4 == 0) goto L33
            goto L23
        L33:
            boolean r4 = r3 instanceof java.lang.Double     // Catch: java.lang.Exception -> L27
            if (r4 == 0) goto L38
            goto L23
        L38:
            boolean r4 = r3 instanceof java.lang.Float     // Catch: java.lang.Exception -> L27
            if (r4 == 0) goto L3d
            goto L23
        L3d:
            boolean r4 = r3 instanceof java.lang.Long     // Catch: java.lang.Exception -> L27
            if (r4 == 0) goto L42
            goto L23
        L42:
            boolean r4 = r3 instanceof android.os.Bundle     // Catch: java.lang.Exception -> L27
            if (r4 == 0) goto L4d
            android.os.Bundle r3 = (android.os.Bundle) r3     // Catch: java.lang.Exception -> L27
            org.json.JSONObject r3 = a(r3)     // Catch: java.lang.Exception -> L27
            goto L23
        L4d:
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Exception -> L27
            goto L23
        L52:
            return r0
    }

    public static void a(android.content.Context r2, java.util.List<java.lang.String> r3) {
            boolean r2 = cn.jiguang.av.b.e(r2)
            if (r2 == 0) goto L22
            if (r3 == 0) goto L22
            int r2 = r3.size()
            r0 = 2
            if (r2 < r0) goto L22
            r2 = 0
            java.lang.Object r0 = r3.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "ipv6"
            boolean r0 = r0.contains(r1)
            if (r0 != 0) goto L22
            r0 = 1
            java.util.Collections.swap(r3, r2, r0)
        L22:
            return
    }

    private static void a(java.lang.StringBuffer r2, byte r3) {
            int r0 = r3 >> 4
            r0 = r0 & 15
            java.lang.String r1 = "0123456789ABCDEF"
            char r0 = r1.charAt(r0)
            r2.append(r0)
            r3 = r3 & 15
            char r3 = r1.charAt(r3)
            r2.append(r3)
            return
    }

    public static boolean a(java.lang.String r2) {
            r0 = 1
            if (r2 != 0) goto L4
            return r0
        L4:
            int r1 = r2.length()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r2 = r2.trim()
            int r2 = r2.length()
            if (r2 != 0) goto L16
            return r0
        L16:
            r2 = 0
            return r2
    }

    public static byte[] a(byte[] r1) {
            java.lang.ThreadLocal<java.security.MessageDigest> r0 = cn.jiguang.av.v.f728c     // Catch: java.lang.Exception -> L1b
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L1b
            java.security.MessageDigest r0 = (java.security.MessageDigest) r0     // Catch: java.lang.Exception -> L1b
            if (r0 != 0) goto L10
            java.lang.String r0 = cn.jiguang.av.t.f718c     // Catch: java.lang.Exception -> L1b
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L1b
        L10:
            r0.reset()     // Catch: java.lang.Exception -> L1b
            r0.update(r1)     // Catch: java.lang.Exception -> L1b
            byte[] r1 = r0.digest()     // Catch: java.lang.Exception -> L1b
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public static java.lang.String b(java.lang.String r2) {
            boolean r0 = a(r2)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "[^\\w#$@\\-一-龥]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            java.util.regex.Matcher r2 = r0.matcher(r2)
            java.lang.String r2 = r2.replaceAll(r1)
            return r2
    }

    public static java.lang.String b(byte[] r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = ""
            return r4
        L5:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            int r1 = r4.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r4.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L19
            r3 = r4[r2]
            a(r0, r3)
            int r2 = r2 + 1
            goto Lf
        L19:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static java.util.HashMap<java.lang.String, java.lang.Object> b(android.os.Bundle r4) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            if (r4 == 0) goto L23
            java.util.Set r1 = r4.keySet()     // Catch: java.lang.Throwable -> L23
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L23
        Lf:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L23
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L23
            java.lang.Object r3 = r4.get(r2)     // Catch: java.lang.Throwable -> L23
            r0.put(r2, r3)     // Catch: java.lang.Throwable -> L23
            goto Lf
        L23:
            return r0
    }

    public static java.lang.String c(byte[] r4) {
            java.lang.ThreadLocal<java.security.MessageDigest> r0 = cn.jiguang.av.v.f727b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L3c
            java.security.MessageDigest r0 = (java.security.MessageDigest) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L10
            java.lang.String r0 = cn.jiguang.av.t.f717b     // Catch: java.lang.Throwable -> L3c
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L3c
        L10:
            r0.reset()     // Catch: java.lang.Throwable -> L3c
            byte[] r4 = r0.digest(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            r1 = 0
        L1d:
            int r2 = r4.length     // Catch: java.lang.Throwable -> L3c
            if (r1 >= r2) goto L37
            r2 = r4[r1]     // Catch: java.lang.Throwable -> L3c
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 16
            if (r2 >= r3) goto L2d
            java.lang.String r3 = "0"
            r0.append(r3)     // Catch: java.lang.Throwable -> L3c
        L2d:
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.lang.Throwable -> L3c
            r0.append(r2)     // Catch: java.lang.Throwable -> L3c
            int r1 = r1 + 1
            goto L1d
        L37:
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            return r4
        L3c:
            java.lang.String r4 = "StringUtils"
            java.lang.String r0 = "Get SHash error"
            cn.jiguang.w.f.c(r4, r0)
            java.lang.String r4 = ""
            return r4
    }

    public static byte[] c(java.lang.String r3) {
            char[] r3 = r3.toCharArray()     // Catch: java.lang.Exception -> L2b
            int r0 = r3.length     // Catch: java.lang.Exception -> L2b
            byte[] r0 = new byte[r0]     // Catch: java.lang.Exception -> L2b
            r1 = 0
        L8:
            int r2 = r3.length     // Catch: java.lang.Exception -> L2b
            if (r1 >= r2) goto L13
            char r2 = r3[r1]     // Catch: java.lang.Exception -> L2b
            byte r2 = (byte) r2     // Catch: java.lang.Exception -> L2b
            r0[r1] = r2     // Catch: java.lang.Exception -> L2b
            int r1 = r1 + 1
            goto L8
        L13:
            java.lang.ThreadLocal<java.security.MessageDigest> r3 = cn.jiguang.av.v.a     // Catch: java.lang.Exception -> L2b
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Exception -> L2b
            java.security.MessageDigest r3 = (java.security.MessageDigest) r3     // Catch: java.lang.Exception -> L2b
            if (r3 != 0) goto L23
            java.lang.String r3 = cn.jiguang.av.t.a     // Catch: java.lang.Exception -> L2b
            java.security.MessageDigest r3 = java.security.MessageDigest.getInstance(r3)     // Catch: java.lang.Exception -> L2b
        L23:
            r3.reset()     // Catch: java.lang.Exception -> L2b
            byte[] r3 = r3.digest(r0)     // Catch: java.lang.Exception -> L2b
            return r3
        L2b:
            r3 = 0
            return r3
    }

    public static java.lang.String d(java.lang.String r5) {
            java.lang.ThreadLocal<java.security.MessageDigest> r0 = cn.jiguang.av.v.a     // Catch: java.lang.Exception -> L4f
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Exception -> L4f
            java.security.MessageDigest r0 = (java.security.MessageDigest) r0     // Catch: java.lang.Exception -> L4f
            if (r0 != 0) goto L10
            java.lang.String r0 = cn.jiguang.av.t.a     // Catch: java.lang.Exception -> L4f
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Exception -> L4f
        L10:
            r0.reset()     // Catch: java.lang.Exception -> L4f
            char[] r5 = r5.toCharArray()     // Catch: java.lang.Exception -> L4f
            int r1 = r5.length     // Catch: java.lang.Exception -> L4f
            byte[] r1 = new byte[r1]     // Catch: java.lang.Exception -> L4f
            r2 = 0
            r3 = 0
        L1c:
            int r4 = r5.length     // Catch: java.lang.Exception -> L4f
            if (r3 >= r4) goto L27
            char r4 = r5[r3]     // Catch: java.lang.Exception -> L4f
            byte r4 = (byte) r4     // Catch: java.lang.Exception -> L4f
            r1[r3] = r4     // Catch: java.lang.Exception -> L4f
            int r3 = r3 + 1
            goto L1c
        L27:
            byte[] r5 = r0.digest(r1)     // Catch: java.lang.Exception -> L4f
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L4f
            r0.<init>()     // Catch: java.lang.Exception -> L4f
        L30:
            int r1 = r5.length     // Catch: java.lang.Exception -> L4f
            if (r2 >= r1) goto L4a
            r1 = r5[r2]     // Catch: java.lang.Exception -> L4f
            r1 = r1 & 255(0xff, float:3.57E-43)
            r3 = 16
            if (r1 >= r3) goto L40
            java.lang.String r3 = "0"
            r0.append(r3)     // Catch: java.lang.Exception -> L4f
        L40:
            java.lang.String r1 = java.lang.Integer.toHexString(r1)     // Catch: java.lang.Exception -> L4f
            r0.append(r1)     // Catch: java.lang.Exception -> L4f
            int r2 = r2 + 1
            goto L30
        L4a:
            java.lang.String r5 = r0.toString()     // Catch: java.lang.Exception -> L4f
            return r5
        L4f:
            java.lang.String r5 = ""
            return r5
    }

    public static java.lang.String d(byte[] r4) {
            java.lang.ThreadLocal<java.security.MessageDigest> r0 = cn.jiguang.av.v.a     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L3c
            java.security.MessageDigest r0 = (java.security.MessageDigest) r0     // Catch: java.lang.Throwable -> L3c
            if (r0 != 0) goto L10
            java.lang.String r0 = cn.jiguang.av.t.a     // Catch: java.lang.Throwable -> L3c
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L3c
        L10:
            r0.reset()     // Catch: java.lang.Throwable -> L3c
            byte[] r4 = r0.digest(r4)     // Catch: java.lang.Throwable -> L3c
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L3c
            r0.<init>()     // Catch: java.lang.Throwable -> L3c
            r1 = 0
        L1d:
            int r2 = r4.length     // Catch: java.lang.Throwable -> L3c
            if (r1 >= r2) goto L37
            r2 = r4[r1]     // Catch: java.lang.Throwable -> L3c
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 16
            if (r2 >= r3) goto L2d
            java.lang.String r3 = "0"
            r0.append(r3)     // Catch: java.lang.Throwable -> L3c
        L2d:
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.lang.Throwable -> L3c
            r0.append(r2)     // Catch: java.lang.Throwable -> L3c
            int r1 = r1 + 1
            goto L1d
        L37:
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L3c
            return r4
        L3c:
            java.lang.String r4 = "StringUtils"
            java.lang.String r0 = "Get Hash error"
            cn.jiguang.w.f.c(r4, r0)
            java.lang.String r4 = ""
            return r4
    }

    public static byte[] e(java.lang.String r0) {
            byte[] r0 = r0.getBytes()     // Catch: java.lang.Exception -> L9
            byte[] r0 = a(r0)     // Catch: java.lang.Exception -> L9
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static java.lang.String f(java.lang.String r4) {
            java.lang.ThreadLocal<java.security.MessageDigest> r0 = cn.jiguang.av.v.a     // Catch: java.lang.Throwable -> L43
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> L43
            java.security.MessageDigest r0 = (java.security.MessageDigest) r0     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L10
            java.lang.String r0 = cn.jiguang.av.t.a     // Catch: java.lang.Throwable -> L43
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.lang.Throwable -> L43
        L10:
            r0.reset()     // Catch: java.lang.Throwable -> L43
            java.lang.String r1 = "utf-8"
            byte[] r4 = r4.getBytes(r1)     // Catch: java.lang.Throwable -> L43
            byte[] r4 = r0.digest(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.lang.Throwable -> L43
            r0.<init>()     // Catch: java.lang.Throwable -> L43
            r1 = 0
        L24:
            int r2 = r4.length     // Catch: java.lang.Throwable -> L43
            if (r1 >= r2) goto L3e
            r2 = r4[r1]     // Catch: java.lang.Throwable -> L43
            r2 = r2 & 255(0xff, float:3.57E-43)
            r3 = 16
            if (r2 >= r3) goto L34
            java.lang.String r3 = "0"
            r0.append(r3)     // Catch: java.lang.Throwable -> L43
        L34:
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.lang.Throwable -> L43
            r0.append(r2)     // Catch: java.lang.Throwable -> L43
            int r1 = r1 + 1
            goto L24
        L3e:
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L43
            return r4
        L43:
            java.lang.String r4 = "StringUtils"
            java.lang.String r0 = "Get hash error"
            cn.jiguang.w.f.c(r4, r0)
            java.lang.String r4 = ""
            return r4
    }

    public static boolean g(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = ":"
            int r2 = r3.indexOf(r0)
            if (r2 < 0) goto L1c
            int r0 = r3.lastIndexOf(r0)
            if (r2 != r0) goto L1b
            java.lang.String r3 = r3.substring(r1, r2)
            goto L1c
        L1b:
            return r1
        L1c:
            java.util.regex.Pattern r0 = cn.jiguang.av.v.f729d
            java.util.regex.Matcher r3 = r0.matcher(r3)
            boolean r3 = r3.matches()
            return r3
    }

    public static boolean h(java.lang.String r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = ":"
            int r2 = r4.indexOf(r0)
            r3 = -1
            if (r2 != r3) goto L12
            return r1
        L12:
            int r4 = r4.lastIndexOf(r0)
            if (r4 == r2) goto L1a
            r4 = 1
            return r4
        L1a:
            return r1
    }

    public static boolean i(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.lang.String r0 = "[\\x20-\\x7E]+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L17
            java.util.regex.Matcher r1 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L17
            boolean r1 = r1.matches()     // Catch: java.lang.Throwable -> L17
            return r1
        L17:
            r1 = 1
            return r1
    }

    public static byte[] j(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto La
            r3 = 0
            byte[] r3 = new byte[r3]
            return r3
        La:
            java.lang.String r0 = "UTF-8"
            byte[] r3 = r3.getBytes(r0)     // Catch: java.lang.Throwable -> L11
            return r3
        L11:
            r0 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "stringToUtf8Bytes error:"
            r1.append(r2)
            java.lang.String r0 = r0.getMessage()
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "StringUtils"
            cn.jiguang.w.f.m(r1, r0)
            byte[] r3 = r3.getBytes()
            return r3
    }

    public static java.lang.String k(java.lang.String r2) {
            r0 = 0
            if (r2 == 0) goto L2f
            java.lang.String r1 = ""
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lc
            goto L2f
        Lc:
            java.lang.ThreadLocal<java.security.MessageDigest> r1 = cn.jiguang.av.v.a     // Catch: java.lang.Throwable -> L2f
            java.lang.Object r1 = r1.get()     // Catch: java.lang.Throwable -> L2f
            java.security.MessageDigest r1 = (java.security.MessageDigest) r1     // Catch: java.lang.Throwable -> L2f
            if (r1 != 0) goto L1c
            java.lang.String r1 = cn.jiguang.av.t.a     // Catch: java.lang.Throwable -> L2f
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Throwable -> L2f
        L1c:
            r1.reset()     // Catch: java.lang.Throwable -> L2f
            byte[] r2 = r2.getBytes()     // Catch: java.lang.Throwable -> L2f
            r1.update(r2)     // Catch: java.lang.Throwable -> L2f
            byte[] r2 = r1.digest()     // Catch: java.lang.Throwable -> L2f
            java.lang.String r2 = b(r2)     // Catch: java.lang.Throwable -> L2f
            return r2
        L2f:
            return r0
    }

    public static java.lang.String l(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            goto L12
        L7:
            java.lang.String r0 = "utf-8"
            byte[] r0 = r1.getBytes(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = c(r0)     // Catch: java.lang.Throwable -> L12
        L12:
            return r1
    }
}

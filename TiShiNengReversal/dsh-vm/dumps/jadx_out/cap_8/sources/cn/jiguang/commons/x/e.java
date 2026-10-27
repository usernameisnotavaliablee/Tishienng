package cn.jiguang.commons.x;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public abstract class e {
    private static final java.lang.ThreadLocal a = null;

    class a extends java.lang.ThreadLocal {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        protected java.lang.ref.WeakReference a() {
                r2 = this;
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                java.security.SecureRandom r1 = new java.security.SecureRandom
                r1.<init>()
                r0.<init>(r1)
                return r0
        }

        @Override // java.lang.ThreadLocal
        protected /* synthetic */ java.lang.Object initialValue() {
                r1 = this;
                java.lang.ref.WeakReference r0 = r1.a()
                return r0
        }
    }

    static {
            cn.jiguang.commons.x.e$a r0 = new cn.jiguang.commons.x.e$a
            r0.<init>()
            cn.jiguang.commons.x.e.a = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    private static int a(java.net.HttpURLConnection r1) {
            r0 = -1
            if (r1 != 0) goto L4
            return r0
        L4:
            int r1 = r1.getResponseCode()     // Catch: java.lang.Exception -> L9
            return r1
        L9:
            return r0
    }

    private static long a(int r8) {
            int r8 = r8 + (-1)
            double r0 = (double) r8
            r2 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r0 = java.lang.Math.pow(r2, r0)
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 * r2
            long r0 = (long) r0
            r2 = 30000(0x7530, double:1.4822E-319)
            long r0 = java.lang.Math.min(r0, r2)
            double r2 = (double) r0
            r4 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            double r2 = r2 * r4
            double r4 = java.lang.Math.random()
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r4 = r4 - r6
            double r2 = r2 * r4
            long r2 = (long) r2
            long r0 = r0 + r2
            r2 = 100
            long r0 = java.lang.Math.max(r0, r2)
            return r0
    }

    public static cn.jiguang.commons.x.d a(cn.jiguang.commons.x.c r4) {
            java.lang.String r0 = ""
            r1 = -1
            if (r4 != 0) goto L13
            cn.jiguang.commons.x.d r4 = new cn.jiguang.commons.x.d
            r4.<init>(r0)
            r4.a(r1)
            java.lang.String r0 = "request is null"
        Lf:
            r4.a(r0)
            return r4
        L13:
            java.lang.String r2 = r4.j()
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L28
            cn.jiguang.commons.x.d r4 = new cn.jiguang.commons.x.d
            r4.<init>(r0)
            r4.a(r1)
            java.lang.String r0 = "url is null or empty"
            goto Lf
        L28:
            cn.jiguang.commons.g.p r0 = cn.jiguang.commons.g.p.e()
            boolean r0 = r0.m()
            if (r0 != 0) goto L3d
            cn.jiguang.commons.x.d r4 = new cn.jiguang.commons.x.d
            r4.<init>(r2)
            r4.a(r1)
            java.lang.String r0 = "no auth"
            goto Lf
        L3d:
            boolean r0 = cn.jiguang.commons.L.g.d()
            if (r0 != 0) goto L4e
            cn.jiguang.commons.x.d r4 = new cn.jiguang.commons.x.d
            r4.<init>(r2)
            r4.a(r1)
            java.lang.String r0 = "no network connection"
            goto Lf
        L4e:
            cn.jiguang.commons.x.d r4 = d(r4)
            return r4
    }

    private static java.lang.String a(java.lang.Throwable r4) {
            if (r4 != 0) goto L5
            java.lang.String r4 = "CLIENT_EXCEPTION|Unknown|null exception"
            return r4
        L5:
            java.lang.Class r0 = r4.getClass()
            java.lang.String r0 = r0.getName()
            java.lang.String r4 = r4.getMessage()
            if (r4 != 0) goto L15
            java.lang.String r4 = ""
        L15:
            java.lang.String r1 = "||"
            java.lang.String r2 = "|"
            java.lang.String r4 = r4.replace(r2, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "CLIENT_EXCEPTION|"
            r1.append(r3)
            r1.append(r0)
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            return r4
    }

    private static java.lang.String a(java.util.List r3) {
            if (r3 == 0) goto L41
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            goto L41
        L9:
            int r0 = r3.size()
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L18
            java.lang.Object r3 = r3.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            return r3
        L18:
            int r0 = r3.size()
            int r0 = r0 * 25
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
        L23:
            int r0 = r3.size()
            if (r1 >= r0) goto L3c
            if (r1 <= 0) goto L30
            java.lang.String r0 = ", "
            r2.append(r0)
        L30:
            java.lang.Object r0 = r3.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r2.append(r0)
            int r1 = r1 + 1
            goto L23
        L3c:
            java.lang.String r3 = r2.toString()
            return r3
        L41:
            java.lang.String r3 = ""
            return r3
    }

    private static java.security.SecureRandom a() {
            java.lang.ThreadLocal r0 = cn.jiguang.commons.x.e.a
            java.lang.Object r1 = r0.get()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            if (r1 == 0) goto L11
            java.lang.Object r1 = r1.get()
            java.security.SecureRandom r1 = (java.security.SecureRandom) r1
            goto L12
        L11:
            r1 = 0
        L12:
            if (r1 != 0) goto L21
            java.security.SecureRandom r1 = new java.security.SecureRandom
            r1.<init>()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r1)
            r0.set(r2)
        L21:
            return r1
    }

    private static void a(int r4, int r5, java.lang.String r6) {
            boolean r0 = a(r6)
            r1 = 1
            r2 = 2
            if (r0 == 0) goto L13
            java.lang.String[] r0 = c(r6)
            if (r0 == 0) goto L13
            int r3 = r0.length
            if (r3 < r2) goto L13
            r6 = r0[r1]
        L13:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r3 = 0
            r0[r3] = r4
            r0[r1] = r5
            r0[r2] = r6
            java.lang.String r4 = "not retrying on attempt %d, response code:%d, error:%s"
            java.lang.String r4 = java.lang.String.format(r4, r0)
            java.lang.String r5 = "JHttpUtils"
            cn.jiguang.commons.w.a.f(r5, r4)
            return
    }

    private static void a(int r2, long r3) {
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Long r3 = java.lang.Long.valueOf(r0)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r2
            r2 = 1
            r4[r2] = r3
            java.lang.String r2 = "http request successful on attempt %d, total time:%dms"
            java.lang.String r2 = java.lang.String.format(r2, r4)
            java.lang.String r3 = "JHttpUtils"
            cn.jiguang.commons.w.a.a(r3, r2)
            return
    }

    private static void a(int r0, long r1, java.lang.String r3) {
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            if (r3 == 0) goto L18
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ", error:"
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            goto L1a
        L18:
            java.lang.String r1 = ""
        L1a:
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "request failed, retrying in %dms%s"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.lang.String r1 = "JHttpUtils"
            cn.jiguang.commons.w.a.a(r1, r0)
            return
    }

    private static void a(long r2) {
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            r3 = 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r0 = 0
            r3[r0] = r2
            java.lang.String r2 = "all retry attempts failed after %dms total time"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.String r3 = "JHttpUtils"
            cn.jiguang.commons.w.a.f(r3, r2)
            return
    }

    private static void a(cn.jiguang.commons.x.d r1, java.lang.Throwable r2) {
            r0 = -1
            r1.a(r0)
            java.lang.String r2 = a(r2)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = "UTF-8"
            byte[] r0 = r2.getBytes(r0)     // Catch: java.lang.Throwable -> L15
            r1.a(r0)     // Catch: java.lang.Throwable -> L15
            r1.a(r2)     // Catch: java.lang.Throwable -> L15
            return
        L15:
            r2 = 0
            byte[] r2 = new byte[r2]
            r1.a(r2)
            java.lang.String r2 = ""
            r1.a(r2)
            return
    }

    private static void a(javax.net.ssl.HttpsURLConnection r3, javax.net.ssl.X509TrustManager r4, javax.net.ssl.HostnameVerifier r5) {
            if (r4 == 0) goto L1d
            java.lang.String r0 = "TLS"
            javax.net.ssl.SSLContext r0 = javax.net.ssl.SSLContext.getInstance(r0)     // Catch: java.lang.Throwable -> L34
            r1 = 1
            javax.net.ssl.TrustManager[] r1 = new javax.net.ssl.TrustManager[r1]     // Catch: java.lang.Throwable -> L34
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Throwable -> L34
            java.security.SecureRandom r4 = a()     // Catch: java.lang.Throwable -> L34
            r2 = 0
            r0.init(r2, r1, r4)     // Catch: java.lang.Throwable -> L34
            javax.net.ssl.SSLSocketFactory r4 = r0.getSocketFactory()     // Catch: java.lang.Throwable -> L34
            r3.setSSLSocketFactory(r4)     // Catch: java.lang.Throwable -> L34
        L1d:
            if (r5 == 0) goto L23
            r3.setHostnameVerifier(r5)     // Catch: java.lang.Throwable -> L34
            return
        L23:
            cn.jiguang.commons.x.a r4 = new cn.jiguang.commons.x.a     // Catch: java.lang.Throwable -> L34
            java.net.URL r5 = r3.getURL()     // Catch: java.lang.Throwable -> L34
            java.lang.String r5 = r5.getHost()     // Catch: java.lang.Throwable -> L34
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L34
            r3.setHostnameVerifier(r4)     // Catch: java.lang.Throwable -> L34
            return
        L34:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "set ssl config error:"
            r4.append(r5)
            java.lang.String r3 = r3.getMessage()
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.String r4 = "JHttpUtils"
            cn.jiguang.commons.w.a.f(r4, r3)
            return
    }

    private static void a(boolean r4, int r5, java.lang.String r6) {
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0 = 3
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            if (r4 == 0) goto Le
            java.lang.String r4 = "POST"
            goto L10
        Le:
            java.lang.String r4 = "other"
        L10:
            r2 = 4
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r5
            r5 = 1
            r2[r5] = r1
            r5 = 2
            r2[r5] = r4
            r2[r0] = r6
            java.lang.String r4 = "http request attempt %d/%d, method:%s, url:%s"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            java.lang.String r5 = "JHttpUtils"
            cn.jiguang.commons.w.a.a(r5, r4)
            return
    }

    private static boolean a(cn.jiguang.commons.x.d r1) {
            if (r1 == 0) goto Lc
            int r1 = r1.d()
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private static boolean a(cn.jiguang.commons.x.d r5, int r6) {
            r0 = 3
            r1 = 0
            if (r6 < r0) goto L5
            return r1
        L5:
            r0 = 1
            if (r5 != 0) goto L9
            return r0
        L9:
            int r2 = r5.d()
            r3 = 200(0xc8, float:2.8E-43)
            r4 = 300(0x12c, float:4.2E-43)
            if (r2 < r3) goto L16
            if (r2 >= r4) goto L16
            return r1
        L16:
            r3 = 400(0x190, float:5.6E-43)
            if (r2 < r4) goto L1d
            if (r2 >= r3) goto L1d
            return r1
        L1d:
            r4 = 500(0x1f4, float:7.0E-43)
            if (r2 < r3) goto L24
            if (r2 >= r4) goto L24
            return r1
        L24:
            if (r2 < r4) goto L34
            r3 = 600(0x258, float:8.41E-43)
            if (r2 >= r3) goto L34
            r5 = 504(0x1f8, float:7.06E-43)
            if (r2 != r5) goto L2f
            return r1
        L2f:
            r5 = 2
            if (r6 >= r5) goto L33
            return r0
        L33:
            return r1
        L34:
            if (r2 >= 0) goto L6c
            java.lang.String r5 = r5.a()
            if (r5 == 0) goto L6b
            java.lang.String r5 = r5.toLowerCase()
            java.lang.String r2 = "malformed url"
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L6a
            java.lang.String r2 = "invalid method"
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L6a
            java.lang.String r2 = "unable to resolve host"
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L6a
            java.lang.String r2 = "unknown host"
            boolean r2 = r5.contains(r2)
            if (r2 != 0) goto L6a
            java.lang.String r2 = "failed to create connection"
            boolean r5 = r5.contains(r2)
            if (r5 == 0) goto L6b
            if (r6 <= r0) goto L6b
        L6a:
            return r1
        L6b:
            return r0
        L6c:
            return r1
    }

    public static boolean a(java.lang.String r1) {
            if (r1 == 0) goto Lc
            java.lang.String r0 = "CLIENT_EXCEPTION|"
            boolean r1 = r1.startsWith(r0)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private static byte[] a(java.io.InputStream r8, long r9) {
            r0 = 0
            if (r8 != 0) goto L6
            byte[] r8 = new byte[r0]
            return r8
        L6:
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream
            r2 = 1048576(0x100000, float:1.469368E-39)
            r3 = 32768(0x8000, float:4.5918E-41)
            int r2 = java.lang.Math.min(r2, r3)
            r1.<init>(r2)
            r2 = 4096(0x1000, float:5.74E-42)
            byte[] r2 = new byte[r2]
            r3 = 0
        L1a:
            int r5 = r8.read(r2)
            r6 = -1
            if (r5 == r6) goto L31
            long r6 = (long) r5
            long r3 = r3 + r6
            int r6 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r6 > 0) goto L2b
            r1.write(r2, r0, r5)
            goto L1a
        L2b:
            cn.jiguang.commons.x.f r8 = new cn.jiguang.commons.x.f
            r8.<init>(r3, r9)
            throw r8
        L31:
            byte[] r8 = r1.toByteArray()
            return r8
    }

    private static byte[] a(java.net.HttpURLConnection r3, int r4, long r5) {
            r0 = 0
            if (r3 != 0) goto L6
            byte[] r3 = new byte[r0]
            return r3
        L6:
            r1 = -1
            r2 = 0
            if (r4 == r1) goto L1f
            r1 = 400(0x190, float:5.6E-43)
            if (r4 < r1) goto Lf
            goto L1f
        Lf:
            java.io.InputStream r2 = r3.getInputStream()     // Catch: java.lang.Throwable -> L14
            goto L15
        L14:
        L15:
            if (r2 != 0) goto L2c
            java.io.InputStream r3 = r3.getErrorStream()     // Catch: java.lang.Throwable -> L1d
        L1b:
            r2 = r3
            goto L2c
        L1d:
            goto L2c
        L1f:
            java.io.InputStream r2 = r3.getErrorStream()     // Catch: java.lang.Throwable -> L24
            goto L25
        L24:
        L25:
            if (r2 != 0) goto L2c
            java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L1d
            goto L1b
        L2c:
            if (r2 != 0) goto L31
            byte[] r3 = new byte[r0]
            return r3
        L31:
            byte[] r3 = a(r2, r5)     // Catch: java.lang.Throwable -> L39
            r2.close()
            return r3
        L39:
            r3 = move-exception
            r2.close()     // Catch: java.lang.Throwable -> L3e
            goto L42
        L3e:
            r4 = move-exception
            r3.addSuppressed(r4)
        L42:
            throw r3
    }

    private static cn.jiguang.commons.x.d c(cn.jiguang.commons.x.c r11) {
            java.lang.String r0 = "UTF-8"
            java.lang.String r1 = r11.j()
            java.lang.String r2 = r11.d()
            if (r2 == 0) goto L11
            java.lang.String r2 = r11.d()
            goto L13
        L11:
            java.lang.String r2 = "GET"
        L13:
            byte[] r3 = r11.g()
            java.util.Map r4 = r11.h()
            r5 = 10485760(0xa00000, double:5.180654E-317)
            r7 = -1
            r8 = 0
            java.lang.Object r9 = r11.e()     // Catch: java.lang.Throwable -> L32
            if (r9 == 0) goto L36
            android.net.Network r9 = (android.net.Network) r9     // Catch: java.lang.Throwable -> L32
            java.net.URL r10 = new java.net.URL     // Catch: java.lang.Throwable -> L32
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L32
            java.net.URLConnection r9 = r9.openConnection(r10)     // Catch: java.lang.Throwable -> L32
            goto L3f
        L32:
            r11 = move-exception
        L33:
            r2 = -1
            goto L13d
        L36:
            java.net.URL r9 = new java.net.URL     // Catch: java.lang.Throwable -> L32
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L32
            java.net.URLConnection r9 = r9.openConnection()     // Catch: java.lang.Throwable -> L32
        L3f:
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9     // Catch: java.lang.Throwable -> L32
            r9.setRequestMethod(r2)     // Catch: java.lang.Throwable -> L51
            int r2 = r11.a()     // Catch: java.lang.Throwable -> L51
            r8 = 30000(0x7530, float:4.2039E-41)
            if (r2 < 0) goto L54
            int r2 = r11.a()     // Catch: java.lang.Throwable -> L51
            goto L56
        L51:
            r11 = move-exception
            r8 = r9
            goto L33
        L54:
            r2 = 30000(0x7530, float:4.2039E-41)
        L56:
            r9.setConnectTimeout(r2)     // Catch: java.lang.Throwable -> L51
            int r2 = r11.f()     // Catch: java.lang.Throwable -> L51
            if (r2 < 0) goto L63
            int r8 = r11.f()     // Catch: java.lang.Throwable -> L51
        L63:
            r9.setReadTimeout(r8)     // Catch: java.lang.Throwable -> L51
            r2 = 0
            r9.setUseCaches(r2)     // Catch: java.lang.Throwable -> L51
            boolean r8 = r11.k()     // Catch: java.lang.Throwable -> L51
            r9.setInstanceFollowRedirects(r8)     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto La1
            boolean r8 = r4.isEmpty()     // Catch: java.lang.Throwable -> L51
            if (r8 != 0) goto La1
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L51
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L51
        L81:
            boolean r8 = r4.hasNext()     // Catch: java.lang.Throwable -> L51
            if (r8 == 0) goto La1
            java.lang.Object r8 = r4.next()     // Catch: java.lang.Throwable -> L51
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch: java.lang.Throwable -> L51
            java.lang.Object r10 = r8.getKey()     // Catch: java.lang.Throwable -> L51
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L51
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L51
            java.lang.String r8 = (java.lang.String) r8     // Catch: java.lang.Throwable -> L51
            if (r10 == 0) goto L81
            if (r8 == 0) goto L81
            r9.setRequestProperty(r10, r8)     // Catch: java.lang.Throwable -> L51
            goto L81
        La1:
            boolean r4 = r9 instanceof javax.net.ssl.HttpsURLConnection     // Catch: java.lang.Throwable -> L51
            if (r4 == 0) goto Lb3
            r4 = r9
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch: java.lang.Throwable -> L51
            javax.net.ssl.X509TrustManager r8 = r11.i()     // Catch: java.lang.Throwable -> L51
            javax.net.ssl.HostnameVerifier r11 = r11.c()     // Catch: java.lang.Throwable -> L51
            a(r4, r8, r11)     // Catch: java.lang.Throwable -> L51
        Lb3:
            if (r3 == 0) goto Ld6
            int r11 = r3.length     // Catch: java.lang.Throwable -> L51
            if (r11 <= 0) goto Ld6
            r11 = 1
            r9.setDoOutput(r11)     // Catch: java.lang.Throwable -> L51
            java.io.OutputStream r11 = r9.getOutputStream()     // Catch: java.lang.Throwable -> L51
            r11.write(r3)     // Catch: java.lang.Throwable -> Lca
            r11.flush()     // Catch: java.lang.Throwable -> Lca
            r11.close()     // Catch: java.lang.Throwable -> L51
            goto Ld6
        Lca:
            r2 = move-exception
            if (r11 == 0) goto Ld5
            r11.close()     // Catch: java.lang.Throwable -> Ld1
            goto Ld5
        Ld1:
            r11 = move-exception
            r2.addSuppressed(r11)     // Catch: java.lang.Throwable -> L51
        Ld5:
            throw r2     // Catch: java.lang.Throwable -> L51
        Ld6:
            int r11 = r9.getResponseCode()     // Catch: java.lang.Throwable -> L51
            cn.jiguang.commons.x.d r3 = new cn.jiguang.commons.x.d     // Catch: java.lang.Throwable -> L116
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L116
            r3.a(r11)     // Catch: java.lang.Throwable -> L116
            java.util.Map r4 = r9.getHeaderFields()     // Catch: java.lang.Throwable -> L116
            if (r4 == 0) goto L11c
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> L116
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L116
        Lf0:
            boolean r8 = r4.hasNext()     // Catch: java.lang.Throwable -> L116
            if (r8 == 0) goto L11c
            java.lang.Object r8 = r4.next()     // Catch: java.lang.Throwable -> L116
            java.util.Map$Entry r8 = (java.util.Map.Entry) r8     // Catch: java.lang.Throwable -> L116
            java.lang.Object r10 = r8.getKey()     // Catch: java.lang.Throwable -> L116
            if (r10 == 0) goto Lf0
            java.lang.Object r10 = r8.getKey()     // Catch: java.lang.Throwable -> L116
            java.lang.String r10 = (java.lang.String) r10     // Catch: java.lang.Throwable -> L116
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L116
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Throwable -> L116
            java.lang.String r8 = a(r8)     // Catch: java.lang.Throwable -> L116
            r3.a(r10, r8)     // Catch: java.lang.Throwable -> L116
            goto Lf0
        L116:
            r2 = move-exception
            r8 = r2
            r2 = r11
            r11 = r8
            r8 = r9
            goto L13d
        L11c:
            byte[] r4 = a(r9, r11, r5)     // Catch: java.lang.Throwable -> L116
            if (r4 == 0) goto L124
            r2 = r4
            goto L126
        L124:
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L116
        L126:
            r3.a(r2)     // Catch: java.lang.Throwable -> L116
            if (r4 == 0) goto L134
            int r2 = r4.length     // Catch: java.lang.Throwable -> L116
            if (r2 <= 0) goto L134
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L116
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L116
            goto L136
        L134:
            java.lang.String r2 = ""
        L136:
            r3.a(r2)     // Catch: java.lang.Throwable -> L116
            r9.disconnect()     // Catch: java.lang.Throwable -> L13c
        L13c:
            return r3
        L13d:
            java.lang.String r3 = "JHttpUtils"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L163
            r4.<init>()     // Catch: java.lang.Throwable -> L163
            java.lang.String r9 = "execute request error: "
            r4.append(r9)     // Catch: java.lang.Throwable -> L163
            java.lang.String r9 = r11.getMessage()     // Catch: java.lang.Throwable -> L163
            r4.append(r9)     // Catch: java.lang.Throwable -> L163
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L163
            cn.jiguang.commons.w.a.f(r3, r4)     // Catch: java.lang.Throwable -> L163
            cn.jiguang.commons.x.d r3 = new cn.jiguang.commons.x.d     // Catch: java.lang.Throwable -> L163
            r3.<init>(r1)     // Catch: java.lang.Throwable -> L163
            if (r2 != r7) goto L165
            int r2 = a(r8)     // Catch: java.lang.Throwable -> L163
            goto L165
        L163:
            r11 = move-exception
            goto L197
        L165:
            boolean r1 = r11 instanceof cn.jiguang.commons.x.f     // Catch: java.lang.Throwable -> L163
            if (r1 == 0) goto L172
            a(r3, r11)     // Catch: java.lang.Throwable -> L163
            if (r8 == 0) goto L196
        L16e:
            r8.disconnect()     // Catch: java.lang.Throwable -> L196
            goto L196
        L172:
            if (r8 == 0) goto L18c
            byte[] r1 = a(r8, r2, r5)     // Catch: java.lang.Throwable -> L190
            if (r1 == 0) goto L18c
            int r4 = r1.length     // Catch: java.lang.Throwable -> L190
            if (r4 <= 0) goto L18c
            r3.a(r2)     // Catch: java.lang.Throwable -> L190
            r3.a(r1)     // Catch: java.lang.Throwable -> L190
            java.lang.String r2 = new java.lang.String     // Catch: java.lang.Throwable -> L190
            r2.<init>(r1, r0)     // Catch: java.lang.Throwable -> L190
            r3.a(r2)     // Catch: java.lang.Throwable -> L190
            goto L193
        L18c:
            a(r3, r11)     // Catch: java.lang.Throwable -> L190
            goto L193
        L190:
            a(r3, r11)     // Catch: java.lang.Throwable -> L163
        L193:
            if (r8 == 0) goto L196
            goto L16e
        L196:
            return r3
        L197:
            if (r8 == 0) goto L19c
            r8.disconnect()     // Catch: java.lang.Throwable -> L19c
        L19c:
            throw r11
    }

    private static void c(long r0) {
            java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> L4
            return
        L4:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
    }

    public static java.lang.String[] c(java.lang.String r3) {
            boolean r0 = a(r3)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "\\|"
            r2 = 3
            java.lang.String[] r3 = r3.split(r0, r2)
            int r0 = r3.length
            if (r0 >= r2) goto L13
            return r1
        L13:
            r0 = 1
            r0 = r3[r0]
            r1 = 2
            r3 = r3[r1]
            java.lang.String r1 = "||"
            java.lang.String r2 = "|"
            java.lang.String r3 = r3.replace(r1, r2)
            java.lang.String[] r3 = new java.lang.String[]{r0, r3}
            return r3
    }

    private static cn.jiguang.commons.x.d d(cn.jiguang.commons.x.c r11) {
            java.lang.String r0 = r11.j()
            java.lang.String r1 = r11.d()
            java.lang.String r2 = "POST"
            if (r1 == 0) goto L11
            java.lang.String r1 = r11.d()
            goto L12
        L11:
            r1 = r2
        L12:
            long r3 = java.lang.System.currentTimeMillis()
            r5 = 1
        L17:
            r6 = 3
            r7 = 0
            if (r5 > r6) goto L5d
            boolean r8 = r2.equalsIgnoreCase(r1)     // Catch: java.lang.Throwable -> L33
            a(r8, r5, r0)     // Catch: java.lang.Throwable -> L33
            cn.jiguang.commons.x.d r8 = c(r11)     // Catch: java.lang.Throwable -> L33
            boolean r9 = a(r8)     // Catch: java.lang.Throwable -> L33
            if (r9 == 0) goto L35
            a(r5, r3)     // Catch: java.lang.Throwable -> L33
            r11.a(r7)
            return r8
        L33:
            r0 = move-exception
            goto L72
        L35:
            boolean r9 = a(r8, r5)     // Catch: java.lang.Throwable -> L33
            if (r9 != 0) goto L4a
            int r0 = r8.d()     // Catch: java.lang.Throwable -> L33
            java.lang.String r1 = r8.a()     // Catch: java.lang.Throwable -> L33
            a(r5, r0, r1)     // Catch: java.lang.Throwable -> L33
            r11.a(r7)
            return r8
        L4a:
            if (r5 >= r6) goto L5a
            long r9 = a(r5)     // Catch: java.lang.Throwable -> L33
            java.lang.String r6 = r8.a()     // Catch: java.lang.Throwable -> L33
            a(r5, r9, r6)     // Catch: java.lang.Throwable -> L33
            c(r9)     // Catch: java.lang.Throwable -> L33
        L5a:
            int r5 = r5 + 1
            goto L17
        L5d:
            a(r3)     // Catch: java.lang.Throwable -> L33
            cn.jiguang.commons.x.d r1 = new cn.jiguang.commons.x.d     // Catch: java.lang.Throwable -> L33
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L33
            r0 = -1
            r1.a(r0)     // Catch: java.lang.Throwable -> L33
            java.lang.String r0 = "all retry attempts failed"
            r1.a(r0)     // Catch: java.lang.Throwable -> L33
            r11.a(r7)
            return r1
        L72:
            r11.a(r7)
            throw r0
    }

    public static cn.jiguang.commons.x.d e(cn.jiguang.commons.x.c r1) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.lang.String r0 = "POST"
            r1.c(r0)
            cn.jiguang.commons.x.d r1 = a(r1)
            return r1
    }
}

package com.ss.android.socialbase.downloader.az;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class m {
    private static java.util.regex.Pattern ae = null;
    private static java.lang.String cw = null;
    private static android.net.ConnectivityManager g = null;
    private static final java.lang.String j = "m";
    private static final char[] m = null;
    private static java.lang.Boolean oq;
    private static java.lang.Boolean qv;
    private static volatile android.util.SparseArray<java.lang.Boolean> r;
    private static java.util.regex.Pattern tl;
    private static volatile android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.r.c>> up;
    private static final java.util.regex.Pattern xt = null;

    static {
            java.lang.String r0 = ".*\\d+ *- *(\\d+) */ *\\d+"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.ss.android.socialbase.downloader.az.m.xt = r0
            r0 = 0
            com.ss.android.socialbase.downloader.az.m.cw = r0
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            com.ss.android.socialbase.downloader.az.m.r = r1
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            com.ss.android.socialbase.downloader.az.m.up = r1
            r1 = 16
            char[] r1 = new char[r1]
            r1 = {x0028: FILL_ARRAY_DATA , data: [48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102} // fill-array
            com.ss.android.socialbase.downloader.az.m.m = r1
            com.ss.android.socialbase.downloader.az.m.ae = r0
            com.ss.android.socialbase.downloader.az.m.tl = r0
            return
    }

    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.io.File ae() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()     // Catch: java.lang.Exception -> L5
            goto L7
        L5:
            java.lang.String r0 = ""
        L7:
            java.lang.String r1 = "mounted"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r0 = android.os.Environment.getExternalStoragePublicDirectory(r0)
            return r0
        L16:
            r0 = 0
            return r0
    }

    public static java.lang.String ae(java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r6.length()
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r1) goto L33
            char r4 = r6.charAt(r3)
            r5 = 31
            if (r4 <= r5) goto L1e
            r5 = 127(0x7f, float:1.78E-43)
            if (r4 < r5) goto L1a
            goto L1e
        L1a:
            r0.append(r4)
            goto L30
        L1e:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r5[r2] = r4
            java.lang.String r4 = "\\u%04x"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            r0.append(r4)
        L30:
            int r3 = r3 + 1
            goto Lb
        L33:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public static boolean ae(java.lang.Throwable r1) {
            com.ss.android.socialbase.downloader.downloader.f r0 = com.ss.android.socialbase.downloader.downloader.cw.n()
            boolean r1 = r0.j(r1)
            return r1
    }

    public static long cw(long r2) {
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r2
            return r0
    }

    public static java.lang.String cw(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = 0
            return r2
        L8:
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "%s.tp"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
    }

    public static void cw(java.lang.String r4, java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L35
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L35
            java.io.File r0 = new java.io.File
            r0.<init>(r4, r5)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L35
            java.lang.String r1 = com.ss.android.socialbase.downloader.az.m.j
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "deleteFile: "
            r2.<init>(r3)
            r2.append(r4)
            java.lang.String r4 = "/"
            r2.append(r4)
            r2.append(r5)
            java.lang.String r4 = r2.toString()
            com.bytedance.sdk.component.utils.vl.r(r1, r4)
            r0.delete()
        L35:
            return
    }

    private static void cw(java.lang.Throwable r2, java.lang.String r3) throws com.ss.android.socialbase.downloader.up.tl {
            com.ss.android.socialbase.downloader.downloader.f r0 = com.ss.android.socialbase.downloader.downloader.cw.n()
            r1 = 0
            com.ss.android.socialbase.downloader.up.tl r0 = r0.j(r2, r1)
            if (r0 != 0) goto L17
            com.ss.android.socialbase.downloader.downloader.f r0 = com.ss.android.socialbase.downloader.downloader.cw.n()
            java.lang.Throwable r2 = r2.getCause()
            com.ss.android.socialbase.downloader.up.tl r0 = r0.j(r2, r1)
        L17:
            if (r0 != 0) goto L1a
            return
        L1a:
            java.lang.String r2 = xt(r0, r3)
            com.ss.android.socialbase.downloader.up.tl r3 = new com.ss.android.socialbase.downloader.up.tl
            int r1 = r0.j()
            r3.<init>(r1, r2)
            java.lang.String r2 = r0.r()
            com.ss.android.socialbase.downloader.up.tl r2 = r3.cw(r2)
            throw r2
    }

    public static boolean cw() {
            java.lang.Boolean r0 = com.ss.android.socialbase.downloader.az.m.qv
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            java.lang.String r0 = r(r0)
            if (r0 == 0) goto L37
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.content.Context r2 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            java.lang.String r2 = r2.getPackageName()
            r1.append(r2)
            java.lang.String r2 = ":downloader"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            com.ss.android.socialbase.downloader.az.m.qv = r0
            goto L3b
        L37:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            com.ss.android.socialbase.downloader.az.m.qv = r0
        L3b:
            java.lang.Boolean r0 = com.ss.android.socialbase.downloader.az.m.qv
            boolean r0 = r0.booleanValue()
            return r0
    }

    public static boolean cw(int r1) {
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 == r0) goto Ld
            r0 = 201(0xc9, float:2.82E-43)
            if (r1 == r0) goto Ld
            if (r1 != 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    public static boolean cw(android.content.Context r1) {
            r0 = 0
            android.net.ConnectivityManager r1 = j(r1)     // Catch: java.lang.Exception -> L14
            if (r1 != 0) goto L8
            return r0
        L8:
            android.net.NetworkInfo r1 = r1.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L14
            if (r1 != 0) goto Lf
            return r0
        Lf:
            boolean r1 = r1.isConnected()     // Catch: java.lang.Exception -> L14
            return r1
        L14:
            return r0
    }

    public static boolean cw(com.ss.android.socialbase.downloader.ae.cw r2) {
            boolean r0 = r2.ri()
            java.lang.String r1 = r2.rn()
            boolean r2 = j(r2, r0, r1)
            return r2
    }

    public static boolean cw(com.ss.android.socialbase.downloader.g.ae r7) {
            r0 = 0
            if (r7 != 0) goto L4
            return r0
        L4:
            r1 = 8
            boolean r1 = com.ss.android.socialbase.downloader.az.j.j(r1)
            r2 = 1
            r3 = -1
            if (r1 == 0) goto L28
            java.lang.String r1 = "Transfer-Encoding"
            java.lang.String r1 = r7.j(r1)
            java.lang.String r5 = "chunked"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L27
            long r5 = j(r7)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L26
            goto L27
        L26:
            return r0
        L27:
            return r2
        L28:
            long r5 = j(r7)
            int r7 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r7 != 0) goto L31
            return r2
        L31:
            return r0
    }

    public static boolean cw(com.ss.android.socialbase.downloader.up.j r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            int r1 = r3.j()
            r2 = 1011(0x3f3, float:1.417E-42)
            if (r1 == r2) goto L1c
            java.lang.Throwable r1 = r3.getCause()
            if (r1 == 0) goto L1b
            java.lang.Throwable r3 = r3.getCause()
            boolean r3 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r3 == 0) goto L1b
            goto L1c
        L1b:
            return r0
        L1c:
            r3 = 1
            return r3
    }

    public static boolean cw(java.lang.Throwable r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = oq(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L18
            java.lang.String r1 = "network not available"
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            return r0
    }

    public static boolean cw(java.util.List<com.ss.android.socialbase.downloader.ae.up> r4) {
            r0 = 0
            if (r4 == 0) goto L48
            int r1 = r4.size()
            if (r1 != 0) goto La
            goto L48
        La:
            java.util.Iterator r4 = r4.iterator()
        Le:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L48
            java.lang.Object r1 = r4.next()
            com.ss.android.socialbase.downloader.ae.up r1 = (com.ss.android.socialbase.downloader.ae.up) r1
            if (r1 == 0) goto Le
            java.lang.String r2 = r1.j()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Le
            java.lang.String r2 = r1.xt()
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Le
            java.lang.String r2 = r1.j()
            java.lang.String r3 = "download-tc21-1-15"
            boolean r2 = r3.equals(r2)
            if (r2 == 0) goto Le
            java.lang.String r1 = r1.xt()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Le
            r4 = 1
            return r4
        L48:
            return r0
    }

    public static long g(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = "max-age=([0-9]+)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L28
            java.util.regex.Matcher r3 = r0.matcher(r3)     // Catch: java.lang.Throwable -> L28
            boolean r0 = r3.find()     // Catch: java.lang.Throwable -> L28
            if (r0 == 0) goto L2c
            r0 = 1
            java.lang.String r3 = r3.group(r0)     // Catch: java.lang.Throwable -> L23
            long r0 = java.lang.Long.parseLong(r3)     // Catch: java.lang.Throwable -> L23
            return r0
        L23:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)     // Catch: java.lang.Throwable -> L28
            goto L2c
        L28:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L2c:
            return r1
    }

    private static java.lang.String g() {
            r0 = 0
            r1 = 1
            r2 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L64
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L64
            java.io.FileInputStream r5 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L64
            java.lang.String r7 = "/proc/"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L64
            int r7 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L64
            r6.append(r7)     // Catch: java.lang.Throwable -> L64
            java.lang.String r7 = "/cmdline"
            r6.append(r7)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L64
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L64
            java.lang.String r6 = "iso-8859-1"
            r4.<init>(r5, r6)     // Catch: java.lang.Throwable -> L64
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L64
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            r4.<init>()     // Catch: java.lang.Throwable -> L65
        L30:
            int r5 = r3.read()     // Catch: java.lang.Throwable -> L65
            if (r5 <= 0) goto L3b
            char r5 = (char) r5     // Catch: java.lang.Throwable -> L65
            r4.append(r5)     // Catch: java.lang.Throwable -> L65
            goto L30
        L3b:
            boolean r5 = com.ss.android.socialbase.downloader.m.j.j()     // Catch: java.lang.Throwable -> L65
            if (r5 == 0) goto L58
            java.lang.String r5 = "Process"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = "get processName = "
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L65
            java.lang.String r7 = r4.toString()     // Catch: java.lang.Throwable -> L65
            r6.append(r7)     // Catch: java.lang.Throwable -> L65
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L65
            com.ss.android.socialbase.downloader.m.j.xt(r5, r6)     // Catch: java.lang.Throwable -> L65
        L58:
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> L65
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r0] = r3
            j(r1)
            return r2
        L64:
            r3 = r2
        L65:
            java.io.Closeable[] r1 = new java.io.Closeable[r1]
            r1[r0] = r3
            j(r1)
            return r2
    }

    public static boolean g(java.lang.Throwable r2) {
            boolean r0 = r2 instanceof com.ss.android.socialbase.downloader.up.j
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            com.ss.android.socialbase.downloader.up.j r2 = (com.ss.android.socialbase.downloader.up.j) r2
            int r2 = r2.j()
            r0 = 1055(0x41f, float:1.478E-42)
            if (r2 == r0) goto L5a
            r0 = 1023(0x3ff, float:1.434E-42)
            if (r2 == r0) goto L5a
            r0 = 1041(0x411, float:1.459E-42)
            if (r2 == r0) goto L5a
            r0 = 1022(0x3fe, float:1.432E-42)
            if (r2 == r0) goto L5a
            r0 = 1048(0x418, float:1.469E-42)
            if (r2 == r0) goto L5a
            r0 = 1056(0x420, float:1.48E-42)
            if (r2 == r0) goto L5a
            r0 = 1057(0x421, float:1.481E-42)
            if (r2 == r0) goto L5a
            r0 = 1058(0x422, float:1.483E-42)
            if (r2 == r0) goto L5a
            r0 = 1059(0x423, float:1.484E-42)
            if (r2 == r0) goto L5a
            r0 = 1060(0x424, float:1.485E-42)
            if (r2 == r0) goto L5a
            r0 = 1061(0x425, float:1.487E-42)
            if (r2 == r0) goto L5a
            r0 = 1067(0x42b, float:1.495E-42)
            if (r2 == r0) goto L5a
            r0 = 1049(0x419, float:1.47E-42)
            if (r2 == r0) goto L5a
            r0 = 1047(0x417, float:1.467E-42)
            if (r2 == r0) goto L5a
            r0 = 1051(0x41b, float:1.473E-42)
            if (r2 == r0) goto L5a
            r0 = 1004(0x3ec, float:1.407E-42)
            if (r2 == r0) goto L5a
            r0 = 1011(0x3f3, float:1.417E-42)
            if (r2 == r0) goto L5a
            r0 = 1002(0x3ea, float:1.404E-42)
            if (r2 == r0) goto L5a
            r0 = 1013(0x3f5, float:1.42E-42)
            if (r2 != r0) goto L59
            goto L5a
        L59:
            return r1
        L5a:
            r2 = 1
            return r2
    }

    public static double j(long r2) {
            double r2 = (double) r2
            r0 = 4697254411347427328(0x4130000000000000, double:1048576.0)
            double r2 = r2 / r0
            return r2
    }

    public static int j(java.io.File r0, java.lang.String r1) {
            int r0 = com.ss.android.cw.a.a(r1, r0)
            return r0
    }

    public static int j(java.lang.Object r0, int r1) {
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.ClassCastException -> L7
            int r0 = r0.intValue()     // Catch: java.lang.ClassCastException -> L7
            return r0
        L7:
            return r1
    }

    public static int j(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            int r1 = com.ss.android.cw.a.a(r3, r0)
            return r1
    }

    public static long j(com.ss.android.socialbase.downloader.g.ae r4) {
            r0 = -1
            if (r4 != 0) goto L5
            return r0
        L5:
            java.lang.String r2 = "Content-Length"
            java.lang.String r2 = xt(r4, r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto L1d
            r3 = 1
            boolean r3 = com.ss.android.socialbase.downloader.az.j.j(r3)
            if (r3 == 0) goto L1d
            long r0 = xt(r4)
            return r0
        L1d:
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L21
        L21:
            return r0
    }

    public static android.net.ConnectivityManager j(android.content.Context r1) {
            android.net.ConnectivityManager r0 = com.ss.android.socialbase.downloader.az.m.g
            if (r0 != 0) goto Lf
            java.lang.String r0 = "connectivity"
            java.lang.Object r1 = r1.getSystemService(r0)
            android.net.ConnectivityManager r1 = (android.net.ConnectivityManager) r1
            com.ss.android.socialbase.downloader.az.m.g = r1
            return r1
        Lf:
            return r0
    }

    public static com.ss.android.socialbase.downloader.ae.ae j(com.ss.android.socialbase.downloader.ae.cw r8, java.lang.String r9, java.lang.String r10, int r11) throws com.ss.android.socialbase.downloader.up.j {
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L123
            boolean r0 = android.text.TextUtils.isEmpty(r10)
            if (r0 != 0) goto L123
            java.io.File r0 = new java.io.File
            r0.<init>(r9, r10)
            boolean r10 = r0.exists()
            r1 = 1
            r2 = 0
            if (r10 == 0) goto L42
            boolean r10 = r0.isDirectory()
            if (r10 != 0) goto L20
            goto L42
        L20:
            com.ss.android.socialbase.downloader.up.j r8 = new com.ss.android.socialbase.downloader.up.j
            java.io.IOException r10 = new java.io.IOException
            boolean r11 = r0.isDirectory()
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r9
            r0[r1] = r11
            java.lang.String r9 = "path is :%s, path is directory:%B:"
            java.lang.String r9 = java.lang.String.format(r9, r0)
            r10.<init>(r9)
            r9 = 1035(0x40b, float:1.45E-42)
            r8.<init>(r9, r10)
            throw r8
        L42:
            boolean r10 = r0.exists()
            if (r10 != 0) goto L11d
            java.io.File r10 = new java.io.File     // Catch: java.io.IOException -> L114
            r10.<init>(r9)     // Catch: java.io.IOException -> L114
            boolean r3 = r10.exists()     // Catch: java.io.IOException -> L114
            if (r3 == 0) goto L59
            boolean r3 = r10.isDirectory()     // Catch: java.io.IOException -> L114
            if (r3 != 0) goto Ld7
        L59:
            boolean r3 = r10.exists()     // Catch: java.io.IOException -> L114
            if (r3 != 0) goto Ldb
            boolean r3 = r10.mkdirs()     // Catch: java.io.IOException -> L114
            if (r3 != 0) goto Ld7
            boolean r3 = r10.exists()     // Catch: java.io.IOException -> L114
            if (r3 != 0) goto Ld7
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r8)     // Catch: java.io.IOException -> L114
            java.lang.String r4 = "opt_mkdir_failed"
            int r3 = r3.j(r4, r2)     // Catch: java.io.IOException -> L114
            r4 = 1030(0x406, float:1.443E-42)
            java.lang.String r5 = "download savePath directory can not created:"
            if (r3 != r1) goto Lc5
            r1 = 0
        L7c:
            if (r2 != 0) goto L8f
            int r3 = r1 + 1
            r6 = 3
            if (r1 >= r6) goto L8f
            r6 = 10
            java.lang.Thread.sleep(r6)     // Catch: java.lang.InterruptedException -> L8e java.io.IOException -> L114
            boolean r2 = r10.mkdirs()     // Catch: java.io.IOException -> L114
            r1 = r3
            goto L7c
        L8e:
        L8f:
            if (r2 != 0) goto Ld7
            java.lang.String r8 = r8.qv()     // Catch: java.io.IOException -> L114
            long r10 = r(r8)     // Catch: java.io.IOException -> L114
            r0 = 16384(0x4000, double:8.095E-320)
            int r8 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r8 >= 0) goto Lb3
            com.ss.android.socialbase.downloader.up.j r8 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.io.IOException -> L114
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L114
            r10.<init>(r5)     // Catch: java.io.IOException -> L114
            r10.append(r9)     // Catch: java.io.IOException -> L114
            java.lang.String r9 = r10.toString()     // Catch: java.io.IOException -> L114
            r10 = 1006(0x3ee, float:1.41E-42)
            r8.<init>(r10, r9)     // Catch: java.io.IOException -> L114
            throw r8     // Catch: java.io.IOException -> L114
        Lb3:
            com.ss.android.socialbase.downloader.up.j r8 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.io.IOException -> L114
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L114
            r10.<init>(r5)     // Catch: java.io.IOException -> L114
            r10.append(r9)     // Catch: java.io.IOException -> L114
            java.lang.String r9 = r10.toString()     // Catch: java.io.IOException -> L114
            r8.<init>(r4, r9)     // Catch: java.io.IOException -> L114
            throw r8     // Catch: java.io.IOException -> L114
        Lc5:
            com.ss.android.socialbase.downloader.up.j r8 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.io.IOException -> L114
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L114
            r10.<init>(r5)     // Catch: java.io.IOException -> L114
            r10.append(r9)     // Catch: java.io.IOException -> L114
            java.lang.String r9 = r10.toString()     // Catch: java.io.IOException -> L114
            r8.<init>(r4, r9)     // Catch: java.io.IOException -> L114
            throw r8     // Catch: java.io.IOException -> L114
        Ld7:
            r0.createNewFile()     // Catch: java.io.IOException -> L114
            goto L11d
        Ldb:
            r10.delete()     // Catch: java.io.IOException -> L114
            boolean r8 = r10.mkdirs()     // Catch: java.io.IOException -> L114
            r11 = 1031(0x407, float:1.445E-42)
            if (r8 != 0) goto L100
            boolean r8 = r10.exists()     // Catch: java.io.IOException -> L114
            if (r8 != 0) goto L100
            com.ss.android.socialbase.downloader.up.j r8 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.io.IOException -> L114
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L114
            java.lang.String r0 = "download savePath is not directory:path="
            r10.<init>(r0)     // Catch: java.io.IOException -> L114
            r10.append(r9)     // Catch: java.io.IOException -> L114
            java.lang.String r9 = r10.toString()     // Catch: java.io.IOException -> L114
            r8.<init>(r11, r9)     // Catch: java.io.IOException -> L114
            throw r8     // Catch: java.io.IOException -> L114
        L100:
            com.ss.android.socialbase.downloader.up.j r8 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.io.IOException -> L114
            java.lang.StringBuilder r10 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L114
            java.lang.String r0 = "download savePath is not directory:"
            r10.<init>(r0)     // Catch: java.io.IOException -> L114
            r10.append(r9)     // Catch: java.io.IOException -> L114
            java.lang.String r9 = r10.toString()     // Catch: java.io.IOException -> L114
            r8.<init>(r11, r9)     // Catch: java.io.IOException -> L114
            throw r8     // Catch: java.io.IOException -> L114
        L114:
            r8 = move-exception
            com.ss.android.socialbase.downloader.up.j r9 = new com.ss.android.socialbase.downloader.up.j
            r10 = 1036(0x40c, float:1.452E-42)
            r9.<init>(r10, r8)
            throw r9
        L11d:
            com.ss.android.socialbase.downloader.ae.ae r8 = new com.ss.android.socialbase.downloader.ae.ae
            r8.<init>(r0, r11)
            return r8
        L123:
            com.ss.android.socialbase.downloader.up.j r8 = new com.ss.android.socialbase.downloader.up.j
            java.io.IOException r9 = new java.io.IOException
            java.lang.String r10 = "path must be not empty"
            r9.<init>(r10)
            r10 = 1021(0x3fd, float:1.431E-42)
            r8.<init>(r10, r9)
            throw r8
    }

    public static java.lang.String j(com.ss.android.socialbase.downloader.g.ae r1, java.lang.String r2) {
            java.lang.String r0 = "Content-Disposition"
            java.lang.String r1 = r1.j(r0)
            java.lang.String r1 = oq(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L14
            java.lang.String r1 = up(r2)
        L14:
            return r1
    }

    private static java.lang.String j(java.io.File r4, boolean r5) {
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            boolean r1 = j(r4)
            if (r1 == 0) goto Lf
            java.lang.String r4 = r4.getAbsolutePath()
            return r4
        Lf:
            android.content.pm.ApplicationInfo r4 = r0.getApplicationInfo()
            int r4 = r4.targetSdkVersion
            int r1 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "fix_save_external_dir"
            r3 = 29
            if (r1 < r3) goto L42
            if (r4 != r3) goto L25
            boolean r1 = com.bumptech.glide.load.model.stream.g.a()
            if (r1 == 0) goto L27
        L25:
            if (r4 <= r3) goto L42
        L27:
            com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.cw()
            int r4 = r4.xt(r2)
            if (r4 > 0) goto L6e
            java.lang.String r4 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r4 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r0, r4)
            boolean r5 = j(r4)
            if (r5 == 0) goto L6e
            java.lang.String r4 = r4.getAbsolutePath()
            return r4
        L42:
            if (r5 == 0) goto L53
            java.io.File r4 = ae()
            boolean r5 = j(r4)
            if (r5 == 0) goto L53
            java.lang.String r4 = r4.getAbsolutePath()
            return r4
        L53:
            com.ss.android.socialbase.downloader.jy.j r4 = com.ss.android.socialbase.downloader.jy.j.cw()
            int r4 = r4.xt(r2)
            if (r4 > 0) goto L6e
            java.lang.String r4 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r4 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r0, r4)
            boolean r5 = j(r4)
            if (r5 == 0) goto L6e
            java.lang.String r4 = r4.getAbsolutePath()
            return r4
        L6e:
            java.io.File r4 = com.bytedance.sdk.openadsdk.api.plugin.xt.j(r0)
            java.lang.String r4 = r4.getAbsolutePath()
            return r4
    }

    public static java.lang.String j(java.lang.Object r0, java.lang.String r1) {
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.ClassCastException -> L3
            return r0
        L3:
            return r1
    }

    public static java.lang.String j(java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L8
            r5 = 0
            return r5
        L8:
            int r0 = r5.length()
            int r0 = r0 / 2
            byte[] r1 = new byte[r0]
            r2 = 0
        L11:
            if (r2 >= r0) goto L2e
            int r3 = r2 * 2
            int r4 = r3 + 2
            java.lang.String r3 = r5.substring(r3, r4)     // Catch: java.lang.Exception -> L27
            r4 = 16
            int r3 = java.lang.Integer.parseInt(r3, r4)     // Catch: java.lang.Exception -> L27
            r3 = r3 & 255(0xff, float:3.57E-43)
            byte r3 = (byte) r3     // Catch: java.lang.Exception -> L27
            r1[r2] = r3     // Catch: java.lang.Exception -> L27
            goto L2b
        L27:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L2b:
            int r2 = r2 + 1
            goto L11
        L2e:
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> L37
            java.lang.String r2 = "utf-8"
            r0.<init>(r1, r2)     // Catch: java.lang.Exception -> L37
            r5 = r0
            goto L3b
        L37:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L3b:
            return r5
    }

    public static java.lang.String j(java.lang.String r1, int r2) {
            if (r2 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L17
            int r0 = r1.length()
            if (r0 > r2) goto L12
            goto L17
        L12:
            r0 = 0
            java.lang.String r1 = r1.substring(r0, r2)
        L17:
            return r1
    }

    public static java.lang.String j(java.lang.String r2, com.ss.android.socialbase.downloader.jy.j r3) {
            if (r3 == 0) goto L5e
            java.lang.String r0 = "download_dir"
            org.json.JSONObject r3 = r3.r(r0)
            if (r3 == 0) goto L5e
            java.lang.String r0 = "dir_name"
            java.lang.String r3 = r3.optString(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 1
            if (r0 != 0) goto L23
            java.lang.String r0 = "/"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L23
            java.lang.String r3 = r3.substring(r1)
        L23:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L5d
            java.lang.String r0 = "%s"
            boolean r0 = r3.contains(r0)
            if (r0 != 0) goto L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            goto L4c
        L41:
            java.lang.Object[] r0 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L4b
            r1 = 0
            r0[r1] = r2     // Catch: java.lang.Throwable -> L4b
            java.lang.String r3 = java.lang.String.format(r3, r0)     // Catch: java.lang.Throwable -> L4b
            goto L4c
        L4b:
        L4c:
            int r2 = r3.length()
            r0 = 255(0xff, float:3.57E-43)
            if (r2 <= r0) goto L5d
            int r2 = r3.length()
            int r2 = r2 - r0
            java.lang.String r3 = r3.substring(r2)
        L5d:
            return r3
        L5e:
            java.lang.String r2 = ""
            return r2
    }

    public static java.lang.String j(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L22
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Ld
            goto L22
        Ld:
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = java.io.File.separator
            r1 = 1
            r0[r1] = r2
            r2 = 2
            r0[r2] = r3
            java.lang.String r2 = "%s%s%s"
            java.lang.String r2 = java.lang.String.format(r2, r0)
            return r2
        L22:
            r2 = 0
            return r2
    }

    public static java.lang.String j(byte[] r2) {
            if (r2 == 0) goto L9
            r0 = 0
            int r1 = r2.length
            java.lang.String r2 = j(r2, r0, r1)
            return r2
        L9:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r0 = "bytes is null"
            r2.<init>(r0)
            throw r2
    }

    public static java.lang.String j(byte[] r9, int r10, int r11) {
            if (r9 == 0) goto L39
            if (r10 < 0) goto L33
            int r0 = r10 + r11
            int r1 = r9.length
            if (r0 > r1) goto L33
            int r0 = r11 * 2
            char[] r1 = new char[r0]
            r2 = 0
            r3 = 0
            r4 = 0
        L10:
            if (r3 >= r11) goto L2d
            int r5 = r3 + r10
            r5 = r9[r5]
            r6 = r5 & 255(0xff, float:3.57E-43)
            int r7 = r4 + 1
            char[] r8 = com.ss.android.socialbase.downloader.az.m.m
            int r6 = r6 >> 4
            char r6 = r8[r6]
            r1[r4] = r6
            int r4 = r4 + 2
            r5 = r5 & 15
            char r5 = r8[r5]
            r1[r7] = r5
            int r3 = r3 + 1
            goto L10
        L2d:
            java.lang.String r9 = new java.lang.String
            r9.<init>(r1, r2, r0)
            return r9
        L33:
            java.lang.IndexOutOfBoundsException r9 = new java.lang.IndexOutOfBoundsException
            r9.<init>()
            throw r9
        L39:
            java.lang.NullPointerException r9 = new java.lang.NullPointerException
            java.lang.String r10 = "bytes is null"
            r9.<init>(r10)
            throw r9
    }

    public static <K> java.util.HashMap<java.lang.Integer, K> j(android.util.SparseArray<K> r5) {
            if (r5 != 0) goto L4
            r5 = 0
            return r5
        L4:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            int r1 = r5.size()
            r2 = 0
        Le:
            if (r2 >= r1) goto L22
            int r3 = r5.keyAt(r2)
            java.lang.Object r4 = r5.valueAt(r2)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r0.put(r3, r4)
            int r2 = r2 + 1
            goto Le
        L22:
            return r0
    }

    public static java.util.List<com.ss.android.socialbase.downloader.ae.xt> j(java.util.List<com.ss.android.socialbase.downloader.ae.xt> r7) {
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            android.util.SparseArray r1 = new android.util.SparseArray
            r1.<init>()
            java.util.Iterator r2 = r7.iterator()
        Le:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L8a
            java.lang.Object r3 = r2.next()
            com.ss.android.socialbase.downloader.ae.xt r3 = (com.ss.android.socialbase.downloader.ae.xt) r3
            if (r3 == 0) goto Le
            boolean r4 = r3.r()
            if (r4 == 0) goto L4d
            int r4 = r3.mi()
            r0.put(r4, r3)
            int r4 = r3.mi()
            java.lang.Object r4 = r1.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto Le
            java.util.Iterator r5 = r4.iterator()
        L39:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L49
            java.lang.Object r6 = r5.next()
            com.ss.android.socialbase.downloader.ae.xt r6 = (com.ss.android.socialbase.downloader.ae.xt) r6
            r6.j(r3)
            goto L39
        L49:
            r3.j(r4)
            goto Le
        L4d:
            int r4 = r3.xt()
            java.lang.Object r4 = r0.get(r4)
            com.ss.android.socialbase.downloader.ae.xt r4 = (com.ss.android.socialbase.downloader.ae.xt) r4
            if (r4 == 0) goto L6e
            java.util.List r5 = r4.ae()
            if (r5 != 0) goto L67
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            r4.j(r5)
        L67:
            r3.j(r4)
            r5.add(r3)
            goto Le
        L6e:
            int r4 = r3.xt()
            java.lang.Object r4 = r1.get(r4)
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L86
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            int r5 = r3.xt()
            r1.put(r5, r4)
        L86:
            r4.add(r3)
            goto Le
        L8a:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
        L90:
            int r3 = r0.size()
            if (r2 >= r3) goto La4
            int r3 = r0.keyAt(r2)
            java.lang.Object r3 = r0.get(r3)
            r1.add(r3)
            int r2 = r2 + 1
            goto L90
        La4:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto Lab
            return r7
        Lab:
            return r1
    }

    public static java.util.List<com.ss.android.socialbase.downloader.ae.up> j(java.util.List<com.ss.android.socialbase.downloader.ae.up> r4, java.lang.String r5, long r6, long r8) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto L23
            int r1 = r4.size()
            if (r1 <= 0) goto L23
            java.util.Iterator r4 = r4.iterator()
        L11:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L23
            java.lang.Object r1 = r4.next()
            com.ss.android.socialbase.downloader.ae.up r1 = (com.ss.android.socialbase.downloader.ae.up) r1
            if (r1 == 0) goto L11
            r0.add(r1)
            goto L11
        L23:
            boolean r4 = android.text.TextUtils.isEmpty(r5)
            if (r4 != 0) goto L33
            com.ss.android.socialbase.downloader.ae.up r4 = new com.ss.android.socialbase.downloader.ae.up
            java.lang.String r1 = "If-Match"
            r4.<init>(r1, r5)
            r0.add(r4)
        L33:
            com.ss.android.socialbase.downloader.ae.up r4 = new com.ss.android.socialbase.downloader.ae.up
            java.lang.String r5 = "Accept-Encoding"
            java.lang.String r1 = "identity"
            r4.<init>(r5, r1)
            r0.add(r4)
            r4 = 0
            r1 = 0
            r2 = 1
            int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r3 > 0) goto L56
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.Object[] r5 = new java.lang.Object[r2]
            r5[r1] = r4
            java.lang.String r4 = "bytes=%s-"
            java.lang.String r4 = java.lang.String.format(r4, r5)
            goto L6b
        L56:
            java.lang.String r4 = java.lang.String.valueOf(r6)
            java.lang.String r5 = java.lang.String.valueOf(r8)
            r3 = 2
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r1] = r4
            r3[r2] = r5
            java.lang.String r4 = "bytes=%s-%s"
            java.lang.String r4 = java.lang.String.format(r4, r3)
        L6b:
            com.ss.android.socialbase.downloader.ae.up r5 = new com.ss.android.socialbase.downloader.ae.up
            java.lang.String r1 = "Range"
            r5.<init>(r1, r4)
            r0.add(r5)
            java.lang.String r5 = com.ss.android.socialbase.downloader.az.m.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = " range CurrentOffset:"
            r1.<init>(r2)
            r1.append(r6)
            java.lang.String r6 = " EndOffset:"
            r1.append(r6)
            r1.append(r8)
            java.lang.String r6 = ", range = "
            r1.append(r6)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r5, r4)
            return r0
    }

    public static java.util.List<com.ss.android.socialbase.downloader.ae.up> j(java.util.List<com.ss.android.socialbase.downloader.ae.up> r6, java.lang.String r7, com.ss.android.socialbase.downloader.ae.xt r8) {
            long r2 = r8.jy()
            long r4 = r8.av()
            r0 = r6
            r1 = r7
            java.util.List r6 = j(r0, r1, r2, r4)
            return r6
    }

    private static void j(int r3, boolean r4, com.ss.android.socialbase.downloader.up.j r5) {
            android.util.SparseArray<java.lang.Boolean> r0 = com.ss.android.socialbase.downloader.az.m.r
            monitor-enter(r0)
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.r.c>> r1 = com.ss.android.socialbase.downloader.az.m.up     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Throwable -> L25
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L25
            if (r1 == 0) goto L2b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L25
        L11:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L2b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L25
            com.ss.android.socialbase.downloader.r.c r2 = (com.ss.android.socialbase.downloader.r.c) r2     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L11
            if (r4 == 0) goto L27
            r2.j()     // Catch: java.lang.Throwable -> L25
            goto L11
        L25:
            r3 = move-exception
            goto L45
        L27:
            r2.j(r5)     // Catch: java.lang.Throwable -> L25
            goto L11
        L2b:
            java.lang.String r4 = com.ss.android.socialbase.downloader.az.m.j     // Catch: java.lang.Throwable -> L25
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25
            java.lang.String r1 = "handleTempSaveCallback id:"
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L25
            r5.append(r3)     // Catch: java.lang.Throwable -> L25
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> L25
            com.ss.android.socialbase.downloader.m.j.xt(r4, r5)     // Catch: java.lang.Throwable -> L25
            android.util.SparseArray<java.lang.Boolean> r4 = com.ss.android.socialbase.downloader.az.m.r     // Catch: java.lang.Throwable -> L25
            r4.remove(r3)     // Catch: java.lang.Throwable -> L25
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            return
        L45:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L25
            throw r3
    }

    public static <K> void j(android.util.SparseArray<K> r3, java.util.Map<java.lang.Integer, K> r4) {
            if (r4 == 0) goto L27
            if (r3 != 0) goto L5
            goto L27
        L5:
            java.util.Set r0 = r4.keySet()
            java.util.Iterator r0 = r0.iterator()
        Ld:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L27
            java.lang.Object r1 = r0.next()
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 == 0) goto Ld
            java.lang.Object r2 = r4.get(r1)
            int r1 = r1.intValue()
            r3.put(r1, r2)
            goto Ld
        L27:
            return
    }

    public static void j(com.ss.android.socialbase.downloader.ae.cw r1) {
            r0 = 1
            j(r1, r0)
            return
    }

    public static void j(com.ss.android.socialbase.downloader.ae.cw r22, com.ss.android.socialbase.downloader.r.l r23, com.ss.android.socialbase.downloader.r.c r24) {
            r1 = r22
            r0 = r23
            r2 = r24
            java.lang.String r3 = com.ss.android.socialbase.downloader.az.m.j
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "saveFileAsTargetName targetName is "
            r4.<init>(r5)
            java.lang.String r5 = r1.ws()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r3, r4)
            r4 = 1038(0x40e, float:1.455E-42)
            android.util.SparseArray<java.lang.Boolean> r5 = com.ss.android.socialbase.downloader.az.m.r     // Catch: java.lang.Throwable -> Lcb
            monitor-enter(r5)     // Catch: java.lang.Throwable -> Lcb
            android.util.SparseArray<java.lang.Boolean> r6 = com.ss.android.socialbase.downloader.az.m.r     // Catch: java.lang.Throwable -> L54
            int r7 = r1.ae()     // Catch: java.lang.Throwable -> L54
            java.lang.Object r6 = r6.get(r7)     // Catch: java.lang.Throwable -> L54
            java.lang.Boolean r7 = java.lang.Boolean.TRUE     // Catch: java.lang.Throwable -> L54
            if (r6 != r7) goto L5c
            java.lang.String r0 = "has another same task is saving temp file"
            com.ss.android.socialbase.downloader.m.j.xt(r3, r0)     // Catch: java.lang.Throwable -> L54
            if (r2 == 0) goto L5a
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.r.c>> r0 = com.ss.android.socialbase.downloader.az.m.up     // Catch: java.lang.Throwable -> L54
            int r3 = r1.ae()     // Catch: java.lang.Throwable -> L54
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L54
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Throwable -> L54
            if (r0 != 0) goto L57
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L54
            r0.<init>()     // Catch: java.lang.Throwable -> L54
            android.util.SparseArray<java.util.List<com.ss.android.socialbase.downloader.r.c>> r3 = com.ss.android.socialbase.downloader.az.m.up     // Catch: java.lang.Throwable -> L54
            int r1 = r1.ae()     // Catch: java.lang.Throwable -> L54
            r3.put(r1, r0)     // Catch: java.lang.Throwable -> L54
            goto L57
        L54:
            r0 = move-exception
            goto L249
        L57:
            r0.add(r2)     // Catch: java.lang.Throwable -> L54
        L5a:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L54
            return
        L5c:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L54
            java.lang.String r8 = "saveTempFileStatusMap put id:"
            r6.<init>(r8)     // Catch: java.lang.Throwable -> L54
            int r8 = r1.ae()     // Catch: java.lang.Throwable -> L54
            r6.append(r8)     // Catch: java.lang.Throwable -> L54
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L54
            com.ss.android.socialbase.downloader.m.j.xt(r3, r6)     // Catch: java.lang.Throwable -> L54
            android.util.SparseArray<java.lang.Boolean> r6 = com.ss.android.socialbase.downloader.az.m.r     // Catch: java.lang.Throwable -> L54
            int r8 = r1.ae()     // Catch: java.lang.Throwable -> L54
            r6.put(r8, r7)     // Catch: java.lang.Throwable -> L54
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L54
            java.io.File r5 = new java.io.File     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r6 = r1.vl()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r7 = r1.jy()     // Catch: java.lang.Throwable -> Lcb
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> Lcb
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r7 = r1.qv()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r8 = r1.tl()     // Catch: java.lang.Throwable -> Lcb
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r7 = r1.qv()     // Catch: java.lang.Throwable -> Lcb
            boolean r7 = tl(r7)     // Catch: java.lang.Throwable -> Lcb
            boolean r8 = r6.exists()     // Catch: java.lang.Throwable -> Lcb
            r9 = 4
            r11 = 2
            r12 = 1005(0x3ed, float:1.408E-42)
            r13 = 0
            r14 = 1
            r15 = 0
            if (r8 == 0) goto L164
            java.lang.String r8 = "targetFile exist"
            com.ss.android.socialbase.downloader.m.j.xt(r3, r8)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r8 = r1.rn()     // Catch: java.lang.Throwable -> Lcb
            int r8 = j(r6, r8)     // Catch: java.lang.Throwable -> Lcb
            boolean r16 = j(r8)     // Catch: java.lang.Throwable -> Lcb
            if (r16 == 0) goto Ldb
            java.lang.String r0 = "tempFile not exist , targetFile exists and md5 check valid"
            com.ss.android.socialbase.downloader.m.j.xt(r3, r0)     // Catch: java.lang.Throwable -> Lcb
            r1.j(r8)     // Catch: java.lang.Throwable -> Lcb
            if (r2 == 0) goto Lce
            r2.j()     // Catch: java.lang.Throwable -> Lcb
            goto Lce
        Lcb:
            r0 = move-exception
            goto L24b
        Lce:
            int r0 = r1.ae()     // Catch: java.lang.Throwable -> Lcb
            j(r0, r14, r13)     // Catch: java.lang.Throwable -> Lcb
            r16 = 3
            r18 = 1
            goto L19f
        Ldb:
            boolean r3 = r5.exists()     // Catch: java.lang.Throwable -> Lcb
            if (r3 != 0) goto L11d
            com.ss.android.socialbase.downloader.up.j r3 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> Lcb
            r16 = 3
            java.lang.String r10 = "Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist and target file is exist but md5 verify invalid :%s"
            java.lang.String r17 = r1.vl()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r18 = r1.jy()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r19 = r1.qv()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r20 = r1.tl()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r21 = xt(r8)     // Catch: java.lang.Throwable -> Lcb
            r13 = 5
            java.lang.Object[] r13 = new java.lang.Object[r13]     // Catch: java.lang.Throwable -> Lcb
            r13[r15] = r17     // Catch: java.lang.Throwable -> Lcb
            r13[r14] = r18     // Catch: java.lang.Throwable -> Lcb
            r13[r11] = r19     // Catch: java.lang.Throwable -> Lcb
            r13[r16] = r20     // Catch: java.lang.Throwable -> Lcb
            r13[r9] = r21     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r10 = java.lang.String.format(r10, r13)     // Catch: java.lang.Throwable -> Lcb
            r3.<init>(r12, r10)     // Catch: java.lang.Throwable -> Lcb
            if (r2 == 0) goto L114
            r2.j(r3)     // Catch: java.lang.Throwable -> Lcb
        L114:
            int r10 = r1.ae()     // Catch: java.lang.Throwable -> Lcb
            j(r10, r15, r3)     // Catch: java.lang.Throwable -> Lcb
            r3 = 0
            goto L120
        L11d:
            r16 = 3
            r3 = 1
        L120:
            if (r7 == 0) goto L13a
            boolean r10 = r6.delete()     // Catch: java.lang.Throwable -> Lcb
            if (r10 != 0) goto L13a
            if (r3 != 0) goto L13d
            if (r0 == 0) goto L13a
            com.ss.android.socialbase.downloader.up.j r8 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r10 = "tempFile is not exist and target file is exist but md5 verify invalid, delete target file failed"
            r8.<init>(r4, r10)     // Catch: java.lang.Throwable -> Lcb
            int r10 = r1.i()     // Catch: java.lang.Throwable -> Lcb
            com.ss.android.socialbase.downloader.tl.j.j(r0, r1, r8, r10)     // Catch: java.lang.Throwable -> Lcb
        L13a:
            r18 = 1
            goto L1a4
        L13d:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> Lcb
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r10 = "delete targetPath file existed with md5 check invalid status:"
            r3.<init>(r10)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r8 = xt(r8)     // Catch: java.lang.Throwable -> Lcb
            r3.append(r8)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> Lcb
            r8 = 1037(0x40d, float:1.453E-42)
            r0.<init>(r8, r3)     // Catch: java.lang.Throwable -> Lcb
            if (r2 == 0) goto L15b
            r2.j(r0)     // Catch: java.lang.Throwable -> Lcb
        L15b:
            int r3 = r1.ae()     // Catch: java.lang.Throwable -> Lcb
            j(r3, r15, r0)     // Catch: java.lang.Throwable -> Lcb
            r3 = 0
            goto L13a
        L164:
            r16 = 3
            boolean r0 = r5.exists()     // Catch: java.lang.Throwable -> Lcb
            if (r0 != 0) goto L1a1
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = "Can't save the temp downloaded file(%s/%s) to the target file(%s/%s) because tempFile is not exist"
            java.lang.String r8 = r1.vl()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r10 = r1.jy()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r13 = r1.qv()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r17 = r1.tl()     // Catch: java.lang.Throwable -> Lcb
            r18 = 1
            java.lang.Object[] r14 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Lcb
            r14[r15] = r8     // Catch: java.lang.Throwable -> Lcb
            r14[r18] = r10     // Catch: java.lang.Throwable -> Lcb
            r14[r11] = r13     // Catch: java.lang.Throwable -> Lcb
            r14[r16] = r17     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r3 = java.lang.String.format(r3, r14)     // Catch: java.lang.Throwable -> Lcb
            r0.<init>(r12, r3)     // Catch: java.lang.Throwable -> Lcb
            if (r2 == 0) goto L198
            r2.j(r0)     // Catch: java.lang.Throwable -> Lcb
        L198:
            int r3 = r1.ae()     // Catch: java.lang.Throwable -> Lcb
            j(r3, r15, r0)     // Catch: java.lang.Throwable -> Lcb
        L19f:
            r3 = 0
            goto L1a4
        L1a1:
            r18 = 1
            r3 = 1
        L1a4:
            if (r3 == 0) goto L272
            int r0 = r1.ae()     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            java.lang.String r3 = "download_finish_check_ttmd5"
            int r0 = r0.j(r3, r11)     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            if (r0 <= 0) goto L1e7
            java.lang.String r3 = r1.rn()     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            int r3 = j(r5, r3)     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            r1.j(r3)     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            if (r0 < r11) goto L1e7
            boolean r0 = j(r3)     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            if (r0 != 0) goto L1e7
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            java.lang.String r3 = xt(r3)     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            r5 = 1034(0x40a, float:1.449E-42)
            r0.<init>(r5, r3)     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            if (r2 == 0) goto L1dc
            r2.j(r0)     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            goto L1dc
        L1da:
            r0 = move-exception
            goto L1ef
        L1dc:
            int r3 = r1.ae()     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            j(r3, r15, r0)     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            j(r1, r7)     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            return
        L1e7:
            boolean r0 = xt(r5, r6)     // Catch: java.lang.Throwable -> Lcb com.ss.android.socialbase.downloader.up.j -> L1da
            r0 = r0 ^ 1
            r3 = 0
            goto L204
        L1ef:
            int r3 = r1.ae()     // Catch: java.lang.Throwable -> Lcb
            com.ss.android.socialbase.downloader.jy.j r3 = com.ss.android.socialbase.downloader.jy.j.j(r3)     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r5 = "fix_file_rename_failed"
            boolean r3 = r3.j(r5)     // Catch: java.lang.Throwable -> Lcb
            if (r3 == 0) goto L202
            r3 = r0
            r0 = 1
            goto L204
        L202:
            r3 = r0
            r0 = 0
        L204:
            if (r0 == 0) goto L23a
            if (r3 != 0) goto L22d
            com.ss.android.socialbase.downloader.up.j r3 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = "Can't save the temp downloaded file(%s/%s) to the target file(%s/%s)"
            java.lang.String r5 = r1.vl()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r6 = r1.jy()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r7 = r1.qv()     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r8 = r1.tl()     // Catch: java.lang.Throwable -> Lcb
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch: java.lang.Throwable -> Lcb
            r9[r15] = r5     // Catch: java.lang.Throwable -> Lcb
            r9[r18] = r6     // Catch: java.lang.Throwable -> Lcb
            r9[r11] = r7     // Catch: java.lang.Throwable -> Lcb
            r9[r16] = r8     // Catch: java.lang.Throwable -> Lcb
            java.lang.String r0 = java.lang.String.format(r0, r9)     // Catch: java.lang.Throwable -> Lcb
            r3.<init>(r4, r0)     // Catch: java.lang.Throwable -> Lcb
        L22d:
            if (r2 == 0) goto L232
            r2.j(r3)     // Catch: java.lang.Throwable -> Lcb
        L232:
            int r0 = r1.ae()     // Catch: java.lang.Throwable -> Lcb
            j(r0, r15, r3)     // Catch: java.lang.Throwable -> Lcb
            goto L272
        L23a:
            if (r2 == 0) goto L23f
            r2.j()     // Catch: java.lang.Throwable -> Lcb
        L23f:
            int r0 = r1.ae()     // Catch: java.lang.Throwable -> Lcb
            r1 = 0
            r3 = 1
            j(r0, r3, r1)     // Catch: java.lang.Throwable -> Lcb
            goto L272
        L249:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L54
            throw r0     // Catch: java.lang.Throwable -> Lcb
        L24b:
            java.lang.String r1 = com.ss.android.socialbase.downloader.az.m.j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "saveFileAsTargetName throwable "
            r3.<init>(r5)
            java.lang.String r5 = r0.getMessage()
            r3.append(r5)
            java.lang.String r3 = r3.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r1, r3)
            if (r2 == 0) goto L272
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            java.lang.String r3 = "saveFileAsTargetName"
            java.lang.String r0 = xt(r0, r3)
            r1.<init>(r4, r0)
            r2.j(r1)
        L272:
            return
    }

    public static void j(com.ss.android.socialbase.downloader.ae.cw r6, java.lang.String r7) throws com.ss.android.socialbase.downloader.up.j {
            if (r6 == 0) goto L92
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L92
            java.lang.String r0 = r6.tl()
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L14
            goto L92
        L14:
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r6.qv()
            r0.<init>(r1, r7)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = r6.qv()
            java.lang.String r3 = r6.tl()
            r1.<init>(r2, r3)
            java.lang.String r2 = com.ss.android.socialbase.downloader.az.m.j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "copyFileFromExistFileWithSameName: existFile:"
            r3.<init>(r4)
            java.lang.String r4 = r0.getPath()
            r3.append(r4)
            java.lang.String r4 = " targetFile:"
            r3.append(r4)
            java.lang.String r4 = r1.getPath()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.bytedance.sdk.component.utils.vl.r(r2, r3)
            boolean r2 = r1.exists()
            r3 = 1001(0x3e9, float:1.403E-42)
            if (r2 == 0) goto L64
            boolean r2 = r1.canWrite()
            if (r2 == 0) goto L5c
            goto L64
        L5c:
            com.ss.android.socialbase.downloader.up.j r6 = new com.ss.android.socialbase.downloader.up.j
            java.lang.String r7 = "targetPath file exists but read-only"
            r6.<init>(r3, r7)
            throw r6
        L64:
            boolean r0 = j(r0, r1)
            if (r0 == 0) goto L6b
            goto L92
        L6b:
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            java.lang.String r1 = r6.qv()
            java.lang.String r2 = r6.qv()
            java.lang.String r6 = r6.tl()
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r1
            r1 = 1
            r4[r1] = r7
            r7 = 2
            r4[r7] = r2
            r7 = 3
            r4[r7] = r6
            java.lang.String r6 = "Can't copy the exist file(%s/%s) to the target file(%s/%s)"
            java.lang.String r6 = java.lang.String.format(r6, r4)
            r0.<init>(r3, r6)
            throw r0
        L92:
            return
    }

    public static void j(com.ss.android.socialbase.downloader.ae.cw r2, boolean r3) {
            if (r2 != 0) goto L3
            goto L4f
        L3:
            if (r3 == 0) goto L10
            java.lang.String r0 = r2.qv()     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r2.tl()     // Catch: java.lang.Throwable -> L50
            cw(r0, r1)     // Catch: java.lang.Throwable -> L50
        L10:
            java.lang.String r0 = r2.vl()     // Catch: java.lang.Throwable -> L50
            java.lang.String r1 = r2.jy()     // Catch: java.lang.Throwable -> L50
            cw(r0, r1)     // Catch: java.lang.Throwable -> L50
            boolean r0 = r2.ag()     // Catch: java.lang.Throwable -> L50
            if (r0 == 0) goto L24
            xt(r2)     // Catch: java.lang.Throwable -> L50
        L24:
            if (r3 == 0) goto L4f
            java.lang.String r3 = r2.oq()     // Catch: java.lang.Throwable -> L50
            java.lang.String r3 = up(r3)     // Catch: java.lang.Throwable -> L50
            boolean r0 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L4f
            java.lang.String r0 = r2.qv()     // Catch: java.lang.Throwable -> L50
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L50
            if (r0 != 0) goto L4f
            java.lang.String r0 = r2.qv()     // Catch: java.lang.Throwable -> L50
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L50
            if (r3 == 0) goto L4f
            java.lang.String r2 = r2.qv()     // Catch: java.lang.Throwable -> L50
            qv(r2)     // Catch: java.lang.Throwable -> L50
        L4f:
            return
        L50:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
            return
    }

    public static void j(java.io.IOException r1, java.lang.String r2) throws com.ss.android.socialbase.downloader.up.j {
            if (r2 != 0) goto L4
            java.lang.String r2 = ""
        L4:
            java.lang.String r2 = xt(r1, r2)
            boolean r0 = r1 instanceof java.net.ConnectException
            if (r0 != 0) goto Ld6
            boolean r0 = r1 instanceof java.net.UnknownHostException
            if (r0 != 0) goto Lce
            boolean r0 = r1 instanceof java.net.NoRouteToHostException
            if (r0 != 0) goto Lc6
            boolean r0 = r1 instanceof java.net.UnknownServiceException
            if (r0 != 0) goto Lbe
            boolean r0 = r1 instanceof java.net.PortUnreachableException
            if (r0 != 0) goto Lb6
            boolean r0 = r1 instanceof java.net.SocketTimeoutException
            if (r0 != 0) goto Lae
            boolean r0 = r1 instanceof java.net.SocketException
            if (r0 != 0) goto La6
            boolean r0 = r1 instanceof java.net.HttpRetryException
            if (r0 != 0) goto L9e
            boolean r0 = r1 instanceof java.net.ProtocolException
            if (r0 != 0) goto L96
            boolean r0 = r1 instanceof java.net.MalformedURLException
            if (r0 != 0) goto L8e
            boolean r0 = r1 instanceof java.io.FileNotFoundException
            if (r0 != 0) goto L86
            boolean r0 = r1 instanceof java.io.InterruptedIOException
            if (r0 != 0) goto L7e
            boolean r0 = r1 instanceof java.io.UnsupportedEncodingException
            if (r0 != 0) goto L76
            boolean r0 = r1 instanceof java.io.EOFException
            if (r0 != 0) goto L6e
            boolean r0 = r1 instanceof okhttp3.internal.http2.StreamResetException
            if (r0 != 0) goto L66
            boolean r0 = r1 instanceof javax.net.ssl.SSLException
            if (r0 != 0) goto L5e
            boolean r1 = tl(r1)
            if (r1 == 0) goto L56
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1006(0x3ee, float:1.41E-42)
            r1.<init>(r0, r2)
            throw r1
        L56:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1023(0x3ff, float:1.434E-42)
            r1.<init>(r0, r2)
            throw r1
        L5e:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1011(0x3f3, float:1.417E-42)
            r1.<init>(r0, r2)
            throw r1
        L66:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1067(0x42b, float:1.495E-42)
            r1.<init>(r0, r2)
            throw r1
        L6e:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1066(0x42a, float:1.494E-42)
            r1.<init>(r0, r2)
            throw r1
        L76:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1065(0x429, float:1.492E-42)
            r1.<init>(r0, r2)
            throw r1
        L7e:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1064(0x428, float:1.491E-42)
            r1.<init>(r0, r2)
            throw r1
        L86:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1063(0x427, float:1.49E-42)
            r1.<init>(r0, r2)
            throw r1
        L8e:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1062(0x426, float:1.488E-42)
            r1.<init>(r0, r2)
            throw r1
        L96:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1061(0x425, float:1.487E-42)
            r1.<init>(r0, r2)
            throw r1
        L9e:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1060(0x424, float:1.485E-42)
            r1.<init>(r0, r2)
            throw r1
        La6:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1059(0x423, float:1.484E-42)
            r1.<init>(r0, r2)
            throw r1
        Lae:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1048(0x418, float:1.469E-42)
            r1.<init>(r0, r2)
            throw r1
        Lb6:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1058(0x422, float:1.483E-42)
            r1.<init>(r0, r2)
            throw r1
        Lbe:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1057(0x421, float:1.481E-42)
            r1.<init>(r0, r2)
            throw r1
        Lc6:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1056(0x420, float:1.48E-42)
            r1.<init>(r0, r2)
            throw r1
        Lce:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1055(0x41f, float:1.478E-42)
            r1.<init>(r0, r2)
            throw r1
        Ld6:
            com.ss.android.socialbase.downloader.up.j r1 = new com.ss.android.socialbase.downloader.up.j
            r0 = 1041(0x411, float:1.459E-42)
            r1.<init>(r0, r2)
            throw r1
    }

    public static void j(java.lang.Throwable r3, java.lang.String r4) throws com.ss.android.socialbase.downloader.up.j {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L8
            r0 = r4
            goto La
        L8:
            java.lang.String r0 = ""
        La:
            boolean r1 = r3 instanceof com.ss.android.socialbase.downloader.up.j
            if (r1 != 0) goto La5
            boolean r1 = r3 instanceof javax.net.ssl.SSLHandshakeException
            if (r1 != 0) goto L99
            boolean r1 = j(r3)
            if (r1 != 0) goto L8d
            boolean r1 = up(r3)
            r2 = 1004(0x3ec, float:1.407E-42)
            if (r1 != 0) goto L81
            boolean r1 = m(r3)
            if (r1 != 0) goto L75
            boolean r1 = xt(r3)
            if (r1 != 0) goto L69
            boolean r1 = cw(r3)
            if (r1 != 0) goto L5d
            boolean r1 = r(r3)
            if (r1 != 0) goto L51
            boolean r1 = r3 instanceof java.io.IOException
            if (r1 == 0) goto L45
            cw(r3, r4)
            java.io.IOException r3 = (java.io.IOException) r3
            j(r3, r4)
            return
        L45:
            com.ss.android.socialbase.downloader.up.j r4 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1000(0x3e8, float:1.401E-42)
            java.lang.String r3 = xt(r3, r0)
            r4.<init>(r1, r3)
            throw r4
        L51:
            com.ss.android.socialbase.downloader.up.j r4 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1041(0x411, float:1.459E-42)
            java.lang.String r3 = xt(r3, r0)
            r4.<init>(r1, r3)
            throw r4
        L5d:
            com.ss.android.socialbase.downloader.up.j r4 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1049(0x419, float:1.47E-42)
            java.lang.String r3 = xt(r3, r0)
            r4.<init>(r1, r3)
            throw r4
        L69:
            com.ss.android.socialbase.downloader.up.j r4 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1047(0x417, float:1.467E-42)
            java.lang.String r3 = xt(r3, r0)
            r4.<init>(r1, r3)
            throw r4
        L75:
            com.ss.android.socialbase.downloader.up.cw r4 = new com.ss.android.socialbase.downloader.up.cw
            r1 = 416(0x1a0, float:5.83E-43)
            java.lang.String r3 = xt(r3, r0)
            r4.<init>(r2, r1, r3)
            throw r4
        L81:
            com.ss.android.socialbase.downloader.up.cw r4 = new com.ss.android.socialbase.downloader.up.cw
            r1 = 412(0x19c, float:5.77E-43)
            java.lang.String r3 = xt(r3, r0)
            r4.<init>(r2, r1, r3)
            throw r4
        L8d:
            com.ss.android.socialbase.downloader.up.j r4 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1048(0x418, float:1.469E-42)
            java.lang.String r3 = xt(r3, r0)
            r4.<init>(r1, r3)
            throw r4
        L99:
            com.ss.android.socialbase.downloader.up.j r4 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1011(0x3f3, float:1.417E-42)
            java.lang.String r3 = xt(r3, r0)
            r4.<init>(r1, r3)
            throw r4
        La5:
            com.ss.android.socialbase.downloader.up.j r3 = (com.ss.android.socialbase.downloader.up.j) r3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r0)
            java.lang.String r0 = "-"
            r4.append(r0)
            java.lang.String r0 = r3.xt()
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.j(r4)
            throw r3
    }

    public static void j(java.util.List<com.ss.android.socialbase.downloader.ae.up> r4, com.ss.android.socialbase.downloader.ae.cw r5) {
            long r0 = r5.sh()
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L18
            com.ss.android.socialbase.downloader.ae.up r5 = new com.ss.android.socialbase.downloader.ae.up
            java.lang.String r2 = "extra_throttle_net_speed"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.<init>(r2, r0)
            r4.add(r5)
        L18:
            return
    }

    public static void j(android.database.Cursor... r3) {
            if (r3 != 0) goto L3
            goto L16
        L3:
            int r0 = r3.length
            r1 = 0
        L5:
            if (r1 >= r0) goto L16
            r2 = r3[r1]
            if (r2 == 0) goto L13
            r2.close()     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L13:
            int r1 = r1 + 1
            goto L5
        L16:
            return
    }

    public static void j(java.io.Closeable... r3) {
            if (r3 != 0) goto L3
            goto L16
        L3:
            int r0 = r3.length
            r1 = 0
        L5:
            if (r1 >= r0) goto L16
            r2 = r3[r1]
            if (r2 == 0) goto L13
            r2.close()     // Catch: java.lang.Throwable -> Lf
            goto L13
        Lf:
            r2 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r2)
        L13:
            int r1 = r1 + 1
            goto L5
        L16:
            return
    }

    public static boolean j() {
            java.lang.Boolean r0 = com.ss.android.socialbase.downloader.az.m.oq
            if (r0 == 0) goto L9
            boolean r0 = r0.booleanValue()
            return r0
        L9:
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            java.lang.String r0 = r(r0)
            if (r0 == 0) goto L1b
            java.lang.String r1 = ":"
            boolean r1 = r0.contains(r1)
            if (r1 != 0) goto L2d
        L1b:
            if (r0 == 0) goto L2d
            android.content.Context r1 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            java.lang.String r1 = r1.getPackageName()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2d
            r0 = 1
            goto L2e
        L2d:
            r0 = 0
        L2e:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            com.ss.android.socialbase.downloader.az.m.oq = r1
            return r0
    }

    public static boolean j(int r1) {
            if (r1 == 0) goto L8
            r0 = 2
            if (r1 != r0) goto L6
            goto L8
        L6:
            r1 = 0
            return r1
        L8:
            r1 = 1
            return r1
    }

    public static boolean j(int r4, java.lang.String r5) {
            r0 = 16777216(0x1000000, float:2.3509887E-38)
            boolean r0 = com.ss.android.socialbase.downloader.az.j.j(r0)
            r1 = 206(0xce, float:2.89E-43)
            r2 = 0
            r3 = 1
            if (r0 == 0) goto L13
            if (r4 == r1) goto L12
            if (r4 != r3) goto L11
            goto L12
        L11:
            return r2
        L12:
            return r3
        L13:
            r0 = 400(0x190, float:5.6E-43)
            if (r4 < r0) goto L18
            return r2
        L18:
            if (r4 == r1) goto L26
            if (r4 == r3) goto L26
            java.lang.String r4 = "bytes"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L25
            goto L26
        L25:
            return r2
        L26:
            return r3
    }

    public static boolean j(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = -3
            if (r1 != r0) goto Lb
            boolean r1 = r(r2, r3)
            if (r1 != 0) goto Lb
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static boolean j(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L12
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto La
            goto L12
        La:
            int r2 = r2.checkCallingOrSelfPermission(r3)
            if (r2 != 0) goto L12
            r2 = 1
            return r2
        L12:
            return r0
    }

    public static boolean j(com.ss.android.socialbase.downloader.ae.cw r3, boolean r4, java.lang.String r5) {
            r0 = 0
            if (r4 != 0) goto L3f
            java.lang.String r4 = r3.qv()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L3f
            java.lang.String r4 = r3.tl()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 == 0) goto L18
            goto L3f
        L18:
            java.io.File r4 = new java.io.File     // Catch: java.lang.OutOfMemoryError -> L3b
            java.lang.String r1 = r3.qv()     // Catch: java.lang.OutOfMemoryError -> L3b
            java.lang.String r2 = r3.tl()     // Catch: java.lang.OutOfMemoryError -> L3b
            r4.<init>(r1, r2)     // Catch: java.lang.OutOfMemoryError -> L3b
            boolean r4 = r4.exists()     // Catch: java.lang.OutOfMemoryError -> L3b
            if (r4 == 0) goto L3f
            java.lang.String r4 = r3.qv()     // Catch: java.lang.OutOfMemoryError -> L3b
            java.lang.String r3 = r3.tl()     // Catch: java.lang.OutOfMemoryError -> L3b
            boolean r3 = xt(r4, r3, r5)     // Catch: java.lang.OutOfMemoryError -> L3b
            if (r3 == 0) goto L3f
            r3 = 1
            return r3
        L3b:
            r3 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r3)
        L3f:
            return r0
    }

    public static boolean j(com.ss.android.socialbase.downloader.up.j r1) {
            if (r1 == 0) goto Lc
            int r1 = r1.j()
            r0 = 1051(0x41b, float:1.473E-42)
            if (r1 != r0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    public static boolean j(com.ss.android.socialbase.downloader.up.j r5, com.ss.android.socialbase.downloader.ae.cw r6) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            int r5 = r5.j()
            r1 = 1000(0x3e8, float:1.401E-42)
            r2 = 1
            if (r5 == r1) goto L49
            r1 = 1032(0x408, float:1.446E-42)
            if (r5 == r1) goto L49
            r1 = 1033(0x409, float:1.448E-42)
            if (r5 == r1) goto L49
            r1 = 1034(0x40a, float:1.449E-42)
            if (r5 == r1) goto L49
            r1 = 1008(0x3f0, float:1.413E-42)
            if (r5 == r1) goto L49
            r1 = 1026(0x402, float:1.438E-42)
            if (r5 == r1) goto L49
            r1 = 1027(0x403, float:1.439E-42)
            if (r5 == r1) goto L49
            r1 = 1044(0x414, float:1.463E-42)
            if (r5 == r1) goto L49
            r1 = 1020(0x3fc, float:1.43E-42)
            if (r5 != r1) goto L2e
            goto L49
        L2e:
            r1 = 1049(0x419, float:1.47E-42)
            if (r5 == r1) goto L48
            r1 = 1055(0x41f, float:1.478E-42)
            if (r5 == r1) goto L48
            r1 = 1006(0x3ee, float:1.41E-42)
            if (r5 == r1) goto L48
            if (r6 == 0) goto L48
            long r5 = r6.uq()
            r3 = 8388608(0x800000, double:4.144523E-317)
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 >= 0) goto L48
            return r2
        L48:
            return r0
        L49:
            return r2
    }

    public static boolean j(java.io.File r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.exists()     // Catch: java.lang.Exception -> L1a
            if (r1 != 0) goto L11
            boolean r1 = r2.mkdirs()     // Catch: java.lang.Exception -> L1a
            if (r1 != 0) goto L11
            return r0
        L11:
            boolean r2 = r2.isDirectory()     // Catch: java.lang.Exception -> L1a
            if (r2 != 0) goto L18
            return r0
        L18:
            r2 = 1
            return r2
        L1a:
            return r0
    }

    public static boolean j(java.io.File r1, java.io.File r2) throws com.ss.android.socialbase.downloader.up.j {
            r0 = 1
            boolean r1 = j(r1, r2, r0)
            return r1
    }

    public static boolean j(java.io.File r5, java.io.File r6, boolean r7) throws com.ss.android.socialbase.downloader.up.j {
            r0 = 0
            if (r5 == 0) goto La5
            if (r6 == 0) goto La5
            boolean r1 = r5.exists()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            if (r1 == 0) goto La5
            boolean r1 = r5.isDirectory()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            if (r1 != 0) goto La5
            java.lang.String r1 = r5.getCanonicalPath()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.String r2 = r6.getCanonicalPath()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            if (r1 == 0) goto L21
            goto La5
        L21:
            java.io.File r1 = r6.getParentFile()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.String r2 = "Destination '"
            if (r1 == 0) goto L51
            boolean r3 = r1.mkdirs()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            if (r3 != 0) goto L51
            boolean r3 = r1.isDirectory()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            if (r3 == 0) goto L36
            goto L51
        L36:
            com.ss.android.socialbase.downloader.up.j r5 = new com.ss.android.socialbase.downloader.up.j     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            r6.append(r1)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.String r7 = "' directory cannot be created"
            r6.append(r7)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            r7 = 1053(0x41d, float:1.476E-42)
            r5.<init>(r7, r6)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            throw r5     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
        L4f:
            r5 = move-exception
            goto L9d
        L51:
            java.lang.String r1 = com.ss.android.socialbase.downloader.az.m.j     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.String r4 = "copyFile: srcFile:"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.String r4 = r5.getPath()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.String r4 = " destFile:"
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.String r4 = r6.getPath()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            r3.append(r4)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            com.bytedance.sdk.component.utils.vl.r(r1, r3)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            boolean r1 = r6.exists()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            if (r1 == 0) goto L98
            boolean r1 = r6.canWrite()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            if (r1 == 0) goto L81
            goto L98
        L81:
            java.io.IOException r5 = new java.io.IOException     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            r7.append(r6)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.String r6 = "' exists but is read-only"
            r7.append(r6)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            java.lang.String r6 = r7.toString()     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            throw r5     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
        L98:
            xt(r5, r6, r7)     // Catch: java.lang.Throwable -> L4f com.ss.android.socialbase.downloader.up.j -> La3
            r5 = 1
            return r5
        L9d:
            java.lang.String r6 = "CopyFile"
            j(r5, r6)
            return r0
        La3:
            r5 = move-exception
            throw r5
        La5:
            return r0
    }

    public static boolean j(java.lang.Object r0, boolean r1) {
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.ClassCastException -> L7
            boolean r0 = r0.booleanValue()     // Catch: java.lang.ClassCastException -> L7
            return r0
        L7:
            return r1
    }

    public static boolean j(java.lang.Throwable r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = oq(r2)
            boolean r2 = r2 instanceof java.net.SocketTimeoutException
            if (r2 != 0) goto L24
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L23
            java.lang.String r2 = "time out"
            boolean r2 = r1.contains(r2)
            if (r2 != 0) goto L24
            java.lang.String r2 = "Time-out"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L23
            goto L24
        L23:
            return r0
        L24:
            r2 = 1
            return r2
    }

    public static boolean j(java.util.List<com.ss.android.socialbase.downloader.ae.up> r3, java.util.List<com.ss.android.socialbase.downloader.ae.up> r4) {
            if (r3 != r4) goto L4
            r3 = 1
            return r3
        L4:
            r0 = 0
            if (r3 == 0) goto L24
            if (r4 != 0) goto La
            goto L24
        La:
            int r1 = r3.size()
            int r2 = r4.size()
            if (r1 == r2) goto L15
            return r0
        L15:
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r3)
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>(r4)
            boolean r3 = r0.equals(r3)
            return r3
        L24:
            return r0
    }

    public static long m(com.ss.android.socialbase.downloader.ae.cw r6) {
            r0 = 0
            if (r6 != 0) goto L5
            return r0
        L5:
            com.ss.android.socialbase.downloader.downloader.vl r2 = com.ss.android.socialbase.downloader.downloader.cw.x()
            int r3 = r6.ae()
            java.util.List r2 = r2.cw(r3)
            int r3 = r6.kj()
            r4 = 1
            if (r3 <= r4) goto L19
            goto L1a
        L19:
            r4 = 0
        L1a:
            boolean r5 = r6.xj()
            if (r5 == 0) goto L33
            if (r4 == 0) goto L2f
            if (r2 == 0) goto L33
            int r6 = r2.size()
            if (r3 != r6) goto L33
            long r0 = xt(r2)
            return r0
        L2f:
            long r0 = r6.uq()
        L33:
            return r0
    }

    public static java.lang.String m() {
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            java.io.File r0 = r0.r()
            r1 = 0
            java.lang.String r0 = j(r0, r1)
            return r0
    }

    public static boolean m(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            java.lang.String r0 = r(r0)
            if (r0 == 0) goto L19
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L19
            return r1
        L19:
            r2 = 0
            return r2
    }

    public static boolean m(java.lang.Throwable r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = oq(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L18
            java.lang.String r1 = "Requested Range Not Satisfiable"
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            return r0
    }

    private static java.lang.String oq() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L2e
            java.lang.String r0 = androidx.work.impl.utils.d.a()     // Catch: java.lang.Exception -> L2a
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L2a
            if (r1 != 0) goto L29
            boolean r1 = com.ss.android.socialbase.downloader.m.j.j()     // Catch: java.lang.Exception -> L2a
            if (r1 == 0) goto L29
            java.lang.String r1 = "Process"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2a
            java.lang.String r3 = "processName = "
            r2.<init>(r3)     // Catch: java.lang.Exception -> L2a
            r2.append(r0)     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L2a
            com.ss.android.socialbase.downloader.m.j.xt(r1, r2)     // Catch: java.lang.Exception -> L2a
        L29:
            return r0
        L2a:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        L2e:
            r0 = 0
            return r0
    }

    private static java.lang.String oq(java.lang.String r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.util.regex.Pattern r1 = com.ss.android.socialbase.downloader.az.m.ae     // Catch: java.lang.Exception -> L3f
            if (r1 != 0) goto L10
            java.lang.String r1 = "attachment;\\s*filename\\s*=\\s*\"([^\"]*)\""
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Exception -> L3f
            com.ss.android.socialbase.downloader.az.m.ae = r1     // Catch: java.lang.Exception -> L3f
        L10:
            java.util.regex.Pattern r1 = com.ss.android.socialbase.downloader.az.m.ae     // Catch: java.lang.Exception -> L3f
            java.util.regex.Matcher r1 = r1.matcher(r4)     // Catch: java.lang.Exception -> L3f
            boolean r2 = r1.find()     // Catch: java.lang.Exception -> L3f
            r3 = 1
            if (r2 == 0) goto L22
            java.lang.String r4 = r1.group(r3)     // Catch: java.lang.Exception -> L3f
            return r4
        L22:
            java.util.regex.Pattern r1 = com.ss.android.socialbase.downloader.az.m.tl     // Catch: java.lang.Exception -> L3f
            if (r1 != 0) goto L2e
            java.lang.String r1 = "attachment;\\s*filename\\s*=\\s*(.*)"
            java.util.regex.Pattern r1 = java.util.regex.Pattern.compile(r1)     // Catch: java.lang.Exception -> L3f
            com.ss.android.socialbase.downloader.az.m.tl = r1     // Catch: java.lang.Exception -> L3f
        L2e:
            java.util.regex.Pattern r1 = com.ss.android.socialbase.downloader.az.m.tl     // Catch: java.lang.Exception -> L3f
            java.util.regex.Matcher r4 = r1.matcher(r4)     // Catch: java.lang.Exception -> L3f
            boolean r1 = r4.find()     // Catch: java.lang.Exception -> L3f
            if (r1 == 0) goto L3f
            java.lang.String r4 = r4.group(r3)     // Catch: java.lang.Exception -> L3f
            return r4
        L3f:
            return r0
    }

    public static java.lang.String oq(java.lang.Throwable r0) {
            if (r0 != 0) goto L5
            java.lang.String r0 = ""
            return r0
        L5:
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> La
            return r0
        La:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
            java.lang.String r0 = "throwable getMsg error"
            return r0
    }

    private static java.lang.String qv() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L47
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L47
            java.lang.String r2 = "currentProcessName"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L47
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L47
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L47
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L47
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L47
            if (r2 == 0) goto L4c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L47
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L44
            if (r0 != 0) goto L46
            boolean r0 = com.ss.android.socialbase.downloader.m.j.j()     // Catch: java.lang.Throwable -> L44
            if (r0 == 0) goto L46
            java.lang.String r0 = "Process"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L44
            java.lang.String r3 = "processName = "
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L44
            r2.append(r1)     // Catch: java.lang.Throwable -> L44
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L44
            com.ss.android.socialbase.downloader.m.j.xt(r0, r2)     // Catch: java.lang.Throwable -> L44
            return r1
        L44:
            r0 = move-exception
            goto L4d
        L46:
            return r1
        L47:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L4d
        L4c:
            return r0
        L4d:
            com.bytedance.sdk.component.utils.vl.j(r0)
            return r1
    }

    private static boolean qv(java.lang.String r3) {
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "deleteDirIfEmpty on thread: "
            r1.<init>(r2)
            java.lang.Thread r2 = java.lang.Thread.currentThread()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.vl.xt(r0, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            r2 = 0
            if (r1 != 0) goto L37
            java.io.File r1 = new java.io.File
            r1.<init>(r3)
            boolean r3 = r1.isDirectory()
            if (r3 == 0) goto L37
            boolean r3 = r1.delete()
            if (r3 != 0) goto L35
            java.lang.String r3 = "deleteDirIfEmpty return false"
            com.bytedance.sdk.component.utils.vl.xt(r0, r3)
            return r2
        L35:
            r3 = 1
            return r3
        L37:
            return r2
    }

    public static long r(java.lang.String r2) throws com.ss.android.socialbase.downloader.up.j {
            android.os.StatFs r0 = new android.os.StatFs     // Catch: java.lang.Throwable -> La java.lang.IllegalArgumentException -> L13
            r0.<init>(r2)     // Catch: java.lang.Throwable -> La java.lang.IllegalArgumentException -> L13
            long r0 = r0.getAvailableBytes()     // Catch: java.lang.Throwable -> La java.lang.IllegalArgumentException -> L13
            return r0
        La:
            r2 = move-exception
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1052(0x41c, float:1.474E-42)
            r0.<init>(r1, r2)
            throw r0
        L13:
            r2 = move-exception
            com.ss.android.socialbase.downloader.up.j r0 = new com.ss.android.socialbase.downloader.up.j
            r1 = 1050(0x41a, float:1.471E-42)
            r0.<init>(r1, r2)
            throw r0
    }

    private static long r(java.util.List<com.ss.android.socialbase.downloader.ae.xt> r10) {
            r0 = -1
            if (r10 == 0) goto L45
            boolean r2 = r10.isEmpty()
            if (r2 != 0) goto L45
            java.util.Iterator r10 = r10.iterator()
            r2 = r0
        Lf:
            boolean r4 = r10.hasNext()
            if (r4 == 0) goto L44
            java.lang.Object r4 = r10.next()
            com.ss.android.socialbase.downloader.ae.xt r4 = (com.ss.android.socialbase.downloader.ae.xt) r4
            if (r4 == 0) goto Lf
            long r5 = r4.ws()
            long r7 = r4.av()
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L33
            long r5 = r4.av()
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 != 0) goto Lf
        L33:
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 == 0) goto L3f
            long r5 = r4.ws()
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 <= 0) goto Lf
        L3f:
            long r2 = r4.ws()
            goto Lf
        L44:
            return r2
        L45:
            return r0
    }

    public static java.lang.String r(android.content.Context r2) {
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.cw
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L9
            return r0
        L9:
            java.lang.String r0 = oq()
            com.ss.android.socialbase.downloader.az.m.cw = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L18
            java.lang.String r2 = com.ss.android.socialbase.downloader.az.m.cw
            return r2
        L18:
            java.lang.String r0 = qv()
            com.ss.android.socialbase.downloader.az.m.cw = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L27
            java.lang.String r2 = com.ss.android.socialbase.downloader.az.m.cw
            return r2
        L27:
            java.lang.String r2 = up(r2)
            com.ss.android.socialbase.downloader.az.m.cw = r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L36
            java.lang.String r2 = com.ss.android.socialbase.downloader.az.m.cw
            return r2
        L36:
            java.lang.String r2 = g()
            com.ss.android.socialbase.downloader.az.m.cw = r2
            return r2
    }

    public static boolean r() {
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            android.os.Looper r1 = android.os.Looper.myLooper()
            if (r0 != r1) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public static boolean r(int r1) {
            r0 = 206(0xce, float:2.89E-43)
            if (r1 == r0) goto Lb
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 != r0) goto L9
            goto Lb
        L9:
            r1 = 0
            return r1
        Lb:
            r1 = 1
            return r1
    }

    public static boolean r(com.ss.android.socialbase.downloader.ae.cw r7) {
            boolean r0 = r7.im()
            java.lang.String r1 = " expired="
            r2 = 0
            if (r0 != 0) goto L1b
            java.lang.String r0 = r7.zz()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1b
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.j
            java.lang.String r3 = "dcache::last modify is emtpy, so just return cache"
            com.ss.android.socialbase.downloader.m.j.xt(r0, r3)
            goto L49
        L1b:
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "dcache::curt="
            r3.<init>(r4)
            long r4 = java.lang.System.currentTimeMillis()
            r3.append(r4)
            r3.append(r1)
            long r4 = r7.ff()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r3)
            long r3 = java.lang.System.currentTimeMillis()
            long r5 = r7.ff()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L49
            r2 = 1
        L49:
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "cacheExpired::dcache::name="
            r3.<init>(r4)
            java.lang.String r7 = r7.tl()
            r3.append(r7)
            r3.append(r1)
            r3.append(r2)
            java.lang.String r7 = r3.toString()
            com.ss.android.socialbase.downloader.m.j.xt(r0, r7)
            return r2
    }

    public static boolean r(java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L17
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Ld
            goto L17
        Ld:
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            return r1
        L17:
            r1 = 0
            return r1
    }

    public static boolean r(java.lang.Throwable r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = oq(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L18
            java.lang.String r1 = "Exception in connect"
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            return r0
    }

    public static boolean tl() {
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            if (r0 == 0) goto L14
            boolean r1 = xt(r0)
            if (r1 != 0) goto L14
            boolean r0 = cw(r0)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public static boolean tl(java.lang.String r4) {
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r1 = "save_path_security"
            int r0 = r0.xt(r1)
            r1 = 1
            if (r0 <= 0) goto L3c
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            if (r0 == 0) goto L3c
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 != 0) goto L3c
            java.lang.String r2 = "/data"
            boolean r2 = r4.startsWith(r2)
            if (r2 == 0) goto L22
            goto L3c
        L22:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Android/data/"
            r2.<init>(r3)
            java.lang.String r0 = r0.getPackageName()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            boolean r4 = r4.contains(r0)
            if (r4 != 0) goto L3c
            r4 = 0
            return r4
        L3c:
            return r1
    }

    public static boolean tl(java.lang.Throwable r5) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.ss.android.socialbase.downloader.up.j
            java.lang.String r2 = "ENOSPC"
            r3 = 1
            if (r1 == 0) goto L3c
            com.ss.android.socialbase.downloader.up.j r5 = (com.ss.android.socialbase.downloader.up.j) r5
            int r1 = r5.j()
            r4 = 1006(0x3ee, float:1.41E-42)
            if (r1 != r4) goto L16
            return r3
        L16:
            r4 = 1023(0x3ff, float:1.434E-42)
            if (r1 == r4) goto L2a
            r4 = 1039(0x40f, float:1.456E-42)
            if (r1 == r4) goto L2a
            r4 = 1040(0x410, float:1.457E-42)
            if (r1 == r4) goto L2a
            r4 = 1054(0x41e, float:1.477E-42)
            if (r1 == r4) goto L2a
            r4 = 1064(0x428, float:1.491E-42)
            if (r1 != r4) goto L51
        L2a:
            java.lang.String r5 = r5.getMessage()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L3b
            boolean r5 = r5.contains(r2)
            if (r5 == 0) goto L3b
            return r3
        L3b:
            return r0
        L3c:
            boolean r1 = r5 instanceof java.io.IOException
            if (r1 == 0) goto L51
            java.lang.String r5 = oq(r5)
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 != 0) goto L51
            boolean r5 = r5.contains(r2)
            if (r5 == 0) goto L51
            return r3
        L51:
            return r0
    }

    public static long up(com.ss.android.socialbase.downloader.ae.cw r5) {
            if (r5 != 0) goto L5
            r0 = -1
            return r0
        L5:
            com.ss.android.socialbase.downloader.downloader.vl r0 = com.ss.android.socialbase.downloader.downloader.cw.x()
            int r1 = r5.ae()
            java.util.List r0 = r0.cw(r1)
            int r1 = r5.kj()
            r2 = 1
            if (r1 != r2) goto L1d
            long r0 = r5.uq()
            return r0
        L1d:
            r3 = 0
            if (r0 == 0) goto L30
            int r5 = r0.size()
            if (r5 <= r2) goto L30
            long r0 = r(r0)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto L30
            return r0
        L30:
            return r3
    }

    public static com.ss.android.socialbase.downloader.xt.tl up(int r3) {
            com.ss.android.socialbase.downloader.xt.tl r0 = com.ss.android.socialbase.downloader.xt.tl.j
            com.ss.android.socialbase.downloader.xt.tl r1 = com.ss.android.socialbase.downloader.xt.tl.xt
            int r2 = r1.ordinal()
            if (r3 != r2) goto Lb
            return r1
        Lb:
            com.ss.android.socialbase.downloader.xt.tl r1 = com.ss.android.socialbase.downloader.xt.tl.cw
            int r2 = r1.ordinal()
            if (r3 != r2) goto L14
            return r1
        L14:
            return r0
    }

    public static java.lang.String up() {
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            com.ss.android.socialbase.downloader.downloader.ae r0 = com.ss.android.socialbase.downloader.downloader.ae.xt(r0)
            java.io.File r0 = r0.cw()
            r1 = 1
            java.lang.String r0 = j(r0, r1)
            return r0
    }

    private static java.lang.String up(android.content.Context r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L46
            java.lang.String r2 = "activity"
            java.lang.Object r4 = r4.getSystemService(r2)     // Catch: java.lang.Exception -> L46
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4     // Catch: java.lang.Exception -> L46
            if (r4 == 0) goto L4e
            java.util.List r4 = r4.getRunningAppProcesses()     // Catch: java.lang.Exception -> L46
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Exception -> L46
        L1a:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Exception -> L46
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Exception -> L46
            android.app.ActivityManager$RunningAppProcessInfo r2 = (android.app.ActivityManager.RunningAppProcessInfo) r2     // Catch: java.lang.Exception -> L46
            int r3 = r2.pid     // Catch: java.lang.Exception -> L46
            if (r3 != r1) goto L1a
            boolean r4 = com.ss.android.socialbase.downloader.m.j.j()     // Catch: java.lang.Exception -> L46
            if (r4 == 0) goto L48
            java.lang.String r4 = "Process"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L46
            java.lang.String r3 = "processName = "
            r1.<init>(r3)     // Catch: java.lang.Exception -> L46
            java.lang.String r3 = r2.processName     // Catch: java.lang.Exception -> L46
            r1.append(r3)     // Catch: java.lang.Exception -> L46
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L46
            com.ss.android.socialbase.downloader.m.j.xt(r4, r1)     // Catch: java.lang.Exception -> L46
            goto L48
        L46:
            r4 = move-exception
            goto L4b
        L48:
            java.lang.String r4 = r2.processName     // Catch: java.lang.Exception -> L46
            return r4
        L4b:
            com.bytedance.sdk.component.utils.vl.j(r4)
        L4e:
            return r0
    }

    public static java.lang.String up(java.lang.String r3) {
            r0 = 0
            if (r3 == 0) goto L22
            int r1 = r3.length()     // Catch: java.lang.Exception -> L22
            if (r1 != 0) goto La
            goto L22
        La:
            java.lang.String r1 = "MD5"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.lang.Exception -> L22
            java.lang.String r2 = "UTF-8"
            byte[] r3 = r3.getBytes(r2)     // Catch: java.lang.Exception -> L22
            r1.update(r3)     // Catch: java.lang.Exception -> L22
            byte[] r3 = r1.digest()     // Catch: java.lang.Exception -> L22
            java.lang.String r3 = j(r3)     // Catch: java.lang.Exception -> L22
            return r3
        L22:
            return r0
    }

    public static java.lang.String up(java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1f
            java.lang.String r2 = up(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L1f
            boolean r0 = r1.contains(r2)
            if (r0 != 0) goto L1f
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            java.lang.String r1 = r0.getAbsolutePath()
        L1f:
            return r1
    }

    public static boolean up(java.lang.Throwable r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = oq(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r2)
            if (r1 != 0) goto L18
            java.lang.String r1 = "Precondition Failed"
            boolean r2 = r2.contains(r1)
            if (r2 == 0) goto L18
            r2 = 1
            return r2
        L18:
            return r0
    }

    public static long xt(com.ss.android.socialbase.downloader.g.ae r5) {
            r0 = -1
            if (r5 != 0) goto L5
            return r0
        L5:
            java.lang.String r2 = "Content-Range"
            java.lang.String r5 = xt(r5, r2)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L12
            return r0
        L12:
            java.lang.String r2 = "bytes (\\d+)-(\\d+)/\\d+"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)     // Catch: java.lang.Exception -> L39
            java.util.regex.Matcher r5 = r2.matcher(r5)     // Catch: java.lang.Exception -> L39
            boolean r2 = r5.find()     // Catch: java.lang.Exception -> L39
            if (r2 == 0) goto L4d
            r2 = 1
            java.lang.String r2 = r5.group(r2)     // Catch: java.lang.Exception -> L39
            long r2 = java.lang.Long.parseLong(r2)     // Catch: java.lang.Exception -> L39
            r4 = 2
            java.lang.String r5 = r5.group(r4)     // Catch: java.lang.Exception -> L39
            long r0 = java.lang.Long.parseLong(r5)     // Catch: java.lang.Exception -> L39
            long r0 = r0 - r2
            r2 = 1
            long r0 = r0 + r2
            return r0
        L39:
            r5 = move-exception
            java.lang.String r2 = com.ss.android.socialbase.downloader.az.m.j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "parse content-length from content-range failed "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            com.ss.android.socialbase.downloader.m.j.r(r2, r5)
        L4d:
            return r0
    }

    public static long xt(java.lang.String r5) {
            r0 = -1
            if (r5 != 0) goto L5
            return r0
        L5:
            java.lang.String r2 = "/"
            java.lang.String[] r2 = r5.split(r2)
            int r3 = r2.length
            r4 = 2
            if (r3 < r4) goto L2a
            r3 = 1
            r2 = r2[r3]     // Catch: java.lang.NumberFormatException -> L17
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L17
            return r0
        L17:
            java.lang.String r2 = com.ss.android.socialbase.downloader.az.m.j
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "parse instance length failed with "
            r3.<init>(r4)
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            com.ss.android.socialbase.downloader.m.j.r(r2, r5)
        L2a:
            return r0
    }

    public static long xt(java.util.List<com.ss.android.socialbase.downloader.ae.xt> r4) {
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        L6:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L18
            java.lang.Object r2 = r4.next()
            com.ss.android.socialbase.downloader.ae.xt r2 = (com.ss.android.socialbase.downloader.ae.xt) r2
            long r2 = r2.az()
            long r0 = r0 + r2
            goto L6
        L18:
            return r0
    }

    public static java.lang.String xt(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ttmd5 check code = "
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r1 = ", "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = 99
            if (r2 == r1) goto L99
            switch(r2) {
                case 0: goto L87;
                case 1: goto L75;
                case 2: goto L63;
                case 3: goto L51;
                case 4: goto L3f;
                case 5: goto L2d;
                case 6: goto L1b;
                default: goto L1a;
            }
        L1a:
            return r0
        L1b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "get file md5 error"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L2d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "file not exist"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L3f:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "ttmd5 tag parser error"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L51:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "ttmd5 version not support"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L63:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "md5 empty"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L75:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "md5 not match"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L87:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "md5 match"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
        L99:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r0)
            java.lang.String r0 = "unknown error"
            r2.append(r0)
            java.lang.String r2 = r2.toString()
            return r2
    }

    public static java.lang.String xt(com.ss.android.socialbase.downloader.g.ae r4, java.lang.String r5) {
            if (r4 == 0) goto L39
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L9
            goto L39
        L9:
            java.lang.String r0 = r4.j(r5)
            com.ss.android.socialbase.downloader.jy.j r1 = com.ss.android.socialbase.downloader.jy.j.cw()
            java.lang.String r2 = "fix_get_http_resp_head_ignore_case"
            r3 = 1
            boolean r1 = r1.xt(r2, r3)
            if (r1 != 0) goto L1b
            return r0
        L1b:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L29
            java.lang.String r0 = r5.toLowerCase()
            java.lang.String r0 = r4.j(r0)
        L29:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L38
            java.lang.String r5 = r5.toUpperCase()
            java.lang.String r4 = r4.j(r5)
            return r4
        L38:
            return r0
        L39:
            r4 = 0
            return r4
    }

    public static java.lang.String xt(java.lang.String r1, java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto Le
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto Le
            r1 = 0
            return r1
        Le:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L15
            return r2
        L15:
            return r1
    }

    public static java.lang.String xt(java.lang.Throwable r1, java.lang.String r2) {
            if (r2 != 0) goto L7
            java.lang.String r1 = oq(r1)
            return r1
        L7:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "-"
            r0.append(r2)
            java.lang.String r1 = oq(r1)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
    }

    public static void xt(com.ss.android.socialbase.downloader.ae.cw r3) {
            if (r3 != 0) goto L4
            goto L7b
        L4:
            int r0 = r3.ae()
            com.ss.android.socialbase.downloader.jy.j r0 = com.ss.android.socialbase.downloader.jy.j.j(r0)
            java.lang.String r1 = "download_dir"
            org.json.JSONObject r1 = r0.r(r1)
            if (r1 == 0) goto L7b
            java.lang.String r2 = "ins_desc"
            java.lang.String r1 = r1.optString(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L27
            java.lang.String r2 = r3.qv()
            cw(r2, r1)
        L27:
            java.lang.String r1 = r3.g()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 == 0) goto L35
            java.lang.String r1 = r3.tl()
        L35:
            java.lang.String r0 = j(r1, r0)
            java.lang.String r3 = r3.qv()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L7b
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 != 0) goto L7b
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            java.io.File r0 = new java.io.File
            r0.<init>(r3)
        L53:
            if (r1 == 0) goto L7b
            if (r0 == 0) goto L7b
            boolean r3 = r0.isDirectory()
            if (r3 == 0) goto L7b
            java.lang.String r3 = r1.getName()
            java.lang.String r2 = r0.getName()
            boolean r3 = android.text.TextUtils.equals(r3, r2)
            if (r3 == 0) goto L7b
            java.lang.String r3 = r0.getPath()
            qv(r3)
            java.io.File r1 = r1.getParentFile()
            java.io.File r0 = r0.getParentFile()
            goto L53
        L7b:
            return
    }

    @android.annotation.TargetApi(19)
    private static void xt(java.io.File r17, java.io.File r18, boolean r19) throws java.io.IOException {
            r0 = r17
            r1 = r18
            boolean r2 = r1.exists()
            if (r2 == 0) goto L2a
            boolean r2 = r1.isDirectory()
            if (r2 != 0) goto L11
            goto L2a
        L11:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Destination '"
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = "' exists but is a directory"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            throw r0
        L2a:
            java.io.FileInputStream r2 = new java.io.FileInputStream
            r2.<init>(r0)
            java.nio.channels.FileChannel r4 = r2.getChannel()     // Catch: java.lang.Throwable -> Lb2
            java.io.FileOutputStream r9 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lb5
            r9.<init>(r1)     // Catch: java.lang.Throwable -> Lb5
            java.nio.channels.FileChannel r3 = r9.getChannel()     // Catch: java.lang.Throwable -> L64
            long r10 = r4.size()     // Catch: java.lang.Throwable -> L5b
            r12 = 0
            r5 = r12
        L43:
            int r7 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1))
            if (r7 >= 0) goto L5e
            long r7 = r10 - r5
            r14 = 31457280(0x1e00000, double:1.55419614E-316)
            int r16 = (r7 > r14 ? 1 : (r7 == r14 ? 0 : -1))
            if (r16 <= 0) goto L51
            r7 = r14
        L51:
            long r7 = r3.transferFrom(r4, r5, r7)     // Catch: java.lang.Throwable -> L5b
            int r14 = (r7 > r12 ? 1 : (r7 == r12 ? 0 : -1))
            if (r14 == 0) goto L5e
            long r5 = r5 + r7
            goto L43
        L5b:
            r0 = move-exception
            r1 = r0
            goto Lb8
        L5e:
            if (r3 == 0) goto L67
            r3.close()     // Catch: java.lang.Throwable -> L64
            goto L67
        L64:
            r0 = move-exception
            r1 = r0
            goto Lc6
        L67:
            r9.close()     // Catch: java.lang.Throwable -> Lb5
            r4.close()     // Catch: java.lang.Throwable -> Lb2
            r2.close()
            long r2 = r0.length()
            long r4 = r1.length()
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L86
            if (r19 == 0) goto L85
            long r2 = r0.lastModified()
            r1.setLastModified(r2)
        L85:
            return
        L86:
            java.io.IOException r6 = new java.io.IOException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to copy full contents from '"
            r7.<init>(r8)
            r7.append(r0)
            java.lang.String r0 = "' to '"
            r7.append(r0)
            r7.append(r1)
            java.lang.String r0 = "' Expected length: "
            r7.append(r0)
            r7.append(r2)
            java.lang.String r0 = " Actual: "
            r7.append(r0)
            r7.append(r4)
            java.lang.String r0 = r7.toString()
            r6.<init>(r0)
            throw r6
        Lb2:
            r0 = move-exception
            r1 = r0
            goto Le0
        Lb5:
            r0 = move-exception
            r1 = r0
            goto Ld2
        Lb8:
            throw r1     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r0 = move-exception
            r5 = r0
            if (r3 == 0) goto Lc5
            r3.close()     // Catch: java.lang.Throwable -> Lc1
            goto Lc5
        Lc1:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L64
        Lc5:
            throw r5     // Catch: java.lang.Throwable -> L64
        Lc6:
            throw r1     // Catch: java.lang.Throwable -> Lc7
        Lc7:
            r0 = move-exception
            r3 = r0
            r9.close()     // Catch: java.lang.Throwable -> Lcd
            goto Ld1
        Lcd:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lb5
        Ld1:
            throw r3     // Catch: java.lang.Throwable -> Lb5
        Ld2:
            throw r1     // Catch: java.lang.Throwable -> Ld3
        Ld3:
            r0 = move-exception
            r3 = r0
            if (r4 == 0) goto Ldf
            r4.close()     // Catch: java.lang.Throwable -> Ldb
            goto Ldf
        Ldb:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lb2
        Ldf:
            throw r3     // Catch: java.lang.Throwable -> Lb2
        Le0:
            throw r1     // Catch: java.lang.Throwable -> Le1
        Le1:
            r0 = move-exception
            r3 = r0
            r2.close()     // Catch: java.lang.Throwable -> Le7
            goto Leb
        Le7:
            r0 = move-exception
            r1.addSuppressed(r0)
        Leb:
            throw r3
    }

    public static void xt(java.util.List<com.ss.android.socialbase.downloader.ae.up> r4, com.ss.android.socialbase.downloader.ae.cw r5) {
            long r0 = r5.lv()
            r2 = 300(0x12c, double:1.48E-321)
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L18
            com.ss.android.socialbase.downloader.ae.up r5 = new com.ss.android.socialbase.downloader.ae.up
            java.lang.String r2 = "extra_ttnet_protect_timeout"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r5.<init>(r2, r0)
            r4.add(r5)
        L18:
            return
    }

    public static boolean xt() {
            boolean r0 = cw()
            if (r0 != 0) goto L18
            boolean r0 = com.ss.android.socialbase.downloader.downloader.cw.xt()
            if (r0 == 0) goto L18
            r0 = 1
            com.ss.android.socialbase.downloader.downloader.az r1 = com.ss.android.socialbase.downloader.impls.vl.j(r0)
            boolean r1 = r1.ae()
            if (r1 == 0) goto L18
            return r0
        L18:
            r0 = 0
            return r0
    }

    public static boolean xt(long r3) {
            r0 = -1
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 != 0) goto L8
            r3 = 1
            return r3
        L8:
            r3 = 0
            return r3
    }

    public static boolean xt(android.content.Context r2) {
            r0 = 0
            android.net.ConnectivityManager r2 = j(r2)     // Catch: java.lang.Exception -> L1d
            if (r2 != 0) goto L8
            return r0
        L8:
            android.net.NetworkInfo r2 = r2.getActiveNetworkInfo()     // Catch: java.lang.Exception -> L1d
            if (r2 == 0) goto L1d
            boolean r1 = r2.isAvailable()     // Catch: java.lang.Exception -> L1d
            if (r1 != 0) goto L15
            goto L1d
        L15:
            int r2 = r2.getType()     // Catch: java.lang.Exception -> L1d
            r1 = 1
            if (r1 != r2) goto L1d
            return r1
        L1d:
            return r0
    }

    public static boolean xt(com.ss.android.socialbase.downloader.up.j r2) {
            boolean r0 = r2 instanceof com.ss.android.socialbase.downloader.up.cw
            if (r0 == 0) goto L18
            com.ss.android.socialbase.downloader.up.cw r2 = (com.ss.android.socialbase.downloader.up.cw) r2
            int r0 = r2.r()
            r1 = 412(0x19c, float:5.77E-43)
            if (r0 == r1) goto L16
            int r2 = r2.r()
            r0 = 416(0x1a0, float:5.83E-43)
            if (r2 != r0) goto L18
        L16:
            r2 = 1
            return r2
        L18:
            r2 = 0
            return r2
    }

    public static boolean xt(com.ss.android.socialbase.downloader.up.j r0, com.ss.android.socialbase.downloader.ae.cw r1) {
            if (r1 == 0) goto L14
            boolean r0 = r1.x()
            if (r0 == 0) goto L14
            android.content.Context r0 = com.ss.android.socialbase.downloader.downloader.cw.nd()
            boolean r0 = cw(r0)
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    public static boolean xt(java.io.File r5, java.io.File r6) throws com.ss.android.socialbase.downloader.up.j {
            java.lang.String r0 = com.ss.android.socialbase.downloader.az.m.j
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "moveFile1: src:"
            r1.<init>(r2)
            java.lang.String r2 = r5.getPath()
            r1.append(r2)
            java.lang.String r2 = " dest:"
            r1.append(r2)
            java.lang.String r3 = r6.getPath()
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            com.bytedance.sdk.component.utils.vl.r(r0, r1)
            boolean r1 = r5.renameTo(r6)
            if (r1 != 0) goto L54
            boolean r1 = j(r5, r6)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = "moveFile2: src:"
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L50
            java.lang.String r4 = r5.getPath()     // Catch: java.lang.Throwable -> L50
            r3.append(r4)     // Catch: java.lang.Throwable -> L50
            r3.append(r2)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = r6.getPath()     // Catch: java.lang.Throwable -> L50
            r3.append(r6)     // Catch: java.lang.Throwable -> L50
            java.lang.String r6 = r3.toString()     // Catch: java.lang.Throwable -> L50
            com.bytedance.sdk.component.utils.vl.r(r0, r6)     // Catch: java.lang.Throwable -> L50
            r5.delete()     // Catch: java.lang.Throwable -> L50
            goto L54
        L50:
            r5 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r5)
        L54:
            return r1
    }

    public static boolean xt(java.lang.String r0, java.lang.String r1, java.lang.String r2) {
            int r0 = j(r0, r1, r2)
            boolean r0 = j(r0)
            return r0
    }

    public static boolean xt(java.lang.Throwable r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = oq(r4)
            boolean r2 = r4 instanceof com.ss.android.socialbase.downloader.up.cw
            r3 = 1
            if (r2 == 0) goto L26
            com.ss.android.socialbase.downloader.up.cw r4 = (com.ss.android.socialbase.downloader.up.cw) r4
            int r4 = r4.r()
            r2 = 403(0x193, float:5.65E-43)
            if (r4 == r2) goto L25
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L26
            java.lang.String r4 = "403"
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L26
        L25:
            return r3
        L26:
            boolean r4 = android.text.TextUtils.isEmpty(r1)
            if (r4 != 0) goto L35
            java.lang.String r4 = "Forbidden"
            boolean r4 = r1.contains(r4)
            if (r4 == 0) goto L35
            return r3
        L35:
            return r0
    }
}

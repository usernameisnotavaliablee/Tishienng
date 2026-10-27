package cn.jpush.android.ad;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class m {
    public static final java.lang.String a = null;

    /* renamed from: b, reason: collision with root package name */
    private static final java.lang.Object f1697b = null;

    /* renamed from: c, reason: collision with root package name */
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>> f1698c;

    /* renamed from: d, reason: collision with root package name */
    private static final java.util.concurrent.atomic.AtomicReference<android.content.Context> f1699d = null;

    private static class a extends java.lang.ThreadLocal<java.text.SimpleDateFormat> {
        private java.lang.String a;

        a(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        protected java.text.SimpleDateFormat a() {
                r3 = this;
                java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
                java.lang.String r1 = r3.a
                java.util.Locale r2 = java.util.Locale.ENGLISH
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.lang.ThreadLocal
        protected /* synthetic */ java.text.SimpleDateFormat initialValue() {
                r1 = this;
                java.text.SimpleDateFormat r0 = r1.a()
                return r0
        }
    }

    static {
            r0 = 16
            byte[] r0 = new byte[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [85, 118, 97, 33, 60, 84, 32, 0, 98, 46, 73, 85, 85, 116, 18, 44} // fill-array
            java.lang.String r0 = cn.jpush.android.ad.d.b(r0)
            cn.jpush.android.ad.m.a = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            cn.jpush.android.ad.m.f1697b = r0
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r0.<init>()
            cn.jpush.android.ad.m.f1698c = r0
            java.util.concurrent.atomic.AtomicReference r0 = new java.util.concurrent.atomic.AtomicReference
            r0.<init>()
            cn.jpush.android.ad.m.f1699d = r0
            return
    }

    public m() {
            r1 = this;
            r1.<init>()
            return
    }

    public static double a(double r4, double r6, double r8, double r10) {
            r0 = 4576184190849162553(0x3f81df46a2529d39, double:0.008726646259971648)
            double r6 = r6 * r0
            double r10 = r10 * r0
            double r2 = r6 - r10
            double r4 = r4 - r8
            double r4 = r4 * r0
            double r8 = java.lang.Math.sin(r2)
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r8 = java.lang.Math.pow(r8, r0)
            double r6 = r6 * r0
            double r6 = java.lang.Math.cos(r6)
            double r10 = r10 * r0
            double r10 = java.lang.Math.cos(r10)
            double r6 = r6 * r10
            double r4 = java.lang.Math.sin(r4)
            double r4 = java.lang.Math.pow(r4, r0)
            double r6 = r6 * r4
            double r8 = r8 + r6
            double r4 = java.lang.Math.sqrt(r8)
            double r4 = java.lang.Math.asin(r4)
            r6 = 4713110083058270208(0x416854a640000000, double:1.2756274E7)
            double r4 = r4 * r6
            r6 = 4666723172467343360(0x40c3880000000000, double:10000.0)
            double r4 = r4 * r6
            long r4 = java.lang.Math.round(r4)
            r6 = 10000(0x2710, double:4.9407E-320)
            long r4 = r4 / r6
            double r4 = (double) r4
            return r4
    }

    public static int a(android.content.Context r1, int r2) {
            if (r1 != 0) goto L3
            return r2
        L3:
            float r2 = (float) r2
            android.content.res.Resources r1 = r1.getResources()
            android.util.DisplayMetrics r1 = r1.getDisplayMetrics()
            r0 = 1
            float r1 = android.util.TypedValue.applyDimension(r0, r2, r1)
            int r1 = (int) r1
            return r1
    }

    public static android.content.Context a() {
            r0 = 0
            android.content.Context r0 = b(r0)
            return r0
    }

    public static android.util.DisplayMetrics a(android.content.Context r2) {
            android.util.DisplayMetrics r0 = new android.util.DisplayMetrics
            r0.<init>()
            if (r2 == 0) goto L19
            java.lang.String r1 = "window"
            java.lang.Object r2 = r2.getSystemService(r1)
            android.view.WindowManager r2 = (android.view.WindowManager) r2
            if (r2 == 0) goto L19
            android.view.Display r2 = r2.getDefaultDisplay()
            r2.getRealMetrics(r0)
        L19:
            return r0
    }

    public static android.view.ViewGroup.LayoutParams a(android.content.Context r2, android.view.View r3, boolean r4, int r5, int r6, int r7, int r8) {
            if (r2 == 0) goto L49
            if (r3 == 0) goto L49
            android.view.ViewGroup$LayoutParams r0 = r3.getLayoutParams()     // Catch: java.lang.Throwable -> L2e
            boolean r1 = r0 instanceof android.view.ViewGroup.MarginLayoutParams     // Catch: java.lang.Throwable -> L2e
            if (r1 == 0) goto Lf
            android.view.ViewGroup$MarginLayoutParams r0 = (android.view.ViewGroup.MarginLayoutParams) r0     // Catch: java.lang.Throwable -> L2e
            goto L15
        Lf:
            android.view.ViewGroup$MarginLayoutParams r1 = new android.view.ViewGroup$MarginLayoutParams     // Catch: java.lang.Throwable -> L2e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L2e
            r0 = r1
        L15:
            if (r4 == 0) goto L27
            int r5 = a(r2, r5)     // Catch: java.lang.Throwable -> L2e
            int r7 = a(r2, r7)     // Catch: java.lang.Throwable -> L2e
            int r6 = a(r2, r6)     // Catch: java.lang.Throwable -> L2e
            int r8 = a(r2, r8)     // Catch: java.lang.Throwable -> L2e
        L27:
            r0.setMargins(r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L2e
            r3.setLayoutParams(r0)     // Catch: java.lang.Throwable -> L2e
            return r0
        L2e:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "[setViewMargin] failed. err: "
            r3.append(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.String r3 = "Utils"
            cn.jpush.android.helper.Logger.w(r3, r2)
        L49:
            r2 = 0
            return r2
    }

    public static java.lang.String a(java.util.Collection<java.lang.String> r2, java.lang.String r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1c
            java.lang.Object r1 = r2.next()
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            r0.append(r3)
            goto L9
        L1c:
            int r2 = r0.length()
            if (r2 <= 0) goto L2b
            int r2 = r0.length()
            int r2 = r2 + (-1)
            r0.deleteCharAt(r2)
        L2b:
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.text.SimpleDateFormat a(java.lang.String r3) {
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>> r0 = cn.jpush.android.ad.m.f1698c
            java.lang.Object r0 = r0.get(r3)
            java.lang.ThreadLocal r0 = (java.lang.ThreadLocal) r0
            if (r0 != 0) goto L28
            java.lang.Object r1 = cn.jpush.android.ad.m.f1697b
            monitor-enter(r1)
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>> r0 = cn.jpush.android.ad.m.f1698c     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> L22
            java.lang.ThreadLocal r0 = (java.lang.ThreadLocal) r0     // Catch: java.lang.Throwable -> L22
            if (r0 != 0) goto L24
            cn.jpush.android.ad.m$a r0 = new cn.jpush.android.ad.m$a     // Catch: java.lang.Throwable -> L22
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L22
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.ThreadLocal<java.text.SimpleDateFormat>> r2 = cn.jpush.android.ad.m.f1698c     // Catch: java.lang.Throwable -> L22
            r2.put(r3, r0)     // Catch: java.lang.Throwable -> L22
            goto L24
        L22:
            r3 = move-exception
            goto L26
        L24:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            goto L28
        L26:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L22
            throw r3
        L28:
            java.lang.Object r3 = r0.get()
            java.text.SimpleDateFormat r3 = (java.text.SimpleDateFormat) r3
            return r3
    }

    public static java.util.ArrayList<java.lang.String> a(org.json.JSONArray r4) {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r4 == 0) goto L25
            int r1 = r4.length()
            if (r1 != 0) goto Le
            goto L25
        Le:
            r1 = 0
        Lf:
            int r2 = r4.length()
            if (r1 >= r2) goto L25
            java.lang.String r2 = r4.optString(r1)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L22
            r0.add(r2)
        L22:
            int r1 = r1 + 1
            goto Lf
        L25:
            return r0
    }

    public static void a(android.content.Context r2, java.util.List<java.lang.String> r3) {
            boolean r2 = cn.jpush.android.helper.JCoreHelper.isIpv6Priority(r2)
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

    public static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.io.IOException -> L5
        L5:
            return
    }

    public static byte[] a(java.io.InputStream r1) {
            if (r1 == 0) goto Lc
            int r0 = r1.available()
            byte[] r0 = new byte[r0]
            r1.read(r0)
            return r0
        Lc:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "InputStream is null"
            r1.<init>(r0)
            throw r1
    }

    public static byte[] a(byte[] r6) {
            if (r6 == 0) goto L43
            int r0 = r6.length
            if (r0 != 0) goto L6
            goto L43
        L6:
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L35
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L35
            r6 = 256(0x100, float:3.59E-43)
            byte[] r6 = new byte[r6]     // Catch: java.lang.Throwable -> L25
        L1a:
            int r3 = r2.read(r6)     // Catch: java.lang.Throwable -> L25
            if (r3 < 0) goto L27
            r4 = 0
            r0.write(r6, r4, r3)     // Catch: java.lang.Throwable -> L25
            goto L1a
        L25:
            r6 = move-exception
            goto L39
        L27:
            byte[] r6 = r0.toByteArray()     // Catch: java.lang.Throwable -> L25
            a(r0)
            a(r1)
            a(r2)
            return r6
        L35:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L39:
            a(r0)
            a(r1)
            a(r2)
            throw r6
        L43:
            return r6
    }

    public static int b(android.content.Context r1, int r2) {
            android.util.DisplayMetrics r1 = a(r1)
            int r1 = r1.widthPixels
            float r1 = (float) r1
            float r2 = (float) r2
            r0 = 1136361472(0x43bb8000, float:375.0)
            float r2 = r2 / r0
            float r1 = r1 * r2
            int r1 = (int) r1
            return r1
    }

    public static int b(java.lang.String r1) {
            java.lang.String r0 = "[^0-9]"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)     // Catch: java.lang.Throwable -> L1d
            java.util.regex.Matcher r1 = r0.matcher(r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r0 = ""
            java.lang.String r1 = r1.replaceAll(r0)     // Catch: java.lang.Throwable -> L1d
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L1d
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L1d
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> L1d
            return r1
        L1d:
            r1 = -1
            return r1
    }

    public static android.app.Application b() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = c()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "getApplication"
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L18
            return r0
        L18:
            android.app.Application r1 = (android.app.Application) r1     // Catch: java.lang.Throwable -> L1b
            return r1
        L1b:
            return r0
    }

    public static android.content.Context b(android.content.Context r2) {
            java.util.concurrent.atomic.AtomicReference<android.content.Context> r0 = cn.jpush.android.ad.m.f1699d
            java.lang.Object r1 = r0.get()
            android.content.Context r1 = (android.content.Context) r1
            if (r1 != 0) goto L27
            if (r2 == 0) goto L15
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
            goto L19
        L15:
            android.app.Application r2 = b()
        L19:
            r1 = 0
            boolean r1 = androidx.camera.view.p.a(r0, r1, r2)
            if (r1 != 0) goto L26
            java.lang.Object r2 = r0.get()
            android.content.Context r2 = (android.content.Context) r2
        L26:
            return r2
        L27:
            return r1
    }

    public static byte[] b(java.io.InputStream r4) {
            if (r4 == 0) goto L28
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L23
            r1.<init>()     // Catch: java.lang.Throwable -> L23
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L18
        Lc:
            int r2 = r4.read(r0)     // Catch: java.lang.Throwable -> L18
            r3 = -1
            if (r2 == r3) goto L1b
            r3 = 0
            r1.write(r0, r3, r2)     // Catch: java.lang.Throwable -> L18
            goto Lc
        L18:
            r4 = move-exception
            r0 = r1
            goto L24
        L1b:
            byte[] r4 = r1.toByteArray()     // Catch: java.lang.Throwable -> L18
            a(r1)
            return r4
        L23:
            r4 = move-exception
        L24:
            a(r0)
            throw r4
        L28:
            java.io.IOException r4 = new java.io.IOException
            java.lang.String r0 = "InputStream is null"
            r4.<init>(r0)
            throw r4
    }

    public static int c(android.content.Context r1, int r2) {
            android.util.DisplayMetrics r1 = a(r1)
            int r1 = r1.heightPixels
            float r1 = (float) r1
            float r2 = (float) r2
            r0 = 1143390208(0x4426c000, float:667.0)
            float r2 = r2 / r0
            float r1 = r1 * r2
            int r1 = (int) r1
            return r1
    }

    public static java.lang.Object c() {
            java.lang.Object r0 = d()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.Object r0 = e()
            return r0
    }

    public static java.util.LinkedList<java.lang.String> c(java.lang.String r5) {
            java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L26
            r0.<init>()     // Catch: java.lang.Throwable -> L26
            if (r5 == 0) goto L25
            int r1 = r5.length()     // Catch: java.lang.Throwable -> L26
            if (r1 <= 0) goto L25
            java.lang.String r1 = ","
            java.lang.String[] r5 = r5.split(r1)     // Catch: java.lang.Throwable -> L26
            int r1 = r5.length     // Catch: java.lang.Throwable -> L26
            r2 = 0
        L15:
            if (r2 >= r1) goto L25
            r3 = r5[r2]     // Catch: java.lang.Throwable -> L26
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L26
            if (r4 != 0) goto L22
            r0.add(r3)     // Catch: java.lang.Throwable -> L26
        L22:
            int r2 = r2 + 1
            goto L15
        L25:
            return r0
        L26:
            r5 = 0
            return r5
    }

    private static java.lang.Object d() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "sCurrentActivityThread"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L15
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L15
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L15
        L15:
            return r0
    }

    private static java.lang.Object e() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "currentActivityThread"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L11
        L11:
            return r0
    }
}

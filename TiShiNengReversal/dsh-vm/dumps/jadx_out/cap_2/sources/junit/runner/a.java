package junit.runner;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class a implements junit.framework.i {
    public static final java.lang.String b = "suite";
    private static java.util.Properties c = null;
    static int d = 500;
    static boolean e = true;
    boolean a;

    static {
            r0 = 500(0x1f4, float:7.0E-43)
            java.lang.String r1 = "maxmessage"
            int r0 = k(r1, r0)
            junit.runner.a.d = r0
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.a = r0
            return
    }

    public static java.lang.String B(java.lang.String r3) {
            int r0 = junit.runner.a.d
            r1 = -1
            if (r0 == r1) goto L25
            int r0 = r3.length()
            int r1 = junit.runner.a.d
            if (r0 <= r1) goto L25
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 0
            int r2 = junit.runner.a.d
            java.lang.String r3 = r3.substring(r1, r2)
            r0.append(r3)
            java.lang.String r3 = "..."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
        L25:
            return r3
    }

    static boolean h(java.lang.String r8) {
            java.lang.String r6 = "junit.textui.TestRunner"
            java.lang.String r7 = "java.lang.reflect.Method.invoke("
            java.lang.String r0 = "junit.framework.TestCase"
            java.lang.String r1 = "junit.framework.TestResult"
            java.lang.String r2 = "junit.framework.TestSuite"
            java.lang.String r3 = "junit.framework.Assert."
            java.lang.String r4 = "junit.swingui.TestRunner"
            java.lang.String r5 = "junit.awtui.TestRunner"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7}
            r1 = 0
            r2 = 0
        L16:
            r3 = 8
            if (r2 >= r3) goto L27
            r3 = r0[r2]
            int r3 = r8.indexOf(r3)
            if (r3 <= 0) goto L24
            r8 = 1
            return r8
        L24:
            int r2 = r2 + 1
            goto L16
        L27:
            return r1
    }

    public static java.lang.String i(java.lang.String r5) {
            boolean r0 = x()
            if (r0 == 0) goto L7
            goto L2f
        L7:
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            java.io.StringReader r2 = new java.io.StringReader
            r2.<init>(r5)
            java.io.BufferedReader r3 = new java.io.BufferedReader
            r3.<init>(r2)
        L1b:
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Exception -> L2f
            if (r2 == 0) goto L2b
            boolean r4 = h(r2)     // Catch: java.lang.Exception -> L2f
            if (r4 != 0) goto L1b
            r1.println(r2)     // Catch: java.lang.Exception -> L2f
            goto L1b
        L2b:
            java.lang.String r5 = r0.toString()
        L2f:
            return r5
    }

    public static java.lang.String j(java.lang.Throwable r2) {
            java.io.StringWriter r0 = new java.io.StringWriter
            r0.<init>()
            java.io.PrintWriter r1 = new java.io.PrintWriter
            r1.<init>(r0)
            r2.getClass()
            java.lang.String r2 = r0.toString()
            java.lang.String r2 = i(r2)
            return r2
    }

    public static int k(java.lang.String r0, int r1) {
            java.lang.String r0 = l(r0)
            if (r0 != 0) goto L7
            return r1
        L7:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> Lc
            return r0
        Lc:
            return r1
    }

    public static java.lang.String l(java.lang.String r1) {
            java.util.Properties r0 = m()
            java.lang.String r1 = r0.getProperty(r1)
            return r1
    }

    protected static java.util.Properties m() {
            java.util.Properties r0 = junit.runner.a.c
            if (r0 != 0) goto L1c
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            junit.runner.a.c = r0
            java.lang.String r1 = "loading"
            java.lang.String r2 = "true"
            r0.put(r1, r2)
            java.util.Properties r0 = junit.runner.a.c
            java.lang.String r1 = "filterstack"
            r0.put(r1, r2)
            r()
        L1c:
            java.util.Properties r0 = junit.runner.a.c
            return r0
    }

    private static java.io.File n() {
            java.lang.String r0 = "user.home"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "junit.properties"
            r1.<init>(r0, r2)
            return r1
    }

    private static void r() {
            r0 = 0
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2b
            java.io.File r2 = n()     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L26 java.io.IOException -> L2b
            java.util.Properties r0 = new java.util.Properties     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
            java.util.Properties r2 = m()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
            w(r0)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
            java.util.Properties r0 = m()     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
            r0.load(r1)     // Catch: java.lang.Throwable -> L21 java.io.IOException -> L23
            r1.close()     // Catch: java.io.IOException -> L38
            return
        L21:
            r0 = move-exception
            goto L2d
        L23:
            r0 = r1
            goto L33
        L26:
            r1 = move-exception
            r3 = r1
            r1 = r0
            r0 = r3
            goto L2d
        L2b:
            goto L33
        L2d:
            if (r1 == 0) goto L32
            r1.close()     // Catch: java.io.IOException -> L32
        L32:
            throw r0
        L33:
            if (r0 == 0) goto L38
            r0.close()     // Catch: java.io.IOException -> L38
        L38:
            return
    }

    public static void t() throws java.io.IOException {
            java.io.FileOutputStream r0 = new java.io.FileOutputStream
            java.io.File r1 = n()
            r0.<init>(r1)
            java.util.Properties r1 = m()     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = ""
            r1.store(r0, r2)     // Catch: java.lang.Throwable -> L16
            r0.close()
            return
        L16:
            r1 = move-exception
            r0.close()
            throw r1
    }

    public static void v(java.lang.String r1, java.lang.String r2) {
            java.util.Properties r0 = m()
            r0.put(r1, r2)
            return
    }

    protected static void w(java.util.Properties r0) {
            junit.runner.a.c = r0
            return
    }

    protected static boolean x() {
            java.lang.String r0 = "filterstack"
            java.lang.String r0 = l(r0)
            java.lang.String r1 = "true"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L15
            boolean r0 = junit.runner.a.e
            if (r0 != 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public abstract void A(java.lang.String r1);

    protected boolean C() {
            r2 = this;
            java.lang.String r0 = "loading"
            java.lang.String r0 = l(r0)
            java.lang.String r1 = "true"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L14
            boolean r0 = r2.a
            if (r0 == 0) goto L14
            r0 = 1
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // junit.framework.i
    public synchronized void a(junit.framework.f r2, java.lang.Throwable r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.z(r0, r2, r3)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // junit.framework.i
    public synchronized void b(junit.framework.f r2, junit.framework.AssertionFailedError r3) {
            r1 = this;
            monitor-enter(r1)
            r0 = 2
            r1.z(r0, r2, r3)     // Catch: java.lang.Throwable -> L7
            monitor-exit(r1)
            return
        L7:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7
            throw r2
    }

    @Override // junit.framework.i
    public synchronized void c(junit.framework.f r1) {
            r0 = this;
            monitor-enter(r0)
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La
            r0.y(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    @Override // junit.framework.i
    public synchronized void d(junit.framework.f r1) {
            r0 = this;
            monitor-enter(r0)
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> La
            r0.A(r1)     // Catch: java.lang.Throwable -> La
            monitor-exit(r0)
            return
        La:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La
            throw r1
    }

    protected void e() {
            r0 = this;
            return
    }

    public java.lang.String f(long r4) {
            r3 = this;
            java.text.NumberFormat r0 = java.text.NumberFormat.getInstance()
            double r4 = (double) r4
            r1 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r4 = r4 / r1
            java.lang.String r4 = r0.format(r4)
            return r4
    }

    public java.lang.String g(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "Default package for"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L14
            java.lang.String r0 = "."
            int r0 = r2.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
        L14:
            return r2
    }

    public junit.framework.f o(java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "Failed to invoke suite():"
            int r1 = r4.length()
            r2 = 0
            if (r1 > 0) goto Ld
            r3.e()
            return r2
        Ld:
            java.lang.Class r4 = r3.p(r4)     // Catch: java.lang.Exception -> L73 java.lang.ClassNotFoundException -> L8d
            java.lang.String r1 = "suite"
            java.lang.reflect.Method r4 = r4.getMethod(r1, r2)     // Catch: java.lang.Exception -> L6a
            int r1 = r4.getModifiers()
            boolean r1 = java.lang.reflect.Modifier.isStatic(r1)
            if (r1 != 0) goto L27
            java.lang.String r4 = "Suite() method must be static"
            r3.s(r4)
            return r2
        L27:
            java.lang.Object r4 = r4.invoke(r2, r2)     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            junit.framework.f r4 = (junit.framework.f) r4     // Catch: java.lang.IllegalAccessException -> L34 java.lang.reflect.InvocationTargetException -> L36
            if (r4 != 0) goto L30
            return r4
        L30:
            r3.e()
            return r4
        L34:
            r4 = move-exception
            goto L38
        L36:
            r4 = move-exception
            goto L4f
        L38:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.s(r4)
            return r2
        L4f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.Throwable r4 = r4.getTargetException()
            java.lang.String r4 = r4.toString()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.s(r4)
            return r2
        L6a:
            r3.e()
            junit.framework.k r0 = new junit.framework.k
            r0.<init>(r4)
            return r0
        L73:
            r4 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Error: "
            r0.append(r1)
            java.lang.String r4 = r4.toString()
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.s(r4)
            return r2
        L8d:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            if (r0 != 0) goto L95
            goto L96
        L95:
            r4 = r0
        L96:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Class not found \""
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "\""
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.s(r4)
            return r2
    }

    protected java.lang.Class<?> p(java.lang.String r1) throws java.lang.ClassNotFoundException {
            r0 = this;
            java.lang.Class r1 = java.lang.Class.forName(r1)
            return r1
    }

    protected java.lang.String q(java.lang.String[] r6) {
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r6.length
            if (r2 >= r3) goto L42
            r3 = r6[r2]
            java.lang.String r4 = "-noloading"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L14
            r5.u(r1)
            goto L3f
        L14:
            r3 = r6[r2]
            java.lang.String r4 = "-nofilterstack"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L21
            junit.runner.a.e = r1
            goto L3f
        L21:
            r3 = r6[r2]
            java.lang.String r4 = "-c"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L3d
            int r3 = r6.length
            int r2 = r2 + 1
            if (r3 <= r2) goto L37
            r0 = r6[r2]
            java.lang.String r0 = r5.g(r0)
            goto L3f
        L37:
            java.io.PrintStream r3 = java.lang.System.out
            r3.getClass()
            goto L3f
        L3d:
            r0 = r6[r2]
        L3f:
            int r2 = r2 + 1
            goto L3
        L42:
            return r0
    }

    protected abstract void s(java.lang.String r1);

    public void u(boolean r1) {
            r0 = this;
            r0.a = r1
            return
    }

    public abstract void y(java.lang.String r1);

    public abstract void z(int r1, junit.framework.f r2, java.lang.Throwable r3);
}

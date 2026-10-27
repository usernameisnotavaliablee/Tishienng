package org.slf4j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class d {
    static final java.lang.String a = "http://www.slf4j.org/codes.html";
    static final java.lang.String b = "http://www.slf4j.org/codes.html#StaticLoggerBinder";
    static final java.lang.String c = "http://www.slf4j.org/codes.html#multiple_bindings";
    static final java.lang.String d = "http://www.slf4j.org/codes.html#null_LF";
    static final java.lang.String e = "http://www.slf4j.org/codes.html#version_mismatch";
    static final java.lang.String f = "http://www.slf4j.org/codes.html#substituteLogger";
    static final java.lang.String g = "http://www.slf4j.org/codes.html#loggerNameMismatch";
    static final java.lang.String h = "http://www.slf4j.org/codes.html#replay";
    static final java.lang.String i = "http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final java.lang.String j = "org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit";
    static final int k = 0;
    static final int l = 1;
    static final int m = 2;
    static final int n = 3;
    static final int o = 4;
    static volatile int p = 0;

    /* renamed from: q, reason: collision with root package name */
    static org.slf4j.helpers.i f69q = null;
    static org.slf4j.helpers.e r = null;
    static final java.lang.String s = "slf4j.detectLoggerNameMismatch";
    static final java.lang.String t = "java.vendor.url";
    static boolean u;
    private static final java.lang.String[] v = null;
    private static java.lang.String w;

    static {
            org.slf4j.helpers.i r0 = new org.slf4j.helpers.i
            r0.<init>()
            org.slf4j.d.f69q = r0
            org.slf4j.helpers.e r0 = new org.slf4j.helpers.e
            r0.<init>()
            org.slf4j.d.r = r0
            java.lang.String r0 = "slf4j.detectLoggerNameMismatch"
            boolean r0 = org.slf4j.helpers.j.f(r0)
            org.slf4j.d.u = r0
            java.lang.String r0 = "1.6"
            java.lang.String r1 = "1.7"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1}
            org.slf4j.d.v = r0
            java.lang.String r0 = "org/slf4j/impl/StaticLoggerBinder.class"
            org.slf4j.d.w = r0
            return
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    private static final void a() {
            boolean r0 = l()     // Catch: java.lang.Exception -> L24 java.lang.NoSuchMethodError -> L30 java.lang.NoClassDefFoundError -> L52
            if (r0 != 0) goto Le
            java.util.Set r0 = f()     // Catch: java.lang.Exception -> L24 java.lang.NoSuchMethodError -> L30 java.lang.NoClassDefFoundError -> L52
            s(r0)     // Catch: java.lang.Exception -> L24 java.lang.NoSuchMethodError -> L30 java.lang.NoClassDefFoundError -> L52
            goto Lf
        Le:
            r0 = 0
        Lf:
            org.slf4j.impl.c.c()     // Catch: java.lang.Exception -> L24 java.lang.NoSuchMethodError -> L30 java.lang.NoClassDefFoundError -> L52
            r1 = 3
            org.slf4j.d.p = r1     // Catch: java.lang.Exception -> L24 java.lang.NoSuchMethodError -> L30 java.lang.NoClassDefFoundError -> L52
            r(r0)     // Catch: java.lang.Exception -> L24 java.lang.NoSuchMethodError -> L30 java.lang.NoClassDefFoundError -> L52
            g()     // Catch: java.lang.Exception -> L24 java.lang.NoSuchMethodError -> L30 java.lang.NoClassDefFoundError -> L52
            p()     // Catch: java.lang.Exception -> L24 java.lang.NoSuchMethodError -> L30 java.lang.NoClassDefFoundError -> L52
            org.slf4j.helpers.i r0 = org.slf4j.d.f69q     // Catch: java.lang.Exception -> L24 java.lang.NoSuchMethodError -> L30 java.lang.NoClassDefFoundError -> L52
            r0.b()     // Catch: java.lang.Exception -> L24 java.lang.NoSuchMethodError -> L30 java.lang.NoClassDefFoundError -> L52
            return
        L24:
            r0 = move-exception
            e(r0)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Unexpected initialization failure"
            r1.<init>(r2, r0)
            throw r1
        L30:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            if (r1 == 0) goto L51
            java.lang.String r2 = "org.slf4j.impl.StaticLoggerBinder.getSingleton()"
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L51
            r1 = 2
            org.slf4j.d.p = r1
            java.lang.String r1 = "slf4j-api 1.6.x (or later) is incompatible with this binding."
            org.slf4j.helpers.j.c(r1)
            java.lang.String r1 = "Your binding is version 1.5.5 or earlier."
            org.slf4j.helpers.j.c(r1)
            java.lang.String r1 = "Upgrade your binding to version 1.6.x."
            org.slf4j.helpers.j.c(r1)
        L51:
            throw r0
        L52:
            r0 = move-exception
            java.lang.String r1 = r0.getMessage()
            boolean r1 = m(r1)
            if (r1 == 0) goto L70
            r0 = 4
            org.slf4j.d.p = r0
            java.lang.String r0 = "Failed to load class \"org.slf4j.impl.StaticLoggerBinder\"."
            org.slf4j.helpers.j.c(r0)
            java.lang.String r0 = "Defaulting to no-operation (NOP) logger implementation"
            org.slf4j.helpers.j.c(r0)
            java.lang.String r0 = "See http://www.slf4j.org/codes.html#StaticLoggerBinder for further details."
            org.slf4j.helpers.j.c(r0)
            return
        L70:
            e(r0)
            throw r0
    }

    private static void b(org.slf4j.event.d r1, int r2) {
            org.slf4j.helpers.h r0 = r1.h()
            boolean r0 = r0.d()
            if (r0 == 0) goto Le
            c(r2)
            return
        Le:
            org.slf4j.helpers.h r1 = r1.h()
            boolean r1 = r1.e()
            if (r1 == 0) goto L19
            return
        L19:
            d()
            return
    }

    private static void c(int r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "A number ("
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = ") of logging calls during the initialization phase have been intercepted and are"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            org.slf4j.helpers.j.c(r2)
            java.lang.String r2 = "now being replayed. These are subject to the filtering rules of the underlying logging system."
            org.slf4j.helpers.j.c(r2)
            java.lang.String r2 = "See also http://www.slf4j.org/codes.html#replay"
            org.slf4j.helpers.j.c(r2)
            return
    }

    private static void d() {
            java.lang.String r0 = "The following set of substitute loggers may have been accessed"
            org.slf4j.helpers.j.c(r0)
            java.lang.String r0 = "during the initialization phase. Logging calls during this"
            org.slf4j.helpers.j.c(r0)
            java.lang.String r0 = "phase were not honored. However, subsequent logging calls to these"
            org.slf4j.helpers.j.c(r0)
            java.lang.String r0 = "loggers will work as normally expected."
            org.slf4j.helpers.j.c(r0)
            java.lang.String r0 = "See also http://www.slf4j.org/codes.html#substituteLogger"
            org.slf4j.helpers.j.c(r0)
            return
    }

    static void e(java.lang.Throwable r1) {
            r0 = 2
            org.slf4j.d.p = r0
            java.lang.String r0 = "Failed to instantiate SLF4J LoggerFactory"
            org.slf4j.helpers.j.d(r0, r1)
            return
    }

    static java.util.Set<java.net.URL> f() {
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.lang.Class<org.slf4j.d> r1 = org.slf4j.d.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.io.IOException -> L14
            if (r1 != 0) goto L16
            java.lang.String r1 = org.slf4j.d.w     // Catch: java.io.IOException -> L14
            java.util.Enumeration r1 = java.lang.ClassLoader.getSystemResources(r1)     // Catch: java.io.IOException -> L14
            goto L1c
        L14:
            r1 = move-exception
            goto L2d
        L16:
            java.lang.String r2 = org.slf4j.d.w     // Catch: java.io.IOException -> L14
            java.util.Enumeration r1 = r1.getResources(r2)     // Catch: java.io.IOException -> L14
        L1c:
            boolean r2 = r1.hasMoreElements()     // Catch: java.io.IOException -> L14
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.nextElement()     // Catch: java.io.IOException -> L14
            java.net.URL r2 = (java.net.URL) r2     // Catch: java.io.IOException -> L14
            r0.add(r2)     // Catch: java.io.IOException -> L14
            goto L1c
        L2c:
            return r0
        L2d:
            java.lang.String r2 = "Error getting resources from path"
            org.slf4j.helpers.j.d(r2, r1)
            return r0
    }

    private static void g() {
            org.slf4j.helpers.i r0 = org.slf4j.d.f69q
            monitor-enter(r0)
            org.slf4j.helpers.i r1 = org.slf4j.d.f69q     // Catch: java.lang.Throwable -> L2a
            r1.f()     // Catch: java.lang.Throwable -> L2a
            org.slf4j.helpers.i r1 = org.slf4j.d.f69q     // Catch: java.lang.Throwable -> L2a
            java.util.List r1 = r1.e()     // Catch: java.lang.Throwable -> L2a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L2a
        L12:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L2a
            org.slf4j.helpers.h r2 = (org.slf4j.helpers.h) r2     // Catch: java.lang.Throwable -> L2a
            java.lang.String r3 = r2.getName()     // Catch: java.lang.Throwable -> L2a
            org.slf4j.c r3 = j(r3)     // Catch: java.lang.Throwable -> L2a
            r2.h(r3)     // Catch: java.lang.Throwable -> L2a
            goto L12
        L2a:
            r1 = move-exception
            goto L2e
        L2c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            return
        L2e:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r1
    }

    public static org.slf4j.a h() {
            int r0 = org.slf4j.d.p
            r1 = 1
            if (r0 != 0) goto L18
            java.lang.Class<org.slf4j.d> r0 = org.slf4j.d.class
            monitor-enter(r0)
            int r2 = org.slf4j.d.p     // Catch: java.lang.Throwable -> L12
            if (r2 != 0) goto L14
            org.slf4j.d.p = r1     // Catch: java.lang.Throwable -> L12
            o()     // Catch: java.lang.Throwable -> L12
            goto L14
        L12:
            r1 = move-exception
            goto L16
        L14:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            goto L18
        L16:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L12
            throw r1
        L18:
            int r0 = org.slf4j.d.p
            if (r0 == r1) goto L41
            r1 = 2
            if (r0 == r1) goto L39
            r1 = 3
            if (r0 == r1) goto L30
            r1 = 4
            if (r0 != r1) goto L28
            org.slf4j.helpers.e r0 = org.slf4j.d.r
            return r0
        L28:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Unreachable code"
            r0.<init>(r1)
            throw r0
        L30:
            org.slf4j.impl.c r0 = org.slf4j.impl.c.c()
            org.slf4j.a r0 = r0.a()
            return r0
        L39:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "org.slf4j.LoggerFactory could not be successfully initialized. See also http://www.slf4j.org/codes.html#unsuccessfulInit"
            r0.<init>(r1)
            throw r0
        L41:
            org.slf4j.helpers.i r0 = org.slf4j.d.f69q
            return r0
    }

    public static org.slf4j.c i(java.lang.Class<?> r4) {
            java.lang.String r0 = r4.getName()
            org.slf4j.c r0 = j(r0)
            boolean r1 = org.slf4j.d.u
            if (r1 == 0) goto L37
            java.lang.Class r1 = org.slf4j.helpers.j.a()
            if (r1 == 0) goto L37
            boolean r4 = n(r4, r1)
            if (r4 == 0) goto L37
            java.lang.String r4 = r0.getName()
            java.lang.String r1 = r1.getName()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r1
            java.lang.String r4 = "Detected logger name mismatch. Given name: \"%s\"; computed name: \"%s\"."
            java.lang.String r4 = java.lang.String.format(r4, r2)
            org.slf4j.helpers.j.c(r4)
            java.lang.String r4 = "See http://www.slf4j.org/codes.html#loggerNameMismatch for an explanation"
            org.slf4j.helpers.j.c(r4)
        L37:
            return r0
    }

    public static org.slf4j.c j(java.lang.String r1) {
            org.slf4j.a r0 = h()
            org.slf4j.c r1 = r0.a(r1)
            return r1
    }

    private static boolean k(java.util.Set<java.net.URL> r1) {
            int r1 = r1.size()
            r0 = 1
            if (r1 <= r0) goto L8
            return r0
        L8:
            r1 = 0
            return r1
    }

    private static boolean l() {
            java.lang.String r0 = "java.vendor.url"
            java.lang.String r0 = org.slf4j.helpers.j.g(r0)
            if (r0 != 0) goto La
            r0 = 0
            return r0
        La:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "android"
            boolean r0 = r0.contains(r1)
            return r0
    }

    private static boolean m(java.lang.String r3) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "org/slf4j/impl/StaticLoggerBinder"
            boolean r1 = r3.contains(r1)
            r2 = 1
            if (r1 == 0) goto Le
            return r2
        Le:
            java.lang.String r1 = "org.slf4j.impl.StaticLoggerBinder"
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L17
            return r2
        L17:
            return r0
    }

    private static boolean n(java.lang.Class<?> r0, java.lang.Class<?> r1) {
            boolean r0 = r1.isAssignableFrom(r0)
            r0 = r0 ^ 1
            return r0
    }

    private static final void o() {
            a()
            int r0 = org.slf4j.d.p
            r1 = 3
            if (r0 != r1) goto Lb
            u()
        Lb:
            return
    }

    private static void p() {
            org.slf4j.helpers.i r0 = org.slf4j.d.f69q
            java.util.concurrent.LinkedBlockingQueue r0 = r0.c()
            int r1 = r0.size()
            java.util.ArrayList r2 = new java.util.ArrayList
            r3 = 128(0x80, float:1.8E-43)
            r2.<init>(r3)
            r4 = 0
        L12:
            int r5 = r0.drainTo(r2, r3)
            if (r5 != 0) goto L19
            return
        L19:
            java.util.Iterator r5 = r2.iterator()
        L1d:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L35
            java.lang.Object r6 = r5.next()
            org.slf4j.event.d r6 = (org.slf4j.event.d) r6
            q(r6)
            int r7 = r4 + 1
            if (r4 != 0) goto L33
            b(r6, r1)
        L33:
            r4 = r7
            goto L1d
        L35:
            r2.clear()
            goto L12
    }

    private static void q(org.slf4j.event.d r3) {
            if (r3 != 0) goto L3
            goto L17
        L3:
            org.slf4j.helpers.h r0 = r3.h()
            java.lang.String r1 = r0.getName()
            boolean r2 = r0.f()
            if (r2 != 0) goto L26
            boolean r2 = r0.e()
            if (r2 == 0) goto L18
        L17:
            return
        L18:
            boolean r2 = r0.d()
            if (r2 == 0) goto L22
            r0.g(r3)
            return
        L22:
            org.slf4j.helpers.j.c(r1)
            return
        L26:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r0 = "Delegate logger cannot be null at this state."
            r3.<init>(r0)
            throw r3
    }

    private static void r(java.util.Set<java.net.URL> r1) {
            if (r1 == 0) goto L29
            boolean r1 = k(r1)
            if (r1 == 0) goto L29
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Actual binding is of type ["
            r1.append(r0)
            org.slf4j.impl.c r0 = org.slf4j.impl.c.c()
            java.lang.String r0 = r0.b()
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            org.slf4j.helpers.j.c(r1)
        L29:
            return
    }

    private static void s(java.util.Set<java.net.URL> r3) {
            boolean r0 = k(r3)
            if (r0 == 0) goto L3a
            java.lang.String r0 = "Class path contains multiple SLF4J bindings."
            org.slf4j.helpers.j.c(r0)
            java.util.Iterator r3 = r3.iterator()
        Lf:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L35
            java.lang.Object r0 = r3.next()
            java.net.URL r0 = (java.net.URL) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Found binding in ["
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = "]"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            org.slf4j.helpers.j.c(r0)
            goto Lf
        L35:
            java.lang.String r3 = "See http://www.slf4j.org/codes.html#multiple_bindings for an explanation."
            org.slf4j.helpers.j.c(r3)
        L3a:
            return
    }

    static void t() {
            r0 = 0
            org.slf4j.d.p = r0
            return
    }

    private static final void u() {
            java.lang.String r0 = org.slf4j.impl.c.c     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            java.lang.String[] r1 = org.slf4j.d.v     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            int r2 = r1.length     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            r3 = 0
            r4 = 0
        L7:
            if (r3 >= r2) goto L15
            r5 = r1[r3]     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            boolean r5 = r0.startsWith(r5)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            if (r5 == 0) goto L12
            r4 = 1
        L12:
            int r3 = r3 + 1
            goto L7
        L15:
            if (r4 != 0) goto L49
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            r1.<init>()     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            java.lang.String r2 = "The requested version "
            r1.append(r2)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            r1.append(r0)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            java.lang.String r0 = " by your slf4j binding is not compatible with "
            r1.append(r0)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            java.lang.String[] r0 = org.slf4j.d.v     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            r1.append(r0)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            org.slf4j.helpers.j.c(r0)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            java.lang.String r0 = "See http://www.slf4j.org/codes.html#version_mismatch for further details."
            org.slf4j.helpers.j.c(r0)     // Catch: java.lang.Throwable -> L43 java.lang.NoSuchFieldError -> L49
            return
        L43:
            r0 = move-exception
            java.lang.String r1 = "Unexpected problem occured during version sanity check"
            org.slf4j.helpers.j.d(r1, r0)
        L49:
            return
    }
}

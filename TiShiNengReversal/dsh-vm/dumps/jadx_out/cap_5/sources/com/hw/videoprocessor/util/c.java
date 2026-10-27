package com.hw.videoprocessor.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c {
    private static boolean a;
    private static int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a {
        java.lang.String a;
        java.lang.String b;
        int c;

        a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            return
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(com.hw.videoprocessor.util.c.a r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = "."
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "():"
            r0.append(r1)
            int r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = i(r3, r4)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String b(com.hw.videoprocessor.util.c.a r2, java.lang.String r3, java.lang.Object... r4) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.String r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = "():"
            r0.append(r1)
            int r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = i(r3, r4)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static void c(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto L16
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.hw.videoprocessor.util.c$a r0 = j(r0)
            b(r0, r1, r2)
            java.lang.String r1 = r0.a
        L16:
            return
    }

    public static void d(java.lang.Throwable r1) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto Le
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            com.hw.videoprocessor.util.c$a r1 = j(r1)
            java.lang.String r1 = r1.a
        Le:
            return
    }

    public static void e(java.lang.String r0, java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto L14
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.hw.videoprocessor.util.c$a r0 = j(r0)
            a(r0, r1, r2)
        L14:
            return
    }

    public static void f(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto L16
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.hw.videoprocessor.util.c$a r0 = j(r0)
            b(r0, r1, r2)
            java.lang.String r1 = r0.a
        L16:
            return
    }

    public static void g(java.lang.Throwable r1) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto Le
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            com.hw.videoprocessor.util.c$a r1 = j(r1)
            java.lang.String r1 = r1.a
        Le:
            return
    }

    public static void h(java.lang.String r0, java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto L14
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.hw.videoprocessor.util.c$a r0 = j(r0)
            a(r0, r1, r2)
        L14:
            return
    }

    private static java.lang.String i(java.lang.String r1, java.lang.Object... r2) {
            int r0 = r2.length
            if (r0 != 0) goto L4
            return r1
        L4:
            java.lang.String r1 = java.lang.String.format(r1, r2)
            return r1
    }

    private static com.hw.videoprocessor.util.c.a j(java.lang.StackTraceElement[] r5) {
            com.hw.videoprocessor.util.c$a r0 = new com.hw.videoprocessor.util.c$a
            r0.<init>()
            int r1 = r5.length
            r2 = 1
            if (r1 <= r2) goto L38
            r1 = r5[r2]
            java.lang.String r1 = r1.getFileName()
            r0.a = r1
            java.lang.String r3 = ".java"
            boolean r1 = r1.endsWith(r3)
            if (r1 == 0) goto L28
            java.lang.String r1 = r0.a
            int r3 = r1.length()
            int r3 = r3 + (-5)
            r4 = 0
            java.lang.String r1 = r1.substring(r4, r3)
            r0.a = r1
        L28:
            r1 = r5[r2]
            java.lang.String r1 = r1.getMethodName()
            r0.b = r1
            r5 = r5[r2]
            int r5 = r5.getLineNumber()
            r0.c = r5
        L38:
            return r0
    }

    public static void k(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto L16
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.hw.videoprocessor.util.c$a r0 = j(r0)
            b(r0, r1, r2)
            java.lang.String r1 = r0.a
        L16:
            return
    }

    public static void l(java.lang.Throwable r1) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto Le
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            com.hw.videoprocessor.util.c$a r1 = j(r1)
            java.lang.String r1 = r1.a
        Le:
            return
    }

    public static boolean m() {
            boolean r0 = com.hw.videoprocessor.util.c.a
            return r0
    }

    public static void n(java.lang.String r0, java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto L14
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.hw.videoprocessor.util.c$a r0 = j(r0)
            a(r0, r1, r2)
        L14:
            return
    }

    public static void o(java.lang.String r0) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto Lc
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            android.util.Log.getStackTraceString(r0)
        Lc:
            return
    }

    public static void p(boolean r2) {
            int r0 = com.hw.videoprocessor.util.c.b
            r1 = 1
            int r0 = r0 + r1
            com.hw.videoprocessor.util.c.b = r0
            if (r0 <= r1) goto L9
            return
        L9:
            com.hw.videoprocessor.util.c.a = r2
            return
    }

    public static void q(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto L16
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.hw.videoprocessor.util.c$a r0 = j(r0)
            b(r0, r1, r2)
            java.lang.String r1 = r0.a
        L16:
            return
    }

    public static void r(java.lang.Throwable r1) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto Le
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            com.hw.videoprocessor.util.c$a r1 = j(r1)
            java.lang.String r1 = r1.a
        Le:
            return
    }

    public static void s(java.lang.String r0, java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto L14
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.hw.videoprocessor.util.c$a r0 = j(r0)
            a(r0, r1, r2)
        L14:
            return
    }

    public static void t(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto L16
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.hw.videoprocessor.util.c$a r0 = j(r0)
            b(r0, r1, r2)
            java.lang.String r1 = r0.a
        L16:
            return
    }

    public static void u(java.lang.Throwable r1) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto Le
            java.lang.StackTraceElement[] r1 = r1.getStackTrace()
            com.hw.videoprocessor.util.c$a r1 = j(r1)
            java.lang.String r1 = r1.a
        Le:
            return
    }

    public static void v(java.lang.String r0, java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto L14
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.hw.videoprocessor.util.c$a r0 = j(r0)
            a(r0, r1, r2)
        L14:
            return
    }

    public static void w(java.lang.String r1, java.lang.Object... r2) {
            boolean r0 = com.hw.videoprocessor.util.c.a
            if (r0 == 0) goto L16
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.hw.videoprocessor.util.c$a r0 = j(r0)
            b(r0, r1, r2)
            java.lang.String r1 = r0.a
        L16:
            return
    }
}

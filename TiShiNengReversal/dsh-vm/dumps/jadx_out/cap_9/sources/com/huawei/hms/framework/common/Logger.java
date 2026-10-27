package com.huawei.hms.framework.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Logger {
    private static final boolean a = false;
    private static final java.lang.String b = "NetworkKit_Logger";
    private static final java.lang.String c = "|";
    private static final int d = 8;
    private static final int e = 20;
    private static final java.lang.String f = "NetworkKit_";
    private static final java.lang.String g = "NetworkSdk_";
    private static com.huawei.hms.framework.common.ExtLogger h = null;
    private static boolean i = true;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.huawei.hms.framework.common.Logger$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ThrowableWrapper extends java.lang.Throwable {
        private static final long serialVersionUID = 7129050843360571879L;
        private java.lang.String a;
        private java.lang.Throwable b;
        private java.lang.Throwable c;

        private ThrowableWrapper(java.lang.Throwable r4) {
                r3 = this;
                r3.<init>()
                r3.c = r4
                java.lang.StackTraceElement[] r0 = r4.getStackTrace()
                boolean r1 = r4 instanceof java.io.IOException
                if (r1 != 0) goto L15
                boolean r1 = r4 instanceof org.json.JSONException
                if (r1 == 0) goto L12
                goto L15
            L12:
                r1 = 20
                goto L17
            L15:
                r1 = 8
            L17:
                int r2 = r0.length
                if (r2 <= r1) goto L24
                java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r1)
                java.lang.StackTraceElement[] r0 = (java.lang.StackTraceElement[]) r0
                r3.setStackTrace(r0)
                goto L27
            L24:
                r3.setStackTrace(r0)
            L27:
                java.lang.String r4 = r4.getMessage()
                java.lang.String r4 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r4)
                r3.setMessage(r4)
                return
        }

        /* synthetic */ ThrowableWrapper(java.lang.Throwable r1, com.huawei.hms.framework.common.Logger.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private synchronized void a(java.lang.Throwable r1) {
                r0 = this;
                monitor-enter(r0)
                r0.b = r1     // Catch: java.lang.Throwable -> L5
                monitor-exit(r0)
                return
            L5:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L5
                throw r1
        }

        static /* synthetic */ void access$100(com.huawei.hms.framework.common.Logger.ThrowableWrapper r0, java.lang.Throwable r1) {
                r0.a(r1)
                return
        }

        @Override // java.lang.Throwable
        public synchronized java.lang.Throwable getCause() {
                r1 = this;
                monitor-enter(r1)
                java.lang.Throwable r0 = r1.b     // Catch: java.lang.Throwable -> L8
                if (r0 != r1) goto L6
                r0 = 0
            L6:
                monitor-exit(r1)
                return r0
            L8:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
                throw r0
        }

        @Override // java.lang.Throwable
        public java.lang.String getMessage() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }

        public void setMessage(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // java.lang.Throwable
        public java.lang.String toString() {
                r2 = this;
                java.lang.Throwable r0 = r2.c
                if (r0 != 0) goto L7
                java.lang.String r0 = ""
                return r0
            L7:
                java.lang.Class r0 = r0.getClass()
                java.lang.String r0 = r0.getName()
                java.lang.String r1 = r2.a
                if (r1 == 0) goto L40
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = ": "
                r1.append(r0)
                java.lang.String r0 = r1.toString()
                java.lang.String r1 = r2.a
                boolean r1 = r1.startsWith(r0)
                if (r1 == 0) goto L2f
                java.lang.String r0 = r2.a
                return r0
            L2f:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r0)
                java.lang.String r0 = r2.a
                r1.append(r0)
                java.lang.String r0 = r1.toString()
            L40:
                return r0
        }
    }

    static {
            return
    }

    public Logger() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String a(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NetworkSdk_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String b(java.lang.String r1, int r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L26
            java.lang.String r2 = g(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L11
            return r1
        L11:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "|"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
        L26:
            java.lang.String r1 = g(r2)
            return r1
    }

    private static java.lang.String c(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "NetworkKit_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    @android.annotation.SuppressLint({"LogTagMismatch"})
    public static void d(java.lang.String r1, java.lang.Object r2) {
            r0 = 3
            println(r0, r1, r2)
            return
    }

    @android.annotation.SuppressLint({"LogTagMismatch"})
    public static void d(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 3
            println(r0, r1, r2, r3)
            return
    }

    public static void e(java.lang.String r1, java.lang.Object r2) {
            r0 = 6
            println(r0, r1, r2)
            return
    }

    public static void e(java.lang.String r5, java.lang.String r6, java.lang.Throwable r7) {
            r0 = 6
            boolean r0 = j(r0)
            r1 = 5
            if (r0 == 0) goto L19
            com.huawei.hms.framework.common.ExtLogger r0 = com.huawei.hms.framework.common.Logger.h
            java.lang.String r2 = a(r5)
            java.lang.String r3 = b(r6, r1)
            java.lang.Throwable r4 = h(r7)
            r0.e(r2, r3, r4)
        L19:
            boolean r0 = com.huawei.hms.framework.common.Logger.i
            if (r0 == 0) goto L26
            c(r5)
            b(r6, r1)
            h(r7)
        L26:
            return
    }

    public static void e(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 6
            println(r0, r1, r2, r3)
            return
    }

    private static void f(int r1, java.lang.String r2, java.lang.String r3) {
            r0 = 2
            if (r1 == r0) goto L28
            r0 = 3
            if (r1 == r0) goto L22
            r0 = 4
            if (r1 == r0) goto L1c
            r0 = 5
            if (r1 == r0) goto L16
            r0 = 6
            if (r1 == r0) goto L10
            return
        L10:
            com.huawei.hms.framework.common.ExtLogger r1 = com.huawei.hms.framework.common.Logger.h
            r1.e(r2, r3)
            return
        L16:
            com.huawei.hms.framework.common.ExtLogger r1 = com.huawei.hms.framework.common.Logger.h
            r1.w(r2, r3)
            return
        L1c:
            com.huawei.hms.framework.common.ExtLogger r1 = com.huawei.hms.framework.common.Logger.h
            r1.i(r2, r3)
            return
        L22:
            com.huawei.hms.framework.common.ExtLogger r1 = com.huawei.hms.framework.common.Logger.h
            r1.d(r2, r3)
            return
        L28:
            com.huawei.hms.framework.common.ExtLogger r1 = com.huawei.hms.framework.common.Logger.h
            r1.v(r2, r3)
            return
    }

    private static java.lang.String g(int r3) {
            java.lang.String r0 = "NetworkKit_"
            r1 = 3
            boolean r0 = android.util.Log.isLoggable(r0, r1)
            java.lang.String r1 = ""
            if (r0 != 0) goto Lc
            return r1
        Lc:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r2 = r0.length
            if (r2 <= r3) goto L58
            r3 = r0[r3]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "|"
            r0.append(r1)
            java.lang.String r2 = r3.getFileName()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r3.getClassName()
            r0.append(r2)
            r0.append(r1)
            java.lang.String r2 = r3.getMethodName()
            r0.append(r2)
            r0.append(r1)
            int r3 = r3.getLineNumber()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        L58:
            return r1
    }

    private static java.lang.Throwable h(java.lang.Throwable r4) {
            r0 = 3
            boolean r0 = isLoggable(r0)
            if (r0 == 0) goto L8
            return r4
        L8:
            r0 = 0
            if (r4 != 0) goto Lc
            return r0
        Lc:
            com.huawei.hms.framework.common.Logger$ThrowableWrapper r1 = new com.huawei.hms.framework.common.Logger$ThrowableWrapper
            r1.<init>(r4, r0)
            java.lang.Throwable r4 = r4.getCause()
            r2 = r1
        L16:
            if (r4 == 0) goto L26
            com.huawei.hms.framework.common.Logger$ThrowableWrapper r3 = new com.huawei.hms.framework.common.Logger$ThrowableWrapper
            r3.<init>(r4, r0)
            com.huawei.hms.framework.common.Logger.ThrowableWrapper.access$100(r2, r3)
            java.lang.Throwable r4 = r4.getCause()
            r2 = r3
            goto L16
        L26:
            return r1
    }

    @android.annotation.SuppressLint({"LogTagMismatch"})
    public static void i(java.lang.String r1, java.lang.Object r2) {
            r0 = 4
            println(r0, r1, r2)
            return
    }

    @android.annotation.SuppressLint({"LogTagMismatch"})
    public static void i(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 4
            println(r0, r1, r2, r3)
            return
    }

    public static boolean isLoggable(int r1) {
            java.lang.String r0 = "NetworkKit_"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            return r1
    }

    private static boolean j(int r1) {
            com.huawei.hms.framework.common.ExtLogger r0 = com.huawei.hms.framework.common.Logger.h
            if (r0 == 0) goto L9
            r0 = 3
            if (r1 < r0) goto L9
            r1 = 1
            return r1
        L9:
            r1 = 0
            return r1
    }

    private static boolean k(int r1) {
            boolean r0 = com.huawei.hms.framework.common.Logger.i
            if (r0 == 0) goto Lc
            boolean r1 = isLoggable(r1)
            if (r1 == 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private static int l(int r3, java.lang.String r4, java.lang.String r5) {
            boolean r0 = j(r3)
            r1 = 7
            if (r0 == 0) goto L12
            java.lang.String r0 = a(r4)
            java.lang.String r2 = b(r5, r1)
            f(r3, r0, r2)
        L12:
            boolean r0 = k(r3)
            if (r0 == 0) goto L25
            java.lang.String r4 = c(r4)
            java.lang.String r5 = b(r5, r1)
            int r3 = android.util.Log.println(r3, r4, r5)
            return r3
        L25:
            r3 = 1
            return r3
    }

    public static void println(int r1, java.lang.String r2, java.lang.Object r3) {
            r0 = 3
            if (r1 >= r0) goto L4
            return
        L4:
            if (r3 != 0) goto L9
            java.lang.String r3 = "null"
            goto Ld
        L9:
            java.lang.String r3 = r3.toString()
        Ld:
            l(r1, r2, r3)
            return
    }

    public static void println(int r1, java.lang.String r2, java.lang.String r3, java.lang.Object... r4) {
            r0 = 3
            if (r1 >= r0) goto L4
            return
        L4:
            if (r3 != 0) goto L7
            return
        L7:
            java.lang.String r4 = com.huawei.hms.framework.common.StringUtils.format(r3, r4)     // Catch: java.util.IllegalFormatException -> Lf
            l(r1, r2, r4)     // Catch: java.util.IllegalFormatException -> Lf
            return
        Lf:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "log format error"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "NetworkKit_Logger"
            w(r3, r2, r1)
            return
    }

    public static void setExtLogger(com.huawei.hms.framework.common.ExtLogger r2, boolean r3) {
            com.huawei.hms.framework.common.Logger.h = r2
            com.huawei.hms.framework.common.Logger.i = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "logger = "
            r0.append(r1)
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            java.lang.String r3 = "NetworkKit_Logger"
            i(r3, r2)
            return
    }

    public static void v(java.lang.String r1, java.lang.Object r2) {
            r0 = 2
            println(r0, r1, r2)
            return
    }

    public static void v(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 2
            println(r0, r1, r2, r3)
            return
    }

    public static void w(java.lang.String r1, java.lang.Object r2) {
            r0 = 5
            println(r0, r1, r2)
            return
    }

    public static void w(java.lang.String r5, java.lang.String r6, java.lang.Throwable r7) {
            r0 = 5
            boolean r1 = j(r0)
            if (r1 == 0) goto L18
            com.huawei.hms.framework.common.ExtLogger r1 = com.huawei.hms.framework.common.Logger.h
            java.lang.String r2 = a(r5)
            java.lang.String r3 = b(r6, r0)
            java.lang.Throwable r4 = h(r7)
            r1.w(r2, r3, r4)
        L18:
            boolean r1 = com.huawei.hms.framework.common.Logger.i
            if (r1 == 0) goto L25
            c(r5)
            b(r6, r0)
            h(r7)
        L25:
            return
    }

    public static void w(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 5
            println(r0, r1, r2, r3)
            return
    }
}

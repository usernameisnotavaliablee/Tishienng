package com.huawei.hms.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class Logger {
    public static final boolean a = false;
    public static final java.lang.String b = "Logger";
    public static final java.lang.String c = "|";
    public static final int d = 8;
    public static final int e = 20;
    public static final java.lang.String f = "dynamic-api_";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b extends java.lang.Throwable {
        public static final long d = 7129050843360571879L;
        public java.lang.String a;
        public java.lang.Throwable b;
        public java.lang.Throwable c;

        public b(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.c = r1
                return
        }

        public /* synthetic */ b(java.lang.Throwable r1, com.huawei.hms.common.util.Logger.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public static /* synthetic */ void a(com.huawei.hms.common.util.Logger.b r0, java.lang.Throwable r1) {
                r0.a(r1)
                return
        }

        private void a(java.lang.Throwable r1) {
                r0 = this;
                r0.b = r1
                return
        }

        public void a(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                return
        }

        @Override // java.lang.Throwable
        public java.lang.Throwable getCause() {
                r1 = this;
                java.lang.Throwable r0 = r1.b
                if (r0 != r1) goto L5
                r0 = 0
            L5:
                return r0
        }

        @Override // java.lang.Throwable
        public java.lang.String getMessage() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
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

    public Logger() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(int r1, java.lang.String r2, java.lang.String r3) {
            java.lang.String r2 = a(r2)
            r0 = 7
            java.lang.String r3 = a(r3, r0)
            int r1 = android.util.Log.println(r1, r2, r3)
            return r1
    }

    public static java.lang.String a(int r3) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            int r1 = r0.length
            if (r1 <= r3) goto L54
            r3 = r0[r3]
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = android.os.Process.myPid()
            r0.append(r1)
            java.lang.String r1 = "-"
            r0.append(r1)
            int r1 = android.os.Process.myTid()
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
        L54:
            java.lang.String r3 = ""
            return r3
    }

    public static java.lang.String a(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "dynamic-api_"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static java.lang.String a(java.lang.String r1, int r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L1f
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = a(r2)
            r0.append(r2)
            java.lang.String r2 = "|"
            r0.append(r2)
            r0.append(r1)
            java.lang.String r1 = r0.toString()
            return r1
        L1f:
            java.lang.String r1 = a(r2)
            return r1
    }

    public static java.lang.Throwable a(java.lang.Throwable r5) {
            r0 = 3
            boolean r0 = isLoggable(r0)
            if (r0 == 0) goto L8
            return r5
        L8:
            r0 = 0
            if (r5 != 0) goto Lc
            return r0
        Lc:
            boolean r1 = r5 instanceof java.io.IOException
            if (r1 != 0) goto L18
            boolean r1 = r5 instanceof org.json.JSONException
            if (r1 == 0) goto L15
            goto L18
        L15:
            r1 = 20
            goto L1a
        L18:
            r1 = 8
        L1a:
            com.huawei.hms.common.util.Logger$b r2 = new com.huawei.hms.common.util.Logger$b
            r2.<init>(r5, r0)
            java.lang.StackTraceElement[] r3 = r2.getStackTrace()
            int r4 = r3.length
            if (r4 <= r1) goto L30
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r3, r1)
            java.lang.StackTraceElement[] r1 = (java.lang.StackTraceElement[]) r1
            r2.setStackTrace(r1)
            goto L33
        L30:
            r2.setStackTrace(r3)
        L33:
            java.lang.String r1 = r5.getMessage()
            java.lang.String r1 = anonymizeMessage(r1)
            r2.a(r1)
            java.lang.Throwable r5 = r5.getCause()
            r1 = r2
        L43:
            if (r5 == 0) goto L5e
            com.huawei.hms.common.util.Logger$b r3 = new com.huawei.hms.common.util.Logger$b
            r3.<init>(r5, r0)
            java.lang.String r4 = r5.getMessage()
            java.lang.String r4 = anonymizeMessage(r4)
            r3.a(r4)
            com.huawei.hms.common.util.Logger.b.a(r1, r3)
            java.lang.Throwable r5 = r5.getCause()
            r1 = r3
            goto L43
        L5e:
            return r2
    }

    public static java.lang.String anonymizeMessage(java.lang.String r3) {
            if (r3 == 0) goto L23
            int r0 = r3.length()
            if (r0 != 0) goto L9
            goto L23
        L9:
            char[] r3 = r3.toCharArray()
            r0 = 0
        Le:
            int r1 = r3.length
            if (r0 >= r1) goto L1d
            int r1 = r0 % 2
            r2 = 1
            if (r1 != r2) goto L1a
            r1 = 42
            r3[r0] = r1
        L1a:
            int r0 = r0 + 1
            goto Le
        L1d:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r3)
            return r0
        L23:
            return r3
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

    public static void e(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            a(r0)
            r0 = 5
            a(r1, r0)
            a(r2)
            return
    }

    public static void e(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 6
            println(r0, r1, r2, r3)
            return
    }

    public static java.lang.String format(java.lang.String r1, java.lang.Object... r2) {
            if (r1 != 0) goto L5
            java.lang.String r1 = ""
            return r1
        L5:
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = java.lang.String.format(r0, r1, r2)
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
            java.lang.String r0 = "dynamic-api_"
            boolean r1 = android.util.Log.isLoggable(r0, r1)
            return r1
    }

    public static void println(int r1, java.lang.String r2, java.lang.Object r3) {
            r0 = 3
            if (r1 >= r0) goto L4
            goto L16
        L4:
            boolean r0 = isLoggable(r1)
            if (r0 == 0) goto L16
            if (r3 != 0) goto Lf
            java.lang.String r3 = "null"
            goto L13
        Lf:
            java.lang.String r3 = r3.toString()
        L13:
            a(r1, r2, r3)
        L16:
            return
    }

    public static void println(int r1, java.lang.String r2, java.lang.String r3, java.lang.Object... r4) {
            r0 = 3
            if (r1 >= r0) goto L4
            goto L17
        L4:
            if (r3 != 0) goto L7
            return
        L7:
            boolean r0 = isLoggable(r1)     // Catch: java.util.IllegalFormatException -> L15
            if (r0 == 0) goto L17
            java.lang.String r4 = format(r3, r4)     // Catch: java.util.IllegalFormatException -> L15
            a(r1, r2, r4)     // Catch: java.util.IllegalFormatException -> L15
            return
        L15:
            r1 = move-exception
            goto L18
        L17:
            return
        L18:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = "log format error"
            r2.append(r4)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "Logger"
            w(r3, r2, r1)
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

    public static void w(java.lang.String r0, java.lang.String r1, java.lang.Throwable r2) {
            a(r0)
            r0 = 5
            a(r1, r0)
            a(r2)
            return
    }

    public static void w(java.lang.String r1, java.lang.String r2, java.lang.Object... r3) {
            r0 = 5
            println(r0, r1, r2, r3)
            return
    }
}

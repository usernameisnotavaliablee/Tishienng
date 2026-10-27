package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = -1;
    public static int f = -1;
    static java.lang.ThreadLocal<java.lang.StringBuilder> g;
    private static int h;

    static {
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            com.kuaishou.weapon.p0.e.g = r0
            return
    }

    public e() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.Throwable r2) {
            java.lang.String r0 = ""
            if (r2 != 0) goto L5
            return r0
        L5:
            if (r2 == 0) goto L11
            boolean r1 = r2 instanceof java.net.UnknownHostException
            if (r1 == 0) goto Lc
            return r0
        Lc:
            java.lang.Throwable r2 = r2.getCause()
            goto L5
        L11:
            java.io.StringWriter r2 = new java.io.StringWriter
            r2.<init>()
            java.io.PrintWriter r0 = new java.io.PrintWriter
            r0.<init>(r2)
            java.lang.String r2 = r2.toString()
            return r2
    }

    private static void a(int r5, java.lang.String r6) {
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            if (r5 == 0) goto L7
            goto L14
        L7:
            java.lang.Throwable r5 = new java.lang.Throwable
            r5.<init>()
            java.lang.StackTraceElement[] r5 = r5.getStackTrace()
            int r0 = r5.length
            r1 = 3
            if (r0 >= r1) goto L15
        L14:
            return
        L15:
            r0 = 2
            r1 = r5[r0]
            java.lang.String r1 = r1.getFileName()
            r2 = r5[r0]
            int r2 = r2.getLineNumber()
            r5 = r5[r0]
            java.lang.String r5 = r5.getMethodName()
            int r0 = r1.length()
            r3 = 0
            r4 = 5
            if (r0 <= r4) goto L39
            int r0 = r1.length()
            int r0 = r0 - r4
            java.lang.String r1 = r1.substring(r3, r0)
        L39:
            java.lang.ThreadLocal<java.lang.StringBuilder> r0 = com.kuaishou.weapon.p0.e.g
            java.lang.Object r0 = r0.get()
            java.lang.StringBuilder r0 = (java.lang.StringBuilder) r0
            if (r0 != 0) goto L4d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.ThreadLocal<java.lang.StringBuilder> r4 = com.kuaishou.weapon.p0.e.g
            r4.set(r0)
        L4d:
            monitor-enter(r0)
            r0.setLength(r3)     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = "["
            r0.append(r3)     // Catch: java.lang.Throwable -> L83
            int r3 = com.kuaishou.weapon.p0.e.h     // Catch: java.lang.Throwable -> L83
            r0.append(r3)     // Catch: java.lang.Throwable -> L83
            java.lang.String r3 = "]["
            r0.append(r3)     // Catch: java.lang.Throwable -> L83
            r0.append(r1)     // Catch: java.lang.Throwable -> L83
            r1 = 58
            r0.append(r1)     // Catch: java.lang.Throwable -> L83
            r0.append(r2)     // Catch: java.lang.Throwable -> L83
            r1 = 46
            r0.append(r1)     // Catch: java.lang.Throwable -> L83
            r0.append(r5)     // Catch: java.lang.Throwable -> L83
            java.lang.String r5 = "] "
            r0.append(r5)     // Catch: java.lang.Throwable -> L83
            r0.append(r6)     // Catch: java.lang.Throwable -> L83
            int r5 = com.kuaishou.weapon.p0.e.h     // Catch: java.lang.Throwable -> L83
            int r5 = r5 + 1
            com.kuaishou.weapon.p0.e.h = r5     // Catch: java.lang.Throwable -> L83
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            return
        L83:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L83
            throw r5
    }

    public static void a(java.lang.String r2) {
            int r0 = com.kuaishou.weapon.p0.e.f
            r1 = -1
            if (r0 == r1) goto L8
            if (r0 == 0) goto L8
            return
        L8:
            r0 = 0
            a(r0, r2)
            return
    }

    public static void a(java.lang.String r2, java.lang.Throwable r3) {
            int r0 = com.kuaishou.weapon.p0.e.f
            r1 = -1
            if (r0 == r1) goto L8
            if (r0 == 0) goto L8
            return
        L8:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "\n"
            r0.append(r2)
            java.lang.String r2 = a(r3)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            r3 = 0
            a(r3, r2)
            return
    }

    public static void b(java.lang.String r3) {
            int r0 = com.kuaishou.weapon.p0.e.f
            r1 = -1
            r2 = 1
            if (r0 == r1) goto Lb
            if (r0 == 0) goto Lb
            if (r0 == r2) goto Lb
            return
        Lb:
            a(r2, r3)
            return
    }

    public static void b(java.lang.String r3, java.lang.Throwable r4) {
            int r0 = com.kuaishou.weapon.p0.e.f
            r1 = -1
            r2 = 1
            if (r0 == r1) goto Lb
            if (r0 == 0) goto Lb
            if (r0 == r2) goto Lb
            return
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "\n"
            r0.append(r3)
            java.lang.String r3 = a(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            a(r2, r3)
            return
    }

    public static void c(java.lang.String r3) {
            int r0 = com.kuaishou.weapon.p0.e.f
            r1 = -1
            r2 = 2
            if (r0 == r1) goto Le
            if (r0 == 0) goto Le
            r1 = 1
            if (r0 == r1) goto Le
            if (r0 == r2) goto Le
            return
        Le:
            a(r2, r3)
            return
    }

    public static void c(java.lang.String r3, java.lang.Throwable r4) {
            int r0 = com.kuaishou.weapon.p0.e.f
            r1 = -1
            r2 = 2
            if (r0 == r1) goto Le
            if (r0 == 0) goto Le
            r1 = 1
            if (r0 == r1) goto Le
            if (r0 == r2) goto Le
            return
        Le:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r3)
            java.lang.String r3 = "\n"
            r0.append(r3)
            java.lang.String r3 = a(r4)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            a(r2, r3)
            return
    }

    public static void d(java.lang.String r0) {
            return
    }
}

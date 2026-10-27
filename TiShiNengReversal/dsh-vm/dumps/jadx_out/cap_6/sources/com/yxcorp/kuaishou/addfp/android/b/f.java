package com.yxcorp.kuaishou.addfp.android.b;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f {
    private static boolean a;

    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            java.lang.String r1 = "KWE_N"
        L8:
            return r1
    }

    public static java.lang.String a(java.lang.Throwable r2) {
            r0 = r2
        L1:
            if (r0 == 0) goto Lf
            boolean r1 = r0 instanceof java.net.UnknownHostException
            if (r1 == 0) goto La
            java.lang.String r2 = "UnknownHostException"
            return r2
        La:
            java.lang.Throwable r0 = r0.getCause()     // Catch: java.lang.Throwable -> L24
            goto L1
        Lf:
            java.io.StringWriter r0 = new java.io.StringWriter     // Catch: java.lang.Throwable -> L24
            r0.<init>()     // Catch: java.lang.Throwable -> L24
            java.io.PrintWriter r1 = new java.io.PrintWriter     // Catch: java.lang.Throwable -> L24
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L24
            r2.getClass()     // Catch: java.lang.Throwable -> L24
            java.lang.String r2 = r0.toString()     // Catch: java.lang.Throwable -> L24
            r1.close()     // Catch: java.lang.Throwable -> L24
            return r2
        L24:
            java.lang.String r2 = ""
            return r2
    }

    public static void a(boolean r0) {
            com.yxcorp.kuaishou.addfp.android.b.f.a = r0
            return
    }

    public static boolean a(android.content.Context r6, java.lang.String[] r7) {
            r0 = 0
            int r1 = r7.length     // Catch: java.lang.Throwable -> L1a
            r2 = 0
        L3:
            if (r2 >= r1) goto L1a
            r3 = r7[r2]     // Catch: java.lang.Throwable -> L1a
            int r4 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L1a
            int r5 = android.os.Process.myUid()     // Catch: java.lang.Throwable -> L1a
            int r3 = r6.checkPermission(r3, r4, r5)     // Catch: java.lang.Throwable -> L1a
            if (r3 != 0) goto L17
            r6 = 1
            return r6
        L17:
            int r2 = r2 + 1
            goto L3
        L1a:
            return r0
    }
}

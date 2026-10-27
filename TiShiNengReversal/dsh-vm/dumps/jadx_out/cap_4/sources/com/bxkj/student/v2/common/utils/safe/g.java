package com.bxkj.student.v2.common.utils.safe;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class g {

    @org.jetbrains.annotations.NotNull
    public static final com.bxkj.student.v2.common.utils.safe.g a = null;

    static {
            com.bxkj.student.v2.common.utils.safe.g r0 = new com.bxkj.student.v2.common.utils.safe.g
            r0.<init>()
            com.bxkj.student.v2.common.utils.safe.g.a = r0
            return
    }

    private g() {
            r0 = this;
            r0.<init>()
            return
    }

    private final boolean a() {
            r5 = this;
            java.lang.String r0 = android.os.Build.TAGS
            r1 = 0
            if (r0 == 0) goto L11
            r2 = 2
            r3 = 0
            java.lang.String r4 = "test-keys"
            boolean r0 = kotlin.text.u.l3(r0, r4, r1, r2, r3)
            if (r0 == 0) goto L11
            r0 = 1
            return r0
        L11:
            return r1
    }

    private final boolean b() {
            r10 = this;
            java.lang.String r8 = "/data/local/su"
            java.lang.String r9 = "/su/bin/su"
            java.lang.String r0 = "/system/app/Superuser.apk"
            java.lang.String r1 = "/sbin/su"
            java.lang.String r2 = "/system/bin/su"
            java.lang.String r3 = "/system/xbin/su"
            java.lang.String r4 = "/data/local/xbin/su"
            java.lang.String r5 = "/data/local/bin/su"
            java.lang.String r6 = "/system/sd/xbin/su"
            java.lang.String r7 = "/system/bin/failsafe/su"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            r1 = 0
            r2 = 0
        L1a:
            r3 = 10
            if (r2 >= r3) goto L30
            r3 = r0[r2]
            java.io.File r4 = new java.io.File
            r4.<init>(r3)
            boolean r3 = r4.exists()
            if (r3 == 0) goto L2d
            r0 = 1
            return r0
        L2d:
            int r2 = r2 + 1
            goto L1a
        L30:
            return r1
    }

    private final boolean c() {
            r5 = this;
            r0 = 0
            r1 = 0
            java.lang.Runtime r2 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r3 = "/system/xbin/which"
            java.lang.String r4 = "su"
            java.lang.String[] r3 = new java.lang.String[]{r3, r4}     // Catch: java.lang.Throwable -> L2b
            java.lang.Process r1 = r2.exec(r3)     // Catch: java.lang.Throwable -> L2b
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2b
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2b
            java.io.InputStream r4 = r1.getInputStream()     // Catch: java.lang.Throwable -> L2b
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = r2.readLine()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L27
            r0 = 1
        L27:
            r1.destroy()
            return r0
        L2b:
            if (r1 == 0) goto L31
            r1.destroy()
        L31:
            return r0
    }

    public final boolean d() {
            r1 = this;
            boolean r0 = r1.a()
            if (r0 != 0) goto L15
            boolean r0 = r1.b()
            if (r0 != 0) goto L15
            boolean r0 = r1.c()
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }
}

package com.umeng.commonsdk.internal.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class h {
    public h() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a() {
            boolean r0 = b()
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            boolean r0 = c()
            if (r0 == 0) goto Lf
            return r1
        Lf:
            boolean r0 = d()
            if (r0 == 0) goto L16
            return r1
        L16:
            boolean r0 = e()
            if (r0 == 0) goto L1d
            return r1
        L1d:
            r0 = 0
            return r0
    }

    private static boolean b() {
            java.lang.String r0 = android.os.Build.TAGS
            if (r0 == 0) goto Le
            java.lang.String r1 = "test-keys"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private static boolean c() {
            r0 = 1
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> Lf
            java.lang.String r2 = "/system/app/Superuser.apk"
            r1.<init>(r2)     // Catch: java.lang.Exception -> Lf
            boolean r1 = r1.exists()     // Catch: java.lang.Exception -> Lf
            if (r1 == 0) goto Lf
            return r0
        Lf:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Exception -> L1d
            java.lang.String r2 = "/system/app/Kinguser.apk"
            r1.<init>(r2)     // Catch: java.lang.Exception -> L1d
            boolean r1 = r1.exists()     // Catch: java.lang.Exception -> L1d
            if (r1 == 0) goto L1d
            return r0
        L1d:
            r0 = 0
            return r0
    }

    private static boolean d() {
            com.umeng.commonsdk.internal.utils.e r0 = new com.umeng.commonsdk.internal.utils.e
            r0.<init>()
            com.umeng.commonsdk.internal.utils.e$a r1 = com.umeng.commonsdk.internal.utils.e.a.a
            java.util.ArrayList r0 = r0.a(r1)
            if (r0 == 0) goto Lf
            r0 = 1
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private static boolean e() {
            java.lang.String r10 = "/system/bin/failsafe/"
            java.lang.String r11 = "/data/local/"
            java.lang.String r0 = "/bin"
            java.lang.String r1 = "/system/bin/"
            java.lang.String r2 = "/system/xbin/"
            java.lang.String r3 = "/system/sbin/"
            java.lang.String r4 = "/sbin/"
            java.lang.String r5 = "/vendor/bin/"
            java.lang.String r6 = "/su/bin/"
            java.lang.String r7 = "/data/local/xbin/"
            java.lang.String r8 = "/data/local/bin/"
            java.lang.String r9 = "/system/sd/xbin/"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            r1 = 0
            r2 = 0
        L1e:
            r3 = 12
            if (r2 >= r3) goto L45
            r3 = r0[r2]
            java.io.File r4 = new java.io.File
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r3)
            java.lang.String r3 = "su"
            r5.append(r3)
            java.lang.String r3 = r5.toString()
            r4.<init>(r3)
            boolean r3 = r4.exists()
            if (r3 == 0) goto L42
            r0 = 1
            return r0
        L42:
            int r2 = r2 + 1
            goto L1e
        L45:
            return r1
    }
}

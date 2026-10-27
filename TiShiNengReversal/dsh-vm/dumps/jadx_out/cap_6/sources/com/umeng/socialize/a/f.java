package com.umeng.socialize.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class f {
    final java.lang.String a;
    final java.lang.String b;
    final java.lang.String c;
    final long d;
    final long e;
    final int f;

    public f(java.lang.Object r3, java.lang.Object r4) {
            r2 = this;
            r2.<init>()
            android.content.pm.PackageManager r3 = (android.content.pm.PackageManager) r3
            android.content.pm.PackageInfo r4 = (android.content.pm.PackageInfo) r4
            java.lang.String r0 = r4.packageName
            r2.a = r0
            java.lang.String r0 = r4.versionName
            r2.c = r0
            long r0 = r4.firstInstallTime
            r2.d = r0
            long r0 = r4.lastUpdateTime
            r2.e = r0
            int r0 = r2.a(r4)
            r2.f = r0
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch: java.lang.Throwable -> L28
            java.lang.CharSequence r3 = r3.getApplicationLabel(r4)     // Catch: java.lang.Throwable -> L28
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L28
            goto L2a
        L28:
            java.lang.String r3 = ""
        L2a:
            r2.b = r3
            return
    }

    private int a(android.content.pm.PackageInfo r3) {
            r2 = this;
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo
            if (r3 != 0) goto L6
            r3 = -1
            return r3
        L6:
            int r3 = r3.flags
            r0 = r3 & 1
            r1 = 0
            if (r0 == 0) goto Le
            return r1
        Le:
            r3 = r3 & 128(0x80, float:1.8E-43)
            if (r3 == 0) goto L13
            return r1
        L13:
            r3 = 1
            return r3
    }
}

package com.huawei.hms.hatool;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class h {
    public h() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean a(android.content.Context r4) {
            java.lang.String r0 = "flashKeyTime"
            r1 = -1
            java.lang.String r3 = "Privacy_MY"
            long r0 = com.huawei.hms.hatool.l.a(r4, r3, r0, r1)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r0
            r0 = 43200000(0x2932e00, double:2.1343636E-316)
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 <= 0) goto L18
            r4 = 1
            return r4
        L18:
            r4 = 0
            return r4
    }

    public static boolean b(android.content.Context r5, java.lang.String r6) {
            r0 = 1
            if (r5 != 0) goto L4
            return r0
        L4:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            java.lang.String r3 = "not have read phone permission!"
            java.lang.String r4 = "hmsSdk"
            if (r1 >= r2) goto L20
            android.content.pm.PackageManager r1 = r5.getPackageManager()
            java.lang.String r5 = r5.getPackageName()
            int r5 = r1.checkPermission(r6, r5)
            if (r5 == 0) goto L2a
            com.huawei.hms.hatool.j1.m(r4, r3)
            return r0
        L20:
            int r5 = androidx.core.app.q.a(r5, r6)
            if (r5 == 0) goto L2a
            com.huawei.hms.hatool.j1.m(r4, r3)
            return r0
        L2a:
            r5 = 0
            return r5
    }

    @android.annotation.SuppressLint({"DefaultLocale"})
    public static boolean c(android.content.Context r4, java.lang.String r5, int r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = com.huawei.hms.hatool.l.h(r4, r5)
            r0.append(r5)
            java.lang.String r5 = ".xml"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.io.File r0 = new java.io.File
            java.io.File r1 = r4.getFilesDir()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "../shared_prefs/"
            r2.append(r3)
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.<init>(r1, r2)
            boolean r1 = r0.exists()
            if (r1 != 0) goto L67
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r4.getPackageName()
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.io.File r0 = new java.io.File
            java.io.File r4 = r4.getFilesDir()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "../../shared_prefs/"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r4, r5)
        L67:
            long r4 = r0.length()
            long r0 = (long) r6
            r2 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 <= 0) goto L8d
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r6)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r4
            r4 = 1
            r6[r4] = r5
            java.lang.String r5 = "reach local file limited size - file len: %d limitedSize: %d"
            java.lang.String r5 = java.lang.String.format(r5, r6)
            java.lang.String r6 = "hmsSdk"
            com.huawei.hms.hatool.j1.h(r6, r5)
            return r4
        L8d:
            return r2
    }

    public static boolean d(java.lang.String r4, long r5, long r7) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 1
            if (r0 == 0) goto L8
            return r1
        L8:
            long r2 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L14
            long r5 = r5 - r2
            int r4 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r4 <= 0) goto L12
            return r1
        L12:
            r4 = 0
            return r4
        L14:
            java.lang.String r4 = "hmsSdk"
            java.lang.String r5 = "isTimeExpired(): Data type conversion error : number format !"
            com.huawei.hms.hatool.j1.m(r4, r5)
            return r1
    }
}

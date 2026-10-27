package com.umeng.socialize.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class c {
    public static java.lang.String a;
    public static java.lang.String b;
    public static java.lang.String c;

    static {
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object a(java.lang.Object r1, java.lang.String r2, int r3) {
            android.content.pm.PackageManager r1 = (android.content.pm.PackageManager) r1     // Catch: java.lang.Throwable -> L7
            android.content.pm.PackageInfo r1 = r1.getPackageInfo(r2, r3)     // Catch: java.lang.Throwable -> L7
            return r1
        L7:
            r1 = move-exception
            boolean r3 = com.umeng.socialize.a.a.c
            if (r3 == 0) goto L2e
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "pkg:"
            r3.append(r0)
            r3.append(r2)
            java.lang.String r2 = " failed:"
            r3.append(r2)
            java.lang.String r1 = r1.getMessage()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "MISC"
            com.umeng.commonsdk.debug.UMRTLog.e(r2, r1)
        L2e:
            r1 = 0
            return r1
    }

    public static java.lang.String a() {
            java.lang.String r0 = com.umeng.socialize.a.c.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = android.os.Build.BRAND
            com.umeng.socialize.a.c.a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = android.os.Build.MANUFACTURER
            com.umeng.socialize.a.c.a = r0
        L16:
            java.lang.String r0 = com.umeng.socialize.a.c.a
            return r0
    }

    public static void a(java.io.Closeable r0) {
            if (r0 == 0) goto L5
            r0.close()     // Catch: java.lang.Throwable -> L5
        L5:
            return
    }

    public static boolean a(android.content.Context r0) {
            boolean r0 = com.umeng.commonsdk.utils.UMUtils.isMainProgress(r0)
            return r0
    }

    public static java.lang.String b() {
            java.lang.String r0 = com.umeng.socialize.a.c.b
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = android.os.Build.MODEL
            com.umeng.socialize.a.c.b = r0
        Lc:
            java.lang.String r0 = com.umeng.socialize.a.c.b
            return r0
    }

    public static boolean b(android.content.Context r1) {
            java.lang.String r0 = "android.permission.QUERY_ALL_PACKAGES"
            boolean r1 = com.umeng.commonsdk.utils.UMUtils.checkPermission(r1, r0)
            return r1
    }

    public static java.lang.String c() {
            java.lang.String r0 = com.umeng.socialize.a.c.c
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lc
            java.lang.String r0 = android.os.Build.BOARD
            com.umeng.socialize.a.c.c = r0
        Lc:
            java.lang.String r0 = com.umeng.socialize.a.c.c
            return r0
    }
}

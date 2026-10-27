package com.huawei.hms.feature.dynamic.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class c {
    public static final java.lang.String a = "HMSPkgManager";
    public static final java.util.List<java.lang.String> b = null;
    public static final int c = 8;
    public static final int d = 4;
    public static final int e = 5;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a extends java.util.ArrayList<java.lang.String> {
        public a() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.huawei.hwid"
                r1.add(r0)
                java.lang.String r0 = "com.huawei.hwid.tv"
                r1.add(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements java.security.PrivilegedAction {
        public final /* synthetic */ java.lang.reflect.Field a;

        public b(java.lang.reflect.Field r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.security.PrivilegedAction
        public java.lang.Object run() {
                r2 = this;
                java.lang.reflect.Field r0 = r2.a
                r1 = 1
                r0.setAccessible(r1)
                r0 = 0
                return r0
        }
    }

    static {
            com.huawei.hms.feature.dynamic.f.c$a r0 = new com.huawei.hms.feature.dynamic.f.c$a
            r0.<init>()
            com.huawei.hms.feature.dynamic.f.c.b = r0
            return
    }

    public c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a(android.content.Context r6) {
            r0 = 0
            java.lang.String r1 = "HMSPkgManager"
            if (r6 != 0) goto Lb
            java.lang.String r6 = "The given context is null."
            com.huawei.hms.common.util.Logger.e(r1, r6)
            return r0
        Lb:
            java.util.List<java.lang.String> r2 = com.huawei.hms.feature.dynamic.f.c.b
            java.util.Iterator r2 = r2.iterator()
        L11:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L57
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            android.content.pm.PackageManager r4 = r6.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            android.content.pm.PackageInfo r4 = r4.getPackageInfo(r3, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            if (r4 == 0) goto L11
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            r4.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.String r5 = "The HMS Core is installed, pkgName:"
            r4.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            r4.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            java.lang.String r4 = r4.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            com.huawei.hms.common.util.Logger.i(r1, r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L3d
            r6 = 1
            return r6
        L3d:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Query for HMS Core package name:"
            r4.append(r5)
            r4.append(r3)
            java.lang.String r3 = " failed."
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            com.huawei.hms.common.util.Logger.w(r1, r3)
            goto L11
        L57:
            return r0
    }

    public static boolean a(android.content.Context r5, java.lang.String r6) {
            r0 = 0
            java.lang.String r1 = "HMSPkgManager"
            if (r5 == 0) goto L77
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto Lc
            goto L77
        Lc:
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L71
            r2.<init>(r6)     // Catch: java.io.IOException -> L71
            boolean r2 = r2.exists()     // Catch: java.io.IOException -> L71
            if (r2 != 0) goto L1d
            java.lang.String r5 = "the file does not exist."
            com.huawei.hms.common.util.Logger.w(r1, r5)     // Catch: java.io.IOException -> L71
            return r0
        L1d:
            java.io.File r2 = new java.io.File     // Catch: java.io.IOException -> L71
            r2.<init>(r6)     // Catch: java.io.IOException -> L71
            java.lang.String r6 = r2.getCanonicalPath()     // Catch: java.io.IOException -> L71
            java.lang.String r2 = "/system/app/HFF"
            boolean r2 = r6.startsWith(r2)     // Catch: java.io.IOException -> L71
            if (r2 == 0) goto L35
            java.lang.String r5 = "HFF file path, need not to verify."
            com.huawei.hms.common.util.Logger.i(r1, r5)     // Catch: java.io.IOException -> L71
            r5 = 1
            return r5
        L35:
            java.lang.String r2 = "/data/data/"
            boolean r2 = r6.startsWith(r2)     // Catch: java.io.IOException -> L71
            r3 = 4
            java.lang.String r4 = "/"
            if (r2 == 0) goto L4f
            java.lang.String[] r6 = r6.split(r4)     // Catch: java.io.IOException -> L71
            int r2 = r6.length     // Catch: java.io.IOException -> L71
            if (r2 < r3) goto L76
            r2 = 3
            r6 = r6[r2]     // Catch: java.io.IOException -> L71
        L4a:
            boolean r5 = b(r5, r6)     // Catch: java.io.IOException -> L71
            return r5
        L4f:
            java.lang.String r2 = "/data/user_de/"
            boolean r2 = r6.startsWith(r2)     // Catch: java.io.IOException -> L71
            if (r2 != 0) goto L66
            java.lang.String r2 = "/data/user/"
            boolean r2 = r6.startsWith(r2)     // Catch: java.io.IOException -> L71
            if (r2 == 0) goto L60
            goto L66
        L60:
            java.lang.String r5 = "illegal path."
            com.huawei.hms.common.util.Logger.w(r1, r5)     // Catch: java.io.IOException -> L71
            goto L76
        L66:
            java.lang.String[] r6 = r6.split(r4)     // Catch: java.io.IOException -> L71
            int r2 = r6.length     // Catch: java.io.IOException -> L71
            r4 = 5
            if (r2 < r4) goto L76
            r6 = r6[r3]     // Catch: java.io.IOException -> L71
            goto L4a
        L71:
            java.lang.String r5 = "checkPathValidity IOException"
            com.huawei.hms.common.util.Logger.e(r1, r5)
        L76:
            return r0
        L77:
            java.lang.String r5 = "context is null or filePath is null."
            com.huawei.hms.common.util.Logger.e(r1, r5)
            return r0
    }

    public static boolean b(android.content.Context r5, java.lang.String r6) {
            java.lang.String r0 = ":"
            r1 = 0
            java.lang.String r2 = "HMSPkgManager"
            if (r5 == 0) goto Le0
            boolean r3 = android.text.TextUtils.isEmpty(r6)
            if (r3 == 0) goto Lf
            goto Le0
        Lf:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            r3 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L1a
            goto L3a
        L1a:
            r5 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get PrivAppFlag err for "
            r3.append(r4)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r5 = r5.getMessage()
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            com.huawei.hms.common.util.Logger.e(r2, r5)
            r5 = 0
        L3a:
            if (r5 == 0) goto Lcb
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo
            if (r5 != 0) goto L42
            goto Lcb
        L42:
            java.lang.Class r3 = r5.getClass()
            java.lang.String r4 = "privateFlags"
            java.lang.reflect.Field r3 = r3.getField(r4)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            com.huawei.hms.feature.dynamic.f.c$b r4 = new com.huawei.hms.feature.dynamic.f.c$b     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            r4.<init>(r3)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            java.security.AccessController.doPrivileged(r4)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            java.lang.Object r5 = r3.get(r5)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            boolean r3 = r5 instanceof java.lang.Integer     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            if (r3 != 0) goto L66
            java.lang.String r5 = "Get privFlag instance error."
            com.huawei.hms.common.util.Logger.i(r2, r5)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            return r1
        L62:
            r5 = move-exception
            goto Lac
        L64:
            r5 = move-exception
            goto Lac
        L66:
            java.lang.Integer r5 = (java.lang.Integer) r5     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            int r5 = r5.intValue()     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            r3.<init>()     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            java.lang.String r4 = "privFlag of "
            r3.append(r4)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            r3.append(r6)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            java.lang.String r4 = " is:"
            r3.append(r4)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            r3.append(r5)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            com.huawei.hms.common.util.Logger.d(r2, r3)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            r5 = r5 & 8
            if (r5 == 0) goto L8e
            r5 = 1
            goto L8f
        L8e:
            r5 = 0
        L8f:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            r3.<init>()     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            java.lang.String r4 = "pkgName:"
            r3.append(r4)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            r3.append(r6)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            java.lang.String r4 = ", isPrivApp:"
            r3.append(r4)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            r3.append(r5)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            com.huawei.hms.common.util.Logger.i(r2, r3)     // Catch: java.lang.IllegalAccessException -> L62 java.lang.NoSuchFieldException -> L64
            return r5
        Lac:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "get Priv App Flag err for "
            r3.append(r4)
            r3.append(r6)
            r3.append(r0)
            java.lang.String r5 = r5.getMessage()
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            com.huawei.hms.common.util.Logger.e(r2, r5)
            return r1
        Lcb:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "Get pkg application null:"
            r5.append(r0)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            com.huawei.hms.common.util.Logger.i(r2, r5)
            return r1
        Le0:
            java.lang.String r5 = "context is null or pkgName is null."
            com.huawei.hms.common.util.Logger.e(r2, r5)
            return r1
    }

    public static boolean c(android.content.Context r5, java.lang.String r6) {
            r0 = 0
            java.lang.String r1 = "HMSPkgManager"
            if (r5 == 0) goto L76
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto Lc
            goto L76
        Lc:
            android.content.pm.PackageManager r5 = r5.getPackageManager()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            r2 = 16384(0x4000, float:2.2959E-41)
            android.content.pm.PackageInfo r5 = r5.getPackageInfo(r6, r2)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            r2 = 1
            if (r5 == 0) goto L24
            android.content.pm.ApplicationInfo r5 = r5.applicationInfo     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            int r5 = r5.flags     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            r5 = r5 & r2
            if (r5 == 0) goto L24
            r5 = 1
            goto L25
        L22:
            r5 = move-exception
            goto L55
        L24:
            r5 = 0
        L25:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            r3.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            java.lang.String r4 = "isHMSSystemApp:"
            r3.append(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            r3.append(r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            java.lang.String r3 = r3.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            com.huawei.hms.common.util.Logger.i(r1, r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            if (r5 == 0) goto L75
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            r5.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            java.lang.String r3 = "The HMS package:"
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            r5.append(r6)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            java.lang.String r3 = " is SystemApp"
            r5.append(r3)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            java.lang.String r5 = r5.toString()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            com.huawei.hms.common.util.Logger.i(r1, r5)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L22
            return r2
        L55:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getSystemApp flag error for "
            r2.append(r3)
            r2.append(r6)
            java.lang.String r6 = ":"
            r2.append(r6)
            java.lang.String r5 = r5.getMessage()
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.huawei.hms.common.util.Logger.e(r1, r5)
        L75:
            return r0
        L76:
            java.lang.String r5 = "context is null or pkgName is null."
            com.huawei.hms.common.util.Logger.w(r1, r5)
            return r0
    }
}

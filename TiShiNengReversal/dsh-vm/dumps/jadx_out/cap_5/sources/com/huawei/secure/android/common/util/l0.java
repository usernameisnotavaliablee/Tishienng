package com.huawei.secure.android.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class l0 {
    private static final java.lang.String a = "FileUtil";

    public l0() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RequiresApi(api = 26)
    public static boolean a(java.io.File r2) throws java.io.IOException {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.lang.String r2 = r2.getCanonicalPath()     // Catch: java.io.IOException -> L17
            java.lang.String[] r1 = new java.lang.String[r0]     // Catch: java.io.IOException -> L17
            java.nio.file.Path r2 = com.huawei.secure.android.common.util.g0.a(r2, r1)     // Catch: java.io.IOException -> L17
            if (r2 != 0) goto L11
            return r0
        L11:
            r0 = 0
            boolean r2 = f(r2, r0)
            return r2
        L17:
            return r0
    }

    public static boolean b(java.lang.String r3) throws java.io.UnsupportedEncodingException {
            r0 = 1
            if (r3 == 0) goto L46
            java.lang.String r1 = ""
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto Lc
            goto L46
        Lc:
            java.lang.String r1 = "%"
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L1c
            java.lang.String r1 = "%(?![0-9a-fA-F]{2})"
            java.lang.String r2 = "%25"
            java.lang.String r3 = r3.replaceAll(r1, r2)
        L1c:
            java.lang.String r1 = "utf-8"
            java.lang.String r3 = java.net.URLDecoder.decode(r3, r1)
            java.lang.String r1 = ".."
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "./"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = ".\\.\\"
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L44
            java.lang.String r1 = "%00"
            boolean r3 = r3.contains(r1)
            if (r3 == 0) goto L43
            goto L44
        L43:
            return r0
        L44:
            r3 = 0
            return r3
        L46:
            return r0
    }

    public static boolean c(java.lang.String r6, java.lang.String r7) throws java.io.IOException {
            r0 = 0
            if (r6 == 0) goto L6f
            java.lang.String r1 = ""
            boolean r2 = r6.equals(r1)
            if (r2 != 0) goto L6f
            if (r7 == 0) goto L6f
            boolean r1 = r7.equals(r1)
            if (r1 == 0) goto L14
            goto L6f
        L14:
            java.lang.String r1 = "utf-8"
            java.lang.String r7 = java.net.URLDecoder.decode(r7, r1)
            java.lang.String r6 = java.net.URLDecoder.decode(r6, r1)
            java.lang.String r1 = ".."
            boolean r2 = r6.contains(r1)
            if (r2 != 0) goto L6f
            java.lang.String r2 = "./"
            boolean r3 = r6.contains(r2)
            if (r3 != 0) goto L6f
            java.lang.String r3 = ".\\.\\"
            boolean r4 = r6.contains(r3)
            if (r4 != 0) goto L6f
            java.lang.String r4 = "%00"
            boolean r5 = r6.contains(r4)
            if (r5 == 0) goto L3f
            goto L6f
        L3f:
            boolean r1 = r7.contains(r1)
            if (r1 != 0) goto L6f
            boolean r1 = r7.contains(r2)
            if (r1 != 0) goto L6f
            boolean r1 = r7.contains(r3)
            if (r1 != 0) goto L6f
            boolean r1 = r7.contains(r4)
            if (r1 == 0) goto L58
            goto L6f
        L58:
            java.io.File r0 = new java.io.File
            r0.<init>(r6, r7)
            java.lang.String r7 = r0.getCanonicalPath()
            java.io.File r0 = new java.io.File
            r0.<init>(r6)
            java.lang.String r6 = r0.getCanonicalPath()
            boolean r6 = r7.startsWith(r6)
            return r6
        L6f:
            return r0
    }

    public static boolean d(java.lang.String r3, java.lang.String[] r4) {
            r0 = 0
            if (r3 == 0) goto L21
            boolean r1 = r3.isEmpty()
            if (r1 != 0) goto L21
            if (r4 != 0) goto Lc
            goto L21
        Lc:
            java.lang.String r3 = h(r3)
            r1 = 0
        L11:
            int r2 = r4.length
            if (r1 >= r2) goto L21
            r2 = r4[r1]
            boolean r2 = r3.equalsIgnoreCase(r2)
            if (r2 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
            int r1 = r1 + 1
            goto L11
        L21:
            return r0
    }

    @androidx.annotation.RequiresApi(api = 26)
    public static boolean e(java.nio.file.Path r1) throws java.io.IOException {
            r0 = 0
            boolean r1 = f(r1, r0)
            return r1
    }

    @androidx.annotation.RequiresApi(api = 26)
    public static boolean f(java.nio.file.Path r1, java.nio.file.attribute.UserPrincipal r2) throws java.io.IOException {
            r0 = 5
            boolean r1 = g(r1, r2, r0)
            return r1
    }

    @androidx.annotation.RequiresApi(api = 26)
    public static boolean g(java.nio.file.Path r7, java.nio.file.attribute.UserPrincipal r8, int r9) throws java.io.IOException {
            boolean r0 = com.huawei.secure.android.common.util.p.a(r7)
            if (r0 != 0) goto La
            java.nio.file.Path r7 = com.huawei.secure.android.common.util.j0.a(r7)
        La:
            r0 = 0
            if (r9 > 0) goto Le
            return r0
        Le:
            r1 = 0
            java.nio.file.Path r2 = com.huawei.secure.android.common.util.d0.a(r7)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lba
            java.lang.String r2 = com.huawei.secure.android.common.util.e0.a(r2)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lba
            java.lang.String[] r3 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lba
            java.nio.file.Path r2 = com.huawei.secure.android.common.util.g0.a(r2, r3)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lba
            java.nio.file.FileSystem r1 = com.huawei.secure.android.common.util.w.a(r2)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lba
            java.nio.file.attribute.UserPrincipalLookupService r2 = com.huawei.secure.android.common.util.x.a(r1)     // Catch: java.lang.Throwable -> Lb8 java.lang.Exception -> Lba
            if (r1 == 0) goto L2a
            com.huawei.secure.android.common.util.v.a(r1)
        L2a:
            java.lang.String r1 = "root"
            java.nio.file.attribute.UserPrincipal r1 = com.huawei.secure.android.common.util.y.a(r2, r1)     // Catch: java.io.IOException -> Lb7
            if (r8 != 0) goto L3c
            java.lang.String r8 = "user.name"
            java.lang.String r8 = java.lang.System.getProperty(r8)     // Catch: java.io.IOException -> Lb7
            java.nio.file.attribute.UserPrincipal r8 = com.huawei.secure.android.common.util.y.a(r2, r8)     // Catch: java.io.IOException -> Lb7
        L3c:
            if (r1 == 0) goto Lb7
            if (r8 != 0) goto L42
            goto Lb7
        L42:
            r2 = 1
            r3 = 1
        L44:
            int r4 = com.huawei.secure.android.common.util.a0.a(r7)
            if (r3 > r4) goto Lb6
            java.nio.file.Path r4 = com.huawei.secure.android.common.util.d0.a(r7)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = com.huawei.secure.android.common.util.e0.a(r4)     // Catch: java.lang.Throwable -> Lb5
            java.nio.file.Path r5 = com.huawei.secure.android.common.util.f0.a(r7, r0, r3)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r5 = com.huawei.secure.android.common.util.e0.a(r5)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String[] r5 = new java.lang.String[]{r5}     // Catch: java.lang.Throwable -> Lb5
            java.nio.file.Path r4 = com.huawei.secure.android.common.util.g0.a(r4, r5)     // Catch: java.lang.Throwable -> Lb5
            boolean r5 = cn.jiguang.av.d0.a(r4)
            if (r5 == 0) goto L78
            com.huawei.secure.android.common.util.e0.a(r4)
            java.nio.file.Path r4 = com.huawei.secure.android.common.util.h0.a(r4)
            int r5 = r9 + (-1)
            boolean r4 = g(r4, r8, r5)
            if (r4 != 0) goto Lb2
            return r0
        L78:
            java.nio.file.LinkOption[] r5 = new java.nio.file.LinkOption[r0]
            java.nio.file.attribute.UserPrincipal r5 = com.huawei.secure.android.common.util.i0.a(r4, r5)
            boolean r6 = r8.equals(r5)
            if (r6 != 0) goto L8b
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L8b
            return r0
        L8b:
            java.lang.Class r5 = com.huawei.secure.android.common.util.k0.a()
            java.nio.file.LinkOption[] r6 = new java.nio.file.LinkOption[r0]
            java.nio.file.attribute.BasicFileAttributes r4 = com.huawei.secure.android.common.util.q.a(r4, r5, r6)
            java.nio.file.attribute.PosixFileAttributes r4 = com.huawei.secure.android.common.util.r.a(r4)
            java.util.Set r4 = com.huawei.secure.android.common.util.s.a(r4)
            java.nio.file.attribute.PosixFilePermission r5 = com.huawei.secure.android.common.util.t.a()
            boolean r5 = r4.contains(r5)
            if (r5 != 0) goto Lb5
            java.nio.file.attribute.PosixFilePermission r5 = com.huawei.secure.android.common.util.u.a()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto Lb2
            goto Lb5
        Lb2:
            int r3 = r3 + 1
            goto L44
        Lb5:
            return r0
        Lb6:
            return r2
        Lb7:
            return r0
        Lb8:
            r7 = move-exception
            goto Lbc
        Lba:
            goto Lc2
        Lbc:
            if (r1 == 0) goto Lc1
            com.huawei.secure.android.common.util.v.a(r1)
        Lc1:
            throw r7
        Lc2:
            if (r1 == 0) goto Lc7
            com.huawei.secure.android.common.util.v.a(r1)
        Lc7:
            return r0
    }

    private static java.lang.String h(java.lang.String r2) {
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L22
            java.lang.String r0 = "."
            int r0 = r2.lastIndexOf(r0)
            r1 = -1
            if (r0 == r1) goto L22
            int r0 = r0 + 1
            int r1 = r2.length()
            if (r0 == r1) goto L22
            java.lang.String r2 = r2.substring(r0)
            java.util.Locale r0 = java.util.Locale.ENGLISH
            java.lang.String r2 = r2.toLowerCase(r0)
            return r2
        L22:
            java.lang.String r2 = ""
            return r2
    }

    @androidx.annotation.RequiresApi(api = 26)
    public static boolean i(java.nio.file.Path r5) {
            r0 = 0
            java.lang.Class r1 = com.huawei.secure.android.common.util.z.a()     // Catch: java.io.IOException -> L1d
            r2 = 1
            java.nio.file.LinkOption[] r3 = new java.nio.file.LinkOption[r2]     // Catch: java.io.IOException -> L1d
            java.nio.file.LinkOption r4 = com.huawei.secure.android.common.util.b0.a()     // Catch: java.io.IOException -> L1d
            r3[r0] = r4     // Catch: java.io.IOException -> L1d
            java.nio.file.attribute.BasicFileAttributes r5 = com.huawei.secure.android.common.util.q.a(r5, r1, r3)     // Catch: java.io.IOException -> L1d
            if (r5 != 0) goto L15
            return r0
        L15:
            boolean r5 = com.huawei.secure.android.common.util.c0.a(r5)
            if (r5 != 0) goto L1c
            return r0
        L1c:
            return r2
        L1d:
            return r0
    }
}

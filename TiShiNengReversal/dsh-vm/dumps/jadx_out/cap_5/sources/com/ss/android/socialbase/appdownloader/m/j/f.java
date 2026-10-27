package com.ss.android.socialbase.appdownloader.m.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f {
    public f() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.content.pm.PackageInfo a(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.io.File r3, int r4) {
            r0 = 268435456(0x10000000, float:2.524355E-29)
            boolean r0 = com.ss.android.socialbase.downloader.az.j.j(r0)
            if (r0 == 0) goto L1d
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 >= r1) goto L1d
            android.content.pm.PackageInfo r2 = b(r3)     // Catch: java.lang.Throwable -> L13
            return r2
        L13:
            r0 = move-exception
            java.lang.String r1 = "getPackageInfo::unzip_getpackagearchiveinfo"
            java.lang.String r0 = r0.getMessage()
            f(r1, r0)
        L1d:
            android.content.pm.PackageInfo r2 = g(r2, r3, r4)
            return r2
    }

    public static android.content.pm.PackageInfo b(@androidx.annotation.NonNull java.io.File r13) {
            r0 = 0
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L43
            r2 = 24
            java.lang.String r3 = "AndroidManifest.xml"
            if (r1 < r2) goto L49
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L43
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L43
            java.util.zip.ZipInputStream r13 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L37
            r13.<init>(r1)     // Catch: java.lang.Throwable -> L37
        L13:
            java.util.zip.ZipEntry r2 = r13.getNextEntry()     // Catch: java.lang.Throwable -> L37
            if (r2 == 0) goto L3d
            boolean r4 = r2.isDirectory()     // Catch: java.lang.Throwable -> L37
            if (r4 == 0) goto L23
            r13.closeEntry()     // Catch: java.lang.Throwable -> L13
            goto L13
        L23:
            java.lang.String r4 = r2.getName()     // Catch: java.lang.Throwable -> L37
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L37
            if (r4 != 0) goto L31
            r13.closeEntry()     // Catch: java.lang.Throwable -> L13
            goto L13
        L31:
            r4 = r0
            r5 = r2
            r2 = r1
            r1 = r13
            goto L83
        L37:
            r13 = move-exception
            r4 = r0
            r2 = r1
            r1 = r4
            goto L142
        L3d:
            r4 = r0
            r5 = r2
            r2 = r1
            r1 = r13
            r13 = r4
            goto L83
        L43:
            r13 = move-exception
            r1 = r0
            r2 = r1
            r4 = r2
            goto L142
        L49:
            java.util.zip.ZipFile r1 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L43
            r1.<init>(r13)     // Catch: java.lang.Throwable -> L43
            java.util.Enumeration r13 = r1.entries()     // Catch: java.lang.Throwable -> L78
            r2 = r0
        L53:
            boolean r4 = r13.hasMoreElements()     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L7e
            java.lang.Object r2 = r13.nextElement()     // Catch: java.lang.Throwable -> L78
            java.util.zip.ZipEntry r2 = (java.util.zip.ZipEntry) r2     // Catch: java.lang.Throwable -> L78
            boolean r4 = r2.isDirectory()     // Catch: java.lang.Throwable -> L78
            if (r4 != 0) goto L53
            java.lang.String r4 = r2.getName()     // Catch: java.lang.Throwable -> L78
            boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> L78
            if (r4 == 0) goto L53
            java.io.InputStream r13 = r1.getInputStream(r2)     // Catch: java.lang.Throwable -> L78
            r4 = r1
            r5 = r2
            r1 = r0
        L76:
            r2 = r1
            goto L83
        L78:
            r13 = move-exception
            r2 = r0
            r4 = r1
            r1 = r2
            goto L142
        L7e:
            r13 = r0
            r4 = r1
            r5 = r2
            r1 = r13
            goto L76
        L83:
            if (r5 == 0) goto L13a
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L135
            boolean r3 = r3.equals(r5)     // Catch: java.lang.Throwable -> L135
            if (r3 == 0) goto L13a
            com.ss.android.socialbase.appdownloader.m.j.c r3 = new com.ss.android.socialbase.appdownloader.m.j.c     // Catch: java.lang.Throwable -> L135
            r3.<init>()     // Catch: java.lang.Throwable -> L135
            r3.e(r13)     // Catch: java.lang.Throwable -> Lbc
        L97:
            int r5 = r3.j()     // Catch: java.lang.Throwable -> Lbc
            r6 = 1
            if (r5 == r6) goto L12d
            r6 = 2
            if (r5 != r6) goto L97
            int r5 = r3.h()     // Catch: java.lang.Throwable -> Lbc
            r6 = 0
            r6 = r0
            r7 = r6
            r8 = 0
        La9:
            if (r8 == r5) goto Le6
            java.lang.String r9 = "versionName"
            java.lang.String r10 = r3.c(r8)     // Catch: java.lang.Throwable -> Lbc
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> Lbc
            if (r9 == 0) goto Lc2
            java.lang.String r6 = e(r3, r8)     // Catch: java.lang.Throwable -> Lbc
            goto Le3
        Lbc:
            r0 = move-exception
            r1 = r13
            r13 = r0
            r0 = r3
            goto L142
        Lc2:
            java.lang.String r9 = "versionCode"
            java.lang.String r10 = r3.c(r8)     // Catch: java.lang.Throwable -> Lbc
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> Lbc
            if (r9 == 0) goto Ld3
            java.lang.String r0 = e(r3, r8)     // Catch: java.lang.Throwable -> Lbc
            goto Le3
        Ld3:
            java.lang.String r9 = "package"
            java.lang.String r10 = r3.c(r8)     // Catch: java.lang.Throwable -> Lbc
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> Lbc
            if (r9 == 0) goto Le3
            java.lang.String r7 = e(r3, r8)     // Catch: java.lang.Throwable -> Lbc
        Le3:
            int r8 = r8 + 1
            goto La9
        Le6:
            r8 = -1
            long r10 = java.lang.Long.parseLong(r0)     // Catch: java.lang.Throwable -> Lbc com.ss.android.socialbase.appdownloader.m.j.cw -> Led
            goto Lef
        Led:
            r10 = r8
        Lef:
            int r5 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r5 == 0) goto L11d
            android.content.pm.PackageInfo r0 = new android.content.pm.PackageInfo     // Catch: java.lang.Throwable -> Lbc
            r0.<init>()     // Catch: java.lang.Throwable -> Lbc
            r0.versionName = r6     // Catch: java.lang.Throwable -> Lbc
            int r5 = (int) r10     // Catch: java.lang.Throwable -> Lbc
            r0.versionCode = r5     // Catch: java.lang.Throwable -> Lbc
            r0.packageName = r7     // Catch: java.lang.Throwable -> Lbc
            if (r1 == 0) goto L104
            r1.closeEntry()     // Catch: java.lang.Throwable -> L104
        L104:
            r3.d()     // Catch: java.lang.Throwable -> L108
            goto L109
        L108:
        L109:
            if (r13 == 0) goto L110
            r13.close()     // Catch: java.lang.Throwable -> L10f
            goto L110
        L10f:
        L110:
            if (r4 == 0) goto L117
            r4.close()     // Catch: java.lang.Throwable -> L116
            goto L117
        L116:
        L117:
            if (r2 == 0) goto L11c
            r2.close()     // Catch: java.lang.Throwable -> L11c
        L11c:
            return r0
        L11d:
            com.ss.android.socialbase.appdownloader.m.j.cw r1 = new com.ss.android.socialbase.appdownloader.m.j.cw     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r5 = "versionCode获取失败: "
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r0 = r5.concat(r0)     // Catch: java.lang.Throwable -> Lbc
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lbc
            throw r1     // Catch: java.lang.Throwable -> Lbc
        L12d:
            com.ss.android.socialbase.appdownloader.m.j.cw r0 = new com.ss.android.socialbase.appdownloader.m.j.cw     // Catch: java.lang.Throwable -> Lbc
            java.lang.String r1 = "已达到END_DOCUMENT"
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Lbc
            throw r0     // Catch: java.lang.Throwable -> Lbc
        L135:
            r1 = move-exception
            r12 = r1
            r1 = r13
            r13 = r12
            goto L142
        L13a:
            com.ss.android.socialbase.appdownloader.m.j.cw r1 = new com.ss.android.socialbase.appdownloader.m.j.cw     // Catch: java.lang.Throwable -> L135
            java.lang.String r3 = "没有找到AndroidManifest.xml entry"
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L135
            throw r1     // Catch: java.lang.Throwable -> L135
        L142:
            com.ss.android.socialbase.appdownloader.m.j.cw r3 = new com.ss.android.socialbase.appdownloader.m.j.cw     // Catch: java.lang.Throwable -> L161
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L161
            java.lang.String r6 = "throwable: "
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L161
            java.lang.String r6 = r13.getMessage()     // Catch: java.lang.Throwable -> L161
            r5.append(r6)     // Catch: java.lang.Throwable -> L161
            java.lang.String r13 = r13.toString()     // Catch: java.lang.Throwable -> L161
            r5.append(r13)     // Catch: java.lang.Throwable -> L161
            java.lang.String r13 = r5.toString()     // Catch: java.lang.Throwable -> L161
            r3.<init>(r13)     // Catch: java.lang.Throwable -> L161
            throw r3     // Catch: java.lang.Throwable -> L161
        L161:
            r13 = move-exception
            if (r0 == 0) goto L169
            r0.d()     // Catch: java.lang.Throwable -> L168
            goto L169
        L168:
        L169:
            if (r1 == 0) goto L170
            r1.close()     // Catch: java.lang.Throwable -> L16f
            goto L170
        L16f:
        L170:
            if (r4 == 0) goto L177
            r4.close()     // Catch: java.lang.Throwable -> L176
            goto L177
        L176:
        L177:
            if (r2 == 0) goto L17c
            r2.close()     // Catch: java.lang.Throwable -> L17c
        L17c:
            throw r13
    }

    private static java.lang.String c(int r1) {
            int r1 = r1 >>> 24
            r0 = 1
            if (r1 != r0) goto L8
            java.lang.String r1 = "android:"
            return r1
        L8:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String d(android.content.Context r0, android.content.pm.PackageInfo r1, java.lang.String r2) {
            if (r1 == 0) goto L21
            android.content.pm.ApplicationInfo r1 = r1.applicationInfo
            if (r1 == 0) goto L21
            r1.sourceDir = r2
            r1.publicSourceDir = r2
            android.content.pm.PackageManager r0 = r0.getPackageManager()     // Catch: java.lang.OutOfMemoryError -> L17
            java.lang.CharSequence r0 = r1.loadLabel(r0)     // Catch: java.lang.OutOfMemoryError -> L17
            java.lang.String r0 = r0.toString()     // Catch: java.lang.OutOfMemoryError -> L17
            return r0
        L17:
            r0 = move-exception
            java.lang.String r1 = "getPackageInfo::fail_load_label"
            java.lang.String r0 = r0.getMessage()
            f(r1, r0)
        L21:
            r0 = 0
            return r0
    }

    private static java.lang.String e(com.ss.android.socialbase.appdownloader.m.j.c r4, int r5) {
            int r0 = r4.k(r5)
            int r1 = r4.b(r5)
            r2 = 3
            if (r0 != r2) goto L10
            java.lang.String r4 = r4.f(r5)
            return r4
        L10:
            r4 = 1
            r5 = 0
            r2 = 2
            if (r0 != r2) goto L2a
            java.lang.String r0 = c(r1)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r0
            r2[r4] = r1
            java.lang.String r4 = "?%s%08X"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            return r4
        L2a:
            r3 = 16
            if (r0 < r3) goto L37
            r3 = 31
            if (r0 > r3) goto L37
            java.lang.String r4 = java.lang.String.valueOf(r1)
            return r4
        L37:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r5] = r1
            r2[r4] = r0
            java.lang.String r4 = "<0x%X, type 0x%02X>"
            java.lang.String r4 = java.lang.String.format(r4, r2)
            return r4
    }

    private static void f(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.String r2) {
            com.ss.android.socialbase.downloader.tl.xt r1 = com.ss.android.socialbase.downloader.downloader.cw.m()
            if (r1 != 0) goto L7
            goto L11
        L7:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r0 = "message"
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L11
        L11:
            return
    }

    private static android.content.pm.PackageInfo g(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.NonNull java.io.File r3, int r4) {
            android.content.pm.PackageManager r2 = r2.getPackageManager()
            r0 = 0
            java.lang.String r1 = "unzip_getpackagearchiveinfo"
            if (r2 != 0) goto Lf
            java.lang.String r2 = "packageManager == null"
            f(r1, r2)
            return r0
        Lf:
            java.lang.String r3 = r3.getPath()     // Catch: java.lang.Throwable -> L18
            android.content.pm.PackageInfo r2 = r2.getPackageArchiveInfo(r3, r4)     // Catch: java.lang.Throwable -> L18
            return r2
        L18:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "pm.getPackageArchiveInfo failed: "
            r3.<init>(r4)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            f(r1, r2)
            return r0
    }
}

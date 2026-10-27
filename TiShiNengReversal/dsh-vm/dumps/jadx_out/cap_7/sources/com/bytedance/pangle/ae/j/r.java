package com.bytedance.pangle.ae.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class r {
    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.pangle.ae.j.up j(java.io.File r12) {
            java.lang.String r0 = "Zeus/install_pangle"
            r1 = 0
            r2 = 0
            boolean r3 = r12.exists()     // Catch: java.lang.Throwable -> L26
            if (r3 != 0) goto L2b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L26
            r3.<init>()     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = r12.getAbsolutePath()     // Catch: java.lang.Throwable -> L26
            r3.append(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = " not exists!"
            r3.append(r4)     // Catch: java.lang.Throwable -> L26
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L26
            com.bytedance.pangle.log.ZeusLogger.w(r0, r3)     // Catch: java.lang.Throwable -> L26
            com.bytedance.pangle.util.ae.j(r2)
            return r2
        L26:
            r3 = move-exception
            r4 = r2
            r5 = r4
            goto Lc6
        L2b:
            java.util.zip.ZipFile r3 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L26
            r3.<init>(r12)     // Catch: java.lang.Throwable -> L26
            java.lang.String r4 = "AndroidManifest.xml"
            java.util.zip.ZipEntry r4 = r3.getEntry(r4)     // Catch: java.lang.Throwable -> L41
            if (r4 != 0) goto L48
            java.lang.String r4 = "没有找到AndroidManifest.xml entry"
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r4)     // Catch: java.lang.Throwable -> L41
            com.bytedance.pangle.util.ae.j(r3)
            return r2
        L41:
            r4 = move-exception
            r5 = r4
            r4 = r3
            r3 = r5
            r5 = r2
            goto Lc6
        L48:
            com.bytedance.pangle.ae.j.j r5 = new com.bytedance.pangle.ae.j.j     // Catch: java.lang.Throwable -> L41
            r5.<init>()     // Catch: java.lang.Throwable -> L41
            java.io.InputStream r4 = r3.getInputStream(r4)     // Catch: java.lang.Throwable -> L67
            r5.j(r4)     // Catch: java.lang.Throwable -> L67
        L54:
            int r4 = r5.xt()     // Catch: java.lang.Throwable -> L67
            r6 = 1
            if (r4 != r6) goto L6c
            java.lang.String r4 = "已达到END_DOCUMENT"
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r4)     // Catch: java.lang.Throwable -> L67
            r5.j()     // Catch: java.lang.Throwable -> L63
        L63:
            com.bytedance.pangle.util.ae.j(r3)
            return r2
        L67:
            r4 = move-exception
            r11 = r4
            r4 = r3
            r3 = r11
            goto Lc6
        L6c:
            r6 = 2
            if (r4 != r6) goto L54
            int r4 = r5.cw()     // Catch: java.lang.Throwable -> L67
            r7 = r2
            r8 = r7
            r6 = 0
        L76:
            if (r6 == r4) goto L9c
            java.lang.String r9 = "versionCode"
            java.lang.String r10 = r5.j(r6)     // Catch: java.lang.Throwable -> L67
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L67
            if (r9 == 0) goto L89
            java.lang.String r7 = j(r5, r6)     // Catch: java.lang.Throwable -> L67
            goto L99
        L89:
            java.lang.String r9 = "package"
            java.lang.String r10 = r5.j(r6)     // Catch: java.lang.Throwable -> L67
            boolean r9 = r9.equals(r10)     // Catch: java.lang.Throwable -> L67
            if (r9 == 0) goto L99
            java.lang.String r8 = j(r5, r6)     // Catch: java.lang.Throwable -> L67
        L99:
            int r6 = r6 + 1
            goto L76
        L9c:
            r4 = -1
            int r6 = java.lang.Integer.parseInt(r7)     // Catch: java.lang.Throwable -> La2
            goto La4
        La2:
            r6 = -1
        La4:
            if (r6 != r4) goto Lba
            java.lang.String r4 = "versionCode获取失败:"
            java.lang.String r6 = java.lang.String.valueOf(r7)     // Catch: java.lang.Throwable -> L67
            java.lang.String r4 = r4.concat(r6)     // Catch: java.lang.Throwable -> L67
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r4)     // Catch: java.lang.Throwable -> L67
            r5.j()     // Catch: java.lang.Throwable -> Lb6
        Lb6:
            com.bytedance.pangle.util.ae.j(r3)
            return r2
        Lba:
            com.bytedance.pangle.ae.j.up r4 = new com.bytedance.pangle.ae.j.up     // Catch: java.lang.Throwable -> L67
            r4.<init>(r8, r6)     // Catch: java.lang.Throwable -> L67
            r5.j()     // Catch: java.lang.Throwable -> Lc2
        Lc2:
            com.bytedance.pangle.util.ae.j(r3)
            return r4
        Lc6:
            android.app.Application r6 = com.bytedance.pangle.Zeus.getAppApplication()     // Catch: java.lang.Throwable -> Le6
            android.content.pm.PackageManager r6 = r6.getPackageManager()     // Catch: java.lang.Throwable -> Le6
            java.lang.String r12 = r12.getPath()     // Catch: java.lang.Throwable -> Le6
            android.content.pm.PackageInfo r12 = r6.getPackageArchiveInfo(r12, r1)     // Catch: java.lang.Throwable -> Le6
            if (r12 != 0) goto Le8
            java.lang.String r12 = "packageArchiveInfo == null"
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r12, r3)     // Catch: java.lang.Throwable -> Le6
            if (r5 == 0) goto Le2
            r5.j()     // Catch: java.lang.Throwable -> Le2
        Le2:
            com.bytedance.pangle.util.ae.j(r4)
            return r2
        Le6:
            r12 = move-exception
            goto Lfa
        Le8:
            com.bytedance.pangle.ae.j.up r0 = new com.bytedance.pangle.ae.j.up     // Catch: java.lang.Throwable -> Le6
            java.lang.String r1 = r12.packageName     // Catch: java.lang.Throwable -> Le6
            int r12 = r12.versionCode     // Catch: java.lang.Throwable -> Le6
            r0.<init>(r1, r12)     // Catch: java.lang.Throwable -> Le6
            if (r5 == 0) goto Lf6
            r5.j()     // Catch: java.lang.Throwable -> Lf6
        Lf6:
            com.bytedance.pangle.util.ae.j(r4)
            return r0
        Lfa:
            if (r5 == 0) goto Lff
            r5.j()     // Catch: java.lang.Throwable -> Lff
        Lff:
            com.bytedance.pangle.util.ae.j(r4)
            throw r12
    }

    private static java.lang.String j(int r1) {
            int r1 = r1 >>> 24
            r0 = 1
            if (r1 != r0) goto L8
            java.lang.String r1 = "android:"
            return r1
        L8:
            java.lang.String r1 = ""
            return r1
    }

    private static java.lang.String j(com.bytedance.pangle.ae.j.j r4, int r5) {
            int r0 = r4.xt(r5)
            int r1 = r4.cw(r5)
            r2 = 3
            if (r0 != r2) goto L10
            java.lang.String r4 = r4.r(r5)
            return r4
        L10:
            r4 = 1
            r5 = 0
            r2 = 2
            if (r0 != r2) goto L2a
            java.lang.String r0 = j(r1)
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
}

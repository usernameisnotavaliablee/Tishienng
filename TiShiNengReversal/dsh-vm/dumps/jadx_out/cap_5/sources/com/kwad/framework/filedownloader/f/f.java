package com.kwad.framework.filedownloader.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class f {
    private static int apM = 65536;
    private static long apN = 2000;
    private static java.lang.String apO;
    private static java.lang.Boolean apP;
    private static java.lang.Boolean apQ;
    private static final java.util.regex.Pattern apR = null;

    static {
            java.lang.String r0 = "attachment;\\s*filename\\s*=\\s*\"([^\"]*)\""
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.kwad.framework.filedownloader.f.f.apR = r0
            return
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    private static java.lang.String A(java.lang.String r2, java.lang.String r3) {
            if (r3 == 0) goto L21
            if (r2 == 0) goto L19
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = java.io.File.separator
            r1 = 1
            r0[r1] = r2
            r2 = 2
            r0[r2] = r3
            java.lang.String r2 = "%s%s%s"
            java.lang.String r2 = c(r2, r0)
            return r2
        L19:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "can't generate real path, the directory is null"
            r2.<init>(r3)
            throw r2
        L21:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "can't generate real path, the file name is null"
            r2.<init>(r3)
            throw r2
    }

    public static int B(java.lang.String r2, java.lang.String r3) {
            com.kwad.framework.filedownloader.download.b r0 = com.kwad.framework.filedownloader.download.b.yc()
            com.kwad.framework.filedownloader.f.c$d r0 = r0.yd()
            r1 = 0
            int r2 = r0.g(r2, r3, r1)
            return r2
    }

    public static void C(java.lang.String r0, java.lang.String r1) {
            bK(r1)
            bL(r0)
            return
    }

    public static java.lang.String a(int r2, com.kwad.framework.filedownloader.a.b r3) {
            if (r3 == 0) goto L21
            java.lang.String r0 = "Etag"
            java.lang.String r3 = r3.bn(r0)
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L20
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r3
            r1 = 1
            r0[r1] = r2
            java.lang.Class<com.kwad.framework.filedownloader.f.f> r2 = com.kwad.framework.filedownloader.f.f.class
            java.lang.String r1 = "etag find %s for task(%d)"
            com.kwad.framework.filedownloader.f.d.c(r2, r1, r0)
        L20:
            return r3
        L21:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "connection is null when findEtag"
            r2.<init>(r3)
            throw r2
    }

    public static java.lang.String a(com.kwad.framework.filedownloader.a.b r1, java.lang.String r2) {
            java.lang.String r0 = "Content-Disposition"
            java.lang.String r1 = r1.bn(r0)
            java.lang.String r1 = bE(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L14
            java.lang.String r1 = bC(r2)
        L14:
            java.lang.String r2 = "\\/"
            java.lang.String r0 = "_"
            java.lang.String r1 = r1.replaceAll(r2, r0)
            return r1
    }

    public static java.lang.String a(java.lang.String r1, boolean r2, java.lang.String r3) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            if (r2 == 0) goto Ld
            if (r3 != 0) goto L9
            return r0
        L9:
            java.lang.String r1 = A(r1, r3)
        Ld:
            return r1
    }

    private static boolean a(int r3, com.kwad.framework.filedownloader.d.c r4, java.lang.Boolean r5) {
            r5 = 1
            r0 = 0
            java.lang.Class<com.kwad.framework.filedownloader.f.f> r1 = com.kwad.framework.filedownloader.f.f.class
            if (r4 != 0) goto L18
            boolean r4 = com.kwad.framework.filedownloader.f.d.apD
            if (r4 == 0) goto L17
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r0] = r3
            java.lang.String r3 = "can't continue %d model == null"
            com.kwad.framework.filedownloader.f.d.c(r1, r3, r4)
        L17:
            return r0
        L18:
            java.lang.String r2 = r4.yr()
            if (r2 != 0) goto L30
            boolean r4 = com.kwad.framework.filedownloader.f.d.apD
            if (r4 == 0) goto L2f
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            java.lang.Object[] r4 = new java.lang.Object[r5]
            r4[r0] = r3
            java.lang.String r3 = "can't continue %d temp path == null"
            com.kwad.framework.filedownloader.f.d.c(r1, r3, r4)
        L2f:
            return r0
        L30:
            java.lang.String r5 = r4.yr()
            r0 = 0
            boolean r3 = a(r3, r4, r5, r0)
            return r3
    }

    public static boolean a(int r12, com.kwad.framework.filedownloader.d.c r13, java.lang.String r14, java.lang.Boolean r15) {
            r0 = 1
            java.lang.Class<com.kwad.framework.filedownloader.f.f> r1 = com.kwad.framework.filedownloader.f.f.class
            r2 = 0
            if (r14 != 0) goto L18
            boolean r13 = com.kwad.framework.filedownloader.f.d.apD
            if (r13 == 0) goto Lcb
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r13 = new java.lang.Object[r0]
            r13[r2] = r12
            java.lang.String r12 = "can't continue %d path = null"
            com.kwad.framework.filedownloader.f.d.c(r1, r12, r13)
            return r2
        L18:
            java.io.File r3 = new java.io.File
            r3.<init>(r14)
            boolean r14 = r3.exists()
            boolean r4 = r3.isDirectory()
            r5 = 3
            r6 = 2
            if (r14 == 0) goto Lae
            if (r4 == 0) goto L2d
            goto Lae
        L2d:
            long r3 = r3.length()
            long r7 = r13.yZ()
            int r14 = r13.zc()
            if (r14 > r0) goto L53
            r9 = 0
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 != 0) goto L53
            boolean r13 = com.kwad.framework.filedownloader.f.d.apD
            if (r13 == 0) goto Lcb
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r13 = new java.lang.Object[r0]
            r13[r2] = r12
            java.lang.String r12 = "can't continue %d the downloaded-record is zero."
            com.kwad.framework.filedownloader.f.d.c(r1, r12, r13)
            return r2
        L53:
            long r13 = r13.getTotal()
            int r9 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r9 < 0) goto L89
            r9 = -1
            int r11 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r11 == 0) goto L6a
            int r9 = (r3 > r13 ? 1 : (r3 == r13 ? 0 : -1))
            if (r9 > 0) goto L89
            int r9 = (r7 > r13 ? 1 : (r7 == r13 ? 0 : -1))
            if (r9 < 0) goto L6a
            goto L89
        L6a:
            if (r15 == 0) goto L88
            boolean r15 = r15.booleanValue()
            if (r15 != 0) goto L88
            int r15 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r15 != 0) goto L88
            boolean r13 = com.kwad.framework.filedownloader.f.d.apD
            if (r13 == 0) goto Lcb
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Object[] r13 = new java.lang.Object[r0]
            r13[r2] = r12
            java.lang.String r12 = "can't continue %d, because of the output stream doesn't support seek, but the task has already pre-allocated, so we only can download it from the very beginning."
            com.kwad.framework.filedownloader.f.d.c(r1, r12, r13)
            return r2
        L88:
            return r0
        L89:
            boolean r15 = com.kwad.framework.filedownloader.f.d.apD
            if (r15 == 0) goto Lcb
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Long r15 = java.lang.Long.valueOf(r3)
            java.lang.Long r3 = java.lang.Long.valueOf(r7)
            java.lang.Long r13 = java.lang.Long.valueOf(r13)
            r14 = 4
            java.lang.Object[] r14 = new java.lang.Object[r14]
            r14[r2] = r12
            r14[r0] = r15
            r14[r6] = r3
            r14[r5] = r13
            java.lang.String r12 = "can't continue %d dirty data fileLength[%d] sofar[%d] total[%d]"
            com.kwad.framework.filedownloader.f.d.c(r1, r12, r14)
            return r2
        Lae:
            boolean r13 = com.kwad.framework.filedownloader.f.d.apD
            if (r13 == 0) goto Lcb
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r14)
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r4)
            java.lang.Object[] r15 = new java.lang.Object[r5]
            r15[r2] = r12
            r15[r0] = r13
            r15[r6] = r14
            java.lang.String r12 = "can't continue %d file not suit, exists[%B], directory[%B]"
            com.kwad.framework.filedownloader.f.d.c(r1, r12, r15)
        Lcb:
            return r2
    }

    public static boolean aJ(android.content.Context r3) {
            java.lang.Boolean r0 = com.kwad.framework.filedownloader.f.f.apP
            if (r0 == 0) goto L9
            boolean r3 = r0.booleanValue()
            return r3
        L9:
            com.kwad.framework.filedownloader.f.e r0 = com.kwad.framework.filedownloader.f.e.zB()
            boolean r0 = r0.apH
            if (r0 == 0) goto L13
            r3 = 1
            goto L32
        L13:
            java.lang.String r0 = "activity"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            if (r0 != 0) goto L28
            java.lang.String r3 = "fail to get the activity manager!"
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Class<com.kwad.framework.filedownloader.f.f> r2 = com.kwad.framework.filedownloader.f.f.class
            com.kwad.framework.filedownloader.f.d.d(r2, r3, r1)
            return r0
        L28:
            java.lang.String r3 = com.kwad.sdk.utils.ay.getProcessName(r3)
            java.lang.String r0 = ":filedownloader"
            boolean r3 = r3.endsWith(r0)
        L32:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            com.kwad.framework.filedownloader.f.f.apP = r0
            return r3
    }

    public static void aK(android.content.Context r1) {
            java.io.File r1 = aL(r1)
            java.io.File r0 = r1.getParentFile()     // Catch: java.io.IOException -> Le
            r0.mkdirs()     // Catch: java.io.IOException -> Le
            r1.createNewFile()     // Catch: java.io.IOException -> Le
        Le:
            return
    }

    private static java.io.File aL(android.content.Context r2) {
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r2 = r2.getAbsolutePath()
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = "filedownloader"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            java.lang.String r1 = ".old_file_converted"
            r0.<init>(r2, r1)
            return r0
    }

    public static void ac(long r1) {
            android.content.Context r0 = com.kwad.framework.filedownloader.f.c.zz()
            boolean r0 = aJ(r0)
            if (r0 == 0) goto Ld
            com.kwad.framework.filedownloader.f.f.apN = r1
            return
        Ld:
            java.lang.IllegalAccessException r1 = new java.lang.IllegalAccessException
            java.lang.String r2 = "This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-time'."
            r1.<init>(r2)
            throw r1
    }

    public static long b(int r5, com.kwad.framework.filedownloader.a.b r6) {
            java.lang.String r0 = "Content-Length"
            java.lang.String r0 = r6.bn(r0)
            long r0 = bI(r0)
            java.lang.String r2 = "Transfer-Encoding"
            java.lang.String r6 = r6.bn(r2)
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 >= 0) goto L49
            r0 = -1
            if (r6 == 0) goto L23
            java.lang.String r2 = "chunked"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L23
            return r0
        L23:
            com.kwad.framework.filedownloader.f.e r6 = com.kwad.framework.filedownloader.f.e.zB()
            boolean r6 = r6.apG
            if (r6 == 0) goto L41
            boolean r6 = com.kwad.framework.filedownloader.f.d.apD
            if (r6 == 0) goto L40
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 1
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r2 = 0
            r6[r2] = r5
            java.lang.Class<com.kwad.framework.filedownloader.f.f> r5 = com.kwad.framework.filedownloader.f.f.class
            java.lang.String r2 = "%d response header is not legal but HTTP lenient is true, so handle as the case of transfer encoding chunk"
            com.kwad.framework.filedownloader.f.d.c(r5, r2, r6)
        L40:
            return r0
        L41:
            com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException r5 = new com.kwad.framework.filedownloader.exception.FileDownloadGiveUpRetryException
            java.lang.String r6 = "can't know the size of the download file, and its Transfer-Encoding is not Chunked either.\nyou can ignore such exception by add http.lenient=true to the filedownloader.properties"
            r5.<init>(r6)
            throw r5
        L49:
            return r0
    }

    public static boolean b(int r1, com.kwad.framework.filedownloader.d.c r2) {
            r0 = 0
            boolean r1 = a(r1, r2, r0)
            return r1
    }

    public static java.lang.String bB(java.lang.String r1) {
            java.lang.String r0 = zF()
            java.lang.String r1 = bC(r1)
            java.lang.String r1 = A(r0, r1)
            return r1
    }

    private static java.lang.String bC(java.lang.String r0) {
            java.lang.String r0 = md5(r0)
            return r0
    }

    public static java.lang.String bD(java.lang.String r2) {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r1 = 0
            r0[r1] = r2
            java.lang.String r2 = "%s.temp"
            java.lang.String r2 = c(r2, r0)
            return r2
    }

    public static java.lang.String bE(java.lang.String r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            java.util.regex.Pattern r1 = com.kwad.framework.filedownloader.f.f.apR     // Catch: java.lang.IllegalStateException -> L16
            java.util.regex.Matcher r2 = r1.matcher(r2)     // Catch: java.lang.IllegalStateException -> L16
            boolean r1 = r2.find()     // Catch: java.lang.IllegalStateException -> L16
            if (r1 == 0) goto L16
            r1 = 1
            java.lang.String r2 = r2.group(r1)     // Catch: java.lang.IllegalStateException -> L16
            return r2
        L16:
            return r0
    }

    public static java.lang.String bF(java.lang.String r8) {
            int r0 = r8.length()
            char r1 = java.io.File.separatorChar
            r2 = 92
            r3 = 1
            r4 = 2
            r5 = 0
            if (r1 != r2) goto L19
            if (r0 <= r4) goto L19
            char r2 = r8.charAt(r3)
            r6 = 58
            if (r2 != r6) goto L19
            r2 = 2
            goto L1a
        L19:
            r2 = 0
        L1a:
            int r6 = r8.lastIndexOf(r1)
            r7 = -1
            if (r6 != r7) goto L24
            if (r2 <= 0) goto L24
            goto L25
        L24:
            r4 = r6
        L25:
            if (r4 == r7) goto L46
            int r0 = r0 - r3
            char r0 = r8.charAt(r0)
            if (r0 != r1) goto L2f
            goto L46
        L2f:
            int r0 = r8.indexOf(r1)
            if (r0 != r4) goto L41
            char r0 = r8.charAt(r2)
            if (r0 != r1) goto L41
            int r4 = r4 + r3
            java.lang.String r8 = r8.substring(r5, r4)
            return r8
        L41:
            java.lang.String r8 = r8.substring(r5, r4)
            return r8
        L46:
            r8 = 0
            return r8
    }

    public static java.lang.String bG(java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FileDownloader-"
            r0.<init>(r1)
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public static boolean bH(java.lang.String r1) {
            android.content.Context r0 = com.kwad.framework.filedownloader.f.c.zz()
            int r1 = r0.checkCallingOrSelfPermission(r1)
            if (r1 != 0) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private static long bI(java.lang.String r2) {
            r0 = -1
            if (r2 != 0) goto L5
            return r0
        L5:
            long r0 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L9
        L9:
            return r0
    }

    public static com.kwad.framework.filedownloader.e.a bJ(java.lang.String r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L68
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r1 = r0.exists()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L3e
            boolean r1 = r0.isDirectory()
            if (r1 == 0) goto L3e
            r0.delete()
            boolean r1 = r0.createNewFile()
            if (r1 == 0) goto L23
            goto L3e
        L23:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            boolean r0 = r0.isDirectory()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r5
            r4[r2] = r0
            java.lang.String r5 = "found invalid internal destination path[%s], & path is directory[%B]"
            java.lang.String r5 = c(r5, r4)
            r1.<init>(r5)
            throw r1
        L3e:
            boolean r5 = r0.exists()
            if (r5 != 0) goto L5f
            boolean r5 = r0.createNewFile()
            if (r5 == 0) goto L4b
            goto L5f
        L4b:
            java.io.IOException r5 = new java.io.IOException
            java.lang.String r0 = r0.getAbsolutePath()
            java.lang.Object[] r1 = new java.lang.Object[r2]
            r1[r3] = r0
            java.lang.String r0 = "create new file error  %s"
            java.lang.String r0 = c(r0, r1)
            r5.<init>(r0)
            throw r5
        L5f:
            com.kwad.framework.filedownloader.download.b r5 = com.kwad.framework.filedownloader.download.b.yc()
            com.kwad.framework.filedownloader.e.a r5 = r5.b(r0)
            return r5
        L68:
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "found invalid internal destination path, empty"
            r5.<init>(r0)
            throw r5
    }

    private static void bK(java.lang.String r1) {
            if (r1 == 0) goto L10
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L10
            r0.delete()
        L10:
            return
    }

    public static void bL(java.lang.String r1) {
            if (r1 == 0) goto L10
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            boolean r1 = r0.exists()
            if (r1 == 0) goto L10
            r0.delete()
        L10:
            return
    }

    public static java.lang.String c(java.lang.String r1, java.lang.Object... r2) {
            java.util.Locale r0 = java.util.Locale.ENGLISH     // Catch: java.lang.Exception -> L6
            java.lang.String r1 = java.lang.String.format(r0, r1, r2)     // Catch: java.lang.Exception -> L6
        L6:
            return r1
    }

    public static void cf(int r1) {
            android.content.Context r0 = com.kwad.framework.filedownloader.f.c.zz()
            boolean r0 = aJ(r0)
            if (r0 == 0) goto Ld
            com.kwad.framework.filedownloader.f.f.apM = r1
            return
        Ld:
            java.lang.IllegalAccessException r1 = new java.lang.IllegalAccessException
            java.lang.String r0 = "This value is used in the :filedownloader process, so set this value in your process is without effect. You can add 'process.non-separate=true' in 'filedownloader.properties' to share the main process to FileDownloadService. Or you can configure this value in 'filedownloader.properties' by 'download.min-progress-step'."
            r1.<init>(r0)
            throw r1
    }

    public static int g(java.lang.String r1, java.lang.String r2, boolean r3) {
            com.kwad.framework.filedownloader.download.b r0 = com.kwad.framework.filedownloader.download.b.yc()
            com.kwad.framework.filedownloader.f.c$d r0 = r0.yd()
            int r1 = r0.g(r1, r2, r3)
            return r1
    }

    public static boolean i(long r3, long r5) {
            int r0 = zD()
            long r0 = (long) r0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L13
            long r3 = zE()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L13
            r3 = 1
            return r3
        L13:
            r3 = 0
            return r3
    }

    public static java.lang.String md5(java.lang.String r5) {
            java.lang.String r0 = "MD5"
            java.security.MessageDigest r0 = java.security.MessageDigest.getInstance(r0)     // Catch: java.io.UnsupportedEncodingException -> L38 java.security.NoSuchAlgorithmException -> L41
            java.lang.String r1 = "UTF-8"
            byte[] r5 = r5.getBytes(r1)     // Catch: java.io.UnsupportedEncodingException -> L38 java.security.NoSuchAlgorithmException -> L41
            byte[] r5 = r0.digest(r5)     // Catch: java.io.UnsupportedEncodingException -> L38 java.security.NoSuchAlgorithmException -> L41
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r5.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r5.length
            r2 = 0
        L1a:
            if (r2 >= r1) goto L33
            r3 = r5[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 16
            if (r3 >= r4) goto L29
            java.lang.String r4 = "0"
            r0.append(r4)
        L29:
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto L1a
        L33:
            java.lang.String r5 = r0.toString()
            return r5
        L38:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Huh, UTF-8 should be supported?"
            r0.<init>(r1, r5)
            throw r0
        L41:
            r5 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Huh, MD5 should be supported?"
            r0.<init>(r1, r5)
            throw r0
    }

    private static int zD() {
            int r0 = com.kwad.framework.filedownloader.f.f.apM
            return r0
    }

    private static long zE() {
            long r0 = com.kwad.framework.filedownloader.f.f.apN
            return r0
    }

    private static java.lang.String zF() {
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.apO
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = com.kwad.framework.filedownloader.f.f.apO
            return r0
        Lb:
            android.content.Context r0 = com.kwad.framework.filedownloader.f.c.zz()
            java.io.File r0 = r0.getExternalCacheDir()
            if (r0 != 0) goto L1e
            java.io.File r0 = android.os.Environment.getDownloadCacheDirectory()
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
        L1e:
            android.content.Context r0 = com.kwad.framework.filedownloader.f.c.zz()
            java.io.File r0 = r0.getExternalCacheDir()
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    public static boolean zG() {
            android.content.Context r0 = com.kwad.framework.filedownloader.f.c.zz()
            java.lang.String r1 = "connectivity"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.net.ConnectivityManager r0 = (android.net.ConnectivityManager) r0
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1a
            java.lang.String r0 = "failed to get connectivity manager!"
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.Class<com.kwad.framework.filedownloader.f.f> r3 = com.kwad.framework.filedownloader.f.f.class
            com.kwad.framework.filedownloader.f.d.d(r3, r0, r1)
            return r2
        L1a:
            android.net.NetworkInfo r0 = r0.getActiveNetworkInfo()
            if (r0 == 0) goto L28
            int r0 = r0.getType()
            if (r0 == r2) goto L27
            goto L28
        L27:
            return r1
        L28:
            return r2
    }

    public static java.lang.String zH() {
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "4.6.30.1"
            r2 = 0
            r0[r2] = r1
            java.lang.String r1 = "FileDownloader/%s"
            java.lang.String r0 = c(r1, r0)
            return r0
    }
}

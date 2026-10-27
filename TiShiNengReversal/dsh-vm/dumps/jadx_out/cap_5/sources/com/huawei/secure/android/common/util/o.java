package com.huawei.secure.android.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class o {
    private static final java.lang.String a = "ZipUtil";
    private static final int b = 104857600;
    private static final int c = 100;
    private static final int d = 4096;
    private static final java.lang.String e = "..";
    private static final java.lang.String[] f = null;

    static {
            java.lang.String r6 = "..%5C"
            java.lang.String r7 = ".%2F"
            java.lang.String r0 = "..\\"
            java.lang.String r1 = "../"
            java.lang.String r2 = "./"
            java.lang.String r3 = ".\\.\\"
            java.lang.String r4 = "%00"
            java.lang.String r5 = "..%2F"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7}
            com.huawei.secure.android.common.util.o.f = r0
            return
    }

    public o() {
            r0 = this;
            r0.<init>()
            return
    }

    @android.annotation.SuppressLint({"NewApi"})
    private static java.util.List<java.io.File> a(java.io.File r18, java.io.File r19, long r20, boolean r22, boolean r23) {
            r1 = r18
            r2 = r19
            r3 = 0
            if (r1 == 0) goto L9
            if (r2 != 0) goto Lc
        L9:
            r15 = r3
            goto L188
        Lc:
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.lang.String r4 = "ZipUtil"
            r8 = 0
            r5 = 1
            if (r23 != 0) goto L26
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
        L1c:
            r9 = r0
            goto L48
        L1e:
            r0 = move-exception
            r15 = r3
            goto L170
        L22:
            r0 = move-exception
            r15 = r3
            goto L172
        L26:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
            r0.<init>()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
            java.lang.String r6 = "not a utf8 zip file, use gbk open zip file : "
            r0.append(r6)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
            r0.append(r1)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
            com.huawei.secure.android.common.util.e.r(r4, r0)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
            com.huawei.secure.android.common.util.m.a()     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
            java.lang.String r0 = "GBK"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
            java.util.zip.ZipFile r0 = com.huawei.secure.android.common.util.l.a(r1, r0)     // Catch: java.lang.Throwable -> L1e java.io.IOException -> L22
            goto L1c
        L48:
            java.util.Enumeration r6 = r9.entries()     // Catch: java.io.IOException -> L7e java.lang.Throwable -> L16a
            r5 = 0
            r10 = 1
        L4e:
            boolean r0 = r6.hasMoreElements()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            if (r0 == 0) goto L160
            java.lang.Object r0 = r6.nextElement()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e java.lang.IllegalArgumentException -> L11d
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e java.lang.IllegalArgumentException -> L11d
            java.lang.String r11 = r0.getName()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            boolean r12 = android.text.TextUtils.isEmpty(r11)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            if (r12 == 0) goto L68
        L64:
            r15 = r3
            r3 = r4
            goto L158
        L68:
            java.text.Normalizer$Form r12 = java.text.Normalizer.Form.NFKC     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            java.lang.String r11 = java.text.Normalizer.normalize(r11, r12)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            boolean r12 = o(r11)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            if (r12 == 0) goto L81
            l(r11)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            goto L161
        L79:
            r0 = move-exception
            r3 = r9
            r8 = r10
            goto L17e
        L7e:
            r0 = move-exception
            goto L16e
        L81:
            java.lang.String r12 = "\\\\"
            java.lang.String r13 = "/"
            java.lang.String r11 = r11.replaceAll(r12, r13)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            java.io.File r12 = new java.io.File     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            r12.<init>(r2, r11)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            if (r22 == 0) goto L9f
            boolean r11 = r12.exists()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            if (r11 == 0) goto L9f
            boolean r11 = r12.isFile()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            if (r11 == 0) goto L9f
            n(r12)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
        L9f:
            r7.add(r12)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            boolean r11 = r0.isDirectory()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            if (r11 == 0) goto Lb5
            boolean r0 = d(r12)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            if (r0 != 0) goto L64
            com.huawei.secure.android.common.util.d.b(r9)
            g(r7)
            return r3
        Lb5:
            boolean r11 = i(r12)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            if (r11 != 0) goto Lc2
            com.huawei.secure.android.common.util.d.b(r9)
            g(r7)
            return r3
        Lc2:
            java.io.BufferedInputStream r11 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L10f
            java.io.InputStream r0 = r9.getInputStream(r0)     // Catch: java.lang.Throwable -> L10f
            r11.<init>(r0)     // Catch: java.lang.Throwable -> L10f
            java.io.FileOutputStream r13 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L10b
            r13.<init>(r12)     // Catch: java.lang.Throwable -> L10b
            java.io.BufferedOutputStream r12 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L108
            r12.<init>(r13)     // Catch: java.lang.Throwable -> L108
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> Lf2
        Ld9:
            int r14 = r11.read(r0)     // Catch: java.lang.Throwable -> Lf2
            r15 = -1
            if (r14 == r15) goto Lf4
            int r5 = r5 + r14
            r15 = r3
            r16 = r4
            long r3 = (long) r5     // Catch: java.lang.Throwable -> Lf2
            int r17 = (r3 > r20 ? 1 : (r3 == r20 ? 0 : -1))
            if (r17 <= 0) goto Leb
            r10 = 0
            goto Lf7
        Leb:
            r12.write(r0, r8, r14)     // Catch: java.lang.Throwable -> Lf2
            r3 = r15
            r4 = r16
            goto Ld9
        Lf2:
            r0 = move-exception
            goto L105
        Lf4:
            r15 = r3
            r16 = r4
        Lf7:
            com.huawei.secure.android.common.util.d.c(r11)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            com.huawei.secure.android.common.util.d.d(r12)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            com.huawei.secure.android.common.util.d.d(r13)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            r3 = r15
            r4 = r16
            goto L4e
        L105:
            r15 = r12
        L106:
            r3 = r13
            goto L113
        L108:
            r0 = move-exception
            r15 = r3
            goto L106
        L10b:
            r0 = move-exception
            r15 = r3
            r3 = r15
            goto L113
        L10f:
            r0 = move-exception
            r15 = r3
            r3 = r15
            r11 = r3
        L113:
            com.huawei.secure.android.common.util.d.c(r11)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            com.huawei.secure.android.common.util.d.d(r15)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            com.huawei.secure.android.common.util.d.d(r3)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            throw r0     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
        L11d:
            r0 = move-exception
            r15 = r3
            r16 = r4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            r3.<init>()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            java.lang.String r4 = "not a utf8 zip file, IllegalArgumentException : "
            r3.append(r4)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            r3.append(r0)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            r3 = r16
            com.huawei.secure.android.common.util.e.r(r3, r0)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            r4 = 24
            if (r0 < r4) goto L153
            r6 = 1
            r3 = r20
            r5 = r22
            java.util.List r0 = a(r1, r2, r3, r5, r6)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
            com.huawei.secure.android.common.util.d.b(r9)
            if (r10 != 0) goto L152
            g(r7)
        L152:
            return r0
        L153:
            java.lang.String r0 = "File is not a utf8 zip file and Build.VERSION_CODES < 24"
            com.huawei.secure.android.common.util.e.l(r3, r0)     // Catch: java.lang.Throwable -> L79 java.io.IOException -> L7e
        L158:
            r1 = r18
            r2 = r19
            r4 = r3
            r3 = r15
            goto L4e
        L160:
            r8 = r10
        L161:
            com.huawei.secure.android.common.util.d.b(r9)
            if (r8 != 0) goto L17c
            g(r7)
            goto L17c
        L16a:
            r0 = move-exception
            r3 = r9
            r8 = 1
            goto L17e
        L16e:
            r3 = r9
            goto L173
        L170:
            r3 = r15
            goto L17f
        L172:
            r3 = r15
        L173:
            r0.getMessage()     // Catch: java.lang.Throwable -> L17d
            com.huawei.secure.android.common.util.d.b(r3)
            g(r7)
        L17c:
            return r7
        L17d:
            r0 = move-exception
        L17e:
            r5 = r8
        L17f:
            com.huawei.secure.android.common.util.d.b(r3)
            if (r5 != 0) goto L187
            g(r7)
        L187:
            throw r0
        L188:
            return r15
    }

    private static void b(java.io.FileInputStream r0, java.io.BufferedOutputStream r1, java.util.zip.ZipInputStream r2, java.io.FileOutputStream r3) {
            com.huawei.secure.android.common.util.d.c(r0)
            com.huawei.secure.android.common.util.d.d(r1)
            com.huawei.secure.android.common.util.d.c(r2)
            com.huawei.secure.android.common.util.d.d(r3)
            return
    }

    private static void c(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L15
            boolean r1 = o(r1)
            if (r1 != 0) goto Ld
            goto L15
        Ld:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "path is not a standard path"
            r1.<init>(r0)
            throw r1
        L15:
            return
    }

    private static boolean d(java.io.File r1) {
            if (r1 == 0) goto L17
            boolean r0 = r1.exists()
            if (r0 == 0) goto Lf
            boolean r1 = r1.isDirectory()
            if (r1 == 0) goto L17
            goto L15
        Lf:
            boolean r1 = r1.mkdirs()
            if (r1 == 0) goto L17
        L15:
            r1 = 1
            return r1
        L17:
            r1 = 0
            return r1
    }

    @androidx.annotation.RequiresApi(api = 24)
    private static boolean e(java.lang.String r19, long r20, int r22, boolean r23) {
            r1 = r19
            r2 = r20
            r4 = r22
            java.lang.String r5 = "close zipFile IOException "
            java.lang.String r6 = "ZipUtil"
            r7 = 0
            r8 = 0
            if (r23 != 0) goto L18
            java.util.zip.ZipFile r0 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
        L13:
            r7 = r0
            goto L3a
        L15:
            r0 = move-exception
            goto Lcb
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            r0.<init>()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            java.lang.String r9 = "not a utf8 zip file, use gbk open zip file : "
            r0.append(r9)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            r0.append(r1)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            com.huawei.secure.android.common.util.e.r(r6, r0)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            com.huawei.secure.android.common.util.m.a()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            java.lang.String r0 = "GBK"
            java.nio.charset.Charset r0 = java.nio.charset.Charset.forName(r0)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            java.util.zip.ZipFile r0 = com.huawei.secure.android.common.util.n.a(r1, r0)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            goto L13
        L3a:
            java.util.Enumeration r9 = r7.entries()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            r10 = 1
            r11 = 0
            r0 = 1
            r13 = 0
        L43:
            boolean r14 = r9.hasMoreElements()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            if (r14 == 0) goto La4
            java.lang.Object r14 = r9.nextElement()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71 java.lang.IllegalArgumentException -> L79
            java.util.zip.ZipEntry r14 = (java.util.zip.ZipEntry) r14     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71 java.lang.IllegalArgumentException -> L79
            long r15 = r14.getSize()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            long r11 = r11 + r15
            int r13 = r13 + 1
            java.lang.String r15 = r14.getName()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            boolean r15 = o(r15)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            if (r15 != 0) goto L73
            if (r13 >= r4) goto L73
            int r15 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r15 > 0) goto L73
            long r14 = r14.getSize()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            r16 = -1
            int r18 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r18 != 0) goto L43
            goto L73
        L71:
            r0 = move-exception
            goto La9
        L73:
            java.lang.String r0 = "File name is invalid or too many files or too big"
            com.huawei.secure.android.common.util.e.l(r6, r0)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            goto La5
        L79:
            r0 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            r14.<init>()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            java.lang.String r15 = "not a utf8 zip file, IllegalArgumentException : "
            r14.append(r15)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            r14.append(r0)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            java.lang.String r0 = r14.toString()     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            com.huawei.secure.android.common.util.e.r(r6, r0)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            r14 = 24
            if (r0 < r14) goto L9d
            boolean r8 = e(r1, r2, r4, r10)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            goto La5
        L9d:
            java.lang.String r0 = "File is not a utf8 zip file and Build.VERSION_CODES < 24"
            com.huawei.secure.android.common.util.e.l(r6, r0)     // Catch: java.lang.Throwable -> L15 java.io.IOException -> L71
            r0 = 0
            goto L43
        La4:
            r8 = r0
        La5:
            r7.close()     // Catch: java.io.IOException -> Lc7
            goto Lca
        La9:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L15
            r1.<init>()     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = "not a valid zip file, IOException : "
            r1.append(r2)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L15
            r1.append(r0)     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L15
            com.huawei.secure.android.common.util.e.l(r6, r0)     // Catch: java.lang.Throwable -> L15
            if (r7 == 0) goto Lca
            r7.close()     // Catch: java.io.IOException -> Lc7
            goto Lca
        Lc7:
            com.huawei.secure.android.common.util.e.l(r6, r5)
        Lca:
            return r8
        Lcb:
            if (r7 == 0) goto Ld4
            r7.close()     // Catch: java.io.IOException -> Ld1
            goto Ld4
        Ld1:
            com.huawei.secure.android.common.util.e.l(r6, r5)
        Ld4:
            throw r0
    }

    private static boolean f(java.lang.String r3, java.lang.String r4, long r5, int r7) throws com.huawei.secure.android.common.util.SecurityCommonException {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            java.lang.String r1 = "ZipUtil"
            r2 = 0
            if (r0 != 0) goto L38
            boolean r0 = o(r3)
            if (r0 == 0) goto L10
            goto L38
        L10:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L32
            boolean r4 = o(r4)
            if (r4 == 0) goto L1d
            goto L32
        L1d:
            boolean r3 = e(r3, r5, r7, r2)
            if (r3 == 0) goto L25
            r3 = 1
            return r3
        L25:
            java.lang.String r3 = "zip file contains valid chars or too many files"
            com.huawei.secure.android.common.util.e.l(r1, r3)
            com.huawei.secure.android.common.util.SecurityCommonException r3 = new com.huawei.secure.android.common.util.SecurityCommonException
            java.lang.String r4 = "unsecure zipfile!"
            r3.<init>(r4)
            throw r3
        L32:
            java.lang.String r3 = "target directory is not valid"
            com.huawei.secure.android.common.util.e.l(r1, r3)
            return r2
        L38:
            java.lang.String r3 = "zip file is not valid"
            com.huawei.secure.android.common.util.e.l(r1, r3)
            return r2
    }

    private static boolean g(java.util.List<java.io.File> r2) {
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Exception -> L16
        L4:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Exception -> L16
            if (r0 == 0) goto L14
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Exception -> L16
            java.io.File r0 = (java.io.File) r0     // Catch: java.lang.Exception -> L16
            n(r0)     // Catch: java.lang.Exception -> L16
            goto L4
        L14:
            r2 = 1
            return r2
        L16:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "unzip fail delete file failed"
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "ZipUtil"
            com.huawei.secure.android.common.util.e.l(r0, r2)
            r2 = 0
            return r2
    }

    private static java.io.File h(java.lang.String r1) {
            c(r1)
            java.io.File r0 = new java.io.File
            r0.<init>(r1)
            return r0
    }

    private static boolean i(java.io.File r2) {
            r0 = 0
            if (r2 != 0) goto L4
            return r0
        L4:
            boolean r1 = r2.exists()
            if (r1 == 0) goto Lf
            boolean r2 = r2.isFile()
            return r2
        Lf:
            java.io.File r1 = r2.getParentFile()
            boolean r1 = d(r1)
            if (r1 != 0) goto L1a
            return r0
        L1a:
            boolean r2 = r2.createNewFile()     // Catch: java.io.IOException -> L1f
            return r2
        L1f:
            return r0
    }

    private static java.io.File j(java.lang.String r1) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L8
            r1 = 0
            return r1
        L8:
            java.io.File r1 = h(r1)
            return r1
    }

    private static void k(java.io.File r1) {
            if (r1 != 0) goto L3
            goto L10
        L3:
            boolean r1 = r1.delete()
            if (r1 != 0) goto L10
            java.lang.String r1 = "ZipUtil"
            java.lang.String r0 = "delete file error"
            com.huawei.secure.android.common.util.e.l(r1, r0)
        L10:
            return
    }

    private static java.lang.String l(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L7
            return r2
        L7:
            java.lang.String r0 = java.io.File.separator
            int r0 = r2.lastIndexOf(r0)
            r1 = -1
            if (r0 != r1) goto L11
            return r2
        L11:
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
            return r2
    }

    private static void m(java.io.File r1) {
            if (r1 == 0) goto L16
            boolean r0 = r1.exists()
            if (r0 == 0) goto L9
            goto L16
        L9:
            boolean r1 = r1.mkdirs()
            if (r1 != 0) goto L16
            java.lang.String r1 = "ZipUtil"
            java.lang.String r0 = "mkdirs error , files exists or IOException."
            com.huawei.secure.android.common.util.e.l(r1, r0)
        L16:
            return
    }

    private static void n(java.io.File r4) {
            if (r4 != 0) goto L3
            goto L30
        L3:
            boolean r0 = r4.isFile()
            if (r0 == 0) goto Ld
            k(r4)
            return
        Ld:
            boolean r0 = r4.isDirectory()
            if (r0 == 0) goto L30
            java.io.File[] r0 = r4.listFiles()
            if (r0 == 0) goto L2d
            int r1 = r0.length
            if (r1 != 0) goto L1d
            goto L2d
        L1d:
            int r1 = r0.length
            r2 = 0
        L1f:
            if (r2 >= r1) goto L29
            r3 = r0[r2]
            n(r3)
            int r2 = r2 + 1
            goto L1f
        L29:
            k(r4)
            return
        L2d:
            k(r4)
        L30:
            return
    }

    private static boolean o(java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = ".."
            boolean r0 = r6.equals(r0)
            r2 = 1
            if (r0 == 0) goto L12
            return r2
        L12:
            java.lang.String[] r0 = com.huawei.secure.android.common.util.o.f
            int r3 = r0.length
            r4 = 0
        L16:
            if (r4 >= r3) goto L24
            r5 = r0[r4]
            boolean r5 = r6.contains(r5)
            if (r5 == 0) goto L21
            return r2
        L21:
            int r4 = r4 + 1
            goto L16
        L24:
            return r1
    }

    @java.lang.Deprecated
    public static boolean p(java.lang.String r17, java.lang.String r18, long r19, int r21, boolean r22) throws com.huawei.secure.android.common.util.SecurityCommonException {
            r0 = r18
            boolean r1 = f(r17, r18, r19, r21)
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.lang.String r1 = java.io.File.separator
            boolean r3 = r0.endsWith(r1)
            if (r3 == 0) goto L29
            int r3 = r0.length()
            int r4 = r1.length()
            if (r3 <= r4) goto L29
            int r3 = r0.length()
            int r1 = r1.length()
            int r3 = r3 - r1
            java.lang.String r0 = r0.substring(r2, r3)
        L29:
            r1 = 4096(0x1000, float:5.74E-42)
            byte[] r3 = new byte[r1]
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L100 java.io.IOException -> L102
            r7 = r17
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L100 java.io.IOException -> L102
            java.util.zip.ZipInputStream r7 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> Lf4 java.io.IOException -> Lf6
            java.io.BufferedInputStream r8 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> Lf4 java.io.IOException -> Lf6
            r8.<init>(r6)     // Catch: java.lang.Throwable -> Lf4 java.io.IOException -> Lf6
            r7.<init>(r8)     // Catch: java.lang.Throwable -> Lf4 java.io.IOException -> Lf6
            r8 = 1
            r8 = r5
            r9 = 1
            r10 = 0
        L48:
            java.util.zip.ZipEntry r11 = r7.getNextEntry()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            if (r11 == 0) goto Lea
            java.lang.String r12 = r11.getName()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            java.lang.String r13 = "\\\\"
            java.lang.String r14 = "/"
            java.lang.String r12 = r12.replaceAll(r13, r14)     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            java.io.File r13 = new java.io.File     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            r13.<init>(r0, r12)     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            java.text.Normalizer$Form r14 = java.text.Normalizer.Form.NFKC     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            java.lang.String r12 = java.text.Normalizer.normalize(r12, r14)     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            boolean r14 = o(r12)     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            if (r14 == 0) goto L74
            l(r12)     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            r9 = 0
            goto Lea
        L71:
            r0 = move-exception
            goto Lf2
        L74:
            if (r22 == 0) goto L85
            boolean r12 = r13.exists()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            if (r12 == 0) goto L85
            boolean r12 = r13.isFile()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            if (r12 == 0) goto L85
            n(r13)     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
        L85:
            boolean r11 = r11.isDirectory()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            if (r11 == 0) goto L92
            m(r13)     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            r4.add(r13)     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            goto Ld3
        L92:
            java.io.File r11 = r13.getParentFile()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            if (r11 == 0) goto La1
            boolean r12 = r11.exists()     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            if (r12 != 0) goto La1
            m(r11)     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
        La1:
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            r11.<init>(r13)     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            java.io.BufferedOutputStream r8 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Le7
            r8.<init>(r11)     // Catch: java.lang.Throwable -> Le5 java.io.IOException -> Le7
        Lab:
            int r5 = r7.read(r3, r2, r1)     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lc2
            r12 = -1
            if (r5 == r12) goto Lc5
            int r10 = r10 + r5
            long r14 = (long) r10     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lc2
            int r12 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r12 <= 0) goto Lba
            r9 = 0
            goto Lc5
        Lba:
            r8.write(r3, r2, r5)     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lc2
            goto Lab
        Lbe:
            r0 = move-exception
        Lbf:
            r5 = r6
            goto L132
        Lc2:
            r0 = move-exception
            r5 = r11
            goto Le2
        Lc5:
            r4.add(r13)     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lc2
            r8.flush()     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lc2
            com.huawei.secure.android.common.util.d.d(r8)     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lc2
            com.huawei.secure.android.common.util.d.d(r11)     // Catch: java.lang.Throwable -> Lbe java.io.IOException -> Lc2
            r5 = r8
            r8 = r11
        Ld3:
            r7.closeEntry()     // Catch: java.lang.Throwable -> Ld8 java.io.IOException -> Ldc
            goto L48
        Ld8:
            r0 = move-exception
            r11 = r8
        Lda:
            r8 = r5
            goto Lbf
        Ldc:
            r0 = move-exception
            r16 = r8
            r8 = r5
            r5 = r16
        Le2:
            r11 = r5
        Le3:
            r5 = r6
            goto L10b
        Le5:
            r0 = move-exception
            goto Lda
        Le7:
            r0 = move-exception
        Le8:
            r8 = r5
            goto Le3
        Lea:
            com.huawei.secure.android.common.util.d.c(r7)     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            com.huawei.secure.android.common.util.d.c(r6)     // Catch: java.io.IOException -> L71 java.lang.Throwable -> Ld8
            r2 = r9
            goto L128
        Lf2:
            r11 = r8
            goto Le8
        Lf4:
            r0 = move-exception
            goto Lf8
        Lf6:
            r0 = move-exception
            goto Lfc
        Lf8:
            r7 = r5
            r8 = r7
            r11 = r8
            goto Lbf
        Lfc:
            r7 = r5
            r8 = r7
            r11 = r8
            goto Le3
        L100:
            r0 = move-exception
            goto L104
        L102:
            r0 = move-exception
            goto L108
        L104:
            r7 = r5
            r8 = r7
            r11 = r8
            goto L132
        L108:
            r7 = r5
            r8 = r7
            r11 = r8
        L10b:
            java.lang.String r1 = "ZipUtil"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L131
            r3.<init>()     // Catch: java.lang.Throwable -> L131
            java.lang.String r6 = "Unzip IOException : "
            r3.append(r6)     // Catch: java.lang.Throwable -> L131
            java.lang.String r0 = r0.getMessage()     // Catch: java.lang.Throwable -> L131
            r3.append(r0)     // Catch: java.lang.Throwable -> L131
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L131
            com.huawei.secure.android.common.util.e.l(r1, r0)     // Catch: java.lang.Throwable -> L131
            r6 = r5
            r5 = r8
            r8 = r11
        L128:
            b(r6, r5, r7, r8)
            if (r2 != 0) goto L130
            g(r4)
        L130:
            return r2
        L131:
            r0 = move-exception
        L132:
            b(r5, r8, r7, r11)
            throw r0
    }

    @java.lang.Deprecated
    public static boolean q(java.lang.String r6, java.lang.String r7, boolean r8) throws com.huawei.secure.android.common.util.SecurityCommonException {
            r2 = 104857600(0x6400000, double:5.1806538E-316)
            r4 = 100
            r0 = r6
            r1 = r7
            r5 = r8
            boolean r6 = p(r0, r1, r2, r4, r5)
            return r6
    }

    public static java.util.List<java.io.File> r(java.lang.String r6, java.lang.String r7, long r8, int r10, boolean r11) throws com.huawei.secure.android.common.util.SecurityCommonException {
            boolean r10 = f(r6, r7, r8, r10)
            if (r10 != 0) goto L8
            r6 = 0
            return r6
        L8:
            java.lang.String r10 = java.io.File.separator
            boolean r0 = r7.endsWith(r10)
            if (r0 == 0) goto L28
            int r0 = r7.length()
            int r1 = r10.length()
            if (r0 <= r1) goto L28
            int r0 = r7.length()
            int r10 = r10.length()
            int r0 = r0 - r10
            r10 = 0
            java.lang.String r7 = r7.substring(r10, r0)
        L28:
            java.io.File r0 = j(r6)
            java.io.File r1 = j(r7)
            r5 = 0
            r2 = r8
            r4 = r11
            java.util.List r6 = a(r0, r1, r2, r4, r5)
            return r6
    }

    public static java.util.List<java.io.File> s(java.lang.String r6, java.lang.String r7, boolean r8) throws com.huawei.secure.android.common.util.SecurityCommonException {
            r2 = 104857600(0x6400000, double:5.1806538E-316)
            r4 = 100
            r0 = r6
            r1 = r7
            r5 = r8
            java.util.List r6 = r(r0, r1, r2, r4, r5)
            return r6
    }
}

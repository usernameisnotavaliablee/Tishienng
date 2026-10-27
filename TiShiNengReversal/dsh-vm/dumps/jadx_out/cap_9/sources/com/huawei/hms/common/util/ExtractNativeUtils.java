package com.huawei.hms.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ExtractNativeUtils {
    public static final java.lang.String a = "ExtractNativeUtils";
    public static final int b = 0;
    public static final int c = -1;
    public static final int d = 50;
    public static final int e = 52428800;
    public static final java.util.regex.Pattern f = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b {
        public java.lang.String a;
        public java.util.zip.ZipEntry b;
        public java.lang.String c;

        public b(java.util.zip.ZipEntry r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                r0.a = r2
                r0.c = r3
                return
        }

        public /* synthetic */ b(java.util.zip.ZipEntry r1, java.lang.String r2, java.lang.String r3, com.huawei.hms.common.util.ExtractNativeUtils.a r4) {
                r0 = this;
                r0.<init>(r1, r2, r3)
                return
        }

        public static /* synthetic */ java.lang.String a(com.huawei.hms.common.util.ExtractNativeUtils.b r0) {
                java.lang.String r0 = r0.c
                return r0
        }

        public static /* synthetic */ java.lang.String b(com.huawei.hms.common.util.ExtractNativeUtils.b r0) {
                java.lang.String r0 = r0.a
                return r0
        }

        public static /* synthetic */ java.util.zip.ZipEntry c(com.huawei.hms.common.util.ExtractNativeUtils.b r0) {
                java.util.zip.ZipEntry r0 = r0.b
                return r0
        }
    }

    static {
            java.lang.String r0 = "lib/([^/]+)/(.*\\.so)$"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0)
            com.huawei.hms.common.util.ExtractNativeUtils.f = r0
            return
    }

    public ExtractNativeUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(java.io.File r12, java.lang.String r13) {
            java.lang.String r0 = "IOException:"
            java.lang.String r1 = "begin extractNativeLibrary"
            java.lang.String r2 = "ExtractNativeUtils"
            com.huawei.hms.common.util.Logger.i(r2, r1)
            r1 = 0
            r3 = 0
            java.util.zip.ZipFile r4 = new java.util.zip.ZipFile     // Catch: java.lang.Throwable -> Lbd java.io.IOException -> Lbf
            r4.<init>(r12)     // Catch: java.lang.Throwable -> Lbd java.io.IOException -> Lbf
            java.util.Enumeration r12 = r4.entries()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
            java.util.HashMap r3 = new java.util.HashMap     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
            r3.<init>()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
            int r12 = b(r12, r3, r1)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
            r5 = -1
            if (r12 != r5) goto L35
            java.lang.String r12 = "Unsafe zip name!"
            com.huawei.hms.common.util.Logger.e(r2, r12)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
        L25:
            r4.close()     // Catch: java.io.IOException -> L29
            return r5
        L29:
            r12 = move-exception
            com.huawei.hms.common.util.Logger.e(r2, r0, r12)
            return r5
        L2e:
            r12 = move-exception
            r3 = r4
            goto Ld2
        L32:
            r12 = move-exception
            goto Lbb
        L35:
            r6 = 50
            if (r12 <= r6) goto L3f
            java.lang.String r12 = "the total number is larger than the max"
            com.huawei.hms.common.util.Logger.e(r2, r12)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
            goto L25
        L3f:
            java.util.Set r12 = r3.keySet()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
            java.util.Iterator r12 = r12.iterator()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L32
            r6 = 0
        L48:
            boolean r7 = r12.hasNext()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            if (r7 == 0) goto Lb5
            java.lang.Object r7 = r12.next()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            java.lang.Object r7 = r3.get(r7)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            java.util.Set r7 = (java.util.Set) r7     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            if (r7 != 0) goto L65
            java.lang.String r12 = "Get nativeZipEntries failed."
            com.huawei.hms.common.util.Logger.e(r2, r12)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            goto L25
        L62:
            r12 = move-exception
            r1 = r6
            goto Lbb
        L65:
            java.util.Iterator r7 = r7.iterator()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
        L69:
            boolean r8 = r7.hasNext()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            if (r8 == 0) goto L48
            java.lang.Object r8 = r7.next()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            com.huawei.hms.common.util.ExtractNativeUtils$b r8 = (com.huawei.hms.common.util.ExtractNativeUtils.b) r8     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            r9.<init>()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            r9.append(r13)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            java.lang.String r10 = java.io.File.separator     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            r9.append(r10)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            java.lang.String r10 = com.huawei.hms.common.util.ExtractNativeUtils.b.a(r8)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            r9.append(r10)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            com.huawei.hms.feature.dynamic.ModuleCopy.makeDirectory(r9)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            r11 = 1
            r10.setExecutable(r11, r1)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            int r6 = c(r4, r8, r9)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            if (r6 == 0) goto La8
            r4.close()     // Catch: java.io.IOException -> La3
            return r6
        La3:
            r12 = move-exception
            com.huawei.hms.common.util.Logger.e(r2, r0, r12)
            return r6
        La8:
            java.io.File r10 = new java.io.File     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            java.lang.String r8 = com.huawei.hms.common.util.ExtractNativeUtils.b.b(r8)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            r10.<init>(r9, r8)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            r10.setReadable(r11, r1)     // Catch: java.lang.Throwable -> L2e java.io.IOException -> L62
            goto L69
        Lb5:
            r4.close()     // Catch: java.io.IOException -> Lb9
            return r6
        Lb9:
            r12 = move-exception
            goto Lcd
        Lbb:
            r3 = r4
            goto Lc0
        Lbd:
            r12 = move-exception
            goto Ld2
        Lbf:
            r12 = move-exception
        Lc0:
            java.lang.String r13 = "catch IOException "
            com.huawei.hms.common.util.Logger.e(r2, r13, r12)     // Catch: java.lang.Throwable -> Lbd
            if (r3 == 0) goto Ld1
            r3.close()     // Catch: java.io.IOException -> Lcb
            goto Ld1
        Lcb:
            r12 = move-exception
            r6 = r1
        Lcd:
            com.huawei.hms.common.util.Logger.e(r2, r0, r12)
            r1 = r6
        Ld1:
            return r1
        Ld2:
            if (r3 == 0) goto Ldc
            r3.close()     // Catch: java.io.IOException -> Ld8
            goto Ldc
        Ld8:
            r13 = move-exception
            com.huawei.hms.common.util.Logger.e(r2, r0, r13)
        Ldc:
            throw r12
    }

    public static int b(java.util.Enumeration r6, java.util.HashMap<java.lang.String, java.util.HashSet<com.huawei.hms.common.util.ExtractNativeUtils.b>> r7, int r8) {
        L0:
            boolean r0 = r6.hasMoreElements()
            if (r0 == 0) goto L5a
            java.lang.Object r0 = r6.nextElement()
            if (r0 == 0) goto L0
            boolean r1 = r0 instanceof java.util.zip.ZipEntry
            if (r1 != 0) goto L11
            goto L0
        L11:
            java.util.zip.ZipEntry r0 = (java.util.zip.ZipEntry) r0
            java.lang.String r1 = r0.getName()
            java.lang.String r2 = "../"
            boolean r2 = r1.contains(r2)
            if (r2 == 0) goto L28
            java.lang.String r6 = "ExtractNativeUtils"
            java.lang.String r7 = "Unsafe zip name!"
            com.huawei.hms.common.util.Logger.e(r6, r7)
            r6 = -1
            return r6
        L28:
            java.util.regex.Pattern r2 = com.huawei.hms.common.util.ExtractNativeUtils.f
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r2 = r1.matches()
            if (r2 == 0) goto L0
            r2 = 1
            java.lang.String r2 = r1.group(r2)
            r3 = 2
            java.lang.String r1 = r1.group(r3)
            java.lang.Object r3 = r7.get(r2)
            java.util.HashSet r3 = (java.util.HashSet) r3
            if (r3 != 0) goto L4e
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r7.put(r2, r3)
        L4e:
            com.huawei.hms.common.util.ExtractNativeUtils$b r4 = new com.huawei.hms.common.util.ExtractNativeUtils$b
            r5 = 0
            r4.<init>(r0, r1, r2, r5)
            r3.add(r4)
            int r8 = r8 + 1
            goto L0
        L5a:
            return r8
    }

    public static int c(java.util.zip.ZipFile r9, com.huawei.hms.common.util.ExtractNativeUtils.b r10, java.lang.String r11) {
            java.lang.String r0 = "IOException"
            java.lang.String r1 = "ExtractNativeUtils"
            r2 = 4096(0x1000, float:5.74E-42)
            r3 = -1
            r4 = 0
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74 java.io.FileNotFoundException -> L8e
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74 java.io.FileNotFoundException -> L8e
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74 java.io.FileNotFoundException -> L8e
            java.lang.String r7 = com.huawei.hms.common.util.ExtractNativeUtils.b.b(r10)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74 java.io.FileNotFoundException -> L8e
            r6.<init>(r11, r7)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74 java.io.FileNotFoundException -> L8e
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L72 java.io.IOException -> L74 java.io.FileNotFoundException -> L8e
            java.util.zip.ZipEntry r11 = com.huawei.hms.common.util.ExtractNativeUtils.b.c(r10)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            java.io.InputStream r4 = r9.getInputStream(r11)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            r9 = 0
            r11 = 0
        L22:
            int r6 = r4.read(r2)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            if (r6 <= 0) goto L5d
            int r11 = r11 + r6
            r7 = 52428800(0x3200000, float:4.7019774E-37)
            if (r11 <= r7) goto L59
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            r9.<init>()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            java.lang.String r11 = "so file too big , "
            r9.append(r11)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            java.lang.String r11 = com.huawei.hms.common.util.ExtractNativeUtils.b.a(r10)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            r9.append(r11)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            java.lang.String r11 = " , "
            r9.append(r11)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            java.lang.String r10 = com.huawei.hms.common.util.ExtractNativeUtils.b.b(r10)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            r9.append(r10)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            com.huawei.hms.common.util.Logger.e(r1, r9)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            goto L5e
        L52:
            r9 = move-exception
            r10 = r4
            r4 = r5
            goto Lac
        L57:
            r9 = move-exception
            goto L6c
        L59:
            r5.write(r2, r9, r6)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L57 java.io.FileNotFoundException -> L6f
            goto L22
        L5d:
            r3 = 0
        L5e:
            r5.close()     // Catch: java.io.IOException -> L62
            goto L66
        L62:
            r9 = move-exception
            com.huawei.hms.common.util.Logger.e(r1, r0, r9)
        L66:
            r4.close()     // Catch: java.io.IOException -> L6a
            goto La7
        L6a:
            r9 = move-exception
            goto La4
        L6c:
            r10 = r4
            r4 = r5
            goto L79
        L6f:
            r9 = r4
            r4 = r5
            goto L8f
        L72:
            r9 = move-exception
            goto L76
        L74:
            r9 = move-exception
            goto L78
        L76:
            r10 = r4
            goto Lac
        L78:
            r10 = r4
        L79:
            com.huawei.hms.common.util.Logger.e(r1, r0, r9)     // Catch: java.lang.Throwable -> L8c
            if (r4 == 0) goto L86
            r4.close()     // Catch: java.io.IOException -> L82
            goto L86
        L82:
            r9 = move-exception
            com.huawei.hms.common.util.Logger.e(r1, r0, r9)
        L86:
            if (r10 == 0) goto La7
            r10.close()     // Catch: java.io.IOException -> L6a
            goto La7
        L8c:
            r9 = move-exception
            goto Lac
        L8e:
            r9 = r4
        L8f:
            java.lang.String r10 = "FileNotFoundException"
            com.huawei.hms.common.util.Logger.e(r1, r10)     // Catch: java.lang.Throwable -> La8
            if (r4 == 0) goto L9e
            r4.close()     // Catch: java.io.IOException -> L9a
            goto L9e
        L9a:
            r10 = move-exception
            com.huawei.hms.common.util.Logger.e(r1, r0, r10)
        L9e:
            if (r9 == 0) goto La7
            r9.close()     // Catch: java.io.IOException -> L6a
            goto La7
        La4:
            com.huawei.hms.common.util.Logger.e(r1, r0, r9)
        La7:
            return r3
        La8:
            r10 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        Lac:
            if (r4 == 0) goto Lb6
            r4.close()     // Catch: java.io.IOException -> Lb2
            goto Lb6
        Lb2:
            r11 = move-exception
            com.huawei.hms.common.util.Logger.e(r1, r0, r11)
        Lb6:
            if (r10 == 0) goto Lc0
            r10.close()     // Catch: java.io.IOException -> Lbc
            goto Lc0
        Lbc:
            r10 = move-exception
            com.huawei.hms.common.util.Logger.e(r1, r0, r10)
        Lc0:
            throw r9
    }

    public static boolean d(android.content.Context r4, java.lang.String r5) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            r2 = 1
            java.lang.String r3 = "ExtractNativeUtils"
            if (r0 > r1) goto Lf
            java.lang.String r4 = "The android version is below android 6."
            com.huawei.hms.common.util.Logger.i(r3, r4)
            return r2
        Lf:
            android.content.pm.PackageManager r4 = r4.getPackageManager()     // Catch: java.lang.Exception -> L2f
            r0 = 128(0x80, float:1.8E-43)
            android.content.pm.PackageInfo r4 = r4.getPackageArchiveInfo(r5, r0)     // Catch: java.lang.Exception -> L2f
            android.content.pm.ApplicationInfo r4 = r4.applicationInfo     // Catch: java.lang.Exception -> L2f
            int r4 = r4.flags     // Catch: java.lang.Exception -> L2f
            r5 = 268435456(0x10000000, float:2.524355E-29)
            r4 = r4 & r5
            if (r4 != r5) goto L28
            java.lang.String r4 = "The extract-native-flag has set, need to extract."
            com.huawei.hms.common.util.Logger.i(r3, r4)     // Catch: java.lang.Exception -> L2f
            return r2
        L28:
            java.lang.String r4 = "The extract-native-flag has not set, No need to extract."
            com.huawei.hms.common.util.Logger.i(r3, r4)     // Catch: java.lang.Exception -> L2f
            r4 = 0
            return r4
        L2f:
            java.lang.String r4 = "Get package name failed: name not found."
            com.huawei.hms.common.util.Logger.w(r3, r4)
            return r2
    }
}

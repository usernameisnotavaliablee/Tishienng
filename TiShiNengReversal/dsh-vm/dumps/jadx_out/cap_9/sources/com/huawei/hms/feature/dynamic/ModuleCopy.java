package com.huawei.hms.feature.dynamic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ModuleCopy {
    public static final java.lang.String a = "ModuleCopy";
    public static final int b = 2048;
    public static final int c = 0;
    public static final int d = 1;
    public static final java.lang.String e = "module_uri_path";
    public static final java.lang.String f = "loader_uri_path";
    public static final java.lang.String g = "dynamic_modules";
    public static final java.lang.String h = ".apk";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String a;

        public a(java.lang.String r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r2 = this;
                java.lang.String r0 = r2.a     // Catch: java.lang.SecurityException -> L6
                com.huawei.hms.feature.dynamic.ModuleCopy.a(r0)     // Catch: java.lang.SecurityException -> L6
                return
            L6:
                java.lang.String r0 = "ModuleCopy"
                java.lang.String r1 = "Delete file failed: SecurityException."
                com.huawei.hms.common.util.Logger.w(r0, r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements java.lang.Runnable {
        public final /* synthetic */ java.lang.String[] a;
        public final /* synthetic */ int b;
        public final /* synthetic */ java.lang.String c;

        public b(java.lang.String[] r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r6 = this;
                java.lang.String[] r0 = r6.a
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L49
                r3 = r0[r2]
                int r4 = java.lang.Integer.parseInt(r3)
                int r5 = r6.b
                if (r4 >= r5) goto L46
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "Delete low version:"
                r4.append(r5)
                int r5 = r6.b
                r4.append(r5)
                java.lang.String r5 = " in modulePath."
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                java.lang.String r5 = "ModuleCopy"
                com.huawei.hms.common.util.Logger.i(r5, r4)
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = r6.c
                r4.append(r5)
                java.lang.String r5 = java.io.File.separator
                r4.append(r5)
                r4.append(r3)
                java.lang.String r3 = r4.toString()
                com.huawei.hms.feature.dynamic.ModuleCopy.a(r3)
            L46:
                int r2 = r2 + 1
                goto L4
            L49:
                return
        }
    }

    public ModuleCopy() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int a(java.lang.String[] r4) {
            r0 = 0
            if (r4 == 0) goto L19
            int r1 = r4.length
            if (r1 != 0) goto L7
            goto L19
        L7:
            int r1 = r4.length
            r2 = 0
        L9:
            if (r0 >= r1) goto L18
            r3 = r4[r0]
            int r3 = java.lang.Integer.parseInt(r3)
            int r2 = java.lang.Math.max(r3, r2)
            int r0 = r0 + 1
            goto L9
        L18:
            return r2
        L19:
            java.lang.String r4 = "ModuleCopy"
            java.lang.String r1 = "No version dirs in module path, need mkdir."
            com.huawei.hms.common.util.Logger.i(r4, r1)
            return r0
    }

    public static java.lang.String a(android.content.Context r7, android.os.Bundle r8, int r9, android.net.Uri r10) {
            java.lang.String r0 = "ModuleCopy"
            java.lang.String r1 = ".apk"
            if (r9 != 0) goto L2a
            java.lang.String r9 = "module_name"
            java.lang.String r2 = r8.getString(r9)
            java.lang.String r3 = "module_version"
            int r3 = r8.getInt(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
        L1b:
            java.lang.String r8 = r8.getString(r9)
            r4.append(r8)
            r4.append(r1)
            java.lang.String r8 = r4.toString()
            goto L40
        L2a:
            java.lang.String r9 = "loader_name"
            java.lang.String r2 = r8.getString(r9)
            java.lang.String r3 = "loader_version"
            int r3 = r8.getInt(r3)
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            goto L1b
        L40:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lc8
            r9.<init>()     // Catch: java.io.IOException -> Lc8
            java.lang.String r1 = getProtectedPath(r7)     // Catch: java.io.IOException -> Lc8
            r9.append(r1)     // Catch: java.io.IOException -> Lc8
            java.lang.String r1 = java.io.File.separator     // Catch: java.io.IOException -> Lc8
            r9.append(r1)     // Catch: java.io.IOException -> Lc8
            java.lang.String r4 = "dynamic_modules"
            r9.append(r4)     // Catch: java.io.IOException -> Lc8
            r9.append(r1)     // Catch: java.io.IOException -> Lc8
            r9.append(r2)     // Catch: java.io.IOException -> Lc8
            java.lang.String r9 = r9.toString()     // Catch: java.io.IOException -> Lc8
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r9)
            r2.append(r1)
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r2)
            r4.append(r1)
            r4.append(r8)
            java.lang.String r4 = r4.toString()
            java.io.File r5 = new java.io.File
            r5.<init>(r9)
            boolean r5 = r5.exists()
            if (r5 != 0) goto L94
            java.lang.String r7 = a(r7, r2, r10, r4)
            return r7
        L94:
            java.io.File r5 = new java.io.File
            r5.<init>(r9)
            java.lang.String[] r5 = r5.list()
            int r6 = a(r5)
            int r3 = java.lang.Integer.parseInt(r3)
            if (r6 >= r3) goto Lac
            java.lang.String r7 = a(r7, r2, r10, r4)
            return r7
        Lac:
            clearLowVersionModule(r6, r9, r5, r0)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            r7.append(r9)
            r7.append(r1)
            r7.append(r6)
            r7.append(r1)
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            return r7
        Lc8:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "request modulePath error: "
            r8.append(r9)
            java.lang.String r7 = r7.getMessage()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.huawei.hms.common.util.Logger.w(r0, r7)
            r7 = 0
            return r7
    }

    public static java.lang.String a(android.content.Context r2, java.lang.String r3, android.net.Uri r4, java.lang.String r5) {
            boolean r3 = makeDirectory(r3)
            r0 = 0
            java.lang.String r1 = "ModuleCopy"
            if (r3 != 0) goto Lf
            java.lang.String r2 = "makeDirectory return false"
            com.huawei.hms.common.util.Logger.e(r1, r2)
            return r0
        Lf:
            a(r2, r4, r5)
            boolean r2 = com.huawei.hms.feature.dynamic.f.d.b(r2, r5)
            if (r2 != 0) goto L21
            java.lang.String r2 = "The coped module apk is invalid."
            com.huawei.hms.common.util.Logger.w(r1, r2)
            b(r5)
            return r0
        L21:
            return r5
    }

    public static void a(android.content.Context r3, android.net.Uri r4, java.lang.String r5) {
            java.lang.String r0 = "ModuleCopy"
            r1 = 0
            android.content.ContentResolver r3 = r3.getContentResolver()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L55
            java.io.InputStream r3 = r3.openInputStream(r4)     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L51 java.io.FileNotFoundException -> L55
            if (r3 != 0) goto L20
            java.lang.String r4 = "Get input stream failed: null."
            com.huawei.hms.common.util.Logger.w(r0, r4)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b java.io.FileNotFoundException -> L1d
            closeQuietly(r3)
            closeQuietly(r1)
            return
        L19:
            r4 = move-exception
            goto L59
        L1b:
            r4 = move-exception
            goto L5b
        L1d:
            r4 = move-exception
            goto L73
        L20:
            java.io.BufferedOutputStream r4 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b java.io.FileNotFoundException -> L1d
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b java.io.FileNotFoundException -> L1d
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b java.io.FileNotFoundException -> L1d
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b java.io.FileNotFoundException -> L1d
            r5 = 2048(0x800, float:2.87E-42)
            byte[] r5 = new byte[r5]     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3d java.io.FileNotFoundException -> L3f
        L2e:
            int r1 = r3.read(r5)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3d java.io.FileNotFoundException -> L3f
            r2 = -1
            if (r1 == r2) goto L41
            r2 = 0
            r4.write(r5, r2, r1)     // Catch: java.lang.Throwable -> L3a java.io.IOException -> L3d java.io.FileNotFoundException -> L3f
            goto L2e
        L3a:
            r5 = move-exception
            r1 = r4
            goto L8c
        L3d:
            r5 = move-exception
            goto L48
        L3f:
            r5 = move-exception
            goto L4b
        L41:
            closeQuietly(r3)
            closeQuietly(r4)
            return
        L48:
            r1 = r4
            r4 = r5
            goto L5b
        L4b:
            r1 = r4
            r4 = r5
            goto L73
        L4e:
            r4 = move-exception
            r3 = r1
            goto L59
        L51:
            r3 = move-exception
            r4 = r3
            r3 = r1
            goto L5b
        L55:
            r3 = move-exception
            r4 = r3
            r3 = r1
            goto L73
        L59:
            r5 = r4
            goto L8c
        L5b:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r5.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "IOException "
            r5.append(r2)     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L71
        L69:
            r5.append(r4)     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = r5.toString()     // Catch: java.lang.Throwable -> L71
            goto L82
        L71:
            r5 = move-exception
            goto L8c
        L73:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L71
            r5.<init>()     // Catch: java.lang.Throwable -> L71
            java.lang.String r2 = "FileNotFoundException:"
            r5.append(r2)     // Catch: java.lang.Throwable -> L71
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Throwable -> L71
            goto L69
        L82:
            com.huawei.hms.common.util.Logger.e(r0, r4)     // Catch: java.lang.Throwable -> L71
            closeQuietly(r3)
            closeQuietly(r1)
            return
        L8c:
            closeQuietly(r3)
            closeQuietly(r1)
            throw r5
    }

    public static void a(android.content.Context r3, android.os.Bundle r4, int r5) {
            if (r5 != 0) goto L9
            java.lang.String r0 = "module_uri_path"
        L4:
            java.lang.String r0 = r4.getString(r0)
            goto Lc
        L9:
            java.lang.String r0 = "loader_uri_path"
            goto L4
        Lc:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "path:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "ModuleCopy"
            com.huawei.hms.common.util.Logger.i(r2, r1)
            android.net.Uri r0 = android.net.Uri.parse(r0)
            java.lang.String r3 = a(r3, r4, r5, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L36
            java.lang.String r3 = "checkModulePath failed: null."
            com.huawei.hms.common.util.Logger.w(r2, r3)
            return
        L36:
            if (r5 != 0) goto L3e
            java.lang.String r5 = "module_path"
            r4.putString(r5, r3)
            return
        L3e:
            java.lang.String r5 = "loader_path"
            r4.putString(r5, r3)
            return
    }

    public static boolean a(android.os.Bundle r2) {
            java.lang.String r0 = "module_path"
            java.lang.String r0 = r2.getString(r0)
            java.lang.String r1 = "loader_path"
            java.lang.String r2 = r2.getString(r1)
            boolean r2 = android.text.TextUtils.equals(r0, r2)
            return r2
    }

    public static /* synthetic */ boolean a(java.lang.String r0) {
            boolean r0 = c(r0)
            return r0
    }

    public static void b(java.lang.String r2) {
            r0 = 1
            java.lang.String r1 = "DeleteFile"
            java.util.concurrent.ExecutorService r0 = com.huawei.hms.feature.dynamic.c.a(r0, r1)
            com.huawei.hms.feature.dynamic.ModuleCopy$a r1 = new com.huawei.hms.feature.dynamic.ModuleCopy$a
            r1.<init>(r2)
            r0.execute(r1)
            return
    }

    public static boolean c(java.lang.String r9) {
            java.io.File r0 = new java.io.File
            r0.<init>(r9)
            boolean r1 = r0.isDirectory()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L40
            java.lang.String[] r1 = r0.list()
            if (r1 == 0) goto L40
            java.lang.String[] r1 = r0.list()
            int r4 = r1.length
            r5 = 0
            r6 = 1
        L1a:
            if (r5 >= r4) goto L41
            r7 = r1[r5]
            if (r6 == 0) goto L3c
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r9)
            java.lang.String r8 = java.io.File.separator
            r6.append(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            boolean r6 = c(r6)
            if (r6 == 0) goto L3c
            r6 = 1
            goto L3d
        L3c:
            r6 = 0
        L3d:
            int r5 = r5 + 1
            goto L1a
        L40:
            r6 = 1
        L41:
            if (r6 == 0) goto L4a
            boolean r9 = r0.delete()
            if (r9 == 0) goto L4a
            return r3
        L4a:
            return r2
    }

    public static void clearLowVersionModule(int r1, java.lang.String r2, java.lang.String[] r3, java.lang.String r4) {
            r0 = 1
            java.util.concurrent.ExecutorService r4 = com.huawei.hms.feature.dynamic.c.a(r0, r4)
            com.huawei.hms.feature.dynamic.ModuleCopy$b r0 = new com.huawei.hms.feature.dynamic.ModuleCopy$b
            r0.<init>(r3, r1, r2)
            r4.execute(r0)
            return
    }

    public static void closeQuietly(java.io.Closeable r1) {
            if (r1 == 0) goto Ld
            r1.close()     // Catch: java.io.IOException -> L6
            return
        L6:
            java.lang.String r1 = "ModuleCopy"
            java.lang.String r0 = "An exception occurred while closing the 'Closeable' object."
            com.huawei.hms.common.util.Logger.e(r1, r0)
        Ld:
            return
    }

    public static void copyModule(android.content.Context r2, android.os.Bundle r3) {
            if (r2 == 0) goto L20
            if (r3 != 0) goto L5
            goto L20
        L5:
            boolean r0 = a(r3)
            r1 = 0
            a(r2, r3, r1)
            if (r0 == 0) goto L1b
            java.lang.String r2 = "module_path"
            java.lang.String r2 = r3.getString(r2)
            java.lang.String r0 = "loader_path"
            r3.putString(r0, r2)
            return
        L1b:
            r0 = 1
            a(r2, r3, r0)
            return
        L20:
            java.lang.String r2 = "ModuleCopy"
            java.lang.String r3 = "The context or module info bundle is null."
            com.huawei.hms.common.util.Logger.e(r2, r3)
            return
    }

    public static java.lang.String getProtectedPath(android.content.Context r2) throws java.io.IOException {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L13
            android.content.Context r2 = androidx.profileinstaller.a.a(r2)
            java.io.File r2 = l1.a.a(r2)
            java.lang.String r2 = r2.getCanonicalPath()
            return r2
        L13:
            java.io.File r2 = r2.getFilesDir()
            java.lang.String r2 = r2.getCanonicalPath()
            java.lang.String r0 = java.io.File.separator
            int r0 = r2.lastIndexOf(r0)
            if (r0 > 0) goto L24
            return r2
        L24:
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            return r2
    }

    public static boolean isLocalModuleFile(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L33
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto La
            goto L33
        La:
            java.io.File r1 = new java.io.File     // Catch: java.io.IOException -> L32
            r1.<init>(r3)     // Catch: java.io.IOException -> L32
            java.lang.String r3 = r1.getCanonicalPath()     // Catch: java.io.IOException -> L32
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L32
            r1.<init>()     // Catch: java.io.IOException -> L32
            java.lang.String r2 = getProtectedPath(r2)     // Catch: java.io.IOException -> L32
            r1.append(r2)     // Catch: java.io.IOException -> L32
            java.lang.String r2 = java.io.File.separator     // Catch: java.io.IOException -> L32
            r1.append(r2)     // Catch: java.io.IOException -> L32
            java.lang.String r2 = "dynamic_modules"
            r1.append(r2)     // Catch: java.io.IOException -> L32
            java.lang.String r2 = r1.toString()     // Catch: java.io.IOException -> L32
            boolean r2 = r3.startsWith(r2)     // Catch: java.io.IOException -> L32
            return r2
        L32:
            return r0
        L33:
            java.lang.String r2 = "ModuleCopy"
            java.lang.String r3 = "context or filePath is null."
            com.huawei.hms.common.util.Logger.w(r2, r3)
            return r0
    }

    public static boolean makeDirectory(java.lang.String r2) {
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L12
            r0.<init>(r2)     // Catch: java.lang.Exception -> L12
            boolean r2 = r0.exists()     // Catch: java.lang.Exception -> L12
            if (r2 == 0) goto Ld
            r2 = 1
            return r2
        Ld:
            boolean r2 = r0.mkdirs()     // Catch: java.lang.Exception -> L12
            return r2
        L12:
            r2 = move-exception
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "makeDirectory Exception: "
            r0.append(r1)
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            java.lang.String r0 = "ModuleCopy"
            com.huawei.hms.common.util.Logger.e(r0, r2)
            r2 = 0
            return r2
    }

    public static java.lang.String trimLastSection(java.lang.String r2) {
            java.lang.String r0 = java.io.File.separator
            int r0 = r2.lastIndexOf(r0)
            if (r0 > 0) goto L9
            return r2
        L9:
            r1 = 0
            java.lang.String r2 = r2.substring(r1, r0)
            return r2
    }
}

package com.baidu.vis.unified.license;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class LicenseReaderUtils {
    public static final java.lang.String TAG = "License-SDK";

    LicenseReaderUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String getSuccessInfo(android.content.Context r2, java.lang.String r3) {
            r0 = 0
            if (r2 == 0) goto L2d
            boolean r1 = android.text.TextUtils.isEmpty(r3)
            if (r1 == 0) goto La
            goto L2d
        La:
            java.io.FileInputStream r2 = read_license_from_data(r2, r3)
            if (r2 == 0) goto L2d
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L22 java.lang.Exception -> L24
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L22 java.lang.Exception -> L24
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L22 java.lang.Exception -> L24
            r1.<init>(r3)     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L22 java.lang.Exception -> L24
            java.lang.String r0 = r1.readLine()     // Catch: java.lang.Throwable -> L1e java.lang.Throwable -> L22 java.lang.Exception -> L24
        L1e:
            r2.close()     // Catch: java.io.IOException -> L2d
            goto L2d
        L22:
            r3 = move-exception
            goto L29
        L24:
            r3 = move-exception
            r3.getMessage()     // Catch: java.lang.Throwable -> L22
            goto L1e
        L29:
            r2.close()     // Catch: java.io.IOException -> L2c
        L2c:
            throw r3
        L2d:
            return r0
    }

    public static java.io.InputStream get_local_license_file_inputstream(android.content.Context r1, java.lang.String r2, com.baidu.vis.unified.license.ReadStatusCode r3) {
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            r0 = 0
            r3.is_from_asset = r0
            java.lang.String r0 = "/"
            boolean r0 = r2.startsWith(r0)
            if (r0 == 0) goto L14
            java.io.FileInputStream r0 = read_license_from_system_path(r2)
            goto L18
        L14:
            java.io.FileInputStream r0 = read_license_from_data(r1, r2)
        L18:
            if (r0 != 0) goto L22
            java.io.InputStream r1 = read_license_from_asset(r1, r2)
            r2 = 1
            r3.is_from_asset = r2
            return r1
        L22:
            return r0
    }

    private static java.util.ArrayList<java.lang.String> read_license_content(java.io.InputStream r2) throws java.io.IOException {
            java.io.InputStreamReader r0 = new java.io.InputStreamReader
            r0.<init>(r2)
            java.io.BufferedReader r2 = new java.io.BufferedReader
            r2.<init>(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        Lf:
            java.lang.String r1 = r2.readLine()
            if (r1 == 0) goto L19
            r0.add(r1)
            goto Lf
        L19:
            return r0
    }

    private static java.io.InputStream read_license_from_asset(android.content.Context r1, java.lang.String r2) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            android.content.res.AssetManager r1 = r1.getAssets()     // Catch: java.lang.Exception -> Ld java.io.IOException -> L11
            java.io.InputStream r1 = r1.open(r2)     // Catch: java.lang.Exception -> Ld java.io.IOException -> L11
            return r1
        Ld:
            r1 = move-exception
            r1.getMessage()
        L11:
            return r0
    }

    private static java.io.FileInputStream read_license_from_data(android.content.Context r5, java.lang.String r6) {
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            r1 = 0
            java.io.File r5 = r5.getDir(r6, r1)     // Catch: java.lang.Exception -> L29 java.io.FileNotFoundException -> L2f
            if (r5 == 0) goto L2b
            boolean r6 = r5.exists()     // Catch: java.lang.Exception -> L29 java.io.FileNotFoundException -> L2f
            if (r6 == 0) goto L2b
            boolean r6 = r5.isFile()     // Catch: java.lang.Exception -> L29 java.io.FileNotFoundException -> L2f
            if (r6 != 0) goto L18
            goto L2b
        L18:
            long r1 = r5.length()     // Catch: java.lang.Exception -> L29 java.io.FileNotFoundException -> L2f
            r3 = 0
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 != 0) goto L23
            return r0
        L23:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L29 java.io.FileNotFoundException -> L2f
            r6.<init>(r5)     // Catch: java.lang.Exception -> L29 java.io.FileNotFoundException -> L2f
            return r6
        L29:
            r5 = move-exception
            goto L2c
        L2b:
            return r0
        L2c:
            r5.getMessage()
        L2f:
            return r0
    }

    private static java.io.FileInputStream read_license_from_system_path(java.lang.String r2) {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> Lb
            java.io.File r1 = new java.io.File     // Catch: java.io.FileNotFoundException -> Lb
            r1.<init>(r2)     // Catch: java.io.FileNotFoundException -> Lb
            r0.<init>(r1)     // Catch: java.io.FileNotFoundException -> Lb
            return r0
        Lb:
            r2 = 0
            return r2
    }

    public static int setSuccessInfo(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            r0 = -1
            if (r3 == 0) goto L60
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L60
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L10
            goto L60
        L10:
            r1 = 0
            java.io.File r3 = r3.getDir(r4, r1)
            if (r3 == 0) goto L20
            boolean r4 = r3.exists()
            if (r4 == 0) goto L20
            r3.delete()
        L20:
            if (r3 == 0) goto L2b
            boolean r4 = r3.exists()
            if (r4 != 0) goto L2b
            r3.createNewFile()     // Catch: java.io.IOException -> L2b
        L2b:
            r4 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L4d java.io.FileNotFoundException -> L4f
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L4d java.io.FileNotFoundException -> L4f
            byte[] r3 = r5.getBytes()     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L45 java.io.FileNotFoundException -> L48
            r2.write(r3)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L45 java.io.FileNotFoundException -> L48
            r3 = 10
            r2.write(r3)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L45 java.io.FileNotFoundException -> L48
            r2.close()     // Catch: java.io.IOException -> L60
            r0 = 0
            goto L60
        L42:
            r3 = move-exception
            r4 = r2
            goto L51
        L45:
            r4 = r2
            goto L57
        L48:
            r4 = r2
            goto L5d
        L4b:
            r3 = move-exception
            goto L51
        L4d:
            goto L57
        L4f:
            goto L5d
        L51:
            if (r4 == 0) goto L56
            r4.close()     // Catch: java.io.IOException -> L56
        L56:
            throw r3
        L57:
            if (r4 == 0) goto L60
        L59:
            r4.close()     // Catch: java.io.IOException -> L60
            goto L60
        L5d:
            if (r4 == 0) goto L60
            goto L59
        L60:
            return r0
    }

    public static boolean write_license_content(android.content.Context r2, java.lang.String r3, java.util.ArrayList<java.lang.String> r4) {
            r0 = 0
            if (r4 == 0) goto L6d
            int r1 = r4.size()
            if (r1 == 0) goto L6d
            if (r2 != 0) goto Ld
            goto L6d
        Ld:
            java.io.File r2 = r2.getDir(r3, r0)
            if (r2 == 0) goto L1c
            boolean r3 = r2.exists()
            if (r3 == 0) goto L1c
            r2.delete()
        L1c:
            if (r2 == 0) goto L27
            boolean r3 = r2.exists()
            if (r3 != 0) goto L27
            r2.createNewFile()     // Catch: java.io.IOException -> L27
        L27:
            r3 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a java.io.FileNotFoundException -> L5c
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5a java.io.FileNotFoundException -> L5c
            java.util.Iterator r2 = r4.iterator()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d java.io.FileNotFoundException -> L50
        L31:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d java.io.FileNotFoundException -> L50
            if (r3 == 0) goto L53
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d java.io.FileNotFoundException -> L50
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d java.io.FileNotFoundException -> L50
            byte[] r3 = r3.getBytes()     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d java.io.FileNotFoundException -> L50
            r1.write(r3)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d java.io.FileNotFoundException -> L50
            r3 = 10
            r1.write(r3)     // Catch: java.lang.Throwable -> L4a java.io.IOException -> L4d java.io.FileNotFoundException -> L50
            goto L31
        L4a:
            r2 = move-exception
            r3 = r1
            goto L5e
        L4d:
            r3 = r1
            goto L64
        L50:
            r3 = r1
            goto L6a
        L53:
            r1.close()     // Catch: java.io.IOException -> L6d
            r0 = 1
            goto L6d
        L58:
            r2 = move-exception
            goto L5e
        L5a:
            goto L64
        L5c:
            goto L6a
        L5e:
            if (r3 == 0) goto L63
            r3.close()     // Catch: java.io.IOException -> L63
        L63:
            throw r2
        L64:
            if (r3 == 0) goto L6d
        L66:
            r3.close()     // Catch: java.io.IOException -> L6d
            goto L6d
        L6a:
            if (r3 == 0) goto L6d
            goto L66
        L6d:
            return r0
    }
}

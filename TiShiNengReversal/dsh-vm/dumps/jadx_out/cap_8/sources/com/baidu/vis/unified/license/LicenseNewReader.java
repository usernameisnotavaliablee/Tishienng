package com.baidu.vis.unified.license;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class LicenseNewReader {
    public static final java.lang.String TAG = "License-SDK";

    LicenseNewReader() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.baidu.vis.unified.license.HttpStatus httpPostRequest(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            java.lang.String r3 = ""
            boolean r0 = r3.equals(r5)     // Catch: java.lang.Exception -> L31
            if (r0 != 0) goto L28
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L31
            r3.<init>(r5)     // Catch: java.lang.Exception -> L31
            java.lang.String r5 = "sdk_v"
            java.lang.String r5 = r3.getString(r5)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = "query"
            java.lang.String r3 = r3.getString(r0)     // Catch: java.lang.Exception -> L31
            java.lang.String r0 = "sdk_v=%s&query=%s"
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L31
            r2 = 0
            r1[r2] = r5     // Catch: java.lang.Exception -> L31
            r5 = 1
            r1[r5] = r3     // Catch: java.lang.Exception -> L31
            java.lang.String r3 = java.lang.String.format(r0, r1)     // Catch: java.lang.Exception -> L31
        L28:
            java.lang.String r5 = "application/x-www-form-urlencoded"
            java.lang.String r0 = "License-SDK"
            com.baidu.vis.unified.license.HttpStatus r3 = com.baidu.vis.unified.license.HttpUtils.requestPost(r4, r3, r5, r0)     // Catch: java.lang.Exception -> L31
            return r3
        L31:
            r3 = move-exception
            r3.getMessage()
            r3 = 0
            return r3
    }

    public static int readFile(android.content.Context r7, java.lang.String r8, java.util.ArrayList<java.lang.String> r9) {
            r0 = -1
            if (r7 == 0) goto L86
            if (r8 == 0) goto L86
            if (r9 != 0) goto L9
            goto L86
        L9:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            com.baidu.vis.unified.license.ReadStatusCode r2 = new com.baidu.vis.unified.license.ReadStatusCode
            r2.<init>()
            r3 = 0
            r2.is_from_asset = r3
            r3 = -2
            r4 = 0
            java.io.InputStream r4 = com.baidu.vis.unified.license.LicenseReaderUtils.get_local_license_file_inputstream(r7, r8, r2)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            if (r4 != 0) goto L24
            if (r4 == 0) goto L23
            r4.close()     // Catch: java.io.IOException -> L23
        L23:
            return r0
        L24:
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            r5.<init>(r4)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
        L2e:
            java.lang.String r5 = r6.readLine()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            if (r5 == 0) goto L40
            r1.add(r5)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L3a java.io.IOException -> L3c java.io.FileNotFoundException -> L3e
            goto L2e
        L38:
            r7 = move-exception
            goto L75
        L3a:
            r7 = move-exception
            goto L6c
        L3c:
            goto L7b
        L3e:
            goto L81
        L40:
            r4.close()     // Catch: java.io.IOException -> L44
            goto L45
        L44:
        L45:
            int r0 = r1.size()
            if (r0 <= 0) goto L67
            boolean r0 = r2.is_from_asset
            r2 = 1
            if (r0 != r2) goto L53
            com.baidu.vis.unified.license.LicenseReaderUtils.write_license_content(r7, r8, r1)
        L53:
            java.util.Iterator r7 = r1.iterator()
        L57:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L67
            java.lang.Object r8 = r7.next()
            java.lang.String r8 = (java.lang.String) r8
            r9.add(r8)
            goto L57
        L67:
            int r7 = r1.size()
            return r7
        L6c:
            r7.getMessage()     // Catch: java.lang.Throwable -> L38
            if (r4 == 0) goto L74
            r4.close()     // Catch: java.io.IOException -> L74
        L74:
            return r3
        L75:
            if (r4 == 0) goto L7a
            r4.close()     // Catch: java.io.IOException -> L7a
        L7a:
            throw r7
        L7b:
            if (r4 == 0) goto L80
            r4.close()     // Catch: java.io.IOException -> L80
        L80:
            return r3
        L81:
            if (r4 == 0) goto L86
            r4.close()     // Catch: java.io.IOException -> L86
        L86:
            return r0
    }

    public static int writeFile(android.content.Context r3, java.lang.String r4, java.lang.String r5) {
            r0 = -1
            if (r3 == 0) goto L6a
            if (r4 == 0) goto L6a
            if (r5 != 0) goto L9
            goto L6a
        L9:
            java.lang.String r1 = "/"
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L17
            java.io.File r3 = new java.io.File
            r3.<init>(r4)
            goto L1f
        L17:
            r1 = 0
            java.io.File r3 = r3.getDir(r4, r1)
            r3.getAbsolutePath()
        L1f:
            r3.delete()
            boolean r4 = r3.exists()
            r1 = -2
            if (r4 != 0) goto L2e
            r3.createNewFile()     // Catch: java.io.IOException -> L2d
            goto L2e
        L2d:
            return r1
        L2e:
            r4 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50 java.io.IOException -> L52 java.io.FileNotFoundException -> L54
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L50 java.io.IOException -> L52 java.io.FileNotFoundException -> L54
            byte[] r3 = r5.getBytes()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45 java.io.IOException -> L48 java.io.FileNotFoundException -> L4b
            r2.write(r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L45 java.io.IOException -> L48 java.io.FileNotFoundException -> L4b
            r3 = 1
            r2.close()     // Catch: java.io.IOException -> L40
            return r3
        L40:
            r0 = -2
            goto L6a
        L42:
            r3 = move-exception
            r4 = r2
            goto L56
        L45:
            r4 = r2
            goto L5c
        L48:
            r4 = r2
            goto L62
        L4b:
            r4 = r2
            goto L65
        L4e:
            r3 = move-exception
            goto L56
        L50:
            goto L5c
        L52:
            goto L62
        L54:
            goto L65
        L56:
            if (r4 == 0) goto L5b
            r4.close()     // Catch: java.io.IOException -> L5b
        L5b:
            throw r3
        L5c:
            if (r4 == 0) goto L40
        L5e:
            r4.close()     // Catch: java.io.IOException -> L40
            goto L40
        L62:
            if (r4 == 0) goto L40
            goto L5e
        L65:
            if (r4 == 0) goto L6a
            r4.close()     // Catch: java.io.IOException -> L40
        L6a:
            return r0
    }
}

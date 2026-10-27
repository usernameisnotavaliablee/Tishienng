package com.amap.api.col.p0003l;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class a1 {
    public a1() {
            r1 = this;
            r1.<init>()
            return
    }

    public static long a() {
            java.lang.String r0 = android.os.Environment.getExternalStorageState()
            java.lang.String r1 = "mounted"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L26
            java.io.File r0 = android.os.Environment.getExternalStorageDirectory()
            android.os.StatFs r1 = new android.os.StatFs
            java.lang.String r0 = r0.getPath()
            r1.<init>(r0)
            int r0 = r1.getBlockSize()
            long r2 = (long) r0
            int r0 = r1.getFreeBlocks()
            long r0 = (long) r0
            long r0 = r0 * r2
            return r0
        L26:
            r0 = 0
            return r0
    }

    public static long b(java.io.File r6) {
            boolean r0 = r6.isDirectory()
            if (r0 != 0) goto Lb
            long r0 = r6.length()
            return r0
        Lb:
            java.io.File[] r6 = r6.listFiles()
            r0 = 0
            if (r6 != 0) goto L14
            return r0
        L14:
            int r2 = r6.length
            r3 = 0
        L16:
            if (r3 >= r2) goto L2e
            r4 = r6[r3]
            boolean r5 = r4.isDirectory()
            if (r5 == 0) goto L26
            long r4 = b(r4)
        L24:
            long r0 = r0 + r4
            goto L2b
        L26:
            long r4 = r4.length()
            goto L24
        L2b:
            int r3 = r3 + 1
            goto L16
        L2e:
            return r0
    }

    private static com.amap.api.maps.offlinemap.OfflineMapProvince c(org.json.JSONObject r3) throws org.json.JSONException {
            if (r3 != 0) goto L4
            r3 = 0
            return r3
        L4:
            com.amap.api.maps.offlinemap.OfflineMapProvince r0 = new com.amap.api.maps.offlinemap.OfflineMapProvince
            r0.<init>()
            java.lang.String r1 = "url"
            java.lang.String r1 = e(r3, r1)
            r0.setUrl(r1)
            java.lang.String r1 = "name"
            java.lang.String r1 = e(r3, r1)
            r0.setProvinceName(r1)
            java.lang.String r1 = "jianpin"
            java.lang.String r1 = e(r3, r1)
            r0.setJianpin(r1)
            java.lang.String r1 = "pinyin"
            java.lang.String r1 = e(r3, r1)
            r0.setPinyin(r1)
            java.lang.String r1 = "adcode"
            java.lang.String r1 = e(r3, r1)
            java.lang.String r1 = o(r1)
            r0.setProvinceCode(r1)
            java.lang.String r1 = "version"
            java.lang.String r1 = e(r3, r1)
            r0.setVersion(r1)
            java.lang.String r1 = "size"
            java.lang.String r1 = e(r3, r1)
            long r1 = java.lang.Long.parseLong(r1)
            r0.setSize(r1)
            java.util.ArrayList r3 = j(r3)
            r0.setCityList(r3)
            return r0
    }

    public static java.lang.String d(android.content.Context r1, java.lang.String r2) {
            android.content.res.AssetManager r1 = com.amap.api.col.p0003l.v2.b(r1)     // Catch: java.lang.Throwable -> L12
            java.io.InputStream r1 = r1.open(r2)     // Catch: java.lang.Throwable -> L12
            java.util.zip.GZIPInputStream r2 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L12
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r1 = com.amap.api.col.p0003l.b3.x(r2)     // Catch: java.lang.Throwable -> L12
            return r1
        L12:
            r1 = move-exception
            java.lang.String r2 = "MapDownloadManager"
            java.lang.String r0 = "readOfflineAsset"
            com.amap.api.col.p0003l.w5.p(r1, r2, r0)
            r1 = 0
            return r1
    }

    private static java.lang.String e(org.json.JSONObject r3, java.lang.String r4) throws org.json.JSONException {
            java.lang.String r0 = ""
            if (r3 != 0) goto L5
            return r0
        L5:
            boolean r1 = r3.has(r4)
            if (r1 == 0) goto L20
            java.lang.String r1 = "[]"
            java.lang.String r2 = r3.getString(r4)
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L20
            java.lang.String r3 = r3.optString(r4)
            java.lang.String r3 = r3.trim()
            return r3
        L20:
            return r0
    }

    public static java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> f(java.lang.String r1, android.content.Context r2) throws org.json.JSONException {
            if (r1 == 0) goto L15
            java.lang.String r0 = ""
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto L15
        Lb:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r1)
            java.util.List r1 = g(r0, r2)
            return r1
        L15:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
    }

    public static java.util.List<com.amap.api.maps.offlinemap.OfflineMapProvince> g(org.json.JSONObject r5, android.content.Context r6) throws org.json.JSONException {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.lang.String r1 = "result"
            boolean r2 = r5.has(r1)
            java.lang.String r3 = "offlinemap_with_province_vfour"
            if (r2 != 0) goto L3a
            org.json.JSONObject r2 = new org.json.JSONObject
            r2.<init>()
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: org.json.JSONException -> L2c
            r4.<init>()     // Catch: org.json.JSONException -> L2c
            org.json.JSONObject r4 = r4.put(r3, r5)     // Catch: org.json.JSONException -> L2c
            r2.put(r1, r4)     // Catch: org.json.JSONException -> L2c
            java.lang.String r4 = r2.toString()     // Catch: org.json.JSONException -> L2c
            p(r4, r6)     // Catch: org.json.JSONException -> L2c
            org.json.JSONObject r6 = r2.optJSONObject(r1)     // Catch: org.json.JSONException -> L2c
            goto L3e
        L2c:
            r6 = move-exception
            org.json.JSONObject r1 = r5.optJSONObject(r1)
            java.lang.String r2 = "Utility"
            java.lang.String r4 = "parseJson"
            com.amap.api.col.p0003l.w5.p(r6, r2, r4)
            r6 = r1
            goto L3e
        L3a:
            org.json.JSONObject r6 = r5.optJSONObject(r1)
        L3e:
            java.lang.String r1 = "offlinemapinfo_with_province"
            if (r6 == 0) goto L4e
            org.json.JSONObject r5 = r6.optJSONObject(r3)
            if (r5 != 0) goto L49
            goto L9a
        L49:
            org.json.JSONObject r5 = r5.optJSONObject(r1)
            goto L52
        L4e:
            org.json.JSONObject r5 = r5.optJSONObject(r1)
        L52:
            if (r5 != 0) goto L55
            goto L9a
        L55:
            java.lang.String r6 = "version"
            boolean r1 = r5.has(r6)
            if (r1 == 0) goto L63
            java.lang.String r6 = e(r5, r6)
            com.amap.api.col.p0003l.c0.r = r6
        L63:
            java.lang.String r6 = "provinces"
            org.json.JSONArray r6 = r5.optJSONArray(r6)
            if (r6 != 0) goto L6c
            goto L9a
        L6c:
            r1 = 0
            r2 = 0
        L6e:
            int r3 = r6.length()
            if (r2 >= r3) goto L84
            org.json.JSONObject r3 = r6.optJSONObject(r2)
            if (r3 == 0) goto L81
            com.amap.api.maps.offlinemap.OfflineMapProvince r3 = c(r3)
            r0.add(r3)
        L81:
            int r2 = r2 + 1
            goto L6e
        L84:
            java.lang.String r6 = "others"
            org.json.JSONArray r5 = r5.optJSONArray(r6)
            if (r5 == 0) goto L97
            int r6 = r5.length()
            if (r6 <= 0) goto L97
            org.json.JSONObject r5 = r5.getJSONObject(r1)
            goto L98
        L97:
            r5 = 0
        L98:
            if (r5 != 0) goto L9b
        L9a:
            return r0
        L9b:
            com.amap.api.maps.offlinemap.OfflineMapProvince r5 = c(r5)
            r0.add(r5)
            return r0
    }

    public static void h(java.lang.String r4) {
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            boolean r4 = r0.exists()
            if (r4 == 0) goto L3d
            boolean r4 = r0.isDirectory()
            if (r4 == 0) goto L3d
            java.io.File[] r4 = r0.listFiles()
            if (r4 != 0) goto L18
            goto L3d
        L18:
            int r0 = r4.length
            r1 = 0
        L1a:
            if (r1 >= r0) goto L3d
            r2 = r4[r1]
            boolean r3 = r2.exists()
            if (r3 == 0) goto L3a
            boolean r3 = r2.isDirectory()
            if (r3 == 0) goto L3a
            java.lang.String[] r3 = r2.list()
            if (r3 != 0) goto L34
            r2.delete()
            goto L3a
        L34:
            int r3 = r3.length
            if (r3 != 0) goto L3a
            r2.delete()
        L3a:
            int r1 = r1 + 1
            goto L1a
        L3d:
            return
    }

    public static java.lang.String i(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L19
            if (r0 != 0) goto L21
            java.lang.String r0 = "/"
            int r0 = r2.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L19
            int r0 = r0 + 1
            java.lang.String r1 = ".zip"
            int r1 = r2.indexOf(r1)     // Catch: java.lang.Throwable -> L19
            java.lang.String r2 = r2.substring(r0, r1)     // Catch: java.lang.Throwable -> L19
            return r2
        L19:
            r2 = move-exception
            java.lang.String r0 = "Utility"
            java.lang.String r1 = "getZipFileNameFromUrl"
            com.amap.api.col.p0003l.w5.p(r2, r0, r1)
        L21:
            r2 = 0
            return r2
    }

    private static java.util.ArrayList<com.amap.api.maps.offlinemap.OfflineMapCity> j(org.json.JSONObject r3) throws org.json.JSONException {
            java.lang.String r0 = "cities"
            org.json.JSONArray r0 = r3.optJSONArray(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r0 != 0) goto Le
            goto L32
        Le:
            int r2 = r0.length()
            if (r2 != 0) goto L1b
            com.amap.api.maps.offlinemap.OfflineMapCity r3 = m(r3)
            r1.add(r3)
        L1b:
            r3 = 0
        L1c:
            int r2 = r0.length()
            if (r3 >= r2) goto L32
            org.json.JSONObject r2 = r0.optJSONObject(r3)
            if (r2 == 0) goto L2f
            com.amap.api.maps.offlinemap.OfflineMapCity r2 = m(r2)
            r1.add(r2)
        L2f:
            int r3 = r3 + 1
            goto L1c
        L32:
            return r1
    }

    public static void k(java.lang.String r5, android.content.Context r6) throws java.io.IOException, java.lang.Exception {
            java.io.File r0 = new java.io.File
            java.lang.String r1 = com.amap.api.col.p0003l.b3.f0(r6)
            r0.<init>(r1)
            java.io.File[] r0 = r0.listFiles()
            if (r0 != 0) goto L10
            return
        L10:
            int r1 = r0.length
            r2 = 0
        L12:
            if (r2 >= r1) goto L2c
            r3 = r0[r2]
            boolean r4 = r3.exists()
            if (r4 == 0) goto L29
            java.lang.String r4 = r3.getName()
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L29
            l(r3)
        L29:
            int r2 = r2 + 1
            goto L12
        L2c:
            java.lang.String r5 = com.amap.api.col.p0003l.b3.f0(r6)
            h(r5)
            return
    }

    public static boolean l(java.io.File r4) throws java.io.IOException, java.lang.Exception {
            r0 = 0
            if (r4 == 0) goto L36
            boolean r1 = r4.exists()
            if (r1 != 0) goto La
            goto L36
        La:
            java.io.File[] r1 = r4.listFiles()
            if (r1 == 0) goto L31
            r2 = 0
        L11:
            int r3 = r1.length
            if (r2 >= r3) goto L31
            r3 = r1[r2]
            boolean r3 = r3.isFile()
            if (r3 == 0) goto L25
            r3 = r1[r2]
            boolean r3 = r3.delete()
            if (r3 != 0) goto L2e
            return r0
        L25:
            r3 = r1[r2]
            boolean r3 = l(r3)
            if (r3 != 0) goto L2e
            return r0
        L2e:
            int r2 = r2 + 1
            goto L11
        L31:
            boolean r4 = r4.delete()
            return r4
        L36:
            return r0
    }

    private static com.amap.api.maps.offlinemap.OfflineMapCity m(org.json.JSONObject r3) throws org.json.JSONException {
            com.amap.api.maps.offlinemap.OfflineMapCity r0 = new com.amap.api.maps.offlinemap.OfflineMapCity
            r0.<init>()
            java.lang.String r1 = "adcode"
            java.lang.String r1 = e(r3, r1)
            java.lang.String r1 = o(r1)
            r0.setAdcode(r1)
            java.lang.String r1 = "url"
            java.lang.String r1 = e(r3, r1)
            r0.setUrl(r1)
            java.lang.String r1 = "name"
            java.lang.String r1 = e(r3, r1)
            r0.setCity(r1)
            java.lang.String r1 = "citycode"
            java.lang.String r1 = e(r3, r1)
            r0.setCode(r1)
            java.lang.String r1 = "pinyin"
            java.lang.String r1 = e(r3, r1)
            r0.setPinyin(r1)
            java.lang.String r1 = "jianpin"
            java.lang.String r1 = e(r3, r1)
            r0.setJianpin(r1)
            java.lang.String r1 = "version"
            java.lang.String r1 = e(r3, r1)
            r0.setVersion(r1)
            java.lang.String r1 = "size"
            java.lang.String r3 = e(r3, r1)
            long r1 = java.lang.Long.parseLong(r3)
            r0.setSize(r1)
            return r0
    }

    public static java.lang.String n(java.io.File r6) {
            java.lang.String r0 = "MapDownloadManager"
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            r1.<init>()
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40 java.io.FileNotFoundException -> L44
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L3d java.io.IOException -> L40 java.io.FileNotFoundException -> L44
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37 java.io.FileNotFoundException -> L3a
            java.io.InputStreamReader r4 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37 java.io.FileNotFoundException -> L3a
            java.lang.String r5 = "utf-8"
            r4.<init>(r3, r5)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37 java.io.FileNotFoundException -> L3a
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L35 java.io.IOException -> L37 java.io.FileNotFoundException -> L3a
        L19:
            java.lang.String r4 = r6.readLine()     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L26 java.io.FileNotFoundException -> L28
            if (r4 == 0) goto L2a
            r1.append(r4)     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L26 java.io.FileNotFoundException -> L28
            goto L19
        L23:
            r0 = move-exception
            r2 = r6
            goto L6a
        L26:
            r1 = move-exception
            goto L48
        L28:
            r1 = move-exception
            goto L5a
        L2a:
            java.lang.String r0 = r1.toString()     // Catch: java.lang.Throwable -> L23 java.io.IOException -> L26 java.io.FileNotFoundException -> L28
            r6.close()     // Catch: java.io.IOException -> L31
        L31:
            r3.close()     // Catch: java.io.IOException -> L34
        L34:
            return r0
        L35:
            r0 = move-exception
            goto L6a
        L37:
            r1 = move-exception
            r6 = r2
            goto L48
        L3a:
            r1 = move-exception
            r6 = r2
            goto L5a
        L3d:
            r0 = move-exception
            r3 = r2
            goto L6a
        L40:
            r1 = move-exception
            r6 = r2
            r3 = r6
            goto L48
        L44:
            r1 = move-exception
            r6 = r2
            r3 = r6
            goto L5a
        L48:
            java.lang.String r4 = "readOfflineSD io"
            com.amap.api.col.p0003l.w5.p(r1, r0, r4)     // Catch: java.lang.Throwable -> L23
            if (r6 == 0) goto L54
            r6.close()     // Catch: java.io.IOException -> L53
            goto L54
        L53:
        L54:
            if (r3 == 0) goto L69
        L56:
            r3.close()     // Catch: java.io.IOException -> L69
            goto L69
        L5a:
            java.lang.String r4 = "readOfflineSD filenotfound"
            com.amap.api.col.p0003l.w5.p(r1, r0, r4)     // Catch: java.lang.Throwable -> L23
            if (r6 == 0) goto L66
            r6.close()     // Catch: java.io.IOException -> L65
            goto L66
        L65:
        L66:
            if (r3 == 0) goto L69
            goto L56
        L69:
            return r2
        L6a:
            if (r2 == 0) goto L71
            r2.close()     // Catch: java.io.IOException -> L70
            goto L71
        L70:
        L71:
            if (r3 == 0) goto L76
            r3.close()     // Catch: java.io.IOException -> L76
        L76:
            throw r0
    }

    private static java.lang.String o(java.lang.String r1) {
            java.lang.String r0 = "000001"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto La
            java.lang.String r1 = "100000"
        La:
            return r1
    }

    public static void p(java.lang.String r6, android.content.Context r7) {
            java.lang.String r0 = ""
            java.lang.String r1 = com.amap.api.col.p0003l.b3.f0(r7)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Le
            goto L81
        Le:
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = com.amap.api.col.p0003l.b3.f0(r7)
            r1.append(r7)
            java.lang.String r7 = "offlinemapv4.png"
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            boolean r7 = r0.exists()
            java.lang.String r1 = "OfflineUpdateCityHandlerAbstract"
            if (r7 != 0) goto L3a
            r0.createNewFile()     // Catch: java.io.IOException -> L34
            goto L3a
        L34:
            r7 = move-exception
            java.lang.String r2 = "writeSD dirCreate"
            com.amap.api.col.p0003l.w5.p(r7, r1, r2)
        L3a:
            long r2 = a()
            r4 = 1048576(0x100000, double:5.180654E-318)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 <= 0) goto L81
            r7 = 0
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63 java.io.FileNotFoundException -> L65
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L61 java.io.IOException -> L63 java.io.FileNotFoundException -> L65
            java.lang.String r7 = "utf-8"
            byte[] r6 = r6.getBytes(r7)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5b java.io.FileNotFoundException -> L5e
            r2.write(r6)     // Catch: java.lang.Throwable -> L58 java.io.IOException -> L5b java.io.FileNotFoundException -> L5e
            r2.close()     // Catch: java.io.IOException -> L7a
            goto L81
        L58:
            r6 = move-exception
            r7 = r2
            goto L7b
        L5b:
            r6 = move-exception
            r7 = r2
            goto L67
        L5e:
            r6 = move-exception
            r7 = r2
            goto L6f
        L61:
            r6 = move-exception
            goto L7b
        L63:
            r6 = move-exception
            goto L67
        L65:
            r6 = move-exception
            goto L6f
        L67:
            java.lang.String r0 = "writeSD io"
            com.amap.api.col.p0003l.w5.p(r6, r1, r0)     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L81
            goto L76
        L6f:
            java.lang.String r0 = "writeSD filenotfound"
            com.amap.api.col.p0003l.w5.p(r6, r1, r0)     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L81
        L76:
            r7.close()     // Catch: java.io.IOException -> L7a
            goto L81
        L7a:
            return
        L7b:
            if (r7 == 0) goto L80
            r7.close()     // Catch: java.io.IOException -> L80
        L80:
            throw r6
        L81:
            return
    }
}

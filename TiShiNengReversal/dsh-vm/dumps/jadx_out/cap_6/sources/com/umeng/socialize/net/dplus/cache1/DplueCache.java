package com.umeng.socialize.net.dplus.cache1;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DplueCache {
    public DplueCache() {
            r0 = this;
            r0.<init>()
            return
    }

    private static org.json.JSONObject a(org.json.JSONObject r1) {
            if (r1 == 0) goto L11
            java.lang.String r0 = "content"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            if (r1 == 0) goto L11
            java.lang.String r0 = "share"
            org.json.JSONObject r1 = r1.optJSONObject(r0)
            return r1
        L11:
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            return r1
    }

    private static boolean a(java.lang.String r3, java.io.File r4) {
            r0 = 0
            r1 = 0
            android.content.Context r2 = com.umeng.socialize.utils.ContextUtil.getContext()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.lang.String r4 = r4.getName()     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.io.FileOutputStream r4 = r2.openFileOutput(r4, r0)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.io.OutputStreamWriter r2 = new java.io.OutputStreamWriter     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            java.io.BufferedWriter r4 = new java.io.BufferedWriter     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r4.<init>(r2)     // Catch: java.lang.Throwable -> L2d java.lang.Exception -> L2f
            r4.write(r3)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L2a
            r3 = 1
            r4.close()     // Catch: java.lang.Exception -> L20
            return r3
        L20:
            r4 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r4)
            return r3
        L27:
            r3 = move-exception
            r1 = r4
            goto L42
        L2a:
            r3 = move-exception
            r1 = r4
            goto L30
        L2d:
            r3 = move-exception
            goto L42
        L2f:
            r3 = move-exception
        L30:
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE     // Catch: java.lang.Throwable -> L2d
            com.umeng.socialize.utils.SLog.error(r4, r3)     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L41
            r1.close()     // Catch: java.lang.Exception -> L3b
            goto L41
        L3b:
            r3 = move-exception
            java.lang.String r4 = com.umeng.socialize.utils.UmengText.CACHE.CLOSE
            com.umeng.socialize.utils.SLog.error(r4, r3)
        L41:
            return r0
        L42:
            if (r1 == 0) goto L4e
            r1.close()     // Catch: java.lang.Exception -> L48
            goto L4e
        L48:
            r4 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CLOSE
            com.umeng.socialize.utils.SLog.error(r0, r4)
        L4e:
            throw r3
    }

    public static boolean deleteFile(java.io.File r0) {
            boolean r0 = r0.delete()
            return r0
    }

    public static java.lang.String getFileName() {
            java.lang.String r0 = "dpluscache"
            return r0
    }

    public static java.io.File getFilePath(java.lang.String r5) {
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            android.content.Context r0 = com.umeng.socialize.utils.ContextUtil.getContext()
            java.lang.String r0 = r0.getPackageName()
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L17
            return r1
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r4 = "data"
            r2.append(r4)
            r2.append(r3)
            r2.append(r4)
            r2.append(r3)
            r2.append(r0)
            r2.append(r3)
            java.lang.String r0 = "files"
            r2.append(r0)
            r2.append(r3)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto L4b
            return r1
        L4b:
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            if (r5 != 0) goto L5d
            boolean r5 = r0.mkdirs()
            if (r5 != 0) goto L5d
            return r1
        L5d:
            return r0
    }

    public static java.lang.String readFile(java.io.File r5) {
            boolean r0 = r5.exists()
            java.lang.String r1 = ""
            if (r0 != 0) goto L9
            return r1
        L9:
            r0 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L47
            r2.<init>()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L47
            android.content.Context r3 = com.umeng.socialize.utils.ContextUtil.getContext()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L47
            java.lang.String r5 = r5.getName()     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L47
            java.io.FileInputStream r5 = r3.openFileInput(r5)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L47
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L47
            r3.<init>(r5)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L47
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L47
            r5.<init>(r3)     // Catch: java.lang.Throwable -> L42 java.lang.Exception -> L47
        L25:
            java.lang.String r0 = r5.readLine()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            if (r0 == 0) goto L33
            r2.append(r0)     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            goto L25
        L2f:
            r0 = move-exception
            goto L5d
        L31:
            r0 = move-exception
            goto L4b
        L33:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L2f java.lang.Exception -> L31
            r5.close()     // Catch: java.lang.Exception -> L3b
            return r0
        L3b:
            r5 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r1, r5)
            return r0
        L42:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L5d
        L47:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L4b:
            java.lang.String r2 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE     // Catch: java.lang.Throwable -> L2f
            com.umeng.socialize.utils.SLog.error(r2, r0)     // Catch: java.lang.Throwable -> L2f
            if (r5 == 0) goto L5c
            r5.close()     // Catch: java.lang.Exception -> L56
            goto L5c
        L56:
            r5 = move-exception
            java.lang.String r0 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r0, r5)
        L5c:
            return r1
        L5d:
            if (r5 == 0) goto L69
            r5.close()     // Catch: java.lang.Exception -> L63
            goto L69
        L63:
            r5 = move-exception
            java.lang.String r1 = com.umeng.socialize.utils.UmengText.CACHE.CACHEFILE
            com.umeng.socialize.utils.SLog.error(r1, r5)
        L69:
            throw r0
    }

    public static boolean save(org.json.JSONObject r2, java.io.File r3) throws org.json.JSONException, java.io.IOException {
            boolean r0 = r3.exists()
            if (r0 == 0) goto L23
            java.lang.String r0 = readFile(r3)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = ","
            r1.append(r0)
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            boolean r2 = a(r2, r3)
            return r2
        L23:
            r3.createNewFile()
            java.lang.String r2 = r2.toString()
            boolean r2 = a(r2, r3)
            return r2
    }
}

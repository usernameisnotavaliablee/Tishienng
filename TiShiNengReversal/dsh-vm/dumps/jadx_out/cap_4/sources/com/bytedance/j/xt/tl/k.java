package com.bytedance.j.xt.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class k {
    public k() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.j.xt.cw.a a(java.lang.String r3) {
            java.lang.String r3 = i(r3)     // Catch: java.lang.Throwable -> L34
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L34
            r0.<init>(r3)     // Catch: java.lang.Throwable -> L34
            com.bytedance.j.xt.cw.a r3 = new com.bytedance.j.xt.cw.a     // Catch: java.lang.Throwable -> L34
            r3.<init>()     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "url"
            java.lang.String r1 = r0.optString(r1)     // Catch: java.lang.Throwable -> L34
            r3.c(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "body"
            org.json.JSONObject r1 = r0.optJSONObject(r1)     // Catch: java.lang.Throwable -> L34
            r3.d(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "dump_file"
            java.lang.String r1 = r0.optString(r1)     // Catch: java.lang.Throwable -> L34
            r3.g(r1)     // Catch: java.lang.Throwable -> L34
            java.lang.String r1 = "encrypt"
            r2 = 0
            boolean r0 = r0.optBoolean(r1, r2)     // Catch: java.lang.Throwable -> L34
            r3.e(r0)     // Catch: java.lang.Throwable -> L34
            return r3
        L34:
            r3 = 0
            return r3
    }

    public static java.lang.String b(java.io.File r1, java.lang.String r2, java.lang.String r3, org.json.JSONObject r4, java.lang.String r5, boolean r6) {
            boolean r0 = r1.exists()
            if (r0 != 0) goto L9
            r1.mkdirs()
        L9:
            java.io.File r0 = new java.io.File
            r0.<init>(r1, r2)
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            java.lang.String r2 = "url"
            r1.put(r2, r3)     // Catch: java.io.IOException -> L24 org.json.JSONException -> L26
            java.lang.String r2 = "body"
            r1.put(r2, r4)     // Catch: java.io.IOException -> L24 org.json.JSONException -> L26
            java.lang.String r2 = "dump_file"
            if (r5 != 0) goto L28
            java.lang.String r5 = ""
            goto L28
        L24:
            r1 = move-exception
            goto L39
        L26:
            r1 = move-exception
            goto L3d
        L28:
            r1.put(r2, r5)     // Catch: java.io.IOException -> L24 org.json.JSONException -> L26
            java.lang.String r2 = "encrypt"
            r1.put(r2, r6)     // Catch: java.io.IOException -> L24 org.json.JSONException -> L26
            java.lang.String r1 = r1.toString()     // Catch: java.io.IOException -> L24 org.json.JSONException -> L26
            r2 = 0
            f(r0, r1, r2)     // Catch: java.io.IOException -> L24 org.json.JSONException -> L26
            goto L40
        L39:
            com.bytedance.sdk.component.utils.vl.j(r1)
            goto L40
        L3d:
            com.bytedance.sdk.component.utils.vl.j(r1)
        L40:
            java.lang.String r1 = r0.getAbsolutePath()
            return r1
    }

    public static java.lang.String c(java.io.File r6, java.lang.String r7, java.lang.String r8, org.json.JSONObject r9, boolean r10) {
            r4 = 0
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r5 = r10
            java.lang.String r6 = b(r0, r1, r2, r3, r4, r5)
            return r6
    }

    public static java.lang.String d(java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r4)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L36
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L36
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L36
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L36
        L1c:
            java.lang.String r0 = r2.readLine()     // Catch: java.lang.Throwable -> L2b
            if (r0 == 0) goto L2e
            r4.append(r0)     // Catch: java.lang.Throwable -> L2b
            if (r5 == 0) goto L1c
            r4.append(r5)     // Catch: java.lang.Throwable -> L2b
            goto L1c
        L2b:
            r4 = move-exception
            r1 = r2
            goto L37
        L2e:
            com.bytedance.j.xt.tl.h.a(r2)
            java.lang.String r4 = r4.toString()
            return r4
        L36:
            r4 = move-exception
        L37:
            com.bytedance.j.xt.tl.h.a(r1)
            throw r4
    }

    public static void e(android.content.Context r4, java.lang.String r5, java.lang.String r6) {
            java.lang.String r0 = " "
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L34
            r1.<init>()     // Catch: java.io.IOException -> L34
            long r2 = java.lang.System.currentTimeMillis()     // Catch: java.io.IOException -> L34
            r1.append(r2)     // Catch: java.io.IOException -> L34
            r1.append(r0)     // Catch: java.io.IOException -> L34
            java.lang.String r2 = "null"
            if (r5 != 0) goto L16
            r5 = r2
        L16:
            r1.append(r5)     // Catch: java.io.IOException -> L34
            r1.append(r0)     // Catch: java.io.IOException -> L34
            if (r6 != 0) goto L1f
            r6 = r2
        L1f:
            r1.append(r6)     // Catch: java.io.IOException -> L34
            java.lang.String r5 = "\n"
            r1.append(r5)     // Catch: java.io.IOException -> L34
            java.lang.String r5 = r1.toString()     // Catch: java.io.IOException -> L34
            java.io.File r4 = com.bytedance.j.xt.tl.l.d(r4)     // Catch: java.io.IOException -> L34
            r6 = 1
            f(r4, r5, r6)     // Catch: java.io.IOException -> L34
            return
        L34:
            r4 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r4)
            return
    }

    public static void f(@androidx.annotation.NonNull java.io.File r2, @androidx.annotation.NonNull java.lang.String r3, boolean r4) throws java.io.IOException {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L7
            return
        L7:
            java.io.File r0 = r2.getParentFile()
            r0.mkdirs()
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L25
            r1.<init>(r2, r4)     // Catch: java.lang.Throwable -> L25
            byte[] r2 = r3.getBytes()     // Catch: java.lang.Throwable -> L22
            r1.write(r2)     // Catch: java.lang.Throwable -> L22
            r1.flush()     // Catch: java.lang.Throwable -> L22
            com.bytedance.j.xt.tl.h.a(r1)
            return
        L22:
            r2 = move-exception
            r0 = r1
            goto L26
        L25:
            r2 = move-exception
        L26:
            com.bytedance.j.xt.tl.h.a(r0)
            throw r2
    }

    public static boolean g(java.io.File r1) {
            boolean r0 = r1.exists()
            if (r0 == 0) goto Le
            boolean r1 = r1.delete()
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public static boolean h(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            boolean r2 = r0.exists()
            if (r2 == 0) goto L1b
            boolean r2 = r0.delete()
            if (r2 == 0) goto L1b
            r2 = 1
            return r2
        L1b:
            return r1
    }

    public static java.lang.String i(java.lang.String r1) throws java.io.IOException {
            r0 = 0
            java.lang.String r1 = d(r1, r0)
            return r1
    }
}

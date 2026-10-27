package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ri {
    private static java.lang.String j = ":push";

    static {
            return
    }

    public ri() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String cw() {
            com.bytedance.embedapplog.tl r0 = com.bytedance.embedapplog.j.vl()
            if (r0 == 0) goto L11
            com.bytedance.embedapplog.ae r0 = r0.h()
            if (r0 == 0) goto L11
            java.lang.String r0 = r0.xt()
            return r0
        L11:
            java.lang.String r0 = ""
            return r0
    }

    public static android.os.Looper j(com.bytedance.embedapplog.rn r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            com.bytedance.embedapplog.tl r1 = r1.hh()
            if (r1 == 0) goto L15
            com.bytedance.embedapplog.ae r1 = r1.h()
            if (r1 == 0) goto L15
            android.os.Looper r1 = r1.up()
            return r1
        L15:
            return r0
    }

    public static java.lang.String j(android.content.Context r1) {
            com.bytedance.embedapplog.tl r0 = com.bytedance.embedapplog.j.vl()
            if (r0 == 0) goto L11
            com.bytedance.embedapplog.ae r0 = r0.h()
            if (r0 == 0) goto L11
            java.lang.String r1 = r0.j(r1)
            return r1
        L11:
            java.lang.String r1 = ""
            return r1
    }

    public static java.lang.String j(java.lang.String r1) {
            com.bytedance.embedapplog.tl r0 = com.bytedance.embedapplog.j.vl()
            if (r0 == 0) goto L11
            com.bytedance.embedapplog.ae r0 = r0.h()
            if (r0 == 0) goto L11
            java.lang.String r1 = r0.j(r1)
            return r1
        L11:
            java.lang.String r1 = ""
            return r1
    }

    private static java.lang.String j(java.lang.String r0, java.lang.String r1) {
            if (r1 == 0) goto L3
            goto L5
        L3:
            java.lang.String r1 = "ISO-8859-1"
        L5:
            java.lang.String r0 = java.net.URLEncoder.encode(r0, r1)     // Catch: java.io.UnsupportedEncodingException -> La
            return r0
        La:
            java.lang.String r0 = ""
            return r0
    }

    public static java.lang.String j(java.lang.String r4, java.util.HashMap<java.lang.String, java.lang.String> r5, java.lang.String r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r4)
            java.util.Set r4 = r5.keySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L43
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = j(r1, r6)
            java.lang.Object r1 = r5.get(r1)
            java.lang.String r1 = (java.lang.String) r1
            if (r1 == 0) goto L2a
            java.lang.String r1 = j(r1, r6)
            goto L2c
        L2a:
            java.lang.String r1 = ""
        L2c:
            int r3 = r0.length()
            if (r3 <= 0) goto L37
            java.lang.String r3 = "&"
            r0.append(r3)
        L37:
            r0.append(r2)
            java.lang.String r2 = "="
            r0.append(r2)
            r0.append(r1)
            goto Ld
        L43:
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static org.json.JSONObject j(org.json.JSONObject r1) {
            com.bytedance.embedapplog.tl r0 = com.bytedance.embedapplog.j.vl()
            if (r0 == 0) goto L10
            com.bytedance.embedapplog.ae r0 = r0.h()
            if (r0 == 0) goto L10
            org.json.JSONObject r1 = r0.j(r1)
        L10:
            return r1
    }

    public static void j(android.database.Cursor r0) {
            if (r0 == 0) goto La
            r0.close()     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            com.bytedance.embedapplog.uc.j(r0)
        La:
            return
    }

    public static void j(android.database.sqlite.SQLiteDatabase r0) {
            if (r0 == 0) goto La
            r0.endTransaction()     // Catch: java.lang.Throwable -> L6
            return
        L6:
            r0 = move-exception
            com.bytedance.embedapplog.uc.xt(r0)
        La:
            return
    }

    public static boolean j() {
            com.bytedance.embedapplog.tl r0 = com.bytedance.embedapplog.j.vl()
            if (r0 == 0) goto Lb
            boolean r0 = r0.s()
            return r0
        Lb:
            r0 = 1
            return r0
    }

    public static boolean j(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public static boolean j(org.json.JSONObject r0, org.json.JSONObject r1) {
            if (r0 == 0) goto L11
            if (r1 == 0) goto L11
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = r1.toString()
            boolean r0 = r0.equals(r1)
            return r0
        L11:
            boolean r0 = j(r0, r1)
            return r0
    }

    public static boolean r() {
            com.bytedance.embedapplog.tl r0 = com.bytedance.embedapplog.j.vl()
            if (r0 == 0) goto L11
            com.bytedance.embedapplog.ae r0 = r0.h()
            if (r0 == 0) goto L11
            boolean r0 = r0.r()
            return r0
        L11:
            r0 = 0
            return r0
    }

    public static android.os.Looper xt(com.bytedance.embedapplog.rn r1) {
            r0 = 0
            if (r1 != 0) goto L4
            return r0
        L4:
            com.bytedance.embedapplog.tl r1 = r1.hh()
            if (r1 == 0) goto L15
            com.bytedance.embedapplog.ae r1 = r1.h()
            if (r1 == 0) goto L15
            android.os.Looper r1 = r1.m()
            return r1
        L15:
            return r0
    }

    public static org.json.JSONObject xt(org.json.JSONObject r3) {
            java.lang.String r0 = "oaid"
            if (r3 == 0) goto L23
            org.json.JSONObject r1 = new org.json.JSONObject
            r1.<init>()
            xt(r1, r3)
            org.json.JSONObject r3 = r1.optJSONObject(r0)     // Catch: java.lang.Exception -> L1e
            java.lang.String r3 = com.bytedance.embedapplog.wo.j(r3)     // Catch: java.lang.Exception -> L1e
            boolean r2 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Exception -> L1e
            if (r2 != 0) goto L22
            r1.put(r0, r3)     // Catch: java.lang.Exception -> L1e
            goto L22
        L1e:
            r3 = move-exception
            com.bytedance.embedapplog.uc.xt(r3)
        L22:
            return r1
        L23:
            r3 = 0
            return r3
    }

    public static org.json.JSONObject xt(org.json.JSONObject r3, org.json.JSONObject r4) {
            java.util.Iterator r0 = r4.keys()     // Catch: org.json.JSONException -> L18
        L4:
            boolean r1 = r0.hasNext()     // Catch: org.json.JSONException -> L18
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r0.next()     // Catch: org.json.JSONException -> L18
            java.lang.String r1 = (java.lang.String) r1     // Catch: org.json.JSONException -> L18
            java.lang.Object r2 = r4.opt(r1)     // Catch: org.json.JSONException -> L18
            r3.put(r1, r2)     // Catch: org.json.JSONException -> L18
            goto L4
        L18:
            r4 = move-exception
            goto L1b
        L1a:
            return r3
        L1b:
            com.bytedance.embedapplog.uc.xt(r4)
            return r3
    }

    public static boolean xt() {
            com.bytedance.embedapplog.tl r0 = com.bytedance.embedapplog.j.vl()
            if (r0 == 0) goto L11
            com.bytedance.embedapplog.ae r0 = r0.h()
            if (r0 == 0) goto L11
            boolean r0 = r0.cw()
            return r0
        L11:
            r0 = 0
            return r0
    }

    public static boolean xt(android.content.Context r1) {
            java.lang.String r1 = j(r1)
            if (r1 == 0) goto L10
            java.lang.String r0 = com.bytedance.embedapplog.ri.j
            boolean r1 = r1.endsWith(r0)
            if (r1 == 0) goto L10
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }
}

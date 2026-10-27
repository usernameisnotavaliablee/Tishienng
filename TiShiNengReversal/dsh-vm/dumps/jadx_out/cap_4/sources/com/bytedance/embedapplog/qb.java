package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class qb {
    private static final java.lang.String[] j = null;
    private static final java.lang.String[] xt = null;

    static {
            java.lang.String r23 = "clientudid"
            java.lang.String r24 = "aid"
            java.lang.String r1 = "ab_version"
            java.lang.String r2 = "device_brand"
            java.lang.String r3 = "language"
            java.lang.String r4 = "os_api"
            java.lang.String r5 = "resolution"
            java.lang.String r6 = "google_aid"
            java.lang.String r7 = "build_serial"
            java.lang.String r8 = "carrier"
            java.lang.String r9 = "install_id"
            java.lang.String r10 = "package"
            java.lang.String r11 = "app_version"
            java.lang.String r12 = "device_model"
            java.lang.String r13 = "udid"
            java.lang.String r14 = "density_dpi"
            java.lang.String r15 = "aliyun_uuid"
            java.lang.String r16 = "mcc_mnc"
            java.lang.String r17 = "sim_region"
            java.lang.String r18 = "ab_client"
            java.lang.String r19 = "ab_group"
            java.lang.String r20 = "ab_feature"
            java.lang.String r21 = "device_id"
            java.lang.String r22 = "openudid"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}
            com.bytedance.embedapplog.qb.j = r0
            java.lang.String r23 = "clientudid"
            java.lang.String r24 = "aid"
            java.lang.String r1 = "ab_version"
            java.lang.String r2 = "device_brand"
            java.lang.String r3 = "language"
            java.lang.String r4 = "os_api"
            java.lang.String r5 = "resolution"
            java.lang.String r6 = "google_aid"
            java.lang.String r7 = "build_serial"
            java.lang.String r8 = "carrier"
            java.lang.String r9 = "iid"
            java.lang.String r10 = "app_name"
            java.lang.String r11 = "version_name"
            java.lang.String r12 = "device_type"
            java.lang.String r13 = "uuid"
            java.lang.String r14 = "dpi"
            java.lang.String r15 = "aliyun_uuid"
            java.lang.String r16 = "mcc_mnc"
            java.lang.String r17 = "sim_region"
            java.lang.String r18 = "ab_client"
            java.lang.String r19 = "ab_group"
            java.lang.String r20 = "ab_feature"
            java.lang.String r21 = "device_id"
            java.lang.String r22 = "openudid"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24}
            com.bytedance.embedapplog.qb.xt = r0
            return
    }

    public qb() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(android.content.Context r9, org.json.JSONObject r10, java.lang.String r11, boolean r12, com.bytedance.embedapplog.xt r13) {
            r0 = -1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 == 0) goto Lc
            return r11
        Lc:
            java.util.HashMap r2 = new java.util.HashMap
            java.lang.String[] r3 = com.bytedance.embedapplog.qb.j
            int r3 = r3.length
            r4 = 10
            int r3 = r3 + r4
            r2.<init>(r3)
            r3 = 0
            r5 = 0
        L19:
            java.lang.String[] r6 = com.bytedance.embedapplog.qb.j
            int r7 = r6.length
            r8 = 0
            if (r5 >= r7) goto L35
            r6 = r6[r5]
            java.lang.String r6 = r10.optString(r6, r8)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L32
            java.lang.String[] r7 = com.bytedance.embedapplog.qb.xt
            r7 = r7[r5]
            r2.put(r7, r6)
        L32:
            int r5 = r5 + 1
            goto L19
        L35:
            if (r13 == 0) goto L3e
            java.util.HashMap r13 = r13.j(r9)     // Catch: java.lang.Exception -> L3c
            goto L3f
        L3c:
            r13 = move-exception
            goto L4b
        L3e:
            r13 = r8
        L3f:
            boolean r5 = com.bytedance.embedapplog.ri.xt(r9)     // Catch: java.lang.Exception -> L3c
            if (r5 == 0) goto L4e
            if (r13 == 0) goto L4e
            r2.putAll(r13)     // Catch: java.lang.Exception -> L3c
            goto L4e
        L4b:
            com.bytedance.embedapplog.uc.xt(r13)
        L4e:
            com.bytedance.embedapplog.r r13 = com.bytedance.embedapplog.j.cw()     // Catch: java.lang.Exception -> L64
            if (r13 != 0) goto L56
            r13 = r8
            goto L5e
        L56:
            com.bytedance.embedapplog.r r13 = com.bytedance.embedapplog.j.cw()     // Catch: java.lang.Exception -> L64
            java.util.HashMap r13 = r13.j()     // Catch: java.lang.Exception -> L64
        L5e:
            if (r13 == 0) goto L68
            r2.putAll(r13)     // Catch: java.lang.Exception -> L64
            goto L68
        L64:
            r13 = move-exception
            com.bytedance.embedapplog.uc.xt(r13)
        L68:
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r13 = com.bytedance.embedapplog.j.cw
            int r13 = r13.size()
            if (r13 <= 0) goto L75
            java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.String> r13 = com.bytedance.embedapplog.j.cw
            r2.putAll(r13)
        L75:
            if (r12 == 0) goto L7e
            java.lang.String r12 = "ssmix"
            java.lang.String r13 = "a"
            r2.put(r12, r13)
        L7e:
            java.lang.String r9 = com.bytedance.embedapplog.ln.j(r9)
            boolean r12 = android.text.TextUtils.isEmpty(r9)
            if (r12 != 0) goto L8d
            java.lang.String r12 = "ac"
            r2.put(r12, r9)
        L8d:
            java.lang.String r9 = "tweaked_channel"
            java.lang.String r12 = ""
            java.lang.Object r9 = com.bytedance.embedapplog.j.j(r9, r12)
            java.lang.String r9 = (java.lang.String) r9
            boolean r13 = android.text.TextUtils.isEmpty(r9)
            java.lang.String r5 = "channel"
            if (r13 == 0) goto La5
            java.lang.Object r9 = com.bytedance.embedapplog.j.j(r5, r12)
            java.lang.String r9 = (java.lang.String) r9
        La5:
            boolean r12 = android.text.TextUtils.isEmpty(r9)
            if (r12 != 0) goto Lae
            r2.put(r5, r9)
        Lae:
            java.lang.String r9 = "os_version"
            java.lang.String r12 = r10.optString(r9, r8)
            if (r12 == 0) goto Lc0
            int r13 = r12.length()
            if (r13 <= r4) goto Lc0
            java.lang.String r12 = r12.substring(r3, r4)
        Lc0:
            r2.put(r9, r12)
            long r12 = java.lang.System.currentTimeMillis()
            java.lang.String r9 = java.lang.String.valueOf(r12)
            java.lang.String r12 = "_rticket"
            r2.put(r12, r9)
            java.lang.String r9 = "device_platform"
            java.lang.String r12 = "android"
            r2.put(r9, r12)
            java.lang.String r9 = "version_code"
            java.lang.Object r12 = com.bytedance.embedapplog.j.j(r9, r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 == r0) goto Lec
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r2.put(r9, r12)
        Lec:
            java.lang.String r9 = "manifest_version_code"
            java.lang.Object r12 = com.bytedance.embedapplog.j.j(r9, r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 == r0) goto L101
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r2.put(r9, r12)
        L101:
            java.lang.String r9 = "update_version_code"
            java.lang.Object r12 = com.bytedance.embedapplog.j.j(r9, r1)
            java.lang.Integer r12 = (java.lang.Integer) r12
            int r12 = r12.intValue()
            if (r12 == r0) goto L116
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r2.put(r9, r12)
        L116:
            java.lang.String r9 = "oaid"
            org.json.JSONObject r12 = r10.optJSONObject(r9)
            java.lang.String r12 = com.bytedance.embedapplog.wo.j(r12)
            boolean r13 = android.text.TextUtils.isEmpty(r12)
            if (r13 != 0) goto L129
            r2.put(r9, r12)
        L129:
            java.lang.String r9 = "cdid"
            java.lang.String r10 = r10.optString(r9)
            boolean r12 = android.text.TextUtils.isEmpty(r10)
            if (r12 != 0) goto L138
            r2.put(r9, r10)
        L138:
            java.lang.String r9 = "/"
            boolean r10 = r11.endsWith(r9)
            if (r10 != 0) goto L14f
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r11)
            r10.append(r9)
            java.lang.String r11 = r10.toString()
        L14f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            r9.append(r11)
            r10 = 63
            int r11 = r11.indexOf(r10)
            if (r11 >= 0) goto L160
            goto L162
        L160:
            r10 = 38
        L162:
            r9.append(r10)
            java.lang.String r9 = r9.toString()
            java.lang.String r10 = "UTF-8"
            java.lang.String r9 = com.bytedance.embedapplog.ri.j(r9, r2, r10)
            return r9
    }

    public static java.lang.String[] j(com.bytedance.embedapplog.f r6, android.content.Context r7, org.json.JSONObject r8) {
            com.bytedance.embedapplog.util.j r6 = r6.tl()
            java.lang.String[] r6 = r6.xt()
            int r0 = r6.length
            java.lang.String[] r0 = new java.lang.String[r0]
            boolean r1 = com.bytedance.embedapplog.j.ae()
            if (r1 == 0) goto L14
            java.lang.String r1 = "?tt_data=a"
            goto L16
        L14:
            java.lang.String r1 = "?"
        L16:
            r2 = 0
        L17:
            int r3 = r6.length
            if (r2 >= r3) goto L41
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = r6[r2]
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            com.bytedance.embedapplog.xt r4 = com.bytedance.embedapplog.j.r()
            r5 = 1
            java.lang.String r3 = j(r7, r8, r3, r5, r4)
            r0[r2] = r3
            java.lang.String[] r4 = com.bytedance.embedapplog.q.xt
            java.lang.String r3 = com.bytedance.embedapplog.q.j(r3, r4)
            r0[r2] = r3
            int r2 = r2 + 1
            goto L17
        L41:
            return r0
    }
}

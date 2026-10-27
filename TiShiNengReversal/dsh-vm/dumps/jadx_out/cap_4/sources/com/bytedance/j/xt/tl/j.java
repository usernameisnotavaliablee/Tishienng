package com.bytedance.j.xt.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class j {
    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r1) {
            com.bytedance.j.xt.up.c r0 = com.bytedance.j.xt.e.d()
            if (r0 == 0) goto L1b
            com.bytedance.j.xt.up.c r0 = com.bytedance.j.xt.e.d()
            java.util.Map r0 = r0.b()
            if (r0 == 0) goto L1b
            java.lang.Object r1 = r0.get(r1)
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L1b
            java.lang.String r1 = (java.lang.String) r1
            return r1
        L1b:
            r1 = 0
            return r1
    }

    public static void b(com.bytedance.j.xt.cw.b r8, com.bytedance.j.xt.cw.c r9, com.bytedance.j.xt.cw r10) {
            java.lang.String r0 = "_"
            if (r8 == 0) goto L7f
            org.json.JSONObject r1 = r8.k()
            if (r1 == 0) goto L7f
            if (r10 != 0) goto Ld
            goto L7f
        Ld:
            org.json.JSONObject r8 = r8.k()
            java.lang.String r1 = "crash_time"
            long r1 = r8.optLong(r1)
            java.lang.String r3 = "aid"
            java.lang.String r3 = a(r3)
            int r3 = c(r3)
            com.bytedance.j.xt.up.g r4 = com.bytedance.j.xt.e.b()
            java.lang.String r4 = r4.a()
            r5 = 0
            int r7 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r7 <= 0) goto L7f
            if (r3 <= 0) goto L7f
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 != 0) goto L7f
            java.lang.String r5 = "0"
            boolean r5 = r5.equals(r4)
            if (r5 != 0) goto L7f
            java.lang.String r5 = r10.j()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L7f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: org.json.JSONException -> L7b
            java.lang.String r6 = "android_"
            r5.<init>(r6)     // Catch: org.json.JSONException -> L7b
            r5.append(r3)     // Catch: org.json.JSONException -> L7b
            r5.append(r0)     // Catch: org.json.JSONException -> L7b
            r5.append(r4)     // Catch: org.json.JSONException -> L7b
            r5.append(r0)     // Catch: org.json.JSONException -> L7b
            r5.append(r1)     // Catch: org.json.JSONException -> L7b
            r5.append(r0)     // Catch: org.json.JSONException -> L7b
            r5.append(r10)     // Catch: org.json.JSONException -> L7b
            java.lang.String r10 = r5.toString()     // Catch: org.json.JSONException -> L7b
            java.lang.String r0 = "unique_key"
            if (r9 == 0) goto L77
            org.json.JSONObject r8 = r9.e()     // Catch: org.json.JSONException -> L7b
            if (r8 == 0) goto L7f
            r8.put(r0, r10)     // Catch: org.json.JSONException -> L7b
            return
        L77:
            r8.put(r0, r10)     // Catch: org.json.JSONException -> L7b
            return
        L7b:
            r8 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r8)
        L7f:
            return
    }

    public static int c(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> Ld
            return r2
        Ld:
            r2 = move-exception
            com.bytedance.j.xt.tl.i.c(r2)
            return r1
    }
}

package com.bytedance.adsdk.ugeno.m;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static org.json.JSONArray j(java.lang.String r1, org.json.JSONArray r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            goto Ld
        L7:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: org.json.JSONException -> Ld
            r0.<init>(r1)     // Catch: org.json.JSONException -> Ld
            return r0
        Ld:
            return r2
    }

    public static org.json.JSONObject j(java.lang.String r1, org.json.JSONObject r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 == 0) goto L7
            return r2
        L7:
            org.json.JSONObject r0 = new org.json.JSONObject     // Catch: org.json.JSONException -> Ld
            r0.<init>(r1)     // Catch: org.json.JSONException -> Ld
            return r0
        Ld:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
            return r2
    }

    public static void j(org.json.JSONArray r2, org.json.JSONArray r3) {
            if (r3 == 0) goto L23
            int r0 = r3.length()
            if (r0 > 0) goto L9
            goto L23
        L9:
            if (r2 != 0) goto L10
            org.json.JSONArray r2 = new org.json.JSONArray
            r2.<init>()
        L10:
            r0 = 0
        L11:
            int r1 = r3.length()
            if (r0 >= r1) goto L23
            java.lang.Object r1 = r3.opt(r0)
            if (r1 == 0) goto L20
            r2.put(r1)
        L20:
            int r0 = r0 + 1
            goto L11
        L23:
            return
    }

    public static void j(org.json.JSONObject r3, org.json.JSONObject r4) {
            if (r3 == 0) goto L22
            if (r4 != 0) goto L5
            goto L22
        L5:
            java.util.Iterator r0 = r3.keys()
        L9:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r2 = r3.opt(r1)     // Catch: org.json.JSONException -> L1d
            r4.put(r1, r2)     // Catch: org.json.JSONException -> L1d
            goto L9
        L1d:
            r1 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r1)
            goto L9
        L22:
            return
    }
}

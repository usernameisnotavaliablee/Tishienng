package com.bytedance.adsdk.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class m implements com.bytedance.adsdk.xt.tl {
    public m() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.xt.tl
    public /* synthetic */ java.lang.Object j(org.json.JSONObject r1, java.lang.Object[] r2) {
            r0 = this;
            java.lang.String r1 = r0.xt(r1, r2)
            return r1
    }

    public java.lang.String xt(org.json.JSONObject r5, java.lang.Object[] r6) {
            r4 = this;
            r5 = 0
            if (r6 == 0) goto L51
            int r0 = r6.length
            r1 = 2
            if (r0 >= r1) goto L8
            goto L51
        L8:
            r0 = 0
            r0 = r6[r0]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 == 0) goto L16
            return r5
        L16:
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L46
            r2.<init>(r0)     // Catch: org.json.JSONException -> L46
            r0 = 1
            r0 = r6[r0]     // Catch: org.json.JSONException -> L46
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch: org.json.JSONException -> L46
            boolean r3 = android.text.TextUtils.isEmpty(r0)     // Catch: org.json.JSONException -> L46
            if (r3 == 0) goto L29
            return r5
        L29:
            com.bytedance.adsdk.xt.xt.j r0 = com.bytedance.adsdk.xt.xt.j.j(r0)     // Catch: org.json.JSONException -> L46
            java.lang.Object r0 = r0.j(r2)     // Catch: org.json.JSONException -> L46
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: org.json.JSONException -> L46
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: org.json.JSONException -> L46
            if (r2 == 0) goto L49
            int r0 = r6.length     // Catch: org.json.JSONException -> L46
            r2 = 3
            if (r0 < r2) goto L48
            r6 = r6[r1]     // Catch: org.json.JSONException -> L46
            java.lang.String r5 = java.lang.String.valueOf(r6)     // Catch: org.json.JSONException -> L46
            return r5
        L46:
            r6 = move-exception
            goto L4e
        L48:
            return r5
        L49:
            java.lang.String r5 = java.lang.String.valueOf(r0)     // Catch: org.json.JSONException -> L46
            return r5
        L4e:
            com.bytedance.sdk.component.utils.vl.j(r6)
        L51:
            return r5
    }
}

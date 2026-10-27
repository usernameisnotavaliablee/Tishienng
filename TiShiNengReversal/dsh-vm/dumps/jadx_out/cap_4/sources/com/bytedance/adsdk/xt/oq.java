package com.bytedance.adsdk.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class oq implements com.bytedance.adsdk.xt.tl {
    public oq() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.xt.tl
    public java.lang.Object j(org.json.JSONObject r4, java.lang.Object[] r5) {
            r3 = this;
            if (r5 == 0) goto L41
            int r0 = r5.length
            if (r0 == 0) goto L6
            goto L41
        L6:
            r0 = 2
            r0 = r5[r0]
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r1 = 1
            r1 = r5[r1]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r2 = 0
            r5 = r5[r2]
            java.lang.String r5 = java.lang.String.valueOf(r5)
            boolean r2 = android.text.TextUtils.isEmpty(r5)
            if (r2 == 0) goto L22
            goto L3f
        L22:
            if (r4 != 0) goto L25
            goto L3f
        L25:
            java.lang.String r2 = "i18n"
            org.json.JSONObject r4 = r4.optJSONObject(r2)
            if (r4 != 0) goto L2e
            goto L3f
        L2e:
            org.json.JSONObject r4 = r4.optJSONObject(r1)
            if (r4 != 0) goto L35
            goto L3f
        L35:
            java.lang.String r4 = r4.optString(r5)
            boolean r5 = android.text.TextUtils.isEmpty(r4)
            if (r5 == 0) goto L40
        L3f:
            return r0
        L40:
            return r4
        L41:
            r4 = 0
            return r4
    }
}

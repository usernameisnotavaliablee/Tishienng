package com.bytedance.adsdk.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class up implements com.bytedance.adsdk.xt.tl {
    public up() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.xt.tl
    public java.lang.Object j(org.json.JSONObject r4, java.lang.Object[] r5) {
            r3 = this;
            r4 = 0
            if (r5 == 0) goto L23
            int r0 = r5.length
            if (r0 > 0) goto L7
            goto L23
        L7:
            r0 = 0
        L8:
            int r1 = r5.length
            if (r0 >= r1) goto L23
            r1 = r5[r0]
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L20
            java.lang.String r2 = "null"
            boolean r2 = android.text.TextUtils.equals(r1, r2)
            if (r2 != 0) goto L20
            return r1
        L20:
            int r0 = r0 + 1
            goto L8
        L23:
            return r4
    }
}

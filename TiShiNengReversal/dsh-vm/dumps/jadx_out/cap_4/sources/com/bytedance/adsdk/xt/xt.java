package com.bytedance.adsdk.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt implements com.bytedance.adsdk.xt.tl {
    public xt() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.xt.tl
    public java.lang.Object j(org.json.JSONObject r2, java.lang.Object[] r3) {
            r1 = this;
            r2 = 0
            if (r3 == 0) goto L19
            int r0 = r3.length
            if (r0 > 0) goto L7
            goto L19
        L7:
            r0 = 0
            r3 = r3[r0]
            java.lang.String r3 = java.lang.String.valueOf(r3)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto L15
            return r2
        L15:
            java.lang.String r2 = android.net.Uri.decode(r3)
        L19:
            return r2
    }
}

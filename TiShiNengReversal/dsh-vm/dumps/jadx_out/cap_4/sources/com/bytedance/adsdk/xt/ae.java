package com.bytedance.adsdk.xt;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class ae implements com.bytedance.adsdk.xt.tl {
    public ae() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bytedance.adsdk.xt.tl
    public /* synthetic */ java.lang.Object j(org.json.JSONObject r1, java.lang.Object[] r2) {
            r0 = this;
            java.lang.Boolean r1 = r0.xt(r1, r2)
            return r1
    }

    public java.lang.Boolean xt(org.json.JSONObject r1, java.lang.Object[] r2) {
            r0 = this;
            if (r2 == 0) goto L16
            int r1 = r2.length
            if (r1 > 0) goto L6
            goto L16
        L6:
            r1 = 0
            r1 = r2[r1]     // Catch: java.lang.NumberFormatException -> L13
            java.lang.String r1 = java.lang.String.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L13
            java.lang.Double.parseDouble(r1)     // Catch: java.lang.NumberFormatException -> L13
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            return r1
        L13:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
        L16:
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            return r1
    }
}

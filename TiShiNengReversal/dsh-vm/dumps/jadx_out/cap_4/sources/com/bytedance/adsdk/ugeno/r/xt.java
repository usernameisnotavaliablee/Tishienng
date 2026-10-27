package com.bytedance.adsdk.ugeno.r;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class xt {
    public xt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(java.lang.String r3, org.json.JSONObject r4) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 != 0) goto L43
            if (r4 != 0) goto L9
            goto L43
        L9:
            java.lang.String r0 = "${"
            boolean r0 = r3.startsWith(r0)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L3f
            java.lang.String r0 = "}"
            boolean r0 = r3.endsWith(r0)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L3f
            com.bytedance.adsdk.ugeno.r r0 = com.bytedance.adsdk.ugeno.r.j()     // Catch: java.lang.Throwable -> L3d
            com.bytedance.adsdk.ugeno.r.j r0 = r0.cw()     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L24
            goto L3f
        L24:
            int r1 = r3.length()     // Catch: java.lang.Throwable -> L3d
            int r1 = r1 + (-1)
            r2 = 2
            java.lang.String r1 = r3.substring(r2, r1)     // Catch: java.lang.Throwable -> L3d
            com.bytedance.adsdk.ugeno.r.j$j r0 = r0.j(r1)     // Catch: java.lang.Throwable -> L3d
            if (r0 != 0) goto L36
            goto L3f
        L36:
            java.lang.Object r4 = r0.j(r4)     // Catch: java.lang.Throwable -> L3d
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L3d
            return r4
        L3d:
            r4 = move-exception
            goto L40
        L3f:
            return r3
        L40:
            com.bytedance.sdk.component.utils.vl.j(r4)
        L43:
            return r3
    }
}

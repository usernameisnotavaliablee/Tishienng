package com.bytedance.adsdk.ugeno.up;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class vl {
    public vl() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.bytedance.adsdk.ugeno.up.m.j j(java.lang.String r5, org.json.JSONObject r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            com.bytedance.adsdk.ugeno.up.m$j r0 = new com.bytedance.adsdk.ugeno.up.m$j
            r0.<init>()
            java.lang.String r5 = com.bytedance.adsdk.ugeno.r.xt.j(r5, r6)
            android.net.Uri r2 = android.net.Uri.parse(r5)
            if (r2 != 0) goto L18
            return r1
        L18:
            r0.cw(r5)
            java.lang.String r5 = r2.getScheme()
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L2c
            java.lang.String r5 = r2.getScheme()
            r0.j(r5)
        L2c:
            java.lang.String r5 = r2.getAuthority()
            boolean r1 = android.text.TextUtils.isEmpty(r5)
            if (r1 == 0) goto L3a
            java.lang.String r5 = r2.getPath()
        L3a:
            r0.xt(r5)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r1 = r0.j()
            r5.append(r1)
            java.lang.String r1 = "://"
            r5.append(r1)
            java.lang.String r1 = r0.xt()
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            r0.r(r5)
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.Set r1 = r2.getQueryParameterNames()
            if (r1 == 0) goto L89
            int r3 = r1.size()
            if (r3 <= 0) goto L89
            java.util.Iterator r1 = r1.iterator()
        L71:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L89
            java.lang.Object r3 = r1.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = r2.getQueryParameter(r3)
            java.lang.String r4 = com.bytedance.adsdk.ugeno.r.xt.j(r4, r6)
            r5.put(r3, r4)
            goto L71
        L89:
            r0.j(r5)
            return r0
    }
}

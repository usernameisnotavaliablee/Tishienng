package com.bytedance.msdk.tl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class gq {
    private static java.lang.String j;

    public gq() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.String j(java.lang.String r4) {
            boolean r0 = j()     // Catch: java.lang.Throwable -> L45
            if (r0 != 0) goto L7
            goto L45
        L7:
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r0.x()     // Catch: java.lang.Throwable -> L45
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L45
            if (r1 == 0) goto L16
            goto L45
        L16:
            java.lang.String r1 = "TestHelperUtils"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "AnyDoorId="
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L45
            r2.append(r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L45
            com.bytedance.msdk.j.up.cw.j(r1, r2)     // Catch: java.lang.Throwable -> L45
            android.net.Uri r1 = android.net.Uri.parse(r4)     // Catch: java.lang.Throwable -> L45
            android.net.Uri$Builder r1 = r1.buildUpon()     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = xt()     // Catch: java.lang.Throwable -> L45
            android.net.Uri$Builder r0 = r1.appendQueryParameter(r2, r0)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = "aid"
            java.lang.String r2 = "5001121"
            android.net.Uri$Builder r0 = r0.appendQueryParameter(r1, r2)     // Catch: java.lang.Throwable -> L45
            java.lang.String r4 = r0.toString()     // Catch: java.lang.Throwable -> L45
        L45:
            return r4
    }

    public static boolean j() {
            boolean r0 = com.bytedance.msdk.j.up.cw.xt()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.ch()
            if (r0 == 0) goto L1e
            com.bytedance.msdk.core.j r0 = com.bytedance.msdk.core.j.qv()
            boolean r0 = r0.s()
            if (r0 == 0) goto L1e
            r0 = 1
            return r0
        L1e:
            return r1
    }

    public static java.lang.String xt() {
            java.lang.String r0 = com.bytedance.msdk.tl.gq.j
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            java.lang.String r0 = new java.lang.String
            java.lang.String r1 = "ZGV2aWNlX2lk"
            r2 = 0
            byte[] r1 = android.util.Base64.decode(r1, r2)
            r0.<init>(r1)
            com.bytedance.msdk.tl.gq.j = r0
        L16:
            java.lang.String r0 = com.bytedance.msdk.tl.gq.j
            return r0
    }
}

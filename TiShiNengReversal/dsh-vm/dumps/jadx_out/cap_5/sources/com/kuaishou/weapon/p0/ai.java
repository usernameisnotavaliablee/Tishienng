package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class ai {
    public ai() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.json.JSONObject a(android.content.Context r3) {
            java.lang.String r3 = "http.proxyHost"
            java.lang.String r3 = java.lang.System.getProperty(r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r0 = "http.proxyPort"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L2e
            if (r0 == 0) goto Lf
            goto L11
        Lf:
            java.lang.String r0 = "-1"
        L11:
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L2e
            boolean r1 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L2e
            if (r1 != 0) goto L2e
            r1 = -1
            if (r0 == r1) goto L2e
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L2e
            r1.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = "h"
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = "p"
            r1.put(r3, r0)     // Catch: java.lang.Throwable -> L2e
            return r1
        L2e:
            r3 = 0
            return r3
    }
}

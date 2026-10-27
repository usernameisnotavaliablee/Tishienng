package com.huawei.hms.framework.network.grs.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class b {
    private final android.content.Context a;
    private final com.huawei.hms.framework.network.grs.GrsBaseInfo b;
    private final n1.a c;

    public b(android.content.Context r1, n1.a r2, com.huawei.hms.framework.network.grs.GrsBaseInfo r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r3
            r0.c = r2
            return
    }

    public java.lang.String a(boolean r13) {
            r12 = this;
            n1.a r0 = r12.c
            n1.c r0 = r0.b()
            java.lang.String r1 = "geoipCountryCode"
            java.lang.String r2 = ""
            java.lang.String r0 = r0.a(r1, r2)
            java.lang.String r1 = "geoip.countrycode"
            java.util.Map r0 = com.huawei.hms.framework.network.grs.a.g(r0, r1)
            java.lang.String r3 = "ROOT"
            java.lang.Object r0 = r0.get(r3)
            r4 = r0
            java.lang.String r4 = (java.lang.String) r4
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "geoIpCountry is: "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r5 = "GeoipCountry"
            com.huawei.hms.framework.common.Logger.i(r5, r0)
            n1.a r0 = r12.c
            n1.c r0 = r0.b()
            java.lang.String r6 = "geoipCountryCodetime"
            java.lang.String r7 = "0"
            java.lang.String r0 = r0.a(r6, r7)
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            r7 = 0
            if (r6 != 0) goto L5c
            java.lang.String r6 = "\\d+"
            boolean r6 = r0.matches(r6)
            if (r6 == 0) goto L5c
            long r7 = java.lang.Long.parseLong(r0)     // Catch: java.lang.NumberFormatException -> L56
            goto L5c
        L56:
            r0 = move-exception
            java.lang.String r6 = "convert urlParamKey from String to Long catch NumberFormatException."
            com.huawei.hms.framework.common.Logger.w(r5, r6, r0)
        L5c:
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L6c
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            boolean r0 = q1.e.a(r0)
            if (r0 == 0) goto Lf2
        L6c:
            p1.c r7 = new p1.c
            com.huawei.hms.framework.network.grs.GrsBaseInfo r0 = r12.b
            android.content.Context r6 = r12.a
            r7.<init>(r0, r6)
            r7.b(r1)
            n1.a r0 = r12.c
            n1.c r10 = r0.i()
            if (r10 == 0) goto Lad
            java.lang.String r6 = "services"
            java.lang.String r0 = r10.a(r6, r2)
            java.lang.String r2 = r7.d()     // Catch: org.json.JSONException -> L8f
            java.lang.String r0 = com.huawei.hms.framework.network.grs.g.h.a(r0, r2)     // Catch: org.json.JSONException -> L8f
            goto La4
        L8f:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r8 = 0
            r2[r8] = r0
            java.lang.String r0 = "getGeoipCountry merge services occure jsonException. %s"
            com.huawei.hms.framework.common.Logger.w(r5, r0, r2)
            r0 = 0
        La4:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto Lad
            r10.f(r6, r0)
        Lad:
            if (r13 == 0) goto Le0
            n1.a r13 = r12.c
            com.huawei.hms.framework.network.grs.g.g r13 = r13.g()
            r0 = -1
            com.huawei.hms.framework.network.grs.g.d r13 = r13.a(r7, r1, r10, r0)
            if (r13 == 0) goto Lcb
            java.lang.String r13 = r13.y()
            java.util.Map r13 = com.huawei.hms.framework.network.grs.a.g(r13, r1)
            java.lang.Object r13 = r13.get(r3)
            r4 = r13
            java.lang.String r4 = (java.lang.String) r4
        Lcb:
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            java.lang.String r0 = "sync request to query geoip.countrycode is:"
            r13.append(r0)
            r13.append(r4)
            java.lang.String r13 = r13.toString()
            com.huawei.hms.framework.common.Logger.i(r5, r13)
            goto Lf2
        Le0:
            java.lang.String r13 = "async request to query geoip.countrycode"
            com.huawei.hms.framework.common.Logger.i(r5, r13)
            n1.a r13 = r12.c
            com.huawei.hms.framework.network.grs.g.g r6 = r13.g()
            java.lang.String r9 = "geoip.countrycode"
            r11 = -1
            r8 = 0
            r6.h(r7, r8, r9, r10, r11)
        Lf2:
            return r4
    }
}

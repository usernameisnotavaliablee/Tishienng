package com.huawei.hms.framework.network.grs.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    private static final java.lang.String a = "e";
    public static final java.util.Set<java.lang.String> b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a extends java.util.HashSet<java.lang.String> {
        a(int r1) {
                r0 = this;
                r0.<init>(r1)
                java.lang.String r1 = "ser_country"
                r0.add(r1)
                java.lang.String r1 = "reg_country"
                r0.add(r1)
                java.lang.String r1 = "issue_country"
                r0.add(r1)
                java.lang.String r1 = "geo_ip"
                r0.add(r1)
                return
        }
    }

    static {
            com.huawei.hms.framework.network.grs.f.e$a r0 = new com.huawei.hms.framework.network.grs.f.e$a
            r1 = 16
            r0.<init>(r1)
            java.util.Set r0 = java.util.Collections.unmodifiableSet(r0)
            com.huawei.hms.framework.network.grs.f.e.b = r0
            return
    }

    public e() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a(android.content.Context r9, n1.a r10, java.lang.String r11, com.huawei.hms.framework.network.grs.GrsBaseInfo r12, boolean r13) {
            java.lang.String r0 = r12.getSerCountry()
            java.lang.String r1 = r12.getRegCountry()
            java.lang.String r2 = r12.getIssueCountry()
            java.lang.String r3 = ">"
            java.lang.String[] r11 = r11.split(r3)
            int r3 = r11.length
            r4 = 0
        L14:
            if (r4 >= r3) goto Le3
            r5 = r11[r4]
            java.util.Set<java.lang.String> r6 = com.huawei.hms.framework.network.grs.f.e.b
            java.lang.String r7 = r5.trim()
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto Ldf
            java.lang.String r6 = r5.trim()
            java.lang.String r7 = "ser_country"
            boolean r6 = r7.equals(r6)
            java.lang.String r7 = "UNKNOWN"
            if (r6 == 0) goto L55
            boolean r6 = android.text.TextUtils.isEmpty(r0)
            if (r6 != 0) goto L55
            boolean r6 = r7.equals(r0)
            if (r6 != 0) goto L55
            java.lang.String r9 = com.huawei.hms.framework.network.grs.f.e.a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "current route_by is serCountry and routerCountry is: "
            r10.append(r11)
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            com.huawei.hms.framework.common.Logger.i(r9, r10)
            return r0
        L55:
            java.lang.String r6 = r5.trim()
            java.lang.String r8 = "reg_country"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L84
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            if (r6 != 0) goto L84
            boolean r6 = r7.equals(r1)
            if (r6 != 0) goto L84
            java.lang.String r9 = com.huawei.hms.framework.network.grs.f.e.a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "current route_by is regCountry and routerCountry is: "
            r10.append(r11)
            r10.append(r1)
            java.lang.String r10 = r10.toString()
            com.huawei.hms.framework.common.Logger.i(r9, r10)
            return r1
        L84:
            java.lang.String r6 = r5.trim()
            java.lang.String r8 = "issue_country"
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto Lb3
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto Lb3
            boolean r6 = r7.equals(r2)
            if (r6 != 0) goto Lb3
            java.lang.String r9 = com.huawei.hms.framework.network.grs.f.e.a
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r11 = "current route_by is issueCountry and routerCountry is: "
            r10.append(r11)
            r10.append(r2)
            java.lang.String r10 = r10.toString()
            com.huawei.hms.framework.common.Logger.i(r9, r10)
            return r2
        Lb3:
            java.lang.String r5 = r5.trim()
            java.lang.String r6 = "geo_ip"
            boolean r5 = r6.equals(r5)
            if (r5 == 0) goto Ldf
            com.huawei.hms.framework.network.grs.g.b r11 = new com.huawei.hms.framework.network.grs.g.b
            r11.<init>(r9, r10, r12)
            java.lang.String r9 = r11.a(r13)
            java.lang.String r10 = com.huawei.hms.framework.network.grs.f.e.a
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = "current route_by is geo_ip and routerCountry is: "
            r11.append(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.huawei.hms.framework.common.Logger.i(r10, r11)
            return r9
        Ldf:
            int r4 = r4 + 1
            goto L14
        Le3:
            java.lang.String r9 = ""
            return r9
    }

    public static java.lang.String b(android.content.Context r1, n1.a r2, java.lang.String r3, com.huawei.hms.framework.network.grs.GrsBaseInfo r4, boolean r5) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Lf
            java.lang.String r1 = com.huawei.hms.framework.network.grs.f.e.a
            java.lang.String r2 = "routeBy must be not empty string or null."
            com.huawei.hms.framework.common.Logger.w(r1, r2)
            r1 = 0
            return r1
        Lf:
            java.lang.String r0 = "no_route"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L25
            java.lang.String r0 = "unconditional"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L20
            goto L25
        L20:
            java.lang.String r1 = a(r1, r2, r3, r4, r5)
            return r1
        L25:
            java.lang.String r1 = com.huawei.hms.framework.network.grs.f.e.a
            java.lang.String r2 = "routeBy equals NO_ROUTE_POLICY"
            com.huawei.hms.framework.common.Logger.v(r1, r2)
            java.lang.String r1 = "no_route_country"
            return r1
    }
}

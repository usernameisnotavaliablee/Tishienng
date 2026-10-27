package com.huawei.hms.framework.network.grs.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class d extends com.huawei.hms.framework.network.grs.f.a {
    public d(android.content.Context r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            r0.d = r3
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 == 0) goto Ld
            java.lang.String r2 = "grs_app_global_route_config.json"
        Ld:
            int r1 = r0.a(r2, r1)
            if (r1 != 0) goto L16
            r1 = 1
            r0.c = r1
        L16:
            return
    }

    public d(boolean r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.d = r2
            r0.c = r1
            return
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int i(java.lang.String r6) {
            r5 = this;
            java.lang.String r0 = "customservices"
            t1.a r1 = new t1.a
            r1.<init>()
            r5.a = r1
            r1 = -1
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: org.json.JSONException -> L42
            r3.<init>(r6)     // Catch: org.json.JSONException -> L42
            java.lang.String r6 = "applications"
            org.json.JSONArray r6 = r3.getJSONArray(r6)     // Catch: org.json.JSONException -> L42
            org.json.JSONObject r6 = r6.getJSONObject(r2)     // Catch: org.json.JSONException -> L42
            java.lang.String r3 = "name"
            java.lang.String r3 = r6.getString(r3)     // Catch: org.json.JSONException -> L42
            t1.a r4 = r5.a     // Catch: org.json.JSONException -> L42
            r4.e(r3)     // Catch: org.json.JSONException -> L42
            java.lang.String r3 = "services"
            org.json.JSONArray r3 = r6.getJSONArray(r3)     // Catch: org.json.JSONException -> L42
            if (r3 == 0) goto L45
            int r3 = r3.length()     // Catch: org.json.JSONException -> L42
            if (r3 != 0) goto L34
            goto L45
        L34:
            boolean r3 = r6.has(r0)     // Catch: org.json.JSONException -> L42
            if (r3 == 0) goto L44
            org.json.JSONArray r6 = r6.getJSONArray(r0)     // Catch: org.json.JSONException -> L42
            r5.l(r6)     // Catch: org.json.JSONException -> L42
            goto L44
        L42:
            r6 = move-exception
            goto L46
        L44:
            return r2
        L45:
            return r1
        L46:
            java.lang.String r6 = r6.getMessage()
            java.lang.String r6 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r6)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r6
            java.lang.String r6 = "LocalManagerV2"
            java.lang.String r2 = "parse appbean failed maybe json style is wrong. %s"
            com.huawei.hms.framework.common.Logger.w(r6, r2, r0)
            return r1
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int m(java.lang.String r14) {
            r13 = this;
            java.lang.String r0 = "countries"
            java.lang.String r1 = "countriesOrAreas"
            java.lang.String r2 = "countryGroups"
            java.lang.String r3 = "countryOrAreaGroups"
            java.lang.String r4 = "LocalManagerV2"
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 16
            r5.<init>(r6)
            r13.b = r5
            r5 = 0
            r7 = -1
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: org.json.JSONException -> L26
            r8.<init>(r14)     // Catch: org.json.JSONException -> L26
            boolean r14 = r8.has(r3)     // Catch: org.json.JSONException -> L26
            r9 = 0
            if (r14 == 0) goto L29
            org.json.JSONArray r14 = r8.getJSONArray(r3)     // Catch: org.json.JSONException -> L26
            goto L3a
        L26:
            r14 = move-exception
            goto Lb8
        L29:
            boolean r14 = r8.has(r2)     // Catch: org.json.JSONException -> L26
            if (r14 == 0) goto L34
            org.json.JSONArray r14 = r8.getJSONArray(r2)     // Catch: org.json.JSONException -> L26
            goto L3a
        L34:
            java.lang.String r14 = "maybe local config json is wrong because the default countryOrAreaGroups isn't config."
            com.huawei.hms.framework.common.Logger.e(r4, r14)     // Catch: org.json.JSONException -> L26
            r14 = r9
        L3a:
            if (r14 != 0) goto L3d
            return r7
        L3d:
            int r2 = r14.length()     // Catch: org.json.JSONException -> L26
            if (r2 == 0) goto Lb7
            r2 = 0
        L44:
            int r3 = r14.length()     // Catch: org.json.JSONException -> L26
            if (r2 >= r3) goto Lb7
            org.json.JSONObject r3 = r14.getJSONObject(r2)     // Catch: org.json.JSONException -> L26
            t1.b r8 = new t1.b     // Catch: org.json.JSONException -> L26
            r8.<init>()     // Catch: org.json.JSONException -> L26
            java.lang.String r10 = "id"
            java.lang.String r10 = r3.getString(r10)     // Catch: org.json.JSONException -> L26
            r8.e(r10)     // Catch: org.json.JSONException -> L26
            java.lang.String r10 = "name"
            java.lang.String r10 = r3.getString(r10)     // Catch: org.json.JSONException -> L26
            r8.f(r10)     // Catch: org.json.JSONException -> L26
            java.lang.String r10 = "description"
            java.lang.String r10 = r3.getString(r10)     // Catch: org.json.JSONException -> L26
            r8.b(r10)     // Catch: org.json.JSONException -> L26
            boolean r10 = r3.has(r1)     // Catch: org.json.JSONException -> L26
            if (r10 == 0) goto L79
            org.json.JSONArray r3 = r3.getJSONArray(r1)     // Catch: org.json.JSONException -> L26
            goto L8a
        L79:
            boolean r10 = r3.has(r0)     // Catch: org.json.JSONException -> L26
            if (r10 == 0) goto L84
            org.json.JSONArray r3 = r3.getJSONArray(r0)     // Catch: org.json.JSONException -> L26
            goto L8a
        L84:
            java.lang.String r3 = "current country or area group has not config countries or areas."
            com.huawei.hms.framework.common.Logger.w(r4, r3)     // Catch: org.json.JSONException -> L26
            r3 = r9
        L8a:
            java.util.HashSet r10 = new java.util.HashSet     // Catch: org.json.JSONException -> L26
            r10.<init>(r6)     // Catch: org.json.JSONException -> L26
            if (r3 == 0) goto Lb6
            int r11 = r3.length()     // Catch: org.json.JSONException -> L26
            if (r11 != 0) goto L98
            goto Lb6
        L98:
            r11 = 0
        L99:
            int r12 = r3.length()     // Catch: org.json.JSONException -> L26
            if (r11 >= r12) goto Lab
            java.lang.Object r12 = r3.get(r11)     // Catch: org.json.JSONException -> L26
            java.lang.String r12 = (java.lang.String) r12     // Catch: org.json.JSONException -> L26
            r10.add(r12)     // Catch: org.json.JSONException -> L26
            int r11 = r11 + 1
            goto L99
        Lab:
            r8.c(r10)     // Catch: org.json.JSONException -> L26
            java.util.List<t1.b> r3 = r13.b     // Catch: org.json.JSONException -> L26
            r3.add(r8)     // Catch: org.json.JSONException -> L26
            int r2 = r2 + 1
            goto L44
        Lb6:
            return r7
        Lb7:
            return r5
        Lb8:
            java.lang.String r14 = r14.getMessage()
            java.lang.String r14 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r14)
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r5] = r14
            java.lang.String r14 = "parse countrygroup failed maybe json style is wrong. %s"
            com.huawei.hms.framework.common.Logger.w(r4, r14, r0)
            return r7
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int q(java.lang.String r1) {
            r0 = this;
            int r1 = r0.p(r1)
            return r1
    }
}

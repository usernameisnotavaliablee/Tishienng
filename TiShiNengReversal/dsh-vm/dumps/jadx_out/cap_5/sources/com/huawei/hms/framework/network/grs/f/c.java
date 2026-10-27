package com.huawei.hms.framework.network.grs.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class c extends com.huawei.hms.framework.network.grs.f.a {
    public c(android.content.Context r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.d = r2
            java.lang.String r2 = "grs_sdk_global_route_config.json"
            int r1 = r0.a(r2, r1)
            if (r1 != 0) goto L10
            r1 = 1
            r0.c = r1
        L10:
            return
    }

    private java.util.List<t1.b> u(org.json.JSONObject r13) {
            r12 = this;
            java.lang.String r0 = "LocalManagerV1"
            java.lang.String r1 = "countries"
            java.lang.String r2 = "countriesOrAreas"
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: org.json.JSONException -> L47
            r5 = 16
            r4.<init>(r5)     // Catch: org.json.JSONException -> L47
            java.util.Iterator r6 = r13.keys()     // Catch: org.json.JSONException -> L47
        L12:
            boolean r7 = r6.hasNext()     // Catch: org.json.JSONException -> L47
            if (r7 == 0) goto L88
            java.lang.Object r7 = r6.next()     // Catch: org.json.JSONException -> L47
            java.lang.String r7 = (java.lang.String) r7     // Catch: org.json.JSONException -> L47
            t1.b r8 = new t1.b     // Catch: org.json.JSONException -> L47
            r8.<init>()     // Catch: org.json.JSONException -> L47
            r8.e(r7)     // Catch: org.json.JSONException -> L47
            org.json.JSONObject r7 = r13.getJSONObject(r7)     // Catch: org.json.JSONException -> L47
            java.lang.String r9 = "name"
            java.lang.String r9 = r7.getString(r9)     // Catch: org.json.JSONException -> L47
            r8.f(r9)     // Catch: org.json.JSONException -> L47
            java.lang.String r9 = "description"
            java.lang.String r9 = r7.getString(r9)     // Catch: org.json.JSONException -> L47
            r8.b(r9)     // Catch: org.json.JSONException -> L47
            boolean r9 = r7.has(r2)     // Catch: org.json.JSONException -> L47
            if (r9 == 0) goto L49
            org.json.JSONArray r7 = r7.getJSONArray(r2)     // Catch: org.json.JSONException -> L47
            goto L5a
        L47:
            r13 = move-exception
            goto L89
        L49:
            boolean r9 = r7.has(r1)     // Catch: org.json.JSONException -> L47
            if (r9 == 0) goto L54
            org.json.JSONArray r7 = r7.getJSONArray(r1)     // Catch: org.json.JSONException -> L47
            goto L5a
        L54:
            java.lang.String r7 = "current country or area group has not config countries or areas."
            com.huawei.hms.framework.common.Logger.w(r0, r7)     // Catch: org.json.JSONException -> L47
            r7 = 0
        L5a:
            java.util.HashSet r9 = new java.util.HashSet     // Catch: org.json.JSONException -> L47
            r9.<init>(r5)     // Catch: org.json.JSONException -> L47
            if (r7 == 0) goto L82
            int r10 = r7.length()     // Catch: org.json.JSONException -> L47
            if (r10 != 0) goto L68
            goto L82
        L68:
            r10 = 0
        L69:
            int r11 = r7.length()     // Catch: org.json.JSONException -> L47
            if (r10 >= r11) goto L7b
            java.lang.Object r11 = r7.get(r10)     // Catch: org.json.JSONException -> L47
            java.lang.String r11 = (java.lang.String) r11     // Catch: org.json.JSONException -> L47
            r9.add(r11)     // Catch: org.json.JSONException -> L47
            int r10 = r10 + 1
            goto L69
        L7b:
            r8.c(r9)     // Catch: org.json.JSONException -> L47
            r4.add(r8)     // Catch: org.json.JSONException -> L47
            goto L12
        L82:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: org.json.JSONException -> L47
            r13.<init>()     // Catch: org.json.JSONException -> L47
            return r13
        L88:
            return r4
        L89:
            java.lang.String r13 = r13.getMessage()
            java.lang.String r13 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r13)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r13
            java.lang.String r13 = "parse countryGroups failed maybe json style is wrong. %s"
            com.huawei.hms.framework.common.Logger.w(r0, r13, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            return r13
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int i(java.lang.String r7) {
            r6 = this;
            t1.a r0 = new t1.a
            r0.<init>()
            r6.a = r0
            r0 = 0
            r1 = -1
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L3a
            r2.<init>(r7)     // Catch: org.json.JSONException -> L3a
            java.lang.String r7 = "application"
            org.json.JSONObject r7 = r2.getJSONObject(r7)     // Catch: org.json.JSONException -> L3a
            java.lang.String r2 = "name"
            java.lang.String r2 = r7.getString(r2)     // Catch: org.json.JSONException -> L3a
            java.lang.String r3 = "cacheControl"
            long r3 = r7.getLong(r3)     // Catch: org.json.JSONException -> L3a
            java.lang.String r5 = "services"
            org.json.JSONArray r7 = r7.getJSONArray(r5)     // Catch: org.json.JSONException -> L3a
            t1.a r5 = r6.a     // Catch: org.json.JSONException -> L3a
            r5.e(r2)     // Catch: org.json.JSONException -> L3a
            t1.a r2 = r6.a     // Catch: org.json.JSONException -> L3a
            r2.c(r3)     // Catch: org.json.JSONException -> L3a
            if (r7 == 0) goto L3c
            int r7 = r7.length()     // Catch: org.json.JSONException -> L3a
            if (r7 != 0) goto L39
            goto L3c
        L39:
            return r0
        L3a:
            r7 = move-exception
            goto L3d
        L3c:
            return r1
        L3d:
            java.lang.String r7 = r7.getMessage()
            java.lang.String r7 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r7)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r0] = r7
            java.lang.String r7 = "LocalManagerV1"
            java.lang.String r0 = "parse appbean failed maybe json style is wrong. %s"
            com.huawei.hms.framework.common.Logger.w(r7, r0, r2)
            return r1
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int m(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "LocalManagerV1"
            java.lang.String r1 = "countryGroups"
            java.lang.String r2 = "countryOrAreaGroups"
            java.util.ArrayList r3 = new java.util.ArrayList
            r4 = 16
            r3.<init>(r4)
            r6.b = r3
            r3 = 0
            r4 = -1
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: org.json.JSONException -> L21
            r5.<init>(r7)     // Catch: org.json.JSONException -> L21
            boolean r7 = r5.has(r2)     // Catch: org.json.JSONException -> L21
            if (r7 == 0) goto L23
            org.json.JSONObject r7 = r5.getJSONObject(r2)     // Catch: org.json.JSONException -> L21
            goto L34
        L21:
            r7 = move-exception
            goto L47
        L23:
            boolean r7 = r5.has(r1)     // Catch: org.json.JSONException -> L21
            if (r7 == 0) goto L2e
            org.json.JSONObject r7 = r5.getJSONObject(r1)     // Catch: org.json.JSONException -> L21
            goto L34
        L2e:
            java.lang.String r7 = "maybe local config json is wrong because the default countryOrAreaGroups isn't config."
            com.huawei.hms.framework.common.Logger.e(r0, r7)     // Catch: org.json.JSONException -> L21
            r7 = 0
        L34:
            if (r7 != 0) goto L37
            return r4
        L37:
            int r1 = r7.length()     // Catch: org.json.JSONException -> L21
            if (r1 == 0) goto L46
            java.util.List<t1.b> r1 = r6.b     // Catch: org.json.JSONException -> L21
            java.util.List r7 = r6.u(r7)     // Catch: org.json.JSONException -> L21
            r1.addAll(r7)     // Catch: org.json.JSONException -> L21
        L46:
            return r3
        L47:
            java.lang.String r7 = r7.getMessage()
            java.lang.String r7 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r7)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            java.lang.String r7 = "parse countrygroup failed maybe json style is wrong. %s"
            com.huawei.hms.framework.common.Logger.w(r0, r7, r1)
            return r4
    }

    @Override // com.huawei.hms.framework.network.grs.f.a
    public int q(java.lang.String r21) {
            r20 = this;
            r1 = r20
            java.lang.String r0 = "countryGroups"
            java.lang.String r2 = "countryOrAreaGroups"
            java.lang.String r3 = "countryGroup"
            java.lang.String r4 = "countryOrAreaGroup"
            java.lang.String r5 = "LocalManagerV1"
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch: org.json.JSONException -> L72
            r8 = r21
            r7.<init>(r8)     // Catch: org.json.JSONException -> L72
            java.lang.String r8 = "services"
            org.json.JSONObject r7 = r7.getJSONObject(r8)     // Catch: org.json.JSONException -> L72
            java.util.Iterator r8 = r7.keys()     // Catch: org.json.JSONException -> L72
        L1d:
            boolean r9 = r8.hasNext()     // Catch: org.json.JSONException -> L72
            if (r9 == 0) goto L12b
            java.lang.Object r9 = r8.next()     // Catch: org.json.JSONException -> L72
            java.lang.String r9 = (java.lang.String) r9     // Catch: org.json.JSONException -> L72
            t1.c r10 = new t1.c     // Catch: org.json.JSONException -> L72
            r10.<init>()     // Catch: org.json.JSONException -> L72
            r10.f(r9)     // Catch: org.json.JSONException -> L72
            java.util.Set<java.lang.String> r11 = r1.e     // Catch: org.json.JSONException -> L72
            boolean r11 = r11.contains(r9)     // Catch: org.json.JSONException -> L72
            if (r11 != 0) goto L1d
            java.util.Set<java.lang.String> r11 = r1.e     // Catch: org.json.JSONException -> L72
            r11.add(r9)     // Catch: org.json.JSONException -> L72
            boolean r11 = r1.d     // Catch: org.json.JSONException -> L72
            if (r11 == 0) goto L1d
            org.json.JSONObject r11 = r7.getJSONObject(r9)     // Catch: org.json.JSONException -> L72
            java.lang.String r12 = "routeBy"
            java.lang.String r12 = r11.getString(r12)     // Catch: org.json.JSONException -> L72
            r10.g(r12)     // Catch: org.json.JSONException -> L72
            java.lang.String r12 = "servings"
            org.json.JSONArray r12 = r11.getJSONArray(r12)     // Catch: org.json.JSONException -> L72
            r13 = 0
        L56:
            int r14 = r12.length()     // Catch: org.json.JSONException -> L72
            if (r13 >= r14) goto Lec
            java.lang.Object r14 = r12.get(r13)     // Catch: org.json.JSONException -> L72
            org.json.JSONObject r14 = (org.json.JSONObject) r14     // Catch: org.json.JSONException -> L72
            t1.d r15 = new t1.d     // Catch: org.json.JSONException -> L72
            r15.<init>()     // Catch: org.json.JSONException -> L72
            boolean r16 = r14.has(r4)     // Catch: org.json.JSONException -> L72
            if (r16 == 0) goto L77
            java.lang.String r16 = r14.getString(r4)     // Catch: org.json.JSONException -> L72
            goto L81
        L72:
            r0 = move-exception
            r16 = 0
            goto L12e
        L77:
            boolean r16 = r14.has(r3)     // Catch: org.json.JSONException -> L72
            if (r16 == 0) goto L86
            java.lang.String r16 = r14.getString(r3)     // Catch: org.json.JSONException -> L72
        L81:
            r6 = r16
            r16 = 0
            goto L8f
        L86:
            r16 = 0
            java.lang.String r6 = "maybe this service routeBy is unconditional."
            com.huawei.hms.framework.common.Logger.v(r5, r6)     // Catch: org.json.JSONException -> Ld3
            java.lang.String r6 = "no-country"
        L8f:
            r15.b(r6)     // Catch: org.json.JSONException -> Ld3
            java.lang.String r6 = "addresses"
            org.json.JSONObject r6 = r14.getJSONObject(r6)     // Catch: org.json.JSONException -> Ld3
            java.util.concurrent.ConcurrentHashMap r14 = new java.util.concurrent.ConcurrentHashMap     // Catch: org.json.JSONException -> Ld3
            r17 = r3
            r3 = 16
            r14.<init>(r3)     // Catch: org.json.JSONException -> Ld3
            java.util.Iterator r3 = r6.keys()     // Catch: org.json.JSONException -> Ld3
        La5:
            boolean r18 = r3.hasNext()     // Catch: org.json.JSONException -> Ld3
            if (r18 == 0) goto Ld8
            java.lang.Object r18 = r3.next()     // Catch: org.json.JSONException -> Ld3
            r21 = r3
            r3 = r18
            java.lang.String r3 = (java.lang.String) r3     // Catch: org.json.JSONException -> Ld3
            java.lang.String r18 = r6.getString(r3)     // Catch: org.json.JSONException -> Ld3
            boolean r19 = android.text.TextUtils.isEmpty(r3)     // Catch: org.json.JSONException -> Ld3
            if (r19 != 0) goto Ld5
            boolean r18 = android.text.TextUtils.isEmpty(r18)     // Catch: org.json.JSONException -> Ld3
            if (r18 != 0) goto Ld5
            r18 = r4
            java.lang.String r4 = r6.getString(r3)     // Catch: org.json.JSONException -> Ld3
            r14.put(r3, r4)     // Catch: org.json.JSONException -> Ld3
            r3 = r21
            r4 = r18
            goto La5
        Ld3:
            r0 = move-exception
            goto L12e
        Ld5:
            r3 = r21
            goto La5
        Ld8:
            r18 = r4
            r15.c(r14)     // Catch: org.json.JSONException -> Ld3
            java.lang.String r3 = r15.d()     // Catch: org.json.JSONException -> Ld3
            r10.c(r3, r15)     // Catch: org.json.JSONException -> Ld3
            int r13 = r13 + 1
            r3 = r17
            r4 = r18
            goto L56
        Lec:
            r17 = r3
            r18 = r4
            r16 = 0
            boolean r3 = r11.has(r2)     // Catch: org.json.JSONException -> Ld3
            r4 = 0
            if (r3 == 0) goto Lfe
            org.json.JSONObject r3 = r11.getJSONObject(r2)     // Catch: org.json.JSONException -> Ld3
            goto L108
        Lfe:
            boolean r3 = r11.has(r0)     // Catch: org.json.JSONException -> Ld3
            if (r3 == 0) goto L10d
            org.json.JSONObject r3 = r11.getJSONObject(r0)     // Catch: org.json.JSONException -> Ld3
        L108:
            java.util.List r4 = r1.t(r4, r3)     // Catch: org.json.JSONException -> Ld3
            goto L112
        L10d:
            java.lang.String r3 = "service use default countryOrAreaGroup"
            com.huawei.hms.framework.common.Logger.v(r5, r3)     // Catch: org.json.JSONException -> Ld3
        L112:
            r10.d(r4)     // Catch: org.json.JSONException -> Ld3
            t1.a r3 = r1.a     // Catch: org.json.JSONException -> Ld3
            if (r3 != 0) goto L120
            t1.a r3 = new t1.a     // Catch: org.json.JSONException -> Ld3
            r3.<init>()     // Catch: org.json.JSONException -> Ld3
            r1.a = r3     // Catch: org.json.JSONException -> Ld3
        L120:
            t1.a r3 = r1.a     // Catch: org.json.JSONException -> Ld3
            r3.d(r9, r10)     // Catch: org.json.JSONException -> Ld3
            r3 = r17
            r4 = r18
            goto L1d
        L12b:
            r16 = 0
            return r16
        L12e:
            java.lang.String r0 = r0.getMessage()
            java.lang.String r0 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r0)
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r16] = r0
            java.lang.String r0 = "parse 1.0 services failed maybe because of json style.please check! %s"
            com.huawei.hms.framework.common.Logger.w(r5, r0, r2)
            r0 = -1
            return r0
    }

    public java.util.List<t1.b> t(org.json.JSONArray r1, org.json.JSONObject r2) {
            r0 = this;
            if (r2 == 0) goto Le
            int r1 = r2.length()
            if (r1 != 0) goto L9
            goto Le
        L9:
            java.util.List r1 = r0.u(r2)
            return r1
        Le:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            return r1
    }
}

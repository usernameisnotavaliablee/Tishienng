package com.huawei.hms.framework.network.grs.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public abstract class a {
    protected t1.a a;
    protected java.util.List<t1.b> b;
    protected boolean c;
    protected boolean d;
    protected java.util.Set<java.lang.String> e;

    public a() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.c = r0
            r2.d = r0
            java.util.HashSet r0 = new java.util.HashSet
            r1 = 16
            r0.<init>(r1)
            r2.e = r0
            return
    }

    private java.util.Map<java.lang.String, java.lang.String> f(java.util.List<t1.b> r5, com.huawei.hms.framework.network.grs.GrsBaseInfo r6, java.lang.String r7) {
            r4 = this;
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap
            r1 = 16
            r0.<init>(r1)
            java.lang.String r1 = "no_route_country"
            java.lang.String r2 = "no-country"
            r0.put(r1, r2)
            java.util.Iterator r5 = r5.iterator()
        L12:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L82
            java.lang.Object r1 = r5.next()
            t1.b r1 = (t1.b) r1
            java.util.Set r2 = r1.a()
            java.lang.String r3 = r6.getIssueCountry()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L37
            java.lang.String r2 = r6.getIssueCountry()
            java.lang.String r3 = r1.d()
            r0.put(r2, r3)
        L37:
            java.util.Set r2 = r1.a()
            java.lang.String r3 = r6.getRegCountry()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L50
            java.lang.String r2 = r6.getRegCountry()
            java.lang.String r3 = r1.d()
            r0.put(r2, r3)
        L50:
            java.util.Set r2 = r1.a()
            java.lang.String r3 = r6.getSerCountry()
            boolean r2 = r2.contains(r3)
            if (r2 == 0) goto L69
            java.lang.String r2 = r6.getSerCountry()
            java.lang.String r3 = r1.d()
            r0.put(r2, r3)
        L69:
            java.util.Set r2 = r1.a()
            boolean r2 = r2.contains(r7)
            if (r2 == 0) goto L12
            java.lang.String r2 = "AbstractLocalManager"
            java.lang.String r3 = "get countryGroupID from geoIp"
            com.huawei.hms.framework.common.Logger.v(r2, r3)
            java.lang.String r1 = r1.d()
            r0.put(r7, r1)
            goto L12
        L82:
            return r0
    }

    private int j(java.lang.String r3, android.content.Context r4) {
            r2 = this;
            java.lang.String r4 = q1.c.a(r3, r4)
            int r4 = r2.r(r4)
            if (r4 != 0) goto L18
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r0 = 0
            r4[r0] = r3
            java.lang.String r3 = "AbstractLocalManager"
            java.lang.String r1 = "load APP_CONFIG_FILE success{%s}."
            com.huawei.hms.framework.common.Logger.i(r3, r1, r4)
            return r0
        L18:
            r3 = -1
            return r3
    }

    private int r(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = -1
            return r2
        L8:
            boolean r0 = r1.d
            if (r0 == 0) goto L13
            int r0 = r1.m(r2)
            if (r0 == 0) goto L13
            return r0
        L13:
            int r0 = r1.i(r2)
            if (r0 == 0) goto L1a
            return r0
        L1a:
            int r2 = r1.q(r2)
            return r2
    }

    private int s(java.lang.String r2) {
            r1 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto L8
            r2 = -1
            return r2
        L8:
            boolean r0 = r1.d
            if (r0 == 0) goto L1d
            java.util.List<t1.b> r0 = r1.b
            if (r0 == 0) goto L16
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1d
        L16:
            int r0 = r1.o(r2)
            if (r0 == 0) goto L1d
            return r0
        L1d:
            int r2 = r1.p(r2)
            return r2
    }

    int a(java.lang.String r4, android.content.Context r5) {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            com.huawei.hms.framework.network.grs.GrsApp r1 = com.huawei.hms.framework.network.grs.GrsApp.getInstance()
            java.lang.String r2 = "/"
            java.lang.String r1 = r1.getBrand(r2)
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            int r4 = r3.j(r4, r5)
            if (r4 == 0) goto L21
            r4 = -1
            return r4
        L21:
            r4 = 0
            return r4
    }

    public java.lang.String b(android.content.Context r7, n1.a r8, com.huawei.hms.framework.network.grs.GrsBaseInfo r9, java.lang.String r10, java.lang.String r11, boolean r12) {
            r6 = this;
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r12
            java.util.Map r7 = r0.e(r1, r2, r3, r4, r5)
            if (r7 != 0) goto L1b
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r8 = 0
            r7[r8] = r4
            java.lang.String r8 = "AbstractLocalManager"
            java.lang.String r9 = "addresses not found by routeby in local config{%s}"
            com.huawei.hms.framework.common.Logger.w(r8, r9, r7)
            r7 = 0
            return r7
        L1b:
            java.lang.Object r7 = r7.get(r11)
            java.lang.String r7 = (java.lang.String) r7
            return r7
    }

    public java.lang.String c(java.lang.String r5) {
            r4 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.lang.String r0 = "no_route_country"
            boolean r0 = r0.equals(r5)
            if (r0 == 0) goto L13
            java.lang.String r5 = "no-country"
            return r5
        L13:
            java.util.List<t1.b> r0 = r4.b
            if (r0 == 0) goto L3f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1e
            goto L3f
        L1e:
            java.util.List<t1.b> r0 = r4.b
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            t1.b r2 = (t1.b) r2
            java.util.Set r3 = r2.a()
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L24
            java.lang.String r5 = r2.d()
            return r5
        L3f:
            return r1
    }

    public java.util.List<t1.b> d(org.json.JSONArray r13) {
            r12 = this;
            java.lang.String r0 = "AbstractLocalManager"
            java.lang.String r1 = "countries"
            java.lang.String r2 = "countriesOrAreas"
            if (r13 == 0) goto Laa
            int r3 = r13.length()
            if (r3 != 0) goto L10
            goto Laa
        L10:
            r3 = 0
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch: org.json.JSONException -> L4e
            r5 = 16
            r4.<init>(r5)     // Catch: org.json.JSONException -> L4e
            r6 = 0
        L19:
            int r7 = r13.length()     // Catch: org.json.JSONException -> L4e
            if (r6 >= r7) goto L91
            org.json.JSONObject r7 = r13.getJSONObject(r6)     // Catch: org.json.JSONException -> L4e
            t1.b r8 = new t1.b     // Catch: org.json.JSONException -> L4e
            r8.<init>()     // Catch: org.json.JSONException -> L4e
            java.lang.String r9 = "id"
            java.lang.String r9 = r7.getString(r9)     // Catch: org.json.JSONException -> L4e
            r8.e(r9)     // Catch: org.json.JSONException -> L4e
            java.lang.String r9 = "name"
            java.lang.String r9 = r7.getString(r9)     // Catch: org.json.JSONException -> L4e
            r8.f(r9)     // Catch: org.json.JSONException -> L4e
            java.lang.String r9 = "description"
            java.lang.String r9 = r7.getString(r9)     // Catch: org.json.JSONException -> L4e
            r8.b(r9)     // Catch: org.json.JSONException -> L4e
            boolean r9 = r7.has(r2)     // Catch: org.json.JSONException -> L4e
            if (r9 == 0) goto L50
            org.json.JSONArray r7 = r7.getJSONArray(r2)     // Catch: org.json.JSONException -> L4e
            goto L61
        L4e:
            r13 = move-exception
            goto L92
        L50:
            boolean r9 = r7.has(r1)     // Catch: org.json.JSONException -> L4e
            if (r9 == 0) goto L5b
            org.json.JSONArray r7 = r7.getJSONArray(r1)     // Catch: org.json.JSONException -> L4e
            goto L61
        L5b:
            java.lang.String r7 = "current country or area group has not config countries or areas."
            com.huawei.hms.framework.common.Logger.w(r0, r7)     // Catch: org.json.JSONException -> L4e
            r7 = 0
        L61:
            java.util.HashSet r9 = new java.util.HashSet     // Catch: org.json.JSONException -> L4e
            r9.<init>(r5)     // Catch: org.json.JSONException -> L4e
            if (r7 == 0) goto L8b
            int r10 = r7.length()     // Catch: org.json.JSONException -> L4e
            if (r10 != 0) goto L6f
            goto L8b
        L6f:
            r10 = 0
        L70:
            int r11 = r7.length()     // Catch: org.json.JSONException -> L4e
            if (r10 >= r11) goto L82
            java.lang.Object r11 = r7.get(r10)     // Catch: org.json.JSONException -> L4e
            java.lang.String r11 = (java.lang.String) r11     // Catch: org.json.JSONException -> L4e
            r9.add(r11)     // Catch: org.json.JSONException -> L4e
            int r10 = r10 + 1
            goto L70
        L82:
            r8.c(r9)     // Catch: org.json.JSONException -> L4e
            r4.add(r8)     // Catch: org.json.JSONException -> L4e
            int r6 = r6 + 1
            goto L19
        L8b:
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch: org.json.JSONException -> L4e
            r13.<init>()     // Catch: org.json.JSONException -> L4e
            return r13
        L91:
            return r4
        L92:
            java.lang.String r13 = r13.getMessage()
            java.lang.String r13 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r13)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r13
            java.lang.String r13 = "parse countrygroup failed maybe json style is wrong. %s"
            com.huawei.hms.framework.common.Logger.w(r0, r13, r1)
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            return r13
        Laa:
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            return r13
    }

    public java.util.Map<java.lang.String, java.lang.String> e(android.content.Context r6, n1.a r7, com.huawei.hms.framework.network.grs.GrsBaseInfo r8, java.lang.String r9, boolean r10) {
            r5 = this;
            t1.a r0 = r5.a
            java.lang.String r1 = "AbstractLocalManager"
            r2 = 0
            if (r0 != 0) goto Ld
            java.lang.String r6 = "application data is null."
            com.huawei.hms.framework.common.Logger.w(r1, r6)
            return r2
        Ld:
            t1.c r0 = r0.b(r9)
            r3 = 0
            r4 = 1
            if (r0 != 0) goto L1f
            java.lang.Object[] r6 = new java.lang.Object[r4]
            r6[r3] = r9
            java.lang.String r7 = "service not found in local config{%s}"
            com.huawei.hms.framework.common.Logger.w(r1, r7, r6)
            return r2
        L1f:
            java.lang.String r9 = r0.e()
            java.lang.String r6 = com.huawei.hms.framework.network.grs.f.e.b(r6, r7, r9, r8, r10)
            if (r6 != 0) goto L37
            java.lang.String r6 = r0.e()
            java.lang.Object[] r7 = new java.lang.Object[r4]
            r7[r3] = r6
            java.lang.String r6 = "country not found by routeby in local config{%s}"
            com.huawei.hms.framework.common.Logger.w(r1, r6, r7)
            return r2
        L37:
            java.util.List r7 = r0.a()
            if (r7 == 0) goto L52
            int r9 = r7.size()
            if (r9 == 0) goto L52
            java.util.Map r7 = r5.f(r7, r8, r6)
            java.lang.Object r6 = r7.get(r6)
            java.lang.String r6 = (java.lang.String) r6
        L4d:
            t1.d r6 = r0.b(r6)
            goto L57
        L52:
            java.lang.String r6 = r5.c(r6)
            goto L4d
        L57:
            if (r6 != 0) goto L5a
            return r2
        L5a:
            java.util.Map r6 = r6.a()
            return r6
    }

    public t1.a g() {
            r1 = this;
            t1.a r0 = r1.a
            return r0
    }

    public void h(android.content.Context r8, java.util.List<java.lang.String> r9) {
            r7 = this;
            if (r9 == 0) goto L7f
            int r0 = r9.size()
            if (r0 <= 0) goto L7f
            java.util.Iterator r9 = r9.iterator()
        Lc:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r9.next()
            java.lang.String r0 = (java.lang.String) r0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "getBatchLoadSdkSuccessFlag file:"
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "AbstractLocalManager"
            com.huawei.hms.framework.common.Logger.d(r2, r1)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r3 = 0
            r4 = 1
            if (r1 != 0) goto L75
            java.lang.String r1 = "^grs_sdk_global_route_config_[a-zA-Z]+\\.json$"
            boolean r1 = java.util.regex.Pattern.matches(r1, r0)
            if (r1 == 0) goto L75
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            com.huawei.hms.framework.network.grs.GrsApp r5 = com.huawei.hms.framework.network.grs.GrsApp.getInstance()
            java.lang.String r6 = "/"
            java.lang.String r5 = r5.getBrand(r6)
            r1.append(r5)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = q1.c.a(r1, r8)
            int r1 = r7.s(r1)
            if (r1 != 0) goto L6b
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r0
            java.lang.String r0 = "load SDK_CONFIG_FILE: %s, sucess."
            com.huawei.hms.framework.common.Logger.d(r2, r0, r1)
            goto Lc
        L6b:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r0
            java.lang.String r0 = "load SDK_CONFIG_FILE: %s, failure."
            com.huawei.hms.framework.common.Logger.w(r2, r0, r1)
            goto Lc
        L75:
            java.lang.Object[] r1 = new java.lang.Object[r4]
            r1[r3] = r0
            java.lang.String r0 = "load SDK_CONFIG_FILE: %s, skipped."
            com.huawei.hms.framework.common.Logger.d(r2, r0, r1)
            goto Lc
        L7f:
            return
    }

    public abstract int i(java.lang.String r1);

    public java.util.Set<java.lang.String> k() {
            r1 = this;
            java.util.Set<java.lang.String> r0 = r1.e
            return r0
    }

    protected void l(org.json.JSONArray r15) {
            r14 = this;
            if (r15 == 0) goto Lf6
            int r0 = r15.length()
            if (r0 != 0) goto La
            goto Lf6
        La:
            r0 = 0
            r1 = 0
        Lc:
            int r2 = r15.length()
            if (r1 >= r2) goto Lf6
            org.json.JSONObject r2 = r15.getJSONObject(r1)
            t1.c r3 = new t1.c
            r3.<init>()
            java.lang.String r4 = "name"
            java.lang.String r4 = r2.getString(r4)
            r3.f(r4)
            java.util.Set<java.lang.String> r5 = r14.e
            boolean r5 = r5.contains(r4)
            if (r5 != 0) goto Lf2
            java.util.Set<java.lang.String> r5 = r14.e
            r5.add(r4)
            boolean r5 = r14.d
            if (r5 == 0) goto Lf2
            java.lang.String r5 = "routeBy"
            java.lang.String r5 = r2.getString(r5)
            r3.g(r5)
            java.lang.String r5 = "servings"
            org.json.JSONArray r5 = r2.getJSONArray(r5)
            r6 = 0
        L45:
            int r7 = r5.length()
            java.lang.String r8 = "AbstractLocalManager"
            if (r6 >= r7) goto Lbf
            java.lang.Object r7 = r5.get(r6)
            org.json.JSONObject r7 = (org.json.JSONObject) r7
            t1.d r9 = new t1.d
            r9.<init>()
            java.lang.String r10 = "countryOrAreaGroup"
            boolean r11 = r7.has(r10)
            if (r11 == 0) goto L65
        L60:
            java.lang.String r8 = r7.getString(r10)
            goto L7a
        L65:
            java.lang.String r10 = "countryGroup"
            boolean r11 = r7.has(r10)
            if (r11 == 0) goto L6e
            goto L60
        L6e:
            r10 = 1
            java.lang.Object[] r10 = new java.lang.Object[r10]
            r10[r0] = r4
            java.lang.String r11 = "maybe this service{%s} routeBy is unconditional."
            com.huawei.hms.framework.common.Logger.v(r8, r11, r10)
            java.lang.String r8 = "no-country"
        L7a:
            r9.b(r8)
            java.lang.String r8 = "addresses"
            org.json.JSONObject r7 = r7.getJSONObject(r8)
            java.util.concurrent.ConcurrentHashMap r8 = new java.util.concurrent.ConcurrentHashMap
            r10 = 16
            r8.<init>(r10)
            java.util.Iterator r10 = r7.keys()
        L8e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb2
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.String r12 = r7.getString(r11)
            boolean r13 = android.text.TextUtils.isEmpty(r11)
            if (r13 != 0) goto L8e
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L8e
            java.lang.String r12 = r7.getString(r11)
            r8.put(r11, r12)
            goto L8e
        Lb2:
            r9.c(r8)
            java.lang.String r7 = r9.d()
            r3.c(r7, r9)
            int r6 = r6 + 1
            goto L45
        Lbf:
            java.lang.String r5 = "countryOrAreaGroups"
            boolean r6 = r2.has(r5)
            if (r6 == 0) goto Ld0
        Lc7:
            org.json.JSONArray r2 = r2.getJSONArray(r5)
            java.util.List r2 = r14.d(r2)
            goto Ldf
        Ld0:
            java.lang.String r5 = "countryGroups"
            boolean r6 = r2.has(r5)
            if (r6 == 0) goto Ld9
            goto Lc7
        Ld9:
            java.lang.String r2 = "service use default countryOrAreaGroup"
            com.huawei.hms.framework.common.Logger.i(r8, r2)
            r2 = 0
        Ldf:
            r3.d(r2)
            t1.a r2 = r14.a
            if (r2 != 0) goto Led
            t1.a r2 = new t1.a
            r2.<init>()
            r14.a = r2
        Led:
            t1.a r2 = r14.a
            r2.d(r4, r3)
        Lf2:
            int r1 = r1 + 1
            goto Lc
        Lf6:
            return
    }

    public abstract int m(java.lang.String r1);

    public boolean n() {
            r1 = this;
            boolean r0 = r1.c
            return r0
    }

    public int o(java.lang.String r7) {
            r6 = this;
            java.lang.String r0 = "AbstractLocalManager"
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
            org.json.JSONArray r7 = r5.getJSONArray(r2)     // Catch: org.json.JSONException -> L21
            goto L34
        L21:
            r7 = move-exception
            goto L41
        L23:
            boolean r7 = r5.has(r1)     // Catch: org.json.JSONException -> L21
            if (r7 == 0) goto L2e
            org.json.JSONArray r7 = r5.getJSONArray(r1)     // Catch: org.json.JSONException -> L21
            goto L34
        L2e:
            java.lang.String r7 = "maybe local config json is wrong because the default countryOrAreaGroups isn't config."
            com.huawei.hms.framework.common.Logger.e(r0, r7)     // Catch: org.json.JSONException -> L21
            r7 = 0
        L34:
            if (r7 != 0) goto L37
            return r4
        L37:
            java.util.List<t1.b> r1 = r6.b     // Catch: org.json.JSONException -> L21
            java.util.List r7 = r6.d(r7)     // Catch: org.json.JSONException -> L21
            r1.addAll(r7)     // Catch: org.json.JSONException -> L21
            return r3
        L41:
            java.lang.String r7 = r7.getMessage()
            java.lang.String r7 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r7)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r7
            java.lang.String r7 = "parse countrygroup failed maybe json style is wrong. %s"
            com.huawei.hms.framework.common.Logger.w(r0, r7, r1)
            return r4
    }

    public int p(java.lang.String r3) {
            r2 = this;
            r0 = 0
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L10
            r1.<init>(r3)     // Catch: org.json.JSONException -> L10
            java.lang.String r3 = "services"
            org.json.JSONArray r3 = r1.getJSONArray(r3)     // Catch: org.json.JSONException -> L10
            r2.l(r3)     // Catch: org.json.JSONException -> L10
            return r0
        L10:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            java.lang.String r3 = com.huawei.hms.framework.common.StringUtils.anonymizeMessage(r3)
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r0] = r3
            java.lang.String r3 = "AbstractLocalManager"
            java.lang.String r0 = "parse 2.0 services failed maybe because of json style.please check! %s"
            com.huawei.hms.framework.common.Logger.w(r3, r0, r1)
            r3 = -1
            return r3
    }

    public abstract int q(java.lang.String r1);
}

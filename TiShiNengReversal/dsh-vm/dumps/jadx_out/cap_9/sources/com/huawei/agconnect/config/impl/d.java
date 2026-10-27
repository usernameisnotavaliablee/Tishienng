package com.huawei.agconnect.config.impl;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class d implements com.huawei.agconnect.e {
    private final java.lang.String a;
    private final android.content.Context b;
    private final java.lang.String c;
    private final com.huawei.agconnect.b d;
    private final com.huawei.agconnect.config.impl.f e;
    private final com.huawei.agconnect.config.impl.g f;
    private final java.util.Map<java.lang.String, java.lang.String> g;
    private final java.util.List<com.huawei.agconnect.core.b> h;
    private final java.util.Map<java.lang.String, java.lang.String> i;

    public d(android.content.Context r2, java.lang.String r3, com.huawei.agconnect.b r4, java.io.InputStream r5, java.util.Map<java.lang.String, java.lang.String> r6, java.util.List<com.huawei.agconnect.core.b> r7, java.lang.String r8) {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.i = r0
            android.content.Context r0 = r2.getApplicationContext()
            android.content.Context r0 = com.stub.StubApp.getOrigApplicationContext(r0)
            if (r0 == 0) goto L1c
            android.content.Context r2 = r2.getApplicationContext()
            android.content.Context r2 = com.stub.StubApp.getOrigApplicationContext(r2)
        L1c:
            r1.b = r2
            if (r3 != 0) goto L24
            java.lang.String r3 = r2.getPackageName()
        L24:
            r1.c = r3
            if (r5 == 0) goto L33
            com.huawei.agconnect.config.impl.j r2 = new com.huawei.agconnect.config.impl.j
            r2.<init>(r5, r3)
            r1.e = r2
            com.huawei.agconnect.config.impl.b.a(r5)
            goto L3a
        L33:
            com.huawei.agconnect.config.impl.m r5 = new com.huawei.agconnect.config.impl.m
            r5.<init>(r2, r3)
            r1.e = r5
        L3a:
            com.huawei.agconnect.config.impl.g r2 = new com.huawei.agconnect.config.impl.g
            com.huawei.agconnect.config.impl.f r3 = r1.e
            r2.<init>(r3)
            r1.f = r2
            com.huawei.agconnect.b r2 = com.huawei.agconnect.b.b
            r3 = 0
            if (r4 == r2) goto L61
            com.huawei.agconnect.config.impl.f r5 = r1.e
            java.lang.String r0 = "/configuration_version"
            java.lang.String r5 = r5.a(r0, r3)
            java.lang.String r0 = "1.0"
            boolean r5 = r0.equals(r5)
            if (r5 != 0) goto L59
            goto L61
        L59:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "The file version does not match,please download the latest agconnect-services.json from the AGC website."
            r2.<init>(r3)
            throw r2
        L61:
            if (r4 == 0) goto L65
            if (r4 != r2) goto L79
        L65:
            com.huawei.agconnect.config.impl.f r2 = r1.e
            java.lang.String r4 = "/region"
            java.lang.String r2 = r2.a(r4, r3)
            com.huawei.agconnect.config.impl.f r4 = r1.e
            java.lang.String r5 = "/agcgw/url"
            java.lang.String r3 = r4.a(r5, r3)
            com.huawei.agconnect.b r4 = com.huawei.agconnect.config.impl.b.f(r2, r3)
        L79:
            r1.d = r4
            java.util.Map r2 = com.huawei.agconnect.config.impl.b.d(r6)
            r1.g = r2
            r1.h = r7
            if (r8 == 0) goto L86
            goto L8a
        L86:
            java.lang.String r8 = r1.f()
        L8a:
            r1.a = r8
            return
    }

    private java.lang.String d(java.lang.String r4) {
            r3 = this;
            java.util.Map r0 = com.huawei.agconnect.i.a()
            boolean r1 = r0.containsKey(r4)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.i
            boolean r1 = r1.containsKey(r4)
            if (r1 == 0) goto L1d
            java.util.Map<java.lang.String, java.lang.String> r0 = r3.i
            java.lang.Object r4 = r0.get(r4)
            java.lang.String r4 = (java.lang.String) r4
            return r4
        L1d:
            java.lang.Object r0 = r0.get(r4)
            com.huawei.agconnect.i$a r0 = (com.huawei.agconnect.i.a) r0
            if (r0 != 0) goto L26
            return r2
        L26:
            java.lang.String r0 = r0.a(r3)
            java.util.Map<java.lang.String, java.lang.String> r1 = r3.i
            r1.put(r4, r0)
            return r0
    }

    private java.lang.String f() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "{packageName='"
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            java.lang.String r1 = ", routePolicy="
            r0.append(r1)
            com.huawei.agconnect.b r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", reader="
            r0.append(r1)
            com.huawei.agconnect.config.impl.f r1 = r3.e
            java.lang.String r1 = r1.toString()
            int r1 = r1.hashCode()
            r0.append(r1)
            java.lang.String r1 = ", customConfigMap="
            r0.append(r1)
            org.json.JSONObject r1 = new org.json.JSONObject
            java.util.Map<java.lang.String, java.lang.String> r2 = r3.g
            r1.<init>(r2)
            java.lang.String r1 = r1.toString()
            int r1 = r1.hashCode()
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            int r0 = r0.hashCode()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }

    @Override // com.huawei.agconnect.e
    public boolean a(java.lang.String r2) {
            r1 = this;
            r0 = 0
            boolean r2 = r1.getBoolean(r2, r0)
            return r2
    }

    @Override // com.huawei.agconnect.e
    public int b(java.lang.String r2) {
            r1 = this;
            r0 = 0
            int r2 = r1.getInt(r2, r0)
            return r2
    }

    @Override // com.huawei.agconnect.e
    public com.huawei.agconnect.b c() {
            r1 = this;
            com.huawei.agconnect.b r0 = r1.d
            if (r0 != 0) goto L6
            com.huawei.agconnect.b r0 = com.huawei.agconnect.b.b
        L6:
            return r0
    }

    public java.util.List<com.huawei.agconnect.core.b> e() {
            r1 = this;
            java.util.List<com.huawei.agconnect.core.b> r0 = r1.h
            return r0
    }

    @Override // com.huawei.agconnect.e
    public boolean getBoolean(java.lang.String r1, boolean r2) {
            r0 = this;
            java.lang.String r2 = java.lang.String.valueOf(r2)
            java.lang.String r1 = r0.getString(r1, r2)
            boolean r1 = java.lang.Boolean.parseBoolean(r1)
            return r1
    }

    @Override // com.huawei.agconnect.e
    public android.content.Context getContext() {
            r1 = this;
            android.content.Context r0 = r1.b
            return r0
    }

    @Override // com.huawei.agconnect.e
    public java.lang.String getIdentifier() {
            r1 = this;
            java.lang.String r0 = r1.a
            return r0
    }

    @Override // com.huawei.agconnect.e
    public int getInt(java.lang.String r2, int r3) {
            r1 = this;
            java.lang.String r0 = java.lang.String.valueOf(r3)     // Catch: java.lang.NumberFormatException -> Ld
            java.lang.String r2 = r1.getString(r2, r0)     // Catch: java.lang.NumberFormatException -> Ld
            int r2 = java.lang.Integer.parseInt(r2)     // Catch: java.lang.NumberFormatException -> Ld
            return r2
        Ld:
            return r3
    }

    @Override // com.huawei.agconnect.e
    public java.lang.String getPackageName() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }

    @Override // com.huawei.agconnect.e
    public java.lang.String getString(java.lang.String r2) {
            r1 = this;
            r0 = 0
            java.lang.String r2 = r1.getString(r2, r0)
            return r2
    }

    @Override // com.huawei.agconnect.e
    public java.lang.String getString(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            if (r2 != 0) goto L3
            return r3
        L3:
            java.lang.String r2 = com.huawei.agconnect.config.impl.b.e(r2)
            java.util.Map<java.lang.String, java.lang.String> r0 = r1.g
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 == 0) goto L12
            return r0
        L12:
            java.lang.String r0 = r1.d(r2)
            if (r0 == 0) goto L19
            return r0
        L19:
            com.huawei.agconnect.config.impl.f r0 = r1.e
            java.lang.String r2 = r0.a(r2, r3)
            boolean r0 = com.huawei.agconnect.config.impl.g.c(r2)
            if (r0 == 0) goto L2b
            com.huawei.agconnect.config.impl.g r0 = r1.f
            java.lang.String r2 = r0.a(r2, r3)
        L2b:
            return r2
    }
}

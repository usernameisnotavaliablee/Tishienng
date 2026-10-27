package com.beizi.fusion.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class k {
    private android.content.Context a;

    /* renamed from: b, reason: collision with root package name */
    private java.lang.Class f7602b;

    /* renamed from: c, reason: collision with root package name */
    private java.lang.Object f7603c;

    /* renamed from: d, reason: collision with root package name */
    private java.lang.reflect.Method f7604d;

    public k(android.content.Context r5) {
            r4 = this;
            r4.<init>()
            r4.a = r5
            java.lang.String r5 = "com.android.id.impl.IdProviderImpl"
            java.lang.Class r5 = java.lang.Class.forName(r5)     // Catch: java.lang.Exception -> L13
            r4.f7602b = r5     // Catch: java.lang.Exception -> L13
            java.lang.Object r5 = r5.newInstance()     // Catch: java.lang.Exception -> L13
            r4.f7603c = r5     // Catch: java.lang.Exception -> L13
        L13:
            java.lang.Class r5 = r4.f7602b     // Catch: java.lang.Exception -> L25
            java.lang.String r0 = "getOAID"
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]     // Catch: java.lang.Exception -> L25
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r3 = 0
            r1[r3] = r2     // Catch: java.lang.Exception -> L25
            java.lang.reflect.Method r5 = r5.getMethod(r0, r1)     // Catch: java.lang.Exception -> L25
            r4.f7604d = r5     // Catch: java.lang.Exception -> L25
        L25:
            return
    }

    private java.lang.String a(android.content.Context r4, java.lang.reflect.Method r5) {
            r3 = this;
            java.lang.Object r0 = r3.f7603c
            if (r0 == 0) goto L13
            if (r5 == 0) goto L13
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L13
            r2 = 0
            r1[r2] = r4     // Catch: java.lang.Exception -> L13
            java.lang.Object r4 = r5.invoke(r0, r1)     // Catch: java.lang.Exception -> L13
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L13
            return r4
        L13:
            r4 = 0
            return r4
    }

    public java.lang.String a() {
            r2 = this;
            android.content.Context r0 = r2.a
            java.lang.reflect.Method r1 = r2.f7604d
            java.lang.String r0 = r2.a(r0, r1)
            return r0
    }
}

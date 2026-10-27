package com.beizi.fusion.sm.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
class q implements com.beizi.fusion.sm.b.c {
    private final android.content.Context a;
    private java.lang.Class<?> b;
    private java.lang.Object c;

    @android.annotation.SuppressLint({"PrivateApi"})
    public q(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.String r1 = "com.android.id.impl.IdProviderImpl"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L14
            r0.b = r1     // Catch: java.lang.Exception -> L14
            java.lang.Object r1 = r1.newInstance()     // Catch: java.lang.Exception -> L14
            r0.c = r1     // Catch: java.lang.Exception -> L14
            return
        L14:
            r1 = move-exception
            com.beizi.fusion.sm.b.e.a(r1)
            return
    }

    private java.lang.String b() throws java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
            r5 = this;
            java.lang.Class<?> r0 = r5.b
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r2[r3] = r4
            java.lang.String r4 = "getOAID"
            java.lang.reflect.Method r0 = r0.getMethod(r4, r2)
            java.lang.Object r2 = r5.c
            android.content.Context r4 = r5.a
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r4
            java.lang.Object r0 = r0.invoke(r2, r1)
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }

    @Override // com.beizi.fusion.sm.b.c
    public void a(com.beizi.fusion.sm.b.b r4) {
            r3 = this;
            android.content.Context r0 = r3.a
            if (r0 == 0) goto L4f
            if (r4 != 0) goto L7
            goto L4f
        L7:
            java.lang.Class<?> r0 = r3.b
            if (r0 == 0) goto L45
            java.lang.Object r0 = r3.c
            if (r0 != 0) goto L10
            goto L45
        L10:
            java.lang.String r0 = r3.b()     // Catch: java.lang.Exception -> L34
            if (r0 == 0) goto L36
            int r1 = r0.length()     // Catch: java.lang.Exception -> L34
            if (r1 == 0) goto L36
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L34
            r1.<init>()     // Catch: java.lang.Exception -> L34
            java.lang.String r2 = "OAID query success: "
            r1.append(r2)     // Catch: java.lang.Exception -> L34
            r1.append(r0)     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L34
            com.beizi.fusion.sm.b.e.a(r1)     // Catch: java.lang.Exception -> L34
            r4.a(r0)     // Catch: java.lang.Exception -> L34
            return
        L34:
            r0 = move-exception
            goto L3e
        L36:
            com.beizi.fusion.sm.b.d r0 = new com.beizi.fusion.sm.b.d     // Catch: java.lang.Exception -> L34
            java.lang.String r1 = "OAID query failed"
            r0.<init>(r1)     // Catch: java.lang.Exception -> L34
            throw r0     // Catch: java.lang.Exception -> L34
        L3e:
            com.beizi.fusion.sm.b.e.a(r0)
            r4.a(r0)
            return
        L45:
            com.beizi.fusion.sm.b.d r0 = new com.beizi.fusion.sm.b.d
            java.lang.String r1 = "Xiaomi IdProvider not exists"
            r0.<init>(r1)
            r4.a(r0)
        L4f:
            return
    }

    @Override // com.beizi.fusion.sm.b.c
    public boolean a() {
            r1 = this;
            java.lang.Object r0 = r1.c
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }
}

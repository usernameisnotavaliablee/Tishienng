package com.beizi.fusion.sm.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class c implements com.beizi.fusion.sm.b.c {
    private final android.content.Context a;
    private final android.app.KeyguardManager b;

    public c(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r1.a = r2
            java.lang.String r0 = "keyguard"
            java.lang.Object r2 = r2.getSystemService(r0)
            android.app.KeyguardManager r2 = (android.app.KeyguardManager) r2
            r1.b = r2
            return
    }

    @Override // com.beizi.fusion.sm.b.c
    public void a(com.beizi.fusion.sm.b.b r4) {
            r3 = this;
            android.content.Context r0 = r3.a
            if (r0 == 0) goto L52
            if (r4 != 0) goto L7
            goto L52
        L7:
            android.app.KeyguardManager r0 = r3.b
            if (r0 != 0) goto L16
            com.beizi.fusion.sm.b.d r0 = new com.beizi.fusion.sm.b.d
            java.lang.String r1 = "KeyguardManager not found"
            r0.<init>(r1)
            r4.a(r0)
            return
        L16:
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L45
            java.lang.String r1 = "obtainOaid"
            r2 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r2)     // Catch: java.lang.Exception -> L45
            android.app.KeyguardManager r1 = r3.b     // Catch: java.lang.Exception -> L45
            java.lang.Object r0 = r0.invoke(r1, r2)     // Catch: java.lang.Exception -> L45
            if (r0 == 0) goto L47
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Exception -> L45
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L45
            r1.<init>()     // Catch: java.lang.Exception -> L45
            java.lang.String r2 = "OAID obtain success: "
            r1.append(r2)     // Catch: java.lang.Exception -> L45
            r1.append(r0)     // Catch: java.lang.Exception -> L45
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L45
            com.beizi.fusion.sm.b.e.a(r1)     // Catch: java.lang.Exception -> L45
            r4.a(r0)     // Catch: java.lang.Exception -> L45
            return
        L45:
            r4 = move-exception
            goto L4f
        L47:
            com.beizi.fusion.sm.b.d r4 = new com.beizi.fusion.sm.b.d     // Catch: java.lang.Exception -> L45
            java.lang.String r0 = "OAID obtain failed"
            r4.<init>(r0)     // Catch: java.lang.Exception -> L45
            throw r4     // Catch: java.lang.Exception -> L45
        L4f:
            com.beizi.fusion.sm.b.e.a(r4)
        L52:
            return
    }

    @Override // com.beizi.fusion.sm.b.c
    public boolean a() {
            r4 = this;
            android.content.Context r0 = r4.a
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            android.app.KeyguardManager r0 = r4.b
            if (r0 != 0) goto Lb
            return r1
        Lb:
            java.lang.Class r0 = r0.getClass()     // Catch: java.lang.Exception -> L26
            java.lang.String r2 = "isSupported"
            r3 = 0
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Exception -> L26
            android.app.KeyguardManager r2 = r4.b     // Catch: java.lang.Exception -> L26
            java.lang.Object r0 = r0.invoke(r2, r3)     // Catch: java.lang.Exception -> L26
            java.util.Objects.requireNonNull(r0)     // Catch: java.lang.Exception -> L26
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L26
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L26
            return r0
        L26:
            r0 = move-exception
            com.beizi.fusion.sm.b.e.a(r0)
            return r1
    }
}

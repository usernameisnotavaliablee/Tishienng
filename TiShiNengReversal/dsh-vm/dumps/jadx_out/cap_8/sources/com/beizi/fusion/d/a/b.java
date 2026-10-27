package com.beizi.fusion.d.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {
    private com.beizi.fusion.d.a.b.a a;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        void a(java.lang.String r1);
    }

    public b(com.beizi.fusion.d.a.b.a r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    static /* synthetic */ java.lang.String a(com.beizi.fusion.d.a.b r0) {
            java.lang.String r0 = r0.e()
            return r0
    }

    private java.lang.String a(java.lang.String r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L2a
            java.lang.String r2 = "get"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2a
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Exception -> L2a
            r7 = 1
            r4[r7] = r5     // Catch: java.lang.Exception -> L2a
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L2a
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2a
            r3[r6] = r9     // Catch: java.lang.Exception -> L2a
            java.lang.String r9 = "unknown"
            r3[r7] = r9     // Catch: java.lang.Exception -> L2a
            java.lang.Object r9 = r2.invoke(r1, r3)     // Catch: java.lang.Exception -> L2a
            java.lang.String r9 = (java.lang.String) r9     // Catch: java.lang.Exception -> L2a
            return r9
        L2a:
            return r0
    }

    public static java.lang.String a(java.lang.String r7, java.lang.String r8) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L24
            java.lang.String r1 = "get"
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> L24
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> L24
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Exception -> L24
            java.lang.reflect.Method r1 = r0.getMethod(r1, r3)     // Catch: java.lang.Exception -> L24
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> L24
            r2[r5] = r7     // Catch: java.lang.Exception -> L24
            r2[r6] = r8     // Catch: java.lang.Exception -> L24
            java.lang.Object r7 = r1.invoke(r0, r2)     // Catch: java.lang.Exception -> L24
            java.lang.String r7 = (java.lang.String) r7     // Catch: java.lang.Exception -> L24
            goto L3c
        L24:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "System property invoke error: "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            java.lang.String r8 = "BeiZis"
            com.beizi.fusion.tool.aa.c(r8, r7)
            r7 = 0
        L3c:
            if (r7 != 0) goto L40
            java.lang.String r7 = ""
        L40:
            return r7
    }

    public static boolean a() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "OPPO"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L2b
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L2b
            java.lang.String r1 = "REALME"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L2b
            java.lang.String r0 = "ro.build.version.opporom"
            java.lang.String r1 = ""
            java.lang.String r0 = a(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            goto L2b
        L29:
            r0 = 0
            return r0
        L2b:
            r0 = 1
            return r0
    }

    static /* synthetic */ com.beizi.fusion.d.a.b.a b(com.beizi.fusion.d.a.b r0) {
            com.beizi.fusion.d.a.b$a r0 = r0.a
            return r0
    }

    private void b(android.content.Context r3) {
            r2 = this;
            java.lang.Thread r0 = new java.lang.Thread
            com.beizi.fusion.d.a.b$1 r1 = new com.beizi.fusion.d.a.b$1
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r0.start()
            return
    }

    public static boolean b() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "HUAWEI"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1d
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L1d
            java.lang.String r1 = "HONOR"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L1b
            goto L1d
        L1b:
            r0 = 0
            return r0
        L1d:
            r0 = 1
            return r0
    }

    private java.lang.String e() {
            r1 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r0 = r0.toUpperCase()
            return r0
    }

    public void a(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "BeiZis"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L17f
            r1.<init>()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r2 = "init oaid "
            r1.append(r2)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r2 = r3.e()     // Catch: java.lang.Throwable -> L17f
            r1.append(r2)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L17f
            com.beizi.fusion.tool.aa.c(r0, r1)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r0 = "ASUS"
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto L2f
            r3.b(r4)     // Catch: java.lang.Throwable -> L17f
            goto L175
        L2f:
            boolean r0 = b()     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto L3a
            r3.b(r4)     // Catch: java.lang.Throwable -> L17f
            goto L175
        L3a:
            java.lang.String r0 = "LENOVO"
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto L56
            com.beizi.fusion.d.a.d r0 = new com.beizi.fusion.d.a.d     // Catch: java.lang.Throwable -> L17f
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L17f
            com.beizi.fusion.d.a.b$a r4 = r3.a     // Catch: java.lang.Throwable -> L17f
            r0.a(r4)     // Catch: java.lang.Throwable -> L17f
            goto L175
        L56:
            java.lang.String r0 = "MOTOLORA"
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto L72
            com.beizi.fusion.d.a.d r0 = new com.beizi.fusion.d.a.d     // Catch: java.lang.Throwable -> L17f
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L17f
            com.beizi.fusion.d.a.b$a r4 = r3.a     // Catch: java.lang.Throwable -> L17f
            r0.a(r4)     // Catch: java.lang.Throwable -> L17f
            goto L175
        L72:
            java.lang.String r0 = "MEIZU"
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto L8e
            com.beizi.fusion.d.a.e r0 = new com.beizi.fusion.d.a.e     // Catch: java.lang.Throwable -> L17f
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L17f
            com.beizi.fusion.d.a.b$a r4 = r3.a     // Catch: java.lang.Throwable -> L17f
            r0.a(r4)     // Catch: java.lang.Throwable -> L17f
            goto L175
        L8e:
            java.lang.String r0 = "NUBIA"
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto La9
            com.beizi.fusion.d.a.f r0 = new com.beizi.fusion.d.a.f     // Catch: java.lang.Throwable -> L17f
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r4 = r0.a()     // Catch: java.lang.Throwable -> L17f
            goto L176
        La9:
            boolean r0 = a()     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto Lb4
            r3.b(r4)     // Catch: java.lang.Throwable -> L17f
            goto L175
        Lb4:
            java.lang.String r0 = "SAMSUNG"
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto Lc9
            r3.b(r4)     // Catch: java.lang.Throwable -> L17f
            goto L175
        Lc9:
            java.lang.String r0 = "VIVO"
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto Le4
            com.beizi.fusion.d.a.j r0 = new com.beizi.fusion.d.a.j     // Catch: java.lang.Throwable -> L17f
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r4 = r0.a()     // Catch: java.lang.Throwable -> L17f
            goto L176
        Le4:
            java.lang.String r0 = "XIAOMI"
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto Lff
            com.beizi.fusion.d.a.k r0 = new com.beizi.fusion.d.a.k     // Catch: java.lang.Throwable -> L17f
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r4 = r0.a()     // Catch: java.lang.Throwable -> L17f
            goto L176
        Lff:
            java.lang.String r0 = "BLACKSHARK"
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto L119
            com.beizi.fusion.d.a.k r0 = new com.beizi.fusion.d.a.k     // Catch: java.lang.Throwable -> L17f
            r0.<init>(r4)     // Catch: java.lang.Throwable -> L17f
            java.lang.String r4 = r0.a()     // Catch: java.lang.Throwable -> L17f
            goto L176
        L119:
            java.lang.String r0 = "ONEPLUS"
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto L12d
            r3.b(r4)     // Catch: java.lang.Throwable -> L17f
            goto L175
        L12d:
            java.lang.String r0 = "ZTE"
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto L141
            r3.b(r4)     // Catch: java.lang.Throwable -> L17f
            goto L175
        L141:
            java.lang.String r0 = "FERRMEOS"
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17f
            if (r0 != 0) goto L172
            boolean r0 = r3.c()     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto L158
            goto L172
        L158:
            java.lang.String r0 = "SSUI"
            java.lang.String r1 = r3.e()     // Catch: java.lang.Throwable -> L17f
            java.lang.String r1 = r1.toUpperCase()     // Catch: java.lang.Throwable -> L17f
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> L17f
            if (r0 != 0) goto L16e
            boolean r0 = r3.d()     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto L175
        L16e:
            r3.b(r4)     // Catch: java.lang.Throwable -> L17f
            goto L175
        L172:
            r3.b(r4)     // Catch: java.lang.Throwable -> L17f
        L175:
            r4 = 0
        L176:
            com.beizi.fusion.d.a.b$a r0 = r3.a     // Catch: java.lang.Throwable -> L17f
            if (r0 == 0) goto L17f
            if (r4 == 0) goto L17f
            r0.a(r4)     // Catch: java.lang.Throwable -> L17f
        L17f:
            return
    }

    public boolean c() {
            r2 = this;
            java.lang.String r0 = "ro.build.freeme.label"
            java.lang.String r0 = r2.a(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            java.lang.String r1 = "FREEMEOS"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }

    public boolean d() {
            r2 = this;
            java.lang.String r0 = "ro.ssui.product"
            java.lang.String r0 = r2.a(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L16
            java.lang.String r1 = "unknown"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L16
            r0 = 1
            return r0
        L16:
            r0 = 0
            return r0
    }
}

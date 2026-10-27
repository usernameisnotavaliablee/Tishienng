package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ay {
    private static final java.lang.String a = "ro.build.version.emui";
    private static final java.lang.String b = "hw_sc.build.platform.version";

    public ay() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.umeng.analytics.pro.av a(android.content.Context r3) {
            java.lang.String r3 = android.os.Build.BRAND
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r1 = "Brand"
            r2 = 0
            r0[r2] = r1
            r1 = 1
            r0[r1] = r3
            java.lang.String r1 = "Device"
            com.umeng.analytics.pro.bh.a(r1, r0)
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 0
            if (r0 == 0) goto L1a
            return r1
        L1a:
            java.lang.String r0 = "huawei"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto Lfa
            java.lang.String r0 = "honor"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto Lfa
            java.lang.String r0 = "华为"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L34
            goto Lfa
        L34:
            java.lang.String r0 = "xiaomi"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto Lf4
            java.lang.String r0 = "redmi"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto Lf4
            java.lang.String r0 = "meitu"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto Lf4
            java.lang.String r0 = "小米"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto Lf4
            java.lang.String r0 = "blackshark"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L5e
            goto Lf4
        L5e:
            java.lang.String r0 = "vivo"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L6c
            com.umeng.analytics.pro.bf r3 = new com.umeng.analytics.pro.bf
            r3.<init>()
            return r3
        L6c:
            java.lang.String r0 = "oppo"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto Lee
            java.lang.String r0 = "oneplus"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto Lee
            java.lang.String r0 = "realme"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L85
            goto Lee
        L85:
            java.lang.String r0 = "lenovo"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto Le8
            java.lang.String r0 = "zuk"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L96
            goto Le8
        L96:
            java.lang.String r0 = "nubia"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto La4
            com.umeng.analytics.pro.bc r3 = new com.umeng.analytics.pro.bc
            r3.<init>()
            return r3
        La4:
            java.lang.String r0 = "samsung"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto Lb2
            com.umeng.analytics.pro.be r3 = new com.umeng.analytics.pro.be
            r3.<init>()
            return r3
        Lb2:
            boolean r0 = a()
            if (r0 == 0) goto Lbe
            com.umeng.analytics.pro.az r3 = new com.umeng.analytics.pro.az
            r3.<init>()
            return r3
        Lbe:
            java.lang.String r0 = "meizu"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto Le2
            java.lang.String r0 = "mblu"
            boolean r3 = r3.equalsIgnoreCase(r0)
            if (r3 != 0) goto Le2
            boolean r3 = c()
            if (r3 == 0) goto Ld5
            goto Le2
        Ld5:
            boolean r3 = b()
            if (r3 == 0) goto Le1
            com.umeng.analytics.pro.ax r3 = new com.umeng.analytics.pro.ax
            r3.<init>()
            return r3
        Le1:
            return r1
        Le2:
            com.umeng.analytics.pro.bb r3 = new com.umeng.analytics.pro.bb
            r3.<init>()
            return r3
        Le8:
            com.umeng.analytics.pro.ba r3 = new com.umeng.analytics.pro.ba
            r3.<init>()
            return r3
        Lee:
            com.umeng.analytics.pro.bd r3 = new com.umeng.analytics.pro.bd
            r3.<init>()
            return r3
        Lf4:
            com.umeng.analytics.pro.bg r3 = new com.umeng.analytics.pro.bg
            r3.<init>()
            return r3
        Lfa:
            com.umeng.analytics.pro.az r3 = new com.umeng.analytics.pro.az
            r3.<init>()
            return r3
    }

    private static java.lang.String a(java.lang.String r6) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L20
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L20
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L20
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L20
            r1[r5] = r6     // Catch: java.lang.Throwable -> L20
            r6 = 0
            java.lang.Object r6 = r0.invoke(r6, r1)     // Catch: java.lang.Throwable -> L20
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L20
            return r6
        L20:
            java.lang.String r6 = ""
            return r6
    }

    private static boolean a() {
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r0 = a(r0)
            java.lang.String r1 = "hw_sc.build.platform.version"
            java.lang.String r1 = a(r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L1b
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L19
            goto L1b
        L19:
            r0 = 0
            return r0
        L1b:
            r0 = 1
            return r0
    }

    private static boolean b() {
            java.lang.String r0 = "ro.coolos.version"
            java.lang.String r0 = a(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private static boolean c() {
            r0 = 0
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L2c
            java.lang.String r2 = "get"
            r3 = 2
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L2c
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch: java.lang.Exception -> L2c
            r6 = 1
            r4[r6] = r5     // Catch: java.lang.Exception -> L2c
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> L2c
            java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L2c
            java.lang.String r4 = "ro.build.flyme.version"
            r3[r0] = r4     // Catch: java.lang.Exception -> L2c
            java.lang.String r4 = ""
            r3[r6] = r4     // Catch: java.lang.Exception -> L2c
            java.lang.Object r1 = r2.invoke(r1, r3)     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L2c
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L2c
            r0 = r0 ^ r6
        L2c:
            return r0
    }
}

package com.umeng.analytics.pro;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class aq {
    private static java.lang.String a = "";
    private static java.lang.String b = "";
    private static final java.lang.String c = "hw_sc.build.platform.version";
    private static final java.lang.String d = "ro.build.version.emui";
    private static final java.lang.String e = "ro.build.version.magic";
    private static final java.lang.String f = "ro.miui.ui.version.name";
    private static final java.lang.String g = "ro.build.version.opporom";
    private static final java.lang.String h = "ro.vivo.os.name";
    private static final java.lang.String i = "ro.vivo.os.version";
    private static final java.lang.String j = "ro.build.version.oplusrom";
    private static final java.lang.String k = "ro.rom.version";

    static {
            return
    }

    public aq() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String a(java.lang.String r1) {
            java.lang.String r0 = com.umeng.analytics.pro.aq.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb
            e(r1)
        Lb:
            java.lang.String r1 = com.umeng.analytics.pro.aq.a
            return r1
    }

    private static boolean a() {
            java.lang.String r0 = "com.huawei.system.BuildEx"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r1 = "getOsBrand"
            r2 = 0
            java.lang.reflect.Method r1 = r0.getMethod(r1, r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.Object r0 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L1a
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L1a
            r0 = r0 ^ 1
            return r0
        L1a:
            r0 = 0
            return r0
    }

    public static java.lang.String b(java.lang.String r1) {
            java.lang.String r0 = com.umeng.analytics.pro.aq.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto Lb
            e(r1)
        Lb:
            java.lang.String r1 = com.umeng.analytics.pro.aq.b
            return r1
    }

    public static java.lang.String c(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            java.lang.String r1 = ""
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.String r0 = " "
            java.lang.String r2 = r2.replaceAll(r0, r1)
            java.lang.String r2 = r2.toUpperCase()
            return r2
    }

    private static java.lang.String d(java.lang.String r6) {
            java.lang.String r0 = "android.os.SystemProperties"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r1 = "get"
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L1f
            java.lang.Class<java.lang.String> r4 = java.lang.String.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Throwable -> L1f
            java.lang.reflect.Method r1 = r0.getDeclaredMethod(r1, r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L1f
            r2[r5] = r6     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r6 = r1.invoke(r0, r2)     // Catch: java.lang.Throwable -> L1f
            java.lang.String r6 = (java.lang.String) r6     // Catch: java.lang.Throwable -> L1f
            return r6
        L1f:
            r6 = 0
            return r6
    }

    private static void e(java.lang.String r5) {
            java.lang.String r0 = "ro.build.version.magic"
            java.lang.String r5 = c(r5)     // Catch: java.lang.Throwable -> Ld9
            int r1 = r5.hashCode()     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r2 = "ro.build.version.emui"
            java.lang.String r3 = "EMUI"
            java.lang.String r4 = "ColorOS"
            switch(r1) {
                case -1881642058: goto Lbe;
                case -1706170181: goto La9;
                case -602397472: goto L86;
                case 2432928: goto L7d;
                case 2634924: goto L68;
                case 68924490: goto L42;
                case 77852109: goto L39;
                case 2141820391: goto L15;
                default: goto L13;
            }
        L13:
            goto Ld1
        L15:
            java.lang.String r0 = "HUAWEI"
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> Ld9
            if (r5 == 0) goto Ld1
            boolean r5 = a()     // Catch: java.lang.Throwable -> Ld9
            if (r5 == 0) goto L30
            java.lang.String r5 = "hw_sc.build.platform.version"
            java.lang.String r5 = d(r5)     // Catch: java.lang.Throwable -> Ld9
            com.umeng.analytics.pro.aq.b = r5     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = "HarmonyOS"
            com.umeng.analytics.pro.aq.a = r5     // Catch: java.lang.Throwable -> Ld9
            return
        L30:
            com.umeng.analytics.pro.aq.a = r3     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = d(r2)     // Catch: java.lang.Throwable -> Ld9
            com.umeng.analytics.pro.aq.b = r5     // Catch: java.lang.Throwable -> Ld9
            return
        L39:
            java.lang.String r0 = "REDMI"
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> Ld9
            if (r5 == 0) goto Ld1
            goto Lb1
        L42:
            java.lang.String r1 = "HONOR"
            boolean r5 = r5.equals(r1)     // Catch: java.lang.Throwable -> Ld9
            if (r5 == 0) goto Ld1
            java.lang.String r5 = d(r0)     // Catch: java.lang.Throwable -> Ld9
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Ld9
            if (r5 != 0) goto L5f
            java.lang.String r5 = "MagicUI"
            com.umeng.analytics.pro.aq.a = r5     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = d(r0)     // Catch: java.lang.Throwable -> Ld9
            com.umeng.analytics.pro.aq.b = r5     // Catch: java.lang.Throwable -> Ld9
            return
        L5f:
            com.umeng.analytics.pro.aq.a = r3     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = d(r2)     // Catch: java.lang.Throwable -> Ld9
            com.umeng.analytics.pro.aq.b = r5     // Catch: java.lang.Throwable -> Ld9
            return
        L68:
            java.lang.String r0 = "VIVO"
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> Ld9
            if (r5 == 0) goto Ld1
            java.lang.String r5 = "Funtouch"
            com.umeng.analytics.pro.aq.a = r5     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = "ro.vivo.os.version"
            java.lang.String r5 = d(r5)     // Catch: java.lang.Throwable -> Ld9
            com.umeng.analytics.pro.aq.b = r5     // Catch: java.lang.Throwable -> Ld9
            return
        L7d:
            java.lang.String r0 = "OPPO"
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> Ld9
            if (r5 == 0) goto Ld1
            goto Lc6
        L86:
            java.lang.String r0 = "ONEPLUS"
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> Ld9
            if (r5 == 0) goto Ld1
            java.lang.String r5 = "HydrogenOS"
            com.umeng.analytics.pro.aq.a = r5     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = "ro.rom.version"
            java.lang.String r5 = d(r5)     // Catch: java.lang.Throwable -> Ld9
            boolean r0 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> Ld9
            if (r0 == 0) goto La6
            com.umeng.analytics.pro.aq.a = r4     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = "ro.build.version.oplusrom"
            java.lang.String r5 = d(r5)     // Catch: java.lang.Throwable -> Ld9
        La6:
            com.umeng.analytics.pro.aq.b = r5     // Catch: java.lang.Throwable -> Ld9
            return
        La9:
            java.lang.String r0 = "XIAOMI"
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> Ld9
            if (r5 == 0) goto Ld1
        Lb1:
            java.lang.String r5 = "MIUI"
            com.umeng.analytics.pro.aq.a = r5     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = "ro.miui.ui.version.name"
            java.lang.String r5 = d(r5)     // Catch: java.lang.Throwable -> Ld9
            com.umeng.analytics.pro.aq.b = r5     // Catch: java.lang.Throwable -> Ld9
            return
        Lbe:
            java.lang.String r0 = "REALME"
            boolean r5 = r5.equals(r0)     // Catch: java.lang.Throwable -> Ld9
            if (r5 == 0) goto Ld1
        Lc6:
            com.umeng.analytics.pro.aq.a = r4     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = "ro.build.version.opporom"
            java.lang.String r5 = d(r5)     // Catch: java.lang.Throwable -> Ld9
            com.umeng.analytics.pro.aq.b = r5     // Catch: java.lang.Throwable -> Ld9
            return
        Ld1:
            java.lang.String r5 = "Android"
            com.umeng.analytics.pro.aq.a = r5     // Catch: java.lang.Throwable -> Ld9
            java.lang.String r5 = android.os.Build.VERSION.RELEASE     // Catch: java.lang.Throwable -> Ld9
            com.umeng.analytics.pro.aq.b = r5     // Catch: java.lang.Throwable -> Ld9
        Ld9:
            return
    }
}

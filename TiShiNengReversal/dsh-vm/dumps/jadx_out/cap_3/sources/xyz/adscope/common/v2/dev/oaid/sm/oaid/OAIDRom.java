package xyz.adscope.common.v2.dev.oaid.sm.oaid;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class OAIDRom {
    private OAIDRom() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isASUS() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "ASUS"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L15
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public static boolean isBlackShark() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "BLACKSHARK"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L15
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public static boolean isCoolpad(android.content.Context r2) {
            r0 = 0
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> Lc
            java.lang.String r1 = "com.coolpad.deviceidsupport"
            r2.getPackageInfo(r1, r0)     // Catch: java.lang.Exception -> Lc
            r2 = 1
            return r2
        Lc:
            return r0
    }

    public static boolean isCoosea() {
            java.lang.String r0 = "ro.odm.manufacturer"
            java.lang.String r1 = ""
            java.lang.String r0 = sysProperty(r0, r1)
            java.lang.String r1 = "PRIZE"
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    public static boolean isEmui() {
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r1 = ""
            java.lang.String r0 = sysProperty(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isFreeme() {
            java.lang.String r0 = "ro.build.freeme.label"
            java.lang.String r1 = ""
            java.lang.String r0 = sysProperty(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isHuawei() {
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

    public static boolean isLenovo() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "LENOVO"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1d
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L1d
            java.lang.String r1 = "ZUK"
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

    public static boolean isMeizu() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MEIZU"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = android.os.Build.DISPLAY
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r1 = "FLYME"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L21
            goto L23
        L21:
            r0 = 0
            return r0
        L23:
            r0 = 1
            return r0
    }

    public static boolean isMiui() {
            java.lang.String r0 = "ro.miui.ui.version.name"
            java.lang.String r1 = ""
            java.lang.String r0 = sysProperty(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isMotolora() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "MOTOLORA"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L15
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public static boolean isNubia() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "NUBIA"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L15
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public static boolean isOnePlus() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "ONEPLUS"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L15
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public static boolean isOppo() {
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
            java.lang.String r0 = sysProperty(r0, r1)
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

    public static boolean isSSUI() {
            java.lang.String r0 = "ro.ssui.product"
            java.lang.String r1 = ""
            java.lang.String r0 = sysProperty(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public static boolean isSamsung() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "SAMSUNG"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L15
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public static boolean isVivo() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "VIVO"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L23
            java.lang.String r0 = "ro.vivo.os.version"
            java.lang.String r1 = ""
            java.lang.String r0 = sysProperty(r0, r1)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L21
            goto L23
        L21:
            r0 = 0
            return r0
        L23:
            r0 = 1
            return r0
    }

    public static boolean isXiaomi() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "XIAOMI"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L1d
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = r0.equalsIgnoreCase(r1)
            if (r1 != 0) goto L1d
            java.lang.String r1 = "REDMI"
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

    public static boolean isZTE() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r1 = "ZTE"
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 != 0) goto L15
            java.lang.String r0 = android.os.Build.BRAND
            boolean r0 = r0.equalsIgnoreCase(r1)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public static java.lang.String sysProperty(java.lang.String r7, java.lang.String r8) {
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
            goto L3a
        L24:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r0 = "System property invoke error: "
            r8.append(r0)
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            xyz.adscope.common.v2.dev.oaid.sm.oaid.OAIDLog.print(r7)
            r7 = 0
        L3a:
            if (r7 != 0) goto L3e
            java.lang.String r7 = ""
        L3e:
            return r7
    }
}

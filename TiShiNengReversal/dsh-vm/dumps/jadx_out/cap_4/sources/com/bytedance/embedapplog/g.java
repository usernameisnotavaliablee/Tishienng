package com.bytedance.embedapplog;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g {
    private static final java.lang.CharSequence cw = null;
    private static final java.lang.CharSequence j = null;

    /* renamed from: r, reason: collision with root package name */
    private static final com.bytedance.embedapplog.g.j<java.lang.Boolean> f2079r = null;
    private static final java.lang.CharSequence xt = null;


    static abstract class j<T> {
        j() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            java.lang.String r0 = "sony"
            com.bytedance.embedapplog.g.j = r0
            java.lang.String r0 = "amigo"
            com.bytedance.embedapplog.g.xt = r0
            java.lang.String r0 = "funtouch"
            com.bytedance.embedapplog.g.cw = r0
            com.bytedance.embedapplog.g$1 r0 = new com.bytedance.embedapplog.g$1
            r0.<init>()
            com.bytedance.embedapplog.g.f2079r = r0
            return
    }

    public g() {
            r1 = this;
            r1.<init>()
            return
    }

    public static boolean ae() {
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

    public static boolean cw() {
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "honor"
            if (r1 != 0) goto L14
            java.lang.String r0 = r0.toLowerCase()
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L2e
        L14:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L26
            java.lang.String r1 = r0.toLowerCase()
            boolean r1 = r1.startsWith(r2)
            if (r1 != 0) goto L2e
        L26:
            java.lang.String r1 = "HONOR"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L30
        L2e:
            r0 = 1
            return r0
        L30:
            r0 = 0
            return r0
    }

    public static boolean g() {
            java.lang.String r0 = "OnePlus"
            java.lang.String r1 = android.os.Build.MANUFACTURER
            boolean r0 = r0.equalsIgnoreCase(r1)
            return r0
    }

    public static java.lang.String j() {
            java.lang.String r0 = "ro.build.version.emui"
            java.lang.String r0 = xt(r0)
            return r0
    }

    public static boolean j(android.content.Context r1) {
            java.lang.String r1 = ws()
            java.lang.String r1 = r1.toUpperCase()
            java.lang.String r0 = "HUAWEI"
            boolean r1 = r1.contains(r0)
            return r1
    }

    public static boolean j(java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto La
            java.lang.String r3 = j()
        La:
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            r1 = 1
            if (r0 != 0) goto L2a
            java.lang.String r0 = r3.toLowerCase()
            java.lang.String r2 = "emotionui"
            boolean r0 = r0.contains(r2)
            if (r0 != 0) goto L29
            java.lang.String r3 = r3.toLowerCase()
            java.lang.String r0 = "magicui"
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L2a
        L29:
            return r1
        L2a:
            boolean r3 = xt()
            if (r3 != 0) goto L39
            boolean r3 = cw()
            if (r3 == 0) goto L37
            goto L39
        L37:
            r3 = 0
            return r3
        L39:
            return r1
    }

    public static boolean jy() {
            java.lang.String r0 = ws()
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r1 = "ASUS"
            boolean r0 = r0.contains(r1)
            return r0
    }

    public static boolean m() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            r2 = 0
            if (r1 != 0) goto L25
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r3 = "oppo"
            boolean r1 = r1.contains(r3)
            if (r1 != 0) goto L23
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "realme"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L22
            goto L23
        L22:
            return r2
        L23:
            r0 = 1
            return r0
        L25:
            return r2
    }

    public static boolean oq() {
            java.lang.String r0 = android.os.Build.BRAND
            java.lang.String r1 = "samsung"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 0
            return r0
        L15:
            r0 = 1
            return r0
    }

    public static boolean qv() {
            java.lang.String r0 = android.os.Build.FINGERPRINT
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "VIBEUI_V2"
            if (r1 != 0) goto Lf
            boolean r0 = r0.contains(r2)
            return r0
        Lf:
            java.lang.String r0 = "ro.build.version.incremental"
            java.lang.String r0 = xt(r0)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L23
            boolean r0 = r0.contains(r2)
            if (r0 == 0) goto L23
            r0 = 1
            return r0
        L23:
            r0 = 0
            return r0
    }

    public static boolean r() {
            r0 = 0
            java.lang.String r1 = "android.os.SystemProperties"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L27
            java.lang.String r2 = "get"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Exception -> L27
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r4[r0] = r5     // Catch: java.lang.Exception -> L27
            java.lang.reflect.Method r2 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Exception -> L27
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = "ro.build.version.emui"
            r4[r0] = r5     // Catch: java.lang.Exception -> L27
            java.lang.Object r1 = r2.invoke(r1, r4)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Exception -> L27
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Exception -> L27
            if (r1 != 0) goto L3d
            return r3
        L27:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "Honor"
            com.bytedance.sdk.component.utils.vl.r(r2, r1)
        L3d:
            return r0
    }

    public static boolean tl() {
            java.lang.String r0 = android.os.Build.BRAND
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "meizu"
            boolean r0 = r0.contains(r1)
            return r0
    }

    public static boolean up() {
            r0 = 0
            java.lang.String r1 = "miui.os.Build"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Exception -> L12
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Exception -> L12
            int r1 = r1.length()     // Catch: java.lang.Exception -> L12
            if (r1 <= 0) goto L12
            r0 = 1
        L12:
            return r0
    }

    public static boolean vl() {
            java.lang.String r0 = ws()
            java.lang.String r0 = r0.toUpperCase()
            java.lang.String r1 = "NUBIA"
            boolean r0 = r0.contains(r1)
            return r0
    }

    private static java.lang.String ws() {
            java.lang.String r0 = android.os.Build.MANUFACTURER
            if (r0 != 0) goto L7
            java.lang.String r0 = ""
            return r0
        L7:
            java.lang.String r0 = r0.trim()
            return r0
    }

    private static java.lang.String xt(java.lang.String r2) {
            java.lang.String r0 = com.bytedance.embedapplog.nt.j(r2)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.String r2 = com.bytedance.embedapplog.ri.j(r2)
            return r2
    }

    public static boolean xt() {
            java.lang.String r0 = android.os.Build.BRAND
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            java.lang.String r2 = "huawei"
            if (r1 != 0) goto L14
            java.lang.String r0 = r0.toLowerCase()
            boolean r0 = r0.startsWith(r2)
            if (r0 != 0) goto L26
        L14:
            java.lang.String r0 = android.os.Build.MANUFACTURER
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L28
            java.lang.String r0 = r0.toLowerCase()
            boolean r0 = r0.startsWith(r2)
            if (r0 == 0) goto L28
        L26:
            r0 = 1
            return r0
        L28:
            r0 = 0
            return r0
    }
}

package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class c5 {
    public c5() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a() {
            java.lang.String r0 = "HookDetection"
            java.util.HashSet r1 = new java.util.HashSet     // Catch: java.lang.Exception -> L43
            r1.<init>()     // Catch: java.lang.Exception -> L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L43
            r2.<init>()     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = "/proc/"
            r2.append(r3)     // Catch: java.lang.Exception -> L43
            int r3 = android.os.Process.myPid()     // Catch: java.lang.Exception -> L43
            r2.append(r3)     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = "/maps"
            r2.append(r3)     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L43
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L43
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Exception -> L43
            r4.<init>(r2)     // Catch: java.lang.Exception -> L43
            r3.<init>(r4)     // Catch: java.lang.Exception -> L43
        L2b:
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Exception -> L43
            r4 = 1
            if (r2 == 0) goto L54
            java.lang.String r5 = ".so"
            boolean r5 = r2.endsWith(r5)     // Catch: java.lang.Exception -> L43
            if (r5 != 0) goto L45
            java.lang.String r5 = ".jar"
            boolean r5 = r2.endsWith(r5)     // Catch: java.lang.Exception -> L43
            if (r5 == 0) goto L2b
            goto L45
        L43:
            r1 = move-exception
            goto L84
        L45:
            java.lang.String r5 = " "
            int r5 = r2.lastIndexOf(r5)     // Catch: java.lang.Exception -> L43
            int r5 = r5 + r4
            java.lang.String r2 = r2.substring(r5)     // Catch: java.lang.Exception -> L43
            r1.add(r2)     // Catch: java.lang.Exception -> L43
            goto L2b
        L54:
            r3.close()     // Catch: java.lang.Exception -> L43
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L43
        L5b:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Exception -> L43
            if (r2 == 0) goto L8b
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Exception -> L43
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = "XposedBridge.jar"
            boolean r3 = r2.contains(r3)     // Catch: java.lang.Exception -> L43
            if (r3 == 0) goto L5b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L43
            r1.<init>()     // Catch: java.lang.Exception -> L43
            java.lang.String r3 = "Xposed JAR found: "
            r1.append(r3)     // Catch: java.lang.Exception -> L43
            r1.append(r2)     // Catch: java.lang.Exception -> L43
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L43
            com.acse.ottn.h2.a(r0, r1)     // Catch: java.lang.Exception -> L43
            return r4
        L84:
            java.lang.String r1 = r1.toString()
            com.acse.ottn.h2.a(r0, r1)
        L8b:
            r0 = 0
            return r0
    }

    public static void b() {
            java.lang.String r0 = "xposed_state"
            r1 = 0
            com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L2e
            android.content.Context r2 = com.acse.ottn.util.HelpShopAppUtil.getContext()     // Catch: java.lang.Exception -> L2e
            android.content.pm.PackageManager r2 = r2.getPackageManager()     // Catch: java.lang.Exception -> L2e
            java.lang.String r3 = "de.robv.android.xposed.installer"
            android.content.pm.PackageInfo r3 = r2.getPackageInfo(r3, r1)     // Catch: java.lang.Exception -> L2e
            android.content.pm.ApplicationInfo r3 = r3.applicationInfo     // Catch: java.lang.Exception -> L2e
            java.lang.CharSequence r2 = r2.getApplicationLabel(r3)     // Catch: java.lang.Exception -> L2e
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Exception -> L2e
            boolean r2 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Exception -> L2e
            if (r2 != 0) goto L2e
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()     // Catch: java.lang.Exception -> L2e
            java.lang.Boolean r3 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L2e
            r2.a(r0, r3)     // Catch: java.lang.Exception -> L2e
            r1 = 1
        L2e:
            com.acse.ottn.n3 r2 = com.acse.ottn.n3.a()
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r2.a(r0, r1)
            return
    }

    public static boolean c() {
            r0 = 0
            return r0
    }

    public static void d() {
            b()     // Catch: java.lang.Exception -> L3
        L3:
            return
    }
}

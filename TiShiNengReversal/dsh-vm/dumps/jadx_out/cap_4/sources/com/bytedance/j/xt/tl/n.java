package com.bytedance.j.xt.tl;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class n {
    private static java.lang.String a;

    public n() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String a() {
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L43
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L43
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L43
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L43
            int r5 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L43
            r4.append(r5)     // Catch: java.lang.Throwable -> L43
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L43
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L43
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L43
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L43
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
        L2e:
            int r3 = r1.read()     // Catch: java.lang.Throwable -> L39
            if (r3 <= 0) goto L3b
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L39
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            goto L2e
        L39:
            goto L45
        L3b:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L39
            r1.close()     // Catch: java.io.IOException -> L42
        L42:
            return r0
        L43:
            r1 = r0
        L45:
            if (r1 == 0) goto L4a
            r1.close()     // Catch: java.io.IOException -> L4a
        L4a:
            return r0
    }

    private static java.lang.String b() {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lf
            java.lang.String r0 = androidx.work.impl.utils.d.a()     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            r0 = move-exception
            com.bytedance.sdk.component.utils.vl.j(r0)
        Lf:
            r0 = 0
            return r0
    }

    public static java.lang.String c(android.content.Context r0) {
            java.lang.String r0 = com.bytedance.j.xt.tl.n.a
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lb
            java.lang.String r0 = com.bytedance.j.xt.tl.n.a
            return r0
        Lb:
            java.lang.String r0 = b()
            com.bytedance.j.xt.tl.n.a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L1a
            java.lang.String r0 = com.bytedance.j.xt.tl.n.a
            return r0
        L1a:
            java.lang.String r0 = d()
            com.bytedance.j.xt.tl.n.a = r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L29
            java.lang.String r0 = com.bytedance.j.xt.tl.n.a
            return r0
        L29:
            java.lang.String r0 = a()
            com.bytedance.j.xt.tl.n.a = r0
            return r0
    }

    private static java.lang.String d() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L25
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L25
            java.lang.String r2 = "currentProcessName"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L25
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Throwable -> L25
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L25
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L25
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L25
            if (r2 == 0) goto L27
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L25
            return r1
        L25:
            r1 = move-exception
            goto L28
        L27:
            return r0
        L28:
            com.bytedance.sdk.component.utils.vl.j(r1)
            return r0
    }
}

package com.bytedance.pangle.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class r {
    private static java.lang.String j;
    private static java.util.List<java.lang.String> xt;

    static {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            com.bytedance.pangle.up.r.xt = r0
            return
    }

    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    private static java.lang.String j() {
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L60
            java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L60
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = "/proc/"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L60
            int r5 = android.os.Process.myPid()     // Catch: java.lang.Throwable -> L60
            r4.append(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r5 = "/cmdline"
            r4.append(r5)     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L60
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L60
            java.lang.String r4 = "iso-8859-1"
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L60
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L60
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            r2.<init>()     // Catch: java.lang.Throwable -> L39
        L2e:
            int r3 = r1.read()     // Catch: java.lang.Throwable -> L39
            if (r3 <= 0) goto L3b
            char r3 = (char) r3     // Catch: java.lang.Throwable -> L39
            r2.append(r3)     // Catch: java.lang.Throwable -> L39
            goto L2e
        L39:
            goto L62
        L3b:
            boolean r3 = com.bytedance.pangle.log.ZeusLogger.isDebug()     // Catch: java.lang.Throwable -> L39
            if (r3 == 0) goto L58
            java.lang.String r3 = "Process"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = "get processName = "
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.String r5 = r2.toString()     // Catch: java.lang.Throwable -> L39
            r4.append(r5)     // Catch: java.lang.Throwable -> L39
            java.lang.String r4 = r4.toString()     // Catch: java.lang.Throwable -> L39
            com.bytedance.pangle.log.ZeusLogger.d(r3, r4)     // Catch: java.lang.Throwable -> L39
        L58:
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L39
            r1.close()     // Catch: java.lang.Exception -> L5f
        L5f:
            return r0
        L60:
            r1 = r0
        L62:
            if (r1 == 0) goto L67
            r1.close()     // Catch: java.lang.Exception -> L67
        L67:
            return r0
    }

    public static java.lang.String j(android.content.Context r2) {
            java.lang.String r2 = com.bytedance.pangle.up.r.j
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Lb
            java.lang.String r2 = com.bytedance.pangle.up.r.j
            return r2
        Lb:
            int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L20
            r0 = 28
            if (r2 < r0) goto L20
            java.lang.String r2 = androidx.work.impl.utils.d.a()     // Catch: java.lang.Throwable -> L20
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L20
            if (r0 != 0) goto L1d
            com.bytedance.pangle.up.r.j = r2     // Catch: java.lang.Throwable -> L20
        L1d:
            java.lang.String r2 = com.bytedance.pangle.up.r.j     // Catch: java.lang.Throwable -> L20
            return r2
        L20:
            java.lang.String r2 = "android.app.ActivityThread"
            java.lang.Class r2 = java.lang.Class.forName(r2)     // Catch: java.lang.Exception -> L3f
            java.lang.String r0 = "currentProcessName"
            r1 = 0
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.Exception -> L3f
            java.lang.Object r2 = com.bytedance.pangle.util.MethodUtils.invokeStaticMethod(r2, r0, r1)     // Catch: java.lang.Exception -> L3f
            r0 = r2
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Exception -> L3f
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> L3f
            if (r0 != 0) goto L3c
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Exception -> L3f
            com.bytedance.pangle.up.r.j = r2     // Catch: java.lang.Exception -> L3f
        L3c:
            java.lang.String r2 = com.bytedance.pangle.up.r.j     // Catch: java.lang.Exception -> L3f
            return r2
        L3f:
            r2 = move-exception
            com.bytedance.sdk.openadsdk.api.m.j(r2)
            java.lang.String r2 = j()
            com.bytedance.pangle.up.r.j = r2
            return r2
    }

    public static java.lang.String j(java.lang.String r2) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L17
            java.lang.String r0 = ":"
            boolean r1 = r2.contains(r0)
            if (r1 != 0) goto Lf
            goto L17
        Lf:
            java.lang.String[] r2 = r2.split(r0)
            r0 = 1
            r2 = r2[r0]
            return r2
        L17:
            java.lang.String r2 = "main"
            return r2
    }

    public static boolean xt(android.content.Context r3) {
            java.lang.String r0 = j(r3)
            r1 = 0
            if (r0 == 0) goto L10
            java.lang.String r2 = ":"
            boolean r2 = r0.contains(r2)
            if (r2 == 0) goto L10
            return r1
        L10:
            if (r0 == 0) goto L1e
            java.lang.String r3 = r3.getPackageName()
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L1e
            r3 = 1
            return r3
        L1e:
            return r1
    }
}

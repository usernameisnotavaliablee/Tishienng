package com.qq.e.comm.managers.plugin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static java.lang.reflect.Method a;
    private static boolean b;

    static {
            return
    }

    public a() {
            r1 = this;
            r1.<init>()
            return
    }

    private static void a(java.lang.Throwable r5) throws java.lang.Throwable {
            boolean r0 = com.qq.e.comm.managers.plugin.a.b
            if (r0 == 0) goto L5
            return
        L5:
            java.lang.reflect.Method r0 = com.qq.e.comm.managers.plugin.a.a
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L1e
            java.lang.Class[] r0 = new java.lang.Class[r2]
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r0[r1] = r3
            java.lang.String r3 = "postCatchedException"
            java.lang.Class<com.tencent.bugly.crashreport.CrashReport> r4 = com.tencent.bugly.crashreport.CrashReport.class
            java.lang.reflect.Method r0 = r4.getDeclaredMethod(r3, r0)
            com.qq.e.comm.managers.plugin.a.a = r0
            r0.setAccessible(r2)
        L1e:
            java.lang.reflect.Method r0 = com.qq.e.comm.managers.plugin.a.a
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r1] = r5
            r5 = 0
            r0.invoke(r5, r2)
            return
    }

    public static void a(java.lang.Throwable r3, java.lang.String r4) {
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L1a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L1a
            r1.<init>()     // Catch: java.lang.Throwable -> L1a
            java.lang.String r2 = "插件错误："
            r1.append(r2)     // Catch: java.lang.Throwable -> L1a
            r1.append(r4)     // Catch: java.lang.Throwable -> L1a
            java.lang.String r4 = r1.toString()     // Catch: java.lang.Throwable -> L1a
            r0.<init>(r4, r3)     // Catch: java.lang.Throwable -> L1a
            a(r0)     // Catch: java.lang.Throwable -> L1a
            return
        L1a:
            r3 = 1
            com.qq.e.comm.managers.plugin.a.b = r3
            return
    }
}

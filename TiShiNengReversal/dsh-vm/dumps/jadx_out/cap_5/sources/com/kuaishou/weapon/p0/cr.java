package com.kuaishou.weapon.p0;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class cr {
    private static volatile boolean a = false;
    private static volatile boolean b = true;

    static {
            java.lang.String r0 = "dalvik.system.VMRuntime"
            java.lang.Class r1 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = "is64Bit"
            r3 = 0
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r3)     // Catch: java.lang.Exception -> L28
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Exception -> L28
            java.lang.String r2 = "getRuntime"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r2, r3)     // Catch: java.lang.Exception -> L28
            java.lang.Object r0 = r0.invoke(r3, r3)     // Catch: java.lang.Exception -> L28
            java.lang.Object r0 = r1.invoke(r0, r3)     // Catch: java.lang.Exception -> L28
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L28
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L28
            com.kuaishou.weapon.p0.cr.a = r0     // Catch: java.lang.Exception -> L28
            goto L2b
        L28:
            r0 = 0
            com.kuaishou.weapon.p0.cr.a = r0
        L2b:
            java.lang.String r0 = "java.vm.version"
            java.lang.String r0 = java.lang.System.getProperty(r0)
            java.lang.String r1 = "2"
            boolean r0 = r0.startsWith(r1)
            com.kuaishou.weapon.p0.cr.b = r0
            return
    }

    public cr() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean a() {
            boolean r0 = com.kuaishou.weapon.p0.cr.a
            return r0
    }

    public static boolean b() {
            boolean r0 = com.kuaishou.weapon.p0.cr.b
            return r0
    }
}

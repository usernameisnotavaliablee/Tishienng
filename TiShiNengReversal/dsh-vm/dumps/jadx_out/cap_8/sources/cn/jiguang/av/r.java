package cn.jiguang.av;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class r {
    public r() {
            r1 = this;
            r1.<init>()
            return
    }

    public static android.app.Application a() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r2 = c()     // Catch: java.lang.Throwable -> L1b
            java.lang.String r3 = "getApplication"
            java.lang.reflect.Method r1 = r1.getMethod(r3, r0)     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r1 = r1.invoke(r2, r0)     // Catch: java.lang.Throwable -> L1b
            if (r1 != 0) goto L18
            return r0
        L18:
            android.app.Application r1 = (android.app.Application) r1     // Catch: java.lang.Throwable -> L1b
            return r1
        L1b:
            return r0
    }

    public static java.lang.Object a(java.lang.Object r1, java.lang.String r2, java.lang.Object[] r3, java.lang.Class[] r4) {
            a(r1)
            a(r4, r3)
            java.lang.Class r0 = r1.getClass()
            java.lang.reflect.Method r2 = r0.getMethod(r2, r4)
            java.lang.Object r1 = r2.invoke(r1, r3)
            return r1
    }

    private static void a(java.lang.Object r1) {
            if (r1 == 0) goto L3
            return
        L3:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r0 = "owner can not be null"
            r1.<init>(r0)
            throw r1
    }

    private static void a(java.lang.Class<?>[] r1, java.lang.Object[] r2) {
            r0 = 0
            if (r2 == 0) goto L5
            int r2 = r2.length
            goto L6
        L5:
            r2 = 0
        L6:
            if (r1 == 0) goto L9
            int r0 = r1.length
        L9:
            if (r2 != r0) goto Lc
            return
        Lc:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r2 = "argClasses' size is not equal to args' size"
            r1.<init>(r2)
            throw r1
    }

    public static java.lang.String b() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class<android.app.Application> r2 = android.app.Application.class
            java.lang.ClassLoader r2 = r2.getClassLoader()     // Catch: java.lang.Throwable -> L23
            r3 = 0
            java.lang.Class r1 = java.lang.Class.forName(r1, r3, r2)     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "currentProcessName"
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r0)     // Catch: java.lang.Throwable -> L23
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L23
            boolean r2 = r1 instanceof java.lang.String     // Catch: java.lang.Throwable -> L23
            if (r2 == 0) goto L25
            java.lang.String r1 = (java.lang.String) r1     // Catch: java.lang.Throwable -> L23
            return r1
        L23:
            r1 = move-exception
            goto L26
        L25:
            return r0
        L26:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getCurrentProcessNameByActivityThread: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "ReflectUtils"
            cn.jiguang.w.f.i(r2, r1)
            return r0
    }

    private static java.lang.Object c() {
            java.lang.Object r0 = d()
            if (r0 == 0) goto L7
            return r0
        L7:
            java.lang.Object r0 = e()
            return r0
    }

    private static java.lang.Object d() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L16
            java.lang.String r2 = "sCurrentActivityThread"
            java.lang.reflect.Field r1 = r1.getDeclaredField(r2)     // Catch: java.lang.Throwable -> L16
            r2 = 1
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L16
            java.lang.Object r0 = r1.get(r0)     // Catch: java.lang.Throwable -> L16
            return r0
        L16:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getActivityThreadInActivityThreadStaticField: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "ReflectUtils"
            cn.jiguang.w.f.i(r2, r1)
            return r0
    }

    private static java.lang.Object e() {
            r0 = 0
            java.lang.String r1 = "android.app.ActivityThread"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L12
            java.lang.String r2 = "currentActivityThread"
            java.lang.reflect.Method r1 = r1.getMethod(r2, r0)     // Catch: java.lang.Throwable -> L12
            java.lang.Object r0 = r1.invoke(r0, r0)     // Catch: java.lang.Throwable -> L12
            return r0
        L12:
            r1 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "getActivityThreadInActivityThreadStaticMethod: "
            r2.append(r3)
            java.lang.String r1 = r1.getMessage()
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r2 = "ReflectUtils"
            cn.jiguang.w.f.i(r2, r1)
            return r0
    }
}

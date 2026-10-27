package com.bytedance.pangle.xt.j;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private static java.util.Map<java.lang.String, java.lang.reflect.Constructor> cw;
    private static java.util.Map<java.lang.String, java.lang.reflect.Field> j;
    private static java.util.Map<java.lang.String, java.lang.Class> r;
    private static java.util.Map<java.lang.String, java.lang.reflect.Method> xt;

    static {
            java.lang.String r0 = "Zeus/init_pangle"
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.bytedance.pangle.xt.j.j.j = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.bytedance.pangle.xt.j.j.xt = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.bytedance.pangle.xt.j.j.cw = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            com.bytedance.pangle.xt.j.j.r = r1
            java.lang.Class<com.bytedance.pangle.xt.j.xt> r1 = com.bytedance.pangle.xt.j.xt.class
            java.lang.String r2 = "classLoader"
            r3 = 0
            com.bytedance.pangle.util.FieldUtils.writeField(r1, r2, r3)     // Catch: java.lang.Exception -> L2c
            java.lang.String r1 = "HackHelper HackHelperImpl use BootClassLoader"
            com.bytedance.pangle.log.ZeusLogger.w(r0, r1)     // Catch: java.lang.Exception -> L2c
            return
        L2c:
            r1 = move-exception
            java.lang.String r2 = "HackHelperinit failed"
            com.bytedance.pangle.log.ZeusLogger.errReport(r0, r2, r1)
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.reflect.Constructor j(java.lang.Class<?> r5, java.lang.Class<?>... r6) {
            java.lang.String r0 = "clinit"
            java.lang.String r0 = xt(r5, r0, r6)
            java.util.Map<java.lang.String, java.lang.reflect.Constructor> r1 = com.bytedance.pangle.xt.j.j.cw
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.reflect.Constructor> r2 = com.bytedance.pangle.xt.j.j.cw     // Catch: java.lang.Throwable -> L59
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.reflect.Constructor r2 = (java.lang.reflect.Constructor) r2     // Catch: java.lang.Throwable -> L59
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            r1 = 1
            if (r2 == 0) goto L1f
            boolean r5 = r2.isAccessible()
            if (r5 != 0) goto L1e
            r2.setAccessible(r1)
        L1e:
            return r2
        L1f:
            java.lang.reflect.Constructor r6 = com.bytedance.pangle.xt.j.xt.j(r5, r6)     // Catch: java.lang.Throwable -> L32
            if (r6 == 0) goto L34
            java.util.Map<java.lang.String, java.lang.reflect.Constructor> r2 = com.bytedance.pangle.xt.j.j.cw     // Catch: java.lang.Throwable -> L32
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L32
            java.util.Map<java.lang.String, java.lang.reflect.Constructor> r3 = com.bytedance.pangle.xt.j.j.cw     // Catch: java.lang.Throwable -> L2f
            r3.put(r0, r6)     // Catch: java.lang.Throwable -> L2f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            return r6
        L2f:
            r6 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2f
            throw r6     // Catch: java.lang.Throwable -> L32
        L32:
            r6 = move-exception
            goto L35
        L34:
            return r6
        L35:
            java.lang.String r0 = "Zeus_pangle"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "HackHelper"
            r2.<init>(r3)
            java.lang.String r3 = "getConstructor %s failed !!!"
            java.lang.String r5 = r5.getName()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r4 = 0
            r1[r4] = r5
            java.lang.String r5 = java.lang.String.format(r3, r1)
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r0, r5, r6)
            r5 = 0
            return r5
        L59:
            r5 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L59
            throw r5
    }

    public static java.lang.reflect.Field j(java.lang.Class<?> r7, java.lang.String r8) {
            java.lang.String r0 = xt(r7, r8)
            java.util.Map<java.lang.String, java.lang.reflect.Field> r1 = com.bytedance.pangle.xt.j.j.j
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.reflect.Field> r2 = com.bytedance.pangle.xt.j.j.j     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            r1 = 1
            if (r2 == 0) goto L1d
            boolean r7 = r2.isAccessible()
            if (r7 != 0) goto L1c
            r2.setAccessible(r1)
        L1c:
            return r2
        L1d:
            java.lang.reflect.Field r2 = com.bytedance.pangle.xt.j.xt.j(r7, r8)     // Catch: java.lang.Throwable -> L30
            if (r2 == 0) goto L32
            java.util.Map<java.lang.String, java.lang.reflect.Field> r3 = com.bytedance.pangle.xt.j.j.j     // Catch: java.lang.Throwable -> L30
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L30
            java.util.Map<java.lang.String, java.lang.reflect.Field> r4 = com.bytedance.pangle.xt.j.j.j     // Catch: java.lang.Throwable -> L2d
            r4.put(r0, r2)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            return r2
        L2d:
            r0 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L2d
            throw r0     // Catch: java.lang.Throwable -> L30
        L30:
            r0 = move-exception
            goto L33
        L32:
            return r2
        L33:
            java.lang.String r2 = "Zeus_pangle"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "HackHelper"
            r3.<init>(r4)
            java.lang.String r4 = "getField %s#%s failed !!!"
            java.lang.String r7 = r7.getName()
            r5 = 2
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r6 = 0
            r5[r6] = r7
            r5[r1] = r8
            java.lang.String r7 = java.lang.String.format(r4, r5)
            r3.append(r7)
            java.lang.String r7 = r3.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r2, r7, r0)
            r7 = 0
            return r7
        L5a:
            r7 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            throw r7
    }

    public static java.lang.reflect.Method j(java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<?>... r8) {
            java.lang.String r0 = xt(r6, r7, r8)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r1 = com.bytedance.pangle.xt.j.j.xt
            monitor-enter(r1)
            java.util.Map<java.lang.String, java.lang.reflect.Method> r2 = com.bytedance.pangle.xt.j.j.xt     // Catch: java.lang.Throwable -> L5a
            java.lang.Object r2 = r2.get(r0)     // Catch: java.lang.Throwable -> L5a
            java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            r1 = 1
            if (r2 == 0) goto L1d
            boolean r6 = r2.isAccessible()
            if (r6 != 0) goto L1c
            r2.setAccessible(r1)
        L1c:
            return r2
        L1d:
            java.lang.reflect.Method r8 = com.bytedance.pangle.xt.j.xt.j(r6, r7, r8)     // Catch: java.lang.Throwable -> L30
            if (r8 == 0) goto L32
            java.util.Map<java.lang.String, java.lang.reflect.Method> r2 = com.bytedance.pangle.xt.j.j.xt     // Catch: java.lang.Throwable -> L30
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L30
            java.util.Map<java.lang.String, java.lang.reflect.Method> r3 = com.bytedance.pangle.xt.j.j.xt     // Catch: java.lang.Throwable -> L2d
            r3.put(r0, r8)     // Catch: java.lang.Throwable -> L2d
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            return r8
        L2d:
            r8 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            throw r8     // Catch: java.lang.Throwable -> L30
        L30:
            r8 = move-exception
            goto L33
        L32:
            return r8
        L33:
            java.lang.String r0 = "Zeus_pangle"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "HackHelper"
            r2.<init>(r3)
            java.lang.String r3 = "getMethod %s#%s failed !!!"
            java.lang.String r6 = r6.getName()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r5 = 0
            r4[r5] = r6
            r4[r1] = r7
            java.lang.String r6 = java.lang.String.format(r3, r4)
            r2.append(r6)
            java.lang.String r6 = r2.toString()
            com.bytedance.pangle.log.ZeusLogger.w(r0, r6, r8)
            r6 = 0
            return r6
        L5a:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5a
            throw r6
    }

    private static java.lang.String xt(java.lang.Class<?> r1, java.lang.String r2) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r1.getName()
            r0.append(r1)
            java.lang.String r1 = "#"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static java.lang.String xt(java.lang.Class<?> r3, java.lang.String r4, java.lang.Class<?>... r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = "#"
            r0.append(r3)
            r0.append(r4)
            if (r5 == 0) goto L2c
            int r4 = r5.length
            if (r4 <= 0) goto L2c
            int r4 = r5.length
            r1 = 0
        L1b:
            if (r1 >= r4) goto L35
            r2 = r5[r1]
            java.lang.String r2 = r2.getName()
            r0.append(r2)
            r0.append(r3)
            int r1 = r1 + 1
            goto L1b
        L2c:
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            java.lang.String r3 = r3.getName()
            r0.append(r3)
        L35:
            java.lang.String r3 = r0.toString()
            return r3
    }
}

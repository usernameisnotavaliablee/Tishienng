package com.bytedance.pangle.xt.xt;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class j {
    private static java.lang.reflect.Method cw;
    private static java.lang.reflect.Method j;
    private static java.lang.reflect.Method r;
    private static java.lang.reflect.Method xt;

    static {
            java.lang.Class<java.lang.Class[]> r0 = java.lang.Class[].class
            java.lang.Class<java.lang.String> r1 = java.lang.String.class
            java.lang.Class<java.lang.Class> r2 = java.lang.Class.class
            java.lang.String r3 = "getDeclaredField"
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L3c
            r6 = 0
            r5[r6] = r1     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L3c
            com.bytedance.pangle.xt.xt.j.j = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "getDeclaredMethod"
            r5 = 2
            java.lang.Class[] r5 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L3c
            r5[r6] = r1     // Catch: java.lang.Throwable -> L3c
            r5[r4] = r0     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r3 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L3c
            com.bytedance.pangle.xt.xt.j.xt = r3     // Catch: java.lang.Throwable -> L3c
            java.lang.String r3 = "getDeclaredConstructor"
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L3c
            r5[r6] = r0     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r3, r5)     // Catch: java.lang.Throwable -> L3c
            com.bytedance.pangle.xt.xt.j.cw = r0     // Catch: java.lang.Throwable -> L3c
            java.lang.String r0 = "forName"
            java.lang.Class[] r3 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L3c
            r3[r6] = r1     // Catch: java.lang.Throwable -> L3c
            java.lang.reflect.Method r0 = r2.getDeclaredMethod(r0, r3)     // Catch: java.lang.Throwable -> L3c
            com.bytedance.pangle.xt.xt.j.r = r0     // Catch: java.lang.Throwable -> L3c
            return
        L3c:
            r0 = move-exception
            java.lang.String r1 = "Zeus/init_pangle"
            java.lang.String r2 = "DoubleReflectorinit failed"
            com.bytedance.pangle.log.ZeusLogger.errReport(r1, r2, r0)
            return
    }

    public j() {
            r1 = this;
            r1.<init>()
            return
    }

    public static java.lang.reflect.Constructor j(java.lang.Class<?> r7, java.lang.Class<?>... r8) {
            java.lang.reflect.Method r0 = com.bytedance.pangle.xt.xt.j.cw
            if (r0 == 0) goto L3f
            r1 = 1
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r1]     // Catch: java.lang.Throwable -> L11
            r3[r2] = r8     // Catch: java.lang.Throwable -> L11
            java.lang.Object r0 = r0.invoke(r7, r3)     // Catch: java.lang.Throwable -> L11
            java.lang.reflect.Constructor r0 = (java.lang.reflect.Constructor) r0     // Catch: java.lang.Throwable -> L11
            goto L40
        L11:
            r0 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "DoubleReflector"
            r3.<init>(r4)
            java.lang.String r4 = r7.getName()
            if (r8 == 0) goto L21
            int r5 = r8.length
            goto L22
        L21:
            r5 = 0
        L22:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r4
            r6[r1] = r5
            java.lang.String r1 = "getConstructor %s<init>%s failed !!!"
            java.lang.String r1 = java.lang.String.format(r1, r6)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "Zeus_pangle"
            com.bytedance.pangle.log.ZeusLogger.w(r2, r1, r0)
        L3f:
            r0 = 0
        L40:
            if (r0 == 0) goto L43
            return r0
        L43:
            java.lang.reflect.Constructor r7 = com.bytedance.pangle.xt.j.j.j(r7, r8)
            return r7
    }

    public static java.lang.reflect.Field j(java.lang.Class<?> r8, java.lang.String r9) {
            java.lang.reflect.Method r0 = com.bytedance.pangle.xt.xt.j.j
            r1 = 0
            if (r0 == 0) goto L44
            r2 = 0
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1b
            r4[r2] = r9     // Catch: java.lang.Throwable -> L1b
            java.lang.Object r0 = r0.invoke(r8, r4)     // Catch: java.lang.Throwable -> L1b
            java.lang.reflect.Field r0 = (java.lang.reflect.Field) r0     // Catch: java.lang.Throwable -> L1b
            if (r0 == 0) goto L19
            r0.setAccessible(r3)     // Catch: java.lang.Throwable -> L17
            goto L19
        L17:
            r1 = move-exception
            goto L1f
        L19:
            r1 = r0
            goto L44
        L1b:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L1f:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "DoubleReflector"
            r4.<init>(r5)
            java.lang.String r5 = r8.getName()
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]
            r6[r2] = r5
            r6[r3] = r9
            java.lang.String r2 = "getField %s#%s failed !!!"
            java.lang.String r2 = java.lang.String.format(r2, r6)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r3 = "Zeus_pangle"
            com.bytedance.pangle.log.ZeusLogger.w(r3, r2, r1)
            goto L19
        L44:
            if (r1 == 0) goto L47
            return r1
        L47:
            java.lang.reflect.Field r8 = com.bytedance.pangle.xt.j.j.j(r8, r9)
            return r8
    }

    public static java.lang.reflect.Method j(java.lang.Class<?> r8, java.lang.String r9, java.lang.Class<?>... r10) {
            java.lang.reflect.Method r0 = com.bytedance.pangle.xt.xt.j.xt
            r1 = 0
            if (r0 == 0) goto L46
            r2 = 0
            r3 = 2
            r4 = 1
            java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L1e
            r5[r2] = r9     // Catch: java.lang.Throwable -> L1e
            r5[r4] = r10     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r0.invoke(r8, r5)     // Catch: java.lang.Throwable -> L1e
            java.lang.reflect.Method r0 = (java.lang.reflect.Method) r0     // Catch: java.lang.Throwable -> L1e
            if (r0 == 0) goto L1c
            r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L1a
            goto L1c
        L1a:
            r1 = move-exception
            goto L22
        L1c:
            r1 = r0
            goto L46
        L1e:
            r0 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
        L22:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "DoubleReflector"
            r5.<init>(r6)
            java.lang.String r6 = r8.getName()
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r6
            r3[r4] = r9
            java.lang.String r2 = "getMethod %s#%s failed !!!"
            java.lang.String r2 = java.lang.String.format(r2, r3)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            java.lang.String r3 = "Zeus_pangle"
            com.bytedance.pangle.log.ZeusLogger.w(r3, r2, r1)
            goto L1c
        L46:
            if (r1 == 0) goto L49
            return r1
        L49:
            java.lang.reflect.Method r8 = com.bytedance.pangle.xt.j.j.j(r8, r9, r10)
            return r8
    }
}

package com.umeng.socialize.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class k {
    public k() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Class<?> a(java.lang.String r3) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            java.lang.Class<com.umeng.socialize.a.k> r1 = com.umeng.socialize.a.k.class
            if (r0 != 0) goto L10
            java.lang.ClassLoader r0 = r1.getClassLoader()
        L10:
            r2 = 1
            java.lang.Class r3 = java.lang.Class.forName(r3, r2, r0)     // Catch: java.lang.Throwable -> L16
            return r3
        L16:
            java.lang.ClassLoader r0 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L1f
            java.lang.Class r3 = java.lang.Class.forName(r3, r2, r0)     // Catch: java.lang.Throwable -> L1f
            return r3
        L1f:
            r3 = 0
            return r3
    }

    public static java.lang.Object a(java.lang.String r0, java.lang.String r1, java.lang.Object r2) {
            java.lang.reflect.Field r0 = a(r0, r1)
            java.lang.Object r0 = a(r0, r2)
            return r0
    }

    public static java.lang.Object a(java.lang.String r0, java.lang.String r1, java.lang.Class<?>[] r2, java.lang.Object r3, java.lang.Object[] r4) {
            java.lang.reflect.Method r0 = a(r0, r1, r2)
            if (r0 == 0) goto Lb
            java.lang.Object r0 = a(r0, r3, r4)
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static java.lang.Object a(java.lang.String r2, java.lang.Class<?>[] r3, java.lang.Object[] r4) {
            java.lang.Class r0 = a(r2)
            if (r0 == 0) goto L2c
            java.lang.reflect.Constructor r3 = r0.getConstructor(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r2 = r3.newInstance(r4)     // Catch: java.lang.Throwable -> Lf
            return r2
        Lf:
            r3 = move-exception
            java.lang.String r3 = r3.getMessage()
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r0 = "newInstance failed, cls:"
            r1 = 0
            r4[r1] = r0
            r0 = 1
            r4[r0] = r2
            java.lang.String r2 = " msg:"
            r0 = 2
            r4[r0] = r2
            r2 = 3
            r4[r2] = r3
            java.lang.String r2 = ""
            com.umeng.socialize.a.m.d(r2, r4)
        L2c:
            r2 = 0
            return r2
    }

    public static java.lang.Object a(java.lang.reflect.Field r3, java.lang.Object r4) {
            if (r3 == 0) goto L27
            r0 = 1
            boolean r1 = r3.isAccessible()     // Catch: java.lang.Throwable -> Ld
            if (r1 != 0) goto Lf
            r3.setAccessible(r0)     // Catch: java.lang.Throwable -> Ld
            goto Lf
        Ld:
            r3 = move-exception
            goto L14
        Lf:
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Throwable -> Ld
            return r3
        L14:
            java.lang.String r3 = r3.getMessage()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r1 = "getFiledValue failed:"
            r2 = 0
            r4[r2] = r1
            r4[r0] = r3
            java.lang.String r3 = ""
            com.umeng.socialize.a.m.d(r3, r4)
        L27:
            r3 = 0
            return r3
    }

    public static java.lang.Object a(java.lang.reflect.Method r3, java.lang.Object r4, java.lang.Object[] r5) {
            r0 = 0
            if (r3 != 0) goto L4
            return r0
        L4:
            r1 = 1
            boolean r2 = r3.isAccessible()     // Catch: java.lang.Throwable -> Lf
            if (r2 != 0) goto L11
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> Lf
            goto L11
        Lf:
            r3 = move-exception
            goto L16
        L11:
            java.lang.Object r3 = r3.invoke(r4, r5)     // Catch: java.lang.Throwable -> Lf
            return r3
        L16:
            java.lang.String r3 = r3.getMessage()
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            java.lang.String r5 = "invoke failed:"
            r2 = 0
            r4[r2] = r5
            r4[r1] = r3
            java.lang.String r3 = ""
            com.umeng.socialize.a.m.d(r3, r4)
            return r0
    }

    public static java.lang.reflect.Field a(java.lang.String r5, java.lang.String r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            r1 = 0
            if (r0 != 0) goto L3f
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto Le
            goto L3f
        Le:
            java.lang.Class r0 = a(r5)
            if (r0 != 0) goto L15
            return r1
        L15:
            java.lang.reflect.Field r5 = r0.getField(r6)     // Catch: java.lang.Throwable -> L1a
            return r5
        L1a:
            r0 = move-exception
            java.lang.String r0 = r0.getMessage()
            r2 = 6
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.String r3 = "getFiled failed, cls:"
            r4 = 0
            r2[r4] = r3
            r3 = 1
            r2[r3] = r5
            java.lang.String r5 = " filed:"
            r3 = 2
            r2[r3] = r5
            r5 = 3
            r2[r5] = r6
            java.lang.String r5 = " msg:"
            r6 = 4
            r2[r6] = r5
            r5 = 5
            r2[r5] = r0
            java.lang.String r5 = ""
            com.umeng.socialize.a.m.d(r5, r2)
        L3f:
            return r1
    }

    public static java.lang.reflect.Method a(java.lang.String r4, java.lang.String r5, java.lang.Class<?>... r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            r1 = 0
            if (r0 != 0) goto L3f
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 == 0) goto Le
            goto L3f
        Le:
            java.lang.Class r0 = a(r4)
            if (r0 != 0) goto L15
            return r1
        L15:
            java.lang.reflect.Method r4 = r0.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L1a
            return r4
        L1a:
            r6 = move-exception
            java.lang.String r6 = r6.getMessage()
            r0 = 6
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.String r2 = "getMethod failed, cls:"
            r3 = 0
            r0[r3] = r2
            r2 = 1
            r0[r2] = r4
            java.lang.String r4 = " method:"
            r2 = 2
            r0[r2] = r4
            r4 = 3
            r0[r4] = r5
            java.lang.String r4 = " msg:"
            r5 = 4
            r0[r5] = r4
            r4 = 5
            r0[r4] = r6
            java.lang.String r4 = ""
            com.umeng.socialize.a.m.d(r4, r0)
        L3f:
            return r1
    }
}

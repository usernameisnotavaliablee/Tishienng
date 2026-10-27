package com.uyumao;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class t {
    public t() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Class<?> a(java.lang.String r3) {
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            java.lang.ClassLoader r0 = r0.getContextClassLoader()
            java.lang.Class<com.uyumao.t> r1 = com.uyumao.t.class
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

    public static java.lang.Object a(java.lang.String r2, java.lang.String r3, java.lang.Class<?>[] r4, java.lang.Object r5, java.lang.Object[] r6) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 != 0) goto L1e
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Le
            goto L1e
        Le:
            java.lang.Class r2 = a(r2)
            if (r2 != 0) goto L15
            goto L1e
        L15:
            java.lang.reflect.Method r2 = r2.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L1a
            goto L1f
        L1a:
            r2 = move-exception
            r2.getMessage()
        L1e:
            r2 = r1
        L1f:
            if (r2 == 0) goto L36
            boolean r3 = r2.isAccessible()     // Catch: java.lang.Throwable -> L2c
            if (r3 != 0) goto L2e
            r3 = 1
            r2.setAccessible(r3)     // Catch: java.lang.Throwable -> L2c
            goto L2e
        L2c:
            r2 = move-exception
            goto L33
        L2e:
            java.lang.Object r1 = r2.invoke(r5, r6)     // Catch: java.lang.Throwable -> L2c
            goto L36
        L33:
            r2.getMessage()
        L36:
            return r1
    }

    public static java.lang.Object a(java.lang.String r0, java.lang.Class<?>[] r1, java.lang.Object[] r2) {
            java.lang.Class r0 = a(r0)
            if (r0 == 0) goto L13
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)     // Catch: java.lang.Throwable -> Lf
            java.lang.Object r0 = r0.newInstance(r2)     // Catch: java.lang.Throwable -> Lf
            return r0
        Lf:
            r0 = move-exception
            r0.getMessage()
        L13:
            r0 = 0
            return r0
    }

    public static java.lang.Object a(java.lang.reflect.Field r1, java.lang.Object r2) {
            if (r1 == 0) goto L15
            boolean r0 = r1.isAccessible()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto Lc
            r0 = 1
            r1.setAccessible(r0)     // Catch: java.lang.Throwable -> L11
        Lc:
            java.lang.Object r1 = r1.get(r2)     // Catch: java.lang.Throwable -> L11
            return r1
        L11:
            r1 = move-exception
            r1.getMessage()
        L15:
            r1 = 0
            return r1
    }

    public static java.lang.reflect.Field a(java.lang.String r2, java.lang.String r3) {
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            r1 = 0
            if (r0 != 0) goto L1e
            boolean r0 = android.text.TextUtils.isEmpty(r3)
            if (r0 == 0) goto Le
            goto L1e
        Le:
            java.lang.Class r2 = a(r2)
            if (r2 != 0) goto L15
            return r1
        L15:
            java.lang.reflect.Field r2 = r2.getField(r3)     // Catch: java.lang.Throwable -> L1a
            return r2
        L1a:
            r2 = move-exception
            r2.getMessage()
        L1e:
            return r1
    }
}

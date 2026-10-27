package com.baidu.liantian.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class f extends dalvik.system.DexClassLoader {
    public f(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.ClassLoader r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    public final java.lang.Class<?> a(java.lang.String r2) {
            r1 = this;
            java.lang.Class r0 = r1.findLoadedClass(r2)
            if (r0 != 0) goto Le
            java.lang.Class r2 = r1.findClass(r2)     // Catch: java.lang.Throwable -> Lb
            return r2
        Lb:
            com.baidu.liantian.b.e.a()
        Le:
            return r0
    }

    @Override // java.lang.ClassLoader
    protected final java.lang.Class<?> loadClass(java.lang.String r8, boolean r9) {
            r7 = this;
            java.lang.Class r0 = r7.findLoadedClass(r8)
            if (r0 != 0) goto L3c
            java.lang.Class r0 = r7.findClass(r8)     // Catch: java.lang.Throwable -> Lb
            goto Lc
        Lb:
        Lc:
            if (r0 != 0) goto L3c
            java.lang.ClassLoader r1 = r7.getParent()     // Catch: java.lang.Throwable -> L39
            if (r1 == 0) goto L1d
            java.lang.ClassLoader r1 = r7.getParent()     // Catch: java.lang.Throwable -> L39
            java.lang.Class r0 = r1.loadClass(r8)     // Catch: java.lang.Throwable -> L39
            goto L3c
        L1d:
            java.lang.Class<com.baidu.liantian.core.f> r1 = com.baidu.liantian.core.f.class
            java.lang.String r2 = "findBootstrapClassOrNull"
            r3 = 1
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L39
            java.lang.Class<java.lang.String> r5 = java.lang.String.class
            r6 = 0
            r4[r6] = r5     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r2, r4)     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r2 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L39
            r2[r6] = r8     // Catch: java.lang.Throwable -> L39
            java.lang.Object r1 = r1.invoke(r7, r2)     // Catch: java.lang.Throwable -> L39
            java.lang.Class r1 = (java.lang.Class) r1     // Catch: java.lang.Throwable -> L39
            r0 = r1
            goto L3c
        L39:
            com.baidu.liantian.b.e.a()
        L3c:
            if (r9 == 0) goto L41
            r7.resolveClass(r0)
        L41:
            if (r0 != 0) goto L4b
            java.lang.Class r8 = super.loadClass(r8, r9)     // Catch: java.lang.Throwable -> L48
            return r8
        L48:
            com.baidu.liantian.b.e.a()
        L4b:
            return r0
    }
}

package com.kwad.library.b.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public final class b extends dalvik.system.BaseDexClassLoader {
    private final java.util.List<java.lang.String> apW;
    private final java.util.List<java.lang.String> apX;
    private final java.lang.ClassLoader apY;

    public b(java.lang.ClassLoader r1, java.lang.String r2, @androidx.annotation.Nullable java.io.File r3, java.lang.String r4, java.util.List<java.lang.String> r5, java.util.List<java.lang.String> r6) {
            r0 = this;
            r0.<init>(r2, r3, r4, r1)
            r0.apY = r1
            r0.apW = r5
            r0.apX = r6
        L9:
            java.lang.ClassLoader r2 = r1.getParent()
            if (r2 == 0) goto L14
            java.lang.ClassLoader r1 = r1.getParent()
            goto L9
        L14:
            return
    }

    @Override // dalvik.system.BaseDexClassLoader, java.lang.ClassLoader
    public final java.lang.String findLibrary(java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = super.findLibrary(r3)
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L19
            java.lang.ClassLoader r1 = r2.apY
            boolean r1 = r1 instanceof dalvik.system.BaseDexClassLoader
            if (r1 == 0) goto L19
            java.lang.ClassLoader r0 = r2.apY
            dalvik.system.BaseDexClassLoader r0 = (dalvik.system.BaseDexClassLoader) r0
            java.lang.String r3 = r0.findLibrary(r3)
            return r3
        L19:
            return r0
    }

    @Override // java.lang.ClassLoader
    protected final java.lang.Class<?> loadClass(java.lang.String r4, boolean r5) {
            r3 = this;
            java.util.List<java.lang.String> r0 = r3.apW
            if (r0 == 0) goto Lf
            boolean r0 = r0.contains(r4)
            if (r0 == 0) goto Lf
            java.lang.Class r4 = super.loadClass(r4, r5)
            return r4
        Lf:
            java.util.List<java.lang.String> r0 = r3.apX
            if (r0 == 0) goto L3f
            java.util.Iterator r0 = r0.iterator()
        L17:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r0.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            java.lang.String r1 = "."
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            boolean r1 = r4.startsWith(r1)
            if (r1 == 0) goto L17
            java.lang.Class r4 = super.loadClass(r4, r5)
            return r4
        L3f:
            java.lang.Class r5 = r3.findLoadedClass(r4)
            if (r5 == 0) goto L46
            return r5
        L46:
            java.lang.Class r4 = r3.findClass(r4)     // Catch: java.lang.ClassNotFoundException -> L4b
            return r4
        L4b:
            r5 = move-exception
            java.lang.ClassLoader r0 = r3.getParent()     // Catch: java.lang.ClassNotFoundException -> L55
            java.lang.Class r4 = r0.loadClass(r4)     // Catch: java.lang.ClassNotFoundException -> L55
            return r4
        L55:
            r4 = move-exception
            r4.addSuppressed(r5)
            throw r4
    }
}

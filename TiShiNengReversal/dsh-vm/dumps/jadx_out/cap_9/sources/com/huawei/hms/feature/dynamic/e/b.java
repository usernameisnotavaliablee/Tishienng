package com.huawei.hms.feature.dynamic.e;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class b extends dalvik.system.DexClassLoader {
    public static final java.lang.String a = "b";

    static {
            return
    }

    public b(java.lang.String r1, java.lang.String r2, java.lang.String r3, java.lang.ClassLoader r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    @Override // java.lang.ClassLoader
    public java.lang.Class<?> loadClass(java.lang.String r2, boolean r3) throws java.lang.ClassNotFoundException {
            r1 = this;
            java.lang.String r0 = "java."
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = "android."
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L15
            java.lang.Class r2 = r1.findClass(r2)     // Catch: java.lang.ClassNotFoundException -> L15
            return r2
        L15:
            java.lang.Class r2 = super.loadClass(r2, r3)
            return r2
    }
}

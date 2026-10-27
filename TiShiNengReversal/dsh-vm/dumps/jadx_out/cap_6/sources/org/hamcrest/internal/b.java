package org.hamcrest.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class b {
    private final java.lang.String a;
    private final int b;
    private final int c;

    public b(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    protected boolean a(java.lang.reflect.Method r3) {
            r2 = this;
            java.lang.String r0 = r3.getName()
            java.lang.String r1 = r2.a
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1d
            java.lang.Class[] r0 = r3.getParameterTypes()
            int r0 = r0.length
            int r1 = r2.b
            if (r0 != r1) goto L1d
            boolean r3 = r3.isSynthetic()
            if (r3 != 0) goto L1d
            r3 = 1
            return r3
        L1d:
            r3 = 0
            return r3
    }

    protected java.lang.Class<?> b(java.lang.reflect.Method r2) {
            r1 = this;
            java.lang.Class[] r2 = r2.getParameterTypes()
            int r0 = r1.c
            r2 = r2[r0]
            return r2
    }

    public java.lang.Class<?> c(java.lang.Class<?> r6) {
            r5 = this;
        L0:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r6 == r0) goto L21
            java.lang.reflect.Method[] r0 = r6.getDeclaredMethods()
            int r1 = r0.length
            r2 = 0
        La:
            if (r2 >= r1) goto L1c
            r3 = r0[r2]
            boolean r4 = r5.a(r3)
            if (r4 == 0) goto L19
            java.lang.Class r6 = r5.b(r3)
            return r6
        L19:
            int r2 = r2 + 1
            goto La
        L1c:
            java.lang.Class r6 = r6.getSuperclass()
            goto L0
        L21:
            java.lang.Error r6 = new java.lang.Error
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Cannot determine correct type for "
            r0.append(r1)
            java.lang.String r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = "() method."
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
    }
}

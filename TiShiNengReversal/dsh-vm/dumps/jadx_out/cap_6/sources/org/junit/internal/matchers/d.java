package org.junit.internal.matchers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class d<T> extends org.hamcrest.b<T> {
    private java.lang.Class<?> a;

    protected d() {
            r1 = this;
            r1.<init>()
            java.lang.Class r0 = r1.getClass()
            java.lang.Class r0 = d(r0)
            r1.a = r0
            return
    }

    protected d(java.lang.Class<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private static java.lang.Class<?> d(java.lang.Class<?> r6) {
        L0:
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            if (r6 == r0) goto L24
            java.lang.reflect.Method[] r0 = org.junit.internal.f.a(r6)
            int r1 = r0.length
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r1) goto L1f
            r4 = r0[r3]
            boolean r5 = e(r4)
            if (r5 == 0) goto L1c
            java.lang.Class[] r6 = r4.getParameterTypes()
            r6 = r6[r2]
            return r6
        L1c:
            int r3 = r3 + 1
            goto Lb
        L1f:
            java.lang.Class r6 = r6.getSuperclass()
            goto L0
        L24:
            java.lang.Error r6 = new java.lang.Error
            java.lang.String r0 = "Cannot determine correct type for matchesSafely() method."
            r6.<init>(r0)
            throw r6
    }

    private static boolean e(java.lang.reflect.Method r2) {
            java.lang.String r0 = r2.getName()
            java.lang.String r1 = "matchesSafely"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L1b
            java.lang.Class[] r0 = r2.getParameterTypes()
            int r0 = r0.length
            r1 = 1
            if (r0 != r1) goto L1b
            boolean r2 = r2.isSynthetic()
            if (r2 != 0) goto L1b
            return r1
        L1b:
            r2 = 0
            return r2
    }

    @Override // org.hamcrest.j
    public final boolean c(java.lang.Object r2) {
            r1 = this;
            if (r2 == 0) goto L12
            java.lang.Class<?> r0 = r1.a
            boolean r0 = r0.isInstance(r2)
            if (r0 == 0) goto L12
            boolean r2 = r1.f(r2)
            if (r2 == 0) goto L12
            r2 = 1
            return r2
        L12:
            r2 = 0
            return r2
    }

    public abstract boolean f(T r1);
}

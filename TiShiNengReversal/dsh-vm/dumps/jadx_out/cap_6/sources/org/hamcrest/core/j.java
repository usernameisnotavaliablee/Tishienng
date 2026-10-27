package org.hamcrest.core;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j extends org.hamcrest.h<java.lang.Object> {
    private final java.lang.Class<?> a;
    private final java.lang.Class<?> b;

    public j(java.lang.Class<?> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.lang.Class r1 = g(r1)
            r0.b = r1
            return
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> e(java.lang.Class<T> r1) {
            org.hamcrest.core.j r0 = new org.hamcrest.core.j
            r0.<init>(r1)
            return r0
    }

    @org.hamcrest.Factory
    public static <T> org.hamcrest.j<T> f(java.lang.Class<?> r1) {
            org.hamcrest.core.j r0 = new org.hamcrest.core.j
            r0.<init>(r1)
            return r0
    }

    private static java.lang.Class<?> g(java.lang.Class<?> r1) {
            java.lang.Class r0 = java.lang.Boolean.TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            java.lang.Class<java.lang.Boolean> r1 = java.lang.Boolean.class
            return r1
        Lb:
            java.lang.Class r0 = java.lang.Byte.TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L16
            java.lang.Class<java.lang.Byte> r1 = java.lang.Byte.class
            return r1
        L16:
            java.lang.Class r0 = java.lang.Character.TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L21
            java.lang.Class<java.lang.Character> r1 = java.lang.Character.class
            return r1
        L21:
            java.lang.Class r0 = java.lang.Double.TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L2c
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            return r1
        L2c:
            java.lang.Class r0 = java.lang.Float.TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            java.lang.Class<java.lang.Float> r1 = java.lang.Float.class
            return r1
        L37:
            java.lang.Class r0 = java.lang.Integer.TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L42
            java.lang.Class<java.lang.Integer> r1 = java.lang.Integer.class
            return r1
        L42:
            java.lang.Class r0 = java.lang.Long.TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L4d
            java.lang.Class<java.lang.Long> r1 = java.lang.Long.class
            return r1
        L4d:
            java.lang.Class r0 = java.lang.Short.TYPE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L57
            java.lang.Class<java.lang.Short> r1 = java.lang.Short.class
        L57:
            return r1
    }

    @Override // org.hamcrest.h
    protected boolean d(java.lang.Object r4, org.hamcrest.g r5) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L9
            java.lang.String r4 = "null"
            r5.b(r4)
            return r0
        L9:
            java.lang.Class<?> r1 = r3.b
            boolean r1 = r1.isInstance(r4)
            if (r1 != 0) goto L32
            org.hamcrest.g r5 = r5.c(r4)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = " is a "
            r1.append(r2)
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r5.b(r4)
            return r0
        L32:
            r4 = 1
            return r4
    }

    @Override // org.hamcrest.l
    public void describeTo(org.hamcrest.g r2) {
            r1 = this;
            java.lang.String r0 = "an instance of "
            org.hamcrest.g r2 = r2.b(r0)
            java.lang.Class<?> r0 = r1.a
            java.lang.String r0 = r0.getName()
            r2.b(r0)
            return
    }
}

package retrofit2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
abstract class e0<T> {
    e0() {
            r0 = this;
            r0.<init>()
            return
    }

    static <T> retrofit2.e0<T> b(retrofit2.d0 r4, java.lang.reflect.Method r5) {
            retrofit2.b0 r0 = retrofit2.b0.b(r4, r5)
            java.lang.reflect.Type r1 = r5.getGenericReturnType()
            boolean r2 = retrofit2.f0.j(r1)
            r3 = 0
            if (r2 != 0) goto L21
            java.lang.Class r2 = java.lang.Void.TYPE
            if (r1 == r2) goto L18
            retrofit2.k r4 = retrofit2.k.f(r4, r5, r0)
            return r4
        L18:
            java.lang.String r4 = "Service methods cannot return void."
            java.lang.Object[] r0 = new java.lang.Object[r3]
            java.lang.RuntimeException r4 = retrofit2.f0.m(r5, r4, r0)
            throw r4
        L21:
            r4 = 1
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r1
            java.lang.String r0 = "Method return type must not include a type variable or wildcard: %s"
            java.lang.RuntimeException r4 = retrofit2.f0.m(r5, r0, r4)
            throw r4
    }

    @javax.annotation.Nullable
    abstract T a(java.lang.Object[] r1);
}

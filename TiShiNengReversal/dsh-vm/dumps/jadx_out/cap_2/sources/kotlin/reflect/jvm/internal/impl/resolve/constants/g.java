package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class g<T> {
    private final T a;

    public g(T r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public T a() {
            r1 = this;
            T r0 = r1.a
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r3 = this;
            if (r3 == r4) goto L1e
            java.lang.Object r0 = r3.a()
            boolean r1 = r4 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.g
            r2 = 0
            if (r1 == 0) goto Le
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r4 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r4
            goto Lf
        Le:
            r4 = r2
        Lf:
            if (r4 == 0) goto L15
            java.lang.Object r2 = r4.a()
        L15:
            boolean r4 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r4 == 0) goto L1c
            goto L1e
        L1c:
            r4 = 0
            return r4
        L1e:
            r4 = 1
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.types.t0 getType(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r1);

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.a()
            if (r0 == 0) goto Lb
            int r0 = r0.hashCode()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.a()
            java.lang.String r0 = java.lang.String.valueOf(r0)
            return r0
    }
}

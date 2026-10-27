package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a<T> {
    private final T a;
    private final T b;

    public a(T r1, T r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final T a() {
            r1 = this;
            T r0 = r1.a
            return r0
    }

    public final T b() {
            r1 = this;
            T r0 = r1.b
            return r0
    }

    public final T c() {
            r1 = this;
            T r0 = r1.a
            return r0
    }

    public final T d() {
            r1 = this;
            T r0 = r1.b
            return r0
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.types.typesApproximation.a
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.types.typesApproximation.a r5 = (kotlin.reflect.jvm.internal.impl.types.typesApproximation.a) r5
            T r1 = r4.a
            T r3 = r5.a
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            T r1 = r4.b
            T r5 = r5.b
            boolean r5 = kotlin.jvm.internal.g0.g(r1, r5)
            if (r5 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public int hashCode() {
            r3 = this;
            T r0 = r3.a
            r1 = 0
            if (r0 != 0) goto L7
            r0 = 0
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            int r0 = r0 * 31
            T r2 = r3.b
            if (r2 != 0) goto L12
            goto L16
        L12:
            int r1 = r2.hashCode()
        L16:
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ApproximationBounds(lower="
            r0.append(r1)
            T r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", upper="
            r0.append(r1)
            T r1 = r2.b
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

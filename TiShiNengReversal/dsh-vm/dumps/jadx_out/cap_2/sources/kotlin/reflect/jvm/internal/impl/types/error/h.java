package kotlin.reflect.jvm.internal.impl.types.error;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h implements kotlin.reflect.jvm.internal.impl.types.w1 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind a;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String[] b;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String c;

    public h(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r5, @org.jetbrains.annotations.NotNull java.lang.String... r6) {
            r4 = this;
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "formatParams"
            kotlin.jvm.internal.g0.p(r6, r0)
            r4.<init>()
            r4.a = r5
            r4.b = r6
            kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity r0 = kotlin.reflect.jvm.internal.impl.types.error.ErrorEntity.ERROR_TYPE
            java.lang.String r0 = r0.getDebugText()
            java.lang.String r5 = r5.getDebugMessage()
            int r1 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)
            int r1 = r6.length
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r1)
            java.lang.String r5 = java.lang.String.format(r5, r6)
            java.lang.String r6 = "format(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            r1 = 1
            java.lang.Object[] r2 = new java.lang.Object[r1]
            r3 = 0
            r2[r3] = r5
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r2, r1)
            java.lang.String r5 = java.lang.String.format(r0, r5)
            kotlin.jvm.internal.g0.o(r5, r6)
            r4.c = r5
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.w1 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
            r1 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.f c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.error.i r0 = kotlin.reflect.jvm.internal.impl.types.error.i.a
            kotlin.reflect.jvm.internal.impl.types.error.a r0 = r0.h()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public boolean d() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String f(int r2) {
            r1 = this;
            java.lang.String[] r0 = r1.b
            r2 = r0[r2]
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.j1> getParameters() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.types.t0> i() {
            r1 = this;
            java.util.List r0 = kotlin.collections.f0.J()
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.builtins.j p() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.builtins.g$a r0 = kotlin.reflect.jvm.internal.impl.builtins.g.i
            kotlin.reflect.jvm.internal.impl.builtins.g r0 = r0.a()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.c
            return r0
    }
}

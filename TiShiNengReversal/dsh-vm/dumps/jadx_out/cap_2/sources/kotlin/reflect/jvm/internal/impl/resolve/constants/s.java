package kotlin.reflect.jvm.internal.impl.resolve.constants;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class s implements kotlin.reflect.jvm.internal.impl.types.w1 {
    private final long a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.f0 b;

    @org.jetbrains.annotations.NotNull
    private final java.util.ArrayList<kotlin.reflect.jvm.internal.impl.types.t0> c;

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.w1 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
            r1 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f c() {
            r1 = this;
            java.lang.Void r0 = r1.e()
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    public boolean d() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Void e() {
            r1 = this;
            r0 = 0
            return r0
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
            java.util.ArrayList<kotlin.reflect.jvm.internal.impl.types.t0> r0 = r1.c
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.w1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.builtins.j p() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r1.b
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = r0.p()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "IntegerValueType("
            r0.append(r1)
            long r1 = r3.a
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

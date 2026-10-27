package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j1 extends kotlin.reflect.jvm.internal.impl.types.d2 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.t0 a;

    public j1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r2) {
            r1 = this;
            java.lang.String r0 = "kotlinBuiltIns"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.J()
            java.lang.String r0 = "getNullableAnyType(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r1.a = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.c2 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r2) {
            r1 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r2, r0)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c2
    public boolean b() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.Variance c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = kotlin.reflect.jvm.internal.impl.types.Variance.OUT_VARIANCE
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.c2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.a
            return r0
    }
}

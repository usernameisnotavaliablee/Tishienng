package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class e {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.j1 a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.t0 b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.t0 c;

    public e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r4) {
            r1 = this;
            java.lang.String r0 = "typeParameter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "inProjection"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "outProjection"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t0 a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t0 b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.j1 c() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r1.a
            return r0
    }

    public final boolean d() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.e r0 = kotlin.reflect.jvm.internal.impl.types.checker.e.a
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r3.b
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r3.c
            boolean r0 = r0.d(r1, r2)
            return r0
    }
}

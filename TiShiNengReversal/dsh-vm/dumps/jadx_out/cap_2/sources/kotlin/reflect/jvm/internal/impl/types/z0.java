package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class z0 extends kotlin.reflect.jvm.internal.impl.types.n2 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.n b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.t0> c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.t0> d;

    public z0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends kotlin.reflect.jvm.internal.impl.types.t0> r3) {
            r1 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "computation"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.b = r2
            r1.c = r3
            kotlin.reflect.jvm.internal.impl.storage.i r2 = r2.e(r3)
            r1.d = r2
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 O0(kotlin.reflect.jvm.internal.impl.types.checker.g r0, kotlin.reflect.jvm.internal.impl.types.z0 r1) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = Q0(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 Q0(kotlin.reflect.jvm.internal.impl.types.checker.g r0, kotlin.reflect.jvm.internal.impl.types.z0 r1) {
            kotlin.jvm.functions.Function0<kotlin.reflect.jvm.internal.impl.types.t0> r1 = r1.c
            java.lang.Object r1 = r1.invoke()
            d4.g r1 = (d4.g) r1
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.h(r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 K0(kotlin.reflect.jvm.internal.impl.types.checker.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.z0 r1 = r0.P0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.n2
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.types.t0 M0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.t0> r0 = r1.d
            java.lang.Object r0 = r0.invoke()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.n2
    public boolean N0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.i<kotlin.reflect.jvm.internal.impl.types.t0> r0 = r1.d
            boolean r0 = r0.e()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.z0 P0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r4) {
            r3 = this;
            java.lang.String r0 = "kotlinTypeRefiner"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.types.z0 r0 = new kotlin.reflect.jvm.internal.impl.types.z0
            kotlin.reflect.jvm.internal.impl.storage.n r1 = r3.b
            kotlin.reflect.jvm.internal.impl.types.y0 r2 = new kotlin.reflect.jvm.internal.impl.types.y0
            r2.<init>(r4, r3)
            r0.<init>(r1, r2)
            return r0
    }
}

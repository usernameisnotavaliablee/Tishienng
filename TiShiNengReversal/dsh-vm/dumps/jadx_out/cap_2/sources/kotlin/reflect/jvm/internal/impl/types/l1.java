package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l1 extends kotlin.reflect.jvm.internal.impl.types.d2 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.j1 a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s b;

    public l1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.j1 r2) {
            r1 = this;
            java.lang.String r0 = "typeParameter"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            kotlin.LazyThreadSafetyMode r2 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.impl.types.k1 r0 = new kotlin.reflect.jvm.internal.impl.types.k1
            r0.<init>(r1)
            kotlin.s r2 = kotlin.t.b(r2, r0)
            r1.b = r2
            return
    }

    private static final kotlin.reflect.jvm.internal.impl.types.t0 d(kotlin.reflect.jvm.internal.impl.types.l1 r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.j1 r0 = r0.a
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = kotlin.reflect.jvm.internal.impl.types.m1.b(r0)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 e(kotlin.reflect.jvm.internal.impl.types.l1 r0) {
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = d(r0)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.types.t0 f() {
            r1 = this;
            kotlin.s r0 = r1.b
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = (kotlin.reflect.jvm.internal.impl.types.t0) r0
            return r0
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
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.f()
            return r0
    }
}

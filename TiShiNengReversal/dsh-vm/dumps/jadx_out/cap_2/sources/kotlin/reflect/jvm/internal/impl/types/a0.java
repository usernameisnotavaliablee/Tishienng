package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class a0 extends kotlin.reflect.jvm.internal.impl.types.f2 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.f2 c;

    public a0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.f2 r2) {
            r1 = this;
            java.lang.String r0 = "substitution"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.c = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    public boolean a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.c
            boolean r0 = r0.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    public boolean b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.c
            boolean r0 = r0.b()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2) {
            r1 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.c
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r0.d(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.c2 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.c
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = r0.e(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    public boolean f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.c
            boolean r0 = r0.f()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.Variance r3) {
            r1 = this;
            java.lang.String r0 = "topLevelType"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "position"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.types.f2 r0 = r1.c
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r0.g(r2, r3)
            return r2
    }
}

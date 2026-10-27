package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class k0 extends kotlin.reflect.jvm.internal.impl.types.m2 implements d4.e {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.e1 b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.types.e1 c;

    public k0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.e1 r3) {
            r1 = this;
            java.lang.String r0 = "lowerBound"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "upperBound"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 0
            r1.<init>(r0)
            r1.b = r2
            r1.c = r3
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> G0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.P0()
            java.util.List r0 = r0.G0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t1 H0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.P0()
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r0.H0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.w1 I0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.P0()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public boolean J0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.P0()
            boolean r0 = r0.J0()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.types.e1 P0();

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.e1 Q0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.e1 R0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.String S0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.m r1, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.renderer.u r2);

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.P0()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.r()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.renderer.m r0 = kotlin.reflect.jvm.internal.impl.renderer.m.k
            java.lang.String r0 = r0.T(r1)
            return r0
    }
}

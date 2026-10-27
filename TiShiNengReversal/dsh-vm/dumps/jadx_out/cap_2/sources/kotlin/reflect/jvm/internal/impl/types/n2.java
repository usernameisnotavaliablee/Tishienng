package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class n2 extends kotlin.reflect.jvm.internal.impl.types.t0 {
    public n2() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> G0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.M0()
            java.util.List r0 = r0.G0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t1 H0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.M0()
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r0.H0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.w1 I0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.M0()
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r0.I0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    public boolean J0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.M0()
            boolean r0 = r0.J0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.m2 L0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.M0()
        L4:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.n2
            if (r1 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.types.n2 r0 = (kotlin.reflect.jvm.internal.impl.types.n2) r0
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.M0()
            goto L4
        Lf:
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.types.UnwrappedType"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = (kotlin.reflect.jvm.internal.impl.types.m2) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected abstract kotlin.reflect.jvm.internal.impl.types.t0 M0();

    public boolean N0() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.t0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.resolve.scopes.k r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.M0()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.r()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            boolean r0 = r1.N0()
            if (r0 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.M0()
            java.lang.String r0 = r0.toString()
            return r0
        Lf:
            java.lang.String r0 = "<Not computed yet>"
            return r0
    }
}

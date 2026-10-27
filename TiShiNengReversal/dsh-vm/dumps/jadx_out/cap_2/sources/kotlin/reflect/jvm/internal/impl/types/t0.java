package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class t0 implements kotlin.reflect.jvm.internal.impl.descriptors.annotations.a, d4.g {
    private int a;

    private t0() {
            r0 = this;
            r0.<init>()
            return
    }

    public /* synthetic */ t0(kotlin.jvm.internal.v r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private final int F0() {
            r2 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.types.x0.a(r2)
            if (r0 == 0) goto Lb
            int r0 = super.hashCode()
            return r0
        Lb:
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r2.I0()
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List r1 = r2.G0()
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            int r0 = r0 * 31
            boolean r1 = r2.J0()
            int r0 = r0 + r1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.util.List<kotlin.reflect.jvm.internal.impl.types.c2> G0();

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.types.t1 H0();

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.types.w1 I0();

    public abstract boolean J0();

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.types.t0 K0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.checker.g r1);

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.types.m2 L0();

    public final boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.types.t0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            boolean r1 = r4.J0()
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = (kotlin.reflect.jvm.internal.impl.types.t0) r5
            boolean r3 = r5.J0()
            if (r1 != r3) goto L27
            kotlin.reflect.jvm.internal.impl.types.checker.v r1 = kotlin.reflect.jvm.internal.impl.types.checker.v.a
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = r4.L0()
            kotlin.reflect.jvm.internal.impl.types.m2 r5 = r5.L0()
            boolean r5 = r1.a(r3, r5)
            if (r5 == 0) goto L27
            return r0
        L27:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.g getAnnotations() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = r1.H0()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = kotlin.reflect.jvm.internal.impl.types.u.a(r0)
            return r0
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.a
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.F0()
            r1.a = r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.resolve.scopes.k r();
}

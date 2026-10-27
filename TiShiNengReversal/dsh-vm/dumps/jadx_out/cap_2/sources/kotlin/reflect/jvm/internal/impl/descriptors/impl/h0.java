package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class h0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.n implements kotlin.reflect.jvm.internal.impl.descriptors.l0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.c e;

    @org.jetbrains.annotations.NotNull
    private final java.lang.String f;

    public h0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r5) {
            r3 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.name.f r1 = r5.g()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r2 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            r3.<init>(r4, r0, r1, r2)
            r3.e = r5
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "package "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = " of "
            r0.append(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r3.f = r4
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R W(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r2, D r3) {
            r1 = this;
            java.lang.String r0 = "visitor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r2 = r2.k(r1, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.f0 b() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = super.b()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.f0) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r1.b()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l0
    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.name.c d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.e
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.n
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            java.lang.String r1 = "NO_SOURCE"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.f
            return r0
    }
}

package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c0 implements kotlin.reflect.jvm.internal.impl.descriptors.impl.b0 {

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> a;

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> b;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> c;

    @org.jetbrains.annotations.NotNull
    private final java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> d;

    public c0(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> r2, @org.jetbrains.annotations.NotNull java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> r3, @org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> r4, @org.jetbrains.annotations.NotNull java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> r5) {
            r1 = this;
            java.lang.String r0 = "allDependencies"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "modulesWhoseInternalsAreVisible"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "directExpectedByDependencies"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "allExpectedByDependencies"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b0
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> a() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> r0 = r1.c
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b0
    @org.jetbrains.annotations.NotNull
    public java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> b() {
            r1 = this;
            java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> r0 = r1.b
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.b0
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> c() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> r0 = r1.a
            return r0
    }
}

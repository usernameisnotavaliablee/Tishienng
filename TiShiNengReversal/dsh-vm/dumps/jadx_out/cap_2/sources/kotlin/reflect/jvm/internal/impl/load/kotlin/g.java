package kotlin.reflect.jvm.internal.impl.load.kotlin;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class g<A, C> extends kotlin.reflect.jvm.internal.impl.load.kotlin.e.a<A> {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, java.util.List<A>> a;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, C> b;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, C> c;

    public g(@org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, ? extends java.util.List<? extends A>> r2, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, ? extends C> r3, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, ? extends C> r4) {
            r1 = this;
            java.lang.String r0 = "memberAnnotations"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "propertyConstants"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "annotationParametersDefaultValues"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.kotlin.e.a
    @org.jetbrains.annotations.NotNull
    public java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, java.util.List<A>> a() {
            r1 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, java.util.List<A>> r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, C> b() {
            r1 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, C> r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, C> c() {
            r1 = this;
            java.util.Map<kotlin.reflect.jvm.internal.impl.load.kotlin.a0, C> r0 = r1.b
            return r0
    }
}

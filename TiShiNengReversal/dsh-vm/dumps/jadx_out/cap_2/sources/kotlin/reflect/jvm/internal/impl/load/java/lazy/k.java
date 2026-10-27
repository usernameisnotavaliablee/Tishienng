package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.d a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.p b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s<kotlin.reflect.jvm.internal.impl.load.java.e0> c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d d;

    public k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.d r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.p r3, @org.jetbrains.annotations.NotNull kotlin.s<kotlin.reflect.jvm.internal.impl.load.java.e0> r4) {
            r1 = this;
            java.lang.String r0 = "components"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "typeParameterResolver"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "delegateForDefaultTypeQualifiers"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d
            r2.<init>(r1, r3)
            r1.d = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.d a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.load.java.e0 b() {
            r1 = this;
            kotlin.s<kotlin.reflect.jvm.internal.impl.load.java.e0> r0 = r1.c
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.impl.load.java.e0 r0 = (kotlin.reflect.jvm.internal.impl.load.java.e0) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.s<kotlin.reflect.jvm.internal.impl.load.java.e0> c() {
            r1 = this;
            kotlin.s<kotlin.reflect.jvm.internal.impl.load.java.e0> r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.f0 d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r1.a
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r0.m()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.storage.n e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r1.a
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r0.u()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.p f() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.p r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d g() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.types.d r0 = r1.d
            return r0
    }
}

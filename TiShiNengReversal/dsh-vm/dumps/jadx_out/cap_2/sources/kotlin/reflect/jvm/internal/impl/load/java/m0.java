package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class m0<T> implements kotlin.reflect.jvm.internal.impl.load.java.k0<T> {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, T> b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.f c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.c, T> d;

    public m0(@org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, ? extends T> r2) {
            r1 = this;
            java.lang.String r0 = "states"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.b = r2
            kotlin.reflect.jvm.internal.impl.storage.f r2 = new kotlin.reflect.jvm.internal.impl.storage.f
            java.lang.String r0 = "Java nullability annotation states"
            r2.<init>(r0)
            r1.c = r2
            kotlin.reflect.jvm.internal.impl.load.java.l0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.l0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.h r2 = r2.c(r0)
            java.lang.String r0 = "createMemoizedFunctionWithNullableValues(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            r1.d = r2
            return
    }

    static /* synthetic */ java.lang.Object b(kotlin.reflect.jvm.internal.impl.load.java.m0 r0, kotlin.reflect.jvm.internal.impl.name.c r1) {
            java.lang.Object r0 = c(r0, r1)
            return r0
    }

    private static final java.lang.Object c(kotlin.reflect.jvm.internal.impl.load.java.m0 r0, kotlin.reflect.jvm.internal.impl.name.c r1) {
            kotlin.jvm.internal.g0.m(r1)
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, T> r0 = r0.b
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.name.e.a(r1, r0)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.k0
    @org.jetbrains.annotations.Nullable
    public T a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.c, T> r0 = r1.d
            java.lang.Object r2 = r0.invoke(r2)
            return r2
    }
}

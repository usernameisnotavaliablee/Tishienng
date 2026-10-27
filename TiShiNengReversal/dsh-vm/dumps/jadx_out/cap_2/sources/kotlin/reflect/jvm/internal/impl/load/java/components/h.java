package kotlin.reflect.jvm.internal.impl.load.java.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class h extends kotlin.reflect.jvm.internal.impl.load.java.components.c {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] h = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i g;

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.components.h> r1 = kotlin.reflect.jvm.internal.impl.load.java.components.h.class
            java.lang.String r2 = "allValueArguments"
            java.lang.String r3 = "getAllValueArguments()Ljava/util/Map;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            r1 = 1
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
            r1[r4] = r0
            kotlin.reflect.jvm.internal.impl.load.java.components.h.h = r1
            return
    }

    public h(@org.jetbrains.annotations.Nullable x3.a r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3) {
            r1 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.y
            r1.<init>(r3, r2, r0)
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.components.g r3 = kotlin.reflect.jvm.internal.impl.load.java.components.g.a
            kotlin.reflect.jvm.internal.impl.storage.i r2 = r2.e(r3)
            r1.g = r2
            return
    }

    static /* synthetic */ java.util.Map g() {
            java.util.Map r0 = h()
            return r0
    }

    private static final java.util.Map h() {
            kotlin.reflect.jvm.internal.impl.load.java.components.d r0 = kotlin.reflect.jvm.internal.impl.load.java.components.d.a
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.b()
            kotlin.reflect.jvm.internal.impl.resolve.constants.y r1 = new kotlin.reflect.jvm.internal.impl.resolve.constants.y
            java.lang.String r2 = "Deprecated in Java"
            r1.<init>(r2)
            kotlin.Pair r0 = kotlin.o0.a(r0, r1)
            java.util.Map r0 = kotlin.collections.i1.k(r0)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.c, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.g
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.load.java.components.h.h
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }
}

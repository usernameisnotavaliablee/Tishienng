package kotlin.reflect.jvm.internal.impl.resolve.jvm;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.j a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.components.j b;

    public c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.j r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.components.j r3) {
            r1 = this;
            java.lang.String r0 = "packageFragmentProvider"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "javaResolverCache"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.load.java.lazy.j a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.j r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.descriptors.d b(@org.jetbrains.annotations.NotNull x3.g r4) {
            r3 = this;
            java.lang.String r0 = "javaClass"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.name.c r0 = r4.d()
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind r1 = r4.w()
            kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind r2 = kotlin.reflect.jvm.internal.impl.load.java.structure.LightClassOriginKind.SOURCE
            if (r1 != r2) goto L1a
            kotlin.reflect.jvm.internal.impl.load.java.components.j r4 = r3.b
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = r4.c(r0)
            return r4
        L1a:
            x3.g r1 = r4.h()
            r2 = 0
            if (r1 == 0) goto L43
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r3.b(r1)
            if (r0 == 0) goto L2c
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r0.G()
            goto L2d
        L2c:
            r0 = r2
        L2d:
            if (r0 == 0) goto L3a
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r1 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_JAVA_LOADER
            kotlin.reflect.jvm.internal.impl.descriptors.f r4 = r0.g(r4, r1)
            goto L3b
        L3a:
            r4 = r2
        L3b:
            boolean r0 = r4 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r0 == 0) goto L42
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r4
            return r4
        L42:
            return r2
        L43:
            if (r0 != 0) goto L46
            return r2
        L46:
            kotlin.reflect.jvm.internal.impl.load.java.lazy.j r1 = r3.a
            kotlin.reflect.jvm.internal.impl.name.c r0 = r0.d()
            java.util.List r0 = r1.a(r0)
            java.lang.Object r0 = kotlin.collections.f0.L2(r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0) r0
            if (r0 == 0) goto L5d
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = r0.I0(r4)
            return r4
        L5d:
            return r2
    }
}

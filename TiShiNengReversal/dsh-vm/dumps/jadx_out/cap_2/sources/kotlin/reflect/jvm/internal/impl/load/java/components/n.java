package kotlin.reflect.jvm.internal.impl.load.java.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaTargetAnnotationDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n extends kotlin.reflect.jvm.internal.impl.load.java.components.c {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] h = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i g;

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.components.n> r1 = kotlin.reflect.jvm.internal.impl.load.java.components.n.class
            java.lang.String r2 = "allValueArguments"
            java.lang.String r3 = "getAllValueArguments()Ljava/util/Map;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            r1 = 1
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
            r1[r4] = r0
            kotlin.reflect.jvm.internal.impl.load.java.components.n.h = r1
            return
    }

    public n(@org.jetbrains.annotations.NotNull x3.a r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3) {
            r1 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.H
            r1.<init>(r3, r2, r0)
            kotlin.reflect.jvm.internal.impl.storage.n r2 = r3.e()
            kotlin.reflect.jvm.internal.impl.load.java.components.m r3 = new kotlin.reflect.jvm.internal.impl.load.java.components.m
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.i r2 = r2.e(r3)
            r1.g = r2
            return
    }

    static /* synthetic */ java.util.Map g(kotlin.reflect.jvm.internal.impl.load.java.components.n r0) {
            java.util.Map r0 = h(r0)
            return r0
    }

    private static final java.util.Map h(kotlin.reflect.jvm.internal.impl.load.java.components.n r3) {
            x3.b r0 = r3.c()
            boolean r1 = r0 instanceof x3.e
            r2 = 0
            if (r1 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.load.java.components.f r0 = kotlin.reflect.jvm.internal.impl.load.java.components.f.a
            x3.b r3 = r3.c()
            x3.e r3 = (x3.e) r3
            java.util.List r3 = r3.getElements()
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r3 = r0.d(r3)
            goto L2e
        L1a:
            boolean r0 = r0 instanceof x3.m
            if (r0 == 0) goto L2d
            kotlin.reflect.jvm.internal.impl.load.java.components.f r0 = kotlin.reflect.jvm.internal.impl.load.java.components.f.a
            x3.b r3 = r3.c()
            java.util.List r3 = kotlin.collections.f0.l(r3)
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r3 = r0.d(r3)
            goto L2e
        L2d:
            r3 = r2
        L2e:
            if (r3 == 0) goto L3e
            kotlin.reflect.jvm.internal.impl.load.java.components.d r0 = kotlin.reflect.jvm.internal.impl.load.java.components.d.a
            kotlin.reflect.jvm.internal.impl.name.f r0 = r0.d()
            kotlin.Pair r3 = kotlin.o0.a(r0, r3)
            java.util.Map r2 = kotlin.collections.i1.k(r3)
        L3e:
            if (r2 != 0) goto L45
            java.util.Map r3 = kotlin.collections.i1.z()
            return r3
        L45:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.components.c, kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<java.lang.Object>> a() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.g
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.load.java.components.n.h
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.util.Map r0 = (java.util.Map) r0
            return r0
    }
}

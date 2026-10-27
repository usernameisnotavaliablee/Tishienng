package kotlin.reflect.jvm.internal.impl.load.java.components;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,182:1\n1#2:183\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class c implements kotlin.reflect.jvm.internal.impl.load.java.descriptors.g {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] f = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.name.c a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.e1 b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i c;

    @org.jetbrains.annotations.Nullable
    private final x3.b d;
    private final boolean e;

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.components.c> r1 = kotlin.reflect.jvm.internal.impl.load.java.components.c.class
            java.lang.String r2 = "type"
            java.lang.String r3 = "getType()Lorg/jetbrains/kotlin/types/SimpleType;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            r1 = 1
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
            r1[r4] = r0
            kotlin.reflect.jvm.internal.impl.load.java.components.c.f = r1
            return
    }

    public c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r2, @org.jetbrains.annotations.Nullable x3.a r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r4) {
            r1 = this;
            java.lang.String r0 = "c"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r4
            if (r3 == 0) goto L20
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r4 = r2.a()
            w3.b r4 = r4.t()
            w3.a r4 = r4.a(r3)
            if (r4 == 0) goto L20
            goto L27
        L20:
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r4 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            java.lang.String r0 = "NO_SOURCE"
            kotlin.jvm.internal.g0.o(r4, r0)
        L27:
            r1.b = r4
            kotlin.reflect.jvm.internal.impl.storage.n r4 = r2.e()
            kotlin.reflect.jvm.internal.impl.load.java.components.b r0 = new kotlin.reflect.jvm.internal.impl.load.java.components.b
            r0.<init>(r2, r1)
            kotlin.reflect.jvm.internal.impl.storage.i r2 = r4.e(r0)
            r1.c = r2
            if (r3 == 0) goto L49
            java.util.Collection r2 = r3.getArguments()
            if (r2 == 0) goto L49
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.lang.Object r2 = kotlin.collections.f0.J2(r2)
            x3.b r2 = (x3.b) r2
            goto L4a
        L49:
            r2 = 0
        L4a:
            r1.d = r2
            r2 = 0
            if (r3 == 0) goto L57
            boolean r3 = r3.e()
            r4 = 1
            if (r3 != r4) goto L57
            r2 = 1
        L57:
            r1.e = r2
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.e1 b(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0, kotlin.reflect.jvm.internal.impl.load.java.components.c r1) {
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = f(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.types.e1 f(kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0, kotlin.reflect.jvm.internal.impl.load.java.components.c r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r0.d()
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = r0.p()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r1.d()
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.p(r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.s()
            java.lang.String r1 = "getDefaultType(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public java.util.Map<kotlin.reflect.jvm.internal.impl.name.f, kotlin.reflect.jvm.internal.impl.resolve.constants.g<?>> a() {
            r1 = this;
            java.util.Map r0 = kotlin.collections.i1.z()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    protected final x3.b c() {
            r1 = this;
            x3.b r0 = r1.d
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.name.c d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r1.a
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.descriptors.g
    public boolean e() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.e1 getSource() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r0 = r1.b
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.e1 getType() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.c
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.load.java.components.c.f
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = (kotlin.reflect.jvm.internal.impl.types.e1) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.c
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t0 getType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r1.getType()
            return r0
    }
}

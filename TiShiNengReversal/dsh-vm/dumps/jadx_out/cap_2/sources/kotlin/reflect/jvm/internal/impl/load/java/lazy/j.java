package kotlin.reflect.jvm.internal.impl.load.java.lazy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class j implements kotlin.reflect.jvm.internal.impl.descriptors.r0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.k a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.a<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0> b;

    public j(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.d r4) {
            r3 = this;
            java.lang.String r0 = "components"
            kotlin.jvm.internal.g0.p(r4, r0)
            r3.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.k
            kotlin.reflect.jvm.internal.impl.load.java.lazy.p$a r1 = kotlin.reflect.jvm.internal.impl.load.java.lazy.p.a.a
            r2 = 0
            kotlin.s r2 = kotlin.t.e(r2)
            r0.<init>(r4, r1, r2)
            r3.a = r0
            kotlin.reflect.jvm.internal.impl.storage.n r4 = r0.e()
            kotlin.reflect.jvm.internal.impl.storage.a r4 = r4.d()
            r3.b = r4
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 d(kotlin.reflect.jvm.internal.impl.load.java.lazy.j r0, x3.u r1) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r0 = f(r0, r1)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 e(kotlin.reflect.jvm.internal.impl.name.c r5) {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r4.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.java.t r0 = r0.d()
            r1 = 0
            r2 = 2
            r3 = 0
            x3.u r0 = kotlin.reflect.jvm.internal.impl.load.java.s.a(r0, r5, r1, r2, r3)
            if (r0 != 0) goto L14
            return r3
        L14:
            kotlin.reflect.jvm.internal.impl.storage.a<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0> r1 = r4.b
            kotlin.reflect.jvm.internal.impl.load.java.lazy.i r2 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.i
            r2.<init>(r4, r0)
            java.lang.Object r5 = r1.a(r5, r2)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r5 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0) r5
            return r5
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 f(kotlin.reflect.jvm.internal.impl.load.java.lazy.j r1, x3.u r2) {
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r0 = new kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r1.a
            r0.<init>(r1, r2)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @kotlin.Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r2 = r1.e(r2)
            java.util.List r2 = kotlin.collections.f0.R(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r0
    public void b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.l0> r3) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "packageFragments"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r2 = r1.e(r2)
            kotlin.reflect.jvm.internal.impl.utils.a.a(r3, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r0
    public boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r5) {
            r4 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r4.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.java.t r0 = r0.d()
            r1 = 2
            r2 = 0
            r3 = 0
            x3.u r5 = kotlin.reflect.jvm.internal.impl.load.java.s.a(r0, r5, r3, r1, r2)
            if (r5 != 0) goto L1a
            r5 = 1
            return r5
        L1a:
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.name.c> g(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.d0 r2 = r1.e(r2)
            if (r2 == 0) goto L15
            java.util.List r2 = r2.L0()
            goto L16
        L15:
            r2 = 0
        L16:
            if (r2 != 0) goto L1c
            java.util.List r2 = kotlin.collections.f0.J()
        L1c:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    public /* bridge */ /* synthetic */ java.util.Collection q(kotlin.reflect.jvm.internal.impl.name.c r1, kotlin.jvm.functions.Function1 r2) {
            r0 = this;
            java.util.List r1 = r0.g(r1, r2)
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "LazyJavaPackageFragmentProvider of module "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r1 = r2.a
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r1 = r1.a()
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r1 = r1.m()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

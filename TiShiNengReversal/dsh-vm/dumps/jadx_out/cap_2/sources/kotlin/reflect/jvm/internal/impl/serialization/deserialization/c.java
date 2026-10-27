package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class c implements kotlin.reflect.jvm.internal.impl.descriptors.r0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.n a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.serialization.deserialization.z b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.f0 c;
    protected kotlin.reflect.jvm.internal.impl.serialization.deserialization.m d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.l0> e;

    public c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.z r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r4) {
            r1 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "finder"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "moduleDescriptor"
            kotlin.jvm.internal.g0.p(r4, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.b r3 = new kotlin.reflect.jvm.internal.impl.serialization.deserialization.b
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.h r2 = r2.c(r3)
            r1.e = r2
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l0 d(kotlin.reflect.jvm.internal.impl.serialization.deserialization.c r0, kotlin.reflect.jvm.internal.impl.name.c r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r0 = f(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.l0 f(kotlin.reflect.jvm.internal.impl.serialization.deserialization.c r1, kotlin.reflect.jvm.internal.impl.name.c r2) {
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.q r2 = r1.e(r2)
            if (r2 == 0) goto L13
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r1 = r1.g()
            r2.G0(r1)
            return r2
        L13:
            r1 = 0
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @kotlin.Deprecated(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.l0> a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.l0> r0 = r1.e
            java.lang.Object r2 = r0.invoke(r2)
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
            kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.l0> r0 = r1.e
            java.lang.Object r2 = r0.invoke(r2)
            kotlin.reflect.jvm.internal.impl.utils.a.a(r3, r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.r0
    public boolean c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.l0> r0 = r1.e
            boolean r0 = r0.g(r2)
            if (r0 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.storage.h<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.l0> r0 = r1.e
            java.lang.Object r2 = r0.invoke(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.l0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.l0) r2
            goto L1a
        L16:
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.q r2 = r1.e(r2)
        L1a:
            if (r2 != 0) goto L1e
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    protected abstract kotlin.reflect.jvm.internal.impl.serialization.deserialization.q e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r1);

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.serialization.deserialization.m g() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r0 = r1.d
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = "components"
            kotlin.jvm.internal.g0.S(r0)
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.serialization.deserialization.z h() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.z r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.descriptors.f0 i() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.f0 r0 = r1.c
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlin.reflect.jvm.internal.impl.storage.n j() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.storage.n r0 = r1.a
            return r0
    }

    protected final void k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.serialization.deserialization.m r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.d = r2
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.m0
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.name.c> q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "nameFilter"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.util.Set r2 = kotlin.collections.u1.k()
            return r2
    }
}

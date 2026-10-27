package kotlin.reflect.jvm.internal.impl.resolve.scopes;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nStaticScopeForKotlinEnum.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StaticScopeForKotlinEnum.kt\norg/jetbrains/kotlin/resolve/scopes/StaticScopeForKotlinEnum\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,68:1\n1#2:69\n865#3,2:70\n865#3,2:72\n*S KotlinDebug\n*F\n+ 1 StaticScopeForKotlinEnum.kt\norg/jetbrains/kotlin/resolve/scopes/StaticScopeForKotlinEnum\n*L\n59#1:70,2\n62#1:72,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class q extends kotlin.reflect.jvm.internal.impl.resolve.scopes.l {
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] f = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.d b;
    private final boolean c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.i e;

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.resolve.scopes.q> r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.q.class
            java.lang.String r2 = "functions"
            java.lang.String r3 = "getFunctions()Ljava/util/List;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            kotlin.jvm.internal.PropertyReference1Impl r2 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r3 = "properties"
            java.lang.String r5 = "getProperties()Ljava/util/List;"
            r2.<init>(r1, r3, r5, r4)
            kotlin.reflect.p r1 = kotlin.jvm.internal.o0.u(r2)
            r2 = 2
            kotlin.reflect.n[] r2 = new kotlin.reflect.n[r2]
            r2[r4] = r0
            r0 = 1
            r2[r0] = r1
            kotlin.reflect.jvm.internal.impl.resolve.scopes.q.f = r2
            return
    }

    public q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.d r3, boolean r4) {
            r1 = this;
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "containingClass"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.b = r3
            r1.c = r4
            r3.h()
            kotlin.reflect.jvm.internal.impl.descriptors.ClassKind r3 = kotlin.reflect.jvm.internal.impl.descriptors.ClassKind.ENUM_CLASS
            kotlin.reflect.jvm.internal.impl.resolve.scopes.o r3 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.o
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.i r3 = r2.e(r3)
            r1.d = r3
            kotlin.reflect.jvm.internal.impl.resolve.scopes.p r3 = new kotlin.reflect.jvm.internal.impl.resolve.scopes.p
            r3.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.i r2 = r2.e(r3)
            r1.e = r2
            return
    }

    static /* synthetic */ java.util.List i(kotlin.reflect.jvm.internal.impl.resolve.scopes.q r0) {
            java.util.List r0 = k(r0)
            return r0
    }

    static /* synthetic */ java.util.List j(kotlin.reflect.jvm.internal.impl.resolve.scopes.q r0) {
            java.util.List r0 = q(r0)
            return r0
    }

    private static final java.util.List k(kotlin.reflect.jvm.internal.impl.resolve.scopes.q r3) {
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r3.b
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = kotlin.reflect.jvm.internal.impl.resolve.h.g(r0)
            kotlin.reflect.jvm.internal.impl.descriptors.d r3 = r3.b
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r3 = kotlin.reflect.jvm.internal.impl.resolve.h.h(r3)
            r1 = 2
            kotlin.reflect.jvm.internal.impl.descriptors.d1[] r1 = new kotlin.reflect.jvm.internal.impl.descriptors.d1[r1]
            r2 = 0
            r1[r2] = r0
            r0 = 1
            r1[r0] = r3
            java.util.List r3 = kotlin.collections.f0.Q(r1)
            return r3
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.d1> o() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.d
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.q.f
            r2 = 0
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.w0> p() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.storage.i r0 = r3.e
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.resolve.scopes.q.f
            r2 = 1
            r1 = r1[r2]
            java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.storage.m.a(r0, r3, r1)
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    private static final java.util.List q(kotlin.reflect.jvm.internal.impl.resolve.scopes.q r1) {
            boolean r0 = r1.c
            if (r0 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.descriptors.d r1 = r1.b
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = kotlin.reflect.jvm.internal.impl.resolve.h.f(r1)
            java.util.List r1 = kotlin.collections.f0.R(r1)
            return r1
        Lf:
            java.util.List r1 = kotlin.collections.f0.J()
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public /* bridge */ /* synthetic */ java.util.Collection a(kotlin.reflect.jvm.internal.impl.name.f r1, t3.b r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.utils.j r1 = r0.n(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.k
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull t3.b r5) {
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List r5 = r3.p()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.reflect.jvm.internal.impl.utils.j r0 = new kotlin.reflect.jvm.internal.impl.utils.j
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L19:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto L19
            r0.add(r1)
            goto L19
        L34:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f g(kotlin.reflect.jvm.internal.impl.name.f r1, t3.b r2) {
            r0 = this;
            java.lang.Void r1 = r0.l(r1, r2)
            kotlin.reflect.jvm.internal.impl.descriptors.f r1 = (kotlin.reflect.jvm.internal.impl.descriptors.f) r1
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.l, kotlin.reflect.jvm.internal.impl.resolve.scopes.n
    public /* bridge */ /* synthetic */ java.util.Collection h(kotlin.reflect.jvm.internal.impl.resolve.scopes.d r1, kotlin.jvm.functions.Function1 r2) {
            r0 = this;
            java.util.List r1 = r0.m(r1, r2)
            java.util.Collection r1 = (java.util.Collection) r1
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Void l(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull t3.b r3) {
            r1 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "location"
            kotlin.jvm.internal.g0.p(r3, r2)
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor> m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.d r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "kindFilter"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r2 = "nameFilter"
            kotlin.jvm.internal.g0.p(r3, r2)
            java.util.List r2 = r1.o()
            java.util.Collection r2 = (java.util.Collection) r2
            java.util.List r3 = r1.p()
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r2 = kotlin.collections.f0.I4(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.utils.j<kotlin.reflect.jvm.internal.impl.descriptors.d1> n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull t3.b r5) {
            r3 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "location"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.List r5 = r3.o()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            kotlin.reflect.jvm.internal.impl.utils.j r0 = new kotlin.reflect.jvm.internal.impl.utils.j
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L19:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L34
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.d1) r2
            kotlin.reflect.jvm.internal.impl.name.f r2 = r2.getName()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto L19
            r0.add(r1)
            goto L19
        L34:
            return r0
    }
}

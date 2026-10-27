package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nModuleDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl\n+ 2 coreLib.kt\norg/jetbrains/kotlin/utils/CoreLibKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,180:1\n19#2:181\n19#2:185\n19#2:186\n19#2:188\n774#3:182\n865#3,2:183\n1869#3,2:189\n1563#3:191\n1634#3,3:192\n1#4:187\n*S KotlinDebug\n*F\n+ 1 ModuleDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ModuleDescriptorImpl\n*L\n72#1:181\n75#1:185\n78#1:186\n91#1:188\n72#1:182\n72#1:183,2\n95#1:189,2\n101#1:191\n101#1:192,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.m implements kotlin.reflect.jvm.internal.impl.descriptors.f0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.n c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.builtins.j d;

    @org.jetbrains.annotations.Nullable
    private final z3.c e;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.name.f f;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.e0<?>, java.lang.Object> g;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.i0 h;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.descriptors.impl.b0 i;

    @org.jetbrains.annotations.Nullable
    private kotlin.reflect.jvm.internal.impl.descriptors.m0 j;
    private boolean k;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.s0> l;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s m;

    @kotlin.jvm.JvmOverloads
    public f0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r13, @org.jetbrains.annotations.Nullable z3.c r14) {
            r10 = this;
            java.lang.String r0 = "moduleName"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.g0.p(r13, r0)
            r8 = 48
            r9 = 0
            r6 = 0
            r7 = 0
            r1 = r10
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
    }

    @kotlin.jvm.JvmOverloads
    public f0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.j r4, @org.jetbrains.annotations.Nullable z3.c r5, @org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.e0<?>, ? extends java.lang.Object> r6, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r7) {
            r1 = this;
            java.lang.String r0 = "moduleName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "storageManager"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "capabilities"
            kotlin.jvm.internal.g0.p(r6, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.b()
            r1.<init>(r0, r2)
            r1.c = r3
            r1.d = r4
            r1.e = r5
            r1.f = r7
            boolean r4 = r2.i()
            if (r4 == 0) goto L59
            r1.g = r6
            kotlin.reflect.jvm.internal.impl.descriptors.impl.i0$a r2 = kotlin.reflect.jvm.internal.impl.descriptors.impl.i0.a
            kotlin.reflect.jvm.internal.impl.descriptors.e0 r2 = r2.a()
            java.lang.Object r2 = r1.U(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.i0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.i0) r2
            if (r2 != 0) goto L3d
            kotlin.reflect.jvm.internal.impl.descriptors.impl.i0$b r2 = kotlin.reflect.jvm.internal.impl.descriptors.impl.i0.b.b
        L3d:
            r1.h = r2
            r2 = 1
            r1.k = r2
            kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 r2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.d0
            r2.<init>(r1)
            kotlin.reflect.jvm.internal.impl.storage.g r2 = r3.i(r2)
            r1.l = r2
            kotlin.reflect.jvm.internal.impl.descriptors.impl.e0 r2 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.e0
            r2.<init>(r1)
            kotlin.s r2 = kotlin.t.c(r2)
            r1.m = r2
            return
        L59:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Module name must be special: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            r3.<init>(r2)
            throw r3
    }

    public /* synthetic */ f0(kotlin.reflect.jvm.internal.impl.name.f r2, kotlin.reflect.jvm.internal.impl.storage.n r3, kotlin.reflect.jvm.internal.impl.builtins.j r4, z3.c r5, java.util.Map r6, kotlin.reflect.jvm.internal.impl.name.f r7, int r8, kotlin.jvm.internal.v r9) {
            r1 = this;
            r9 = r8 & 8
            r0 = 0
            if (r9 == 0) goto L6
            r5 = r0
        L6:
            r9 = r8 & 16
            if (r9 == 0) goto Le
            java.util.Map r6 = kotlin.collections.i1.z()
        Le:
            r8 = r8 & 32
            if (r8 == 0) goto L1a
            r8 = r0
        L13:
            r7 = r6
            r6 = r5
            r5 = r4
            r4 = r3
            r3 = r2
            r2 = r1
            goto L1c
        L1a:
            r8 = r7
            goto L13
        L1c:
            r2.<init>(r3, r4, r5, r6, r7, r8)
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.l E0(kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l r0 = M0(r0)
            return r0
    }

    private final java.lang.String G0() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.f r0 = r2.getName()
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.impl.l I0() {
            r1 = this;
            kotlin.s r0 = r1.m
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.l) r0
            return r0
    }

    private final boolean K0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r0 = r1.j
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.impl.l M0(kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r3) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.b0 r0 = r3.i
            if (r0 == 0) goto L63
            java.util.List r0 = r0.c()
            r3.F0()
            r0.contains(r3)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.Iterator r1 = r0.iterator()
        L14:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L24
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.f0) r2
            r2.K0()
            goto L14
        L24:
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L33:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L48
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.f0) r2
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r2 = r2.j
            kotlin.jvm.internal.g0.m(r2)
            r1.add(r2)
            goto L33
        L48:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "CompositeProvider@ModuleDescriptor for "
            r0.append(r2)
            kotlin.reflect.jvm.internal.impl.name.f r3 = r3.getName()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.l
            r0.<init>(r1, r3)
            return r0
        L63:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Dependencies of module "
            r0.append(r1)
            java.lang.String r3 = r3.G0()
            r0.append(r3)
            java.lang.String r3 = " were not set before querying module content"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            r0.<init>(r3)
            throw r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.s0 N0(kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r2, kotlin.reflect.jvm.internal.impl.name.c r3) {
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.i0 r0 = r2.h
            kotlin.reflect.jvm.internal.impl.storage.n r1 = r2.c
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r2 = r0.a(r2, r3, r1)
            return r2
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.s0 p0(kotlin.reflect.jvm.internal.impl.descriptors.impl.f0 r0, kotlin.reflect.jvm.internal.impl.name.c r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r0 = N0(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    public boolean B(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r3) {
            r2 = this;
            java.lang.String r0 = "targetModule"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = kotlin.jvm.internal.g0.g(r2, r3)
            r1 = 1
            if (r0 == 0) goto Ld
            return r1
        Ld:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.b0 r0 = r2.i
            kotlin.jvm.internal.g0.m(r0)
            java.util.Set r0 = r0.b()
            boolean r0 = kotlin.collections.f0.a2(r0, r3)
            if (r0 == 0) goto L1d
            return r1
        L1d:
            java.util.List r0 = r2.P()
            boolean r0 = r0.contains(r3)
            if (r0 == 0) goto L28
            return r1
        L28:
            java.util.List r3 = r3.P()
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L33
            return r1
        L33:
            r3 = 0
            return r3
    }

    public void F0() {
            r1 = this;
            boolean r0 = r1.L0()
            if (r0 != 0) goto L9
            kotlin.reflect.jvm.internal.impl.descriptors.a0.a(r1)
        L9:
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.m0 H0() {
            r1 = this;
            r1.F0()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.l r0 = r1.I0()
            return r0
    }

    public final void J0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.m0 r2) {
            r1 = this;
            java.lang.String r0 = "providerForModuleContent"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.K0()
            r1.j = r2
            return
    }

    public boolean L0() {
            r1 = this;
            boolean r0 = r1.k
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s0 M(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.F0()
            kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.c, kotlin.reflect.jvm.internal.impl.descriptors.s0> r0 = r1.l
            java.lang.Object r2 = r0.invoke(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.s0) r2
            return r2
    }

    public final void O0(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> r2) {
            r1 = this;
            java.lang.String r0 = "descriptors"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Set r0 = kotlin.collections.u1.k()
            r1.P0(r2, r0)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @org.jetbrains.annotations.NotNull
    public java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.f0> P() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.b0 r0 = r2.i
            if (r0 == 0) goto L9
            java.util.List r0 = r0.a()
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Dependencies of module "
            r0.append(r1)
            java.lang.String r1 = r2.G0()
            r0.append(r1)
            java.lang.String r1 = " were not set"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.AssertionError r1 = new java.lang.AssertionError
            r1.<init>(r0)
            throw r1
    }

    public final void P0(@org.jetbrains.annotations.NotNull java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> r4, @org.jetbrains.annotations.NotNull java.util.Set<kotlin.reflect.jvm.internal.impl.descriptors.impl.f0> r5) {
            r3 = this;
            java.lang.String r0 = "descriptors"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "friends"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.c0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.c0
            java.util.List r1 = kotlin.collections.f0.J()
            java.util.Set r2 = kotlin.collections.u1.k()
            r0.<init>(r4, r5, r1, r2)
            r3.Q0(r0)
            return
    }

    public final void Q0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.impl.b0 r2) {
            r1 = this;
            java.lang.String r0 = "dependencies"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.i = r2
            return
    }

    public final void R0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.impl.f0... r2) {
            r1 = this;
            java.lang.String r0 = "descriptors"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.List r2 = kotlin.collections.n.dz(r2)
            r1.O0(r2)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @org.jetbrains.annotations.Nullable
    public <T> T U(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e0<T> r2) {
            r1 = this;
            java.lang.String r0 = "capability"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Map<kotlin.reflect.jvm.internal.impl.descriptors.e0<?>, java.lang.Object> r0 = r1.g
            java.lang.Object r2 = r0.get(r2)
            if (r2 != 0) goto Le
            r2 = 0
        Le:
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.Nullable
    public <R, D> R W(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r1, D r2) {
            r0 = this;
            java.lang.Object r1 = kotlin.reflect.jvm.internal.impl.descriptors.f0.a.a(r0, r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = kotlin.reflect.jvm.internal.impl.descriptors.f0.a.b(r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.builtins.j p() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.builtins.j r0 = r1.d
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.name.c> q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.name.f, java.lang.Boolean> r3) {
            r1 = this;
            java.lang.String r0 = "fqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "nameFilter"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.F0()
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r0 = r1.H0()
            java.util.Collection r2 = r0.q(r2, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.m
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            boolean r1 = r2.L0()
            if (r1 != 0) goto L17
            java.lang.String r1 = " !isValid"
            r0.append(r1)
        L17:
            java.lang.String r1 = " packageFragmentProvider: "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.m0 r1 = r2.j
            if (r1 == 0) goto L29
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getSimpleName()
            goto L2a
        L29:
            r1 = 0
        L2a:
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

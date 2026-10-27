package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nsignatureEnhancement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 signatureEnhancement.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,296:1\n1#2:297\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class l1 extends kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> {

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.descriptors.annotations.a a;
    private final boolean b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.lazy.k c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType d;
    private final boolean e;

    public l1(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.annotations.a r2, boolean r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.lazy.k r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "containerContext"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "containerApplicabilityType"
            kotlin.jvm.internal.g0.p(r5, r0)
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r4
            r1.d = r5
            r1.e = r6
            return
    }

    public /* synthetic */ l1(kotlin.reflect.jvm.internal.impl.descriptors.annotations.a r7, boolean r8, kotlin.reflect.jvm.internal.impl.load.java.lazy.k r9, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r10, boolean r11, int r12, kotlin.jvm.internal.v r13) {
            r6 = this;
            r12 = r12 & 16
            if (r12 == 0) goto Lc
            r11 = 0
            r5 = 0
        L6:
            r0 = r6
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            goto Le
        Lc:
            r5 = r11
            goto L6
        Le:
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    public /* bridge */ /* synthetic */ d4.r A() {
            r1 = this;
            d4.t r0 = r1.M()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    public boolean B(@org.jetbrains.annotations.NotNull d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            boolean r2 = kotlin.reflect.jvm.internal.impl.builtins.j.f0(r2)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    public boolean C() {
            r1 = this;
            boolean r0 = r1.b
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    public boolean D(@org.jetbrains.annotations.NotNull d4.g r2, @org.jetbrains.annotations.NotNull d4.g r3) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r1.c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.types.checker.p r0 = r0.k()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = (kotlin.reflect.jvm.internal.impl.types.t0) r3
            boolean r2 = r0.a(r2, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    public boolean E(@org.jetbrains.annotations.NotNull d4.p r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.b1
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    public boolean F(@org.jetbrains.annotations.NotNull d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = r2.L0()
            boolean r2 = r2 instanceof kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.i
            return r2
    }

    public boolean J(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r3, @org.jetbrains.annotations.Nullable d4.g r4) {
            r2 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r3, r0)
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.g
            if (r0 == 0) goto L12
            r0 = r3
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.g r0 = (kotlin.reflect.jvm.internal.impl.load.java.descriptors.g) r0
            boolean r0 = r0.e()
            if (r0 != 0) goto L51
        L12:
            boolean r0 = r3 instanceof kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j
            if (r0 == 0) goto L2d
            boolean r0 = r2.u()
            if (r0 != 0) goto L2d
            r0 = r3
            kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j r0 = (kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.j) r0
            boolean r0 = r0.k()
            if (r0 != 0) goto L51
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = r2.q()
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r1 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS
            if (r0 == r1) goto L51
        L2d:
            if (r4 == 0) goto L53
            kotlin.reflect.jvm.internal.impl.types.t0 r4 = (kotlin.reflect.jvm.internal.impl.types.t0) r4
            boolean r4 = kotlin.reflect.jvm.internal.impl.builtins.j.r0(r4)
            if (r4 == 0) goto L53
            kotlin.reflect.jvm.internal.impl.load.java.c r4 = r2.K()
            boolean r3 = r4.p(r3)
            if (r3 == 0) goto L53
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r3 = r2.c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r3 = r3.a()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.e r3 = r3.q()
            boolean r3 = r3.d()
            if (r3 != 0) goto L53
        L51:
            r3 = 1
            return r3
        L53:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.load.java.c K() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r1.c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.java.c r0 = r0.a()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.t0 L(@org.jetbrains.annotations.NotNull d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = kotlin.reflect.jvm.internal.impl.types.l2.a(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public d4.t M() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.checker.u r0 = kotlin.reflect.jvm.internal.impl.types.checker.u.a
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    public /* bridge */ /* synthetic */ boolean l(kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1, d4.g r2) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c r1 = (kotlin.reflect.jvm.internal.impl.descriptors.annotations.c) r1
            boolean r1 = r0.J(r1, r2)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.b<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> m() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.c r0 = r1.K()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    @org.jetbrains.annotations.NotNull
    public java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> n(@org.jetbrains.annotations.NotNull d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r2 = r2.getAnnotations()
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    @org.jetbrains.annotations.NotNull
    public java.lang.Iterable<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> p() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.a r0 = r1.a
            if (r0 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r0 = r0.getAnnotations()
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.util.List r0 = kotlin.collections.f0.J()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType q() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = r1.d
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.load.java.e0 r() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r1.c
            kotlin.reflect.jvm.internal.impl.load.java.e0 r0 = r0.b()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    public boolean s() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.a r0 = r2.a
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.q1
            if (r1 == 0) goto L10
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r0
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.z0()
            if (r0 == 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    @org.jetbrains.annotations.Nullable
    protected kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j t(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r5, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.v r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto Lf
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            r2 = 0
            r3 = 2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j.b(r5, r1, r2, r3, r0)
            if (r5 != 0) goto Le
            goto Lf
        Le:
            return r5
        Lf:
            if (r6 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r5 = r6.d()
            return r5
        L16:
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    public boolean u() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.lazy.k r0 = r1.c
            kotlin.reflect.jvm.internal.impl.load.java.lazy.d r0 = r0.a()
            kotlin.reflect.jvm.internal.impl.load.java.lazy.e r0 = r0.q()
            boolean r0 = r0.c()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    public /* bridge */ /* synthetic */ d4.g v(d4.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r0.L(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.name.d x(@org.jetbrains.annotations.NotNull d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            kotlin.reflect.jvm.internal.impl.descriptors.d r2 = kotlin.reflect.jvm.internal.impl.types.j2.f(r2)
            if (r2 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.name.d r2 = kotlin.reflect.jvm.internal.impl.resolve.i.m(r2)
            return r2
        L12:
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d
    public boolean z() {
            r1 = this;
            boolean r0 = r1.e
            return r0
    }
}

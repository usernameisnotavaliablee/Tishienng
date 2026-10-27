package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractSignatureParts.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,234:1\n1#2:235\n1#2:258\n1#2:281\n774#3:236\n865#3,2:237\n1740#3,3:239\n1761#3,3:242\n1761#3,3:245\n1617#3,9:248\n1869#3:257\n1870#3:259\n1626#3:260\n1740#3,3:261\n1563#3:264\n1634#3,3:265\n1761#3,3:268\n1617#3,9:271\n1869#3:280\n1870#3:282\n1626#3:283\n1869#3,2:284\n3544#3,7:286\n*S KotlinDebug\n*F\n+ 1 AbstractSignatureParts.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/AbstractSignatureParts\n*L\n162#1:258\n188#1:281\n90#1:236\n90#1:237,2\n159#1:239,3\n161#1:242,3\n162#1:245,3\n162#1:248,9\n162#1:257\n162#1:259\n162#1:260\n165#1:261,3\n175#1:264\n175#1:265,3\n183#1:268,3\n188#1:271,9\n188#1:280\n188#1:282\n188#1:283\n201#1:284,2\n215#1:286,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class d<TAnnotation> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {

        @org.jetbrains.annotations.Nullable
        private final d4.g a;

        @org.jetbrains.annotations.Nullable
        private final kotlin.reflect.jvm.internal.impl.load.java.e0 b;

        @org.jetbrains.annotations.Nullable
        private final d4.p c;

        public a(@org.jetbrains.annotations.Nullable d4.g r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.e0 r2, @org.jetbrains.annotations.Nullable d4.p r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.load.java.e0 a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.load.java.e0 r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final d4.p b() {
                r1 = this;
                d4.p r0 = r1.c
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final d4.g getType() {
                r1 = this;
                d4.g r0 = r1.a
                return r0
        }
    }

    public d() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j G(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r3, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r4) {
            r2 = this;
            if (r3 != 0) goto L3
            return r4
        L3:
            if (r4 != 0) goto L6
            goto L3d
        L6:
            boolean r0 = r3.d()
            if (r0 == 0) goto L13
            boolean r0 = r4.d()
            if (r0 != 0) goto L13
            goto L3e
        L13:
            boolean r0 = r3.d()
            if (r0 != 0) goto L20
            boolean r0 = r4.d()
            if (r0 == 0) goto L20
            goto L3d
        L20:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = r3.c()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r4.c()
            int r0 = r0.compareTo(r1)
            if (r0 >= 0) goto L2f
            goto L3e
        L2f:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = r3.c()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r4.c()
            int r0 = r0.compareTo(r1)
            if (r0 <= 0) goto L3e
        L3d:
            return r3
        L3e:
            return r4
    }

    private final java.util.List<kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.a> H(d4.g r5) {
            r4 = this;
            d4.r r0 = r4.A()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a
            kotlin.reflect.jvm.internal.impl.load.java.e0 r2 = r4.r()
            kotlin.reflect.jvm.internal.impl.load.java.e0 r2 = r4.f(r5, r2)
            r3 = 0
            r1.<init>(r5, r2, r3)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.c
            r5.<init>(r4, r0)
            java.util.List r5 = r4.j(r1, r5)
            return r5
    }

    private static final java.lang.Iterable I(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d r8, d4.r r9, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.a r10) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r10, r0)
            boolean r0 = r8.z()
            r1 = 0
            if (r0 == 0) goto L1a
            d4.g r0 = r10.getType()
            if (r0 == 0) goto L1a
            boolean r0 = r9.s0(r0)
            r2 = 1
            if (r0 != r2) goto L1a
            return r1
        L1a:
            d4.g r0 = r10.getType()
            if (r0 == 0) goto L8e
            d4.o r0 = r9.W(r0)
            if (r0 == 0) goto L8e
            java.util.List r0 = r9.e0(r0)
            if (r0 == 0) goto L8e
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            d4.g r2 = r10.getType()
            java.util.List r2 = r9.o(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.Iterator r3 = r0.iterator()
            java.util.Iterator r4 = r2.iterator()
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r0 = kotlin.collections.f0.d0(r0, r6)
            int r2 = kotlin.collections.f0.d0(r2, r6)
            int r0 = java.lang.Math.min(r0, r2)
            r5.<init>(r0)
        L53:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L8d
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L8d
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            d4.l r2 = (d4.l) r2
            d4.p r0 = (d4.p) r0
            d4.g r2 = r9.getType(r2)
            if (r2 != 0) goto L7b
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r2 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a
            kotlin.reflect.jvm.internal.impl.load.java.e0 r6 = r10.a()
            r2.<init>(r1, r6, r0)
            goto L89
        L7b:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r6 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a
            kotlin.reflect.jvm.internal.impl.load.java.e0 r7 = r10.a()
            kotlin.reflect.jvm.internal.impl.load.java.e0 r7 = r8.f(r2, r7)
            r6.<init>(r2, r7, r0)
            r2 = r6
        L89:
            r5.add(r2)
            goto L53
        L8d:
            return r5
        L8e:
            return r1
    }

    static /* synthetic */ boolean a(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d r0, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.a r1, java.lang.Object r2) {
            boolean r0 = i(r0, r1, r2)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h b(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r0, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h[] r1, int r2) {
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r0 = e(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.Iterable c(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d r0, d4.r r1, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.a r2) {
            java.lang.Iterable r0 = I(r0, r1, r2)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h e(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r1, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h[] r2, int r3) {
            if (r1 == 0) goto L16
            java.util.Map r1 = r1.b()
            if (r1 == 0) goto L16
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            java.lang.Object r1 = r1.get(r0)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r1 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h) r1
            if (r1 != 0) goto L15
            goto L16
        L15:
            return r1
        L16:
            if (r3 < 0) goto L1e
            int r1 = r2.length
            if (r3 >= r1) goto L1e
            r1 = r2[r3]
            return r1
        L1e:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h$a r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.e
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r1 = r1.a()
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.e0 f(d4.g r2, kotlin.reflect.jvm.internal.impl.load.java.e0 r3) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.load.java.b r0 = r1.m()
            java.lang.Iterable r2 = r1.n(r2)
            kotlin.reflect.jvm.internal.impl.load.java.e0 r2 = r0.d(r3, r2)
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h g(d4.g r7) {
            r6 = this;
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = r6.y(r7)
            r1 = 0
            if (r0 != 0) goto L14
            d4.g r2 = r6.v(r7)
            if (r2 == 0) goto L12
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r2 = r6.y(r2)
            goto L15
        L12:
            r2 = r1
            goto L15
        L14:
            r2 = r0
        L15:
            d4.r r3 = r6.A()
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c r4 = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.a
            d4.h r5 = r3.I(r7)
            kotlin.reflect.jvm.internal.impl.name.d r5 = r6.x(r5)
            boolean r5 = r4.l(r5)
            if (r5 == 0) goto L2c
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
            goto L3c
        L2c:
            d4.h r3 = r3.B0(r7)
            kotlin.reflect.jvm.internal.impl.name.d r3 = r6.x(r3)
            boolean r3 = r4.k(r3)
            if (r3 == 0) goto L3c
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r1 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
        L3c:
            d4.r r3 = r6.A()
            boolean r3 = r3.S(r7)
            r4 = 1
            r5 = 0
            if (r3 != 0) goto L51
            boolean r7 = r6.F(r7)
            if (r7 == 0) goto L4f
            goto L51
        L4f:
            r7 = 0
            goto L52
        L51:
            r7 = 1
        L52:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r3 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h
            if (r2 == r0) goto L57
            goto L58
        L57:
            r4 = 0
        L58:
            r3.<init>(r2, r1, r7, r4)
            return r3
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h h(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.a r12) {
            r11 = this;
            d4.g r0 = r12.getType()
            r1 = 0
            if (r0 != 0) goto L22
            d4.r r0 = r11.A()
            d4.p r2 = r12.b()
            if (r2 == 0) goto L16
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r0 = r0.M(r2)
            goto L17
        L16:
            r0 = r1
        L17:
            kotlin.reflect.jvm.internal.impl.types.model.TypeVariance r2 = kotlin.reflect.jvm.internal.impl.types.model.TypeVariance.IN
            if (r0 != r2) goto L22
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h$a r12 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h.e
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r12 = r12.a()
            return r12
        L22:
            d4.p r0 = r12.b()
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L2c
            r0 = 1
            goto L2d
        L2c:
            r0 = 0
        L2d:
            d4.g r4 = r12.getType()
            if (r4 == 0) goto L39
            java.lang.Iterable r4 = r11.n(r4)
            if (r4 != 0) goto L3f
        L39:
            java.util.List r4 = kotlin.collections.f0.J()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
        L3f:
            d4.r r5 = r11.A()
            d4.g r6 = r12.getType()
            if (r6 == 0) goto L54
            d4.o r6 = r5.W(r6)
            if (r6 == 0) goto L54
            d4.p r5 = r5.Q(r6)
            goto L55
        L54:
            r5 = r1
        L55:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r6 = r11.q()
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r7 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS
            if (r6 != r7) goto L5f
            r6 = 1
            goto L60
        L5f:
            r6 = 0
        L60:
            if (r0 != 0) goto L63
            goto Lad
        L63:
            if (r6 != 0) goto La3
            boolean r7 = r11.u()
            if (r7 == 0) goto La3
            d4.g r7 = r12.getType()
            if (r7 == 0) goto La3
            boolean r7 = r11.B(r7)
            if (r7 != r3) goto La3
            java.lang.Iterable r7 = r11.p()
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            java.util.Iterator r7 = r7.iterator()
        L84:
            boolean r9 = r7.hasNext()
            if (r9 == 0) goto L9c
            java.lang.Object r9 = r7.next()
            kotlin.reflect.jvm.internal.impl.load.java.b r10 = r11.m()
            boolean r10 = r10.p(r9)
            if (r10 != 0) goto L84
            r8.add(r9)
            goto L84
        L9c:
            java.util.List r4 = kotlin.collections.f0.I4(r8, r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            goto Lad
        La3:
            java.lang.Iterable r7 = r11.p()
            java.util.List r4 = kotlin.collections.f0.E4(r7, r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
        Lad:
            kotlin.reflect.jvm.internal.impl.load.java.b r7 = r11.m()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r7 = r7.g(r4)
            kotlin.reflect.jvm.internal.impl.load.java.b r8 = r11.m()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a r9 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.a
            r9.<init>(r11, r12)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r4 = r8.h(r4, r9)
            if (r4 == 0) goto Ldd
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r12 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = r4.c()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r4.c()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            if (r1 != r6) goto Ld5
            if (r5 == 0) goto Ld5
            r2 = 1
        Ld5:
            boolean r1 = r4.d()
            r12.<init>(r0, r7, r2, r1)
            return r12
        Ldd:
            if (r0 != 0) goto Le5
            if (r6 == 0) goto Le2
            goto Le5
        Le2:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_USE
            goto Le9
        Le5:
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = r11.q()
        Le9:
            kotlin.reflect.jvm.internal.impl.load.java.e0 r4 = r12.a()
            if (r4 == 0) goto Lf4
            kotlin.reflect.jvm.internal.impl.load.java.v r0 = r4.a(r0)
            goto Lf5
        Lf4:
            r0 = r1
        Lf5:
            if (r5 == 0) goto Lfc
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r4 = r11.o(r5)
            goto Lfd
        Lfc:
            r4 = r1
        Lfd:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r6 = r11.t(r4, r0)
            if (r4 == 0) goto L108
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r4.c()
            goto L109
        L108:
            r4 = r1
        L109:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r8 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            if (r4 == r8) goto L11a
            if (r5 == 0) goto L118
            if (r0 == 0) goto L118
            boolean r0 = r0.c()
            if (r0 != r3) goto L118
            goto L11a
        L118:
            r0 = 0
            goto L11b
        L11a:
            r0 = 1
        L11b:
            d4.p r12 = r12.b()
            if (r12 == 0) goto L137
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r12 = r11.o(r12)
            if (r12 == 0) goto L137
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = r12.c()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            if (r4 != r5) goto L138
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            r5 = 2
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r12 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j.b(r12, r4, r2, r5, r1)
            goto L138
        L137:
            r12 = r1
        L138:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r12 = r11.G(r12, r6)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r4 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h
            if (r12 == 0) goto L144
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r1 = r12.c()
        L144:
            if (r12 == 0) goto L14d
            boolean r12 = r12.d()
            if (r12 != r3) goto L14d
            r2 = 1
        L14d:
            r4.<init>(r1, r7, r0, r2)
            return r4
    }

    private static final boolean i(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d r1, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.a r2, java.lang.Object r3) {
            java.lang.String r0 = "$this$extractNullability"
            kotlin.jvm.internal.g0.p(r3, r0)
            d4.g r2 = r2.getType()
            boolean r1 = r1.l(r3, r2)
            return r1
    }

    private final <T> java.util.List<T> j(T r3, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends T>> r4) {
            r2 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 1
            r0.<init>(r1)
            r2.k(r3, r0, r4)
            return r0
    }

    private final <T> void k(T r2, java.util.List<T> r3, kotlin.jvm.functions.Function1<? super T, ? extends java.lang.Iterable<? extends T>> r4) {
            r1 = this;
            r3.add(r2)
            java.lang.Object r2 = r4.invoke(r2)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            if (r2 == 0) goto L1d
            java.util.Iterator r2 = r2.iterator()
        Lf:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r2.next()
            r1.k(r0, r3, r4)
            goto Lf
        L1d:
            return
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j o(d4.p r7) {
            r6 = this;
            d4.r r0 = r6.A()
            boolean r1 = r6.E(r7)
            r2 = 0
            if (r1 != 0) goto Lc
            return r2
        Lc:
            java.util.List r7 = r0.J0(r7)
            r1 = r7
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto L22
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L22
            goto Ld5
        L22:
            java.util.Iterator r4 = r1.iterator()
        L26:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto Ld5
            java.lang.Object r5 = r4.next()
            d4.g r5 = (d4.g) r5
            boolean r5 = r0.Z(r5)
            if (r5 != 0) goto L26
            if (r3 == 0) goto L44
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L44
            goto L5c
        L44:
            java.util.Iterator r4 = r1.iterator()
        L48:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L5c
            java.lang.Object r5 = r4.next()
            d4.g r5 = (d4.g) r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r5 = r6.y(r5)
            if (r5 == 0) goto L48
            r2 = r7
            goto L9e
        L5c:
            if (r3 == 0) goto L69
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L69
            goto Ld5
        L69:
            java.util.Iterator r3 = r1.iterator()
        L6d:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto Ld5
            java.lang.Object r4 = r3.next()
            d4.g r4 = (d4.g) r4
            d4.g r4 = r6.v(r4)
            if (r4 == 0) goto L6d
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L88:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r1.next()
            d4.g r3 = (d4.g) r3
            d4.g r3 = r6.v(r3)
            if (r3 == 0) goto L88
            r2.add(r3)
            goto L88
        L9e:
            r1 = r2
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r3 = r1 instanceof java.util.Collection
            if (r3 == 0) goto Laf
            r3 = r1
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto Laf
            goto Lc8
        Laf:
            java.util.Iterator r1 = r1.iterator()
        Lb3:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lc8
            java.lang.Object r3 = r1.next()
            d4.g r3 = (d4.g) r3
            boolean r3 = r0.i0(r3)
            if (r3 != 0) goto Lb3
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            goto Lca
        Lc8:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
        Lca:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j
            if (r2 == r7) goto Ld0
            r7 = 1
            goto Ld1
        Ld0:
            r7 = 0
        Ld1:
            r1.<init>(r0, r7)
            return r1
        Ld5:
            return r2
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier y(d4.g r3) {
            r2 = this;
            d4.r r0 = r2.A()
            d4.h r1 = r0.I(r3)
            boolean r1 = r0.c0(r1)
            if (r1 == 0) goto L11
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            return r3
        L11:
            d4.h r3 = r0.B0(r3)
            boolean r3 = r0.c0(r3)
            if (r3 != 0) goto L1e
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            return r3
        L1e:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public abstract d4.r A();

    public abstract boolean B(@org.jetbrains.annotations.NotNull d4.g r1);

    public abstract boolean C();

    public abstract boolean D(@org.jetbrains.annotations.NotNull d4.g r1, @org.jetbrains.annotations.NotNull d4.g r2);

    public abstract boolean E(@org.jetbrains.annotations.NotNull d4.p r1);

    public boolean F(@org.jetbrains.annotations.NotNull d4.g r2) {
            r1 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h> d(@org.jetbrains.annotations.NotNull d4.g r10, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends d4.g> r11, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r12, boolean r13) {
            r9 = this;
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "overrides"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.util.List r0 = r9.H(r10)
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r11, r2)
            r1.<init>(r2)
            java.util.Iterator r2 = r11.iterator()
        L1d:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L31
            java.lang.Object r3 = r2.next()
            d4.g r3 = (d4.g) r3
            java.util.List r3 = r9.H(r3)
            r1.add(r3)
            goto L1d
        L31:
            boolean r2 = r9.w()
            r3 = 1
            if (r2 != 0) goto L68
            boolean r2 = r9.C()
            if (r2 == 0) goto L63
            boolean r2 = r11 instanceof java.util.Collection
            if (r2 == 0) goto L4c
            r2 = r11
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L4c
            goto L63
        L4c:
            java.util.Iterator r11 = r11.iterator()
        L50:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L63
            java.lang.Object r2 = r11.next()
            d4.g r2 = (d4.g) r2
            boolean r2 = r9.D(r10, r2)
            if (r2 != 0) goto L50
            goto L68
        L63:
            int r10 = r0.size()
            goto L69
        L68:
            r10 = 1
        L69:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h[] r11 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h[r10]
            r2 = 0
            r4 = 0
        L6d:
            if (r4 >= r10) goto Lc7
            java.lang.Object r5 = r0.get(r4)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r5 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.a) r5
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r5 = r9.h(r5)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r7 = r1.iterator()
        L82:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto La8
            java.lang.Object r8 = r7.next()
            java.util.List r8 = (java.util.List) r8
            java.lang.Object r8 = kotlin.collections.f0.b3(r8, r4)
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d$a r8 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d.a) r8
            if (r8 == 0) goto La1
            d4.g r8 = r8.getType()
            if (r8 == 0) goto La1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r8 = r9.g(r8)
            goto La2
        La1:
            r8 = 0
        La2:
            if (r8 == 0) goto L82
            r6.add(r8)
            goto L82
        La8:
            if (r4 != 0) goto Lb2
            boolean r7 = r9.C()
            if (r7 == 0) goto Lb2
            r7 = 1
            goto Lb3
        Lb2:
            r7 = 0
        Lb3:
            if (r4 != 0) goto Lbd
            boolean r8 = r9.s()
            if (r8 == 0) goto Lbd
            r8 = 1
            goto Lbe
        Lbd:
            r8 = 0
        Lbe:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r5 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.p1.a(r5, r6, r7, r8, r13)
            r11[r4] = r5
            int r4 = r4 + 1
            goto L6d
        Lc7:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b r10 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.b
            r10.<init>(r12, r11)
            return r10
    }

    public abstract boolean l(@org.jetbrains.annotations.NotNull TAnnotation r1, @org.jetbrains.annotations.Nullable d4.g r2);

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.load.java.b<TAnnotation> m();

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.Iterable<TAnnotation> n(@org.jetbrains.annotations.NotNull d4.g r1);

    @org.jetbrains.annotations.NotNull
    public abstract java.lang.Iterable<TAnnotation> p();

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType q();

    @org.jetbrains.annotations.Nullable
    public abstract kotlin.reflect.jvm.internal.impl.load.java.e0 r();

    public abstract boolean s();

    @org.jetbrains.annotations.Nullable
    protected abstract kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j t(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.v r2);

    public abstract boolean u();

    @org.jetbrains.annotations.Nullable
    public abstract d4.g v(@org.jetbrains.annotations.NotNull d4.g r1);

    public boolean w() {
            r1 = this;
            r0 = 0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public abstract kotlin.reflect.jvm.internal.impl.name.d x(@org.jetbrains.annotations.NotNull d4.g r1);

    public abstract boolean z();
}

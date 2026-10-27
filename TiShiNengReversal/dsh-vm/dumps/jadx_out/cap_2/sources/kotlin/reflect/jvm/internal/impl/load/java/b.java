package kotlin.reflect.jvm.internal.impl.load.java;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractAnnotationTypeQualifierResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,234:1\n1#2:235\n1#2:241\n1#2:246\n1#2:268\n1761#3,3:236\n295#3,2:242\n1625#3:244\n1869#3:245\n1870#3:247\n1626#3:248\n1761#3,3:249\n1803#3,3:252\n1803#3,3:255\n1617#3,9:258\n1869#3:267\n1870#3:269\n1626#3:270\n72#4,2:239\n382#5,7:271\n*S KotlinDebug\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n*L\n42#1:241\n83#1:246\n164#1:268\n30#1:236,3\n81#1:242,2\n83#1:244\n83#1:245\n83#1:247\n83#1:248\n90#1:249,3\n126#1:252,3\n138#1:255,3\n164#1:258,9\n164#1:267\n164#1:269\n164#1:270\n42#1:239,2\n229#1:271,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class b<TAnnotation> {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.load.java.b.a c = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> d = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.load.java.d0 a;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.ConcurrentHashMap<java.lang.Object, TAnnotation> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.load.java.b$a r0 = new kotlin.reflect.jvm.internal.impl.load.java.b$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.load.java.b.c = r0
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[] r1 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.values()
            int r2 = r1.length
            r3 = 0
        L13:
            if (r3 >= r2) goto L27
            r4 = r1[r3]
            java.lang.String r5 = r4.getJavaTarget()
            java.lang.Object r6 = r0.get(r5)
            if (r6 != 0) goto L24
            r0.put(r5, r4)
        L24:
            int r3 = r3 + 1
            goto L13
        L27:
            kotlin.reflect.jvm.internal.impl.load.java.b.d = r0
            return
    }

    public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.d0 r2) {
            r1 = this;
            java.lang.String r0 = "javaTypeEnhancementState"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            java.util.concurrent.ConcurrentHashMap r2 = new java.util.concurrent.ConcurrentHashMap
            r2.<init>()
            r1.b = r2
            return
    }

    static /* synthetic */ boolean a(java.lang.Object r0) {
            boolean r0 = f(r0)
            return r0
    }

    private final java.util.Set<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> b(java.util.Set<? extends kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_USE
            boolean r0 = r3.contains(r0)
            if (r0 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType[] r0 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.values()
            java.util.Set r0 = kotlin.collections.n.Fz(r0)
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r1 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS
            java.util.Set r0 = kotlin.collections.u1.y(r0, r1)
            java.util.Set r3 = kotlin.collections.u1.C(r0, r3)
        L1a:
            return r3
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.v e(TAnnotation r10) {
            r9 = this;
            kotlin.reflect.jvm.internal.impl.load.java.v r0 = r9.u(r10)
            if (r0 == 0) goto L7
            return r0
        L7:
            kotlin.Pair r0 = r9.w(r10)
            r1 = 0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            java.lang.Object r2 = r0.component1()
            java.lang.Object r0 = r0.component2()
            r5 = r0
            java.util.Set r5 = (java.util.Set) r5
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r10 = r9.t(r10)
            if (r10 != 0) goto L24
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r10 = r9.s(r2)
        L24:
            boolean r0 = r10.isIgnore()
            if (r0 == 0) goto L2b
            return r1
        L2b:
            kotlin.reflect.jvm.internal.impl.load.java.a r0 = kotlin.reflect.jvm.internal.impl.load.java.a.a
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r0 = r9.i(r2, r0)
            if (r0 != 0) goto L34
            return r1
        L34:
            kotlin.reflect.jvm.internal.impl.load.java.v r3 = new kotlin.reflect.jvm.internal.impl.load.java.v
            boolean r10 = r10.isWarning()
            r2 = 1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j.b(r0, r1, r10, r2, r1)
            r7 = 4
            r8 = 0
            r6 = 0
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
    }

    private static final boolean f(java.lang.Object r1) {
            java.lang.String r0 = "$this$extractNullability"
            kotlin.jvm.internal.g0.p(r1, r0)
            r1 = 0
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j i(TAnnotation r4, kotlin.jvm.functions.Function1<? super TAnnotation, java.lang.Boolean> r5) {
            r3 = this;
            java.lang.Object r0 = r5.invoke(r4)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r0 = r3.q(r4, r0)
            if (r0 == 0) goto L11
            return r0
        L11:
            java.lang.Object r0 = r3.v(r4)
            r1 = 0
            if (r0 != 0) goto L19
            return r1
        L19:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r4 = r3.s(r4)
            boolean r2 = r4.isIgnore()
            if (r2 == 0) goto L24
            return r1
        L24:
            java.lang.Object r5 = r5.invoke(r0)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r5 = r3.q(r0, r5)
            if (r5 == 0) goto L3e
            boolean r4 = r4.isWarning()
            r0 = 1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r4 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j.b(r5, r1, r4, r0, r1)
            return r4
        L3e:
            return r1
    }

    private final TAnnotation j(TAnnotation r3, kotlin.reflect.jvm.internal.impl.name.c r4) {
            r2 = this;
            java.lang.Iterable r3 = r2.m(r3)
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r3.next()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r2.k(r0)
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r4)
            if (r1 == 0) goto L8
            return r0
        L1d:
            r3 = 0
            return r3
    }

    private final boolean n(TAnnotation r3, kotlin.reflect.jvm.internal.impl.name.c r4) {
            r2 = this;
            java.lang.Iterable r3 = r2.m(r3)
            boolean r0 = r3 instanceof java.util.Collection
            r1 = 0
            if (r0 == 0) goto L13
            r0 = r3
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L13
            return r1
        L13:
            java.util.Iterator r3 = r3.iterator()
        L17:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r3.next()
            kotlin.reflect.jvm.internal.impl.name.c r0 = r2.k(r0)
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r4)
            if (r0 == 0) goto L17
            r3 = 1
            return r3
        L2d:
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j q(TAnnotation r6, boolean r7) {
            r5 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r5.k(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            kotlin.reflect.jvm.internal.impl.load.java.d0 r2 = r5.a
            kotlin.jvm.functions.Function1 r2 = r2.b()
            java.lang.Object r2 = r2.invoke(r0)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r2
            boolean r3 = r2.isIgnore()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.j0.m()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            goto L8d
        L29:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.j0.n()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            goto L8d
        L36:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.j0.b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L43
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            goto L8d
        L43:
            kotlin.reflect.jvm.internal.impl.name.c r3 = kotlin.reflect.jvm.internal.impl.load.java.j0.c()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r0 == 0) goto L9c
            java.lang.Iterable r6 = r5.c(r6, r4)
            java.lang.Object r6 = kotlin.collections.f0.J2(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L7f;
                case 74175084: goto L76;
                case 433141802: goto L6a;
                case 1933739535: goto L61;
                default: goto L60;
            }
        L60:
            goto L87
        L61:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L87
            goto L8b
        L6a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L73
            goto L87
        L73:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            goto L8d
        L76:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
            goto L87
        L7f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
        L87:
            return r1
        L88:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            goto L8d
        L8b:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
        L8d:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r0 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j
            boolean r1 = r2.isWarning()
            if (r1 != 0) goto L97
            if (r7 == 0) goto L98
        L97:
            r4 = 1
        L98:
            r0.<init>(r6, r4)
            return r0
        L9c:
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r(TAnnotation r3) {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.name.c r0 = r2.k(r3)
            if (r0 == 0) goto L1d
            java.util.Map r1 = kotlin.reflect.jvm.internal.impl.load.java.w.b()
            boolean r1 = r1.containsKey(r0)
            if (r1 == 0) goto L1d
            kotlin.reflect.jvm.internal.impl.load.java.d0 r3 = r2.a
            kotlin.jvm.functions.Function1 r3 = r3.b()
            java.lang.Object r3 = r3.invoke(r0)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r3 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r3
            return r3
        L1d:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r3 = r2.s(r3)
            return r3
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel s(TAnnotation r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r0.t(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            kotlin.reflect.jvm.internal.impl.load.java.d0 r1 = r0.a
            kotlin.reflect.jvm.internal.impl.load.java.g0 r1 = r1.c()
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r1.c()
            return r1
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.ReportLevel t(TAnnotation r4) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.load.java.d0 r0 = r3.a
            kotlin.reflect.jvm.internal.impl.load.java.g0 r0 = r0.c()
            java.util.Map r0 = r0.e()
            kotlin.reflect.jvm.internal.impl.name.c r1 = r3.k(r4)
            java.lang.Object r0 = r0.get(r1)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r0
            if (r0 == 0) goto L17
            return r0
        L17:
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.load.java.j0.p()
            java.lang.Object r4 = r3.j(r4, r0)
            r0 = 0
            if (r4 == 0) goto L77
            r1 = 0
            java.lang.Iterable r4 = r3.c(r4, r1)
            if (r4 == 0) goto L77
            java.lang.Object r4 = kotlin.collections.f0.J2(r4)
            java.lang.String r4 = (java.lang.String) r4
            if (r4 != 0) goto L32
            goto L77
        L32:
            kotlin.reflect.jvm.internal.impl.load.java.d0 r1 = r3.a
            kotlin.reflect.jvm.internal.impl.load.java.g0 r1 = r1.c()
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r1 = r1.d()
            if (r1 != 0) goto L76
            int r1 = r4.hashCode()
            r2 = -2137067054(0xffffffff809ef1d2, float:-1.4596757E-38)
            if (r1 == r2) goto L6a
            r2 = -1838656823(0xffffffff926852c9, float:-7.3308333E-28)
            if (r1 == r2) goto L5e
            r2 = 2656902(0x288a86, float:3.723113E-39)
            if (r1 == r2) goto L52
            goto L72
        L52:
            java.lang.String r1 = "WARN"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L5b
            goto L72
        L5b:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r4 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.WARN
            return r4
        L5e:
            java.lang.String r1 = "STRICT"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L67
            goto L72
        L67:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r4 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.STRICT
            return r4
        L6a:
            java.lang.String r1 = "IGNORE"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L73
        L72:
            return r0
        L73:
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r4 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE
            return r4
        L76:
            return r1
        L77:
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.v u(TAnnotation r9) {
            r8 = this;
            kotlin.reflect.jvm.internal.impl.load.java.d0 r0 = r8.a
            boolean r0 = r0.a()
            r1 = 0
            if (r0 == 0) goto La
            return r1
        La:
            java.util.Map r0 = kotlin.reflect.jvm.internal.impl.load.java.w.a()
            kotlin.reflect.jvm.internal.impl.name.c r2 = r8.k(r9)
            java.lang.Object r0 = r0.get(r2)
            r2 = r0
            kotlin.reflect.jvm.internal.impl.load.java.v r2 = (kotlin.reflect.jvm.internal.impl.load.java.v) r2
            if (r2 == 0) goto L3e
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r9 = r8.r(r9)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r0 = kotlin.reflect.jvm.internal.impl.load.java.ReportLevel.IGNORE
            if (r9 == r0) goto L24
            goto L25
        L24:
            r9 = r1
        L25:
            if (r9 != 0) goto L28
            return r1
        L28:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r0 = r2.d()
            boolean r9 = r9.isWarning()
            r3 = 1
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r3 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j.b(r0, r1, r9, r3, r1)
            r6 = 6
            r7 = 0
            r4 = 0
            r5 = 0
            kotlin.reflect.jvm.internal.impl.load.java.v r9 = kotlin.reflect.jvm.internal.impl.load.java.v.b(r2, r3, r4, r5, r6, r7)
            return r9
        L3e:
            return r1
    }

    private final kotlin.Pair<TAnnotation, java.util.Set<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType>> w(TAnnotation r5) {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.load.java.d0 r0 = r4.a
            kotlin.reflect.jvm.internal.impl.load.java.g0 r0 = r0.c()
            boolean r0 = r0.f()
            r1 = 0
            if (r0 == 0) goto Le
            return r1
        Le:
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.load.java.j0.g()
            java.lang.Object r0 = r4.j(r5, r0)
            if (r0 != 0) goto L19
            return r1
        L19:
            java.lang.Iterable r5 = r4.m(r5)
            java.util.Iterator r5 = r5.iterator()
        L21:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r5.next()
            java.lang.Object r3 = r4.v(r2)
            if (r3 == 0) goto L21
            goto L33
        L32:
            r2 = r1
        L33:
            if (r2 != 0) goto L36
            return r1
        L36:
            r5 = 1
            java.lang.Iterable r5 = r4.c(r0, r5)
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L44:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L5e
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r3 = kotlin.reflect.jvm.internal.impl.load.java.b.d
            java.lang.Object r1 = r3.get(r1)
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r1 = (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType) r1
            if (r1 == 0) goto L44
            r0.add(r1)
            goto L44
        L5e:
            kotlin.Pair r5 = new kotlin.Pair
            java.util.Set r0 = r4.b(r0)
            r5.<init>(r2, r0)
            return r5
    }

    @org.jetbrains.annotations.NotNull
    protected abstract java.lang.Iterable<java.lang.String> c(@org.jetbrains.annotations.NotNull TAnnotation r1, boolean r2);

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.load.java.e0 d(@org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.load.java.e0 r10, @org.jetbrains.annotations.NotNull java.lang.Iterable<? extends TAnnotation> r11) {
            r9 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r11, r0)
            kotlin.reflect.jvm.internal.impl.load.java.d0 r0 = r9.a
            boolean r0 = r0.a()
            if (r0 == 0) goto Lf
            goto Le6
        Lf:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r11 = r11.iterator()
        L18:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L2c
            java.lang.Object r1 = r11.next()
            kotlin.reflect.jvm.internal.impl.load.java.v r1 = r9.e(r1)
            if (r1 == 0) goto L18
            r0.add(r1)
            goto L18
        L2c:
            boolean r11 = r0.isEmpty()
            if (r11 == 0) goto L34
            goto Le6
        L34:
            java.util.EnumMap r11 = new java.util.EnumMap
            java.lang.Class<kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType> r1 = kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType.class
            r11.<init>(r1)
            java.util.Iterator r0 = r0.iterator()
        L3f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto La8
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.load.java.v r2 = (kotlin.reflect.jvm.internal.impl.load.java.v) r2
            java.util.Collection r3 = r2.e()
            java.util.Iterator r3 = r3.iterator()
        L53:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L3f
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r4 = (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType) r4
            boolean r5 = r11.containsKey(r4)
            if (r5 == 0) goto La4
            boolean r5 = r9.o()
            if (r5 != 0) goto L6c
            goto La4
        L6c:
            java.lang.Object r5 = r11.get(r4)
            kotlin.reflect.jvm.internal.impl.load.java.v r5 = (kotlin.reflect.jvm.internal.impl.load.java.v) r5
            if (r5 != 0) goto L75
            goto L53
        L75:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r6 = r5.d()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r7 = r2.d()
            boolean r8 = kotlin.jvm.internal.g0.g(r7, r6)
            if (r8 == 0) goto L84
            goto La0
        L84:
            boolean r8 = r7.d()
            if (r8 == 0) goto L91
            boolean r8 = r6.d()
            if (r8 != 0) goto L91
            goto La0
        L91:
            boolean r5 = r7.d()
            if (r5 != 0) goto L9f
            boolean r5 = r6.d()
            if (r5 == 0) goto L9f
            r5 = r2
            goto La0
        L9f:
            r5 = 0
        La0:
            r11.put(r4, r5)
            goto L53
        La4:
            r11.put(r4, r2)
            goto L53
        La8:
            if (r10 == 0) goto Lb6
            java.util.EnumMap r0 = r10.b()
            if (r0 == 0) goto Lb6
            java.util.EnumMap r1 = new java.util.EnumMap
            r1.<init>(r0)
            goto Lbc
        Lb6:
            java.util.EnumMap r0 = new java.util.EnumMap
            r0.<init>(r1)
            r1 = r0
        Lbc:
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
            r0 = 0
        Lc5:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto Le4
            java.lang.Object r2 = r11.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType r3 = (kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType) r3
            java.lang.Object r2 = r2.getValue()
            kotlin.reflect.jvm.internal.impl.load.java.v r2 = (kotlin.reflect.jvm.internal.impl.load.java.v) r2
            if (r2 == 0) goto Lc5
            r1.put(r3, r2)
            r0 = 1
            goto Lc5
        Le4:
            if (r0 != 0) goto Le7
        Le6:
            return r10
        Le7:
            kotlin.reflect.jvm.internal.impl.load.java.e0 r10 = new kotlin.reflect.jvm.internal.impl.load.java.e0
            r10.<init>(r1)
            return r10
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier g(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends TAnnotation> r5) {
            r4 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        Lb:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L39
            java.lang.Object r2 = r5.next()
            kotlin.reflect.jvm.internal.impl.name.c r2 = r4.k(r2)
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.j0.o()
            boolean r3 = kotlin.collections.f0.a2(r3, r2)
            if (r3 == 0) goto L26
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.READ_ONLY
            goto L32
        L26:
            java.util.Set r3 = kotlin.reflect.jvm.internal.impl.load.java.j0.l()
            boolean r2 = kotlin.collections.f0.a2(r3, r2)
            if (r2 == 0) goto Lb
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier r2 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier.MUTABLE
        L32:
            if (r1 == 0) goto L37
            if (r1 == r2) goto L37
            return r0
        L37:
            r1 = r2
            goto Lb
        L39:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j h(@org.jetbrains.annotations.NotNull java.lang.Iterable<? extends TAnnotation> r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super TAnnotation, java.lang.Boolean> r6) {
            r4 = this;
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "forceWarning"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.util.Iterator r5 = r5.iterator()
            r0 = 0
            r1 = r0
        L10:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L46
            java.lang.Object r2 = r5.next()
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.j r2 = r4.i(r2, r6)
            if (r1 != 0) goto L21
            goto L43
        L21:
            if (r2 == 0) goto L10
            boolean r3 = kotlin.jvm.internal.g0.g(r2, r1)
            if (r3 == 0) goto L2a
            goto L10
        L2a:
            boolean r3 = r2.d()
            if (r3 == 0) goto L37
            boolean r3 = r1.d()
            if (r3 != 0) goto L37
            goto L10
        L37:
            boolean r3 = r2.d()
            if (r3 != 0) goto L45
            boolean r1 = r1.d()
            if (r1 == 0) goto L45
        L43:
            r1 = r2
            goto L10
        L45:
            return r0
        L46:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    protected abstract kotlin.reflect.jvm.internal.impl.name.c k(@org.jetbrains.annotations.NotNull TAnnotation r1);

    @org.jetbrains.annotations.NotNull
    protected abstract java.lang.Object l(@org.jetbrains.annotations.NotNull TAnnotation r1);

    @org.jetbrains.annotations.NotNull
    protected abstract java.lang.Iterable<TAnnotation> m(@org.jetbrains.annotations.NotNull TAnnotation r1);

    public abstract boolean o();

    public final boolean p(@org.jetbrains.annotations.NotNull TAnnotation r4) {
            r3 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.g0.p(r4, r0)
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.H
            java.lang.Object r4 = r3.j(r4, r0)
            r0 = 0
            if (r4 != 0) goto Lf
            return r0
        Lf:
            java.lang.Iterable r4 = r3.c(r4, r0)
            boolean r1 = r4 instanceof java.util.Collection
            if (r1 == 0) goto L21
            r1 = r4
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            if (r1 == 0) goto L21
            return r0
        L21:
            java.util.Iterator r4 = r4.iterator()
        L25:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L3b
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            java.lang.String r2 = "TYPE"
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r2)
            if (r1 == 0) goto L25
            r4 = 1
            return r4
        L3b:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final TAnnotation v(@org.jetbrains.annotations.NotNull TAnnotation r5) {
            r4 = this;
            java.lang.String r0 = "annotation"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.load.java.d0 r0 = r4.a
            kotlin.reflect.jvm.internal.impl.load.java.g0 r0 = r0.c()
            boolean r0 = r0.f()
            r1 = 0
            if (r0 == 0) goto L13
            return r1
        L13:
            java.util.Set r0 = kotlin.reflect.jvm.internal.impl.load.java.j0.a()
            kotlin.reflect.jvm.internal.impl.name.c r2 = r4.k(r5)
            boolean r0 = kotlin.collections.f0.a2(r0, r2)
            if (r0 != 0) goto L69
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.load.java.j0.f()
            boolean r0 = r4.n(r5, r0)
            if (r0 == 0) goto L2c
            goto L69
        L2c:
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.load.java.j0.h()
            boolean r0 = r4.n(r5, r0)
            if (r0 != 0) goto L37
            return r1
        L37:
            java.util.concurrent.ConcurrentHashMap<java.lang.Object, TAnnotation> r0 = r4.b
            java.lang.Object r2 = r4.l(r5)
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L68
            java.lang.Iterable r5 = r4.m(r5)
            java.util.Iterator r5 = r5.iterator()
        L4b:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L5c
            java.lang.Object r3 = r5.next()
            java.lang.Object r3 = r4.v(r3)
            if (r3 == 0) goto L4b
            goto L5d
        L5c:
            r3 = r1
        L5d:
            if (r3 != 0) goto L60
            return r1
        L60:
            java.lang.Object r5 = r0.putIfAbsent(r2, r3)
            if (r5 != 0) goto L67
            return r3
        L67:
            return r5
        L68:
            return r3
        L69:
            return r5
    }
}

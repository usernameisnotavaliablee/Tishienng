package kotlin.reflect.jvm.internal.impl.types.checker;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKotlinTypePreparator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KotlinTypePreparator.kt\norg/jetbrains/kotlin/types/checker/KotlinTypePreparator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt\n+ 5 IntersectionTypeConstructor.kt\norg/jetbrains/kotlin/types/IntersectionTypeConstructorKt$transformComponents$1\n*L\n1#1,76:1\n1#2:77\n1563#3:78\n1634#3,3:79\n1563#3:82\n1634#3,3:83\n1563#3:92\n1634#3,2:93\n1636#3:102\n98#4,6:86\n104#4:95\n105#4,5:97\n112#4,7:103\n99#5:96\n*S KotlinDebug\n*F\n+ 1 KotlinTypePreparator.kt\norg/jetbrains/kotlin/types/checker/KotlinTypePreparator\n*L\n27#1:78\n27#1:79,3\n37#1:82\n37#1:83,3\n48#1:92\n48#1:93,2\n48#1:102\n48#1:86,6\n48#1:95\n48#1:97,5\n48#1:103,7\n48#1:96\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class f extends kotlin.reflect.jvm.internal.impl.types.r {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlin.reflect.jvm.internal.impl.types.checker.f {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.reflect.jvm.internal.impl.types.checker.f.a a = null;

        static {
                kotlin.reflect.jvm.internal.impl.types.checker.f$a r0 = new kotlin.reflect.jvm.internal.impl.types.checker.f$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.types.checker.f.a.a = r0
                return
        }

        private a() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final /* synthetic */ class b extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<d4.g, kotlin.reflect.jvm.internal.impl.types.m2> {
        b(java.lang.Object r8) {
                r7 = this;
                java.lang.String r5 = "prepareType(Lorg/jetbrains/kotlin/types/model/KotlinTypeMarker;)Lorg/jetbrains/kotlin/types/UnwrappedType;"
                r6 = 0
                r1 = 1
                java.lang.Class<kotlin.reflect.jvm.internal.impl.types.checker.f> r3 = kotlin.reflect.jvm.internal.impl.types.checker.f.class
                java.lang.String r4 = "prepareType"
                r0 = r7
                r2 = r8
                r0.<init>(r1, r2, r3, r4, r5, r6)
                return
        }

        public final kotlin.reflect.jvm.internal.impl.types.m2 c(d4.g r2) {
                r1 = this;
                java.lang.String r0 = "p0"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.Object r0 = r1.receiver
                kotlin.reflect.jvm.internal.impl.types.checker.f r0 = (kotlin.reflect.jvm.internal.impl.types.checker.f) r0
                kotlin.reflect.jvm.internal.impl.types.m2 r2 = r0.b(r2)
                return r2
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.types.m2 invoke(d4.g r1) {
                r0 = this;
                d4.g r1 = (d4.g) r1
                kotlin.reflect.jvm.internal.impl.types.m2 r1 = r0.c(r1)
                return r1
        }
    }

    public f() {
            r0 = this;
            r0.<init>()
            return
    }

    private final kotlin.reflect.jvm.internal.impl.types.e1 c(kotlin.reflect.jvm.internal.impl.types.e1 r15) {
            r14 = this;
            kotlin.reflect.jvm.internal.impl.types.w1 r0 = r15.I0()
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c
            r2 = 10
            r3 = 0
            if (r1 == 0) goto L7f
            kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c r0 = (kotlin.reflect.jvm.internal.impl.resolve.calls.inference.c) r0
            kotlin.reflect.jvm.internal.impl.types.c2 r1 = r0.getProjection()
            kotlin.reflect.jvm.internal.impl.types.Variance r4 = r1.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r5 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
            if (r4 != r5) goto L1a
            goto L1b
        L1a:
            r1 = r3
        L1b:
            if (r1 == 0) goto L27
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r1.getType()
            if (r1 == 0) goto L27
            kotlin.reflect.jvm.internal.impl.types.m2 r3 = r1.L0()
        L27:
            r7 = r3
            kotlin.reflect.jvm.internal.impl.types.checker.n r1 = r0.f()
            if (r1 != 0) goto L64
            kotlin.reflect.jvm.internal.impl.types.c2 r9 = r0.getProjection()
            java.util.Collection r1 = r0.i()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r10 = new java.util.ArrayList
            int r2 = kotlin.collections.f0.d0(r1, r2)
            r10.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L45:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L59
            java.lang.Object r2 = r1.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            kotlin.reflect.jvm.internal.impl.types.m2 r2 = r2.L0()
            r10.add(r2)
            goto L45
        L59:
            kotlin.reflect.jvm.internal.impl.types.checker.n r8 = new kotlin.reflect.jvm.internal.impl.types.checker.n
            r11 = 0
            r12 = 4
            r13 = 0
            r8.<init>(r9, r10, r11, r12, r13)
            r0.h(r8)
        L64:
            kotlin.reflect.jvm.internal.impl.types.checker.i r4 = new kotlin.reflect.jvm.internal.impl.types.checker.i
            kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus r5 = kotlin.reflect.jvm.internal.impl.types.model.CaptureStatus.FOR_SUBTYPING
            kotlin.reflect.jvm.internal.impl.types.checker.n r6 = r0.f()
            kotlin.jvm.internal.g0.m(r6)
            kotlin.reflect.jvm.internal.impl.types.t1 r8 = r15.H0()
            boolean r9 = r15.J0()
            r11 = 32
            r12 = 0
            r10 = 0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
            return r4
        L7f:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.resolve.constants.s
            r4 = 0
            if (r1 == 0) goto Lcc
            kotlin.reflect.jvm.internal.impl.resolve.constants.s r0 = (kotlin.reflect.jvm.internal.impl.resolve.constants.s) r0
            java.util.Collection r0 = r0.i()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L99:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto Lb6
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            boolean r3 = r15.J0()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = kotlin.reflect.jvm.internal.impl.types.j2.p(r2, r3)
            java.lang.String r3 = "makeNullableAsSpecified(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            r1.add(r2)
            goto L99
        Lb6:
            kotlin.reflect.jvm.internal.impl.types.s0 r0 = new kotlin.reflect.jvm.internal.impl.types.s0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.t1 r1 = r15.H0()
            java.util.List r2 = kotlin.collections.f0.J()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r15 = r15.r()
            kotlin.reflect.jvm.internal.impl.types.e1 r15 = kotlin.reflect.jvm.internal.impl.types.w0.o(r1, r0, r2, r4, r15)
            return r15
        Lcc:
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.types.s0
            if (r1 == 0) goto L11e
            boolean r1 = r15.J0()
            if (r1 == 0) goto L11e
            kotlin.reflect.jvm.internal.impl.types.s0 r0 = (kotlin.reflect.jvm.internal.impl.types.s0) r0
            java.util.Collection r15 = r0.i()
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = kotlin.collections.f0.d0(r15, r2)
            r1.<init>(r2)
            java.util.Iterator r15 = r15.iterator()
        Leb:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L100
            java.lang.Object r2 = r15.next()
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = (kotlin.reflect.jvm.internal.impl.types.t0) r2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.C(r2)
            r1.add(r2)
            r4 = 1
            goto Leb
        L100:
            if (r4 != 0) goto L103
            goto L116
        L103:
            kotlin.reflect.jvm.internal.impl.types.t0 r15 = r0.l()
            if (r15 == 0) goto L10d
            kotlin.reflect.jvm.internal.impl.types.t0 r3 = kotlin.reflect.jvm.internal.impl.types.typeUtil.e.C(r15)
        L10d:
            kotlin.reflect.jvm.internal.impl.types.s0 r15 = new kotlin.reflect.jvm.internal.impl.types.s0
            r15.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.s0 r3 = r15.s(r3)
        L116:
            if (r3 != 0) goto L119
            goto L11a
        L119:
            r0 = r3
        L11a:
            kotlin.reflect.jvm.internal.impl.types.e1 r15 = r0.j()
        L11e:
            return r15
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.r
    public /* bridge */ /* synthetic */ d4.g a(d4.g r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.types.m2 r1 = r0.b(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.m2 b(@org.jetbrains.annotations.NotNull d4.g r5) {
            r4 = this;
            java.lang.String r0 = "type"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.types.t0
            if (r0 == 0) goto L55
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = (kotlin.reflect.jvm.internal.impl.types.t0) r5
            kotlin.reflect.jvm.internal.impl.types.m2 r5 = r5.L0()
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.types.e1
            if (r0 == 0) goto L1b
            r0 = r5
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = (kotlin.reflect.jvm.internal.impl.types.e1) r0
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r4.c(r0)
            goto L45
        L1b:
            boolean r0 = r5 instanceof kotlin.reflect.jvm.internal.impl.types.k0
            if (r0 == 0) goto L4f
            r0 = r5
            kotlin.reflect.jvm.internal.impl.types.k0 r0 = (kotlin.reflect.jvm.internal.impl.types.k0) r0
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r0.Q0()
            kotlin.reflect.jvm.internal.impl.types.e1 r1 = r4.c(r1)
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r0.R0()
            kotlin.reflect.jvm.internal.impl.types.e1 r2 = r4.c(r2)
            kotlin.reflect.jvm.internal.impl.types.e1 r3 = r0.Q0()
            if (r1 != r3) goto L41
            kotlin.reflect.jvm.internal.impl.types.e1 r0 = r0.R0()
            if (r2 == r0) goto L3f
            goto L41
        L3f:
            r0 = r5
            goto L45
        L41:
            kotlin.reflect.jvm.internal.impl.types.m2 r0 = kotlin.reflect.jvm.internal.impl.types.w0.e(r1, r2)
        L45:
            kotlin.reflect.jvm.internal.impl.types.checker.f$b r1 = new kotlin.reflect.jvm.internal.impl.types.checker.f$b
            r1.<init>(r4)
            kotlin.reflect.jvm.internal.impl.types.m2 r5 = kotlin.reflect.jvm.internal.impl.types.l2.c(r0, r5, r1)
            return r5
        L4f:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L55:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r5.<init>(r0)
            throw r5
    }
}

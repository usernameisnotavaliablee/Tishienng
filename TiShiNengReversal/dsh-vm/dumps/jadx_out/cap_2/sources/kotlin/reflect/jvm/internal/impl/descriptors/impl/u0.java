package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nValueParameterDescriptorImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ValueParameterDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ValueParameterDescriptorImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,134:1\n1563#2:135\n1634#2,3:136\n*S KotlinDebug\n*F\n+ 1 ValueParameterDescriptorImpl.kt\norg/jetbrains/kotlin/descriptors/impl/ValueParameterDescriptorImpl\n*L\n129#1:135\n129#1:136,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class u0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.w0 implements kotlin.reflect.jvm.internal.impl.descriptors.q1 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.u0.a m = null;
    private final int g;
    private final boolean h;
    private final boolean i;
    private final boolean j;

    @org.jetbrains.annotations.Nullable
    private final kotlin.reflect.jvm.internal.impl.types.t0 k;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.q1 l;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
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

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r15, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.q1 r16, int r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r18, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r19, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r20, boolean r21, boolean r22, boolean r23, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r24, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r25, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.s1>> r26) {
                r14 = this;
                java.lang.String r0 = "containingDeclaration"
                kotlin.jvm.internal.g0.p(r15, r0)
                java.lang.String r0 = "annotations"
                r5 = r18
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "name"
                r6 = r19
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "outType"
                r7 = r20
                kotlin.jvm.internal.g0.p(r7, r0)
                java.lang.String r0 = "source"
                r12 = r25
                kotlin.jvm.internal.g0.p(r12, r0)
                if (r26 != 0) goto L36
                kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u0
                r2 = r15
                r3 = r16
                r4 = r17
                r8 = r21
                r9 = r22
                r10 = r23
                r11 = r24
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r1
            L36:
                kotlin.reflect.jvm.internal.impl.descriptors.impl.u0$b r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u0$b
                r2 = r15
                r3 = r16
                r4 = r17
                r5 = r18
                r6 = r19
                r7 = r20
                r8 = r21
                r9 = r22
                r10 = r23
                r11 = r24
                r12 = r25
                r13 = r26
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 {

        @org.jetbrains.annotations.NotNull
        private final kotlin.s n;

        public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r2, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.q1 r3, int r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r6, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r7, boolean r8, boolean r9, boolean r10, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r12, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.s1>> r13) {
                r1 = this;
                java.lang.String r0 = "containingDeclaration"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "annotations"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.lang.String r0 = "outType"
                kotlin.jvm.internal.g0.p(r7, r0)
                java.lang.String r0 = "source"
                kotlin.jvm.internal.g0.p(r12, r0)
                java.lang.String r0 = "destructuringVariables"
                kotlin.jvm.internal.g0.p(r13, r0)
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                r2 = r1
                kotlin.s r3 = kotlin.t.c(r13)
                r2.n = r3
                return
        }

        static /* synthetic */ java.util.List J0(kotlin.reflect.jvm.internal.impl.descriptors.impl.u0.b r0) {
                java.util.List r0 = K0(r0)
                return r0
        }

        private static final java.util.List K0(kotlin.reflect.jvm.internal.impl.descriptors.impl.u0.b r0) {
                java.util.List r0 = r0.L0()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.u0, kotlin.reflect.jvm.internal.impl.descriptors.q1
        @org.jetbrains.annotations.NotNull
        public kotlin.reflect.jvm.internal.impl.descriptors.q1 I(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r16, int r17) {
                r14 = this;
                java.lang.String r0 = "newOwner"
                kotlin.jvm.internal.g0.p(r15, r0)
                java.lang.String r0 = "newName"
                r6 = r16
                kotlin.jvm.internal.g0.p(r6, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.impl.u0$b r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u0$b
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5 = r14.getAnnotations()
                java.lang.String r0 = "<get-annotations>(...)"
                kotlin.jvm.internal.g0.o(r5, r0)
                kotlin.reflect.jvm.internal.impl.types.t0 r7 = r14.getType()
                java.lang.String r0 = "getType(...)"
                kotlin.jvm.internal.g0.o(r7, r0)
                boolean r8 = r14.Q()
                boolean r9 = r14.w0()
                boolean r10 = r14.u0()
                kotlin.reflect.jvm.internal.impl.types.t0 r11 = r14.z0()
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r12 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
                java.lang.String r0 = "NO_SOURCE"
                kotlin.jvm.internal.g0.o(r12, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.impl.v0 r13 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.v0
                r13.<init>(r14)
                r3 = 0
                r2 = r15
                r4 = r17
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<kotlin.reflect.jvm.internal.impl.descriptors.s1> L0() {
                r1 = this;
                kotlin.s r0 = r1.n
                java.lang.Object r0 = r0.getValue()
                java.util.List r0 = (java.util.List) r0
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0.m = r0
            return
    }

    public u0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r7, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.q1 r8, int r9, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r11, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r12, boolean r13, boolean r14, boolean r15, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r17) {
            r6 = this;
            java.lang.String r0 = "containingDeclaration"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "annotations"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "outType"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "source"
            r5 = r17
            kotlin.jvm.internal.g0.p(r5, r0)
            r0 = r6
            r1 = r7
            r2 = r10
            r3 = r11
            r4 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r6.g = r9
            r6.h = r13
            r6.i = r14
            r6.j = r15
            r1 = r16
            r6.k = r1
            if (r8 != 0) goto L33
            r1 = r6
            goto L34
        L33:
            r1 = r8
        L34:
            r6.l = r1
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 G0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r13, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.q1 r14, int r15, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r16, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r17, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r18, boolean r19, boolean r20, boolean r21, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.types.t0 r22, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r23, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function0<? extends java.util.List<? extends kotlin.reflect.jvm.internal.impl.descriptors.s1>> r24) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.impl.u0.m
            r1 = r13
            r2 = r14
            r3 = r15
            r4 = r16
            r5 = r17
            r6 = r18
            r7 = r19
            r8 = r20
            r9 = r21
            r10 = r22
            r11 = r23
            r12 = r24
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r13 = r0.a(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r13
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s1
    public boolean B0() {
            r1 = this;
            boolean r0 = kotlin.reflect.jvm.internal.impl.descriptors.q1.a.a(r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s1
    public boolean C() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.s1 E0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = r1.a()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Void H0() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q1
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.q1 I(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.a r14, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r15, int r16) {
            r13 = this;
            java.lang.String r0 = "newOwner"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "newName"
            kotlin.jvm.internal.g0.p(r15, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5 = r13.getAnnotations()
            java.lang.String r0 = "<get-annotations>(...)"
            kotlin.jvm.internal.g0.o(r5, r0)
            kotlin.reflect.jvm.internal.impl.types.t0 r7 = r13.getType()
            java.lang.String r0 = "getType(...)"
            kotlin.jvm.internal.g0.o(r7, r0)
            boolean r8 = r13.Q()
            boolean r9 = r13.w0()
            boolean r10 = r13.u0()
            kotlin.reflect.jvm.internal.impl.types.t0 r11 = r13.z0()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r12 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            java.lang.String r0 = "NO_SOURCE"
            kotlin.jvm.internal.g0.o(r12, r0)
            r3 = 0
            r2 = r14
            r6 = r15
            r4 = r16
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.q1 I0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r2) {
            r1 = this;
            java.lang.String r0 = "substitutor"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r2 = r2.k()
            if (r2 == 0) goto Lc
            return r1
        Lc:
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            r2.<init>()
            throw r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q1
    public boolean Q() {
            r2 = this;
            boolean r0 = r2.h
            if (r0 == 0) goto L1b
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = r2.b()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableMemberDescriptor"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r0 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r0
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r0 = r0.h()
            boolean r0 = r0.isReal()
            if (r0 == 0) goto L1b
            r0 = 1
            return r0
        L1b:
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R W(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> r2, D r3) {
            r1 = this;
            java.lang.String r0 = "visitor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Object r2 = r2.e(r1, r3)
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.q1 a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = r1.l
            if (r0 != r1) goto L5
            return r1
        L5:
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = r0.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.k
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.a b() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.k r0 = super.b()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.CallableDescriptor"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = r1.b()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.g1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l c(kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r1 = r0.I0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.g1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.s1 c(kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r1 = r0.I0(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.q1> e() {
            r4 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.a r0 = r4.b()
            java.util.Collection r0 = r0.e()
            java.lang.String r1 = "getOverriddenDescriptors(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L1e:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3c
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.a r2 = (kotlin.reflect.jvm.internal.impl.descriptors.a) r2
            java.util.List r2 = r2.g()
            int r3 = r4.getIndex()
            java.lang.Object r2 = r2.get(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r2
            r1.add(r2)
            goto L1e
        L3c:
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q1
    public int getIndex() {
            r1 = this;
            int r0 = r1.g
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.o
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.s getVisibility() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.s r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.f
            java.lang.String r1 = "LOCAL"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.w0, kotlin.reflect.jvm.internal.impl.descriptors.impl.n
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n p0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r0 = r1.a()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.constants.g t0() {
            r1 = this;
            java.lang.Void r0 = r1.H0()
            kotlin.reflect.jvm.internal.impl.resolve.constants.g r0 = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) r0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q1
    public boolean u0() {
            r1 = this;
            boolean r0 = r1.j
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q1
    public boolean w0() {
            r1 = this;
            boolean r0 = r1.i
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.q1
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.t0 z0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r1.k
            return r0
    }
}

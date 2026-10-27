package kotlin.reflect.jvm.internal.impl.descriptors.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeAliasConstructorDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1#2:239\n1563#3:240\n1634#3,3:241\n*S KotlinDebug\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl\n*L\n87#1:240\n87#1:241,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class s0 extends kotlin.reflect.jvm.internal.impl.descriptors.impl.s implements kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.descriptors.impl.s0.a I = null;
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] J = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.n E;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.i1 F;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.storage.j G;

    @org.jetbrains.annotations.NotNull
    private kotlin.reflect.jvm.internal.impl.descriptors.c H;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeAliasConstructorDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,238:1\n1573#2:239\n1604#2,4:240\n*S KotlinDebug\n*F\n+ 1 TypeAliasConstructorDescriptor.kt\norg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptorImpl$Companion\n*L\n209#1:239\n209#1:240,4\n*E\n"})
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

        public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.h2 a(kotlin.reflect.jvm.internal.impl.descriptors.impl.s0.a r0, kotlin.reflect.jvm.internal.impl.descriptors.i1 r1) {
                kotlin.reflect.jvm.internal.impl.types.h2 r0 = r0.c(r1)
                return r0
        }

        private final kotlin.reflect.jvm.internal.impl.types.h2 c(kotlin.reflect.jvm.internal.impl.descriptors.i1 r2) {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r2.m()
                if (r0 != 0) goto L8
                r2 = 0
                return r2
            L8:
                kotlin.reflect.jvm.internal.impl.types.e1 r2 = r2.Z()
                kotlin.reflect.jvm.internal.impl.types.h2 r2 = kotlin.reflect.jvm.internal.impl.types.h2.f(r2)
                return r2
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.storage.n r23, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.i1 r24, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.c r25) {
                r22 = this;
                r2 = r24
                r9 = r25
                java.lang.String r0 = "storageManager"
                r1 = r23
                kotlin.jvm.internal.g0.p(r1, r0)
                java.lang.String r0 = "typeAliasDescriptor"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "constructor"
                kotlin.jvm.internal.g0.p(r9, r0)
                r10 = r22
                kotlin.reflect.jvm.internal.impl.types.h2 r11 = r10.c(r2)
                r12 = 0
                if (r11 != 0) goto L1f
                return r12
            L1f:
                kotlin.reflect.jvm.internal.impl.descriptors.c r3 = r9.c(r11)
                if (r3 != 0) goto L26
                return r12
            L26:
                kotlin.reflect.jvm.internal.impl.descriptors.impl.s0 r13 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.s0
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5 = r9.getAnnotations()
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = r9.h()
                java.lang.String r0 = "getKind(...)"
                kotlin.jvm.internal.g0.o(r6, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = r2.getSource()
                java.lang.String r0 = "getSource(...)"
                kotlin.jvm.internal.g0.o(r7, r0)
                r8 = 0
                r4 = 0
                r0 = r13
                r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
                java.util.List r0 = r9.g()
                java.util.List r18 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s.J0(r13, r0, r11)
                if (r18 != 0) goto L4f
                return r12
            L4f:
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = r3.getReturnType()
                kotlin.reflect.jvm.internal.impl.types.m2 r0 = r0.L0()
                kotlin.reflect.jvm.internal.impl.types.e1 r0 = kotlin.reflect.jvm.internal.impl.types.n0.c(r0)
                kotlin.reflect.jvm.internal.impl.types.e1 r1 = r24.s()
                java.lang.String r2 = "getDefaultType(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                kotlin.reflect.jvm.internal.impl.types.e1 r19 = kotlin.reflect.jvm.internal.impl.types.i1.j(r0, r1)
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r0 = r9.c0()
                if (r0 == 0) goto L82
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = r0.getType()
                kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                kotlin.reflect.jvm.internal.impl.types.t0 r0 = r11.n(r0, r1)
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r1 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r1 = r1.b()
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r12 = kotlin.reflect.jvm.internal.impl.resolve.h.i(r13, r0, r1)
            L82:
                r14 = r12
                kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r24.m()
                if (r0 == 0) goto Le2
                java.util.List r1 = r9.A0()
                java.lang.String r2 = "getContextReceiverParameters(...)"
                kotlin.jvm.internal.g0.o(r1, r2)
                java.lang.Iterable r1 = (java.lang.Iterable) r1
                java.util.ArrayList r2 = new java.util.ArrayList
                r3 = 10
                int r3 = kotlin.collections.f0.d0(r1, r3)
                r2.<init>(r3)
                java.util.Iterator r1 = r1.iterator()
                r3 = 0
            La4:
                boolean r4 = r1.hasNext()
                if (r4 == 0) goto Ldf
                java.lang.Object r4 = r1.next()
                int r5 = r3 + 1
                if (r3 >= 0) goto Lb5
                kotlin.collections.f0.b0()
            Lb5:
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.z0) r4
                kotlin.reflect.jvm.internal.impl.types.t0 r6 = r4.getType()
                kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
                kotlin.reflect.jvm.internal.impl.types.t0 r6 = r11.n(r6, r7)
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h r4 = r4.getValue()
                java.lang.String r7 = "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver"
                kotlin.jvm.internal.g0.n(r4, r7)
                kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f r4 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.f) r4
                kotlin.reflect.jvm.internal.impl.name.f r4 = r4.a()
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r7 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r7 = r7.b()
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r3 = kotlin.reflect.jvm.internal.impl.resolve.h.c(r0, r6, r4, r7, r3)
                r2.add(r3)
                r3 = r5
                goto La4
            Ldf:
                r16 = r2
                goto Le7
            Le2:
                java.util.List r2 = kotlin.collections.f0.J()
                goto Ldf
            Le7:
                java.util.List r17 = r24.t()
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r20 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
                kotlin.reflect.jvm.internal.impl.descriptors.s r21 = r24.getVisibility()
                r15 = 0
                r13.M0(r14, r15, r16, r17, r18, r19, r20, r21)
                return r13
        }
    }

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.descriptors.impl.s0> r1 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s0.class
            java.lang.String r2 = "withDispatchReceiver"
            java.lang.String r3 = "getWithDispatchReceiver()Lorg/jetbrains/kotlin/descriptors/impl/TypeAliasConstructorDescriptor;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            r1 = 1
            kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
            r1[r4] = r0
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s0.J = r1
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s0$a r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.s0$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s0.I = r0
            return
    }

    private s0(kotlin.reflect.jvm.internal.impl.storage.n r8, kotlin.reflect.jvm.internal.impl.descriptors.i1 r9, kotlin.reflect.jvm.internal.impl.descriptors.c r10, kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r11, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r12, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r13, kotlin.reflect.jvm.internal.impl.descriptors.e1 r14) {
            r7 = this;
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.h.j
            r0 = r7
            r1 = r9
            r2 = r11
            r3 = r12
            r5 = r13
            r6 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6)
            r0.E = r8
            r0.F = r1
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r9 = r7.k1()
            boolean r9 = r9.i0()
            r7.Q0(r9)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.r0 r9 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.r0
            r9.<init>(r7, r10)
            kotlin.reflect.jvm.internal.impl.storage.j r8 = r8.g(r9)
            r0.G = r8
            r0.H = r10
            return
    }

    public /* synthetic */ s0(kotlin.reflect.jvm.internal.impl.storage.n r1, kotlin.reflect.jvm.internal.impl.descriptors.i1 r2, kotlin.reflect.jvm.internal.impl.descriptors.c r3, kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r4, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r6, kotlin.reflect.jvm.internal.impl.descriptors.e1 r7, kotlin.jvm.internal.v r8) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.s0 f1(kotlin.reflect.jvm.internal.impl.descriptors.impl.s0 r0, kotlin.reflect.jvm.internal.impl.descriptors.c r1) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s0 r0 = m1(r0, r1)
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.impl.s0 m1(kotlin.reflect.jvm.internal.impl.descriptors.impl.s0 r9, kotlin.reflect.jvm.internal.impl.descriptors.c r10) {
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.s0
            kotlin.reflect.jvm.internal.impl.storage.n r1 = r9.E
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = r9.k1()
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5 = r10.getAnnotations()
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = r10.h()
            java.lang.String r3 = "getKind(...)"
            kotlin.jvm.internal.g0.o(r6, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r3 = r9.k1()
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = r3.getSource()
            java.lang.String r3 = "getSource(...)"
            kotlin.jvm.internal.g0.o(r7, r3)
            r4 = r9
            r3 = r10
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s0$a r9 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s0.I
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r10 = r4.k1()
            kotlin.reflect.jvm.internal.impl.types.h2 r9 = kotlin.reflect.jvm.internal.impl.descriptors.impl.s0.a.a(r9, r10)
            r10 = 0
            if (r9 != 0) goto L35
            return r10
        L35:
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = r3.c0()
            if (r1 == 0) goto L3f
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r10 = r1.c(r9)
        L3f:
            r2 = r10
            java.util.List r10 = r3.A0()
            java.lang.String r1 = "getContextReceiverParameters(...)"
            kotlin.jvm.internal.g0.o(r10, r1)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r3 = new java.util.ArrayList
            r1 = 10
            int r1 = kotlin.collections.f0.d0(r10, r1)
            r3.<init>(r1)
            java.util.Iterator r10 = r10.iterator()
        L5a:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L6e
            java.lang.Object r1 = r10.next()
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.z0) r1
            kotlin.reflect.jvm.internal.impl.descriptors.z0 r1 = r1.c(r9)
            r3.add(r1)
            goto L5a
        L6e:
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r9 = r4.k1()
            java.util.List r9 = r9.t()
            java.util.List r5 = r4.g()
            kotlin.reflect.jvm.internal.impl.types.t0 r6 = r4.getReturnType()
            kotlin.reflect.jvm.internal.impl.descriptors.Modality r7 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.FINAL
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r10 = r4.k1()
            kotlin.reflect.jvm.internal.impl.descriptors.s r8 = r10.getVisibility()
            r1 = 0
            r4 = r9
            r0.M0(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.q0
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.c F() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r1.H
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y F0(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, kotlin.reflect.jvm.internal.impl.descriptors.s r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r4, boolean r5) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r1 = r0.g1(r1, r2, r3, r4, r5)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.impl.s G0(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.y r2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r3, kotlin.reflect.jvm.internal.impl.name.f r4, kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5, kotlin.reflect.jvm.internal.impl.descriptors.e1 r6) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s0 r1 = r0.h1(r1, r2, r3, r4, r5, r6)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.d J() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r2.F()
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.J()
            java.lang.String r1 = "getConstructedClass(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r0 = r1.j1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.a a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r0 = r1.j1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r0 = r1.j1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.impl.m, kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y a() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r0 = r1.j1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.g b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = r1.i1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.n, kotlin.reflect.jvm.internal.impl.descriptors.k
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.k b() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = r1.i1()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.g1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.j c(kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r1 = r0.l1(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.g1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.l c(kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r1 = r0.l1(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.y, kotlin.reflect.jvm.internal.impl.descriptors.g1
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.y c(kotlin.reflect.jvm.internal.impl.types.h2 r1) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r1 = r0.l1(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor e0(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.descriptors.Modality r2, kotlin.reflect.jvm.internal.impl.descriptors.s r3, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r4, boolean r5) {
            r0 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r1 = r0.g1(r1, r2, r3, r4, r5)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 g1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.Modality r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.s r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r5, boolean r6) {
            r1 = this;
            java.lang.String r0 = "newOwner"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "modality"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "visibility"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = "kind"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r0 = r1.n()
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r0.r(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r2.q(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r2.p(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r2.s(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.y$a r2 = r2.j(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.y r2 = r2.build()
            java.lang.String r3 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor"
            kotlin.jvm.internal.g0.n(r2, r3)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.q0) r2
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.a
    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.types.t0 getReturnType() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = super.getReturnType()
            kotlin.jvm.internal.g0.m(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.s0 h1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r9, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r10, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r11, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r12, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r13, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r14) {
            r8 = this;
            java.lang.String r10 = "newOwner"
            kotlin.jvm.internal.g0.p(r9, r10)
            java.lang.String r9 = "kind"
            kotlin.jvm.internal.g0.p(r11, r9)
            java.lang.String r9 = "annotations"
            kotlin.jvm.internal.g0.p(r13, r9)
            java.lang.String r9 = "source"
            kotlin.jvm.internal.g0.p(r14, r9)
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r6 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
            if (r11 == r6) goto L1a
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r9 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.SYNTHESIZED
        L1a:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s0 r0 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.s0
            kotlin.reflect.jvm.internal.impl.storage.n r1 = r8.E
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r2 = r8.k1()
            kotlin.reflect.jvm.internal.impl.descriptors.c r3 = r8.F()
            r4 = r8
            r5 = r13
            r7 = r14
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.i1 i1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = r1.k1()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 j1() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.y r0 = super.a()
            java.lang.String r1 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptor"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r0 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.q0) r0
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.reflect.jvm.internal.impl.descriptors.i1 k1() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.i1 r0 = r1.F
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 l1(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.h2 r3) {
            r2 = this;
            java.lang.String r0 = "substitutor"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y r3 = super.c(r3)
            java.lang.String r0 = "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.impl.TypeAliasConstructorDescriptorImpl"
            kotlin.jvm.internal.g0.n(r3, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s0 r3 = (kotlin.reflect.jvm.internal.impl.descriptors.impl.s0) r3
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r3.getReturnType()
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = kotlin.reflect.jvm.internal.impl.types.h2.f(r0)
            java.lang.String r1 = "create(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            kotlin.reflect.jvm.internal.impl.descriptors.c r1 = r2.F()
            kotlin.reflect.jvm.internal.impl.descriptors.c r1 = r1.a()
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r1.c(r0)
            if (r0 != 0) goto L2d
            r3 = 0
            return r3
        L2d:
            r3.H = r0
            return r3
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j
    public boolean m0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.c r0 = r1.F()
            boolean r0 = r0.m0()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.impl.n
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.n p0() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.impl.q0 r0 = r1.j1()
            return r0
    }
}

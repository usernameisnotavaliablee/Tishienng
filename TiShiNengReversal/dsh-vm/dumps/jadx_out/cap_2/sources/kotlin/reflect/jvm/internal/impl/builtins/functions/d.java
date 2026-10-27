package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFunctionInvokeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n2746#2,3:162\n1563#2:165\n1634#2,3:166\n1740#2,3:169\n1563#2:172\n1634#2,3:173\n1761#2,3:176\n*S KotlinDebug\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor\n*L\n63#1:162,3\n64#1:165\n64#1:166,3\n88#1:169,3\n92#1:172\n92#1:173,3\n106#1:176,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class d extends kotlin.reflect.jvm.internal.impl.descriptors.impl.o0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.d.a E = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFunctionInvokeDescriptor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor$Factory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,161:1\n967#2,7:162\n1563#2:169\n1634#2,3:170\n*S KotlinDebug\n*F\n+ 1 FunctionInvokeDescriptor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionInvokeDescriptor$Factory\n*L\n122#1:162,7\n124#1:169\n124#1:170,3\n*E\n"})
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

        private final kotlin.reflect.jvm.internal.impl.descriptors.q1 b(kotlin.reflect.jvm.internal.impl.builtins.functions.d r14, int r15, kotlin.reflect.jvm.internal.impl.descriptors.j1 r16) {
                r13 = this;
                kotlin.reflect.jvm.internal.impl.name.f r0 = r16.getName()
                java.lang.String r0 = r0.b()
                java.lang.String r1 = "asString(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                java.lang.String r1 = "T"
                boolean r1 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r1 == 0) goto L18
                java.lang.String r0 = "instance"
                goto L2e
            L18:
                java.lang.String r1 = "E"
                boolean r1 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r1 == 0) goto L23
                java.lang.String r0 = "receiver"
                goto L2e
            L23:
                java.util.Locale r1 = java.util.Locale.ROOT
                java.lang.String r0 = r0.toLowerCase(r1)
                java.lang.String r1 = "toLowerCase(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
            L2e:
                kotlin.reflect.jvm.internal.impl.descriptors.impl.u0 r1 = new kotlin.reflect.jvm.internal.impl.descriptors.impl.u0
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r2 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
                kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5 = r2.b()
                kotlin.reflect.jvm.internal.impl.name.f r6 = kotlin.reflect.jvm.internal.impl.name.f.h(r0)
                java.lang.String r0 = "identifier(...)"
                kotlin.jvm.internal.g0.o(r6, r0)
                kotlin.reflect.jvm.internal.impl.types.e1 r7 = r16.s()
                java.lang.String r0 = "getDefaultType(...)"
                kotlin.jvm.internal.g0.o(r7, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.e1 r12 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
                java.lang.String r0 = "NO_SOURCE"
                kotlin.jvm.internal.g0.o(r12, r0)
                r3 = 0
                r8 = 0
                r9 = 0
                r10 = 0
                r11 = 0
                r2 = r14
                r4 = r15
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.builtins.functions.d a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.functions.b r11, boolean r12) {
                r10 = this;
                java.lang.String r0 = "functionClass"
                kotlin.jvm.internal.g0.p(r11, r0)
                java.util.List r0 = r11.t()
                kotlin.reflect.jvm.internal.impl.builtins.functions.d r1 = new kotlin.reflect.jvm.internal.impl.builtins.functions.d
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r4 = kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind.DECLARATION
                r6 = 0
                r3 = 0
                r2 = r11
                r5 = r12
                r1.<init>(r2, r3, r4, r5, r6)
                kotlin.reflect.jvm.internal.impl.descriptors.z0 r3 = r2.V()
                java.util.List r4 = kotlin.collections.f0.J()
                java.util.List r5 = kotlin.collections.f0.J()
                r11 = r0
                java.lang.Iterable r11 = (java.lang.Iterable) r11
                java.util.ArrayList r12 = new java.util.ArrayList
                r12.<init>()
                java.util.Iterator r11 = r11.iterator()
            L2c:
                boolean r2 = r11.hasNext()
                if (r2 == 0) goto L45
                java.lang.Object r2 = r11.next()
                r6 = r2
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r6 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r6
                kotlin.reflect.jvm.internal.impl.types.Variance r6 = r6.l()
                kotlin.reflect.jvm.internal.impl.types.Variance r7 = kotlin.reflect.jvm.internal.impl.types.Variance.IN_VARIANCE
                if (r6 != r7) goto L45
                r12.add(r2)
                goto L2c
            L45:
                java.lang.Iterable r11 = kotlin.collections.f0.m6(r12)
                java.util.ArrayList r6 = new java.util.ArrayList
                r12 = 10
                int r12 = kotlin.collections.f0.d0(r11, r12)
                r6.<init>(r12)
                java.util.Iterator r11 = r11.iterator()
            L58:
                boolean r12 = r11.hasNext()
                if (r12 == 0) goto L78
                java.lang.Object r12 = r11.next()
                kotlin.collections.a1 r12 = (kotlin.collections.a1) r12
                kotlin.reflect.jvm.internal.impl.builtins.functions.d$a r2 = kotlin.reflect.jvm.internal.impl.builtins.functions.d.E
                int r7 = r12.e()
                java.lang.Object r12 = r12.f()
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r12 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r12
                kotlin.reflect.jvm.internal.impl.descriptors.q1 r12 = r2.b(r1, r7, r12)
                r6.add(r12)
                goto L58
            L78:
                java.lang.Object r11 = kotlin.collections.f0.u3(r0)
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r11 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r11
                kotlin.reflect.jvm.internal.impl.types.e1 r7 = r11.s()
                kotlin.reflect.jvm.internal.impl.descriptors.Modality r8 = kotlin.reflect.jvm.internal.impl.descriptors.Modality.ABSTRACT
                kotlin.reflect.jvm.internal.impl.descriptors.s r9 = kotlin.reflect.jvm.internal.impl.descriptors.r.e
                r2 = 0
                r1.i1(r2, r3, r4, r5, r6, r7, r8, r9)
                r11 = 1
                r1.U0(r11)
                return r1
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.builtins.functions.d$a r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.d$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.builtins.functions.d.E = r0
            return
    }

    private d(kotlin.reflect.jvm.internal.impl.descriptors.k r9, kotlin.reflect.jvm.internal.impl.builtins.functions.d r10, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r11, boolean r12) {
            r8 = this;
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g$a r0 = kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.q0
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r4 = r0.b()
            kotlin.reflect.jvm.internal.impl.name.f r5 = kotlin.reflect.jvm.internal.impl.util.t.i
            kotlin.reflect.jvm.internal.impl.descriptors.e1 r7 = kotlin.reflect.jvm.internal.impl.descriptors.e1.a
            r1 = r8
            r2 = r9
            r3 = r10
            r6 = r11
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r9 = 1
            r8.a1(r9)
            r8.c1(r12)
            r9 = 0
            r8.T0(r9)
            return
    }

    public /* synthetic */ d(kotlin.reflect.jvm.internal.impl.descriptors.k r1, kotlin.reflect.jvm.internal.impl.builtins.functions.d r2, kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r3, boolean r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            return
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.y k1(java.util.List<kotlin.reflect.jvm.internal.impl.name.f> r9) {
            r8 = this;
            java.util.List r0 = r8.g()
            int r0 = r0.size()
            int r1 = r9.size()
            int r0 = r0 - r1
            r1 = 1
            java.lang.String r2 = "getValueParameters(...)"
            if (r0 != 0) goto L5a
            r3 = r9
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.List r4 = r8.g()
            kotlin.jvm.internal.g0.o(r4, r2)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.List r3 = kotlin.collections.f0.o6(r3, r4)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            boolean r4 = r3 instanceof java.util.Collection
            if (r4 == 0) goto L32
            r4 = r3
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L32
            return r8
        L32:
            java.util.Iterator r3 = r3.iterator()
        L36:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L59
            java.lang.Object r4 = r3.next()
            kotlin.Pair r4 = (kotlin.Pair) r4
            java.lang.Object r5 = r4.component1()
            kotlin.reflect.jvm.internal.impl.name.f r5 = (kotlin.reflect.jvm.internal.impl.name.f) r5
            java.lang.Object r4 = r4.component2()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r4
            kotlin.reflect.jvm.internal.impl.name.f r4 = r4.getName()
            boolean r4 = kotlin.jvm.internal.g0.g(r5, r4)
            if (r4 != 0) goto L36
            goto L5a
        L59:
            return r8
        L5a:
            java.util.List r3 = r8.g()
            kotlin.jvm.internal.g0.o(r3, r2)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.f0.d0(r3, r4)
            r2.<init>(r4)
            java.util.Iterator r3 = r3.iterator()
        L72:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto La0
            java.lang.Object r4 = r3.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r4 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r4
            kotlin.reflect.jvm.internal.impl.name.f r5 = r4.getName()
            java.lang.String r6 = "getName(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            int r6 = r4.getIndex()
            int r7 = r6 - r0
            if (r7 < 0) goto L98
            java.lang.Object r7 = r9.get(r7)
            kotlin.reflect.jvm.internal.impl.name.f r7 = (kotlin.reflect.jvm.internal.impl.name.f) r7
            if (r7 == 0) goto L98
            r5 = r7
        L98:
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r4 = r4.I(r8, r5, r6)
            r2.add(r4)
            goto L72
        La0:
            kotlin.reflect.jvm.internal.impl.types.h2 r0 = kotlin.reflect.jvm.internal.impl.types.h2.b
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r0 = r8.N0(r0)
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            boolean r3 = r9 instanceof java.util.Collection
            r4 = 0
            if (r3 == 0) goto Lb8
            r3 = r9
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto Lb8
        Lb6:
            r1 = 0
            goto Lca
        Lb8:
            java.util.Iterator r9 = r9.iterator()
        Lbc:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto Lb6
            java.lang.Object r3 = r9.next()
            kotlin.reflect.jvm.internal.impl.name.f r3 = (kotlin.reflect.jvm.internal.impl.name.f) r3
            if (r3 != 0) goto Lbc
        Lca:
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r9 = r0.G(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r9 = r9.U(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.d1 r0 = r8.h1()
            kotlin.reflect.jvm.internal.impl.descriptors.impl.s$c r9 = r9.N(r0)
            java.lang.String r0 = "setOriginal(...)"
            kotlin.jvm.internal.g0.o(r9, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y r9 = super.H0(r9)
            kotlin.jvm.internal.g0.m(r9)
            return r9
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o0, kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.descriptors.impl.s G0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k r1, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.descriptors.y r2, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor.Kind r3, @org.jetbrains.annotations.Nullable kotlin.reflect.jvm.internal.impl.name.f r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.annotations.g r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.e1 r6) {
            r0 = this;
            java.lang.String r4 = "newOwner"
            kotlin.jvm.internal.g0.p(r1, r4)
            java.lang.String r4 = "kind"
            kotlin.jvm.internal.g0.p(r3, r4)
            java.lang.String r4 = "annotations"
            kotlin.jvm.internal.g0.p(r5, r4)
            java.lang.String r4 = "source"
            kotlin.jvm.internal.g0.p(r6, r4)
            kotlin.reflect.jvm.internal.impl.builtins.functions.d r4 = new kotlin.reflect.jvm.internal.impl.builtins.functions.d
            kotlin.reflect.jvm.internal.impl.builtins.functions.d r2 = (kotlin.reflect.jvm.internal.impl.builtins.functions.d) r2
            boolean r5 = r0.isSuspend()
            r4.<init>(r1, r2, r3, r5)
            return r4
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s
    @org.jetbrains.annotations.Nullable
    protected kotlin.reflect.jvm.internal.impl.descriptors.y H0(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.impl.s.c r5) {
            r4 = this;
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.g0.p(r5, r0)
            kotlin.reflect.jvm.internal.impl.descriptors.y r5 = super.H0(r5)
            kotlin.reflect.jvm.internal.impl.builtins.functions.d r5 = (kotlin.reflect.jvm.internal.impl.builtins.functions.d) r5
            if (r5 != 0) goto Lf
            r5 = 0
            return r5
        Lf:
            java.util.List r0 = r5.g()
            java.lang.String r1 = "getValueParameters(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L28
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L28
            return r5
        L28:
            java.util.Iterator r0 = r0.iterator()
        L2c:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7e
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            java.lang.String r3 = "getType(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.builtins.i.d(r2)
            if (r2 == 0) goto L2c
            java.util.List r0 = r5.g()
            kotlin.jvm.internal.g0.o(r0, r1)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.f0.d0(r0, r2)
            r1.<init>(r2)
            java.util.Iterator r0 = r0.iterator()
        L5f:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L7a
            java.lang.Object r2 = r0.next()
            kotlin.reflect.jvm.internal.impl.descriptors.q1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.q1) r2
            kotlin.reflect.jvm.internal.impl.types.t0 r2 = r2.getType()
            kotlin.jvm.internal.g0.o(r2, r3)
            kotlin.reflect.jvm.internal.impl.name.f r2 = kotlin.reflect.jvm.internal.impl.builtins.i.d(r2)
            r1.add(r2)
            goto L5f
        L7a:
            kotlin.reflect.jvm.internal.impl.descriptors.y r5 = r5.k1(r1)
        L7e:
            return r5
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.c0
    public boolean isExternal() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean isInline() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.s, kotlin.reflect.jvm.internal.impl.descriptors.y
    public boolean y() {
            r1 = this;
            r0 = 0
            return r0
    }
}

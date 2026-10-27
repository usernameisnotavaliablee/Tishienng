package kotlin.reflect.jvm.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nKDeclarationContainerImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 5 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 6 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,316:1\n1617#2,9:317\n1869#2:326\n1870#2:328\n1626#2:329\n774#2:330\n865#2,2:331\n1491#2:333\n1516#2,3:334\n1519#2,3:344\n774#2:347\n865#2,2:348\n774#2:350\n865#2,2:351\n1#3:327\n1#3:353\n382#4,7:337\n1310#5,2:354\n37#6:356\n36#6,3:357\n37#6:360\n36#6,3:361\n37#6:364\n36#6,3:365\n*S KotlinDebug\n*F\n+ 1 KDeclarationContainerImpl.kt\nkotlin/reflect/jvm/internal/KDeclarationContainerImpl\n*L\n58#1:317,9\n58#1:326\n58#1:328\n58#1:329\n83#1:330\n83#1:331,2\n103#1:333\n103#1:334,3\n103#1:344,3\n128#1:347\n128#1:348,2\n142#1:350\n142#1:351,2\n58#1:327\n103#1:337,7\n197#1:354,2\n207#1:356\n207#1:357,3\n216#1:360\n216#1:361,3\n241#1:364\n241#1:365,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class KDeclarationContainerImpl implements kotlin.jvm.internal.s {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.KDeclarationContainerImpl.a a = null;
    private static final java.lang.Class<?> b = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.text.Regex c = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected enum MemberBelonginess extends java.lang.Enum<kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess> {
        private static final /* synthetic */ kotlin.enums.a $ENTRIES = null;
        private static final /* synthetic */ kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess[] $VALUES = null;
        public static final kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess DECLARED = null;
        public static final kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess INHERITED = null;

        private static final /* synthetic */ kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess[] $values() {
                r0 = 2
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess[] r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess[r0]
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess r1 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.DECLARED
                r2 = 0
                r0[r2] = r1
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess r1 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.INHERITED
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess
                java.lang.String r1 = "DECLARED"
                r2 = 0
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.DECLARED = r0
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess
                java.lang.String r1 = "INHERITED"
                r2 = 1
                r0.<init>(r1, r2)
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.INHERITED = r0
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess[] r0 = $values()
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.$VALUES = r0
                kotlin.enums.a r0 = kotlin.enums.c.c(r0)
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.$ENTRIES = r0
                return
        }

        MemberBelonginess(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess valueOf(java.lang.String r1) {
                java.lang.Class<kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess> r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess r1 = (kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess) r1
                return r1
        }

        public static kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess[] values() {
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess[] r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.$VALUES
                java.lang.Object r0 = r0.clone()
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess[] r0 = (kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess[]) r0
                return r0
        }

        public final boolean accept(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4) {
                r3 = this;
                java.lang.String r0 = "member"
                kotlin.jvm.internal.g0.p(r4, r0)
                kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor$Kind r4 = r4.h()
                boolean r4 = r4.isReal()
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl$MemberBelonginess r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess.DECLARED
                r1 = 0
                r2 = 1
                if (r3 != r0) goto L15
                r0 = 1
                goto L16
            L15:
                r0 = 0
            L16:
                if (r4 != r0) goto L19
                return r2
            L19:
                return r1
        }
    }

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

        @org.jetbrains.annotations.NotNull
        public final kotlin.text.Regex a() {
                r1 = this;
                kotlin.text.Regex r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.e()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public abstract class b {
        static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] c = null;

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.f3.a a;
        final /* synthetic */ kotlin.reflect.jvm.internal.KDeclarationContainerImpl b;

        static {
                kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
                java.lang.Class<kotlin.reflect.jvm.internal.KDeclarationContainerImpl$b> r1 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.b.class
                java.lang.String r2 = "moduleData"
                java.lang.String r3 = "getModuleData()Lorg/jetbrains/kotlin/descriptors/runtime/components/RuntimeModuleData;"
                r4 = 0
                r0.<init>(r1, r2, r3, r4)
                kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
                r1 = 1
                kotlin.reflect.n[] r1 = new kotlin.reflect.n[r1]
                r1[r4] = r0
                kotlin.reflect.jvm.internal.KDeclarationContainerImpl.b.c = r1
                return
        }

        public b(kotlin.reflect.jvm.internal.KDeclarationContainerImpl r2) {
                r1 = this;
                r1.b = r2
                r1.<init>()
                kotlin.reflect.jvm.internal.i1 r0 = new kotlin.reflect.jvm.internal.i1
                r0.<init>(r2)
                kotlin.reflect.jvm.internal.f3$a r2 = kotlin.reflect.jvm.internal.f3.c(r0)
                r1.a = r2
                return
        }

        static /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k a(kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0) {
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k r0 = c(r0)
                return r0
        }

        private static final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k c(kotlin.reflect.jvm.internal.KDeclarationContainerImpl r0) {
                java.lang.Class r0 = r0.c()
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k r0 = kotlin.reflect.jvm.internal.e3.b(r0)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k b() {
                r3 = this;
                kotlin.reflect.jvm.internal.f3$a r0 = r3.a
                kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.b.c
                r2 = 0
                r1 = r1[r2]
                java.lang.Object r0 = r0.b(r3, r1)
                java.lang.String r1 = "getValue(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k r0 = (kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.k) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class c {

        @org.jetbrains.annotations.NotNull
        private final java.util.List<java.lang.Class<?>> a;

        @org.jetbrains.annotations.Nullable
        private final java.lang.Class<?> b;

        public c(@org.jetbrains.annotations.NotNull java.util.List<? extends java.lang.Class<?>> r2, @org.jetbrains.annotations.Nullable java.lang.Class<?> r3) {
                r1 = this;
                java.lang.String r0 = "parameters"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.List<java.lang.Class<?>> a() {
                r1 = this;
                java.util.List<java.lang.Class<?>> r0 = r1.a
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Class<?> b() {
                r1 = this;
                java.lang.Class<?> r0 = r1.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d extends kotlin.reflect.jvm.internal.n {
        d(kotlin.reflect.jvm.internal.KDeclarationContainerImpl r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.descriptors.impl.o, kotlin.reflect.jvm.internal.impl.descriptors.m
        public /* bridge */ /* synthetic */ java.lang.Object f(kotlin.reflect.jvm.internal.impl.descriptors.j r1, java.lang.Object r2) {
                r0 = this;
                kotlin.n1 r2 = (kotlin.n1) r2
                kotlin.reflect.jvm.internal.e0 r1 = r0.r(r1, r2)
                return r1
        }

        public kotlin.reflect.jvm.internal.e0<?> r(kotlin.reflect.jvm.internal.impl.descriptors.j r3, kotlin.n1 r4) {
                r2 = this;
                java.lang.String r0 = "descriptor"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "data"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "No constructors should appear here: "
                r0.append(r1)
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                r4.<init>(r3)
                throw r4
        }
    }

    static {
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$a r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl.a = r0
            java.lang.Class<kotlin.jvm.internal.v> r0 = kotlin.jvm.internal.v.class
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl.b = r0
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "<v#(\\d+)>"
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl.c = r0
            return
    }

    public KDeclarationContainerImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    private final void E(java.util.List<java.lang.Class<?>> r4, java.util.List<? extends java.lang.Class<?>> r5, boolean r6) {
            r3 = this;
            java.lang.Object r0 = kotlin.collections.f0.A3(r5)
            java.lang.Class<?> r1 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.b
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            r1 = 0
            if (r0 == 0) goto L17
            int r0 = r5.size()
            int r0 = r0 + (-1)
            java.util.List r5 = r5.subList(r1, r0)
        L17:
            r0 = r5
            java.util.Collection r0 = (java.util.Collection) r0
            r4.addAll(r0)
            int r5 = r5.size()
            int r5 = r5 + 31
            int r5 = r5 / 32
        L25:
            if (r1 >= r5) goto L34
            java.lang.String r0 = "TYPE"
            java.lang.Class r2 = java.lang.Integer.TYPE
            kotlin.jvm.internal.g0.o(r2, r0)
            r4.add(r2)
            int r1 = r1 + 1
            goto L25
        L34:
            if (r6 == 0) goto L39
            java.lang.Class<?> r5 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.b
            goto L3b
        L39:
            java.lang.Class<java.lang.Object> r5 = java.lang.Object.class
        L3b:
            kotlin.jvm.internal.g0.m(r5)
            r4.add(r5)
            return
    }

    private static final java.lang.CharSequence J(kotlin.reflect.jvm.internal.impl.descriptors.y r2) {
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = kotlin.reflect.jvm.internal.impl.renderer.m.k
            java.lang.String r1 = r1.N(r2)
            r0.append(r1)
            java.lang.String r1 = " | "
            r0.append(r1)
            kotlin.reflect.jvm.internal.k3 r1 = kotlin.reflect.jvm.internal.k3.a
            kotlin.reflect.jvm.internal.r r2 = r1.g(r2)
            java.lang.String r2 = r2.a()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static final int M(kotlin.reflect.jvm.internal.impl.descriptors.s r0, kotlin.reflect.jvm.internal.impl.descriptors.s r1) {
            java.lang.Integer r0 = kotlin.reflect.jvm.internal.impl.descriptors.r.d(r0, r1)
            if (r0 == 0) goto Lb
            int r0 = r0.intValue()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    private static final int N(kotlin.jvm.functions.Function2 r0, java.lang.Object r1, java.lang.Object r2) {
            java.lang.Object r0 = r0.invoke(r1, r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            return r0
    }

    private static final java.lang.CharSequence O(kotlin.reflect.jvm.internal.impl.descriptors.w0 r2) {
            java.lang.String r0 = "descriptor"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.renderer.m r1 = kotlin.reflect.jvm.internal.impl.renderer.m.k
            java.lang.String r1 = r1.N(r2)
            r0.append(r1)
            java.lang.String r1 = " | "
            r0.append(r1)
            kotlin.reflect.jvm.internal.k3 r1 = kotlin.reflect.jvm.internal.k3.a
            kotlin.reflect.jvm.internal.t r2 = r1.f(r2)
            java.lang.String r2 = r2.a()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private final java.lang.reflect.Method V(java.lang.Class<?> r9, java.lang.String r10, java.lang.Class<?>[] r11, java.lang.Class<?> r12, boolean r13) {
            r8 = this;
            r0 = 0
            if (r13 == 0) goto L5
            r11[r0] = r9
        L5:
            java.lang.reflect.Method r1 = r8.Z(r9, r10, r11, r12)
            if (r1 == 0) goto Lc
            return r1
        Lc:
            java.lang.Class r3 = r9.getSuperclass()
            if (r3 == 0) goto L22
            r2 = r8
            r4 = r10
            r5 = r11
            r6 = r12
            r7 = r13
            java.lang.reflect.Method r10 = r2.V(r3, r4, r5, r6, r7)
            r3 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            if (r10 == 0) goto L26
            return r10
        L22:
            r3 = r10
            r4 = r11
            r5 = r12
            r6 = r13
        L26:
            java.lang.Class[] r9 = r9.getInterfaces()
            java.util.Iterator r9 = kotlin.jvm.internal.h.a(r9)
        L2e:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L70
            java.lang.Object r10 = r9.next()
            r2 = r10
            java.lang.Class r2 = (java.lang.Class) r2
            kotlin.jvm.internal.g0.m(r2)
            r1 = r8
            java.lang.reflect.Method r10 = r1.V(r2, r3, r4, r5, r6)
            if (r10 == 0) goto L46
            return r10
        L46:
            if (r6 == 0) goto L2e
            java.lang.ClassLoader r10 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.j(r2)
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = r2.getName()
            r11.append(r12)
            java.lang.String r12 = "$DefaultImpls"
            r11.append(r12)
            java.lang.String r11 = r11.toString()
            java.lang.Class r10 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.components.e.a(r10, r11)
            if (r10 == 0) goto L2e
            r4[r0] = r2
            java.lang.reflect.Method r10 = r8.Z(r10, r3, r4, r5)
            if (r10 == 0) goto L2e
            return r10
        L70:
            r1 = r8
            r9 = 0
            return r9
    }

    private final kotlin.reflect.jvm.internal.KDeclarationContainerImpl.c W(java.lang.String r11, boolean r12) {
            r10 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 1
            r4 = 1
        L7:
            char r2 = r11.charAt(r4)
            r3 = 41
            r5 = 0
            if (r2 == r3) goto L61
            r2 = r4
        L11:
            char r3 = r11.charAt(r2)
            r6 = 91
            if (r3 != r6) goto L1c
            int r2 = r2 + 1
            goto L11
        L1c:
            char r3 = r11.charAt(r2)
            r6 = 0
            r7 = 2
            java.lang.String r8 = "VZCBSIFJD"
            boolean r5 = kotlin.text.u.k3(r8, r3, r6, r7, r5)
            if (r5 == 0) goto L30
            int r2 = r2 + 1
            r9 = r2
            r2 = r11
            r11 = r9
            goto L3f
        L30:
            r2 = 76
            if (r3 != r2) goto L49
            r6 = 4
            r7 = 0
            r3 = 59
            r5 = 0
            r2 = r11
            int r11 = kotlin.text.u.G3(r2, r3, r4, r5, r6, r7)
            int r11 = r11 + r1
        L3f:
            java.lang.Class r3 = r10.X(r2, r4, r11)
            r0.add(r3)
            r4 = r11
            r11 = r2
            goto L7
        L49:
            r2 = r11
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r11 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Unknown type prefix in the method signature: "
            r12.append(r0)
            r12.append(r2)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
        L61:
            r2 = r11
            if (r12 == 0) goto L6d
            int r4 = r4 + r1
            int r11 = r2.length()
            java.lang.Class r5 = r10.X(r2, r4, r11)
        L6d:
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$c r11 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$c
            r11.<init>(r0, r5)
            return r11
    }

    private final java.lang.Class<?> X(java.lang.String r8, int r9, int r10) {
            r7 = this;
            char r0 = r8.charAt(r9)
            r1 = 70
            if (r0 == r1) goto L90
            r1 = 76
            if (r0 == r1) goto L66
            r1 = 83
            if (r0 == r1) goto L63
            r1 = 86
            if (r0 == r1) goto L5b
            r1 = 73
            if (r0 == r1) goto L58
            r1 = 74
            if (r0 == r1) goto L55
            r1 = 90
            if (r0 == r1) goto L52
            r1 = 91
            if (r0 == r1) goto L47
            switch(r0) {
                case 66: goto L44;
                case 67: goto L41;
                case 68: goto L3e;
                default: goto L27;
            }
        L27:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r9 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Unknown type prefix in the method signature: "
            r10.append(r0)
            r10.append(r8)
            java.lang.String r8 = r10.toString()
            r9.<init>(r8)
            throw r9
        L3e:
            java.lang.Class r8 = java.lang.Double.TYPE
            return r8
        L41:
            java.lang.Class r8 = java.lang.Character.TYPE
            return r8
        L44:
            java.lang.Class r8 = java.lang.Byte.TYPE
            return r8
        L47:
            int r9 = r9 + 1
            java.lang.Class r8 = r7.X(r8, r9, r10)
            java.lang.Class r8 = kotlin.reflect.jvm.internal.p3.f(r8)
            return r8
        L52:
            java.lang.Class r8 = java.lang.Boolean.TYPE
            return r8
        L55:
            java.lang.Class r8 = java.lang.Long.TYPE
            return r8
        L58:
            java.lang.Class r8 = java.lang.Integer.TYPE
            return r8
        L5b:
            java.lang.String r8 = "TYPE"
            java.lang.Class r9 = java.lang.Void.TYPE
            kotlin.jvm.internal.g0.o(r9, r8)
            return r9
        L63:
            java.lang.Class r8 = java.lang.Short.TYPE
            return r8
        L66:
            java.lang.Class r0 = r7.c()
            java.lang.ClassLoader r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.j(r0)
            int r9 = r9 + 1
            int r10 = r10 + (-1)
            java.lang.String r1 = r8.substring(r9, r10)
            java.lang.String r8 = "substring(...)"
            kotlin.jvm.internal.g0.o(r1, r8)
            r5 = 4
            r6 = 0
            r2 = 47
            r3 = 46
            r4 = 0
            java.lang.String r8 = kotlin.text.u.w2(r1, r2, r3, r4, r5, r6)
            java.lang.Class r8 = r0.loadClass(r8)
            java.lang.String r9 = "loadClass(...)"
            kotlin.jvm.internal.g0.o(r8, r9)
            return r8
        L90:
            java.lang.Class r8 = java.lang.Float.TYPE
            return r8
    }

    private final java.lang.reflect.Constructor<?> Y(java.lang.Class<?> r2, java.util.List<? extends java.lang.Class<?>> r3) {
            r1 = this;
            java.util.Collection r3 = (java.util.Collection) r3     // Catch: java.lang.NoSuchMethodException -> L17
            r0 = 0
            java.lang.Class[] r0 = new java.lang.Class[r0]     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.Object[] r3 = r3.toArray(r0)     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.Class[] r3 = (java.lang.Class[]) r3     // Catch: java.lang.NoSuchMethodException -> L17
            int r0 = r3.length     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.Class[] r3 = (java.lang.Class[]) r3     // Catch: java.lang.NoSuchMethodException -> L17
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r3)     // Catch: java.lang.NoSuchMethodException -> L17
            return r2
        L17:
            r2 = 0
            return r2
    }

    private final java.lang.reflect.Method Z(java.lang.Class<?> r6, java.lang.String r7, java.lang.Class<?>[] r8, java.lang.Class<?> r9) {
            r5 = this;
            r0 = 0
            int r1 = r8.length     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r8, r1)     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.Class[] r1 = (java.lang.Class[]) r1     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.reflect.Method r1 = r6.getDeclaredMethod(r7, r1)     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.Class r2 = r1.getReturnType()     // Catch: java.lang.NoSuchMethodException -> L48
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r9)     // Catch: java.lang.NoSuchMethodException -> L48
            if (r2 == 0) goto L17
            return r1
        L17:
            java.lang.reflect.Method[] r6 = r6.getDeclaredMethods()     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.String r1 = "getDeclaredMethods(...)"
            kotlin.jvm.internal.g0.o(r6, r1)     // Catch: java.lang.NoSuchMethodException -> L48
            int r1 = r6.length     // Catch: java.lang.NoSuchMethodException -> L48
            r2 = 0
        L22:
            if (r2 >= r1) goto L48
            r3 = r6[r2]     // Catch: java.lang.NoSuchMethodException -> L48
            java.lang.String r4 = r3.getName()     // Catch: java.lang.NoSuchMethodException -> L48
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r7)     // Catch: java.lang.NoSuchMethodException -> L48
            if (r4 == 0) goto L45
            java.lang.Class r4 = r3.getReturnType()     // Catch: java.lang.NoSuchMethodException -> L48
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r9)     // Catch: java.lang.NoSuchMethodException -> L48
            if (r4 == 0) goto L45
            java.lang.Class[] r4 = r3.getParameterTypes()     // Catch: java.lang.NoSuchMethodException -> L48
            boolean r4 = java.util.Arrays.equals(r4, r8)     // Catch: java.lang.NoSuchMethodException -> L48
            if (r4 == 0) goto L45
            return r3
        L45:
            int r2 = r2 + 1
            goto L22
        L48:
            return r0
    }

    public static final /* synthetic */ kotlin.text.Regex e() {
            kotlin.text.Regex r0 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.c
            return r0
    }

    static /* synthetic */ int g(kotlin.reflect.jvm.internal.impl.descriptors.s r0, kotlin.reflect.jvm.internal.impl.descriptors.s r1) {
            int r0 = M(r0, r1)
            return r0
    }

    static /* synthetic */ int r(kotlin.jvm.functions.Function2 r0, java.lang.Object r1, java.lang.Object r2) {
            int r0 = N(r0, r1, r2)
            return r0
    }

    static /* synthetic */ java.lang.CharSequence s(kotlin.reflect.jvm.internal.impl.descriptors.w0 r0) {
            java.lang.CharSequence r0 = O(r0)
            return r0
    }

    static /* synthetic */ java.lang.CharSequence t(kotlin.reflect.jvm.internal.impl.descriptors.y r0) {
            java.lang.CharSequence r0 = J(r0)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.reflect.Constructor<?> F(@org.jetbrains.annotations.NotNull java.lang.String r3) {
            r2 = this;
            java.lang.String r0 = "desc"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Class r0 = r2.c()
            r1 = 0
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$c r3 = r2.W(r3, r1)
            java.util.List r3 = r3.a()
            java.lang.reflect.Constructor r3 = r2.Y(r0, r3)
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.reflect.Constructor<?> G(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            r3 = this;
            java.lang.String r0 = "desc"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.Class r0 = r3.c()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r2 = 0
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$c r4 = r3.W(r4, r2)
            java.util.List r4 = r4.a()
            r2 = 1
            r3.E(r1, r4, r2)
            kotlin.n1 r4 = kotlin.n1.a
            java.lang.reflect.Constructor r4 = r3.Y(r0, r1)
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.reflect.Method H(@org.jetbrains.annotations.NotNull java.lang.String r10, @org.jetbrains.annotations.NotNull java.lang.String r11, boolean r12) {
            r9 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "desc"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "<init>"
            boolean r0 = kotlin.jvm.internal.g0.g(r10, r0)
            if (r0 == 0) goto L14
            r10 = 0
            return r10
        L14:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r12 == 0) goto L22
            java.lang.Class r1 = r9.c()
            r0.add(r1)
        L22:
            r1 = 1
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$c r11 = r9.W(r11, r1)
            java.util.List r1 = r11.a()
            r2 = 0
            r9.E(r0, r1, r2)
            java.lang.Class r4 = r9.T()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r10)
            java.lang.String r10 = "$default"
            r1.append(r10)
            java.lang.String r5 = r1.toString()
            java.lang.Class[] r10 = new java.lang.Class[r2]
            java.lang.Object[] r10 = r0.toArray(r10)
            r6 = r10
            java.lang.Class[] r6 = (java.lang.Class[]) r6
            java.lang.Class r7 = r11.b()
            kotlin.jvm.internal.g0.m(r7)
            r3 = r9
            r8 = r12
            java.lang.reflect.Method r10 = r3.V(r4, r5, r6, r7, r8)
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.y I(@org.jetbrains.annotations.NotNull java.lang.String r14, @org.jetbrains.annotations.NotNull java.lang.String r15) {
            r13 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r14, r0)
            java.lang.String r0 = "signature"
            kotlin.jvm.internal.g0.p(r15, r0)
            java.lang.String r0 = "<init>"
            boolean r0 = kotlin.jvm.internal.g0.g(r14, r0)
            if (r0 == 0) goto Lc2
            java.util.Collection r0 = r13.P()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = kotlin.collections.f0.a6(r0)
            java.util.Collection r0 = (java.util.Collection) r0
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L2a:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lfc
            java.lang.Object r3 = r1.next()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.j r4 = (kotlin.reflect.jvm.internal.impl.descriptors.j) r4
            boolean r5 = r4.m0()
            if (r5 == 0) goto Lad
            kotlin.reflect.jvm.internal.impl.descriptors.g r5 = r4.b()
            java.lang.String r6 = "getContainingDeclaration(...)"
            kotlin.jvm.internal.g0.o(r5, r6)
            boolean r5 = kotlin.reflect.jvm.internal.impl.resolve.j.d(r5)
            if (r5 == 0) goto Lad
            kotlin.reflect.jvm.internal.k3 r5 = kotlin.reflect.jvm.internal.k3.a
            kotlin.reflect.jvm.internal.r r5 = r5.g(r4)
            java.lang.String r5 = r5.a()
            java.lang.String r7 = "constructor-impl"
            r8 = 0
            r9 = 2
            r10 = 0
            boolean r7 = kotlin.text.u.H2(r5, r7, r8, r9, r10)
            if (r7 == 0) goto L8a
            java.lang.String r7 = ")V"
            boolean r7 = kotlin.text.u.Z1(r5, r7, r8, r9, r10)
            if (r7 == 0) goto L8a
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r8 = "V"
            java.lang.String r5 = kotlin.text.u.B4(r5, r8)
            r7.append(r5)
            kotlin.reflect.jvm.internal.impl.descriptors.g r4 = r4.b()
            kotlin.jvm.internal.g0.o(r4, r6)
            java.lang.String r4 = kotlin.reflect.jvm.internal.calls.n.u(r4)
            r7.append(r4)
            java.lang.String r4 = r7.toString()
            goto Lb7
        L8a:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "Invalid signature of "
            r14.append(r15)
            r14.append(r4)
            java.lang.String r15 = ": "
            r14.append(r15)
            r14.append(r5)
            java.lang.String r14 = r14.toString()
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r14 = r14.toString()
            r15.<init>(r14)
            throw r15
        Lad:
            kotlin.reflect.jvm.internal.k3 r5 = kotlin.reflect.jvm.internal.k3.a
            kotlin.reflect.jvm.internal.r r4 = r5.g(r4)
            java.lang.String r4 = r4.a()
        Lb7:
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r15)
            if (r4 == 0) goto L2a
            r2.add(r3)
            goto L2a
        Lc2:
            kotlin.reflect.jvm.internal.impl.name.f r0 = kotlin.reflect.jvm.internal.impl.name.f.h(r14)
            java.lang.String r1 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            java.util.Collection r0 = r13.Q(r0)
            r1 = r0
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        Ldb:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto Lfc
            java.lang.Object r3 = r1.next()
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.y r4 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r4
            kotlin.reflect.jvm.internal.k3 r5 = kotlin.reflect.jvm.internal.k3.a
            kotlin.reflect.jvm.internal.r r4 = r5.g(r4)
            java.lang.String r4 = r4.a()
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r15)
            if (r4 == 0) goto Ldb
            r2.add(r3)
            goto Ldb
        Lfc:
            int r1 = r2.size()
            r3 = 1
            if (r1 == r3) goto L15e
            r4 = r0
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            kotlin.reflect.jvm.internal.h1 r10 = kotlin.reflect.jvm.internal.h1.a
            r11 = 30
            r12 = 0
            java.lang.String r5 = "\n"
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            java.lang.String r0 = kotlin.collections.f0.r3(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r1 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Function '"
            r2.append(r3)
            r2.append(r14)
            java.lang.String r14 = "' (JVM signature: "
            r2.append(r14)
            r2.append(r15)
            java.lang.String r14 = ") not resolved in "
            r2.append(r14)
            r2.append(r13)
            r14 = 58
            r2.append(r14)
            int r14 = r0.length()
            if (r14 != 0) goto L142
            java.lang.String r14 = " no members found"
            goto L153
        L142:
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            r15 = 10
            r14.append(r15)
            r14.append(r0)
            java.lang.String r14 = r14.toString()
        L153:
            r2.append(r14)
            java.lang.String r14 = r2.toString()
            r1.<init>(r14)
            throw r1
        L15e:
            java.lang.Object r14 = kotlin.collections.f0.m5(r2)
            kotlin.reflect.jvm.internal.impl.descriptors.y r14 = (kotlin.reflect.jvm.internal.impl.descriptors.y) r14
            return r14
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.reflect.Method K(@org.jetbrains.annotations.NotNull java.lang.String r9, @org.jetbrains.annotations.NotNull java.lang.String r10) {
            r8 = this;
            java.lang.String r0 = "name"
            kotlin.jvm.internal.g0.p(r9, r0)
            java.lang.String r0 = "desc"
            kotlin.jvm.internal.g0.p(r10, r0)
            java.lang.String r0 = "<init>"
            boolean r0 = kotlin.jvm.internal.g0.g(r9, r0)
            r1 = 0
            if (r0 == 0) goto L14
            return r1
        L14:
            r0 = 1
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$c r10 = r8.W(r10, r0)
            java.util.List r0 = r10.a()
            java.util.Collection r0 = (java.util.Collection) r0
            r2 = 0
            java.lang.Class[] r2 = new java.lang.Class[r2]
            java.lang.Object[] r0 = r0.toArray(r2)
            r5 = r0
            java.lang.Class[] r5 = (java.lang.Class[]) r5
            java.lang.Class r6 = r10.b()
            kotlin.jvm.internal.g0.m(r6)
            java.lang.Class r3 = r8.T()
            r7 = 0
            r2 = r8
            r4 = r9
            java.lang.reflect.Method r9 = r2.V(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L3e
            return r9
        L3e:
            java.lang.Class r9 = r8.T()
            boolean r9 = r9.isInterface()
            if (r9 == 0) goto L53
            java.lang.Class<java.lang.Object> r3 = java.lang.Object.class
            r7 = 0
            r2 = r8
            java.lang.reflect.Method r9 = r2.V(r3, r4, r5, r6, r7)
            if (r9 == 0) goto L53
            return r9
        L53:
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.w0 L(@org.jetbrains.annotations.NotNull java.lang.String r20, @org.jetbrains.annotations.NotNull java.lang.String r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.lang.String r3 = "name"
            kotlin.jvm.internal.g0.p(r1, r3)
            java.lang.String r3 = "signature"
            kotlin.jvm.internal.g0.p(r2, r3)
            kotlin.text.Regex r3 = kotlin.reflect.jvm.internal.KDeclarationContainerImpl.c
            kotlin.text.p r3 = r3.matchEntire(r2)
            r4 = 1
            if (r3 == 0) goto L59
            kotlin.text.p$b r1 = r3.a()
            kotlin.text.p r1 = r1.k()
            java.util.List r1 = r1.c()
            java.lang.Object r1 = r1.get(r4)
            java.lang.String r1 = (java.lang.String) r1
            int r2 = java.lang.Integer.parseInt(r1)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r2 = r0.R(r2)
            if (r2 == 0) goto L36
            return r2
        L36:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r2 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Local property #"
            r3.append(r4)
            r3.append(r1)
            java.lang.String r1 = " not found in "
            r3.append(r1)
            java.lang.Class r1 = r0.c()
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            throw r2
        L59:
            kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.name.f.h(r1)
            java.lang.String r5 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r3, r5)
            java.util.Collection r3 = r0.U(r3)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r3 = r3.iterator()
        L71:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L92
            java.lang.Object r7 = r3.next()
            r8 = r7
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r8 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r8
            kotlin.reflect.jvm.internal.k3 r9 = kotlin.reflect.jvm.internal.k3.a
            kotlin.reflect.jvm.internal.t r8 = r9.f(r8)
            java.lang.String r8 = r8.a()
            boolean r8 = kotlin.jvm.internal.g0.g(r8, r2)
            if (r8 == 0) goto L71
            r6.add(r7)
            goto L71
        L92:
            boolean r3 = r6.isEmpty()
            java.lang.String r7 = ") not resolved in "
            java.lang.String r8 = "' (JVM signature: "
            java.lang.String r9 = "Property '"
            if (r3 != 0) goto L166
            int r3 = r6.size()
            if (r3 == r4) goto L15f
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r6 = r6.iterator()
        Lad:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto Ld2
            java.lang.Object r10 = r6.next()
            r11 = r10
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r11 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r11
            kotlin.reflect.jvm.internal.impl.descriptors.s r11 = r11.getVisibility()
            java.lang.Object r12 = r3.get(r11)
            if (r12 != 0) goto Lcc
            java.util.ArrayList r12 = new java.util.ArrayList
            r12.<init>()
            r3.put(r11, r12)
        Lcc:
            java.util.List r12 = (java.util.List) r12
            r12.add(r10)
            goto Lad
        Ld2:
            kotlin.reflect.jvm.internal.e1 r6 = kotlin.reflect.jvm.internal.e1.a
            kotlin.reflect.jvm.internal.f1 r10 = new kotlin.reflect.jvm.internal.f1
            r10.<init>(r6)
            java.util.SortedMap r3 = kotlin.collections.i1.r(r3, r10)
            java.util.Collection r3 = r3.values()
            java.lang.String r6 = "<get-values>(...)"
            kotlin.jvm.internal.g0.o(r3, r6)
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object r3 = kotlin.collections.f0.s3(r3)
            java.util.List r3 = (java.util.List) r3
            int r6 = r3.size()
            if (r6 != r4) goto Lfe
            kotlin.jvm.internal.g0.m(r3)
            java.lang.Object r1 = kotlin.collections.f0.G2(r3)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r1
            return r1
        Lfe:
            kotlin.reflect.jvm.internal.impl.name.f r3 = kotlin.reflect.jvm.internal.impl.name.f.h(r1)
            kotlin.jvm.internal.g0.o(r3, r5)
            java.util.Collection r3 = r0.U(r3)
            r10 = r3
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            kotlin.reflect.jvm.internal.g1 r16 = kotlin.reflect.jvm.internal.g1.a
            r17 = 30
            r18 = 0
            java.lang.String r11 = "\n"
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            java.lang.String r3 = kotlin.collections.f0.r3(r10, r11, r12, r13, r14, r15, r16, r17, r18)
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r4 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r9)
            r5.append(r1)
            r5.append(r8)
            r5.append(r2)
            r5.append(r7)
            r5.append(r0)
            r1 = 58
            r5.append(r1)
            int r1 = r3.length()
            if (r1 != 0) goto L143
            java.lang.String r1 = " no members found"
            goto L154
        L143:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 10
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
        L154:
            r5.append(r1)
            java.lang.String r1 = r5.toString()
            r4.<init>(r1)
            throw r4
        L15f:
            java.lang.Object r1 = kotlin.collections.f0.m5(r6)
            kotlin.reflect.jvm.internal.impl.descriptors.w0 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.w0) r1
            return r1
        L166:
            kotlin.reflect.jvm.internal.KotlinReflectionInternalError r3 = new kotlin.reflect.jvm.internal.KotlinReflectionInternalError
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r4.append(r9)
            r4.append(r1)
            r4.append(r8)
            r4.append(r2)
            r4.append(r7)
            r4.append(r0)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1)
            throw r3
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.j> P();

    @org.jetbrains.annotations.NotNull
    public abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.y> Q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1);

    @org.jetbrains.annotations.Nullable
    public abstract kotlin.reflect.jvm.internal.impl.descriptors.w0 R(int r1);

    @org.jetbrains.annotations.NotNull
    protected final java.util.Collection<kotlin.reflect.jvm.internal.e0<?>> S(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.scopes.k r8, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.KDeclarationContainerImpl.MemberBelonginess r9) {
            r7 = this;
            java.lang.String r0 = "scope"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "belonginess"
            kotlin.jvm.internal.g0.p(r9, r0)
            kotlin.reflect.jvm.internal.KDeclarationContainerImpl$d r0 = new kotlin.reflect.jvm.internal.KDeclarationContainerImpl$d
            r0.<init>(r7)
            r1 = 3
            r2 = 0
            java.util.Collection r8 = kotlin.reflect.jvm.internal.impl.resolve.scopes.n.a.a(r8, r2, r2, r1, r2)
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r8 = r8.iterator()
        L20:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto L55
            java.lang.Object r3 = r8.next()
            kotlin.reflect.jvm.internal.impl.descriptors.k r3 = (kotlin.reflect.jvm.internal.impl.descriptors.k) r3
            boolean r4 = r3 instanceof kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor
            if (r4 == 0) goto L4e
            r4 = r3
            kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor r4 = (kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor) r4
            kotlin.reflect.jvm.internal.impl.descriptors.s r5 = r4.getVisibility()
            kotlin.reflect.jvm.internal.impl.descriptors.s r6 = kotlin.reflect.jvm.internal.impl.descriptors.r.h
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r6)
            if (r5 != 0) goto L4e
            boolean r4 = r9.accept(r4)
            if (r4 == 0) goto L4e
            kotlin.n1 r4 = kotlin.n1.a
            java.lang.Object r3 = r3.W(r0, r4)
            kotlin.reflect.jvm.internal.e0 r3 = (kotlin.reflect.jvm.internal.e0) r3
            goto L4f
        L4e:
            r3 = r2
        L4f:
            if (r3 == 0) goto L20
            r1.add(r3)
            goto L20
        L55:
            java.util.List r8 = kotlin.collections.f0.a6(r1)
            java.util.Collection r8 = (java.util.Collection) r8
            return r8
    }

    @org.jetbrains.annotations.NotNull
    protected java.lang.Class<?> T() {
            r1 = this;
            java.lang.Class r0 = r1.c()
            java.lang.Class r0 = kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.f.k(r0)
            if (r0 != 0) goto Le
            java.lang.Class r0 = r1.c()
        Le:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public abstract java.util.Collection<kotlin.reflect.jvm.internal.impl.descriptors.w0> U(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.f r1);
}

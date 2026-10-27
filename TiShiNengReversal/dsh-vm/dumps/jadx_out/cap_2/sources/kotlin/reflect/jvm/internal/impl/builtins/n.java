package kotlin.reflect.jvm.internal.impl.builtins;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1563#2:226\n1634#2,3:227\n*S KotlinDebug\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes\n*L\n94#1:226\n94#1:227,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.builtins.n.b k = null;
    static final /* synthetic */ kotlin.reflect.n<java.lang.Object>[] l = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.descriptors.k0 a;

    @org.jetbrains.annotations.NotNull
    private final kotlin.s b;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.builtins.n.a c;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.builtins.n.a d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.builtins.n.a e;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.builtins.n.a f;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.builtins.n.a g;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.builtins.n.a h;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.builtins.n.a i;

    @org.jetbrains.annotations.NotNull
    private final kotlin.reflect.jvm.internal.impl.builtins.n.a j;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {
        private final int a;

        public a(int r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.descriptors.d a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.n r2, @org.jetbrains.annotations.NotNull kotlin.reflect.n<?> r3) {
                r1 = this;
                java.lang.String r0 = "types"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "property"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r3 = r3.getName()
                java.lang.String r3 = e4.a.a(r3)
                int r0 = r1.a
                kotlin.reflect.jvm.internal.impl.descriptors.d r2 = kotlin.reflect.jvm.internal.impl.builtins.n.a(r2, r3, r0)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nReflectionTypes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,225:1\n1761#2,3:226\n*S KotlinDebug\n*F\n+ 1 ReflectionTypes.kt\norg/jetbrains/kotlin/builtins/ReflectionTypes$Companion\n*L\n122#1:226,3\n*E\n"})
    public static final class b {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.Nullable
        public final kotlin.reflect.jvm.internal.impl.types.t0 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r5) {
                r4 = this;
                java.lang.String r0 = "module"
                kotlin.jvm.internal.g0.p(r5, r0)
                kotlin.reflect.jvm.internal.impl.name.b r0 = kotlin.reflect.jvm.internal.impl.builtins.o.a.w0
                kotlin.reflect.jvm.internal.impl.descriptors.d r5 = kotlin.reflect.jvm.internal.impl.descriptors.x.b(r5, r0)
                if (r5 != 0) goto Lf
                r5 = 0
                return r5
            Lf:
                kotlin.reflect.jvm.internal.impl.types.t1$a r0 = kotlin.reflect.jvm.internal.impl.types.t1.b
                kotlin.reflect.jvm.internal.impl.types.t1 r0 = r0.k()
                kotlin.reflect.jvm.internal.impl.types.l1 r1 = new kotlin.reflect.jvm.internal.impl.types.l1
                kotlin.reflect.jvm.internal.impl.types.w1 r2 = r5.o()
                java.util.List r2 = r2.getParameters()
                java.lang.String r3 = "getParameters(...)"
                kotlin.jvm.internal.g0.o(r2, r3)
                java.lang.Object r2 = kotlin.collections.f0.m5(r2)
                java.lang.String r3 = "single(...)"
                kotlin.jvm.internal.g0.o(r2, r3)
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
                r1.<init>(r2)
                java.util.List r1 = kotlin.collections.f0.l(r1)
                kotlin.reflect.jvm.internal.impl.types.e1 r5 = kotlin.reflect.jvm.internal.impl.types.w0.h(r0, r5, r1)
                return r5
        }
    }

    static {
            kotlin.jvm.internal.PropertyReference1Impl r0 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.Class<kotlin.reflect.jvm.internal.impl.builtins.n> r1 = kotlin.reflect.jvm.internal.impl.builtins.n.class
            java.lang.String r2 = "kClass"
            java.lang.String r3 = "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"
            r4 = 0
            r0.<init>(r1, r2, r3, r4)
            kotlin.reflect.p r0 = kotlin.jvm.internal.o0.u(r0)
            kotlin.jvm.internal.PropertyReference1Impl r2 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r3 = "kProperty"
            java.lang.String r5 = "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"
            r2.<init>(r1, r3, r5, r4)
            kotlin.reflect.p r2 = kotlin.jvm.internal.o0.u(r2)
            kotlin.jvm.internal.PropertyReference1Impl r3 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r5 = "kProperty0"
            java.lang.String r6 = "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"
            r3.<init>(r1, r5, r6, r4)
            kotlin.reflect.p r3 = kotlin.jvm.internal.o0.u(r3)
            kotlin.jvm.internal.PropertyReference1Impl r5 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r6 = "kProperty1"
            java.lang.String r7 = "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"
            r5.<init>(r1, r6, r7, r4)
            kotlin.reflect.p r5 = kotlin.jvm.internal.o0.u(r5)
            kotlin.jvm.internal.PropertyReference1Impl r6 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r7 = "kProperty2"
            java.lang.String r8 = "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"
            r6.<init>(r1, r7, r8, r4)
            kotlin.reflect.p r6 = kotlin.jvm.internal.o0.u(r6)
            kotlin.jvm.internal.PropertyReference1Impl r7 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r8 = "kMutableProperty0"
            java.lang.String r9 = "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"
            r7.<init>(r1, r8, r9, r4)
            kotlin.reflect.p r7 = kotlin.jvm.internal.o0.u(r7)
            kotlin.jvm.internal.PropertyReference1Impl r8 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r9 = "kMutableProperty1"
            java.lang.String r10 = "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"
            r8.<init>(r1, r9, r10, r4)
            kotlin.reflect.p r8 = kotlin.jvm.internal.o0.u(r8)
            kotlin.jvm.internal.PropertyReference1Impl r9 = new kotlin.jvm.internal.PropertyReference1Impl
            java.lang.String r10 = "kMutableProperty2"
            java.lang.String r11 = "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;"
            r9.<init>(r1, r10, r11, r4)
            kotlin.reflect.p r1 = kotlin.jvm.internal.o0.u(r9)
            r9 = 8
            kotlin.reflect.n[] r9 = new kotlin.reflect.n[r9]
            r9[r4] = r0
            r0 = 1
            r9[r0] = r2
            r0 = 2
            r9[r0] = r3
            r0 = 3
            r9[r0] = r5
            r0 = 4
            r9[r0] = r6
            r0 = 5
            r9[r0] = r7
            r0 = 6
            r9[r0] = r8
            r0 = 7
            r9[r0] = r1
            kotlin.reflect.jvm.internal.impl.builtins.n.l = r9
            kotlin.reflect.jvm.internal.impl.builtins.n$b r0 = new kotlin.reflect.jvm.internal.impl.builtins.n$b
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.builtins.n.k = r0
            return
    }

    public n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.f0 r3, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.descriptors.k0 r4) {
            r2 = this;
            java.lang.String r0 = "module"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "notFoundClasses"
            kotlin.jvm.internal.g0.p(r4, r0)
            r2.<init>()
            r2.a = r4
            kotlin.LazyThreadSafetyMode r4 = kotlin.LazyThreadSafetyMode.PUBLICATION
            kotlin.reflect.jvm.internal.impl.builtins.m r0 = new kotlin.reflect.jvm.internal.impl.builtins.m
            r0.<init>(r3)
            kotlin.s r3 = kotlin.t.b(r4, r0)
            r2.b = r3
            kotlin.reflect.jvm.internal.impl.builtins.n$a r3 = new kotlin.reflect.jvm.internal.impl.builtins.n$a
            r4 = 1
            r3.<init>(r4)
            r2.c = r3
            kotlin.reflect.jvm.internal.impl.builtins.n$a r3 = new kotlin.reflect.jvm.internal.impl.builtins.n$a
            r3.<init>(r4)
            r2.d = r3
            kotlin.reflect.jvm.internal.impl.builtins.n$a r3 = new kotlin.reflect.jvm.internal.impl.builtins.n$a
            r3.<init>(r4)
            r2.e = r3
            kotlin.reflect.jvm.internal.impl.builtins.n$a r3 = new kotlin.reflect.jvm.internal.impl.builtins.n$a
            r0 = 2
            r3.<init>(r0)
            r2.f = r3
            kotlin.reflect.jvm.internal.impl.builtins.n$a r3 = new kotlin.reflect.jvm.internal.impl.builtins.n$a
            r1 = 3
            r3.<init>(r1)
            r2.g = r3
            kotlin.reflect.jvm.internal.impl.builtins.n$a r3 = new kotlin.reflect.jvm.internal.impl.builtins.n$a
            r3.<init>(r4)
            r2.h = r3
            kotlin.reflect.jvm.internal.impl.builtins.n$a r3 = new kotlin.reflect.jvm.internal.impl.builtins.n$a
            r3.<init>(r0)
            r2.i = r3
            kotlin.reflect.jvm.internal.impl.builtins.n$a r3 = new kotlin.reflect.jvm.internal.impl.builtins.n$a
            r3.<init>(r1)
            r2.j = r3
            return
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.d a(kotlin.reflect.jvm.internal.impl.builtins.n r0, java.lang.String r1, int r2) {
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.c(r1, r2)
            return r0
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.resolve.scopes.k b(kotlin.reflect.jvm.internal.impl.descriptors.f0 r0) {
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = f(r0)
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.d c(java.lang.String r4, int r5) {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.name.f r4 = kotlin.reflect.jvm.internal.impl.name.f.h(r4)
            java.lang.String r0 = "identifier(...)"
            kotlin.jvm.internal.g0.o(r4, r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = r3.e()
            kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation r1 = kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation.FROM_REFLECTION
            kotlin.reflect.jvm.internal.impl.descriptors.f r0 = r0.g(r4, r1)
            boolean r1 = r0 instanceof kotlin.reflect.jvm.internal.impl.descriptors.d
            if (r1 == 0) goto L1a
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = (kotlin.reflect.jvm.internal.impl.descriptors.d) r0
            goto L1b
        L1a:
            r0 = 0
        L1b:
            if (r0 != 0) goto L33
            kotlin.reflect.jvm.internal.impl.descriptors.k0 r0 = r3.a
            kotlin.reflect.jvm.internal.impl.name.b r1 = new kotlin.reflect.jvm.internal.impl.name.b
            kotlin.reflect.jvm.internal.impl.name.c r2 = kotlin.reflect.jvm.internal.impl.builtins.o.y
            r1.<init>(r2, r4)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)
            java.util.List r4 = kotlin.collections.f0.l(r4)
            kotlin.reflect.jvm.internal.impl.descriptors.d r4 = r0.d(r1, r4)
            return r4
        L33:
            return r0
    }

    private final kotlin.reflect.jvm.internal.impl.resolve.scopes.k e() {
            r1 = this;
            kotlin.s r0 = r1.b
            java.lang.Object r0 = r0.getValue()
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r0 = (kotlin.reflect.jvm.internal.impl.resolve.scopes.k) r0
            return r0
    }

    private static final kotlin.reflect.jvm.internal.impl.resolve.scopes.k f(kotlin.reflect.jvm.internal.impl.descriptors.f0 r1) {
            kotlin.reflect.jvm.internal.impl.name.c r0 = kotlin.reflect.jvm.internal.impl.builtins.o.y
            kotlin.reflect.jvm.internal.impl.descriptors.s0 r1 = r1.M(r0)
            kotlin.reflect.jvm.internal.impl.resolve.scopes.k r1 = r1.r()
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.descriptors.d d() {
            r3 = this;
            kotlin.reflect.jvm.internal.impl.builtins.n$a r0 = r3.c
            kotlin.reflect.n<java.lang.Object>[] r1 = kotlin.reflect.jvm.internal.impl.builtins.n.l
            r2 = 0
            r1 = r1[r2]
            kotlin.reflect.jvm.internal.impl.descriptors.d r0 = r0.a(r3, r1)
            return r0
    }
}

package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class x1 extends kotlin.reflect.jvm.internal.impl.types.f2 {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.x1.a c = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/TypeConstructorSubstitution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1563#2:208\n1634#2,3:209\n*S KotlinDebug\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/TypeConstructorSubstitution$Companion\n*L\n96#1:208\n96#1:209,3\n*E\n"})
    public static final class a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.types.x1$a$a, reason: collision with other inner class name */
        public static final class C0076a extends kotlin.reflect.jvm.internal.impl.types.x1 {
            final /* synthetic */ java.util.Map<kotlin.reflect.jvm.internal.impl.types.w1, kotlin.reflect.jvm.internal.impl.types.c2> d;
            final /* synthetic */ boolean e;

            C0076a(java.util.Map<kotlin.reflect.jvm.internal.impl.types.w1, ? extends kotlin.reflect.jvm.internal.impl.types.c2> r1, boolean r2) {
                    r0 = this;
                    r0.d = r1
                    r0.e = r2
                    r0.<init>()
                    return
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.f2
            public boolean a() {
                    r1 = this;
                    boolean r0 = r1.e
                    return r0
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.f2
            public boolean f() {
                    r1 = this;
                    java.util.Map<kotlin.reflect.jvm.internal.impl.types.w1, kotlin.reflect.jvm.internal.impl.types.c2> r0 = r1.d
                    boolean r0 = r0.isEmpty()
                    return r0
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.x1
            public kotlin.reflect.jvm.internal.impl.types.c2 k(kotlin.reflect.jvm.internal.impl.types.w1 r2) {
                    r1 = this;
                    java.lang.String r0 = "key"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    java.util.Map<kotlin.reflect.jvm.internal.impl.types.w1, kotlin.reflect.jvm.internal.impl.types.c2> r0 = r1.d
                    java.lang.Object r2 = r0.get(r2)
                    kotlin.reflect.jvm.internal.impl.types.c2 r2 = (kotlin.reflect.jvm.internal.impl.types.c2) r2
                    return r2
            }
        }

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

        public static /* synthetic */ kotlin.reflect.jvm.internal.impl.types.x1 e(kotlin.reflect.jvm.internal.impl.types.x1.a r0, java.util.Map r1, boolean r2, int r3, java.lang.Object r4) {
                r3 = r3 & 2
                if (r3 == 0) goto L5
                r2 = 0
            L5:
                kotlin.reflect.jvm.internal.impl.types.x1 r0 = r0.d(r1, r2)
                return r0
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.types.f2 a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
                r1 = this;
                java.lang.String r0 = "kotlinType"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.types.w1 r0 = r2.I0()
                java.util.List r2 = r2.G0()
                kotlin.reflect.jvm.internal.impl.types.f2 r2 = r1.b(r0, r2)
                return r2
        }

        @kotlin.jvm.JvmStatic
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.types.f2 b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r5, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r6) {
                r4 = this;
                java.lang.String r0 = "typeConstructor"
                kotlin.jvm.internal.g0.p(r5, r0)
                java.lang.String r0 = "arguments"
                kotlin.jvm.internal.g0.p(r6, r0)
                java.util.List r0 = r5.getParameters()
                java.lang.String r1 = "getParameters(...)"
                kotlin.jvm.internal.g0.o(r0, r1)
                java.lang.Object r2 = kotlin.collections.f0.A3(r0)
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r2 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r2
                if (r2 == 0) goto L62
                boolean r2 = r2.E()
                r3 = 1
                if (r2 != r3) goto L62
                java.util.List r5 = r5.getParameters()
                kotlin.jvm.internal.g0.o(r5, r1)
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.ArrayList r0 = new java.util.ArrayList
                r1 = 10
                int r1 = kotlin.collections.f0.d0(r5, r1)
                r0.<init>(r1)
                java.util.Iterator r5 = r5.iterator()
            L3a:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L4e
                java.lang.Object r1 = r5.next()
                kotlin.reflect.jvm.internal.impl.descriptors.j1 r1 = (kotlin.reflect.jvm.internal.impl.descriptors.j1) r1
                kotlin.reflect.jvm.internal.impl.types.w1 r1 = r1.o()
                r0.add(r1)
                goto L3a
            L4e:
                java.lang.Iterable r6 = (java.lang.Iterable) r6
                java.util.List r5 = kotlin.collections.f0.o6(r0, r6)
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                java.util.Map r5 = kotlin.collections.i1.B0(r5)
                r6 = 2
                r0 = 0
                r1 = 0
                kotlin.reflect.jvm.internal.impl.types.x1 r5 = e(r4, r5, r1, r6, r0)
                return r5
            L62:
                kotlin.reflect.jvm.internal.impl.types.o0 r5 = new kotlin.reflect.jvm.internal.impl.types.o0
                r5.<init>(r0, r6)
                return r5
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.types.x1 c(@org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.types.w1, ? extends kotlin.reflect.jvm.internal.impl.types.c2> r4) {
                r3 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.g0.p(r4, r0)
                r0 = 2
                r1 = 0
                r2 = 0
                kotlin.reflect.jvm.internal.impl.types.x1 r4 = e(r3, r4, r2, r0, r1)
                return r4
        }

        @kotlin.jvm.JvmStatic
        @kotlin.jvm.JvmOverloads
        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.types.x1 d(@org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.types.w1, ? extends kotlin.reflect.jvm.internal.impl.types.c2> r2, boolean r3) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.g0.p(r2, r0)
                kotlin.reflect.jvm.internal.impl.types.x1$a$a r0 = new kotlin.reflect.jvm.internal.impl.types.x1$a$a
                r0.<init>(r2, r3)
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.x1$a r0 = new kotlin.reflect.jvm.internal.impl.types.x1$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.x1.c = r0
            return
    }

    public x1() {
            r0 = this;
            r0.<init>()
            return
    }

    @kotlin.jvm.JvmStatic
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.f2 i(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r1, @org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.c2> r2) {
            kotlin.reflect.jvm.internal.impl.types.x1$a r0 = kotlin.reflect.jvm.internal.impl.types.x1.c
            kotlin.reflect.jvm.internal.impl.types.f2 r1 = r0.b(r1, r2)
            return r1
    }

    @kotlin.jvm.JvmStatic
    @kotlin.jvm.JvmOverloads
    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.x1 j(@org.jetbrains.annotations.NotNull java.util.Map<kotlin.reflect.jvm.internal.impl.types.w1, ? extends kotlin.reflect.jvm.internal.impl.types.c2> r1) {
            kotlin.reflect.jvm.internal.impl.types.x1$a r0 = kotlin.reflect.jvm.internal.impl.types.x1.c
            kotlin.reflect.jvm.internal.impl.types.x1 r1 = r0.c(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.f2
    @org.jetbrains.annotations.Nullable
    public kotlin.reflect.jvm.internal.impl.types.c2 e(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t0 r2) {
            r1 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.w1 r2 = r2.I0()
            kotlin.reflect.jvm.internal.impl.types.c2 r2 = r1.k(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public abstract kotlin.reflect.jvm.internal.impl.types.c2 k(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.w1 r1);
}

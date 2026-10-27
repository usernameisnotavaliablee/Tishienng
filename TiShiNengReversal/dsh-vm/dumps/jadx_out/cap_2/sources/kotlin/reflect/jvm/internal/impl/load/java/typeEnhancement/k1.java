package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class k1 {

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d1> a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public final class a {

        @org.jetbrains.annotations.NotNull
        private final java.lang.String a;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k1 b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,347:1\n1222#2,2:348\n1252#2,4:350\n1222#2,2:354\n1252#2,4:356\n1563#2:360\n1634#2,3:361\n1563#2:364\n1634#2,3:365\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder\n*L\n319#1:348,2\n319#1:350,4\n330#1:354,2\n330#1:356,4\n338#1:360\n338#1:361,3\n339#1:364\n339#1:365,3\n*E\n"})
        /* renamed from: kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k1$a$a, reason: collision with other inner class name */
        public final class C0043a {

            @org.jetbrains.annotations.NotNull
            private final java.lang.String a;

            @org.jetbrains.annotations.Nullable
            private final java.lang.String b;

            @org.jetbrains.annotations.NotNull
            private final java.util.List<kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1>> c;

            @org.jetbrains.annotations.NotNull
            private kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1> d;
            final /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k1.a e;

            public C0043a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k1.a r2, @org.jetbrains.annotations.Nullable java.lang.String r3, java.lang.String r4) {
                    r1 = this;
                    java.lang.String r0 = "functionName"
                    kotlin.jvm.internal.g0.p(r3, r0)
                    r1.e = r2
                    r1.<init>()
                    r1.a = r3
                    r1.b = r4
                    java.util.ArrayList r2 = new java.util.ArrayList
                    r2.<init>()
                    r1.c = r2
                    java.lang.String r2 = "V"
                    r3 = 0
                    kotlin.Pair r2 = kotlin.o0.a(r2, r3)
                    r1.d = r2
                    return
            }

            @org.jetbrains.annotations.NotNull
            public final kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d1> a() {
                    r7 = this;
                    kotlin.reflect.jvm.internal.impl.load.kotlin.f0 r0 = kotlin.reflect.jvm.internal.impl.load.kotlin.f0.a
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k1$a r1 = r7.e
                    java.lang.String r1 = r1.c()
                    java.lang.String r2 = r7.a
                    java.util.List<kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1>> r3 = r7.c
                    java.lang.Iterable r3 = (java.lang.Iterable) r3
                    java.util.ArrayList r4 = new java.util.ArrayList
                    r5 = 10
                    int r6 = kotlin.collections.f0.d0(r3, r5)
                    r4.<init>(r6)
                    java.util.Iterator r3 = r3.iterator()
                L1d:
                    boolean r6 = r3.hasNext()
                    if (r6 == 0) goto L33
                    java.lang.Object r6 = r3.next()
                    kotlin.Pair r6 = (kotlin.Pair) r6
                    java.lang.Object r6 = r6.getFirst()
                    java.lang.String r6 = (java.lang.String) r6
                    r4.add(r6)
                    goto L1d
                L33:
                    kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1> r3 = r7.d
                    java.lang.Object r3 = r3.getFirst()
                    java.lang.String r3 = (java.lang.String) r3
                    java.lang.String r2 = r0.k(r2, r4, r3)
                    java.lang.String r0 = r0.m(r1, r2)
                    kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1> r1 = r7.d
                    java.lang.Object r1 = r1.getSecond()
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r1 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1) r1
                    java.util.List<kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1>> r2 = r7.c
                    java.lang.Iterable r2 = (java.lang.Iterable) r2
                    java.util.ArrayList r3 = new java.util.ArrayList
                    int r4 = kotlin.collections.f0.d0(r2, r5)
                    r3.<init>(r4)
                    java.util.Iterator r2 = r2.iterator()
                L5c:
                    boolean r4 = r2.hasNext()
                    if (r4 == 0) goto L72
                    java.lang.Object r4 = r2.next()
                    kotlin.Pair r4 = (kotlin.Pair) r4
                    java.lang.Object r4 = r4.getSecond()
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r4 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1) r4
                    r3.add(r4)
                    goto L5c
                L72:
                    java.lang.String r2 = r7.b
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d1 r4 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d1
                    r4.<init>(r1, r3, r2)
                    kotlin.Pair r0 = kotlin.o0.a(r0, r4)
                    return r0
            }

            public final void b(@org.jetbrains.annotations.NotNull java.lang.String r5, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h... r6) {
                    r4 = this;
                    java.lang.String r0 = "type"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    java.lang.String r0 = "qualifiers"
                    kotlin.jvm.internal.g0.p(r6, r0)
                    java.util.List<kotlin.Pair<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1>> r0 = r4.c
                    java.util.Collection r0 = (java.util.Collection) r0
                    int r1 = r6.length
                    if (r1 != 0) goto L13
                    r6 = 0
                    goto L53
                L13:
                    java.lang.Iterable r6 = kotlin.collections.n.Yz(r6)
                    r1 = 10
                    int r1 = kotlin.collections.f0.d0(r6, r1)
                    int r1 = kotlin.collections.i1.j(r1)
                    r2 = 16
                    int r1 = kotlin.ranges.t.u(r1, r2)
                    java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
                    r2.<init>(r1)
                    java.util.Iterator r6 = r6.iterator()
                L30:
                    boolean r1 = r6.hasNext()
                    if (r1 == 0) goto L4e
                    java.lang.Object r1 = r6.next()
                    kotlin.collections.a1 r1 = (kotlin.collections.a1) r1
                    int r3 = r1.e()
                    java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
                    java.lang.Object r1 = r1.f()
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r1 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h) r1
                    r2.put(r3, r1)
                    goto L30
                L4e:
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r6 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1
                    r6.<init>(r2)
                L53:
                    kotlin.Pair r5 = kotlin.o0.a(r5, r6)
                    r0.add(r5)
                    return
            }

            public final void c(@org.jetbrains.annotations.NotNull java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h... r5) {
                    r3 = this;
                    java.lang.String r0 = "type"
                    kotlin.jvm.internal.g0.p(r4, r0)
                    java.lang.String r0 = "qualifiers"
                    kotlin.jvm.internal.g0.p(r5, r0)
                    java.lang.Iterable r5 = kotlin.collections.n.Yz(r5)
                    r0 = 10
                    int r0 = kotlin.collections.f0.d0(r5, r0)
                    int r0 = kotlin.collections.i1.j(r0)
                    r1 = 16
                    int r0 = kotlin.ranges.t.u(r0, r1)
                    java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
                    r1.<init>(r0)
                    java.util.Iterator r5 = r5.iterator()
                L27:
                    boolean r0 = r5.hasNext()
                    if (r0 == 0) goto L45
                    java.lang.Object r0 = r5.next()
                    kotlin.collections.a1 r0 = (kotlin.collections.a1) r0
                    int r2 = r0.e()
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    java.lang.Object r0 = r0.f()
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h r0 = (kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.h) r0
                    r1.put(r2, r0)
                    goto L27
                L45:
                    kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1 r5 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.n1
                    r5.<init>(r1)
                    kotlin.Pair r4 = kotlin.o0.a(r4, r5)
                    r3.d = r4
                    return
            }

            public final void d(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType r2) {
                    r1 = this;
                    java.lang.String r0 = "type"
                    kotlin.jvm.internal.g0.p(r2, r0)
                    java.lang.String r2 = r2.getDesc()
                    java.lang.String r0 = "getDesc(...)"
                    kotlin.jvm.internal.g0.o(r2, r0)
                    r0 = 0
                    kotlin.Pair r2 = kotlin.o0.a(r2, r0)
                    r1.d = r2
                    return
            }
        }

        public a(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k1 r2, java.lang.String r3) {
                r1 = this;
                java.lang.String r0 = "className"
                kotlin.jvm.internal.g0.p(r3, r0)
                r1.b = r2
                r1.<init>()
                r1.a = r3
                return
        }

        public static /* synthetic */ void b(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k1.a r0, java.lang.String r1, java.lang.String r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
                r4 = r4 & 2
                if (r4 == 0) goto L5
                r2 = 0
            L5:
                r0.a(r1, r2, r3)
                return
        }

        public final void a(@org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.Nullable java.lang.String r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k1.a.C0043a, kotlin.n1> r5) {
                r2 = this;
                java.lang.String r0 = "name"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "block"
                kotlin.jvm.internal.g0.p(r5, r0)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k1 r0 = r2.b
                java.util.Map r0 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k1.a(r0)
                kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k1$a$a r1 = new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k1$a$a
                r1.<init>(r2, r3, r4)
                r5.invoke(r1)
                kotlin.Pair r3 = r1.a()
                java.lang.Object r4 = r3.getFirst()
                java.lang.Object r3 = r3.getSecond()
                r0.put(r4, r3)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String c() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }
    }

    public k1() {
            r1 = this;
            r1.<init>()
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1.a = r0
            return
    }

    public static final /* synthetic */ java.util.Map a(kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.k1 r0) {
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d1> r0 = r0.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d1> b() {
            r1 = this;
            java.util.Map<java.lang.String, kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.d1> r0 = r1.a
            return r0
    }
}

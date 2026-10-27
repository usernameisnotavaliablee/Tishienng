package kotlin.reflect.jvm.internal.impl.builtins.functions;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nFunctionTypeKindExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionTypeKindExtractor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionTypeKindExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,70:1\n1491#2:71\n1516#2,3:72\n1519#2,3:82\n1761#2,3:85\n382#3,7:75\n*S KotlinDebug\n*F\n+ 1 FunctionTypeKindExtractor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionTypeKindExtractor\n*L\n32#1:71\n32#1:72,3\n32#1:82,3\n54#1:85,3\n32#1:75,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.builtins.functions.f.a c = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.builtins.functions.f d = null;

    @org.jetbrains.annotations.NotNull
    private final java.util.List<kotlin.reflect.jvm.internal.impl.builtins.functions.e> a;

    @org.jetbrains.annotations.NotNull
    private final java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, java.util.List<kotlin.reflect.jvm.internal.impl.builtins.functions.e>> b;

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
        public final kotlin.reflect.jvm.internal.impl.builtins.functions.f a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.builtins.functions.f r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.f.a()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b {

        @org.jetbrains.annotations.NotNull
        private final kotlin.reflect.jvm.internal.impl.builtins.functions.e a;
        private final int b;

        public b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.builtins.functions.e r2, int r3) {
                r1 = this;
                java.lang.String r0 = "kind"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.builtins.functions.e a() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.builtins.functions.e r0 = r1.a
                return r0
        }

        public final int b() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.builtins.functions.e c() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.builtins.functions.e r0 = r1.a
                return r0
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r4 != r5) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.builtins.functions.f.b
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                kotlin.reflect.jvm.internal.impl.builtins.functions.f$b r5 = (kotlin.reflect.jvm.internal.impl.builtins.functions.f.b) r5
                kotlin.reflect.jvm.internal.impl.builtins.functions.e r1 = r4.a
                kotlin.reflect.jvm.internal.impl.builtins.functions.e r3 = r5.a
                boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
                if (r1 != 0) goto L17
                return r2
            L17:
                int r1 = r4.b
                int r5 = r5.b
                if (r1 == r5) goto L1e
                return r2
            L1e:
                return r0
        }

        public int hashCode() {
                r2 = this;
                kotlin.reflect.jvm.internal.impl.builtins.functions.e r0 = r2.a
                int r0 = r0.hashCode()
                int r0 = r0 * 31
                int r1 = r2.b
                int r0 = r0 + r1
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "KindWithArity(kind="
                r0.append(r1)
                kotlin.reflect.jvm.internal.impl.builtins.functions.e r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ", arity="
                r0.append(r1)
                int r1 = r2.b
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.builtins.functions.f$a r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.f$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.builtins.functions.f.c = r0
            kotlin.reflect.jvm.internal.impl.builtins.functions.f r0 = new kotlin.reflect.jvm.internal.impl.builtins.functions.f
            r1 = 4
            kotlin.reflect.jvm.internal.impl.builtins.functions.e[] r1 = new kotlin.reflect.jvm.internal.impl.builtins.functions.e[r1]
            kotlin.reflect.jvm.internal.impl.builtins.functions.e$a r2 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.a.f
            r3 = 0
            r1[r3] = r2
            kotlin.reflect.jvm.internal.impl.builtins.functions.e$d r2 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.d.f
            r3 = 1
            r1[r3] = r2
            kotlin.reflect.jvm.internal.impl.builtins.functions.e$b r2 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.b.f
            r3 = 2
            r1[r3] = r2
            kotlin.reflect.jvm.internal.impl.builtins.functions.e$c r2 = kotlin.reflect.jvm.internal.impl.builtins.functions.e.c.f
            r3 = 3
            r1[r3] = r2
            java.util.List r1 = kotlin.collections.f0.Q(r1)
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.builtins.functions.f.d = r0
            return
    }

    public f(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.builtins.functions.e> r5) {
            r4 = this;
            java.lang.String r0 = "kinds"
            kotlin.jvm.internal.g0.p(r5, r0)
            r4.<init>()
            r4.a = r5
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            java.util.Iterator r5 = r5.iterator()
        L15:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3a
            java.lang.Object r1 = r5.next()
            r2 = r1
            kotlin.reflect.jvm.internal.impl.builtins.functions.e r2 = (kotlin.reflect.jvm.internal.impl.builtins.functions.e) r2
            kotlin.reflect.jvm.internal.impl.name.c r2 = r2.b()
            java.lang.Object r3 = r0.get(r2)
            if (r3 != 0) goto L34
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.put(r2, r3)
        L34:
            java.util.List r3 = (java.util.List) r3
            r3.add(r1)
            goto L15
        L3a:
            r4.b = r0
            return
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.builtins.functions.f a() {
            kotlin.reflect.jvm.internal.impl.builtins.functions.f r0 = kotlin.reflect.jvm.internal.impl.builtins.functions.f.d
            return r0
    }

    private final java.lang.Integer d(java.lang.String r7) {
            r6 = this;
            int r0 = r7.length()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r7.length()
            r2 = 0
            r3 = 0
        Le:
            if (r2 >= r0) goto L23
            char r4 = r7.charAt(r2)
            int r4 = r4 + (-48)
            if (r4 < 0) goto L22
            r5 = 10
            if (r4 >= r5) goto L22
            int r3 = r3 * 10
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto Le
        L22:
            return r1
        L23:
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            return r7
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.builtins.functions.e b(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r2, @org.jetbrains.annotations.NotNull java.lang.String r3) {
            r1 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "className"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.reflect.jvm.internal.impl.builtins.functions.f$b r2 = r1.c(r2, r3)
            if (r2 == 0) goto L15
            kotlin.reflect.jvm.internal.impl.builtins.functions.e r2 = r2.c()
            return r2
        L15:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final kotlin.reflect.jvm.internal.impl.builtins.functions.f.b c(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.name.c r6, @org.jetbrains.annotations.NotNull java.lang.String r7) {
            r5 = this;
            java.lang.String r0 = "packageFqName"
            kotlin.jvm.internal.g0.p(r6, r0)
            java.lang.String r0 = "className"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.util.Map<kotlin.reflect.jvm.internal.impl.name.c, java.util.List<kotlin.reflect.jvm.internal.impl.builtins.functions.e>> r0 = r5.b
            java.lang.Object r6 = r0.get(r6)
            java.util.List r6 = (java.util.List) r6
            r0 = 0
            if (r6 != 0) goto L16
            return r0
        L16:
            java.util.Iterator r6 = r6.iterator()
        L1a:
            boolean r1 = r6.hasNext()
            if (r1 == 0) goto L53
            java.lang.Object r1 = r6.next()
            kotlin.reflect.jvm.internal.impl.builtins.functions.e r1 = (kotlin.reflect.jvm.internal.impl.builtins.functions.e) r1
            java.lang.String r2 = r1.a()
            r3 = 0
            r4 = 2
            boolean r2 = kotlin.text.u.H2(r7, r2, r3, r4, r0)
            if (r2 == 0) goto L1a
            java.lang.String r2 = r1.a()
            int r2 = r2.length()
            java.lang.String r2 = r7.substring(r2)
            java.lang.String r3 = "substring(...)"
            kotlin.jvm.internal.g0.o(r2, r3)
            java.lang.Integer r2 = r5.d(r2)
            if (r2 == 0) goto L1a
            int r6 = r2.intValue()
            kotlin.reflect.jvm.internal.impl.builtins.functions.f$b r7 = new kotlin.reflect.jvm.internal.impl.builtins.functions.f$b
            r7.<init>(r1, r6)
            return r7
        L53:
            return r0
    }
}

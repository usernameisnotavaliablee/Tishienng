package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,133:1\n105#1,9:134\n105#1,9:143\n105#1,9:152\n774#2:161\n865#2,2:162\n*S KotlinDebug\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes\n*L\n74#1:134,9\n78#1:143,9\n82#1:152,9\n99#1:161\n99#1:162,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t1 extends kotlin.reflect.jvm.internal.impl.util.e<kotlin.reflect.jvm.internal.impl.types.r1<?>, kotlin.reflect.jvm.internal.impl.types.r1<?>> implements java.lang.Iterable<kotlin.reflect.jvm.internal.impl.types.r1<?>>, l3.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.types.t1.a b = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.reflect.jvm.internal.impl.types.t1 c = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAttributes.kt\norg/jetbrains/kotlin/types/TypeAttributes$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n1#2:134\n*E\n"})
    public static final class a extends kotlin.reflect.jvm.internal.impl.util.z<kotlin.reflect.jvm.internal.impl.types.r1<?>, kotlin.reflect.jvm.internal.impl.types.r1<?>> {
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

        public static final /* synthetic */ java.util.Collection i(kotlin.reflect.jvm.internal.impl.types.t1.a r0) {
                java.util.Collection r0 = r0.h()
                return r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.util.z
        public int c(@org.jetbrains.annotations.NotNull java.util.concurrent.ConcurrentHashMap<java.lang.String, java.lang.Integer> r2, @org.jetbrains.annotations.NotNull java.lang.String r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.String, java.lang.Integer> r4) {
                r1 = this;
                java.lang.String r0 = "<this>"
                kotlin.jvm.internal.g0.p(r2, r0)
                java.lang.String r0 = "key"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.String r0 = "compute"
                kotlin.jvm.internal.g0.p(r4, r0)
                java.lang.Object r0 = r2.get(r3)
                java.lang.Integer r0 = (java.lang.Integer) r0
                if (r0 == 0) goto L1c
                int r2 = r0.intValue()
                return r2
            L1c:
                monitor-enter(r2)
                java.lang.Object r0 = r2.get(r3)     // Catch: java.lang.Throwable -> L2a
                java.lang.Integer r0 = (java.lang.Integer) r0     // Catch: java.lang.Throwable -> L2a
                if (r0 == 0) goto L2c
                int r3 = r0.intValue()     // Catch: java.lang.Throwable -> L2a
                goto L44
            L2a:
                r3 = move-exception
                goto L46
            L2c:
                java.lang.Object r4 = r4.invoke(r3)     // Catch: java.lang.Throwable -> L2a
                r0 = r4
                java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.lang.Throwable -> L2a
                int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L2a
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> L2a
                r2.putIfAbsent(r3, r0)     // Catch: java.lang.Throwable -> L2a
                java.lang.Number r4 = (java.lang.Number) r4     // Catch: java.lang.Throwable -> L2a
                int r3 = r4.intValue()     // Catch: java.lang.Throwable -> L2a
            L44:
                monitor-exit(r2)
                return r3
            L46:
                monitor-exit(r2)
                throw r3
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.types.t1 j(@org.jetbrains.annotations.NotNull java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.r1<?>> r3) {
                r2 = this;
                java.lang.String r0 = "attributes"
                kotlin.jvm.internal.g0.p(r3, r0)
                boolean r0 = r3.isEmpty()
                if (r0 == 0) goto L10
                kotlin.reflect.jvm.internal.impl.types.t1 r3 = r2.k()
                return r3
            L10:
                kotlin.reflect.jvm.internal.impl.types.t1 r0 = new kotlin.reflect.jvm.internal.impl.types.t1
                r1 = 0
                r0.<init>(r3, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.reflect.jvm.internal.impl.types.t1 k() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.types.t1 r0 = kotlin.reflect.jvm.internal.impl.types.t1.j()
                return r0
        }
    }

    static {
            kotlin.reflect.jvm.internal.impl.types.t1$a r0 = new kotlin.reflect.jvm.internal.impl.types.t1$a
            r1 = 0
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.t1.b = r0
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = new kotlin.reflect.jvm.internal.impl.types.t1
            java.util.List r1 = kotlin.collections.f0.J()
            r0.<init>(r1)
            kotlin.reflect.jvm.internal.impl.types.t1.c = r0
            return
    }

    private t1(java.util.List<? extends kotlin.reflect.jvm.internal.impl.types.r1<?>> r3) {
            r2 = this;
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
        L7:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r3.next()
            kotlin.reflect.jvm.internal.impl.types.r1 r0 = (kotlin.reflect.jvm.internal.impl.types.r1) r0
            kotlin.reflect.d r1 = r0.b()
            r2.f(r1, r0)
            goto L7
        L1b:
            return
    }

    public /* synthetic */ t1(java.util.List r1, kotlin.jvm.internal.v r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private t1(kotlin.reflect.jvm.internal.impl.types.r1<?> r1) {
            r0 = this;
            java.util.List r1 = kotlin.collections.f0.l(r1)
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ kotlin.reflect.jvm.internal.impl.types.t1 j() {
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = kotlin.reflect.jvm.internal.impl.types.t1.c
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.a
    @org.jetbrains.annotations.NotNull
    protected kotlin.reflect.jvm.internal.impl.util.z<kotlin.reflect.jvm.internal.impl.types.r1<?>, kotlin.reflect.jvm.internal.impl.types.r1<?>> d() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.types.t1$a r0 = kotlin.reflect.jvm.internal.impl.types.t1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t1 m(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r6) {
            r5 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L12
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L12
            return r5
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.t1$a r1 = kotlin.reflect.jvm.internal.impl.types.t1.b
            java.util.Collection r1 = kotlin.reflect.jvm.internal.impl.types.t1.a.i(r1)
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            kotlin.reflect.jvm.internal.impl.util.c r3 = r5.a()
            java.lang.Object r3 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.types.r1 r3 = (kotlin.reflect.jvm.internal.impl.types.r1) r3
            kotlin.reflect.jvm.internal.impl.util.c r4 = r6.a()
            java.lang.Object r2 = r4.get(r2)
            kotlin.reflect.jvm.internal.impl.types.r1 r2 = (kotlin.reflect.jvm.internal.impl.types.r1) r2
            if (r3 != 0) goto L50
            if (r2 == 0) goto L4e
            kotlin.reflect.jvm.internal.impl.types.r1 r2 = r2.a(r3)
            goto L54
        L4e:
            r2 = 0
            goto L54
        L50:
            kotlin.reflect.jvm.internal.impl.types.r1 r2 = r3.a(r2)
        L54:
            kotlin.reflect.jvm.internal.impl.utils.a.a(r0, r2)
            goto L21
        L58:
            kotlin.reflect.jvm.internal.impl.types.t1$a r6 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r6 = r6.j(r0)
            return r6
    }

    public final boolean n(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.r1<?> r2) {
            r1 = this;
            java.lang.String r0 = "attribute"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.reflect.jvm.internal.impl.types.t1$a r0 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.d r2 = r2.b()
            int r2 = r0.f(r2)
            kotlin.reflect.jvm.internal.impl.util.c r0 = r1.a()
            java.lang.Object r2 = r0.get(r2)
            if (r2 == 0) goto L1b
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t1 o(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.t1 r6) {
            r5 = this;
            java.lang.String r0 = "other"
            kotlin.jvm.internal.g0.p(r6, r0)
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L12
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L12
            return r5
        L12:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.t1$a r1 = kotlin.reflect.jvm.internal.impl.types.t1.b
            java.util.Collection r1 = kotlin.reflect.jvm.internal.impl.types.t1.a.i(r1)
            java.util.Iterator r1 = r1.iterator()
        L21:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L58
            java.lang.Object r2 = r1.next()
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            kotlin.reflect.jvm.internal.impl.util.c r3 = r5.a()
            java.lang.Object r3 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.types.r1 r3 = (kotlin.reflect.jvm.internal.impl.types.r1) r3
            kotlin.reflect.jvm.internal.impl.util.c r4 = r6.a()
            java.lang.Object r2 = r4.get(r2)
            kotlin.reflect.jvm.internal.impl.types.r1 r2 = (kotlin.reflect.jvm.internal.impl.types.r1) r2
            if (r3 != 0) goto L50
            if (r2 == 0) goto L4e
            kotlin.reflect.jvm.internal.impl.types.r1 r2 = r2.c(r3)
            goto L54
        L4e:
            r2 = 0
            goto L54
        L50:
            kotlin.reflect.jvm.internal.impl.types.r1 r2 = r3.c(r2)
        L54:
            kotlin.reflect.jvm.internal.impl.utils.a.a(r0, r2)
            goto L21
        L58:
            kotlin.reflect.jvm.internal.impl.types.t1$a r6 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r6 = r6.j(r0)
            return r6
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t1 p(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.r1<?> r2) {
            r1 = this;
            java.lang.String r0 = "attribute"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.n(r2)
            if (r0 == 0) goto Lc
            return r1
        Lc:
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L18
            kotlin.reflect.jvm.internal.impl.types.t1 r0 = new kotlin.reflect.jvm.internal.impl.types.t1
            r0.<init>(r2)
            return r0
        L18:
            java.util.List r0 = kotlin.collections.f0.a6(r1)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.List r2 = kotlin.collections.f0.J4(r0, r2)
            kotlin.reflect.jvm.internal.impl.types.t1$a r0 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r2 = r0.j(r2)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.reflect.jvm.internal.impl.types.t1 q(@org.jetbrains.annotations.NotNull kotlin.reflect.jvm.internal.impl.types.r1<?> r5) {
            r4 = this;
            java.lang.String r0 = "attribute"
            kotlin.jvm.internal.g0.p(r5, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lc
            goto L3e
        Lc:
            kotlin.reflect.jvm.internal.impl.util.c r0 = r4.a()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L30
            java.lang.Object r2 = r0.next()
            r3 = r2
            kotlin.reflect.jvm.internal.impl.types.r1 r3 = (kotlin.reflect.jvm.internal.impl.types.r1) r3
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r5)
            if (r3 != 0) goto L19
            r1.add(r2)
            goto L19
        L30:
            int r5 = r1.size()
            kotlin.reflect.jvm.internal.impl.util.c r0 = r4.a()
            int r0 = r0.a()
            if (r5 != r0) goto L3f
        L3e:
            return r4
        L3f:
            kotlin.reflect.jvm.internal.impl.types.t1$a r5 = kotlin.reflect.jvm.internal.impl.types.t1.b
            kotlin.reflect.jvm.internal.impl.types.t1 r5 = r5.j(r1)
            return r5
    }
}

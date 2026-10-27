package kotlin.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,200:1\n1#2:201\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class CombinedContext implements kotlin.coroutines.i, java.io.Serializable {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i.b element;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i left;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCoroutineContextImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,200:1\n13216#2,3:201\n*S KotlinDebug\n*F\n+ 1 CoroutineContextImpl.kt\nkotlin/coroutines/CombinedContext$Serialized\n*L\n197#1:201,3\n*E\n"})
    private static final class a implements java.io.Serializable {

        @org.jetbrains.annotations.NotNull
        public static final kotlin.coroutines.CombinedContext.a.C0015a b = null;
        private static final long serialVersionUID = 0;

        @org.jetbrains.annotations.NotNull
        private final kotlin.coroutines.i[] a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.coroutines.CombinedContext$a$a, reason: collision with other inner class name */
        public static final class C0015a {
            private C0015a() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            public /* synthetic */ C0015a(kotlin.jvm.internal.v r1) {
                    r0 = this;
                    r0.<init>()
                    return
            }
        }

        static {
                kotlin.coroutines.CombinedContext$a$a r0 = new kotlin.coroutines.CombinedContext$a$a
                r1 = 0
                r0.<init>(r1)
                kotlin.coroutines.CombinedContext.a.b = r0
                return
        }

        public a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i[] r2) {
                r1 = this;
                java.lang.String r0 = "elements"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                return
        }

        private final java.lang.Object readResolve() {
                r5 = this;
                kotlin.coroutines.i[] r0 = r5.a
                kotlin.coroutines.EmptyCoroutineContext r1 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
                int r2 = r0.length
                r3 = 0
            L6:
                if (r3 >= r2) goto L11
                r4 = r0[r3]
                kotlin.coroutines.i r1 = r1.plus(r4)
                int r3 = r3 + 1
                goto L6
            L11:
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.i[] a() {
                r1 = this;
                kotlin.coroutines.i[] r0 = r1.a
                return r0
        }
    }

    public CombinedContext(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r3) {
            r1 = this;
            java.lang.String r0 = "left"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r3, r0)
            r1.<init>()
            r1.left = r2
            r1.element = r3
            return
    }

    private final boolean contains(kotlin.coroutines.i.b r2) {
            r1 = this;
            kotlin.coroutines.i$c r0 = r2.getKey()
            kotlin.coroutines.i$b r0 = r1.get(r0)
            boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
            return r2
    }

    private final boolean containsAll(kotlin.coroutines.CombinedContext r2) {
            r1 = this;
        L0:
            kotlin.coroutines.i$b r0 = r2.element
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            kotlin.coroutines.i r2 = r2.left
            boolean r0 = r2 instanceof kotlin.coroutines.CombinedContext
            if (r0 == 0) goto L13
            kotlin.coroutines.CombinedContext r2 = (kotlin.coroutines.CombinedContext) r2
            goto L0
        L13:
            java.lang.String r0 = "null cannot be cast to non-null type kotlin.coroutines.CoroutineContext.Element"
            kotlin.jvm.internal.g0.n(r2, r0)
            kotlin.coroutines.i$b r2 = (kotlin.coroutines.i.b) r2
            boolean r2 = r1.contains(r2)
            return r2
    }

    public static /* synthetic */ kotlin.n1 h(kotlin.coroutines.i[] r0, kotlin.jvm.internal.Ref.IntRef r1, kotlin.n1 r2, kotlin.coroutines.i.b r3) {
            kotlin.n1 r0 = writeReplace$lambda$0(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ java.lang.String i(java.lang.String r0, kotlin.coroutines.i.b r1) {
            java.lang.String r0 = toString$lambda$0(r0, r1)
            return r0
    }

    private final void readObject(java.io.ObjectInputStream r2) {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Deserialization is supported via proxy only"
            r2.<init>(r0)
            throw r2
    }

    private final int size() {
            r3 = this;
            r0 = 2
            r1 = r3
        L2:
            kotlin.coroutines.i r1 = r1.left
            boolean r2 = r1 instanceof kotlin.coroutines.CombinedContext
            if (r2 == 0) goto Lb
            kotlin.coroutines.CombinedContext r1 = (kotlin.coroutines.CombinedContext) r1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            if (r1 != 0) goto Lf
            return r0
        Lf:
            int r0 = r0 + 1
            goto L2
    }

    private static final java.lang.String toString$lambda$0(java.lang.String r1, kotlin.coroutines.i.b r2) {
            java.lang.String r0 = "acc"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "element"
            kotlin.jvm.internal.g0.p(r2, r0)
            int r0 = r1.length()
            if (r0 != 0) goto L15
            java.lang.String r1 = r2.toString()
            return r1
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private final java.lang.Object writeReplace() {
            r5 = this;
            int r0 = r5.size()
            kotlin.coroutines.i[] r1 = new kotlin.coroutines.i[r0]
            kotlin.jvm.internal.Ref$IntRef r2 = new kotlin.jvm.internal.Ref$IntRef
            r2.<init>()
            kotlin.n1 r3 = kotlin.n1.a
            kotlin.coroutines.c r4 = new kotlin.coroutines.c
            r4.<init>(r1, r2)
            r5.fold(r3, r4)
            int r2 = r2.element
            if (r2 != r0) goto L1f
            kotlin.coroutines.CombinedContext$a r0 = new kotlin.coroutines.CombinedContext$a
            r0.<init>(r1)
            return r0
        L1f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Check failed."
            r0.<init>(r1)
            throw r0
    }

    private static final kotlin.n1 writeReplace$lambda$0(kotlin.coroutines.i[] r1, kotlin.jvm.internal.Ref.IntRef r2, kotlin.n1 r3, kotlin.coroutines.i.b r4) {
            java.lang.String r0 = "<unused var>"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r3 = "element"
            kotlin.jvm.internal.g0.p(r4, r3)
            int r3 = r2.element
            int r0 = r3 + 1
            r2.element = r0
            r1[r3] = r4
            kotlin.n1 r1 = kotlin.n1.a
            return r1
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            if (r2 == r3) goto L1b
            boolean r0 = r3 instanceof kotlin.coroutines.CombinedContext
            if (r0 == 0) goto L19
            kotlin.coroutines.CombinedContext r3 = (kotlin.coroutines.CombinedContext) r3
            int r0 = r3.size()
            int r1 = r2.size()
            if (r0 != r1) goto L19
            boolean r3 = r3.containsAll(r2)
            if (r3 == 0) goto L19
            goto L1b
        L19:
            r3 = 0
            return r3
        L1b:
            r3 = 1
            return r3
    }

    @Override // kotlin.coroutines.i
    public <R> R fold(R r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r3) {
            r1 = this;
            java.lang.String r0 = "operation"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.coroutines.i r0 = r1.left
            java.lang.Object r2 = r0.fold(r2, r3)
            kotlin.coroutines.i$b r0 = r1.element
            java.lang.Object r2 = r3.invoke(r2, r0)
            return r2
    }

    @Override // kotlin.coroutines.i
    @org.jetbrains.annotations.Nullable
    public <E extends kotlin.coroutines.i.b> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = r2
        L6:
            kotlin.coroutines.i$b r1 = r0.element
            kotlin.coroutines.i$b r1 = r1.get(r3)
            if (r1 == 0) goto Lf
            return r1
        Lf:
            kotlin.coroutines.i r0 = r0.left
            boolean r1 = r0 instanceof kotlin.coroutines.CombinedContext
            if (r1 == 0) goto L18
            kotlin.coroutines.CombinedContext r0 = (kotlin.coroutines.CombinedContext) r0
            goto L6
        L18:
            kotlin.coroutines.i$b r3 = r0.get(r3)
            return r3
    }

    public int hashCode() {
            r2 = this;
            kotlin.coroutines.i r0 = r2.left
            int r0 = r0.hashCode()
            kotlin.coroutines.i$b r1 = r2.element
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            return r0
    }

    @Override // kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r3) {
            r2 = this;
            java.lang.String r0 = "key"
            kotlin.jvm.internal.g0.p(r3, r0)
            kotlin.coroutines.i$b r0 = r2.element
            kotlin.coroutines.i$b r0 = r0.get(r3)
            if (r0 == 0) goto L10
            kotlin.coroutines.i r3 = r2.left
            return r3
        L10:
            kotlin.coroutines.i r0 = r2.left
            kotlin.coroutines.i r3 = r0.minusKey(r3)
            kotlin.coroutines.i r0 = r2.left
            if (r3 != r0) goto L1b
            return r2
        L1b:
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
            if (r3 != r0) goto L22
            kotlin.coroutines.i$b r3 = r2.element
            return r3
        L22:
            kotlin.coroutines.CombinedContext r0 = new kotlin.coroutines.CombinedContext
            kotlin.coroutines.i$b r1 = r2.element
            r0.<init>(r3, r1)
            return r0
    }

    @Override // kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    public /* bridge */ kotlin.coroutines.i plus(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            r0 = this;
            kotlin.coroutines.i r1 = kotlin.coroutines.i.a.b(r0, r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            kotlin.coroutines.d r1 = new kotlin.coroutines.d
            r1.<init>()
            java.lang.String r2 = ""
            java.lang.Object r1 = r3.fold(r2, r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

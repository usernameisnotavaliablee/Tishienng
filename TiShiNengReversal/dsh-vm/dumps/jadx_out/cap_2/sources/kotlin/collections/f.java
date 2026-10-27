package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.1")
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,153:1\n1761#2,3:154\n1740#2,3:157\n295#2,2:160\n*S KotlinDebug\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap\n*L\n28#1:154,3\n60#1:157,3\n141#1:160,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class f<K, V> implements java.util.Map<K, V>, l3.a {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.f.a c = null;

    @org.jetbrains.annotations.Nullable
    private volatile java.util.Set<? extends K> a;

    @org.jetbrains.annotations.Nullable
    private volatile java.util.Collection<? extends V> b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAbstractMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractMap.kt\nkotlin/collections/AbstractMap$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,153:1\n1#2:154\n*E\n"})
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

        public final boolean a(@org.jetbrains.annotations.NotNull java.util.Map.Entry<?, ?> r4, @org.jetbrains.annotations.Nullable java.lang.Object r5) {
                r3 = this;
                java.lang.String r0 = "e"
                kotlin.jvm.internal.g0.p(r4, r0)
                boolean r0 = r5 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto Lb
                return r1
            Lb:
                java.lang.Object r0 = r4.getKey()
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                java.lang.Object r2 = r5.getKey()
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
                if (r0 == 0) goto L2b
                java.lang.Object r4 = r4.getValue()
                java.lang.Object r5 = r5.getValue()
                boolean r4 = kotlin.jvm.internal.g0.g(r4, r5)
                if (r4 == 0) goto L2b
                r4 = 1
                return r4
            L2b:
                return r1
        }

        public final int b(@org.jetbrains.annotations.NotNull java.util.Map.Entry<?, ?> r3) {
                r2 = this;
                java.lang.String r0 = "e"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.Object r0 = r3.getKey()
                r1 = 0
                if (r0 == 0) goto L11
                int r0 = r0.hashCode()
                goto L12
            L11:
                r0 = 0
            L12:
                java.lang.Object r3 = r3.getValue()
                if (r3 == 0) goto L1c
                int r1 = r3.hashCode()
            L1c:
                r3 = r0 ^ r1
                return r3
        }

        @org.jetbrains.annotations.NotNull
        public final java.lang.String c(@org.jetbrains.annotations.NotNull java.util.Map.Entry<?, ?> r3) {
                r2 = this;
                java.lang.String r0 = "e"
                kotlin.jvm.internal.g0.p(r3, r0)
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r3.getKey()
                r0.append(r1)
                r1 = 61
                r0.append(r1)
                java.lang.Object r3 = r3.getValue()
                r0.append(r3)
                java.lang.String r3 = r0.toString()
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b extends kotlin.collections.k<K> {
        final /* synthetic */ kotlin.collections.f<K, V> b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class a implements java.util.Iterator<K>, l3.a {
            final /* synthetic */ java.util.Iterator<java.util.Map.Entry<K, V>> a;

            a(java.util.Iterator<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Iterator<java.util.Map$Entry<K, V>> r0 = r1.a
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            public K next() {
                    r1 = this;
                    java.util.Iterator<java.util.Map$Entry<K, V>> r0 = r1.a
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r0 = r0.getKey()
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r2 = this;
                    java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                    java.lang.String r1 = "Operation is not supported for read-only collection"
                    r0.<init>(r1)
                    throw r0
            }
        }

        b(kotlin.collections.f<K, ? extends V> r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                kotlin.collections.f<K, V> r0 = r1.b
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // kotlin.collections.b
        public int getSize() {
                r1 = this;
                kotlin.collections.f<K, V> r0 = r1.b
                int r0 = r0.size()
                return r0
        }

        @Override // kotlin.collections.k, kotlin.collections.b, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<K> iterator() {
                r2 = this;
                kotlin.collections.f<K, V> r0 = r2.b
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                kotlin.collections.f$b$a r1 = new kotlin.collections.f$b$a
                r1.<init>(r0)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c extends kotlin.collections.b<V> {
        final /* synthetic */ kotlin.collections.f<K, V> a;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        public static final class a implements java.util.Iterator<V>, l3.a {
            final /* synthetic */ java.util.Iterator<java.util.Map.Entry<K, V>> a;

            a(java.util.Iterator<? extends java.util.Map.Entry<? extends K, ? extends V>> r1) {
                    r0 = this;
                    r0.a = r1
                    r0.<init>()
                    return
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r1 = this;
                    java.util.Iterator<java.util.Map$Entry<K, V>> r0 = r1.a
                    boolean r0 = r0.hasNext()
                    return r0
            }

            @Override // java.util.Iterator
            public V next() {
                    r1 = this;
                    java.util.Iterator<java.util.Map$Entry<K, V>> r0 = r1.a
                    java.lang.Object r0 = r0.next()
                    java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                    java.lang.Object r0 = r0.getValue()
                    return r0
            }

            @Override // java.util.Iterator
            public void remove() {
                    r2 = this;
                    java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                    java.lang.String r1 = "Operation is not supported for read-only collection"
                    r0.<init>(r1)
                    throw r0
            }
        }

        c(kotlin.collections.f<K, ? extends V> r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // kotlin.collections.b, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                kotlin.collections.f<K, V> r0 = r1.a
                boolean r2 = r0.containsValue(r2)
                return r2
        }

        @Override // kotlin.collections.b
        public int getSize() {
                r1 = this;
                kotlin.collections.f<K, V> r0 = r1.a
                int r0 = r0.size()
                return r0
        }

        @Override // kotlin.collections.b, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<V> iterator() {
                r2 = this;
                kotlin.collections.f<K, V> r0 = r2.a
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                kotlin.collections.f$c$a r1 = new kotlin.collections.f$c$a
                r1.<init>(r0)
                return r1
        }
    }

    static {
            kotlin.collections.f$a r0 = new kotlin.collections.f$a
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.f.c = r0
            return
    }

    protected f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ java.lang.CharSequence a(kotlin.collections.f r0, java.util.Map.Entry r1) {
            java.lang.CharSequence r0 = k(r0, r1)
            return r0
    }

    private final java.util.Map.Entry<K, V> h(K r4) {
            r3 = this;
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            r2 = r1
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r2 = r2.getKey()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r2 == 0) goto L8
            goto L21
        L20:
            r1 = 0
        L21:
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            return r1
    }

    private final java.lang.String i(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L5
            java.lang.String r1 = "(this Map)"
            return r1
        L5:
            java.lang.String r1 = java.lang.String.valueOf(r1)
            return r1
    }

    private final java.lang.String j(java.util.Map.Entry<? extends K, ? extends V> r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Object r1 = r3.getKey()
            java.lang.String r1 = r2.i(r1)
            r0.append(r1)
            r1 = 61
            r0.append(r1)
            java.lang.Object r3 = r3.getValue()
            java.lang.String r3 = r2.i(r3)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    private static final java.lang.CharSequence k(kotlin.collections.f r1, java.util.Map.Entry r2) {
            java.lang.String r0 = "it"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r1 = r1.j(r2)
            return r1
    }

    public final boolean c(@org.jetbrains.annotations.Nullable java.util.Map.Entry<?, ?> r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            java.lang.Object r1 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            java.lang.String r2 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>"
            kotlin.jvm.internal.g0.n(r3, r2)
            java.lang.Object r2 = r3.get(r1)
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r2)
            if (r4 != 0) goto L1c
            return r0
        L1c:
            if (r2 != 0) goto L2a
            java.lang.String r4 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.containsKey, *>"
            kotlin.jvm.internal.g0.n(r3, r4)
            boolean r4 = r3.containsKey(r1)
            if (r4 != 0) goto L2a
            return r0
        L2a:
            r4 = 1
            return r4
    }

    @Override // java.util.Map
    public void clear() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Operation is not supported for read-only collection"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.h(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r4) {
            r3 = this;
            java.util.Set r0 = r3.entrySet()
            boolean r1 = androidx.activity.k.a(r0)
            r2 = 0
            if (r1 == 0) goto L12
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L12
            return r2
        L12:
            java.util.Iterator r0 = r0.iterator()
        L16:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r4)
            if (r1 == 0) goto L16
            r4 = 1
            return r4
        L2e:
            return r2
    }

    public abstract java.util.Set<java.util.Map.Entry<K, V>> d();

    @org.jetbrains.annotations.NotNull
    public java.util.Set<K> e() {
            r1 = this;
            java.util.Set<? extends K> r0 = r1.a
            if (r0 != 0) goto Lb
            kotlin.collections.f$b r0 = new kotlin.collections.f$b
            r0.<init>(r1)
            r1.a = r0
        Lb:
            java.util.Set<? extends K> r0 = r1.a
            kotlin.jvm.internal.g0.m(r0)
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.d()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Map
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            int r1 = r4.size()
            java.util.Map r5 = (java.util.Map) r5
            int r3 = r5.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            java.util.Set r5 = r5.entrySet()
            boolean r1 = androidx.activity.k.a(r5)
            if (r1 == 0) goto L28
            boolean r1 = r5.isEmpty()
            if (r1 == 0) goto L28
            return r0
        L28:
            java.util.Iterator r5 = r5.iterator()
        L2c:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3f
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            boolean r1 = r4.c(r1)
            if (r1 != 0) goto L2c
            return r2
        L3f:
            return r0
    }

    public int f() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = r0.size()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<V> g() {
            r1 = this;
            java.util.Collection<? extends V> r0 = r1.b
            if (r0 != 0) goto Lb
            kotlin.collections.f$c r0 = new kotlin.collections.f$c
            r0.<init>(r1)
            r1.b = r0
        Lb:
            java.util.Collection<? extends V> r0 = r1.b
            kotlin.jvm.internal.g0.m(r0)
            return r0
    }

    @Override // java.util.Map
    @org.jetbrains.annotations.Nullable
    public V get(java.lang.Object r1) {
            r0 = this;
            java.util.Map$Entry r1 = r0.h(r1)
            if (r1 == 0) goto Lb
            java.lang.Object r1 = r1.getValue()
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public int hashCode() {
            r1 = this;
            java.util.Set r0 = r1.entrySet()
            int r0 = r0.hashCode()
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.e()
            return r0
    }

    @Override // java.util.Map
    public V put(K r1, V r2) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r2 = "Operation is not supported for read-only collection"
            r1.<init>(r2)
            throw r1
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Operation is not supported for read-only collection"
            r2.<init>(r0)
            throw r2
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.f()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r9 = this;
            java.util.Set r0 = r9.entrySet()
            kotlin.collections.e r6 = new kotlin.collections.e
            r6.<init>(r9)
            r7 = 24
            r8 = 0
            java.lang.String r1 = ", "
            java.lang.String r2 = "{"
            java.lang.String r3 = "}"
            r4 = 0
            r5 = 0
            java.lang.String r0 = kotlin.collections.r0.r3(r0, r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.g()
            return r0
    }
}

package kotlinx.coroutines.debug.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1#2:285\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class b<K, V> extends kotlin.collections.i<K, V> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c = null;

    @kotlin.jvm.Volatile
    private volatile int _size;

    @org.jetbrains.annotations.Nullable
    private final java.lang.ref.ReferenceQueue<K> a;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object core;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class a {

        @org.jetbrains.annotations.NotNull
        private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater g = null;
        private final int a;
        private final int b;
        private final int c;

        @org.jetbrains.annotations.NotNull
        private final java.util.concurrent.atomic.AtomicReferenceArray d;

        @org.jetbrains.annotations.NotNull
        private final java.util.concurrent.atomic.AtomicReferenceArray e;
        final /* synthetic */ kotlinx.coroutines.debug.internal.b<K, V> f;

        @kotlin.jvm.Volatile
        private volatile int load;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConcurrentWeakMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentWeakMap.kt\nkotlinx/coroutines/debug/internal/ConcurrentWeakMap$Core$KeyValueIterator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,284:1\n1#2:285\n*E\n"})
        /* renamed from: kotlinx.coroutines.debug.internal.b$a$a, reason: collision with other inner class name */
        private final class C0085a<E> implements java.util.Iterator<E>, l3.d {

            @org.jetbrains.annotations.NotNull
            private final kotlin.jvm.functions.Function2<K, V, E> a;
            private int b;
            private K c;
            private V d;
            final /* synthetic */ kotlinx.coroutines.debug.internal.b<K, V>.a e;

            public C0085a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.b.a r1, kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> r2) {
                    r0 = this;
                    r0.e = r1
                    r0.<init>()
                    r0.a = r2
                    r1 = -1
                    r0.b = r1
                    r0.a()
                    return
            }

            private final void a() {
                    r2 = this;
                L0:
                    int r0 = r2.b
                    int r0 = r0 + 1
                    r2.b = r0
                    kotlinx.coroutines.debug.internal.b<K, V>$a r1 = r2.e
                    int r1 = kotlinx.coroutines.debug.internal.b.a.a(r1)
                    if (r0 >= r1) goto L3f
                    kotlinx.coroutines.debug.internal.b<K, V>$a r0 = r2.e
                    java.util.concurrent.atomic.AtomicReferenceArray r0 = kotlinx.coroutines.debug.internal.b.a.b(r0)
                    int r1 = r2.b
                    java.lang.Object r0 = r0.get(r1)
                    kotlinx.coroutines.debug.internal.i r0 = (kotlinx.coroutines.debug.internal.i) r0
                    if (r0 == 0) goto L0
                    java.lang.Object r0 = r0.get()
                    if (r0 != 0) goto L25
                    goto L0
                L25:
                    r2.c = r0
                    kotlinx.coroutines.debug.internal.b<K, V>$a r0 = r2.e
                    java.util.concurrent.atomic.AtomicReferenceArray r0 = kotlinx.coroutines.debug.internal.b.a.c(r0)
                    int r1 = r2.b
                    java.lang.Object r0 = r0.get(r1)
                    boolean r1 = r0 instanceof kotlinx.coroutines.debug.internal.j
                    if (r1 == 0) goto L3b
                    kotlinx.coroutines.debug.internal.j r0 = (kotlinx.coroutines.debug.internal.j) r0
                    java.lang.Object r0 = r0.a
                L3b:
                    if (r0 == 0) goto L0
                    r2.d = r0
                L3f:
                    return
            }

            @org.jetbrains.annotations.NotNull
            public java.lang.Void c() {
                    r1 = this;
                    kotlinx.coroutines.debug.internal.c.c()
                    kotlin.KotlinNothingValueException r0 = new kotlin.KotlinNothingValueException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                    r2 = this;
                    int r0 = r2.b
                    kotlinx.coroutines.debug.internal.b<K, V>$a r1 = r2.e
                    int r1 = kotlinx.coroutines.debug.internal.b.a.a(r1)
                    if (r0 >= r1) goto Lc
                    r0 = 1
                    return r0
                Lc:
                    r0 = 0
                    return r0
            }

            @Override // java.util.Iterator
            public E next() {
                    r3 = this;
                    int r0 = r3.b
                    kotlinx.coroutines.debug.internal.b<K, V>$a r1 = r3.e
                    int r1 = kotlinx.coroutines.debug.internal.b.a.a(r1)
                    if (r0 >= r1) goto L2a
                    kotlin.jvm.functions.Function2<K, V, E> r0 = r3.a
                    K r1 = r3.c
                    if (r1 != 0) goto L17
                    java.lang.String r1 = "key"
                    kotlin.jvm.internal.g0.S(r1)
                    kotlin.n1 r1 = kotlin.n1.a
                L17:
                    V r2 = r3.d
                    if (r2 != 0) goto L22
                    java.lang.String r2 = "value"
                    kotlin.jvm.internal.g0.S(r2)
                    kotlin.n1 r2 = kotlin.n1.a
                L22:
                    java.lang.Object r0 = r0.invoke(r1, r2)
                    r3.a()
                    return r0
                L2a:
                    java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                    r0.<init>()
                    throw r0
            }

            @Override // java.util.Iterator
            public /* bridge */ /* synthetic */ void remove() {
                    r0 = this;
                    r0.c()
                    return
            }
        }

        static {
                java.lang.Class<kotlinx.coroutines.debug.internal.b$a> r0 = kotlinx.coroutines.debug.internal.b.a.class
                java.lang.String r1 = "load"
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
                kotlinx.coroutines.debug.internal.b.a.g = r0
                return
        }

        public a(kotlinx.coroutines.debug.internal.b r1, int r2) {
                r0 = this;
                r0.f = r1
                r0.<init>()
                r0.a = r2
                int r1 = java.lang.Integer.numberOfLeadingZeros(r2)
                int r1 = r1 + 1
                r0.b = r1
                int r1 = r2 * 2
                int r1 = r1 / 3
                r0.c = r1
                java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
                r1.<init>(r2)
                r0.d = r1
                java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
                r1.<init>(r2)
                r0.e = r1
                return
        }

        public static final /* synthetic */ int a(kotlinx.coroutines.debug.internal.b.a r0) {
                int r0 = r0.a
                return r0
        }

        public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray b(kotlinx.coroutines.debug.internal.b.a r0) {
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.d
                return r0
        }

        public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray c(kotlinx.coroutines.debug.internal.b.a r0) {
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r0.e
                return r0
        }

        private final int f(int r2) {
                r1 = this;
                r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
                int r2 = r2 * r0
                int r0 = r1.b
                int r2 = r2 >>> r0
                return r2
        }

        public static /* synthetic */ java.lang.Object i(kotlinx.coroutines.debug.internal.b.a r0, java.lang.Object r1, java.lang.Object r2, kotlinx.coroutines.debug.internal.i r3, int r4, java.lang.Object r5) {
                r4 = r4 & 4
                if (r4 == 0) goto L5
                r3 = 0
            L5:
                java.lang.Object r0 = r0.h(r1, r2, r3)
                return r0
        }

        private final void k(int r4) {
                r3 = this;
            L0:
                java.util.concurrent.atomic.AtomicReferenceArray r0 = r3.e
                java.lang.Object r0 = r0.get(r4)
                if (r0 != 0) goto L9
                goto Ld
            L9:
                boolean r1 = r0 instanceof kotlinx.coroutines.debug.internal.j
                if (r1 == 0) goto Le
            Ld:
                return
            Le:
                java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.e
                r2 = 0
                boolean r0 = com.google.common.util.concurrent.b.a(r1, r4, r0, r2)
                if (r0 == 0) goto L0
                kotlinx.coroutines.debug.internal.b<K, V> r4 = r3.f
                kotlinx.coroutines.debug.internal.b.f(r4)
                return
        }

        private final void l(java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r4, java.lang.Object r5) {
                r2 = this;
            L0:
                int r0 = r3.get(r5)
                java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
                java.lang.Object r1 = r4.invoke(r1)
                java.lang.Number r1 = (java.lang.Number) r1
                int r1 = r1.intValue()
                boolean r0 = r3.compareAndSet(r5, r0, r1)
                if (r0 == 0) goto L0
                return
        }

        public final void d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.i<?> r3) {
                r2 = this;
                int r0 = r3.a
                int r0 = r2.f(r0)
            L6:
                java.util.concurrent.atomic.AtomicReferenceArray r1 = r2.d
                java.lang.Object r1 = r1.get(r0)
                kotlinx.coroutines.debug.internal.i r1 = (kotlinx.coroutines.debug.internal.i) r1
                if (r1 != 0) goto L11
                return
            L11:
                if (r1 != r3) goto L17
                r2.k(r0)
                return
            L17:
                if (r0 != 0) goto L1b
                int r0 = r2.a
            L1b:
                int r0 = r0 + (-1)
                goto L6
        }

        @org.jetbrains.annotations.Nullable
        public final V e(@org.jetbrains.annotations.NotNull K r4) {
                r3 = this;
                int r0 = r4.hashCode()
                int r0 = r3.f(r0)
            L8:
                java.util.concurrent.atomic.AtomicReferenceArray r1 = r3.d
                java.lang.Object r1 = r1.get(r0)
                kotlinx.coroutines.debug.internal.i r1 = (kotlinx.coroutines.debug.internal.i) r1
                if (r1 != 0) goto L14
                r4 = 0
                return r4
            L14:
                java.lang.Object r1 = r1.get()
                boolean r2 = kotlin.jvm.internal.g0.g(r4, r1)
                if (r2 == 0) goto L2d
                java.util.concurrent.atomic.AtomicReferenceArray r4 = r3.e
                java.lang.Object r4 = r4.get(r0)
                boolean r0 = r4 instanceof kotlinx.coroutines.debug.internal.j
                if (r0 == 0) goto L2c
                kotlinx.coroutines.debug.internal.j r4 = (kotlinx.coroutines.debug.internal.j) r4
                java.lang.Object r4 = r4.a
            L2c:
                return r4
            L2d:
                if (r1 != 0) goto L32
                r3.k(r0)
            L32:
                if (r0 != 0) goto L36
                int r0 = r3.a
            L36:
                int r0 = r0 + (-1)
                goto L8
        }

        @org.jetbrains.annotations.NotNull
        public final <E> java.util.Iterator<E> g(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> r2) {
                r1 = this;
                kotlinx.coroutines.debug.internal.b$a$a r0 = new kotlinx.coroutines.debug.internal.b$a$a
                r0.<init>(r1, r2)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object h(@org.jetbrains.annotations.NotNull K r6, @org.jetbrains.annotations.Nullable V r7, @org.jetbrains.annotations.Nullable kotlinx.coroutines.debug.internal.i<K> r8) {
                r5 = this;
                int r0 = r6.hashCode()
                int r0 = r5.f(r0)
                r1 = 0
            L9:
                java.util.concurrent.atomic.AtomicReferenceArray r2 = r5.d
                java.lang.Object r2 = r2.get(r0)
                kotlinx.coroutines.debug.internal.i r2 = (kotlinx.coroutines.debug.internal.i) r2
                if (r2 != 0) goto L47
                r2 = 0
                if (r7 != 0) goto L17
                return r2
            L17:
                if (r1 != 0) goto L31
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3 = kotlinx.coroutines.debug.internal.b.a.g
            L1b:
                int r1 = r3.get(r5)
                int r4 = r5.c
                if (r1 < r4) goto L28
                kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.debug.internal.c.a()
                return r6
            L28:
                int r4 = r1 + 1
                boolean r1 = r3.compareAndSet(r5, r1, r4)
                if (r1 == 0) goto L1b
                r1 = 1
            L31:
                if (r8 != 0) goto L3e
                kotlinx.coroutines.debug.internal.i r8 = new kotlinx.coroutines.debug.internal.i
                kotlinx.coroutines.debug.internal.b<K, V> r3 = r5.f
                java.lang.ref.ReferenceQueue r3 = kotlinx.coroutines.debug.internal.b.h(r3)
                r8.<init>(r6, r3)
            L3e:
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r5.d
                boolean r2 = com.google.common.util.concurrent.b.a(r3, r0, r2, r8)
                if (r2 != 0) goto L58
                goto L9
            L47:
                java.lang.Object r2 = r2.get()
                boolean r3 = kotlin.jvm.internal.g0.g(r6, r2)
                if (r3 == 0) goto L70
                if (r1 == 0) goto L58
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.debug.internal.b.a.g
                r6.decrementAndGet(r5)
            L58:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r5.e
                java.lang.Object r6 = r6.get(r0)
                boolean r8 = r6 instanceof kotlinx.coroutines.debug.internal.j
                if (r8 == 0) goto L67
                kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.debug.internal.c.a()
                return r6
            L67:
                java.util.concurrent.atomic.AtomicReferenceArray r8 = r5.e
                boolean r8 = com.google.common.util.concurrent.b.a(r8, r0, r6, r7)
                if (r8 == 0) goto L58
                return r6
            L70:
                if (r2 != 0) goto L75
                r5.k(r0)
            L75:
                if (r0 != 0) goto L79
                int r0 = r5.a
            L79:
                int r0 = r0 + (-1)
                goto L9
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.debug.internal.b<K, V>.a j() {
                r8 = this;
            L0:
                kotlinx.coroutines.debug.internal.b<K, V> r0 = r8.f
                int r0 = r0.size()
                r1 = 4
                int r0 = kotlin.ranges.t.u(r0, r1)
                int r0 = java.lang.Integer.highestOneBit(r0)
                int r0 = r0 * 4
                kotlinx.coroutines.debug.internal.b$a r1 = new kotlinx.coroutines.debug.internal.b$a
                kotlinx.coroutines.debug.internal.b<K, V> r2 = r8.f
                r1.<init>(r2, r0)
                int r0 = r8.a
                r2 = 0
            L1b:
                if (r2 >= r0) goto L60
                java.util.concurrent.atomic.AtomicReferenceArray r3 = r8.d
                java.lang.Object r3 = r3.get(r2)
                kotlinx.coroutines.debug.internal.i r3 = (kotlinx.coroutines.debug.internal.i) r3
                if (r3 == 0) goto L2c
                java.lang.Object r4 = r3.get()
                goto L2d
            L2c:
                r4 = 0
            L2d:
                if (r3 == 0) goto L34
                if (r4 != 0) goto L34
                r8.k(r2)
            L34:
                java.util.concurrent.atomic.AtomicReferenceArray r5 = r8.e
                java.lang.Object r5 = r5.get(r2)
                boolean r6 = r5 instanceof kotlinx.coroutines.debug.internal.j
                if (r6 == 0) goto L43
                kotlinx.coroutines.debug.internal.j r5 = (kotlinx.coroutines.debug.internal.j) r5
                java.lang.Object r5 = r5.a
                goto L4f
            L43:
                java.util.concurrent.atomic.AtomicReferenceArray r6 = r8.e
                kotlinx.coroutines.debug.internal.j r7 = kotlinx.coroutines.debug.internal.c.b(r5)
                boolean r6 = com.google.common.util.concurrent.b.a(r6, r2, r5, r7)
                if (r6 == 0) goto L34
            L4f:
                if (r4 == 0) goto L5d
                if (r5 == 0) goto L5d
                java.lang.Object r3 = r1.h(r4, r5, r3)
                kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.debug.internal.c.a()
                if (r3 == r4) goto L0
            L5d:
                int r2 = r2 + 1
                goto L1b
            L60:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: kotlinx.coroutines.debug.internal.b$b, reason: collision with other inner class name */
    private static final class C0086b<K, V> implements java.util.Map.Entry<K, V>, l3.g.a {
        private final K a;
        private final V b;

        public C0086b(K r1, V r2) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                return
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.a
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.b
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r1) {
                r0 = this;
                kotlinx.coroutines.debug.internal.c.c()
                kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
                r1.<init>()
                throw r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class c<E> extends kotlin.collections.j<E> {

        @org.jetbrains.annotations.NotNull
        private final kotlin.jvm.functions.Function2<K, V, E> a;
        final /* synthetic */ kotlinx.coroutines.debug.internal.b<K, V> b;

        public c(@org.jetbrains.annotations.NotNull kotlinx.coroutines.debug.internal.b r1, kotlin.jvm.functions.Function2<? super K, ? super V, ? extends E> r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // kotlin.collections.j, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean add(E r1) {
                r0 = this;
                kotlinx.coroutines.debug.internal.c.c()
                kotlin.KotlinNothingValueException r1 = new kotlin.KotlinNothingValueException
                r1.<init>()
                throw r1
        }

        @Override // kotlin.collections.j
        public int getSize() {
                r1 = this;
                kotlinx.coroutines.debug.internal.b<K, V> r0 = r1.b
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        @org.jetbrains.annotations.NotNull
        public java.util.Iterator<E> iterator() {
                r2 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.debug.internal.b.g()
                kotlinx.coroutines.debug.internal.b<K, V> r1 = r2.b
                java.lang.Object r0 = r0.get(r1)
                kotlinx.coroutines.debug.internal.b$a r0 = (kotlinx.coroutines.debug.internal.b.a) r0
                kotlin.jvm.functions.Function2<K, V, E> r1 = r2.a
                java.util.Iterator r0 = r0.g(r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<K, V, java.util.Map.Entry<K, V>> {
        public static final kotlinx.coroutines.debug.internal.b.d a = null;

        static {
                kotlinx.coroutines.debug.internal.b$d r0 = new kotlinx.coroutines.debug.internal.b$d
                r0.<init>()
                kotlinx.coroutines.debug.internal.b.d.a = r0
                return
        }

        d() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final java.util.Map.Entry<K, V> a(@org.jetbrains.annotations.NotNull K r2, @org.jetbrains.annotations.NotNull V r3) {
                r1 = this;
                kotlinx.coroutines.debug.internal.b$b r0 = new kotlinx.coroutines.debug.internal.b$b
                r0.<init>(r2, r3)
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                java.util.Map$Entry r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function2<K, V, K> {
        public static final kotlinx.coroutines.debug.internal.b.e a = null;

        static {
                kotlinx.coroutines.debug.internal.b$e r0 = new kotlinx.coroutines.debug.internal.b$e
                r0.<init>()
                kotlinx.coroutines.debug.internal.b.e.a = r0
                return
        }

        e() {
                r1 = this;
                r0 = 2
                r1.<init>(r0)
                return
        }

        @Override // kotlin.jvm.functions.Function2
        @org.jetbrains.annotations.NotNull
        public final K invoke(@org.jetbrains.annotations.NotNull K r1, @org.jetbrains.annotations.NotNull V r2) {
                r0 = this;
                return r1
        }
    }

    static {
            java.lang.String r0 = "_size"
            java.lang.Class<kotlinx.coroutines.debug.internal.b> r1 = kotlinx.coroutines.debug.internal.b.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.debug.internal.b.b = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r2 = "core"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r0, r2)
            kotlinx.coroutines.debug.internal.b.c = r0
            return
    }

    public b() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    public b(boolean r3) {
            r2 = this;
            r2.<init>()
            kotlinx.coroutines.debug.internal.b$a r0 = new kotlinx.coroutines.debug.internal.b$a
            r1 = 16
            r0.<init>(r2, r1)
            r2.core = r0
            if (r3 == 0) goto L14
            java.lang.ref.ReferenceQueue r3 = new java.lang.ref.ReferenceQueue
            r3.<init>()
            goto L15
        L14:
            r3 = 0
        L15:
            r2.a = r3
            return
    }

    public /* synthetic */ b(boolean r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public static final /* synthetic */ void f(kotlinx.coroutines.debug.internal.b r0) {
            r0.j()
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater g() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.debug.internal.b.c
            return r0
    }

    public static final /* synthetic */ java.lang.ref.ReferenceQueue h(kotlinx.coroutines.debug.internal.b r0) {
            java.lang.ref.ReferenceQueue<K> r0 = r0.a
            return r0
    }

    private final void i(kotlinx.coroutines.debug.internal.i<?> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.debug.internal.b.c
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.debug.internal.b$a r0 = (kotlinx.coroutines.debug.internal.b.a) r0
            r0.d(r2)
            return
    }

    private final void j() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.b.b
            r0.decrementAndGet(r1)
            return
    }

    private final synchronized V k(K r8, V r9) {
            r7 = this;
            monitor-enter(r7)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.debug.internal.b.c     // Catch: java.lang.Throwable -> L27
            java.lang.Object r0 = r0.get(r7)     // Catch: java.lang.Throwable -> L27
            kotlinx.coroutines.debug.internal.b$a r0 = (kotlinx.coroutines.debug.internal.b.a) r0     // Catch: java.lang.Throwable -> L27
            r1 = r0
        La:
            r5 = 4
            r6 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            java.lang.Object r8 = kotlinx.coroutines.debug.internal.b.a.i(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L27
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.debug.internal.c.a()     // Catch: java.lang.Throwable -> L27
            if (r8 == r9) goto L1b
            monitor-exit(r7)
            return r8
        L1b:
            kotlinx.coroutines.debug.internal.b$a r1 = r1.j()     // Catch: java.lang.Throwable -> L27
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = kotlinx.coroutines.debug.internal.b.c     // Catch: java.lang.Throwable -> L27
            r8.set(r7, r1)     // Catch: java.lang.Throwable -> L27
            r8 = r2
            r9 = r3
            goto La
        L27:
            r0 = move-exception
            r8 = r0
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L27
            throw r8
    }

    @Override // kotlin.collections.i
    @org.jetbrains.annotations.NotNull
    public java.util.Set<java.util.Map.Entry<K, V>> a() {
            r2 = this;
            kotlinx.coroutines.debug.internal.b$c r0 = new kotlinx.coroutines.debug.internal.b$c
            kotlinx.coroutines.debug.internal.b$d r1 = kotlinx.coroutines.debug.internal.b.d.a
            r0.<init>(r2, r1)
            return r0
    }

    @Override // kotlin.collections.i
    @org.jetbrains.annotations.NotNull
    public java.util.Set<K> c() {
            r2 = this;
            kotlinx.coroutines.debug.internal.b$c r0 = new kotlinx.coroutines.debug.internal.b$c
            kotlinx.coroutines.debug.internal.b$e r1 = kotlinx.coroutines.debug.internal.b.e.a
            r0.<init>(r2, r1)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r2 = this;
            java.util.Set r0 = r2.keySet()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r0.next()
            r2.remove(r1)
            goto L8
        L16:
            return
    }

    @Override // kotlin.collections.i
    public int d() {
            r1 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.b.b
            int r0 = r0.get(r1)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    @org.jetbrains.annotations.Nullable
    public V get(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L4
            r2 = 0
            return r2
        L4:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.debug.internal.b.c
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.debug.internal.b$a r0 = (kotlinx.coroutines.debug.internal.b.a) r0
            java.lang.Object r2 = r0.e(r2)
            return r2
    }

    public final void m() {
            r2 = this;
            java.lang.ref.ReferenceQueue<K> r0 = r2.a
            if (r0 == 0) goto L1d
        L4:
            java.lang.ref.ReferenceQueue<K> r0 = r2.a     // Catch: java.lang.InterruptedException -> L15
            java.lang.ref.Reference r0 = r0.remove()     // Catch: java.lang.InterruptedException -> L15
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.debug.internal.HashedWeakRef<*>"
            kotlin.jvm.internal.g0.n(r0, r1)     // Catch: java.lang.InterruptedException -> L15
            kotlinx.coroutines.debug.internal.i r0 = (kotlinx.coroutines.debug.internal.i) r0     // Catch: java.lang.InterruptedException -> L15
            r2.i(r0)     // Catch: java.lang.InterruptedException -> L15
            goto L4
        L15:
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            r0.interrupt()
            return
        L1d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Must be created with weakRefQueue = true"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlin.collections.i, java.util.AbstractMap, java.util.Map
    @org.jetbrains.annotations.Nullable
    public V put(@org.jetbrains.annotations.NotNull K r8, @org.jetbrains.annotations.NotNull V r9) {
            r7 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.debug.internal.b.c
            java.lang.Object r0 = r0.get(r7)
            r1 = r0
            kotlinx.coroutines.debug.internal.b$a r1 = (kotlinx.coroutines.debug.internal.b.a) r1
            r5 = 4
            r6 = 0
            r4 = 0
            r2 = r8
            r3 = r9
            java.lang.Object r8 = kotlinx.coroutines.debug.internal.b.a.i(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.internal.s0 r9 = kotlinx.coroutines.debug.internal.c.a()
            if (r8 != r9) goto L1c
            java.lang.Object r8 = r7.k(r2, r3)
        L1c:
            if (r8 != 0) goto L23
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r9 = kotlinx.coroutines.debug.internal.b.b
            r9.incrementAndGet(r7)
        L23:
            return r8
    }

    @Override // java.util.AbstractMap, java.util.Map
    @org.jetbrains.annotations.Nullable
    public V remove(@org.jetbrains.annotations.Nullable java.lang.Object r9) {
            r8 = this;
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.debug.internal.b.c
            java.lang.Object r1 = r1.get(r8)
            r2 = r1
            kotlinx.coroutines.debug.internal.b$a r2 = (kotlinx.coroutines.debug.internal.b.a) r2
            r6 = 4
            r7 = 0
            r4 = 0
            r5 = 0
            r3 = r9
            java.lang.Object r9 = kotlinx.coroutines.debug.internal.b.a.i(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.debug.internal.c.a()
            if (r9 != r1) goto L20
            java.lang.Object r9 = r8.k(r3, r0)
        L20:
            if (r9 == 0) goto L27
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.debug.internal.b.b
            r0.decrementAndGet(r8)
        L27:
            return r9
    }
}

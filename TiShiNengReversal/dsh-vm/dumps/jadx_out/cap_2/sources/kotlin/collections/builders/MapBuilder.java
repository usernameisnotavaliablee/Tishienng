package kotlin.collections.builders;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,751:1\n1#2:752\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class MapBuilder<K, V> implements java.util.Map<K, V>, java.io.Serializable, l3.g {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.collections.builders.MapBuilder.a Companion = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlin.collections.builders.MapBuilder Empty = null;
    private static final int INITIAL_CAPACITY = 8;
    private static final int INITIAL_MAX_PROBE_DISTANCE = 2;
    private static final int MAGIC = -1640531527;
    private static final int TOMBSTONE = -1;

    @org.jetbrains.annotations.Nullable
    private kotlin.collections.builders.c<K, V> entriesView;

    @org.jetbrains.annotations.NotNull
    private int[] hashArray;
    private int hashShift;
    private boolean isReadOnly;

    @org.jetbrains.annotations.NotNull
    private K[] keysArray;

    @org.jetbrains.annotations.Nullable
    private kotlin.collections.builders.d<K> keysView;
    private int length;
    private int maxProbeDistance;
    private int modCount;

    @org.jetbrains.annotations.NotNull
    private int[] presenceArray;
    private int size;

    @org.jetbrains.annotations.Nullable
    private V[] valuesArray;

    @org.jetbrains.annotations.Nullable
    private kotlin.collections.builders.e<V> valuesView;

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

        public static final /* synthetic */ int a(kotlin.collections.builders.MapBuilder.a r0, int r1) {
                int r0 = r0.c(r1)
                return r0
        }

        public static final /* synthetic */ int b(kotlin.collections.builders.MapBuilder.a r0, int r1) {
                int r0 = r0.d(r1)
                return r0
        }

        private final int c(int r2) {
                r1 = this;
                r0 = 1
                int r2 = kotlin.ranges.t.u(r2, r0)
                int r2 = r2 * 3
                int r2 = java.lang.Integer.highestOneBit(r2)
                return r2
        }

        private final int d(int r1) {
                r0 = this;
                int r1 = java.lang.Integer.numberOfLeadingZeros(r1)
                int r1 = r1 + 1
                return r1
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.collections.builders.MapBuilder e() {
                r1 = this;
                kotlin.collections.builders.MapBuilder r0 = kotlin.collections.builders.MapBuilder.access$getEmpty$cp()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b<K, V> extends kotlin.collections.builders.MapBuilder.d<K, V> implements java.util.Iterator<java.util.Map.Entry<K, V>>, l3.d {
        public b(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>(r2)
                return
        }

        @org.jetbrains.annotations.NotNull
        public kotlin.collections.builders.MapBuilder.c<K, V> j() {
                r3 = this;
                r3.a()
                int r0 = r3.c()
                kotlin.collections.builders.MapBuilder r1 = r3.f()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L2e
                int r0 = r3.c()
                int r1 = r0 + 1
                r3.h(r1)
                r3.i(r0)
                kotlin.collections.builders.MapBuilder$c r0 = new kotlin.collections.builders.MapBuilder$c
                kotlin.collections.builders.MapBuilder r1 = r3.f()
                int r2 = r3.e()
                r0.<init>(r1, r2)
                r3.g()
                return r0
            L2e:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        public final void k(@org.jetbrains.annotations.NotNull java.lang.StringBuilder r4) {
                r3 = this;
                java.lang.String r0 = "sb"
                kotlin.jvm.internal.g0.p(r4, r0)
                int r0 = r3.c()
                kotlin.collections.builders.MapBuilder r1 = r3.f()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L63
                int r0 = r3.c()
                int r1 = r0 + 1
                r3.h(r1)
                r3.i(r0)
                kotlin.collections.builders.MapBuilder r0 = r3.f()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getKeysArray$p(r0)
                int r1 = r3.e()
                r0 = r0[r1]
                kotlin.collections.builders.MapBuilder r1 = r3.f()
                java.lang.String r2 = "(this Map)"
                if (r0 != r1) goto L39
                r4.append(r2)
                goto L3c
            L39:
                r4.append(r0)
            L3c:
                r0 = 61
                r4.append(r0)
                kotlin.collections.builders.MapBuilder r0 = r3.f()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getValuesArray$p(r0)
                kotlin.jvm.internal.g0.m(r0)
                int r1 = r3.e()
                r0 = r0[r1]
                kotlin.collections.builders.MapBuilder r1 = r3.f()
                if (r0 != r1) goto L5c
                r4.append(r2)
                goto L5f
            L5c:
                r4.append(r0)
            L5f:
                r3.g()
                return
            L63:
                java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
                r4.<init>()
                throw r4
        }

        public final int m() {
                r4 = this;
                int r0 = r4.c()
                kotlin.collections.builders.MapBuilder r1 = r4.f()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L4d
                int r0 = r4.c()
                int r1 = r0 + 1
                r4.h(r1)
                r4.i(r0)
                kotlin.collections.builders.MapBuilder r0 = r4.f()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getKeysArray$p(r0)
                int r1 = r4.e()
                r0 = r0[r1]
                r1 = 0
                if (r0 == 0) goto L30
                int r0 = r0.hashCode()
                goto L31
            L30:
                r0 = 0
            L31:
                kotlin.collections.builders.MapBuilder r2 = r4.f()
                java.lang.Object[] r2 = kotlin.collections.builders.MapBuilder.access$getValuesArray$p(r2)
                kotlin.jvm.internal.g0.m(r2)
                int r3 = r4.e()
                r2 = r2[r3]
                if (r2 == 0) goto L48
                int r1 = r2.hashCode()
            L48:
                r0 = r0 ^ r1
                r4.g()
                return r0
            L4d:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                kotlin.collections.builders.MapBuilder$c r0 = r1.j()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c<K, V> implements java.util.Map.Entry<K, V>, l3.g.a {

        @org.jetbrains.annotations.NotNull
        private final kotlin.collections.builders.MapBuilder<K, V> a;
        private final int b;
        private final int c;

        public c(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<K, V> r2, int r3) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                r1.b = r3
                int r2 = kotlin.collections.builders.MapBuilder.access$getModCount$p(r2)
                r1.c = r2
                return
        }

        private final void a() {
                r2 = this;
                kotlin.collections.builders.MapBuilder<K, V> r0 = r2.a
                int r0 = kotlin.collections.builders.MapBuilder.access$getModCount$p(r0)
                int r1 = r2.c
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                java.lang.String r1 = "The backing map has been modified after this entry was obtained."
                r0.<init>(r1)
                throw r0
        }

        @Override // java.util.Map.Entry
        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                if (r0 == 0) goto L24
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                java.lang.Object r0 = r3.getKey()
                java.lang.Object r1 = r2.getKey()
                boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
                if (r0 == 0) goto L24
                java.lang.Object r3 = r3.getValue()
                java.lang.Object r0 = r2.getValue()
                boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
                if (r3 == 0) goto L24
                r3 = 1
                return r3
            L24:
                r3 = 0
                return r3
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r2 = this;
                r2.a()
                kotlin.collections.builders.MapBuilder<K, V> r0 = r2.a
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getKeysArray$p(r0)
                int r1 = r2.b
                r0 = r0[r1]
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r2 = this;
                r2.a()
                kotlin.collections.builders.MapBuilder<K, V> r0 = r2.a
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getValuesArray$p(r0)
                kotlin.jvm.internal.g0.m(r0)
                int r1 = r2.b
                r0 = r0[r1]
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r3 = this;
                java.lang.Object r0 = r3.getKey()
                r1 = 0
                if (r0 == 0) goto Lc
                int r0 = r0.hashCode()
                goto Ld
            Lc:
                r0 = 0
            Ld:
                java.lang.Object r2 = r3.getValue()
                if (r2 == 0) goto L17
                int r1 = r2.hashCode()
            L17:
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r4) {
                r3 = this;
                r3.a()
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.a
                r0.checkIsMutable$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.a
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$allocateValuesArray(r0)
                int r1 = r3.b
                r2 = r0[r1]
                r0[r1] = r4
                return r2
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.Object r1 = r2.getKey()
                r0.append(r1)
                r1 = 61
                r0.append(r1)
                java.lang.Object r1 = r2.getValue()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMapBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MapBuilder.kt\nkotlin/collections/builders/MapBuilder$Itr\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,751:1\n1#2:752\n*E\n"})
    public static class d<K, V> {

        @org.jetbrains.annotations.NotNull
        private final kotlin.collections.builders.MapBuilder<K, V> a;
        private int b;
        private int c;
        private int d;

        public d(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>()
                r1.a = r2
                r0 = -1
                r1.c = r0
                int r2 = kotlin.collections.builders.MapBuilder.access$getModCount$p(r2)
                r1.d = r2
                r1.g()
                return
        }

        public final void a() {
                r2 = this;
                kotlin.collections.builders.MapBuilder<K, V> r0 = r2.a
                int r0 = kotlin.collections.builders.MapBuilder.access$getModCount$p(r0)
                int r1 = r2.d
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
        }

        public final int c() {
                r1 = this;
                int r0 = r1.b
                return r0
        }

        public final int e() {
                r1 = this;
                int r0 = r1.c
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlin.collections.builders.MapBuilder<K, V> f() {
                r1 = this;
                kotlin.collections.builders.MapBuilder<K, V> r0 = r1.a
                return r0
        }

        public final void g() {
                r2 = this;
            L0:
                int r0 = r2.b
                kotlin.collections.builders.MapBuilder<K, V> r1 = r2.a
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L1b
                kotlin.collections.builders.MapBuilder<K, V> r0 = r2.a
                int[] r0 = kotlin.collections.builders.MapBuilder.access$getPresenceArray$p(r0)
                int r1 = r2.b
                r0 = r0[r1]
                if (r0 >= 0) goto L1b
                int r1 = r1 + 1
                r2.b = r1
                goto L0
            L1b:
                return
        }

        public final void h(int r1) {
                r0 = this;
                r0.b = r1
                return
        }

        public final boolean hasNext() {
                r2 = this;
                int r0 = r2.b
                kotlin.collections.builders.MapBuilder<K, V> r1 = r2.a
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public final void i(int r1) {
                r0 = this;
                r0.c = r1
                return
        }

        public final void remove() {
                r3 = this;
                r3.a()
                int r0 = r3.c
                r1 = -1
                if (r0 == r1) goto L1f
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.a
                r0.checkIsMutable$kotlin_stdlib()
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.a
                int r2 = r3.c
                kotlin.collections.builders.MapBuilder.access$removeEntryAt(r0, r2)
                r3.c = r1
                kotlin.collections.builders.MapBuilder<K, V> r0 = r3.a
                int r0 = kotlin.collections.builders.MapBuilder.access$getModCount$p(r0)
                r3.d = r0
                return
            L1f:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Call next() before removing element from the iterator."
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class e<K, V> extends kotlin.collections.builders.MapBuilder.d<K, V> implements java.util.Iterator<K>, l3.d {
        public e(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>(r2)
                return
        }

        @Override // java.util.Iterator
        public K next() {
                r2 = this;
                r2.a()
                int r0 = r2.c()
                kotlin.collections.builders.MapBuilder r1 = r2.f()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L2f
                int r0 = r2.c()
                int r1 = r0 + 1
                r2.h(r1)
                r2.i(r0)
                kotlin.collections.builders.MapBuilder r0 = r2.f()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getKeysArray$p(r0)
                int r1 = r2.e()
                r0 = r0[r1]
                r2.g()
                return r0
            L2f:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class f<K, V> extends kotlin.collections.builders.MapBuilder.d<K, V> implements java.util.Iterator<V>, l3.d {
        public f(@org.jetbrains.annotations.NotNull kotlin.collections.builders.MapBuilder<K, V> r2) {
                r1 = this;
                java.lang.String r0 = "map"
                kotlin.jvm.internal.g0.p(r2, r0)
                r1.<init>(r2)
                return
        }

        @Override // java.util.Iterator
        public V next() {
                r2 = this;
                r2.a()
                int r0 = r2.c()
                kotlin.collections.builders.MapBuilder r1 = r2.f()
                int r1 = kotlin.collections.builders.MapBuilder.access$getLength$p(r1)
                if (r0 >= r1) goto L32
                int r0 = r2.c()
                int r1 = r0 + 1
                r2.h(r1)
                r2.i(r0)
                kotlin.collections.builders.MapBuilder r0 = r2.f()
                java.lang.Object[] r0 = kotlin.collections.builders.MapBuilder.access$getValuesArray$p(r0)
                kotlin.jvm.internal.g0.m(r0)
                int r1 = r2.e()
                r0 = r0[r1]
                r2.g()
                return r0
            L32:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    static {
            kotlin.collections.builders.MapBuilder$a r0 = new kotlin.collections.builders.MapBuilder$a
            r1 = 0
            r0.<init>(r1)
            kotlin.collections.builders.MapBuilder.Companion = r0
            kotlin.collections.builders.MapBuilder r0 = new kotlin.collections.builders.MapBuilder
            r1 = 0
            r0.<init>(r1)
            r1 = 1
            r0.isReadOnly = r1
            kotlin.collections.builders.MapBuilder.Empty = r0
            return
    }

    public MapBuilder() {
            r1 = this;
            r0 = 8
            r1.<init>(r0)
            return
    }

    public MapBuilder(int r8) {
            r7 = this;
            java.lang.Object[] r1 = kotlin.collections.builders.b.d(r8)
            int[] r3 = new int[r8]
            kotlin.collections.builders.MapBuilder$a r0 = kotlin.collections.builders.MapBuilder.Companion
            int r8 = kotlin.collections.builders.MapBuilder.a.a(r0, r8)
            int[] r4 = new int[r8]
            r5 = 2
            r6 = 0
            r2 = 0
            r0 = r7
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    private MapBuilder(K[] r1, V[] r2, int[] r3, int[] r4, int r5, int r6) {
            r0 = this;
            r0.<init>()
            r0.keysArray = r1
            r0.valuesArray = r2
            r0.presenceArray = r3
            r0.hashArray = r4
            r0.maxProbeDistance = r5
            r0.length = r6
            kotlin.collections.builders.MapBuilder$a r1 = kotlin.collections.builders.MapBuilder.Companion
            int r2 = r0.getHashSize()
            int r1 = kotlin.collections.builders.MapBuilder.a.b(r1, r2)
            r0.hashShift = r1
            return
    }

    public static final /* synthetic */ java.lang.Object[] access$allocateValuesArray(kotlin.collections.builders.MapBuilder r0) {
            java.lang.Object[] r0 = r0.allocateValuesArray()
            return r0
    }

    public static final /* synthetic */ kotlin.collections.builders.MapBuilder access$getEmpty$cp() {
            kotlin.collections.builders.MapBuilder r0 = kotlin.collections.builders.MapBuilder.Empty
            return r0
    }

    public static final /* synthetic */ java.lang.Object[] access$getKeysArray$p(kotlin.collections.builders.MapBuilder r0) {
            K[] r0 = r0.keysArray
            return r0
    }

    public static final /* synthetic */ int access$getLength$p(kotlin.collections.builders.MapBuilder r0) {
            int r0 = r0.length
            return r0
    }

    public static final /* synthetic */ int access$getModCount$p(kotlin.collections.builders.MapBuilder r0) {
            int r0 = r0.modCount
            return r0
    }

    public static final /* synthetic */ int[] access$getPresenceArray$p(kotlin.collections.builders.MapBuilder r0) {
            int[] r0 = r0.presenceArray
            return r0
    }

    public static final /* synthetic */ java.lang.Object[] access$getValuesArray$p(kotlin.collections.builders.MapBuilder r0) {
            V[] r0 = r0.valuesArray
            return r0
    }

    public static final /* synthetic */ void access$removeEntryAt(kotlin.collections.builders.MapBuilder r0, int r1) {
            r0.removeEntryAt(r1)
            return
    }

    private final V[] allocateValuesArray() {
            r1 = this;
            V[] r0 = r1.valuesArray
            if (r0 == 0) goto L5
            return r0
        L5:
            int r0 = r1.getCapacity$kotlin_stdlib()
            java.lang.Object[] r0 = kotlin.collections.builders.b.d(r0)
            r1.valuesArray = r0
            return r0
    }

    private final void compact(boolean r8) {
            r7 = this;
            V[] r0 = r7.valuesArray
            r1 = 0
            r2 = 0
        L4:
            int r3 = r7.length
            if (r1 >= r3) goto L29
            int[] r3 = r7.presenceArray
            r4 = r3[r1]
            if (r4 < 0) goto L26
            K[] r5 = r7.keysArray
            r6 = r5[r1]
            r5[r2] = r6
            if (r0 == 0) goto L1a
            r5 = r0[r1]
            r0[r2] = r5
        L1a:
            if (r8 == 0) goto L24
            r3[r2] = r4
            int[] r3 = r7.hashArray
            int r5 = r2 + 1
            r3[r4] = r5
        L24:
            int r2 = r2 + 1
        L26:
            int r1 = r1 + 1
            goto L4
        L29:
            K[] r8 = r7.keysArray
            kotlin.collections.builders.b.g(r8, r2, r3)
            if (r0 == 0) goto L35
            int r8 = r7.length
            kotlin.collections.builders.b.g(r0, r2, r8)
        L35:
            r7.length = r2
            return
    }

    private final boolean contentEquals(java.util.Map<?, ?> r3) {
            r2 = this;
            int r0 = r2.size()
            int r1 = r3.size()
            if (r0 != r1) goto L16
            java.util.Set r3 = r3.entrySet()
            boolean r3 = r2.containsAllEntries$kotlin_stdlib(r3)
            if (r3 == 0) goto L16
            r3 = 1
            return r3
        L16:
            r3 = 0
            return r3
    }

    private final void ensureCapacity(int r3) {
            r2 = this;
            if (r3 < 0) goto L43
            int r0 = r2.getCapacity$kotlin_stdlib()
            if (r3 <= r0) goto L42
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.getCapacity$kotlin_stdlib()
            int r3 = r0.e(r1, r3)
            K[] r0 = r2.keysArray
            java.lang.Object[] r0 = kotlin.collections.builders.b.e(r0, r3)
            r2.keysArray = r0
            V[] r0 = r2.valuesArray
            if (r0 == 0) goto L23
            java.lang.Object[] r0 = kotlin.collections.builders.b.e(r0, r3)
            goto L24
        L23:
            r0 = 0
        L24:
            r2.valuesArray = r0
            int[] r0 = r2.presenceArray
            int[] r0 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r1 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r2.presenceArray = r0
            kotlin.collections.builders.MapBuilder$a r0 = kotlin.collections.builders.MapBuilder.Companion
            int r3 = kotlin.collections.builders.MapBuilder.a.a(r0, r3)
            int r0 = r2.getHashSize()
            if (r3 <= r0) goto L42
            r2.rehash(r3)
        L42:
            return
        L43:
            java.lang.OutOfMemoryError r3 = new java.lang.OutOfMemoryError
            r3.<init>()
            throw r3
    }

    private final void ensureExtraCapacity(int r2) {
            r1 = this;
            boolean r0 = r1.shouldCompact(r2)
            if (r0 == 0) goto Lb
            r2 = 1
            r1.compact(r2)
            return
        Lb:
            int r0 = r1.length
            int r0 = r0 + r2
            r1.ensureCapacity(r0)
            return
    }

    private final int findKey(K r6) {
            r5 = this;
            int r0 = r5.hash(r6)
            int r1 = r5.maxProbeDistance
        L6:
            int[] r2 = r5.hashArray
            r2 = r2[r0]
            r3 = -1
            if (r2 != 0) goto Le
            return r3
        Le:
            if (r2 <= 0) goto L1d
            K[] r4 = r5.keysArray
            int r2 = r2 + (-1)
            r4 = r4[r2]
            boolean r4 = kotlin.jvm.internal.g0.g(r4, r6)
            if (r4 == 0) goto L1d
            return r2
        L1d:
            int r1 = r1 + r3
            if (r1 >= 0) goto L21
            return r3
        L21:
            int r2 = r0 + (-1)
            if (r0 != 0) goto L2c
            int r0 = r5.getHashSize()
            int r0 = r0 + (-1)
            goto L6
        L2c:
            r0 = r2
            goto L6
    }

    private final int findValue(V r3) {
            r2 = this;
            int r0 = r2.length
        L2:
            r1 = -1
            int r0 = r0 + r1
            if (r0 < 0) goto L1a
            int[] r1 = r2.presenceArray
            r1 = r1[r0]
            if (r1 < 0) goto L2
            V[] r1 = r2.valuesArray
            kotlin.jvm.internal.g0.m(r1)
            r1 = r1[r0]
            boolean r1 = kotlin.jvm.internal.g0.g(r1, r3)
            if (r1 == 0) goto L2
            return r0
        L1a:
            return r1
    }

    private final int getHashSize() {
            r1 = this;
            int[] r0 = r1.hashArray
            int r0 = r0.length
            return r0
    }

    private final int hash(K r2) {
            r1 = this;
            if (r2 == 0) goto L7
            int r2 = r2.hashCode()
            goto L8
        L7:
            r2 = 0
        L8:
            r0 = -1640531527(0xffffffff9e3779b9, float:-9.713111E-21)
            int r2 = r2 * r0
            int r0 = r1.hashShift
            int r2 = r2 >>> r0
            return r2
    }

    private final boolean putAllEntries(java.util.Collection<? extends java.util.Map.Entry<? extends K, ? extends V>> r3) {
            r2 = this;
            boolean r0 = r3.isEmpty()
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            int r0 = r3.size()
            r2.ensureExtraCapacity(r0)
            java.util.Iterator r3 = r3.iterator()
        L13:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L27
            java.lang.Object r0 = r3.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            boolean r0 = r2.putEntry(r0)
            if (r0 == 0) goto L13
            r1 = 1
            goto L13
        L27:
            return r1
    }

    private final boolean putEntry(java.util.Map.Entry<? extends K, ? extends V> r6) {
            r5 = this;
            java.lang.Object r0 = r6.getKey()
            int r0 = r5.addKey$kotlin_stdlib(r0)
            java.lang.Object[] r1 = r5.allocateValuesArray()
            r2 = 1
            if (r0 < 0) goto L16
            java.lang.Object r6 = r6.getValue()
            r1[r0] = r6
            return r2
        L16:
            int r0 = -r0
            int r0 = r0 - r2
            r3 = r1[r0]
            java.lang.Object r4 = r6.getValue()
            boolean r3 = kotlin.jvm.internal.g0.g(r4, r3)
            if (r3 != 0) goto L2b
            java.lang.Object r6 = r6.getValue()
            r1[r0] = r6
            return r2
        L2b:
            r6 = 0
            return r6
    }

    private final boolean putRehash(int r6) {
            r5 = this;
            K[] r0 = r5.keysArray
            r0 = r0[r6]
            int r0 = r5.hash(r0)
            int r1 = r5.maxProbeDistance
        La:
            int[] r2 = r5.hashArray
            r3 = r2[r0]
            r4 = 1
            if (r3 != 0) goto L1a
            int r1 = r6 + 1
            r2[r0] = r1
            int[] r1 = r5.presenceArray
            r1[r6] = r0
            return r4
        L1a:
            int r1 = r1 + (-1)
            if (r1 >= 0) goto L20
            r6 = 0
            return r6
        L20:
            int r2 = r0 + (-1)
            if (r0 != 0) goto L2a
            int r0 = r5.getHashSize()
            int r0 = r0 - r4
            goto La
        L2a:
            r0 = r2
            goto La
    }

    private final void readObject(java.io.ObjectInputStream r2) {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Deserialization is supported via proxy only"
            r2.<init>(r0)
            throw r2
    }

    private final void registerModification() {
            r1 = this;
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    private final void rehash(int r4) {
            r3 = this;
            r3.registerModification()
            int r0 = r3.length
            int r1 = r3.size()
            r2 = 0
            if (r0 <= r1) goto Lf
            r3.compact(r2)
        Lf:
            int[] r0 = new int[r4]
            r3.hashArray = r0
            kotlin.collections.builders.MapBuilder$a r0 = kotlin.collections.builders.MapBuilder.Companion
            int r4 = kotlin.collections.builders.MapBuilder.a.b(r0, r4)
            r3.hashShift = r4
        L1b:
            int r4 = r3.length
            if (r2 >= r4) goto L31
            int r4 = r2 + 1
            boolean r0 = r3.putRehash(r2)
            if (r0 == 0) goto L29
            r2 = r4
            goto L1b
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?"
            r4.<init>(r0)
            throw r4
        L31:
            return
    }

    private final void removeEntryAt(int r3) {
            r2 = this;
            K[] r0 = r2.keysArray
            kotlin.collections.builders.b.f(r0, r3)
            V[] r0 = r2.valuesArray
            if (r0 == 0) goto Lc
            kotlin.collections.builders.b.f(r0, r3)
        Lc:
            int[] r0 = r2.presenceArray
            r0 = r0[r3]
            r2.removeHashAt(r0)
            int[] r0 = r2.presenceArray
            r1 = -1
            r0[r3] = r1
            int r3 = r2.size()
            int r3 = r3 + r1
            r2.size = r3
            r2.registerModification()
            return
    }

    private final void removeHashAt(int r10) {
            r9 = this;
            int r0 = r9.maxProbeDistance
            int r0 = r0 * 2
            int r1 = r9.getHashSize()
            int r1 = r1 / 2
            int r0 = kotlin.ranges.t.B(r0, r1)
            r1 = 0
            r2 = r0
            r3 = 0
            r0 = r10
        L12:
            int r4 = r10 + (-1)
            if (r10 != 0) goto L1d
            int r10 = r9.getHashSize()
            int r10 = r10 + (-1)
            goto L1e
        L1d:
            r10 = r4
        L1e:
            int r3 = r3 + 1
            int r4 = r9.maxProbeDistance
            if (r3 <= r4) goto L29
            int[] r10 = r9.hashArray
            r10[r0] = r1
            return
        L29:
            int[] r4 = r9.hashArray
            r5 = r4[r10]
            if (r5 != 0) goto L32
            r4[r0] = r1
            return
        L32:
            r6 = -1
            if (r5 >= 0) goto L3a
            r4[r0] = r6
        L37:
            r0 = r10
            r3 = 0
            goto L57
        L3a:
            K[] r4 = r9.keysArray
            int r7 = r5 + (-1)
            r4 = r4[r7]
            int r4 = r9.hash(r4)
            int r4 = r4 - r10
            int r8 = r9.getHashSize()
            int r8 = r8 + (-1)
            r4 = r4 & r8
            if (r4 < r3) goto L57
            int[] r3 = r9.hashArray
            r3[r0] = r5
            int[] r3 = r9.presenceArray
            r3[r7] = r0
            goto L37
        L57:
            int r2 = r2 + r6
            if (r2 >= 0) goto L12
            int[] r10 = r9.hashArray
            r10[r0] = r6
            return
    }

    private final boolean shouldCompact(int r4) {
            r3 = this;
            int r0 = r3.getCapacity$kotlin_stdlib()
            int r1 = r3.length
            int r0 = r0 - r1
            int r2 = r3.size()
            int r1 = r1 - r2
            if (r0 >= r4) goto L1b
            int r0 = r0 + r1
            if (r0 < r4) goto L1b
            int r4 = r3.getCapacity$kotlin_stdlib()
            int r4 = r4 / 4
            if (r1 < r4) goto L1b
            r4 = 1
            return r4
        L1b:
            r4 = 0
            return r4
    }

    private final java.lang.Object writeReplace() {
            r2 = this;
            boolean r0 = r2.isReadOnly
            if (r0 == 0) goto La
            kotlin.collections.builders.f r0 = new kotlin.collections.builders.f
            r0.<init>(r2)
            return r0
        La:
            java.io.NotSerializableException r0 = new java.io.NotSerializableException
            java.lang.String r1 = "The map cannot be serialized while it is being built."
            r0.<init>(r1)
            throw r0
    }

    public final int addKey$kotlin_stdlib(K r8) {
            r7 = this;
            r7.checkIsMutable$kotlin_stdlib()
        L3:
            int r0 = r7.hash(r8)
            int r1 = r7.maxProbeDistance
            int r1 = r1 * 2
            int r2 = r7.getHashSize()
            int r2 = r2 / 2
            int r1 = kotlin.ranges.t.B(r1, r2)
            r2 = 0
        L16:
            int[] r3 = r7.hashArray
            r3 = r3[r0]
            r4 = 1
            if (r3 > 0) goto L4c
            int r1 = r7.length
            int r3 = r7.getCapacity$kotlin_stdlib()
            if (r1 < r3) goto L29
            r7.ensureExtraCapacity(r4)
            goto L3
        L29:
            int r1 = r7.length
            int r3 = r1 + 1
            r7.length = r3
            K[] r5 = r7.keysArray
            r5[r1] = r8
            int[] r8 = r7.presenceArray
            r8[r1] = r0
            int[] r8 = r7.hashArray
            r8[r0] = r3
            int r8 = r7.size()
            int r8 = r8 + r4
            r7.size = r8
            r7.registerModification()
            int r8 = r7.maxProbeDistance
            if (r2 <= r8) goto L4b
            r7.maxProbeDistance = r2
        L4b:
            return r1
        L4c:
            K[] r5 = r7.keysArray
            int r6 = r3 + (-1)
            r5 = r5[r6]
            boolean r5 = kotlin.jvm.internal.g0.g(r5, r8)
            if (r5 == 0) goto L5a
            int r8 = -r3
            return r8
        L5a:
            int r2 = r2 + 1
            if (r2 <= r1) goto L68
            int r0 = r7.getHashSize()
            int r0 = r0 * 2
            r7.rehash(r0)
            goto L3
        L68:
            int r3 = r0 + (-1)
            if (r0 != 0) goto L72
            int r0 = r7.getHashSize()
            int r0 = r0 - r4
            goto L16
        L72:
            r0 = r3
            goto L16
    }

    @org.jetbrains.annotations.NotNull
    public final java.util.Map<K, V> build() {
            r2 = this;
            r2.checkIsMutable$kotlin_stdlib()
            r0 = 1
            r2.isReadOnly = r0
            int r0 = r2.size()
            if (r0 <= 0) goto Ld
            return r2
        Ld:
            kotlin.collections.builders.MapBuilder r0 = kotlin.collections.builders.MapBuilder.Empty
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.builders.MapBuilder, V of kotlin.collections.builders.MapBuilder>"
            kotlin.jvm.internal.g0.n(r0, r1)
            return r0
    }

    public final void checkIsMutable$kotlin_stdlib() {
            r1 = this;
            boolean r0 = r1.isReadOnly
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Map
    public void clear() {
            r6 = this;
            r6.checkIsMutable$kotlin_stdlib()
            int r0 = r6.length
            int r0 = r0 + (-1)
            r1 = 0
            if (r0 < 0) goto L1d
            r2 = 0
        Lb:
            int[] r3 = r6.presenceArray
            r4 = r3[r2]
            if (r4 < 0) goto L18
            int[] r5 = r6.hashArray
            r5[r4] = r1
            r4 = -1
            r3[r2] = r4
        L18:
            if (r2 == r0) goto L1d
            int r2 = r2 + 1
            goto Lb
        L1d:
            K[] r0 = r6.keysArray
            int r2 = r6.length
            kotlin.collections.builders.b.g(r0, r1, r2)
            V[] r0 = r6.valuesArray
            if (r0 == 0) goto L2d
            int r2 = r6.length
            kotlin.collections.builders.b.g(r0, r1, r2)
        L2d:
            r6.size = r1
            r6.length = r1
            r6.registerModification()
            return
    }

    public final boolean containsAllEntries$kotlin_stdlib(@org.jetbrains.annotations.NotNull java.util.Collection<?> r3) {
            r2 = this;
            java.lang.String r0 = "m"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r3.next()
            r1 = 0
            if (r0 == 0) goto L1f
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.ClassCastException -> L1f
            boolean r0 = r2.containsEntry$kotlin_stdlib(r0)     // Catch: java.lang.ClassCastException -> L1f
            if (r0 != 0) goto L9
        L1f:
            return r1
        L20:
            r3 = 1
            return r3
    }

    public final boolean containsEntry$kotlin_stdlib(@org.jetbrains.annotations.NotNull java.util.Map.Entry<? extends K, ? extends V> r3) {
            r2 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.Object r0 = r3.getKey()
            int r0 = r2.findKey(r0)
            if (r0 >= 0) goto L11
            r3 = 0
            return r3
        L11:
            V[] r1 = r2.valuesArray
            kotlin.jvm.internal.g0.m(r1)
            r0 = r1[r0]
            java.lang.Object r3 = r3.getValue()
            boolean r3 = kotlin.jvm.internal.g0.g(r0, r3)
            return r3
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.findKey(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.findValue(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.collections.builders.MapBuilder.b<K, V> entriesIterator$kotlin_stdlib() {
            r1 = this;
            kotlin.collections.builders.MapBuilder$b r0 = new kotlin.collections.builders.MapBuilder$b
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            java.util.Set r0 = r1.getEntries()
            return r0
    }

    @Override // java.util.Map
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 == r1) goto L11
            boolean r0 = r2 instanceof java.util.Map
            if (r0 == 0) goto Lf
            java.util.Map r2 = (java.util.Map) r2
            boolean r2 = r1.contentEquals(r2)
            if (r2 == 0) goto Lf
            goto L11
        Lf:
            r2 = 0
            return r2
        L11:
            r2 = 1
            return r2
    }

    @Override // java.util.Map
    @org.jetbrains.annotations.Nullable
    public V get(java.lang.Object r2) {
            r1 = this;
            int r2 = r1.findKey(r2)
            if (r2 >= 0) goto L8
            r2 = 0
            return r2
        L8:
            V[] r0 = r1.valuesArray
            kotlin.jvm.internal.g0.m(r0)
            r2 = r0[r2]
            return r2
    }

    public final int getCapacity$kotlin_stdlib() {
            r1 = this;
            K[] r0 = r1.keysArray
            int r0 = r0.length
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<java.util.Map.Entry<K, V>> getEntries() {
            r1 = this;
            kotlin.collections.builders.c<K, V> r0 = r1.entriesView
            if (r0 != 0) goto Lb
            kotlin.collections.builders.c r0 = new kotlin.collections.builders.c
            r0.<init>(r1)
            r1.entriesView = r0
        Lb:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Set<K> getKeys() {
            r1 = this;
            kotlin.collections.builders.d<K> r0 = r1.keysView
            if (r0 != 0) goto Lb
            kotlin.collections.builders.d r0 = new kotlin.collections.builders.d
            r0.<init>(r1)
            r1.keysView = r0
        Lb:
            return r0
    }

    public int getSize() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.util.Collection<V> getValues() {
            r1 = this;
            kotlin.collections.builders.e<V> r0 = r1.valuesView
            if (r0 != 0) goto Lb
            kotlin.collections.builders.e r0 = new kotlin.collections.builders.e
            r0.<init>(r1)
            r1.valuesView = r0
        Lb:
            return r0
    }

    @Override // java.util.Map
    public int hashCode() {
            r3 = this;
            kotlin.collections.builders.MapBuilder$b r0 = r3.entriesIterator$kotlin_stdlib()
            r1 = 0
        L5:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L11
            int r2 = r0.m()
            int r1 = r1 + r2
            goto L5
        L11:
            return r1
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

    public final boolean isReadOnly$kotlin_stdlib() {
            r1 = this;
            boolean r0 = r1.isReadOnly
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Set<K> keySet() {
            r1 = this;
            java.util.Set r0 = r1.getKeys()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.collections.builders.MapBuilder.e<K, V> keysIterator$kotlin_stdlib() {
            r1 = this;
            kotlin.collections.builders.MapBuilder$e r0 = new kotlin.collections.builders.MapBuilder$e
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Map
    @org.jetbrains.annotations.Nullable
    public V put(K r3, V r4) {
            r2 = this;
            r2.checkIsMutable$kotlin_stdlib()
            int r3 = r2.addKey$kotlin_stdlib(r3)
            java.lang.Object[] r0 = r2.allocateValuesArray()
            if (r3 >= 0) goto L15
            int r3 = -r3
            int r3 = r3 + (-1)
            r1 = r0[r3]
            r0[r3] = r4
            return r1
        L15:
            r0[r3] = r4
            r3 = 0
            return r3
    }

    @Override // java.util.Map
    public void putAll(@org.jetbrains.annotations.NotNull java.util.Map<? extends K, ? extends V> r2) {
            r1 = this;
            java.lang.String r0 = "from"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.checkIsMutable$kotlin_stdlib()
            java.util.Set r2 = r2.entrySet()
            r1.putAllEntries(r2)
            return
    }

    @Override // java.util.Map
    @org.jetbrains.annotations.Nullable
    public V remove(java.lang.Object r2) {
            r1 = this;
            r1.checkIsMutable$kotlin_stdlib()
            int r2 = r1.findKey(r2)
            if (r2 >= 0) goto Lb
            r2 = 0
            return r2
        Lb:
            V[] r0 = r1.valuesArray
            kotlin.jvm.internal.g0.m(r0)
            r0 = r0[r2]
            r1.removeEntryAt(r2)
            return r0
    }

    public final boolean removeEntry$kotlin_stdlib(@org.jetbrains.annotations.NotNull java.util.Map.Entry<? extends K, ? extends V> r4) {
            r3 = this;
            java.lang.String r0 = "entry"
            kotlin.jvm.internal.g0.p(r4, r0)
            r3.checkIsMutable$kotlin_stdlib()
            java.lang.Object r0 = r4.getKey()
            int r0 = r3.findKey(r0)
            r1 = 0
            if (r0 >= 0) goto L14
            return r1
        L14:
            V[] r2 = r3.valuesArray
            kotlin.jvm.internal.g0.m(r2)
            r2 = r2[r0]
            java.lang.Object r4 = r4.getValue()
            boolean r4 = kotlin.jvm.internal.g0.g(r2, r4)
            if (r4 != 0) goto L26
            return r1
        L26:
            r3.removeEntryAt(r0)
            r4 = 1
            return r4
    }

    public final boolean removeKey$kotlin_stdlib(K r1) {
            r0 = this;
            r0.checkIsMutable$kotlin_stdlib()
            int r1 = r0.findKey(r1)
            if (r1 >= 0) goto Lb
            r1 = 0
            return r1
        Lb:
            r0.removeEntryAt(r1)
            r1 = 1
            return r1
    }

    public final boolean removeValue$kotlin_stdlib(V r1) {
            r0 = this;
            r0.checkIsMutable$kotlin_stdlib()
            int r1 = r0.findValue(r1)
            if (r1 >= 0) goto Lb
            r1 = 0
            return r1
        Lb:
            r0.removeEntryAt(r1)
            r1 = 1
            return r1
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r4.size()
            int r1 = r1 * 3
            int r1 = r1 + 2
            r0.<init>(r1)
            java.lang.String r1 = "{"
            r0.append(r1)
            kotlin.collections.builders.MapBuilder$b r1 = r4.entriesIterator$kotlin_stdlib()
            r2 = 0
        L17:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L2a
            if (r2 <= 0) goto L24
            java.lang.String r3 = ", "
            r0.append(r3)
        L24:
            r1.k(r0)
            int r2 = r2 + 1
            goto L17
        L2a:
            java.lang.String r1 = "}"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "toString(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    @Override // java.util.Map
    public final /* bridge */ java.util.Collection<V> values() {
            r1 = this;
            java.util.Collection r0 = r1.getValues()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.collections.builders.MapBuilder.f<K, V> valuesIterator$kotlin_stdlib() {
            r1 = this;
            kotlin.collections.builders.MapBuilder$f r0 = new kotlin.collections.builders.MapBuilder$f
            r0.<init>(r1)
            return r0
    }
}

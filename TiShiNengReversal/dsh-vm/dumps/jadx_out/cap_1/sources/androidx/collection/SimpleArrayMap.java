package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSimpleArrayMap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,769:1\n297#1,5:770\n297#1,5:775\n1#2:780\n*S KotlinDebug\n*F\n+ 1 SimpleArrayMap.kt\nandroidx/collection/SimpleArrayMap\n*L\n276#1:770,5\n291#1:775,5\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class SimpleArrayMap<K, V> {

    @org.jetbrains.annotations.NotNull
    private java.lang.Object[] array;

    @org.jetbrains.annotations.NotNull
    private int[] hashes;
    private int size;

    @kotlin.jvm.JvmOverloads
    public SimpleArrayMap() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    @kotlin.jvm.JvmOverloads
    public SimpleArrayMap(int r2) {
            r1 = this;
            r1.<init>()
            if (r2 != 0) goto L8
            int[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS
            goto La
        L8:
            int[] r0 = new int[r2]
        La:
            r1.hashes = r0
            if (r2 != 0) goto L11
            java.lang.Object[] r2 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            goto L15
        L11:
            int r2 = r2 << 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
        L15:
            r1.array = r2
            return
    }

    public /* synthetic */ SimpleArrayMap(int r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public SimpleArrayMap(@org.jetbrains.annotations.Nullable androidx.collection.SimpleArrayMap<? extends K, ? extends V> r4) {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            if (r4 == 0) goto Lb
            r3.putAll(r4)
        Lb:
            return
    }

    private final <T extends V> T getOrDefaultInternal(java.lang.Object r1, T r2) {
            r0 = this;
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Lf
            java.lang.Object[] r2 = r0.array
            int r1 = r1 << 1
            int r1 = r1 + 1
            r1 = r2[r1]
            return r1
        Lf:
            return r2
    }

    private final int indexOf(K r6, int r7) {
            r5 = this;
            int r0 = r5.size
            if (r0 != 0) goto L6
            r6 = -1
            return r6
        L6:
            int[] r1 = r5.hashes
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r0, r7)
            if (r1 >= 0) goto Lf
            goto L1b
        Lf:
            java.lang.Object[] r2 = r5.array
            int r3 = r1 << 1
            r2 = r2[r3]
            boolean r2 = kotlin.jvm.internal.g0.g(r6, r2)
            if (r2 == 0) goto L1c
        L1b:
            return r1
        L1c:
            int r2 = r1 + 1
        L1e:
            if (r2 >= r0) goto L36
            int[] r3 = r5.hashes
            r3 = r3[r2]
            if (r3 != r7) goto L36
            java.lang.Object[] r3 = r5.array
            int r4 = r2 << 1
            r3 = r3[r4]
            boolean r3 = kotlin.jvm.internal.g0.g(r6, r3)
            if (r3 == 0) goto L33
            return r2
        L33:
            int r2 = r2 + 1
            goto L1e
        L36:
            int r1 = r1 + (-1)
        L38:
            if (r1 < 0) goto L50
            int[] r0 = r5.hashes
            r0 = r0[r1]
            if (r0 != r7) goto L50
            java.lang.Object[] r0 = r5.array
            int r3 = r1 << 1
            r0 = r0[r3]
            boolean r0 = kotlin.jvm.internal.g0.g(r6, r0)
            if (r0 == 0) goto L4d
            return r1
        L4d:
            int r1 = r1 + (-1)
            goto L38
        L50:
            int r6 = ~r2
            return r6
    }

    private final int indexOfNull() {
            r5 = this;
            int r0 = r5.size
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int[] r1 = r5.hashes
            r2 = 0
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r1, r0, r2)
            if (r1 >= 0) goto L10
            goto L18
        L10:
            java.lang.Object[] r2 = r5.array
            int r3 = r1 << 1
            r2 = r2[r3]
            if (r2 != 0) goto L19
        L18:
            return r1
        L19:
            int r2 = r1 + 1
        L1b:
            if (r2 >= r0) goto L2f
            int[] r3 = r5.hashes
            r3 = r3[r2]
            if (r3 != 0) goto L2f
            java.lang.Object[] r3 = r5.array
            int r4 = r2 << 1
            r3 = r3[r4]
            if (r3 != 0) goto L2c
            return r2
        L2c:
            int r2 = r2 + 1
            goto L1b
        L2f:
            int r1 = r1 + (-1)
        L31:
            if (r1 < 0) goto L45
            int[] r0 = r5.hashes
            r0 = r0[r1]
            if (r0 != 0) goto L45
            java.lang.Object[] r0 = r5.array
            int r3 = r1 << 1
            r0 = r0[r3]
            if (r0 != 0) goto L42
            return r1
        L42:
            int r1 = r1 + (-1)
            goto L31
        L45:
            int r0 = ~r2
            return r0
    }

    @kotlin.jvm.JvmName(name = "__restricted$indexOfValue")
    public final int __restricted$indexOfValue(V r6) {
            r5 = this;
            int r0 = r5.size
            int r0 = r0 * 2
            java.lang.Object[] r1 = r5.array
            r2 = 1
            if (r6 != 0) goto L15
            r6 = 1
        La:
            if (r6 >= r0) goto L26
            r3 = r1[r6]
            if (r3 != 0) goto L12
            int r6 = r6 >> r2
            return r6
        L12:
            int r6 = r6 + 2
            goto La
        L15:
            r3 = 1
        L16:
            if (r3 >= r0) goto L26
            r4 = r1[r3]
            boolean r4 = kotlin.jvm.internal.g0.g(r6, r4)
            if (r4 == 0) goto L23
            int r6 = r3 >> 1
            return r6
        L23:
            int r3 = r3 + 2
            goto L16
        L26:
            r6 = -1
            return r6
    }

    public void clear() {
            r1 = this;
            int r0 = r1.size
            if (r0 <= 0) goto Lf
            int[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS
            r1.hashes = r0
            java.lang.Object[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r1.array = r0
            r0 = 0
            r1.size = r0
        Lf:
            int r0 = r1.size
            if (r0 > 0) goto L14
            return
        L14:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    public boolean containsKey(K r1) {
            r0 = this;
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public boolean containsValue(V r1) {
            r0 = this;
            int r1 = r0.__restricted$indexOfValue(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public void ensureCapacity(int r4) {
            r3 = this;
            int r0 = r3.size
            int[] r1 = r3.hashes
            int r2 = r1.length
            if (r2 >= r4) goto L1f
            int[] r1 = java.util.Arrays.copyOf(r1, r4)
            java.lang.String r2 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r1, r2)
            r3.hashes = r1
            java.lang.Object[] r1 = r3.array
            int r4 = r4 * 2
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r1, r4)
            kotlin.jvm.internal.g0.o(r4, r2)
            r3.array = r4
        L1f:
            int r4 = r3.size
            if (r4 != r0) goto L24
            return
        L24:
            java.util.ConcurrentModificationException r4 = new java.util.ConcurrentModificationException
            r4.<init>()
            throw r4
    }

    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            r1 = 0
            boolean r2 = r8 instanceof androidx.collection.SimpleArrayMap     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L40
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L7f
            r3 = r8
            androidx.collection.SimpleArrayMap r3 = (androidx.collection.SimpleArrayMap) r3     // Catch: java.lang.Throwable -> L7f
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L7f
            if (r2 == r3) goto L17
            return r1
        L17:
            androidx.collection.SimpleArrayMap r8 = (androidx.collection.SimpleArrayMap) r8     // Catch: java.lang.Throwable -> L7f
            int r2 = r7.size     // Catch: java.lang.Throwable -> L7f
            r3 = 0
        L1c:
            if (r3 >= r2) goto L3f
            java.lang.Object r4 = r7.keyAt(r3)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r5 = r7.valueAt(r3)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r6 = r8.get(r4)     // Catch: java.lang.Throwable -> L7f
            if (r5 != 0) goto L35
            if (r6 != 0) goto L34
            boolean r4 = r8.containsKey(r4)     // Catch: java.lang.Throwable -> L7f
            if (r4 != 0) goto L3c
        L34:
            return r1
        L35:
            boolean r4 = kotlin.jvm.internal.g0.g(r5, r6)     // Catch: java.lang.Throwable -> L7f
            if (r4 != 0) goto L3c
            return r1
        L3c:
            int r3 = r3 + 1
            goto L1c
        L3f:
            return r0
        L40:
            boolean r2 = r8 instanceof java.util.Map     // Catch: java.lang.Throwable -> L7f
            if (r2 == 0) goto L7f
            int r2 = r7.size()     // Catch: java.lang.Throwable -> L7f
            r3 = r8
            java.util.Map r3 = (java.util.Map) r3     // Catch: java.lang.Throwable -> L7f
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L7f
            if (r2 == r3) goto L52
            return r1
        L52:
            int r2 = r7.size     // Catch: java.lang.Throwable -> L7f
            r3 = 0
        L55:
            if (r3 >= r2) goto L7e
            java.lang.Object r4 = r7.keyAt(r3)     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r5 = r7.valueAt(r3)     // Catch: java.lang.Throwable -> L7f
            r6 = r8
            java.util.Map r6 = (java.util.Map) r6     // Catch: java.lang.Throwable -> L7f
            java.lang.Object r6 = r6.get(r4)     // Catch: java.lang.Throwable -> L7f
            if (r5 != 0) goto L74
            if (r6 != 0) goto L73
            r5 = r8
            java.util.Map r5 = (java.util.Map) r5     // Catch: java.lang.Throwable -> L7f
            boolean r4 = r5.containsKey(r4)     // Catch: java.lang.Throwable -> L7f
            if (r4 != 0) goto L7b
        L73:
            return r1
        L74:
            boolean r4 = kotlin.jvm.internal.g0.g(r5, r6)     // Catch: java.lang.Throwable -> L7f
            if (r4 != 0) goto L7b
            return r1
        L7b:
            int r3 = r3 + 1
            goto L55
        L7e:
            return r0
        L7f:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public V get(K r2) {
            r1 = this;
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto Lf
            java.lang.Object[] r0 = r1.array
            int r2 = r2 << 1
            int r2 = r2 + 1
            r2 = r0[r2]
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public V getOrDefault(@org.jetbrains.annotations.Nullable java.lang.Object r1, V r2) {
            r0 = this;
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Lf
            java.lang.Object[] r2 = r0.array
            int r1 = r1 << 1
            int r1 = r1 + 1
            r1 = r2[r1]
            return r1
        Lf:
            return r2
    }

    public int hashCode() {
            r9 = this;
            int[] r0 = r9.hashes
            java.lang.Object[] r1 = r9.array
            int r2 = r9.size
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 0
        La:
            if (r5 >= r2) goto L1f
            r7 = r1[r4]
            r8 = r0[r5]
            if (r7 == 0) goto L17
            int r7 = r7.hashCode()
            goto L18
        L17:
            r7 = 0
        L18:
            r7 = r7 ^ r8
            int r6 = r6 + r7
            int r5 = r5 + 1
            int r4 = r4 + 2
            goto La
        L1f:
            return r6
    }

    public int indexOfKey(K r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = r1.indexOfNull()
            return r2
        L7:
            int r0 = r2.hashCode()
            int r2 = r1.indexOf(r2, r0)
            return r2
    }

    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 > 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public K keyAt(int r3) {
            r2 = this;
            if (r3 < 0) goto Ld
            int r0 = r2.size
            if (r3 >= r0) goto Ld
            java.lang.Object[] r0 = r2.array
            int r3 = r3 << 1
            r3 = r0[r3]
            return r3
        Ld:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected index to be within 0..size()-1, but was "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public V put(K r8, V r9) {
            r7 = this;
            int r0 = r7.size
            if (r8 == 0) goto L9
            int r1 = r8.hashCode()
            goto La
        L9:
            r1 = 0
        La:
            if (r8 == 0) goto L11
            int r2 = r7.indexOf(r8, r1)
            goto L15
        L11:
            int r2 = r7.indexOfNull()
        L15:
            if (r2 < 0) goto L22
            int r8 = r2 << 1
            int r8 = r8 + 1
            java.lang.Object[] r0 = r7.array
            r1 = r0[r8]
            r0[r8] = r9
            return r1
        L22:
            int r2 = ~r2
            int[] r3 = r7.hashes
            int r4 = r3.length
            if (r0 < r4) goto L58
            r4 = 8
            if (r0 < r4) goto L30
            int r4 = r0 >> 1
            int r4 = r4 + r0
            goto L35
        L30:
            r5 = 4
            if (r0 < r5) goto L34
            goto L35
        L34:
            r4 = 4
        L35:
            int[] r3 = java.util.Arrays.copyOf(r3, r4)
            java.lang.String r5 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r3, r5)
            r7.hashes = r3
            java.lang.Object[] r3 = r7.array
            int r4 = r4 << 1
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r4)
            kotlin.jvm.internal.g0.o(r3, r5)
            r7.array = r3
            int r3 = r7.size
            if (r0 != r3) goto L52
            goto L58
        L52:
            java.util.ConcurrentModificationException r8 = new java.util.ConcurrentModificationException
            r8.<init>()
            throw r8
        L58:
            if (r2 >= r0) goto L6e
            int[] r3 = r7.hashes
            int r4 = r2 + 1
            kotlin.collections.n.z0(r3, r3, r4, r2, r0)
            java.lang.Object[] r3 = r7.array
            int r4 = r4 << 1
            int r5 = r2 << 1
            int r6 = r7.size
            int r6 = r6 << 1
            kotlin.collections.n.B0(r3, r3, r4, r5, r6)
        L6e:
            int r3 = r7.size
            if (r0 != r3) goto L89
            int[] r0 = r7.hashes
            int r4 = r0.length
            if (r2 >= r4) goto L89
            r0[r2] = r1
            java.lang.Object[] r0 = r7.array
            int r1 = r2 << 1
            r0[r1] = r8
            int r1 = r1 + 1
            r0[r1] = r9
            int r3 = r3 + 1
            r7.size = r3
            r8 = 0
            return r8
        L89:
            java.util.ConcurrentModificationException r8 = new java.util.ConcurrentModificationException
            r8.<init>()
            throw r8
    }

    public void putAll(@org.jetbrains.annotations.NotNull androidx.collection.SimpleArrayMap<? extends K, ? extends V> r5) {
            r4 = this;
            java.lang.String r0 = "map"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.size
            int r1 = r4.size
            int r1 = r1 + r0
            r4.ensureCapacity(r1)
            int r1 = r4.size
            r2 = 0
            if (r1 != 0) goto L27
            if (r0 <= 0) goto L37
            int[] r1 = r5.hashes
            int[] r3 = r4.hashes
            kotlin.collections.n.z0(r1, r3, r2, r2, r0)
            java.lang.Object[] r5 = r5.array
            java.lang.Object[] r1 = r4.array
            int r3 = r0 << 1
            kotlin.collections.n.B0(r5, r1, r2, r2, r3)
            r4.size = r0
            return
        L27:
            if (r2 >= r0) goto L37
            java.lang.Object r1 = r5.keyAt(r2)
            java.lang.Object r3 = r5.valueAt(r2)
            r4.put(r1, r3)
            int r2 = r2 + 1
            goto L27
        L37:
            return
    }

    @org.jetbrains.annotations.Nullable
    public V putIfAbsent(K r2, V r3) {
            r1 = this;
            java.lang.Object r0 = r1.get(r2)
            if (r0 != 0) goto Lb
            java.lang.Object r2 = r1.put(r2, r3)
            return r2
        Lb:
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public V remove(K r1) {
            r0 = this;
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r1 = r0.removeAt(r1)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean remove(K r2, V r3) {
            r1 = this;
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L15
            java.lang.Object r0 = r1.valueAt(r2)
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L15
            r1.removeAt(r2)
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    public V removeAt(int r11) {
            r10 = this;
            if (r11 < 0) goto L90
            int r0 = r10.size
            if (r11 >= r0) goto L90
            java.lang.Object[] r1 = r10.array
            int r2 = r11 << 1
            int r3 = r2 + 1
            r3 = r1[r3]
            r4 = 1
            if (r0 > r4) goto L15
            r10.clear()
            return r3
        L15:
            int r5 = r0 + (-1)
            int[] r6 = r10.hashes
            int r7 = r6.length
            r8 = 8
            if (r7 <= r8) goto L6a
            int r7 = r6.length
            int r7 = r7 / 3
            if (r0 >= r7) goto L6a
            if (r0 <= r8) goto L29
            int r7 = r0 >> 1
            int r8 = r0 + r7
        L29:
            int[] r7 = java.util.Arrays.copyOf(r6, r8)
            java.lang.String r9 = "copyOf(this, newSize)"
            kotlin.jvm.internal.g0.o(r7, r9)
            r10.hashes = r7
            java.lang.Object[] r7 = r10.array
            int r8 = r8 << r4
            java.lang.Object[] r7 = java.util.Arrays.copyOf(r7, r8)
            kotlin.jvm.internal.g0.o(r7, r9)
            r10.array = r7
            int r7 = r10.size
            if (r0 != r7) goto L64
            if (r11 <= 0) goto L51
            int[] r7 = r10.hashes
            r8 = 0
            kotlin.collections.n.z0(r6, r7, r8, r8, r11)
            java.lang.Object[] r7 = r10.array
            kotlin.collections.n.B0(r1, r7, r8, r8, r2)
        L51:
            if (r11 >= r5) goto L83
            int[] r7 = r10.hashes
            int r8 = r11 + 1
            kotlin.collections.n.z0(r6, r7, r11, r8, r0)
            java.lang.Object[] r11 = r10.array
            int r4 = r8 << 1
            int r6 = r0 << 1
            kotlin.collections.n.B0(r1, r11, r2, r4, r6)
            goto L83
        L64:
            java.util.ConcurrentModificationException r11 = new java.util.ConcurrentModificationException
            r11.<init>()
            throw r11
        L6a:
            if (r11 >= r5) goto L79
            int r1 = r11 + 1
            kotlin.collections.n.z0(r6, r6, r11, r1, r0)
            java.lang.Object[] r11 = r10.array
            int r1 = r1 << r4
            int r6 = r0 << 1
            kotlin.collections.n.B0(r11, r11, r2, r1, r6)
        L79:
            java.lang.Object[] r11 = r10.array
            int r1 = r5 << 1
            r2 = 0
            r11[r1] = r2
            int r1 = r1 + r4
            r11[r1] = r2
        L83:
            int r11 = r10.size
            if (r0 != r11) goto L8a
            r10.size = r5
            return r3
        L8a:
            java.util.ConcurrentModificationException r11 = new java.util.ConcurrentModificationException
            r11.<init>()
            throw r11
        L90:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected index to be within 0..size()-1, but was "
            r0.append(r1)
            r0.append(r11)
            java.lang.String r11 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r11 = r11.toString()
            r0.<init>(r11)
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public V replace(K r1, V r2) {
            r0 = this;
            int r1 = r0.indexOfKey(r1)
            if (r1 < 0) goto Lb
            java.lang.Object r1 = r0.setValueAt(r1, r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public boolean replace(K r2, V r3, V r4) {
            r1 = this;
            int r2 = r1.indexOfKey(r2)
            if (r2 < 0) goto L15
            java.lang.Object r0 = r1.valueAt(r2)
            boolean r3 = kotlin.jvm.internal.g0.g(r3, r0)
            if (r3 == 0) goto L15
            r1.setValueAt(r2, r4)
            r2 = 1
            return r2
        L15:
            r2 = 0
            return r2
    }

    public V setValueAt(int r3, V r4) {
            r2 = this;
            if (r3 < 0) goto L11
            int r0 = r2.size
            if (r3 >= r0) goto L11
            int r3 = r3 << 1
            int r3 = r3 + 1
            java.lang.Object[] r0 = r2.array
            r1 = r0[r3]
            r0[r3] = r4
            return r1
        L11:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Expected index to be within 0..size()-1, but was "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r5 = this;
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto La
            java.lang.String r0 = "{}"
            return r0
        La:
            int r0 = r5.size
            int r0 = r0 * 28
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r5.size
            r2 = 0
        L1b:
            if (r2 >= r0) goto L48
            if (r2 <= 0) goto L24
            java.lang.String r3 = ", "
            r1.append(r3)
        L24:
            java.lang.Object r3 = r5.keyAt(r2)
            java.lang.String r4 = "(this Map)"
            if (r3 == r1) goto L30
            r1.append(r3)
            goto L33
        L30:
            r1.append(r4)
        L33:
            r3 = 61
            r1.append(r3)
            java.lang.Object r3 = r5.valueAt(r2)
            if (r3 == r1) goto L42
            r1.append(r3)
            goto L45
        L42:
            r1.append(r4)
        L45:
            int r2 = r2 + 1
            goto L1b
        L48:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    public V valueAt(int r3) {
            r2 = this;
            if (r3 < 0) goto Lf
            int r0 = r2.size
            if (r3 >= r0) goto Lf
            java.lang.Object[] r0 = r2.array
            int r3 = r3 << 1
            int r3 = r3 + 1
            r3 = r0[r3]
            return r3
        Lf:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Expected index to be within 0..size()-1, but was "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }
}

package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ArraySetKt {
    public static final int ARRAY_SET_BASE_SIZE = 4;

    public static final <E> void addAllInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r8, @org.jetbrains.annotations.NotNull androidx.collection.ArraySet<? extends E> r9) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r5 = r9.get_size$collection()
            int r0 = r8.get_size$collection()
            int r0 = r0 + r5
            r8.ensureCapacity(r0)
            int r0 = r8.get_size$collection()
            if (r0 != 0) goto L48
            if (r5 <= 0) goto L55
            int[] r1 = r9.getHashes$collection()
            int[] r2 = r8.getHashes$collection()
            r6 = 6
            r7 = 0
            r3 = 0
            r4 = 0
            kotlin.collections.n.I0(r1, r2, r3, r4, r5, r6, r7)
            java.lang.Object[] r1 = r9.getArray$collection()
            java.lang.Object[] r2 = r8.getArray$collection()
            kotlin.collections.n.K0(r1, r2, r3, r4, r5, r6, r7)
            int r9 = r8.get_size$collection()
            if (r9 != 0) goto L42
            r8.set_size$collection(r5)
            return
        L42:
            java.util.ConcurrentModificationException r8 = new java.util.ConcurrentModificationException
            r8.<init>()
            throw r8
        L48:
            r0 = 0
        L49:
            if (r0 >= r5) goto L55
            java.lang.Object r1 = r9.valueAt(r0)
            r8.add(r1)
            int r0 = r0 + 1
            goto L49
        L55:
            return
    }

    public static final <E> boolean addAllInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r2, @org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.get_size$collection()
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.ensureCapacity(r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L1b:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L2b
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            r0 = r0 | r1
            goto L1b
        L2b:
            return r0
    }

    public static final <E> boolean addInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r17, E r18) {
            r0 = r17
            r1 = r18
            java.lang.String r2 = "<this>"
            kotlin.jvm.internal.g0.p(r0, r2)
            int r2 = r0.get_size$collection()
            r3 = 0
            if (r1 != 0) goto L16
            int r4 = indexOfNull(r0)
            r5 = 0
            goto L23
        L16:
            int r4 = r1.hashCode()
            int r5 = indexOf(r0, r1, r4)
            r16 = r5
            r5 = r4
            r4 = r16
        L23:
            if (r4 < 0) goto L26
            return r3
        L26:
            int r4 = ~r4
            int[] r6 = r0.getHashes$collection()
            int r6 = r6.length
            r7 = 1
            if (r2 < r6) goto L76
            r6 = 8
            if (r2 < r6) goto L37
            int r6 = r2 >> 1
            int r6 = r6 + r2
            goto L3c
        L37:
            r8 = 4
            if (r2 < r8) goto L3b
            goto L3c
        L3b:
            r6 = 4
        L3c:
            int[] r8 = r0.getHashes$collection()
            java.lang.Object[] r15 = r0.getArray$collection()
            allocArrays(r0, r6)
            int r6 = r0.get_size$collection()
            if (r2 != r6) goto L70
            int[] r6 = r0.getHashes$collection()
            int r6 = r6.length
            if (r6 != 0) goto L55
            r3 = 1
        L55:
            if (r3 != 0) goto L76
            int[] r9 = r0.getHashes$collection()
            int r12 = r8.length
            r13 = 6
            r14 = 0
            r10 = 0
            r11 = 0
            kotlin.collections.n.I0(r8, r9, r10, r11, r12, r13, r14)
            java.lang.Object[] r10 = r0.getArray$collection()
            int r13 = r15.length
            r14 = 6
            r9 = r15
            r15 = 0
            r12 = 0
            kotlin.collections.n.K0(r9, r10, r11, r12, r13, r14, r15)
            goto L76
        L70:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
        L76:
            if (r4 >= r2) goto L90
            int[] r3 = r0.getHashes$collection()
            int[] r6 = r0.getHashes$collection()
            int r8 = r4 + 1
            kotlin.collections.n.z0(r3, r6, r8, r4, r2)
            java.lang.Object[] r3 = r0.getArray$collection()
            java.lang.Object[] r6 = r0.getArray$collection()
            kotlin.collections.n.B0(r3, r6, r8, r4, r2)
        L90:
            int r3 = r0.get_size$collection()
            if (r2 != r3) goto Lb2
            int[] r2 = r0.getHashes$collection()
            int r2 = r2.length
            if (r4 >= r2) goto Lb2
            int[] r2 = r0.getHashes$collection()
            r2[r4] = r5
            java.lang.Object[] r2 = r0.getArray$collection()
            r2[r4] = r1
            int r1 = r0.get_size$collection()
            int r1 = r1 + r7
            r0.set_size$collection(r1)
            return r7
        Lb2:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    public static final <E> void allocArrays(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int[] r0 = new int[r2]
            r1.setHashes$collection(r0)
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r1.setArray$collection(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> androidx.collection.ArraySet<T> arraySetOf() {
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            r1 = 1
            r2 = 0
            r3 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <T> androidx.collection.ArraySet<T> arraySetOf(@org.jetbrains.annotations.NotNull T... r4) {
            java.lang.String r0 = "values"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.collection.ArraySet r0 = new androidx.collection.ArraySet
            int r1 = r4.length
            r0.<init>(r1)
            int r1 = r4.length
            r2 = 0
        Le:
            if (r2 >= r1) goto L18
            r3 = r4[r2]
            r0.add(r3)
            int r2 = r2 + 1
            goto Le
        L18:
            return r0
    }

    public static final <E> int binarySearchInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int[] r0 = r1.getHashes$collection()     // Catch: java.lang.IndexOutOfBoundsException -> L12
            int r1 = r1.get_size$collection()     // Catch: java.lang.IndexOutOfBoundsException -> L12
            int r1 = androidx.collection.internal.ContainerHelpersKt.binarySearch(r0, r1, r2)     // Catch: java.lang.IndexOutOfBoundsException -> L12
            return r1
        L12:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    public static final <E> void clearInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r0 = r1.get_size$collection()
            if (r0 == 0) goto L19
            int[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS
            r1.setHashes$collection(r0)
            java.lang.Object[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r1.setArray$collection(r0)
            r0 = 0
            r1.set_size$collection(r0)
        L19:
            int r1 = r1.get_size$collection()
            if (r1 != 0) goto L20
            return
        L20:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    public static final <E> boolean containsAllInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r1, @org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        Le:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L20
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto Le
            r1 = 0
            return r1
        L20:
            r1 = 1
            return r1
    }

    public static final <E> boolean containsInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r1, E r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.indexOf(r2)
            if (r1 < 0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static final <E> void ensureCapacityInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r10, int r11) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r10.get_size$collection()
            int[] r1 = r10.getHashes$collection()
            int r1 = r1.length
            if (r1 >= r11) goto L3f
            int[] r2 = r10.getHashes$collection()
            java.lang.Object[] r1 = r10.getArray$collection()
            allocArrays(r10, r11)
            int r11 = r10.get_size$collection()
            if (r11 <= 0) goto L3f
            int[] r3 = r10.getHashes$collection()
            int r6 = r10.get_size$collection()
            r7 = 6
            r8 = 0
            r4 = 0
            r5 = 0
            kotlin.collections.n.I0(r2, r3, r4, r5, r6, r7, r8)
            java.lang.Object[] r4 = r10.getArray$collection()
            int r7 = r10.get_size$collection()
            r8 = 6
            r9 = 0
            r6 = 0
            r3 = r1
            kotlin.collections.n.K0(r3, r4, r5, r6, r7, r8, r9)
        L3f:
            int r10 = r10.get_size$collection()
            if (r10 != r0) goto L46
            return
        L46:
            java.util.ConcurrentModificationException r10 = new java.util.ConcurrentModificationException
            r10.<init>()
            throw r10
    }

    public static final <E> boolean equalsInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r6, @org.jetbrains.annotations.Nullable java.lang.Object r7) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r6, r0)
            r0 = 1
            if (r6 != r7) goto L9
            return r0
        L9:
            boolean r1 = r7 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L35
            int r1 = r6.size()
            r3 = r7
            java.util.Set r3 = (java.util.Set) r3
            int r3 = r3.size()
            if (r1 == r3) goto L1c
            return r2
        L1c:
            int r1 = r6.get_size$collection()     // Catch: java.lang.Throwable -> L35
            r3 = 0
        L21:
            if (r3 >= r1) goto L34
            java.lang.Object r4 = r6.valueAt(r3)     // Catch: java.lang.Throwable -> L35
            r5 = r7
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L35
            boolean r4 = r5.contains(r4)     // Catch: java.lang.Throwable -> L35
            if (r4 != 0) goto L31
            return r2
        L31:
            int r3 = r3 + 1
            goto L21
        L34:
            return r0
        L35:
            return r2
    }

    public static final <E> int hashCodeInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int[] r0 = r4.getHashes$collection()
            int r4 = r4.get_size$collection()
            r1 = 0
            r2 = 0
        Lf:
            if (r1 >= r4) goto L17
            r3 = r0[r1]
            int r2 = r2 + r3
            int r1 = r1 + 1
            goto Lf
        L17:
            return r2
    }

    public static final <E> int indexOf(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, int r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r4.get_size$collection()
            if (r0 != 0) goto Ld
            r4 = -1
            return r4
        Ld:
            int r1 = binarySearchInternal(r4, r6)
            if (r1 >= 0) goto L14
            goto L20
        L14:
            java.lang.Object[] r2 = r4.getArray$collection()
            r2 = r2[r1]
            boolean r2 = kotlin.jvm.internal.g0.g(r5, r2)
            if (r2 == 0) goto L21
        L20:
            return r1
        L21:
            int r2 = r1 + 1
        L23:
            if (r2 >= r0) goto L3d
            int[] r3 = r4.getHashes$collection()
            r3 = r3[r2]
            if (r3 != r6) goto L3d
            java.lang.Object[] r3 = r4.getArray$collection()
            r3 = r3[r2]
            boolean r3 = kotlin.jvm.internal.g0.g(r5, r3)
            if (r3 == 0) goto L3a
            return r2
        L3a:
            int r2 = r2 + 1
            goto L23
        L3d:
            int r1 = r1 + (-1)
        L3f:
            if (r1 < 0) goto L59
            int[] r0 = r4.getHashes$collection()
            r0 = r0[r1]
            if (r0 != r6) goto L59
            java.lang.Object[] r0 = r4.getArray$collection()
            r0 = r0[r1]
            boolean r0 = kotlin.jvm.internal.g0.g(r5, r0)
            if (r0 == 0) goto L56
            return r1
        L56:
            int r1 = r1 + (-1)
            goto L3f
        L59:
            int r4 = ~r2
            return r4
    }

    public static final <E> int indexOfInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r1, @org.jetbrains.annotations.Nullable java.lang.Object r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            if (r2 != 0) goto Lc
            int r1 = indexOfNull(r1)
            return r1
        Lc:
            int r0 = r2.hashCode()
            int r1 = indexOf(r1, r2, r0)
            return r1
    }

    public static final <E> int indexOfNull(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1 = 0
            int r2 = indexOf(r2, r0, r1)
            return r2
    }

    public static final <E> boolean isEmptyInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r1 = r1.get_size$collection()
            if (r1 > 0) goto Ld
            r1 = 1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    public static final <E> boolean removeAllInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r5, @org.jetbrains.annotations.NotNull androidx.collection.ArraySet<? extends E> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.get_size$collection()
            int r1 = r5.get_size$collection()
            r2 = 0
            r3 = 0
        L14:
            if (r3 >= r0) goto L20
            java.lang.Object r4 = r6.valueAt(r3)
            r5.remove(r4)
            int r3 = r3 + 1
            goto L14
        L20:
            int r5 = r5.get_size$collection()
            if (r1 == r5) goto L28
            r5 = 1
            return r5
        L28:
            return r2
    }

    public static final <E> boolean removeAllInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r2, @org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r3) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        Lf:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1f
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto Lf
        L1f:
            return r0
    }

    public static final <E> E removeAtInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r14, int r15) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r14, r0)
            int r0 = r14.get_size$collection()
            java.lang.Object[] r1 = r14.getArray$collection()
            r1 = r1[r15]
            r2 = 1
            if (r0 > r2) goto L16
            r14.clear()
            return r1
        L16:
            int r3 = r0 + (-1)
            int[] r4 = r14.getHashes$collection()
            int r4 = r4.length
            r5 = 8
            if (r4 <= r5) goto L7c
            int r4 = r14.get_size$collection()
            int[] r6 = r14.getHashes$collection()
            int r6 = r6.length
            int r6 = r6 / 3
            if (r4 >= r6) goto L7c
            int r4 = r14.get_size$collection()
            if (r4 <= r5) goto L40
            int r4 = r14.get_size$collection()
            int r5 = r14.get_size$collection()
            int r2 = r5 >> 1
            int r5 = r4 + r2
        L40:
            int[] r6 = r14.getHashes$collection()
            java.lang.Object[] r2 = r14.getArray$collection()
            allocArrays(r14, r5)
            if (r15 <= 0) goto L67
            int[] r7 = r14.getHashes$collection()
            r11 = 6
            r12 = 0
            r8 = 0
            r9 = 0
            r10 = r15
            kotlin.collections.n.I0(r6, r7, r8, r9, r10, r11, r12)
            java.lang.Object[] r8 = r14.getArray$collection()
            r12 = 6
            r13 = 0
            r11 = r10
            r10 = 0
            r7 = r2
            kotlin.collections.n.K0(r7, r8, r9, r10, r11, r12, r13)
            r10 = r11
            goto L69
        L67:
            r10 = r15
            r7 = r2
        L69:
            if (r10 >= r3) goto L9e
            int[] r15 = r14.getHashes$collection()
            int r2 = r10 + 1
            kotlin.collections.n.z0(r6, r15, r10, r2, r0)
            java.lang.Object[] r15 = r14.getArray$collection()
            kotlin.collections.n.B0(r7, r15, r10, r2, r0)
            goto L9e
        L7c:
            r10 = r15
            if (r10 >= r3) goto L97
            int[] r15 = r14.getHashes$collection()
            int[] r2 = r14.getHashes$collection()
            int r4 = r10 + 1
            kotlin.collections.n.z0(r15, r2, r10, r4, r0)
            java.lang.Object[] r15 = r14.getArray$collection()
            java.lang.Object[] r2 = r14.getArray$collection()
            kotlin.collections.n.B0(r15, r2, r10, r4, r0)
        L97:
            java.lang.Object[] r15 = r14.getArray$collection()
            r2 = 0
            r15[r3] = r2
        L9e:
            int r15 = r14.get_size$collection()
            if (r0 != r15) goto La8
            r14.set_size$collection(r3)
            return r1
        La8:
            java.util.ConcurrentModificationException r14 = new java.util.ConcurrentModificationException
            r14.<init>()
            throw r14
    }

    public static final <E> boolean removeInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r1, E r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            int r2 = r1.indexOf(r2)
            if (r2 < 0) goto L10
            r1.removeAt(r2)
            r1 = 1
            return r1
        L10:
            r1 = 0
            return r1
    }

    public static final <E> boolean retainAllInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r5, @org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r6) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r5, r0)
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5.get_size$collection()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        L11:
            r3 = -1
            if (r3 >= r0) goto L2a
            r3 = r6
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object[] r4 = r5.getArray$collection()
            r4 = r4[r0]
            boolean r3 = kotlin.collections.f0.a2(r3, r4)
            if (r3 != 0) goto L27
            r5.removeAt(r0)
            r2 = 1
        L27:
            int r0 = r0 + (-1)
            goto L11
        L2a:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> java.lang.String toStringInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto Lf
            java.lang.String r4 = "{}"
            return r4
        Lf:
            int r0 = r4.get_size$collection()
            int r0 = r0 * 14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r4.get_size$collection()
            r2 = 0
        L24:
            if (r2 >= r0) goto L3f
            if (r2 <= 0) goto L2d
            java.lang.String r3 = ", "
            r1.append(r3)
        L2d:
            java.lang.Object r3 = r4.valueAt(r2)
            if (r3 == r4) goto L37
            r1.append(r3)
            goto L3c
        L37:
            java.lang.String r3 = "(this Set)"
            r1.append(r3)
        L3c:
            int r2 = r2 + 1
            goto L24
        L3f:
            r4 = 125(0x7d, float:1.75E-43)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r0 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.g0.o(r4, r0)
            return r4
    }

    public static final <E> E valueAtInternal(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<E> r1, int r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.Object[] r1 = r1.getArray$collection()
            r1 = r1[r2]
            return r1
    }
}

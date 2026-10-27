package androidx.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nArraySet.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n+ 2 ArraySet.kt\nandroidx/collection/ArraySetKt\n*L\n1#1,300:1\n304#2,10:301\n317#2,14:311\n334#2:325\n339#2:326\n345#2:327\n350#2:328\n355#2,61:329\n420#2,17:390\n440#2,6:407\n450#2,60:413\n518#2,9:473\n531#2,22:482\n557#2,7:504\n568#2,19:511\n591#2,6:530\n601#2,6:536\n611#2,5:542\n620#2,8:547\n*S KotlinDebug\n*F\n+ 1 ArraySet.jvm.kt\nandroidx/collection/ArraySet\n*L\n98#1:301,10\n108#1:311,14\n118#1:325\n128#1:326\n138#1:327\n145#1:328\n157#1:329,61\n167#1:390,17\n177#1:407,6\n188#1:413,60\n197#1:473,9\n224#1:482,22\n231#1:504,7\n240#1:511,19\n267#1:530,6\n276#1:536,6\n286#1:542,5\n297#1:547,8\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ArraySet<E> implements java.util.Collection<E>, java.util.Set<E>, l3.b, l3.h {
    private int _size;

    @org.jetbrains.annotations.NotNull
    private java.lang.Object[] array;

    @org.jetbrains.annotations.NotNull
    private int[] hashes;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ElementIterator extends androidx.collection.IndexBasedArrayIterator<E> {
        final /* synthetic */ androidx.collection.ArraySet<E> this$0;

        public ElementIterator(androidx.collection.ArraySet r1) {
                r0 = this;
                r0.this$0 = r1
                int r1 = r1.get_size$collection()
                r0.<init>(r1)
                return
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected E elementAt(int r2) {
                r1 = this;
                androidx.collection.ArraySet<E> r0 = r1.this$0
                java.lang.Object r2 = r0.valueAt(r2)
                return r2
        }

        @Override // androidx.collection.IndexBasedArrayIterator
        protected void removeAt(int r2) {
                r1 = this;
                androidx.collection.ArraySet<E> r0 = r1.this$0
                r0.removeAt(r2)
                return
        }
    }

    @kotlin.jvm.JvmOverloads
    public ArraySet() {
            r3 = this;
            r0 = 1
            r1 = 0
            r2 = 0
            r3.<init>(r2, r0, r1)
            return
    }

    @kotlin.jvm.JvmOverloads
    public ArraySet(int r2) {
            r1 = this;
            r1.<init>()
            int[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS
            r1.hashes = r0
            java.lang.Object[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r1.array = r0
            if (r2 <= 0) goto L10
            androidx.collection.ArraySetKt.allocArrays(r1, r2)
        L10:
            return
    }

    public /* synthetic */ ArraySet(int r1, int r2, kotlin.jvm.internal.v r3) {
            r0 = this;
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            r0.<init>(r1)
            return
    }

    public ArraySet(@org.jetbrains.annotations.Nullable androidx.collection.ArraySet<? extends E> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            if (r2 == 0) goto L9
            r1.addAll(r2)
        L9:
            return
    }

    public ArraySet(@org.jetbrains.annotations.Nullable java.util.Collection<? extends E> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            if (r2 == 0) goto L9
            r1.addAll(r2)
        L9:
            return
    }

    public ArraySet(@org.jetbrains.annotations.Nullable E[] r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            if (r2 == 0) goto L18
            java.util.Iterator r2 = kotlin.jvm.internal.h.a(r2)
        La:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r2.next()
            r1.add(r0)
            goto La
        L18:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E r18) {
            r17 = this;
            r0 = r17
            r1 = r18
            int r2 = r0.get_size$collection()
            r3 = 0
            if (r1 != 0) goto L11
            int r4 = androidx.collection.ArraySetKt.indexOfNull(r0)
            r5 = 0
            goto L1e
        L11:
            int r4 = r1.hashCode()
            int r5 = androidx.collection.ArraySetKt.indexOf(r0, r1, r4)
            r16 = r5
            r5 = r4
            r4 = r16
        L1e:
            if (r4 < 0) goto L21
            return r3
        L21:
            int r4 = ~r4
            int[] r6 = r0.getHashes$collection()
            int r6 = r6.length
            r7 = 1
            if (r2 < r6) goto L71
            r6 = 8
            if (r2 < r6) goto L32
            int r6 = r2 >> 1
            int r6 = r6 + r2
            goto L37
        L32:
            r8 = 4
            if (r2 < r8) goto L36
            goto L37
        L36:
            r6 = 4
        L37:
            int[] r8 = r0.getHashes$collection()
            java.lang.Object[] r15 = r0.getArray$collection()
            androidx.collection.ArraySetKt.allocArrays(r0, r6)
            int r6 = r0.get_size$collection()
            if (r2 != r6) goto L6b
            int[] r6 = r0.getHashes$collection()
            int r6 = r6.length
            if (r6 != 0) goto L50
            r3 = 1
        L50:
            if (r3 != 0) goto L71
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
            goto L71
        L6b:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
        L71:
            if (r4 >= r2) goto L8b
            int[] r3 = r0.getHashes$collection()
            int[] r6 = r0.getHashes$collection()
            int r8 = r4 + 1
            kotlin.collections.n.z0(r3, r6, r8, r4, r2)
            java.lang.Object[] r3 = r0.getArray$collection()
            java.lang.Object[] r6 = r0.getArray$collection()
            kotlin.collections.n.B0(r3, r6, r8, r4, r2)
        L8b:
            int r3 = r0.get_size$collection()
            if (r2 != r3) goto Lad
            int[] r2 = r0.getHashes$collection()
            int r2 = r2.length
            if (r4 >= r2) goto Lad
            int[] r2 = r0.getHashes$collection()
            r2[r4] = r5
            java.lang.Object[] r2 = r0.getArray$collection()
            r2[r4] = r1
            int r1 = r0.get_size$collection()
            int r1 = r1 + r7
            r0.set_size$collection(r1)
            return r7
        Lad:
            java.util.ConcurrentModificationException r1 = new java.util.ConcurrentModificationException
            r1.<init>()
            throw r1
    }

    public final void addAll(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<? extends E> r9) {
            r8 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r9, r0)
            int r5 = r9.get_size$collection()
            int r0 = r8.get_size$collection()
            int r0 = r0 + r5
            r8.ensureCapacity(r0)
            int r0 = r8.get_size$collection()
            if (r0 != 0) goto L43
            if (r5 <= 0) goto L50
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
            if (r9 != 0) goto L3d
            r8.set_size$collection(r5)
            return
        L3d:
            java.util.ConcurrentModificationException r9 = new java.util.ConcurrentModificationException
            r9.<init>()
            throw r9
        L43:
            r0 = 0
        L44:
            if (r0 >= r5) goto L50
            java.lang.Object r1 = r9.valueAt(r0)
            r8.add(r1)
            int r0 = r0 + 1
            goto L44
        L50:
            return
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends E> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            int r0 = r2.get_size$collection()
            int r1 = r3.size()
            int r0 = r0 + r1
            r2.ensureCapacity(r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        L16:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            r0 = r0 | r1
            goto L16
        L26:
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
            r1 = this;
            int r0 = r1.get_size$collection()
            if (r0 == 0) goto L14
            int[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_INTS
            r1.setHashes$collection(r0)
            java.lang.Object[] r0 = androidx.collection.internal.ContainerHelpersKt.EMPTY_OBJECTS
            r1.setArray$collection(r0)
            r0 = 0
            r1.set_size$collection(r0)
        L14:
            int r0 = r1.get_size$collection()
            if (r0 != 0) goto L1b
            return
        L1b:
            java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
            r0.<init>()
            throw r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r2) {
            r1 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.util.Iterator r2 = r2.iterator()
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L9
            r2 = 0
            return r2
        L1b:
            r2 = 1
            return r2
    }

    public final void ensureCapacity(int r11) {
            r10 = this;
            int r0 = r10.get_size$collection()
            int[] r1 = r10.getHashes$collection()
            int r1 = r1.length
            if (r1 >= r11) goto L3a
            int[] r2 = r10.getHashes$collection()
            java.lang.Object[] r1 = r10.getArray$collection()
            androidx.collection.ArraySetKt.allocArrays(r10, r11)
            int r11 = r10.get_size$collection()
            if (r11 <= 0) goto L3a
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
        L3a:
            int r11 = r10.get_size$collection()
            if (r11 != r0) goto L41
            return
        L41:
            java.util.ConcurrentModificationException r11 = new java.util.ConcurrentModificationException
            r11.<init>()
            throw r11
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L30
            int r1 = r6.size()
            r3 = r7
            java.util.Set r3 = (java.util.Set) r3
            int r3 = r3.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            int r1 = r6.get_size$collection()     // Catch: java.lang.Throwable -> L30
            r3 = 0
        L1c:
            if (r3 >= r1) goto L2f
            java.lang.Object r4 = r6.valueAt(r3)     // Catch: java.lang.Throwable -> L30
            r5 = r7
            java.util.Set r5 = (java.util.Set) r5     // Catch: java.lang.Throwable -> L30
            boolean r4 = r5.contains(r4)     // Catch: java.lang.Throwable -> L30
            if (r4 != 0) goto L2c
            return r2
        L2c:
            int r3 = r3 + 1
            goto L1c
        L2f:
            return r0
        L30:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Object[] getArray$collection() {
            r1 = this;
            java.lang.Object[] r0 = r1.array
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final int[] getHashes$collection() {
            r1 = this;
            int[] r0 = r1.hashes
            return r0
    }

    public int getSize() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    public final int get_size$collection() {
            r1 = this;
            int r0 = r1._size
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
            r5 = this;
            int[] r0 = r5.getHashes$collection()
            int r1 = r5.get_size$collection()
            r2 = 0
            r3 = 0
        La:
            if (r2 >= r1) goto L12
            r4 = r0[r2]
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto La
        L12:
            return r3
    }

    public final int indexOf(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            if (r2 != 0) goto L7
            int r2 = androidx.collection.ArraySetKt.indexOfNull(r1)
            return r2
        L7:
            int r0 = r2.hashCode()
            int r2 = androidx.collection.ArraySetKt.indexOf(r1, r2, r0)
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.get_size$collection()
            if (r0 > 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<E> iterator() {
            r1 = this;
            androidx.collection.ArraySet$ElementIterator r0 = new androidx.collection.ArraySet$ElementIterator
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(java.lang.Object r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto Lb
            r0.removeAt(r1)
            r1 = 1
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public final boolean removeAll(@org.jetbrains.annotations.NotNull androidx.collection.ArraySet<? extends E> r6) {
            r5 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.get_size$collection()
            int r1 = r5.get_size$collection()
            r2 = 0
            r3 = 0
        Lf:
            if (r3 >= r0) goto L1b
            java.lang.Object r4 = r6.valueAt(r3)
            r5.remove(r4)
            int r3 = r3 + 1
            goto Lf
        L1b:
            int r6 = r5.get_size$collection()
            if (r1 == r6) goto L23
            r6 = 1
            return r6
        L23:
            return r2
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r3) {
            r2 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.util.Iterator r3 = r3.iterator()
            r0 = 0
        La:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.remove(r1)
            r0 = r0 | r1
            goto La
        L1a:
            return r0
    }

    public final E removeAt(int r15) {
            r14 = this;
            int r0 = r14.get_size$collection()
            java.lang.Object[] r1 = r14.getArray$collection()
            r1 = r1[r15]
            r2 = 1
            if (r0 > r2) goto L11
            r14.clear()
            return r1
        L11:
            int r3 = r0 + (-1)
            int[] r4 = r14.getHashes$collection()
            int r4 = r4.length
            r5 = 8
            if (r4 <= r5) goto L77
            int r4 = r14.get_size$collection()
            int[] r6 = r14.getHashes$collection()
            int r6 = r6.length
            int r6 = r6 / 3
            if (r4 >= r6) goto L77
            int r4 = r14.get_size$collection()
            if (r4 <= r5) goto L3b
            int r4 = r14.get_size$collection()
            int r5 = r14.get_size$collection()
            int r2 = r5 >> 1
            int r5 = r4 + r2
        L3b:
            int[] r6 = r14.getHashes$collection()
            java.lang.Object[] r2 = r14.getArray$collection()
            androidx.collection.ArraySetKt.allocArrays(r14, r5)
            if (r15 <= 0) goto L62
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
            goto L64
        L62:
            r10 = r15
            r7 = r2
        L64:
            if (r10 >= r3) goto L99
            int[] r15 = r14.getHashes$collection()
            int r2 = r10 + 1
            kotlin.collections.n.z0(r6, r15, r10, r2, r0)
            java.lang.Object[] r15 = r14.getArray$collection()
            kotlin.collections.n.B0(r7, r15, r10, r2, r0)
            goto L99
        L77:
            r10 = r15
            if (r10 >= r3) goto L92
            int[] r15 = r14.getHashes$collection()
            int[] r2 = r14.getHashes$collection()
            int r4 = r10 + 1
            kotlin.collections.n.z0(r15, r2, r10, r4, r0)
            java.lang.Object[] r15 = r14.getArray$collection()
            java.lang.Object[] r2 = r14.getArray$collection()
            kotlin.collections.n.B0(r15, r2, r10, r4, r0)
        L92:
            java.lang.Object[] r15 = r14.getArray$collection()
            r2 = 0
            r15[r3] = r2
        L99:
            int r15 = r14.get_size$collection()
            if (r0 != r15) goto La3
            r14.set_size$collection(r3)
            return r1
        La3:
            java.util.ConcurrentModificationException r15 = new java.util.ConcurrentModificationException
            r15.<init>()
            throw r15
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(@org.jetbrains.annotations.NotNull java.util.Collection<? extends java.lang.Object> r6) {
            r5 = this;
            java.lang.String r0 = "elements"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r5.get_size$collection()
            r1 = 1
            int r0 = r0 - r1
            r2 = 0
        Lc:
            r3 = -1
            if (r3 >= r0) goto L25
            r3 = r6
            java.lang.Iterable r3 = (java.lang.Iterable) r3
            java.lang.Object[] r4 = r5.getArray$collection()
            r4 = r4[r0]
            boolean r3 = kotlin.collections.f0.a2(r3, r4)
            if (r3 != 0) goto L22
            r5.removeAt(r0)
            r2 = 1
        L22:
            int r0 = r0 + (-1)
            goto Lc
        L25:
            return r2
    }

    public final void setArray$collection(@org.jetbrains.annotations.NotNull java.lang.Object[] r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.array = r2
            return
    }

    public final void setHashes$collection(@org.jetbrains.annotations.NotNull int[] r2) {
            r1 = this;
            java.lang.String r0 = "<set-?>"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.hashes = r2
            return
    }

    public final void set_size$collection(int r1) {
            r0 = this;
            r0._size = r1
            return
    }

    @Override // java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
            r1 = this;
            int r0 = r1.getSize()
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object[] toArray() {
            r3 = this;
            java.lang.Object[] r0 = r3.array
            r1 = 0
            int r2 = r3._size
            java.lang.Object[] r0 = kotlin.collections.n.l1(r0, r1, r2)
            return r0
    }

    @Override // java.util.Collection, java.util.Set
    @org.jetbrains.annotations.NotNull
    public final <T> T[] toArray(@org.jetbrains.annotations.NotNull T[] r4) {
            r3 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r4, r0)
            int r0 = r3._size
            java.lang.Object[] r4 = androidx.collection.ArraySetJvmUtil.resizeForToArray(r4, r0)
            java.lang.Object[] r0 = r3.array
            r1 = 0
            int r2 = r3._size
            kotlin.collections.n.B0(r0, r4, r1, r1, r2)
            java.lang.String r0 = "result"
            kotlin.jvm.internal.g0.o(r4, r0)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r4 = this;
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto La
            java.lang.String r0 = "{}"
            return r0
        La:
            int r0 = r4.get_size$collection()
            int r0 = r0 * 14
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r0)
            r0 = 123(0x7b, float:1.72E-43)
            r1.append(r0)
            int r0 = r4.get_size$collection()
            r2 = 0
        L1f:
            if (r2 >= r0) goto L3a
            if (r2 <= 0) goto L28
            java.lang.String r3 = ", "
            r1.append(r3)
        L28:
            java.lang.Object r3 = r4.valueAt(r2)
            if (r3 == r4) goto L32
            r1.append(r3)
            goto L37
        L32:
            java.lang.String r3 = "(this Set)"
            r1.append(r3)
        L37:
            int r2 = r2 + 1
            goto L1f
        L3a:
            r0 = 125(0x7d, float:1.75E-43)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "StringBuilder(capacity).…builderAction).toString()"
            kotlin.jvm.internal.g0.o(r0, r1)
            return r0
    }

    public final E valueAt(int r2) {
            r1 = this;
            java.lang.Object[] r0 = r1.getArray$collection()
            r2 = r0[r2]
            return r2
    }
}

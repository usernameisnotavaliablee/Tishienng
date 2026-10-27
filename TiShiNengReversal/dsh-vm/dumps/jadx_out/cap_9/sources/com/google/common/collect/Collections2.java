package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Collections2 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class FilteredCollection<E> extends java.util.AbstractCollection<E> {
        final com.google.common.base.Predicate<? super E> predicate;
        final java.util.Collection<E> unfiltered;

        FilteredCollection(java.util.Collection<E> r1, com.google.common.base.Predicate<? super E> r2) {
                r0 = this;
                r0.<init>()
                r0.unfiltered = r1
                r0.predicate = r2
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(E r2) {
                r1 = this;
                com.google.common.base.Predicate<? super E> r0 = r1.predicate
                boolean r0 = r0.apply(r2)
                com.google.common.base.Preconditions.checkArgument(r0)
                java.util.Collection<E> r0 = r1.unfiltered
                boolean r2 = r0.add(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(java.util.Collection<? extends E> r4) {
                r3 = this;
                java.util.Iterator r0 = r4.iterator()
            L4:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L18
                java.lang.Object r1 = r0.next()
                com.google.common.base.Predicate<? super E> r2 = r3.predicate
                boolean r1 = r2.apply(r1)
                com.google.common.base.Preconditions.checkArgument(r1)
                goto L4
            L18:
                java.util.Collection<E> r0 = r3.unfiltered
                boolean r4 = r0.addAll(r4)
                return r4
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r2 = this;
                java.util.Collection<E> r0 = r2.unfiltered
                com.google.common.base.Predicate<? super E> r1 = r2.predicate
                com.google.common.collect.Iterables.removeIf(r0, r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                java.util.Collection<E> r0 = r1.unfiltered
                boolean r0 = com.google.common.collect.Collections2.safeContains(r0, r2)
                if (r0 == 0) goto Lf
                com.google.common.base.Predicate<? super E> r0 = r1.predicate
                boolean r2 = r0.apply(r2)
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r1) {
                r0 = this;
                boolean r1 = com.google.common.collect.Collections2.containsAllImpl(r0, r1)
                return r1
        }

        com.google.common.collect.Collections2.FilteredCollection<E> createCombined(com.google.common.base.Predicate<? super E> r4) {
                r3 = this;
                com.google.common.collect.Collections2$FilteredCollection r0 = new com.google.common.collect.Collections2$FilteredCollection
                java.util.Collection<E> r1 = r3.unfiltered
                com.google.common.base.Predicate<? super E> r2 = r3.predicate
                com.google.common.base.Predicate r4 = com.google.common.base.Predicates.and(r2, r4)
                r0.<init>(r1, r4)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r2 = this;
                java.util.Collection<E> r0 = r2.unfiltered
                com.google.common.base.Predicate<? super E> r1 = r2.predicate
                boolean r0 = com.google.common.collect.Iterables.any(r0, r1)
                r0 = r0 ^ 1
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<E> iterator() {
                r2 = this;
                java.util.Collection<E> r0 = r2.unfiltered
                java.util.Iterator r0 = r0.iterator()
                com.google.common.base.Predicate<? super E> r1 = r2.predicate
                com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.filter(r0, r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r1.contains(r2)
                if (r0 == 0) goto L10
                java.util.Collection<E> r0 = r1.unfiltered
                boolean r2 = r0.remove(r2)
                if (r2 == 0) goto L10
                r2 = 1
                return r2
            L10:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r5) {
                r4 = this;
                java.util.Collection<E> r0 = r4.unfiltered
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L7:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L24
                java.lang.Object r2 = r0.next()
                com.google.common.base.Predicate<? super E> r3 = r4.predicate
                boolean r3 = r3.apply(r2)
                if (r3 == 0) goto L7
                boolean r2 = r5.contains(r2)
                if (r2 == 0) goto L7
                r0.remove()
                r1 = 1
                goto L7
            L24:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r5) {
                r4 = this;
                java.util.Collection<E> r0 = r4.unfiltered
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L7:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L24
                java.lang.Object r2 = r0.next()
                com.google.common.base.Predicate<? super E> r3 = r4.predicate
                boolean r3 = r3.apply(r2)
                if (r3 == 0) goto L7
                boolean r2 = r5.contains(r2)
                if (r2 != 0) goto L7
                r0.remove()
                r1 = 1
                goto L7
            L24:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r4 = this;
                java.util.Collection<E> r0 = r4.unfiltered
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            L7:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L1c
                java.lang.Object r2 = r0.next()
                com.google.common.base.Predicate<? super E> r3 = r4.predicate
                boolean r2 = r3.apply(r2)
                if (r2 == 0) goto L7
                int r1 = r1 + 1
                goto L7
            L1c:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public java.lang.Object[] toArray() {
                r1 = this;
                java.util.Iterator r0 = r1.iterator()
                java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList(r0)
                java.lang.Object[] r0 = r0.toArray()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] r2) {
                r1 = this;
                java.util.Iterator r0 = r1.iterator()
                java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList(r0)
                java.lang.Object[] r2 = r0.toArray(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class OrderedPermutationCollection<E> extends java.util.AbstractCollection<java.util.List<E>> {
        final java.util.Comparator<? super E> comparator;
        final com.google.common.collect.ImmutableList<E> inputList;
        final int size;

        OrderedPermutationCollection(java.lang.Iterable<E> r1, java.util.Comparator<? super E> r2) {
                r0 = this;
                r0.<init>()
                com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.sortedCopyOf(r2, r1)
                r0.inputList = r1
                r0.comparator = r2
                int r1 = calculateSize(r1, r2)
                r0.size = r1
                return
        }

        private static <E> int calculateSize(java.util.List<E> r6, java.util.Comparator<? super E> r7) {
                r0 = 1
                r1 = 1
                r2 = 1
                r3 = 1
            L4:
                int r4 = r6.size()
                if (r1 >= r4) goto L2d
                int r4 = r1 + (-1)
                java.lang.Object r4 = r6.get(r4)
                java.lang.Object r5 = r6.get(r1)
                int r4 = r7.compare(r4, r5)
                if (r4 >= 0) goto L29
                int r3 = com.google.common.math.IntMath.binomial(r1, r3)
                int r2 = com.google.common.math.IntMath.saturatedMultiply(r2, r3)
                r3 = 2147483647(0x7fffffff, float:NaN)
                if (r2 != r3) goto L28
                return r3
            L28:
                r3 = 0
            L29:
                int r1 = r1 + 1
                int r3 = r3 + r0
                goto L4
            L2d:
                int r6 = com.google.common.math.IntMath.binomial(r1, r3)
                int r6 = com.google.common.math.IntMath.saturatedMultiply(r2, r6)
                return r6
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.util.List
                if (r0 == 0) goto Ld
                java.util.List r2 = (java.util.List) r2
                com.google.common.collect.ImmutableList<E> r0 = r1.inputList
                boolean r2 = com.google.common.collect.Collections2.access$000(r0, r2)
                return r2
            Ld:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.util.List<E>> iterator() {
                r3 = this;
                com.google.common.collect.Collections2$OrderedPermutationIterator r0 = new com.google.common.collect.Collections2$OrderedPermutationIterator
                com.google.common.collect.ImmutableList<E> r1 = r3.inputList
                java.util.Comparator<? super E> r2 = r3.comparator
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                int r0 = r1.size
                return r0
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "orderedPermutationCollection("
                r0.append(r1)
                com.google.common.collect.ImmutableList<E> r1 = r2.inputList
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class OrderedPermutationIterator<E> extends com.google.common.collect.AbstractIterator<java.util.List<E>> {
        final java.util.Comparator<? super E> comparator;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        java.util.List<E> nextPermutation;

        OrderedPermutationIterator(java.util.List<E> r1, java.util.Comparator<? super E> r2) {
                r0 = this;
                r0.<init>()
                java.util.ArrayList r1 = com.google.common.collect.Lists.newArrayList(r1)
                r0.nextPermutation = r1
                r0.comparator = r2
                return
        }

        void calculateNextPermutation() {
                r3 = this;
                int r0 = r3.findNextJ()
                r1 = -1
                if (r0 != r1) goto Lb
                r0 = 0
                r3.nextPermutation = r0
                return
            Lb:
                int r1 = r3.findNextL(r0)
                java.util.List<E> r2 = r3.nextPermutation
                java.util.Collections.swap(r2, r0, r1)
                java.util.List<E> r1 = r3.nextPermutation
                int r1 = r1.size()
                java.util.List<E> r2 = r3.nextPermutation
                int r0 = r0 + 1
                java.util.List r0 = r2.subList(r0, r1)
                java.util.Collections.reverse(r0)
                return
        }

        @Override // com.google.common.collect.AbstractIterator
        protected /* bridge */ /* synthetic */ java.lang.Object computeNext() {
                r1 = this;
                java.util.List r0 = r1.computeNext()
                return r0
        }

        @Override // com.google.common.collect.AbstractIterator
        protected java.util.List<E> computeNext() {
                r1 = this;
                java.util.List<E> r0 = r1.nextPermutation
                if (r0 != 0) goto Lb
                java.lang.Object r0 = r1.endOfData()
                java.util.List r0 = (java.util.List) r0
                return r0
            Lb:
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
                r1.calculateNextPermutation()
                return r0
        }

        int findNextJ() {
                r5 = this;
                java.util.List<E> r0 = r5.nextPermutation
                int r0 = r0.size()
                int r0 = r0 + (-2)
            L8:
                if (r0 < 0) goto L24
                java.util.Comparator<? super E> r1 = r5.comparator
                java.util.List<E> r2 = r5.nextPermutation
                java.lang.Object r2 = r2.get(r0)
                java.util.List<E> r3 = r5.nextPermutation
                int r4 = r0 + 1
                java.lang.Object r3 = r3.get(r4)
                int r1 = r1.compare(r2, r3)
                if (r1 >= 0) goto L21
                return r0
            L21:
                int r0 = r0 + (-1)
                goto L8
            L24:
                r0 = -1
                return r0
        }

        int findNextL(int r5) {
                r4 = this;
                java.util.List<E> r0 = r4.nextPermutation
                java.lang.Object r0 = r0.get(r5)
                java.util.List<E> r1 = r4.nextPermutation
                int r1 = r1.size()
                int r1 = r1 + (-1)
            Le:
                if (r1 <= r5) goto L22
                java.util.Comparator<? super E> r2 = r4.comparator
                java.util.List<E> r3 = r4.nextPermutation
                java.lang.Object r3 = r3.get(r1)
                int r2 = r2.compare(r0, r3)
                if (r2 >= 0) goto L1f
                return r1
            L1f:
                int r1 = r1 + (-1)
                goto Le
            L22:
                java.lang.AssertionError r5 = new java.lang.AssertionError
                java.lang.String r0 = "this statement should be unreachable"
                r5.<init>(r0)
                throw r5
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class PermutationCollection<E> extends java.util.AbstractCollection<java.util.List<E>> {
        final com.google.common.collect.ImmutableList<E> inputList;

        PermutationCollection(com.google.common.collect.ImmutableList<E> r1) {
                r0 = this;
                r0.<init>()
                r0.inputList = r1
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.util.List
                if (r0 == 0) goto Ld
                java.util.List r2 = (java.util.List) r2
                com.google.common.collect.ImmutableList<E> r0 = r1.inputList
                boolean r2 = com.google.common.collect.Collections2.access$000(r0, r2)
                return r2
            Ld:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<java.util.List<E>> iterator() {
                r2 = this;
                com.google.common.collect.Collections2$PermutationIterator r0 = new com.google.common.collect.Collections2$PermutationIterator
                com.google.common.collect.ImmutableList<E> r1 = r2.inputList
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                com.google.common.collect.ImmutableList<E> r0 = r1.inputList
                int r0 = r0.size()
                int r0 = com.google.common.math.IntMath.factorial(r0)
                return r0
        }

        @Override // java.util.AbstractCollection
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "permutations("
                r0.append(r1)
                com.google.common.collect.ImmutableList<E> r1 = r2.inputList
                r0.append(r1)
                java.lang.String r1 = ")"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class PermutationIterator<E> extends com.google.common.collect.AbstractIterator<java.util.List<E>> {
        final int[] c;
        int j;
        final java.util.List<E> list;
        final int[] o;

        PermutationIterator(java.util.List<E> r3) {
                r2 = this;
                r2.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>(r3)
                r2.list = r0
                int r3 = r3.size()
                int[] r0 = new int[r3]
                r2.c = r0
                int[] r3 = new int[r3]
                r2.o = r3
                r1 = 0
                java.util.Arrays.fill(r0, r1)
                r0 = 1
                java.util.Arrays.fill(r3, r0)
                r3 = 2147483647(0x7fffffff, float:NaN)
                r2.j = r3
                return
        }

        void calculateNextPermutation() {
                r5 = this;
                java.util.List<E> r0 = r5.list
                int r0 = r0.size()
                int r0 = r0 + (-1)
                r5.j = r0
                r1 = -1
                if (r0 != r1) goto Le
                goto L26
            Le:
                r0 = 0
            Lf:
                int[] r1 = r5.c
                int r2 = r5.j
                r1 = r1[r2]
                int[] r3 = r5.o
                r3 = r3[r2]
                int r3 = r3 + r1
                if (r3 >= 0) goto L20
                r5.switchDirection()
                goto Lf
            L20:
                int r4 = r2 + 1
                if (r3 != r4) goto L2d
                if (r2 != 0) goto L27
            L26:
                return
            L27:
                int r0 = r0 + 1
                r5.switchDirection()
                goto Lf
            L2d:
                java.util.List<E> r4 = r5.list
                int r1 = r2 - r1
                int r1 = r1 + r0
                int r2 = r2 - r3
                int r2 = r2 + r0
                java.util.Collections.swap(r4, r1, r2)
                int[] r0 = r5.c
                int r1 = r5.j
                r0[r1] = r3
                return
        }

        @Override // com.google.common.collect.AbstractIterator
        protected /* bridge */ /* synthetic */ java.lang.Object computeNext() {
                r1 = this;
                java.util.List r0 = r1.computeNext()
                return r0
        }

        @Override // com.google.common.collect.AbstractIterator
        protected java.util.List<E> computeNext() {
                r1 = this;
                int r0 = r1.j
                if (r0 > 0) goto Lb
                java.lang.Object r0 = r1.endOfData()
                java.util.List r0 = (java.util.List) r0
                return r0
            Lb:
                java.util.List<E> r0 = r1.list
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf(r0)
                r1.calculateNextPermutation()
                return r0
        }

        void switchDirection() {
                r3 = this;
                int[] r0 = r3.o
                int r1 = r3.j
                r2 = r0[r1]
                int r2 = -r2
                r0[r1] = r2
                int r1 = r1 + (-1)
                r3.j = r1
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class TransformedCollection<F, T> extends java.util.AbstractCollection<T> {
        final java.util.Collection<F> fromCollection;
        final com.google.common.base.Function<? super F, ? extends T> function;

        TransformedCollection(java.util.Collection<F> r1, com.google.common.base.Function<? super F, ? extends T> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Collection r1 = (java.util.Collection) r1
                r0.fromCollection = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.function = r1
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
                r1 = this;
                java.util.Collection<F> r0 = r1.fromCollection
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                java.util.Collection<F> r0 = r1.fromCollection
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<T> iterator() {
                r2 = this;
                java.util.Collection<F> r0 = r2.fromCollection
                java.util.Iterator r0 = r0.iterator()
                com.google.common.base.Function<? super F, ? extends T> r1 = r2.function
                java.util.Iterator r0 = com.google.common.collect.Iterators.transform(r0, r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
                r1 = this;
                java.util.Collection<F> r0 = r1.fromCollection
                int r0 = r0.size()
                return r0
        }
    }

    private Collections2() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ boolean access$000(java.util.List r0, java.util.List r1) {
            boolean r0 = isPermutation(r0, r1)
            return r0
    }

    static <T> java.util.Collection<T> cast(java.lang.Iterable<T> r0) {
            java.util.Collection r0 = (java.util.Collection) r0
            return r0
    }

    static boolean containsAllImpl(java.util.Collection<?> r1, java.util.Collection<?> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    private static <E> com.google.common.collect.ObjectCountHashMap<E> counts(java.util.Collection<E> r3) {
            com.google.common.collect.ObjectCountHashMap r0 = new com.google.common.collect.ObjectCountHashMap
            r0.<init>()
            java.util.Iterator r3 = r3.iterator()
        L9:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r3.next()
            int r2 = r0.get(r1)
            int r2 = r2 + 1
            r0.put(r1, r2)
            goto L9
        L1d:
            return r0
    }

    public static <E> java.util.Collection<E> filter(java.util.Collection<E> r1, com.google.common.base.Predicate<? super E> r2) {
            boolean r0 = r1 instanceof com.google.common.collect.Collections2.FilteredCollection
            if (r0 == 0) goto Lb
            com.google.common.collect.Collections2$FilteredCollection r1 = (com.google.common.collect.Collections2.FilteredCollection) r1
            com.google.common.collect.Collections2$FilteredCollection r1 = r1.createCombined(r2)
            return r1
        Lb:
            com.google.common.collect.Collections2$FilteredCollection r0 = new com.google.common.collect.Collections2$FilteredCollection
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Predicate r2 = (com.google.common.base.Predicate) r2
            r0.<init>(r1, r2)
            return r0
    }

    private static boolean isPermutation(java.util.List<?> r5, java.util.List<?> r6) {
            int r0 = r5.size()
            int r1 = r6.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            com.google.common.collect.ObjectCountHashMap r0 = counts(r5)
            com.google.common.collect.ObjectCountHashMap r1 = counts(r6)
            int r3 = r5.size()
            int r6 = r6.size()
            if (r3 == r6) goto L1f
            return r2
        L1f:
            r6 = 0
        L20:
            int r3 = r5.size()
            if (r6 >= r3) goto L38
            int r3 = r0.getValue(r6)
            java.lang.Object r4 = r0.getKey(r6)
            int r4 = r1.get(r4)
            if (r3 == r4) goto L35
            return r2
        L35:
            int r6 = r6 + 1
            goto L20
        L38:
            r5 = 1
            return r5
    }

    static java.lang.StringBuilder newStringBuilderForCollection(int r5) {
            java.lang.String r0 = "size"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r5, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            long r1 = (long) r5
            r3 = 8
            long r1 = r1 * r3
            r3 = 1073741824(0x40000000, double:5.304989477E-315)
            long r1 = java.lang.Math.min(r1, r3)
            int r5 = (int) r1
            r0.<init>(r5)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <E extends java.lang.Comparable<? super E>> java.util.Collection<java.util.List<E>> orderedPermutations(java.lang.Iterable<E> r1) {
            com.google.common.collect.Ordering r0 = com.google.common.collect.Ordering.natural()
            java.util.Collection r1 = orderedPermutations(r1, r0)
            return r1
    }

    @com.google.common.annotations.Beta
    public static <E> java.util.Collection<java.util.List<E>> orderedPermutations(java.lang.Iterable<E> r1, java.util.Comparator<? super E> r2) {
            com.google.common.collect.Collections2$OrderedPermutationCollection r0 = new com.google.common.collect.Collections2$OrderedPermutationCollection
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <E> java.util.Collection<java.util.List<E>> permutations(java.util.Collection<E> r1) {
            com.google.common.collect.Collections2$PermutationCollection r0 = new com.google.common.collect.Collections2$PermutationCollection
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)
            r0.<init>(r1)
            return r0
    }

    static boolean safeContains(java.util.Collection<?> r0, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            com.google.common.base.Preconditions.checkNotNull(r0)
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r0 = 0
            return r0
    }

    static boolean safeRemove(java.util.Collection<?> r0, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r1) {
            com.google.common.base.Preconditions.checkNotNull(r0)
            boolean r0 = r0.remove(r1)     // Catch: java.lang.Throwable -> L8
            return r0
        L8:
            r0 = 0
            return r0
    }

    static java.lang.String toStringImpl(java.util.Collection<?> r4) {
            int r0 = r4.size()
            java.lang.StringBuilder r0 = newStringBuilderForCollection(r0)
            r1 = 91
            r0.append(r1)
            java.util.Iterator r1 = r4.iterator()
            r2 = 1
        L12:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L30
            java.lang.Object r3 = r1.next()
            if (r2 != 0) goto L23
            java.lang.String r2 = ", "
            r0.append(r2)
        L23:
            if (r3 != r4) goto L2b
            java.lang.String r2 = "(this Collection)"
            r0.append(r2)
            goto L2e
        L2b:
            r0.append(r3)
        L2e:
            r2 = 0
            goto L12
        L30:
            r4 = 93
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public static <F, T> java.util.Collection<T> transform(java.util.Collection<F> r1, com.google.common.base.Function<? super F, T> r2) {
            com.google.common.collect.Collections2$TransformedCollection r0 = new com.google.common.collect.Collections2$TransformedCollection
            r0.<init>(r1, r2)
            return r0
    }
}

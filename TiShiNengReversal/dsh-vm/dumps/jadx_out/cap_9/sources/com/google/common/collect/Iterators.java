package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Iterators {












    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ArrayItr<T> extends com.google.common.collect.AbstractIndexedListIterator<T> {
        static final com.google.common.collect.UnmodifiableListIterator<java.lang.Object> EMPTY = null;
        private final T[] array;
        private final int offset;

        static {
                com.google.common.collect.Iterators$ArrayItr r0 = new com.google.common.collect.Iterators$ArrayItr
                r1 = 0
                java.lang.Object[] r2 = new java.lang.Object[r1]
                r0.<init>(r2, r1, r1, r1)
                com.google.common.collect.Iterators.ArrayItr.EMPTY = r0
                return
        }

        ArrayItr(T[] r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>(r3, r4)
                r0.array = r1
                r0.offset = r2
                return
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected T get(int r3) {
                r2 = this;
                T[] r0 = r2.array
                int r1 = r2.offset
                int r1 = r1 + r3
                r3 = r0[r1]
                return r3
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ConcatenatedIterator<T> implements java.util.Iterator<T> {
        private java.util.Iterator<? extends T> iterator;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private java.util.Deque<java.util.Iterator<? extends java.util.Iterator<? extends T>>> metaIterators;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private java.util.Iterator<? extends T> toRemove;
        private java.util.Iterator<? extends java.util.Iterator<? extends T>> topMetaIterator;

        ConcatenatedIterator(java.util.Iterator<? extends java.util.Iterator<? extends T>> r2) {
                r1 = this;
                r1.<init>()
                com.google.common.collect.UnmodifiableIterator r0 = com.google.common.collect.Iterators.emptyIterator()
                r1.iterator = r0
                java.lang.Object r2 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.util.Iterator r2 = (java.util.Iterator) r2
                r1.topMetaIterator = r2
                return
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private java.util.Iterator<? extends java.util.Iterator<? extends T>> getTopMetaIterator() {
                r1 = this;
            L0:
                java.util.Iterator<? extends java.util.Iterator<? extends T>> r0 = r1.topMetaIterator
                if (r0 == 0) goto Le
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto Lb
                goto Le
            Lb:
                java.util.Iterator<? extends java.util.Iterator<? extends T>> r0 = r1.topMetaIterator
                return r0
            Le:
                java.util.Deque<java.util.Iterator<? extends java.util.Iterator<? extends T>>> r0 = r1.metaIterators
                if (r0 == 0) goto L23
                boolean r0 = r0.isEmpty()
                if (r0 != 0) goto L23
                java.util.Deque<java.util.Iterator<? extends java.util.Iterator<? extends T>>> r0 = r1.metaIterators
                java.lang.Object r0 = r0.removeFirst()
                java.util.Iterator r0 = (java.util.Iterator) r0
                r1.topMetaIterator = r0
                goto L0
            L23:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
            L0:
                java.util.Iterator<? extends T> r0 = r3.iterator
                java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
                java.util.Iterator r0 = (java.util.Iterator) r0
                boolean r0 = r0.hasNext()
                if (r0 != 0) goto L59
                java.util.Iterator r0 = r3.getTopMetaIterator()
                r3.topMetaIterator = r0
                if (r0 != 0) goto L18
                r0 = 0
                return r0
            L18:
                java.lang.Object r0 = r0.next()
                java.util.Iterator r0 = (java.util.Iterator) r0
                r3.iterator = r0
                boolean r1 = r0 instanceof com.google.common.collect.Iterators.ConcatenatedIterator
                if (r1 == 0) goto L0
                com.google.common.collect.Iterators$ConcatenatedIterator r0 = (com.google.common.collect.Iterators.ConcatenatedIterator) r0
                java.util.Iterator<? extends T> r1 = r0.iterator
                r3.iterator = r1
                java.util.Deque<java.util.Iterator<? extends java.util.Iterator<? extends T>>> r1 = r3.metaIterators
                if (r1 != 0) goto L35
                java.util.ArrayDeque r1 = new java.util.ArrayDeque
                r1.<init>()
                r3.metaIterators = r1
            L35:
                java.util.Deque<java.util.Iterator<? extends java.util.Iterator<? extends T>>> r1 = r3.metaIterators
                java.util.Iterator<? extends java.util.Iterator<? extends T>> r2 = r3.topMetaIterator
                r1.addFirst(r2)
                java.util.Deque<java.util.Iterator<? extends java.util.Iterator<? extends T>>> r1 = r0.metaIterators
                if (r1 == 0) goto L54
            L40:
                java.util.Deque<java.util.Iterator<? extends java.util.Iterator<? extends T>>> r1 = r0.metaIterators
                boolean r1 = r1.isEmpty()
                if (r1 != 0) goto L54
                java.util.Deque<java.util.Iterator<? extends java.util.Iterator<? extends T>>> r1 = r3.metaIterators
                java.util.Deque<java.util.Iterator<? extends java.util.Iterator<? extends T>>> r2 = r0.metaIterators
                java.lang.Object r2 = r2.removeLast()
                r1.addFirst(r2)
                goto L40
            L54:
                java.util.Iterator<? extends java.util.Iterator<? extends T>> r0 = r0.topMetaIterator
                r3.topMetaIterator = r0
                goto L0
            L59:
                r0 = 1
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto Lf
                java.util.Iterator<? extends T> r0 = r1.iterator
                r1.toRemove = r0
                java.lang.Object r0 = r0.next()
                return r0
            Lf:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.util.Iterator<? extends T> r0 = r1.toRemove
                if (r0 == 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                com.google.common.collect.CollectPreconditions.checkRemove(r0)
                java.util.Iterator<? extends T> r0 = r1.toRemove
                r0.remove()
                r0 = 0
                r1.toRemove = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum EmptyModifiableIterator extends java.lang.Enum<com.google.common.collect.Iterators.EmptyModifiableIterator> implements java.util.Iterator<java.lang.Object> {
        private static final /* synthetic */ com.google.common.collect.Iterators.EmptyModifiableIterator[] $VALUES = null;
        public static final com.google.common.collect.Iterators.EmptyModifiableIterator INSTANCE = null;

        static {
                com.google.common.collect.Iterators$EmptyModifiableIterator r0 = new com.google.common.collect.Iterators$EmptyModifiableIterator
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.collect.Iterators.EmptyModifiableIterator.INSTANCE = r0
                r1 = 1
                com.google.common.collect.Iterators$EmptyModifiableIterator[] r1 = new com.google.common.collect.Iterators.EmptyModifiableIterator[r1]
                r1[r2] = r0
                com.google.common.collect.Iterators.EmptyModifiableIterator.$VALUES = r1
                return
        }

        EmptyModifiableIterator(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.collect.Iterators.EmptyModifiableIterator valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.collect.Iterators$EmptyModifiableIterator> r0 = com.google.common.collect.Iterators.EmptyModifiableIterator.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.collect.Iterators$EmptyModifiableIterator r1 = (com.google.common.collect.Iterators.EmptyModifiableIterator) r1
                return r1
        }

        public static com.google.common.collect.Iterators.EmptyModifiableIterator[] values() {
                com.google.common.collect.Iterators$EmptyModifiableIterator[] r0 = com.google.common.collect.Iterators.EmptyModifiableIterator.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.collect.Iterators$EmptyModifiableIterator[] r0 = (com.google.common.collect.Iterators.EmptyModifiableIterator[]) r0
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public java.lang.Object next() {
                r1 = this;
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                r0 = 0
                com.google.common.collect.CollectPreconditions.checkRemove(r0)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class MergingIterator<T> extends com.google.common.collect.UnmodifiableIterator<T> {
        final java.util.Queue<com.google.common.collect.PeekingIterator<T>> queue;


        public MergingIterator(java.lang.Iterable<? extends java.util.Iterator<? extends T>> r3, java.util.Comparator<? super T> r4) {
                r2 = this;
                r2.<init>()
                com.google.common.collect.Iterators$MergingIterator$1 r0 = new com.google.common.collect.Iterators$MergingIterator$1
                r0.<init>(r2, r4)
                java.util.PriorityQueue r4 = new java.util.PriorityQueue
                r1 = 2
                r4.<init>(r1, r0)
                r2.queue = r4
                java.util.Iterator r3 = r3.iterator()
            L14:
                boolean r4 = r3.hasNext()
                if (r4 == 0) goto L30
                java.lang.Object r4 = r3.next()
                java.util.Iterator r4 = (java.util.Iterator) r4
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L14
                java.util.Queue<com.google.common.collect.PeekingIterator<T>> r0 = r2.queue
                com.google.common.collect.PeekingIterator r4 = com.google.common.collect.Iterators.peekingIterator(r4)
                r0.add(r4)
                goto L14
            L30:
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Queue<com.google.common.collect.PeekingIterator<T>> r0 = r1.queue
                boolean r0 = r0.isEmpty()
                r0 = r0 ^ 1
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                java.util.Queue<com.google.common.collect.PeekingIterator<T>> r0 = r3.queue
                java.lang.Object r0 = r0.remove()
                com.google.common.collect.PeekingIterator r0 = (com.google.common.collect.PeekingIterator) r0
                java.lang.Object r1 = r0.next()
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L17
                java.util.Queue<com.google.common.collect.PeekingIterator<T>> r2 = r3.queue
                r2.add(r0)
            L17:
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class PeekingImpl<E> implements com.google.common.collect.PeekingIterator<E> {
        private boolean hasPeeked;
        private final java.util.Iterator<? extends E> iterator;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private E peekedElement;

        public PeekingImpl(java.util.Iterator<? extends E> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.Iterator r1 = (java.util.Iterator) r1
                r0.iterator = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                boolean r0 = r1.hasPeeked
                if (r0 != 0) goto Lf
                java.util.Iterator<? extends E> r0 = r1.iterator
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                return r0
            Lf:
                r0 = 1
                return r0
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public E next() {
                r2 = this;
                boolean r0 = r2.hasPeeked
                if (r0 != 0) goto Lb
                java.util.Iterator<? extends E> r0 = r2.iterator
                java.lang.Object r0 = r0.next()
                return r0
            Lb:
                E r0 = r2.peekedElement
                r1 = 0
                r2.hasPeeked = r1
                r1 = 0
                r2.peekedElement = r1
                return r0
        }

        @Override // com.google.common.collect.PeekingIterator
        public E peek() {
                r1 = this;
                boolean r0 = r1.hasPeeked
                if (r0 != 0) goto Lf
                java.util.Iterator<? extends E> r0 = r1.iterator
                java.lang.Object r0 = r0.next()
                r1.peekedElement = r0
                r0 = 1
                r1.hasPeeked = r0
            Lf:
                E r0 = r1.peekedElement
                return r0
        }

        @Override // com.google.common.collect.PeekingIterator, java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.hasPeeked
                r0 = r0 ^ 1
                java.lang.String r1 = "Can't remove after you've peeked at next"
                com.google.common.base.Preconditions.checkState(r0, r1)
                java.util.Iterator<? extends E> r0 = r2.iterator
                r0.remove()
                return
        }
    }

    private Iterators() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <T> boolean addAll(java.util.Collection<T> r2, java.util.Iterator<? extends T> r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
            r0 = 0
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            r0 = r0 | r1
            goto L7
        L17:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static int advance(java.util.Iterator<?> r3, int r4) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            r0 = 0
            if (r4 < 0) goto L8
            r1 = 1
            goto L9
        L8:
            r1 = 0
        L9:
            java.lang.String r2 = "numberToAdvance must be nonnegative"
            com.google.common.base.Preconditions.checkArgument(r1, r2)
        Le:
            if (r0 >= r4) goto L1c
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L1c
            r3.next()
            int r0 = r0 + 1
            goto Le
        L1c:
            return r0
    }

    public static <T> boolean all(java.util.Iterator<T> r1, com.google.common.base.Predicate<? super T> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
        L3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L15
            java.lang.Object r0 = r1.next()
            boolean r0 = r2.apply(r0)
            if (r0 != 0) goto L3
            r1 = 0
            return r1
        L15:
            r1 = 1
            return r1
    }

    public static <T> boolean any(java.util.Iterator<T> r0, com.google.common.base.Predicate<? super T> r1) {
            int r0 = indexOf(r0, r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    public static <T> java.util.Enumeration<T> asEnumeration(java.util.Iterator<T> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Iterators$11 r0 = new com.google.common.collect.Iterators$11
            r0.<init>(r1)
            return r0
    }

    static <T> java.util.ListIterator<T> cast(java.util.Iterator<T> r0) {
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            return r0
    }

    static void checkNonnegative(int r3) {
            if (r3 < 0) goto L3
            return
        L3:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "position ("
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = ") must not be negative"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static void clear(java.util.Iterator<?> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
        L3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L10
            r1.next()
            r1.remove()
            goto L3
        L10:
            return
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends java.util.Iterator<? extends T>> r1) {
            com.google.common.collect.Iterators$ConcatenatedIterator r0 = new com.google.common.collect.Iterators$ConcatenatedIterator
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> r2, java.util.Iterator<? extends T> r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
            r0 = 2
            java.util.Iterator[] r0 = new java.util.Iterator[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            java.util.Iterator r2 = consumingForArray(r0)
            java.util.Iterator r2 = concat(r2)
            return r2
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> r2, java.util.Iterator<? extends T> r3, java.util.Iterator<? extends T> r4) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r4)
            r0 = 3
            java.util.Iterator[] r0 = new java.util.Iterator[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            java.util.Iterator r2 = consumingForArray(r0)
            java.util.Iterator r2 = concat(r2)
            return r2
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T> r2, java.util.Iterator<? extends T> r3, java.util.Iterator<? extends T> r4, java.util.Iterator<? extends T> r5) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
            com.google.common.base.Preconditions.checkNotNull(r4)
            com.google.common.base.Preconditions.checkNotNull(r5)
            r0 = 4
            java.util.Iterator[] r0 = new java.util.Iterator[r0]
            r1 = 0
            r0[r1] = r2
            r2 = 1
            r0[r2] = r3
            r2 = 2
            r0[r2] = r4
            r2 = 3
            r0[r2] = r5
            java.util.Iterator r2 = consumingForArray(r0)
            java.util.Iterator r2 = concat(r2)
            return r2
    }

    public static <T> java.util.Iterator<T> concat(java.util.Iterator<? extends T>... r1) {
            int r0 = r1.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r0)
            java.util.Iterator[] r1 = (java.util.Iterator[]) r1
            java.util.Iterator r1 = concatNoDefensiveCopy(r1)
            return r1
    }

    static <T> java.util.Iterator<T> concatNoDefensiveCopy(java.util.Iterator<? extends T>... r4) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r4)
            java.util.Iterator[] r0 = (java.util.Iterator[]) r0
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            com.google.common.base.Preconditions.checkNotNull(r3)
            int r2 = r2 + 1
            goto L8
        L12:
            java.util.Iterator r4 = consumingForArray(r4)
            java.util.Iterator r4 = concat(r4)
            return r4
    }

    private static <T> java.util.Iterator<T> consumingForArray(T... r1) {
            com.google.common.collect.Iterators$3 r0 = new com.google.common.collect.Iterators$3
            r0.<init>(r1)
            return r0
    }

    public static <T> java.util.Iterator<T> consumingIterator(java.util.Iterator<T> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Iterators$8 r0 = new com.google.common.collect.Iterators$8
            r0.<init>(r1)
            return r0
    }

    public static boolean contains(java.util.Iterator<?> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r0 = 1
            if (r3 != 0) goto L10
        L3:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L21
            java.lang.Object r3 = r2.next()
            if (r3 != 0) goto L3
            return r0
        L10:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L21
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L10
            return r0
        L21:
            r2 = 0
            return r2
    }

    public static <T> java.util.Iterator<T> cycle(java.lang.Iterable<T> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Iterators$2 r0 = new com.google.common.collect.Iterators$2
            r0.<init>(r1)
            return r0
    }

    @java.lang.SafeVarargs
    public static <T> java.util.Iterator<T> cycle(T... r0) {
            java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList(r0)
            java.util.Iterator r0 = cycle(r0)
            return r0
    }

    public static boolean elementsEqual(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.google.common.base.Objects.equal(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
    }

    static <T> com.google.common.collect.UnmodifiableIterator<T> emptyIterator() {
            com.google.common.collect.UnmodifiableListIterator r0 = emptyListIterator()
            return r0
    }

    static <T> com.google.common.collect.UnmodifiableListIterator<T> emptyListIterator() {
            com.google.common.collect.UnmodifiableListIterator<java.lang.Object> r0 = com.google.common.collect.Iterators.ArrayItr.EMPTY
            return r0
    }

    static <T> java.util.Iterator<T> emptyModifiableIterator() {
            com.google.common.collect.Iterators$EmptyModifiableIterator r0 = com.google.common.collect.Iterators.EmptyModifiableIterator.INSTANCE
            return r0
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> filter(java.util.Iterator<T> r1, com.google.common.base.Predicate<? super T> r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.Iterators$5 r0 = new com.google.common.collect.Iterators$5
            r0.<init>(r1, r2)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <T> com.google.common.collect.UnmodifiableIterator<T> filter(java.util.Iterator<?> r0, java.lang.Class<T> r1) {
            com.google.common.base.Predicate r1 = com.google.common.base.Predicates.instanceOf(r1)
            com.google.common.collect.UnmodifiableIterator r0 = filter(r0, r1)
            return r0
    }

    public static <T> T find(java.util.Iterator<T> r2, com.google.common.base.Predicate<? super T> r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.next()
            boolean r1 = r3.apply(r0)
            if (r1 == 0) goto L6
            return r0
        L17:
            java.util.NoSuchElementException r2 = new java.util.NoSuchElementException
            r2.<init>()
            throw r2
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public static <T> T find(java.util.Iterator<? extends T> r2, com.google.common.base.Predicate<? super T> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r4) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L17
            java.lang.Object r0 = r2.next()
            boolean r1 = r3.apply(r0)
            if (r1 == 0) goto L6
            return r0
        L17:
            return r4
    }

    @java.lang.SafeVarargs
    public static <T> com.google.common.collect.UnmodifiableIterator<T> forArray(T... r2) {
            r0 = 0
            int r1 = r2.length
            com.google.common.collect.UnmodifiableListIterator r2 = forArray(r2, r0, r1, r0)
            return r2
    }

    static <T> com.google.common.collect.UnmodifiableListIterator<T> forArray(T[] r2, int r3, int r4, int r5) {
            if (r4 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            com.google.common.base.Preconditions.checkArgument(r0)
            int r0 = r3 + r4
            int r1 = r2.length
            com.google.common.base.Preconditions.checkPositionIndexes(r3, r0, r1)
            com.google.common.base.Preconditions.checkPositionIndex(r5, r4)
            if (r4 != 0) goto L18
            com.google.common.collect.UnmodifiableListIterator r2 = emptyListIterator()
            return r2
        L18:
            com.google.common.collect.Iterators$ArrayItr r0 = new com.google.common.collect.Iterators$ArrayItr
            r0.<init>(r2, r3, r4, r5)
            return r0
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> forEnumeration(java.util.Enumeration<T> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            com.google.common.collect.Iterators$10 r0 = new com.google.common.collect.Iterators$10
            r0.<init>(r1)
            return r0
    }

    public static int frequency(java.util.Iterator<?> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            r0 = 0
        L1:
            boolean r1 = contains(r2, r3)
            if (r1 == 0) goto La
            int r0 = r0 + 1
            goto L1
        La:
            return r0
    }

    public static <T> T get(java.util.Iterator<T> r3, int r4) {
            checkNonnegative(r4)
            int r0 = advance(r3, r4)
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L12
            java.lang.Object r3 = r3.next()
            return r3
        L12:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "position ("
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ") must be less than the number of elements that remained ("
            r1.append(r4)
            r1.append(r0)
            java.lang.String r4 = ")"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            throw r3
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public static <T> T get(java.util.Iterator<? extends T> r0, int r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2) {
            checkNonnegative(r1)
            advance(r0, r1)
            java.lang.Object r0 = getNext(r0, r2)
            return r0
    }

    public static <T> T getLast(java.util.Iterator<T> r2) {
        L0:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L0
            return r0
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public static <T> T getLast(java.util.Iterator<? extends T> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2) {
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = getLast(r1)
            return r1
        Lb:
            return r2
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public static <T> T getNext(java.util.Iterator<? extends T> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2) {
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r1.next()
            return r1
        Lb:
            return r2
    }

    public static <T> T getOnlyElement(java.util.Iterator<T> r3) {
            java.lang.Object r0 = r3.next()
            boolean r1 = r3.hasNext()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "expected one element but was: <"
            r1.append(r2)
            r1.append(r0)
            r0 = 0
        L19:
            r2 = 4
            if (r0 >= r2) goto L31
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L31
            java.lang.String r2 = ", "
            r1.append(r2)
            java.lang.Object r2 = r3.next()
            r1.append(r2)
            int r0 = r0 + 1
            goto L19
        L31:
            boolean r3 = r3.hasNext()
            if (r3 == 0) goto L3c
            java.lang.String r3 = ", ..."
            r1.append(r3)
        L3c:
            r3 = 62
            r1.append(r3)
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.toString()
            r3.<init>(r0)
            throw r3
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public static <T> T getOnlyElement(java.util.Iterator<? extends T> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r2) {
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = getOnlyElement(r1)
            return r1
        Lb:
            return r2
    }

    public static <T> int indexOf(java.util.Iterator<T> r2, com.google.common.base.Predicate<? super T> r3) {
            java.lang.String r0 = "predicate"
            com.google.common.base.Preconditions.checkNotNull(r3, r0)
            r0 = 0
        L6:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.apply(r1)
            if (r1 == 0) goto L17
            return r0
        L17:
            int r0 = r0 + 1
            goto L6
        L1a:
            r2 = -1
            return r2
    }

    public static <T> java.util.Iterator<T> limit(java.util.Iterator<T> r2, int r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            if (r3 < 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            java.lang.String r1 = "limit is negative"
            com.google.common.base.Preconditions.checkArgument(r0, r1)
            com.google.common.collect.Iterators$7 r0 = new com.google.common.collect.Iterators$7
            r0.<init>(r3, r2)
            return r0
    }

    @com.google.common.annotations.Beta
    public static <T> com.google.common.collect.UnmodifiableIterator<T> mergeSorted(java.lang.Iterable<? extends java.util.Iterator<? extends T>> r1, java.util.Comparator<? super T> r2) {
            java.lang.String r0 = "iterators"
            com.google.common.base.Preconditions.checkNotNull(r1, r0)
            java.lang.String r0 = "comparator"
            com.google.common.base.Preconditions.checkNotNull(r2, r0)
            com.google.common.collect.Iterators$MergingIterator r0 = new com.google.common.collect.Iterators$MergingIterator
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> paddedPartition(java.util.Iterator<T> r1, int r2) {
            r0 = 1
            com.google.common.collect.UnmodifiableIterator r1 = partitionImpl(r1, r2, r0)
            return r1
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> partition(java.util.Iterator<T> r1, int r2) {
            r0 = 0
            com.google.common.collect.UnmodifiableIterator r1 = partitionImpl(r1, r2, r0)
            return r1
    }

    private static <T> com.google.common.collect.UnmodifiableIterator<java.util.List<T>> partitionImpl(java.util.Iterator<T> r1, int r2, boolean r3) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            if (r2 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            com.google.common.collect.Iterators$4 r0 = new com.google.common.collect.Iterators$4
            r0.<init>(r1, r2, r3)
            return r0
    }

    @java.lang.Deprecated
    public static <T> com.google.common.collect.PeekingIterator<T> peekingIterator(com.google.common.collect.PeekingIterator<T> r0) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            com.google.common.collect.PeekingIterator r0 = (com.google.common.collect.PeekingIterator) r0
            return r0
    }

    public static <T> com.google.common.collect.PeekingIterator<T> peekingIterator(java.util.Iterator<? extends T> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.Iterators.PeekingImpl
            if (r0 == 0) goto L7
            com.google.common.collect.Iterators$PeekingImpl r1 = (com.google.common.collect.Iterators.PeekingImpl) r1
            return r1
        L7:
            com.google.common.collect.Iterators$PeekingImpl r0 = new com.google.common.collect.Iterators$PeekingImpl
            r0.<init>(r1)
            return r0
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    static <T> T pollNext(java.util.Iterator<T> r1) {
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Le
            java.lang.Object r0 = r1.next()
            r1.remove()
            return r0
        Le:
            r1 = 0
            return r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static boolean removeAll(java.util.Iterator<?> r2, java.util.Collection<?> r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            r0 = 0
        L4:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.contains(r1)
            if (r1 == 0) goto L4
            r2.remove()
            r0 = 1
            goto L4
        L19:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static <T> boolean removeIf(java.util.Iterator<T> r2, com.google.common.base.Predicate<? super T> r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            r0 = 0
        L4:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.apply(r1)
            if (r1 == 0) goto L4
            r2.remove()
            r0 = 1
            goto L4
        L19:
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public static boolean retainAll(java.util.Iterator<?> r2, java.util.Collection<?> r3) {
            com.google.common.base.Preconditions.checkNotNull(r3)
            r0 = 0
        L4:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.contains(r1)
            if (r1 != 0) goto L4
            r2.remove()
            r0 = 1
            goto L4
        L19:
            return r0
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> singletonIterator(@org.checkerframework.checker.nullness.compatqual.NullableDecl T r1) {
            com.google.common.collect.Iterators$9 r0 = new com.google.common.collect.Iterators$9
            r0.<init>(r1)
            return r0
    }

    public static int size(java.util.Iterator<?> r4) {
            r0 = 0
        L2:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto Lf
            r4.next()
            r2 = 1
            long r0 = r0 + r2
            goto L2
        Lf:
            int r4 = com.google.common.primitives.Ints.saturatedCast(r0)
            return r4
    }

    @com.google.common.annotations.GwtIncompatible
    public static <T> T[] toArray(java.util.Iterator<? extends T> r0, java.lang.Class<T> r1) {
            java.util.ArrayList r0 = com.google.common.collect.Lists.newArrayList(r0)
            java.lang.Object[] r0 = com.google.common.collect.Iterables.toArray(r0, r1)
            return r0
    }

    public static java.lang.String toString(java.util.Iterator<?> r3) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 91
            r0.append(r1)
            r1 = 1
        Lb:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L21
            if (r1 != 0) goto L18
            java.lang.String r1 = ", "
            r0.append(r1)
        L18:
            java.lang.Object r1 = r3.next()
            r0.append(r1)
            r1 = 0
            goto Lb
        L21:
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    public static <F, T> java.util.Iterator<T> transform(java.util.Iterator<F> r1, com.google.common.base.Function<? super F, ? extends T> r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.collect.Iterators$6 r0 = new com.google.common.collect.Iterators$6
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.google.common.base.Optional<T> tryFind(java.util.Iterator<T> r2, com.google.common.base.Predicate<? super T> r3) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            com.google.common.base.Preconditions.checkNotNull(r3)
        L6:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L1b
            java.lang.Object r0 = r2.next()
            boolean r1 = r3.apply(r0)
            if (r1 == 0) goto L6
            com.google.common.base.Optional r2 = com.google.common.base.Optional.of(r0)
            return r2
        L1b:
            com.google.common.base.Optional r2 = com.google.common.base.Optional.absent()
            return r2
    }

    @java.lang.Deprecated
    public static <T> com.google.common.collect.UnmodifiableIterator<T> unmodifiableIterator(com.google.common.collect.UnmodifiableIterator<T> r0) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r0)
            com.google.common.collect.UnmodifiableIterator r0 = (com.google.common.collect.UnmodifiableIterator) r0
            return r0
    }

    public static <T> com.google.common.collect.UnmodifiableIterator<T> unmodifiableIterator(java.util.Iterator<? extends T> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            boolean r0 = r1 instanceof com.google.common.collect.UnmodifiableIterator
            if (r0 == 0) goto La
            com.google.common.collect.UnmodifiableIterator r1 = (com.google.common.collect.UnmodifiableIterator) r1
            return r1
        La:
            com.google.common.collect.Iterators$1 r0 = new com.google.common.collect.Iterators$1
            r0.<init>(r1)
            return r0
    }
}

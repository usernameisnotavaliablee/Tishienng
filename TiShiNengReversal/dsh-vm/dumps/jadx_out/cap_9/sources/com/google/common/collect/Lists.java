package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Lists {



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class AbstractListWrapper<E> extends java.util.AbstractList<E> {
        final java.util.List<E> backingList;

        AbstractListWrapper(java.util.List<E> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.List r1 = (java.util.List) r1
                r0.backingList = r1
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int r2, E r3) {
                r1 = this;
                java.util.List<E> r0 = r1.backingList
                r0.add(r2, r3)
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public boolean addAll(int r2, java.util.Collection<? extends E> r3) {
                r1 = this;
                java.util.List<E> r0 = r1.backingList
                boolean r2 = r0.addAll(r2, r3)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                java.util.List<E> r0 = r1.backingList
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int r2) {
                r1 = this;
                java.util.List<E> r0 = r1.backingList
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public E remove(int r2) {
                r1 = this;
                java.util.List<E> r0 = r1.backingList
                java.lang.Object r2 = r0.remove(r2)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public E set(int r2, E r3) {
                r1 = this;
                java.util.List<E> r0 = r1.backingList
                java.lang.Object r2 = r0.set(r2, r3)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<E> r0 = r1.backingList
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class CharSequenceAsList extends java.util.AbstractList<java.lang.Character> {
        private final java.lang.CharSequence sequence;

        CharSequenceAsList(java.lang.CharSequence r1) {
                r0 = this;
                r0.<init>()
                r0.sequence = r1
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public java.lang.Character get(int r2) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkElementIndex(r2, r0)
                java.lang.CharSequence r0 = r1.sequence
                char r2 = r0.charAt(r2)
                java.lang.Character r2 = java.lang.Character.valueOf(r2)
                return r2
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Character r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.lang.CharSequence r0 = r1.sequence
                int r0 = r0.length()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class OnePlusArrayList<E> extends java.util.AbstractList<E> implements java.io.Serializable, java.util.RandomAccess {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final E first;
        final E[] rest;

        OnePlusArrayList(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r1, E[] r2) {
                r0 = this;
                r0.<init>()
                r0.first = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                r0.rest = r1
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int r2) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkElementIndex(r2, r0)
                if (r2 != 0) goto Lc
                E r2 = r1.first
                return r2
            Lc:
                E[] r0 = r1.rest
                int r2 = r2 + (-1)
                r2 = r0[r2]
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r2 = this;
                E[] r0 = r2.rest
                int r0 = r0.length
                r1 = 1
                int r0 = com.google.common.math.IntMath.saturatedAdd(r0, r1)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class Partition<T> extends java.util.AbstractList<java.util.List<T>> {
        final java.util.List<T> list;
        final int size;

        Partition(java.util.List<T> r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.list = r1
                r0.size = r2
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.util.List r1 = r0.get(r1)
                return r1
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<T> get(int r3) {
                r2 = this;
                int r0 = r2.size()
                com.google.common.base.Preconditions.checkElementIndex(r3, r0)
                int r0 = r2.size
                int r3 = r3 * r0
                int r0 = r0 + r3
                java.util.List<T> r1 = r2.list
                int r1 = r1.size()
                int r0 = java.lang.Math.min(r0, r1)
                java.util.List<T> r1 = r2.list
                java.util.List r3 = r1.subList(r3, r0)
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
                r1 = this;
                java.util.List<T> r0 = r1.list
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r3 = this;
                java.util.List<T> r0 = r3.list
                int r0 = r0.size()
                int r1 = r3.size
                java.math.RoundingMode r2 = java.math.RoundingMode.CEILING
                int r0 = com.google.common.math.IntMath.divide(r0, r1, r2)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class RandomAccessListWrapper<E> extends com.google.common.collect.Lists.AbstractListWrapper<E> implements java.util.RandomAccess {
        RandomAccessListWrapper(java.util.List<E> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class RandomAccessPartition<T> extends com.google.common.collect.Lists.Partition<T> implements java.util.RandomAccess {
        RandomAccessPartition(java.util.List<T> r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class RandomAccessReverseList<T> extends com.google.common.collect.Lists.ReverseList<T> implements java.util.RandomAccess {
        RandomAccessReverseList(java.util.List<T> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ReverseList<T> extends java.util.AbstractList<T> {
        private final java.util.List<T> forwardList;


        ReverseList(java.util.List<T> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.List r1 = (java.util.List) r1
                r0.forwardList = r1
                return
        }

        static /* synthetic */ int access$000(com.google.common.collect.Lists.ReverseList r0, int r1) {
                int r0 = r0.reversePosition(r1)
                return r0
        }

        private int reverseIndex(int r2) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkElementIndex(r2, r0)
                int r0 = r0 + (-1)
                int r0 = r0 - r2
                return r0
        }

        private int reversePosition(int r2) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkPositionIndex(r2, r0)
                int r0 = r0 - r2
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public void add(int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r3) {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                int r2 = r1.reversePosition(r2)
                r0.add(r2, r3)
                return
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                r0.clear()
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int r2) {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                int r2 = r1.reverseIndex(r2)
                java.lang.Object r2 = r0.get(r2)
                return r2
        }

        java.util.List<T> getForwardList() {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                return r0
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<T> iterator() {
                r1 = this;
                java.util.ListIterator r0 = r1.listIterator()
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<T> listIterator(int r2) {
                r1 = this;
                int r2 = r1.reversePosition(r2)
                java.util.List<T> r0 = r1.forwardList
                java.util.ListIterator r2 = r0.listIterator(r2)
                com.google.common.collect.Lists$ReverseList$1 r0 = new com.google.common.collect.Lists$ReverseList$1
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int r2) {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                int r2 = r1.reverseIndex(r2)
                java.lang.Object r2 = r0.remove(r2)
                return r2
        }

        @Override // java.util.AbstractList
        protected void removeRange(int r1, int r2) {
                r0 = this;
                java.util.List r1 = r0.subList(r1, r2)
                r1.clear()
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public T set(int r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl T r3) {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                int r2 = r1.reverseIndex(r2)
                java.lang.Object r2 = r0.set(r2, r3)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<T> r0 = r1.forwardList
                int r0 = r0.size()
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.List<T> subList(int r2, int r3) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r0)
                java.util.List<T> r0 = r1.forwardList
                int r3 = r1.reversePosition(r3)
                int r2 = r1.reversePosition(r2)
                java.util.List r2 = r0.subList(r3, r2)
                java.util.List r2 = com.google.common.collect.Lists.reverse(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class StringAsImmutableList extends com.google.common.collect.ImmutableList<java.lang.Character> {
        private final java.lang.String string;

        StringAsImmutableList(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.string = r1
                return
        }

        @Override // java.util.List
        public java.lang.Character get(int r2) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkElementIndex(r2, r0)
                java.lang.String r0 = r1.string
                char r2 = r0.charAt(r2)
                java.lang.Character r2 = java.lang.Character.valueOf(r2)
                return r2
        }

        @Override // java.util.List
        public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
                r0 = this;
                java.lang.Character r1 = r0.get(r1)
                return r1
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Character
                if (r0 == 0) goto L11
                java.lang.String r0 = r1.string
                java.lang.Character r2 = (java.lang.Character) r2
                char r2 = r2.charValue()
                int r2 = r0.indexOf(r2)
                return r2
            L11:
                r2 = -1
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.lang.Character
                if (r0 == 0) goto L11
                java.lang.String r0 = r1.string
                java.lang.Character r2 = (java.lang.Character) r2
                char r2 = r2.charValue()
                int r2 = r0.lastIndexOf(r2)
                return r2
            L11:
                r2 = -1
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.lang.String r0 = r1.string
                int r0 = r0.length()
                return r0
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public com.google.common.collect.ImmutableList<java.lang.Character> subList(int r2, int r3) {
                r1 = this;
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkPositionIndexes(r2, r3, r0)
                java.lang.String r0 = r1.string
                java.lang.String r2 = r0.substring(r2, r3)
                com.google.common.collect.ImmutableList r2 = com.google.common.collect.Lists.charactersOf(r2)
                return r2
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ java.util.List subList(int r1, int r2) {
                r0 = this;
                com.google.common.collect.ImmutableList r1 = r0.subList(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class TransformingRandomAccessList<F, T> extends java.util.AbstractList<T> implements java.util.RandomAccess, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.List<F> fromList;
        final com.google.common.base.Function<? super F, ? extends T> function;


        TransformingRandomAccessList(java.util.List<F> r1, com.google.common.base.Function<? super F, ? extends T> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.List r1 = (java.util.List) r1
                r0.fromList = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.function = r1
                return
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
                r1 = this;
                java.util.List<F> r0 = r1.fromList
                r0.clear()
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int r3) {
                r2 = this;
                com.google.common.base.Function<? super F, ? extends T> r0 = r2.function
                java.util.List<F> r1 = r2.fromList
                java.lang.Object r3 = r1.get(r3)
                java.lang.Object r3 = r0.apply(r3)
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
                r1 = this;
                java.util.List<F> r0 = r1.fromList
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<T> iterator() {
                r1 = this;
                java.util.ListIterator r0 = r1.listIterator()
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<T> listIterator(int r3) {
                r2 = this;
                com.google.common.collect.Lists$TransformingRandomAccessList$1 r0 = new com.google.common.collect.Lists$TransformingRandomAccessList$1
                java.util.List<F> r1 = r2.fromList
                java.util.ListIterator r3 = r1.listIterator(r3)
                r0.<init>(r2, r3)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int r3) {
                r2 = this;
                com.google.common.base.Function<? super F, ? extends T> r0 = r2.function
                java.util.List<F> r1 = r2.fromList
                java.lang.Object r3 = r1.remove(r3)
                java.lang.Object r3 = r0.apply(r3)
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<F> r0 = r1.fromList
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class TransformingSequentialList<F, T> extends java.util.AbstractSequentialList<T> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.List<F> fromList;
        final com.google.common.base.Function<? super F, ? extends T> function;


        TransformingSequentialList(java.util.List<F> r1, com.google.common.base.Function<? super F, ? extends T> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
                java.util.List r1 = (java.util.List) r1
                r0.fromList = r1
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r2)
                com.google.common.base.Function r1 = (com.google.common.base.Function) r1
                r0.function = r1
                return
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
                r1 = this;
                java.util.List<F> r0 = r1.fromList
                r0.clear()
                return
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public java.util.ListIterator<T> listIterator(int r3) {
                r2 = this;
                com.google.common.collect.Lists$TransformingSequentialList$1 r0 = new com.google.common.collect.Lists$TransformingSequentialList$1
                java.util.List<F> r1 = r2.fromList
                java.util.ListIterator r3 = r1.listIterator(r3)
                r0.<init>(r2, r3)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<F> r0 = r1.fromList
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class TwoPlusArrayList<E> extends java.util.AbstractList<E> implements java.io.Serializable, java.util.RandomAccess {
        private static final long serialVersionUID = 0;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final E first;
        final E[] rest;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        final E second;

        TwoPlusArrayList(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r2, E[] r3) {
                r0 = this;
                r0.<init>()
                r0.first = r1
                r0.second = r2
                java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r3)
                java.lang.Object[] r1 = (java.lang.Object[]) r1
                r0.rest = r1
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public E get(int r2) {
                r1 = this;
                if (r2 == 0) goto L16
                r0 = 1
                if (r2 == r0) goto L13
                int r0 = r1.size()
                com.google.common.base.Preconditions.checkElementIndex(r2, r0)
                E[] r0 = r1.rest
                int r2 = r2 + (-2)
                r2 = r0[r2]
                return r2
            L13:
                E r2 = r1.second
                return r2
            L16:
                E r2 = r1.first
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r2 = this;
                E[] r0 = r2.rest
                int r0 = r0.length
                r1 = 2
                int r0 = com.google.common.math.IntMath.saturatedAdd(r0, r1)
                return r0
        }
    }

    private Lists() {
            r0 = this;
            r0.<init>()
            return
    }

    static <E> boolean addAllImpl(java.util.List<E> r1, int r2, java.lang.Iterable<? extends E> r3) {
            java.util.ListIterator r1 = r1.listIterator(r2)
            java.util.Iterator r2 = r3.iterator()
            r3 = 0
        L9:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r3 = r2.next()
            r1.add(r3)
            r3 = 1
            goto L9
        L18:
            return r3
    }

    public static <E> java.util.List<E> asList(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl E r2, E[] r3) {
            com.google.common.collect.Lists$TwoPlusArrayList r0 = new com.google.common.collect.Lists$TwoPlusArrayList
            r0.<init>(r1, r2, r3)
            return r0
    }

    public static <E> java.util.List<E> asList(@org.checkerframework.checker.nullness.compatqual.NullableDecl E r1, E[] r2) {
            com.google.common.collect.Lists$OnePlusArrayList r0 = new com.google.common.collect.Lists$OnePlusArrayList
            r0.<init>(r1, r2)
            return r0
    }

    public static <B> java.util.List<java.util.List<B>> cartesianProduct(java.util.List<? extends java.util.List<? extends B>> r0) {
            java.util.List r0 = com.google.common.collect.CartesianList.create(r0)
            return r0
    }

    @java.lang.SafeVarargs
    public static <B> java.util.List<java.util.List<B>> cartesianProduct(java.util.List<? extends B>... r0) {
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.List r0 = cartesianProduct(r0)
            return r0
    }

    static <T> java.util.List<T> cast(java.lang.Iterable<T> r0) {
            java.util.List r0 = (java.util.List) r0
            return r0
    }

    public static com.google.common.collect.ImmutableList<java.lang.Character> charactersOf(java.lang.String r1) {
            com.google.common.collect.Lists$StringAsImmutableList r0 = new com.google.common.collect.Lists$StringAsImmutableList
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.Beta
    public static java.util.List<java.lang.Character> charactersOf(java.lang.CharSequence r1) {
            com.google.common.collect.Lists$CharSequenceAsList r0 = new com.google.common.collect.Lists$CharSequenceAsList
            java.lang.Object r1 = com.google.common.base.Preconditions.checkNotNull(r1)
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.VisibleForTesting
    static int computeArrayListCapacity(int r4) {
            java.lang.String r0 = "arraySize"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r4, r0)
            r0 = 5
            long r2 = (long) r4
            long r2 = r2 + r0
            int r4 = r4 / 10
            long r0 = (long) r4
            long r2 = r2 + r0
            int r4 = com.google.common.primitives.Ints.saturatedCast(r2)
            return r4
    }

    static boolean equalsImpl(java.util.List<?> r6, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r7) {
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r6)
            r1 = 1
            if (r7 != r0) goto L8
            return r1
        L8:
            boolean r0 = r7 instanceof java.util.List
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            java.util.List r7 = (java.util.List) r7
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 == r3) goto L1b
            return r2
        L1b:
            boolean r3 = r6 instanceof java.util.RandomAccess
            if (r3 == 0) goto L39
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L39
            r3 = 0
        L24:
            if (r3 >= r0) goto L38
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = com.google.common.base.Objects.equal(r4, r5)
            if (r4 != 0) goto L35
            return r2
        L35:
            int r3 = r3 + 1
            goto L24
        L38:
            return r1
        L39:
            java.util.Iterator r6 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
            boolean r6 = com.google.common.collect.Iterators.elementsEqual(r6, r7)
            return r6
    }

    static int hashCodeImpl(java.util.List<?> r2) {
            java.util.Iterator r2 = r2.iterator()
            r0 = 1
        L5:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1d
            java.lang.Object r1 = r2.next()
            int r0 = r0 * 31
            if (r1 != 0) goto L15
            r1 = 0
            goto L19
        L15:
            int r1 = r1.hashCode()
        L19:
            int r0 = r0 + r1
            int r0 = ~r0
            int r0 = ~r0
            goto L5
        L1d:
            return r0
    }

    static int indexOfImpl(java.util.List<?> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L9
            int r1 = indexOfRandomAccess(r1, r2)
            return r1
        L9:
            java.util.ListIterator r1 = r1.listIterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            boolean r0 = com.google.common.base.Objects.equal(r2, r0)
            if (r0 == 0) goto Ld
            int r1 = r1.previousIndex()
            return r1
        L22:
            r1 = -1
            return r1
    }

    private static int indexOfRandomAccess(java.util.List<?> r3, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r4) {
            int r0 = r3.size()
            r1 = 0
            if (r4 != 0) goto L13
        L7:
            if (r1 >= r0) goto L23
            java.lang.Object r4 = r3.get(r1)
            if (r4 != 0) goto L10
            return r1
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            if (r1 >= r0) goto L23
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L20
            return r1
        L20:
            int r1 = r1 + 1
            goto L13
        L23:
            r3 = -1
            return r3
    }

    static int lastIndexOfImpl(java.util.List<?> r1, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L9
            int r1 = lastIndexOfRandomAccess(r1, r2)
            return r1
        L9:
            int r0 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r0)
        L11:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.previous()
            boolean r0 = com.google.common.base.Objects.equal(r2, r0)
            if (r0 == 0) goto L11
            int r1 = r1.nextIndex()
            return r1
        L26:
            r1 = -1
            return r1
    }

    private static int lastIndexOfRandomAccess(java.util.List<?> r2, @org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r3) {
            if (r3 != 0) goto L14
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L8:
            if (r3 < 0) goto L2a
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L11
            return r3
        L11:
            int r3 = r3 + (-1)
            goto L8
        L14:
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L1a:
            if (r0 < 0) goto L2a
            java.lang.Object r1 = r2.get(r0)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L27
            return r0
        L27:
            int r0 = r0 + (-1)
            goto L1a
        L2a:
            r2 = -1
            return r2
    }

    static <E> java.util.ListIterator<E> listIteratorImpl(java.util.List<E> r1, int r2) {
            com.google.common.collect.Lists$AbstractListWrapper r0 = new com.google.common.collect.Lists$AbstractListWrapper
            r0.<init>(r1)
            java.util.ListIterator r1 = r0.listIterator(r2)
            return r1
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.ArrayList<E> newArrayList() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.ArrayList<E> newArrayList(java.lang.Iterable<? extends E> r1) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L11
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection r1 = com.google.common.collect.Collections2.cast(r1)
            r0.<init>(r1)
            return r0
        L11:
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r1 = newArrayList(r1)
            return r1
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.ArrayList<E> newArrayList(java.util.Iterator<? extends E> r1) {
            java.util.ArrayList r0 = newArrayList()
            com.google.common.collect.Iterators.addAll(r0, r1)
            return r0
    }

    @java.lang.SafeVarargs
    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.ArrayList<E> newArrayList(E... r2) {
            com.google.common.base.Preconditions.checkNotNull(r2)
            int r0 = r2.length
            int r0 = computeArrayListCapacity(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Collections.addAll(r1, r2)
            return r1
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.ArrayList<E> newArrayListWithCapacity(int r1) {
            java.lang.String r0 = "initialArraySize"
            com.google.common.collect.CollectPreconditions.checkNonnegative(r1, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.ArrayList<E> newArrayListWithExpectedSize(int r1) {
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = computeArrayListCapacity(r1)
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.CopyOnWriteArrayList<E> newCopyOnWriteArrayList() {
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtIncompatible
    public static <E> java.util.concurrent.CopyOnWriteArrayList<E> newCopyOnWriteArrayList(java.lang.Iterable<? extends E> r1) {
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L9
            java.util.Collection r1 = com.google.common.collect.Collections2.cast(r1)
            goto Ld
        L9:
            java.util.ArrayList r1 = newArrayList(r1)
        Ld:
            java.util.concurrent.CopyOnWriteArrayList r0 = new java.util.concurrent.CopyOnWriteArrayList
            r0.<init>(r1)
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.LinkedList<E> newLinkedList() {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            return r0
    }

    @com.google.common.annotations.GwtCompatible(serializable = true)
    public static <E> java.util.LinkedList<E> newLinkedList(java.lang.Iterable<? extends E> r1) {
            java.util.LinkedList r0 = newLinkedList()
            com.google.common.collect.Iterables.addAll(r0, r1)
            return r0
    }

    public static <T> java.util.List<java.util.List<T>> partition(java.util.List<T> r1, int r2) {
            com.google.common.base.Preconditions.checkNotNull(r1)
            if (r2 <= 0) goto L7
            r0 = 1
            goto L8
        L7:
            r0 = 0
        L8:
            com.google.common.base.Preconditions.checkArgument(r0)
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L15
            com.google.common.collect.Lists$RandomAccessPartition r0 = new com.google.common.collect.Lists$RandomAccessPartition
            r0.<init>(r1, r2)
            return r0
        L15:
            com.google.common.collect.Lists$Partition r0 = new com.google.common.collect.Lists$Partition
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> java.util.List<T> reverse(java.util.List<T> r1) {
            boolean r0 = r1 instanceof com.google.common.collect.ImmutableList
            if (r0 == 0) goto Lb
            com.google.common.collect.ImmutableList r1 = (com.google.common.collect.ImmutableList) r1
            com.google.common.collect.ImmutableList r1 = r1.reverse()
            return r1
        Lb:
            boolean r0 = r1 instanceof com.google.common.collect.Lists.ReverseList
            if (r0 == 0) goto L16
            com.google.common.collect.Lists$ReverseList r1 = (com.google.common.collect.Lists.ReverseList) r1
            java.util.List r1 = r1.getForwardList()
            return r1
        L16:
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L20
            com.google.common.collect.Lists$RandomAccessReverseList r0 = new com.google.common.collect.Lists$RandomAccessReverseList
            r0.<init>(r1)
            return r0
        L20:
            com.google.common.collect.Lists$ReverseList r0 = new com.google.common.collect.Lists$ReverseList
            r0.<init>(r1)
            return r0
    }

    static <E> java.util.List<E> subListImpl(java.util.List<E> r1, int r2, int r3) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto La
            com.google.common.collect.Lists$1 r0 = new com.google.common.collect.Lists$1
            r0.<init>(r1)
            goto Lf
        La:
            com.google.common.collect.Lists$2 r0 = new com.google.common.collect.Lists$2
            r0.<init>(r1)
        Lf:
            java.util.List r1 = r0.subList(r2, r3)
            return r1
    }

    public static <F, T> java.util.List<T> transform(java.util.List<F> r1, com.google.common.base.Function<? super F, ? extends T> r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto La
            com.google.common.collect.Lists$TransformingRandomAccessList r0 = new com.google.common.collect.Lists$TransformingRandomAccessList
            r0.<init>(r1, r2)
            return r0
        La:
            com.google.common.collect.Lists$TransformingSequentialList r0 = new com.google.common.collect.Lists$TransformingSequentialList
            r0.<init>(r1, r2)
            return r0
    }
}

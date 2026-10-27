package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class RegularImmutableAsList<E> extends com.google.common.collect.ImmutableAsList<E> {
    private final com.google.common.collect.ImmutableCollection<E> delegate;
    private final com.google.common.collect.ImmutableList<? extends E> delegateList;

    RegularImmutableAsList(com.google.common.collect.ImmutableCollection<E> r1, com.google.common.collect.ImmutableList<? extends E> r2) {
            r0 = this;
            r0.<init>()
            r0.delegate = r1
            r0.delegateList = r2
            return
    }

    RegularImmutableAsList(com.google.common.collect.ImmutableCollection<E> r1, java.lang.Object[] r2) {
            r0 = this;
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.asImmutableList(r2)
            r0.<init>(r1, r2)
            return
    }

    RegularImmutableAsList(com.google.common.collect.ImmutableCollection<E> r1, java.lang.Object[] r2, int r3) {
            r0 = this;
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.asImmutableList(r2, r3)
            r0.<init>(r1, r2)
            return
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @com.google.common.annotations.GwtIncompatible
    int copyIntoArray(java.lang.Object[] r2, int r3) {
            r1 = this;
            com.google.common.collect.ImmutableList<? extends E> r0 = r1.delegateList
            int r2 = r0.copyIntoArray(r2, r3)
            return r2
    }

    @Override // com.google.common.collect.ImmutableAsList
    com.google.common.collect.ImmutableCollection<E> delegateCollection() {
            r1 = this;
            com.google.common.collect.ImmutableCollection<E> r0 = r1.delegate
            return r0
    }

    com.google.common.collect.ImmutableList<? extends E> delegateList() {
            r1 = this;
            com.google.common.collect.ImmutableList<? extends E> r0 = r1.delegateList
            return r0
    }

    @Override // java.util.List
    public E get(int r2) {
            r1 = this;
            com.google.common.collect.ImmutableList<? extends E> r0 = r1.delegateList
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection
    java.lang.Object[] internalArray() {
            r1 = this;
            com.google.common.collect.ImmutableList<? extends E> r0 = r1.delegateList
            java.lang.Object[] r0 = r0.internalArray()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayEnd() {
            r1 = this;
            com.google.common.collect.ImmutableList<? extends E> r0 = r1.delegateList
            int r0 = r0.internalArrayEnd()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    int internalArrayStart() {
            r1 = this;
            com.google.common.collect.ImmutableList<? extends E> r0 = r1.delegateList
            int r0 = r0.internalArrayStart()
            return r0
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public com.google.common.collect.UnmodifiableListIterator<E> listIterator(int r2) {
            r1 = this;
            com.google.common.collect.ImmutableList<? extends E> r0 = r1.delegateList
            com.google.common.collect.UnmodifiableListIterator r2 = r0.listIterator(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public /* bridge */ /* synthetic */ java.util.ListIterator listIterator(int r1) {
            r0 = this;
            com.google.common.collect.UnmodifiableListIterator r1 = r0.listIterator(r1)
            return r1
    }
}

package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class ImmutableAsList<E> extends com.google.common.collect.ImmutableList<E> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    static class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.collect.ImmutableCollection<?> collection;

        SerializedForm(com.google.common.collect.ImmutableCollection<?> r1) {
                r0 = this;
                r0.<init>()
                r0.collection = r1
                return
        }

        java.lang.Object readResolve() {
                r1 = this;
                com.google.common.collect.ImmutableCollection<?> r0 = r1.collection
                com.google.common.collect.ImmutableList r0 = r0.asList()
                return r0
        }
    }

    ImmutableAsList() {
            r0 = this;
            r0.<init>()
            return
    }

    @com.google.common.annotations.GwtIncompatible
    private void readObject(java.io.ObjectInputStream r2) throws java.io.InvalidObjectException {
            r1 = this;
            java.io.InvalidObjectException r2 = new java.io.InvalidObjectException
            java.lang.String r0 = "Use SerializedForm"
            r2.<init>(r0)
            throw r2
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.delegateCollection()
            boolean r2 = r0.contains(r2)
            return r2
    }

    abstract com.google.common.collect.ImmutableCollection<E> delegateCollection();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.delegateCollection()
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.delegateCollection()
            boolean r0 = r0.isPartialView()
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            com.google.common.collect.ImmutableCollection r0 = r1.delegateCollection()
            int r0 = r0.size()
            return r0
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @com.google.common.annotations.GwtIncompatible
    java.lang.Object writeReplace() {
            r2 = this;
            com.google.common.collect.ImmutableAsList$SerializedForm r0 = new com.google.common.collect.ImmutableAsList$SerializedForm
            com.google.common.collect.ImmutableCollection r1 = r2.delegateCollection()
            r0.<init>(r1)
            return r0
    }
}

package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible(emulated = true, serializable = true)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class RegularImmutableMultiset<E> extends com.google.common.collect.ImmutableMultiset<E> {
    static final com.google.common.collect.RegularImmutableMultiset<java.lang.Object> EMPTY = null;
    final transient com.google.common.collect.ObjectCountHashMap<E> contents;

    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.ImmutableSet<E> elementSet;
    private final transient int size;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.collect.RegularImmutableMultiset$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ElementSet extends com.google.common.collect.IndexedImmutableSet<E> {
        final /* synthetic */ com.google.common.collect.RegularImmutableMultiset this$0;

        private ElementSet(com.google.common.collect.RegularImmutableMultiset r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ ElementSet(com.google.common.collect.RegularImmutableMultiset r1, com.google.common.collect.RegularImmutableMultiset.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
                r1 = this;
                com.google.common.collect.RegularImmutableMultiset r0 = r1.this$0
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // com.google.common.collect.IndexedImmutableSet
        E get(int r2) {
                r1 = this;
                com.google.common.collect.RegularImmutableMultiset r0 = r1.this$0
                com.google.common.collect.ObjectCountHashMap<E> r0 = r0.contents
                java.lang.Object r2 = r0.getKey(r2)
                return r2
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
                r1 = this;
                r0 = 1
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.common.collect.RegularImmutableMultiset r0 = r1.this$0
                com.google.common.collect.ObjectCountHashMap<E> r0 = r0.contents
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.common.annotations.GwtIncompatible
    private static class SerializedForm implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final int[] counts;
        final java.lang.Object[] elements;

        SerializedForm(com.google.common.collect.Multiset<?> r5) {
                r4 = this;
                r4.<init>()
                java.util.Set r0 = r5.entrySet()
                int r0 = r0.size()
                java.lang.Object[] r1 = new java.lang.Object[r0]
                r4.elements = r1
                int[] r0 = new int[r0]
                r4.counts = r0
                java.util.Set r5 = r5.entrySet()
                java.util.Iterator r5 = r5.iterator()
                r0 = 0
            L1c:
                boolean r1 = r5.hasNext()
                if (r1 == 0) goto L3b
                java.lang.Object r1 = r5.next()
                com.google.common.collect.Multiset$Entry r1 = (com.google.common.collect.Multiset.Entry) r1
                java.lang.Object[] r2 = r4.elements
                java.lang.Object r3 = r1.getElement()
                r2[r0] = r3
                int[] r2 = r4.counts
                int r1 = r1.getCount()
                r2[r0] = r1
                int r0 = r0 + 1
                goto L1c
            L3b:
                return
        }

        java.lang.Object readResolve() {
                r4 = this;
                com.google.common.collect.ImmutableMultiset$Builder r0 = new com.google.common.collect.ImmutableMultiset$Builder
                java.lang.Object[] r1 = r4.elements
                int r1 = r1.length
                r0.<init>(r1)
                r1 = 0
            L9:
                java.lang.Object[] r2 = r4.elements
                int r3 = r2.length
                if (r1 >= r3) goto L1a
                r2 = r2[r1]
                int[] r3 = r4.counts
                r3 = r3[r1]
                r0.addCopies(r2, r3)
                int r1 = r1 + 1
                goto L9
            L1a:
                com.google.common.collect.ImmutableMultiset r0 = r0.build()
                return r0
        }
    }

    static {
            com.google.common.collect.RegularImmutableMultiset r0 = new com.google.common.collect.RegularImmutableMultiset
            com.google.common.collect.ObjectCountHashMap r1 = com.google.common.collect.ObjectCountHashMap.create()
            r0.<init>(r1)
            com.google.common.collect.RegularImmutableMultiset.EMPTY = r0
            return
    }

    RegularImmutableMultiset(com.google.common.collect.ObjectCountHashMap<E> r6) {
            r5 = this;
            r5.<init>()
            r5.contents = r6
            r0 = 0
            r2 = 0
        L8:
            int r3 = r6.size()
            if (r2 >= r3) goto L17
            int r3 = r6.getValue(r2)
            long r3 = (long) r3
            long r0 = r0 + r3
            int r2 = r2 + 1
            goto L8
        L17:
            int r6 = com.google.common.primitives.Ints.saturatedCast(r0)
            r5.size = r6
            return
    }

    @Override // com.google.common.collect.Multiset
    public int count(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object r2) {
            r1 = this;
            com.google.common.collect.ObjectCountHashMap<E> r0 = r1.contents
            int r2 = r0.get(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public com.google.common.collect.ImmutableSet<E> elementSet() {
            r2 = this;
            com.google.common.collect.ImmutableSet<E> r0 = r2.elementSet
            if (r0 != 0) goto Lc
            com.google.common.collect.RegularImmutableMultiset$ElementSet r0 = new com.google.common.collect.RegularImmutableMultiset$ElementSet
            r1 = 0
            r0.<init>(r2, r1)
            r2.elementSet = r0
        Lc:
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ java.util.Set elementSet() {
            r1 = this;
            com.google.common.collect.ImmutableSet r0 = r1.elementSet()
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultiset
    com.google.common.collect.Multiset.Entry<E> getEntry(int r2) {
            r1 = this;
            com.google.common.collect.ObjectCountHashMap<E> r0 = r1.contents
            com.google.common.collect.Multiset$Entry r2 = r0.getEntry(r2)
            return r2
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @com.google.common.annotations.GwtIncompatible
    java.lang.Object writeReplace() {
            r1 = this;
            com.google.common.collect.RegularImmutableMultiset$SerializedForm r0 = new com.google.common.collect.RegularImmutableMultiset$SerializedForm
            r0.<init>(r1)
            return r0
    }
}

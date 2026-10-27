package com.google.gson.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class LinkedHashTreeMap<K, V> extends java.util.AbstractMap<K, V> implements java.io.Serializable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final java.util.Comparator<java.lang.Comparable> NATURAL_ORDER = null;
    java.util.Comparator<? super K> comparator;
    private com.google.gson.internal.LinkedHashTreeMap<K, V>.EntrySet entrySet;
    final com.google.gson.internal.LinkedHashTreeMap.Node<K, V> header;
    private com.google.gson.internal.LinkedHashTreeMap<K, V>.KeySet keySet;
    int modCount;
    int size;
    com.google.gson.internal.LinkedHashTreeMap.Node<K, V>[] table;
    int threshold;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class AvlBuilder<K, V> {
        private int leavesSkipped;
        private int leavesToSkip;
        private int size;
        private com.google.gson.internal.LinkedHashTreeMap.Node<K, V> stack;

        AvlBuilder() {
                r0 = this;
                r0.<init>()
                return
        }

        void add(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r7) {
                r6 = this;
                r0 = 0
                r7.right = r0
                r7.parent = r0
                r7.left = r0
                r0 = 1
                r7.height = r0
                int r1 = r6.leavesToSkip
                if (r1 <= 0) goto L1f
                int r2 = r6.size
                r3 = r2 & 1
                if (r3 != 0) goto L1f
                int r2 = r2 + r0
                r6.size = r2
                int r1 = r1 - r0
                r6.leavesToSkip = r1
                int r1 = r6.leavesSkipped
                int r1 = r1 + r0
                r6.leavesSkipped = r1
            L1f:
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.stack
                r7.parent = r1
                r6.stack = r7
                int r7 = r6.size
                int r1 = r7 + 1
                r6.size = r1
                int r2 = r6.leavesToSkip
                r3 = 2
                if (r2 <= 0) goto L3e
                r1 = r1 & r0
                if (r1 != 0) goto L3e
                int r7 = r7 + r3
                r6.size = r7
                int r2 = r2 - r0
                r6.leavesToSkip = r2
                int r7 = r6.leavesSkipped
                int r7 = r7 + r0
                r6.leavesSkipped = r7
            L3e:
                r7 = 4
            L3f:
                int r1 = r6.size
                int r2 = r7 + (-1)
                r1 = r1 & r2
                if (r1 != r2) goto L80
                int r1 = r6.leavesSkipped
                if (r1 != 0) goto L64
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.stack
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r1.parent
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r4 = r2.parent
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r5 = r4.parent
                r2.parent = r5
                r6.stack = r2
                r2.left = r4
                r2.right = r1
                int r5 = r1.height
                int r5 = r5 + r0
                r2.height = r5
                r4.parent = r2
                r1.parent = r2
                goto L7d
            L64:
                r2 = 0
                if (r1 != r0) goto L79
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.stack
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r4 = r1.parent
                r6.stack = r4
                r4.right = r1
                int r5 = r1.height
                int r5 = r5 + r0
                r4.height = r5
                r1.parent = r4
                r6.leavesSkipped = r2
                goto L7d
            L79:
                if (r1 != r3) goto L7d
                r6.leavesSkipped = r2
            L7d:
                int r7 = r7 * 2
                goto L3f
            L80:
                return
        }

        void reset(int r2) {
                r1 = this;
                int r0 = java.lang.Integer.highestOneBit(r2)
                int r0 = r0 * 2
                int r0 = r0 + (-1)
                int r0 = r0 - r2
                r1.leavesToSkip = r0
                r2 = 0
                r1.size = r2
                r1.leavesSkipped = r2
                r2 = 0
                r1.stack = r2
                return
        }

        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> root() {
                r2 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r2.stack
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.parent
                if (r1 != 0) goto L7
                return r0
            L7:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AvlIterator<K, V> {
        private com.google.gson.internal.LinkedHashTreeMap.Node<K, V> stackTop;

        AvlIterator() {
                r0 = this;
                r0.<init>()
                return
        }

        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> next() {
                r4 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r4.stackTop
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r0.parent
                r0.parent = r1
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.right
            Lc:
                r3 = r2
                r2 = r1
                r1 = r3
                if (r2 == 0) goto L16
                r2.parent = r1
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r2.left
                goto Lc
            L16:
                r4.stackTop = r1
                return r0
        }

        void reset(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r3) {
                r2 = this;
                r0 = 0
            L1:
                if (r3 == 0) goto Lb
                r3.parent = r0
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.left
                r1 = r0
                r0 = r3
                r3 = r1
                goto L1
            Lb:
                r2.stackTop = r0
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        final /* synthetic */ com.google.gson.internal.LinkedHashTreeMap this$0;


        EntrySet(com.google.gson.internal.LinkedHashTreeMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof java.util.Map.Entry
                if (r0 == 0) goto L10
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                com.google.gson.internal.LinkedHashTreeMap$Node r2 = r0.findByEntry(r2)
                if (r2 == 0) goto L10
                r2 = 1
                return r2
            L10:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap$EntrySet$1 r0 = new com.google.gson.internal.LinkedHashTreeMap$EntrySet$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r3) {
                r2 = this;
                boolean r0 = r3 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                com.google.gson.internal.LinkedHashTreeMap r0 = r2.this$0
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                com.google.gson.internal.LinkedHashTreeMap$Node r3 = r0.findByEntry(r3)
                if (r3 != 0) goto L11
                return r1
            L11:
                com.google.gson.internal.LinkedHashTreeMap r0 = r2.this$0
                r1 = 1
                r0.removeInternal(r3, r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                int r0 = r0.size
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class KeySet extends java.util.AbstractSet<K> {
        final /* synthetic */ com.google.gson.internal.LinkedHashTreeMap this$0;


        KeySet(com.google.gson.internal.LinkedHashTreeMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<K> iterator() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap$KeySet$1 r0 = new com.google.gson.internal.LinkedHashTreeMap$KeySet$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                com.google.gson.internal.LinkedHashTreeMap$Node r2 = r0.removeInternalByKey(r2)
                if (r2 == 0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                com.google.gson.internal.LinkedHashTreeMap r0 = r1.this$0
                int r0 = r0.size
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private abstract class LinkedTreeMapIterator<T> implements java.util.Iterator<T> {
        int expectedModCount;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> lastReturned;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> next;
        final /* synthetic */ com.google.gson.internal.LinkedHashTreeMap this$0;

        LinkedTreeMapIterator(com.google.gson.internal.LinkedHashTreeMap r2) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r2.header
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r0.next
                r1.next = r0
                r0 = 0
                r1.lastReturned = r0
                int r2 = r2.modCount
                r1.expectedModCount = r2
                return
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r2 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r2.next
                com.google.gson.internal.LinkedHashTreeMap r1 = r2.this$0
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r1.header
                if (r0 == r1) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        final com.google.gson.internal.LinkedHashTreeMap.Node<K, V> nextNode() {
                r3 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.next
                com.google.gson.internal.LinkedHashTreeMap r1 = r3.this$0
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r1.header
                if (r0 == r2) goto L1b
                int r1 = r1.modCount
                int r2 = r3.expectedModCount
                if (r1 != r2) goto L15
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.next
                r3.next = r1
                r3.lastReturned = r0
                return r0
            L15:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                r0.<init>()
                throw r0
            L1b:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public final void remove() {
                r3 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.lastReturned
                if (r0 == 0) goto L14
                com.google.gson.internal.LinkedHashTreeMap r1 = r3.this$0
                r2 = 1
                r1.removeInternal(r0, r2)
                r0 = 0
                r3.lastReturned = r0
                com.google.gson.internal.LinkedHashTreeMap r0 = r3.this$0
                int r0 = r0.modCount
                r3.expectedModCount = r0
                return
            L14:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class Node<K, V> implements java.util.Map.Entry<K, V> {
        final int hash;
        int height;
        final K key;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> left;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> next;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> parent;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> prev;
        com.google.gson.internal.LinkedHashTreeMap.Node<K, V> right;
        V value;

        Node() {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.key = r0
                r0 = -1
                r1.hash = r0
                r1.prev = r1
                r1.next = r1
                return
        }

        Node(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r1, K r2, int r3, com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r4, com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r5) {
                r0 = this;
                r0.<init>()
                r0.parent = r1
                r0.key = r2
                r0.hash = r3
                r1 = 1
                r0.height = r1
                r0.next = r4
                r0.prev = r5
                r5.next = r0
                r4.prev = r0
                return
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 == 0) goto L33
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                K r0 = r3.key
                if (r0 != 0) goto L12
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L33
                goto L1c
            L12:
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L33
            L1c:
                V r0 = r3.value
                if (r0 != 0) goto L27
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L33
                goto L31
            L27:
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L33
            L31:
                r4 = 1
                return r4
            L33:
                return r1
        }

        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> first() {
                r3 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.left
                r1 = r3
            L3:
                if (r0 == 0) goto Lb
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.left
                r2 = r1
                r1 = r0
                r0 = r2
                goto L3
            Lb:
                return r1
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.value
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r3 = this;
                K r0 = r3.key
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                V r2 = r3.value
                if (r2 != 0) goto L10
                goto L14
            L10:
                int r1 = r2.hashCode()
            L14:
                r0 = r0 ^ r1
                return r0
        }

        public com.google.gson.internal.LinkedHashTreeMap.Node<K, V> last() {
                r3 = this;
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.right
                r1 = r3
            L3:
                if (r0 == 0) goto Lb
                com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.right
                r2 = r1
                r1 = r0
                r0 = r2
                goto L3
            Lb:
                return r1
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                V r0 = r1.value
                r1.value = r2
                return r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K r1 = r2.key
                r0.append(r1)
                java.lang.String r1 = "="
                r0.append(r1)
                V r1 = r2.value
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            com.google.gson.internal.LinkedHashTreeMap$1 r0 = new com.google.gson.internal.LinkedHashTreeMap$1
            r0.<init>()
            com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER = r0
            return
    }

    public LinkedHashTreeMap() {
            r1 = this;
            java.util.Comparator<java.lang.Comparable> r0 = com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER
            r1.<init>(r0)
            return
    }

    public LinkedHashTreeMap(java.util.Comparator<? super K> r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.size = r0
            r1.modCount = r0
            if (r2 == 0) goto Lb
            goto Ld
        Lb:
            java.util.Comparator<java.lang.Comparable> r2 = com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER
        Ld:
            r1.comparator = r2
            com.google.gson.internal.LinkedHashTreeMap$Node r2 = new com.google.gson.internal.LinkedHashTreeMap$Node
            r2.<init>()
            r1.header = r2
            r2 = 16
            com.google.gson.internal.LinkedHashTreeMap$Node[] r2 = new com.google.gson.internal.LinkedHashTreeMap.Node[r2]
            r1.table = r2
            int r0 = r2.length
            int r0 = r0 / 2
            int r2 = r2.length
            int r2 = r2 / 4
            int r0 = r0 + r2
            r1.threshold = r0
            return
    }

    private void doubleCapacity() {
            r2 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r0 = r2.table
            com.google.gson.internal.LinkedHashTreeMap$Node[] r0 = doubleCapacity(r0)
            r2.table = r0
            int r1 = r0.length
            int r1 = r1 / 2
            int r0 = r0.length
            int r0 = r0 / 4
            int r1 = r1 + r0
            r2.threshold = r1
            return
    }

    static <K, V> com.google.gson.internal.LinkedHashTreeMap.Node<K, V>[] doubleCapacity(com.google.gson.internal.LinkedHashTreeMap.Node<K, V>[] r11) {
            int r0 = r11.length
            int r1 = r0 * 2
            com.google.gson.internal.LinkedHashTreeMap$Node[] r1 = new com.google.gson.internal.LinkedHashTreeMap.Node[r1]
            com.google.gson.internal.LinkedHashTreeMap$AvlIterator r2 = new com.google.gson.internal.LinkedHashTreeMap$AvlIterator
            r2.<init>()
            com.google.gson.internal.LinkedHashTreeMap$AvlBuilder r3 = new com.google.gson.internal.LinkedHashTreeMap$AvlBuilder
            r3.<init>()
            com.google.gson.internal.LinkedHashTreeMap$AvlBuilder r4 = new com.google.gson.internal.LinkedHashTreeMap$AvlBuilder
            r4.<init>()
            r5 = 0
            r6 = 0
        L16:
            if (r6 >= r0) goto L67
            r7 = r11[r6]
            if (r7 != 0) goto L1d
            goto L64
        L1d:
            r2.reset(r7)
            r8 = 0
            r9 = 0
        L22:
            com.google.gson.internal.LinkedHashTreeMap$Node r10 = r2.next()
            if (r10 == 0) goto L33
            int r10 = r10.hash
            r10 = r10 & r0
            if (r10 != 0) goto L30
            int r8 = r8 + 1
            goto L22
        L30:
            int r9 = r9 + 1
            goto L22
        L33:
            r3.reset(r8)
            r4.reset(r9)
            r2.reset(r7)
        L3c:
            com.google.gson.internal.LinkedHashTreeMap$Node r7 = r2.next()
            if (r7 == 0) goto L4f
            int r10 = r7.hash
            r10 = r10 & r0
            if (r10 != 0) goto L4b
            r3.add(r7)
            goto L3c
        L4b:
            r4.add(r7)
            goto L3c
        L4f:
            r7 = 0
            if (r8 <= 0) goto L57
            com.google.gson.internal.LinkedHashTreeMap$Node r8 = r3.root()
            goto L58
        L57:
            r8 = r7
        L58:
            r1[r6] = r8
            int r8 = r6 + r0
            if (r9 <= 0) goto L62
            com.google.gson.internal.LinkedHashTreeMap$Node r7 = r4.root()
        L62:
            r1[r8] = r7
        L64:
            int r6 = r6 + 1
            goto L16
        L67:
            return r1
    }

    private boolean equal(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            if (r1 == r2) goto Ld
            if (r1 == 0) goto Lb
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    private void rebalance(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r8, boolean r9) {
            r7 = this;
        L0:
            if (r8 == 0) goto L79
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r8.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r8.right
            r2 = 0
            if (r0 == 0) goto Lc
            int r3 = r0.height
            goto Ld
        Lc:
            r3 = 0
        Ld:
            if (r1 == 0) goto L12
            int r4 = r1.height
            goto L13
        L12:
            r4 = 0
        L13:
            int r5 = r3 - r4
            r6 = -2
            if (r5 != r6) goto L3c
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r1.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r1.right
            if (r3 == 0) goto L21
            int r3 = r3.height
            goto L22
        L21:
            r3 = 0
        L22:
            if (r0 == 0) goto L26
            int r2 = r0.height
        L26:
            int r2 = r2 - r3
            r0 = -1
            if (r2 == r0) goto L36
            if (r2 != 0) goto L2f
            if (r9 != 0) goto L2f
            goto L36
        L2f:
            r7.rotateRight(r1)
            r7.rotateLeft(r8)
            goto L39
        L36:
            r7.rotateLeft(r8)
        L39:
            if (r9 == 0) goto L76
            goto L79
        L3c:
            r1 = 2
            r6 = 1
            if (r5 != r1) goto L63
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r0.right
            if (r3 == 0) goto L49
            int r3 = r3.height
            goto L4a
        L49:
            r3 = 0
        L4a:
            if (r1 == 0) goto L4e
            int r2 = r1.height
        L4e:
            int r2 = r2 - r3
            if (r2 == r6) goto L5d
            if (r2 != 0) goto L56
            if (r9 != 0) goto L56
            goto L5d
        L56:
            r7.rotateLeft(r0)
            r7.rotateRight(r8)
            goto L60
        L5d:
            r7.rotateRight(r8)
        L60:
            if (r9 == 0) goto L76
            goto L79
        L63:
            if (r5 != 0) goto L6c
            int r3 = r3 + 1
            r8.height = r3
            if (r9 == 0) goto L76
            goto L79
        L6c:
            int r0 = java.lang.Math.max(r3, r4)
            int r0 = r0 + r6
            r8.height = r0
            if (r9 != 0) goto L76
            goto L79
        L76:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r8.parent
            goto L0
        L79:
            return
    }

    private void replaceInParent(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r3, com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r4) {
            r2 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r3.parent
            r1 = 0
            r3.parent = r1
            if (r4 == 0) goto L9
            r4.parent = r0
        L9:
            if (r0 == 0) goto L15
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r0.left
            if (r1 != r3) goto L12
            r0.left = r4
            return
        L12:
            r0.right = r4
            return
        L15:
            int r3 = r3.hash
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r0 = r2.table
            int r1 = r0.length
            int r1 = r1 + (-1)
            r3 = r3 & r1
            r0[r3] = r4
            return
    }

    private void rotateLeft(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r6) {
            r5 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r6.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.right
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r1.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r1.right
            r6.right = r2
            if (r2 == 0) goto Le
            r2.parent = r6
        Le:
            r5.replaceInParent(r6, r1)
            r1.left = r6
            r6.parent = r1
            r4 = 0
            if (r0 == 0) goto L1b
            int r0 = r0.height
            goto L1c
        L1b:
            r0 = 0
        L1c:
            if (r2 == 0) goto L21
            int r2 = r2.height
            goto L22
        L21:
            r2 = 0
        L22:
            int r0 = java.lang.Math.max(r0, r2)
            int r0 = r0 + 1
            r6.height = r0
            if (r3 == 0) goto L2e
            int r4 = r3.height
        L2e:
            int r6 = java.lang.Math.max(r0, r4)
            int r6 = r6 + 1
            r1.height = r6
            return
    }

    private void rotateRight(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r6) {
            r5 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r6.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.right
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r0.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r0.right
            r6.left = r3
            if (r3 == 0) goto Le
            r3.parent = r6
        Le:
            r5.replaceInParent(r6, r0)
            r0.right = r6
            r6.parent = r0
            r4 = 0
            if (r1 == 0) goto L1b
            int r1 = r1.height
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r3 == 0) goto L21
            int r3 = r3.height
            goto L22
        L21:
            r3 = 0
        L22:
            int r1 = java.lang.Math.max(r1, r3)
            int r1 = r1 + 1
            r6.height = r1
            if (r2 == 0) goto L2e
            int r4 = r2.height
        L2e:
            int r6 = java.lang.Math.max(r1, r4)
            int r6 = r6 + 1
            r0.height = r6
            return
    }

    private static int secondaryHash(int r2) {
            int r0 = r2 >>> 20
            int r1 = r2 >>> 12
            r0 = r0 ^ r1
            r2 = r2 ^ r0
            int r0 = r2 >>> 7
            r0 = r0 ^ r2
            int r2 = r2 >>> 4
            r2 = r2 ^ r0
            return r2
    }

    private java.lang.Object writeReplace() throws java.io.ObjectStreamException {
            r1 = this;
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r1)
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r4 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r0 = r4.table
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            r0 = 0
            r4.size = r0
            int r0 = r4.modCount
            int r0 = r0 + 1
            r4.modCount = r0
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r0 = r4.header
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r0.next
        L13:
            if (r2 == r0) goto L1d
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r3 = r2.next
            r2.prev = r1
            r2.next = r1
            r2 = r3
            goto L13
        L1d:
            r0.prev = r0
            r0.next = r0
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node r1 = r0.findByObject(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r1 = this;
            com.google.gson.internal.LinkedHashTreeMap<K, V>$EntrySet r0 = r1.entrySet
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.gson.internal.LinkedHashTreeMap$EntrySet r0 = new com.google.gson.internal.LinkedHashTreeMap$EntrySet
            r0.<init>(r1)
            r1.entrySet = r0
            return r0
    }

    com.google.gson.internal.LinkedHashTreeMap.Node<K, V> find(K r12, boolean r13) {
            r11 = this;
            java.util.Comparator<? super K> r0 = r11.comparator
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V>[] r1 = r11.table
            int r2 = r12.hashCode()
            int r6 = secondaryHash(r2)
            int r2 = r1.length
            r9 = 1
            int r2 = r2 - r9
            r2 = r2 & r6
            r3 = r1[r2]
            r4 = 0
            if (r3 == 0) goto L3d
            java.util.Comparator<java.lang.Comparable> r5 = com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER
            if (r0 != r5) goto L1d
            r5 = r12
            java.lang.Comparable r5 = (java.lang.Comparable) r5
            goto L1e
        L1d:
            r5 = r4
        L1e:
            if (r5 == 0) goto L27
            K r7 = r3.key
            int r7 = r5.compareTo(r7)
            goto L2d
        L27:
            K r7 = r3.key
            int r7 = r0.compare(r12, r7)
        L2d:
            if (r7 != 0) goto L30
            return r3
        L30:
            if (r7 >= 0) goto L35
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r3.left
            goto L37
        L35:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r3.right
        L37:
            if (r8 != 0) goto L3b
            r10 = r7
            goto L3f
        L3b:
            r3 = r8
            goto L1e
        L3d:
            r7 = 0
            r10 = 0
        L3f:
            if (r13 != 0) goto L42
            return r4
        L42:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r7 = r11.header
            if (r3 != 0) goto L7a
            java.util.Comparator<java.lang.Comparable> r13 = com.google.gson.internal.LinkedHashTreeMap.NATURAL_ORDER
            if (r0 != r13) goto L4e
            boolean r13 = r12 instanceof java.lang.Comparable
            if (r13 == 0) goto L50
        L4e:
            r4 = r3
            goto L6f
        L50:
            java.lang.ClassCastException r13 = new java.lang.ClassCastException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r12 = r12.getClass()
            java.lang.String r12 = r12.getName()
            r0.append(r12)
            java.lang.String r12 = " is not Comparable"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r13.<init>(r12)
            throw r13
        L6f:
            com.google.gson.internal.LinkedHashTreeMap$Node r3 = new com.google.gson.internal.LinkedHashTreeMap$Node
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r7.prev
            r5 = r12
            r3.<init>(r4, r5, r6, r7, r8)
            r1[r2] = r3
            goto L8d
        L7a:
            r5 = r12
            r4 = r3
            com.google.gson.internal.LinkedHashTreeMap$Node r3 = new com.google.gson.internal.LinkedHashTreeMap$Node
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r8 = r7.prev
            r3.<init>(r4, r5, r6, r7, r8)
            if (r10 >= 0) goto L88
            r4.left = r3
            goto L8a
        L88:
            r4.right = r3
        L8a:
            r11.rebalance(r4, r9)
        L8d:
            int r12 = r11.size
            int r13 = r12 + 1
            r11.size = r13
            int r13 = r11.threshold
            if (r12 <= r13) goto L9a
            r11.doubleCapacity()
        L9a:
            int r12 = r11.modCount
            int r12 = r12 + r9
            r11.modCount = r12
            return r3
    }

    com.google.gson.internal.LinkedHashTreeMap.Node<K, V> findByEntry(java.util.Map.Entry<?, ?> r3) {
            r2 = this;
            java.lang.Object r0 = r3.getKey()
            com.google.gson.internal.LinkedHashTreeMap$Node r0 = r2.findByObject(r0)
            if (r0 == 0) goto L17
            V r1 = r0.value
            java.lang.Object r3 = r3.getValue()
            boolean r3 = r2.equal(r1, r3)
            if (r3 == 0) goto L17
            return r0
        L17:
            r3 = 0
            return r3
    }

    com.google.gson.internal.LinkedHashTreeMap.Node<K, V> findByObject(java.lang.Object r3) {
            r2 = this;
            r0 = 0
            if (r3 == 0) goto L9
            r1 = 0
            com.google.gson.internal.LinkedHashTreeMap$Node r3 = r2.find(r3, r1)     // Catch: java.lang.ClassCastException -> L9
            return r3
        L9:
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object r1) {
            r0 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node r1 = r0.findByObject(r1)
            if (r1 == 0) goto L9
            V r1 = r1.value
            return r1
        L9:
            r1 = 0
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<K> keySet() {
            r1 = this;
            com.google.gson.internal.LinkedHashTreeMap<K, V>$KeySet r0 = r1.keySet
            if (r0 == 0) goto L5
            return r0
        L5:
            com.google.gson.internal.LinkedHashTreeMap$KeySet r0 = new com.google.gson.internal.LinkedHashTreeMap$KeySet
            r0.<init>(r1)
            r1.keySet = r0
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K r2, V r3) {
            r1 = this;
            if (r2 == 0) goto Lc
            r0 = 1
            com.google.gson.internal.LinkedHashTreeMap$Node r2 = r1.find(r2, r0)
            V r0 = r2.value
            r2.value = r3
            return r0
        Lc:
            java.lang.NullPointerException r2 = new java.lang.NullPointerException
            java.lang.String r3 = "key == null"
            r2.<init>(r3)
            throw r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r1) {
            r0 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node r1 = r0.removeInternalByKey(r1)
            if (r1 == 0) goto L9
            V r1 = r1.value
            return r1
        L9:
            r1 = 0
            return r1
    }

    void removeInternal(com.google.gson.internal.LinkedHashTreeMap.Node<K, V> r6, boolean r7) {
            r5 = this;
            r0 = 0
            if (r7 == 0) goto L11
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r7 = r6.prev
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.next
            r7.next = r1
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.next
            r1.prev = r7
            r6.prev = r0
            r6.next = r0
        L11:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r7 = r6.left
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.right
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r2 = r6.parent
            r3 = 0
            if (r7 == 0) goto L54
            if (r1 == 0) goto L54
            int r2 = r7.height
            int r4 = r1.height
            if (r2 <= r4) goto L27
            com.google.gson.internal.LinkedHashTreeMap$Node r7 = r7.last()
            goto L2b
        L27:
            com.google.gson.internal.LinkedHashTreeMap$Node r7 = r1.first()
        L2b:
            r5.removeInternal(r7, r3)
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.left
            if (r1 == 0) goto L3b
            int r2 = r1.height
            r7.left = r1
            r1.parent = r7
            r6.left = r0
            goto L3c
        L3b:
            r2 = 0
        L3c:
            com.google.gson.internal.LinkedHashTreeMap$Node<K, V> r1 = r6.right
            if (r1 == 0) goto L48
            int r3 = r1.height
            r7.right = r1
            r1.parent = r7
            r6.right = r0
        L48:
            int r0 = java.lang.Math.max(r2, r3)
            int r0 = r0 + 1
            r7.height = r0
            r5.replaceInParent(r6, r7)
            return
        L54:
            if (r7 == 0) goto L5c
            r5.replaceInParent(r6, r7)
            r6.left = r0
            goto L67
        L5c:
            if (r1 == 0) goto L64
            r5.replaceInParent(r6, r1)
            r6.right = r0
            goto L67
        L64:
            r5.replaceInParent(r6, r0)
        L67:
            r5.rebalance(r2, r3)
            int r6 = r5.size
            int r6 = r6 + (-1)
            r5.size = r6
            int r6 = r5.modCount
            int r6 = r6 + 1
            r5.modCount = r6
            return
    }

    com.google.gson.internal.LinkedHashTreeMap.Node<K, V> removeInternalByKey(java.lang.Object r2) {
            r1 = this;
            com.google.gson.internal.LinkedHashTreeMap$Node r2 = r1.findByObject(r2)
            if (r2 == 0) goto La
            r0 = 1
            r1.removeInternal(r2, r0)
        La:
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }
}

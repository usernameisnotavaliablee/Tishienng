package io.netty.handler.codec;

import io.netty.handler.codec.Headers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class DefaultHeaders<K, V, T extends io.netty.handler.codec.Headers<K, V, T>> implements io.netty.handler.codec.Headers<K, V, T> {
    static final int HASH_CODE_SEED = -1028477387;
    private final io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V>[] entries;
    private final byte hashMask;
    private final io.netty.util.HashingStrategy<K> hashingStrategy;
    protected final io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> head;
    private final io.netty.handler.codec.DefaultHeaders.NameValidator<K> nameValidator;
    int size;
    private final io.netty.handler.codec.ValueConverter<V> valueConverter;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.DefaultHeaders$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    protected static class HeaderEntry<K, V> implements java.util.Map.Entry<K, V> {
        protected io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> after;
        protected io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> before;
        protected final int hash;
        protected final K key;
        protected io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> next;
        protected V value;

        HeaderEntry() {
                r1 = this;
                r1.<init>()
                r0 = -1
                r1.hash = r0
                r0 = 0
                r1.key = r0
                r1.after = r1
                r1.before = r1
                return
        }

        protected HeaderEntry(int r1, K r2) {
                r0 = this;
                r0.<init>()
                r0.hash = r1
                r0.key = r2
                return
        }

        HeaderEntry(int r1, K r2, V r3, io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> r4, io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> r5) {
                r0 = this;
                r0.<init>()
                r0.hash = r1
                r0.key = r2
                r0.value = r3
                r0.next = r4
                r0.after = r5
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r5.before
                r0.before = r1
                r0.pointNeighborsToThis()
                return
        }

        public final io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> after() {
                r1 = this;
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r1.after
                return r0
        }

        public final io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> before() {
                r1 = this;
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r1.before
                return r0
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof java.util.Map.Entry
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                java.util.Map$Entry r4 = (java.util.Map.Entry) r4
                java.lang.Object r0 = r3.getKey()
                if (r0 != 0) goto L15
                java.lang.Object r0 = r4.getKey()
                if (r0 != 0) goto L40
                goto L23
            L15:
                java.lang.Object r0 = r3.getKey()
                java.lang.Object r2 = r4.getKey()
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L40
            L23:
                java.lang.Object r0 = r3.getValue()
                if (r0 != 0) goto L30
                java.lang.Object r4 = r4.getValue()
                if (r4 != 0) goto L40
                goto L3e
            L30:
                java.lang.Object r0 = r3.getValue()
                java.lang.Object r4 = r4.getValue()
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L40
            L3e:
                r4 = 1
                return r4
            L40:
                return r1
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
                r1 = this;
                K r0 = r1.key
                return r0
        }

        @Override // java.util.Map.Entry
        public final V getValue() {
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

        protected final void pointNeighborsToThis() {
                r1 = this;
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r1.before
                r0.after = r1
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r1.after
                r0.before = r1
                return
        }

        protected void remove() {
                r2 = this;
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r2.before
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r2.after
                r0.after = r1
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r2.after
                r1.before = r0
                return
        }

        @Override // java.util.Map.Entry
        public final V setValue(V r2) {
                r1 = this;
                java.lang.String r0 = "value"
                io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
                V r0 = r1.value
                r1.value = r2
                return r0
        }

        public final java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                K r1 = r2.key
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                r1 = 61
                r0.append(r1)
                V r1 = r2.value
                java.lang.String r1 = r1.toString()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class HeaderIterator implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> current;
        final /* synthetic */ io.netty.handler.codec.DefaultHeaders this$0;

        private HeaderIterator(io.netty.handler.codec.DefaultHeaders r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r1.head
                r0.current = r1
                return
        }

        /* synthetic */ HeaderIterator(io.netty.handler.codec.DefaultHeaders r1, io.netty.handler.codec.DefaultHeaders.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r2.current
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r0.after
                io.netty.handler.codec.DefaultHeaders r1 = r2.this$0
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r1.head
                if (r0 == r1) goto Lc
                r0 = 1
                return r0
            Lc:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<K, V> next() {
                r2 = this;
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r2.current
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r0.after
                r2.current = r0
                io.netty.handler.codec.DefaultHeaders r1 = r2.this$0
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r1.head
                if (r0 == r1) goto Ld
                return r0
            Ld:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "read only"
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface NameValidator<K> {
        public static final io.netty.handler.codec.DefaultHeaders.NameValidator NOT_NULL = null;


        static {
                io.netty.handler.codec.DefaultHeaders$NameValidator$1 r0 = new io.netty.handler.codec.DefaultHeaders$NameValidator$1
                r0.<init>()
                io.netty.handler.codec.DefaultHeaders.NameValidator.NOT_NULL = r0
                return
        }

        void validateName(K r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class ValueIterator implements java.util.Iterator<V> {
        private final int hash;
        private final K name;
        private io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> next;
        private io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> previous;
        private io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> removalPrevious;
        final /* synthetic */ io.netty.handler.codec.DefaultHeaders this$0;

        ValueIterator(io.netty.handler.codec.DefaultHeaders r2, K r3) {
                r1 = this;
                r1.this$0 = r2
                r1.<init>()
                java.lang.String r0 = "name"
                java.lang.Object r0 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
                r1.name = r0
                io.netty.util.HashingStrategy r0 = io.netty.handler.codec.DefaultHeaders.access$100(r2)
                int r3 = r0.hashCode(r3)
                r1.hash = r3
                io.netty.handler.codec.DefaultHeaders$HeaderEntry[] r0 = io.netty.handler.codec.DefaultHeaders.access$200(r2)
                int r2 = io.netty.handler.codec.DefaultHeaders.access$300(r2, r3)
                r2 = r0[r2]
                r1.calculateNext(r2)
                return
        }

        private void calculateNext(io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> r4) {
                r3 = this;
            L0:
                if (r4 == 0) goto L1e
                int r0 = r4.hash
                int r1 = r3.hash
                if (r0 != r1) goto L1b
                io.netty.handler.codec.DefaultHeaders r0 = r3.this$0
                io.netty.util.HashingStrategy r0 = io.netty.handler.codec.DefaultHeaders.access$100(r0)
                K r1 = r3.name
                K r2 = r4.key
                boolean r0 = r0.equals(r1, r2)
                if (r0 == 0) goto L1b
                r3.next = r4
                return
            L1b:
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r4 = r4.next
                goto L0
            L1e:
                r4 = 0
                r3.next = r4
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r1.next
                if (r0 == 0) goto L6
                r0 = 1
                return r0
            L6:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public V next() {
                r1 = this;
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L1a
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r1.previous
                if (r0 == 0) goto Lc
                r1.removalPrevious = r0
            Lc:
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r1.next
                r1.previous = r0
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r0.next
                r1.calculateNext(r0)
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r1.previous
                V r0 = r0.value
                return r0
            L1a:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r3.previous
                if (r0 == 0) goto L12
                io.netty.handler.codec.DefaultHeaders r1 = r3.this$0
                io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r2 = r3.removalPrevious
                io.netty.handler.codec.DefaultHeaders$HeaderEntry r0 = io.netty.handler.codec.DefaultHeaders.access$400(r1, r0, r2)
                r3.removalPrevious = r0
                r0 = 0
                r3.previous = r0
                return
            L12:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    public DefaultHeaders(io.netty.handler.codec.ValueConverter<V> r2) {
            r1 = this;
            io.netty.util.HashingStrategy r0 = io.netty.util.HashingStrategy.JAVA_HASHER
            r1.<init>(r0, r2)
            return
    }

    public DefaultHeaders(io.netty.handler.codec.ValueConverter<V> r2, io.netty.handler.codec.DefaultHeaders.NameValidator<K> r3) {
            r1 = this;
            io.netty.util.HashingStrategy r0 = io.netty.util.HashingStrategy.JAVA_HASHER
            r1.<init>(r0, r2, r3)
            return
    }

    public DefaultHeaders(io.netty.util.HashingStrategy<K> r2, io.netty.handler.codec.ValueConverter<V> r3) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders$NameValidator r0 = io.netty.handler.codec.DefaultHeaders.NameValidator.NOT_NULL
            r1.<init>(r2, r3, r0)
            return
    }

    public DefaultHeaders(io.netty.util.HashingStrategy<K> r2, io.netty.handler.codec.ValueConverter<V> r3, io.netty.handler.codec.DefaultHeaders.NameValidator<K> r4) {
            r1 = this;
            r0 = 16
            r1.<init>(r2, r3, r4, r0)
            return
    }

    public DefaultHeaders(io.netty.util.HashingStrategy<K> r2, io.netty.handler.codec.ValueConverter<V> r3, io.netty.handler.codec.DefaultHeaders.NameValidator<K> r4, int r5) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "valueConverter"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.handler.codec.ValueConverter r3 = (io.netty.handler.codec.ValueConverter) r3
            r1.valueConverter = r3
            java.lang.String r3 = "nameValidator"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r3)
            io.netty.handler.codec.DefaultHeaders$NameValidator r3 = (io.netty.handler.codec.DefaultHeaders.NameValidator) r3
            r1.nameValidator = r3
            java.lang.String r3 = "nameHashingStrategy"
            java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r3)
            io.netty.util.HashingStrategy r2 = (io.netty.util.HashingStrategy) r2
            r1.hashingStrategy = r2
            r2 = 128(0x80, float:1.8E-43)
            int r2 = java.lang.Math.min(r5, r2)
            r3 = 2
            int r2 = java.lang.Math.max(r3, r2)
            int r2 = io.netty.util.internal.MathUtil.findNextPositivePowerOfTwo(r2)
            io.netty.handler.codec.DefaultHeaders$HeaderEntry[] r2 = new io.netty.handler.codec.DefaultHeaders.HeaderEntry[r2]
            r1.entries = r2
            int r2 = r2.length
            int r2 = r2 + (-1)
            byte r2 = (byte) r2
            r1.hashMask = r2
            io.netty.handler.codec.DefaultHeaders$HeaderEntry r2 = new io.netty.handler.codec.DefaultHeaders$HeaderEntry
            r2.<init>()
            r1.head = r2
            return
    }

    static /* synthetic */ io.netty.util.HashingStrategy access$100(io.netty.handler.codec.DefaultHeaders r0) {
            io.netty.util.HashingStrategy<K> r0 = r0.hashingStrategy
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.DefaultHeaders.HeaderEntry[] access$200(io.netty.handler.codec.DefaultHeaders r0) {
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V>[] r0 = r0.entries
            return r0
    }

    static /* synthetic */ int access$300(io.netty.handler.codec.DefaultHeaders r0, int r1) {
            int r0 = r0.index(r1)
            return r0
    }

    static /* synthetic */ io.netty.handler.codec.DefaultHeaders.HeaderEntry access$400(io.netty.handler.codec.DefaultHeaders r0, io.netty.handler.codec.DefaultHeaders.HeaderEntry r1, io.netty.handler.codec.DefaultHeaders.HeaderEntry r2) {
            io.netty.handler.codec.DefaultHeaders$HeaderEntry r0 = r0.remove0(r1, r2)
            return r0
    }

    private void add0(int r3, int r4, K r5, V r6) {
            r2 = this;
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V>[] r0 = r2.entries
            r1 = r0[r4]
            io.netty.handler.codec.DefaultHeaders$HeaderEntry r3 = r2.newHeaderEntry(r3, r5, r6, r1)
            r0[r4] = r3
            int r3 = r2.size
            int r3 = r3 + 1
            r2.size = r3
            return
    }

    private int index(int r2) {
            r1 = this;
            byte r0 = r1.hashMask
            r2 = r2 & r0
            return r2
    }

    private io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> remove0(io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> r4, io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> r5) {
            r3 = this;
            int r0 = r4.hash
            int r0 = r3.index(r0)
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V>[] r1 = r3.entries
            r2 = r1[r0]
            if (r2 != r4) goto L11
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r5 = r4.next
            r1[r0] = r5
            goto L15
        L11:
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r4.next
            r5.next = r0
        L15:
            r4.remove()
            int r4 = r3.size
            int r4 = r4 + (-1)
            r3.size = r4
            return r5
    }

    private V remove0(int r6, int r7, K r8) {
            r5 = this;
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V>[] r0 = r5.entries
            r0 = r0[r7]
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r2 = r0.next
        La:
            if (r2 == 0) goto L2e
            int r3 = r2.hash
            if (r3 != r6) goto L2a
            io.netty.util.HashingStrategy<K> r3 = r5.hashingStrategy
            K r4 = r2.key
            boolean r3 = r3.equals(r8, r4)
            if (r3 == 0) goto L2a
            V r1 = r2.value
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r3 = r2.next
            r0.next = r3
            r2.remove()
            int r2 = r5.size
            int r2 = r2 + (-1)
            r5.size = r2
            goto L2b
        L2a:
            r0 = r2
        L2b:
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r2 = r0.next
            goto La
        L2e:
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V>[] r0 = r5.entries
            r0 = r0[r7]
            int r2 = r0.hash
            if (r2 != r6) goto L53
            io.netty.util.HashingStrategy<K> r6 = r5.hashingStrategy
            K r2 = r0.key
            boolean r6 = r6.equals(r8, r2)
            if (r6 == 0) goto L53
            if (r1 != 0) goto L44
            V r1 = r0.value
        L44:
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V>[] r6 = r5.entries
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r8 = r0.next
            r6[r7] = r8
            r0.remove()
            int r6 = r5.size
            int r6 = r6 + (-1)
            r5.size = r6
        L53:
            return r1
    }

    private T thisT() {
            r0 = this;
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public T add(io.netty.handler.codec.Headers<? extends K, ? extends V, ?> r2) {
            r1 = this;
            if (r2 == r1) goto La
            r1.addImpl(r2)
            io.netty.handler.codec.Headers r2 = r1.thisT()
            return r2
        La:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "can't add to itself."
            r2.<init>(r0)
            throw r2
    }

    @Override // io.netty.handler.codec.Headers
    public T add(K r4, java.lang.Iterable<? extends V> r5) {
            r3 = this;
            io.netty.handler.codec.DefaultHeaders$NameValidator<K> r0 = r3.nameValidator
            r0.validateName(r4)
            io.netty.util.HashingStrategy<K> r0 = r3.hashingStrategy
            int r0 = r0.hashCode(r4)
            int r1 = r3.index(r0)
            java.util.Iterator r5 = r5.iterator()
        L13:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L21
            java.lang.Object r2 = r5.next()
            r3.add0(r0, r1, r4, r2)
            goto L13
        L21:
            io.netty.handler.codec.Headers r4 = r3.thisT()
            return r4
    }

    @Override // io.netty.handler.codec.Headers
    public T add(K r3, V r4) {
            r2 = this;
            io.netty.handler.codec.DefaultHeaders$NameValidator<K> r0 = r2.nameValidator
            r0.validateName(r3)
            java.lang.String r0 = "value"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.util.HashingStrategy<K> r0 = r2.hashingStrategy
            int r0 = r0.hashCode(r3)
            int r1 = r2.index(r0)
            r2.add0(r0, r1, r3, r4)
            io.netty.handler.codec.Headers r3 = r2.thisT()
            return r3
    }

    @Override // io.netty.handler.codec.Headers
    public T add(K r6, V... r7) {
            r5 = this;
            io.netty.handler.codec.DefaultHeaders$NameValidator<K> r0 = r5.nameValidator
            r0.validateName(r6)
            io.netty.util.HashingStrategy<K> r0 = r5.hashingStrategy
            int r0 = r0.hashCode(r6)
            int r1 = r5.index(r0)
            int r2 = r7.length
            r3 = 0
        L11:
            if (r3 >= r2) goto L1b
            r4 = r7[r3]
            r5.add0(r0, r1, r6, r4)
            int r3 = r3 + 1
            goto L11
        L1b:
            io.netty.handler.codec.Headers r6 = r5.thisT()
            return r6
    }

    @Override // io.netty.handler.codec.Headers
    public T addBoolean(K r2, boolean r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertBoolean(r3)
            io.netty.handler.codec.Headers r2 = r1.add(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T addByte(K r2, byte r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertByte(r3)
            io.netty.handler.codec.Headers r2 = r1.add(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T addChar(K r2, char r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertChar(r3)
            io.netty.handler.codec.Headers r2 = r1.add(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T addDouble(K r2, double r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertDouble(r3)
            io.netty.handler.codec.Headers r2 = r1.add(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T addFloat(K r2, float r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertFloat(r3)
            io.netty.handler.codec.Headers r2 = r1.add(r2, r3)
            return r2
    }

    protected void addImpl(io.netty.handler.codec.Headers<? extends K, ? extends V, ?> r6) {
            r5 = this;
            boolean r0 = r6 instanceof io.netty.handler.codec.DefaultHeaders
            if (r0 == 0) goto L38
            io.netty.handler.codec.DefaultHeaders r6 = (io.netty.handler.codec.DefaultHeaders) r6
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r6.head
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r0.after
            io.netty.util.HashingStrategy<K> r1 = r6.hashingStrategy
            io.netty.util.HashingStrategy<K> r2 = r5.hashingStrategy
            if (r1 != r2) goto L2a
            io.netty.handler.codec.DefaultHeaders$NameValidator<K> r1 = r6.nameValidator
            io.netty.handler.codec.DefaultHeaders$NameValidator<K> r2 = r5.nameValidator
            if (r1 != r2) goto L2a
        L16:
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r6.head
            if (r0 == r1) goto L54
            int r1 = r0.hash
            int r2 = r5.index(r1)
            K r3 = r0.key
            V r4 = r0.value
            r5.add0(r1, r2, r3, r4)
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r0.after
            goto L16
        L2a:
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r6.head
            if (r0 == r1) goto L54
            K r1 = r0.key
            V r2 = r0.value
            r5.add(r1, r2)
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r0.after
            goto L2a
        L38:
            java.util.Iterator r6 = r6.iterator()
        L3c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L54
            java.lang.Object r0 = r6.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Object r0 = r0.getValue()
            r5.add(r1, r0)
            goto L3c
        L54:
            return
    }

    @Override // io.netty.handler.codec.Headers
    public T addInt(K r2, int r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertInt(r3)
            io.netty.handler.codec.Headers r2 = r1.add(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T addLong(K r2, long r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertLong(r3)
            io.netty.handler.codec.Headers r2 = r1.add(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T addObject(K r2, java.lang.Iterable<?> r3) {
            r1 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L12
            java.lang.Object r0 = r3.next()
            r1.addObject(r2, r0)
            goto L4
        L12:
            io.netty.handler.codec.Headers r2 = r1.thisT()
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T addObject(K r3, java.lang.Object r4) {
            r2 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r2.valueConverter
            java.lang.String r1 = "value"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r1)
            java.lang.Object r4 = r0.convertObject(r4)
            io.netty.handler.codec.Headers r3 = r2.add(r3, r4)
            return r3
    }

    @Override // io.netty.handler.codec.Headers
    public T addObject(K r4, java.lang.Object... r5) {
            r3 = this;
            int r0 = r5.length
            r1 = 0
        L2:
            if (r1 >= r0) goto Lc
            r2 = r5[r1]
            r3.addObject(r4, r2)
            int r1 = r1 + 1
            goto L2
        Lc:
            io.netty.handler.codec.Headers r4 = r3.thisT()
            return r4
    }

    @Override // io.netty.handler.codec.Headers
    public T addShort(K r2, short r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertShort(r3)
            io.netty.handler.codec.Headers r2 = r1.add(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T addTimeMillis(K r2, long r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertTimeMillis(r3)
            io.netty.handler.codec.Headers r2 = r1.add(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T clear() {
            r2 = this;
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V>[] r0 = r2.entries
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r2.head
            r0.after = r0
            r0.before = r0
            r0 = 0
            r2.size = r0
            io.netty.handler.codec.Headers r0 = r2.thisT()
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public boolean contains(K r1) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public boolean contains(K r2, V r3) {
            r1 = this;
            io.netty.util.HashingStrategy r0 = io.netty.util.HashingStrategy.JAVA_HASHER
            boolean r2 = r1.contains(r2, r3, r0)
            return r2
    }

    public final boolean contains(K r5, V r6, io.netty.util.HashingStrategy<? super V> r7) {
            r4 = this;
            java.lang.String r0 = "name"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            io.netty.util.HashingStrategy<K> r0 = r4.hashingStrategy
            int r0 = r0.hashCode(r5)
            int r1 = r4.index(r0)
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V>[] r2 = r4.entries
            r1 = r2[r1]
        L13:
            if (r1 == 0) goto L30
            int r2 = r1.hash
            if (r2 != r0) goto L2d
            io.netty.util.HashingStrategy<K> r2 = r4.hashingStrategy
            K r3 = r1.key
            boolean r2 = r2.equals(r5, r3)
            if (r2 == 0) goto L2d
            V r2 = r1.value
            boolean r2 = r7.equals(r6, r2)
            if (r2 == 0) goto L2d
            r5 = 1
            return r5
        L2d:
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r1.next
            goto L13
        L30:
            r5 = 0
            return r5
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsBoolean(K r2, boolean r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertBoolean(r3)
            boolean r2 = r1.contains(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsByte(K r2, byte r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertByte(r3)
            boolean r2 = r1.contains(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsChar(K r2, char r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertChar(r3)
            boolean r2 = r1.contains(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsDouble(K r2, double r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertDouble(r3)
            boolean r2 = r1.contains(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsFloat(K r2, float r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertFloat(r3)
            boolean r2 = r1.contains(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsInt(K r2, int r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertInt(r3)
            boolean r2 = r1.contains(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsLong(K r2, long r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertLong(r3)
            boolean r2 = r1.contains(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsObject(K r3, java.lang.Object r4) {
            r2 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r2.valueConverter
            java.lang.String r1 = "value"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r1)
            java.lang.Object r4 = r0.convertObject(r4)
            boolean r3 = r2.contains(r3, r4)
            return r3
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsShort(K r2, short r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertShort(r3)
            boolean r2 = r1.contains(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public boolean containsTimeMillis(K r2, long r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertTimeMillis(r3)
            boolean r2 = r1.contains(r2, r3)
            return r2
    }

    public io.netty.handler.codec.DefaultHeaders<K, V, T> copy() {
            r5 = this;
            io.netty.handler.codec.DefaultHeaders r0 = new io.netty.handler.codec.DefaultHeaders
            io.netty.util.HashingStrategy<K> r1 = r5.hashingStrategy
            io.netty.handler.codec.ValueConverter<V> r2 = r5.valueConverter
            io.netty.handler.codec.DefaultHeaders$NameValidator<K> r3 = r5.nameValidator
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V>[] r4 = r5.entries
            int r4 = r4.length
            r0.<init>(r1, r2, r3, r4)
            r0.addImpl(r5)
            return r0
    }

    public final boolean equals(io.netty.handler.codec.Headers<K, V, ?> r9, io.netty.util.HashingStrategy<V> r10) {
            r8 = this;
            int r0 = r9.size()
            int r1 = r8.size()
            r2 = 0
            if (r0 == r1) goto Lc
            return r2
        Lc:
            r0 = 1
            if (r8 != r9) goto L10
            return r0
        L10:
            java.util.Set r1 = r8.names()
            java.util.Iterator r1 = r1.iterator()
        L18:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L4e
            java.lang.Object r3 = r1.next()
            java.util.List r4 = r9.getAll(r3)
            java.util.List r3 = r8.getAll(r3)
            int r5 = r4.size()
            int r6 = r3.size()
            if (r5 == r6) goto L35
            return r2
        L35:
            r5 = 0
        L36:
            int r6 = r4.size()
            if (r5 >= r6) goto L18
            java.lang.Object r6 = r4.get(r5)
            java.lang.Object r7 = r3.get(r5)
            boolean r6 = r10.equals(r6, r7)
            if (r6 != 0) goto L4b
            return r2
        L4b:
            int r5 = r5 + 1
            goto L36
        L4e:
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof io.netty.handler.codec.Headers
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            io.netty.handler.codec.Headers r2 = (io.netty.handler.codec.Headers) r2
            io.netty.util.HashingStrategy r0 = io.netty.util.HashingStrategy.JAVA_HASHER
            boolean r2 = r1.equals(r2, r0)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public V get(K r6) {
            r5 = this;
            java.lang.String r0 = "name"
            io.netty.util.internal.ObjectUtil.checkNotNull(r6, r0)
            io.netty.util.HashingStrategy<K> r0 = r5.hashingStrategy
            int r0 = r0.hashCode(r6)
            int r1 = r5.index(r0)
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V>[] r2 = r5.entries
            r1 = r2[r1]
            r2 = 0
        L14:
            if (r1 == 0) goto L29
            int r3 = r1.hash
            if (r3 != r0) goto L26
            io.netty.util.HashingStrategy<K> r3 = r5.hashingStrategy
            K r4 = r1.key
            boolean r3 = r3.equals(r6, r4)
            if (r3 == 0) goto L26
            V r2 = r1.value
        L26:
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r1.next
            goto L14
        L29:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public V get(K r1, V r2) {
            r0 = this;
            java.lang.Object r1 = r0.get(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public java.util.List<V> getAll(K r6) {
            r5 = this;
            java.lang.String r0 = "name"
            io.netty.util.internal.ObjectUtil.checkNotNull(r6, r0)
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            io.netty.util.HashingStrategy<K> r1 = r5.hashingStrategy
            int r1 = r1.hashCode(r6)
            int r2 = r5.index(r1)
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V>[] r3 = r5.entries
            r2 = r3[r2]
        L18:
            if (r2 == 0) goto L32
            int r3 = r2.hash
            if (r3 != r1) goto L2f
            io.netty.util.HashingStrategy<K> r3 = r5.hashingStrategy
            K r4 = r2.key
            boolean r3 = r3.equals(r6, r4)
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.getValue()
            r0.addFirst(r3)
        L2f:
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r2 = r2.next
            goto L18
        L32:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public java.util.List<V> getAllAndRemove(K r2) {
            r1 = this;
            java.util.List r0 = r1.getAll(r2)
            r1.remove(r2)
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public V getAndRemove(K r4) {
            r3 = this;
            io.netty.util.HashingStrategy<K> r0 = r3.hashingStrategy
            int r0 = r0.hashCode(r4)
            int r1 = r3.index(r0)
            java.lang.String r2 = "name"
            java.lang.Object r4 = io.netty.util.internal.ObjectUtil.checkNotNull(r4, r2)
            java.lang.Object r4 = r3.remove0(r0, r1, r4)
            return r4
    }

    @Override // io.netty.handler.codec.Headers
    public V getAndRemove(K r1, V r2) {
            r0 = this;
            java.lang.Object r1 = r0.getAndRemove(r1)
            if (r1 != 0) goto L7
            return r2
        L7:
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Boolean getBoolean(K r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r2.valueConverter     // Catch: java.lang.RuntimeException -> L12
            boolean r3 = r1.convertToBoolean(r3)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.RuntimeException -> L12
            return r3
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public boolean getBoolean(K r1, boolean r2) {
            r0 = this;
            java.lang.Boolean r1 = r0.getBoolean(r1)
            if (r1 == 0) goto Lb
            boolean r1 = r1.booleanValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Boolean getBooleanAndRemove(K r3) {
            r2 = this;
            java.lang.Object r3 = r2.getAndRemove(r3)
            r0 = 0
            if (r3 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r2.valueConverter     // Catch: java.lang.RuntimeException -> L12
            boolean r3 = r1.convertToBoolean(r3)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.RuntimeException -> L12
            return r3
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public boolean getBooleanAndRemove(K r1, boolean r2) {
            r0 = this;
            java.lang.Boolean r1 = r0.getBooleanAndRemove(r1)
            if (r1 == 0) goto Lb
            boolean r1 = r1.booleanValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public byte getByte(K r1, byte r2) {
            r0 = this;
            java.lang.Byte r1 = r0.getByte(r1)
            if (r1 == 0) goto Lb
            byte r1 = r1.byteValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Byte getByte(K r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r2.valueConverter     // Catch: java.lang.RuntimeException -> L12
            byte r3 = r1.convertToByte(r3)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)     // Catch: java.lang.RuntimeException -> L12
            return r3
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public byte getByteAndRemove(K r1, byte r2) {
            r0 = this;
            java.lang.Byte r1 = r0.getByteAndRemove(r1)
            if (r1 == 0) goto Lb
            byte r1 = r1.byteValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Byte getByteAndRemove(K r3) {
            r2 = this;
            java.lang.Object r3 = r2.getAndRemove(r3)
            r0 = 0
            if (r3 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r2.valueConverter     // Catch: java.lang.RuntimeException -> L12
            byte r3 = r1.convertToByte(r3)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)     // Catch: java.lang.RuntimeException -> L12
            return r3
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public char getChar(K r1, char r2) {
            r0 = this;
            java.lang.Character r1 = r0.getChar(r1)
            if (r1 == 0) goto Lb
            char r1 = r1.charValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Character getChar(K r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r2.valueConverter     // Catch: java.lang.RuntimeException -> L12
            char r3 = r1.convertToChar(r3)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Character r3 = java.lang.Character.valueOf(r3)     // Catch: java.lang.RuntimeException -> L12
            return r3
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public char getCharAndRemove(K r1, char r2) {
            r0 = this;
            java.lang.Character r1 = r0.getCharAndRemove(r1)
            if (r1 == 0) goto Lb
            char r1 = r1.charValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Character getCharAndRemove(K r3) {
            r2 = this;
            java.lang.Object r3 = r2.getAndRemove(r3)
            r0 = 0
            if (r3 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r2.valueConverter     // Catch: java.lang.RuntimeException -> L12
            char r3 = r1.convertToChar(r3)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Character r3 = java.lang.Character.valueOf(r3)     // Catch: java.lang.RuntimeException -> L12
            return r3
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public double getDouble(K r1, double r2) {
            r0 = this;
            java.lang.Double r1 = r0.getDouble(r1)
            if (r1 == 0) goto Lb
            double r1 = r1.doubleValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Double getDouble(K r4) {
            r3 = this;
            java.lang.Object r4 = r3.get(r4)
            r0 = 0
            if (r4 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r3.valueConverter     // Catch: java.lang.RuntimeException -> L12
            double r1 = r1.convertToDouble(r4)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Double r4 = java.lang.Double.valueOf(r1)     // Catch: java.lang.RuntimeException -> L12
            return r4
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public double getDoubleAndRemove(K r1, double r2) {
            r0 = this;
            java.lang.Double r1 = r0.getDoubleAndRemove(r1)
            if (r1 == 0) goto Lb
            double r1 = r1.doubleValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Double getDoubleAndRemove(K r4) {
            r3 = this;
            java.lang.Object r4 = r3.getAndRemove(r4)
            r0 = 0
            if (r4 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r3.valueConverter     // Catch: java.lang.RuntimeException -> L12
            double r1 = r1.convertToDouble(r4)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Double r4 = java.lang.Double.valueOf(r1)     // Catch: java.lang.RuntimeException -> L12
            return r4
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public float getFloat(K r1, float r2) {
            r0 = this;
            java.lang.Float r1 = r0.getFloat(r1)
            if (r1 == 0) goto Lb
            float r1 = r1.floatValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Float getFloat(K r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r2.valueConverter     // Catch: java.lang.RuntimeException -> L12
            float r3 = r1.convertToFloat(r3)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.RuntimeException -> L12
            return r3
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public float getFloatAndRemove(K r1, float r2) {
            r0 = this;
            java.lang.Float r1 = r0.getFloatAndRemove(r1)
            if (r1 == 0) goto Lb
            float r1 = r1.floatValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Float getFloatAndRemove(K r3) {
            r2 = this;
            java.lang.Object r3 = r2.getAndRemove(r3)
            r0 = 0
            if (r3 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r2.valueConverter     // Catch: java.lang.RuntimeException -> L12
            float r3 = r1.convertToFloat(r3)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Float r3 = java.lang.Float.valueOf(r3)     // Catch: java.lang.RuntimeException -> L12
            return r3
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public int getInt(K r1, int r2) {
            r0 = this;
            java.lang.Integer r1 = r0.getInt(r1)
            if (r1 == 0) goto Lb
            int r1 = r1.intValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Integer getInt(K r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r2.valueConverter     // Catch: java.lang.RuntimeException -> L12
            int r3 = r1.convertToInt(r3)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.RuntimeException -> L12
            return r3
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public int getIntAndRemove(K r1, int r2) {
            r0 = this;
            java.lang.Integer r1 = r0.getIntAndRemove(r1)
            if (r1 == 0) goto Lb
            int r1 = r1.intValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Integer getIntAndRemove(K r3) {
            r2 = this;
            java.lang.Object r3 = r2.getAndRemove(r3)
            r0 = 0
            if (r3 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r2.valueConverter     // Catch: java.lang.RuntimeException -> L12
            int r3 = r1.convertToInt(r3)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.RuntimeException -> L12
            return r3
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public long getLong(K r1, long r2) {
            r0 = this;
            java.lang.Long r1 = r0.getLong(r1)
            if (r1 == 0) goto Lb
            long r1 = r1.longValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Long getLong(K r4) {
            r3 = this;
            java.lang.Object r4 = r3.get(r4)
            r0 = 0
            if (r4 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r3.valueConverter     // Catch: java.lang.RuntimeException -> L12
            long r1 = r1.convertToLong(r4)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.RuntimeException -> L12
            return r4
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public long getLongAndRemove(K r1, long r2) {
            r0 = this;
            java.lang.Long r1 = r0.getLongAndRemove(r1)
            if (r1 == 0) goto Lb
            long r1 = r1.longValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Long getLongAndRemove(K r4) {
            r3 = this;
            java.lang.Object r4 = r3.getAndRemove(r4)
            r0 = 0
            if (r4 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r3.valueConverter     // Catch: java.lang.RuntimeException -> L12
            long r1 = r1.convertToLong(r4)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.RuntimeException -> L12
            return r4
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Short getShort(K r3) {
            r2 = this;
            java.lang.Object r3 = r2.get(r3)
            r0 = 0
            if (r3 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r2.valueConverter     // Catch: java.lang.RuntimeException -> L12
            short r3 = r1.convertToShort(r3)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Short r3 = java.lang.Short.valueOf(r3)     // Catch: java.lang.RuntimeException -> L12
            return r3
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public short getShort(K r1, short r2) {
            r0 = this;
            java.lang.Short r1 = r0.getShort(r1)
            if (r1 == 0) goto Lb
            short r1 = r1.shortValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Short getShortAndRemove(K r3) {
            r2 = this;
            java.lang.Object r3 = r2.getAndRemove(r3)
            r0 = 0
            if (r3 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r2.valueConverter     // Catch: java.lang.RuntimeException -> L12
            short r3 = r1.convertToShort(r3)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Short r3 = java.lang.Short.valueOf(r3)     // Catch: java.lang.RuntimeException -> L12
            return r3
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public short getShortAndRemove(K r1, short r2) {
            r0 = this;
            java.lang.Short r1 = r0.getShortAndRemove(r1)
            if (r1 == 0) goto Lb
            short r1 = r1.shortValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public long getTimeMillis(K r1, long r2) {
            r0 = this;
            java.lang.Long r1 = r0.getTimeMillis(r1)
            if (r1 == 0) goto Lb
            long r1 = r1.longValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Long getTimeMillis(K r4) {
            r3 = this;
            java.lang.Object r4 = r3.get(r4)
            r0 = 0
            if (r4 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r3.valueConverter     // Catch: java.lang.RuntimeException -> L12
            long r1 = r1.convertToTimeMillis(r4)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.RuntimeException -> L12
            return r4
        L12:
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public long getTimeMillisAndRemove(K r1, long r2) {
            r0 = this;
            java.lang.Long r1 = r0.getTimeMillisAndRemove(r1)
            if (r1 == 0) goto Lb
            long r1 = r1.longValue()
            return r1
        Lb:
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public java.lang.Long getTimeMillisAndRemove(K r4) {
            r3 = this;
            java.lang.Object r4 = r3.getAndRemove(r4)
            r0 = 0
            if (r4 == 0) goto L12
            io.netty.handler.codec.ValueConverter<V> r1 = r3.valueConverter     // Catch: java.lang.RuntimeException -> L12
            long r1 = r1.convertToTimeMillis(r4)     // Catch: java.lang.RuntimeException -> L12
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch: java.lang.RuntimeException -> L12
            return r4
        L12:
            return r0
    }

    public int hashCode() {
            r1 = this;
            io.netty.util.HashingStrategy r0 = io.netty.util.HashingStrategy.JAVA_HASHER
            int r0 = r1.hashCode(r0)
            return r0
    }

    public final int hashCode(io.netty.util.HashingStrategy<V> r6) {
            r5 = this;
            java.util.Set r0 = r5.names()
            java.util.Iterator r0 = r0.iterator()
            r1 = -1028477387(0xffffffffc2b2ae35, float:-89.34025)
        Lb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L37
            java.lang.Object r2 = r0.next()
            int r1 = r1 * 31
            io.netty.util.HashingStrategy<K> r3 = r5.hashingStrategy
            int r3 = r3.hashCode(r2)
            int r1 = r1 + r3
            java.util.List r2 = r5.getAll(r2)
            r3 = 0
        L23:
            int r4 = r2.size()
            if (r3 >= r4) goto Lb
            int r1 = r1 * 31
            java.lang.Object r4 = r2.get(r3)
            int r4 = r6.hashCode(r4)
            int r1 = r1 + r4
            int r3 = r3 + 1
            goto L23
        L37:
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public boolean isEmpty() {
            r2 = this;
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r0 = r2.head
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r0.after
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @Override // io.netty.handler.codec.Headers, java.lang.Iterable
    public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
            r2 = this;
            io.netty.handler.codec.DefaultHeaders$HeaderIterator r0 = new io.netty.handler.codec.DefaultHeaders$HeaderIterator
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public java.util.Set<K> names() {
            r3 = this;
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L9
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
        L9:
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            int r1 = r3.size()
            r0.<init>(r1)
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r3.head
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r1.after
        L16:
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r2 = r3.head
            if (r1 == r2) goto L24
            java.lang.Object r2 = r1.getKey()
            r0.add(r2)
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r1 = r1.after
            goto L16
        L24:
            return r0
    }

    protected io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> newHeaderEntry(int r7, K r8, V r9, io.netty.handler.codec.DefaultHeaders.HeaderEntry<K, V> r10) {
            r6 = this;
            io.netty.handler.codec.DefaultHeaders$HeaderEntry r0 = new io.netty.handler.codec.DefaultHeaders$HeaderEntry
            io.netty.handler.codec.DefaultHeaders$HeaderEntry<K, V> r5 = r6.head
            r1 = r7
            r2 = r8
            r3 = r9
            r4 = r10
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // io.netty.handler.codec.Headers
    public boolean remove(K r1) {
            r0 = this;
            java.lang.Object r1 = r0.getAndRemove(r1)
            if (r1 == 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public T set(io.netty.handler.codec.Headers<? extends K, ? extends V, ?> r1) {
            r0 = this;
            if (r1 == r0) goto L8
            r0.clear()
            r0.addImpl(r1)
        L8:
            io.netty.handler.codec.Headers r1 = r0.thisT()
            return r1
    }

    @Override // io.netty.handler.codec.Headers
    public T set(K r4, java.lang.Iterable<? extends V> r5) {
            r3 = this;
            io.netty.handler.codec.DefaultHeaders$NameValidator<K> r0 = r3.nameValidator
            r0.validateName(r4)
            java.lang.String r0 = "values"
            io.netty.util.internal.ObjectUtil.checkNotNull(r5, r0)
            io.netty.util.HashingStrategy<K> r0 = r3.hashingStrategy
            int r0 = r0.hashCode(r4)
            int r1 = r3.index(r0)
            r3.remove0(r0, r1, r4)
            java.util.Iterator r5 = r5.iterator()
        L1b:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L2c
            java.lang.Object r2 = r5.next()
            if (r2 != 0) goto L28
            goto L2c
        L28:
            r3.add0(r0, r1, r4, r2)
            goto L1b
        L2c:
            io.netty.handler.codec.Headers r4 = r3.thisT()
            return r4
    }

    @Override // io.netty.handler.codec.Headers
    public T set(K r3, V r4) {
            r2 = this;
            io.netty.handler.codec.DefaultHeaders$NameValidator<K> r0 = r2.nameValidator
            r0.validateName(r3)
            java.lang.String r0 = "value"
            io.netty.util.internal.ObjectUtil.checkNotNull(r4, r0)
            io.netty.util.HashingStrategy<K> r0 = r2.hashingStrategy
            int r0 = r0.hashCode(r3)
            int r1 = r2.index(r0)
            r2.remove0(r0, r1, r3)
            r2.add0(r0, r1, r3, r4)
            io.netty.handler.codec.Headers r3 = r2.thisT()
            return r3
    }

    @Override // io.netty.handler.codec.Headers
    public T set(K r6, V... r7) {
            r5 = this;
            io.netty.handler.codec.DefaultHeaders$NameValidator<K> r0 = r5.nameValidator
            r0.validateName(r6)
            java.lang.String r0 = "values"
            io.netty.util.internal.ObjectUtil.checkNotNull(r7, r0)
            io.netty.util.HashingStrategy<K> r0 = r5.hashingStrategy
            int r0 = r0.hashCode(r6)
            int r1 = r5.index(r0)
            r5.remove0(r0, r1, r6)
            int r2 = r7.length
            r3 = 0
        L19:
            if (r3 >= r2) goto L26
            r4 = r7[r3]
            if (r4 != 0) goto L20
            goto L26
        L20:
            r5.add0(r0, r1, r6, r4)
            int r3 = r3 + 1
            goto L19
        L26:
            io.netty.handler.codec.Headers r6 = r5.thisT()
            return r6
    }

    @Override // io.netty.handler.codec.Headers
    public T setAll(io.netty.handler.codec.Headers<? extends K, ? extends V, ?> r3) {
            r2 = this;
            if (r3 == r2) goto L1b
            java.util.Set r0 = r3.names()
            java.util.Iterator r0 = r0.iterator()
        La:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L18
            java.lang.Object r1 = r0.next()
            r2.remove(r1)
            goto La
        L18:
            r2.addImpl(r3)
        L1b:
            io.netty.handler.codec.Headers r3 = r2.thisT()
            return r3
    }

    @Override // io.netty.handler.codec.Headers
    public T setBoolean(K r2, boolean r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertBoolean(r3)
            io.netty.handler.codec.Headers r2 = r1.set(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T setByte(K r2, byte r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertByte(r3)
            io.netty.handler.codec.Headers r2 = r1.set(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T setChar(K r2, char r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertChar(r3)
            io.netty.handler.codec.Headers r2 = r1.set(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T setDouble(K r2, double r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertDouble(r3)
            io.netty.handler.codec.Headers r2 = r1.set(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T setFloat(K r2, float r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertFloat(r3)
            io.netty.handler.codec.Headers r2 = r1.set(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T setInt(K r2, int r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertInt(r3)
            io.netty.handler.codec.Headers r2 = r1.set(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T setLong(K r2, long r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertLong(r3)
            io.netty.handler.codec.Headers r2 = r1.set(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T setObject(K r5, java.lang.Iterable<?> r6) {
            r4 = this;
            io.netty.handler.codec.DefaultHeaders$NameValidator<K> r0 = r4.nameValidator
            r0.validateName(r5)
            io.netty.util.HashingStrategy<K> r0 = r4.hashingStrategy
            int r0 = r0.hashCode(r5)
            int r1 = r4.index(r0)
            r4.remove0(r0, r1, r5)
            java.util.Iterator r6 = r6.iterator()
        L16:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L2d
            java.lang.Object r2 = r6.next()
            if (r2 != 0) goto L23
            goto L2d
        L23:
            io.netty.handler.codec.ValueConverter<V> r3 = r4.valueConverter
            java.lang.Object r2 = r3.convertObject(r2)
            r4.add0(r0, r1, r5, r2)
            goto L16
        L2d:
            io.netty.handler.codec.Headers r5 = r4.thisT()
            return r5
    }

    @Override // io.netty.handler.codec.Headers
    public T setObject(K r2, java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "value"
            io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertObject(r3)
            java.lang.String r0 = "convertedValue"
            java.lang.Object r3 = io.netty.util.internal.ObjectUtil.checkNotNull(r3, r0)
            io.netty.handler.codec.Headers r2 = r1.set(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T setObject(K r7, java.lang.Object... r8) {
            r6 = this;
            io.netty.handler.codec.DefaultHeaders$NameValidator<K> r0 = r6.nameValidator
            r0.validateName(r7)
            io.netty.util.HashingStrategy<K> r0 = r6.hashingStrategy
            int r0 = r0.hashCode(r7)
            int r1 = r6.index(r0)
            r6.remove0(r0, r1, r7)
            int r2 = r8.length
            r3 = 0
        L14:
            if (r3 >= r2) goto L27
            r4 = r8[r3]
            if (r4 != 0) goto L1b
            goto L27
        L1b:
            io.netty.handler.codec.ValueConverter<V> r5 = r6.valueConverter
            java.lang.Object r4 = r5.convertObject(r4)
            r6.add0(r0, r1, r7, r4)
            int r3 = r3 + 1
            goto L14
        L27:
            io.netty.handler.codec.Headers r7 = r6.thisT()
            return r7
    }

    @Override // io.netty.handler.codec.Headers
    public T setShort(K r2, short r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertShort(r3)
            io.netty.handler.codec.Headers r2 = r1.set(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public T setTimeMillis(K r2, long r3) {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            java.lang.Object r3 = r0.convertTimeMillis(r3)
            io.netty.handler.codec.Headers r2 = r1.set(r2, r3)
            return r2
    }

    @Override // io.netty.handler.codec.Headers
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            java.lang.Class r0 = r3.getClass()
            java.util.Iterator r1 = r3.iterator()
            int r2 = r3.size()
            java.lang.String r0 = io.netty.handler.codec.HeadersUtils.toString(r0, r1, r2)
            return r0
    }

    protected io.netty.handler.codec.ValueConverter<V> valueConverter() {
            r1 = this;
            io.netty.handler.codec.ValueConverter<V> r0 = r1.valueConverter
            return r0
    }

    public java.util.Iterator<V> valueIterator(K r2) {
            r1 = this;
            io.netty.handler.codec.DefaultHeaders$ValueIterator r0 = new io.netty.handler.codec.DefaultHeaders$ValueIterator
            r0.<init>(r1, r2)
            return r0
    }
}

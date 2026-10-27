package io.netty.util.collection;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class ByteObjectHashMap<V> implements io.netty.util.collection.ByteObjectMap<V> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int DEFAULT_CAPACITY = 8;
    public static final float DEFAULT_LOAD_FACTOR = 0.5f;
    private static final java.lang.Object NULL_VALUE = null;
    private final java.lang.Iterable<io.netty.util.collection.ByteObjectMap.PrimitiveEntry<V>> entries;
    private final java.util.Set<java.util.Map.Entry<java.lang.Byte, V>> entrySet;
    private final java.util.Set<java.lang.Byte> keySet;
    private byte[] keys;
    private final float loadFactor;
    private int mask;
    private int maxSize;
    private int size;
    private V[] values;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class EntrySet extends java.util.AbstractSet<java.util.Map.Entry<java.lang.Byte, V>> {
        final /* synthetic */ io.netty.util.collection.ByteObjectHashMap this$0;

        private EntrySet(io.netty.util.collection.ByteObjectHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ EntrySet(io.netty.util.collection.ByteObjectHashMap r1, io.netty.util.collection.ByteObjectHashMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<java.lang.Byte, V>> iterator() {
                r3 = this;
                io.netty.util.collection.ByteObjectHashMap$MapIterator r0 = new io.netty.util.collection.ByteObjectHashMap$MapIterator
                io.netty.util.collection.ByteObjectHashMap r1 = r3.this$0
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                io.netty.util.collection.ByteObjectHashMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class KeySet extends java.util.AbstractSet<java.lang.Byte> {
        final /* synthetic */ io.netty.util.collection.ByteObjectHashMap this$0;


        private KeySet(io.netty.util.collection.ByteObjectHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        /* synthetic */ KeySet(io.netty.util.collection.ByteObjectHashMap r1, io.netty.util.collection.ByteObjectHashMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                io.netty.util.collection.ByteObjectHashMap r0 = r1.this$0
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                io.netty.util.collection.ByteObjectHashMap r0 = r1.this$0
                boolean r2 = r0.containsKey(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.lang.Byte> iterator() {
                r1 = this;
                io.netty.util.collection.ByteObjectHashMap$KeySet$1 r0 = new io.netty.util.collection.ByteObjectHashMap$KeySet$1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                io.netty.util.collection.ByteObjectHashMap r0 = r1.this$0
                java.lang.Object r2 = r0.remove(r2)
                if (r2 == 0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(java.util.Collection<?> r4) {
                r3 = this;
                io.netty.util.collection.ByteObjectHashMap r0 = r3.this$0
                java.lang.Iterable r0 = r0.entries()
                java.util.Iterator r0 = r0.iterator()
                r1 = 0
            Lb:
                boolean r2 = r0.hasNext()
                if (r2 == 0) goto L2a
                java.lang.Object r2 = r0.next()
                io.netty.util.collection.ByteObjectMap$PrimitiveEntry r2 = (io.netty.util.collection.ByteObjectMap.PrimitiveEntry) r2
                byte r2 = r2.key()
                java.lang.Byte r2 = java.lang.Byte.valueOf(r2)
                boolean r2 = r4.contains(r2)
                if (r2 != 0) goto Lb
                r0.remove()
                r1 = 1
                goto Lb
            L2a:
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                io.netty.util.collection.ByteObjectHashMap r0 = r1.this$0
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    final class MapEntry implements java.util.Map.Entry<java.lang.Byte, V> {
        private final int entryIndex;
        final /* synthetic */ io.netty.util.collection.ByteObjectHashMap this$0;

        MapEntry(io.netty.util.collection.ByteObjectHashMap r1, int r2) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.entryIndex = r2
                return
        }

        private void verifyExists() {
                r2 = this;
                io.netty.util.collection.ByteObjectHashMap r0 = r2.this$0
                java.lang.Object[] r0 = io.netty.util.collection.ByteObjectHashMap.access$600(r0)
                int r1 = r2.entryIndex
                r0 = r0[r1]
                if (r0 == 0) goto Ld
                return
            Ld:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "The map entry has been removed"
                r0.<init>(r1)
                throw r0
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.Map.Entry
        public java.lang.Byte getKey() {
                r2 = this;
                r2.verifyExists()
                io.netty.util.collection.ByteObjectHashMap r0 = r2.this$0
                byte[] r0 = io.netty.util.collection.ByteObjectHashMap.access$800(r0)
                int r1 = r2.entryIndex
                r0 = r0[r1]
                java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
                return r0
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.Byte getKey() {
                r1 = this;
                java.lang.Byte r0 = r1.getKey()
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r2 = this;
                r2.verifyExists()
                io.netty.util.collection.ByteObjectHashMap r0 = r2.this$0
                java.lang.Object[] r0 = io.netty.util.collection.ByteObjectHashMap.access$600(r0)
                int r1 = r2.entryIndex
                r0 = r0[r1]
                java.lang.Object r0 = io.netty.util.collection.ByteObjectHashMap.access$900(r0)
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r4) {
                r3 = this;
                r3.verifyExists()
                io.netty.util.collection.ByteObjectHashMap r0 = r3.this$0
                java.lang.Object[] r0 = io.netty.util.collection.ByteObjectHashMap.access$600(r0)
                int r1 = r3.entryIndex
                r0 = r0[r1]
                java.lang.Object r0 = io.netty.util.collection.ByteObjectHashMap.access$900(r0)
                io.netty.util.collection.ByteObjectHashMap r1 = r3.this$0
                java.lang.Object[] r1 = io.netty.util.collection.ByteObjectHashMap.access$600(r1)
                int r2 = r3.entryIndex
                java.lang.Object r4 = io.netty.util.collection.ByteObjectHashMap.access$1000(r4)
                r1[r2] = r4
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class MapIterator implements java.util.Iterator<java.util.Map.Entry<java.lang.Byte, V>> {
        private final io.netty.util.collection.ByteObjectHashMap<V>.PrimitiveIterator iter;
        final /* synthetic */ io.netty.util.collection.ByteObjectHashMap this$0;

        private MapIterator(io.netty.util.collection.ByteObjectHashMap r3) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>()
                io.netty.util.collection.ByteObjectHashMap$PrimitiveIterator r0 = new io.netty.util.collection.ByteObjectHashMap$PrimitiveIterator
                r1 = 0
                r0.<init>(r3, r1)
                r2.iter = r0
                return
        }

        /* synthetic */ MapIterator(io.netty.util.collection.ByteObjectHashMap r1, io.netty.util.collection.ByteObjectHashMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                io.netty.util.collection.ByteObjectHashMap<V>$PrimitiveIterator r0 = r1.iter
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public java.util.Map.Entry<java.lang.Byte, V> next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L19
                io.netty.util.collection.ByteObjectHashMap<V>$PrimitiveIterator r0 = r3.iter
                r0.next()
                io.netty.util.collection.ByteObjectHashMap$MapEntry r0 = new io.netty.util.collection.ByteObjectHashMap$MapEntry
                io.netty.util.collection.ByteObjectHashMap r1 = r3.this$0
                io.netty.util.collection.ByteObjectHashMap<V>$PrimitiveIterator r2 = r3.iter
                int r2 = io.netty.util.collection.ByteObjectHashMap.PrimitiveIterator.access$1100(r2)
                r0.<init>(r1, r2)
                return r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                io.netty.util.collection.ByteObjectHashMap<V>$PrimitiveIterator r0 = r1.iter
                r0.remove()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private final class PrimitiveIterator implements java.util.Iterator<io.netty.util.collection.ByteObjectMap.PrimitiveEntry<V>>, io.netty.util.collection.ByteObjectMap.PrimitiveEntry<V> {
        private int entryIndex;
        private int nextIndex;
        private int prevIndex;
        final /* synthetic */ io.netty.util.collection.ByteObjectHashMap this$0;

        private PrimitiveIterator(io.netty.util.collection.ByteObjectHashMap r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r1 = -1
                r0.prevIndex = r1
                r0.nextIndex = r1
                r0.entryIndex = r1
                return
        }

        /* synthetic */ PrimitiveIterator(io.netty.util.collection.ByteObjectHashMap r1, io.netty.util.collection.ByteObjectHashMap.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ int access$1100(io.netty.util.collection.ByteObjectHashMap.PrimitiveIterator r0) {
                int r0 = r0.entryIndex
                return r0
        }

        private void scanNext() {
                r2 = this;
            L0:
                int r0 = r2.nextIndex
                int r0 = r0 + 1
                r2.nextIndex = r0
                io.netty.util.collection.ByteObjectHashMap r1 = r2.this$0
                java.lang.Object[] r1 = io.netty.util.collection.ByteObjectHashMap.access$600(r1)
                int r1 = r1.length
                if (r0 == r1) goto L1c
                io.netty.util.collection.ByteObjectHashMap r0 = r2.this$0
                java.lang.Object[] r0 = io.netty.util.collection.ByteObjectHashMap.access$600(r0)
                int r1 = r2.nextIndex
                r0 = r0[r1]
                if (r0 != 0) goto L1c
                goto L0
            L1c:
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.nextIndex
                r1 = -1
                if (r0 != r1) goto L8
                r2.scanNext()
            L8:
                int r0 = r2.nextIndex
                io.netty.util.collection.ByteObjectHashMap r1 = r2.this$0
                java.lang.Object[] r1 = io.netty.util.collection.ByteObjectHashMap.access$600(r1)
                int r1 = r1.length
                if (r0 == r1) goto L15
                r0 = 1
                return r0
            L15:
                r0 = 0
                return r0
        }

        @Override // io.netty.util.collection.ByteObjectMap.PrimitiveEntry
        public byte key() {
                r2 = this;
                io.netty.util.collection.ByteObjectHashMap r0 = r2.this$0
                byte[] r0 = io.netty.util.collection.ByteObjectHashMap.access$800(r0)
                int r1 = r2.entryIndex
                r0 = r0[r1]
                return r0
        }

        @Override // java.util.Iterator
        public io.netty.util.collection.ByteObjectMap.PrimitiveEntry<V> next() {
                r1 = this;
                boolean r0 = r1.hasNext()
                if (r0 == 0) goto L12
                int r0 = r1.nextIndex
                r1.prevIndex = r0
                r1.scanNext()
                int r0 = r1.prevIndex
                r1.entryIndex = r0
                return r1
            L12:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                io.netty.util.collection.ByteObjectMap$PrimitiveEntry r0 = r1.next()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                int r0 = r3.prevIndex
                r1 = -1
                if (r0 == r1) goto L14
                io.netty.util.collection.ByteObjectHashMap r2 = r3.this$0
                boolean r0 = io.netty.util.collection.ByteObjectHashMap.access$700(r2, r0)
                if (r0 == 0) goto L11
                int r0 = r3.prevIndex
                r3.nextIndex = r0
            L11:
                r3.prevIndex = r1
                return
            L14:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "next must be called before each remove."
                r0.<init>(r1)
                throw r0
        }

        @Override // io.netty.util.collection.ByteObjectMap.PrimitiveEntry
        public void setValue(V r3) {
                r2 = this;
                io.netty.util.collection.ByteObjectHashMap r0 = r2.this$0
                java.lang.Object[] r0 = io.netty.util.collection.ByteObjectHashMap.access$600(r0)
                int r1 = r2.entryIndex
                java.lang.Object r3 = io.netty.util.collection.ByteObjectHashMap.access$1000(r3)
                r0[r1] = r3
                return
        }

        @Override // io.netty.util.collection.ByteObjectMap.PrimitiveEntry
        public V value() {
                r2 = this;
                io.netty.util.collection.ByteObjectHashMap r0 = r2.this$0
                java.lang.Object[] r0 = io.netty.util.collection.ByteObjectHashMap.access$600(r0)
                int r1 = r2.entryIndex
                r0 = r0[r1]
                java.lang.Object r0 = io.netty.util.collection.ByteObjectHashMap.access$900(r0)
                return r0
        }
    }

    static {
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            io.netty.util.collection.ByteObjectHashMap.NULL_VALUE = r0
            return
    }

    public ByteObjectHashMap() {
            r2 = this;
            r0 = 8
            r1 = 1056964608(0x3f000000, float:0.5)
            r2.<init>(r0, r1)
            return
    }

    public ByteObjectHashMap(int r2) {
            r1 = this;
            r0 = 1056964608(0x3f000000, float:0.5)
            r1.<init>(r2, r0)
            return
    }

    public ByteObjectHashMap(int r3, float r4) {
            r2 = this;
            r2.<init>()
            io.netty.util.collection.ByteObjectHashMap$KeySet r0 = new io.netty.util.collection.ByteObjectHashMap$KeySet
            r1 = 0
            r0.<init>(r2, r1)
            r2.keySet = r0
            io.netty.util.collection.ByteObjectHashMap$EntrySet r0 = new io.netty.util.collection.ByteObjectHashMap$EntrySet
            r0.<init>(r2, r1)
            r2.entrySet = r0
            io.netty.util.collection.ByteObjectHashMap$1 r0 = new io.netty.util.collection.ByteObjectHashMap$1
            r0.<init>(r2)
            r2.entries = r0
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L3d
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 > 0) goto L3d
            r2.loadFactor = r4
            int r3 = io.netty.util.internal.MathUtil.safeFindNextPositivePowerOfTwo(r3)
            int r4 = r3 + (-1)
            r2.mask = r4
            byte[] r4 = new byte[r3]
            r2.keys = r4
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r2.values = r4
            int r3 = r2.calcMaxSize(r3)
            r2.maxSize = r3
            return
        L3d:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "loadFactor must be > 0 and <= 1"
            r3.<init>(r4)
            throw r3
    }

    static /* synthetic */ java.lang.Object access$1000(java.lang.Object r0) {
            java.lang.Object r0 = toInternal(r0)
            return r0
    }

    static /* synthetic */ int access$300(io.netty.util.collection.ByteObjectHashMap r0) {
            int r0 = r0.size
            return r0
    }

    static /* synthetic */ java.util.Set access$500(io.netty.util.collection.ByteObjectHashMap r0) {
            java.util.Set<java.util.Map$Entry<java.lang.Byte, V>> r0 = r0.entrySet
            return r0
    }

    static /* synthetic */ java.lang.Object[] access$600(io.netty.util.collection.ByteObjectHashMap r0) {
            V[] r0 = r0.values
            return r0
    }

    static /* synthetic */ boolean access$700(io.netty.util.collection.ByteObjectHashMap r0, int r1) {
            boolean r0 = r0.removeAt(r1)
            return r0
    }

    static /* synthetic */ byte[] access$800(io.netty.util.collection.ByteObjectHashMap r0) {
            byte[] r0 = r0.keys
            return r0
    }

    static /* synthetic */ java.lang.Object access$900(java.lang.Object r0) {
            java.lang.Object r0 = toExternal(r0)
            return r0
    }

    private int calcMaxSize(int r3) {
            r2 = this;
            int r0 = r3 + (-1)
            float r3 = (float) r3
            float r1 = r2.loadFactor
            float r3 = r3 * r1
            int r3 = (int) r3
            int r3 = java.lang.Math.min(r0, r3)
            return r3
    }

    private void growSize() {
            r3 = this;
            int r0 = r3.size
            int r0 = r0 + 1
            r3.size = r0
            int r1 = r3.maxSize
            if (r0 <= r1) goto L32
            byte[] r0 = r3.keys
            int r1 = r0.length
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r1 == r2) goto L19
            int r0 = r0.length
            int r0 = r0 << 1
            r3.rehash(r0)
            return
        L19:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Max capacity reached at size="
            r1.append(r2)
            int r2 = r3.size
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L32:
            return
    }

    private static int hashCode(byte r0) {
            return r0
    }

    private int hashIndex(byte r2) {
            r1 = this;
            int r2 = hashCode(r2)
            int r0 = r1.mask
            r2 = r2 & r0
            return r2
    }

    private int indexOf(byte r5) {
            r4 = this;
            int r0 = r4.hashIndex(r5)
            r1 = r0
        L5:
            V[] r2 = r4.values
            r2 = r2[r1]
            r3 = -1
            if (r2 != 0) goto Ld
            return r3
        Ld:
            byte[] r2 = r4.keys
            r2 = r2[r1]
            if (r5 != r2) goto L14
            return r1
        L14:
            int r1 = r4.probeNext(r1)
            if (r1 != r0) goto L5
            return r3
    }

    private byte objectToKey(java.lang.Object r1) {
            r0 = this;
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            return r1
    }

    private int probeNext(int r2) {
            r1 = this;
            int r2 = r2 + 1
            int r0 = r1.mask
            r2 = r2 & r0
            return r2
    }

    private void rehash(int r8) {
            r7 = this;
            byte[] r0 = r7.keys
            V[] r1 = r7.values
            byte[] r2 = new byte[r8]
            r7.keys = r2
            java.lang.Object[] r2 = new java.lang.Object[r8]
            r7.values = r2
            int r2 = r7.calcMaxSize(r8)
            r7.maxSize = r2
            int r8 = r8 + (-1)
            r7.mask = r8
            r8 = 0
        L17:
            int r2 = r1.length
            if (r8 >= r2) goto L39
            r2 = r1[r8]
            if (r2 == 0) goto L36
            r3 = r0[r8]
            int r4 = r7.hashIndex(r3)
        L24:
            V[] r5 = r7.values
            r6 = r5[r4]
            if (r6 != 0) goto L31
            byte[] r6 = r7.keys
            r6[r4] = r3
            r5[r4] = r2
            goto L36
        L31:
            int r4 = r7.probeNext(r4)
            goto L24
        L36:
            int r8 = r8 + 1
            goto L17
        L39:
            return
    }

    private boolean removeAt(int r9) {
            r8 = this;
            int r0 = r8.size
            r1 = 1
            int r0 = r0 - r1
            r8.size = r0
            byte[] r0 = r8.keys
            r2 = 0
            r0[r9] = r2
            V[] r0 = r8.values
            r3 = 0
            r0[r9] = r3
            int r0 = r8.probeNext(r9)
            V[] r4 = r8.values
            r4 = r4[r0]
            r5 = r9
        L19:
            if (r4 == 0) goto L43
            byte[] r6 = r8.keys
            r6 = r6[r0]
            int r7 = r8.hashIndex(r6)
            if (r0 >= r7) goto L29
            if (r7 <= r5) goto L2d
            if (r5 <= r0) goto L2d
        L29:
            if (r7 > r5) goto L3a
            if (r5 > r0) goto L3a
        L2d:
            byte[] r7 = r8.keys
            r7[r5] = r6
            V[] r6 = r8.values
            r6[r5] = r4
            r7[r0] = r2
            r6[r0] = r3
            r5 = r0
        L3a:
            V[] r4 = r8.values
            int r0 = r8.probeNext(r0)
            r4 = r4[r0]
            goto L19
        L43:
            if (r5 == r9) goto L46
            return r1
        L46:
            return r2
    }

    private static <T> T toExternal(T r1) {
            java.lang.Object r0 = io.netty.util.collection.ByteObjectHashMap.NULL_VALUE
            if (r1 != r0) goto L5
            r1 = 0
        L5:
            return r1
    }

    private static <T> T toInternal(T r0) {
            if (r0 != 0) goto L4
            java.lang.Object r0 = io.netty.util.collection.ByteObjectHashMap.NULL_VALUE
        L4:
            return r0
    }

    @Override // java.util.Map
    public void clear() {
            r3 = this;
            byte[] r0 = r3.keys
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            V[] r0 = r3.values
            r2 = 0
            java.util.Arrays.fill(r0, r2)
            r3.size = r1
            return
    }

    @Override // io.netty.util.collection.ByteObjectMap
    public boolean containsKey(byte r1) {
            r0 = this;
            int r1 = r0.indexOf(r1)
            if (r1 < 0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // java.util.Map
    public boolean containsKey(java.lang.Object r1) {
            r0 = this;
            byte r1 = r0.objectToKey(r1)
            boolean r1 = r0.containsKey(r1)
            return r1
    }

    @Override // java.util.Map
    public boolean containsValue(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r6 = toInternal(r6)
            V[] r0 = r5.values
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L9:
            if (r3 >= r1) goto L1a
            r4 = r0[r3]
            if (r4 == 0) goto L17
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L17
            r6 = 1
            return r6
        L17:
            int r3 = r3 + 1
            goto L9
        L1a:
            return r2
    }

    @Override // io.netty.util.collection.ByteObjectMap
    public java.lang.Iterable<io.netty.util.collection.ByteObjectMap.PrimitiveEntry<V>> entries() {
            r1 = this;
            java.lang.Iterable<io.netty.util.collection.ByteObjectMap$PrimitiveEntry<V>> r0 = r1.entries
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<java.util.Map.Entry<java.lang.Byte, V>> entrySet() {
            r1 = this;
            java.util.Set<java.util.Map$Entry<java.lang.Byte, V>> r0 = r1.entrySet
            return r0
    }

    @Override // java.util.Map
    public boolean equals(java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof io.netty.util.collection.ByteObjectMap
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            io.netty.util.collection.ByteObjectMap r7 = (io.netty.util.collection.ByteObjectMap) r7
            int r1 = r6.size
            int r3 = r7.size()
            if (r1 == r3) goto L15
            return r2
        L15:
            r1 = 0
        L16:
            V[] r3 = r6.values
            int r4 = r3.length
            if (r1 >= r4) goto L38
            r3 = r3[r1]
            if (r3 == 0) goto L35
            byte[] r4 = r6.keys
            r4 = r4[r1]
            java.lang.Object r4 = r7.get(r4)
            java.lang.Object r5 = io.netty.util.collection.ByteObjectHashMap.NULL_VALUE
            if (r3 != r5) goto L2e
            if (r4 == 0) goto L35
            return r2
        L2e:
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L35
            return r2
        L35:
            int r1 = r1 + 1
            goto L16
        L38:
            return r0
    }

    @Override // io.netty.util.collection.ByteObjectMap
    public V get(byte r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r2 = 0
            return r2
        L9:
            V[] r0 = r1.values
            r2 = r0[r2]
            java.lang.Object r2 = toExternal(r2)
            return r2
    }

    @Override // java.util.Map
    public V get(java.lang.Object r1) {
            r0 = this;
            byte r1 = r0.objectToKey(r1)
            java.lang.Object r1 = r0.get(r1)
            return r1
    }

    @Override // java.util.Map
    public int hashCode() {
            r5 = this;
            int r0 = r5.size
            byte[] r1 = r5.keys
            int r2 = r1.length
            r3 = 0
        L6:
            if (r3 >= r2) goto L12
            r4 = r1[r3]
            int r4 = hashCode(r4)
            r0 = r0 ^ r4
            int r3 = r3 + 1
            goto L6
        L12:
            return r0
    }

    @Override // java.util.Map
    public boolean isEmpty() {
            r1 = this;
            int r0 = r1.size
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // java.util.Map
    public java.util.Set<java.lang.Byte> keySet() {
            r1 = this;
            java.util.Set<java.lang.Byte> r0 = r1.keySet
            return r0
    }

    protected java.lang.String keyToString(byte r1) {
            r0 = this;
            java.lang.String r1 = java.lang.Byte.toString(r1)
            return r1
    }

    @Override // io.netty.util.collection.ByteObjectMap
    public V put(byte r6, V r7) {
            r5 = this;
            int r0 = r5.hashIndex(r6)
            r1 = r0
        L5:
            V[] r2 = r5.values
            r3 = r2[r1]
            if (r3 != 0) goto L1a
            byte[] r0 = r5.keys
            r0[r1] = r6
            java.lang.Object r6 = toInternal(r7)
            r2[r1] = r6
            r5.growSize()
            r6 = 0
            return r6
        L1a:
            byte[] r4 = r5.keys
            r4 = r4[r1]
            if (r4 != r6) goto L2b
            java.lang.Object r6 = toInternal(r7)
            r2[r1] = r6
            java.lang.Object r6 = toExternal(r3)
            return r6
        L2b:
            int r1 = r5.probeNext(r1)
            if (r1 == r0) goto L32
            goto L5
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Unable to insert"
            r6.<init>(r7)
            throw r6
    }

    /* renamed from: put, reason: avoid collision after fix types in other method */
    public V put2(java.lang.Byte r1, V r2) {
            r0 = this;
            byte r1 = r0.objectToKey(r1)
            java.lang.Object r1 = r0.put(r1, r2)
            return r1
    }

    @Override // java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Byte r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Byte r1 = (java.lang.Byte) r1
            java.lang.Object r1 = r0.put2(r1, r2)
            return r1
    }

    @Override // java.util.Map
    public void putAll(java.util.Map<? extends java.lang.Byte, ? extends V> r4) {
            r3 = this;
            boolean r0 = r4 instanceof io.netty.util.collection.ByteObjectHashMap
            if (r0 == 0) goto L1a
            io.netty.util.collection.ByteObjectHashMap r4 = (io.netty.util.collection.ByteObjectHashMap) r4
            r0 = 0
        L7:
            V[] r1 = r4.values
            int r2 = r1.length
            if (r0 >= r2) goto L3c
            r1 = r1[r0]
            if (r1 == 0) goto L17
            byte[] r2 = r4.keys
            r2 = r2[r0]
            r3.put(r2, r1)
        L17:
            int r0 = r0 + 1
            goto L7
        L1a:
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L22:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L3c
            java.lang.Object r0 = r4.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r1 = r0.getKey()
            java.lang.Byte r1 = (java.lang.Byte) r1
            java.lang.Object r0 = r0.getValue()
            r3.put2(r1, r0)
            goto L22
        L3c:
            return
    }

    @Override // io.netty.util.collection.ByteObjectMap
    public V remove(byte r2) {
            r1 = this;
            int r2 = r1.indexOf(r2)
            r0 = -1
            if (r2 != r0) goto L9
            r2 = 0
            return r2
        L9:
            V[] r0 = r1.values
            r0 = r0[r2]
            r1.removeAt(r2)
            java.lang.Object r2 = toExternal(r0)
            return r2
    }

    @Override // java.util.Map
    public V remove(java.lang.Object r1) {
            r0 = this;
            byte r1 = r0.objectToKey(r1)
            java.lang.Object r1 = r0.remove(r1)
            return r1
    }

    @Override // java.util.Map
    public int size() {
            r1 = this;
            int r0 = r1.size
            return r0
    }

    public java.lang.String toString() {
            r6 = this;
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L9
            java.lang.String r0 = "{}"
            return r0
        L9:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.size
            int r1 = r1 * 4
            r0.<init>(r1)
            r1 = 123(0x7b, float:1.72E-43)
            r0.append(r1)
            r1 = 0
            r2 = 1
            r3 = 0
        L1a:
            V[] r4 = r6.values
            int r5 = r4.length
            if (r3 >= r5) goto L4a
            r4 = r4[r3]
            if (r4 == 0) goto L47
            if (r2 != 0) goto L2a
            java.lang.String r2 = ", "
            r0.append(r2)
        L2a:
            byte[] r2 = r6.keys
            r2 = r2[r3]
            java.lang.String r2 = r6.keyToString(r2)
            r0.append(r2)
            r2 = 61
            r0.append(r2)
            if (r4 != r6) goto L3f
            java.lang.String r2 = "(this Map)"
            goto L43
        L3f:
            java.lang.Object r2 = toExternal(r4)
        L43:
            r0.append(r2)
            r2 = 0
        L47:
            int r3 = r3 + 1
            goto L1a
        L4a:
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // java.util.Map
    public java.util.Collection<V> values() {
            r1 = this;
            io.netty.util.collection.ByteObjectHashMap$2 r0 = new io.netty.util.collection.ByteObjectHashMap$2
            r0.<init>(r1)
            return r0
    }
}

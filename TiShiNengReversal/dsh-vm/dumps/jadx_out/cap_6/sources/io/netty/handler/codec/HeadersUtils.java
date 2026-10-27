package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class HeadersUtils {


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class CharSequenceDelegatingStringSet extends io.netty.handler.codec.HeadersUtils.DelegatingStringSet<java.lang.CharSequence> {
        CharSequenceDelegatingStringSet(java.util.Set<java.lang.CharSequence> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                boolean r1 = r0.add(r1)
                return r1
        }

        public boolean add(java.lang.String r2) {
                r1 = this;
                java.util.Set<T> r0 = r1.allNames
                boolean r2 = r0.add(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean addAll(java.util.Collection<? extends java.lang.String> r2) {
                r1 = this;
                java.util.Set<T> r0 = r1.allNames
                boolean r2 = r0.addAll(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class DelegatingStringSet<T> extends java.util.AbstractCollection<java.lang.String> implements java.util.Set<java.lang.String> {
        protected final java.util.Set<T> allNames;

        DelegatingStringSet(java.util.Set<T> r2) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "allNames"
                java.lang.Object r2 = io.netty.util.internal.ObjectUtil.checkNotNull(r2, r0)
                java.util.Set r2 = (java.util.Set) r2
                r1.allNames = r2
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                java.util.Set<T> r0 = r1.allNames
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                java.util.Set<T> r0 = r1.allNames
                java.lang.String r2 = r2.toString()
                boolean r2 = r0.contains(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
                r1 = this;
                java.util.Set<T> r0 = r1.allNames
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.lang.String> iterator() {
                r2 = this;
                io.netty.handler.codec.HeadersUtils$StringIterator r0 = new io.netty.handler.codec.HeadersUtils$StringIterator
                java.util.Set<T> r1 = r2.allNames
                java.util.Iterator r1 = r1.iterator()
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                java.util.Set<T> r0 = r1.allNames
                boolean r2 = r0.remove(r2)
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                java.util.Set<T> r0 = r1.allNames
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class StringEntry implements java.util.Map.Entry<java.lang.String, java.lang.String> {
        private final java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence> entry;
        private java.lang.String name;
        private java.lang.String value;

        StringEntry(java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence> r1) {
                r0 = this;
                r0.<init>()
                r0.entry = r1
                return
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.String getKey() {
                r1 = this;
                java.lang.String r0 = r1.getKey2()
                return r0
        }

        @Override // java.util.Map.Entry
        /* renamed from: getKey, reason: avoid collision after fix types in other method */
        public java.lang.String getKey2() {
                r1 = this;
                java.lang.String r0 = r1.name
                if (r0 != 0) goto L12
                java.util.Map$Entry<java.lang.CharSequence, java.lang.CharSequence> r0 = r1.entry
                java.lang.Object r0 = r0.getKey()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.String r0 = r0.toString()
                r1.name = r0
            L12:
                java.lang.String r0 = r1.name
                return r0
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.getValue2()
                return r0
        }

        @Override // java.util.Map.Entry
        /* renamed from: getValue, reason: avoid collision after fix types in other method */
        public java.lang.String getValue2() {
                r1 = this;
                java.lang.String r0 = r1.value
                if (r0 != 0) goto L1a
                java.util.Map$Entry<java.lang.CharSequence, java.lang.CharSequence> r0 = r1.entry
                java.lang.Object r0 = r0.getValue()
                if (r0 == 0) goto L1a
                java.util.Map$Entry<java.lang.CharSequence, java.lang.CharSequence> r0 = r1.entry
                java.lang.Object r0 = r0.getValue()
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                java.lang.String r0 = r0.toString()
                r1.value = r0
            L1a:
                java.lang.String r0 = r1.value
                return r0
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.String setValue(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                java.lang.String r1 = r0.setValue2(r1)
                return r1
        }

        /* renamed from: setValue, reason: avoid collision after fix types in other method */
        public java.lang.String setValue2(java.lang.String r3) {
                r2 = this;
                java.lang.String r0 = r2.getValue2()
                java.util.Map$Entry<java.lang.CharSequence, java.lang.CharSequence> r1 = r2.entry
                r1.setValue(r3)
                return r0
        }

        public java.lang.String toString() {
                r1 = this;
                java.util.Map$Entry<java.lang.CharSequence, java.lang.CharSequence> r0 = r1.entry
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class StringEntryIterator implements java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> {
        private final java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> iter;

        StringEntryIterator(java.util.Iterator<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> r1) {
                r0 = this;
                r0.<init>()
                r0.iter = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<java.lang.CharSequence, java.lang.CharSequence>> r0 = r1.iter
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.util.Map.Entry<java.lang.String, java.lang.String> next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        /* renamed from: next, reason: avoid collision after fix types in other method */
        public java.util.Map.Entry<java.lang.String, java.lang.String> next2() {
                r2 = this;
                io.netty.handler.codec.HeadersUtils$StringEntry r0 = new io.netty.handler.codec.HeadersUtils$StringEntry
                java.util.Iterator<java.util.Map$Entry<java.lang.CharSequence, java.lang.CharSequence>> r1 = r2.iter
                java.lang.Object r1 = r1.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                r0.<init>(r1)
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<java.lang.CharSequence, java.lang.CharSequence>> r0 = r1.iter
                r0.remove()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class StringIterator<T> implements java.util.Iterator<java.lang.String> {
        private final java.util.Iterator<T> iter;

        StringIterator(java.util.Iterator<T> r1) {
                r0 = this;
                r0.<init>()
                r0.iter = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.iter
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.String next() {
                r1 = this;
                java.lang.String r0 = r1.next2()
                return r0
        }

        @Override // java.util.Iterator
        /* renamed from: next, reason: avoid collision after fix types in other method */
        public java.lang.String next2() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.iter
                java.lang.Object r0 = r0.next()
                if (r0 == 0) goto Ld
                java.lang.String r0 = r0.toString()
                return r0
            Ld:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.util.Iterator<T> r0 = r1.iter
                r0.remove()
                return
        }
    }

    private HeadersUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <K, V> java.util.List<java.lang.String> getAllAsString(io.netty.handler.codec.Headers<K, V, ?> r0, K r1) {
            java.util.List r0 = r0.getAll(r1)
            io.netty.handler.codec.HeadersUtils$1 r1 = new io.netty.handler.codec.HeadersUtils$1
            r1.<init>(r0)
            return r1
    }

    public static <K, V> java.lang.String getAsString(io.netty.handler.codec.Headers<K, V, ?> r0, K r1) {
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto Lb
            java.lang.String r0 = r0.toString()
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public static java.util.Iterator<java.util.Map.Entry<java.lang.String, java.lang.String>> iteratorAsString(java.lang.Iterable<java.util.Map.Entry<java.lang.CharSequence, java.lang.CharSequence>> r1) {
            io.netty.handler.codec.HeadersUtils$StringEntryIterator r0 = new io.netty.handler.codec.HeadersUtils$StringEntryIterator
            java.util.Iterator r1 = r1.iterator()
            r0.<init>(r1)
            return r0
    }

    public static java.util.Set<java.lang.String> namesAsString(io.netty.handler.codec.Headers<java.lang.CharSequence, java.lang.CharSequence, ?> r1) {
            io.netty.handler.codec.HeadersUtils$CharSequenceDelegatingStringSet r0 = new io.netty.handler.codec.HeadersUtils$CharSequenceDelegatingStringSet
            java.util.Set r1 = r1.names()
            r0.<init>(r1)
            return r0
    }

    public static <K, V> java.lang.String toString(java.lang.Class<?> r2, java.util.Iterator<java.util.Map.Entry<K, V>> r3, int r4) {
            java.lang.String r2 = r2.getSimpleName()
            if (r4 != 0) goto L18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r2)
            java.lang.String r2 = "[]"
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            return r2
        L18:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r2.length()
            int r1 = r1 + 2
            int r4 = r4 * 20
            int r1 = r1 + r4
            r0.<init>(r1)
            r0.append(r2)
            r2 = 91
            r0.append(r2)
        L2e:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L53
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r4 = r2.getKey()
            r0.append(r4)
            java.lang.String r4 = ": "
            r0.append(r4)
            java.lang.Object r2 = r2.getValue()
            r0.append(r2)
            java.lang.String r2 = ", "
            r0.append(r2)
            goto L2e
        L53:
            int r2 = r0.length()
            int r2 = r2 + (-2)
            r0.setLength(r2)
            r2 = 93
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

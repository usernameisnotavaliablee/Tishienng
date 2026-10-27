package kotlin.reflect.jvm.internal.impl.protobuf;

import java.lang.Comparable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class s<K extends java.lang.Comparable<K>, V> extends java.util.AbstractMap<K, V> {
    private final int a;
    private java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>.c> b;
    private java.util.Map<K, V> c;
    private boolean d;
    private volatile kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>.e e;

    /* JADX INFO: Add missing generic type declarations: [FieldDescriptorType] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<FieldDescriptorType> extends kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType, java.lang.Object> {
        a(int r2) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r0)
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.s
        public void m() {
                r3 = this;
                boolean r0 = r3.l()
                if (r0 != 0) goto L5b
                r0 = 0
            L7:
                int r1 = r3.i()
                if (r0 >= r1) goto L2d
                java.util.Map$Entry r1 = r3.h(r0)
                java.lang.Object r2 = r1.getKey()
                kotlin.reflect.jvm.internal.impl.protobuf.g$b r2 = (kotlin.reflect.jvm.internal.impl.protobuf.g.b) r2
                boolean r2 = r2.H()
                if (r2 == 0) goto L2a
                java.lang.Object r2 = r1.getValue()
                java.util.List r2 = (java.util.List) r2
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.setValue(r2)
            L2a:
                int r0 = r0 + 1
                goto L7
            L2d:
                java.lang.Iterable r0 = r3.j()
                java.util.Iterator r0 = r0.iterator()
            L35:
                boolean r1 = r0.hasNext()
                if (r1 == 0) goto L5b
                java.lang.Object r1 = r0.next()
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                java.lang.Object r2 = r1.getKey()
                kotlin.reflect.jvm.internal.impl.protobuf.g$b r2 = (kotlin.reflect.jvm.internal.impl.protobuf.g.b) r2
                boolean r2 = r2.H()
                if (r2 == 0) goto L35
                java.lang.Object r2 = r1.getValue()
                java.util.List r2 = (java.util.List) r2
                java.util.List r2 = java.util.Collections.unmodifiableList(r2)
                r1.setValue(r2)
                goto L35
            L5b:
                super.m()
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.s, java.util.AbstractMap, java.util.Map
        public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.g$b r1 = (kotlin.reflect.jvm.internal.impl.protobuf.g.b) r1
                java.lang.Object r1 = super.o(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private static final java.util.Iterator<java.lang.Object> a = null;
        private static final java.lang.Iterable<java.lang.Object> b = null;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        static class a implements java.util.Iterator<java.lang.Object> {
            a() {
                    r0 = this;
                    r0.<init>()
                    return
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
                    java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                    r0.<init>()
                    throw r0
            }
        }

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.s$b$b, reason: collision with other inner class name */
        static class C0060b implements java.lang.Iterable<java.lang.Object> {
            C0060b() {
                    r0 = this;
                    r0.<init>()
                    return
            }

            @Override // java.lang.Iterable
            public java.util.Iterator<java.lang.Object> iterator() {
                    r1 = this;
                    java.util.Iterator r0 = kotlin.reflect.jvm.internal.impl.protobuf.s.b.a()
                    return r0
            }
        }

        static {
                kotlin.reflect.jvm.internal.impl.protobuf.s$b$a r0 = new kotlin.reflect.jvm.internal.impl.protobuf.s$b$a
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.protobuf.s.b.a = r0
                kotlin.reflect.jvm.internal.impl.protobuf.s$b$b r0 = new kotlin.reflect.jvm.internal.impl.protobuf.s$b$b
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.protobuf.s.b.b = r0
                return
        }

        static /* synthetic */ java.util.Iterator a() {
                java.util.Iterator<java.lang.Object> r0 = kotlin.reflect.jvm.internal.impl.protobuf.s.b.a
                return r0
        }

        static <T> java.lang.Iterable<T> b() {
                java.lang.Iterable<java.lang.Object> r0 = kotlin.reflect.jvm.internal.impl.protobuf.s.b.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c implements java.lang.Comparable<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>.c>, java.util.Map.Entry<K, V> {
        private final K a;
        private V b;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.s c;

        c(kotlin.reflect.jvm.internal.impl.protobuf.s r1, K r2, V r3) {
                r0 = this;
                r0.c = r1
                r0.<init>()
                r0.a = r2
                r0.b = r3
                return
        }

        c(kotlin.reflect.jvm.internal.impl.protobuf.s r2, java.util.Map.Entry<K, V> r3) {
                r1 = this;
                java.lang.Object r0 = r3.getKey()
                java.lang.Comparable r0 = (java.lang.Comparable) r0
                java.lang.Object r3 = r3.getValue()
                r1.<init>(r2, r0, r3)
                return
        }

        private boolean b(java.lang.Object r1, java.lang.Object r2) {
                r0 = this;
                if (r1 != 0) goto L8
                if (r2 != 0) goto L6
                r1 = 1
                return r1
            L6:
                r1 = 0
                return r1
            L8:
                boolean r1 = r1.equals(r2)
                return r1
        }

        public int a(kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>.c r2) {
                r1 = this;
                java.lang.Comparable r0 = r1.c()
                java.lang.Comparable r2 = r2.c()
                int r2 = r0.compareTo(r2)
                return r2
        }

        public K c() {
                r1 = this;
                K extends java.lang.Comparable<K> r0 = r1.a
                return r0
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object r1) {
                r0 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.s$c r1 = (kotlin.reflect.jvm.internal.impl.protobuf.s.c) r1
                int r1 = r0.a(r1)
                return r1
        }

        @Override // java.util.Map.Entry
        public boolean equals(java.lang.Object r5) {
                r4 = this;
                r0 = 1
                if (r5 != r4) goto L4
                return r0
            L4:
                boolean r1 = r5 instanceof java.util.Map.Entry
                r2 = 0
                if (r1 != 0) goto La
                return r2
            La:
                java.util.Map$Entry r5 = (java.util.Map.Entry) r5
                K extends java.lang.Comparable<K> r1 = r4.a
                java.lang.Object r3 = r5.getKey()
                boolean r1 = r4.b(r1, r3)
                if (r1 == 0) goto L25
                V r1 = r4.b
                java.lang.Object r5 = r5.getValue()
                boolean r5 = r4.b(r1, r5)
                if (r5 == 0) goto L25
                return r0
            L25:
                return r2
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ java.lang.Object getKey() {
                r1 = this;
                java.lang.Comparable r0 = r1.c()
                return r0
        }

        @Override // java.util.Map.Entry
        public V getValue() {
                r1 = this;
                V r0 = r1.b
                return r0
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
                r3 = this;
                K extends java.lang.Comparable<K> r0 = r3.a
                r1 = 0
                if (r0 != 0) goto L7
                r0 = 0
                goto Lb
            L7:
                int r0 = r0.hashCode()
            Lb:
                V r2 = r3.b
                if (r2 != 0) goto L10
                goto L14
            L10:
                int r1 = r2.hashCode()
            L14:
                r0 = r0 ^ r1
                return r0
        }

        @Override // java.util.Map.Entry
        public V setValue(V r2) {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.s r0 = r1.c
                kotlin.reflect.jvm.internal.impl.protobuf.s.a(r0)
                V r0 = r1.b
                r1.b = r2
                return r0
        }

        public java.lang.String toString() {
                r5 = this;
                K extends java.lang.Comparable<K> r0 = r5.a
                java.lang.String r0 = java.lang.String.valueOf(r0)
                V r1 = r5.b
                java.lang.String r1 = java.lang.String.valueOf(r1)
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                int r3 = r0.length()
                int r3 = r3 + 1
                int r4 = r1.length()
                int r3 = r3 + r4
                r2.<init>(r3)
                r2.append(r0)
                java.lang.String r0 = "="
                r2.append(r0)
                r2.append(r1)
                java.lang.String r0 = r2.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class d implements java.util.Iterator<java.util.Map.Entry<K, V>> {
        private int a;
        private boolean b;
        private java.util.Iterator<java.util.Map.Entry<K, V>> c;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.s d;

        private d(kotlin.reflect.jvm.internal.impl.protobuf.s r1) {
                r0 = this;
                r0.d = r1
                r0.<init>()
                r1 = -1
                r0.a = r1
                return
        }

        /* synthetic */ d(kotlin.reflect.jvm.internal.impl.protobuf.s r1, kotlin.reflect.jvm.internal.impl.protobuf.s.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        private java.util.Iterator<java.util.Map.Entry<K, V>> a() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> r0 = r1.c
                if (r0 != 0) goto L14
                kotlin.reflect.jvm.internal.impl.protobuf.s r0 = r1.d
                java.util.Map r0 = kotlin.reflect.jvm.internal.impl.protobuf.s.d(r0)
                java.util.Set r0 = r0.entrySet()
                java.util.Iterator r0 = r0.iterator()
                r1.c = r0
            L14:
                java.util.Iterator<java.util.Map$Entry<K extends java.lang.Comparable<K>, V>> r0 = r1.c
                return r0
        }

        public java.util.Map.Entry<K, V> b() {
                r2 = this;
                r0 = 1
                r2.b = r0
                int r1 = r2.a
                int r1 = r1 + r0
                r2.a = r1
                kotlin.reflect.jvm.internal.impl.protobuf.s r0 = r2.d
                java.util.List r0 = kotlin.reflect.jvm.internal.impl.protobuf.s.b(r0)
                int r0 = r0.size()
                if (r1 >= r0) goto L23
                kotlin.reflect.jvm.internal.impl.protobuf.s r0 = r2.d
                java.util.List r0 = kotlin.reflect.jvm.internal.impl.protobuf.s.b(r0)
                int r1 = r2.a
                java.lang.Object r0 = r0.get(r1)
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
            L23:
                java.util.Iterator r0 = r2.a()
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r3 = this;
                int r0 = r3.a
                r1 = 1
                int r0 = r0 + r1
                kotlin.reflect.jvm.internal.impl.protobuf.s r2 = r3.d
                java.util.List r2 = kotlin.reflect.jvm.internal.impl.protobuf.s.b(r2)
                int r2 = r2.size()
                if (r0 < r2) goto L1d
                java.util.Iterator r0 = r3.a()
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L1b
                goto L1d
            L1b:
                r0 = 0
                return r0
            L1d:
                return r1
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.b()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r3 = this;
                boolean r0 = r3.b
                if (r0 == 0) goto L2e
                r0 = 0
                r3.b = r0
                kotlin.reflect.jvm.internal.impl.protobuf.s r0 = r3.d
                kotlin.reflect.jvm.internal.impl.protobuf.s.a(r0)
                int r0 = r3.a
                kotlin.reflect.jvm.internal.impl.protobuf.s r1 = r3.d
                java.util.List r1 = kotlin.reflect.jvm.internal.impl.protobuf.s.b(r1)
                int r1 = r1.size()
                if (r0 >= r1) goto L26
                kotlin.reflect.jvm.internal.impl.protobuf.s r0 = r3.d
                int r1 = r3.a
                int r2 = r1 + (-1)
                r3.a = r2
                kotlin.reflect.jvm.internal.impl.protobuf.s.c(r0, r1)
                return
            L26:
                java.util.Iterator r0 = r3.a()
                r0.remove()
                return
            L2e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "remove() was called before next()"
                r0.<init>(r1)
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class e extends java.util.AbstractSet<java.util.Map.Entry<K, V>> {
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.s a;

        private e(kotlin.reflect.jvm.internal.impl.protobuf.s r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        /* synthetic */ e(kotlin.reflect.jvm.internal.impl.protobuf.s r1, kotlin.reflect.jvm.internal.impl.protobuf.s.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public boolean a(java.util.Map.Entry<K, V> r3) {
                r2 = this;
                boolean r0 = r2.contains(r3)
                if (r0 != 0) goto L17
                kotlin.reflect.jvm.internal.impl.protobuf.s r0 = r2.a
                java.lang.Object r1 = r3.getKey()
                java.lang.Comparable r1 = (java.lang.Comparable) r1
                java.lang.Object r3 = r3.getValue()
                r0.o(r1, r3)
                r3 = 1
                return r3
            L17:
                r3 = 0
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public /* bridge */ /* synthetic */ boolean add(java.lang.Object r1) {
                r0 = this;
                java.util.Map$Entry r1 = (java.util.Map.Entry) r1
                boolean r1 = r0.a(r1)
                return r1
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.s r0 = r1.a
                r0.clear()
                return
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(java.lang.Object r3) {
                r2 = this;
                java.util.Map$Entry r3 = (java.util.Map.Entry) r3
                kotlin.reflect.jvm.internal.impl.protobuf.s r0 = r2.a
                java.lang.Object r1 = r3.getKey()
                java.lang.Object r0 = r0.get(r1)
                java.lang.Object r3 = r3.getValue()
                if (r0 == r3) goto L1d
                if (r0 == 0) goto L1b
                boolean r3 = r0.equals(r3)
                if (r3 == 0) goto L1b
                goto L1d
            L1b:
                r3 = 0
                return r3
            L1d:
                r3 = 1
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public java.util.Iterator<java.util.Map.Entry<K, V>> iterator() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.s$d r0 = new kotlin.reflect.jvm.internal.impl.protobuf.s$d
                kotlin.reflect.jvm.internal.impl.protobuf.s r1 = r3.a
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                java.util.Map$Entry r2 = (java.util.Map.Entry) r2
                boolean r0 = r1.contains(r2)
                if (r0 == 0) goto L13
                kotlin.reflect.jvm.internal.impl.protobuf.s r0 = r1.a
                java.lang.Object r2 = r2.getKey()
                r0.remove(r2)
                r2 = 1
                return r2
            L13:
                r2 = 0
                return r2
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.protobuf.s r0 = r1.a
                int r0 = r0.size()
                return r0
        }
    }

    private s(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            java.util.List r1 = java.util.Collections.EMPTY_LIST
            r0.b = r1
            java.util.Map r1 = java.util.Collections.EMPTY_MAP
            r0.c = r1
            return
    }

    /* synthetic */ s(int r1, kotlin.reflect.jvm.internal.impl.protobuf.s.a r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    static /* synthetic */ void a(kotlin.reflect.jvm.internal.impl.protobuf.s r0) {
            r0.f()
            return
    }

    static /* synthetic */ java.util.List b(kotlin.reflect.jvm.internal.impl.protobuf.s r0) {
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r0 = r0.b
            return r0
    }

    static /* synthetic */ java.lang.Object c(kotlin.reflect.jvm.internal.impl.protobuf.s r0, int r1) {
            java.lang.Object r0 = r0.p(r1)
            return r0
    }

    static /* synthetic */ java.util.Map d(kotlin.reflect.jvm.internal.impl.protobuf.s r0) {
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r0.c
            return r0
    }

    private int e(K r5) {
            r4 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r0 = r4.b
            int r0 = r0.size()
            int r1 = r0 + (-1)
            if (r1 < 0) goto L23
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r2 = r4.b
            java.lang.Object r2 = r2.get(r1)
            kotlin.reflect.jvm.internal.impl.protobuf.s$c r2 = (kotlin.reflect.jvm.internal.impl.protobuf.s.c) r2
            java.lang.Comparable r2 = r2.c()
            int r2 = r5.compareTo(r2)
            if (r2 <= 0) goto L20
            int r0 = r0 + 1
        L1e:
            int r5 = -r0
            return r5
        L20:
            if (r2 != 0) goto L23
            return r1
        L23:
            r0 = 0
        L24:
            if (r0 > r1) goto L47
            int r2 = r0 + r1
            int r2 = r2 / 2
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r3 = r4.b
            java.lang.Object r3 = r3.get(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.s$c r3 = (kotlin.reflect.jvm.internal.impl.protobuf.s.c) r3
            java.lang.Comparable r3 = r3.c()
            int r3 = r5.compareTo(r3)
            if (r3 >= 0) goto L40
            int r2 = r2 + (-1)
            r1 = r2
            goto L24
        L40:
            if (r3 <= 0) goto L46
            int r2 = r2 + 1
            r0 = r2
            goto L24
        L46:
            return r2
        L47:
            int r0 = r0 + 1
            goto L1e
    }

    private void f() {
            r1 = this;
            boolean r0 = r1.d
            if (r0 != 0) goto L5
            return
        L5:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>()
            throw r0
    }

    private void g() {
            r2 = this;
            r2.f()
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r0 = r2.b
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r0 = r2.b
            boolean r0 = r0 instanceof java.util.ArrayList
            if (r0 != 0) goto L1a
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r2.a
            r0.<init>(r1)
            r2.b = r0
        L1a:
            return
    }

    private java.util.SortedMap<K, V> k() {
            r1 = this;
            r1.f()
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L18
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.c
            boolean r0 = r0 instanceof java.util.TreeMap
            if (r0 != 0) goto L18
            java.util.TreeMap r0 = new java.util.TreeMap
            r0.<init>()
            r1.c = r0
        L18:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.c
            java.util.SortedMap r0 = (java.util.SortedMap) r0
            return r0
    }

    static <FieldDescriptorType extends kotlin.reflect.jvm.internal.impl.protobuf.g.b<FieldDescriptorType>> kotlin.reflect.jvm.internal.impl.protobuf.s<FieldDescriptorType, java.lang.Object> n(int r1) {
            kotlin.reflect.jvm.internal.impl.protobuf.s$a r0 = new kotlin.reflect.jvm.internal.impl.protobuf.s$a
            r0.<init>(r1)
            return r0
    }

    private V p(int r5) {
            r4 = this;
            r4.f()
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r0 = r4.b
            java.lang.Object r5 = r0.remove(r5)
            kotlin.reflect.jvm.internal.impl.protobuf.s$c r5 = (kotlin.reflect.jvm.internal.impl.protobuf.s.c) r5
            java.lang.Object r5 = r5.getValue()
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r4.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L36
            java.util.SortedMap r0 = r4.k()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r1 = r4.b
            kotlin.reflect.jvm.internal.impl.protobuf.s$c r2 = new kotlin.reflect.jvm.internal.impl.protobuf.s$c
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            r2.<init>(r4, r3)
            r1.add(r2)
            r0.remove()
        L36:
            return r5
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
            r1 = this;
            r1.f()
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r0 = r1.b
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L10
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r0 = r1.b
            r0.clear()
        L10:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.c
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L1d
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.c
            r0.clear()
        L1d:
            return
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.e(r2)
            if (r0 >= 0) goto L13
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.c
            boolean r2 = r0.containsKey(r2)
            if (r2 == 0) goto L11
            goto L13
        L11:
            r2 = 0
            return r2
        L13:
            r2 = 1
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public java.util.Set<java.util.Map.Entry<K, V>> entrySet() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$e r0 = r2.e
            if (r0 != 0) goto Lc
            kotlin.reflect.jvm.internal.impl.protobuf.s$e r0 = new kotlin.reflect.jvm.internal.impl.protobuf.s$e
            r1 = 0
            r0.<init>(r2, r1)
            r2.e = r0
        Lc:
            kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$e r0 = r2.e
            return r0
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V get(java.lang.Object r2) {
            r1 = this;
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.e(r2)
            if (r0 < 0) goto L15
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r2 = r1.b
            java.lang.Object r2 = r2.get(r0)
            kotlin.reflect.jvm.internal.impl.protobuf.s$c r2 = (kotlin.reflect.jvm.internal.impl.protobuf.s.c) r2
            java.lang.Object r2 = r2.getValue()
            return r2
        L15:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.c
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public java.util.Map.Entry<K, V> h(int r2) {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r0 = r1.b
            java.lang.Object r2 = r0.get(r2)
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            return r2
    }

    public int i() {
            r1 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r0 = r1.b
            int r0 = r0.size()
            return r0
    }

    public java.lang.Iterable<java.util.Map.Entry<K, V>> j() {
            r1 = this;
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Ld
            java.lang.Iterable r0 = kotlin.reflect.jvm.internal.impl.protobuf.s.b.b()
            return r0
        Ld:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.c
            java.util.Set r0 = r0.entrySet()
            return r0
    }

    public boolean l() {
            r1 = this;
            boolean r0 = r1.d
            return r0
    }

    public void m() {
            r1 = this;
            boolean r0 = r1.d
            if (r0 != 0) goto L1a
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto Lf
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            goto L15
        Lf:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.c
            java.util.Map r0 = java.util.Collections.unmodifiableMap(r0)
        L15:
            r1.c = r0
            r0 = 1
            r1.d = r0
        L1a:
            return
    }

    public V o(K r5, V r6) {
            r4 = this;
            r4.f()
            int r0 = r4.e(r5)
            if (r0 < 0) goto L16
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r5 = r4.b
            java.lang.Object r5 = r5.get(r0)
            kotlin.reflect.jvm.internal.impl.protobuf.s$c r5 = (kotlin.reflect.jvm.internal.impl.protobuf.s.c) r5
            java.lang.Object r5 = r5.setValue(r6)
            return r5
        L16:
            r4.g()
            int r0 = r0 + 1
            int r0 = -r0
            int r1 = r4.a
            if (r0 < r1) goto L29
            java.util.SortedMap r0 = r4.k()
            java.lang.Object r5 = r0.put(r5, r6)
            return r5
        L29:
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r1 = r4.b
            int r1 = r1.size()
            int r2 = r4.a
            if (r1 != r2) goto L4c
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r1 = r4.b
            int r2 = r2 + (-1)
            java.lang.Object r1 = r1.remove(r2)
            kotlin.reflect.jvm.internal.impl.protobuf.s$c r1 = (kotlin.reflect.jvm.internal.impl.protobuf.s.c) r1
            java.util.SortedMap r2 = r4.k()
            java.lang.Comparable r3 = r1.c()
            java.lang.Object r1 = r1.getValue()
            r2.put(r3, r1)
        L4c:
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r1 = r4.b
            kotlin.reflect.jvm.internal.impl.protobuf.s$c r2 = new kotlin.reflect.jvm.internal.impl.protobuf.s$c
            r2.<init>(r4, r5, r6)
            r1.add(r0, r2)
            r5 = 0
            return r5
    }

    @Override // java.util.AbstractMap, java.util.Map
    public /* bridge */ /* synthetic */ java.lang.Object put(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Comparable r1 = (java.lang.Comparable) r1
            java.lang.Object r1 = r0.o(r1, r2)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V remove(java.lang.Object r2) {
            r1 = this;
            r1.f()
            java.lang.Comparable r2 = (java.lang.Comparable) r2
            int r0 = r1.e(r2)
            if (r0 < 0) goto L10
            java.lang.Object r2 = r1.p(r0)
            return r2
        L10:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.c
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L1a
            r2 = 0
            return r2
        L1a:
            java.util.Map<K extends java.lang.Comparable<K>, V> r0 = r1.c
            java.lang.Object r2 = r0.remove(r2)
            return r2
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
            r2 = this;
            java.util.List<kotlin.reflect.jvm.internal.impl.protobuf.s<K, V>$c> r0 = r2.b
            int r0 = r0.size()
            java.util.Map<K extends java.lang.Comparable<K>, V> r1 = r2.c
            int r1 = r1.size()
            int r0 = r0 + r1
            return r0
    }
}

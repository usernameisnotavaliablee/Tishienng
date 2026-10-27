package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class i extends kotlin.reflect.jvm.internal.impl.protobuf.j {
    private final kotlin.reflect.jvm.internal.impl.protobuf.n e;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b<K> implements java.util.Map.Entry<K, java.lang.Object> {
        private java.util.Map.Entry<K, kotlin.reflect.jvm.internal.impl.protobuf.i> a;

        private b(java.util.Map.Entry<K, kotlin.reflect.jvm.internal.impl.protobuf.i> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ b(java.util.Map.Entry r1, kotlin.reflect.jvm.internal.impl.protobuf.i.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // java.util.Map.Entry
        public K getKey() {
                r1 = this;
                java.util.Map$Entry<K, kotlin.reflect.jvm.internal.impl.protobuf.i> r0 = r1.a
                java.lang.Object r0 = r0.getKey()
                return r0
        }

        @Override // java.util.Map.Entry
        public java.lang.Object getValue() {
                r1 = this;
                java.util.Map$Entry<K, kotlin.reflect.jvm.internal.impl.protobuf.i> r0 = r1.a
                java.lang.Object r0 = r0.getValue()
                kotlin.reflect.jvm.internal.impl.protobuf.i r0 = (kotlin.reflect.jvm.internal.impl.protobuf.i) r0
                if (r0 != 0) goto Lc
                r0 = 0
                return r0
            Lc:
                kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r0.e()
                return r0
        }

        @Override // java.util.Map.Entry
        public java.lang.Object setValue(java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlin.reflect.jvm.internal.impl.protobuf.n
                if (r0 == 0) goto L13
                java.util.Map$Entry<K, kotlin.reflect.jvm.internal.impl.protobuf.i> r0 = r1.a
                java.lang.Object r0 = r0.getValue()
                kotlin.reflect.jvm.internal.impl.protobuf.i r0 = (kotlin.reflect.jvm.internal.impl.protobuf.i) r0
                kotlin.reflect.jvm.internal.impl.protobuf.n r2 = (kotlin.reflect.jvm.internal.impl.protobuf.n) r2
                kotlin.reflect.jvm.internal.impl.protobuf.n r2 = r0.d(r2)
                return r2
            L13:
                java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite"
                r2.<init>(r0)
                throw r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c<K> implements java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> {
        private java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> a;

        public c(java.util.Iterator<java.util.Map.Entry<K, java.lang.Object>> r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public java.util.Map.Entry<K, java.lang.Object> a() {
                r3 = this;
                java.util.Iterator<java.util.Map$Entry<K, java.lang.Object>> r0 = r3.a
                java.lang.Object r0 = r0.next()
                java.util.Map$Entry r0 = (java.util.Map.Entry) r0
                java.lang.Object r1 = r0.getValue()
                boolean r1 = r1 instanceof kotlin.reflect.jvm.internal.impl.protobuf.i
                if (r1 == 0) goto L17
                kotlin.reflect.jvm.internal.impl.protobuf.i$b r1 = new kotlin.reflect.jvm.internal.impl.protobuf.i$b
                r2 = 0
                r1.<init>(r0, r2)
                return r1
            L17:
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K, java.lang.Object>> r0 = r1.a
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.util.Map$Entry r0 = r1.a()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.util.Iterator<java.util.Map$Entry<K, java.lang.Object>> r0 = r1.a
                r0.remove()
                return
        }
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.n e() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r1.e
            kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r1.c(r0)
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r1.e()
            boolean r2 = r0.equals(r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r1.e()
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.n r0 = r1.e()
            java.lang.String r0 = r0.toString()
            return r0
    }
}

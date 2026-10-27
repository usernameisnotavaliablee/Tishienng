package kotlin.reflect.jvm.internal.impl.protobuf;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class t extends java.util.AbstractList<java.lang.String> implements java.util.RandomAccess, kotlin.reflect.jvm.internal.impl.protobuf.l {
    private final kotlin.reflect.jvm.internal.impl.protobuf.l a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements java.util.ListIterator<java.lang.String> {
        java.util.ListIterator<java.lang.String> a;
        final /* synthetic */ int b;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.t c;

        a(kotlin.reflect.jvm.internal.impl.protobuf.t r1, int r2) {
                r0 = this;
                r0.c = r1
                r0.b = r2
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.protobuf.l r1 = kotlin.reflect.jvm.internal.impl.protobuf.t.a(r1)
                java.util.ListIterator r1 = r1.listIterator(r2)
                r0.a = r1
                return
        }

        public void a(java.lang.String r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void add(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                r0.a(r1)
                return
        }

        public java.lang.String b() {
                r1 = this;
                java.util.ListIterator<java.lang.String> r0 = r1.a
                java.lang.Object r0 = r0.next()
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }

        public java.lang.String c() {
                r1 = this;
                java.util.ListIterator<java.lang.String> r0 = r1.a
                java.lang.Object r0 = r0.previous()
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }

        public void e(java.lang.String r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.ListIterator<java.lang.String> r0 = r1.a
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                java.util.ListIterator<java.lang.String> r0 = r1.a
                boolean r0 = r0.hasPrevious()
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.lang.String r0 = r1.b()
                return r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                java.util.ListIterator<java.lang.String> r0 = r1.a
                int r0 = r0.nextIndex()
                return r0
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ java.lang.String previous() {
                r1 = this;
                java.lang.String r0 = r1.c()
                return r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                java.util.ListIterator<java.lang.String> r0 = r1.a
                int r0 = r0.previousIndex()
                return r0
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public /* bridge */ /* synthetic */ void set(java.lang.String r1) {
                r0 = this;
                java.lang.String r1 = (java.lang.String) r1
                r0.e(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements java.util.Iterator<java.lang.String> {
        java.util.Iterator<java.lang.String> a;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.t b;

        b(kotlin.reflect.jvm.internal.impl.protobuf.t r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.protobuf.l r1 = kotlin.reflect.jvm.internal.impl.protobuf.t.a(r1)
                java.util.Iterator r1 = r1.iterator()
                r0.a = r1
                return
        }

        public java.lang.String a() {
                r1 = this;
                java.util.Iterator<java.lang.String> r0 = r1.a
                java.lang.Object r0 = r0.next()
                java.lang.String r0 = (java.lang.String) r0
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator<java.lang.String> r0 = r1.a
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.String next() {
                r1 = this;
                java.lang.String r0 = r1.a()
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                r0.<init>()
                throw r0
        }
    }

    public t(kotlin.reflect.jvm.internal.impl.protobuf.l r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.protobuf.l a(kotlin.reflect.jvm.internal.impl.protobuf.t r0) {
            kotlin.reflect.jvm.internal.impl.protobuf.l r0 = r0.a
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public kotlin.reflect.jvm.internal.impl.protobuf.l c() {
            r0 = this;
            return r0
    }

    public java.lang.String d(int r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.l r0 = r1.a
            java.lang.Object r2 = r0.get(r2)
            java.lang.String r2 = (java.lang.String) r2
            return r2
    }

    @Override // java.util.AbstractList, java.util.List
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.String r1 = r0.d(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public java.util.List<?> h() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.l r0 = r1.a
            java.util.List r0 = r0.h()
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public kotlin.reflect.jvm.internal.impl.protobuf.d i(int r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.l r0 = r1.a
            kotlin.reflect.jvm.internal.impl.protobuf.d r2 = r0.i(r2)
            return r2
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public java.util.Iterator<java.lang.String> iterator() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.t$b r0 = new kotlin.reflect.jvm.internal.impl.protobuf.t$b
            r0.<init>(r1)
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.l
    public void k(kotlin.reflect.jvm.internal.impl.protobuf.d r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>()
            throw r1
    }

    @Override // java.util.AbstractList, java.util.List
    public java.util.ListIterator<java.lang.String> listIterator(int r2) {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.t$a r0 = new kotlin.reflect.jvm.internal.impl.protobuf.t$a
            r0.<init>(r1, r2)
            return r0
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.protobuf.l r0 = r1.a
            int r0 = r0.size()
            return r0
    }
}

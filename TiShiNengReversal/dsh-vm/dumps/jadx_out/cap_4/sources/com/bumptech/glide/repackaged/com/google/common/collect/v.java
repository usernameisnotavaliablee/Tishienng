package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class v {
    static final com.bumptech.glide.repackaged.com.google.common.collect.v0<java.lang.Object> a = null;
    private static final java.util.Iterator<java.lang.Object> b = null;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a<T> extends com.bumptech.glide.repackaged.com.google.common.collect.a<T> {
        final /* synthetic */ java.lang.Object[] c;
        final /* synthetic */ int d;

        a(int r1, int r2, java.lang.Object[] r3, int r4) {
                r0 = this;
                r0.c = r3
                r0.d = r4
                r0.<init>(r1, r2)
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.a
        protected T a(int r3) {
                r2 = this;
                java.lang.Object[] r0 = r2.c
                int r1 = r2.d
                int r1 = r1 + r3
                r3 = r0[r1]
                return r3
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b<T> extends com.bumptech.glide.repackaged.com.google.common.collect.u0<T> {
        boolean a;
        final /* synthetic */ java.lang.Object b;

        b(java.lang.Object r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                boolean r0 = r1.a
                r0 = r0 ^ 1
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                boolean r0 = r1.a
                if (r0 != 0) goto La
                r0 = 1
                r1.a = r0
                java.lang.Object r0 = r1.b
                return r0
            La:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class c extends com.bumptech.glide.repackaged.com.google.common.collect.v0<java.lang.Object> {
        c() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // java.util.Iterator, java.util.ListIterator
        public boolean hasNext() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator, java.util.ListIterator
        public java.lang.Object next() {
                r1 = this;
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.ListIterator
        public java.lang.Object previous() {
                r1 = this;
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
                r1 = this;
                r0 = -1
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class d implements java.util.Iterator<java.lang.Object> {
        d() {
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
                r0 = 0
                com.bumptech.glide.repackaged.com.google.common.collect.f.c(r0)
                return
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class e<T> extends com.bumptech.glide.repackaged.com.google.common.collect.u0<T> {
        final /* synthetic */ java.util.Iterator a;

        e(java.util.Iterator r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                java.util.Iterator r0 = r1.a
                boolean r0 = r0.hasNext()
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                java.util.Iterator r0 = r1.a
                java.lang.Object r0 = r0.next()
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class f<T> extends com.bumptech.glide.repackaged.com.google.common.collect.b<T> {
        final /* synthetic */ java.util.Iterator c;
        final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.base.e d;

        f(java.util.Iterator r1, com.bumptech.glide.repackaged.com.google.common.base.e r2) {
                r0 = this;
                r0.c = r1
                r0.d = r2
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.b
        protected T a() {
                r2 = this;
            L0:
                java.util.Iterator r0 = r2.c
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto L17
                java.util.Iterator r0 = r2.c
                java.lang.Object r0 = r0.next()
                com.bumptech.glide.repackaged.com.google.common.base.e r1 = r2.d
                boolean r1 = r1.apply(r0)
                if (r1 == 0) goto L0
                return r0
            L17:
                java.lang.Object r0 = r2.b()
                return r0
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T, F] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class g<F, T> extends com.bumptech.glide.repackaged.com.google.common.collect.s0<F, T> {
        final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.base.a b;

        g(java.util.Iterator r1, com.bumptech.glide.repackaged.com.google.common.base.a r2) {
                r0 = this;
                r0.b = r2
                r0.<init>(r1)
                return
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.s0
        T a(F r2) {
                r1 = this;
                com.bumptech.glide.repackaged.com.google.common.base.a r0 = r1.b
                java.lang.Object r2 = r0.apply(r2)
                return r2
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class h<E> implements com.bumptech.glide.repackaged.com.google.common.collect.c0<E> {
        private final java.util.Iterator<? extends E> a;
        private boolean b;
        private E c;

        public h(java.util.Iterator<? extends E> r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
                java.util.Iterator r1 = (java.util.Iterator) r1
                r0.a = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                boolean r0 = r1.b
                if (r0 != 0) goto Lf
                java.util.Iterator<? extends E> r0 = r1.a
                boolean r0 = r0.hasNext()
                if (r0 == 0) goto Ld
                goto Lf
            Ld:
                r0 = 0
                return r0
            Lf:
                r0 = 1
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.c0, java.util.Iterator
        public E next() {
                r2 = this;
                boolean r0 = r2.b
                if (r0 != 0) goto Lb
                java.util.Iterator<? extends E> r0 = r2.a
                java.lang.Object r0 = r0.next()
                return r0
            Lb:
                E r0 = r2.c
                r1 = 0
                r2.b = r1
                r1 = 0
                r2.c = r1
                return r0
        }

        @Override // com.bumptech.glide.repackaged.com.google.common.collect.c0
        public E peek() {
                r1 = this;
                boolean r0 = r1.b
                if (r0 != 0) goto Lf
                java.util.Iterator<? extends E> r0 = r1.a
                java.lang.Object r0 = r0.next()
                r1.c = r0
                r0 = 1
                r1.b = r0
            Lf:
                E r0 = r1.c
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.b
                r0 = r0 ^ 1
                java.lang.String r1 = "Can't remove after you've peeked at next"
                com.bumptech.glide.repackaged.com.google.common.base.d.o(r0, r1)
                java.util.Iterator<? extends E> r0 = r2.a
                r0.remove()
                return
        }
    }

    static {
            com.bumptech.glide.repackaged.com.google.common.collect.v$c r0 = new com.bumptech.glide.repackaged.com.google.common.collect.v$c
            r0.<init>()
            com.bumptech.glide.repackaged.com.google.common.collect.v.a = r0
            com.bumptech.glide.repackaged.com.google.common.collect.v$d r0 = new com.bumptech.glide.repackaged.com.google.common.collect.v$d
            r0.<init>()
            com.bumptech.glide.repackaged.com.google.common.collect.v.b = r0
            return
    }

    public v() {
            r1 = this;
            r1.<init>()
            return
    }

    public static <T> boolean a(java.util.Collection<T> r2, java.util.Iterator<? extends T> r3) {
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r3)
            r0 = 0
        L7:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L17
            java.lang.Object r1 = r3.next()
            boolean r1 = r2.add(r1)
            r0 = r0 | r1
            goto L7
        L17:
            return r0
    }

    public static <T> boolean b(java.util.Iterator<T> r0, com.bumptech.glide.repackaged.com.google.common.base.e<? super T> r1) {
            int r0 = l(r0, r1)
            r1 = -1
            if (r0 == r1) goto L9
            r0 = 1
            return r0
        L9:
            r0 = 0
            return r0
    }

    static <T> java.util.ListIterator<T> c(java.util.Iterator<T> r0) {
            java.util.ListIterator r0 = (java.util.ListIterator) r0
            return r0
    }

    public static boolean d(java.util.Iterator<?> r0, java.lang.Object r1) {
            com.bumptech.glide.repackaged.com.google.common.base.e r1 = com.bumptech.glide.repackaged.com.google.common.base.f.a(r1)
            boolean r0 = b(r0, r1)
            return r0
    }

    public static boolean e(java.util.Iterator<?> r3, java.util.Iterator<?> r4) {
        L0:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            boolean r0 = r4.hasNext()
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.Object r0 = r3.next()
            java.lang.Object r2 = r4.next()
            boolean r0 = com.bumptech.glide.repackaged.com.google.common.base.c.a(r0, r2)
            if (r0 != 0) goto L0
            return r1
        L1d:
            boolean r3 = r4.hasNext()
            r3 = r3 ^ 1
            return r3
    }

    static <T> com.bumptech.glide.repackaged.com.google.common.collect.v0<T> f() {
            com.bumptech.glide.repackaged.com.google.common.collect.v0<java.lang.Object> r0 = com.bumptech.glide.repackaged.com.google.common.collect.v.a
            return r0
    }

    public static <T> com.bumptech.glide.repackaged.com.google.common.collect.u0<T> g(java.util.Iterator<T> r1, com.bumptech.glide.repackaged.com.google.common.base.e<? super T> r2) {
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
            com.bumptech.glide.repackaged.com.google.common.collect.v$f r0 = new com.bumptech.glide.repackaged.com.google.common.collect.v$f
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.bumptech.glide.repackaged.com.google.common.collect.u0<T> h(T... r2) {
            r0 = 0
            int r1 = r2.length
            com.bumptech.glide.repackaged.com.google.common.collect.v0 r2 = i(r2, r0, r1, r0)
            return r2
    }

    static <T> com.bumptech.glide.repackaged.com.google.common.collect.v0<T> i(T[] r2, int r3, int r4, int r5) {
            if (r4 < 0) goto L4
            r0 = 1
            goto L5
        L4:
            r0 = 0
        L5:
            com.bumptech.glide.repackaged.com.google.common.base.d.d(r0)
            int r0 = r3 + r4
            int r1 = r2.length
            com.bumptech.glide.repackaged.com.google.common.base.d.m(r3, r0, r1)
            com.bumptech.glide.repackaged.com.google.common.base.d.k(r5, r4)
            if (r4 != 0) goto L18
            com.bumptech.glide.repackaged.com.google.common.collect.v0 r2 = f()
            return r2
        L18:
            com.bumptech.glide.repackaged.com.google.common.collect.v$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.v$a
            r0.<init>(r4, r5, r2, r3)
            return r0
    }

    public static <T> T j(java.util.Iterator<? extends T> r1, T r2) {
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto Lb
            java.lang.Object r1 = r1.next()
            return r1
        Lb:
            return r2
    }

    public static <T> T k(java.util.Iterator<T> r4) {
            java.lang.Object r0 = r4.next()
            boolean r1 = r4.hasNext()
            if (r1 != 0) goto Lb
            return r0
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "expected one element but was: <"
            r2.append(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.append(r0)
            r0 = 0
        L25:
            r2 = 4
            if (r0 >= r2) goto L49
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L49
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = ", "
            r2.append(r3)
            java.lang.Object r3 = r4.next()
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.append(r2)
            int r0 = r0 + 1
            goto L25
        L49:
            boolean r4 = r4.hasNext()
            if (r4 == 0) goto L54
            java.lang.String r4 = ", ..."
            r1.append(r4)
        L54:
            r4 = 62
            r1.append(r4)
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r0 = r1.toString()
            r4.<init>(r0)
            throw r4
    }

    public static <T> int l(java.util.Iterator<T> r2, com.bumptech.glide.repackaged.com.google.common.base.e<? super T> r3) {
            java.lang.String r0 = "predicate"
            com.bumptech.glide.repackaged.com.google.common.base.d.j(r3, r0)
            r0 = 0
        L6:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L1a
            java.lang.Object r1 = r2.next()
            boolean r1 = r3.apply(r1)
            if (r1 == 0) goto L17
            return r0
        L17:
            int r0 = r0 + 1
            goto L6
        L1a:
            r2 = -1
            return r2
    }

    public static <T> com.bumptech.glide.repackaged.com.google.common.collect.c0<T> m(java.util.Iterator<? extends T> r1) {
            boolean r0 = r1 instanceof com.bumptech.glide.repackaged.com.google.common.collect.v.h
            if (r0 == 0) goto L7
            com.bumptech.glide.repackaged.com.google.common.collect.v$h r1 = (com.bumptech.glide.repackaged.com.google.common.collect.v.h) r1
            return r1
        L7:
            com.bumptech.glide.repackaged.com.google.common.collect.v$h r0 = new com.bumptech.glide.repackaged.com.google.common.collect.v$h
            r0.<init>(r1)
            return r0
    }

    public static <T> com.bumptech.glide.repackaged.com.google.common.collect.u0<T> n(T r1) {
            com.bumptech.glide.repackaged.com.google.common.collect.v$b r0 = new com.bumptech.glide.repackaged.com.google.common.collect.v$b
            r0.<init>(r1)
            return r0
    }

    public static java.lang.String o(java.util.Iterator<?> r3) {
            com.bumptech.glide.repackaged.com.google.common.base.b r0 = com.bumptech.glide.repackaged.com.google.common.collect.g.a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r2 = 91
            r1.append(r2)
            java.lang.StringBuilder r3 = r0.c(r1, r3)
            r0 = 93
            r3.append(r0)
            java.lang.String r3 = r3.toString()
            return r3
    }

    public static <F, T> java.util.Iterator<T> p(java.util.Iterator<F> r1, com.bumptech.glide.repackaged.com.google.common.base.a<? super F, ? extends T> r2) {
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
            com.bumptech.glide.repackaged.com.google.common.collect.v$g r0 = new com.bumptech.glide.repackaged.com.google.common.collect.v$g
            r0.<init>(r1, r2)
            return r0
    }

    public static <T> com.bumptech.glide.repackaged.com.google.common.collect.u0<T> q(java.util.Iterator<T> r1) {
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            boolean r0 = r1 instanceof com.bumptech.glide.repackaged.com.google.common.collect.u0
            if (r0 == 0) goto La
            com.bumptech.glide.repackaged.com.google.common.collect.u0 r1 = (com.bumptech.glide.repackaged.com.google.common.collect.u0) r1
            return r1
        La:
            com.bumptech.glide.repackaged.com.google.common.collect.v$e r0 = new com.bumptech.glide.repackaged.com.google.common.collect.v$e
            r0.<init>(r1)
            return r0
    }
}

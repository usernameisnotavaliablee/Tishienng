package com.bumptech.glide.repackaged.com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class w {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a<F, T> extends java.util.AbstractList<T> implements java.io.Serializable, java.util.RandomAccess {
        final java.util.List<F> a;
        final com.bumptech.glide.repackaged.com.google.common.base.a<? super F, ? extends T> b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: com.bumptech.glide.repackaged.com.google.common.collect.w$a$a, reason: collision with other inner class name */
        class C0038a extends com.bumptech.glide.repackaged.com.google.common.collect.t0<F, T> {
            final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.w.a b;

            C0038a(com.bumptech.glide.repackaged.com.google.common.collect.w.a r1, java.util.ListIterator r2) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>(r2)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.s0
            T a(F r2) {
                    r1 = this;
                    com.bumptech.glide.repackaged.com.google.common.collect.w$a r0 = r1.b
                    com.bumptech.glide.repackaged.com.google.common.base.a<? super F, ? extends T> r0 = r0.b
                    java.lang.Object r2 = r0.apply(r2)
                    return r2
            }
        }

        a(java.util.List<F> r1, com.bumptech.glide.repackaged.com.google.common.base.a<? super F, ? extends T> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
                java.util.List r1 = (java.util.List) r1
                r0.a = r1
                java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
                com.bumptech.glide.repackaged.com.google.common.base.a r1 = (com.bumptech.glide.repackaged.com.google.common.base.a) r1
                r0.b = r1
                return
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
                r1 = this;
                java.util.List<F> r0 = r1.a
                r0.clear()
                return
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int r3) {
                r2 = this;
                com.bumptech.glide.repackaged.com.google.common.base.a<? super F, ? extends T> r0 = r2.b
                java.util.List<F> r1 = r2.a
                java.lang.Object r3 = r1.get(r3)
                java.lang.Object r3 = r0.apply(r3)
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean isEmpty() {
                r1 = this;
                java.util.List<F> r0 = r1.a
                boolean r0 = r0.isEmpty()
                return r0
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public java.util.Iterator<T> iterator() {
                r1 = this;
                java.util.ListIterator r0 = r1.listIterator()
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public java.util.ListIterator<T> listIterator(int r3) {
                r2 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.w$a$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.w$a$a
                java.util.List<F> r1 = r2.a
                java.util.ListIterator r3 = r1.listIterator(r3)
                r0.<init>(r2, r3)
                return r0
        }

        @Override // java.util.AbstractList, java.util.List
        public T remove(int r3) {
                r2 = this;
                com.bumptech.glide.repackaged.com.google.common.base.a<? super F, ? extends T> r0 = r2.b
                java.util.List<F> r1 = r2.a
                java.lang.Object r3 = r1.remove(r3)
                java.lang.Object r3 = r0.apply(r3)
                return r3
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<F> r0 = r1.a
                int r0 = r0.size()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b<F, T> extends java.util.AbstractSequentialList<T> implements java.io.Serializable {
        final java.util.List<F> a;
        final com.bumptech.glide.repackaged.com.google.common.base.a<? super F, ? extends T> b;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        class a extends com.bumptech.glide.repackaged.com.google.common.collect.t0<F, T> {
            final /* synthetic */ com.bumptech.glide.repackaged.com.google.common.collect.w.b b;

            a(com.bumptech.glide.repackaged.com.google.common.collect.w.b r1, java.util.ListIterator r2) {
                    r0 = this;
                    r0.b = r1
                    r0.<init>(r2)
                    return
            }

            @Override // com.bumptech.glide.repackaged.com.google.common.collect.s0
            T a(F r2) {
                    r1 = this;
                    com.bumptech.glide.repackaged.com.google.common.collect.w$b r0 = r1.b
                    com.bumptech.glide.repackaged.com.google.common.base.a<? super F, ? extends T> r0 = r0.b
                    java.lang.Object r2 = r0.apply(r2)
                    return r2
            }
        }

        b(java.util.List<F> r1, com.bumptech.glide.repackaged.com.google.common.base.a<? super F, ? extends T> r2) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
                java.util.List r1 = (java.util.List) r1
                r0.a = r1
                java.lang.Object r1 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r2)
                com.bumptech.glide.repackaged.com.google.common.base.a r1 = (com.bumptech.glide.repackaged.com.google.common.base.a) r1
                r0.b = r1
                return
        }

        @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
                r1 = this;
                java.util.List<F> r0 = r1.a
                r0.clear()
                return
        }

        @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
        public java.util.ListIterator<T> listIterator(int r3) {
                r2 = this;
                com.bumptech.glide.repackaged.com.google.common.collect.w$b$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.w$b$a
                java.util.List<F> r1 = r2.a
                java.util.ListIterator r3 = r1.listIterator(r3)
                r0.<init>(r2, r3)
                return r0
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
                r1 = this;
                java.util.List<F> r0 = r1.a
                int r0 = r0.size()
                return r0
        }
    }

    public w() {
            r1 = this;
            r1.<init>()
            return
    }

    static boolean a(java.util.List<?> r6, java.lang.Object r7) {
            java.lang.Object r0 = com.bumptech.glide.repackaged.com.google.common.base.d.i(r6)
            r1 = 1
            if (r7 != r0) goto L8
            return r1
        L8:
            boolean r0 = r7 instanceof java.util.List
            r2 = 0
            if (r0 != 0) goto Le
            return r2
        Le:
            java.util.List r7 = (java.util.List) r7
            int r0 = r6.size()
            int r3 = r7.size()
            if (r0 == r3) goto L1b
            return r2
        L1b:
            boolean r3 = r6 instanceof java.util.RandomAccess
            if (r3 == 0) goto L39
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L39
            r3 = 0
        L24:
            if (r3 >= r0) goto L38
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = com.bumptech.glide.repackaged.com.google.common.base.c.a(r4, r5)
            if (r4 != 0) goto L35
            return r2
        L35:
            int r3 = r3 + 1
            goto L24
        L38:
            return r1
        L39:
            java.util.Iterator r6 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
            boolean r6 = com.bumptech.glide.repackaged.com.google.common.collect.v.e(r6, r7)
            return r6
    }

    static int b(java.util.List<?> r1, java.lang.Object r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L9
            int r1 = c(r1, r2)
            return r1
        L9:
            java.util.ListIterator r1 = r1.listIterator()
        Ld:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L22
            java.lang.Object r0 = r1.next()
            boolean r0 = com.bumptech.glide.repackaged.com.google.common.base.c.a(r2, r0)
            if (r0 == 0) goto Ld
            int r1 = r1.previousIndex()
            return r1
        L22:
            r1 = -1
            return r1
    }

    private static int c(java.util.List<?> r3, java.lang.Object r4) {
            int r0 = r3.size()
            r1 = 0
            if (r4 != 0) goto L13
        L7:
            if (r1 >= r0) goto L23
            java.lang.Object r4 = r3.get(r1)
            if (r4 != 0) goto L10
            return r1
        L10:
            int r1 = r1 + 1
            goto L7
        L13:
            if (r1 >= r0) goto L23
            java.lang.Object r2 = r3.get(r1)
            boolean r2 = r4.equals(r2)
            if (r2 == 0) goto L20
            return r1
        L20:
            int r1 = r1 + 1
            goto L13
        L23:
            r3 = -1
            return r3
    }

    static int d(java.util.List<?> r1, java.lang.Object r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto L9
            int r1 = e(r1, r2)
            return r1
        L9:
            int r0 = r1.size()
            java.util.ListIterator r1 = r1.listIterator(r0)
        L11:
            boolean r0 = r1.hasPrevious()
            if (r0 == 0) goto L26
            java.lang.Object r0 = r1.previous()
            boolean r0 = com.bumptech.glide.repackaged.com.google.common.base.c.a(r2, r0)
            if (r0 == 0) goto L11
            int r1 = r1.nextIndex()
            return r1
        L26:
            r1 = -1
            return r1
    }

    private static int e(java.util.List<?> r2, java.lang.Object r3) {
            if (r3 != 0) goto L14
            int r3 = r2.size()
            int r3 = r3 + (-1)
        L8:
            if (r3 < 0) goto L2a
            java.lang.Object r0 = r2.get(r3)
            if (r0 != 0) goto L11
            return r3
        L11:
            int r3 = r3 + (-1)
            goto L8
        L14:
            int r0 = r2.size()
            int r0 = r0 + (-1)
        L1a:
            if (r0 < 0) goto L2a
            java.lang.Object r1 = r2.get(r0)
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L27
            return r0
        L27:
            int r0 = r0 + (-1)
            goto L1a
        L2a:
            r2 = -1
            return r2
    }

    public static <E> java.util.ArrayList<E> f() {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            return r0
    }

    public static <E> java.util.ArrayList<E> g(java.lang.Iterable<? extends E> r1) {
            com.bumptech.glide.repackaged.com.google.common.base.d.i(r1)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L11
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Collection r1 = com.bumptech.glide.repackaged.com.google.common.collect.g.a(r1)
            r0.<init>(r1)
            return r0
        L11:
            java.util.Iterator r1 = r1.iterator()
            java.util.ArrayList r1 = h(r1)
            return r1
    }

    public static <E> java.util.ArrayList<E> h(java.util.Iterator<? extends E> r1) {
            java.util.ArrayList r0 = f()
            com.bumptech.glide.repackaged.com.google.common.collect.v.a(r0, r1)
            return r0
    }

    public static <F, T> java.util.List<T> i(java.util.List<F> r1, com.bumptech.glide.repackaged.com.google.common.base.a<? super F, ? extends T> r2) {
            boolean r0 = r1 instanceof java.util.RandomAccess
            if (r0 == 0) goto La
            com.bumptech.glide.repackaged.com.google.common.collect.w$a r0 = new com.bumptech.glide.repackaged.com.google.common.collect.w$a
            r0.<init>(r1, r2)
            return r0
        La:
            com.bumptech.glide.repackaged.com.google.common.collect.w$b r0 = new com.bumptech.glide.repackaged.com.google.common.collect.w$b
            r0.<init>(r1, r2)
            return r0
    }
}

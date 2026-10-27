package com.bytedance.adsdk.lottie;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
abstract class az<K, V> {
    com.bytedance.adsdk.lottie.az<K, V>.xt xt;

    final class j<T> implements java.util.Iterator<T> {
        int cw;
        final int j;

        /* renamed from: r, reason: collision with root package name */
        boolean f1760r;
        final /* synthetic */ com.bytedance.adsdk.lottie.az up;
        int xt;

        j(com.bytedance.adsdk.lottie.az r2, int r3) {
                r1 = this;
                r1.up = r2
                r1.<init>()
                r0 = 0
                r1.f1760r = r0
                r1.j = r3
                int r2 = r2.j()
                r1.xt = r2
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r2 = this;
                int r0 = r2.cw
                int r1 = r2.xt
                if (r0 >= r1) goto L8
                r0 = 1
                return r0
            L8:
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r3 = this;
                boolean r0 = r3.hasNext()
                if (r0 == 0) goto L19
                com.bytedance.adsdk.lottie.az r0 = r3.up
                int r1 = r3.cw
                int r2 = r3.j
                java.lang.Object r0 = r0.j(r1, r2)
                int r1 = r3.cw
                r2 = 1
                int r1 = r1 + r2
                r3.cw = r1
                r3.f1760r = r2
                return r0
            L19:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                boolean r0 = r2.f1760r
                if (r0 == 0) goto L19
                int r0 = r2.cw
                int r0 = r0 + (-1)
                r2.cw = r0
                int r1 = r2.xt
                int r1 = r1 + (-1)
                r2.xt = r1
                r1 = 0
                r2.f1760r = r1
                com.bytedance.adsdk.lottie.az r1 = r2.up
                r1.j(r0)
                return
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    final class xt implements java.util.Set<K> {
        final /* synthetic */ com.bytedance.adsdk.lottie.az j;

        xt(com.bytedance.adsdk.lottie.az r1) {
                r0 = this;
                r0.j = r1
                r0.<init>()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(java.util.Collection<? extends K> r1) {
                r0 = this;
                java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
                r1.<init>()
                throw r1
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
                r1 = this;
                com.bytedance.adsdk.lottie.az r0 = r1.j
                r0.cw()
                return
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(java.lang.Object r2) {
                r1 = this;
                com.bytedance.adsdk.lottie.az r0 = r1.j
                int r2 = r0.j(r2)
                if (r2 < 0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(java.util.Collection<?> r2) {
                r1 = this;
                com.bytedance.adsdk.lottie.az r0 = r1.j
                java.util.Map r0 = r0.xt()
                boolean r2 = com.bytedance.adsdk.lottie.az.j(r0, r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(java.lang.Object r1) {
                r0 = this;
                boolean r1 = com.bytedance.adsdk.lottie.az.j(r0, r1)
                return r1
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
                r4 = this;
                com.bytedance.adsdk.lottie.az r0 = r4.j
                int r0 = r0.j()
                int r0 = r0 + (-1)
                r1 = 0
                r2 = 0
            La:
                if (r0 < 0) goto L1e
                com.bytedance.adsdk.lottie.az r3 = r4.j
                java.lang.Object r3 = r3.j(r0, r1)
                if (r3 != 0) goto L16
                r3 = 0
                goto L1a
            L16:
                int r3 = r3.hashCode()
            L1a:
                int r2 = r2 + r3
                int r0 = r0 + (-1)
                goto La
            L1e:
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
                r1 = this;
                com.bytedance.adsdk.lottie.az r0 = r1.j
                int r0 = r0.j()
                if (r0 != 0) goto La
                r0 = 1
                return r0
            La:
                r0 = 0
                return r0
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public java.util.Iterator<K> iterator() {
                r3 = this;
                com.bytedance.adsdk.lottie.az$j r0 = new com.bytedance.adsdk.lottie.az$j
                com.bytedance.adsdk.lottie.az r1 = r3.j
                r2 = 0
                r0.<init>(r1, r2)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(java.lang.Object r2) {
                r1 = this;
                com.bytedance.adsdk.lottie.az r0 = r1.j
                int r2 = r0.j(r2)
                if (r2 < 0) goto Lf
                com.bytedance.adsdk.lottie.az r0 = r1.j
                r0.j(r2)
                r2 = 1
                return r2
            Lf:
                r2 = 0
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(java.util.Collection<?> r2) {
                r1 = this;
                com.bytedance.adsdk.lottie.az r0 = r1.j
                java.util.Map r0 = r0.xt()
                boolean r2 = com.bytedance.adsdk.lottie.az.xt(r0, r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(java.util.Collection<?> r2) {
                r1 = this;
                com.bytedance.adsdk.lottie.az r0 = r1.j
                java.util.Map r0 = r0.xt()
                boolean r2 = com.bytedance.adsdk.lottie.az.cw(r0, r2)
                return r2
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
                r1 = this;
                com.bytedance.adsdk.lottie.az r0 = r1.j
                int r0 = r0.j()
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public java.lang.Object[] toArray() {
                r2 = this;
                com.bytedance.adsdk.lottie.az r0 = r2.j
                r1 = 0
                java.lang.Object[] r0 = r0.xt(r1)
                return r0
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] r3) {
                r2 = this;
                com.bytedance.adsdk.lottie.az r0 = r2.j
                r1 = 0
                java.lang.Object[] r3 = r0.j(r3, r1)
                return r3
        }
    }

    az() {
            r0 = this;
            r0.<init>()
            return
    }

    public static <K, V> boolean cw(java.util.Map<K, V> r3, java.util.Collection<?> r4) {
            int r0 = r3.size()
            java.util.Set r1 = r3.keySet()
            java.util.Iterator r1 = r1.iterator()
        Lc:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L20
            java.lang.Object r2 = r1.next()
            boolean r2 = r4.contains(r2)
            if (r2 != 0) goto Lc
            r1.remove()
            goto Lc
        L20:
            int r3 = r3.size()
            if (r0 == r3) goto L28
            r3 = 1
            return r3
        L28:
            r3 = 0
            return r3
    }

    public static <K, V> boolean j(java.util.Map<K, V> r1, java.util.Collection<?> r2) {
            java.util.Iterator r2 = r2.iterator()
        L4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L16
            java.lang.Object r0 = r2.next()
            boolean r0 = r1.containsKey(r0)
            if (r0 != 0) goto L4
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public static <T> boolean j(java.util.Set<T> r4, java.lang.Object r5) {
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof java.util.Set
            r2 = 0
            if (r1 == 0) goto L1c
            java.util.Set r5 = (java.util.Set) r5
            int r1 = r4.size()     // Catch: java.lang.Throwable -> L1c
            int r3 = r5.size()     // Catch: java.lang.Throwable -> L1c
            if (r1 != r3) goto L1c
            boolean r4 = r4.containsAll(r5)     // Catch: java.lang.Throwable -> L1c
            if (r4 == 0) goto L1c
            return r0
        L1c:
            return r2
    }

    public static <K, V> boolean xt(java.util.Map<K, V> r2, java.util.Collection<?> r3) {
            int r0 = r2.size()
            java.util.Iterator r3 = r3.iterator()
        L8:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L16
            java.lang.Object r1 = r3.next()
            r2.remove(r1)
            goto L8
        L16:
            int r2 = r2.size()
            if (r0 == r2) goto L1e
            r2 = 1
            return r2
        L1e:
            r2 = 0
            return r2
    }

    protected abstract void cw();

    protected abstract int j();

    protected abstract int j(java.lang.Object r1);

    protected abstract java.lang.Object j(int r1, int r2);

    protected abstract void j(int r1);

    public <T> T[] j(T[] r4, int r5) {
            r3 = this;
            int r0 = r3.j()
            int r1 = r4.length
            if (r1 >= r0) goto L15
            java.lang.Class r4 = r4.getClass()
            java.lang.Class r4 = r4.getComponentType()
            java.lang.Object r4 = java.lang.reflect.Array.newInstance(r4, r0)
            java.lang.Object[] r4 = (java.lang.Object[]) r4
        L15:
            r1 = 0
        L16:
            if (r1 >= r0) goto L21
            java.lang.Object r2 = r3.j(r1, r5)
            r4[r1] = r2
            int r1 = r1 + 1
            goto L16
        L21:
            int r5 = r4.length
            if (r5 <= r0) goto L27
            r5 = 0
            r4[r0] = r5
        L27:
            return r4
    }

    public java.util.Set<K> r() {
            r1 = this;
            com.bytedance.adsdk.lottie.az<K, V>$xt r0 = r1.xt
            if (r0 != 0) goto Lb
            com.bytedance.adsdk.lottie.az$xt r0 = new com.bytedance.adsdk.lottie.az$xt
            r0.<init>(r1)
            r1.xt = r0
        Lb:
            com.bytedance.adsdk.lottie.az<K, V>$xt r0 = r1.xt
            return r0
    }

    protected abstract java.util.Map<K, V> xt();

    public java.lang.Object[] xt(int r5) {
            r4 = this;
            int r0 = r4.j()
            java.lang.Object[] r1 = new java.lang.Object[r0]
            r2 = 0
        L7:
            if (r2 >= r0) goto L12
            java.lang.Object r3 = r4.j(r2, r5)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L7
        L12:
            return r1
    }
}

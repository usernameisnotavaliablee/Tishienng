package kotlin.reflect.jvm.internal.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class j<E> extends java.util.AbstractList<E> implements java.util.RandomAccess {
    private int a;
    private java.lang.Object b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b<T> implements java.util.Iterator<T> {
        private static final kotlin.reflect.jvm.internal.impl.utils.j.b a = null;

        static {
                kotlin.reflect.jvm.internal.impl.utils.j$b r0 = new kotlin.reflect.jvm.internal.impl.utils.j$b
                r0.<init>()
                kotlin.reflect.jvm.internal.impl.utils.j.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public static <T> kotlin.reflect.jvm.internal.impl.utils.j.b<T> a() {
                kotlin.reflect.jvm.internal.impl.utils.j$b r0 = kotlin.reflect.jvm.internal.impl.utils.j.b.a
                return r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r0.<init>()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c extends kotlin.reflect.jvm.internal.impl.utils.j.d<E> {
        private final int b;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.utils.j c;

        public c(kotlin.reflect.jvm.internal.impl.utils.j r2) {
                r1 = this;
                r1.c = r2
                r0 = 0
                r1.<init>(r0)
                int r2 = kotlin.reflect.jvm.internal.impl.utils.j.d(r2)
                r1.b = r2
                return
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.j.d
        protected void a() {
                r3 = this;
                kotlin.reflect.jvm.internal.impl.utils.j r0 = r3.c
                int r0 = kotlin.reflect.jvm.internal.impl.utils.j.f(r0)
                int r1 = r3.b
                if (r0 != r1) goto Lb
                return
            Lb:
                java.util.ConcurrentModificationException r0 = new java.util.ConcurrentModificationException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "ModCount: "
                r1.append(r2)
                kotlin.reflect.jvm.internal.impl.utils.j r2 = r3.c
                int r2 = kotlin.reflect.jvm.internal.impl.utils.j.g(r2)
                r1.append(r2)
                java.lang.String r2 = "; expected: "
                r1.append(r2)
                int r2 = r3.b
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.j.d
        protected E b() {
                r1 = this;
                kotlin.reflect.jvm.internal.impl.utils.j r0 = r1.c
                java.lang.Object r0 = kotlin.reflect.jvm.internal.impl.utils.j.e(r0)
                return r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r1 = this;
                r1.a()
                kotlin.reflect.jvm.internal.impl.utils.j r0 = r1.c
                r0.clear()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static abstract class d<T> implements java.util.Iterator<T> {
        private boolean a;

        private d() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ d(kotlin.reflect.jvm.internal.impl.utils.j.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        protected abstract void a();

        protected abstract T b();

        @Override // java.util.Iterator
        public final boolean hasNext() {
                r1 = this;
                boolean r0 = r1.a
                r0 = r0 ^ 1
                return r0
        }

        @Override // java.util.Iterator
        public final T next() {
                r1 = this;
                boolean r0 = r1.a
                if (r0 != 0) goto Lf
                r0 = 1
                r1.a = r0
                r1.a()
                java.lang.Object r0 = r1.b()
                return r0
            Lf:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }
    }

    public j() {
            r0 = this;
            r0.<init>()
            return
    }

    private static /* synthetic */ void a(int r10) {
            r0 = 7
            r1 = 6
            r2 = 5
            r3 = 3
            r4 = 2
            if (r10 == r4) goto L12
            if (r10 == r3) goto L12
            if (r10 == r2) goto L12
            if (r10 == r1) goto L12
            if (r10 == r0) goto L12
            java.lang.String r5 = "Argument for @NotNull parameter '%s' of %s.%s must not be null"
            goto L14
        L12:
            java.lang.String r5 = "@NotNull method %s.%s must not return null"
        L14:
            if (r10 == r4) goto L20
            if (r10 == r3) goto L20
            if (r10 == r2) goto L20
            if (r10 == r1) goto L20
            if (r10 == r0) goto L20
            r6 = 3
            goto L21
        L20:
            r6 = 2
        L21:
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.String r7 = "kotlin/reflect/jvm/internal/impl/utils/SmartList"
            r8 = 0
            switch(r10) {
                case 2: goto L33;
                case 3: goto L33;
                case 4: goto L2e;
                case 5: goto L33;
                case 6: goto L33;
                case 7: goto L33;
                default: goto L29;
            }
        L29:
            java.lang.String r9 = "elements"
            r6[r8] = r9
            goto L35
        L2e:
            java.lang.String r9 = "a"
            r6[r8] = r9
            goto L35
        L33:
            r6[r8] = r7
        L35:
            java.lang.String r8 = "toArray"
            r9 = 1
            if (r10 == r4) goto L48
            if (r10 == r3) goto L48
            if (r10 == r2) goto L45
            if (r10 == r1) goto L45
            if (r10 == r0) goto L45
            r6[r9] = r7
            goto L4c
        L45:
            r6[r9] = r8
            goto L4c
        L48:
            java.lang.String r7 = "iterator"
            r6[r9] = r7
        L4c:
            switch(r10) {
                case 2: goto L56;
                case 3: goto L56;
                case 4: goto L54;
                case 5: goto L56;
                case 6: goto L56;
                case 7: goto L56;
                default: goto L4f;
            }
        L4f:
            java.lang.String r7 = "<init>"
            r6[r4] = r7
            goto L56
        L54:
            r6[r4] = r8
        L56:
            java.lang.String r5 = java.lang.String.format(r5, r6)
            if (r10 == r4) goto L6a
            if (r10 == r3) goto L6a
            if (r10 == r2) goto L6a
            if (r10 == r1) goto L6a
            if (r10 == r0) goto L6a
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            r10.<init>(r5)
            goto L6f
        L6a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            r10.<init>(r5)
        L6f:
            throw r10
    }

    static /* synthetic */ int d(kotlin.reflect.jvm.internal.impl.utils.j r0) {
            int r0 = r0.modCount
            return r0
    }

    static /* synthetic */ java.lang.Object e(kotlin.reflect.jvm.internal.impl.utils.j r0) {
            java.lang.Object r0 = r0.b
            return r0
    }

    static /* synthetic */ int f(kotlin.reflect.jvm.internal.impl.utils.j r0) {
            int r0 = r0.modCount
            return r0
    }

    static /* synthetic */ int g(kotlin.reflect.jvm.internal.impl.utils.j r0) {
            int r0 = r0.modCount
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int r6, E r7) {
            r5 = this;
            if (r6 < 0) goto L46
            int r0 = r5.a
            if (r6 > r0) goto L46
            r1 = 1
            if (r0 != 0) goto Lc
            r5.b = r7
            goto L3b
        Lc:
            r2 = 0
            if (r0 != r1) goto L1d
            if (r6 != 0) goto L1d
            java.lang.Object r6 = r5.b
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            r0[r2] = r7
            r0[r1] = r6
            r5.b = r0
            goto L3b
        L1d:
            int r3 = r0 + 1
            java.lang.Object[] r3 = new java.lang.Object[r3]
            if (r0 != r1) goto L28
            java.lang.Object r0 = r5.b
            r3[r2] = r0
            goto L37
        L28:
            java.lang.Object r0 = r5.b
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.System.arraycopy(r0, r2, r3, r2, r6)
            int r2 = r6 + 1
            int r4 = r5.a
            int r4 = r4 - r6
            java.lang.System.arraycopy(r0, r6, r3, r2, r4)
        L37:
            r3[r6] = r7
            r5.b = r3
        L3b:
            int r6 = r5.a
            int r6 = r6 + r1
            r5.a = r6
            int r6 = r5.modCount
            int r6 = r6 + r1
            r5.modCount = r6
            return
        L46:
            java.lang.IndexOutOfBoundsException r7 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Index: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ", Size: "
            r0.append(r6)
            int r6 = r5.a
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            r7.<init>(r6)
            throw r7
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(E r8) {
            r7 = this;
            int r0 = r7.a
            r1 = 1
            if (r0 != 0) goto L8
            r7.b = r8
            goto L32
        L8:
            r2 = 2
            r3 = 0
            if (r0 != r1) goto L17
            java.lang.Object r0 = r7.b
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r2[r3] = r0
            r2[r1] = r8
            r7.b = r2
            goto L32
        L17:
            java.lang.Object r4 = r7.b
            java.lang.Object[] r4 = (java.lang.Object[]) r4
            int r5 = r4.length
            if (r0 < r5) goto L2e
            int r6 = r5 * 3
            int r6 = r6 / r2
            int r6 = r6 + r1
            int r0 = r0 + r1
            if (r6 >= r0) goto L26
            r6 = r0
        L26:
            java.lang.Object[] r0 = new java.lang.Object[r6]
            r7.b = r0
            java.lang.System.arraycopy(r4, r3, r0, r3, r5)
            r4 = r0
        L2e:
            int r0 = r7.a
            r4[r0] = r8
        L32:
            int r8 = r7.a
            int r8 = r8 + r1
            r7.a = r8
            int r8 = r7.modCount
            int r8 = r8 + r1
            r7.modCount = r8
            return r1
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
            r1 = this;
            r0 = 0
            r1.b = r0
            r0 = 0
            r1.a = r0
            int r0 = r1.modCount
            int r0 = r0 + 1
            r1.modCount = r0
            return
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int r4) {
            r3 = this;
            if (r4 < 0) goto L13
            int r0 = r3.a
            if (r4 >= r0) goto L13
            r1 = 1
            if (r0 != r1) goto Lc
            java.lang.Object r4 = r3.b
            return r4
        Lc:
            java.lang.Object r0 = r3.b
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r4 = r0[r4]
            return r4
        L13:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", Size: "
            r1.append(r4)
            int r4 = r3.a
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<E> iterator() {
            r2 = this;
            int r0 = r2.a
            if (r0 != 0) goto Lf
            kotlin.reflect.jvm.internal.impl.utils.j$b r0 = kotlin.reflect.jvm.internal.impl.utils.j.b.a()
            if (r0 != 0) goto Le
            r1 = 2
            a(r1)
        Le:
            return r0
        Lf:
            r1 = 1
            if (r0 != r1) goto L18
            kotlin.reflect.jvm.internal.impl.utils.j$c r0 = new kotlin.reflect.jvm.internal.impl.utils.j$c
            r0.<init>(r2)
            return r0
        L18:
            java.util.Iterator r0 = super.iterator()
            if (r0 != 0) goto L22
            r1 = 3
            a(r1)
        L22:
            return r0
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int r7) {
            r6 = this;
            if (r7 < 0) goto L39
            int r0 = r6.a
            if (r7 >= r0) goto L39
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lf
            java.lang.Object r7 = r6.b
            r6.b = r1
            goto L2e
        Lf:
            java.lang.Object r3 = r6.b
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r4 = r3[r7]
            r5 = 2
            if (r0 != r5) goto L1f
            int r7 = 1 - r7
            r7 = r3[r7]
            r6.b = r7
            goto L2d
        L1f:
            int r0 = r0 - r7
            int r0 = r0 - r2
            if (r0 <= 0) goto L28
            int r5 = r7 + 1
            java.lang.System.arraycopy(r3, r5, r3, r7, r0)
        L28:
            int r7 = r6.a
            int r7 = r7 - r2
            r3[r7] = r1
        L2d:
            r7 = r4
        L2e:
            int r0 = r6.a
            int r0 = r0 - r2
            r6.a = r0
            int r0 = r6.modCount
            int r0 = r0 + r2
            r6.modCount = r0
            return r7
        L39:
            java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Index: "
            r1.append(r2)
            r1.append(r7)
            java.lang.String r7 = ", Size: "
            r1.append(r7)
            int r7 = r6.a
            r1.append(r7)
            java.lang.String r7 = r1.toString()
            r0.<init>(r7)
            throw r0
    }

    @Override // java.util.AbstractList, java.util.List
    public E set(int r3, E r4) {
            r2 = this;
            if (r3 < 0) goto L17
            int r0 = r2.a
            if (r3 >= r0) goto L17
            r1 = 1
            if (r0 != r1) goto Le
            java.lang.Object r3 = r2.b
            r2.b = r4
            return r3
        Le:
            java.lang.Object r0 = r2.b
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r1 = r0[r3]
            r0[r3] = r4
            return r1
        L17:
            java.lang.IndexOutOfBoundsException r4 = new java.lang.IndexOutOfBoundsException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Index: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = ", Size: "
            r0.append(r3)
            int r3 = r2.a
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
            r1 = this;
            int r0 = r1.a
            return r0
    }

    @Override // java.util.List
    public void sort(java.util.Comparator<? super E> r4) {
            r3 = this;
            int r0 = r3.a
            r1 = 2
            if (r0 < r1) goto Ld
            java.lang.Object r1 = r3.b
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r2 = 0
            java.util.Arrays.sort(r1, r2, r0, r4)
        Ld:
            return
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    @org.jetbrains.annotations.NotNull
    public <T> T[] toArray(@org.jetbrains.annotations.NotNull T[] r5) {
            r4 = this;
            if (r5 != 0) goto L6
            r0 = 4
            a(r0)
        L6:
            int r0 = r5.length
            int r1 = r4.a
            r2 = 1
            r3 = 0
            if (r1 != r2) goto L27
            if (r0 == 0) goto L14
            java.lang.Object r1 = r4.b
            r5[r3] = r1
            goto L43
        L14:
            java.lang.Class r5 = r5.getClass()
            java.lang.Class r5 = r5.getComponentType()
            java.lang.Object r5 = java.lang.reflect.Array.newInstance(r5, r2)
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            java.lang.Object r0 = r4.b
            r5[r3] = r0
            return r5
        L27:
            if (r0 >= r1) goto L3c
            java.lang.Object r0 = r4.b
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Class r5 = r5.getClass()
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r0, r1, r5)
            if (r5 != 0) goto L3b
            r0 = 6
            a(r0)
        L3b:
            return r5
        L3c:
            if (r1 == 0) goto L43
            java.lang.Object r2 = r4.b
            java.lang.System.arraycopy(r2, r3, r5, r3, r1)
        L43:
            int r1 = r4.a
            if (r0 <= r1) goto L4a
            r0 = 0
            r5[r1] = r0
        L4a:
            return r5
    }
}

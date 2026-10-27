package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o<T> extends kotlin.reflect.jvm.internal.impl.util.c<T> {

    @org.jetbrains.annotations.NotNull
    private final T a;
    private final int b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.util.Iterator<T>, l3.a {
        private boolean a;
        final /* synthetic */ kotlin.reflect.jvm.internal.impl.util.o<T> b;

        a(kotlin.reflect.jvm.internal.impl.util.o<T> r1) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r1 = 1
                r0.a = r1
                return
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                boolean r0 = r1.a
                return r0
        }

        @Override // java.util.Iterator
        public T next() {
                r1 = this;
                boolean r0 = r1.a
                if (r0 == 0) goto Le
                r0 = 0
                r1.a = r0
                kotlin.reflect.jvm.internal.impl.util.o<T> r0 = r1.b
                java.lang.Object r0 = r0.f()
                return r0
            Le:
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public void remove() {
                r2 = this;
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Operation is not supported for read-only collection"
                r0.<init>(r1)
                throw r0
        }
    }

    public o(@org.jetbrains.annotations.NotNull T r2, int r3) {
            r1 = this;
            java.lang.String r0 = "value"
            kotlin.jvm.internal.g0.p(r2, r0)
            r0 = 0
            r1.<init>(r0)
            r1.a = r2
            r1.b = r3
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int a() {
            r1 = this;
            r0 = 1
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public void d(int r1, @org.jetbrains.annotations.NotNull T r2) {
            r0 = this;
            java.lang.String r1 = "value"
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    public final int e() {
            r1 = this;
            int r0 = r1.b
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final T f() {
            r1 = this;
            T r0 = r1.a
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    @org.jetbrains.annotations.Nullable
    public T get(int r2) {
            r1 = this;
            int r0 = r1.b
            if (r2 != r0) goto L7
            T r2 = r1.a
            return r2
        L7:
            r2 = 0
            return r2
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.util.o$a r0 = new kotlin.reflect.jvm.internal.impl.util.o$a
            r0.<init>(r1)
            return r0
    }
}

package kotlin.reflect.jvm.internal.impl.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i extends kotlin.reflect.jvm.internal.impl.util.c {

    @org.jetbrains.annotations.NotNull
    public static final kotlin.reflect.jvm.internal.impl.util.i a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements java.util.Iterator, l3.a {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public java.lang.Void a() {
                r1 = this;
                java.util.NoSuchElementException r0 = new java.util.NoSuchElementException
                r0.<init>()
                throw r0
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // java.util.Iterator
        public /* bridge */ /* synthetic */ java.lang.Object next() {
                r1 = this;
                java.lang.Void r0 = r1.a()
                return r0
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

    static {
            kotlin.reflect.jvm.internal.impl.util.i r0 = new kotlin.reflect.jvm.internal.impl.util.i
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.util.i.a = r0
            return
    }

    private i() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public int a() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public /* bridge */ /* synthetic */ void d(int r1, java.lang.Object r2) {
            r0 = this;
            java.lang.Void r2 = (java.lang.Void) r2
            r0.f(r1, r2)
            return
    }

    @org.jetbrains.annotations.Nullable
    public java.lang.Void e(int r1) {
            r0 = this;
            r1 = 0
            return r1
    }

    public void f(int r1, @org.jetbrains.annotations.NotNull java.lang.Void r2) {
            r0 = this;
            java.lang.String r1 = "value"
            kotlin.jvm.internal.g0.p(r2, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c
    public /* bridge */ /* synthetic */ java.lang.Object get(int r1) {
            r0 = this;
            java.lang.Void r1 = r0.e(r1)
            return r1
    }

    @Override // kotlin.reflect.jvm.internal.impl.util.c, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator iterator() {
            r1 = this;
            kotlin.reflect.jvm.internal.impl.util.i$a r0 = new kotlin.reflect.jvm.internal.impl.util.i$a
            r0.<init>()
            return r0
    }
}

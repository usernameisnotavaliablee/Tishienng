package kotlin.collections;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,206:1\n204#1:208\n204#1:209\n204#1:210\n1#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n106#1:208\n175#1:209\n188#1:210\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class t1<T> extends kotlin.collections.d<T> implements java.util.RandomAccess {

    @org.jetbrains.annotations.NotNull
    private final java.lang.Object[] a;
    private final int b;
    private int c;
    private int d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSlidingWindow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n+ 2 SlidingWindow.kt\nkotlin/collections/RingBuffer\n*L\n1#1,206:1\n204#2:207\n*S KotlinDebug\n*F\n+ 1 SlidingWindow.kt\nkotlin/collections/RingBuffer$iterator$1\n*L\n121#1:207\n*E\n"})
    public static final class a extends kotlin.collections.c<T> {
        private int c;
        private int d;
        final /* synthetic */ kotlin.collections.t1<T> e;

        a(kotlin.collections.t1<T> r2) {
                r1 = this;
                r1.e = r2
                r1.<init>()
                int r0 = r2.size()
                r1.c = r0
                int r2 = kotlin.collections.t1.g(r2)
                r1.d = r2
                return
        }

        @Override // kotlin.collections.c
        protected void a() {
                r2 = this;
                int r0 = r2.c
                if (r0 != 0) goto L8
                r2.c()
                return
            L8:
                kotlin.collections.t1<T> r0 = r2.e
                java.lang.Object[] r0 = kotlin.collections.t1.e(r0)
                int r1 = r2.d
                r0 = r0[r1]
                r2.e(r0)
                kotlin.collections.t1<T> r0 = r2.e
                int r1 = r2.d
                int r1 = r1 + 1
                int r0 = kotlin.collections.t1.f(r0)
                int r1 = r1 % r0
                r2.d = r1
                int r0 = r2.c
                int r0 = r0 + (-1)
                r2.c = r0
                return
        }
    }

    public t1(int r2) {
            r1 = this;
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public t1(@org.jetbrains.annotations.NotNull java.lang.Object[] r3, int r4) {
            r2 = this;
            java.lang.String r0 = "buffer"
            kotlin.jvm.internal.g0.p(r3, r0)
            r2.<init>()
            r2.a = r3
            if (r4 < 0) goto L39
            int r0 = r3.length
            if (r4 > r0) goto L15
            int r3 = r3.length
            r2.b = r3
            r2.d = r4
            return
        L15:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ring buffer filled size: "
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = " cannot be larger than the buffer size: "
            r0.append(r4)
            int r3 = r3.length
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
        L39:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r0 = "ring buffer filled size should not be negative but it is "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r3 = r3.toString()
            r4.<init>(r3)
            throw r4
    }

    public static final /* synthetic */ java.lang.Object[] e(kotlin.collections.t1 r0) {
            java.lang.Object[] r0 = r0.a
            return r0
    }

    public static final /* synthetic */ int f(kotlin.collections.t1 r0) {
            int r0 = r0.b
            return r0
    }

    public static final /* synthetic */ int g(kotlin.collections.t1 r0) {
            int r0 = r0.c
            return r0
    }

    private final int n(int r1, int r2) {
            r0 = this;
            int r1 = r1 + r2
            int r2 = f(r0)
            int r1 = r1 % r2
            return r1
    }

    @Override // kotlin.collections.d, java.util.List
    public T get(int r3) {
            r2 = this;
            kotlin.collections.d$a r0 = kotlin.collections.d.Companion
            int r1 = r2.size()
            r0.b(r3, r1)
            java.lang.Object[] r0 = r2.a
            int r1 = r2.c
            int r1 = r1 + r3
            int r3 = f(r2)
            int r1 = r1 % r3
            r3 = r0[r1]
            return r3
    }

    @Override // kotlin.collections.d, kotlin.collections.b
    public int getSize() {
            r1 = this;
            int r0 = r1.d
            return r0
    }

    @Override // kotlin.collections.d, kotlin.collections.b, java.util.Collection, java.lang.Iterable
    @org.jetbrains.annotations.NotNull
    public java.util.Iterator<T> iterator() {
            r1 = this;
            kotlin.collections.t1$a r0 = new kotlin.collections.t1$a
            r0.<init>(r1)
            return r0
    }

    public final void j(T r4) {
            r3 = this;
            boolean r0 = r3.o()
            if (r0 != 0) goto L1f
            java.lang.Object[] r0 = r3.a
            int r1 = r3.c
            int r2 = r3.size()
            int r1 = r1 + r2
            int r2 = f(r3)
            int r1 = r1 % r2
            r0[r1] = r4
            int r4 = r3.size()
            int r4 = r4 + 1
            r3.d = r4
            return
        L1f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "ring buffer is full"
            r4.<init>(r0)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public final kotlin.collections.t1<T> m(int r3) {
            r2 = this;
            int r0 = r2.b
            int r1 = r0 >> 1
            int r0 = r0 + r1
            int r0 = r0 + 1
            int r3 = kotlin.ranges.t.B(r0, r3)
            int r0 = r2.c
            if (r0 != 0) goto L1b
            java.lang.Object[] r0 = r2.a
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r0, r3)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            goto L21
        L1b:
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object[] r3 = r2.toArray(r3)
        L21:
            kotlin.collections.t1 r0 = new kotlin.collections.t1
            int r1 = r2.size()
            r0.<init>(r3, r1)
            return r0
    }

    public final boolean o() {
            r2 = this;
            int r0 = r2.size()
            int r1 = r2.b
            if (r0 != r1) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    public final void p(int r6) {
            r5 = this;
            if (r6 < 0) goto L5a
            int r0 = r5.size()
            if (r6 > r0) goto L33
            if (r6 <= 0) goto L32
            int r0 = r5.c
            int r1 = r0 + r6
            int r2 = f(r5)
            int r1 = r1 % r2
            r2 = 0
            if (r0 <= r1) goto L24
            java.lang.Object[] r3 = r5.a
            int r4 = r5.b
            kotlin.collections.q.M1(r3, r2, r0, r4)
            java.lang.Object[] r0 = r5.a
            r3 = 0
            kotlin.collections.q.M1(r0, r2, r3, r1)
            goto L29
        L24:
            java.lang.Object[] r3 = r5.a
            kotlin.collections.q.M1(r3, r2, r0, r1)
        L29:
            r5.c = r1
            int r0 = r5.size()
            int r0 = r0 - r6
            r5.d = r0
        L32:
            return
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "n shouldn't be greater than the buffer size: n = "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ", size = "
            r0.append(r6)
            int r6 = r5.size()
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
        L5a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "n shouldn't be negative but it is "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r6 = r6.toString()
            r0.<init>(r6)
            throw r0
    }

    @Override // kotlin.collections.b, java.util.Collection
    @org.jetbrains.annotations.NotNull
    public java.lang.Object[] toArray() {
            r1 = this;
            int r0 = r1.size()
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Object[] r0 = r1.toArray(r0)
            return r0
    }

    @Override // kotlin.collections.b, java.util.Collection
    @org.jetbrains.annotations.NotNull
    public <T> T[] toArray(@org.jetbrains.annotations.NotNull T[] r6) {
            r5 = this;
            java.lang.String r0 = "array"
            kotlin.jvm.internal.g0.p(r6, r0)
            int r0 = r6.length
            int r1 = r5.size()
            if (r0 >= r1) goto L19
            int r0 = r5.size()
            java.lang.Object[] r6 = java.util.Arrays.copyOf(r6, r0)
            java.lang.String r0 = "copyOf(...)"
            kotlin.jvm.internal.g0.o(r6, r0)
        L19:
            int r0 = r5.size()
            int r1 = r5.c
            r2 = 0
            r3 = 0
        L21:
            if (r3 >= r0) goto L32
            int r4 = r5.b
            if (r1 >= r4) goto L32
            java.lang.Object[] r4 = r5.a
            r4 = r4[r1]
            r6[r3] = r4
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L21
        L32:
            if (r3 >= r0) goto L3f
            java.lang.Object[] r1 = r5.a
            r1 = r1[r2]
            r6[r3] = r1
            int r3 = r3 + 1
            int r2 = r2 + 1
            goto L32
        L3f:
            java.lang.Object[] r6 = kotlin.collections.g0.o(r0, r6)
            return r6
    }
}

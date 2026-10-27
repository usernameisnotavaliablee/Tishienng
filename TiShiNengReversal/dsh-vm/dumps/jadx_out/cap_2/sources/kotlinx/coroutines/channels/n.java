package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.JvmInline
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n<T> {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.channels.n.b b = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.channels.n.c c = null;

    @org.jetbrains.annotations.Nullable
    private final java.lang.Object a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a extends kotlinx.coroutines.channels.n.c {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public final java.lang.Throwable a;

        public a(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        public boolean equals(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
                r1 = this;
                boolean r0 = r2 instanceof kotlinx.coroutines.channels.n.a
                if (r0 == 0) goto L12
                java.lang.Throwable r0 = r1.a
                kotlinx.coroutines.channels.n$a r2 = (kotlinx.coroutines.channels.n.a) r2
                java.lang.Throwable r2 = r2.a
                boolean r2 = kotlin.jvm.internal.g0.g(r0, r2)
                if (r2 == 0) goto L12
                r2 = 1
                return r2
            L12:
                r2 = 0
                return r2
        }

        public int hashCode() {
                r1 = this;
                java.lang.Throwable r0 = r1.a
                if (r0 == 0) goto L9
                int r0 = r0.hashCode()
                return r0
            L9:
                r0 = 0
                return r0
        }

        @Override // kotlinx.coroutines.channels.n.c
        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Closed("
                r0.append(r1)
                java.lang.Throwable r1 = r2.a
                r0.append(r1)
                r1 = 41
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlinx.coroutines.InternalCoroutinesApi
    public static final class b {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ b(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        @kotlinx.coroutines.InternalCoroutinesApi
        @org.jetbrains.annotations.NotNull
        public final <E> java.lang.Object a(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
                r1 = this;
                kotlinx.coroutines.channels.n$a r0 = new kotlinx.coroutines.channels.n$a
                r0.<init>(r2)
                java.lang.Object r2 = kotlinx.coroutines.channels.n.c(r0)
                return r2
        }

        @kotlinx.coroutines.InternalCoroutinesApi
        @org.jetbrains.annotations.NotNull
        public final <E> java.lang.Object b() {
                r1 = this;
                kotlinx.coroutines.channels.n$c r0 = kotlinx.coroutines.channels.n.a()
                java.lang.Object r0 = kotlinx.coroutines.channels.n.c(r0)
                return r0
        }

        @kotlinx.coroutines.InternalCoroutinesApi
        @org.jetbrains.annotations.NotNull
        public final <E> java.lang.Object c(E r1) {
                r0 = this;
                java.lang.Object r1 = kotlinx.coroutines.channels.n.c(r1)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c {
        public c() {
                r0 = this;
                r0.<init>()
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r1 = this;
                java.lang.String r0 = "Failed"
                return r0
        }
    }

    static {
            kotlinx.coroutines.channels.n$b r0 = new kotlinx.coroutines.channels.n$b
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.channels.n.b = r0
            kotlinx.coroutines.channels.n$c r0 = new kotlinx.coroutines.channels.n$c
            r0.<init>()
            kotlinx.coroutines.channels.n.c = r0
            return
    }

    @kotlin.PublishedApi
    private /* synthetic */ n(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.n.c a() {
            kotlinx.coroutines.channels.n$c r0 = kotlinx.coroutines.channels.n.c
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.n b(java.lang.Object r1) {
            kotlinx.coroutines.channels.n r0 = new kotlinx.coroutines.channels.n
            r0.<init>(r1)
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public static <T> java.lang.Object c(@org.jetbrains.annotations.Nullable java.lang.Object r0) {
            return r0
    }

    public static boolean d(java.lang.Object r2, java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlinx.coroutines.channels.n
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            kotlinx.coroutines.channels.n r3 = (kotlinx.coroutines.channels.n) r3
            java.lang.Object r3 = r3.o()
            boolean r2 = kotlin.jvm.internal.g0.g(r2, r3)
            if (r2 != 0) goto L13
            return r1
        L13:
            r2 = 1
            return r2
    }

    public static final boolean e(java.lang.Object r0, java.lang.Object r1) {
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Throwable f(java.lang.Object r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.channels.n.a
            r1 = 0
            if (r0 == 0) goto L8
            kotlinx.coroutines.channels.n$a r2 = (kotlinx.coroutines.channels.n.a) r2
            goto L9
        L8:
            r2 = r1
        L9:
            if (r2 == 0) goto Le
            java.lang.Throwable r2 = r2.a
            return r2
        Le:
            return r1
    }

    @kotlin.PublishedApi
    public static /* synthetic */ void g() {
            return
    }

    @org.jetbrains.annotations.Nullable
    public static final T h(java.lang.Object r1) {
            boolean r0 = r1 instanceof kotlinx.coroutines.channels.n.c
            if (r0 != 0) goto L5
            return r1
        L5:
            r1 = 0
            return r1
    }

    public static final T i(java.lang.Object r3) {
            boolean r0 = r3 instanceof kotlinx.coroutines.channels.n.c
            if (r0 != 0) goto L5
            return r3
        L5:
            boolean r0 = r3 instanceof kotlinx.coroutines.channels.n.a
            if (r0 == 0) goto L11
            r0 = r3
            kotlinx.coroutines.channels.n$a r0 = (kotlinx.coroutines.channels.n.a) r0
            java.lang.Throwable r0 = r0.a
            if (r0 == 0) goto L11
            throw r0
        L11:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Trying to call 'getOrThrow' on a failed channel result: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }

    public static int j(java.lang.Object r0) {
            if (r0 != 0) goto L4
            r0 = 0
            return r0
        L4:
            int r0 = r0.hashCode()
            return r0
    }

    public static final boolean k(java.lang.Object r0) {
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.n.a
            return r0
    }

    public static final boolean l(java.lang.Object r0) {
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.n.c
            return r0
    }

    public static final boolean m(java.lang.Object r0) {
            boolean r0 = r0 instanceof kotlinx.coroutines.channels.n.c
            r0 = r0 ^ 1
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static java.lang.String n(java.lang.Object r2) {
            boolean r0 = r2 instanceof kotlinx.coroutines.channels.n.a
            if (r0 == 0) goto Lb
            kotlinx.coroutines.channels.n$a r2 = (kotlinx.coroutines.channels.n.a) r2
            java.lang.String r2 = r2.toString()
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Value("
            r0.append(r1)
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.a
            boolean r2 = d(r0, r2)
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.a
            int r0 = j(r0)
            return r0
    }

    public final /* synthetic */ java.lang.Object o() {
            r1 = this;
            java.lang.Object r0 = r1.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.Object r0 = r1.a
            java.lang.String r0 = n(r0)
            return r0
    }
}

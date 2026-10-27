package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface e2 extends kotlin.coroutines.i.b {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.e2.b s0 = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {
        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void a(kotlinx.coroutines.e2 r1) {
                r0 = 0
                r1.b(r0)
                return
        }

        public static /* synthetic */ void b(kotlinx.coroutines.e2 r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lb
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                r0.b(r1)
                return
            Lb:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }

        public static /* synthetic */ boolean c(kotlinx.coroutines.e2 r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
                if (r3 != 0) goto Lc
                r2 = r2 & 1
                if (r2 == 0) goto L7
                r1 = 0
            L7:
                boolean r0 = r0.a(r1)
                return r0
            Lc:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: cancel"
                r0.<init>(r1)
                throw r0
        }

        public static <R> R d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r0, R r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super R, ? super kotlin.coroutines.i.b, ? extends R> r2) {
                java.lang.Object r0 = kotlin.coroutines.i.b.a.a(r0, r1, r2)
                return r0
        }

        @org.jetbrains.annotations.Nullable
        public static <E extends kotlin.coroutines.i.b> E e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r1) {
                kotlin.coroutines.i$b r0 = kotlin.coroutines.i.b.a.b(r0, r1)
                return r0
        }

        @kotlinx.coroutines.ExperimentalCoroutinesApi
        public static /* synthetic */ void f() {
                return
        }

        public static /* synthetic */ kotlinx.coroutines.j1 g(kotlinx.coroutines.e2 r0, boolean r1, boolean r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
                if (r5 != 0) goto L11
                r5 = r4 & 1
                if (r5 == 0) goto L7
                r1 = 0
            L7:
                r4 = r4 & 2
                if (r4 == 0) goto Lc
                r2 = 1
            Lc:
                kotlinx.coroutines.j1 r0 = r0.G(r1, r2, r3)
                return r0
            L11:
                java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
                java.lang.String r1 = "Super calls with default arguments not supported in this target, function: invokeOnCompletion"
                r0.<init>(r1)
                throw r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.i h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r1) {
                kotlin.coroutines.i r0 = kotlin.coroutines.i.b.a.c(r0, r1)
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public static kotlin.coroutines.i i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r0, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
                kotlin.coroutines.i r0 = kotlin.coroutines.i.b.a.d(r0, r1)
                return r0
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
        @org.jetbrains.annotations.NotNull
        public static kotlinx.coroutines.e2 j(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r0, @org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r1) {
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class b implements kotlin.coroutines.i.c<kotlinx.coroutines.e2> {
        static final /* synthetic */ kotlinx.coroutines.e2.b a = null;

        static {
                kotlinx.coroutines.e2$b r0 = new kotlinx.coroutines.e2$b
                r0.<init>()
                kotlinx.coroutines.e2.b.a = r0
                return
        }

        private b() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.b.a
            kotlinx.coroutines.e2.s0 = r0
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.v A(@org.jetbrains.annotations.NotNull kotlinx.coroutines.x r1);

    @org.jetbrains.annotations.NotNull
    kotlin.sequences.m<kotlinx.coroutines.e2> E();

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.j1 G(boolean r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r3);

    @kotlinx.coroutines.InternalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    java.util.concurrent.CancellationException H();

    @org.jetbrains.annotations.Nullable
    java.lang.Object M(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r1);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean a(java.lang.Throwable r1);

    void b(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r1);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    @org.jetbrains.annotations.Nullable
    kotlinx.coroutines.e2 getParent();

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two Job objects is meaningless. Job is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The job to the right of `+` just replaces the job the left of `+`.")
    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.e2 j(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r1);

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.j1 k(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r1);

    boolean start();

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.selects.e y();
}

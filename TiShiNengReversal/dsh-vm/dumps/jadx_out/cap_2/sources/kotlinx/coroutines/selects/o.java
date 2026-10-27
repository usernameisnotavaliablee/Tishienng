package kotlinx.coroutines.selects;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> a = null;
    private static final int b = 0;
    private static final int c = 1;
    private static final int d = 2;
    private static final int e = 3;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 f = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 g = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 h = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 i = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 j = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function3 {
        public static final kotlinx.coroutines.selects.o.a a = null;

        static {
                kotlinx.coroutines.selects.o$a r0 = new kotlinx.coroutines.selects.o$a
                r0.<init>()
                kotlinx.coroutines.selects.o.a.a = r0
                return
        }

        a() {
                r1 = this;
                r0 = 3
                r1.<init>(r0)
                return
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Void a(@org.jetbrains.annotations.NotNull java.lang.Object r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
                r0 = this;
                r1 = 0
                return r1
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3) {
                r0 = this;
                java.lang.Void r1 = r0.a(r1, r2, r3)
                return r1
        }
    }

    static {
            kotlinx.coroutines.selects.o$a r0 = kotlinx.coroutines.selects.o.a.a
            kotlinx.coroutines.selects.o.a = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "STATE_REG"
            r0.<init>(r1)
            kotlinx.coroutines.selects.o.f = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "STATE_COMPLETED"
            r0.<init>(r1)
            kotlinx.coroutines.selects.o.g = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "STATE_CANCELLED"
            r0.<init>(r1)
            kotlinx.coroutines.selects.o.h = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "NO_RESULT"
            r0.<init>(r1)
            kotlinx.coroutines.selects.o.i = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "PARAM_CLAUSE_0"
            r0.<init>(r1)
            kotlinx.coroutines.selects.o.j = r0
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public static /* synthetic */ void a() {
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public static /* synthetic */ void b() {
            return
    }

    @kotlinx.coroutines.InternalCoroutinesApi
    public static /* synthetic */ void c() {
            return
    }

    private static final kotlinx.coroutines.selects.TrySelectDetailedResult d(int r3) {
            if (r3 == 0) goto L2f
            r0 = 1
            if (r3 == r0) goto L2c
            r0 = 2
            if (r3 == r0) goto L29
            r0 = 3
            if (r3 != r0) goto Le
            kotlinx.coroutines.selects.TrySelectDetailedResult r3 = kotlinx.coroutines.selects.TrySelectDetailedResult.ALREADY_SELECTED
            return r3
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected internal result: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
        L29:
            kotlinx.coroutines.selects.TrySelectDetailedResult r3 = kotlinx.coroutines.selects.TrySelectDetailedResult.CANCELLED
            return r3
        L2c:
            kotlinx.coroutines.selects.TrySelectDetailedResult r3 = kotlinx.coroutines.selects.TrySelectDetailedResult.REREGISTER
            return r3
        L2f:
            kotlinx.coroutines.selects.TrySelectDetailedResult r3 = kotlinx.coroutines.selects.TrySelectDetailedResult.SUCCESSFUL
            return r3
    }

    public static final /* synthetic */ kotlinx.coroutines.selects.TrySelectDetailedResult e(int r0) {
            kotlinx.coroutines.selects.TrySelectDetailedResult r0 = d(r0)
            return r0
    }

    public static final /* synthetic */ kotlin.jvm.functions.Function3 f() {
            kotlin.jvm.functions.Function3<java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object> r0 = kotlinx.coroutines.selects.o.a
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 g() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.selects.o.i
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 h() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.selects.o.h
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 i() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.selects.o.g
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 j() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.selects.o.f
            return r0
    }

    public static final /* synthetic */ boolean k(kotlinx.coroutines.p r0, kotlin.jvm.functions.Function1 r1) {
            boolean r0 = o(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.s0 l() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.selects.o.j
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <R> java.lang.Object m(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.c<? super R>, kotlin.n1> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r3) {
            kotlinx.coroutines.selects.l r0 = new kotlinx.coroutines.selects.l
            kotlin.coroutines.i r1 = r3.getContext()
            r0.<init>(r1)
            r2.invoke(r0)
            java.lang.Object r2 = r0.y(r3)
            return r2
    }

    private static final <R> java.lang.Object n(kotlin.jvm.functions.Function1<? super kotlinx.coroutines.selects.c<? super R>, kotlin.n1> r0, kotlin.coroutines.e<? super R> r1) {
            kotlinx.coroutines.selects.l r0 = new kotlinx.coroutines.selects.l
            r0 = 3
            kotlin.jvm.internal.d0.e(r0)
            r0 = 0
            throw r0
    }

    private static final boolean o(kotlinx.coroutines.p<? super kotlin.n1> r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r3) {
            kotlin.n1 r0 = kotlin.n1.a
            r1 = 0
            java.lang.Object r3 = r2.O(r0, r1, r3)
            if (r3 != 0) goto Lb
            r2 = 0
            return r2
        Lb:
            r2.B(r3)
            r2 = 1
            return r2
    }
}

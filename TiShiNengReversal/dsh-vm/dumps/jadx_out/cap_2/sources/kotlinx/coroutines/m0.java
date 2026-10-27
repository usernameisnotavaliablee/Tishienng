package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class m0 extends kotlin.coroutines.a implements kotlin.coroutines.f {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.m0.a Key = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.ExperimentalStdlibApi
    public static final class a extends kotlin.coroutines.b<kotlin.coroutines.f, kotlinx.coroutines.m0> {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        /* renamed from: kotlinx.coroutines.m0$a$a, reason: collision with other inner class name */
        static final class C0108a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function1<kotlin.coroutines.i.b, kotlinx.coroutines.m0> {
            public static final kotlinx.coroutines.m0.a.C0108a a = null;

            static {
                    kotlinx.coroutines.m0$a$a r0 = new kotlinx.coroutines.m0$a$a
                    r0.<init>()
                    kotlinx.coroutines.m0.a.C0108a.a = r0
                    return
            }

            C0108a() {
                    r1 = this;
                    r0 = 1
                    r1.<init>(r0)
                    return
            }

            @org.jetbrains.annotations.Nullable
            public final kotlinx.coroutines.m0 a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.b r2) {
                    r1 = this;
                    boolean r0 = r2 instanceof kotlinx.coroutines.m0
                    if (r0 == 0) goto L7
                    kotlinx.coroutines.m0 r2 = (kotlinx.coroutines.m0) r2
                    return r2
                L7:
                    r2 = 0
                    return r2
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ kotlinx.coroutines.m0 invoke(kotlin.coroutines.i.b r1) {
                    r0 = this;
                    kotlin.coroutines.i$b r1 = (kotlin.coroutines.i.b) r1
                    kotlinx.coroutines.m0 r1 = r0.a(r1)
                    return r1
            }
        }

        private a() {
                r2 = this;
                kotlin.coroutines.f$b r0 = kotlin.coroutines.f.o0
                kotlinx.coroutines.m0$a$a r1 = kotlinx.coroutines.m0.a.C0108a.a
                r2.<init>(r0, r1)
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    static {
            kotlinx.coroutines.m0$a r0 = new kotlinx.coroutines.m0$a
            r1 = 0
            r0.<init>(r1)
            kotlinx.coroutines.m0.Key = r0
            return
    }

    public m0() {
            r1 = this;
            kotlin.coroutines.f$b r0 = kotlin.coroutines.f.o0
            r1.<init>(r0)
            return
    }

    public abstract void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2);

    @kotlinx.coroutines.InternalCoroutinesApi
    public void dispatchYield(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull java.lang.Runnable r2) {
            r0 = this;
            r0.dispatch(r1, r2)
            return
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.i.b, kotlin.coroutines.i
    @org.jetbrains.annotations.Nullable
    public <E extends kotlin.coroutines.i.b> E get(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<E> r1) {
            r0 = this;
            kotlin.coroutines.i$b r1 = kotlin.coroutines.f.a.b(r0, r1)
            return r1
    }

    @Override // kotlin.coroutines.f
    @org.jetbrains.annotations.NotNull
    public final <T> kotlin.coroutines.e<T> interceptContinuation(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            r1 = this;
            kotlinx.coroutines.internal.l r0 = new kotlinx.coroutines.internal.l
            r0.<init>(r1, r2)
            return r0
    }

    public boolean isDispatchNeeded(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.m0 limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.internal.t.a(r2)
            kotlinx.coroutines.internal.s r0 = new kotlinx.coroutines.internal.s
            r0.<init>(r1, r2)
            return r0
    }

    @Override // kotlin.coroutines.a, kotlin.coroutines.i.b, kotlin.coroutines.i
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i minusKey(@org.jetbrains.annotations.NotNull kotlin.coroutines.i.c<?> r1) {
            r0 = this;
            kotlin.coroutines.i r1 = kotlin.coroutines.f.a.c(r0, r1)
            return r1
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Operator '+' on two CoroutineDispatcher objects is meaningless. CoroutineDispatcher is a coroutine context element and `+` is a set-sum operator for coroutine contexts. The dispatcher to the right of `+` just replaces the dispatcher to the left.")
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.m0 plus(@org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r1) {
            r0 = this;
            return r1
    }

    @Override // kotlin.coroutines.f
    public final void releaseInterceptedContinuation(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r2) {
            r1 = this;
            java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"
            kotlin.jvm.internal.g0.n(r2, r0)
            kotlinx.coroutines.internal.l r2 = (kotlinx.coroutines.internal.l) r2
            r2.t()
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = kotlinx.coroutines.u0.a(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.u0.b(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

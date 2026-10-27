package kotlin.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.SinceKotlin(version = "1.3")
@kotlin.PublishedApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class k<T> implements kotlin.coroutines.e<T>, kotlin.coroutines.jvm.internal.c {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.coroutines.k.a b = null;
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater<kotlin.coroutines.k<?>, java.lang.Object> c = null;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.e<T> a;

    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object result;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        public /* synthetic */ a(kotlin.jvm.internal.v r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private static /* synthetic */ void a() {
                return
        }
    }

    static {
            kotlin.coroutines.k$a r0 = new kotlin.coroutines.k$a
            r1 = 0
            r0.<init>(r1)
            kotlin.coroutines.k.b = r0
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "result"
            java.lang.Class<kotlin.coroutines.k> r2 = kotlin.coroutines.k.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlin.coroutines.k.c = r0
            return
    }

    @kotlin.PublishedApi
    public k(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.UNDECIDED
            r1.<init>(r2, r0)
            return
    }

    public k(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            java.lang.String r0 = "delegate"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.a = r2
            r1.result = r3
            return
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object b() {
            r3 = this;
            java.lang.Object r0 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.UNDECIDED
            if (r0 != r1) goto L19
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<kotlin.coroutines.k<?>, java.lang.Object> r0 = kotlin.coroutines.k.c
            java.lang.Object r2 = kotlin.coroutines.intrinsics.a.l()
            boolean r0 = androidx.concurrent.futures.a.a(r0, r3, r1, r2)
            if (r0 == 0) goto L17
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            return r0
        L17:
            java.lang.Object r0 = r3.result
        L19:
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.RESUMED
            if (r0 != r1) goto L22
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            return r0
        L22:
            boolean r1 = r0 instanceof kotlin.Result.Failure
            if (r1 != 0) goto L27
            return r0
        L27:
            kotlin.Result$Failure r0 = (kotlin.Result.Failure) r0
            java.lang.Throwable r0 = r0.exception
            throw r0
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
            r2 = this;
            kotlin.coroutines.e<T> r0 = r2.a
            boolean r1 = r0 instanceof kotlin.coroutines.jvm.internal.c
            if (r1 == 0) goto L9
            kotlin.coroutines.jvm.internal.c r0 = (kotlin.coroutines.jvm.internal.c) r0
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // kotlin.coroutines.e
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i getContext() {
            r1 = this;
            kotlin.coroutines.e<T> r0 = r1.a
            kotlin.coroutines.i r0 = r0.getContext()
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
        L0:
            java.lang.Object r0 = r3.result
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.UNDECIDED
            if (r0 != r1) goto Lf
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<kotlin.coroutines.k<?>, java.lang.Object> r0 = kotlin.coroutines.k.c
            boolean r0 = androidx.concurrent.futures.a.a(r0, r3, r1, r4)
            if (r0 == 0) goto L0
            return
        Lf:
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto L29
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater<kotlin.coroutines.k<?>, java.lang.Object> r0 = kotlin.coroutines.k.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.RESUMED
            boolean r0 = androidx.concurrent.futures.a.a(r0, r3, r1, r2)
            if (r0 == 0) goto L0
            kotlin.coroutines.e<T> r0 = r3.a
            r0.resumeWith(r4)
            return
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            r4.<init>(r0)
            throw r4
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "SafeContinuation for "
            r0.append(r1)
            kotlin.coroutines.e<T> r1 = r2.a
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

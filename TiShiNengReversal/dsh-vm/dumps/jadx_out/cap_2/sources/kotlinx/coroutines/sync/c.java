package kotlinx.coroutines.sync;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 a = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 b = null;
    private static final int c = 0;
    private static final int d = 1;
    private static final int e = 2;
    private static final int f = 0;
    private static final int g = 1;
    private static final int h = 2;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.sync.MutexKt", f = "Mutex.kt", i = {0, 0, 0}, l = {125}, m = "withLock", n = {"$this$withLock", "owner", "action"}, s = {"L$0", "L$1", "L$2"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nMutex.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Mutex.kt\nkotlinx/coroutines/sync/MutexKt$withLock$1\n*L\n1#1,310:1\n*E\n"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        /* synthetic */ java.lang.Object d;
        int e;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.sync.c.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.d = r2
                int r2 = r1.e
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.e = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.sync.c.e(r2, r2, r2, r1)
                return r2
        }
    }

    static {
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "NO_OWNER"
            r0.<init>(r1)
            kotlinx.coroutines.sync.c.a = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "ALREADY_LOCKED_BY_OWNER"
            r0.<init>(r1)
            kotlinx.coroutines.sync.c.b = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.sync.a a(boolean r1) {
            kotlinx.coroutines.sync.b r0 = new kotlinx.coroutines.sync.b
            r0.<init>(r1)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.sync.a b(boolean r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.sync.a r0 = a(r0)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 c() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.sync.c.a
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 d() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.sync.c.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.a r4, @org.jetbrains.annotations.Nullable java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r7) {
            boolean r0 = r7 instanceof kotlinx.coroutines.sync.c.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.sync.c$a r0 = (kotlinx.coroutines.sync.c.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.c$a r0 = new kotlinx.coroutines.sync.c$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.e
            r3 = 1
            if (r2 == 0) goto L3c
            if (r2 != r3) goto L34
            java.lang.Object r4 = r0.c
            r6 = r4
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            java.lang.Object r5 = r0.b
            java.lang.Object r4 = r0.a
            kotlinx.coroutines.sync.a r4 = (kotlinx.coroutines.sync.a) r4
            kotlin.g0.n(r7)
            goto L4e
        L34:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3c:
            kotlin.g0.n(r7)
            r0.a = r4
            r0.b = r5
            r0.c = r6
            r0.e = r3
            java.lang.Object r7 = r4.lock(r5, r0)
            if (r7 != r1) goto L4e
            return r1
        L4e:
            java.lang.Object r6 = r6.invoke()     // Catch: java.lang.Throwable -> L5c
            kotlin.jvm.internal.d0.d(r3)
            r4.unlock(r5)
            kotlin.jvm.internal.d0.c(r3)
            return r6
        L5c:
            r6 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            r4.unlock(r5)
            kotlin.jvm.internal.d0.c(r3)
            throw r6
    }

    private static final <T> java.lang.Object f(kotlinx.coroutines.sync.a r1, java.lang.Object r2, kotlin.jvm.functions.Function0<? extends T> r3, kotlin.coroutines.e<? super T> r4) {
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            r1.lock(r2, r4)
            r4 = 1
            kotlin.jvm.internal.d0.e(r4)
            java.lang.Object r3 = r3.invoke()     // Catch: java.lang.Throwable -> L19
            kotlin.jvm.internal.d0.d(r4)
            r1.unlock(r2)
            kotlin.jvm.internal.d0.c(r4)
            return r3
        L19:
            r3 = move-exception
            kotlin.jvm.internal.d0.d(r4)
            r1.unlock(r2)
            kotlin.jvm.internal.d0.c(r4)
            throw r3
    }

    public static /* synthetic */ java.lang.Object g(kotlinx.coroutines.sync.a r0, java.lang.Object r1, kotlin.jvm.functions.Function0 r2, kotlin.coroutines.e r3, int r4, java.lang.Object r5) {
            r5 = 1
            r4 = r4 & r5
            if (r4 == 0) goto L5
            r1 = 0
        L5:
            r4 = 0
            kotlin.jvm.internal.d0.e(r4)
            r0.lock(r1, r3)
            kotlin.jvm.internal.d0.e(r5)
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L1d
            kotlin.jvm.internal.d0.d(r5)
            r0.unlock(r1)
            kotlin.jvm.internal.d0.c(r5)
            return r2
        L1d:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r5)
            r0.unlock(r1)
            kotlin.jvm.internal.d0.c(r5)
            throw r2
    }
}

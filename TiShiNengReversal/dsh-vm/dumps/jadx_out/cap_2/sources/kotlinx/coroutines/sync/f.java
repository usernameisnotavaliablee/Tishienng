package kotlinx.coroutines.sync;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {
    private static final int a = 0;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 b = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 c = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 d = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 e = null;
    private static final int f = 0;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.sync.SemaphoreKt", f = "Semaphore.kt", i = {0, 0}, l = {86}, m = "withPermit", n = {"$this$withPermit", "action"}, s = {"L$0", "L$1"})
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreKt$withPermit$1\n*L\n1#1,397:1\n*E\n"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        /* synthetic */ java.lang.Object c;
        int d;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.sync.f.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.c = r2
                int r2 = r1.d
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.d = r2
                r2 = 0
                java.lang.Object r2 = kotlinx.coroutines.sync.f.k(r2, r2, r1)
                return r2
        }
    }

    static {
            r4 = 12
            r5 = 0
            java.lang.String r0 = "kotlinx.coroutines.semaphore.maxSpinCycles"
            r1 = 100
            r2 = 0
            r3 = 0
            int r0 = kotlinx.coroutines.internal.v0.g(r0, r1, r2, r3, r4, r5)
            kotlinx.coroutines.sync.f.a = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "PERMIT"
            r0.<init>(r1)
            kotlinx.coroutines.sync.f.b = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "TAKEN"
            r0.<init>(r1)
            kotlinx.coroutines.sync.f.c = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "BROKEN"
            r0.<init>(r1)
            kotlinx.coroutines.sync.f.d = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "CANCELLED"
            r0.<init>(r1)
            kotlinx.coroutines.sync.f.e = r0
            r6 = 12
            r7 = 0
            java.lang.String r2 = "kotlinx.coroutines.semaphore.segmentSize"
            r3 = 16
            r4 = 0
            r5 = 0
            int r0 = kotlinx.coroutines.internal.v0.g(r2, r3, r4, r5, r6, r7)
            kotlinx.coroutines.sync.f.f = r0
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.sync.d a(int r1, int r2) {
            kotlinx.coroutines.sync.e r0 = new kotlinx.coroutines.sync.e
            r0.<init>(r1, r2)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.sync.d b(int r0, int r1, int r2, java.lang.Object r3) {
            r2 = r2 & 2
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.sync.d r0 = a(r0, r1)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.sync.g c(long r0, kotlinx.coroutines.sync.g r2) {
            kotlinx.coroutines.sync.g r0 = j(r0, r2)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 d() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.sync.f.d
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 e() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.sync.f.e
            return r0
    }

    public static final /* synthetic */ int f() {
            int r0 = kotlinx.coroutines.sync.f.a
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 g() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.sync.f.b
            return r0
    }

    public static final /* synthetic */ int h() {
            int r0 = kotlinx.coroutines.sync.f.f
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 i() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.sync.f.c
            return r0
    }

    private static final kotlinx.coroutines.sync.g j(long r2, kotlinx.coroutines.sync.g r4) {
            kotlinx.coroutines.sync.g r0 = new kotlinx.coroutines.sync.g
            r1 = 0
            r0.<init>(r2, r4, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object k(@org.jetbrains.annotations.NotNull kotlinx.coroutines.sync.d r4, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r6) {
            boolean r0 = r6 instanceof kotlinx.coroutines.sync.f.a
            if (r0 == 0) goto L13
            r0 = r6
            kotlinx.coroutines.sync.f$a r0 = (kotlinx.coroutines.sync.f.a) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            kotlinx.coroutines.sync.f$a r0 = new kotlinx.coroutines.sync.f$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r4 = r0.b
            r5 = r4
            kotlin.jvm.functions.Function0 r5 = (kotlin.jvm.functions.Function0) r5
            java.lang.Object r4 = r0.a
            kotlinx.coroutines.sync.d r4 = (kotlinx.coroutines.sync.d) r4
            kotlin.g0.n(r6)
            goto L4a
        L32:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3a:
            kotlin.g0.n(r6)
            r0.a = r4
            r0.b = r5
            r0.d = r3
            java.lang.Object r6 = r4.c(r0)
            if (r6 != r1) goto L4a
            return r1
        L4a:
            java.lang.Object r5 = r5.invoke()     // Catch: java.lang.Throwable -> L58
            kotlin.jvm.internal.d0.d(r3)
            r4.release()
            kotlin.jvm.internal.d0.c(r3)
            return r5
        L58:
            r5 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            r4.release()
            kotlin.jvm.internal.d0.c(r3)
            throw r5
    }

    private static final <T> java.lang.Object l(kotlinx.coroutines.sync.d r1, kotlin.jvm.functions.Function0<? extends T> r2, kotlin.coroutines.e<? super T> r3) {
            r0 = 0
            kotlin.jvm.internal.d0.e(r0)
            r1.c(r3)
            r3 = 1
            kotlin.jvm.internal.d0.e(r3)
            java.lang.Object r2 = r2.invoke()     // Catch: java.lang.Throwable -> L19
            kotlin.jvm.internal.d0.d(r3)
            r1.release()
            kotlin.jvm.internal.d0.c(r3)
            return r2
        L19:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            r1.release()
            kotlin.jvm.internal.d0.c(r3)
            throw r2
    }
}

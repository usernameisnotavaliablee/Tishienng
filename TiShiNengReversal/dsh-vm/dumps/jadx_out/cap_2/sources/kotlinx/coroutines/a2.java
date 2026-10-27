package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class a2 {
    private static final int a = 0;
    private static final int b = 1;
    private static final int c = 2;
    private static final int d = 3;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.InterruptibleKt$runInterruptible$2", f = "Interruptible.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    static final class a<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.r0, kotlin.coroutines.e<? super T>, java.lang.Object> {
        int a;
        private /* synthetic */ java.lang.Object b;
        final /* synthetic */ kotlin.jvm.functions.Function0<T> c;

        a(kotlin.jvm.functions.Function0<? extends T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.a2.a> r2) {
                r0 = this;
                r0.c = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.NotNull
        public final kotlin.coroutines.e<kotlin.n1> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<?> r4) {
                r2 = this;
                kotlinx.coroutines.a2$a r0 = new kotlinx.coroutines.a2$a
                kotlin.jvm.functions.Function0<T> r1 = r2.c
                r0.<init>(r1, r4)
                r0.b = r3
                return r0
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.r0 r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.r0 r1 = (kotlinx.coroutines.r0) r1
                kotlin.coroutines.e r2 = (kotlin.coroutines.e) r2
                java.lang.Object r1 = r0.invoke(r1, r2)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.e<? super T> r2) {
                r0 = this;
                kotlin.coroutines.e r1 = r0.create(r1, r2)
                kotlinx.coroutines.a2$a r1 = (kotlinx.coroutines.a2.a) r1
                kotlin.n1 r2 = kotlin.n1.a
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                kotlin.coroutines.intrinsics.a.l()
                int r0 = r1.a
                if (r0 != 0) goto L19
                kotlin.g0.n(r2)
                java.lang.Object r2 = r1.b
                kotlinx.coroutines.r0 r2 = (kotlinx.coroutines.r0) r2
                kotlin.coroutines.i r2 = r2.getCoroutineContext()
                kotlin.jvm.functions.Function0<T> r0 = r1.c
                java.lang.Object r2 = kotlinx.coroutines.a2.a(r2, r0)
                return r2
            L19:
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r2.<init>(r0)
                throw r2
        }
    }

    public static final /* synthetic */ java.lang.Object a(kotlin.coroutines.i r0, kotlin.jvm.functions.Function0 r1) {
            java.lang.Object r0 = d(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object b(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<? extends T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r4) {
            kotlinx.coroutines.a2$a r0 = new kotlinx.coroutines.a2$a
            r1 = 0
            r0.<init>(r3, r1)
            java.lang.Object r2 = kotlinx.coroutines.i.h(r2, r0, r4)
            return r2
    }

    public static /* synthetic */ java.lang.Object c(kotlin.coroutines.i r0, kotlin.jvm.functions.Function0 r1, kotlin.coroutines.e r2, int r3, java.lang.Object r4) {
            r3 = r3 & 1
            if (r3 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r0 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            java.lang.Object r0 = b(r0, r1, r2)
            return r0
    }

    private static final <T> T d(kotlin.coroutines.i r1, kotlin.jvm.functions.Function0<? extends T> r2) {
            kotlinx.coroutines.l3 r0 = new kotlinx.coroutines.l3     // Catch: java.lang.InterruptedException -> L19
            kotlinx.coroutines.e2 r1 = kotlinx.coroutines.h2.B(r1)     // Catch: java.lang.InterruptedException -> L19
            r0.<init>(r1)     // Catch: java.lang.InterruptedException -> L19
            r0.f()     // Catch: java.lang.InterruptedException -> L19
            java.lang.Object r1 = r2.invoke()     // Catch: java.lang.Throwable -> L14
            r0.a()     // Catch: java.lang.InterruptedException -> L19
            return r1
        L14:
            r1 = move-exception
            r0.a()     // Catch: java.lang.InterruptedException -> L19
            throw r1     // Catch: java.lang.InterruptedException -> L19
        L19:
            r1 = move-exception
            java.util.concurrent.CancellationException r2 = new java.util.concurrent.CancellationException
            java.lang.String r0 = "Blocking call was interrupted due to parent cancellation"
            r2.<init>(r0)
            java.lang.Throwable r1 = r2.initCause(r1)
            throw r1
    }
}

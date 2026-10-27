package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,127:1\n314#2,9:128\n323#2,2:141\n13#3:137\n19#3:140\n13579#4,2:138\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll\n*L\n71#1:128,9\n71#1:141,2\n78#1:137\n90#1:140\n83#1:138,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class e<T> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.x0<T>[] a;

    @kotlin.jvm.Volatile
    private volatile int notCompletedCount;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,127:1\n11335#2:128\n11670#2,3:129\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$AwaitAllNode\n*L\n121#1:128\n121#1:129,3\n*E\n"})
    private final class a extends kotlinx.coroutines.k2 {

        @org.jetbrains.annotations.NotNull
        private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater h = null;

        @kotlin.jvm.Volatile
        @org.jetbrains.annotations.Nullable
        private volatile java.lang.Object _disposer;

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.p<java.util.List<? extends T>> e;
        public kotlinx.coroutines.j1 f;
        final /* synthetic */ kotlinx.coroutines.e<T> g;

        static {
                java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
                java.lang.String r1 = "_disposer"
                java.lang.Class<kotlinx.coroutines.e$a> r2 = kotlinx.coroutines.e.a.class
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
                kotlinx.coroutines.e.a.h = r0
                return
        }

        public a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e r1, kotlinx.coroutines.p<? super java.util.List<? extends T>> r2) {
                r0 = this;
                r0.g = r1
                r0.<init>()
                r0.e = r2
                return
        }

        @org.jetbrains.annotations.Nullable
        public final kotlinx.coroutines.e<T>.b C() {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.e.a.h
                java.lang.Object r0 = r0.get(r1)
                kotlinx.coroutines.e$b r0 = (kotlinx.coroutines.e.b) r0
                return r0
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.j1 D() {
                r1 = this;
                kotlinx.coroutines.j1 r0 = r1.f
                if (r0 == 0) goto L5
                return r0
            L5:
                java.lang.String r0 = "handle"
                kotlin.jvm.internal.g0.S(r0)
                r0 = 0
                return r0
        }

        public final void E(@org.jetbrains.annotations.Nullable kotlinx.coroutines.e<T>.b r2) {
                r1 = this;
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.e.a.h
                r0.set(r1, r2)
                return
        }

        public final void F(@org.jetbrains.annotations.NotNull kotlinx.coroutines.j1 r1) {
                r0 = this;
                r0.f = r1
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.z(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlinx.coroutines.f0
        public void z(@org.jetbrains.annotations.Nullable java.lang.Throwable r6) {
                r5 = this;
                if (r6 == 0) goto L19
                kotlinx.coroutines.p<java.util.List<? extends T>> r0 = r5.e
                java.lang.Object r6 = r0.J(r6)
                if (r6 == 0) goto L4c
                kotlinx.coroutines.p<java.util.List<? extends T>> r0 = r5.e
                r0.B(r6)
                kotlinx.coroutines.e$b r6 = r5.C()
                if (r6 == 0) goto L4c
                r6.m()
                return
            L19:
                java.util.concurrent.atomic.AtomicIntegerFieldUpdater r6 = kotlinx.coroutines.e.b()
                kotlinx.coroutines.e<T> r0 = r5.g
                int r6 = r6.decrementAndGet(r0)
                if (r6 != 0) goto L4c
                kotlinx.coroutines.p<java.util.List<? extends T>> r6 = r5.e
                kotlinx.coroutines.e<T> r0 = r5.g
                kotlinx.coroutines.x0[] r0 = kotlinx.coroutines.e.a(r0)
                java.util.ArrayList r1 = new java.util.ArrayList
                int r2 = r0.length
                r1.<init>(r2)
                int r2 = r0.length
                r3 = 0
            L35:
                if (r3 >= r2) goto L43
                r4 = r0[r3]
                java.lang.Object r4 = r4.d()
                r1.add(r4)
                int r3 = r3 + 1
                goto L35
            L43:
                kotlin.Result$a r0 = kotlin.Result.Companion
                java.lang.Object r0 = kotlin.Result.m11constructorimpl(r1)
                r6.resumeWith(r0)
            L4c:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nAwait.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,127:1\n13579#2,2:128\n*S KotlinDebug\n*F\n+ 1 Await.kt\nkotlinx/coroutines/AwaitAll$DisposeHandlersOnCancel\n*L\n96#1:128,2\n*E\n"})
    private final class b extends kotlinx.coroutines.n {

        @org.jetbrains.annotations.NotNull
        private final kotlinx.coroutines.e<T>.a[] a;
        final /* synthetic */ kotlinx.coroutines.e<T> b;

        public b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e r1, kotlinx.coroutines.e<T>.a[] r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ kotlin.n1 invoke(java.lang.Throwable r1) {
                r0 = this;
                java.lang.Throwable r1 = (java.lang.Throwable) r1
                r0.l(r1)
                kotlin.n1 r1 = kotlin.n1.a
                return r1
        }

        @Override // kotlinx.coroutines.o
        public void l(@org.jetbrains.annotations.Nullable java.lang.Throwable r1) {
                r0 = this;
                r0.m()
                return
        }

        public final void m() {
                r4 = this;
                kotlinx.coroutines.e<T>$a[] r0 = r4.a
                int r1 = r0.length
                r2 = 0
            L4:
                if (r2 >= r1) goto L12
                r3 = r0[r2]
                kotlinx.coroutines.j1 r3 = r3.D()
                r3.dispose()
                int r2 = r2 + 1
                goto L4
            L12:
                return
        }

        @org.jetbrains.annotations.NotNull
        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "DisposeHandlersOnCancel["
                r0.append(r1)
                kotlinx.coroutines.e<T>$a[] r1 = r2.a
                r0.append(r1)
                r1 = 93
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.e> r0 = kotlinx.coroutines.e.class
            java.lang.String r1 = "notCompletedCount"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.e.b = r0
            return
    }

    public e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.x0<? extends T>[] r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            int r1 = r1.length
            r0.notCompletedCount = r1
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.x0[] a(kotlinx.coroutines.e r0) {
            kotlinx.coroutines.x0<T>[] r0 = r0.a
            return r0
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicIntegerFieldUpdater b() {
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.e.b
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object c(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.util.List<? extends T>> r8) {
            r7 = this;
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r8)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            kotlinx.coroutines.x0[] r1 = a(r7)
            int r1 = r1.length
            kotlinx.coroutines.e$a[] r2 = new kotlinx.coroutines.e.a[r1]
            r3 = 0
            r4 = 0
        L16:
            if (r4 >= r1) goto L34
            kotlinx.coroutines.x0[] r5 = a(r7)
            r5 = r5[r4]
            r5.start()
            kotlinx.coroutines.e$a r6 = new kotlinx.coroutines.e$a
            r6.<init>(r7, r0)
            kotlinx.coroutines.j1 r5 = r5.k(r6)
            r6.F(r5)
            kotlin.n1 r5 = kotlin.n1.a
            r2[r4] = r6
            int r4 = r4 + 1
            goto L16
        L34:
            kotlinx.coroutines.e$b r4 = new kotlinx.coroutines.e$b
            r4.<init>(r7, r2)
        L39:
            if (r3 >= r1) goto L43
            r5 = r2[r3]
            r5.E(r4)
            int r3 = r3 + 1
            goto L39
        L43:
            boolean r1 = r0.isCompleted()
            if (r1 == 0) goto L4d
            r4.m()
            goto L50
        L4d:
            r0.I(r4)
        L50:
            java.lang.Object r0 = r0.x()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto L5d
            kotlin.coroutines.jvm.internal.e.c(r8)
        L5d:
            return r0
    }
}

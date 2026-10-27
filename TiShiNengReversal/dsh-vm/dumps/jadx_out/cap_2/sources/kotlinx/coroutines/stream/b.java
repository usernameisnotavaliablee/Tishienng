package kotlinx.coroutines.stream;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class b<T> implements kotlinx.coroutines.flow.i<T> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater b = null;

    @org.jetbrains.annotations.NotNull
    private final java.util.stream.Stream<T> a;

    @kotlin.jvm.Volatile
    private volatile int consumed;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.stream.StreamFlow", f = "Stream.kt", i = {0, 0}, l = {26}, m = "collect", n = {"this", "collector"}, s = {"L$0", "L$1"})
    static final class a extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        java.lang.Object a;
        java.lang.Object b;
        java.lang.Object c;
        /* synthetic */ java.lang.Object d;
        final /* synthetic */ kotlinx.coroutines.stream.b<T> e;
        int f;

        a(kotlinx.coroutines.stream.b<T> r1, kotlin.coroutines.e<? super kotlinx.coroutines.stream.b.a> r2) {
                r0 = this;
                r0.e = r1
                r0.<init>(r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                r1 = this;
                r1.d = r2
                int r2 = r1.f
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r2 = r2 | r0
                r1.f = r2
                kotlinx.coroutines.stream.b<T> r2 = r1.e
                r0 = 0
                java.lang.Object r2 = r2.collect(r0, r1)
                return r2
        }
    }

    static {
            java.lang.Class<kotlinx.coroutines.stream.b> r0 = kotlinx.coroutines.stream.b.class
            java.lang.String r1 = "consumed"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.stream.b.b = r0
            return
    }

    public b(@org.jetbrains.annotations.NotNull java.util.stream.Stream<T> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r1 = 0
            r0.consumed = r1
            return
    }

    @Override // kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r7) {
            r5 = this;
            boolean r0 = r7 instanceof kotlinx.coroutines.stream.b.a
            if (r0 == 0) goto L13
            r0 = r7
            kotlinx.coroutines.stream.b$a r0 = (kotlinx.coroutines.stream.b.a) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            kotlinx.coroutines.stream.b$a r0 = new kotlinx.coroutines.stream.b$a
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.f
            r3 = 1
            if (r2 == 0) goto L40
            if (r2 != r3) goto L38
            java.lang.Object r6 = r0.c
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r2 = r0.b
            kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.j) r2
            java.lang.Object r4 = r0.a
            kotlinx.coroutines.stream.b r4 = (kotlinx.coroutines.stream.b) r4
            kotlin.g0.n(r7)     // Catch: java.lang.Throwable -> L36
            r7 = r2
            goto L56
        L36:
            r6 = move-exception
            goto L79
        L38:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L40:
            kotlin.g0.n(r7)
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r7 = kotlinx.coroutines.stream.b.b
            r2 = 0
            boolean r7 = r7.compareAndSet(r5, r2, r3)
            if (r7 == 0) goto L7f
            java.util.stream.Stream<T> r7 = r5.a     // Catch: java.lang.Throwable -> L77
            java.util.Iterator r7 = kotlin.streams.jdk8.i.a(r7)     // Catch: java.lang.Throwable -> L77
            r4 = r7
            r7 = r6
            r6 = r4
            r4 = r5
        L56:
            boolean r2 = r6.hasNext()     // Catch: java.lang.Throwable -> L36
            if (r2 == 0) goto L6f
            java.lang.Object r2 = r6.next()     // Catch: java.lang.Throwable -> L36
            r0.a = r4     // Catch: java.lang.Throwable -> L36
            r0.b = r7     // Catch: java.lang.Throwable -> L36
            r0.c = r6     // Catch: java.lang.Throwable -> L36
            r0.f = r3     // Catch: java.lang.Throwable -> L36
            java.lang.Object r2 = r7.emit(r2, r0)     // Catch: java.lang.Throwable -> L36
            if (r2 != r1) goto L56
            return r1
        L6f:
            java.util.stream.Stream<T> r6 = r4.a
            kotlinx.coroutines.stream.a.a(r6)
            kotlin.n1 r6 = kotlin.n1.a
            return r6
        L77:
            r6 = move-exception
            r4 = r5
        L79:
            java.util.stream.Stream<T> r7 = r4.a
            kotlinx.coroutines.stream.a.a(r7)
            throw r6
        L7f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "Stream.consumeAsFlow can be collected only once"
            r6.<init>(r7)
            throw r6
    }
}

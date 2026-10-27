package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public interface b0<E> {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a {

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.channels.ReceiveChannel$DefaultImpls", f = "Channel.kt", i = {}, l = {372}, m = "receiveOrNull", n = {}, s = {})
        /* renamed from: kotlinx.coroutines.channels.b0$a$a, reason: collision with other inner class name */
        static final class C0082a<E> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
            /* synthetic */ java.lang.Object a;
            int b;

            C0082a(kotlin.coroutines.e<? super kotlinx.coroutines.channels.b0.a.C0082a> r1) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @org.jetbrains.annotations.Nullable
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
                    r1 = this;
                    r1.a = r2
                    int r2 = r1.b
                    r0 = -2147483648(0xffffffff80000000, float:-0.0)
                    r2 = r2 | r0
                    r1.b = r2
                    r2 = 0
                    java.lang.Object r2 = kotlinx.coroutines.channels.b0.a.i(r2, r1)
                    return r2
            }
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
        public static /* synthetic */ void a(kotlinx.coroutines.channels.b0 r1) {
                r0 = 0
                r1.b(r0)
                return
        }

        public static /* synthetic */ void b(kotlinx.coroutines.channels.b0 r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
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

        public static /* synthetic */ boolean c(kotlinx.coroutines.channels.b0 r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
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

        @org.jetbrains.annotations.NotNull
        public static <E> kotlinx.coroutines.selects.g<E> d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends E> r1) {
                java.lang.String r0 = "null cannot be cast to non-null type kotlinx.coroutines.channels.BufferedChannel<E of kotlinx.coroutines.channels.ReceiveChannel>"
                kotlin.jvm.internal.g0.n(r1, r0)
                kotlinx.coroutines.channels.BufferedChannel r1 = (kotlinx.coroutines.channels.BufferedChannel) r1
                kotlinx.coroutines.selects.g r1 = r1.u()
                return r1
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of onReceiveCatching extension", replaceWith = @kotlin.ReplaceWith(expression = "onReceiveCatching", imports = {}))
        public static /* synthetic */ void e() {
                return
        }

        @kotlinx.coroutines.DelicateCoroutinesApi
        public static /* synthetic */ void f() {
                return
        }

        @kotlinx.coroutines.ExperimentalCoroutinesApi
        public static /* synthetic */ void g() {
                return
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
        @org.jetbrains.annotations.Nullable
        public static <E> E h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends E> r1) {
                java.lang.Object r1 = r1.v()
                boolean r0 = kotlinx.coroutines.channels.n.m(r1)
                if (r0 == 0) goto Lf
                java.lang.Object r1 = kotlinx.coroutines.channels.n.i(r1)
                return r1
            Lf:
                java.lang.Throwable r1 = kotlinx.coroutines.channels.n.f(r1)
                if (r1 != 0) goto L17
                r1 = 0
                return r1
            L17:
                java.lang.Throwable r1 = kotlinx.coroutines.internal.r0.o(r1)
                throw r1
        }

        @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
        @kotlin.internal.LowPriorityInOverloadResolution
        @org.jetbrains.annotations.Nullable
        public static <E> java.lang.Object i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends E> r4, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super E> r5) {
                boolean r0 = r5 instanceof kotlinx.coroutines.channels.b0.a.C0082a
                if (r0 == 0) goto L13
                r0 = r5
                kotlinx.coroutines.channels.b0$a$a r0 = (kotlinx.coroutines.channels.b0.a.C0082a) r0
                int r1 = r0.b
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.b = r1
                goto L18
            L13:
                kotlinx.coroutines.channels.b0$a$a r0 = new kotlinx.coroutines.channels.b0$a$a
                r0.<init>(r5)
            L18:
                java.lang.Object r5 = r0.a
                java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
                int r2 = r0.b
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                kotlin.g0.n(r5)
                kotlinx.coroutines.channels.n r5 = (kotlinx.coroutines.channels.n) r5
                java.lang.Object r4 = r5.o()
                goto L43
            L2f:
                java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
                java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
                r4.<init>(r5)
                throw r4
            L37:
                kotlin.g0.n(r5)
                r0.b = r3
                java.lang.Object r4 = r4.x(r0)
                if (r4 != r1) goto L43
                return r1
            L43:
                java.lang.Object r4 = kotlinx.coroutines.channels.n.h(r4)
                return r4
        }
    }

    boolean D();

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.selects.g<E> N();

    @org.jetbrains.annotations.Nullable
    java.lang.Object R(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super E> r1);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ boolean a(java.lang.Throwable r1);

    void b(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r1);

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    /* synthetic */ void cancel();

    boolean isEmpty();

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.channels.l<E> iterator();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @org.jetbrains.annotations.Nullable
    E poll();

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.selects.g<kotlinx.coroutines.channels.n<E>> t();

    @org.jetbrains.annotations.NotNull
    kotlinx.coroutines.selects.g<E> u();

    @org.jetbrains.annotations.NotNull
    java.lang.Object v();

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @kotlin.internal.LowPriorityInOverloadResolution
    @org.jetbrains.annotations.Nullable
    java.lang.Object w(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super E> r1);

    @org.jetbrains.annotations.Nullable
    java.lang.Object x(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlinx.coroutines.channels.n<? extends E>> r1);
}

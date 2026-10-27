package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class n3 {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.coroutines.jvm.internal.DebugMetadata(c = "kotlinx.coroutines.TimeoutKt", f = "Timeout.kt", i = {0, 0, 0}, l = {104}, m = "withTimeoutOrNull", n = {"block", "coroutine", "timeMillis"}, s = {"L$0", "L$1", "J$0"})
    static final class a<T> extends kotlin.coroutines.jvm.internal.ContinuationImpl {
        long a;
        java.lang.Object b;
        java.lang.Object c;
        /* synthetic */ java.lang.Object d;
        int e;

        a(kotlin.coroutines.e<? super kotlinx.coroutines.n3.a> r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
                r2 = this;
                r2.d = r3
                int r3 = r2.e
                r0 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r3 | r0
                r2.e = r3
                r0 = 0
                r3 = 0
                java.lang.Object r3 = kotlinx.coroutines.n3.e(r0, r3, r2)
                return r3
        }
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.TimeoutCancellationException a(long r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.z0 r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r5) {
            boolean r0 = r4 instanceof kotlinx.coroutines.b1
            if (r0 == 0) goto L7
            kotlinx.coroutines.b1 r4 = (kotlinx.coroutines.b1) r4
            goto L8
        L7:
            r4 = 0
        L8:
            if (r4 == 0) goto L18
            kotlin.time.h$a r0 = kotlin.time.h.b
            kotlin.time.DurationUnit r0 = kotlin.time.DurationUnit.MILLISECONDS
            long r0 = kotlin.time.j.x(r2, r0)
            java.lang.String r4 = r4.h(r0)
            if (r4 != 0) goto L2e
        L18:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Timed out waiting for "
            r4.append(r0)
            r4.append(r2)
            java.lang.String r2 = " ms"
            r4.append(r2)
            java.lang.String r4 = r4.toString()
        L2e:
            kotlinx.coroutines.TimeoutCancellationException r2 = new kotlinx.coroutines.TimeoutCancellationException
            r2.<init>(r4, r5)
            return r2
    }

    private static final <U, T extends U> java.lang.Object b(kotlinx.coroutines.m3<U, ? super T> r4, kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r5) {
            kotlin.coroutines.e<T> r0 = r4.d
            kotlin.coroutines.i r0 = r0.getContext()
            kotlinx.coroutines.z0 r0 = kotlinx.coroutines.a1.d(r0)
            long r1 = r4.e
            kotlin.coroutines.i r3 = r4.getContext()
            kotlinx.coroutines.j1 r0 = r0.m(r1, r4, r3)
            kotlinx.coroutines.h2.y(r4, r0)
            java.lang.Object r4 = n4.b.f(r4, r4, r5)
            return r4
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object c(long r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r6) {
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L19
            kotlinx.coroutines.m3 r0 = new kotlinx.coroutines.m3
            r0.<init>(r3, r6)
            java.lang.Object r3 = b(r0, r5)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r4) goto L18
            kotlin.coroutines.jvm.internal.e.c(r6)
        L18:
            return r3
        L19:
            kotlinx.coroutines.TimeoutCancellationException r3 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r4 = "Timed out immediately"
            r3.<init>(r4)
            throw r3
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object d(long r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r3) {
            long r0 = kotlinx.coroutines.a1.e(r0)
            java.lang.Object r0 = c(r0, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object e(long r7, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r9, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r10) {
            boolean r0 = r10 instanceof kotlinx.coroutines.n3.a
            if (r0 == 0) goto L13
            r0 = r10
            kotlinx.coroutines.n3$a r0 = (kotlinx.coroutines.n3.a) r0
            int r1 = r0.e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e = r1
            goto L18
        L13:
            kotlinx.coroutines.n3$a r0 = new kotlinx.coroutines.n3$a
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.d
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            int r2 = r0.e
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L3c
            if (r2 != r4) goto L34
            java.lang.Object r7 = r0.c
            kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref.ObjectRef) r7
            java.lang.Object r8 = r0.b
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            kotlin.g0.n(r10)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L32
            return r10
        L32:
            r8 = move-exception
            goto L6f
        L34:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3c:
            kotlin.g0.n(r10)
            r5 = 0
            int r10 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r10 > 0) goto L46
            return r3
        L46:
            kotlin.jvm.internal.Ref$ObjectRef r10 = new kotlin.jvm.internal.Ref$ObjectRef
            r10.<init>()
            r0.b = r9     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.c = r10     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.a = r7     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r0.e = r4     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            kotlinx.coroutines.m3 r2 = new kotlinx.coroutines.m3     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r2.<init>(r7, r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            r10.element = r2     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r7 = b(r2, r9)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            java.lang.Object r8 = kotlin.coroutines.intrinsics.a.l()     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            if (r7 != r8) goto L6b
            kotlin.coroutines.jvm.internal.e.c(r0)     // Catch: kotlinx.coroutines.TimeoutCancellationException -> L68
            goto L6b
        L68:
            r8 = move-exception
            r7 = r10
            goto L6f
        L6b:
            if (r7 != r1) goto L6e
            return r1
        L6e:
            return r7
        L6f:
            kotlinx.coroutines.e2 r9 = r8.coroutine
            T r7 = r7.element
            if (r9 != r7) goto L76
            return r3
        L76:
            throw r8
    }

    @org.jetbrains.annotations.Nullable
    public static final <T> java.lang.Object f(long r0, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r3) {
            long r0 = kotlinx.coroutines.a1.e(r0)
            java.lang.Object r0 = e(r0, r2, r3)
            return r0
    }
}

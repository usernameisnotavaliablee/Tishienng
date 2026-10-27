package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDispatchedTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n+ 6 Exceptions.kt\nkotlinx/coroutines/ExceptionsKt\n*L\n1#1,222:1\n1#2:223\n107#3,10:224\n118#3,2:238\n220#4:234\n221#4:237\n61#5,2:235\n75#6:240\n*S KotlinDebug\n*F\n+ 1 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTask\n*L\n90#1:224,10\n90#1:238,2\n103#1:234\n103#1:237\n103#1:235,2\n142#1:240\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class d1<T> extends kotlinx.coroutines.scheduling.j {

    @kotlin.jvm.JvmField
    public int c;

    public d1(int r1) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            return
    }

    public void d(@org.jetbrains.annotations.Nullable java.lang.Object r1, @org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r0 = this;
            return
    }

    @org.jetbrains.annotations.NotNull
    public abstract kotlin.coroutines.e<T> e();

    @org.jetbrains.annotations.Nullable
    public java.lang.Throwable f(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof kotlinx.coroutines.d0
            r1 = 0
            if (r0 == 0) goto L8
            kotlinx.coroutines.d0 r3 = (kotlinx.coroutines.d0) r3
            goto L9
        L8:
            r3 = r1
        L9:
            if (r3 == 0) goto Le
            java.lang.Throwable r3 = r3.a
            return r3
        Le:
            return r1
    }

    public <T> T g(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            return r1
    }

    public final void i(@org.jetbrains.annotations.Nullable java.lang.Throwable r3, @org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
            r2 = this;
            if (r3 != 0) goto L5
            if (r4 != 0) goto L5
            return
        L5:
            if (r3 == 0) goto Lc
            if (r4 == 0) goto Lc
            kotlin.l.a(r3, r4)
        Lc:
            if (r3 != 0) goto Lf
            r3 = r4
        Lf:
            kotlinx.coroutines.CoroutinesInternalError r4 = new kotlinx.coroutines.CoroutinesInternalError
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Fatal exception in coroutines machinery for "
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            kotlin.jvm.internal.g0.m(r3)
            r4.<init>(r0, r3)
            kotlin.coroutines.e r3 = r2.e()
            kotlin.coroutines.i r3 = r3.getContext()
            kotlinx.coroutines.o0.b(r3, r4)
            return
    }

    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object j();

    @Override // java.lang.Runnable
    public final void run() {
            r10 = this;
            kotlinx.coroutines.scheduling.k r0 = r10.b
            kotlin.coroutines.e r1 = r10.e()     // Catch: java.lang.Throwable -> L23
            java.lang.String r2 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>"
            kotlin.jvm.internal.g0.n(r1, r2)     // Catch: java.lang.Throwable -> L23
            kotlinx.coroutines.internal.l r1 = (kotlinx.coroutines.internal.l) r1     // Catch: java.lang.Throwable -> L23
            kotlin.coroutines.e<T> r2 = r1.e     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = r1.g     // Catch: java.lang.Throwable -> L23
            kotlin.coroutines.i r3 = r2.getContext()     // Catch: java.lang.Throwable -> L23
            java.lang.Object r1 = kotlinx.coroutines.internal.y0.c(r3, r1)     // Catch: java.lang.Throwable -> L23
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.internal.y0.a     // Catch: java.lang.Throwable -> L23
            r5 = 0
            if (r1 == r4) goto L26
            kotlinx.coroutines.p3 r4 = kotlinx.coroutines.l0.g(r2, r3, r1)     // Catch: java.lang.Throwable -> L23
            goto L27
        L23:
            r1 = move-exception
            goto Lb9
        L26:
            r4 = r5
        L27:
            kotlin.coroutines.i r6 = r2.getContext()     // Catch: java.lang.Throwable -> L46
            java.lang.Object r7 = r10.j()     // Catch: java.lang.Throwable -> L46
            java.lang.Throwable r8 = r10.f(r7)     // Catch: java.lang.Throwable -> L46
            if (r8 != 0) goto L48
            int r9 = r10.c     // Catch: java.lang.Throwable -> L46
            boolean r9 = kotlinx.coroutines.e1.c(r9)     // Catch: java.lang.Throwable -> L46
            if (r9 == 0) goto L48
            kotlinx.coroutines.e2$b r9 = kotlinx.coroutines.e2.s0     // Catch: java.lang.Throwable -> L46
            kotlin.coroutines.i$b r6 = r6.get(r9)     // Catch: java.lang.Throwable -> L46
            kotlinx.coroutines.e2 r6 = (kotlinx.coroutines.e2) r6     // Catch: java.lang.Throwable -> L46
            goto L49
        L46:
            r2 = move-exception
            goto Lad
        L48:
            r6 = r5
        L49:
            if (r6 == 0) goto L66
            boolean r9 = r6.isActive()     // Catch: java.lang.Throwable -> L46
            if (r9 != 0) goto L66
            java.util.concurrent.CancellationException r6 = r6.H()     // Catch: java.lang.Throwable -> L46
            r10.d(r7, r6)     // Catch: java.lang.Throwable -> L46
            kotlin.Result$a r7 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = kotlin.g0.a(r6)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = kotlin.Result.m11constructorimpl(r6)     // Catch: java.lang.Throwable -> L46
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L46
            goto L83
        L66:
            if (r8 == 0) goto L76
            kotlin.Result$a r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = kotlin.g0.a(r8)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = kotlin.Result.m11constructorimpl(r6)     // Catch: java.lang.Throwable -> L46
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L46
            goto L83
        L76:
            kotlin.Result$a r6 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = r10.g(r7)     // Catch: java.lang.Throwable -> L46
            java.lang.Object r6 = kotlin.Result.m11constructorimpl(r6)     // Catch: java.lang.Throwable -> L46
            r2.resumeWith(r6)     // Catch: java.lang.Throwable -> L46
        L83:
            kotlin.n1 r2 = kotlin.n1.a     // Catch: java.lang.Throwable -> L46
            if (r4 == 0) goto L8d
            boolean r4 = r4.A1()     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto L90
        L8d:
            kotlinx.coroutines.internal.y0.a(r3, r1)     // Catch: java.lang.Throwable -> L23
        L90:
            kotlin.Result$a r1 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L9a
            r0.o()     // Catch: java.lang.Throwable -> L9a
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r2)     // Catch: java.lang.Throwable -> L9a
            goto La5
        L9a:
            r0 = move-exception
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.g0.a(r0)
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
        La5:
            java.lang.Throwable r0 = kotlin.Result.m14exceptionOrNullimpl(r0)
            r10.i(r5, r0)
            goto Ld7
        Lad:
            if (r4 == 0) goto Lb5
            boolean r4 = r4.A1()     // Catch: java.lang.Throwable -> L23
            if (r4 == 0) goto Lb8
        Lb5:
            kotlinx.coroutines.internal.y0.a(r3, r1)     // Catch: java.lang.Throwable -> L23
        Lb8:
            throw r2     // Catch: java.lang.Throwable -> L23
        Lb9:
            kotlin.Result$a r2 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> Lc5
            r0.o()     // Catch: java.lang.Throwable -> Lc5
            kotlin.n1 r0 = kotlin.n1.a     // Catch: java.lang.Throwable -> Lc5
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)     // Catch: java.lang.Throwable -> Lc5
            goto Ld0
        Lc5:
            r0 = move-exception
            kotlin.Result$a r2 = kotlin.Result.Companion
            java.lang.Object r0 = kotlin.g0.a(r0)
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
        Ld0:
            java.lang.Throwable r0 = kotlin.Result.m14exceptionOrNullimpl(r0)
            r10.i(r1, r0)
        Ld7:
            return
    }
}

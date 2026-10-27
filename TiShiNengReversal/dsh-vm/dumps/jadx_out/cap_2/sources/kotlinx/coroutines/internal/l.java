package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,317:1\n243#1,8:381\n255#1:389\n256#1,2:400\n258#1:404\n1#2:318\n1#2:324\n1#2:365\n297#3,5:319\n302#3,12:325\n314#3:359\n297#3,5:360\n302#3,12:366\n314#3:419\n200#4,3:337\n203#4,14:345\n200#4,3:378\n203#4,14:405\n95#5,5:340\n107#5,10:390\n118#5,2:402\n107#5,13:420\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n224#1:381,8\n225#1:389\n225#1:400,2\n225#1:404\n202#1:324\n223#1:365\n202#1:319,5\n202#1:325,12\n202#1:359\n223#1:360,5\n223#1:366,12\n223#1:419\n202#1:337,3\n202#1:345,14\n223#1:378,3\n223#1:405,14\n203#1:340,5\n225#1:390,10\n225#1:402,2\n255#1:420,13\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class l<T> extends kotlinx.coroutines.d1<T> implements kotlin.coroutines.jvm.internal.c, kotlin.coroutines.e<T> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater h = null;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _reusableCancellableContinuation;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.m0 d;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<T> e;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.Nullable
    public java.lang.Object f;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final java.lang.Object g;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_reusableCancellableContinuation"
            java.lang.Class<kotlinx.coroutines.internal.l> r2 = kotlinx.coroutines.internal.l.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.internal.l.h = r0
            return
    }

    public l(@org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r3) {
            r1 = this;
            r0 = -1
            r1.<init>(r0)
            r1.d = r2
            r1.e = r3
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.internal.m.a()
            r1.f = r2
            kotlin.coroutines.i r2 = r1.getContext()
            java.lang.Object r2 = kotlinx.coroutines.internal.y0.b(r2)
            r1.g = r2
            return
    }

    private final kotlinx.coroutines.q<?> n() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.l.h
            java.lang.Object r0 = r0.get(r2)
            boolean r1 = r0 instanceof kotlinx.coroutines.q
            if (r1 == 0) goto Ld
            kotlinx.coroutines.q r0 = (kotlinx.coroutines.q) r0
            return r0
        Ld:
            r0 = 0
            return r0
    }

    public static /* synthetic */ void p() {
            return
    }

    private final void r(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r2.get(r4)
            r3.invoke(r0)
            goto L0
    }

    @Override // kotlinx.coroutines.d1
    public void d(@org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.e0
            if (r0 == 0) goto Lb
            kotlinx.coroutines.e0 r2 = (kotlinx.coroutines.e0) r2
            kotlin.jvm.functions.Function1<java.lang.Throwable, kotlin.n1> r2 = r2.b
            r2.invoke(r3)
        Lb:
            return
    }

    @Override // kotlinx.coroutines.d1
    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.e<T> e() {
            r0 = this;
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
            r2 = this;
            kotlin.coroutines.e<T> r0 = r2.e
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
            kotlin.coroutines.e<T> r0 = r1.e
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

    @Override // kotlinx.coroutines.d1
    @org.jetbrains.annotations.Nullable
    public java.lang.Object j() {
            r2 = this;
            java.lang.Object r0 = r2.f
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.internal.m.a()
            r2.f = r1
            return r0
    }

    public final void k() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.l.h
        L2:
            java.lang.Object r1 = r0.get(r3)
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.internal.m.b
            if (r1 == r2) goto L2
            return
    }

    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.q<T> l() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.l.h
        L2:
            java.lang.Object r1 = r0.get(r4)
            if (r1 != 0) goto L11
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.l.h
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.internal.m.b
            r0.set(r4, r1)
            r0 = 0
            return r0
        L11:
            boolean r2 = r1 instanceof kotlinx.coroutines.q
            if (r2 == 0) goto L22
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.l.h
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.internal.m.b
            boolean r2 = androidx.concurrent.futures.a.a(r2, r4, r1, r3)
            if (r2 == 0) goto L2
            kotlinx.coroutines.q r1 = (kotlinx.coroutines.q) r1
            return r1
        L22:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.internal.m.b
            if (r1 == r2) goto L2
            boolean r2 = r1 instanceof java.lang.Throwable
            if (r2 == 0) goto L2b
            goto L2
        L2b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Inconsistent state "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
    }

    public final void m(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, T r2) {
            r0 = this;
            r0.f = r2
            r2 = 1
            r0.c = r2
            kotlinx.coroutines.m0 r2 = r0.d
            r2.dispatchYield(r1, r0)
            return
    }

    public final boolean q() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.l.h
            java.lang.Object r0 = r0.get(r1)
            if (r0 == 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            r6 = this;
            kotlin.coroutines.e<T> r0 = r6.e
            kotlin.coroutines.i r0 = r0.getContext()
            r1 = 0
            r2 = 1
            java.lang.Object r3 = kotlinx.coroutines.i0.d(r7, r1, r2, r1)
            kotlinx.coroutines.m0 r4 = r6.d
            boolean r4 = r4.isDispatchNeeded(r0)
            r5 = 0
            if (r4 == 0) goto L1f
            r6.f = r3
            r6.c = r5
            kotlinx.coroutines.m0 r7 = r6.d
            r7.dispatch(r0, r6)
            return
        L1f:
            kotlinx.coroutines.g3 r0 = kotlinx.coroutines.g3.a
            kotlinx.coroutines.n1 r0 = r0.b()
            boolean r4 = r0.D()
            if (r4 == 0) goto L33
            r6.f = r3
            r6.c = r5
            r0.w(r6)
            goto L5f
        L33:
            r0.z(r2)
            kotlin.coroutines.i r3 = r6.getContext()     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = r6.g     // Catch: java.lang.Throwable -> L54
            java.lang.Object r4 = kotlinx.coroutines.internal.y0.c(r3, r4)     // Catch: java.lang.Throwable -> L54
            kotlin.coroutines.e<T> r5 = r6.e     // Catch: java.lang.Throwable -> L56
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> L56
            kotlin.n1 r7 = kotlin.n1.a     // Catch: java.lang.Throwable -> L56
            kotlinx.coroutines.internal.y0.a(r3, r4)     // Catch: java.lang.Throwable -> L54
        L4a:
            boolean r7 = r0.N()     // Catch: java.lang.Throwable -> L54
            if (r7 != 0) goto L4a
        L50:
            r0.t(r2)
            goto L5f
        L54:
            r7 = move-exception
            goto L5b
        L56:
            r7 = move-exception
            kotlinx.coroutines.internal.y0.a(r3, r4)     // Catch: java.lang.Throwable -> L54
            throw r7     // Catch: java.lang.Throwable -> L54
        L5b:
            r6.i(r7, r1)     // Catch: java.lang.Throwable -> L60
            goto L50
        L5f:
            return
        L60:
            r7 = move-exception
            r0.t(r2)
            throw r7
    }

    public final boolean s(@org.jetbrains.annotations.NotNull java.lang.Throwable r6) {
            r5 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.l.h
        L2:
            java.lang.Object r1 = r0.get(r5)
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.internal.m.b
            boolean r3 = kotlin.jvm.internal.g0.g(r1, r2)
            r4 = 1
            if (r3 == 0) goto L18
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.l.h
            boolean r1 = androidx.concurrent.futures.a.a(r1, r5, r2, r6)
            if (r1 == 0) goto L2
            return r4
        L18:
            boolean r2 = r1 instanceof java.lang.Throwable
            if (r2 == 0) goto L1d
            return r4
        L1d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.l.h
            r3 = 0
            boolean r1 = androidx.concurrent.futures.a.a(r2, r5, r1, r3)
            if (r1 == 0) goto L2
            r6 = 0
            return r6
    }

    public final void t() {
            r1 = this;
            r1.k()
            kotlinx.coroutines.q r0 = r1.n()
            if (r0 == 0) goto Lc
            r0.s()
        Lc:
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "DispatchedContinuation["
            r0.append(r1)
            kotlinx.coroutines.m0 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            kotlin.coroutines.e<T> r1 = r2.e
            java.lang.String r1 = kotlinx.coroutines.u0.c(r1)
            r0.append(r1)
            r1 = 93
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final void u(@org.jetbrains.annotations.NotNull java.lang.Object r7, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r8) {
            r6 = this;
            java.lang.Object r8 = kotlinx.coroutines.i0.b(r7, r8)
            kotlinx.coroutines.m0 r0 = r6.d
            kotlin.coroutines.i r1 = r6.getContext()
            boolean r0 = r0.isDispatchNeeded(r1)
            r1 = 1
            if (r0 == 0) goto L1f
            r6.f = r8
            r6.c = r1
            kotlinx.coroutines.m0 r7 = r6.d
            kotlin.coroutines.i r8 = r6.getContext()
            r7.dispatch(r8, r6)
            return
        L1f:
            kotlinx.coroutines.g3 r0 = kotlinx.coroutines.g3.a
            kotlinx.coroutines.n1 r0 = r0.b()
            boolean r2 = r0.D()
            if (r2 == 0) goto L34
            r6.f = r8
            r6.c = r1
            r0.w(r6)
            goto Lbb
        L34:
            r0.z(r1)
            r2 = 0
            kotlin.coroutines.i r3 = r6.getContext()     // Catch: java.lang.Throwable -> L61
            kotlinx.coroutines.e2$b r4 = kotlinx.coroutines.e2.s0     // Catch: java.lang.Throwable -> L61
            kotlin.coroutines.i$b r3 = r3.get(r4)     // Catch: java.lang.Throwable -> L61
            kotlinx.coroutines.e2 r3 = (kotlinx.coroutines.e2) r3     // Catch: java.lang.Throwable -> L61
            if (r3 == 0) goto L63
            boolean r4 = r3.isActive()     // Catch: java.lang.Throwable -> L61
            if (r4 != 0) goto L63
            java.util.concurrent.CancellationException r7 = r3.H()     // Catch: java.lang.Throwable -> L61
            r6.d(r8, r7)     // Catch: java.lang.Throwable -> L61
            kotlin.Result$a r8 = kotlin.Result.Companion     // Catch: java.lang.Throwable -> L61
            java.lang.Object r7 = kotlin.g0.a(r7)     // Catch: java.lang.Throwable -> L61
            java.lang.Object r7 = kotlin.Result.m11constructorimpl(r7)     // Catch: java.lang.Throwable -> L61
            r6.resumeWith(r7)     // Catch: java.lang.Throwable -> L61
            goto L91
        L61:
            r7 = move-exception
            goto Lb4
        L63:
            kotlin.coroutines.e<T> r8 = r6.e     // Catch: java.lang.Throwable -> L61
            java.lang.Object r3 = r6.g     // Catch: java.lang.Throwable -> L61
            kotlin.coroutines.i r4 = r8.getContext()     // Catch: java.lang.Throwable -> L61
            java.lang.Object r3 = kotlinx.coroutines.internal.y0.c(r4, r3)     // Catch: java.lang.Throwable -> L61
            kotlinx.coroutines.internal.s0 r5 = kotlinx.coroutines.internal.y0.a     // Catch: java.lang.Throwable -> L61
            if (r3 == r5) goto L78
            kotlinx.coroutines.p3 r8 = kotlinx.coroutines.l0.g(r8, r4, r3)     // Catch: java.lang.Throwable -> L61
            goto L79
        L78:
            r8 = r2
        L79:
            kotlin.coroutines.e<T> r5 = r6.e     // Catch: java.lang.Throwable -> La1
            r5.resumeWith(r7)     // Catch: java.lang.Throwable -> La1
            kotlin.n1 r7 = kotlin.n1.a     // Catch: java.lang.Throwable -> La1
            kotlin.jvm.internal.d0.d(r1)     // Catch: java.lang.Throwable -> L61
            if (r8 == 0) goto L8b
            boolean r7 = r8.A1()     // Catch: java.lang.Throwable -> L61
            if (r7 == 0) goto L8e
        L8b:
            kotlinx.coroutines.internal.y0.a(r4, r3)     // Catch: java.lang.Throwable -> L61
        L8e:
            kotlin.jvm.internal.d0.c(r1)     // Catch: java.lang.Throwable -> L61
        L91:
            boolean r7 = r0.N()     // Catch: java.lang.Throwable -> L61
            if (r7 != 0) goto L91
            kotlin.jvm.internal.d0.d(r1)
        L9a:
            r0.t(r1)
            kotlin.jvm.internal.d0.c(r1)
            goto Lbb
        La1:
            r7 = move-exception
            kotlin.jvm.internal.d0.d(r1)     // Catch: java.lang.Throwable -> L61
            if (r8 == 0) goto Lad
            boolean r8 = r8.A1()     // Catch: java.lang.Throwable -> L61
            if (r8 == 0) goto Lb0
        Lad:
            kotlinx.coroutines.internal.y0.a(r4, r3)     // Catch: java.lang.Throwable -> L61
        Lb0:
            kotlin.jvm.internal.d0.c(r1)     // Catch: java.lang.Throwable -> L61
            throw r7     // Catch: java.lang.Throwable -> L61
        Lb4:
            r6.i(r7, r2)     // Catch: java.lang.Throwable -> Lbc
            kotlin.jvm.internal.d0.d(r1)
            goto L9a
        Lbb:
            return
        Lbc:
            r7 = move-exception
            kotlin.jvm.internal.d0.d(r1)
            r0.t(r1)
            kotlin.jvm.internal.d0.c(r1)
            throw r7
    }

    public final boolean v(@org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r2 = this;
            kotlin.coroutines.i r0 = r2.getContext()
            kotlinx.coroutines.e2$b r1 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r0 = r0.get(r1)
            kotlinx.coroutines.e2 r0 = (kotlinx.coroutines.e2) r0
            if (r0 == 0) goto L2a
            boolean r1 = r0.isActive()
            if (r1 != 0) goto L2a
            java.util.concurrent.CancellationException r0 = r0.H()
            r2.d(r3, r0)
            kotlin.Result$a r3 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.g0.a(r0)
            java.lang.Object r3 = kotlin.Result.m11constructorimpl(r3)
            r2.resumeWith(r3)
            r3 = 1
            return r3
        L2a:
            r3 = 0
            return r3
    }

    public final void w(@org.jetbrains.annotations.NotNull java.lang.Object r6) {
            r5 = this;
            kotlin.coroutines.e<T> r0 = r5.e
            java.lang.Object r1 = r5.g
            kotlin.coroutines.i r2 = r0.getContext()
            java.lang.Object r1 = kotlinx.coroutines.internal.y0.c(r2, r1)
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.internal.y0.a
            if (r1 == r3) goto L15
            kotlinx.coroutines.p3 r0 = kotlinx.coroutines.l0.g(r0, r2, r1)
            goto L16
        L15:
            r0 = 0
        L16:
            r3 = 1
            kotlin.coroutines.e<T> r4 = r5.e     // Catch: java.lang.Throwable -> L30
            r4.resumeWith(r6)     // Catch: java.lang.Throwable -> L30
            kotlin.n1 r6 = kotlin.n1.a     // Catch: java.lang.Throwable -> L30
            kotlin.jvm.internal.d0.d(r3)
            if (r0 == 0) goto L29
            boolean r6 = r0.A1()
            if (r6 == 0) goto L2c
        L29:
            kotlinx.coroutines.internal.y0.a(r2, r1)
        L2c:
            kotlin.jvm.internal.d0.c(r3)
            return
        L30:
            r6 = move-exception
            kotlin.jvm.internal.d0.d(r3)
            if (r0 == 0) goto L3c
            boolean r0 = r0.A1()
            if (r0 == 0) goto L3f
        L3c:
            kotlinx.coroutines.internal.y0.a(r2, r1)
        L3f:
            kotlin.jvm.internal.d0.c(r3)
            throw r6
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Throwable x(@org.jetbrains.annotations.NotNull kotlinx.coroutines.p<?> r5) {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.l.h
        L2:
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.internal.m.b
            r3 = 0
            if (r1 != r2) goto L14
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.l.h
            boolean r1 = androidx.concurrent.futures.a.a(r1, r4, r2, r5)
            if (r1 == 0) goto L2
            return r3
        L14:
            boolean r5 = r1 instanceof java.lang.Throwable
            if (r5 == 0) goto L2b
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = kotlinx.coroutines.internal.l.h
            boolean r5 = androidx.concurrent.futures.a.a(r5, r4, r1, r3)
            if (r5 == 0) goto L23
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            return r1
        L23:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r5.<init>(r0)
            throw r5
        L2b:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "Inconsistent state "
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
    }
}

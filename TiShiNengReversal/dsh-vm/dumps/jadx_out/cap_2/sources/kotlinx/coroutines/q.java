package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.PublishedApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 5 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,662:1\n230#1,2:666\n232#1,8:669\n230#1,10:677\n230#1,10:688\n1#2:663\n24#3:664\n24#3:665\n22#3:687\n21#3:698\n22#3,3:699\n21#3:702\n22#3,3:703\n22#3:711\n21#3,4:712\n22#4:668\n13#4:710\n61#5,2:706\n61#5,2:708\n61#5,2:716\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n246#1:666,2\n246#1:669,8\n249#1:677,10\n254#1:688,10\n72#1:664\n158#1:665\n252#1:687\n277#1:698\n278#1:699,3\n287#1:702\n288#1:703,3\n389#1:711\n392#1:712,4\n246#1:668\n350#1:710\n329#1:706,2\n339#1:708,2\n613#1:716,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class q<T> extends kotlinx.coroutines.d1<T> implements kotlinx.coroutines.p<T>, kotlin.coroutines.jvm.internal.c, kotlinx.coroutines.r3 {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater g = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater h = null;

    @kotlin.jvm.Volatile
    private volatile int _decisionAndIndex;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _parentHandle;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _state;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.e<T> d;

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i e;

    static {
            java.lang.String r0 = "_decisionAndIndex"
            java.lang.Class<kotlinx.coroutines.q> r1 = kotlinx.coroutines.q.class
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r1, r0)
            kotlinx.coroutines.q.f = r0
            java.lang.String r0 = "_state"
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.q.g = r0
            java.lang.String r0 = "_parentHandle"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.q.h = r0
            return
    }

    public q(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r1, int r2) {
            r0 = this;
            r0.<init>(r2)
            r0.d = r1
            kotlin.coroutines.i r1 = r1.getContext()
            r0.e = r1
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r0._decisionAndIndex = r1
            kotlinx.coroutines.d r1 = kotlinx.coroutines.d.a
            r0._state = r1
            return
    }

    private final kotlinx.coroutines.j1 A() {
            r7 = this;
            kotlin.coroutines.i r0 = r7.getContext()
            kotlinx.coroutines.e2$b r1 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r0 = r0.get(r1)
            r1 = r0
            kotlinx.coroutines.e2 r1 = (kotlinx.coroutines.e2) r1
            r0 = 0
            if (r1 != 0) goto L11
            return r0
        L11:
            kotlinx.coroutines.u r4 = new kotlinx.coroutines.u
            r4.<init>(r7)
            r5 = 2
            r6 = 0
            r2 = 1
            r3 = 0
            kotlinx.coroutines.j1 r1 = kotlinx.coroutines.e2.a.g(r1, r2, r3, r4, r5, r6)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.q.h
            androidx.concurrent.futures.a.a(r2, r7, r0, r1)
            return r1
    }

    private final void D(java.lang.Object r13) {
            r12 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.q.g
        L2:
            java.lang.Object r2 = r0.get(r12)
            boolean r1 = r2 instanceof kotlinx.coroutines.d
            if (r1 == 0) goto L14
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.q.g
            boolean r1 = androidx.concurrent.futures.a.a(r1, r12, r2, r13)
            if (r1 == 0) goto L2
            goto La6
        L14:
            boolean r1 = r2 instanceof kotlinx.coroutines.n
            if (r1 == 0) goto L1a
            r1 = 1
            goto L1c
        L1a:
            boolean r1 = r2 instanceof kotlinx.coroutines.internal.p0
        L1c:
            if (r1 == 0) goto L22
            r12.K(r13, r2)
            goto L2
        L22:
            boolean r1 = r2 instanceof kotlinx.coroutines.d0
            if (r1 == 0) goto L4d
            r0 = r2
            kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.d0) r0
            boolean r1 = r0.b()
            if (r1 != 0) goto L32
            r12.K(r13, r2)
        L32:
            boolean r1 = r2 instanceof kotlinx.coroutines.t
            if (r1 == 0) goto La6
            java.lang.Throwable r0 = r0.a
            boolean r1 = r13 instanceof kotlinx.coroutines.n
            if (r1 == 0) goto L42
            kotlinx.coroutines.n r13 = (kotlinx.coroutines.n) r13
            r12.m(r13, r0)
            return
        L42:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>"
            kotlin.jvm.internal.g0.n(r13, r1)
            kotlinx.coroutines.internal.p0 r13 = (kotlinx.coroutines.internal.p0) r13
            r12.q(r13, r0)
            return
        L4d:
            boolean r1 = r2 instanceof kotlinx.coroutines.c0
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler"
            if (r1 == 0) goto L88
            r4 = r2
            kotlinx.coroutines.c0 r4 = (kotlinx.coroutines.c0) r4
            kotlinx.coroutines.n r1 = r4.b
            if (r1 == 0) goto L5d
            r12.K(r13, r2)
        L5d:
            boolean r1 = r13 instanceof kotlinx.coroutines.internal.p0
            if (r1 == 0) goto L62
            return
        L62:
            kotlin.jvm.internal.g0.n(r13, r3)
            r6 = r13
            kotlinx.coroutines.n r6 = (kotlinx.coroutines.n) r6
            boolean r1 = r4.h()
            if (r1 == 0) goto L74
            java.lang.Throwable r13 = r4.e
            r12.m(r6, r13)
            return
        L74:
            r10 = 29
            r11 = 0
            r5 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            kotlinx.coroutines.c0 r1 = kotlinx.coroutines.c0.g(r4, r5, r6, r7, r8, r9, r10, r11)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.q.g
            boolean r1 = androidx.concurrent.futures.a.a(r3, r12, r2, r1)
            if (r1 == 0) goto L2
            goto La6
        L88:
            boolean r1 = r13 instanceof kotlinx.coroutines.internal.p0
            if (r1 == 0) goto L8d
            return
        L8d:
            kotlin.jvm.internal.g0.n(r13, r3)
            r3 = r13
            kotlinx.coroutines.n r3 = (kotlinx.coroutines.n) r3
            kotlinx.coroutines.c0 r1 = new kotlinx.coroutines.c0
            r7 = 28
            r8 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.q.g
            boolean r1 = androidx.concurrent.futures.a.a(r3, r12, r2, r1)
            if (r1 == 0) goto L2
        La6:
            return
    }

    private final boolean E() {
            r2 = this;
            int r0 = r2.c
            boolean r0 = kotlinx.coroutines.e1.d(r0)
            if (r0 == 0) goto L19
            kotlin.coroutines.e<T> r0 = r2.d
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlinx.coroutines.internal.l r0 = (kotlinx.coroutines.internal.l) r0
            boolean r0 = r0.q()
            if (r0 == 0) goto L19
            r0 = 1
            return r0
        L19:
            r0 = 0
            return r0
    }

    private final void F(java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2, kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            int r0 = r2.get(r4)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.invoke(r0)
            goto L0
    }

    private final void G(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r2.get(r4)
            r3.invoke(r0)
            goto L0
    }

    private final kotlinx.coroutines.n H(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.n
            if (r0 == 0) goto L7
            kotlinx.coroutines.n r2 = (kotlinx.coroutines.n) r2
            return r2
        L7:
            kotlinx.coroutines.b2 r0 = new kotlinx.coroutines.b2
            r0.<init>(r2)
            return r0
    }

    private final void K(java.lang.Object r4, java.lang.Object r5) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "It's prohibited to register multiple handlers, tried to register "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = ", already has "
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private final void S(java.lang.Object r10, int r11, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r12) {
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.q.g
        L2:
            java.lang.Object r1 = r0.get(r9)
            boolean r2 = r1 instanceof kotlinx.coroutines.t2
            if (r2 == 0) goto L29
            r4 = r1
            kotlinx.coroutines.t2 r4 = (kotlinx.coroutines.t2) r4
            r8 = 0
            r3 = r9
            r5 = r10
            r6 = r11
            r7 = r12
            java.lang.Object r10 = r3.U(r4, r5, r6, r7, r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = kotlinx.coroutines.q.g
            boolean r10 = androidx.concurrent.futures.a.a(r11, r9, r1, r10)
            if (r10 == 0) goto L25
            r9.t()
            r9.u(r6)
            return
        L25:
            r10 = r5
            r11 = r6
            r12 = r7
            goto L2
        L29:
            r3 = r9
            r5 = r10
            r7 = r12
            boolean r10 = r1 instanceof kotlinx.coroutines.t
            if (r10 == 0) goto L40
            kotlinx.coroutines.t r1 = (kotlinx.coroutines.t) r1
            boolean r10 = r1.c()
            if (r10 == 0) goto L40
            if (r7 == 0) goto L3f
            java.lang.Throwable r10 = r1.a
            r9.p(r7, r10)
        L3f:
            return
        L40:
            r9.k(r5)
            kotlin.KotlinNothingValueException r10 = new kotlin.KotlinNothingValueException
            r10.<init>()
            throw r10
    }

    static /* synthetic */ void T(kotlinx.coroutines.q r0, java.lang.Object r1, int r2, kotlin.jvm.functions.Function1 r3, int r4, java.lang.Object r5) {
            if (r5 != 0) goto Lb
            r4 = r4 & 4
            if (r4 == 0) goto L7
            r3 = 0
        L7:
            r0.S(r1, r2, r3)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: resumeImpl"
            r0.<init>(r1)
            throw r0
    }

    private final java.lang.Object U(kotlinx.coroutines.t2 r9, java.lang.Object r10, int r11, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r12, java.lang.Object r13) {
            r8 = this;
            boolean r0 = r10 instanceof kotlinx.coroutines.d0
            if (r0 == 0) goto L5
            return r10
        L5:
            boolean r11 = kotlinx.coroutines.e1.c(r11)
            if (r11 != 0) goto Le
            if (r13 != 0) goto Le
            goto L17
        Le:
            if (r12 != 0) goto L18
            boolean r11 = r9 instanceof kotlinx.coroutines.n
            if (r11 != 0) goto L18
            if (r13 == 0) goto L17
            goto L18
        L17:
            return r10
        L18:
            kotlinx.coroutines.c0 r0 = new kotlinx.coroutines.c0
            boolean r11 = r9 instanceof kotlinx.coroutines.n
            if (r11 == 0) goto L22
            kotlinx.coroutines.n r9 = (kotlinx.coroutines.n) r9
        L20:
            r2 = r9
            goto L24
        L22:
            r9 = 0
            goto L20
        L24:
            r6 = 16
            r7 = 0
            r5 = 0
            r1 = r10
            r3 = r12
            r4 = r13
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    private final boolean V() {
            r6 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.q.f
        L2:
            int r1 = r0.get(r6)
            int r2 = r1 >> 29
            r3 = 1
            if (r2 == 0) goto L17
            if (r2 != r3) goto Lf
            r0 = 0
            return r0
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already resumed"
            r0.<init>(r1)
            throw r0
        L17:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.q.f
            r4 = 536870911(0x1fffffff, float:1.0842021E-19)
            r4 = r4 & r1
            r5 = 1073741824(0x40000000, float:2.0)
            int r5 = r5 + r4
            boolean r1 = r2.compareAndSet(r6, r1, r5)
            if (r1 == 0) goto L2
            return r3
    }

    private final kotlinx.coroutines.internal.s0 W(java.lang.Object r10, java.lang.Object r11, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r12) {
            r9 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.q.g
        L2:
            java.lang.Object r1 = r0.get(r9)
            boolean r2 = r1 instanceof kotlinx.coroutines.t2
            if (r2 == 0) goto L29
            r4 = r1
            kotlinx.coroutines.t2 r4 = (kotlinx.coroutines.t2) r4
            int r6 = r9.c
            r3 = r9
            r5 = r10
            r8 = r11
            r7 = r12
            java.lang.Object r10 = r3.U(r4, r5, r6, r7, r8)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = kotlinx.coroutines.q.g
            boolean r10 = androidx.concurrent.futures.a.a(r11, r9, r1, r10)
            if (r10 == 0) goto L25
            r9.t()
            kotlinx.coroutines.internal.s0 r10 = kotlinx.coroutines.r.g
            return r10
        L25:
            r10 = r5
            r12 = r7
            r11 = r8
            goto L2
        L29:
            r3 = r9
            r8 = r11
            boolean r10 = r1 instanceof kotlinx.coroutines.c0
            r11 = 0
            if (r10 == 0) goto L3b
            if (r8 == 0) goto L3b
            kotlinx.coroutines.c0 r1 = (kotlinx.coroutines.c0) r1
            java.lang.Object r10 = r1.d
            if (r10 != r8) goto L3b
            kotlinx.coroutines.internal.s0 r10 = kotlinx.coroutines.r.g
            return r10
        L3b:
            return r11
    }

    private final boolean X() {
            r5 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.q.f
        L2:
            int r1 = r0.get(r5)
            int r2 = r1 >> 29
            if (r2 == 0) goto L17
            r0 = 2
            if (r2 != r0) goto Lf
            r0 = 0
            return r0
        Lf:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            r0.<init>(r1)
            throw r0
        L17:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r2 = kotlinx.coroutines.q.f
            r3 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r3 & r1
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            int r4 = r4 + r3
            boolean r1 = r2.compareAndSet(r5, r1, r4)
            if (r1 == 0) goto L2
            r0 = 1
            return r0
    }

    private final void Y(java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Integer> r4, java.lang.Object r5) {
            r2 = this;
        L0:
            int r0 = r3.get(r5)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r4.invoke(r1)
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            boolean r0 = r3.compareAndSet(r5, r0, r1)
            if (r0 == 0) goto L0
            return
    }

    private final java.lang.Void k(java.lang.Object r4) {
            r3 = this;
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Already resumed, but proposed with update "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private final void l(kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r4, java.lang.Throwable r5) {
            r3 = this;
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r4 = move-exception
            kotlin.coroutines.i r5 = r3.getContext()
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in invokeOnCancellation handler for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            kotlinx.coroutines.o0.b(r5, r0)
            return
    }

    private final void n(kotlin.jvm.functions.Function0<kotlin.n1> r5) {
            r4 = this;
            r5.invoke()     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r5 = move-exception
            kotlin.coroutines.i r0 = r4.getContext()
            kotlinx.coroutines.CompletionHandlerException r1 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Exception in invokeOnCancellation handler for "
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2, r5)
            kotlinx.coroutines.o0.b(r0, r1)
            return
    }

    private final void q(kotlinx.coroutines.internal.p0<?> r4, java.lang.Throwable r5) {
            r3 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.q.f
            int r0 = r0.get(r3)
            r1 = 536870911(0x1fffffff, float:1.0842021E-19)
            r0 = r0 & r1
            if (r0 == r1) goto L33
            kotlin.coroutines.i r1 = r3.getContext()     // Catch: java.lang.Throwable -> L14
            r4.q(r0, r5, r1)     // Catch: java.lang.Throwable -> L14
            return
        L14:
            r4 = move-exception
            kotlin.coroutines.i r5 = r3.getContext()
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in invokeOnCancellation handler for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            kotlinx.coroutines.o0.b(r5, r0)
            return
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "The index for Segment.onCancellation(..) is broken"
            r4.<init>(r5)
            throw r4
    }

    private final boolean r(java.lang.Throwable r3) {
            r2 = this;
            boolean r0 = r2.E()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            kotlin.coroutines.e<T> r0 = r2.d
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>"
            kotlin.jvm.internal.g0.n(r0, r1)
            kotlinx.coroutines.internal.l r0 = (kotlinx.coroutines.internal.l) r0
            boolean r3 = r0.s(r3)
            return r3
    }

    private final void t() {
            r1 = this;
            boolean r0 = r1.E()
            if (r0 != 0) goto L9
            r1.s()
        L9:
            return
    }

    private final void u(int r2) {
            r1 = this;
            boolean r0 = r1.V()
            if (r0 == 0) goto L7
            return
        L7:
            kotlinx.coroutines.e1.a(r1, r2)
            return
    }

    private final kotlinx.coroutines.j1 w() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.q.h
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.j1 r0 = (kotlinx.coroutines.j1) r0
            return r0
    }

    private final java.lang.String z() {
            r2 = this;
            java.lang.Object r0 = r2.y()
            boolean r1 = r0 instanceof kotlinx.coroutines.t2
            if (r1 == 0) goto Lb
            java.lang.String r0 = "Active"
            return r0
        Lb:
            boolean r0 = r0 instanceof kotlinx.coroutines.t
            if (r0 == 0) goto L12
            java.lang.String r0 = "Cancelled"
            return r0
        L12:
            java.lang.String r0 = "Completed"
            return r0
    }

    @Override // kotlinx.coroutines.p
    public void B(@org.jetbrains.annotations.NotNull java.lang.Object r1) {
            r0 = this;
            int r1 = r0.c
            r0.u(r1)
            return
    }

    @Override // kotlinx.coroutines.p
    @org.jetbrains.annotations.Nullable
    public java.lang.Object C(T r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            r0 = 0
            kotlinx.coroutines.internal.s0 r2 = r1.W(r2, r3, r0)
            return r2
    }

    @Override // kotlinx.coroutines.p
    public void I(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r1) {
            r0 = this;
            kotlinx.coroutines.n r1 = r0.H(r1)
            r0.D(r1)
            return
    }

    @Override // kotlinx.coroutines.p
    @org.jetbrains.annotations.Nullable
    public java.lang.Object J(@org.jetbrains.annotations.NotNull java.lang.Throwable r5) {
            r4 = this;
            kotlinx.coroutines.d0 r0 = new kotlinx.coroutines.d0
            r1 = 0
            r2 = 2
            r3 = 0
            r0.<init>(r5, r1, r2, r3)
            kotlinx.coroutines.internal.s0 r5 = r4.W(r0, r3, r3)
            return r5
    }

    @org.jetbrains.annotations.NotNull
    protected java.lang.String L() {
            r1 = this;
            java.lang.String r0 = "CancellableContinuation"
            return r0
    }

    public final void M(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r1 = this;
            boolean r0 = r1.r(r2)
            if (r0 == 0) goto L7
            return
        L7:
            r1.a(r2)
            r1.t()
            return
    }

    public final void N() {
            r2 = this;
            kotlin.coroutines.e<T> r0 = r2.d
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.l
            if (r1 == 0) goto L9
            kotlinx.coroutines.internal.l r0 = (kotlinx.coroutines.internal.l) r0
            goto La
        L9:
            r0 = 0
        La:
            if (r0 == 0) goto L19
            java.lang.Throwable r0 = r0.x(r2)
            if (r0 != 0) goto L13
            goto L19
        L13:
            r2.s()
            r2.a(r0)
        L19:
            return
    }

    @Override // kotlinx.coroutines.p
    @org.jetbrains.annotations.Nullable
    public java.lang.Object O(T r1, @org.jetbrains.annotations.Nullable java.lang.Object r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r3) {
            r0 = this;
            kotlinx.coroutines.internal.s0 r1 = r0.W(r1, r2, r3)
            return r1
    }

    @Override // kotlinx.coroutines.p
    public void P(@org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r7, T r8) {
            r6 = this;
            kotlin.coroutines.e<T> r0 = r6.d
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.l
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.l r0 = (kotlinx.coroutines.internal.l) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            if (r0 == 0) goto Lf
            kotlinx.coroutines.m0 r2 = r0.d
        Lf:
            if (r2 != r7) goto L14
            r7 = 4
            r2 = 4
            goto L17
        L14:
            int r7 = r6.c
            r2 = r7
        L17:
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            r1 = r8
            T(r0, r1, r2, r3, r4, r5)
            return
    }

    @Override // kotlinx.coroutines.p
    public void Q() {
            r2 = this;
            kotlinx.coroutines.j1 r0 = r2.A()
            if (r0 != 0) goto L7
            goto L17
        L7:
            boolean r1 = r2.isCompleted()
            if (r1 == 0) goto L17
            r0.dispose()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.q.h
            kotlinx.coroutines.s2 r1 = kotlinx.coroutines.s2.a
            r0.set(r2, r1)
        L17:
            return
    }

    @kotlin.jvm.JvmName(name = "resetStateReusable")
    public final boolean R() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.q.g
            java.lang.Object r1 = r0.get(r3)
            boolean r2 = r1 instanceof kotlinx.coroutines.c0
            if (r2 == 0) goto L15
            kotlinx.coroutines.c0 r1 = (kotlinx.coroutines.c0) r1
            java.lang.Object r1 = r1.d
            if (r1 == 0) goto L15
            r3.s()
            r0 = 0
            return r0
        L15:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = kotlinx.coroutines.q.f
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r1.set(r3, r2)
            kotlinx.coroutines.d r1 = kotlinx.coroutines.d.a
            r0.set(r3, r1)
            r0 = 1
            return r0
    }

    @Override // kotlinx.coroutines.p
    public boolean a(@org.jetbrains.annotations.Nullable java.lang.Throwable r7) {
            r6 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.q.g
        L2:
            java.lang.Object r1 = r0.get(r6)
            boolean r2 = r1 instanceof kotlinx.coroutines.t2
            r3 = 0
            if (r2 != 0) goto Lc
            return r3
        Lc:
            kotlinx.coroutines.t r2 = new kotlinx.coroutines.t
            boolean r4 = r1 instanceof kotlinx.coroutines.n
            r5 = 1
            if (r4 != 0) goto L17
            boolean r4 = r1 instanceof kotlinx.coroutines.internal.p0
            if (r4 == 0) goto L18
        L17:
            r3 = 1
        L18:
            r2.<init>(r6, r7, r3)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.q.g
            boolean r2 = androidx.concurrent.futures.a.a(r3, r6, r1, r2)
            if (r2 == 0) goto L2
            r0 = r1
            kotlinx.coroutines.t2 r0 = (kotlinx.coroutines.t2) r0
            boolean r2 = r0 instanceof kotlinx.coroutines.n
            if (r2 == 0) goto L30
            kotlinx.coroutines.n r1 = (kotlinx.coroutines.n) r1
            r6.m(r1, r7)
            goto L39
        L30:
            boolean r0 = r0 instanceof kotlinx.coroutines.internal.p0
            if (r0 == 0) goto L39
            kotlinx.coroutines.internal.p0 r1 = (kotlinx.coroutines.internal.p0) r1
            r6.q(r1, r7)
        L39:
            r6.t()
            int r7 = r6.c
            r6.u(r7)
            return r5
    }

    @Override // kotlinx.coroutines.r3
    public void b(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.p0<?> r5, int r6) {
            r4 = this;
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.q.f
        L2:
            int r1 = r0.get(r4)
            r2 = 536870911(0x1fffffff, float:1.0842021E-19)
            r3 = r1 & r2
            if (r3 != r2) goto L1c
            int r2 = r1 >> 29
            int r2 = r2 << 29
            int r2 = r2 + r6
            boolean r1 = r0.compareAndSet(r4, r1, r2)
            if (r1 == 0) goto L2
            r4.D(r5)
            return
        L1c:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "invokeOnCancellation should be called at most once"
            r5.<init>(r6)
            throw r5
    }

    @Override // kotlinx.coroutines.d1
    public void d(@org.jetbrains.annotations.Nullable java.lang.Object r11, @org.jetbrains.annotations.NotNull java.lang.Throwable r12) {
            r10 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r11 = kotlinx.coroutines.q.g
        L2:
            java.lang.Object r1 = r11.get(r10)
            boolean r0 = r1 instanceof kotlinx.coroutines.t2
            if (r0 != 0) goto L54
            boolean r0 = r1 instanceof kotlinx.coroutines.d0
            if (r0 == 0) goto Lf
            goto L51
        Lf:
            boolean r0 = r1 instanceof kotlinx.coroutines.c0
            if (r0 == 0) goto L3d
            r2 = r1
            kotlinx.coroutines.c0 r2 = (kotlinx.coroutines.c0) r2
            boolean r0 = r2.h()
            if (r0 != 0) goto L35
            r8 = 15
            r9 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = r12
            kotlinx.coroutines.c0 r12 = kotlinx.coroutines.c0.g(r2, r3, r4, r5, r6, r7, r8, r9)
            r5 = r7
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.q.g
            boolean r12 = androidx.concurrent.futures.a.a(r0, r10, r1, r12)
            if (r12 == 0) goto L52
            r2.i(r10, r5)
            return
        L35:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Must be called at most once"
            r11.<init>(r12)
            throw r11
        L3d:
            r5 = r12
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r12 = kotlinx.coroutines.q.g
            kotlinx.coroutines.c0 r0 = new kotlinx.coroutines.c0
            r6 = 14
            r7 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            boolean r12 = androidx.concurrent.futures.a.a(r12, r10, r1, r0)
            if (r12 == 0) goto L52
        L51:
            return
        L52:
            r12 = r5
            goto L2
        L54:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "Not completed"
            r11.<init>(r12)
            throw r11
    }

    @Override // kotlinx.coroutines.d1
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.e<T> e() {
            r1 = this;
            kotlin.coroutines.e<T> r0 = r1.d
            return r0
    }

    @Override // kotlinx.coroutines.d1
    @org.jetbrains.annotations.Nullable
    public java.lang.Throwable f(@org.jetbrains.annotations.Nullable java.lang.Object r1) {
            r0 = this;
            java.lang.Throwable r1 = super.f(r1)
            if (r1 == 0) goto L7
            return r1
        L7:
            r1 = 0
            return r1
    }

    @Override // kotlinx.coroutines.d1
    public <T> T g(@org.jetbrains.annotations.Nullable java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof kotlinx.coroutines.c0
            if (r0 == 0) goto L8
            kotlinx.coroutines.c0 r2 = (kotlinx.coroutines.c0) r2
            java.lang.Object r2 = r2.a
        L8:
            return r2
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public kotlin.coroutines.jvm.internal.c getCallerFrame() {
            r2 = this;
            kotlin.coroutines.e<T> r0 = r2.d
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
            kotlin.coroutines.i r0 = r1.e
            return r0
    }

    @Override // kotlin.coroutines.jvm.internal.c
    @org.jetbrains.annotations.Nullable
    public java.lang.StackTraceElement getStackTraceElement() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.p
    public void h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.m0 r10, @org.jetbrains.annotations.NotNull java.lang.Throwable r11) {
            r9 = this;
            kotlin.coroutines.e<T> r0 = r9.d
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.l
            r2 = 0
            if (r1 == 0) goto La
            kotlinx.coroutines.internal.l r0 = (kotlinx.coroutines.internal.l) r0
            goto Lb
        La:
            r0 = r2
        Lb:
            kotlinx.coroutines.d0 r4 = new kotlinx.coroutines.d0
            r1 = 0
            r3 = 2
            r4.<init>(r11, r1, r3, r2)
            if (r0 == 0) goto L16
            kotlinx.coroutines.m0 r2 = r0.d
        L16:
            if (r2 != r10) goto L1b
            r10 = 4
            r5 = 4
            goto L1e
        L1b:
            int r10 = r9.c
            r5 = r10
        L1e:
            r7 = 4
            r8 = 0
            r6 = 0
            r3 = r9
            T(r3, r4, r5, r6, r7, r8)
            return
    }

    @Override // kotlinx.coroutines.p
    public boolean isActive() {
            r1 = this;
            java.lang.Object r0 = r1.y()
            boolean r0 = r0 instanceof kotlinx.coroutines.t2
            return r0
    }

    @Override // kotlinx.coroutines.p
    public boolean isCancelled() {
            r1 = this;
            java.lang.Object r0 = r1.y()
            boolean r0 = r0 instanceof kotlinx.coroutines.t
            return r0
    }

    @Override // kotlinx.coroutines.p
    public boolean isCompleted() {
            r1 = this;
            java.lang.Object r0 = r1.y()
            boolean r0 = r0 instanceof kotlinx.coroutines.t2
            r0 = r0 ^ 1
            return r0
    }

    @Override // kotlinx.coroutines.d1
    @org.jetbrains.annotations.Nullable
    public java.lang.Object j() {
            r1 = this;
            java.lang.Object r0 = r1.y()
            return r0
    }

    public final void m(@org.jetbrains.annotations.NotNull kotlinx.coroutines.n r4, @org.jetbrains.annotations.Nullable java.lang.Throwable r5) {
            r3 = this;
            r4.l(r5)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r4 = move-exception
            kotlin.coroutines.i r5 = r3.getContext()
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in invokeOnCancellation handler for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            kotlinx.coroutines.o0.b(r5, r0)
            return
    }

    @Override // kotlinx.coroutines.p
    public void o(T r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r3) {
            r1 = this;
            int r0 = r1.c
            r1.S(r2, r0, r3)
            return
    }

    public final void p(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r4, @org.jetbrains.annotations.NotNull java.lang.Throwable r5) {
            r3 = this;
            r4.invoke(r5)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r4 = move-exception
            kotlin.coroutines.i r5 = r3.getContext()
            kotlinx.coroutines.CompletionHandlerException r0 = new kotlinx.coroutines.CompletionHandlerException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Exception in resume onCancellation handler for "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            kotlinx.coroutines.o0.b(r5, r0)
            return
    }

    @Override // kotlin.coroutines.e
    public void resumeWith(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
            r6 = this;
            java.lang.Object r1 = kotlinx.coroutines.i0.c(r7, r6)
            int r2 = r6.c
            r4 = 4
            r5 = 0
            r3 = 0
            r0 = r6
            T(r0, r1, r2, r3, r4, r5)
            return
    }

    public final void s() {
            r2 = this;
            kotlinx.coroutines.j1 r0 = r2.w()
            if (r0 != 0) goto L7
            return
        L7:
            r0.dispose()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.q.h
            kotlinx.coroutines.s2 r1 = kotlinx.coroutines.s2.a
            r0.set(r2, r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.L()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            kotlin.coroutines.e<T> r1 = r2.d
            java.lang.String r1 = kotlinx.coroutines.u0.c(r1)
            r0.append(r1)
            java.lang.String r1 = "){"
            r0.append(r1)
            java.lang.String r1 = r2.z()
            r0.append(r1)
            java.lang.String r1 = "}@"
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.u0.b(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.Throwable v(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r1) {
            r0 = this;
            java.util.concurrent.CancellationException r1 = r1.H()
            return r1
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object x() {
            r3 = this;
            boolean r0 = r3.E()
            boolean r1 = r3.X()
            if (r1 == 0) goto L1d
            kotlinx.coroutines.j1 r1 = r3.w()
            if (r1 != 0) goto L13
            r3.A()
        L13:
            if (r0 == 0) goto L18
            r3.N()
        L18:
            java.lang.Object r0 = kotlin.coroutines.intrinsics.a.l()
            return r0
        L1d:
            if (r0 == 0) goto L22
            r3.N()
        L22:
            java.lang.Object r0 = r3.y()
            boolean r1 = r0 instanceof kotlinx.coroutines.d0
            if (r1 != 0) goto L54
            int r1 = r3.c
            boolean r1 = kotlinx.coroutines.e1.c(r1)
            if (r1 == 0) goto L4f
            kotlin.coroutines.i r1 = r3.getContext()
            kotlinx.coroutines.e2$b r2 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r1 = r1.get(r2)
            kotlinx.coroutines.e2 r1 = (kotlinx.coroutines.e2) r1
            if (r1 == 0) goto L4f
            boolean r2 = r1.isActive()
            if (r2 == 0) goto L47
            goto L4f
        L47:
            java.util.concurrent.CancellationException r1 = r1.H()
            r3.d(r0, r1)
            throw r1
        L4f:
            java.lang.Object r0 = r3.g(r0)
            return r0
        L54:
            kotlinx.coroutines.d0 r0 = (kotlinx.coroutines.d0) r0
            java.lang.Throwable r0 = r0.a
            throw r0
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object y() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.q.g
            java.lang.Object r0 = r0.get(r1)
            return r0
    }
}

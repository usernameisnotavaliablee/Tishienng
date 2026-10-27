package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,428:1\n1#2:429\n314#3,11:430\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n298#1:430,11\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class k0 extends kotlinx.coroutines.flow.internal.c<kotlinx.coroutines.flow.i0<?>> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = null;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _state;

    static {
            java.lang.Class<java.lang.Object> r0 = java.lang.Object.class
            java.lang.String r1 = "_state"
            java.lang.Class<kotlinx.coroutines.flow.k0> r2 = kotlinx.coroutines.flow.k0.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r2, r0, r1)
            kotlinx.coroutines.flow.k0.a = r0
            return
    }

    public k0() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater c() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.flow.k0.a
            return r0
    }

    private final void g(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r2.get(r4)
            r3.invoke(r0)
            goto L0
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public /* bridge */ /* synthetic */ boolean a(kotlinx.coroutines.flow.i0<?> r1) {
            r0 = this;
            kotlinx.coroutines.flow.i0 r1 = (kotlinx.coroutines.flow.i0) r1
            boolean r1 = r0.d(r1)
            return r1
    }

    @Override // kotlinx.coroutines.flow.internal.c
    public /* bridge */ /* synthetic */ kotlin.coroutines.e[] b(kotlinx.coroutines.flow.i0<?> r1) {
            r0 = this;
            kotlinx.coroutines.flow.i0 r1 = (kotlinx.coroutines.flow.i0) r1
            kotlin.coroutines.e[] r1 = r0.f(r1)
            return r1
    }

    public boolean d(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i0<?> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.flow.k0.a
            java.lang.Object r0 = r2.get(r1)
            if (r0 == 0) goto La
            r2 = 0
            return r2
        La:
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.flow.j0.b()
            r2.set(r1, r0)
            r2 = 1
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object e(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
            r3 = this;
            kotlinx.coroutines.q r0 = new kotlinx.coroutines.q
            kotlin.coroutines.e r1 = kotlin.coroutines.intrinsics.a.e(r4)
            r2 = 1
            r0.<init>(r1, r2)
            r0.Q()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = c()
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.flow.j0.b()
            boolean r1 = androidx.concurrent.futures.a.a(r1, r3, r2, r0)
            if (r1 != 0) goto L26
            kotlin.Result$a r1 = kotlin.Result.Companion
            kotlin.n1 r1 = kotlin.n1.a
            java.lang.Object r1 = kotlin.Result.m11constructorimpl(r1)
            r0.resumeWith(r1)
        L26:
            java.lang.Object r0 = r0.x()
            java.lang.Object r1 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r1) goto L33
            kotlin.coroutines.jvm.internal.e.c(r4)
        L33:
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r0 != r4) goto L3a
            return r0
        L3a:
            kotlin.n1 r4 = kotlin.n1.a
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.e<kotlin.n1>[] f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.i0<?> r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.flow.k0.a
            r0 = 0
            r2.set(r1, r0)
            kotlin.coroutines.e<kotlin.n1>[] r2 = kotlinx.coroutines.flow.internal.b.a
            return r2
    }

    public final void h() {
            r4 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.flow.k0.a
        L2:
            java.lang.Object r1 = r0.get(r4)
            if (r1 != 0) goto L9
            goto L22
        L9:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.flow.j0.c()
            if (r1 != r2) goto L10
            goto L22
        L10:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.flow.j0.b()
            if (r1 != r2) goto L23
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.flow.k0.a
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.flow.j0.c()
            boolean r1 = androidx.concurrent.futures.a.a(r2, r4, r1, r3)
            if (r1 == 0) goto L2
        L22:
            return
        L23:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.flow.k0.a
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.flow.j0.b()
            boolean r2 = androidx.concurrent.futures.a.a(r2, r4, r1, r3)
            if (r2 == 0) goto L2
            kotlinx.coroutines.q r1 = (kotlinx.coroutines.q) r1
            kotlin.Result$a r0 = kotlin.Result.Companion
            kotlin.n1 r0 = kotlin.n1.a
            java.lang.Object r0 = kotlin.Result.m11constructorimpl(r0)
            r1.resumeWith(r0)
            return
    }

    public final boolean i() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.flow.k0.a
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.flow.j0.b()
            java.lang.Object r0 = r0.getAndSet(r2, r1)
            kotlin.jvm.internal.g0.m(r0)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.flow.j0.c()
            if (r0 != r1) goto L15
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }
}

package kotlinx.coroutines.internal;

import kotlinx.coroutines.internal.g;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,269:1\n107#1,7:270\n1#2:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n115#1:270,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class g<N extends kotlinx.coroutines.internal.g<N>> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b = null;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _next;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _prev;

    static {
            java.lang.String r0 = "_next"
            java.lang.Class<kotlinx.coroutines.internal.g> r1 = kotlinx.coroutines.internal.g.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.internal.g.a = r0
            java.lang.String r0 = "_prev"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.internal.g.b = r0
            return
    }

    public g(@org.jetbrains.annotations.Nullable N r1) {
            r0 = this;
            r0.<init>()
            r0._prev = r1
            return
    }

    public static final /* synthetic */ java.lang.Object a(kotlinx.coroutines.internal.g r0) {
            java.lang.Object r0 = r0.f()
            return r0
    }

    private final N c() {
            r2 = this;
            kotlinx.coroutines.internal.g r0 = r2.g()
        L4:
            if (r0 == 0) goto L15
            boolean r1 = r0.h()
            if (r1 == 0) goto L15
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.g.b
            java.lang.Object r0 = r1.get(r0)
            kotlinx.coroutines.internal.g r0 = (kotlinx.coroutines.internal.g) r0
            goto L4
        L15:
            return r0
    }

    private final N d() {
            r2 = this;
            kotlinx.coroutines.internal.g r0 = r2.e()
            kotlin.jvm.internal.g0.m(r0)
        L7:
            boolean r1 = r0.h()
            if (r1 == 0) goto L16
            kotlinx.coroutines.internal.g r1 = r0.e()
            if (r1 != 0) goto L14
            goto L16
        L14:
            r0 = r1
            goto L7
        L16:
            return r0
    }

    private final java.lang.Object f() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.g.a
            java.lang.Object r0 = r0.get(r1)
            return r0
    }

    private final void n(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3, kotlin.jvm.functions.Function1<java.lang.Object, ? extends java.lang.Object> r4, java.lang.Object r5) {
            r2 = this;
        L0:
            java.lang.Object r0 = r3.get(r5)
            java.lang.Object r1 = r4.invoke(r0)
            boolean r0 = androidx.concurrent.futures.a.a(r3, r5, r0, r1)
            if (r0 == 0) goto L0
            return
    }

    public final void b() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.g.b
            r1 = 0
            r0.lazySet(r2, r1)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final N e() {
            r2 = this;
            java.lang.Object r0 = a(r2)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.internal.f.a()
            if (r0 != r1) goto Lc
            r0 = 0
            return r0
        Lc:
            kotlinx.coroutines.internal.g r0 = (kotlinx.coroutines.internal.g) r0
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final N g() {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.g.b
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.g r0 = (kotlinx.coroutines.internal.g) r0
            return r0
    }

    public abstract boolean h();

    public final boolean i() {
            r1 = this;
            kotlinx.coroutines.internal.g r0 = r1.e()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public final boolean j() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.g.a
            r1 = 0
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.internal.f.a()
            boolean r0 = androidx.concurrent.futures.a.a(r0, r3, r1, r2)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final N k(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0 r3) {
            r2 = this;
            java.lang.Object r0 = a(r2)
            kotlinx.coroutines.internal.s0 r1 = kotlinx.coroutines.internal.f.a()
            if (r0 == r1) goto Ld
            kotlinx.coroutines.internal.g r0 = (kotlinx.coroutines.internal.g) r0
            return r0
        Ld:
            r3.invoke()
            kotlin.KotlinNothingValueException r3 = new kotlin.KotlinNothingValueException
            r3.<init>()
            throw r3
    }

    public final void l() {
            r5 = this;
            boolean r0 = r5.i()
            if (r0 == 0) goto L7
            goto L3e
        L7:
            kotlinx.coroutines.internal.g r0 = r5.c()
            kotlinx.coroutines.internal.g r1 = r5.d()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.g.b
        L11:
            java.lang.Object r3 = r2.get(r1)
            r4 = r3
            kotlinx.coroutines.internal.g r4 = (kotlinx.coroutines.internal.g) r4
            if (r4 != 0) goto L1c
            r4 = 0
            goto L1d
        L1c:
            r4 = r0
        L1d:
            boolean r3 = androidx.concurrent.futures.a.a(r2, r1, r3, r4)
            if (r3 == 0) goto L11
            if (r0 == 0) goto L2a
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.g.a
            r2.set(r0, r1)
        L2a:
            boolean r2 = r1.h()
            if (r2 == 0) goto L36
            boolean r1 = r1.i()
            if (r1 == 0) goto L7
        L36:
            if (r0 == 0) goto L3e
            boolean r0 = r0.h()
            if (r0 != 0) goto L7
        L3e:
            return
    }

    public final boolean m(@org.jetbrains.annotations.NotNull N r3) {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.g.a
            r1 = 0
            boolean r3 = androidx.concurrent.futures.a.a(r0, r2, r1, r3)
            return r3
    }
}

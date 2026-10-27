package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlinx.coroutines.InternalCoroutinesApi
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,367:1\n73#1,3:369\n1#2:368\n*S KotlinDebug\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode\n*L\n134#1:369,3\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class y {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater a = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater b = null;

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicReferenceFieldUpdater c = null;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _next;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _prev;

    @kotlin.jvm.Volatile
    @org.jetbrains.annotations.Nullable
    private volatile java.lang.Object _removedRef;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.PublishedApi
    public static abstract class a extends kotlinx.coroutines.internal.b<kotlinx.coroutines.internal.y> {

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.internal.y b;

        @kotlin.jvm.JvmField
        @org.jetbrains.annotations.Nullable
        public kotlinx.coroutines.internal.y c;

        public a(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r1) {
                r0 = this;
                r0.<init>()
                r0.b = r1
                return
        }

        @Override // kotlinx.coroutines.internal.b
        public /* bridge */ /* synthetic */ void c(kotlinx.coroutines.internal.y r1, java.lang.Object r2) {
                r0 = this;
                kotlinx.coroutines.internal.y r1 = (kotlinx.coroutines.internal.y) r1
                r0.f(r1, r2)
                return
        }

        public void f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
                r2 = this;
                if (r4 != 0) goto L4
                r4 = 1
                goto L5
            L4:
                r4 = 0
            L5:
                if (r4 == 0) goto La
                kotlinx.coroutines.internal.y r0 = r2.b
                goto Lc
            La:
                kotlinx.coroutines.internal.y r0 = r2.c
            Lc:
                if (r0 == 0) goto L24
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.y.d()
                boolean r3 = androidx.concurrent.futures.a.a(r1, r3, r2, r0)
                if (r3 == 0) goto L24
                if (r4 == 0) goto L24
                kotlinx.coroutines.internal.y r3 = r2.b
                kotlinx.coroutines.internal.y r4 = r2.c
                kotlin.jvm.internal.g0.m(r4)
                kotlinx.coroutines.internal.y.c(r3, r4)
            L24:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @kotlin.jvm.internal.SourceDebugExtension({"SMAP\nLockFreeLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockFreeLinkedList.kt\nkotlinx/coroutines/internal/LockFreeLinkedListNode$makeCondAddOp$1\n*L\n1#1,367:1\n*E\n"})
    public static final class b extends kotlinx.coroutines.internal.y.a {
        final /* synthetic */ kotlin.jvm.functions.Function0<java.lang.Boolean> d;

        public b(kotlinx.coroutines.internal.y r1, kotlin.jvm.functions.Function0<java.lang.Boolean> r2) {
                r0 = this;
                r0.d = r2
                r0.<init>(r1)
                return
        }

        @Override // kotlinx.coroutines.internal.b
        public /* bridge */ /* synthetic */ java.lang.Object e(kotlinx.coroutines.internal.y r1) {
                r0 = this;
                kotlinx.coroutines.internal.y r1 = (kotlinx.coroutines.internal.y) r1
                java.lang.Object r1 = r0.g(r1)
                return r1
        }

        @org.jetbrains.annotations.Nullable
        public java.lang.Object g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r1) {
                r0 = this;
                kotlin.jvm.functions.Function0<java.lang.Boolean> r1 = r0.d
                java.lang.Object r1 = r1.invoke()
                java.lang.Boolean r1 = (java.lang.Boolean) r1
                boolean r1 = r1.booleanValue()
                if (r1 == 0) goto L10
                r1 = 0
                return r1
            L10:
                java.lang.Object r1 = kotlinx.coroutines.internal.x.a()
                return r1
        }
    }


    static {
            java.lang.String r0 = "_next"
            java.lang.Class<kotlinx.coroutines.internal.y> r1 = kotlinx.coroutines.internal.y.class
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.internal.y.a = r0
            java.lang.String r0 = "_prev"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.internal.y.b = r0
            java.lang.String r0 = "_removedRef"
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(r1, r2, r0)
            kotlinx.coroutines.internal.y.c = r0
            return
    }

    public y() {
            r0 = this;
            r0.<init>()
            r0._next = r0
            r0._prev = r0
            return
    }

    public static final /* synthetic */ void c(kotlinx.coroutines.internal.y r0, kotlinx.coroutines.internal.y r1) {
            r0.m(r1)
            return
    }

    public static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater d() {
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.a
            return r0
    }

    private final kotlinx.coroutines.internal.y k(kotlinx.coroutines.internal.k0 r9) {
            r8 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.b
            java.lang.Object r0 = r0.get(r8)
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.y) r0
            r1 = 0
            r2 = r0
        La:
            r3 = r1
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.y.a
            java.lang.Object r5 = r4.get(r2)
            if (r5 != r8) goto L1f
            if (r0 != r2) goto L16
            goto L28
        L16:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = kotlinx.coroutines.internal.y.b
            boolean r0 = androidx.concurrent.futures.a.a(r1, r8, r0, r2)
            if (r0 != 0) goto L28
            goto L0
        L1f:
            boolean r6 = r8.q()
            if (r6 == 0) goto L26
            return r1
        L26:
            if (r5 != r9) goto L29
        L28:
            return r2
        L29:
            boolean r6 = r5 instanceof kotlinx.coroutines.internal.k0
            if (r6 == 0) goto L33
            kotlinx.coroutines.internal.k0 r5 = (kotlinx.coroutines.internal.k0) r5
            r5.b(r2)
            goto L0
        L33:
            boolean r6 = r5 instanceof kotlinx.coroutines.internal.m0
            if (r6 == 0) goto L4f
            if (r3 == 0) goto L46
            kotlinx.coroutines.internal.m0 r5 = (kotlinx.coroutines.internal.m0) r5
            kotlinx.coroutines.internal.y r5 = r5.a
            boolean r2 = androidx.concurrent.futures.a.a(r4, r3, r2, r5)
            if (r2 != 0) goto L44
            goto L0
        L44:
            r2 = r3
            goto La
        L46:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = kotlinx.coroutines.internal.y.b
            java.lang.Object r2 = r4.get(r2)
            kotlinx.coroutines.internal.y r2 = (kotlinx.coroutines.internal.y) r2
            goto Lb
        L4f:
            java.lang.String r3 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.g0.n(r5, r3)
            r3 = r5
            kotlinx.coroutines.internal.y r3 = (kotlinx.coroutines.internal.y) r3
            r7 = r3
            r3 = r2
            r2 = r7
            goto Lb
    }

    private final kotlinx.coroutines.internal.y l(kotlinx.coroutines.internal.y r2) {
            r1 = this;
        L0:
            boolean r0 = r2.q()
            if (r0 != 0) goto L7
            return r2
        L7:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.b
            java.lang.Object r2 = r0.get(r2)
            kotlinx.coroutines.internal.y r2 = (kotlinx.coroutines.internal.y) r2
            goto L0
    }

    private final void m(kotlinx.coroutines.internal.y r4) {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.b
        L2:
            java.lang.Object r1 = r0.get(r4)
            kotlinx.coroutines.internal.y r1 = (kotlinx.coroutines.internal.y) r1
            java.lang.Object r2 = r3.n()
            if (r2 == r4) goto Lf
            goto L21
        Lf:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = kotlinx.coroutines.internal.y.b
            boolean r1 = androidx.concurrent.futures.a.a(r2, r4, r1, r3)
            if (r1 == 0) goto L2
            boolean r0 = r3.q()
            if (r0 == 0) goto L21
            r0 = 0
            r4.k(r0)
        L21:
            return
    }

    private final void r(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.n1> r3, java.lang.Object r4) {
            r1 = this;
        L0:
            java.lang.Object r0 = r2.get(r4)
            r3.invoke(r0)
            goto L0
    }

    private final kotlinx.coroutines.internal.m0 w() {
            r2 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.c
            java.lang.Object r1 = r0.get(r2)
            kotlinx.coroutines.internal.m0 r1 = (kotlinx.coroutines.internal.m0) r1
            if (r1 != 0) goto L12
            kotlinx.coroutines.internal.m0 r1 = new kotlinx.coroutines.internal.m0
            r1.<init>(r2)
            r0.lazySet(r2, r1)
        L12:
            return r1
    }

    public final void f(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r2) {
            r1 = this;
        L0:
            kotlinx.coroutines.internal.y r0 = r1.p()
            boolean r0 = r0.i(r2, r1)
            if (r0 == 0) goto L0
            return
    }

    public final boolean h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r3, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r4) {
            r2 = this;
            kotlinx.coroutines.internal.y$b r0 = new kotlinx.coroutines.internal.y$b
            r0.<init>(r3, r4)
        L5:
            kotlinx.coroutines.internal.y r4 = r2.p()
            int r4 = r4.x(r3, r2, r0)
            r1 = 1
            if (r4 == r1) goto L16
            r1 = 2
            if (r4 == r1) goto L14
            goto L5
        L14:
            r3 = 0
            return r3
        L16:
            return r1
    }

    @kotlin.PublishedApi
    public final boolean i(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.b
            r0.lazySet(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.a
            r0.lazySet(r2, r3)
            boolean r0 = androidx.concurrent.futures.a.a(r0, r1, r3, r2)
            if (r0 != 0) goto L12
            r2 = 0
            return r2
        L12:
            r2.m(r3)
            r2 = 1
            return r2
    }

    public final boolean j(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.b
            r0.lazySet(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.a
            r0.lazySet(r2, r1)
        La:
            java.lang.Object r0 = r1.n()
            if (r0 == r1) goto L12
            r2 = 0
            return r2
        L12:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.a
            boolean r0 = androidx.concurrent.futures.a.a(r0, r1, r1, r2)
            if (r0 == 0) goto La
            r2.m(r1)
            r2 = 1
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.Object n() {
            r3 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.a
        L2:
            java.lang.Object r1 = r0.get(r3)
            boolean r2 = r1 instanceof kotlinx.coroutines.internal.k0
            if (r2 != 0) goto Lb
            return r1
        Lb:
            kotlinx.coroutines.internal.k0 r1 = (kotlinx.coroutines.internal.k0) r1
            r1.b(r3)
            goto L2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.y o() {
            r1 = this;
            java.lang.Object r0 = r1.n()
            kotlinx.coroutines.internal.y r0 = kotlinx.coroutines.internal.x.f(r0)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.y p() {
            r1 = this;
            r0 = 0
            kotlinx.coroutines.internal.y r0 = r1.k(r0)
            if (r0 != 0) goto L13
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.b
            java.lang.Object r0 = r0.get(r1)
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.y) r0
            kotlinx.coroutines.internal.y r0 = r1.l(r0)
        L13:
            return r0
    }

    public boolean q() {
            r1 = this;
            java.lang.Object r0 = r1.n()
            boolean r0 = r0 instanceof kotlinx.coroutines.internal.m0
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.internal.y.a s(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<java.lang.Boolean> r3) {
            r1 = this;
            kotlinx.coroutines.internal.y$b r0 = new kotlinx.coroutines.internal.y$b
            r0.<init>(r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    protected kotlinx.coroutines.internal.y t() {
            r3 = this;
            java.lang.Object r0 = r3.n()
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.m0
            r2 = 0
            if (r1 == 0) goto Lc
            kotlinx.coroutines.internal.m0 r0 = (kotlinx.coroutines.internal.m0) r0
            goto Ld
        Lc:
            r0 = r2
        Ld:
            if (r0 == 0) goto L12
            kotlinx.coroutines.internal.y r0 = r0.a
            return r0
        L12:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlinx.coroutines.internal.y$c r1 = new kotlinx.coroutines.internal.y$c
            r1.<init>(r2)
            r0.append(r1)
            r1 = 64
            r0.append(r1)
            java.lang.String r1 = kotlinx.coroutines.u0.b(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public boolean u() {
            r1 = this;
            kotlinx.coroutines.internal.y r0 = r1.v()
            if (r0 != 0) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    @kotlin.PublishedApi
    @org.jetbrains.annotations.Nullable
    public final kotlinx.coroutines.internal.y v() {
            r4 = this;
        L0:
            java.lang.Object r0 = r4.n()
            boolean r1 = r0 instanceof kotlinx.coroutines.internal.m0
            if (r1 == 0) goto Ld
            kotlinx.coroutines.internal.m0 r0 = (kotlinx.coroutines.internal.m0) r0
            kotlinx.coroutines.internal.y r0 = r0.a
            return r0
        Ld:
            if (r0 != r4) goto L12
            kotlinx.coroutines.internal.y r0 = (kotlinx.coroutines.internal.y) r0
            return r0
        L12:
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }"
            kotlin.jvm.internal.g0.n(r0, r1)
            r1 = r0
            kotlinx.coroutines.internal.y r1 = (kotlinx.coroutines.internal.y) r1
            kotlinx.coroutines.internal.m0 r2 = r1.w()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = kotlinx.coroutines.internal.y.a
            boolean r0 = androidx.concurrent.futures.a.a(r3, r4, r0, r2)
            if (r0 == 0) goto L0
            r0 = 0
            r1.k(r0)
            return r0
    }

    @kotlin.PublishedApi
    public final int x(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r3, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y.a r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.b
            r0.lazySet(r2, r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.internal.y.a
            r0.lazySet(r2, r3)
            r4.c = r3
            boolean r2 = androidx.concurrent.futures.a.a(r0, r1, r3, r4)
            if (r2 != 0) goto L14
            r2 = 0
            return r2
        L14:
            java.lang.Object r2 = r4.b(r1)
            if (r2 != 0) goto L1c
            r2 = 1
            return r2
        L1c:
            r2 = 2
            return r2
    }

    public final void y(@org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.internal.y r2) {
            r0 = this;
            return
    }
}

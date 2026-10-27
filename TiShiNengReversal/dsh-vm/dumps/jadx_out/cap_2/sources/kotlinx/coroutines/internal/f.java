package kotlinx.coroutines.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListNode\n*L\n1#1,269:1\n46#1,8:284\n107#2,7:270\n107#2,7:277\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n74#1:284,8\n27#1:270,7\n85#1:277,7\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class f {
    private static final int a = 16;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 b = null;

    static {
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "CLOSED"
            r0.<init>(r1)
            kotlinx.coroutines.internal.f.b = r0
            return
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 a() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.internal.f.b
            return r0
    }

    private static final boolean b(java.lang.Object r2, java.util.concurrent.atomic.AtomicIntegerFieldUpdater r3, int r4, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r5) {
        L0:
            int r0 = r3.get(r2)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            java.lang.Object r1 = r5.invoke(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L16
            r2 = 0
            return r2
        L16:
            int r1 = r0 + r4
            boolean r0 = r3.compareAndSet(r2, r0, r1)
            if (r0 == 0) goto L0
            r2 = 1
            return r2
    }

    private static final boolean c(java.lang.Object r1, java.util.concurrent.atomic.AtomicIntegerArray r2, int r3, int r4, kotlin.jvm.functions.Function1<? super java.lang.Integer, java.lang.Boolean> r5) {
        L0:
            int r1 = r2.get(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            java.lang.Object r0 = r5.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L16
            r1 = 0
            return r1
        L16:
            int r0 = r1 + r4
            boolean r1 = r2.compareAndSet(r3, r1, r0)
            if (r1 == 0) goto L0
            r1 = 1
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final <N extends kotlinx.coroutines.internal.g<N>> N d(@org.jetbrains.annotations.NotNull N r2) {
        L0:
            java.lang.Object r0 = kotlinx.coroutines.internal.g.a(r2)
            kotlinx.coroutines.internal.s0 r1 = a()
            if (r0 != r1) goto Lb
            return r2
        Lb:
            kotlinx.coroutines.internal.g r0 = (kotlinx.coroutines.internal.g) r0
            if (r0 != 0) goto L16
            boolean r0 = r2.j()
            if (r0 == 0) goto L0
            return r2
        L16:
            r2 = r0
            goto L0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object e(@org.jetbrains.annotations.Nullable java.lang.Object r8, @org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicReferenceFieldUpdater r9, long r10, @org.jetbrains.annotations.NotNull java.lang.Object r12, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Long, java.lang.Object, java.lang.Object> r13) {
        L0:
            java.lang.Object r0 = g(r12, r10, r13)
            boolean r1 = kotlinx.coroutines.internal.q0.h(r0)
            if (r1 != 0) goto L3e
            kotlinx.coroutines.internal.p0 r1 = kotlinx.coroutines.internal.q0.f(r0)
        Le:
            java.lang.Object r2 = r9.get(r8)
            kotlinx.coroutines.internal.p0 r2 = (kotlinx.coroutines.internal.p0) r2
            long r3 = r2.c
            long r5 = r1.c
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 < 0) goto L1d
            return r0
        L1d:
            boolean r3 = r1.s()
            if (r3 != 0) goto L24
            goto L0
        L24:
            boolean r3 = androidx.concurrent.futures.a.a(r9, r8, r2, r1)
            if (r3 == 0) goto L34
            boolean r8 = r2.o()
            if (r8 == 0) goto L33
            r2.l()
        L33:
            return r0
        L34:
            boolean r2 = r1.o()
            if (r2 == 0) goto Le
            r1.l()
            goto Le
        L3e:
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.Object f(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicReferenceArray r8, int r9, long r10, @org.jetbrains.annotations.NotNull java.lang.Object r12, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Long, java.lang.Object, java.lang.Object> r13) {
        L0:
            java.lang.Object r7 = g(r12, r10, r13)
            boolean r0 = kotlinx.coroutines.internal.q0.h(r7)
            if (r0 != 0) goto L3e
            kotlinx.coroutines.internal.p0 r0 = kotlinx.coroutines.internal.q0.f(r7)
        Le:
            java.lang.Object r1 = r8.get(r9)
            kotlinx.coroutines.internal.p0 r1 = (kotlinx.coroutines.internal.p0) r1
            long r2 = r1.c
            long r4 = r0.c
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 < 0) goto L1d
            return r7
        L1d:
            boolean r2 = r0.s()
            if (r2 != 0) goto L24
            goto L0
        L24:
            boolean r2 = com.google.common.util.concurrent.b.a(r8, r9, r1, r0)
            if (r2 == 0) goto L34
            boolean r8 = r1.o()
            if (r8 == 0) goto L33
            r1.l()
        L33:
            return r7
        L34:
            boolean r1 = r0.o()
            if (r1 == 0) goto Le
            r0.l()
            goto Le
        L3e:
            return r7
    }

    @org.jetbrains.annotations.NotNull
    public static final <S extends kotlinx.coroutines.internal.p0<S>> java.lang.Object g(@org.jetbrains.annotations.NotNull S r4, long r5, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super java.lang.Long, ? super S, ? extends S> r7) {
        L0:
            long r0 = r4.c
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 < 0) goto L12
            boolean r0 = r4.h()
            if (r0 == 0) goto Ld
            goto L12
        Ld:
            java.lang.Object r4 = kotlinx.coroutines.internal.q0.b(r4)
            return r4
        L12:
            java.lang.Object r0 = kotlinx.coroutines.internal.g.a(r4)
            kotlinx.coroutines.internal.s0 r1 = a()
            if (r0 != r1) goto L23
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.internal.f.b
            java.lang.Object r4 = kotlinx.coroutines.internal.q0.b(r4)
            return r4
        L23:
            kotlinx.coroutines.internal.g r0 = (kotlinx.coroutines.internal.g) r0
            kotlinx.coroutines.internal.p0 r0 = (kotlinx.coroutines.internal.p0) r0
            if (r0 == 0) goto L2b
        L29:
            r4 = r0
            goto L0
        L2b:
            long r0 = r4.c
            r2 = 1
            long r0 = r0 + r2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.invoke(r0, r4)
            kotlinx.coroutines.internal.p0 r0 = (kotlinx.coroutines.internal.p0) r0
            boolean r1 = r4.m(r0)
            if (r1 == 0) goto L0
            boolean r1 = r4.h()
            if (r1 == 0) goto L29
            r4.l()
            goto L29
    }

    private static final void h(java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.n1> r2, java.lang.Object r3) {
        L0:
            java.lang.Object r0 = r1.get(r3)
            r2.invoke(r0)
            goto L0
    }

    private static final void i(java.util.concurrent.atomic.AtomicReferenceArray r1, int r2, kotlin.jvm.functions.Function1<java.lang.Object, kotlin.n1> r3) {
        L0:
            java.lang.Object r0 = r1.get(r2)
            r3.invoke(r0)
            goto L0
    }

    public static final boolean j(@org.jetbrains.annotations.Nullable java.lang.Object r7, @org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8, @org.jetbrains.annotations.NotNull java.lang.Object r9) {
        L0:
            java.lang.Object r0 = r8.get(r7)
            kotlinx.coroutines.internal.p0 r0 = (kotlinx.coroutines.internal.p0) r0
            long r1 = r0.c
            long r3 = r9.c
            r5 = 1
            int r6 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r6 < 0) goto L10
            return r5
        L10:
            boolean r1 = r9.s()
            if (r1 != 0) goto L18
            r7 = 0
            return r7
        L18:
            boolean r1 = androidx.concurrent.futures.a.a(r8, r7, r0, r9)
            if (r1 == 0) goto L28
            boolean r7 = r0.o()
            if (r7 == 0) goto L27
            r0.l()
        L27:
            return r5
        L28:
            boolean r0 = r9.o()
            if (r0 == 0) goto L0
            r9.l()
            goto L0
    }

    public static final boolean k(@org.jetbrains.annotations.Nullable java.lang.Object r6, @org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicReferenceArray r7, int r8, @org.jetbrains.annotations.NotNull java.lang.Object r9) {
        L0:
            java.lang.Object r6 = r7.get(r8)
            kotlinx.coroutines.internal.p0 r6 = (kotlinx.coroutines.internal.p0) r6
            long r0 = r6.c
            long r2 = r9.c
            r4 = 1
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 < 0) goto L10
            return r4
        L10:
            boolean r0 = r9.s()
            if (r0 != 0) goto L18
            r6 = 0
            return r6
        L18:
            boolean r0 = com.google.common.util.concurrent.b.a(r7, r8, r6, r9)
            if (r0 == 0) goto L28
            boolean r7 = r6.o()
            if (r7 == 0) goto L27
            r6.l()
        L27:
            return r4
        L28:
            boolean r6 = r9.o()
            if (r6 == 0) goto L0
            r9.l()
            goto L0
    }
}

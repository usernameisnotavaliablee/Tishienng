package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nJob.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n+ 2 CompletionHandler.kt\nkotlinx/coroutines/CompletionHandlerKt\n+ 3 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n*L\n1#1,685:1\n13#2:686\n1295#3,2:687\n1295#3,2:689\n1295#3,2:691\n1295#3,2:693\n*S KotlinDebug\n*F\n+ 1 Job.kt\nkotlinx/coroutines/JobKt__JobKt\n*L\n494#1:686\n521#1:687,2\n535#1:689,2\n629#1:691,2\n653#1:693,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final /* synthetic */ class j2 {
    public static final boolean A(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r1 = r1.get(r0)
            kotlinx.coroutines.e2 r1 = (kotlinx.coroutines.e2) r1
            if (r1 == 0) goto Lf
            boolean r1 = r1.isActive()
            return r1
        Lf:
            r1 = 1
            return r1
    }

    private static final java.lang.Throwable B(java.lang.Throwable r2, kotlinx.coroutines.e2 r3) {
            if (r2 != 0) goto La
            kotlinx.coroutines.JobCancellationException r2 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r0 = "Job was cancelled"
            r1 = 0
            r2.<init>(r0, r1, r3)
        La:
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.b0 a(@org.jetbrains.annotations.Nullable kotlinx.coroutines.e2 r1) {
            kotlinx.coroutines.g2 r0 = new kotlinx.coroutines.g2
            r0.<init>(r1)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    @kotlin.jvm.JvmName(name = "Job")
    public static final /* synthetic */ kotlinx.coroutines.e2 b(kotlinx.coroutines.e2 r0) {
            kotlinx.coroutines.b0 r0 = kotlinx.coroutines.h2.a(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.b0 c(kotlinx.coroutines.e2 r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.b0 r0 = kotlinx.coroutines.h2.a(r0)
            return r0
    }

    public static /* synthetic */ kotlinx.coroutines.e2 d(kotlinx.coroutines.e2 r0, int r1, java.lang.Object r2) {
            r1 = r1 & 1
            if (r1 == 0) goto L5
            r0 = 0
        L5:
            kotlinx.coroutines.e2 r0 = kotlinx.coroutines.h2.b(r0)
            return r0
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void e(kotlin.coroutines.i r1) {
            r0 = 0
            kotlinx.coroutines.h2.f(r1, r0)
            return
    }

    public static final void f(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r2) {
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r1 = r1.get(r0)
            kotlinx.coroutines.e2 r1 = (kotlinx.coroutines.e2) r1
            if (r1 == 0) goto Ld
            r1.b(r2)
        Ld:
            return
    }

    public static final void g(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r0, @org.jetbrains.annotations.NotNull java.lang.String r1, @org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            java.util.concurrent.CancellationException r1 = kotlinx.coroutines.s1.a(r1, r2)
            r0.b(r1)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ boolean h(kotlin.coroutines.i r1, java.lang.Throwable r2) {
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r1 = r1.get(r0)
            boolean r0 = r1 instanceof kotlinx.coroutines.l2
            if (r0 == 0) goto Ld
            kotlinx.coroutines.l2 r1 = (kotlinx.coroutines.l2) r1
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 != 0) goto L12
            r1 = 0
            return r1
        L12:
            java.lang.Throwable r2 = B(r2, r1)
            r1.j0(r2)
            r1 = 1
            return r1
    }

    public static /* synthetic */ void i(kotlin.coroutines.i r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.h2.f(r0, r1)
            return
    }

    public static /* synthetic */ void j(kotlinx.coroutines.e2 r0, java.lang.String r1, java.lang.Throwable r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            kotlinx.coroutines.h2.g(r0, r1, r2)
            return
    }

    public static /* synthetic */ boolean k(kotlin.coroutines.i r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            boolean r0 = kotlinx.coroutines.h2.h(r0, r1)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.Object l(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r0 = 0
            r1 = 1
            kotlinx.coroutines.e2.a.b(r2, r0, r1, r0)
            java.lang.Object r2 = r2.M(r3)
            java.lang.Object r3 = kotlin.coroutines.intrinsics.a.l()
            if (r2 != r3) goto L10
            return r2
        L10:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void m(kotlin.coroutines.i r1) {
            r0 = 0
            kotlinx.coroutines.h2.o(r1, r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void n(kotlin.coroutines.i r3, java.lang.Throwable r4) {
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r3 = r3.get(r0)
            kotlinx.coroutines.e2 r3 = (kotlinx.coroutines.e2) r3
            if (r3 != 0) goto Lb
            goto L31
        Lb:
            kotlin.sequences.m r0 = r3.E()
            java.util.Iterator r0 = r0.iterator()
        L13:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L31
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.e2 r1 = (kotlinx.coroutines.e2) r1
            boolean r2 = r1 instanceof kotlinx.coroutines.l2
            if (r2 == 0) goto L26
            kotlinx.coroutines.l2 r1 = (kotlinx.coroutines.l2) r1
            goto L27
        L26:
            r1 = 0
        L27:
            if (r1 == 0) goto L13
            java.lang.Throwable r2 = B(r4, r3)
            r1.j0(r2)
            goto L13
        L31:
            return
    }

    public static final void o(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r2) {
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r1 = r1.get(r0)
            kotlinx.coroutines.e2 r1 = (kotlinx.coroutines.e2) r1
            if (r1 == 0) goto L24
            kotlin.sequences.m r1 = r1.E()
            if (r1 == 0) goto L24
            java.util.Iterator r1 = r1.iterator()
        L14:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L24
            java.lang.Object r0 = r1.next()
            kotlinx.coroutines.e2 r0 = (kotlinx.coroutines.e2) r0
            r0.b(r2)
            goto L14
        L24:
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void p(kotlinx.coroutines.e2 r1) {
            r0 = 0
            kotlinx.coroutines.h2.r(r1, r0)
            return
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public static final /* synthetic */ void q(kotlinx.coroutines.e2 r3, java.lang.Throwable r4) {
            kotlin.sequences.m r0 = r3.E()
            java.util.Iterator r0 = r0.iterator()
        L8:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L26
            java.lang.Object r1 = r0.next()
            kotlinx.coroutines.e2 r1 = (kotlinx.coroutines.e2) r1
            boolean r2 = r1 instanceof kotlinx.coroutines.l2
            if (r2 == 0) goto L1b
            kotlinx.coroutines.l2 r1 = (kotlinx.coroutines.l2) r1
            goto L1c
        L1b:
            r1 = 0
        L1c:
            if (r1 == 0) goto L8
            java.lang.Throwable r2 = B(r4, r3)
            r1.j0(r2)
            goto L8
        L26:
            return
    }

    public static final void r(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r1, @org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r2) {
            kotlin.sequences.m r1 = r1.E()
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L18
            java.lang.Object r0 = r1.next()
            kotlinx.coroutines.e2 r0 = (kotlinx.coroutines.e2) r0
            r0.b(r2)
            goto L8
        L18:
            return
    }

    public static /* synthetic */ void s(kotlin.coroutines.i r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.h2.n(r0, r1)
            return
    }

    public static /* synthetic */ void t(kotlin.coroutines.i r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.h2.o(r0, r1)
            return
    }

    public static /* synthetic */ void u(kotlinx.coroutines.e2 r0, java.lang.Throwable r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.h2.q(r0, r1)
            return
    }

    public static /* synthetic */ void v(kotlinx.coroutines.e2 r0, java.util.concurrent.CancellationException r1, int r2, java.lang.Object r3) {
            r2 = r2 & 1
            if (r2 == 0) goto L5
            r1 = 0
        L5:
            kotlinx.coroutines.h2.r(r0, r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.j1 w(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.j1 r2) {
            kotlinx.coroutines.l1 r0 = new kotlinx.coroutines.l1
            r0.<init>(r2)
            kotlinx.coroutines.j1 r1 = r1.k(r0)
            return r1
    }

    public static final void x(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1) {
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r1 = r1.get(r0)
            kotlinx.coroutines.e2 r1 = (kotlinx.coroutines.e2) r1
            if (r1 == 0) goto Ld
            kotlinx.coroutines.h2.A(r1)
        Ld:
            return
    }

    public static final void y(@org.jetbrains.annotations.NotNull kotlinx.coroutines.e2 r1) {
            boolean r0 = r1.isActive()
            if (r0 == 0) goto L7
            return
        L7:
            java.util.concurrent.CancellationException r1 = r1.H()
            throw r1
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.e2 z(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3) {
            kotlinx.coroutines.e2$b r0 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r0 = r3.get(r0)
            kotlinx.coroutines.e2 r0 = (kotlinx.coroutines.e2) r0
            if (r0 == 0) goto Lb
            return r0
        Lb:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Current context doesn't contain Job in it: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            java.lang.String r3 = r3.toString()
            r0.<init>(r3)
            throw r0
    }
}

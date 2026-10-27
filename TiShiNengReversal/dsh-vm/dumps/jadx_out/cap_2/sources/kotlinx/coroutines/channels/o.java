package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BufferedChannel.kt\nkotlinx/coroutines/channels/ChannelSegment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3055:1\n1#2:3056\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class o<E> extends kotlinx.coroutines.internal.p0<kotlinx.coroutines.channels.o<E>> {

    @org.jetbrains.annotations.Nullable
    private final kotlinx.coroutines.channels.BufferedChannel<E> e;

    @org.jetbrains.annotations.NotNull
    private final java.util.concurrent.atomic.AtomicReferenceArray f;

    public o(long r1, @org.jetbrains.annotations.Nullable kotlinx.coroutines.channels.o<E> r3, @org.jetbrains.annotations.Nullable kotlinx.coroutines.channels.BufferedChannel<E> r4, int r5) {
            r0 = this;
            r0.<init>(r1, r3, r5)
            r0.e = r4
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = kotlinx.coroutines.channels.i.b
            int r2 = r2 * 2
            r1.<init>(r2)
            r0.f = r1
            return
    }

    private final void B(int r2, java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f
            int r2 = r2 * 2
            r0.lazySet(r2, r3)
            return
    }

    public final E A(int r2) {
            r1 = this;
            java.lang.Object r0 = r1.x(r2)
            r1.u(r2)
            return r0
    }

    public final void C(int r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f
            int r2 = r2 * 2
            int r2 = r2 + 1
            r0.set(r2, r3)
            return
    }

    public final void D(int r1, E r2) {
            r0 = this;
            r0.B(r1, r2)
            return
    }

    @Override // kotlinx.coroutines.internal.p0
    public int p() {
            r1 = this;
            int r0 = kotlinx.coroutines.channels.i.b
            return r0
    }

    @Override // kotlinx.coroutines.internal.p0
    public void q(int r4, @org.jetbrains.annotations.Nullable java.lang.Throwable r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r6) {
            r3 = this;
            int r5 = kotlinx.coroutines.channels.i.b
            if (r4 < r5) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            if (r0 == 0) goto La
            int r4 = r4 - r5
        La:
            java.lang.Object r5 = r3.x(r4)
        Le:
            java.lang.Object r1 = r3.y(r4)
            boolean r2 = r1 instanceof kotlinx.coroutines.r3
            if (r2 != 0) goto L73
            boolean r2 = r1 instanceof kotlinx.coroutines.channels.e0
            if (r2 == 0) goto L1b
            goto L73
        L1b:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.j()
            if (r1 == r2) goto L62
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.i()
            if (r1 != r2) goto L28
            goto L62
        L28:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.p()
            if (r1 == r2) goto Le
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.q()
            if (r1 != r2) goto L35
            goto Le
        L35:
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.channels.i.f()
            if (r1 == r4) goto L99
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.channels.i.f
            if (r1 != r4) goto L40
            goto L99
        L40:
            kotlinx.coroutines.internal.s0 r4 = kotlinx.coroutines.channels.i.z()
            if (r1 != r4) goto L47
            goto L99
        L47:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "unexpected state: "
            r5.append(r6)
            r5.append(r1)
            java.lang.String r5 = r5.toString()
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L62:
            r3.u(r4)
            if (r0 == 0) goto L99
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.w()
            kotlin.jvm.functions.Function1<E, kotlin.n1> r4 = r4.b
            if (r4 == 0) goto L99
            kotlinx.coroutines.internal.j0.b(r4, r5, r6)
            return
        L73:
            if (r0 == 0) goto L7a
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.j()
            goto L7e
        L7a:
            kotlinx.coroutines.internal.s0 r2 = kotlinx.coroutines.channels.i.i()
        L7e:
            boolean r1 = r3.t(r4, r1, r2)
            if (r1 == 0) goto Le
            r3.u(r4)
            r1 = r0 ^ 1
            r3.z(r4, r1)
            if (r0 == 0) goto L99
            kotlinx.coroutines.channels.BufferedChannel r4 = r3.w()
            kotlin.jvm.functions.Function1<E, kotlin.n1> r4 = r4.b
            if (r4 == 0) goto L99
            kotlinx.coroutines.internal.j0.b(r4, r5, r6)
        L99:
            return
    }

    public final boolean t(int r2, @org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.Nullable java.lang.Object r4) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f
            int r2 = r2 * 2
            int r2 = r2 + 1
            boolean r2 = com.google.common.util.concurrent.b.a(r0, r2, r3, r4)
            return r2
    }

    public final void u(int r2) {
            r1 = this;
            r0 = 0
            r1.B(r2, r0)
            return
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object v(int r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f
            int r2 = r2 * 2
            int r2 = r2 + 1
            java.lang.Object r2 = r0.getAndSet(r2, r3)
            return r2
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.channels.BufferedChannel<E> w() {
            r1 = this;
            kotlinx.coroutines.channels.BufferedChannel<E> r0 = r1.e
            kotlin.jvm.internal.g0.m(r0)
            return r0
    }

    public final E x(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f
            int r2 = r2 * 2
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object y(int r2) {
            r1 = this;
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.f
            int r2 = r2 * 2
            int r2 = r2 + 1
            java.lang.Object r2 = r0.get(r2)
            return r2
    }

    public final void z(int r5, boolean r6) {
            r4 = this;
            if (r6 == 0) goto L12
            kotlinx.coroutines.channels.BufferedChannel r6 = r4.w()
            long r0 = r4.c
            int r2 = kotlinx.coroutines.channels.i.b
            long r2 = (long) r2
            long r0 = r0 * r2
            long r2 = (long) r5
            long r0 = r0 + r2
            r6.G1(r0)
        L12:
            r4.r()
            return
    }
}

package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nConflatedBufferedChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel\n+ 4 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannelKt\n+ 5 BufferedChannel.kt\nkotlinx/coroutines/channels/BufferedChannel$sendImpl$1\n*L\n1#1,119:1\n548#2,5:120\n514#2,6:125\n514#2,6:212\n548#2,5:218\n244#3:131\n269#3,10:132\n280#3,68:143\n3038#4:142\n269#5:211\n*S KotlinDebug\n*F\n+ 1 ConflatedBufferedChannel.kt\nkotlinx/coroutines/channels/ConflatedBufferedChannel\n*L\n41#1:120,5\n53#1:125,6\n106#1:212,6\n109#1:218,5\n80#1:131\n80#1:132,10\n80#1:143,68\n80#1:142\n80#1:211\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class u<E> extends kotlinx.coroutines.channels.BufferedChannel<E> {
    private final int m;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.BufferOverflow n;

    public u(int r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r2, @org.jetbrains.annotations.Nullable kotlin.jvm.functions.Function1<? super E, kotlin.n1> r3) {
            r0 = this;
            r0.<init>(r1, r3)
            r0.m = r1
            r0.n = r2
            kotlinx.coroutines.channels.BufferOverflow r3 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
            if (r2 == r3) goto L2f
            r2 = 1
            if (r1 < r2) goto Lf
            return
        Lf:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Buffered channel capacity must be at least 1, but "
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = " was specified"
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        L2f:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "This implementation does not support suspension for senders, use "
            r1.append(r2)
            java.lang.Class<kotlinx.coroutines.channels.BufferedChannel> r2 = kotlinx.coroutines.channels.BufferedChannel.class
            kotlin.reflect.d r2 = kotlin.jvm.internal.o0.d(r2)
            java.lang.String r2 = r2.D()
            r1.append(r2)
            java.lang.String r2 = " instead"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
    }

    public /* synthetic */ u(int r1, kotlinx.coroutines.channels.BufferOverflow r2, kotlin.jvm.functions.Function1 r3, int r4, kotlin.jvm.internal.v r5) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    static /* synthetic */ <E> java.lang.Object H1(kotlinx.coroutines.channels.u<E> r2, E r3, kotlin.coroutines.e<? super kotlin.n1> r4) {
            r4 = 1
            java.lang.Object r4 = r2.L1(r3, r4)
            boolean r0 = r4 instanceof kotlinx.coroutines.channels.n.a
            if (r0 == 0) goto L25
            kotlinx.coroutines.channels.n.f(r4)
            kotlin.jvm.functions.Function1<E, kotlin.n1> r4 = r2.b
            if (r4 == 0) goto L20
            r0 = 2
            r1 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r3 = kotlinx.coroutines.internal.j0.d(r4, r3, r1, r0, r1)
            if (r3 == 0) goto L20
            java.lang.Throwable r2 = r2.n0()
            kotlin.l.a(r3, r2)
            throw r3
        L20:
            java.lang.Throwable r2 = r2.n0()
            throw r2
        L25:
            kotlin.n1 r2 = kotlin.n1.a
            return r2
    }

    static /* synthetic */ <E> java.lang.Object I1(kotlinx.coroutines.channels.u<E> r0, E r1, kotlin.coroutines.e<? super java.lang.Boolean> r2) {
            r2 = 1
            java.lang.Object r0 = r0.L1(r1, r2)
            boolean r1 = r0 instanceof kotlinx.coroutines.channels.n.c
            if (r1 != 0) goto L10
            kotlin.n1 r0 = (kotlin.n1) r0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r2)
            return r0
        L10:
            r0 = 0
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.a.a(r0)
            return r0
    }

    private final java.lang.Object J1(E r3, boolean r4) {
            r2 = this;
            java.lang.Object r0 = super.r(r3)
            boolean r1 = kotlinx.coroutines.channels.n.m(r0)
            if (r1 != 0) goto L2a
            boolean r1 = kotlinx.coroutines.channels.n.k(r0)
            if (r1 == 0) goto L11
            goto L2a
        L11:
            if (r4 == 0) goto L21
            kotlin.jvm.functions.Function1<E, kotlin.n1> r4 = r2.b
            if (r4 == 0) goto L21
            r0 = 2
            r1 = 0
            kotlinx.coroutines.internal.UndeliveredElementException r3 = kotlinx.coroutines.internal.j0.d(r4, r3, r1, r0, r1)
            if (r3 != 0) goto L20
            goto L21
        L20:
            throw r3
        L21:
            kotlinx.coroutines.channels.n$b r3 = kotlinx.coroutines.channels.n.b
            kotlin.n1 r4 = kotlin.n1.a
            java.lang.Object r3 = r3.c(r4)
            return r3
        L2a:
            return r0
    }

    private final java.lang.Object K1(E r14) {
            r13 = this;
            kotlinx.coroutines.internal.s0 r6 = kotlinx.coroutines.channels.i.f
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = kotlinx.coroutines.channels.BufferedChannel.h()
            java.lang.Object r0 = r0.get(r13)
            kotlinx.coroutines.channels.o r0 = (kotlinx.coroutines.channels.o) r0
        Lc:
            java.util.concurrent.atomic.AtomicLongFieldUpdater r1 = kotlinx.coroutines.channels.BufferedChannel.j()
            long r1 = r1.getAndIncrement(r13)
            r3 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r3 = r3 & r1
            boolean r7 = kotlinx.coroutines.channels.BufferedChannel.k(r13, r1)
            int r8 = kotlinx.coroutines.channels.i.b
            long r1 = (long) r8
            long r1 = r3 / r1
            long r9 = (long) r8
            long r9 = r3 % r9
            int r5 = (int) r9
            long r9 = r0.c
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 == 0) goto L45
            kotlinx.coroutines.channels.o r1 = kotlinx.coroutines.channels.BufferedChannel.d(r13, r1, r0)
            if (r1 != 0) goto L40
            if (r7 == 0) goto Lc
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            java.lang.Throwable r0 = r13.n0()
            java.lang.Object r14 = r14.a(r0)
            return r14
        L40:
            r0 = r13
            r2 = r5
        L42:
            r4 = r3
            r3 = r14
            goto L49
        L45:
            r1 = r0
            r2 = r5
            r0 = r13
            goto L42
        L49:
            int r14 = kotlinx.coroutines.channels.BufferedChannel.K(r0, r1, r2, r3, r4, r6, r7)
            r12 = r1
            r1 = r0
            r0 = r12
            if (r14 == 0) goto Lbe
            r9 = 1
            if (r14 == r9) goto Lb5
            r9 = 2
            if (r14 == r9) goto L85
            r2 = 3
            if (r14 == r2) goto L7d
            r2 = 4
            if (r14 == r2) goto L67
            r2 = 5
            if (r14 == r2) goto L62
            goto L65
        L62:
            r0.b()
        L65:
            r14 = r3
            goto Lc
        L67:
            long r2 = r13.m0()
            int r14 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r14 >= 0) goto L72
            r0.b()
        L72:
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            java.lang.Throwable r0 = r13.n0()
            java.lang.Object r14 = r14.a(r0)
            return r14
        L7d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r0 = "unexpected"
            r14.<init>(r0)
            throw r14
        L85:
            if (r7 == 0) goto L95
            r0.r()
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            java.lang.Throwable r0 = r13.n0()
            java.lang.Object r14 = r14.a(r0)
            return r14
        L95:
            boolean r14 = r6 instanceof kotlinx.coroutines.r3
            if (r14 == 0) goto L9c
            kotlinx.coroutines.r3 r6 = (kotlinx.coroutines.r3) r6
            goto L9d
        L9c:
            r6 = 0
        L9d:
            if (r6 == 0) goto La2
            kotlinx.coroutines.channels.BufferedChannel.y(r13, r6, r0, r2)
        La2:
            long r3 = r0.c
            long r5 = (long) r8
            long r3 = r3 * r5
            long r5 = (long) r2
            long r3 = r3 + r5
            r13.Y(r3)
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            kotlin.n1 r0 = kotlin.n1.a
            java.lang.Object r14 = r14.c(r0)
            return r14
        Lb5:
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            kotlin.n1 r0 = kotlin.n1.a
            java.lang.Object r14 = r14.c(r0)
            return r14
        Lbe:
            r0.b()
            kotlinx.coroutines.channels.n$b r14 = kotlinx.coroutines.channels.n.b
            kotlin.n1 r0 = kotlin.n1.a
            java.lang.Object r14 = r14.c(r0)
            return r14
    }

    private final java.lang.Object L1(E r3, boolean r4) {
            r2 = this;
            kotlinx.coroutines.channels.BufferOverflow r0 = r2.n
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_LATEST
            if (r0 != r1) goto Lb
            java.lang.Object r3 = r2.J1(r3, r4)
            return r3
        Lb:
            java.lang.Object r3 = r2.K1(r3)
            return r3
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object T(E r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r0 = this;
            java.lang.Object r1 = H1(r0, r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected void g1(@org.jetbrains.annotations.NotNull kotlinx.coroutines.selects.m<?> r2, @org.jetbrains.annotations.Nullable java.lang.Object r3) {
            r1 = this;
            java.lang.Object r3 = r1.r(r3)
            boolean r0 = r3 instanceof kotlinx.coroutines.channels.n.c
            if (r0 != 0) goto L10
            kotlin.n1 r3 = (kotlin.n1) r3
            kotlin.n1 r3 = kotlin.n1.a
            r2.f(r3)
            return
        L10:
            boolean r0 = r3 instanceof kotlinx.coroutines.channels.n.a
            if (r0 == 0) goto L1f
            kotlinx.coroutines.channels.n.f(r3)
            kotlinx.coroutines.internal.s0 r3 = kotlinx.coroutines.channels.i.z()
            r2.f(r3)
            return
        L1f:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "unreachable"
            r2.<init>(r3)
            throw r2
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    @org.jetbrains.annotations.Nullable
    public java.lang.Object m1(E r1, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super java.lang.Boolean> r2) {
            r0 = this;
            java.lang.Object r1 = I1(r0, r1, r2)
            return r1
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel, kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.NotNull
    public java.lang.Object r(E r2) {
            r1 = this;
            r0 = 0
            java.lang.Object r2 = r1.L1(r2, r0)
            return r2
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    public boolean t1() {
            r1 = this;
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.channels.BufferedChannel
    protected boolean z0() {
            r2 = this;
            kotlinx.coroutines.channels.BufferOverflow r0 = r2.n
            kotlinx.coroutines.channels.BufferOverflow r1 = kotlinx.coroutines.channels.BufferOverflow.DROP_OLDEST
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}

package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class i {

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 A = null;
    private static final int B = 0;
    private static final int C = 1;
    private static final int D = 2;
    private static final int E = 3;
    private static final int F = 60;
    private static final long G = 1152921504606846975L;
    private static final long H = 4611686018427387904L;
    private static final long I = 4611686018427387903L;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.channels.o<java.lang.Object> a = null;

    @kotlin.jvm.JvmField
    public static final int b = 0;
    private static final int c = 0;
    private static final long d = 0;
    private static final long e = Long.MAX_VALUE;

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.s0 f = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 g = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 h = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 i = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 j = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 k = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 l = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 m = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 n = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 o = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 p = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 q = null;
    private static final int r = 0;
    private static final int s = 1;
    private static final int t = 2;
    private static final int u = 3;
    private static final int v = 4;
    private static final int w = 5;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 x = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 y = null;

    @org.jetbrains.annotations.NotNull
    private static final kotlinx.coroutines.internal.s0 z = null;

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* synthetic */ class a<E> extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function2<java.lang.Long, kotlinx.coroutines.channels.o<E>, kotlinx.coroutines.channels.o<E>> {
        public static final kotlinx.coroutines.channels.i.a a = null;

        static {
                kotlinx.coroutines.channels.i$a r0 = new kotlinx.coroutines.channels.i$a
                r0.<init>()
                kotlinx.coroutines.channels.i.a.a = r0
                return
        }

        a() {
                r6 = this;
                java.lang.String r4 = "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"
                r5 = 1
                r1 = 2
                java.lang.Class<kotlinx.coroutines.channels.i> r2 = kotlinx.coroutines.channels.i.class
                java.lang.String r3 = "createSegment"
                r0 = r6
                r0.<init>(r1, r2, r3, r4, r5)
                return
        }

        @org.jetbrains.annotations.NotNull
        public final kotlinx.coroutines.channels.o<E> c(long r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.o<E> r3) {
                r0 = this;
                kotlinx.coroutines.channels.o r1 = kotlinx.coroutines.channels.i.c(r1, r3)
                return r1
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Long r3, java.lang.Object r4) {
                r2 = this;
                java.lang.Number r3 = (java.lang.Number) r3
                long r0 = r3.longValue()
                kotlinx.coroutines.channels.o r4 = (kotlinx.coroutines.channels.o) r4
                kotlinx.coroutines.channels.o r3 = r2.c(r0, r4)
                return r3
        }
    }

    static {
            kotlinx.coroutines.channels.o r0 = new kotlinx.coroutines.channels.o
            r4 = 0
            r5 = 0
            r1 = -1
            r3 = 0
            r0.<init>(r1, r3, r4, r5)
            kotlinx.coroutines.channels.i.a = r0
            r5 = 12
            r6 = 0
            java.lang.String r1 = "kotlinx.coroutines.bufferedChannel.segmentSize"
            r2 = 32
            r3 = 0
            r4 = 0
            int r0 = kotlinx.coroutines.internal.v0.g(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.channels.i.b = r0
            java.lang.String r1 = "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"
            r2 = 10000(0x2710, float:1.4013E-41)
            int r0 = kotlinx.coroutines.internal.v0.g(r1, r2, r3, r4, r5, r6)
            kotlinx.coroutines.channels.i.c = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "BUFFERED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.f = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "SHOULD_BUFFER"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.g = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "S_RESUMING_BY_RCV"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.h = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "RESUMING_BY_EB"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.i = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "POISONED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.j = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "DONE_RCV"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.k = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "INTERRUPTED_SEND"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.l = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "INTERRUPTED_RCV"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.m = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "CHANNEL_CLOSED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.n = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "SUSPEND"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.o = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "SUSPEND_NO_WAITER"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.p = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "FAILED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.q = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "NO_RECEIVE_RESULT"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.x = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "CLOSE_HANDLER_CLOSED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.y = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "CLOSE_HANDLER_INVOKED"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.z = r0
            kotlinx.coroutines.internal.s0 r0 = new kotlinx.coroutines.internal.s0
            java.lang.String r1 = "NO_CLOSE_CAUSE"
            r0.<init>(r1)
            kotlinx.coroutines.channels.i.A = r0
            return
    }

    private static final long A(long r2) {
            r0 = 4611686018427387903(0x3fffffffffffffff, double:1.9999999999999998)
            long r2 = r2 & r0
            return r2
    }

    private static final boolean B(long r3) {
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            long r3 = r3 & r0
            r0 = 0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 == 0) goto Lb
            r3 = 1
            return r3
        Lb:
            r3 = 0
            return r3
    }

    private static final int C(long r1) {
            r0 = 60
            long r1 = r1 >> r0
            int r2 = (int) r1
            return r2
    }

    private static final long D(long r2) {
            r0 = 1152921504606846975(0xfffffffffffffff, double:1.2882297539194265E-231)
            long r2 = r2 & r0
            return r2
    }

    private static final long E(int r2) {
            if (r2 == 0) goto Lf
            r0 = 2147483647(0x7fffffff, float:NaN)
            if (r2 == r0) goto L9
            long r0 = (long) r2
            return r0
        L9:
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        Lf:
            r0 = 0
            return r0
    }

    private static final <T> boolean F(kotlinx.coroutines.p<? super T> r1, T r2, kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r3) {
            r0 = 0
            java.lang.Object r2 = r1.O(r2, r0, r3)
            if (r2 == 0) goto Lc
            r1.B(r2)
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    static /* synthetic */ boolean G(kotlinx.coroutines.p r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2, int r3, java.lang.Object r4) {
            r3 = r3 & 2
            if (r3 == 0) goto L5
            r2 = 0
        L5:
            boolean r0 = F(r0, r1, r2)
            return r0
    }

    public static final /* synthetic */ long a(long r0, boolean r2) {
            long r0 = v(r0, r2)
            return r0
    }

    public static final /* synthetic */ long b(long r0, int r2) {
            long r0 = w(r0, r2)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.o c(long r0, kotlinx.coroutines.channels.o r2) {
            kotlinx.coroutines.channels.o r0 = x(r0, r2)
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 d() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.y
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 e() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.z
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 f() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.k
            return r0
    }

    public static final /* synthetic */ int g() {
            int r0 = kotlinx.coroutines.channels.i.c
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 h() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.q
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 i() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.m
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 j() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.l
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 k() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.g
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 l() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.A
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 m() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.x
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.channels.o n() {
            kotlinx.coroutines.channels.o<java.lang.Object> r0 = kotlinx.coroutines.channels.i.a
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 o() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.j
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 p() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.i
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 q() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.h
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 r() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.o
            return r0
    }

    public static final /* synthetic */ kotlinx.coroutines.internal.s0 s() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.p
            return r0
    }

    public static final /* synthetic */ long t(int r2) {
            long r0 = E(r2)
            return r0
    }

    public static final /* synthetic */ boolean u(kotlinx.coroutines.p r0, java.lang.Object r1, kotlin.jvm.functions.Function1 r2) {
            boolean r0 = F(r0, r1, r2)
            return r0
    }

    private static final long v(long r2, boolean r4) {
            if (r4 == 0) goto L5
            r0 = 4611686018427387904(0x4000000000000000, double:2.0)
            goto L7
        L5:
            r0 = 0
        L7:
            long r0 = r0 + r2
            return r0
    }

    private static final long w(long r2, int r4) {
            long r0 = (long) r4
            r4 = 60
            long r0 = r0 << r4
            long r0 = r0 + r2
            return r0
    }

    private static final <E> kotlinx.coroutines.channels.o<E> x(long r6, kotlinx.coroutines.channels.o<E> r8) {
            kotlinx.coroutines.channels.o r0 = new kotlinx.coroutines.channels.o
            kotlinx.coroutines.channels.BufferedChannel r4 = r8.w()
            r5 = 0
            r1 = r6
            r3 = r8
            r0.<init>(r1, r3, r4, r5)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final <E> kotlin.reflect.i<kotlinx.coroutines.channels.o<E>> y() {
            kotlinx.coroutines.channels.i$a r0 = kotlinx.coroutines.channels.i.a.a
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.internal.s0 z() {
            kotlinx.coroutines.internal.s0 r0 = kotlinx.coroutines.channels.i.n
            return r0
    }
}

package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoop\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,543:1\n1#2:544\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class n1 extends kotlinx.coroutines.m0 {
    private long a;
    private boolean b;

    @org.jetbrains.annotations.Nullable
    private kotlin.collections.m<kotlinx.coroutines.d1<?>> c;

    public n1() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void B(kotlinx.coroutines.n1 r0, boolean r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Lb
            r2 = r2 & 1
            if (r2 == 0) goto L7
            r1 = 0
        L7:
            r0.z(r1)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: incrementUseCount"
            r0.<init>(r1)
            throw r0
    }

    public static /* synthetic */ void u(kotlinx.coroutines.n1 r0, boolean r1, int r2, java.lang.Object r3) {
            if (r3 != 0) goto Lb
            r2 = r2 & 1
            if (r2 == 0) goto L7
            r1 = 0
        L7:
            r0.t(r1)
            return
        Lb:
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: decrementUseCount"
            r0.<init>(r1)
            throw r0
    }

    private final long v(boolean r3) {
            r2 = this;
            if (r3 == 0) goto L8
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            return r0
        L8:
            r0 = 1
            return r0
    }

    protected boolean C() {
            r1 = this;
            boolean r0 = r1.I()
            return r0
    }

    public final boolean D() {
            r6 = this;
            long r0 = r6.a
            r2 = 1
            long r3 = r6.v(r2)
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 < 0) goto Lc
            return r2
        Lc:
            r0 = 0
            return r0
    }

    public final boolean I() {
            r1 = this;
            kotlin.collections.m<kotlinx.coroutines.d1<?>> r0 = r1.c
            if (r0 == 0) goto L9
            boolean r0 = r0.isEmpty()
            return r0
        L9:
            r0 = 1
            return r0
    }

    public long J() {
            r2 = this;
            boolean r0 = r2.N()
            if (r0 != 0) goto Lc
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public final boolean N() {
            r2 = this;
            kotlin.collections.m<kotlinx.coroutines.d1<?>> r0 = r2.c
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Object r0 = r0.v()
            kotlinx.coroutines.d1 r0 = (kotlinx.coroutines.d1) r0
            if (r0 != 0) goto Lf
            return r1
        Lf:
            r0.run()
            r0 = 1
            return r0
    }

    public boolean O() {
            r1 = this;
            r0 = 0
            return r0
    }

    public final boolean isActive() {
            r5 = this;
            long r0 = r5.a
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto La
            r0 = 1
            return r0
        La:
            r0 = 0
            return r0
    }

    @Override // kotlinx.coroutines.m0
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.m0 limitedParallelism(int r1) {
            r0 = this;
            kotlinx.coroutines.internal.t.a(r1)
            return r0
    }

    public void shutdown() {
            r0 = this;
            return
    }

    public final void t(boolean r5) {
            r4 = this;
            long r0 = r4.a
            long r2 = r4.v(r5)
            long r0 = r0 - r2
            r4.a = r0
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 <= 0) goto L10
            goto L17
        L10:
            boolean r5 = r4.b
            if (r5 == 0) goto L17
            r4.shutdown()
        L17:
            return
    }

    public final void w(@org.jetbrains.annotations.NotNull kotlinx.coroutines.d1<?> r2) {
            r1 = this;
            kotlin.collections.m<kotlinx.coroutines.d1<?>> r0 = r1.c
            if (r0 != 0) goto Lb
            kotlin.collections.m r0 = new kotlin.collections.m
            r0.<init>()
            r1.c = r0
        Lb:
            r0.addLast(r2)
            return
    }

    protected long x() {
            r3 = this;
            kotlin.collections.m<kotlinx.coroutines.d1<?>> r0 = r3.c
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            if (r0 != 0) goto La
            return r1
        La:
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L11
            return r1
        L11:
            r0 = 0
            return r0
    }

    public final void z(boolean r5) {
            r4 = this;
            long r0 = r4.a
            long r2 = r4.v(r5)
            long r0 = r0 + r2
            r4.a = r0
            if (r5 != 0) goto Le
            r5 = 1
            r4.b = r5
        Le:
            return
    }
}

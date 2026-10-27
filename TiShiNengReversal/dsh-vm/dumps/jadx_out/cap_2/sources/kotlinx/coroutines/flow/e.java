package kotlinx.coroutines.flow;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChannels.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Channels.kt\nkotlinx/coroutines/flow/ChannelAsFlow\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n1#2:177\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class e<T> extends kotlinx.coroutines.flow.internal.d<T> {

    @org.jetbrains.annotations.NotNull
    private static final java.util.concurrent.atomic.AtomicIntegerFieldUpdater f = null;

    @kotlin.jvm.Volatile
    private volatile int consumed;

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.b0<T> d;
    private final boolean e;

    static {
            java.lang.Class<kotlinx.coroutines.flow.e> r0 = kotlinx.coroutines.flow.e.class
            java.lang.String r1 = "consumed"
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = java.util.concurrent.atomic.AtomicIntegerFieldUpdater.newUpdater(r0, r1)
            kotlinx.coroutines.flow.e.f = r0
            return
    }

    public e(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.b0<? extends T> r1, boolean r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, int r4, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r5) {
            r0 = this;
            r0.<init>(r3, r4, r5)
            r0.d = r1
            r0.e = r2
            r1 = 0
            r0.consumed = r1
            return
    }

    public /* synthetic */ e(kotlinx.coroutines.channels.b0 r7, boolean r8, kotlin.coroutines.i r9, int r10, kotlinx.coroutines.channels.BufferOverflow r11, int r12, kotlin.jvm.internal.v r13) {
            r6 = this;
            r13 = r12 & 4
            if (r13 == 0) goto L6
            kotlin.coroutines.EmptyCoroutineContext r9 = kotlin.coroutines.EmptyCoroutineContext.INSTANCE
        L6:
            r3 = r9
            r9 = r12 & 8
            if (r9 == 0) goto Le
            r10 = -3
            r4 = -3
            goto Lf
        Le:
            r4 = r10
        Lf:
            r9 = r12 & 16
            if (r9 == 0) goto L15
            kotlinx.coroutines.channels.BufferOverflow r11 = kotlinx.coroutines.channels.BufferOverflow.SUSPEND
        L15:
            r0 = r6
            r1 = r7
            r2 = r8
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    private final void n() {
            r2 = this;
            boolean r0 = r2.e
            if (r0 == 0) goto L16
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = kotlinx.coroutines.flow.e.f
            r1 = 1
            int r0 = r0.getAndSet(r2, r1)
            if (r0 != 0) goto Le
            return
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "ReceiveChannel.consumeAsFlow can be collected just once"
            r0.<init>(r1)
            throw r0
        L16:
            return
    }

    @Override // kotlinx.coroutines.flow.internal.d, kotlinx.coroutines.flow.i
    @org.jetbrains.annotations.Nullable
    public java.lang.Object collect(@org.jetbrains.annotations.NotNull kotlinx.coroutines.flow.j<? super T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
            r2 = this;
            int r0 = r2.b
            r1 = -3
            if (r0 != r1) goto L1a
            r2.n()
            kotlinx.coroutines.channels.b0<T> r0 = r2.d
            boolean r1 = r2.e
            java.lang.Object r3 = kotlinx.coroutines.flow.l.a(r3, r0, r1, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r4) goto L17
            return r3
        L17:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
        L1a:
            java.lang.Object r3 = super.collect(r3, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r4) goto L25
            return r3
        L25:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    protected java.lang.String f() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "channel="
            r0.append(r1)
            kotlinx.coroutines.channels.b0<T> r1 = r2.d
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.Nullable
    protected java.lang.Object h(@org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.z<? super T> r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r4) {
            r2 = this;
            kotlinx.coroutines.flow.internal.u r0 = new kotlinx.coroutines.flow.internal.u
            r0.<init>(r3)
            kotlinx.coroutines.channels.b0<T> r3 = r2.d
            boolean r1 = r2.e
            java.lang.Object r3 = kotlinx.coroutines.flow.l.a(r0, r3, r1, r4)
            java.lang.Object r4 = kotlin.coroutines.intrinsics.a.l()
            if (r3 != r4) goto L14
            return r3
        L14:
            kotlin.n1 r3 = kotlin.n1.a
            return r3
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    protected kotlinx.coroutines.flow.internal.d<T> i(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r7, int r8, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.BufferOverflow r9) {
            r6 = this;
            kotlinx.coroutines.flow.e r0 = new kotlinx.coroutines.flow.e
            kotlinx.coroutines.channels.b0<T> r1 = r6.d
            boolean r2 = r6.e
            r3 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.flow.i<T> j() {
            r8 = this;
            kotlinx.coroutines.flow.e r0 = new kotlinx.coroutines.flow.e
            kotlinx.coroutines.channels.b0<T> r1 = r8.d
            boolean r2 = r8.e
            r6 = 28
            r7 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return r0
    }

    @Override // kotlinx.coroutines.flow.internal.d
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.b0<T> m(@org.jetbrains.annotations.NotNull kotlinx.coroutines.r0 r3) {
            r2 = this;
            r2.n()
            int r0 = r2.b
            r1 = -3
            if (r0 != r1) goto Lb
            kotlinx.coroutines.channels.b0<T> r3 = r2.d
            return r3
        Lb:
            kotlinx.coroutines.channels.b0 r3 = super.m(r3)
            return r3
    }
}

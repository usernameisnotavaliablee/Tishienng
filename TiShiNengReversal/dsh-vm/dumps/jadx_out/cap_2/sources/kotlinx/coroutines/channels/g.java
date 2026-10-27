package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nBroadcast.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,202:1\n706#2,2:203\n706#2,2:205\n*S KotlinDebug\n*F\n+ 1 Broadcast.kt\nkotlinx/coroutines/channels/BroadcastCoroutine\n*L\n152#1:203,2\n157#1:205,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class g<E> extends kotlinx.coroutines.a<kotlin.n1> implements kotlinx.coroutines.channels.z<E>, kotlinx.coroutines.channels.d<E> {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.d<E> d;

    public g(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.d<E> r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r4)
            r1.d = r3
            kotlinx.coroutines.e2$b r3 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r2 = r2.get(r3)
            kotlinx.coroutines.e2 r2 = (kotlinx.coroutines.e2) r2
            r1.K0(r2)
            return
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.channels.d<E> A1() {
            r1 = this;
            kotlinx.coroutines.channels.d<E> r0 = r1.d
            return r0
    }

    protected void B1(@org.jetbrains.annotations.NotNull kotlin.n1 r3) {
            r2 = this;
            kotlinx.coroutines.channels.d<E> r3 = r2.d
            r0 = 0
            r1 = 1
            kotlinx.coroutines.channels.c0.a.a(r3, r0, r1, r0)
            return
    }

    @Override // kotlinx.coroutines.channels.c0
    public boolean S(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.channels.d<E> r0 = r1.d
            boolean r2 = r0.S(r2)
            r1.start()
            return r2
    }

    @Override // kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object T(E r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            kotlinx.coroutines.channels.d<E> r0 = r1.d
            java.lang.Object r2 = r0.T(r2, r3)
            return r2
    }

    @Override // kotlinx.coroutines.l2, kotlinx.coroutines.e2, kotlinx.coroutines.channels.d
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean a(java.lang.Throwable r3) {
            r2 = this;
            if (r3 != 0) goto Lc
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r0 = kotlinx.coroutines.l2.W(r2)
            r1 = 0
            r3.<init>(r0, r1, r2)
        Lc:
            r2.j0(r3)
            r3 = 1
            return r3
    }

    @Override // kotlinx.coroutines.l2, kotlinx.coroutines.e2, kotlinx.coroutines.channels.d
    public final void b(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r3) {
            r2 = this;
            if (r3 != 0) goto Lc
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r0 = kotlinx.coroutines.l2.W(r2)
            r1 = 0
            r3.<init>(r0, r1, r2)
        Lc:
            r2.j0(r3)
            return
    }

    @Override // kotlinx.coroutines.channels.z
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.c0<E> getChannel() {
            r0 = this;
            return r0
    }

    @Override // kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.i<E, kotlinx.coroutines.channels.c0<E>> i() {
            r1 = this;
            kotlinx.coroutines.channels.d<E> r0 = r1.d
            kotlinx.coroutines.selects.i r0 = r0.i()
            return r0
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.l2, kotlinx.coroutines.e2
    public boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // kotlinx.coroutines.l2
    public void j0(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            java.util.concurrent.CancellationException r3 = kotlinx.coroutines.l2.o1(r2, r3, r0, r1, r0)
            kotlinx.coroutines.channels.d<E> r0 = r2.d
            r0.b(r3)
            r2.h0(r3)
            return
    }

    @Override // kotlinx.coroutines.channels.d
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.b0<E> m() {
            r1 = this;
            kotlinx.coroutines.channels.d<E> r0 = r1.d
            kotlinx.coroutines.channels.b0 r0 = r0.m()
            return r0
    }

    @Override // kotlinx.coroutines.channels.c0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.d<E> r0 = r1.d
            boolean r2 = r0.offer(r2)
            return r2
    }

    @Override // kotlinx.coroutines.channels.c0
    public void q(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r2) {
            r1 = this;
            kotlinx.coroutines.channels.d<E> r0 = r1.d
            r0.q(r2)
            return
    }

    @Override // kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.NotNull
    public java.lang.Object r(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.d<E> r0 = r1.d
            java.lang.Object r2 = r0.r(r2)
            return r2
    }

    @Override // kotlinx.coroutines.a
    protected void x1(@org.jetbrains.annotations.NotNull java.lang.Throwable r2, boolean r3) {
            r1 = this;
            kotlinx.coroutines.channels.d<E> r0 = r1.d
            boolean r0 = r0.S(r2)
            if (r0 != 0) goto L11
            if (r3 != 0) goto L11
            kotlin.coroutines.i r3 = r1.getContext()
            kotlinx.coroutines.o0.b(r3, r2)
        L11:
            return
    }

    @Override // kotlinx.coroutines.a
    public /* bridge */ /* synthetic */ void y1(kotlin.n1 r1) {
            r0 = this;
            kotlin.n1 r1 = (kotlin.n1) r1
            r0.B1(r1)
            return
    }

    @Override // kotlinx.coroutines.channels.c0
    public boolean z() {
            r1 = this;
            kotlinx.coroutines.channels.d<E> r0 = r1.d
            boolean r0 = r0.z()
            return r0
    }
}

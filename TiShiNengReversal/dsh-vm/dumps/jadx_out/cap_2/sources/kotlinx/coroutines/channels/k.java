package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nChannelCoroutine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n+ 2 JobSupport.kt\nkotlinx/coroutines/JobSupport\n*L\n1#1,41:1\n706#2,2:42\n706#2,2:44\n706#2,2:46\n*S KotlinDebug\n*F\n+ 1 ChannelCoroutine.kt\nkotlinx/coroutines/channels/ChannelCoroutine\n*L\n21#1:42,2\n26#1:44,2\n32#1:46,2\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class k<E> extends kotlinx.coroutines.a<kotlin.n1> implements kotlinx.coroutines.channels.j<E> {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.j<E> d;

    public k(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r1, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.j<E> r2, boolean r3, boolean r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            r0.d = r2
            return
    }

    @org.jetbrains.annotations.NotNull
    protected final kotlinx.coroutines.channels.j<E> A1() {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            return r0
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean D() {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            boolean r0 = r0.D()
            return r0
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.g<E> N() {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            kotlinx.coroutines.selects.g r0 = r0.N()
            return r0
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object R(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super E> r2) {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            java.lang.Object r2 = r0.R(r2)
            return r2
    }

    @Override // kotlinx.coroutines.channels.c0
    public boolean S(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            boolean r2 = r0.S(r2)
            return r2
    }

    @Override // kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object T(E r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            java.lang.Object r2 = r0.T(r2, r3)
            return r2
    }

    @Override // kotlinx.coroutines.l2, kotlinx.coroutines.e2, kotlinx.coroutines.channels.d
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public final /* synthetic */ boolean a(java.lang.Throwable r3) {
            r2 = this;
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r0 = kotlinx.coroutines.l2.W(r2)
            r1 = 0
            r3.<init>(r0, r1, r2)
            r2.j0(r3)
            r3 = 1
            return r3
    }

    @Override // kotlinx.coroutines.l2, kotlinx.coroutines.e2, kotlinx.coroutines.channels.d
    public final void b(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r3) {
            r2 = this;
            boolean r0 = r2.isCancelled()
            if (r0 == 0) goto L7
            return
        L7:
            if (r3 != 0) goto L13
            kotlinx.coroutines.JobCancellationException r3 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r0 = kotlinx.coroutines.l2.W(r2)
            r1 = 0
            r3.<init>(r0, r1, r2)
        L13:
            r2.j0(r3)
            return
    }

    @Override // kotlinx.coroutines.l2, kotlinx.coroutines.e2, kotlinx.coroutines.channels.b0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Since 1.2.0, binary compatibility with versions <= 1.1.x")
    public /* synthetic */ void cancel() {
            r3 = this;
            kotlinx.coroutines.JobCancellationException r0 = new kotlinx.coroutines.JobCancellationException
            java.lang.String r1 = kotlinx.coroutines.l2.W(r3)
            r2 = 0
            r0.<init>(r1, r2, r3)
            r3.j0(r0)
            return
    }

    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.channels.j<E> getChannel() {
            r0 = this;
            return r0
    }

    @Override // kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.i<E, kotlinx.coroutines.channels.c0<E>> i() {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            kotlinx.coroutines.selects.i r0 = r0.i()
            return r0
    }

    @Override // kotlinx.coroutines.channels.b0
    public boolean isEmpty() {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            boolean r0 = r0.isEmpty()
            return r0
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.l<E> iterator() {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            kotlinx.coroutines.channels.l r0 = r0.iterator()
            return r0
    }

    @Override // kotlinx.coroutines.l2
    public void j0(@org.jetbrains.annotations.NotNull java.lang.Throwable r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            java.util.concurrent.CancellationException r3 = kotlinx.coroutines.l2.o1(r2, r3, r0, r1, r0)
            kotlinx.coroutines.channels.j<E> r0 = r2.d
            r0.b(r3)
            r2.h0(r3)
            return
    }

    @Override // kotlinx.coroutines.channels.c0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            boolean r2 = r0.offer(r2)
            return r2
    }

    @Override // kotlinx.coroutines.channels.b0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'tryReceive'. Please note that the provided replacement does not rethrow channel's close cause as 'poll' did, for the precise replacement please refer to the 'poll' documentation", replaceWith = @kotlin.ReplaceWith(expression = "tryReceive().getOrNull()", imports = {}))
    @org.jetbrains.annotations.Nullable
    public E poll() {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            java.lang.Object r0 = r0.poll()
            return r0
    }

    @Override // kotlinx.coroutines.channels.c0
    public void q(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r2) {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            r0.q(r2)
            return
    }

    @Override // kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.NotNull
    public java.lang.Object r(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            java.lang.Object r2 = r0.r(r2)
            return r2
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.g<kotlinx.coroutines.channels.n<E>> t() {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            kotlinx.coroutines.selects.g r0 = r0.t()
            return r0
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.g<E> u() {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            kotlinx.coroutines.selects.g r0 = r0.u()
            return r0
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.NotNull
    public java.lang.Object v() {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            java.lang.Object r0 = r0.v()
            return r0
    }

    @Override // kotlinx.coroutines.channels.b0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in favor of 'receiveCatching'. Please note that the provided replacement does not rethrow channel's close cause as 'receiveOrNull' did, for the detailed replacement please refer to the 'receiveOrNull' documentation", replaceWith = @kotlin.ReplaceWith(expression = "receiveCatching().getOrNull()", imports = {}))
    @kotlin.internal.LowPriorityInOverloadResolution
    @org.jetbrains.annotations.Nullable
    public java.lang.Object w(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super E> r2) {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            java.lang.Object r2 = r0.w(r2)
            return r2
    }

    @Override // kotlinx.coroutines.channels.b0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object x(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlinx.coroutines.channels.n<? extends E>> r2) {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            java.lang.Object r2 = r0.x(r2)
            kotlin.coroutines.intrinsics.a.l()
            return r2
    }

    @Override // kotlinx.coroutines.channels.c0
    public boolean z() {
            r1 = this;
            kotlinx.coroutines.channels.j<E> r0 = r1.d
            boolean r0 = r0.z()
            return r0
    }
}

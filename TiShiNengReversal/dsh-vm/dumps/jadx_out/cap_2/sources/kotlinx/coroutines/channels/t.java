package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "ConflatedBroadcastChannel is deprecated in the favour of SharedFlow and is no longer supported")
@kotlinx.coroutines.ObsoleteCoroutinesApi
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class t<E> implements kotlinx.coroutines.channels.d<E> {

    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.channels.e<E> a;

    public t() {
            r2 = this;
            kotlinx.coroutines.channels.e r0 = new kotlinx.coroutines.channels.e
            r1 = -1
            r0.<init>(r1)
            r2.<init>(r0)
            return
    }

    public t(E r1) {
            r0 = this;
            r0.<init>()
            r0.r(r1)
            return
    }

    private t(kotlinx.coroutines.channels.e<E> r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // kotlinx.coroutines.channels.c0
    public boolean S(@org.jetbrains.annotations.Nullable java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.channels.e<E> r0 = r1.a
            boolean r2 = r0.S(r2)
            return r2
    }

    @Override // kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.Nullable
    public java.lang.Object T(E r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r3) {
            r1 = this;
            kotlinx.coroutines.channels.e<E> r0 = r1.a
            java.lang.Object r2 = r0.T(r2, r3)
            return r2
    }

    @Override // kotlinx.coroutines.channels.d
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Binary compatibility only")
    public /* synthetic */ boolean a(java.lang.Throwable r2) {
            r1 = this;
            kotlinx.coroutines.channels.e<E> r0 = r1.a
            boolean r2 = r0.a(r2)
            return r2
    }

    @Override // kotlinx.coroutines.channels.d
    public void b(@org.jetbrains.annotations.Nullable java.util.concurrent.CancellationException r2) {
            r1 = this;
            kotlinx.coroutines.channels.e<E> r0 = r1.a
            r0.b(r2)
            return
    }

    public final E c() {
            r1 = this;
            kotlinx.coroutines.channels.e<E> r0 = r1.a
            java.lang.Object r0 = r0.L1()
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public final E d() {
            r1 = this;
            kotlinx.coroutines.channels.e<E> r0 = r1.a
            java.lang.Object r0 = r0.N1()
            return r0
    }

    @Override // kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.selects.i<E, kotlinx.coroutines.channels.c0<E>> i() {
            r1 = this;
            kotlinx.coroutines.channels.e<E> r0 = r1.a
            kotlinx.coroutines.selects.i r0 = r0.i()
            return r0
    }

    @Override // kotlinx.coroutines.channels.d
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.channels.b0<E> m() {
            r1 = this;
            kotlinx.coroutines.channels.e<E> r0 = r1.a
            kotlinx.coroutines.channels.b0 r0 = r0.m()
            return r0
    }

    @Override // kotlinx.coroutines.channels.c0
    @kotlin.Deprecated(level = kotlin.DeprecationLevel.ERROR, message = "Deprecated in the favour of 'trySend' method", replaceWith = @kotlin.ReplaceWith(expression = "trySend(element).isSuccess", imports = {}))
    public boolean offer(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.e<E> r0 = r1.a
            boolean r2 = r0.offer(r2)
            return r2
    }

    @Override // kotlinx.coroutines.channels.c0
    public void q(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Throwable, kotlin.n1> r2) {
            r1 = this;
            kotlinx.coroutines.channels.e<E> r0 = r1.a
            r0.q(r2)
            return
    }

    @Override // kotlinx.coroutines.channels.c0
    @org.jetbrains.annotations.NotNull
    public java.lang.Object r(E r2) {
            r1 = this;
            kotlinx.coroutines.channels.e<E> r0 = r1.a
            java.lang.Object r2 = r0.r(r2)
            return r2
    }

    @Override // kotlinx.coroutines.channels.c0
    public boolean z() {
            r1 = this;
            kotlinx.coroutines.channels.e<E> r0 = r1.a
            boolean r0 = r0.z()
            return r0
    }
}

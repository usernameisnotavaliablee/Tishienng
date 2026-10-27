package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class y<E> extends kotlinx.coroutines.channels.k<E> implements kotlinx.coroutines.channels.z<E> {
    public y(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.j<E> r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0, r0)
            return
    }

    protected void B1(@org.jetbrains.annotations.NotNull kotlin.n1 r3) {
            r2 = this;
            kotlinx.coroutines.channels.j r3 = r2.A1()
            r0 = 0
            r1 = 1
            kotlinx.coroutines.channels.c0.a.a(r3, r0, r1, r0)
            return
    }

    @Override // kotlinx.coroutines.channels.z
    public /* bridge */ /* synthetic */ kotlinx.coroutines.channels.c0 getChannel() {
            r1 = this;
            kotlinx.coroutines.channels.j r0 = r1.getChannel()
            return r0
    }

    @Override // kotlinx.coroutines.a, kotlinx.coroutines.l2, kotlinx.coroutines.e2
    public boolean isActive() {
            r1 = this;
            boolean r0 = super.isActive()
            return r0
    }

    @Override // kotlinx.coroutines.a
    protected void x1(@org.jetbrains.annotations.NotNull java.lang.Throwable r2, boolean r3) {
            r1 = this;
            kotlinx.coroutines.channels.j r0 = r1.A1()
            boolean r0 = r0.S(r2)
            if (r0 != 0) goto L13
            if (r3 != 0) goto L13
            kotlin.coroutines.i r3 = r1.getContext()
            kotlinx.coroutines.o0.b(r3, r2)
        L13:
            return
    }

    @Override // kotlinx.coroutines.a
    public /* bridge */ /* synthetic */ void y1(kotlin.n1 r1) {
            r0 = this;
            kotlin.n1 r1 = (kotlin.n1) r1
            r0.B1(r1)
            return
    }
}

package kotlinx.coroutines.channels;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
class a<E> extends kotlinx.coroutines.channels.k<E> implements kotlinx.coroutines.channels.c<E> {
    public a(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.channels.j<E> r3, boolean r4) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0, r4)
            kotlinx.coroutines.e2$b r3 = kotlinx.coroutines.e2.s0
            kotlin.coroutines.i$b r2 = r2.get(r3)
            kotlinx.coroutines.e2 r2 = (kotlinx.coroutines.e2) r2
            r1.K0(r2)
            return
    }

    @Override // kotlinx.coroutines.l2
    protected boolean I0(@org.jetbrains.annotations.NotNull java.lang.Throwable r2) {
            r1 = this;
            kotlin.coroutines.i r0 = r1.getContext()
            kotlinx.coroutines.o0.b(r0, r2)
            r2 = 1
            return r2
    }

    @Override // kotlinx.coroutines.l2
    protected void d1(@org.jetbrains.annotations.Nullable java.lang.Throwable r4) {
            r3 = this;
            kotlinx.coroutines.channels.j r0 = r3.A1()
            r1 = 0
            if (r4 == 0) goto L2a
            boolean r2 = r4 instanceof java.util.concurrent.CancellationException
            if (r2 == 0) goto Le
            r1 = r4
            java.util.concurrent.CancellationException r1 = (java.util.concurrent.CancellationException) r1
        Le:
            if (r1 != 0) goto L2a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = kotlinx.coroutines.u0.a(r3)
            r1.append(r2)
            java.lang.String r2 = " was cancelled"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.util.concurrent.CancellationException r4 = kotlinx.coroutines.s1.a(r1, r4)
            r1 = r4
        L2a:
            r0.b(r1)
            return
    }
}

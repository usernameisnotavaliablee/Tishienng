package kotlinx.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class p1 extends kotlinx.coroutines.n1 {
    public p1() {
            r0 = this;
            r0.<init>()
            return
    }

    @org.jetbrains.annotations.NotNull
    protected abstract java.lang.Thread P();

    protected void Q(long r2, @org.jetbrains.annotations.NotNull kotlinx.coroutines.o1.c r4) {
            r1 = this;
            kotlinx.coroutines.v0 r0 = kotlinx.coroutines.v0.g
            r0.b0(r2, r4)
            return
    }

    protected final void R() {
            r2 = this;
            java.lang.Thread r0 = r2.P()
            java.lang.Thread r1 = java.lang.Thread.currentThread()
            if (r1 == r0) goto L1c
            kotlinx.coroutines.b r1 = kotlinx.coroutines.c.b()
            if (r1 == 0) goto L16
            r1.g(r0)
            kotlin.n1 r1 = kotlin.n1.a
            goto L17
        L16:
            r1 = 0
        L17:
            if (r1 != 0) goto L1c
            java.util.concurrent.locks.LockSupport.unpark(r0)
        L1c:
            return
    }
}

package kotlinx.coroutines.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
final class o extends kotlinx.coroutines.m0 {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.scheduling.o a = null;

    static {
            kotlinx.coroutines.scheduling.o r0 = new kotlinx.coroutines.scheduling.o
            r0.<init>()
            kotlinx.coroutines.scheduling.o.a = r0
            return
    }

    private o() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // kotlinx.coroutines.m0
    public void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, @org.jetbrains.annotations.NotNull java.lang.Runnable r4) {
            r2 = this;
            kotlinx.coroutines.scheduling.c r3 = kotlinx.coroutines.scheduling.c.g
            kotlinx.coroutines.scheduling.k r0 = kotlinx.coroutines.scheduling.n.j
            r1 = 0
            r3.v(r4, r0, r1)
            return
    }

    @Override // kotlinx.coroutines.m0
    @kotlinx.coroutines.InternalCoroutinesApi
    public void dispatchYield(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r3, @org.jetbrains.annotations.NotNull java.lang.Runnable r4) {
            r2 = this;
            kotlinx.coroutines.scheduling.c r3 = kotlinx.coroutines.scheduling.c.g
            kotlinx.coroutines.scheduling.k r0 = kotlinx.coroutines.scheduling.n.j
            r1 = 1
            r3.v(r4, r0, r1)
            return
    }

    @Override // kotlinx.coroutines.m0
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.m0 limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.internal.t.a(r2)
            int r0 = kotlinx.coroutines.scheduling.n.d
            if (r2 < r0) goto L8
            return r1
        L8:
            kotlinx.coroutines.m0 r2 = super.limitedParallelism(r2)
            return r2
    }
}

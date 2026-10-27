package kotlinx.coroutines.scheduling;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class c extends kotlinx.coroutines.scheduling.h {

    @org.jetbrains.annotations.NotNull
    public static final kotlinx.coroutines.scheduling.c g = null;

    static {
            kotlinx.coroutines.scheduling.c r0 = new kotlinx.coroutines.scheduling.c
            r0.<init>()
            kotlinx.coroutines.scheduling.c.g = r0
            return
    }

    private c() {
            r6 = this;
            int r1 = kotlinx.coroutines.scheduling.n.c
            int r2 = kotlinx.coroutines.scheduling.n.d
            long r3 = kotlinx.coroutines.scheduling.n.e
            java.lang.String r5 = kotlinx.coroutines.scheduling.n.a
            r0 = r6
            r0.<init>(r1, r2, r3, r5)
            return
    }

    public final void B() {
            r0 = this;
            super.close()
            return
    }

    @Override // kotlinx.coroutines.scheduling.h, kotlinx.coroutines.t1, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r2 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Dispatchers.Default cannot be closed"
            r0.<init>(r1)
            throw r0
    }

    @Override // kotlinx.coroutines.m0
    @kotlinx.coroutines.ExperimentalCoroutinesApi
    @org.jetbrains.annotations.NotNull
    public kotlinx.coroutines.m0 limitedParallelism(int r2) {
            r1 = this;
            kotlinx.coroutines.internal.t.a(r2)
            int r0 = kotlinx.coroutines.scheduling.n.c
            if (r2 < r0) goto L8
            return r1
        L8:
            kotlinx.coroutines.m0 r2 = super.limitedParallelism(r2)
            return r2
    }

    @Override // kotlinx.coroutines.m0
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = "Dispatchers.Default"
            return r0
    }
}

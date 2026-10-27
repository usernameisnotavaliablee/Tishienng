package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CloseableCoroutineScope implements java.io.Closeable, kotlinx.coroutines.r0 {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.i coroutineContext;

    public CloseableCoroutineScope(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            r1.<init>()
            r1.coroutineContext = r2
            return
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r3 = this;
            kotlin.coroutines.i r0 = r3.getCoroutineContext()
            r1 = 0
            r2 = 1
            kotlinx.coroutines.h2.i(r0, r1, r2, r1)
            return
    }

    @org.jetbrains.annotations.NotNull
    public kotlin.coroutines.i getCoroutineContext() {
            r1 = this;
            kotlin.coroutines.i r0 = r1.coroutineContext
            return r0
    }
}

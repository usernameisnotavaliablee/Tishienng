package androidx.lifecycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PausingDispatcher extends kotlinx.coroutines.m0 {

    @kotlin.jvm.JvmField
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.DispatchQueue dispatchQueue;

    public PausingDispatcher() {
            r1 = this;
            r1.<init>()
            androidx.lifecycle.DispatchQueue r0 = new androidx.lifecycle.DispatchQueue
            r0.<init>()
            r1.dispatchQueue = r0
            return
    }

    public void dispatch(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2, @org.jetbrains.annotations.NotNull java.lang.Runnable r3) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r3, r0)
            androidx.lifecycle.DispatchQueue r0 = r1.dispatchQueue
            r0.dispatchAndEnqueue(r2, r3)
            return
    }

    public boolean isDispatchNeeded(@org.jetbrains.annotations.NotNull kotlin.coroutines.i r2) {
            r1 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.g0.p(r2, r0)
            kotlinx.coroutines.p2 r0 = kotlinx.coroutines.g1.e()
            kotlinx.coroutines.p2 r0 = r0.t()
            boolean r2 = r0.isDispatchNeeded(r2)
            r0 = 1
            if (r2 == 0) goto L15
            return r0
        L15:
            androidx.lifecycle.DispatchQueue r2 = r1.dispatchQueue
            boolean r2 = r2.canRun()
            r2 = r2 ^ r0
            return r2
    }
}

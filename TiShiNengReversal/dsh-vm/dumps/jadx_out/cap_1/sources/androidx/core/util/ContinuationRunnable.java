package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ContinuationRunnable extends java.util.concurrent.atomic.AtomicBoolean implements java.lang.Runnable {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.e<kotlin.n1> continuation;

    public ContinuationRunnable(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super kotlin.n1> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.continuation = r2
            return
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L15
            kotlin.coroutines.e<kotlin.n1> r0 = r2.continuation
            kotlin.Result$a r1 = kotlin.Result.Companion
            kotlin.n1 r1 = kotlin.n1.a
            java.lang.Object r1 = kotlin.Result.constructor-impl(r1)
            r0.resumeWith(r1)
        L15:
            return
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ContinuationRunnable(ran = "
            r0.append(r1)
            boolean r1 = r2.get()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

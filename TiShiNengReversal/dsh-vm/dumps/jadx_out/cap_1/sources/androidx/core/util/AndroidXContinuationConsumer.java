package androidx.core.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class AndroidXContinuationConsumer<T> extends java.util.concurrent.atomic.AtomicBoolean implements androidx.core.util.Consumer<T> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.e<T> continuation;

    public AndroidXContinuationConsumer(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super T> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.continuation = r2
            return
    }

    @Override // androidx.core.util.Consumer
    public void accept(T r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L13
            kotlin.coroutines.e<T> r0 = r2.continuation
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.Result.constructor-impl(r3)
            r0.resumeWith(r3)
        L13:
            return
    }

    @Override // java.util.concurrent.atomic.AtomicBoolean
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ContinuationConsumer(resultAccepted = "
            r0.append(r1)
            boolean r1 = r2.get()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

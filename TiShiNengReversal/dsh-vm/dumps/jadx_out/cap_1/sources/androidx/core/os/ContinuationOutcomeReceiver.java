package androidx.core.os;

import java.lang.Throwable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(31)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
final class ContinuationOutcomeReceiver<R, E extends java.lang.Throwable> extends java.util.concurrent.atomic.AtomicBoolean implements android.os.OutcomeReceiver<R, E> {

    @org.jetbrains.annotations.NotNull
    private final kotlin.coroutines.e<R> continuation;

    public ContinuationOutcomeReceiver(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            r1.continuation = r2
            return
    }

    @Override // android.os.OutcomeReceiver
    public void onError(@org.jetbrains.annotations.NotNull E r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L17
            kotlin.coroutines.e<R> r0 = r2.continuation
            kotlin.Result$a r1 = kotlin.Result.Companion
            java.lang.Object r3 = kotlin.g0.a(r3)
            java.lang.Object r3 = kotlin.Result.constructor-impl(r3)
            r0.resumeWith(r3)
        L17:
            return
    }

    @Override // android.os.OutcomeReceiver
    public void onResult(R r3) {
            r2 = this;
            r0 = 0
            r1 = 1
            boolean r0 = r2.compareAndSet(r0, r1)
            if (r0 == 0) goto L13
            kotlin.coroutines.e<R> r0 = r2.continuation
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
            java.lang.String r1 = "ContinuationOutcomeReceiver(outcomeReceived = "
            r0.append(r1)
            boolean r1 = r2.get()
            r0.append(r1)
            r1 = 41
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

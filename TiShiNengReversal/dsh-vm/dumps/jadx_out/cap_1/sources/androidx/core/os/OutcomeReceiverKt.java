package androidx.core.os;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(31)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class OutcomeReceiverKt {
    @androidx.annotation.RequiresApi(31)
    @org.jetbrains.annotations.NotNull
    public static final <R, E extends java.lang.Throwable> android.os.OutcomeReceiver<R, E> asOutcomeReceiver(@org.jetbrains.annotations.NotNull kotlin.coroutines.e<? super R> r1) {
            androidx.core.os.ContinuationOutcomeReceiver r0 = new androidx.core.os.ContinuationOutcomeReceiver
            r0.<init>(r1)
            android.os.OutcomeReceiver r1 = androidx.core.os.i.a(r0)
            return r1
    }
}

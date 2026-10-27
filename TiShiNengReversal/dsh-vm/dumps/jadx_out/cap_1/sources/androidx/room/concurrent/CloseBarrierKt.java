package androidx.room.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CloseBarrierKt {
    public static final void ifNotClosed(@org.jetbrains.annotations.NotNull androidx.room.concurrent.CloseBarrier r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function0<kotlin.n1> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = r1.block$room_runtime_release()
            if (r0 != 0) goto L11
            return
        L11:
            r0 = 1
            r2.invoke()     // Catch: java.lang.Throwable -> L1f
            kotlin.jvm.internal.d0.d(r0)
            r1.unblock$room_runtime_release()
            kotlin.jvm.internal.d0.c(r0)
            return
        L1f:
            r2 = move-exception
            kotlin.jvm.internal.d0.d(r0)
            r1.unblock$room_runtime_release()
            kotlin.jvm.internal.d0.c(r0)
            throw r2
    }
}

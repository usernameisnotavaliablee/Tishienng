package androidx.room.concurrent;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class AtomicsKt {
    @org.jetbrains.annotations.NotNull
    public static final java.lang.Void loop(@org.jetbrains.annotations.NotNull java.util.concurrent.atomic.AtomicInteger r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.n1> r2) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            java.lang.String r0 = "action"
            kotlin.jvm.internal.g0.p(r2, r0)
        La:
            int r0 = r1.get()
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r2.invoke(r0)
            goto La
    }
}

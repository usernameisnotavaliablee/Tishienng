package androidx.room.coroutines;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class RunBlockingUninterruptible_androidKt {
    public static final <T> T runBlockingUninterruptible(@org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function2<? super kotlinx.coroutines.r0, ? super kotlin.coroutines.e<? super T>, ? extends java.lang.Object> r2) {
            java.lang.String r0 = "block"
            kotlin.jvm.internal.g0.p(r2, r0)
            java.lang.Thread.interrupted()
            androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1 r0 = new androidx.room.coroutines.RunBlockingUninterruptible_androidKt$runBlockingUninterruptible$1
            r1 = 0
            r0.<init>(r2, r1)
            r2 = 1
            java.lang.Object r2 = kotlinx.coroutines.i.g(r1, r0, r2, r1)
            return r2
    }
}

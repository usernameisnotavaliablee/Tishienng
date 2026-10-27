package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PictureKt {
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Picture record(@org.jetbrains.annotations.NotNull android.graphics.Picture r0, int r1, int r2, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.n1> r3) {
            android.graphics.Canvas r1 = r0.beginRecording(r1, r2)
            r2 = 1
            r3.invoke(r1)     // Catch: java.lang.Throwable -> L12
            kotlin.jvm.internal.d0.d(r2)
            r0.endRecording()
            kotlin.jvm.internal.d0.c(r2)
            return r0
        L12:
            r1 = move-exception
            kotlin.jvm.internal.d0.d(r2)
            r0.endRecording()
            kotlin.jvm.internal.d0.c(r2)
            throw r1
    }
}

package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ShaderKt {
    public static final void transform(@org.jetbrains.annotations.NotNull android.graphics.Shader r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Matrix, kotlin.n1> r2) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r1.getLocalMatrix(r0)
            r2.invoke(r0)
            r1.setLocalMatrix(r0)
            return
    }
}

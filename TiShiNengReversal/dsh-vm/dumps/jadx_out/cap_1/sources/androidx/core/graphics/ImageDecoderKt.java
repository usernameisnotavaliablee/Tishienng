package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.SuppressLint({"ClassVerificationFailure"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ImageDecoderKt {
    @androidx.annotation.RequiresApi(28)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap decodeBitmap(@org.jetbrains.annotations.NotNull android.graphics.ImageDecoder.Source r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, kotlin.n1> r2) {
            androidx.core.graphics.ImageDecoderKt$decodeBitmap$1 r0 = new androidx.core.graphics.ImageDecoderKt$decodeBitmap$1
            r0.<init>(r2)
            android.graphics.ImageDecoder$OnHeaderDecodedListener r2 = androidx.core.graphics.u.a(r0)
            android.graphics.Bitmap r1 = androidx.core.graphics.w.a(r1, r2)
            return r1
    }

    @androidx.annotation.RequiresApi(28)
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.drawable.Drawable decodeDrawable(@org.jetbrains.annotations.NotNull android.graphics.ImageDecoder.Source r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function3<? super android.graphics.ImageDecoder, ? super android.graphics.ImageDecoder.ImageInfo, ? super android.graphics.ImageDecoder.Source, kotlin.n1> r2) {
            androidx.core.graphics.ImageDecoderKt$decodeDrawable$1 r0 = new androidx.core.graphics.ImageDecoderKt$decodeDrawable$1
            r0.<init>(r2)
            android.graphics.ImageDecoder$OnHeaderDecodedListener r2 = androidx.core.graphics.u.a(r0)
            android.graphics.drawable.Drawable r1 = androidx.core.graphics.v.a(r1, r2)
            return r1
    }
}

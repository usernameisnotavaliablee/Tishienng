package androidx.core.graphics;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class BitmapKt {
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap applyCanvas(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r1, @org.jetbrains.annotations.NotNull kotlin.jvm.functions.Function1<? super android.graphics.Canvas, kotlin.n1> r2) {
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r1)
            r2.invoke(r0)
            return r1
    }

    public static final boolean contains(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r2, @org.jetbrains.annotations.NotNull android.graphics.Point r3) {
            int r0 = r2.getWidth()
            int r1 = r3.x
            if (r1 < 0) goto L16
            if (r1 >= r0) goto L16
            int r3 = r3.y
            if (r3 < 0) goto L16
            int r2 = r2.getHeight()
            if (r3 >= r2) goto L16
            r2 = 1
            return r2
        L16:
            r2 = 0
            return r2
    }

    public static final boolean contains(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r3, @org.jetbrains.annotations.NotNull android.graphics.PointF r4) {
            float r0 = r4.x
            r1 = 0
            int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r2 < 0) goto L21
            int r2 = r3.getWidth()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 >= 0) goto L21
            float r4 = r4.y
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L21
            int r3 = r3.getHeight()
            float r3 = (float) r3
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L21
            r3 = 1
            return r3
        L21:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap createBitmap(int r0, int r1, @org.jetbrains.annotations.NotNull android.graphics.Bitmap.Config r2) {
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            return r0
    }

    @androidx.annotation.RequiresApi(26)
    @android.annotation.SuppressLint({"ClassVerificationFailure"})
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap createBitmap(int r0, int r1, @org.jetbrains.annotations.NotNull android.graphics.Bitmap.Config r2, boolean r3, @org.jetbrains.annotations.NotNull android.graphics.ColorSpace r4) {
            android.graphics.Bitmap r0 = androidx.core.graphics.a.a(r0, r1, r2, r3, r4)
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap createBitmap$default(int r0, int r1, android.graphics.Bitmap.Config r2, int r3, java.lang.Object r4) {
            r3 = r3 & 4
            if (r3 == 0) goto L6
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r0, r1, r2)
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap createBitmap$default(int r0, int r1, android.graphics.Bitmap.Config r2, boolean r3, android.graphics.ColorSpace r4, int r5, java.lang.Object r6) {
            r6 = r5 & 4
            if (r6 == 0) goto L6
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L6:
            r6 = r5 & 8
            if (r6 == 0) goto Lb
            r3 = 1
        Lb:
            r5 = r5 & 16
            if (r5 == 0) goto L17
            android.graphics.ColorSpace$Named r4 = androidx.core.graphics.b.a()
            android.graphics.ColorSpace r4 = androidx.core.graphics.c.a(r4)
        L17:
            android.graphics.Bitmap r0 = androidx.core.graphics.a.a(r0, r1, r2, r3, r4)
            return r0
    }

    public static final int get(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r0, int r1, int r2) {
            int r0 = r0.getPixel(r1, r2)
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap scale(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r0, int r1, int r2, boolean r3) {
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r1, r2, r3)
            return r0
    }

    public static /* synthetic */ android.graphics.Bitmap scale$default(android.graphics.Bitmap r0, int r1, int r2, boolean r3, int r4, java.lang.Object r5) {
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 1
        L5:
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createScaledBitmap(r0, r1, r2, r3)
            return r0
    }

    public static final void set(@org.jetbrains.annotations.NotNull android.graphics.Bitmap r0, int r1, int r2, @androidx.annotation.ColorInt int r3) {
            r0.setPixel(r1, r2, r3)
            return
    }
}

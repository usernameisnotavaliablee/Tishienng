package androidx.core.graphics.drawable;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDrawable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n+ 2 Rect.kt\nandroidx/core/graphics/RectKt\n*L\n1#1,118:1\n38#2:119\n49#2:120\n60#2:121\n71#2:122\n*S KotlinDebug\n*F\n+ 1 Drawable.kt\nandroidx/core/graphics/drawable/DrawableKt\n*L\n66#1:119\n66#1:120\n66#1:121\n66#1:122\n*E\n"})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class DrawableKt {
    @org.jetbrains.annotations.NotNull
    public static final android.graphics.Bitmap toBitmap(@org.jetbrains.annotations.NotNull android.graphics.drawable.Drawable r5, @androidx.annotation.Px int r6, @androidx.annotation.Px int r7, @org.jetbrains.annotations.Nullable android.graphics.Bitmap.Config r8) {
            boolean r0 = r5 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto L44
            r0 = r5
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r1 = r0.getBitmap()
            if (r1 == 0) goto L3c
            if (r8 == 0) goto L19
            android.graphics.Bitmap r1 = r0.getBitmap()
            android.graphics.Bitmap$Config r1 = r1.getConfig()
            if (r1 != r8) goto L44
        L19:
            android.graphics.Bitmap r5 = r0.getBitmap()
            int r5 = r5.getWidth()
            if (r6 != r5) goto L32
            android.graphics.Bitmap r5 = r0.getBitmap()
            int r5 = r5.getHeight()
            if (r7 != r5) goto L32
            android.graphics.Bitmap r5 = r0.getBitmap()
            return r5
        L32:
            android.graphics.Bitmap r5 = r0.getBitmap()
            r8 = 1
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createScaledBitmap(r5, r6, r7, r8)
            return r5
        L3c:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r6 = "bitmap is null"
            r5.<init>(r6)
            throw r5
        L44:
            android.graphics.Rect r0 = r5.getBounds()
            int r1 = r0.left
            int r2 = r0.top
            int r3 = r0.right
            int r0 = r0.bottom
            if (r8 != 0) goto L54
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
        L54:
            android.graphics.Bitmap r8 = android.graphics.Bitmap.createBitmap(r6, r7, r8)
            r4 = 0
            r5.setBounds(r4, r4, r6, r7)
            android.graphics.Canvas r6 = new android.graphics.Canvas
            r6.<init>(r8)
            r5.draw(r6)
            r5.setBounds(r1, r2, r3, r0)
            return r8
    }

    public static /* synthetic */ android.graphics.Bitmap toBitmap$default(android.graphics.drawable.Drawable r0, int r1, int r2, android.graphics.Bitmap.Config r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            int r1 = r0.getIntrinsicWidth()
        L8:
            r5 = r4 & 2
            if (r5 == 0) goto L10
            int r2 = r0.getIntrinsicHeight()
        L10:
            r4 = r4 & 4
            if (r4 == 0) goto L15
            r3 = 0
        L15:
            android.graphics.Bitmap r0 = toBitmap(r0, r1, r2, r3)
            return r0
    }

    @org.jetbrains.annotations.Nullable
    public static final android.graphics.Bitmap toBitmapOrNull(@org.jetbrains.annotations.NotNull android.graphics.drawable.Drawable r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @org.jetbrains.annotations.Nullable android.graphics.Bitmap.Config r4) {
            boolean r0 = r1 instanceof android.graphics.drawable.BitmapDrawable
            if (r0 == 0) goto Lf
            r0 = r1
            android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
            android.graphics.Bitmap r0 = r0.getBitmap()
            if (r0 != 0) goto Lf
            r1 = 0
            return r1
        Lf:
            android.graphics.Bitmap r1 = toBitmap(r1, r2, r3, r4)
            return r1
    }

    public static /* synthetic */ android.graphics.Bitmap toBitmapOrNull$default(android.graphics.drawable.Drawable r0, int r1, int r2, android.graphics.Bitmap.Config r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L8
            int r1 = r0.getIntrinsicWidth()
        L8:
            r5 = r4 & 2
            if (r5 == 0) goto L10
            int r2 = r0.getIntrinsicHeight()
        L10:
            r4 = r4 & 4
            if (r4 == 0) goto L15
            r3 = 0
        L15:
            android.graphics.Bitmap r0 = toBitmapOrNull(r0, r1, r2, r3)
            return r0
    }

    public static final void updateBounds(@org.jetbrains.annotations.NotNull android.graphics.drawable.Drawable r0, @androidx.annotation.Px int r1, @androidx.annotation.Px int r2, @androidx.annotation.Px int r3, @androidx.annotation.Px int r4) {
            r0.setBounds(r1, r2, r3, r4)
            return
    }

    public static /* synthetic */ void updateBounds$default(android.graphics.drawable.Drawable r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto La
            android.graphics.Rect r1 = r0.getBounds()
            int r1 = r1.left
        La:
            r6 = r5 & 2
            if (r6 == 0) goto L14
            android.graphics.Rect r2 = r0.getBounds()
            int r2 = r2.top
        L14:
            r6 = r5 & 4
            if (r6 == 0) goto L1e
            android.graphics.Rect r3 = r0.getBounds()
            int r3 = r3.right
        L1e:
            r5 = r5 & 8
            if (r5 == 0) goto L28
            android.graphics.Rect r4 = r0.getBounds()
            int r4 = r4.bottom
        L28:
            updateBounds(r0, r1, r2, r3, r4)
            return
    }
}

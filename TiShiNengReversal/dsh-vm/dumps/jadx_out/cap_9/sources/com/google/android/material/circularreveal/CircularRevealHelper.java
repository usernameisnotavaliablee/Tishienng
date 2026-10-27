package com.google.android.material.circularreveal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class CircularRevealHelper {
    public static final int BITMAP_SHADER = 0;
    public static final int CLIP_PATH = 1;
    private static final boolean DEBUG = false;
    public static final int REVEAL_ANIMATOR = 2;
    public static final int STRATEGY = 0;
    private boolean buildingCircularRevealCache;
    private android.graphics.Paint debugPaint;
    private final com.google.android.material.circularreveal.CircularRevealHelper.Delegate delegate;
    private boolean hasCircularRevealCache;

    @androidx.annotation.Nullable
    private android.graphics.drawable.Drawable overlayDrawable;

    @androidx.annotation.Nullable
    private com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo;

    @androidx.annotation.NonNull
    private final android.graphics.Paint revealPaint;

    @androidx.annotation.NonNull
    private final android.graphics.Path revealPath;

    @androidx.annotation.NonNull
    private final android.graphics.Paint scrimPaint;

    @androidx.annotation.NonNull
    private final android.view.View view;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface Delegate {
        void actualDraw(android.graphics.Canvas r1);

        boolean actualIsOpaque();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Strategy {
    }

    static {
            r0 = 2
            com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY = r0
            return
    }

    public CircularRevealHelper(com.google.android.material.circularreveal.CircularRevealHelper.Delegate r3) {
            r2 = this;
            r2.<init>()
            r2.delegate = r3
            android.view.View r3 = (android.view.View) r3
            r2.view = r3
            r0 = 0
            r3.setWillNotDraw(r0)
            android.graphics.Path r3 = new android.graphics.Path
            r3.<init>()
            r2.revealPath = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r1 = 7
            r3.<init>(r1)
            r2.revealPaint = r3
            android.graphics.Paint r3 = new android.graphics.Paint
            r1 = 1
            r3.<init>(r1)
            r2.scrimPaint = r3
            r3.setColor(r0)
            return
    }

    private void drawDebugCircle(@androidx.annotation.NonNull android.graphics.Canvas r4, int r5, float r6) {
            r3 = this;
            android.graphics.Paint r0 = r3.debugPaint
            r0.setColor(r5)
            android.graphics.Paint r5 = r3.debugPaint
            r5.setStrokeWidth(r6)
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r5 = r3.revealInfo
            float r0 = r5.centerX
            float r1 = r5.centerY
            float r5 = r5.radius
            r2 = 1073741824(0x40000000, float:2.0)
            float r6 = r6 / r2
            float r5 = r5 - r6
            android.graphics.Paint r6 = r3.debugPaint
            r4.drawCircle(r0, r1, r5, r6)
            return
    }

    private void drawDebugMode(@androidx.annotation.NonNull android.graphics.Canvas r5) {
            r4 = this;
            com.google.android.material.circularreveal.CircularRevealHelper$Delegate r0 = r4.delegate
            r0.actualDraw(r5)
            boolean r0 = r4.shouldDrawScrim()
            if (r0 == 0) goto L18
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r4.revealInfo
            float r1 = r0.centerX
            float r2 = r0.centerY
            float r0 = r0.radius
            android.graphics.Paint r3 = r4.scrimPaint
            r5.drawCircle(r1, r2, r0, r3)
        L18:
            boolean r0 = r4.shouldDrawCircularReveal()
            if (r0 == 0) goto L2c
            r0 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r1 = 1092616192(0x41200000, float:10.0)
            r4.drawDebugCircle(r5, r0, r1)
            r0 = -65536(0xffffffffffff0000, float:NaN)
            r1 = 1084227584(0x40a00000, float:5.0)
            r4.drawDebugCircle(r5, r0, r1)
        L2c:
            r4.drawOverlayDrawable(r5)
            return
    }

    private void drawOverlayDrawable(@androidx.annotation.NonNull android.graphics.Canvas r5) {
            r4 = this;
            boolean r0 = r4.shouldDrawOverlayDrawable()
            if (r0 == 0) goto L31
            android.graphics.drawable.Drawable r0 = r4.overlayDrawable
            android.graphics.Rect r0 = r0.getBounds()
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r1 = r4.revealInfo
            float r1 = r1.centerX
            int r2 = r0.width()
            float r2 = (float) r2
            r3 = 1073741824(0x40000000, float:2.0)
            float r2 = r2 / r3
            float r1 = r1 - r2
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r2 = r4.revealInfo
            float r2 = r2.centerY
            int r0 = r0.height()
            float r0 = (float) r0
            float r0 = r0 / r3
            float r2 = r2 - r0
            r5.translate(r1, r2)
            android.graphics.drawable.Drawable r0 = r4.overlayDrawable
            r0.draw(r5)
            float r0 = -r1
            float r1 = -r2
            r5.translate(r0, r1)
        L31:
            return
    }

    private float getDistanceToFurthestCorner(@androidx.annotation.NonNull com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo r7) {
            r6 = this;
            float r0 = r7.centerX
            float r1 = r7.centerY
            android.view.View r7 = r6.view
            int r7 = r7.getWidth()
            float r4 = (float) r7
            android.view.View r7 = r6.view
            int r7 = r7.getHeight()
            float r5 = (float) r7
            r2 = 0
            r3 = 0
            float r7 = com.google.android.material.math.MathUtils.distanceToFurthestCorner(r0, r1, r2, r3, r4, r5)
            return r7
    }

    private void invalidateRevealInfo() {
            r5 = this;
            int r0 = com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY
            r1 = 1
            if (r0 != r1) goto L1b
            android.graphics.Path r0 = r5.revealPath
            r0.rewind()
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r5.revealInfo
            if (r0 == 0) goto L1b
            android.graphics.Path r1 = r5.revealPath
            float r2 = r0.centerX
            float r3 = r0.centerY
            float r0 = r0.radius
            android.graphics.Path$Direction r4 = android.graphics.Path.Direction.CW
            r1.addCircle(r2, r3, r0, r4)
        L1b:
            android.view.View r0 = r5.view
            r0.invalidate()
            return
    }

    private boolean shouldDrawCircularReveal() {
            r4 = this;
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r4.revealInfo
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lf
            boolean r0 = r0.isInvalid()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            int r3 = com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY
            if (r3 != 0) goto L1c
            if (r0 != 0) goto L1b
            boolean r0 = r4.hasCircularRevealCache
            if (r0 == 0) goto L1b
            return r2
        L1b:
            return r1
        L1c:
            r0 = r0 ^ r2
            return r0
    }

    private boolean shouldDrawOverlayDrawable() {
            r1 = this;
            boolean r0 = r1.buildingCircularRevealCache
            if (r0 != 0) goto Le
            android.graphics.drawable.Drawable r0 = r1.overlayDrawable
            if (r0 == 0) goto Le
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r1.revealInfo
            if (r0 == 0) goto Le
            r0 = 1
            return r0
        Le:
            r0 = 0
            return r0
    }

    private boolean shouldDrawScrim() {
            r1 = this;
            boolean r0 = r1.buildingCircularRevealCache
            if (r0 != 0) goto L12
            android.graphics.Paint r0 = r1.scrimPaint
            int r0 = r0.getColor()
            int r0 = android.graphics.Color.alpha(r0)
            if (r0 == 0) goto L12
            r0 = 1
            return r0
        L12:
            r0 = 0
            return r0
    }

    public void buildCircularRevealCache() {
            r6 = this;
            int r0 = com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY
            if (r0 != 0) goto L55
            r0 = 1
            r6.buildingCircularRevealCache = r0
            r1 = 0
            r6.hasCircularRevealCache = r1
            android.view.View r2 = r6.view
            r2.buildDrawingCache()
            android.view.View r2 = r6.view
            android.graphics.Bitmap r2 = r2.getDrawingCache()
            if (r2 != 0) goto L43
            android.view.View r3 = r6.view
            int r3 = r3.getWidth()
            if (r3 == 0) goto L43
            android.view.View r3 = r6.view
            int r3 = r3.getHeight()
            if (r3 == 0) goto L43
            android.view.View r2 = r6.view
            int r2 = r2.getWidth()
            android.view.View r3 = r6.view
            int r3 = r3.getHeight()
            android.graphics.Bitmap$Config r4 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r2 = android.graphics.Bitmap.createBitmap(r2, r3, r4)
            android.graphics.Canvas r3 = new android.graphics.Canvas
            r3.<init>(r2)
            android.view.View r4 = r6.view
            r4.draw(r3)
        L43:
            if (r2 == 0) goto L51
            android.graphics.Paint r3 = r6.revealPaint
            android.graphics.BitmapShader r4 = new android.graphics.BitmapShader
            android.graphics.Shader$TileMode r5 = android.graphics.Shader.TileMode.CLAMP
            r4.<init>(r2, r5, r5)
            r3.setShader(r4)
        L51:
            r6.buildingCircularRevealCache = r1
            r6.hasCircularRevealCache = r0
        L55:
            return
    }

    public void destroyCircularRevealCache() {
            r2 = this;
            int r0 = com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY
            if (r0 != 0) goto L17
            r0 = 0
            r2.hasCircularRevealCache = r0
            android.view.View r0 = r2.view
            r0.destroyDrawingCache()
            android.graphics.Paint r0 = r2.revealPaint
            r1 = 0
            r0.setShader(r1)
            android.view.View r0 = r2.view
            r0.invalidate()
        L17:
            return
    }

    public void draw(@androidx.annotation.NonNull android.graphics.Canvas r14) {
            r13 = this;
            boolean r0 = r13.shouldDrawCircularReveal()
            if (r0 == 0) goto L9e
            int r0 = com.google.android.material.circularreveal.CircularRevealHelper.STRATEGY
            if (r0 == 0) goto L7c
            r1 = 1
            if (r0 == r1) goto L4e
            r1 = 2
            if (r0 != r1) goto L37
            com.google.android.material.circularreveal.CircularRevealHelper$Delegate r0 = r13.delegate
            r0.actualDraw(r14)
            boolean r0 = r13.shouldDrawScrim()
            if (r0 == 0) goto L34
            android.view.View r0 = r13.view
            int r0 = r0.getWidth()
            float r4 = (float) r0
            android.view.View r0 = r13.view
            int r0 = r0.getHeight()
            float r5 = (float) r0
            android.graphics.Paint r6 = r13.scrimPaint
            r2 = 0
            r3 = 0
            r1 = r14
            r1.drawRect(r2, r3, r4, r5, r6)
            r7 = r1
            goto Lbf
        L34:
            r7 = r14
            goto Lbf
        L37:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unsupported strategy "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            throw r14
        L4e:
            r7 = r14
            int r14 = r7.save()
            android.graphics.Path r0 = r13.revealPath
            r7.clipPath(r0)
            com.google.android.material.circularreveal.CircularRevealHelper$Delegate r0 = r13.delegate
            r0.actualDraw(r7)
            boolean r0 = r13.shouldDrawScrim()
            if (r0 == 0) goto L78
            android.view.View r0 = r13.view
            int r0 = r0.getWidth()
            float r10 = (float) r0
            android.view.View r0 = r13.view
            int r0 = r0.getHeight()
            float r11 = (float) r0
            android.graphics.Paint r12 = r13.scrimPaint
            r8 = 0
            r9 = 0
            r7.drawRect(r8, r9, r10, r11, r12)
        L78:
            r7.restoreToCount(r14)
            goto Lbf
        L7c:
            r7 = r14
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r14 = r13.revealInfo
            float r0 = r14.centerX
            float r1 = r14.centerY
            float r14 = r14.radius
            android.graphics.Paint r2 = r13.revealPaint
            r7.drawCircle(r0, r1, r14, r2)
            boolean r14 = r13.shouldDrawScrim()
            if (r14 == 0) goto Lbf
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r14 = r13.revealInfo
            float r0 = r14.centerX
            float r1 = r14.centerY
            float r14 = r14.radius
            android.graphics.Paint r2 = r13.scrimPaint
            r7.drawCircle(r0, r1, r14, r2)
            goto Lbf
        L9e:
            r7 = r14
            com.google.android.material.circularreveal.CircularRevealHelper$Delegate r14 = r13.delegate
            r14.actualDraw(r7)
            boolean r14 = r13.shouldDrawScrim()
            if (r14 == 0) goto Lbf
            android.view.View r14 = r13.view
            int r14 = r14.getWidth()
            float r10 = (float) r14
            android.view.View r14 = r13.view
            int r14 = r14.getHeight()
            float r11 = (float) r14
            android.graphics.Paint r12 = r13.scrimPaint
            r8 = 0
            r9 = 0
            r7.drawRect(r8, r9, r10, r11, r12)
        Lbf:
            r13.drawOverlayDrawable(r7)
            return
    }

    @androidx.annotation.Nullable
    public android.graphics.drawable.Drawable getCircularRevealOverlayDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.overlayDrawable
            return r0
    }

    @androidx.annotation.ColorInt
    public int getCircularRevealScrimColor() {
            r1 = this;
            android.graphics.Paint r0 = r1.scrimPaint
            int r0 = r0.getColor()
            return r0
    }

    @androidx.annotation.Nullable
    public com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo getRevealInfo() {
            r2 = this;
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r2.revealInfo
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r1 = new com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo
            r1.<init>(r0)
            boolean r0 = r1.isInvalid()
            if (r0 == 0) goto L17
            float r0 = r2.getDistanceToFurthestCorner(r1)
            r1.radius = r0
        L17:
            return r1
    }

    public boolean isOpaque() {
            r1 = this;
            com.google.android.material.circularreveal.CircularRevealHelper$Delegate r0 = r1.delegate
            boolean r0 = r0.actualIsOpaque()
            if (r0 == 0) goto L10
            boolean r0 = r1.shouldDrawCircularReveal()
            if (r0 != 0) goto L10
            r0 = 1
            return r0
        L10:
            r0 = 0
            return r0
    }

    public void setCircularRevealOverlayDrawable(@androidx.annotation.Nullable android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.overlayDrawable = r1
            android.view.View r1 = r0.view
            r1.invalidate()
            return
    }

    public void setCircularRevealScrimColor(@androidx.annotation.ColorInt int r2) {
            r1 = this;
            android.graphics.Paint r0 = r1.scrimPaint
            r0.setColor(r2)
            android.view.View r2 = r1.view
            r2.invalidate()
            return
    }

    public void setRevealInfo(@androidx.annotation.Nullable com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo r3) {
            r2 = this;
            if (r3 != 0) goto L6
            r3 = 0
            r2.revealInfo = r3
            goto L2b
        L6:
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = r2.revealInfo
            if (r0 != 0) goto L12
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r0 = new com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo
            r0.<init>(r3)
            r2.revealInfo = r0
            goto L15
        L12:
            r0.set(r3)
        L15:
            float r0 = r3.radius
            float r3 = r2.getDistanceToFurthestCorner(r3)
            r1 = 953267991(0x38d1b717, float:1.0E-4)
            boolean r3 = com.google.android.material.math.MathUtils.geq(r0, r3, r1)
            if (r3 == 0) goto L2b
            com.google.android.material.circularreveal.CircularRevealWidget$RevealInfo r3 = r2.revealInfo
            r0 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r3.radius = r0
        L2b:
            r2.invalidateRevealInfo()
            return
    }
}

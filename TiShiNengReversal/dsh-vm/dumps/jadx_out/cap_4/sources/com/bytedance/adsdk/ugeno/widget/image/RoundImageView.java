package com.bytedance.adsdk.ugeno.widget.image;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class RoundImageView extends android.widget.ImageView implements com.bytedance.adsdk.ugeno.cw.up, com.bytedance.adsdk.ugeno.j.ae {
    public static final android.graphics.Shader.TileMode j = null;

    /* renamed from: r, reason: collision with root package name */
    private static final android.widget.ImageView.ScaleType[] f2011r = null;
    static final /* synthetic */ boolean xt = true;
    private android.content.res.ColorStateList ae;
    private int av;
    private int az;
    private float cw;
    private android.graphics.ColorFilter g;
    private android.widget.ImageView.ScaleType i;
    private boolean jy;
    private com.bytedance.adsdk.ugeno.cw kt;

    /* renamed from: m, reason: collision with root package name */
    private android.graphics.drawable.Drawable f2012m;
    private android.graphics.Shader.TileMode mi;
    private boolean oq;
    private android.graphics.drawable.Drawable qv;
    private com.bytedance.adsdk.ugeno.j.tl tj;
    private float tl;
    private final float[] up;
    private boolean vl;

    /* renamed from: w, reason: collision with root package name */
    private android.graphics.Shader.TileMode f2013w;
    private boolean ws;

    /* renamed from: com.bytedance.adsdk.ugeno.widget.image.RoundImageView$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] j = null;

        static {
                android.widget.ImageView$ScaleType[] r0 = android.widget.ImageView.ScaleType.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.bytedance.adsdk.ugeno.widget.image.RoundImageView.AnonymousClass1.j = r0
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.bytedance.adsdk.ugeno.widget.image.RoundImageView.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L1d
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.bytedance.adsdk.ugeno.widget.image.RoundImageView.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L28
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.bytedance.adsdk.ugeno.widget.image.RoundImageView.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L33
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.bytedance.adsdk.ugeno.widget.image.RoundImageView.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L3e
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.bytedance.adsdk.ugeno.widget.image.RoundImageView.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L49
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.bytedance.adsdk.ugeno.widget.image.RoundImageView.AnonymousClass1.j     // Catch: java.lang.NoSuchFieldError -> L54
                android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            android.graphics.Shader$TileMode r0 = android.graphics.Shader.TileMode.CLAMP
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView.j = r0
            r0 = 8
            android.widget.ImageView$ScaleType[] r0 = new android.widget.ImageView.ScaleType[r0]
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            r2 = 0
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_XY
            r2 = 1
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_START
            r2 = 2
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_CENTER
            r2 = 3
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.FIT_END
            r2 = 4
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER
            r2 = 5
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_CROP
            r2 = 6
            r0[r2] = r1
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.CENTER_INSIDE
            r2 = 7
            r0[r2] = r1
            com.bytedance.adsdk.ugeno.widget.image.RoundImageView.f2011r = r0
            return
    }

    public RoundImageView(android.content.Context r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = 4
            float[] r1 = new float[r1]
            r1 = {x0030: FILL_ARRAY_DATA , data: [0, 0, 0, 0} // fill-array
            r0.up = r1
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.ae = r1
            r1 = 0
            r0.tl = r1
            r1 = 0
            r0.g = r1
            r1 = 0
            r0.oq = r1
            r0.vl = r1
            r0.jy = r1
            r0.ws = r1
            android.graphics.Shader$TileMode r1 = com.bytedance.adsdk.ugeno.widget.image.RoundImageView.j
            r0.f2013w = r1
            r0.mi = r1
            com.bytedance.adsdk.ugeno.j.tl r1 = new com.bytedance.adsdk.ugeno.j.tl
            r1.<init>(r0)
            r0.tj = r1
            return
    }

    private void cw() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.qv
            android.widget.ImageView$ScaleType r1 = r2.i
            r2.j(r0, r1)
            return
    }

    private android.graphics.drawable.Drawable j() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r4.az
            if (r2 == 0) goto L2a
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r2)     // Catch: java.lang.Exception -> L11
            goto L2a
        L11:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to find resource: "
            r2.<init>(r3)
            int r3 = r4.az
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RoundedImageView"
            com.bytedance.sdk.component.utils.vl.xt(r3, r2, r0)
            r0 = 0
            r4.az = r0
        L2a:
            android.graphics.drawable.Drawable r0 = com.bytedance.adsdk.ugeno.widget.image.j.j(r1)
            return r0
    }

    private void j(android.graphics.drawable.Drawable r5, android.widget.ImageView.ScaleType r6) {
            r4 = this;
            if (r5 != 0) goto L3
            goto L57
        L3:
            boolean r0 = r5 instanceof com.bytedance.adsdk.ugeno.widget.image.j
            r1 = 0
            if (r0 == 0) goto L41
            com.bytedance.adsdk.ugeno.widget.image.j r5 = (com.bytedance.adsdk.ugeno.widget.image.j) r5
            com.bytedance.adsdk.ugeno.widget.image.j r6 = r5.j(r6)
            float r0 = r4.tl
            com.bytedance.adsdk.ugeno.widget.image.j r6 = r6.j(r0)
            android.content.res.ColorStateList r0 = r4.ae
            com.bytedance.adsdk.ugeno.widget.image.j r6 = r6.j(r0)
            boolean r0 = r4.jy
            com.bytedance.adsdk.ugeno.widget.image.j r6 = r6.j(r0)
            android.graphics.Shader$TileMode r0 = r4.f2013w
            com.bytedance.adsdk.ugeno.widget.image.j r6 = r6.j(r0)
            android.graphics.Shader$TileMode r0 = r4.mi
            r6.xt(r0)
            float[] r6 = r4.up
            if (r6 == 0) goto L3d
            r0 = r6[r1]
            r1 = 1
            r1 = r6[r1]
            r2 = 2
            r2 = r6[r2]
            r3 = 3
            r6 = r6[r3]
            r5.j(r0, r1, r2, r6)
        L3d:
            r4.r()
            return
        L41:
            boolean r0 = r5 instanceof android.graphics.drawable.LayerDrawable
            if (r0 == 0) goto L57
            android.graphics.drawable.LayerDrawable r5 = (android.graphics.drawable.LayerDrawable) r5
            int r0 = r5.getNumberOfLayers()
        L4b:
            if (r1 >= r0) goto L57
            android.graphics.drawable.Drawable r2 = r5.getDrawable(r1)
            r4.j(r2, r6)
            int r1 = r1 + 1
            goto L4b
        L57:
            return
    }

    private void j(boolean r2) {
            r1 = this;
            boolean r0 = r1.ws
            if (r0 == 0) goto L15
            if (r2 == 0) goto Le
            android.graphics.drawable.Drawable r2 = r1.f2012m
            android.graphics.drawable.Drawable r2 = com.bytedance.adsdk.ugeno.widget.image.j.j(r2)
            r1.f2012m = r2
        Le:
            android.graphics.drawable.Drawable r2 = r1.f2012m
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.FIT_XY
            r1.j(r2, r0)
        L15:
            return
    }

    private void r() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.qv
            if (r0 == 0) goto L17
            boolean r1 = r2.oq
            if (r1 == 0) goto L17
            android.graphics.drawable.Drawable r0 = r0.mutate()
            r2.qv = r0
            boolean r1 = r2.vl
            if (r1 == 0) goto L17
            android.graphics.ColorFilter r1 = r2.g
            r0.setColorFilter(r1)
        L17:
            return
    }

    private android.graphics.drawable.Drawable xt() {
            r4 = this;
            android.content.res.Resources r0 = r4.getResources()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r2 = r4.av
            if (r2 == 0) goto L2a
            android.graphics.drawable.Drawable r1 = r0.getDrawable(r2)     // Catch: java.lang.Exception -> L11
            goto L2a
        L11:
            r0 = move-exception
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Unable to find resource: "
            r2.<init>(r3)
            int r3 = r4.av
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "RoundedImageView"
            com.bytedance.sdk.component.utils.vl.xt(r3, r2, r0)
            r0 = 0
            r4.av = r0
        L2a:
            android.graphics.drawable.Drawable r0 = com.bytedance.adsdk.ugeno.widget.image.j.j(r1)
            return r0
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
            r0 = this;
            super.drawableStateChanged()
            r0.invalidate()
            return
    }

    public int getBorderColor() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.ae
            int r0 = r0.getDefaultColor()
            return r0
    }

    public android.content.res.ColorStateList getBorderColors() {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.ae
            return r0
    }

    public float getBorderRadius() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.tj
            float r0 = r0.j()
            return r0
    }

    public float getBorderWidth() {
            r1 = this;
            float r0 = r1.tl
            return r0
    }

    public float getCornerRadius() {
            r1 = this;
            float r0 = r1.getMaxCornerRadius()
            return r0
    }

    public float getMaxCornerRadius() {
            r5 = this;
            float[] r0 = r5.up
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L5:
            if (r3 >= r1) goto L10
            r4 = r0[r3]
            float r2 = java.lang.Math.max(r4, r2)
            int r3 = r3 + 1
            goto L5
        L10:
            return r2
    }

    @Override // com.bytedance.adsdk.ugeno.cw.up, com.bytedance.adsdk.ugeno.j.ae
    public float getRipple() {
            r1 = this;
            float r0 = r1.cw
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getRubIn() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.tj
            float r0 = r0.getRubIn()
            return r0
    }

    @Override // android.widget.ImageView
    public android.widget.ImageView.ScaleType getScaleType() {
            r1 = this;
            android.widget.ImageView$ScaleType r0 = r1.i
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getShine() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.tj
            float r0 = r0.getShine()
            return r0
    }

    @Override // com.bytedance.adsdk.ugeno.j.ae
    public float getStretch() {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.tj
            float r0 = r0.getStretch()
            return r0
    }

    public android.graphics.Shader.TileMode getTileModeX() {
            r1 = this;
            android.graphics.Shader$TileMode r0 = r1.f2013w
            return r0
    }

    public android.graphics.Shader.TileMode getTileModeY() {
            r1 = this;
            android.graphics.Shader$TileMode r0 = r1.mi
            return r0
    }

    public void j(float r7, float r8, float r9, float r10) {
            r6 = this;
            float[] r0 = r6.up
            r1 = 0
            r2 = r0[r1]
            r3 = 3
            r4 = 2
            r5 = 1
            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r2 != 0) goto L1f
            r2 = r0[r5]
            int r2 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r2 != 0) goto L1f
            r2 = r0[r4]
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 != 0) goto L1f
            r2 = r0[r3]
            int r2 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r2 != 0) goto L1f
            return
        L1f:
            r0[r1] = r7
            r0[r5] = r8
            r0[r3] = r9
            r0[r4] = r10
            r6.cw()
            r6.j(r1)
            r6.invalidate()
            return
    }

    public void j(com.bytedance.adsdk.ugeno.cw r1) {
            r0 = this;
            r0.kt = r1
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
            r1 = this;
            super.onAttachedToWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.kt
            if (r0 == 0) goto La
            r0.up()
        La:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            super.onDetachedFromWindow()
            com.bytedance.adsdk.ugeno.cw r0 = r1.kt
            if (r0 == 0) goto La
            r0.m()
        La:
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDraw(android.graphics.Canvas r2) {
            r1 = this;
            super.onDraw(r2)
            com.bytedance.adsdk.ugeno.cw r0 = r1.kt
            if (r0 == 0) goto La
            r0.j(r2, r1)
        La:
            return
    }

    @Override // android.view.View
    protected void onLayout(boolean r2, int r3, int r4, int r5, int r6) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw r0 = r1.kt
            if (r0 == 0) goto L7
            r0.j(r3, r4, r5, r6)
        L7:
            super.onLayout(r2, r3, r4, r5, r6)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int r2, int r3) {
            r1 = this;
            com.bytedance.adsdk.ugeno.cw r0 = r1.kt
            if (r0 == 0) goto L12
            int[] r2 = r0.j(r2, r3)
            r3 = 0
            r3 = r2[r3]
            r0 = 1
            r2 = r2[r0]
            super.onMeasure(r3, r2)
            return
        L12:
            super.onMeasure(r2, r3)
            return
    }

    @Override // android.view.View
    protected void onSizeChanged(int r1, int r2, int r3, int r4) {
            r0 = this;
            super.onSizeChanged(r1, r2, r3, r4)
            com.bytedance.adsdk.ugeno.cw r4 = r0.kt
            if (r4 == 0) goto La
            r4.xt(r1, r2, r3, r3)
        La:
            return
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean r2) {
            r1 = this;
            super.onWindowFocusChanged(r2)
            com.bytedance.adsdk.ugeno.cw r0 = r1.kt
            if (r0 == 0) goto La
            r0.j(r2)
        La:
            return
    }

    @Override // android.view.View
    public void setBackground(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundColor(int r2) {
            r1 = this;
            android.graphics.drawable.ColorDrawable r0 = new android.graphics.drawable.ColorDrawable
            r0.<init>(r2)
            r1.f2012m = r0
            r1.setBackgroundDrawable(r0)
            return
    }

    @Override // android.view.View
    @java.lang.Deprecated
    public void setBackgroundDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.f2012m = r1
            r1 = 1
            r0.j(r1)
            android.graphics.drawable.Drawable r1 = r0.f2012m
            super.setBackgroundDrawable(r1)
            return
    }

    @Override // android.view.View
    public void setBackgroundResource(int r2) {
            r1 = this;
            int r0 = r1.av
            if (r0 == r2) goto Lf
            r1.av = r2
            android.graphics.drawable.Drawable r2 = r1.xt()
            r1.f2012m = r2
            r1.setBackgroundDrawable(r2)
        Lf:
            return
    }

    public void setBorderColor(int r1) {
            r0 = this;
            android.content.res.ColorStateList r1 = android.content.res.ColorStateList.valueOf(r1)
            r0.setBorderColor(r1)
            return
    }

    public void setBorderColor(android.content.res.ColorStateList r2) {
            r1 = this;
            android.content.res.ColorStateList r0 = r1.ae
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L9
            goto L25
        L9:
            if (r2 == 0) goto Lc
            goto L12
        Lc:
            r2 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            android.content.res.ColorStateList r2 = android.content.res.ColorStateList.valueOf(r2)
        L12:
            r1.ae = r2
            r1.cw()
            r2 = 0
            r1.j(r2)
            float r2 = r1.tl
            r0 = 0
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L25
            r1.invalidate()
        L25:
            return
    }

    public void setBorderRadius(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.tj
            if (r0 == 0) goto L7
            r0.j(r2)
        L7:
            return
    }

    public void setBorderWidth(float r2) {
            r1 = this;
            float r0 = r1.tl
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L7
            return
        L7:
            r1.tl = r2
            r1.cw()
            r2 = 0
            r1.j(r2)
            r1.invalidate()
            return
    }

    public void setBorderWidth(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.setBorderWidth(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setColorFilter(android.graphics.ColorFilter r2) {
            r1 = this;
            android.graphics.ColorFilter r0 = r1.g
            if (r0 == r2) goto L11
            r1.g = r2
            r2 = 1
            r1.vl = r2
            r1.oq = r2
            r1.r()
            r1.invalidate()
        L11:
            return
    }

    public void setCornerRadius(float r1) {
            r0 = this;
            r0.j(r1, r1, r1, r1)
            return
    }

    public void setCornerRadiusDimen(int r2) {
            r1 = this;
            android.content.res.Resources r0 = r1.getResources()
            float r2 = r0.getDimension(r2)
            r1.j(r2, r2, r2, r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(android.graphics.Bitmap r2) {
            r1 = this;
            r0 = 0
            r1.az = r0
            com.bytedance.adsdk.ugeno.widget.image.j r2 = com.bytedance.adsdk.ugeno.widget.image.j.j(r2)
            r1.qv = r2
            r1.cw()
            android.graphics.drawable.Drawable r2 = r1.qv
            super.setImageDrawable(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r0 = 0
            r1.az = r0
            android.graphics.drawable.Drawable r0 = com.bytedance.adsdk.ugeno.widget.image.j.j(r2)
            r1.qv = r0
            r1.cw()
            super.setImageDrawable(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r2) {
            r1 = this;
            int r0 = r1.az
            if (r0 == r2) goto L14
            r1.az = r2
            android.graphics.drawable.Drawable r2 = r1.j()
            r1.qv = r2
            r1.cw()
            android.graphics.drawable.Drawable r2 = r1.qv
            super.setImageDrawable(r2)
        L14:
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            android.graphics.drawable.Drawable r1 = r0.getDrawable()
            r0.setImageDrawable(r1)
            return
    }

    public void setOval(boolean r1) {
            r0 = this;
            r0.jy = r1
            r0.cw()
            r1 = 0
            r0.j(r1)
            r0.invalidate()
            return
    }

    public void setRipple(float r2) {
            r1 = this;
            r1.cw = r2
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.tj
            if (r0 == 0) goto L9
            r0.xt(r2)
        L9:
            r1.postInvalidate()
            return
    }

    public void setRubIn(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.tj
            if (r0 == 0) goto L7
            r0.up(r2)
        L7:
            return
    }

    @Override // android.widget.ImageView
    public void setScaleType(android.widget.ImageView.ScaleType r3) {
            r2 = this;
            boolean r0 = com.bytedance.adsdk.ugeno.widget.image.RoundImageView.xt
            if (r0 != 0) goto Ld
            if (r3 == 0) goto L7
            goto Ld
        L7:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        Ld:
            android.widget.ImageView$ScaleType r0 = r2.i
            if (r0 == r3) goto L3a
            r2.i = r3
            int[] r0 = com.bytedance.adsdk.ugeno.widget.image.RoundImageView.AnonymousClass1.j
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L2d
            r1 = 2
            if (r0 == r1) goto L2d
            r1 = 3
            if (r0 == r1) goto L2d
            r1 = 4
            if (r0 == r1) goto L2d
            android.widget.ImageView$ScaleType r3 = android.widget.ImageView.ScaleType.FIT_XY
            super.setScaleType(r3)
            goto L30
        L2d:
            super.setScaleType(r3)
        L30:
            r2.cw()
            r3 = 0
            r2.j(r3)
            r2.invalidate()
        L3a:
            return
    }

    public void setShine(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.tj
            if (r0 == 0) goto L7
            r0.cw(r2)
        L7:
            return
    }

    public void setStretch(float r2) {
            r1 = this;
            com.bytedance.adsdk.ugeno.j.tl r0 = r1.tj
            if (r0 == 0) goto L7
            r0.r(r2)
        L7:
            return
    }

    public void setTileModeX(android.graphics.Shader.TileMode r2) {
            r1 = this;
            android.graphics.Shader$TileMode r0 = r1.f2013w
            if (r0 != r2) goto L5
            return
        L5:
            r1.f2013w = r2
            r1.cw()
            r2 = 0
            r1.j(r2)
            r1.invalidate()
            return
    }

    public void setTileModeY(android.graphics.Shader.TileMode r2) {
            r1 = this;
            android.graphics.Shader$TileMode r0 = r1.mi
            if (r0 != r2) goto L5
            return
        L5:
            r1.mi = r2
            r1.cw()
            r2 = 0
            r1.j(r2)
            r1.invalidate()
            return
    }
}

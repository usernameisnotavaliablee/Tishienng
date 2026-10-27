package cn.bluemobi.dylan.photoview.library;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class PhotoView extends android.widget.ImageView implements cn.bluemobi.dylan.photoview.library.c {
    private cn.bluemobi.dylan.photoview.library.d a;

    /* renamed from: b, reason: collision with root package name */
    private android.widget.ImageView.ScaleType f163b;

    public PhotoView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public PhotoView(android.content.Context r2, android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public PhotoView(android.content.Context r1, android.util.AttributeSet r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            android.widget.ImageView$ScaleType r1 = android.widget.ImageView.ScaleType.MATRIX
            super.setScaleType(r1)
            r0.c()
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void a(float r2, float r3, float r4, boolean r5) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.a(r2, r3, r4, r5)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void b(float r2, boolean r3) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.b(r2, r3)
            return
    }

    protected void c() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            if (r0 == 0) goto La
            android.widget.ImageView r0 = r0.u()
            if (r0 != 0) goto L11
        La:
            cn.bluemobi.dylan.photoview.library.d r0 = new cn.bluemobi.dylan.photoview.library.d
            r0.<init>(r1)
            r1.a = r0
        L11:
            android.widget.ImageView$ScaleType r0 = r1.f163b
            if (r0 == 0) goto L1b
            r1.setScaleType(r0)
            r0 = 0
            r1.f163b = r0
        L1b:
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public boolean d() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            boolean r0 = r0.d()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public boolean g(android.graphics.Matrix r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            boolean r2 = r0.g(r2)
            return r2
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public android.graphics.Matrix getDisplayMatrix() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            android.graphics.Matrix r0 = r0.getDisplayMatrix()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public android.graphics.RectF getDisplayRect() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            android.graphics.RectF r0 = r0.getDisplayRect()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public cn.bluemobi.dylan.photoview.library.c getIPhotoViewImplementation() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    @java.lang.Deprecated
    public float getMaxScale() {
            r1 = this;
            float r0 = r1.getMaximumScale()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public float getMaximumScale() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            float r0 = r0.getMaximumScale()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public float getMediumScale() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            float r0 = r0.getMediumScale()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    @java.lang.Deprecated
    public float getMidScale() {
            r1 = this;
            float r0 = r1.getMediumScale()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    @java.lang.Deprecated
    public float getMinScale() {
            r1 = this;
            float r0 = r1.getMinimumScale()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public float getMinimumScale() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            float r0 = r0.getMinimumScale()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public cn.bluemobi.dylan.photoview.library.d.f getOnPhotoTapListener() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            cn.bluemobi.dylan.photoview.library.d$f r0 = r0.getOnPhotoTapListener()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public cn.bluemobi.dylan.photoview.library.d.h getOnViewTapListener() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            cn.bluemobi.dylan.photoview.library.d$h r0 = r0.getOnViewTapListener()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public float getScale() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            float r0 = r0.getScale()
            return r0
    }

    @Override // android.widget.ImageView, cn.bluemobi.dylan.photoview.library.c
    public android.widget.ImageView.ScaleType getScaleType() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            android.widget.ImageView$ScaleType r0 = r0.getScaleType()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public android.graphics.Bitmap getVisibleRectangleBitmap() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            android.graphics.Bitmap r0 = r0.getVisibleRectangleBitmap()
            return r0
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void h(float r2, float r3, float r4) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.h(r2, r3, r4)
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
            r0 = this;
            r0.c()
            super.onAttachedToWindow()
            return
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.r()
            super.onDetachedFromWindow()
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setAllowParentInterceptOnEdge(boolean r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setAllowParentInterceptOnEdge(r2)
            return
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            super.setImageDrawable(r1)
            cn.bluemobi.dylan.photoview.library.d r1 = r0.a
            if (r1 == 0) goto La
            r1.update()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageResource(int r1) {
            r0 = this;
            super.setImageResource(r1)
            cn.bluemobi.dylan.photoview.library.d r1 = r0.a
            if (r1 == 0) goto La
            r1.update()
        La:
            return
    }

    @Override // android.widget.ImageView
    public void setImageURI(android.net.Uri r1) {
            r0 = this;
            super.setImageURI(r1)
            cn.bluemobi.dylan.photoview.library.d r1 = r0.a
            if (r1 == 0) goto La
            r1.update()
        La:
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    @java.lang.Deprecated
    public void setMaxScale(float r1) {
            r0 = this;
            r0.setMaximumScale(r1)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setMaximumScale(float r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setMaximumScale(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setMediumScale(float r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setMediumScale(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    @java.lang.Deprecated
    public void setMidScale(float r1) {
            r0 = this;
            r0.setMediumScale(r1)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    @java.lang.Deprecated
    public void setMinScale(float r1) {
            r0 = this;
            r0.setMinimumScale(r1)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setMinimumScale(float r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setMinimumScale(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setOnDoubleTapListener(r2)
            return
    }

    @Override // android.view.View, cn.bluemobi.dylan.photoview.library.c
    public void setOnLongClickListener(android.view.View.OnLongClickListener r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setOnLongClickListener(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setOnMatrixChangeListener(cn.bluemobi.dylan.photoview.library.d.e r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setOnMatrixChangeListener(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setOnPhotoTapListener(cn.bluemobi.dylan.photoview.library.d.f r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setOnPhotoTapListener(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setOnScaleChangeListener(cn.bluemobi.dylan.photoview.library.d.g r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setOnScaleChangeListener(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setOnViewTapListener(cn.bluemobi.dylan.photoview.library.d.h r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setOnViewTapListener(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setPhotoViewRotation(float r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setRotationTo(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setRotationBy(float r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setRotationBy(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setRotationTo(float r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setRotationTo(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setScale(float r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setScale(r2)
            return
    }

    @Override // android.widget.ImageView, cn.bluemobi.dylan.photoview.library.c
    public void setScaleType(android.widget.ImageView.ScaleType r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            if (r0 == 0) goto L8
            r0.setScaleType(r2)
            return
        L8:
            r1.f163b = r2
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setZoomTransitionDuration(int r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setZoomTransitionDuration(r2)
            return
    }

    @Override // cn.bluemobi.dylan.photoview.library.c
    public void setZoomable(boolean r2) {
            r1 = this;
            cn.bluemobi.dylan.photoview.library.d r0 = r1.a
            r0.setZoomable(r2)
            return
    }
}

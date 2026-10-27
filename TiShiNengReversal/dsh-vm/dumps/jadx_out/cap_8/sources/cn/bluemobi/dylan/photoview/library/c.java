package cn.bluemobi.dylan.photoview.library;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public interface c {
    public static final float d0 = 3.0f;
    public static final float e0 = 1.75f;
    public static final float f0 = 1.0f;
    public static final int g0 = 200;

    void a(float r1, float r2, float r3, boolean r4);

    void b(float r1, boolean r2);

    boolean d();

    boolean g(android.graphics.Matrix r1);

    android.graphics.Matrix getDisplayMatrix();

    android.graphics.RectF getDisplayRect();

    cn.bluemobi.dylan.photoview.library.c getIPhotoViewImplementation();

    @java.lang.Deprecated
    float getMaxScale();

    float getMaximumScale();

    float getMediumScale();

    @java.lang.Deprecated
    float getMidScale();

    @java.lang.Deprecated
    float getMinScale();

    float getMinimumScale();

    cn.bluemobi.dylan.photoview.library.d.f getOnPhotoTapListener();

    cn.bluemobi.dylan.photoview.library.d.h getOnViewTapListener();

    float getScale();

    android.widget.ImageView.ScaleType getScaleType();

    android.graphics.Bitmap getVisibleRectangleBitmap();

    void h(float r1, float r2, float r3);

    void setAllowParentInterceptOnEdge(boolean r1);

    @java.lang.Deprecated
    void setMaxScale(float r1);

    void setMaximumScale(float r1);

    void setMediumScale(float r1);

    @java.lang.Deprecated
    void setMidScale(float r1);

    @java.lang.Deprecated
    void setMinScale(float r1);

    void setMinimumScale(float r1);

    void setOnDoubleTapListener(android.view.GestureDetector.OnDoubleTapListener r1);

    void setOnLongClickListener(android.view.View.OnLongClickListener r1);

    void setOnMatrixChangeListener(cn.bluemobi.dylan.photoview.library.d.e r1);

    void setOnPhotoTapListener(cn.bluemobi.dylan.photoview.library.d.f r1);

    void setOnScaleChangeListener(cn.bluemobi.dylan.photoview.library.d.g r1);

    void setOnViewTapListener(cn.bluemobi.dylan.photoview.library.d.h r1);

    void setPhotoViewRotation(float r1);

    void setRotationBy(float r1);

    void setRotationTo(float r1);

    void setScale(float r1);

    void setScaleType(android.widget.ImageView.ScaleType r1);

    void setZoomTransitionDuration(int r1);

    void setZoomable(boolean r1);
}

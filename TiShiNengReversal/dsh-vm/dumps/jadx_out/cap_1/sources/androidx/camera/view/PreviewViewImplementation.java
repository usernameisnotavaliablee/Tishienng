package androidx.camera.view;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
abstract class PreviewViewImplementation {

    @androidx.annotation.NonNull
    android.widget.FrameLayout mParent;

    @androidx.annotation.NonNull
    private final androidx.camera.view.PreviewTransformation mPreviewTransform;

    @androidx.annotation.Nullable
    android.util.Size mResolution;
    private boolean mWasSurfaceProvided;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    interface OnSurfaceNotInUseListener {
        void onSurfaceNotInUse();
    }

    PreviewViewImplementation(@androidx.annotation.NonNull android.widget.FrameLayout r2, @androidx.annotation.NonNull androidx.camera.view.PreviewTransformation r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mWasSurfaceProvided = r0
            r1.mParent = r2
            r1.mPreviewTransform = r3
            return
    }

    @androidx.annotation.Nullable
    android.graphics.Bitmap getBitmap() {
            r5 = this;
            android.graphics.Bitmap r0 = r5.getPreviewBitmap()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            androidx.camera.view.PreviewTransformation r1 = r5.mPreviewTransform
            android.util.Size r2 = new android.util.Size
            android.widget.FrameLayout r3 = r5.mParent
            int r3 = r3.getWidth()
            android.widget.FrameLayout r4 = r5.mParent
            int r4 = r4.getHeight()
            r2.<init>(r3, r4)
            android.widget.FrameLayout r3 = r5.mParent
            int r3 = r3.getLayoutDirection()
            android.graphics.Bitmap r0 = r1.createTransformedBitmap(r0, r2, r3)
            return r0
    }

    @androidx.annotation.Nullable
    abstract android.view.View getPreview();

    @androidx.annotation.Nullable
    abstract android.graphics.Bitmap getPreviewBitmap();

    abstract void initializePreview();

    abstract void onAttachedToWindow();

    abstract void onDetachedFromWindow();

    void onSurfaceProvided() {
            r1 = this;
            r0 = 1
            r1.mWasSurfaceProvided = r0
            r1.redrawPreview()
            return
    }

    abstract void onSurfaceRequested(@androidx.annotation.NonNull androidx.camera.core.SurfaceRequest r1, @androidx.annotation.Nullable androidx.camera.view.PreviewViewImplementation.OnSurfaceNotInUseListener r2);

    void redrawPreview() {
            r5 = this;
            android.view.View r0 = r5.getPreview()
            if (r0 == 0) goto L27
            boolean r1 = r5.mWasSurfaceProvided
            if (r1 != 0) goto Lb
            goto L27
        Lb:
            androidx.camera.view.PreviewTransformation r1 = r5.mPreviewTransform
            android.util.Size r2 = new android.util.Size
            android.widget.FrameLayout r3 = r5.mParent
            int r3 = r3.getWidth()
            android.widget.FrameLayout r4 = r5.mParent
            int r4 = r4.getHeight()
            r2.<init>(r3, r4)
            android.widget.FrameLayout r3 = r5.mParent
            int r3 = r3.getLayoutDirection()
            r1.transformView(r2, r3, r0)
        L27:
            return
    }

    void setFrameUpdateListener(@androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull androidx.camera.view.PreviewView.OnFrameUpdateListener r2) {
            r0 = this;
            return
    }

    @androidx.annotation.NonNull
    abstract com.google.common.util.concurrent.ListenableFuture<java.lang.Void> waitForNextFrame();
}

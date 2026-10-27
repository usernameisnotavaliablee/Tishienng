package androidx.camera.view.transform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.camera.view.TransformExperimental
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class ImageProxyTransformFactory {
    private boolean mUsingCropRect;
    private boolean mUsingRotationDegrees;

    public ImageProxyTransformFactory() {
            r0 = this;
            r0.<init>()
            return
    }

    private android.graphics.RectF getCropRect(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r4) {
            r3 = this;
            boolean r0 = r3.mUsingCropRect
            if (r0 == 0) goto Le
            android.graphics.RectF r0 = new android.graphics.RectF
            android.graphics.Rect r4 = r4.getCropRect()
            r0.<init>(r4)
            return r0
        Le:
            android.graphics.RectF r0 = new android.graphics.RectF
            int r1 = r4.getWidth()
            float r1 = (float) r1
            int r4 = r4.getHeight()
            float r4 = (float) r4
            r2 = 0
            r0.<init>(r2, r2, r1, r4)
            return r0
    }

    static android.graphics.RectF getRotatedCropRect(android.graphics.RectF r2, int r3) {
            boolean r3 = androidx.camera.core.impl.utils.TransformUtils.is90or270(r3)
            r0 = 0
            if (r3 == 0) goto L15
            android.graphics.RectF r3 = new android.graphics.RectF
            float r1 = r2.height()
            float r2 = r2.width()
            r3.<init>(r0, r0, r1, r2)
            return r3
        L15:
            android.graphics.RectF r3 = new android.graphics.RectF
            float r1 = r2.width()
            float r2 = r2.height()
            r3.<init>(r0, r0, r1, r2)
            return r3
    }

    private int getRotationDegrees(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r2) {
            r1 = this;
            boolean r0 = r1.mUsingRotationDegrees
            if (r0 == 0) goto Ld
            androidx.camera.core.ImageInfo r2 = r2.getImageInfo()
            int r2 = r2.getRotationDegrees()
            return r2
        Ld:
            r2 = 0
            return r2
    }

    @androidx.annotation.NonNull
    public androidx.camera.view.transform.OutputTransform getOutputTransform(@androidx.annotation.NonNull androidx.camera.core.ImageProxy r4) {
            r3 = this;
            int r0 = r3.getRotationDegrees(r4)
            android.graphics.RectF r1 = r3.getCropRect(r4)
            android.graphics.RectF r2 = getRotatedCropRect(r1, r0)
            android.graphics.Matrix r0 = androidx.camera.core.impl.utils.TransformUtils.getRectToRect(r1, r2, r0)
            android.graphics.Rect r1 = r4.getCropRect()
            android.graphics.Matrix r1 = androidx.camera.core.impl.utils.TransformUtils.getNormalizedToBuffer(r1)
            r0.preConcat(r1)
            androidx.camera.view.transform.OutputTransform r1 = new androidx.camera.view.transform.OutputTransform
            android.graphics.Rect r4 = r4.getCropRect()
            android.util.Size r4 = androidx.camera.core.impl.utils.TransformUtils.rectToSize(r4)
            r1.<init>(r0, r4)
            return r1
    }

    public boolean isUsingCropRect() {
            r1 = this;
            boolean r0 = r1.mUsingCropRect
            return r0
    }

    public boolean isUsingRotationDegrees() {
            r1 = this;
            boolean r0 = r1.mUsingRotationDegrees
            return r0
    }

    public void setUsingCropRect(boolean r1) {
            r0 = this;
            r0.mUsingCropRect = r1
            return
    }

    public void setUsingRotationDegrees(boolean r1) {
            r0 = this;
            r0.mUsingRotationDegrees = r1
            return
    }
}

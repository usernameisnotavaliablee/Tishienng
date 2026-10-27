package androidx.camera.view.transform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
@androidx.camera.view.TransformExperimental
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class CoordinateTransform {
    private static final java.lang.String MISMATCH_MSG = "The source viewport (%s) does not match the target viewport (%s). Please make sure they are associated with the same Viewport.";
    private static final java.lang.String TAG = "CoordinateTransform";
    private final android.graphics.Matrix mMatrix;

    public CoordinateTransform(@androidx.annotation.NonNull androidx.camera.view.transform.OutputTransform r5, @androidx.annotation.NonNull androidx.camera.view.transform.OutputTransform r6) {
            r4 = this;
            r4.<init>()
            android.util.Size r0 = r5.getViewPortSize()
            android.util.Size r1 = r6.getViewPortSize()
            boolean r0 = androidx.camera.core.impl.utils.TransformUtils.isAspectRatioMatchingWithRoundingError(r0, r1)
            if (r0 != 0) goto L2d
            android.util.Size r0 = r5.getViewPortSize()
            android.util.Size r1 = r6.getViewPortSize()
            r2 = 2
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            java.lang.String r0 = "The source viewport (%s) does not match the target viewport (%s). Please make sure they are associated with the same Viewport."
            java.lang.String r0 = java.lang.String.format(r0, r2)
            java.lang.String r1 = "CoordinateTransform"
            androidx.camera.core.Logger.w(r1, r0)
        L2d:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            r4.mMatrix = r0
            android.graphics.Matrix r5 = r5.getMatrix()
            boolean r5 = r5.invert(r0)
            java.lang.String r1 = "The source transform cannot be inverted"
            androidx.core.util.Preconditions.checkState(r5, r1)
            android.graphics.Matrix r5 = r6.getMatrix()
            r0.postConcat(r5)
            return
    }

    public void mapPoint(@androidx.annotation.NonNull android.graphics.PointF r5) {
            r4 = this;
            float r0 = r5.x
            float r1 = r5.y
            r2 = 2
            float[] r2 = new float[r2]
            r3 = 0
            r2[r3] = r0
            r0 = 1
            r2[r0] = r1
            android.graphics.Matrix r1 = r4.mMatrix
            r1.mapPoints(r2)
            r1 = r2[r3]
            r5.x = r1
            r0 = r2[r0]
            r5.y = r0
            return
    }

    public void mapPoints(@androidx.annotation.NonNull float[] r2) {
            r1 = this;
            android.graphics.Matrix r0 = r1.mMatrix
            r0.mapPoints(r2)
            return
    }

    public void mapRect(@androidx.annotation.NonNull android.graphics.RectF r2) {
            r1 = this;
            android.graphics.Matrix r0 = r1.mMatrix
            r0.mapRect(r2)
            return
    }

    public void transform(@androidx.annotation.NonNull android.graphics.Matrix r2) {
            r1 = this;
            android.graphics.Matrix r0 = r1.mMatrix
            r2.set(r0)
            return
    }
}

package androidx.camera.core.impl.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class TransformUtils {
    public static final android.graphics.RectF NORMALIZED_RECT = null;

    static {
            android.graphics.RectF r0 = new android.graphics.RectF
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            r0.<init>(r1, r1, r2, r2)
            androidx.camera.core.impl.utils.TransformUtils.NORMALIZED_RECT = r0
            return
    }

    private TransformUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static android.graphics.Matrix getExifTransform(int r9, int r10, int r11) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            android.graphics.RectF r1 = new android.graphics.RectF
            float r10 = (float) r10
            float r11 = (float) r11
            r2 = 0
            r1.<init>(r2, r2, r10, r11)
            android.graphics.RectF r3 = androidx.camera.core.impl.utils.TransformUtils.NORMALIZED_RECT
            android.graphics.Matrix$ScaleToFit r4 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r3, r4)
            r5 = 1119092736(0x42b40000, float:90.0)
            r6 = 1132920832(0x43870000, float:270.0)
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = -1082130432(0xffffffffbf800000, float:-1.0)
            switch(r9) {
                case 2: goto L45;
                case 3: goto L3f;
                case 4: goto L3b;
                case 5: goto L2f;
                case 6: goto L2b;
                case 7: goto L24;
                case 8: goto L20;
                default: goto L1f;
            }
        L1f:
            goto L48
        L20:
            r0.postRotate(r6)
            goto L35
        L24:
            r0.postScale(r8, r7)
            r0.postRotate(r5)
            goto L35
        L2b:
            r0.postRotate(r5)
            goto L35
        L2f:
            r0.postScale(r8, r7)
            r0.postRotate(r6)
        L35:
            android.graphics.RectF r1 = new android.graphics.RectF
            r1.<init>(r2, r2, r11, r10)
            goto L48
        L3b:
            r0.postScale(r7, r8)
            goto L48
        L3f:
            r9 = 1127481344(0x43340000, float:180.0)
            r0.postRotate(r9)
            goto L48
        L45:
            r0.postScale(r8, r7)
        L48:
            android.graphics.Matrix r9 = new android.graphics.Matrix
            r9.<init>()
            r9.setRectToRect(r3, r1, r4)
            r0.postConcat(r9)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.graphics.Matrix getNormalizedToBuffer(@androidx.annotation.NonNull android.graphics.Rect r1) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r1)
            android.graphics.Matrix r1 = getNormalizedToBuffer(r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static android.graphics.Matrix getNormalizedToBuffer(@androidx.annotation.NonNull android.graphics.RectF r3) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            android.graphics.RectF r1 = androidx.camera.core.impl.utils.TransformUtils.NORMALIZED_RECT
            android.graphics.Matrix$ScaleToFit r2 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r1, r3, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.graphics.Matrix getRectToRect(@androidx.annotation.NonNull android.graphics.RectF r1, @androidx.annotation.NonNull android.graphics.RectF r2, int r3) {
            r0 = 0
            android.graphics.Matrix r1 = getRectToRect(r1, r2, r3, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static android.graphics.Matrix getRectToRect(@androidx.annotation.NonNull android.graphics.RectF r3, @androidx.annotation.NonNull android.graphics.RectF r4, int r5, boolean r6) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            android.graphics.RectF r1 = androidx.camera.core.impl.utils.TransformUtils.NORMALIZED_RECT
            android.graphics.Matrix$ScaleToFit r2 = android.graphics.Matrix.ScaleToFit.FILL
            r0.setRectToRect(r3, r1, r2)
            float r3 = (float) r5
            r0.postRotate(r3)
            if (r6 == 0) goto L19
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r5 = 1065353216(0x3f800000, float:1.0)
            r0.postScale(r3, r5)
        L19:
            android.graphics.Matrix r3 = getNormalizedToBuffer(r4)
            r0.postConcat(r3)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.util.Size getRotatedSize(@androidx.annotation.NonNull android.graphics.Rect r0, int r1) {
            android.util.Size r0 = rectToSize(r0)
            android.util.Size r0 = rotateSize(r0, r1)
            return r0
    }

    public static boolean hasCropping(@androidx.annotation.NonNull android.graphics.Rect r2, @androidx.annotation.NonNull android.util.Size r3) {
            int r0 = r2.left
            if (r0 != 0) goto L1f
            int r0 = r2.top
            if (r0 != 0) goto L1f
            int r0 = r2.width()
            int r1 = r3.getWidth()
            if (r0 != r1) goto L1f
            int r2 = r2.height()
            int r3 = r3.getHeight()
            if (r2 == r3) goto L1d
            goto L1f
        L1d:
            r2 = 0
            return r2
        L1f:
            r2 = 1
            return r2
    }

    public static boolean is90or270(int r3) {
            r0 = 90
            if (r3 == r0) goto L29
            r0 = 270(0x10e, float:3.78E-43)
            if (r3 != r0) goto L9
            goto L29
        L9:
            if (r3 == 0) goto L27
            r0 = 180(0xb4, float:2.52E-43)
            if (r3 != r0) goto L10
            goto L27
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid rotation degrees: "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L27:
            r3 = 0
            return r3
        L29:
            r3 = 1
            return r3
    }

    public static boolean isAspectRatioMatchingWithRoundingError(@androidx.annotation.NonNull android.util.Size r1, @androidx.annotation.NonNull android.util.Size r2) {
            r0 = 0
            boolean r1 = isAspectRatioMatchingWithRoundingError(r1, r0, r2, r0)
            return r1
    }

    public static boolean isAspectRatioMatchingWithRoundingError(@androidx.annotation.NonNull android.util.Size r3, boolean r4, @androidx.annotation.NonNull android.util.Size r5, boolean r6) {
            r0 = 1065353216(0x3f800000, float:1.0)
            if (r4 == 0) goto L11
            int r4 = r3.getWidth()
            float r4 = (float) r4
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r4 = r4 / r3
            r3 = r4
            goto L2c
        L11:
            int r4 = r3.getWidth()
            float r4 = (float) r4
            float r4 = r4 + r0
            int r1 = r3.getHeight()
            float r1 = (float) r1
            float r1 = r1 - r0
            float r4 = r4 / r1
            int r1 = r3.getWidth()
            float r1 = (float) r1
            float r1 = r1 - r0
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r3 = r3 + r0
            float r3 = r1 / r3
        L2c:
            if (r6 == 0) goto L3b
            int r6 = r5.getWidth()
            float r6 = (float) r6
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r6 = r6 / r5
            r5 = r6
            goto L59
        L3b:
            int r6 = r5.getWidth()
            float r6 = (float) r6
            float r6 = r6 + r0
            int r1 = r5.getHeight()
            float r1 = (float) r1
            float r1 = r1 - r0
            float r6 = r6 / r1
            int r1 = r5.getWidth()
            float r1 = (float) r1
            float r1 = r1 - r0
            int r5 = r5.getHeight()
            float r5 = (float) r5
            float r5 = r5 + r0
            float r5 = r1 / r5
            r2 = r6
            r6 = r5
            r5 = r2
        L59:
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L63
            int r3 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r3 < 0) goto L63
            r3 = 1
            return r3
        L63:
            r3 = 0
            return r3
    }

    public static float max(float r0, float r1, float r2, float r3) {
            float r0 = java.lang.Math.max(r0, r1)
            float r1 = java.lang.Math.max(r2, r3)
            float r0 = java.lang.Math.max(r0, r1)
            return r0
    }

    public static float min(float r0, float r1, float r2, float r3) {
            float r0 = java.lang.Math.min(r0, r1)
            float r1 = java.lang.Math.min(r2, r3)
            float r0 = java.lang.Math.min(r0, r1)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.util.Size rectToSize(@androidx.annotation.NonNull android.graphics.Rect r2) {
            android.util.Size r0 = new android.util.Size
            int r1 = r2.width()
            int r2 = r2.height()
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static java.lang.String rectToString(@androidx.annotation.NonNull android.graphics.Rect r5) {
            java.util.Locale r0 = java.util.Locale.US
            int r1 = r5.width()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            int r2 = r5.height()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r5
            r5 = 1
            r3[r5] = r1
            r5 = 2
            r3[r5] = r2
            java.lang.String r5 = "%s(%dx%d)"
            java.lang.String r5 = java.lang.String.format(r0, r5, r3)
            return r5
    }

    @androidx.annotation.NonNull
    public static float[] rectToVertices(@androidx.annotation.NonNull android.graphics.RectF r5) {
            float r0 = r5.left
            float r1 = r5.top
            float r2 = r5.right
            float r5 = r5.bottom
            r3 = 8
            float[] r3 = new float[r3]
            r4 = 0
            r3[r4] = r0
            r4 = 1
            r3[r4] = r1
            r4 = 2
            r3[r4] = r2
            r4 = 3
            r3[r4] = r1
            r1 = 4
            r3[r1] = r2
            r1 = 5
            r3[r1] = r5
            r1 = 6
            r3[r1] = r0
            r0 = 7
            r3[r0] = r5
            return r3
    }

    @androidx.annotation.NonNull
    public static android.util.Size reverseSize(@androidx.annotation.NonNull android.util.Size r2) {
            android.util.Size r0 = new android.util.Size
            int r1 = r2.getHeight()
            int r2 = r2.getWidth()
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.util.SizeF reverseSizeF(@androidx.annotation.NonNull android.util.SizeF r2) {
            android.util.SizeF r0 = new android.util.SizeF
            float r1 = r2.getHeight()
            float r2 = r2.getWidth()
            r0.<init>(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.graphics.RectF rotateRect(@androidx.annotation.NonNull android.graphics.RectF r3, int r4) {
            int r0 = r4 % 90
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid rotation degrees: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            int r4 = within360(r4)
            boolean r4 = is90or270(r4)
            if (r4 == 0) goto L34
            android.graphics.RectF r4 = new android.graphics.RectF
            float r0 = r3.height()
            float r3 = r3.width()
            r1 = 0
            r4.<init>(r1, r1, r0, r3)
            return r4
        L34:
            return r3
    }

    @androidx.annotation.NonNull
    public static android.util.Size rotateSize(@androidx.annotation.NonNull android.util.Size r3, int r4) {
            int r0 = r4 % 90
            if (r0 != 0) goto L6
            r0 = 1
            goto L7
        L6:
            r0 = 0
        L7:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid rotation degrees: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r1 = r1.toString()
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            int r4 = within360(r4)
            boolean r4 = is90or270(r4)
            if (r4 == 0) goto L29
            android.util.Size r3 = reverseSize(r3)
        L29:
            return r3
    }

    @androidx.annotation.NonNull
    public static android.graphics.Rect sizeToRect(@androidx.annotation.NonNull android.util.Size r1) {
            r0 = 0
            android.graphics.Rect r1 = sizeToRect(r1, r0, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static android.graphics.Rect sizeToRect(@androidx.annotation.NonNull android.util.Size r2, int r3, int r4) {
            android.graphics.Rect r0 = new android.graphics.Rect
            int r1 = r2.getWidth()
            int r1 = r1 + r3
            int r2 = r2.getHeight()
            int r2 = r2 + r4
            r0.<init>(r3, r4, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.graphics.RectF sizeToRectF(@androidx.annotation.NonNull android.util.Size r1) {
            r0 = 0
            android.graphics.RectF r1 = sizeToRectF(r1, r0, r0)
            return r1
    }

    @androidx.annotation.NonNull
    public static android.graphics.RectF sizeToRectF(@androidx.annotation.NonNull android.util.Size r4, int r5, int r6) {
            android.graphics.RectF r0 = new android.graphics.RectF
            float r1 = (float) r5
            float r2 = (float) r6
            int r3 = r4.getWidth()
            int r5 = r5 + r3
            float r5 = (float) r5
            int r4 = r4.getHeight()
            int r6 = r6 + r4
            float r4 = (float) r6
            r0.<init>(r1, r2, r5, r4)
            return r0
    }

    @androidx.annotation.NonNull
    public static float[] sizeToVertices(@androidx.annotation.NonNull android.util.Size r6) {
            int r0 = r6.getWidth()
            float r0 = (float) r0
            int r1 = r6.getWidth()
            float r1 = (float) r1
            int r2 = r6.getHeight()
            float r2 = (float) r2
            int r6 = r6.getHeight()
            float r6 = (float) r6
            r3 = 8
            float[] r3 = new float[r3]
            r4 = 0
            r5 = 0
            r3[r4] = r5
            r4 = 1
            r3[r4] = r5
            r4 = 2
            r3[r4] = r0
            r0 = 3
            r3[r0] = r5
            r0 = 4
            r3[r0] = r1
            r0 = 5
            r3[r0] = r2
            r0 = 6
            r3[r0] = r5
            r0 = 7
            r3[r0] = r6
            return r3
    }

    @androidx.annotation.NonNull
    public static android.graphics.Matrix updateSensorToBufferTransform(@androidx.annotation.NonNull android.graphics.Matrix r1, @androidx.annotation.NonNull android.graphics.Rect r2) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>(r1)
            int r1 = r2.left
            int r1 = -r1
            float r1 = (float) r1
            int r2 = r2.top
            int r2 = -r2
            float r2 = (float) r2
            r0.postTranslate(r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static android.graphics.RectF verticesToRect(@androidx.annotation.NonNull float[] r14) {
            android.graphics.RectF r0 = new android.graphics.RectF
            r1 = 0
            r2 = r14[r1]
            r3 = 2
            r4 = r14[r3]
            r5 = 4
            r6 = r14[r5]
            r7 = 6
            r8 = r14[r7]
            float r2 = min(r2, r4, r6, r8)
            r4 = 1
            r6 = r14[r4]
            r8 = 3
            r9 = r14[r8]
            r10 = 5
            r11 = r14[r10]
            r12 = 7
            r13 = r14[r12]
            float r6 = min(r6, r9, r11, r13)
            r1 = r14[r1]
            r3 = r14[r3]
            r5 = r14[r5]
            r7 = r14[r7]
            float r1 = max(r1, r3, r5, r7)
            r3 = r14[r4]
            r4 = r14[r8]
            r5 = r14[r10]
            r14 = r14[r12]
            float r14 = max(r3, r4, r5, r14)
            r0.<init>(r2, r6, r1, r14)
            return r0
    }

    public static int within360(int r0) {
            int r0 = r0 % 360
            int r0 = r0 + 360
            int r0 = r0 % 360
            return r0
    }
}

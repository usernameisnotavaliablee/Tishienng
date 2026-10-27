package androidx.camera.core.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RequiresApi(21)
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public class ViewPorts {
    private ViewPorts() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    public static java.util.Map<androidx.camera.core.UseCase, android.graphics.Rect> calculateViewPortRects(@androidx.annotation.NonNull android.graphics.Rect r9, boolean r10, @androidx.annotation.NonNull android.util.Rational r11, @androidx.annotation.IntRange(from = 0, to = 359) int r12, int r13, int r14, @androidx.annotation.NonNull java.util.Map<androidx.camera.core.UseCase, androidx.camera.core.impl.StreamSpec> r15) {
            int r0 = r9.width()
            if (r0 <= 0) goto Le
            int r0 = r9.height()
            if (r0 <= 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            java.lang.String r1 = "Cannot compute viewport crop rects zero sized sensor rect."
            androidx.core.util.Preconditions.checkArgument(r0, r1)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r9)
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2 = r9
            android.graphics.RectF r9 = new android.graphics.RectF
            r9.<init>(r2)
            java.util.Set r15 = r15.entrySet()
            java.util.Iterator r15 = r15.iterator()
        L2c:
            boolean r2 = r15.hasNext()
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r15.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            android.graphics.Matrix r3 = new android.graphics.Matrix
            r3.<init>()
            android.graphics.RectF r4 = new android.graphics.RectF
            java.lang.Object r5 = r2.getValue()
            androidx.camera.core.impl.StreamSpec r5 = (androidx.camera.core.impl.StreamSpec) r5
            android.util.Size r5 = r5.getResolution()
            int r5 = r5.getWidth()
            float r5 = (float) r5
            java.lang.Object r6 = r2.getValue()
            androidx.camera.core.impl.StreamSpec r6 = (androidx.camera.core.impl.StreamSpec) r6
            android.util.Size r6 = r6.getResolution()
            int r6 = r6.getHeight()
            float r6 = (float) r6
            r7 = 0
            r4.<init>(r7, r7, r5, r6)
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.CENTER
            r3.setRectToRect(r4, r0, r5)
            java.lang.Object r2 = r2.getKey()
            androidx.camera.core.UseCase r2 = (androidx.camera.core.UseCase) r2
            r1.put(r2, r3)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r3.mapRect(r2, r4)
            r9.intersect(r2)
            goto L2c
        L7b:
            android.util.Rational r11 = androidx.camera.core.internal.utils.ImageUtil.getRotatedAspectRatio(r12, r11)
            r8 = r12
            r12 = r10
            r10 = r11
            r11 = r13
            r13 = r14
            r14 = r8
            android.graphics.RectF r9 = getScaledRect(r9, r10, r11, r12, r13, r14)
            java.util.HashMap r10 = new java.util.HashMap
            r10.<init>()
            android.graphics.RectF r11 = new android.graphics.RectF
            r11.<init>()
            android.graphics.Matrix r12 = new android.graphics.Matrix
            r12.<init>()
            java.util.Set r13 = r1.entrySet()
            java.util.Iterator r13 = r13.iterator()
        La0:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto Lca
            java.lang.Object r14 = r13.next()
            java.util.Map$Entry r14 = (java.util.Map.Entry) r14
            java.lang.Object r15 = r14.getValue()
            android.graphics.Matrix r15 = (android.graphics.Matrix) r15
            r15.invert(r12)
            r12.mapRect(r11, r9)
            android.graphics.Rect r15 = new android.graphics.Rect
            r15.<init>()
            r11.round(r15)
            java.lang.Object r14 = r14.getKey()
            androidx.camera.core.UseCase r14 = (androidx.camera.core.UseCase) r14
            r10.put(r14, r15)
            goto La0
        Lca:
            return r10
    }

    private static android.graphics.RectF correctStartOrEnd(boolean r6, @androidx.annotation.IntRange(from = 0, to = 359) int r7, android.graphics.RectF r8, android.graphics.RectF r9) {
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L8
            if (r6 != 0) goto L8
            r2 = 1
            goto L9
        L8:
            r2 = 0
        L9:
            r3 = 90
            if (r7 != r3) goto L11
            if (r6 == 0) goto L11
            r4 = 1
            goto L12
        L11:
            r4 = 0
        L12:
            if (r2 != 0) goto L95
            if (r4 == 0) goto L18
            goto L95
        L18:
            if (r7 != 0) goto L1e
            if (r6 == 0) goto L1e
            r2 = 1
            goto L1f
        L1e:
            r2 = 0
        L1f:
            r4 = 270(0x10e, float:3.78E-43)
            if (r7 != r4) goto L27
            if (r6 != 0) goto L27
            r5 = 1
            goto L28
        L27:
            r5 = 0
        L28:
            if (r2 != 0) goto L8c
            if (r5 == 0) goto L2d
            goto L8c
        L2d:
            if (r7 != r3) goto L33
            if (r6 != 0) goto L33
            r2 = 1
            goto L34
        L33:
            r2 = 0
        L34:
            r3 = 180(0xb4, float:2.52E-43)
            if (r7 != r3) goto L3c
            if (r6 == 0) goto L3c
            r5 = 1
            goto L3d
        L3c:
            r5 = 0
        L3d:
            if (r2 != 0) goto L83
            if (r5 == 0) goto L42
            goto L83
        L42:
            if (r7 != r3) goto L48
            if (r6 != 0) goto L48
            r2 = 1
            goto L49
        L48:
            r2 = 0
        L49:
            if (r7 != r4) goto L4e
            if (r6 == 0) goto L4e
            r0 = 1
        L4e:
            if (r2 != 0) goto L72
            if (r0 == 0) goto L53
            goto L72
        L53:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            java.lang.String r0 = "Invalid argument: mirrored "
            r9.append(r0)
            r9.append(r6)
            java.lang.String r6 = " rotation "
            r9.append(r6)
            r9.append(r7)
            java.lang.String r6 = r9.toString()
            r8.<init>(r6)
            throw r8
        L72:
            float r6 = r8.centerY()
            android.graphics.RectF r6 = flipVertically(r9, r6)
            float r7 = r8.centerX()
            android.graphics.RectF r6 = flipHorizontally(r6, r7)
            return r6
        L83:
            float r6 = r8.centerY()
            android.graphics.RectF r6 = flipVertically(r9, r6)
            return r6
        L8c:
            float r6 = r8.centerX()
            android.graphics.RectF r6 = flipHorizontally(r9, r6)
            return r6
        L95:
            return r9
    }

    private static android.graphics.RectF flipHorizontally(android.graphics.RectF r4, float r5) {
            android.graphics.RectF r0 = new android.graphics.RectF
            float r1 = r4.right
            float r1 = flipX(r1, r5)
            float r2 = r4.top
            float r3 = r4.left
            float r5 = flipX(r3, r5)
            float r4 = r4.bottom
            r0.<init>(r1, r2, r5, r4)
            return r0
    }

    private static android.graphics.RectF flipVertically(android.graphics.RectF r4, float r5) {
            android.graphics.RectF r0 = new android.graphics.RectF
            float r1 = r4.left
            float r2 = r4.bottom
            float r2 = flipY(r2, r5)
            float r3 = r4.right
            float r4 = r4.top
            float r4 = flipY(r4, r5)
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    private static float flipX(float r0, float r1) {
            float r1 = r1 + r1
            float r1 = r1 - r0
            return r1
    }

    private static float flipY(float r0, float r1) {
            float r1 = r1 + r1
            float r1 = r1 - r0
            return r1
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"SwitchIntDef"})
    public static android.graphics.RectF getScaledRect(@androidx.annotation.NonNull android.graphics.RectF r4, @androidx.annotation.NonNull android.util.Rational r5, int r6, boolean r7, int r8, @androidx.annotation.IntRange(from = 0, to = 359) int r9) {
            r0 = 3
            if (r6 != r0) goto L4
            return r4
        L4:
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            android.graphics.RectF r1 = new android.graphics.RectF
            int r2 = r5.getNumerator()
            float r2 = (float) r2
            int r5 = r5.getDenominator()
            float r5 = (float) r5
            r3 = 0
            r1.<init>(r3, r3, r2, r5)
            if (r6 == 0) goto L44
            r5 = 1
            if (r6 == r5) goto L3e
            r5 = 2
            if (r6 != r5) goto L27
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.END
            r0.setRectToRect(r1, r4, r5)
            goto L49
        L27:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r7 = "Unexpected scale type: "
            r5.append(r7)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r4.<init>(r5)
            throw r4
        L3e:
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.CENTER
            r0.setRectToRect(r1, r4, r5)
            goto L49
        L44:
            android.graphics.Matrix$ScaleToFit r5 = android.graphics.Matrix.ScaleToFit.START
            r0.setRectToRect(r1, r4, r5)
        L49:
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            r0.mapRect(r5, r1)
            boolean r6 = shouldMirrorStartAndEnd(r7, r8)
            android.graphics.RectF r4 = correctStartOrEnd(r6, r9, r4, r5)
            return r4
    }

    private static boolean shouldMirrorStartAndEnd(boolean r1, int r2) {
            r0 = 1
            if (r2 != r0) goto L4
            goto L5
        L4:
            r0 = 0
        L5:
            r1 = r1 ^ r0
            return r1
    }
}

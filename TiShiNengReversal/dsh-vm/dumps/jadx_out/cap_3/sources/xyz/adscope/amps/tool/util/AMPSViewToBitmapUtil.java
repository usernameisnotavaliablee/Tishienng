package xyz.adscope.amps.tool.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSViewToBitmapUtil {
    private static final int DEFAULT_DIMENSION_THRESHOLD = 1920;
    private static final int DEFAULT_SCALE_SIZE = 2;
    private static final int DEFAULT_SIZE_THRESHOLD = 2073600;

    public AMPSViewToBitmapUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    public static /* synthetic */ void a(android.graphics.Bitmap r0, android.view.View r1, int[] r2, int r3, xyz.adscope.amps.tool.material.inner.OnBitmapCapturedListener r4, int r5) {
            if (r5 != 0) goto Lf
            android.graphics.Canvas r5 = new android.graphics.Canvas
            r5.<init>(r0)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            drawViewGroupWithoutSurfaceViews(r1, r5, r2, r3)
            r4.onBitmapCaptured(r0)
        Lf:
            return
    }

    public static /* synthetic */ void b(xyz.adscope.amps.tool.material.inner.OnBitmapCapturedListener r0, android.graphics.Bitmap r1, int r2) {
            if (r2 != 0) goto L5
            r0.onBitmapCaptured(r1)
        L5:
            return
    }

    private static void calculateHistogram(android.graphics.Bitmap r9, int[] r10) {
            int r0 = r9.getWidth()
            int r1 = r9.getHeight()
            int r2 = r0 * r1
            r3 = 0
            java.util.Arrays.fill(r10, r3)
            r4 = 0
        Lf:
            if (r4 >= r1) goto L40
            r5 = 0
        L12:
            if (r5 >= r0) goto L3d
            int r6 = r9.getPixel(r5, r4)
            int r7 = android.graphics.Color.red(r6)
            r8 = r10[r7]
            int r8 = r8 + 1
            r10[r7] = r8
            int r7 = android.graphics.Color.green(r6)
            int r7 = r7 + 256
            r8 = r10[r7]
            int r8 = r8 + 1
            r10[r7] = r8
            int r6 = android.graphics.Color.blue(r6)
            int r6 = r6 + 512
            r7 = r10[r6]
            int r7 = r7 + 1
            r10[r6] = r7
            int r5 = r5 + 1
            goto L12
        L3d:
            int r4 = r4 + 1
            goto Lf
        L40:
            int r9 = r10.length
            if (r3 >= r9) goto L4b
            r9 = r10[r3]
            int r9 = r9 / r2
            r10[r3] = r9
            int r3 = r3 + 1
            goto L40
        L4b:
            return
    }

    private static void drawViewGroupWithoutSurfaceViews(android.view.ViewGroup r8, android.graphics.Canvas r9, int[] r10, int r11) {
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.getChildCount()
            if (r1 >= r2) goto L59
            android.view.View r2 = r8.getChildAt(r1)
            boolean r3 = r2 instanceof android.view.SurfaceView
            if (r3 == 0) goto L11
            goto L56
        L11:
            boolean r3 = r2 instanceof android.view.ViewGroup
            if (r3 == 0) goto L22
            r3 = r2
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            android.view.SurfaceView r4 = findViewForSurfaceView(r3)
            if (r4 == 0) goto L22
            drawViewGroupWithoutSurfaceViews(r3, r9, r10, r11)
            goto L56
        L22:
            int r3 = r2.getVisibility()
            if (r3 != 0) goto L56
            r3 = 2
            int[] r3 = new int[r3]
            r2.getLocationInWindow(r3)
            r4 = r3[r0]
            r5 = r10[r0]
            int r4 = r4 - r5
            r5 = 1
            r3 = r3[r5]
            r5 = r10[r5]
            int r3 = r3 - r5
            android.graphics.Matrix r5 = new android.graphics.Matrix
            r5.<init>()
            r6 = 1065353216(0x3f800000, float:1.0)
            float r7 = (float) r11
            float r6 = r6 / r7
            r5.setScale(r6, r6)
            r9.setMatrix(r5)
            r9.save()
            float r4 = (float) r4
            float r3 = (float) r3
            r9.translate(r4, r3)
            r2.draw(r9)
            r9.restore()
        L56:
            int r1 = r1 + 1
            goto L2
        L59:
            return
    }

    public static android.view.SurfaceView findViewForSurfaceView(android.view.ViewGroup r3) {
            r0 = 0
        L1:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L20
            android.view.View r1 = r3.getChildAt(r0)
            boolean r2 = r1 instanceof android.view.SurfaceView
            if (r2 == 0) goto L12
            android.view.SurfaceView r1 = (android.view.SurfaceView) r1
            return r1
        L12:
            boolean r2 = r1 instanceof android.view.ViewGroup
            if (r2 == 0) goto L1d
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.SurfaceView r3 = findViewForSurfaceView(r1)
            return r3
        L1d:
            int r0 = r0 + 1
            goto L1
        L20:
            r3 = 0
            return r3
    }

    public static void getBitmapFromView(android.content.Context r11, android.view.View r12, xyz.adscope.amps.tool.material.inner.OnBitmapCapturedListener r13) {
            int r0 = r12.getWidth()     // Catch: java.lang.Exception -> Ld7
            int r1 = r12.getHeight()     // Catch: java.lang.Exception -> Ld7
            r2 = 0
            if (r0 <= 0) goto Ld
            if (r1 > 0) goto L20
        Ld:
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)     // Catch: java.lang.Exception -> Ld7
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r2)     // Catch: java.lang.Exception -> Ld7
            r12.measure(r0, r1)     // Catch: java.lang.Exception -> Ld7
            int r0 = r12.getWidth()     // Catch: java.lang.Exception -> Ld7
            int r1 = r12.getHeight()     // Catch: java.lang.Exception -> Ld7
        L20:
            if (r0 <= 0) goto Ld6
            if (r1 > 0) goto L26
            goto Ld6
        L26:
            r3 = 2073600(0x1fa400, float:2.905732E-39)
            r4 = 1920(0x780, float:2.69E-42)
            boolean r0 = shouldScaleView(r0, r1, r3, r4)     // Catch: java.lang.Exception -> Ld7
            r1 = 2
            r3 = 1
            if (r0 == 0) goto L35
            r8 = 2
            goto L36
        L35:
            r8 = 1
        L36:
            int r0 = r12.getMeasuredWidth()     // Catch: java.lang.Exception -> Ld7
            int r4 = r12.getMeasuredHeight()     // Catch: java.lang.Exception -> Ld7
            int r0 = r0 / r8
            int r0 = java.lang.Math.max(r3, r0)     // Catch: java.lang.Exception -> Ld7
            int r4 = r4 / r8
            int r4 = java.lang.Math.max(r3, r4)     // Catch: java.lang.Exception -> Ld7
            android.graphics.Bitmap$Config r5 = android.graphics.Bitmap.Config.RGB_565     // Catch: java.lang.Exception -> Ld7
            android.graphics.Bitmap r5 = android.graphics.Bitmap.createBitmap(r0, r4, r5)     // Catch: java.lang.Exception -> Ld7
            boolean r0 = r12 instanceof android.view.ViewGroup     // Catch: java.lang.Exception -> Ld7
            r10 = 0
            if (r0 == 0) goto L5b
            r0 = r12
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0     // Catch: java.lang.Exception -> Ld7
            android.view.SurfaceView r0 = findViewForSurfaceView(r0)     // Catch: java.lang.Exception -> Ld7
            goto L5c
        L5b:
            r0 = r10
        L5c:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Exception -> Ld7
            r6 = 26
            if (r4 < r6) goto Lba
            int[] r7 = new int[r1]     // Catch: java.lang.Exception -> Ld7
            r12.getLocationInWindow(r7)     // Catch: java.lang.Exception -> Ld7
            if (r0 == 0) goto L8b
            android.view.SurfaceHolder r1 = r0.getHolder()     // Catch: java.lang.Exception -> Ld7
            android.view.Surface r1 = r1.getSurface()     // Catch: java.lang.Exception -> Ld7
            boolean r1 = r1.isValid()     // Catch: java.lang.Exception -> Ld7
            if (r1 == 0) goto L8b
            xyz.adscope.amps.tool.util.c r4 = new xyz.adscope.amps.tool.util.c     // Catch: java.lang.Exception -> Ld7
            r6 = r12
            r9 = r13
            r4.<init>(r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Ld7
            android.os.Handler r11 = new android.os.Handler     // Catch: java.lang.Exception -> Ld7
            android.os.Looper r12 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> Ld7
            r11.<init>(r12)     // Catch: java.lang.Exception -> Ld7
            xyz.adscope.amps.tool.util.a.a(r0, r10, r5, r4, r11)     // Catch: java.lang.Exception -> Ld7
            return
        L8b:
            r6 = r12
            r9 = r13
            android.graphics.Rect r12 = new android.graphics.Rect     // Catch: java.lang.Exception -> Ld7
            r13 = r7[r2]     // Catch: java.lang.Exception -> Ld7
            r0 = r7[r3]     // Catch: java.lang.Exception -> Ld7
            int r1 = r6.getWidth()     // Catch: java.lang.Exception -> Ld7
            int r1 = r1 + r13
            r2 = r7[r3]     // Catch: java.lang.Exception -> Ld7
            int r3 = r6.getHeight()     // Catch: java.lang.Exception -> Ld7
            int r2 = r2 + r3
            r12.<init>(r13, r0, r1, r2)     // Catch: java.lang.Exception -> Ld7
            android.app.Activity r11 = (android.app.Activity) r11     // Catch: java.lang.Exception -> Ld7
            android.view.Window r11 = r11.getWindow()     // Catch: java.lang.Exception -> Ld7
            xyz.adscope.amps.tool.util.d r13 = new xyz.adscope.amps.tool.util.d     // Catch: java.lang.Exception -> Ld7
            r13.<init>(r9, r5)     // Catch: java.lang.Exception -> Ld7
            android.os.Handler r0 = new android.os.Handler     // Catch: java.lang.Exception -> Ld7
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch: java.lang.Exception -> Ld7
            r0.<init>(r1)     // Catch: java.lang.Exception -> Ld7
            xyz.adscope.amps.tool.util.b.a(r11, r12, r5, r13, r0)     // Catch: java.lang.Exception -> Ld7
            return
        Lba:
            r6 = r12
            r9 = r13
            android.graphics.Canvas r11 = new android.graphics.Canvas     // Catch: java.lang.Exception -> Ld7
            r11.<init>(r5)     // Catch: java.lang.Exception -> Ld7
            android.graphics.Matrix r12 = new android.graphics.Matrix     // Catch: java.lang.Exception -> Ld7
            r12.<init>()     // Catch: java.lang.Exception -> Ld7
            r13 = 1065353216(0x3f800000, float:1.0)
            float r0 = (float) r8     // Catch: java.lang.Exception -> Ld7
            float r13 = r13 / r0
            r12.setScale(r13, r13)     // Catch: java.lang.Exception -> Ld7
            r11.setMatrix(r12)     // Catch: java.lang.Exception -> Ld7
            r6.draw(r11)     // Catch: java.lang.Exception -> Ld7
            r9.onBitmapCaptured(r5)     // Catch: java.lang.Exception -> Ld7
        Ld6:
            return
        Ld7:
            r0 = move-exception
            r11 = r0
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r13 = "getBitmapFromView Exception Message:"
            r12.append(r13)
            java.lang.String r11 = r11.getMessage()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.String r12 = "amps_log_tag"
            xyz.adscope.common.tool.LogUtil.e(r12, r11)
            return
    }

    public static double histogramSimilarity(android.graphics.Bitmap r6, android.graphics.Bitmap r7) {
            r0 = 768(0x300, float:1.076E-42)
            int[] r1 = new int[r0]
            int[] r2 = new int[r0]
            calculateHistogram(r6, r1)
            calculateHistogram(r7, r2)
            r6 = 0
            r3 = 0
        Lf:
            if (r3 >= r0) goto L20
            r4 = r1[r3]
            r5 = r2[r3]
            int r4 = r4 * r5
            double r4 = (double) r4
            double r4 = java.lang.Math.sqrt(r4)
            double r6 = r6 + r4
            int r3 = r3 + 1
            goto Lf
        L20:
            r0 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r6 = r6 * r0
            return r6
    }

    public static java.io.File saveBitmapToFile(android.graphics.Bitmap r8, android.graphics.Bitmap.CompressFormat r9, int r10, java.lang.String r11, java.io.File r12) {
            boolean r0 = r12.exists()
            if (r0 != 0) goto L9
            r12.mkdirs()
        L9:
            java.io.File r0 = new java.io.File
            r0.<init>(r12, r11)
            r11 = 100
            r12 = 0
        L11:
            java.lang.String r1 = "字节"
            java.lang.String r2 = "amps_log_tag"
            r3 = 10
            if (r11 < r3) goto L90
            if (r12 != 0) goto L90
            boolean r3 = r0.exists()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            if (r3 == 0) goto L28
            r0.delete()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            goto L28
        L25:
            r9 = move-exception
            goto Lae
        L28:
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            r8.compress(r9, r11, r3)     // Catch: java.lang.Throwable -> L86
            r3.flush()     // Catch: java.lang.Throwable -> L86
            r3.close()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            long r3 = r0.length()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            int r5 = r10 * 1024
            long r5 = (long) r5     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L62
            r12 = 1
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            r5.<init>()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            java.lang.String r6 = "素材保存成功 | 质量: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            r5.append(r11)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            java.lang.String r6 = "% | 大小: "
            r5.append(r6)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            r5.append(r3)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            r5.append(r1)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            xyz.adscope.common.tool.LogUtil.i(r2, r1)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            goto L11
        L62:
            int r11 = r11 + (-20)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            r1.<init>()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            java.lang.String r5 = "文件过大("
            r1.append(r5)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            r1.append(r3)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            java.lang.String r3 = "字节)，重新压缩质量至: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            r1.append(r11)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            java.lang.String r3 = "%"
            r1.append(r3)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            xyz.adscope.common.tool.LogUtil.i(r2, r1)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            goto L11
        L86:
            r9 = move-exception
            r3.close()     // Catch: java.lang.Throwable -> L8b
            goto L8f
        L8b:
            r10 = move-exception
            r9.addSuppressed(r10)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
        L8f:
            throw r9     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
        L90:
            if (r12 != 0) goto Lb2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            r9.<init>()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            java.lang.String r10 = "压缩失败！最终文件仍然超过限制|大小："
            r9.append(r10)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            long r10 = r0.length()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            r9.append(r10)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            r9.append(r1)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            xyz.adscope.common.tool.LogUtil.e(r2, r9)     // Catch: java.lang.Throwable -> L25 java.io.IOException -> Lb2
            goto Lb2
        Lae:
            r8.recycle()
            throw r9
        Lb2:
            r8.recycle()
            if (r12 == 0) goto Lb8
            goto Lb9
        Lb8:
            r0 = 0
        Lb9:
            return r0
    }

    private static boolean shouldScaleView(int r3, int r4, int r5, int r6) {
            int r0 = r3 * r4
            r1 = 0
            r2 = 1
            if (r0 <= r5) goto L8
            r5 = 1
            goto L9
        L8:
            r5 = 0
        L9:
            if (r3 > r6) goto L10
            if (r4 <= r6) goto Le
            goto L10
        Le:
            r3 = 0
            goto L11
        L10:
            r3 = 1
        L11:
            if (r5 != 0) goto L17
            if (r3 == 0) goto L16
            goto L17
        L16:
            return r1
        L17:
            return r2
    }
}

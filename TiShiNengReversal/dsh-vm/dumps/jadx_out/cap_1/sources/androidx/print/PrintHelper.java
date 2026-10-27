package androidx.print;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class PrintHelper {

    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int COLOR_MODE_COLOR = 2;

    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int COLOR_MODE_MONOCHROME = 1;
    static final boolean IS_MIN_MARGINS_HANDLING_CORRECT = false;
    private static final java.lang.String LOG_TAG = "PrintHelper";
    private static final int MAX_PRINT_SIZE = 3500;
    public static final int ORIENTATION_LANDSCAPE = 1;
    public static final int ORIENTATION_PORTRAIT = 2;
    static final boolean PRINT_ACTIVITY_RESPECTS_ORIENTATION = false;
    public static final int SCALE_MODE_FILL = 2;
    public static final int SCALE_MODE_FIT = 1;
    int mColorMode;
    final android.content.Context mContext;
    android.graphics.BitmapFactory.Options mDecodeOptions;
    final java.lang.Object mLock;
    int mOrientation;
    int mScaleMode;


    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OnPrintFinishCallback {
        void onFinish();
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(19)
    private class PrintBitmapAdapter extends android.print.PrintDocumentAdapter {
        private android.print.PrintAttributes mAttributes;
        private final android.graphics.Bitmap mBitmap;
        private final androidx.print.PrintHelper.OnPrintFinishCallback mCallback;
        private final int mFittingMode;
        private final java.lang.String mJobName;
        final /* synthetic */ androidx.print.PrintHelper this$0;

        PrintBitmapAdapter(androidx.print.PrintHelper r1, java.lang.String r2, int r3, android.graphics.Bitmap r4, androidx.print.PrintHelper.OnPrintFinishCallback r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mJobName = r2
                r0.mFittingMode = r3
                r0.mBitmap = r4
                r0.mCallback = r5
                return
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
                r1 = this;
                androidx.print.PrintHelper$OnPrintFinishCallback r0 = r1.mCallback
                if (r0 == 0) goto L7
                r0.onFinish()
            L7:
                return
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(android.print.PrintAttributes r1, android.print.PrintAttributes r2, android.os.CancellationSignal r3, android.print.PrintDocumentAdapter.LayoutResultCallback r4, android.os.Bundle r5) {
                r0 = this;
                r0.mAttributes = r2
                android.print.PrintDocumentInfo$Builder r3 = new android.print.PrintDocumentInfo$Builder
                java.lang.String r5 = r0.mJobName
                r3.<init>(r5)
                r5 = 1
                android.print.PrintDocumentInfo$Builder r3 = r3.setContentType(r5)
                android.print.PrintDocumentInfo$Builder r3 = r3.setPageCount(r5)
                android.print.PrintDocumentInfo r3 = r3.build()
                boolean r1 = r2.equals(r1)
                r1 = r1 ^ r5
                r4.onLayoutFinished(r3, r1)
                return
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(android.print.PageRange[] r8, android.os.ParcelFileDescriptor r9, android.os.CancellationSignal r10, android.print.PrintDocumentAdapter.WriteResultCallback r11) {
                r7 = this;
                androidx.print.PrintHelper r0 = r7.this$0
                android.print.PrintAttributes r1 = r7.mAttributes
                int r2 = r7.mFittingMode
                android.graphics.Bitmap r3 = r7.mBitmap
                r4 = r9
                r5 = r10
                r6 = r11
                r0.writeBitmap(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @androidx.annotation.RequiresApi(19)
    private class PrintUriAdapter extends android.print.PrintDocumentAdapter {
        android.print.PrintAttributes mAttributes;
        android.graphics.Bitmap mBitmap;
        final androidx.print.PrintHelper.OnPrintFinishCallback mCallback;
        final int mFittingMode;
        final android.net.Uri mImageFile;
        final java.lang.String mJobName;
        android.os.AsyncTask<android.net.Uri, java.lang.Boolean, android.graphics.Bitmap> mLoadBitmap;
        final /* synthetic */ androidx.print.PrintHelper this$0;


        PrintUriAdapter(androidx.print.PrintHelper r1, java.lang.String r2, android.net.Uri r3, androidx.print.PrintHelper.OnPrintFinishCallback r4, int r5) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mJobName = r2
                r0.mImageFile = r3
                r0.mCallback = r4
                r0.mFittingMode = r5
                r1 = 0
                r0.mBitmap = r1
                return
        }

        void cancelLoad() {
                r4 = this;
                androidx.print.PrintHelper r0 = r4.this$0
                java.lang.Object r0 = r0.mLock
                monitor-enter(r0)
                androidx.print.PrintHelper r1 = r4.this$0     // Catch: java.lang.Throwable -> L15
                android.graphics.BitmapFactory$Options r1 = r1.mDecodeOptions     // Catch: java.lang.Throwable -> L15
                if (r1 == 0) goto L1c
                int r2 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L15
                r3 = 24
                if (r2 >= r3) goto L17
                r1.requestCancelDecode()     // Catch: java.lang.Throwable -> L15
                goto L17
            L15:
                r1 = move-exception
                goto L1e
            L17:
                androidx.print.PrintHelper r1 = r4.this$0     // Catch: java.lang.Throwable -> L15
                r2 = 0
                r1.mDecodeOptions = r2     // Catch: java.lang.Throwable -> L15
            L1c:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                return
            L1e:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L15
                throw r1
        }

        @Override // android.print.PrintDocumentAdapter
        public void onFinish() {
                r2 = this;
                super.onFinish()
                r2.cancelLoad()
                android.os.AsyncTask<android.net.Uri, java.lang.Boolean, android.graphics.Bitmap> r0 = r2.mLoadBitmap
                if (r0 == 0) goto Le
                r1 = 1
                r0.cancel(r1)
            Le:
                androidx.print.PrintHelper$OnPrintFinishCallback r0 = r2.mCallback
                if (r0 == 0) goto L15
                r0.onFinish()
            L15:
                android.graphics.Bitmap r0 = r2.mBitmap
                if (r0 == 0) goto L1f
                r0.recycle()
                r0 = 0
                r2.mBitmap = r0
            L1f:
                return
        }

        @Override // android.print.PrintDocumentAdapter
        public void onLayout(android.print.PrintAttributes r7, android.print.PrintAttributes r8, android.os.CancellationSignal r9, android.print.PrintDocumentAdapter.LayoutResultCallback r10, android.os.Bundle r11) {
                r6 = this;
                monitor-enter(r6)
                r6.mAttributes = r8     // Catch: java.lang.Throwable -> L43
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L43
                boolean r11 = r9.isCanceled()
                if (r11 == 0) goto Le
                r10.onLayoutCancelled()
                return
            Le:
                android.graphics.Bitmap r11 = r6.mBitmap
                if (r11 == 0) goto L2f
                android.print.PrintDocumentInfo$Builder r9 = new android.print.PrintDocumentInfo$Builder
                java.lang.String r11 = r6.mJobName
                r9.<init>(r11)
                r11 = 1
                android.print.PrintDocumentInfo$Builder r9 = r9.setContentType(r11)
                android.print.PrintDocumentInfo$Builder r9 = r9.setPageCount(r11)
                android.print.PrintDocumentInfo r9 = r9.build()
                boolean r7 = r8.equals(r7)
                r7 = r7 ^ r11
                r10.onLayoutFinished(r9, r7)
                return
            L2f:
                androidx.print.PrintHelper$PrintUriAdapter$1 r0 = new androidx.print.PrintHelper$PrintUriAdapter$1
                r1 = r6
                r4 = r7
                r3 = r8
                r2 = r9
                r5 = r10
                r0.<init>(r1, r2, r3, r4, r5)
                r7 = 0
                android.net.Uri[] r7 = new android.net.Uri[r7]
                android.os.AsyncTask r7 = r0.execute(r7)
                r1.mLoadBitmap = r7
                return
            L43:
                r0 = move-exception
                r1 = r6
            L45:
                r7 = r0
                monitor-exit(r6)     // Catch: java.lang.Throwable -> L48
                throw r7
            L48:
                r0 = move-exception
                goto L45
        }

        @Override // android.print.PrintDocumentAdapter
        public void onWrite(android.print.PageRange[] r8, android.os.ParcelFileDescriptor r9, android.os.CancellationSignal r10, android.print.PrintDocumentAdapter.WriteResultCallback r11) {
                r7 = this;
                androidx.print.PrintHelper r0 = r7.this$0
                android.print.PrintAttributes r1 = r7.mAttributes
                int r2 = r7.mFittingMode
                android.graphics.Bitmap r3 = r7.mBitmap
                r4 = r9
                r5 = r10
                r6 = r11
                r0.writeBitmap(r1, r2, r3, r4, r5, r6)
                return
        }
    }

    static {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r2 = 1
            r3 = 23
            if (r0 <= r3) goto La
            r4 = 1
            goto Lb
        La:
            r4 = 0
        Lb:
            androidx.print.PrintHelper.PRINT_ACTIVITY_RESPECTS_ORIENTATION = r4
            if (r0 == r3) goto L10
            r1 = 1
        L10:
            androidx.print.PrintHelper.IS_MIN_MARGINS_HANDLING_CORRECT = r1
            return
    }

    public PrintHelper(@androidx.annotation.NonNull android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mDecodeOptions = r0
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r1.mLock = r0
            r0 = 2
            r1.mScaleMode = r0
            r1.mColorMode = r0
            r0 = 1
            r1.mOrientation = r0
            r1.mContext = r2
            return
    }

    static android.graphics.Bitmap convertBitmapForColorMode(android.graphics.Bitmap r5, int r6) {
            r0 = 1
            if (r6 == r0) goto L4
            return r5
        L4:
            int r6 = r5.getWidth()
            int r0 = r5.getHeight()
            android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r6 = android.graphics.Bitmap.createBitmap(r6, r0, r1)
            android.graphics.Canvas r0 = new android.graphics.Canvas
            r0.<init>(r6)
            android.graphics.Paint r1 = new android.graphics.Paint
            r1.<init>()
            android.graphics.ColorMatrix r2 = new android.graphics.ColorMatrix
            r2.<init>()
            r3 = 0
            r2.setSaturation(r3)
            android.graphics.ColorMatrixColorFilter r4 = new android.graphics.ColorMatrixColorFilter
            r4.<init>(r2)
            r1.setColorFilter(r4)
            r0.drawBitmap(r5, r3, r3, r1)
            r5 = 0
            r0.setBitmap(r5)
            return r6
    }

    @androidx.annotation.RequiresApi(19)
    private static android.print.PrintAttributes.Builder copyAttributes(android.print.PrintAttributes r3) {
            android.print.PrintAttributes$Builder r0 = new android.print.PrintAttributes$Builder
            r0.<init>()
            android.print.PrintAttributes$MediaSize r1 = r3.getMediaSize()
            android.print.PrintAttributes$Builder r0 = r0.setMediaSize(r1)
            android.print.PrintAttributes$Resolution r1 = r3.getResolution()
            android.print.PrintAttributes$Builder r0 = r0.setResolution(r1)
            android.print.PrintAttributes$Margins r1 = r3.getMinMargins()
            android.print.PrintAttributes$Builder r0 = r0.setMinMargins(r1)
            int r1 = r3.getColorMode()
            if (r1 == 0) goto L2a
            int r1 = r3.getColorMode()
            r0.setColorMode(r1)
        L2a:
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 23
            if (r1 < r2) goto L3d
            int r1 = androidx.print.a.a(r3)
            if (r1 == 0) goto L3d
            int r3 = androidx.print.a.a(r3)
            androidx.print.b.a(r0, r3)
        L3d:
            return r0
    }

    static android.graphics.Matrix getMatrix(int r3, int r4, android.graphics.RectF r5, int r6) {
            android.graphics.Matrix r0 = new android.graphics.Matrix
            r0.<init>()
            float r1 = r5.width()
            float r3 = (float) r3
            float r1 = r1 / r3
            r2 = 2
            if (r6 != r2) goto L19
            float r6 = r5.height()
            float r2 = (float) r4
            float r6 = r6 / r2
            float r6 = java.lang.Math.max(r1, r6)
            goto L23
        L19:
            float r6 = r5.height()
            float r2 = (float) r4
            float r6 = r6 / r2
            float r6 = java.lang.Math.min(r1, r6)
        L23:
            r0.postScale(r6, r6)
            float r1 = r5.width()
            float r3 = r3 * r6
            float r1 = r1 - r3
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r1 / r3
            float r5 = r5.height()
            float r4 = (float) r4
            float r4 = r4 * r6
            float r5 = r5 - r4
            float r5 = r5 / r3
            r0.postTranslate(r1, r5)
            return r0
    }

    static boolean isPortrait(android.graphics.Bitmap r1) {
            int r0 = r1.getWidth()
            int r1 = r1.getHeight()
            if (r0 > r1) goto Lc
            r1 = 1
            return r1
        Lc:
            r1 = 0
            return r1
    }

    private android.graphics.Bitmap loadBitmap(android.net.Uri r3, android.graphics.BitmapFactory.Options r4) throws java.io.FileNotFoundException {
            r2 = this;
            if (r3 == 0) goto L23
            android.content.Context r0 = r2.mContext
            if (r0 == 0) goto L23
            r1 = 0
            android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L1c
            java.io.InputStream r3 = r0.openInputStream(r3)     // Catch: java.lang.Throwable -> L1c
            android.graphics.Bitmap r4 = android.graphics.BitmapFactory.decodeStream(r3, r1, r4)     // Catch: java.lang.Throwable -> L19
            if (r3 == 0) goto L18
            r3.close()     // Catch: java.io.IOException -> L18
        L18:
            return r4
        L19:
            r4 = move-exception
            r1 = r3
            goto L1d
        L1c:
            r4 = move-exception
        L1d:
            if (r1 == 0) goto L22
            r1.close()     // Catch: java.io.IOException -> L22
        L22:
            throw r4
        L23:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.String r4 = "bad argument to loadBitmap"
            r3.<init>(r4)
            throw r3
    }

    public static boolean systemSupportsPrint() {
            r0 = 1
            return r0
    }

    public int getColorMode() {
            r1 = this;
            int r0 = r1.mColorMode
            return r0
    }

    public int getOrientation() {
            r1 = this;
            int r0 = r1.mOrientation
            if (r0 != 0) goto L5
            r0 = 1
        L5:
            return r0
    }

    public int getScaleMode() {
            r1 = this;
            int r0 = r1.mScaleMode
            return r0
    }

    android.graphics.Bitmap loadConstrainedBitmap(android.net.Uri r8) throws java.io.FileNotFoundException {
            r7 = this;
            if (r8 == 0) goto L5f
            android.content.Context r0 = r7.mContext
            if (r0 == 0) goto L5f
            android.graphics.BitmapFactory$Options r0 = new android.graphics.BitmapFactory$Options
            r0.<init>()
            r1 = 1
            r0.inJustDecodeBounds = r1
            r7.loadBitmap(r8, r0)
            int r2 = r0.outWidth
            int r0 = r0.outHeight
            r3 = 0
            if (r2 <= 0) goto L5e
            if (r0 > 0) goto L1b
            goto L5e
        L1b:
            int r4 = java.lang.Math.max(r2, r0)
            r5 = 1
        L20:
            r6 = 3500(0xdac, float:4.905E-42)
            if (r4 <= r6) goto L29
            int r4 = r4 >>> 1
            int r5 = r5 << 1
            goto L20
        L29:
            if (r5 <= 0) goto L5e
            int r0 = java.lang.Math.min(r2, r0)
            int r0 = r0 / r5
            if (r0 > 0) goto L33
            goto L5e
        L33:
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L5b
            r2.<init>()     // Catch: java.lang.Throwable -> L5b
            r7.mDecodeOptions = r2     // Catch: java.lang.Throwable -> L5b
            r2.inMutable = r1     // Catch: java.lang.Throwable -> L5b
            r2.inSampleSize = r5     // Catch: java.lang.Throwable -> L5b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            android.graphics.Bitmap r8 = r7.loadBitmap(r8, r2)     // Catch: java.lang.Throwable -> L50
            java.lang.Object r0 = r7.mLock
            monitor-enter(r0)
            r7.mDecodeOptions = r3     // Catch: java.lang.Throwable -> L4d
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            return r8
        L4d:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L4d
            throw r8
        L50:
            r8 = move-exception
            java.lang.Object r1 = r7.mLock
            monitor-enter(r1)
            r7.mDecodeOptions = r3     // Catch: java.lang.Throwable -> L58
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r8
        L58:
            r8 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L58
            throw r8
        L5b:
            r8 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L5b
            throw r8
        L5e:
            return r3
        L5f:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "bad argument to getScaledBitmap"
            r8.<init>(r0)
            throw r8
    }

    public void printBitmap(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.graphics.Bitmap r3) {
            r1 = this;
            r0 = 0
            r1.printBitmap(r2, r3, r0)
            return
    }

    public void printBitmap(@androidx.annotation.NonNull java.lang.String r9, @androidx.annotation.NonNull android.graphics.Bitmap r10, @androidx.annotation.Nullable androidx.print.PrintHelper.OnPrintFinishCallback r11) {
            r8 = this;
            if (r10 != 0) goto L3
            return
        L3:
            android.content.Context r0 = r8.mContext
            java.lang.String r1 = "print"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.print.PrintManager r0 = (android.print.PrintManager) r0
            boolean r1 = isPortrait(r10)
            if (r1 == 0) goto L16
            android.print.PrintAttributes$MediaSize r1 = android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT
            goto L18
        L16:
            android.print.PrintAttributes$MediaSize r1 = android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE
        L18:
            android.print.PrintAttributes$Builder r2 = new android.print.PrintAttributes$Builder
            r2.<init>()
            android.print.PrintAttributes$Builder r1 = r2.setMediaSize(r1)
            int r2 = r8.mColorMode
            android.print.PrintAttributes$Builder r1 = r1.setColorMode(r2)
            android.print.PrintAttributes r1 = r1.build()
            androidx.print.PrintHelper$PrintBitmapAdapter r2 = new androidx.print.PrintHelper$PrintBitmapAdapter
            int r5 = r8.mScaleMode
            r3 = r8
            r4 = r9
            r6 = r10
            r7 = r11
            r2.<init>(r3, r4, r5, r6, r7)
            r0.print(r4, r2, r1)
            return
    }

    public void printBitmap(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull android.net.Uri r3) throws java.io.FileNotFoundException {
            r1 = this;
            r0 = 0
            r1.printBitmap(r2, r3, r0)
            return
    }

    public void printBitmap(@androidx.annotation.NonNull java.lang.String r7, @androidx.annotation.NonNull android.net.Uri r8, @androidx.annotation.Nullable androidx.print.PrintHelper.OnPrintFinishCallback r9) throws java.io.FileNotFoundException {
            r6 = this;
            androidx.print.PrintHelper$PrintUriAdapter r0 = new androidx.print.PrintHelper$PrintUriAdapter
            int r5 = r6.mScaleMode
            r1 = r6
            r2 = r7
            r3 = r8
            r4 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            android.content.Context r7 = r1.mContext
            java.lang.String r8 = "print"
            java.lang.Object r7 = r7.getSystemService(r8)
            android.print.PrintManager r7 = (android.print.PrintManager) r7
            android.print.PrintAttributes$Builder r8 = new android.print.PrintAttributes$Builder
            r8.<init>()
            int r9 = r1.mColorMode
            r8.setColorMode(r9)
            int r9 = r1.mOrientation
            r3 = 1
            if (r9 == r3) goto L30
            if (r9 != 0) goto L27
            goto L30
        L27:
            r3 = 2
            if (r9 != r3) goto L35
            android.print.PrintAttributes$MediaSize r9 = android.print.PrintAttributes.MediaSize.UNKNOWN_PORTRAIT
            r8.setMediaSize(r9)
            goto L35
        L30:
            android.print.PrintAttributes$MediaSize r9 = android.print.PrintAttributes.MediaSize.UNKNOWN_LANDSCAPE
            r8.setMediaSize(r9)
        L35:
            android.print.PrintAttributes r8 = r8.build()
            r7.print(r2, r0, r8)
            return
    }

    public void setColorMode(int r1) {
            r0 = this;
            r0.mColorMode = r1
            return
    }

    public void setOrientation(int r1) {
            r0 = this;
            r0.mOrientation = r1
            return
    }

    public void setScaleMode(int r1) {
            r0 = this;
            r0.mScaleMode = r1
            return
    }

    @androidx.annotation.RequiresApi(19)
    void writeBitmap(android.print.PrintAttributes r12, int r13, android.graphics.Bitmap r14, android.os.ParcelFileDescriptor r15, android.os.CancellationSignal r16, android.print.PrintDocumentAdapter.WriteResultCallback r17) {
            r11 = this;
            boolean r0 = androidx.print.PrintHelper.IS_MIN_MARGINS_HANDLING_CORRECT
            r1 = 0
            if (r0 == 0) goto L7
            r5 = r12
            goto L19
        L7:
            android.print.PrintAttributes$Builder r0 = copyAttributes(r12)
            android.print.PrintAttributes$Margins r2 = new android.print.PrintAttributes$Margins
            r2.<init>(r1, r1, r1, r1)
            android.print.PrintAttributes$Builder r0 = r0.setMinMargins(r2)
            android.print.PrintAttributes r0 = r0.build()
            r5 = r0
        L19:
            androidx.print.PrintHelper$1 r2 = new androidx.print.PrintHelper$1
            r3 = r11
            r7 = r12
            r8 = r13
            r6 = r14
            r9 = r15
            r4 = r16
            r10 = r17
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.Void[] r12 = new java.lang.Void[r1]
            r2.execute(r12)
            return
    }
}

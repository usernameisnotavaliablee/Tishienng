package cn.easyar.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class CameraDeviceCamera implements cn.easyar.engine.CameraDevice, android.hardware.Camera.PreviewCallback {
    private static final java.lang.String TAG = "EasyAR";
    private int mBufferCapacity;
    private java.util.concurrent.atomic.AtomicInteger mBufferSize;
    private volatile android.hardware.Camera mCameraDevice;
    private int mCameraDeviceType;
    private int mCameraIndex;
    private int mCameraOrientation;
    private cn.easyar.CameraParameters mCameraParameters;
    private int mCurrentFpsRange;
    private java.lang.Boolean mFlashTorchMode;
    private java.lang.Integer mFocusMode;
    private int mHeight;
    private final cn.easyar.FunctorOfVoidFromInputFrame mInputFrameHandler;
    private cn.easyar.Vec2I mSizeToSet;
    private boolean mStarted;
    private java.util.List<int[]> mSupportedPreviewFpsRanges;
    private java.util.List<android.hardware.Camera.Size> mSupportedPreviewSizes;
    private android.graphics.SurfaceTexture mSurfaceTexture;
    private int mWidth;


    public CameraDeviceCamera(android.content.Context r5, cn.easyar.FunctorOfVoidFromInputFrame r6) {
            r4 = this;
            r4.<init>()
            r5 = 8
            r4.mBufferCapacity = r5
            java.util.concurrent.atomic.AtomicInteger r0 = new java.util.concurrent.atomic.AtomicInteger
            r0.<init>(r5)
            r4.mBufferSize = r0
            r5 = -1
            r4.mCameraIndex = r5
            r0 = 0
            r4.mCameraDeviceType = r0
            r4.mCameraOrientation = r0
            r1 = 1280(0x500, float:1.794E-42)
            r4.mWidth = r1
            r2 = 960(0x3c0, float:1.345E-42)
            r4.mHeight = r2
            cn.easyar.Vec2I r3 = new cn.easyar.Vec2I
            r3.<init>(r1, r2)
            r4.mSizeToSet = r3
            r4.mCurrentFpsRange = r5
            r5 = 0
            r4.mFlashTorchMode = r5
            r4.mFocusMode = r5
            r4.mStarted = r0
            r4.mInputFrameHandler = r6
            cn.easyar.Vec2I r5 = new cn.easyar.Vec2I
            r6 = 640(0x280, float:8.97E-43)
            r1 = 480(0x1e0, float:6.73E-43)
            r5.<init>(r6, r1)
            cn.easyar.CameraParameters r5 = cn.easyar.CameraParameters.createWithDefaultIntrinsics(r5, r0, r0)
            r4.mCameraParameters = r5
            return
    }

    static /* synthetic */ java.lang.Integer access$000(cn.easyar.engine.CameraDeviceCamera r0) {
            java.lang.Integer r0 = r0.mFocusMode
            return r0
    }

    private android.hardware.Camera.Size getOptimalPreviewSize(int r8, int r9) {
            r7 = this;
            java.util.List<android.hardware.Camera$Size> r0 = r7.mSupportedPreviewSizes
            java.util.Iterator r0 = r0.iterator()
            r1 = 0
            r2 = 2139095039(0x7f7fffff, float:3.4028235E38)
        La:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L2e
            java.lang.Object r3 = r0.next()
            android.hardware.Camera$Size r3 = (android.hardware.Camera.Size) r3
            float r4 = (float) r8
            int r5 = r3.width
            float r5 = (float) r5
            float r4 = r7.getRatioError(r4, r5)
            float r5 = (float) r9
            int r6 = r3.height
            float r6 = (float) r6
            float r5 = r7.getRatioError(r5, r6)
            float r4 = r4 + r5
            int r5 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r5 >= 0) goto La
            r1 = r3
            r2 = r4
            goto La
        L2e:
            return r1
    }

    private float getRatioError(float r3, float r4) {
            r2 = this;
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.max(r4, r0)
            float r1 = r3 / r1
            float r1 = r1 - r0
            float r3 = java.lang.Math.max(r3, r0)
            float r4 = r4 / r3
            float r4 = r4 - r0
            float r1 = r1 * r1
            float r4 = r4 * r4
            float r1 = r1 + r4
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean autoFocus() {
            r3 = this;
            r0 = 0
            android.hardware.Camera r1 = r3.mCameraDevice     // Catch: java.lang.Exception -> Ld java.lang.RuntimeException -> L11
            cn.easyar.engine.CameraDeviceCamera$1 r2 = new cn.easyar.engine.CameraDeviceCamera$1     // Catch: java.lang.Exception -> Ld java.lang.RuntimeException -> L11
            r2.<init>(r3)     // Catch: java.lang.Exception -> Ld java.lang.RuntimeException -> L11
            r1.autoFocus(r2)     // Catch: java.lang.Exception -> Ld java.lang.RuntimeException -> L11
            r0 = 1
            return r0
        Ld:
            r1 = move-exception
            android.util.Log.getStackTraceString(r1)
        L11:
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public void close() {
            r2 = this;
            r2.stop()
            cn.easyar.CameraParameters r0 = r2.mCameraParameters
            r1 = 0
            if (r0 == 0) goto Ld
            r0.a()
            r2.mCameraParameters = r1
        Ld:
            android.graphics.SurfaceTexture r0 = r2.mSurfaceTexture
            if (r0 == 0) goto L16
            r0.release()
            r2.mSurfaceTexture = r1
        L16:
            return
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getBufferCapacity() {
            r1 = this;
            int r0 = r1.mBufferCapacity
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getCameraOrientation() {
            r1 = this;
            int r0 = r1.mCameraOrientation
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public cn.easyar.CameraParameters getCameraParameters() {
            r6 = this;
            cn.easyar.CameraParameters r0 = new cn.easyar.CameraParameters
            cn.easyar.CameraParameters r1 = r6.mCameraParameters
            cn.easyar.Vec2I r1 = r1.size()
            cn.easyar.CameraParameters r2 = r6.mCameraParameters
            cn.easyar.Vec2F r2 = r2.focalLength()
            cn.easyar.CameraParameters r3 = r6.mCameraParameters
            cn.easyar.Vec2F r3 = r3.principalPoint()
            cn.easyar.CameraParameters r4 = r6.mCameraParameters
            int r4 = r4.cameraDeviceType()
            cn.easyar.CameraParameters r5 = r6.mCameraParameters
            int r5 = r5.cameraOrientation()
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getFrameRateRange() {
            r1 = this;
            java.util.List<int[]> r0 = r1.mSupportedPreviewFpsRanges
            if (r0 != 0) goto L6
            r0 = -1
            return r0
        L6:
            int r0 = r1.mCurrentFpsRange
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getIndex() {
            r1 = this;
            int r0 = r1.mCameraIndex
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getNumSupportedFrameRateRange() {
            r1 = this;
            java.util.List<int[]> r0 = r1.mSupportedPreviewFpsRanges
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getNumSupportedSize() {
            r1 = this;
            java.util.List<android.hardware.Camera$Size> r0 = r1.mSupportedPreviewSizes
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.size()
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getSizeHeight() {
            r1 = this;
            int r0 = r1.mHeight
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getSizeWidth() {
            r1 = this;
            int r0 = r1.mWidth
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public float getSupportedFrameRateRangeLower(int r3) {
            r2 = this;
            java.util.List<int[]> r0 = r2.mSupportedPreviewFpsRanges
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r3 < 0) goto L1f
            int r0 = r0.size()
            if (r3 < r0) goto Lf
            goto L1f
        Lf:
            java.util.List<int[]> r0 = r2.mSupportedPreviewFpsRanges
            java.lang.Object r3 = r0.get(r3)
            int[] r3 = (int[]) r3
            r0 = 0
            r3 = r3[r0]
            float r3 = (float) r3
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r0
            return r3
        L1f:
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public float getSupportedFrameRateRangeUpper(int r3) {
            r2 = this;
            java.util.List<int[]> r0 = r2.mSupportedPreviewFpsRanges
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r3 < 0) goto L1f
            int r0 = r0.size()
            if (r3 < r0) goto Lf
            goto L1f
        Lf:
            java.util.List<int[]> r0 = r2.mSupportedPreviewFpsRanges
            java.lang.Object r3 = r0.get(r3)
            int[] r3 = (int[]) r3
            r0 = 1
            r3 = r3[r0]
            float r3 = (float) r3
            r0 = 1148846080(0x447a0000, float:1000.0)
            float r3 = r3 / r0
            return r3
        L1f:
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getSupportedSizeHeight(int r3) {
            r2 = this;
            java.util.List<android.hardware.Camera$Size> r0 = r2.mSupportedPreviewSizes
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r3 < 0) goto L1a
            int r0 = r0.size()
            if (r3 < r0) goto Lf
            goto L1a
        Lf:
            java.util.List<android.hardware.Camera$Size> r0 = r2.mSupportedPreviewSizes
            java.lang.Object r3 = r0.get(r3)
            android.hardware.Camera$Size r3 = (android.hardware.Camera.Size) r3
            int r3 = r3.height
            return r3
        L1a:
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getSupportedSizeWidth(int r3) {
            r2 = this;
            java.util.List<android.hardware.Camera$Size> r0 = r2.mSupportedPreviewSizes
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r3 < 0) goto L1a
            int r0 = r0.size()
            if (r3 < r0) goto Lf
            goto L1a
        Lf:
            java.util.List<android.hardware.Camera$Size> r0 = r2.mSupportedPreviewSizes
            java.lang.Object r3 = r0.get(r3)
            android.hardware.Camera$Size r3 = (android.hardware.Camera.Size) r3
            int r3 = r3.width
            return r3
        L1a:
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getType() {
            r1 = this;
            int r0 = r1.mCameraDeviceType
            return r0
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] r10, android.hardware.Camera r11) {
            r9 = this;
            if (r10 != 0) goto L3
            return
        L3:
            r0 = 0
            cn.easyar.Buffer r1 = cn.easyar.Buffer.k(r10)     // Catch: java.lang.Throwable -> L67
            cn.easyar.Image r2 = new cn.easyar.Image     // Catch: java.lang.Throwable -> L63
            int r3 = r9.mWidth     // Catch: java.lang.Throwable -> L63
            int r4 = r9.mHeight     // Catch: java.lang.Throwable -> L63
            r5 = 2
            r2.<init>(r1, r5, r3, r4)     // Catch: java.lang.Throwable -> L63
            long r3 = android.os.SystemClock.elapsedRealtimeNanos()     // Catch: java.lang.Throwable -> L60
            double r3 = (double) r3     // Catch: java.lang.Throwable -> L60
            r5 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r3 = r3 * r5
            cn.easyar.CameraParameters r5 = r9.mCameraParameters     // Catch: java.lang.Throwable -> L60
            cn.easyar.Vec2I r6 = new cn.easyar.Vec2I     // Catch: java.lang.Throwable -> L60
            int r7 = r9.mWidth     // Catch: java.lang.Throwable -> L60
            int r8 = r9.mHeight     // Catch: java.lang.Throwable -> L60
            r6.<init>(r7, r8)     // Catch: java.lang.Throwable -> L60
            cn.easyar.CameraParameters r5 = r5.getResized(r6)     // Catch: java.lang.Throwable -> L60
            cn.easyar.InputFrame r0 = cn.easyar.InputFrame.createWithImageAndCameraParametersAndTemporal(r2, r5, r3)     // Catch: java.lang.Throwable -> L5c
            cn.easyar.FunctorOfVoidFromInputFrame r3 = r9.mInputFrameHandler     // Catch: java.lang.Throwable -> L5c
            r3.invoke(r0)     // Catch: java.lang.Throwable -> L5c
            if (r5 == 0) goto L3b
            r5.a()
        L3b:
            if (r0 == 0) goto L40
            r0.a()
        L40:
            r2.a()
            if (r1 == 0) goto L48
            r1.a()
        L48:
            java.util.concurrent.atomic.AtomicInteger r0 = r9.mBufferSize
            int r0 = r0.get()
            int r1 = r9.mBufferCapacity
            if (r0 > r1) goto L56
            r11.addCallbackBuffer(r10)
            return
        L56:
            java.util.concurrent.atomic.AtomicInteger r10 = r9.mBufferSize
            r10.getAndDecrement()
            return
        L5c:
            r10 = move-exception
            r11 = r0
            r0 = r5
            goto L6b
        L60:
            r10 = move-exception
            r11 = r0
            goto L6b
        L63:
            r10 = move-exception
            r11 = r0
            r2 = r11
            goto L6b
        L67:
            r10 = move-exception
            r11 = r0
            r1 = r11
            r2 = r1
        L6b:
            if (r0 == 0) goto L70
            r0.a()
        L70:
            if (r11 == 0) goto L75
            r11.a()
        L75:
            if (r2 == 0) goto L7a
            r2.a()
        L7a:
            if (r1 == 0) goto L7f
            r1.a()
        L7f:
            throw r10
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean openWithIndex(int r8) {
            r7 = this;
            r0 = 0
            r7.close()     // Catch: java.lang.Exception -> L2b
            android.graphics.SurfaceTexture r1 = new android.graphics.SurfaceTexture     // Catch: java.lang.Exception -> L2b
            r1.<init>(r0)     // Catch: java.lang.Exception -> L2b
            r7.mSurfaceTexture = r1     // Catch: java.lang.Exception -> L2b
            android.hardware.Camera r1 = android.hardware.Camera.open(r8)     // Catch: java.lang.Exception -> L2b
            r7.mCameraDevice = r1     // Catch: java.lang.Exception -> L2b
            android.hardware.Camera r1 = r7.mCameraDevice     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto L107
            r7.mCameraIndex = r8     // Catch: java.lang.Exception -> L2b
            android.hardware.Camera$CameraInfo r8 = new android.hardware.Camera$CameraInfo     // Catch: java.lang.Exception -> L2b
            r8.<init>()     // Catch: java.lang.Exception -> L2b
            int r1 = r7.mCameraIndex     // Catch: java.lang.Exception -> L2b
            android.hardware.Camera.getCameraInfo(r1, r8)     // Catch: java.lang.Exception -> L2b
            r7.mCameraDeviceType = r0     // Catch: java.lang.Exception -> L2b
            int r1 = r8.facing     // Catch: java.lang.Exception -> L2b
            r2 = 1
            if (r1 != 0) goto L2e
            r7.mCameraDeviceType = r2     // Catch: java.lang.Exception -> L2b
            goto L33
        L2b:
            r8 = move-exception
            goto L108
        L2e:
            if (r1 != r2) goto L33
            r1 = 2
            r7.mCameraDeviceType = r1     // Catch: java.lang.Exception -> L2b
        L33:
            int r8 = r8.orientation     // Catch: java.lang.Exception -> L2b
            r7.mCameraOrientation = r8     // Catch: java.lang.Exception -> L2b
            cn.easyar.CameraParameters r8 = r7.mCameraParameters     // Catch: java.lang.Exception -> L2b
            if (r8 == 0) goto L3e
            r8.a()     // Catch: java.lang.Exception -> L2b
        L3e:
            cn.easyar.Vec2I r8 = new cn.easyar.Vec2I     // Catch: java.lang.Exception -> L2b
            int r1 = r7.mWidth     // Catch: java.lang.Exception -> L2b
            int r3 = r7.mHeight     // Catch: java.lang.Exception -> L2b
            r8.<init>(r1, r3)     // Catch: java.lang.Exception -> L2b
            int r1 = r7.mCameraDeviceType     // Catch: java.lang.Exception -> L2b
            int r3 = r7.mCameraOrientation     // Catch: java.lang.Exception -> L2b
            cn.easyar.CameraParameters r8 = cn.easyar.CameraParameters.createWithDefaultIntrinsics(r8, r1, r3)     // Catch: java.lang.Exception -> L2b
            r7.mCameraParameters = r8     // Catch: java.lang.Exception -> L2b
            android.hardware.Camera r8 = r7.mCameraDevice     // Catch: java.lang.Exception -> L2b
            android.hardware.Camera$Parameters r8 = r8.getParameters()     // Catch: java.lang.Exception -> L2b
            r1 = 17
            r8.setPreviewFormat(r1)     // Catch: java.lang.Exception -> L2b
            java.util.List r1 = r8.getSupportedPreviewSizes()     // Catch: java.lang.Exception -> L2b
            r7.mSupportedPreviewSizes = r1     // Catch: java.lang.Exception -> L2b
            java.util.List r1 = r8.getSupportedPreviewFpsRange()     // Catch: java.lang.Exception -> L2b
            r7.mSupportedPreviewFpsRanges = r1     // Catch: java.lang.Exception -> L2b
            int r3 = r7.mCurrentFpsRange     // Catch: java.lang.Exception -> L2b
            if (r3 < 0) goto L72
            int r1 = r1.size()     // Catch: java.lang.Exception -> L2b
            if (r3 < r1) goto Lb8
        L72:
            java.util.List<int[]> r1 = r7.mSupportedPreviewFpsRanges     // Catch: java.lang.Exception -> L2b
            int r1 = r1.size()     // Catch: java.lang.Exception -> L2b
            int r1 = r1 - r2
            r7.mCurrentFpsRange = r1     // Catch: java.lang.Exception -> L2b
            java.util.List<int[]> r1 = r7.mSupportedPreviewFpsRanges     // Catch: java.lang.Exception -> L2b
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Exception -> L2b
            r3 = 0
        L82:
            boolean r4 = r1.hasNext()     // Catch: java.lang.Exception -> L2b
            if (r4 == 0) goto L9d
            java.lang.Object r4 = r1.next()     // Catch: java.lang.Exception -> L2b
            int[] r4 = (int[]) r4     // Catch: java.lang.Exception -> L2b
            r5 = r4[r0]     // Catch: java.lang.Exception -> L2b
            r6 = 30000(0x7530, float:4.2039E-41)
            if (r5 != r6) goto L9a
            r4 = r4[r2]     // Catch: java.lang.Exception -> L2b
            if (r4 != r6) goto L9a
            r7.mCurrentFpsRange = r3     // Catch: java.lang.Exception -> L2b
        L9a:
            int r3 = r3 + 1
            goto L82
        L9d:
            java.util.List<int[]> r1 = r7.mSupportedPreviewFpsRanges     // Catch: java.lang.Exception -> L2b
            int r3 = r7.mCurrentFpsRange     // Catch: java.lang.Exception -> L2b
            java.lang.Object r1 = r1.get(r3)     // Catch: java.lang.Exception -> L2b
            int[] r1 = (int[]) r1     // Catch: java.lang.Exception -> L2b
            r1 = r1[r0]     // Catch: java.lang.Exception -> L2b
            java.util.List<int[]> r3 = r7.mSupportedPreviewFpsRanges     // Catch: java.lang.Exception -> L2b
            int r4 = r7.mCurrentFpsRange     // Catch: java.lang.Exception -> L2b
            java.lang.Object r3 = r3.get(r4)     // Catch: java.lang.Exception -> L2b
            int[] r3 = (int[]) r3     // Catch: java.lang.Exception -> L2b
            r3 = r3[r2]     // Catch: java.lang.Exception -> L2b
            r8.setPreviewFpsRange(r1, r3)     // Catch: java.lang.Exception -> L2b
        Lb8:
            cn.easyar.Vec2I r1 = r7.mSizeToSet     // Catch: java.lang.Exception -> L2b
            int[] r1 = r1.data     // Catch: java.lang.Exception -> L2b
            r3 = r1[r0]     // Catch: java.lang.Exception -> L2b
            r1 = r1[r2]     // Catch: java.lang.Exception -> L2b
            android.hardware.Camera$Size r1 = r7.getOptimalPreviewSize(r3, r1)     // Catch: java.lang.Exception -> L2b
            int r3 = r1.width     // Catch: java.lang.Exception -> L2b
            int r1 = r1.height     // Catch: java.lang.Exception -> L2b
            r8.setPreviewSize(r3, r1)     // Catch: java.lang.Exception -> L2b
            android.hardware.Camera r1 = r7.mCameraDevice     // Catch: java.lang.Exception -> L2b
            r1.setParameters(r8)     // Catch: java.lang.Exception -> L2b
            android.hardware.Camera r8 = r7.mCameraDevice     // Catch: java.lang.Exception -> L2b
            android.hardware.Camera$Parameters r8 = r8.getParameters()     // Catch: java.lang.Exception -> L2b
            android.hardware.Camera$Size r1 = r8.getPreviewSize()     // Catch: java.lang.Exception -> L2b
            int r3 = r1.width     // Catch: java.lang.Exception -> L2b
            r7.mWidth = r3     // Catch: java.lang.Exception -> L2b
            int r1 = r1.height     // Catch: java.lang.Exception -> L2b
            r7.mHeight = r1     // Catch: java.lang.Exception -> L2b
            cn.easyar.CameraParameters r1 = r7.mCameraParameters     // Catch: java.lang.Exception -> L2b
            if (r1 == 0) goto Le9
            r1.a()     // Catch: java.lang.Exception -> L2b
        Le9:
            cn.easyar.Vec2I r1 = new cn.easyar.Vec2I     // Catch: java.lang.Exception -> L2b
            int r3 = r7.mWidth     // Catch: java.lang.Exception -> L2b
            int r4 = r7.mHeight     // Catch: java.lang.Exception -> L2b
            r1.<init>(r3, r4)     // Catch: java.lang.Exception -> L2b
            int r3 = r7.mCameraDeviceType     // Catch: java.lang.Exception -> L2b
            int r4 = r7.mCameraOrientation     // Catch: java.lang.Exception -> L2b
            cn.easyar.CameraParameters r1 = cn.easyar.CameraParameters.createWithDefaultIntrinsics(r1, r3, r4)     // Catch: java.lang.Exception -> L2b
            r7.mCameraParameters = r1     // Catch: java.lang.Exception -> L2b
            android.hardware.Camera r1 = r7.mCameraDevice     // Catch: java.lang.Exception -> L2b
            r1.setParameters(r8)     // Catch: java.lang.Exception -> L2b
            int r8 = r7.mCurrentFpsRange     // Catch: java.lang.Exception -> L2b
            r7.setFrameRateRange(r8)     // Catch: java.lang.Exception -> L2b
            return r2
        L107:
            return r0
        L108:
            android.util.Log.getStackTraceString(r8)
            android.hardware.Camera r8 = r7.mCameraDevice
            if (r8 == 0) goto L117
            android.hardware.Camera r8 = r7.mCameraDevice     // Catch: java.lang.Exception -> L114
            r8.release()     // Catch: java.lang.Exception -> L114
        L114:
            r8 = 0
            r7.mCameraDevice = r8
        L117:
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean openWithSpecificType(int r7) {
            r6 = this;
            android.hardware.Camera$CameraInfo r0 = new android.hardware.Camera$CameraInfo
            r0.<init>()
            int r1 = android.hardware.Camera.getNumberOfCameras()
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r1) goto L32
            android.hardware.Camera.getCameraInfo(r3, r0)
            r4 = 1
            if (r7 != r4) goto L1c
            int r5 = r0.facing
            if (r5 != 0) goto L1c
            boolean r7 = r6.openWithIndex(r3)
            return r7
        L1c:
            r5 = 2
            if (r7 != r5) goto L28
            int r5 = r0.facing
            if (r5 != r4) goto L28
            boolean r7 = r6.openWithIndex(r3)
            return r7
        L28:
            if (r7 != 0) goto L2f
            boolean r7 = r6.openWithIndex(r3)
            return r7
        L2f:
            int r3 = r3 + 1
            goto Lb
        L32:
            return r2
    }

    public boolean ready() {
            r1 = this;
            android.hardware.Camera r0 = r1.mCameraDevice
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public void setBufferCapacity(int r5) {
            r4 = this;
            r4.mBufferCapacity = r5
            boolean r0 = r4.ready()
            if (r0 == 0) goto L2b
            java.util.concurrent.atomic.AtomicInteger r0 = r4.mBufferSize
            int r0 = r0.get()
        Le:
            if (r0 >= r5) goto L24
            android.hardware.Camera r1 = r4.mCameraDevice
            int r2 = r4.mWidth
            int r3 = r4.mHeight
            int r2 = r2 * r3
            int r2 = r2 * 3
            int r2 = r2 / 2
            byte[] r2 = new byte[r2]
            r1.addCallbackBuffer(r2)
            int r0 = r0 + 1
            goto Le
        L24:
            java.util.concurrent.atomic.AtomicInteger r5 = r4.mBufferSize
            int r0 = r4.mBufferCapacity
            r5.set(r0)
        L2b:
            return
    }

    @Override // cn.easyar.engine.CameraDevice
    public void setCameraParameters(cn.easyar.CameraParameters r8) {
            r7 = this;
            if (r8 != 0) goto L3
            return
        L3:
            cn.easyar.CameraParameters r0 = r7.mCameraParameters
            if (r0 == 0) goto La
            r0.a()
        La:
            cn.easyar.CameraParameters r1 = new cn.easyar.CameraParameters
            cn.easyar.Vec2I r2 = r8.size()
            cn.easyar.Vec2F r3 = r8.focalLength()
            cn.easyar.Vec2F r4 = r8.principalPoint()
            int r5 = r8.cameraDeviceType()
            int r6 = r8.cameraOrientation()
            r1.<init>(r2, r3, r4, r5, r6)
            r7.mCameraParameters = r1
            return
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean setFlashTorchMode(boolean r5) {
            r4 = this;
            boolean r0 = r4.ready()
            r1 = 0
            if (r0 != 0) goto Le
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r4.mFlashTorchMode = r5
            return r1
        Le:
            android.hardware.Camera r0 = r4.mCameraDevice     // Catch: java.lang.Exception -> L19
            android.hardware.Camera$Parameters r0 = r0.getParameters()     // Catch: java.lang.Exception -> L19
            if (r5 == 0) goto L1b
            java.lang.String r2 = "torch"
            goto L1d
        L19:
            r5 = move-exception
            goto L40
        L1b:
            java.lang.String r2 = "off"
        L1d:
            android.hardware.Camera r3 = r4.mCameraDevice     // Catch: java.lang.Exception -> L19
            android.hardware.Camera$Parameters r3 = r3.getParameters()     // Catch: java.lang.Exception -> L19
            java.util.List r3 = r3.getSupportedFlashModes()     // Catch: java.lang.Exception -> L19
            if (r3 == 0) goto L3f
            boolean r3 = r3.contains(r2)     // Catch: java.lang.Exception -> L19
            if (r3 == 0) goto L3f
            r0.setFlashMode(r2)     // Catch: java.lang.Exception -> L19
            android.hardware.Camera r2 = r4.mCameraDevice     // Catch: java.lang.Exception -> L19
            r2.setParameters(r0)     // Catch: java.lang.Exception -> L19
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch: java.lang.Exception -> L19
            r4.mFlashTorchMode = r5     // Catch: java.lang.Exception -> L19
            r5 = 1
            return r5
        L3f:
            return r1
        L40:
            android.util.Log.getStackTraceString(r5)
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean setFocusMode(int r9) {
            r8 = this;
            java.lang.String r0 = "auto"
            java.lang.String r1 = "continuous-video"
            java.lang.String r2 = "continuous-picture"
            java.lang.String r3 = "infinity"
            java.lang.String r4 = "macro"
            boolean r5 = r8.ready()
            r6 = 0
            if (r5 != 0) goto L18
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8.mFocusMode = r9
            return r6
        L18:
            android.hardware.Camera r5 = r8.mCameraDevice     // Catch: java.lang.Exception -> L38
            android.hardware.Camera$Parameters r5 = r5.getParameters()     // Catch: java.lang.Exception -> L38
            java.util.List r7 = r5.getSupportedFocusModes()     // Catch: java.lang.Exception -> L38
            if (r9 == 0) goto L5b
            r0 = 2
            if (r9 == r0) goto L46
            r0 = 3
            if (r9 == r0) goto L3b
            r0 = 4
            if (r9 == r0) goto L2e
            return r6
        L2e:
            boolean r0 = r7.contains(r4)     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L3a
            r5.setFocusMode(r4)     // Catch: java.lang.Exception -> L38
            goto L64
        L38:
            r9 = move-exception
            goto L72
        L3a:
            return r6
        L3b:
            boolean r0 = r7.contains(r3)     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L45
            r5.setFocusMode(r3)     // Catch: java.lang.Exception -> L38
            goto L64
        L45:
            return r6
        L46:
            boolean r0 = r7.contains(r2)     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L50
            r5.setFocusMode(r2)     // Catch: java.lang.Exception -> L38
            goto L64
        L50:
            boolean r0 = r7.contains(r1)     // Catch: java.lang.Exception -> L38
            if (r0 == 0) goto L5a
            r5.setFocusMode(r1)     // Catch: java.lang.Exception -> L38
            goto L64
        L5a:
            return r6
        L5b:
            boolean r1 = r7.contains(r0)     // Catch: java.lang.Exception -> L38
            if (r1 == 0) goto L71
            r5.setFocusMode(r0)     // Catch: java.lang.Exception -> L38
        L64:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Exception -> L38
            r8.mFocusMode = r9     // Catch: java.lang.Exception -> L38
            android.hardware.Camera r9 = r8.mCameraDevice     // Catch: java.lang.Exception -> L38
            r9.setParameters(r5)     // Catch: java.lang.Exception -> L38
            r9 = 1
            return r9
        L71:
            return r6
        L72:
            android.util.Log.getStackTraceString(r9)
            return r6
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean setFrameRateRange(int r5) {
            r4 = this;
            java.util.List<int[]> r0 = r4.mSupportedPreviewFpsRanges
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r5 < 0) goto L3d
            int r0 = r0.size()
            if (r5 < r0) goto Lf
            goto L3d
        Lf:
            r4.mCurrentFpsRange = r5
            android.hardware.Camera r5 = r4.mCameraDevice     // Catch: java.lang.Exception -> L39
            android.hardware.Camera$Parameters r5 = r5.getParameters()     // Catch: java.lang.Exception -> L39
            java.util.List<int[]> r0 = r4.mSupportedPreviewFpsRanges     // Catch: java.lang.Exception -> L39
            int r2 = r4.mCurrentFpsRange     // Catch: java.lang.Exception -> L39
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Exception -> L39
            int[] r0 = (int[]) r0     // Catch: java.lang.Exception -> L39
            r0 = r0[r1]     // Catch: java.lang.Exception -> L39
            java.util.List<int[]> r2 = r4.mSupportedPreviewFpsRanges     // Catch: java.lang.Exception -> L39
            int r3 = r4.mCurrentFpsRange     // Catch: java.lang.Exception -> L39
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Exception -> L39
            int[] r2 = (int[]) r2     // Catch: java.lang.Exception -> L39
            r3 = 1
            r2 = r2[r3]     // Catch: java.lang.Exception -> L39
            r5.setPreviewFpsRange(r0, r2)     // Catch: java.lang.Exception -> L39
            android.hardware.Camera r0 = r4.mCameraDevice     // Catch: java.lang.Exception -> L39
            r0.setParameters(r5)     // Catch: java.lang.Exception -> L39
            return r3
        L39:
            r5 = move-exception
            android.util.Log.getStackTraceString(r5)
        L3d:
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean setSize(int r2, int r3) {
            r1 = this;
            cn.easyar.Vec2I r0 = new cn.easyar.Vec2I
            r0.<init>(r2, r3)
            r1.mSizeToSet = r0
            boolean r2 = r1.ready()
            r3 = 0
            if (r2 != 0) goto Lf
            return r3
        Lf:
            boolean r2 = r1.mStarted     // Catch: java.lang.Exception -> L1a
            if (r2 == 0) goto L1c
            r1.close()     // Catch: java.lang.Exception -> L1a
            r1.start()     // Catch: java.lang.Exception -> L1a
            goto L1c
        L1a:
            r2 = move-exception
            goto L1e
        L1c:
            r2 = 1
            return r2
        L1e:
            android.util.Log.getStackTraceString(r2)
            return r3
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean start() {
            r5 = this;
            boolean r0 = r5.ready()
            r1 = 0
            if (r0 != 0) goto L10
            int r0 = r5.mCameraIndex
            boolean r0 = r5.openWithIndex(r0)
            if (r0 != 0) goto L10
            return r1
        L10:
            android.hardware.Camera r0 = r5.mCameraDevice     // Catch: java.lang.Exception -> L35
            android.graphics.SurfaceTexture r2 = r5.mSurfaceTexture     // Catch: java.lang.Exception -> L35
            r0.setPreviewTexture(r2)     // Catch: java.lang.Exception -> L35
            android.hardware.Camera r0 = r5.mCameraDevice     // Catch: java.lang.Exception -> L35
            r0.setPreviewCallbackWithBuffer(r5)     // Catch: java.lang.Exception -> L35
            r0 = 0
        L1d:
            int r2 = r5.mBufferCapacity     // Catch: java.lang.Exception -> L35
            if (r0 >= r2) goto L37
            android.hardware.Camera r2 = r5.mCameraDevice     // Catch: java.lang.Exception -> L35
            int r3 = r5.mWidth     // Catch: java.lang.Exception -> L35
            int r4 = r5.mHeight     // Catch: java.lang.Exception -> L35
            int r3 = r3 * r4
            int r3 = r3 * 3
            int r3 = r3 / 2
            byte[] r3 = new byte[r3]     // Catch: java.lang.Exception -> L35
            r2.addCallbackBuffer(r3)     // Catch: java.lang.Exception -> L35
            int r0 = r0 + 1
            goto L1d
        L35:
            r0 = move-exception
            goto L5b
        L37:
            java.util.concurrent.atomic.AtomicInteger r0 = r5.mBufferSize     // Catch: java.lang.Exception -> L35
            r0.set(r2)     // Catch: java.lang.Exception -> L35
            android.hardware.Camera r0 = r5.mCameraDevice     // Catch: java.lang.Exception -> L35
            r0.startPreview()     // Catch: java.lang.Exception -> L35
            java.lang.Boolean r0 = r5.mFlashTorchMode
            if (r0 == 0) goto L4c
            boolean r0 = r0.booleanValue()
            r5.setFlashTorchMode(r0)
        L4c:
            java.lang.Integer r0 = r5.mFocusMode
            if (r0 == 0) goto L57
            int r0 = r0.intValue()
            r5.setFocusMode(r0)
        L57:
            r0 = 1
            r5.mStarted = r0
            return r0
        L5b:
            android.util.Log.getStackTraceString(r0)
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public void stop() {
            r2 = this;
            boolean r0 = r2.ready()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 0
            r2.mStarted = r0
            android.hardware.Camera r0 = r2.mCameraDevice     // Catch: java.lang.Exception -> Lf
            r0.stopPreview()     // Catch: java.lang.Exception -> Lf
        Lf:
            r0 = 0
            android.hardware.Camera r1 = r2.mCameraDevice     // Catch: java.lang.Exception -> L15
            r1.setPreviewCallback(r0)     // Catch: java.lang.Exception -> L15
        L15:
            android.hardware.Camera r1 = r2.mCameraDevice     // Catch: java.lang.Exception -> L1a
            r1.release()     // Catch: java.lang.Exception -> L1a
        L1a:
            r2.mCameraDevice = r0
            return
    }
}

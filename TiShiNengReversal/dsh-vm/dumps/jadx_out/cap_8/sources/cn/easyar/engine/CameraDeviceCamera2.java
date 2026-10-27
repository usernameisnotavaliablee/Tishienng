package cn.easyar.engine;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(21)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class CameraDeviceCamera2 implements cn.easyar.engine.CameraDevice {
    private static final java.lang.String TAG = "EasyAR";
    private boolean firstOpen;
    private android.os.Handler mBackgroundHandler;
    private android.os.HandlerThread mBackgroundThread;
    private int mBufferCapacity;
    private cn.easyar.engine.CameraDeviceCamera2.ByteArrayPool mByteArrayPool;
    private android.graphics.Rect mCameraActiveSize;
    private android.hardware.camera2.CameraDevice mCameraDevice;
    private cn.easyar.engine.CameraDeviceCamera2.AutoResetEvent mCameraDeviceCloseSignal;
    private int mCameraDeviceType;
    private java.lang.String mCameraId;
    private int mCameraIndex;
    private int mCameraOrientation;
    private cn.easyar.CameraParameters mCameraParameters;
    private android.util.Size mCameraSize;
    private android.hardware.camera2.CameraCaptureSession mCaptureSession;
    private android.hardware.camera2.CameraCharacteristics mCharacteristics;
    private final android.content.Context mContext;
    private int mCurrentFocusMode;
    private int mCurrentFpsRange;
    private boolean mFlashEnabled;
    private boolean mFlashSupported;
    private android.media.ImageReader mImageReader;
    private final cn.easyar.FunctorOfVoidFromInputFrame mInputFrameHandler;
    private boolean mIsStarted;
    private boolean mIsTimeStampSourceRealTime;
    private boolean mIsTimeStampSystemRealTime;
    private long mL1;
    private android.util.Range<java.lang.Integer>[] mSupportedFpsRanges;
    private android.util.Size[] mSupportedSizes;
    private long mTimeStampOffset;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class AutoResetEvent {
        private java.util.concurrent.locks.Condition condition;
        private java.util.concurrent.locks.Lock lock;
        private boolean signaled;

        public AutoResetEvent() {
                r1 = this;
                r1.<init>()
                java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
                r0.<init>()
                r1.lock = r0
                java.util.concurrent.locks.Condition r0 = r0.newCondition()
                r1.condition = r0
                r0 = 0
                r1.signaled = r0
                return
        }

        public void set() {
                r2 = this;
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.lock()
                r0 = 1
                r2.signaled = r0     // Catch: java.lang.Throwable -> L13
                java.util.concurrent.locks.Condition r0 = r2.condition     // Catch: java.lang.Throwable -> L13
                r0.signal()     // Catch: java.lang.Throwable -> L13
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.unlock()
                return
            L13:
                r0 = move-exception
                java.util.concurrent.locks.Lock r1 = r2.lock
                r1.unlock()
                throw r0
        }

        public void waitOne() {
                r2 = this;
            L0:
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.lock()
                boolean r0 = r2.signaled     // Catch: java.lang.Throwable -> L12 java.lang.InterruptedException -> L19
                if (r0 == 0) goto L14
                r0 = 0
                r2.signaled = r0     // Catch: java.lang.Throwable -> L12 java.lang.InterruptedException -> L19
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.unlock()
                return
            L12:
                r0 = move-exception
                goto L1f
            L14:
                java.util.concurrent.locks.Condition r0 = r2.condition     // Catch: java.lang.Throwable -> L12 java.lang.InterruptedException -> L19
                r0.await()     // Catch: java.lang.Throwable -> L12 java.lang.InterruptedException -> L19
            L19:
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.unlock()
                goto L0
            L1f:
                java.util.concurrent.locks.Lock r1 = r2.lock
                r1.unlock()
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ByteArrayPair {
        public byte[] array;
        public cn.easyar.Buffer buffer;

        private ByteArrayPair() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ ByteArrayPair(cn.easyar.engine.CameraDeviceCamera2.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ByteArrayPool {
        private final int blockSize;
        private final int capacity;
        private final java.util.concurrent.locks.Lock lock;
        private final java.util.Queue<byte[]> queue;
        private int size;


        public ByteArrayPool(int r2, int r3) {
                r1 = this;
                r1.<init>()
                java.util.concurrent.locks.ReentrantLock r0 = new java.util.concurrent.locks.ReentrantLock
                r0.<init>()
                r1.lock = r0
                r1.blockSize = r2
                r1.capacity = r3
                java.util.LinkedList r2 = new java.util.LinkedList
                r2.<init>()
                r1.queue = r2
                return
        }

        static /* synthetic */ java.util.concurrent.locks.Lock access$1400(cn.easyar.engine.CameraDeviceCamera2.ByteArrayPool r0) {
                java.util.concurrent.locks.Lock r0 = r0.lock
                return r0
        }

        static /* synthetic */ int access$1500(cn.easyar.engine.CameraDeviceCamera2.ByteArrayPool r0) {
                int r0 = r0.size
                return r0
        }

        static /* synthetic */ int access$1520(cn.easyar.engine.CameraDeviceCamera2.ByteArrayPool r1, int r2) {
                int r0 = r1.size
                int r0 = r0 - r2
                r1.size = r0
                return r0
        }

        static /* synthetic */ int access$1600(cn.easyar.engine.CameraDeviceCamera2.ByteArrayPool r0) {
                int r0 = r0.capacity
                return r0
        }

        static /* synthetic */ java.util.Queue access$1700(cn.easyar.engine.CameraDeviceCamera2.ByteArrayPool r0) {
                java.util.Queue<byte[]> r0 = r0.queue
                return r0
        }

        public int getBlockSize() {
                r1 = this;
                int r0 = r1.blockSize
                return r0
        }

        public int getCapacity() {
                r1 = this;
                int r0 = r1.capacity
                return r0
        }

        public int getSize() {
                r2 = this;
                java.util.concurrent.locks.Lock r0 = r2.lock
                r0.lock()
                int r0 = r2.size     // Catch: java.lang.Throwable -> Ld
                java.util.concurrent.locks.Lock r1 = r2.lock
                r1.unlock()
                return r0
            Ld:
                r0 = move-exception
                java.util.concurrent.locks.Lock r1 = r2.lock
                r1.unlock()
                throw r0
        }

        public cn.easyar.engine.CameraDeviceCamera2.ByteArrayPair tryAcquire() {
                r6 = this;
                java.util.concurrent.locks.Lock r0 = r6.lock
                r0.lock()
                int r0 = r6.size     // Catch: java.lang.Throwable -> L40
                int r1 = r6.capacity     // Catch: java.lang.Throwable -> L40
                r2 = 0
                if (r0 < r1) goto L12
                java.util.concurrent.locks.Lock r0 = r6.lock
                r0.unlock()
                return r2
            L12:
                java.util.Queue<byte[]> r0 = r6.queue     // Catch: java.lang.Throwable -> L40
                java.lang.Object r0 = r0.poll()     // Catch: java.lang.Throwable -> L40
                byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L40
                int r1 = r6.size     // Catch: java.lang.Throwable -> L40
                r3 = 1
                int r1 = r1 + r3
                r6.size = r1     // Catch: java.lang.Throwable -> L40
                java.util.concurrent.locks.Lock r1 = r6.lock
                r1.unlock()
                if (r0 != 0) goto L2b
                int r0 = r6.blockSize
                byte[] r0 = new byte[r0]
            L2b:
                int r1 = r0.length
                cn.easyar.engine.CameraDeviceCamera2$ByteArrayPool$1 r4 = new cn.easyar.engine.CameraDeviceCamera2$ByteArrayPool$1
                r4.<init>(r6, r0)
                r5 = 0
                cn.easyar.Buffer r1 = cn.easyar.Buffer.wrapByteArray(r0, r5, r1, r3, r4)
                cn.easyar.engine.CameraDeviceCamera2$ByteArrayPair r3 = new cn.easyar.engine.CameraDeviceCamera2$ByteArrayPair
                r3.<init>(r2)
                r3.array = r0
                r3.buffer = r1
                return r3
            L40:
                r0 = move-exception
                java.util.concurrent.locks.Lock r1 = r6.lock
                r1.unlock()
                throw r0
        }
    }

    public CameraDeviceCamera2(android.content.Context r6, cn.easyar.FunctorOfVoidFromInputFrame r7) {
            r5 = this;
            r5.<init>()
            r0 = 8
            r5.mBufferCapacity = r0
            r0 = -1
            r5.mCameraIndex = r0
            r1 = 1
            r5.firstOpen = r1
            r2 = 0
            r5.mCameraDeviceType = r2
            r5.mCameraOrientation = r2
            r5.mIsTimeStampSourceRealTime = r1
            r5.mIsTimeStampSystemRealTime = r2
            r3 = 0
            r5.mTimeStampOffset = r3
            r5.mCurrentFpsRange = r0
            r5.mCurrentFocusMode = r2
            r5.mFlashSupported = r2
            r5.mFlashEnabled = r2
            r5.mIsStarted = r2
            r5.mContext = r6
            r5.mInputFrameHandler = r7
            cn.easyar.Vec2I r6 = new cn.easyar.Vec2I
            r7 = 640(0x280, float:8.97E-43)
            r0 = 480(0x1e0, float:6.73E-43)
            r6.<init>(r7, r0)
            cn.easyar.CameraParameters r6 = cn.easyar.CameraParameters.createWithDefaultIntrinsics(r6, r2, r2)
            r5.mCameraParameters = r6
            return
    }

    static /* synthetic */ android.hardware.camera2.CameraDevice access$002(cn.easyar.engine.CameraDeviceCamera2 r0, android.hardware.camera2.CameraDevice r1) {
            r0.mCameraDevice = r1
            return r1
    }

    static /* synthetic */ cn.easyar.engine.CameraDeviceCamera2.AutoResetEvent access$100(cn.easyar.engine.CameraDeviceCamera2 r0) {
            cn.easyar.engine.CameraDeviceCamera2$AutoResetEvent r0 = r0.mCameraDeviceCloseSignal
            return r0
    }

    static /* synthetic */ cn.easyar.FunctorOfVoidFromInputFrame access$1000(cn.easyar.engine.CameraDeviceCamera2 r0) {
            cn.easyar.FunctorOfVoidFromInputFrame r0 = r0.mInputFrameHandler
            return r0
    }

    static /* synthetic */ cn.easyar.engine.CameraDeviceCamera2.AutoResetEvent access$102(cn.easyar.engine.CameraDeviceCamera2 r0, cn.easyar.engine.CameraDeviceCamera2.AutoResetEvent r1) {
            r0.mCameraDeviceCloseSignal = r1
            return r1
    }

    static /* synthetic */ android.hardware.camera2.CameraCaptureSession access$1102(cn.easyar.engine.CameraDeviceCamera2 r0, android.hardware.camera2.CameraCaptureSession r1) {
            r0.mCaptureSession = r1
            return r1
    }

    static /* synthetic */ boolean access$1200(cn.easyar.engine.CameraDeviceCamera2 r0) {
            boolean r0 = r0.mIsTimeStampSourceRealTime
            return r0
    }

    static /* synthetic */ boolean access$1300(cn.easyar.engine.CameraDeviceCamera2 r0) {
            boolean r0 = r0.mIsTimeStampSystemRealTime
            return r0
    }

    static /* synthetic */ boolean access$1302(cn.easyar.engine.CameraDeviceCamera2 r0, boolean r1) {
            r0.mIsTimeStampSystemRealTime = r1
            return r1
    }

    static /* synthetic */ long access$200(java.nio.ByteBuffer r2) {
            long r0 = getDirectBufferAddress(r2)
            return r0
    }

    static /* synthetic */ int access$300(java.nio.ByteBuffer r0, java.nio.ByteBuffer r1, java.nio.ByteBuffer r2, long r3, long r5, long r7, int r9, int r10, int r11, int r12, int r13, int r14) {
            int r0 = checkPixelFormat(r0, r1, r2, r3, r5, r7, r9, r10, r11, r12, r13, r14)
            return r0
    }

    static /* synthetic */ cn.easyar.engine.CameraDeviceCamera2.ByteArrayPool access$400(cn.easyar.engine.CameraDeviceCamera2 r0) {
            cn.easyar.engine.CameraDeviceCamera2$ByteArrayPool r0 = r0.mByteArrayPool
            return r0
    }

    static /* synthetic */ cn.easyar.engine.CameraDeviceCamera2.ByteArrayPool access$402(cn.easyar.engine.CameraDeviceCamera2 r0, cn.easyar.engine.CameraDeviceCamera2.ByteArrayPool r1) {
            r0.mByteArrayPool = r1
            return r1
    }

    static /* synthetic */ int access$500(cn.easyar.engine.CameraDeviceCamera2 r0) {
            int r0 = r0.mBufferCapacity
            return r0
    }

    static /* synthetic */ void access$600(java.nio.ByteBuffer r0, java.nio.ByteBuffer r1, java.nio.ByteBuffer r2, int r3, int r4, int r5, byte[] r6) {
            fillImageBuffer(r0, r1, r2, r3, r4, r5, r6)
            return
    }

    static /* synthetic */ long access$700(cn.easyar.engine.CameraDeviceCamera2 r2) {
            long r0 = r2.mTimeStampOffset
            return r0
    }

    static /* synthetic */ long access$702(cn.easyar.engine.CameraDeviceCamera2 r0, long r1) {
            r0.mTimeStampOffset = r1
            return r1
    }

    static /* synthetic */ long access$800(cn.easyar.engine.CameraDeviceCamera2 r2) {
            long r0 = r2.mL1
            return r0
    }

    static /* synthetic */ long access$802(cn.easyar.engine.CameraDeviceCamera2 r0, long r1) {
            r0.mL1 = r1
            return r1
    }

    static /* synthetic */ cn.easyar.CameraParameters access$900(cn.easyar.engine.CameraDeviceCamera2 r0) {
            cn.easyar.CameraParameters r0 = r0.mCameraParameters
            return r0
    }

    private static int checkPixelFormat(java.nio.ByteBuffer r6, java.nio.ByteBuffer r7, java.nio.ByteBuffer r8, long r9, long r11, long r13, int r15, int r16, int r17, int r18, int r19, int r20) {
            r7 = r16
            r8 = r18
            r0 = r19
            r1 = 0
            r2 = 1
            if (r15 != r2) goto L49
            r3 = r17
            if (r7 != r3) goto L49
            r3 = r20
            if (r0 == r3) goto L13
            goto L49
        L13:
            r3 = 0
            int r5 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r5 == 0) goto L49
            int r9 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r9 == 0) goto L49
            int r9 = (r13 > r3 ? 1 : (r13 == r3 ? 0 : -1))
            if (r9 != 0) goto L22
            goto L49
        L22:
            r9 = 2
            if (r7 != r9) goto L38
            if (r8 == r0) goto L28
            return r1
        L28:
            r6 = 1
            long r2 = r11 + r6
            int r8 = (r2 > r13 ? 1 : (r2 == r13 ? 0 : -1))
            if (r8 != 0) goto L32
            r6 = 3
            return r6
        L32:
            long r6 = r6 + r13
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 != 0) goto L49
            return r9
        L38:
            if (r7 != r15) goto L49
            if (r7 != r2) goto L49
            int r6 = r0 * 2
            if (r8 == r6) goto L41
            return r1
        L41:
            int r6 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r6 >= 0) goto L47
            r6 = 4
            return r6
        L47:
            r6 = 5
            return r6
        L49:
            return r1
    }

    private static boolean contains(int[] r4, int r5) {
            int r0 = r4.length
            r1 = 0
            r2 = 0
        L3:
            if (r2 >= r0) goto Le
            r3 = r4[r2]
            if (r3 != r5) goto Lb
            r4 = 1
            return r4
        Lb:
            int r2 = r2 + 1
            goto L3
        Le:
            return r1
    }

    private static void copyBufferOrFillZero(java.nio.ByteBuffer r3, int r4, byte[] r5, int r6, int r7) {
            int r0 = r3.limit()
            r3.position(r4)
            int r1 = r4 + r7
            r2 = 0
            if (r1 > r0) goto L10
            r3.get(r5, r6, r7)
            goto L19
        L10:
            int r0 = r0 - r4
            r3.get(r5, r6, r0)
            int r0 = r0 + r6
            int r6 = r6 + r7
            java.util.Arrays.fill(r5, r0, r6, r2)
        L19:
            r3.position(r2)
            return
    }

    private static void fillImageBuffer(java.nio.ByteBuffer r2, java.nio.ByteBuffer r3, java.nio.ByteBuffer r4, int r5, int r6, int r7, byte[] r8) {
            int r5 = r5 * r6
            int r6 = r5 / 2
            r0 = 0
            copyBufferOrFillZero(r2, r0, r8, r0, r5)
            r2 = 3
            r1 = 1
            if (r7 != r2) goto L2d
            copyBufferOrFillZero(r3, r0, r8, r5, r6)
            int r2 = r3.limit()
            int r7 = r4.limit()
            if (r2 != r7) goto L50
            int r2 = r3.limit()
            if (r2 >= r6) goto L50
            int r2 = r4.limit()
            int r2 = r2 - r1
            int r3 = r3.limit()
            int r5 = r5 + r3
            copyBufferOrFillZero(r4, r2, r8, r5, r1)
            return
        L2d:
            r2 = 2
            if (r7 != r2) goto L51
            copyBufferOrFillZero(r4, r0, r8, r5, r6)
            int r2 = r3.limit()
            int r7 = r4.limit()
            if (r2 != r7) goto L50
            int r2 = r3.limit()
            if (r2 >= r6) goto L50
            int r2 = r3.limit()
            int r2 = r2 - r1
            int r4 = r4.limit()
            int r5 = r5 + r4
            copyBufferOrFillZero(r3, r2, r8, r5, r1)
        L50:
            return
        L51:
            r1 = 4
            if (r7 != r1) goto L5d
            int r6 = r6 / r2
            copyBufferOrFillZero(r3, r0, r8, r5, r6)
            int r5 = r5 + r6
            copyBufferOrFillZero(r4, r0, r8, r5, r6)
            return
        L5d:
            r1 = 5
            if (r7 != r1) goto L69
            int r6 = r6 / r2
            copyBufferOrFillZero(r4, r0, r8, r5, r6)
            int r5 = r5 + r6
            copyBufferOrFillZero(r3, r0, r8, r5, r6)
            return
        L69:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.String r3 = "NotSupported"
            r2.<init>(r3)
            throw r2
    }

    private static long getDirectBufferAddress(java.nio.ByteBuffer r4) {
            long r0 = cn.easyar.JniUtility.newJniGlobalPointer(r4)
            long r2 = cn.easyar.JniUtility.getDirectBufferAddress(r0)     // Catch: java.lang.Throwable -> Lc
            cn.easyar.JniUtility.deleteJniGlobalPointer(r0)
            return r2
        Lc:
            r4 = move-exception
            cn.easyar.JniUtility.deleteJniGlobalPointer(r0)
            throw r4
    }

    private android.util.Size getOptimalPreviewSize(int r10, int r11) {
            r9 = this;
            android.util.Size[] r0 = r9.mSupportedSizes
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            int r2 = r0.length
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r4 = 0
        Lb:
            if (r4 >= r2) goto L2d
            r5 = r0[r4]
            float r6 = (float) r10
            int r7 = r5.getWidth()
            float r7 = (float) r7
            float r6 = getRatioError(r6, r7)
            float r7 = (float) r11
            int r8 = r5.getHeight()
            float r8 = (float) r8
            float r7 = getRatioError(r7, r8)
            float r6 = r6 + r7
            int r7 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r7 >= 0) goto L2a
            r1 = r5
            r3 = r6
        L2a:
            int r4 = r4 + 1
            goto Lb
        L2d:
            return r1
    }

    private static float getRatioError(float r2, float r3) {
            r0 = 1065353216(0x3f800000, float:1.0)
            float r1 = java.lang.Math.max(r3, r0)
            float r1 = r2 / r1
            float r1 = r1 - r0
            float r2 = java.lang.Math.max(r2, r0)
            float r3 = r3 / r2
            float r3 = r3 - r0
            float r1 = r1 * r1
            float r3 = r3 * r3
            float r1 = r1 + r3
            return r1
    }

    private boolean runRequest() {
            r1 = this;
            r0 = 1
            boolean r0 = r1.runRequest(r0)
            return r0
    }

    private boolean runRequest(boolean r14) {
            r13 = this;
            r0 = 2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 1
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 0
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            android.hardware.camera2.CameraDevice r6 = r13.mCameraDevice
            if (r6 != 0) goto L14
            return r4
        L14:
            android.hardware.camera2.CameraCaptureSession r7 = r13.mCaptureSession
            if (r7 != 0) goto L19
            return r4
        L19:
            android.hardware.camera2.CaptureRequest$Builder r6 = r6.createCaptureRequest(r2)     // Catch: java.lang.Exception -> L18e android.hardware.camera2.CameraAccessException -> L193
            android.media.ImageReader r7 = r13.mImageReader
            android.view.Surface r7 = r7.getSurface()
            r6.addTarget(r7)
            android.graphics.Rect r7 = r13.mCameraActiveSize
            int r7 = r7.width()
            int r7 = r7 / 8
            double r7 = (double) r7
            double r7 = java.lang.Math.ceil(r7)
            long r7 = java.lang.Math.round(r7)
            int r8 = (int) r7
            int r8 = r8 * 8
            android.graphics.Rect r7 = r13.mCameraActiveSize
            int r7 = r7.height()
            int r7 = r7 / 8
            double r9 = (double) r7
            double r9 = java.lang.Math.ceil(r9)
            long r9 = java.lang.Math.round(r9)
            int r7 = (int) r9
            int r7 = r7 * 8
            android.graphics.Rect r9 = r13.mCameraActiveSize
            int r10 = r9.left
            int r9 = r9.width()
            int r9 = r9 - r8
            int r9 = r9 / r0
            int r10 = r10 + r9
            android.graphics.Rect r9 = r13.mCameraActiveSize
            int r11 = r9.top
            int r9 = r9.height()
            int r9 = r9 - r7
            int r9 = r9 / r0
            int r11 = r11 + r9
            int r8 = r8 + r10
            int r7 = r7 + r11
            android.hardware.camera2.CaptureRequest$Key r9 = android.hardware.camera2.CaptureRequest.SCALER_CROP_REGION
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>(r10, r11, r8, r7)
            r6.set(r9, r12)
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.CONTROL_AE_MODE
            r6.set(r7, r3)
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.STATISTICS_FACE_DETECT_MODE
            r6.set(r7, r5)
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE
            r6.set(r7, r5)
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE
            r6.set(r7, r5)
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE
            android.util.Range<java.lang.Integer>[] r8 = r13.mSupportedFpsRanges
            int r9 = r13.mCurrentFpsRange
            r8 = r8[r9]
            r6.set(r7, r8)
            boolean r7 = r13.mFlashEnabled
            if (r7 == 0) goto L98
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.FLASH_MODE
            r6.set(r7, r1)
        L98:
            android.hardware.camera2.CaptureRequest$Key r7 = android.hardware.camera2.CaptureRequest.CONTROL_MODE
            r6.set(r7, r3)
            int r7 = r13.mCurrentFocusMode
            if (r7 != 0) goto Laf
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r6.set(r0, r3)
            if (r14 != 0) goto L163
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r6.set(r0, r3)
            goto L163
        Laf:
            r8 = 3
            r9 = 4
            if (r7 != r0) goto Lee
            android.hardware.camera2.CameraCharacteristics r0 = r13.mCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r1 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES
            java.lang.Object r0 = r0.get(r1)
            int[] r0 = (int[]) r0
            boolean r0 = contains(r0, r9)
            if (r0 == 0) goto Lce
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
            r6.set(r0, r1)
            goto L163
        Lce:
            android.hardware.camera2.CameraCharacteristics r0 = r13.mCharacteristics
            java.lang.Object r0 = r0.get(r1)
            int[] r0 = (int[]) r0
            boolean r0 = contains(r0, r8)
            if (r0 == 0) goto Le7
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)
            r6.set(r0, r1)
            goto L163
        Le7:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r6.set(r0, r3)
            goto L163
        Lee:
            r0 = 0
            if (r7 != r8) goto L11c
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r6.set(r1, r5)
            android.hardware.camera2.CameraCharacteristics r1 = r13.mCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE
            java.lang.Object r1 = r1.get(r3)
            if (r1 == 0) goto L10d
            android.hardware.camera2.CameraCharacteristics r1 = r13.mCharacteristics
            java.lang.Object r1 = r1.get(r3)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L10e
        L10d:
            r1 = 0
        L10e:
            int r1 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r1 <= 0) goto L163
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.LENS_FOCUS_DISTANCE
            java.lang.Float r0 = java.lang.Float.valueOf(r0)
            r6.set(r1, r0)
            goto L163
        L11c:
            if (r7 != r9) goto L12b
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r6.set(r0, r1)
            if (r14 != 0) goto L163
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.CONTROL_AF_TRIGGER
            r6.set(r0, r3)
            goto L163
        L12b:
            r1 = 5
            if (r7 != r1) goto L18d
            android.hardware.camera2.CaptureRequest$Key r1 = android.hardware.camera2.CaptureRequest.CONTROL_AF_MODE
            r6.set(r1, r5)
            android.hardware.camera2.CameraCharacteristics r1 = r13.mCharacteristics
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE
            java.lang.Object r1 = r1.get(r3)
            if (r1 == 0) goto L14a
            android.hardware.camera2.CameraCharacteristics r1 = r13.mCharacteristics
            java.lang.Object r1 = r1.get(r3)
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L14b
        L14a:
            r1 = 0
        L14b:
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L163
            r0 = 1058642330(0x3f19999a, float:0.6)
            int r3 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r3 <= 0) goto L157
            goto L15a
        L157:
            r1 = 1058642330(0x3f19999a, float:0.6)
        L15a:
            android.hardware.camera2.CaptureRequest$Key r0 = android.hardware.camera2.CaptureRequest.LENS_FOCUS_DISTANCE
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r6.set(r0, r1)
        L163:
            cn.easyar.engine.CameraDeviceCamera2$4 r0 = new cn.easyar.engine.CameraDeviceCamera2$4     // Catch: java.lang.Exception -> L176 android.hardware.camera2.CameraAccessException -> L178
            r0.<init>(r13)     // Catch: java.lang.Exception -> L176 android.hardware.camera2.CameraAccessException -> L178
            if (r14 == 0) goto L17a
            android.hardware.camera2.CameraCaptureSession r14 = r13.mCaptureSession     // Catch: java.lang.Exception -> L176 android.hardware.camera2.CameraAccessException -> L178
            android.hardware.camera2.CaptureRequest r1 = r6.build()     // Catch: java.lang.Exception -> L176 android.hardware.camera2.CameraAccessException -> L178
            android.os.Handler r3 = r13.mBackgroundHandler     // Catch: java.lang.Exception -> L176 android.hardware.camera2.CameraAccessException -> L178
            r14.setRepeatingRequest(r1, r0, r3)     // Catch: java.lang.Exception -> L176 android.hardware.camera2.CameraAccessException -> L178
            goto L185
        L176:
            r14 = move-exception
            goto L186
        L178:
            r14 = move-exception
            goto L18a
        L17a:
            android.hardware.camera2.CameraCaptureSession r14 = r13.mCaptureSession     // Catch: java.lang.Exception -> L176 android.hardware.camera2.CameraAccessException -> L178
            android.hardware.camera2.CaptureRequest r1 = r6.build()     // Catch: java.lang.Exception -> L176 android.hardware.camera2.CameraAccessException -> L178
            android.os.Handler r3 = r13.mBackgroundHandler     // Catch: java.lang.Exception -> L176 android.hardware.camera2.CameraAccessException -> L178
            r14.capture(r1, r0, r3)     // Catch: java.lang.Exception -> L176 android.hardware.camera2.CameraAccessException -> L178
        L185:
            return r2
        L186:
            android.util.Log.getStackTraceString(r14)
            return r4
        L18a:
            android.util.Log.getStackTraceString(r14)
        L18d:
            return r4
        L18e:
            r14 = move-exception
            android.util.Log.getStackTraceString(r14)
            return r4
        L193:
            r14 = move-exception
            android.util.Log.getStackTraceString(r14)
            return r4
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean autoFocus() {
            r1 = this;
            r0 = 0
            r1.runRequest(r0)
            r0 = 1
            r1.runRequest(r0)
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public void close() {
            r1 = this;
            r1.stop()
            cn.easyar.CameraParameters r0 = r1.mCameraParameters
            if (r0 == 0) goto Ld
            r0.a()
            r0 = 0
            r1.mCameraParameters = r0
        Ld:
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
            android.util.Range<java.lang.Integer>[] r0 = r1.mSupportedFpsRanges
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
            android.util.Range<java.lang.Integer>[] r0 = r1.mSupportedFpsRanges
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.length
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getNumSupportedSize() {
            r1 = this;
            android.util.Size[] r0 = r1.mSupportedSizes
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.length
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getSizeHeight() {
            r1 = this;
            android.util.Size r0 = r1.mCameraSize
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getHeight()
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getSizeWidth() {
            r1 = this;
            android.util.Size r0 = r1.mCameraSize
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            int r0 = r0.getWidth()
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    public float getSupportedFrameRateRangeLower(int r4) {
            r3 = this;
            android.util.Range<java.lang.Integer>[] r0 = r3.mSupportedFpsRanges
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r4 < 0) goto L1a
            int r2 = r0.length
            if (r4 < r2) goto Lc
            goto L1a
        Lc:
            r4 = r0[r4]
            java.lang.Comparable r4 = r4.getLower()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            return r4
        L1a:
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public float getSupportedFrameRateRangeUpper(int r4) {
            r3 = this;
            android.util.Range<java.lang.Integer>[] r0 = r3.mSupportedFpsRanges
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r4 < 0) goto L1a
            int r2 = r0.length
            if (r4 < r2) goto Lc
            goto L1a
        Lc:
            r4 = r0[r4]
            java.lang.Comparable r4 = r4.getUpper()
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            float r4 = (float) r4
            return r4
        L1a:
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getSupportedSizeHeight(int r3) {
            r2 = this;
            android.util.Size[] r0 = r2.mSupportedSizes
            if (r0 == 0) goto L11
            if (r3 < 0) goto L11
            int r1 = r0.length
            if (r3 < r1) goto La
            goto L11
        La:
            r3 = r0[r3]
            int r3 = r3.getHeight()
            return r3
        L11:
            r3 = 0
            return r3
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getSupportedSizeWidth(int r3) {
            r2 = this;
            android.util.Size[] r0 = r2.mSupportedSizes
            if (r0 == 0) goto L11
            if (r3 < 0) goto L11
            int r1 = r0.length
            if (r3 < r1) goto La
            goto L11
        La:
            r3 = r0[r3]
            int r3 = r3.getWidth()
            return r3
        L11:
            r3 = 0
            return r3
    }

    @Override // cn.easyar.engine.CameraDevice
    public int getType() {
            r1 = this;
            int r0 = r1.mCameraDeviceType
            return r0
    }

    @Override // cn.easyar.engine.CameraDevice
    @android.annotation.SuppressLint({"MissingPermission"})
    public boolean openWithIndex(int r10) {
            r9 = this;
            r9.close()
            android.content.Context r0 = r9.mContext     // Catch: java.lang.Throwable -> L48
            java.lang.String r1 = "camera"
            java.lang.Object r0 = r0.getSystemService(r1)     // Catch: java.lang.Throwable -> L48
            android.hardware.camera2.CameraManager r0 = (android.hardware.camera2.CameraManager) r0     // Catch: java.lang.Throwable -> L48
            r1 = 0
            if (r0 != 0) goto L14
            r9.close()
            return r1
        L14:
            java.lang.String[] r2 = r0.getCameraIdList()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L156 android.hardware.camera2.CameraAccessException -> L158
            if (r10 < 0) goto L15a
            int r3 = r2.length     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L156 android.hardware.camera2.CameraAccessException -> L158
            if (r10 < r3) goto L1f
            goto L15a
        L1f:
            r2 = r2[r10]     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L156 android.hardware.camera2.CameraAccessException -> L158
            android.hardware.camera2.CameraCharacteristics r3 = r0.getCameraCharacteristics(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L156 android.hardware.camera2.CameraAccessException -> L158
            r9.mCameraId = r2     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L156 android.hardware.camera2.CameraAccessException -> L158
            r9.mCameraIndex = r10     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L156 android.hardware.camera2.CameraAccessException -> L158
            r9.mCharacteristics = r3     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L156 android.hardware.camera2.CameraAccessException -> L158
            android.hardware.camera2.CameraCharacteristics$Key r10 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_TIMESTAMP_SOURCE     // Catch: java.lang.Throwable -> L48
            java.lang.Object r10 = r3.get(r10)     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> L48
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L48
            r2 = 1
            if (r10 != r2) goto L3c
            r10 = 1
            goto L3d
        L3c:
            r10 = 0
        L3d:
            r9.mIsTimeStampSourceRealTime = r10     // Catch: java.lang.Throwable -> L48
            boolean r3 = r9.firstOpen     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L4b
            if (r10 != 0) goto L4b
            r9.firstOpen = r1     // Catch: java.lang.Throwable -> L48
            goto L4b
        L48:
            r10 = move-exception
            goto L16c
        L4b:
            android.hardware.camera2.CameraCharacteristics r10 = r9.mCharacteristics     // Catch: java.lang.Throwable -> L48
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch: java.lang.Throwable -> L48
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> L48
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L48
            r9.mCameraDeviceType = r1     // Catch: java.lang.Throwable -> L48
            if (r10 != r2) goto L60
            r9.mCameraDeviceType = r2     // Catch: java.lang.Throwable -> L48
            goto L65
        L60:
            if (r10 != 0) goto L65
            r10 = 2
            r9.mCameraDeviceType = r10     // Catch: java.lang.Throwable -> L48
        L65:
            android.hardware.camera2.CameraCharacteristics r10 = r9.mCharacteristics     // Catch: java.lang.Throwable -> L48
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SENSOR_ORIENTATION     // Catch: java.lang.Throwable -> L48
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r10 = (java.lang.Integer) r10     // Catch: java.lang.Throwable -> L48
            int r10 = r10.intValue()     // Catch: java.lang.Throwable -> L48
            r9.mCameraOrientation = r10     // Catch: java.lang.Throwable -> L48
            android.hardware.camera2.CameraCharacteristics r10 = r9.mCharacteristics     // Catch: java.lang.Throwable -> L48
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP     // Catch: java.lang.Throwable -> L48
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L48
            android.hardware.camera2.params.StreamConfigurationMap r10 = (android.hardware.camera2.params.StreamConfigurationMap) r10     // Catch: java.lang.Throwable -> L48
            r3 = 35
            android.util.Size[] r10 = r10.getOutputSizes(r3)     // Catch: java.lang.Throwable -> L48
            r9.mSupportedSizes = r10     // Catch: java.lang.Throwable -> L48
            android.hardware.camera2.CameraCharacteristics r10 = r9.mCharacteristics     // Catch: java.lang.Throwable -> L48
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE     // Catch: java.lang.Throwable -> L48
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L48
            android.graphics.Rect r10 = (android.graphics.Rect) r10     // Catch: java.lang.Throwable -> L48
            r9.mCameraActiveSize = r10     // Catch: java.lang.Throwable -> L48
            android.hardware.camera2.CameraCharacteristics r10 = r9.mCharacteristics     // Catch: java.lang.Throwable -> L48
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES     // Catch: java.lang.Throwable -> L48
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L48
            android.util.Range[] r10 = (android.util.Range[]) r10     // Catch: java.lang.Throwable -> L48
            r9.mSupportedFpsRanges = r10     // Catch: java.lang.Throwable -> L48
            android.hardware.camera2.CameraCharacteristics r10 = r9.mCharacteristics     // Catch: java.lang.Throwable -> L48
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.FLASH_INFO_AVAILABLE     // Catch: java.lang.Throwable -> L48
            java.lang.Object r10 = r10.get(r3)     // Catch: java.lang.Throwable -> L48
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L48
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L48
            r9.mFlashSupported = r10     // Catch: java.lang.Throwable -> L48
            android.util.Size r10 = r9.mCameraSize     // Catch: java.lang.Throwable -> L48
            if (r10 != 0) goto Lbd
            r10 = 1280(0x500, float:1.794E-42)
            r3 = 720(0x2d0, float:1.009E-42)
            android.util.Size r10 = r9.getOptimalPreviewSize(r10, r3)     // Catch: java.lang.Throwable -> L48
            r9.mCameraSize = r10     // Catch: java.lang.Throwable -> L48
        Lbd:
            int r10 = r9.mCurrentFpsRange     // Catch: java.lang.Throwable -> L48
            if (r10 < 0) goto Lc6
            android.util.Range<java.lang.Integer>[] r3 = r9.mSupportedFpsRanges     // Catch: java.lang.Throwable -> L48
            int r3 = r3.length     // Catch: java.lang.Throwable -> L48
            if (r10 < r3) goto Lf4
        Lc6:
            android.util.Range<java.lang.Integer>[] r10 = r9.mSupportedFpsRanges     // Catch: java.lang.Throwable -> L48
            int r3 = r10.length     // Catch: java.lang.Throwable -> L48
            int r3 = r3 - r2
            r9.mCurrentFpsRange = r3     // Catch: java.lang.Throwable -> L48
            int r3 = r10.length     // Catch: java.lang.Throwable -> L48
            r4 = 0
            r5 = 0
        Lcf:
            if (r4 >= r3) goto Lf4
            r6 = r10[r4]     // Catch: java.lang.Throwable -> L48
            java.lang.Comparable r7 = r6.getLower()     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r7 = (java.lang.Integer) r7     // Catch: java.lang.Throwable -> L48
            int r7 = r7.intValue()     // Catch: java.lang.Throwable -> L48
            r8 = 30
            if (r7 != r8) goto Lef
            java.lang.Comparable r6 = r6.getUpper()     // Catch: java.lang.Throwable -> L48
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch: java.lang.Throwable -> L48
            int r6 = r6.intValue()     // Catch: java.lang.Throwable -> L48
            if (r6 != r8) goto Lef
            r9.mCurrentFpsRange = r5     // Catch: java.lang.Throwable -> L48
        Lef:
            int r5 = r5 + 1
            int r4 = r4 + 1
            goto Lcf
        Lf4:
            android.os.HandlerThread r10 = new android.os.HandlerThread     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = "CameraBackground"
            r10.<init>(r3)     // Catch: java.lang.Throwable -> L48
            r9.mBackgroundThread = r10     // Catch: java.lang.Throwable -> L48
            r10.start()     // Catch: java.lang.Throwable -> L48
            android.os.Handler r10 = new android.os.Handler     // Catch: java.lang.Throwable -> L48
            android.os.HandlerThread r3 = r9.mBackgroundThread     // Catch: java.lang.Throwable -> L48
            android.os.Looper r3 = r3.getLooper()     // Catch: java.lang.Throwable -> L48
            r10.<init>(r3)     // Catch: java.lang.Throwable -> L48
            r9.mBackgroundHandler = r10     // Catch: java.lang.Throwable -> L48
            cn.easyar.engine.CameraDeviceCamera2$AutoResetEvent r10 = new cn.easyar.engine.CameraDeviceCamera2$AutoResetEvent     // Catch: java.lang.Throwable -> L48
            r10.<init>()     // Catch: java.lang.Throwable -> L48
            java.lang.String r3 = r9.mCameraId     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L144 android.hardware.camera2.CameraAccessException -> L146
            cn.easyar.engine.CameraDeviceCamera2$1 r4 = new cn.easyar.engine.CameraDeviceCamera2$1     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L144 android.hardware.camera2.CameraAccessException -> L146
            r4.<init>(r9, r10)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L144 android.hardware.camera2.CameraAccessException -> L146
            android.os.Handler r5 = r9.mBackgroundHandler     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L144 android.hardware.camera2.CameraAccessException -> L146
            r0.openCamera(r3, r4, r5)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L144 android.hardware.camera2.CameraAccessException -> L146
            r10.waitOne()     // Catch: java.lang.Throwable -> L48
            android.hardware.camera2.CameraDevice r10 = r9.mCameraDevice     // Catch: java.lang.Throwable -> L48
            if (r10 != 0) goto L129
            r9.close()
            return r1
        L129:
            cn.easyar.CameraParameters r10 = r9.mCameraParameters     // Catch: java.lang.Throwable -> L48
            if (r10 == 0) goto L130
            r10.a()     // Catch: java.lang.Throwable -> L48
        L130:
            cn.easyar.Vec2I r10 = new cn.easyar.Vec2I     // Catch: java.lang.Throwable -> L48
            r0 = 640(0x280, float:8.97E-43)
            r1 = 480(0x1e0, float:6.73E-43)
            r10.<init>(r0, r1)     // Catch: java.lang.Throwable -> L48
            int r0 = r9.mCameraDeviceType     // Catch: java.lang.Throwable -> L48
            int r1 = r9.mCameraOrientation     // Catch: java.lang.Throwable -> L48
            cn.easyar.CameraParameters r10 = cn.easyar.CameraParameters.createWithDefaultIntrinsics(r10, r0, r1)     // Catch: java.lang.Throwable -> L48
            r9.mCameraParameters = r10     // Catch: java.lang.Throwable -> L48
            return r2
        L144:
            r10 = move-exception
            goto L148
        L146:
            r10 = move-exception
            goto L14f
        L148:
            android.util.Log.getStackTraceString(r10)     // Catch: java.lang.Throwable -> L48
            r9.close()
            return r1
        L14f:
            android.util.Log.getStackTraceString(r10)     // Catch: java.lang.Throwable -> L48
            r9.close()
            return r1
        L156:
            r10 = move-exception
            goto L15e
        L158:
            r10 = move-exception
            goto L165
        L15a:
            r9.close()
            return r1
        L15e:
            android.util.Log.getStackTraceString(r10)     // Catch: java.lang.Throwable -> L48
            r9.close()
            return r1
        L165:
            android.util.Log.getStackTraceString(r10)     // Catch: java.lang.Throwable -> L48
            r9.close()
            return r1
        L16c:
            r9.close()
            throw r10
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean openWithSpecificType(int r8) {
            r7 = this;
            android.content.Context r0 = r7.mContext
            java.lang.String r1 = "camera"
            java.lang.Object r0 = r0.getSystemService(r1)
            android.hardware.camera2.CameraManager r0 = (android.hardware.camera2.CameraManager) r0
            r1 = 0
            if (r0 != 0) goto Le
            return r1
        Le:
            java.lang.String[] r2 = r0.getCameraIdList()     // Catch: java.lang.Exception -> L32 android.hardware.camera2.CameraAccessException -> L34
            r3 = 0
        L13:
            int r4 = r2.length     // Catch: java.lang.Exception -> L32 android.hardware.camera2.CameraAccessException -> L34
            if (r3 >= r4) goto L4e
            r4 = r2[r3]     // Catch: java.lang.Exception -> L32 android.hardware.camera2.CameraAccessException -> L34
            android.hardware.camera2.CameraCharacteristics r4 = r0.getCameraCharacteristics(r4)     // Catch: java.lang.Exception -> L32 android.hardware.camera2.CameraAccessException -> L34
            android.hardware.camera2.CameraCharacteristics$Key r5 = android.hardware.camera2.CameraCharacteristics.LENS_FACING     // Catch: java.lang.Exception -> L32 android.hardware.camera2.CameraAccessException -> L34
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> L32 android.hardware.camera2.CameraAccessException -> L34
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch: java.lang.Exception -> L32 android.hardware.camera2.CameraAccessException -> L34
            r5 = 1
            if (r8 != r5) goto L36
            int r6 = r4.intValue()     // Catch: java.lang.Exception -> L32 android.hardware.camera2.CameraAccessException -> L34
            if (r6 != r5) goto L36
            boolean r8 = r7.openWithIndex(r3)     // Catch: java.lang.Exception -> L32 android.hardware.camera2.CameraAccessException -> L34
            return r8
        L32:
            r8 = move-exception
            goto L4f
        L34:
            r8 = move-exception
            goto L53
        L36:
            r5 = 2
            if (r8 != r5) goto L44
            int r4 = r4.intValue()     // Catch: java.lang.Exception -> L32 android.hardware.camera2.CameraAccessException -> L34
            if (r4 != 0) goto L44
            boolean r8 = r7.openWithIndex(r3)     // Catch: java.lang.Exception -> L32 android.hardware.camera2.CameraAccessException -> L34
            return r8
        L44:
            if (r8 != 0) goto L4b
            boolean r8 = r7.openWithIndex(r3)     // Catch: java.lang.Exception -> L32 android.hardware.camera2.CameraAccessException -> L34
            return r8
        L4b:
            int r3 = r3 + 1
            goto L13
        L4e:
            return r1
        L4f:
            android.util.Log.getStackTraceString(r8)
            return r1
        L53:
            android.util.Log.getStackTraceString(r8)
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public void setBufferCapacity(int r1) {
            r0 = this;
            r0.mBufferCapacity = r1
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
    public boolean setFlashTorchMode(boolean r2) {
            r1 = this;
            boolean r0 = r1.mFlashSupported
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            r1.mFlashEnabled = r2
            boolean r2 = r1.mIsStarted
            if (r2 == 0) goto Lf
            r1.runRequest()
        Lf:
            r2 = 1
            return r2
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean setFocusMode(int r9) {
            r8 = this;
            android.hardware.camera2.CameraCharacteristics r0 = r8.mCharacteristics
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            r2 = 1
            if (r9 != 0) goto La
            goto L60
        La:
            r3 = 2
            r4 = 3
            r5 = 4
            if (r9 != r3) goto L35
            android.hardware.camera2.CameraCharacteristics$Key r3 = android.hardware.camera2.CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES
            java.lang.Object r0 = r0.get(r3)
            int[] r0 = (int[]) r0
            boolean r0 = contains(r0, r5)
            if (r0 == 0) goto L1e
            goto L60
        L1e:
            android.hardware.camera2.CameraCharacteristics r0 = r8.mCharacteristics
            java.lang.Object r0 = r0.get(r3)
            int[] r0 = (int[]) r0
            boolean r0 = contains(r0, r4)
            if (r0 == 0) goto L2d
            goto L60
        L2d:
            java.lang.String r0 = "Camera2: FocusMode.Continousauto not supported or not reliable"
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String.format(r0, r2)
            goto L85
        L35:
            r6 = 4442235333156365461(0x3da5fd7fe1796495, double:1.0E-11)
            r3 = 0
            if (r9 != r4) goto L5e
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L51
            android.hardware.camera2.CameraCharacteristics r0 = r8.mCharacteristics
            java.lang.Object r0 = r0.get(r4)
            java.lang.Float r0 = (java.lang.Float) r0
            float r3 = r0.floatValue()
        L51:
            double r3 = (double) r3
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L60
            java.lang.String r0 = "Camera2: FocusMode.Infinity not supported or not reliable: manual sensor not available"
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String.format(r0, r2)
            goto L85
        L5e:
            if (r9 != r5) goto L62
        L60:
            r1 = 1
            goto L85
        L62:
            r4 = 5
            if (r9 != r4) goto L8e
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.LENS_INFO_MINIMUM_FOCUS_DISTANCE
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L79
            android.hardware.camera2.CameraCharacteristics r0 = r8.mCharacteristics
            java.lang.Object r0 = r0.get(r4)
            java.lang.Float r0 = (java.lang.Float) r0
            float r3 = r0.floatValue()
        L79:
            double r3 = (double) r3
            int r0 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r0 >= 0) goto L60
            java.lang.String r0 = "Camera2: FocusMode.Medium not supported or not reliable: manual sensor not available"
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String.format(r0, r2)
        L85:
            r8.mCurrentFocusMode = r9
            boolean r9 = r8.mIsStarted
            if (r9 == 0) goto L8e
            r8.runRequest()
        L8e:
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean setFrameRateRange(int r3) {
            r2 = this;
            android.util.Range<java.lang.Integer>[] r0 = r2.mSupportedFpsRanges
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            if (r3 < 0) goto L17
            int r0 = r0.length
            if (r3 < r0) goto Lc
            goto L17
        Lc:
            r2.mCurrentFpsRange = r3
            boolean r3 = r2.mIsStarted
            if (r3 == 0) goto L15
            r2.runRequest()
        L15:
            r3 = 1
            return r3
        L17:
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean setSize(int r2, int r3) {
            r1 = this;
            android.util.Size[] r0 = r1.mSupportedSizes
            if (r0 != 0) goto L6
            r2 = 0
            return r2
        L6:
            android.util.Size r2 = r1.getOptimalPreviewSize(r2, r3)
            r1.mCameraSize = r2
            boolean r2 = r1.mIsStarted
            if (r2 == 0) goto L16
            r1.close()
            r1.start()
        L16:
            r2 = 1
            return r2
    }

    @Override // cn.easyar.engine.CameraDevice
    public boolean start() {
            r7 = this;
            android.os.HandlerThread r0 = r7.mBackgroundThread
            r1 = 0
            if (r0 == 0) goto Ld
            android.os.Handler r0 = r7.mBackgroundHandler
            if (r0 == 0) goto Ld
            android.hardware.camera2.CameraDevice r0 = r7.mCameraDevice
            if (r0 != 0) goto L1b
        Ld:
            android.content.Context r0 = r7.mContext
            if (r0 != 0) goto L12
            return r1
        L12:
            int r0 = r7.mCameraIndex
            boolean r0 = r7.openWithIndex(r0)
            if (r0 != 0) goto L1b
            return r1
        L1b:
            boolean r0 = r7.mIsStarted
            r2 = 1
            if (r0 == 0) goto L21
            return r2
        L21:
            android.util.Size r0 = r7.mCameraSize
            if (r0 != 0) goto L26
            return r1
        L26:
            int r0 = r0.getWidth()
            android.util.Size r3 = r7.mCameraSize
            int r3 = r3.getHeight()
            r4 = 35
            r5 = 2
            android.media.ImageReader r0 = android.media.ImageReader.newInstance(r0, r3, r4, r5)
            r7.mImageReader = r0
            cn.easyar.engine.CameraDeviceCamera2$2 r3 = new cn.easyar.engine.CameraDeviceCamera2$2
            r3.<init>(r7)
            android.os.Handler r4 = r7.mBackgroundHandler
            r0.setOnImageAvailableListener(r3, r4)
            cn.easyar.engine.CameraDeviceCamera2$AutoResetEvent r0 = new cn.easyar.engine.CameraDeviceCamera2$AutoResetEvent
            r0.<init>()
            android.hardware.camera2.CameraDevice r3 = r7.mCameraDevice     // Catch: java.lang.Exception -> L76 android.hardware.camera2.CameraAccessException -> L78
            android.media.ImageReader r4 = r7.mImageReader     // Catch: java.lang.Exception -> L76 android.hardware.camera2.CameraAccessException -> L78
            android.view.Surface r4 = r4.getSurface()     // Catch: java.lang.Exception -> L76 android.hardware.camera2.CameraAccessException -> L78
            java.util.List r4 = java.util.Collections.singletonList(r4)     // Catch: java.lang.Exception -> L76 android.hardware.camera2.CameraAccessException -> L78
            cn.easyar.engine.CameraDeviceCamera2$3 r5 = new cn.easyar.engine.CameraDeviceCamera2$3     // Catch: java.lang.Exception -> L76 android.hardware.camera2.CameraAccessException -> L78
            r5.<init>(r7, r0)     // Catch: java.lang.Exception -> L76 android.hardware.camera2.CameraAccessException -> L78
            android.os.Handler r6 = r7.mBackgroundHandler     // Catch: java.lang.Exception -> L76 android.hardware.camera2.CameraAccessException -> L78
            r3.createCaptureSession(r4, r5, r6)     // Catch: java.lang.Exception -> L76 android.hardware.camera2.CameraAccessException -> L78
            r0.waitOne()
            android.hardware.camera2.CameraCaptureSession r0 = r7.mCaptureSession
            if (r0 != 0) goto L69
            r7.close()
            return r1
        L69:
            boolean r0 = r7.runRequest()
            if (r0 != 0) goto L73
            r7.close()
            return r1
        L73:
            r7.mIsStarted = r2
            return r2
        L76:
            r0 = move-exception
            goto L7a
        L78:
            r0 = move-exception
            goto L7e
        L7a:
            android.util.Log.getStackTraceString(r0)
            return r1
        L7e:
            android.util.Log.getStackTraceString(r0)
            return r1
    }

    @Override // cn.easyar.engine.CameraDevice
    public void stop() {
            r2 = this;
            r0 = 0
            r2.mIsStarted = r0
            android.hardware.camera2.CameraCaptureSession r0 = r2.mCaptureSession
            r1 = 0
            if (r0 == 0) goto Ld
            r0.close()
            r2.mCaptureSession = r1
        Ld:
            android.hardware.camera2.CameraDevice r0 = r2.mCameraDevice
            if (r0 == 0) goto L1d
            r0.close()
            cn.easyar.engine.CameraDeviceCamera2$AutoResetEvent r0 = r2.mCameraDeviceCloseSignal
            r0.waitOne()
            r2.mCameraDeviceCloseSignal = r1
            r2.mCameraDevice = r1
        L1d:
            android.media.ImageReader r0 = r2.mImageReader
            if (r0 == 0) goto L26
            r0.close()
            r2.mImageReader = r1
        L26:
            android.os.HandlerThread r0 = r2.mBackgroundThread
            if (r0 == 0) goto L36
            r0.quitSafely()
            android.os.HandlerThread r0 = r2.mBackgroundThread     // Catch: java.lang.InterruptedException -> L32
            r0.join()     // Catch: java.lang.InterruptedException -> L32
        L32:
            r2.mBackgroundThread = r1
            r2.mBackgroundHandler = r1
        L36:
            return
    }
}

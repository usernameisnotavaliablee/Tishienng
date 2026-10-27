package cn.easyar.engine.recorder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@android.annotation.TargetApi(17)
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class TextureMovieEncoder implements java.lang.Runnable {
    private static final int MSG_FRAME_AVAILABLE = 2;
    private static final int MSG_STOP_RECORDING = 1;
    private static final java.lang.String TAG = "easyar.TextureEncoder";
    private static final boolean VERBOSE = false;
    private cn.easyar.engine.recorder.RecordNative aNative;
    private cn.easyar.engine.recorder.AVRecorderConfig config;
    private cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType mDeviceType;
    private volatile cn.easyar.engine.recorder.TextureMovieEncoder.EncoderHandler mHandler;
    private volatile boolean mReady;
    private java.lang.Object mReadyFence;
    private int[] mSurfaceHeight;
    private int[] mSurfaceWidth;
    private cn.easyar.engine.recorder.VideoEncoderCore mVideoEncoder;
    private int number;
    java.lang.Runnable run;
    private int[] texWaterMark;
    android.os.Handler vHandler;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum DeviceType extends java.lang.Enum<cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType> {
        private static final /* synthetic */ cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType[] $VALUES = null;
        public static final cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType Default = null;
        public static final cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType HUAWEI_P7 = null;
        public static final cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType IPH = null;
        public static final cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType Sony_Z1 = null;
        public static final cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType UnKnown = null;

        static {
                cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType r0 = new cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType
                java.lang.String r1 = "Default"
                r2 = 0
                r0.<init>(r1, r2)
                cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType.Default = r0
                cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType r1 = new cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType
                java.lang.String r3 = "Sony_Z1"
                r4 = 1
                r1.<init>(r3, r4)
                cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType.Sony_Z1 = r1
                cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType r3 = new cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType
                java.lang.String r5 = "HUAWEI_P7"
                r6 = 2
                r3.<init>(r5, r6)
                cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType.HUAWEI_P7 = r3
                cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType r5 = new cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType
                java.lang.String r7 = "IPH"
                r8 = 3
                r5.<init>(r7, r8)
                cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType.IPH = r5
                cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType r7 = new cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType
                java.lang.String r9 = "UnKnown"
                r10 = 4
                r7.<init>(r9, r10)
                cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType.UnKnown = r7
                r9 = 5
                cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType[] r9 = new cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType.$VALUES = r9
                return
        }

        DeviceType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType valueOf(java.lang.String r1) {
                java.lang.Class<cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType> r0 = cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType r1 = (cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType) r1
                return r1
        }

        public static cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType[] values() {
                cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType[] r0 = cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType.$VALUES
                java.lang.Object r0 = r0.clone()
                cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType[] r0 = (cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class EncoderHandler extends android.os.Handler {
        private java.lang.ref.WeakReference<cn.easyar.engine.recorder.TextureMovieEncoder> mWeakEncoder;

        public EncoderHandler(cn.easyar.engine.recorder.TextureMovieEncoder r2) {
                r1 = this;
                r1.<init>()
                java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
                r0.<init>(r2)
                r1.mWeakEncoder = r0
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r4) {
                r3 = this;
                int r4 = r4.what
                java.lang.ref.WeakReference<cn.easyar.engine.recorder.TextureMovieEncoder> r0 = r3.mWeakEncoder
                java.lang.Object r0 = r0.get()
                cn.easyar.engine.recorder.TextureMovieEncoder r0 = (cn.easyar.engine.recorder.TextureMovieEncoder) r0
                if (r0 != 0) goto Ld
                return
            Ld:
                r1 = 1
                if (r4 == r1) goto L2e
                r1 = 2
                if (r4 != r1) goto L17
                cn.easyar.engine.recorder.TextureMovieEncoder.access$100(r0)
                return
            L17:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unhandled msg what="
                r1.append(r2)
                r1.append(r4)
                java.lang.String r4 = r1.toString()
                r0.<init>(r4)
                throw r0
            L2e:
                cn.easyar.engine.recorder.TextureMovieEncoder.access$000(r0)
                android.os.Looper r4 = android.os.Looper.myLooper()
                r4.quit()
                return
        }
    }

    public TextureMovieEncoder(cn.easyar.engine.recorder.AVRecorderConfig r5) throws java.lang.RuntimeException {
            r4 = this;
            r4.<init>()
            java.lang.Object r0 = new java.lang.Object
            r0.<init>()
            r4.mReadyFence = r0
            r0 = 0
            r4.mReady = r0
            r1 = 1
            int[] r2 = new int[r1]
            r4.texWaterMark = r2
            int[] r3 = new int[r1]
            r4.mSurfaceWidth = r3
            int[] r1 = new int[r1]
            r4.mSurfaceHeight = r1
            r4.number = r0
            r4.config = r5
            r1[r0] = r0
            r3[r0] = r0
            r2[r0] = r0
            boolean r0 = r5.getRotationClip()     // Catch: java.io.IOException -> L33
            if (r0 == 0) goto L35
            int r0 = r5.getWidth()     // Catch: java.io.IOException -> L33
            int r1 = r5.getHeight()     // Catch: java.io.IOException -> L33
            goto L3d
        L33:
            r5 = move-exception
            goto L77
        L35:
            int r1 = r5.getWidth()     // Catch: java.io.IOException -> L33
            int r0 = r5.getHeight()     // Catch: java.io.IOException -> L33
        L3d:
            cn.easyar.engine.recorder.VideoEncoderCore r2 = new cn.easyar.engine.recorder.VideoEncoderCore     // Catch: java.io.IOException -> L33
            int r3 = r5.getVideoBitRate()     // Catch: java.io.IOException -> L33
            cn.easyar.engine.recorder.Muxer r5 = r5.getMuxer()     // Catch: java.io.IOException -> L33
            r2.<init>(r1, r0, r3, r5)     // Catch: java.io.IOException -> L33
            r4.mVideoEncoder = r2     // Catch: java.io.IOException -> L33
            cn.easyar.engine.recorder.RecordNative r5 = new cn.easyar.engine.recorder.RecordNative     // Catch: java.lang.Exception -> L6a
            android.view.Surface r0 = r2.getInputSurface()     // Catch: java.lang.Exception -> L6a
            cn.easyar.engine.recorder.AVRecorderConfig r1 = r4.config     // Catch: java.lang.Exception -> L6a
            int r1 = r1.getTextureWidth()     // Catch: java.lang.Exception -> L6a
            cn.easyar.engine.recorder.AVRecorderConfig r2 = r4.config     // Catch: java.lang.Exception -> L6a
            int r2 = r2.getTextureHeight()     // Catch: java.lang.Exception -> L6a
            cn.easyar.engine.recorder.AVRecorderConfig r3 = r4.config     // Catch: java.lang.Exception -> L6a
            int r3 = r3.getZoomMode()     // Catch: java.lang.Exception -> L6a
            r5.<init>(r0, r1, r2, r3)     // Catch: java.lang.Exception -> L6a
            r4.aNative = r5     // Catch: java.lang.Exception -> L6a
            return
        L6a:
            cn.easyar.engine.recorder.VideoEncoderCore r5 = r4.mVideoEncoder
            r5.release()
            java.lang.RuntimeException r5 = new java.lang.RuntimeException
            java.lang.String r0 = "ReccordNative init failed"
            r5.<init>(r0)
            throw r5
        L77:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r5)
            throw r0
    }

    private void Assert(boolean r1, java.lang.String r2) {
            r0 = this;
            return
    }

    static /* synthetic */ void access$000(cn.easyar.engine.recorder.TextureMovieEncoder r0) {
            r0.handleStopRecording()
            return
    }

    static /* synthetic */ void access$100(cn.easyar.engine.recorder.TextureMovieEncoder r0) {
            r0.handleFrameAvailable()
            return
    }

    private android.graphics.Bitmap createBitmapFromGLSurface(int r11, int r12, int r13, int r14) {
            r10 = this;
            int r0 = r13 * r14
            int[] r1 = new int[r0]
            int[] r0 = new int[r0]
            java.nio.IntBuffer r8 = java.nio.IntBuffer.wrap(r1)
            r9 = 0
            r8.position(r9)
            r6 = 6408(0x1908, float:8.98E-42)
            r7 = 5121(0x1401, float:7.176E-42)
            r2 = r11
            r3 = r12
            r4 = r13
            r5 = r14
            android.opengl.GLES20.glReadPixels(r2, r3, r4, r5, r6, r7, r8)     // Catch: android.opengl.GLException -> L4b
            r11 = 0
        L1a:
            if (r11 >= r5) goto L44
            int r13 = r11 * r4
            int r14 = r5 - r11
            int r14 = r14 + (-1)
            int r14 = r14 * r4
            r12 = 0
        L25:
            if (r12 >= r4) goto L41
            int r2 = r13 + r12
            r2 = r1[r2]     // Catch: android.opengl.GLException -> L4b
            int r3 = r2 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r6 = r2 << 16
            r7 = 16711680(0xff0000, float:2.3418052E-38)
            r6 = r6 & r7
            r7 = -16711936(0xffffffffff00ff00, float:-1.7146522E38)
            r2 = r2 & r7
            r2 = r2 | r6
            r2 = r2 | r3
            int r3 = r14 + r12
            r0[r3] = r2     // Catch: android.opengl.GLException -> L4b
            int r12 = r12 + 1
            goto L25
        L41:
            int r11 = r11 + 1
            goto L1a
        L44:
            android.graphics.Bitmap$Config r11 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r11 = android.graphics.Bitmap.createBitmap(r0, r4, r5, r11)
            return r11
        L4b:
            r11 = 0
            return r11
    }

    private void handleFrameAvailable() {
            r2 = this;
            cn.easyar.engine.recorder.VideoEncoderCore r0 = r2.mVideoEncoder
            r1 = 0
            r0.drainEncoder(r1)
            return
    }

    private void handleStopRecording() {
            r2 = this;
            cn.easyar.engine.recorder.VideoEncoderCore r0 = r2.mVideoEncoder
            r1 = 1
            r0.drainEncoder(r1)
            java.lang.Object r0 = r2.mReadyFence
            monitor-enter(r0)
            r1 = 0
            r2.mReady = r1     // Catch: java.lang.Throwable -> L13
            java.lang.Object r1 = r2.mReadyFence     // Catch: java.lang.Throwable -> L13
            r1.notify()     // Catch: java.lang.Throwable -> L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            return
        L13:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
    }

    private void saveBitmap(android.graphics.Bitmap r5) {
            r4 = this;
            java.io.File r0 = new java.io.File
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = ""
            r1.append(r2)
            int r2 = r4.number
            r1.append(r2)
            java.lang.String r2 = ".png"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "/sdcard/easyar3d/video/"
            r0.<init>(r2, r1)
            r0.createNewFile()     // Catch: java.lang.Exception -> L3f
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Exception -> L3f
            r1.<init>()     // Catch: java.lang.Exception -> L3f
            android.graphics.Bitmap$CompressFormat r2 = android.graphics.Bitmap.CompressFormat.PNG     // Catch: java.lang.Exception -> L3f
            r3 = 0
            r5.compress(r2, r3, r1)     // Catch: java.lang.Exception -> L3f
            byte[] r5 = r1.toByteArray()     // Catch: java.lang.Exception -> L3f
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Exception -> L3f
            r1.<init>(r0)     // Catch: java.lang.Exception -> L3f
            r1.write(r5)     // Catch: java.lang.Exception -> L3f
            r1.flush()     // Catch: java.lang.Exception -> L3f
            r1.close()     // Catch: java.lang.Exception -> L3f
        L3f:
            return
    }

    public void frameAvailableSoon() {
            r3 = this;
            java.lang.Object r0 = r3.mReadyFence
            monitor-enter(r0)
            boolean r1 = r3.mReady     // Catch: java.lang.Throwable -> L9
            if (r1 != 0) goto Lb
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            return
        L9:
            r1 = move-exception
            goto L19
        Lb:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            cn.easyar.engine.recorder.TextureMovieEncoder$EncoderHandler r0 = r3.mHandler
            cn.easyar.engine.recorder.TextureMovieEncoder$EncoderHandler r1 = r3.mHandler
            r2 = 2
            android.os.Message r1 = r1.obtainMessage(r2)
            r0.sendMessage(r1)
            return
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L9
            throw r1
    }

    @Override // java.lang.Runnable
    public void run() {
            r2 = this;
            android.os.Looper.prepare()
            java.lang.Object r0 = r2.mReadyFence
            monitor-enter(r0)
            cn.easyar.engine.recorder.TextureMovieEncoder$EncoderHandler r1 = new cn.easyar.engine.recorder.TextureMovieEncoder$EncoderHandler     // Catch: java.lang.Throwable -> L24
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L24
            r2.mHandler = r1     // Catch: java.lang.Throwable -> L24
            r1 = 1
            r2.mReady = r1     // Catch: java.lang.Throwable -> L24
            java.lang.Object r1 = r2.mReadyFence     // Catch: java.lang.Throwable -> L24
            r1.notify()     // Catch: java.lang.Throwable -> L24
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            android.os.Looper.loop()
            java.lang.Object r1 = r2.mReadyFence
            monitor-enter(r1)
            r0 = 0
            r2.mHandler = r0     // Catch: java.lang.Throwable -> L21
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            return
        L21:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L21
            throw r0
        L24:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L24
            throw r1
    }

    public void setDeviceType() {
            r3 = this;
            java.lang.String r0 = android.os.Build.MANUFACTURER
            java.lang.String r0 = android.os.Build.MODEL
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r2 = "c6602"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L15
            cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType r0 = cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType.Sony_Z1
            r3.mDeviceType = r0
            return
        L15:
            java.lang.String r1 = r0.toLowerCase()
            java.lang.String r2 = "HUAWEI P7-L07"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L26
            cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType r0 = cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType.HUAWEI_P7
            r3.mDeviceType = r0
            return
        L26:
            java.lang.String r0 = r0.toLowerCase()
            java.lang.String r1 = "iph"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L37
            cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType r0 = cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType.IPH
            r3.mDeviceType = r0
            return
        L37:
            cn.easyar.engine.recorder.TextureMovieEncoder$DeviceType r0 = cn.easyar.engine.recorder.TextureMovieEncoder.DeviceType.Default
            r3.mDeviceType = r0
            return
    }

    public void startRecording() {
            r3 = this;
            java.lang.Object r0 = r3.mReadyFence
            monitor-enter(r0)
            java.lang.Thread r1 = new java.lang.Thread     // Catch: java.lang.Throwable -> L17
            java.lang.String r2 = "TextureMovieEncoder"
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L17
            r1.start()     // Catch: java.lang.Throwable -> L17
        Ld:
            boolean r1 = r3.mReady     // Catch: java.lang.Throwable -> L17
            if (r1 != 0) goto L19
            java.lang.Object r1 = r3.mReadyFence     // Catch: java.lang.InterruptedException -> Ld java.lang.Throwable -> L17
            r1.wait()     // Catch: java.lang.InterruptedException -> Ld java.lang.Throwable -> L17
            goto Ld
        L17:
            r1 = move-exception
            goto L1b
        L19:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L1b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }

    public void stopRecording(android.os.Handler r3, java.lang.Runnable r4) {
            r2 = this;
            boolean r0 = r2.mReady
            java.lang.String r1 = "stopRecording: mReady"
            r2.Assert(r0, r1)
            r2.vHandler = r3
            r2.run = r4
            cn.easyar.engine.recorder.TextureMovieEncoder$EncoderHandler r3 = r2.mHandler
            cn.easyar.engine.recorder.TextureMovieEncoder$EncoderHandler r4 = r2.mHandler
            r0 = 1
            android.os.Message r4 = r4.obtainMessage(r0)
            r3.sendMessage(r4)
            java.lang.Object r3 = r2.mReadyFence
            monitor-enter(r3)
        L1a:
            boolean r4 = r2.mReady     // Catch: java.lang.Throwable -> L24
            if (r4 == 0) goto L26
            java.lang.Object r4 = r2.mReadyFence     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L24
            r4.wait()     // Catch: java.lang.InterruptedException -> L1a java.lang.Throwable -> L24
            goto L1a
        L24:
            r4 = move-exception
            goto L39
        L26:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            cn.easyar.engine.recorder.RecordNative r3 = r2.aNative
            r3.release()
            cn.easyar.engine.recorder.VideoEncoderCore r3 = r2.mVideoEncoder
            r4 = 0
            if (r3 == 0) goto L36
            r3.release()
            r2.mVideoEncoder = r4
        L36:
            r2.vHandler = r4
            return
        L39:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L24
            throw r4
    }

    public void updateRecording(int r4) {
            r3 = this;
            long r0 = java.lang.System.nanoTime()
            r3.frameAvailableSoon()
            android.opengl.GLES20.glFinish()     // Catch: java.lang.Exception -> Lf
            cn.easyar.engine.recorder.RecordNative r2 = r3.aNative     // Catch: java.lang.Exception -> Lf
            r2.updateRecord(r4, r0)     // Catch: java.lang.Exception -> Lf
        Lf:
            return
    }

    public void updateRecording(int r10, int r11, int r12) {
            r9 = this;
            long r4 = java.lang.System.nanoTime()
            r9.frameAvailableSoon()
            cn.easyar.engine.recorder.RecordNative r0 = r9.aNative
            r0.nativeWidth()
            cn.easyar.engine.recorder.RecordNative r0 = r9.aNative
            r0.nativeHeight()
            int r0 = r9.number
            int r0 = r0 + 1
            r9.number = r0
            r6 = 720(0x2d0, float:1.009E-42)
            r7 = 1280(0x500, float:1.794E-42)
            r8 = 0
            if (r0 >= 0) goto L28
            android.graphics.Bitmap r0 = r9.createBitmapFromGLSurface(r8, r8, r7, r6)
            r9.saveBitmap(r0)
            r0.recycle()
        L28:
            int r0 = r9.number
            int r0 = r0 + 1
            r9.number = r0
            android.opengl.GLES20.glFinish()     // Catch: java.lang.Exception -> L47
            cn.easyar.engine.recorder.RecordNative r0 = r9.aNative     // Catch: java.lang.Exception -> L47
            r1 = r10
            r2 = r11
            r3 = r12
            r0.updateRecord(r1, r2, r3, r4)     // Catch: java.lang.Exception -> L47
            int r10 = r9.number     // Catch: java.lang.Exception -> L47
            if (r10 >= 0) goto L47
            android.graphics.Bitmap r10 = r9.createBitmapFromGLSurface(r8, r8, r7, r6)     // Catch: java.lang.Exception -> L47
            r9.saveBitmap(r10)     // Catch: java.lang.Exception -> L47
            r10.recycle()     // Catch: java.lang.Exception -> L47
        L47:
            return
    }
}

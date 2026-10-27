package cn.easyar.engine.recorder;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SessionRecorder {
    private static java.lang.String TAG = "EasyAR";
    static cn.easyar.engine.recorder.SessionRecorder.VideoSize systemQuality;
    int audioBitrate;
    int audioChannelCount;
    int audioSampleRate;
    boolean configUpdated;
    java.lang.String file;
    int height;
    private cn.easyar.engine.recorder.AVRecorderConfig mAVRecorderConfig;
    android.os.Handler mHandler;
    private cn.easyar.engine.recorder.RecordListener mListener;
    private cn.easyar.engine.recorder.MicroPhoneEncoder mMicroPhoneEncoder;
    private cn.easyar.engine.recorder.TextureMovieEncoder mTexture2Video;
    int mode;
    private long nativeId;
    boolean rotationClip;
    int texId;
    int tex_height;
    int tex_width;
    int videoBitrate;
    int width;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum VideoSize extends java.lang.Enum<cn.easyar.engine.recorder.SessionRecorder.VideoSize> {
        private static final /* synthetic */ cn.easyar.engine.recorder.SessionRecorder.VideoSize[] $VALUES = null;
        public static final cn.easyar.engine.recorder.SessionRecorder.VideoSize Vid1080p = null;
        public static final cn.easyar.engine.recorder.SessionRecorder.VideoSize Vid480p = null;
        public static final cn.easyar.engine.recorder.SessionRecorder.VideoSize Vid720p = null;
        private int quality;

        static {
                cn.easyar.engine.recorder.SessionRecorder$VideoSize r0 = new cn.easyar.engine.recorder.SessionRecorder$VideoSize
                java.lang.String r1 = "Vid480p"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                cn.easyar.engine.recorder.SessionRecorder.VideoSize.Vid480p = r0
                cn.easyar.engine.recorder.SessionRecorder$VideoSize r1 = new cn.easyar.engine.recorder.SessionRecorder$VideoSize
                java.lang.String r4 = "Vid720p"
                r5 = 2
                r1.<init>(r4, r3, r5)
                cn.easyar.engine.recorder.SessionRecorder.VideoSize.Vid720p = r1
                cn.easyar.engine.recorder.SessionRecorder$VideoSize r4 = new cn.easyar.engine.recorder.SessionRecorder$VideoSize
                java.lang.String r6 = "Vid1080p"
                r7 = 4
                r4.<init>(r6, r5, r7)
                cn.easyar.engine.recorder.SessionRecorder.VideoSize.Vid1080p = r4
                r6 = 3
                cn.easyar.engine.recorder.SessionRecorder$VideoSize[] r6 = new cn.easyar.engine.recorder.SessionRecorder.VideoSize[r6]
                r6[r2] = r0
                r6[r3] = r1
                r6[r5] = r4
                cn.easyar.engine.recorder.SessionRecorder.VideoSize.$VALUES = r6
                return
        }

        VideoSize(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.quality = r3
                return
        }

        public static cn.easyar.engine.recorder.SessionRecorder.VideoSize valueOf(java.lang.String r1) {
                java.lang.Class<cn.easyar.engine.recorder.SessionRecorder$VideoSize> r0 = cn.easyar.engine.recorder.SessionRecorder.VideoSize.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                cn.easyar.engine.recorder.SessionRecorder$VideoSize r1 = (cn.easyar.engine.recorder.SessionRecorder.VideoSize) r1
                return r1
        }

        public static cn.easyar.engine.recorder.SessionRecorder.VideoSize[] values() {
                cn.easyar.engine.recorder.SessionRecorder$VideoSize[] r0 = cn.easyar.engine.recorder.SessionRecorder.VideoSize.$VALUES
                java.lang.Object r0 = r0.clone()
                cn.easyar.engine.recorder.SessionRecorder$VideoSize[] r0 = (cn.easyar.engine.recorder.SessionRecorder.VideoSize[]) r0
                return r0
        }

        void custom(int r1) {
                r0 = this;
                r0.quality = r1
                return
        }

        boolean has(int r2) {
                r1 = this;
                int r0 = r1.quality
                r2 = r2 & r0
                if (r2 == 0) goto L7
                r2 = 1
                return r2
            L7:
                r2 = 0
                return r2
        }

        int value() {
                r1 = this;
                int r0 = r1.quality
                return r0
        }
    }

    static {
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r0 = cn.easyar.engine.recorder.SessionRecorder.VideoSize.Vid720p
            cn.easyar.engine.recorder.SessionRecorder.systemQuality = r0
            r1 = 4
            boolean r1 = android.media.CamcorderProfile.hasProfile(r1)
            if (r1 == 0) goto L19
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r1 = cn.easyar.engine.recorder.SessionRecorder.systemQuality
            int r1 = r1.value()
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r2 = cn.easyar.engine.recorder.SessionRecorder.VideoSize.Vid480p
            int r2 = r2.value()
            r1 = r1 | r2
            goto L1a
        L19:
            r1 = 0
        L1a:
            r2 = 5
            boolean r2 = android.media.CamcorderProfile.hasProfile(r2)
            if (r2 == 0) goto L2c
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r1 = cn.easyar.engine.recorder.SessionRecorder.systemQuality
            int r1 = r1.value()
            int r0 = r0.value()
            r1 = r1 | r0
        L2c:
            r0 = 6
            boolean r0 = android.media.CamcorderProfile.hasProfile(r0)
            if (r0 == 0) goto L40
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r0 = cn.easyar.engine.recorder.SessionRecorder.systemQuality
            int r0 = r0.value()
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r1 = cn.easyar.engine.recorder.SessionRecorder.VideoSize.Vid1080p
            int r1 = r1.value()
            r1 = r1 | r0
        L40:
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r0 = cn.easyar.engine.recorder.SessionRecorder.systemQuality
            r0.custom(r1)
            return
    }

    public SessionRecorder() {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.configUpdated = r0
            return
    }

    static /* synthetic */ void access$000(long r0, int r2, java.lang.String r3) {
            onPermissionCallback(r0, r2, r3)
            return
    }

    static /* synthetic */ java.lang.String access$100() {
            java.lang.String r0 = cn.easyar.engine.recorder.SessionRecorder.TAG
            return r0
    }

    static /* synthetic */ void access$200(cn.easyar.engine.recorder.SessionRecorder r0, int r1, java.lang.String r2) {
            r0.onStatusNotify(r1, r2)
            return
    }

    private static native void onPermissionCallback(long r0, int r2, java.lang.String r3);

    private native void onStatusNotify(int r1, java.lang.String r2);

    public static void requestPermissions(long r6) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 23
            java.lang.String r2 = ""
            r3 = 0
            if (r0 < r1) goto L56
            java.lang.ref.WeakReference r0 = cn.easyar.engine.EasyAR.getInitializeActivity()
            java.lang.Object r0 = r0.get()
            android.app.Activity r0 = (android.app.Activity) r0
            if (r0 != 0) goto L1c
            r0 = 2
            java.lang.String r1 = "ContextMiss"
            onPermissionCallback(r6, r0, r1)
            return
        L1c:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r4 = "android.permission.RECORD_AUDIO"
            int r5 = cn.easyar.engine.a.a(r0, r4)
            if (r5 == 0) goto L2c
            r1.add(r4)
        L2c:
            int r4 = r1.size()
            if (r4 != 0) goto L36
            onPermissionCallback(r6, r3, r2)
            return
        L36:
            android.app.FragmentManager r0 = r0.getFragmentManager()
            cn.easyar.engine.recorder.SessionRecorder$1 r2 = new cn.easyar.engine.recorder.SessionRecorder$1
            r2.<init>()
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r4)
            java.lang.String[] r1 = (java.lang.String[]) r1
            cn.easyar.engine.PermissionFragment r6 = cn.easyar.engine.PermissionFragment.newInstance(r6, r1, r2, r0)
            android.app.FragmentTransaction r7 = r0.beginTransaction()
            r7.add(r3, r6)
            r7.commit()
            return
        L56:
            onPermissionCallback(r6, r3, r2)
            return
    }

    boolean compatibleValidation() {
            r12 = this;
            int r0 = r12.width
            java.lang.String r1 = "480P"
            r2 = 0
            java.lang.String r3 = "config_size: failed"
            r4 = 2048(0x800, float:2.87E-42)
            r5 = 480(0x1e0, float:6.73E-43)
            r6 = 2049(0x801, float:2.871E-42)
            r7 = 720(0x2d0, float:1.009E-42)
            r8 = 1280(0x500, float:1.794E-42)
            if (r0 != r8) goto L46
            int r9 = r12.height
            if (r9 != r7) goto L46
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r0 = cn.easyar.engine.recorder.SessionRecorder.systemQuality
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r8 = cn.easyar.engine.recorder.SessionRecorder.VideoSize.Vid720p
            int r8 = r8.value()
            boolean r0 = r0.has(r8)
            if (r0 == 0) goto L27
            goto Lca
        L27:
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r0 = cn.easyar.engine.recorder.SessionRecorder.systemQuality
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r8 = cn.easyar.engine.recorder.SessionRecorder.VideoSize.Vid480p
            int r8 = r8.value()
            boolean r0 = r0.has(r8)
            if (r0 == 0) goto L40
            r12.width = r7
            r12.height = r5
            cn.easyar.engine.recorder.RecordListener r0 = r12.mListener
            r0.onMessage(r6, r1)
            goto Lca
        L40:
            cn.easyar.engine.recorder.RecordListener r0 = r12.mListener
            r0.onMessage(r4, r3)
            return r2
        L46:
            r9 = 1920(0x780, float:2.69E-42)
            java.lang.String r10 = "720P"
            if (r0 != r9) goto L97
            int r9 = r12.height
            r11 = 1080(0x438, float:1.513E-42)
            if (r9 != r11) goto L97
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r0 = cn.easyar.engine.recorder.SessionRecorder.systemQuality
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r9 = cn.easyar.engine.recorder.SessionRecorder.VideoSize.Vid1080p
            int r9 = r9.value()
            boolean r0 = r0.has(r9)
            if (r0 == 0) goto L61
            goto Lca
        L61:
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r0 = cn.easyar.engine.recorder.SessionRecorder.systemQuality
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r9 = cn.easyar.engine.recorder.SessionRecorder.VideoSize.Vid720p
            int r9 = r9.value()
            boolean r0 = r0.has(r9)
            if (r0 == 0) goto L79
            r12.width = r8
            r12.height = r7
            cn.easyar.engine.recorder.RecordListener r0 = r12.mListener
            r0.onMessage(r6, r10)
            goto Lca
        L79:
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r0 = cn.easyar.engine.recorder.SessionRecorder.systemQuality
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r8 = cn.easyar.engine.recorder.SessionRecorder.VideoSize.Vid480p
            int r8 = r8.value()
            boolean r0 = r0.has(r8)
            if (r0 == 0) goto L91
            r12.width = r7
            r12.height = r5
            cn.easyar.engine.recorder.RecordListener r0 = r12.mListener
            r0.onMessage(r6, r1)
            goto Lca
        L91:
            cn.easyar.engine.recorder.RecordListener r0 = r12.mListener
            r0.onMessage(r4, r3)
            return r2
        L97:
            if (r0 != r7) goto Lca
            int r0 = r12.height
            if (r0 != r5) goto Lca
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r0 = cn.easyar.engine.recorder.SessionRecorder.systemQuality
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r1 = cn.easyar.engine.recorder.SessionRecorder.VideoSize.Vid480p
            int r1 = r1.value()
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto Lac
            goto Lca
        Lac:
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r0 = cn.easyar.engine.recorder.SessionRecorder.systemQuality
            cn.easyar.engine.recorder.SessionRecorder$VideoSize r1 = cn.easyar.engine.recorder.SessionRecorder.VideoSize.Vid720p
            int r1 = r1.value()
            boolean r0 = r0.has(r1)
            if (r0 == 0) goto Lc4
            r12.width = r8
            r12.height = r7
            cn.easyar.engine.recorder.RecordListener r0 = r12.mListener
            r0.onMessage(r6, r10)
            goto Lca
        Lc4:
            cn.easyar.engine.recorder.RecordListener r0 = r12.mListener
            r0.onMessage(r4, r3)
            return r2
        Lca:
            r0 = 1
            return r0
    }

    boolean envSetup() {
            r1 = this;
            r0 = 1
            return r0
    }

    public void prepare() {
            r3 = this;
            cn.easyar.engine.recorder.SessionRecorder$2 r0 = new cn.easyar.engine.recorder.SessionRecorder$2
            r0.<init>(r3)
            r3.mListener = r0
            boolean r0 = r3.compatibleValidation()
            r1 = 513(0x201, float:7.19E-43)
            java.lang.String r2 = ""
            if (r0 == 0) goto L27
            boolean r0 = r3.envSetup()
            if (r0 == 0) goto L21
            r3.prepareRecording()
            cn.easyar.engine.recorder.RecordListener r0 = r3.mListener
            r1 = 1
            r0.onMessage(r1, r2)
            return
        L21:
            cn.easyar.engine.recorder.RecordListener r0 = r3.mListener
            r0.onMessage(r1, r2)
            return
        L27:
            cn.easyar.engine.recorder.RecordListener r0 = r3.mListener
            r0.onMessage(r1, r2)
            return
    }

    public void prepareRecording() {
            r14 = this;
            java.lang.String r0 = ""
            r1 = 513(0x201, float:7.19E-43)
            cn.easyar.engine.recorder.AVRecorderConfig r2 = new cn.easyar.engine.recorder.AVRecorderConfig     // Catch: java.io.IOException -> L58
            cn.easyar.engine.recorder.AudioEncorderConfig r3 = new cn.easyar.engine.recorder.AudioEncorderConfig     // Catch: java.io.IOException -> L58
            int r4 = r14.audioBitrate     // Catch: java.io.IOException -> L58
            int r5 = r14.audioChannelCount     // Catch: java.io.IOException -> L58
            int r6 = r14.audioSampleRate     // Catch: java.io.IOException -> L58
            r3.<init>(r4, r5, r6)     // Catch: java.io.IOException -> L58
            cn.easyar.engine.recorder.VideoEncoderConfig r4 = new cn.easyar.engine.recorder.VideoEncoderConfig     // Catch: java.io.IOException -> L58
            int r8 = r14.width     // Catch: java.io.IOException -> L58
            int r9 = r14.height     // Catch: java.io.IOException -> L58
            int r10 = r14.tex_width     // Catch: java.io.IOException -> L58
            int r11 = r14.tex_height     // Catch: java.io.IOException -> L58
            int r12 = r14.videoBitrate     // Catch: java.io.IOException -> L58
            int r13 = r14.mode     // Catch: java.io.IOException -> L58
            r7 = r4
            r7.<init>(r8, r9, r10, r11, r12, r13)     // Catch: java.io.IOException -> L58
            r4 = r7
            boolean r5 = r14.rotationClip     // Catch: java.io.IOException -> L58
            java.lang.String r6 = r14.file     // Catch: java.io.IOException -> L58
            cn.easyar.engine.recorder.RecordListener r7 = r14.mListener     // Catch: java.io.IOException -> L58
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.io.IOException -> L58
            r14.mAVRecorderConfig = r2     // Catch: java.io.IOException -> L58
            r3 = 0
            cn.easyar.engine.recorder.MicroPhoneEncoder r4 = new cn.easyar.engine.recorder.MicroPhoneEncoder     // Catch: java.lang.Exception -> L50
            r4.<init>(r2)     // Catch: java.lang.Exception -> L50
            r14.mMicroPhoneEncoder = r4     // Catch: java.lang.Exception -> L50
            cn.easyar.engine.recorder.TextureMovieEncoder r2 = new cn.easyar.engine.recorder.TextureMovieEncoder     // Catch: java.lang.RuntimeException -> L41
            cn.easyar.engine.recorder.AVRecorderConfig r4 = r14.mAVRecorderConfig     // Catch: java.lang.RuntimeException -> L41
            r2.<init>(r4)     // Catch: java.lang.RuntimeException -> L41
            r14.mTexture2Video = r2     // Catch: java.lang.RuntimeException -> L41
            return
        L41:
            r14.mAVRecorderConfig = r3
            cn.easyar.engine.recorder.MicroPhoneEncoder r2 = r14.mMicroPhoneEncoder
            r2.releaseRecording()
            r14.mMicroPhoneEncoder = r3
            cn.easyar.engine.recorder.RecordListener r2 = r14.mListener
            r2.onMessage(r1, r0)
            return
        L50:
            r14.mAVRecorderConfig = r3
            cn.easyar.engine.recorder.RecordListener r2 = r14.mListener
            r2.onMessage(r1, r0)
            return
        L58:
            cn.easyar.engine.recorder.RecordListener r2 = r14.mListener
            r2.onMessage(r1, r0)
            return
    }

    public void release() {
            r0 = this;
            r0.releaseRecording()
            return
    }

    public void releaseRecording() {
            r3 = this;
            r0 = 0
            r3.mTexture2Video = r0
            r3.mMicroPhoneEncoder = r0
            r3.mAVRecorderConfig = r0
            cn.easyar.engine.recorder.RecordListener r0 = r3.mListener
            r1 = 8
            java.lang.String r2 = ""
            r0.onMessage(r1, r2)
            return
    }

    public void setAudioBitrate(int r1) {
            r0 = this;
            r0.audioBitrate = r1
            return
    }

    public void setAudioSampleRate(int r1) {
            r0 = this;
            r0.audioSampleRate = r1
            return
    }

    public void setCachedFile(java.lang.String r1) {
            r0 = this;
            r0.file = r1
            return
    }

    public void setChannelCount(int r1) {
            r0 = this;
            r0.audioChannelCount = r1
            return
    }

    public void setHeight(int r1) {
            r0 = this;
            r0.height = r1
            return
    }

    public void setRectRotationClip(boolean r1) {
            r0 = this;
            r0.rotationClip = r1
            return
    }

    public void setTexture(int r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.texId
            if (r0 != r2) goto Lc
            int r0 = r1.tex_width
            if (r0 != r3) goto Lc
            int r0 = r1.tex_height
            if (r0 == r4) goto Lf
        Lc:
            r0 = 1
            r1.configUpdated = r0
        Lf:
            r1.texId = r2
            r1.tex_width = r3
            r1.tex_height = r4
            return
    }

    public void setVideoBitrate(int r1) {
            r0 = this;
            r0.videoBitrate = r1
            return
    }

    public void setWidth(int r1) {
            r0 = this;
            r0.width = r1
            return
    }

    public void setZoomMode(int r1) {
            r0 = this;
            r0.mode = r1
            return
    }

    public void start() {
            r0 = this;
            r0.startRecording()
            return
    }

    public void startRecording() {
            r3 = this;
            cn.easyar.engine.recorder.TextureMovieEncoder r0 = r3.mTexture2Video
            r0.startRecording()
            cn.easyar.engine.recorder.MicroPhoneEncoder r0 = r3.mMicroPhoneEncoder     // Catch: java.lang.IllegalStateException -> L16
            r0.startRecording()     // Catch: java.lang.IllegalStateException -> L16
            cn.easyar.engine.recorder.RecordListener r0 = r3.mListener
            r1 = 2
            java.lang.String r2 = ""
            r0.onMessage(r1, r2)
            r0 = 0
            r3.configUpdated = r0
            return
        L16:
            cn.easyar.engine.recorder.TextureMovieEncoder r0 = r3.mTexture2Video
            r1 = 0
            r0.stopRecording(r1, r1)
            cn.easyar.engine.recorder.RecordListener r0 = r3.mListener
            r1 = 514(0x202, float:7.2E-43)
            java.lang.String r2 = "startRecording failed due to illegal state"
            r0.onMessage(r1, r2)
            return
    }

    public void stop() {
            r0 = this;
            r0.stopRecording()
            return
    }

    public void stopRecording() {
            r3 = this;
            cn.easyar.engine.recorder.MicroPhoneEncoder r0 = r3.mMicroPhoneEncoder
            r0.stopRecording()
            cn.easyar.engine.recorder.TextureMovieEncoder r0 = r3.mTexture2Video
            r1 = 0
            r0.stopRecording(r1, r1)
            cn.easyar.engine.recorder.RecordListener r0 = r3.mListener
            r1 = 4
            java.lang.String r2 = ""
            r0.onMessage(r1, r2)
            return
    }

    public void updateFrame() {
            r3 = this;
            int r0 = r3.texId
            int r1 = r3.tex_width
            int r2 = r3.tex_height
            r3.updateRecording(r0, r1, r2)
            return
    }

    public void updateRecording(int r2, int r3, int r4) {
            r1 = this;
            boolean r0 = r1.configUpdated
            if (r0 == 0) goto L1b
            cn.easyar.engine.recorder.AVRecorderConfig r0 = r1.mAVRecorderConfig
            r0.setTextureHeight(r4)
            cn.easyar.engine.recorder.AVRecorderConfig r4 = r1.mAVRecorderConfig
            r4.setTextureWidth(r3)
            cn.easyar.engine.recorder.TextureMovieEncoder r3 = r1.mTexture2Video
            int r4 = r1.tex_width
            int r0 = r1.tex_height
            r3.updateRecording(r2, r4, r0)
            r2 = 0
            r1.configUpdated = r2
            return
        L1b:
            cn.easyar.engine.recorder.TextureMovieEncoder r3 = r1.mTexture2Video
            r3.updateRecording(r2)
            return
    }
}

package com.baidu.idl.face.platform.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceDetectActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.SurfaceHolder.Callback, android.hardware.Camera.PreviewCallback, android.hardware.Camera.ErrorCallback, com.baidu.idl.face.platform.ui.utils.VolumeUtils.VolumeCallback, com.baidu.idl.face.platform.IDetectStrategyCallback {
    public static final java.lang.String TAG = "FaceDetectActivity";
    protected java.util.HashMap<java.lang.String, java.lang.String> mBase64ImageMap;
    protected android.hardware.Camera mCamera;
    protected int mCameraId;
    protected android.hardware.Camera.Parameters mCameraParam;
    protected android.widget.ImageView mCloseView;
    protected int mDisplayHeight;
    protected int mDisplayWidth;
    protected com.baidu.idl.face.platform.FaceConfig mFaceConfig;
    protected com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView mFaceDetectRoundView;
    protected android.widget.FrameLayout mFrameLayout;
    protected boolean mHasShownTimeoutDialog;
    protected com.baidu.idl.face.platform.IDetectStrategy mIDetectStrategy;
    protected android.widget.LinearLayout mImageLayout;
    protected android.widget.LinearLayout mImageLayout2;
    protected volatile boolean mIsCompletion;
    protected boolean mIsCreateSurface;
    protected volatile boolean mIsEnableSound;
    protected int mPreviewDegree;
    protected int mPreviewHight;
    private android.graphics.Rect mPreviewRect;
    protected int mPreviewWidth;
    protected android.view.View mRootView;
    protected android.widget.ImageView mSoundView;
    protected android.widget.ImageView mSuccessView;
    protected int mSurfaceHeight;
    protected android.view.SurfaceHolder mSurfaceHolder;
    protected android.view.SurfaceView mSurfaceView;
    protected int mSurfaceWidth;
    protected android.graphics.drawable.Drawable mTipsIcon;
    protected android.widget.TextView mTipsTopView;
    public android.view.View mViewBg;
    protected android.content.BroadcastReceiver mVolumeReceiver;





    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.baidu.idl.face.platform.ui.FaceDetectActivity$5, reason: invalid class name */
    static /* synthetic */ class AnonymousClass5 {
        static final /* synthetic */ int[] $SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum = null;

        static {
                com.baidu.idl.face.platform.FaceStatusNewEnum[] r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.baidu.idl.face.platform.ui.FaceDetectActivity.AnonymousClass5.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum = r0
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceDetectActivity.AnonymousClass5.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L1d
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofUpRange     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceDetectActivity.AnonymousClass5.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L28
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofDownRange     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceDetectActivity.AnonymousClass5.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L33
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofLeftRange     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceDetectActivity.AnonymousClass5.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L3e
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofRightRange     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                return
        }

        public AnonymousClass5() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            return
    }

    public FaceDetectActivity() {
            r2 = this;
            r2.<init>()
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r2.mPreviewRect = r0
            r0 = 0
            r2.mDisplayWidth = r0
            r2.mDisplayHeight = r0
            r2.mSurfaceWidth = r0
            r2.mSurfaceHeight = r0
            r1 = 1
            r2.mIsEnableSound = r1
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r2.mBase64ImageMap = r1
            r2.mIsCreateSurface = r0
            r2.mIsCompletion = r0
            return
    }

    private static android.graphics.Bitmap base64ToBitmap(java.lang.String r2) {
            r0 = 2
            byte[] r2 = com.baidu.idl.face.platform.utils.Base64Utils.decode(r2, r0)
            r0 = 0
            int r1 = r2.length
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeByteArray(r2, r0, r1)
            return r2
    }

    private int displayOrientation(android.content.Context r4) {
            r3 = this;
            java.lang.String r0 = "window"
            java.lang.Object r4 = r4.getSystemService(r0)
            android.view.WindowManager r4 = (android.view.WindowManager) r4
            r0 = 90
            if (r4 != 0) goto Ld
            return r0
        Ld:
            android.view.Display r4 = r4.getDefaultDisplay()
            int r4 = r4.getRotation()
            r1 = 0
            r2 = 1
            if (r4 == 0) goto L21
            if (r4 == r2) goto L28
            r0 = 2
            if (r4 == r0) goto L26
            r0 = 3
            if (r4 == r0) goto L23
        L21:
            r0 = 0
            goto L28
        L23:
            r0 = 270(0x10e, float:3.78E-43)
            goto L28
        L26:
            r0 = 180(0xb4, float:2.52E-43)
        L28:
            int r4 = 360 - r0
            int r4 = r4 % 360
            boolean r1 = com.baidu.idl.face.platform.utils.APIUtils.hasGingerbread()
            if (r1 == 0) goto L51
            android.hardware.Camera$CameraInfo r4 = new android.hardware.Camera$CameraInfo
            r4.<init>()
            int r1 = r3.mCameraId
            android.hardware.Camera.getCameraInfo(r1, r4)
            int r1 = r4.facing
            if (r1 != r2) goto L4a
            int r4 = r4.orientation
            int r4 = r4 + r0
            int r4 = r4 % 360
            int r4 = 360 - r4
            int r4 = r4 % 360
            return r4
        L4a:
            int r4 = r4.orientation
            int r4 = r4 - r0
            int r4 = r4 + 360
            int r4 = r4 % 360
        L51:
            return r4
    }

    private void onRefreshView(com.baidu.idl.face.platform.FaceStatusNewEnum r2, java.lang.String r3) {
            r1 = this;
            int[] r0 = com.baidu.idl.face.platform.ui.FaceDetectActivity.AnonymousClass5.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L23
            r0 = 2
            if (r2 == r0) goto L1d
            r0 = 3
            if (r2 == r0) goto L1d
            r0 = 4
            if (r2 == r0) goto L1d
            r0 = 5
            if (r2 == r0) goto L1d
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r2 = r1.mFaceDetectRoundView
            r2.setTipTopText(r3)
            return
        L1d:
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r2 = r1.mFaceDetectRoundView
            r2.setTipTopText(r3)
            return
        L23:
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r2 = r1.mFaceDetectRoundView
            r2.setTipTopText(r3)
            return
    }

    private android.hardware.Camera open() {
            r5 = this;
            int r0 = android.hardware.Camera.getNumberOfCameras()
            if (r0 != 0) goto L8
            r0 = 0
            return r0
        L8:
            r1 = 0
            r2 = 0
        La:
            if (r2 >= r0) goto L1d
            android.hardware.Camera$CameraInfo r3 = new android.hardware.Camera$CameraInfo
            r3.<init>()
            android.hardware.Camera.getCameraInfo(r2, r3)
            int r3 = r3.facing
            r4 = 1
            if (r3 != r4) goto L1a
            goto L1d
        L1a:
            int r2 = r2 + 1
            goto La
        L1d:
            if (r2 >= r0) goto L26
            android.hardware.Camera r0 = android.hardware.Camera.open(r2)
            r5.mCameraId = r2
            return r0
        L26:
            android.hardware.Camera r0 = android.hardware.Camera.open(r1)
            r5.mCameraId = r1
            return r0
    }

    private void saveAllImage(java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r2, java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r3) {
            r1 = this;
            if (r2 == 0) goto L1c
            int r0 = r2.size()
            if (r0 <= 0) goto L1c
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.Set r2 = r2.entrySet()
            r0.<init>(r2)
            com.baidu.idl.face.platform.ui.FaceDetectActivity$3 r2 = new com.baidu.idl.face.platform.ui.FaceDetectActivity$3
            r2.<init>(r1)
            java.util.Collections.sort(r0, r2)
            r1.setImageView1(r0)
        L1c:
            if (r3 == 0) goto L38
            int r2 = r3.size()
            if (r2 <= 0) goto L38
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.Set r3 = r3.entrySet()
            r2.<init>(r3)
            com.baidu.idl.face.platform.ui.FaceDetectActivity$4 r3 = new com.baidu.idl.face.platform.ui.FaceDetectActivity$4
            r3.<init>(r1)
            java.util.Collections.sort(r2, r3)
            r1.setImageView2(r2)
        L38:
            return
    }

    private void setImageView1(java.util.List<java.util.Map.Entry<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo>> r5) {
            r4 = this;
            android.widget.LinearLayout r0 = r4.mImageLayout
            r0.removeAllViews()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            com.baidu.idl.face.platform.model.ImageInfo r0 = (com.baidu.idl.face.platform.model.ImageInfo) r0
            java.lang.String r0 = r0.getBase64()
            android.graphics.Bitmap r0 = base64ToBitmap(r0)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r4)
            r1.setImageBitmap(r0)
            android.widget.LinearLayout r0 = r4.mImageLayout
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 300(0x12c, float:4.2E-43)
            r2.<init>(r3, r3)
            r0.addView(r1, r2)
            goto L9
        L38:
            return
    }

    private void setImageView2(java.util.List<java.util.Map.Entry<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo>> r5) {
            r4 = this;
            android.widget.LinearLayout r0 = r4.mImageLayout2
            r0.removeAllViews()
            java.util.Iterator r5 = r5.iterator()
        L9:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L38
            java.lang.Object r0 = r5.next()
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            java.lang.Object r0 = r0.getValue()
            com.baidu.idl.face.platform.model.ImageInfo r0 = (com.baidu.idl.face.platform.model.ImageInfo) r0
            java.lang.String r0 = r0.getBase64()
            android.graphics.Bitmap r0 = base64ToBitmap(r0)
            android.widget.ImageView r1 = new android.widget.ImageView
            r1.<init>(r4)
            r1.setImageBitmap(r0)
            android.widget.LinearLayout r0 = r4.mImageLayout2
            android.widget.LinearLayout$LayoutParams r2 = new android.widget.LinearLayout$LayoutParams
            r3 = 300(0x12c, float:4.2E-43)
            r2.<init>(r3, r3)
            r0.addView(r1, r2)
            goto L9
        L38:
            return
    }

    private void setScreenBright() {
            r1 = this;
            int r0 = com.baidu.idl.face.platform.ui.utils.BrightnessUtils.getScreenBrightness(r1)
            int r0 = r0 + 100
            com.baidu.idl.face.platform.ui.utils.BrightnessUtils.setBrightness(r1, r0)
            return
    }

    public void finish() {
            r0 = this;
            super/*android.app.Activity*/.finish()
            return
    }

    public void onCreate(android.os.Bundle r5) {
            r4 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onCreate(r5)
            r4.setScreenBright()
            android.view.Window r5 = r4.getWindow()
            r0 = 128(0x80, float:1.8E-43)
            r5.addFlags(r0)
            int r5 = com.baidu.idl.face.platform.ui.R.layout.activity_face_detect_v3100
            r4.setContentView(r5)
            android.util.DisplayMetrics r5 = new android.util.DisplayMetrics
            r5.<init>()
            android.view.WindowManager r0 = r4.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r5)
            int r0 = r5.widthPixels
            r4.mDisplayWidth = r0
            int r5 = r5.heightPixels
            r4.mDisplayHeight = r5
            com.baidu.idl.face.platform.ui.FaceSDKResSettings.initializeResId()
            com.baidu.idl.face.platform.FaceSDKManager r5 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.face.platform.FaceConfig r5 = r5.getFaceConfig()
            r4.mFaceConfig = r5
            java.lang.String r5 = "audio"
            java.lang.Object r5 = r4.getSystemService(r5)
            android.media.AudioManager r5 = (android.media.AudioManager) r5
            r0 = 3
            int r5 = r5.getStreamVolume(r0)
            r1 = 0
            if (r5 <= 0) goto L50
            com.baidu.idl.face.platform.FaceConfig r5 = r4.mFaceConfig
            boolean r5 = r5.isSound()
            goto L51
        L50:
            r5 = 0
        L51:
            r4.mIsEnableSound = r5
            int r5 = com.baidu.idl.face.platform.ui.R.id.detect_root_layout
            android.view.View r5 = r4.findViewById(r5)
            r4.mRootView = r5
            int r2 = com.baidu.idl.face.platform.ui.R.id.detect_surface_layout
            android.view.View r5 = r5.findViewById(r2)
            android.widget.FrameLayout r5 = (android.widget.FrameLayout) r5
            r4.mFrameLayout = r5
            android.view.SurfaceView r5 = new android.view.SurfaceView
            r5.<init>(r4)
            r4.mSurfaceView = r5
            android.view.SurfaceHolder r5 = r5.getHolder()
            r4.mSurfaceHolder = r5
            r5.setSizeFromLayout()
            android.view.SurfaceHolder r5 = r4.mSurfaceHolder
            r5.addCallback(r4)
            android.view.SurfaceHolder r5 = r4.mSurfaceHolder
            r5.setType(r0)
            int r5 = r4.mDisplayWidth
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            float r5 = (float) r5
            r2 = 1061158912(0x3f400000, float:0.75)
            float r5 = r5 * r2
            r2 = 1063675494(0x3f666666, float:0.9)
            float r5 = r5 * r2
            int r2 = (int) r5
            r3 = 1142947840(0x44200000, float:640.0)
            float r5 = r5 * r3
            r3 = 1139802112(0x43f00000, float:480.0)
            float r5 = r5 / r3
            int r5 = (int) r5
            r3 = 17
            r0.<init>(r2, r5, r3)
            android.view.SurfaceView r5 = r4.mSurfaceView
            r5.setLayoutParams(r0)
            android.widget.FrameLayout r5 = r4.mFrameLayout
            android.view.SurfaceView r0 = r4.mSurfaceView
            r5.addView(r0)
            android.view.View r5 = r4.mRootView
            int r0 = com.baidu.idl.face.platform.ui.R.id.detect_close
            android.view.View r5 = r5.findViewById(r0)
            com.baidu.idl.face.platform.ui.FaceDetectActivity$1 r2 = new com.baidu.idl.face.platform.ui.FaceDetectActivity$1
            r2.<init>(r4)
            r5.setOnClickListener(r2)
            android.view.View r5 = r4.mRootView
            int r2 = com.baidu.idl.face.platform.ui.R.id.detect_face_round
            android.view.View r5 = r5.findViewById(r2)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r5 = (com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView) r5
            r4.mFaceDetectRoundView = r5
            r5.setIsActiveLive(r1)
            android.view.View r5 = r4.mRootView
            android.view.View r5 = r5.findViewById(r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.mCloseView = r5
            android.view.View r5 = r4.mRootView
            int r0 = com.baidu.idl.face.platform.ui.R.id.detect_sound
            android.view.View r5 = r5.findViewById(r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.mSoundView = r5
            boolean r0 = r4.mIsEnableSound
            if (r0 == 0) goto Le3
            int r0 = com.baidu.idl.face.platform.ui.R.mipmap.icon_titlebar_voice2
            goto Le5
        Le3:
            int r0 = com.baidu.idl.face.platform.ui.R.drawable.collect_image_voice_selector
        Le5:
            r5.setImageResource(r0)
            android.widget.ImageView r5 = r4.mSoundView
            com.baidu.idl.face.platform.ui.FaceDetectActivity$2 r0 = new com.baidu.idl.face.platform.ui.FaceDetectActivity$2
            r0.<init>(r4)
            r5.setOnClickListener(r0)
            android.view.View r5 = r4.mRootView
            int r0 = com.baidu.idl.face.platform.ui.R.id.detect_top_tips
            android.view.View r5 = r5.findViewById(r0)
            android.widget.TextView r5 = (android.widget.TextView) r5
            r4.mTipsTopView = r5
            android.view.View r5 = r4.mRootView
            int r0 = com.baidu.idl.face.platform.ui.R.id.detect_success_image
            android.view.View r5 = r5.findViewById(r0)
            android.widget.ImageView r5 = (android.widget.ImageView) r5
            r4.mSuccessView = r5
            android.view.View r5 = r4.mRootView
            int r0 = com.baidu.idl.face.platform.ui.R.id.detect_result_image_layout
            android.view.View r5 = r5.findViewById(r0)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r4.mImageLayout = r5
            android.view.View r5 = r4.mRootView
            int r0 = com.baidu.idl.face.platform.ui.R.id.detect_result_image_layout2
            android.view.View r5 = r5.findViewById(r0)
            android.widget.LinearLayout r5 = (android.widget.LinearLayout) r5
            r4.mImageLayout2 = r5
            int r5 = com.baidu.idl.face.platform.ui.R.id.view_bg
            android.view.View r5 = r4.findViewById(r5)
            r4.mViewBg = r5
            java.util.HashMap<java.lang.String, java.lang.String> r5 = r4.mBase64ImageMap
            if (r5 == 0) goto L131
            r5.clear()
        L131:
            return
    }

    public void onDetectCompletion(com.baidu.idl.face.platform.FaceStatusNewEnum r1, java.lang.String r2, java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r3, java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r4) {
            r0 = this;
            boolean r3 = r0.mIsCompletion
            if (r3 == 0) goto L5
            goto Lf
        L5:
            r0.onRefreshView(r1, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r2 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            if (r1 != r2) goto Lf
            r1 = 1
            r0.mIsCompletion = r1
        Lf:
            return
    }

    @Override // android.hardware.Camera.ErrorCallback
    public void onError(int r1, android.hardware.Camera r2) {
            r0 = this;
            return
    }

    public void onPause() {
            r1 = this;
            com.baidu.idl.face.platform.IDetectStrategy r0 = r1.mIDetectStrategy
            if (r0 == 0) goto L7
            r0.reset()
        L7:
            super/*androidx.fragment.app.FragmentActivity*/.onPause()
            android.content.BroadcastReceiver r0 = r1.mVolumeReceiver
            com.baidu.idl.face.platform.ui.utils.VolumeUtils.unRegisterVolumeReceiver(r1, r0)
            r0 = 0
            r1.mVolumeReceiver = r0
            r0 = 0
            r1.mIsCompletion = r0
            r1.stopPreview()
            return
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] r3, android.hardware.Camera r4) {
            r2 = this;
            boolean r4 = r2.mIsCompletion
            if (r4 == 0) goto L5
            goto L44
        L5:
            com.baidu.idl.face.platform.IDetectStrategy r4 = r2.mIDetectStrategy
            if (r4 != 0) goto L3d
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r4 = r2.mFaceDetectRoundView
            if (r4 == 0) goto L3d
            float r4 = r4.getRound()
            r0 = 0
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 <= 0) goto L3d
            com.baidu.idl.face.platform.FaceSDKManager r4 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.face.platform.IDetectStrategy r4 = r4.getDetectStrategyModule()
            r2.mIDetectStrategy = r4
            int r0 = r2.mPreviewDegree
            r4.setPreviewDegree(r0)
            com.baidu.idl.face.platform.IDetectStrategy r4 = r2.mIDetectStrategy
            boolean r0 = r2.mIsEnableSound
            r4.setDetectStrategySoundEnable(r0)
            int r4 = r2.mDisplayWidth
            int r0 = r2.mPreviewHight
            int r1 = r2.mPreviewWidth
            android.graphics.Rect r4 = com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.getPreviewDetectRect(r4, r0, r1)
            com.baidu.idl.face.platform.IDetectStrategy r0 = r2.mIDetectStrategy
            android.graphics.Rect r1 = r2.mPreviewRect
            r0.setDetectStrategyConfig(r1, r4, r2)
        L3d:
            com.baidu.idl.face.platform.IDetectStrategy r4 = r2.mIDetectStrategy
            if (r4 == 0) goto L44
            r4.detectStrategy(r3)
        L44:
            return
    }

    public void onResume() {
            r2 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onResume()
            boolean r0 = r2.mHasShownTimeoutDialog
            if (r0 != 0) goto L1d
            r0 = 3
            r2.setVolumeControlStream(r0)
            android.content.BroadcastReceiver r0 = com.baidu.idl.face.platform.ui.utils.VolumeUtils.registerVolumeReceiver(r2, r2)
            r2.mVolumeReceiver = r0
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r0 = r2.mFaceDetectRoundView
            if (r0 == 0) goto L1a
            java.lang.String r1 = "请将脸移入取景框"
            r0.setTipTopText(r1)
        L1a:
            r2.startPreview()
        L1d:
            return
    }

    public void onStop() {
            r0 = this;
            super.onStop()
            return
    }

    protected void startPreview() {
            r5 = this;
            android.view.SurfaceView r0 = r5.mSurfaceView
            if (r0 == 0) goto L15
            android.view.SurfaceHolder r0 = r0.getHolder()
            if (r0 == 0) goto L15
            android.view.SurfaceView r0 = r5.mSurfaceView
            android.view.SurfaceHolder r0 = r0.getHolder()
            r5.mSurfaceHolder = r0
            r0.addCallback(r5)
        L15:
            android.hardware.Camera r0 = r5.mCamera
            r1 = 0
            if (r0 == 0) goto L2b
            r0.setPreviewCallback(r1)     // Catch: java.lang.Exception -> L2a
            android.hardware.Camera r0 = r5.mCamera     // Catch: java.lang.Exception -> L2a
            r0.stopPreview()     // Catch: java.lang.Exception -> L2a
            android.hardware.Camera r0 = r5.mCamera     // Catch: java.lang.Exception -> L2a
            r0.release()     // Catch: java.lang.Exception -> L2a
            r5.mCamera = r1     // Catch: java.lang.Exception -> L2a
            goto L2b
        L2a:
        L2b:
            android.hardware.Camera r0 = r5.mCamera
            if (r0 != 0) goto L37
            android.hardware.Camera r0 = r5.open()     // Catch: java.lang.Throwable -> L36
            r5.mCamera = r0     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
        L37:
            android.hardware.Camera r0 = r5.mCamera
            if (r0 != 0) goto L3d
            goto Lbf
        L3d:
            android.hardware.Camera$Parameters r2 = r5.mCameraParam
            if (r2 != 0) goto L47
            android.hardware.Camera$Parameters r0 = r0.getParameters()
            r5.mCameraParam = r0
        L47:
            android.hardware.Camera$Parameters r0 = r5.mCameraParam
            r2 = 256(0x100, float:3.59E-43)
            r0.setPictureFormat(r2)
            int r0 = r5.displayOrientation(r5)
            android.hardware.Camera r2 = r5.mCamera
            r2.setDisplayOrientation(r0)
            android.hardware.Camera$Parameters r2 = r5.mCameraParam
            java.lang.String r3 = "rotation"
            r2.set(r3, r0)
            r5.mPreviewDegree = r0
            com.baidu.idl.face.platform.IDetectStrategy r2 = r5.mIDetectStrategy
            if (r2 == 0) goto L67
            r2.setPreviewDegree(r0)
        L67:
            android.hardware.Camera$Parameters r0 = r5.mCameraParam
            android.graphics.Point r2 = new android.graphics.Point
            r3 = 640(0x280, float:8.97E-43)
            r4 = 480(0x1e0, float:6.73E-43)
            r2.<init>(r3, r4)
            android.graphics.Point r0 = com.baidu.idl.face.platform.ui.utils.CameraPreviewUtils.getBestPreview(r0, r2)
            int r2 = r0.x
            r5.mPreviewWidth = r2
            int r0 = r0.y
            r5.mPreviewHight = r0
            android.graphics.Rect r3 = r5.mPreviewRect
            r4 = 0
            r3.set(r4, r4, r0, r2)
            android.hardware.Camera$Parameters r0 = r5.mCameraParam
            int r2 = r5.mPreviewWidth
            int r3 = r5.mPreviewHight
            r0.setPreviewSize(r2, r3)
            android.hardware.Camera r0 = r5.mCamera
            android.hardware.Camera$Parameters r2 = r5.mCameraParam
            r0.setParameters(r2)
            android.hardware.Camera r0 = r5.mCamera     // Catch: java.lang.Exception -> Lb0 java.lang.RuntimeException -> Lb8
            android.view.SurfaceHolder r2 = r5.mSurfaceHolder     // Catch: java.lang.Exception -> Lb0 java.lang.RuntimeException -> Lb8
            r0.setPreviewDisplay(r2)     // Catch: java.lang.Exception -> Lb0 java.lang.RuntimeException -> Lb8
            android.hardware.Camera r0 = r5.mCamera     // Catch: java.lang.Exception -> Lb0 java.lang.RuntimeException -> Lb8
            r0.stopPreview()     // Catch: java.lang.Exception -> Lb0 java.lang.RuntimeException -> Lb8
            android.hardware.Camera r0 = r5.mCamera     // Catch: java.lang.Exception -> Lb0 java.lang.RuntimeException -> Lb8
            r0.setErrorCallback(r5)     // Catch: java.lang.Exception -> Lb0 java.lang.RuntimeException -> Lb8
            android.hardware.Camera r0 = r5.mCamera     // Catch: java.lang.Exception -> Lb0 java.lang.RuntimeException -> Lb8
            r0.setPreviewCallback(r5)     // Catch: java.lang.Exception -> Lb0 java.lang.RuntimeException -> Lb8
            android.hardware.Camera r0 = r5.mCamera     // Catch: java.lang.Exception -> Lb0 java.lang.RuntimeException -> Lb8
            r0.startPreview()     // Catch: java.lang.Exception -> Lb0 java.lang.RuntimeException -> Lb8
            goto Lbf
        Lb0:
            android.hardware.Camera r0 = r5.mCamera
            com.baidu.idl.face.platform.ui.utils.CameraUtils.releaseCamera(r0)
            r5.mCamera = r1
            goto Lbf
        Lb8:
            android.hardware.Camera r0 = r5.mCamera
            com.baidu.idl.face.platform.ui.utils.CameraUtils.releaseCamera(r0)
            r5.mCamera = r1
        Lbf:
            return
    }

    protected void stopPreview() {
            r3 = this;
            android.hardware.Camera r0 = r3.mCamera
            r1 = 0
            if (r0 == 0) goto L23
            r0.setErrorCallback(r1)     // Catch: java.lang.Throwable -> L12 java.lang.Throwable -> L1a
            android.hardware.Camera r0 = r3.mCamera     // Catch: java.lang.Throwable -> L12 java.lang.Throwable -> L1a
            r0.setPreviewCallback(r1)     // Catch: java.lang.Throwable -> L12 java.lang.Throwable -> L1a
            android.hardware.Camera r0 = r3.mCamera     // Catch: java.lang.Throwable -> L12 java.lang.Throwable -> L1a
            r0.stopPreview()     // Catch: java.lang.Throwable -> L12 java.lang.Throwable -> L1a
        L12:
            android.hardware.Camera r0 = r3.mCamera
            com.baidu.idl.face.platform.ui.utils.CameraUtils.releaseCamera(r0)
            r3.mCamera = r1
            goto L23
        L1a:
            r0 = move-exception
            android.hardware.Camera r2 = r3.mCamera
            com.baidu.idl.face.platform.ui.utils.CameraUtils.releaseCamera(r2)
            r3.mCamera = r1
            throw r0
        L23:
            android.view.SurfaceHolder r0 = r3.mSurfaceHolder
            if (r0 == 0) goto L2a
            r0.removeCallback(r3)
        L2a:
            com.baidu.idl.face.platform.IDetectStrategy r0 = r3.mIDetectStrategy
            if (r0 == 0) goto L33
            r0.reset()
            r3.mIDetectStrategy = r1
        L33:
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(android.view.SurfaceHolder r1, int r2, int r3, int r4) {
            r0 = this;
            r0.mSurfaceWidth = r3
            r0.mSurfaceHeight = r4
            android.view.Surface r1 = r1.getSurface()
            if (r1 != 0) goto Lb
            return
        Lb:
            r0.startPreview()
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(android.view.SurfaceHolder r1) {
            r0 = this;
            r1 = 1
            r0.mIsCreateSurface = r1
            return
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceDestroyed(android.view.SurfaceHolder r1) {
            r0 = this;
            r1 = 0
            r0.mIsCreateSurface = r1
            return
    }

    @Override // com.baidu.idl.face.platform.ui.utils.VolumeUtils.VolumeCallback
    public void volumeChanged() {
            r2 = this;
            java.lang.String r0 = "audio"
            java.lang.Object r0 = r2.getSystemService(r0)     // Catch: java.lang.Exception -> L2d
            android.media.AudioManager r0 = (android.media.AudioManager) r0     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L2d
            r1 = 3
            int r0 = r0.getStreamVolume(r1)     // Catch: java.lang.Exception -> L2d
            if (r0 <= 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            r2.mIsEnableSound = r0     // Catch: java.lang.Exception -> L2d
            android.widget.ImageView r0 = r2.mSoundView     // Catch: java.lang.Exception -> L2d
            boolean r1 = r2.mIsEnableSound     // Catch: java.lang.Exception -> L2d
            if (r1 == 0) goto L1f
            int r1 = com.baidu.idl.face.platform.ui.R.mipmap.icon_titlebar_voice2     // Catch: java.lang.Exception -> L2d
            goto L21
        L1f:
            int r1 = com.baidu.idl.face.platform.ui.R.mipmap.icon_titlebar_voice1     // Catch: java.lang.Exception -> L2d
        L21:
            r0.setImageResource(r1)     // Catch: java.lang.Exception -> L2d
            com.baidu.idl.face.platform.IDetectStrategy r0 = r2.mIDetectStrategy     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L2d
            boolean r1 = r2.mIsEnableSound     // Catch: java.lang.Exception -> L2d
            r0.setDetectStrategySoundEnable(r1)     // Catch: java.lang.Exception -> L2d
        L2d:
            return
    }
}

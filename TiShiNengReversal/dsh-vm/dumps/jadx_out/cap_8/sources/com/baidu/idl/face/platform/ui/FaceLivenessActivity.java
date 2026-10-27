package com.baidu.idl.face.platform.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceLivenessActivity extends androidx.appcompat.app.AppCompatActivity implements android.view.SurfaceHolder.Callback, android.hardware.Camera.PreviewCallback, android.hardware.Camera.ErrorCallback, com.baidu.idl.face.platform.ui.utils.VolumeUtils.VolumeCallback, com.baidu.idl.face.platform.ILivenessStrategyCallback, com.baidu.idl.face.platform.ILivenessViewCallback {
    public static final java.lang.String TAG = "FaceLivenessActivity";
    private android.graphics.drawable.AnimationDrawable mAnimationDrawable;
    protected android.hardware.Camera mCamera;
    protected int mCameraId;
    protected android.hardware.Camera.Parameters mCameraParam;
    protected android.widget.ImageView mCloseView;
    private android.content.Context mContext;
    protected int mDisplayHeight;
    protected int mDisplayWidth;
    protected com.baidu.idl.face.platform.FaceConfig mFaceConfig;
    protected com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView mFaceDetectRoundView;
    protected android.widget.FrameLayout mFrameLayout;
    protected boolean mHasShownTimeoutDialog;
    protected com.baidu.idl.face.platform.ILivenessStrategy mILivenessStrategy;
    private android.widget.ImageView mImageAnim;
    protected android.widget.LinearLayout mImageLayout;
    protected android.widget.LinearLayout mImageLayout2;
    protected boolean mIsCompletion;
    protected boolean mIsCreateSurface;
    protected volatile boolean mIsEnableSound;
    private com.baidu.idl.face.platform.LivenessTypeEnum mLivenessType;
    protected int mPreviewDegree;
    protected int mPreviewHight;
    private android.graphics.Rect mPreviewRect;
    protected int mPreviewWidth;
    private android.widget.RelativeLayout mRelativeAddImageView;
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
    /* renamed from: com.baidu.idl.face.platform.ui.FaceLivenessActivity$6, reason: invalid class name */
    static /* synthetic */ class AnonymousClass6 {
        static final /* synthetic */ int[] $SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum = null;
        static final /* synthetic */ int[] $SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum = null;

        static {
                com.baidu.idl.face.platform.LivenessTypeEnum[] r0 = com.baidu.idl.face.platform.LivenessTypeEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum = r0
                r1 = 1
                com.baidu.idl.face.platform.LivenessTypeEnum r2 = com.baidu.idl.face.platform.LivenessTypeEnum.Eye     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch: java.lang.NoSuchFieldError -> L1d
                com.baidu.idl.face.platform.LivenessTypeEnum r3 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadLeft     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch: java.lang.NoSuchFieldError -> L28
                com.baidu.idl.face.platform.LivenessTypeEnum r4 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadRight     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch: java.lang.NoSuchFieldError -> L33
                com.baidu.idl.face.platform.LivenessTypeEnum r5 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadDown     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch: java.lang.NoSuchFieldError -> L3e
                com.baidu.idl.face.platform.LivenessTypeEnum r6 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadUp     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                r5 = 6
                int[] r6 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum     // Catch: java.lang.NoSuchFieldError -> L49
                com.baidu.idl.face.platform.LivenessTypeEnum r7 = com.baidu.idl.face.platform.LivenessTypeEnum.Mouth     // Catch: java.lang.NoSuchFieldError -> L49
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r6[r7] = r5     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                com.baidu.idl.face.platform.FaceStatusNewEnum[] r6 = com.baidu.idl.face.platform.FaceStatusNewEnum.values()
                int r6 = r6.length
                int[] r6 = new int[r6]
                com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum = r6
                com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK     // Catch: java.lang.NoSuchFieldError -> L5a
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L5a
                r6[r7] = r1     // Catch: java.lang.NoSuchFieldError -> L5a
            L5a:
                int[] r1 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L64
                com.baidu.idl.face.platform.FaceStatusNewEnum r6 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionComplete     // Catch: java.lang.NoSuchFieldError -> L64
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L64
                r1[r6] = r0     // Catch: java.lang.NoSuchFieldError -> L64
            L64:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L6e
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTooClose     // Catch: java.lang.NoSuchFieldError -> L6e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6e
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6e
            L6e:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L78
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTooFar     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L82
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeBeyondPreviewFrame     // Catch: java.lang.NoSuchFieldError -> L82
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L82
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> L82
            L82:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L8c
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeNoFaceDetected     // Catch: java.lang.NoSuchFieldError -> L8c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8c
                r0[r1] = r5     // Catch: java.lang.NoSuchFieldError -> L8c
            L8c:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L97
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLiveEye     // Catch: java.lang.NoSuchFieldError -> L97
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L97
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L97
            L97:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> La3
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLiveMouth     // Catch: java.lang.NoSuchFieldError -> La3
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La3
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La3
            La3:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> Laf
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLivePitchUp     // Catch: java.lang.NoSuchFieldError -> Laf
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Laf
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Laf
            Laf:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> Lbb
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLivePitchDown     // Catch: java.lang.NoSuchFieldError -> Lbb
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lbb
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lbb
            Lbb:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> Lc7
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLiveYawLeft     // Catch: java.lang.NoSuchFieldError -> Lc7
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc7
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc7
            Lc7:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> Ld3
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLiveYawRight     // Catch: java.lang.NoSuchFieldError -> Ld3
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld3
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld3
            Ld3:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> Ldf
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLiveYaw     // Catch: java.lang.NoSuchFieldError -> Ldf
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ldf
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ldf
            Ldf:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> Leb
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofUpRange     // Catch: java.lang.NoSuchFieldError -> Leb
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Leb
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Leb
            Leb:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> Lf7
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofDownRange     // Catch: java.lang.NoSuchFieldError -> Lf7
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf7
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf7
            Lf7:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L103
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofLeftRange     // Catch: java.lang.NoSuchFieldError -> L103
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L103
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L103
            L103:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L10f
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofRightRange     // Catch: java.lang.NoSuchFieldError -> L10f
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10f
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10f
            L10f:
                int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L11b
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionCodeTimeout     // Catch: java.lang.NoSuchFieldError -> L11b
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L11b
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L11b
            L11b:
                return
        }

        public AnonymousClass6() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            return
    }

    public FaceLivenessActivity() {
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
            r2.mIsCreateSurface = r0
            r2.mIsCompletion = r0
            r0 = 0
            r2.mLivenessType = r0
            return
    }

    static /* synthetic */ android.widget.ImageView access$000(com.baidu.idl.face.platform.ui.FaceLivenessActivity r0) {
            android.widget.ImageView r0 = r0.mImageAnim
            return r0
    }

    static /* synthetic */ android.widget.ImageView access$002(com.baidu.idl.face.platform.ui.FaceLivenessActivity r0, android.widget.ImageView r1) {
            r0.mImageAnim = r1
            return r1
    }

    static /* synthetic */ android.content.Context access$100(com.baidu.idl.face.platform.ui.FaceLivenessActivity r0) {
            android.content.Context r0 = r0.mContext
            return r0
    }

    static /* synthetic */ android.widget.RelativeLayout access$200(com.baidu.idl.face.platform.ui.FaceLivenessActivity r0) {
            android.widget.RelativeLayout r0 = r0.mRelativeAddImageView
            return r0
    }

    private void addImageView() {
            r2 = this;
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r0 = r2.mFaceDetectRoundView
            com.baidu.idl.face.platform.ui.FaceLivenessActivity$3 r1 = new com.baidu.idl.face.platform.ui.FaceLivenessActivity$3
            r1.<init>(r2)
            r0.post(r1)
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

    private void loadAnimSource() {
            r2 = this;
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = r2.mLivenessType
            if (r0 == 0) goto L4c
            int[] r1 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$LivenessTypeEnum
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L38;
                case 2: goto L30;
                case 3: goto L28;
                case 4: goto L20;
                case 5: goto L18;
                case 6: goto L10;
                default: goto Lf;
            }
        Lf:
            goto L3f
        L10:
            android.widget.ImageView r0 = r2.mImageAnim
            int r1 = com.baidu.idl.face.platform.ui.R.drawable.anim_mouth
            r0.setBackgroundResource(r1)
            goto L3f
        L18:
            android.widget.ImageView r0 = r2.mImageAnim
            int r1 = com.baidu.idl.face.platform.ui.R.drawable.anim_up
            r0.setBackgroundResource(r1)
            goto L3f
        L20:
            android.widget.ImageView r0 = r2.mImageAnim
            int r1 = com.baidu.idl.face.platform.ui.R.drawable.anim_down
            r0.setBackgroundResource(r1)
            goto L3f
        L28:
            android.widget.ImageView r0 = r2.mImageAnim
            int r1 = com.baidu.idl.face.platform.ui.R.drawable.anim_right
            r0.setBackgroundResource(r1)
            goto L3f
        L30:
            android.widget.ImageView r0 = r2.mImageAnim
            int r1 = com.baidu.idl.face.platform.ui.R.drawable.anim_left
            r0.setBackgroundResource(r1)
            goto L3f
        L38:
            android.widget.ImageView r0 = r2.mImageAnim
            int r1 = com.baidu.idl.face.platform.ui.R.drawable.anim_eye
            r0.setBackgroundResource(r1)
        L3f:
            android.widget.ImageView r0 = r2.mImageAnim
            android.graphics.drawable.Drawable r0 = r0.getBackground()
            android.graphics.drawable.AnimationDrawable r0 = (android.graphics.drawable.AnimationDrawable) r0
            r2.mAnimationDrawable = r0
            r0.start()
        L4c:
            return
    }

    private void onRefreshView(com.baidu.idl.face.platform.FaceStatusNewEnum r3, java.lang.String r4, int r5) {
            r2 = this;
            int[] r0 = com.baidu.idl.face.platform.ui.FaceLivenessActivity.AnonymousClass6.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum
            int r3 = r3.ordinal()
            r3 = r0[r3]
            java.lang.String r0 = ""
            java.lang.String r1 = "请保持正脸"
            switch(r3) {
                case 1: goto L99;
                case 2: goto L99;
                case 3: goto L99;
                case 4: goto L99;
                case 5: goto L99;
                case 6: goto L99;
                case 7: goto L7f;
                case 8: goto L7f;
                case 9: goto L7f;
                case 10: goto L7f;
                case 11: goto L7f;
                case 12: goto L7f;
                case 13: goto L7f;
                case 14: goto L65;
                case 15: goto L65;
                case 16: goto L65;
                case 17: goto L65;
                case 18: goto L29;
                default: goto Lf;
            }
        Lf:
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r3 = r2.mFaceDetectRoundView
            r3.setTipTopText(r1)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r3 = r2.mFaceDetectRoundView
            r3.setTipSecondText(r4)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r3 = r2.mFaceDetectRoundView
            com.baidu.idl.face.platform.FaceConfig r4 = r2.mFaceConfig
            java.util.List r4 = r4.getLivenessTypeList()
            int r4 = r4.size()
            r3.setProcessCount(r5, r4)
            return
        L29:
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r3 = r2.mFaceDetectRoundView
            com.baidu.idl.face.platform.FaceConfig r4 = r2.mFaceConfig
            java.util.List r4 = r4.getLivenessTypeList()
            int r4 = r4.size()
            r3.setProcessCount(r5, r4)
            android.widget.RelativeLayout r3 = r2.mRelativeAddImageView
            int r3 = r3.getVisibility()
            r4 = 4
            r5 = 0
            if (r3 != r4) goto L47
            android.widget.RelativeLayout r3 = r2.mRelativeAddImageView
            r3.setVisibility(r5)
        L47:
            r2.loadAnimSource()
            r3 = 0
        L4b:
            android.graphics.drawable.AnimationDrawable r4 = r2.mAnimationDrawable
            int r4 = r4.getNumberOfFrames()
            if (r5 >= r4) goto L5d
            android.graphics.drawable.AnimationDrawable r4 = r2.mAnimationDrawable
            int r4 = r4.getDuration(r5)
            int r3 = r3 + r4
            int r5 = r5 + 1
            goto L4b
        L5d:
            com.baidu.idl.face.platform.manager.TimeManager r4 = com.baidu.idl.face.platform.manager.TimeManager.getInstance()
            r4.setActiveAnimTime(r3)
            return
        L65:
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r3 = r2.mFaceDetectRoundView
            r3.setTipTopText(r1)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r3 = r2.mFaceDetectRoundView
            r3.setTipSecondText(r4)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r3 = r2.mFaceDetectRoundView
            com.baidu.idl.face.platform.FaceConfig r4 = r2.mFaceConfig
            java.util.List r4 = r4.getLivenessTypeList()
            int r4 = r4.size()
            r3.setProcessCount(r5, r4)
            return
        L7f:
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r3 = r2.mFaceDetectRoundView
            r3.setTipTopText(r4)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r3 = r2.mFaceDetectRoundView
            r3.setTipSecondText(r0)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r3 = r2.mFaceDetectRoundView
            com.baidu.idl.face.platform.FaceConfig r4 = r2.mFaceConfig
            java.util.List r4 = r4.getLivenessTypeList()
            int r4 = r4.size()
            r3.setProcessCount(r5, r4)
            return
        L99:
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r3 = r2.mFaceDetectRoundView
            r3.setTipTopText(r4)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r3 = r2.mFaceDetectRoundView
            r3.setTipSecondText(r0)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r3 = r2.mFaceDetectRoundView
            com.baidu.idl.face.platform.FaceConfig r4 = r2.mFaceConfig
            java.util.List r4 = r4.getLivenessTypeList()
            int r4 = r4.size()
            r3.setProcessCount(r5, r4)
            r2.stopAnim()
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
            com.baidu.idl.face.platform.ui.FaceLivenessActivity$4 r2 = new com.baidu.idl.face.platform.ui.FaceLivenessActivity$4
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
            com.baidu.idl.face.platform.ui.FaceLivenessActivity$5 r3 = new com.baidu.idl.face.platform.ui.FaceLivenessActivity$5
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

    private void stopAnim() {
            r2 = this;
            android.graphics.drawable.AnimationDrawable r0 = r2.mAnimationDrawable
            if (r0 == 0) goto La
            r0.stop()
            r0 = 0
            r2.mAnimationDrawable = r0
        La:
            android.widget.RelativeLayout r0 = r2.mRelativeAddImageView
            int r0 = r0.getVisibility()
            if (r0 != 0) goto L18
            android.widget.RelativeLayout r0 = r2.mRelativeAddImageView
            r1 = 4
            r0.setVisibility(r1)
        L18:
            return
    }

    @Override // com.baidu.idl.face.platform.ILivenessViewCallback
    public void animStop() {
            r0 = this;
            r0.stopAnim()
            return
    }

    public void finish() {
            r0 = this;
            super/*android.app.Activity*/.finish()
            return
    }

    public void onCreate(android.os.Bundle r4) {
            r3 = this;
            super/*androidx.fragment.app.FragmentActivity*/.onCreate(r4)
            r3.setScreenBright()
            android.view.Window r4 = r3.getWindow()
            r0 = 128(0x80, float:1.8E-43)
            r4.addFlags(r0)
            int r4 = com.baidu.idl.face.platform.ui.R.layout.activity_face_liveness_v3100
            r3.setContentView(r4)
            r3.mContext = r3
            android.util.DisplayMetrics r4 = new android.util.DisplayMetrics
            r4.<init>()
            android.view.WindowManager r0 = r3.getWindowManager()
            android.view.Display r0 = r0.getDefaultDisplay()
            r0.getMetrics(r4)
            int r0 = r4.widthPixels
            r3.mDisplayWidth = r0
            int r4 = r4.heightPixels
            r3.mDisplayHeight = r4
            com.baidu.idl.face.platform.ui.FaceSDKResSettings.initializeResId()
            com.baidu.idl.face.platform.FaceSDKManager r4 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.face.platform.FaceConfig r4 = r4.getFaceConfig()
            r3.mFaceConfig = r4
            java.lang.String r4 = "audio"
            java.lang.Object r4 = r3.getSystemService(r4)
            android.media.AudioManager r4 = (android.media.AudioManager) r4
            r0 = 3
            int r4 = r4.getStreamVolume(r0)
            if (r4 <= 0) goto L51
            com.baidu.idl.face.platform.FaceConfig r4 = r3.mFaceConfig
            boolean r4 = r4.isSound()
            goto L52
        L51:
            r4 = 0
        L52:
            r3.mIsEnableSound = r4
            int r4 = com.baidu.idl.face.platform.ui.R.id.liveness_root_layout
            android.view.View r4 = r3.findViewById(r4)
            r3.mRootView = r4
            int r1 = com.baidu.idl.face.platform.ui.R.id.liveness_surface_layout
            android.view.View r4 = r4.findViewById(r1)
            android.widget.FrameLayout r4 = (android.widget.FrameLayout) r4
            r3.mFrameLayout = r4
            android.view.SurfaceView r4 = new android.view.SurfaceView
            r4.<init>(r3)
            r3.mSurfaceView = r4
            android.view.SurfaceHolder r4 = r4.getHolder()
            r3.mSurfaceHolder = r4
            r4.setSizeFromLayout()
            android.view.SurfaceHolder r4 = r3.mSurfaceHolder
            r4.addCallback(r3)
            android.view.SurfaceHolder r4 = r3.mSurfaceHolder
            r4.setType(r0)
            int r4 = r3.mDisplayWidth
            android.widget.FrameLayout$LayoutParams r0 = new android.widget.FrameLayout$LayoutParams
            float r4 = (float) r4
            r1 = 1061158912(0x3f400000, float:0.75)
            float r4 = r4 * r1
            r1 = 1063675494(0x3f666666, float:0.9)
            float r4 = r4 * r1
            int r1 = (int) r4
            r2 = 1142947840(0x44200000, float:640.0)
            float r4 = r4 * r2
            r2 = 1139802112(0x43f00000, float:480.0)
            float r4 = r4 / r2
            int r4 = (int) r4
            r2 = 17
            r0.<init>(r1, r4, r2)
            android.view.SurfaceView r4 = r3.mSurfaceView
            r4.setLayoutParams(r0)
            android.widget.FrameLayout r4 = r3.mFrameLayout
            android.view.SurfaceView r0 = r3.mSurfaceView
            r4.addView(r0)
            android.view.View r4 = r3.mRootView
            int r0 = com.baidu.idl.face.platform.ui.R.id.liveness_close
            android.view.View r4 = r4.findViewById(r0)
            com.baidu.idl.face.platform.ui.FaceLivenessActivity$1 r1 = new com.baidu.idl.face.platform.ui.FaceLivenessActivity$1
            r1.<init>(r3)
            r4.setOnClickListener(r1)
            android.view.View r4 = r3.mRootView
            int r1 = com.baidu.idl.face.platform.ui.R.id.liveness_face_round
            android.view.View r4 = r4.findViewById(r1)
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r4 = (com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView) r4
            r3.mFaceDetectRoundView = r4
            r1 = 1
            r4.setIsActiveLive(r1)
            android.view.View r4 = r3.mRootView
            android.view.View r4 = r4.findViewById(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.mCloseView = r4
            android.view.View r4 = r3.mRootView
            int r0 = com.baidu.idl.face.platform.ui.R.id.liveness_sound
            android.view.View r4 = r4.findViewById(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.mSoundView = r4
            boolean r0 = r3.mIsEnableSound
            if (r0 == 0) goto Le5
            int r0 = com.baidu.idl.face.platform.ui.R.mipmap.icon_titlebar_voice2
            goto Le7
        Le5:
            int r0 = com.baidu.idl.face.platform.ui.R.drawable.collect_image_voice_selector
        Le7:
            r4.setImageResource(r0)
            android.widget.ImageView r4 = r3.mSoundView
            com.baidu.idl.face.platform.ui.FaceLivenessActivity$2 r0 = new com.baidu.idl.face.platform.ui.FaceLivenessActivity$2
            r0.<init>(r3)
            r4.setOnClickListener(r0)
            android.view.View r4 = r3.mRootView
            int r0 = com.baidu.idl.face.platform.ui.R.id.liveness_top_tips
            android.view.View r4 = r4.findViewById(r0)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r3.mTipsTopView = r4
            android.view.View r4 = r3.mRootView
            int r0 = com.baidu.idl.face.platform.ui.R.id.liveness_success_image
            android.view.View r4 = r4.findViewById(r0)
            android.widget.ImageView r4 = (android.widget.ImageView) r4
            r3.mSuccessView = r4
            android.view.View r4 = r3.mRootView
            int r0 = com.baidu.idl.face.platform.ui.R.id.liveness_result_image_layout
            android.view.View r4 = r4.findViewById(r0)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.mImageLayout = r4
            android.view.View r4 = r3.mRootView
            int r0 = com.baidu.idl.face.platform.ui.R.id.liveness_result_image_layout2
            android.view.View r4 = r4.findViewById(r0)
            android.widget.LinearLayout r4 = (android.widget.LinearLayout) r4
            r3.mImageLayout2 = r4
            android.view.View r4 = r3.mRootView
            int r0 = com.baidu.idl.face.platform.ui.R.id.relative_add_image_view
            android.view.View r4 = r4.findViewById(r0)
            android.widget.RelativeLayout r4 = (android.widget.RelativeLayout) r4
            r3.mRelativeAddImageView = r4
            r3.addImageView()
            int r4 = com.baidu.idl.face.platform.ui.R.id.view_live_bg
            android.view.View r4 = r3.findViewById(r4)
            r3.mViewBg = r4
            return
    }

    @Override // android.hardware.Camera.ErrorCallback
    public void onError(int r1, android.hardware.Camera r2) {
            r0 = this;
            return
    }

    public void onLivenessCompletion(com.baidu.idl.face.platform.FaceStatusNewEnum r1, java.lang.String r2, java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r3, java.util.HashMap<java.lang.String, com.baidu.idl.face.platform.model.ImageInfo> r4, int r5) {
            r0 = this;
            boolean r3 = r0.mIsCompletion
            if (r3 == 0) goto L5
            goto Lf
        L5:
            r0.onRefreshView(r1, r2, r5)
            com.baidu.idl.face.platform.FaceStatusNewEnum r2 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            if (r1 != r2) goto Lf
            r1 = 1
            r0.mIsCompletion = r1
        Lf:
            return
    }

    public void onPause() {
            r3 = this;
            com.baidu.idl.face.platform.ILivenessStrategy r0 = r3.mILivenessStrategy
            if (r0 == 0) goto L7
            r0.reset()
        L7:
            android.content.BroadcastReceiver r0 = r3.mVolumeReceiver
            com.baidu.idl.face.platform.ui.utils.VolumeUtils.unRegisterVolumeReceiver(r3, r0)
            r0 = 0
            r3.mVolumeReceiver = r0
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r0 = r3.mFaceDetectRoundView
            com.baidu.idl.face.platform.FaceConfig r1 = r3.mFaceConfig
            java.util.List r1 = r1.getLivenessTypeList()
            int r1 = r1.size()
            r2 = 0
            r0.setProcessCount(r2, r1)
            super/*androidx.fragment.app.FragmentActivity*/.onPause()
            r3.stopPreview()
            r3.mIsCompletion = r2
            return
    }

    @Override // android.hardware.Camera.PreviewCallback
    public void onPreviewFrame(byte[] r4, android.hardware.Camera r5) {
            r3 = this;
            boolean r5 = r3.mIsCompletion
            if (r5 == 0) goto L5
            return
        L5:
            com.baidu.idl.face.platform.ILivenessStrategy r5 = r3.mILivenessStrategy
            if (r5 != 0) goto L36
            com.baidu.idl.face.platform.FaceSDKManager r5 = com.baidu.idl.face.platform.FaceSDKManager.getInstance()
            com.baidu.idl.face.platform.ILivenessStrategy r5 = r5.getLivenessStrategyModule(r3)
            r3.mILivenessStrategy = r5
            int r0 = r3.mPreviewDegree
            r5.setPreviewDegree(r0)
            com.baidu.idl.face.platform.ILivenessStrategy r5 = r3.mILivenessStrategy
            boolean r0 = r3.mIsEnableSound
            r5.setLivenessStrategySoundEnable(r0)
            int r5 = r3.mDisplayWidth
            int r0 = r3.mPreviewHight
            int r1 = r3.mPreviewWidth
            android.graphics.Rect r5 = com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView.getPreviewDetectRect(r5, r0, r1)
            com.baidu.idl.face.platform.ILivenessStrategy r0 = r3.mILivenessStrategy
            com.baidu.idl.face.platform.FaceConfig r1 = r3.mFaceConfig
            java.util.List r1 = r1.getLivenessTypeList()
            android.graphics.Rect r2 = r3.mPreviewRect
            r0.setLivenessStrategyConfig(r1, r2, r5, r3)
        L36:
            com.baidu.idl.face.platform.ILivenessStrategy r5 = r3.mILivenessStrategy
            r5.livenessStrategy(r4)
            return
    }

    protected void onRestart() {
            r0 = this;
            super/*android.app.Activity*/.onRestart()
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

    @Override // com.baidu.idl.face.platform.ILivenessViewCallback
    public void setCurrentLiveType(com.baidu.idl.face.platform.LivenessTypeEnum r1) {
            r0 = this;
            r0.mLivenessType = r1
            return
    }

    @Override // com.baidu.idl.face.platform.ILivenessViewCallback
    public void setFaceInfo(com.baidu.idl.face.platform.model.FaceExtInfo r1) {
            r0 = this;
            return
    }

    protected void startPreview() {
            r6 = this;
            android.view.SurfaceView r0 = r6.mSurfaceView
            if (r0 == 0) goto L15
            android.view.SurfaceHolder r0 = r0.getHolder()
            if (r0 == 0) goto L15
            android.view.SurfaceView r0 = r6.mSurfaceView
            android.view.SurfaceHolder r0 = r0.getHolder()
            r6.mSurfaceHolder = r0
            r0.addCallback(r6)
        L15:
            android.hardware.Camera r0 = r6.mCamera
            r1 = 0
            if (r0 == 0) goto L2b
            r0.setPreviewCallback(r1)     // Catch: java.lang.Exception -> L2a
            android.hardware.Camera r0 = r6.mCamera     // Catch: java.lang.Exception -> L2a
            r0.stopPreview()     // Catch: java.lang.Exception -> L2a
            android.hardware.Camera r0 = r6.mCamera     // Catch: java.lang.Exception -> L2a
            r0.release()     // Catch: java.lang.Exception -> L2a
            r6.mCamera = r1     // Catch: java.lang.Exception -> L2a
            goto L2b
        L2a:
        L2b:
            android.hardware.Camera r0 = r6.mCamera
            if (r0 != 0) goto L37
            android.hardware.Camera r0 = r6.open()     // Catch: java.lang.Throwable -> L36
            r6.mCamera = r0     // Catch: java.lang.Throwable -> L36
            goto L37
        L36:
        L37:
            android.hardware.Camera r0 = r6.mCamera
            if (r0 != 0) goto L3d
            goto Lc3
        L3d:
            android.hardware.Camera$Parameters r2 = r6.mCameraParam
            if (r2 != 0) goto L47
            android.hardware.Camera$Parameters r0 = r0.getParameters()
            r6.mCameraParam = r0
        L47:
            android.hardware.Camera$Parameters r0 = r6.mCameraParam
            r2 = 256(0x100, float:3.59E-43)
            r0.setPictureFormat(r2)
            int r0 = r6.displayOrientation(r6)
            android.hardware.Camera r2 = r6.mCamera
            r2.setDisplayOrientation(r0)
            android.hardware.Camera$Parameters r2 = r6.mCameraParam
            java.lang.String r3 = "rotation"
            r2.set(r3, r0)
            r6.mPreviewDegree = r0
            android.hardware.Camera$Parameters r2 = r6.mCameraParam
            android.graphics.Point r3 = new android.graphics.Point
            r4 = 640(0x280, float:8.97E-43)
            r5 = 480(0x1e0, float:6.73E-43)
            r3.<init>(r4, r5)
            android.graphics.Point r2 = com.baidu.idl.face.platform.ui.utils.CameraPreviewUtils.getBestPreview(r2, r3)
            int r3 = r2.x
            r6.mPreviewWidth = r3
            int r2 = r2.y
            r6.mPreviewHight = r2
            com.baidu.idl.face.platform.ILivenessStrategy r2 = r6.mILivenessStrategy
            if (r2 == 0) goto L7e
            r2.setPreviewDegree(r0)
        L7e:
            android.graphics.Rect r0 = r6.mPreviewRect
            int r2 = r6.mPreviewHight
            int r3 = r6.mPreviewWidth
            r4 = 0
            r0.set(r4, r4, r2, r3)
            android.hardware.Camera$Parameters r0 = r6.mCameraParam
            int r2 = r6.mPreviewWidth
            int r3 = r6.mPreviewHight
            r0.setPreviewSize(r2, r3)
            android.hardware.Camera r0 = r6.mCamera
            android.hardware.Camera$Parameters r2 = r6.mCameraParam
            r0.setParameters(r2)
            android.hardware.Camera r0 = r6.mCamera     // Catch: java.lang.Exception -> Lb4 java.lang.RuntimeException -> Lbc
            android.view.SurfaceHolder r2 = r6.mSurfaceHolder     // Catch: java.lang.Exception -> Lb4 java.lang.RuntimeException -> Lbc
            r0.setPreviewDisplay(r2)     // Catch: java.lang.Exception -> Lb4 java.lang.RuntimeException -> Lbc
            android.hardware.Camera r0 = r6.mCamera     // Catch: java.lang.Exception -> Lb4 java.lang.RuntimeException -> Lbc
            r0.stopPreview()     // Catch: java.lang.Exception -> Lb4 java.lang.RuntimeException -> Lbc
            android.hardware.Camera r0 = r6.mCamera     // Catch: java.lang.Exception -> Lb4 java.lang.RuntimeException -> Lbc
            r0.setErrorCallback(r6)     // Catch: java.lang.Exception -> Lb4 java.lang.RuntimeException -> Lbc
            android.hardware.Camera r0 = r6.mCamera     // Catch: java.lang.Exception -> Lb4 java.lang.RuntimeException -> Lbc
            r0.setPreviewCallback(r6)     // Catch: java.lang.Exception -> Lb4 java.lang.RuntimeException -> Lbc
            android.hardware.Camera r0 = r6.mCamera     // Catch: java.lang.Exception -> Lb4 java.lang.RuntimeException -> Lbc
            r0.startPreview()     // Catch: java.lang.Exception -> Lb4 java.lang.RuntimeException -> Lbc
            goto Lc3
        Lb4:
            android.hardware.Camera r0 = r6.mCamera
            com.baidu.idl.face.platform.ui.utils.CameraUtils.releaseCamera(r0)
            r6.mCamera = r1
            goto Lc3
        Lbc:
            android.hardware.Camera r0 = r6.mCamera
            com.baidu.idl.face.platform.ui.utils.CameraUtils.releaseCamera(r0)
            r6.mCamera = r1
        Lc3:
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
            com.baidu.idl.face.platform.ILivenessStrategy r0 = r3.mILivenessStrategy
            if (r0 == 0) goto L30
            r3.mILivenessStrategy = r1
        L30:
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

    @Override // com.baidu.idl.face.platform.ILivenessViewCallback
    public void viewReset() {
            r3 = this;
            com.baidu.idl.face.platform.ui.widget.FaceDetectRoundView r0 = r3.mFaceDetectRoundView
            r1 = 0
            r2 = 1
            r0.setProcessCount(r1, r2)
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
            com.baidu.idl.face.platform.ILivenessStrategy r0 = r2.mILivenessStrategy     // Catch: java.lang.Exception -> L2d
            if (r0 == 0) goto L2d
            boolean r1 = r2.mIsEnableSound     // Catch: java.lang.Exception -> L2d
            r0.setLivenessStrategySoundEnable(r1)     // Catch: java.lang.Exception -> L2d
        L2d:
            return
    }
}

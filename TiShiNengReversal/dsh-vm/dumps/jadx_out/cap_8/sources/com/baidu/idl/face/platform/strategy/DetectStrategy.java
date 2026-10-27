package com.baidu.idl.face.platform.strategy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class DetectStrategy {
    private static final java.lang.String TAG = "DetectStrategy";
    private com.baidu.idl.face.platform.FaceStatusNewEnum mCurrentFaceStatus;
    private long mDuration;
    private boolean mTimeoutFlag;
    private float mTotalCropScore;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.baidu.idl.face.platform.strategy.DetectStrategy$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum = null;

        static {
                com.baidu.idl.face.platform.FaceStatusNewEnum[] r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum = r0
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePoorIllumination     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L1d
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeImageBlured     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L28
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionLeftEye     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L33
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionRightEye     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L3e
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionNose     // Catch: java.lang.NoSuchFieldError -> L3e
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r2 = 5
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L49
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionMouth     // Catch: java.lang.NoSuchFieldError -> L49
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r2 = 6
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L54
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionLeftContour     // Catch: java.lang.NoSuchFieldError -> L54
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r2 = 7
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L60
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionRightContour     // Catch: java.lang.NoSuchFieldError -> L60
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L60
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L60
            L60:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L6c
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionChinContour     // Catch: java.lang.NoSuchFieldError -> L6c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6c
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L6c
            L6c:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L78
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTooFar     // Catch: java.lang.NoSuchFieldError -> L78
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L78
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L78
            L78:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L84
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTooClose     // Catch: java.lang.NoSuchFieldError -> L84
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L84
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L84
            L84:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L90
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeNoFaceDetected     // Catch: java.lang.NoSuchFieldError -> L90
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L90
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L90
            L90:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> L9c
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofUpRange     // Catch: java.lang.NoSuchFieldError -> L9c
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L9c
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L9c
            L9c:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> La8
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofDownRange     // Catch: java.lang.NoSuchFieldError -> La8
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La8
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> La8
            La8:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> Lb4
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofLeftRange     // Catch: java.lang.NoSuchFieldError -> Lb4
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb4
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb4
            Lb4:
                int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum     // Catch: java.lang.NoSuchFieldError -> Lc0
                com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofRightRange     // Catch: java.lang.NoSuchFieldError -> Lc0
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc0
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc0
            Lc0:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    static {
            return
    }

    public DetectStrategy() {
            r2 = this;
            r2.<init>()
            r0 = 0
            r2.mDuration = r0
            r0 = 0
            r2.mTimeoutFlag = r0
            return
    }

    private void checkTimeout(com.baidu.idl.face.platform.FaceStatusNewEnum r5, com.baidu.idl.face.platform.FaceConfig r6) {
            r4 = this;
            if (r6 != 0) goto L3
            goto L2a
        L3:
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = r4.mCurrentFaceStatus
            if (r0 == 0) goto L9
            if (r0 == r5) goto L14
        L9:
            r4.mCurrentFaceStatus = r5
            long r0 = java.lang.System.currentTimeMillis()
            r4.mDuration = r0
            r0 = 0
            r4.mTimeoutFlag = r0
        L14:
            long r0 = java.lang.System.currentTimeMillis()
            com.baidu.idl.face.platform.FaceStatusNewEnum r2 = r4.mCurrentFaceStatus
            if (r2 != r5) goto L2a
            long r2 = r4.mDuration
            long r0 = r0 - r2
            long r5 = r6.getTimeDetectModule()
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 <= 0) goto L2a
            r5 = 1
            r4.mTimeoutFlag = r5
        L2a:
            return
    }

    private com.baidu.idl.face.platform.FaceStatusNewEnum getModuleState(com.baidu.idl.face.platform.model.FaceExtInfo[] r7, android.graphics.Rect r8, boolean r9, com.baidu.idl.face.platform.FaceConfig r10) {
            r6 = this;
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            r1 = 0
            r2 = r7[r1]
            r3 = 0
            r6.mTotalCropScore = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r9 != 0) goto Lde
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r9 = r2.getOcclusion()
            float r9 = r9.leftEye
            float r4 = r10.getOcclusionLeftEyeValue()
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 <= 0) goto L1d
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionLeftEye
            return r7
        L1d:
            float r9 = r6.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r4 = r2.getOcclusion()
            float r4 = r4.leftEye
            float r4 = r3 - r4
            float r9 = r9 + r4
            r6.mTotalCropScore = r9
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r9 = r2.getOcclusion()
            float r9 = r9.rightEye
            float r4 = r10.getOcclusionRightEyeValue()
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 <= 0) goto L3b
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionRightEye
            return r7
        L3b:
            float r9 = r6.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r4 = r2.getOcclusion()
            float r4 = r4.rightEye
            float r4 = r3 - r4
            float r9 = r9 + r4
            r6.mTotalCropScore = r9
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r9 = r2.getOcclusion()
            float r9 = r9.nose
            float r4 = r10.getOcclusionNoseValue()
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 <= 0) goto L59
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionNose
            return r7
        L59:
            float r9 = r6.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r4 = r2.getOcclusion()
            float r4 = r4.nose
            float r4 = r3 - r4
            float r9 = r9 + r4
            r6.mTotalCropScore = r9
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r9 = r2.getOcclusion()
            float r9 = r9.mouth
            float r4 = r10.getOcclusionMouthValue()
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 <= 0) goto L77
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionMouth
            return r7
        L77:
            float r9 = r6.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r4 = r2.getOcclusion()
            float r4 = r4.mouth
            float r4 = r3 - r4
            float r9 = r9 + r4
            r6.mTotalCropScore = r9
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r9 = r2.getOcclusion()
            float r9 = r9.leftCheek
            float r4 = r10.getOcclusionLeftContourValue()
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 <= 0) goto L95
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionLeftContour
            return r7
        L95:
            float r9 = r6.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r4 = r2.getOcclusion()
            float r4 = r4.leftCheek
            float r4 = r3 - r4
            float r9 = r9 + r4
            r6.mTotalCropScore = r9
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r9 = r2.getOcclusion()
            float r9 = r9.rightCheek
            float r4 = r10.getOcclusionRightContourValue()
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 <= 0) goto Lb3
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionRightContour
            return r7
        Lb3:
            float r9 = r6.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r4 = r2.getOcclusion()
            float r4 = r4.rightCheek
            float r4 = r3 - r4
            float r9 = r9 + r4
            r6.mTotalCropScore = r9
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r9 = r2.getOcclusion()
            float r9 = r9.chin
            float r4 = r10.getOcclusionChinValue()
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 <= 0) goto Ld1
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionChinContour
            return r7
        Ld1:
            float r9 = r6.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r4 = r2.getOcclusion()
            float r4 = r4.chin
            float r4 = r3 - r4
            float r9 = r9 + r4
            r6.mTotalCropScore = r9
        Lde:
            r9 = r7[r1]
            int r9 = r9.getFaceWidth()
            float r9 = (float) r9
            int r4 = r8.width()
            float r4 = (float) r4
            float r5 = r10.getFaceFarRatio()
            float r4 = r4 * r5
            int r9 = (r9 > r4 ? 1 : (r9 == r4 ? 0 : -1))
            if (r9 >= 0) goto Lfa
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTooFar
            r6.checkTimeout(r7, r10)
            return r7
        Lfa:
            r7 = r7[r1]
            int r7 = r7.getFaceWidth()
            float r7 = (float) r7
            int r8 = r8.width()
            float r8 = (float) r8
            float r9 = r10.getFaceClosedRatio()
            float r8 = r8 * r9
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L116
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTooClose
            r6.checkTimeout(r7, r10)
            return r7
        L116:
            float r7 = r2.getPitch()
            int r8 = r10.getHeadPitchValue()
            int r8 = -r8
            int r8 = r8 + (-2)
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L129
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofDownRange
            return r7
        L129:
            float r7 = r2.getPitch()
            int r8 = r10.getHeadPitchValue()
            int r8 = r8 + (-2)
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L13b
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofUpRange
            return r7
        L13b:
            float r7 = r6.mTotalCropScore
            float r8 = r2.getPitch()
            float r8 = java.lang.Math.abs(r8)
            r9 = 1110704128(0x42340000, float:45.0)
            float r8 = r9 - r8
            float r8 = r8 / r9
            float r7 = r7 + r8
            r6.mTotalCropScore = r7
            float r7 = r2.getYaw()
            int r8 = r10.getHeadYawValue()
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L15d
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofLeftRange
            return r7
        L15d:
            float r7 = r2.getYaw()
            int r8 = r10.getHeadYawValue()
            int r8 = -r8
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L16e
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofRightRange
            return r7
        L16e:
            float r7 = r6.mTotalCropScore
            float r8 = r2.getYaw()
            float r8 = java.lang.Math.abs(r8)
            float r8 = r9 - r8
            float r8 = r8 / r9
            float r7 = r7 + r8
            r6.mTotalCropScore = r7
            float r7 = r2.getRoll()
            int r8 = r10.getHeadRollValue()
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L18e
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofRightRange
            return r7
        L18e:
            float r7 = r2.getRoll()
            int r8 = r10.getHeadRollValue()
            int r8 = -r8
            float r8 = (float) r8
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L19f
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofLeftRange
            return r7
        L19f:
            float r7 = r6.mTotalCropScore
            float r8 = r2.getRoll()
            float r8 = java.lang.Math.abs(r8)
            float r8 = r9 - r8
            float r8 = r8 / r9
            float r7 = r7 + r8
            r6.mTotalCropScore = r7
            float r7 = r2.getBluriness()
            float r8 = r10.getBlurnessValue()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L1be
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeImageBlured
            return r7
        L1be:
            float r7 = r6.mTotalCropScore
            float r8 = r2.getBluriness()
            float r8 = r3 - r8
            float r7 = r7 + r8
            r6.mTotalCropScore = r7
            int r7 = r2.getIllum()
            float r7 = (float) r7
            float r8 = r10.getBrightnessValue()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 >= 0) goto L1d9
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePoorIllumination
            return r7
        L1d9:
            int r7 = r2.getIllum()
            float r7 = (float) r7
            float r8 = r10.getBrightnessMaxValue()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L1e9
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeMuchIllumination
            return r7
        L1e9:
            float r7 = r2.getLeftEyeClose()
            float r8 = r10.getEyeClosedValue()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L1f8
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeLeftEyeClosed
            return r7
        L1f8:
            float r7 = r6.mTotalCropScore
            float r8 = r2.getLeftEyeClose()
            float r8 = r3 - r8
            float r7 = r7 + r8
            r6.mTotalCropScore = r7
            float r7 = r2.getRightEyeClose()
            float r8 = r10.getEyeClosedValue()
            int r7 = (r7 > r8 ? 1 : (r7 == r8 ? 0 : -1))
            if (r7 <= 0) goto L212
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeRightEyeClosed
            return r7
        L212:
            float r7 = r6.mTotalCropScore
            float r8 = r2.getRightEyeClose()
            float r3 = r3 - r8
            float r7 = r7 + r3
            r6.mTotalCropScore = r7
            return r0
    }

    private boolean isDefaultDetectStatus(com.baidu.idl.face.platform.FaceStatusNewEnum r2) {
            r1 = this;
            int[] r0 = com.baidu.idl.face.platform.strategy.DetectStrategy.AnonymousClass1.$SwitchMap$com$baidu$idl$face$platform$FaceStatusNewEnum
            int r2 = r2.ordinal()
            r2 = r0[r2]
            switch(r2) {
                case 1: goto Ld;
                case 2: goto Ld;
                case 3: goto Ld;
                case 4: goto Ld;
                case 5: goto Ld;
                case 6: goto Ld;
                case 7: goto Ld;
                case 8: goto Ld;
                case 9: goto Ld;
                case 10: goto Ld;
                case 11: goto Ld;
                case 12: goto Ld;
                case 13: goto Ld;
                case 14: goto Ld;
                case 15: goto Ld;
                case 16: goto Ld;
                default: goto Lb;
            }
        Lb:
            r2 = 0
            return r2
        Ld:
            r2 = 1
            return r2
    }

    public com.baidu.idl.face.platform.FaceStatusNewEnum checkDetect(android.graphics.Rect r6, com.baidu.idl.face.platform.model.FaceExtInfo[] r7, com.baidu.idl.face.platform.FaceConfig r8) {
            r5 = this;
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            if (r7 == 0) goto L56
            int r1 = r7.length
            if (r1 <= 0) goto L56
            r1 = 0
            r2 = r7[r1]
            if (r2 == 0) goto L56
            if (r8 != 0) goto Lf
            goto L56
        Lf:
            int r2 = r2.getFaceWidth()
            float r2 = (float) r2
            int r3 = r6.width()
            float r3 = (float) r3
            float r4 = r8.getFaceClosedRatio()
            float r3 = r3 * r4
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L29
            com.baidu.idl.face.platform.FaceStatusNewEnum r6 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTooClose
            r5.checkTimeout(r6, r8)
            return r6
        L29:
            r2 = r7[r1]
            int r2 = r2.getFaceWidth()
            float r2 = (float) r2
            int r3 = r6.width()
            float r3 = (float) r3
            float r4 = r8.getFaceFarRatio()
            float r3 = r3 * r4
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 >= 0) goto L45
            com.baidu.idl.face.platform.FaceStatusNewEnum r6 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTooFar
            r5.checkTimeout(r6, r8)
            return r6
        L45:
            r7 = r7[r1]
            int r6 = r7.getLandmarksOutOfDetectCount(r6)
            r7 = 10
            if (r6 <= r7) goto L55
            com.baidu.idl.face.platform.FaceStatusNewEnum r6 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeBeyondPreviewFrame
            r5.checkTimeout(r6, r8)
            return r6
        L55:
            return r0
        L56:
            com.baidu.idl.face.platform.FaceStatusNewEnum r6 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeNoFaceDetected
            r5.checkTimeout(r6, r8)
            return r6
    }

    public com.baidu.idl.face.platform.FaceStatusNewEnum getCropStatus(com.baidu.idl.face.platform.model.FaceExtInfo r5, com.baidu.idl.face.platform.FaceConfig r6) {
            r4 = this;
            if (r5 == 0) goto L1e6
            if (r6 != 0) goto L6
            goto L1e6
        L6:
            r0 = 0
            r4.mTotalCropScore = r0
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r0 = r5.getOcclusion()
            float r0 = r0.leftEye
            float r1 = r6.getOcclusionLeftEyeValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1a
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionLeftEye
            return r5
        L1a:
            float r0 = r4.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r1 = r5.getOcclusion()
            float r1 = r1.leftEye
            r2 = 1065353216(0x3f800000, float:1.0)
            float r1 = r2 - r1
            float r0 = r0 + r1
            r4.mTotalCropScore = r0
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r0 = r5.getOcclusion()
            float r0 = r0.rightEye
            float r1 = r6.getOcclusionRightEyeValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L3a
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionRightEye
            return r5
        L3a:
            float r0 = r4.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r1 = r5.getOcclusion()
            float r1 = r1.rightEye
            float r1 = r2 - r1
            float r0 = r0 + r1
            r4.mTotalCropScore = r0
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r0 = r5.getOcclusion()
            float r0 = r0.nose
            float r1 = r6.getOcclusionNoseValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L58
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionNose
            return r5
        L58:
            float r0 = r4.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r1 = r5.getOcclusion()
            float r1 = r1.nose
            float r1 = r2 - r1
            float r0 = r0 + r1
            r4.mTotalCropScore = r0
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r0 = r5.getOcclusion()
            float r0 = r0.mouth
            float r1 = r6.getOcclusionMouthValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L76
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionMouth
            return r5
        L76:
            float r0 = r4.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r1 = r5.getOcclusion()
            float r1 = r1.mouth
            float r1 = r2 - r1
            float r0 = r0 + r1
            r4.mTotalCropScore = r0
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r0 = r5.getOcclusion()
            float r0 = r0.leftCheek
            float r1 = r6.getOcclusionLeftContourValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L94
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionLeftContour
            return r5
        L94:
            float r0 = r4.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r1 = r5.getOcclusion()
            float r1 = r1.leftCheek
            float r1 = r2 - r1
            float r0 = r0 + r1
            r4.mTotalCropScore = r0
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r0 = r5.getOcclusion()
            float r0 = r0.rightCheek
            float r1 = r6.getOcclusionRightContourValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Lb2
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionRightContour
            return r5
        Lb2:
            float r0 = r4.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r1 = r5.getOcclusion()
            float r1 = r1.rightCheek
            float r1 = r2 - r1
            float r0 = r0 + r1
            r4.mTotalCropScore = r0
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r0 = r5.getOcclusion()
            float r0 = r0.chin
            float r1 = r6.getOcclusionChinValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto Ld0
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionChinContour
            return r5
        Ld0:
            float r0 = r4.mTotalCropScore
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r1 = r5.getOcclusion()
            float r1 = r1.chin
            float r1 = r2 - r1
            float r0 = r0 + r1
            r4.mTotalCropScore = r0
            float r0 = r5.getPitch()
            int r1 = r6.getHeadPitchValue()
            int r1 = -r1
            int r1 = r1 + (-2)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto Lf0
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofDownRange
            return r5
        Lf0:
            float r0 = r5.getPitch()
            int r1 = r6.getHeadPitchValue()
            int r1 = r1 + (-2)
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L102
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofUpRange
            return r5
        L102:
            float r0 = r4.mTotalCropScore
            float r1 = r5.getPitch()
            float r1 = java.lang.Math.abs(r1)
            r3 = 1110704128(0x42340000, float:45.0)
            float r1 = r3 - r1
            float r1 = r1 / r3
            float r0 = r0 + r1
            r4.mTotalCropScore = r0
            float r0 = r5.getYaw()
            int r1 = r6.getHeadYawValue()
            int r1 = -r1
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L125
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofRightRange
            return r5
        L125:
            float r0 = r5.getYaw()
            int r1 = r6.getHeadYawValue()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L135
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofLeftRange
            return r5
        L135:
            float r0 = r4.mTotalCropScore
            float r1 = r5.getYaw()
            float r1 = java.lang.Math.abs(r1)
            float r1 = r3 - r1
            float r1 = r1 / r3
            float r0 = r0 + r1
            r4.mTotalCropScore = r0
            float r0 = r5.getRoll()
            int r1 = r6.getHeadRollValue()
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L155
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofRightRange
            return r5
        L155:
            float r0 = r5.getRoll()
            int r1 = r6.getHeadRollValue()
            int r1 = -r1
            float r1 = (float) r1
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L166
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofLeftRange
            return r5
        L166:
            float r0 = r4.mTotalCropScore
            float r1 = r5.getRoll()
            float r1 = java.lang.Math.abs(r1)
            float r1 = r3 - r1
            float r1 = r1 / r3
            float r0 = r0 + r1
            r4.mTotalCropScore = r0
            float r0 = r5.getBluriness()
            float r1 = r6.getBlurnessValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L185
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeImageBlured
            return r5
        L185:
            float r0 = r4.mTotalCropScore
            float r1 = r5.getBluriness()
            float r1 = r2 - r1
            float r0 = r0 + r1
            r4.mTotalCropScore = r0
            int r0 = r5.getIllum()
            float r0 = (float) r0
            float r1 = r6.getBrightnessValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 >= 0) goto L1a0
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePoorIllumination
            return r5
        L1a0:
            int r0 = r5.getIllum()
            float r0 = (float) r0
            float r1 = r6.getBrightnessMaxValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1b0
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeMuchIllumination
            return r5
        L1b0:
            float r0 = r5.getLeftEyeClose()
            float r1 = r6.getEyeClosedValue()
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L1bf
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeLeftEyeClosed
            return r5
        L1bf:
            float r0 = r4.mTotalCropScore
            float r1 = r5.getLeftEyeClose()
            float r1 = r2 - r1
            float r0 = r0 + r1
            r4.mTotalCropScore = r0
            float r0 = r5.getRightEyeClose()
            float r6 = r6.getEyeClosedValue()
            int r6 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r6 <= 0) goto L1d9
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeRightEyeClosed
            return r5
        L1d9:
            float r6 = r4.mTotalCropScore
            float r5 = r5.getRightEyeClose()
            float r2 = r2 - r5
            float r6 = r6 + r2
            r4.mTotalCropScore = r6
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            return r5
        L1e6:
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeNoFaceDetected
            return r5
    }

    public com.baidu.idl.face.platform.FaceStatusNewEnum getDetectState(com.baidu.idl.face.platform.model.FaceExtInfo[] r3, android.graphics.Rect r4, boolean r5, com.baidu.idl.face.platform.FaceConfig r6) {
            r2 = this;
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            if (r3 == 0) goto L22
            int r0 = r3.length
            if (r0 <= 0) goto L22
            r0 = 0
            r0 = r3[r0]
            if (r0 == 0) goto L22
            if (r6 != 0) goto Lf
            goto L22
        Lf:
            int r0 = r0.getLandmarksOutOfDetectCount(r4)
            r1 = 10
            if (r0 <= r1) goto L1d
            com.baidu.idl.face.platform.FaceStatusNewEnum r3 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeBeyondPreviewFrame
            r2.checkTimeout(r3, r6)
            return r3
        L1d:
            com.baidu.idl.face.platform.FaceStatusNewEnum r3 = r2.getModuleState(r3, r4, r5, r6)
            return r3
        L22:
            com.baidu.idl.face.platform.FaceStatusNewEnum r3 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeNoFaceDetected
            r2.checkTimeout(r3, r6)
            return r3
    }

    public float getTotalCropScore() {
            r1 = this;
            float r0 = r1.mTotalCropScore
            return r0
    }

    public boolean isTimeout() {
            r1 = this;
            boolean r0 = r1.mTimeoutFlag
            return r0
    }

    public void reset() {
            r2 = this;
            r0 = 0
            r2.mDuration = r0
            r0 = 0
            r2.mTimeoutFlag = r0
            r0 = 0
            r2.mCurrentFaceStatus = r0
            r0 = 0
            r2.mTotalCropScore = r0
            return
    }
}

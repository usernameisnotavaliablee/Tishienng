package com.baidu.idl.face.platform.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceExtInfo {
    private static int[] comp1 = null;
    private static int[] comp2 = null;
    private static int[] comp3 = null;
    private static int[] comp4 = null;
    private static int[] comp5 = null;
    private static int[] comp6 = null;
    private static int[] comp7 = null;
    private static int[] comp8 = null;
    private static int[] comp9 = null;
    private static int nComponents = 9;
    private static int[] nPoints;
    private java.util.HashMap<java.lang.String, android.graphics.Point[]> facePointMap;
    private float mAngle;
    private float mBluriness;
    private float mCenterX;
    private float mCenterY;
    private int mFaceID;
    private float mHeight;
    private int mIllum;
    private float[] mLandmarks;
    private float mLeftEyeClose;
    private com.baidu.idl.main.facesdk.model.BDFaceOcclusion mOcclusion;
    private float mPitch;
    private float mRightEyeClose;
    private float mRoll;
    private float mScore;
    private float mWidth;
    private float mYaw;

    static {
            r0 = 13
            int[] r0 = new int[r0]
            r0 = {x0054: FILL_ARRAY_DATA , data: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12} // fill-array
            com.baidu.idl.face.platform.model.FaceExtInfo.comp1 = r0
            r0 = 10
            int[] r1 = new int[r0]
            r1 = {x0072: FILL_ARRAY_DATA , data: [13, 14, 15, 16, 17, 18, 19, 20, 13, 21} // fill-array
            com.baidu.idl.face.platform.model.FaceExtInfo.comp2 = r1
            r1 = 9
            int[] r2 = new int[r1]
            r2 = {x008a: FILL_ARRAY_DATA , data: [22, 23, 24, 25, 26, 27, 28, 29, 22} // fill-array
            com.baidu.idl.face.platform.model.FaceExtInfo.comp3 = r2
            int[] r0 = new int[r0]
            r0 = {x00a0: FILL_ARRAY_DATA , data: [30, 31, 32, 33, 34, 35, 36, 37, 30, 38} // fill-array
            com.baidu.idl.face.platform.model.FaceExtInfo.comp4 = r0
            int[] r0 = new int[r1]
            r0 = {x00b8: FILL_ARRAY_DATA , data: [39, 40, 41, 42, 43, 44, 45, 46, 39} // fill-array
            com.baidu.idl.face.platform.model.FaceExtInfo.comp5 = r0
            r0 = 11
            int[] r0 = new int[r0]
            r0 = {x00ce: FILL_ARRAY_DATA , data: [47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 47} // fill-array
            com.baidu.idl.face.platform.model.FaceExtInfo.comp6 = r0
            r0 = 57
            r2 = 51
            r3 = 52
            int[] r0 = new int[]{r2, r0, r3}
            com.baidu.idl.face.platform.model.FaceExtInfo.comp7 = r0
            int[] r0 = new int[r1]
            r0 = {x00e8: FILL_ARRAY_DATA , data: [58, 59, 60, 61, 62, 63, 64, 65, 58} // fill-array
            com.baidu.idl.face.platform.model.FaceExtInfo.comp8 = r0
            int[] r0 = new int[r1]
            r0 = {x00fe: FILL_ARRAY_DATA , data: [58, 66, 67, 68, 62, 69, 70, 71, 58} // fill-array
            com.baidu.idl.face.platform.model.FaceExtInfo.comp9 = r0
            int[] r0 = new int[r1]
            r0 = {x0114: FILL_ARRAY_DATA , data: [13, 10, 9, 10, 9, 11, 3, 9, 9} // fill-array
            com.baidu.idl.face.platform.model.FaceExtInfo.nPoints = r0
            return
    }

    public FaceExtInfo() {
            r0 = this;
            r0.<init>()
            return
    }

    public FaceExtInfo(com.baidu.idl.main.facesdk.FaceInfo r3) {
            r2 = this;
            r2.<init>()
            int r0 = r3.faceID
            r2.mFaceID = r0
            float r0 = r3.centerX
            r2.mCenterX = r0
            float r0 = r3.centerY
            r2.mCenterY = r0
            float r0 = r3.width
            r2.mWidth = r0
            float r0 = r3.height
            r2.mHeight = r0
            float r0 = r3.angle
            r2.mAngle = r0
            float r0 = r3.score
            r2.mScore = r0
            float[] r0 = r3.landmarks
            r2.mLandmarks = r0
            float r0 = r3.pitch
            r2.mPitch = r0
            float r0 = r3.roll
            r2.mRoll = r0
            float r0 = r3.yaw
            r2.mYaw = r0
            float r0 = r3.bluriness
            r2.mBluriness = r0
            int r0 = r3.illum
            r2.mIllum = r0
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r0 = r3.occlusion
            r2.mOcclusion = r0
            float r1 = r0.leftEye
            r0.leftEye = r1
            float r1 = r0.rightEye
            r0.rightEye = r1
            float r1 = r0.nose
            r0.nose = r1
            float r1 = r0.mouth
            r0.mouth = r1
            float r1 = r0.leftCheek
            r0.leftCheek = r1
            float r1 = r0.rightCheek
            r0.rightCheek = r1
            float r1 = r0.chin
            r0.chin = r1
            float r0 = r3.leftEyeclose
            r2.mLeftEyeClose = r0
            float r3 = r3.rightEyeclose
            r2.mRightEyeClose = r3
            return
    }

    public void addFaceInfo(com.baidu.idl.main.facesdk.FaceInfo r3) {
            r2 = this;
            int r0 = r3.faceID
            r2.mFaceID = r0
            float r0 = r3.centerX
            r2.mCenterX = r0
            float r0 = r3.centerY
            r2.mCenterY = r0
            float r0 = r3.width
            r2.mWidth = r0
            float r0 = r3.height
            r2.mHeight = r0
            float r0 = r3.angle
            r2.mAngle = r0
            float r0 = r3.score
            r2.mScore = r0
            float[] r0 = r3.landmarks
            r2.mLandmarks = r0
            float r0 = r3.pitch
            r2.mPitch = r0
            float r0 = r3.roll
            r2.mRoll = r0
            float r0 = r3.yaw
            r2.mYaw = r0
            float r0 = r3.bluriness
            r2.mBluriness = r0
            int r0 = r3.illum
            r2.mIllum = r0
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r0 = r3.occlusion
            r2.mOcclusion = r0
            float r1 = r0.leftEye
            r0.leftEye = r1
            float r1 = r0.rightEye
            r0.rightEye = r1
            float r1 = r0.nose
            r0.nose = r1
            float r1 = r0.mouth
            r0.mouth = r1
            float r1 = r0.leftCheek
            r0.leftCheek = r1
            float r1 = r0.rightCheek
            r0.rightCheek = r1
            float r1 = r0.chin
            r0.chin = r1
            float r0 = r3.leftEyeclose
            r2.mLeftEyeClose = r0
            float r3 = r3.rightEyeclose
            r2.mRightEyeClose = r3
            return
    }

    public float getBluriness() {
            r1 = this;
            float r0 = r1.mBluriness
            return r0
    }

    public float getConfidence() {
            r1 = this;
            float r0 = r1.mScore
            return r0
    }

    public int getFaceId() {
            r1 = this;
            int r0 = r1.mFaceID
            return r0
    }

    public android.graphics.Rect getFaceRect() {
            r5 = this;
            android.graphics.Rect r0 = new android.graphics.Rect
            float r1 = r5.mCenterX
            float r2 = r5.mWidth
            r3 = 1073741824(0x40000000, float:2.0)
            float r4 = r2 / r3
            float r1 = r1 - r4
            int r1 = (int) r1
            float r4 = r5.mCenterY
            float r3 = r2 / r3
            float r4 = r4 - r3
            int r3 = (int) r4
            int r4 = (int) r2
            int r2 = (int) r2
            r0.<init>(r1, r3, r4, r2)
            return r0
    }

    public android.graphics.Rect getFaceRect(float r9, float r10, float r11) {
            r8 = this;
            float r0 = r8.mCenterX
            float r0 = r0 * r9
            float r1 = r8.mCenterY
            float r1 = r1 * r10
            android.graphics.Rect r2 = new android.graphics.Rect
            float r3 = r8.mWidth
            r4 = 1073741824(0x40000000, float:2.0)
            float r5 = r3 / r4
            float r5 = r5 * r9
            float r5 = r5 * r11
            float r5 = r0 - r5
            int r5 = (int) r5
            float r6 = r3 / r4
            float r6 = r6 * r10
            float r6 = r6 * r11
            float r6 = r1 - r6
            int r6 = (int) r6
            float r7 = r3 / r4
            float r7 = r7 * r9
            float r7 = r7 * r11
            float r0 = r0 + r7
            int r9 = (int) r0
            float r3 = r3 / r4
            float r3 = r3 * r10
            float r3 = r3 * r11
            float r1 = r1 + r3
            int r10 = (int) r1
            r2.<init>(r5, r6, r9, r10)
            return r2
    }

    public int getFaceWidth() {
            r1 = this;
            float r0 = r1.mWidth
            int r0 = (int) r0
            return r0
    }

    public int getIllum() {
            r1 = this;
            int r0 = r1.mIllum
            return r0
    }

    public int getLandmarksOutOfDetectCount(android.graphics.Rect r15) {
            r14 = this;
            float[] r0 = r14.mLandmarks
            int r0 = r0.length
            r1 = 144(0x90, float:2.02E-43)
            r2 = 0
            if (r0 != r1) goto L96
            r0 = 9
            int[][] r0 = new int[r0][]
            int[] r1 = com.baidu.idl.face.platform.model.FaceExtInfo.comp1
            r0[r2] = r1
            int[] r1 = com.baidu.idl.face.platform.model.FaceExtInfo.comp2
            r3 = 1
            r0[r3] = r1
            int[] r1 = com.baidu.idl.face.platform.model.FaceExtInfo.comp3
            r4 = 2
            r0[r4] = r1
            int[] r1 = com.baidu.idl.face.platform.model.FaceExtInfo.comp4
            r5 = 3
            r0[r5] = r1
            int[] r1 = com.baidu.idl.face.platform.model.FaceExtInfo.comp5
            r6 = 4
            r0[r6] = r1
            int[] r1 = com.baidu.idl.face.platform.model.FaceExtInfo.comp6
            r7 = 5
            r0[r7] = r1
            int[] r1 = com.baidu.idl.face.platform.model.FaceExtInfo.comp7
            r7 = 6
            r0[r7] = r1
            int[] r1 = com.baidu.idl.face.platform.model.FaceExtInfo.comp8
            r7 = 7
            r0[r7] = r1
            int[] r1 = com.baidu.idl.face.platform.model.FaceExtInfo.comp9
            r7 = 8
            r0[r7] = r1
            r1 = 0
            r7 = 0
        L3b:
            int r8 = com.baidu.idl.face.platform.model.FaceExtInfo.nComponents
            if (r1 >= r8) goto L95
            r8 = 0
        L40:
            int[] r9 = com.baidu.idl.face.platform.model.FaceExtInfo.nPoints
            r9 = r9[r1]
            int r9 = r9 - r3
            if (r8 >= r9) goto L92
            float[] r9 = r14.mLandmarks
            r10 = r0[r1]
            r11 = r10[r8]
            int r12 = r11 << 1
            r12 = r9[r12]
            int r11 = r11 << r3
            int r11 = r11 + r3
            r11 = r9[r11]
            int r8 = r8 + 1
            r10 = r10[r8]
            int r13 = r10 << 1
            r13 = r9[r13]
            int r10 = r10 << r3
            int r10 = r10 + r3
            r9 = r9[r10]
            float[] r10 = new float[r6]
            r10[r2] = r12
            r10[r3] = r11
            r10[r4] = r13
            r10[r5] = r9
            r9 = r10[r2]
            r11 = 1065353216(0x3f800000, float:1.0)
            float r9 = r9 * r11
            int r9 = (int) r9
            r12 = r10[r3]
            float r12 = r12 * r11
            int r12 = (int) r12
            boolean r9 = r15.contains(r9, r12)
            if (r9 != 0) goto L7f
            int r7 = r7 + 1
        L7f:
            r9 = r10[r4]
            float r9 = r9 * r11
            int r9 = (int) r9
            r10 = r10[r5]
            float r10 = r10 * r11
            int r10 = (int) r10
            boolean r9 = r15.contains(r9, r10)
            if (r9 != 0) goto L40
            int r7 = r7 + 1
            goto L40
        L92:
            int r1 = r1 + 1
            goto L3b
        L95:
            return r7
        L96:
            return r2
    }

    public float getLeftEyeClose() {
            r1 = this;
            float r0 = r1.mLeftEyeClose
            return r0
    }

    public com.baidu.idl.main.facesdk.model.BDFaceOcclusion getOcclusion() {
            r1 = this;
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r0 = r1.mOcclusion
            return r0
    }

    public float getPitch() {
            r1 = this;
            float r0 = r1.mPitch
            return r0
    }

    public void getRectPoints(int[] r20) {
            r19 = this;
            r0 = r19
            r1 = r20
            float r2 = r0.mAngle
            double r2 = (double) r2
            r4 = 4614256650576692846(0x400921f9f01b866e, double:3.14159)
            double r2 = r2 * r4
            r6 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r2 = r2 / r6
            double r8 = java.lang.Math.cos(r2)
            double r2 = java.lang.Math.sin(r2)
            float r10 = r0.mCenterX
            double r10 = (double) r10
            float r12 = r0.mWidth
            double r13 = (double) r12
            double r13 = r13 * r8
            r15 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r13 = r13 / r15
            double r10 = r10 + r13
            double r13 = (double) r12
            double r13 = r13 * r2
            double r13 = r13 / r15
            double r10 = r10 - r13
            int r10 = (int) r10
            float r11 = r0.mCenterY
            double r13 = (double) r11
            r17 = r4
            double r4 = (double) r12
            double r2 = r2 * r4
            double r2 = r2 / r15
            double r13 = r13 + r2
            double r2 = (double) r12
            double r8 = r8 * r2
            double r8 = r8 / r15
            double r13 = r13 + r8
            int r2 = (int) r13
            float r3 = r0.mAngle
            double r3 = (double) r3
            double r3 = r3 * r17
            double r3 = r3 / r6
            double r5 = java.lang.Math.cos(r3)
            r7 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r5 = r5 * r7
            double r3 = java.lang.Math.sin(r3)
            double r3 = r3 * r7
            if (r1 == 0) goto L57
            int r7 = r1.length
            if (r7 != 0) goto L5b
        L57:
            r1 = 8
            int[] r1 = new int[r1]
        L5b:
            double r7 = (double) r10
            float r9 = r0.mWidth
            double r11 = (double) r9
            double r11 = r11 * r3
            double r11 = r7 - r11
            double r13 = (double) r9
            double r13 = r13 * r5
            double r11 = r11 - r13
            int r11 = (int) r11
            r12 = 0
            r1[r12] = r11
            double r12 = (double) r2
            double r14 = (double) r9
            double r14 = r14 * r5
            double r14 = r14 + r12
            r20 = r1
            double r0 = (double) r9
            double r0 = r0 * r3
            double r14 = r14 - r0
            int r0 = (int) r14
            r1 = 1
            r20[r1] = r0
            double r14 = (double) r9
            double r14 = r14 * r3
            double r7 = r7 + r14
            double r14 = (double) r9
            double r14 = r14 * r5
            double r7 = r7 - r14
            int r1 = (int) r7
            r7 = 2
            r20[r7] = r1
            double r14 = (double) r9
            double r5 = r5 * r14
            double r12 = r12 - r5
            double r5 = (double) r9
            double r3 = r3 * r5
            double r12 = r12 - r3
            int r3 = (int) r12
            r4 = 3
            r20[r4] = r3
            int r10 = r10 * 2
            int r4 = r10 - r11
            r5 = 4
            r20[r5] = r4
            int r2 = r2 * 2
            int r0 = r2 - r0
            r4 = 5
            r20[r4] = r0
            r0 = 6
            int r10 = r10 - r1
            r20[r0] = r10
            r0 = 7
            int r2 = r2 - r3
            r20[r0] = r2
            return
    }

    public float getRightEyeClose() {
            r1 = this;
            float r0 = r1.mRightEyeClose
            return r0
    }

    public float getRoll() {
            r1 = this;
            float r0 = r1.mRoll
            return r0
    }

    public float getYaw() {
            r1 = this;
            float r0 = r1.mYaw
            return r0
    }

    public float[] getmLandmarks() {
            r1 = this;
            float[] r0 = r1.mLandmarks
            return r0
    }

    public boolean isOutofDetectRect(android.graphics.Rect r2) {
            r1 = this;
            android.graphics.Rect r0 = r1.getFaceRect()
            boolean r2 = r2.contains(r0)
            return r2
    }

    public void setLeftEyeClose(float r1) {
            r0 = this;
            r0.mLeftEyeClose = r1
            return
    }

    public void setRightEyeClose(float r1) {
            r0 = this;
            r0.mRightEyeClose = r1
            return
    }
}

package com.baidu.idl.face.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceConfig implements java.io.Serializable {
    private static final java.lang.String TAG = "FaceConfig";
    private float blurnessValue;
    private float brightnessMaxValue;
    private float brightnessValue;
    private int cacheImageNum;
    private int cropHeight;
    private int cropWidth;
    private float enlargeRatio;
    private float eyeClosedValue;
    private float faceClosedRatio;
    private float faceFarRatio;
    private int headPitchValue;
    private int headRollValue;
    private int headYawValue;
    private boolean isLivenessRandom;
    private boolean isOpenMask;
    private boolean isOpenOnline;
    private boolean isSound;
    private int livenessRandomCount;
    private java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> livenessTypeList;
    private float maskValue;
    private int minFaceSize;
    private float notFaceValue;
    private float occlusionChinValue;
    private float occlusionLeftContourValue;
    private float occlusionLeftEyeValue;
    private float occlusionMouthValue;
    private float occlusionNoseValue;
    private float occlusionRightContourValue;
    private float occlusionRightEyeValue;
    private float occlusionValue;
    private int qualityLevel;
    private float scale;
    private int secType;
    private long timeDetectModule;
    private long timeLivenessCourse;

    static {
            return
    }

    public FaceConfig() {
            r4 = this;
            r4.<init>()
            r0 = 200(0xc8, float:2.8E-43)
            r4.minFaceSize = r0
            r0 = 1058642330(0x3f19999a, float:0.6)
            r4.notFaceValue = r0
            r0 = 1118044160(0x42a40000, float:82.0)
            r4.brightnessValue = r0
            r0 = 1128792064(0x43480000, float:200.0)
            r4.brightnessMaxValue = r0
            r0 = 1060320051(0x3f333333, float:0.7)
            r4.blurnessValue = r0
            r1 = 1056964608(0x3f000000, float:0.5)
            r4.occlusionValue = r1
            r4.occlusionLeftEyeValue = r1
            r4.occlusionRightEyeValue = r1
            r4.occlusionNoseValue = r1
            r4.occlusionMouthValue = r1
            r4.occlusionLeftContourValue = r1
            r4.occlusionRightContourValue = r1
            r4.occlusionChinValue = r1
            r1 = 8
            r4.headPitchValue = r1
            r4.headYawValue = r1
            r4.headRollValue = r1
            r4.eyeClosedValue = r0
            r1 = 1
            r4.isSound = r1
            r2 = 0
            r4.isLivenessRandom = r2
            r3 = 3
            r4.cacheImageNum = r3
            r4.livenessRandomCount = r3
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r3 = com.baidu.idl.face.platform.FaceEnvironment.livenessTypeDefaultList
            r4.livenessTypeList = r3
            r4.isOpenOnline = r1
            r3 = 640(0x280, float:8.97E-43)
            r4.cropHeight = r3
            r3 = 480(0x1e0, float:6.73E-43)
            r4.cropWidth = r3
            r3 = 1069547520(0x3fc00000, float:1.5)
            r4.enlargeRatio = r3
            r3 = 1065353216(0x3f800000, float:1.0)
            r4.scale = r3
            r4.secType = r2
            r4.maskValue = r0
            r4.isOpenMask = r1
            r0 = 15000(0x3a98, double:7.411E-320)
            r4.timeDetectModule = r0
            r0 = 5000(0x1388, double:2.4703E-320)
            r4.timeLivenessCourse = r0
            r4.qualityLevel = r2
            r0 = 1053609165(0x3ecccccd, float:0.4)
            r4.faceFarRatio = r0
            r4.faceClosedRatio = r3
            return
    }

    public static java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> getRandomList(java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r6, int r7) {
            int r0 = r6.size()
            if (r0 >= r7) goto L7
            return r6
        L7:
            java.util.Random r0 = new java.util.Random
            r0.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r3 = 0
        L17:
            if (r3 >= r7) goto L3f
            int r4 = r6.size()
            int r4 = r0.nextInt(r4)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            boolean r5 = r1.contains(r5)
            if (r5 != 0) goto L3a
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r1.add(r5)
            java.lang.Object r4 = r6.get(r4)
            r2.add(r4)
            goto L3c
        L3a:
            int r3 = r3 + (-1)
        L3c:
            int r3 = r3 + 1
            goto L17
        L3f:
            return r2
    }

    public float getBlurnessValue() {
            r1 = this;
            float r0 = r1.blurnessValue
            return r0
    }

    public float getBrightnessMaxValue() {
            r1 = this;
            float r0 = r1.brightnessMaxValue
            return r0
    }

    public float getBrightnessValue() {
            r1 = this;
            float r0 = r1.brightnessValue
            return r0
    }

    public int getCacheImageNum() {
            r1 = this;
            int r0 = r1.cacheImageNum
            return r0
    }

    public int getCropHeight() {
            r1 = this;
            int r0 = r1.cropHeight
            return r0
    }

    public int getCropWidth() {
            r1 = this;
            int r0 = r1.cropWidth
            return r0
    }

    public float getEnlargeRatio() {
            r1 = this;
            float r0 = r1.enlargeRatio
            return r0
    }

    public float getEyeClosedValue() {
            r1 = this;
            float r0 = r1.eyeClosedValue
            return r0
    }

    public float getFaceClosedRatio() {
            r1 = this;
            float r0 = r1.faceClosedRatio
            return r0
    }

    public float getFaceFarRatio() {
            r1 = this;
            float r0 = r1.faceFarRatio
            return r0
    }

    public int getHeadPitchValue() {
            r1 = this;
            int r0 = r1.headPitchValue
            return r0
    }

    public int getHeadRollValue() {
            r1 = this;
            int r0 = r1.headRollValue
            return r0
    }

    public int getHeadYawValue() {
            r1 = this;
            int r0 = r1.headYawValue
            return r0
    }

    public int getLivenessRandomCount() {
            r1 = this;
            int r0 = r1.livenessRandomCount
            return r0
    }

    public java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> getLivenessTypeList() {
            r3 = this;
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r0 = r3.livenessTypeList
            if (r0 == 0) goto L1a
            int r0 = r0.size()
            if (r0 != 0) goto Lb
            goto L1a
        Lb:
            boolean r0 = r3.isLivenessRandom
            if (r0 == 0) goto L38
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r0 = r3.livenessTypeList
            int r1 = r0.size()
            java.util.List r0 = getRandomList(r0, r1)
            return r0
        L1a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.livenessTypeList = r0
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r1 = com.baidu.idl.face.platform.FaceEnvironment.livenessTypeDefaultList
            r0.addAll(r1)
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r0 = r3.livenessTypeList
            java.util.Collections.shuffle(r0)
            int r0 = r3.getLivenessRandomCount()
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r1 = r3.livenessTypeList
            r2 = 0
            java.util.List r0 = r1.subList(r2, r0)
            r3.livenessTypeList = r0
        L38:
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r0 = r3.livenessTypeList
            return r0
    }

    public float getMaskValue() {
            r1 = this;
            float r0 = r1.maskValue
            return r0
    }

    public int getMinFaceSize() {
            r1 = this;
            int r0 = r1.minFaceSize
            return r0
    }

    public float getNotFaceValue() {
            r1 = this;
            float r0 = r1.notFaceValue
            return r0
    }

    public float getOcclusionChinValue() {
            r1 = this;
            float r0 = r1.occlusionChinValue
            return r0
    }

    public float getOcclusionLeftContourValue() {
            r1 = this;
            float r0 = r1.occlusionLeftContourValue
            return r0
    }

    public float getOcclusionLeftEyeValue() {
            r1 = this;
            float r0 = r1.occlusionLeftEyeValue
            return r0
    }

    public float getOcclusionMouthValue() {
            r1 = this;
            float r0 = r1.occlusionMouthValue
            return r0
    }

    public float getOcclusionNoseValue() {
            r1 = this;
            float r0 = r1.occlusionNoseValue
            return r0
    }

    public float getOcclusionRightContourValue() {
            r1 = this;
            float r0 = r1.occlusionRightContourValue
            return r0
    }

    public float getOcclusionRightEyeValue() {
            r1 = this;
            float r0 = r1.occlusionRightEyeValue
            return r0
    }

    public float getOcclusionValue() {
            r1 = this;
            float r0 = r1.occlusionValue
            return r0
    }

    public int getQualityLevel() {
            r1 = this;
            int r0 = r1.qualityLevel
            return r0
    }

    public float getScale() {
            r1 = this;
            float r0 = r1.scale
            return r0
    }

    public int getSecType() {
            r1 = this;
            int r0 = r1.secType
            return r0
    }

    public long getTimeDetectModule() {
            r2 = this;
            long r0 = r2.timeDetectModule
            return r0
    }

    public long getTimeLivenessCourse() {
            r2 = this;
            long r0 = r2.timeLivenessCourse
            return r0
    }

    public boolean isLivenessRandom() {
            r1 = this;
            boolean r0 = r1.isLivenessRandom
            return r0
    }

    public boolean isOpenMask() {
            r1 = this;
            boolean r0 = r1.isOpenMask
            return r0
    }

    public boolean isOpenOnline() {
            r1 = this;
            boolean r0 = r1.isOpenOnline
            return r0
    }

    public boolean isSound() {
            r1 = this;
            boolean r0 = r1.isSound
            return r0
    }

    public void setBlurnessValue(float r1) {
            r0 = this;
            r0.blurnessValue = r1
            return
    }

    public void setBrightnessMaxValue(float r1) {
            r0 = this;
            r0.brightnessMaxValue = r1
            return
    }

    public void setBrightnessValue(float r1) {
            r0 = this;
            r0.brightnessValue = r1
            return
    }

    public void setCacheImageNum(int r1) {
            r0 = this;
            r0.cacheImageNum = r1
            return
    }

    public void setCropHeight(int r1) {
            r0 = this;
            r0.cropHeight = r1
            return
    }

    public void setCropWidth(int r1) {
            r0 = this;
            r0.cropWidth = r1
            return
    }

    public void setEnlargeRatio(float r1) {
            r0 = this;
            r0.enlargeRatio = r1
            return
    }

    public void setEyeClosedValue(float r1) {
            r0 = this;
            r0.eyeClosedValue = r1
            return
    }

    public void setFaceClosedRatio(float r1) {
            r0 = this;
            r0.faceClosedRatio = r1
            return
    }

    public void setFaceFarRatio(float r1) {
            r0 = this;
            r0.faceFarRatio = r1
            return
    }

    public void setHeadPitchValue(int r1) {
            r0 = this;
            r0.headPitchValue = r1
            return
    }

    public void setHeadRollValue(int r1) {
            r0 = this;
            r0.headRollValue = r1
            return
    }

    public void setHeadYawValue(int r1) {
            r0 = this;
            r0.headYawValue = r1
            return
    }

    public void setLivenessRandom(boolean r1) {
            r0 = this;
            r0.isLivenessRandom = r1
            return
    }

    public void setLivenessRandomCount(int r2) {
            r1 = this;
            java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r0 = com.baidu.idl.face.platform.FaceEnvironment.livenessTypeDefaultList
            int r0 = r0.size()
            if (r2 > r0) goto L9
            goto La
        L9:
            r2 = r0
        La:
            r1.livenessRandomCount = r2
            return
    }

    public void setLivenessTypeList(java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> r1) {
            r0 = this;
            r0.livenessTypeList = r1
            return
    }

    public void setMaskValue(float r1) {
            r0 = this;
            r0.maskValue = r1
            return
    }

    public void setMinFaceSize(int r1) {
            r0 = this;
            r0.minFaceSize = r1
            return
    }

    public void setNotFaceValue(float r1) {
            r0 = this;
            r0.notFaceValue = r1
            return
    }

    public void setOcclusionChinValue(float r1) {
            r0 = this;
            r0.occlusionChinValue = r1
            return
    }

    public void setOcclusionLeftContourValue(float r1) {
            r0 = this;
            r0.occlusionLeftContourValue = r1
            return
    }

    public void setOcclusionLeftEyeValue(float r1) {
            r0 = this;
            r0.occlusionLeftEyeValue = r1
            return
    }

    public void setOcclusionMouthValue(float r1) {
            r0 = this;
            r0.occlusionMouthValue = r1
            return
    }

    public void setOcclusionNoseValue(float r1) {
            r0 = this;
            r0.occlusionNoseValue = r1
            return
    }

    public void setOcclusionRightContourValue(float r1) {
            r0 = this;
            r0.occlusionRightContourValue = r1
            return
    }

    public void setOcclusionRightEyeValue(float r1) {
            r0 = this;
            r0.occlusionRightEyeValue = r1
            return
    }

    public void setOcclusionValue(float r1) {
            r0 = this;
            r0.occlusionValue = r1
            return
    }

    public void setOpenMask(boolean r1) {
            r0 = this;
            r0.isOpenMask = r1
            return
    }

    public void setOpenOnline(boolean r1) {
            r0 = this;
            r0.isOpenOnline = r1
            return
    }

    public void setQualityLevel(int r1) {
            r0 = this;
            r0.qualityLevel = r1
            return
    }

    public void setScale(float r1) {
            r0 = this;
            r0.scale = r1
            return
    }

    public void setSecType(int r1) {
            r0 = this;
            r0.secType = r1
            return
    }

    public void setSound(boolean r1) {
            r0 = this;
            r0.isSound = r1
            return
    }

    public void setTimeDetectModule(long r1) {
            r0 = this;
            r0.timeDetectModule = r1
            return
    }

    public void setTimeLivenessCourse(long r1) {
            r0 = this;
            r0.timeLivenessCourse = r1
            return
    }
}

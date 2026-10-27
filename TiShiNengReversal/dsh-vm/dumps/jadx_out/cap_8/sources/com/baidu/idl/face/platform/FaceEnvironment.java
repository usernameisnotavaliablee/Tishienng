package com.baidu.idl.face.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class FaceEnvironment {
    public static final java.lang.String OS = "android";
    public static final java.lang.String SDK_VERSION = "4.1.5";
    public static final java.lang.String TAG = "Baidu-IDL-FaceSDK";
    public static final long TIME_DETECT_MODULE = 15000;
    public static long TIME_DETECT_NO_FACE_CONTINUOUS = 0;
    public static final long TIME_LIVENESS_COURSE = 5000;
    public static long TIME_LIVENESS_MODULE = 0;
    public static long TIME_MODULE = 0;
    public static long TIME_TIPS_REPEAT = 0;
    public static final float VALUE_BLURNESS = 0.7f;
    public static final float VALUE_BRIGHTNESS = 82.0f;
    public static final int VALUE_CACHE_IMAGE_NUM = 3;
    public static final float VALUE_CLOSED_RATIO = 1.0f;
    public static final float VALUE_CLOSE_EYES = 0.7f;
    public static final float VALUE_CROP_CHINEXTEND = 0.11111111f;
    public static final float VALUE_CROP_ENLARGERATIO = 1.5f;
    public static final float VALUE_CROP_FOREHEADEXTEND = 0.22222222f;
    public static final int VALUE_CROP_HEIGHT = 640;
    public static final int VALUE_CROP_WIDTH = 480;
    public static final int VALUE_DECODE_THREAD_NUM = 2;
    public static final float VALUE_FAR_RATIO = 0.4f;
    public static final int VALUE_HEAD_PITCH = 8;
    public static final int VALUE_HEAD_ROLL = 8;
    public static final int VALUE_HEAD_YAW = 8;
    public static final int VALUE_IMAGESTANCE_IS_MIRROR = 1;
    public static final int VALUE_LIVENESS_DEFAULT_RANDOM_COUNT = 3;
    public static final float VALUE_MASK_THRESHOLD = 0.7f;
    public static final float VALUE_MAX_BRIGHTNESS = 200.0f;
    public static final int VALUE_MIN_FACE_SIZE = 200;
    public static final float VALUE_NOT_FACE_THRESHOLD = 0.6f;
    public static final float VALUE_OCCLUSION = 0.5f;
    public static final boolean VALUE_OPEN_MASK = true;
    public static final boolean VALUE_OPEN_ONLINE = true;
    public static final float VALUE_SCALE = 1.0f;
    public static final int VALUE_SEC_TYPE = 0;
    public static final java.util.List<com.baidu.idl.face.platform.LivenessTypeEnum> livenessTypeDefaultList = null;
    private static int[] mSoundIds;
    private static int[] mTipsTextIds;

    static {
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.baidu.idl.face.platform.FaceEnvironment.livenessTypeDefaultList = r0
            r1 = 2000(0x7d0, double:9.88E-321)
            com.baidu.idl.face.platform.FaceEnvironment.TIME_TIPS_REPEAT = r1
            r1 = 0
            com.baidu.idl.face.platform.FaceEnvironment.TIME_MODULE = r1
            r1 = 1000(0x3e8, double:4.94E-321)
            com.baidu.idl.face.platform.FaceEnvironment.TIME_DETECT_NO_FACE_CONTINUOUS = r1
            r1 = 15000(0x3a98, double:7.411E-320)
            com.baidu.idl.face.platform.FaceEnvironment.TIME_LIVENESS_MODULE = r1
            com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.Eye
            r0.add(r1)
            com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.Mouth
            r0.add(r1)
            com.baidu.idl.face.platform.LivenessTypeEnum r1 = com.baidu.idl.face.platform.LivenessTypeEnum.HeadRight
            r0.add(r1)
            com.baidu.idl.face.platform.FaceStatusNewEnum[] r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            com.baidu.idl.face.platform.FaceEnvironment.mSoundIds = r0
            com.baidu.idl.face.platform.FaceStatusNewEnum[] r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.values()
            int r0 = r0.length
            int[] r0 = new int[r0]
            com.baidu.idl.face.platform.FaceEnvironment.mTipsTextIds = r0
            r0 = 0
            r1 = 0
        L3a:
            int[] r2 = com.baidu.idl.face.platform.FaceEnvironment.mSoundIds
            int r3 = r2.length
            if (r1 >= r3) goto L48
            r2[r1] = r0
            int[] r2 = com.baidu.idl.face.platform.FaceEnvironment.mTipsTextIds
            r2[r1] = r0
            int r1 = r1 + 1
            goto L3a
        L48:
            return
    }

    public FaceEnvironment() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int getSoundId(com.baidu.idl.face.platform.FaceStatusNewEnum r1) {
            int[] r0 = com.baidu.idl.face.platform.FaceEnvironment.mSoundIds
            int r1 = r1.ordinal()
            r1 = r0[r1]
            return r1
    }

    public static int getTipsId(com.baidu.idl.face.platform.FaceStatusNewEnum r1) {
            int[] r0 = com.baidu.idl.face.platform.FaceEnvironment.mTipsTextIds
            int r1 = r1.ordinal()
            r1 = r0[r1]
            return r1
    }

    public static void setSoundId(com.baidu.idl.face.platform.FaceStatusNewEnum r1, int r2) {
            int[] r0 = com.baidu.idl.face.platform.FaceEnvironment.mSoundIds
            if (r0 == 0) goto La
            int r1 = r1.ordinal()     // Catch: java.lang.Exception -> La
            r0[r1] = r2     // Catch: java.lang.Exception -> La
        La:
            return
    }

    public static void setTipsId(com.baidu.idl.face.platform.FaceStatusNewEnum r1, int r2) {
            int[] r0 = com.baidu.idl.face.platform.FaceEnvironment.mTipsTextIds
            if (r0 == 0) goto La
            int r1 = r1.ordinal()     // Catch: java.lang.Exception -> La
            r0[r1] = r2     // Catch: java.lang.Exception -> La
        La:
            return
    }
}

package com.baidu.idl.main.facesdk;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceInfo {
    public int age;
    public float angle;
    public float bluriness;
    public float centerX;
    public float centerY;
    public com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum emotionSeven;
    public com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion emotionThree;
    public int faceID;
    public com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender gender;
    public com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses glasses;
    public float height;
    public int illum;
    public float[] landmarks;
    public float leftEyeclose;
    public float mouthclose;
    public com.baidu.idl.main.facesdk.model.BDFaceOcclusion occlusion;
    public float pitch;
    public com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace race;
    public float rightEyeclose;
    public float roll;
    public float score;
    public float width;
    public float yaw;

    public FaceInfo(int r2, float[] r3, float[] r4) {
            r1 = this;
            r1.<init>()
            r1.faceID = r2
            if (r3 == 0) goto L29
            int r2 = r3.length
            r0 = 6
            if (r2 != r0) goto L29
            r2 = 0
            r2 = r3[r2]
            r1.centerX = r2
            r2 = 1
            r2 = r3[r2]
            r1.centerY = r2
            r2 = 2
            r2 = r3[r2]
            r1.width = r2
            r2 = 3
            r2 = r3[r2]
            r1.height = r2
            r2 = 4
            r2 = r3[r2]
            r1.angle = r2
            r2 = 5
            r2 = r3[r2]
            r1.score = r2
        L29:
            r1.landmarks = r4
            return
    }

    public FaceInfo(int r21, float[] r22, float[] r23, float[] r24, float[] r25, float[] r26) {
            r20 = this;
            r0 = r20
            r1 = r22
            r2 = r24
            r3 = r25
            r4 = r26
            r0.<init>()
            r5 = r21
            r0.faceID = r5
            r5 = 5
            r6 = 4
            r7 = 6
            r8 = 3
            r9 = 2
            r10 = 1
            r11 = 0
            if (r1 == 0) goto L35
            int r12 = r1.length
            if (r12 != r7) goto L35
            r12 = r1[r11]
            r0.centerX = r12
            r12 = r1[r10]
            r0.centerY = r12
            r12 = r1[r9]
            r0.width = r12
            r12 = r1[r8]
            r0.height = r12
            r12 = r1[r6]
            r0.angle = r12
            r1 = r1[r5]
            r0.score = r1
        L35:
            r1 = r23
            r0.landmarks = r1
            if (r2 == 0) goto L4a
            int r1 = r2.length
            if (r1 != r8) goto L4a
            r1 = r2[r11]
            r0.yaw = r1
            r1 = r2[r10]
            r0.roll = r1
            r1 = r2[r9]
            r0.pitch = r1
        L4a:
            if (r3 == 0) goto L72
            int r1 = r3.length
            r2 = 9
            if (r1 != r2) goto L72
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r12 = new com.baidu.idl.main.facesdk.model.BDFaceOcclusion
            r13 = r3[r11]
            r14 = r3[r10]
            r15 = r3[r9]
            r16 = r3[r8]
            r17 = r3[r6]
            r18 = r3[r5]
            r19 = r3[r7]
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r0.occlusion = r12
            r1 = 7
            r1 = r3[r1]
            int r1 = (int) r1
            r0.illum = r1
            r1 = 8
            r1 = r3[r1]
            r0.bluriness = r1
        L72:
            if (r4 == 0) goto L83
            int r1 = r4.length
            if (r1 != r8) goto L83
            r1 = r4[r11]
            r0.leftEyeclose = r1
            r1 = r4[r10]
            r0.rightEyeclose = r1
            r1 = r4[r9]
            r0.mouthclose = r1
        L83:
            return
    }

    public FaceInfo(int r22, float[] r23, float[] r24, float[] r25, float[] r26, int[] r27, float[] r28) {
            r21 = this;
            r0 = r21
            r1 = r23
            r2 = r25
            r3 = r26
            r4 = r27
            r5 = r28
            r0.<init>()
            r6 = r22
            r0.faceID = r6
            r6 = 5
            r7 = 4
            r8 = 6
            r9 = 3
            r10 = 2
            r11 = 1
            r12 = 0
            if (r1 == 0) goto L37
            int r13 = r1.length
            if (r13 != r8) goto L37
            r13 = r1[r12]
            r0.centerX = r13
            r13 = r1[r11]
            r0.centerY = r13
            r13 = r1[r10]
            r0.width = r13
            r13 = r1[r9]
            r0.height = r13
            r13 = r1[r7]
            r0.angle = r13
            r1 = r1[r6]
            r0.score = r1
        L37:
            r1 = r24
            r0.landmarks = r1
            if (r2 == 0) goto L4c
            int r1 = r2.length
            if (r1 != r9) goto L4c
            r1 = r2[r12]
            r0.yaw = r1
            r1 = r2[r11]
            r0.roll = r1
            r1 = r2[r10]
            r0.pitch = r1
        L4c:
            if (r3 == 0) goto L74
            int r1 = r3.length
            r2 = 9
            if (r1 != r2) goto L74
            com.baidu.idl.main.facesdk.model.BDFaceOcclusion r13 = new com.baidu.idl.main.facesdk.model.BDFaceOcclusion
            r14 = r3[r12]
            r15 = r3[r11]
            r16 = r3[r10]
            r17 = r3[r9]
            r18 = r3[r7]
            r19 = r3[r6]
            r20 = r3[r8]
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            r0.occlusion = r13
            r1 = 7
            r1 = r3[r1]
            int r1 = (int) r1
            r0.illum = r1
            r1 = 8
            r1 = r3[r1]
            r0.bluriness = r1
        L74:
            if (r4 == 0) goto Laf
            int r1 = r4.length
            if (r1 != r8) goto Laf
            r1 = r4[r12]
            r0.age = r1
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace[] r1 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace.values()
            r2 = r4[r11]
            r1 = r1[r2]
            r0.race = r1
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotion[] r1 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion.values()
            r2 = r4[r10]
            r1 = r1[r2]
            r0.emotionThree = r1
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGlasses[] r1 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses.values()
            r2 = r4[r9]
            r1 = r1[r2]
            r0.glasses = r1
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGender[] r1 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender.values()
            r2 = r4[r7]
            r1 = r1[r2]
            r0.gender = r1
            com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum[] r1 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum.values()
            r2 = r4[r6]
            r1 = r1[r2]
            r0.emotionSeven = r1
        Laf:
            if (r5 == 0) goto Lc0
            int r1 = r5.length
            if (r1 != r9) goto Lc0
            r1 = r5[r12]
            r0.leftEyeclose = r1
            r1 = r5[r11]
            r0.rightEyeclose = r1
            r1 = r5[r10]
            r0.mouthclose = r1
        Lc0:
            return
    }
}

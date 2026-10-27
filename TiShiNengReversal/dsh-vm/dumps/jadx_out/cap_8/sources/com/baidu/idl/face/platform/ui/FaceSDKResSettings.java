package com.baidu.idl.face.platform.ui;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class FaceSDKResSettings {
    public FaceSDKResSettings() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void initializeResId() {
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeNoFaceDetected
            int r1 = com.baidu.idl.face.platform.ui.R.raw.detect_face_in
            com.baidu.idl.face.platform.FaceEnvironment.setSoundId(r0, r1)
            com.baidu.idl.face.platform.FaceStatusNewEnum r2 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeBeyondPreviewFrame
            com.baidu.idl.face.platform.FaceEnvironment.setSoundId(r2, r1)
            com.baidu.idl.face.platform.FaceEnvironment.setSoundId(r0, r1)
            com.baidu.idl.face.platform.FaceStatusNewEnum r1 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLiveEye
            int r3 = com.baidu.idl.face.platform.ui.R.raw.liveness_eye
            com.baidu.idl.face.platform.FaceEnvironment.setSoundId(r1, r3)
            com.baidu.idl.face.platform.FaceStatusNewEnum r3 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLiveMouth
            int r4 = com.baidu.idl.face.platform.ui.R.raw.liveness_mouth
            com.baidu.idl.face.platform.FaceEnvironment.setSoundId(r3, r4)
            com.baidu.idl.face.platform.FaceStatusNewEnum r4 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLivePitchUp
            int r5 = com.baidu.idl.face.platform.ui.R.raw.liveness_head_up
            com.baidu.idl.face.platform.FaceEnvironment.setSoundId(r4, r5)
            com.baidu.idl.face.platform.FaceStatusNewEnum r5 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLivePitchDown
            int r6 = com.baidu.idl.face.platform.ui.R.raw.liveness_head_down
            com.baidu.idl.face.platform.FaceEnvironment.setSoundId(r5, r6)
            com.baidu.idl.face.platform.FaceStatusNewEnum r6 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLiveYawLeft
            int r7 = com.baidu.idl.face.platform.ui.R.raw.liveness_head_left
            com.baidu.idl.face.platform.FaceEnvironment.setSoundId(r6, r7)
            com.baidu.idl.face.platform.FaceStatusNewEnum r7 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionTypeLiveYawRight
            int r8 = com.baidu.idl.face.platform.ui.R.raw.liveness_head_right
            com.baidu.idl.face.platform.FaceEnvironment.setSoundId(r7, r8)
            com.baidu.idl.face.platform.FaceStatusNewEnum r8 = com.baidu.idl.face.platform.FaceStatusNewEnum.FaceLivenessActionComplete
            int r9 = com.baidu.idl.face.platform.ui.R.raw.face_good
            com.baidu.idl.face.platform.FaceEnvironment.setSoundId(r8, r9)
            com.baidu.idl.face.platform.FaceStatusNewEnum r10 = com.baidu.idl.face.platform.FaceStatusNewEnum.OK
            com.baidu.idl.face.platform.FaceEnvironment.setSoundId(r10, r9)
            int r9 = com.baidu.idl.face.platform.ui.R.string.detect_face_in
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r9)
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r2, r9)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePoorIllumination
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_low_light
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeImageBlured
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_keep
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionLeftEye
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_occ_left_eye
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionRightEye
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_occ_right_eye
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionNose
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_occ_nose
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionMouth
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_occ_mouth
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionLeftContour
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_occ_left_check
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionRightContour
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_occ_right_check
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeOcclusionChinContour
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_occ_chin
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofUpRange
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_head_down
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodePitchOutofDownRange
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_head_up
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofLeftRange
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_head_right
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeYawOutofRightRange
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_head_left
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTooFar
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_zoom_in
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTooClose
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_zoom_out
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeLeftEyeClosed
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_left_eye_close
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeRightEyeClosed
            int r2 = com.baidu.idl.face.platform.ui.R.string.detect_right_eye_close
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r2)
            int r0 = com.baidu.idl.face.platform.ui.R.string.liveness_eye
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r1, r0)
            int r0 = com.baidu.idl.face.platform.ui.R.string.liveness_mouth
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r3, r0)
            int r0 = com.baidu.idl.face.platform.ui.R.string.liveness_head_up
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r4, r0)
            int r0 = com.baidu.idl.face.platform.ui.R.string.liveness_head_down
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r5, r0)
            int r0 = com.baidu.idl.face.platform.ui.R.string.liveness_head_left
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r6, r0)
            int r0 = com.baidu.idl.face.platform.ui.R.string.liveness_head_right
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r7, r0)
            int r0 = com.baidu.idl.face.platform.ui.R.string.liveness_good
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r8, r0)
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r10, r0)
            com.baidu.idl.face.platform.FaceStatusNewEnum r0 = com.baidu.idl.face.platform.FaceStatusNewEnum.DetectRemindCodeTimeout
            int r1 = com.baidu.idl.face.platform.ui.R.string.detect_timeout
            com.baidu.idl.face.platform.FaceEnvironment.setTipsId(r0, r1)
            return
    }
}

package com.baidu.idl.main.facesdk.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class BDFaceSDKCommon {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AlignType extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType BDFACE_ALIGN_TYPE_NIR_ACCURATE = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType BDFACE_ALIGN_TYPE_RGB_ACCURATE = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType BDFACE_ALIGN_TYPE_RGB_FAST = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$AlignType r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$AlignType
                java.lang.String r1 = "BDFACE_ALIGN_TYPE_RGB_ACCURATE"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType.BDFACE_ALIGN_TYPE_RGB_ACCURATE = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$AlignType r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$AlignType
                java.lang.String r3 = "BDFACE_ALIGN_TYPE_RGB_FAST"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType.BDFACE_ALIGN_TYPE_RGB_FAST = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$AlignType r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$AlignType
                java.lang.String r5 = "BDFACE_ALIGN_TYPE_NIR_ACCURATE"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType.BDFACE_ALIGN_TYPE_NIR_ACCURATE = r3
                r5 = 3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$AlignType[] r5 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType.$VALUES = r5
                return
        }

        AlignType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$AlignType> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$AlignType r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$AlignType[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$AlignType[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.AlignType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum BDFaceActionLiveType extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType BDFACE_ACTION_LIVE_LOOK_UP = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType BDFACE_ACTION_LIVE_NOD = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType BDFACE_ACTION_LIVE_OPEN_MOUTH = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType BDFACE_ACTION_LIVE_SHAKE_HEAD = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType BDFACE_ACTION_LIVE_TURN_LEFT = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType BDFACE_ACTION_LIVE_TURN_RIGHT = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType BDFace_ACTION_LIVE_BLINK = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType
                java.lang.String r1 = "BDFace_ACTION_LIVE_BLINK"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.BDFace_ACTION_LIVE_BLINK = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType
                java.lang.String r3 = "BDFACE_ACTION_LIVE_OPEN_MOUTH"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.BDFACE_ACTION_LIVE_OPEN_MOUTH = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType
                java.lang.String r5 = "BDFACE_ACTION_LIVE_NOD"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.BDFACE_ACTION_LIVE_NOD = r3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r5 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType
                java.lang.String r7 = "BDFACE_ACTION_LIVE_SHAKE_HEAD"
                r8 = 3
                r5.<init>(r7, r8)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.BDFACE_ACTION_LIVE_SHAKE_HEAD = r5
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r7 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType
                java.lang.String r9 = "BDFACE_ACTION_LIVE_LOOK_UP"
                r10 = 4
                r7.<init>(r9, r10)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.BDFACE_ACTION_LIVE_LOOK_UP = r7
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r9 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType
                java.lang.String r11 = "BDFACE_ACTION_LIVE_TURN_LEFT"
                r12 = 5
                r9.<init>(r11, r12)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.BDFACE_ACTION_LIVE_TURN_LEFT = r9
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r11 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType
                java.lang.String r13 = "BDFACE_ACTION_LIVE_TURN_RIGHT"
                r14 = 6
                r11.<init>(r13, r14)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.BDFACE_ACTION_LIVE_TURN_RIGHT = r11
                r13 = 7
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType[] r13 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.$VALUES = r13
                return
        }

        BDFaceActionLiveType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceActionLiveType[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceActionLiveType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum BDFaceCoreRunMode extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode BDFACE_LITE_POWER_FULL = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode BDFACE_LITE_POWER_HIGH = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode BDFACE_LITE_POWER_LOW = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode BDFACE_LITE_POWER_NO_BIND = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode BDFACE_LITE_POWER_RAND_HIGH = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode BDFACE_LITE_POWER_RAND_LOW = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode
                java.lang.String r1 = "BDFACE_LITE_POWER_HIGH"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode.BDFACE_LITE_POWER_HIGH = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode
                java.lang.String r3 = "BDFACE_LITE_POWER_LOW"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode.BDFACE_LITE_POWER_LOW = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode
                java.lang.String r5 = "BDFACE_LITE_POWER_FULL"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode.BDFACE_LITE_POWER_FULL = r3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode r5 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode
                java.lang.String r7 = "BDFACE_LITE_POWER_NO_BIND"
                r8 = 3
                r5.<init>(r7, r8)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode.BDFACE_LITE_POWER_NO_BIND = r5
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode r7 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode
                java.lang.String r9 = "BDFACE_LITE_POWER_RAND_HIGH"
                r10 = 4
                r7.<init>(r9, r10)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode.BDFACE_LITE_POWER_RAND_HIGH = r7
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode r9 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode
                java.lang.String r11 = "BDFACE_LITE_POWER_RAND_LOW"
                r12 = 5
                r9.<init>(r11, r12)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode.BDFACE_LITE_POWER_RAND_LOW = r9
                r11 = 6
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode[] r11 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode.$VALUES = r11
                return
        }

        BDFaceCoreRunMode(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceCoreRunMode[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceCoreRunMode[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum BDFaceEmotion extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion BDFACE_EMOTION_CALM = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion BDFACE_EMOTION_FROWN = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion BDFACE_EMOTION_SMILE = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotion r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotion
                java.lang.String r1 = "BDFACE_EMOTION_FROWN"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion.BDFACE_EMOTION_FROWN = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotion r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotion
                java.lang.String r3 = "BDFACE_EMOTION_SMILE"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion.BDFACE_EMOTION_SMILE = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotion r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotion
                java.lang.String r5 = "BDFACE_EMOTION_CALM"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion.BDFACE_EMOTION_CALM = r3
                r5 = 3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotion[] r5 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion.$VALUES = r5
                return
        }

        BDFaceEmotion(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotion> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotion r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotion[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotion[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotion[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum BDFaceEmotionEnum extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum BDFACE_EMOTIONS_ANGRY = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum BDFACE_EMOTIONS_DISGUST = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum BDFACE_EMOTIONS_FEAR = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum BDFACE_EMOTIONS_HAPPY = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum BDFACE_EMOTIONS_NEUTRAL = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum BDFACE_EMOTIONS_SAD = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum BDFACE_EMOTIONS_SURPRISE = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum
                java.lang.String r1 = "BDFACE_EMOTIONS_ANGRY"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum.BDFACE_EMOTIONS_ANGRY = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum
                java.lang.String r3 = "BDFACE_EMOTIONS_DISGUST"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum.BDFACE_EMOTIONS_DISGUST = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum
                java.lang.String r5 = "BDFACE_EMOTIONS_FEAR"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum.BDFACE_EMOTIONS_FEAR = r3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum r5 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum
                java.lang.String r7 = "BDFACE_EMOTIONS_HAPPY"
                r8 = 3
                r5.<init>(r7, r8)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum.BDFACE_EMOTIONS_HAPPY = r5
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum r7 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum
                java.lang.String r9 = "BDFACE_EMOTIONS_SAD"
                r10 = 4
                r7.<init>(r9, r10)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum.BDFACE_EMOTIONS_SAD = r7
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum r9 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum
                java.lang.String r11 = "BDFACE_EMOTIONS_SURPRISE"
                r12 = 5
                r9.<init>(r11, r12)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum.BDFACE_EMOTIONS_SURPRISE = r9
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum r11 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum
                java.lang.String r13 = "BDFACE_EMOTIONS_NEUTRAL"
                r14 = 6
                r11.<init>(r13, r14)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum.BDFACE_EMOTIONS_NEUTRAL = r11
                r13 = 7
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum[] r13 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum.$VALUES = r13
                return
        }

        BDFaceEmotionEnum(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceEmotionEnum[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceEmotionEnum[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum BDFaceGazeDirection extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection BDFACE_GACE_DIRECTION_DOWN = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection BDFACE_GACE_DIRECTION_EYE_CLOSE = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection BDFACE_GACE_DIRECTION_FRONT = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection BDFACE_GACE_DIRECTION_LEFT = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection BDFACE_GACE_DIRECTION_RIGHT = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection BDFACE_GACE_DIRECTION_UP = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection
                java.lang.String r1 = "BDFACE_GACE_DIRECTION_UP"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection.BDFACE_GACE_DIRECTION_UP = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection
                java.lang.String r3 = "BDFACE_GACE_DIRECTION_DOWN"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection.BDFACE_GACE_DIRECTION_DOWN = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection
                java.lang.String r5 = "BDFACE_GACE_DIRECTION_RIGHT"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection.BDFACE_GACE_DIRECTION_RIGHT = r3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection r5 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection
                java.lang.String r7 = "BDFACE_GACE_DIRECTION_LEFT"
                r8 = 3
                r5.<init>(r7, r8)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection.BDFACE_GACE_DIRECTION_LEFT = r5
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection r7 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection
                java.lang.String r9 = "BDFACE_GACE_DIRECTION_FRONT"
                r10 = 4
                r7.<init>(r9, r10)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection.BDFACE_GACE_DIRECTION_FRONT = r7
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection r9 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection
                java.lang.String r11 = "BDFACE_GACE_DIRECTION_EYE_CLOSE"
                r12 = 5
                r9.<init>(r11, r12)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection.BDFACE_GACE_DIRECTION_EYE_CLOSE = r9
                r11 = 6
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection[] r11 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection[r11]
                r11[r2] = r0
                r11[r4] = r1
                r11[r6] = r3
                r11[r8] = r5
                r11[r10] = r7
                r11[r12] = r9
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection.$VALUES = r11
                return
        }

        BDFaceGazeDirection(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGazeDirection[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGazeDirection[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum BDFaceGender extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender BDFACE_GENDER_FEMALE = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender BDFACE_GENDER_MALE = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGender r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGender
                java.lang.String r1 = "BDFACE_GENDER_FEMALE"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender.BDFACE_GENDER_FEMALE = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGender r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGender
                java.lang.String r3 = "BDFACE_GENDER_MALE"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender.BDFACE_GENDER_MALE = r1
                r3 = 2
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGender[] r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender.$VALUES = r3
                return
        }

        BDFaceGender(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGender> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGender r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGender[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGender[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGender[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum BDFaceGlasses extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses BDFACE_GLASSES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses BDFACE_NO_GLASSES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses BDFACE_SUN_GLASSES = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGlasses r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGlasses
                java.lang.String r1 = "BDFACE_NO_GLASSES"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses.BDFACE_NO_GLASSES = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGlasses r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGlasses
                java.lang.String r3 = "BDFACE_GLASSES"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses.BDFACE_GLASSES = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGlasses r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGlasses
                java.lang.String r5 = "BDFACE_SUN_GLASSES"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses.BDFACE_SUN_GLASSES = r3
                r5 = 3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGlasses[] r5 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses.$VALUES = r5
                return
        }

        BDFaceGlasses(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGlasses> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGlasses r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGlasses[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceGlasses[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceGlasses[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum BDFaceImageType extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType BDFACE_IMAGE_TYPE_BGR = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType BDFACE_IMAGE_TYPE_BGRA = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType BDFACE_IMAGE_TYPE_DEPTH = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType BDFACE_IMAGE_TYPE_GRAY = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType BDFACE_IMAGE_TYPE_RGB = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType BDFACE_IMAGE_TYPE_RGBA = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType BDFACE_IMAGE_TYPE_YUV_NV12 = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType BDFACE_IMAGE_TYPE_YUV_NV21 = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType BDFACE_IMAGE_TYPE_YUV_YV12 = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType
                java.lang.String r1 = "BDFACE_IMAGE_TYPE_RGB"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_RGB = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType
                java.lang.String r3 = "BDFACE_IMAGE_TYPE_BGR"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_BGR = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType
                java.lang.String r5 = "BDFACE_IMAGE_TYPE_RGBA"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_RGBA = r3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r5 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType
                java.lang.String r7 = "BDFACE_IMAGE_TYPE_BGRA"
                r8 = 3
                r5.<init>(r7, r8)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_BGRA = r5
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r7 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType
                java.lang.String r9 = "BDFACE_IMAGE_TYPE_GRAY"
                r10 = 4
                r7.<init>(r9, r10)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_GRAY = r7
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r9 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType
                java.lang.String r11 = "BDFACE_IMAGE_TYPE_DEPTH"
                r12 = 5
                r9.<init>(r11, r12)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_DEPTH = r9
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r11 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType
                java.lang.String r13 = "BDFACE_IMAGE_TYPE_YUV_NV21"
                r14 = 6
                r11.<init>(r13, r14)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_YUV_NV21 = r11
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r13 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType
                java.lang.String r15 = "BDFACE_IMAGE_TYPE_YUV_NV12"
                r16 = 0
                r2 = 7
                r13.<init>(r15, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_YUV_NV12 = r13
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r15 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType
                r17 = 7
                java.lang.String r2 = "BDFACE_IMAGE_TYPE_YUV_YV12"
                r18 = 1
                r4 = 8
                r15.<init>(r2, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.BDFACE_IMAGE_TYPE_YUV_YV12 = r15
                r2 = 9
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType[] r2 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType[r2]
                r2[r16] = r0
                r2[r18] = r1
                r2[r6] = r3
                r2[r8] = r5
                r2[r10] = r7
                r2[r12] = r9
                r2[r14] = r11
                r2[r17] = r13
                r2[r4] = r15
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.$VALUES = r2
                return
        }

        BDFaceImageType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceImageType[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceImageType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum BDFaceLogInfo extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo BDFACE_LOG_ERROR_MESSAGE = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo BDFACE_LOG_TYPE_ALL = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo BDFACE_LOG_TYPE_DEBUG = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo BDFACE_LOG_TYPE_PERF = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo BDFACE_LOG_VALUE_MESSAGE = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo
                java.lang.String r1 = "BDFACE_LOG_ERROR_MESSAGE"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo.BDFACE_LOG_ERROR_MESSAGE = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo
                java.lang.String r3 = "BDFACE_LOG_VALUE_MESSAGE"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo.BDFACE_LOG_VALUE_MESSAGE = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo
                java.lang.String r5 = "BDFACE_LOG_TYPE_PERF"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo.BDFACE_LOG_TYPE_PERF = r3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo r5 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo
                java.lang.String r7 = "BDFACE_LOG_TYPE_ALL"
                r8 = 3
                r5.<init>(r7, r8)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo.BDFACE_LOG_TYPE_ALL = r5
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo r7 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo
                java.lang.String r9 = "BDFACE_LOG_TYPE_DEBUG"
                r10 = 4
                r7.<init>(r9, r10)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo.BDFACE_LOG_TYPE_DEBUG = r7
                r9 = 5
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo[] r9 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo[r9]
                r9[r2] = r0
                r9[r4] = r1
                r9[r6] = r3
                r9[r8] = r5
                r9[r10] = r7
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo.$VALUES = r9
                return
        }

        BDFaceLogInfo(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceLogInfo[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceLogInfo[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum BDFaceRace extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace BDFACE_RACE_BLACK = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace BDFACE_RACE_INDIAN = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace BDFACE_RACE_WHITE = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace BDFACE_RACE_YELLOW = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace
                java.lang.String r1 = "BDFACE_RACE_YELLOW"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace.BDFACE_RACE_YELLOW = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace
                java.lang.String r3 = "BDFACE_RACE_WHITE"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace.BDFACE_RACE_WHITE = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace
                java.lang.String r5 = "BDFACE_RACE_BLACK"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace.BDFACE_RACE_BLACK = r3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace r5 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace
                java.lang.String r7 = "BDFACE_RACE_INDIAN"
                r8 = 3
                r5.<init>(r7, r8)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace.BDFACE_RACE_INDIAN = r5
                r7 = 4
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace[] r7 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace.$VALUES = r7
                return
        }

        BDFaceRace(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$BDFaceRace[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.BDFaceRace[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum DetectType extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType DETECT_NIR = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType DETECT_VIS = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$DetectType r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$DetectType
                java.lang.String r1 = "DETECT_VIS"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType.DETECT_VIS = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$DetectType r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$DetectType
                java.lang.String r3 = "DETECT_NIR"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType.DETECT_NIR = r1
                r3 = 2
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$DetectType[] r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType.$VALUES = r3
                return
        }

        DetectType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$DetectType> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$DetectType r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$DetectType[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$DetectType[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.DetectType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum FaceQualityType extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType BLUR = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType ILLUMINATION = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType OCCLUSION = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FaceQualityType r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FaceQualityType
                java.lang.String r1 = "BLUR"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType.BLUR = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FaceQualityType r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FaceQualityType
                java.lang.String r3 = "OCCLUSION"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType.OCCLUSION = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FaceQualityType r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FaceQualityType
                java.lang.String r5 = "ILLUMINATION"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType.ILLUMINATION = r3
                r5 = 3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FaceQualityType[] r5 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType.$VALUES = r5
                return
        }

        FaceQualityType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FaceQualityType> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FaceQualityType r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FaceQualityType[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FaceQualityType[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FaceQualityType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum FeatureType extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType BDFACE_FEATURE_TYPE_ID_PHOTO = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType BDFACE_FEATURE_TYPE_LIVE_PHOTO = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType BDFACE_FEATURE_TYPE_NIR = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType BDFACE_FEATURE_TYPE_RGBD = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FeatureType r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FeatureType
                java.lang.String r1 = "BDFACE_FEATURE_TYPE_LIVE_PHOTO"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType.BDFACE_FEATURE_TYPE_LIVE_PHOTO = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FeatureType r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FeatureType
                java.lang.String r3 = "BDFACE_FEATURE_TYPE_ID_PHOTO"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType.BDFACE_FEATURE_TYPE_ID_PHOTO = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FeatureType r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FeatureType
                java.lang.String r5 = "BDFACE_FEATURE_TYPE_NIR"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType.BDFACE_FEATURE_TYPE_NIR = r3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FeatureType r5 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FeatureType
                java.lang.String r7 = "BDFACE_FEATURE_TYPE_RGBD"
                r8 = 3
                r5.<init>(r7, r8)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType.BDFACE_FEATURE_TYPE_RGBD = r5
                r7 = 4
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FeatureType[] r7 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType.$VALUES = r7
                return
        }

        FeatureType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FeatureType> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FeatureType r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FeatureType[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$FeatureType[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.FeatureType[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LiveType extends java.lang.Enum<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType> {
        private static final /* synthetic */ com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType[] $VALUES = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType BDFACE_SILENT_LIVE_TYPE_DEPTH = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType BDFACE_SILENT_LIVE_TYPE_NIR = null;
        public static final com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType BDFACE_SILENT_LIVE_TYPE_RGB = null;

        static {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$LiveType r0 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$LiveType
                java.lang.String r1 = "BDFACE_SILENT_LIVE_TYPE_RGB"
                r2 = 0
                r0.<init>(r1, r2)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType.BDFACE_SILENT_LIVE_TYPE_RGB = r0
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$LiveType r1 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$LiveType
                java.lang.String r3 = "BDFACE_SILENT_LIVE_TYPE_NIR"
                r4 = 1
                r1.<init>(r3, r4)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType.BDFACE_SILENT_LIVE_TYPE_NIR = r1
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$LiveType r3 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$LiveType
                java.lang.String r5 = "BDFACE_SILENT_LIVE_TYPE_DEPTH"
                r6 = 2
                r3.<init>(r5, r6)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType.BDFACE_SILENT_LIVE_TYPE_DEPTH = r3
                r5 = 3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$LiveType[] r5 = new com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType.$VALUES = r5
                return
        }

        LiveType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType valueOf(java.lang.String r1) {
                java.lang.Class<com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$LiveType> r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$LiveType r1 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType) r1
                return r1
        }

        public static com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType[] values() {
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$LiveType[] r0 = com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.baidu.idl.main.facesdk.model.BDFaceSDKCommon$LiveType[] r0 = (com.baidu.idl.main.facesdk.model.BDFaceSDKCommon.LiveType[]) r0
                return r0
        }
    }

    public BDFaceSDKCommon() {
            r0 = this;
            r0.<init>()
            return
    }
}

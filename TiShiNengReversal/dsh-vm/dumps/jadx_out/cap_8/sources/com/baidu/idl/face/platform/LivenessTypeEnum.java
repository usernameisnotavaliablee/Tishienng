package com.baidu.idl.face.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public enum LivenessTypeEnum extends java.lang.Enum<com.baidu.idl.face.platform.LivenessTypeEnum> {
    private static final /* synthetic */ com.baidu.idl.face.platform.LivenessTypeEnum[] $VALUES = null;
    public static final com.baidu.idl.face.platform.LivenessTypeEnum Eye = null;
    public static final com.baidu.idl.face.platform.LivenessTypeEnum HeadDown = null;
    public static final com.baidu.idl.face.platform.LivenessTypeEnum HeadLeft = null;
    public static final com.baidu.idl.face.platform.LivenessTypeEnum HeadRight = null;
    public static final com.baidu.idl.face.platform.LivenessTypeEnum HeadUp = null;
    public static final com.baidu.idl.face.platform.LivenessTypeEnum Mouth = null;

    static {
            com.baidu.idl.face.platform.LivenessTypeEnum r0 = new com.baidu.idl.face.platform.LivenessTypeEnum
            java.lang.String r1 = "Eye"
            r2 = 0
            r0.<init>(r1, r2)
            com.baidu.idl.face.platform.LivenessTypeEnum.Eye = r0
            com.baidu.idl.face.platform.LivenessTypeEnum r1 = new com.baidu.idl.face.platform.LivenessTypeEnum
            java.lang.String r3 = "Mouth"
            r4 = 1
            r1.<init>(r3, r4)
            com.baidu.idl.face.platform.LivenessTypeEnum.Mouth = r1
            com.baidu.idl.face.platform.LivenessTypeEnum r3 = new com.baidu.idl.face.platform.LivenessTypeEnum
            java.lang.String r5 = "HeadRight"
            r6 = 2
            r3.<init>(r5, r6)
            com.baidu.idl.face.platform.LivenessTypeEnum.HeadRight = r3
            com.baidu.idl.face.platform.LivenessTypeEnum r5 = new com.baidu.idl.face.platform.LivenessTypeEnum
            java.lang.String r7 = "HeadLeft"
            r8 = 3
            r5.<init>(r7, r8)
            com.baidu.idl.face.platform.LivenessTypeEnum.HeadLeft = r5
            com.baidu.idl.face.platform.LivenessTypeEnum r7 = new com.baidu.idl.face.platform.LivenessTypeEnum
            java.lang.String r9 = "HeadUp"
            r10 = 4
            r7.<init>(r9, r10)
            com.baidu.idl.face.platform.LivenessTypeEnum.HeadUp = r7
            com.baidu.idl.face.platform.LivenessTypeEnum r9 = new com.baidu.idl.face.platform.LivenessTypeEnum
            java.lang.String r11 = "HeadDown"
            r12 = 5
            r9.<init>(r11, r12)
            com.baidu.idl.face.platform.LivenessTypeEnum.HeadDown = r9
            r11 = 6
            com.baidu.idl.face.platform.LivenessTypeEnum[] r11 = new com.baidu.idl.face.platform.LivenessTypeEnum[r11]
            r11[r2] = r0
            r11[r4] = r1
            r11[r6] = r3
            r11[r8] = r5
            r11[r10] = r7
            r11[r12] = r9
            com.baidu.idl.face.platform.LivenessTypeEnum.$VALUES = r11
            return
    }

    LivenessTypeEnum(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.baidu.idl.face.platform.LivenessTypeEnum valueOf(java.lang.String r1) {
            java.lang.Class<com.baidu.idl.face.platform.LivenessTypeEnum> r0 = com.baidu.idl.face.platform.LivenessTypeEnum.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.baidu.idl.face.platform.LivenessTypeEnum r1 = (com.baidu.idl.face.platform.LivenessTypeEnum) r1
            return r1
    }

    public static com.baidu.idl.face.platform.LivenessTypeEnum[] values() {
            com.baidu.idl.face.platform.LivenessTypeEnum[] r0 = com.baidu.idl.face.platform.LivenessTypeEnum.$VALUES
            java.lang.Object r0 = r0.clone()
            com.baidu.idl.face.platform.LivenessTypeEnum[] r0 = (com.baidu.idl.face.platform.LivenessTypeEnum[]) r0
            return r0
    }
}

package com.baidu.idl.face.platform;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public enum LicenseStatusEnum extends java.lang.Enum<com.baidu.idl.face.platform.LicenseStatusEnum> {
    private static final /* synthetic */ com.baidu.idl.face.platform.LicenseStatusEnum[] $VALUES = null;
    public static final com.baidu.idl.face.platform.LicenseStatusEnum StateErrorAuthorized = null;
    public static final com.baidu.idl.face.platform.LicenseStatusEnum StateErrorBegin = null;
    public static final com.baidu.idl.face.platform.LicenseStatusEnum StateErrorExpired = null;
    public static final com.baidu.idl.face.platform.LicenseStatusEnum StateErrorNetwork = null;
    public static final com.baidu.idl.face.platform.LicenseStatusEnum StateErrorNotFindLicense = null;
    public static final com.baidu.idl.face.platform.LicenseStatusEnum StateInitializing = null;
    public static final com.baidu.idl.face.platform.LicenseStatusEnum StateNotInit = null;
    public static final com.baidu.idl.face.platform.LicenseStatusEnum StateSuccess = null;
    public static final com.baidu.idl.face.platform.LicenseStatusEnum StateUnknown = null;
    public static final com.baidu.idl.face.platform.LicenseStatusEnum StateWarningValidityComing = null;

    static {
            com.baidu.idl.face.platform.LicenseStatusEnum r0 = new com.baidu.idl.face.platform.LicenseStatusEnum
            java.lang.String r1 = "StateSuccess"
            r2 = 0
            r0.<init>(r1, r2)
            com.baidu.idl.face.platform.LicenseStatusEnum.StateSuccess = r0
            com.baidu.idl.face.platform.LicenseStatusEnum r1 = new com.baidu.idl.face.platform.LicenseStatusEnum
            java.lang.String r3 = "StateWarningValidityComing"
            r4 = 1
            r1.<init>(r3, r4)
            com.baidu.idl.face.platform.LicenseStatusEnum.StateWarningValidityComing = r1
            com.baidu.idl.face.platform.LicenseStatusEnum r3 = new com.baidu.idl.face.platform.LicenseStatusEnum
            java.lang.String r5 = "StateErrorBegin"
            r6 = 2
            r3.<init>(r5, r6)
            com.baidu.idl.face.platform.LicenseStatusEnum.StateErrorBegin = r3
            com.baidu.idl.face.platform.LicenseStatusEnum r5 = new com.baidu.idl.face.platform.LicenseStatusEnum
            java.lang.String r7 = "StateErrorNotFindLicense"
            r8 = 3
            r5.<init>(r7, r8)
            com.baidu.idl.face.platform.LicenseStatusEnum.StateErrorNotFindLicense = r5
            com.baidu.idl.face.platform.LicenseStatusEnum r7 = new com.baidu.idl.face.platform.LicenseStatusEnum
            java.lang.String r9 = "StateErrorExpired"
            r10 = 4
            r7.<init>(r9, r10)
            com.baidu.idl.face.platform.LicenseStatusEnum.StateErrorExpired = r7
            com.baidu.idl.face.platform.LicenseStatusEnum r9 = new com.baidu.idl.face.platform.LicenseStatusEnum
            java.lang.String r11 = "StateErrorAuthorized"
            r12 = 5
            r9.<init>(r11, r12)
            com.baidu.idl.face.platform.LicenseStatusEnum.StateErrorAuthorized = r9
            com.baidu.idl.face.platform.LicenseStatusEnum r11 = new com.baidu.idl.face.platform.LicenseStatusEnum
            java.lang.String r13 = "StateErrorNetwork"
            r14 = 6
            r11.<init>(r13, r14)
            com.baidu.idl.face.platform.LicenseStatusEnum.StateErrorNetwork = r11
            com.baidu.idl.face.platform.LicenseStatusEnum r13 = new com.baidu.idl.face.platform.LicenseStatusEnum
            java.lang.String r15 = "StateNotInit"
            r16 = 0
            r2 = 7
            r13.<init>(r15, r2)
            com.baidu.idl.face.platform.LicenseStatusEnum.StateNotInit = r13
            com.baidu.idl.face.platform.LicenseStatusEnum r15 = new com.baidu.idl.face.platform.LicenseStatusEnum
            r17 = 7
            java.lang.String r2 = "StateInitializing"
            r18 = 1
            r4 = 8
            r15.<init>(r2, r4)
            com.baidu.idl.face.platform.LicenseStatusEnum.StateInitializing = r15
            com.baidu.idl.face.platform.LicenseStatusEnum r2 = new com.baidu.idl.face.platform.LicenseStatusEnum
            r19 = 8
            java.lang.String r4 = "StateUnknown"
            r20 = 2
            r6 = 9
            r2.<init>(r4, r6)
            com.baidu.idl.face.platform.LicenseStatusEnum.StateUnknown = r2
            r4 = 10
            com.baidu.idl.face.platform.LicenseStatusEnum[] r4 = new com.baidu.idl.face.platform.LicenseStatusEnum[r4]
            r4[r16] = r0
            r4[r18] = r1
            r4[r20] = r3
            r4[r8] = r5
            r4[r10] = r7
            r4[r12] = r9
            r4[r14] = r11
            r4[r17] = r13
            r4[r19] = r15
            r4[r6] = r2
            com.baidu.idl.face.platform.LicenseStatusEnum.$VALUES = r4
            return
    }

    LicenseStatusEnum(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.baidu.idl.face.platform.LicenseStatusEnum getLicenseStatus(int r0) {
            com.baidu.idl.face.platform.LicenseStatusEnum r0 = com.baidu.idl.face.platform.LicenseStatusEnum.StateUnknown
            return r0
    }

    public static com.baidu.idl.face.platform.LicenseStatusEnum valueOf(java.lang.String r1) {
            java.lang.Class<com.baidu.idl.face.platform.LicenseStatusEnum> r0 = com.baidu.idl.face.platform.LicenseStatusEnum.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.baidu.idl.face.platform.LicenseStatusEnum r1 = (com.baidu.idl.face.platform.LicenseStatusEnum) r1
            return r1
    }

    public static com.baidu.idl.face.platform.LicenseStatusEnum[] values() {
            com.baidu.idl.face.platform.LicenseStatusEnum[] r0 = com.baidu.idl.face.platform.LicenseStatusEnum.$VALUES
            java.lang.Object r0 = r0.clone()
            com.baidu.idl.face.platform.LicenseStatusEnum[] r0 = (com.baidu.idl.face.platform.LicenseStatusEnum[]) r0
            return r0
    }
}

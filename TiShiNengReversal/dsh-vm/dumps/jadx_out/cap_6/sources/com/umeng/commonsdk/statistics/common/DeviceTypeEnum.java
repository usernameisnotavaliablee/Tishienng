package com.umeng.commonsdk.statistics.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum DeviceTypeEnum extends java.lang.Enum<com.umeng.commonsdk.statistics.common.DeviceTypeEnum> {
    private static final /* synthetic */ com.umeng.commonsdk.statistics.common.DeviceTypeEnum[] $VALUES = null;
    public static final com.umeng.commonsdk.statistics.common.DeviceTypeEnum ANDROIDID = null;
    public static final com.umeng.commonsdk.statistics.common.DeviceTypeEnum DEFAULT = null;
    public static final com.umeng.commonsdk.statistics.common.DeviceTypeEnum IDFA = null;
    public static final com.umeng.commonsdk.statistics.common.DeviceTypeEnum IMEI = null;
    public static final com.umeng.commonsdk.statistics.common.DeviceTypeEnum MAC = null;
    public static final com.umeng.commonsdk.statistics.common.DeviceTypeEnum OAID = null;
    public static final com.umeng.commonsdk.statistics.common.DeviceTypeEnum SERIALNO = null;
    private java.lang.String description;
    private java.lang.String deviceIdType;

    static {
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r0 = new com.umeng.commonsdk.statistics.common.DeviceTypeEnum
            java.lang.String r1 = "imei"
            java.lang.String r2 = "IMEI"
            r3 = 0
            r0.<init>(r2, r3, r1, r1)
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum.IMEI = r0
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = new com.umeng.commonsdk.statistics.common.DeviceTypeEnum
            java.lang.String r2 = "oaid"
            java.lang.String r4 = "OAID"
            r5 = 1
            r1.<init>(r4, r5, r2, r2)
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum.OAID = r1
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r2 = new com.umeng.commonsdk.statistics.common.DeviceTypeEnum
            java.lang.String r4 = "android_id"
            java.lang.String r6 = "ANDROIDID"
            r7 = 2
            r2.<init>(r6, r7, r4, r4)
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum.ANDROIDID = r2
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r4 = new com.umeng.commonsdk.statistics.common.DeviceTypeEnum
            java.lang.String r6 = "mac"
            java.lang.String r8 = "MAC"
            r9 = 3
            r4.<init>(r8, r9, r6, r6)
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum.MAC = r4
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r6 = new com.umeng.commonsdk.statistics.common.DeviceTypeEnum
            java.lang.String r8 = "serial_no"
            java.lang.String r10 = "SERIALNO"
            r11 = 4
            r6.<init>(r10, r11, r8, r8)
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum.SERIALNO = r6
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r8 = new com.umeng.commonsdk.statistics.common.DeviceTypeEnum
            java.lang.String r10 = "idfa"
            java.lang.String r12 = "IDFA"
            r13 = 5
            r8.<init>(r12, r13, r10, r10)
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum.IDFA = r8
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r10 = new com.umeng.commonsdk.statistics.common.DeviceTypeEnum
            java.lang.String r12 = "null"
            java.lang.String r14 = "DEFAULT"
            r15 = 6
            r10.<init>(r14, r15, r12, r12)
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum.DEFAULT = r10
            r12 = 7
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum[] r12 = new com.umeng.commonsdk.statistics.common.DeviceTypeEnum[r12]
            r12[r3] = r0
            r12[r5] = r1
            r12[r7] = r2
            r12[r9] = r4
            r12[r11] = r6
            r12[r13] = r8
            r12[r15] = r10
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum.$VALUES = r12
            return
    }

    DeviceTypeEnum(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.deviceIdType = r3
            r0.description = r4
            return
    }

    public static com.umeng.commonsdk.statistics.common.DeviceTypeEnum valueOf(java.lang.String r1) {
            java.lang.Class<com.umeng.commonsdk.statistics.common.DeviceTypeEnum> r0 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum r1 = (com.umeng.commonsdk.statistics.common.DeviceTypeEnum) r1
            return r1
    }

    public static com.umeng.commonsdk.statistics.common.DeviceTypeEnum[] values() {
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum[] r0 = com.umeng.commonsdk.statistics.common.DeviceTypeEnum.$VALUES
            java.lang.Object r0 = r0.clone()
            com.umeng.commonsdk.statistics.common.DeviceTypeEnum[] r0 = (com.umeng.commonsdk.statistics.common.DeviceTypeEnum[]) r0
            return r0
    }

    public java.lang.String getDescription() {
            r1 = this;
            java.lang.String r0 = r1.description
            return r0
    }

    public java.lang.String getDeviceIdType() {
            r1 = this;
            java.lang.String r0 = r1.deviceIdType
            return r0
    }
}

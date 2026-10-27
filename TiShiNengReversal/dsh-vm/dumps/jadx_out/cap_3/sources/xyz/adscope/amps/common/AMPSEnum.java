package xyz.adscope.amps.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSEnum {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AMPSSDKInitStatus extends java.lang.Enum<xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus> {
        private static final /* synthetic */ xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus[] $VALUES = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus AMPSAdSDKInitStatusFail = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus AMPSAdSDKInitStatusFailRepeat = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus AMPSAdSDKInitStatusLoading = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus AMPSAdSDKInitStatusNormal = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus AMPSAdSDKInitStatusSuccess = null;
        private int code;
        private java.lang.String msg;

        static {
                xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r0 = new xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus
                java.lang.String r1 = "sdk Init status normal"
                java.lang.String r2 = "AMPSAdSDKInitStatusNormal"
                r3 = 0
                r0.<init>(r2, r3, r3, r1)
                xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.AMPSAdSDKInitStatusNormal = r0
                xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r1 = new xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus
                java.lang.String r2 = "sdk Init status loading"
                java.lang.String r4 = "AMPSAdSDKInitStatusLoading"
                r5 = 1
                r1.<init>(r4, r5, r5, r2)
                xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.AMPSAdSDKInitStatusLoading = r1
                xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r2 = new xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus
                java.lang.String r4 = "sdk Init status success"
                java.lang.String r6 = "AMPSAdSDKInitStatusSuccess"
                r7 = 2
                r2.<init>(r6, r7, r7, r4)
                xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.AMPSAdSDKInitStatusSuccess = r2
                xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r4 = new xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus
                java.lang.String r6 = "sdk Init status fail"
                java.lang.String r8 = "AMPSAdSDKInitStatusFail"
                r9 = 3
                r4.<init>(r8, r9, r9, r6)
                xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.AMPSAdSDKInitStatusFail = r4
                xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r6 = new xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus
                java.lang.String r8 = "sdk Init status fail repeat"
                java.lang.String r10 = "AMPSAdSDKInitStatusFailRepeat"
                r11 = 4
                r6.<init>(r10, r11, r11, r8)
                xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.AMPSAdSDKInitStatusFailRepeat = r6
                r8 = 5
                xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus[] r8 = new xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus[r8]
                r8[r3] = r0
                r8[r5] = r1
                r8[r7] = r2
                r8[r9] = r4
                r8[r11] = r6
                xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.$VALUES = r8
                return
        }

        AMPSSDKInitStatus(java.lang.String r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.code = r3
                r0.msg = r4
                return
        }

        public static xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus> r0 = xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus r1 = (xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus) r1
                return r1
        }

        public static xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus[] values() {
                xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus[] r0 = xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.common.AMPSEnum$AMPSSDKInitStatus[] r0 = (xyz.adscope.amps.common.AMPSEnum.AMPSSDKInitStatus[]) r0
                return r0
        }

        public int getCode() {
                r1 = this;
                int r0 = r1.code
                return r0
        }

        public java.lang.String getMsg() {
                r1 = this;
                java.lang.String r0 = r1.msg
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AdapterNameEnum extends java.lang.Enum<xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum> {
        private static final /* synthetic */ xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum[] $VALUES = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum ALL_ADAPTER_NAME = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum ASNP_ADAPTER_NAME = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum CSJ_ADAPTER_NAME = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum GDT_ADAPTER_NAME = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum GroMore_ADAPTER_NAME = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum KS_ADAPTER_NAME = null;
        private java.lang.String value;

        static {
                xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum r0 = new xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum
                java.lang.String r1 = "AMPSASNPSDKManagerAdapter"
                java.lang.String r2 = "ASNP_ADAPTER_NAME"
                r3 = 0
                r0.<init>(r2, r3, r1)
                xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum.ASNP_ADAPTER_NAME = r0
                xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum r1 = new xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum
                java.lang.String r2 = "AMPSGDTSDKManagerAdapter"
                java.lang.String r4 = "GDT_ADAPTER_NAME"
                r5 = 1
                r1.<init>(r4, r5, r2)
                xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum.GDT_ADAPTER_NAME = r1
                xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum r2 = new xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum
                java.lang.String r4 = "AMPSCSJSDKManagerAdapter"
                java.lang.String r6 = "CSJ_ADAPTER_NAME"
                r7 = 2
                r2.<init>(r6, r7, r4)
                xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum.CSJ_ADAPTER_NAME = r2
                xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum r4 = new xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum
                java.lang.String r6 = "AMPSGROMORESDKManagerAdapter"
                java.lang.String r8 = "GroMore_ADAPTER_NAME"
                r9 = 3
                r4.<init>(r8, r9, r6)
                xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum.GroMore_ADAPTER_NAME = r4
                xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum r6 = new xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum
                java.lang.String r8 = "AMPSKSSDKManagerAdapter"
                java.lang.String r10 = "KS_ADAPTER_NAME"
                r11 = 4
                r6.<init>(r10, r11, r8)
                xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum.KS_ADAPTER_NAME = r6
                xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum r8 = new xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum
                java.lang.String r10 = "AMPSALLSDKManagerAdapter"
                java.lang.String r12 = "ALL_ADAPTER_NAME"
                r13 = 5
                r8.<init>(r12, r13, r10)
                xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum.ALL_ADAPTER_NAME = r8
                r10 = 6
                xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum[] r10 = new xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum[r10]
                r10[r3] = r0
                r10[r5] = r1
                r10[r7] = r2
                r10[r9] = r4
                r10[r11] = r6
                r10[r13] = r8
                xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum.$VALUES = r10
                return
        }

        AdapterNameEnum(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum> r0 = xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum r1 = (xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum) r1
                return r1
        }

        public static xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum[] values() {
                xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum[] r0 = xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.common.AMPSEnum$AdapterNameEnum[] r0 = (xyz.adscope.amps.common.AMPSEnum.AdapterNameEnum[]) r0
                return r0
        }

        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AutoPlayEnum extends java.lang.Enum<xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum> {
        private static final /* synthetic */ xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum[] $VALUES = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum HAS_NET_AUTO_PLAY = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum NO_AUTO_PLAY = null;
        public static final xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum WIFI_AUTO_PLAY = null;
        private int autoPlayStatus;

        static {
                xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum r0 = new xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum
                java.lang.String r1 = "HAS_NET_AUTO_PLAY"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum.HAS_NET_AUTO_PLAY = r0
                xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum r1 = new xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum
                java.lang.String r4 = "NO_AUTO_PLAY"
                r1.<init>(r4, r3, r2)
                xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum.NO_AUTO_PLAY = r1
                xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum r4 = new xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum
                java.lang.String r5 = "WIFI_AUTO_PLAY"
                r6 = 2
                r4.<init>(r5, r6, r6)
                xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum.WIFI_AUTO_PLAY = r4
                r5 = 3
                xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum[] r5 = new xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum[r5]
                r5[r2] = r0
                r5[r3] = r1
                r5[r6] = r4
                xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum.$VALUES = r5
                return
        }

        AutoPlayEnum(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.autoPlayStatus = r3
                return
        }

        public static xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum> r0 = xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum r1 = (xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum) r1
                return r1
        }

        public static xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum[] values() {
                xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum[] r0 = xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.common.AMPSEnum$AutoPlayEnum[] r0 = (xyz.adscope.amps.common.AMPSEnum.AutoPlayEnum[]) r0
                return r0
        }

        public int getAutoPlayValue() {
                r1 = this;
                int r0 = r1.autoPlayStatus
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ChannelInitStatus extends java.lang.Enum<xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus> {
        private static final /* synthetic */ xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus[] $VALUES = null;
        public static final xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus INIT_STATUS_FAIL = null;
        public static final xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus INIT_STATUS_SUCCESS = null;
        private boolean value;

        static {
                xyz.adscope.amps.common.AMPSEnum$ChannelInitStatus r0 = new xyz.adscope.amps.common.AMPSEnum$ChannelInitStatus
                java.lang.String r1 = "INIT_STATUS_SUCCESS"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus.INIT_STATUS_SUCCESS = r0
                xyz.adscope.amps.common.AMPSEnum$ChannelInitStatus r1 = new xyz.adscope.amps.common.AMPSEnum$ChannelInitStatus
                java.lang.String r4 = "INIT_STATUS_FAIL"
                r1.<init>(r4, r3, r2)
                xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus.INIT_STATUS_FAIL = r1
                r4 = 2
                xyz.adscope.amps.common.AMPSEnum$ChannelInitStatus[] r4 = new xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus[r4]
                r4[r2] = r0
                r4[r3] = r1
                xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus.$VALUES = r4
                return
        }

        ChannelInitStatus(java.lang.String r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.common.AMPSEnum$ChannelInitStatus> r0 = xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.common.AMPSEnum$ChannelInitStatus r1 = (xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus) r1
                return r1
        }

        public static xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus[] values() {
                xyz.adscope.amps.common.AMPSEnum$ChannelInitStatus[] r0 = xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.common.AMPSEnum$ChannelInitStatus[] r0 = (xyz.adscope.amps.common.AMPSEnum.ChannelInitStatus[]) r0
                return r0
        }

        public boolean getValue() {
                r1 = this;
                boolean r0 = r1.value
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ChannelSdkName extends java.lang.Enum<xyz.adscope.amps.common.AMPSEnum.ChannelSdkName> {
        private static final /* synthetic */ xyz.adscope.amps.common.AMPSEnum.ChannelSdkName[] $VALUES = null;
        public static final xyz.adscope.amps.common.AMPSEnum.ChannelSdkName CHANNEL_SDK_CSJ = null;
        public static final xyz.adscope.amps.common.AMPSEnum.ChannelSdkName CHANNEL_SDK_GDT = null;
        public static final xyz.adscope.amps.common.AMPSEnum.ChannelSdkName CHANNEL_SDK_GM = null;
        public static final xyz.adscope.amps.common.AMPSEnum.ChannelSdkName CHANNEL_SDK_KS = null;
        public static final xyz.adscope.amps.common.AMPSEnum.ChannelSdkName CHANNEL_SDK_YJ4 = null;
        public static final xyz.adscope.amps.common.AMPSEnum.ChannelSdkName CHANNEL_SDK_YJ5 = null;
        private java.lang.String sdkType;

        static {
                xyz.adscope.amps.common.AMPSEnum$ChannelSdkName r0 = new xyz.adscope.amps.common.AMPSEnum$ChannelSdkName
                java.lang.String r1 = "KS"
                java.lang.String r2 = "CHANNEL_SDK_KS"
                r3 = 0
                r0.<init>(r2, r3, r1)
                xyz.adscope.amps.common.AMPSEnum.ChannelSdkName.CHANNEL_SDK_KS = r0
                xyz.adscope.amps.common.AMPSEnum$ChannelSdkName r1 = new xyz.adscope.amps.common.AMPSEnum$ChannelSdkName
                java.lang.String r2 = "CSJ"
                java.lang.String r4 = "CHANNEL_SDK_CSJ"
                r5 = 1
                r1.<init>(r4, r5, r2)
                xyz.adscope.amps.common.AMPSEnum.ChannelSdkName.CHANNEL_SDK_CSJ = r1
                xyz.adscope.amps.common.AMPSEnum$ChannelSdkName r2 = new xyz.adscope.amps.common.AMPSEnum$ChannelSdkName
                java.lang.String r4 = "GM"
                java.lang.String r6 = "CHANNEL_SDK_GM"
                r7 = 2
                r2.<init>(r6, r7, r4)
                xyz.adscope.amps.common.AMPSEnum.ChannelSdkName.CHANNEL_SDK_GM = r2
                xyz.adscope.amps.common.AMPSEnum$ChannelSdkName r4 = new xyz.adscope.amps.common.AMPSEnum$ChannelSdkName
                java.lang.String r6 = "GDT"
                java.lang.String r8 = "CHANNEL_SDK_GDT"
                r9 = 3
                r4.<init>(r8, r9, r6)
                xyz.adscope.amps.common.AMPSEnum.ChannelSdkName.CHANNEL_SDK_GDT = r4
                xyz.adscope.amps.common.AMPSEnum$ChannelSdkName r6 = new xyz.adscope.amps.common.AMPSEnum$ChannelSdkName
                java.lang.String r8 = "ASNP"
                java.lang.String r10 = "CHANNEL_SDK_YJ4"
                r11 = 4
                r6.<init>(r10, r11, r8)
                xyz.adscope.amps.common.AMPSEnum.ChannelSdkName.CHANNEL_SDK_YJ4 = r6
                xyz.adscope.amps.common.AMPSEnum$ChannelSdkName r8 = new xyz.adscope.amps.common.AMPSEnum$ChannelSdkName
                java.lang.String r10 = "BZ"
                java.lang.String r12 = "CHANNEL_SDK_YJ5"
                r13 = 5
                r8.<init>(r12, r13, r10)
                xyz.adscope.amps.common.AMPSEnum.ChannelSdkName.CHANNEL_SDK_YJ5 = r8
                r10 = 6
                xyz.adscope.amps.common.AMPSEnum$ChannelSdkName[] r10 = new xyz.adscope.amps.common.AMPSEnum.ChannelSdkName[r10]
                r10[r3] = r0
                r10[r5] = r1
                r10[r7] = r2
                r10[r9] = r4
                r10[r11] = r6
                r10[r13] = r8
                xyz.adscope.amps.common.AMPSEnum.ChannelSdkName.$VALUES = r10
                return
        }

        ChannelSdkName(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.sdkType = r3
                return
        }

        public static xyz.adscope.amps.common.AMPSEnum.ChannelSdkName valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.common.AMPSEnum$ChannelSdkName> r0 = xyz.adscope.amps.common.AMPSEnum.ChannelSdkName.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.common.AMPSEnum$ChannelSdkName r1 = (xyz.adscope.amps.common.AMPSEnum.ChannelSdkName) r1
                return r1
        }

        public static xyz.adscope.amps.common.AMPSEnum.ChannelSdkName[] values() {
                xyz.adscope.amps.common.AMPSEnum$ChannelSdkName[] r0 = xyz.adscope.amps.common.AMPSEnum.ChannelSdkName.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.common.AMPSEnum$ChannelSdkName[] r0 = (xyz.adscope.amps.common.AMPSEnum.ChannelSdkName[]) r0
                return r0
        }

        public java.lang.String getSdkType() {
                r1 = this;
                java.lang.String r0 = r1.sdkType
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum OrientationEnum extends java.lang.Enum<xyz.adscope.amps.common.AMPSEnum.OrientationEnum> {
        private static final /* synthetic */ xyz.adscope.amps.common.AMPSEnum.OrientationEnum[] $VALUES = null;
        public static final xyz.adscope.amps.common.AMPSEnum.OrientationEnum ORIENTATION_COMMON = null;
        public static final xyz.adscope.amps.common.AMPSEnum.OrientationEnum ORIENTATION_LANDSCAPE = null;
        public static final xyz.adscope.amps.common.AMPSEnum.OrientationEnum ORIENTATION_PORTRAIT = null;
        private java.lang.String orientation;

        static {
                xyz.adscope.amps.common.AMPSEnum$OrientationEnum r0 = new xyz.adscope.amps.common.AMPSEnum$OrientationEnum
                java.lang.String r1 = "2"
                java.lang.String r2 = "ORIENTATION_PORTRAIT"
                r3 = 0
                r0.<init>(r2, r3, r1)
                xyz.adscope.amps.common.AMPSEnum.OrientationEnum.ORIENTATION_PORTRAIT = r0
                xyz.adscope.amps.common.AMPSEnum$OrientationEnum r1 = new xyz.adscope.amps.common.AMPSEnum$OrientationEnum
                java.lang.String r2 = "1"
                java.lang.String r4 = "ORIENTATION_LANDSCAPE"
                r5 = 1
                r1.<init>(r4, r5, r2)
                xyz.adscope.amps.common.AMPSEnum.OrientationEnum.ORIENTATION_LANDSCAPE = r1
                xyz.adscope.amps.common.AMPSEnum$OrientationEnum r2 = new xyz.adscope.amps.common.AMPSEnum$OrientationEnum
                java.lang.String r4 = "3"
                java.lang.String r6 = "ORIENTATION_COMMON"
                r7 = 2
                r2.<init>(r6, r7, r4)
                xyz.adscope.amps.common.AMPSEnum.OrientationEnum.ORIENTATION_COMMON = r2
                r4 = 3
                xyz.adscope.amps.common.AMPSEnum$OrientationEnum[] r4 = new xyz.adscope.amps.common.AMPSEnum.OrientationEnum[r4]
                r4[r3] = r0
                r4[r5] = r1
                r4[r7] = r2
                xyz.adscope.amps.common.AMPSEnum.OrientationEnum.$VALUES = r4
                return
        }

        OrientationEnum(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.orientation = r3
                return
        }

        public static xyz.adscope.amps.common.AMPSEnum.OrientationEnum valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.common.AMPSEnum$OrientationEnum> r0 = xyz.adscope.amps.common.AMPSEnum.OrientationEnum.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.common.AMPSEnum$OrientationEnum r1 = (xyz.adscope.amps.common.AMPSEnum.OrientationEnum) r1
                return r1
        }

        public static xyz.adscope.amps.common.AMPSEnum.OrientationEnum[] values() {
                xyz.adscope.amps.common.AMPSEnum$OrientationEnum[] r0 = xyz.adscope.amps.common.AMPSEnum.OrientationEnum.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.common.AMPSEnum$OrientationEnum[] r0 = (xyz.adscope.amps.common.AMPSEnum.OrientationEnum[]) r0
                return r0
        }

        public java.lang.String getOrientation() {
                r1 = this;
                java.lang.String r0 = r1.orientation
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum SupportPersonalizedEnum extends java.lang.Enum<xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum> {
        private static final /* synthetic */ xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum[] $VALUES = null;
        public static final xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum NO_SUPPORT_PERSONAL_RECOMMEND = null;
        public static final xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum SUPPORT_PERSONAL_RECOMMEND = null;
        private java.lang.String value;

        static {
                xyz.adscope.amps.common.AMPSEnum$SupportPersonalizedEnum r0 = new xyz.adscope.amps.common.AMPSEnum$SupportPersonalizedEnum
                java.lang.String r1 = "1"
                java.lang.String r2 = "SUPPORT_PERSONAL_RECOMMEND"
                r3 = 0
                r0.<init>(r2, r3, r1)
                xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum.SUPPORT_PERSONAL_RECOMMEND = r0
                xyz.adscope.amps.common.AMPSEnum$SupportPersonalizedEnum r1 = new xyz.adscope.amps.common.AMPSEnum$SupportPersonalizedEnum
                java.lang.String r2 = "0"
                java.lang.String r4 = "NO_SUPPORT_PERSONAL_RECOMMEND"
                r5 = 1
                r1.<init>(r4, r5, r2)
                xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum.NO_SUPPORT_PERSONAL_RECOMMEND = r1
                r2 = 2
                xyz.adscope.amps.common.AMPSEnum$SupportPersonalizedEnum[] r2 = new xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum[r2]
                r2[r3] = r0
                r2[r5] = r1
                xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum.$VALUES = r2
                return
        }

        SupportPersonalizedEnum(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.value = r3
                return
        }

        public static xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.common.AMPSEnum$SupportPersonalizedEnum> r0 = xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.common.AMPSEnum$SupportPersonalizedEnum r1 = (xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum) r1
                return r1
        }

        public static xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum[] values() {
                xyz.adscope.amps.common.AMPSEnum$SupportPersonalizedEnum[] r0 = xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.common.AMPSEnum$SupportPersonalizedEnum[] r0 = (xyz.adscope.amps.common.AMPSEnum.SupportPersonalizedEnum[]) r0
                return r0
        }

        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum VideoSoundEnum extends java.lang.Enum<xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum> {
        private static final /* synthetic */ xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum[] $VALUES = null;
        public static final xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum NO_SUPPORT_VIDEO_SOUND = null;
        public static final xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum SUPPORT_VIDEO_SOUND = null;
        private int hasSound;

        static {
                xyz.adscope.amps.common.AMPSEnum$VideoSoundEnum r0 = new xyz.adscope.amps.common.AMPSEnum$VideoSoundEnum
                java.lang.String r1 = "SUPPORT_VIDEO_SOUND"
                r2 = 0
                r3 = 1
                r0.<init>(r1, r2, r3)
                xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum.SUPPORT_VIDEO_SOUND = r0
                xyz.adscope.amps.common.AMPSEnum$VideoSoundEnum r1 = new xyz.adscope.amps.common.AMPSEnum$VideoSoundEnum
                java.lang.String r4 = "NO_SUPPORT_VIDEO_SOUND"
                r1.<init>(r4, r3, r2)
                xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum.NO_SUPPORT_VIDEO_SOUND = r1
                r4 = 2
                xyz.adscope.amps.common.AMPSEnum$VideoSoundEnum[] r4 = new xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum[r4]
                r4[r2] = r0
                r4[r3] = r1
                xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum.$VALUES = r4
                return
        }

        VideoSoundEnum(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.hasSound = r3
                return
        }

        public static xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.common.AMPSEnum$VideoSoundEnum> r0 = xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.common.AMPSEnum$VideoSoundEnum r1 = (xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum) r1
                return r1
        }

        public static xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum[] values() {
                xyz.adscope.amps.common.AMPSEnum$VideoSoundEnum[] r0 = xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.common.AMPSEnum$VideoSoundEnum[] r0 = (xyz.adscope.amps.common.AMPSEnum.VideoSoundEnum[]) r0
                return r0
        }

        public int getHasSound() {
                r1 = this;
                int r0 = r1.hasSound
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ZoomOutEnum extends java.lang.Enum<xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum> {
        private static final /* synthetic */ xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum[] $VALUES = null;
        public static final xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum NO_SUPPORT_ZOOM_OUT = null;
        public static final xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum SUPPORT_ZOOM_OUT = null;
        private java.lang.String zoomOutValue;

        static {
                xyz.adscope.amps.common.AMPSEnum$ZoomOutEnum r0 = new xyz.adscope.amps.common.AMPSEnum$ZoomOutEnum
                java.lang.String r1 = "1"
                java.lang.String r2 = "SUPPORT_ZOOM_OUT"
                r3 = 0
                r0.<init>(r2, r3, r1)
                xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum.SUPPORT_ZOOM_OUT = r0
                xyz.adscope.amps.common.AMPSEnum$ZoomOutEnum r1 = new xyz.adscope.amps.common.AMPSEnum$ZoomOutEnum
                java.lang.String r2 = "0"
                java.lang.String r4 = "NO_SUPPORT_ZOOM_OUT"
                r5 = 1
                r1.<init>(r4, r5, r2)
                xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum.NO_SUPPORT_ZOOM_OUT = r1
                r2 = 2
                xyz.adscope.amps.common.AMPSEnum$ZoomOutEnum[] r2 = new xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum[r2]
                r2[r3] = r0
                r2[r5] = r1
                xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum.$VALUES = r2
                return
        }

        ZoomOutEnum(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.zoomOutValue = r3
                return
        }

        public static xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.common.AMPSEnum$ZoomOutEnum> r0 = xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.common.AMPSEnum$ZoomOutEnum r1 = (xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum) r1
                return r1
        }

        public static xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum[] values() {
                xyz.adscope.amps.common.AMPSEnum$ZoomOutEnum[] r0 = xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.common.AMPSEnum$ZoomOutEnum[] r0 = (xyz.adscope.amps.common.AMPSEnum.ZoomOutEnum[]) r0
                return r0
        }

        public java.lang.String getZoomOutValue() {
                r1 = this;
                java.lang.String r0 = r1.zoomOutValue
                return r0
        }
    }

    public AMPSEnum() {
            r0 = this;
            r0.<init>()
            return
    }
}

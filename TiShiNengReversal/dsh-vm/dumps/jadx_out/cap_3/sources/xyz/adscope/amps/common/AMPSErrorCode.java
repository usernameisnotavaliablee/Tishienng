package xyz.adscope.amps.common;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSErrorCode {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ASMPLogicErrorEnum extends java.lang.Enum<xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum> {
        private static final /* synthetic */ xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum[] $VALUES = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum PLATFORM_ERROR_CONFIG_PARSE_ERROR = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum PLATFORM_ERROR_CONFIG_REQUEST_ERROR = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum PLATFORM_ERROR_CONFIG_REQUEST_TIME_OUT = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum PLATFORM_ERROR_CONFIG_RESPONSE_ERROR = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum PLATFORM_ERROR_FILTER_NOT_PASS = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum PLATFORM_ERROR_INIT_FAIL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum PLATFORM_ERROR_INIT_TIME_OUT = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum PLATFORM_ERROR_PARAM_ERROR = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum PLATFORM_ERROR_REQUEST_ERROR = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum PLATFORM_ERROR_REQUEST_TIME_OUT = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum PLATFORM_ERROR_SHOW_ERROR = null;
        private final java.lang.String errorCode;
        private final java.lang.String errorMsg;

        static {
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r0 = new xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum
                java.lang.String r1 = "1010001"
                java.lang.String r2 = "init fail"
                java.lang.String r3 = "PLATFORM_ERROR_INIT_FAIL"
                r4 = 0
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_INIT_FAIL = r0
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r1 = new xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum
                java.lang.String r2 = "1010002"
                java.lang.String r3 = "init timeout"
                java.lang.String r5 = "PLATFORM_ERROR_INIT_TIME_OUT"
                r6 = 1
                r1.<init>(r5, r6, r2, r3)
                xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_INIT_TIME_OUT = r1
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r2 = new xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum
                java.lang.String r3 = "1020001"
                java.lang.String r5 = "config response error"
                java.lang.String r7 = "PLATFORM_ERROR_CONFIG_RESPONSE_ERROR"
                r8 = 2
                r2.<init>(r7, r8, r3, r5)
                xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_CONFIG_RESPONSE_ERROR = r2
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r3 = new xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum
                java.lang.String r5 = "1020002"
                java.lang.String r7 = "config parse error"
                java.lang.String r9 = "PLATFORM_ERROR_CONFIG_PARSE_ERROR"
                r10 = 3
                r3.<init>(r9, r10, r5, r7)
                xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_CONFIG_PARSE_ERROR = r3
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r5 = new xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum
                java.lang.String r7 = "1020003"
                java.lang.String r9 = "config request error"
                java.lang.String r11 = "PLATFORM_ERROR_CONFIG_REQUEST_ERROR"
                r12 = 4
                r5.<init>(r11, r12, r7, r9)
                xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_CONFIG_REQUEST_ERROR = r5
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r7 = new xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum
                java.lang.String r9 = "1020004"
                java.lang.String r11 = "config request timeout"
                java.lang.String r13 = "PLATFORM_ERROR_CONFIG_REQUEST_TIME_OUT"
                r14 = 5
                r7.<init>(r13, r14, r9, r11)
                xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_CONFIG_REQUEST_TIME_OUT = r7
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r9 = new xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum
                java.lang.String r11 = "1030001"
                java.lang.String r13 = "platform param error"
                java.lang.String r15 = "PLATFORM_ERROR_PARAM_ERROR"
                r16 = 0
                r4 = 6
                r9.<init>(r15, r4, r11, r13)
                xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_PARAM_ERROR = r9
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r11 = new xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum
                java.lang.String r13 = "1040001"
                java.lang.String r15 = "platform filter not pass"
                r17 = 6
                java.lang.String r4 = "PLATFORM_ERROR_FILTER_NOT_PASS"
                r18 = 1
                r6 = 7
                r11.<init>(r4, r6, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_FILTER_NOT_PASS = r11
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r4 = new xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum
                java.lang.String r13 = "1050001"
                java.lang.String r15 = "request timeout"
                r19 = 7
                java.lang.String r6 = "PLATFORM_ERROR_REQUEST_TIME_OUT"
                r20 = 2
                r8 = 8
                r4.<init>(r6, r8, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_REQUEST_TIME_OUT = r4
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r6 = new xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum
                java.lang.String r13 = "1060001"
                java.lang.String r15 = "request fail"
                r21 = 8
                java.lang.String r8 = "PLATFORM_ERROR_REQUEST_ERROR"
                r22 = 3
                r10 = 9
                r6.<init>(r8, r10, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_REQUEST_ERROR = r6
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r8 = new xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum
                java.lang.String r13 = "1070001"
                java.lang.String r15 = "container or ad is null"
                r23 = 9
                java.lang.String r10 = "PLATFORM_ERROR_SHOW_ERROR"
                r24 = 4
                r12 = 10
                r8.<init>(r10, r12, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.PLATFORM_ERROR_SHOW_ERROR = r8
                r10 = 11
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum[] r10 = new xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum[r10]
                r10[r16] = r0
                r10[r18] = r1
                r10[r20] = r2
                r10[r22] = r3
                r10[r24] = r5
                r10[r14] = r7
                r10[r17] = r9
                r10[r19] = r11
                r10[r21] = r4
                r10[r23] = r6
                r10[r12] = r8
                xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.$VALUES = r10
                return
        }

        ASMPLogicErrorEnum(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.errorCode = r3
                r0.errorMsg = r4
                return
        }

        public static xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum> r0 = xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum r1 = (xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum) r1
                return r1
        }

        public static xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum[] values() {
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum[] r0 = xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.common.AMPSErrorCode$ASMPLogicErrorEnum[] r0 = (xyz.adscope.amps.common.AMPSErrorCode.ASMPLogicErrorEnum[]) r0
                return r0
        }

        public java.lang.String getErrorCode() {
                r1 = this;
                java.lang.String r0 = r1.errorCode
                return r0
        }

        public java.lang.String getErrorMsg() {
                r1 = this;
                java.lang.String r0 = r1.errorMsg
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ChannelErrorEnum extends java.lang.Enum<xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum> {
        private static final /* synthetic */ xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum[] $VALUES = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum CHANNEL_ERROR_AD_CONTAINER_NULL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum CHANNEL_ERROR_AD_IS_NULL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum CHANNEL_ERROR_AD_RENDER_FAIL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum CHANNEL_ERROR_BZ_LOAD_FAIL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum CHANNEL_ERROR_INIT_ERROR = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum CHANNEL_ERROR_REQUEST_CACHE_FAIL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum CHANNEL_ERROR_REQUEST_FAIL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum CHANNEL_ERROR_REQUEST_PARAM_ERROR = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum CHANNEL_ERROR_REQUEST_TIMEOUT = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum CHANNEL_ERROR_REQUEST_TYPE_ERROR = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum CHANNEL_ERROR_SDK_NOT_IMPORT = null;
        private final java.lang.String errorCode;
        private final java.lang.String errorMsg;

        static {
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r0 = new xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum
                java.lang.String r1 = "1000001"
                java.lang.String r2 = "channel init error"
                java.lang.String r3 = "CHANNEL_ERROR_INIT_ERROR"
                r4 = 0
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_INIT_ERROR = r0
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r1 = new xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum
                java.lang.String r2 = "1001001"
                java.lang.String r3 = "channel adapter request param error"
                java.lang.String r5 = "CHANNEL_ERROR_REQUEST_PARAM_ERROR"
                r6 = 1
                r1.<init>(r5, r6, r2, r3)
                xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_PARAM_ERROR = r1
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r2 = new xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum
                java.lang.String r3 = "1002001"
                java.lang.String r5 = "channel ad is null or empty"
                java.lang.String r7 = "CHANNEL_ERROR_AD_IS_NULL"
                r8 = 2
                r2.<init>(r7, r8, r3, r5)
                xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_IS_NULL = r2
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r3 = new xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum
                java.lang.String r5 = "1003001"
                java.lang.String r7 = "channel ad or container is null"
                java.lang.String r9 = "CHANNEL_ERROR_AD_CONTAINER_NULL"
                r10 = 3
                r3.<init>(r9, r10, r5, r7)
                xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_CONTAINER_NULL = r3
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r5 = new xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum
                java.lang.String r7 = "1004001"
                java.lang.String r9 = "channel ad render fail"
                java.lang.String r11 = "CHANNEL_ERROR_AD_RENDER_FAIL"
                r12 = 4
                r5.<init>(r11, r12, r7, r9)
                xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_AD_RENDER_FAIL = r5
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r7 = new xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum
                java.lang.String r9 = "1005001"
                java.lang.String r11 = "channel ad request timeout"
                java.lang.String r13 = "CHANNEL_ERROR_REQUEST_TIMEOUT"
                r14 = 5
                r7.<init>(r13, r14, r9, r11)
                xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_TIMEOUT = r7
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r9 = new xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum
                java.lang.String r11 = "1005002"
                java.lang.String r13 = "channel ad request fail"
                java.lang.String r15 = "CHANNEL_ERROR_REQUEST_FAIL"
                r16 = 0
                r4 = 6
                r9.<init>(r15, r4, r11, r13)
                xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_FAIL = r9
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r11 = new xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum
                java.lang.String r13 = "1005003"
                java.lang.String r15 = "channel ad request cache fail"
                r17 = 6
                java.lang.String r4 = "CHANNEL_ERROR_REQUEST_CACHE_FAIL"
                r18 = 1
                r6 = 7
                r11.<init>(r4, r6, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_CACHE_FAIL = r11
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r4 = new xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum
                java.lang.String r13 = "1005004"
                java.lang.String r15 = "channel ad request type error"
                r19 = 7
                java.lang.String r6 = "CHANNEL_ERROR_REQUEST_TYPE_ERROR"
                r20 = 2
                r8 = 8
                r4.<init>(r6, r8, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_REQUEST_TYPE_ERROR = r4
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r6 = new xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum
                java.lang.String r13 = "1006001"
                java.lang.String r15 = "channel bz load fail"
                r21 = 8
                java.lang.String r8 = "CHANNEL_ERROR_BZ_LOAD_FAIL"
                r22 = 3
                r10 = 9
                r6.<init>(r8, r10, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_BZ_LOAD_FAIL = r6
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r8 = new xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum
                java.lang.String r13 = "1007001"
                java.lang.String r15 = "channel sdk not import"
                r23 = 9
                java.lang.String r10 = "CHANNEL_ERROR_SDK_NOT_IMPORT"
                r24 = 4
                r12 = 10
                r8.<init>(r10, r12, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.CHANNEL_ERROR_SDK_NOT_IMPORT = r8
                r10 = 11
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum[] r10 = new xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum[r10]
                r10[r16] = r0
                r10[r18] = r1
                r10[r20] = r2
                r10[r22] = r3
                r10[r24] = r5
                r10[r14] = r7
                r10[r17] = r9
                r10[r19] = r11
                r10[r21] = r4
                r10[r23] = r6
                r10[r12] = r8
                xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.$VALUES = r10
                return
        }

        ChannelErrorEnum(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.errorCode = r3
                r0.errorMsg = r4
                return
        }

        public static xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum> r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum r1 = (xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum) r1
                return r1
        }

        public static xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum[] values() {
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum[] r0 = xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.common.AMPSErrorCode$ChannelErrorEnum[] r0 = (xyz.adscope.amps.common.AMPSErrorCode.ChannelErrorEnum[]) r0
                return r0
        }

        public java.lang.String getErrorCode() {
                r1 = this;
                java.lang.String r0 = r1.errorCode
                return r0
        }

        public java.lang.String getErrorMsg() {
                r1 = this;
                java.lang.String r0 = r1.errorMsg
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ReportLogErrorEnum extends java.lang.Enum<xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum> {
        private static final /* synthetic */ xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum[] $VALUES = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_ADSOURCE_BIDDING_COMPARE_FAIL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_ADSOURCE_BIDDING_COMPARE_FAIL_LESS_FLOOR = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_ADSOURCE_BIDDING_FAIL_RESULT = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_ADSOURCE_BIDDING_FAIL_RESULT_NULL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_ADSOURCE_BIDDING_FAIL_SELECTOR_ADAPTER_NULL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_ADSOURCE_BIDDING_FAIL_SELECTOR_INIT_NULL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_ADSOURCE_COMPARISON_FAIL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_ADSOURCE_FILTER_FAIL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_ADSOURCE_GET_CACHE_FAIL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_ADSOURCE_INIT_FAIL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_ADSOURCE_INIT_START = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_ADSOURCE_INIT_SUCCESS = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_ADSOURCE_LOAD_REQUEST_FAIL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_INIT_FAIL_APPID_NULL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_INIT_FAIL_CONFIG_NULL = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_MEDIATION_LOAD_FAIL_CODE = null;
        public static final xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum REPORT_LOG_SPACE_FILTER_FAIL_CODE = null;
        private final java.lang.String errorCode;
        private final java.lang.String errorMsg;

        static {
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r0 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r1 = "100400"
                java.lang.String r2 = "init fail context or config is null"
                java.lang.String r3 = "REPORT_LOG_INIT_FAIL_CONFIG_NULL"
                r4 = 0
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_INIT_FAIL_CONFIG_NULL = r0
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r1 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r2 = "100401"
                java.lang.String r3 = "init fail appid is null"
                java.lang.String r5 = "REPORT_LOG_INIT_FAIL_APPID_NULL"
                r6 = 1
                r1.<init>(r5, r6, r2, r3)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_INIT_FAIL_APPID_NULL = r1
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r2 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r3 = "210400"
                java.lang.String r5 = "mediation load fail"
                java.lang.String r7 = "REPORT_LOG_MEDIATION_LOAD_FAIL_CODE"
                r8 = 2
                r2.<init>(r7, r8, r3, r5)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_MEDIATION_LOAD_FAIL_CODE = r2
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r3 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r5 = "220400"
                java.lang.String r7 = "space filter fail"
                java.lang.String r9 = "REPORT_LOG_SPACE_FILTER_FAIL_CODE"
                r10 = 3
                r3.<init>(r9, r10, r5, r7)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_SPACE_FILTER_FAIL_CODE = r3
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r5 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r7 = "240400"
                java.lang.String r9 = "ad source filter fail"
                java.lang.String r11 = "REPORT_LOG_ADSOURCE_FILTER_FAIL"
                r12 = 4
                r5.<init>(r11, r12, r7, r9)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_FILTER_FAIL = r5
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r7 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r9 = "240500"
                java.lang.String r11 = "adsource init start"
                java.lang.String r13 = "REPORT_LOG_ADSOURCE_INIT_START"
                r14 = 5
                r7.<init>(r13, r14, r9, r11)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_INIT_START = r7
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r9 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r11 = "240501"
                java.lang.String r13 = "adsource init success"
                java.lang.String r15 = "REPORT_LOG_ADSOURCE_INIT_SUCCESS"
                r16 = 0
                r4 = 6
                r9.<init>(r15, r4, r11, r13)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_INIT_SUCCESS = r9
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r11 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r13 = "240502"
                java.lang.String r15 = "adsource init fail"
                r17 = 6
                java.lang.String r4 = "REPORT_LOG_ADSOURCE_INIT_FAIL"
                r18 = 1
                r6 = 7
                r11.<init>(r4, r6, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_INIT_FAIL = r11
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r4 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r13 = "250400"
                java.lang.String r15 = "biddingResult is null"
                r19 = 7
                java.lang.String r6 = "REPORT_LOG_ADSOURCE_BIDDING_FAIL_RESULT_NULL"
                r20 = 2
                r8 = 8
                r4.<init>(r6, r8, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_BIDDING_FAIL_RESULT_NULL = r4
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r6 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r13 = "250401"
                java.lang.String r15 = "biddingResult is fail"
                r21 = 8
                java.lang.String r8 = "REPORT_LOG_ADSOURCE_BIDDING_FAIL_RESULT"
                r22 = 3
                r10 = 9
                r6.<init>(r8, r10, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_BIDDING_FAIL_RESULT = r6
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r8 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r13 = "250500"
                java.lang.String r15 = "init sdk is null"
                r23 = 9
                java.lang.String r10 = "REPORT_LOG_ADSOURCE_BIDDING_FAIL_SELECTOR_INIT_NULL"
                r24 = 4
                r12 = 10
                r8.<init>(r10, r12, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_BIDDING_FAIL_SELECTOR_INIT_NULL = r8
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r10 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r13 = "250501"
                java.lang.String r15 = "adapter is null"
                r25 = 10
                java.lang.String r12 = "REPORT_LOG_ADSOURCE_BIDDING_FAIL_SELECTOR_ADAPTER_NULL"
                r26 = 5
                r14 = 11
                r10.<init>(r12, r14, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_BIDDING_FAIL_SELECTOR_ADAPTER_NULL = r10
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r12 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r13 = "251400"
                java.lang.String r15 = "bidding compare fail"
                r27 = 11
                java.lang.String r14 = "REPORT_LOG_ADSOURCE_BIDDING_COMPARE_FAIL"
                r28 = r0
                r0 = 12
                r12.<init>(r14, r0, r13, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_BIDDING_COMPARE_FAIL = r12
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r13 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r14 = "251401"
                java.lang.String r15 = "bidding less floor ecpm"
                r29 = 12
                java.lang.String r0 = "REPORT_LOG_ADSOURCE_BIDDING_COMPARE_FAIL_LESS_FLOOR"
                r30 = r1
                r1 = 13
                r13.<init>(r0, r1, r14, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_BIDDING_COMPARE_FAIL_LESS_FLOOR = r13
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r0 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r14 = "260400"
                java.lang.String r15 = "get cache fail"
                r31 = 13
                java.lang.String r1 = "REPORT_LOG_ADSOURCE_GET_CACHE_FAIL"
                r32 = r2
                r2 = 14
                r0.<init>(r1, r2, r14, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_GET_CACHE_FAIL = r0
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r1 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r14 = "270400"
                java.lang.String r15 = "request fail"
                r33 = 14
                java.lang.String r2 = "REPORT_LOG_ADSOURCE_LOAD_REQUEST_FAIL"
                r34 = r0
                r0 = 15
                r1.<init>(r2, r0, r14, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_LOAD_REQUEST_FAIL = r1
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r2 = new xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum
                java.lang.String r14 = "280400"
                java.lang.String r15 = "comparison fail"
                r35 = 15
                java.lang.String r0 = "REPORT_LOG_ADSOURCE_COMPARISON_FAIL"
                r36 = r1
                r1 = 16
                r2.<init>(r0, r1, r14, r15)
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.REPORT_LOG_ADSOURCE_COMPARISON_FAIL = r2
                r0 = 17
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum[] r0 = new xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum[r0]
                r0[r16] = r28
                r0[r18] = r30
                r0[r20] = r32
                r0[r22] = r3
                r0[r24] = r5
                r0[r26] = r7
                r0[r17] = r9
                r0[r19] = r11
                r0[r21] = r4
                r0[r23] = r6
                r0[r25] = r8
                r0[r27] = r10
                r0[r29] = r12
                r0[r31] = r13
                r0[r33] = r34
                r0[r35] = r36
                r0[r1] = r2
                xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.$VALUES = r0
                return
        }

        ReportLogErrorEnum(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.errorCode = r3
                r0.errorMsg = r4
                return
        }

        public static xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum> r0 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum r1 = (xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum) r1
                return r1
        }

        public static xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum[] values() {
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum[] r0 = xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.common.AMPSErrorCode$ReportLogErrorEnum[] r0 = (xyz.adscope.amps.common.AMPSErrorCode.ReportLogErrorEnum[]) r0
                return r0
        }

        public java.lang.String getErrorCode() {
                r1 = this;
                java.lang.String r0 = r1.errorCode
                return r0
        }

        public java.lang.String getErrorMsg() {
                r1 = this;
                java.lang.String r0 = r1.errorMsg
                return r0
        }
    }

    public AMPSErrorCode() {
            r0 = this;
            r0.<init>()
            return
    }
}

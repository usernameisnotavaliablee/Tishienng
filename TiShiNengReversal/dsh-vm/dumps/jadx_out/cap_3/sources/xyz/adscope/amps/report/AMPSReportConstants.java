package xyz.adscope.amps.report;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class AMPSReportConstants {
    public static final java.lang.String ACCESS_KEY = "AMPS";
    public static final java.lang.String ACCESS_TYPE_SDK = "sdk";
    public static final java.lang.String CURRENCY = "CNY";
    public static final java.lang.String CUSTOM_ID = "mediation5";
    public static final java.lang.String CUSTOM_LOGGER = "xyz.adscope.amps";
    public static final java.lang.String EVENT_TIME_KEY = "eventTime";
    public static final java.lang.String LMT_NO_PERMIT = "0";
    public static final java.lang.String LMT_PERMIT = "1";
    public static final java.lang.String LOG_VERSION = "5.0.0";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum LOAD_TYPE extends java.lang.Enum<xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE> {
        private static final /* synthetic */ xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE[] $VALUES = null;
        public static final xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE LOAD_TYPE_AUTO = null;
        public static final xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE LOAD_TYPE_NORMAL = null;
        public static final xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE LOAD_TYPE_PRELOAD = null;
        private int code;
        private java.lang.String value;

        static {
                xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE r0 = new xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE
                java.lang.String r1 = "normal"
                java.lang.String r2 = "LOAD_TYPE_NORMAL"
                r3 = 0
                r0.<init>(r2, r3, r3, r1)
                xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE.LOAD_TYPE_NORMAL = r0
                xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE r1 = new xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE
                java.lang.String r2 = "preload"
                java.lang.String r4 = "LOAD_TYPE_PRELOAD"
                r5 = 1
                r1.<init>(r4, r5, r5, r2)
                xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE.LOAD_TYPE_PRELOAD = r1
                xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE r2 = new xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE
                java.lang.String r4 = "auto"
                java.lang.String r6 = "LOAD_TYPE_AUTO"
                r7 = 2
                r2.<init>(r6, r7, r7, r4)
                xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE.LOAD_TYPE_AUTO = r2
                r4 = 3
                xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE[] r4 = new xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE[r4]
                r4[r3] = r0
                r4[r5] = r1
                r4[r7] = r2
                xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE.$VALUES = r4
                return
        }

        LOAD_TYPE(java.lang.String r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.code = r3
                r0.value = r4
                return
        }

        public static xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE> r0 = xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE r1 = (xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE) r1
                return r1
        }

        public static xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE[] values() {
                xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE[] r0 = xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.report.AMPSReportConstants$LOAD_TYPE[] r0 = (xyz.adscope.amps.report.AMPSReportConstants.LOAD_TYPE[]) r0
                return r0
        }

        public int getCode() {
                r1 = this;
                int r0 = r1.code
                return r0
        }

        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum REPORT_AD_TYPE extends java.lang.Enum<xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE> {
        private static final /* synthetic */ xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE[] $VALUES = null;
        public static final xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE AD_TYPE_BANNER = null;
        public static final xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE AD_TYPE_INTERSTITIAL = null;
        public static final xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE AD_TYPE_NATIVE_EXPRESS = null;
        public static final xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE AD_TYPE_NATIVE_UNIFIED = null;
        public static final xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE AD_TYPE_REWARD_VIDEO = null;
        public static final xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE AD_TYPE_SPLASH = null;
        private java.lang.String code;
        private java.lang.String value;

        static {
                xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r0 = new xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE
                java.lang.String r1 = "1"
                java.lang.String r2 = "rewardVideo"
                java.lang.String r3 = "AD_TYPE_REWARD_VIDEO"
                r4 = 0
                r0.<init>(r3, r4, r1, r2)
                xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_REWARD_VIDEO = r0
                xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r1 = new xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE
                java.lang.String r2 = "2"
                java.lang.String r3 = "splash"
                java.lang.String r5 = "AD_TYPE_SPLASH"
                r6 = 1
                r1.<init>(r5, r6, r2, r3)
                xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_SPLASH = r1
                xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r2 = new xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE
                java.lang.String r3 = "3"
                java.lang.String r5 = "interstitial"
                java.lang.String r7 = "AD_TYPE_INTERSTITIAL"
                r8 = 2
                r2.<init>(r7, r8, r3, r5)
                xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_INTERSTITIAL = r2
                xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r3 = new xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE
                java.lang.String r5 = "7"
                java.lang.String r7 = "nativeExpress"
                java.lang.String r9 = "AD_TYPE_NATIVE_EXPRESS"
                r10 = 3
                r3.<init>(r9, r10, r5, r7)
                xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_NATIVE_EXPRESS = r3
                xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r5 = new xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE
                java.lang.String r7 = "6"
                java.lang.String r9 = "nativeUnified"
                java.lang.String r11 = "AD_TYPE_NATIVE_UNIFIED"
                r12 = 4
                r5.<init>(r11, r12, r7, r9)
                xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_NATIVE_UNIFIED = r5
                xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r7 = new xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE
                java.lang.String r9 = "4"
                java.lang.String r11 = "banner"
                java.lang.String r13 = "AD_TYPE_BANNER"
                r14 = 5
                r7.<init>(r13, r14, r9, r11)
                xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.AD_TYPE_BANNER = r7
                r9 = 6
                xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE[] r9 = new xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE[r9]
                r9[r4] = r0
                r9[r6] = r1
                r9[r8] = r2
                r9[r10] = r3
                r9[r12] = r5
                r9[r14] = r7
                xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.$VALUES = r9
                return
        }

        REPORT_AD_TYPE(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.code = r3
                r0.value = r4
                return
        }

        public static xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE> r0 = xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE r1 = (xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE) r1
                return r1
        }

        public static xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE[] values() {
                xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE[] r0 = xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.amps.report.AMPSReportConstants$REPORT_AD_TYPE[] r0 = (xyz.adscope.amps.report.AMPSReportConstants.REPORT_AD_TYPE[]) r0
                return r0
        }

        public java.lang.String getCode() {
                r1 = this;
                java.lang.String r0 = r1.code
                return r0
        }

        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }
    }

    public AMPSReportConstants() {
            r0 = this;
            r0.<init>()
            return
    }
}

package xyz.adscope.common.info.deviceinfo;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DeviceInfoEnum {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum CARRIER_TYPE extends java.lang.Enum<xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE> {
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE CARRIER_CMCC = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE CARRIER_CTCC = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE CARRIER_CUCC = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE CARRIER_UNKNOWN = null;
        private static final /* synthetic */ xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE[] b = null;
        private java.lang.String a;

        static {
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE
                r1 = 0
                java.lang.String r2 = "CMCC"
                java.lang.String r3 = "CARRIER_CMCC"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.CARRIER_CMCC = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE
                r1 = 1
                java.lang.String r2 = "CUCC"
                java.lang.String r3 = "CARRIER_CUCC"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.CARRIER_CUCC = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE
                r1 = 2
                java.lang.String r2 = "CTCC"
                java.lang.String r3 = "CARRIER_CTCC"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.CARRIER_CTCC = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE
                r1 = 3
                java.lang.String r2 = "UNKNOW"
                java.lang.String r3 = "CARRIER_UNKNOWN"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.CARRIER_UNKNOWN = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE[] r0 = a()
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.b = r0
                return
        }

        CARRIER_TYPE(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                return
        }

        private static /* synthetic */ xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE[] a() {
                r0 = 4
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE[] r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE[r0]
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.CARRIER_CMCC
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.CARRIER_CUCC
                r2 = 1
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.CARRIER_CTCC
                r2 = 2
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.CARRIER_UNKNOWN
                r2 = 3
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE> r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE r1 = (xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE) r1
                return r1
        }

        public static xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE[] values() {
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE[] r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE.b
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CARRIER_TYPE[] r0 = (xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CARRIER_TYPE[]) r0
                return r0
        }

        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum CONNECT_TYPE extends java.lang.Enum<xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE> {
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE CONNECT_TYPE_2G = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE CONNECT_TYPE_3G = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE CONNECT_TYPE_4G = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE CONNECT_TYPE_5G = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE CONNECT_TYPE_UNKNOWN = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE CONNECT_TYPE_WIFI = null;
        private static final /* synthetic */ xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE[] c = null;
        private int a;
        private java.lang.String b;

        static {
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE
                r1 = 0
                java.lang.String r2 = "unknown"
                java.lang.String r3 = "CONNECT_TYPE_UNKNOWN"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_UNKNOWN = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE
                r1 = 1
                java.lang.String r2 = "wifi"
                java.lang.String r3 = "CONNECT_TYPE_WIFI"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_WIFI = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE
                r1 = 2
                java.lang.String r2 = "2G"
                java.lang.String r3 = "CONNECT_TYPE_2G"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_2G = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE
                r1 = 3
                java.lang.String r2 = "3G"
                java.lang.String r3 = "CONNECT_TYPE_3G"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_3G = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE
                r1 = 4
                java.lang.String r2 = "4G"
                java.lang.String r3 = "CONNECT_TYPE_4G"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_4G = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE
                r1 = 5
                java.lang.String r2 = "5G"
                java.lang.String r3 = "CONNECT_TYPE_5G"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_5G = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE[] r0 = a()
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.c = r0
                return
        }

        CONNECT_TYPE(java.lang.String r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                r0.b = r4
                return
        }

        private static /* synthetic */ xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE[] a() {
                r0 = 6
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE[] r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE[r0]
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_UNKNOWN
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_WIFI
                r2 = 1
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_2G
                r2 = 2
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_3G
                r2 = 3
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_4G
                r2 = 4
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.CONNECT_TYPE_5G
                r2 = 5
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE> r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE r1 = (xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE) r1
                return r1
        }

        public static xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE[] values() {
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE[] r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE.c
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$CONNECT_TYPE[] r0 = (xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.CONNECT_TYPE[]) r0
                return r0
        }

        public int getCode() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum DEVICE_COUNTRY_TYPE extends java.lang.Enum<xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE> {
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE COUNTRY_CHINA_TYPE = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE COUNTRY_OTHER_TYPE = null;
        private static final /* synthetic */ xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE[] c = null;
        private int a;
        private java.lang.String b;

        static {
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE
                r1 = 0
                java.lang.String r2 = "OTHER"
                java.lang.String r3 = "COUNTRY_OTHER_TYPE"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE.COUNTRY_OTHER_TYPE = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE
                r1 = 1
                java.lang.String r2 = "CN"
                java.lang.String r3 = "COUNTRY_CHINA_TYPE"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE.COUNTRY_CHINA_TYPE = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE[] r0 = a()
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE.c = r0
                return
        }

        DEVICE_COUNTRY_TYPE(java.lang.String r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                r0.b = r4
                return
        }

        private static /* synthetic */ xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE[] a() {
                r0 = 2
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE[] r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE[r0]
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE.COUNTRY_OTHER_TYPE
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE.COUNTRY_CHINA_TYPE
                r2 = 1
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE> r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE r1 = (xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE) r1
                return r1
        }

        public static xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE[] values() {
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE[] r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE.c
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_COUNTRY_TYPE[] r0 = (xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_COUNTRY_TYPE[]) r0
                return r0
        }

        public int getCode() {
                r1 = this;
                int r0 = r1.a
                return r0
        }

        public java.lang.String getCountry() {
                r1 = this;
                java.lang.String r0 = r1.b
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum DEVICE_TYPE extends java.lang.Enum<xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE> {
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE TYPE_PHONE = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE TYPE_TABLET = null;
        private static final /* synthetic */ xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE[] b = null;
        private int a;

        static {
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE
                r1 = 0
                r2 = 100
                java.lang.String r3 = "TYPE_PHONE"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE.TYPE_PHONE = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE
                r1 = 1
                r2 = 101(0x65, float:1.42E-43)
                java.lang.String r3 = "TYPE_TABLET"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE.TYPE_TABLET = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE[] r0 = a()
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE.b = r0
                return
        }

        DEVICE_TYPE(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                return
        }

        private static /* synthetic */ xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE[] a() {
                r0 = 2
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE[] r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE[r0]
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE.TYPE_PHONE
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE.TYPE_TABLET
                r2 = 1
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE> r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE r1 = (xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE) r1
                return r1
        }

        public static xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE[] values() {
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE[] r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE.b
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$DEVICE_TYPE[] r0 = (xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.DEVICE_TYPE[]) r0
                return r0
        }

        public int getCode() {
                r1 = this;
                int r0 = r1.a
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    enum OS_TYPE extends java.lang.Enum<xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE> {
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE CONNECT_TYPE_UNKNOWN = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE OS_ANDROID = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE OS_IOS = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE OS_IOS_TV = null;
        public static final xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE OS_PS4 = null;
        private static final /* synthetic */ xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE[] b = null;
        private int a;

        static {
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE
                java.lang.String r1 = "CONNECT_TYPE_UNKNOWN"
                r2 = 0
                r0.<init>(r1, r2, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.CONNECT_TYPE_UNKNOWN = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE
                java.lang.String r1 = "OS_ANDROID"
                r2 = 1
                r3 = 2
                r0.<init>(r1, r2, r3)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.OS_ANDROID = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE
                java.lang.String r1 = "OS_IOS_TV"
                r2 = 3
                r0.<init>(r1, r3, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.OS_IOS_TV = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE
                java.lang.String r1 = "OS_IOS"
                r3 = 13
                r0.<init>(r1, r2, r3)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.OS_IOS = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE
                r1 = 4
                r2 = 22
                java.lang.String r3 = "OS_PS4"
                r0.<init>(r3, r1, r2)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.OS_PS4 = r0
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE[] r0 = a()
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.b = r0
                return
        }

        OS_TYPE(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.a = r3
                return
        }

        private static /* synthetic */ xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE[] a() {
                r0 = 5
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE[] r0 = new xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE[r0]
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.CONNECT_TYPE_UNKNOWN
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.OS_ANDROID
                r2 = 1
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.OS_IOS_TV
                r2 = 2
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.OS_IOS
                r2 = 3
                r0[r2] = r1
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE r1 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.OS_PS4
                r2 = 4
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE> r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE r1 = (xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE) r1
                return r1
        }

        public static xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE[] values() {
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE[] r0 = xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE.b
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.info.deviceinfo.DeviceInfoEnum$OS_TYPE[] r0 = (xyz.adscope.common.info.deviceinfo.DeviceInfoEnum.OS_TYPE[]) r0
                return r0
        }

        public int getCode() {
                r1 = this;
                int r0 = r1.a
                return r0
        }
    }

    public DeviceInfoEnum() {
            r0 = this;
            r0.<init>()
            return
    }
}

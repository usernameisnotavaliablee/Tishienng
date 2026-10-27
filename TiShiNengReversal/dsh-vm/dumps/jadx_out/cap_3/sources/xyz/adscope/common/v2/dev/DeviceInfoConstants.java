package xyz.adscope.common.v2.dev;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DeviceInfoConstants {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CarrierType {
        public static final java.lang.String CARRIER_CMCC = "CMCC";
        public static final java.lang.String CARRIER_CTCC = "CTCC";
        public static final java.lang.String CARRIER_CUCC = "CUCC";
        public static final java.lang.String CARRIER_UNKNOWN = "UNKNOW";
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum ConnectType extends java.lang.Enum<xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType> {
        private static final /* synthetic */ xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType[] $VALUES = null;
        public static final xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType CONNECT_TYPE_2G = null;
        public static final xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType CONNECT_TYPE_3G = null;
        public static final xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType CONNECT_TYPE_4G = null;
        public static final xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType CONNECT_TYPE_5G = null;
        public static final xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType CONNECT_TYPE_UNKNOWN = null;
        public static final xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType CONNECT_TYPE_WIFI = null;
        private final int code;
        private final java.lang.String value;

        private static /* synthetic */ xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType[] $values() {
                r0 = 6
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType[] r0 = new xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType[r0]
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r1 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_UNKNOWN
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r1 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_WIFI
                r2 = 1
                r0[r2] = r1
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r1 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_2G
                r2 = 2
                r0[r2] = r1
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r1 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_3G
                r2 = 3
                r0[r2] = r1
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r1 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_4G
                r2 = 4
                r0[r2] = r1
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r1 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_5G
                r2 = 5
                r0[r2] = r1
                return r0
        }

        static {
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r0 = new xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType
                r1 = 0
                java.lang.String r2 = "unknown"
                java.lang.String r3 = "CONNECT_TYPE_UNKNOWN"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_UNKNOWN = r0
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r0 = new xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType
                r1 = 1
                java.lang.String r2 = "wifi"
                java.lang.String r3 = "CONNECT_TYPE_WIFI"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_WIFI = r0
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r0 = new xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType
                r1 = 2
                java.lang.String r2 = "2G"
                java.lang.String r3 = "CONNECT_TYPE_2G"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_2G = r0
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r0 = new xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType
                r1 = 3
                java.lang.String r2 = "3G"
                java.lang.String r3 = "CONNECT_TYPE_3G"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_3G = r0
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r0 = new xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType
                r1 = 4
                java.lang.String r2 = "4G"
                java.lang.String r3 = "CONNECT_TYPE_4G"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_4G = r0
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r0 = new xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType
                r1 = 5
                java.lang.String r2 = "5G"
                java.lang.String r3 = "CONNECT_TYPE_5G"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.CONNECT_TYPE_5G = r0
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType[] r0 = $values()
                xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.$VALUES = r0
                return
        }

        ConnectType(java.lang.String r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.code = r3
                r0.value = r4
                return
        }

        public static xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType> r0 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType r1 = (xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType) r1
                return r1
        }

        public static xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType[] values() {
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType[] r0 = xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.v2.dev.DeviceInfoConstants$ConnectType[] r0 = (xyz.adscope.common.v2.dev.DeviceInfoConstants.ConnectType[]) r0
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
    public enum CountryType extends java.lang.Enum<xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType> {
        private static final /* synthetic */ xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType[] $VALUES = null;
        public static final xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType COUNTRY_CHINA_TYPE = null;
        public static final xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType COUNTRY_OTHER_TYPE = null;
        private final int code;
        private final java.lang.String country;

        private static /* synthetic */ xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType[] $values() {
                r0 = 2
                xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType[] r0 = new xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType[r0]
                xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType r1 = xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType.COUNTRY_OTHER_TYPE
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType r1 = xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType.COUNTRY_CHINA_TYPE
                r2 = 1
                r0[r2] = r1
                return r0
        }

        static {
                xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType r0 = new xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType
                r1 = 0
                java.lang.String r2 = "OTHER"
                java.lang.String r3 = "COUNTRY_OTHER_TYPE"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType.COUNTRY_OTHER_TYPE = r0
                xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType r0 = new xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType
                r1 = 1
                java.lang.String r2 = "CN"
                java.lang.String r3 = "COUNTRY_CHINA_TYPE"
                r0.<init>(r3, r1, r1, r2)
                xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType.COUNTRY_CHINA_TYPE = r0
                xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType[] r0 = $values()
                xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType.$VALUES = r0
                return
        }

        CountryType(java.lang.String r1, int r2, int r3, java.lang.String r4) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.code = r3
                r0.country = r4
                return
        }

        public static xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType> r0 = xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType r1 = (xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType) r1
                return r1
        }

        public static xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType[] values() {
                xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType[] r0 = xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.v2.dev.DeviceInfoConstants$CountryType[] r0 = (xyz.adscope.common.v2.dev.DeviceInfoConstants.CountryType[]) r0
                return r0
        }

        public int getCode() {
                r1 = this;
                int r0 = r1.code
                return r0
        }

        public java.lang.String getCountry() {
                r1 = this;
                java.lang.String r0 = r1.country
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface DeviceType {
        public static final int TYPE_PHONE = 100;
        public static final int TYPE_TABLET = 101;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface IndividuationState {
        public static final int CONFIG_INDIVIDUATION_DENIED = 1;
        public static final int CONFIG_INDIVIDUATION_GRANTED = 0;
        public static final int INDIVIDUATION_DENIED = 0;
        public static final int INDIVIDUATION_GRANTED = 1;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface OperatorSystemType {
        public static final int OS_ANDROID = 2;
        public static final int OS_IOS = 13;
        public static final int OS_IOS_TV = 3;
        public static final int OS_PS4 = 22;
        public static final int OS_UNKNOWN = 0;
    }

    public DeviceInfoConstants() {
            r0 = this;
            r0.<init>()
            return
    }
}

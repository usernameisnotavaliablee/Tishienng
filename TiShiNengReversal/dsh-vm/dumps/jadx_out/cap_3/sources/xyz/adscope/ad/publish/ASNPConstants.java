package xyz.adscope.ad.publish;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class ASNPConstants {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CountryType {
        public static final int COUNTRY_TYPE_CHINA_MAINLAND = 1;
        public static final int COUNTRY_TYPE_OTHER = 0;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CurrencyType {
        public static final java.lang.String CURRENCY_TYPE_CNY = "CNY";
        public static final java.lang.String CURRENCY_TYPE_EUR = "EUR";
        public static final java.lang.String CURRENCY_TYPE_GBP = "GBP";
        public static final java.lang.String CURRENCY_TYPE_IDR = "IDR";
        public static final java.lang.String CURRENCY_TYPE_JPY = "JPY";
        public static final java.lang.String CURRENCY_TYPE_KRW = "THB";
        public static final java.lang.String CURRENCY_TYPE_MYR = "MYR";
        public static final java.lang.String CURRENCY_TYPE_PHP = "PHP";
        public static final java.lang.String CURRENCY_TYPE_USD = "USD";
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface TestType {
        public static final int TEST_FORMAL_MODEL = 0;
        public static final int TEST_NO_PRICE_MODEL = 1;
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum UiModel extends java.lang.Enum<xyz.adscope.ad.publish.ASNPConstants.UiModel> {
        public static final xyz.adscope.ad.publish.ASNPConstants.UiModel UI_MODEL_AUTO = null;
        public static final xyz.adscope.ad.publish.ASNPConstants.UiModel UI_MODEL_DARK = null;
        public static final xyz.adscope.ad.publish.ASNPConstants.UiModel UI_MODEL_LIGHT = null;
        private static final /* synthetic */ xyz.adscope.ad.publish.ASNPConstants.UiModel[] a = null;

        static {
                xyz.adscope.ad.publish.ASNPConstants$UiModel r0 = new xyz.adscope.ad.publish.ASNPConstants$UiModel
                java.lang.String r1 = "UI_MODEL_AUTO"
                r2 = 0
                r0.<init>(r1, r2)
                xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_AUTO = r0
                xyz.adscope.ad.publish.ASNPConstants$UiModel r0 = new xyz.adscope.ad.publish.ASNPConstants$UiModel
                java.lang.String r1 = "UI_MODEL_DARK"
                r2 = 1
                r0.<init>(r1, r2)
                xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_DARK = r0
                xyz.adscope.ad.publish.ASNPConstants$UiModel r0 = new xyz.adscope.ad.publish.ASNPConstants$UiModel
                java.lang.String r1 = "UI_MODEL_LIGHT"
                r2 = 2
                r0.<init>(r1, r2)
                xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_LIGHT = r0
                xyz.adscope.ad.publish.ASNPConstants$UiModel[] r0 = a()
                xyz.adscope.ad.publish.ASNPConstants.UiModel.a = r0
                return
        }

        UiModel(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        private static /* synthetic */ xyz.adscope.ad.publish.ASNPConstants.UiModel[] a() {
                r0 = 3
                xyz.adscope.ad.publish.ASNPConstants$UiModel[] r0 = new xyz.adscope.ad.publish.ASNPConstants.UiModel[r0]
                xyz.adscope.ad.publish.ASNPConstants$UiModel r1 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_AUTO
                r2 = 0
                r0[r2] = r1
                xyz.adscope.ad.publish.ASNPConstants$UiModel r1 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_DARK
                r2 = 1
                r0[r2] = r1
                xyz.adscope.ad.publish.ASNPConstants$UiModel r1 = xyz.adscope.ad.publish.ASNPConstants.UiModel.UI_MODEL_LIGHT
                r2 = 2
                r0[r2] = r1
                return r0
        }

        public static xyz.adscope.ad.publish.ASNPConstants.UiModel valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.ad.publish.ASNPConstants$UiModel> r0 = xyz.adscope.ad.publish.ASNPConstants.UiModel.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.ad.publish.ASNPConstants$UiModel r1 = (xyz.adscope.ad.publish.ASNPConstants.UiModel) r1
                return r1
        }

        public static xyz.adscope.ad.publish.ASNPConstants.UiModel[] values() {
                xyz.adscope.ad.publish.ASNPConstants$UiModel[] r0 = xyz.adscope.ad.publish.ASNPConstants.UiModel.a
                java.lang.Object r0 = r0.clone()
                xyz.adscope.ad.publish.ASNPConstants$UiModel[] r0 = (xyz.adscope.ad.publish.ASNPConstants.UiModel[]) r0
                return r0
        }
    }

    public ASNPConstants() {
            r0 = this;
            r0.<init>()
            return
    }
}

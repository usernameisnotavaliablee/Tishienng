package xyz.adscope.amps.tool.test;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class TestAMPS {
    public TestAMPS() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void ampsEntry() {
            java.lang.String r0 = "{\"device\":{\"type\":\"100\", \"name\":\"M2004J7AC\", \"said\":\"f8cce1b65b4046fd9fcf58eab8d459b5\", \"os\":\"2\", \"country\":\"CN\", \"zone\":\"GMT+08:00\", \"lang\":\"zh\", \"lmt\":\"0\", \"contype\":\"1\", \"carrier\":\"UNKNOW\", \"osv\":\"10\", \"idfa\":\"null\", \"oaid\":\"\", \"gaid\":\"\", \"model\":\"null\", \"w\":\"393\", \"h\":\"800\", \"make\":\"M2004J7AC\", \"brand\":\"Redmi\", \"bootMark\":\"5514e651-ce54-4b06-840d-7ba69f02dbee\", \"cidfa\":\"null\", \"coaid\":\"\", \"cgaid\":\"\", \"updateMark\":\"1262305837.140000000\", \"fileMark\":\"1609769817000\", \"sysUpdateMark\":\"\", \"harddiskSize\":\"50676314112\", \"physicalMemory\":\"5652197376\", \"hwModel\":\"null\", \"ext\":\"null\"}, \"app\":{\"appId\":123, \"name\":\"null\", \"bundleid\":\"com.example.adscopesdk\", \"version\":\"1.0\", \"install\":\"1682663507999\", \"update\":\"1683167868801\", \"ext\":\"null\"}, \"user\":{\"id\":\"null\", \"customData\":\"\", \"ext\":\"null\"}, \"ext\":\"null\", \"time\":null, \"sdk\":{\"version\":\"5.0.0.0\", \"sdkArray\":null, \"ext\":\"null\"}}"
            java.lang.String r0 = xyz.adscope.amps.tool.AMPSSecurityUtil.compressEncrypt(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "encrypt : "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "common_log"
            xyz.adscope.common.tool.LogUtil.i(r2, r1)
            java.lang.String r0 = xyz.adscope.amps.tool.AMPSSecurityUtil.decryptUncompress(r0)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "convertStr : "
            r1.append(r3)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            xyz.adscope.common.tool.LogUtil.i(r2, r0)
            return
    }
}

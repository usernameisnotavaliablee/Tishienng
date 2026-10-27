package xyz.adscope.common.v2.beta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IBetaTest {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface CheckFrequency {
        public static final int CHECK_FREQUENCY_INIT = 8;
        public static final int CHECK_FREQUENCY_REALTIME = 9;
    }

    void initBetaConfig(xyz.adscope.common.v2.beta.IBetaTestConfig r1);

    boolean invokeBetaTest(java.lang.String r1, java.lang.String r2, int r3);
}

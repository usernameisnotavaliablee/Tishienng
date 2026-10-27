package xyz.adscope.common.v2.beta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
class BetaTestImpl implements xyz.adscope.common.v2.beta.IBetaTest {
    private final java.util.Map<java.lang.String, xyz.adscope.common.v2.beta.BetaTestImpl.BetaTestRandomProbability> probabilityMap;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.beta.BetaTestImpl$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class BetaTestRandomProbability {
        private java.lang.Boolean hasCheckInvoke;
        private final xyz.adscope.common.v2.beta.IBetaTestConfig mConfig;

        private BetaTestRandomProbability(xyz.adscope.common.v2.beta.IBetaTestConfig r2) {
                r1 = this;
                r1.<init>()
                r0 = 0
                r1.hasCheckInvoke = r0
                r1.mConfig = r2
                return
        }

        /* synthetic */ BetaTestRandomProbability(xyz.adscope.common.v2.beta.IBetaTestConfig r1, xyz.adscope.common.v2.beta.BetaTestImpl.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ boolean access$100(xyz.adscope.common.v2.beta.BetaTestImpl.BetaTestRandomProbability r0, int r1) {
                boolean r0 = r0.invokeBetaTest(r1)
                return r0
        }

        private boolean checkInvokeRealTime() {
                r13 = this;
                xyz.adscope.common.v2.beta.IBetaTestConfig r0 = r13.mConfig
                r1 = 0
                if (r0 == 0) goto L43
                int r0 = r0.getRandomProbability()
                boolean r0 = xyz.adscope.common.v2.tool.roll.RandomProbability.roll(r0)
                if (r0 == 0) goto L43
                long r2 = java.lang.System.currentTimeMillis()
                xyz.adscope.common.v2.beta.IBetaTestConfig r0 = r13.mConfig
                long r4 = r0.getStartTimestamp()
                xyz.adscope.common.v2.beta.IBetaTestConfig r0 = r13.mConfig
                long r6 = r0.getEndTimestamp()
                xyz.adscope.common.v2.beta.IBetaTestConfig r0 = r13.mConfig
                long r8 = r0.getDurationMillisecond()
                r0 = 1
                r10 = 0
                int r12 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
                if (r12 <= 0) goto L39
                int r12 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
                if (r12 <= 0) goto L39
                int r10 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r10 < 0) goto L39
                int r10 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
                if (r10 > 0) goto L39
                return r0
            L39:
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 < 0) goto L43
                long r4 = r4 + r8
                int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r6 > 0) goto L43
                return r0
            L43:
                return r1
        }

        private boolean invokeBetaTest(int r2) {
                r1 = this;
                r0 = 9
                if (r2 != r0) goto L9
                boolean r2 = r1.checkInvokeRealTime()
                return r2
            L9:
                r0 = 8
                if (r2 != r0) goto L22
                java.lang.Boolean r2 = r1.hasCheckInvoke
                if (r2 != 0) goto L1b
                boolean r2 = r1.checkInvokeRealTime()
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
                r1.hasCheckInvoke = r2
            L1b:
                java.lang.Boolean r2 = r1.hasCheckInvoke
                boolean r2 = r2.booleanValue()
                return r2
            L22:
                r2 = 0
                return r2
        }
    }

    BetaTestImpl() {
            r1 = this;
            r1.<init>()
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.probabilityMap = r0
            return
    }

    @Override // xyz.adscope.common.v2.beta.IBetaTest
    public void initBetaConfig(xyz.adscope.common.v2.beta.IBetaTestConfig r5) {
            r4 = this;
            if (r5 == 0) goto L29
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r5.getBetaTestPlanID()
            r0.append(r1)
            java.lang.String r1 = "_"
            r0.append(r1)
            java.lang.String r1 = r5.getSDKBizID()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.util.Map<java.lang.String, xyz.adscope.common.v2.beta.BetaTestImpl$BetaTestRandomProbability> r1 = r4.probabilityMap
            xyz.adscope.common.v2.beta.BetaTestImpl$BetaTestRandomProbability r2 = new xyz.adscope.common.v2.beta.BetaTestImpl$BetaTestRandomProbability
            r3 = 0
            r2.<init>(r5, r3)
            r1.put(r0, r2)
        L29:
            return
    }

    @Override // xyz.adscope.common.v2.beta.IBetaTest
    public boolean invokeBetaTest(java.lang.String r2, java.lang.String r3, int r4) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = "_"
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            java.util.Map<java.lang.String, xyz.adscope.common.v2.beta.BetaTestImpl$BetaTestRandomProbability> r3 = r1.probabilityMap
            boolean r3 = r3.containsKey(r2)
            if (r3 == 0) goto L2b
            java.util.Map<java.lang.String, xyz.adscope.common.v2.beta.BetaTestImpl$BetaTestRandomProbability> r3 = r1.probabilityMap
            java.lang.Object r2 = r3.get(r2)
            xyz.adscope.common.v2.beta.BetaTestImpl$BetaTestRandomProbability r2 = (xyz.adscope.common.v2.beta.BetaTestImpl.BetaTestRandomProbability) r2
            if (r2 == 0) goto L2b
            boolean r2 = xyz.adscope.common.v2.beta.BetaTestImpl.BetaTestRandomProbability.access$100(r2, r4)
            return r2
        L2b:
            r2 = 0
            return r2
    }
}

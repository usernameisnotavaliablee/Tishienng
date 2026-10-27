package com.umeng.commonsdk.framework;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface UMLogDataProtocol {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum UMBusinessType extends java.lang.Enum<com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType> {
        private static final /* synthetic */ com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType[] $VALUES = null;
        public static final com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType U_APP = null;
        public static final com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType U_INTERNAL = null;
        public static final com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType U_Silent = null;
        public static final com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType U_ZeroEnv = null;

        static {
                com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r0 = new com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType
                java.lang.String r1 = "U_APP"
                r2 = 0
                r0.<init>(r1, r2)
                com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_APP = r0
                com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r1 = new com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType
                java.lang.String r3 = "U_INTERNAL"
                r4 = 1
                r1.<init>(r3, r4)
                com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_INTERNAL = r1
                com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r3 = new com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType
                java.lang.String r5 = "U_ZeroEnv"
                r6 = 2
                r3.<init>(r5, r6)
                com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_ZeroEnv = r3
                com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r5 = new com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType
                java.lang.String r7 = "U_Silent"
                r8 = 3
                r5.<init>(r7, r8)
                com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.U_Silent = r5
                r7 = 4
                com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType[] r7 = new com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.$VALUES = r7
                return
        }

        UMBusinessType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType valueOf(java.lang.String r1) {
                java.lang.Class<com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType> r0 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType r1 = (com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType) r1
                return r1
        }

        public static com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType[] values() {
                com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType[] r0 = com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.umeng.commonsdk.framework.UMLogDataProtocol$UMBusinessType[] r0 = (com.umeng.commonsdk.framework.UMLogDataProtocol.UMBusinessType[]) r0
                return r0
        }
    }

    void removeCacheData(java.lang.Object r1);

    org.json.JSONObject setupReportData(long r1);

    void workEvent(java.lang.Object r1, int r2);
}

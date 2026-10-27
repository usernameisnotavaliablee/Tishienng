package com.tencent.mmkv;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum MMKVRecoverStrategic extends java.lang.Enum<com.tencent.mmkv.MMKVRecoverStrategic> {
    private static final /* synthetic */ com.tencent.mmkv.MMKVRecoverStrategic[] $VALUES = null;
    public static final com.tencent.mmkv.MMKVRecoverStrategic OnErrorDiscard = null;
    public static final com.tencent.mmkv.MMKVRecoverStrategic OnErrorRecover = null;

    static {
            com.tencent.mmkv.MMKVRecoverStrategic r0 = new com.tencent.mmkv.MMKVRecoverStrategic
            java.lang.String r1 = "OnErrorDiscard"
            r2 = 0
            r0.<init>(r1, r2)
            com.tencent.mmkv.MMKVRecoverStrategic.OnErrorDiscard = r0
            com.tencent.mmkv.MMKVRecoverStrategic r1 = new com.tencent.mmkv.MMKVRecoverStrategic
            java.lang.String r3 = "OnErrorRecover"
            r4 = 1
            r1.<init>(r3, r4)
            com.tencent.mmkv.MMKVRecoverStrategic.OnErrorRecover = r1
            r3 = 2
            com.tencent.mmkv.MMKVRecoverStrategic[] r3 = new com.tencent.mmkv.MMKVRecoverStrategic[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.tencent.mmkv.MMKVRecoverStrategic.$VALUES = r3
            return
    }

    MMKVRecoverStrategic(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.tencent.mmkv.MMKVRecoverStrategic valueOf(java.lang.String r1) {
            java.lang.Class<com.tencent.mmkv.MMKVRecoverStrategic> r0 = com.tencent.mmkv.MMKVRecoverStrategic.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.tencent.mmkv.MMKVRecoverStrategic r1 = (com.tencent.mmkv.MMKVRecoverStrategic) r1
            return r1
    }

    public static com.tencent.mmkv.MMKVRecoverStrategic[] values() {
            com.tencent.mmkv.MMKVRecoverStrategic[] r0 = com.tencent.mmkv.MMKVRecoverStrategic.$VALUES
            java.lang.Object r0 = r0.clone()
            com.tencent.mmkv.MMKVRecoverStrategic[] r0 = (com.tencent.mmkv.MMKVRecoverStrategic[]) r0
            return r0
    }
}

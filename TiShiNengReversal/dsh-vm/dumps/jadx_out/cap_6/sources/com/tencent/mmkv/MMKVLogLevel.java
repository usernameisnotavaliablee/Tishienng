package com.tencent.mmkv;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum MMKVLogLevel extends java.lang.Enum<com.tencent.mmkv.MMKVLogLevel> {
    private static final /* synthetic */ com.tencent.mmkv.MMKVLogLevel[] $VALUES = null;
    public static final com.tencent.mmkv.MMKVLogLevel LevelDebug = null;
    public static final com.tencent.mmkv.MMKVLogLevel LevelError = null;
    public static final com.tencent.mmkv.MMKVLogLevel LevelInfo = null;
    public static final com.tencent.mmkv.MMKVLogLevel LevelNone = null;
    public static final com.tencent.mmkv.MMKVLogLevel LevelWarning = null;

    static {
            com.tencent.mmkv.MMKVLogLevel r0 = new com.tencent.mmkv.MMKVLogLevel
            java.lang.String r1 = "LevelDebug"
            r2 = 0
            r0.<init>(r1, r2)
            com.tencent.mmkv.MMKVLogLevel.LevelDebug = r0
            com.tencent.mmkv.MMKVLogLevel r1 = new com.tencent.mmkv.MMKVLogLevel
            java.lang.String r3 = "LevelInfo"
            r4 = 1
            r1.<init>(r3, r4)
            com.tencent.mmkv.MMKVLogLevel.LevelInfo = r1
            com.tencent.mmkv.MMKVLogLevel r3 = new com.tencent.mmkv.MMKVLogLevel
            java.lang.String r5 = "LevelWarning"
            r6 = 2
            r3.<init>(r5, r6)
            com.tencent.mmkv.MMKVLogLevel.LevelWarning = r3
            com.tencent.mmkv.MMKVLogLevel r5 = new com.tencent.mmkv.MMKVLogLevel
            java.lang.String r7 = "LevelError"
            r8 = 3
            r5.<init>(r7, r8)
            com.tencent.mmkv.MMKVLogLevel.LevelError = r5
            com.tencent.mmkv.MMKVLogLevel r7 = new com.tencent.mmkv.MMKVLogLevel
            java.lang.String r9 = "LevelNone"
            r10 = 4
            r7.<init>(r9, r10)
            com.tencent.mmkv.MMKVLogLevel.LevelNone = r7
            r9 = 5
            com.tencent.mmkv.MMKVLogLevel[] r9 = new com.tencent.mmkv.MMKVLogLevel[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            com.tencent.mmkv.MMKVLogLevel.$VALUES = r9
            return
    }

    MMKVLogLevel(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.tencent.mmkv.MMKVLogLevel valueOf(java.lang.String r1) {
            java.lang.Class<com.tencent.mmkv.MMKVLogLevel> r0 = com.tencent.mmkv.MMKVLogLevel.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.tencent.mmkv.MMKVLogLevel r1 = (com.tencent.mmkv.MMKVLogLevel) r1
            return r1
    }

    public static com.tencent.mmkv.MMKVLogLevel[] values() {
            com.tencent.mmkv.MMKVLogLevel[] r0 = com.tencent.mmkv.MMKVLogLevel.$VALUES
            java.lang.Object r0 = r0.clone()
            com.tencent.mmkv.MMKVLogLevel[] r0 = (com.tencent.mmkv.MMKVLogLevel[]) r0
            return r0
    }
}

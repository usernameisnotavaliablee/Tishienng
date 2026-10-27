package com.clj.fastble.data;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public enum BleScanState extends java.lang.Enum<com.clj.fastble.data.BleScanState> {
    private static final /* synthetic */ com.clj.fastble.data.BleScanState[] $VALUES = null;
    public static final com.clj.fastble.data.BleScanState STATE_IDLE = null;
    public static final com.clj.fastble.data.BleScanState STATE_SCANNING = null;
    private int code;

    static {
            com.clj.fastble.data.BleScanState r0 = new com.clj.fastble.data.BleScanState
            r1 = -1
            java.lang.String r2 = "STATE_IDLE"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.clj.fastble.data.BleScanState.STATE_IDLE = r0
            com.clj.fastble.data.BleScanState r1 = new com.clj.fastble.data.BleScanState
            java.lang.String r2 = "STATE_SCANNING"
            r4 = 1
            r1.<init>(r2, r4, r4)
            com.clj.fastble.data.BleScanState.STATE_SCANNING = r1
            r2 = 2
            com.clj.fastble.data.BleScanState[] r2 = new com.clj.fastble.data.BleScanState[r2]
            r2[r3] = r0
            r2[r4] = r1
            com.clj.fastble.data.BleScanState.$VALUES = r2
            return
    }

    BleScanState(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.code = r3
            return
    }

    public static com.clj.fastble.data.BleScanState valueOf(java.lang.String r1) {
            java.lang.Class<com.clj.fastble.data.BleScanState> r0 = com.clj.fastble.data.BleScanState.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.clj.fastble.data.BleScanState r1 = (com.clj.fastble.data.BleScanState) r1
            return r1
    }

    public static com.clj.fastble.data.BleScanState[] values() {
            com.clj.fastble.data.BleScanState[] r0 = com.clj.fastble.data.BleScanState.$VALUES
            java.lang.Object r0 = r0.clone()
            com.clj.fastble.data.BleScanState[] r0 = (com.clj.fastble.data.BleScanState[]) r0
            return r0
    }

    public int getCode() {
            r1 = this;
            int r0 = r1.code
            return r0
    }
}

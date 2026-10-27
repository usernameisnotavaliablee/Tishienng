package com.bytedance.android.metrics;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum ActionType extends java.lang.Enum<com.bytedance.android.metrics.ActionType> {
    private static final /* synthetic */ com.bytedance.android.metrics.ActionType[] $VALUES = null;
    public static final com.bytedance.android.metrics.ActionType CLICK = null;
    public static final com.bytedance.android.metrics.ActionType DRAW = null;

    static {
            com.bytedance.android.metrics.ActionType r0 = new com.bytedance.android.metrics.ActionType
            java.lang.String r1 = "CLICK"
            r2 = 0
            r0.<init>(r1, r2)
            com.bytedance.android.metrics.ActionType.CLICK = r0
            com.bytedance.android.metrics.ActionType r1 = new com.bytedance.android.metrics.ActionType
            java.lang.String r3 = "DRAW"
            r4 = 1
            r1.<init>(r3, r4)
            com.bytedance.android.metrics.ActionType.DRAW = r1
            r3 = 2
            com.bytedance.android.metrics.ActionType[] r3 = new com.bytedance.android.metrics.ActionType[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.bytedance.android.metrics.ActionType.$VALUES = r3
            return
    }

    ActionType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bytedance.android.metrics.ActionType valueOf(java.lang.String r1) {
            java.lang.Class<com.bytedance.android.metrics.ActionType> r0 = com.bytedance.android.metrics.ActionType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bytedance.android.metrics.ActionType r1 = (com.bytedance.android.metrics.ActionType) r1
            return r1
    }

    public static com.bytedance.android.metrics.ActionType[] values() {
            com.bytedance.android.metrics.ActionType[] r0 = com.bytedance.android.metrics.ActionType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bytedance.android.metrics.ActionType[] r0 = (com.bytedance.android.metrics.ActionType[]) r0
            return r0
    }

    public java.lang.String lowerName() {
            r1 = this;
            java.lang.String r0 = r1.name()
            java.lang.String r0 = r0.toLowerCase()
            return r0
    }
}

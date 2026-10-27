package com.bytedance.android.metrics;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum EnterFromMerge extends java.lang.Enum<com.bytedance.android.metrics.EnterFromMerge> {
    private static final /* synthetic */ com.bytedance.android.metrics.EnterFromMerge[] $VALUES = null;
    public static final com.bytedance.android.metrics.EnterFromMerge AD_UNION_DRAW = null;
    public static final com.bytedance.android.metrics.EnterFromMerge AD_UNION_EXCITATION = null;
    public static final com.bytedance.android.metrics.EnterFromMerge AD_UNION_FEED = null;
    public static final com.bytedance.android.metrics.EnterFromMerge AD_UNION_INSERT = null;
    public static final com.bytedance.android.metrics.EnterFromMerge NO_VALUE = null;

    static {
            com.bytedance.android.metrics.EnterFromMerge r0 = new com.bytedance.android.metrics.EnterFromMerge
            java.lang.String r1 = "NO_VALUE"
            r2 = 0
            r0.<init>(r1, r2)
            com.bytedance.android.metrics.EnterFromMerge.NO_VALUE = r0
            com.bytedance.android.metrics.EnterFromMerge r1 = new com.bytedance.android.metrics.EnterFromMerge
            java.lang.String r3 = "AD_UNION_EXCITATION"
            r4 = 1
            r1.<init>(r3, r4)
            com.bytedance.android.metrics.EnterFromMerge.AD_UNION_EXCITATION = r1
            com.bytedance.android.metrics.EnterFromMerge r3 = new com.bytedance.android.metrics.EnterFromMerge
            java.lang.String r5 = "AD_UNION_INSERT"
            r6 = 2
            r3.<init>(r5, r6)
            com.bytedance.android.metrics.EnterFromMerge.AD_UNION_INSERT = r3
            com.bytedance.android.metrics.EnterFromMerge r5 = new com.bytedance.android.metrics.EnterFromMerge
            java.lang.String r7 = "AD_UNION_FEED"
            r8 = 3
            r5.<init>(r7, r8)
            com.bytedance.android.metrics.EnterFromMerge.AD_UNION_FEED = r5
            com.bytedance.android.metrics.EnterFromMerge r7 = new com.bytedance.android.metrics.EnterFromMerge
            java.lang.String r9 = "AD_UNION_DRAW"
            r10 = 4
            r7.<init>(r9, r10)
            com.bytedance.android.metrics.EnterFromMerge.AD_UNION_DRAW = r7
            r9 = 5
            com.bytedance.android.metrics.EnterFromMerge[] r9 = new com.bytedance.android.metrics.EnterFromMerge[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            com.bytedance.android.metrics.EnterFromMerge.$VALUES = r9
            return
    }

    EnterFromMerge(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.bytedance.android.metrics.EnterFromMerge valueOf(java.lang.String r1) {
            java.lang.Class<com.bytedance.android.metrics.EnterFromMerge> r0 = com.bytedance.android.metrics.EnterFromMerge.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bytedance.android.metrics.EnterFromMerge r1 = (com.bytedance.android.metrics.EnterFromMerge) r1
            return r1
    }

    public static com.bytedance.android.metrics.EnterFromMerge[] values() {
            com.bytedance.android.metrics.EnterFromMerge[] r0 = com.bytedance.android.metrics.EnterFromMerge.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bytedance.android.metrics.EnterFromMerge[] r0 = (com.bytedance.android.metrics.EnterFromMerge[]) r0
            return r0
    }

    public java.lang.String lowerName() {
            r1 = this;
            java.lang.String r0 = r1.name()
            java.lang.String r0 = r0.toLowerCase()
            return r0
    }
}

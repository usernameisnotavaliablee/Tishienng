package com.bumptech.glide;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public enum MemoryCategory extends java.lang.Enum<com.bumptech.glide.MemoryCategory> {
    private static final /* synthetic */ com.bumptech.glide.MemoryCategory[] $VALUES = null;
    public static final com.bumptech.glide.MemoryCategory HIGH = null;
    public static final com.bumptech.glide.MemoryCategory LOW = null;
    public static final com.bumptech.glide.MemoryCategory NORMAL = null;
    private final float multiplier;

    static {
            com.bumptech.glide.MemoryCategory r0 = new com.bumptech.glide.MemoryCategory
            r1 = 1056964608(0x3f000000, float:0.5)
            java.lang.String r2 = "LOW"
            r3 = 0
            r0.<init>(r2, r3, r1)
            com.bumptech.glide.MemoryCategory.LOW = r0
            com.bumptech.glide.MemoryCategory r1 = new com.bumptech.glide.MemoryCategory
            r2 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r4 = "NORMAL"
            r5 = 1
            r1.<init>(r4, r5, r2)
            com.bumptech.glide.MemoryCategory.NORMAL = r1
            com.bumptech.glide.MemoryCategory r2 = new com.bumptech.glide.MemoryCategory
            r4 = 1069547520(0x3fc00000, float:1.5)
            java.lang.String r6 = "HIGH"
            r7 = 2
            r2.<init>(r6, r7, r4)
            com.bumptech.glide.MemoryCategory.HIGH = r2
            r4 = 3
            com.bumptech.glide.MemoryCategory[] r4 = new com.bumptech.glide.MemoryCategory[r4]
            r4[r3] = r0
            r4[r5] = r1
            r4[r7] = r2
            com.bumptech.glide.MemoryCategory.$VALUES = r4
            return
    }

    MemoryCategory(java.lang.String r1, int r2, float r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.multiplier = r3
            return
    }

    public static com.bumptech.glide.MemoryCategory valueOf(java.lang.String r1) {
            java.lang.Class<com.bumptech.glide.MemoryCategory> r0 = com.bumptech.glide.MemoryCategory.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.bumptech.glide.MemoryCategory r1 = (com.bumptech.glide.MemoryCategory) r1
            return r1
    }

    public static com.bumptech.glide.MemoryCategory[] values() {
            com.bumptech.glide.MemoryCategory[] r0 = com.bumptech.glide.MemoryCategory.$VALUES
            java.lang.Object r0 = r0.clone()
            com.bumptech.glide.MemoryCategory[] r0 = (com.bumptech.glide.MemoryCategory[]) r0
            return r0
    }

    public float getMultiplier() {
            r1 = this;
            float r0 = r1.multiplier
            return r0
    }
}

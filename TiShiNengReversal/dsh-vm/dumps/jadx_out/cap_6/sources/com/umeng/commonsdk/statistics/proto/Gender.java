package com.umeng.commonsdk.statistics.proto;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum Gender extends java.lang.Enum<com.umeng.commonsdk.statistics.proto.Gender> implements com.umeng.analytics.pro.bv {
    private static final /* synthetic */ com.umeng.commonsdk.statistics.proto.Gender[] $VALUES = null;
    public static final com.umeng.commonsdk.statistics.proto.Gender FEMALE = null;
    public static final com.umeng.commonsdk.statistics.proto.Gender MALE = null;
    public static final com.umeng.commonsdk.statistics.proto.Gender UNKNOWN = null;
    private final int value;

    static {
            com.umeng.commonsdk.statistics.proto.Gender r0 = new com.umeng.commonsdk.statistics.proto.Gender
            java.lang.String r1 = "MALE"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.umeng.commonsdk.statistics.proto.Gender.MALE = r0
            com.umeng.commonsdk.statistics.proto.Gender r1 = new com.umeng.commonsdk.statistics.proto.Gender
            java.lang.String r3 = "FEMALE"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.umeng.commonsdk.statistics.proto.Gender.FEMALE = r1
            com.umeng.commonsdk.statistics.proto.Gender r3 = new com.umeng.commonsdk.statistics.proto.Gender
            java.lang.String r5 = "UNKNOWN"
            r6 = 2
            r3.<init>(r5, r6, r6)
            com.umeng.commonsdk.statistics.proto.Gender.UNKNOWN = r3
            r5 = 3
            com.umeng.commonsdk.statistics.proto.Gender[] r5 = new com.umeng.commonsdk.statistics.proto.Gender[r5]
            r5[r2] = r0
            r5[r4] = r1
            r5[r6] = r3
            com.umeng.commonsdk.statistics.proto.Gender.$VALUES = r5
            return
    }

    Gender(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static com.umeng.commonsdk.statistics.proto.Gender findByValue(int r1) {
            if (r1 == 0) goto L10
            r0 = 1
            if (r1 == r0) goto Ld
            r0 = 2
            if (r1 == r0) goto La
            r1 = 0
            return r1
        La:
            com.umeng.commonsdk.statistics.proto.Gender r1 = com.umeng.commonsdk.statistics.proto.Gender.UNKNOWN
            return r1
        Ld:
            com.umeng.commonsdk.statistics.proto.Gender r1 = com.umeng.commonsdk.statistics.proto.Gender.FEMALE
            return r1
        L10:
            com.umeng.commonsdk.statistics.proto.Gender r1 = com.umeng.commonsdk.statistics.proto.Gender.MALE
            return r1
    }

    public static com.umeng.commonsdk.statistics.proto.Gender valueOf(java.lang.String r1) {
            java.lang.Class<com.umeng.commonsdk.statistics.proto.Gender> r0 = com.umeng.commonsdk.statistics.proto.Gender.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.umeng.commonsdk.statistics.proto.Gender r1 = (com.umeng.commonsdk.statistics.proto.Gender) r1
            return r1
    }

    public static com.umeng.commonsdk.statistics.proto.Gender[] values() {
            com.umeng.commonsdk.statistics.proto.Gender[] r0 = com.umeng.commonsdk.statistics.proto.Gender.$VALUES
            java.lang.Object r0 = r0.clone()
            com.umeng.commonsdk.statistics.proto.Gender[] r0 = (com.umeng.commonsdk.statistics.proto.Gender[]) r0
            return r0
    }

    @Override // com.umeng.analytics.pro.bv
    public int getValue() {
            r1 = this;
            int r0 = r1.value
            return r0
    }
}

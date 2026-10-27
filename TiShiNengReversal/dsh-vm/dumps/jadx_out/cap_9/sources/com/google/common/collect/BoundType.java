package com.google.common.collect;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum BoundType extends java.lang.Enum<com.google.common.collect.BoundType> {
    private static final /* synthetic */ com.google.common.collect.BoundType[] $VALUES = null;
    public static final com.google.common.collect.BoundType CLOSED = null;
    public static final com.google.common.collect.BoundType OPEN = null;
    final boolean inclusive;

    static {
            com.google.common.collect.BoundType r0 = new com.google.common.collect.BoundType
            java.lang.String r1 = "OPEN"
            r2 = 0
            r0.<init>(r1, r2, r2)
            com.google.common.collect.BoundType.OPEN = r0
            com.google.common.collect.BoundType r1 = new com.google.common.collect.BoundType
            java.lang.String r3 = "CLOSED"
            r4 = 1
            r1.<init>(r3, r4, r4)
            com.google.common.collect.BoundType.CLOSED = r1
            r3 = 2
            com.google.common.collect.BoundType[] r3 = new com.google.common.collect.BoundType[r3]
            r3[r2] = r0
            r3[r4] = r1
            com.google.common.collect.BoundType.$VALUES = r3
            return
    }

    BoundType(java.lang.String r1, int r2, boolean r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.inclusive = r3
            return
    }

    static com.google.common.collect.BoundType forBoolean(boolean r0) {
            if (r0 == 0) goto L5
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.CLOSED
            return r0
        L5:
            com.google.common.collect.BoundType r0 = com.google.common.collect.BoundType.OPEN
            return r0
    }

    public static com.google.common.collect.BoundType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.collect.BoundType> r0 = com.google.common.collect.BoundType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.collect.BoundType r1 = (com.google.common.collect.BoundType) r1
            return r1
    }

    public static com.google.common.collect.BoundType[] values() {
            com.google.common.collect.BoundType[] r0 = com.google.common.collect.BoundType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.collect.BoundType[] r0 = (com.google.common.collect.BoundType[]) r0
            return r0
    }

    com.google.common.collect.BoundType flip() {
            r1 = this;
            boolean r0 = r1.inclusive
            r0 = r0 ^ 1
            com.google.common.collect.BoundType r0 = forBoolean(r0)
            return r0
    }
}

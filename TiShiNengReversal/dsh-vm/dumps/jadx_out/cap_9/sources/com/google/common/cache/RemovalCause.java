package com.google.common.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum RemovalCause extends java.lang.Enum<com.google.common.cache.RemovalCause> {
    private static final /* synthetic */ com.google.common.cache.RemovalCause[] $VALUES = null;
    public static final com.google.common.cache.RemovalCause COLLECTED = null;
    public static final com.google.common.cache.RemovalCause EXPIRED = null;
    public static final com.google.common.cache.RemovalCause EXPLICIT = null;
    public static final com.google.common.cache.RemovalCause REPLACED = null;
    public static final com.google.common.cache.RemovalCause SIZE = null;






    static {
            com.google.common.cache.RemovalCause$1 r0 = new com.google.common.cache.RemovalCause$1
            java.lang.String r1 = "EXPLICIT"
            r2 = 0
            r0.<init>(r1, r2)
            com.google.common.cache.RemovalCause.EXPLICIT = r0
            com.google.common.cache.RemovalCause$2 r1 = new com.google.common.cache.RemovalCause$2
            java.lang.String r3 = "REPLACED"
            r4 = 1
            r1.<init>(r3, r4)
            com.google.common.cache.RemovalCause.REPLACED = r1
            com.google.common.cache.RemovalCause$3 r3 = new com.google.common.cache.RemovalCause$3
            java.lang.String r5 = "COLLECTED"
            r6 = 2
            r3.<init>(r5, r6)
            com.google.common.cache.RemovalCause.COLLECTED = r3
            com.google.common.cache.RemovalCause$4 r5 = new com.google.common.cache.RemovalCause$4
            java.lang.String r7 = "EXPIRED"
            r8 = 3
            r5.<init>(r7, r8)
            com.google.common.cache.RemovalCause.EXPIRED = r5
            com.google.common.cache.RemovalCause$5 r7 = new com.google.common.cache.RemovalCause$5
            java.lang.String r9 = "SIZE"
            r10 = 4
            r7.<init>(r9, r10)
            com.google.common.cache.RemovalCause.SIZE = r7
            r9 = 5
            com.google.common.cache.RemovalCause[] r9 = new com.google.common.cache.RemovalCause[r9]
            r9[r2] = r0
            r9[r4] = r1
            r9[r6] = r3
            r9[r8] = r5
            r9[r10] = r7
            com.google.common.cache.RemovalCause.$VALUES = r9
            return
    }

    RemovalCause(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ RemovalCause(java.lang.String r1, int r2, com.google.common.cache.RemovalCause.AnonymousClass1 r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.google.common.cache.RemovalCause valueOf(java.lang.String r1) {
            java.lang.Class<com.google.common.cache.RemovalCause> r0 = com.google.common.cache.RemovalCause.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.common.cache.RemovalCause r1 = (com.google.common.cache.RemovalCause) r1
            return r1
    }

    public static com.google.common.cache.RemovalCause[] values() {
            com.google.common.cache.RemovalCause[] r0 = com.google.common.cache.RemovalCause.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.common.cache.RemovalCause[] r0 = (com.google.common.cache.RemovalCause[]) r0
            return r0
    }

    abstract boolean wasEvicted();
}

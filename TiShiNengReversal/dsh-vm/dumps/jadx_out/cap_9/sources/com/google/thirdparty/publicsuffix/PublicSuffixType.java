package com.google.thirdparty.publicsuffix;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtCompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public enum PublicSuffixType extends java.lang.Enum<com.google.thirdparty.publicsuffix.PublicSuffixType> {
    private static final /* synthetic */ com.google.thirdparty.publicsuffix.PublicSuffixType[] $VALUES = null;
    public static final com.google.thirdparty.publicsuffix.PublicSuffixType PRIVATE = null;
    public static final com.google.thirdparty.publicsuffix.PublicSuffixType REGISTRY = null;
    private final char innerNodeCode;
    private final char leafNodeCode;

    static {
            com.google.thirdparty.publicsuffix.PublicSuffixType r0 = new com.google.thirdparty.publicsuffix.PublicSuffixType
            r1 = 58
            r2 = 44
            java.lang.String r3 = "PRIVATE"
            r4 = 0
            r0.<init>(r3, r4, r1, r2)
            com.google.thirdparty.publicsuffix.PublicSuffixType.PRIVATE = r0
            com.google.thirdparty.publicsuffix.PublicSuffixType r1 = new com.google.thirdparty.publicsuffix.PublicSuffixType
            r2 = 33
            r3 = 63
            java.lang.String r5 = "REGISTRY"
            r6 = 1
            r1.<init>(r5, r6, r2, r3)
            com.google.thirdparty.publicsuffix.PublicSuffixType.REGISTRY = r1
            r2 = 2
            com.google.thirdparty.publicsuffix.PublicSuffixType[] r2 = new com.google.thirdparty.publicsuffix.PublicSuffixType[r2]
            r2[r4] = r0
            r2[r6] = r1
            com.google.thirdparty.publicsuffix.PublicSuffixType.$VALUES = r2
            return
    }

    PublicSuffixType(java.lang.String r1, int r2, char r3, char r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.innerNodeCode = r3
            r0.leafNodeCode = r4
            return
    }

    static com.google.thirdparty.publicsuffix.PublicSuffixType fromCode(char r5) {
            com.google.thirdparty.publicsuffix.PublicSuffixType[] r0 = values()
            int r1 = r0.length
            r2 = 0
        L6:
            if (r2 >= r1) goto L1b
            r3 = r0[r2]
            char r4 = r3.getInnerNodeCode()
            if (r4 == r5) goto L1a
            char r4 = r3.getLeafNodeCode()
            if (r4 != r5) goto L17
            goto L1a
        L17:
            int r2 = r2 + 1
            goto L6
        L1a:
            return r3
        L1b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "No enum corresponding to given code: "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    static com.google.thirdparty.publicsuffix.PublicSuffixType fromIsPrivate(boolean r0) {
            if (r0 == 0) goto L5
            com.google.thirdparty.publicsuffix.PublicSuffixType r0 = com.google.thirdparty.publicsuffix.PublicSuffixType.PRIVATE
            return r0
        L5:
            com.google.thirdparty.publicsuffix.PublicSuffixType r0 = com.google.thirdparty.publicsuffix.PublicSuffixType.REGISTRY
            return r0
    }

    public static com.google.thirdparty.publicsuffix.PublicSuffixType valueOf(java.lang.String r1) {
            java.lang.Class<com.google.thirdparty.publicsuffix.PublicSuffixType> r0 = com.google.thirdparty.publicsuffix.PublicSuffixType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.google.thirdparty.publicsuffix.PublicSuffixType r1 = (com.google.thirdparty.publicsuffix.PublicSuffixType) r1
            return r1
    }

    public static com.google.thirdparty.publicsuffix.PublicSuffixType[] values() {
            com.google.thirdparty.publicsuffix.PublicSuffixType[] r0 = com.google.thirdparty.publicsuffix.PublicSuffixType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.google.thirdparty.publicsuffix.PublicSuffixType[] r0 = (com.google.thirdparty.publicsuffix.PublicSuffixType[]) r0
            return r0
    }

    char getInnerNodeCode() {
            r1 = this;
            char r0 = r1.innerNodeCode
            return r0
    }

    char getLeafNodeCode() {
            r1 = this;
            char r0 = r1.leafNodeCode
            return r0
    }
}

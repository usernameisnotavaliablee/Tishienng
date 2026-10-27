package com.kwad.components.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public enum FeedType extends java.lang.Enum<com.kwad.components.model.FeedType> {
    private static final /* synthetic */ com.kwad.components.model.FeedType[] $VALUES = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_CONTENT_11 = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_CONTENT_12 = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_CONTENT_13 = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_TEXT_ABOVE = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_TEXT_ABOVE_GROUP = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_TEXT_BELOW = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_TEXT_IMMERSE = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_TEXT_LEFT = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_TEXT_NEW = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_TEXT_RIGHT = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_THREE_IMAGE = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_UNKNOWN = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_VERTICAL_BISERIAL = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_VERTICAL_NOVEL = null;
    public static final com.kwad.components.model.FeedType FEED_TYPE_VERTICAL_ORIGIN = null;
    private com.kwad.components.model.FeedType.FeedDefaultType mFeedDefaultType;
    private int type;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum FeedDefaultType extends java.lang.Enum<com.kwad.components.model.FeedType.FeedDefaultType> {
        private static final /* synthetic */ com.kwad.components.model.FeedType.FeedDefaultType[] $VALUES = null;
        public static final com.kwad.components.model.FeedType.FeedDefaultType FEED_VERTICAL_BISERIAL_DEFAULT = null;
        public static final com.kwad.components.model.FeedType.FeedDefaultType FEED_VERTICAL_NOVEL_DEFAULT = null;
        public static final com.kwad.components.model.FeedType.FeedDefaultType FEED_VERTICAL_ORIGIN = null;
        private int defaultType;

        static {
                com.kwad.components.model.FeedType$FeedDefaultType r0 = new com.kwad.components.model.FeedType$FeedDefaultType
                java.lang.String r1 = "FEED_VERTICAL_ORIGIN"
                r2 = 0
                r0.<init>(r1, r2, r2)
                com.kwad.components.model.FeedType.FeedDefaultType.FEED_VERTICAL_ORIGIN = r0
                com.kwad.components.model.FeedType$FeedDefaultType r1 = new com.kwad.components.model.FeedType$FeedDefaultType
                java.lang.String r3 = "FEED_VERTICAL_NOVEL_DEFAULT"
                r4 = 1
                r1.<init>(r3, r4, r4)
                com.kwad.components.model.FeedType.FeedDefaultType.FEED_VERTICAL_NOVEL_DEFAULT = r1
                com.kwad.components.model.FeedType$FeedDefaultType r3 = new com.kwad.components.model.FeedType$FeedDefaultType
                java.lang.String r5 = "FEED_VERTICAL_BISERIAL_DEFAULT"
                r6 = 2
                r3.<init>(r5, r6, r6)
                com.kwad.components.model.FeedType.FeedDefaultType.FEED_VERTICAL_BISERIAL_DEFAULT = r3
                r5 = 3
                com.kwad.components.model.FeedType$FeedDefaultType[] r5 = new com.kwad.components.model.FeedType.FeedDefaultType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                com.kwad.components.model.FeedType.FeedDefaultType.$VALUES = r5
                return
        }

        FeedDefaultType(java.lang.String r1, int r2, int r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.defaultType = r3
                return
        }

        public static com.kwad.components.model.FeedType.FeedDefaultType valueOf(java.lang.String r1) {
                java.lang.Class<com.kwad.components.model.FeedType$FeedDefaultType> r0 = com.kwad.components.model.FeedType.FeedDefaultType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.kwad.components.model.FeedType$FeedDefaultType r1 = (com.kwad.components.model.FeedType.FeedDefaultType) r1
                return r1
        }

        public static com.kwad.components.model.FeedType.FeedDefaultType[] values() {
                com.kwad.components.model.FeedType$FeedDefaultType[] r0 = com.kwad.components.model.FeedType.FeedDefaultType.$VALUES
                java.lang.Object r0 = r0.clone()
                com.kwad.components.model.FeedType$FeedDefaultType[] r0 = (com.kwad.components.model.FeedType.FeedDefaultType[]) r0
                return r0
        }

        public final int getDefaultType() {
                r1 = this;
                int r0 = r1.defaultType
                return r0
        }
    }

    static {
            com.kwad.components.model.FeedType r0 = new com.kwad.components.model.FeedType
            com.kwad.components.model.FeedType$FeedDefaultType r1 = com.kwad.components.model.FeedType.FeedDefaultType.FEED_VERTICAL_ORIGIN
            java.lang.String r2 = "FEED_TYPE_UNKNOWN"
            r3 = 0
            r0.<init>(r2, r3, r3, r1)
            com.kwad.components.model.FeedType.FEED_TYPE_UNKNOWN = r0
            com.kwad.components.model.FeedType r2 = new com.kwad.components.model.FeedType
            java.lang.String r4 = "FEED_TYPE_TEXT_IMMERSE"
            r5 = 1
            r2.<init>(r4, r5, r5, r1)
            com.kwad.components.model.FeedType.FEED_TYPE_TEXT_IMMERSE = r2
            com.kwad.components.model.FeedType r4 = new com.kwad.components.model.FeedType
            java.lang.String r6 = "FEED_TYPE_TEXT_LEFT"
            r7 = 2
            r4.<init>(r6, r7, r7, r1)
            com.kwad.components.model.FeedType.FEED_TYPE_TEXT_LEFT = r4
            com.kwad.components.model.FeedType r6 = new com.kwad.components.model.FeedType
            java.lang.String r8 = "FEED_TYPE_TEXT_RIGHT"
            r9 = 3
            r6.<init>(r8, r9, r9, r1)
            com.kwad.components.model.FeedType.FEED_TYPE_TEXT_RIGHT = r6
            com.kwad.components.model.FeedType r8 = new com.kwad.components.model.FeedType
            java.lang.String r10 = "FEED_TYPE_TEXT_ABOVE"
            r11 = 4
            r8.<init>(r10, r11, r11, r1)
            com.kwad.components.model.FeedType.FEED_TYPE_TEXT_ABOVE = r8
            com.kwad.components.model.FeedType r10 = new com.kwad.components.model.FeedType
            java.lang.String r12 = "FEED_TYPE_TEXT_BELOW"
            r13 = 5
            r10.<init>(r12, r13, r13, r1)
            com.kwad.components.model.FeedType.FEED_TYPE_TEXT_BELOW = r10
            com.kwad.components.model.FeedType r12 = new com.kwad.components.model.FeedType
            java.lang.String r14 = "FEED_TYPE_TEXT_ABOVE_GROUP"
            r15 = 6
            r12.<init>(r14, r15, r15, r1)
            com.kwad.components.model.FeedType.FEED_TYPE_TEXT_ABOVE_GROUP = r12
            com.kwad.components.model.FeedType r14 = new com.kwad.components.model.FeedType
            r16 = 0
            java.lang.String r3 = "FEED_TYPE_TEXT_NEW"
            r17 = 1
            r5 = 7
            r14.<init>(r3, r5, r5, r1)
            com.kwad.components.model.FeedType.FEED_TYPE_TEXT_NEW = r14
            com.kwad.components.model.FeedType r3 = new com.kwad.components.model.FeedType
            r18 = 7
            java.lang.String r5 = "FEED_TYPE_CONTENT_11"
            r19 = 2
            r7 = 8
            r20 = 3
            r9 = 11
            r3.<init>(r5, r7, r9, r1)
            com.kwad.components.model.FeedType.FEED_TYPE_CONTENT_11 = r3
            com.kwad.components.model.FeedType r5 = new com.kwad.components.model.FeedType
            r21 = 8
            java.lang.String r7 = "FEED_TYPE_CONTENT_12"
            r22 = 4
            r11 = 9
            r23 = 5
            r13 = 12
            r5.<init>(r7, r11, r13, r1)
            com.kwad.components.model.FeedType.FEED_TYPE_CONTENT_12 = r5
            com.kwad.components.model.FeedType r7 = new com.kwad.components.model.FeedType
            r24 = 9
            java.lang.String r11 = "FEED_TYPE_CONTENT_13"
            r25 = 6
            r15 = 10
            r13 = 13
            r7.<init>(r11, r15, r13, r1)
            com.kwad.components.model.FeedType.FEED_TYPE_CONTENT_13 = r7
            com.kwad.components.model.FeedType r11 = new com.kwad.components.model.FeedType
            r27 = 10
            java.lang.String r15 = "FEED_TYPE_THREE_IMAGE"
            r13 = 20
            r11.<init>(r15, r9, r13, r1)
            com.kwad.components.model.FeedType.FEED_TYPE_THREE_IMAGE = r11
            com.kwad.components.model.FeedType r13 = new com.kwad.components.model.FeedType
            java.lang.String r15 = "FEED_TYPE_VERTICAL_ORIGIN"
            r29 = 11
            r9 = 21
            r30 = r0
            r0 = 12
            r13.<init>(r15, r0, r9, r1)
            com.kwad.components.model.FeedType.FEED_TYPE_VERTICAL_ORIGIN = r13
            com.kwad.components.model.FeedType r0 = new com.kwad.components.model.FeedType
            java.lang.String r1 = "FEED_TYPE_VERTICAL_NOVEL"
            com.kwad.components.model.FeedType$FeedDefaultType r15 = com.kwad.components.model.FeedType.FeedDefaultType.FEED_VERTICAL_NOVEL_DEFAULT
            r31 = r2
            r2 = 13
            r0.<init>(r1, r2, r9, r15)
            com.kwad.components.model.FeedType.FEED_TYPE_VERTICAL_NOVEL = r0
            com.kwad.components.model.FeedType r1 = new com.kwad.components.model.FeedType
            com.kwad.components.model.FeedType$FeedDefaultType r2 = com.kwad.components.model.FeedType.FeedDefaultType.FEED_VERTICAL_BISERIAL_DEFAULT
            java.lang.String r15 = "FEED_TYPE_VERTICAL_BISERIAL"
            r32 = r0
            r0 = 14
            r1.<init>(r15, r0, r9, r2)
            com.kwad.components.model.FeedType.FEED_TYPE_VERTICAL_BISERIAL = r1
            r2 = 15
            com.kwad.components.model.FeedType[] r2 = new com.kwad.components.model.FeedType[r2]
            r2[r16] = r30
            r2[r17] = r31
            r2[r19] = r4
            r2[r20] = r6
            r2[r22] = r8
            r2[r23] = r10
            r2[r25] = r12
            r2[r18] = r14
            r2[r21] = r3
            r2[r24] = r5
            r2[r27] = r7
            r2[r29] = r11
            r26 = 12
            r2[r26] = r13
            r28 = 13
            r2[r28] = r32
            r2[r0] = r1
            com.kwad.components.model.FeedType.$VALUES = r2
            return
    }

    FeedType(java.lang.String r1, int r2, int r3, com.kwad.components.model.FeedType.FeedDefaultType r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.type = r3
            r0.mFeedDefaultType = r4
            return
    }

    public static boolean checkTypeValid(@androidx.annotation.NonNull com.kwad.sdk.core.response.model.AdTemplate r4) {
            com.kwad.sdk.core.response.model.AdInfo r0 = com.kwad.sdk.core.response.b.e.el(r4)
            int r0 = com.kwad.sdk.core.response.b.a.be(r0)
            int r1 = r4.type
            boolean r1 = isH5Type(r1)
            r2 = 1
            if (r1 == 0) goto L12
            return r2
        L12:
            int r1 = r4.type
            int r4 = r4.defaultType
            com.kwad.components.model.FeedType r4 = fromInt(r1, r4)
            r1 = 0
            if (r0 == r2) goto L44
            r3 = 2
            if (r0 == r3) goto L3a
            r3 = 3
            if (r0 == r3) goto L28
            r3 = 8
            if (r0 == r3) goto L44
            return r1
        L28:
            com.kwad.components.model.FeedType r0 = com.kwad.components.model.FeedType.FEED_TYPE_UNKNOWN
            if (r4 == r0) goto L39
            com.kwad.components.model.FeedType r0 = com.kwad.components.model.FeedType.FEED_TYPE_VERTICAL_ORIGIN
            if (r4 == r0) goto L39
            com.kwad.components.model.FeedType r0 = com.kwad.components.model.FeedType.FEED_TYPE_VERTICAL_NOVEL
            if (r4 == r0) goto L39
            com.kwad.components.model.FeedType r0 = com.kwad.components.model.FeedType.FEED_TYPE_VERTICAL_BISERIAL
            if (r4 == r0) goto L39
            return r2
        L39:
            return r1
        L3a:
            com.kwad.components.model.FeedType r0 = com.kwad.components.model.FeedType.FEED_TYPE_UNKNOWN
            if (r4 == r0) goto L43
            com.kwad.components.model.FeedType r0 = com.kwad.components.model.FeedType.FEED_TYPE_TEXT_ABOVE_GROUP
            if (r4 == r0) goto L43
            return r2
        L43:
            return r1
        L44:
            com.kwad.components.model.FeedType r0 = com.kwad.components.model.FeedType.FEED_TYPE_TEXT_ABOVE
            if (r4 == r0) goto L5e
            com.kwad.components.model.FeedType r0 = com.kwad.components.model.FeedType.FEED_TYPE_TEXT_BELOW
            if (r4 == r0) goto L5e
            com.kwad.components.model.FeedType r0 = com.kwad.components.model.FeedType.FEED_TYPE_TEXT_IMMERSE
            if (r4 == r0) goto L5e
            com.kwad.components.model.FeedType r0 = com.kwad.components.model.FeedType.FEED_TYPE_VERTICAL_ORIGIN
            if (r4 == r0) goto L5e
            com.kwad.components.model.FeedType r0 = com.kwad.components.model.FeedType.FEED_TYPE_VERTICAL_NOVEL
            if (r4 == r0) goto L5e
            com.kwad.components.model.FeedType r0 = com.kwad.components.model.FeedType.FEED_TYPE_VERTICAL_BISERIAL
            if (r4 != r0) goto L5d
            goto L5e
        L5d:
            return r1
        L5e:
            return r2
    }

    @androidx.annotation.NonNull
    public static com.kwad.components.model.FeedType fromInt(int r5, int r6) {
            boolean r0 = isH5Type(r5)
            if (r0 == 0) goto L9
            com.kwad.components.model.FeedType r5 = com.kwad.components.model.FeedType.FEED_TYPE_TEXT_NEW
            return r5
        L9:
            com.kwad.components.model.FeedType[] r0 = values()
            int r1 = r0.length
            r2 = 0
        Lf:
            if (r2 >= r1) goto L34
            r3 = r0[r2]
            int r4 = r3.type
            if (r4 != r5) goto L1e
            boolean r4 = isNewVerticalType(r5)
            if (r4 != 0) goto L1e
            goto L30
        L1e:
            int r4 = r3.type
            if (r4 != r5) goto L31
            boolean r4 = isNewVerticalType(r5)
            if (r4 == 0) goto L31
            com.kwad.components.model.FeedType$FeedDefaultType r4 = r3.mFeedDefaultType
            int r4 = r4.getDefaultType()
            if (r4 != r6) goto L31
        L30:
            return r3
        L31:
            int r2 = r2 + 1
            goto Lf
        L34:
            com.kwad.components.model.FeedType r5 = com.kwad.components.model.FeedType.FEED_TYPE_UNKNOWN
            return r5
    }

    private static boolean isH5Type(int r1) {
            r0 = 7
            if (r1 == r0) goto L2a
            r0 = 8
            if (r1 == r0) goto L2a
            r0 = 14
            if (r1 == r0) goto L2a
            r0 = 15
            if (r1 == r0) goto L2a
            r0 = 16
            if (r1 == r0) goto L2a
            r0 = 17
            if (r1 == r0) goto L2a
            r0 = 18
            if (r1 == r0) goto L2a
            r0 = 19
            if (r1 == r0) goto L2a
            r0 = 20
            if (r1 == r0) goto L2a
            r0 = 2000(0x7d0, float:2.803E-42)
            if (r1 < r0) goto L28
            goto L2a
        L28:
            r1 = 0
            return r1
        L2a:
            r1 = 1
            return r1
    }

    public static boolean isNewVerticalType(int r1) {
            r0 = 21
            if (r1 != r0) goto L6
            r1 = 1
            return r1
        L6:
            r1 = 0
            return r1
    }

    public static com.kwad.components.model.FeedType valueOf(java.lang.String r1) {
            java.lang.Class<com.kwad.components.model.FeedType> r0 = com.kwad.components.model.FeedType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.kwad.components.model.FeedType r1 = (com.kwad.components.model.FeedType) r1
            return r1
    }

    public static com.kwad.components.model.FeedType[] values() {
            com.kwad.components.model.FeedType[] r0 = com.kwad.components.model.FeedType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.kwad.components.model.FeedType[] r0 = (com.kwad.components.model.FeedType[]) r0
            return r0
    }

    public final com.kwad.components.model.FeedType.FeedDefaultType getFeedDefaultType() {
            r1 = this;
            com.kwad.components.model.FeedType$FeedDefaultType r0 = r1.mFeedDefaultType
            return r0
    }

    public final int getType() {
            r1 = this;
            int r0 = r1.type
            return r0
    }
}

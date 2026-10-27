package com.alibaba.fastjson.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public enum Feature extends java.lang.Enum<com.alibaba.fastjson.parser.Feature> {
    private static final /* synthetic */ com.alibaba.fastjson.parser.Feature[] $VALUES = null;
    public static final com.alibaba.fastjson.parser.Feature AllowArbitraryCommas = null;
    public static final com.alibaba.fastjson.parser.Feature AllowComment = null;
    public static final com.alibaba.fastjson.parser.Feature AllowISO8601DateFormat = null;
    public static final com.alibaba.fastjson.parser.Feature AllowSingleQuotes = null;
    public static final com.alibaba.fastjson.parser.Feature AllowUnQuotedFieldNames = null;
    public static final com.alibaba.fastjson.parser.Feature AutoCloseSource = null;
    public static final com.alibaba.fastjson.parser.Feature DisableASM = null;
    public static final com.alibaba.fastjson.parser.Feature DisableCircularReferenceDetect = null;
    public static final com.alibaba.fastjson.parser.Feature DisableFieldSmartMatch = null;
    public static final com.alibaba.fastjson.parser.Feature DisableSpecialKeyDetect = null;
    public static final com.alibaba.fastjson.parser.Feature IgnoreAutoType = null;
    public static final com.alibaba.fastjson.parser.Feature IgnoreNotMatch = null;
    public static final com.alibaba.fastjson.parser.Feature InitStringFieldAsEmpty = null;
    public static final com.alibaba.fastjson.parser.Feature InternFieldNames = null;
    public static final com.alibaba.fastjson.parser.Feature OrderedField = null;
    public static final com.alibaba.fastjson.parser.Feature SortFeidFastMatch = null;
    public static final com.alibaba.fastjson.parser.Feature SupportArrayToBean = null;
    public static final com.alibaba.fastjson.parser.Feature SupportNonPublicField = null;
    public static final com.alibaba.fastjson.parser.Feature UseBigDecimal = null;
    public static final com.alibaba.fastjson.parser.Feature UseObjectArray = null;
    public final int mask;

    static {
            com.alibaba.fastjson.parser.Feature r0 = new com.alibaba.fastjson.parser.Feature
            java.lang.String r1 = "AutoCloseSource"
            r2 = 0
            r0.<init>(r1, r2)
            com.alibaba.fastjson.parser.Feature.AutoCloseSource = r0
            com.alibaba.fastjson.parser.Feature r1 = new com.alibaba.fastjson.parser.Feature
            java.lang.String r3 = "AllowComment"
            r4 = 1
            r1.<init>(r3, r4)
            com.alibaba.fastjson.parser.Feature.AllowComment = r1
            com.alibaba.fastjson.parser.Feature r3 = new com.alibaba.fastjson.parser.Feature
            java.lang.String r5 = "AllowUnQuotedFieldNames"
            r6 = 2
            r3.<init>(r5, r6)
            com.alibaba.fastjson.parser.Feature.AllowUnQuotedFieldNames = r3
            com.alibaba.fastjson.parser.Feature r5 = new com.alibaba.fastjson.parser.Feature
            java.lang.String r7 = "AllowSingleQuotes"
            r8 = 3
            r5.<init>(r7, r8)
            com.alibaba.fastjson.parser.Feature.AllowSingleQuotes = r5
            com.alibaba.fastjson.parser.Feature r7 = new com.alibaba.fastjson.parser.Feature
            java.lang.String r9 = "InternFieldNames"
            r10 = 4
            r7.<init>(r9, r10)
            com.alibaba.fastjson.parser.Feature.InternFieldNames = r7
            com.alibaba.fastjson.parser.Feature r9 = new com.alibaba.fastjson.parser.Feature
            java.lang.String r11 = "AllowISO8601DateFormat"
            r12 = 5
            r9.<init>(r11, r12)
            com.alibaba.fastjson.parser.Feature.AllowISO8601DateFormat = r9
            com.alibaba.fastjson.parser.Feature r11 = new com.alibaba.fastjson.parser.Feature
            java.lang.String r13 = "AllowArbitraryCommas"
            r14 = 6
            r11.<init>(r13, r14)
            com.alibaba.fastjson.parser.Feature.AllowArbitraryCommas = r11
            com.alibaba.fastjson.parser.Feature r13 = new com.alibaba.fastjson.parser.Feature
            java.lang.String r15 = "UseBigDecimal"
            r16 = 0
            r2 = 7
            r13.<init>(r15, r2)
            com.alibaba.fastjson.parser.Feature.UseBigDecimal = r13
            com.alibaba.fastjson.parser.Feature r15 = new com.alibaba.fastjson.parser.Feature
            r17 = 7
            java.lang.String r2 = "IgnoreNotMatch"
            r18 = 1
            r4 = 8
            r15.<init>(r2, r4)
            com.alibaba.fastjson.parser.Feature.IgnoreNotMatch = r15
            com.alibaba.fastjson.parser.Feature r2 = new com.alibaba.fastjson.parser.Feature
            r19 = 8
            java.lang.String r4 = "SortFeidFastMatch"
            r20 = 2
            r6 = 9
            r2.<init>(r4, r6)
            com.alibaba.fastjson.parser.Feature.SortFeidFastMatch = r2
            com.alibaba.fastjson.parser.Feature r4 = new com.alibaba.fastjson.parser.Feature
            r21 = 9
            java.lang.String r6 = "DisableASM"
            r22 = 3
            r8 = 10
            r4.<init>(r6, r8)
            com.alibaba.fastjson.parser.Feature.DisableASM = r4
            com.alibaba.fastjson.parser.Feature r6 = new com.alibaba.fastjson.parser.Feature
            r23 = 10
            java.lang.String r8 = "DisableCircularReferenceDetect"
            r24 = 4
            r10 = 11
            r6.<init>(r8, r10)
            com.alibaba.fastjson.parser.Feature.DisableCircularReferenceDetect = r6
            com.alibaba.fastjson.parser.Feature r8 = new com.alibaba.fastjson.parser.Feature
            r25 = 11
            java.lang.String r10 = "InitStringFieldAsEmpty"
            r26 = 5
            r12 = 12
            r8.<init>(r10, r12)
            com.alibaba.fastjson.parser.Feature.InitStringFieldAsEmpty = r8
            com.alibaba.fastjson.parser.Feature r10 = new com.alibaba.fastjson.parser.Feature
            r27 = 12
            java.lang.String r12 = "SupportArrayToBean"
            r28 = 6
            r14 = 13
            r10.<init>(r12, r14)
            com.alibaba.fastjson.parser.Feature.SupportArrayToBean = r10
            com.alibaba.fastjson.parser.Feature r12 = new com.alibaba.fastjson.parser.Feature
            r29 = 13
            java.lang.String r14 = "OrderedField"
            r30 = r0
            r0 = 14
            r12.<init>(r14, r0)
            com.alibaba.fastjson.parser.Feature.OrderedField = r12
            com.alibaba.fastjson.parser.Feature r14 = new com.alibaba.fastjson.parser.Feature
            r31 = 14
            java.lang.String r0 = "DisableSpecialKeyDetect"
            r32 = r1
            r1 = 15
            r14.<init>(r0, r1)
            com.alibaba.fastjson.parser.Feature.DisableSpecialKeyDetect = r14
            com.alibaba.fastjson.parser.Feature r0 = new com.alibaba.fastjson.parser.Feature
            r33 = 15
            java.lang.String r1 = "UseObjectArray"
            r34 = r2
            r2 = 16
            r0.<init>(r1, r2)
            com.alibaba.fastjson.parser.Feature.UseObjectArray = r0
            com.alibaba.fastjson.parser.Feature r1 = new com.alibaba.fastjson.parser.Feature
            r35 = 16
            java.lang.String r2 = "SupportNonPublicField"
            r36 = r0
            r0 = 17
            r1.<init>(r2, r0)
            com.alibaba.fastjson.parser.Feature.SupportNonPublicField = r1
            com.alibaba.fastjson.parser.Feature r2 = new com.alibaba.fastjson.parser.Feature
            r37 = 17
            java.lang.String r0 = "IgnoreAutoType"
            r38 = r1
            r1 = 18
            r2.<init>(r0, r1)
            com.alibaba.fastjson.parser.Feature.IgnoreAutoType = r2
            com.alibaba.fastjson.parser.Feature r0 = new com.alibaba.fastjson.parser.Feature
            r39 = 18
            java.lang.String r1 = "DisableFieldSmartMatch"
            r40 = r2
            r2 = 19
            r0.<init>(r1, r2)
            com.alibaba.fastjson.parser.Feature.DisableFieldSmartMatch = r0
            r1 = 20
            com.alibaba.fastjson.parser.Feature[] r1 = new com.alibaba.fastjson.parser.Feature[r1]
            r1[r16] = r30
            r1[r18] = r32
            r1[r20] = r3
            r1[r22] = r5
            r1[r24] = r7
            r1[r26] = r9
            r1[r28] = r11
            r1[r17] = r13
            r1[r19] = r15
            r1[r21] = r34
            r1[r23] = r4
            r1[r25] = r6
            r1[r27] = r8
            r1[r29] = r10
            r1[r31] = r12
            r1[r33] = r14
            r1[r35] = r36
            r1[r37] = r38
            r1[r39] = r40
            r1[r2] = r0
            com.alibaba.fastjson.parser.Feature.$VALUES = r1
            return
    }

    Feature(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            int r2 = r0.ordinal()
            int r1 = r1 << r2
            r0.mask = r1
            return
    }

    public static int config(int r0, com.alibaba.fastjson.parser.Feature r1, boolean r2) {
            if (r2 == 0) goto L6
            int r1 = r1.mask
            r0 = r0 | r1
            return r0
        L6:
            int r1 = r1.mask
            int r1 = ~r1
            r0 = r0 & r1
            return r0
    }

    public static boolean isEnabled(int r0, com.alibaba.fastjson.parser.Feature r1) {
            int r1 = r1.mask
            r0 = r0 & r1
            if (r0 == 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static int of(com.alibaba.fastjson.parser.Feature[] r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.length
            r2 = 0
        L6:
            if (r0 >= r1) goto L10
            r3 = r4[r0]
            int r3 = r3.mask
            r2 = r2 | r3
            int r0 = r0 + 1
            goto L6
        L10:
            return r2
    }

    public static com.alibaba.fastjson.parser.Feature valueOf(java.lang.String r1) {
            java.lang.Class<com.alibaba.fastjson.parser.Feature> r0 = com.alibaba.fastjson.parser.Feature.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.alibaba.fastjson.parser.Feature r1 = (com.alibaba.fastjson.parser.Feature) r1
            return r1
    }

    public static com.alibaba.fastjson.parser.Feature[] values() {
            com.alibaba.fastjson.parser.Feature[] r0 = com.alibaba.fastjson.parser.Feature.$VALUES
            java.lang.Object r0 = r0.clone()
            com.alibaba.fastjson.parser.Feature[] r0 = (com.alibaba.fastjson.parser.Feature[]) r0
            return r0
    }

    public final int getMask() {
            r1 = this;
            int r0 = r1.mask
            return r0
    }
}

package com.alibaba.fastjson.serializer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public enum SerializerFeature extends java.lang.Enum<com.alibaba.fastjson.serializer.SerializerFeature> {
    private static final /* synthetic */ com.alibaba.fastjson.serializer.SerializerFeature[] $VALUES = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature BeanToArray = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature BrowserCompatible = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature BrowserSecure = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature DisableCheckSpecialChar = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature DisableCircularReferenceDetect = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature[] EMPTY = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature IgnoreErrorGetter = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature IgnoreNonFieldGetter = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature MapSortField = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature NotWriteDefaultValue = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature NotWriteRootClassName = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature PrettyFormat = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature QuoteFieldNames = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature SkipTransientField = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature SortField = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature UseISO8601DateFormat = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature UseSingleQuotes = null;
    public static final int WRITE_MAP_NULL_FEATURES = 0;
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteBigDecimalAsPlain = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteClassName = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteDateUseDateFormat = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteEnumUsingName = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteEnumUsingToString = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteMapNullValue = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteNonStringKeyAsString = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteNonStringValueAsString = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteNullBooleanAsFalse = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteNullListAsEmpty = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteNullNumberAsZero = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteNullStringAsEmpty = null;
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteSlashAsSpecial = null;

    @java.lang.Deprecated
    public static final com.alibaba.fastjson.serializer.SerializerFeature WriteTabAsSpecial = null;
    public final int mask;

    static {
            com.alibaba.fastjson.serializer.SerializerFeature r0 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r1 = "QuoteFieldNames"
            r2 = 0
            r0.<init>(r1, r2)
            com.alibaba.fastjson.serializer.SerializerFeature.QuoteFieldNames = r0
            com.alibaba.fastjson.serializer.SerializerFeature r1 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r3 = "UseSingleQuotes"
            r4 = 1
            r1.<init>(r3, r4)
            com.alibaba.fastjson.serializer.SerializerFeature.UseSingleQuotes = r1
            com.alibaba.fastjson.serializer.SerializerFeature r3 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r5 = "WriteMapNullValue"
            r6 = 2
            r3.<init>(r5, r6)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteMapNullValue = r3
            com.alibaba.fastjson.serializer.SerializerFeature r5 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r7 = "WriteEnumUsingToString"
            r8 = 3
            r5.<init>(r7, r8)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingToString = r5
            com.alibaba.fastjson.serializer.SerializerFeature r7 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r9 = "WriteEnumUsingName"
            r10 = 4
            r7.<init>(r9, r10)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteEnumUsingName = r7
            com.alibaba.fastjson.serializer.SerializerFeature r9 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r11 = "UseISO8601DateFormat"
            r12 = 5
            r9.<init>(r11, r12)
            com.alibaba.fastjson.serializer.SerializerFeature.UseISO8601DateFormat = r9
            com.alibaba.fastjson.serializer.SerializerFeature r11 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r13 = "WriteNullListAsEmpty"
            r14 = 6
            r11.<init>(r13, r14)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteNullListAsEmpty = r11
            com.alibaba.fastjson.serializer.SerializerFeature r13 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r15 = "WriteNullStringAsEmpty"
            r16 = 1
            r4 = 7
            r13.<init>(r15, r4)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteNullStringAsEmpty = r13
            com.alibaba.fastjson.serializer.SerializerFeature r15 = new com.alibaba.fastjson.serializer.SerializerFeature
            r17 = 7
            java.lang.String r4 = "WriteNullNumberAsZero"
            r18 = 2
            r6 = 8
            r15.<init>(r4, r6)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteNullNumberAsZero = r15
            com.alibaba.fastjson.serializer.SerializerFeature r4 = new com.alibaba.fastjson.serializer.SerializerFeature
            r19 = 8
            java.lang.String r6 = "WriteNullBooleanAsFalse"
            r20 = 3
            r8 = 9
            r4.<init>(r6, r8)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteNullBooleanAsFalse = r4
            com.alibaba.fastjson.serializer.SerializerFeature r6 = new com.alibaba.fastjson.serializer.SerializerFeature
            r21 = 9
            java.lang.String r8 = "SkipTransientField"
            r22 = 4
            r10 = 10
            r6.<init>(r8, r10)
            com.alibaba.fastjson.serializer.SerializerFeature.SkipTransientField = r6
            com.alibaba.fastjson.serializer.SerializerFeature r8 = new com.alibaba.fastjson.serializer.SerializerFeature
            r23 = 10
            java.lang.String r10 = "SortField"
            r24 = 5
            r12 = 11
            r8.<init>(r10, r12)
            com.alibaba.fastjson.serializer.SerializerFeature.SortField = r8
            com.alibaba.fastjson.serializer.SerializerFeature r10 = new com.alibaba.fastjson.serializer.SerializerFeature
            r25 = 11
            java.lang.String r12 = "WriteTabAsSpecial"
            r26 = 6
            r14 = 12
            r10.<init>(r12, r14)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteTabAsSpecial = r10
            com.alibaba.fastjson.serializer.SerializerFeature r12 = new com.alibaba.fastjson.serializer.SerializerFeature
            r27 = 12
            java.lang.String r14 = "PrettyFormat"
            r28 = 0
            r2 = 13
            r12.<init>(r14, r2)
            com.alibaba.fastjson.serializer.SerializerFeature.PrettyFormat = r12
            com.alibaba.fastjson.serializer.SerializerFeature r14 = new com.alibaba.fastjson.serializer.SerializerFeature
            r29 = 13
            java.lang.String r2 = "WriteClassName"
            r30 = r0
            r0 = 14
            r14.<init>(r2, r0)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteClassName = r14
            com.alibaba.fastjson.serializer.SerializerFeature r2 = new com.alibaba.fastjson.serializer.SerializerFeature
            r31 = 14
            java.lang.String r0 = "DisableCircularReferenceDetect"
            r32 = r1
            r1 = 15
            r2.<init>(r0, r1)
            com.alibaba.fastjson.serializer.SerializerFeature.DisableCircularReferenceDetect = r2
            com.alibaba.fastjson.serializer.SerializerFeature r0 = new com.alibaba.fastjson.serializer.SerializerFeature
            r33 = 15
            java.lang.String r1 = "WriteSlashAsSpecial"
            r34 = r2
            r2 = 16
            r0.<init>(r1, r2)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteSlashAsSpecial = r0
            com.alibaba.fastjson.serializer.SerializerFeature r1 = new com.alibaba.fastjson.serializer.SerializerFeature
            r35 = 16
            java.lang.String r2 = "BrowserCompatible"
            r36 = r0
            r0 = 17
            r1.<init>(r2, r0)
            com.alibaba.fastjson.serializer.SerializerFeature.BrowserCompatible = r1
            com.alibaba.fastjson.serializer.SerializerFeature r2 = new com.alibaba.fastjson.serializer.SerializerFeature
            r37 = 17
            java.lang.String r0 = "WriteDateUseDateFormat"
            r38 = r1
            r1 = 18
            r2.<init>(r0, r1)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteDateUseDateFormat = r2
            com.alibaba.fastjson.serializer.SerializerFeature r0 = new com.alibaba.fastjson.serializer.SerializerFeature
            r39 = 18
            java.lang.String r1 = "NotWriteRootClassName"
            r40 = r2
            r2 = 19
            r0.<init>(r1, r2)
            com.alibaba.fastjson.serializer.SerializerFeature.NotWriteRootClassName = r0
            com.alibaba.fastjson.serializer.SerializerFeature r1 = new com.alibaba.fastjson.serializer.SerializerFeature
            r41 = 19
            java.lang.String r2 = "DisableCheckSpecialChar"
            r42 = r0
            r0 = 20
            r1.<init>(r2, r0)
            com.alibaba.fastjson.serializer.SerializerFeature.DisableCheckSpecialChar = r1
            com.alibaba.fastjson.serializer.SerializerFeature r2 = new com.alibaba.fastjson.serializer.SerializerFeature
            r43 = 20
            java.lang.String r0 = "BeanToArray"
            r44 = r1
            r1 = 21
            r2.<init>(r0, r1)
            com.alibaba.fastjson.serializer.SerializerFeature.BeanToArray = r2
            com.alibaba.fastjson.serializer.SerializerFeature r0 = new com.alibaba.fastjson.serializer.SerializerFeature
            r45 = 21
            java.lang.String r1 = "WriteNonStringKeyAsString"
            r46 = r2
            r2 = 22
            r0.<init>(r1, r2)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteNonStringKeyAsString = r0
            com.alibaba.fastjson.serializer.SerializerFeature r1 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r2 = "NotWriteDefaultValue"
            r47 = r0
            r0 = 23
            r1.<init>(r2, r0)
            com.alibaba.fastjson.serializer.SerializerFeature.NotWriteDefaultValue = r1
            com.alibaba.fastjson.serializer.SerializerFeature r0 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r2 = "BrowserSecure"
            r48 = r1
            r1 = 24
            r0.<init>(r2, r1)
            com.alibaba.fastjson.serializer.SerializerFeature.BrowserSecure = r0
            com.alibaba.fastjson.serializer.SerializerFeature r1 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r2 = "IgnoreNonFieldGetter"
            r49 = r0
            r0 = 25
            r1.<init>(r2, r0)
            com.alibaba.fastjson.serializer.SerializerFeature.IgnoreNonFieldGetter = r1
            com.alibaba.fastjson.serializer.SerializerFeature r0 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r2 = "WriteNonStringValueAsString"
            r50 = r1
            r1 = 26
            r0.<init>(r2, r1)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteNonStringValueAsString = r0
            com.alibaba.fastjson.serializer.SerializerFeature r1 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r2 = "IgnoreErrorGetter"
            r51 = r0
            r0 = 27
            r1.<init>(r2, r0)
            com.alibaba.fastjson.serializer.SerializerFeature.IgnoreErrorGetter = r1
            com.alibaba.fastjson.serializer.SerializerFeature r0 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r2 = "WriteBigDecimalAsPlain"
            r52 = r1
            r1 = 28
            r0.<init>(r2, r1)
            com.alibaba.fastjson.serializer.SerializerFeature.WriteBigDecimalAsPlain = r0
            com.alibaba.fastjson.serializer.SerializerFeature r1 = new com.alibaba.fastjson.serializer.SerializerFeature
            java.lang.String r2 = "MapSortField"
            r53 = r0
            r0 = 29
            r1.<init>(r2, r0)
            com.alibaba.fastjson.serializer.SerializerFeature.MapSortField = r1
            r0 = 30
            com.alibaba.fastjson.serializer.SerializerFeature[] r0 = new com.alibaba.fastjson.serializer.SerializerFeature[r0]
            r0[r28] = r30
            r0[r16] = r32
            r0[r18] = r3
            r0[r20] = r5
            r0[r22] = r7
            r0[r24] = r9
            r0[r26] = r11
            r0[r17] = r13
            r0[r19] = r15
            r0[r21] = r4
            r0[r23] = r6
            r0[r25] = r8
            r0[r27] = r10
            r0[r29] = r12
            r0[r31] = r14
            r0[r33] = r34
            r0[r35] = r36
            r0[r37] = r38
            r0[r39] = r40
            r0[r41] = r42
            r0[r43] = r44
            r0[r45] = r46
            r2 = 22
            r0[r2] = r47
            r2 = 23
            r0[r2] = r48
            r2 = 24
            r0[r2] = r49
            r2 = 25
            r0[r2] = r50
            r2 = 26
            r0[r2] = r51
            r2 = 27
            r0[r2] = r52
            r2 = 28
            r0[r2] = r53
            r2 = 29
            r0[r2] = r1
            com.alibaba.fastjson.serializer.SerializerFeature.$VALUES = r0
            r0 = 0
            com.alibaba.fastjson.serializer.SerializerFeature[] r0 = new com.alibaba.fastjson.serializer.SerializerFeature[r0]
            com.alibaba.fastjson.serializer.SerializerFeature.EMPTY = r0
            int r0 = r3.getMask()
            int r1 = r4.getMask()
            r0 = r0 | r1
            int r1 = r11.getMask()
            r0 = r0 | r1
            int r1 = r15.getMask()
            r0 = r0 | r1
            int r1 = r13.getMask()
            r0 = r0 | r1
            com.alibaba.fastjson.serializer.SerializerFeature.WRITE_MAP_NULL_FEATURES = r0
            return
    }

    SerializerFeature(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            r1 = 1
            int r2 = r0.ordinal()
            int r1 = r1 << r2
            r0.mask = r1
            return
    }

    public static int config(int r0, com.alibaba.fastjson.serializer.SerializerFeature r1, boolean r2) {
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

    public static boolean isEnabled(int r0, int r1, com.alibaba.fastjson.serializer.SerializerFeature r2) {
            int r2 = r2.mask
            r0 = r0 & r2
            if (r0 != 0) goto Lc
            r0 = r1 & r2
            if (r0 == 0) goto La
            goto Lc
        La:
            r0 = 0
            return r0
        Lc:
            r0 = 1
            return r0
    }

    public static boolean isEnabled(int r0, com.alibaba.fastjson.serializer.SerializerFeature r1) {
            int r1 = r1.mask
            r0 = r0 & r1
            if (r0 == 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    public static int of(com.alibaba.fastjson.serializer.SerializerFeature[] r4) {
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

    public static com.alibaba.fastjson.serializer.SerializerFeature valueOf(java.lang.String r1) {
            java.lang.Class<com.alibaba.fastjson.serializer.SerializerFeature> r0 = com.alibaba.fastjson.serializer.SerializerFeature.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.alibaba.fastjson.serializer.SerializerFeature r1 = (com.alibaba.fastjson.serializer.SerializerFeature) r1
            return r1
    }

    public static com.alibaba.fastjson.serializer.SerializerFeature[] values() {
            com.alibaba.fastjson.serializer.SerializerFeature[] r0 = com.alibaba.fastjson.serializer.SerializerFeature.$VALUES
            java.lang.Object r0 = r0.clone()
            com.alibaba.fastjson.serializer.SerializerFeature[] r0 = (com.alibaba.fastjson.serializer.SerializerFeature[]) r0
            return r0
    }

    public final int getMask() {
            r1 = this;
            int r0 = r1.mask
            return r0
    }
}

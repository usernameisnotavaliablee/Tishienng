package androidx.core.text.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
class FindAddress {
    private static final java.lang.String HOUSE_COMPONENT = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)";
    private static final java.lang.String HOUSE_END = "(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    private static final java.lang.String HOUSE_POST_DELIM = ",\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final java.lang.String HOUSE_PRE_DELIM = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final int MAX_ADDRESS_LINES = 5;
    private static final int MAX_ADDRESS_WORDS = 14;
    private static final int MAX_LOCATION_NAME_DISTANCE = 5;
    private static final int MIN_ADDRESS_WORDS = 4;
    private static final java.lang.String NL = "\n\u000b\f\r\u0085\u2028\u2029";
    private static final java.lang.String SP = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000";
    private static final java.lang.String WORD_DELIM = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final java.lang.String WORD_END = "(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)";
    private static final java.lang.String WS = "\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029";
    private static final int kMaxAddressNameWordLength = 25;
    private static final java.util.regex.Pattern sHouseNumberRe = null;
    private static final java.util.regex.Pattern sLocationNameRe = null;
    private static final java.util.regex.Pattern sStateRe = null;
    private static final androidx.core.text.util.FindAddress.ZipRange[] sStateZipCodeRanges = null;
    private static final java.util.regex.Pattern sSuffixedNumberRe = null;
    private static final java.util.regex.Pattern sWordRe = null;
    private static final java.util.regex.Pattern sZipCodeRe = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class ZipRange {
        int mException1;
        int mException2;
        int mHigh;
        int mLow;

        ZipRange(int r1, int r2, int r3, int r4) {
                r0 = this;
                r0.<init>()
                r0.mLow = r1
                r0.mHigh = r2
                r0.mException1 = r3
                r0.mException2 = r4
                return
        }

        boolean matches(java.lang.String r3) {
                r2 = this;
                r0 = 2
                r1 = 0
                java.lang.String r3 = r3.substring(r1, r0)
                int r3 = java.lang.Integer.parseInt(r3)
                int r0 = r2.mLow
                if (r0 > r3) goto L12
                int r0 = r2.mHigh
                if (r3 <= r0) goto L1c
            L12:
                int r0 = r2.mException1
                if (r3 == r0) goto L1c
                int r0 = r2.mException2
                if (r3 != r0) goto L1b
                goto L1c
            L1b:
                return r1
            L1c:
                r3 = 1
                return r3
        }
    }

    static {
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r1 = 99
            r2 = -1
            r0.<init>(r1, r1, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r3 = new androidx.core.text.util.FindAddress$ZipRange
            r4 = 35
            r5 = 36
            r3.<init>(r4, r5, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r6 = new androidx.core.text.util.FindAddress$ZipRange
            r7 = 72
            r8 = 71
            r6.<init>(r8, r7, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r7 = new androidx.core.text.util.FindAddress$ZipRange
            r9 = 96
            r7.<init>(r9, r9, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r10 = new androidx.core.text.util.FindAddress$ZipRange
            r11 = 85
            r12 = 86
            r10.<init>(r11, r12, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r11 = new androidx.core.text.util.FindAddress$ZipRange
            r13 = 90
            r11.<init>(r13, r9, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r13 = new androidx.core.text.util.FindAddress$ZipRange
            r14 = 80
            r15 = 81
            r13.<init>(r14, r15, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r14 = new androidx.core.text.util.FindAddress$ZipRange
            r15 = 6
            r14.<init>(r15, r15, r2, r2)
            r16 = 35
            androidx.core.text.util.FindAddress$ZipRange r4 = new androidx.core.text.util.FindAddress$ZipRange
            r17 = 36
            r5 = 20
            r4.<init>(r5, r5, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r15 = 19
            r1.<init>(r15, r15, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r15 = new androidx.core.text.util.FindAddress$ZipRange
            r12 = 32
            r5 = 34
            r15.<init>(r12, r5, r2, r2)
            r23 = 34
            androidx.core.text.util.FindAddress$ZipRange r5 = new androidx.core.text.util.FindAddress$ZipRange
            r5.<init>(r9, r9, r2, r2)
            r24 = 32
            androidx.core.text.util.FindAddress$ZipRange r12 = new androidx.core.text.util.FindAddress$ZipRange
            r8 = 30
            r9 = 31
            r12.<init>(r8, r9, r2, r2)
            r27 = 30
            androidx.core.text.util.FindAddress$ZipRange r8 = new androidx.core.text.util.FindAddress$ZipRange
            r9 = 96
            r28 = 31
            r8.<init>(r9, r9, r2, r2)
            r29 = r0
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r0.<init>(r9, r9, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r9 = new androidx.core.text.util.FindAddress$ZipRange
            r30 = r0
            r0 = 50
            r31 = r1
            r1 = 52
            r9.<init>(r0, r1, r2, r2)
            r32 = 50
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r33 = 52
            r1 = 83
            r0.<init>(r1, r1, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r34 = r0
            r0 = 60
            r35 = r3
            r3 = 62
            r1.<init>(r0, r3, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 46
            r36 = r1
            r1 = 47
            r0.<init>(r3, r1, r2, r2)
            r37 = 47
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r38 = 46
            r3 = 66
            r39 = r0
            r0 = 67
            r40 = r4
            r4 = 73
            r1.<init>(r3, r0, r4, r2)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 40
            r4 = 42
            r0.<init>(r3, r4, r2, r2)
            r42 = 40
            androidx.core.text.util.FindAddress$ZipRange r3 = new androidx.core.text.util.FindAddress$ZipRange
            r43 = 42
            r4 = 70
            r44 = r0
            r0 = 71
            r3.<init>(r4, r0, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r4 = 1
            r25 = r1
            r1 = 2
            r0.<init>(r4, r1, r2, r2)
            r45 = 1
            androidx.core.text.util.FindAddress$ZipRange r4 = new androidx.core.text.util.FindAddress$ZipRange
            r1 = 21
            r47 = r0
            r0 = 20
            r4.<init>(r0, r1, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r48 = 21
            r1 = 3
            r49 = r3
            r3 = 4
            r0.<init>(r1, r3, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 96
            r1.<init>(r3, r3, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r3 = new androidx.core.text.util.FindAddress$ZipRange
            r52 = r0
            r0 = 48
            r53 = r1
            r1 = 49
            r3.<init>(r0, r1, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r1 = 55
            r54 = r3
            r3 = 56
            r0.<init>(r1, r3, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 63
            r57 = r0
            r0 = 65
            r1.<init>(r3, r0, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 96
            r0.<init>(r3, r3, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r3 = new androidx.core.text.util.FindAddress$ZipRange
            r58 = r0
            r0 = 39
            r59 = r1
            r1 = 38
            r3.<init>(r1, r0, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r55 = r3
            r1 = 55
            r3 = 56
            r0.<init>(r1, r3, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 27
            r56 = r0
            r0 = 28
            r1.<init>(r3, r0, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 58
            r0.<init>(r3, r3, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r3 = new androidx.core.text.util.FindAddress$ZipRange
            r61 = r0
            r0 = 68
            r62 = r1
            r1 = 69
            r3.<init>(r0, r1, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r50 = r3
            r1 = 3
            r3 = 4
            r0.<init>(r1, r3, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 7
            r51 = r0
            r0 = 8
            r1.<init>(r3, r0, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 87
            r63 = r1
            r1 = 88
            r64 = r4
            r4 = 86
            r0.<init>(r3, r1, r4, r2)
            androidx.core.text.util.FindAddress$ZipRange r4 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 89
            r65 = r0
            r0 = 96
            r4.<init>(r1, r3, r0, r2)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 10
            r1 = 14
            r2 = 0
            r68 = r4
            r4 = 6
            r0.<init>(r3, r1, r2, r4)
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 43
            r4 = 45
            r2 = -1
            r1.<init>(r3, r4, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r3 = new androidx.core.text.util.FindAddress$ZipRange
            r4 = 74
            r67 = r0
            r0 = 73
            r3.<init>(r0, r4, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r4 = 97
            r0.<init>(r4, r4, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r4 = new androidx.core.text.util.FindAddress$ZipRange
            r41 = r0
            r0 = 15
            r70 = r1
            r1 = 19
            r4.<init>(r0, r1, r2, r2)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r1 = 9
            r69 = r3
            r2 = 6
            r3 = 0
            r0.<init>(r2, r2, r3, r1)
            androidx.core.text.util.FindAddress$ZipRange r2 = new androidx.core.text.util.FindAddress$ZipRange
            r1 = 96
            r3 = -1
            r2.<init>(r1, r1, r3, r3)
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r71 = r0
            r0 = 2
            r1.<init>(r0, r0, r3, r3)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r72 = r1
            r1 = 29
            r0.<init>(r1, r1, r3, r3)
            r73 = 29
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r74 = r0
            r0 = 57
            r1.<init>(r0, r0, r3, r3)
            r75 = 57
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r76 = r1
            r1 = 37
            r77 = r2
            r2 = 38
            r0.<init>(r1, r2, r3, r3)
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 75
            r3 = 79
            r78 = r0
            r21 = r4
            r0 = 87
            r4 = 88
            r1.<init>(r2, r3, r0, r4)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 84
            r3 = 84
            r4 = -1
            r0.<init>(r2, r3, r4, r4)
            androidx.core.text.util.FindAddress$ZipRange r2 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 22
            r60 = r0
            r0 = 24
            r66 = r1
            r1 = 20
            r2.<init>(r3, r0, r1, r4)
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r0 = 9
            r3 = 6
            r1.<init>(r3, r0, r4, r4)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r3 = 5
            r0.<init>(r3, r3, r4, r4)
            r79 = 5
            androidx.core.text.util.FindAddress$ZipRange r3 = new androidx.core.text.util.FindAddress$ZipRange
            r80 = r0
            r0 = 98
            r81 = r1
            r1 = 99
            r3.<init>(r0, r1, r4, r4)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r1 = 53
            r18 = r2
            r2 = 54
            r0.<init>(r1, r2, r4, r4)
            androidx.core.text.util.FindAddress$ZipRange r1 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 26
            r82 = r0
            r0 = 24
            r1.<init>(r0, r2, r4, r4)
            androidx.core.text.util.FindAddress$ZipRange r0 = new androidx.core.text.util.FindAddress$ZipRange
            r2 = 82
            r83 = r1
            r1 = 83
            r0.<init>(r2, r1, r4, r4)
            r1 = 59
            androidx.core.text.util.FindAddress$ZipRange[] r1 = new androidx.core.text.util.FindAddress.ZipRange[r1]
            r2 = 0
            r1[r2] = r29
            r1[r45] = r35
            r46 = 2
            r1[r46] = r6
            r2 = 3
            r1[r2] = r7
            r2 = 4
            r1[r2] = r10
            r1[r79] = r11
            r19 = 6
            r1[r19] = r13
            r2 = 7
            r1[r2] = r14
            r2 = 8
            r1[r2] = r40
            r2 = 9
            r1[r2] = r31
            r2 = 10
            r1[r2] = r15
            r2 = 11
            r1[r2] = r5
            r2 = 12
            r1[r2] = r12
            r2 = 13
            r1[r2] = r8
            r2 = 14
            r1[r2] = r30
            r2 = 15
            r1[r2] = r9
            r2 = 16
            r1[r2] = r34
            r2 = 17
            r1[r2] = r36
            r2 = 18
            r1[r2] = r39
            r20 = 19
            r1[r20] = r25
            r22 = 20
            r1[r22] = r44
            r1[r48] = r49
            r2 = 22
            r1[r2] = r47
            r2 = 23
            r1[r2] = r64
            r26 = 24
            r1[r26] = r52
            r2 = 25
            r1[r2] = r53
            r2 = 26
            r1[r2] = r54
            r2 = 27
            r1[r2] = r57
            r2 = 28
            r1[r2] = r59
            r1[r73] = r58
            r1[r27] = r55
            r1[r28] = r56
            r1[r24] = r62
            r2 = 33
            r1[r2] = r61
            r1[r23] = r50
            r1[r16] = r51
            r1[r17] = r63
            r2 = 37
            r1[r2] = r65
            r2 = 38
            r1[r2] = r68
            r2 = 39
            r1[r2] = r67
            r1[r42] = r70
            r2 = 41
            r1[r2] = r69
            r1[r43] = r41
            r2 = 43
            r1[r2] = r21
            r2 = 44
            r1[r2] = r71
            r2 = 45
            r1[r2] = r77
            r1[r38] = r72
            r1[r37] = r74
            r2 = 48
            r1[r2] = r76
            r2 = 49
            r1[r2] = r78
            r1[r32] = r66
            r2 = 51
            r1[r2] = r60
            r1[r33] = r18
            r2 = 53
            r1[r2] = r81
            r2 = 54
            r1[r2] = r80
            r2 = 55
            r1[r2] = r3
            r2 = 56
            r1[r2] = r82
            r1[r75] = r83
            r2 = 58
            r1[r2] = r0
            androidx.core.text.util.FindAddress.sStateZipCodeRanges = r1
            java.lang.String r0 = "[^,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]+(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)"
            r1 = 2
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            androidx.core.text.util.FindAddress.sWordRe = r0
            java.lang.String r0 = "(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?)(?:-(?:one|[0-9]+([a-z](?=[^a-z]|$)|st|nd|rd|th)?))*(?=[,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            androidx.core.text.util.FindAddress.sHouseNumberRe = r0
            java.lang.String r0 = "(?:(ak|alaska)|(al|alabama)|(ar|arkansas)|(as|american[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+samoa)|(az|arizona)|(ca|california)|(co|colorado)|(ct|connecticut)|(dc|district[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+columbia)|(de|delaware)|(fl|florida)|(fm|federated[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+states[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+of[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+micronesia)|(ga|georgia)|(gu|guam)|(hi|hawaii)|(ia|iowa)|(id|idaho)|(il|illinois)|(in|indiana)|(ks|kansas)|(ky|kentucky)|(la|louisiana)|(ma|massachusetts)|(md|maryland)|(me|maine)|(mh|marshall[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(mi|michigan)|(mn|minnesota)|(mo|missouri)|(mp|northern[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mariana[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(ms|mississippi)|(mt|montana)|(nc|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(nd|north[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(ne|nebraska)|(nh|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+hampshire)|(nj|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+jersey)|(nm|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+mexico)|(nv|nevada)|(ny|new[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+york)|(oh|ohio)|(ok|oklahoma)|(or|oregon)|(pa|pennsylvania)|(pr|puerto[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+rico)|(pw|palau)|(ri|rhode[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+island)|(sc|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+carolina)|(sd|south[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+dakota)|(tn|tennessee)|(tx|texas)|(ut|utah)|(va|virginia)|(vi|virgin[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+islands)|(vt|vermont)|(wa|washington)|(wi|wisconsin)|(wv|west[\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000]+virginia)|(wy|wyoming))(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            androidx.core.text.util.FindAddress.sStateRe = r0
            java.lang.String r0 = "(?:alley|annex|arcade|ave[.]?|avenue|alameda|bayou|beach|bend|bluffs?|bottom|boulevard|branch|bridge|brooks?|burgs?|bypass|broadway|camino|camp|canyon|cape|causeway|centers?|circles?|cliffs?|club|common|corners?|course|courts?|coves?|creek|crescent|crest|crossing|crossroad|curve|circulo|dale|dam|divide|drives?|estates?|expressway|extensions?|falls?|ferry|fields?|flats?|fords?|forest|forges?|forks?|fort|freeway|gardens?|gateway|glens?|greens?|groves?|harbors?|haven|heights|highway|hills?|hollow|inlet|islands?|isle|junctions?|keys?|knolls?|lakes?|land|landing|lane|lights?|loaf|locks?|lodge|loop|mall|manors?|meadows?|mews|mills?|mission|motorway|mount|mountains?|neck|orchard|oval|overpass|parks?|parkways?|pass|passage|path|pike|pines?|plains?|plaza|points?|ports?|prairie|privada|radial|ramp|ranch|rapids?|rd[.]?|rest|ridges?|river|roads?|route|row|rue|run|shoals?|shores?|skyway|springs?|spurs?|squares?|station|stravenue|stream|st[.]?|streets?|summit|speedway|terrace|throughway|trace|track|trafficway|trail|tunnel|turnpike|underpass|unions?|valleys?|viaduct|views?|villages?|ville|vista|walks?|wall|ways?|wells?|xing|xrd)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            androidx.core.text.util.FindAddress.sLocationNameRe = r0
            java.lang.String r0 = "([0-9]+)(st|nd|rd|th)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            androidx.core.text.util.FindAddress.sSuffixedNumberRe = r0
            java.lang.String r0 = "(?:[0-9]{5}(?:-[0-9]{4})?)(?=[,*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029]|$)"
            java.util.regex.Pattern r0 = java.util.regex.Pattern.compile(r0, r1)
            androidx.core.text.util.FindAddress.sZipCodeRe = r0
            return
    }

    private FindAddress() {
            r0 = this;
            r0.<init>()
            return
    }

    private static int attemptMatch(java.lang.String r13, java.util.regex.MatchResult r14) {
            int r14 = r14.end()
            java.util.regex.Pattern r0 = androidx.core.text.util.FindAddress.sWordRe
            java.util.regex.Matcher r0 = r0.matcher(r13)
            r1 = -1
            r2 = 1
            r3 = 0
            java.lang.String r4 = ""
            r5 = 1
            r6 = 1
            r7 = 1
            r8 = 0
            r9 = -1
            r10 = -1
        L15:
            int r11 = r13.length()
            if (r14 >= r11) goto Ld5
            boolean r11 = r0.find(r14)
            if (r11 != 0) goto L27
            int r13 = r13.length()
        L25:
            int r13 = -r13
            return r13
        L27:
            int r11 = r0.end()
            int r12 = r0.start()
            int r11 = r11 - r12
            r12 = 25
            if (r11 <= r12) goto L39
            int r13 = r0.end()
            goto L25
        L39:
            int r11 = r0.start()
            if (r14 >= r11) goto L51
            int r11 = r14 + 1
            char r14 = r13.charAt(r14)
            java.lang.String r12 = "\n\u000b\f\r\u0085\u2028\u2029"
            int r14 = r12.indexOf(r14)
            if (r14 == r1) goto L4f
            int r5 = r5 + 1
        L4f:
            r14 = r11
            goto L39
        L51:
            r11 = 5
            if (r5 <= r11) goto L56
            goto Ld5
        L56:
            int r6 = r6 + r2
            r12 = 14
            if (r6 <= r12) goto L5d
            goto Ld5
        L5d:
            java.util.regex.MatchResult r12 = matchHouseNumber(r13, r14)
            if (r12 == 0) goto L6d
            if (r7 == 0) goto L69
            if (r5 <= r2) goto L69
            int r13 = -r14
            return r13
        L69:
            if (r9 != r1) goto Lcb
            r9 = r14
            goto Lcb
        L6d:
            java.lang.String r7 = r0.group(r3)
            boolean r7 = isValidLocationName(r7)
            if (r7 == 0) goto L7a
            r7 = 0
            r8 = 1
            goto Lcb
        L7a:
            if (r6 != r11) goto L83
            if (r8 != 0) goto L83
            int r14 = r0.end()
            goto Ld5
        L83:
            if (r8 == 0) goto Lca
            r7 = 4
            if (r6 <= r7) goto Lca
            java.util.regex.MatchResult r14 = matchState(r13, r14)
            if (r14 == 0) goto Lca
            java.lang.String r7 = "et"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto La7
            java.lang.String r4 = r14.group(r3)
            java.lang.String r7 = "al"
            boolean r4 = r4.equals(r7)
            if (r4 == 0) goto La7
            int r14 = r14.end()
            goto Ld5
        La7:
            java.util.regex.Pattern r4 = androidx.core.text.util.FindAddress.sWordRe
            java.util.regex.Matcher r4 = r4.matcher(r13)
            int r7 = r14.end()
            boolean r7 = r4.find(r7)
            if (r7 == 0) goto Lc6
            java.lang.String r7 = r4.group(r3)
            boolean r14 = isValidZipCode(r7, r14)
            if (r14 == 0) goto Lca
            int r13 = r4.end()
            return r13
        Lc6:
            int r10 = r14.end()
        Lca:
            r7 = 0
        Lcb:
            java.lang.String r4 = r0.group(r3)
            int r14 = r0.end()
            goto L15
        Ld5:
            if (r10 <= 0) goto Ld8
            return r10
        Ld8:
            if (r9 <= 0) goto Ldb
            goto Ldc
        Ldb:
            r9 = r14
        Ldc:
            int r13 = -r9
            return r13
    }

    private static boolean checkHouseNumber(java.lang.String r5) {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r5.length()
            if (r1 >= r3) goto L18
            char r3 = r5.charAt(r1)
            boolean r3 = java.lang.Character.isDigit(r3)
            if (r3 == 0) goto L15
            int r2 = r2 + 1
        L15:
            int r1 = r1 + 1
            goto L3
        L18:
            r1 = 5
            if (r2 <= r1) goto L1c
            return r0
        L1c:
            java.util.regex.Pattern r1 = androidx.core.text.util.FindAddress.sSuffixedNumberRe
            java.util.regex.Matcher r5 = r1.matcher(r5)
            boolean r1 = r5.find()
            r2 = 1
            if (r1 == 0) goto L7b
            java.lang.String r1 = r5.group(r2)
            int r1 = java.lang.Integer.parseInt(r1)
            if (r1 != 0) goto L34
            return r0
        L34:
            r0 = 2
            java.lang.String r5 = r5.group(r0)
            java.util.Locale r3 = java.util.Locale.getDefault()
            java.lang.String r5 = r5.toLowerCase(r3)
            int r3 = r1 % 10
            java.lang.String r4 = "th"
            if (r3 == r2) goto L6d
            if (r3 == r0) goto L5f
            r0 = 3
            if (r3 == r0) goto L51
            boolean r5 = r5.equals(r4)
            return r5
        L51:
            int r1 = r1 % 100
            r0 = 13
            if (r1 != r0) goto L58
            goto L5a
        L58:
            java.lang.String r4 = "rd"
        L5a:
            boolean r5 = r5.equals(r4)
            return r5
        L5f:
            int r1 = r1 % 100
            r0 = 12
            if (r1 != r0) goto L66
            goto L68
        L66:
            java.lang.String r4 = "nd"
        L68:
            boolean r5 = r5.equals(r4)
            return r5
        L6d:
            int r1 = r1 % 100
            r0 = 11
            if (r1 != r0) goto L74
            goto L76
        L74:
            java.lang.String r4 = "st"
        L76:
            boolean r5 = r5.equals(r4)
            return r5
        L7b:
            return r2
    }

    static java.lang.String findAddress(java.lang.String r4) {
            java.util.regex.Pattern r0 = androidx.core.text.util.FindAddress.sHouseNumberRe
            java.util.regex.Matcher r0 = r0.matcher(r4)
            r1 = 0
            r2 = 0
        L8:
            boolean r2 = r0.find(r2)
            if (r2 == 0) goto L2e
            java.lang.String r2 = r0.group(r1)
            boolean r2 = checkHouseNumber(r2)
            if (r2 == 0) goto L29
            int r2 = r0.start()
            int r3 = attemptMatch(r4, r0)
            if (r3 <= 0) goto L27
            java.lang.String r4 = r4.substring(r2, r3)
            return r4
        L27:
            int r2 = -r3
            goto L8
        L29:
            int r2 = r0.end()
            goto L8
        L2e:
            r4 = 0
            return r4
    }

    @androidx.annotation.VisibleForTesting
    public static boolean isValidLocationName(java.lang.String r1) {
            java.util.regex.Pattern r0 = androidx.core.text.util.FindAddress.sLocationNameRe
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }

    @androidx.annotation.VisibleForTesting
    public static boolean isValidZipCode(java.lang.String r1) {
            java.util.regex.Pattern r0 = androidx.core.text.util.FindAddress.sZipCodeRe
            java.util.regex.Matcher r1 = r0.matcher(r1)
            boolean r1 = r1.matches()
            return r1
    }

    @androidx.annotation.VisibleForTesting
    public static boolean isValidZipCode(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            java.util.regex.MatchResult r2 = matchState(r2, r0)
            boolean r1 = isValidZipCode(r1, r2)
            return r1
    }

    private static boolean isValidZipCode(java.lang.String r3, java.util.regex.MatchResult r4) {
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            int r1 = r4.groupCount()
        L8:
            if (r1 <= 0) goto L16
            int r2 = r1 + (-1)
            java.lang.String r1 = r4.group(r1)
            if (r1 == 0) goto L14
            r1 = r2
            goto L16
        L14:
            r1 = r2
            goto L8
        L16:
            java.util.regex.Pattern r4 = androidx.core.text.util.FindAddress.sZipCodeRe
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r4 = r4.matches()
            if (r4 == 0) goto L2e
            androidx.core.text.util.FindAddress$ZipRange[] r4 = androidx.core.text.util.FindAddress.sStateZipCodeRanges
            r4 = r4[r1]
            boolean r3 = r4.matches(r3)
            if (r3 == 0) goto L2e
            r3 = 1
            return r3
        L2e:
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public static java.util.regex.MatchResult matchHouseNumber(java.lang.String r3, int r4) {
            r0 = 0
            if (r4 <= 0) goto L13
            int r1 = r4 + (-1)
            char r1 = r3.charAt(r1)
            java.lang.String r2 = ":,\"'\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029"
            int r1 = r2.indexOf(r1)
            r2 = -1
            if (r1 != r2) goto L13
            return r0
        L13:
            java.util.regex.Pattern r1 = androidx.core.text.util.FindAddress.sHouseNumberRe
            java.util.regex.Matcher r1 = r1.matcher(r3)
            int r3 = r3.length()
            java.util.regex.Matcher r3 = r1.region(r4, r3)
            boolean r4 = r3.lookingAt()
            if (r4 == 0) goto L37
            java.util.regex.MatchResult r3 = r3.toMatchResult()
            r4 = 0
            java.lang.String r4 = r3.group(r4)
            boolean r4 = checkHouseNumber(r4)
            if (r4 == 0) goto L37
            return r3
        L37:
            return r0
    }

    @androidx.annotation.VisibleForTesting
    public static java.util.regex.MatchResult matchState(java.lang.String r3, int r4) {
            r0 = 0
            if (r4 <= 0) goto L13
            int r1 = r4 + (-1)
            char r1 = r3.charAt(r1)
            java.lang.String r2 = ",*•\t  \u1680\u2000\u2001\u2002\u2003\u2004\u2005\u2006 \u2008\u2009\u200a \u205f\u3000\n\u000b\f\r\u0085\u2028\u2029"
            int r1 = r2.indexOf(r1)
            r2 = -1
            if (r1 != r2) goto L13
            return r0
        L13:
            java.util.regex.Pattern r1 = androidx.core.text.util.FindAddress.sStateRe
            java.util.regex.Matcher r1 = r1.matcher(r3)
            int r3 = r3.length()
            java.util.regex.Matcher r3 = r1.region(r4, r3)
            boolean r4 = r3.lookingAt()
            if (r4 == 0) goto L2c
            java.util.regex.MatchResult r3 = r3.toMatchResult()
            return r3
        L2c:
            return r0
    }
}

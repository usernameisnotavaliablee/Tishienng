package com.google.android.gms.common.server.response;

import com.google.android.gms.common.server.response.FastJsonResponse;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.android.gms.common.internal.ShowFirstParty
@com.google.android.gms.common.annotation.KeepForSdk
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class FastParser<T extends com.google.android.gms.common.server.response.FastJsonResponse> {
    private static final char[] zaa = null;
    private static final char[] zab = null;
    private static final char[] zac = null;
    private static final char[] zad = null;
    private static final char[] zae = null;
    private static final char[] zaf = null;
    private static final com.google.android.gms.common.server.response.zai zag = null;
    private static final com.google.android.gms.common.server.response.zai zah = null;
    private static final com.google.android.gms.common.server.response.zai zai = null;
    private static final com.google.android.gms.common.server.response.zai zaj = null;
    private static final com.google.android.gms.common.server.response.zai zak = null;
    private static final com.google.android.gms.common.server.response.zai zal = null;
    private static final com.google.android.gms.common.server.response.zai zam = null;
    private static final com.google.android.gms.common.server.response.zai zan = null;
    private final char[] zao;
    private final char[] zap;
    private final char[] zaq;
    private final java.lang.StringBuilder zar;
    private final java.lang.StringBuilder zas;
    private final java.util.Stack zat;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    @com.google.android.gms.common.internal.ShowFirstParty
    @com.google.android.gms.common.annotation.KeepForSdk
    public static class ParseException extends java.lang.Exception {
        public ParseException(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public ParseException(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull java.lang.Throwable r2) {
                r0 = this;
                java.lang.String r1 = "Error instantiating inner object"
                r0.<init>(r1, r2)
                return
        }

        public ParseException(@androidx.annotation.NonNull java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    static {
            r0 = 3
            char[] r1 = new char[r0]
            r1 = {x006a: FILL_ARRAY_DATA , data: [117, 108, 108} // fill-array
            com.google.android.gms.common.server.response.FastParser.zaa = r1
            char[] r0 = new char[r0]
            r0 = {x0072: FILL_ARRAY_DATA , data: [114, 117, 101} // fill-array
            com.google.android.gms.common.server.response.FastParser.zab = r0
            r0 = 4
            char[] r1 = new char[r0]
            r1 = {x007a: FILL_ARRAY_DATA , data: [114, 117, 101, 34} // fill-array
            com.google.android.gms.common.server.response.FastParser.zac = r1
            char[] r0 = new char[r0]
            r0 = {x0082: FILL_ARRAY_DATA , data: [97, 108, 115, 101} // fill-array
            com.google.android.gms.common.server.response.FastParser.zad = r0
            r0 = 5
            char[] r0 = new char[r0]
            r0 = {x008a: FILL_ARRAY_DATA , data: [97, 108, 115, 101, 34} // fill-array
            com.google.android.gms.common.server.response.FastParser.zae = r0
            r0 = 1
            char[] r0 = new char[r0]
            r1 = 10
            r2 = 0
            r0[r2] = r1
            com.google.android.gms.common.server.response.FastParser.zaf = r0
            com.google.android.gms.common.server.response.zaa r0 = new com.google.android.gms.common.server.response.zaa
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zag = r0
            com.google.android.gms.common.server.response.zab r0 = new com.google.android.gms.common.server.response.zab
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zah = r0
            com.google.android.gms.common.server.response.zac r0 = new com.google.android.gms.common.server.response.zac
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zai = r0
            com.google.android.gms.common.server.response.zad r0 = new com.google.android.gms.common.server.response.zad
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zaj = r0
            com.google.android.gms.common.server.response.zae r0 = new com.google.android.gms.common.server.response.zae
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zak = r0
            com.google.android.gms.common.server.response.zaf r0 = new com.google.android.gms.common.server.response.zaf
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zal = r0
            com.google.android.gms.common.server.response.zag r0 = new com.google.android.gms.common.server.response.zag
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zam = r0
            com.google.android.gms.common.server.response.zah r0 = new com.google.android.gms.common.server.response.zah
            r0.<init>()
            com.google.android.gms.common.server.response.FastParser.zan = r0
            return
    }

    public FastParser() {
            r3 = this;
            r3.<init>()
            r0 = 1
            char[] r0 = new char[r0]
            r3.zao = r0
            r0 = 32
            char[] r1 = new char[r0]
            r3.zap = r1
            r1 = 1024(0x400, float:1.435E-42)
            char[] r2 = new char[r1]
            r3.zaq = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>(r0)
            r3.zar = r2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r1)
            r3.zas = r0
            java.util.Stack r0 = new java.util.Stack
            r0.<init>()
            r3.zat = r0
            return
    }

    private static final java.lang.String zaA(java.io.BufferedReader r8, char[] r9, java.lang.StringBuilder r10, @androidx.annotation.Nullable char[] r11) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r0 = 0
            r10.setLength(r0)
            int r1 = r9.length
            r8.mark(r1)
            r1 = 0
            r2 = 0
        La:
            int r3 = r8.read(r9)
            r4 = -1
            if (r3 == r4) goto L60
            r4 = 0
        L12:
            if (r4 >= r3) goto L58
            char r5 = r9[r4]
            boolean r6 = java.lang.Character.isISOControl(r5)
            if (r6 == 0) goto L2b
            if (r11 == 0) goto L23
            char r6 = r11[r0]
            if (r6 != r5) goto L23
            goto L2b
        L23:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected control character while reading string"
            r8.<init>(r9)
            throw r8
        L2b:
            int r6 = r4 + 1
            r7 = 34
            if (r5 != r7) goto L4f
            if (r1 != 0) goto L4d
            r10.append(r9, r0, r4)
            r8.reset()
            long r0 = (long) r6
            r8.skip(r0)
            if (r2 == 0) goto L48
            java.lang.String r8 = r10.toString()
            java.lang.String r8 = com.google.android.gms.common.util.JsonUtils.unescapeString(r8)
            return r8
        L48:
            java.lang.String r8 = r10.toString()
            return r8
        L4d:
            r1 = 0
            goto L56
        L4f:
            r4 = 92
            if (r5 != r4) goto L4d
            r1 = r1 ^ 1
            r2 = 1
        L56:
            r4 = r6
            goto L12
        L58:
            r10.append(r9, r0, r3)
            int r3 = r9.length
            r8.mark(r3)
            goto La
        L60:
            com.google.android.gms.common.server.response.FastParser$ParseException r8 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r9 = "Unexpected EOF while parsing string"
            r8.<init>(r9)
            throw r8
    }

    static /* bridge */ /* synthetic */ double zaa(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            double r0 = r0.zaj(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ float zab(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            float r0 = r0.zak(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ int zac(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            int r0 = r0.zal(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ long zad(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            long r0 = r0.zan(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String zae(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            java.lang.String r0 = r0.zao(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ java.math.BigDecimal zaf(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            java.math.BigDecimal r0 = r0.zas(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ java.math.BigInteger zag(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1) {
            java.math.BigInteger r0 = r0.zat(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ boolean zah(com.google.android.gms.common.server.response.FastParser r0, java.io.BufferedReader r1, boolean r2) {
            r2 = 0
            boolean r0 = r0.zay(r1, r2)
            return r0
    }

    private final char zai(java.io.BufferedReader r4) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = r3.zao
            int r0 = r4.read(r0)
            r1 = 0
            r2 = -1
            if (r0 == r2) goto L22
        La:
            char[] r0 = r3.zao
            char r0 = r0[r1]
            boolean r0 = java.lang.Character.isWhitespace(r0)
            if (r0 == 0) goto L1d
            char[] r0 = r3.zao
            int r0 = r4.read(r0)
            if (r0 != r2) goto La
            goto L22
        L1d:
            char[] r4 = r3.zao
            char r4 = r4[r1]
            return r4
        L22:
            return r1
    }

    private final double zaj(java.io.BufferedReader r4) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = r3.zaq
            int r4 = r3.zam(r4, r0)
            if (r4 != 0) goto Lb
            r0 = 0
            return r0
        Lb:
            char[] r0 = r3.zaq
            java.lang.String r1 = new java.lang.String
            r2 = 0
            r1.<init>(r0, r2, r4)
            double r0 = java.lang.Double.parseDouble(r1)
            return r0
    }

    private final float zak(java.io.BufferedReader r4) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = r3.zaq
            int r4 = r3.zam(r4, r0)
            if (r4 != 0) goto La
            r4 = 0
            return r4
        La:
            char[] r0 = r3.zaq
            java.lang.String r1 = new java.lang.String
            r2 = 0
            r1.<init>(r0, r2, r4)
            float r4 = java.lang.Float.parseFloat(r1)
            return r4
    }

    private final int zal(java.io.BufferedReader r12) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r11 = this;
            char[] r0 = r11.zaq
            int r12 = r11.zam(r12, r0)
            r0 = 0
            if (r12 != 0) goto La
            return r0
        La:
            char[] r1 = r11.zaq
            if (r12 <= 0) goto L77
            char r2 = r1[r0]
            r3 = 45
            if (r2 != r3) goto L17
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L1a
        L17:
            r4 = -2147483647(0xffffffff80000001, float:-1.4E-45)
        L1a:
            r5 = 1
            if (r2 != r3) goto L1f
            r2 = 1
            goto L20
        L1f:
            r2 = 0
        L20:
            java.lang.String r3 = "Unexpected non-digit character"
            r6 = 10
            if (r2 >= r12) goto L38
            int r0 = r2 + 1
            char r7 = r1[r2]
            int r7 = java.lang.Character.digit(r7, r6)
            if (r7 < 0) goto L32
            int r7 = -r7
            goto L3a
        L32:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r3)
            throw r12
        L38:
            r0 = r2
            r7 = 0
        L3a:
            if (r0 >= r12) goto L68
            int r8 = r0 + 1
            char r0 = r1[r0]
            int r0 = java.lang.Character.digit(r0, r6)
            if (r0 < 0) goto L62
            r9 = -214748364(0xfffffffff3333334, float:-1.4197688E31)
            java.lang.String r10 = "Number too large"
            if (r7 < r9) goto L5c
            int r7 = r7 * 10
            int r9 = r4 + r0
            if (r7 < r9) goto L56
            int r7 = r7 - r0
            r0 = r8
            goto L3a
        L56:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r10)
            throw r12
        L5c:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r10)
            throw r12
        L62:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r12.<init>(r3)
            throw r12
        L68:
            if (r2 == 0) goto L75
            if (r0 <= r5) goto L6d
            return r7
        L6d:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "No digits to parse"
            r12.<init>(r0)
            throw r12
        L75:
            int r12 = -r7
            return r12
        L77:
            com.google.android.gms.common.server.response.FastParser$ParseException r12 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "No number to parse"
            r12.<init>(r0)
            throw r12
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final int zam(java.io.BufferedReader r11, char[] r12) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r10 = this;
            char r0 = r10.zai(r11)
            java.lang.String r1 = "Unexpected EOF"
            if (r0 == 0) goto L9c
            r2 = 44
            if (r0 == r2) goto L94
            r3 = 110(0x6e, float:1.54E-43)
            r4 = 0
            if (r0 != r3) goto L17
            char[] r12 = com.google.android.gms.common.server.response.FastParser.zaa
            r10.zax(r11, r12)
            return r4
        L17:
            r3 = 1024(0x400, float:1.435E-42)
            r11.mark(r3)
            r5 = 34
            r6 = -1
            r7 = 1
            if (r0 != r5) goto L55
            r0 = 0
            r2 = 0
        L24:
            if (r0 >= r3) goto L84
            int r8 = r11.read(r12, r0, r7)
            if (r8 == r6) goto L84
            char r8 = r12[r0]
            boolean r9 = java.lang.Character.isISOControl(r8)
            if (r9 != 0) goto L4d
            int r9 = r0 + 1
            if (r8 != r5) goto L44
            if (r2 == 0) goto L3c
        L3a:
            r2 = 0
            goto L4b
        L3c:
            r11.reset()
            long r1 = (long) r9
            r11.skip(r1)
            return r0
        L44:
            r0 = 92
            if (r8 != r0) goto L3a
            r0 = r2 ^ 1
            r2 = r0
        L4b:
            r0 = r9
            goto L24
        L4d:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r12 = "Unexpected control character while reading string"
            r11.<init>(r12)
            throw r11
        L55:
            r12[r4] = r0
            r0 = 1
        L58:
            if (r0 >= r3) goto L84
            int r5 = r11.read(r12, r0, r7)
            if (r5 == r6) goto L84
            char r5 = r12[r0]
            r8 = 125(0x7d, float:1.75E-43)
            if (r5 == r8) goto L78
            if (r5 == r2) goto L78
            boolean r5 = java.lang.Character.isWhitespace(r5)
            if (r5 != 0) goto L78
            char r5 = r12[r0]
            r8 = 93
            if (r5 != r8) goto L75
            goto L78
        L75:
            int r0 = r0 + 1
            goto L58
        L78:
            r11.reset()
            int r1 = r0 + (-1)
            long r1 = (long) r1
            r11.skip(r1)
            r12[r0] = r4
            return r0
        L84:
            if (r0 != r3) goto L8e
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r12 = "Absurdly long value"
            r11.<init>(r12)
            throw r11
        L8e:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r11.<init>(r1)
            throw r11
        L94:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r12 = "Missing value"
            r11.<init>(r12)
            throw r11
        L9c:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r11.<init>(r1)
            throw r11
    }

    private final long zan(java.io.BufferedReader r19) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r18 = this;
            r0 = r18
            char[] r1 = r0.zaq
            r2 = r19
            int r1 = r0.zam(r2, r1)
            r2 = 0
            if (r1 != 0) goto Lf
            return r2
        Lf:
            char[] r4 = r0.zaq
            if (r1 <= 0) goto L87
            r5 = 0
            char r6 = r4[r5]
            r7 = 45
            if (r6 != r7) goto L1d
            r8 = -9223372036854775808
            goto L22
        L1d:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L22:
            r10 = 1
            if (r6 != r7) goto L26
            r5 = 1
        L26:
            java.lang.String r6 = "Unexpected non-digit character"
            r7 = 10
            if (r5 >= r1) goto L3f
            int r2 = r5 + 1
            char r3 = r4[r5]
            int r3 = java.lang.Character.digit(r3, r7)
            if (r3 < 0) goto L39
            int r3 = -r3
            long r11 = (long) r3
            goto L41
        L39:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r6)
            throw r1
        L3f:
            r11 = r2
            r2 = r5
        L41:
            if (r2 >= r1) goto L78
            int r3 = r2 + 1
            char r2 = r4[r2]
            int r2 = java.lang.Character.digit(r2, r7)
            if (r2 < 0) goto L72
            r13 = -922337203685477580(0xf333333333333334, double:-8.390303882365713E246)
            java.lang.String r15 = "Number too large"
            int r16 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r16 < 0) goto L6c
            r13 = 10
            long r11 = r11 * r13
            long r13 = (long) r2
            long r16 = r8 + r13
            int r2 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r2 < 0) goto L66
            long r11 = r11 - r13
            r2 = r3
            goto L41
        L66:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r15)
            throw r1
        L6c:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r15)
            throw r1
        L72:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r1.<init>(r6)
            throw r1
        L78:
            if (r5 == 0) goto L85
            if (r2 <= r10) goto L7d
            return r11
        L7d:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "No digits to parse"
            r1.<init>(r2)
            throw r1
        L85:
            long r1 = -r11
            return r1
        L87:
            com.google.android.gms.common.server.response.FastParser$ParseException r1 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "No number to parse"
            r1.<init>(r2)
            throw r1
    }

    @androidx.annotation.Nullable
    private final java.lang.String zao(java.io.BufferedReader r4) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r3 = this;
            char[] r0 = r3.zap
            java.lang.StringBuilder r1 = r3.zar
            r2 = 0
            java.lang.String r4 = r3.zap(r4, r0, r1, r2)
            return r4
    }

    @androidx.annotation.Nullable
    private final java.lang.String zap(java.io.BufferedReader r3, char[] r4, java.lang.StringBuilder r5, @androidx.annotation.Nullable char[] r6) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r2 = this;
            char r0 = r2.zai(r3)
            r1 = 34
            if (r0 == r1) goto L1b
            r4 = 110(0x6e, float:1.54E-43)
            if (r0 != r4) goto L13
            char[] r4 = com.google.android.gms.common.server.response.FastParser.zaa
            r2.zax(r3, r4)
            r3 = 0
            return r3
        L13:
            com.google.android.gms.common.server.response.FastParser$ParseException r3 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r4 = "Expected string"
            r3.<init>(r4)
            throw r3
        L1b:
            java.lang.String r3 = zaA(r3, r4, r5, r6)
            return r3
    }

    @androidx.annotation.Nullable
    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final java.lang.String zaq(java.io.BufferedReader r5) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            java.util.Stack r0 = r4.zat
            r1 = 2
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.push(r2)
            char r0 = r4.zai(r5)
            r2 = 34
            r3 = 0
            if (r0 == r2) goto L42
            r5 = 93
            if (r0 == r5) goto L36
            r5 = 125(0x7d, float:1.75E-43)
            if (r0 != r5) goto L1f
            r4.zaw(r1)
            return r3
        L1f:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Unexpected token: "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r5.<init>(r0)
            throw r5
        L36:
            r4.zaw(r1)
            r5 = 1
            r4.zaw(r5)
            r5 = 5
            r4.zaw(r5)
            return r3
        L42:
            java.util.Stack r0 = r4.zat
            r1 = 3
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.push(r2)
            char[] r0 = r4.zap
            java.lang.StringBuilder r2 = r4.zar
            java.lang.String r0 = zaA(r5, r0, r2, r3)
            r4.zaw(r1)
            char r5 = r4.zai(r5)
            r1 = 58
            if (r5 != r1) goto L60
            return r0
        L60:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "Expected key/value separator"
            r5.<init>(r0)
            throw r5
    }

    @androidx.annotation.Nullable
    private final java.lang.String zar(java.io.BufferedReader r15) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r14 = this;
            r0 = 1024(0x400, float:1.435E-42)
            r15.mark(r0)
            char r0 = r14.zai(r15)
            r1 = 92
            java.lang.String r2 = "Unexpected token "
            r3 = 125(0x7d, float:1.75E-43)
            r4 = 44
            r5 = 0
            r6 = 1
            r7 = 34
            if (r0 == r7) goto Ld1
            if (r0 == r4) goto Lc9
            r8 = 32
            r9 = 91
            if (r0 == r9) goto L6c
            r1 = 123(0x7b, float:1.72E-43)
            if (r0 == r1) goto L2d
            r15.reset()
            char[] r0 = r14.zaq
            r14.zam(r15, r0)
            goto Le9
        L2d:
            java.util.Stack r0 = r14.zat
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0.push(r1)
            r15.mark(r8)
            char r0 = r14.zai(r15)
            if (r0 != r3) goto L44
            r14.zaw(r6)
            goto Le9
        L44:
            if (r0 != r7) goto L57
            r15.reset()
            r14.zaq(r15)
        L4c:
            java.lang.String r0 = r14.zar(r15)
            if (r0 != 0) goto L4c
            r14.zaw(r6)
            goto Le9
        L57:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L6c:
            java.util.Stack r0 = r14.zat
            r10 = 5
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r0.push(r11)
            r15.mark(r8)
            char r0 = r14.zai(r15)
            r8 = 93
            if (r0 != r8) goto L85
            r14.zaw(r10)
            goto Le9
        L85:
            r15.reset()
            r0 = 0
        L89:
            r11 = 0
        L8a:
            if (r6 <= 0) goto Lc5
            char r12 = r14.zai(r15)
            if (r12 == 0) goto Lbd
            boolean r13 = java.lang.Character.isISOControl(r12)
            if (r13 != 0) goto Lb5
            if (r12 != r7) goto La0
            if (r11 != 0) goto L9e
            r0 = r0 ^ 1
        L9e:
            r12 = 34
        La0:
            if (r12 != r9) goto La8
            if (r0 != 0) goto La6
            int r6 = r6 + 1
        La6:
            r12 = 91
        La8:
            if (r12 != r8) goto Lae
            if (r0 != 0) goto Lae
            int r6 = r6 + (-1)
        Lae:
            if (r12 != r1) goto L89
            if (r0 == 0) goto L89
            r11 = r11 ^ 1
            goto L8a
        Lb5:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "Unexpected control character while reading array"
            r15.<init>(r0)
            throw r15
        Lbd:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "Unexpected EOF while parsing array"
            r15.<init>(r0)
            throw r15
        Lc5:
            r14.zaw(r10)
            goto Le9
        Lc9:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "Missing value"
            r15.<init>(r0)
            throw r15
        Ld1:
            char[] r0 = r14.zao
            int r0 = r15.read(r0)
            java.lang.String r8 = "Unexpected EOF while parsing string"
            r9 = -1
            if (r0 == r9) goto L13c
            char[] r0 = r14.zao
            char r0 = r0[r5]
            r10 = 0
        Le1:
            if (r0 != r7) goto L114
            if (r10 == 0) goto Le9
            r0 = 34
            r10 = 1
            goto L114
        Le9:
            char r0 = r14.zai(r15)
            r1 = 2
            if (r0 == r4) goto L10c
            if (r0 != r3) goto Lf7
            r14.zaw(r1)
            r15 = 0
            return r15
        Lf7:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L10c:
            r14.zaw(r1)
            java.lang.String r15 = r14.zaq(r15)
            return r15
        L114:
            if (r0 != r1) goto L11a
            r0 = r10 ^ 1
            r10 = r0
            goto L11b
        L11a:
            r10 = 0
        L11b:
            char[] r0 = r14.zao
            int r0 = r15.read(r0)
            if (r0 == r9) goto L136
            char[] r0 = r14.zao
            char r0 = r0[r5]
            boolean r11 = java.lang.Character.isISOControl(r0)
            if (r11 != 0) goto L12e
            goto Le1
        L12e:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r0 = "Unexpected control character while reading string"
            r15.<init>(r0)
            throw r15
        L136:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r15.<init>(r8)
            throw r15
        L13c:
            com.google.android.gms.common.server.response.FastParser$ParseException r15 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r15.<init>(r8)
            throw r15
    }

    @androidx.annotation.Nullable
    private final java.math.BigDecimal zas(java.io.BufferedReader r5) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            char[] r0 = r4.zaq
            int r5 = r4.zam(r5, r0)
            if (r5 != 0) goto La
            r5 = 0
            return r5
        La:
            char[] r0 = r4.zaq
            java.math.BigDecimal r1 = new java.math.BigDecimal
            java.lang.String r2 = new java.lang.String
            r3 = 0
            r2.<init>(r0, r3, r5)
            r1.<init>(r2)
            return r1
    }

    @androidx.annotation.Nullable
    private final java.math.BigInteger zat(java.io.BufferedReader r5) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            char[] r0 = r4.zaq
            int r5 = r4.zam(r5, r0)
            if (r5 != 0) goto La
            r5 = 0
            return r5
        La:
            char[] r0 = r4.zaq
            java.math.BigInteger r1 = new java.math.BigInteger
            java.lang.String r2 = new java.lang.String
            r3 = 0
            r2.<init>(r0, r3, r5)
            r1.<init>(r2)
            return r1
    }

    @androidx.annotation.Nullable
    private final java.util.ArrayList zau(java.io.BufferedReader r5, com.google.android.gms.common.server.response.zai r6) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            char r0 = r4.zai(r5)
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto Lf
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zaa
            r4.zax(r5, r6)
            r5 = 0
            return r5
        Lf:
            r1 = 91
            if (r0 != r1) goto L4c
            java.util.Stack r0 = r4.zat
            r1 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)
            r0.push(r2)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L22:
            r2 = 1024(0x400, float:1.435E-42)
            r5.mark(r2)
            char r2 = r4.zai(r5)
            if (r2 == 0) goto L44
            r3 = 44
            if (r2 == r3) goto L22
            r3 = 93
            if (r2 == r3) goto L40
            r5.reset()
            java.lang.Object r2 = r6.zaa(r4, r5)
            r0.add(r2)
            goto L22
        L40:
            r4.zaw(r1)
            return r0
        L44:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r6 = "Unexpected EOF"
            r5.<init>(r6)
            throw r5
        L4c:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r6 = "Expected start of array"
            r5.<init>(r6)
            throw r5
    }

    @androidx.annotation.Nullable
    private final java.util.ArrayList zav(java.io.BufferedReader r10, com.google.android.gms.common.server.response.FastJsonResponse.Field r11) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r9 = this;
            java.lang.String r0 = "Error instantiating inner object"
            r1 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            char r3 = r9.zai(r10)
            r4 = 5
            r5 = 93
            if (r3 == r5) goto L98
            r6 = 110(0x6e, float:1.54E-43)
            if (r3 == r6) goto L8e
            java.lang.String r6 = "Unexpected token: "
            r7 = 123(0x7b, float:1.72E-43)
            if (r3 != r7) goto L79
            java.util.Stack r3 = r9.zat
            r3.push(r1)
        L24:
            com.google.android.gms.common.server.response.FastJsonResponse r3 = r11.zad()     // Catch: java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L6a
            boolean r8 = r9.zaz(r10, r3)     // Catch: java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L6a
            if (r8 == 0) goto L6c
            r2.add(r3)     // Catch: java.lang.IllegalAccessException -> L68 java.lang.InstantiationException -> L6a
            char r3 = r9.zai(r10)
            r8 = 44
            if (r3 == r8) goto L54
            if (r3 != r5) goto L3f
            r9.zaw(r4)
            return r2
        L3f:
            com.google.android.gms.common.server.response.FastParser$ParseException r10 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L54:
            char r3 = r9.zai(r10)
            if (r3 != r7) goto L60
            java.util.Stack r3 = r9.zat
            r3.push(r1)
            goto L24
        L60:
            com.google.android.gms.common.server.response.FastParser$ParseException r10 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r11 = "Expected start of next object in array"
            r10.<init>(r11)
            throw r10
        L68:
            r10 = move-exception
            goto L6d
        L6a:
            r10 = move-exception
            goto L73
        L6c:
            return r2
        L6d:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r11.<init>(r0, r10)
            throw r11
        L73:
            com.google.android.gms.common.server.response.FastParser$ParseException r11 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r11.<init>(r0, r10)
            throw r11
        L79:
            com.google.android.gms.common.server.response.FastParser$ParseException r10 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r6)
            r11.append(r3)
            java.lang.String r11 = r11.toString()
            r10.<init>(r11)
            throw r10
        L8e:
            char[] r11 = com.google.android.gms.common.server.response.FastParser.zaa
            r9.zax(r10, r11)
            r9.zaw(r4)
            r10 = 0
            return r10
        L98:
            r9.zaw(r4)
            return r2
    }

    private final void zaw(int r5) throws com.google.android.gms.common.server.response.FastParser.ParseException {
            r4 = this;
            java.util.Stack r0 = r4.zat
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "Expected state "
            if (r0 != 0) goto L36
            java.util.Stack r0 = r4.zat
            java.lang.Object r0 = r0.pop()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            if (r0 != r5) goto L19
            return
        L19:
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r5)
            java.lang.String r5 = " but had "
            r3.append(r5)
            r3.append(r0)
            java.lang.String r5 = r3.toString()
            r2.<init>(r5)
            throw r2
        L36:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r2.append(r1)
            r2.append(r5)
            java.lang.String r5 = " but had empty stack"
            r2.append(r5)
            java.lang.String r5 = r2.toString()
            r0.<init>(r5)
            throw r0
    }

    private final void zax(java.io.BufferedReader r7, char[] r8) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            int r2 = r8.length
            if (r1 >= r2) goto L31
            char[] r3 = r6.zap
            int r2 = r2 - r1
            int r2 = r7.read(r3, r0, r2)
            r3 = -1
            if (r2 == r3) goto L29
            r3 = 0
        L10:
            if (r3 >= r2) goto L27
            int r4 = r3 + r1
            char r4 = r8[r4]
            char[] r5 = r6.zap
            char r5 = r5[r3]
            if (r4 != r5) goto L1f
            int r3 = r3 + 1
            goto L10
        L1f:
            com.google.android.gms.common.server.response.FastParser$ParseException r7 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r8 = "Unexpected character"
            r7.<init>(r8)
            throw r7
        L27:
            int r1 = r1 + r2
            goto L2
        L29:
            com.google.android.gms.common.server.response.FastParser$ParseException r7 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r8 = "Unexpected EOF"
            r7.<init>(r8)
            throw r7
        L31:
            return
    }

    private final boolean zay(java.io.BufferedReader r5, boolean r6) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r4 = this;
            char r0 = r4.zai(r5)
            r1 = 34
            r2 = 1
            if (r0 == r1) goto L49
            r1 = 102(0x66, float:1.43E-43)
            r3 = 0
            if (r0 == r1) goto L3e
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 == r1) goto L38
            r1 = 116(0x74, float:1.63E-43)
            if (r0 != r1) goto L21
            if (r6 == 0) goto L1b
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zac
            goto L1d
        L1b:
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zab
        L1d:
            r4.zax(r5, r6)
            return r2
        L21:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r1 = "Unexpected token: "
            r6.append(r1)
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L38:
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zaa
            r4.zax(r5, r6)
            return r3
        L3e:
            if (r6 == 0) goto L43
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zae
            goto L45
        L43:
            char[] r6 = com.google.android.gms.common.server.response.FastParser.zad
        L45:
            r4.zax(r5, r6)
            return r3
        L49:
            if (r6 != 0) goto L50
            boolean r5 = r4.zay(r5, r2)
            return r5
        L50:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r6 = "No boolean value found in string"
            r5.<init>(r6)
            throw r5
    }

    @com.google.errorprone.annotations.ResultIgnorabilityUnspecified
    private final boolean zaz(java.io.BufferedReader r18, com.google.android.gms.common.server.response.FastJsonResponse r19) throws com.google.android.gms.common.server.response.FastParser.ParseException, java.io.IOException {
            r17 = this;
            r1 = r17
            r0 = r18
            r2 = r19
            java.lang.String r3 = "Error instantiating inner object"
            r4 = 1
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            java.util.Map r6 = r2.getFieldMappings()
            java.lang.String r7 = r17.zaq(r18)
            if (r7 == 0) goto L287
        L17:
            if (r7 == 0) goto L283
            java.lang.Object r7 = r6.get(r7)
            com.google.android.gms.common.server.response.FastJsonResponse$Field r7 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r7
            if (r7 != 0) goto L26
            java.lang.String r7 = r17.zar(r18)
            goto L17
        L26:
            java.util.Stack r9 = r1.zat
            r10 = 4
            java.lang.Integer r11 = java.lang.Integer.valueOf(r10)
            r9.push(r11)
            int r9 = r7.zaa
            r11 = 44
            r12 = 123(0x7b, float:1.72E-43)
            r13 = 125(0x7d, float:1.75E-43)
            r14 = 110(0x6e, float:1.54E-43)
            r15 = 0
            switch(r9) {
                case 0: goto L23c;
                case 1: goto L224;
                case 2: goto L20c;
                case 3: goto L1f4;
                case 4: goto L1dc;
                case 5: goto L1c4;
                case 6: goto L1ab;
                case 7: goto L193;
                case 8: goto L180;
                case 9: goto L16d;
                case 10: goto Lc9;
                case 11: goto L55;
                default: goto L3e;
            }
        L3e:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Invalid field type "
            r2.append(r3)
            r2.append(r9)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L55:
            boolean r9 = r7.zab
            if (r9 == 0) goto L8c
            char r9 = r17.zai(r18)
            if (r9 != r14) goto L6c
            char[] r9 = com.google.android.gms.common.server.response.FastParser.zaa
            r1.zax(r0, r9)
            java.lang.String r9 = r7.zae
            r2.addConcreteTypeArrayInternal(r7, r9, r15)
        L69:
            r7 = 4
            goto L254
        L6c:
            java.util.Stack r12 = r1.zat
            r14 = 5
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r12.push(r14)
            r12 = 91
            if (r9 != r12) goto L84
            java.lang.String r9 = r7.zae
            java.util.ArrayList r12 = r1.zav(r0, r7)
            r2.addConcreteTypeArrayInternal(r7, r9, r12)
            goto L69
        L84:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected array start"
            r0.<init>(r2)
            throw r0
        L8c:
            char r9 = r17.zai(r18)
            if (r9 != r14) goto L9d
            char[] r9 = com.google.android.gms.common.server.response.FastParser.zaa
            r1.zax(r0, r9)
            java.lang.String r9 = r7.zae
            r2.addConcreteTypeInternal(r7, r9, r15)
            goto L69
        L9d:
            java.util.Stack r14 = r1.zat
            r14.push(r5)
            if (r9 != r12) goto Lc1
            com.google.android.gms.common.server.response.FastJsonResponse r9 = r7.zad()     // Catch: java.lang.IllegalAccessException -> Lb1 java.lang.InstantiationException -> Lb3
            r1.zaz(r0, r9)     // Catch: java.lang.IllegalAccessException -> Lb1 java.lang.InstantiationException -> Lb3
            java.lang.String r12 = r7.zae     // Catch: java.lang.IllegalAccessException -> Lb1 java.lang.InstantiationException -> Lb3
            r2.addConcreteTypeInternal(r7, r12, r9)     // Catch: java.lang.IllegalAccessException -> Lb1 java.lang.InstantiationException -> Lb3
            goto L69
        Lb1:
            r0 = move-exception
            goto Lb5
        Lb3:
            r0 = move-exception
            goto Lbb
        Lb5:
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>(r3, r0)
            throw r2
        Lbb:
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            r2.<init>(r3, r0)
            throw r2
        Lc1:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected start of object"
            r0.<init>(r2)
            throw r0
        Lc9:
            char r9 = r17.zai(r18)
            if (r9 != r14) goto Ld6
            char[] r9 = com.google.android.gms.common.server.response.FastParser.zaa
            r1.zax(r0, r9)
            r9 = r15
            goto L11f
        Ld6:
            if (r9 != r12) goto L165
            java.util.Stack r9 = r1.zat
            r9.push(r5)
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
        Le2:
            char r12 = r17.zai(r18)
            if (r12 == 0) goto L15d
            r14 = 34
            if (r12 == r14) goto Lf3
            if (r12 == r13) goto Lef
            goto Le2
        Lef:
            r1.zaw(r4)
            goto L11f
        Lf3:
            char[] r12 = r1.zap
            java.lang.StringBuilder r10 = r1.zar
            java.lang.String r10 = zaA(r0, r12, r10, r15)
            char r12 = r17.zai(r18)
            r8 = 58
            if (r12 != r8) goto L14d
            char r8 = r17.zai(r18)
            if (r8 != r14) goto L13d
            char[] r8 = r1.zap
            java.lang.StringBuilder r12 = r1.zar
            java.lang.String r8 = zaA(r0, r8, r12, r15)
            r9.put(r10, r8)
            char r8 = r17.zai(r18)
            if (r8 == r11) goto L13b
            if (r8 != r13) goto L124
            r1.zaw(r4)
        L11f:
            r2.zaB(r7, r9)
            goto L69
        L124:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Unexpected character while parsing string map: "
            r2.append(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L13b:
            r10 = 4
            goto Le2
        L13d:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r3 = "Expected String value for key "
            java.lang.String r0 = r3.concat(r0)
            r2.<init>(r0)
            throw r2
        L14d:
            java.lang.String r0 = java.lang.String.valueOf(r10)
            com.google.android.gms.common.server.response.FastParser$ParseException r2 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r3 = "No map value found for key "
            java.lang.String r0 = r3.concat(r0)
            r2.<init>(r0)
            throw r2
        L15d:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Unexpected EOF"
            r0.<init>(r2)
            throw r0
        L165:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.String r2 = "Expected start of a map object"
            r0.<init>(r2)
            throw r0
        L16d:
            char[] r8 = r1.zaq
            java.lang.StringBuilder r9 = r1.zas
            char[] r10 = com.google.android.gms.common.server.response.FastParser.zaf
            java.lang.String r8 = r1.zap(r0, r8, r9, r10)
            byte[] r8 = com.google.android.gms.common.util.Base64Utils.decodeUrlSafe(r8)
            r2.zal(r7, r8)
            goto L69
        L180:
            char[] r8 = r1.zaq
            java.lang.StringBuilder r9 = r1.zas
            char[] r10 = com.google.android.gms.common.server.response.FastParser.zaf
            java.lang.String r8 = r1.zap(r0, r8, r9, r10)
            byte[] r8 = com.google.android.gms.common.util.Base64Utils.decode(r8)
            r2.zal(r7, r8)
            goto L69
        L193:
            boolean r8 = r7.zab
            if (r8 == 0) goto L1a2
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zal
            java.util.ArrayList r8 = r1.zau(r0, r8)
            r2.zaC(r7, r8)
            goto L69
        L1a2:
            java.lang.String r8 = r17.zao(r18)
            r2.zaA(r7, r8)
            goto L69
        L1ab:
            boolean r8 = r7.zab
            if (r8 == 0) goto L1ba
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zak
            java.util.ArrayList r8 = r1.zau(r0, r8)
            r2.zaj(r7, r8)
            goto L69
        L1ba:
            r8 = 0
            boolean r9 = r1.zay(r0, r8)
            r2.zai(r7, r9)
            goto L69
        L1c4:
            boolean r8 = r7.zab
            if (r8 == 0) goto L1d3
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zan
            java.util.ArrayList r8 = r1.zau(r0, r8)
            r2.zac(r7, r8)
            goto L69
        L1d3:
            java.math.BigDecimal r8 = r17.zas(r18)
            r2.zaa(r7, r8)
            goto L69
        L1dc:
            boolean r8 = r7.zab
            if (r8 == 0) goto L1eb
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zaj
            java.util.ArrayList r8 = r1.zau(r0, r8)
            r2.zao(r7, r8)
            goto L69
        L1eb:
            double r8 = r17.zaj(r18)
            r2.zam(r7, r8)
            goto L69
        L1f4:
            boolean r8 = r7.zab
            if (r8 == 0) goto L203
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zai
            java.util.ArrayList r8 = r1.zau(r0, r8)
            r2.zas(r7, r8)
            goto L69
        L203:
            float r8 = r17.zak(r18)
            r2.zaq(r7, r8)
            goto L69
        L20c:
            boolean r8 = r7.zab
            if (r8 == 0) goto L21b
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zah
            java.util.ArrayList r8 = r1.zau(r0, r8)
            r2.zay(r7, r8)
            goto L69
        L21b:
            long r8 = r17.zan(r18)
            r2.zax(r7, r8)
            goto L69
        L224:
            boolean r8 = r7.zab
            if (r8 == 0) goto L233
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zam
            java.util.ArrayList r8 = r1.zau(r0, r8)
            r2.zag(r7, r8)
            goto L69
        L233:
            java.math.BigInteger r8 = r17.zat(r18)
            r2.zae(r7, r8)
            goto L69
        L23c:
            boolean r8 = r7.zab
            if (r8 == 0) goto L24b
            com.google.android.gms.common.server.response.zai r8 = com.google.android.gms.common.server.response.FastParser.zag
            java.util.ArrayList r8 = r1.zau(r0, r8)
            r2.zav(r7, r8)
            goto L69
        L24b:
            int r8 = r17.zal(r18)
            r2.zau(r7, r8)
            goto L69
        L254:
            r1.zaw(r7)
            r7 = 2
            r1.zaw(r7)
            char r7 = r17.zai(r18)
            if (r7 == r11) goto L27d
            if (r7 != r13) goto L266
            r7 = r15
            goto L17
        L266:
            com.google.android.gms.common.server.response.FastParser$ParseException r0 = new com.google.android.gms.common.server.response.FastParser$ParseException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Expected end of object or field separator, but found: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L27d:
            java.lang.String r7 = r17.zaq(r18)
            goto L17
        L283:
            r1.zaw(r4)
            return r4
        L287:
            r1.zaw(r4)
            r16 = 0
            return r16
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    public void parse(@androidx.annotation.NonNull java.io.InputStream r5, @androidx.annotation.NonNull T r6) throws com.google.android.gms.common.server.response.FastParser.ParseException {
            r4 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r5)
            r5 = 1024(0x400, float:1.435E-42)
            r0.<init>(r1, r5)
            java.util.Stack r5 = r4.zat     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r1 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r1)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.push(r2)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            char r5 = r4.zai(r0)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            if (r5 == 0) goto L8d
            r2 = 91
            r3 = 1
            if (r5 == r2) goto L4d
            r2 = 123(0x7b, float:1.72E-43)
            if (r5 != r2) goto L36
            java.util.Stack r5 = r4.zat     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.push(r2)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r4.zaz(r0, r6)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            goto L7e
        L32:
            r5 = move-exception
            goto L9b
        L34:
            r5 = move-exception
            goto L95
        L36:
            com.google.android.gms.common.server.response.FastParser$ParseException r6 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r1.<init>()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r2 = "Unexpected token: "
            r1.append(r2)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r1.append(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r5 = r1.toString()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            throw r6     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L4d:
            java.util.Stack r5 = r4.zat     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r2 = 5
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r5.push(r2)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.Map r5 = r6.getFieldMappings()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            int r2 = r5.size()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            if (r2 != r3) goto L85
            java.util.Set r5 = r5.entrySet()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.Iterator r5 = r5.iterator()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.Object r5 = r5.next()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.Map$Entry r5 = (java.util.Map.Entry) r5     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.Object r5 = r5.getValue()     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            com.google.android.gms.common.server.response.FastJsonResponse$Field r5 = (com.google.android.gms.common.server.response.FastJsonResponse.Field) r5     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.util.ArrayList r2 = r4.zav(r0, r5)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r3 = r5.zae     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r6.addConcreteTypeArrayInternal(r5, r3, r2)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L7e:
            r4.zaw(r1)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            r0.close()     // Catch: java.io.IOException -> L84
        L84:
            return
        L85:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r6 = "Object array response class must have a single Field"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            throw r5     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L8d:
            com.google.android.gms.common.server.response.FastParser$ParseException r5 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            java.lang.String r6 = "No data to parse"
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
            throw r5     // Catch: java.lang.Throwable -> L32 java.io.IOException -> L34
        L95:
            com.google.android.gms.common.server.response.FastParser$ParseException r6 = new com.google.android.gms.common.server.response.FastParser$ParseException     // Catch: java.lang.Throwable -> L32
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L32
            throw r6     // Catch: java.lang.Throwable -> L32
        L9b:
            r0.close()     // Catch: java.io.IOException -> L9e
        L9e:
            throw r5
    }
}

package okhttp3.internal.idn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nPunycode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Punycode.kt\nokhttp3/internal/idn/Punycode\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,329:1\n2393#2,14:330\n*S KotlinDebug\n*F\n+ 1 Punycode.kt\nokhttp3/internal/idn/Punycode\n*L\n108#1:330,14\n*E\n"})
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public final class Punycode {
    private static final int BASE = 36;
    private static final int DAMP = 700;
    private static final int INITIAL_BIAS = 72;
    private static final int INITIAL_N = 128;

    @org.jetbrains.annotations.NotNull
    public static final okhttp3.internal.idn.Punycode INSTANCE = null;

    @org.jetbrains.annotations.NotNull
    private static final okio.ByteString PREFIX = null;

    @org.jetbrains.annotations.NotNull
    private static final java.lang.String PREFIX_STRING = null;
    private static final int SKEW = 38;
    private static final int TMAX = 26;
    private static final int TMIN = 1;

    static {
            okhttp3.internal.idn.Punycode r0 = new okhttp3.internal.idn.Punycode
            r0.<init>()
            okhttp3.internal.idn.Punycode.INSTANCE = r0
            java.lang.String r0 = "xn--"
            okhttp3.internal.idn.Punycode.PREFIX_STRING = r0
            okio.ByteString$Companion r1 = okio.ByteString.Companion
            okio.ByteString r0 = r1.encodeUtf8(r0)
            okhttp3.internal.idn.Punycode.PREFIX = r0
            return
    }

    private Punycode() {
            r0 = this;
            r0.<init>()
            return
    }

    private final int adapt(int r1, int r2, boolean r3) {
            r0 = this;
            if (r3 == 0) goto L5
            int r1 = r1 / 700
            goto L7
        L5:
            int r1 = r1 / 2
        L7:
            int r2 = r1 / r2
            int r1 = r1 + r2
            r2 = 0
        Lb:
            r3 = 455(0x1c7, float:6.38E-43)
            if (r1 <= r3) goto L14
            int r1 = r1 / 35
            int r2 = r2 + 36
            goto Lb
        L14:
            int r3 = r1 * 36
            int r1 = r1 + 38
            int r3 = r3 / r1
            int r2 = r2 + r3
            return r2
    }

    private final java.util.List<java.lang.Integer> codePoints(java.lang.String r6, int r7, int r8) {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            if (r7 >= r8) goto L40
            char r1 = r6.charAt(r7)
            boolean r2 = kotlin.text.b.L(r1)
            if (r2 == 0) goto L36
            int r2 = r7 + 1
            if (r2 >= r8) goto L1a
            char r3 = r6.charAt(r2)
            goto L1b
        L1a:
            r3 = 0
        L1b:
            boolean r4 = java.lang.Character.isLowSurrogate(r1)
            if (r4 != 0) goto L34
            boolean r4 = java.lang.Character.isLowSurrogate(r3)
            if (r4 != 0) goto L28
            goto L34
        L28:
            r7 = r1 & 1023(0x3ff, float:1.434E-42)
            int r7 = r7 << 10
            r1 = r3 & 1023(0x3ff, float:1.434E-42)
            r7 = r7 | r1
            r1 = 65536(0x10000, float:9.1835E-41)
            int r1 = r1 + r7
            r7 = r2
            goto L36
        L34:
            r1 = 63
        L36:
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r0.add(r1)
            int r7 = r7 + 1
            goto L5
        L40:
            return r0
    }

    private final boolean decodeLabel(java.lang.String r22, int r23, int r24, okio.Buffer r25) {
            r21 = this;
            r6 = r24
            r7 = r25
            java.lang.String r2 = okhttp3.internal.idn.Punycode.PREFIX_STRING
            r4 = 4
            r5 = 1
            r3 = 0
            r0 = r22
            r1 = r23
            boolean r2 = kotlin.text.u.q2(r0, r1, r2, r3, r4, r5)
            r8 = 1
            if (r2 != 0) goto L18
            r7.writeUtf8(r0, r1, r6)
            return r8
        L18:
            int r9 = r1 + 4
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r4 = 4
            r5 = 0
            r1 = 45
            r3 = 0
            r2 = r6
            int r1 = kotlin.text.u.V3(r0, r1, r2, r3, r4, r5)
            r3 = 58
            r4 = 48
            r5 = 91
            r6 = 123(0x7b, float:1.72E-43)
            r11 = 65
            r12 = 97
            r13 = 0
            if (r1 < r9) goto L5e
        L38:
            if (r9 >= r1) goto L5d
            int r14 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r12 > r9) goto L45
            if (r9 >= r6) goto L45
            goto L53
        L45:
            if (r11 > r9) goto L4a
            if (r9 >= r5) goto L4a
            goto L53
        L4a:
            if (r4 > r9) goto L4f
            if (r9 >= r3) goto L4f
            goto L53
        L4f:
            r15 = 45
            if (r9 != r15) goto L5c
        L53:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r10.add(r9)
            r9 = r14
            goto L38
        L5c:
            return r13
        L5d:
            int r9 = r9 + r8
        L5e:
            r1 = 128(0x80, float:1.8E-43)
            r14 = 72
            r15 = 0
        L63:
            if (r9 >= r2) goto L12d
            r16 = 1
            r8 = 36
            r23 = 0
            r13 = 2147483647(0x7fffffff, float:NaN)
            kotlin.ranges.m r3 = kotlin.ranges.t.W1(r8, r13)
            kotlin.ranges.k r3 = kotlin.ranges.t.B1(r3, r8)
            int r8 = r3.e()
            r17 = 2147483647(0x7fffffff, float:NaN)
            int r13 = r3.f()
            int r3 = r3.g()
            if (r3 <= 0) goto L89
            if (r8 <= r13) goto L8d
        L89:
            if (r3 >= 0) goto Le6
            if (r13 > r8) goto Le6
        L8d:
            r18 = r15
            r19 = 1
        L91:
            if (r9 != r2) goto L94
            return r23
        L94:
            int r20 = r9 + 1
            char r9 = r0.charAt(r9)
            if (r12 > r9) goto La3
            if (r9 >= r6) goto La3
            int r9 = r9 + (-97)
        La0:
            r4 = r19
            goto Lb3
        La3:
            if (r11 > r9) goto Laa
            if (r9 >= r5) goto Laa
            int r9 = r9 + (-65)
            goto La0
        Laa:
            if (r4 > r9) goto Le5
            r4 = 58
            if (r9 >= r4) goto Le5
            int r9 = r9 + (-22)
            goto La0
        Lb3:
            int r19 = r9 * r4
            int r5 = r17 - r19
            r6 = r18
            if (r6 <= r5) goto Lbc
            return r23
        Lbc:
            int r18 = r6 + r19
            if (r8 > r14) goto Lc2
            r5 = 1
            goto Lcb
        Lc2:
            int r5 = r14 + 26
            if (r8 < r5) goto Lc9
            r5 = 26
            goto Lcb
        Lc9:
            int r5 = r8 - r14
        Lcb:
            if (r9 < r5) goto Le2
            int r5 = 36 - r5
            int r6 = r17 / r5
            if (r4 <= r6) goto Ld4
            return r23
        Ld4:
            int r19 = r4 * r5
            if (r8 == r13) goto Le2
            int r8 = r8 + r3
            r9 = r20
            r4 = 48
            r5 = 91
            r6 = 123(0x7b, float:1.72E-43)
            goto L91
        Le2:
            r9 = r20
            goto Le8
        Le5:
            return r23
        Le6:
            r18 = r15
        Le8:
            int r3 = r18 - r15
            int r4 = r10.size()
            int r4 = r4 + 1
            if (r15 != 0) goto Lf6
            r6 = 1
        Lf3:
            r5 = r21
            goto Lf8
        Lf6:
            r6 = 0
            goto Lf3
        Lf8:
            int r14 = r5.adapt(r3, r4, r6)
            int r3 = r10.size()
            int r3 = r3 + 1
            int r3 = r18 / r3
            int r13 = r17 - r3
            if (r1 <= r13) goto L109
            return r23
        L109:
            int r1 = r1 + r3
            int r3 = r10.size()
            int r3 = r3 + 1
            int r3 = r18 % r3
            r4 = 1114111(0x10ffff, float:1.561202E-39)
            if (r1 <= r4) goto L118
            return r23
        L118:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            r10.add(r3, r4)
            int r15 = r3 + 1
            r3 = 58
            r4 = 48
            r5 = 91
            r6 = 123(0x7b, float:1.72E-43)
            r8 = 1
            r13 = 0
            goto L63
        L12d:
            r5 = r21
            r16 = 1
            java.util.Iterator r0 = r10.iterator()
        L135:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L149
            java.lang.Object r1 = r0.next()
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            r7.writeUtf8CodePoint(r1)
            goto L135
        L149:
            return r16
    }

    private final boolean encodeLabel(java.lang.String r20, int r21, int r22, okio.Buffer r23) {
            r19 = this;
            r0 = r19
            r1 = r23
            boolean r2 = r19.requiresEncode(r20, r21, r22)
            r3 = 1
            if (r2 != 0) goto L15
            r2 = r20
            r4 = r21
            r5 = r22
            r1.writeUtf8(r2, r4, r5)
            return r3
        L15:
            r2 = r20
            r4 = r21
            r5 = r22
            okio.ByteString r6 = okhttp3.internal.idn.Punycode.PREFIX
            r1.write(r6)
            java.util.List r2 = r19.codePoints(r20, r21, r22)
            java.util.Iterator r4 = r2.iterator()
            r5 = 0
            r6 = 0
        L2a:
            boolean r7 = r4.hasNext()
            r8 = 128(0x80, float:1.8E-43)
            if (r7 == 0) goto L44
            java.lang.Object r7 = r4.next()
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            if (r7 >= r8) goto L2a
            r1.writeByte(r7)
            int r6 = r6 + 1
            goto L2a
        L44:
            if (r6 <= 0) goto L4b
            r4 = 45
            r1.writeByte(r4)
        L4b:
            r4 = 72
            r7 = r6
            r9 = 0
        L4f:
            int r10 = r2.size()
            if (r7 >= r10) goto L136
            r10 = r2
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.Iterator r10 = r10.iterator()
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L130
            java.lang.Object r11 = r10.next()
            boolean r12 = r10.hasNext()
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r12 != 0) goto L70
            goto L98
        L70:
            r12 = r11
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            if (r12 < r8) goto L7a
            goto L7d
        L7a:
            r12 = 2147483647(0x7fffffff, float:NaN)
        L7d:
            java.lang.Object r14 = r10.next()
            r15 = r14
            java.lang.Number r15 = (java.lang.Number) r15
            int r15 = r15.intValue()
            if (r15 < r8) goto L8b
            goto L8e
        L8b:
            r15 = 2147483647(0x7fffffff, float:NaN)
        L8e:
            if (r12 <= r15) goto L92
            r11 = r14
            r12 = r15
        L92:
            boolean r14 = r10.hasNext()
            if (r14 != 0) goto L7d
        L98:
            java.lang.Number r11 = (java.lang.Number) r11
            int r10 = r11.intValue()
            int r8 = r10 - r8
            int r11 = r7 + 1
            int r8 = r8 * r11
            int r11 = r13 - r8
            if (r9 <= r11) goto La9
            return r5
        La9:
            int r9 = r9 + r8
            java.util.Iterator r8 = r2.iterator()
        Lae:
            boolean r11 = r8.hasNext()
            if (r11 == 0) goto L127
            java.lang.Object r11 = r8.next()
            java.lang.Number r11 = (java.lang.Number) r11
            int r11 = r11.intValue()
            if (r11 >= r10) goto Lc6
            if (r9 != r13) goto Lc3
            return r5
        Lc3:
            int r9 = r9 + 1
            goto Lae
        Lc6:
            if (r11 != r10) goto Lae
            r11 = 36
            kotlin.ranges.m r12 = kotlin.ranges.t.W1(r11, r13)
            kotlin.ranges.k r11 = kotlin.ranges.t.B1(r12, r11)
            int r12 = r11.e()
            int r14 = r11.f()
            int r11 = r11.g()
            if (r11 <= 0) goto Le2
            if (r12 <= r14) goto Le6
        Le2:
            if (r11 >= 0) goto L10e
            if (r14 > r12) goto L10e
        Le6:
            r15 = r9
        Le7:
            if (r12 > r4) goto Lec
            r16 = 1
            goto Lf7
        Lec:
            r16 = 1
            int r3 = r4 + 26
            if (r12 < r3) goto Lf5
            r3 = 26
            goto Lf7
        Lf5:
            int r3 = r12 - r4
        Lf7:
            if (r15 < r3) goto L111
            int r15 = r15 - r3
            int r17 = 36 - r3
            int r18 = r15 % r17
            int r3 = r3 + r18
            int r3 = r0.getPunycodeDigit(r3)
            r1.writeByte(r3)
            int r15 = r15 / r17
            if (r12 == r14) goto L111
            int r12 = r12 + r11
            r3 = 1
            goto Le7
        L10e:
            r16 = 1
            r15 = r9
        L111:
            int r3 = r0.getPunycodeDigit(r15)
            r1.writeByte(r3)
            int r3 = r7 + 1
            if (r7 != r6) goto L11e
            r4 = 1
            goto L11f
        L11e:
            r4 = 0
        L11f:
            int r4 = r0.adapt(r9, r3, r4)
            r7 = r3
            r3 = 1
            r9 = 0
            goto Lae
        L127:
            r16 = 1
            int r9 = r9 + 1
            int r8 = r10 + 1
            r3 = 1
            goto L4f
        L130:
            java.util.NoSuchElementException r1 = new java.util.NoSuchElementException
            r1.<init>()
            throw r1
        L136:
            r16 = 1
            return r16
    }

    private final int getPunycodeDigit(int r4) {
            r3 = this;
            r0 = 26
            if (r4 >= r0) goto L7
            int r4 = r4 + 97
            return r4
        L7:
            r0 = 36
            if (r4 >= r0) goto Le
            int r4 = r4 + 22
            return r4
        Le:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "unexpected digit: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            java.lang.String r4 = r4.toString()
            r0.<init>(r4)
            throw r0
    }

    private final boolean requiresEncode(java.lang.String r3, int r4, int r5) {
            r2 = this;
        L0:
            if (r4 >= r5) goto Lf
            char r0 = r3.charAt(r4)
            r1 = 128(0x80, float:1.8E-43)
            if (r0 < r1) goto Lc
            r3 = 1
            return r3
        Lc:
            int r4 = r4 + 1
            goto L0
        Lf:
            r3 = 0
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String decode(@org.jetbrains.annotations.NotNull java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r10.length()
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r2 = 0
            r5 = 0
        L10:
            if (r5 >= r0) goto L33
            r7 = 4
            r8 = 0
            r4 = 46
            r6 = 0
            r3 = r10
            int r10 = kotlin.text.u.G3(r3, r4, r5, r6, r7, r8)
            r2 = -1
            if (r10 != r2) goto L20
            r10 = r0
        L20:
            boolean r2 = r9.decodeLabel(r3, r5, r10, r1)
            if (r2 != 0) goto L28
            r10 = 0
            return r10
        L28:
            if (r10 >= r0) goto L33
            r2 = 46
            r1.writeByte(r2)
            int r5 = r10 + 1
            r10 = r3
            goto L10
        L33:
            java.lang.String r10 = r1.readUtf8()
            return r10
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.String encode(@org.jetbrains.annotations.NotNull java.lang.String r10) {
            r9 = this;
            java.lang.String r0 = "string"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r10.length()
            okio.Buffer r1 = new okio.Buffer
            r1.<init>()
            r2 = 0
            r5 = 0
        L10:
            if (r5 >= r0) goto L33
            r7 = 4
            r8 = 0
            r4 = 46
            r6 = 0
            r3 = r10
            int r10 = kotlin.text.u.G3(r3, r4, r5, r6, r7, r8)
            r2 = -1
            if (r10 != r2) goto L20
            r10 = r0
        L20:
            boolean r2 = r9.encodeLabel(r3, r5, r10, r1)
            if (r2 != 0) goto L28
            r10 = 0
            return r10
        L28:
            if (r10 >= r0) goto L33
            r2 = 46
            r1.writeByte(r2)
            int r5 = r10 + 1
            r10 = r3
            goto L10
        L33:
            java.lang.String r10 = r1.readUtf8()
            return r10
    }

    @org.jetbrains.annotations.NotNull
    public final okio.ByteString getPREFIX() {
            r1 = this;
            okio.ByteString r0 = okhttp3.internal.idn.Punycode.PREFIX
            return r0
    }

    @org.jetbrains.annotations.NotNull
    public final java.lang.String getPREFIX_STRING() {
            r1 = this;
            java.lang.String r0 = okhttp3.internal.idn.Punycode.PREFIX_STRING
            return r0
    }
}

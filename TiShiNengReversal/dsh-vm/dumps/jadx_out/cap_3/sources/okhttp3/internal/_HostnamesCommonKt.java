package okhttp3.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public final class _HostnamesCommonKt {

    @org.jetbrains.annotations.NotNull
    private static final kotlin.text.Regex VERIFY_AS_IP_ADDRESS = null;

    static {
            kotlin.text.Regex r0 = new kotlin.text.Regex
            java.lang.String r1 = "([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)"
            r0.<init>(r1)
            okhttp3.internal._HostnamesCommonKt.VERIFY_AS_IP_ADDRESS = r0
            return
    }

    public _HostnamesCommonKt() {
            r1 = this;
            r1.<init>()
            return
    }

    public static final boolean canParseAsIpAddress(@org.jetbrains.annotations.NotNull java.lang.String r1) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r1, r0)
            kotlin.text.Regex r0 = okhttp3.internal._HostnamesCommonKt.VERIFY_AS_IP_ADDRESS
            boolean r1 = r0.matches(r1)
            return r1
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] canonicalizeInetAddress(@org.jetbrains.annotations.NotNull byte[] r2) {
            java.lang.String r0 = "address"
            kotlin.jvm.internal.g0.p(r2, r0)
            boolean r0 = isMappedIpv4Address(r2)
            if (r0 == 0) goto L17
            r0 = 12
            r1 = 16
            kotlin.ranges.m r0 = kotlin.ranges.t.W1(r0, r1)
            byte[] r2 = kotlin.collections.n.ru(r2, r0)
        L17:
            return r2
    }

    public static final boolean containsInvalidHostnameAsciiCodes(@org.jetbrains.annotations.NotNull java.lang.String r10) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r10, r0)
            int r0 = r10.length()
            r1 = 0
            r2 = 0
        Lb:
            if (r2 >= r0) goto L35
            char r4 = r10.charAt(r2)
            r3 = 31
            int r3 = kotlin.jvm.internal.g0.t(r4, r3)
            r9 = 1
            if (r3 <= 0) goto L34
            r3 = 127(0x7f, float:1.78E-43)
            int r3 = kotlin.jvm.internal.g0.t(r4, r3)
            if (r3 < 0) goto L23
            goto L34
        L23:
            r7 = 6
            r8 = 0
            java.lang.String r3 = " #%/:?@[\\]"
            r5 = 0
            r6 = 0
            int r3 = kotlin.text.u.G3(r3, r4, r5, r6, r7, r8)
            r4 = -1
            if (r3 == r4) goto L31
            return r9
        L31:
            int r2 = r2 + 1
            goto Lb
        L34:
            return r9
        L35:
            return r1
    }

    public static final boolean containsInvalidLabelLengths(@org.jetbrains.annotations.NotNull java.lang.String r8) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r8, r0)
            int r0 = r8.length()
            r1 = 1
            if (r1 > r0) goto L3b
            r2 = 254(0xfe, float:3.56E-43)
            if (r0 >= r2) goto L3b
            r0 = 0
            r4 = 0
        L12:
            r6 = 4
            r7 = 0
            r3 = 46
            r5 = 0
            r2 = r8
            int r8 = kotlin.text.u.G3(r2, r3, r4, r5, r6, r7)
            r3 = -1
            if (r8 != r3) goto L25
            int r5 = r2.length()
            int r5 = r5 - r4
            goto L27
        L25:
            int r5 = r8 - r4
        L27:
            if (r1 > r5) goto L3b
            r4 = 64
            if (r5 >= r4) goto L3b
            if (r8 == r3) goto L3a
            int r3 = r2.length()
            int r3 = r3 - r1
            if (r8 == r3) goto L3a
            int r4 = r8 + 1
            r8 = r2
            goto L12
        L3a:
            return r0
        L3b:
            return r1
    }

    public static final boolean decodeIpv4Suffix(@org.jetbrains.annotations.NotNull java.lang.String r7, int r8, int r9, @org.jetbrains.annotations.NotNull byte[] r10, int r11) {
            java.lang.String r0 = "input"
            kotlin.jvm.internal.g0.p(r7, r0)
            java.lang.String r0 = "address"
            kotlin.jvm.internal.g0.p(r10, r0)
            r0 = r11
        Lb:
            r1 = 0
            if (r8 >= r9) goto L56
            int r2 = r10.length
            if (r0 != r2) goto L12
            return r1
        L12:
            if (r0 == r11) goto L1f
            char r2 = r7.charAt(r8)
            r3 = 46
            if (r2 == r3) goto L1d
            return r1
        L1d:
            int r8 = r8 + 1
        L1f:
            r2 = r8
            r3 = 0
        L21:
            if (r2 >= r9) goto L49
            char r4 = r7.charAt(r2)
            r5 = 48
            int r6 = kotlin.jvm.internal.g0.t(r4, r5)
            if (r6 < 0) goto L49
            r6 = 57
            int r6 = kotlin.jvm.internal.g0.t(r4, r6)
            if (r6 <= 0) goto L38
            goto L49
        L38:
            if (r3 != 0) goto L3d
            if (r8 == r2) goto L3d
            return r1
        L3d:
            int r3 = r3 * 10
            int r3 = r3 + r4
            int r3 = r3 - r5
            r4 = 255(0xff, float:3.57E-43)
            if (r3 <= r4) goto L46
            return r1
        L46:
            int r2 = r2 + 1
            goto L21
        L49:
            int r8 = r2 - r8
            if (r8 != 0) goto L4e
            return r1
        L4e:
            int r8 = r0 + 1
            byte r1 = (byte) r3
            r10[r0] = r1
            r0 = r8
            r8 = r2
            goto Lb
        L56:
            int r11 = r11 + 4
            if (r0 != r11) goto L5c
            r7 = 1
            return r7
        L5c:
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public static final byte[] decodeIpv6(@org.jetbrains.annotations.NotNull java.lang.String r16, int r17, int r18) {
            r0 = r16
            r6 = r18
            java.lang.String r1 = "input"
            kotlin.jvm.internal.g0.p(r0, r1)
            r7 = 16
            byte[] r8 = new byte[r7]
            r9 = 0
            r10 = -1
            r2 = r17
            r11 = 0
            r12 = -1
            r13 = -1
        L14:
            r14 = 0
            if (r2 >= r6) goto L95
            if (r11 != r7) goto L1a
            return r14
        L1a:
            int r15 = r2 + 2
            if (r15 > r6) goto L38
            r4 = 4
            r5 = 0
            java.lang.String r1 = "::"
            r3 = 0
            boolean r1 = kotlin.text.u.G2(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L38
            if (r12 == r10) goto L2c
            return r14
        L2c:
            int r11 = r11 + 2
            if (r15 != r6) goto L33
            r12 = r11
            goto L95
        L33:
            r0 = r16
            r12 = r11
            r13 = r15
            goto L67
        L38:
            if (r11 == 0) goto L49
            r4 = 4
            r5 = 0
            java.lang.String r1 = ":"
            r3 = 0
            r0 = r16
            boolean r1 = kotlin.text.u.G2(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L4d
            int r2 = r2 + 1
        L49:
            r0 = r16
            r13 = r2
            goto L67
        L4d:
            r4 = 4
            r5 = 0
            java.lang.String r1 = "."
            r3 = 0
            r0 = r16
            boolean r1 = kotlin.text.u.G2(r0, r1, r2, r3, r4, r5)
            if (r1 == 0) goto L66
            int r1 = r11 + (-2)
            boolean r0 = decodeIpv4Suffix(r0, r13, r6, r8, r1)
            if (r0 != 0) goto L63
            return r14
        L63:
            int r11 = r11 + 2
            goto L95
        L66:
            return r14
        L67:
            r2 = r13
            r1 = 0
        L69:
            if (r2 >= r6) goto L7b
            char r3 = r0.charAt(r2)
            int r3 = okhttp3.internal._UtilCommonKt.parseHexDigit(r3)
            if (r3 == r10) goto L7b
            int r1 = r1 << 4
            int r1 = r1 + r3
            int r2 = r2 + 1
            goto L69
        L7b:
            int r3 = r2 - r13
            if (r3 == 0) goto L94
            r4 = 4
            if (r3 <= r4) goto L83
            goto L94
        L83:
            int r3 = r11 + 1
            int r4 = r1 >>> 8
            r4 = r4 & 255(0xff, float:3.57E-43)
            byte r4 = (byte) r4
            r8[r11] = r4
            int r11 = r11 + 2
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            r8[r3] = r1
            goto L14
        L94:
            return r14
        L95:
            if (r11 == r7) goto La6
            if (r12 != r10) goto L9a
            return r14
        L9a:
            int r0 = r11 - r12
            int r0 = 16 - r0
            kotlin.collections.n.v0(r8, r8, r0, r12, r11)
            int r7 = r7 - r11
            int r7 = r7 + r12
            kotlin.collections.n.G1(r8, r9, r12, r7)
        La6:
            return r8
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String idnToAscii(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "host"
            kotlin.jvm.internal.g0.p(r4, r0)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            okio.Buffer r4 = r0.writeUtf8(r4)
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
        L13:
            boolean r1 = r4.exhausted()
            r2 = 0
            if (r1 != 0) goto L29
            int r1 = r4.readUtf8CodePoint()
            okhttp3.internal.idn.IdnaMappingTable r3 = okhttp3.internal.idn.IdnaMappingTableInstanceKt.getIDNA_MAPPING_TABLE()
            boolean r1 = r3.map(r1, r0)
            if (r1 != 0) goto L13
            return r2
        L29:
            java.lang.String r0 = r0.readUtf8()
            java.lang.String r0 = okhttp3.internal._NormalizeJvmKt.normalizeNfc(r0)
            r4.writeUtf8(r0)
            okhttp3.internal.idn.Punycode r0 = okhttp3.internal.idn.Punycode.INSTANCE
            java.lang.String r4 = r4.readUtf8()
            java.lang.String r4 = r0.decode(r4)
            if (r4 != 0) goto L41
            return r2
        L41:
            java.lang.String r1 = okhttp3.internal._NormalizeJvmKt.normalizeNfc(r4)
            boolean r1 = kotlin.jvm.internal.g0.g(r4, r1)
            if (r1 != 0) goto L4c
            return r2
        L4c:
            java.lang.String r4 = r0.encode(r4)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String inet4AddressToAscii(@org.jetbrains.annotations.NotNull byte[] r5) {
            java.lang.String r0 = "address"
            kotlin.jvm.internal.g0.p(r5, r0)
            int r0 = r5.length
            r1 = 4
            if (r0 != r1) goto L53
            okio.Buffer r0 = new okio.Buffer
            r0.<init>()
            r1 = 0
            r1 = r5[r1]
            r2 = 255(0xff, float:3.57E-43)
            int r1 = okhttp3.internal._UtilCommonKt.and(r1, r2)
            long r3 = (long) r1
            okio.Buffer r0 = r0.writeDecimalLong(r3)
            r1 = 46
            okio.Buffer r0 = r0.writeByte(r1)
            r3 = 1
            r3 = r5[r3]
            int r3 = okhttp3.internal._UtilCommonKt.and(r3, r2)
            long r3 = (long) r3
            okio.Buffer r0 = r0.writeDecimalLong(r3)
            okio.Buffer r0 = r0.writeByte(r1)
            r3 = 2
            r3 = r5[r3]
            int r3 = okhttp3.internal._UtilCommonKt.and(r3, r2)
            long r3 = (long) r3
            okio.Buffer r0 = r0.writeDecimalLong(r3)
            okio.Buffer r0 = r0.writeByte(r1)
            r1 = 3
            r5 = r5[r1]
            int r5 = okhttp3.internal._UtilCommonKt.and(r5, r2)
            long r1 = (long) r5
            okio.Buffer r5 = r0.writeDecimalLong(r1)
            java.lang.String r5 = r5.readUtf8()
            return r5
        L53:
            java.lang.IllegalArgumentException r5 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "Failed requirement."
            r5.<init>(r0)
            throw r5
    }

    @org.jetbrains.annotations.NotNull
    public static final java.lang.String inet6AddressToAscii(@org.jetbrains.annotations.NotNull byte[] r8) {
            java.lang.String r0 = "address"
            kotlin.jvm.internal.g0.p(r8, r0)
            r0 = -1
            r1 = 0
            r2 = 0
            r3 = 0
        L9:
            int r4 = r8.length
            r5 = 16
            if (r2 >= r4) goto L2a
            r4 = r2
        Lf:
            if (r4 >= r5) goto L1e
            r6 = r8[r4]
            if (r6 != 0) goto L1e
            int r6 = r4 + 1
            r6 = r8[r6]
            if (r6 != 0) goto L1e
            int r4 = r4 + 2
            goto Lf
        L1e:
            int r5 = r4 - r2
            if (r5 <= r3) goto L27
            r6 = 4
            if (r5 < r6) goto L27
            r0 = r2
            r3 = r5
        L27:
            int r2 = r4 + 2
            goto L9
        L2a:
            okio.Buffer r2 = new okio.Buffer
            r2.<init>()
        L2f:
            int r4 = r8.length
            if (r1 >= r4) goto L5f
            r4 = 58
            if (r1 != r0) goto L40
            r2.writeByte(r4)
            int r1 = r1 + r3
            if (r1 != r5) goto L2f
            r2.writeByte(r4)
            goto L2f
        L40:
            if (r1 <= 0) goto L45
            r2.writeByte(r4)
        L45:
            r4 = r8[r1]
            r6 = 255(0xff, float:3.57E-43)
            int r4 = okhttp3.internal._UtilCommonKt.and(r4, r6)
            int r4 = r4 << 8
            int r7 = r1 + 1
            r7 = r8[r7]
            int r6 = okhttp3.internal._UtilCommonKt.and(r7, r6)
            r4 = r4 | r6
            long r6 = (long) r4
            r2.writeHexadecimalUnsignedLong(r6)
            int r1 = r1 + 2
            goto L2f
        L5f:
            java.lang.String r8 = r2.readUtf8()
            return r8
    }

    private static final boolean isMappedIpv4Address(byte[] r3) {
            int r0 = r3.length
            r1 = 16
            r2 = 0
            if (r0 == r1) goto L7
            return r2
        L7:
            r0 = 0
        L8:
            r1 = 10
            if (r0 >= r1) goto L14
            r1 = r3[r0]
            if (r1 == 0) goto L11
            return r2
        L11:
            int r0 = r0 + 1
            goto L8
        L14:
            r0 = r3[r1]
            r1 = -1
            if (r0 == r1) goto L1a
            return r2
        L1a:
            r0 = 11
            r3 = r3[r0]
            if (r3 == r1) goto L21
            return r2
        L21:
            r3 = 1
            return r3
    }

    @org.jetbrains.annotations.Nullable
    public static final java.lang.String toCanonicalHost(@org.jetbrains.annotations.NotNull java.lang.String r4) {
            java.lang.String r0 = "<this>"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.lang.String r0 = ":"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.u.l3(r4, r0, r1, r2, r3)
            if (r0 == 0) goto L69
            java.lang.String r0 = "["
            boolean r0 = kotlin.text.u.H2(r4, r0, r1, r2, r3)
            if (r0 == 0) goto L2b
            java.lang.String r0 = "]"
            boolean r0 = kotlin.text.u.Z1(r4, r0, r1, r2, r3)
            if (r0 == 0) goto L2b
            int r0 = r4.length()
            r1 = 1
            int r0 = r0 - r1
            byte[] r0 = decodeIpv6(r4, r1, r0)
            goto L33
        L2b:
            int r0 = r4.length()
            byte[] r0 = decodeIpv6(r4, r1, r0)
        L33:
            if (r0 != 0) goto L36
            return r3
        L36:
            byte[] r0 = canonicalizeInetAddress(r0)
            int r1 = r0.length
            r2 = 16
            if (r1 != r2) goto L44
            java.lang.String r4 = inet6AddressToAscii(r0)
            return r4
        L44:
            int r1 = r0.length
            r2 = 4
            if (r1 != r2) goto L4d
            java.lang.String r4 = inet4AddressToAscii(r0)
            return r4
        L4d:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid IPv6 address: '"
            r1.append(r2)
            r1.append(r4)
            r4 = 39
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
        L69:
            java.lang.String r4 = idnToAscii(r4)
            if (r4 != 0) goto L70
            return r3
        L70:
            int r0 = r4.length()
            if (r0 != 0) goto L77
            return r3
        L77:
            boolean r0 = containsInvalidHostnameAsciiCodes(r4)
            if (r0 == 0) goto L7e
            return r3
        L7e:
            boolean r0 = containsInvalidLabelLengths(r4)
            if (r0 == 0) goto L85
            return r3
        L85:
            return r4
    }
}

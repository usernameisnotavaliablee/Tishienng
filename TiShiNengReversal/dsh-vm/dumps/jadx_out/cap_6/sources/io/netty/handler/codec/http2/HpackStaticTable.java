package io.netty.handler.codec.http2;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class HpackStaticTable {
    private static final io.netty.handler.codec.http2.CharSequenceMap<java.lang.Integer> STATIC_INDEX_BY_NAME = null;
    private static final java.util.List<io.netty.handler.codec.http2.HpackHeaderField> STATIC_TABLE = null;
    static final int length = 0;

    static {
            java.lang.String r0 = ":authority"
            io.netty.handler.codec.http2.HpackHeaderField r0 = newEmptyHeaderField(r0)
            java.lang.String r1 = "GET"
            java.lang.String r2 = ":method"
            io.netty.handler.codec.http2.HpackHeaderField r1 = newHeaderField(r2, r1)
            java.lang.String r3 = "POST"
            io.netty.handler.codec.http2.HpackHeaderField r2 = newHeaderField(r2, r3)
            java.lang.String r3 = "/"
            java.lang.String r4 = ":path"
            io.netty.handler.codec.http2.HpackHeaderField r3 = newHeaderField(r4, r3)
            java.lang.String r5 = "/index.html"
            io.netty.handler.codec.http2.HpackHeaderField r4 = newHeaderField(r4, r5)
            java.lang.String r5 = "http"
            java.lang.String r6 = ":scheme"
            io.netty.handler.codec.http2.HpackHeaderField r5 = newHeaderField(r6, r5)
            java.lang.String r7 = "https"
            io.netty.handler.codec.http2.HpackHeaderField r6 = newHeaderField(r6, r7)
            java.lang.String r7 = "200"
            java.lang.String r8 = ":status"
            io.netty.handler.codec.http2.HpackHeaderField r7 = newHeaderField(r8, r7)
            java.lang.String r9 = "204"
            io.netty.handler.codec.http2.HpackHeaderField r9 = newHeaderField(r8, r9)
            java.lang.String r10 = "206"
            io.netty.handler.codec.http2.HpackHeaderField r10 = newHeaderField(r8, r10)
            java.lang.String r11 = "304"
            io.netty.handler.codec.http2.HpackHeaderField r11 = newHeaderField(r8, r11)
            java.lang.String r12 = "400"
            io.netty.handler.codec.http2.HpackHeaderField r12 = newHeaderField(r8, r12)
            java.lang.String r13 = "404"
            io.netty.handler.codec.http2.HpackHeaderField r13 = newHeaderField(r8, r13)
            java.lang.String r14 = "500"
            io.netty.handler.codec.http2.HpackHeaderField r8 = newHeaderField(r8, r14)
            java.lang.String r14 = "accept-charset"
            io.netty.handler.codec.http2.HpackHeaderField r14 = newEmptyHeaderField(r14)
            java.lang.String r15 = "accept-encoding"
            r16 = r0
            java.lang.String r0 = "gzip, deflate"
            io.netty.handler.codec.http2.HpackHeaderField r0 = newHeaderField(r15, r0)
            java.lang.String r15 = "accept-language"
            io.netty.handler.codec.http2.HpackHeaderField r15 = newEmptyHeaderField(r15)
            java.lang.String r17 = "accept-ranges"
            io.netty.handler.codec.http2.HpackHeaderField r17 = newEmptyHeaderField(r17)
            java.lang.String r18 = "accept"
            io.netty.handler.codec.http2.HpackHeaderField r18 = newEmptyHeaderField(r18)
            java.lang.String r19 = "access-control-allow-origin"
            io.netty.handler.codec.http2.HpackHeaderField r19 = newEmptyHeaderField(r19)
            java.lang.String r20 = "age"
            io.netty.handler.codec.http2.HpackHeaderField r20 = newEmptyHeaderField(r20)
            java.lang.String r21 = "allow"
            io.netty.handler.codec.http2.HpackHeaderField r21 = newEmptyHeaderField(r21)
            java.lang.String r22 = "authorization"
            io.netty.handler.codec.http2.HpackHeaderField r22 = newEmptyHeaderField(r22)
            java.lang.String r23 = "cache-control"
            io.netty.handler.codec.http2.HpackHeaderField r23 = newEmptyHeaderField(r23)
            java.lang.String r24 = "content-disposition"
            io.netty.handler.codec.http2.HpackHeaderField r24 = newEmptyHeaderField(r24)
            java.lang.String r25 = "content-encoding"
            io.netty.handler.codec.http2.HpackHeaderField r25 = newEmptyHeaderField(r25)
            java.lang.String r26 = "content-language"
            io.netty.handler.codec.http2.HpackHeaderField r26 = newEmptyHeaderField(r26)
            java.lang.String r27 = "content-length"
            io.netty.handler.codec.http2.HpackHeaderField r27 = newEmptyHeaderField(r27)
            java.lang.String r28 = "content-location"
            io.netty.handler.codec.http2.HpackHeaderField r28 = newEmptyHeaderField(r28)
            java.lang.String r29 = "content-range"
            io.netty.handler.codec.http2.HpackHeaderField r29 = newEmptyHeaderField(r29)
            java.lang.String r30 = "content-type"
            io.netty.handler.codec.http2.HpackHeaderField r30 = newEmptyHeaderField(r30)
            java.lang.String r31 = "cookie"
            io.netty.handler.codec.http2.HpackHeaderField r31 = newEmptyHeaderField(r31)
            java.lang.String r32 = "date"
            io.netty.handler.codec.http2.HpackHeaderField r32 = newEmptyHeaderField(r32)
            java.lang.String r33 = "etag"
            io.netty.handler.codec.http2.HpackHeaderField r33 = newEmptyHeaderField(r33)
            java.lang.String r34 = "expect"
            io.netty.handler.codec.http2.HpackHeaderField r34 = newEmptyHeaderField(r34)
            java.lang.String r35 = "expires"
            io.netty.handler.codec.http2.HpackHeaderField r35 = newEmptyHeaderField(r35)
            java.lang.String r36 = "from"
            io.netty.handler.codec.http2.HpackHeaderField r36 = newEmptyHeaderField(r36)
            java.lang.String r37 = "host"
            io.netty.handler.codec.http2.HpackHeaderField r37 = newEmptyHeaderField(r37)
            java.lang.String r38 = "if-match"
            io.netty.handler.codec.http2.HpackHeaderField r38 = newEmptyHeaderField(r38)
            java.lang.String r39 = "if-modified-since"
            io.netty.handler.codec.http2.HpackHeaderField r39 = newEmptyHeaderField(r39)
            java.lang.String r40 = "if-none-match"
            io.netty.handler.codec.http2.HpackHeaderField r40 = newEmptyHeaderField(r40)
            java.lang.String r41 = "if-range"
            io.netty.handler.codec.http2.HpackHeaderField r41 = newEmptyHeaderField(r41)
            java.lang.String r42 = "if-unmodified-since"
            io.netty.handler.codec.http2.HpackHeaderField r42 = newEmptyHeaderField(r42)
            java.lang.String r43 = "last-modified"
            io.netty.handler.codec.http2.HpackHeaderField r43 = newEmptyHeaderField(r43)
            java.lang.String r44 = "link"
            io.netty.handler.codec.http2.HpackHeaderField r44 = newEmptyHeaderField(r44)
            java.lang.String r45 = "location"
            io.netty.handler.codec.http2.HpackHeaderField r45 = newEmptyHeaderField(r45)
            java.lang.String r46 = "max-forwards"
            io.netty.handler.codec.http2.HpackHeaderField r46 = newEmptyHeaderField(r46)
            java.lang.String r47 = "proxy-authenticate"
            io.netty.handler.codec.http2.HpackHeaderField r47 = newEmptyHeaderField(r47)
            java.lang.String r48 = "proxy-authorization"
            io.netty.handler.codec.http2.HpackHeaderField r48 = newEmptyHeaderField(r48)
            java.lang.String r49 = "range"
            io.netty.handler.codec.http2.HpackHeaderField r49 = newEmptyHeaderField(r49)
            java.lang.String r50 = "referer"
            io.netty.handler.codec.http2.HpackHeaderField r50 = newEmptyHeaderField(r50)
            java.lang.String r51 = "refresh"
            io.netty.handler.codec.http2.HpackHeaderField r51 = newEmptyHeaderField(r51)
            java.lang.String r52 = "retry-after"
            io.netty.handler.codec.http2.HpackHeaderField r52 = newEmptyHeaderField(r52)
            java.lang.String r53 = "server"
            io.netty.handler.codec.http2.HpackHeaderField r53 = newEmptyHeaderField(r53)
            java.lang.String r54 = "set-cookie"
            io.netty.handler.codec.http2.HpackHeaderField r54 = newEmptyHeaderField(r54)
            java.lang.String r55 = "strict-transport-security"
            io.netty.handler.codec.http2.HpackHeaderField r55 = newEmptyHeaderField(r55)
            java.lang.String r56 = "transfer-encoding"
            io.netty.handler.codec.http2.HpackHeaderField r56 = newEmptyHeaderField(r56)
            java.lang.String r57 = "user-agent"
            io.netty.handler.codec.http2.HpackHeaderField r57 = newEmptyHeaderField(r57)
            java.lang.String r58 = "vary"
            io.netty.handler.codec.http2.HpackHeaderField r58 = newEmptyHeaderField(r58)
            java.lang.String r59 = "via"
            io.netty.handler.codec.http2.HpackHeaderField r59 = newEmptyHeaderField(r59)
            java.lang.String r60 = "www-authenticate"
            io.netty.handler.codec.http2.HpackHeaderField r60 = newEmptyHeaderField(r60)
            r61 = r0
            r0 = 61
            io.netty.handler.codec.http2.HpackHeaderField[] r0 = new io.netty.handler.codec.http2.HpackHeaderField[r0]
            r62 = 0
            r0[r62] = r16
            r16 = 1
            r0[r16] = r1
            r1 = 2
            r0[r1] = r2
            r1 = 3
            r0[r1] = r3
            r1 = 4
            r0[r1] = r4
            r1 = 5
            r0[r1] = r5
            r1 = 6
            r0[r1] = r6
            r1 = 7
            r0[r1] = r7
            r1 = 8
            r0[r1] = r9
            r1 = 9
            r0[r1] = r10
            r1 = 10
            r0[r1] = r11
            r1 = 11
            r0[r1] = r12
            r1 = 12
            r0[r1] = r13
            r1 = 13
            r0[r1] = r8
            r1 = 14
            r0[r1] = r14
            r1 = 15
            r0[r1] = r61
            r1 = 16
            r0[r1] = r15
            r1 = 17
            r0[r1] = r17
            r1 = 18
            r0[r1] = r18
            r1 = 19
            r0[r1] = r19
            r1 = 20
            r0[r1] = r20
            r1 = 21
            r0[r1] = r21
            r1 = 22
            r0[r1] = r22
            r1 = 23
            r0[r1] = r23
            r1 = 24
            r0[r1] = r24
            r1 = 25
            r0[r1] = r25
            r1 = 26
            r0[r1] = r26
            r1 = 27
            r0[r1] = r27
            r1 = 28
            r0[r1] = r28
            r1 = 29
            r0[r1] = r29
            r1 = 30
            r0[r1] = r30
            r1 = 31
            r0[r1] = r31
            r1 = 32
            r0[r1] = r32
            r1 = 33
            r0[r1] = r33
            r1 = 34
            r0[r1] = r34
            r1 = 35
            r0[r1] = r35
            r1 = 36
            r0[r1] = r36
            r1 = 37
            r0[r1] = r37
            r1 = 38
            r0[r1] = r38
            r1 = 39
            r0[r1] = r39
            r1 = 40
            r0[r1] = r40
            r1 = 41
            r0[r1] = r41
            r1 = 42
            r0[r1] = r42
            r1 = 43
            r0[r1] = r43
            r1 = 44
            r0[r1] = r44
            r1 = 45
            r0[r1] = r45
            r1 = 46
            r0[r1] = r46
            r1 = 47
            r0[r1] = r47
            r1 = 48
            r0[r1] = r48
            r1 = 49
            r0[r1] = r49
            r1 = 50
            r0[r1] = r50
            r1 = 51
            r0[r1] = r51
            r1 = 52
            r0[r1] = r52
            r1 = 53
            r0[r1] = r53
            r1 = 54
            r0[r1] = r54
            r1 = 55
            r0[r1] = r55
            r1 = 56
            r0[r1] = r56
            r1 = 57
            r0[r1] = r57
            r1 = 58
            r0[r1] = r58
            r1 = 59
            r0[r1] = r59
            r1 = 60
            r0[r1] = r60
            java.util.List r0 = java.util.Arrays.asList(r0)
            io.netty.handler.codec.http2.HpackStaticTable.STATIC_TABLE = r0
            io.netty.handler.codec.http2.CharSequenceMap r1 = createMap()
            io.netty.handler.codec.http2.HpackStaticTable.STATIC_INDEX_BY_NAME = r1
            int r0 = r0.size()
            io.netty.handler.codec.http2.HpackStaticTable.length = r0
            return
    }

    private HpackStaticTable() {
            r0 = this;
            r0.<init>()
            return
    }

    private static io.netty.handler.codec.http2.CharSequenceMap<java.lang.Integer> createMap() {
            java.util.List<io.netty.handler.codec.http2.HpackHeaderField> r0 = io.netty.handler.codec.http2.HpackStaticTable.STATIC_TABLE
            int r0 = r0.size()
            io.netty.handler.codec.http2.CharSequenceMap r1 = new io.netty.handler.codec.http2.CharSequenceMap
            r2 = 1
            io.netty.handler.codec.UnsupportedValueConverter r3 = io.netty.handler.codec.UnsupportedValueConverter.instance()
            r1.<init>(r2, r3, r0)
        L10:
            if (r0 <= 0) goto L22
            io.netty.handler.codec.http2.HpackHeaderField r2 = getEntry(r0)
            java.lang.CharSequence r2 = r2.name
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            r1.set(r2, r3)
            int r0 = r0 + (-1)
            goto L10
        L22:
            return r1
    }

    static io.netty.handler.codec.http2.HpackHeaderField getEntry(int r1) {
            java.util.List<io.netty.handler.codec.http2.HpackHeaderField> r0 = io.netty.handler.codec.http2.HpackStaticTable.STATIC_TABLE
            int r1 = r1 + (-1)
            java.lang.Object r1 = r0.get(r1)
            io.netty.handler.codec.http2.HpackHeaderField r1 = (io.netty.handler.codec.http2.HpackHeaderField) r1
            return r1
    }

    static int getIndex(java.lang.CharSequence r1) {
            io.netty.handler.codec.http2.CharSequenceMap<java.lang.Integer> r0 = io.netty.handler.codec.http2.HpackStaticTable.STATIC_INDEX_BY_NAME
            java.lang.Object r1 = r0.get(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            if (r1 != 0) goto Lc
            r1 = -1
            return r1
        Lc:
            int r1 = r1.intValue()
            return r1
    }

    static int getIndex(java.lang.CharSequence r4, java.lang.CharSequence r5) {
            int r0 = getIndex(r4)
            r1 = -1
            if (r0 != r1) goto L8
            return r1
        L8:
            int r2 = io.netty.handler.codec.http2.HpackStaticTable.length
            if (r0 > r2) goto L25
            io.netty.handler.codec.http2.HpackHeaderField r2 = getEntry(r0)
            java.lang.CharSequence r3 = r2.name
            int r3 = io.netty.handler.codec.http2.HpackUtil.equalsConstantTime(r4, r3)
            if (r3 != 0) goto L19
            goto L25
        L19:
            java.lang.CharSequence r2 = r2.value
            int r2 = io.netty.handler.codec.http2.HpackUtil.equalsConstantTime(r5, r2)
            if (r2 == 0) goto L22
            return r0
        L22:
            int r0 = r0 + 1
            goto L8
        L25:
            return r1
    }

    private static io.netty.handler.codec.http2.HpackHeaderField newEmptyHeaderField(java.lang.String r2) {
            io.netty.handler.codec.http2.HpackHeaderField r0 = new io.netty.handler.codec.http2.HpackHeaderField
            io.netty.util.AsciiString r2 = io.netty.util.AsciiString.cached(r2)
            io.netty.util.AsciiString r1 = io.netty.util.AsciiString.EMPTY_STRING
            r0.<init>(r2, r1)
            return r0
    }

    private static io.netty.handler.codec.http2.HpackHeaderField newHeaderField(java.lang.String r1, java.lang.String r2) {
            io.netty.handler.codec.http2.HpackHeaderField r0 = new io.netty.handler.codec.http2.HpackHeaderField
            io.netty.util.AsciiString r1 = io.netty.util.AsciiString.cached(r1)
            io.netty.util.AsciiString r2 = io.netty.util.AsciiString.cached(r2)
            r0.<init>(r1, r2)
            return r0
    }
}

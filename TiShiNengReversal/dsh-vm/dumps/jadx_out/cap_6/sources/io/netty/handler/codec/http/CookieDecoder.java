package io.netty.handler.codec.http;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class CookieDecoder {
    private static final java.lang.String COMMENT = "Comment";
    private static final java.lang.String COMMENTURL = "CommentURL";
    private static final java.lang.String DISCARD = "Discard";
    private static final io.netty.handler.codec.http.CookieDecoder LAX = null;
    private static final java.lang.String PORT = "Port";
    private static final io.netty.handler.codec.http.CookieDecoder STRICT = null;
    private static final java.lang.String VERSION = "Version";
    private final io.netty.util.internal.logging.InternalLogger logger;
    private final boolean strict;

    static {
            io.netty.handler.codec.http.CookieDecoder r0 = new io.netty.handler.codec.http.CookieDecoder
            r1 = 1
            r0.<init>(r1)
            io.netty.handler.codec.http.CookieDecoder.STRICT = r0
            io.netty.handler.codec.http.CookieDecoder r0 = new io.netty.handler.codec.http.CookieDecoder
            r1 = 0
            r0.<init>(r1)
            io.netty.handler.codec.http.CookieDecoder.LAX = r0
            return
    }

    private CookieDecoder(boolean r2) {
            r1 = this;
            r1.<init>()
            java.lang.Class<io.netty.handler.codec.http.CookieDecoder> r0 = io.netty.handler.codec.http.CookieDecoder.class
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            r1.logger = r0
            r1.strict = r2
            return
    }

    public static java.util.Set<io.netty.handler.codec.http.Cookie> decode(java.lang.String r1) {
            r0 = 1
            java.util.Set r1 = decode(r1, r0)
            return r1
    }

    public static java.util.Set<io.netty.handler.codec.http.Cookie> decode(java.lang.String r0, boolean r1) {
            if (r1 == 0) goto L5
            io.netty.handler.codec.http.CookieDecoder r1 = io.netty.handler.codec.http.CookieDecoder.STRICT
            goto L7
        L5:
            io.netty.handler.codec.http.CookieDecoder r1 = io.netty.handler.codec.http.CookieDecoder.LAX
        L7:
            java.util.Set r0 = r1.doDecode(r0)
            return r0
    }

    private java.util.Set<io.netty.handler.codec.http.Cookie> doDecode(java.lang.String r24) {
            r23 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r1 = 8
            r0.<init>(r1)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            r1 = r24
            extractKeyValuePairs(r1, r0, r2)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L1a
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
        L1a:
            r1 = 0
            java.lang.Object r3 = r0.get(r1)
            java.lang.String r3 = (java.lang.String) r3
            java.lang.String r4 = "Version"
            boolean r3 = r3.equalsIgnoreCase(r4)
            if (r3 == 0) goto L38
            java.lang.Object r3 = r2.get(r1)     // Catch: java.lang.NumberFormatException -> L34
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.NumberFormatException -> L34
            int r3 = java.lang.Integer.parseInt(r3)     // Catch: java.lang.NumberFormatException -> L34
            goto L36
        L34:
            r3 = 0
        L36:
            r6 = 1
            goto L3a
        L38:
            r3 = 0
            r6 = 0
        L3a:
            int r7 = r0.size()
            if (r7 > r6) goto L43
            java.util.Set r0 = java.util.Collections.EMPTY_SET
            return r0
        L43:
            java.util.TreeSet r7 = new java.util.TreeSet
            r7.<init>()
        L48:
            int r8 = r0.size()
            if (r6 >= r8) goto L66
            java.lang.Object r8 = r0.get(r6)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r2.get(r6)
            java.lang.String r9 = (java.lang.String) r9
            if (r9 != 0) goto L5e
            java.lang.String r9 = ""
        L5e:
            r10 = r23
            io.netty.handler.codec.http.DefaultCookie r8 = r10.initCookie(r8, r9)
            if (r8 != 0) goto L69
        L66:
            r1 = r7
            goto L18c
        L69:
            java.util.ArrayList r9 = new java.util.ArrayList
            r11 = 2
            r9.<init>(r11)
            int r11 = r6 + 1
            r12 = 0
            r13 = -9223372036854775808
            r16 = r6
            r17 = r7
            r15 = r12
            r5 = r13
            r7 = 0
            r10 = 0
            r18 = 0
            r13 = r15
            r14 = r13
        L80:
            int r1 = r0.size()
            if (r11 >= r1) goto L154
            java.lang.Object r1 = r0.get(r11)
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r19 = r2.get(r11)
            r20 = r0
            r0 = r19
            java.lang.String r0 = (java.lang.String) r0
            r19 = r2
            java.lang.String r2 = "Discard"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto La4
            r18 = 1
            goto L14a
        La4:
            java.lang.String r2 = "Secure"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto Laf
            r10 = 1
            goto L14a
        Laf:
            java.lang.String r2 = "HTTPOnly"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto Lba
            r7 = 1
            goto L14a
        Lba:
            java.lang.String r2 = "Comment"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto Lc5
            r12 = r0
            goto L14a
        Lc5:
            java.lang.String r2 = "CommentURL"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto Ld0
            r13 = r0
            goto L14a
        Ld0:
            java.lang.String r2 = "Domain"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto Ldb
            r14 = r0
            goto L14a
        Ldb:
            java.lang.String r2 = "Path"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto Le5
            r15 = r0
            goto L14a
        Le5:
            java.lang.String r2 = "Expires"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L10e
            java.util.Date r0 = io.netty.handler.codec.DateFormatter.parseHttpDate(r0)
            if (r0 == 0) goto L14a
            long r0 = r0.getTime()
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r5
            r5 = 1000(0x3e8, double:4.94E-321)
            long r21 = r0 / r5
            long r0 = r0 % r5
            r5 = 0
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 == 0) goto L109
            r0 = 1
            goto L10a
        L109:
            r0 = 0
        L10a:
            long r0 = (long) r0
            long r5 = r21 + r0
            goto L14a
        L10e:
            java.lang.String r2 = "Max-Age"
            boolean r2 = r2.equalsIgnoreCase(r1)
            if (r2 == 0) goto L11d
            int r0 = java.lang.Integer.parseInt(r0)
            long r0 = (long) r0
            r5 = r0
            goto L14a
        L11d:
            boolean r2 = r4.equalsIgnoreCase(r1)
            if (r2 == 0) goto L128
            int r3 = java.lang.Integer.parseInt(r0)
            goto L14a
        L128:
            java.lang.String r2 = "Port"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L158
            java.lang.String r1 = ","
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 0
        L138:
            if (r2 >= r1) goto L14a
            r21 = r0[r2]
            r22 = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r21)     // Catch: java.lang.NumberFormatException -> L145
            r9.add(r0)     // Catch: java.lang.NumberFormatException -> L145
        L145:
            int r2 = r2 + 1
            r0 = r22
            goto L138
        L14a:
            int r11 = r11 + 1
            int r16 = r16 + 1
            r2 = r19
            r0 = r20
            goto L80
        L154:
            r20 = r0
            r19 = r2
        L158:
            r8.setVersion(r3)
            r8.setMaxAge(r5)
            r8.setPath(r15)
            r8.setDomain(r14)
            r8.setSecure(r10)
            r8.setHttpOnly(r7)
            if (r3 <= 0) goto L16f
            r8.setComment(r12)
        L16f:
            r0 = 1
            if (r3 <= r0) goto L17d
            r8.setCommentUrl(r13)
            r8.setPorts(r9)
            r1 = r18
            r8.setDiscard(r1)
        L17d:
            r1 = r17
            r1.add(r8)
            int r6 = r16 + 1
            r7 = r1
            r2 = r19
            r0 = r20
            r1 = 0
            goto L48
        L18c:
            return r1
    }

    private static void extractKeyValuePairs(java.lang.String r12, java.util.List<java.lang.String> r13, java.util.List<java.lang.String> r14) {
            int r0 = r12.length()
            r1 = 0
            r2 = 0
        L6:
            if (r2 != r0) goto L9
            goto L1e
        L9:
            char r3 = r12.charAt(r2)
            r4 = 32
            if (r3 == r4) goto Ld3
            r4 = 44
            if (r3 == r4) goto Ld3
            r4 = 59
            if (r3 == r4) goto Ld3
            switch(r3) {
                case 9: goto Ld3;
                case 10: goto Ld3;
                case 11: goto Ld3;
                case 12: goto Ld3;
                case 13: goto Ld3;
                default: goto L1c;
            }
        L1c:
            if (r2 != r0) goto L1f
        L1e:
            return
        L1f:
            char r3 = r12.charAt(r2)
            r5 = 36
            if (r3 != r5) goto L2a
            int r2 = r2 + 1
            goto L1c
        L2a:
            r3 = 0
            if (r2 != r0) goto L30
            r4 = r3
            goto Lcb
        L30:
            r5 = r2
        L31:
            char r6 = r12.charAt(r5)
            if (r6 == r4) goto Lc5
            r7 = 61
            if (r6 == r7) goto L48
            int r5 = r5 + 1
            if (r5 != r0) goto L31
            java.lang.String r2 = r12.substring(r2)
        L43:
            r4 = r3
            r3 = r2
            r2 = r5
            goto Lcb
        L48:
            java.lang.String r6 = r12.substring(r2, r5)
            int r2 = r5 + 1
            if (r2 != r0) goto L56
            java.lang.String r3 = ""
            r4 = r3
        L53:
            r3 = r6
            goto Lcb
        L56:
            char r7 = r12.charAt(r2)
            r8 = 39
            r9 = 34
            if (r7 == r9) goto L76
            if (r7 != r8) goto L63
            goto L76
        L63:
            int r3 = r12.indexOf(r4, r2)
            if (r3 <= 0) goto L6e
            java.lang.String r2 = r12.substring(r2, r3)
            goto L73
        L6e:
            java.lang.String r2 = r12.substring(r2)
            r3 = r0
        L73:
            r4 = r2
            r2 = r3
            goto L53
        L76:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r3 = r12.length()
            int r3 = r3 - r2
            r4.<init>(r3)
            int r5 = r5 + 2
        L82:
            r2 = 0
        L83:
            if (r5 != r0) goto L8c
            java.lang.String r3 = r4.toString()
            r4 = r3
            r2 = r5
            goto L53
        L8c:
            r3 = 92
            r10 = 1
            if (r2 == 0) goto Lab
            int r2 = r5 + 1
            char r5 = r12.charAt(r5)
            if (r5 == r9) goto La1
            if (r5 == r8) goto La1
            if (r5 == r3) goto La1
            r4.append(r5)
            goto La9
        La1:
            int r3 = r4.length()
            int r3 = r3 - r10
            r4.setCharAt(r3, r5)
        La9:
            r5 = r2
            goto L82
        Lab:
            int r11 = r5 + 1
            char r5 = r12.charAt(r5)
            if (r5 != r7) goto Lbb
            java.lang.String r3 = r4.toString()
            r4 = r3
            r3 = r6
            r2 = r11
            goto Lcb
        Lbb:
            r4.append(r5)
            if (r5 != r3) goto Lc3
            r5 = r11
            r2 = 1
            goto L83
        Lc3:
            r5 = r11
            goto L83
        Lc5:
            java.lang.String r2 = r12.substring(r2, r5)
            goto L43
        Lcb:
            r13.add(r3)
            r14.add(r4)
            goto L6
        Ld3:
            int r2 = r2 + 1
            goto L6
    }

    private io.netty.handler.codec.http.DefaultCookie initCookie(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            r0 = 0
            if (r4 == 0) goto L81
            int r1 = r4.length()
            if (r1 != 0) goto Lb
            goto L81
        Lb:
            if (r5 != 0) goto L15
            io.netty.util.internal.logging.InternalLogger r4 = r3.logger
            java.lang.String r5 = "Skipping cookie with null value"
            r4.debug(r5)
            return r0
        L15:
            java.lang.CharSequence r1 = io.netty.handler.codec.http.CookieUtil.unwrapValue(r5)
            if (r1 != 0) goto L23
            io.netty.util.internal.logging.InternalLogger r4 = r3.logger
            java.lang.String r5 = "Skipping cookie because starting quotes are not properly balanced in '{}'"
            r4.debug(r5, r1)
            return r0
        L23:
            boolean r2 = r3.strict
            if (r2 == 0) goto L45
            int r2 = io.netty.handler.codec.http.CookieUtil.firstInvalidCookieNameOctet(r4)
            if (r2 < 0) goto L45
            io.netty.util.internal.logging.InternalLogger r5 = r3.logger
            boolean r5 = r5.isDebugEnabled()
            if (r5 == 0) goto L44
            io.netty.util.internal.logging.InternalLogger r5 = r3.logger
            char r1 = r4.charAt(r2)
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            java.lang.String r2 = "Skipping cookie because name '{}' contains invalid char '{}'"
            r5.debug(r2, r4, r1)
        L44:
            return r0
        L45:
            int r2 = r1.length()
            int r5 = r5.length()
            if (r2 == r5) goto L51
            r5 = 1
            goto L52
        L51:
            r5 = 0
        L52:
            boolean r2 = r3.strict
            if (r2 == 0) goto L74
            int r2 = io.netty.handler.codec.http.CookieUtil.firstInvalidCookieValueOctet(r1)
            if (r2 < 0) goto L74
            io.netty.util.internal.logging.InternalLogger r4 = r3.logger
            boolean r4 = r4.isDebugEnabled()
            if (r4 == 0) goto L73
            io.netty.util.internal.logging.InternalLogger r4 = r3.logger
            char r5 = r1.charAt(r2)
            java.lang.Character r5 = java.lang.Character.valueOf(r5)
            java.lang.String r2 = "Skipping cookie because value '{}' contains invalid char '{}'"
            r4.debug(r2, r1, r5)
        L73:
            return r0
        L74:
            io.netty.handler.codec.http.DefaultCookie r0 = new io.netty.handler.codec.http.DefaultCookie
            java.lang.String r1 = r1.toString()
            r0.<init>(r4, r1)
            r0.setWrap(r5)
            return r0
        L81:
            io.netty.util.internal.logging.InternalLogger r4 = r3.logger
            java.lang.String r5 = "Skipping cookie with null name"
            r4.debug(r5)
            return r0
    }
}

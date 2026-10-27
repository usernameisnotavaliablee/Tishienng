package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class HeaderTokenizer {
    private static final javax.mail.internet.HeaderTokenizer.Token EOFToken = null;
    public static final java.lang.String MIME = "()<>@,;:\\\"\t []/?=";
    public static final java.lang.String RFC822 = "()<>@,;:\\\"\t .[]";
    private int currentPos;
    private java.lang.String delimiters;
    private int maxPos;
    private int nextPos;
    private int peekPos;
    private boolean skipComments;
    private java.lang.String string;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Token {
        public static final int ATOM = -1;
        public static final int COMMENT = -3;
        public static final int EOF = -4;
        public static final int QUOTEDSTRING = -2;
        private int type;
        private java.lang.String value;

        public Token(int r1, java.lang.String r2) {
                r0 = this;
                r0.<init>()
                r0.type = r1
                r0.value = r2
                return
        }

        public int getType() {
                r1 = this;
                int r0 = r1.type
                return r0
        }

        public java.lang.String getValue() {
                r1 = this;
                java.lang.String r0 = r1.value
                return r0
        }
    }

    static {
            javax.mail.internet.HeaderTokenizer$Token r0 = new javax.mail.internet.HeaderTokenizer$Token
            r1 = -4
            r2 = 0
            r0.<init>(r1, r2)
            javax.mail.internet.HeaderTokenizer.EOFToken = r0
            return
    }

    public HeaderTokenizer(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "()<>@,;:\\\"\t .[]"
            r1.<init>(r2, r0)
            return
    }

    public HeaderTokenizer(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 1
            r1.<init>(r2, r3, r0)
            return
    }

    public HeaderTokenizer(java.lang.String r1, java.lang.String r2, boolean r3) {
            r0 = this;
            r0.<init>()
            if (r1 != 0) goto L7
            java.lang.String r1 = ""
        L7:
            r0.string = r1
            r0.skipComments = r3
            r0.delimiters = r2
            r2 = 0
            r0.peekPos = r2
            r0.nextPos = r2
            r0.currentPos = r2
            int r1 = r1.length()
            r0.maxPos = r1
            return
    }

    private static java.lang.String filterToken(java.lang.String r6, int r7, int r8) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            r2 = 0
            r3 = 0
        L8:
            if (r7 < r8) goto Lf
            java.lang.String r6 = r0.toString()
            return r6
        Lf:
            char r4 = r6.charAt(r7)
            r5 = 10
            if (r4 != r5) goto L1b
            if (r2 == 0) goto L1b
        L19:
            r2 = 0
            goto L34
        L1b:
            if (r3 != 0) goto L2f
            r2 = 92
            r5 = 1
            if (r4 != r2) goto L25
            r2 = 0
            r3 = 1
            goto L34
        L25:
            r2 = 13
            if (r4 != r2) goto L2b
            r2 = 1
            goto L34
        L2b:
            r0.append(r4)
            goto L19
        L2f:
            r0.append(r4)
            r2 = 0
            r3 = 0
        L34:
            int r7 = r7 + 1
            goto L8
    }

    private javax.mail.internet.HeaderTokenizer.Token getNext() throws javax.mail.internet.ParseException {
            r11 = this;
            int r0 = r11.currentPos
            int r1 = r11.maxPos
            if (r0 < r1) goto L9
            javax.mail.internet.HeaderTokenizer$Token r0 = javax.mail.internet.HeaderTokenizer.EOFToken
            return r0
        L9:
            int r0 = r11.skipWhiteSpace()
            r1 = -4
            if (r0 != r1) goto L13
            javax.mail.internet.HeaderTokenizer$Token r0 = javax.mail.internet.HeaderTokenizer.EOFToken
            return r0
        L13:
            java.lang.String r0 = r11.string
            int r2 = r11.currentPos
            char r0 = r0.charAt(r2)
            r2 = 0
            r3 = 0
        L1d:
            r4 = 13
            r5 = 92
            r6 = 40
            r7 = 1
            if (r0 == r6) goto Lcf
            r1 = 34
            if (r0 != r1) goto L73
            int r0 = r11.currentPos
            int r0 = r0 + r7
            r11.currentPos = r0
        L2f:
            int r2 = r11.currentPos
            int r6 = r11.maxPos
            if (r2 >= r6) goto L6b
            java.lang.String r6 = r11.string
            char r2 = r6.charAt(r2)
            if (r2 != r5) goto L44
            int r2 = r11.currentPos
            int r2 = r2 + r7
            r11.currentPos = r2
        L42:
            r3 = 1
            goto L65
        L44:
            if (r2 != r4) goto L47
            goto L42
        L47:
            if (r2 != r1) goto L65
            int r1 = r11.currentPos
            int r2 = r1 + 1
            r11.currentPos = r2
            if (r3 == 0) goto L58
            java.lang.String r2 = r11.string
            java.lang.String r0 = filterToken(r2, r0, r1)
            goto L5e
        L58:
            java.lang.String r2 = r11.string
            java.lang.String r0 = r2.substring(r0, r1)
        L5e:
            javax.mail.internet.HeaderTokenizer$Token r1 = new javax.mail.internet.HeaderTokenizer$Token
            r2 = -2
            r1.<init>(r2, r0)
            return r1
        L65:
            int r2 = r11.currentPos
            int r2 = r2 + r7
            r11.currentPos = r2
            goto L2f
        L6b:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.String r1 = "Unbalanced quoted string"
            r0.<init>(r1)
            throw r0
        L73:
            r3 = 32
            if (r0 < r3) goto Lbb
            r4 = 127(0x7f, float:1.78E-43)
            if (r0 >= r4) goto Lbb
            java.lang.String r5 = r11.delimiters
            int r5 = r5.indexOf(r0)
            if (r5 < 0) goto L84
            goto Lbb
        L84:
            int r0 = r11.currentPos
        L86:
            int r2 = r11.currentPos
            int r5 = r11.maxPos
            if (r2 < r5) goto L8d
            goto Lac
        L8d:
            java.lang.String r5 = r11.string
            char r2 = r5.charAt(r2)
            if (r2 < r3) goto Lac
            if (r2 >= r4) goto Lac
            if (r2 == r6) goto Lac
            if (r2 == r3) goto Lac
            if (r2 == r1) goto Lac
            java.lang.String r5 = r11.delimiters
            int r2 = r5.indexOf(r2)
            if (r2 < 0) goto La6
            goto Lac
        La6:
            int r2 = r11.currentPos
            int r2 = r2 + r7
            r11.currentPos = r2
            goto L86
        Lac:
            javax.mail.internet.HeaderTokenizer$Token r1 = new javax.mail.internet.HeaderTokenizer$Token
            java.lang.String r2 = r11.string
            int r3 = r11.currentPos
            java.lang.String r0 = r2.substring(r0, r3)
            r2 = -1
            r1.<init>(r2, r0)
            return r1
        Lbb:
            int r1 = r11.currentPos
            int r1 = r1 + r7
            r11.currentPos = r1
            char[] r1 = new char[r7]
            r1[r2] = r0
            javax.mail.internet.HeaderTokenizer$Token r2 = new javax.mail.internet.HeaderTokenizer$Token
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
            r2.<init>(r0, r3)
            return r2
        Lcf:
            int r0 = r11.currentPos
            int r0 = r0 + r7
            r11.currentPos = r0
            r8 = 1
        Ld5:
            if (r8 <= 0) goto L101
            int r9 = r11.currentPos
            int r10 = r11.maxPos
            if (r9 < r10) goto Lde
            goto L101
        Lde:
            java.lang.String r10 = r11.string
            char r9 = r10.charAt(r9)
            if (r9 != r5) goto Led
            int r3 = r11.currentPos
            int r3 = r3 + r7
            r11.currentPos = r3
        Leb:
            r3 = 1
            goto Lfb
        Led:
            if (r9 != r4) goto Lf0
            goto Leb
        Lf0:
            if (r9 != r6) goto Lf5
            int r8 = r8 + 1
            goto Lfb
        Lf5:
            r10 = 41
            if (r9 != r10) goto Lfb
            int r8 = r8 + (-1)
        Lfb:
            int r9 = r11.currentPos
            int r9 = r9 + r7
            r11.currentPos = r9
            goto Ld5
        L101:
            if (r8 != 0) goto L136
            boolean r4 = r11.skipComments
            if (r4 != 0) goto L123
            if (r3 == 0) goto L113
            java.lang.String r1 = r11.string
            int r2 = r11.currentPos
            int r2 = r2 - r7
            java.lang.String r0 = filterToken(r1, r0, r2)
            goto L11c
        L113:
            java.lang.String r1 = r11.string
            int r2 = r11.currentPos
            int r2 = r2 - r7
            java.lang.String r0 = r1.substring(r0, r2)
        L11c:
            javax.mail.internet.HeaderTokenizer$Token r1 = new javax.mail.internet.HeaderTokenizer$Token
            r2 = -3
            r1.<init>(r2, r0)
            return r1
        L123:
            int r0 = r11.skipWhiteSpace()
            if (r0 != r1) goto L12c
            javax.mail.internet.HeaderTokenizer$Token r0 = javax.mail.internet.HeaderTokenizer.EOFToken
            return r0
        L12c:
            java.lang.String r0 = r11.string
            int r4 = r11.currentPos
            char r0 = r0.charAt(r4)
            goto L1d
        L136:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.String r1 = "Unbalanced comments"
            r0.<init>(r1)
            throw r0
    }

    private int skipWhiteSpace() {
            r2 = this;
        L0:
            int r0 = r2.currentPos
            int r1 = r2.maxPos
            if (r0 < r1) goto L8
            r0 = -4
            return r0
        L8:
            java.lang.String r1 = r2.string
            char r0 = r1.charAt(r0)
            r1 = 32
            if (r0 == r1) goto L21
            r1 = 9
            if (r0 == r1) goto L21
            r1 = 13
            if (r0 == r1) goto L21
            r1 = 10
            if (r0 == r1) goto L21
            int r0 = r2.currentPos
            return r0
        L21:
            int r0 = r2.currentPos
            int r0 = r0 + 1
            r2.currentPos = r0
            goto L0
    }

    public java.lang.String getRemainder() {
            r2 = this;
            java.lang.String r0 = r2.string
            int r1 = r2.nextPos
            java.lang.String r0 = r0.substring(r1)
            return r0
    }

    public javax.mail.internet.HeaderTokenizer.Token next() throws javax.mail.internet.ParseException {
            r2 = this;
            int r0 = r2.nextPos
            r2.currentPos = r0
            javax.mail.internet.HeaderTokenizer$Token r0 = r2.getNext()
            int r1 = r2.currentPos
            r2.peekPos = r1
            r2.nextPos = r1
            return r0
    }

    public javax.mail.internet.HeaderTokenizer.Token peek() throws javax.mail.internet.ParseException {
            r2 = this;
            int r0 = r2.peekPos
            r2.currentPos = r0
            javax.mail.internet.HeaderTokenizer$Token r0 = r2.getNext()
            int r1 = r2.currentPos
            r2.peekPos = r1
            return r0
    }
}

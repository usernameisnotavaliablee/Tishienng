package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class MimeUtility {
    public static final int ALL = -1;
    static final int ALL_ASCII = 1;
    static final int MOSTLY_ASCII = 2;
    static final int MOSTLY_NONASCII = 3;
    private static boolean decodeStrict = true;
    private static java.lang.String defaultJavaCharset = null;
    private static java.lang.String defaultMIMECharset = null;
    private static boolean encodeEolStrict = false;
    private static boolean foldEncodedWords = false;
    private static boolean foldText = true;
    private static java.util.Hashtable java2mime;
    private static java.util.Hashtable mime2java;


    static {
            java.lang.String r0 = "mail.mime.decodetext.strict"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L50
            java.lang.String r1 = "false"
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L14
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.SecurityException -> L50
            if (r0 == 0) goto L14
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            javax.mail.internet.MimeUtility.decodeStrict = r0     // Catch: java.lang.SecurityException -> L50
            java.lang.String r0 = "mail.mime.encodeeol.strict"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L50
            java.lang.String r4 = "true"
            if (r0 == 0) goto L29
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch: java.lang.SecurityException -> L50
            if (r0 == 0) goto L29
            r0 = 1
            goto L2a
        L29:
            r0 = 0
        L2a:
            javax.mail.internet.MimeUtility.encodeEolStrict = r0     // Catch: java.lang.SecurityException -> L50
            java.lang.String r0 = "mail.mime.foldencodedwords"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L50
            if (r0 == 0) goto L3c
            boolean r0 = r0.equalsIgnoreCase(r4)     // Catch: java.lang.SecurityException -> L50
            if (r0 == 0) goto L3c
            r0 = 1
            goto L3d
        L3c:
            r0 = 0
        L3d:
            javax.mail.internet.MimeUtility.foldEncodedWords = r0     // Catch: java.lang.SecurityException -> L50
            java.lang.String r0 = "mail.mime.foldtext"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> L50
            if (r0 == 0) goto L4e
            boolean r0 = r0.equalsIgnoreCase(r1)     // Catch: java.lang.SecurityException -> L50
            if (r0 == 0) goto L4e
            r2 = 0
        L4e:
            javax.mail.internet.MimeUtility.foldText = r2     // Catch: java.lang.SecurityException -> L50
        L50:
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = 40
            r0.<init>(r1)
            javax.mail.internet.MimeUtility.java2mime = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r1 = 10
            r0.<init>(r1)
            javax.mail.internet.MimeUtility.mime2java = r0
            java.lang.Class<javax.mail.internet.MimeUtility> r0 = javax.mail.internet.MimeUtility.class
            java.lang.String r1 = "/META-INF/javamail.charset.map"
            java.io.InputStream r0 = r0.getResourceAsStream(r1)     // Catch: java.lang.Exception -> L7f
            if (r0 == 0) goto L8b
            com.sun.mail.util.LineInputStream r1 = new com.sun.mail.util.LineInputStream     // Catch: java.lang.Throwable -> L83
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L83
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime     // Catch: java.lang.Throwable -> L81
            loadMappings(r1, r0)     // Catch: java.lang.Throwable -> L81
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.mime2java     // Catch: java.lang.Throwable -> L81
            loadMappings(r1, r0)     // Catch: java.lang.Throwable -> L81
            r1.close()     // Catch: java.lang.Exception -> L7f
            goto L8b
        L7f:
            goto L8b
        L81:
            r0 = move-exception
            goto L87
        L83:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L87:
            r1.close()     // Catch: java.lang.Exception -> L8a
        L8a:
            throw r0     // Catch: java.lang.Exception -> L7f
        L8b:
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            boolean r0 = r0.isEmpty()
            java.lang.String r1 = "euc-kr"
            java.lang.String r2 = "ISO-8859-1"
            if (r0 == 0) goto L1a8
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "8859_1"
            r0.put(r3, r2)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859_1"
            r0.put(r3, r2)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859-1"
            r0.put(r3, r2)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "8859_2"
            java.lang.String r4 = "ISO-8859-2"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859_2"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859-2"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "8859_3"
            java.lang.String r4 = "ISO-8859-3"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859_3"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859-3"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "8859_4"
            java.lang.String r4 = "ISO-8859-4"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859_4"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859-4"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "8859_5"
            java.lang.String r4 = "ISO-8859-5"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859_5"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859-5"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "8859_6"
            java.lang.String r4 = "ISO-8859-6"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859_6"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859-6"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "8859_7"
            java.lang.String r4 = "ISO-8859-7"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859_7"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859-7"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "8859_8"
            java.lang.String r4 = "ISO-8859-8"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859_8"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859-8"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "8859_9"
            java.lang.String r4 = "ISO-8859-9"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859_9"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso8859-9"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "sjis"
            java.lang.String r4 = "Shift_JIS"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "jis"
            java.lang.String r4 = "ISO-2022-JP"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "iso2022jp"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "euc_jp"
            java.lang.String r4 = "euc-jp"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "koi8_r"
            java.lang.String r4 = "koi8-r"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "euc_cn"
            java.lang.String r4 = "euc-cn"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "euc_tw"
            java.lang.String r4 = "euc-tw"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            java.lang.String r3 = "euc_kr"
            r0.put(r3, r1)
        L1a8:
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.mime2java
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L200
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.mime2java
            java.lang.String r3 = "iso-2022-cn"
            java.lang.String r4 = "ISO2022CN"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.mime2java
            java.lang.String r3 = "iso-2022-kr"
            java.lang.String r4 = "ISO2022KR"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.mime2java
            java.lang.String r3 = "utf-8"
            java.lang.String r4 = "UTF8"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.mime2java
            java.lang.String r3 = "utf8"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.mime2java
            java.lang.String r3 = "ja_jp.iso2022-7"
            java.lang.String r4 = "ISO2022JP"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.mime2java
            java.lang.String r3 = "ja_jp.eucjp"
            java.lang.String r4 = "EUCJIS"
            r0.put(r3, r4)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.mime2java
            java.lang.String r3 = "KSC5601"
            r0.put(r1, r3)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.mime2java
            java.lang.String r1 = "euckr"
            r0.put(r1, r3)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.mime2java
            java.lang.String r1 = "us-ascii"
            r0.put(r1, r2)
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.mime2java
            java.lang.String r1 = "x-us-ascii"
            r0.put(r1, r2)
        L200:
            return
    }

    private MimeUtility() {
            r0 = this;
            r0.<init>()
            return
    }

    static int checkAscii(java.io.InputStream r17, int r18, boolean r19) {
            r0 = r18
            boolean r1 = javax.mail.internet.MimeUtility.encodeEolStrict
            r3 = 0
            if (r1 == 0) goto Lb
            if (r19 == 0) goto Lb
            r1 = 1
            goto Lc
        Lb:
            r1 = 0
        Lc:
            r4 = -1
            r5 = 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L20
            if (r0 != r4) goto L14
            goto L18
        L14:
            int r5 = java.lang.Math.min(r0, r5)
        L18:
            byte[] r6 = new byte[r5]
        L1a:
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            goto L22
        L20:
            r6 = 0
            goto L1a
        L22:
            if (r0 != 0) goto L25
            goto L2d
        L25:
            r13 = r17
            int r14 = r13.read(r6, r3, r5)     // Catch: java.io.IOException -> L78
            if (r14 != r4) goto L32
        L2d:
            r18 = 3
            r16 = 1
            goto L7d
        L32:
            r2 = 0
            r15 = 0
            r16 = 1
        L36:
            if (r15 < r14) goto L3c
            if (r0 == r4) goto L22
            int r0 = r0 - r14
            goto L22
        L3c:
            r3 = r6[r15]     // Catch: java.io.IOException -> L75
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 10
            r18 = 3
            r12 = 13
            if (r1 == 0) goto L51
            if (r2 != r12) goto L4c
            if (r3 != r4) goto L50
        L4c:
            if (r2 == r12) goto L51
            if (r3 != r4) goto L51
        L50:
            r9 = 1
        L51:
            if (r3 == r12) goto L5e
            if (r3 != r4) goto L56
            goto L5e
        L56:
            int r11 = r11 + 1
            r2 = 998(0x3e6, float:1.398E-42)
            if (r11 <= r2) goto L5f
            r10 = 1
            goto L5f
        L5e:
            r11 = 0
        L5f:
            boolean r2 = nonascii(r3)     // Catch: java.io.IOException -> L73
            if (r2 == 0) goto L6b
            if (r19 == 0) goto L68
            return r18
        L68:
            int r8 = r8 + 1
            goto L6d
        L6b:
            int r7 = r7 + 1
        L6d:
            int r15 = r15 + 1
            r2 = r3
            r3 = 0
            r4 = -1
            goto L36
        L73:
            goto L7d
        L75:
            r18 = 3
            goto L73
        L78:
            r18 = 3
            r16 = 1
            goto L73
        L7d:
            if (r0 != 0) goto L82
            if (r19 == 0) goto L82
            return r18
        L82:
            r0 = 2
            if (r8 != 0) goto L8c
            if (r9 == 0) goto L88
            return r18
        L88:
            if (r10 == 0) goto L8b
            return r0
        L8b:
            return r16
        L8c:
            if (r7 <= r8) goto L8f
            return r0
        L8f:
            return r18
    }

    static int checkAscii(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            if (r1 < r0) goto L13
            if (r2 != 0) goto Ld
            r5 = 1
            return r5
        Ld:
            if (r3 <= r2) goto L11
            r5 = 2
            return r5
        L11:
            r5 = 3
            return r5
        L13:
            char r4 = r5.charAt(r1)
            boolean r4 = nonascii(r4)
            if (r4 == 0) goto L20
            int r2 = r2 + 1
            goto L22
        L20:
            int r3 = r3 + 1
        L22:
            int r1 = r1 + 1
            goto L7
    }

    static int checkAscii(byte[] r4) {
            r0 = 0
            r1 = 0
            r2 = 0
        L3:
            int r3 = r4.length
            if (r0 < r3) goto L10
            if (r1 != 0) goto La
            r4 = 1
            return r4
        La:
            if (r2 <= r1) goto Le
            r4 = 2
            return r4
        Le:
            r4 = 3
            return r4
        L10:
            r3 = r4[r0]
            r3 = r3 & 255(0xff, float:3.57E-43)
            boolean r3 = nonascii(r3)
            if (r3 == 0) goto L1d
            int r1 = r1 + 1
            goto L1f
        L1d:
            int r2 = r2 + 1
        L1f:
            int r0 = r0 + 1
            goto L3
    }

    public static java.io.InputStream decode(java.io.InputStream r2, java.lang.String r3) throws javax.mail.MessagingException {
            java.lang.String r0 = "base64"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto Le
            com.sun.mail.util.BASE64DecoderStream r3 = new com.sun.mail.util.BASE64DecoderStream
            r3.<init>(r2)
            return r3
        Le:
            java.lang.String r0 = "quoted-printable"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L1c
            com.sun.mail.util.QPDecoderStream r3 = new com.sun.mail.util.QPDecoderStream
            r3.<init>(r2)
            return r3
        L1c:
            java.lang.String r0 = "uuencode"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "x-uuencode"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L63
            java.lang.String r0 = "x-uue"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L35
            goto L63
        L35:
            java.lang.String r0 = "binary"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L62
            java.lang.String r0 = "7bit"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L62
            java.lang.String r0 = "8bit"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L4e
            goto L62
        L4e:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown encoding: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L62:
            return r2
        L63:
            com.sun.mail.util.UUDecoderStream r3 = new com.sun.mail.util.UUDecoderStream
            r3.<init>(r2)
            return r3
    }

    private static java.lang.String decodeInnerWords(java.lang.String r5) throws java.io.UnsupportedEncodingException {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        L6:
            java.lang.String r2 = "=?"
            int r2 = r5.indexOf(r2, r1)
            if (r2 >= 0) goto Lf
            goto L34
        Lf:
            java.lang.String r3 = r5.substring(r1, r2)
            r0.append(r3)
            int r3 = r2 + 2
            r4 = 63
            int r3 = r5.indexOf(r4, r3)
            if (r3 >= 0) goto L21
            goto L34
        L21:
            int r3 = r3 + 1
            int r3 = r5.indexOf(r4, r3)
            if (r3 >= 0) goto L2a
            goto L34
        L2a:
            java.lang.String r4 = "?="
            int r3 = r3 + 1
            int r3 = r5.indexOf(r4, r3)
            if (r3 >= 0) goto L49
        L34:
            if (r1 != 0) goto L37
            return r5
        L37:
            int r2 = r5.length()
            if (r1 >= r2) goto L44
            java.lang.String r5 = r5.substring(r1)
            r0.append(r5)
        L44:
            java.lang.String r5 = r0.toString()
            return r5
        L49:
            int r1 = r3 + 2
            java.lang.String r2 = r5.substring(r2, r1)
            java.lang.String r2 = decodeWord(r2)     // Catch: javax.mail.internet.ParseException -> L53
        L53:
            r0.append(r2)
            goto L6
    }

    public static java.lang.String decodeText(java.lang.String r9) throws java.io.UnsupportedEncodingException {
            java.lang.String r0 = "=?"
            int r1 = r9.indexOf(r0)
            r2 = -1
            if (r1 != r2) goto La
            return r9
        La:
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            java.lang.String r2 = " \t\n\r"
            r3 = 1
            r1.<init>(r9, r2, r3)
            java.lang.StringBuffer r9 = new java.lang.StringBuffer
            r9.<init>()
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            r2.<init>()
            r4 = 0
            r5 = 0
        L1e:
            boolean r6 = r1.hasMoreTokens()
            if (r6 != 0) goto L2c
            r9.append(r2)
            java.lang.String r9 = r9.toString()
            return r9
        L2c:
            java.lang.String r6 = r1.nextToken()
            char r7 = r6.charAt(r4)
            r8 = 32
            if (r7 == r8) goto L99
            r8 = 9
            if (r7 == r8) goto L99
            r8 = 13
            if (r7 == r8) goto L99
            r8 = 10
            if (r7 != r8) goto L45
            goto L99
        L45:
            java.lang.String r7 = decodeWord(r6)     // Catch: javax.mail.internet.ParseException -> L55
            if (r5 != 0) goto L57
            int r8 = r2.length()     // Catch: javax.mail.internet.ParseException -> L55
            if (r8 <= 0) goto L57
            r9.append(r2)     // Catch: javax.mail.internet.ParseException -> L55
            goto L57
        L55:
            goto L5a
        L57:
            r6 = r7
            r5 = 1
            goto L92
        L5a:
            boolean r7 = javax.mail.internet.MimeUtility.decodeStrict
            if (r7 != 0) goto L88
            java.lang.String r7 = decodeInnerWords(r6)
            if (r7 == r6) goto L7d
            if (r5 == 0) goto L6c
            boolean r5 = r6.startsWith(r0)
            if (r5 != 0) goto L75
        L6c:
            int r5 = r2.length()
            if (r5 <= 0) goto L75
            r9.append(r2)
        L75:
            java.lang.String r5 = "?="
            boolean r5 = r6.endsWith(r5)
            r6 = r7
            goto L92
        L7d:
            int r5 = r2.length()
            if (r5 <= 0) goto L86
            r9.append(r2)
        L86:
            r5 = 0
            goto L92
        L88:
            int r5 = r2.length()
            if (r5 <= 0) goto L86
            r9.append(r2)
            goto L86
        L92:
            r9.append(r6)
            r2.setLength(r4)
            goto L1e
        L99:
            r2.append(r7)
            goto L1e
    }

    public static java.lang.String decodeWord(java.lang.String r8) throws javax.mail.internet.ParseException, java.io.UnsupportedEncodingException {
            java.lang.String r0 = "=?"
            boolean r0 = r8.startsWith(r0)
            if (r0 == 0) goto Lf8
            r0 = 63
            r1 = 2
            int r2 = r8.indexOf(r0, r1)
            r3 = -1
            if (r2 == r3) goto Le4
            java.lang.String r4 = r8.substring(r1, r2)
            java.lang.String r4 = javaCharset(r4)
            int r2 = r2 + 1
            int r0 = r8.indexOf(r0, r2)
            if (r0 == r3) goto Ld0
            java.lang.String r2 = r8.substring(r2, r0)
            int r0 = r0 + 1
            java.lang.String r5 = "?="
            int r5 = r8.indexOf(r5, r0)
            if (r5 == r3) goto Lbc
            java.lang.String r0 = r8.substring(r0, r5)
            int r3 = r0.length()     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            java.lang.String r6 = ""
            if (r3 <= 0) goto L88
            java.io.ByteArrayInputStream r3 = new java.io.ByteArrayInputStream     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            byte[] r0 = com.sun.mail.util.ASCIIUtility.getBytes(r0)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            r3.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            java.lang.String r0 = "B"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            if (r0 == 0) goto L53
            com.sun.mail.util.BASE64DecoderStream r0 = new com.sun.mail.util.BASE64DecoderStream     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            goto L60
        L53:
            java.lang.String r0 = "Q"
            boolean r0 = r2.equalsIgnoreCase(r0)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            if (r0 == 0) goto L74
            com.sun.mail.util.QDecoderStream r0 = new com.sun.mail.util.QDecoderStream     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
        L60:
            int r2 = r3.available()     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            byte[] r3 = new byte[r2]     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            r7 = 0
            int r0 = r0.read(r3, r7, r2)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            if (r0 > 0) goto L6e
            goto L88
        L6e:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            r6.<init>(r3, r7, r0, r4)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            goto L88
        L74:
            java.io.UnsupportedEncodingException r8 = new java.io.UnsupportedEncodingException     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            java.lang.String r1 = "unknown encoding: "
            r0.<init>(r1)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            r0.append(r2)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            java.lang.String r0 = r0.toString()     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            r8.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            throw r8     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
        L88:
            int r5 = r5 + r1
            int r0 = r8.length()     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            if (r5 >= r0) goto La8
            java.lang.String r8 = r8.substring(r5)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            boolean r0 = javax.mail.internet.MimeUtility.decodeStrict     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            if (r0 != 0) goto L9b
            java.lang.String r8 = decodeInnerWords(r8)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
        L9b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            r0.<init>(r6)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            r0.append(r8)     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            java.lang.String r8 = r0.toString()     // Catch: java.lang.IllegalArgumentException -> La9 java.io.IOException -> Laf java.io.UnsupportedEncodingException -> Lba
            return r8
        La8:
            return r6
        La9:
            java.io.UnsupportedEncodingException r8 = new java.io.UnsupportedEncodingException
            r8.<init>(r4)
            throw r8
        Laf:
            r8 = move-exception
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.String r8 = r8.toString()
            r0.<init>(r8)
            throw r0
        Lba:
            r8 = move-exception
            throw r8
        Lbc:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "encoded word does not end with \"?=\": "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Ld0:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "encoded word does not include encoding: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Le4:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "encoded word does not include charset: "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
        Lf8:
            javax.mail.internet.ParseException r0 = new javax.mail.internet.ParseException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "encoded word does not start with \"=?\": "
            r1.<init>(r2)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r0.<init>(r8)
            throw r0
    }

    private static void doEncode(java.lang.String r10, boolean r11, java.lang.String r12, int r13, java.lang.String r14, boolean r15, boolean r16, java.lang.StringBuffer r17) throws java.io.UnsupportedEncodingException {
            r6 = r16
            byte[] r0 = r10.getBytes(r12)
            if (r11 == 0) goto Ld
            int r1 = com.sun.mail.util.BEncoderStream.encodedLength(r0)
            goto L11
        Ld:
            int r1 = com.sun.mail.util.QEncoderStream.encodedLength(r0, r6)
        L11:
            r2 = 0
            if (r1 <= r13) goto L36
            int r8 = r10.length()
            r1 = 1
            if (r8 <= r1) goto L36
            int r9 = r8 / 2
            java.lang.String r0 = r10.substring(r2, r9)
            r1 = r11
            r2 = r12
            r3 = r13
            r4 = r14
            r5 = r15
            r7 = r17
            doEncode(r0, r1, r2, r3, r4, r5, r6, r7)
            java.lang.String r0 = r10.substring(r9, r8)
            r5 = 0
            r6 = r16
            doEncode(r0, r1, r2, r3, r4, r5, r6, r7)
            return
        L36:
            r7 = r17
            java.io.ByteArrayOutputStream r10 = new java.io.ByteArrayOutputStream
            r10.<init>()
            if (r11 == 0) goto L45
            com.sun.mail.util.BEncoderStream r11 = new com.sun.mail.util.BEncoderStream
            r11.<init>(r10)
            goto L4a
        L45:
            com.sun.mail.util.QEncoderStream r11 = new com.sun.mail.util.QEncoderStream
            r11.<init>(r10, r6)
        L4a:
            r11.write(r0)     // Catch: java.io.IOException -> L51
            r11.close()     // Catch: java.io.IOException -> L51
            goto L52
        L51:
        L52:
            byte[] r10 = r10.toByteArray()
            if (r15 != 0) goto L67
            boolean r11 = javax.mail.internet.MimeUtility.foldEncodedWords
            if (r11 == 0) goto L62
            java.lang.String r11 = "\r\n "
            r7.append(r11)
            goto L67
        L62:
            java.lang.String r11 = " "
            r7.append(r11)
        L67:
            r7.append(r14)
        L6a:
            int r11 = r10.length
            if (r2 < r11) goto L73
            java.lang.String r10 = "?="
            r7.append(r10)
            return
        L73:
            r11 = r10[r2]
            char r11 = (char) r11
            r7.append(r11)
            int r2 = r2 + 1
            goto L6a
    }

    public static java.io.OutputStream encode(java.io.OutputStream r2, java.lang.String r3) throws javax.mail.MessagingException {
            if (r3 != 0) goto L3
            goto L65
        L3:
            java.lang.String r0 = "base64"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L11
            com.sun.mail.util.BASE64EncoderStream r3 = new com.sun.mail.util.BASE64EncoderStream
            r3.<init>(r2)
            return r3
        L11:
            java.lang.String r0 = "quoted-printable"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L1f
            com.sun.mail.util.QPEncoderStream r3 = new com.sun.mail.util.QPEncoderStream
            r3.<init>(r2)
            return r3
        L1f:
            java.lang.String r0 = "uuencode"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L66
            java.lang.String r0 = "x-uuencode"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L66
            java.lang.String r0 = "x-uue"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L38
            goto L66
        L38:
            java.lang.String r0 = "binary"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L65
            java.lang.String r0 = "7bit"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 != 0) goto L65
            java.lang.String r0 = "8bit"
            boolean r0 = r3.equalsIgnoreCase(r0)
            if (r0 == 0) goto L51
            goto L65
        L51:
            javax.mail.MessagingException r2 = new javax.mail.MessagingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown encoding: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
        L65:
            return r2
        L66:
            com.sun.mail.util.UUEncoderStream r3 = new com.sun.mail.util.UUEncoderStream
            r3.<init>(r2)
            return r3
    }

    public static java.io.OutputStream encode(java.io.OutputStream r1, java.lang.String r2, java.lang.String r3) throws javax.mail.MessagingException {
            if (r2 != 0) goto L3
            goto L65
        L3:
            java.lang.String r0 = "base64"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L11
            com.sun.mail.util.BASE64EncoderStream r2 = new com.sun.mail.util.BASE64EncoderStream
            r2.<init>(r1)
            return r2
        L11:
            java.lang.String r0 = "quoted-printable"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L1f
            com.sun.mail.util.QPEncoderStream r2 = new com.sun.mail.util.QPEncoderStream
            r2.<init>(r1)
            return r2
        L1f:
            java.lang.String r0 = "uuencode"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L66
            java.lang.String r0 = "x-uuencode"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 != 0) goto L66
            java.lang.String r0 = "x-uue"
            boolean r0 = r2.equalsIgnoreCase(r0)
            if (r0 == 0) goto L38
            goto L66
        L38:
            java.lang.String r3 = "binary"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 != 0) goto L65
            java.lang.String r3 = "7bit"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 != 0) goto L65
            java.lang.String r3 = "8bit"
            boolean r3 = r2.equalsIgnoreCase(r3)
            if (r3 == 0) goto L51
            goto L65
        L51:
            javax.mail.MessagingException r1 = new javax.mail.MessagingException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Unknown encoding: "
            r3.<init>(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
        L65:
            return r1
        L66:
            com.sun.mail.util.UUEncoderStream r2 = new com.sun.mail.util.UUEncoderStream
            r2.<init>(r1, r3)
            return r2
    }

    public static java.lang.String encodeText(java.lang.String r1) throws java.io.UnsupportedEncodingException {
            r0 = 0
            java.lang.String r1 = encodeText(r1, r0, r0)
            return r1
    }

    public static java.lang.String encodeText(java.lang.String r1, java.lang.String r2, java.lang.String r3) throws java.io.UnsupportedEncodingException {
            r0 = 0
            java.lang.String r1 = encodeWord(r1, r2, r3, r0)
            return r1
    }

    public static java.lang.String encodeWord(java.lang.String r1) throws java.io.UnsupportedEncodingException {
            r0 = 0
            java.lang.String r1 = encodeWord(r1, r0, r0)
            return r1
    }

    public static java.lang.String encodeWord(java.lang.String r1, java.lang.String r2, java.lang.String r3) throws java.io.UnsupportedEncodingException {
            r0 = 1
            java.lang.String r1 = encodeWord(r1, r2, r3, r0)
            return r1
    }

    private static java.lang.String encodeWord(java.lang.String r11, java.lang.String r12, java.lang.String r13, boolean r14) throws java.io.UnsupportedEncodingException {
            int r0 = checkAscii(r11)
            r1 = 1
            if (r0 != r1) goto L8
            return r11
        L8:
            if (r12 != 0) goto L15
            java.lang.String r12 = getDefaultJavaCharset()
            java.lang.String r2 = getDefaultMIMECharset()
            r5 = r12
            r12 = r2
            goto L1a
        L15:
            java.lang.String r2 = javaCharset(r12)
            r5 = r2
        L1a:
            java.lang.String r2 = "B"
            java.lang.String r3 = "Q"
            if (r13 != 0) goto L26
            r13 = 3
            if (r0 == r13) goto L25
            r13 = r3
            goto L26
        L25:
            r13 = r2
        L26:
            boolean r0 = r13.equalsIgnoreCase(r2)
            if (r0 == 0) goto L2e
            r4 = 1
            goto L36
        L2e:
            boolean r0 = r13.equalsIgnoreCase(r3)
            if (r0 == 0) goto L65
            r1 = 0
            r4 = 0
        L36:
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            r10.<init>()
            int r0 = r12.length()
            int r6 = 68 - r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "=?"
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = "?"
            r0.append(r12)
            r0.append(r13)
            r0.append(r12)
            java.lang.String r7 = r0.toString()
            r8 = 1
            r3 = r11
            r9 = r14
            doEncode(r3, r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r11 = r10.toString()
            return r11
        L65:
            java.io.UnsupportedEncodingException r11 = new java.io.UnsupportedEncodingException
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r14 = "Unknown transfer encoding: "
            r12.<init>(r14)
            r12.append(r13)
            java.lang.String r12 = r12.toString()
            r11.<init>(r12)
            throw r11
    }

    public static java.lang.String fold(int r11, java.lang.String r12) {
            boolean r0 = javax.mail.internet.MimeUtility.foldText
            if (r0 != 0) goto L5
            return r12
        L5:
            int r0 = r12.length()
            r1 = 1
            int r0 = r0 - r1
        Lb:
            r2 = 9
            r3 = 32
            if (r0 >= 0) goto L12
            goto L22
        L12:
            char r4 = r12.charAt(r0)
            if (r4 == r3) goto L9a
            if (r4 == r2) goto L9a
            r5 = 13
            if (r4 == r5) goto L9a
            r5 = 10
            if (r4 == r5) goto L9a
        L22:
            int r4 = r12.length()
            int r4 = r4 - r1
            r5 = 0
            if (r0 == r4) goto L2f
            int r0 = r0 + r1
            java.lang.String r12 = r12.substring(r5, r0)
        L2f:
            int r0 = r12.length()
            int r0 = r0 + r11
            r4 = 76
            if (r0 > r4) goto L39
            return r12
        L39:
            java.lang.StringBuffer r6 = new java.lang.StringBuffer
            int r0 = r12.length()
            int r0 = r0 + 4
            r6.<init>(r0)
            r8 = r11
            r7 = r12
            r11 = 0
        L47:
            int r12 = r7.length()
            int r12 = r12 + r8
            if (r12 > r4) goto L4f
            goto L66
        L4f:
            r9 = -1
            r12 = 0
            r0 = -1
        L52:
            int r10 = r7.length()
            if (r12 < r10) goto L59
            goto L5f
        L59:
            if (r0 == r9) goto L89
            int r10 = r8 + r12
            if (r10 <= r4) goto L89
        L5f:
            if (r0 != r9) goto L6e
            r6.append(r7)
            java.lang.String r7 = ""
        L66:
            r6.append(r7)
            java.lang.String r11 = r6.toString()
            return r11
        L6e:
            java.lang.String r11 = r7.substring(r5, r0)
            r6.append(r11)
            java.lang.String r11 = "\r\n"
            r6.append(r11)
            char r11 = r7.charAt(r0)
            r6.append(r11)
            int r0 = r0 + 1
            java.lang.String r7 = r7.substring(r0)
            r8 = 1
            goto L47
        L89:
            char r10 = r7.charAt(r12)
            if (r10 == r3) goto L91
            if (r10 != r2) goto L96
        L91:
            if (r11 == r3) goto L96
            if (r11 == r2) goto L96
            r0 = r12
        L96:
            int r12 = r12 + 1
            r11 = r10
            goto L52
        L9a:
            int r0 = r0 + (-1)
            goto Lb
    }

    public static java.lang.String getDefaultJavaCharset() {
            java.lang.String r0 = "8859_1"
            java.lang.String r1 = javax.mail.internet.MimeUtility.defaultJavaCharset
            if (r1 != 0) goto L3b
            java.lang.String r1 = "mail.mime.charset"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.SecurityException -> Ld
            goto Le
        Ld:
            r1 = 0
        Le:
            if (r1 == 0) goto L1d
            int r2 = r1.length()
            if (r2 <= 0) goto L1d
            java.lang.String r0 = javaCharset(r1)
            javax.mail.internet.MimeUtility.defaultJavaCharset = r0
            return r0
        L1d:
            java.lang.String r1 = "file.encoding"
            java.lang.String r1 = java.lang.System.getProperty(r1, r0)     // Catch: java.lang.SecurityException -> L26
            javax.mail.internet.MimeUtility.defaultJavaCharset = r1     // Catch: java.lang.SecurityException -> L26
            goto L3b
        L26:
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            javax.mail.internet.MimeUtility$1NullInputStream r2 = new javax.mail.internet.MimeUtility$1NullInputStream
            r2.<init>()
            r1.<init>(r2)
            java.lang.String r1 = r1.getEncoding()
            javax.mail.internet.MimeUtility.defaultJavaCharset = r1
            if (r1 != 0) goto L3b
            javax.mail.internet.MimeUtility.defaultJavaCharset = r0
        L3b:
            java.lang.String r0 = javax.mail.internet.MimeUtility.defaultJavaCharset
            return r0
    }

    static java.lang.String getDefaultMIMECharset() {
            java.lang.String r0 = javax.mail.internet.MimeUtility.defaultMIMECharset
            if (r0 != 0) goto Le
            java.lang.String r0 = "mail.mime.charset"
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.SecurityException -> Ld
            javax.mail.internet.MimeUtility.defaultMIMECharset = r0     // Catch: java.lang.SecurityException -> Ld
            goto Le
        Ld:
        Le:
            java.lang.String r0 = javax.mail.internet.MimeUtility.defaultMIMECharset
            if (r0 != 0) goto L1c
            java.lang.String r0 = getDefaultJavaCharset()
            java.lang.String r0 = mimeCharset(r0)
            javax.mail.internet.MimeUtility.defaultMIMECharset = r0
        L1c:
            java.lang.String r0 = javax.mail.internet.MimeUtility.defaultMIMECharset
            return r0
    }

    public static java.lang.String getEncoding(javax.activation.DataHandler r5) {
            java.lang.String r0 = "base64"
            java.lang.String r1 = r5.getName()
            if (r1 == 0) goto L11
            javax.activation.DataSource r5 = r5.getDataSource()
            java.lang.String r5 = getEncoding(r5)
            return r5
        L11:
            javax.mail.internet.ContentType r1 = new javax.mail.internet.ContentType     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = r5.getContentType()     // Catch: java.lang.Exception -> L52
            r1.<init>(r2)     // Catch: java.lang.Exception -> L52
            java.lang.String r2 = "text/*"
            boolean r1 = r1.match(r2)
            java.lang.String r2 = "7bit"
            r3 = 1
            if (r1 == 0) goto L3f
            javax.mail.internet.AsciiOutputStream r1 = new javax.mail.internet.AsciiOutputStream
            r4 = 0
            r1.<init>(r4, r4)
            r5.writeTo(r1)     // Catch: java.io.IOException -> L2f
            goto L30
        L2f:
        L30:
            int r5 = r1.getAscii()
            if (r5 == r3) goto L3d
            r1 = 2
            if (r5 == r1) goto L3a
            goto L52
        L3a:
            java.lang.String r0 = "quoted-printable"
            goto L52
        L3d:
            r0 = r2
            goto L52
        L3f:
            javax.mail.internet.AsciiOutputStream r1 = new javax.mail.internet.AsciiOutputStream
            boolean r4 = javax.mail.internet.MimeUtility.encodeEolStrict
            r1.<init>(r3, r4)
            r5.writeTo(r1)     // Catch: java.io.IOException -> L4a
            goto L4b
        L4a:
        L4b:
            int r5 = r1.getAscii()
            if (r5 != r3) goto L52
            goto L3d
        L52:
            return r0
    }

    public static java.lang.String getEncoding(javax.activation.DataSource r4) {
            java.lang.String r0 = "base64"
            javax.mail.internet.ContentType r1 = new javax.mail.internet.ContentType     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = r4.getContentType()     // Catch: java.lang.Throwable -> L2a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2a
            java.io.InputStream r4 = r4.getInputStream()     // Catch: java.lang.Throwable -> L2a
            java.lang.String r2 = "text/*"
            boolean r1 = r1.match(r2)
            r2 = -1
            r3 = 1
            r1 = r1 ^ r3
            int r1 = checkAscii(r4, r2, r1)
            if (r1 == r3) goto L25
            r2 = 2
            if (r1 == r2) goto L22
            goto L27
        L22:
            java.lang.String r0 = "quoted-printable"
            goto L27
        L25:
            java.lang.String r0 = "7bit"
        L27:
            r4.close()
        L2a:
            return r0
    }

    private static int indexOfAny(java.lang.String r1, java.lang.String r2) {
            r0 = 0
            int r1 = indexOfAny(r1, r2, r0)
            return r1
    }

    private static int indexOfAny(java.lang.String r3, java.lang.String r4, int r5) {
            r0 = -1
            int r1 = r3.length()     // Catch: java.lang.StringIndexOutOfBoundsException -> L16
        L5:
            if (r5 < r1) goto L8
            return r0
        L8:
            char r2 = r3.charAt(r5)     // Catch: java.lang.StringIndexOutOfBoundsException -> L16
            int r2 = r4.indexOf(r2)     // Catch: java.lang.StringIndexOutOfBoundsException -> L16
            if (r2 < 0) goto L13
            return r5
        L13:
            int r5 = r5 + 1
            goto L5
        L16:
            return r0
    }

    public static java.lang.String javaCharset(java.lang.String r2) {
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.mime2java
            if (r0 == 0) goto L17
            if (r2 != 0) goto L7
            goto L17
        L7:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r2.toLowerCase(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L16
            return r2
        L16:
            return r0
        L17:
            return r2
    }

    private static void loadMappings(com.sun.mail.util.LineInputStream r3, java.util.Hashtable r4) {
        L0:
            java.lang.String r0 = r3.readLine()     // Catch: java.io.IOException -> L42
            if (r0 != 0) goto L7
            goto L42
        L7:
            java.lang.String r1 = "--"
            boolean r2 = r0.startsWith(r1)
            if (r2 == 0) goto L16
            boolean r1 = r0.endsWith(r1)
            if (r1 == 0) goto L16
            goto L42
        L16:
            java.lang.String r1 = r0.trim()
            int r1 = r1.length()
            if (r1 == 0) goto L0
            java.lang.String r1 = "#"
            boolean r1 = r0.startsWith(r1)
            if (r1 == 0) goto L29
            goto L0
        L29:
            java.util.StringTokenizer r1 = new java.util.StringTokenizer
            java.lang.String r2 = " \t"
            r1.<init>(r0, r2)
            java.lang.String r0 = r1.nextToken()     // Catch: java.util.NoSuchElementException -> L0
            java.lang.String r1 = r1.nextToken()     // Catch: java.util.NoSuchElementException -> L0
            java.util.Locale r2 = java.util.Locale.ENGLISH     // Catch: java.util.NoSuchElementException -> L0
            java.lang.String r0 = r0.toLowerCase(r2)     // Catch: java.util.NoSuchElementException -> L0
            r4.put(r0, r1)     // Catch: java.util.NoSuchElementException -> L0
            goto L0
        L42:
            return
    }

    public static java.lang.String mimeCharset(java.lang.String r2) {
            java.util.Hashtable r0 = javax.mail.internet.MimeUtility.java2mime
            if (r0 == 0) goto L17
            if (r2 != 0) goto L7
            goto L17
        L7:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r1 = r2.toLowerCase(r1)
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            if (r0 != 0) goto L16
            return r2
        L16:
            return r0
        L17:
            return r2
    }

    static final boolean nonascii(int r1) {
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 >= r0) goto L16
            r0 = 32
            if (r1 >= r0) goto L14
            r0 = 13
            if (r1 == r0) goto L14
            r0 = 10
            if (r1 == r0) goto L14
            r0 = 9
            if (r1 != r0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public static java.lang.String quote(java.lang.String r9, java.lang.String r10) {
            int r0 = r9.length()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            r4 = 34
            if (r2 < r0) goto L22
            if (r3 == 0) goto L21
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            int r0 = r0 + 2
            r10.<init>(r0)
            r10.append(r4)
            r10.append(r9)
            r10.append(r4)
            java.lang.String r9 = r10.toString()
        L21:
            return r9
        L22:
            char r5 = r9.charAt(r2)
            r6 = 10
            r7 = 13
            r8 = 92
            if (r5 == r4) goto L47
            if (r5 == r8) goto L47
            if (r5 == r7) goto L47
            if (r5 != r6) goto L35
            goto L47
        L35:
            r4 = 32
            if (r5 < r4) goto L43
            r4 = 127(0x7f, float:1.78E-43)
            if (r5 >= r4) goto L43
            int r4 = r10.indexOf(r5)
            if (r4 < 0) goto L44
        L43:
            r3 = 1
        L44:
            int r2 = r2 + 1
            goto L7
        L47:
            java.lang.StringBuffer r10 = new java.lang.StringBuffer
            int r3 = r0 + 3
            r10.<init>(r3)
            r10.append(r4)
            java.lang.String r3 = r9.substring(r1, r2)
            r10.append(r3)
        L58:
            if (r2 < r0) goto L62
            r10.append(r4)
            java.lang.String r9 = r10.toString()
            return r9
        L62:
            char r3 = r9.charAt(r2)
            if (r3 == r4) goto L6e
            if (r3 == r8) goto L6e
            if (r3 == r7) goto L6e
            if (r3 != r6) goto L76
        L6e:
            if (r3 != r6) goto L73
            if (r1 != r7) goto L73
            goto L76
        L73:
            r10.append(r8)
        L76:
            r10.append(r3)
            int r2 = r2 + 1
            r1 = r3
            goto L58
    }

    public static java.lang.String unfold(java.lang.String r8) {
            boolean r0 = javax.mail.internet.MimeUtility.foldText
            if (r0 != 0) goto L5
            return r8
        L5:
            r0 = 0
        L6:
            java.lang.String r1 = "\r\n"
            int r1 = indexOfAny(r8, r1)
            if (r1 >= 0) goto L18
            if (r0 == 0) goto L17
            r0.append(r8)
            java.lang.String r8 = r0.toString()
        L17:
            return r8
        L18:
            int r2 = r8.length()
            int r3 = r1 + 1
            if (r3 >= r2) goto L32
            char r4 = r8.charAt(r1)
            r5 = 13
            if (r4 != r5) goto L32
            char r4 = r8.charAt(r3)
            r5 = 10
            if (r4 != r5) goto L32
            int r3 = r1 + 2
        L32:
            r4 = 0
            if (r1 == 0) goto L5e
            int r5 = r1 + (-1)
            char r6 = r8.charAt(r5)
            r7 = 92
            if (r6 == r7) goto L40
            goto L5e
        L40:
            if (r0 != 0) goto L4b
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            int r2 = r8.length()
            r0.<init>(r2)
        L4b:
            java.lang.String r2 = r8.substring(r4, r5)
            r0.append(r2)
            java.lang.String r1 = r8.substring(r1, r3)
            r0.append(r1)
            java.lang.String r8 = r8.substring(r3)
            goto L6
        L5e:
            if (r3 >= r2) goto L95
            char r5 = r8.charAt(r3)
            r6 = 9
            r7 = 32
            if (r5 == r7) goto L6c
            if (r5 != r6) goto L95
        L6c:
            int r3 = r3 + 1
            if (r3 >= r2) goto L78
            char r5 = r8.charAt(r3)
            if (r5 == r7) goto L6c
            if (r5 == r6) goto L6c
        L78:
            if (r0 != 0) goto L83
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            int r2 = r8.length()
            r0.<init>(r2)
        L83:
            if (r1 == 0) goto L8f
            java.lang.String r1 = r8.substring(r4, r1)
            r0.append(r1)
            r0.append(r7)
        L8f:
            java.lang.String r8 = r8.substring(r3)
            goto L6
        L95:
            if (r0 != 0) goto La0
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            int r1 = r8.length()
            r0.<init>(r1)
        La0:
            java.lang.String r1 = r8.substring(r4, r3)
            r0.append(r1)
            java.lang.String r8 = r8.substring(r3)
            goto L6
    }
}

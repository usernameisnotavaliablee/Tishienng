package javax.mail.internet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public class InternetAddress extends javax.mail.Address implements java.lang.Cloneable {
    private static final java.lang.String rfc822phrase = null;
    private static final long serialVersionUID = -7507595530758302903L;
    private static final java.lang.String specialsNoDot = "()<>,;:\\\"[]@";
    private static final java.lang.String specialsNoDotNoAt = "()<>,;:\\\"[]";
    protected java.lang.String address;
    protected java.lang.String encodedPersonal;
    protected java.lang.String personal;

    static {
            java.lang.String r0 = "()<>@,;:\\\"\t .[]"
            r1 = 32
            r2 = 0
            java.lang.String r0 = r0.replace(r1, r2)
            r1 = 9
            java.lang.String r0 = r0.replace(r1, r2)
            javax.mail.internet.InternetAddress.rfc822phrase = r0
            return
    }

    public InternetAddress() {
            r0 = this;
            r0.<init>()
            return
    }

    public InternetAddress(java.lang.String r4) throws javax.mail.internet.AddressException {
            r3 = this;
            r3.<init>()
            r0 = 1
            javax.mail.internet.InternetAddress[] r1 = parse(r4, r0)
            int r2 = r1.length
            if (r2 != r0) goto L1b
            r4 = 0
            r4 = r1[r4]
            java.lang.String r0 = r4.address
            r3.address = r0
            java.lang.String r0 = r4.personal
            r3.personal = r0
            java.lang.String r4 = r4.encodedPersonal
            r3.encodedPersonal = r4
            return
        L1b:
            javax.mail.internet.AddressException r0 = new javax.mail.internet.AddressException
            java.lang.String r1 = "Illegal address"
            r0.<init>(r1, r4)
            throw r0
    }

    public InternetAddress(java.lang.String r2, java.lang.String r3) throws java.io.UnsupportedEncodingException {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public InternetAddress(java.lang.String r1, java.lang.String r2, java.lang.String r3) throws java.io.UnsupportedEncodingException {
            r0 = this;
            r0.<init>()
            r0.address = r1
            r0.setPersonal(r2, r3)
            return
    }

    public InternetAddress(java.lang.String r1, boolean r2) throws javax.mail.internet.AddressException {
            r0 = this;
            r0.<init>(r1)
            if (r2 == 0) goto Lb
            java.lang.String r1 = r0.address
            r2 = 1
            checkAddress(r1, r2, r2)
        Lb:
            return
    }

    private static void checkAddress(java.lang.String r3, boolean r4, boolean r5) throws javax.mail.internet.AddressException {
            r0 = 34
            int r0 = r3.indexOf(r0)
            if (r0 < 0) goto La
            goto L8c
        La:
            r0 = 64
            r1 = 0
            if (r4 == 0) goto L34
        Lf:
            java.lang.String r4 = ",:"
            int r4 = indexOfAny(r3, r4, r1)
            if (r4 >= 0) goto L18
            goto L34
        L18:
            char r1 = r3.charAt(r1)
            if (r1 != r0) goto L2c
            char r1 = r3.charAt(r4)
            r2 = 58
            if (r1 != r2) goto L29
            int r1 = r4 + 1
            goto L34
        L29:
            int r1 = r4 + 1
            goto Lf
        L2c:
            javax.mail.internet.AddressException r4 = new javax.mail.internet.AddressException
            java.lang.String r5 = "Illegal route-addr"
            r4.<init>(r5, r3)
            throw r4
        L34:
            int r4 = r3.indexOf(r0, r1)
            if (r4 < 0) goto L5f
            if (r4 == r1) goto L57
            int r5 = r3.length()
            int r5 = r5 + (-1)
            if (r4 == r5) goto L4f
            java.lang.String r5 = r3.substring(r1, r4)
            int r4 = r4 + 1
            java.lang.String r4 = r3.substring(r4)
            goto L63
        L4f:
            javax.mail.internet.AddressException r4 = new javax.mail.internet.AddressException
            java.lang.String r5 = "Missing domain"
            r4.<init>(r5, r3)
            throw r4
        L57:
            javax.mail.internet.AddressException r4 = new javax.mail.internet.AddressException
            java.lang.String r5 = "Missing local name"
            r4.<init>(r5, r3)
            throw r4
        L5f:
            if (r5 != 0) goto L9d
            r4 = 0
            r5 = r3
        L63:
            java.lang.String r0 = " \t\n\r"
            int r0 = indexOfAny(r3, r0)
            if (r0 >= 0) goto L95
            java.lang.String r0 = "()<>,;:\\\"[]@"
            int r5 = indexOfAny(r5, r0)
            if (r5 >= 0) goto L8d
            if (r4 == 0) goto L8c
            r5 = 91
            int r5 = r4.indexOf(r5)
            if (r5 >= 0) goto L8c
            int r4 = indexOfAny(r4, r0)
            if (r4 >= 0) goto L84
            goto L8c
        L84:
            javax.mail.internet.AddressException r4 = new javax.mail.internet.AddressException
            java.lang.String r5 = "Illegal character in domain"
            r4.<init>(r5, r3)
            throw r4
        L8c:
            return
        L8d:
            javax.mail.internet.AddressException r4 = new javax.mail.internet.AddressException
            java.lang.String r5 = "Illegal character in local name"
            r4.<init>(r5, r3)
            throw r4
        L95:
            javax.mail.internet.AddressException r4 = new javax.mail.internet.AddressException
            java.lang.String r5 = "Illegal whitespace in address"
            r4.<init>(r5, r3)
            throw r4
        L9d:
            javax.mail.internet.AddressException r4 = new javax.mail.internet.AddressException
            java.lang.String r5 = "Missing final '@domain'"
            r4.<init>(r5, r3)
            throw r4
    }

    public static javax.mail.internet.InternetAddress getLocalAddress(javax.mail.Session r6) {
            java.lang.String r0 = "user.name"
            r1 = 0
            if (r6 != 0) goto L13
            java.lang.String r6 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L85
            java.net.InetAddress r0 = java.net.InetAddress.getLocalHost()     // Catch: java.lang.Throwable -> L85
            java.lang.String r0 = r0.getHostName()     // Catch: java.lang.Throwable -> L85
            r2 = r1
            goto L5a
        L13:
            java.lang.String r2 = "mail.from"
            java.lang.String r2 = r6.getProperty(r2)     // Catch: java.lang.Throwable -> L85
            if (r2 != 0) goto L58
            java.lang.String r3 = "mail.user"
            java.lang.String r3 = r6.getProperty(r3)     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L29
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L85
            if (r4 != 0) goto L2d
        L29:
            java.lang.String r3 = r6.getProperty(r0)     // Catch: java.lang.Throwable -> L85
        L2d:
            if (r3 == 0) goto L38
            int r4 = r3.length()     // Catch: java.lang.Throwable -> L85
            if (r4 != 0) goto L36
            goto L38
        L36:
            r0 = r3
            goto L3c
        L38:
            java.lang.String r0 = java.lang.System.getProperty(r0)     // Catch: java.lang.Throwable -> L85
        L3c:
            java.lang.String r3 = "mail.host"
            java.lang.String r6 = r6.getProperty(r3)     // Catch: java.lang.Throwable -> L85
            if (r6 == 0) goto L4a
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L85
            if (r3 != 0) goto L54
        L4a:
            java.net.InetAddress r3 = java.net.InetAddress.getLocalHost()     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L54
            java.lang.String r6 = r3.getHostName()     // Catch: java.lang.Throwable -> L85
        L54:
            r5 = r0
            r0 = r6
            r6 = r5
            goto L5a
        L58:
            r6 = r1
            r0 = r6
        L5a:
            if (r2 != 0) goto L7d
            if (r6 == 0) goto L7d
            int r3 = r6.length()     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L7d
            if (r0 == 0) goto L7d
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L85
            if (r3 == 0) goto L7d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L85
            r2.<init>(r6)     // Catch: java.lang.Throwable -> L85
            java.lang.String r6 = "@"
            r2.append(r6)     // Catch: java.lang.Throwable -> L85
            r2.append(r0)     // Catch: java.lang.Throwable -> L85
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L85
        L7d:
            if (r2 == 0) goto L85
            javax.mail.internet.InternetAddress r6 = new javax.mail.internet.InternetAddress     // Catch: java.lang.Throwable -> L85
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L85
            return r6
        L85:
            return r1
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

    private boolean isSimple() {
            r2 = this;
            java.lang.String r0 = r2.address
            if (r0 == 0) goto Le
            java.lang.String r1 = "()<>,;:\\\"[]"
            int r0 = indexOfAny(r0, r1)
            if (r0 < 0) goto Le
            r0 = 0
            return r0
        Le:
            r0 = 1
            return r0
    }

    private static int lengthOfFirstSegment(java.lang.String r2) {
            java.lang.String r0 = "\r\n"
            int r0 = r2.indexOf(r0)
            r1 = -1
            if (r0 == r1) goto La
            return r0
        La:
            int r2 = r2.length()
            return r2
    }

    private static int lengthOfLastSegment(java.lang.String r2, int r3) {
            java.lang.String r0 = "\r\n"
            int r0 = r2.lastIndexOf(r0)
            r1 = -1
            if (r0 == r1) goto L11
            int r2 = r2.length()
            int r2 = r2 - r0
            int r2 = r2 + (-2)
            return r2
        L11:
            int r2 = r2.length()
            int r2 = r2 + r3
            return r2
    }

    public static javax.mail.internet.InternetAddress[] parse(java.lang.String r1) throws javax.mail.internet.AddressException {
            r0 = 1
            javax.mail.internet.InternetAddress[] r1 = parse(r1, r0)
            return r1
    }

    public static javax.mail.internet.InternetAddress[] parse(java.lang.String r1, boolean r2) throws javax.mail.internet.AddressException {
            r0 = 0
            javax.mail.internet.InternetAddress[] r1 = parse(r1, r2, r0)
            return r1
    }

    private static javax.mail.internet.InternetAddress[] parse(java.lang.String r17, boolean r18, boolean r19) throws javax.mail.internet.AddressException {
            r0 = r17
            int r1 = r0.length()
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
            r3 = -1
            r4 = 0
            r5 = 0
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = -1
            r10 = 0
            r11 = -1
            r12 = -1
        L15:
            if (r5 < r1) goto L77
            if (r6 < 0) goto L6d
            if (r9 != r3) goto L1c
            goto L1d
        L1c:
            r5 = r9
        L1d:
            java.lang.String r1 = r0.substring(r6, r5)
            java.lang.String r1 = r1.trim()
            if (r10 != 0) goto L4b
            if (r18 != 0) goto L4b
            if (r19 == 0) goto L2c
            goto L4b
        L2c:
            java.util.StringTokenizer r3 = new java.util.StringTokenizer
            r3.<init>(r1)
        L31:
            boolean r0 = r3.hasMoreTokens()
            if (r0 != 0) goto L38
            goto L6d
        L38:
            java.lang.String r0 = r3.nextToken()
            checkAddress(r0, r4, r4)
            javax.mail.internet.InternetAddress r1 = new javax.mail.internet.InternetAddress
            r1.<init>()
            r1.setAddress(r0)
            r2.addElement(r1)
            goto L31
        L4b:
            if (r18 != 0) goto L4f
            if (r19 != 0) goto L52
        L4f:
            checkAddress(r1, r8, r4)
        L52:
            javax.mail.internet.InternetAddress r3 = new javax.mail.internet.InternetAddress
            r3.<init>()
            r3.setAddress(r1)
            if (r11 < 0) goto L6a
            java.lang.String r0 = r0.substring(r11, r12)
            java.lang.String r0 = r0.trim()
            java.lang.String r0 = unquote(r0)
            r3.encodedPersonal = r0
        L6a:
            r2.addElement(r3)
        L6d:
            int r0 = r2.size()
            javax.mail.internet.InternetAddress[] r0 = new javax.mail.internet.InternetAddress[r0]
            r2.copyInto(r0)
            return r0
        L77:
            char r13 = r0.charAt(r5)
            r14 = 9
            if (r13 == r14) goto L235
            r14 = 10
            if (r13 == r14) goto L235
            r14 = 13
            if (r13 == r14) goto L235
            r14 = 32
            if (r13 == r14) goto L235
            java.lang.String r14 = "Missing '\"'"
            r16 = 1
            r15 = 34
            if (r13 == r15) goto L210
            r4 = 44
            if (r13 == r4) goto L1a3
            r4 = 62
            if (r13 == r4) goto L19b
            r4 = 91
            if (r13 == r4) goto L178
            r4 = 41
            r15 = 40
            if (r13 == r15) goto L13e
            if (r13 == r4) goto L136
            switch(r13) {
                case 58: goto L127;
                case 59: goto Lfd;
                case 60: goto Lb0;
                default: goto Laa;
            }
        Laa:
            if (r6 != r3) goto Lad
            r6 = r5
        Lad:
            r13 = 0
            goto L238
        Lb0:
            if (r8 != 0) goto Lf5
            if (r7 != 0) goto Lbb
            if (r6 < 0) goto Lb7
            r12 = r5
        Lb7:
            int r4 = r5 + 1
            r11 = r6
            r6 = r4
        Lbb:
            int r5 = r5 + 1
            r4 = 0
        Lbe:
            if (r5 < r1) goto Lc1
            goto Ld8
        Lc1:
            char r8 = r0.charAt(r5)
            r9 = 34
            if (r8 == r9) goto Lee
            r9 = 62
            if (r8 == r9) goto Ld5
            r10 = 92
            if (r8 == r10) goto Ld2
            goto Lf2
        Ld2:
            int r5 = r5 + 1
            goto Lf2
        Ld5:
            if (r4 == 0) goto Ld8
            goto Lf2
        Ld8:
            if (r5 < r1) goto Lea
            if (r4 == 0) goto Le2
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            r1.<init>(r14, r0, r5)
            throw r1
        Le2:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Missing '>'"
            r1.<init>(r2, r0, r5)
            throw r1
        Lea:
            r9 = r5
            r8 = 1
        Lec:
            r10 = 1
            goto Lad
        Lee:
            r9 = 62
            r4 = r4 ^ 1
        Lf2:
            int r5 = r5 + 1
            goto Lbe
        Lf5:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Extra route-addr"
            r1.<init>(r2, r0, r5)
            throw r1
        Lfd:
            if (r6 != r3) goto L100
            r6 = r5
        L100:
            if (r7 == 0) goto L11f
            if (r6 != r3) goto L105
            r6 = r5
        L105:
            javax.mail.internet.InternetAddress r4 = new javax.mail.internet.InternetAddress
            r4.<init>()
            int r7 = r5 + 1
            java.lang.String r6 = r0.substring(r6, r7)
            java.lang.String r6 = r6.trim()
            r4.setAddress(r6)
            r2.addElement(r4)
            r6 = -1
            r7 = 0
            r8 = 0
            r9 = -1
            goto Lad
        L11f:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Illegal semicolon, not in group"
            r1.<init>(r2, r0, r5)
            throw r1
        L127:
            if (r7 != 0) goto L12e
            if (r6 != r3) goto L12c
            r6 = r5
        L12c:
            r7 = 1
            goto Lec
        L12e:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Nested group"
            r1.<init>(r2, r0, r5)
            throw r1
        L136:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Missing '('"
            r1.<init>(r2, r0, r5)
            throw r1
        L13e:
            if (r6 < 0) goto L143
            if (r9 != r3) goto L143
            r9 = r5
        L143:
            if (r11 != r3) goto L147
            int r11 = r5 + 1
        L147:
            int r5 = r5 + 1
            r10 = 1
        L14a:
            if (r5 >= r1) goto L167
            if (r10 > 0) goto L14f
            goto L167
        L14f:
            char r13 = r0.charAt(r5)
            if (r13 == r15) goto L162
            if (r13 == r4) goto L15f
            r14 = 92
            if (r13 == r14) goto L15c
            goto L164
        L15c:
            int r5 = r5 + 1
            goto L164
        L15f:
            int r10 = r10 + (-1)
            goto L164
        L162:
            int r10 = r10 + 1
        L164:
            int r5 = r5 + 1
            goto L14a
        L167:
            if (r10 > 0) goto L170
            int r5 = r5 + (-1)
            if (r12 != r3) goto Lec
            r12 = r5
            goto Lec
        L170:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Missing ')'"
            r1.<init>(r2, r0, r5)
            throw r1
        L178:
            int r5 = r5 + 1
        L17a:
            if (r5 < r1) goto L17d
            goto L18a
        L17d:
            char r4 = r0.charAt(r5)
            r14 = 92
            if (r4 == r14) goto L196
            r10 = 93
            if (r4 == r10) goto L18a
            goto L198
        L18a:
            if (r5 >= r1) goto L18e
            goto Lec
        L18e:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Missing ']'"
            r1.<init>(r2, r0, r5)
            throw r1
        L196:
            int r5 = r5 + 1
        L198:
            int r5 = r5 + 1
            goto L17a
        L19b:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            java.lang.String r2 = "Missing '<'"
            r1.<init>(r2, r0, r5)
            throw r1
        L1a3:
            if (r6 != r3) goto L1ab
            r6 = -1
            r8 = 0
            r9 = -1
            r10 = 0
            goto Lad
        L1ab:
            if (r7 == 0) goto L1b0
            r8 = 0
            goto Lad
        L1b0:
            if (r9 != r3) goto L1b3
            r9 = r5
        L1b3:
            java.lang.String r4 = r0.substring(r6, r9)
            java.lang.String r4 = r4.trim()
            if (r10 != 0) goto L1e3
            if (r18 != 0) goto L1e3
            if (r19 == 0) goto L1c2
            goto L1e3
        L1c2:
            java.util.StringTokenizer r6 = new java.util.StringTokenizer
            r6.<init>(r4)
        L1c7:
            boolean r4 = r6.hasMoreTokens()
            if (r4 != 0) goto L1cf
            r13 = 0
            goto L20b
        L1cf:
            java.lang.String r4 = r6.nextToken()
            r8 = 0
            checkAddress(r4, r8, r8)
            javax.mail.internet.InternetAddress r8 = new javax.mail.internet.InternetAddress
            r8.<init>()
            r8.setAddress(r4)
            r2.addElement(r8)
            goto L1c7
        L1e3:
            if (r18 != 0) goto L1e7
            if (r19 != 0) goto L1e9
        L1e7:
            r13 = 0
            goto L1eb
        L1e9:
            r13 = 0
            goto L1ee
        L1eb:
            checkAddress(r4, r8, r13)
        L1ee:
            javax.mail.internet.InternetAddress r6 = new javax.mail.internet.InternetAddress
            r6.<init>()
            r6.setAddress(r4)
            if (r11 < 0) goto L208
            java.lang.String r4 = r0.substring(r11, r12)
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = unquote(r4)
            r6.encodedPersonal = r4
            r11 = -1
            r12 = -1
        L208:
            r2.addElement(r6)
        L20b:
            r6 = -1
            r8 = 0
            r9 = -1
            r10 = 0
            goto L238
        L210:
            r13 = 0
            if (r6 != r3) goto L214
            r6 = r5
        L214:
            int r5 = r5 + 1
        L216:
            if (r5 < r1) goto L219
            goto L22b
        L219:
            char r4 = r0.charAt(r5)
            r10 = 34
            if (r4 == r10) goto L22b
            r15 = 92
            if (r4 == r15) goto L226
            goto L228
        L226:
            int r5 = r5 + 1
        L228:
            int r5 = r5 + 1
            goto L216
        L22b:
            if (r5 >= r1) goto L22f
            r10 = 1
            goto L238
        L22f:
            javax.mail.internet.AddressException r1 = new javax.mail.internet.AddressException
            r1.<init>(r14, r0, r5)
            throw r1
        L235:
            r13 = 0
            r16 = 1
        L238:
            int r5 = r5 + 1
            r4 = 0
            goto L15
    }

    public static javax.mail.internet.InternetAddress[] parseHeader(java.lang.String r1, boolean r2) throws javax.mail.internet.AddressException {
            r0 = 1
            javax.mail.internet.InternetAddress[] r1 = parse(r1, r2, r0)
            return r1
    }

    private static java.lang.String quotePhrase(java.lang.String r7) {
            int r0 = r7.length()
            r1 = 0
            r2 = 0
            r3 = 0
        L7:
            r4 = 34
            if (r2 < r0) goto L22
            if (r3 == 0) goto L21
            java.lang.StringBuffer r1 = new java.lang.StringBuffer
            int r0 = r0 + 2
            r1.<init>(r0)
            r1.append(r4)
            r1.append(r7)
            r1.append(r4)
            java.lang.String r7 = r1.toString()
        L21:
            return r7
        L22:
            char r5 = r7.charAt(r2)
            r6 = 92
            if (r5 == r4) goto L4d
            if (r5 != r6) goto L2d
            goto L4d
        L2d:
            r4 = 32
            if (r5 >= r4) goto L3d
            r4 = 13
            if (r5 == r4) goto L3d
            r4 = 10
            if (r5 == r4) goto L3d
            r4 = 9
            if (r5 != r4) goto L49
        L3d:
            r4 = 127(0x7f, float:1.78E-43)
            if (r5 >= r4) goto L49
            java.lang.String r4 = javax.mail.internet.InternetAddress.rfc822phrase
            int r4 = r4.indexOf(r5)
            if (r4 < 0) goto L4a
        L49:
            r3 = 1
        L4a:
            int r2 = r2 + 1
            goto L7
        L4d:
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            int r3 = r0 + 3
            r2.<init>(r3)
            r2.append(r4)
        L57:
            if (r1 < r0) goto L61
            r2.append(r4)
            java.lang.String r7 = r2.toString()
            return r7
        L61:
            char r3 = r7.charAt(r1)
            if (r3 == r4) goto L69
            if (r3 != r6) goto L6c
        L69:
            r2.append(r6)
        L6c:
            r2.append(r3)
            int r1 = r1 + 1
            goto L57
    }

    public static java.lang.String toString(javax.mail.Address[] r1) {
            r0 = 0
            java.lang.String r1 = toString(r1, r0)
            return r1
    }

    public static java.lang.String toString(javax.mail.Address[] r5, int r6) {
            if (r5 == 0) goto L3d
            int r0 = r5.length
            if (r0 != 0) goto L6
            goto L3d
        L6:
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
        Lc:
            int r2 = r5.length
            if (r1 < r2) goto L14
            java.lang.String r5 = r0.toString()
            return r5
        L14:
            if (r1 == 0) goto L1d
            java.lang.String r2 = ", "
            r0.append(r2)
            int r6 = r6 + 2
        L1d:
            r2 = r5[r1]
            java.lang.String r2 = r2.toString()
            int r3 = lengthOfFirstSegment(r2)
            int r3 = r3 + r6
            r4 = 76
            if (r3 <= r4) goto L33
            java.lang.String r6 = "\r\n\t"
            r0.append(r6)
            r6 = 8
        L33:
            r0.append(r2)
            int r6 = lengthOfLastSegment(r2, r6)
            int r1 = r1 + 1
            goto Lc
        L3d:
            r5 = 0
            return r5
    }

    private static java.lang.String unquote(java.lang.String r6) {
            java.lang.String r0 = "\""
            boolean r1 = r6.startsWith(r0)
            if (r1 == 0) goto L4d
            boolean r0 = r6.endsWith(r0)
            if (r0 == 0) goto L4d
            int r0 = r6.length()
            r1 = 1
            int r0 = r0 - r1
            java.lang.String r6 = r6.substring(r1, r0)
            r0 = 92
            int r2 = r6.indexOf(r0)
            if (r2 < 0) goto L4d
            java.lang.StringBuffer r2 = new java.lang.StringBuffer
            int r3 = r6.length()
            r2.<init>(r3)
            r3 = 0
        L2a:
            int r4 = r6.length()
            if (r3 < r4) goto L35
            java.lang.String r6 = r2.toString()
            return r6
        L35:
            char r4 = r6.charAt(r3)
            if (r4 != r0) goto L48
            int r5 = r6.length()
            int r5 = r5 - r1
            if (r3 >= r5) goto L48
            int r3 = r3 + 1
            char r4 = r6.charAt(r3)
        L48:
            r2.append(r4)
            int r3 = r3 + r1
            goto L2a
        L4d:
            return r6
    }

    public java.lang.Object clone() {
            r1 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L7
            javax.mail.internet.InternetAddress r0 = (javax.mail.internet.InternetAddress) r0     // Catch: java.lang.CloneNotSupportedException -> L7
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // javax.mail.Address
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof javax.mail.internet.InternetAddress
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            javax.mail.internet.InternetAddress r4 = (javax.mail.internet.InternetAddress) r4
            java.lang.String r4 = r4.getAddress()
            java.lang.String r0 = r3.address
            r2 = 1
            if (r4 != r0) goto L12
            return r2
        L12:
            if (r0 == 0) goto L1b
            boolean r4 = r0.equalsIgnoreCase(r4)
            if (r4 == 0) goto L1b
            return r2
        L1b:
            return r1
    }

    public java.lang.String getAddress() {
            r1 = this;
            java.lang.String r0 = r1.address
            return r0
    }

    public javax.mail.internet.InternetAddress[] getGroup(boolean r4) throws javax.mail.internet.AddressException {
            r3 = this;
            java.lang.String r0 = r3.getAddress()
            java.lang.String r1 = ";"
            boolean r1 = r0.endsWith(r1)
            r2 = 0
            if (r1 != 0) goto Le
            return r2
        Le:
            r1 = 58
            int r1 = r0.indexOf(r1)
            if (r1 >= 0) goto L17
            return r2
        L17:
            int r1 = r1 + 1
            int r2 = r0.length()
            int r2 = r2 + (-1)
            java.lang.String r0 = r0.substring(r1, r2)
            javax.mail.internet.InternetAddress[] r4 = parseHeader(r0, r4)
            return r4
    }

    public java.lang.String getPersonal() {
            r1 = this;
            java.lang.String r0 = r1.personal
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r0 = r1.encodedPersonal
            if (r0 == 0) goto L13
            java.lang.String r0 = javax.mail.internet.MimeUtility.decodeText(r0)     // Catch: java.lang.Exception -> L10
            r1.personal = r0     // Catch: java.lang.Exception -> L10
            return r0
        L10:
            java.lang.String r0 = r1.encodedPersonal
            return r0
        L13:
            r0 = 0
            return r0
    }

    @Override // javax.mail.Address
    public java.lang.String getType() {
            r1 = this;
            java.lang.String r0 = "rfc822"
            return r0
    }

    public int hashCode() {
            r2 = this;
            java.lang.String r0 = r2.address
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.Locale r1 = java.util.Locale.ENGLISH
            java.lang.String r0 = r0.toLowerCase(r1)
            int r0 = r0.hashCode()
            return r0
    }

    public boolean isGroup() {
            r2 = this;
            java.lang.String r0 = r2.address
            if (r0 == 0) goto L18
            java.lang.String r1 = ";"
            boolean r0 = r0.endsWith(r1)
            if (r0 == 0) goto L18
            java.lang.String r0 = r2.address
            r1 = 58
            int r0 = r0.indexOf(r1)
            if (r0 <= 0) goto L18
            r0 = 1
            return r0
        L18:
            r0 = 0
            return r0
    }

    public void setAddress(java.lang.String r1) {
            r0 = this;
            r0.address = r1
            return
    }

    public void setPersonal(java.lang.String r1) throws java.io.UnsupportedEncodingException {
            r0 = this;
            r0.personal = r1
            if (r1 == 0) goto Lb
            java.lang.String r1 = javax.mail.internet.MimeUtility.encodeWord(r1)
            r0.encodedPersonal = r1
            return
        Lb:
            r1 = 0
            r0.encodedPersonal = r1
            return
    }

    public void setPersonal(java.lang.String r2, java.lang.String r3) throws java.io.UnsupportedEncodingException {
            r1 = this;
            r1.personal = r2
            r0 = 0
            if (r2 == 0) goto Lc
            java.lang.String r2 = javax.mail.internet.MimeUtility.encodeWord(r2, r3, r0)
            r1.encodedPersonal = r2
            return
        Lc:
            r1.encodedPersonal = r0
            return
    }

    @Override // javax.mail.Address
    public java.lang.String toString() {
            r3 = this;
            java.lang.String r0 = r3.encodedPersonal
            if (r0 != 0) goto L10
            java.lang.String r0 = r3.personal
            if (r0 == 0) goto L10
            java.lang.String r0 = javax.mail.internet.MimeUtility.encodeWord(r0)     // Catch: java.io.UnsupportedEncodingException -> Lf
            r3.encodedPersonal = r0     // Catch: java.io.UnsupportedEncodingException -> Lf
            goto L10
        Lf:
        L10:
            java.lang.String r0 = r3.encodedPersonal
            java.lang.String r1 = ">"
            if (r0 == 0) goto L35
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = quotePhrase(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r0)
            java.lang.String r0 = " <"
            r2.append(r0)
            java.lang.String r0 = r3.address
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
        L35:
            boolean r0 = r3.isGroup()
            if (r0 != 0) goto L56
            boolean r0 = r3.isSimple()
            if (r0 == 0) goto L42
            goto L56
        L42:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "<"
            r0.<init>(r2)
            java.lang.String r2 = r3.address
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L56:
            java.lang.String r0 = r3.address
            return r0
    }

    public java.lang.String toUnicodeString() {
            r3 = this;
            java.lang.String r0 = r3.getPersonal()
            java.lang.String r1 = ">"
            if (r0 == 0) goto L27
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r0 = quotePhrase(r0)
            java.lang.String r0 = java.lang.String.valueOf(r0)
            r2.<init>(r0)
            java.lang.String r0 = " <"
            r2.append(r0)
            java.lang.String r0 = r3.address
            r2.append(r0)
            r2.append(r1)
            java.lang.String r0 = r2.toString()
            return r0
        L27:
            boolean r0 = r3.isGroup()
            if (r0 != 0) goto L48
            boolean r0 = r3.isSimple()
            if (r0 == 0) goto L34
            goto L48
        L34:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "<"
            r0.<init>(r2)
            java.lang.String r2 = r3.address
            r0.append(r2)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L48:
            java.lang.String r0 = r3.address
            return r0
    }

    public void validate() throws javax.mail.internet.AddressException {
            r2 = this;
            java.lang.String r0 = r2.getAddress()
            r1 = 1
            checkAddress(r0, r1, r1)
            return
    }
}

package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d implements com.sun.mail.imap.protocol.l {
    static final char[] r = null;
    private static int s;
    private static int t;
    private static int u;
    private static boolean v;
    public int a;
    public java.lang.String b;
    public java.lang.String c;
    public java.lang.String d;
    public int e;
    public int f;
    public java.lang.String g;
    public java.lang.String h;
    public java.lang.String i;
    public java.lang.String j;
    public java.lang.String k;
    public javax.mail.internet.ParameterList l;
    public javax.mail.internet.ParameterList m;
    public java.lang.String[] n;
    public com.sun.mail.imap.protocol.d[] o;
    public com.sun.mail.imap.protocol.e p;

    /* renamed from: q, reason: collision with root package name */
    private int f5q;

    static {
            r0 = 13
            char[] r0 = new char[r0]
            r0 = {x002a: FILL_ARRAY_DATA , data: [66, 79, 68, 89, 83, 84, 82, 85, 67, 84, 85, 82, 69} // fill-array
            com.sun.mail.imap.protocol.d.r = r0
            r0 = 1
            com.sun.mail.imap.protocol.d.s = r0
            r1 = 2
            com.sun.mail.imap.protocol.d.t = r1
            r1 = 3
            com.sun.mail.imap.protocol.d.u = r1
            r1 = 0
            com.sun.mail.imap.protocol.d.v = r1
            java.lang.String r2 = "mail.imap.parse.debug"
            java.lang.String r2 = java.lang.System.getProperty(r2)     // Catch: java.lang.SecurityException -> L29
            if (r2 == 0) goto L26
            java.lang.String r3 = "true"
            boolean r2 = r2.equalsIgnoreCase(r3)     // Catch: java.lang.SecurityException -> L29
            if (r2 == 0) goto L26
            goto L27
        L26:
            r0 = 0
        L27:
            com.sun.mail.imap.protocol.d.v = r0     // Catch: java.lang.SecurityException -> L29
        L29:
            return
    }

    public d(com.sun.mail.imap.protocol.f r14) throws com.sun.mail.iap.ParsingException {
            r13 = this;
            r13.<init>()
            r0 = -1
            r13.e = r0
            r13.f = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L11
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L11:
            int r0 = r14.E()
            r13.a = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L20
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L20:
            r14.B()
            byte r0 = r14.r()
            r1 = 40
            if (r0 != r1) goto L38e
            byte r0 = r14.n()
            r2 = 1
            r3 = 2
            java.lang.String r4 = ": "
            java.lang.String r5 = "BODYSTRUCTURE parse error: "
            r6 = 110(0x6e, float:1.54E-43)
            r7 = 78
            r8 = 32
            java.lang.String r9 = "/"
            r10 = 41
            if (r0 != r1) goto L179
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L4a
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L4a:
            java.lang.String r0 = "multipart"
            r13.b = r0
            int r0 = com.sun.mail.imap.protocol.d.t
            r13.f5q = r0
            java.util.Vector r0 = new java.util.Vector
            r0.<init>(r2)
        L57:
            com.sun.mail.imap.protocol.d r2 = new com.sun.mail.imap.protocol.d
            r2.<init>(r14)
            r0.addElement(r2)
            r14.B()
            byte r2 = r14.n()
            if (r2 == r1) goto L57
            int r2 = r0.size()
            com.sun.mail.imap.protocol.d[] r2 = new com.sun.mail.imap.protocol.d[r2]
            r13.o = r2
            r0.copyInto(r2)
            java.lang.String r0 = r14.w()
            r13.c = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L82
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L82:
            byte r0 = r14.r()
            if (r0 != r10) goto L92
            boolean r14 = com.sun.mail.imap.protocol.d.v
            if (r14 == 0) goto L363
            java.io.PrintStream r14 = java.lang.System.out
            r14.getClass()
            return
        L92:
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L9b
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L9b:
            javax.mail.internet.ParameterList r0 = r13.e(r14)
            r13.l = r0
            byte r0 = r14.r()
            if (r0 != r10) goto Lb1
            boolean r14 = com.sun.mail.imap.protocol.d.v
            if (r14 == 0) goto L363
            java.io.PrintStream r14 = java.lang.System.out
            r14.getClass()
            return
        Lb1:
            byte r0 = r14.r()
            if (r0 != r1) goto Led
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto Lc0
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        Lc0:
            java.lang.String r0 = r14.w()
            r13.g = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto Lcf
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        Lcf:
            javax.mail.internet.ParameterList r0 = r13.e(r14)
            r13.m = r0
            byte r0 = r14.r()
            if (r0 != r10) goto Le5
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L125
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
            goto L125
        Le5:
            com.sun.mail.iap.ParsingException r14 = new com.sun.mail.iap.ParsingException
            java.lang.String r0 = "BODYSTRUCTURE parse error: missing ``)'' at end of disposition in multipart"
            r14.<init>(r0)
            throw r14
        Led:
            if (r0 == r7) goto L119
            if (r0 != r6) goto Lf2
            goto L119
        Lf2:
            com.sun.mail.iap.ParsingException r14 = new com.sun.mail.iap.ParsingException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.String r2 = r13.b
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = r13.c
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = "bad multipart disposition, b "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            throw r14
        L119:
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L122
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L122:
            r14.A(r3)
        L125:
            byte r0 = r14.r()
            if (r0 != r10) goto L135
            boolean r14 = com.sun.mail.imap.protocol.d.v
            if (r14 == 0) goto L363
            java.io.PrintStream r14 = java.lang.System.out
            r14.getClass()
            return
        L135:
            if (r0 != r8) goto L171
            byte r0 = r14.n()
            if (r0 != r1) goto L150
            java.lang.String[] r0 = r14.y()
            r13.n = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L165
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String[] r1 = r13.n
            int r1 = r1.length
            r0.getClass()
            goto L165
        L150:
            java.lang.String r0 = r14.w()
            if (r0 == 0) goto L165
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r13.n = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L165
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L165:
            byte r0 = r14.r()
            if (r0 == r8) goto L16d
            goto L363
        L16d:
            r13.d(r14)
            goto L165
        L171:
            com.sun.mail.iap.ParsingException r14 = new com.sun.mail.iap.ParsingException
            java.lang.String r0 = "BODYSTRUCTURE parse error: missing space after disposition"
            r14.<init>(r0)
            throw r14
        L179:
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L182
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L182:
            java.lang.String r0 = r14.w()
            r13.b = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L191
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L191:
            int r0 = com.sun.mail.imap.protocol.d.s
            r13.f5q = r0
            java.lang.String r0 = r14.w()
            r13.c = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L1a4
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L1a4:
            java.lang.String r0 = r13.b
            if (r0 != 0) goto L1b0
            java.lang.String r0 = "application"
            r13.b = r0
            java.lang.String r0 = "octet-stream"
            r13.c = r0
        L1b0:
            javax.mail.internet.ParameterList r0 = r13.e(r14)
            r13.l = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L1c4
            java.io.PrintStream r0 = java.lang.System.out
            javax.mail.internet.ParameterList r11 = r13.l
            java.util.Objects.toString(r11)
            r0.getClass()
        L1c4:
            java.lang.String r0 = r14.w()
            r13.h = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L1d3
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L1d3:
            java.lang.String r0 = r14.w()
            r13.i = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L1e2
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L1e2:
            java.lang.String r0 = r14.w()
            r13.d = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L1f1
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L1f1:
            int r0 = r14.v()
            r13.f = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L200
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L200:
            int r0 = r13.f
            if (r0 < 0) goto L386
            java.lang.String r0 = r13.b
            java.lang.String r11 = "text"
            boolean r0 = r0.equalsIgnoreCase(r11)
            java.lang.String r11 = "BODYSTRUCTURE parse error: bad ``lines'' element"
            if (r0 == 0) goto L22a
            int r0 = r14.v()
            r13.e = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L21f
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L21f:
            int r0 = r13.e
            if (r0 < 0) goto L224
            goto L27d
        L224:
            com.sun.mail.iap.ParsingException r14 = new com.sun.mail.iap.ParsingException
            r14.<init>(r11)
            throw r14
        L22a:
            java.lang.String r0 = r13.b
            java.lang.String r12 = "message"
            boolean r0 = r0.equalsIgnoreCase(r12)
            if (r0 == 0) goto L26f
            java.lang.String r0 = r13.c
            java.lang.String r12 = "rfc822"
            boolean r0 = r0.equalsIgnoreCase(r12)
            if (r0 == 0) goto L26f
            int r0 = com.sun.mail.imap.protocol.d.u
            r13.f5q = r0
            com.sun.mail.imap.protocol.e r0 = new com.sun.mail.imap.protocol.e
            r0.<init>(r14)
            r13.p = r0
            com.sun.mail.imap.protocol.d r0 = new com.sun.mail.imap.protocol.d
            r0.<init>(r14)
            com.sun.mail.imap.protocol.d[] r2 = new com.sun.mail.imap.protocol.d[r2]
            r12 = 0
            r2[r12] = r0
            r13.o = r2
            int r0 = r14.v()
            r13.e = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L264
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L264:
            int r0 = r13.e
            if (r0 < 0) goto L269
            goto L27d
        L269:
            com.sun.mail.iap.ParsingException r14 = new com.sun.mail.iap.ParsingException
            r14.<init>(r11)
            throw r14
        L26f:
            r14.B()
            byte r0 = r14.n()
            char r0 = (char) r0
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 != 0) goto L368
        L27d:
            byte r0 = r14.n()
            if (r0 != r10) goto L290
            r14.r()
            boolean r14 = com.sun.mail.imap.protocol.d.v
            if (r14 == 0) goto L363
            java.io.PrintStream r14 = java.lang.System.out
            r14.getClass()
            return
        L290:
            java.lang.String r0 = r14.w()
            r13.j = r0
            byte r0 = r14.r()
            if (r0 != r10) goto L2a6
            boolean r14 = com.sun.mail.imap.protocol.d.v
            if (r14 == 0) goto L363
            java.io.PrintStream r14 = java.lang.System.out
            r14.getClass()
            return
        L2a6:
            byte r0 = r14.r()
            if (r0 != r1) goto L2de
            java.lang.String r0 = r14.w()
            r13.g = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L2bb
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L2bb:
            javax.mail.internet.ParameterList r0 = r13.e(r14)
            r13.m = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L2cf
            java.io.PrintStream r0 = java.lang.System.out
            javax.mail.internet.ParameterList r2 = r13.m
            java.util.Objects.toString(r2)
            r0.getClass()
        L2cf:
            byte r0 = r14.r()
            if (r0 != r10) goto L2d6
            goto L316
        L2d6:
            com.sun.mail.iap.ParsingException r14 = new com.sun.mail.iap.ParsingException
            java.lang.String r0 = "BODYSTRUCTURE parse error: missing ``)'' at end of disposition"
            r14.<init>(r0)
            throw r14
        L2de:
            if (r0 == r7) goto L30a
            if (r0 != r6) goto L2e3
            goto L30a
        L2e3:
            com.sun.mail.iap.ParsingException r14 = new com.sun.mail.iap.ParsingException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>(r5)
            java.lang.String r2 = r13.b
            r1.append(r2)
            r1.append(r9)
            java.lang.String r2 = r13.c
            r1.append(r2)
            r1.append(r4)
            java.lang.String r2 = "bad single part disposition, b "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r14.<init>(r0)
            throw r14
        L30a:
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L313
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L313:
            r14.A(r3)
        L316:
            byte r0 = r14.r()
            if (r0 != r10) goto L326
            boolean r14 = com.sun.mail.imap.protocol.d.v
            if (r14 == 0) goto L363
            java.io.PrintStream r14 = java.lang.System.out
            r14.getClass()
            return
        L326:
            byte r0 = r14.n()
            if (r0 != r1) goto L33f
            java.lang.String[] r0 = r14.y()
            r13.n = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L354
            java.io.PrintStream r0 = java.lang.System.out
            java.lang.String[] r1 = r13.n
            int r1 = r1.length
            r0.getClass()
            goto L354
        L33f:
            java.lang.String r0 = r14.w()
            if (r0 == 0) goto L354
            java.lang.String[] r0 = new java.lang.String[]{r0}
            r13.n = r0
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L354
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L354:
            byte r0 = r14.r()
            if (r0 == r8) goto L364
            boolean r14 = com.sun.mail.imap.protocol.d.v
            if (r14 == 0) goto L363
            java.io.PrintStream r14 = java.lang.System.out
            r14.getClass()
        L363:
            return
        L364:
            r13.d(r14)
            goto L354
        L368:
            com.sun.mail.iap.ParsingException r14 = new com.sun.mail.iap.ParsingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BODYSTRUCTURE parse error: server erroneously included ``lines'' element with type "
            r0.<init>(r1)
            java.lang.String r1 = r13.b
            r0.append(r1)
            r0.append(r9)
            java.lang.String r1 = r13.c
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r14.<init>(r0)
            throw r14
        L386:
            com.sun.mail.iap.ParsingException r14 = new com.sun.mail.iap.ParsingException
            java.lang.String r0 = "BODYSTRUCTURE parse error: bad ``size'' element"
            r14.<init>(r0)
            throw r14
        L38e:
            com.sun.mail.iap.ParsingException r14 = new com.sun.mail.iap.ParsingException
            java.lang.String r0 = "BODYSTRUCTURE parse error: missing ``('' at start"
            r14.<init>(r0)
            throw r14
    }

    private void d(com.sun.mail.iap.g r3) throws com.sun.mail.iap.ParsingException {
            r2 = this;
            r3.B()
            byte r0 = r3.n()
            r1 = 40
            if (r0 != r1) goto L1b
            r0 = 1
            r3.A(r0)
        Lf:
            r2.d(r3)
            byte r0 = r3.r()
            r1 = 41
            if (r0 != r1) goto Lf
            return
        L1b:
            char r0 = (char) r0
            boolean r0 = java.lang.Character.isDigit(r0)
            if (r0 == 0) goto L26
            r3.v()
            return
        L26:
            r3.w()
            return
    }

    private javax.mail.internet.ParameterList e(com.sun.mail.iap.g r6) throws com.sun.mail.iap.ParsingException {
            r5 = this;
            r6.B()
            byte r0 = r6.r()
            r1 = 40
            r2 = 0
            if (r0 != r1) goto L68
            javax.mail.internet.ParameterList r0 = new javax.mail.internet.ParameterList
            r0.<init>()
        L11:
            java.lang.String r1 = r6.w()
            boolean r3 = com.sun.mail.imap.protocol.d.v
            if (r3 == 0) goto L1e
            java.io.PrintStream r3 = java.lang.System.out
            r3.getClass()
        L1e:
            if (r1 == 0) goto L3e
            java.lang.String r3 = r6.w()
            boolean r4 = com.sun.mail.imap.protocol.d.v
            if (r4 == 0) goto L2d
            java.io.PrintStream r4 = java.lang.System.out
            r4.getClass()
        L2d:
            r0.set(r1, r3)
            byte r1 = r6.r()
            r3 = 41
            if (r1 != r3) goto L11
            java.lang.String r6 = "DONE"
            r0.set(r2, r6)
            return r0
        L3e:
            com.sun.mail.iap.ParsingException r6 = new com.sun.mail.iap.ParsingException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "BODYSTRUCTURE parse error: "
            r0.<init>(r1)
            java.lang.String r1 = r5.b
            r0.append(r1)
            java.lang.String r1 = "/"
            r0.append(r1)
            java.lang.String r1 = r5.c
            r0.append(r1)
            java.lang.String r1 = ": "
            r0.append(r1)
            java.lang.String r1 = "null name in parameter list"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            throw r6
        L68:
            r1 = 78
            if (r0 == r1) goto L79
            r1 = 110(0x6e, float:1.54E-43)
            if (r0 != r1) goto L71
            goto L79
        L71:
            com.sun.mail.iap.ParsingException r6 = new com.sun.mail.iap.ParsingException
            java.lang.String r0 = "Parameter list parse error"
            r6.<init>(r0)
            throw r6
        L79:
            boolean r0 = com.sun.mail.imap.protocol.d.v
            if (r0 == 0) goto L82
            java.io.PrintStream r0 = java.lang.System.out
            r0.getClass()
        L82:
            r0 = 2
            r6.A(r0)
            return r2
    }

    public boolean a() {
            r2 = this;
            int r0 = r2.f5q
            int r1 = com.sun.mail.imap.protocol.d.t
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean b() {
            r2 = this;
            int r0 = r2.f5q
            int r1 = com.sun.mail.imap.protocol.d.u
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }

    public boolean c() {
            r2 = this;
            int r0 = r2.f5q
            int r1 = com.sun.mail.imap.protocol.d.s
            if (r0 != r1) goto L8
            r0 = 1
            return r0
        L8:
            r0 = 0
            return r0
    }
}

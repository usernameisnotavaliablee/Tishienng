package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j implements com.sun.mail.imap.protocol.s {
    private com.sun.mail.imap.protocol.h a;
    private java.lang.String b;
    private java.util.Properties c;
    private boolean d;
    private java.io.PrintStream e;
    private java.lang.String f;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements javax.security.auth.callback.CallbackHandler {
        final /* synthetic */ com.sun.mail.imap.protocol.j a;
        private final /* synthetic */ java.lang.String b;
        private final /* synthetic */ java.lang.String c;
        private final /* synthetic */ java.lang.String d;

        a(com.sun.mail.imap.protocol.j r1, java.lang.String r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.c = r3
                r0.d = r4
                r0.<init>()
                return
        }

        @Override // javax.security.auth.callback.CallbackHandler
        public void handle(javax.security.auth.callback.Callback[] r8) {
                r7 = this;
                com.sun.mail.imap.protocol.j r0 = r7.a
                boolean r0 = com.sun.mail.imap.protocol.j.b(r0)
                if (r0 == 0) goto L12
                com.sun.mail.imap.protocol.j r0 = r7.a
                java.io.PrintStream r0 = com.sun.mail.imap.protocol.j.c(r0)
                int r1 = r8.length
                r0.getClass()
            L12:
                r0 = 0
                r1 = 0
            L14:
                int r2 = r8.length
                if (r1 < r2) goto L18
                return
            L18:
                com.sun.mail.imap.protocol.j r2 = r7.a
                boolean r2 = com.sun.mail.imap.protocol.j.b(r2)
                if (r2 == 0) goto L2e
                com.sun.mail.imap.protocol.j r2 = r7.a
                java.io.PrintStream r2 = com.sun.mail.imap.protocol.j.c(r2)
                r3 = r8[r1]
                java.util.Objects.toString(r3)
                r2.getClass()
            L2e:
                r2 = r8[r1]
                boolean r3 = r2 instanceof javax.security.auth.callback.NameCallback
                if (r3 == 0) goto L3c
                javax.security.auth.callback.NameCallback r2 = (javax.security.auth.callback.NameCallback) r2
                java.lang.String r3 = r7.b
                r2.setName(r3)
                goto L8b
            L3c:
                boolean r3 = r2 instanceof javax.security.auth.callback.PasswordCallback
                if (r3 == 0) goto L4c
                javax.security.auth.callback.PasswordCallback r2 = (javax.security.auth.callback.PasswordCallback) r2
                java.lang.String r3 = r7.c
                char[] r3 = r3.toCharArray()
                r2.setPassword(r3)
                goto L8b
            L4c:
                boolean r3 = r2 instanceof javax.security.sasl.RealmCallback
                if (r3 == 0) goto L5f
                javax.security.sasl.RealmCallback r2 = (javax.security.sasl.RealmCallback) r2
                java.lang.String r3 = r7.d
                if (r3 == 0) goto L57
                goto L5b
            L57:
                java.lang.String r3 = r2.getDefaultText()
            L5b:
                r2.setText(r3)
                goto L8b
            L5f:
                boolean r3 = r2 instanceof javax.security.sasl.RealmChoiceCallback
                if (r3 == 0) goto L8b
                javax.security.sasl.RealmChoiceCallback r2 = (javax.security.sasl.RealmChoiceCallback) r2
                java.lang.String r3 = r7.d
                if (r3 != 0) goto L71
                int r3 = r2.getDefaultChoice()
                r2.setSelectedIndex(r3)
                goto L8b
            L71:
                java.lang.String[] r3 = r2.getChoices()
                r4 = 0
            L76:
                int r5 = r3.length
                if (r4 < r5) goto L7a
                goto L8b
            L7a:
                r5 = r3[r4]
                java.lang.String r6 = r7.d
                boolean r5 = r5.equals(r6)
                if (r5 == 0) goto L88
                r2.setSelectedIndex(r4)
                goto L8b
            L88:
                int r4 = r4 + 1
                goto L76
            L8b:
                int r1 = r1 + 1
                goto L14
        }
    }

    public j(com.sun.mail.imap.protocol.h r1, java.lang.String r2, java.util.Properties r3, boolean r4, java.io.PrintStream r5, java.lang.String r6) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            return
    }

    static /* synthetic */ boolean b(com.sun.mail.imap.protocol.j r0) {
            boolean r0 = r0.d
            return r0
    }

    static /* synthetic */ java.io.PrintStream c(com.sun.mail.imap.protocol.j r0) {
            java.io.PrintStream r0 = r0.e
            return r0
    }

    @Override // com.sun.mail.imap.protocol.s
    public boolean a(java.lang.String[] r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, java.lang.String r21) throws com.sun.mail.iap.ProtocolException {
            r16 = this;
            r1 = r16
            r2 = r17
            com.sun.mail.imap.protocol.h r8 = r1.a
            monitor-enter(r8)
            java.util.Vector r9 = new java.util.Vector     // Catch: java.lang.Throwable -> L20
            r9.<init>()     // Catch: java.lang.Throwable -> L20
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> L20
            r10 = 0
            if (r0 == 0) goto L2d
            java.io.PrintStream r0 = r1.e     // Catch: java.lang.Throwable -> L20
            r0.getClass()     // Catch: java.lang.Throwable -> L20
            r0 = 0
        L17:
            int r3 = r2.length     // Catch: java.lang.Throwable -> L20
            if (r0 < r3) goto L23
            java.io.PrintStream r0 = r1.e     // Catch: java.lang.Throwable -> L20
            r0.getClass()     // Catch: java.lang.Throwable -> L20
            goto L2d
        L20:
            r0 = move-exception
            goto L19a
        L23:
            java.io.PrintStream r3 = r1.e     // Catch: java.lang.Throwable -> L20
            r4 = r2[r0]     // Catch: java.lang.Throwable -> L20
            r3.getClass()     // Catch: java.lang.Throwable -> L20
            int r0 = r0 + 1
            goto L17
        L2d:
            com.sun.mail.imap.protocol.j$a r7 = new com.sun.mail.imap.protocol.j$a     // Catch: java.lang.Throwable -> L20
            r0 = r18
            r3 = r20
            r4 = r21
            r7.<init>(r1, r3, r4, r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r4 = r1.b     // Catch: java.lang.Throwable -> L20 javax.security.sasl.SaslException -> L18b
            java.lang.String r5 = r1.f     // Catch: java.lang.Throwable -> L20 javax.security.sasl.SaslException -> L18b
            java.util.Properties r6 = r1.c     // Catch: java.lang.Throwable -> L20 javax.security.sasl.SaslException -> L18b
            r3 = r19
            javax.security.sasl.SaslClient r2 = javax.security.sasl.Sasl.createSaslClient(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L20 javax.security.sasl.SaslException -> L18b
            if (r2 != 0) goto L51
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L4f
            java.io.PrintStream r0 = r1.e     // Catch: java.lang.Throwable -> L20
            r0.getClass()     // Catch: java.lang.Throwable -> L20
        L4f:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L20
            return r10
        L51:
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto L5d
            java.io.PrintStream r0 = r1.e     // Catch: java.lang.Throwable -> L20
            r2.getMechanismName()     // Catch: java.lang.Throwable -> L20
            r0.getClass()     // Catch: java.lang.Throwable -> L20
        L5d:
            com.sun.mail.imap.protocol.h r0 = r1.a     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L17c
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L17c
            java.lang.String r4 = "AUTHENTICATE "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L17c
            java.lang.String r4 = r2.getMechanismName()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L17c
            r3.append(r4)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L17c
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L17c
            r4 = 0
            java.lang.String r3 = r0.q(r3, r4)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> L17c
            com.sun.mail.imap.protocol.h r0 = r1.a     // Catch: java.lang.Throwable -> L20
            java.io.OutputStream r5 = r0.b0()     // Catch: java.lang.Throwable -> L20
            java.io.ByteArrayOutputStream r6 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L20
            r6.<init>()     // Catch: java.lang.Throwable -> L20
            r0 = 2
            byte[] r7 = new byte[r0]     // Catch: java.lang.Throwable -> L20
            r7 = {x019c: FILL_ARRAY_DATA , data: [13, 10} // fill-array     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = r2.getMechanismName()     // Catch: java.lang.Throwable -> L20
            java.lang.String r11 = "XGWTRUSTEDAPP"
            boolean r11 = r0.equals(r11)     // Catch: java.lang.Throwable -> L20
            r12 = r4
            r0 = 0
        L93:
            r13 = 1
            if (r0 == 0) goto Ldb
            boolean r0 = r2.isComplete()     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto Lc1
            java.lang.String r0 = "javax.security.sasl.qop"
            java.lang.Object r0 = r2.getNegotiatedProperty(r0)     // Catch: java.lang.Throwable -> L20
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto Lc1
            java.lang.String r2 = "auth-int"
            boolean r2 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L20
            if (r2 != 0) goto Lb6
            java.lang.String r2 = "auth-conf"
            boolean r0 = r0.equalsIgnoreCase(r2)     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto Lc1
        Lb6:
            boolean r0 = r1.d     // Catch: java.lang.Throwable -> L20
            if (r0 == 0) goto Lbf
            java.io.PrintStream r0 = r1.e     // Catch: java.lang.Throwable -> L20
            r0.getClass()     // Catch: java.lang.Throwable -> L20
        Lbf:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L20
            return r10
        Lc1:
            int r0 = r9.size()     // Catch: java.lang.Throwable -> L20
            com.sun.mail.iap.g[] r0 = new com.sun.mail.iap.g[r0]     // Catch: java.lang.Throwable -> L20
            r9.copyInto(r0)     // Catch: java.lang.Throwable -> L20
            com.sun.mail.imap.protocol.h r2 = r1.a     // Catch: java.lang.Throwable -> L20
            r2.j(r0)     // Catch: java.lang.Throwable -> L20
            com.sun.mail.imap.protocol.h r0 = r1.a     // Catch: java.lang.Throwable -> L20
            r0.h(r12)     // Catch: java.lang.Throwable -> L20
            com.sun.mail.imap.protocol.h r0 = r1.a     // Catch: java.lang.Throwable -> L20
            r0.H0(r12)     // Catch: java.lang.Throwable -> L20
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L20
            return r13
        Ldb:
            com.sun.mail.imap.protocol.h r12 = r1.a     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            com.sun.mail.iap.g r12 = r12.l()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            boolean r14 = r12.f()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            if (r14 == 0) goto L158
            boolean r14 = r2.isComplete()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            if (r14 != 0) goto L112
            com.sun.mail.iap.d r14 = r12.s()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            byte[] r14 = r14.c()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            int r15 = r14.length     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            if (r15 <= 0) goto L100
            byte[] r14 = com.sun.mail.util.BASE64DecoderStream.decode(r14)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            goto L100
        Lfd:
            r0 = move-exception
            goto L177
        L100:
            boolean r15 = r1.d     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            if (r15 == 0) goto L10d
            java.io.PrintStream r15 = r1.e     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            int r4 = r14.length     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            com.sun.mail.util.ASCIIUtility.toString(r14, r10, r4)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            r15.getClass()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
        L10d:
            byte[] r4 = r2.evaluateChallenge(r14)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            goto L113
        L112:
            r4 = 0
        L113:
            if (r4 != 0) goto L128
            boolean r4 = r1.d     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            if (r4 == 0) goto L11e
            java.io.PrintStream r4 = r1.e     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            r4.getClass()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
        L11e:
            r5.write(r7)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            r5.flush()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            r6.reset()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            goto L169
        L128:
            boolean r14 = r1.d     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            if (r14 == 0) goto L135
            java.io.PrintStream r14 = r1.e     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            int r15 = r4.length     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            com.sun.mail.util.ASCIIUtility.toString(r4, r10, r15)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            r14.getClass()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
        L135:
            byte[] r4 = com.sun.mail.util.BASE64EncoderStream.encode(r4)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            if (r11 == 0) goto L144
            java.lang.String r14 = "XGWTRUSTEDAPP "
            byte[] r14 = r14.getBytes()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            r6.write(r14)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
        L144:
            r6.write(r4)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            r6.write(r7)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            byte[] r4 = r6.toByteArray()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            r5.write(r4)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            r5.flush()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            r6.reset()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            goto L169
        L158:
            boolean r4 = r12.j()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            if (r4 == 0) goto L16c
            java.lang.String r4 = r12.c()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            boolean r4 = r4.equals(r3)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            if (r4 == 0) goto L16c
        L168:
            r0 = 1
        L169:
            r4 = 0
            goto L93
        L16c:
            boolean r4 = r12.e()     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            if (r4 == 0) goto L173
            goto L168
        L173:
            r9.addElement(r12)     // Catch: java.lang.Throwable -> L20 java.lang.Exception -> Lfd
            goto L169
        L177:
            com.sun.mail.iap.g r12 = com.sun.mail.iap.g.a(r0)     // Catch: java.lang.Throwable -> L20
            goto L168
        L17c:
            r0 = move-exception
            boolean r2 = r1.d     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L189
            java.io.PrintStream r2 = r1.e     // Catch: java.lang.Throwable -> L20
            r0.toString()     // Catch: java.lang.Throwable -> L20
            r2.getClass()     // Catch: java.lang.Throwable -> L20
        L189:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L20
            return r10
        L18b:
            r0 = move-exception
            boolean r2 = r1.d     // Catch: java.lang.Throwable -> L20
            if (r2 == 0) goto L198
            java.io.PrintStream r2 = r1.e     // Catch: java.lang.Throwable -> L20
            r0.toString()     // Catch: java.lang.Throwable -> L20
            r2.getClass()     // Catch: java.lang.Throwable -> L20
        L198:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L20
            return r10
        L19a:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L20
            throw r0
    }
}

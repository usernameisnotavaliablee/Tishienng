package com.sun.mail.imap.protocol;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
class t {
    private static java.lang.String[] a;
    private static java.util.Calendar b;

    static {
            java.lang.String r10 = "Nov"
            java.lang.String r11 = "Dec"
            java.lang.String r0 = "Jan"
            java.lang.String r1 = "Feb"
            java.lang.String r2 = "Mar"
            java.lang.String r3 = "Apr"
            java.lang.String r4 = "May"
            java.lang.String r5 = "Jun"
            java.lang.String r6 = "Jul"
            java.lang.String r7 = "Aug"
            java.lang.String r8 = "Sep"
            java.lang.String r9 = "Oct"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11}
            com.sun.mail.imap.protocol.t.a = r0
            java.util.GregorianCalendar r0 = new java.util.GregorianCalendar
            r0.<init>()
            com.sun.mail.imap.protocol.t.b = r0
            return
    }

    t() {
            r0 = this;
            r0.<init>()
            return
    }

    private static com.sun.mail.iap.b a(javax.mail.search.AndTerm r3, java.lang.String r4) throws javax.mail.search.SearchException, java.io.IOException {
            javax.mail.search.SearchTerm[] r3 = r3.getTerms()
            r0 = 0
            r0 = r3[r0]
            com.sun.mail.iap.b r0 = e(r0, r4)
            r1 = 1
        Lc:
            int r2 = r3.length
            if (r1 < r2) goto L10
            return r0
        L10:
            r2 = r3[r1]
            com.sun.mail.iap.b r2 = e(r2, r4)
            r0.a(r2)
            int r1 = r1 + 1
            goto Lc
    }

    private static com.sun.mail.iap.b b(javax.mail.search.BodyTerm r2, java.lang.String r3) throws javax.mail.search.SearchException, java.io.IOException {
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            java.lang.String r1 = "BODY"
            r0.i(r1)
            java.lang.String r2 = r2.getPattern()
            r0.p(r2, r3)
            return r0
    }

    private static com.sun.mail.iap.b c(javax.mail.search.FlagTerm r7) throws javax.mail.search.SearchException {
            boolean r0 = r7.getTestSet()
            com.sun.mail.iap.b r1 = new com.sun.mail.iap.b
            r1.<init>()
            javax.mail.Flags r7 = r7.getFlags()
            javax.mail.Flags$Flag[] r2 = r7.getSystemFlags()
            java.lang.String[] r7 = r7.getUserFlags()
            int r3 = r2.length
            if (r3 != 0) goto L24
            int r3 = r7.length
            if (r3 == 0) goto L1c
            goto L24
        L1c:
            javax.mail.search.SearchException r7 = new javax.mail.search.SearchException
            java.lang.String r0 = "Invalid FlagTerm"
            r7.<init>(r0)
            throw r7
        L24:
            r3 = 0
            r4 = 0
        L26:
            int r5 = r2.length
            if (r4 < r5) goto L3f
        L29:
            int r2 = r7.length
            if (r3 < r2) goto L2d
            return r1
        L2d:
            if (r0 == 0) goto L32
            java.lang.String r2 = "KEYWORD"
            goto L34
        L32:
            java.lang.String r2 = "UNKEYWORD"
        L34:
            r1.i(r2)
            r2 = r7[r3]
            r1.i(r2)
            int r3 = r3 + 1
            goto L29
        L3f:
            r5 = r2[r4]
            javax.mail.Flags$Flag r6 = javax.mail.Flags.Flag.DELETED
            if (r5 != r6) goto L50
            if (r0 == 0) goto L4a
            java.lang.String r5 = "DELETED"
            goto L4c
        L4a:
            java.lang.String r5 = "UNDELETED"
        L4c:
            r1.i(r5)
            goto L9a
        L50:
            javax.mail.Flags$Flag r6 = javax.mail.Flags.Flag.ANSWERED
            if (r5 != r6) goto L5f
            if (r0 == 0) goto L59
            java.lang.String r5 = "ANSWERED"
            goto L5b
        L59:
            java.lang.String r5 = "UNANSWERED"
        L5b:
            r1.i(r5)
            goto L9a
        L5f:
            javax.mail.Flags$Flag r6 = javax.mail.Flags.Flag.DRAFT
            if (r5 != r6) goto L6e
            if (r0 == 0) goto L68
            java.lang.String r5 = "DRAFT"
            goto L6a
        L68:
            java.lang.String r5 = "UNDRAFT"
        L6a:
            r1.i(r5)
            goto L9a
        L6e:
            javax.mail.Flags$Flag r6 = javax.mail.Flags.Flag.FLAGGED
            if (r5 != r6) goto L7d
            if (r0 == 0) goto L77
            java.lang.String r5 = "FLAGGED"
            goto L79
        L77:
            java.lang.String r5 = "UNFLAGGED"
        L79:
            r1.i(r5)
            goto L9a
        L7d:
            javax.mail.Flags$Flag r6 = javax.mail.Flags.Flag.RECENT
            if (r5 != r6) goto L8c
            if (r0 == 0) goto L86
            java.lang.String r5 = "RECENT"
            goto L88
        L86:
            java.lang.String r5 = "OLD"
        L88:
            r1.i(r5)
            goto L9a
        L8c:
            javax.mail.Flags$Flag r6 = javax.mail.Flags.Flag.SEEN
            if (r5 != r6) goto L9a
            if (r0 == 0) goto L95
            java.lang.String r5 = "SEEN"
            goto L97
        L95:
            java.lang.String r5 = "UNSEEN"
        L97:
            r1.i(r5)
        L9a:
            int r4 = r4 + 1
            goto L26
    }

    private static com.sun.mail.iap.b d(java.lang.String r2, java.lang.String r3) throws javax.mail.search.SearchException, java.io.IOException {
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            java.lang.String r1 = "FROM"
            r0.i(r1)
            r0.p(r2, r3)
            return r0
    }

    static com.sun.mail.iap.b e(javax.mail.search.SearchTerm r1, java.lang.String r2) throws javax.mail.search.SearchException, java.io.IOException {
            boolean r0 = r1 instanceof javax.mail.search.AndTerm
            if (r0 == 0) goto Lb
            javax.mail.search.AndTerm r1 = (javax.mail.search.AndTerm) r1
            com.sun.mail.iap.b r1 = a(r1, r2)
            return r1
        Lb:
            boolean r0 = r1 instanceof javax.mail.search.OrTerm
            if (r0 == 0) goto L16
            javax.mail.search.OrTerm r1 = (javax.mail.search.OrTerm) r1
            com.sun.mail.iap.b r1 = k(r1, r2)
            return r1
        L16:
            boolean r0 = r1 instanceof javax.mail.search.NotTerm
            if (r0 == 0) goto L21
            javax.mail.search.NotTerm r1 = (javax.mail.search.NotTerm) r1
            com.sun.mail.iap.b r1 = j(r1, r2)
            return r1
        L21:
            boolean r0 = r1 instanceof javax.mail.search.HeaderTerm
            if (r0 == 0) goto L2c
            javax.mail.search.HeaderTerm r1 = (javax.mail.search.HeaderTerm) r1
            com.sun.mail.iap.b r1 = f(r1, r2)
            return r1
        L2c:
            boolean r0 = r1 instanceof javax.mail.search.FlagTerm
            if (r0 == 0) goto L37
            javax.mail.search.FlagTerm r1 = (javax.mail.search.FlagTerm) r1
            com.sun.mail.iap.b r1 = c(r1)
            return r1
        L37:
            boolean r0 = r1 instanceof javax.mail.search.FromTerm
            if (r0 == 0) goto L4a
            javax.mail.search.FromTerm r1 = (javax.mail.search.FromTerm) r1
            javax.mail.Address r1 = r1.getAddress()
            java.lang.String r1 = r1.toString()
            com.sun.mail.iap.b r1 = d(r1, r2)
            return r1
        L4a:
            boolean r0 = r1 instanceof javax.mail.search.FromStringTerm
            if (r0 == 0) goto L59
            javax.mail.search.FromStringTerm r1 = (javax.mail.search.FromStringTerm) r1
            java.lang.String r1 = r1.getPattern()
            com.sun.mail.iap.b r1 = d(r1, r2)
            return r1
        L59:
            boolean r0 = r1 instanceof javax.mail.search.RecipientTerm
            if (r0 == 0) goto L70
            javax.mail.search.RecipientTerm r1 = (javax.mail.search.RecipientTerm) r1
            javax.mail.Message$RecipientType r0 = r1.getRecipientType()
            javax.mail.Address r1 = r1.getAddress()
            java.lang.String r1 = r1.toString()
            com.sun.mail.iap.b r1 = m(r0, r1, r2)
            return r1
        L70:
            boolean r0 = r1 instanceof javax.mail.search.RecipientStringTerm
            if (r0 == 0) goto L83
            javax.mail.search.RecipientStringTerm r1 = (javax.mail.search.RecipientStringTerm) r1
            javax.mail.Message$RecipientType r0 = r1.getRecipientType()
            java.lang.String r1 = r1.getPattern()
            com.sun.mail.iap.b r1 = m(r0, r1, r2)
            return r1
        L83:
            boolean r0 = r1 instanceof javax.mail.search.SubjectTerm
            if (r0 == 0) goto L8e
            javax.mail.search.SubjectTerm r1 = (javax.mail.search.SubjectTerm) r1
            com.sun.mail.iap.b r1 = p(r1, r2)
            return r1
        L8e:
            boolean r0 = r1 instanceof javax.mail.search.BodyTerm
            if (r0 == 0) goto L99
            javax.mail.search.BodyTerm r1 = (javax.mail.search.BodyTerm) r1
            com.sun.mail.iap.b r1 = b(r1, r2)
            return r1
        L99:
            boolean r0 = r1 instanceof javax.mail.search.SizeTerm
            if (r0 == 0) goto La4
            javax.mail.search.SizeTerm r1 = (javax.mail.search.SizeTerm) r1
            com.sun.mail.iap.b r1 = o(r1)
            return r1
        La4:
            boolean r0 = r1 instanceof javax.mail.search.SentDateTerm
            if (r0 == 0) goto Laf
            javax.mail.search.SentDateTerm r1 = (javax.mail.search.SentDateTerm) r1
            com.sun.mail.iap.b r1 = n(r1)
            return r1
        Laf:
            boolean r0 = r1 instanceof javax.mail.search.ReceivedDateTerm
            if (r0 == 0) goto Lba
            javax.mail.search.ReceivedDateTerm r1 = (javax.mail.search.ReceivedDateTerm) r1
            com.sun.mail.iap.b r1 = l(r1)
            return r1
        Lba:
            boolean r0 = r1 instanceof javax.mail.search.MessageIDTerm
            if (r0 == 0) goto Lc5
            javax.mail.search.MessageIDTerm r1 = (javax.mail.search.MessageIDTerm) r1
            com.sun.mail.iap.b r1 = i(r1, r2)
            return r1
        Lc5:
            javax.mail.search.SearchException r1 = new javax.mail.search.SearchException
            java.lang.String r2 = "Search too complex"
            r1.<init>(r2)
            throw r1
    }

    private static com.sun.mail.iap.b f(javax.mail.search.HeaderTerm r2, java.lang.String r3) throws javax.mail.search.SearchException, java.io.IOException {
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            java.lang.String r1 = "HEADER"
            r0.i(r1)
            java.lang.String r1 = r2.getHeaderName()
            r0.o(r1)
            java.lang.String r2 = r2.getPattern()
            r0.p(r2, r3)
            return r0
    }

    private static boolean g(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 0
            r2 = 0
        L6:
            if (r2 < r0) goto La
            r5 = 1
            return r5
        La:
            char r3 = r5.charAt(r2)
            r4 = 127(0x7f, float:1.78E-43)
            if (r3 <= r4) goto L13
            return r1
        L13:
            int r2 = r2 + 1
            goto L6
    }

    static boolean h(javax.mail.search.SearchTerm r3) {
            boolean r0 = r3 instanceof javax.mail.search.AndTerm
            if (r0 != 0) goto L3a
            boolean r1 = r3 instanceof javax.mail.search.OrTerm
            if (r1 == 0) goto L9
            goto L3a
        L9:
            boolean r0 = r3 instanceof javax.mail.search.NotTerm
            if (r0 == 0) goto L18
            javax.mail.search.NotTerm r3 = (javax.mail.search.NotTerm) r3
            javax.mail.search.SearchTerm r3 = r3.getTerm()
            boolean r3 = h(r3)
            return r3
        L18:
            boolean r0 = r3 instanceof javax.mail.search.StringTerm
            if (r0 == 0) goto L27
            javax.mail.search.StringTerm r3 = (javax.mail.search.StringTerm) r3
            java.lang.String r3 = r3.getPattern()
            boolean r3 = g(r3)
            return r3
        L27:
            boolean r0 = r3 instanceof javax.mail.search.AddressTerm
            if (r0 == 0) goto L4e
            javax.mail.search.AddressTerm r3 = (javax.mail.search.AddressTerm) r3
            javax.mail.Address r3 = r3.getAddress()
            java.lang.String r3 = r3.toString()
            boolean r3 = g(r3)
            return r3
        L3a:
            if (r0 == 0) goto L43
            javax.mail.search.AndTerm r3 = (javax.mail.search.AndTerm) r3
            javax.mail.search.SearchTerm[] r3 = r3.getTerms()
            goto L49
        L43:
            javax.mail.search.OrTerm r3 = (javax.mail.search.OrTerm) r3
            javax.mail.search.SearchTerm[] r3 = r3.getTerms()
        L49:
            r0 = 0
            r1 = 0
        L4b:
            int r2 = r3.length
            if (r1 < r2) goto L50
        L4e:
            r3 = 1
            return r3
        L50:
            r2 = r3[r1]
            boolean r2 = h(r2)
            if (r2 != 0) goto L59
            return r0
        L59:
            int r1 = r1 + 1
            goto L4b
    }

    private static com.sun.mail.iap.b i(javax.mail.search.MessageIDTerm r2, java.lang.String r3) throws javax.mail.search.SearchException, java.io.IOException {
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            java.lang.String r1 = "HEADER"
            r0.i(r1)
            java.lang.String r1 = "Message-ID"
            r0.o(r1)
            java.lang.String r2 = r2.getPattern()
            r0.p(r2, r3)
            return r0
    }

    private static com.sun.mail.iap.b j(javax.mail.search.NotTerm r2, java.lang.String r3) throws javax.mail.search.SearchException, java.io.IOException {
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            java.lang.String r1 = "NOT"
            r0.i(r1)
            javax.mail.search.SearchTerm r2 = r2.getTerm()
            boolean r1 = r2 instanceof javax.mail.search.AndTerm
            if (r1 != 0) goto L1f
            boolean r1 = r2 instanceof javax.mail.search.FlagTerm
            if (r1 == 0) goto L17
            goto L1f
        L17:
            com.sun.mail.iap.b r2 = e(r2, r3)
            r0.a(r2)
            return r0
        L1f:
            com.sun.mail.iap.b r2 = e(r2, r3)
            r0.h(r2)
            return r0
    }

    private static com.sun.mail.iap.b k(javax.mail.search.OrTerm r6, java.lang.String r7) throws javax.mail.search.SearchException, java.io.IOException {
            javax.mail.search.SearchTerm[] r6 = r6.getTerms()
            int r0 = r6.length
            r1 = 2
            r2 = 0
            r3 = 1
            if (r0 <= r1) goto L22
            r0 = r6[r2]
            r1 = 1
        Ld:
            int r4 = r6.length
            if (r1 < r4) goto L17
            javax.mail.search.OrTerm r0 = (javax.mail.search.OrTerm) r0
            javax.mail.search.SearchTerm[] r6 = r0.getTerms()
            goto L22
        L17:
            javax.mail.search.OrTerm r4 = new javax.mail.search.OrTerm
            r5 = r6[r1]
            r4.<init>(r0, r5)
            int r1 = r1 + 1
            r0 = r4
            goto Ld
        L22:
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            int r1 = r6.length
            if (r1 <= r3) goto L2f
            java.lang.String r1 = "OR"
            r0.i(r1)
        L2f:
            r1 = r6[r2]
            boolean r2 = r1 instanceof javax.mail.search.AndTerm
            if (r2 != 0) goto L42
            boolean r2 = r1 instanceof javax.mail.search.FlagTerm
            if (r2 == 0) goto L3a
            goto L42
        L3a:
            com.sun.mail.iap.b r1 = e(r1, r7)
            r0.a(r1)
            goto L49
        L42:
            com.sun.mail.iap.b r1 = e(r1, r7)
            r0.h(r1)
        L49:
            int r1 = r6.length
            if (r1 <= r3) goto L66
            r6 = r6[r3]
            boolean r1 = r6 instanceof javax.mail.search.AndTerm
            if (r1 != 0) goto L5f
            boolean r1 = r6 instanceof javax.mail.search.FlagTerm
            if (r1 == 0) goto L57
            goto L5f
        L57:
            com.sun.mail.iap.b r6 = e(r6, r7)
            r0.a(r6)
            return r0
        L5f:
            com.sun.mail.iap.b r6 = e(r6, r7)
            r0.h(r6)
        L66:
            return r0
    }

    private static com.sun.mail.iap.b l(javax.mail.search.DateTerm r4) throws javax.mail.search.SearchException {
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            java.util.Date r1 = r4.getDate()
            java.lang.String r1 = q(r1)
            int r4 = r4.getComparison()
            java.lang.String r2 = " ON "
            switch(r4) {
                case 1: goto L7e;
                case 2: goto L6c;
                case 3: goto L5a;
                case 4: goto L48;
                case 5: goto L36;
                case 6: goto L1e;
                default: goto L16;
            }
        L16:
            javax.mail.search.SearchException r4 = new javax.mail.search.SearchException
            java.lang.String r0 = "Cannot handle Date Comparison"
            r4.<init>(r0)
            throw r4
        L1e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r3 = "OR SINCE "
            r4.<init>(r3)
            r4.append(r1)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.i(r4)
            return r0
        L36:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "SINCE "
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.i(r4)
            return r0
        L48:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "NOT ON "
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.i(r4)
            return r0
        L5a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "ON "
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.i(r4)
            return r0
        L6c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "BEFORE "
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.i(r4)
            return r0
        L7e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r3 = "OR BEFORE "
            r4.<init>(r3)
            r4.append(r1)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.i(r4)
            return r0
    }

    private static com.sun.mail.iap.b m(javax.mail.Message.RecipientType r2, java.lang.String r3, java.lang.String r4) throws javax.mail.search.SearchException, java.io.IOException {
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            javax.mail.Message$RecipientType r1 = javax.mail.Message.RecipientType.TO
            if (r2 != r1) goto Lf
            java.lang.String r2 = "TO"
            r0.i(r2)
            goto L22
        Lf:
            javax.mail.Message$RecipientType r1 = javax.mail.Message.RecipientType.CC
            if (r2 != r1) goto L19
            java.lang.String r2 = "CC"
            r0.i(r2)
            goto L22
        L19:
            javax.mail.Message$RecipientType r1 = javax.mail.Message.RecipientType.BCC
            if (r2 != r1) goto L26
            java.lang.String r2 = "BCC"
            r0.i(r2)
        L22:
            r0.p(r3, r4)
            return r0
        L26:
            javax.mail.search.SearchException r2 = new javax.mail.search.SearchException
            java.lang.String r3 = "Illegal Recipient type"
            r2.<init>(r3)
            throw r2
    }

    private static com.sun.mail.iap.b n(javax.mail.search.DateTerm r4) throws javax.mail.search.SearchException {
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            java.util.Date r1 = r4.getDate()
            java.lang.String r1 = q(r1)
            int r4 = r4.getComparison()
            java.lang.String r2 = " SENTON "
            switch(r4) {
                case 1: goto L7e;
                case 2: goto L6c;
                case 3: goto L5a;
                case 4: goto L48;
                case 5: goto L36;
                case 6: goto L1e;
                default: goto L16;
            }
        L16:
            javax.mail.search.SearchException r4 = new javax.mail.search.SearchException
            java.lang.String r0 = "Cannot handle Date Comparison"
            r4.<init>(r0)
            throw r4
        L1e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r3 = "OR SENTSINCE "
            r4.<init>(r3)
            r4.append(r1)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.i(r4)
            return r0
        L36:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "SENTSINCE "
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.i(r4)
            return r0
        L48:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "NOT SENTON "
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.i(r4)
            return r0
        L5a:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "SENTON "
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.i(r4)
            return r0
        L6c:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "SENTBEFORE "
            r4.<init>(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.i(r4)
            return r0
        L7e:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r3 = "OR SENTBEFORE "
            r4.<init>(r3)
            r4.append(r1)
            r4.append(r2)
            r4.append(r1)
            java.lang.String r4 = r4.toString()
            r0.i(r4)
            return r0
    }

    private static com.sun.mail.iap.b o(javax.mail.search.SizeTerm r3) throws javax.mail.search.SearchException {
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            int r1 = r3.getComparison()
            r2 = 2
            if (r1 == r2) goto L1d
            r2 = 5
            if (r1 != r2) goto L15
            java.lang.String r1 = "LARGER"
            r0.i(r1)
            goto L22
        L15:
            javax.mail.search.SearchException r3 = new javax.mail.search.SearchException
            java.lang.String r0 = "Cannot handle Comparison"
            r3.<init>(r0)
            throw r3
        L1d:
            java.lang.String r1 = "SMALLER"
            r0.i(r1)
        L22:
            int r3 = r3.getNumber()
            r0.m(r3)
            return r0
    }

    private static com.sun.mail.iap.b p(javax.mail.search.SubjectTerm r2, java.lang.String r3) throws javax.mail.search.SearchException, java.io.IOException {
            com.sun.mail.iap.b r0 = new com.sun.mail.iap.b
            r0.<init>()
            java.lang.String r1 = "SUBJECT"
            r0.i(r1)
            java.lang.String r2 = r2.getPattern()
            r0.p(r2, r3)
            return r0
    }

    private static java.lang.String q(java.util.Date r3) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            java.util.Calendar r1 = com.sun.mail.imap.protocol.t.b
            r1.setTime(r3)
            java.util.Calendar r3 = com.sun.mail.imap.protocol.t.b
            r1 = 5
            int r3 = r3.get(r1)
            r0.append(r3)
            java.lang.String r3 = "-"
            r0.append(r3)
            java.lang.String[] r3 = com.sun.mail.imap.protocol.t.a
            java.util.Calendar r1 = com.sun.mail.imap.protocol.t.b
            r2 = 2
            int r1 = r1.get(r2)
            r3 = r3[r1]
            r0.append(r3)
            r3 = 45
            r0.append(r3)
            java.util.Calendar r3 = com.sun.mail.imap.protocol.t.b
            r1 = 1
            int r3 = r3.get(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}

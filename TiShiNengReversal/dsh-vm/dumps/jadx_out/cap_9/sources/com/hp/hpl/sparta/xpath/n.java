package com.hp.hpl.sparta.xpath;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class n {
    public n() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.hp.hpl.sparta.xpath.k a(com.hp.hpl.sparta.xpath.c0 r14, com.hp.hpl.sparta.xpath.s r15) throws com.hp.hpl.sparta.xpath.XPathException, java.io.IOException {
            int r0 = r15.a
            java.lang.String r1 = "right hand side of !="
            java.lang.String r2 = "="
            java.lang.String r3 = "after !"
            java.lang.String r4 = "right hand side of equals"
            r5 = 33
            java.lang.String r6 = "at beginning of expression"
            r7 = 61
            java.lang.String r8 = "quoted string"
            r9 = 39
            r10 = 34
            r11 = -3
            if (r0 == r11) goto Le5
            r12 = -2
            if (r0 == r12) goto Lda
            r13 = 64
            if (r0 != r13) goto Ld2
            int r0 = r15.a()
            if (r0 != r11) goto Lc8
            java.lang.String r0 = r15.c
            int r6 = r15.a()
            if (r6 == r5) goto La0
            java.lang.String r1 = "quoted string or number"
            switch(r6) {
                case 60: goto L7a;
                case 61: goto L5f;
                case 62: goto L39;
                default: goto L33;
            }
        L33:
            com.hp.hpl.sparta.xpath.d r14 = new com.hp.hpl.sparta.xpath.d
            r14.<init>(r0)
            return r14
        L39:
            r15.a()
            int r2 = r15.a
            if (r2 == r10) goto L50
            if (r2 != r9) goto L43
            goto L50
        L43:
            if (r2 != r12) goto L48
            int r14 = r15.b
            goto L56
        L48:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.String r2 = "right hand side of greater-than"
            r0.<init>(r14, r2, r15, r1)
            throw r0
        L50:
            java.lang.String r14 = r15.c
            int r14 = java.lang.Integer.parseInt(r14)
        L56:
            r15.a()
            com.hp.hpl.sparta.xpath.f r15 = new com.hp.hpl.sparta.xpath.f
            r15.<init>(r0, r14)
            return r15
        L5f:
            r15.a()
            int r1 = r15.a
            if (r1 == r10) goto L6f
            if (r1 != r9) goto L69
            goto L6f
        L69:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            r0.<init>(r14, r4, r15, r8)
            throw r0
        L6f:
            java.lang.String r14 = r15.c
            r15.a()
            com.hp.hpl.sparta.xpath.c r15 = new com.hp.hpl.sparta.xpath.c
            r15.<init>(r0, r14)
            return r15
        L7a:
            r15.a()
            int r2 = r15.a
            if (r2 == r10) goto L91
            if (r2 != r9) goto L84
            goto L91
        L84:
            if (r2 != r12) goto L89
            int r14 = r15.b
            goto L97
        L89:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.String r2 = "right hand side of less-than"
            r0.<init>(r14, r2, r15, r1)
            throw r0
        L91:
            java.lang.String r14 = r15.c
            int r14 = java.lang.Integer.parseInt(r14)
        L97:
            r15.a()
            com.hp.hpl.sparta.xpath.g r15 = new com.hp.hpl.sparta.xpath.g
            r15.<init>(r0, r14)
            return r15
        La0:
            r15.a()
            int r4 = r15.a
            if (r4 != r7) goto Lc2
            r15.a()
            int r2 = r15.a
            if (r2 == r10) goto Lb7
            if (r2 != r9) goto Lb1
            goto Lb7
        Lb1:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            r0.<init>(r14, r1, r15, r8)
            throw r0
        Lb7:
            java.lang.String r14 = r15.c
            r15.a()
            com.hp.hpl.sparta.xpath.h r15 = new com.hp.hpl.sparta.xpath.h
            r15.<init>(r0, r14)
            return r15
        Lc2:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            r0.<init>(r14, r3, r15, r2)
            throw r0
        Lc8:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.String r1 = "after @"
            java.lang.String r2 = "name"
            r0.<init>(r14, r1, r15, r2)
            throw r0
        Ld2:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.String r1 = "@, number, or text()"
            r0.<init>(r14, r6, r15, r1)
            throw r0
        Lda:
            int r14 = r15.b
            r15.a()
            com.hp.hpl.sparta.xpath.r r15 = new com.hp.hpl.sparta.xpath.r
            r15.<init>(r14)
            return r15
        Le5:
            java.lang.String r0 = r15.c
            java.lang.String r11 = "text"
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L161
            int r0 = r15.a()
            r6 = 40
            if (r0 != r6) goto L157
            int r0 = r15.a()
            r6 = 41
            if (r0 != r6) goto L14d
            int r0 = r15.a()
            if (r0 == r5) goto L125
            if (r0 == r7) goto L10a
            com.hp.hpl.sparta.xpath.w r14 = com.hp.hpl.sparta.xpath.w.a
            return r14
        L10a:
            r15.a()
            int r0 = r15.a
            if (r0 == r10) goto L11a
            if (r0 != r9) goto L114
            goto L11a
        L114:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            r0.<init>(r14, r4, r15, r8)
            throw r0
        L11a:
            java.lang.String r14 = r15.c
            r15.a()
            com.hp.hpl.sparta.xpath.v r15 = new com.hp.hpl.sparta.xpath.v
            r15.<init>(r14)
            return r15
        L125:
            r15.a()
            int r0 = r15.a
            if (r0 != r7) goto L147
            r15.a()
            int r0 = r15.a
            if (r0 == r10) goto L13c
            if (r0 != r9) goto L136
            goto L13c
        L136:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            r0.<init>(r14, r1, r15, r8)
            throw r0
        L13c:
            java.lang.String r14 = r15.c
            r15.a()
            com.hp.hpl.sparta.xpath.x r15 = new com.hp.hpl.sparta.xpath.x
            r15.<init>(r14)
            return r15
        L147:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            r0.<init>(r14, r3, r15, r2)
            throw r0
        L14d:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.String r1 = "after text("
            java.lang.String r2 = ")"
            r0.<init>(r14, r1, r15, r2)
            throw r0
        L157:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.String r1 = "after text"
            java.lang.String r2 = "("
            r0.<init>(r14, r1, r15, r2)
            throw r0
        L161:
            com.hp.hpl.sparta.xpath.XPathException r0 = new com.hp.hpl.sparta.xpath.XPathException
            java.lang.String r1 = "text()"
            r0.<init>(r14, r6, r15, r1)
            throw r0
    }
}

package com.hp.hpl.sparta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public class ParseException extends java.lang.Exception {
    private java.lang.Throwable cause_;
    private int lineNumber_;

    public ParseException(com.hp.hpl.sparta.l r3, char r4, char r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "got '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "' instead of expected '"
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = "'"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.<init>(r3, r4)
            return
    }

    public ParseException(com.hp.hpl.sparta.l r3, char r4, java.lang.String r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "got '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "' instead of "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = " as expected"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.<init>(r3, r4)
            return
    }

    public ParseException(com.hp.hpl.sparta.l r3, char r4, char[] r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "got '"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "' instead of "
            r0.append(r4)
            java.lang.String r4 = toString(r5)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.<init>(r3, r4)
            return
    }

    public ParseException(com.hp.hpl.sparta.l r8, java.lang.String r9) {
            r7 = this;
            com.hp.hpl.sparta.n r1 = r8.f()
            java.lang.String r2 = r8.getSystemId()
            int r3 = r8.getLineNumber()
            int r4 = r8.e()
            java.lang.String r5 = r8.d()
            r0 = r7
            r6 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6)
            return
    }

    public ParseException(com.hp.hpl.sparta.l r3, java.lang.String r4, java.lang.String r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "got \""
            r0.append(r1)
            r0.append(r4)
            java.lang.String r4 = "\" instead of \""
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = "\" as expected"
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r2.<init>(r3, r4)
            return
    }

    public ParseException(com.hp.hpl.sparta.l r2, java.lang.String r3, char[] r4) {
            r1 = this;
            java.lang.String r0 = new java.lang.String
            r0.<init>(r4)
            r1.<init>(r2, r3, r0)
            return
    }

    public ParseException(com.hp.hpl.sparta.n r7, java.lang.String r8, int r9, int r10, java.lang.String r11, java.lang.String r12) {
            r6 = this;
            r0 = r6
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            r5 = r12
            r0.<init>(r1, r2, r3, r4, r5)
            r7.c(r5, r1, r2)
            return
    }

    public ParseException(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            r1 = -1
            r0.lineNumber_ = r1
            r1 = 0
            r0.cause_ = r1
            return
    }

    public ParseException(java.lang.String r1, int r2, int r3, java.lang.String r4, java.lang.String r5) {
            r0 = this;
            java.lang.String r1 = toMessage(r1, r2, r3, r4, r5)
            r0.<init>(r1)
            r1 = 0
            r0.cause_ = r1
            r0.lineNumber_ = r2
            return
    }

    public ParseException(java.lang.String r2, java.lang.Throwable r3) {
            r1 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r2)
            java.lang.String r2 = " "
            r0.append(r2)
            r0.append(r3)
            java.lang.String r2 = r0.toString()
            r1.<init>(r2)
            r2 = -1
            r1.lineNumber_ = r2
            r1.cause_ = r3
            return
    }

    static java.lang.String charRepr(int r2) {
            r0 = -1
            if (r2 != r0) goto L6
            java.lang.String r2 = "EOF"
            return r2
        L6:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = ""
            r0.append(r1)
            char r2 = (char) r2
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    private static java.lang.String toMessage(java.lang.String r1, int r2, int r3, java.lang.String r4, java.lang.String r5) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r1)
            java.lang.String r1 = "("
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "): \n"
            r0.append(r1)
            r0.append(r4)
            java.lang.String r1 = "\nLast character read was '"
            r0.append(r1)
            java.lang.String r1 = charRepr(r3)
            r0.append(r1)
            java.lang.String r1 = "'\n"
            r0.append(r1)
            r0.append(r5)
            java.lang.String r1 = r0.toString()
            return r1
    }

    private static java.lang.String toString(char[] r4) {
            java.lang.StringBuffer r0 = new java.lang.StringBuffer
            r0.<init>()
            r1 = 0
            char r1 = r4[r1]
            r0.append(r1)
            r1 = 1
        Lc:
            int r2 = r4.length
            if (r1 >= r2) goto L28
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "or "
            r2.append(r3)
            char r3 = r4[r1]
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            int r1 = r1 + 1
            goto Lc
        L28:
            java.lang.String r4 = r0.toString()
            return r4
    }

    @Override // java.lang.Throwable
    public java.lang.Throwable getCause() {
            r1 = this;
            java.lang.Throwable r0 = r1.cause_
            return r0
    }

    public int getLineNumber() {
            r1 = this;
            int r0 = r1.lineNumber_
            return r0
    }
}

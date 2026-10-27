package com.sun.mail.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class TraceOutputStream extends java.io.FilterOutputStream {
    private boolean quote;
    private boolean trace;
    private java.io.OutputStream traceOut;

    public TraceOutputStream(java.io.OutputStream r1, java.io.OutputStream r2) {
            r0 = this;
            r0.<init>(r1)
            r1 = 0
            r0.trace = r1
            r0.quote = r1
            r0.traceOut = r2
            return
    }

    private final void writeByte(int r4) throws java.io.IOException {
            r3 = this;
            r0 = r4 & 255(0xff, float:3.57E-43)
            r1 = 127(0x7f, float:1.78E-43)
            if (r0 <= r1) goto L16
            java.io.OutputStream r0 = r3.traceOut
            r2 = 77
            r0.write(r2)
            java.io.OutputStream r0 = r3.traceOut
            r2 = 45
            r0.write(r2)
            r0 = r4 & 127(0x7f, float:1.78E-43)
        L16:
            r4 = 13
            r1 = 92
            if (r0 != r4) goto L29
            java.io.OutputStream r4 = r3.traceOut
            r4.write(r1)
            java.io.OutputStream r4 = r3.traceOut
            r0 = 114(0x72, float:1.6E-43)
            r4.write(r0)
            return
        L29:
            r4 = 10
            if (r0 != r4) goto L3f
            java.io.OutputStream r0 = r3.traceOut
            r0.write(r1)
            java.io.OutputStream r0 = r3.traceOut
            r1 = 110(0x6e, float:1.54E-43)
            r0.write(r1)
            java.io.OutputStream r0 = r3.traceOut
            r0.write(r4)
            return
        L3f:
            r4 = 9
            if (r0 != r4) goto L50
            java.io.OutputStream r4 = r3.traceOut
            r4.write(r1)
            java.io.OutputStream r4 = r3.traceOut
            r0 = 116(0x74, float:1.63E-43)
            r4.write(r0)
            return
        L50:
            r4 = 32
            if (r0 >= r4) goto L63
            java.io.OutputStream r4 = r3.traceOut
            r1 = 94
            r4.write(r1)
            java.io.OutputStream r4 = r3.traceOut
            int r0 = r0 + 64
            r4.write(r0)
            return
        L63:
            java.io.OutputStream r4 = r3.traceOut
            r4.write(r0)
            return
    }

    public void setQuote(boolean r1) {
            r0 = this;
            r0.quote = r1
            return
    }

    public void setTrace(boolean r1) {
            r0 = this;
            r0.trace = r1
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int r2) throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.trace
            if (r0 == 0) goto L11
            boolean r0 = r1.quote
            if (r0 == 0) goto Lc
            r1.writeByte(r2)
            goto L11
        Lc:
            java.io.OutputStream r0 = r1.traceOut
            r0.write(r2)
        L11:
            java.io.OutputStream r0 = r1.out
            r0.write(r2)
            return
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] r3, int r4, int r5) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.trace
            if (r0 == 0) goto L1b
            boolean r0 = r2.quote
            if (r0 == 0) goto L16
            r0 = 0
        L9:
            if (r0 < r5) goto Lc
            goto L1b
        Lc:
            int r1 = r4 + r0
            r1 = r3[r1]
            r2.writeByte(r1)
            int r0 = r0 + 1
            goto L9
        L16:
            java.io.OutputStream r0 = r2.traceOut
            r0.write(r3, r4, r5)
        L1b:
            java.io.OutputStream r0 = r2.out
            r0.write(r3, r4, r5)
            return
    }
}

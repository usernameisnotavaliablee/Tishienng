package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class LineReader {
    private final char[] buf;
    private final java.nio.CharBuffer cbuf;
    private final com.google.common.io.LineBuffer lineBuf;
    private final java.util.Queue<java.lang.String> lines;
    private final java.lang.Readable readable;

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private final java.io.Reader reader;


    public LineReader(java.lang.Readable r2) {
            r1 = this;
            r1.<init>()
            java.nio.CharBuffer r0 = com.google.common.io.CharStreams.createBuffer()
            r1.cbuf = r0
            char[] r0 = r0.array()
            r1.buf = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.lines = r0
            com.google.common.io.LineReader$1 r0 = new com.google.common.io.LineReader$1
            r0.<init>(r1)
            r1.lineBuf = r0
            java.lang.Object r0 = com.google.common.base.Preconditions.checkNotNull(r2)
            java.lang.Readable r0 = (java.lang.Readable) r0
            r1.readable = r0
            boolean r0 = r2 instanceof java.io.Reader
            if (r0 == 0) goto L2c
            java.io.Reader r2 = (java.io.Reader) r2
            goto L2d
        L2c:
            r2 = 0
        L2d:
            r1.reader = r2
            return
    }

    static /* synthetic */ java.util.Queue access$000(com.google.common.io.LineReader r0) {
            java.util.Queue<java.lang.String> r0 = r0.lines
            return r0
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public java.lang.String readLine() throws java.io.IOException {
            r4 = this;
        L0:
            java.util.Queue<java.lang.String> r0 = r4.lines
            java.lang.Object r0 = r0.peek()
            if (r0 != 0) goto L33
            java.nio.CharBuffer r0 = r4.cbuf
            r0.clear()
            java.io.Reader r0 = r4.reader
            r1 = 0
            if (r0 == 0) goto L1a
            char[] r2 = r4.buf
            int r3 = r2.length
            int r0 = r0.read(r2, r1, r3)
            goto L22
        L1a:
            java.lang.Readable r0 = r4.readable
            java.nio.CharBuffer r2 = r4.cbuf
            int r0 = r0.read(r2)
        L22:
            r2 = -1
            if (r0 != r2) goto L2b
            com.google.common.io.LineBuffer r0 = r4.lineBuf
            r0.finish()
            goto L33
        L2b:
            com.google.common.io.LineBuffer r2 = r4.lineBuf
            char[] r3 = r4.buf
            r2.add(r3, r1, r0)
            goto L0
        L33:
            java.util.Queue<java.lang.String> r0 = r4.lines
            java.lang.Object r0 = r0.poll()
            java.lang.String r0 = (java.lang.String) r0
            return r0
    }
}

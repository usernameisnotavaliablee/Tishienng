package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
abstract class LineBuffer {
    private java.lang.StringBuilder line;
    private boolean sawReturn;

    LineBuffer() {
            r1 = this;
            r1.<init>()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1.line = r0
            return
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    private boolean finishLine(boolean r3) throws java.io.IOException {
            r2 = this;
            boolean r0 = r2.sawReturn
            if (r0 == 0) goto Lc
            if (r3 == 0) goto L9
            java.lang.String r0 = "\r\n"
            goto L13
        L9:
            java.lang.String r0 = "\r"
            goto L13
        Lc:
            if (r3 == 0) goto L11
            java.lang.String r0 = "\n"
            goto L13
        L11:
            java.lang.String r0 = ""
        L13:
            java.lang.StringBuilder r1 = r2.line
            java.lang.String r1 = r1.toString()
            r2.handleLine(r1, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r2.line = r0
            r0 = 0
            r2.sawReturn = r0
            return r3
    }

    protected void add(char[] r7, int r8, int r9) throws java.io.IOException {
            r6 = this;
            boolean r0 = r6.sawReturn
            r1 = 0
            r2 = 10
            r3 = 1
            if (r0 == 0) goto L1a
            if (r9 <= 0) goto L1a
            char r0 = r7[r8]
            if (r0 != r2) goto L10
            r0 = 1
            goto L11
        L10:
            r0 = 0
        L11:
            boolean r0 = r6.finishLine(r0)
            if (r0 == 0) goto L1a
            int r0 = r8 + 1
            goto L1b
        L1a:
            r0 = r8
        L1b:
            int r8 = r8 + r9
            r9 = r0
        L1d:
            if (r0 >= r8) goto L53
            char r4 = r7[r0]
            if (r4 == r2) goto L46
            r5 = 13
            if (r4 == r5) goto L28
            goto L51
        L28:
            java.lang.StringBuilder r4 = r6.line
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.sawReturn = r3
            int r9 = r0 + 1
            if (r9 >= r8) goto L43
            char r4 = r7[r9]
            if (r4 != r2) goto L3b
            r4 = 1
            goto L3c
        L3b:
            r4 = 0
        L3c:
            boolean r4 = r6.finishLine(r4)
            if (r4 == 0) goto L43
            r0 = r9
        L43:
            int r9 = r0 + 1
            goto L51
        L46:
            java.lang.StringBuilder r4 = r6.line
            int r5 = r0 - r9
            r4.append(r7, r9, r5)
            r6.finishLine(r3)
            goto L43
        L51:
            int r0 = r0 + r3
            goto L1d
        L53:
            java.lang.StringBuilder r0 = r6.line
            int r8 = r8 - r9
            r0.append(r7, r9, r8)
            return
    }

    protected void finish() throws java.io.IOException {
            r1 = this;
            boolean r0 = r1.sawReturn
            if (r0 != 0) goto Le
            java.lang.StringBuilder r0 = r1.line
            int r0 = r0.length()
            if (r0 <= 0) goto Ld
            goto Le
        Ld:
            return
        Le:
            r0 = 0
            r1.finishLine(r0)
            return
    }

    protected abstract void handleLine(java.lang.String r1, java.lang.String r2) throws java.io.IOException;
}

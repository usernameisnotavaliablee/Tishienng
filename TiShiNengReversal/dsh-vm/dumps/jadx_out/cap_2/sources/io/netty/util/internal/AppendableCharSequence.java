package io.netty.util.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class AppendableCharSequence implements java.lang.CharSequence, java.lang.Appendable {
    private char[] chars;
    private int pos;

    public AppendableCharSequence(int r4) {
            r3 = this;
            r3.<init>()
            r0 = 1
            if (r4 < r0) goto Lb
            char[] r4 = new char[r4]
            r3.chars = r4
            return
        Lb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "length: "
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = " (length: >= 1)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private AppendableCharSequence(char[] r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4.length
            r1 = 1
            if (r0 < r1) goto Ld
            r3.chars = r4
            int r4 = r4.length
            r3.pos = r4
            return
        Ld:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "length: "
            r1.append(r2)
            int r4 = r4.length
            r1.append(r4)
            java.lang.String r4 = " (length: >= 1)"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    private static char[] expand(char[] r1, int r2, int r3) {
            int r0 = r1.length
        L1:
            int r0 = r0 << 1
            if (r0 < 0) goto Le
            if (r2 > r0) goto L1
            char[] r2 = new char[r0]
            r0 = 0
            java.lang.System.arraycopy(r1, r0, r2, r0, r3)
            return r2
        Le:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>()
            throw r1
    }

    @Override // java.lang.Appendable
    public io.netty.util.internal.AppendableCharSequence append(char r5) {
            r4 = this;
            int r0 = r4.pos
            char[] r1 = r4.chars
            int r2 = r1.length
            if (r0 != r2) goto L13
            int r0 = r1.length
            int r0 = r0 << 1
            char[] r0 = new char[r0]
            r4.chars = r0
            int r2 = r1.length
            r3 = 0
            java.lang.System.arraycopy(r1, r3, r0, r3, r2)
        L13:
            char[] r0 = r4.chars
            int r1 = r4.pos
            int r2 = r1 + 1
            r4.pos = r2
            r0[r1] = r5
            return r4
    }

    @Override // java.lang.Appendable
    public io.netty.util.internal.AppendableCharSequence append(java.lang.CharSequence r3) {
            r2 = this;
            r0 = 0
            int r1 = r3.length()
            io.netty.util.internal.AppendableCharSequence r3 = r2.append(r3, r0, r1)
            return r3
    }

    @Override // java.lang.Appendable
    public io.netty.util.internal.AppendableCharSequence append(java.lang.CharSequence r5, int r6, int r7) {
            r4 = this;
            int r0 = r5.length()
            if (r0 < r7) goto L41
            int r0 = r7 - r6
            char[] r1 = r4.chars
            int r2 = r1.length
            int r3 = r4.pos
            int r2 = r2 - r3
            if (r0 <= r2) goto L18
            int r2 = r3 + r0
            char[] r1 = expand(r1, r2, r3)
            r4.chars = r1
        L18:
            boolean r1 = r5 instanceof io.netty.util.internal.AppendableCharSequence
            if (r1 == 0) goto L2d
            io.netty.util.internal.AppendableCharSequence r5 = (io.netty.util.internal.AppendableCharSequence) r5
            char[] r5 = r5.chars
            char[] r7 = r4.chars
            int r1 = r4.pos
            java.lang.System.arraycopy(r5, r6, r7, r1, r0)
            int r5 = r4.pos
            int r5 = r5 + r0
            r4.pos = r5
            return r4
        L2d:
            if (r6 >= r7) goto L40
            char[] r0 = r4.chars
            int r1 = r4.pos
            int r2 = r1 + 1
            r4.pos = r2
            char r2 = r5.charAt(r6)
            r0[r1] = r2
            int r6 = r6 + 1
            goto L2d
        L40:
            return r4
        L41:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            r5.<init>()
            throw r5
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(char r1) throws java.io.IOException {
            r0 = this;
            io.netty.util.internal.AppendableCharSequence r1 = r0.append(r1)
            return r1
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1) throws java.io.IOException {
            r0 = this;
            io.netty.util.internal.AppendableCharSequence r1 = r0.append(r1)
            return r1
    }

    @Override // java.lang.Appendable
    public /* bridge */ /* synthetic */ java.lang.Appendable append(java.lang.CharSequence r1, int r2, int r3) throws java.io.IOException {
            r0 = this;
            io.netty.util.internal.AppendableCharSequence r1 = r0.append(r1, r2, r3)
            return r1
    }

    @Override // java.lang.CharSequence
    public char charAt(int r2) {
            r1 = this;
            int r0 = r1.pos
            if (r2 > r0) goto L9
            char[] r0 = r1.chars
            char r2 = r0[r2]
            return r2
        L9:
            java.lang.IndexOutOfBoundsException r2 = new java.lang.IndexOutOfBoundsException
            r2.<init>()
            throw r2
    }

    public char charAtUnsafe(int r2) {
            r1 = this;
            char[] r0 = r1.chars
            char r2 = r0[r2]
            return r2
    }

    @Override // java.lang.CharSequence
    public int length() {
            r1 = this;
            int r0 = r1.pos
            return r0
    }

    public void reset() {
            r1 = this;
            r0 = 0
            r1.pos = r0
            return
    }

    @Override // java.lang.CharSequence
    public io.netty.util.internal.AppendableCharSequence subSequence(int r3, int r4) {
            r2 = this;
            if (r3 != r4) goto L11
            io.netty.util.internal.AppendableCharSequence r3 = new io.netty.util.internal.AppendableCharSequence
            char[] r4 = r2.chars
            int r4 = r4.length
            r0 = 16
            int r4 = java.lang.Math.min(r0, r4)
            r3.<init>(r4)
            return r3
        L11:
            io.netty.util.internal.AppendableCharSequence r0 = new io.netty.util.internal.AppendableCharSequence
            char[] r1 = r2.chars
            char[] r3 = java.util.Arrays.copyOfRange(r1, r3, r4)
            r0.<init>(r3)
            return r0
    }

    @Override // java.lang.CharSequence
    public /* bridge */ /* synthetic */ java.lang.CharSequence subSequence(int r1, int r2) {
            r0 = this;
            io.netty.util.internal.AppendableCharSequence r1 = r0.subSequence(r1, r2)
            return r1
    }

    public java.lang.String subStringUnsafe(int r3, int r4) {
            r2 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.chars
            int r4 = r4 - r3
            r0.<init>(r1, r3, r4)
            return r0
    }

    public java.lang.String substring(int r3, int r4) {
            r2 = this;
            int r4 = r4 - r3
            int r0 = r2.pos
            if (r3 > r0) goto Lf
            if (r4 > r0) goto Lf
            java.lang.String r0 = new java.lang.String
            char[] r1 = r2.chars
            r0.<init>(r1, r3, r4)
            return r0
        Lf:
            java.lang.IndexOutOfBoundsException r3 = new java.lang.IndexOutOfBoundsException
            r3.<init>()
            throw r3
    }

    @Override // java.lang.CharSequence
    public java.lang.String toString() {
            r4 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r4.chars
            r2 = 0
            int r3 = r4.pos
            r0.<init>(r1, r2, r3)
            return r0
    }
}

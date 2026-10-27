package org.apache.harmony.awt.datatransfer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class TextFlavor {
    public static final java.lang.Class[] charsetTextClasses = null;
    public static final java.lang.Class[] unicodeTextClasses = null;

    static {
            r0 = 4
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<java.lang.String> r2 = java.lang.String.class
            r0[r1] = r2
            r2 = 1
            java.lang.Class<java.io.Reader> r3 = java.io.Reader.class
            r0[r2] = r3
            r3 = 2
            java.lang.Class<java.nio.CharBuffer> r4 = java.nio.CharBuffer.class
            r0[r3] = r4
            r4 = 3
            java.lang.Class<char[]> r5 = char[].class
            r0[r4] = r5
            org.apache.harmony.awt.datatransfer.TextFlavor.unicodeTextClasses = r0
            java.lang.Class[] r0 = new java.lang.Class[r4]
            java.lang.Class<java.io.InputStream> r4 = java.io.InputStream.class
            r0[r1] = r4
            java.lang.Class<java.nio.ByteBuffer> r1 = java.nio.ByteBuffer.class
            r0[r2] = r1
            java.lang.Class<byte[]> r1 = byte[].class
            r0[r3] = r1
            org.apache.harmony.awt.datatransfer.TextFlavor.charsetTextClasses = r0
            return
    }

    public TextFlavor() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addCharsetClasses(java.awt.datatransfer.SystemFlavorMap r6, java.lang.String r7, java.lang.String r8, java.lang.String r9) {
            r0 = 0
        L1:
            java.lang.Class[] r1 = org.apache.harmony.awt.datatransfer.TextFlavor.charsetTextClasses
            int r2 = r1.length
            if (r0 < r2) goto L7
            return
        L7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "text/"
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ";class=\""
            r3.<init>(r4)
            r1 = r1[r0]
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            java.lang.String r1 = "\""
            r3.append(r1)
            java.lang.String r4 = ";charset=\""
            r3.append(r4)
            r3.append(r9)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.awt.datatransfer.DataFlavor r3 = new java.awt.datatransfer.DataFlavor
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r2)
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r2)
            r6.addFlavorForUnencodedNative(r7, r3)
            r6.addUnencodedNativeForFlavor(r3, r7)
            int r0 = r0 + 1
            goto L1
    }

    public static void addUnicodeClasses(java.awt.datatransfer.SystemFlavorMap r6, java.lang.String r7, java.lang.String r8) {
            r0 = 0
        L1:
            java.lang.Class[] r1 = org.apache.harmony.awt.datatransfer.TextFlavor.unicodeTextClasses
            int r2 = r1.length
            if (r0 < r2) goto L7
            return
        L7:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "text/"
            r2.<init>(r3)
            r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = ";class=\""
            r3.<init>(r4)
            r1 = r1[r0]
            java.lang.String r1 = r1.getName()
            r3.append(r1)
            java.lang.String r1 = "\""
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            java.awt.datatransfer.DataFlavor r3 = new java.awt.datatransfer.DataFlavor
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = java.lang.String.valueOf(r2)
            r4.<init>(r5)
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r3.<init>(r1, r2)
            r6.addFlavorForUnencodedNative(r7, r3)
            r6.addUnencodedNativeForFlavor(r3, r7)
            int r0 = r0 + 1
            goto L1
    }
}

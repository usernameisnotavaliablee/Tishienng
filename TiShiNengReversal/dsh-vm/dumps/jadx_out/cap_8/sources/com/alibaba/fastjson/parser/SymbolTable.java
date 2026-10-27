package com.alibaba.fastjson.parser;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class SymbolTable {
    private final int indexMask;
    private final java.lang.String[] symbols;

    public SymbolTable(int r4) {
            r3 = this;
            r3.<init>()
            int r0 = r4 + (-1)
            r3.indexMask = r0
            java.lang.String[] r4 = new java.lang.String[r4]
            r3.symbols = r4
            r4 = 4
            r0 = 1185263(0x1215ef, float:1.660907E-39)
            java.lang.String r1 = "$ref"
            r2 = 0
            r3.addSymbol(r1, r2, r4, r0)
            java.lang.String r4 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY
            int r0 = r4.length()
            java.lang.String r1 = com.alibaba.fastjson.JSON.DEFAULT_TYPE_KEY
            int r1 = r1.hashCode()
            r3.addSymbol(r4, r2, r0, r1)
            return
    }

    public static int hash(char[] r3, int r4, int r5) {
            r0 = 0
            r1 = 0
        L2:
            if (r0 >= r5) goto Lf
            int r1 = r1 * 31
            int r2 = r4 + 1
            char r4 = r3[r4]
            int r1 = r1 + r4
            int r0 = r0 + 1
            r4 = r2
            goto L2
        Lf:
            return r1
    }

    private static java.lang.String subString(java.lang.String r2, int r3, int r4) {
            char[] r0 = new char[r4]
            int r4 = r4 + r3
            r1 = 0
            r2.getChars(r3, r4, r0, r1)
            java.lang.String r2 = new java.lang.String
            r2.<init>(r0)
            return r2
    }

    public java.lang.String addSymbol(java.lang.String r3, int r4, int r5, int r6) {
            r2 = this;
            int r0 = r2.indexMask
            r0 = r0 & r6
            java.lang.String[] r1 = r2.symbols
            r1 = r1[r0]
            if (r1 == 0) goto L21
            int r0 = r1.hashCode()
            if (r6 != r0) goto L1c
            int r6 = r1.length()
            if (r5 != r6) goto L1c
            boolean r6 = r3.startsWith(r1, r4)
            if (r6 == 0) goto L1c
            return r1
        L1c:
            java.lang.String r3 = subString(r3, r4, r5)
            return r3
        L21:
            int r6 = r3.length()
            if (r5 != r6) goto L28
            goto L2c
        L28:
            java.lang.String r3 = subString(r3, r4, r5)
        L2c:
            java.lang.String r3 = r3.intern()
            java.lang.String[] r4 = r2.symbols
            r4[r0] = r3
            return r3
    }

    public java.lang.String addSymbol(char[] r2, int r3, int r4) {
            r1 = this;
            int r0 = hash(r2, r3, r4)
            java.lang.String r2 = r1.addSymbol(r2, r3, r4, r0)
            return r2
    }

    public java.lang.String addSymbol(char[] r4, int r5, int r6, int r7) {
            r3 = this;
            int r0 = r3.indexMask
            r0 = r0 & r7
            java.lang.String[] r1 = r3.symbols
            r1 = r1[r0]
            if (r1 == 0) goto L2d
            int r0 = r1.hashCode()
            if (r7 != r0) goto L27
            int r7 = r1.length()
            if (r6 != r7) goto L27
            r7 = 0
        L16:
            if (r7 >= r6) goto L26
            int r0 = r5 + r7
            char r0 = r4[r0]
            char r2 = r1.charAt(r7)
            if (r0 == r2) goto L23
            goto L27
        L23:
            int r7 = r7 + 1
            goto L16
        L26:
            return r1
        L27:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r4, r5, r6)
            return r7
        L2d:
            java.lang.String r7 = new java.lang.String
            r7.<init>(r4, r5, r6)
            java.lang.String r4 = r7.intern()
            java.lang.String[] r5 = r3.symbols
            r5[r0] = r4
            return r4
    }
}

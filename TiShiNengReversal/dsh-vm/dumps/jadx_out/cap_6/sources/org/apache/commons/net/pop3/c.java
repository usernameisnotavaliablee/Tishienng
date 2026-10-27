package org.apache.commons.net.pop3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class c {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    public static final int f = 5;
    public static final int g = 6;
    public static final int h = 7;
    public static final int i = 8;
    public static final int j = 9;
    public static final int k = 10;
    public static final int l = 11;
    public static final int m = 12;
    public static final int n = 13;
    private static final int o = 14;
    static final java.lang.String[] p = null;

    static {
            java.lang.String r12 = "CAPA"
            java.lang.String r13 = "AUTH"
            java.lang.String r0 = "USER"
            java.lang.String r1 = "PASS"
            java.lang.String r2 = "QUIT"
            java.lang.String r3 = "STAT"
            java.lang.String r4 = "LIST"
            java.lang.String r5 = "RETR"
            java.lang.String r6 = "DELE"
            java.lang.String r7 = "NOOP"
            java.lang.String r8 = "RSET"
            java.lang.String r9 = "APOP"
            java.lang.String r10 = "TOP"
            java.lang.String r11 = "UIDL"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13}
            org.apache.commons.net.pop3.c.p = r0
            int r0 = r0.length
            r1 = 14
            if (r0 != r1) goto L28
            return
        L28:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Error in array definition"
            r0.<init>(r1)
            throw r0
    }

    private c() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.lang.String a(int r1) {
            java.lang.String[] r0 = org.apache.commons.net.pop3.c.p
            r1 = r0[r1]
            return r1
    }
}

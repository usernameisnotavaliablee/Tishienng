package org.apache.commons.net.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class d {
    public static final int A = 8;
    public static final int B = 9;
    public static final int C = 13;
    private static final java.lang.String[] D = null;
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
    public static final int o = 14;
    public static final int p = 15;

    /* renamed from: q, reason: collision with root package name */
    private static final int f59q = 16;
    public static final int r = 0;
    public static final int s = 0;
    public static final int t = 1;
    public static final int u = 2;
    public static final int v = 3;
    public static final int w = 4;
    public static final int x = 5;
    public static final int y = 6;
    public static final int z = 7;

    static {
            java.lang.String r15 = "AUTH"
            java.lang.String r16 = "EHLO"
            java.lang.String r1 = "HELO"
            java.lang.String r2 = "MAIL FROM:"
            java.lang.String r3 = "RCPT TO:"
            java.lang.String r4 = "DATA"
            java.lang.String r5 = "SEND FROM:"
            java.lang.String r6 = "SOML FROM:"
            java.lang.String r7 = "SAML FROM:"
            java.lang.String r8 = "RSET"
            java.lang.String r9 = "VRFY"
            java.lang.String r10 = "EXPN"
            java.lang.String r11 = "HELP"
            java.lang.String r12 = "NOOP"
            java.lang.String r13 = "TURN"
            java.lang.String r14 = "QUIT"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16}
            org.apache.commons.net.smtp.d.D = r0
            int r0 = r0.length
            r1 = 16
            if (r0 != r1) goto L2c
            return
        L2c:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Error in array definition"
            r0.<init>(r1)
            throw r0
    }

    private d() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.lang.String a(int r1) {
            java.lang.String[] r0 = org.apache.commons.net.smtp.d.D
            r1 = r0[r1]
            return r1
    }
}

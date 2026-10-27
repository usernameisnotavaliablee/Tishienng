package org.apache.commons.net.telnet;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class f {
    public static final int a = 255;
    public static final int b = 255;
    public static final int c = 254;
    public static final int d = 253;
    public static final int e = 252;
    public static final int f = 251;
    public static final int g = 250;
    public static final int h = 249;
    public static final int i = 248;
    public static final int j = 247;
    public static final int k = 246;
    public static final int l = 245;
    public static final int m = 244;
    public static final int n = 243;
    public static final int o = 242;
    public static final int p = 241;

    /* renamed from: q, reason: collision with root package name */
    public static final int f61q = 240;
    public static final int r = 239;
    public static final int s = 238;
    public static final int t = 237;
    public static final int u = 236;
    public static final int v = 242;
    private static final java.lang.String[] w = null;
    private static final int x = 255;
    private static final int y = 236;

    static {
            java.lang.String r19 = "SUSP"
            java.lang.String r20 = "EOF"
            java.lang.String r1 = "IAC"
            java.lang.String r2 = "DONT"
            java.lang.String r3 = "DO"
            java.lang.String r4 = "WONT"
            java.lang.String r5 = "WILL"
            java.lang.String r6 = "SB"
            java.lang.String r7 = "GA"
            java.lang.String r8 = "EL"
            java.lang.String r9 = "EC"
            java.lang.String r10 = "AYT"
            java.lang.String r11 = "AO"
            java.lang.String r12 = "IP"
            java.lang.String r13 = "BRK"
            java.lang.String r14 = "DMARK"
            java.lang.String r15 = "NOP"
            java.lang.String r16 = "SE"
            java.lang.String r17 = "EOR"
            java.lang.String r18 = "ABORT"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20}
            org.apache.commons.net.telnet.f.w = r0
            return
    }

    private f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static final java.lang.String a(int r1) {
            java.lang.String[] r0 = org.apache.commons.net.telnet.f.w
            int r1 = 255 - r1
            r1 = r0[r1]
            return r1
    }

    public static final boolean b(int r1) {
            r0 = 255(0xff, float:3.57E-43)
            if (r1 > r0) goto La
            r0 = 236(0xec, float:3.31E-43)
            if (r1 < r0) goto La
            r1 = 1
            return r1
        La:
            r1 = 0
            return r1
    }
}

package org.apache.commons.net.ftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@java.lang.Deprecated
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class e {
    public static final int A = 26;
    public static final int B = 27;
    public static final int C = 28;
    public static final int D = 29;
    public static final int E = 30;
    public static final int F = 31;
    public static final int G = 32;
    public static final int H = 33;
    public static final int I = 34;
    public static final int J = 35;
    public static final int K = 36;
    public static final int L = 37;
    public static final int M = 38;
    public static final int N = 39;
    private static final int O = 39;
    public static final int P = 0;
    public static final int Q = 1;
    public static final int R = 2;
    public static final int S = 3;
    public static final int T = 4;
    public static final int U = 5;
    public static final int V = 6;
    public static final int W = 7;
    public static final int X = 8;
    public static final int Y = 9;
    public static final int Z = 10;
    public static final int a = 0;
    public static final int a0 = 11;
    public static final int b = 1;
    public static final int b0 = 12;
    public static final int c = 2;
    public static final int c0 = 13;
    public static final int d = 3;
    public static final int d0 = 14;
    public static final int e = 4;
    public static final int e0 = 15;
    public static final int f = 5;
    public static final int f0 = 16;
    public static final int g = 6;
    public static final int g0 = 17;
    public static final int h = 7;
    public static final int h0 = 18;
    public static final int i = 8;
    public static final int i0 = 19;
    public static final int j = 9;
    public static final int j0 = 20;
    public static final int k = 10;
    public static final int k0 = 21;
    public static final int l = 11;
    public static final int l0 = 22;
    public static final int m = 12;
    public static final int m0 = 23;
    public static final int n = 13;
    public static final int n0 = 24;
    public static final int o = 14;
    public static final int o0 = 25;
    public static final int p = 15;
    public static final int p0 = 27;

    /* renamed from: q, reason: collision with root package name */
    public static final int f51q = 16;
    public static final int q0 = 28;
    public static final int r = 17;
    public static final int r0 = 29;
    public static final int s = 18;
    public static final int s0 = 30;
    public static final int t = 19;
    public static final int t0 = 33;
    public static final int u = 20;
    public static final int u0 = 34;
    public static final int v = 21;
    public static final int v0 = 33;
    public static final int w = 22;
    public static final int w0 = 35;
    public static final int x = 23;
    private static final java.lang.String[] x0 = null;
    public static final int y = 24;
    public static final int z = 25;

    static {
            java.lang.String r39 = "MLSD"
            java.lang.String r40 = "MLST"
            java.lang.String r1 = "USER"
            java.lang.String r2 = "PASS"
            java.lang.String r3 = "ACCT"
            java.lang.String r4 = "CWD"
            java.lang.String r5 = "CDUP"
            java.lang.String r6 = "SMNT"
            java.lang.String r7 = "REIN"
            java.lang.String r8 = "QUIT"
            java.lang.String r9 = "PORT"
            java.lang.String r10 = "PASV"
            java.lang.String r11 = "TYPE"
            java.lang.String r12 = "STRU"
            java.lang.String r13 = "MODE"
            java.lang.String r14 = "RETR"
            java.lang.String r15 = "STOR"
            java.lang.String r16 = "STOU"
            java.lang.String r17 = "APPE"
            java.lang.String r18 = "ALLO"
            java.lang.String r19 = "REST"
            java.lang.String r20 = "RNFR"
            java.lang.String r21 = "RNTO"
            java.lang.String r22 = "ABOR"
            java.lang.String r23 = "DELE"
            java.lang.String r24 = "RMD"
            java.lang.String r25 = "MKD"
            java.lang.String r26 = "PWD"
            java.lang.String r27 = "LIST"
            java.lang.String r28 = "NLST"
            java.lang.String r29 = "SITE"
            java.lang.String r30 = "SYST"
            java.lang.String r31 = "STAT"
            java.lang.String r32 = "HELP"
            java.lang.String r33 = "NOOP"
            java.lang.String r34 = "MDTM"
            java.lang.String r35 = "FEAT"
            java.lang.String r36 = "MFMT"
            java.lang.String r37 = "EPSV"
            java.lang.String r38 = "EPRT"
            java.lang.String[] r0 = new java.lang.String[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40}
            org.apache.commons.net.ftp.e.x0 = r0
            return
    }

    private e() {
            r0 = this;
            r0.<init>()
            return
    }

    static void a() {
            java.lang.String[] r0 = org.apache.commons.net.ftp.e.x0
            int r1 = r0.length
            r2 = 40
            if (r1 != r2) goto L8
            return
        L8:
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Incorrect _commands array. Should have length "
            r3.append(r4)
            r3.append(r2)
            java.lang.String r2 = " found "
            r3.append(r2)
            int r0 = r0.length
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r1.<init>(r0)
            throw r1
    }

    public static final java.lang.String b(int r1) {
            java.lang.String[] r0 = org.apache.commons.net.ftp.e.x0
            r1 = r0[r1]
            return r1
    }
}

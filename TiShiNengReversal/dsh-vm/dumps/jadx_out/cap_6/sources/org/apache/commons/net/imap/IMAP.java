package org.apache.commons.net.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class IMAP extends org.apache.commons.net.g {
    public static final int B = 143;
    protected static final java.lang.String C = "ISO-8859-1";
    public static final org.apache.commons.net.imap.IMAP.b D = null;
    private final char[] A;
    private org.apache.commons.net.imap.IMAP.IMAPState u;
    protected java.io.BufferedWriter v;
    protected java.io.BufferedReader w;
    private int x;
    private final java.util.List<java.lang.String> y;
    private volatile org.apache.commons.net.imap.IMAP.b z;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum IMAPState extends java.lang.Enum<org.apache.commons.net.imap.IMAP.IMAPState> {
        private static final /* synthetic */ org.apache.commons.net.imap.IMAP.IMAPState[] $VALUES = null;
        public static final org.apache.commons.net.imap.IMAP.IMAPState AUTH_STATE = null;
        public static final org.apache.commons.net.imap.IMAP.IMAPState DISCONNECTED_STATE = null;
        public static final org.apache.commons.net.imap.IMAP.IMAPState LOGOUT_STATE = null;
        public static final org.apache.commons.net.imap.IMAP.IMAPState NOT_AUTH_STATE = null;

        static {
                org.apache.commons.net.imap.IMAP$IMAPState r0 = new org.apache.commons.net.imap.IMAP$IMAPState
                java.lang.String r1 = "DISCONNECTED_STATE"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.net.imap.IMAP.IMAPState.DISCONNECTED_STATE = r0
                org.apache.commons.net.imap.IMAP$IMAPState r1 = new org.apache.commons.net.imap.IMAP$IMAPState
                java.lang.String r3 = "NOT_AUTH_STATE"
                r4 = 1
                r1.<init>(r3, r4)
                org.apache.commons.net.imap.IMAP.IMAPState.NOT_AUTH_STATE = r1
                org.apache.commons.net.imap.IMAP$IMAPState r3 = new org.apache.commons.net.imap.IMAP$IMAPState
                java.lang.String r5 = "AUTH_STATE"
                r6 = 2
                r3.<init>(r5, r6)
                org.apache.commons.net.imap.IMAP.IMAPState.AUTH_STATE = r3
                org.apache.commons.net.imap.IMAP$IMAPState r5 = new org.apache.commons.net.imap.IMAP$IMAPState
                java.lang.String r7 = "LOGOUT_STATE"
                r8 = 3
                r5.<init>(r7, r8)
                org.apache.commons.net.imap.IMAP.IMAPState.LOGOUT_STATE = r5
                r7 = 4
                org.apache.commons.net.imap.IMAP$IMAPState[] r7 = new org.apache.commons.net.imap.IMAP.IMAPState[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                org.apache.commons.net.imap.IMAP.IMAPState.$VALUES = r7
                return
        }

        IMAPState(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static org.apache.commons.net.imap.IMAP.IMAPState valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.net.imap.IMAP$IMAPState> r0 = org.apache.commons.net.imap.IMAP.IMAPState.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.net.imap.IMAP$IMAPState r1 = (org.apache.commons.net.imap.IMAP.IMAPState) r1
                return r1
        }

        public static org.apache.commons.net.imap.IMAP.IMAPState[] values() {
                org.apache.commons.net.imap.IMAP$IMAPState[] r0 = org.apache.commons.net.imap.IMAP.IMAPState.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.net.imap.IMAP$IMAPState[] r0 = (org.apache.commons.net.imap.IMAP.IMAPState[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements org.apache.commons.net.imap.IMAP.b {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // org.apache.commons.net.imap.IMAP.b
        public boolean a(org.apache.commons.net.imap.IMAP r1) {
                r0 = this;
                r1 = 1
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        boolean a(org.apache.commons.net.imap.IMAP r1);
    }

    static {
            org.apache.commons.net.imap.IMAP$a r0 = new org.apache.commons.net.imap.IMAP$a
            r0.<init>()
            org.apache.commons.net.imap.IMAP.D = r0
            return
    }

    public IMAP() {
            r1 = this;
            r1.<init>()
            r0 = 4
            char[] r0 = new char[r0]
            r0 = {x0024: FILL_ARRAY_DATA , data: [65, 65, 65, 65} // fill-array
            r1.A = r0
            r0 = 143(0x8f, float:2.0E-43)
            r1.N(r0)
            org.apache.commons.net.imap.IMAP$IMAPState r0 = org.apache.commons.net.imap.IMAP.IMAPState.DISCONNECTED_STATE
            r1.u = r0
            r0 = 0
            r1.w = r0
            r1.v = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.y = r0
            r1.m()
            return
    }

    private void Z() throws java.io.IOException {
            r1 = this;
            r0 = 1
            r1.a0(r0)
            return
    }

    private void a0(boolean r5) throws java.io.IOException {
            r4 = this;
            java.util.List<java.lang.String> r0 = r4.y
            r0.clear()
            java.io.BufferedReader r0 = r4.w
            java.lang.String r0 = r0.readLine()
            java.lang.String r1 = "Connection closed without indication."
            if (r0 == 0) goto L86
            java.util.List<java.lang.String> r2 = r4.y
            r2.add(r0)
            if (r5 == 0) goto L76
        L16:
            boolean r5 = org.apache.commons.net.imap.a.g(r0)
            if (r5 == 0) goto L6f
            int r5 = org.apache.commons.net.imap.a.h(r0)
            if (r5 < 0) goto L24
            r0 = 1
            goto L25
        L24:
            r0 = 0
        L25:
            if (r5 < 0) goto L42
            java.io.BufferedReader r2 = r4.w
            java.lang.String r2 = r2.readLine()
            if (r2 == 0) goto L3c
            java.util.List<java.lang.String> r3 = r4.y
            r3.add(r2)
            int r2 = r2.length()
            int r2 = r2 + 2
            int r5 = r5 - r2
            goto L25
        L3c:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>(r1)
            throw r5
        L42:
            if (r0 == 0) goto L5b
            org.apache.commons.net.imap.IMAP$b r5 = r4.z
            if (r5 == 0) goto L5b
            boolean r5 = r5.a(r4)
            if (r5 == 0) goto L5b
            r5 = 3
            java.lang.String r0 = r4.e0()
            r4.p(r5, r0)
            java.util.List<java.lang.String> r5 = r4.y
            r5.clear()
        L5b:
            java.io.BufferedReader r5 = r4.w
            java.lang.String r0 = r5.readLine()
            if (r0 == 0) goto L69
            java.util.List<java.lang.String> r5 = r4.y
            r5.add(r0)
            goto L16
        L69:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>(r1)
            throw r5
        L6f:
            int r5 = org.apache.commons.net.imap.a.a(r0)
            r4.x = r5
            goto L7c
        L76:
            int r5 = org.apache.commons.net.imap.a.c(r0)
            r4.x = r5
        L7c:
            int r5 = r4.x
            java.lang.String r0 = r4.e0()
            r4.p(r5, r0)
            return
        L86:
            java.io.EOFException r5 = new java.io.EOFException
            r5.<init>(r1)
            throw r5
    }

    private int l0(java.lang.String r3, java.lang.String r4, java.lang.String r5) throws java.io.IOException {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 32
            if (r3 == 0) goto Lf
            r0.append(r3)
            r0.append(r1)
        Lf:
            r0.append(r4)
            if (r5 == 0) goto L1a
            r0.append(r1)
            r0.append(r5)
        L1a:
            java.lang.String r3 = "\r\n"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.io.BufferedWriter r5 = r2.v
            r5.write(r3)
            java.io.BufferedWriter r5 = r2.v
            r5.flush()
            r2.o(r4, r3)
            r2.Z()
            int r3 = r2.x
            return r3
    }

    @Override // org.apache.commons.net.g
    protected void b() throws java.io.IOException {
            r4 = this;
            super.b()
            org.apache.commons.net.io.a r0 = new org.apache.commons.net.io.a
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.io.InputStream r2 = r4.h
            java.lang.String r3 = "ISO-8859-1"
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r4.w = r0
            java.io.BufferedWriter r0 = new java.io.BufferedWriter
            java.io.OutputStreamWriter r1 = new java.io.OutputStreamWriter
            java.io.OutputStream r2 = r4.i
            r1.<init>(r2, r3)
            r0.<init>(r1)
            r4.v = r0
            int r0 = r4.G()
            if (r0 > 0) goto L2c
            int r1 = r4.l
            r4.V(r1)
        L2c:
            r1 = 0
            r4.a0(r1)
            if (r0 > 0) goto L35
            r4.V(r0)
        L35:
            org.apache.commons.net.imap.IMAP$IMAPState r0 = org.apache.commons.net.imap.IMAP.IMAPState.NOT_AUTH_STATE
            r4.o0(r0)
            return
    }

    public boolean b0(org.apache.commons.net.imap.IMAPCommand r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.j0(r1)
            boolean r1 = org.apache.commons.net.imap.a.f(r1)
            return r1
    }

    public boolean c0(org.apache.commons.net.imap.IMAPCommand r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            int r1 = r0.k0(r1, r2)
            boolean r1 = org.apache.commons.net.imap.a.f(r1)
            return r1
    }

    protected java.lang.String d0() {
            r6 = this;
            java.lang.String r0 = new java.lang.String
            char[] r1 = r6.A
            r0.<init>(r1)
            char[] r1 = r6.A
            int r1 = r1.length
            r2 = 1
            int r1 = r1 - r2
        Lc:
            if (r2 == 0) goto L26
            if (r1 < 0) goto L26
            char[] r3 = r6.A
            char r4 = r3[r1]
            r5 = 90
            if (r4 != r5) goto L1d
            r4 = 65
            r3[r1] = r4
            goto L23
        L1d:
            int r4 = r4 + 1
            char r2 = (char) r4
            r3[r1] = r2
            r2 = 0
        L23:
            int r1 = r1 + (-1)
            goto Lc
        L26:
            return r0
    }

    public java.lang.String e0() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r1 = 256(0x100, float:3.59E-43)
            r0.<init>(r1)
            java.util.List<java.lang.String> r1 = r3.y
            java.util.Iterator r1 = r1.iterator()
        Ld:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L22
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            r0.append(r2)
            java.lang.String r2 = "\r\n"
            r0.append(r2)
            goto Ld
        L22:
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.lang.String[] f0() {
            r2 = this;
            java.util.List<java.lang.String> r0 = r2.y
            int r1 = r0.size()
            java.lang.String[] r1 = new java.lang.String[r1]
            java.lang.Object[] r0 = r0.toArray(r1)
            java.lang.String[] r0 = (java.lang.String[]) r0
            return r0
    }

    public org.apache.commons.net.imap.IMAP.IMAPState g0() {
            r1 = this;
            org.apache.commons.net.imap.IMAP$IMAPState r0 = r1.u
            return r0
    }

    public int h0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r2 = r1.i0(r2, r0)
            return r2
    }

    public int i0(java.lang.String r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.lang.String r0 = r1.d0()
            int r2 = r1.l0(r0, r2, r3)
            return r2
    }

    public int j0(org.apache.commons.net.imap.IMAPCommand r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r2 = r1.k0(r2, r0)
            return r2
    }

    public int k0(org.apache.commons.net.imap.IMAPCommand r1, java.lang.String r2) throws java.io.IOException {
            r0 = this;
            java.lang.String r1 = r1.getIMAPCommand()
            int r1 = r0.i0(r1, r2)
            return r1
    }

    public int m0(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            int r2 = r1.l0(r0, r2, r0)
            return r2
    }

    @Override // org.apache.commons.net.g
    public void n() throws java.io.IOException {
            r1 = this;
            super.n()
            r0 = 0
            r1.w = r0
            r1.v = r0
            java.util.List<java.lang.String> r0 = r1.y
            r0.clear()
            org.apache.commons.net.imap.IMAP$IMAPState r0 = org.apache.commons.net.imap.IMAP.IMAPState.DISCONNECTED_STATE
            r1.o0(r0)
            return
    }

    public void n0(org.apache.commons.net.imap.IMAP.b r1) {
            r0 = this;
            r0.z = r1
            return
    }

    protected void o0(org.apache.commons.net.imap.IMAP.IMAPState r1) {
            r0 = this;
            r0.u = r1
            return
    }

    @Override // org.apache.commons.net.g
    protected void p(int r2, java.lang.String r3) {
            r1 = this;
            org.apache.commons.net.ProtocolCommandSupport r3 = r1.s()
            int r3 = r3.getListenerCount()
            if (r3 <= 0) goto L15
            org.apache.commons.net.ProtocolCommandSupport r3 = r1.s()
            java.lang.String r0 = r1.e0()
            r3.fireReplyReceived(r2, r0)
        L15:
            return
    }
}

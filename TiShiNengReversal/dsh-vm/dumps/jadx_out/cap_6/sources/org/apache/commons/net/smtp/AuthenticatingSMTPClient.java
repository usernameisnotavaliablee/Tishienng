package org.apache.commons.net.smtp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AuthenticatingSMTPClient extends org.apache.commons.net.smtp.f {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AUTH_METHOD extends java.lang.Enum<org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD> {
        private static final /* synthetic */ org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD[] $VALUES = null;
        public static final org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD CRAM_MD5 = null;
        public static final org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD LOGIN = null;
        public static final org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD PLAIN = null;
        public static final org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD XOAUTH = null;

        static {
                org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD r0 = new org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD
                java.lang.String r1 = "PLAIN"
                r2 = 0
                r0.<init>(r1, r2)
                org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.PLAIN = r0
                org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD r1 = new org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD
                java.lang.String r3 = "CRAM_MD5"
                r4 = 1
                r1.<init>(r3, r4)
                org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.CRAM_MD5 = r1
                org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD r3 = new org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD
                java.lang.String r5 = "LOGIN"
                r6 = 2
                r3.<init>(r5, r6)
                org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.LOGIN = r3
                org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD r5 = new org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD
                java.lang.String r7 = "XOAUTH"
                r8 = 3
                r5.<init>(r7, r8)
                org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.XOAUTH = r5
                r7 = 4
                org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD[] r7 = new org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD[r7]
                r7[r2] = r0
                r7[r4] = r1
                r7[r6] = r3
                r7[r8] = r5
                org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.$VALUES = r7
                return
        }

        AUTH_METHOD(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static final java.lang.String getAuthName(org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD r1) {
                org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD r0 = org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.PLAIN
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto Lb
                java.lang.String r1 = "PLAIN"
                return r1
            Lb:
                org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD r0 = org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.CRAM_MD5
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L16
                java.lang.String r1 = "CRAM-MD5"
                return r1
            L16:
                org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD r0 = org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.LOGIN
                boolean r0 = r1.equals(r0)
                if (r0 == 0) goto L21
                java.lang.String r1 = "LOGIN"
                return r1
            L21:
                org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD r0 = org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.XOAUTH
                boolean r1 = r1.equals(r0)
                if (r1 == 0) goto L2c
                java.lang.String r1 = "XOAUTH"
                return r1
            L2c:
                r1 = 0
                return r1
        }

        public static org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD> r0 = org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD r1 = (org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD) r1
                return r1
        }

        public static org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD[] values() {
                org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD[] r0 = org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD[] r0 = (org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD[]) r0
                return r0
        }
    }

    public AuthenticatingSMTPClient() {
            r0 = this;
            r0.<init>()
            return
    }

    public AuthenticatingSMTPClient(java.lang.String r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    public AuthenticatingSMTPClient(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0, r3)
            return
    }

    public AuthenticatingSMTPClient(java.lang.String r1, boolean r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public AuthenticatingSMTPClient(java.lang.String r1, boolean r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public AuthenticatingSMTPClient(boolean r1, javax.net.ssl.SSLContext r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private java.lang.String g1(byte[] r6) {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            int r1 = r6.length
            int r1 = r1 * 2
            r0.<init>(r1)
            int r1 = r6.length
            r2 = 0
        La:
            if (r2 >= r1) goto L23
            r3 = r6[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 15
            if (r3 > r4) goto L19
            java.lang.String r4 = "0"
            r0.append(r4)
        L19:
            java.lang.String r3 = java.lang.Integer.toHexString(r3)
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L23:
            java.lang.String r6 = r0.toString()
            return r6
    }

    public boolean h1(org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD r6, java.lang.String r7, java.lang.String r8) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
            r5 = this;
            r0 = 14
            java.lang.String r1 = org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.getAuthName(r6)
            int r0 = r5.u0(r0, r1)
            boolean r0 = org.apache.commons.net.smtp.e.d(r0)
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD r0 = org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.PLAIN
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L46
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "\u0000"
            r6.append(r0)
            r6.append(r7)
            r6.append(r0)
            r6.append(r8)
            java.lang.String r6 = r6.toString()
            java.nio.charset.Charset r7 = r5.q()
            byte[] r6 = r6.getBytes(r7)
            java.lang.String r6 = org.apache.commons.net.util.a.r(r6)
            int r6 = r5.v0(r6)
            boolean r6 = org.apache.commons.net.smtp.e.c(r6)
            return r6
        L46:
            org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD r0 = org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.CRAM_MD5
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Lb1
            java.lang.String r6 = r5.g0()
            r0 = 4
            java.lang.String r6 = r6.substring(r0)
            java.lang.String r6 = r6.trim()
            byte[] r6 = org.apache.commons.net.util.a.f(r6)
            java.lang.String r0 = "HmacMD5"
            javax.crypto.Mac r2 = javax.crypto.Mac.getInstance(r0)
            javax.crypto.spec.SecretKeySpec r3 = new javax.crypto.spec.SecretKeySpec
            java.nio.charset.Charset r4 = r5.q()
            byte[] r8 = r8.getBytes(r4)
            r3.<init>(r8, r0)
            r2.init(r3)
            byte[] r6 = r2.doFinal(r6)
            java.lang.String r6 = r5.g1(r6)
            java.nio.charset.Charset r8 = r5.q()
            byte[] r6 = r6.getBytes(r8)
            java.nio.charset.Charset r8 = r5.q()
            byte[] r7 = r7.getBytes(r8)
            int r8 = r7.length
            int r8 = r8 + 1
            int r0 = r6.length
            int r8 = r8 + r0
            byte[] r8 = new byte[r8]
            int r0 = r7.length
            java.lang.System.arraycopy(r7, r1, r8, r1, r0)
            int r0 = r7.length
            r2 = 32
            r8[r0] = r2
            int r7 = r7.length
            int r7 = r7 + 1
            int r0 = r6.length
            java.lang.System.arraycopy(r6, r1, r8, r7, r0)
            java.lang.String r6 = org.apache.commons.net.util.a.r(r8)
            int r6 = r5.v0(r6)
            boolean r6 = org.apache.commons.net.smtp.e.c(r6)
            return r6
        Lb1:
            org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD r0 = org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.LOGIN
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto Le5
            java.nio.charset.Charset r6 = r5.q()
            byte[] r6 = r7.getBytes(r6)
            java.lang.String r6 = org.apache.commons.net.util.a.r(r6)
            int r6 = r5.v0(r6)
            boolean r6 = org.apache.commons.net.smtp.e.d(r6)
            if (r6 != 0) goto Ld0
            return r1
        Ld0:
            java.nio.charset.Charset r6 = r5.q()
            byte[] r6 = r8.getBytes(r6)
            java.lang.String r6 = org.apache.commons.net.util.a.r(r6)
            int r6 = r5.v0(r6)
            boolean r6 = org.apache.commons.net.smtp.e.c(r6)
            return r6
        Le5:
            org.apache.commons.net.smtp.AuthenticatingSMTPClient$AUTH_METHOD r8 = org.apache.commons.net.smtp.AuthenticatingSMTPClient.AUTH_METHOD.XOAUTH
            boolean r6 = r6.equals(r8)
            if (r6 == 0) goto L102
            java.nio.charset.Charset r6 = r5.q()
            byte[] r6 = r7.getBytes(r6)
            java.lang.String r6 = org.apache.commons.net.util.a.r(r6)
            int r6 = r5.v0(r6)
            boolean r6 = org.apache.commons.net.smtp.e.d(r6)
            return r6
        L102:
            return r1
    }

    public int i1(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            r0 = 15
            int r2 = r1.u0(r0, r2)
            return r2
    }

    public boolean j1() throws java.io.IOException {
            r1 = this;
            java.net.InetAddress r0 = r1.x()
            java.lang.String r0 = r0.getHostName()
            if (r0 != 0) goto Lc
            r0 = 0
            return r0
        Lc:
            int r0 = r1.i1(r0)
            boolean r0 = org.apache.commons.net.smtp.e.c(r0)
            return r0
    }

    public boolean k1(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            int r1 = r0.i1(r1)
            boolean r1 = org.apache.commons.net.smtp.e.c(r1)
            return r1
    }

    public int[] l1() {
            r4 = this;
            java.lang.String r0 = r4.g0()
            r1 = 4
            java.lang.String r0 = r0.substring(r1)
            r1 = 32
            int r1 = r0.indexOf(r1)
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)
            java.lang.String r1 = "\\."
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            int[] r1 = new int[r1]
        L1d:
            int r3 = r0.length
            if (r2 >= r3) goto L2b
            r3 = r0[r2]
            int r3 = java.lang.Integer.parseInt(r3)
            r1[r2] = r3
            int r2 = r2 + 1
            goto L1d
        L2b:
            return r1
    }
}

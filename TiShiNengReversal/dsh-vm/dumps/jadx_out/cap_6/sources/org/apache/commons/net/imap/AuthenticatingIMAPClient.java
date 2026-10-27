package org.apache.commons.net.imap;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class AuthenticatingIMAPClient extends org.apache.commons.net.imap.b {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AUTH_METHOD extends java.lang.Enum<org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD> {
        private static final /* synthetic */ org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD[] $VALUES = null;
        public static final org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD CRAM_MD5 = null;
        public static final org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD LOGIN = null;
        public static final org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD PLAIN = null;
        public static final org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD XOAUTH = null;
        private final java.lang.String authName;

        static {
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD r0 = new org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD
                java.lang.String r1 = "PLAIN"
                r2 = 0
                r0.<init>(r1, r2, r1)
                org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.PLAIN = r0
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD r1 = new org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD
                java.lang.String r3 = "CRAM-MD5"
                java.lang.String r4 = "CRAM_MD5"
                r5 = 1
                r1.<init>(r4, r5, r3)
                org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.CRAM_MD5 = r1
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD r3 = new org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD
                java.lang.String r4 = "LOGIN"
                r6 = 2
                r3.<init>(r4, r6, r4)
                org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.LOGIN = r3
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD r4 = new org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD
                java.lang.String r7 = "XOAUTH"
                r8 = 3
                r4.<init>(r7, r8, r7)
                org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.XOAUTH = r4
                r7 = 4
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD[] r7 = new org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD[r7]
                r7[r2] = r0
                r7[r5] = r1
                r7[r6] = r3
                r7[r8] = r4
                org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.$VALUES = r7
                return
        }

        AUTH_METHOD(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.authName = r3
                return
        }

        public static org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD> r0 = org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD r1 = (org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD) r1
                return r1
        }

        public static org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD[] values() {
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD[] r0 = org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD[] r0 = (org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD[]) r0
                return r0
        }

        public final java.lang.String getAuthName() {
                r1 = this;
                java.lang.String r0 = r1.authName
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD[] r0 = org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.net.imap.AuthenticatingIMAPClient.a.a = r0
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD r1 = org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.PLAIN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.apache.commons.net.imap.AuthenticatingIMAPClient.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD r1 = org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.CRAM_MD5     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = org.apache.commons.net.imap.AuthenticatingIMAPClient.a.a     // Catch: java.lang.NoSuchFieldError -> L28
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD r1 = org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.LOGIN     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = org.apache.commons.net.imap.AuthenticatingIMAPClient.a.a     // Catch: java.lang.NoSuchFieldError -> L33
                org.apache.commons.net.imap.AuthenticatingIMAPClient$AUTH_METHOD r1 = org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD.XOAUTH     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public AuthenticatingIMAPClient() {
            r2 = this;
            java.lang.String r0 = "TLS"
            r1 = 0
            r2.<init>(r0, r1)
            return
    }

    public AuthenticatingIMAPClient(java.lang.String r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public AuthenticatingIMAPClient(java.lang.String r2, boolean r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public AuthenticatingIMAPClient(java.lang.String r1, boolean r2, javax.net.ssl.SSLContext r3) {
            r0 = this;
            r0.<init>(r1, r2, r3)
            return
    }

    public AuthenticatingIMAPClient(javax.net.ssl.SSLContext r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r0, r2)
            return
    }

    public AuthenticatingIMAPClient(boolean r2) {
            r1 = this;
            java.lang.String r0 = "TLS"
            r1.<init>(r0, r2)
            return
    }

    public AuthenticatingIMAPClient(boolean r2, javax.net.ssl.SSLContext r3) {
            r1 = this;
            java.lang.String r0 = "TLS"
            r1.<init>(r0, r2, r3)
            return
    }

    private java.lang.String d1(byte[] r6) {
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

    public boolean e1(org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD r7, java.lang.String r8, java.lang.String r9) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
            r6 = this;
            org.apache.commons.net.imap.IMAPCommand r0 = org.apache.commons.net.imap.IMAPCommand.AUTHENTICATE
            java.lang.String r1 = r7.getAuthName()
            int r0 = r6.k0(r0, r1)
            boolean r0 = org.apache.commons.net.imap.a.d(r0)
            r1 = 0
            if (r0 != 0) goto L12
            return r1
        L12:
            int[] r0 = org.apache.commons.net.imap.AuthenticatingIMAPClient.a.a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            r0 = 1
            if (r7 == r0) goto Lca
            r2 = 2
            if (r7 == r2) goto L64
            r2 = 3
            if (r7 == r2) goto L36
            r9 = 4
            if (r7 == r9) goto L27
            return r1
        L27:
            int r7 = r6.m0(r8)
            if (r7 != 0) goto L32
            org.apache.commons.net.imap.IMAP$IMAPState r8 = org.apache.commons.net.imap.IMAP.IMAPState.AUTH_STATE
            r6.o0(r8)
        L32:
            if (r7 != 0) goto L35
            return r0
        L35:
            return r1
        L36:
            java.nio.charset.Charset r7 = r6.q()
            byte[] r7 = r8.getBytes(r7)
            java.lang.String r7 = org.apache.commons.net.util.a.r(r7)
            int r7 = r6.m0(r7)
            if (r7 == r2) goto L49
            return r1
        L49:
            java.nio.charset.Charset r7 = r6.q()
            byte[] r7 = r9.getBytes(r7)
            java.lang.String r7 = org.apache.commons.net.util.a.r(r7)
            int r7 = r6.m0(r7)
            if (r7 != 0) goto L60
            org.apache.commons.net.imap.IMAP$IMAPState r8 = org.apache.commons.net.imap.IMAP.IMAPState.AUTH_STATE
            r6.o0(r8)
        L60:
            if (r7 != 0) goto L63
            return r0
        L63:
            return r1
        L64:
            java.lang.String r7 = r6.e0()
            java.lang.String r7 = r7.substring(r2)
            java.lang.String r7 = r7.trim()
            byte[] r7 = org.apache.commons.net.util.a.f(r7)
            java.lang.String r2 = "HmacMD5"
            javax.crypto.Mac r3 = javax.crypto.Mac.getInstance(r2)
            javax.crypto.spec.SecretKeySpec r4 = new javax.crypto.spec.SecretKeySpec
            java.nio.charset.Charset r5 = r6.q()
            byte[] r9 = r9.getBytes(r5)
            r4.<init>(r9, r2)
            r3.init(r4)
            byte[] r7 = r3.doFinal(r7)
            java.lang.String r7 = r6.d1(r7)
            java.nio.charset.Charset r9 = r6.q()
            byte[] r7 = r7.getBytes(r9)
            java.nio.charset.Charset r9 = r6.q()
            byte[] r8 = r8.getBytes(r9)
            int r9 = r8.length
            int r9 = r9 + r0
            int r2 = r7.length
            int r9 = r9 + r2
            byte[] r9 = new byte[r9]
            int r2 = r8.length
            java.lang.System.arraycopy(r8, r1, r9, r1, r2)
            int r2 = r8.length
            r3 = 32
            r9[r2] = r3
            int r8 = r8.length
            int r8 = r8 + r0
            int r2 = r7.length
            java.lang.System.arraycopy(r7, r1, r9, r8, r2)
            java.lang.String r7 = org.apache.commons.net.util.a.r(r9)
            int r7 = r6.m0(r7)
            if (r7 != 0) goto Lc6
            org.apache.commons.net.imap.IMAP$IMAPState r8 = org.apache.commons.net.imap.IMAP.IMAPState.AUTH_STATE
            r6.o0(r8)
        Lc6:
            if (r7 != 0) goto Lc9
            return r0
        Lc9:
            return r1
        Lca:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "\u0000"
            r7.append(r2)
            r7.append(r8)
            r7.append(r2)
            r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.nio.charset.Charset r8 = r6.q()
            byte[] r7 = r7.getBytes(r8)
            java.lang.String r7 = org.apache.commons.net.util.a.r(r7)
            int r7 = r6.m0(r7)
            if (r7 != 0) goto Lf8
            org.apache.commons.net.imap.IMAP$IMAPState r8 = org.apache.commons.net.imap.IMAP.IMAPState.AUTH_STATE
            r6.o0(r8)
        Lf8:
            if (r7 != 0) goto Lfb
            return r0
        Lfb:
            return r1
    }

    public boolean f1(org.apache.commons.net.imap.AuthenticatingIMAPClient.AUTH_METHOD r1, java.lang.String r2, java.lang.String r3) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
            r0 = this;
            boolean r1 = r0.e1(r1, r2, r3)
            return r1
    }
}

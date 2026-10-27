package org.apache.commons.net.pop3;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ExtendedPOP3Client extends org.apache.commons.net.pop3.f {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum AUTH_METHOD extends java.lang.Enum<org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD> {
        private static final /* synthetic */ org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD[] $VALUES = null;
        public static final org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD CRAM_MD5 = null;
        public static final org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD PLAIN = null;
        private final java.lang.String methodName;

        static {
                org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD r0 = new org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD
                java.lang.String r1 = "PLAIN"
                r2 = 0
                r0.<init>(r1, r2, r1)
                org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.PLAIN = r0
                org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD r1 = new org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD
                java.lang.String r3 = "CRAM-MD5"
                java.lang.String r4 = "CRAM_MD5"
                r5 = 1
                r1.<init>(r4, r5, r3)
                org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.CRAM_MD5 = r1
                r3 = 2
                org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD[] r3 = new org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD[r3]
                r3[r2] = r0
                r3[r5] = r1
                org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.$VALUES = r3
                return
        }

        AUTH_METHOD(java.lang.String r1, int r2, java.lang.String r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.methodName = r3
                return
        }

        public static org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD valueOf(java.lang.String r1) {
                java.lang.Class<org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD> r0 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD r1 = (org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD) r1
                return r1
        }

        public static org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD[] values() {
                org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD[] r0 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.$VALUES
                java.lang.Object r0 = r0.clone()
                org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD[] r0 = (org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD[]) r0
                return r0
        }

        public final java.lang.String getAuthName() {
                r1 = this;
                java.lang.String r0 = r1.methodName
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        static final /* synthetic */ int[] a = null;

        static {
                org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD[] r0 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                org.apache.commons.net.pop3.ExtendedPOP3Client.a.a = r0
                org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD r1 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.PLAIN     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = org.apache.commons.net.pop3.ExtendedPOP3Client.a.a     // Catch: java.lang.NoSuchFieldError -> L1d
                org.apache.commons.net.pop3.ExtendedPOP3Client$AUTH_METHOD r1 = org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD.CRAM_MD5     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public ExtendedPOP3Client() throws java.security.NoSuchAlgorithmException {
            r0 = this;
            r0.<init>()
            return
    }

    private java.lang.String P0(byte[] r6) {
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

    public boolean Q0(org.apache.commons.net.pop3.ExtendedPOP3Client.AUTH_METHOD r7, java.lang.String r8, java.lang.String r9) throws java.io.IOException, java.security.NoSuchAlgorithmException, java.security.InvalidKeyException, java.security.spec.InvalidKeySpecException {
            r6 = this;
            r0 = 13
            java.lang.String r1 = r7.getAuthName()
            int r0 = r6.g0(r0, r1)
            r1 = 0
            r2 = 2
            if (r0 == r2) goto Lf
            return r1
        Lf:
            int[] r0 = org.apache.commons.net.pop3.ExtendedPOP3Client.a.a
            int r7 = r7.ordinal()
            r7 = r0[r7]
            r0 = 1
            if (r7 == r0) goto L7c
            if (r7 == r2) goto L1d
            return r1
        L1d:
            java.lang.String r7 = r6.b0()
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
            java.lang.String r7 = r6.P0(r7)
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
            int r7 = r6.h0(r7)
            if (r7 != 0) goto L7b
            return r0
        L7b:
            return r1
        L7c:
            java.lang.String r7 = new java.lang.String
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "\u0000"
            r2.append(r3)
            r2.append(r8)
            r2.append(r3)
            r2.append(r9)
            java.lang.String r8 = r2.toString()
            java.nio.charset.Charset r9 = r6.q()
            byte[] r8 = r8.getBytes(r9)
            byte[] r8 = org.apache.commons.net.util.a.k(r8)
            java.nio.charset.Charset r9 = r6.q()
            r7.<init>(r8, r9)
            int r7 = r6.h0(r7)
            if (r7 != 0) goto Laf
            return r0
        Laf:
            return r1
    }
}

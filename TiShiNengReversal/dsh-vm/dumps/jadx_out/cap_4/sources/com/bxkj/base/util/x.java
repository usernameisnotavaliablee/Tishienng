package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class x {
    private final int a;
    private final int b;
    private final java.lang.String c;
    private final java.lang.String d;
    private final java.lang.String e;
    private final java.lang.String f;

    public x() {
            r1 = this;
            r1.<init>()
            r0 = 117(0x75, float:1.64E-43)
            r1.a = r0
            r0 = 256(0x100, float:3.59E-43)
            r1.b = r0
            java.lang.String r0 = "RSA"
            r1.c = r0
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            r1.d = r0
            java.lang.String r0 = "UTF-8"
            r1.e = r0
            java.lang.String r0 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAq4laolA7zAk7jzsqDb3Oa5pS/uCPlZfASK8Soh/NzEmry77QDZ2koyr96M5Wx+A9cxwewQMHzi8RoOfb3UcQO4UDQlMUImLuzUnfbk3TTppijSLH+PU88XQxcgYm2JTa546c7JdZSI6dBeXOJH20quuxWyzgLk9jAlt3ytYygPQ7C6o6ZSmjcMgE3xgLaHGvixEVpOjL/pdVLzXhrMqWVAnB/snMjpCqesDVTDe5c6OOmj2q5J8n+tzIXtnvrkxQSDaUp8DWF8meMwyTErmYklMXzKic2rjdYZpHh4x98Fg0Q28sp6i2ZoWiGrJDKW29mntVQQiDNhKDawb4B45zUwIDAQAB"
            r1.f = r0
            return
    }

    private java.security.PublicKey b(java.lang.String r3) throws java.lang.Exception {
            r2 = this;
            java.lang.String r0 = "RSA"
            java.security.KeyFactory r0 = java.security.KeyFactory.getInstance(r0)
            byte[] r3 = cn.bluemobi.dylan.base.utils.b.a(r3)
            java.security.spec.X509EncodedKeySpec r1 = new java.security.spec.X509EncodedKeySpec
            r1.<init>(r3)
            java.security.PublicKey r3 = r0.generatePublic(r1)
            return r3
    }

    public java.lang.String a(java.lang.String r11) throws java.lang.Exception {
            r10 = this;
            java.lang.String r0 = "RSA/ECB/PKCS1Padding"
            javax.crypto.Cipher r0 = javax.crypto.Cipher.getInstance(r0)
            java.lang.String r1 = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAq4laolA7zAk7jzsqDb3Oa5pS/uCPlZfASK8Soh/NzEmry77QDZ2koyr96M5Wx+A9cxwewQMHzi8RoOfb3UcQO4UDQlMUImLuzUnfbk3TTppijSLH+PU88XQxcgYm2JTa546c7JdZSI6dBeXOJH20quuxWyzgLk9jAlt3ytYygPQ7C6o6ZSmjcMgE3xgLaHGvixEVpOjL/pdVLzXhrMqWVAnB/snMjpCqesDVTDe5c6OOmj2q5J8n+tzIXtnvrkxQSDaUp8DWF8meMwyTErmYklMXzKic2rjdYZpHh4x98Fg0Q28sp6i2ZoWiGrJDKW29mntVQQiDNhKDawb4B45zUwIDAQAB"
            java.security.PublicKey r1 = r10.b(r1)
            r2 = 1
            r0.init(r2, r1)
            java.lang.String r1 = "UTF-8"
            byte[] r3 = r11.getBytes(r1)
            int r3 = r3.length
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream
            r4.<init>()
            r5 = 0
            r6 = 0
            r7 = 0
        L1f:
            int r8 = r3 - r6
            if (r8 <= 0) goto L40
            r9 = 117(0x75, float:1.64E-43)
            if (r8 <= r9) goto L30
            byte[] r8 = r11.getBytes(r1)
            byte[] r6 = r0.doFinal(r8, r6, r9)
            goto L38
        L30:
            byte[] r9 = r11.getBytes(r1)
            byte[] r6 = r0.doFinal(r9, r6, r8)
        L38:
            int r8 = r6.length
            r4.write(r6, r5, r8)
            int r7 = r7 + r2
            int r6 = r7 * 117
            goto L1f
        L40:
            byte[] r11 = r4.toByteArray()
            r4.close()
            java.lang.String r11 = cn.bluemobi.dylan.base.utils.b.b(r11)
            return r11
    }
}

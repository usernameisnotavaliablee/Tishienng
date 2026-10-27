package xyz.adscope.common.v2.encrypt.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class LinkedEncryptImpl implements xyz.adscope.common.v2.encrypt.ILinkedEncrypt {
    private static final java.lang.String ENCRYPT_AES = "1001";
    private static final java.lang.String ENCRYPT_BASE64 = "-999";
    private static final java.lang.String ENCRYPT_GZIP = "101";
    private xyz.adscope.common.v2.encrypt.impl.AesUtil.IAESConfig aesConfigGenerate;
    private xyz.adscope.common.v2.encrypt.impl.AesUtil mAes;

    public LinkedEncryptImpl() {
            r0 = this;
            r0.<init>()
            return
    }

    private byte[] decodeLinked(byte[] r2, java.util.LinkedList<java.lang.String> r3) {
            r1 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            xyz.adscope.common.v2.encrypt.impl.IBaseEncrypt r0 = r1.encryptByPattern(r0)
            if (r0 == 0) goto L4
            if (r2 == 0) goto L1d
            byte[] r2 = r0.decode(r2)
            goto L4
        L1d:
            return r2
    }

    private byte[] encodeLinked(byte[] r2, java.util.LinkedList<java.lang.String> r3) {
            r1 = this;
            java.util.Iterator r3 = r3.iterator()
        L4:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L1d
            java.lang.Object r0 = r3.next()
            java.lang.String r0 = (java.lang.String) r0
            xyz.adscope.common.v2.encrypt.impl.IBaseEncrypt r0 = r1.encryptByPattern(r0)
            if (r0 == 0) goto L4
            if (r2 == 0) goto L1d
            byte[] r2 = r0.encode(r2)
            goto L4
        L1d:
            return r2
    }

    private xyz.adscope.common.v2.encrypt.impl.IBaseEncrypt encryptByPattern(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "1001"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L18
            xyz.adscope.common.v2.encrypt.impl.AesUtil r2 = r1.mAes
            if (r2 != 0) goto L15
            xyz.adscope.common.v2.encrypt.impl.AesUtil r2 = new xyz.adscope.common.v2.encrypt.impl.AesUtil
            xyz.adscope.common.v2.encrypt.impl.AesUtil$IAESConfig r0 = r1.aesConfigGenerate
            r2.<init>(r0)
            r1.mAes = r2
        L15:
            xyz.adscope.common.v2.encrypt.impl.AesUtil r2 = r1.mAes
            return r2
        L18:
            java.lang.String r0 = "101"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L25
            xyz.adscope.common.v2.encrypt.impl.GzipUtil r2 = xyz.adscope.common.v2.encrypt.impl.GzipUtil.getInstance()
            return r2
        L25:
            java.lang.String r0 = "-999"
            boolean r2 = r0.equals(r2)
            if (r2 == 0) goto L32
            xyz.adscope.common.v2.encrypt.impl.Base64Util r2 = xyz.adscope.common.v2.encrypt.impl.Base64Util.getInstance()
            return r2
        L32:
            r2 = 0
            return r2
    }

    @Override // xyz.adscope.common.v2.encrypt.ILinkedEncrypt
    public java.lang.String decrypt(java.lang.String r2, java.lang.String r3, xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model r4, boolean r5) {
            r1 = this;
            byte[] r0 = r2.getBytes()
            byte[] r3 = r1.decrypt(r0, r3, r4, r5)
            if (r3 == 0) goto L10
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            return r2
        L10:
            if (r5 == 0) goto L13
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // xyz.adscope.common.v2.encrypt.ILinkedEncrypt
    public byte[] decrypt(byte[] r6, java.lang.String r7, xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model r8, boolean r9) {
            r5 = this;
            java.util.LinkedList r9 = new java.util.LinkedList
            r9.<init>()
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r1 = "-999"
            if (r0 != 0) goto L2c
            java.lang.String r0 = ","
            java.lang.String[] r7 = r7.split(r0)
            int r0 = r7.length
            r2 = 0
        L15:
            if (r2 >= r0) goto L2c
            r3 = r7[r2]
            boolean r4 = r9.contains(r3)
            if (r4 != 0) goto L29
            r9.addFirst(r3)
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r3 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.STEP_BY_STEP
            if (r8 != r3) goto L29
            r9.addFirst(r1)
        L29:
            int r2 = r2 + 1
            goto L15
        L2c:
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r7 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.AS_LAST_OR_FIRST
            if (r8 != r7) goto L33
            r9.addFirst(r1)
        L33:
            byte[] r6 = r5.decodeLinked(r6, r9)
            return r6
    }

    @Override // xyz.adscope.common.v2.encrypt.ILinkedEncrypt
    public java.lang.String encrypt(java.lang.String r2, java.lang.String r3, xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model r4, boolean r5) {
            r1 = this;
            byte[] r0 = r2.getBytes()
            byte[] r3 = r1.encrypt(r0, r3, r4, r5)
            if (r3 == 0) goto L10
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
            return r2
        L10:
            if (r5 == 0) goto L13
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // xyz.adscope.common.v2.encrypt.ILinkedEncrypt
    public byte[] encrypt(byte[] r6, java.lang.String r7, xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model r8, boolean r9) {
            r5 = this;
            java.util.LinkedList r9 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L2e
            r9.<init>()     // Catch: java.lang.Throwable -> L2e
            boolean r0 = android.text.TextUtils.isEmpty(r7)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r1 = "-999"
            if (r0 != 0) goto L33
            java.lang.String r0 = ","
            java.lang.String[] r7 = r7.split(r0)     // Catch: java.lang.Throwable -> L2e
            int r0 = r7.length     // Catch: java.lang.Throwable -> L2e
            r2 = 0
        L15:
            if (r2 >= r0) goto L33
            r3 = r7[r2]     // Catch: java.lang.Throwable -> L2e
            java.lang.String r3 = r3.trim()     // Catch: java.lang.Throwable -> L2e
            boolean r4 = r9.contains(r3)     // Catch: java.lang.Throwable -> L2e
            if (r4 != 0) goto L30
            r9.addLast(r3)     // Catch: java.lang.Throwable -> L2e
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r3 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.STEP_BY_STEP     // Catch: java.lang.Throwable -> L2e
            if (r8 != r3) goto L30
            r9.addLast(r1)     // Catch: java.lang.Throwable -> L2e
            goto L30
        L2e:
            r6 = move-exception
            goto L3f
        L30:
            int r2 = r2 + 1
            goto L15
        L33:
            xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r7 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.AS_LAST_OR_FIRST     // Catch: java.lang.Throwable -> L2e
            if (r8 != r7) goto L3a
            r9.addLast(r1)     // Catch: java.lang.Throwable -> L2e
        L3a:
            byte[] r6 = r5.encodeLinked(r6, r9)     // Catch: java.lang.Throwable -> L2e
            return r6
        L3f:
            xyz.adscope.common.v2.log.SDKLog.stack(r6)
            r6 = 0
            return r6
    }

    @Override // xyz.adscope.common.v2.encrypt.ILinkedEncrypt
    public void initAesConfig(xyz.adscope.common.v2.encrypt.impl.AesUtil.IAESConfig r1) {
            r0 = this;
            r0.aesConfigGenerate = r1
            return
    }
}

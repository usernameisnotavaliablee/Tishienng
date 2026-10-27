package xyz.adscope.common.v2.encrypt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public enum EncryptConfig extends java.lang.Enum<xyz.adscope.common.v2.encrypt.EncryptConfig> implements xyz.adscope.common.v2.encrypt.impl.AesUtil.IAESConfig {
    private static final /* synthetic */ xyz.adscope.common.v2.encrypt.EncryptConfig[] $VALUES = null;
    public static final xyz.adscope.common.v2.encrypt.EncryptConfig CONFIG_AES = null;
    private final java.lang.String mKey;
    private final java.lang.String mVector;

    private static /* synthetic */ xyz.adscope.common.v2.encrypt.EncryptConfig[] $values() {
            r0 = 1
            xyz.adscope.common.v2.encrypt.EncryptConfig[] r0 = new xyz.adscope.common.v2.encrypt.EncryptConfig[r0]
            xyz.adscope.common.v2.encrypt.EncryptConfig r1 = xyz.adscope.common.v2.encrypt.EncryptConfig.CONFIG_AES
            r2 = 0
            r0[r2] = r1
            return r0
    }

    static {
            xyz.adscope.common.v2.encrypt.EncryptConfig r0 = new xyz.adscope.common.v2.encrypt.EncryptConfig
            java.lang.String r1 = "@/.D>XVX5zhOdwj8"
            java.lang.String r2 = "\u007f}{y<usqomkigeca"
            java.lang.String r3 = "CONFIG_AES"
            r4 = 0
            r0.<init>(r3, r4, r1, r2)
            xyz.adscope.common.v2.encrypt.EncryptConfig.CONFIG_AES = r0
            xyz.adscope.common.v2.encrypt.EncryptConfig[] r0 = $values()
            xyz.adscope.common.v2.encrypt.EncryptConfig.$VALUES = r0
            return
    }

    EncryptConfig(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.mKey = r3
            r0.mVector = r4
            return
    }

    private java.lang.String decryptStr(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L1b
            r0.<init>(r3)     // Catch: java.lang.Exception -> L1b
            r0.reverse()     // Catch: java.lang.Exception -> L1b
            r3 = 0
        L9:
            int r1 = r0.length()     // Catch: java.lang.Exception -> L1b
            if (r3 >= r1) goto L1d
            char r1 = r0.charAt(r3)     // Catch: java.lang.Exception -> L1b
            int r1 = r1 - r3
            char r1 = (char) r1     // Catch: java.lang.Exception -> L1b
            r0.setCharAt(r3, r1)     // Catch: java.lang.Exception -> L1b
            int r3 = r3 + 1
            goto L9
        L1b:
            r3 = move-exception
            goto L22
        L1d:
            java.lang.String r3 = r0.toString()     // Catch: java.lang.Exception -> L1b
            return r3
        L22:
            xyz.adscope.common.v2.log.SDKLog.stack(r3)
            java.lang.String r3 = ""
            return r3
    }

    public static xyz.adscope.common.v2.encrypt.EncryptConfig valueOf(java.lang.String r1) {
            java.lang.Class<xyz.adscope.common.v2.encrypt.EncryptConfig> r0 = xyz.adscope.common.v2.encrypt.EncryptConfig.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            xyz.adscope.common.v2.encrypt.EncryptConfig r1 = (xyz.adscope.common.v2.encrypt.EncryptConfig) r1
            return r1
    }

    public static xyz.adscope.common.v2.encrypt.EncryptConfig[] values() {
            xyz.adscope.common.v2.encrypt.EncryptConfig[] r0 = xyz.adscope.common.v2.encrypt.EncryptConfig.$VALUES
            java.lang.Object r0 = r0.clone()
            xyz.adscope.common.v2.encrypt.EncryptConfig[] r0 = (xyz.adscope.common.v2.encrypt.EncryptConfig[]) r0
            return r0
    }

    @Override // xyz.adscope.common.v2.encrypt.impl.AesUtil.IAESConfig
    public java.lang.String generateAesKey() {
            r1 = this;
            java.lang.String r0 = r1.mKey
            java.lang.String r0 = r1.decryptStr(r0)
            return r0
    }

    @Override // xyz.adscope.common.v2.encrypt.impl.AesUtil.IAESConfig
    public java.lang.String generateAesVector() {
            r1 = this;
            java.lang.String r0 = r1.mVector
            java.lang.String r0 = r1.decryptStr(r0)
            return r0
    }
}

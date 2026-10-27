package xyz.adscope.common.v2.encrypt;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface ILinkedEncrypt {
    public static final java.lang.String DEFAULT_CONFIG_PATTERN = "101,1001";
    public static final java.lang.String DEFAULT_DEF_CFG_PATTERN = "1001";
    public static final java.lang.String DEFAULT_ENCRYPT_PATTERN = "101,1001";

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum B64Model extends java.lang.Enum<xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model> {
        private static final /* synthetic */ xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model[] $VALUES = null;
        public static final xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model AS_LAST_OR_FIRST = null;
        public static final xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model NOT_APPEND = null;
        public static final xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model STEP_BY_STEP = null;

        private static /* synthetic */ xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model[] $values() {
                r0 = 3
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model[] r0 = new xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model[r0]
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r1 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.STEP_BY_STEP
                r2 = 0
                r0[r2] = r1
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r1 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.AS_LAST_OR_FIRST
                r2 = 1
                r0[r2] = r1
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r1 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.NOT_APPEND
                r2 = 2
                r0[r2] = r1
                return r0
        }

        static {
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r0 = new xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model
                java.lang.String r1 = "STEP_BY_STEP"
                r2 = 0
                r0.<init>(r1, r2)
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.STEP_BY_STEP = r0
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r0 = new xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model
                java.lang.String r1 = "AS_LAST_OR_FIRST"
                r2 = 1
                r0.<init>(r1, r2)
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.AS_LAST_OR_FIRST = r0
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r0 = new xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model
                java.lang.String r1 = "NOT_APPEND"
                r2 = 2
                r0.<init>(r1, r2)
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.NOT_APPEND = r0
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model[] r0 = $values()
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.$VALUES = r0
                return
        }

        B64Model(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model valueOf(java.lang.String r1) {
                java.lang.Class<xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model> r0 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model r1 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model) r1
                return r1
        }

        public static xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model[] values() {
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model[] r0 = xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model.$VALUES
                java.lang.Object r0 = r0.clone()
                xyz.adscope.common.v2.encrypt.ILinkedEncrypt$B64Model[] r0 = (xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model[]) r0
                return r0
        }
    }

    java.lang.String decrypt(java.lang.String r1, java.lang.String r2, xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model r3, boolean r4);

    byte[] decrypt(byte[] r1, java.lang.String r2, xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model r3, boolean r4);

    java.lang.String encrypt(java.lang.String r1, java.lang.String r2, xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model r3, boolean r4);

    byte[] encrypt(byte[] r1, java.lang.String r2, xyz.adscope.common.v2.encrypt.ILinkedEncrypt.B64Model r3, boolean r4);

    void initAesConfig(xyz.adscope.common.v2.encrypt.impl.AesUtil.IAESConfig r1);
}

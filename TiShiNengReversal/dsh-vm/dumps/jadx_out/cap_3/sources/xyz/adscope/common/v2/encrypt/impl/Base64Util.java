package xyz.adscope.common.v2.encrypt.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class Base64Util implements xyz.adscope.common.v2.encrypt.impl.IBaseEncrypt {
    private static final int BASE64_FLAG = 2;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.encrypt.impl.Base64Util$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.encrypt.impl.Base64Util instance;

        static {
                xyz.adscope.common.v2.encrypt.impl.Base64Util r0 = new xyz.adscope.common.v2.encrypt.impl.Base64Util
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.encrypt.impl.Base64Util.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.encrypt.impl.Base64Util access$100() {
                xyz.adscope.common.v2.encrypt.impl.Base64Util r0 = xyz.adscope.common.v2.encrypt.impl.Base64Util.InstanceHolder.instance
                return r0
        }
    }

    private Base64Util() {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.v2.encrypt.impl.Base64Util r0 = xyz.adscope.common.v2.encrypt.impl.Base64Util.InstanceHolder.access$100()
            if (r0 != 0) goto La
            return
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ Base64Util(xyz.adscope.common.v2.encrypt.impl.Base64Util.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static byte[] decodeToByteArray(java.lang.String r1) {
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch: java.lang.Exception -> L6
            return r1
        L6:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            r1 = 0
            return r1
    }

    public static byte[] decodeToByteArray(byte[] r1) {
            r0 = 2
            byte[] r1 = android.util.Base64.decode(r1, r0)     // Catch: java.lang.Exception -> L6
            return r1
        L6:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            r1 = 0
            return r1
    }

    public static java.lang.String decodeToString(java.lang.String r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> Lb
            r1 = 2
            byte[] r2 = android.util.Base64.decode(r2, r1)     // Catch: java.lang.Exception -> Lb
            r0.<init>(r2)     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
            r2 = 0
            return r2
    }

    public static java.lang.String decodeToString(byte[] r2) {
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Exception -> Lb
            r1 = 2
            byte[] r2 = android.util.Base64.decode(r2, r1)     // Catch: java.lang.Exception -> Lb
            r0.<init>(r2)     // Catch: java.lang.Exception -> Lb
            return r0
        Lb:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
            r2 = 0
            return r2
    }

    public static byte[] encodeToByteArray(java.lang.String r1) {
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> La
            r0 = 2
            byte[] r1 = android.util.Base64.encode(r1, r0)     // Catch: java.lang.Exception -> La
            return r1
        La:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            r1 = 0
            return r1
    }

    public static byte[] encodeToByteArray(byte[] r1) {
            r0 = 2
            byte[] r1 = android.util.Base64.encode(r1, r0)     // Catch: java.lang.Exception -> L6
            return r1
        L6:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            r1 = 0
            return r1
    }

    public static java.lang.String encodeToString(java.lang.String r1) {
            byte[] r1 = r1.getBytes()     // Catch: java.lang.Exception -> La
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.lang.Exception -> La
            return r1
        La:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            r1 = 0
            return r1
    }

    public static java.lang.String encodeToString(byte[] r1) {
            r0 = 2
            java.lang.String r1 = android.util.Base64.encodeToString(r1, r0)     // Catch: java.lang.Exception -> L6
            return r1
        L6:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            r1 = 0
            return r1
    }

    static xyz.adscope.common.v2.encrypt.impl.Base64Util getInstance() {
            xyz.adscope.common.v2.encrypt.impl.Base64Util r0 = xyz.adscope.common.v2.encrypt.impl.Base64Util.InstanceHolder.access$100()
            return r0
    }

    @Override // xyz.adscope.common.v2.encrypt.impl.IBaseEncrypt
    public byte[] decode(byte[] r2) {
            r1 = this;
            r0 = 2
            byte[] r2 = android.util.Base64.decode(r2, r0)     // Catch: java.lang.Exception -> L6
            return r2
        L6:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
            r2 = 0
            return r2
    }

    @Override // xyz.adscope.common.v2.encrypt.impl.IBaseEncrypt
    public byte[] encode(byte[] r2) {
            r1 = this;
            r0 = 2
            byte[] r2 = android.util.Base64.encode(r2, r0)     // Catch: java.lang.Exception -> L6
            return r2
        L6:
            r2 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r2)
            r2 = 0
            return r2
    }
}

package xyz.adscope.common.v2.encrypt.impl;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class GzipUtil implements xyz.adscope.common.v2.encrypt.impl.IBaseEncrypt {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.v2.encrypt.impl.GzipUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class InstanceHolder {
        private static xyz.adscope.common.v2.encrypt.impl.GzipUtil instance;

        static {
                xyz.adscope.common.v2.encrypt.impl.GzipUtil r0 = new xyz.adscope.common.v2.encrypt.impl.GzipUtil
                r1 = 0
                r0.<init>(r1)
                xyz.adscope.common.v2.encrypt.impl.GzipUtil.InstanceHolder.instance = r0
                return
        }

        private InstanceHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        static /* synthetic */ xyz.adscope.common.v2.encrypt.impl.GzipUtil access$100() {
                xyz.adscope.common.v2.encrypt.impl.GzipUtil r0 = xyz.adscope.common.v2.encrypt.impl.GzipUtil.InstanceHolder.instance
                return r0
        }
    }

    private GzipUtil() {
            r2 = this;
            r2.<init>()
            xyz.adscope.common.v2.encrypt.impl.GzipUtil r0 = xyz.adscope.common.v2.encrypt.impl.GzipUtil.InstanceHolder.access$100()
            if (r0 != 0) goto La
            return
        La:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "Singleton ..."
            r0.<init>(r1)
            throw r0
    }

    /* synthetic */ GzipUtil(xyz.adscope.common.v2.encrypt.impl.GzipUtil.AnonymousClass1 r1) {
            r0 = this;
            r0.<init>()
            return
    }

    private static void closeStream(java.io.Closeable r0) {
            if (r0 == 0) goto La
            r0.close()     // Catch: java.io.IOException -> L6
            return
        L6:
            r0 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r0)
        La:
            return
    }

    public static byte[] compress(byte[] r3) {
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            r1.<init>()     // Catch: java.lang.Throwable -> L27 java.io.IOException -> L2a
            java.util.zip.GZIPOutputStream r2 = new java.util.zip.GZIPOutputStream     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L22 java.io.IOException -> L24
            r2.write(r3)     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            r2.close()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            byte[] r3 = r1.toByteArray()     // Catch: java.lang.Throwable -> L1c java.io.IOException -> L1e
            closeStream(r2)
            closeStream(r1)
            return r3
        L1c:
            r3 = move-exception
            goto L20
        L1e:
            r3 = move-exception
            goto L2d
        L20:
            r0 = r2
            goto L3b
        L22:
            r3 = move-exception
            goto L3b
        L24:
            r3 = move-exception
            r2 = r0
            goto L2d
        L27:
            r3 = move-exception
            r2 = r0
            goto L39
        L2a:
            r3 = move-exception
            r1 = r0
            r2 = r1
        L2d:
            xyz.adscope.common.v2.log.SDKLog.stack(r3)     // Catch: java.lang.Throwable -> L37
            closeStream(r2)
            closeStream(r1)
            return r0
        L37:
            r3 = move-exception
            r0 = r1
        L39:
            r1 = r0
            goto L20
        L3b:
            closeStream(r0)
            closeStream(r1)
            throw r3
    }

    static xyz.adscope.common.v2.encrypt.impl.GzipUtil getInstance() {
            xyz.adscope.common.v2.encrypt.impl.GzipUtil r0 = xyz.adscope.common.v2.encrypt.impl.GzipUtil.InstanceHolder.access$100()
            return r0
    }

    public static byte[] uncompress(byte[] r7) {
            r0 = 0
            java.io.ByteArrayOutputStream r1 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L52
            r1.<init>()     // Catch: java.lang.Throwable -> L4e java.io.IOException -> L52
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            r2.<init>(r7)     // Catch: java.lang.Throwable -> L42 java.io.IOException -> L44
            java.util.zip.GZIPInputStream r7 = new java.util.zip.GZIPInputStream     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L37 java.io.IOException -> L39
            r3 = 2048(0x800, float:2.87E-42)
            byte[] r3 = new byte[r3]     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L21
        L14:
            int r4 = r7.read(r3)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L21
            if (r4 < 0) goto L23
            r5 = 0
            r1.write(r3, r5, r4)     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L21
            goto L14
        L1f:
            r0 = move-exception
            goto L31
        L21:
            r3 = move-exception
            goto L56
        L23:
            byte[] r0 = r1.toByteArray()     // Catch: java.lang.Throwable -> L1f java.io.IOException -> L21
            closeStream(r7)
            closeStream(r2)
            closeStream(r1)
            return r0
        L31:
            r6 = r1
            r1 = r0
        L33:
            r0 = r2
            r2 = r6
            goto L6e
        L37:
            r7 = move-exception
            goto L3c
        L39:
            r7 = move-exception
            r3 = r7
            goto L40
        L3c:
            r6 = r1
            r1 = r7
            r7 = r0
            goto L33
        L40:
            r7 = r0
            goto L56
        L42:
            r7 = move-exception
            goto L47
        L44:
            r7 = move-exception
            r3 = r7
            goto L4b
        L47:
            r2 = r1
            r1 = r7
            r7 = r0
            goto L6e
        L4b:
            r7 = r0
            r2 = r7
            goto L56
        L4e:
            r7 = move-exception
            r1 = r0
            r2 = r1
            goto L68
        L52:
            r3 = move-exception
            r7 = r0
            r1 = r7
            r2 = r1
        L56:
            xyz.adscope.common.v2.log.SDKLog.stack(r3)     // Catch: java.lang.Throwable -> L63
            closeStream(r7)
            closeStream(r2)
            closeStream(r1)
            return r0
        L63:
            r0 = move-exception
            r6 = r1
            r1 = r7
            r7 = r0
            r0 = r6
        L68:
            r6 = r1
            r1 = r7
            r7 = r6
            r6 = r2
            r2 = r0
            r0 = r6
        L6e:
            closeStream(r7)
            closeStream(r0)
            closeStream(r2)
            throw r1
    }

    @Override // xyz.adscope.common.v2.encrypt.impl.IBaseEncrypt
    public byte[] decode(byte[] r1) {
            r0 = this;
            byte[] r1 = uncompress(r1)     // Catch: java.io.IOException -> L5
            return r1
        L5:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            r1 = 0
            return r1
    }

    @Override // xyz.adscope.common.v2.encrypt.impl.IBaseEncrypt
    public byte[] encode(byte[] r1) {
            r0 = this;
            byte[] r1 = compress(r1)     // Catch: java.io.IOException -> L5
            return r1
        L5:
            r1 = move-exception
            xyz.adscope.common.v2.log.SDKLog.stack(r1)
            r1 = 0
            return r1
    }
}

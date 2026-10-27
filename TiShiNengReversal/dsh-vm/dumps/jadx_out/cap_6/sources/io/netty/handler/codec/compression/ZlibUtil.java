package io.netty.handler.codec.compression;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
final class ZlibUtil {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: io.netty.handler.codec.compression.ZlibUtil$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$netty$handler$codec$compression$ZlibWrapper = null;

        static {
                io.netty.handler.codec.compression.ZlibWrapper[] r0 = io.netty.handler.codec.compression.ZlibWrapper.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                io.netty.handler.codec.compression.ZlibUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper = r0
                io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.NONE     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = io.netty.handler.codec.compression.ZlibUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper     // Catch: java.lang.NoSuchFieldError -> L1d
                io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                int[] r0 = io.netty.handler.codec.compression.ZlibUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper     // Catch: java.lang.NoSuchFieldError -> L28
                io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.GZIP     // Catch: java.lang.NoSuchFieldError -> L28
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r2 = 3
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                int[] r0 = io.netty.handler.codec.compression.ZlibUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper     // Catch: java.lang.NoSuchFieldError -> L33
                io.netty.handler.codec.compression.ZlibWrapper r1 = io.netty.handler.codec.compression.ZlibWrapper.ZLIB_OR_NONE     // Catch: java.lang.NoSuchFieldError -> L33
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r2 = 4
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                return
        }

        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    private ZlibUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static com.jcraft.jzlib.JZlib.WrapperType convertWrapperType(io.netty.handler.codec.compression.ZlibWrapper r1) {
            int[] r0 = io.netty.handler.codec.compression.ZlibUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L23
            r0 = 2
            if (r1 == r0) goto L20
            r0 = 3
            if (r1 == r0) goto L1d
            r0 = 4
            if (r1 != r0) goto L17
            com.jcraft.jzlib.JZlib$WrapperType r1 = com.jcraft.jzlib.JZlib.W_ANY
            return r1
        L17:
            java.lang.Error r1 = new java.lang.Error
            r1.<init>()
            throw r1
        L1d:
            com.jcraft.jzlib.JZlib$WrapperType r1 = com.jcraft.jzlib.JZlib.W_GZIP
            return r1
        L20:
            com.jcraft.jzlib.JZlib$WrapperType r1 = com.jcraft.jzlib.JZlib.W_ZLIB
            return r1
        L23:
            com.jcraft.jzlib.JZlib$WrapperType r1 = com.jcraft.jzlib.JZlib.W_NONE
            return r1
    }

    static io.netty.handler.codec.compression.CompressionException deflaterException(com.jcraft.jzlib.Deflater r2, java.lang.String r3, int r4) {
            io.netty.handler.codec.compression.CompressionException r0 = new io.netty.handler.codec.compression.CompressionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " ("
            r1.append(r3)
            r1.append(r4)
            r3 = 41
            r1.append(r3)
            java.lang.String r3 = r2.msg
            if (r3 == 0) goto L2f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ": "
            r3.append(r4)
            java.lang.String r2 = r2.msg
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L31
        L2f:
            java.lang.String r2 = ""
        L31:
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            return r0
    }

    static void fail(com.jcraft.jzlib.Deflater r0, java.lang.String r1, int r2) {
            io.netty.handler.codec.compression.CompressionException r0 = deflaterException(r0, r1, r2)
            throw r0
    }

    static void fail(com.jcraft.jzlib.Inflater r0, java.lang.String r1, int r2) {
            io.netty.handler.codec.compression.DecompressionException r0 = inflaterException(r0, r1, r2)
            throw r0
    }

    static io.netty.handler.codec.compression.DecompressionException inflaterException(com.jcraft.jzlib.Inflater r2, java.lang.String r3, int r4) {
            io.netty.handler.codec.compression.DecompressionException r0 = new io.netty.handler.codec.compression.DecompressionException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            java.lang.String r3 = " ("
            r1.append(r3)
            r1.append(r4)
            r3 = 41
            r1.append(r3)
            java.lang.String r3 = r2.msg
            if (r3 == 0) goto L2f
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = ": "
            r3.append(r4)
            java.lang.String r2 = r2.msg
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            goto L31
        L2f:
            java.lang.String r2 = ""
        L31:
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            return r0
    }

    static int wrapperOverhead(io.netty.handler.codec.compression.ZlibWrapper r2) {
            int[] r0 = io.netty.handler.codec.compression.ZlibUtil.AnonymousClass1.$SwitchMap$io$netty$handler$codec$compression$ZlibWrapper
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L1f
            r0 = 2
            if (r2 == r0) goto L1e
            r1 = 3
            if (r2 == r1) goto L1b
            r1 = 4
            if (r2 != r1) goto L15
            goto L1e
        L15:
            java.lang.Error r2 = new java.lang.Error
            r2.<init>()
            throw r2
        L1b:
            r2 = 10
            return r2
        L1e:
            return r0
        L1f:
            r2 = 0
            return r2
    }
}

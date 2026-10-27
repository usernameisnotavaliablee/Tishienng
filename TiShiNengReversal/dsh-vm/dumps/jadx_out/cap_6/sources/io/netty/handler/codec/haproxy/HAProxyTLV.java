package io.netty.handler.codec.haproxy;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class HAProxyTLV extends io.netty.buffer.DefaultByteBufHolder {
    private final io.netty.handler.codec.haproxy.HAProxyTLV.Type type;
    private final byte typeByteValue;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum Type extends java.lang.Enum<io.netty.handler.codec.haproxy.HAProxyTLV.Type> {
        private static final /* synthetic */ io.netty.handler.codec.haproxy.HAProxyTLV.Type[] $VALUES = null;
        public static final io.netty.handler.codec.haproxy.HAProxyTLV.Type OTHER = null;
        public static final io.netty.handler.codec.haproxy.HAProxyTLV.Type PP2_TYPE_ALPN = null;
        public static final io.netty.handler.codec.haproxy.HAProxyTLV.Type PP2_TYPE_AUTHORITY = null;
        public static final io.netty.handler.codec.haproxy.HAProxyTLV.Type PP2_TYPE_NETNS = null;
        public static final io.netty.handler.codec.haproxy.HAProxyTLV.Type PP2_TYPE_SSL = null;
        public static final io.netty.handler.codec.haproxy.HAProxyTLV.Type PP2_TYPE_SSL_CN = null;
        public static final io.netty.handler.codec.haproxy.HAProxyTLV.Type PP2_TYPE_SSL_VERSION = null;

        static {
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r0 = new io.netty.handler.codec.haproxy.HAProxyTLV$Type
                java.lang.String r1 = "PP2_TYPE_ALPN"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_ALPN = r0
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = new io.netty.handler.codec.haproxy.HAProxyTLV$Type
                java.lang.String r3 = "PP2_TYPE_AUTHORITY"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_AUTHORITY = r1
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r3 = new io.netty.handler.codec.haproxy.HAProxyTLV$Type
                java.lang.String r5 = "PP2_TYPE_SSL"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_SSL = r3
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r5 = new io.netty.handler.codec.haproxy.HAProxyTLV$Type
                java.lang.String r7 = "PP2_TYPE_SSL_VERSION"
                r8 = 3
                r5.<init>(r7, r8)
                io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_SSL_VERSION = r5
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r7 = new io.netty.handler.codec.haproxy.HAProxyTLV$Type
                java.lang.String r9 = "PP2_TYPE_SSL_CN"
                r10 = 4
                r7.<init>(r9, r10)
                io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_SSL_CN = r7
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r9 = new io.netty.handler.codec.haproxy.HAProxyTLV$Type
                java.lang.String r11 = "PP2_TYPE_NETNS"
                r12 = 5
                r9.<init>(r11, r12)
                io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_NETNS = r9
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r11 = new io.netty.handler.codec.haproxy.HAProxyTLV$Type
                java.lang.String r13 = "OTHER"
                r14 = 6
                r11.<init>(r13, r14)
                io.netty.handler.codec.haproxy.HAProxyTLV.Type.OTHER = r11
                r13 = 7
                io.netty.handler.codec.haproxy.HAProxyTLV$Type[] r13 = new io.netty.handler.codec.haproxy.HAProxyTLV.Type[r13]
                r13[r2] = r0
                r13[r4] = r1
                r13[r6] = r3
                r13[r8] = r5
                r13[r10] = r7
                r13[r12] = r9
                r13[r14] = r11
                io.netty.handler.codec.haproxy.HAProxyTLV.Type.$VALUES = r13
                return
        }

        Type(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.haproxy.HAProxyTLV.Type typeForByteValue(byte r1) {
                r0 = 1
                if (r1 == r0) goto L1f
                r0 = 2
                if (r1 == r0) goto L1c
                r0 = 48
                if (r1 == r0) goto L19
                switch(r1) {
                    case 32: goto L16;
                    case 33: goto L13;
                    case 34: goto L10;
                    default: goto Ld;
                }
            Ld:
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.OTHER
                return r1
            L10:
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_SSL_CN
                return r1
            L13:
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_SSL_VERSION
                return r1
            L16:
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_SSL
                return r1
            L19:
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_NETNS
                return r1
            L1c:
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_AUTHORITY
                return r1
            L1f:
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.PP2_TYPE_ALPN
                return r1
        }

        public static io.netty.handler.codec.haproxy.HAProxyTLV.Type valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.haproxy.HAProxyTLV$Type> r0 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = (io.netty.handler.codec.haproxy.HAProxyTLV.Type) r1
                return r1
        }

        public static io.netty.handler.codec.haproxy.HAProxyTLV.Type[] values() {
                io.netty.handler.codec.haproxy.HAProxyTLV$Type[] r0 = io.netty.handler.codec.haproxy.HAProxyTLV.Type.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.haproxy.HAProxyTLV$Type[] r0 = (io.netty.handler.codec.haproxy.HAProxyTLV.Type[]) r0
                return r0
        }
    }

    HAProxyTLV(io.netty.handler.codec.haproxy.HAProxyTLV.Type r1, byte r2, io.netty.buffer.ByteBuf r3) {
            r0 = this;
            r0.<init>(r3)
            java.lang.String r3 = "type"
            io.netty.util.internal.ObjectUtil.checkNotNull(r1, r3)
            r0.type = r1
            r0.typeByteValue = r2
            return
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder copy() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV r0 = r1.copy()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.haproxy.HAProxyTLV copy() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.copy()
            io.netty.handler.codec.haproxy.HAProxyTLV r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder duplicate() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV r0 = r1.duplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.haproxy.HAProxyTLV duplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.duplicate()
            io.netty.handler.codec.haproxy.HAProxyTLV r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder replace(io.netty.buffer.ByteBuf r1) {
            r0 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV r1 = r0.replace(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.haproxy.HAProxyTLV replace(io.netty.buffer.ByteBuf r4) {
            r3 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV r0 = new io.netty.handler.codec.haproxy.HAProxyTLV
            io.netty.handler.codec.haproxy.HAProxyTLV$Type r1 = r3.type
            byte r2 = r3.typeByteValue
            r0.<init>(r1, r2, r4)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo39retain() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo40retain(int r1) {
            r0 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.haproxy.HAProxyTLV mo39retain() {
            r0 = this;
            super.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: retain */
    public io.netty.handler.codec.haproxy.HAProxyTLV mo40retain(int r1) {
            r0 = this;
            super.mo40retain(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo8retain() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV r0 = r1.mo39retain()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: retain */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo9retain(int r1) {
            r0 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV r1 = r0.mo40retain(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder retainedDuplicate() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV r0 = r1.retainedDuplicate()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    public io.netty.handler.codec.haproxy.HAProxyTLV retainedDuplicate() {
            r1 = this;
            io.netty.buffer.ByteBuf r0 = r1.content()
            io.netty.buffer.ByteBuf r0 = r0.retainedDuplicate()
            io.netty.handler.codec.haproxy.HAProxyTLV r0 = r1.replace(r0)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo41touch() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.buffer.ByteBufHolder mo42touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV r1 = r0.mo42touch(r1)
            return r1
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.haproxy.HAProxyTLV mo41touch() {
            r0 = this;
            super.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder, io.netty.buffer.ByteBufHolder
    /* renamed from: touch */
    public io.netty.handler.codec.haproxy.HAProxyTLV mo42touch(java.lang.Object r1) {
            r0 = this;
            super.mo42touch(r1)
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo10touch() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV r0 = r1.mo41touch()
            return r0
    }

    @Override // io.netty.buffer.DefaultByteBufHolder
    /* renamed from: touch */
    public /* bridge */ /* synthetic */ io.netty.util.ReferenceCounted mo11touch(java.lang.Object r1) {
            r0 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV r1 = r0.mo42touch(r1)
            return r1
    }

    public io.netty.handler.codec.haproxy.HAProxyTLV.Type type() {
            r1 = this;
            io.netty.handler.codec.haproxy.HAProxyTLV$Type r0 = r1.type
            return r0
    }

    public byte typeByteValue() {
            r1 = this;
            byte r0 = r1.typeByteValue
            return r0
    }
}

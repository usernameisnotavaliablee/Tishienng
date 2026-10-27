package io.netty.handler.codec.http.multipart;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface InterfaceHttpData extends java.lang.Comparable<io.netty.handler.codec.http.multipart.InterfaceHttpData>, io.netty.util.ReferenceCounted {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public enum HttpDataType extends java.lang.Enum<io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType> {
        private static final /* synthetic */ io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType[] $VALUES = null;
        public static final io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType Attribute = null;
        public static final io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType FileUpload = null;
        public static final io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType InternalAttribute = null;

        static {
                io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType r0 = new io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType
                java.lang.String r1 = "Attribute"
                r2 = 0
                r0.<init>(r1, r2)
                io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType.Attribute = r0
                io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType r1 = new io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType
                java.lang.String r3 = "FileUpload"
                r4 = 1
                r1.<init>(r3, r4)
                io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType.FileUpload = r1
                io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType r3 = new io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType
                java.lang.String r5 = "InternalAttribute"
                r6 = 2
                r3.<init>(r5, r6)
                io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType.InternalAttribute = r3
                r5 = 3
                io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType[] r5 = new io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType[r5]
                r5[r2] = r0
                r5[r4] = r1
                r5[r6] = r3
                io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType.$VALUES = r5
                return
        }

        HttpDataType(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType valueOf(java.lang.String r1) {
                java.lang.Class<io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType> r0 = io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType r1 = (io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType) r1
                return r1
        }

        public static io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType[] values() {
                io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType[] r0 = io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType.$VALUES
                java.lang.Object r0 = r0.clone()
                io.netty.handler.codec.http.multipart.InterfaceHttpData$HttpDataType[] r0 = (io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType[]) r0
                return r0
        }
    }

    io.netty.handler.codec.http.multipart.InterfaceHttpData.HttpDataType getHttpDataType();

    java.lang.String getName();

    /* renamed from: retain */
    io.netty.handler.codec.http.multipart.InterfaceHttpData mo39retain();

    /* renamed from: retain */
    io.netty.handler.codec.http.multipart.InterfaceHttpData mo40retain(int r1);

    /* renamed from: touch */
    io.netty.handler.codec.http.multipart.InterfaceHttpData mo41touch();

    /* renamed from: touch */
    io.netty.handler.codec.http.multipart.InterfaceHttpData mo42touch(java.lang.Object r1);
}

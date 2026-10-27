package io.netty.handler.codec.base64;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum Base64Dialect extends java.lang.Enum<io.netty.handler.codec.base64.Base64Dialect> {
    private static final /* synthetic */ io.netty.handler.codec.base64.Base64Dialect[] $VALUES = null;
    public static final io.netty.handler.codec.base64.Base64Dialect ORDERED = null;
    public static final io.netty.handler.codec.base64.Base64Dialect STANDARD = null;
    public static final io.netty.handler.codec.base64.Base64Dialect URL_SAFE = null;
    final byte[] alphabet;
    final boolean breakLinesByDefault;
    final byte[] decodabet;

    static {
            io.netty.handler.codec.base64.Base64Dialect r0 = new io.netty.handler.codec.base64.Base64Dialect
            r1 = 64
            byte[] r3 = new byte[r1]
            r3 = {x005a: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47} // fill-array
            r1 = 127(0x7f, float:1.78E-43)
            byte[] r4 = new byte[r1]
            r4 = {x007e: FILL_ARRAY_DATA , data: [-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, -9, 63, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, -9, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9} // fill-array
            r5 = 1
            java.lang.String r1 = "STANDARD"
            r2 = 0
            r0.<init>(r1, r2, r3, r4, r5)
            io.netty.handler.codec.base64.Base64Dialect.STANDARD = r0
            io.netty.handler.codec.base64.Base64Dialect r1 = new io.netty.handler.codec.base64.Base64Dialect
            r2 = 64
            byte[] r4 = new byte[r2]
            r4 = {x00c2: FILL_ARRAY_DATA , data: [65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95} // fill-array
            r2 = 127(0x7f, float:1.78E-43)
            byte[] r5 = new byte[r2]
            r5 = {x00e6: FILL_ARRAY_DATA , data: [-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 62, -9, -9, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, -9, -9, -9, -1, -9, -9, -9, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, -9, -9, -9, -9, 63, -9, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, -9, -9, -9, -9} // fill-array
            r6 = 0
            java.lang.String r2 = "URL_SAFE"
            r3 = 1
            r1.<init>(r2, r3, r4, r5, r6)
            io.netty.handler.codec.base64.Base64Dialect.URL_SAFE = r1
            io.netty.handler.codec.base64.Base64Dialect r2 = new io.netty.handler.codec.base64.Base64Dialect
            r3 = 64
            byte[] r5 = new byte[r3]
            r5 = {x012a: FILL_ARRAY_DATA , data: [45, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 95, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122} // fill-array
            r3 = 127(0x7f, float:1.78E-43)
            byte[] r6 = new byte[r3]
            r6 = {x014e: FILL_ARRAY_DATA , data: [-9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -5, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -5, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, -9, 0, -9, -9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -9, -9, -9, -1, -9, -9, -9, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, -9, -9, -9, -9, 37, -9, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, -9, -9, -9, -9} // fill-array
            r7 = 1
            java.lang.String r3 = "ORDERED"
            r4 = 2
            r2.<init>(r3, r4, r5, r6, r7)
            io.netty.handler.codec.base64.Base64Dialect.ORDERED = r2
            r3 = 3
            io.netty.handler.codec.base64.Base64Dialect[] r3 = new io.netty.handler.codec.base64.Base64Dialect[r3]
            r4 = 0
            r3[r4] = r0
            r0 = 1
            r3[r0] = r1
            r0 = 2
            r3[r0] = r2
            io.netty.handler.codec.base64.Base64Dialect.$VALUES = r3
            return
    }

    Base64Dialect(java.lang.String r1, int r2, byte[] r3, byte[] r4, boolean r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.alphabet = r3
            r0.decodabet = r4
            r0.breakLinesByDefault = r5
            return
    }

    public static io.netty.handler.codec.base64.Base64Dialect valueOf(java.lang.String r1) {
            java.lang.Class<io.netty.handler.codec.base64.Base64Dialect> r0 = io.netty.handler.codec.base64.Base64Dialect.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            io.netty.handler.codec.base64.Base64Dialect r1 = (io.netty.handler.codec.base64.Base64Dialect) r1
            return r1
    }

    public static io.netty.handler.codec.base64.Base64Dialect[] values() {
            io.netty.handler.codec.base64.Base64Dialect[] r0 = io.netty.handler.codec.base64.Base64Dialect.$VALUES
            java.lang.Object r0 = r0.clone()
            io.netty.handler.codec.base64.Base64Dialect[] r0 = (io.netty.handler.codec.base64.Base64Dialect[]) r0
            return r0
    }
}

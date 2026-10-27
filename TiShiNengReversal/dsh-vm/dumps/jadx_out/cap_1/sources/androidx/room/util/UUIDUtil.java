package androidx.room.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
@kotlin.jvm.JvmName(name = "UUIDUtil")
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
public final class UUIDUtil {
    @org.jetbrains.annotations.NotNull
    public static final java.util.UUID convertByteToUUID(@org.jetbrains.annotations.NotNull byte[] r4) {
            java.lang.String r0 = "bytes"
            kotlin.jvm.internal.g0.p(r4, r0)
            java.nio.ByteBuffer r4 = java.nio.ByteBuffer.wrap(r4)
            long r0 = r4.getLong()
            long r2 = r4.getLong()
            java.util.UUID r4 = new java.util.UUID
            r4.<init>(r0, r2)
            return r4
    }

    @org.jetbrains.annotations.NotNull
    public static final byte[] convertUUIDToByte(@org.jetbrains.annotations.NotNull java.util.UUID r3) {
            java.lang.String r0 = "uuid"
            kotlin.jvm.internal.g0.p(r3, r0)
            r0 = 16
            byte[] r0 = new byte[r0]
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            long r1 = r3.getMostSignificantBits()
            r0.putLong(r1)
            long r1 = r3.getLeastSignificantBits()
            r0.putLong(r1)
            byte[] r3 = r0.array()
            java.lang.String r0 = "array(...)"
            kotlin.jvm.internal.g0.o(r3, r0)
            return r3
    }
}

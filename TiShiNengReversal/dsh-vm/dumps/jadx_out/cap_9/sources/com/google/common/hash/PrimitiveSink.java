package com.google.common.hash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface PrimitiveSink {
    com.google.common.hash.PrimitiveSink putBoolean(boolean r1);

    com.google.common.hash.PrimitiveSink putByte(byte r1);

    com.google.common.hash.PrimitiveSink putBytes(java.nio.ByteBuffer r1);

    com.google.common.hash.PrimitiveSink putBytes(byte[] r1);

    com.google.common.hash.PrimitiveSink putBytes(byte[] r1, int r2, int r3);

    com.google.common.hash.PrimitiveSink putChar(char r1);

    com.google.common.hash.PrimitiveSink putDouble(double r1);

    com.google.common.hash.PrimitiveSink putFloat(float r1);

    com.google.common.hash.PrimitiveSink putInt(int r1);

    com.google.common.hash.PrimitiveSink putLong(long r1);

    com.google.common.hash.PrimitiveSink putShort(short r1);

    com.google.common.hash.PrimitiveSink putString(java.lang.CharSequence r1, java.nio.charset.Charset r2);

    com.google.common.hash.PrimitiveSink putUnencodedChars(java.lang.CharSequence r1);
}

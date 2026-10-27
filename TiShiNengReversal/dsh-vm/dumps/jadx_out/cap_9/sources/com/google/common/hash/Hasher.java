package com.google.common.hash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.CanIgnoreReturnValue
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface Hasher extends com.google.common.hash.PrimitiveSink {
    com.google.common.hash.HashCode hash();

    @java.lang.Deprecated
    int hashCode();

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putBoolean(boolean r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putByte(byte r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putBytes(java.nio.ByteBuffer r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putBytes(byte[] r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putBytes(byte[] r1, int r2, int r3);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putChar(char r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putDouble(double r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putFloat(float r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putInt(int r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putLong(long r1);

    <T> com.google.common.hash.Hasher putObject(T r1, com.google.common.hash.Funnel<? super T> r2);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putShort(short r1);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putString(java.lang.CharSequence r1, java.nio.charset.Charset r2);

    @Override // com.google.common.hash.PrimitiveSink
    com.google.common.hash.Hasher putUnencodedChars(java.lang.CharSequence r1);
}

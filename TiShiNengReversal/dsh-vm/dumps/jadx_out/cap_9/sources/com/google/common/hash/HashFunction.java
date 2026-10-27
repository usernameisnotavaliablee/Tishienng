package com.google.common.hash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.errorprone.annotations.Immutable
@com.google.common.annotations.Beta
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public interface HashFunction {
    int bits();

    com.google.common.hash.HashCode hashBytes(java.nio.ByteBuffer r1);

    com.google.common.hash.HashCode hashBytes(byte[] r1);

    com.google.common.hash.HashCode hashBytes(byte[] r1, int r2, int r3);

    com.google.common.hash.HashCode hashInt(int r1);

    com.google.common.hash.HashCode hashLong(long r1);

    <T> com.google.common.hash.HashCode hashObject(T r1, com.google.common.hash.Funnel<? super T> r2);

    com.google.common.hash.HashCode hashString(java.lang.CharSequence r1, java.nio.charset.Charset r2);

    com.google.common.hash.HashCode hashUnencodedChars(java.lang.CharSequence r1);

    com.google.common.hash.Hasher newHasher();

    com.google.common.hash.Hasher newHasher(int r1);
}

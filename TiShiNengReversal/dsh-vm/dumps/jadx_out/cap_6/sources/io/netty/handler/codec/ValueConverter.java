package io.netty.handler.codec;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface ValueConverter<T> {
    T convertBoolean(boolean r1);

    T convertByte(byte r1);

    T convertChar(char r1);

    T convertDouble(double r1);

    T convertFloat(float r1);

    T convertInt(int r1);

    T convertLong(long r1);

    T convertObject(java.lang.Object r1);

    T convertShort(short r1);

    T convertTimeMillis(long r1);

    boolean convertToBoolean(T r1);

    byte convertToByte(T r1);

    char convertToChar(T r1);

    double convertToDouble(T r1);

    float convertToFloat(T r1);

    int convertToInt(T r1);

    long convertToLong(T r1);

    short convertToShort(T r1);

    long convertToTimeMillis(T r1);
}

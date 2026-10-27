package androidx.emoji2.text.flatbuffer;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_1_sz9857704.dex */
interface ReadBuf {
    byte[] data();

    byte get(int r1);

    boolean getBoolean(int r1);

    double getDouble(int r1);

    float getFloat(int r1);

    int getInt(int r1);

    long getLong(int r1);

    short getShort(int r1);

    java.lang.String getString(int r1, int r2);

    int limit();
}

package io.netty.handler.codec;

import io.netty.handler.codec.Headers;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Headers<K, V, T extends io.netty.handler.codec.Headers<K, V, T>> extends java.lang.Iterable<java.util.Map.Entry<K, V>> {
    T add(io.netty.handler.codec.Headers<? extends K, ? extends V, ?> r1);

    T add(K r1, java.lang.Iterable<? extends V> r2);

    T add(K r1, V r2);

    T add(K r1, V... r2);

    T addBoolean(K r1, boolean r2);

    T addByte(K r1, byte r2);

    T addChar(K r1, char r2);

    T addDouble(K r1, double r2);

    T addFloat(K r1, float r2);

    T addInt(K r1, int r2);

    T addLong(K r1, long r2);

    T addObject(K r1, java.lang.Iterable<?> r2);

    T addObject(K r1, java.lang.Object r2);

    T addObject(K r1, java.lang.Object... r2);

    T addShort(K r1, short r2);

    T addTimeMillis(K r1, long r2);

    T clear();

    boolean contains(K r1);

    boolean contains(K r1, V r2);

    boolean containsBoolean(K r1, boolean r2);

    boolean containsByte(K r1, byte r2);

    boolean containsChar(K r1, char r2);

    boolean containsDouble(K r1, double r2);

    boolean containsFloat(K r1, float r2);

    boolean containsInt(K r1, int r2);

    boolean containsLong(K r1, long r2);

    boolean containsObject(K r1, java.lang.Object r2);

    boolean containsShort(K r1, short r2);

    boolean containsTimeMillis(K r1, long r2);

    V get(K r1);

    V get(K r1, V r2);

    java.util.List<V> getAll(K r1);

    java.util.List<V> getAllAndRemove(K r1);

    V getAndRemove(K r1);

    V getAndRemove(K r1, V r2);

    java.lang.Boolean getBoolean(K r1);

    boolean getBoolean(K r1, boolean r2);

    java.lang.Boolean getBooleanAndRemove(K r1);

    boolean getBooleanAndRemove(K r1, boolean r2);

    byte getByte(K r1, byte r2);

    java.lang.Byte getByte(K r1);

    byte getByteAndRemove(K r1, byte r2);

    java.lang.Byte getByteAndRemove(K r1);

    char getChar(K r1, char r2);

    java.lang.Character getChar(K r1);

    char getCharAndRemove(K r1, char r2);

    java.lang.Character getCharAndRemove(K r1);

    double getDouble(K r1, double r2);

    java.lang.Double getDouble(K r1);

    double getDoubleAndRemove(K r1, double r2);

    java.lang.Double getDoubleAndRemove(K r1);

    float getFloat(K r1, float r2);

    java.lang.Float getFloat(K r1);

    float getFloatAndRemove(K r1, float r2);

    java.lang.Float getFloatAndRemove(K r1);

    int getInt(K r1, int r2);

    java.lang.Integer getInt(K r1);

    int getIntAndRemove(K r1, int r2);

    java.lang.Integer getIntAndRemove(K r1);

    long getLong(K r1, long r2);

    java.lang.Long getLong(K r1);

    long getLongAndRemove(K r1, long r2);

    java.lang.Long getLongAndRemove(K r1);

    java.lang.Short getShort(K r1);

    short getShort(K r1, short r2);

    java.lang.Short getShortAndRemove(K r1);

    short getShortAndRemove(K r1, short r2);

    long getTimeMillis(K r1, long r2);

    java.lang.Long getTimeMillis(K r1);

    long getTimeMillisAndRemove(K r1, long r2);

    java.lang.Long getTimeMillisAndRemove(K r1);

    boolean isEmpty();

    @Override // java.lang.Iterable
    java.util.Iterator<java.util.Map.Entry<K, V>> iterator();

    java.util.Set<K> names();

    boolean remove(K r1);

    T set(io.netty.handler.codec.Headers<? extends K, ? extends V, ?> r1);

    T set(K r1, java.lang.Iterable<? extends V> r2);

    T set(K r1, V r2);

    T set(K r1, V... r2);

    T setAll(io.netty.handler.codec.Headers<? extends K, ? extends V, ?> r1);

    T setBoolean(K r1, boolean r2);

    T setByte(K r1, byte r2);

    T setChar(K r1, char r2);

    T setDouble(K r1, double r2);

    T setFloat(K r1, float r2);

    T setInt(K r1, int r2);

    T setLong(K r1, long r2);

    T setObject(K r1, java.lang.Iterable<?> r2);

    T setObject(K r1, java.lang.Object r2);

    T setObject(K r1, java.lang.Object... r2);

    T setShort(K r1, short r2);

    T setTimeMillis(K r1, long r2);

    int size();
}

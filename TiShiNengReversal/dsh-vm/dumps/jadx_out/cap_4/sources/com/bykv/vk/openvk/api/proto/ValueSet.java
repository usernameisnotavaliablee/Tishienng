package com.bykv.vk.openvk.api.proto;

/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public interface ValueSet {

    @android.annotation.TargetApi(24)
    public interface ValueGetter<T> extends java.util.function.Supplier<T> {
        @Override // java.util.function.Supplier
        T get();
    }

    <T> T[] arrayValue(int r1, java.lang.Class<T> r2);

    boolean booleanValue(int r1);

    boolean booleanValue(int r1, boolean r2);

    boolean containsKey(int r1);

    double doubleValue(int r1);

    float floatValue(int r1);

    float floatValue(int r1, float r2);

    int intValue(int r1);

    int intValue(int r1, int r2);

    boolean isEmpty();

    java.util.Set<java.lang.Integer> keys();

    long longValue(int r1);

    long longValue(int r1, long r2);

    <T> T objectValue(int r1, java.lang.Class<T> r2);

    void remove(int r1);

    int size();

    android.util.SparseArray<java.lang.Object> sparseArray();

    java.lang.String stringValue(int r1);

    java.lang.String stringValue(int r1, java.lang.String r2);
}

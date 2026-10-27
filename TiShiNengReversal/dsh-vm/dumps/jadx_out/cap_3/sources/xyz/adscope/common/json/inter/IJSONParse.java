package xyz.adscope.common.json.inter;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public interface IJSONParse {
    <T> T fromJson(java.lang.String r1, java.lang.Class<T> r2);

    <T> T fromJsonAnnotation(java.lang.String r1, java.lang.Class<T> r2);

    java.lang.String toJson(java.lang.Object r1);
}

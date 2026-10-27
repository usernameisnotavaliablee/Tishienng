package org.slf4j;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public interface Marker extends java.io.Serializable {
    public static final java.lang.String ANY_MARKER = "*";
    public static final java.lang.String ANY_NON_NULL_MARKER = "+";

    void add(org.slf4j.Marker r1);

    boolean contains(java.lang.String r1);

    boolean contains(org.slf4j.Marker r1);

    boolean equals(java.lang.Object r1);

    java.lang.String getName();

    boolean hasChildren();

    boolean hasReferences();

    int hashCode();

    java.util.Iterator<org.slf4j.Marker> iterator();

    boolean remove(org.slf4j.Marker r1);
}

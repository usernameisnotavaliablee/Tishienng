package org.junit.runners;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public enum MethodSorters extends java.lang.Enum<org.junit.runners.MethodSorters> {
    private static final /* synthetic */ org.junit.runners.MethodSorters[] $VALUES = null;
    public static final org.junit.runners.MethodSorters DEFAULT = null;
    public static final org.junit.runners.MethodSorters JVM = null;
    public static final org.junit.runners.MethodSorters NAME_ASCENDING = null;
    private final java.util.Comparator<java.lang.reflect.Method> comparator;

    static {
            org.junit.runners.MethodSorters r0 = new org.junit.runners.MethodSorters
            java.util.Comparator<java.lang.reflect.Method> r1 = org.junit.internal.f.b
            java.lang.String r2 = "NAME_ASCENDING"
            r3 = 0
            r0.<init>(r2, r3, r1)
            org.junit.runners.MethodSorters.NAME_ASCENDING = r0
            org.junit.runners.MethodSorters r1 = new org.junit.runners.MethodSorters
            r2 = 0
            java.lang.String r4 = "JVM"
            r5 = 1
            r1.<init>(r4, r5, r2)
            org.junit.runners.MethodSorters.JVM = r1
            org.junit.runners.MethodSorters r2 = new org.junit.runners.MethodSorters
            java.util.Comparator<java.lang.reflect.Method> r4 = org.junit.internal.f.a
            java.lang.String r6 = "DEFAULT"
            r7 = 2
            r2.<init>(r6, r7, r4)
            org.junit.runners.MethodSorters.DEFAULT = r2
            r4 = 3
            org.junit.runners.MethodSorters[] r4 = new org.junit.runners.MethodSorters[r4]
            r4[r3] = r0
            r4[r5] = r1
            r4[r7] = r2
            org.junit.runners.MethodSorters.$VALUES = r4
            return
    }

    MethodSorters(java.lang.String r1, int r2, java.util.Comparator r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.comparator = r3
            return
    }

    public static org.junit.runners.MethodSorters valueOf(java.lang.String r1) {
            java.lang.Class<org.junit.runners.MethodSorters> r0 = org.junit.runners.MethodSorters.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            org.junit.runners.MethodSorters r1 = (org.junit.runners.MethodSorters) r1
            return r1
    }

    public static final org.junit.runners.MethodSorters[] values() {
            org.junit.runners.MethodSorters[] r0 = org.junit.runners.MethodSorters.$VALUES
            java.lang.Object r0 = r0.clone()
            org.junit.runners.MethodSorters[] r0 = (org.junit.runners.MethodSorters[]) r0
            return r0
    }

    public java.util.Comparator<java.lang.reflect.Method> getComparator() {
            r1 = this;
            java.util.Comparator<java.lang.reflect.Method> r0 = r1.comparator
            return r0
    }
}

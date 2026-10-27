package org.junit.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class f {
    public static final java.util.Comparator<java.lang.reflect.Method> a = null;
    public static final java.util.Comparator<java.lang.reflect.Method> b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a implements java.util.Comparator<java.lang.reflect.Method> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(java.lang.reflect.Method r3, java.lang.reflect.Method r4) {
                r2 = this;
                java.lang.String r0 = r3.getName()
                int r0 = r0.hashCode()
                java.lang.String r1 = r4.getName()
                int r1 = r1.hashCode()
                if (r0 == r1) goto L18
                if (r0 >= r1) goto L16
                r3 = -1
                return r3
            L16:
                r3 = 1
                return r3
            L18:
                java.util.Comparator<java.lang.reflect.Method> r0 = org.junit.internal.f.b
                int r3 = r0.compare(r3, r4)
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.reflect.Method r1, java.lang.reflect.Method r2) {
                r0 = this;
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class b implements java.util.Comparator<java.lang.reflect.Method> {
        b() {
                r0 = this;
                r0.<init>()
                return
        }

        public int a(java.lang.reflect.Method r3, java.lang.reflect.Method r4) {
                r2 = this;
                java.lang.String r0 = r3.getName()
                java.lang.String r1 = r4.getName()
                int r0 = r0.compareTo(r1)
                if (r0 == 0) goto Lf
                return r0
            Lf:
                java.lang.String r3 = r3.toString()
                java.lang.String r4 = r4.toString()
                int r3 = r3.compareTo(r4)
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.lang.reflect.Method r1, java.lang.reflect.Method r2) {
                r0 = this;
                java.lang.reflect.Method r1 = (java.lang.reflect.Method) r1
                java.lang.reflect.Method r2 = (java.lang.reflect.Method) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    static {
            org.junit.internal.f$a r0 = new org.junit.internal.f$a
            r0.<init>()
            org.junit.internal.f.a = r0
            org.junit.internal.f$b r0 = new org.junit.internal.f$b
            r0.<init>()
            org.junit.internal.f.b = r0
            return
    }

    private f() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.reflect.Method[] a(java.lang.Class<?> r1) {
            java.lang.Class<org.junit.FixMethodOrder> r0 = org.junit.FixMethodOrder.class
            java.lang.annotation.Annotation r0 = r1.getAnnotation(r0)
            org.junit.FixMethodOrder r0 = (org.junit.FixMethodOrder) r0
            java.util.Comparator r0 = b(r0)
            java.lang.reflect.Method[] r1 = r1.getDeclaredMethods()
            if (r0 == 0) goto L15
            java.util.Arrays.sort(r1, r0)
        L15:
            return r1
    }

    private static java.util.Comparator<java.lang.reflect.Method> b(org.junit.FixMethodOrder r0) {
            if (r0 != 0) goto L5
            java.util.Comparator<java.lang.reflect.Method> r0 = org.junit.internal.f.a
            return r0
        L5:
            org.junit.runners.MethodSorters r0 = r0.value()
            java.util.Comparator r0 = r0.getComparator()
            return r0
    }
}

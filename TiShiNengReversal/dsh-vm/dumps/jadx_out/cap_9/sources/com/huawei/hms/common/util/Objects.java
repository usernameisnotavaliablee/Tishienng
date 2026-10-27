package com.huawei.hms.common.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class Objects {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class ToStringHelper {
        public final java.util.List<java.lang.String> a;
        public final java.lang.Object b;

        public ToStringHelper(java.lang.Object r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = com.huawei.hms.common.Preconditions.checkNotNull(r1)
                r0.b = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.a = r1
                return
        }

        public /* synthetic */ ToStringHelper(java.lang.Object r1, com.huawei.hms.common.util.Objects.a r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        public com.huawei.hms.common.util.Objects.ToStringHelper add(java.lang.String r3, java.lang.Object r4) {
                r2 = this;
                java.lang.Object r3 = com.huawei.hms.common.Preconditions.checkNotNull(r3)
                java.lang.String r3 = (java.lang.String) r3
                java.lang.String r4 = java.lang.String.valueOf(r4)
                java.util.List<java.lang.String> r0 = r2.a
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                r1.append(r3)
                java.lang.String r3 = "="
                r1.append(r3)
                r1.append(r4)
                java.lang.String r3 = r1.toString()
                r0.add(r3)
                return r2
        }

        public java.lang.String toString() {
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r1 = 100
                r0.<init>(r1)
                java.lang.Object r1 = r4.b
                java.lang.Class r1 = r1.getClass()
                java.lang.String r1 = r1.getSimpleName()
                r0.append(r1)
                r1 = 123(0x7b, float:1.72E-43)
                r0.append(r1)
                java.util.List<java.lang.String> r1 = r4.a
                int r1 = r1.size()
                r2 = 0
            L20:
                if (r2 >= r1) goto L39
                java.util.List<java.lang.String> r3 = r4.a
                java.lang.Object r3 = r3.get(r2)
                java.lang.String r3 = (java.lang.String) r3
                r0.append(r3)
                int r3 = r1 + (-1)
                if (r2 >= r3) goto L36
                java.lang.String r3 = ", "
                r0.append(r3)
            L36:
                int r2 = r2 + 1
                goto L20
            L39:
                r1 = 125(0x7d, float:1.75E-43)
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    public Objects() {
            r2 = this;
            r2.<init>()
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.String r1 = "illegal argument"
            r0.<init>(r1)
            throw r0
    }

    public static boolean equal(java.lang.Object r0, java.lang.Object r1) {
            if (r0 == r1) goto Ld
            if (r0 == 0) goto Lb
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            return r0
        Ld:
            r0 = 1
            return r0
    }

    public static int hashCode(java.lang.Object... r0) {
            int r0 = java.util.Arrays.hashCode(r0)
            return r0
    }

    public static com.huawei.hms.common.util.Objects.ToStringHelper toStringHelper(java.lang.Object r2) {
            com.huawei.hms.common.util.Objects$ToStringHelper r0 = new com.huawei.hms.common.util.Objects$ToStringHelper
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }
}

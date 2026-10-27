package kotlin.reflect.jvm.internal.impl.types;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public abstract class d2 implements kotlin.reflect.jvm.internal.impl.types.c2 {
    public d2() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof kotlin.reflect.jvm.internal.impl.types.c2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            kotlin.reflect.jvm.internal.impl.types.c2 r5 = (kotlin.reflect.jvm.internal.impl.types.c2) r5
            boolean r1 = r4.b()
            boolean r3 = r5.b()
            if (r1 == r3) goto L17
            return r2
        L17:
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r4.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r3 = r5.c()
            if (r1 == r3) goto L22
            return r2
        L22:
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r4.getType()
            kotlin.reflect.jvm.internal.impl.types.t0 r5 = r5.getType()
            boolean r5 = r1.equals(r5)
            if (r5 != 0) goto L31
            return r2
        L31:
            return r0
    }

    public int hashCode() {
            r2 = this;
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r2.c()
            int r0 = r0.hashCode()
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.getType()
            boolean r1 = kotlin.reflect.jvm.internal.impl.types.j2.w(r1)
            if (r1 == 0) goto L17
            int r0 = r0 * 31
            int r0 = r0 + 19
            return r0
        L17:
            int r0 = r0 * 31
            boolean r1 = r2.b()
            if (r1 == 0) goto L22
            r1 = 17
            goto L2a
        L22:
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.getType()
            int r1 = r1.hashCode()
        L2a:
            int r0 = r0 + r1
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            boolean r0 = r2.b()
            if (r0 == 0) goto L9
            java.lang.String r0 = "*"
            return r0
        L9:
            kotlin.reflect.jvm.internal.impl.types.Variance r0 = r2.c()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = kotlin.reflect.jvm.internal.impl.types.Variance.INVARIANT
            if (r0 != r1) goto L1a
            kotlin.reflect.jvm.internal.impl.types.t0 r0 = r2.getType()
            java.lang.String r0 = r0.toString()
            return r0
        L1a:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            kotlin.reflect.jvm.internal.impl.types.Variance r1 = r2.c()
            r0.append(r1)
            java.lang.String r1 = " "
            r0.append(r1)
            kotlin.reflect.jvm.internal.impl.types.t0 r1 = r2.getType()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

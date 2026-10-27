package org.junit.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class d extends org.junit.internal.b {
    public java.lang.Object a;

    public d(double r1) {
            r0 = this;
            r0.<init>()
            java.lang.Double r1 = java.lang.Double.valueOf(r1)
            r0.a = r1
            return
    }

    public d(float r1) {
            r0 = this;
            r0.<init>()
            java.lang.Float r1 = java.lang.Float.valueOf(r1)
            r0.a = r1
            return
    }

    @Override // org.junit.internal.b
    protected void c(java.lang.Object r7, java.lang.Object r8) {
            r6 = this;
            boolean r0 = r7 instanceof java.lang.Double
            if (r0 == 0) goto L1c
            java.lang.Double r7 = (java.lang.Double) r7
            double r0 = r7.doubleValue()
            java.lang.Double r8 = (java.lang.Double) r8
            double r2 = r8.doubleValue()
            java.lang.Object r7 = r6.a
            java.lang.Double r7 = (java.lang.Double) r7
            double r4 = r7.doubleValue()
            org.junit.a.t(r0, r2, r4)
            return
        L1c:
            java.lang.Float r7 = (java.lang.Float) r7
            float r7 = r7.floatValue()
            java.lang.Float r8 = (java.lang.Float) r8
            float r8 = r8.floatValue()
            java.lang.Object r0 = r6.a
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            org.junit.a.u(r7, r8, r0)
            return
    }
}

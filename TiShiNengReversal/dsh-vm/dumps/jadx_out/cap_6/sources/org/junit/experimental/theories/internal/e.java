package org.junit.experimental.theories.internal;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class e extends org.junit.experimental.theories.internal.a {
    public e(org.junit.runners.model.i r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // org.junit.experimental.theories.internal.a
    protected java.util.Collection<java.lang.reflect.Field> j(org.junit.experimental.theories.a r5) {
            r4 = this;
            java.util.Collection r0 = super.j(r5)
            java.lang.Class<org.junit.experimental.theories.FromDataPoints> r1 = org.junit.experimental.theories.FromDataPoints.class
            java.lang.annotation.Annotation r5 = r5.g(r1)
            org.junit.experimental.theories.FromDataPoints r5 = (org.junit.experimental.theories.FromDataPoints) r5
            java.lang.String r5 = r5.value()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class<org.junit.experimental.theories.DataPoints> r3 = org.junit.experimental.theories.DataPoints.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            org.junit.experimental.theories.DataPoints r3 = (org.junit.experimental.theories.DataPoints) r3
            java.lang.String[] r3 = r3.value()
            java.util.List r3 = java.util.Arrays.asList(r3)
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L19
            r1.add(r2)
            goto L19
        L3f:
            return r1
    }

    @Override // org.junit.experimental.theories.internal.a
    protected java.util.Collection<org.junit.runners.model.d> k(org.junit.experimental.theories.a r5) {
            r4 = this;
            java.util.Collection r0 = super.k(r5)
            java.lang.Class<org.junit.experimental.theories.FromDataPoints> r1 = org.junit.experimental.theories.FromDataPoints.class
            java.lang.annotation.Annotation r5 = r5.g(r1)
            org.junit.experimental.theories.FromDataPoints r5 = (org.junit.experimental.theories.FromDataPoints) r5
            java.lang.String r5 = r5.value()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            org.junit.runners.model.d r2 = (org.junit.runners.model.d) r2
            java.lang.Class<org.junit.experimental.theories.DataPoints> r3 = org.junit.experimental.theories.DataPoints.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            org.junit.experimental.theories.DataPoints r3 = (org.junit.experimental.theories.DataPoints) r3
            java.lang.String[] r3 = r3.value()
            java.util.List r3 = java.util.Arrays.asList(r3)
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L19
            r1.add(r2)
            goto L19
        L3f:
            return r1
    }

    @Override // org.junit.experimental.theories.internal.a
    protected java.util.Collection<java.lang.reflect.Field> l(org.junit.experimental.theories.a r5) {
            r4 = this;
            java.util.Collection r0 = super.l(r5)
            java.lang.Class<org.junit.experimental.theories.FromDataPoints> r1 = org.junit.experimental.theories.FromDataPoints.class
            java.lang.annotation.Annotation r5 = r5.g(r1)
            org.junit.experimental.theories.FromDataPoints r5 = (org.junit.experimental.theories.FromDataPoints) r5
            java.lang.String r5 = r5.value()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            java.lang.reflect.Field r2 = (java.lang.reflect.Field) r2
            java.lang.Class<org.junit.experimental.theories.DataPoint> r3 = org.junit.experimental.theories.DataPoint.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            org.junit.experimental.theories.DataPoint r3 = (org.junit.experimental.theories.DataPoint) r3
            java.lang.String[] r3 = r3.value()
            java.util.List r3 = java.util.Arrays.asList(r3)
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L19
            r1.add(r2)
            goto L19
        L3f:
            return r1
    }

    @Override // org.junit.experimental.theories.internal.a
    protected java.util.Collection<org.junit.runners.model.d> m(org.junit.experimental.theories.a r5) {
            r4 = this;
            java.util.Collection r0 = super.m(r5)
            java.lang.Class<org.junit.experimental.theories.FromDataPoints> r1 = org.junit.experimental.theories.FromDataPoints.class
            java.lang.annotation.Annotation r5 = r5.g(r1)
            org.junit.experimental.theories.FromDataPoints r5 = (org.junit.experimental.theories.FromDataPoints) r5
            java.lang.String r5 = r5.value()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r0 = r0.iterator()
        L19:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L3f
            java.lang.Object r2 = r0.next()
            org.junit.runners.model.d r2 = (org.junit.runners.model.d) r2
            java.lang.Class<org.junit.experimental.theories.DataPoint> r3 = org.junit.experimental.theories.DataPoint.class
            java.lang.annotation.Annotation r3 = r2.getAnnotation(r3)
            org.junit.experimental.theories.DataPoint r3 = (org.junit.experimental.theories.DataPoint) r3
            java.lang.String[] r3 = r3.value()
            java.util.List r3 = java.util.Arrays.asList(r3)
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L19
            r1.add(r2)
            goto L19
        L3f:
            return r1
    }
}

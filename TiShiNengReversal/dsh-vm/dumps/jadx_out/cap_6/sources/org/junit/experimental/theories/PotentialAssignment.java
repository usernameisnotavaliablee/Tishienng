package org.junit.experimental.theories;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public abstract class PotentialAssignment {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class CouldNotGenerateValueException extends java.lang.Exception {
        private static final long serialVersionUID = 1;

        public CouldNotGenerateValueException() {
                r0 = this;
                r0.<init>()
                return
        }

        public CouldNotGenerateValueException(java.lang.Throwable r1) {
                r0 = this;
                r0.<init>(r1)
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class a extends org.junit.experimental.theories.PotentialAssignment {
        final /* synthetic */ java.lang.Object a;
        final /* synthetic */ java.lang.String b;

        a(java.lang.Object r1, java.lang.String r2) {
                r0 = this;
                r0.a = r1
                r0.b = r2
                r0.<init>()
                return
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public java.lang.String b() {
                r6 = this;
                java.lang.Object r0 = r6.a
                r1 = 2
                r2 = 0
                r3 = 1
                if (r0 != 0) goto La
                java.lang.String r0 = "null"
                goto L2e
            La:
                java.lang.String r4 = "\"%s\""
                java.lang.Object[] r5 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L15
                r5[r2] = r0     // Catch: java.lang.Throwable -> L15
                java.lang.String r0 = java.lang.String.format(r4, r5)     // Catch: java.lang.Throwable -> L15
                goto L2e
            L15:
                r0 = move-exception
                java.lang.Class r4 = r0.getClass()
                java.lang.String r4 = r4.getSimpleName()
                java.lang.String r0 = r0.getMessage()
                java.lang.Object[] r5 = new java.lang.Object[r1]
                r5[r2] = r4
                r5[r3] = r0
                java.lang.String r0 = "[toString() threw %s: %s]"
                java.lang.String r0 = java.lang.String.format(r0, r5)
            L2e:
                java.lang.String r4 = r6.b
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r1[r2] = r0
                r1[r3] = r4
                java.lang.String r0 = "%s <from %s>"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                return r0
        }

        @Override // org.junit.experimental.theories.PotentialAssignment
        public java.lang.Object c() {
                r1 = this;
                java.lang.Object r0 = r1.a
                return r0
        }

        public java.lang.String toString() {
                r3 = this;
                java.lang.Object r0 = r3.a
                r1 = 1
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r0
                java.lang.String r0 = "[%s]"
                java.lang.String r0 = java.lang.String.format(r0, r1)
                return r0
        }
    }

    public PotentialAssignment() {
            r0 = this;
            r0.<init>()
            return
    }

    public static org.junit.experimental.theories.PotentialAssignment a(java.lang.String r1, java.lang.Object r2) {
            org.junit.experimental.theories.PotentialAssignment$a r0 = new org.junit.experimental.theories.PotentialAssignment$a
            r0.<init>(r2, r1)
            return r0
    }

    public abstract java.lang.String b() throws org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException;

    public abstract java.lang.Object c() throws org.junit.experimental.theories.PotentialAssignment.CouldNotGenerateValueException;
}

package org.junit;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class ComparisonFailure extends java.lang.AssertionError {
    private static final int MAX_CONTEXT_LENGTH = 20;
    private static final long serialVersionUID = 1;
    private java.lang.String fActual;
    private java.lang.String fExpected;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class b {
        private static final java.lang.String d = "...";
        private static final java.lang.String e = "]";
        private static final java.lang.String f = "[";
        private final int a;
        private final java.lang.String b;
        private final java.lang.String c;

        /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
        private class a {
            private final java.lang.String a;
            private final java.lang.String b;
            final /* synthetic */ org.junit.ComparisonFailure.b c;

            private a(org.junit.ComparisonFailure.b r2) {
                    r1 = this;
                    r1.c = r2
                    r1.<init>()
                    java.lang.String r0 = org.junit.ComparisonFailure.b.a(r2)
                    r1.a = r0
                    java.lang.String r2 = org.junit.ComparisonFailure.b.b(r2, r0)
                    r1.b = r2
                    return
            }

            /* synthetic */ a(org.junit.ComparisonFailure.b r1, org.junit.ComparisonFailure.a r2) {
                    r0 = this;
                    r0.<init>(r1)
                    return
            }

            private java.lang.String e(java.lang.String r5) {
                    r4 = this;
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "["
                    r0.append(r1)
                    java.lang.String r1 = r4.a
                    int r1 = r1.length()
                    int r2 = r5.length()
                    java.lang.String r3 = r4.b
                    int r3 = r3.length()
                    int r2 = r2 - r3
                    java.lang.String r5 = r5.substring(r1, r2)
                    r0.append(r5)
                    java.lang.String r5 = "]"
                    r0.append(r5)
                    java.lang.String r5 = r0.toString()
                    return r5
            }

            public java.lang.String a() {
                    r1 = this;
                    org.junit.ComparisonFailure$b r0 = r1.c
                    java.lang.String r0 = org.junit.ComparisonFailure.b.d(r0)
                    java.lang.String r0 = r1.e(r0)
                    return r0
            }

            public java.lang.String b() {
                    r4 = this;
                    java.lang.String r0 = r4.a
                    int r0 = r0.length()
                    org.junit.ComparisonFailure$b r1 = r4.c
                    int r1 = org.junit.ComparisonFailure.b.e(r1)
                    if (r0 > r1) goto L11
                    java.lang.String r0 = r4.a
                    return r0
                L11:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = "..."
                    r0.append(r1)
                    java.lang.String r1 = r4.a
                    int r2 = r1.length()
                    org.junit.ComparisonFailure$b r3 = r4.c
                    int r3 = org.junit.ComparisonFailure.b.e(r3)
                    int r2 = r2 - r3
                    java.lang.String r1 = r1.substring(r2)
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            public java.lang.String c() {
                    r4 = this;
                    java.lang.String r0 = r4.b
                    int r0 = r0.length()
                    org.junit.ComparisonFailure$b r1 = r4.c
                    int r1 = org.junit.ComparisonFailure.b.e(r1)
                    if (r0 > r1) goto L11
                    java.lang.String r0 = r4.b
                    return r0
                L11:
                    java.lang.StringBuilder r0 = new java.lang.StringBuilder
                    r0.<init>()
                    java.lang.String r1 = r4.b
                    org.junit.ComparisonFailure$b r2 = r4.c
                    int r2 = org.junit.ComparisonFailure.b.e(r2)
                    r3 = 0
                    java.lang.String r1 = r1.substring(r3, r2)
                    r0.append(r1)
                    java.lang.String r1 = "..."
                    r0.append(r1)
                    java.lang.String r0 = r0.toString()
                    return r0
            }

            public java.lang.String d() {
                    r1 = this;
                    org.junit.ComparisonFailure$b r0 = r1.c
                    java.lang.String r0 = org.junit.ComparisonFailure.b.c(r0)
                    java.lang.String r0 = r1.e(r0)
                    return r0
            }
        }

        public b(int r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                r0.b = r2
                r0.c = r3
                return
        }

        static /* synthetic */ java.lang.String a(org.junit.ComparisonFailure.b r0) {
                java.lang.String r0 = r0.g()
                return r0
        }

        static /* synthetic */ java.lang.String b(org.junit.ComparisonFailure.b r0, java.lang.String r1) {
                java.lang.String r0 = r0.h(r1)
                return r0
        }

        static /* synthetic */ java.lang.String c(org.junit.ComparisonFailure.b r0) {
                java.lang.String r0 = r0.b
                return r0
        }

        static /* synthetic */ java.lang.String d(org.junit.ComparisonFailure.b r0) {
                java.lang.String r0 = r0.c
                return r0
        }

        static /* synthetic */ int e(org.junit.ComparisonFailure.b r0) {
                int r0 = r0.a
                return r0
        }

        private java.lang.String g() {
                r5 = this;
                java.lang.String r0 = r5.b
                int r0 = r0.length()
                java.lang.String r1 = r5.c
                int r1 = r1.length()
                int r0 = java.lang.Math.min(r0, r1)
                r1 = 0
                r2 = 0
            L12:
                if (r2 >= r0) goto L2c
                java.lang.String r3 = r5.b
                char r3 = r3.charAt(r2)
                java.lang.String r4 = r5.c
                char r4 = r4.charAt(r2)
                if (r3 == r4) goto L29
                java.lang.String r0 = r5.b
                java.lang.String r0 = r0.substring(r1, r2)
                return r0
            L29:
                int r2 = r2 + 1
                goto L12
            L2c:
                java.lang.String r2 = r5.b
                java.lang.String r0 = r2.substring(r1, r0)
                return r0
        }

        private java.lang.String h(java.lang.String r5) {
                r4 = this;
                java.lang.String r0 = r4.b
                int r0 = r0.length()
                int r1 = r5.length()
                int r0 = r0 - r1
                java.lang.String r1 = r4.c
                int r1 = r1.length()
                int r5 = r5.length()
                int r1 = r1 - r5
                int r5 = java.lang.Math.min(r0, r1)
                int r5 = r5 + (-1)
                r0 = 0
            L1d:
                if (r0 > r5) goto L3f
                java.lang.String r1 = r4.b
                int r2 = r1.length()
                int r2 = r2 + (-1)
                int r2 = r2 - r0
                char r1 = r1.charAt(r2)
                java.lang.String r2 = r4.c
                int r3 = r2.length()
                int r3 = r3 + (-1)
                int r3 = r3 - r0
                char r2 = r2.charAt(r3)
                if (r1 == r2) goto L3c
                goto L3f
            L3c:
                int r0 = r0 + 1
                goto L1d
            L3f:
                java.lang.String r5 = r4.b
                int r1 = r5.length()
                int r1 = r1 - r0
                java.lang.String r5 = r5.substring(r1)
                return r5
        }

        public java.lang.String f(java.lang.String r6) {
                r5 = this;
                java.lang.String r0 = r5.b
                if (r0 == 0) goto L4e
                java.lang.String r1 = r5.c
                if (r1 == 0) goto L4e
                boolean r0 = r0.equals(r1)
                if (r0 == 0) goto Lf
                goto L4e
            Lf:
                org.junit.ComparisonFailure$b$a r0 = new org.junit.ComparisonFailure$b$a
                r1 = 0
                r0.<init>(r5, r1)
                java.lang.String r1 = r0.b()
                java.lang.String r2 = r0.c()
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                java.lang.String r4 = r0.d()
                r3.append(r4)
                r3.append(r2)
                java.lang.String r3 = r3.toString()
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r1)
                java.lang.String r0 = r0.a()
                r4.append(r0)
                r4.append(r2)
                java.lang.String r0 = r4.toString()
                java.lang.String r6 = org.junit.a.k0(r6, r3, r0)
                return r6
            L4e:
                java.lang.String r0 = r5.b
                java.lang.String r1 = r5.c
                java.lang.String r6 = org.junit.a.k0(r6, r0, r1)
                return r6
        }
    }

    public ComparisonFailure(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
            r0 = this;
            r0.<init>(r1)
            r0.fExpected = r2
            r0.fActual = r3
            return
    }

    public java.lang.String getActual() {
            r1 = this;
            java.lang.String r0 = r1.fActual
            return r0
    }

    public java.lang.String getExpected() {
            r1 = this;
            java.lang.String r0 = r1.fExpected
            return r0
    }

    @Override // java.lang.Throwable
    public java.lang.String getMessage() {
            r4 = this;
            org.junit.ComparisonFailure$b r0 = new org.junit.ComparisonFailure$b
            java.lang.String r1 = r4.fExpected
            java.lang.String r2 = r4.fActual
            r3 = 20
            r0.<init>(r3, r1, r2)
            java.lang.String r1 = super.getMessage()
            java.lang.String r0 = r0.f(r1)
            return r0
    }
}

package com.hp.hpl.sparta;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
class j {
    private static final java.lang.Integer c = null;
    private static final java.lang.Integer d = null;
    private static final java.lang.Integer e = null;
    private static final java.lang.Integer f = null;
    private static final java.lang.Integer g = null;
    private static final java.lang.Integer h = null;
    private static final java.lang.Integer i = null;
    private static final java.lang.Integer j = null;
    private static final java.lang.Integer k = null;
    private static final java.lang.Integer l = null;
    private final java.util.Vector a;
    private java.util.Hashtable b;

    static {
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 1
            r0.<init>(r1)
            com.hp.hpl.sparta.j.c = r0
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 2
            r0.<init>(r1)
            com.hp.hpl.sparta.j.d = r0
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 3
            r0.<init>(r1)
            com.hp.hpl.sparta.j.e = r0
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 4
            r0.<init>(r1)
            com.hp.hpl.sparta.j.f = r0
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 5
            r0.<init>(r1)
            com.hp.hpl.sparta.j.g = r0
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 6
            r0.<init>(r1)
            com.hp.hpl.sparta.j.h = r0
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 7
            r0.<init>(r1)
            com.hp.hpl.sparta.j.i = r0
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 8
            r0.<init>(r1)
            com.hp.hpl.sparta.j.j = r0
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 9
            r0.<init>(r1)
            com.hp.hpl.sparta.j.k = r0
            java.lang.Integer r0 = new java.lang.Integer
            r1 = 10
            r0.<init>(r1)
            com.hp.hpl.sparta.j.l = r0
            return
    }

    j() {
            r1 = this;
            r1.<init>()
            java.util.Vector r0 = new java.util.Vector
            r0.<init>()
            r1.a = r0
            java.util.Hashtable r0 = new java.util.Hashtable
            r0.<init>()
            r1.b = r0
            return
    }

    private static java.lang.Integer c(com.hp.hpl.sparta.i r1) {
            java.lang.Integer r0 = new java.lang.Integer
            int r1 = java.lang.System.identityHashCode(r1)
            r0.<init>(r1)
            return r0
    }

    void a(com.hp.hpl.sparta.i r2, int r3) {
            r1 = this;
            java.util.Vector r0 = r1.a
            r0.addElement(r2)
            switch(r3) {
                case 1: goto L29;
                case 2: goto L26;
                case 3: goto L23;
                case 4: goto L20;
                case 5: goto L1d;
                case 6: goto L1a;
                case 7: goto L17;
                case 8: goto L14;
                case 9: goto L11;
                case 10: goto Le;
                default: goto L8;
            }
        L8:
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r3)
            goto L2b
        Le:
            java.lang.Integer r0 = com.hp.hpl.sparta.j.l
            goto L2b
        L11:
            java.lang.Integer r0 = com.hp.hpl.sparta.j.k
            goto L2b
        L14:
            java.lang.Integer r0 = com.hp.hpl.sparta.j.j
            goto L2b
        L17:
            java.lang.Integer r0 = com.hp.hpl.sparta.j.i
            goto L2b
        L1a:
            java.lang.Integer r0 = com.hp.hpl.sparta.j.h
            goto L2b
        L1d:
            java.lang.Integer r0 = com.hp.hpl.sparta.j.g
            goto L2b
        L20:
            java.lang.Integer r0 = com.hp.hpl.sparta.j.f
            goto L2b
        L23:
            java.lang.Integer r0 = com.hp.hpl.sparta.j.e
            goto L2b
        L26:
            java.lang.Integer r0 = com.hp.hpl.sparta.j.d
            goto L2b
        L29:
            java.lang.Integer r0 = com.hp.hpl.sparta.j.c
        L2b:
            java.util.Hashtable r3 = r1.b
            java.lang.Integer r2 = c(r2)
            r3.put(r2, r0)
            return
    }

    void b(java.lang.String r2) {
            r1 = this;
            java.util.Vector r0 = r1.a
            r0.addElement(r2)
            return
    }

    java.util.Enumeration d() {
            r1 = this;
            java.util.Vector r0 = r1.a
            java.util.Enumeration r0 = r0.elements()
            return r0
    }

    int e(com.hp.hpl.sparta.i r2) {
            r1 = this;
            java.util.Hashtable r0 = r1.b
            java.lang.Integer r2 = c(r2)
            java.lang.Object r2 = r0.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            return r2
    }

    void f() {
            r1 = this;
            java.util.Vector r0 = r1.a
            r0.removeAllElements()
            java.util.Hashtable r0 = r1.b
            r0.clear()
            return
    }

    public java.lang.String toString() {
            r5 = this;
            java.lang.StringBuffer r0 = new java.lang.StringBuffer     // Catch: java.io.IOException -> L35
            java.lang.String r1 = "{ "
            r0.<init>(r1)     // Catch: java.io.IOException -> L35
            java.util.Vector r1 = r5.a     // Catch: java.io.IOException -> L35
            java.util.Enumeration r1 = r1.elements()     // Catch: java.io.IOException -> L35
        Ld:
            boolean r2 = r1.hasMoreElements()     // Catch: java.io.IOException -> L35
            if (r2 == 0) goto L69
            java.lang.Object r2 = r1.nextElement()     // Catch: java.io.IOException -> L35
            boolean r3 = r2 instanceof java.lang.String     // Catch: java.io.IOException -> L35
            if (r3 == 0) goto L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L35
            r3.<init>()     // Catch: java.io.IOException -> L35
            java.lang.String r4 = "String("
            r3.append(r4)     // Catch: java.io.IOException -> L35
            r3.append(r2)     // Catch: java.io.IOException -> L35
            java.lang.String r2 = ") "
            r3.append(r2)     // Catch: java.io.IOException -> L35
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L35
            r0.append(r2)     // Catch: java.io.IOException -> L35
            goto Ld
        L35:
            r0 = move-exception
            goto L73
        L37:
            com.hp.hpl.sparta.i r2 = (com.hp.hpl.sparta.i) r2     // Catch: java.io.IOException -> L35
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L35
            r3.<init>()     // Catch: java.io.IOException -> L35
            java.lang.String r4 = "Node("
            r3.append(r4)     // Catch: java.io.IOException -> L35
            java.lang.String r4 = r2.q()     // Catch: java.io.IOException -> L35
            r3.append(r4)     // Catch: java.io.IOException -> L35
            java.lang.String r4 = ")["
            r3.append(r4)     // Catch: java.io.IOException -> L35
            java.util.Hashtable r4 = r5.b     // Catch: java.io.IOException -> L35
            java.lang.Integer r2 = c(r2)     // Catch: java.io.IOException -> L35
            java.lang.Object r2 = r4.get(r2)     // Catch: java.io.IOException -> L35
            r3.append(r2)     // Catch: java.io.IOException -> L35
            java.lang.String r2 = "] "
            r3.append(r2)     // Catch: java.io.IOException -> L35
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L35
            r0.append(r2)     // Catch: java.io.IOException -> L35
            goto Ld
        L69:
            java.lang.String r1 = "}"
            r0.append(r1)     // Catch: java.io.IOException -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.io.IOException -> L35
            return r0
        L73:
            java.lang.String r0 = r0.toString()
            return r0
    }
}

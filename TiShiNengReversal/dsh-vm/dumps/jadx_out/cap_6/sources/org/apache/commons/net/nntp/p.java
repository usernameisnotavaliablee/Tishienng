package org.apache.commons.net.nntp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class p {
    public p() {
            r0 = this;
            r0.<init>()
            return
    }

    private void a(org.apache.commons.net.nntp.o r9, java.util.HashMap<java.lang.String, org.apache.commons.net.nntp.n> r10) {
            r8 = this;
            java.lang.String r0 = r9.a()
            java.lang.Object r1 = r10.get(r0)
            org.apache.commons.net.nntp.n r1 = (org.apache.commons.net.nntp.n) r1
            r2 = 0
            if (r1 == 0) goto L2c
            org.apache.commons.net.nntp.o r3 = r1.a
            if (r3 == 0) goto L2a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "<Bogus-id:"
            r0.append(r1)
            r1 = 1
            r0.append(r1)
            java.lang.String r1 = ">"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r1 = r2
            goto L2c
        L2a:
            r1.a = r9
        L2c:
            if (r1 != 0) goto L38
            org.apache.commons.net.nntp.n r1 = new org.apache.commons.net.nntp.n
            r1.<init>()
            r1.a = r9
            r10.put(r0, r1)
        L38:
            java.lang.String[] r9 = r9.g()
            int r0 = r9.length
            r3 = 0
            r4 = r2
        L3f:
            if (r3 >= r0) goto L6d
            r5 = r9[r3]
            java.lang.Object r6 = r10.get(r5)
            org.apache.commons.net.nntp.n r6 = (org.apache.commons.net.nntp.n) r6
            if (r6 != 0) goto L53
            org.apache.commons.net.nntp.n r6 = new org.apache.commons.net.nntp.n
            r6.<init>()
            r10.put(r5, r6)
        L53:
            if (r4 == 0) goto L69
            org.apache.commons.net.nntp.n r5 = r6.b
            if (r5 != 0) goto L69
            if (r4 == r6) goto L69
            boolean r5 = r6.a(r4)
            if (r5 != 0) goto L69
            r6.b = r4
            org.apache.commons.net.nntp.n r5 = r4.d
            r6.c = r5
            r4.d = r6
        L69:
            int r3 = r3 + 1
            r4 = r6
            goto L3f
        L6d:
            if (r4 == 0) goto L78
            if (r4 == r1) goto L77
            boolean r9 = r1.a(r4)
            if (r9 == 0) goto L78
        L77:
            r4 = r2
        L78:
            org.apache.commons.net.nntp.n r9 = r1.b
            if (r9 == 0) goto Lbf
            org.apache.commons.net.nntp.n r9 = r9.d
            r10 = r2
        L7f:
            if (r9 == 0) goto L8a
            if (r9 != r1) goto L84
            goto L8a
        L84:
            org.apache.commons.net.nntp.n r10 = r9.c
            r7 = r10
            r10 = r9
            r9 = r7
            goto L7f
        L8a:
            if (r9 == 0) goto L9e
            if (r10 != 0) goto L95
            org.apache.commons.net.nntp.n r9 = r1.b
            org.apache.commons.net.nntp.n r10 = r1.c
            r9.d = r10
            goto L99
        L95:
            org.apache.commons.net.nntp.n r9 = r1.c
            r10.c = r9
        L99:
            r1.c = r2
            r1.b = r2
            goto Lbf
        L9e:
            java.lang.RuntimeException r9 = new java.lang.RuntimeException
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            java.lang.String r0 = "Didnt find "
            r10.append(r0)
            r10.append(r1)
            java.lang.String r0 = " in parent"
            r10.append(r0)
            org.apache.commons.net.nntp.n r0 = r1.b
            r10.append(r0)
            java.lang.String r10 = r10.toString()
            r9.<init>(r10)
            throw r9
        Lbf:
            if (r4 == 0) goto Lc9
            r1.b = r4
            org.apache.commons.net.nntp.n r9 = r4.d
            r1.c = r9
            r4.d = r1
        Lc9:
            return
    }

    private org.apache.commons.net.nntp.n b(java.util.HashMap<java.lang.String, org.apache.commons.net.nntp.n> r4) {
            r3 = this;
            org.apache.commons.net.nntp.n r0 = new org.apache.commons.net.nntp.n
            r0.<init>()
            java.util.Set r4 = r4.entrySet()
            java.util.Iterator r4 = r4.iterator()
        Ld:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L4b
            java.lang.Object r1 = r4.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r1 = r1.getValue()
            org.apache.commons.net.nntp.n r1 = (org.apache.commons.net.nntp.n) r1
            org.apache.commons.net.nntp.n r2 = r1.b
            if (r2 != 0) goto Ld
            org.apache.commons.net.nntp.n r2 = r1.c
            if (r2 != 0) goto L2e
            org.apache.commons.net.nntp.n r2 = r0.d
            r1.c = r2
            r0.d = r1
            goto Ld
        L2e:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = "c.next is "
            r0.append(r2)
            org.apache.commons.net.nntp.n r1 = r1.c
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r4.<init>(r0)
            throw r4
        L4b:
            return r0
    }

    private void c(org.apache.commons.net.nntp.n r10) {
            r9 = this;
            org.apache.commons.net.nntp.n r0 = r10.d
            r1 = 0
            r2 = 0
        L4:
            if (r0 == 0) goto Lb
            int r2 = r2 + 1
            org.apache.commons.net.nntp.n r0 = r0.c
            goto L4
        Lb:
            java.util.HashMap r0 = new java.util.HashMap
            double r2 = (double) r2
            r4 = 4608083138725491507(0x3ff3333333333333, double:1.2)
            double r2 = r2 * r4
            int r2 = (int) r2
            r3 = 1063675494(0x3f666666, float:0.9)
            r0.<init>(r2, r3)
            org.apache.commons.net.nntp.n r2 = r10.d
        L1e:
            if (r2 == 0) goto L61
            org.apache.commons.net.nntp.o r3 = r2.a
            if (r3 != 0) goto L28
            org.apache.commons.net.nntp.n r3 = r2.d
            org.apache.commons.net.nntp.o r3 = r3.a
        L28:
            java.lang.String r3 = r3.d()
            if (r3 == 0) goto L5e
            int r4 = r3.length()
            if (r4 != 0) goto L35
            goto L5e
        L35:
            java.lang.Object r4 = r0.get(r3)
            org.apache.commons.net.nntp.n r4 = (org.apache.commons.net.nntp.n) r4
            if (r4 == 0) goto L59
            org.apache.commons.net.nntp.o r5 = r2.a
            if (r5 != 0) goto L45
            org.apache.commons.net.nntp.o r5 = r4.a
            if (r5 != 0) goto L59
        L45:
            org.apache.commons.net.nntp.o r4 = r4.a
            if (r4 == 0) goto L5e
            boolean r4 = r4.e()
            if (r4 == 0) goto L5e
            org.apache.commons.net.nntp.o r4 = r2.a
            if (r4 == 0) goto L5e
            boolean r4 = r4.e()
            if (r4 != 0) goto L5e
        L59:
            r0.put(r3, r2)
            int r1 = r1 + 1
        L5e:
            org.apache.commons.net.nntp.n r2 = r2.c
            goto L1e
        L61:
            if (r1 != 0) goto L64
            return
        L64:
            org.apache.commons.net.nntp.n r1 = r10.d
            org.apache.commons.net.nntp.n r2 = r1.c
            r3 = 0
            r4 = r3
        L6a:
            if (r1 == 0) goto L106
            org.apache.commons.net.nntp.o r5 = r1.a
            if (r5 != 0) goto L74
            org.apache.commons.net.nntp.n r5 = r1.d
            org.apache.commons.net.nntp.o r5 = r5.a
        L74:
            java.lang.String r5 = r5.d()
            if (r5 == 0) goto Lfa
            int r6 = r5.length()
            if (r6 != 0) goto L82
            goto Lfa
        L82:
            java.lang.Object r5 = r0.get(r5)
            org.apache.commons.net.nntp.n r5 = (org.apache.commons.net.nntp.n) r5
            if (r5 != r1) goto L8c
            goto Lfa
        L8c:
            if (r4 != 0) goto L93
            org.apache.commons.net.nntp.n r6 = r1.c
            r10.d = r6
            goto L97
        L93:
            org.apache.commons.net.nntp.n r6 = r1.c
            r4.c = r6
        L97:
            r1.c = r3
            org.apache.commons.net.nntp.o r6 = r5.a
            if (r6 != 0) goto Lbd
            org.apache.commons.net.nntp.o r7 = r1.a
            if (r7 != 0) goto Lbd
            org.apache.commons.net.nntp.n r6 = r5.d
        La3:
            if (r6 == 0) goto Lab
            org.apache.commons.net.nntp.n r7 = r6.c
            if (r7 == 0) goto Lab
            r6 = r7
            goto La3
        Lab:
            if (r6 == 0) goto Lb1
            org.apache.commons.net.nntp.n r7 = r1.d
            r6.c = r7
        Lb1:
            org.apache.commons.net.nntp.n r6 = r1.d
        Lb3:
            if (r6 == 0) goto Lba
            r6.b = r5
            org.apache.commons.net.nntp.n r6 = r6.c
            goto Lb3
        Lba:
            r1.d = r3
            goto Lfb
        Lbd:
            if (r6 == 0) goto Lf1
            org.apache.commons.net.nntp.o r6 = r1.a
            if (r6 == 0) goto Ld2
            boolean r6 = r6.e()
            if (r6 == 0) goto Ld2
            org.apache.commons.net.nntp.o r6 = r5.a
            boolean r6 = r6.e()
            if (r6 != 0) goto Ld2
            goto Lf1
        Ld2:
            org.apache.commons.net.nntp.n r6 = new org.apache.commons.net.nntp.n
            r6.<init>()
            org.apache.commons.net.nntp.o r7 = r5.a
            r6.a = r7
            org.apache.commons.net.nntp.n r7 = r5.d
            r6.d = r7
        Ldf:
            if (r7 == 0) goto Le6
            r7.b = r6
            org.apache.commons.net.nntp.n r7 = r7.c
            goto Ldf
        Le6:
            r5.a = r3
            r1.b = r5
            r6.b = r5
            r5.d = r1
            r1.c = r6
            goto Lfb
        Lf1:
            r1.b = r5
            org.apache.commons.net.nntp.n r6 = r5.d
            r1.c = r6
            r5.d = r1
            goto Lfb
        Lfa:
            r4 = r1
        Lfb:
            if (r2 != 0) goto Lff
            r1 = r3
            goto L101
        Lff:
            org.apache.commons.net.nntp.n r1 = r2.c
        L101:
            r8 = r2
            r2 = r1
            r1 = r8
            goto L6a
        L106:
            r0.clear()
            return
    }

    private void d(org.apache.commons.net.nntp.n r8) {
            r7 = this;
            org.apache.commons.net.nntp.n r0 = r8.d
            org.apache.commons.net.nntp.n r1 = r0.c
            r2 = 0
            r3 = r2
        L6:
            if (r0 == 0) goto L57
            org.apache.commons.net.nntp.o r4 = r0.a
            if (r4 != 0) goto L1d
            org.apache.commons.net.nntp.n r5 = r0.d
            if (r5 != 0) goto L1d
            if (r3 != 0) goto L17
            org.apache.commons.net.nntp.n r0 = r0.c
            r8.d = r0
            goto L1b
        L17:
            org.apache.commons.net.nntp.n r0 = r0.c
            r3.c = r0
        L1b:
            r0 = r1
            goto L50
        L1d:
            if (r4 != 0) goto L47
            org.apache.commons.net.nntp.n r4 = r0.d
            if (r4 == 0) goto L47
            org.apache.commons.net.nntp.n r5 = r0.b
            if (r5 != 0) goto L2b
            org.apache.commons.net.nntp.n r5 = r4.c
            if (r5 != 0) goto L47
        L2b:
            if (r3 != 0) goto L30
            r8.d = r4
            goto L32
        L30:
            r3.c = r4
        L32:
            r1 = r4
        L33:
            org.apache.commons.net.nntp.n r5 = r1.c
            if (r5 == 0) goto L3d
            org.apache.commons.net.nntp.n r6 = r0.b
            r1.b = r6
            r1 = r5
            goto L33
        L3d:
            org.apache.commons.net.nntp.n r5 = r0.b
            r1.b = r5
            org.apache.commons.net.nntp.n r0 = r0.c
            r1.c = r0
            r0 = r4
            goto L50
        L47:
            org.apache.commons.net.nntp.n r3 = r0.d
            if (r3 == 0) goto L4e
            r7.d(r0)
        L4e:
            r3 = r0
            goto L1b
        L50:
            if (r0 != 0) goto L54
            r1 = r2
            goto L6
        L54:
            org.apache.commons.net.nntp.n r1 = r0.c
            goto L6
        L57:
            return
    }

    public org.apache.commons.net.nntp.o e(java.lang.Iterable<? extends org.apache.commons.net.nntp.o> r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L4
            return r0
        L4:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.util.Iterator r5 = r5.iterator()
        Ld:
            boolean r2 = r5.hasNext()
            if (r2 == 0) goto L23
            java.lang.Object r2 = r5.next()
            org.apache.commons.net.nntp.o r2 = (org.apache.commons.net.nntp.o) r2
            boolean r3 = r2.f()
            if (r3 != 0) goto Ld
            r4.a(r2, r1)
            goto Ld
        L23:
            boolean r5 = r1.isEmpty()
            if (r5 == 0) goto L2a
            return r0
        L2a:
            org.apache.commons.net.nntp.n r5 = r4.b(r1)
            r1.clear()
            r4.d(r5)
            r5.c()
            r4.c(r5)
            org.apache.commons.net.nntp.n r1 = r5.c
            if (r1 != 0) goto L5e
            org.apache.commons.net.nntp.n r1 = r5.d
        L40:
            if (r1 == 0) goto L53
            org.apache.commons.net.nntp.o r2 = r1.a
            if (r2 != 0) goto L50
            org.apache.commons.net.nntp.n r2 = r1.d
            org.apache.commons.net.nntp.o r2 = r2.a
            org.apache.commons.net.nntp.o r2 = r2.b()
            r1.a = r2
        L50:
            org.apache.commons.net.nntp.n r1 = r1.c
            goto L40
        L53:
            org.apache.commons.net.nntp.n r1 = r5.d
            if (r1 != 0) goto L58
            goto L5a
        L58:
            org.apache.commons.net.nntp.o r0 = r1.a
        L5a:
            r5.b()
            return r0
        L5e:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "root node has a next:"
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
    }

    public org.apache.commons.net.nntp.o f(java.util.List<? extends org.apache.commons.net.nntp.o> r1) {
            r0 = this;
            org.apache.commons.net.nntp.o r1 = r0.e(r1)
            return r1
    }

    @java.lang.Deprecated
    public org.apache.commons.net.nntp.o g(org.apache.commons.net.nntp.o[] r1) {
            r0 = this;
            if (r1 != 0) goto L4
            r1 = 0
            return r1
        L4:
            java.util.List r1 = java.util.Arrays.asList(r1)
            org.apache.commons.net.nntp.o r1 = r0.f(r1)
            return r1
    }
}

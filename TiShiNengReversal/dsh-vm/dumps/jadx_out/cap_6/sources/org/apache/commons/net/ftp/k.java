package org.apache.commons.net.ftp;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class k {
    private java.util.List<java.lang.String> a;
    private java.util.ListIterator<java.lang.String> b;
    private final org.apache.commons.net.ftp.f c;
    private final boolean d;

    public k(org.apache.commons.net.ftp.f r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    k(org.apache.commons.net.ftp.f r2, org.apache.commons.net.ftp.d r3) {
            r1 = this;
            r1.<init>()
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.a = r0
            java.util.ListIterator r0 = r0.listIterator()
            r1.b = r0
            r1.c = r2
            if (r3 == 0) goto L1b
            boolean r2 = r3.i()
            r1.d = r2
            return
        L1b:
            r2 = 0
            r1.d = r2
            return
    }

    private void i(java.io.InputStream r3, java.lang.String r4) throws java.io.IOException {
            r2 = this;
            java.io.BufferedReader r0 = new java.io.BufferedReader
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            java.nio.charset.Charset r4 = org.apache.commons.net.util.b.a(r4)
            r1.<init>(r3, r4)
            r0.<init>(r1)
            org.apache.commons.net.ftp.f r3 = r2.c
            java.lang.String r3 = r3.b(r0)
        L14:
            if (r3 == 0) goto L22
            java.util.List<java.lang.String> r4 = r2.a
            r4.add(r3)
            org.apache.commons.net.ftp.f r3 = r2.c
            java.lang.String r3 = r3.b(r0)
            goto L14
        L22:
            r0.close()
            return
    }

    public org.apache.commons.net.ftp.FTPFile[] a() throws java.io.IOException {
            r1 = this;
            org.apache.commons.net.ftp.h r0 = org.apache.commons.net.ftp.i.b
            org.apache.commons.net.ftp.FTPFile[] r0 = r1.b(r0)
            return r0
    }

    public org.apache.commons.net.ftp.FTPFile[] b(org.apache.commons.net.ftp.h r6) throws java.io.IOException {
            r5 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List<java.lang.String> r1 = r5.a
            java.util.Iterator r1 = r1.iterator()
        Lb:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L32
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            org.apache.commons.net.ftp.f r3 = r5.c
            org.apache.commons.net.ftp.FTPFile r3 = r3.a(r2)
            if (r3 != 0) goto L28
            boolean r4 = r5.d
            if (r4 == 0) goto L28
            org.apache.commons.net.ftp.FTPFile r3 = new org.apache.commons.net.ftp.FTPFile
            r3.<init>(r2)
        L28:
            boolean r2 = r6.a(r3)
            if (r2 == 0) goto Lb
            r0.add(r3)
            goto Lb
        L32:
            int r6 = r0.size()
            org.apache.commons.net.ftp.FTPFile[] r6 = new org.apache.commons.net.ftp.FTPFile[r6]
            java.lang.Object[] r6 = r0.toArray(r6)
            org.apache.commons.net.ftp.FTPFile[] r6 = (org.apache.commons.net.ftp.FTPFile[]) r6
            return r6
    }

    public org.apache.commons.net.ftp.FTPFile[] c(int r5) {
            r4 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L5:
            if (r5 <= 0) goto L2e
            java.util.ListIterator<java.lang.String> r1 = r4.b
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L2e
            java.util.ListIterator<java.lang.String> r1 = r4.b
            java.lang.Object r1 = r1.next()
            java.lang.String r1 = (java.lang.String) r1
            org.apache.commons.net.ftp.f r2 = r4.c
            org.apache.commons.net.ftp.FTPFile r2 = r2.a(r1)
            if (r2 != 0) goto L28
            boolean r3 = r4.d
            if (r3 == 0) goto L28
            org.apache.commons.net.ftp.FTPFile r2 = new org.apache.commons.net.ftp.FTPFile
            r2.<init>(r1)
        L28:
            r0.add(r2)
            int r5 = r5 + (-1)
            goto L5
        L2e:
            int r5 = r0.size()
            org.apache.commons.net.ftp.FTPFile[] r5 = new org.apache.commons.net.ftp.FTPFile[r5]
            java.lang.Object[] r5 = r0.toArray(r5)
            org.apache.commons.net.ftp.FTPFile[] r5 = (org.apache.commons.net.ftp.FTPFile[]) r5
            return r5
    }

    public org.apache.commons.net.ftp.FTPFile[] d(int r5) {
            r4 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
        L5:
            if (r5 <= 0) goto L2f
            java.util.ListIterator<java.lang.String> r1 = r4.b
            boolean r1 = r1.hasPrevious()
            if (r1 == 0) goto L2f
            java.util.ListIterator<java.lang.String> r1 = r4.b
            java.lang.Object r1 = r1.previous()
            java.lang.String r1 = (java.lang.String) r1
            org.apache.commons.net.ftp.f r2 = r4.c
            org.apache.commons.net.ftp.FTPFile r2 = r2.a(r1)
            if (r2 != 0) goto L28
            boolean r3 = r4.d
            if (r3 == 0) goto L28
            org.apache.commons.net.ftp.FTPFile r2 = new org.apache.commons.net.ftp.FTPFile
            r2.<init>(r1)
        L28:
            r1 = 0
            r0.add(r1, r2)
            int r5 = r5 + (-1)
            goto L5
        L2f:
            int r5 = r0.size()
            org.apache.commons.net.ftp.FTPFile[] r5 = new org.apache.commons.net.ftp.FTPFile[r5]
            java.lang.Object[] r5 = r0.toArray(r5)
            org.apache.commons.net.ftp.FTPFile[] r5 = (org.apache.commons.net.ftp.FTPFile[]) r5
            return r5
    }

    public boolean e() {
            r1 = this;
            java.util.ListIterator<java.lang.String> r0 = r1.b
            boolean r0 = r0.hasNext()
            return r0
    }

    public boolean f() {
            r1 = this;
            java.util.ListIterator<java.lang.String> r0 = r1.b
            boolean r0 = r0.hasPrevious()
            return r0
    }

    @java.lang.Deprecated
    public void g(java.io.InputStream r2) throws java.io.IOException {
            r1 = this;
            r0 = 0
            r1.h(r2, r0)
            return
    }

    public void h(java.io.InputStream r2, java.lang.String r3) throws java.io.IOException {
            r1 = this;
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.a = r0
            r1.i(r2, r3)
            org.apache.commons.net.ftp.f r2 = r1.c
            java.util.List<java.lang.String> r3 = r1.a
            r2.d(r3)
            r1.j()
            return
    }

    public void j() {
            r1 = this;
            java.util.List<java.lang.String> r0 = r1.a
            java.util.ListIterator r0 = r0.listIterator()
            r1.b = r0
            return
    }
}

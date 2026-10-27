package org.junit.rules;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class j extends org.junit.rules.e {
    private final java.io.File a;
    private java.io.File b;

    public j() {
            r1 = this;
            r0 = 0
            r1.<init>(r0)
            return
    }

    public j(java.io.File r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    private java.io.File f(java.io.File r3) throws java.io.IOException {
            r2 = this;
            java.lang.String r0 = "junit"
            java.lang.String r1 = ""
            java.io.File r3 = java.io.File.createTempFile(r0, r1, r3)
            r3.delete()
            r3.mkdir()
            return r3
    }

    private boolean h(int r2, java.lang.String[] r3) {
            r1 = this;
            int r3 = r3.length
            r0 = 1
            int r3 = r3 - r0
            if (r2 != r3) goto L6
            return r0
        L6:
            r2 = 0
            return r2
    }

    private void n(java.io.File r5) {
            r4 = this;
            java.io.File[] r0 = r5.listFiles()
            if (r0 == 0) goto L12
            int r1 = r0.length
            r2 = 0
        L8:
            if (r2 >= r1) goto L12
            r3 = r0[r2]
            r4.n(r3)
            int r2 = r2 + 1
            goto L8
        L12:
            r5.delete()
            return
    }

    private void o(java.lang.String r2) throws java.io.IOException {
            r1 = this;
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.lang.String r2 = r0.getParent()
            if (r2 != 0) goto Lc
            return
        Lc:
            java.io.IOException r2 = new java.io.IOException
            java.lang.String r0 = "Folder name cannot consist of multiple path components separated by a file separator. Please use newFolder('MyParentFolder','MyFolder') to create hierarchies of folders"
            r2.<init>(r0)
            throw r2
    }

    @Override // org.junit.rules.e
    protected void b() {
            r0 = this;
            r0.delete()
            return
    }

    @Override // org.junit.rules.e
    protected void c() throws java.lang.Throwable {
            r0 = this;
            r0.e()
            return
    }

    public void delete() {
            r1 = this;
            java.io.File r0 = r1.b
            if (r0 == 0) goto L7
            r1.n(r0)
        L7:
            return
    }

    public void e() throws java.io.IOException {
            r1 = this;
            java.io.File r0 = r1.a
            java.io.File r0 = r1.f(r0)
            r1.b = r0
            return
    }

    public java.io.File g() {
            r2 = this;
            java.io.File r0 = r2.b
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "the temporary folder has not yet been created"
            r0.<init>(r1)
            throw r0
    }

    public java.io.File i() throws java.io.IOException {
            r3 = this;
            r0 = 0
            java.io.File r1 = r3.g()
            java.lang.String r2 = "junit"
            java.io.File r0 = java.io.File.createTempFile(r2, r0, r1)
            return r0
    }

    public java.io.File j(java.lang.String r4) throws java.io.IOException {
            r3 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = r3.g()
            r0.<init>(r1, r4)
            boolean r1 = r0.createNewFile()
            if (r1 == 0) goto L10
            return r0
        L10:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "a file with the name '"
            r1.append(r2)
            r1.append(r4)
            java.lang.String r4 = "' already exists in the test folder"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r0.<init>(r4)
            throw r0
    }

    public java.io.File k() throws java.io.IOException {
            r1 = this;
            java.io.File r0 = r1.g()
            java.io.File r0 = r1.f(r0)
            return r0
    }

    public java.io.File l(java.lang.String r1) throws java.io.IOException {
            r0 = this;
            java.lang.String[] r1 = new java.lang.String[]{r1}
            java.io.File r1 = r0.m(r1)
            return r1
    }

    public java.io.File m(java.lang.String... r5) throws java.io.IOException {
            r4 = this;
            java.io.File r0 = r4.g()
            r1 = 0
        L5:
            int r2 = r5.length
            if (r1 >= r2) goto L3f
            r2 = r5[r1]
            r4.o(r2)
            java.io.File r3 = new java.io.File
            r3.<init>(r0, r2)
            boolean r0 = r3.mkdir()
            if (r0 != 0) goto L3b
            boolean r0 = r4.h(r1, r5)
            if (r0 != 0) goto L1f
            goto L3b
        L1f:
            java.io.IOException r5 = new java.io.IOException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "a folder with the name '"
            r0.append(r1)
            r0.append(r2)
            java.lang.String r1 = "' already exists"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L3b:
            int r1 = r1 + 1
            r0 = r3
            goto L5
        L3f:
            return r0
    }
}

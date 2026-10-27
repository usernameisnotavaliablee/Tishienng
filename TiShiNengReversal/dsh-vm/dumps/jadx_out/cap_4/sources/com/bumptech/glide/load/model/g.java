package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class g implements com.bumptech.glide.load.c {
    private static final java.lang.String j = "@#&=*+-_.,:!?()/~'%;$";
    private final com.bumptech.glide.load.model.h c;

    @androidx.annotation.Nullable
    private final java.net.URL d;

    @androidx.annotation.Nullable
    private final java.lang.String e;

    @androidx.annotation.Nullable
    private java.lang.String f;

    @androidx.annotation.Nullable
    private java.net.URL g;

    @androidx.annotation.Nullable
    private volatile byte[] h;
    private int i;

    public g(java.lang.String r2) {
            r1 = this;
            com.bumptech.glide.load.model.h r0 = com.bumptech.glide.load.model.h.b
            r1.<init>(r2, r0)
            return
    }

    public g(java.lang.String r2, com.bumptech.glide.load.model.h r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.d = r0
            java.lang.String r2 = com.bumptech.glide.util.k.b(r2)
            r1.e = r2
            java.lang.Object r2 = com.bumptech.glide.util.k.d(r3)
            com.bumptech.glide.load.model.h r2 = (com.bumptech.glide.load.model.h) r2
            r1.c = r2
            return
    }

    public g(java.net.URL r2) {
            r1 = this;
            com.bumptech.glide.load.model.h r0 = com.bumptech.glide.load.model.h.b
            r1.<init>(r2, r0)
            return
    }

    public g(java.net.URL r1, com.bumptech.glide.load.model.h r2) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            java.net.URL r1 = (java.net.URL) r1
            r0.d = r1
            r1 = 0
            r0.e = r1
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r2)
            com.bumptech.glide.load.model.h r1 = (com.bumptech.glide.load.model.h) r1
            r0.c = r1
            return
    }

    private byte[] d() {
            r2 = this;
            byte[] r0 = r2.h
            if (r0 != 0) goto L10
            java.lang.String r0 = r2.c()
            java.nio.charset.Charset r1 = com.bumptech.glide.load.c.b
            byte[] r0 = r0.getBytes(r1)
            r2.h = r0
        L10:
            byte[] r0 = r2.h
            return r0
    }

    private java.lang.String f() {
            r2 = this;
            java.lang.String r0 = r2.f
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L24
            java.lang.String r0 = r2.e
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 == 0) goto L1c
            java.net.URL r0 = r2.d
            java.lang.Object r0 = com.bumptech.glide.util.k.d(r0)
            java.net.URL r0 = (java.net.URL) r0
            java.lang.String r0 = r0.toString()
        L1c:
            java.lang.String r1 = "@#&=*+-_.,:!?()/~'%;$"
            java.lang.String r0 = android.net.Uri.encode(r0, r1)
            r2.f = r0
        L24:
            java.lang.String r0 = r2.f
            return r0
    }

    private java.net.URL g() throws java.net.MalformedURLException {
            r2 = this;
            java.net.URL r0 = r2.g
            if (r0 != 0) goto Lf
            java.net.URL r0 = new java.net.URL
            java.lang.String r1 = r2.f()
            r0.<init>(r1)
            r2.g = r0
        Lf:
            java.net.URL r0 = r2.g
            return r0
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r2) {
            r1 = this;
            byte[] r0 = r1.d()
            r2.update(r0)
            return
    }

    public java.lang.String c() {
            r1 = this;
            java.lang.String r0 = r1.e
            if (r0 == 0) goto L5
            return r0
        L5:
            java.net.URL r0 = r1.d
            java.lang.Object r0 = com.bumptech.glide.util.k.d(r0)
            java.net.URL r0 = (java.net.URL) r0
            java.lang.String r0 = r0.toString()
            return r0
    }

    public java.util.Map<java.lang.String, java.lang.String> e() {
            r1 = this;
            com.bumptech.glide.load.model.h r0 = r1.c
            java.util.Map r0 = r0.getHeaders()
            return r0
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.load.model.g
            r1 = 0
            if (r0 == 0) goto L21
            com.bumptech.glide.load.model.g r4 = (com.bumptech.glide.load.model.g) r4
            java.lang.String r0 = r3.c()
            java.lang.String r2 = r4.c()
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L21
            com.bumptech.glide.load.model.h r0 = r3.c
            com.bumptech.glide.load.model.h r4 = r4.c
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L21
            r4 = 1
            return r4
        L21:
            return r1
    }

    public java.lang.String h() {
            r1 = this;
            java.lang.String r0 = r1.f()
            return r0
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r2 = this;
            int r0 = r2.i
            if (r0 != 0) goto L19
            java.lang.String r0 = r2.c()
            int r0 = r0.hashCode()
            r2.i = r0
            int r0 = r0 * 31
            com.bumptech.glide.load.model.h r1 = r2.c
            int r1 = r1.hashCode()
            int r0 = r0 + r1
            r2.i = r0
        L19:
            int r0 = r2.i
            return r0
    }

    public java.net.URL i() throws java.net.MalformedURLException {
            r1 = this;
            java.net.URL r0 = r1.g()
            return r0
    }

    public java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = r1.c()
            return r0
    }
}

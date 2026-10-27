package com.bumptech.glide.signature;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class e implements com.bumptech.glide.load.c {
    private final java.lang.Object c;

    public e(@androidx.annotation.NonNull java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            r0.c = r1
            return
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r3) {
            r2 = this;
            java.lang.Object r0 = r2.c
            java.lang.String r0 = r0.toString()
            java.nio.charset.Charset r1 = com.bumptech.glide.load.c.b
            byte[] r0 = r0.getBytes(r1)
            r3.update(r0)
            return
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.signature.e
            if (r0 == 0) goto Lf
            com.bumptech.glide.signature.e r2 = (com.bumptech.glide.signature.e) r2
            java.lang.Object r0 = r1.c
            java.lang.Object r2 = r2.c
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r1 = this;
            java.lang.Object r0 = r1.c
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "ObjectKey{object="
            r0.append(r1)
            java.lang.Object r1 = r2.c
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}

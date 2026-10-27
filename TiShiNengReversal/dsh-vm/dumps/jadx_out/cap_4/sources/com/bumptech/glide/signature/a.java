package com.bumptech.glide.signature;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class a implements com.bumptech.glide.load.c {
    private final int c;
    private final com.bumptech.glide.load.c d;

    private a(int r1, com.bumptech.glide.load.c r2) {
            r0 = this;
            r0.<init>()
            r0.c = r1
            r0.d = r2
            return
    }

    @androidx.annotation.NonNull
    public static com.bumptech.glide.load.c c(@androidx.annotation.NonNull android.content.Context r2) {
            com.bumptech.glide.load.c r0 = com.bumptech.glide.signature.b.c(r2)
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            int r2 = r2.uiMode
            r2 = r2 & 48
            com.bumptech.glide.signature.a r1 = new com.bumptech.glide.signature.a
            r1.<init>(r2, r0)
            return r1
    }

    @Override // com.bumptech.glide.load.c
    public void b(@androidx.annotation.NonNull java.security.MessageDigest r3) {
            r2 = this;
            com.bumptech.glide.load.c r0 = r2.d
            r0.b(r3)
            r0 = 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            int r1 = r2.c
            java.nio.ByteBuffer r0 = r0.putInt(r1)
            byte[] r0 = r0.array()
            r3.update(r0)
            return
    }

    @Override // com.bumptech.glide.load.c
    public boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.bumptech.glide.signature.a
            r1 = 0
            if (r0 == 0) goto L19
            com.bumptech.glide.signature.a r4 = (com.bumptech.glide.signature.a) r4
            int r0 = r3.c
            int r2 = r4.c
            if (r0 != r2) goto L19
            com.bumptech.glide.load.c r0 = r3.d
            com.bumptech.glide.load.c r4 = r4.d
            boolean r4 = r0.equals(r4)
            if (r4 == 0) goto L19
            r4 = 1
            return r4
        L19:
            return r1
    }

    @Override // com.bumptech.glide.load.c
    public int hashCode() {
            r2 = this;
            com.bumptech.glide.load.c r0 = r2.d
            int r1 = r2.c
            int r0 = com.bumptech.glide.util.l.q(r0, r1)
            return r0
    }
}

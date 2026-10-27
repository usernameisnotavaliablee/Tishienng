package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class g implements com.bumptech.glide.load.engine.bitmap_recycle.a<byte[]> {
    private static final java.lang.String a = "ByteArrayPool";

    public g() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public /* bridge */ /* synthetic */ int a(byte[] r1) {
            r0 = this;
            byte[] r1 = (byte[]) r1
            int r1 = r0.c(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b() {
            r1 = this;
            r0 = 1
            return r0
    }

    public int c(byte[] r1) {
            r0 = this;
            int r1 = r1.length
            return r1
    }

    public byte[] d(int r1) {
            r0 = this;
            byte[] r1 = new byte[r1]
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = "ByteArrayPool"
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public /* bridge */ /* synthetic */ byte[] newArray(int r1) {
            r0 = this;
            byte[] r1 = r0.d(r1)
            return r1
    }
}

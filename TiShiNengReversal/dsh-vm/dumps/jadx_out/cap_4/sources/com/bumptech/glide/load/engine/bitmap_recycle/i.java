package com.bumptech.glide.load.engine.bitmap_recycle;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class i implements com.bumptech.glide.load.engine.bitmap_recycle.a<int[]> {
    private static final java.lang.String a = "IntegerArrayPool";

    public i() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public /* bridge */ /* synthetic */ int a(int[] r1) {
            r0 = this;
            int[] r1 = (int[]) r1
            int r1 = r0.c(r1)
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public int b() {
            r1 = this;
            r0 = 4
            return r0
    }

    public int c(int[] r1) {
            r0 = this;
            int r1 = r1.length
            return r1
    }

    public int[] d(int r1) {
            r0 = this;
            int[] r1 = new int[r1]
            return r1
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public java.lang.String getTag() {
            r1 = this;
            java.lang.String r0 = "IntegerArrayPool"
            return r0
    }

    @Override // com.bumptech.glide.load.engine.bitmap_recycle.a
    public /* bridge */ /* synthetic */ int[] newArray(int r1) {
            r0 = this;
            int[] r1 = r0.d(r1)
            return r1
    }
}

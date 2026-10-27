package u;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class b implements com.bumptech.glide.load.engine.u<byte[]> {
    private final byte[] a;

    public b(byte[] r1) {
            r0 = this;
            r0.<init>()
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r1)
            byte[] r1 = (byte[]) r1
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public java.lang.Class<byte[]> a() {
            r1 = this;
            java.lang.Class<byte[]> r0 = byte[].class
            return r0
    }

    @androidx.annotation.NonNull
    public byte[] b() {
            r1 = this;
            byte[] r0 = r1.a
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ byte[] get() {
            r1 = this;
            byte[] r0 = r1.b()
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public int getSize() {
            r1 = this;
            byte[] r0 = r1.a
            int r0 = r0.length
            return r0
    }

    @Override // com.bumptech.glide.load.engine.u
    public void recycle() {
            r0 = this;
            return
    }
}

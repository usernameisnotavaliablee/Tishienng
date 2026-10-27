package u;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a implements com.bumptech.glide.load.data.e<java.nio.ByteBuffer> {
    private final java.nio.ByteBuffer a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: u.a$a, reason: collision with other inner class name */
    public static class C0248a implements com.bumptech.glide.load.data.e.a<java.nio.ByteBuffer> {
        public C0248a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.data.e.a
        @androidx.annotation.NonNull
        public java.lang.Class<java.nio.ByteBuffer> a() {
                r1 = this;
                java.lang.Class<java.nio.ByteBuffer> r0 = java.nio.ByteBuffer.class
                return r0
        }

        @Override // com.bumptech.glide.load.data.e.a
        @androidx.annotation.NonNull
        public /* bridge */ /* synthetic */ com.bumptech.glide.load.data.e<java.nio.ByteBuffer> b(java.nio.ByteBuffer r1) {
                r0 = this;
                java.nio.ByteBuffer r1 = (java.nio.ByteBuffer) r1
                com.bumptech.glide.load.data.e r1 = r0.c(r1)
                return r1
        }

        @androidx.annotation.NonNull
        public com.bumptech.glide.load.data.e<java.nio.ByteBuffer> c(java.nio.ByteBuffer r2) {
                r1 = this;
                u.a r0 = new u.a
                r0.<init>(r2)
                return r0
        }
    }

    public a(java.nio.ByteBuffer r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // com.bumptech.glide.load.data.e
    @androidx.annotation.NonNull
    public /* bridge */ /* synthetic */ java.nio.ByteBuffer a() throws java.io.IOException {
            r1 = this;
            java.nio.ByteBuffer r0 = r1.c()
            return r0
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
            r0 = this;
            return
    }

    @androidx.annotation.NonNull
    public java.nio.ByteBuffer c() {
            r2 = this;
            java.nio.ByteBuffer r0 = r2.a
            r1 = 0
            r0.position(r1)
            java.nio.ByteBuffer r0 = r2.a
            return r0
    }
}

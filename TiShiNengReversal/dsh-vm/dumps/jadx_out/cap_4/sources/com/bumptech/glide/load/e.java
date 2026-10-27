package com.bumptech.glide.load;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public final class e<T> {
    private static final com.bumptech.glide.load.e.b<java.lang.Object> e = null;
    private final T a;
    private final com.bumptech.glide.load.e.b<T> b;
    private final java.lang.String c;
    private volatile byte[] d;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements com.bumptech.glide.load.e.b<java.lang.Object> {
        a() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.bumptech.glide.load.e.b
        public void update(@androidx.annotation.NonNull byte[] r1, @androidx.annotation.NonNull java.lang.Object r2, @androidx.annotation.NonNull java.security.MessageDigest r3) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b<T> {
        void update(@androidx.annotation.NonNull byte[] r1, @androidx.annotation.NonNull T r2, @androidx.annotation.NonNull java.security.MessageDigest r3);
    }

    static {
            com.bumptech.glide.load.e$a r0 = new com.bumptech.glide.load.e$a
            r0.<init>()
            com.bumptech.glide.load.e.e = r0
            return
    }

    private e(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable T r2, @androidx.annotation.NonNull com.bumptech.glide.load.e.b<T> r3) {
            r0 = this;
            r0.<init>()
            java.lang.String r1 = com.bumptech.glide.util.k.b(r1)
            r0.c = r1
            r0.a = r2
            java.lang.Object r1 = com.bumptech.glide.util.k.d(r3)
            com.bumptech.glide.load.e$b r1 = (com.bumptech.glide.load.e.b) r1
            r0.b = r1
            return
    }

    @androidx.annotation.NonNull
    public static <T> com.bumptech.glide.load.e<T> a(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull com.bumptech.glide.load.e.b<T> r3) {
            com.bumptech.glide.load.e r0 = new com.bumptech.glide.load.e
            r1 = 0
            r0.<init>(r2, r1, r3)
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> com.bumptech.glide.load.e<T> b(@androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.Nullable T r2, @androidx.annotation.NonNull com.bumptech.glide.load.e.b<T> r3) {
            com.bumptech.glide.load.e r0 = new com.bumptech.glide.load.e
            r0.<init>(r1, r2, r3)
            return r0
    }

    @androidx.annotation.NonNull
    private static <T> com.bumptech.glide.load.e.b<T> c() {
            com.bumptech.glide.load.e$b<java.lang.Object> r0 = com.bumptech.glide.load.e.e
            return r0
    }

    @androidx.annotation.NonNull
    private byte[] e() {
            r2 = this;
            byte[] r0 = r2.d
            if (r0 != 0) goto Le
            java.lang.String r0 = r2.c
            java.nio.charset.Charset r1 = com.bumptech.glide.load.c.b
            byte[] r0 = r0.getBytes(r1)
            r2.d = r0
        Le:
            byte[] r0 = r2.d
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> com.bumptech.glide.load.e<T> f(@androidx.annotation.NonNull java.lang.String r3) {
            com.bumptech.glide.load.e r0 = new com.bumptech.glide.load.e
            r1 = 0
            com.bumptech.glide.load.e$b r2 = c()
            r0.<init>(r3, r1, r2)
            return r0
    }

    @androidx.annotation.NonNull
    public static <T> com.bumptech.glide.load.e<T> g(@androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.NonNull T r3) {
            com.bumptech.glide.load.e r0 = new com.bumptech.glide.load.e
            com.bumptech.glide.load.e$b r1 = c()
            r0.<init>(r2, r3, r1)
            return r0
    }

    @androidx.annotation.Nullable
    public T d() {
            r1 = this;
            T r0 = r1.a
            return r0
    }

    public boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof com.bumptech.glide.load.e
            if (r0 == 0) goto Lf
            com.bumptech.glide.load.e r2 = (com.bumptech.glide.load.e) r2
            java.lang.String r0 = r1.c
            java.lang.String r2 = r2.c
            boolean r2 = r0.equals(r2)
            return r2
        Lf:
            r2 = 0
            return r2
    }

    public int hashCode() {
            r1 = this;
            java.lang.String r0 = r1.c
            int r0 = r0.hashCode()
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Option{key='"
            r0.append(r1)
            java.lang.String r1 = r2.c
            r0.append(r1)
            r1 = 39
            r0.append(r1)
            r1 = 125(0x7d, float:1.75E-43)
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }

    public void update(@androidx.annotation.NonNull T r3, @androidx.annotation.NonNull java.security.MessageDigest r4) {
            r2 = this;
            com.bumptech.glide.load.e$b<T> r0 = r2.b
            byte[] r1 = r2.e()
            r0.update(r1, r3, r4)
            return
    }
}

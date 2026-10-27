package com.bumptech.glide.load.model;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class s<Data> implements com.bumptech.glide.load.model.n<java.lang.Integer, Data> {
    private static final java.lang.String c = "ResourceLoader";
    private final com.bumptech.glide.load.model.n<android.net.Uri, Data> a;
    private final android.content.res.Resources b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class a implements com.bumptech.glide.load.model.o<java.lang.Integer, android.content.res.AssetFileDescriptor> {
        private final android.content.res.Resources a;

        public a(android.content.res.Resources r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public com.bumptech.glide.load.model.n<java.lang.Integer, android.content.res.AssetFileDescriptor> c(com.bumptech.glide.load.model.r r5) {
                r4 = this;
                com.bumptech.glide.load.model.s r0 = new com.bumptech.glide.load.model.s
                android.content.res.Resources r1 = r4.a
                java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
                java.lang.Class<android.content.res.AssetFileDescriptor> r3 = android.content.res.AssetFileDescriptor.class
                com.bumptech.glide.load.model.n r5 = r5.d(r2, r3)
                r0.<init>(r1, r5)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class b implements com.bumptech.glide.load.model.o<java.lang.Integer, android.os.ParcelFileDescriptor> {
        private final android.content.res.Resources a;

        public b(android.content.res.Resources r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<java.lang.Integer, android.os.ParcelFileDescriptor> c(com.bumptech.glide.load.model.r r5) {
                r4 = this;
                com.bumptech.glide.load.model.s r0 = new com.bumptech.glide.load.model.s
                android.content.res.Resources r1 = r4.a
                java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
                java.lang.Class<android.os.ParcelFileDescriptor> r3 = android.os.ParcelFileDescriptor.class
                com.bumptech.glide.load.model.n r5 = r5.d(r2, r3)
                r0.<init>(r1, r5)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class c implements com.bumptech.glide.load.model.o<java.lang.Integer, java.io.InputStream> {
        private final android.content.res.Resources a;

        public c(android.content.res.Resources r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<java.lang.Integer, java.io.InputStream> c(com.bumptech.glide.load.model.r r5) {
                r4 = this;
                com.bumptech.glide.load.model.s r0 = new com.bumptech.glide.load.model.s
                android.content.res.Resources r1 = r4.a
                java.lang.Class<android.net.Uri> r2 = android.net.Uri.class
                java.lang.Class<java.io.InputStream> r3 = java.io.InputStream.class
                com.bumptech.glide.load.model.n r5 = r5.d(r2, r3)
                r0.<init>(r1, r5)
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class d implements com.bumptech.glide.load.model.o<java.lang.Integer, android.net.Uri> {
        private final android.content.res.Resources a;

        public d(android.content.res.Resources r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        @Override // com.bumptech.glide.load.model.o
        public void b() {
                r0 = this;
                return
        }

        @Override // com.bumptech.glide.load.model.o
        @androidx.annotation.NonNull
        public com.bumptech.glide.load.model.n<java.lang.Integer, android.net.Uri> c(com.bumptech.glide.load.model.r r3) {
                r2 = this;
                com.bumptech.glide.load.model.s r3 = new com.bumptech.glide.load.model.s
                android.content.res.Resources r0 = r2.a
                com.bumptech.glide.load.model.v r1 = com.bumptech.glide.load.model.v.c()
                r3.<init>(r0, r1)
                return r3
        }
    }

    public s(android.content.res.Resources r1, com.bumptech.glide.load.model.n<android.net.Uri, Data> r2) {
            r0 = this;
            r0.<init>()
            r0.b = r1
            r0.a = r2
            return
    }

    @androidx.annotation.Nullable
    private android.net.Uri d(java.lang.Integer r5) {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: android.content.res.Resources.NotFoundException -> L42
            r0.<init>()     // Catch: android.content.res.Resources.NotFoundException -> L42
            java.lang.String r1 = "android.resource://"
            r0.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L42
            android.content.res.Resources r1 = r4.b     // Catch: android.content.res.Resources.NotFoundException -> L42
            int r2 = r5.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L42
            java.lang.String r1 = r1.getResourcePackageName(r2)     // Catch: android.content.res.Resources.NotFoundException -> L42
            r0.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L42
            r1 = 47
            r0.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L42
            android.content.res.Resources r2 = r4.b     // Catch: android.content.res.Resources.NotFoundException -> L42
            int r3 = r5.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L42
            java.lang.String r2 = r2.getResourceTypeName(r3)     // Catch: android.content.res.Resources.NotFoundException -> L42
            r0.append(r2)     // Catch: android.content.res.Resources.NotFoundException -> L42
            r0.append(r1)     // Catch: android.content.res.Resources.NotFoundException -> L42
            android.content.res.Resources r1 = r4.b     // Catch: android.content.res.Resources.NotFoundException -> L42
            int r5 = r5.intValue()     // Catch: android.content.res.Resources.NotFoundException -> L42
            java.lang.String r5 = r1.getResourceEntryName(r5)     // Catch: android.content.res.Resources.NotFoundException -> L42
            r0.append(r5)     // Catch: android.content.res.Resources.NotFoundException -> L42
            java.lang.String r5 = r0.toString()     // Catch: android.content.res.Resources.NotFoundException -> L42
            android.net.Uri r5 = android.net.Uri.parse(r5)     // Catch: android.content.res.Resources.NotFoundException -> L42
            return r5
        L42:
            java.lang.String r5 = "ResourceLoader"
            r0 = 5
            android.util.Log.isLoggable(r5, r0)
            r5 = 0
            return r5
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ com.bumptech.glide.load.model.n.a a(@androidx.annotation.NonNull java.lang.Integer r1, int r2, int r3, @androidx.annotation.NonNull com.bumptech.glide.load.f r4) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            com.bumptech.glide.load.model.n$a r1 = r0.c(r1, r2, r3, r4)
            return r1
    }

    @Override // com.bumptech.glide.load.model.n
    public /* bridge */ /* synthetic */ boolean b(@androidx.annotation.NonNull java.lang.Integer r1) {
            r0 = this;
            java.lang.Integer r1 = (java.lang.Integer) r1
            boolean r1 = r0.e(r1)
            return r1
    }

    public com.bumptech.glide.load.model.n.a<Data> c(@androidx.annotation.NonNull java.lang.Integer r2, int r3, int r4, @androidx.annotation.NonNull com.bumptech.glide.load.f r5) {
            r1 = this;
            android.net.Uri r2 = r1.d(r2)
            if (r2 != 0) goto L8
            r2 = 0
            return r2
        L8:
            com.bumptech.glide.load.model.n<android.net.Uri, Data> r0 = r1.a
            com.bumptech.glide.load.model.n$a r2 = r0.a(r2, r3, r4, r5)
            return r2
    }

    public boolean e(@androidx.annotation.NonNull java.lang.Integer r1) {
            r0 = this;
            r1 = 1
            return r1
    }
}

package xyz.adscope.common.network.simple.cache;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_3_sz3714748.dex */
public class DiskCacheStore implements xyz.adscope.common.network.simple.cache.CacheStore {
    private xyz.adscope.common.network.secure.Secret a;
    private java.lang.String b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: xyz.adscope.common.network.simple.cache.DiskCacheStore$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class Builder {
        private java.lang.String a;
        private java.lang.String b;

        private Builder(java.lang.String r1) {
                r0 = this;
                r0.<init>()
                r0.a = r1
                return
        }

        /* synthetic */ Builder(java.lang.String r1, xyz.adscope.common.network.simple.cache.DiskCacheStore.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        static /* synthetic */ java.lang.String a(xyz.adscope.common.network.simple.cache.DiskCacheStore.Builder r0) {
                java.lang.String r0 = r0.a
                return r0
        }

        static /* synthetic */ java.lang.String b(xyz.adscope.common.network.simple.cache.DiskCacheStore.Builder r0) {
                java.lang.String r0 = r0.b
                return r0
        }

        public xyz.adscope.common.network.simple.cache.DiskCacheStore build() {
                r2 = this;
                xyz.adscope.common.network.simple.cache.DiskCacheStore r0 = new xyz.adscope.common.network.simple.cache.DiskCacheStore
                r1 = 0
                r0.<init>(r2, r1)
                return r0
        }

        public xyz.adscope.common.network.simple.cache.DiskCacheStore.Builder password(java.lang.String r1) {
                r0 = this;
                r0.b = r1
                return r0
        }
    }

    private DiskCacheStore(xyz.adscope.common.network.simple.cache.DiskCacheStore.Builder r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = xyz.adscope.common.network.simple.cache.DiskCacheStore.Builder.a(r2)
            r1.b = r0
            java.lang.String r0 = xyz.adscope.common.network.simple.cache.DiskCacheStore.Builder.b(r2)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L16
            java.lang.String r2 = r1.b
            goto L1a
        L16:
            java.lang.String r2 = xyz.adscope.common.network.simple.cache.DiskCacheStore.Builder.b(r2)
        L1a:
            xyz.adscope.common.network.secure.Secret r2 = xyz.adscope.common.network.secure.Encryption.createSecret(r2)
            r1.a = r2
            return
    }

    /* synthetic */ DiskCacheStore(xyz.adscope.common.network.simple.cache.DiskCacheStore.Builder r1, xyz.adscope.common.network.simple.cache.DiskCacheStore.AnonymousClass1 r2) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    private java.lang.String a(java.lang.String r2) {
            r1 = this;
            xyz.adscope.common.network.secure.Secret r0 = r1.a
            java.lang.String r2 = r0.decrypt(r2)
            return r2
    }

    private java.lang.String b(java.lang.String r2) {
            r1 = this;
            xyz.adscope.common.network.secure.Secret r0 = r1.a
            java.lang.String r2 = r0.encrypt(r2)
            return r2
    }

    private java.lang.String c(java.lang.String r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.b
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r3 = xyz.adscope.common.network.secure.Encryption.getMD5ForString(r3)
            return r3
    }

    public static xyz.adscope.common.network.simple.cache.DiskCacheStore.Builder newBuilder(java.lang.String r2) {
            xyz.adscope.common.network.simple.cache.DiskCacheStore$Builder r0 = new xyz.adscope.common.network.simple.cache.DiskCacheStore$Builder
            r1 = 0
            r0.<init>(r2, r1)
            return r0
    }

    @Override // xyz.adscope.common.network.simple.cache.CacheStore
    public boolean clear() {
            r1 = this;
            java.lang.String r0 = r1.b
            boolean r0 = xyz.adscope.common.network.util.IOUtils.delFileOrFolder(r0)
            return r0
    }

    @Override // xyz.adscope.common.network.simple.cache.CacheStore
    public xyz.adscope.common.network.simple.cache.Cache get(java.lang.String r7) {
            r6 = this;
            java.lang.String r7 = r6.c(r7)
            r0 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L70
            java.lang.String r2 = r6.b     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L70
            r1.<init>(r2, r7)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L70
            boolean r2 = r1.exists()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L70
            if (r2 == 0) goto L6c
            boolean r2 = r1.isDirectory()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L70
            if (r2 == 0) goto L19
            goto L6c
        L19:
            xyz.adscope.common.network.simple.cache.Cache r2 = new xyz.adscope.common.network.simple.cache.Cache     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L70
            r2.<init>()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L70
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L70
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L70
            r4.<init>(r1)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L70
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L70
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            java.lang.String r1 = r6.a(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            r2.setCode(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            java.lang.String r1 = r6.a(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            xyz.adscope.common.network.Headers r1 = xyz.adscope.common.network.Headers.fromJSONString(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            r2.setHeaders(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            java.lang.String r1 = r6.a(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            byte[] r1 = xyz.adscope.common.network.secure.Encryption.hexToByteArray(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            r2.setBody(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            java.lang.String r1 = r6.a(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            long r4 = java.lang.Long.parseLong(r1)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            r2.setExpires(r4)     // Catch: java.lang.Throwable -> L68 java.lang.Exception -> L71
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r3)
            return r2
        L68:
            r7 = move-exception
            goto L82
        L6a:
            r7 = move-exception
            goto L81
        L6c:
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r0)
            return r0
        L70:
            r3 = r0
        L71:
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L7f
            java.lang.String r2 = r6.b     // Catch: java.lang.Throwable -> L7f
            r1.<init>(r2, r7)     // Catch: java.lang.Throwable -> L7f
            xyz.adscope.common.network.util.IOUtils.delFileOrFolder(r1)     // Catch: java.lang.Throwable -> L7f
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r3)
            return r0
        L7f:
            r7 = move-exception
            r0 = r3
        L81:
            r3 = r0
        L82:
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r3)
            throw r7
    }

    @Override // xyz.adscope.common.network.simple.cache.CacheStore
    public boolean remove(java.lang.String r3) {
            r2 = this;
            java.lang.String r3 = r2.c(r3)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = r2.b
            r0.<init>(r1, r3)
            boolean r3 = xyz.adscope.common.network.util.IOUtils.delFileOrFolder(r0)
            return r3
    }

    @Override // xyz.adscope.common.network.simple.cache.CacheStore
    public boolean replace(java.lang.String r5, xyz.adscope.common.network.simple.cache.Cache r6) {
            r4 = this;
            java.lang.String r5 = r4.c(r5)
            r0 = 0
            r1 = 0
            boolean r2 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            if (r2 != 0) goto L84
            if (r6 != 0) goto Lf
            goto L84
        Lf:
            java.lang.String r2 = r4.b     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            boolean r2 = xyz.adscope.common.network.util.IOUtils.createFolder(r2)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            if (r2 != 0) goto L1b
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r1)
            return r0
        L1b:
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            java.lang.String r3 = r4.b     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            r2.<init>(r3, r5)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            boolean r3 = xyz.adscope.common.network.util.IOUtils.createNewFile(r2)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            if (r3 != 0) goto L2c
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r1)
            return r0
        L2c:
            java.io.FileWriter r3 = new java.io.FileWriter     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            java.io.BufferedWriter r1 = xyz.adscope.common.network.util.IOUtils.toBufferedWriter(r3)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            int r2 = r6.getCode()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            java.lang.String r2 = java.lang.Integer.toString(r2)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            java.lang.String r2 = r4.b(r2)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            r1.write(r2)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            r1.newLine()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            xyz.adscope.common.network.Headers r2 = r6.getHeaders()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            java.lang.String r2 = xyz.adscope.common.network.Headers.toJSONString(r2)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            java.lang.String r2 = r4.b(r2)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            r1.write(r2)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            r1.newLine()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            byte[] r2 = r6.getBody()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            java.lang.String r2 = xyz.adscope.common.network.secure.Encryption.byteArrayToHex(r2)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            java.lang.String r2 = r4.b(r2)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            r1.write(r2)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            r1.newLine()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            long r2 = r6.getExpires()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            java.lang.String r6 = java.lang.Long.toString(r2)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            java.lang.String r6 = r4.b(r6)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            r1.write(r6)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            r1.flush()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L88
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r1)
            r5 = 1
            return r5
        L82:
            r5 = move-exception
            goto L96
        L84:
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r1)
            return r0
        L88:
            java.io.File r6 = new java.io.File     // Catch: java.lang.Throwable -> L82
            java.lang.String r2 = r4.b     // Catch: java.lang.Throwable -> L82
            r6.<init>(r2, r5)     // Catch: java.lang.Throwable -> L82
            xyz.adscope.common.network.util.IOUtils.delFileOrFolder(r6)     // Catch: java.lang.Throwable -> L82
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r1)
            return r0
        L96:
            xyz.adscope.common.network.util.IOUtils.closeQuietly(r1)
            throw r5
    }
}

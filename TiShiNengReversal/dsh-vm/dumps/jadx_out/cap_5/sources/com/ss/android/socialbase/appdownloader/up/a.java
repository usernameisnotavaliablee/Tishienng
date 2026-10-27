package com.ss.android.socialbase.appdownloader.up;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class a {
    private static int b = 8;
    private static volatile com.ss.android.socialbase.appdownloader.up.a c;
    private com.ss.android.socialbase.appdownloader.up.a.b<java.lang.Integer, android.graphics.Bitmap> a;

    /* renamed from: com.ss.android.socialbase.appdownloader.up.a$a, reason: collision with other inner class name */
    class RunnableC0230a implements java.lang.Runnable {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ int b;
        final /* synthetic */ com.ss.android.socialbase.appdownloader.up.a c;

        RunnableC0230a(com.ss.android.socialbase.appdownloader.up.a r1, java.lang.String r2, int r3) {
                r0 = this;
                r0.c = r1
                r0.a = r2
                r0.b = r3
                r0.<init>()
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r14 = this;
                r0 = 3
                r1 = 2
                r2 = 4
                r3 = 0
                r4 = 1
                r5 = 0
                java.lang.String r6 = r14.a     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f
                com.ss.android.socialbase.downloader.g.g r6 = com.ss.android.socialbase.downloader.downloader.cw.j(r4, r3, r6, r5)     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f
                if (r6 != 0) goto L1c
                java.io.Closeable[] r2 = new java.io.Closeable[r2]
                r2[r3] = r5
                r2[r4] = r5
                r2[r1] = r5
                r2[r0] = r5
                com.ss.android.socialbase.downloader.az.m.j(r2)
                return
            L1c:
                java.io.InputStream r6 = r6.j()     // Catch: java.lang.Throwable -> L98 java.lang.Exception -> L9f
                java.io.ByteArrayOutputStream r7 = com.ss.android.socialbase.appdownloader.up.a.e(r6)     // Catch: java.lang.Throwable -> L8c java.lang.Exception -> L92
                java.io.ByteArrayInputStream r8 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L87
                byte[] r9 = r7.toByteArray()     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L87
                r8.<init>(r9)     // Catch: java.lang.Throwable -> L82 java.lang.Exception -> L87
                java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7d
                byte[] r10 = r7.toByteArray()     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7d
                r9.<init>(r10)     // Catch: java.lang.Throwable -> L78 java.lang.Exception -> L7d
                android.graphics.BitmapFactory$Options r10 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r10.<init>()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r10.inJustDecodeBounds = r4     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                android.graphics.BitmapFactory.decodeStream(r8, r5, r10)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                android.content.Context r11 = com.ss.android.socialbase.downloader.downloader.cw.nd()     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r12 = 1110441984(0x42300000, float:44.0)
                int r11 = com.ss.android.socialbase.appdownloader.b.g(r11, r12)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                int r11 = com.ss.android.socialbase.appdownloader.up.a.a(r11, r11, r10)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r10.inSampleSize = r11     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r10.inJustDecodeBounds = r3     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeStream(r9, r5, r10)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                com.ss.android.socialbase.appdownloader.up.a r10 = r14.c     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                com.ss.android.socialbase.appdownloader.up.a$b r10 = com.ss.android.socialbase.appdownloader.up.a.c(r10)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                int r11 = r14.b     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                r10.put(r11, r5)     // Catch: java.lang.Throwable -> L73 java.lang.Exception -> L76
                java.io.Closeable[] r2 = new java.io.Closeable[r2]
                r2[r3] = r6
                r2[r4] = r7
                r2[r1] = r8
                r2[r0] = r9
                com.ss.android.socialbase.downloader.az.m.j(r2)
                return
            L73:
                r5 = move-exception
                goto Lb6
            L76:
                r5 = move-exception
                goto La5
            L78:
                r9 = move-exception
                r13 = r9
                r9 = r5
                r5 = r13
                goto Lb6
            L7d:
                r9 = move-exception
                r13 = r9
                r9 = r5
                r5 = r13
                goto La5
            L82:
                r8 = move-exception
                r9 = r5
                r5 = r8
                r8 = r9
                goto Lb6
            L87:
                r8 = move-exception
                r9 = r5
                r5 = r8
                r8 = r9
                goto La5
            L8c:
                r7 = move-exception
                r8 = r5
                r9 = r8
                r5 = r7
                r7 = r9
                goto Lb6
            L92:
                r7 = move-exception
                r8 = r5
                r9 = r8
                r5 = r7
                r7 = r9
                goto La5
            L98:
                r6 = move-exception
                r7 = r5
                r8 = r7
                r9 = r8
                r5 = r6
                r6 = r9
                goto Lb6
            L9f:
                r6 = move-exception
                r7 = r5
                r8 = r7
                r9 = r8
                r5 = r6
                r6 = r9
            La5:
                com.bytedance.sdk.component.utils.vl.j(r5)     // Catch: java.lang.Throwable -> L73
                java.io.Closeable[] r2 = new java.io.Closeable[r2]
                r2[r3] = r6
                r2[r4] = r7
                r2[r1] = r8
                r2[r0] = r9
                com.ss.android.socialbase.downloader.az.m.j(r2)
                return
            Lb6:
                java.io.Closeable[] r2 = new java.io.Closeable[r2]
                r2[r3] = r6
                r2[r4] = r7
                r2[r1] = r8
                r2[r0] = r9
                com.ss.android.socialbase.downloader.az.m.j(r2)
                throw r5
        }
    }

    private static class b<K, T> extends java.util.LinkedHashMap<K, T> {
        final int a;

        public b(int r3, int r4) {
                r2 = this;
                r0 = 1061158912(0x3f400000, float:0.75)
                r1 = 1
                r2.<init>(r4, r0, r1)
                r2.a = r3
                return
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(java.util.Map.Entry<K, T> r2) {
                r1 = this;
                int r2 = r1.size()
                int r0 = r1.a
                if (r2 <= r0) goto La
                r2 = 1
                return r2
            La:
                r2 = 0
                return r2
        }
    }

    static {
            return
    }

    private a() {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.a = r0
            com.ss.android.socialbase.appdownloader.up.a$b r0 = new com.ss.android.socialbase.appdownloader.up.a$b
            int r1 = com.ss.android.socialbase.appdownloader.up.a.b
            int r2 = r1 / 2
            r0.<init>(r1, r2)
            r3.a = r0
            return
    }

    public static int a(int r2, int r3, android.graphics.BitmapFactory.Options r4) {
            int r0 = r4.outWidth
            if (r0 > r2) goto Lb
            int r1 = r4.outHeight
            if (r1 <= r3) goto L9
            goto Lb
        L9:
            r2 = 1
            return r2
        Lb:
            float r0 = (float) r0
            float r2 = (float) r2
            float r0 = r0 / r2
            int r2 = java.lang.Math.round(r0)
            int r4 = r4.outHeight
            float r4 = (float) r4
            float r3 = (float) r3
            float r4 = r4 / r3
            int r3 = java.lang.Math.round(r4)
            int r2 = java.lang.Math.min(r2, r3)
            return r2
    }

    static /* synthetic */ com.ss.android.socialbase.appdownloader.up.a.b c(com.ss.android.socialbase.appdownloader.up.a r0) {
            com.ss.android.socialbase.appdownloader.up.a$b<java.lang.Integer, android.graphics.Bitmap> r0 = r0.a
            return r0
    }

    public static com.ss.android.socialbase.appdownloader.up.a d() {
            com.ss.android.socialbase.appdownloader.up.a r0 = com.ss.android.socialbase.appdownloader.up.a.c
            if (r0 != 0) goto L19
            java.lang.Class<com.ss.android.socialbase.appdownloader.up.a> r0 = com.ss.android.socialbase.appdownloader.up.a.class
            monitor-enter(r0)
            com.ss.android.socialbase.appdownloader.up.a r1 = com.ss.android.socialbase.appdownloader.up.a.c     // Catch: java.lang.Throwable -> L13
            if (r1 != 0) goto L15
            com.ss.android.socialbase.appdownloader.up.a r1 = new com.ss.android.socialbase.appdownloader.up.a     // Catch: java.lang.Throwable -> L13
            r1.<init>()     // Catch: java.lang.Throwable -> L13
            com.ss.android.socialbase.appdownloader.up.a.c = r1     // Catch: java.lang.Throwable -> L13
            goto L15
        L13:
            r1 = move-exception
            goto L17
        L15:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            goto L19
        L17:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L13
            throw r1
        L19:
            com.ss.android.socialbase.appdownloader.up.a r0 = com.ss.android.socialbase.appdownloader.up.a.c
            return r0
    }

    static /* synthetic */ java.io.ByteArrayOutputStream e(java.io.InputStream r0) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = g(r0)
            return r0
    }

    private static java.io.ByteArrayOutputStream g(java.io.InputStream r4) throws java.io.IOException {
            java.io.ByteArrayOutputStream r0 = new java.io.ByteArrayOutputStream
            r0.<init>()
            r1 = 1024(0x400, float:1.435E-42)
            byte[] r1 = new byte[r1]
        L9:
            int r2 = r4.read(r1)
            if (r2 < 0) goto L14
            r3 = 0
            r0.write(r1, r3, r2)
            goto L9
        L14:
            r0.flush()
            return r0
    }

    public android.graphics.Bitmap b(int r2) {
            r1 = this;
            com.ss.android.socialbase.appdownloader.up.a$b<java.lang.Integer, android.graphics.Bitmap> r0 = r1.a
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            java.lang.Object r2 = r0.get(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            return r2
    }

    public void f(int r3, java.lang.String r4) {
            r2 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r4)
            if (r0 != 0) goto L19
            android.graphics.Bitmap r0 = r2.b(r3)
            if (r0 == 0) goto Ld
            goto L19
        Ld:
            java.util.concurrent.ExecutorService r0 = com.ss.android.socialbase.downloader.downloader.cw.vl()
            com.ss.android.socialbase.appdownloader.up.a$a r1 = new com.ss.android.socialbase.appdownloader.up.a$a
            r1.<init>(r2, r4, r3)
            r0.submit(r1)
        L19:
            return
    }
}

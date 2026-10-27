package com.ss.android.downloadlib.addownload.compliance;

/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class r extends com.ss.android.socialbase.downloader.az.tl<java.lang.Long, android.graphics.Bitmap> {
    private final java.util.Map<java.lang.Long, java.lang.ref.SoftReference<com.ss.android.downloadlib.addownload.compliance.r.c>> j;

    class a implements com.ss.android.downloadlib.a.e.InterfaceC0189a<java.lang.Object, java.lang.Object> {
        final /* synthetic */ long a;
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.r b;

        a(com.ss.android.downloadlib.addownload.compliance.r r1, long r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.a.e.InterfaceC0189a
        public java.lang.Object j(java.lang.Object r4) {
                r3 = this;
                com.ss.android.downloadlib.addownload.compliance.r r4 = r3.b
                java.util.Map r4 = com.ss.android.downloadlib.addownload.compliance.r.j(r4)
                long r0 = r3.a
                java.lang.Long r0 = java.lang.Long.valueOf(r0)
                java.lang.Object r4 = r4.remove(r0)
                java.lang.ref.SoftReference r4 = (java.lang.ref.SoftReference) r4
                if (r4 == 0) goto L31
                java.lang.Object r0 = r4.get()
                if (r0 == 0) goto L31
                java.lang.Object r4 = r4.get()
                com.ss.android.downloadlib.addownload.compliance.r$c r4 = (com.ss.android.downloadlib.addownload.compliance.r.c) r4
                com.ss.android.downloadlib.addownload.compliance.r r0 = r3.b
                long r1 = r3.a
                java.lang.Long r1 = java.lang.Long.valueOf(r1)
                java.lang.Object r0 = r0.get(r1)
                android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
                r4.j(r0)
            L31:
                r4 = 0
                return r4
        }
    }

    class b implements com.ss.android.downloadlib.a.e.InterfaceC0189a<java.lang.Object, java.lang.Object> {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ long b;
        final /* synthetic */ long c;
        final /* synthetic */ com.ss.android.downloadlib.addownload.compliance.r d;

        b(com.ss.android.downloadlib.addownload.compliance.r r1, java.lang.String r2, long r3, long r5) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r5
                r0.<init>()
                return
        }

        @Override // com.ss.android.downloadlib.a.e.InterfaceC0189a
        public java.lang.Object j(java.lang.Object r10) {
                r9 = this;
                r10 = 0
                r0 = 1
                r1 = 0
                java.lang.String r2 = r9.a     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La4
                com.ss.android.socialbase.downloader.g.g r2 = com.ss.android.socialbase.downloader.downloader.cw.j(r0, r10, r2, r1)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La4
                if (r2 != 0) goto L13
                java.io.Closeable[] r0 = new java.io.Closeable[r0]
                r0[r10] = r1
                com.ss.android.socialbase.downloader.az.m.j(r0)
                return r1
            L13:
                java.io.BufferedInputStream r3 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La4
                java.io.InputStream r2 = r2.j()     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La4
                r3.<init>(r2)     // Catch: java.lang.Throwable -> La0 java.lang.Exception -> La4
                int r2 = r3.available()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                r3.mark(r2)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                android.graphics.BitmapFactory$Options r2 = new android.graphics.BitmapFactory$Options     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                r2.<init>()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                r2.inJustDecodeBounds = r0     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                android.graphics.BitmapFactory.decodeStream(r3, r1, r2)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                int r4 = r2.outWidth     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                int r5 = r2.outHeight     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                android.content.Context r6 = com.ss.android.downloadlib.addownload.m.getContext()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                r7 = 1114636288(0x42700000, float:60.0)
                int r6 = com.ss.android.downloadlib.a.h.f(r6, r7)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                int r6 = com.ss.android.downloadlib.addownload.compliance.r.j(r6, r6, r2)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                r2.inSampleSize = r6     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                r2.inJustDecodeBounds = r10     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                r3.reset()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r3, r1, r2)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                r6.<init>()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                java.lang.String r7 = "ttdownloader_type"
                java.lang.String r8 = "load_bitmap"
                r6.putOpt(r7, r8)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
                java.lang.String r7 = "bm_original_w"
                java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
                r6.putOpt(r7, r4)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
                java.lang.String r4 = "bm_original_h"
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
                r6.putOpt(r4, r5)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
                java.lang.String r4 = "bm_bytes"
                if (r2 != 0) goto L6e
                r5 = -1
                goto L72
            L6e:
                int r5 = r2.getByteCount()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
            L72:
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
                r6.putOpt(r4, r5)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L7c
                goto L80
            L7a:
                r1 = move-exception
                goto Lb7
            L7c:
                r4 = move-exception
                com.bytedance.sdk.component.utils.vl.j(r4)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
            L80:
                com.ss.android.downloadlib.r.b r4 = com.ss.android.downloadlib.r.b.a()     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                java.lang.String r5 = "ttd_pref_monitor"
                long r7 = r9.b     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                r4.q(r5, r6, r7)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                com.ss.android.downloadlib.addownload.compliance.r r4 = r9.d     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                long r5 = r9.c     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                java.lang.Long r5 = java.lang.Long.valueOf(r5)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                r4.put(r5, r2)     // Catch: java.lang.Throwable -> L7a java.lang.Exception -> L9e
                java.io.Closeable[] r0 = new java.io.Closeable[r0]
                r0[r10] = r3
                com.ss.android.socialbase.downloader.az.m.j(r0)
                goto Lb6
            L9e:
                r2 = move-exception
                goto La6
            La0:
                r2 = move-exception
                r3 = r1
                r1 = r2
                goto Lb7
            La4:
                r2 = move-exception
                r3 = r1
            La6:
                com.ss.android.downloadlib.up.a r4 = com.ss.android.downloadlib.up.a.a()     // Catch: java.lang.Throwable -> L7a
                java.lang.String r5 = "BitmapCache loadBitmap"
                r4.j(r2, r5)     // Catch: java.lang.Throwable -> L7a
                java.io.Closeable[] r0 = new java.io.Closeable[r0]
                r0[r10] = r3
                com.ss.android.socialbase.downloader.az.m.j(r0)
            Lb6:
                return r1
            Lb7:
                java.io.Closeable[] r0 = new java.io.Closeable[r0]
                r0[r10] = r3
                com.ss.android.socialbase.downloader.az.m.j(r0)
                throw r1
        }
    }

    public interface c {
        void j(android.graphics.Bitmap r1);
    }

    private static class d {
        private static com.ss.android.downloadlib.addownload.compliance.r a;

        static {
                com.ss.android.downloadlib.addownload.compliance.r r0 = new com.ss.android.downloadlib.addownload.compliance.r
                r1 = 0
                r0.<init>(r1)
                com.ss.android.downloadlib.addownload.compliance.r.d.a = r0
                return
        }

        public d() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.ss.android.downloadlib.addownload.compliance.r a() {
                com.ss.android.downloadlib.addownload.compliance.r r0 = com.ss.android.downloadlib.addownload.compliance.r.d.a
                return r0
        }
    }

    private r() {
            r1 = this;
            r0 = 8
            r1.<init>(r0, r0)
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1.j = r0
            return
    }

    /* synthetic */ r(com.ss.android.downloadlib.addownload.compliance.r.a r1) {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ int j(int r0, int r1, android.graphics.BitmapFactory.Options r2) {
            int r0 = xt(r0, r1, r2)
            return r0
    }

    public static com.ss.android.downloadlib.addownload.compliance.r j() {
            com.ss.android.downloadlib.addownload.compliance.r r0 = com.ss.android.downloadlib.addownload.compliance.r.d.a()
            return r0
    }

    static /* synthetic */ java.util.Map j(com.ss.android.downloadlib.addownload.compliance.r r0) {
            java.util.Map<java.lang.Long, java.lang.ref.SoftReference<com.ss.android.downloadlib.addownload.compliance.r$c>> r0 = r0.j
            return r0
    }

    private static int xt(int r2, int r3, android.graphics.BitmapFactory.Options r4) {
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

    public void j(long r8, long r10, java.lang.String r12) {
            r7 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            java.lang.Object r0 = r7.get(r0)
            if (r0 == 0) goto L32
            java.util.Map<java.lang.Long, java.lang.ref.SoftReference<com.ss.android.downloadlib.addownload.compliance.r$c>> r10 = r7.j
            java.lang.Long r11 = java.lang.Long.valueOf(r8)
            java.lang.Object r10 = r10.remove(r11)
            java.lang.ref.SoftReference r10 = (java.lang.ref.SoftReference) r10
            if (r10 == 0) goto L31
            java.lang.Object r11 = r10.get()
            if (r11 == 0) goto L31
            java.lang.Object r10 = r10.get()
            com.ss.android.downloadlib.addownload.compliance.r$c r10 = (com.ss.android.downloadlib.addownload.compliance.r.c) r10
            java.lang.Long r8 = java.lang.Long.valueOf(r8)
            java.lang.Object r8 = r7.get(r8)
            android.graphics.Bitmap r8 = (android.graphics.Bitmap) r8
            r10.j(r8)
        L31:
            return
        L32:
            boolean r0 = android.text.TextUtils.isEmpty(r12)
            if (r0 == 0) goto L3e
            r8 = 12
            com.ss.android.downloadlib.addownload.compliance.a.a(r8, r10)
            return
        L3e:
            com.ss.android.downloadlib.addownload.compliance.r$b r0 = new com.ss.android.downloadlib.addownload.compliance.r$b
            r1 = r7
            r5 = r8
            r3 = r10
            r2 = r12
            r0.<init>(r1, r2, r3, r5)
            r8 = 0
            com.ss.android.downloadlib.a$e r8 = com.ss.android.downloadlib.a.e.c(r0, r8)
            com.ss.android.downloadlib.addownload.compliance.r$a r9 = new com.ss.android.downloadlib.addownload.compliance.r$a
            r9.<init>(r7, r5)
            com.ss.android.downloadlib.a$e r8 = r8.b(r9)
            r8.d()
            return
    }

    public void j(long r2, @androidx.annotation.NonNull com.ss.android.downloadlib.addownload.compliance.r.c r4) {
            r1 = this;
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            java.lang.Object r0 = r1.get(r0)
            if (r0 == 0) goto L18
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.Object r2 = r1.get(r2)
            android.graphics.Bitmap r2 = (android.graphics.Bitmap) r2
            r4.j(r2)
            return
        L18:
            java.util.Map<java.lang.Long, java.lang.ref.SoftReference<com.ss.android.downloadlib.addownload.compliance.r$c>> r0 = r1.j
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            java.lang.ref.SoftReference r3 = new java.lang.ref.SoftReference
            r3.<init>(r4)
            r0.put(r2, r3)
            return
    }
}

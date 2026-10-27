package com.bxkj.base.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class f {
    private static com.bxkj.base.util.f b;
    private final okhttp3.OkHttpClient a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class a implements okhttp3.Callback {
        final /* synthetic */ com.bxkj.base.util.f.c a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ com.bxkj.base.util.f d;

        a(com.bxkj.base.util.f r1, com.bxkj.base.util.f.c r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void onFailure(okhttp3.Call r2, java.io.IOException r3) {
                r1 = this;
                com.bxkj.base.util.f$c r2 = r1.a
                r0 = 4
                r2.sendEmptyMessage(r0)
                r3.getClass()
                return
        }

        public void onResponse(okhttp3.Call r11, okhttp3.Response r12) throws java.io.IOException {
                r10 = this;
                r11 = 2048(0x800, float:2.87E-42)
                byte[] r11 = new byte[r11]
                com.bxkj.base.util.f r0 = r10.d
                java.lang.String r1 = r10.b
                java.lang.String r0 = com.bxkj.base.util.f.b(r0, r1)
                r1 = 0
                okhttp3.ResponseBody r2 = r12.body()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
                java.io.InputStream r2 = r2.byteStream()     // Catch: java.lang.Throwable -> L92 java.lang.Exception -> L95
                okhttp3.ResponseBody r12 = r12.body()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
                long r3 = r12.contentLength()     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
                java.io.File r12 = new java.io.File     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
                com.bxkj.base.util.f r5 = r10.d     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
                java.lang.String r6 = r10.c     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
                java.lang.String r5 = com.bxkj.base.util.f.a(r5, r6)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
                r12.<init>(r0, r5)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
                r0.<init>(r12)     // Catch: java.lang.Throwable -> L8d java.lang.Exception -> L90
                r5 = 0
            L31:
                int r1 = r2.read(r11)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                r7 = -1
                if (r1 == r7) goto L74
                r7 = 0
                r0.write(r11, r7, r1)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                long r7 = (long) r1     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                long r5 = r5 + r7
                float r1 = (float) r5     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                r7 = 1065353216(0x3f800000, float:1.0)
                float r1 = r1 * r7
                float r7 = (float) r3     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                float r1 = r1 / r7
                r7 = 1120403456(0x42c80000, float:100.0)
                float r1 = r1 * r7
                int r1 = (int) r1     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                android.os.Message r7 = new android.os.Message     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                r7.<init>()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                r8.<init>()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                java.lang.String r9 = "total"
                r8.putLong(r9, r3)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                java.lang.String r9 = "sum"
                r8.putLong(r9, r5)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                java.lang.String r9 = "progress"
                r8.putInt(r9, r1)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                r7.setData(r8)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                r1 = 2
                r7.what = r1     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                com.bxkj.base.util.f$c r1 = r10.a     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                r1.sendMessage(r7)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                goto L31
            L6f:
                r11 = move-exception
            L70:
                r1 = r2
                goto La8
            L72:
                r1 = r2
                goto L96
            L74:
                r0.flush()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                android.os.Message r11 = new android.os.Message     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                r11.<init>()     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                r11.obj = r12     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                r12 = 3
                r11.what = r12     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                com.bxkj.base.util.f$c r12 = r10.a     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                r12.sendMessage(r11)     // Catch: java.lang.Throwable -> L6f java.lang.Exception -> L72
                r2.close()     // Catch: java.io.IOException -> L89
            L89:
                r0.close()     // Catch: java.io.IOException -> La6
                goto La6
            L8d:
                r11 = move-exception
                r0 = r1
                goto L70
            L90:
                r0 = r1
                goto L72
            L92:
                r11 = move-exception
                r0 = r1
                goto La8
            L95:
                r0 = r1
            L96:
                com.bxkj.base.util.f$c r11 = r10.a     // Catch: java.lang.Throwable -> La7
                r12 = 4
                r11.sendEmptyMessage(r12)     // Catch: java.lang.Throwable -> La7
                if (r1 == 0) goto La3
                r1.close()     // Catch: java.io.IOException -> La2
                goto La3
            La2:
            La3:
                if (r0 == 0) goto La6
                goto L89
            La6:
                return
            La7:
                r11 = move-exception
            La8:
                if (r1 == 0) goto Laf
                r1.close()     // Catch: java.io.IOException -> Lae
                goto Laf
            Lae:
            Laf:
                if (r0 == 0) goto Lb4
                r0.close()     // Catch: java.io.IOException -> Lb4
            Lb4:
                throw r11
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static abstract class b {
        public b() {
                r0 = this;
                r0.<init>()
                return
        }

        public void a() {
                r0 = this;
                return
        }

        public abstract void b(java.io.File r1);

        public void c(long r1, long r3, int r5) {
                r0 = this;
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private class c extends android.os.Handler {
        private com.bxkj.base.util.f.b a;
        final /* synthetic */ com.bxkj.base.util.f b;

        public c(com.bxkj.base.util.f r1, com.bxkj.base.util.f.b r2) {
                r0 = this;
                r0.b = r1
                r0.<init>()
                r0.a = r2
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r9) {
                r8 = this;
                super.handleMessage(r9)
                int r0 = r9.what
                r1 = 2
                if (r0 == r1) goto L23
                r1 = 3
                if (r0 == r1) goto L17
                r9 = 4
                if (r0 == r9) goto Lf
                goto L48
            Lf:
                com.bxkj.base.util.f$b r9 = r8.a
                if (r9 == 0) goto L48
                r9.a()
                return
            L17:
                com.bxkj.base.util.f$b r0 = r8.a
                if (r0 == 0) goto L48
                java.lang.Object r9 = r9.obj
                java.io.File r9 = (java.io.File) r9
                r0.b(r9)
                return
            L23:
                android.os.Bundle r0 = r9.getData()
                java.lang.String r1 = "total"
                long r3 = r0.getLong(r1)
                android.os.Bundle r0 = r9.getData()
                java.lang.String r1 = "sum"
                long r5 = r0.getLong(r1)
                android.os.Bundle r9 = r9.getData()
                java.lang.String r0 = "progress"
                int r7 = r9.getInt(r0)
                com.bxkj.base.util.f$b r2 = r8.a
                if (r2 == 0) goto L48
                r2.c(r3, r5, r7)
            L48:
                return
        }
    }

    private f() {
            r1 = this;
            r1.<init>()
            okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
            r0.<init>()
            r1.a = r0
            return
    }

    static /* bridge */ /* synthetic */ java.lang.String a(com.bxkj.base.util.f r0, java.lang.String r1) {
            java.lang.String r0 = r0.e(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String b(com.bxkj.base.util.f r0, java.lang.String r1) {
            java.lang.String r0 = r0.f(r1)
            return r0
    }

    public static com.bxkj.base.util.f d() {
            com.bxkj.base.util.f r0 = com.bxkj.base.util.f.b
            if (r0 != 0) goto Lb
            com.bxkj.base.util.f r0 = new com.bxkj.base.util.f
            r0.<init>()
            com.bxkj.base.util.f.b = r0
        Lb:
            com.bxkj.base.util.f r0 = com.bxkj.base.util.f.b
            return r0
    }

    @androidx.annotation.NonNull
    private java.lang.String e(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "/"
            int r0 = r2.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
            return r2
    }

    private java.lang.String f(java.lang.String r3) throws java.io.IOException {
            r2 = this;
            java.io.File r0 = new java.io.File
            java.io.File r1 = android.os.Environment.getExternalStorageDirectory()
            r0.<init>(r1, r3)
            boolean r3 = r0.mkdirs()
            if (r3 != 0) goto L12
            r0.createNewFile()
        L12:
            java.lang.String r3 = r0.getAbsolutePath()
            return r3
    }

    public void c(java.lang.String r3, java.lang.String r4, com.bxkj.base.util.f.b r5) {
            r2 = this;
            boolean r0 = cn.bluemobi.dylan.base.utils.u.b0(r3)
            if (r0 == 0) goto L7
            return
        L7:
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            okhttp3.Request$Builder r0 = r0.url(r3)
            okhttp3.Request r0 = r0.build()
            com.bxkj.base.util.f$c r1 = new com.bxkj.base.util.f$c
            r1.<init>(r2, r5)
            okhttp3.OkHttpClient r5 = r2.a
            okhttp3.Call r5 = r5.newCall(r0)
            com.bxkj.base.util.f$a r0 = new com.bxkj.base.util.f$a
            r0.<init>(r2, r1, r4, r3)
            r5.enqueue(r0)
            return
    }
}

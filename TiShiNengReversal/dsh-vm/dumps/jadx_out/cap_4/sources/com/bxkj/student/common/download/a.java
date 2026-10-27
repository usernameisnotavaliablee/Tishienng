package com.bxkj.student.common.download;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private static com.bxkj.student.common.download.a d;
    private final okhttp3.OkHttpClient a;
    private com.bxkj.student.common.download.a.d b;
    android.os.Handler c;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.student.common.download.a$a, reason: collision with other inner class name */
    class HandlerC0067a extends android.os.Handler {
        final /* synthetic */ com.bxkj.student.common.download.a a;

        HandlerC0067a(com.bxkj.student.common.download.a r1) {
                r0 = this;
                r0.a = r1
                r0.<init>()
                return
        }

        @Override // android.os.Handler
        public void handleMessage(android.os.Message r9) {
                r8 = this;
                super.handleMessage(r9)
                int r0 = r9.what
                r1 = 2
                if (r0 == r1) goto L37
                r1 = 3
                if (r0 == r1) goto L21
                r9 = 4
                if (r0 == r9) goto Lf
                goto L66
            Lf:
                com.bxkj.student.common.download.a r9 = r8.a
                com.bxkj.student.common.download.a$d r9 = com.bxkj.student.common.download.a.a(r9)
                if (r9 == 0) goto L66
                com.bxkj.student.common.download.a r9 = r8.a
                com.bxkj.student.common.download.a$d r9 = com.bxkj.student.common.download.a.a(r9)
                r9.onDownloadFailed()
                return
            L21:
                com.bxkj.student.common.download.a r0 = r8.a
                com.bxkj.student.common.download.a$d r0 = com.bxkj.student.common.download.a.a(r0)
                if (r0 == 0) goto L66
                java.lang.Object r9 = r9.obj
                java.io.File r9 = (java.io.File) r9
                com.bxkj.student.common.download.a r0 = r8.a
                com.bxkj.student.common.download.a$d r0 = com.bxkj.student.common.download.a.a(r0)
                r0.a(r9)
                return
            L37:
                android.os.Bundle r0 = r9.getData()
                java.lang.String r1 = "total"
                long r3 = r0.getLong(r1)
                android.os.Bundle r0 = r9.getData()
                java.lang.String r1 = "sum"
                long r5 = r0.getLong(r1)
                android.os.Bundle r9 = r9.getData()
                java.lang.String r0 = "progress"
                int r7 = r9.getInt(r0)
                com.bxkj.student.common.download.a r9 = r8.a
                com.bxkj.student.common.download.a$d r9 = com.bxkj.student.common.download.a.a(r9)
                if (r9 == 0) goto L66
                com.bxkj.student.common.download.a r9 = r8.a
                com.bxkj.student.common.download.a$d r2 = com.bxkj.student.common.download.a.a(r9)
                r2.b(r3, r5, r7)
            L66:
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class b implements okhttp3.Callback {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.common.download.a b;

        b(com.bxkj.student.common.download.a r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void onFailure(okhttp3.Call r2, java.io.IOException r3) {
                r1 = this;
                com.bxkj.student.common.download.a r2 = r1.b
                android.os.Handler r2 = r2.c
                r0 = 4
                r2.sendEmptyMessage(r0)
                r3.getClass()
                return
        }

        public void onResponse(okhttp3.Call r11, okhttp3.Response r12) throws java.io.IOException {
                r10 = this;
                r11 = 2048(0x800, float:2.87E-42)
                byte[] r11 = new byte[r11]
                com.bxkj.student.common.download.a r0 = r10.b
                java.lang.String r0 = com.bxkj.student.common.download.a.c(r0)
                r1 = 0
                okhttp3.ResponseBody r2 = r12.body()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
                java.io.InputStream r2 = r2.byteStream()     // Catch: java.lang.Throwable -> La8 java.lang.Exception -> Lab
                okhttp3.ResponseBody r12 = r12.body()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                long r3 = r12.contentLength()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                r12.<init>()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                java.lang.String r5 = "total="
                r12.append(r5)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                r12.append(r3)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                com.orhanobut.logger.j.c(r12)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                java.io.File r12 = new java.io.File     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                com.bxkj.student.common.download.a r5 = r10.b     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                java.lang.String r6 = r10.a     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                java.lang.String r5 = com.bxkj.student.common.download.a.b(r5, r6)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                r12.<init>(r0, r5)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                r0.<init>(r12)     // Catch: java.lang.Throwable -> La3 java.lang.Exception -> La6
                r5 = 0
            L43:
                int r1 = r2.read(r11)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                r7 = -1
                if (r1 == r7) goto L88
                r7 = 0
                r0.write(r11, r7, r1)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                long r7 = (long) r1     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                long r5 = r5 + r7
                float r1 = (float) r5     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                r7 = 1065353216(0x3f800000, float:1.0)
                float r1 = r1 * r7
                float r7 = (float) r3     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                float r1 = r1 / r7
                r7 = 1120403456(0x42c80000, float:100.0)
                float r1 = r1 * r7
                int r1 = (int) r1     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                android.os.Message r7 = new android.os.Message     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                r7.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                r8.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                java.lang.String r9 = "total"
                r8.putLong(r9, r3)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                java.lang.String r9 = "sum"
                r8.putLong(r9, r5)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                java.lang.String r9 = "progress"
                r8.putInt(r9, r1)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                r7.setData(r8)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                r1 = 2
                r7.what = r1     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                com.bxkj.student.common.download.a r1 = r10.b     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                android.os.Handler r1 = r1.c     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                r1.sendMessage(r7)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                goto L43
            L83:
                r11 = move-exception
            L84:
                r1 = r2
                goto Lc0
            L86:
                r1 = r2
                goto Lac
            L88:
                r0.flush()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                android.os.Message r11 = new android.os.Message     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                r11.<init>()     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                r11.obj = r12     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                r12 = 3
                r11.what = r12     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                com.bxkj.student.common.download.a r12 = r10.b     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                android.os.Handler r12 = r12.c     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                r12.sendMessage(r11)     // Catch: java.lang.Throwable -> L83 java.lang.Exception -> L86
                r2.close()     // Catch: java.io.IOException -> L9f
            L9f:
                r0.close()     // Catch: java.io.IOException -> Lbe
                goto Lbe
            La3:
                r11 = move-exception
                r0 = r1
                goto L84
            La6:
                r0 = r1
                goto L86
            La8:
                r11 = move-exception
                r0 = r1
                goto Lc0
            Lab:
                r0 = r1
            Lac:
                com.bxkj.student.common.download.a r11 = r10.b     // Catch: java.lang.Throwable -> Lbf
                android.os.Handler r11 = r11.c     // Catch: java.lang.Throwable -> Lbf
                r12 = 4
                r11.sendEmptyMessage(r12)     // Catch: java.lang.Throwable -> Lbf
                if (r1 == 0) goto Lbb
                r1.close()     // Catch: java.io.IOException -> Lba
                goto Lbb
            Lba:
            Lbb:
                if (r0 == 0) goto Lbe
                goto L9f
            Lbe:
                return
            Lbf:
                r11 = move-exception
            Lc0:
                if (r1 == 0) goto Lc7
                r1.close()     // Catch: java.io.IOException -> Lc6
                goto Lc7
            Lc6:
            Lc7:
                if (r0 == 0) goto Lcc
                r0.close()     // Catch: java.io.IOException -> Lcc
            Lcc:
                throw r11
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    class c implements okhttp3.Callback {
        final /* synthetic */ java.lang.String a;
        final /* synthetic */ com.bxkj.student.common.download.a b;

        c(com.bxkj.student.common.download.a r1, java.lang.String r2) {
                r0 = this;
                r0.b = r1
                r0.a = r2
                r0.<init>()
                return
        }

        public void onFailure(okhttp3.Call r2, java.io.IOException r3) {
                r1 = this;
                com.bxkj.student.common.download.a r2 = r1.b
                android.os.Handler r2 = r2.c
                r0 = 4
                r2.sendEmptyMessage(r0)
                r3.getClass()
                return
        }

        public void onResponse(okhttp3.Call r11, okhttp3.Response r12) throws java.io.IOException {
                r10 = this;
                r11 = 2048(0x800, float:2.87E-42)
                byte[] r11 = new byte[r11]
                com.bxkj.student.common.download.a r0 = r10.b
                java.lang.String r0 = com.bxkj.student.common.download.a.c(r0)
                r1 = 0
                okhttp3.ResponseBody r2 = r12.body()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La5
                java.io.InputStream r2 = r2.byteStream()     // Catch: java.lang.Throwable -> La2 java.lang.Exception -> La5
                okhttp3.ResponseBody r12 = r12.body()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
                long r3 = r12.contentLength()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
                java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
                r12.<init>()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
                java.lang.String r5 = "total="
                r12.append(r5)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
                r12.append(r3)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
                java.lang.String r12 = r12.toString()     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
                com.orhanobut.logger.j.c(r12)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
                java.io.File r12 = new java.io.File     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
                java.lang.String r5 = r10.a     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
                r12.<init>(r0, r5)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
                java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
                r0.<init>(r12)     // Catch: java.lang.Throwable -> L9d java.lang.Exception -> La0
                r5 = 0
            L3d:
                int r1 = r2.read(r11)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                r7 = -1
                if (r1 == r7) goto L82
                r7 = 0
                r0.write(r11, r7, r1)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                long r7 = (long) r1     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                long r5 = r5 + r7
                float r1 = (float) r5     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                r7 = 1065353216(0x3f800000, float:1.0)
                float r1 = r1 * r7
                float r7 = (float) r3     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                float r1 = r1 / r7
                r7 = 1120403456(0x42c80000, float:100.0)
                float r1 = r1 * r7
                int r1 = (int) r1     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                android.os.Message r7 = new android.os.Message     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                r7.<init>()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                android.os.Bundle r8 = new android.os.Bundle     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                r8.<init>()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                java.lang.String r9 = "total"
                r8.putLong(r9, r3)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                java.lang.String r9 = "sum"
                r8.putLong(r9, r5)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                java.lang.String r9 = "progress"
                r8.putInt(r9, r1)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                r7.setData(r8)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                r1 = 2
                r7.what = r1     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                com.bxkj.student.common.download.a r1 = r10.b     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                android.os.Handler r1 = r1.c     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                r1.sendMessage(r7)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                goto L3d
            L7d:
                r11 = move-exception
            L7e:
                r1 = r2
                goto Lba
            L80:
                r1 = r2
                goto La6
            L82:
                r0.flush()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                android.os.Message r11 = new android.os.Message     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                r11.<init>()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                r11.obj = r12     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                r12 = 3
                r11.what = r12     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                com.bxkj.student.common.download.a r12 = r10.b     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                android.os.Handler r12 = r12.c     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                r12.sendMessage(r11)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L80
                r2.close()     // Catch: java.io.IOException -> L99
            L99:
                r0.close()     // Catch: java.io.IOException -> Lb8
                goto Lb8
            L9d:
                r11 = move-exception
                r0 = r1
                goto L7e
            La0:
                r0 = r1
                goto L80
            La2:
                r11 = move-exception
                r0 = r1
                goto Lba
            La5:
                r0 = r1
            La6:
                com.bxkj.student.common.download.a r11 = r10.b     // Catch: java.lang.Throwable -> Lb9
                android.os.Handler r11 = r11.c     // Catch: java.lang.Throwable -> Lb9
                r12 = 4
                r11.sendEmptyMessage(r12)     // Catch: java.lang.Throwable -> Lb9
                if (r1 == 0) goto Lb5
                r1.close()     // Catch: java.io.IOException -> Lb4
                goto Lb5
            Lb4:
            Lb5:
                if (r0 == 0) goto Lb8
                goto L99
            Lb8:
                return
            Lb9:
                r11 = move-exception
            Lba:
                if (r1 == 0) goto Lc1
                r1.close()     // Catch: java.io.IOException -> Lc0
                goto Lc1
            Lc0:
            Lc1:
                if (r0 == 0) goto Lc6
                r0.close()     // Catch: java.io.IOException -> Lc6
            Lc6:
                throw r11
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface d {
        void a(java.io.File r1);

        void b(long r1, long r3, int r5);

        void onDownloadFailed();
    }

    private a() {
            r1 = this;
            r1.<init>()
            com.bxkj.student.common.download.a$a r0 = new com.bxkj.student.common.download.a$a
            r0.<init>(r1)
            r1.c = r0
            okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
            r0.<init>()
            r1.a = r0
            return
    }

    static /* bridge */ /* synthetic */ com.bxkj.student.common.download.a.d a(com.bxkj.student.common.download.a r0) {
            com.bxkj.student.common.download.a$d r0 = r0.b
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String b(com.bxkj.student.common.download.a r0, java.lang.String r1) {
            java.lang.String r0 = r0.g(r1)
            return r0
    }

    static /* bridge */ /* synthetic */ java.lang.String c(com.bxkj.student.common.download.a r0) {
            java.lang.String r0 = r0.h()
            return r0
    }

    public static com.bxkj.student.common.download.a f() {
            com.bxkj.student.common.download.a r0 = com.bxkj.student.common.download.a.d
            if (r0 != 0) goto Lb
            com.bxkj.student.common.download.a r0 = new com.bxkj.student.common.download.a
            r0.<init>()
            com.bxkj.student.common.download.a.d = r0
        Lb:
            com.bxkj.student.common.download.a r0 = com.bxkj.student.common.download.a.d
            return r0
    }

    @androidx.annotation.NonNull
    private java.lang.String g(java.lang.String r2) {
            r1 = this;
            java.lang.String r0 = "/"
            int r0 = r2.lastIndexOf(r0)
            int r0 = r0 + 1
            java.lang.String r2 = r2.substring(r0)
            return r2
    }

    private java.lang.String h() throws java.io.IOException {
            r2 = this;
            android.content.ContextWrapper r0 = new android.content.ContextWrapper
            com.bxkj.base.BaseApp r1 = com.bxkj.base.BaseApp.c()
            r0.<init>(r1)
            java.lang.String r1 = android.os.Environment.DIRECTORY_DOWNLOADS
            java.io.File r0 = r0.getExternalFilesDir(r1)
            boolean r1 = r0.mkdirs()
            if (r1 != 0) goto L18
            r0.createNewFile()
        L18:
            java.lang.String r0 = r0.getAbsolutePath()
            return r0
    }

    public void d(java.lang.String r2, com.bxkj.student.common.download.a.d r3) {
            r1 = this;
            r1.b = r3
            okhttp3.Request$Builder r3 = new okhttp3.Request$Builder
            r3.<init>()
            okhttp3.Request$Builder r3 = r3.url(r2)
            okhttp3.CacheControl r0 = okhttp3.CacheControl.FORCE_NETWORK
            okhttp3.Request$Builder r3 = r3.cacheControl(r0)
            okhttp3.Request r3 = r3.build()
            okhttp3.OkHttpClient r0 = r1.a
            okhttp3.Call r3 = r0.newCall(r3)
            com.bxkj.student.common.download.a$b r0 = new com.bxkj.student.common.download.a$b
            r0.<init>(r1, r2)
            r3.enqueue(r0)
            return
    }

    public void e(java.lang.String r1, java.lang.String r2, com.bxkj.student.common.download.a.d r3) {
            r0 = this;
            r0.b = r3
            okhttp3.Request$Builder r3 = new okhttp3.Request$Builder
            r3.<init>()
            okhttp3.Request$Builder r1 = r3.url(r1)
            okhttp3.CacheControl r3 = okhttp3.CacheControl.FORCE_NETWORK
            okhttp3.Request$Builder r1 = r1.cacheControl(r3)
            okhttp3.Request r1 = r1.build()
            okhttp3.OkHttpClient r3 = r0.a
            okhttp3.Call r1 = r3.newCall(r1)
            com.bxkj.student.common.download.a$c r3 = new com.bxkj.student.common.download.a$c
            r3.<init>(r0, r2)
            r1.enqueue(r3)
            return
    }
}

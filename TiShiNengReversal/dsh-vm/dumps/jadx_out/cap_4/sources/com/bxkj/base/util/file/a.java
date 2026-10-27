package com.bxkj.base.util.file;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_4_sz9502280.dex */
public class a {
    private static com.bxkj.base.util.file.a b;
    private final okhttp3.OkHttpClient a;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.bxkj.base.util.file.a$a, reason: collision with other inner class name */
    class C0054a implements okhttp3.Callback {
        final /* synthetic */ com.bxkj.base.util.file.a.b a;
        final /* synthetic */ java.lang.String b;
        final /* synthetic */ java.lang.String c;
        final /* synthetic */ com.bxkj.base.util.file.a d;

        C0054a(com.bxkj.base.util.file.a r1, com.bxkj.base.util.file.a.b r2, java.lang.String r3, java.lang.String r4) {
                r0 = this;
                r0.d = r1
                r0.a = r2
                r0.b = r3
                r0.c = r4
                r0.<init>()
                return
        }

        public void onFailure(okhttp3.Call r1, java.io.IOException r2) {
                r0 = this;
                com.bxkj.base.util.file.a$b r1 = r0.a
                r1.b(r2)
                return
        }

        public void onResponse(okhttp3.Call r10, okhttp3.Response r11) throws java.io.IOException {
                r9 = this;
                r10 = 2048(0x800, float:2.87E-42)
                byte[] r10 = new byte[r10]
                java.io.File r0 = new java.io.File
                java.lang.String r1 = r9.b
                r0.<init>(r1)
                boolean r1 = r0.exists()
                if (r1 != 0) goto L14
                r0.mkdirs()
            L14:
                java.io.File r1 = new java.io.File
                java.lang.String r2 = r9.c
                r1.<init>(r0, r2)
                r0 = 0
                okhttp3.ResponseBody r2 = r11.body()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
                java.io.InputStream r2 = r2.byteStream()     // Catch: java.lang.Throwable -> L6d java.lang.Exception -> L70
                okhttp3.ResponseBody r11 = r11.body()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6a
                long r3 = r11.contentLength()     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6a
                java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6a
                r11.<init>(r1)     // Catch: java.lang.Throwable -> L67 java.lang.Exception -> L6a
                r5 = 0
            L33:
                int r0 = r2.read(r10)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
                r7 = -1
                if (r0 == r7) goto L58
                r7 = 0
                r11.write(r10, r7, r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
                long r7 = (long) r0     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
                long r5 = r5 + r7
                float r0 = (float) r5     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
                r7 = 1065353216(0x3f800000, float:1.0)
                float r0 = r0 * r7
                float r7 = (float) r3     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
                float r0 = r0 / r7
                r7 = 1120403456(0x42c80000, float:100.0)
                float r0 = r0 * r7
                int r0 = (int) r0     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
                com.bxkj.base.util.file.a$b r7 = r9.a     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
                r7.c(r0)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
                goto L33
            L52:
                r10 = move-exception
            L53:
                r0 = r2
                goto L83
            L55:
                r10 = move-exception
            L56:
                r0 = r2
                goto L72
            L58:
                r11.flush()     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
                com.bxkj.base.util.file.a$b r10 = r9.a     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
                r10.a(r1)     // Catch: java.lang.Throwable -> L52 java.lang.Exception -> L55
                r2.close()     // Catch: java.io.IOException -> L81
                r11.close()     // Catch: java.io.IOException -> L81
                return
            L67:
                r10 = move-exception
                r11 = r0
                goto L53
            L6a:
                r10 = move-exception
                r11 = r0
                goto L56
            L6d:
                r10 = move-exception
                r11 = r0
                goto L83
            L70:
                r10 = move-exception
                r11 = r0
            L72:
                com.bxkj.base.util.file.a$b r1 = r9.a     // Catch: java.lang.Throwable -> L82
                r1.b(r10)     // Catch: java.lang.Throwable -> L82
                if (r0 == 0) goto L7c
                r0.close()     // Catch: java.io.IOException -> L81
            L7c:
                if (r11 == 0) goto L81
                r11.close()     // Catch: java.io.IOException -> L81
            L81:
                return
            L82:
                r10 = move-exception
            L83:
                if (r0 == 0) goto L88
                r0.close()     // Catch: java.io.IOException -> L8d
            L88:
                if (r11 == 0) goto L8d
                r11.close()     // Catch: java.io.IOException -> L8d
            L8d:
                throw r10
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface b {
        void a(java.io.File r1);

        void b(java.lang.Exception r1);

        void c(int r1);
    }

    public a() {
            r1 = this;
            r1.<init>()
            okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
            r0.<init>()
            r1.a = r0
            return
    }

    public static com.bxkj.base.util.file.a b() {
            com.bxkj.base.util.file.a r0 = com.bxkj.base.util.file.a.b
            if (r0 != 0) goto Lb
            com.bxkj.base.util.file.a r0 = new com.bxkj.base.util.file.a
            r0.<init>()
            com.bxkj.base.util.file.a.b = r0
        Lb:
            com.bxkj.base.util.file.a r0 = com.bxkj.base.util.file.a.b
            return r0
    }

    public void a(java.lang.String r2, java.lang.String r3, java.lang.String r4, com.bxkj.base.util.file.a.b r5) {
            r1 = this;
            okhttp3.Request$Builder r0 = new okhttp3.Request$Builder
            r0.<init>()
            okhttp3.Request$Builder r2 = r0.url(r2)
            okhttp3.Request r2 = r2.build()
            okhttp3.OkHttpClient r0 = new okhttp3.OkHttpClient
            r0.<init>()
            okhttp3.Call r0 = r0.newCall(r2)     // Catch: java.io.IOException -> L19
            r0.execute()     // Catch: java.io.IOException -> L19
        L19:
            okhttp3.OkHttpClient r0 = r1.a
            okhttp3.Call r2 = r0.newCall(r2)
            com.bxkj.base.util.file.a$a r0 = new com.bxkj.base.util.file.a$a
            r0.<init>(r1, r5, r3, r4)
            r2.enqueue(r0)
            return
    }
}

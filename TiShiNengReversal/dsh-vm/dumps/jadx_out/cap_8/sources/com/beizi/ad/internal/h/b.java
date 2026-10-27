package com.beizi.ad.internal.h;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public interface a {
        @androidx.annotation.UiThread
        void a();

        @androidx.annotation.UiThread
        void a(com.beizi.ad.internal.h.b.InterfaceC0107b r1);

        @androidx.annotation.UiThread
        void a(com.beizi.ad.internal.h.b.d r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.h.b$b, reason: collision with other inner class name */
    public interface InterfaceC0107b {
        @androidx.annotation.UiThread
        void a(int r1);

        @androidx.annotation.UiThread
        void a(long r1, long r3);

        @androidx.annotation.WorkerThread
        boolean a(java.io.File r1);

        @androidx.annotation.UiThread
        void b(java.io.File r1);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class c implements com.beizi.ad.internal.h.b.a, java.lang.Runnable {

        @androidx.annotation.Nullable
        private android.os.HandlerThread a;

        /* renamed from: b, reason: collision with root package name */
        @androidx.annotation.Nullable
        private com.beizi.ad.internal.h.b.InterfaceC0107b f6849b;

        /* renamed from: c, reason: collision with root package name */
        @androidx.annotation.Nullable
        private android.os.Handler f6850c;

        /* renamed from: d, reason: collision with root package name */
        private android.os.Handler f6851d;

        /* renamed from: e, reason: collision with root package name */
        private com.beizi.ad.internal.h.b.d f6852e;




        public c() {
                r2 = this;
                r2.<init>()
                android.os.Handler r0 = new android.os.Handler
                android.os.Looper r1 = android.os.Looper.getMainLooper()
                r0.<init>(r1)
                r2.f6851d = r0
                android.os.HandlerThread r0 = new android.os.HandlerThread
                java.lang.String r1 = "download"
                r0.<init>(r1)
                r2.a = r0
                r0.start()
                android.os.Handler r0 = new android.os.Handler
                android.os.HandlerThread r1 = r2.a
                android.os.Looper r1 = r1.getLooper()
                r0.<init>(r1)
                r2.f6850c = r0
                return
        }

        static /* synthetic */ com.beizi.ad.internal.h.b.InterfaceC0107b a(com.beizi.ad.internal.h.b.c r0) {
                com.beizi.ad.internal.h.b$b r0 = r0.f6849b
                return r0
        }

        private void a(int r3) {
                r2 = this;
                android.os.Handler r0 = r2.f6851d
                com.beizi.ad.internal.h.b$c$3 r1 = new com.beizi.ad.internal.h.b$c$3
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }

        private void a(long r8, long r10) {
                r7 = this;
                android.os.Handler r0 = r7.f6851d
                com.beizi.ad.internal.h.b$c$1 r1 = new com.beizi.ad.internal.h.b$c$1
                r2 = r7
                r3 = r8
                r5 = r10
                r1.<init>(r2, r3, r5)
                r0.post(r1)
                return
        }

        private boolean a(java.io.File r2) {
                r1 = this;
                com.beizi.ad.internal.h.b$b r0 = r1.f6849b
                if (r0 == 0) goto Lc
                boolean r2 = r0.a(r2)
                if (r2 == 0) goto Lc
                r2 = 1
                return r2
            Lc:
                r2 = 0
                return r2
        }

        private void b(java.io.File r3) {
                r2 = this;
                android.os.Handler r0 = r2.f6851d
                com.beizi.ad.internal.h.b$c$2 r1 = new com.beizi.ad.internal.h.b$c$2
                r1.<init>(r2, r3)
                r0.post(r1)
                return
        }

        @Override // com.beizi.ad.internal.h.b.a
        public void a() {
                r1 = this;
                android.os.HandlerThread r0 = r1.a
                if (r0 == 0) goto L7
                r0.quit()
            L7:
                r0 = 0
                r1.f6850c = r0
                r1.a = r0
                return
        }

        @Override // com.beizi.ad.internal.h.b.a
        public void a(com.beizi.ad.internal.h.b.InterfaceC0107b r1) {
                r0 = this;
                r0.f6849b = r1
                return
        }

        @Override // com.beizi.ad.internal.h.b.a
        public void a(com.beizi.ad.internal.h.b.d r3) {
                r2 = this;
                boolean r0 = r3.a
                if (r0 != 0) goto L20
                com.beizi.ad.internal.h.b$d r0 = r2.f6852e
                if (r0 == 0) goto L13
                boolean r0 = r3.equals(r0)
                if (r0 != 0) goto L13
                com.beizi.ad.internal.h.b$d r0 = r2.f6852e
                r1 = 1
                r0.f6857b = r1
            L13:
                r2.f6852e = r3
                r3.a()
                android.os.Handler r3 = r2.f6850c
                if (r3 == 0) goto L1f
                r3.post(r2)
            L1f:
                return
            L20:
                java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "Invalid request,it's downloading"
                r3.<init>(r0)
                throw r3
        }

        @Override // java.lang.Runnable
        @androidx.annotation.WorkerThread
        public void run() {
                r14 = this;
                com.beizi.ad.internal.h.b$d r0 = r14.f6852e
                r1 = 1
                r0.a = r1
                java.io.File r2 = new java.io.File
                java.lang.String r3 = com.beizi.ad.internal.h.b.d.a(r0)
                r2.<init>(r3)
                boolean r3 = r2.exists()
                if (r3 != 0) goto L1f
                boolean r2 = r2.mkdirs()
                if (r2 != 0) goto L1f
                r0 = 3
                r14.a(r0)
                return
            L1f:
                java.lang.StringBuilder r2 = new java.lang.StringBuilder
                r2.<init>()
                java.lang.String r3 = com.beizi.ad.internal.h.b.d.a(r0)
                r2.append(r3)
                java.lang.String r3 = java.io.File.separator
                r2.append(r3)
                java.lang.String r3 = com.beizi.ad.internal.h.b.d.b(r0)
                r2.append(r3)
                java.lang.String r2 = r2.toString()
                java.io.File r3 = new java.io.File
                r3.<init>(r2)
                r4 = 0
                r5 = 0
                java.net.URL r6 = new java.net.URL     // Catch: java.lang.Throwable -> L170 java.io.IOException -> L174
                java.lang.String r7 = com.beizi.ad.internal.h.b.d.c(r0)     // Catch: java.lang.Throwable -> L170 java.io.IOException -> L174
                r6.<init>(r7)     // Catch: java.lang.Throwable -> L170 java.io.IOException -> L174
                java.net.URLConnection r6 = r6.openConnection()     // Catch: java.lang.Throwable -> L170 java.io.IOException -> L174
                java.net.HttpURLConnection r6 = (java.net.HttpURLConnection) r6     // Catch: java.lang.Throwable -> L170 java.io.IOException -> L174
                long r7 = com.beizi.ad.internal.h.b.d.d(r0)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                r9 = 0
                int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
                if (r11 == 0) goto L82
                java.lang.String r7 = "Range"
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                r8.<init>()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                java.lang.String r11 = "bytes="
                r8.append(r11)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                long r11 = com.beizi.ad.internal.h.b.d.d(r0)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                r8.append(r11)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                java.lang.String r11 = "-"
                r8.append(r11)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                r6.setRequestProperty(r7, r8)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                goto L82
            L7b:
                r0 = move-exception
                r7 = r4
                goto L199
            L7f:
                r7 = r4
                goto L176
            L82:
                java.lang.String r7 = "Connection"
                java.lang.String r8 = "Keep-Alive"
                r6.setRequestProperty(r7, r8)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                int r7 = r6.getResponseCode()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                r8 = 200(0xc8, float:2.8E-43)
                if (r7 == r8) goto L9e
                r11 = 206(0xce, float:2.89E-43)
                if (r7 == r11) goto L9e
                r0.a = r5     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                r1 = 2
                r14.a(r1)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                r7 = r4
                goto L153
            L9e:
                java.lang.String r11 = "Content-Disposition"
                r6.getHeaderField(r11)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                r6.getContentType()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                int r11 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                r12 = 24
                if (r11 < r12) goto Lb1
                long r11 = com.beizi.ad.internal.h.b0.a(r6)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                goto Lb6
            Lb1:
                int r11 = r6.getContentLength()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                long r11 = (long) r11     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
            Lb6:
                if (r7 != r8) goto Lbe
                com.beizi.ad.internal.h.b.d.a(r0, r9)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                com.beizi.ad.internal.h.b.d.b(r0, r11)     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
            Lbe:
                java.io.InputStream r7 = r6.getInputStream()     // Catch: java.lang.Throwable -> L7b java.io.IOException -> L7f
                r8 = 8192(0x2000, float:1.148E-41)
                byte[] r8 = new byte[r8]     // Catch: java.lang.Throwable -> L16e java.io.IOException -> L176
                java.io.RandomAccessFile r9 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L16e java.io.IOException -> L176
                java.lang.String r10 = "rw"
                r9.<init>(r2, r10)     // Catch: java.lang.Throwable -> L16e java.io.IOException -> L176
                long r10 = com.beizi.ad.internal.h.b.d.d(r0)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                r9.seek(r10)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                r2 = 0
            Ld5:
                int r4 = r7.read(r8)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                r10 = -1
                if (r4 == r10) goto L139
                int r2 = r2 + r1
                r9.write(r8, r5, r4)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                long r10 = com.beizi.ad.internal.h.b.d.d(r0)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                long r12 = (long) r4     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                long r10 = r10 + r12
                com.beizi.ad.internal.h.b.d.a(r0, r10)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                int r4 = r2 % 64
                if (r4 != 0) goto Ld5
                boolean r4 = r0.f6857b     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                if (r4 == 0) goto L10e
                r0.a = r5     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                r14.a(r1)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                java.io.FileDescriptor r0 = r9.getFD()     // Catch: java.io.IOException -> Lfd
                r0.sync()     // Catch: java.io.IOException -> Lfd
            Lfd:
                r9.close()     // Catch: java.io.IOException -> L100
            L100:
                r7.close()     // Catch: java.io.IOException -> L103
            L103:
                r6.disconnect()
                return
            L107:
                r0 = move-exception
                r4 = r9
                goto L199
            L10b:
                r4 = r9
                goto L176
            L10e:
                boolean r4 = r0.f6858c     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                if (r4 == 0) goto L129
                r0.a = r5     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                r1 = 6
                r14.a(r1)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                java.io.FileDescriptor r0 = r9.getFD()     // Catch: java.io.IOException -> L11f
                r0.sync()     // Catch: java.io.IOException -> L11f
            L11f:
                r9.close()     // Catch: java.io.IOException -> L122
            L122:
                r7.close()     // Catch: java.io.IOException -> L125
            L125:
                r6.disconnect()
                return
            L129:
                int r4 = r2 % 16
                if (r4 != 0) goto Ld5
                long r10 = com.beizi.ad.internal.h.b.d.d(r0)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                long r12 = com.beizi.ad.internal.h.b.d.e(r0)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                r14.a(r10, r12)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                goto Ld5
            L139:
                java.io.FileDescriptor r1 = r9.getFD()     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                r1.sync()     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                boolean r1 = r14.a(r3)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                if (r1 != 0) goto L14d
                r0.a = r5     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                r1 = 4
                r14.a(r1)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                goto L152
            L14d:
                r0.a = r5     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
                r14.b(r3)     // Catch: java.lang.Throwable -> L107 java.io.IOException -> L10b
            L152:
                r4 = r9
            L153:
                if (r4 == 0) goto L15e
                java.io.FileDescriptor r0 = r4.getFD()     // Catch: java.io.IOException -> L15d
                r0.sync()     // Catch: java.io.IOException -> L15d
                goto L15e
            L15d:
            L15e:
                if (r4 == 0) goto L165
                r4.close()     // Catch: java.io.IOException -> L164
                goto L165
            L164:
            L165:
                if (r7 == 0) goto L16a
                r7.close()     // Catch: java.io.IOException -> L16a
            L16a:
                r6.disconnect()
                goto L198
            L16e:
                r0 = move-exception
                goto L199
            L170:
                r0 = move-exception
                r6 = r4
                r7 = r6
                goto L199
            L174:
                r6 = r4
                r7 = r6
            L176:
                r0.a = r5     // Catch: java.lang.Throwable -> L16e
                r0 = 5
                r14.a(r0)     // Catch: java.lang.Throwable -> L16e
                if (r4 == 0) goto L187
                java.io.FileDescriptor r0 = r4.getFD()     // Catch: java.io.IOException -> L186
                r0.sync()     // Catch: java.io.IOException -> L186
                goto L187
            L186:
            L187:
                if (r4 == 0) goto L18e
                r4.close()     // Catch: java.io.IOException -> L18d
                goto L18e
            L18d:
            L18e:
                if (r7 == 0) goto L195
                r7.close()     // Catch: java.io.IOException -> L194
                goto L195
            L194:
            L195:
                if (r6 == 0) goto L198
                goto L16a
            L198:
                return
            L199:
                if (r4 == 0) goto L1a4
                java.io.FileDescriptor r1 = r4.getFD()     // Catch: java.io.IOException -> L1a3
                r1.sync()     // Catch: java.io.IOException -> L1a3
                goto L1a4
            L1a3:
            L1a4:
                if (r4 == 0) goto L1ab
                r4.close()     // Catch: java.io.IOException -> L1aa
                goto L1ab
            L1aa:
            L1ab:
                if (r7 == 0) goto L1b2
                r7.close()     // Catch: java.io.IOException -> L1b1
                goto L1b2
            L1b1:
            L1b2:
                if (r6 == 0) goto L1b7
                r6.disconnect()
            L1b7:
                throw r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static final class d {
        public volatile boolean a;

        /* renamed from: b, reason: collision with root package name */
        public volatile boolean f6857b;

        /* renamed from: c, reason: collision with root package name */
        public volatile boolean f6858c;

        /* renamed from: d, reason: collision with root package name */
        private java.lang.String f6859d;

        /* renamed from: e, reason: collision with root package name */
        private java.lang.String f6860e;

        /* renamed from: f, reason: collision with root package name */
        private java.lang.String f6861f;

        /* renamed from: g, reason: collision with root package name */
        private volatile long f6862g;

        /* renamed from: h, reason: collision with root package name */
        private volatile long f6863h;

        public d(java.lang.String r1, java.lang.String r2, java.lang.String r3) {
                r0 = this;
                r0.<init>()
                r0.f6859d = r1
                r0.f6860e = r2
                r0.f6861f = r3
                r0.a()
                return
        }

        static /* synthetic */ long a(com.beizi.ad.internal.h.b.d r0, long r1) {
                r0.f6863h = r1
                return r1
        }

        static /* synthetic */ java.lang.String a(com.beizi.ad.internal.h.b.d r0) {
                java.lang.String r0 = r0.f6860e
                return r0
        }

        static /* synthetic */ long b(com.beizi.ad.internal.h.b.d r0, long r1) {
                r0.f6862g = r1
                return r1
        }

        static /* synthetic */ java.lang.String b(com.beizi.ad.internal.h.b.d r0) {
                java.lang.String r0 = r0.f6861f
                return r0
        }

        static /* synthetic */ java.lang.String c(com.beizi.ad.internal.h.b.d r0) {
                java.lang.String r0 = r0.f6859d
                return r0
        }

        static /* synthetic */ long d(com.beizi.ad.internal.h.b.d r2) {
                long r0 = r2.f6863h
                return r0
        }

        static /* synthetic */ long e(com.beizi.ad.internal.h.b.d r2) {
                long r0 = r2.f6862g
                return r0
        }

        public void a() {
                r2 = this;
                r0 = 0
                r2.f6862g = r0
                r2.f6863h = r0
                r0 = 0
                r2.f6857b = r0
                r2.f6858c = r0
                r2.a = r0
                return
        }
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    public static com.beizi.ad.internal.h.b.a a() {
            com.beizi.ad.internal.h.b$c r0 = new com.beizi.ad.internal.h.b$c
            r0.<init>()
            return r0
    }
}

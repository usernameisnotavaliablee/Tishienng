package com.acse.ottn;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class j2 {

    /* renamed from: c, reason: collision with root package name */
    public static com.acse.ottn.j2 f2399c;

    /* renamed from: d, reason: collision with root package name */
    public static java.lang.String f2400d;
    public com.acse.ottn.j2.a a;

    /* renamed from: b, reason: collision with root package name */
    public int f2401b;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public class a extends java.lang.Thread {
        public java.lang.Process a;

        /* renamed from: b, reason: collision with root package name */
        public java.io.BufferedReader f2402b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f2403c;

        /* renamed from: d, reason: collision with root package name */
        public java.lang.String f2404d;

        /* renamed from: e, reason: collision with root package name */
        public java.lang.String f2405e;

        /* renamed from: f, reason: collision with root package name */
        public java.io.FileOutputStream f2406f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ com.acse.ottn.j2 f2407g;

        public a(com.acse.ottn.j2 r4, java.lang.String r5, java.lang.String r6) {
                r3 = this;
                r3.f2407g = r4
                r3.<init>()
                r0 = 0
                r3.f2402b = r0
                r1 = 1
                r3.f2403c = r1
                r3.f2404d = r0
                r3.f2406f = r0
                r3.f2405e = r5
                java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.io.FileNotFoundException -> L37
                java.io.File r0 = new java.io.File     // Catch: java.io.FileNotFoundException -> L37
                java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.FileNotFoundException -> L37
                r1.<init>()     // Catch: java.io.FileNotFoundException -> L37
                java.lang.String r2 = "log-"
                r1.append(r2)     // Catch: java.io.FileNotFoundException -> L37
                java.lang.String r4 = r4.a()     // Catch: java.io.FileNotFoundException -> L37
                r1.append(r4)     // Catch: java.io.FileNotFoundException -> L37
                java.lang.String r4 = ".log"
                r1.append(r4)     // Catch: java.io.FileNotFoundException -> L37
                java.lang.String r4 = r1.toString()     // Catch: java.io.FileNotFoundException -> L37
                r0.<init>(r6, r4)     // Catch: java.io.FileNotFoundException -> L37
                r5.<init>(r0)     // Catch: java.io.FileNotFoundException -> L37
                r3.f2406f = r5     // Catch: java.io.FileNotFoundException -> L37
            L37:
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                java.lang.String r5 = "logcat | grep \"("
                r4.append(r5)
                java.lang.String r5 = r3.f2405e
                r4.append(r5)
                java.lang.String r5 = ")\""
                r4.append(r5)
                java.lang.String r4 = r4.toString()
                r3.f2404d = r4
                return
        }

        public void a() {
                r1 = this;
                r0 = 0
                r1.f2403c = r0
                return
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
                r4 = this;
                r0 = 0
                java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                java.lang.String r2 = r4.f2404d     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                java.lang.Process r1 = r1.exec(r2)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                r4.a = r1     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                java.io.InputStreamReader r2 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                java.lang.Process r3 = r4.a     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                java.io.InputStream r3 = r3.getInputStream()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                r2.<init>(r3)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                r3 = 1024(0x400, float:1.435E-42)
                r1.<init>(r2, r3)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                r4.f2402b = r1     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
            L21:
                boolean r1 = r4.f2403c     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                if (r1 == 0) goto L64
                java.io.BufferedReader r1 = r4.f2402b     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                java.lang.String r1 = r1.readLine()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                if (r1 == 0) goto L64
                boolean r2 = r4.f2403c     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                if (r2 != 0) goto L32
                goto L64
            L32:
                int r2 = r1.length()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                if (r2 != 0) goto L39
                goto L21
            L39:
                java.io.FileOutputStream r2 = r4.f2406f     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                if (r2 == 0) goto L21
                java.lang.String r2 = r4.f2405e     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                boolean r2 = r1.contains(r2)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                if (r2 == 0) goto L21
                java.io.FileOutputStream r2 = r4.f2406f     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                r3.<init>()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                r3.append(r1)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                java.lang.String r1 = "\n"
                r3.append(r1)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                java.lang.String r1 = r3.toString()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                byte[] r1 = r1.getBytes()     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                r2.write(r1)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L62
                goto L21
            L60:
                r1 = move-exception
                goto L80
            L62:
                goto L9e
            L64:
                java.lang.Process r1 = r4.a
                if (r1 == 0) goto L6d
                r1.destroy()
                r4.a = r0
            L6d:
                java.io.BufferedReader r1 = r4.f2402b
                if (r1 == 0) goto L78
                r1.close()     // Catch: java.io.IOException -> L77
                r4.f2402b = r0     // Catch: java.io.IOException -> L77
                goto L78
            L77:
            L78:
                java.io.FileOutputStream r1 = r4.f2406f
                if (r1 == 0) goto Lbb
                r1.close()     // Catch: java.io.IOException -> Lb9
                goto Lb9
            L80:
                java.lang.Process r2 = r4.a
                if (r2 == 0) goto L89
                r2.destroy()
                r4.a = r0
            L89:
                java.io.BufferedReader r2 = r4.f2402b
                if (r2 == 0) goto L94
                r2.close()     // Catch: java.io.IOException -> L93
                r4.f2402b = r0     // Catch: java.io.IOException -> L93
                goto L94
            L93:
            L94:
                java.io.FileOutputStream r2 = r4.f2406f
                if (r2 == 0) goto L9d
                r2.close()     // Catch: java.io.IOException -> L9b
            L9b:
                r4.f2406f = r0
            L9d:
                throw r1
            L9e:
                java.lang.Process r1 = r4.a
                if (r1 == 0) goto La7
                r1.destroy()
                r4.a = r0
            La7:
                java.io.BufferedReader r1 = r4.f2402b
                if (r1 == 0) goto Lb2
                r1.close()     // Catch: java.io.IOException -> Lb1
                r4.f2402b = r0     // Catch: java.io.IOException -> Lb1
                goto Lb2
            Lb1:
            Lb2:
                java.io.FileOutputStream r1 = r4.f2406f
                if (r1 == 0) goto Lbb
                r1.close()     // Catch: java.io.IOException -> Lb9
            Lb9:
                r4.f2406f = r0
            Lbb:
                return
        }
    }

    static {
            return
    }

    public j2(android.content.Context r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r1.b(r2)
            int r2 = android.os.Process.myPid()
            r1.f2401b = r2
            return
    }

    public static com.acse.ottn.j2 a(android.content.Context r1) {
            com.acse.ottn.j2 r0 = com.acse.ottn.j2.f2399c
            if (r0 != 0) goto Lb
            com.acse.ottn.j2 r0 = new com.acse.ottn.j2
            r0.<init>(r1)
            com.acse.ottn.j2.f2399c = r0
        Lb:
            com.acse.ottn.j2 r1 = com.acse.ottn.j2.f2399c
            return r1
    }

    public java.lang.String a() {
            r4 = this;
            java.text.SimpleDateFormat r0 = new java.text.SimpleDateFormat
            java.lang.String r1 = "yyyy-MM-dd"
            r0.<init>(r1)
            java.util.Date r1 = new java.util.Date
            long r2 = java.lang.System.currentTimeMillis()
            r1.<init>(r2)
            java.lang.String r0 = r0.format(r1)
            return r0
    }

    public void b() {
            r3 = this;
            com.acse.ottn.j2$a r0 = r3.a
            if (r0 != 0) goto L13
            com.acse.ottn.j2$a r0 = new com.acse.ottn.j2$a
            int r1 = r3.f2401b
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = com.acse.ottn.j2.f2400d
            r0.<init>(r3, r1, r2)
            r3.a = r0
        L13:
            com.acse.ottn.j2$a r0 = r3.a
            r0.start()
            return
    }

    public void b(android.content.Context r3) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "log"
            java.io.File r3 = r3.getExternalFilesDir(r1)
            java.io.File r3 = r3.getAbsoluteFile()
            java.lang.String r3 = r3.getPath()
            r0.append(r3)
            java.lang.String r3 = "/log"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            com.acse.ottn.j2.f2400d = r3
            java.io.File r3 = new java.io.File
            java.lang.String r0 = com.acse.ottn.j2.f2400d
            r3.<init>(r0)
            boolean r0 = r3.exists()
            if (r0 != 0) goto L31
            r3.mkdirs()
        L31:
            java.io.File r3 = new java.io.File
            java.lang.String r0 = com.acse.ottn.j2.f2400d
            r3.<init>(r0)
            r3.exists()
            return
    }

    public void c() {
            r1 = this;
            com.acse.ottn.j2$a r0 = r1.a
            if (r0 == 0) goto La
            r0.a()
            r0 = 0
            r1.a = r0
        La:
            return
    }
}

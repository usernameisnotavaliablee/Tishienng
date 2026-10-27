package com.kwad.framework.filedownloader.f;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_5_sz8796392.dex */
public class e {
    public final int apE;
    public final long apF;
    public final boolean apG;
    public final boolean apH;
    public final int apI;
    public final boolean apJ;
    public final boolean apK;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    public static class a {
        private static final com.kwad.framework.filedownloader.f.e apL = null;

        static {
                com.kwad.framework.filedownloader.f.e r0 = new com.kwad.framework.filedownloader.f.e
                r1 = 0
                r0.<init>(r1)
                com.kwad.framework.filedownloader.f.e.a.apL = r0
                return
        }

        public a() {
                r1 = this;
                r1.<init>()
                return
        }

        static /* synthetic */ com.kwad.framework.filedownloader.f.e zC() {
                com.kwad.framework.filedownloader.f.e r0 = com.kwad.framework.filedownloader.f.e.a.apL
                return r0
        }
    }

    private e() {
            r24 = this;
            r1 = r24
            java.lang.String r2 = "download.max-network-thread-count"
            java.lang.String r3 = "download.min-progress-time"
            java.lang.String r4 = "download.min-progress-step"
            java.lang.Class<com.kwad.framework.filedownloader.f.e> r5 = com.kwad.framework.filedownloader.f.e.class
            java.lang.String r6 = "broadcast.completed"
            java.lang.String r7 = "file.non-pre-allocation"
            java.lang.String r8 = "http.lenient"
            r1.<init>()
            android.content.Context r0 = com.kwad.framework.filedownloader.f.c.zz()
            if (r0 == 0) goto L1db
            long r9 = java.lang.System.currentTimeMillis()
            java.util.Properties r0 = new java.util.Properties
            r0.<init>()
            r11 = 0
            android.content.Context r13 = com.kwad.framework.filedownloader.f.c.zz()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7c
            android.content.res.AssetManager r13 = r13.getAssets()     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7c
            java.lang.String r14 = "filedownloader.properties"
            java.io.InputStream r13 = r13.open(r14)     // Catch: java.lang.Throwable -> L78 java.io.IOException -> L7c
            if (r13 == 0) goto L69
            r0.load(r13)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L66
            java.lang.String r14 = r0.getProperty(r8)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L66
            java.lang.String r15 = r0.getProperty(r4)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L63
            java.lang.String r16 = r0.getProperty(r3)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L5f
            java.lang.String r17 = r0.getProperty(r2)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L5b
            java.lang.String r18 = r0.getProperty(r7)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L57
            java.lang.String r12 = r0.getProperty(r6)     // Catch: java.lang.Throwable -> L51 java.io.IOException -> L55
            r0 = r12
            r12 = r14
            goto L72
        L51:
            r0 = move-exception
            r12 = r13
            goto L1d7
        L55:
            r0 = move-exception
            goto L7f
        L57:
            r0 = move-exception
        L58:
            r18 = 0
            goto L7f
        L5b:
            r0 = move-exception
        L5c:
            r17 = 0
            goto L58
        L5f:
            r0 = move-exception
        L60:
            r16 = 0
            goto L5c
        L63:
            r0 = move-exception
        L64:
            r15 = 0
            goto L60
        L66:
            r0 = move-exception
        L67:
            r14 = 0
            goto L64
        L69:
            r0 = 0
            r12 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
        L72:
            com.kwad.sdk.crash.utils.b.closeQuietly(r13)
        L75:
            r13 = r18
            goto L94
        L78:
            r0 = move-exception
            r12 = 0
            goto L1d7
        L7c:
            r0 = move-exception
            r13 = 0
            goto L67
        L7f:
            boolean r0 = r0 instanceof java.io.FileNotFoundException     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L8e
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD     // Catch: java.lang.Throwable -> L51
            if (r0 == 0) goto L8e
            java.lang.String r0 = "not found filedownloader.properties"
            java.lang.Object[] r12 = new java.lang.Object[r11]     // Catch: java.lang.Throwable -> L51
            com.kwad.framework.filedownloader.f.d.c(r5, r0, r12)     // Catch: java.lang.Throwable -> L51
        L8e:
            com.kwad.sdk.crash.utils.b.closeQuietly(r13)
            r12 = r14
            r0 = 0
            goto L75
        L94:
            r18 = 2
            r19 = 1
            r20 = 0
            java.lang.String r11 = "the value of '%s' must be '%s' or '%s'"
            java.lang.String r14 = "false"
            r22 = r2
            java.lang.String r2 = "true"
            if (r12 == 0) goto Lcc
            boolean r23 = r12.equals(r2)
            if (r23 != 0) goto Lc4
            boolean r23 = r12.equals(r14)
            if (r23 == 0) goto Lb1
            goto Lc4
        Lb1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r20] = r8
            r3[r19] = r2
            r3[r18] = r14
            java.lang.String r2 = com.kwad.framework.filedownloader.f.f.c(r11, r3)
            r0.<init>(r2)
            throw r0
        Lc4:
            boolean r12 = r12.equals(r2)
            r1.apG = r12
        Lca:
            r12 = 1
            goto Ld0
        Lcc:
            r12 = 0
            r1.apG = r12
            goto Lca
        Ld0:
            r1.apH = r12
            if (r15 == 0) goto Le4
            java.lang.Integer r12 = java.lang.Integer.valueOf(r15)
            int r12 = r12.intValue()
            r15 = 0
            int r12 = java.lang.Math.max(r15, r12)
            r1.apE = r12
            goto Le8
        Le4:
            r12 = 65536(0x10000, float:9.1835E-41)
            r1.apE = r12
        Le8:
            if (r16 == 0) goto L101
            java.lang.Long r12 = java.lang.Long.valueOf(r16)
            r15 = r3
            r16 = r4
            long r3 = r12.longValue()
            r12 = r6
            r23 = r7
            r6 = 0
            long r3 = java.lang.Math.max(r6, r3)
            r1.apF = r3
            goto L10b
        L101:
            r15 = r3
            r16 = r4
            r12 = r6
            r23 = r7
            r3 = 2000(0x7d0, double:9.88E-321)
            r1.apF = r3
        L10b:
            if (r17 == 0) goto L11d
            java.lang.Integer r3 = java.lang.Integer.valueOf(r17)
            int r3 = r3.intValue()
            int r3 = ce(r3)
            r1.apI = r3
            r3 = 3
            goto L120
        L11d:
            r3 = 3
            r1.apI = r3
        L120:
            if (r13 == 0) goto L14c
            boolean r4 = r13.equals(r2)
            if (r4 != 0) goto L12e
            boolean r4 = r13.equals(r14)
            if (r4 == 0) goto L130
        L12e:
            r4 = 0
            goto L145
        L130:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r4 = 0
            r3[r4] = r23
            r19 = 1
            r3[r19] = r2
            r3[r18] = r14
            java.lang.String r2 = com.kwad.framework.filedownloader.f.f.c(r11, r3)
            r0.<init>(r2)
            throw r0
        L145:
            boolean r3 = r13.equals(r2)
            r1.apJ = r3
            goto L14f
        L14c:
            r4 = 0
            r1.apJ = r4
        L14f:
            if (r0 == 0) goto L17a
            boolean r3 = r0.equals(r2)
            if (r3 != 0) goto L173
            boolean r3 = r0.equals(r14)
            if (r3 == 0) goto L15e
            goto L173
        L15e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r3 = 3
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r4] = r12
            r19 = 1
            r3[r19] = r2
            r3[r18] = r14
            java.lang.String r2 = com.kwad.framework.filedownloader.f.f.c(r11, r3)
            r0.<init>(r2)
            throw r0
        L173:
            boolean r0 = r0.equals(r2)
            r1.apK = r0
            goto L17c
        L17a:
            r1.apK = r4
        L17c:
            boolean r0 = com.kwad.framework.filedownloader.f.d.apD
            if (r0 == 0) goto L1d6
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r9
            java.lang.Long r0 = java.lang.Long.valueOf(r2)
            boolean r2 = r1.apG
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            r19 = 1
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r19)
            int r4 = r1.apE
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            long r6 = r1.apF
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            int r7 = r1.apI
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r9 = 11
            java.lang.Object[] r9 = new java.lang.Object[r9]
            r20 = 0
            r9[r20] = r0
            r9[r19] = r8
            r9[r18] = r2
            java.lang.String r0 = "process.non-separate"
            r21 = 3
            r9[r21] = r0
            r0 = 4
            r9[r0] = r3
            r0 = 5
            r9[r0] = r16
            r0 = 6
            r9[r0] = r4
            r0 = 7
            r9[r0] = r15
            r0 = 8
            r9[r0] = r6
            r0 = 9
            r9[r0] = r22
            r0 = 10
            r9[r0] = r7
            java.lang.String r0 = "init properties %d\n load properties: %s=%B; %s=%B; %s=%d; %s=%d; %s=%d"
            com.kwad.framework.filedownloader.f.d.b(r5, r0, r9)
        L1d6:
            return
        L1d7:
            com.kwad.sdk.crash.utils.b.closeQuietly(r12)
            throw r0
        L1db:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Please invoke the 'FileDownloader#setup' before using FileDownloader. If you want to register some components on FileDownloader please invoke the 'FileDownloader#setupOnApplicationOnCreate' on the 'Application#onCreate' first."
            r0.<init>(r2)
            throw r0
    }

    /* synthetic */ e(byte r1) {
            r0 = this;
            r0.<init>()
            return
    }

    public static int ce(int r8) {
            r0 = 1
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
            r2 = 12
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 2
            r5 = 0
            r6 = 3
            java.lang.Class<com.kwad.framework.filedownloader.f.e> r7 = com.kwad.framework.filedownloader.f.e.class
            if (r8 <= r2) goto L24
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r1 = new java.lang.Object[r6]
            r1[r5] = r8
            r1[r0] = r3
            r1[r4] = r3
            java.lang.String r8 = "require the count of network thread  is %d, what is more than the max valid count(%d), so adjust to %d auto"
            com.kwad.framework.filedownloader.f.d.d(r7, r8, r1)
            return r2
        L24:
            if (r8 > 0) goto L38
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            r2[r5] = r8
            r2[r0] = r1
            r2[r4] = r1
            java.lang.String r8 = "require the count of network thread  is %d, what is less than the min valid count(%d), so adjust to %d auto"
            com.kwad.framework.filedownloader.f.d.d(r7, r8, r2)
            return r0
        L38:
            return r8
    }

    public static com.kwad.framework.filedownloader.f.e zB() {
            com.kwad.framework.filedownloader.f.e r0 = com.kwad.framework.filedownloader.f.e.a.zC()
            return r0
    }
}

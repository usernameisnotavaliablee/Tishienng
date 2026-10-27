package com.beizi.ad.internal.i.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
public class b implements com.beizi.ad.internal.i.a {
    public java.io.File a;

    /* renamed from: b, reason: collision with root package name */
    private final com.beizi.ad.internal.i.a.a f6954b;

    /* renamed from: c, reason: collision with root package name */
    private java.io.RandomAccessFile f6955c;

    public b(java.io.File r5, com.beizi.ad.internal.i.a.a r6) throws com.beizi.ad.internal.i.m {
            r4 = this;
            r4.<init>()
            if (r6 == 0) goto L49
            r4.f6954b = r6     // Catch: java.io.IOException -> L3f
            java.io.File r6 = r5.getParentFile()     // Catch: java.io.IOException -> L3f
            com.beizi.ad.internal.i.a.d.a(r6)     // Catch: java.io.IOException -> L3f
            boolean r6 = r5.exists()     // Catch: java.io.IOException -> L3f
            if (r6 == 0) goto L16
            r0 = r5
            goto L34
        L16:
            java.io.File r0 = new java.io.File     // Catch: java.io.IOException -> L3f
            java.io.File r1 = r5.getParentFile()     // Catch: java.io.IOException -> L3f
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L3f
            r2.<init>()     // Catch: java.io.IOException -> L3f
            java.lang.String r3 = r5.getName()     // Catch: java.io.IOException -> L3f
            r2.append(r3)     // Catch: java.io.IOException -> L3f
            java.lang.String r3 = ".download"
            r2.append(r3)     // Catch: java.io.IOException -> L3f
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> L3f
            r0.<init>(r1, r2)     // Catch: java.io.IOException -> L3f
        L34:
            r4.a = r0     // Catch: java.io.IOException -> L3f
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L3f
            java.io.File r1 = r4.a     // Catch: java.io.IOException -> L3f
            if (r6 == 0) goto L41
            java.lang.String r6 = "r"
            goto L43
        L3f:
            r6 = move-exception
            goto L4f
        L41:
            java.lang.String r6 = "rw"
        L43:
            r0.<init>(r1, r6)     // Catch: java.io.IOException -> L3f
            r4.f6955c = r0     // Catch: java.io.IOException -> L3f
            return
        L49:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.io.IOException -> L3f
            r6.<init>()     // Catch: java.io.IOException -> L3f
            throw r6     // Catch: java.io.IOException -> L3f
        L4f:
            com.beizi.ad.internal.i.m r0 = new com.beizi.ad.internal.i.m
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error using file "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = " as disc cache"
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5, r6)
            throw r0
    }

    private boolean a(java.io.File r2) {
            r1 = this;
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = ".download"
            boolean r2 = r2.endsWith(r0)
            return r2
    }

    @Override // com.beizi.ad.internal.i.a
    public synchronized int a() throws com.beizi.ad.internal.i.m {
            r4 = this;
            monitor-enter(r4)
            java.io.RandomAccessFile r0 = r4.f6955c     // Catch: java.lang.Throwable -> La java.io.IOException -> Lc
            long r0 = r0.length()     // Catch: java.lang.Throwable -> La java.io.IOException -> Lc
            int r1 = (int) r0
            monitor-exit(r4)
            return r1
        La:
            r0 = move-exception
            goto L26
        Lc:
            r0 = move-exception
            com.beizi.ad.internal.i.m r1 = new com.beizi.ad.internal.i.m     // Catch: java.lang.Throwable -> La
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La
            r2.<init>()     // Catch: java.lang.Throwable -> La
            java.lang.String r3 = "Error reading length of file "
            r2.append(r3)     // Catch: java.lang.Throwable -> La
            java.io.File r3 = r4.a     // Catch: java.lang.Throwable -> La
            r2.append(r3)     // Catch: java.lang.Throwable -> La
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> La
            throw r1     // Catch: java.lang.Throwable -> La
        L26:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> La
            throw r0
    }

    @Override // com.beizi.ad.internal.i.a
    public synchronized int a(byte[] r6, long r7, int r9) throws com.beizi.ad.internal.i.m {
            r5 = this;
            monitor-enter(r5)
            r0 = 0
            java.io.RandomAccessFile r1 = r5.f6955c     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            r1.seek(r7)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            java.io.RandomAccessFile r1 = r5.f6955c     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            int r6 = r1.read(r6, r0, r9)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            monitor-exit(r5)
            return r6
        Lf:
            r6 = move-exception
            goto L41
        L11:
            r1 = move-exception
            java.lang.String r2 = "Error reading %d bytes with offset %d failFrom file[%d bytes] to buffer[%d bytes]"
            com.beizi.ad.internal.i.m r3 = new com.beizi.ad.internal.i.m     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> Lf
            java.lang.Long r7 = java.lang.Long.valueOf(r7)     // Catch: java.lang.Throwable -> Lf
            int r8 = r5.a()     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> Lf
            int r6 = r6.length     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Lf
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lf
            r4[r0] = r9     // Catch: java.lang.Throwable -> Lf
            r9 = 1
            r4[r9] = r7     // Catch: java.lang.Throwable -> Lf
            r7 = 2
            r4[r7] = r8     // Catch: java.lang.Throwable -> Lf
            r7 = 3
            r4[r7] = r6     // Catch: java.lang.Throwable -> Lf
            java.lang.String r6 = java.lang.String.format(r2, r4)     // Catch: java.lang.Throwable -> Lf
            r3.<init>(r6, r1)     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> Lf
        L41:
            monitor-exit(r5)     // Catch: java.lang.Throwable -> Lf
            throw r6
    }

    @Override // com.beizi.ad.internal.i.a
    public synchronized void a(byte[] r7, int r8) throws com.beizi.ad.internal.i.m {
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            boolean r1 = r6.d()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            if (r1 != 0) goto L1d
            java.io.RandomAccessFile r1 = r6.f6955c     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            int r2 = r6.a()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            long r2 = (long) r2     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            r1.seek(r2)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            java.io.RandomAccessFile r1 = r6.f6955c     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            r1.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            monitor-exit(r6)
            return
        L19:
            r7 = move-exception
            goto L5d
        L1b:
            r1 = move-exception
            goto L3b
        L1d:
            com.beizi.ad.internal.i.m r1 = new com.beizi.ad.internal.i.m     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            r2.<init>()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            java.lang.String r3 = "Error append cache: cache file "
            r2.append(r3)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            java.io.File r3 = r6.a     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            r2.append(r3)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            java.lang.String r3 = " is completed!"
            r2.append(r3)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
            throw r1     // Catch: java.lang.Throwable -> L19 java.io.IOException -> L1b
        L3b:
            java.lang.String r2 = "Error writing %d bytes to %s failFrom buffer with size %d"
            com.beizi.ad.internal.i.m r3 = new com.beizi.ad.internal.i.m     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L19
            java.io.RandomAccessFile r4 = r6.f6955c     // Catch: java.lang.Throwable -> L19
            int r7 = r7.length     // Catch: java.lang.Throwable -> L19
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L19
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L19
            r5[r0] = r8     // Catch: java.lang.Throwable -> L19
            r8 = 1
            r5[r8] = r4     // Catch: java.lang.Throwable -> L19
            r8 = 2
            r5[r8] = r7     // Catch: java.lang.Throwable -> L19
            java.lang.String r7 = java.lang.String.format(r2, r5)     // Catch: java.lang.Throwable -> L19
            r3.<init>(r7, r1)     // Catch: java.lang.Throwable -> L19
            throw r3     // Catch: java.lang.Throwable -> L19
        L5d:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L19
            throw r7
    }

    @Override // com.beizi.ad.internal.i.a
    public synchronized void b() throws com.beizi.ad.internal.i.m {
            r4 = this;
            monitor-enter(r4)
            java.io.RandomAccessFile r0 = r4.f6955c     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            r0.close()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            com.beizi.ad.internal.i.a.a r0 = r4.f6954b     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            java.io.File r1 = r4.a     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            r0.a(r1)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            monitor-exit(r4)
            return
        Lf:
            r0 = move-exception
            goto L2b
        L11:
            r0 = move-exception
            com.beizi.ad.internal.i.m r1 = new com.beizi.ad.internal.i.m     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "Error closing file "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.io.File r3 = r4.a     // Catch: java.lang.Throwable -> Lf
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lf
            throw r1     // Catch: java.lang.Throwable -> Lf
        L2b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // com.beizi.ad.internal.i.a
    public synchronized void c() throws com.beizi.ad.internal.i.m {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.d()     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L9
            monitor-exit(r4)
            return
        L9:
            r4.b()     // Catch: java.lang.Throwable -> L45
            java.io.File r0 = r4.a     // Catch: java.lang.Throwable -> L45
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L45
            java.io.File r1 = r4.a     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L45
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L45
            int r1 = r1 + (-9)
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)     // Catch: java.lang.Throwable -> L45
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L45
            java.io.File r2 = r4.a     // Catch: java.lang.Throwable -> L45
            java.io.File r2 = r2.getParentFile()     // Catch: java.lang.Throwable -> L45
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L45
            java.io.File r0 = r4.a     // Catch: java.lang.Throwable -> L45
            boolean r0 = r0.renameTo(r1)     // Catch: java.lang.Throwable -> L45
            if (r0 == 0) goto L66
            r4.a = r1     // Catch: java.lang.Throwable -> L45
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            java.io.File r1 = r4.a     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            java.lang.String r2 = "r"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            r4.f6955c = r0     // Catch: java.lang.Throwable -> L45 java.io.IOException -> L47
            monitor-exit(r4)
            return
        L45:
            r0 = move-exception
            goto L8c
        L47:
            r0 = move-exception
            com.beizi.ad.internal.i.m r1 = new com.beizi.ad.internal.i.m     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r2.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "Error opening "
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            java.io.File r3 = r4.a     // Catch: java.lang.Throwable -> L45
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = " as disc cache"
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L45
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L45
            throw r1     // Catch: java.lang.Throwable -> L45
        L66:
            com.beizi.ad.internal.i.m r0 = new com.beizi.ad.internal.i.m     // Catch: java.lang.Throwable -> L45
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L45
            r2.<init>()     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = "Error renaming file "
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            java.io.File r3 = r4.a     // Catch: java.lang.Throwable -> L45
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            java.lang.String r3 = " to "
            r2.append(r3)     // Catch: java.lang.Throwable -> L45
            r2.append(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = " for completion!"
            r2.append(r1)     // Catch: java.lang.Throwable -> L45
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L45
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L8c:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L45
            throw r0
    }

    @Override // com.beizi.ad.internal.i.a
    public synchronized boolean d() {
            r1 = this;
            monitor-enter(r1)
            java.io.File r0 = r1.a     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r1.a(r0)     // Catch: java.lang.Throwable -> Lb
            r0 = r0 ^ 1
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }
}

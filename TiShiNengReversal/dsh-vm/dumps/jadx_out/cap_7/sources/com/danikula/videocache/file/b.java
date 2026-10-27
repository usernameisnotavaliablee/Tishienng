package com.danikula.videocache.file;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
public class b implements com.danikula.videocache.d {
    private static final java.lang.String d = ".download";
    private final com.danikula.videocache.file.a a;
    public java.io.File b;
    private java.io.RandomAccessFile c;

    public b(java.io.File r2) throws com.danikula.videocache.ProxyCacheException {
            r1 = this;
            com.danikula.videocache.file.i r0 = new com.danikula.videocache.file.i
            r0.<init>()
            r1.<init>(r2, r0)
            return
    }

    public b(java.io.File r5, com.danikula.videocache.file.a r6) throws com.danikula.videocache.ProxyCacheException {
            r4 = this;
            r4.<init>()
            if (r6 == 0) goto L49
            r4.a = r6     // Catch: java.io.IOException -> L3f
            java.io.File r6 = r5.getParentFile()     // Catch: java.io.IOException -> L3f
            com.danikula.videocache.file.d.b(r6)     // Catch: java.io.IOException -> L3f
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
            r4.b = r0     // Catch: java.io.IOException -> L3f
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L3f
            java.io.File r1 = r4.b     // Catch: java.io.IOException -> L3f
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
            r4.c = r0     // Catch: java.io.IOException -> L3f
            return
        L49:
            java.lang.NullPointerException r6 = new java.lang.NullPointerException     // Catch: java.io.IOException -> L3f
            r6.<init>()     // Catch: java.io.IOException -> L3f
            throw r6     // Catch: java.io.IOException -> L3f
        L4f:
            com.danikula.videocache.ProxyCacheException r0 = new com.danikula.videocache.ProxyCacheException
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

    private boolean d(java.io.File r2) {
            r1 = this;
            java.lang.String r2 = r2.getName()
            java.lang.String r0 = ".download"
            boolean r2 = r2.endsWith(r0)
            return r2
    }

    @Override // com.danikula.videocache.d
    public synchronized void a(byte[] r7, int r8) throws com.danikula.videocache.ProxyCacheException {
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            boolean r1 = r6.isCompleted()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            if (r1 != 0) goto L1c
            java.io.RandomAccessFile r1 = r6.c     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            long r2 = r6.available()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            r1.seek(r2)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            java.io.RandomAccessFile r1 = r6.c     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            r1.write(r7, r0, r8)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            monitor-exit(r6)
            return
        L18:
            r7 = move-exception
            goto L5c
        L1a:
            r1 = move-exception
            goto L3a
        L1c:
            com.danikula.videocache.ProxyCacheException r1 = new com.danikula.videocache.ProxyCacheException     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            r2.<init>()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            java.lang.String r3 = "Error append cache: cache file "
            r2.append(r3)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            java.io.File r3 = r6.b     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            r2.append(r3)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            java.lang.String r3 = " is completed!"
            r2.append(r3)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
            throw r1     // Catch: java.lang.Throwable -> L18 java.io.IOException -> L1a
        L3a:
            java.lang.String r2 = "Error writing %d bytes to %s from buffer with size %d"
            com.danikula.videocache.ProxyCacheException r3 = new com.danikula.videocache.ProxyCacheException     // Catch: java.lang.Throwable -> L18
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L18
            java.io.RandomAccessFile r4 = r6.c     // Catch: java.lang.Throwable -> L18
            int r7 = r7.length     // Catch: java.lang.Throwable -> L18
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> L18
            r5 = 3
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch: java.lang.Throwable -> L18
            r5[r0] = r8     // Catch: java.lang.Throwable -> L18
            r8 = 1
            r5[r8] = r4     // Catch: java.lang.Throwable -> L18
            r8 = 2
            r5[r8] = r7     // Catch: java.lang.Throwable -> L18
            java.lang.String r7 = java.lang.String.format(r2, r5)     // Catch: java.lang.Throwable -> L18
            r3.<init>(r7, r1)     // Catch: java.lang.Throwable -> L18
            throw r3     // Catch: java.lang.Throwable -> L18
        L5c:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L18
            throw r7
    }

    @Override // com.danikula.videocache.d
    public synchronized long available() throws com.danikula.videocache.ProxyCacheException {
            r4 = this;
            monitor-enter(r4)
            java.io.RandomAccessFile r0 = r4.c     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            long r0 = r0.length()     // Catch: java.lang.Throwable -> Lb java.io.IOException -> Ld
            int r1 = (int) r0
            long r0 = (long) r1
            monitor-exit(r4)
            return r0
        Lb:
            r0 = move-exception
            goto L27
        Ld:
            r0 = move-exception
            com.danikula.videocache.ProxyCacheException r1 = new com.danikula.videocache.ProxyCacheException     // Catch: java.lang.Throwable -> Lb
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb
            r2.<init>()     // Catch: java.lang.Throwable -> Lb
            java.lang.String r3 = "Error reading length of file "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb
            java.io.File r3 = r4.b     // Catch: java.lang.Throwable -> Lb
            r2.append(r3)     // Catch: java.lang.Throwable -> Lb
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lb
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lb
            throw r1     // Catch: java.lang.Throwable -> Lb
        L27:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }

    @Override // com.danikula.videocache.d
    public synchronized int b(byte[] r7, long r8, int r10) throws com.danikula.videocache.ProxyCacheException {
            r6 = this;
            monitor-enter(r6)
            r0 = 0
            java.io.RandomAccessFile r1 = r6.c     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            r1.seek(r8)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            java.io.RandomAccessFile r1 = r6.c     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            int r7 = r1.read(r7, r0, r10)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            monitor-exit(r6)
            return r7
        Lf:
            r7 = move-exception
            goto L41
        L11:
            r1 = move-exception
            java.lang.String r2 = "Error reading %d bytes with offset %d from file[%d bytes] to buffer[%d bytes]"
            com.danikula.videocache.ProxyCacheException r3 = new com.danikula.videocache.ProxyCacheException     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Throwable -> Lf
            java.lang.Long r8 = java.lang.Long.valueOf(r8)     // Catch: java.lang.Throwable -> Lf
            long r4 = r6.available()     // Catch: java.lang.Throwable -> Lf
            java.lang.Long r9 = java.lang.Long.valueOf(r4)     // Catch: java.lang.Throwable -> Lf
            int r7 = r7.length     // Catch: java.lang.Throwable -> Lf
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Throwable -> Lf
            r4 = 4
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> Lf
            r4[r0] = r10     // Catch: java.lang.Throwable -> Lf
            r10 = 1
            r4[r10] = r8     // Catch: java.lang.Throwable -> Lf
            r8 = 2
            r4[r8] = r9     // Catch: java.lang.Throwable -> Lf
            r8 = 3
            r4[r8] = r7     // Catch: java.lang.Throwable -> Lf
            java.lang.String r7 = java.lang.String.format(r2, r4)     // Catch: java.lang.Throwable -> Lf
            r3.<init>(r7, r1)     // Catch: java.lang.Throwable -> Lf
            throw r3     // Catch: java.lang.Throwable -> Lf
        L41:
            monitor-exit(r6)     // Catch: java.lang.Throwable -> Lf
            throw r7
    }

    public java.io.File c() {
            r1 = this;
            java.io.File r0 = r1.b
            return r0
    }

    @Override // com.danikula.videocache.d
    public synchronized void close() throws com.danikula.videocache.ProxyCacheException {
            r4 = this;
            monitor-enter(r4)
            java.io.RandomAccessFile r0 = r4.c     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            r0.close()     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            com.danikula.videocache.file.a r0 = r4.a     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            java.io.File r1 = r4.b     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            r0.a(r1)     // Catch: java.lang.Throwable -> Lf java.io.IOException -> L11
            monitor-exit(r4)
            return
        Lf:
            r0 = move-exception
            goto L2b
        L11:
            r0 = move-exception
            com.danikula.videocache.ProxyCacheException r1 = new com.danikula.videocache.ProxyCacheException     // Catch: java.lang.Throwable -> Lf
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lf
            r2.<init>()     // Catch: java.lang.Throwable -> Lf
            java.lang.String r3 = "Error closing file "
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.io.File r3 = r4.b     // Catch: java.lang.Throwable -> Lf
            r2.append(r3)     // Catch: java.lang.Throwable -> Lf
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> Lf
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> Lf
            throw r1     // Catch: java.lang.Throwable -> Lf
        L2b:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lf
            throw r0
    }

    @Override // com.danikula.videocache.d
    public synchronized void complete() throws com.danikula.videocache.ProxyCacheException {
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.isCompleted()     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L9
            monitor-exit(r4)
            return
        L9:
            r4.close()     // Catch: java.lang.Throwable -> L4c
            java.io.File r0 = r4.b     // Catch: java.lang.Throwable -> L4c
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L4c
            java.io.File r1 = r4.b     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = r1.getName()     // Catch: java.lang.Throwable -> L4c
            int r1 = r1.length()     // Catch: java.lang.Throwable -> L4c
            int r1 = r1 + (-9)
            r2 = 0
            java.lang.String r0 = r0.substring(r2, r1)     // Catch: java.lang.Throwable -> L4c
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L4c
            java.io.File r2 = r4.b     // Catch: java.lang.Throwable -> L4c
            java.io.File r2 = r2.getParentFile()     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L4c
            java.io.File r0 = r4.b     // Catch: java.lang.Throwable -> L4c
            boolean r0 = r0.renameTo(r1)     // Catch: java.lang.Throwable -> L4c
            if (r0 == 0) goto L6d
            r4.b = r1     // Catch: java.lang.Throwable -> L4c
            java.io.RandomAccessFile r0 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            java.io.File r1 = r4.b     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            java.lang.String r2 = "r"
            r0.<init>(r1, r2)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r4.c = r0     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            com.danikula.videocache.file.a r0 = r4.a     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            java.io.File r1 = r4.b     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            r0.a(r1)     // Catch: java.lang.Throwable -> L4c java.io.IOException -> L4e
            monitor-exit(r4)
            return
        L4c:
            r0 = move-exception
            goto L93
        L4e:
            r0 = move-exception
            com.danikula.videocache.ProxyCacheException r1 = new com.danikula.videocache.ProxyCacheException     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "Error opening "
            r2.append(r3)     // Catch: java.lang.Throwable -> L4c
            java.io.File r3 = r4.b     // Catch: java.lang.Throwable -> L4c
            r2.append(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = " as disc cache"
            r2.append(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> L4c
            r1.<init>(r2, r0)     // Catch: java.lang.Throwable -> L4c
            throw r1     // Catch: java.lang.Throwable -> L4c
        L6d:
            com.danikula.videocache.ProxyCacheException r0 = new com.danikula.videocache.ProxyCacheException     // Catch: java.lang.Throwable -> L4c
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4c
            r2.<init>()     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = "Error renaming file "
            r2.append(r3)     // Catch: java.lang.Throwable -> L4c
            java.io.File r3 = r4.b     // Catch: java.lang.Throwable -> L4c
            r2.append(r3)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r3 = " to "
            r2.append(r3)     // Catch: java.lang.Throwable -> L4c
            r2.append(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = " for completion!"
            r2.append(r1)     // Catch: java.lang.Throwable -> L4c
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L4c
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L4c
            throw r0     // Catch: java.lang.Throwable -> L4c
        L93:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L4c
            throw r0
    }

    @Override // com.danikula.videocache.d
    public synchronized boolean isCompleted() {
            r1 = this;
            monitor-enter(r1)
            java.io.File r0 = r1.b     // Catch: java.lang.Throwable -> Lb
            boolean r0 = r1.d(r0)     // Catch: java.lang.Throwable -> Lb
            r0 = r0 ^ 1
            monitor-exit(r1)
            return r0
        Lb:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r0
    }
}

package com.google.common.io;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
@com.google.common.annotations.Beta
@com.google.common.annotations.GwtIncompatible
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
public final class FileBackedOutputStream extends java.io.OutputStream {

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    private java.io.File file;
    private final int fileThreshold;
    private com.google.common.io.FileBackedOutputStream.MemoryOutput memory;
    private java.io.OutputStream out;
    private final boolean resetOnFinalize;
    private final com.google.common.io.ByteSource source;



    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class MemoryOutput extends java.io.ByteArrayOutputStream {
        private MemoryOutput() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ MemoryOutput(com.google.common.io.FileBackedOutputStream.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        byte[] getBuffer() {
                r1 = this;
                byte[] r0 = r1.buf
                return r0
        }

        int getCount() {
                r1 = this;
                int r0 = r1.count
                return r0
        }
    }

    public FileBackedOutputStream(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public FileBackedOutputStream(int r2, boolean r3) {
            r1 = this;
            r1.<init>()
            r1.fileThreshold = r2
            r1.resetOnFinalize = r3
            com.google.common.io.FileBackedOutputStream$MemoryOutput r2 = new com.google.common.io.FileBackedOutputStream$MemoryOutput
            r0 = 0
            r2.<init>(r0)
            r1.memory = r2
            r1.out = r2
            if (r3 == 0) goto L1b
            com.google.common.io.FileBackedOutputStream$1 r2 = new com.google.common.io.FileBackedOutputStream$1
            r2.<init>(r1)
            r1.source = r2
            return
        L1b:
            com.google.common.io.FileBackedOutputStream$2 r2 = new com.google.common.io.FileBackedOutputStream$2
            r2.<init>(r1)
            r1.source = r2
            return
    }

    static /* synthetic */ java.io.InputStream access$100(com.google.common.io.FileBackedOutputStream r0) throws java.io.IOException {
            java.io.InputStream r0 = r0.openInputStream()
            return r0
    }

    private synchronized java.io.InputStream openInputStream() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            java.io.File r0 = r4.file     // Catch: java.lang.Throwable -> Le
            if (r0 == 0) goto L10
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Le
            java.io.File r1 = r4.file     // Catch: java.lang.Throwable -> Le
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r4)
            return r0
        Le:
            r0 = move-exception
            goto L24
        L10:
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream     // Catch: java.lang.Throwable -> Le
            com.google.common.io.FileBackedOutputStream$MemoryOutput r1 = r4.memory     // Catch: java.lang.Throwable -> Le
            byte[] r1 = r1.getBuffer()     // Catch: java.lang.Throwable -> Le
            com.google.common.io.FileBackedOutputStream$MemoryOutput r2 = r4.memory     // Catch: java.lang.Throwable -> Le
            int r2 = r2.getCount()     // Catch: java.lang.Throwable -> Le
            r3 = 0
            r0.<init>(r1, r3, r2)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r4)
            return r0
        L24:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Le
            throw r0
    }

    private void update(int r6) throws java.io.IOException {
            r5 = this;
            java.io.File r0 = r5.file
            if (r0 != 0) goto L3b
            com.google.common.io.FileBackedOutputStream$MemoryOutput r0 = r5.memory
            int r0 = r0.getCount()
            int r0 = r0 + r6
            int r6 = r5.fileThreshold
            if (r0 <= r6) goto L3b
            java.lang.String r6 = "FileBackedOutputStream"
            r0 = 0
            java.io.File r6 = java.io.File.createTempFile(r6, r0)
            boolean r1 = r5.resetOnFinalize
            if (r1 == 0) goto L1d
            r6.deleteOnExit()
        L1d:
            java.io.FileOutputStream r1 = new java.io.FileOutputStream
            r1.<init>(r6)
            com.google.common.io.FileBackedOutputStream$MemoryOutput r2 = r5.memory
            byte[] r2 = r2.getBuffer()
            com.google.common.io.FileBackedOutputStream$MemoryOutput r3 = r5.memory
            int r3 = r3.getCount()
            r4 = 0
            r1.write(r2, r4, r3)
            r1.flush()
            r5.out = r1
            r5.file = r6
            r5.memory = r0
        L3b:
            return
    }

    public com.google.common.io.ByteSource asByteSource() {
            r1 = this;
            com.google.common.io.ByteSource r0 = r1.source
            return r0
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.OutputStream r0 = r1.out     // Catch: java.lang.Throwable -> L8
            r0.close()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public synchronized void flush() throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            java.io.OutputStream r0 = r1.out     // Catch: java.lang.Throwable -> L8
            r0.flush()     // Catch: java.lang.Throwable -> L8
            monitor-exit(r1)
            return
        L8:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L8
            throw r0
    }

    @com.google.common.annotations.VisibleForTesting
    synchronized java.io.File getFile() {
            r1 = this;
            monitor-enter(r1)
            java.io.File r0 = r1.file     // Catch: java.lang.Throwable -> L5
            monitor-exit(r1)
            return r0
        L5:
            r0 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L5
            throw r0
    }

    public synchronized void reset() throws java.io.IOException {
            r4 = this;
            monitor-enter(r4)
            r0 = 0
            r4.close()     // Catch: java.lang.Throwable -> L40
            com.google.common.io.FileBackedOutputStream$MemoryOutput r1 = r4.memory     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L13
            com.google.common.io.FileBackedOutputStream$MemoryOutput r1 = new com.google.common.io.FileBackedOutputStream$MemoryOutput     // Catch: java.lang.Throwable -> L11
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L11
            r4.memory = r1     // Catch: java.lang.Throwable -> L11
            goto L16
        L11:
            r0 = move-exception
            goto L7a
        L13:
            r1.reset()     // Catch: java.lang.Throwable -> L11
        L16:
            com.google.common.io.FileBackedOutputStream$MemoryOutput r1 = r4.memory     // Catch: java.lang.Throwable -> L11
            r4.out = r1     // Catch: java.lang.Throwable -> L11
            java.io.File r1 = r4.file     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L3e
            r4.file = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r1.delete()     // Catch: java.lang.Throwable -> L11
            if (r0 == 0) goto L27
            goto L3e
        L27:
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r2.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = "Could not delete: "
            r2.append(r3)     // Catch: java.lang.Throwable -> L11
            r2.append(r1)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L11
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L11
            throw r0     // Catch: java.lang.Throwable -> L11
        L3e:
            monitor-exit(r4)
            return
        L40:
            r1 = move-exception
            com.google.common.io.FileBackedOutputStream$MemoryOutput r2 = r4.memory     // Catch: java.lang.Throwable -> L11
            if (r2 != 0) goto L4d
            com.google.common.io.FileBackedOutputStream$MemoryOutput r2 = new com.google.common.io.FileBackedOutputStream$MemoryOutput     // Catch: java.lang.Throwable -> L11
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L11
            r4.memory = r2     // Catch: java.lang.Throwable -> L11
            goto L52
        L4d:
            com.google.common.io.FileBackedOutputStream$MemoryOutput r2 = r4.memory     // Catch: java.lang.Throwable -> L11
            r2.reset()     // Catch: java.lang.Throwable -> L11
        L52:
            com.google.common.io.FileBackedOutputStream$MemoryOutput r2 = r4.memory     // Catch: java.lang.Throwable -> L11
            r4.out = r2     // Catch: java.lang.Throwable -> L11
            java.io.File r2 = r4.file     // Catch: java.lang.Throwable -> L11
            if (r2 == 0) goto L79
            r4.file = r0     // Catch: java.lang.Throwable -> L11
            boolean r0 = r2.delete()     // Catch: java.lang.Throwable -> L11
            if (r0 != 0) goto L79
            java.io.IOException r0 = new java.io.IOException     // Catch: java.lang.Throwable -> L11
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            java.lang.String r3 = "Could not delete: "
            r1.append(r3)     // Catch: java.lang.Throwable -> L11
            r1.append(r2)     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L11
            throw r0     // Catch: java.lang.Throwable -> L11
        L79:
            throw r1     // Catch: java.lang.Throwable -> L11
        L7a:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> L11
            throw r0
    }

    @Override // java.io.OutputStream
    public synchronized void write(int r2) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            r1.update(r0)     // Catch: java.lang.Throwable -> Lc
            java.io.OutputStream r0 = r1.out     // Catch: java.lang.Throwable -> Lc
            r0.write(r2)     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r1)
            return
        Lc:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] r3) throws java.io.IOException {
            r2 = this;
            monitor-enter(r2)
            int r0 = r3.length     // Catch: java.lang.Throwable -> L8
            r1 = 0
            r2.write(r3, r1, r0)     // Catch: java.lang.Throwable -> L8
            monitor-exit(r2)
            return
        L8:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L8
            throw r3
    }

    @Override // java.io.OutputStream
    public synchronized void write(byte[] r2, int r3, int r4) throws java.io.IOException {
            r1 = this;
            monitor-enter(r1)
            r1.update(r4)     // Catch: java.lang.Throwable -> Lb
            java.io.OutputStream r0 = r1.out     // Catch: java.lang.Throwable -> Lb
            r0.write(r2, r3, r4)     // Catch: java.lang.Throwable -> Lb
            monitor-exit(r1)
            return
        Lb:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb
            throw r2
    }
}

package com.danikula.videocache.file;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_7_sz8008092.dex */
class d {
    private static final org.slf4j.c a = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static /* synthetic */ class a {
        public a() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class b implements java.util.Comparator<java.io.File> {
        private b() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ b(com.danikula.videocache.file.d.a r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private int b(long r2, long r4) {
                r1 = this;
                int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                if (r0 >= 0) goto L6
                r2 = -1
                return r2
            L6:
                if (r0 != 0) goto La
                r2 = 0
                return r2
            La:
                r2 = 1
                return r2
        }

        public int a(java.io.File r3, java.io.File r4) {
                r2 = this;
                long r0 = r3.lastModified()
                long r3 = r4.lastModified()
                int r3 = r2.b(r0, r3)
                return r3
        }

        @Override // java.util.Comparator
        public /* bridge */ /* synthetic */ int compare(java.io.File r1, java.io.File r2) {
                r0 = this;
                java.io.File r1 = (java.io.File) r1
                java.io.File r2 = (java.io.File) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    static {
            java.lang.String r0 = "Files"
            org.slf4j.c r0 = org.slf4j.d.j(r0)
            com.danikula.videocache.file.d.a = r0
            return
    }

    d() {
            r0 = this;
            r0.<init>()
            return
    }

    static java.util.List<java.io.File> a(java.io.File r2) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.io.File[] r2 = r2.listFiles()
            if (r2 == 0) goto L19
            java.util.List r2 = java.util.Arrays.asList(r2)
            com.danikula.videocache.file.d$b r0 = new com.danikula.videocache.file.d$b
            r1 = 0
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            return r2
        L19:
            return r0
    }

    static void b(java.io.File r3) throws java.io.IOException {
            boolean r0 = r3.exists()
            if (r0 == 0) goto L29
            boolean r0 = r3.isDirectory()
            if (r0 == 0) goto Ld
            goto L2f
        Ld:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "File "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = " is not directory!"
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
        L29:
            boolean r0 = r3.mkdirs()
            if (r0 == 0) goto L30
        L2f:
            return
        L30:
            java.io.IOException r0 = new java.io.IOException
            java.lang.String r3 = r3.getAbsolutePath()
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r2 = 0
            r1[r2] = r3
            java.lang.String r3 = "Directory %s can't be created"
            java.lang.String r3 = java.lang.String.format(r3, r1)
            r0.<init>(r3)
            throw r0
    }

    static void c(java.io.File r5) throws java.io.IOException {
            long r0 = r5.length()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            d(r5)
            return
        Le:
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile
            java.lang.String r3 = "rwd"
            r2.<init>(r5, r3)
            r3 = 1
            long r0 = r0 - r3
            r2.seek(r0)
            byte r5 = r2.readByte()
            r2.seek(r0)
            r2.write(r5)
            r2.close()
            return
    }

    private static void d(java.io.File r3) throws java.io.IOException {
            boolean r0 = r3.delete()
            if (r0 == 0) goto Ld
            boolean r0 = r3.createNewFile()
            if (r0 == 0) goto Ld
            return
        Ld:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error recreate zero-size file "
            r1.append(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r0.<init>(r3)
            throw r0
    }

    static void e(java.io.File r5) throws java.io.IOException {
            boolean r0 = r5.exists()
            if (r0 == 0) goto L2f
            long r0 = java.lang.System.currentTimeMillis()
            boolean r2 = r5.setLastModified(r0)
            if (r2 != 0) goto L2f
            c(r5)
            long r2 = r5.lastModified()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 >= 0) goto L2f
            org.slf4j.c r0 = com.danikula.videocache.file.d.a
            java.util.Date r1 = new java.util.Date
            long r2 = r5.lastModified()
            r1.<init>(r2)
            java.lang.String r5 = r5.getAbsolutePath()
            java.lang.String r2 = "Last modified date {} is not set for file {}"
            r0.warn(r2, r1, r5)
        L2f:
            return
    }
}

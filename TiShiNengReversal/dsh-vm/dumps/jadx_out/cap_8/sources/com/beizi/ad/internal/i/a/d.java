package com.beizi.ad.internal.i.a;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Volumes/前任肥胖/下载/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_8_sz9482380.dex */
class d {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.beizi.ad.internal.i.a.d$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class a implements java.util.Comparator<java.io.File> {
        private a() {
                r0 = this;
                r0.<init>()
                return
        }

        /* synthetic */ a(com.beizi.ad.internal.i.a.d.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        private int a(long r2, long r4) {
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
                int r3 = r2.a(r0, r3)
                return r3
        }

        @Override // java.util.Comparator
        public /* synthetic */ int compare(java.io.File r1, java.io.File r2) {
                r0 = this;
                java.io.File r1 = (java.io.File) r1
                java.io.File r2 = (java.io.File) r2
                int r1 = r0.a(r1, r2)
                return r1
        }
    }

    public d() {
            r1 = this;
            r1.<init>()
            return
    }

    static void a(java.io.File r3) throws java.io.IOException {
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

    static java.util.List<java.io.File> b(java.io.File r2) {
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            java.io.File[] r2 = r2.listFiles()
            if (r2 == 0) goto L19
            java.util.List r2 = java.util.Arrays.asList(r2)
            com.beizi.ad.internal.i.a.d$a r0 = new com.beizi.ad.internal.i.a.d$a
            r1 = 0
            r0.<init>(r1)
            java.util.Collections.sort(r2, r0)
            return r2
        L19:
            return r0
    }

    static void c(java.io.File r5) throws java.io.IOException {
            boolean r0 = r5.exists()
            if (r0 == 0) goto L33
            long r0 = java.lang.System.currentTimeMillis()
            boolean r2 = r5.setLastModified(r0)
            if (r2 != 0) goto L33
            d(r5)
            long r2 = r5.lastModified()
            int r4 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r4 < 0) goto L1c
            goto L33
        L1c:
            java.io.IOException r0 = new java.io.IOException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error set last modified date to "
            r1.append(r2)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L33:
            return
    }

    static void d(java.io.File r5) throws java.io.IOException {
            long r0 = r5.length()
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto Le
            e(r5)
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

    private static void e(java.io.File r3) throws java.io.IOException {
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
}

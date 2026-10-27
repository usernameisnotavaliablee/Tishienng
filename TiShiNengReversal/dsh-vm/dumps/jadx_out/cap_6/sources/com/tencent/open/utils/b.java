package com.tencent.open.utils;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public final class b {
    private static final com.tencent.open.utils.n a = null;
    private static final com.tencent.open.utils.o b = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.tencent.open.utils.b$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class a {
        java.util.Properties a;
        byte[] b;

        private a() {
                r1 = this;
                r1.<init>()
                java.util.Properties r0 = new java.util.Properties
                r0.<init>()
                r1.a = r0
                return
        }

        /* synthetic */ a(com.tencent.open.utils.b.AnonymousClass1 r1) {
                r0 = this;
                r0.<init>()
                return
        }

        void a(byte[] r8) throws java.io.IOException {
                r7 = this;
                if (r8 != 0) goto L3
                goto L5a
            L3:
                java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r8)
                com.tencent.open.utils.o r1 = com.tencent.open.utils.b.a()
                byte[] r1 = r1.a()
                int r1 = r1.length
                byte[] r2 = new byte[r1]
                r0.get(r2)
                com.tencent.open.utils.o r3 = com.tencent.open.utils.b.a()
                com.tencent.open.utils.o r4 = new com.tencent.open.utils.o
                r4.<init>(r2)
                boolean r2 = r3.equals(r4)
                if (r2 == 0) goto L5b
                int r2 = r8.length
                int r2 = r2 - r1
                r3 = 2
                if (r2 > r3) goto L2a
                goto L5a
            L2a:
                byte[] r2 = new byte[r3]
                r0.get(r2)
                com.tencent.open.utils.o r4 = new com.tencent.open.utils.o
                r4.<init>(r2)
                int r2 = r4.b()
                int r4 = r8.length
                int r4 = r4 - r1
                int r4 = r4 - r3
                if (r4 >= r2) goto L3e
                goto L5a
            L3e:
                byte[] r4 = new byte[r2]
                r0.get(r4)
                java.util.Properties r5 = r7.a
                java.io.ByteArrayInputStream r6 = new java.io.ByteArrayInputStream
                r6.<init>(r4)
                r5.load(r6)
                int r8 = r8.length
                int r8 = r8 - r1
                int r8 = r8 - r2
                int r8 = r8 - r3
                if (r8 <= 0) goto L5a
                byte[] r8 = new byte[r8]
                r7.b = r8
                r0.get(r8)
            L5a:
                return
            L5b:
                java.net.ProtocolException r0 = new java.net.ProtocolException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "unknow protocl ["
                r1.append(r2)
                java.lang.String r8 = java.util.Arrays.toString(r8)
                r1.append(r8)
                java.lang.String r8 = "]"
                r1.append(r8)
                java.lang.String r8 = r1.toString()
                r0.<init>(r8)
                throw r0
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "ApkExternalInfo [p="
                r0.append(r1)
                java.util.Properties r1 = r2.a
                r0.append(r1)
                java.lang.String r1 = ", otherData="
                r0.append(r1)
                byte[] r1 = r2.b
                java.lang.String r1 = java.util.Arrays.toString(r1)
                r0.append(r1)
                java.lang.String r1 = "]"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            com.tencent.open.utils.n r0 = new com.tencent.open.utils.n
            r1 = 101010256(0x6054b50, double:4.99056974E-316)
            r0.<init>(r1)
            com.tencent.open.utils.b.a = r0
            com.tencent.open.utils.o r0 = new com.tencent.open.utils.o
            r1 = 38651(0x96fb, float:5.4162E-41)
            r0.<init>(r1)
            com.tencent.open.utils.b.b = r0
            return
    }

    public b() {
            r1 = this;
            r1.<init>()
            return
    }

    static /* synthetic */ com.tencent.open.utils.o a() {
            com.tencent.open.utils.o r0 = com.tencent.open.utils.b.b
            return r0
    }

    public static java.lang.String a(java.io.File r1) throws java.io.IOException {
            java.lang.String r0 = "channelNo"
            java.lang.String r1 = a(r1, r0)
            return r1
    }

    public static java.lang.String a(java.io.File r3, java.lang.String r4) throws java.io.IOException {
            r0 = 0
            java.io.RandomAccessFile r1 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> L27
            java.lang.String r2 = "r"
            r1.<init>(r3, r2)     // Catch: java.lang.Throwable -> L27
            byte[] r3 = a(r1)     // Catch: java.lang.Throwable -> L24
            if (r3 != 0) goto L12
            r1.close()
            return r0
        L12:
            com.tencent.open.utils.b$a r2 = new com.tencent.open.utils.b$a     // Catch: java.lang.Throwable -> L24
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L24
            r2.a(r3)     // Catch: java.lang.Throwable -> L24
            java.util.Properties r3 = r2.a     // Catch: java.lang.Throwable -> L24
            java.lang.String r3 = r3.getProperty(r4)     // Catch: java.lang.Throwable -> L24
            r1.close()
            return r3
        L24:
            r3 = move-exception
            r0 = r1
            goto L28
        L27:
            r3 = move-exception
        L28:
            if (r0 == 0) goto L2d
            r0.close()
        L2d:
            throw r3
    }

    private static byte[] a(java.io.RandomAccessFile r6) throws java.io.IOException {
            long r0 = r6.length()
            r2 = 22
            long r0 = r0 - r2
            r6.seek(r0)
            com.tencent.open.utils.n r2 = com.tencent.open.utils.b.a
            byte[] r2 = r2.a()
            int r3 = r6.read()
        L14:
            r4 = -1
            if (r3 == r4) goto L60
            r4 = 0
            r4 = r2[r4]
            if (r3 != r4) goto L55
            int r3 = r6.read()
            r4 = 1
            r4 = r2[r4]
            if (r3 != r4) goto L55
            int r3 = r6.read()
            r4 = 2
            r5 = r2[r4]
            if (r3 != r5) goto L55
            int r3 = r6.read()
            r5 = 3
            r5 = r2[r5]
            if (r3 != r5) goto L55
            r2 = 20
            long r0 = r0 + r2
            r6.seek(r0)
            byte[] r0 = new byte[r4]
            r6.readFully(r0)
            com.tencent.open.utils.o r1 = new com.tencent.open.utils.o
            r1.<init>(r0)
            int r0 = r1.b()
            if (r0 != 0) goto L4f
            r6 = 0
            return r6
        L4f:
            byte[] r0 = new byte[r0]
            r6.read(r0)
            return r0
        L55:
            r3 = 1
            long r0 = r0 - r3
            r6.seek(r0)
            int r3 = r6.read()
            goto L14
        L60:
            java.util.zip.ZipException r6 = new java.util.zip.ZipException
            java.lang.String r0 = "archive is not a ZIP archive"
            r6.<init>(r0)
            throw r6
    }
}

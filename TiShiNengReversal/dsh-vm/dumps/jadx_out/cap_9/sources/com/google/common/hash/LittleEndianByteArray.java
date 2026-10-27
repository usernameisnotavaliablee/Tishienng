package com.google.common.hash;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_9_sz8866584.dex */
final class LittleEndianByteArray {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final com.google.common.hash.LittleEndianByteArray.LittleEndianBytes byteArray = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    /* renamed from: com.google.common.hash.LittleEndianByteArray$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        public AnonymousClass1() {
                r1 = this;
                r1.<init>()
                return
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum JavaLittleEndianBytes extends java.lang.Enum<com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes> implements com.google.common.hash.LittleEndianByteArray.LittleEndianBytes {
        private static final /* synthetic */ com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes[] $VALUES = null;
        public static final com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes INSTANCE = null;


        static {
                com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes$1 r0 = new com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes$1
                java.lang.String r1 = "INSTANCE"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.INSTANCE = r0
                r1 = 1
                com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes[] r1 = new com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes[r1]
                r1[r2] = r0
                com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.$VALUES = r1
                return
        }

        JavaLittleEndianBytes(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ JavaLittleEndianBytes(java.lang.String r1, int r2, com.google.common.hash.LittleEndianByteArray.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes> r0 = com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes r1 = (com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes) r1
                return r1
        }

        public static com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes[] values() {
                com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes[] r0 = com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes[] r0 = (com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes[]) r0
                return r0
        }
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private interface LittleEndianBytes {
        long getLongLittleEndian(byte[] r1, int r2);

        void putLongLittleEndian(byte[] r1, int r2, long r3);
    }

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private enum UnsafeByteArray extends java.lang.Enum<com.google.common.hash.LittleEndianByteArray.UnsafeByteArray> implements com.google.common.hash.LittleEndianByteArray.LittleEndianBytes {
        private static final /* synthetic */ com.google.common.hash.LittleEndianByteArray.UnsafeByteArray[] $VALUES = null;
        private static final int BYTE_ARRAY_BASE_OFFSET = 0;
        public static final com.google.common.hash.LittleEndianByteArray.UnsafeByteArray UNSAFE_BIG_ENDIAN = null;
        public static final com.google.common.hash.LittleEndianByteArray.UnsafeByteArray UNSAFE_LITTLE_ENDIAN = null;
        private static final sun.misc.Unsafe theUnsafe = null;




        static {
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$1 r0 = new com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$1
                java.lang.String r1 = "UNSAFE_LITTLE_ENDIAN"
                r2 = 0
                r0.<init>(r1, r2)
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_LITTLE_ENDIAN = r0
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$2 r1 = new com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$2
                java.lang.String r3 = "UNSAFE_BIG_ENDIAN"
                r4 = 1
                r1.<init>(r3, r4)
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_BIG_ENDIAN = r1
                r3 = 2
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray[] r3 = new com.google.common.hash.LittleEndianByteArray.UnsafeByteArray[r3]
                r3[r2] = r0
                r3[r4] = r1
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.$VALUES = r3
                sun.misc.Unsafe r0 = getUnsafe()
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.theUnsafe = r0
                java.lang.Class<byte[]> r1 = byte[].class
                int r2 = r0.arrayBaseOffset(r1)
                com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET = r2
                int r0 = r0.arrayIndexScale(r1)
                if (r0 != r4) goto L32
                return
            L32:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
        }

        UnsafeByteArray(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        /* synthetic */ UnsafeByteArray(java.lang.String r1, int r2, com.google.common.hash.LittleEndianByteArray.AnonymousClass1 r3) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        static /* synthetic */ int access$100() {
                int r0 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.BYTE_ARRAY_BASE_OFFSET
                return r0
        }

        static /* synthetic */ sun.misc.Unsafe access$200() {
                sun.misc.Unsafe r0 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.theUnsafe
                return r0
        }

        private static sun.misc.Unsafe getUnsafe() {
                sun.misc.Unsafe r0 = sun.misc.Unsafe.getUnsafe()     // Catch: java.lang.SecurityException -> L5
                return r0
            L5:
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$3 r0 = new com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$3     // Catch: java.security.PrivilegedActionException -> L11
                r0.<init>()     // Catch: java.security.PrivilegedActionException -> L11
                java.lang.Object r0 = java.security.AccessController.doPrivileged(r0)     // Catch: java.security.PrivilegedActionException -> L11
                sun.misc.Unsafe r0 = (sun.misc.Unsafe) r0     // Catch: java.security.PrivilegedActionException -> L11
                return r0
            L11:
                r0 = move-exception
                java.lang.RuntimeException r1 = new java.lang.RuntimeException
                java.lang.String r2 = "Could not initialize intrinsics"
                java.lang.Throwable r0 = r0.getCause()
                r1.<init>(r2, r0)
                throw r1
        }

        public static com.google.common.hash.LittleEndianByteArray.UnsafeByteArray valueOf(java.lang.String r1) {
                java.lang.Class<com.google.common.hash.LittleEndianByteArray$UnsafeByteArray> r0 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray r1 = (com.google.common.hash.LittleEndianByteArray.UnsafeByteArray) r1
                return r1
        }

        public static com.google.common.hash.LittleEndianByteArray.UnsafeByteArray[] values() {
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray[] r0 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.$VALUES
                java.lang.Object r0 = r0.clone()
                com.google.common.hash.LittleEndianByteArray$UnsafeByteArray[] r0 = (com.google.common.hash.LittleEndianByteArray.UnsafeByteArray[]) r0
                return r0
        }
    }

    static {
            com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes r0 = com.google.common.hash.LittleEndianByteArray.JavaLittleEndianBytes.INSTANCE
            java.lang.String r1 = "os.arch"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> L21
            java.lang.String r2 = "amd64"
            boolean r1 = r2.equals(r1)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L21
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()     // Catch: java.lang.Throwable -> L21
            java.nio.ByteOrder r2 = java.nio.ByteOrder.LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L21
            boolean r1 = r1.equals(r2)     // Catch: java.lang.Throwable -> L21
            if (r1 == 0) goto L1f
            com.google.common.hash.LittleEndianByteArray$UnsafeByteArray r0 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_LITTLE_ENDIAN     // Catch: java.lang.Throwable -> L21
            goto L21
        L1f:
            com.google.common.hash.LittleEndianByteArray$UnsafeByteArray r0 = com.google.common.hash.LittleEndianByteArray.UnsafeByteArray.UNSAFE_BIG_ENDIAN     // Catch: java.lang.Throwable -> L21
        L21:
            com.google.common.hash.LittleEndianByteArray.byteArray = r0
            return
    }

    private LittleEndianByteArray() {
            r0 = this;
            r0.<init>()
            return
    }

    static int load32(byte[] r2, int r3) {
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r1 = r3 + 1
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            int r1 = r3 + 2
            r1 = r2[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 16
            r0 = r0 | r1
            int r3 = r3 + 3
            r2 = r2[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 24
            r2 = r2 | r0
            return r2
    }

    static long load64(byte[] r1, int r2) {
            com.google.common.hash.LittleEndianByteArray$LittleEndianBytes r0 = com.google.common.hash.LittleEndianByteArray.byteArray
            long r1 = r0.getLongLittleEndian(r1, r2)
            return r1
    }

    static long load64Safely(byte[] r7, int r8, int r9) {
            r0 = 8
            int r9 = java.lang.Math.min(r9, r0)
            r0 = 0
            r2 = 0
        L9:
            if (r2 >= r9) goto L1a
            int r3 = r8 + r2
            r3 = r7[r3]
            long r3 = (long) r3
            r5 = 255(0xff, double:1.26E-321)
            long r3 = r3 & r5
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 | r3
            int r2 = r2 + 1
            goto L9
        L1a:
            return r0
    }

    static void store64(byte[] r1, int r2, long r3) {
            com.google.common.hash.LittleEndianByteArray$LittleEndianBytes r0 = com.google.common.hash.LittleEndianByteArray.byteArray
            r0.putLongLittleEndian(r1, r2, r3)
            return
    }

    static boolean usingUnsafe() {
            com.google.common.hash.LittleEndianByteArray$LittleEndianBytes r0 = com.google.common.hash.LittleEndianByteArray.byteArray
            boolean r0 = r0 instanceof com.google.common.hash.LittleEndianByteArray.UnsafeByteArray
            return r0
    }
}

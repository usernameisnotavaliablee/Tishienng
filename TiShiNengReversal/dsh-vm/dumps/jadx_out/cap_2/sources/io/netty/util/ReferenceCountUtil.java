package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class ReferenceCountUtil {
    private static final io.netty.util.internal.logging.InternalLogger logger = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static final class ReleasingTask implements java.lang.Runnable {
        private final int decrement;
        private final io.netty.util.ReferenceCounted obj;

        ReleasingTask(io.netty.util.ReferenceCounted r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.obj = r1
                r0.decrement = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                io.netty.util.ReferenceCounted r0 = r4.obj     // Catch: java.lang.Exception -> L14
                int r1 = r4.decrement     // Catch: java.lang.Exception -> L14
                boolean r0 = r0.release(r1)     // Catch: java.lang.Exception -> L14
                if (r0 != 0) goto L16
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.ReferenceCountUtil.access$000()     // Catch: java.lang.Exception -> L14
                java.lang.String r1 = "Non-zero refCnt: {}"
                r0.warn(r1, r4)     // Catch: java.lang.Exception -> L14
                return
            L14:
                r0 = move-exception
                goto L20
            L16:
                io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.ReferenceCountUtil.access$000()     // Catch: java.lang.Exception -> L14
                java.lang.String r1 = "Released: {}"
                r0.debug(r1, r4)     // Catch: java.lang.Exception -> L14
                return
            L20:
                io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.ReferenceCountUtil.access$000()
                java.lang.String r2 = "Failed to release an object: {}"
                io.netty.util.ReferenceCounted r3 = r4.obj
                r1.warn(r2, r3, r0)
                return
        }

        public java.lang.String toString() {
                r2 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                io.netty.util.ReferenceCounted r1 = r2.obj
                java.lang.String r1 = io.netty.util.internal.StringUtil.simpleClassName(r1)
                r0.append(r1)
                java.lang.String r1 = ".release("
                r0.append(r1)
                int r1 = r2.decrement
                r0.append(r1)
                java.lang.String r1 = ") refCnt: "
                r0.append(r1)
                io.netty.util.ReferenceCounted r1 = r2.obj
                int r1 = r1.refCnt()
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                return r0
        }
    }

    static {
            java.lang.Class<io.netty.util.ReferenceCountUtil> r0 = io.netty.util.ReferenceCountUtil.class
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.internal.logging.InternalLoggerFactory.getInstance(r0)
            io.netty.util.ReferenceCountUtil.logger = r1
            java.lang.String r1 = "touch"
            java.lang.String[] r1 = new java.lang.String[]{r1}
            io.netty.util.ResourceLeakDetector.addExclusions(r0, r1)
            return
    }

    private ReferenceCountUtil() {
            r0 = this;
            r0.<init>()
            return
    }

    static /* synthetic */ io.netty.util.internal.logging.InternalLogger access$000() {
            io.netty.util.internal.logging.InternalLogger r0 = io.netty.util.ReferenceCountUtil.logger
            return r0
    }

    public static int refCnt(java.lang.Object r1) {
            boolean r0 = r1 instanceof io.netty.util.ReferenceCounted
            if (r0 == 0) goto Lb
            io.netty.util.ReferenceCounted r1 = (io.netty.util.ReferenceCounted) r1
            int r1 = r1.refCnt()
            return r1
        Lb:
            r1 = -1
            return r1
    }

    public static boolean release(java.lang.Object r1) {
            boolean r0 = r1 instanceof io.netty.util.ReferenceCounted
            if (r0 == 0) goto Lb
            io.netty.util.ReferenceCounted r1 = (io.netty.util.ReferenceCounted) r1
            boolean r1 = r1.release()
            return r1
        Lb:
            r1 = 0
            return r1
    }

    public static boolean release(java.lang.Object r1, int r2) {
            boolean r0 = r1 instanceof io.netty.util.ReferenceCounted
            if (r0 == 0) goto Lb
            io.netty.util.ReferenceCounted r1 = (io.netty.util.ReferenceCounted) r1
            boolean r1 = r1.release(r2)
            return r1
        Lb:
            r1 = 0
            return r1
    }

    @java.lang.Deprecated
    public static <T> T releaseLater(T r1) {
            r0 = 1
            java.lang.Object r1 = releaseLater(r1, r0)
            return r1
    }

    @java.lang.Deprecated
    public static <T> T releaseLater(T r3, int r4) {
            boolean r0 = r3 instanceof io.netty.util.ReferenceCounted
            if (r0 == 0) goto L13
            java.lang.Thread r0 = java.lang.Thread.currentThread()
            io.netty.util.ReferenceCountUtil$ReleasingTask r1 = new io.netty.util.ReferenceCountUtil$ReleasingTask
            r2 = r3
            io.netty.util.ReferenceCounted r2 = (io.netty.util.ReferenceCounted) r2
            r1.<init>(r2, r4)
            io.netty.util.ThreadDeathWatcher.watch(r0, r1)
        L13:
            return r3
    }

    public static <T> T retain(T r1) {
            boolean r0 = r1 instanceof io.netty.util.ReferenceCounted
            if (r0 == 0) goto La
            io.netty.util.ReferenceCounted r1 = (io.netty.util.ReferenceCounted) r1
            io.netty.util.ReferenceCounted r1 = r1.retain()
        La:
            return r1
    }

    public static <T> T retain(T r1, int r2) {
            boolean r0 = r1 instanceof io.netty.util.ReferenceCounted
            if (r0 == 0) goto La
            io.netty.util.ReferenceCounted r1 = (io.netty.util.ReferenceCounted) r1
            io.netty.util.ReferenceCounted r1 = r1.retain(r2)
        La:
            return r1
    }

    public static void safeRelease(java.lang.Object r3) {
            release(r3)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.ReferenceCountUtil.logger
            java.lang.String r2 = "Failed to release a message: {}"
            r1.warn(r2, r3, r0)
            return
    }

    public static void safeRelease(java.lang.Object r4, int r5) {
            release(r4, r5)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r0 = move-exception
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.ReferenceCountUtil.logger
            boolean r1 = r1.isWarnEnabled()
            if (r1 == 0) goto L24
            io.netty.util.internal.logging.InternalLogger r1 = io.netty.util.ReferenceCountUtil.logger
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r2 = 3
            java.lang.Object[] r2 = new java.lang.Object[r2]
            r3 = 0
            r2[r3] = r4
            r4 = 1
            r2[r4] = r5
            r4 = 2
            r2[r4] = r0
            java.lang.String r4 = "Failed to release a message: {} (decrement: {})"
            r1.warn(r4, r2)
        L24:
            return
    }

    public static <T> T touch(T r1) {
            boolean r0 = r1 instanceof io.netty.util.ReferenceCounted
            if (r0 == 0) goto La
            io.netty.util.ReferenceCounted r1 = (io.netty.util.ReferenceCounted) r1
            io.netty.util.ReferenceCounted r1 = r1.touch()
        La:
            return r1
    }

    public static <T> T touch(T r1, java.lang.Object r2) {
            boolean r0 = r1 instanceof io.netty.util.ReferenceCounted
            if (r0 == 0) goto La
            io.netty.util.ReferenceCounted r1 = (io.netty.util.ReferenceCounted) r1
            io.netty.util.ReferenceCounted r1 = r1.touch(r2)
        La:
            return r1
    }
}

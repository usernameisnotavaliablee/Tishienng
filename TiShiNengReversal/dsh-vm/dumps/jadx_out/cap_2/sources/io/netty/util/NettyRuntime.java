package io.netty.util;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_2_sz9469608.dex */
public final class NettyRuntime {
    private static final io.netty.util.NettyRuntime.AvailableProcessorsHolder holder = null;

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    static class AvailableProcessorsHolder {
        private int availableProcessors;

        AvailableProcessorsHolder() {
                r0 = this;
                r0.<init>()
                return
        }

        @io.netty.util.SuppressForbidden(reason = "to obtain default number of available processors")
        synchronized int availableProcessors() {
                r2 = this;
                monitor-enter(r2)
                int r0 = r2.availableProcessors     // Catch: java.lang.Throwable -> L17
                if (r0 != 0) goto L19
                java.lang.String r0 = "io.netty.availableProcessors"
                java.lang.Runtime r1 = java.lang.Runtime.getRuntime()     // Catch: java.lang.Throwable -> L17
                int r1 = r1.availableProcessors()     // Catch: java.lang.Throwable -> L17
                int r0 = io.netty.util.internal.SystemPropertyUtil.getInt(r0, r1)     // Catch: java.lang.Throwable -> L17
                r2.setAvailableProcessors(r0)     // Catch: java.lang.Throwable -> L17
                goto L19
            L17:
                r0 = move-exception
                goto L1d
            L19:
                int r0 = r2.availableProcessors     // Catch: java.lang.Throwable -> L17
                monitor-exit(r2)
                return r0
            L1d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L17
                throw r0
        }

        synchronized void setAvailableProcessors(int r6) {
                r5 = this;
                monitor-enter(r5)
                java.lang.String r0 = "availableProcessors"
                io.netty.util.internal.ObjectUtil.checkPositive(r6, r0)     // Catch: java.lang.Throwable -> Le
                int r0 = r5.availableProcessors     // Catch: java.lang.Throwable -> Le
                if (r0 != 0) goto L10
                r5.availableProcessors = r6     // Catch: java.lang.Throwable -> Le
                monitor-exit(r5)
                return
            Le:
                r6 = move-exception
                goto L2f
            L10:
                java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> Le
                java.lang.String r2 = "availableProcessors is already set to [%d], rejecting [%d]"
                java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.lang.Throwable -> Le
                java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> Le
                r3 = 2
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Le
                r4 = 0
                r3[r4] = r0     // Catch: java.lang.Throwable -> Le
                r0 = 1
                r3[r0] = r6     // Catch: java.lang.Throwable -> Le
                java.lang.String r6 = java.lang.String.format(r1, r2, r3)     // Catch: java.lang.Throwable -> Le
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le
                r0.<init>(r6)     // Catch: java.lang.Throwable -> Le
                throw r0     // Catch: java.lang.Throwable -> Le
            L2f:
                monitor-exit(r5)     // Catch: java.lang.Throwable -> Le
                throw r6
        }
    }

    static {
            io.netty.util.NettyRuntime$AvailableProcessorsHolder r0 = new io.netty.util.NettyRuntime$AvailableProcessorsHolder
            r0.<init>()
            io.netty.util.NettyRuntime.holder = r0
            return
    }

    private NettyRuntime() {
            r0 = this;
            r0.<init>()
            return
    }

    public static int availableProcessors() {
            io.netty.util.NettyRuntime$AvailableProcessorsHolder r0 = io.netty.util.NettyRuntime.holder
            int r0 = r0.availableProcessors()
            return r0
    }

    public static void setAvailableProcessors(int r1) {
            io.netty.util.NettyRuntime$AvailableProcessorsHolder r0 = io.netty.util.NettyRuntime.holder
            r0.setAvailableProcessors(r1)
            return
    }
}

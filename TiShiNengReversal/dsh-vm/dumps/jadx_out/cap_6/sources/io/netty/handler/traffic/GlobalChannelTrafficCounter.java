package io.netty.handler.traffic;

/* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
/* loaded from: /Users/mac/Desktop/tishineng.apk/dsh-vm/dumps/dexcap/dexcap/cap_6_sz7847784.dex */
public class GlobalChannelTrafficCounter extends io.netty.handler.traffic.TrafficCounter {

    /* compiled from: r8-map-id-3b6b465acd3fb077b48f32fd73cc7a49f5d820aadf5466934c3e8f230425ca5e */
    private static class MixedTrafficMonitoringTask implements java.lang.Runnable {
        private final io.netty.handler.traffic.TrafficCounter counter;
        private final io.netty.handler.traffic.GlobalChannelTrafficShapingHandler trafficShapingHandler1;

        MixedTrafficMonitoringTask(io.netty.handler.traffic.GlobalChannelTrafficShapingHandler r1, io.netty.handler.traffic.TrafficCounter r2) {
                r0 = this;
                r0.<init>()
                r0.trafficShapingHandler1 = r1
                r0.counter = r2
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r4 = this;
                io.netty.handler.traffic.TrafficCounter r0 = r4.counter
                boolean r0 = r0.monitorActive
                if (r0 != 0) goto L7
                return
            L7:
                long r0 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()
                io.netty.handler.traffic.TrafficCounter r2 = r4.counter
                r2.resetAccounting(r0)
                io.netty.handler.traffic.GlobalChannelTrafficShapingHandler r2 = r4.trafficShapingHandler1
                java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r2 = r2.channelQueues
                java.util.Collection r2 = r2.values()
                java.util.Iterator r2 = r2.iterator()
            L1c:
                boolean r3 = r2.hasNext()
                if (r3 == 0) goto L2e
                java.lang.Object r3 = r2.next()
                io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r3 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel) r3
                io.netty.handler.traffic.TrafficCounter r3 = r3.channelTrafficCounter
                r3.resetAccounting(r0)
                goto L1c
            L2e:
                io.netty.handler.traffic.GlobalChannelTrafficShapingHandler r0 = r4.trafficShapingHandler1
                io.netty.handler.traffic.TrafficCounter r1 = r4.counter
                r0.doAccounting(r1)
                return
        }
    }

    public GlobalChannelTrafficCounter(io.netty.handler.traffic.GlobalChannelTrafficShapingHandler r1, java.util.concurrent.ScheduledExecutorService r2, java.lang.String r3, long r4) {
            r0 = this;
            r0.<init>(r1, r2, r3, r4)
            if (r2 == 0) goto L6
            return
        L6:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "Executor must not be null"
            r1.<init>(r2)
            throw r1
    }

    @Override // io.netty.handler.traffic.TrafficCounter
    public void resetCumulativeTime() {
            r2 = this;
            io.netty.handler.traffic.AbstractTrafficShapingHandler r0 = r2.trafficShapingHandler
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler r0 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler) r0
            java.util.concurrent.ConcurrentMap<java.lang.Integer, io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel> r0 = r0.channelQueues
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        Le:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L20
            java.lang.Object r1 = r0.next()
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler$PerChannel r1 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler.PerChannel) r1
            io.netty.handler.traffic.TrafficCounter r1 = r1.channelTrafficCounter
            r1.resetCumulativeTime()
            goto Le
        L20:
            super.resetCumulativeTime()
            return
    }

    @Override // io.netty.handler.traffic.TrafficCounter
    public synchronized void start() {
            r8 = this;
            monitor-enter(r8)
            boolean r0 = r8.monitorActive     // Catch: java.lang.Throwable -> L37
            if (r0 == 0) goto L7
            monitor-exit(r8)
            return
        L7:
            java.util.concurrent.atomic.AtomicLong r0 = r8.lastTime     // Catch: java.lang.Throwable -> L37
            long r1 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()     // Catch: java.lang.Throwable -> L37
            r0.set(r1)     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.atomic.AtomicLong r0 = r8.checkInterval     // Catch: java.lang.Throwable -> L37
            long r5 = r0.get()     // Catch: java.lang.Throwable -> L37
            r0 = 0
            int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r2 <= 0) goto L39
            r0 = 1
            r8.monitorActive = r0     // Catch: java.lang.Throwable -> L37
            io.netty.handler.traffic.GlobalChannelTrafficCounter$MixedTrafficMonitoringTask r2 = new io.netty.handler.traffic.GlobalChannelTrafficCounter$MixedTrafficMonitoringTask     // Catch: java.lang.Throwable -> L37
            io.netty.handler.traffic.AbstractTrafficShapingHandler r0 = r8.trafficShapingHandler     // Catch: java.lang.Throwable -> L37
            io.netty.handler.traffic.GlobalChannelTrafficShapingHandler r0 = (io.netty.handler.traffic.GlobalChannelTrafficShapingHandler) r0     // Catch: java.lang.Throwable -> L37
            r2.<init>(r0, r8)     // Catch: java.lang.Throwable -> L37
            r8.monitor = r2     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.ScheduledExecutorService r1 = r8.executor     // Catch: java.lang.Throwable -> L37
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Throwable -> L37
            r3 = 0
            java.util.concurrent.ScheduledFuture r0 = r1.scheduleAtFixedRate(r2, r3, r5, r7)     // Catch: java.lang.Throwable -> L37
            r8.scheduledFuture = r0     // Catch: java.lang.Throwable -> L37
            goto L39
        L37:
            r0 = move-exception
            goto L3b
        L39:
            monitor-exit(r8)
            return
        L3b:
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L37
            throw r0
    }

    @Override // io.netty.handler.traffic.TrafficCounter
    public synchronized void stop() {
            r2 = this;
            monitor-enter(r2)
            boolean r0 = r2.monitorActive     // Catch: java.lang.Throwable -> L21
            if (r0 != 0) goto L7
            monitor-exit(r2)
            return
        L7:
            r0 = 0
            r2.monitorActive = r0     // Catch: java.lang.Throwable -> L21
            long r0 = io.netty.handler.traffic.TrafficCounter.milliSecondFromNano()     // Catch: java.lang.Throwable -> L21
            r2.resetAccounting(r0)     // Catch: java.lang.Throwable -> L21
            io.netty.handler.traffic.AbstractTrafficShapingHandler r0 = r2.trafficShapingHandler     // Catch: java.lang.Throwable -> L21
            r0.doAccounting(r2)     // Catch: java.lang.Throwable -> L21
            java.util.concurrent.ScheduledFuture<?> r0 = r2.scheduledFuture     // Catch: java.lang.Throwable -> L21
            if (r0 == 0) goto L23
            java.util.concurrent.ScheduledFuture<?> r0 = r2.scheduledFuture     // Catch: java.lang.Throwable -> L21
            r1 = 1
            r0.cancel(r1)     // Catch: java.lang.Throwable -> L21
            goto L23
        L21:
            r0 = move-exception
            goto L25
        L23:
            monitor-exit(r2)
            return
        L25:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L21
            throw r0
    }
}
